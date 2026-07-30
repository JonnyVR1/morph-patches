package p003l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.CrashHelper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import l.qkq0;
import p028v.emoji.base.apngdecoder.PngColourType;

/* JADX INFO: renamed from: l.s1 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C0522s1 {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f7124a;

    /* JADX INFO: renamed from: b */
    public C0497r1 f7125b;

    /* JADX INFO: renamed from: c */
    public int f7126c = 0;

    /* JADX INFO: renamed from: d */
    public List<C0444o1> f7127d = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final boolean m7407a() {
        for (int i = 0; i < 8; i++) {
            if (m7411e() != C0464p1.f6300a[i]) {
                this.f7125b.f9085a = 1;
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7408b() {
        return this.f7125b.f9085a != 0;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public C0497r1 m7409c() {
        if (this.f7124a == null) {
            qkq0.a("You must call setData() before parseHeader()");
            return null;
        }
        if (m7408b()) {
            return this.f7125b;
        }
        m7415i();
        C0497r1 c0497r1 = this.f7125b;
        if (c0497r1.f9086b < 0) {
            c0497r1.f9085a = 1;
        }
        return c0497r1;
    }

    /* JADX INFO: renamed from: d */
    public final void m7410d() {
        this.f7125b.f9086b = m7419m();
        this.f7125b.f9091g = m7419m();
    }

    /* JADX INFO: renamed from: e */
    public final byte m7411e() {
        return this.f7124a.get();
    }

    /* JADX INFO: renamed from: f */
    public final void m7412f() {
        m7425s(4);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: g */
    public final void m7413g() {
        C0489q1 c0489q1 = new C0489q1();
        this.f7125b.f9087c = c0489q1;
        int iM7419m = m7419m();
        int i = this.f7126c;
        if (iM7419m != i) {
            this.f7125b.f9085a = 1;
            return;
        }
        this.f7126c = i + 1;
        c0489q1.f6569d = iM7419m;
        c0489q1.f6570e = m7419m();
        c0489q1.f6571f = m7419m();
        c0489q1.f6572g = m7419m();
        c0489q1.f6573h = m7419m();
        c0489q1.m6980b(m7421o(), m7421o());
        c0489q1.m6981c(m7411e());
        c0489q1.m6979a(m7411e());
        if (this.f7124a.position() + 4 < this.f7124a.limit()) {
            this.f7125b.f9088d.add(c0489q1);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m7414h(int i) {
        if (m7419m() != this.f7126c) {
            this.f7125b.f9085a = 1;
            return;
        }
        if (i > this.f7124a.remaining()) {
            List<T> list = this.f7125b.f9088d;
            list.remove(list.size() - 1);
        } else {
            this.f7126c++;
            ((C0489q1) this.f7125b.f9087c).f8809c = this.f7124a.position();
            T t = this.f7125b.f9087c;
            ((C0489q1) t).f6575j = i - 4;
            ((C0489q1) t).f6576k = true;
        }
        m7425s(i - 4);
    }

    /* JADX INFO: renamed from: i */
    public final void m7415i() {
        m7416j(Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: j */
    public final void m7416j(int i) {
        if (m7407a()) {
            while (true) {
                boolean z = false;
                while (true) {
                    if (!m7408b() && !z && this.f7126c < i) {
                        int iM7419m = m7419m();
                        switch (m7419m()) {
                            case 1229209940:
                                m7417k(iM7419m);
                                break;
                            case 1229278788:
                                this.f7125b.f6766p = this.f7124a.position() - 8;
                                z = true;
                                break;
                            case 1229472850:
                                if (iM7419m == 13) {
                                    m7418l();
                                } else {
                                    this.f7125b.f9085a = 1;
                                }
                                break;
                            case 1347179589:
                                m7420n(iM7419m);
                                break;
                            case 1633899596:
                                if (iM7419m == 8) {
                                    m7410d();
                                } else {
                                    this.f7125b.f9085a = 1;
                                }
                                break;
                            case 1717785676:
                                if (iM7419m == 26) {
                                    m7413g();
                                } else {
                                    this.f7125b.f9085a = 1;
                                }
                                break;
                            case 1717846356:
                                m7414h(iM7419m);
                                break;
                            case 1767135348:
                            case 1950701684:
                            case 1950960965:
                            case 2052348020:
                                this.f7127d.add(new C0444o1(iM7419m + 12, this.f7124a.position() - 8));
                                m7425s(iM7419m);
                                break;
                            default:
                                m7425s(iM7419m);
                                break;
                        }
                        m7412f();
                        if (!z) {
                            if (this.f7124a.position() >= this.f7124a.limit()) {
                                z = true;
                            }
                        }
                    }
                }
            }
            if (!this.f7127d.isEmpty()) {
                this.f7125b.f6767q = (C0444o1[]) this.f7127d.toArray(new C0444o1[0]);
            }
            C0497r1 c0497r1 = this.f7125b;
            if (c0497r1.f9086b != c0497r1.f9088d.size()) {
                C0497r1 c0497r2 = this.f7125b;
                c0497r2.f9086b = c0497r2.f9088d.size();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m7417k(int i) {
        C0497r1 c0497r1 = this.f7125b;
        int i2 = c0497r1.f6763m;
        ByteBuffer byteBuffer = this.f7124a;
        if (i2 != 0) {
            c0497r1.f6764n = byteBuffer.position() - 8;
        } else {
            c0497r1.f6763m = byteBuffer.position() - 8;
        }
        this.f7127d.clear();
        if (this.f7126c > 0) {
            C0497r1 c0497r2 = this.f7125b;
            c0497r2.f6765o = true;
            ((C0489q1) c0497r2.f9087c).f8809c = this.f7124a.position();
            ((C0489q1) this.f7125b.f9087c).f6575j = Math.min(i, this.f7124a.remaining());
        }
        m7425s(i);
    }

    /* JADX INFO: renamed from: l */
    public final void m7418l() {
        this.f7125b.f9089e = m7419m();
        this.f7125b.f9090f = m7419m();
        this.f7125b.f6758h = m7411e();
        try {
            this.f7125b.f6759i = PngColourType.fromByte(m7411e());
        } catch (IllegalArgumentException e) {
            CrashHelper.c(e);
            this.f7125b.f9085a = 1;
        }
        this.f7125b.f6760j = m7411e();
        this.f7125b.f6761k = m7411e();
        this.f7125b.f6762l = m7411e();
    }

    /* JADX INFO: renamed from: m */
    public final int m7419m() {
        return this.f7124a.getInt();
    }

    /* JADX INFO: renamed from: n */
    public final void m7420n(int i) {
        if (i % 3 != 0) {
            this.f7125b.f9085a = 1;
        } else {
            m7425s(i);
        }
    }

    /* JADX INFO: renamed from: o */
    public short m7421o() {
        return (short) (this.f7124a.getShort() & 65535);
    }

    /* JADX INFO: renamed from: p */
    public final void m7422p() {
        this.f7124a = null;
        this.f7125b = new C0497r1();
    }

    /* JADX INFO: renamed from: q */
    public C0522s1 m7423q(@NonNull ByteBuffer byteBuffer) {
        m7422p();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f7124a = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f7124a.order(ByteOrder.BIG_ENDIAN);
        return this;
    }

    /* JADX INFO: renamed from: r */
    public C0522s1 m7424r(@Nullable byte[] bArr) {
        if (bArr != null) {
            m7423q(ByteBuffer.wrap(bArr));
            return this;
        }
        this.f7124a = null;
        this.f7125b.f9085a = 2;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public final void m7425s(int i) {
        this.f7124a.position(Math.min(this.f7124a.position() + i, this.f7124a.limit()));
    }
}
