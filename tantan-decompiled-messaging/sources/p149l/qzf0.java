package p149l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class qzf0 {
    /* JADX INFO: renamed from: a */
    public static long m177201a(InputStream inputStream, long j) throws IOException {
        rf80.m179116g(inputStream);
        rf80.m179111b(Boolean.valueOf(j >= 0));
        long j2 = j;
        while (j2 > 0) {
            long jSkip = inputStream.skip(j2);
            if (jSkip <= 0) {
                if (inputStream.read() == -1) {
                    return j - j2;
                }
                jSkip = 1;
            }
            j2 -= jSkip;
        }
        return j;
    }
}
