package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.longlink.msg.voicegift.VoiceNewCampaign;
import com.p046p1.mobile.longlink.msg.voicelivecampaign.VoiceNewCampaignPopUp;
import com.p046p1.mobile.putong.core.data.UserBanAppealSwitch;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCampaign;
import com.p046p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.newoperation.VoiceNewOperationView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class m4o0 extends h4t<ho2, VoiceNewOperationView> {

    /* JADX INFO: renamed from: i */
    public boolean f131312i;

    /* JADX INFO: renamed from: j */
    public List<BLiveVoiceCampaign> f131313j;

    /* JADX INFO: renamed from: k */
    public boolean f131314k;

    public m4o0(bsm<? extends ho2> bsmVar, VoiceNewOperationView voiceNewOperationView) {
        super(bsmVar);
        mo51532C(voiceNewOperationView);
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m153060O3(Throwable th) {
    }

    /* JADX INFO: renamed from: S3 */
    private List<BLiveVoiceCampaign> m153063S3(List<BLiveVoiceCampaign> list) {
        ArrayList arrayListM200339n = vwb.m200339n(list, new w9j() { // from class: l.l4o0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f126050a.m153070V3((BLiveVoiceCampaign) obj);
            }
        });
        this.f131313j = arrayListM200339n;
        return arrayListM200339n;
    }

    /* JADX INFO: renamed from: U3 */
    private void m153064U3(final String str) {
        BLiveVoiceCampaign bLiveVoiceCampaign = (BLiveVoiceCampaign) vwb.m200346r(this.f131313j, new w9j() { // from class: l.k4o0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveVoiceCampaign) obj).f44490id, str));
            }
        });
        if (bLiveVoiceCampaign != null) {
            m153073b4(bLiveVoiceCampaign);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m153065W3(KeyboardEventData keyboardEventData) {
        m153067a4(keyboardEventData.m71825b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public /* synthetic */ void m153066X3(Boolean bool) {
        this.f131314k = bool.booleanValue();
        ((VoiceNewOperationView) this.viewModel).m78311y0();
    }

    /* JADX INFO: renamed from: a4 */
    private void m153067a4(boolean z) {
        this.f131312i = z;
        ((VoiceNewOperationView) this.viewModel).m78311y0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: d4 */
    private void m153068d4() {
        duringCreated(m206027E2().m132160q1().m189100e1()).subscribe(ffw.m121193d(new e30() { // from class: l.j4o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116213a.m153072Z3((VoiceNewCampaignPopUp.VoiceLivePopUp) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206027E2().m132160q1().m189103f1()).subscribe(ffw.m121193d(new e30() { // from class: l.e4o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89313a.m153076f4((VoiceNewCampaign.VoiceLiveContentUpdateNotice) obj);
            }
        }));
        duringCreated(m206028F2().KeyboardEvent.show().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.f4o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f94860a.m153065W3((KeyboardEventData) obj);
            }
        }));
        duringCreated(m206028F2().IntlGiftComboEvent.newComboVisible().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.g4o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100578a.m153066X3((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public boolean m153069T3() {
        return (this.f131312i || this.f131314k) ? false : true;
    }

    /* JADX INFO: renamed from: V3 */
    public final Boolean m153070V3(BLiveVoiceCampaign bLiveVoiceCampaign) {
        if (!vwb.m200296J(bLiveVoiceCampaign.validPeriod)) {
            if (bLiveVoiceCampaign.validPeriod.size() > 1) {
                long jGuessedCurrentServerTime = qib0.f154693H.guessedCurrentServerTime();
                long jIntValue = ((long) bLiveVoiceCampaign.validPeriod.get(0).intValue()) * 1000;
                return Boolean.valueOf((jGuessedCurrentServerTime >= jIntValue || jIntValue - jGuessedCurrentServerTime <= Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) && jGuessedCurrentServerTime <= ((long) bLiveVoiceCampaign.validPeriod.get(1).intValue()) * 1000);
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m153071Y3(List list) {
        ((VoiceNewOperationView) this.viewModel).m78310u0(m153063S3(list));
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m153072Z3(VoiceNewCampaignPopUp.VoiceLivePopUp voiceLivePopUp) {
        m153064U3(voiceLivePopUp.getCampaignId());
    }

    /* JADX INFO: renamed from: b4 */
    public void m153073b4(BLiveVoiceCampaign bLiveVoiceCampaign) {
        if (!TextUtils.isEmpty(bLiveVoiceCampaign.schema)) {
            m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(1300).m206701e(bLiveVoiceCampaign.schema).m206699c());
            m153075e4(bLiveVoiceCampaign.campaignType, ypv.f199493a.m199368r(bLiveVoiceCampaign.schema));
        } else {
            if (TextUtils.isEmpty(bLiveVoiceCampaign.detailUrl)) {
                return;
            }
            m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(500).m142608y(bLiveVoiceCampaign).m142600q());
            String strM218869b = zhw.m218869b(bLiveVoiceCampaign.detailUrl);
            if (TextUtils.isEmpty(strM218869b)) {
                return;
            }
            m153075e4(bLiveVoiceCampaign.campaignType, yhw.m214862s().m214871t(strM218869b) != null ? "1" : "0");
        }
    }

    /* JADX INFO: renamed from: c4 */
    public void m153074c4() {
        String strMo96662j3 = mo96662j3();
        if (TextUtils.isEmpty(strMo96662j3) || !ypv.m215672k().m195870jb()) {
            return;
        }
        duringCreated(z5o0.m217367b(strMo96662j3)).subscribe(ffw.m121194e(new e30() { // from class: l.h4o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105863a.m153071Y3((List) obj);
            }
        }, new e30() { // from class: l.i4o0
            @Override // p149l.e30
            public final void call(Object obj) {
                m4o0.m153060O3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: e4 */
    public final void m153075e4(String str, String str2) {
        HashMap map = new HashMap();
        map.put("campaign_type", str);
        map.put(UserBanAppealSwitch.offline, str2);
        zvf0.m220397s("e_audio_small_banner", m206027E2().mo97490p() ? "p_anchor_audio_room" : "p_user_audio_room", map);
    }

    /* JADX INFO: renamed from: f4 */
    public final void m153076f4(VoiceNewCampaign.VoiceLiveContentUpdateNotice voiceLiveContentUpdateNotice) {
        if (voiceLiveContentUpdateNotice == null) {
            return;
        }
        m153074c4();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m153074c4();
        m153068d4();
    }
}
