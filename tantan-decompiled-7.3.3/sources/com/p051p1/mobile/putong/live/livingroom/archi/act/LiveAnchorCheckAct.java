package com.p051p1.mobile.putong.live.livingroom.archi.act;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.data.Mobile;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveIdCardVerificationInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVerificationAnchor;
import com.p051p1.mobile.putong.live.base.data.BLiveVerificationCenter;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.act.LiveAnchorCheckAct;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import io.agora.rtc2.internal.AudioRoutingController;
import java.io.Serializable;
import p153l.cmp0;
import p153l.dhw;
import p153l.fgt;
import p153l.iit;
import p153l.it0;
import p153l.lej0;
import p153l.nae0;
import p153l.nsh0;
import p153l.o1j0;
import p153l.pb1;
import p153l.pn0;
import p153l.pvn;
import p153l.q2f;
import p153l.qcj;
import p153l.sz2;
import p153l.uxj0;
import p153l.v2t;
import p153l.vxr;
import p153l.wft;
import p153l.x20;
import p153l.y20;
import p153l.z20;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class LiveAnchorCheckAct extends PutongAct {
    /* JADX INFO: renamed from: E2 */
    public static boolean m72848E2(BLiveVerificationCenter bLiveVerificationCenter) {
        BLiveIdCardVerificationInfo bLiveIdCardVerificationInfo = bLiveVerificationCenter.idCard;
        return bLiveIdCardVerificationInfo != null && "verified".equals(bLiveIdCardVerificationInfo.status.toString());
    }

    /* JADX INFO: renamed from: F2 */
    public static boolean m72849F2(BLiveVerificationCenter bLiveVerificationCenter) {
        BLiveVerificationAnchor bLiveVerificationAnchor = bLiveVerificationCenter.voiceAnchor;
        return bLiveVerificationAnchor != null && "verified".equals(bLiveVerificationAnchor.status.toString());
    }

    /* JADX INFO: renamed from: M2 */
    public static void m72850M2(final Act act, final boolean z, final x20 x20Var) {
        act.duringCreated(zrv.f205799a.m207694t()).filter(new qcj() { // from class: l.uur
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveVerificationCenter) obj) != null);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.vur
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveAnchorCheckAct.m72867s2((BLiveVerificationCenter) obj, z, act, x20Var);
            }
        }, new y20() { // from class: l.kur
            @Override // p153l.y20
            public final void call(Object obj) {
                nsh0.m164608j("[live]verification", "voice:" + ((Throwable) obj).getMessage());
            }
        }));
    }

    /* JADX INFO: renamed from: i2 */
    public static /* synthetic */ void m72861i2(String str, String str2) {
        o1j0.m165634h(R$string.f18088R);
        nsh0.m164608j("[live]verification", "voice:" + str + ":" + str2);
    }

    /* JADX INFO: renamed from: m2 */
    public static Intent m72864m2(Act act, AnchorStartData anchorStartData) {
        Intent intent = new Intent(act, (Class<?>) LiveAct.class);
        intent.putExtra(AudienceStartData.ANCHOR_TAG, true);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        intent.putExtra("LIVE_ANCHOR_START_DATA", anchorStartData);
        return intent;
    }

    /* JADX INFO: renamed from: n2 */
    public static Intent m72865n2(Context context, AnchorStartData anchorStartData) {
        Intent intent = new Intent(context, (Class<?>) LiveAnchorCheckAct.class);
        intent.putExtra("start_data", anchorStartData);
        intent.putExtra("type", "live");
        return intent;
    }

    /* JADX INFO: renamed from: o2 */
    public static Intent m72866o2(Context context, AnchorStartData anchorStartData) {
        Intent intent = new Intent(context, (Class<?>) LiveAnchorCheckAct.class);
        intent.putExtra("start_data", anchorStartData);
        intent.putExtra("type", "voice");
        return intent;
    }

    /* JADX INFO: renamed from: s2 */
    public static void m72867s2(BLiveVerificationCenter bLiveVerificationCenter, boolean z, Act act, x20 x20Var) {
        if (z) {
            if (m72848E2(bLiveVerificationCenter)) {
                x20Var.call();
                return;
            }
        } else if (m72848E2(bLiveVerificationCenter) || m72849F2(bLiveVerificationCenter)) {
            x20Var.call();
            return;
        }
        nae0.m162084n(act, Uri.parse("tantanapp://actualnameVerify"), new z20() { // from class: l.lur
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                LiveAnchorCheckAct.m72861i2((String) obj, (String) obj2);
            }
        });
        it0.m142010D(act);
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m72868A2(AnchorStartData anchorStartData) {
        m72875L2(this.act, anchorStartData);
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ void m72869B2(String str, AnchorStartData anchorStartData) {
        if ("voice".equals(str)) {
            m72878r2(anchorStartData);
        } else {
            m72877q2(anchorStartData);
        }
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m72871D2() {
        it0.m142010D(this);
    }

    /* JADX INFO: renamed from: H2 */
    public final void m72872H2(Act act, AnchorStartData anchorStartData) {
        nsh0.m164608j(v2t.f182114d, "start_voice_live_act");
        lej0.INSTANCE.m153907a("voice_res_loading", "voice check res");
        anchorStartData.type = "type_voice_live";
        Intent intent = new Intent(act, (Class<?>) LiveAct.class);
        intent.putExtra(AudienceStartData.ANCHOR_TAG, true);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        intent.putExtra("LIVE_ANCHOR_START_DATA", anchorStartData);
        act.startActivity(intent);
        it0.m142010D(this);
    }

    /* JADX INFO: renamed from: I2, reason: merged with bridge method [inline-methods] */
    public final void m72870C2(Act act, AnchorStartData anchorStartData) {
        if (!vxr.m203876d().m170967B1() || !wft.m206159b(3)) {
            m72872H2(act, anchorStartData);
            return;
        }
        AudienceStartData audienceStartDataM68794u = AudienceStartData.getBuilder().m68789Q(true).m68787O(anchorStartData.anchorSource).m68792T(anchorStartData.voiceEntranceType).m68794u();
        nsh0.m164608j(v2t.f182114d, "start_voice_live_act");
        lej0.INSTANCE.m153907a("voice_res_loading", "voice check res");
        anchorStartData.type = "type_voice_live";
        Intent intent = new Intent(act, (Class<?>) LiveAct.class);
        intent.putExtra(AudienceStartData.ANCHOR_TAG, false);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        intent.putExtra(AudienceStartData.LIVE_AUDIENCE_START_DATA, audienceStartDataM68794u);
        act.startActivity(intent);
        it0.m142010D(this);
    }

    /* JADX INFO: renamed from: K2 */
    public final void m72874K2(Act act, final String str, final AnchorStartData anchorStartData) {
        pvn.m173968c(str, new pvn.C19456a(null, new x20() { // from class: l.qur
            @Override // p153l.x20
            public final void call() {
                this.f159613a.m72869B2(str, anchorStartData);
            }
        }));
    }

    /* JADX INFO: renamed from: L2 */
    public final void m72875L2(final Act act, final AnchorStartData anchorStartData) {
        lej0.INSTANCE.m153910d("voice_res_loading");
        pn0.m172992p(act, anchorStartData, iit.INSTANCE.m140133S(), new x20() { // from class: l.sur
            @Override // p153l.x20
            public final void call() {
                this.f170751a.m72870C2(act, anchorStartData);
            }
        }, new x20() { // from class: l.tur
            @Override // p153l.x20
            public final void call() {
                this.f176205a.m72871D2();
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        Serializable serializableExtra = getIntent().getSerializableExtra("start_data");
        if (serializableExtra == null) {
            serializableExtra = AnchorStartData.getBuilder().m68743k();
        }
        if (TextUtils.equals(getIntent().getStringExtra("type"), "voice")) {
            m72878r2((AnchorStartData) serializableExtra);
        } else {
            m72877q2((AnchorStartData) serializableExtra);
        }
    }

    /* JADX INFO: renamed from: p2 */
    public final void m72876p2(final Act act, final AnchorStartData anchorStartData, boolean z) {
        sz2.m188616d(act, new x20() { // from class: l.rur
            @Override // p153l.x20
            public final void call() {
                this.f164934a.m72880v2(act, anchorStartData);
            }
        }, z);
    }

    /* JADX INFO: renamed from: q2 */
    public final void m72877q2(final AnchorStartData anchorStartData) {
        if (q2f.m175026c()) {
            it0.m142010D(this);
            return;
        }
        String str = v2t.f182114d;
        nsh0.m164608j(str, "anchor_start_live");
        if (zrv.f205799a.m207647R()) {
            zrv.f205799a.m207685o0(1);
            nsh0.m164608j(str, "teenMode_can't_startLive");
            it0.m142010D(this);
            return;
        }
        AudioBusinessType audioBusinessTypeMo171474c = pb1.m171472b().mo171474c();
        if (!wft.m206159b(2) && audioBusinessTypeMo171474c != null && audioBusinessTypeMo171474c != AudioBusinessType.CHAT_ROOM_WINDOW) {
            m72874K2(this.act, "live", anchorStartData);
            return;
        }
        fgt.m125529a("anchor_start_live_click", true, anchorStartData.traceId, anchorStartData.anchorSource, null, null);
        lej0.INSTANCE.m153910d("live_res_loading");
        pn0.m172992p(this.act, anchorStartData, iit.INSTANCE.m140129O(), new x20() { // from class: l.our
            @Override // p153l.x20
            public final void call() {
                this.f149198a.m72881w2(anchorStartData);
            }
        }, new x20() { // from class: l.pur
            @Override // p153l.x20
            public final void call() {
                this.f154215a.m72882y2();
            }
        });
    }

    /* JADX INFO: renamed from: r2 */
    public final void m72878r2(final AnchorStartData anchorStartData) {
        AudioBusinessType audioBusinessTypeMo171474c = pb1.m171472b().mo171474c();
        if (!wft.m206159b(3) && audioBusinessTypeMo171474c != null && audioBusinessTypeMo171474c != AudioBusinessType.CHAT_ROOM_WINDOW) {
            m72874K2(this.act, "voice", anchorStartData);
            return;
        }
        if (!wft.m206159b(3)) {
            m72875L2(this.act, anchorStartData);
            return;
        }
        if (anchorStartData != null && cmp0.m111299d().m111305f()) {
            cmp0.m111299d().m111308j();
            it0.m142010D(this);
            return;
        }
        String strM203676m6 = zrv.m221193k().m203676m6();
        if (Mobile.TYPE.equals(strM203676m6)) {
            m72876p2(this.act, anchorStartData, true);
            return;
        }
        boolean zEquals = "forceRealName".equals(strM203676m6);
        Act act = this.act;
        if (zEquals) {
            m72850M2(act, true, new x20() { // from class: l.jur
                @Override // p153l.x20
                public final void call() {
                    this.f122733a.m72883z2(anchorStartData);
                }
            });
        } else {
            m72850M2(act, false, new x20() { // from class: l.nur
                @Override // p153l.x20
                public final void call() {
                    this.f143727a.m72868A2(anchorStartData);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ void m72879u2(Act act, AnchorStartData anchorStartData, uxj0 uxj0Var) {
        m72875L2(act, anchorStartData);
    }

    /* JADX INFO: renamed from: v2 */
    public final /* synthetic */ void m72880v2(final Act act, final AnchorStartData anchorStartData) {
        act.duringCreated(LivingNormalApiProvider.m72369B6()).subscribe(dhw.m115829h(new y20() { // from class: l.mur
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138833a.m72879u2(act, anchorStartData, (uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m72881w2(AnchorStartData anchorStartData) {
        lej0.INSTANCE.m153907a("live_res_loading", "live check res");
        nsh0.m164608j(v2t.f182114d, "start_live_act");
        Act act = this.act;
        act.startActivity(m72864m2(act, anchorStartData));
        it0.m142010D(this);
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m72882y2() {
        it0.m142010D(this);
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m72883z2(AnchorStartData anchorStartData) {
        m72875L2(this.act, anchorStartData);
    }
}
