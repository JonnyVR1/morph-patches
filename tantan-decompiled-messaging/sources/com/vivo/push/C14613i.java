package com.vivo.push;

/* JADX INFO: renamed from: com.vivo.push.i */
/* JADX INFO: loaded from: classes2.dex */
final class C14613i implements IPushActionListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C14608e f61046a;

    public C14613i(C14608e c14608e) {
        this.f61046a = c14608e;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i) {
        C14608e c14608e = this.f61046a;
        if (i != 0) {
            c14608e.f61022k = null;
            this.f61046a.f61021j.m84969b("APP_TOKEN");
        } else {
            c14608e.f61022k = "";
            this.f61046a.f61021j.m84966a("APP_TOKEN", "");
            this.f61046a.m84873m();
            this.f61046a.f61021j.m84969b("APP_TAGS");
        }
    }
}
