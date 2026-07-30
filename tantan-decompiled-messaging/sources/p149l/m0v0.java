package p149l;

import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class m0v0 implements ezt0, mxt0 {

    /* JADX INFO: renamed from: c */
    public static final Object f130773c = new Object();

    /* JADX INFO: renamed from: d */
    public static int f130774d;

    /* JADX INFO: renamed from: a */
    public final aiw0 f130775a;

    /* JADX INFO: renamed from: b */
    public final w0v0 f130776b;

    public m0v0(w0v0 w0v0Var, aiw0 aiw0Var) {
        this.f130776b = w0v0Var;
        this.f130775a = aiw0Var;
    }

    /* JADX INFO: renamed from: a */
    private final void m152546a(boolean z) {
        int i;
        int iIntValue;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132280j6)).booleanValue() && !this.f130775a.mo96947f()) {
            Object obj = f130773c;
            synchronized (obj) {
                i = f130774d;
                iIntValue = ((Integer) d1s0.m109677c().m144697a(m7s0.f132293k6)).intValue();
            }
            if (i < iIntValue) {
                this.f130776b.m200908e(z);
                synchronized (obj) {
                    f130774d++;
                }
            }
        }
    }

    @Override // p149l.mxt0
    /* JADX INFO: renamed from: u */
    public final void mo97693u(zze zzeVar) {
        m152546a(false);
    }

    @Override // p149l.ezt0
    public final void zzr() {
        m152546a(true);
    }
}
