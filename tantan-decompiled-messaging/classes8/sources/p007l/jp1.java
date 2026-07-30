package p007l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.aag0;
import l.bzp;
import l.l75;
import l.lh70;
import l.qzk;
import l.r03;
import l.t03;
import l.yhe0;
import l.yyp;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class jp1 {

    /* JADX INFO: renamed from: a */
    public int f3001a;

    /* JADX INFO: renamed from: b */
    public int f3002b;

    /* JADX INFO: renamed from: c */
    public int f3003c;

    /* JADX INFO: renamed from: d */
    public int f3004d;

    /* JADX INFO: renamed from: e */
    public int f3005e;

    /* JADX INFO: renamed from: f */
    public List<byte[]> f3006f;

    /* JADX INFO: renamed from: g */
    public List<byte[]> f3007g;

    /* JADX INFO: renamed from: h */
    public boolean f3008h;

    /* JADX INFO: renamed from: i */
    public int f3009i;

    /* JADX INFO: renamed from: j */
    public int f3010j;

    /* JADX INFO: renamed from: k */
    public int f3011k;

    /* JADX INFO: renamed from: l */
    public List<byte[]> f3012l;

    /* JADX INFO: renamed from: m */
    public int f3013m;

    /* JADX INFO: renamed from: n */
    public int f3014n;

    /* JADX INFO: renamed from: o */
    public int f3015o;

    /* JADX INFO: renamed from: p */
    public int f3016p;

    /* JADX INFO: renamed from: q */
    public int f3017q;

    public jp1(ByteBuffer byteBuffer) {
        int i;
        this.f3006f = new ArrayList();
        this.f3007g = new ArrayList();
        this.f3008h = true;
        this.f3009i = 1;
        this.f3010j = 0;
        this.f3011k = 0;
        this.f3012l = new ArrayList();
        this.f3013m = 63;
        this.f3014n = 7;
        this.f3015o = 31;
        this.f3016p = 31;
        this.f3017q = 31;
        this.f3001a = yyp.n(byteBuffer);
        this.f3002b = yyp.n(byteBuffer);
        this.f3003c = yyp.n(byteBuffer);
        this.f3004d = yyp.n(byteBuffer);
        r03 r03Var = new r03(byteBuffer);
        this.f3013m = r03Var.a(6);
        this.f3005e = r03Var.a(2);
        this.f3014n = r03Var.a(3);
        int iA = r03Var.a(5);
        for (int i2 = 0; i2 < iA; i2++) {
            byte[] bArr = new byte[yyp.i(byteBuffer)];
            byteBuffer.get(bArr);
            this.f3006f.add(bArr);
        }
        long jN = yyp.n(byteBuffer);
        for (int i3 = 0; i3 < jN; i3++) {
            byte[] bArr2 = new byte[yyp.i(byteBuffer)];
            byteBuffer.get(bArr2);
            this.f3007g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            this.f3008h = false;
        }
        if (!this.f3008h || ((i = this.f3002b) != 100 && i != 110 && i != 122 && i != 144)) {
            this.f3009i = -1;
            this.f3010j = -1;
            this.f3011k = -1;
            return;
        }
        r03 r03Var2 = new r03(byteBuffer);
        this.f3015o = r03Var2.a(6);
        this.f3009i = r03Var2.a(2);
        this.f3016p = r03Var2.a(5);
        this.f3010j = r03Var2.a(3);
        this.f3017q = r03Var2.a(5);
        this.f3011k = r03Var2.a(3);
        long jN2 = yyp.n(byteBuffer);
        for (int i4 = 0; i4 < jN2; i4++) {
            byte[] bArr3 = new byte[yyp.i(byteBuffer)];
            byteBuffer.get(bArr3);
            this.f3012l.add(bArr3);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m9540a(ByteBuffer byteBuffer) {
        bzp.j(byteBuffer, this.f3001a);
        bzp.j(byteBuffer, this.f3002b);
        bzp.j(byteBuffer, this.f3003c);
        bzp.j(byteBuffer, this.f3004d);
        t03 t03Var = new t03(byteBuffer);
        t03Var.a(this.f3013m, 6);
        t03Var.a(this.f3005e, 2);
        t03Var.a(this.f3014n, 3);
        t03Var.a(this.f3007g.size(), 5);
        for (byte[] bArr : this.f3006f) {
            bzp.e(byteBuffer, bArr.length);
            byteBuffer.put(bArr);
        }
        bzp.j(byteBuffer, this.f3007g.size());
        for (byte[] bArr2 : this.f3007g) {
            bzp.e(byteBuffer, bArr2.length);
            byteBuffer.put(bArr2);
        }
        if (this.f3008h) {
            int i = this.f3002b;
            if (i == 100 || i == 110 || i == 122 || i == 144) {
                t03 t03Var2 = new t03(byteBuffer);
                t03Var2.a(this.f3015o, 6);
                t03Var2.a(this.f3009i, 2);
                t03Var2.a(this.f3016p, 5);
                t03Var2.a(this.f3010j, 3);
                t03Var2.a(this.f3017q, 5);
                t03Var2.a(this.f3011k, 3);
                for (byte[] bArr3 : this.f3012l) {
                    bzp.e(byteBuffer, bArr3.length);
                    byteBuffer.put(bArr3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public long m9541b() {
        int i;
        Iterator<byte[]> it = this.f3006f.iterator();
        long length = 6;
        while (it.hasNext()) {
            length = length + 2 + ((long) it.next().length);
        }
        long length2 = length + 1;
        Iterator<byte[]> it2 = this.f3007g.iterator();
        while (it2.hasNext()) {
            length2 = length2 + 2 + ((long) it2.next().length);
        }
        if (!this.f3008h || ((i = this.f3002b) != 100 && i != 110 && i != 122 && i != 144)) {
            return length2;
        }
        long length3 = length2 + 4;
        Iterator<byte[]> it3 = this.f3012l.iterator();
        while (it3.hasNext()) {
            length3 = length3 + 2 + ((long) it3.next().length);
        }
        return length3;
    }

    /* JADX INFO: renamed from: c */
    public String[] m9542c() {
        ArrayList arrayList = new ArrayList();
        for (byte[] bArr : this.f3007g) {
            try {
                arrayList.add(lh70.a(new ByteArrayInputStream(bArr, 1, bArr.length - 1)).toString());
            } catch (IOException e) {
                aag0.a(e);
                return null;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX INFO: renamed from: d */
    public List<String> m9543d() {
        ArrayList arrayList = new ArrayList(this.f3007g.size());
        Iterator<byte[]> it = this.f3007g.iterator();
        while (it.hasNext()) {
            arrayList.add(qzk.a(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public String[] m9544e() {
        String string;
        ArrayList arrayList = new ArrayList();
        for (byte[] bArr : this.f3006f) {
            try {
                string = yhe0.b(new l75(new ByteArrayInputStream(bArr, 1, bArr.length - 1))).toString();
            } catch (IOException unused) {
                string = "not parsable";
            }
            arrayList.add(string);
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX INFO: renamed from: f */
    public List<String> m9545f() {
        ArrayList arrayList = new ArrayList(this.f3012l.size());
        Iterator<byte[]> it = this.f3012l.iterator();
        while (it.hasNext()) {
            arrayList.add(qzk.a(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public List<String> m9546g() {
        ArrayList arrayList = new ArrayList(this.f3006f.size());
        Iterator<byte[]> it = this.f3006f.iterator();
        while (it.hasNext()) {
            arrayList.add(qzk.a(it.next()));
        }
        return arrayList;
    }

    public String toString() {
        return "AvcDecoderConfigurationRecord{configurationVersion=" + this.f3001a + ", avcProfileIndication=" + this.f3002b + ", profileCompatibility=" + this.f3003c + ", avcLevelIndication=" + this.f3004d + ", lengthSizeMinusOne=" + this.f3005e + ", hasExts=" + this.f3008h + ", chromaFormat=" + this.f3009i + ", bitDepthLumaMinus8=" + this.f3010j + ", bitDepthChromaMinus8=" + this.f3011k + ", lengthSizeMinusOnePaddingBits=" + this.f3013m + ", numberOfSequenceParameterSetsPaddingBits=" + this.f3014n + ", chromaFormatPaddingBits=" + this.f3015o + ", bitDepthLumaMinus8PaddingBits=" + this.f3016p + ", bitDepthChromaMinus8PaddingBits=" + this.f3017q + '}';
    }

    public jp1() {
        this.f3006f = new ArrayList();
        this.f3007g = new ArrayList();
        this.f3008h = true;
        this.f3009i = 1;
        this.f3010j = 0;
        this.f3011k = 0;
        this.f3012l = new ArrayList();
        this.f3013m = 63;
        this.f3014n = 7;
        this.f3015o = 31;
        this.f3016p = 31;
        this.f3017q = 31;
    }
}
