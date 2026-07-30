package com.mp4parser.iso14496.part15;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.sudcompress.archivers.zip.UnixStat;
import p149l.bzp;
import p149l.yyp;

/* JADX INFO: renamed from: com.mp4parser.iso14496.part15.a */
/* JADX INFO: loaded from: classes8.dex */
public class C4281a {

    /* JADX INFO: renamed from: A */
    boolean f14778A;

    /* JADX INFO: renamed from: a */
    int f14779a;

    /* JADX INFO: renamed from: b */
    int f14780b;

    /* JADX INFO: renamed from: c */
    boolean f14781c;

    /* JADX INFO: renamed from: d */
    int f14782d;

    /* JADX INFO: renamed from: e */
    long f14783e;

    /* JADX INFO: renamed from: f */
    long f14784f;

    /* JADX INFO: renamed from: g */
    int f14785g;

    /* JADX INFO: renamed from: i */
    int f14787i;

    /* JADX INFO: renamed from: k */
    int f14789k;

    /* JADX INFO: renamed from: m */
    int f14791m;

    /* JADX INFO: renamed from: o */
    int f14793o;

    /* JADX INFO: renamed from: q */
    int f14795q;

    /* JADX INFO: renamed from: r */
    int f14796r;

    /* JADX INFO: renamed from: s */
    int f14797s;

    /* JADX INFO: renamed from: t */
    int f14798t;

    /* JADX INFO: renamed from: u */
    boolean f14799u;

    /* JADX INFO: renamed from: v */
    int f14800v;

    /* JADX INFO: renamed from: x */
    boolean f14802x;

    /* JADX INFO: renamed from: y */
    boolean f14803y;

    /* JADX INFO: renamed from: z */
    boolean f14804z;

    /* JADX INFO: renamed from: h */
    int f14786h = 15;

    /* JADX INFO: renamed from: j */
    int f14788j = 63;

    /* JADX INFO: renamed from: l */
    int f14790l = 63;

    /* JADX INFO: renamed from: n */
    int f14792n = 31;

    /* JADX INFO: renamed from: p */
    int f14794p = 31;

    /* JADX INFO: renamed from: w */
    List<a> f14801w = new ArrayList();

    /* JADX INFO: renamed from: com.mp4parser.iso14496.part15.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public boolean f14805a;

        /* JADX INFO: renamed from: b */
        public boolean f14806b;

        /* JADX INFO: renamed from: c */
        public int f14807c;

        /* JADX INFO: renamed from: d */
        public List<byte[]> f14808d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f14805a != aVar.f14805a || this.f14807c != aVar.f14807c || this.f14806b != aVar.f14806b) {
                    return false;
                }
                ListIterator<byte[]> listIterator = this.f14808d.listIterator();
                ListIterator<byte[]> listIterator2 = aVar.f14808d.listIterator();
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
            int i = (((((this.f14805a ? 1 : 0) * 31) + (this.f14806b ? 1 : 0)) * 31) + this.f14807c) * 31;
            List<byte[]> list = this.f14808d;
            return i + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Array{nal_unit_type=" + this.f14807c + ", reserved=" + this.f14806b + ", array_completeness=" + this.f14805a + ", num_nals=" + this.f14808d.size() + '}';
        }
    }

    /* JADX INFO: renamed from: a */
    public int m20356a() {
        Iterator<a> it = this.f14801w.iterator();
        int length = 23;
        while (it.hasNext()) {
            length += 3;
            Iterator<byte[]> it2 = it.next().f14808d.iterator();
            while (it2.hasNext()) {
                length = length + 2 + it2.next().length;
            }
        }
        return length;
    }

    /* JADX INFO: renamed from: b */
    public void m20357b(ByteBuffer byteBuffer) {
        this.f14779a = yyp.m216561n(byteBuffer);
        int iM216561n = yyp.m216561n(byteBuffer);
        this.f14780b = (iM216561n & 192) >> 6;
        this.f14781c = (iM216561n & 32) > 0;
        this.f14782d = iM216561n & 31;
        this.f14783e = yyp.m216558k(byteBuffer);
        long jM216559l = yyp.m216559l(byteBuffer);
        this.f14784f = jM216559l;
        this.f14802x = ((jM216559l >> 44) & 8) > 0;
        this.f14803y = ((jM216559l >> 44) & 4) > 0;
        this.f14804z = ((jM216559l >> 44) & 2) > 0;
        this.f14778A = ((jM216559l >> 44) & 1) > 0;
        this.f14784f = jM216559l & 140737488355327L;
        this.f14785g = yyp.m216561n(byteBuffer);
        int iM216556i = yyp.m216556i(byteBuffer);
        this.f14786h = (61440 & iM216556i) >> 12;
        this.f14787i = iM216556i & UnixStat.PERM_MASK;
        int iM216561n2 = yyp.m216561n(byteBuffer);
        this.f14788j = (iM216561n2 & 252) >> 2;
        this.f14789k = iM216561n2 & 3;
        int iM216561n3 = yyp.m216561n(byteBuffer);
        this.f14790l = (iM216561n3 & 252) >> 2;
        this.f14791m = iM216561n3 & 3;
        int iM216561n4 = yyp.m216561n(byteBuffer);
        this.f14792n = (iM216561n4 & 248) >> 3;
        this.f14793o = iM216561n4 & 7;
        int iM216561n5 = yyp.m216561n(byteBuffer);
        this.f14794p = (iM216561n5 & 248) >> 3;
        this.f14795q = iM216561n5 & 7;
        this.f14796r = yyp.m216556i(byteBuffer);
        int iM216561n6 = yyp.m216561n(byteBuffer);
        this.f14797s = (iM216561n6 & 192) >> 6;
        this.f14798t = (iM216561n6 & 56) >> 3;
        this.f14799u = (iM216561n6 & 4) > 0;
        this.f14800v = iM216561n6 & 3;
        int iM216561n7 = yyp.m216561n(byteBuffer);
        this.f14801w = new ArrayList();
        for (int i = 0; i < iM216561n7; i++) {
            a aVar = new a();
            int iM216561n8 = yyp.m216561n(byteBuffer);
            aVar.f14805a = (iM216561n8 & 128) > 0;
            aVar.f14806b = (iM216561n8 & 64) > 0;
            aVar.f14807c = iM216561n8 & 63;
            int iM216556i2 = yyp.m216556i(byteBuffer);
            aVar.f14808d = new ArrayList();
            for (int i2 = 0; i2 < iM216556i2; i2++) {
                byte[] bArr = new byte[yyp.m216556i(byteBuffer)];
                byteBuffer.get(bArr);
                aVar.f14808d.add(bArr);
            }
            this.f14801w.add(aVar);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m20358c(ByteBuffer byteBuffer) {
        bzp.m104638j(byteBuffer, this.f14779a);
        bzp.m104638j(byteBuffer, (this.f14780b << 6) + (this.f14781c ? 32 : 0) + this.f14782d);
        bzp.m104635g(byteBuffer, this.f14783e);
        long j = this.f14784f;
        if (this.f14802x) {
            j |= 140737488355328L;
        }
        if (this.f14803y) {
            j |= 70368744177664L;
        }
        if (this.f14804z) {
            j |= 35184372088832L;
        }
        if (this.f14778A) {
            j |= 17592186044416L;
        }
        bzp.m104636h(byteBuffer, j);
        bzp.m104638j(byteBuffer, this.f14785g);
        bzp.m104633e(byteBuffer, (this.f14786h << 12) + this.f14787i);
        bzp.m104638j(byteBuffer, (this.f14788j << 2) + this.f14789k);
        bzp.m104638j(byteBuffer, (this.f14790l << 2) + this.f14791m);
        bzp.m104638j(byteBuffer, (this.f14792n << 3) + this.f14793o);
        bzp.m104638j(byteBuffer, (this.f14794p << 3) + this.f14795q);
        bzp.m104633e(byteBuffer, this.f14796r);
        bzp.m104638j(byteBuffer, (this.f14797s << 6) + (this.f14798t << 3) + (this.f14799u ? 4 : 0) + this.f14800v);
        bzp.m104638j(byteBuffer, this.f14801w.size());
        for (a aVar : this.f14801w) {
            bzp.m104638j(byteBuffer, (aVar.f14805a ? 128 : 0) + (aVar.f14806b ? 64 : 0) + aVar.f14807c);
            bzp.m104633e(byteBuffer, aVar.f14808d.size());
            for (byte[] bArr : aVar.f14808d) {
                bzp.m104633e(byteBuffer, bArr.length);
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
        C4281a c4281a = (C4281a) obj;
        if (this.f14796r != c4281a.f14796r || this.f14795q != c4281a.f14795q || this.f14793o != c4281a.f14793o || this.f14791m != c4281a.f14791m || this.f14779a != c4281a.f14779a || this.f14797s != c4281a.f14797s || this.f14784f != c4281a.f14784f || this.f14785g != c4281a.f14785g || this.f14783e != c4281a.f14783e || this.f14782d != c4281a.f14782d || this.f14780b != c4281a.f14780b || this.f14781c != c4281a.f14781c || this.f14800v != c4281a.f14800v || this.f14787i != c4281a.f14787i || this.f14798t != c4281a.f14798t || this.f14789k != c4281a.f14789k || this.f14786h != c4281a.f14786h || this.f14788j != c4281a.f14788j || this.f14790l != c4281a.f14790l || this.f14792n != c4281a.f14792n || this.f14794p != c4281a.f14794p || this.f14799u != c4281a.f14799u) {
            return false;
        }
        List<a> list = this.f14801w;
        List<a> list2 = c4281a.f14801w;
        return list == null ? list2 == null : list.equals(list2);
    }

    public int hashCode() {
        int i = ((((((this.f14779a * 31) + this.f14780b) * 31) + (this.f14781c ? 1 : 0)) * 31) + this.f14782d) * 31;
        long j = this.f14783e;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f14784f;
        int i3 = (((((((((((((((((((((((((((((((((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f14785g) * 31) + this.f14786h) * 31) + this.f14787i) * 31) + this.f14788j) * 31) + this.f14789k) * 31) + this.f14790l) * 31) + this.f14791m) * 31) + this.f14792n) * 31) + this.f14793o) * 31) + this.f14794p) * 31) + this.f14795q) * 31) + this.f14796r) * 31) + this.f14797s) * 31) + this.f14798t) * 31) + (this.f14799u ? 1 : 0)) * 31) + this.f14800v) * 31;
        List<a> list = this.f14801w;
        return i3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder sb = new StringBuilder("HEVCDecoderConfigurationRecord{configurationVersion=");
        sb.append(this.f14779a);
        sb.append(", general_profile_space=");
        sb.append(this.f14780b);
        sb.append(", general_tier_flag=");
        sb.append(this.f14781c);
        sb.append(", general_profile_idc=");
        sb.append(this.f14782d);
        sb.append(", general_profile_compatibility_flags=");
        sb.append(this.f14783e);
        sb.append(", general_constraint_indicator_flags=");
        sb.append(this.f14784f);
        sb.append(", general_level_idc=");
        sb.append(this.f14785g);
        String str5 = "";
        if (this.f14786h != 15) {
            str = ", reserved1=" + this.f14786h;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(", min_spatial_segmentation_idc=");
        sb.append(this.f14787i);
        if (this.f14788j != 63) {
            str2 = ", reserved2=" + this.f14788j;
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append(", parallelismType=");
        sb.append(this.f14789k);
        if (this.f14790l != 63) {
            str3 = ", reserved3=" + this.f14790l;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", chromaFormat=");
        sb.append(this.f14791m);
        if (this.f14792n != 31) {
            str4 = ", reserved4=" + this.f14792n;
        } else {
            str4 = "";
        }
        sb.append(str4);
        sb.append(", bitDepthLumaMinus8=");
        sb.append(this.f14793o);
        if (this.f14794p != 31) {
            str5 = ", reserved5=" + this.f14794p;
        }
        sb.append(str5);
        sb.append(", bitDepthChromaMinus8=");
        sb.append(this.f14795q);
        sb.append(", avgFrameRate=");
        sb.append(this.f14796r);
        sb.append(", constantFrameRate=");
        sb.append(this.f14797s);
        sb.append(", numTemporalLayers=");
        sb.append(this.f14798t);
        sb.append(", temporalIdNested=");
        sb.append(this.f14799u);
        sb.append(", lengthSizeMinusOne=");
        sb.append(this.f14800v);
        sb.append(", arrays=");
        sb.append(this.f14801w);
        sb.append('}');
        return sb.toString();
    }
}
