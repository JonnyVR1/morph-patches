package p149l;

/* JADX INFO: loaded from: classes.dex */
public class x80 implements sc90<jze> {

    /* JADX INFO: renamed from: a */
    public final sc90<jze> f191423a;

    /* JADX INFO: renamed from: l.x80$a */
    public static class C21041a extends btd<jze, jze> {
        @Override // p149l.ci2
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo8523h(jze jzeVar, int i) {
            if (jzeVar == null) {
                m103812o().mo107035b(null, i);
                return;
            }
            if (!jze.m143893Y(jzeVar)) {
                jzeVar.m143909d0();
            }
            m103812o().mo107035b(jzeVar, i);
        }

        public C21041a(uz5<jze> uz5Var) {
            super(uz5Var);
        }
    }

    public x80(sc90<jze> sc90Var) {
        this.f191423a = sc90Var;
    }

    @Override // p149l.sc90
    /* JADX INFO: renamed from: b */
    public void mo8485b(uz5<jze> uz5Var, uc90 uc90Var) {
        this.f191423a.mo8485b(new C21041a(uz5Var), uc90Var);
    }
}
