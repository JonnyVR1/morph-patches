package p149l;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class bcu0 implements fmw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f74966a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ccu0 f74967b;

    public bcu0(ccu0 ccu0Var, View view) {
        this.f74966a = view;
        this.f74967b = ccu0Var;
    }

    @Override // p149l.fmw0
    public final void zza(Throwable th) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132175b5)).booleanValue()) {
            vny0.m199079q().m212289v(th, "omid native display exp");
        }
    }

    @Override // p149l.fmw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.f74967b.m106166L(this.f74966a, (b6w0) obj);
    }
}
