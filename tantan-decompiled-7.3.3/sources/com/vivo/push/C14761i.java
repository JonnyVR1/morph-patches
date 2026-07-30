package com.vivo.push;

/* JADX INFO: renamed from: com.vivo.push.i */
/* JADX INFO: loaded from: classes2.dex */
final class C14761i implements IPushActionListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C14756e f61893a;

    public C14761i(C14756e c14756e) {
        this.f61893a = c14756e;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i) {
        C14756e c14756e = this.f61893a;
        if (i != 0) {
            c14756e.f61869k = null;
            this.f61893a.f61868j.m86140b("APP_TOKEN");
        } else {
            c14756e.f61869k = "";
            this.f61893a.f61868j.m86137a("APP_TOKEN", "");
            this.f61893a.m86044m();
            this.f61893a.f61868j.m86140b("APP_TAGS");
        }
    }
}
