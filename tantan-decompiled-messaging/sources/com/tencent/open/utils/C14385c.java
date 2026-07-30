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
public final class C14385c {

    /* JADX INFO: renamed from: a */
    private static final C14397o f60314a = new C14397o(101010256);

    /* JADX INFO: renamed from: b */
    private static final C14398p f60315b = new C14398p(38651);

    /* JADX INFO: renamed from: com.tencent.open.utils.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        Properties f60316a;

        /* JADX INFO: renamed from: b */
        byte[] f60317b;

        private a() {
            this.f60316a = new Properties();
        }

        /* JADX INFO: renamed from: a */
        public void m84385a(byte[] bArr) throws IOException {
            if (bArr == null) {
                return;
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int length = C14385c.f60315b.m84516a().length;
            byte[] bArr2 = new byte[length];
            byteBufferWrap.get(bArr2);
            if (!C14385c.f60315b.equals(new C14398p(bArr2))) {
                throw new ProtocolException("unknow protocl [" + Arrays.toString(bArr) + Constants.AES_SUFFIX);
            }
            if (bArr.length - length <= 2) {
                return;
            }
            byte[] bArr3 = new byte[2];
            byteBufferWrap.get(bArr3);
            int iM84517b = new C14398p(bArr3).m84517b();
            if ((bArr.length - length) - 2 < iM84517b) {
                return;
            }
            byte[] bArr4 = new byte[iM84517b];
            byteBufferWrap.get(bArr4);
            this.f60316a.load(new ByteArrayInputStream(bArr4));
            int length2 = ((bArr.length - length) - iM84517b) - 2;
            if (length2 > 0) {
                byte[] bArr5 = new byte[length2];
                this.f60317b = bArr5;
                byteBufferWrap.get(bArr5);
            }
        }

        public String toString() {
            return "ApkExternalInfo [p=" + this.f60316a + ", otherData=" + Arrays.toString(this.f60317b) + Constants.AES_SUFFIX;
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m84384a(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length() - 22;
        randomAccessFile.seek(length);
        byte[] bArrM84514a = f60314a.m84514a();
        int i = randomAccessFile.read();
        while (i != -1) {
            if (i == bArrM84514a[0] && randomAccessFile.read() == bArrM84514a[1] && randomAccessFile.read() == bArrM84514a[2] && randomAccessFile.read() == bArrM84514a[3]) {
                randomAccessFile.seek(length + 20);
                byte[] bArr = new byte[2];
                randomAccessFile.readFully(bArr);
                int iM84517b = new C14398p(bArr).m84517b();
                if (iM84517b == 0) {
                    return null;
                }
                byte[] bArr2 = new byte[iM84517b];
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
    public static String m84383a(File file, String str) throws Throwable {
        RandomAccessFile randomAccessFile = null;
        Object[] objArr = 0;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                byte[] bArrM84384a = m84384a(randomAccessFile2);
                if (bArrM84384a == null) {
                    randomAccessFile2.close();
                    return null;
                }
                a aVar = new a();
                aVar.m84385a(bArrM84384a);
                String property = aVar.f60316a.getProperty(str);
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
    public static String m84382a(File file) throws IOException {
        return m84383a(file, "channelNo");
    }
}
