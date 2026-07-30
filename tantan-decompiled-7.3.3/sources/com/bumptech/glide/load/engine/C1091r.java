package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p153l.kzq;
import p153l.o01;
import p153l.tgj0;
import p153l.u560;
import p153l.wgw;
import p153l.ylk0;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.r */
/* JADX INFO: loaded from: classes.dex */
final class C1091r implements kzq {

    /* JADX INFO: renamed from: j */
    private static final wgw<Class<?>, byte[]> f4576j = new wgw<>(50);

    /* JADX INFO: renamed from: b */
    private final o01 f4577b;

    /* JADX INFO: renamed from: c */
    private final kzq f4578c;

    /* JADX INFO: renamed from: d */
    private final kzq f4579d;

    /* JADX INFO: renamed from: e */
    private final int f4580e;

    /* JADX INFO: renamed from: f */
    private final int f4581f;

    /* JADX INFO: renamed from: g */
    private final Class<?> f4582g;

    /* JADX INFO: renamed from: h */
    private final u560 f4583h;

    /* JADX INFO: renamed from: i */
    private final tgj0<?> f4584i;

    public C1091r(o01 o01Var, kzq kzqVar, kzq kzqVar2, int i, int i2, tgj0<?> tgj0Var, Class<?> cls, u560 u560Var) {
        this.f4577b = o01Var;
        this.f4578c = kzqVar;
        this.f4579d = kzqVar2;
        this.f4580e = i;
        this.f4581f = i2;
        this.f4584i = tgj0Var;
        this.f4582g = cls;
        this.f4583h = u560Var;
    }

    /* JADX INFO: renamed from: c */
    private byte[] m5518c() {
        wgw<Class<?>, byte[]> wgwVar = f4576j;
        byte[] bArrM206267g = wgwVar.m206267g(this.f4582g);
        if (bArrM206267g != null) {
            return bArrM206267g;
        }
        byte[] bytes = this.f4582g.getName().getBytes(kzq.f129442a);
        wgwVar.m206269k(this.f4582g, bytes);
        return bytes;
    }

    @Override // p153l.kzq
    /* JADX INFO: renamed from: a */
    public void mo5434a(@NonNull MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f4577b.mo165412d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f4580e).putInt(this.f4581f).array();
        this.f4579d.mo5434a(messageDigest);
        this.f4578c.mo5434a(messageDigest);
        messageDigest.update(bArr);
        tgj0<?> tgj0Var = this.f4584i;
        if (tgj0Var != null) {
            tgj0Var.mo5434a(messageDigest);
        }
        this.f4583h.mo5434a(messageDigest);
        messageDigest.update(m5518c());
        this.f4577b.put(bArr);
    }

    @Override // p153l.kzq
    public boolean equals(Object obj) {
        if (obj instanceof C1091r) {
            C1091r c1091r = (C1091r) obj;
            if (this.f4581f == c1091r.f4581f && this.f4580e == c1091r.f4580e && ylk0.m216580d(this.f4584i, c1091r.f4584i) && this.f4582g.equals(c1091r.f4582g) && this.f4578c.equals(c1091r.f4578c) && this.f4579d.equals(c1091r.f4579d) && this.f4583h.equals(c1091r.f4583h)) {
                return true;
            }
        }
        return false;
    }

    @Override // p153l.kzq
    public int hashCode() {
        int iHashCode = (((((this.f4578c.hashCode() * 31) + this.f4579d.hashCode()) * 31) + this.f4580e) * 31) + this.f4581f;
        tgj0<?> tgj0Var = this.f4584i;
        if (tgj0Var != null) {
            iHashCode = (iHashCode * 31) + tgj0Var.hashCode();
        }
        return (((iHashCode * 31) + this.f4582g.hashCode()) * 31) + this.f4583h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f4578c + ", signature=" + this.f4579d + ", width=" + this.f4580e + ", height=" + this.f4581f + ", decodedResourceClass=" + this.f4582g + ", transformation='" + this.f4584i + "', options=" + this.f4583h + '}';
    }
}
