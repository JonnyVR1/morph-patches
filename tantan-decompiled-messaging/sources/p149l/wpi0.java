package p149l;

/* JADX INFO: loaded from: classes.dex */
public class wpi0 implements sc90<jze> {

    /* JADX INFO: renamed from: a */
    public final xpi0<jze>[] f187531a;

    /* JADX INFO: renamed from: l.wpi0$a */
    public class C20935a extends btd<jze, jze> {

        /* JADX INFO: renamed from: c */
        public final uc90 f187532c;

        /* JADX INFO: renamed from: d */
        public final int f187533d;

        /* JADX INFO: renamed from: e */
        public final nvc0 f187534e;

        public C20935a(uz5<jze> uz5Var, uc90 uc90Var, int i) {
            super(uz5Var);
            this.f187532c = uc90Var;
            this.f187533d = i;
            this.f187534e = uc90Var.mo155873t().m8581s();
        }

        @Override // p149l.btd, p149l.ci2
        /* JADX INFO: renamed from: g */
        public void mo8522g(Throwable th) {
            if (wpi0.this.m204919e(this.f187533d + 1, m103812o(), this.f187532c)) {
                return;
            }
            m103812o().onFailure(th);
        }

        @Override // p149l.ci2
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo8523h(jze jzeVar, int i) {
            if (jzeVar != null && (ci2.m107029e(i) || zpi0.m219675c(jzeVar, this.f187534e))) {
                m103812o().mo107035b(jzeVar, i);
            } else if (ci2.m107028d(i)) {
                jze.m143896n(jzeVar);
                if (wpi0.this.m204919e(this.f187533d + 1, m103812o(), this.f187532c)) {
                    return;
                }
                m103812o().mo107035b(null, 1);
            }
        }
    }

    public wpi0(xpi0<jze>... xpi0VarArr) {
        xpi0<jze>[] xpi0VarArr2 = (xpi0[]) rf80.m179116g(xpi0VarArr);
        this.f187531a = xpi0VarArr2;
        rf80.m179114e(0, xpi0VarArr2.length);
    }

    @Override // p149l.sc90
    /* JADX INFO: renamed from: b */
    public void mo8485b(uz5<jze> uz5Var, uc90 uc90Var) {
        if (uc90Var.mo155873t().m8581s() == null) {
            uz5Var.mo107035b(null, 1);
        } else {
            if (m204919e(0, uz5Var, uc90Var)) {
                return;
            }
            uz5Var.mo107035b(null, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m204918d(int i, nvc0 nvc0Var) {
        while (true) {
            xpi0<jze>[] xpi0VarArr = this.f187531a;
            if (i >= xpi0VarArr.length) {
                return -1;
            }
            if (xpi0VarArr[i].mo8484a(nvc0Var)) {
                return i;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m204919e(int i, uz5<jze> uz5Var, uc90 uc90Var) {
        int iM204918d = m204918d(i, uc90Var.mo155873t().m8581s());
        if (iM204918d == -1) {
            return false;
        }
        this.f187531a[iM204918d].mo8485b(new C20935a(uz5Var, uc90Var, iM204918d), uc90Var);
        return true;
    }
}
