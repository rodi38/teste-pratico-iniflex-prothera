package com.prothera.teste;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class Principal {

    private static final DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final NumberFormat FORMATO_NUMERO = criarFormatoNumero();

    private static NumberFormat criarFormatoNumero() {
        NumberFormat formato = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
        formato.setMinimumFractionDigits(2);
        formato.setMaximumFractionDigits(2);
        return formato;
    }

    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operador"));
        funcionarios.add(new Funcionario("João", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38"), "Operador"));
        funcionarios.add(new Funcionario("Caio", LocalDate.of(1961, 5, 2), new BigDecimal("9836.14"), "Coordenador"));
        funcionarios.add(new Funcionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"), "Diretor"));
        funcionarios.add(new Funcionario("Alice", LocalDate.of(1995, 1, 5), new BigDecimal("2234.68"), "Recepcionista"));
        funcionarios.add(new Funcionario("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operador"));
        funcionarios.add(new Funcionario("Arthur", LocalDate.of(1993, 3, 31), new BigDecimal("4071.84"), "Contador"));
        funcionarios.add(new Funcionario("Laura", LocalDate.of(1994, 7, 8), new BigDecimal("3017.45"), "Gerente"));
        funcionarios.add(new Funcionario("Heloísa", LocalDate.of(2003, 5, 24), new BigDecimal("1606.85"), "Eletricista"));
        funcionarios.add(new Funcionario("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93"), "Gerente"));

        funcionarios.removeIf(funcionario -> funcionario.getNome().equals("João"));

        imprimirFuncionarios(funcionarios);

        aplicarAumento(funcionarios, new BigDecimal("0.10"));

        Map<String, List<Funcionario>> funcionariosPorFuncao = funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getFuncao));

        imprimirFuncionariosPorFuncao(funcionariosPorFuncao);

        System.out.println("\nAniversariantes de outubro e dezembro:");
        funcionarios.stream()
                .filter(funcionario -> {
                    int mes = funcionario.getDataNascimento().getMonthValue();
                    return mes == 10 || mes == 12;
                })
                .forEach(funcionario -> System.out.println(funcionario.getNome()));

        Funcionario maisVelho = funcionarios.stream()
                .min(Comparator.comparing(Funcionario::getDataNascimento))
                .orElseThrow();
        int idade = Period.between(maisVelho.getDataNascimento(), LocalDate.now()).getYears();
        System.out.println("\nFuncionário com maior idade: " + maisVelho.getNome() + " - " + idade + " anos");
    }

    private static void aplicarAumento(List<Funcionario> funcionarios, BigDecimal percentual) {
        BigDecimal multiplicador = BigDecimal.ONE.add(percentual);
        funcionarios.forEach(funcionario ->
                funcionario.setSalario(funcionario.getSalario().multiply(multiplicador).setScale(2, RoundingMode.HALF_UP)));
    }

    private static void imprimirFuncionarios(List<Funcionario> funcionarios) {
        funcionarios.forEach(funcionario -> System.out.println(
                funcionario.getNome() + " - "
                        + funcionario.getDataNascimento().format(FORMATO_DATA) + " - "
                        + FORMATO_NUMERO.format(funcionario.getSalario()) + " - "
                        + funcionario.getFuncao()));
    }

    private static void imprimirFuncionariosPorFuncao(Map<String, List<Funcionario>> funcionariosPorFuncao) {
        funcionariosPorFuncao.forEach((funcao, funcionarios) -> {
            System.out.println("\n" + funcao + ":");
            imprimirFuncionarios(funcionarios);
        });
    }
}
