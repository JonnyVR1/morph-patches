package p153l;

/* JADX INFO: loaded from: classes2.dex */
public class o2r0 {

    /* JADX INFO: renamed from: a */
    private static vsq0 f144765a = new vsq0(true, 20);

    /* JADX INFO: renamed from: l.o2r0$a */
    public static class C19016a extends vsq0.AbstractC20930d {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Runnable f144766b;

        public C19016a(Runnable runnable) {
            this.f144766b = runnable;
        }

        @Override // p153l.vsq0.AbstractC20930d
        /* JADX INFO: renamed from: b */
        public void mo87758b() {
            this.f144766b.run();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m165744a(Runnable runnable) {
        f144765a.m202648e(new C19016a(runnable));
    }

    /* JADX INFO: renamed from: b */
    public static void m165745b(vsq0.AbstractC20930d abstractC20930d) {
        f144765a.m202648e(abstractC20930d);
    }

    /* JADX INFO: renamed from: c */
    public static void m165746c(vsq0.AbstractC20930d abstractC20930d, long j) {
        f144765a.m202649f(abstractC20930d, j);
    }
}
