package com.vivo.push.p118d;

import android.text.TextUtils;
import com.vivo.push.AbstractRunnableC14764l;
import com.vivo.push.p116b.C14691i;

/* JADX INFO: renamed from: com.vivo.push.d.e */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14734e implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f61828a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C14691i f61829b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C14733d f61830c;

    public RunnableC14734e(C14733d c14733d, String str, C14691i c14691i) {
        this.f61830c = c14733d;
        this.f61828a = str;
        this.f61829b = c14691i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!TextUtils.isEmpty(this.f61828a)) {
            C14733d c14733d = this.f61830c;
            ((AbstractC14755z) c14733d).f61858b.onReceiveRegId(((AbstractRunnableC14764l) c14733d).f61899a, this.f61828a);
        }
        C14733d c14733d2 = this.f61830c;
        ((AbstractC14755z) c14733d2).f61858b.onBind(((AbstractRunnableC14764l) c14733d2).f61899a, this.f61829b.m85946h(), this.f61829b.m85925d());
    }
}
