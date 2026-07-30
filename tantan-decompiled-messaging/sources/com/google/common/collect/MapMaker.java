package com.google.common.collect;

import com.google.common.base.C2654a;
import com.google.common.base.Equivalence;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p149l.b11;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
public final class MapMaker {

    /* JADX INFO: renamed from: a */
    public boolean f11011a;

    /* JADX INFO: renamed from: b */
    public int f11012b = -1;

    /* JADX INFO: renamed from: c */
    public int f11013c = -1;

    /* JADX INFO: renamed from: d */
    public MapMakerInternalMap.Strength f11014d;

    /* JADX INFO: renamed from: e */
    public MapMakerInternalMap.Strength f11015e;

    /* JADX INFO: renamed from: f */
    public Equivalence<Object> f11016f;

    public enum Dummy {
        VALUE
    }

    /* JADX INFO: renamed from: a */
    public MapMaker m15937a(int i) {
        int i2 = this.f11013c;
        sf80.m183902x(i2 == -1, "concurrency level was already set to %s", i2);
        sf80.m183882d(i > 0);
        this.f11013c = i;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public int m15938b() {
        int i = this.f11013c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public int m15939c() {
        int i = this.f11012b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    /* JADX INFO: renamed from: d */
    public Equivalence<Object> m15940d() {
        return (Equivalence) C2654a.m15426a(this.f11016f, m15941e().defaultEquivalence());
    }

    /* JADX INFO: renamed from: e */
    public MapMakerInternalMap.Strength m15941e() {
        return (MapMakerInternalMap.Strength) C2654a.m15426a(this.f11014d, MapMakerInternalMap.Strength.STRONG);
    }

    /* JADX INFO: renamed from: f */
    public MapMakerInternalMap.Strength m15942f() {
        return (MapMakerInternalMap.Strength) C2654a.m15426a(this.f11015e, MapMakerInternalMap.Strength.STRONG);
    }

    /* JADX INFO: renamed from: g */
    public MapMaker m15943g(int i) {
        int i2 = this.f11012b;
        sf80.m183902x(i2 == -1, "initial capacity was already set to %s", i2);
        sf80.m183882d(i >= 0);
        this.f11012b = i;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public MapMaker m15944h(Equivalence<Object> equivalence) {
        Equivalence<Object> equivalence2 = this.f11016f;
        sf80.m183904z(equivalence2 == null, "key equivalence was already set to %s", equivalence2);
        this.f11016f = (Equivalence) sf80.m183894p(equivalence);
        this.f11011a = true;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public <K, V> ConcurrentMap<K, V> m15945i() {
        return !this.f11011a ? new ConcurrentHashMap(m15939c(), 0.75f, m15938b()) : MapMakerInternalMap.create(this);
    }

    /* JADX INFO: renamed from: j */
    public MapMaker m15946j(MapMakerInternalMap.Strength strength) {
        MapMakerInternalMap.Strength strength2 = this.f11014d;
        sf80.m183904z(strength2 == null, "Key strength was already set to %s", strength2);
        this.f11014d = (MapMakerInternalMap.Strength) sf80.m183894p(strength);
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.f11011a = true;
        }
        return this;
    }

    /* JADX INFO: renamed from: k */
    public MapMaker m15947k(MapMakerInternalMap.Strength strength) {
        MapMakerInternalMap.Strength strength2 = this.f11015e;
        sf80.m183904z(strength2 == null, "Value strength was already set to %s", strength2);
        this.f11015e = (MapMakerInternalMap.Strength) sf80.m183894p(strength);
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.f11011a = true;
        }
        return this;
    }

    /* JADX INFO: renamed from: l */
    public MapMaker m15948l() {
        return m15946j(MapMakerInternalMap.Strength.WEAK);
    }

    public String toString() {
        C2654a.b bVarM15427b = C2654a.m15427b(this);
        int i = this.f11012b;
        if (i != -1) {
            bVarM15427b.m15430b("initialCapacity", i);
        }
        int i2 = this.f11013c;
        if (i2 != -1) {
            bVarM15427b.m15430b("concurrencyLevel", i2);
        }
        MapMakerInternalMap.Strength strength = this.f11014d;
        if (strength != null) {
            bVarM15427b.m15432d("keyStrength", b11.m99804e(strength.toString()));
        }
        MapMakerInternalMap.Strength strength2 = this.f11015e;
        if (strength2 != null) {
            bVarM15427b.m15432d("valueStrength", b11.m99804e(strength2.toString()));
        }
        if (this.f11016f != null) {
            bVarM15427b.m15438j("keyEquivalence");
        }
        return bVarM15427b.toString();
    }
}
