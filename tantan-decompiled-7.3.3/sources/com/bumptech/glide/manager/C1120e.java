package com.bumptech.glide.manager;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: com.bumptech.glide.manager.e */
/* JADX INFO: loaded from: classes.dex */
final class C1120e implements InterfaceC1118c {

    /* JADX INFO: renamed from: a */
    private final Context f4670a;

    /* JADX INFO: renamed from: b */
    final InterfaceC1118c.a f4671b;

    public C1120e(@NonNull Context context, @NonNull InterfaceC1118c.a aVar) {
        this.f4670a = context.getApplicationContext();
        this.f4671b = aVar;
    }

    /* JADX INFO: renamed from: b */
    private void m5631b() {
        C1129n.m5660a(this.f4670a).m5663d(this.f4671b);
    }

    /* JADX INFO: renamed from: f */
    private void m5632f() {
        C1129n.m5660a(this.f4670a).m5664e(this.f4671b);
    }

    @Override // p153l.ier
    /* JADX INFO: renamed from: d */
    public void mo5633d() {
        m5632f();
    }

    @Override // p153l.ier
    public void onDestroy() {
    }

    @Override // p153l.ier
    public void onStart() {
        m5631b();
    }
}
