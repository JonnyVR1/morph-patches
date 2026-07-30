package p153l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class qp1 {

    /* JADX INFO: renamed from: a */
    public int f158800a;

    /* JADX INFO: renamed from: b */
    public int f158801b;

    /* JADX INFO: renamed from: c */
    public int f158802c;

    /* JADX INFO: renamed from: d */
    public int f158803d;

    /* JADX INFO: renamed from: e */
    public int f158804e;

    /* JADX INFO: renamed from: f */
    public List<byte[]> f158805f;

    /* JADX INFO: renamed from: g */
    public List<byte[]> f158806g;

    /* JADX INFO: renamed from: h */
    public boolean f158807h;

    /* JADX INFO: renamed from: i */
    public int f158808i;

    /* JADX INFO: renamed from: j */
    public int f158809j;

    /* JADX INFO: renamed from: k */
    public int f158810k;

    /* JADX INFO: renamed from: l */
    public List<byte[]> f158811l;

    /* JADX INFO: renamed from: m */
    public int f158812m;

    /* JADX INFO: renamed from: n */
    public int f158813n;

    /* JADX INFO: renamed from: o */
    public int f158814o;

    /* JADX INFO: renamed from: p */
    public int f158815p;

    /* JADX INFO: renamed from: q */
    public int f158816q;

    public qp1(ByteBuffer byteBuffer) {
        int i;
        this.f158805f = new ArrayList();
        this.f158806g = new ArrayList();
        this.f158807h = true;
        this.f158808i = 1;
        this.f158809j = 0;
        this.f158810k = 0;
        this.f158811l = new ArrayList();
        this.f158812m = 63;
        this.f158813n = 7;
        this.f158814o = 31;
        this.f158815p = 31;
        this.f158816q = 31;
        this.f158800a = y0q.m213898n(byteBuffer);
        this.f158801b = y0q.m213898n(byteBuffer);
        this.f158802c = y0q.m213898n(byteBuffer);
        this.f158803d = y0q.m213898n(byteBuffer);
        g13 g13Var = new g13(byteBuffer);
        this.f158812m = g13Var.m128488a(6);
        this.f158804e = g13Var.m128488a(2);
        this.f158813n = g13Var.m128488a(3);
        int iM128488a = g13Var.m128488a(5);
        for (int i2 = 0; i2 < iM128488a; i2++) {
            byte[] bArr = new byte[y0q.m213893i(byteBuffer)];
            byteBuffer.get(bArr);
            this.f158805f.add(bArr);
        }
        long jM213898n = y0q.m213898n(byteBuffer);
        for (int i3 = 0; i3 < jM213898n; i3++) {
            byte[] bArr2 = new byte[y0q.m213893i(byteBuffer)];
            byteBuffer.get(bArr2);
            this.f158806g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            this.f158807h = false;
        }
        if (!this.f158807h || ((i = this.f158801b) != 100 && i != 110 && i != 122 && i != 144)) {
            this.f158808i = -1;
            this.f158809j = -1;
            this.f158810k = -1;
            return;
        }
        g13 g13Var2 = new g13(byteBuffer);
        this.f158814o = g13Var2.m128488a(6);
        this.f158808i = g13Var2.m128488a(2);
        this.f158815p = g13Var2.m128488a(5);
        this.f158809j = g13Var2.m128488a(3);
        this.f158816q = g13Var2.m128488a(5);
        this.f158810k = g13Var2.m128488a(3);
        long jM213898n2 = y0q.m213898n(byteBuffer);
        for (int i4 = 0; i4 < jM213898n2; i4++) {
            byte[] bArr3 = new byte[y0q.m213893i(byteBuffer)];
            byteBuffer.get(bArr3);
            this.f158811l.add(bArr3);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m177392a(ByteBuffer byteBuffer) {
        b1q.m101498j(byteBuffer, this.f158800a);
        b1q.m101498j(byteBuffer, this.f158801b);
        b1q.m101498j(byteBuffer, this.f158802c);
        b1q.m101498j(byteBuffer, this.f158803d);
        i13 i13Var = new i13(byteBuffer);
        i13Var.m138073a(this.f158812m, 6);
        i13Var.m138073a(this.f158804e, 2);
        i13Var.m138073a(this.f158813n, 3);
        i13Var.m138073a(this.f158806g.size(), 5);
        for (byte[] bArr : this.f158805f) {
            b1q.m101493e(byteBuffer, bArr.length);
            byteBuffer.put(bArr);
        }
        b1q.m101498j(byteBuffer, this.f158806g.size());
        for (byte[] bArr2 : this.f158806g) {
            b1q.m101493e(byteBuffer, bArr2.length);
            byteBuffer.put(bArr2);
        }
        if (this.f158807h) {
            int i = this.f158801b;
            if (i == 100 || i == 110 || i == 122 || i == 144) {
                i13 i13Var2 = new i13(byteBuffer);
                i13Var2.m138073a(this.f158814o, 6);
                i13Var2.m138073a(this.f158808i, 2);
                i13Var2.m138073a(this.f158815p, 5);
                i13Var2.m138073a(this.f158809j, 3);
                i13Var2.m138073a(this.f158816q, 5);
                i13Var2.m138073a(this.f158810k, 3);
                for (byte[] bArr3 : this.f158811l) {
                    b1q.m101493e(byteBuffer, bArr3.length);
                    byteBuffer.put(bArr3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public long m177393b() {
        int i;
        Iterator<byte[]> it = this.f158805f.iterator();
        long length = 6;
        while (it.hasNext()) {
            length = length + 2 + ((long) it.next().length);
        }
        long length2 = length + 1;
        Iterator<byte[]> it2 = this.f158806g.iterator();
        while (it2.hasNext()) {
            length2 = length2 + 2 + ((long) it2.next().length);
        }
        if (!this.f158807h || ((i = this.f158801b) != 100 && i != 110 && i != 122 && i != 144)) {
            return length2;
        }
        long length3 = length2 + 4;
        Iterator<byte[]> it3 = this.f158811l.iterator();
        while (it3.hasNext()) {
            length3 = length3 + 2 + ((long) it3.next().length);
        }
        return length3;
    }

    /* JADX INFO: renamed from: c */
    public String[] m177394c() {
        ArrayList arrayList = new ArrayList();
        for (byte[] bArr : this.f158806g) {
            try {
                arrayList.add(rp70.m182511a(new ByteArrayInputStream(bArr, 1, bArr.length - 1)).toString());
            } catch (IOException e) {
                iig0.m140070a(e);
                return null;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX INFO: renamed from: d */
    public List<String> m177395d() {
        ArrayList arrayList = new ArrayList(this.f158806g.size());
        Iterator<byte[]> it = this.f158806g.iterator();
        while (it.hasNext()) {
            arrayList.add(g2l.m128633a(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public String[] m177396e() {
        String string;
        ArrayList arrayList = new ArrayList();
        for (byte[] bArr : this.f158805f) {
            try {
                string = dqe0.m117517b(new m85(new ByteArrayInputStream(bArr, 1, bArr.length - 1))).toString();
            } catch (IOException unused) {
                string = "not parsable";
            }
            arrayList.add(string);
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX INFO: renamed from: f */
    public List<String> m177397f() {
        ArrayList arrayList = new ArrayList(this.f158811l.size());
        Iterator<byte[]> it = this.f158811l.iterator();
        while (it.hasNext()) {
            arrayList.add(g2l.m128633a(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public List<String> m177398g() {
        ArrayList arrayList = new ArrayList(this.f158805f.size());
        Iterator<byte[]> it = this.f158805f.iterator();
        while (it.hasNext()) {
            arrayList.add(g2l.m128633a(it.next()));
        }
        return arrayList;
    }

    public String toString() {
        return "AvcDecoderConfigurationRecord{configurationVersion=" + this.f158800a + ", avcProfileIndication=" + this.f158801b + ", profileCompatibility=" + this.f158802c + ", avcLevelIndication=" + this.f158803d + ", lengthSizeMinusOne=" + this.f158804e + ", hasExts=" + this.f158807h + ", chromaFormat=" + this.f158808i + ", bitDepthLumaMinus8=" + this.f158809j + ", bitDepthChromaMinus8=" + this.f158810k + ", lengthSizeMinusOnePaddingBits=" + this.f158812m + ", numberOfSequenceParameterSetsPaddingBits=" + this.f158813n + ", chromaFormatPaddingBits=" + this.f158814o + ", bitDepthLumaMinus8PaddingBits=" + this.f158815p + ", bitDepthChromaMinus8PaddingBits=" + this.f158816q + '}';
    }

    public qp1() {
        this.f158805f = new ArrayList();
        this.f158806g = new ArrayList();
        this.f158807h = true;
        this.f158808i = 1;
        this.f158809j = 0;
        this.f158810k = 0;
        this.f158811l = new ArrayList();
        this.f158812m = 63;
        this.f158813n = 7;
        this.f158814o = 31;
        this.f158815p = 31;
        this.f158816q = 31;
    }
}
