package p149l;

import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes4.dex */
public class hw00 extends d8s implements exl {

    /* JADX INFO: renamed from: a */
    public f4m f109710a;

    /* JADX INFO: renamed from: b */
    public final q0f f109711b;

    /* JADX INFO: renamed from: c */
    public d30 f109712c;

    /* JADX INFO: renamed from: d */
    public w9j<Boolean, Float> f109713d;

    /* JADX INFO: renamed from: e */
    public boolean f109714e;

    public hw00(q0f q0fVar) {
        this.f109711b = q0fVar;
    }

    @Override // p149l.exl
    /* JADX INFO: renamed from: N */
    public void mo118673N(boolean z) {
        this.f109710a.mo68541N(z);
    }

    @Override // p149l.exl
    /* JADX INFO: renamed from: P */
    public void mo118674P(int i, boolean z) {
        this.f109710a.mo68543P(i, z);
    }

    @Override // p149l.exl
    /* JADX INFO: renamed from: Q */
    public void mo118675Q(w9j<Boolean, Float> w9jVar) {
        this.f109713d = w9jVar;
    }

    /* JADX INFO: renamed from: S0 */
    public void m133209S0(String str, int i, String str2) {
        this.f109710a.mo68557b0(str, i, str2);
    }

    /* JADX INFO: renamed from: T0 */
    public void m133210T0(int i, int i2) {
        f4m f4mVar = this.f109710a;
        if (f4mVar != null) {
            f4mVar.mo68588y(i, i2);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public int m133211U0(MMLiveMediaConfig mMLiveMediaConfig, MMLiveRoomParams mMLiveRoomParams, MMLiveTranscoding mMLiveTranscoding) {
        try {
            synchronized (hw00.class) {
                try {
                    f4m f4mVar = this.f109710a;
                    if (f4mVar != null) {
                        this.f109714e = true;
                        f4mVar.mo68545R(mMLiveMediaConfig, mMLiveRoomParams, mMLiveTranscoding);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return 0;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m133212V0() {
        this.f109710a = this.f109711b.f152050b;
    }

    /* JADX INFO: renamed from: W0 */
    public boolean m133213W0() {
        return this.f109714e;
    }

    /* JADX INFO: renamed from: X0 */
    public void m133214X0() {
        this.f109714e = false;
        f4m f4mVar = this.f109710a;
        if (f4mVar == null) {
            gkh0.m126627j("[live][motion]", "mLiveEngine == null  ");
            return;
        }
        f4mVar.mo68547T();
        if (this.f109712c == null) {
            gkh0.m126627j("[live][motion]", " leaveRoom 后的回调 为null  ");
            return;
        }
        gkh0.m126627j("[live][motion]", " 执行leaveRoom 后的回调 ");
        this.f109712c.call();
        this.f109712c = null;
    }

    @Override // p149l.exl
    /* JADX INFO: renamed from: Y */
    public void mo118676Y(int i, boolean z) {
        this.f109710a.mo68543P(i, z);
    }

    /* JADX INFO: renamed from: Y0 */
    public void m133215Y0() {
        this.f109710a.mo68561d0(false);
    }

    /* JADX INFO: renamed from: Z0 */
    public void m133216Z0() {
        hfw.m130790a("[live]sdk_engine", "onResume");
        this.f109710a.mo68561d0(true);
    }

    /* JADX INFO: renamed from: a1 */
    public synchronized void m133217a1() {
        this.f109710a = null;
        this.f109713d = null;
    }

    /* JADX INFO: renamed from: b1 */
    public void m133218b1() {
        this.f109710a.mo68567g0();
    }

    @Override // p149l.exl
    /* JADX INFO: renamed from: c0 */
    public void mo118677c0(d30 d30Var) {
        this.f109712c = d30Var;
    }

    /* JADX INFO: renamed from: c1 */
    public void m133219c1(boolean z) {
        this.f109710a.mo68537J(z);
    }

    /* JADX INFO: renamed from: d1 */
    public void m133220d1(MMLiveRoomParams.MMLiveClientRole mMLiveClientRole) {
        this.f109710a.mo68552Y(mMLiveClientRole);
    }

    /* JADX INFO: renamed from: e1 */
    public void m133221e1(boolean z) {
        this.f109710a.mo68546S(z);
    }

    /* JADX INFO: renamed from: f1 */
    public void m133222f1(MMLiveTranscoding mMLiveTranscoding) {
        f4m f4mVar = this.f109710a;
        if (f4mVar != null) {
            f4mVar.mo68539L(mMLiveTranscoding);
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void m133223g1(MMLiveMediaConfig mMLiveMediaConfig) {
        f4m f4mVar = this.f109710a;
        if (f4mVar != null) {
            f4mVar.mo68559c0(mMLiveMediaConfig);
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m133224h1(String str) {
        this.f109710a.mo68534G(str);
    }

    @Override // p149l.exl
    /* JADX INFO: renamed from: i0 */
    public void mo118678i0(boolean z) {
        w9j<Boolean, Float> w9jVar = this.f109713d;
        f4m f4mVar = this.f109710a;
        if (w9jVar != null) {
            f4mVar.mo68528A(w9jVar.call(Boolean.valueOf(z)).floatValue());
        } else {
            f4mVar.mo68528A(z ? 0.0f : 1.0f);
        }
    }

    /* JADX INFO: renamed from: i1 */
    public void m133225i1(beu beuVar) {
        this.f109710a.mo68573j0(beuVar);
    }

    /* JADX INFO: renamed from: j1 */
    public void m133226j1(int i) {
        this.f109710a.mo68548U(i);
    }

    /* JADX INFO: renamed from: k1 */
    public void m133227k1(String str) {
        this.f109710a.mo68529B(str);
    }

    /* JADX INFO: renamed from: l1 */
    public void m133228l1(String str) {
        this.f109710a.mo68565f0(str);
    }

    /* JADX INFO: renamed from: m1 */
    public int m133229m1(MMLiveMediaConfig mMLiveMediaConfig) {
        return this.f109710a.mo68536I(mMLiveMediaConfig);
    }

    @Override // p149l.exl
    /* JADX INFO: renamed from: n */
    public void mo118679n(boolean z) {
        hfw.m130790a("[live]sdk_engine", "setLocalAudioMute:" + z);
        this.f109710a.mo68577n(z);
    }

    /* JADX INFO: renamed from: n1 */
    public void m133230n1() {
        hfw.m130790a("[live]sdk_engine", "stopPush");
        this.f109710a.mo68551X();
    }

    @Override // p149l.exl
    /* JADX INFO: renamed from: o */
    public void mo118680o(String str) {
        hfw.m130790a("[live]sdk_engine", "updateChannelKey:" + str);
        this.f109710a.mo68578o(str);
    }

    /* JADX INFO: renamed from: o1 */
    public void m133231o1(String str) {
        this.f109710a.mo68550W(str);
    }

    @Override // p149l.exl
    /* JADX INFO: renamed from: p */
    public void mo118681p(boolean z) {
        this.f109710a.mo68579p(z);
    }
}
