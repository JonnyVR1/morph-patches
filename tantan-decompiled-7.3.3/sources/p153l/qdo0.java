package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.fep.base.core.FepManager;
import com.hellogroup.fep.feppkg.internal.core.CheckPolicy;
import com.p051p1.mobile.longlink.msg.voicegift.VoiceNewCampaign;
import com.p051p1.mobile.longlink.msg.voicelivecampaign.VoiceNewCampaignPopUp;
import com.p051p1.mobile.putong.core.data.UserBanAppealSwitch;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCampaign;
import com.p051p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.newoperation.VoiceNewOperationView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class qdo0 extends i6t<oo2, VoiceNewOperationView> {

    /* JADX INFO: renamed from: i */
    public boolean f156753i;

    /* JADX INFO: renamed from: j */
    public List<BLiveVoiceCampaign> f156754j;

    /* JADX INFO: renamed from: k */
    public boolean f156755k;

    public qdo0(dum<? extends oo2> dumVar, VoiceNewOperationView voiceNewOperationView) {
        super(dumVar);
        mo52715C(voiceNewOperationView);
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m176187O3(Throwable th) {
    }

    /* JADX INFO: renamed from: S3 */
    private List<BLiveVoiceCampaign> m176190S3(List<BLiveVoiceCampaign> list) {
        ArrayList arrayListM147522n = jyb.m147522n(list, new qcj() { // from class: l.pdo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f151819a.m176197V3((BLiveVoiceCampaign) obj);
            }
        });
        this.f156754j = arrayListM147522n;
        return arrayListM147522n;
    }

    /* JADX INFO: renamed from: U3 */
    private void m176191U3(final String str) {
        BLiveVoiceCampaign bLiveVoiceCampaign = (BLiveVoiceCampaign) jyb.m147529r(this.f156754j, new qcj() { // from class: l.odo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveVoiceCampaign) obj).f45338id, str));
            }
        });
        if (bLiveVoiceCampaign != null) {
            m176200b4(bLiveVoiceCampaign);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m176192W3(KeyboardEventData keyboardEventData) {
        m176194a4(keyboardEventData.m73008b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public /* synthetic */ void m176193X3(Boolean bool) {
        this.f156755k = bool.booleanValue();
        ((VoiceNewOperationView) this.viewModel).m79494y0();
    }

    /* JADX INFO: renamed from: a4 */
    private void m176194a4(boolean z) {
        this.f156753i = z;
        ((VoiceNewOperationView) this.viewModel).m79494y0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX INFO: renamed from: d4 */
    private void m176195d4() {
        duringCreated(m213810E2().m168545q1().m98282e1()).subscribe(dhw.m115825d(new y20() { // from class: l.ndo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141514a.m176199Z3((VoiceNewCampaignPopUp.VoiceLivePopUp) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213810E2().m168545q1().m98285f1()).subscribe(dhw.m115825d(new y20() { // from class: l.ido0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114516a.m176203f4((VoiceNewCampaign.VoiceLiveContentUpdateNotice) obj);
            }
        }));
        duringCreated(m213811F2().KeyboardEvent.show().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.jdo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120286a.m176192W3((KeyboardEventData) obj);
            }
        }));
        duringCreated(m213811F2().IntlGiftComboEvent.newComboVisible().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.kdo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f125270a.m176193X3((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public boolean m176196T3() {
        return (this.f156753i || this.f156755k) ? false : true;
    }

    /* JADX INFO: renamed from: V3 */
    public final Boolean m176197V3(BLiveVoiceCampaign bLiveVoiceCampaign) {
        if (!jyb.m147479J(bLiveVoiceCampaign.validPeriod)) {
            if (bLiveVoiceCampaign.validPeriod.size() > 1) {
                long jGuessedCurrentServerTime = uqb0.f180376H.guessedCurrentServerTime();
                long jIntValue = ((long) bLiveVoiceCampaign.validPeriod.get(0).intValue()) * 1000;
                return Boolean.valueOf((jGuessedCurrentServerTime >= jIntValue || jIntValue - jGuessedCurrentServerTime <= Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) && jGuessedCurrentServerTime <= ((long) bLiveVoiceCampaign.validPeriod.get(1).intValue()) * 1000);
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m176198Y3(List list) {
        ((VoiceNewOperationView) this.viewModel).m79493u0(m176190S3(list));
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m176199Z3(VoiceNewCampaignPopUp.VoiceLivePopUp voiceLivePopUp) {
        m176191U3(voiceLivePopUp.getCampaignId());
    }

    /* JADX INFO: renamed from: b4 */
    public void m176200b4(BLiveVoiceCampaign bLiveVoiceCampaign) {
        if (!TextUtils.isEmpty(bLiveVoiceCampaign.schema)) {
            m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(1300).m103154e(bLiveVoiceCampaign.schema).m103152c());
            m176202e4(bLiveVoiceCampaign.campaignType, zrv.f205799a.m207690r(bLiveVoiceCampaign.schema));
        } else {
            if (TextUtils.isEmpty(bLiveVoiceCampaign.detailUrl)) {
                return;
            }
            m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(500).m174151y(bLiveVoiceCampaign).m174143q());
            String strM206867c = wkw.m206867c(bLiveVoiceCampaign.detailUrl);
            if (TextUtils.isEmpty(strM206867c)) {
                return;
            }
            m176202e4(bLiveVoiceCampaign.campaignType, FepManager.m17582z().m17592n(strM206867c, null, null, CheckPolicy.LOCAL_ONLY) != null ? "1" : "0");
        }
    }

    /* JADX INFO: renamed from: c4 */
    public void m176201c4() {
        String strMo104749j3 = mo104749j3();
        if (TextUtils.isEmpty(strMo104749j3) || !zrv.m221193k().m203657jb()) {
            return;
        }
        duringCreated(dfo0.m115531b(strMo104749j3)).subscribe(dhw.m115826e(new y20() { // from class: l.ldo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131659a.m176198Y3((List) obj);
            }
        }, new y20() { // from class: l.mdo0
            @Override // p153l.y20
            public final void call(Object obj) {
                qdo0.m176187O3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: e4 */
    public final void m176202e4(String str, String str2) {
        HashMap map = new HashMap();
        map.put("campaign_type", str);
        map.put(UserBanAppealSwitch.offline, str2);
        i4g0.m138521s("e_audio_small_banner", m213810E2().mo118373p() ? "p_anchor_audio_room" : "p_user_audio_room", map);
    }

    /* JADX INFO: renamed from: f4 */
    public final void m176203f4(VoiceNewCampaign.VoiceLiveContentUpdateNotice voiceLiveContentUpdateNotice) {
        if (voiceLiveContentUpdateNotice == null) {
            return;
        }
        m176201c4();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m176201c4();
        m176195d4();
    }
}
