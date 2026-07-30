package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Map;
import p153l.kzq;
import p153l.tgj0;
import p153l.u560;
import p153l.vn80;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.k */
/* JADX INFO: loaded from: classes.dex */
class C1084k implements kzq {

    /* JADX INFO: renamed from: b */
    private final Object f4539b;

    /* JADX INFO: renamed from: c */
    private final int f4540c;

    /* JADX INFO: renamed from: d */
    private final int f4541d;

    /* JADX INFO: renamed from: e */
    private final Class<?> f4542e;

    /* JADX INFO: renamed from: f */
    private final Class<?> f4543f;

    /* JADX INFO: renamed from: g */
    private final kzq f4544g;

    /* JADX INFO: renamed from: h */
    private final Map<Class<?>, tgj0<?>> f4545h;

    /* JADX INFO: renamed from: i */
    private final u560 f4546i;

    /* JADX INFO: renamed from: j */
    private int f4547j;

    public C1084k(Object obj, kzq kzqVar, int i, int i2, Map<Class<?>, tgj0<?>> map, Class<?> cls, Class<?> cls2, u560 u560Var) {
        this.f4539b = vn80.m201944d(obj);
        this.f4544g = (kzq) vn80.m201945e(kzqVar, "Signature must not be null");
        this.f4540c = i;
        this.f4541d = i2;
        this.f4545h = (Map) vn80.m201944d(map);
        this.f4542e = (Class) vn80.m201945e(cls, "Resource class must not be null");
        this.f4543f = (Class) vn80.m201945e(cls2, "Transcode class must not be null");
        this.f4546i = (u560) vn80.m201944d(u560Var);
    }

    @Override // p153l.kzq
    /* JADX INFO: renamed from: a */
    public void mo5434a(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p153l.kzq
    public boolean equals(Object obj) {
        if (obj instanceof C1084k) {
            C1084k c1084k = (C1084k) obj;
            if (this.f4539b.equals(c1084k.f4539b) && this.f4544g.equals(c1084k.f4544g) && this.f4541d == c1084k.f4541d && this.f4540c == c1084k.f4540c && this.f4545h.equals(c1084k.f4545h) && this.f4542e.equals(c1084k.f4542e) && this.f4543f.equals(c1084k.f4543f) && this.f4546i.equals(c1084k.f4546i)) {
                return true;
            }
        }
        return false;
    }

    @Override // p153l.kzq
    public int hashCode() {
        if (this.f4547j == 0) {
            int iHashCode = this.f4539b.hashCode();
            this.f4547j = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f4544g.hashCode()) * 31) + this.f4540c) * 31) + this.f4541d;
            this.f4547j = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f4545h.hashCode();
            this.f4547j = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f4542e.hashCode();
            this.f4547j = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f4543f.hashCode();
            this.f4547j = iHashCode5;
            this.f4547j = (iHashCode5 * 31) + this.f4546i.hashCode();
        }
        return this.f4547j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f4539b + ", width=" + this.f4540c + ", height=" + this.f4541d + ", resourceClass=" + this.f4542e + ", transcodeClass=" + this.f4543f + ", signature=" + this.f4544g + ", hashCode=" + this.f4547j + ", transformations=" + this.f4545h + ", options=" + this.f4546i + '}';
    }
}
