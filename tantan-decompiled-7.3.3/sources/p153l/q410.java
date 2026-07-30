package p153l;

import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes9.dex */
public class q410 extends eas implements yzl {

    /* JADX INFO: renamed from: a */
    public v6m f155513a;

    /* JADX INFO: renamed from: b */
    public final v1f f155514b;

    public q410(v1f v1fVar) {
        this.f155514b = v1fVar;
    }

    /* JADX INFO: renamed from: N */
    public void m175178N(boolean z) {
        this.f155513a.mo69724N(z);
    }

    /* JADX INFO: renamed from: S0 */
    public int m175179S0(MMLiveMediaConfig mMLiveMediaConfig, MMLiveRoomParams mMLiveRoomParams, MMLiveTranscoding mMLiveTranscoding) {
        try {
            synchronized (q410.class) {
                try {
                    v6m v6mVar = this.f155513a;
                    if (v6mVar != null) {
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

    /* JADX INFO: renamed from: T0 */
    public void m175180T0() {
        this.f155513a = this.f155514b.f181962b;
    }

    /* JADX INFO: renamed from: U0 */
    public void m175181U0() {
        v6m v6mVar = this.f155513a;
        if (v6mVar == null) {
            nsh0.m164608j("videoChat", "mLiveEngine == null  ");
        } else {
            v6mVar.mo69730T();
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m175183W0() {
        nsh0.m164608j("videoChat", "onResume");
    }

    /* JADX INFO: renamed from: X0 */
    public synchronized void m175184X0() {
        this.f155513a = null;
    }

    /* JADX INFO: renamed from: Y0 */
    public void m175185Y0(boolean z) {
        this.f155513a.mo69729S(z);
    }

    /* JADX INFO: renamed from: Z0 */
    public void m175186Z0(MMLiveTranscoding mMLiveTranscoding) {
        this.f155513a.mo69722L(mMLiveTranscoding);
    }

    /* JADX INFO: renamed from: a1 */
    public void m175187a1(MMLiveMediaConfig mMLiveMediaConfig) {
        v6m v6mVar = this.f155513a;
        if (v6mVar != null) {
            v6mVar.mo69742c0(mMLiveMediaConfig);
        }
    }

    /* JADX INFO: renamed from: b1 */
    public void m175188b1(String str) {
        this.f155513a.mo69717G(str);
    }

    /* JADX INFO: renamed from: c1 */
    public void m175189c1(cgu cguVar) {
        this.f155513a.mo69756j0(cguVar);
    }

    @Override // p153l.yzl
    /* JADX INFO: renamed from: n */
    public void mo175190n(boolean z) {
        nsh0.m164608j("videoChat", "setLocalAudioMute:" + z);
        this.f155513a.mo69760n(z);
    }

    @Override // p153l.yzl
    /* JADX INFO: renamed from: o */
    public void mo175191o(String str) {
        nsh0.m164608j("videoChat", " push engine updateChannelKey:" + str);
        this.f155513a.mo69761o(str);
    }

    /* JADX INFO: renamed from: V0 */
    public void m175182V0() {
    }
}
