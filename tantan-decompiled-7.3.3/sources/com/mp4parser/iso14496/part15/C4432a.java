package com.mp4parser.iso14496.part15;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.sudcompress.archivers.zip.UnixStat;
import p153l.b1q;
import p153l.y0q;

/* JADX INFO: renamed from: com.mp4parser.iso14496.part15.a */
/* JADX INFO: loaded from: classes8.dex */
public class C4432a {

    /* JADX INFO: renamed from: A */
    boolean f15497A;

    /* JADX INFO: renamed from: a */
    int f15498a;

    /* JADX INFO: renamed from: b */
    int f15499b;

    /* JADX INFO: renamed from: c */
    boolean f15500c;

    /* JADX INFO: renamed from: d */
    int f15501d;

    /* JADX INFO: renamed from: e */
    long f15502e;

    /* JADX INFO: renamed from: f */
    long f15503f;

    /* JADX INFO: renamed from: g */
    int f15504g;

    /* JADX INFO: renamed from: i */
    int f15506i;

    /* JADX INFO: renamed from: k */
    int f15508k;

    /* JADX INFO: renamed from: m */
    int f15510m;

    /* JADX INFO: renamed from: o */
    int f15512o;

    /* JADX INFO: renamed from: q */
    int f15514q;

    /* JADX INFO: renamed from: r */
    int f15515r;

    /* JADX INFO: renamed from: s */
    int f15516s;

    /* JADX INFO: renamed from: t */
    int f15517t;

    /* JADX INFO: renamed from: u */
    boolean f15518u;

    /* JADX INFO: renamed from: v */
    int f15519v;

    /* JADX INFO: renamed from: x */
    boolean f15521x;

    /* JADX INFO: renamed from: y */
    boolean f15522y;

    /* JADX INFO: renamed from: z */
    boolean f15523z;

    /* JADX INFO: renamed from: h */
    int f15505h = 15;

    /* JADX INFO: renamed from: j */
    int f15507j = 63;

    /* JADX INFO: renamed from: l */
    int f15509l = 63;

    /* JADX INFO: renamed from: n */
    int f15511n = 31;

    /* JADX INFO: renamed from: p */
    int f15513p = 31;

    /* JADX INFO: renamed from: w */
    List<a> f15520w = new ArrayList();

    /* JADX INFO: renamed from: com.mp4parser.iso14496.part15.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public boolean f15524a;

        /* JADX INFO: renamed from: b */
        public boolean f15525b;

        /* JADX INFO: renamed from: c */
        public int f15526c;

        /* JADX INFO: renamed from: d */
        public List<byte[]> f15527d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f15524a != aVar.f15524a || this.f15526c != aVar.f15526c || this.f15525b != aVar.f15525b) {
                    return false;
                }
                ListIterator<byte[]> listIterator = this.f15527d.listIterator();
                ListIterator<byte[]> listIterator2 = aVar.f15527d.listIterator();
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
            int i = (((((this.f15524a ? 1 : 0) * 31) + (this.f15525b ? 1 : 0)) * 31) + this.f15526c) * 31;
            List<byte[]> list = this.f15527d;
            return i + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Array{nal_unit_type=" + this.f15526c + ", reserved=" + this.f15525b + ", array_completeness=" + this.f15524a + ", num_nals=" + this.f15527d.size() + '}';
        }
    }

    /* JADX INFO: renamed from: a */
    public int m21355a() {
        Iterator<a> it = this.f15520w.iterator();
        int length = 23;
        while (it.hasNext()) {
            length += 3;
            Iterator<byte[]> it2 = it.next().f15527d.iterator();
            while (it2.hasNext()) {
                length = length + 2 + it2.next().length;
            }
        }
        return length;
    }

    /* JADX INFO: renamed from: b */
    public void m21356b(ByteBuffer byteBuffer) {
        this.f15498a = y0q.m213898n(byteBuffer);
        int iM213898n = y0q.m213898n(byteBuffer);
        this.f15499b = (iM213898n & 192) >> 6;
        this.f15500c = (iM213898n & 32) > 0;
        this.f15501d = iM213898n & 31;
        this.f15502e = y0q.m213895k(byteBuffer);
        long jM213896l = y0q.m213896l(byteBuffer);
        this.f15503f = jM213896l;
        this.f15521x = ((jM213896l >> 44) & 8) > 0;
        this.f15522y = ((jM213896l >> 44) & 4) > 0;
        this.f15523z = ((jM213896l >> 44) & 2) > 0;
        this.f15497A = ((jM213896l >> 44) & 1) > 0;
        this.f15503f = jM213896l & 140737488355327L;
        this.f15504g = y0q.m213898n(byteBuffer);
        int iM213893i = y0q.m213893i(byteBuffer);
        this.f15505h = (61440 & iM213893i) >> 12;
        this.f15506i = iM213893i & UnixStat.PERM_MASK;
        int iM213898n2 = y0q.m213898n(byteBuffer);
        this.f15507j = (iM213898n2 & 252) >> 2;
        this.f15508k = iM213898n2 & 3;
        int iM213898n3 = y0q.m213898n(byteBuffer);
        this.f15509l = (iM213898n3 & 252) >> 2;
        this.f15510m = iM213898n3 & 3;
        int iM213898n4 = y0q.m213898n(byteBuffer);
        this.f15511n = (iM213898n4 & 248) >> 3;
        this.f15512o = iM213898n4 & 7;
        int iM213898n5 = y0q.m213898n(byteBuffer);
        this.f15513p = (iM213898n5 & 248) >> 3;
        this.f15514q = iM213898n5 & 7;
        this.f15515r = y0q.m213893i(byteBuffer);
        int iM213898n6 = y0q.m213898n(byteBuffer);
        this.f15516s = (iM213898n6 & 192) >> 6;
        this.f15517t = (iM213898n6 & 56) >> 3;
        this.f15518u = (iM213898n6 & 4) > 0;
        this.f15519v = iM213898n6 & 3;
        int iM213898n7 = y0q.m213898n(byteBuffer);
        this.f15520w = new ArrayList();
        for (int i = 0; i < iM213898n7; i++) {
            a aVar = new a();
            int iM213898n8 = y0q.m213898n(byteBuffer);
            aVar.f15524a = (iM213898n8 & 128) > 0;
            aVar.f15525b = (iM213898n8 & 64) > 0;
            aVar.f15526c = iM213898n8 & 63;
            int iM213893i2 = y0q.m213893i(byteBuffer);
            aVar.f15527d = new ArrayList();
            for (int i2 = 0; i2 < iM213893i2; i2++) {
                byte[] bArr = new byte[y0q.m213893i(byteBuffer)];
                byteBuffer.get(bArr);
                aVar.f15527d.add(bArr);
            }
            this.f15520w.add(aVar);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m21357c(ByteBuffer byteBuffer) {
        b1q.m101498j(byteBuffer, this.f15498a);
        b1q.m101498j(byteBuffer, (this.f15499b << 6) + (this.f15500c ? 32 : 0) + this.f15501d);
        b1q.m101495g(byteBuffer, this.f15502e);
        long j = this.f15503f;
        if (this.f15521x) {
            j |= 140737488355328L;
        }
        if (this.f15522y) {
            j |= 70368744177664L;
        }
        if (this.f15523z) {
            j |= 35184372088832L;
        }
        if (this.f15497A) {
            j |= 17592186044416L;
        }
        b1q.m101496h(byteBuffer, j);
        b1q.m101498j(byteBuffer, this.f15504g);
        b1q.m101493e(byteBuffer, (this.f15505h << 12) + this.f15506i);
        b1q.m101498j(byteBuffer, (this.f15507j << 2) + this.f15508k);
        b1q.m101498j(byteBuffer, (this.f15509l << 2) + this.f15510m);
        b1q.m101498j(byteBuffer, (this.f15511n << 3) + this.f15512o);
        b1q.m101498j(byteBuffer, (this.f15513p << 3) + this.f15514q);
        b1q.m101493e(byteBuffer, this.f15515r);
        b1q.m101498j(byteBuffer, (this.f15516s << 6) + (this.f15517t << 3) + (this.f15518u ? 4 : 0) + this.f15519v);
        b1q.m101498j(byteBuffer, this.f15520w.size());
        for (a aVar : this.f15520w) {
            b1q.m101498j(byteBuffer, (aVar.f15524a ? 128 : 0) + (aVar.f15525b ? 64 : 0) + aVar.f15526c);
            b1q.m101493e(byteBuffer, aVar.f15527d.size());
            for (byte[] bArr : aVar.f15527d) {
                b1q.m101493e(byteBuffer, bArr.length);
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
        C4432a c4432a = (C4432a) obj;
        if (this.f15515r != c4432a.f15515r || this.f15514q != c4432a.f15514q || this.f15512o != c4432a.f15512o || this.f15510m != c4432a.f15510m || this.f15498a != c4432a.f15498a || this.f15516s != c4432a.f15516s || this.f15503f != c4432a.f15503f || this.f15504g != c4432a.f15504g || this.f15502e != c4432a.f15502e || this.f15501d != c4432a.f15501d || this.f15499b != c4432a.f15499b || this.f15500c != c4432a.f15500c || this.f15519v != c4432a.f15519v || this.f15506i != c4432a.f15506i || this.f15517t != c4432a.f15517t || this.f15508k != c4432a.f15508k || this.f15505h != c4432a.f15505h || this.f15507j != c4432a.f15507j || this.f15509l != c4432a.f15509l || this.f15511n != c4432a.f15511n || this.f15513p != c4432a.f15513p || this.f15518u != c4432a.f15518u) {
            return false;
        }
        List<a> list = this.f15520w;
        List<a> list2 = c4432a.f15520w;
        return list == null ? list2 == null : list.equals(list2);
    }

    public int hashCode() {
        int i = ((((((this.f15498a * 31) + this.f15499b) * 31) + (this.f15500c ? 1 : 0)) * 31) + this.f15501d) * 31;
        long j = this.f15502e;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f15503f;
        int i3 = (((((((((((((((((((((((((((((((((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f15504g) * 31) + this.f15505h) * 31) + this.f15506i) * 31) + this.f15507j) * 31) + this.f15508k) * 31) + this.f15509l) * 31) + this.f15510m) * 31) + this.f15511n) * 31) + this.f15512o) * 31) + this.f15513p) * 31) + this.f15514q) * 31) + this.f15515r) * 31) + this.f15516s) * 31) + this.f15517t) * 31) + (this.f15518u ? 1 : 0)) * 31) + this.f15519v) * 31;
        List<a> list = this.f15520w;
        return i3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder sb = new StringBuilder("HEVCDecoderConfigurationRecord{configurationVersion=");
        sb.append(this.f15498a);
        sb.append(", general_profile_space=");
        sb.append(this.f15499b);
        sb.append(", general_tier_flag=");
        sb.append(this.f15500c);
        sb.append(", general_profile_idc=");
        sb.append(this.f15501d);
        sb.append(", general_profile_compatibility_flags=");
        sb.append(this.f15502e);
        sb.append(", general_constraint_indicator_flags=");
        sb.append(this.f15503f);
        sb.append(", general_level_idc=");
        sb.append(this.f15504g);
        String str5 = "";
        if (this.f15505h != 15) {
            str = ", reserved1=" + this.f15505h;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(", min_spatial_segmentation_idc=");
        sb.append(this.f15506i);
        if (this.f15507j != 63) {
            str2 = ", reserved2=" + this.f15507j;
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append(", parallelismType=");
        sb.append(this.f15508k);
        if (this.f15509l != 63) {
            str3 = ", reserved3=" + this.f15509l;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", chromaFormat=");
        sb.append(this.f15510m);
        if (this.f15511n != 31) {
            str4 = ", reserved4=" + this.f15511n;
        } else {
            str4 = "";
        }
        sb.append(str4);
        sb.append(", bitDepthLumaMinus8=");
        sb.append(this.f15512o);
        if (this.f15513p != 31) {
            str5 = ", reserved5=" + this.f15513p;
        }
        sb.append(str5);
        sb.append(", bitDepthChromaMinus8=");
        sb.append(this.f15514q);
        sb.append(", avgFrameRate=");
        sb.append(this.f15515r);
        sb.append(", constantFrameRate=");
        sb.append(this.f15516s);
        sb.append(", numTemporalLayers=");
        sb.append(this.f15517t);
        sb.append(", temporalIdNested=");
        sb.append(this.f15518u);
        sb.append(", lengthSizeMinusOne=");
        sb.append(this.f15519v);
        sb.append(", arrays=");
        sb.append(this.f15520w);
        sb.append('}');
        return sb.toString();
    }
}
