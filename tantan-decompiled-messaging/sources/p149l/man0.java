package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBookInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBrief;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.giftwall.api.VoiceGiftWallApiProvider;

/* JADX INFO: loaded from: classes5.dex */
public class man0 extends h4t<ho2, tan0> {

    /* JADX INFO: renamed from: i */
    public lpn0 f132940i;

    public man0(bsm<? extends ho2> bsmVar, lpn0 lpn0Var) {
        super(bsmVar);
        this.f132940i = lpn0Var;
        mo51532C(new tan0());
    }

    /* JADX INFO: renamed from: M3 */
    public void m153825M3() {
        ((tan0) this.viewModel).m187761l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N3 */
    public mlj m153826N3(String str) {
        BLiveVoiceCall bLiveVoiceCallM102063l;
        if (!(m206027E2() instanceof nnn0) || (bLiveVoiceCallM102063l = ((nnn0) m206027E2()).m160249P2().m102063l(str)) == null) {
            return null;
        }
        return mlj.m155154c(new i54(bLiveVoiceCallM102063l.f44485id, bLiveVoiceCallM102063l.userName, bLiveVoiceCallM102063l.userPicture), q44.m172922b(bLiveVoiceCallM102063l.f44485id, "gift-audience-none-voiceLiveMain", bLiveVoiceCallM102063l.position));
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m153827O3(BLiveVoiceGiftWallBrief bLiveVoiceGiftWallBrief, BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo) {
        ((tan0) this.viewModel).m187765x(bLiveVoiceGiftWallBookInfo, bLiveVoiceGiftWallBrief);
    }

    /* JADX INFO: renamed from: P3 */
    public void m153828P3(String str, String str2) {
        m206028F2().SendGiftEventGroup.sendGift().mo172463j(new cfe0.C16123a().m106531v(str, new C18429a(), 1, "sendGiftWall", "sendGiftWall", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerLocation.get("giftWall"), ""), str2, "voice_gift_wall").m106525A(false).m106535z(m153826N3(str2)).m106529t());
        if (m206032L2()) {
            vbn0.m197725a();
        } else {
            vbn0.m197726b();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: R3 */
    public void m153829R3(String str) {
        String str2 = m206027E2().m132146l0().f56011id;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        u4n0.m191752k(this, str2, str);
    }

    /* JADX INFO: renamed from: S3 */
    public void m153830S3(String str, BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo, final BLiveVoiceGiftWallBrief bLiveVoiceGiftWallBrief) {
        if (bLiveVoiceGiftWallBookInfo.isLight) {
            duringCreated(VoiceGiftWallApiProvider.requestGiftWallDetail(str, bLiveVoiceGiftWallBookInfo.giftWallBookId)).subscribe(ffw.m121194e(new e30() { // from class: l.lan0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f127226a.m153827O3(bLiveVoiceGiftWallBrief, (BLiveVoiceGiftWallBookInfo) obj);
                }
            }, new z2k()));
        } else {
            ((tan0) this.viewModel).m187765x(bLiveVoiceGiftWallBookInfo, bLiveVoiceGiftWallBrief);
        }
    }

    /* JADX INFO: renamed from: l.man0$a */
    public class C18429a implements zfv.C21687a.a {
        public C18429a() {
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: a */
        public void mo67166a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            ((tan0) man0.this.viewModel).m187761l();
            if (man0.this.f132940i != null) {
                man0.this.f132940i.m150880N3(0);
            }
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: c */
        public void mo67168c() {
        }
    }
}
