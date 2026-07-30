package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.tantanapp.common.utils.CrashHelper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import p147v.emoji.base.apngdecoder.PngColourType;

/* JADX INFO: renamed from: l.s1 */
/* JADX INFO: loaded from: classes3.dex */
public class C19823s1 {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f161825a;

    /* JADX INFO: renamed from: b */
    public C19618r1 f161826b;

    /* JADX INFO: renamed from: c */
    public int f161827c = 0;

    /* JADX INFO: renamed from: d */
    public List<C18813o1> f161828d = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final boolean m181895a() {
        for (int i = 0; i < 8; i++) {
            if (m181899e() != C19096p1.f146633a[i]) {
                this.f161826b.f199248a = 1;
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m181896b() {
        return this.f161826b.f199248a != 0;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public C19618r1 m181897c() {
        if (this.f161825a == null) {
            qkq0.m175383a("You must call setData() before parseHeader()");
            return null;
        }
        if (m181896b()) {
            return this.f161826b;
        }
        m181903i();
        C19618r1 c19618r1 = this.f161826b;
        if (c19618r1.f199249b < 0) {
            c19618r1.f199248a = 1;
        }
        return c19618r1;
    }

    /* JADX INFO: renamed from: d */
    public final void m181898d() {
        this.f161826b.f199249b = m181907m();
        this.f161826b.f199254g = m181907m();
    }

    /* JADX INFO: renamed from: e */
    public final byte m181899e() {
        return this.f161825a.get();
    }

    /* JADX INFO: renamed from: f */
    public final void m181900f() {
        m181913s(4);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: g */
    public final void m181901g() {
        C19388q1 c19388q1 = new C19388q1();
        this.f161826b.f199250c = c19388q1;
        int iM181907m = m181907m();
        int i = this.f161827c;
        if (iM181907m != i) {
            this.f161826b.f199248a = 1;
            return;
        }
        this.f161827c = i + 1;
        c19388q1.f152093d = iM181907m;
        c19388q1.f152094e = m181907m();
        c19388q1.f152095f = m181907m();
        c19388q1.f152096g = m181907m();
        c19388q1.f152097h = m181907m();
        c19388q1.m172364b(m181909o(), m181909o());
        c19388q1.m172365c(m181899e());
        c19388q1.m172363a(m181899e());
        if (this.f161825a.position() + 4 < this.f161825a.limit()) {
            this.f161826b.f199251d.add(c19388q1);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m181902h(int i) {
        if (m181907m() != this.f161827c) {
            this.f161826b.f199248a = 1;
            return;
        }
        if (i > this.f161825a.remaining()) {
            List<T> list = this.f161826b.f199251d;
            list.remove(list.size() - 1);
        } else {
            this.f161827c++;
            ((C19388q1) this.f161826b.f199250c).f193772c = this.f161825a.position();
            T t = this.f161826b.f199250c;
            ((C19388q1) t).f152099j = i - 4;
            ((C19388q1) t).f152100k = true;
        }
        m181913s(i - 4);
    }

    /* JADX INFO: renamed from: i */
    public final void m181903i() {
        m181904j(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: j */
    public final void m181904j(int i) {
        if (m181895a()) {
            while (true) {
                boolean z = false;
                while (true) {
                    if (!m181896b() && !z && this.f161827c < i) {
                        int iM181907m = m181907m();
                        switch (m181907m()) {
                            case 1229209940:
                                m181905k(iM181907m);
                                break;
                            case 1229278788:
                                this.f161826b.f157221p = this.f161825a.position() - 8;
                                z = true;
                                break;
                            case 1229472850:
                                if (iM181907m == 13) {
                                    m181906l();
                                } else {
                                    this.f161826b.f199248a = 1;
                                }
                                break;
                            case 1347179589:
                                m181908n(iM181907m);
                                break;
                            case 1633899596:
                                if (iM181907m == 8) {
                                    m181898d();
                                } else {
                                    this.f161826b.f199248a = 1;
                                }
                                break;
                            case 1717785676:
                                if (iM181907m == 26) {
                                    m181901g();
                                } else {
                                    this.f161826b.f199248a = 1;
                                }
                                break;
                            case 1717846356:
                                m181902h(iM181907m);
                                break;
                            case 1767135348:
                            case 1950701684:
                            case 1950960965:
                            case 2052348020:
                                this.f161828d.add(new C18813o1(iM181907m + 12, this.f161825a.position() - 8));
                                m181913s(iM181907m);
                                break;
                            default:
                                m181913s(iM181907m);
                                break;
                        }
                        m181900f();
                        if (!z) {
                            if (this.f161825a.position() >= this.f161825a.limit()) {
                                z = true;
                            }
                        }
                    }
                }
            }
            if (!this.f161828d.isEmpty()) {
                this.f161826b.f157222q = (C18813o1[]) this.f161828d.toArray(new C18813o1[0]);
            }
            C19618r1 c19618r1 = this.f161826b;
            if (c19618r1.f199249b != c19618r1.f199251d.size()) {
                C19618r1 c19618r2 = this.f161826b;
                c19618r2.f199249b = c19618r2.f199251d.size();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m181905k(int i) {
        C19618r1 c19618r1 = this.f161826b;
        int i2 = c19618r1.f157218m;
        ByteBuffer byteBuffer = this.f161825a;
        if (i2 != 0) {
            c19618r1.f157219n = byteBuffer.position() - 8;
        } else {
            c19618r1.f157218m = byteBuffer.position() - 8;
        }
        this.f161828d.clear();
        if (this.f161827c > 0) {
            C19618r1 c19618r2 = this.f161826b;
            c19618r2.f157220o = true;
            ((C19388q1) c19618r2.f199250c).f193772c = this.f161825a.position();
            ((C19388q1) this.f161826b.f199250c).f152099j = Math.min(i, this.f161825a.remaining());
        }
        m181913s(i);
    }

    /* JADX INFO: renamed from: l */
    public final void m181906l() {
        this.f161826b.f199252e = m181907m();
        this.f161826b.f199253f = m181907m();
        this.f161826b.f157213h = m181899e();
        try {
            this.f161826b.f157214i = PngColourType.fromByte(m181899e());
        } catch (IllegalArgumentException e) {
            CrashHelper.m81296c(e);
            this.f161826b.f199248a = 1;
        }
        this.f161826b.f157215j = m181899e();
        this.f161826b.f157216k = m181899e();
        this.f161826b.f157217l = m181899e();
    }

    /* JADX INFO: renamed from: m */
    public final int m181907m() {
        return this.f161825a.getInt();
    }

    /* JADX INFO: renamed from: n */
    public final void m181908n(int i) {
        if (i % 3 != 0) {
            this.f161826b.f199248a = 1;
        } else {
            m181913s(i);
        }
    }

    /* JADX INFO: renamed from: o */
    public short m181909o() {
        return (short) (this.f161825a.getShort() & 65535);
    }

    /* JADX INFO: renamed from: p */
    public final void m181910p() {
        this.f161825a = null;
        this.f161826b = new C19618r1();
    }

    /* JADX INFO: renamed from: q */
    public C19823s1 m181911q(@NonNull ByteBuffer byteBuffer) {
        m181910p();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f161825a = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f161825a.order(ByteOrder.BIG_ENDIAN);
        return this;
    }

    /* JADX INFO: renamed from: r */
    public C19823s1 m181912r(@Nullable byte[] bArr) {
        if (bArr != null) {
            m181911q(ByteBuffer.wrap(bArr));
            return this;
        }
        this.f161825a = null;
        this.f161826b.f199248a = 2;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public final void m181913s(int i) {
        this.f161825a.position(Math.min(this.f161825a.position() + i, this.f161825a.limit()));
    }
}
