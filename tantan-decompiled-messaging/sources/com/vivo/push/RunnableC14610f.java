package com.vivo.push;

import android.text.TextUtils;
import com.vivo.push.util.C14657z;

/* JADX INFO: renamed from: com.vivo.push.f */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14610f implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f61039a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C14608e f61040b;

    public RunnableC14610f(C14608e c14608e, String str) {
        this.f61040b = c14608e;
        this.f61039a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f61040b.f61019h == null || TextUtils.isEmpty(this.f61039a) || !C14657z.m85064b(this.f61040b.f61019h, this.f61040b.f61019h.getPackageName(), this.f61039a)) {
            return;
        }
        this.f61040b.m84899i();
    }
}
