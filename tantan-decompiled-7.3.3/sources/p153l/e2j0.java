package p153l;

import java.util.Random;

/* JADX INFO: loaded from: classes8.dex */
public class e2j0 {
    /* JADX INFO: renamed from: a */
    private static String m119087a(int i) {
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            int iNextInt = random.nextInt(3);
            if (iNextInt == 0) {
                stringBuffer.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 65.0d)));
            } else if (iNextInt == 1) {
                stringBuffer.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 97.0d)));
            } else if (iNextInt == 2) {
                stringBuffer.append(String.valueOf(new Random().nextInt(10)));
            }
        }
        return stringBuffer.toString().toUpperCase();
    }

    /* JADX INFO: renamed from: b */
    public static String m119088b() {
        return m119087a(8) + hmw.m136007a(new byte[]{29}) + m119087a(4) + hmw.m136007a(new byte[]{29}) + m119087a(4) + hmw.m136007a(new byte[]{29}) + m119087a(4) + hmw.m136007a(new byte[]{29}) + m119087a(12);
    }
}
