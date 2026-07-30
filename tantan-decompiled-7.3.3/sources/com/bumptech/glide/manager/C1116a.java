package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p153l.fer;
import p153l.ier;
import p153l.ylk0;

/* JADX INFO: renamed from: com.bumptech.glide.manager.a */
/* JADX INFO: loaded from: classes.dex */
class C1116a implements fer {

    /* JADX INFO: renamed from: a */
    private final Set<ier> f4667a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    private boolean f4668b;

    /* JADX INFO: renamed from: c */
    private boolean f4669c;

    @Override // p153l.fer
    /* JADX INFO: renamed from: a */
    public void mo5624a(@NonNull ier ierVar) {
        this.f4667a.remove(ierVar);
    }

    @Override // p153l.fer
    /* JADX INFO: renamed from: b */
    public void mo5625b(@NonNull ier ierVar) {
        this.f4667a.add(ierVar);
        if (this.f4669c) {
            ierVar.onDestroy();
        } else if (this.f4668b) {
            ierVar.onStart();
        } else {
            ierVar.mo5633d();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m5626c() {
        this.f4669c = true;
        Iterator it = ylk0.m216586j(this.f4667a).iterator();
        while (it.hasNext()) {
            ((ier) it.next()).onDestroy();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m5627d() {
        this.f4668b = true;
        Iterator it = ylk0.m216586j(this.f4667a).iterator();
        while (it.hasNext()) {
            ((ier) it.next()).onStart();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m5628e() {
        this.f4668b = false;
        Iterator it = ylk0.m216586j(this.f4667a).iterator();
        while (it.hasNext()) {
            ((ier) it.next()).mo5633d();
        }
    }
}
