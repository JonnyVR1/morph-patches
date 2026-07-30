package p149l;

/* JADX INFO: loaded from: classes9.dex */
public class owv extends o3f {

    /* JADX INFO: renamed from: l.owv$a */
    public static class C19063a {

        /* JADX INFO: renamed from: a */
        public static owv f146089a = new owv();
    }

    /* JADX INFO: renamed from: l.owv$b */
    public static class C19064b implements o3f.InterfaceC18833b {
        @Override // p149l.o3f.InterfaceC18833b
        public o3f create(sx3 sx3Var) {
            return owv.m166438b();
        }
    }

    /* JADX INFO: renamed from: b */
    public static owv m166438b() {
        return C19063a.f146089a;
    }

    @Override // p149l.o3f
    public void requestBodyEnd(sx3 sx3Var, long j) {
        du2.m113670a("[common][network]", "requestBodyEnd request=" + sx3Var.request().toString() + ",byteCount=" + j);
    }

    @Override // p149l.o3f
    public void responseBodyEnd(sx3 sx3Var, long j) {
        du2.m113670a("[common][network]", "responseBodyEnd request=" + sx3Var.request().toString() + ",byteCount=" + j);
    }

    public owv() {
    }
}
