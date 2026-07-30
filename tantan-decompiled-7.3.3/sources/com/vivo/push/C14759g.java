package com.vivo.push;

import com.vivo.push.util.C14795p;

/* JADX INFO: renamed from: com.vivo.push.g */
/* JADX INFO: loaded from: classes2.dex */
final class C14759g implements IPushActionListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C14756e.a f61888a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C14756e f61889b;

    public C14759g(C14756e c14756e, C14756e.a aVar) {
        this.f61889b = c14756e;
        this.f61888a = aVar;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i) {
        if (i != 0) {
            this.f61889b.f61869k = null;
            this.f61889b.f61868j.m86140b("APP_TOKEN");
            return;
        }
        Object[] objArrM86078b = this.f61888a.m86078b();
        if (objArrM86078b == null || objArrM86078b.length == 0) {
            C14795p.m86179a("PushClientManager", "bind app result is null");
        } else {
            this.f61889b.m86050a((String) this.f61888a.m86078b()[0]);
        }
    }
}
