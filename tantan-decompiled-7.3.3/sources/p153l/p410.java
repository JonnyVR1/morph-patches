package p153l;

import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes4.dex */
public class p410 extends eas implements xzl {

    /* JADX INFO: renamed from: a */
    public v6m f150488a;

    /* JADX INFO: renamed from: b */
    public final u1f f150489b;

    /* JADX INFO: renamed from: c */
    public x20 f150490c;

    /* JADX INFO: renamed from: d */
    public qcj<Boolean, Float> f150491d;

    /* JADX INFO: renamed from: e */
    public boolean f150492e;

    public p410(u1f u1fVar) {
        this.f150489b = u1fVar;
    }

    @Override // p153l.xzl
    /* JADX INFO: renamed from: N */
    public void mo170509N(boolean z) {
        this.f150488a.mo69724N(z);
    }

    @Override // p153l.xzl
    /* JADX INFO: renamed from: P */
    public void mo170510P(int i, boolean z) {
        this.f150488a.mo69726P(i, z);
    }

    @Override // p153l.xzl
    /* JADX INFO: renamed from: Q */
    public void mo170511Q(qcj<Boolean, Float> qcjVar) {
        this.f150491d = qcjVar;
    }

    /* JADX INFO: renamed from: S0 */
    public void m170512S0(String str, int i, String str2) {
        this.f150488a.mo69740b0(str, i, str2);
    }

    /* JADX INFO: renamed from: T0 */
    public void m170513T0(int i, int i2) {
        v6m v6mVar = this.f150488a;
        if (v6mVar != null) {
            v6mVar.mo69771y(i, i2);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public int m170514U0(MMLiveMediaConfig mMLiveMediaConfig, MMLiveRoomParams mMLiveRoomParams, MMLiveTranscoding mMLiveTranscoding) {
        try {
            synchronized (p410.class) {
                try {
                    v6m v6mVar = this.f150488a;
                    if (v6mVar != null) {
                        this.f150492e = true;
                        v6mVar.mo69728R(mMLiveMediaConfig, mMLiveRoomParams, mMLiveTranscoding);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return 0;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m170515V0() {
        this.f150488a = this.f150489b.f176993b;
    }

    /* JADX INFO: renamed from: W0 */
    public boolean m170516W0() {
        return this.f150492e;
    }

    /* JADX INFO: renamed from: X0 */
    public void m170517X0() {
        this.f150492e = false;
        v6m v6mVar = this.f150488a;
        if (v6mVar == null) {
            nsh0.m164608j("[live][motion]", "mLiveEngine == null  ");
            return;
        }
        v6mVar.mo69730T();
        if (this.f150490c == null) {
            nsh0.m164608j("[live][motion]", " leaveRoom 后的回调 为null  ");
            return;
        }
        nsh0.m164608j("[live][motion]", " 执行leaveRoom 后的回调 ");
        this.f150490c.call();
        this.f150490c = null;
    }

    @Override // p153l.xzl
    /* JADX INFO: renamed from: Y */
    public void mo170518Y(int i, boolean z) {
        this.f150488a.mo69726P(i, z);
    }

    /* JADX INFO: renamed from: Y0 */
    public void m170519Y0() {
        this.f150488a.mo69744d0(false);
    }

    /* JADX INFO: renamed from: Z0 */
    public void m170520Z0() {
        fhw.m125605a("[live]sdk_engine", "onResume");
        this.f150488a.mo69744d0(true);
    }

    /* JADX INFO: renamed from: a1 */
    public synchronized void m170521a1() {
        this.f150488a = null;
        this.f150491d = null;
    }

    /* JADX INFO: renamed from: b1 */
    public void m170522b1() {
        this.f150488a.mo69750g0();
    }

    @Override // p153l.xzl
    /* JADX INFO: renamed from: c0 */
    public void mo170523c0(x20 x20Var) {
        this.f150490c = x20Var;
    }

    /* JADX INFO: renamed from: c1 */
    public void m170524c1(boolean z) {
        this.f150488a.mo69720J(z);
    }

    /* JADX INFO: renamed from: d1 */
    public void m170525d1(MMLiveRoomParams.MMLiveClientRole mMLiveClientRole) {
        this.f150488a.mo69735Y(mMLiveClientRole);
    }

    /* JADX INFO: renamed from: e1 */
    public void m170526e1(boolean z) {
        this.f150488a.mo69729S(z);
    }

    /* JADX INFO: renamed from: f1 */
    public void m170527f1(MMLiveTranscoding mMLiveTranscoding) {
        v6m v6mVar = this.f150488a;
        if (v6mVar != null) {
            v6mVar.mo69722L(mMLiveTranscoding);
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void m170528g1(MMLiveMediaConfig mMLiveMediaConfig) {
        v6m v6mVar = this.f150488a;
        if (v6mVar != null) {
            v6mVar.mo69742c0(mMLiveMediaConfig);
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m170529h1(String str) {
        this.f150488a.mo69717G(str);
    }

    @Override // p153l.xzl
    /* JADX INFO: renamed from: i0 */
    public void mo170530i0(boolean z) {
        qcj<Boolean, Float> qcjVar = this.f150491d;
        v6m v6mVar = this.f150488a;
        if (qcjVar != null) {
            v6mVar.mo69711A(qcjVar.call(Boolean.valueOf(z)).floatValue());
        } else {
            v6mVar.mo69711A(z ? 0.0f : 1.0f);
        }
    }

    /* JADX INFO: renamed from: i1 */
    public void m170531i1(cgu cguVar) {
        this.f150488a.mo69756j0(cguVar);
    }

    /* JADX INFO: renamed from: j1 */
    public void m170532j1(int i) {
        this.f150488a.mo69731U(i);
    }

    /* JADX INFO: renamed from: k1 */
    public void m170533k1(String str) {
        this.f150488a.mo69712B(str);
    }

    /* JADX INFO: renamed from: l1 */
    public void m170534l1(String str) {
        this.f150488a.mo69748f0(str);
    }

    /* JADX INFO: renamed from: m1 */
    public int m170535m1(MMLiveMediaConfig mMLiveMediaConfig) {
        return this.f150488a.mo69719I(mMLiveMediaConfig);
    }

    @Override // p153l.xzl
    /* JADX INFO: renamed from: n */
    public void mo170536n(boolean z) {
        fhw.m125605a("[live]sdk_engine", "setLocalAudioMute:" + z);
        this.f150488a.mo69760n(z);
    }

    /* JADX INFO: renamed from: n1 */
    public void m170537n1() {
        fhw.m125605a("[live]sdk_engine", "stopPush");
        this.f150488a.mo69734X();
    }

    @Override // p153l.xzl
    /* JADX INFO: renamed from: o */
    public void mo170538o(String str) {
        fhw.m125605a("[live]sdk_engine", "updateChannelKey:" + str);
        this.f150488a.mo69761o(str);
    }

    /* JADX INFO: renamed from: o1 */
    public void m170539o1(String str) {
        this.f150488a.mo69733W(str);
    }

    @Override // p153l.xzl
    /* JADX INFO: renamed from: p */
    public void mo170540p(boolean z) {
        this.f150488a.mo69762p(z);
    }
}
