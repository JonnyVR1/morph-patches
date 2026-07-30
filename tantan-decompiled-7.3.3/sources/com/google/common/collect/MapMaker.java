package com.google.common.collect;

import com.google.common.base.C2677a;
import com.google.common.base.Equivalence;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p153l.i11;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class MapMaker {

    /* JADX INFO: renamed from: a */
    public boolean f11048a;

    /* JADX INFO: renamed from: b */
    public int f11049b = -1;

    /* JADX INFO: renamed from: c */
    public int f11050c = -1;

    /* JADX INFO: renamed from: d */
    public MapMakerInternalMap.Strength f11051d;

    /* JADX INFO: renamed from: e */
    public MapMakerInternalMap.Strength f11052e;

    /* JADX INFO: renamed from: f */
    public Equivalence<Object> f11053f;

    public enum Dummy {
        VALUE
    }

    /* JADX INFO: renamed from: a */
    public MapMaker m15991a(int i) {
        int i2 = this.f11050c;
        xn80.m212119x(i2 == -1, "concurrency level was already set to %s", i2);
        xn80.m212099d(i > 0);
        this.f11050c = i;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public int m15992b() {
        int i = this.f11050c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public int m15993c() {
        int i = this.f11049b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    /* JADX INFO: renamed from: d */
    public Equivalence<Object> m15994d() {
        return (Equivalence) C2677a.m15480a(this.f11053f, m15995e().defaultEquivalence());
    }

    /* JADX INFO: renamed from: e */
    public MapMakerInternalMap.Strength m15995e() {
        return (MapMakerInternalMap.Strength) C2677a.m15480a(this.f11051d, MapMakerInternalMap.Strength.STRONG);
    }

    /* JADX INFO: renamed from: f */
    public MapMakerInternalMap.Strength m15996f() {
        return (MapMakerInternalMap.Strength) C2677a.m15480a(this.f11052e, MapMakerInternalMap.Strength.STRONG);
    }

    /* JADX INFO: renamed from: g */
    public MapMaker m15997g(int i) {
        int i2 = this.f11049b;
        xn80.m212119x(i2 == -1, "initial capacity was already set to %s", i2);
        xn80.m212099d(i >= 0);
        this.f11049b = i;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public MapMaker m15998h(Equivalence<Object> equivalence) {
        Equivalence<Object> equivalence2 = this.f11053f;
        xn80.m212121z(equivalence2 == null, "key equivalence was already set to %s", equivalence2);
        this.f11053f = (Equivalence) xn80.m212111p(equivalence);
        this.f11048a = true;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public <K, V> ConcurrentMap<K, V> m15999i() {
        return !this.f11048a ? new ConcurrentHashMap(m15993c(), 0.75f, m15992b()) : MapMakerInternalMap.create(this);
    }

    /* JADX INFO: renamed from: j */
    public MapMaker m16000j(MapMakerInternalMap.Strength strength) {
        MapMakerInternalMap.Strength strength2 = this.f11051d;
        xn80.m212121z(strength2 == null, "Key strength was already set to %s", strength2);
        this.f11051d = (MapMakerInternalMap.Strength) xn80.m212111p(strength);
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.f11048a = true;
        }
        return this;
    }

    /* JADX INFO: renamed from: k */
    public MapMaker m16001k(MapMakerInternalMap.Strength strength) {
        MapMakerInternalMap.Strength strength2 = this.f11052e;
        xn80.m212121z(strength2 == null, "Value strength was already set to %s", strength2);
        this.f11052e = (MapMakerInternalMap.Strength) xn80.m212111p(strength);
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.f11048a = true;
        }
        return this;
    }

    /* JADX INFO: renamed from: l */
    public MapMaker m16002l() {
        return m16000j(MapMakerInternalMap.Strength.WEAK);
    }

    public String toString() {
        C2677a.b bVarM15481b = C2677a.m15481b(this);
        int i = this.f11049b;
        if (i != -1) {
            bVarM15481b.m15484b("initialCapacity", i);
        }
        int i2 = this.f11050c;
        if (i2 != -1) {
            bVarM15481b.m15484b("concurrencyLevel", i2);
        }
        MapMakerInternalMap.Strength strength = this.f11051d;
        if (strength != null) {
            bVarM15481b.m15486d("keyStrength", i11.m138051e(strength.toString()));
        }
        MapMakerInternalMap.Strength strength2 = this.f11052e;
        if (strength2 != null) {
            bVarM15481b.m15486d("valueStrength", i11.m138051e(strength2.toString()));
        }
        if (this.f11053f != null) {
            bVarM15481b.m15492j("keyEquivalence");
        }
        return bVarM15481b.toString();
    }
}
