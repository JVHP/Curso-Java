package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		// Somando unidade de tempo

		Date d = Date.from(Instant.parse("2017-06-25T15:42:02Z"));

		System.out.println(sdf.format(d));

		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();

		System.out.println(sdf.format(d));

		// Obtendo unidade de tempo
		Date d2 = Date.from(Instant.parse("2017-06-25T15:42:02Z"));

		System.out.println(sdf.format(d));

		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d2);
		int minutes = cal2.get(Calendar.MINUTE);
		int seconds = cal2.get(Calendar.SECOND);
		int month = 1 + cal2.get(Calendar.MONTH);//O calendar começa os meses com 0 (Janeiro == 0)
		
		System.out.println("Minutos: " + minutes);
		System.out.println("Segundos: " + seconds);
		System.out.println("Mes: " + month);

		sc.close();
	}

}
