package p149l;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class jiu0 implements vgs0 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f118135a;

    /* JADX INFO: renamed from: b */
    public final String f118136b;

    /* JADX INFO: renamed from: c */
    public final vgs0 f118137c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ kiu0 f118138d;

    public /* synthetic */ jiu0(kiu0 kiu0Var, WeakReference weakReference, String str, vgs0 vgs0Var, iiu0 iiu0Var) {
        this.f118138d = kiu0Var;
        this.f118135a = weakReference;
        this.f118136b = str;
        this.f118137c = vgs0Var;
    }

    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final void mo12863a(Object obj, Map map) {
        Object obj2 = this.f118135a.get();
        if (obj2 == null) {
            this.f118138d.m146146k(this.f118136b, this);
        } else {
            this.f118137c.mo12863a(obj2, map);
        }
    }
}
