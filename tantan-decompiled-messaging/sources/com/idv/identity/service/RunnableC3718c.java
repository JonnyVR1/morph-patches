package com.idv.identity.service;

import com.idv.identity.base.algorithm.IdentityFaceAttr;
import java.util.Iterator;
import p149l.qcm;

/* JADX INFO: renamed from: com.idv.identity.service.c */
/* JADX INFO: loaded from: classes7.dex */
public final class RunnableC3718c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12827a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IdentityFaceAttr f12828b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ IdentityFaceService f12829c;

    public RunnableC3718c(IdentityFaceService identityFaceService, int i, IdentityFaceAttr identityFaceAttr) {
        this.f12829c = identityFaceService;
        this.f12827a = i;
        this.f12828b = identityFaceAttr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator<qcm> it = this.f12829c.identityFaceCallbacks.iterator();
        while (it.hasNext()) {
            it.next().mo173890k(this.f12827a, this.f12828b);
        }
    }
}
