package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p149l.kxq;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.c */
/* JADX INFO: loaded from: classes.dex */
final class C1066c implements kxq {

    /* JADX INFO: renamed from: b */
    private final kxq f4441b;

    /* JADX INFO: renamed from: c */
    private final kxq f4442c;

    public C1066c(kxq kxqVar, kxq kxqVar2) {
        this.f4441b = kxqVar;
        this.f4442c = kxqVar2;
    }

    @Override // p149l.kxq
    /* JADX INFO: renamed from: a */
    public void mo5409a(@NonNull MessageDigest messageDigest) {
        this.f4441b.mo5409a(messageDigest);
        this.f4442c.mo5409a(messageDigest);
    }

    @Override // p149l.kxq
    public boolean equals(Object obj) {
        if (obj instanceof C1066c) {
            C1066c c1066c = (C1066c) obj;
            if (this.f4441b.equals(c1066c.f4441b) && this.f4442c.equals(c1066c.f4442c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p149l.kxq
    public int hashCode() {
        return (this.f4441b.hashCode() * 31) + this.f4442c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f4441b + ", signature=" + this.f4442c + '}';
    }
}
