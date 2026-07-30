package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBookInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBrief;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.giftwall.api.VoiceGiftWallApiProvider;

/* JADX INFO: loaded from: classes5.dex */
public class qjn0 extends i6t<oo2, xjn0> {

    /* JADX INFO: renamed from: i */
    public pyn0 f158001i;

    public qjn0(dum<? extends oo2> dumVar, pyn0 pyn0Var) {
        super(dumVar);
        this.f158001i = pyn0Var;
        mo52715C(new xjn0());
    }

    /* JADX INFO: renamed from: M3 */
    public void m176838M3() {
        ((xjn0) this.viewModel).m211254l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N3 */
    public coj m176839N3(String str) {
        BLiveVoiceCall bLiveVoiceCallM136873l;
        if (!(m213810E2() instanceof rwn0) || (bLiveVoiceCallM136873l = ((rwn0) m213810E2()).m183411P2().m136873l(str)) == null) {
            return null;
        }
        return coj.m111661c(new h64(bLiveVoiceCallM136873l.f45333id, bLiveVoiceCallM136873l.userName, bLiveVoiceCallM136873l.userPicture), p54.m170592b(bLiveVoiceCallM136873l.f45333id, "gift-audience-none-voiceLiveMain", bLiveVoiceCallM136873l.position));
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m176840O3(BLiveVoiceGiftWallBrief bLiveVoiceGiftWallBrief, BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo) {
        ((xjn0) this.viewModel).m211258x(bLiveVoiceGiftWallBookInfo, bLiveVoiceGiftWallBrief);
    }

    /* JADX INFO: renamed from: P3 */
    public void m176841P3(String str, String str2) {
        m213811F2().SendGiftEventGroup.sendGift().mo199273j(new hne0.C17513a().m136085v(str, new C19583a(), 1, "sendGiftWall", "sendGiftWall", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerLocation.get("giftWall"), ""), str2, "voice_gift_wall").m136079A(false).m136089z(m176839N3(str2)).m136083t());
        if (m213815L2()) {
            zkn0.m220118a();
        } else {
            zkn0.m220119b();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX INFO: renamed from: R3 */
    public void m176842R3(String str) {
        String str2 = m213810E2().m168532l0().f56859id;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ydn0.m215258k(this, str2, str);
    }

    /* JADX INFO: renamed from: S3 */
    public void m176843S3(String str, BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo, final BLiveVoiceGiftWallBrief bLiveVoiceGiftWallBrief) {
        if (bLiveVoiceGiftWallBookInfo.isLight) {
            duringCreated(VoiceGiftWallApiProvider.requestGiftWallDetail(str, bLiveVoiceGiftWallBookInfo.giftWallBookId)).subscribe(dhw.m115826e(new y20() { // from class: l.pjn0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f152724a.m176840O3(bLiveVoiceGiftWallBrief, (BLiveVoiceGiftWallBookInfo) obj);
                }
            }, new r5k()));
        } else {
            ((xjn0) this.viewModel).m211258x(bLiveVoiceGiftWallBookInfo, bLiveVoiceGiftWallBrief);
        }
    }

    /* JADX INFO: renamed from: l.qjn0$a */
    public class C19583a implements aiv.C15716a.a {
        public C19583a() {
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: a */
        public void mo68349a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            ((xjn0) qjn0.this.viewModel).m211254l();
            if (qjn0.this.f158001i != null) {
                qjn0.this.f158001i.m174304N3(0);
            }
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: c */
        public void mo68351c() {
        }
    }
}
