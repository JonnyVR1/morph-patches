package p153l;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes11.dex */
public class sjj {

    /* JADX INFO: renamed from: a */
    public static final Charset f168978a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public static byte[] m186098a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
        byte[] bArr = new byte[1];
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes(f168978a));
            va5.m200497a(gZIPOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            wu80.m207938b(e);
            return bArr;
        } finally {
            va5.m200497a(byteArrayOutputStream);
        }
    }
}
