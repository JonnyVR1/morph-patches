package com.vivo.push.p113d;

import com.vivo.push.AbstractRunnableC14616l;
import java.util.List;

/* JADX INFO: renamed from: com.vivo.push.d.ac */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14576ac implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f60974a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ List f60975b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ List f60976c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ String f60977d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C14574aa f60978e;

    public RunnableC14576ac(C14574aa c14574aa, int i, List list, List list2, String str) {
        this.f60978e = c14574aa;
        this.f60974a = i;
        this.f60975b = list;
        this.f60976c = list2;
        this.f60977d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14574aa c14574aa = this.f60978e;
        ((AbstractC14607z) c14574aa).f61011b.onSetAlias(((AbstractRunnableC14616l) c14574aa).f61052a, this.f60974a, this.f60975b, this.f60976c, this.f60977d);
    }
}
