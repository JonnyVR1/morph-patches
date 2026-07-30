package p153l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ucy0 implements hby0 {

    /* JADX INFO: renamed from: a */
    public final fzy0 f178472a;

    /* JADX INFO: renamed from: d */
    public int f178475d;

    /* JADX INFO: renamed from: e */
    public boolean f178476e;

    /* JADX INFO: renamed from: c */
    public final List f178474c = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final Object f178473b = new Object();

    public ucy0(mzy0 mzy0Var, boolean z) {
        this.f178472a = new fzy0(mzy0Var, z);
    }

    /* JADX INFO: renamed from: a */
    public final void m195453a(int i) {
        this.f178475d = i;
        this.f178476e = false;
        this.f178474c.clear();
    }

    @Override // p153l.hby0
    public final d0u0 zza() {
        return this.f178472a.m128355J();
    }

    @Override // p153l.hby0
    public final Object zzb() {
        return this.f178473b;
    }
}
