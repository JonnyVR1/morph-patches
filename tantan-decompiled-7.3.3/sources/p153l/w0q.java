package p153l;

import com.googlecode.mp4parser.BasicContainer;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public class w0q extends BasicContainer implements Closeable {

    /* JADX INFO: renamed from: a */
    private static szv f186626a = szv.m188683a(w0q.class);

    /* JADX INFO: renamed from: b */
    public static String m204213b(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, 4));
        }
        try {
            return new String(bArr2, "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new Error("Required character encoding is missing", e);
        }
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m204214d(String str) {
        byte[] bArr = new byte[4];
        if (str != null) {
            for (int i = 0; i < Math.min(4, str.length()); i++) {
                bArr[i] = (byte) str.charAt(i);
            }
        }
        return bArr;
    }

    @Override // com.googlecode.mp4parser.BasicContainer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.dataSource.close();
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public String toString() {
        return "model(" + this.dataSource.toString() + ")";
    }
}
