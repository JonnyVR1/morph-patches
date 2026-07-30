package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBookInfo;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.giftwall.api.VoiceGiftWallApiProvider;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.giftwall.bean.VoiceGiftWallData;

/* JADX INFO: loaded from: classes5.dex */
public class pyn0 extends i6t<oo2, vyn0> {

    /* JADX INFO: renamed from: i */
    public qjn0 f154672i;

    /* JADX INFO: renamed from: j */
    public String f154673j;

    /* JADX INFO: renamed from: k */
    public VoiceGiftWallData f154674k;

    public pyn0(dum<? extends oo2> dumVar) {
        super(dumVar);
        mo52715C(new vyn0());
        this.f154672i = (qjn0) m153103z2(new qjn0(dumVar, this));
    }

    /* JADX INFO: renamed from: M3 */
    private void m174303M3() {
        if (TextUtils.isEmpty(this.f154673j)) {
            return;
        }
        User userM207651V = zrv.f205799a.m207651V();
        if (this.f154673j.equals(userM207651V.f56859id)) {
            return;
        }
        ((vyn0) this.viewModel).m204014E(userM207651V);
    }

    /* JADX INFO: renamed from: N3 */
    public void m174304N3(int i) {
        ((vyn0) this.viewModel).m204023n(i);
    }

    /* JADX INFO: renamed from: O3 */
    public void m174305O3(BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo) {
        VoiceGiftWallData voiceGiftWallData;
        if (TextUtils.isEmpty(this.f154673j) || (voiceGiftWallData = this.f154674k) == null) {
            return;
        }
        this.f154672i.m176843S3(this.f154673j, bLiveVoiceGiftWallBookInfo, voiceGiftWallData.getVoiceGiftWallBrief());
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m174306P3(zjn0 zjn0Var) {
        this.f154673j = zjn0Var.m219981b();
        this.f154672i.m176838M3();
        ((vyn0) this.viewModel).m204027u();
        ((vyn0) this.viewModel).m204019L(zjn0Var.m219980a());
        m174303M3();
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m174307R3(VoiceRollDice.VoiceGiftWallLightNoticeMessage voiceGiftWallLightNoticeMessage) {
        m174304N3(0);
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m174308S3(int i, VoiceGiftWallData voiceGiftWallData) {
        this.f154674k = voiceGiftWallData;
        ((vyn0) this.viewModel).m204017I(voiceGiftWallData, i);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m138863h3(m213811F2().VoiceGiftWallEvent.showGiftWall(), new y20() { // from class: l.myn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139420a.m174306P3((zjn0) obj);
            }
        });
        duringCreated(m213810E2().m168545q1().m98243N0()).subscribe(dhw.m115829h(new y20() { // from class: l.nyn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144342a.m174307R3((VoiceRollDice.VoiceGiftWallLightNoticeMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public void m174309T3() {
        String strM203580a6 = zrv.m221193k().m203580a6();
        if (TextUtils.isEmpty(strM203580a6)) {
            return;
        }
        px50.C19461a c19461a = new px50.C19461a(9000);
        c19461a.m174141B(strM203580a6);
        c19461a.m174152z(1.0d, 0.7d);
        c19461a.m174146t(80);
        m213811F2().OpenH5Event.open().mo199273j(c19461a.m174143q());
    }

    /* JADX INFO: renamed from: U3 */
    public void m174310U3(final int i) {
        if (TextUtils.isEmpty(this.f154673j)) {
            return;
        }
        duringCreated(VoiceGiftWallApiProvider.requestGiftWallList(this.f154673j, i == 0)).subscribe(dhw.m115826e(new y20() { // from class: l.oyn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149813a.m174308S3(i, (VoiceGiftWallData) obj);
            }
        }, new r5k()));
    }

    /* JADX INFO: renamed from: V3 */
    public void m174311V3() {
        this.f154673j = zrv.f205799a.m207631D0();
        ((vyn0) this.viewModel).m204019L(0);
    }
}
