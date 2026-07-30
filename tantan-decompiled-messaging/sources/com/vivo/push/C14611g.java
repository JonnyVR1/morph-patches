package com.vivo.push;

import com.vivo.push.util.C14647p;

/* JADX INFO: renamed from: com.vivo.push.g */
/* JADX INFO: loaded from: classes2.dex */
final class C14611g implements IPushActionListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C14608e.a f61041a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C14608e f61042b;

    public C14611g(C14608e c14608e, C14608e.a aVar) {
        this.f61042b = c14608e;
        this.f61041a = aVar;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i) {
        if (i != 0) {
            this.f61042b.f61022k = null;
            this.f61042b.f61021j.m84969b("APP_TOKEN");
            return;
        }
        Object[] objArrM84907b = this.f61041a.m84907b();
        if (objArrM84907b == null || objArrM84907b.length == 0) {
            C14647p.m85008a("PushClientManager", "bind app result is null");
        } else {
            this.f61042b.m84879a((String) this.f61041a.m84907b()[0]);
        }
    }
}
