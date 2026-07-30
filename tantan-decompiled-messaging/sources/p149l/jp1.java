package p149l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class jp1 {

    /* JADX INFO: renamed from: a */
    public int f119031a;

    /* JADX INFO: renamed from: b */
    public int f119032b;

    /* JADX INFO: renamed from: c */
    public int f119033c;

    /* JADX INFO: renamed from: d */
    public int f119034d;

    /* JADX INFO: renamed from: e */
    public int f119035e;

    /* JADX INFO: renamed from: f */
    public List<byte[]> f119036f;

    /* JADX INFO: renamed from: g */
    public List<byte[]> f119037g;

    /* JADX INFO: renamed from: h */
    public boolean f119038h;

    /* JADX INFO: renamed from: i */
    public int f119039i;

    /* JADX INFO: renamed from: j */
    public int f119040j;

    /* JADX INFO: renamed from: k */
    public int f119041k;

    /* JADX INFO: renamed from: l */
    public List<byte[]> f119042l;

    /* JADX INFO: renamed from: m */
    public int f119043m;

    /* JADX INFO: renamed from: n */
    public int f119044n;

    /* JADX INFO: renamed from: o */
    public int f119045o;

    /* JADX INFO: renamed from: p */
    public int f119046p;

    /* JADX INFO: renamed from: q */
    public int f119047q;

    public jp1(ByteBuffer byteBuffer) {
        int i;
        this.f119036f = new ArrayList();
        this.f119037g = new ArrayList();
        this.f119038h = true;
        this.f119039i = 1;
        this.f119040j = 0;
        this.f119041k = 0;
        this.f119042l = new ArrayList();
        this.f119043m = 63;
        this.f119044n = 7;
        this.f119045o = 31;
        this.f119046p = 31;
        this.f119047q = 31;
        this.f119031a = yyp.m216561n(byteBuffer);
        this.f119032b = yyp.m216561n(byteBuffer);
        this.f119033c = yyp.m216561n(byteBuffer);
        this.f119034d = yyp.m216561n(byteBuffer);
        r03 r03Var = new r03(byteBuffer);
        this.f119043m = r03Var.m177327a(6);
        this.f119035e = r03Var.m177327a(2);
        this.f119044n = r03Var.m177327a(3);
        int iM177327a = r03Var.m177327a(5);
        for (int i2 = 0; i2 < iM177327a; i2++) {
            byte[] bArr = new byte[yyp.m216556i(byteBuffer)];
            byteBuffer.get(bArr);
            this.f119036f.add(bArr);
        }
        long jM216561n = yyp.m216561n(byteBuffer);
        for (int i3 = 0; i3 < jM216561n; i3++) {
            byte[] bArr2 = new byte[yyp.m216556i(byteBuffer)];
            byteBuffer.get(bArr2);
            this.f119037g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            this.f119038h = false;
        }
        if (!this.f119038h || ((i = this.f119032b) != 100 && i != 110 && i != 122 && i != 144)) {
            this.f119039i = -1;
            this.f119040j = -1;
            this.f119041k = -1;
            return;
        }
        r03 r03Var2 = new r03(byteBuffer);
        this.f119045o = r03Var2.m177327a(6);
        this.f119039i = r03Var2.m177327a(2);
        this.f119046p = r03Var2.m177327a(5);
        this.f119040j = r03Var2.m177327a(3);
        this.f119047q = r03Var2.m177327a(5);
        this.f119041k = r03Var2.m177327a(3);
        long jM216561n2 = yyp.m216561n(byteBuffer);
        for (int i4 = 0; i4 < jM216561n2; i4++) {
            byte[] bArr3 = new byte[yyp.m216556i(byteBuffer)];
            byteBuffer.get(bArr3);
            this.f119042l.add(bArr3);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m142559a(ByteBuffer byteBuffer) {
        bzp.m104638j(byteBuffer, this.f119031a);
        bzp.m104638j(byteBuffer, this.f119032b);
        bzp.m104638j(byteBuffer, this.f119033c);
        bzp.m104638j(byteBuffer, this.f119034d);
        t03 t03Var = new t03(byteBuffer);
        t03Var.m186811a(this.f119043m, 6);
        t03Var.m186811a(this.f119035e, 2);
        t03Var.m186811a(this.f119044n, 3);
        t03Var.m186811a(this.f119037g.size(), 5);
        for (byte[] bArr : this.f119036f) {
            bzp.m104633e(byteBuffer, bArr.length);
            byteBuffer.put(bArr);
        }
        bzp.m104638j(byteBuffer, this.f119037g.size());
        for (byte[] bArr2 : this.f119037g) {
            bzp.m104633e(byteBuffer, bArr2.length);
            byteBuffer.put(bArr2);
        }
        if (this.f119038h) {
            int i = this.f119032b;
            if (i == 100 || i == 110 || i == 122 || i == 144) {
                t03 t03Var2 = new t03(byteBuffer);
                t03Var2.m186811a(this.f119045o, 6);
                t03Var2.m186811a(this.f119039i, 2);
                t03Var2.m186811a(this.f119046p, 5);
                t03Var2.m186811a(this.f119040j, 3);
                t03Var2.m186811a(this.f119047q, 5);
                t03Var2.m186811a(this.f119041k, 3);
                for (byte[] bArr3 : this.f119042l) {
                    bzp.m104633e(byteBuffer, bArr3.length);
                    byteBuffer.put(bArr3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public long m142560b() {
        int i;
        Iterator<byte[]> it = this.f119036f.iterator();
        long length = 6;
        while (it.hasNext()) {
            length = length + 2 + ((long) it.next().length);
        }
        long length2 = length + 1;
        Iterator<byte[]> it2 = this.f119037g.iterator();
        while (it2.hasNext()) {
            length2 = length2 + 2 + ((long) it2.next().length);
        }
        if (!this.f119038h || ((i = this.f119032b) != 100 && i != 110 && i != 122 && i != 144)) {
            return length2;
        }
        long length3 = length2 + 4;
        Iterator<byte[]> it3 = this.f119042l.iterator();
        while (it3.hasNext()) {
            length3 = length3 + 2 + ((long) it3.next().length);
        }
        return length3;
    }

    /* JADX INFO: renamed from: c */
    public String[] m142561c() {
        ArrayList arrayList = new ArrayList();
        for (byte[] bArr : this.f119037g) {
            try {
                arrayList.add(lh70.m149830a(new ByteArrayInputStream(bArr, 1, bArr.length - 1)).toString());
            } catch (IOException e) {
                aag0.m95543a(e);
                return null;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX INFO: renamed from: d */
    public List<String> m142562d() {
        ArrayList arrayList = new ArrayList(this.f119037g.size());
        Iterator<byte[]> it = this.f119037g.iterator();
        while (it.hasNext()) {
            arrayList.add(qzk.m177232a(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public String[] m142563e() {
        String string;
        ArrayList arrayList = new ArrayList();
        for (byte[] bArr : this.f119036f) {
            try {
                string = yhe0.m214817b(new l75(new ByteArrayInputStream(bArr, 1, bArr.length - 1))).toString();
            } catch (IOException unused) {
                string = "not parsable";
            }
            arrayList.add(string);
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX INFO: renamed from: f */
    public List<String> m142564f() {
        ArrayList arrayList = new ArrayList(this.f119042l.size());
        Iterator<byte[]> it = this.f119042l.iterator();
        while (it.hasNext()) {
            arrayList.add(qzk.m177232a(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public List<String> m142565g() {
        ArrayList arrayList = new ArrayList(this.f119036f.size());
        Iterator<byte[]> it = this.f119036f.iterator();
        while (it.hasNext()) {
            arrayList.add(qzk.m177232a(it.next()));
        }
        return arrayList;
    }

    public String toString() {
        return "AvcDecoderConfigurationRecord{configurationVersion=" + this.f119031a + ", avcProfileIndication=" + this.f119032b + ", profileCompatibility=" + this.f119033c + ", avcLevelIndication=" + this.f119034d + ", lengthSizeMinusOne=" + this.f119035e + ", hasExts=" + this.f119038h + ", chromaFormat=" + this.f119039i + ", bitDepthLumaMinus8=" + this.f119040j + ", bitDepthChromaMinus8=" + this.f119041k + ", lengthSizeMinusOnePaddingBits=" + this.f119043m + ", numberOfSequenceParameterSetsPaddingBits=" + this.f119044n + ", chromaFormatPaddingBits=" + this.f119045o + ", bitDepthLumaMinus8PaddingBits=" + this.f119046p + ", bitDepthChromaMinus8PaddingBits=" + this.f119047q + '}';
    }

    public jp1() {
        this.f119036f = new ArrayList();
        this.f119037g = new ArrayList();
        this.f119038h = true;
        this.f119039i = 1;
        this.f119040j = 0;
        this.f119041k = 0;
        this.f119042l = new ArrayList();
        this.f119043m = 63;
        this.f119044n = 7;
        this.f119045o = 31;
        this.f119046p = 31;
        this.f119047q = 31;
    }
}
