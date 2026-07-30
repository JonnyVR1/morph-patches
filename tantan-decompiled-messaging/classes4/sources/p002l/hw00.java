package p002l;

import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.tantanapp.common.utils.CrashHelper;
import l.beu;
import l.d30;
import l.d8s;
import l.f4m;
import l.gkh0;
import l.hfw;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hw00 extends d8s implements exl {

    /* JADX INFO: renamed from: a */
    public f4m f12305a;

    /* JADX INFO: renamed from: b */
    public final q0f f12306b;

    /* JADX INFO: renamed from: c */
    public d30 f12307c;

    /* JADX INFO: renamed from: d */
    public w9j<Boolean, Float> f12308d;

    /* JADX INFO: renamed from: e */
    public boolean f12309e;

    public hw00(q0f q0fVar) {
        this.f12306b = q0fVar;
    }

    @Override // p002l.exl
    /* JADX INFO: renamed from: N */
    public void mo12833N(boolean z) {
        this.f12305a.N(z);
    }

    @Override // p002l.exl
    /* JADX INFO: renamed from: P */
    public void mo12834P(int i, boolean z) {
        this.f12305a.P(i, z);
    }

    @Override // p002l.exl
    /* JADX INFO: renamed from: Q */
    public void mo12835Q(w9j<Boolean, Float> w9jVar) {
        this.f12308d = w9jVar;
    }

    /* JADX INFO: renamed from: S0 */
    public void m14860S0(String str, int i, String str2) {
        this.f12305a.b0(str, i, str2);
    }

    /* JADX INFO: renamed from: T0 */
    public void m14861T0(int i, int i2) {
        f4m f4mVar = this.f12305a;
        if (f4mVar != null) {
            f4mVar.y(i, i2);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public int m14862U0(MMLiveMediaConfig mMLiveMediaConfig, MMLiveRoomParams mMLiveRoomParams, MMLiveTranscoding mMLiveTranscoding) {
        try {
            synchronized (hw00.class) {
                try {
                    f4m f4mVar = this.f12305a;
                    if (f4mVar != null) {
                        this.f12309e = true;
                        f4mVar.R(mMLiveMediaConfig, mMLiveRoomParams, mMLiveTranscoding);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return 0;
        } catch (Exception e) {
            CrashHelper.c(e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m14863V0() {
        this.f12305a = this.f12306b.f17743b;
    }

    /* JADX INFO: renamed from: W0 */
    public boolean m14864W0() {
        return this.f12309e;
    }

    /* JADX INFO: renamed from: X0 */
    public void m14865X0() {
        this.f12309e = false;
        f4m f4mVar = this.f12305a;
        if (f4mVar == null) {
            gkh0.j("[live][motion]", "mLiveEngine == null  ");
            return;
        }
        f4mVar.T();
        if (this.f12307c == null) {
            gkh0.j("[live][motion]", " leaveRoom 后的回调 为null  ");
            return;
        }
        gkh0.j("[live][motion]", " 执行leaveRoom 后的回调 ");
        this.f12307c.call();
        this.f12307c = null;
    }

    @Override // p002l.exl
    /* JADX INFO: renamed from: Y */
    public void mo12836Y(int i, boolean z) {
        this.f12305a.P(i, z);
    }

    /* JADX INFO: renamed from: Y0 */
    public void m14866Y0() {
        this.f12305a.d0(false);
    }

    /* JADX INFO: renamed from: Z0 */
    public void m14867Z0() {
        hfw.a("[live]sdk_engine", "onResume");
        this.f12305a.d0(true);
    }

    /* JADX INFO: renamed from: a1 */
    public synchronized void m14868a1() {
        this.f12305a = null;
        this.f12308d = null;
    }

    /* JADX INFO: renamed from: b1 */
    public void m14869b1() {
        this.f12305a.g0();
    }

    @Override // p002l.exl
    /* JADX INFO: renamed from: c0 */
    public void mo12837c0(d30 d30Var) {
        this.f12307c = d30Var;
    }

    /* JADX INFO: renamed from: c1 */
    public void m14870c1(boolean z) {
        this.f12305a.J(z);
    }

    /* JADX INFO: renamed from: d1 */
    public void m14871d1(MMLiveRoomParams.MMLiveClientRole mMLiveClientRole) {
        this.f12305a.Y(mMLiveClientRole);
    }

    /* JADX INFO: renamed from: e1 */
    public void m14872e1(boolean z) {
        this.f12305a.S(z);
    }

    /* JADX INFO: renamed from: f1 */
    public void m14873f1(MMLiveTranscoding mMLiveTranscoding) {
        f4m f4mVar = this.f12305a;
        if (f4mVar != null) {
            f4mVar.L(mMLiveTranscoding);
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void m14874g1(MMLiveMediaConfig mMLiveMediaConfig) {
        f4m f4mVar = this.f12305a;
        if (f4mVar != null) {
            f4mVar.c0(mMLiveMediaConfig);
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m14875h1(String str) {
        this.f12305a.G(str);
    }

    @Override // p002l.exl
    /* JADX INFO: renamed from: i0 */
    public void mo12838i0(boolean z) {
        w9j<Boolean, Float> w9jVar = this.f12308d;
        f4m f4mVar = this.f12305a;
        if (w9jVar != null) {
            f4mVar.A(((Float) w9jVar.call(Boolean.valueOf(z))).floatValue());
        } else {
            f4mVar.A(z ? 0.0f : 1.0f);
        }
    }

    /* JADX INFO: renamed from: i1 */
    public void m14876i1(beu beuVar) {
        this.f12305a.j0(beuVar);
    }

    /* JADX INFO: renamed from: j1 */
    public void m14877j1(int i) {
        this.f12305a.U(i);
    }

    /* JADX INFO: renamed from: k1 */
    public void m14878k1(String str) {
        this.f12305a.B(str);
    }

    /* JADX INFO: renamed from: l1 */
    public void m14879l1(String str) {
        this.f12305a.f0(str);
    }

    /* JADX INFO: renamed from: m1 */
    public int m14880m1(MMLiveMediaConfig mMLiveMediaConfig) {
        return this.f12305a.I(mMLiveMediaConfig);
    }

    @Override // p002l.exl
    /* JADX INFO: renamed from: n */
    public void mo12839n(boolean z) {
        hfw.a("[live]sdk_engine", "setLocalAudioMute:" + z);
        this.f12305a.n(z);
    }

    /* JADX INFO: renamed from: n1 */
    public void m14881n1() {
        hfw.a("[live]sdk_engine", "stopPush");
        this.f12305a.X();
    }

    @Override // p002l.exl
    /* JADX INFO: renamed from: o */
    public void mo12840o(String str) {
        hfw.a("[live]sdk_engine", "updateChannelKey:" + str);
        this.f12305a.o(str);
    }

    /* JADX INFO: renamed from: o1 */
    public void m14882o1(String str) {
        this.f12305a.W(str);
    }

    @Override // p002l.exl
    /* JADX INFO: renamed from: p */
    public void mo12841p(boolean z) {
        this.f12305a.p(z);
    }
}
