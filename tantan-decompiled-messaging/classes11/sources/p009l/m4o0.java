package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.newoperation.VoiceNewOperationView;
import com.p1.mobile.longlink.msg.voicegift.VoiceNewCampaign;
import com.p1.mobile.longlink.msg.voicelivecampaign.VoiceNewCampaignPopUp;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCampaign;
import com.p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.bsm;
import l.bwr;
import l.e30;
import l.ffw;
import l.h4t;
import l.ho2;
import l.jp50;
import l.qib0;
import l.vwb;
import l.w9j;
import l.x1e0;
import l.yhw;
import l.zhw;
import l.zvf0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class m4o0 extends h4t<ho2, VoiceNewOperationView> {

    /* JADX INFO: renamed from: i */
    public boolean f16500i;

    /* JADX INFO: renamed from: j */
    public List<BLiveVoiceCampaign> f16501j;

    /* JADX INFO: renamed from: k */
    public boolean f16502k;

    public m4o0(bsm<? extends ho2> bsmVar, VoiceNewOperationView voiceNewOperationView) {
        super(bsmVar);
        C(voiceNewOperationView);
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m18226O3(Throwable th) {
    }

    /* JADX INFO: renamed from: S3 */
    private List<BLiveVoiceCampaign> m18229S3(List<BLiveVoiceCampaign> list) {
        ArrayList arrayListN = vwb.n(list, new w9j() { // from class: l.l4o0
            public final Object call(Object obj) {
                return this.f15939a.m18237V3((BLiveVoiceCampaign) obj);
            }
        });
        this.f16501j = arrayListN;
        return arrayListN;
    }

    /* JADX INFO: renamed from: U3 */
    private void m18230U3(final String str) {
        BLiveVoiceCampaign bLiveVoiceCampaign = (BLiveVoiceCampaign) vwb.r(this.f16501j, new w9j() { // from class: l.k4o0
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveVoiceCampaign) obj).id, str));
            }
        });
        if (bLiveVoiceCampaign != null) {
            m18240b4(bLiveVoiceCampaign);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m18231W3(KeyboardEventData keyboardEventData) {
        m18233a4(keyboardEventData.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public /* synthetic */ void m18232X3(Boolean bool) {
        this.f16502k = bool.booleanValue();
        ((VoiceNewOperationView) ((bwr) this).viewModel).m8504y0();
    }

    /* JADX INFO: renamed from: a4 */
    private void m18233a4(boolean z) {
        this.f16500i = z;
        ((VoiceNewOperationView) ((bwr) this).viewModel).m8504y0();
    }

    /* JADX INFO: renamed from: d4 */
    private void m18234d4() {
        duringCreated(E2().q1().e1()).subscribe(ffw.d(new e30() { // from class: l.j4o0
            public final void call(Object obj) {
                this.f14937a.m18239Z3((VoiceNewCampaignPopUp.VoiceLivePopUp) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public void m18235T() {
        super/*l.k4t*/.T();
        duringCreated(E2().q1().f1()).subscribe(ffw.d(new e30() { // from class: l.e4o0
            public final void call(Object obj) {
                this.f12364a.m18243f4((VoiceNewCampaign.VoiceLiveContentUpdateNotice) obj);
            }
        }));
        duringCreated((c) F2().KeyboardEvent.show().g()).subscribe(ffw.d(new e30() { // from class: l.f4o0
            public final void call(Object obj) {
                this.f12808a.m18231W3((KeyboardEventData) obj);
            }
        }));
        duringCreated((c) F2().IntlGiftComboEvent.newComboVisible().g()).subscribe(ffw.h(new e30() { // from class: l.g4o0
            public final void call(Object obj) {
                this.f13308a.m18232X3((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public boolean m18236T3() {
        return (this.f16500i || this.f16502k) ? false : true;
    }

    /* JADX INFO: renamed from: V3 */
    public final Boolean m18237V3(BLiveVoiceCampaign bLiveVoiceCampaign) {
        if (!vwb.J(bLiveVoiceCampaign.validPeriod)) {
            if (bLiveVoiceCampaign.validPeriod.size() > 1) {
                long jGuessedCurrentServerTime = qib0.H.guessedCurrentServerTime();
                long jIntValue = ((long) ((Integer) bLiveVoiceCampaign.validPeriod.get(0)).intValue()) * 1000;
                return Boolean.valueOf((jGuessedCurrentServerTime >= jIntValue || jIntValue - jGuessedCurrentServerTime <= 5000) && jGuessedCurrentServerTime <= ((long) ((Integer) bLiveVoiceCampaign.validPeriod.get(1)).intValue()) * 1000);
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m18238Y3(List list) {
        ((VoiceNewOperationView) ((bwr) this).viewModel).m8503u0(m18229S3(list));
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m18239Z3(VoiceNewCampaignPopUp.VoiceLivePopUp voiceLivePopUp) {
        m18230U3(voiceLivePopUp.getCampaignId());
    }

    /* JADX INFO: renamed from: b4 */
    public void m18240b4(BLiveVoiceCampaign bLiveVoiceCampaign) {
        if (!TextUtils.isEmpty(bLiveVoiceCampaign.schema)) {
            F2().SchemeHandleEvent.handleScheme().j(new x1e0.a(1300).e(bLiveVoiceCampaign.schema).c());
            m18242e4(bLiveVoiceCampaign.campaignType, ypv.f23196a.m23678r(bLiveVoiceCampaign.schema));
        } else {
            if (TextUtils.isEmpty(bLiveVoiceCampaign.detailUrl)) {
                return;
            }
            F2().OpenH5Event.open().j(jp50.c(500).y(bLiveVoiceCampaign).q());
            String strB = zhw.b(bLiveVoiceCampaign.detailUrl);
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            m18242e4(bLiveVoiceCampaign.campaignType, yhw.s().t(strB) != null ? "1" : "0");
        }
    }

    /* JADX INFO: renamed from: c4 */
    public void m18241c4() {
        String strJ3 = j3();
        if (TextUtils.isEmpty(strJ3) || !ypv.m25490k().jb()) {
            return;
        }
        duringCreated(z5o0.m25614b(strJ3)).subscribe(ffw.e(new e30() { // from class: l.h4o0
            public final void call(Object obj) {
                this.f13864a.m18238Y3((List) obj);
            }
        }, new e30() { // from class: l.i4o0
            public final void call(Object obj) {
                m4o0.m18226O3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e4 */
    public final void m18242e4(String str, String str2) {
        HashMap map = new HashMap();
        map.put("campaign_type", str);
        map.put("offline", str2);
        zvf0.s("e_audio_small_banner", E2().p() ? "p_anchor_audio_room" : "p_user_audio_room", map);
    }

    /* JADX INFO: renamed from: f4 */
    public final void m18243f4(VoiceNewCampaign.VoiceLiveContentUpdateNotice voiceLiveContentUpdateNotice) {
        if (voiceLiveContentUpdateNotice == null) {
            return;
        }
        m18241c4();
    }

    /* JADX INFO: renamed from: t */
    public void m18244t() {
        super/*l.k4t*/.t();
        m18241c4();
        m18234d4();
    }
}
