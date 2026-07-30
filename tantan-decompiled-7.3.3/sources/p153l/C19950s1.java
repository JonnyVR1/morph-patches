package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.tantanapp.common.utils.CrashHelper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import p151v.emoji.base.apngdecoder.PngColourType;

/* JADX INFO: renamed from: l.s1 */
/* JADX INFO: loaded from: classes3.dex */
public class C19950s1 {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f165745a;

    /* JADX INFO: renamed from: b */
    public C19723r1 f165746b;

    /* JADX INFO: renamed from: c */
    public int f165747c = 0;

    /* JADX INFO: renamed from: d */
    public List<C19009o1> f165748d = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final boolean m183993a() {
        for (int i = 0; i < 8; i++) {
            if (m183997e() != C19268p1.f150125a[i]) {
                this.f165746b.f180002a = 1;
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m183994b() {
        return this.f165746b.f180002a != 0;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public C19723r1 m183995c() {
        if (this.f165745a == null) {
            wtq0.m207906a("You must call setData() before parseHeader()");
            return null;
        }
        if (m183994b()) {
            return this.f165746b;
        }
        m184001i();
        C19723r1 c19723r1 = this.f165746b;
        if (c19723r1.f180003b < 0) {
            c19723r1.f180002a = 1;
        }
        return c19723r1;
    }

    /* JADX INFO: renamed from: d */
    public final void m183996d() {
        this.f165746b.f180003b = m184005m();
        this.f165746b.f180008g = m184005m();
    }

    /* JADX INFO: renamed from: e */
    public final byte m183997e() {
        return this.f165745a.get();
    }

    /* JADX INFO: renamed from: f */
    public final void m183998f() {
        m184011s(4);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: g */
    public final void m183999g() {
        C19485q1 c19485q1 = new C19485q1();
        this.f165746b.f180004c = c19485q1;
        int iM184005m = m184005m();
        int i = this.f165747c;
        if (iM184005m != i) {
            this.f165746b.f180002a = 1;
            return;
        }
        this.f165747c = i + 1;
        c19485q1.f155126d = iM184005m;
        c19485q1.f155127e = m184005m();
        c19485q1.f155128f = m184005m();
        c19485q1.f155129g = m184005m();
        c19485q1.f155130h = m184005m();
        c19485q1.m174801b(m184007o(), m184007o());
        c19485q1.m174802c(m183997e());
        c19485q1.m174800a(m183997e());
        if (this.f165745a.position() + 4 < this.f165745a.limit()) {
            this.f165746b.f180005d.add(c19485q1);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m184000h(int i) {
        if (m184005m() != this.f165747c) {
            this.f165746b.f180002a = 1;
            return;
        }
        if (i > this.f165745a.remaining()) {
            List<T> list = this.f165746b.f180005d;
            list.remove(list.size() - 1);
        } else {
            this.f165747c++;
            ((C19485q1) this.f165746b.f180004c).f175345c = this.f165745a.position();
            T t = this.f165746b.f180004c;
            ((C19485q1) t).f155132j = i - 4;
            ((C19485q1) t).f155133k = true;
        }
        m184011s(i - 4);
    }

    /* JADX INFO: renamed from: i */
    public final void m184001i() {
        m184002j(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: j */
    public final void m184002j(int i) {
        if (m183993a()) {
            while (true) {
                boolean z = false;
                while (true) {
                    if (!m183994b() && !z && this.f165747c < i) {
                        int iM184005m = m184005m();
                        switch (m184005m()) {
                            case 1229209940:
                                m184003k(iM184005m);
                                break;
                            case 1229278788:
                                this.f165746b.f160745p = this.f165745a.position() - 8;
                                z = true;
                                break;
                            case 1229472850:
                                if (iM184005m == 13) {
                                    m184004l();
                                } else {
                                    this.f165746b.f180002a = 1;
                                }
                                break;
                            case 1347179589:
                                m184006n(iM184005m);
                                break;
                            case 1633899596:
                                if (iM184005m == 8) {
                                    m183996d();
                                } else {
                                    this.f165746b.f180002a = 1;
                                }
                                break;
                            case 1717785676:
                                if (iM184005m == 26) {
                                    m183999g();
                                } else {
                                    this.f165746b.f180002a = 1;
                                }
                                break;
                            case 1717846356:
                                m184000h(iM184005m);
                                break;
                            case 1767135348:
                            case 1950701684:
                            case 1950960965:
                            case 2052348020:
                                this.f165748d.add(new C19009o1(iM184005m + 12, this.f165745a.position() - 8));
                                m184011s(iM184005m);
                                break;
                            default:
                                m184011s(iM184005m);
                                break;
                        }
                        m183998f();
                        if (!z) {
                            if (this.f165745a.position() >= this.f165745a.limit()) {
                                z = true;
                            }
                        }
                    }
                }
            }
            if (!this.f165748d.isEmpty()) {
                this.f165746b.f160746q = (C19009o1[]) this.f165748d.toArray(new C19009o1[0]);
            }
            C19723r1 c19723r1 = this.f165746b;
            if (c19723r1.f180003b != c19723r1.f180005d.size()) {
                C19723r1 c19723r2 = this.f165746b;
                c19723r2.f180003b = c19723r2.f180005d.size();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m184003k(int i) {
        C19723r1 c19723r1 = this.f165746b;
        int i2 = c19723r1.f160742m;
        ByteBuffer byteBuffer = this.f165745a;
        if (i2 != 0) {
            c19723r1.f160743n = byteBuffer.position() - 8;
        } else {
            c19723r1.f160742m = byteBuffer.position() - 8;
        }
        this.f165748d.clear();
        if (this.f165747c > 0) {
            C19723r1 c19723r2 = this.f165746b;
            c19723r2.f160744o = true;
            ((C19485q1) c19723r2.f180004c).f175345c = this.f165745a.position();
            ((C19485q1) this.f165746b.f180004c).f155132j = Math.min(i, this.f165745a.remaining());
        }
        m184011s(i);
    }

    /* JADX INFO: renamed from: l */
    public final void m184004l() {
        this.f165746b.f180006e = m184005m();
        this.f165746b.f180007f = m184005m();
        this.f165746b.f160737h = m183997e();
        try {
            this.f165746b.f160738i = PngColourType.fromByte(m183997e());
        } catch (IllegalArgumentException e) {
            CrashHelper.m82479c(e);
            this.f165746b.f180002a = 1;
        }
        this.f165746b.f160739j = m183997e();
        this.f165746b.f160740k = m183997e();
        this.f165746b.f160741l = m183997e();
    }

    /* JADX INFO: renamed from: m */
    public final int m184005m() {
        return this.f165745a.getInt();
    }

    /* JADX INFO: renamed from: n */
    public final void m184006n(int i) {
        if (i % 3 != 0) {
            this.f165746b.f180002a = 1;
        } else {
            m184011s(i);
        }
    }

    /* JADX INFO: renamed from: o */
    public short m184007o() {
        return (short) (this.f165745a.getShort() & 65535);
    }

    /* JADX INFO: renamed from: p */
    public final void m184008p() {
        this.f165745a = null;
        this.f165746b = new C19723r1();
    }

    /* JADX INFO: renamed from: q */
    public C19950s1 m184009q(@NonNull ByteBuffer byteBuffer) {
        m184008p();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f165745a = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f165745a.order(ByteOrder.BIG_ENDIAN);
        return this;
    }

    /* JADX INFO: renamed from: r */
    public C19950s1 m184010r(@Nullable byte[] bArr) {
        if (bArr != null) {
            m184009q(ByteBuffer.wrap(bArr));
            return this;
        }
        this.f165745a = null;
        this.f165746b.f180002a = 2;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public final void m184011s(int i) {
        this.f165745a.position(Math.min(this.f165745a.position() + i, this.f165745a.limit()));
    }
}
