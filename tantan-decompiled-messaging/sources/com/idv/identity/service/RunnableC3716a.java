package com.idv.identity.service;

import java.util.Iterator;
import p149l.qcm;

/* JADX INFO: renamed from: com.idv.identity.service.a */
/* JADX INFO: loaded from: classes7.dex */
public final class RunnableC3716a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12823a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IdentityFaceService f12824b;

    public RunnableC3716a(IdentityFaceService identityFaceService, int i) {
        this.f12824b = identityFaceService;
        this.f12823a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator<qcm> it = this.f12824b.identityFaceCallbacks.iterator();
        while (it.hasNext()) {
            it.next().mo173885f(this.f12823a);
        }
    }
}
