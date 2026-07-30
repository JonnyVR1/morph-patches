package p153l;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes.dex */
public final class aqq0 {

    /* JADX INFO: renamed from: l.aqq0$a */
    public static class C15801a {

        /* JADX INFO: renamed from: a */
        public long f72833a;

        /* JADX INFO: renamed from: b */
        public long f72834b;
    }

    /* JADX INFO: renamed from: a */
    public static long m99546a(RandomAccessFile randomAccessFile, C15801a c15801a) throws IOException {
        CRC32 crc32 = new CRC32();
        long j = c15801a.f72834b;
        randomAccessFile.seek(c15801a.f72833a);
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
    public static C15801a m99547b(RandomAccessFile randomAccessFile) throws IOException {
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
                C15801a c15801a = new C15801a();
                c15801a.f72834b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                c15801a.f72833a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                return c15801a;
            }
            j--;
        } while (j >= j3);
        throw new ZipException("End Of Central Directory signature not found");
    }

    /* JADX INFO: renamed from: c */
    public static long m99548c(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return m99546a(randomAccessFile, m99547b(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}
