package p149l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class azp {
    /* JADX INFO: renamed from: a */
    public static long m99722a(ByteBuffer byteBuffer, int i) {
        if (i == 1) {
            return yyp.m216561n(byteBuffer);
        }
        if (i == 2) {
            return yyp.m216556i(byteBuffer);
        }
        if (i == 3) {
            return yyp.m216557j(byteBuffer);
        }
        if (i == 4) {
            return yyp.m216558k(byteBuffer);
        }
        if (i == 8) {
            return yyp.m216560m(byteBuffer);
        }
        zyp.m220936a("I don't know how to read ", i, " bytes");
        return 0L;
    }
}
