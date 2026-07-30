package com.vivo.push.ups;

import android.content.Context;
import com.vivo.push.IPushActionListener;
import com.vivo.push.PushClient;

/* JADX INFO: renamed from: com.vivo.push.ups.a */
/* JADX INFO: loaded from: classes2.dex */
final class C14627a implements IPushActionListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ UPSRegisterCallback f61086a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Context f61087b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ VUpsManager f61088c;

    public C14627a(VUpsManager vUpsManager, UPSRegisterCallback uPSRegisterCallback, Context context) {
        this.f61088c = vUpsManager;
        this.f61086a = uPSRegisterCallback;
        this.f61087b = context;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i) {
        this.f61086a.onResult(new TokenResult(i, PushClient.getInstance(this.f61087b).getRegId()));
    }
}
