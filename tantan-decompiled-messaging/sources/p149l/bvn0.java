package p149l;

import com.p046p1.mobile.putong.live.livingroom.voice.intl.roombg.common.IntlVoiceBgPagerView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.roombg.common.VoiceBackgroundView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class bvn0 extends pvn0 {

    /* JADX INFO: renamed from: j */
    public List<IntlVoiceBgPagerView> f77479j;

    /* JADX INFO: renamed from: k */
    public epp f77480k;

    /* JADX INFO: renamed from: l */
    public rpp f77481l;

    public bvn0(bsm<? extends fcm0> bsmVar, VoiceBackgroundView voiceBackgroundView) {
        super(bsmVar, voiceBackgroundView);
        this.f77479j = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public /* synthetic */ void m104067P3(soj0 soj0Var) {
        m104071S3();
    }

    private void init() {
        this.f77479j.clear();
        mo51532C(new rvn0());
        upp uppVar = new upp();
        hpp hppVar = new hpp();
        this.f77480k = (epp) m144512z2(new epp(this.f188512e, hppVar));
        this.f77481l = (rpp) m144512z2(new rpp(this.f188512e, uppVar));
        this.f77479j.add(uppVar.m194903d());
        this.f77479j.add(hppVar.m132374d());
    }

    @Override // p149l.pvn0
    /* JADX INFO: renamed from: K3 */
    public List<IntlVoiceBgPagerView> mo104068K3() {
        return this.f77479j;
    }

    @Override // p149l.pvn0
    /* JADX INFO: renamed from: M3 */
    public void mo104069M3(int i) {
        if (i == 0) {
            this.f77481l.m180383U3();
        } else {
            this.f77480k.m117669R3();
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m104070R3() {
        ((rvn0) this.viewModel).m181320i();
    }

    /* JADX INFO: renamed from: S3 */
    public final void m104071S3() {
        if (this.viewModel == 0) {
            init();
        }
        ((rvn0) this.viewModel).m181325q();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
    }

    @Override // p149l.pvn0, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129304h3(m206028F2().VoiceRoomBgEvent.openVoiceRoomBgDialog(), new e30() { // from class: l.zun0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204868a.m104067P3((soj0) obj);
            }
        });
        m129303g3(m206028F2().VoiceRoomBgEvent.changeMeTab(), new d30() { // from class: l.avn0
            @Override // p149l.d30
            public final void call() {
                this.f71954a.m104070R3();
            }
        });
    }
}
