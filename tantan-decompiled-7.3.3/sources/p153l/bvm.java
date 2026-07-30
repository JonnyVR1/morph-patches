package p153l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class bvm {
    /* JADX INFO: renamed from: a */
    public static String m106579a(InputStream inputStream) {
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
