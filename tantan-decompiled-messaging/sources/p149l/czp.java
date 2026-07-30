package p149l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class czp {
    /* JADX INFO: renamed from: a */
    public static void m109429a(long j, ByteBuffer byteBuffer, int i) {
        if (i == 1) {
            bzp.m104638j(byteBuffer, (int) (j & 255));
            return;
        }
        if (i == 2) {
            bzp.m104633e(byteBuffer, (int) (j & 65535));
            return;
        }
        if (i == 3) {
            bzp.m104634f(byteBuffer, (int) (j & 16777215));
            return;
        }
        if (i == 4) {
            bzp.m104635g(byteBuffer, j);
        } else if (i == 8) {
            bzp.m104637i(byteBuffer, j);
        } else {
            zyp.m220936a("I don't know how to read ", i, " bytes");
        }
    }
}
