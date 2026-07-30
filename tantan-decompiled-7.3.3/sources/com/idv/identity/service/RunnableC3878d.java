package com.idv.identity.service;

import java.util.Iterator;
import java.util.Map;
import p153l.gfm;

/* JADX INFO: renamed from: com.idv.identity.service.d */
/* JADX INFO: loaded from: classes7.dex */
public final class RunnableC3878d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13571a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Map f13572b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ IdentityFaceService f13573c;

    public RunnableC3878d(IdentityFaceService identityFaceService, int i, Map map) {
        this.f13573c = identityFaceService;
        this.f13571a = i;
        this.f13572b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator<gfm> it = this.f13573c.identityFaceCallbacks.iterator();
        while (it.hasNext()) {
            it.next().mo130087g(this.f13571a, this.f13572b);
        }
    }
}
