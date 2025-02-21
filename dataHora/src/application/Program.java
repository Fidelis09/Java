package application;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.Duration;
import java.time.Instant;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;



public class Program {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    


        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T15:03:07");
        Instant d06 = Instant.parse("2022-07-20T15:03:07Z");
        Instant d07 = Instant.parse("2022-07-20T15:03:07-03:00");

        LocalDate d08 = LocalDate.parse("20/07/2022" , fmt1);
        LocalDate d09 = LocalDate.parse("20/07/2022 01:30" , DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 15, 03, 07);
        
        // iso para formato personalizado

        LocalDate d12 = LocalDate.parse("2022-07-20");
        LocalDateTime d13 = LocalDateTime.parse("2022-07-20T15:03:07");
        Instant d14 = Instant.parse("2022-07-20T15:03:07Z");

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        // coverter os padroes para o formato personalizado 

        LocalDate d15 = LocalDate.parse("2022-07-20");
        LocalDateTime d16 = LocalDateTime.parse("2022-07-20T15:03:07");
        Instant d17 = Instant.parse("2022-07-20T15:03:07Z");

        LocalDateTime r1 = LocalDateTime.ofInstant(d17, ZoneId.systemDefault());
        LocalDateTime r2 = LocalDateTime.ofInstant(d17, ZoneId.of("Portugal"));

        //Calculos com datas

        LocalDate d18 = LocalDate.parse("2022-07-20");
        LocalDateTime d19 = LocalDateTime.parse("2022-07-20T15:03:07");
        Instant d20 = Instant.parse("2022-07-20T15:03:07Z");

        LocalDate pastWeekLocalDate = d18.minusDays(7);
        LocalDate nextWeekLocalDate = d18.plusDays(7);

        LocalDateTime pastWeekLocalDateTime = d19.minusMinutes(7);
        LocalDateTime nextWeekLocalDateTime = d19.plusHours(7);

        Instant pastWeekInstant = d20.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d20.plus(7, ChronoUnit.DAYS);


        // Descobrir duracao entre datas

        Duration t1 = Duration.between(pastWeekLocalDateTime, d19.plusDays(4));
        
        
        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);
        System.out.println("-----------------");
        System.out.println("d12 = " + d12.format(fmt2));
        System.out.println("d13 = " + fmt3.format(d13));
        System.out.println("d14 = " + fmt4.format(d14));
        System.out.println("-----------------");
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("d15 Dia = " + d15.getDayOfMonth());
        System.out.println("d15 mes = " + d15.getMonthValue());
        System.out.println("d15 Dia = " + d15.getYear());
        System.out.println("d15 Dia = " + d16.getHour());
        System.out.println("d15 Dia = " + d16.getMinute());
        System.out.println("-----------------");
        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);
        System.out.println("-----------------");
        System.out.println("t1 dias = " + t1.toDays());





    }
}