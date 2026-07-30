package p149l;

import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes13.dex */
public class iw00 extends d8s implements fxl {

    /* JADX INFO: renamed from: a */
    public f4m f115217a;

    /* JADX INFO: renamed from: b */
    public final r0f f115218b;

    public iw00(r0f r0fVar) {
        this.f115218b = r0fVar;
    }

    /* JADX INFO: renamed from: N */
    public void m138704N(boolean z) {
        this.f115217a.mo68541N(z);
    }

    /* JADX INFO: renamed from: S0 */
    public int m138705S0(MMLiveMediaConfig mMLiveMediaConfig, MMLiveRoomParams mMLiveRoomParams, MMLiveTranscoding mMLiveTranscoding) {
        try {
            synchronized (iw00.class) {
                try {
                    f4m f4mVar = this.f115217a;
                    if (f4mVar != null) {
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

    /* JADX INFO: renamed from: T0 */
    public void m138706T0() {
        this.f115217a = this.f115218b.f157167b;
    }

    /* JADX INFO: renamed from: U0 */
    public void m138707U0() {
        f4m f4mVar = this.f115217a;
        if (f4mVar == null) {
            gkh0.m126627j("videoChat", "mLiveEngine == null  ");
        } else {
            f4mVar.mo68547T();
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m138709W0() {
        gkh0.m126627j("videoChat", "onResume");
    }

    /* JADX INFO: renamed from: X0 */
    public synchronized void m138710X0() {
        this.f115217a = null;
    }

    /* JADX INFO: renamed from: Y0 */
    public void m138711Y0(boolean z) {
        this.f115217a.mo68546S(z);
    }

    /* JADX INFO: renamed from: Z0 */
    public void m138712Z0(MMLiveTranscoding mMLiveTranscoding) {
        this.f115217a.mo68539L(mMLiveTranscoding);
    }

    /* JADX INFO: renamed from: a1 */
    public void m138713a1(MMLiveMediaConfig mMLiveMediaConfig) {
        f4m f4mVar = this.f115217a;
        if (f4mVar != null) {
            f4mVar.mo68559c0(mMLiveMediaConfig);
        }
    }

    /* JADX INFO: renamed from: b1 */
    public void m138714b1(String str) {
        this.f115217a.mo68534G(str);
    }

    /* JADX INFO: renamed from: c1 */
    public void m138715c1(beu beuVar) {
        this.f115217a.mo68573j0(beuVar);
    }

    @Override // p149l.fxl
    /* JADX INFO: renamed from: n */
    public void mo123635n(boolean z) {
        gkh0.m126627j("videoChat", "setLocalAudioMute:" + z);
        this.f115217a.mo68577n(z);
    }

    @Override // p149l.fxl
    /* JADX INFO: renamed from: o */
    public void mo123636o(String str) {
        gkh0.m126627j("videoChat", " push engine updateChannelKey:" + str);
        this.f115217a.mo68578o(str);
    }

    /* JADX INFO: renamed from: V0 */
    public void m138708V0() {
    }
}
