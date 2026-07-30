package p149l;

/* JADX INFO: loaded from: classes2.dex */
public class itq0 {

    /* JADX INFO: renamed from: a */
    private static pjq0 f114909a = new pjq0(true, 20);

    /* JADX INFO: renamed from: l.itq0$a */
    public static class C17617a extends pjq0.AbstractC19254d {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Runnable f114910b;

        public C17617a(Runnable runnable) {
            this.f114910b = runnable;
        }

        @Override // p149l.pjq0.AbstractC19254d
        /* JADX INFO: renamed from: b */
        public void mo86587b() {
            this.f114910b.run();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m138233a(Runnable runnable) {
        f114909a.m169926e(new C17617a(runnable));
    }

    /* JADX INFO: renamed from: b */
    public static void m138234b(pjq0.AbstractC19254d abstractC19254d) {
        f114909a.m169926e(abstractC19254d);
    }

    /* JADX INFO: renamed from: c */
    public static void m138235c(pjq0.AbstractC19254d abstractC19254d, long j) {
        f114909a.m169927f(abstractC19254d, j);
    }
}
