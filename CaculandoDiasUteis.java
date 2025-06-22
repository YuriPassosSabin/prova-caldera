import java.time.LocalDate;

import static java.time.DayOfWeek.SATURDAY;//<-- mesmo com esses imports o codigo "dayOfWeek.diaDaSemana" é usado de
import static java.time.DayOfWeek.SUNDAY;//<--   forma incorreta no codigo

public class CaculandoDiasUteis {
    public static void main(String[] args) {
        //calculo de dias uteis com local date
        //nota: eu copiei exatamente como estava na questão e o codigo não roda
        LocalDate data = LocalDate.of(2025, 6, 10);
        int diasUteis = 0;
        while (diasUteis < 7) {
            data = data.plusDays(1);
            //dayOfWeek não existe ou esta faltando a variavel de onde pegar
            // esse atributo/sintaxe escrita incorretamente                    | essas operações não fazem sentido senão
            //                                           |                     | dentro de um if ou laço de repetição
            //                                           V                     V                      V
            //boolean fimDeSemana = data.getDayOfWeek() == dayOfWeek.SATURDAY || data.getDayOfWeek() == dayOfWeek.SUNDAY;
            //boolean feriado = data.equals(LocalDate.of(2025, 6, 15));

            //   aqui esta o codigo corrigido
            boolean fimDeSemana = data.getDayOfWeek() == SATURDAY || data.getDayOfWeek() == SUNDAY;
            boolean feriado = data.equals(LocalDate.of(2025, 6, 15));
            if (!fimDeSemana && !feriado) {
                diasUteis++;
            }
        }
        System.out.println(data);
    }
}
