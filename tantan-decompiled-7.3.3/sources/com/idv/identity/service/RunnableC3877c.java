package com.idv.identity.service;

import com.idv.identity.base.algorithm.IdentityFaceAttr;
import java.util.Iterator;
import p153l.gfm;

/* JADX INFO: renamed from: com.idv.identity.service.c */
/* JADX INFO: loaded from: classes7.dex */
public final class RunnableC3877c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13568a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IdentityFaceAttr f13569b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ IdentityFaceService f13570c;

    public RunnableC3877c(IdentityFaceService identityFaceService, int i, IdentityFaceAttr identityFaceAttr) {
        this.f13570c = identityFaceService;
        this.f13568a = i;
        this.f13569b = identityFaceAttr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator<gfm> it = this.f13570c.identityFaceCallbacks.iterator();
        while (it.hasNext()) {
            it.next().mo130091k(this.f13568a, this.f13569b);
        }
    }
}
