package p153l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class gby0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Bundle f103503a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ way0 f103504b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ way0 f103505c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f103506d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ say0 f103507e;

    public gby0(say0 say0Var, Bundle bundle, way0 way0Var, way0 way0Var2, long j) {
        this.f103503a = bundle;
        this.f103504b = way0Var;
        this.f103505c = way0Var2;
        this.f103506d = j;
        this.f103507e = say0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        say0.m185275D(this.f103507e, this.f103503a, this.f103504b, this.f103505c, this.f103506d);
    }
}
