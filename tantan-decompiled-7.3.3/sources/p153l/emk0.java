package p153l;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class emk0 {

    /* JADX INFO: renamed from: a */
    public static final char[] f94662a = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: a */
    public static byte[] m121368a(File file) throws Throwable {
        byte[] bArr;
        FileInputStream fileInputStream = null;
        byte[] bArr2 = null;
        FileInputStream fileInputStream2 = null;
        try {
            FileInputStream fileInputStream3 = new FileInputStream(file);
            try {
                bArr2 = new byte[fileInputStream3.available()];
                fileInputStream3.read(bArr2);
                try {
                    fileInputStream3.close();
                    return bArr2;
                } catch (IOException unused) {
                    return bArr2;
                }
            } catch (Exception unused2) {
                bArr = bArr2;
                fileInputStream2 = fileInputStream3;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused3) {
                    }
                }
                return bArr;
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream3;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            bArr = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
