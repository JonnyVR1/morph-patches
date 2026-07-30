package com.vivo.push.p113d;

import android.text.TextUtils;
import com.vivo.push.AbstractRunnableC14616l;
import com.vivo.push.p111b.C14543i;

/* JADX INFO: renamed from: com.vivo.push.d.e */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14586e implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f60981a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C14543i f60982b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C14585d f60983c;

    public RunnableC14586e(C14585d c14585d, String str, C14543i c14543i) {
        this.f60983c = c14585d;
        this.f60981a = str;
        this.f60982b = c14543i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!TextUtils.isEmpty(this.f60981a)) {
            C14585d c14585d = this.f60983c;
            ((AbstractC14607z) c14585d).f61011b.onReceiveRegId(((AbstractRunnableC14616l) c14585d).f61052a, this.f60981a);
        }
        C14585d c14585d2 = this.f60983c;
        ((AbstractC14607z) c14585d2).f61011b.onBind(((AbstractRunnableC14616l) c14585d2).f61052a, this.f60982b.m84775h(), this.f60982b.m84754d());
    }
}
