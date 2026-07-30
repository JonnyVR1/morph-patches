package com.google.protobuf;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p149l.iwm;
import p149l.jwm;
import p149l.x9g0;

/* JADX INFO: renamed from: com.google.protobuf.k */
/* JADX INFO: loaded from: classes7.dex */
public final class C3413k extends AbstractC3405c<Integer> implements C3414l.f, RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final C3413k f11603d;

    /* JADX INFO: renamed from: b */
    public int[] f11604b;

    /* JADX INFO: renamed from: c */
    public int f11605c;

    static {
        C3413k c3413k = new C3413k();
        f11603d = c3413k;
        c3413k.mo17084n();
    }

    public C3413k() {
        this(new int[10], 0);
    }

    /* JADX INFO: renamed from: g */
    public static C3413k m17197g() {
        return f11603d;
    }

    /* JADX INFO: renamed from: h */
    private void m17198h(int i) {
        if (i < 0 || i >= this.f11605c) {
            jwm.m143661a(m17199j(i));
        }
    }

    /* JADX INFO: renamed from: j */
    private String m17199j(int i) {
        return "Index:" + i + ", Size:" + this.f11605c;
    }

    @Override // com.google.protobuf.C3414l.f
    /* JADX INFO: renamed from: T */
    public void mo17200T(int i) {
        m17202f(this.f11605c, i);
    }

    @Override // com.google.protobuf.AbstractC3405c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        m17083a();
        collection.getClass();
        if (!(collection instanceof C3413k)) {
            return super.addAll(collection);
        }
        C3413k c3413k = (C3413k) collection;
        int i = c3413k.f11605c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11605c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            iwm.m138755a();
            return false;
        }
        int i3 = i2 + i;
        int[] iArr = this.f11604b;
        if (i3 > iArr.length) {
            this.f11604b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c3413k.f11604b, 0, this.f11604b, this.f11605c, c3413k.f11605c);
        this.f11605c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i, Integer num) {
        m17202f(i, num.intValue());
    }

    @Override // com.google.protobuf.C3414l.h, com.google.protobuf.C3414l.a
    /* JADX INFO: renamed from: d */
    public C3414l.h<Integer> mo17088d(int i) {
        if (i >= this.f11605c) {
            return new C3413k(Arrays.copyOf(this.f11604b, i), this.f11605c);
        }
        x9g0.m207497a();
        return null;
    }

    @Override // com.google.protobuf.AbstractC3405c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3413k)) {
            return super.equals(obj);
        }
        C3413k c3413k = (C3413k) obj;
        if (this.f11605c != c3413k.f11605c) {
            return false;
        }
        int[] iArr = c3413k.f11604b;
        for (int i = 0; i < this.f11605c; i++) {
            if (this.f11604b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m17202f(int i, int i2) {
        int i3;
        m17083a();
        if (i < 0 || i > (i3 = this.f11605c)) {
            jwm.m143661a(m17199j(i));
            return;
        }
        int[] iArr = this.f11604b;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f11604b, i, iArr2, i + 1, this.f11605c - i);
            this.f11604b = iArr2;
        }
        this.f11604b[i] = i2;
        this.f11605c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.C3414l.f
    public int getInt(int i) {
        m17198h(i);
        return this.f11604b[i];
    }

    @Override // com.google.protobuf.AbstractC3405c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f11605c; i2++) {
            i = (i * 31) + this.f11604b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Integer get(int i) {
        return Integer.valueOf(getInt(i));
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i) {
        m17083a();
        m17198h(i);
        int[] iArr = this.f11604b;
        int i2 = iArr[i];
        System.arraycopy(iArr, i + 1, iArr, i, this.f11605c - i);
        this.f11605c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(setInt(i, num.intValue()));
    }

    @Override // com.google.protobuf.AbstractC3405c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m17083a();
        for (int i = 0; i < this.f11605c; i++) {
            if (obj.equals(Integer.valueOf(this.f11604b[i]))) {
                int[] iArr = this.f11604b;
                System.arraycopy(iArr, i + 1, iArr, i, this.f11605c - i);
                this.f11605c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // com.google.protobuf.C3414l.f
    public int setInt(int i, int i2) {
        m17083a();
        m17198h(i);
        int[] iArr = this.f11604b;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11605c;
    }

    public C3413k(int[] iArr, int i) {
        this.f11604b = iArr;
        this.f11605c = i;
    }
}
