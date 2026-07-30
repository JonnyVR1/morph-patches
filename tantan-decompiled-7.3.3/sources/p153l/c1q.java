package p153l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class c1q {
    /* JADX INFO: renamed from: a */
    public static void m107634a(long j, ByteBuffer byteBuffer, int i) {
        if (i == 1) {
            b1q.m101498j(byteBuffer, (int) (j & 255));
            return;
        }
        if (i == 2) {
            b1q.m101493e(byteBuffer, (int) (j & 65535));
            return;
        }
        if (i == 3) {
            b1q.m101494f(byteBuffer, (int) (j & 16777215));
            return;
        }
        if (i == 4) {
            b1q.m101495g(byteBuffer, j);
        } else if (i == 8) {
            b1q.m101497i(byteBuffer, j);
        } else {
            z0q.m218147a("I don't know how to read ", i, " bytes");
        }
    }
}
