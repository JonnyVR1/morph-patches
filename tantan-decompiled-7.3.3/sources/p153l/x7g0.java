package p153l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class x7g0 {
    /* JADX INFO: renamed from: a */
    public static long m209634a(InputStream inputStream, long j) throws IOException {
        wn80.m207182g(inputStream);
        wn80.m207177b(Boolean.valueOf(j >= 0));
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
