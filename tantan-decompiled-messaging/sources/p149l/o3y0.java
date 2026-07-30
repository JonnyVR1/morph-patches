package p149l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class o3y0 implements b2y0 {

    /* JADX INFO: renamed from: a */
    public final zpy0 f141718a;

    /* JADX INFO: renamed from: d */
    public int f141721d;

    /* JADX INFO: renamed from: e */
    public boolean f141722e;

    /* JADX INFO: renamed from: c */
    public final List f141720c = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final Object f141719b = new Object();

    public o3y0(gqy0 gqy0Var, boolean z) {
        this.f141718a = new zpy0(gqy0Var, z);
    }

    /* JADX INFO: renamed from: a */
    public final void m162499a(int i) {
        this.f141721d = i;
        this.f141722e = false;
        this.f141720c.clear();
    }

    @Override // p149l.b2y0
    public final xqt0 zza() {
        return this.f141718a.m219810J();
    }

    @Override // p149l.b2y0
    public final Object zzb() {
        return this.f141719b;
    }
}
