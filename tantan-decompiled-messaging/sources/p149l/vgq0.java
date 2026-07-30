package p149l;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes.dex */
public final class vgq0 {

    /* JADX INFO: renamed from: l.vgq0$a */
    public static class C20634a {

        /* JADX INFO: renamed from: a */
        public long f181418a;

        /* JADX INFO: renamed from: b */
        public long f181419b;
    }

    /* JADX INFO: renamed from: a */
    public static long m198382a(RandomAccessFile randomAccessFile, C20634a c20634a) throws IOException {
        CRC32 crc32 = new CRC32();
        long j = c20634a.f181419b;
        randomAccessFile.seek(c20634a.f181418a);
        byte[] bArr = new byte[16384];
        int i = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
        while (i != -1) {
            crc32.update(bArr, 0, i);
            j -= (long) i;
            if (j == 0) {
                break;
            }
            i = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
        }
        return crc32.getValue();
    }

    /* JADX INFO: renamed from: b */
    public static C20634a m198383b(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length();
        long j = length - 22;
        if (j < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j2 = length - 65558;
        long j3 = j2 >= 0 ? j2 : 0L;
        int iReverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(j);
            if (randomAccessFile.readInt() == iReverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                C20634a c20634a = new C20634a();
                c20634a.f181419b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                c20634a.f181418a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                return c20634a;
            }
            j--;
        } while (j >= j3);
        throw new ZipException("End Of Central Directory signature not found");
    }

    /* JADX INFO: renamed from: c */
    public static long m198384c(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return m198382a(randomAccessFile, m198383b(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}
