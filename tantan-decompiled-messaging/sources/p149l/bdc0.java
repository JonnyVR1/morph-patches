package p149l;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class bdc0 extends udk {

    /* JADX INFO: renamed from: a */
    private short f75016a;

    /* JADX INFO: renamed from: b */
    private short f75017b;

    /* JADX INFO: renamed from: c */
    private List<C15837a> f75018c = new LinkedList();

    /* JADX INFO: renamed from: d */
    private int f75019d;

    /* JADX INFO: renamed from: e */
    private int f75020e;

    /* JADX INFO: renamed from: f */
    private short f75021f;

    /* JADX INFO: renamed from: l.bdc0$a */
    public static class C15837a {

        /* JADX INFO: renamed from: a */
        int f75022a;

        /* JADX INFO: renamed from: b */
        short f75023b;

        public C15837a(int i, short s) {
            this.f75022a = i;
            this.f75023b = s;
        }

        /* JADX INFO: renamed from: a */
        public int m101144a() {
            return this.f75022a;
        }

        /* JADX INFO: renamed from: b */
        public short m101145b() {
            return this.f75023b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C15837a c15837a = (C15837a) obj;
            return this.f75022a == c15837a.f75022a && this.f75023b == c15837a.f75023b;
        }

        public int hashCode() {
            return (this.f75022a * 31) + this.f75023b;
        }

        public String toString() {
            return "{availableBitrate=" + this.f75022a + ", targetRateShare=" + ((int) this.f75023b) + '}';
        }
    }

    @Override // p149l.udk
    /* JADX INFO: renamed from: a */
    public ByteBuffer mo98138a() {
        short s = this.f75016a;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(s == 1 ? 13 : (s * 6) + 11);
        byteBufferAllocate.putShort(this.f75016a);
        if (this.f75016a == 1) {
            byteBufferAllocate.putShort(this.f75017b);
        } else {
            for (C15837a c15837a : this.f75018c) {
                byteBufferAllocate.putInt(c15837a.m101144a());
                byteBufferAllocate.putShort(c15837a.m101145b());
            }
        }
        byteBufferAllocate.putInt(this.f75019d);
        byteBufferAllocate.putInt(this.f75020e);
        bzp.m104638j(byteBufferAllocate, this.f75021f);
        byteBufferAllocate.rewind();
        return byteBufferAllocate;
    }

    @Override // p149l.udk
    /* JADX INFO: renamed from: b */
    public String mo98139b() {
        return "rash";
    }

    @Override // p149l.udk
    /* JADX INFO: renamed from: c */
    public void mo98140c(ByteBuffer byteBuffer) {
        short s = byteBuffer.getShort();
        this.f75016a = s;
        int i = s;
        if (s == 1) {
            this.f75017b = byteBuffer.getShort();
        } else {
            while (true) {
                int i2 = i - 1;
                if (i <= 0) {
                    break;
                }
                this.f75018c.add(new C15837a(sm4.m184929a(yyp.m216558k(byteBuffer)), byteBuffer.getShort()));
                i = i2;
            }
        }
        this.f75019d = sm4.m184929a(yyp.m216558k(byteBuffer));
        this.f75020e = sm4.m184929a(yyp.m216558k(byteBuffer));
        this.f75021f = (short) yyp.m216561n(byteBuffer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bdc0 bdc0Var = (bdc0) obj;
        if (this.f75021f != bdc0Var.f75021f || this.f75019d != bdc0Var.f75019d || this.f75020e != bdc0Var.f75020e || this.f75016a != bdc0Var.f75016a || this.f75017b != bdc0Var.f75017b) {
            return false;
        }
        List<C15837a> list = this.f75018c;
        List<C15837a> list2 = bdc0Var.f75018c;
        return list == null ? list2 == null : list.equals(list2);
    }

    public int hashCode() {
        int i = ((this.f75016a * 31) + this.f75017b) * 31;
        List<C15837a> list = this.f75018c;
        return ((((((i + (list != null ? list.hashCode() : 0)) * 31) + this.f75019d) * 31) + this.f75020e) * 31) + this.f75021f;
    }
}
