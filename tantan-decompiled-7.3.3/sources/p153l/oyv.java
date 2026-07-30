package p153l;

/* JADX INFO: loaded from: classes9.dex */
public class oyv extends t4f {

    /* JADX INFO: renamed from: l.oyv$a */
    public static class C19249a {

        /* JADX INFO: renamed from: a */
        public static oyv f149827a = new oyv();
    }

    /* JADX INFO: renamed from: l.oyv$b */
    public static class C19250b implements t4f.InterfaceC20235b {
        @Override // p153l.t4f.InterfaceC20235b
        public t4f create(ry3 ry3Var) {
            return oyv.m169911b();
        }
    }

    /* JADX INFO: renamed from: b */
    public static oyv m169911b() {
        return C19249a.f149827a;
    }

    @Override // p153l.t4f
    public void requestBodyEnd(ry3 ry3Var, long j) {
        tu2.m192703a("[common][network]", "requestBodyEnd request=" + ry3Var.request().toString() + ",byteCount=" + j);
    }

    @Override // p153l.t4f
    public void responseBodyEnd(ry3 ry3Var, long j) {
        tu2.m192703a("[common][network]", "responseBodyEnd request=" + ry3Var.request().toString() + ",byteCount=" + j);
    }

    public oyv() {
    }
}
