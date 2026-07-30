package p149l;

import java.util.Random;

/* JADX INFO: loaded from: classes8.dex */
public class ati0 {
    /* JADX INFO: renamed from: a */
    private static String m98800a(int i) {
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
    public static String m98801b() {
        return m98800a(8) + ijw.m136753a(new byte[]{29}) + m98800a(4) + ijw.m136753a(new byte[]{29}) + m98800a(4) + ijw.m136753a(new byte[]{29}) + m98800a(4) + ijw.m136753a(new byte[]{29}) + m98800a(12);
    }
}
