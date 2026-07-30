package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p149l.ecr;
import p149l.hcr;
import p149l.sck0;

/* JADX INFO: renamed from: com.bumptech.glide.manager.a */
/* JADX INFO: loaded from: classes.dex */
class C1099a implements ecr {

    /* JADX INFO: renamed from: a */
    private final Set<hcr> f4648a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    private boolean f4649b;

    /* JADX INFO: renamed from: c */
    private boolean f4650c;

    @Override // p149l.ecr
    /* JADX INFO: renamed from: a */
    public void mo5586a(@NonNull hcr hcrVar) {
        this.f4648a.remove(hcrVar);
    }

    @Override // p149l.ecr
    /* JADX INFO: renamed from: b */
    public void mo5587b(@NonNull hcr hcrVar) {
        this.f4648a.add(hcrVar);
        if (this.f4650c) {
            hcrVar.onDestroy();
        } else if (this.f4649b) {
            hcrVar.onStart();
        } else {
            hcrVar.mo5559d();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m5588c() {
        this.f4650c = true;
        Iterator it = sck0.m183410j(this.f4648a).iterator();
        while (it.hasNext()) {
            ((hcr) it.next()).onDestroy();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m5589d() {
        this.f4649b = true;
        Iterator it = sck0.m183410j(this.f4648a).iterator();
        while (it.hasNext()) {
            ((hcr) it.next()).onStart();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m5590e() {
        this.f4649b = false;
        Iterator it = sck0.m183410j(this.f4648a).iterator();
        while (it.hasNext()) {
            ((hcr) it.next()).mo5559d();
        }
    }
}
