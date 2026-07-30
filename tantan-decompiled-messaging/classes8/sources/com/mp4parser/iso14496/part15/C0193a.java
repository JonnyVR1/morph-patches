package com.mp4parser.iso14496.part15;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import l.bzp;
import l.yyp;

/* JADX INFO: renamed from: com.mp4parser.iso14496.part15.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class C0193a {

    /* JADX INFO: renamed from: A */
    boolean f477A;

    /* JADX INFO: renamed from: a */
    int f478a;

    /* JADX INFO: renamed from: b */
    int f479b;

    /* JADX INFO: renamed from: c */
    boolean f480c;

    /* JADX INFO: renamed from: d */
    int f481d;

    /* JADX INFO: renamed from: e */
    long f482e;

    /* JADX INFO: renamed from: f */
    long f483f;

    /* JADX INFO: renamed from: g */
    int f484g;

    /* JADX INFO: renamed from: i */
    int f486i;

    /* JADX INFO: renamed from: k */
    int f488k;

    /* JADX INFO: renamed from: m */
    int f490m;

    /* JADX INFO: renamed from: o */
    int f492o;

    /* JADX INFO: renamed from: q */
    int f494q;

    /* JADX INFO: renamed from: r */
    int f495r;

    /* JADX INFO: renamed from: s */
    int f496s;

    /* JADX INFO: renamed from: t */
    int f497t;

    /* JADX INFO: renamed from: u */
    boolean f498u;

    /* JADX INFO: renamed from: v */
    int f499v;

    /* JADX INFO: renamed from: x */
    boolean f501x;

    /* JADX INFO: renamed from: y */
    boolean f502y;

    /* JADX INFO: renamed from: z */
    boolean f503z;

    /* JADX INFO: renamed from: h */
    int f485h = 15;

    /* JADX INFO: renamed from: j */
    int f487j = 63;

    /* JADX INFO: renamed from: l */
    int f489l = 63;

    /* JADX INFO: renamed from: n */
    int f491n = 31;

    /* JADX INFO: renamed from: p */
    int f493p = 31;

    /* JADX INFO: renamed from: w */
    List<a> f500w = new ArrayList();

    /* JADX INFO: renamed from: com.mp4parser.iso14496.part15.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public boolean f504a;

        /* JADX INFO: renamed from: b */
        public boolean f505b;

        /* JADX INFO: renamed from: c */
        public int f506c;

        /* JADX INFO: renamed from: d */
        public List<byte[]> f507d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f504a != aVar.f504a || this.f506c != aVar.f506c || this.f505b != aVar.f505b) {
                    return false;
                }
                ListIterator<byte[]> listIterator = this.f507d.listIterator();
                ListIterator<byte[]> listIterator2 = aVar.f507d.listIterator();
                while (listIterator.hasNext() && listIterator2.hasNext()) {
                    byte[] next = listIterator.next();
                    byte[] next2 = listIterator2.next();
                    if (next == null) {
                        if (next2 != null) {
                            return false;
                        }
                    } else if (!Arrays.equals(next, next2)) {
                        return false;
                    }
                }
                if (!listIterator.hasNext() && !listIterator2.hasNext()) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i = (((((this.f504a ? 1 : 0) * 31) + (this.f505b ? 1 : 0)) * 31) + this.f506c) * 31;
            List<byte[]> list = this.f507d;
            return i + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Array{nal_unit_type=" + this.f506c + ", reserved=" + this.f505b + ", array_completeness=" + this.f504a + ", num_nals=" + this.f507d.size() + '}';
        }
    }

    /* JADX INFO: renamed from: a */
    public int m627a() {
        Iterator<a> it = this.f500w.iterator();
        int length = 23;
        while (it.hasNext()) {
            length += 3;
            Iterator<byte[]> it2 = it.next().f507d.iterator();
            while (it2.hasNext()) {
                length = length + 2 + it2.next().length;
            }
        }
        return length;
    }

    /* JADX INFO: renamed from: b */
    public void m628b(ByteBuffer byteBuffer) {
        this.f478a = yyp.n(byteBuffer);
        int iN = yyp.n(byteBuffer);
        this.f479b = (iN & 192) >> 6;
        this.f480c = (iN & 32) > 0;
        this.f481d = iN & 31;
        this.f482e = yyp.k(byteBuffer);
        long jL = yyp.l(byteBuffer);
        this.f483f = jL;
        this.f501x = ((jL >> 44) & 8) > 0;
        this.f502y = ((jL >> 44) & 4) > 0;
        this.f503z = ((jL >> 44) & 2) > 0;
        this.f477A = ((jL >> 44) & 1) > 0;
        this.f483f = jL & 140737488355327L;
        this.f484g = yyp.n(byteBuffer);
        int i = yyp.i(byteBuffer);
        this.f485h = (61440 & i) >> 12;
        this.f486i = i & 4095;
        int iN2 = yyp.n(byteBuffer);
        this.f487j = (iN2 & 252) >> 2;
        this.f488k = iN2 & 3;
        int iN3 = yyp.n(byteBuffer);
        this.f489l = (iN3 & 252) >> 2;
        this.f490m = iN3 & 3;
        int iN4 = yyp.n(byteBuffer);
        this.f491n = (iN4 & 248) >> 3;
        this.f492o = iN4 & 7;
        int iN5 = yyp.n(byteBuffer);
        this.f493p = (iN5 & 248) >> 3;
        this.f494q = iN5 & 7;
        this.f495r = yyp.i(byteBuffer);
        int iN6 = yyp.n(byteBuffer);
        this.f496s = (iN6 & 192) >> 6;
        this.f497t = (iN6 & 56) >> 3;
        this.f498u = (iN6 & 4) > 0;
        this.f499v = iN6 & 3;
        int iN7 = yyp.n(byteBuffer);
        this.f500w = new ArrayList();
        for (int i2 = 0; i2 < iN7; i2++) {
            a aVar = new a();
            int iN8 = yyp.n(byteBuffer);
            aVar.f504a = (iN8 & 128) > 0;
            aVar.f505b = (iN8 & 64) > 0;
            aVar.f506c = iN8 & 63;
            int i3 = yyp.i(byteBuffer);
            aVar.f507d = new ArrayList();
            for (int i4 = 0; i4 < i3; i4++) {
                byte[] bArr = new byte[yyp.i(byteBuffer)];
                byteBuffer.get(bArr);
                aVar.f507d.add(bArr);
            }
            this.f500w.add(aVar);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m629c(ByteBuffer byteBuffer) {
        bzp.j(byteBuffer, this.f478a);
        bzp.j(byteBuffer, (this.f479b << 6) + (this.f480c ? 32 : 0) + this.f481d);
        bzp.g(byteBuffer, this.f482e);
        long j = this.f483f;
        if (this.f501x) {
            j |= 140737488355328L;
        }
        if (this.f502y) {
            j |= 70368744177664L;
        }
        if (this.f503z) {
            j |= 35184372088832L;
        }
        if (this.f477A) {
            j |= 17592186044416L;
        }
        bzp.h(byteBuffer, j);
        bzp.j(byteBuffer, this.f484g);
        bzp.e(byteBuffer, (this.f485h << 12) + this.f486i);
        bzp.j(byteBuffer, (this.f487j << 2) + this.f488k);
        bzp.j(byteBuffer, (this.f489l << 2) + this.f490m);
        bzp.j(byteBuffer, (this.f491n << 3) + this.f492o);
        bzp.j(byteBuffer, (this.f493p << 3) + this.f494q);
        bzp.e(byteBuffer, this.f495r);
        bzp.j(byteBuffer, (this.f496s << 6) + (this.f497t << 3) + (this.f498u ? 4 : 0) + this.f499v);
        bzp.j(byteBuffer, this.f500w.size());
        for (a aVar : this.f500w) {
            bzp.j(byteBuffer, (aVar.f504a ? 128 : 0) + (aVar.f505b ? 64 : 0) + aVar.f506c);
            bzp.e(byteBuffer, aVar.f507d.size());
            for (byte[] bArr : aVar.f507d) {
                bzp.e(byteBuffer, bArr.length);
                byteBuffer.put(bArr);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0193a c0193a = (C0193a) obj;
        if (this.f495r != c0193a.f495r || this.f494q != c0193a.f494q || this.f492o != c0193a.f492o || this.f490m != c0193a.f490m || this.f478a != c0193a.f478a || this.f496s != c0193a.f496s || this.f483f != c0193a.f483f || this.f484g != c0193a.f484g || this.f482e != c0193a.f482e || this.f481d != c0193a.f481d || this.f479b != c0193a.f479b || this.f480c != c0193a.f480c || this.f499v != c0193a.f499v || this.f486i != c0193a.f486i || this.f497t != c0193a.f497t || this.f488k != c0193a.f488k || this.f485h != c0193a.f485h || this.f487j != c0193a.f487j || this.f489l != c0193a.f489l || this.f491n != c0193a.f491n || this.f493p != c0193a.f493p || this.f498u != c0193a.f498u) {
            return false;
        }
        List<a> list = this.f500w;
        List<a> list2 = c0193a.f500w;
        return list == null ? list2 == null : list.equals(list2);
    }

    public int hashCode() {
        int i = ((((((this.f478a * 31) + this.f479b) * 31) + (this.f480c ? 1 : 0)) * 31) + this.f481d) * 31;
        long j = this.f482e;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f483f;
        int i3 = (((((((((((((((((((((((((((((((((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f484g) * 31) + this.f485h) * 31) + this.f486i) * 31) + this.f487j) * 31) + this.f488k) * 31) + this.f489l) * 31) + this.f490m) * 31) + this.f491n) * 31) + this.f492o) * 31) + this.f493p) * 31) + this.f494q) * 31) + this.f495r) * 31) + this.f496s) * 31) + this.f497t) * 31) + (this.f498u ? 1 : 0)) * 31) + this.f499v) * 31;
        List<a> list = this.f500w;
        return i3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder sb = new StringBuilder("HEVCDecoderConfigurationRecord{configurationVersion=");
        sb.append(this.f478a);
        sb.append(", general_profile_space=");
        sb.append(this.f479b);
        sb.append(", general_tier_flag=");
        sb.append(this.f480c);
        sb.append(", general_profile_idc=");
        sb.append(this.f481d);
        sb.append(", general_profile_compatibility_flags=");
        sb.append(this.f482e);
        sb.append(", general_constraint_indicator_flags=");
        sb.append(this.f483f);
        sb.append(", general_level_idc=");
        sb.append(this.f484g);
        String str5 = "";
        if (this.f485h != 15) {
            str = ", reserved1=" + this.f485h;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(", min_spatial_segmentation_idc=");
        sb.append(this.f486i);
        if (this.f487j != 63) {
            str2 = ", reserved2=" + this.f487j;
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append(", parallelismType=");
        sb.append(this.f488k);
        if (this.f489l != 63) {
            str3 = ", reserved3=" + this.f489l;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", chromaFormat=");
        sb.append(this.f490m);
        if (this.f491n != 31) {
            str4 = ", reserved4=" + this.f491n;
        } else {
            str4 = "";
        }
        sb.append(str4);
        sb.append(", bitDepthLumaMinus8=");
        sb.append(this.f492o);
        if (this.f493p != 31) {
            str5 = ", reserved5=" + this.f493p;
        }
        sb.append(str5);
        sb.append(", bitDepthChromaMinus8=");
        sb.append(this.f494q);
        sb.append(", avgFrameRate=");
        sb.append(this.f495r);
        sb.append(", constantFrameRate=");
        sb.append(this.f496s);
        sb.append(", numTemporalLayers=");
        sb.append(this.f497t);
        sb.append(", temporalIdNested=");
        sb.append(this.f498u);
        sb.append(", lengthSizeMinusOne=");
        sb.append(this.f499v);
        sb.append(", arrays=");
        sb.append(this.f500w);
        sb.append('}');
        return sb.toString();
    }
}
