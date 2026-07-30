package com.tencent.open.utils;

import com.clevertap.android.sdk.Constants;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Properties;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: com.tencent.open.utils.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C14548c {

    /* JADX INFO: renamed from: a */
    private static final C14560o f61162a = new C14560o(101010256);

    /* JADX INFO: renamed from: b */
    private static final C14561p f61163b = new C14561p(38651);

    /* JADX INFO: renamed from: com.tencent.open.utils.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        Properties f61164a;

        /* JADX INFO: renamed from: b */
        byte[] f61165b;

        private a() {
            this.f61164a = new Properties();
        }

        /* JADX INFO: renamed from: a */
        public void m85568a(byte[] bArr) throws IOException {
            if (bArr == null) {
                return;
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int length = C14548c.f61163b.m85699a().length;
            byte[] bArr2 = new byte[length];
            byteBufferWrap.get(bArr2);
            if (!C14548c.f61163b.equals(new C14561p(bArr2))) {
                throw new ProtocolException("unknow protocl [" + Arrays.toString(bArr) + Constants.AES_SUFFIX);
            }
            if (bArr.length - length <= 2) {
                return;
            }
            byte[] bArr3 = new byte[2];
            byteBufferWrap.get(bArr3);
            int iM85700b = new C14561p(bArr3).m85700b();
            if ((bArr.length - length) - 2 < iM85700b) {
                return;
            }
            byte[] bArr4 = new byte[iM85700b];
            byteBufferWrap.get(bArr4);
            this.f61164a.load(new ByteArrayInputStream(bArr4));
            int length2 = ((bArr.length - length) - iM85700b) - 2;
            if (length2 > 0) {
                byte[] bArr5 = new byte[length2];
                this.f61165b = bArr5;
                byteBufferWrap.get(bArr5);
            }
        }

        public String toString() {
            return "ApkExternalInfo [p=" + this.f61164a + ", otherData=" + Arrays.toString(this.f61165b) + Constants.AES_SUFFIX;
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m85567a(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length() - 22;
        randomAccessFile.seek(length);
        byte[] bArrM85697a = f61162a.m85697a();
        int i = randomAccessFile.read();
        while (i != -1) {
            if (i == bArrM85697a[0] && randomAccessFile.read() == bArrM85697a[1] && randomAccessFile.read() == bArrM85697a[2] && randomAccessFile.read() == bArrM85697a[3]) {
                randomAccessFile.seek(length + 20);
                byte[] bArr = new byte[2];
                randomAccessFile.readFully(bArr);
                int iM85700b = new C14561p(bArr).m85700b();
                if (iM85700b == 0) {
                    return null;
                }
                byte[] bArr2 = new byte[iM85700b];
                randomAccessFile.read(bArr2);
                return bArr2;
            }
            length--;
            randomAccessFile.seek(length);
            i = randomAccessFile.read();
        }
        throw new ZipException("archive is not a ZIP archive");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static String m85566a(File file, String str) throws Throwable {
        RandomAccessFile randomAccessFile = null;
        Object[] objArr = 0;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                byte[] bArrM85567a = m85567a(randomAccessFile2);
                if (bArrM85567a == null) {
                    randomAccessFile2.close();
                    return null;
                }
                a aVar = new a();
                aVar.m85568a(bArrM85567a);
                String property = aVar.f61164a.getProperty(str);
                randomAccessFile2.close();
                return property;
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m85565a(File file) throws IOException {
        return m85566a(file, "channelNo");
    }
}
