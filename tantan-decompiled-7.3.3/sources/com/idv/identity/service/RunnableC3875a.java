package com.idv.identity.service;

import java.util.Iterator;
import p153l.gfm;

/* JADX INFO: renamed from: com.idv.identity.service.a */
/* JADX INFO: loaded from: classes7.dex */
public final class RunnableC3875a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13564a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IdentityFaceService f13565b;

    public RunnableC3875a(IdentityFaceService identityFaceService, int i) {
        this.f13565b = identityFaceService;
        this.f13564a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator<gfm> it = this.f13565b.identityFaceCallbacks.iterator();
        while (it.hasNext()) {
            it.next().mo130086f(this.f13564a);
        }
    }
}
