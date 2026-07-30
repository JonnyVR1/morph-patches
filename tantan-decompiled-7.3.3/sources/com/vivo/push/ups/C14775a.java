package com.vivo.push.ups;

import android.content.Context;
import com.vivo.push.IPushActionListener;
import com.vivo.push.PushClient;

/* JADX INFO: renamed from: com.vivo.push.ups.a */
/* JADX INFO: loaded from: classes2.dex */
final class C14775a implements IPushActionListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ UPSRegisterCallback f61933a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Context f61934b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ VUpsManager f61935c;

    public C14775a(VUpsManager vUpsManager, UPSRegisterCallback uPSRegisterCallback, Context context) {
        this.f61935c = vUpsManager;
        this.f61933a = uPSRegisterCallback;
        this.f61934b = context;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i) {
        this.f61933a.onResult(new TokenResult(i, PushClient.getInstance(this.f61934b).getRegId()));
    }
}
