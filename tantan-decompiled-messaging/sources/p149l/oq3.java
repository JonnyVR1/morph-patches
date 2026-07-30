package p149l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class oq3 {
    /* JADX INFO: renamed from: a */
    public static long m165401a(InputStream inputStream, OutputStream outputStream) throws IOException {
        rf80.m179116g(inputStream);
        rf80.m179116g(outputStream);
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return j;
            }
            outputStream.write(bArr, 0, i);
            j += (long) i;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m165402b(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        rf80.m179116g(inputStream);
        rf80.m179116g(bArr);
        if (i2 < 0) {
            jwm.m143661a("len is negative");
            return 0;
        }
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i + i3, i2 - i3);
            if (i4 == -1) {
                break;
            }
            i3 += i4;
        }
        return i3;
    }
}
