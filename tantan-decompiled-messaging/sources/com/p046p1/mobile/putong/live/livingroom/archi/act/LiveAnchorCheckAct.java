package com.p046p1.mobile.putong.live.livingroom.archi.act;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.data.Mobile;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveIdCardVerificationInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVerificationAnchor;
import com.p046p1.mobile.putong.live.base.data.BLiveVerificationCenter;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.act.LiveAnchorCheckAct;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import io.agora.rtc2.internal.AudioRoutingController;
import java.io.Serializable;
import p149l.d30;
import p149l.dt0;
import p149l.dz2;
import p149l.e30;
import p149l.eet;
import p149l.f30;
import p149l.ffw;
import p149l.gkh0;
import p149l.h5j0;
import p149l.hgt;
import p149l.ib1;
import p149l.j2e0;
import p149l.l1f;
import p149l.lsi0;
import p149l.ptn;
import p149l.roj0;
import p149l.tn0;
import p149l.u0t;
import p149l.uvr;
import p149l.vdt;
import p149l.w9j;
import p149l.ycp0;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class LiveAnchorCheckAct extends PutongAct {
    /* JADX INFO: renamed from: D2 */
    public static boolean m71665D2(BLiveVerificationCenter bLiveVerificationCenter) {
        BLiveIdCardVerificationInfo bLiveIdCardVerificationInfo = bLiveVerificationCenter.idCard;
        return bLiveIdCardVerificationInfo != null && "verified".equals(bLiveIdCardVerificationInfo.status.toString());
    }

    /* JADX INFO: renamed from: E2 */
    public static boolean m71666E2(BLiveVerificationCenter bLiveVerificationCenter) {
        BLiveVerificationAnchor bLiveVerificationAnchor = bLiveVerificationCenter.voiceAnchor;
        return bLiveVerificationAnchor != null && "verified".equals(bLiveVerificationAnchor.status.toString());
    }

    /* JADX INFO: renamed from: L2 */
    public static void m71667L2(final Act act, final boolean z, final d30 d30Var) {
        act.duringCreated(ypv.f199493a.m199372t()).filter(new w9j() { // from class: l.tsr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveVerificationCenter) obj) != null);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.usr
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveAnchorCheckAct.m71684r2((BLiveVerificationCenter) obj, z, act, d30Var);
            }
        }, new e30() { // from class: l.jsr
            @Override // p149l.e30
            public final void call(Object obj) {
                gkh0.m126627j("[live]verification", "voice:" + ((Throwable) obj).getMessage());
            }
        }));
    }

    /* JADX INFO: renamed from: h2 */
    public static /* synthetic */ void m71678h2(String str, String str2) {
        lsi0.m151578h(R$string.f17369R);
        gkh0.m126627j("[live]verification", "voice:" + str + ":" + str2);
    }

    /* JADX INFO: renamed from: l2 */
    public static Intent m71681l2(Act act, AnchorStartData anchorStartData) {
        Intent intent = new Intent(act, (Class<?>) LiveAct.class);
        intent.putExtra(AudienceStartData.ANCHOR_TAG, true);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        intent.putExtra("LIVE_ANCHOR_START_DATA", anchorStartData);
        return intent;
    }

    /* JADX INFO: renamed from: m2 */
    public static Intent m71682m2(Context context, AnchorStartData anchorStartData) {
        Intent intent = new Intent(context, (Class<?>) LiveAnchorCheckAct.class);
        intent.putExtra("start_data", anchorStartData);
        intent.putExtra("type", "live");
        return intent;
    }

    /* JADX INFO: renamed from: n2 */
    public static Intent m71683n2(Context context, AnchorStartData anchorStartData) {
        Intent intent = new Intent(context, (Class<?>) LiveAnchorCheckAct.class);
        intent.putExtra("start_data", anchorStartData);
        intent.putExtra("type", "voice");
        return intent;
    }

    /* JADX INFO: renamed from: r2 */
    public static void m71684r2(BLiveVerificationCenter bLiveVerificationCenter, boolean z, Act act, d30 d30Var) {
        if (z) {
            if (m71665D2(bLiveVerificationCenter)) {
                d30Var.call();
                return;
            }
        } else if (m71665D2(bLiveVerificationCenter) || m71666E2(bLiveVerificationCenter)) {
            d30Var.call();
            return;
        }
        j2e0.m139447n(act, Uri.parse("tantanapp://actualnameVerify"), new f30() { // from class: l.ksr
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                LiveAnchorCheckAct.m71678h2((String) obj, (String) obj2);
            }
        });
        dt0.m113504D(act);
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m71685A2(String str, AnchorStartData anchorStartData) {
        if ("voice".equals(str)) {
            m71694q2(anchorStartData);
        } else {
            m71693p2(anchorStartData);
        }
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m71687C2() {
        dt0.m113504D(this);
    }

    /* JADX INFO: renamed from: F2 */
    public final void m71688F2(Act act, AnchorStartData anchorStartData) {
        gkh0.m126627j(u0t.f172945d, "start_voice_live_act");
        h5j0.INSTANCE.m129402a("voice_res_loading", "voice check res");
        anchorStartData.type = "type_voice_live";
        Intent intent = new Intent(act, (Class<?>) LiveAct.class);
        intent.putExtra(AudienceStartData.ANCHOR_TAG, true);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        intent.putExtra("LIVE_ANCHOR_START_DATA", anchorStartData);
        act.startActivity(intent);
        dt0.m113504D(this);
    }

    /* JADX INFO: renamed from: H2, reason: merged with bridge method [inline-methods] */
    public final void m71686B2(Act act, AnchorStartData anchorStartData) {
        if (!uvr.m196087d().m162660B1() || !vdt.m198092b(3)) {
            m71688F2(act, anchorStartData);
            return;
        }
        AudienceStartData audienceStartDataM67611u = AudienceStartData.getBuilder().m67606Q(true).m67604O(anchorStartData.anchorSource).m67609T(anchorStartData.voiceEntranceType).m67611u();
        gkh0.m126627j(u0t.f172945d, "start_voice_live_act");
        h5j0.INSTANCE.m129402a("voice_res_loading", "voice check res");
        anchorStartData.type = "type_voice_live";
        Intent intent = new Intent(act, (Class<?>) LiveAct.class);
        intent.putExtra(AudienceStartData.ANCHOR_TAG, false);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        intent.putExtra(AudienceStartData.LIVE_AUDIENCE_START_DATA, audienceStartDataM67611u);
        act.startActivity(intent);
        dt0.m113504D(this);
    }

    /* JADX INFO: renamed from: I2 */
    public final void m71690I2(Act act, final String str, final AnchorStartData anchorStartData) {
        ptn.m171363c(str, new ptn.C19336a(null, new d30() { // from class: l.psr
            @Override // p149l.d30
            public final void call() {
                this.f151047a.m71685A2(str, anchorStartData);
            }
        }));
    }

    /* JADX INFO: renamed from: K2 */
    public final void m71691K2(final Act act, final AnchorStartData anchorStartData) {
        h5j0.INSTANCE.m129405d("voice_res_loading");
        tn0.m189748p(act, anchorStartData, hgt.INSTANCE.m130912S(), new d30() { // from class: l.rsr
            @Override // p149l.d30
            public final void call() {
                this.f160886a.m71686B2(act, anchorStartData);
            }
        }, new d30() { // from class: l.ssr
            @Override // p149l.d30
            public final void call() {
                this.f166238a.m71687C2();
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        Serializable serializableExtra = getIntent().getSerializableExtra("start_data");
        if (serializableExtra == null) {
            serializableExtra = AnchorStartData.getBuilder().m67560k();
        }
        if (TextUtils.equals(getIntent().getStringExtra("type"), "voice")) {
            m71694q2((AnchorStartData) serializableExtra);
        } else {
            m71693p2((AnchorStartData) serializableExtra);
        }
    }

    /* JADX INFO: renamed from: o2 */
    public final void m71692o2(final Act act, final AnchorStartData anchorStartData, boolean z) {
        dz2.m114108d(act, new d30() { // from class: l.qsr
            @Override // p149l.d30
            public final void call() {
                this.f156267a.m71696u2(act, anchorStartData);
            }
        }, z);
    }

    /* JADX INFO: renamed from: p2 */
    public final void m71693p2(final AnchorStartData anchorStartData) {
        if (l1f.m148175c()) {
            dt0.m113504D(this);
            return;
        }
        String str = u0t.f172945d;
        gkh0.m126627j(str, "anchor_start_live");
        if (ypv.f199493a.m199325R()) {
            ypv.f199493a.m199363o0(1);
            gkh0.m126627j(str, "teenMode_can't_startLive");
            dt0.m113504D(this);
            return;
        }
        AudioBusinessType audioBusinessTypeMo135235c = ib1.m135233b().mo135235c();
        if (!vdt.m198092b(2) && audioBusinessTypeMo135235c != null && audioBusinessTypeMo135235c != AudioBusinessType.CHAT_ROOM_WINDOW) {
            m71690I2(this.act, "live", anchorStartData);
            return;
        }
        eet.m116002a("anchor_start_live_click", true, anchorStartData.traceId, anchorStartData.anchorSource, null, null);
        h5j0.INSTANCE.m129405d("live_res_loading");
        tn0.m189748p(this.act, anchorStartData, hgt.INSTANCE.m130908O(), new d30() { // from class: l.nsr
            @Override // p149l.d30
            public final void call() {
                this.f140290a.m71697v2(anchorStartData);
            }
        }, new d30() { // from class: l.osr
            @Override // p149l.d30
            public final void call() {
                this.f145506a.m71698w2();
            }
        });
    }

    /* JADX INFO: renamed from: q2 */
    public final void m71694q2(final AnchorStartData anchorStartData) {
        AudioBusinessType audioBusinessTypeMo135235c = ib1.m135233b().mo135235c();
        if (!vdt.m198092b(3) && audioBusinessTypeMo135235c != null && audioBusinessTypeMo135235c != AudioBusinessType.CHAT_ROOM_WINDOW) {
            m71690I2(this.act, "voice", anchorStartData);
            return;
        }
        if (!vdt.m198092b(3)) {
            m71691K2(this.act, anchorStartData);
            return;
        }
        if (anchorStartData != null && ycp0.m214190d().m214196f()) {
            ycp0.m214190d().m214199j();
            dt0.m113504D(this);
            return;
        }
        String strM195889m6 = ypv.m215672k().m195889m6();
        if (Mobile.TYPE.equals(strM195889m6)) {
            m71692o2(this.act, anchorStartData, true);
            return;
        }
        boolean zEquals = "forceRealName".equals(strM195889m6);
        Act act = this.act;
        if (zEquals) {
            m71667L2(act, true, new d30() { // from class: l.isr
                @Override // p149l.d30
                public final void call() {
                    this.f114797a.m71699y2(anchorStartData);
                }
            });
        } else {
            m71667L2(act, false, new d30() { // from class: l.msr
                @Override // p149l.d30
                public final void call() {
                    this.f135528a.m71700z2(anchorStartData);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m71695s2(Act act, AnchorStartData anchorStartData, roj0 roj0Var) {
        m71691K2(act, anchorStartData);
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ void m71696u2(final Act act, final AnchorStartData anchorStartData) {
        act.duringCreated(LivingNormalApiProvider.m71186B6()).subscribe(ffw.m121197h(new e30() { // from class: l.lsr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129889a.m71695s2(act, anchorStartData, (roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v2 */
    public final /* synthetic */ void m71697v2(AnchorStartData anchorStartData) {
        h5j0.INSTANCE.m129402a("live_res_loading", "live check res");
        gkh0.m126627j(u0t.f172945d, "start_live_act");
        Act act = this.act;
        act.startActivity(m71681l2(act, anchorStartData));
        dt0.m113504D(this);
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m71698w2() {
        dt0.m113504D(this);
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m71699y2(AnchorStartData anchorStartData) {
        m71691K2(this.act, anchorStartData);
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m71700z2(AnchorStartData anchorStartData) {
        m71691K2(this.act, anchorStartData);
    }
}
