package p153l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1860d;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.InterfaceC2090y;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.common.collect.ImmutableList;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class esi0 extends AbstractC1860d implements Handler.Callback {

    /* JADX INFO: renamed from: A */
    @Nullable
    public sdg0 f95616A;

    /* JADX INFO: renamed from: B */
    @Nullable
    public sdg0 f95617B;

    /* JADX INFO: renamed from: C */
    public int f95618C;

    /* JADX INFO: renamed from: D */
    public long f95619D;

    /* JADX INFO: renamed from: E */
    public long f95620E;

    /* JADX INFO: renamed from: F */
    public long f95621F;

    /* JADX INFO: renamed from: p */
    @Nullable
    public final Handler f95622p;

    /* JADX INFO: renamed from: q */
    public final asi0 f95623q;

    /* JADX INFO: renamed from: r */
    public final pdg0 f95624r;

    /* JADX INFO: renamed from: s */
    public final p1j f95625s;

    /* JADX INFO: renamed from: t */
    public boolean f95626t;

    /* JADX INFO: renamed from: u */
    public boolean f95627u;

    /* JADX INFO: renamed from: v */
    public boolean f95628v;

    /* JADX INFO: renamed from: w */
    public int f95629w;

    /* JADX INFO: renamed from: x */
    @Nullable
    public C1894k f95630x;

    /* JADX INFO: renamed from: y */
    @Nullable
    public odg0 f95631y;

    /* JADX INFO: renamed from: z */
    @Nullable
    public rdg0 f95632z;

    public esi0(asi0 asi0Var, @Nullable Looper looper, pdg0 pdg0Var) {
        super(3);
        this.f95623q = (asi0) w11.m204369e(asi0Var);
        this.f95622p = looper == null ? null : bmk0.m105172v(looper, this);
        this.f95624r = pdg0Var;
        this.f95625s = new p1j();
        this.f95619D = -9223372036854775807L;
        this.f95620E = -9223372036854775807L;
        this.f95621F = -9223372036854775807L;
    }

    @SideEffectFree
    /* JADX INFO: renamed from: a0 */
    private long m122359a0(long j) {
        w11.m204371g(j != -9223372036854775807L);
        w11.m204371g(this.f95620E != -9223372036854775807L);
        return j - this.f95620E;
    }

    @Override // com.google.android.exoplayer2.AbstractC1860d
    /* JADX INFO: renamed from: L */
    public void mo9690L() {
        this.f95630x = null;
        this.f95619D = -9223372036854775807L;
        m122360X();
        this.f95620E = -9223372036854775807L;
        this.f95621F = -9223372036854775807L;
        m122367f0();
    }

    @Override // com.google.android.exoplayer2.AbstractC1860d
    /* JADX INFO: renamed from: N */
    public void mo9692N(long j, boolean z) {
        this.f95621F = j;
        m122360X();
        this.f95626t = false;
        this.f95627u = false;
        this.f95619D = -9223372036854775807L;
        if (this.f95629w != 0) {
            m122368g0();
        } else {
            m122366e0();
            ((odg0) w11.m204369e(this.f95631y)).flush();
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC1860d
    /* JADX INFO: renamed from: T */
    public void mo9825T(C1894k[] c1894kArr, long j, long j2) {
        this.f95620E = j2;
        this.f95630x = c1894kArr[0];
        if (this.f95631y != null) {
            this.f95629w = 1;
        } else {
            m122364c0();
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m122360X() {
        m122370i0(new qyb(ImmutableList.m15739of(), m122359a0(this.f95621F)));
    }

    @RequiresNonNull({"subtitle"})
    @SideEffectFree
    /* JADX INFO: renamed from: Y */
    public final long m122361Y(long j) {
        int iMo95504f = this.f95616A.mo95504f(j);
        if (iMo95504f == 0 || this.f95616A.mo95503b() == 0) {
            return this.f95616A.f132210b;
        }
        sdg0 sdg0Var = this.f95616A;
        return iMo95504f == -1 ? sdg0Var.mo95502a(sdg0Var.mo95503b() - 1) : sdg0Var.mo95502a(iMo95504f - 1);
    }

    /* JADX INFO: renamed from: Z */
    public final long m122362Z() {
        if (this.f95618C == -1) {
            return Long.MAX_VALUE;
        }
        w11.m204369e(this.f95616A);
        if (this.f95618C >= this.f95616A.mo95503b()) {
            return Long.MAX_VALUE;
        }
        return this.f95616A.mo95502a(this.f95618C);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2090y
    /* JADX INFO: renamed from: a */
    public int mo10438a(C1894k c1894k) {
        if (this.f95624r.mo171812a(c1894k)) {
            return InterfaceC2090y.m12266v(c1894k.f7772G == 0 ? 4 : 2);
        }
        return kb00.m149017r(c1894k.f7785l) ? InterfaceC2090y.m12266v(1) : InterfaceC2090y.m12266v(0);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    /* JADX INFO: renamed from: b */
    public boolean mo9707b() {
        return true;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m122363b0(SubtitleDecoderException subtitleDecoderException) {
        kyv.m152146d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f95630x, subtitleDecoderException);
        m122360X();
        m122368g0();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    /* JADX INFO: renamed from: c */
    public boolean mo9708c() {
        return this.f95627u;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m122364c0() {
        this.f95628v = true;
        this.f95631y = this.f95624r.mo171813b((C1894k) w11.m204369e(this.f95630x));
    }

    /* JADX INFO: renamed from: d0 */
    public final void m122365d0(qyb qybVar) {
        this.f95623q.mo10180p(qybVar.f160131a);
        this.f95623q.mo10172d(qybVar);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m122366e0() {
        this.f95632z = null;
        this.f95618C = -1;
        sdg0 sdg0Var = this.f95616A;
        if (sdg0Var != null) {
            sdg0Var.mo150584u();
            this.f95616A = null;
        }
        sdg0 sdg0Var2 = this.f95617B;
        if (sdg0Var2 != null) {
            sdg0Var2.mo150584u();
            this.f95617B = null;
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m122367f0() {
        m122366e0();
        ((odg0) w11.m204369e(this.f95631y)).release();
        this.f95631y = null;
        this.f95629w = 0;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m122368g0() {
        m122367f0();
        m122364c0();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x, com.google.android.exoplayer2.InterfaceC2090y
    public String getName() {
        return "TextRenderer";
    }

    /* JADX INFO: renamed from: h0 */
    public void m122369h0(long j) {
        w11.m204371g(mo9830g());
        this.f95619D = j;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m122365d0((qyb) message.obj);
            return true;
        }
        wpg0.m207458a();
        return false;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m122370i0(qyb qybVar) {
        Handler handler = this.f95622p;
        if (handler != null) {
            handler.obtainMessage(0, qybVar).sendToTarget();
        } else {
            m122365d0(qybVar);
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    /* JADX INFO: renamed from: j */
    public void mo10447j(long j, long j2) throws DecoderException {
        boolean z;
        this.f95621F = j;
        if (mo9830g()) {
            long j3 = this.f95619D;
            if (j3 != -9223372036854775807L && j >= j3) {
                m122366e0();
                this.f95627u = true;
            }
        }
        if (this.f95627u) {
            return;
        }
        if (this.f95617B == null) {
            ((odg0) w11.m204369e(this.f95631y)).mo131055b(j);
            try {
                this.f95617B = ((odg0) w11.m204369e(this.f95631y)).mo131056c();
            } catch (SubtitleDecoderException e) {
                m122363b0(e);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f95616A != null) {
            long jM122362Z = m122362Z();
            z = false;
            while (jM122362Z <= j) {
                this.f95618C++;
                jM122362Z = m122362Z();
                z = true;
            }
        } else {
            z = false;
        }
        sdg0 sdg0Var = this.f95617B;
        if (sdg0Var != null) {
            if (sdg0Var.m97779p()) {
                if (!z && m122362Z() == Long.MAX_VALUE) {
                    if (this.f95629w == 2) {
                        m122368g0();
                    } else {
                        m122366e0();
                        this.f95627u = true;
                    }
                }
            } else if (sdg0Var.f132210b <= j) {
                sdg0 sdg0Var2 = this.f95616A;
                if (sdg0Var2 != null) {
                    sdg0Var2.mo150584u();
                }
                this.f95618C = sdg0Var.mo95504f(j);
                this.f95616A = sdg0Var;
                this.f95617B = null;
                z = true;
            }
        }
        if (z) {
            w11.m204369e(this.f95616A);
            m122370i0(new qyb(this.f95616A.mo95505g(j), m122359a0(m122361Y(j))));
        }
        if (this.f95629w == 2) {
            return;
        }
        while (!this.f95626t) {
            try {
                rdg0 rdg0VarMo135120a = this.f95632z;
                if (rdg0VarMo135120a == null) {
                    rdg0VarMo135120a = ((odg0) w11.m204369e(this.f95631y)).mo135120a();
                    if (rdg0VarMo135120a == null) {
                        return;
                    } else {
                        this.f95632z = rdg0VarMo135120a;
                    }
                }
                if (this.f95629w == 1) {
                    rdg0VarMo135120a.m97783t(4);
                    ((odg0) w11.m204369e(this.f95631y)).mo135121d(rdg0VarMo135120a);
                    this.f95632z = null;
                    this.f95629w = 2;
                    return;
                }
                int iM9826U = m9826U(this.f95625s, rdg0VarMo135120a, 0);
                if (iM9826U == -4) {
                    if (rdg0VarMo135120a.m97779p()) {
                        this.f95626t = true;
                        this.f95628v = false;
                    } else {
                        C1894k c1894k = this.f95625s.f150174b;
                        if (c1894k == null) {
                            return;
                        }
                        rdg0VarMo135120a.f162308i = c1894k.f7789p;
                        rdg0VarMo135120a.m9860w();
                        this.f95628v &= !rdg0VarMo135120a.m97781r();
                    }
                    if (!this.f95628v) {
                        ((odg0) w11.m204369e(this.f95631y)).mo135121d(rdg0VarMo135120a);
                        this.f95632z = null;
                    }
                } else if (iM9826U == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e2) {
                m122363b0(e2);
                return;
            }
        }
    }

    public esi0(asi0 asi0Var, @Nullable Looper looper) {
        this(asi0Var, looper, pdg0.f151754a);
    }
}
