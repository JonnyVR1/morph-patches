package p009l;

import com.p000p1.mobile.putong.live.livingroom.voice.intl.roombg.common.IntlVoiceBgPagerView;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.roombg.common.VoiceBackgroundView;
import java.util.ArrayList;
import java.util.List;
import l.bsm;
import l.bwr;
import l.d30;
import l.e30;
import l.fcm0;
import l.soj0;
import l.wxs;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class bvn0 extends pvn0 {

    /* JADX INFO: renamed from: j */
    public List<IntlVoiceBgPagerView> f10330j;

    /* JADX INFO: renamed from: k */
    public epp f10331k;

    /* JADX INFO: renamed from: l */
    public rpp f10332l;

    public bvn0(bsm<? extends fcm0> bsmVar, VoiceBackgroundView voiceBackgroundView) {
        super(bsmVar, voiceBackgroundView);
        this.f10330j = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public /* synthetic */ void m12291P3(soj0 soj0Var) {
        m12295S3();
    }

    private void init() {
        this.f10330j.clear();
        C(new rvn0());
        upp uppVar = new upp();
        hpp hppVar = new hpp();
        this.f10331k = z2(new epp(((wxs) this).e, hppVar));
        this.f10332l = z2(new rpp(((wxs) this).e, uppVar));
        this.f10330j.add(uppVar.m23128d());
        this.f10330j.add(hppVar.m15926d());
    }

    @Override // p009l.pvn0
    /* JADX INFO: renamed from: K3 */
    public List<IntlVoiceBgPagerView> mo12292K3() {
        return this.f10330j;
    }

    @Override // p009l.pvn0
    /* JADX INFO: renamed from: M3 */
    public void mo12293M3(int i) {
        if (i == 0) {
            this.f10332l.m21773U3();
        } else {
            this.f10331k.m14089R3();
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m12294R3() {
        ((rvn0) ((bwr) this).viewModel).m21839i();
    }

    /* JADX INFO: renamed from: S3 */
    public final void m12295S3() {
        if (((bwr) this).viewModel == null) {
            init();
        }
        ((rvn0) ((bwr) this).viewModel).m21845q();
    }

    /* JADX INFO: renamed from: T */
    public void m12296T() {
        super/*l.k4t*/.T();
    }

    @Override // p009l.pvn0
    /* JADX INFO: renamed from: t */
    public void mo12297t() {
        super.mo12297t();
        h3(F2().VoiceRoomBgEvent.openVoiceRoomBgDialog(), new e30() { // from class: l.zun0
            public final void call(Object obj) {
                this.f23919a.m12291P3((soj0) obj);
            }
        });
        g3(F2().VoiceRoomBgEvent.changeMeTab(), new d30() { // from class: l.avn0
            public final void call() {
                this.f9711a.m12294R3();
            }
        });
    }
}
