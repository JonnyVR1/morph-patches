package p149l;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes13.dex */
public class ygj {

    /* JADX INFO: renamed from: a */
    public static final Charset f198202a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public static byte[] m214725a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
        byte[] bArr = new byte[1];
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes(f198202a));
            u95.m192263a(gZIPOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            sm80.m184942b(e);
            return bArr;
        } finally {
            u95.m192263a(byteArrayOutputStream);
        }
    }
}
