package cn.shuzilm.core;

import android.content.Context;

/* JADX INFO: renamed from: cn.shuzilm.core.s */
/* JADX INFO: loaded from: classes.dex */
class C0827s implements Listener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f3845a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int f3846b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Listener f3847c;

    public C0827s(Context context, int i, Listener listener) {
        this.f3845a = context;
        this.f3846b = i;
        this.f3847c = listener;
    }

    @Override // cn.shuzilm.core.Listener
    public void handler(String str) {
        String strM4709b = DUHelper.f3733d.m4709b(this.f3845a, this.f3846b);
        Listener listener = this.f3847c;
        if (listener != null) {
            listener.handler(strM4709b);
        }
    }
}
