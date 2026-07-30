package com.vivo.push;

import android.text.TextUtils;
import com.vivo.push.util.C14805z;

/* JADX INFO: renamed from: com.vivo.push.f */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14758f implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f61886a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C14756e f61887b;

    public RunnableC14758f(C14756e c14756e, String str) {
        this.f61887b = c14756e;
        this.f61886a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f61887b.f61866h == null || TextUtils.isEmpty(this.f61886a) || !C14805z.m86235b(this.f61887b.f61866h, this.f61887b.f61866h.getPackageName(), this.f61886a)) {
            return;
        }
        this.f61887b.m86070i();
    }
}
