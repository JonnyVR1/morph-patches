package p149l;

import com.google.android.gms.internal.ads.zzcc;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d9r0 {

    /* JADX INFO: renamed from: a */
    public final m7r0 f85142a;

    public d9r0(m7r0 m7r0Var) {
        this.f85142a = m7r0Var;
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo105903a(v6w0 v6w0Var) throws zzcc;

    /* JADX INFO: renamed from: b */
    public abstract boolean mo105904b(v6w0 v6w0Var, long j) throws zzcc;

    /* JADX INFO: renamed from: c */
    public final boolean m110462c(v6w0 v6w0Var, long j) throws zzcc {
        return mo105903a(v6w0Var) && mo105904b(v6w0Var, j);
    }
}
