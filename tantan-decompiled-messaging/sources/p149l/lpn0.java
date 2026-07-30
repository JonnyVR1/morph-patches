package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBookInfo;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.giftwall.api.VoiceGiftWallApiProvider;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.giftwall.bean.VoiceGiftWallData;

/* JADX INFO: loaded from: classes5.dex */
public class lpn0 extends h4t<ho2, rpn0> {

    /* JADX INFO: renamed from: i */
    public man0 f129232i;

    /* JADX INFO: renamed from: j */
    public String f129233j;

    /* JADX INFO: renamed from: k */
    public VoiceGiftWallData f129234k;

    public lpn0(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        mo51532C(new rpn0());
        this.f129232i = (man0) m144512z2(new man0(bsmVar, this));
    }

    /* JADX INFO: renamed from: M3 */
    private void m150879M3() {
        if (TextUtils.isEmpty(this.f129233j)) {
            return;
        }
        User userM199329V = ypv.f199493a.m199329V();
        if (this.f129233j.equals(userM199329V.f56011id)) {
            return;
        }
        ((rpn0) this.viewModel).m180353E(userM199329V);
    }

    /* JADX INFO: renamed from: N3 */
    public void m150880N3(int i) {
        ((rpn0) this.viewModel).m180362n(i);
    }

    /* JADX INFO: renamed from: O3 */
    public void m150881O3(BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo) {
        VoiceGiftWallData voiceGiftWallData;
        if (TextUtils.isEmpty(this.f129233j) || (voiceGiftWallData = this.f129234k) == null) {
            return;
        }
        this.f129232i.m153830S3(this.f129233j, bLiveVoiceGiftWallBookInfo, voiceGiftWallData.getVoiceGiftWallBrief());
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m150882P3(van0 van0Var) {
        this.f129233j = van0Var.m197646b();
        this.f129232i.m153825M3();
        ((rpn0) this.viewModel).m180366u();
        ((rpn0) this.viewModel).m180358L(van0Var.m197645a());
        m150879M3();
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m150883R3(VoiceRollDice.VoiceGiftWallLightNoticeMessage voiceGiftWallLightNoticeMessage) {
        m150880N3(0);
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m150884S3(int i, VoiceGiftWallData voiceGiftWallData) {
        this.f129234k = voiceGiftWallData;
        ((rpn0) this.viewModel).m180356I(voiceGiftWallData, i);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129304h3(m206028F2().VoiceGiftWallEvent.showGiftWall(), new e30() { // from class: l.ipn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114333a.m150882P3((van0) obj);
            }
        });
        duringCreated(m206027E2().m132160q1().m189061N0()).subscribe(ffw.m121197h(new e30() { // from class: l.jpn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119214a.m150883R3((VoiceRollDice.VoiceGiftWallLightNoticeMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public void m150885T3() {
        String strM195793a6 = ypv.m215672k().m195793a6();
        if (TextUtils.isEmpty(strM195793a6)) {
            return;
        }
        jp50.C17834a c17834a = new jp50.C17834a(9000);
        c17834a.m142598B(strM195793a6);
        c17834a.m142609z(1.0d, 0.7d);
        c17834a.m142603t(80);
        m206028F2().OpenH5Event.open().mo172463j(c17834a.m142600q());
    }

    /* JADX INFO: renamed from: U3 */
    public void m150886U3(final int i) {
        if (TextUtils.isEmpty(this.f129233j)) {
            return;
        }
        duringCreated(VoiceGiftWallApiProvider.requestGiftWallList(this.f129233j, i == 0)).subscribe(ffw.m121194e(new e30() { // from class: l.kpn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124176a.m150884S3(i, (VoiceGiftWallData) obj);
            }
        }, new z2k()));
    }

    /* JADX INFO: renamed from: V3 */
    public void m150887V3() {
        this.f129233j = ypv.f199493a.m199309D0();
        ((rpn0) this.viewModel).m180358L(0);
    }
}
