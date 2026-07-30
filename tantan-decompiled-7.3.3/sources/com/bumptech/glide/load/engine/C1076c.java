package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p153l.kzq;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.c */
/* JADX INFO: loaded from: classes.dex */
final class C1076c implements kzq {

    /* JADX INFO: renamed from: b */
    private final kzq f4452b;

    /* JADX INFO: renamed from: c */
    private final kzq f4453c;

    public C1076c(kzq kzqVar, kzq kzqVar2) {
        this.f4452b = kzqVar;
        this.f4453c = kzqVar2;
    }

    @Override // p153l.kzq
    /* JADX INFO: renamed from: a */
    public void mo5434a(@NonNull MessageDigest messageDigest) {
        this.f4452b.mo5434a(messageDigest);
        this.f4453c.mo5434a(messageDigest);
    }

    @Override // p153l.kzq
    public boolean equals(Object obj) {
        if (obj instanceof C1076c) {
            C1076c c1076c = (C1076c) obj;
            if (this.f4452b.equals(c1076c.f4452b) && this.f4453c.equals(c1076c.f4453c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p153l.kzq
    public int hashCode() {
        return (this.f4452b.hashCode() * 31) + this.f4453c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f4452b + ", signature=" + this.f4453c + '}';
    }
}
