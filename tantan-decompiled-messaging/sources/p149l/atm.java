package p149l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class atm {
    /* JADX INFO: renamed from: a */
    public static String m98834a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            int i = inputStream.read();
            while (i != -1) {
                byteArrayOutputStream.write(i);
                i = inputStream.read();
            }
            return byteArrayOutputStream.toString();
        } catch (IOException unused) {
            return "";
        }
    }
}
