package p153l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class a1q {
    /* JADX INFO: renamed from: a */
    public static long m95539a(ByteBuffer byteBuffer, int i) {
        if (i == 1) {
            return y0q.m213898n(byteBuffer);
        }
        if (i == 2) {
            return y0q.m213893i(byteBuffer);
        }
        if (i == 3) {
            return y0q.m213894j(byteBuffer);
        }
        if (i == 4) {
            return y0q.m213895k(byteBuffer);
        }
        if (i == 8) {
            return y0q.m213897m(byteBuffer);
        }
        z0q.m218147a("I don't know how to read ", i, " bytes");
        return 0L;
    }
}
