package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Map;
import p149l.kxq;
import p149l.p7j0;
import p149l.px50;
import p149l.qf80;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.k */
/* JADX INFO: loaded from: classes.dex */
class C1074k implements kxq {

    /* JADX INFO: renamed from: b */
    private final Object f4527b;

    /* JADX INFO: renamed from: c */
    private final int f4528c;

    /* JADX INFO: renamed from: d */
    private final int f4529d;

    /* JADX INFO: renamed from: e */
    private final Class<?> f4530e;

    /* JADX INFO: renamed from: f */
    private final Class<?> f4531f;

    /* JADX INFO: renamed from: g */
    private final kxq f4532g;

    /* JADX INFO: renamed from: h */
    private final Map<Class<?>, p7j0<?>> f4533h;

    /* JADX INFO: renamed from: i */
    private final px50 f4534i;

    /* JADX INFO: renamed from: j */
    private int f4535j;

    public C1074k(Object obj, kxq kxqVar, int i, int i2, Map<Class<?>, p7j0<?>> map, Class<?> cls, Class<?> cls2, px50 px50Var) {
        this.f4527b = qf80.m174276d(obj);
        this.f4532g = (kxq) qf80.m174277e(kxqVar, "Signature must not be null");
        this.f4528c = i;
        this.f4529d = i2;
        this.f4533h = (Map) qf80.m174276d(map);
        this.f4530e = (Class) qf80.m174277e(cls, "Resource class must not be null");
        this.f4531f = (Class) qf80.m174277e(cls2, "Transcode class must not be null");
        this.f4534i = (px50) qf80.m174276d(px50Var);
    }

    @Override // p149l.kxq
    /* JADX INFO: renamed from: a */
    public void mo5409a(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p149l.kxq
    public boolean equals(Object obj) {
        if (obj instanceof C1074k) {
            C1074k c1074k = (C1074k) obj;
            if (this.f4527b.equals(c1074k.f4527b) && this.f4532g.equals(c1074k.f4532g) && this.f4529d == c1074k.f4529d && this.f4528c == c1074k.f4528c && this.f4533h.equals(c1074k.f4533h) && this.f4530e.equals(c1074k.f4530e) && this.f4531f.equals(c1074k.f4531f) && this.f4534i.equals(c1074k.f4534i)) {
                return true;
            }
        }
        return false;
    }

    @Override // p149l.kxq
    public int hashCode() {
        if (this.f4535j == 0) {
            int iHashCode = this.f4527b.hashCode();
            this.f4535j = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f4532g.hashCode()) * 31) + this.f4528c) * 31) + this.f4529d;
            this.f4535j = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f4533h.hashCode();
            this.f4535j = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f4530e.hashCode();
            this.f4535j = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f4531f.hashCode();
            this.f4535j = iHashCode5;
            this.f4535j = (iHashCode5 * 31) + this.f4534i.hashCode();
        }
        return this.f4535j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f4527b + ", width=" + this.f4528c + ", height=" + this.f4529d + ", resourceClass=" + this.f4530e + ", transcodeClass=" + this.f4531f + ", signature=" + this.f4532g + ", hashCode=" + this.f4535j + ", transformations=" + this.f4533h + ", options=" + this.f4534i + '}';
    }
}
