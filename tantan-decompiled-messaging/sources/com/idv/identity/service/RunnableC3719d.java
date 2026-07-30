package com.idv.identity.service;

import java.util.Iterator;
import java.util.Map;
import p149l.qcm;

/* JADX INFO: renamed from: com.idv.identity.service.d */
/* JADX INFO: loaded from: classes7.dex */
public final class RunnableC3719d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12830a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Map f12831b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ IdentityFaceService f12832c;

    public RunnableC3719d(IdentityFaceService identityFaceService, int i, Map map) {
        this.f12832c = identityFaceService;
        this.f12830a = i;
        this.f12831b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator<qcm> it = this.f12832c.identityFaceCallbacks.iterator();
        while (it.hasNext()) {
            it.next().mo173886g(this.f12830a, this.f12831b);
        }
    }
}
