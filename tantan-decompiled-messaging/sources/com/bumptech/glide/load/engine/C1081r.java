package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p149l.h01;
import p149l.kxq;
import p149l.p7j0;
import p149l.px50;
import p149l.sck0;
import p149l.yew;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.r */
/* JADX INFO: loaded from: classes.dex */
final class C1081r implements kxq {

    /* JADX INFO: renamed from: j */
    private static final yew<Class<?>, byte[]> f4564j = new yew<>(50);

    /* JADX INFO: renamed from: b */
    private final h01 f4565b;

    /* JADX INFO: renamed from: c */
    private final kxq f4566c;

    /* JADX INFO: renamed from: d */
    private final kxq f4567d;

    /* JADX INFO: renamed from: e */
    private final int f4568e;

    /* JADX INFO: renamed from: f */
    private final int f4569f;

    /* JADX INFO: renamed from: g */
    private final Class<?> f4570g;

    /* JADX INFO: renamed from: h */
    private final px50 f4571h;

    /* JADX INFO: renamed from: i */
    private final p7j0<?> f4572i;

    public C1081r(h01 h01Var, kxq kxqVar, kxq kxqVar2, int i, int i2, p7j0<?> p7j0Var, Class<?> cls, px50 px50Var) {
        this.f4565b = h01Var;
        this.f4566c = kxqVar;
        this.f4567d = kxqVar2;
        this.f4568e = i;
        this.f4569f = i2;
        this.f4572i = p7j0Var;
        this.f4570g = cls;
        this.f4571h = px50Var;
    }

    /* JADX INFO: renamed from: c */
    private byte[] m5492c() {
        yew<Class<?>, byte[]> yewVar = f4564j;
        byte[] bArrM214441g = yewVar.m214441g(this.f4570g);
        if (bArrM214441g != null) {
            return bArrM214441g;
        }
        byte[] bytes = this.f4570g.getName().getBytes(kxq.f125153a);
        yewVar.m214443k(this.f4570g, bytes);
        return bytes;
    }

    @Override // p149l.kxq
    /* JADX INFO: renamed from: a */
    public void mo5409a(@NonNull MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f4565b.mo128943d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f4568e).putInt(this.f4569f).array();
        this.f4567d.mo5409a(messageDigest);
        this.f4566c.mo5409a(messageDigest);
        messageDigest.update(bArr);
        p7j0<?> p7j0Var = this.f4572i;
        if (p7j0Var != null) {
            p7j0Var.mo5409a(messageDigest);
        }
        this.f4571h.mo5409a(messageDigest);
        messageDigest.update(m5492c());
        this.f4565b.put(bArr);
    }

    @Override // p149l.kxq
    public boolean equals(Object obj) {
        if (obj instanceof C1081r) {
            C1081r c1081r = (C1081r) obj;
            if (this.f4569f == c1081r.f4569f && this.f4568e == c1081r.f4568e && sck0.m183404d(this.f4572i, c1081r.f4572i) && this.f4570g.equals(c1081r.f4570g) && this.f4566c.equals(c1081r.f4566c) && this.f4567d.equals(c1081r.f4567d) && this.f4571h.equals(c1081r.f4571h)) {
                return true;
            }
        }
        return false;
    }

    @Override // p149l.kxq
    public int hashCode() {
        int iHashCode = (((((this.f4566c.hashCode() * 31) + this.f4567d.hashCode()) * 31) + this.f4568e) * 31) + this.f4569f;
        p7j0<?> p7j0Var = this.f4572i;
        if (p7j0Var != null) {
            iHashCode = (iHashCode * 31) + p7j0Var.hashCode();
        }
        return (((iHashCode * 31) + this.f4570g.hashCode()) * 31) + this.f4571h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f4566c + ", signature=" + this.f4567d + ", width=" + this.f4568e + ", height=" + this.f4569f + ", decodedResourceClass=" + this.f4570g + ", transformation='" + this.f4572i + "', options=" + this.f4571h + '}';
    }
}
