package p149l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class cwr0 extends rwr0 {

    /* JADX INFO: renamed from: i */
    public final str0 f82806i;

    /* JADX INFO: renamed from: j */
    public final long f82807j;

    /* JADX INFO: renamed from: k */
    public final long f82808k;

    public cwr0(vur0 vur0Var, String str, String str2, zpr0 zpr0Var, int i, int i2, str0 str0Var, long j, long j2) {
        super(vur0Var, "ChMYhePBDqkXl5DeRTg9cgSXXNPVEcIqgEVciYHEVlkZyx/HkVQXSnen8aw33G2s", "tJ+SvALjKnpAv9FF8u56pKKRS55/vzUDe+m9ct97Lx4=", zpr0Var, i, 11);
        this.f82806i = str0Var;
        this.f82807j = j;
        this.f82808k = j2;
    }

    @Override // p149l.rwr0
    /* JADX INFO: renamed from: a */
    public final void mo99305a() throws IllegalAccessException, InvocationTargetException {
        str0 str0Var = this.f82806i;
        if (str0Var != null) {
            qtr0 qtr0Var = new qtr0((String) this.f161372f.invoke(null, str0Var.m185971b(), Long.valueOf(this.f82807j), Long.valueOf(this.f82808k)));
            synchronized (this.f161371e) {
                try {
                    this.f161371e.m219742A0(qtr0Var.f156382a.longValue());
                    if (qtr0Var.f156383b.longValue() >= 0) {
                        this.f161371e.m219748K(qtr0Var.f156383b.longValue());
                    }
                    if (qtr0Var.f156384c.longValue() >= 0) {
                        this.f161371e.m219770g0(qtr0Var.f156384c.longValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
