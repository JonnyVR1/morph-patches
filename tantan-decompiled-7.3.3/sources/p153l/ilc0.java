package p153l;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ilc0 extends kgk {

    /* JADX INFO: renamed from: a */
    private short f115563a;

    /* JADX INFO: renamed from: b */
    private short f115564b;

    /* JADX INFO: renamed from: c */
    private List<C17736a> f115565c = new LinkedList();

    /* JADX INFO: renamed from: d */
    private int f115566d;

    /* JADX INFO: renamed from: e */
    private int f115567e;

    /* JADX INFO: renamed from: f */
    private short f115568f;

    /* JADX INFO: renamed from: l.ilc0$a */
    public static class C17736a {

        /* JADX INFO: renamed from: a */
        int f115569a;

        /* JADX INFO: renamed from: b */
        short f115570b;

        public C17736a(int i, short s) {
            this.f115569a = i;
            this.f115570b = s;
        }

        /* JADX INFO: renamed from: a */
        public int m140619a() {
            return this.f115569a;
        }

        /* JADX INFO: renamed from: b */
        public short m140620b() {
            return this.f115570b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C17736a c17736a = (C17736a) obj;
            return this.f115569a == c17736a.f115569a && this.f115570b == c17736a.f115570b;
        }

        public int hashCode() {
            return (this.f115569a * 31) + this.f115570b;
        }

        public String toString() {
            return "{availableBitrate=" + this.f115569a + ", targetRateShare=" + ((int) this.f115570b) + '}';
        }
    }

    @Override // p153l.kgk
    /* JADX INFO: renamed from: a */
    public ByteBuffer mo117528a() {
        short s = this.f115563a;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(s == 1 ? 13 : (s * 6) + 11);
        byteBufferAllocate.putShort(this.f115563a);
        if (this.f115563a == 1) {
            byteBufferAllocate.putShort(this.f115564b);
        } else {
            for (C17736a c17736a : this.f115565c) {
                byteBufferAllocate.putInt(c17736a.m140619a());
                byteBufferAllocate.putShort(c17736a.m140620b());
            }
        }
        byteBufferAllocate.putInt(this.f115566d);
        byteBufferAllocate.putInt(this.f115567e);
        b1q.m101498j(byteBufferAllocate, this.f115568f);
        byteBufferAllocate.rewind();
        return byteBufferAllocate;
    }

    @Override // p153l.kgk
    /* JADX INFO: renamed from: b */
    public String mo117529b() {
        return "rash";
    }

    @Override // p153l.kgk
    /* JADX INFO: renamed from: c */
    public void mo117530c(ByteBuffer byteBuffer) {
        short s = byteBuffer.getShort();
        this.f115563a = s;
        int i = s;
        if (s == 1) {
            this.f115564b = byteBuffer.getShort();
        } else {
            while (true) {
                int i2 = i - 1;
                if (i <= 0) {
                    break;
                }
                this.f115565c.add(new C17736a(rn4.m182119a(y0q.m213895k(byteBuffer)), byteBuffer.getShort()));
                i = i2;
            }
        }
        this.f115566d = rn4.m182119a(y0q.m213895k(byteBuffer));
        this.f115567e = rn4.m182119a(y0q.m213895k(byteBuffer));
        this.f115568f = (short) y0q.m213898n(byteBuffer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ilc0 ilc0Var = (ilc0) obj;
        if (this.f115568f != ilc0Var.f115568f || this.f115566d != ilc0Var.f115566d || this.f115567e != ilc0Var.f115567e || this.f115563a != ilc0Var.f115563a || this.f115564b != ilc0Var.f115564b) {
            return false;
        }
        List<C17736a> list = this.f115565c;
        List<C17736a> list2 = ilc0Var.f115565c;
        return list == null ? list2 == null : list.equals(list2);
    }

    public int hashCode() {
        int i = ((this.f115563a * 31) + this.f115564b) * 31;
        List<C17736a> list = this.f115565c;
        return ((((((i + (list != null ? list.hashCode() : 0)) * 31) + this.f115566d) * 31) + this.f115567e) * 31) + this.f115568f;
    }
}
