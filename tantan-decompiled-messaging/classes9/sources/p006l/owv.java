package p006l;

import l.du2;
import l.o3f;
import l.sx3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class owv extends o3f {

    /* JADX INFO: renamed from: l.owv$a */
    public static class C1108a {

        /* JADX INFO: renamed from: a */
        public static owv f18470a = new owv();
    }

    /* JADX INFO: renamed from: l.owv$b */
    public static class C1109b implements o3f.b {
        public o3f create(sx3 sx3Var) {
            return owv.m20917b();
        }
    }

    /* JADX INFO: renamed from: b */
    public static owv m20917b() {
        return C1108a.f18470a;
    }

    public void requestBodyEnd(sx3 sx3Var, long j) {
        du2.a("[common][network]", "requestBodyEnd request=" + sx3Var.request().toString() + ",byteCount=" + j);
    }

    public void responseBodyEnd(sx3 sx3Var, long j) {
        du2.a("[common][network]", "responseBodyEnd request=" + sx3Var.request().toString() + ",byteCount=" + j);
    }

    public owv() {
    }
}
