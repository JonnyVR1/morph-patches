package com.p000p1.mobile.putong.live.livingroom.archi.act;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.archi.act.LiveAnchorCheckAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.common.R;
import com.p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p1.mobile.putong.live.base.data.BLiveIdCardVerificationInfo;
import com.p1.mobile.putong.live.base.data.BLiveVerificationAnchor;
import com.p1.mobile.putong.live.base.data.BLiveVerificationCenter;
import com.p1.mobile.putong.util.audio.AudioBusinessType;
import java.io.Serializable;
import l.d30;
import l.dt0;
import l.dz2;
import l.e30;
import l.f30;
import l.ffw;
import l.gkh0;
import l.h5j0;
import l.hgt;
import l.ib1;
import l.j2e0;
import l.lsi0;
import l.ptn;
import l.roj0;
import l.u0t;
import l.uvr;
import l.vdt;
import l.w9j;
import l.ycp0;
import l.ypv;
import p002l.eet;
import p002l.l1f;
import p002l.tn0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveAnchorCheckAct extends PutongAct {
    /* JADX INFO: renamed from: D2 */
    public static boolean m5031D2(BLiveVerificationCenter bLiveVerificationCenter) {
        BLiveIdCardVerificationInfo bLiveIdCardVerificationInfo = bLiveVerificationCenter.idCard;
        return bLiveIdCardVerificationInfo != null && "verified".equals(bLiveIdCardVerificationInfo.status.toString());
    }

    /* JADX INFO: renamed from: E2 */
    public static boolean m5032E2(BLiveVerificationCenter bLiveVerificationCenter) {
        BLiveVerificationAnchor bLiveVerificationAnchor = bLiveVerificationCenter.voiceAnchor;
        return bLiveVerificationAnchor != null && "verified".equals(bLiveVerificationAnchor.status.toString());
    }

    /* JADX INFO: renamed from: L2 */
    public static void m5033L2(final Act act, final boolean z, final d30 d30Var) {
        act.duringCreated(ypv.a.t()).filter(new w9j() { // from class: l.tsr
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveVerificationCenter) obj) != null);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.usr
            public final void call(Object obj) {
                LiveAnchorCheckAct.m5050r2((BLiveVerificationCenter) obj, z, act, d30Var);
            }
        }, new e30() { // from class: l.jsr
            public final void call(Object obj) {
                gkh0.j("[live]verification", "voice:" + ((Throwable) obj).getMessage());
            }
        }));
    }

    /* JADX INFO: renamed from: h2 */
    public static /* synthetic */ void m5044h2(String str, String str2) {
        lsi0.h(R.string.R);
        gkh0.j("[live]verification", "voice:" + str + ":" + str2);
    }

    /* JADX INFO: renamed from: l2 */
    public static Intent m5047l2(Act act, AnchorStartData anchorStartData) {
        Intent intent = new Intent((Context) act, (Class<?>) LiveAct.class);
        intent.putExtra("jump_to_tag", true);
        intent.addFlags(67108864);
        intent.putExtra("LIVE_ANCHOR_START_DATA", (Serializable) anchorStartData);
        return intent;
    }

    /* JADX INFO: renamed from: m2 */
    public static Intent m5048m2(Context context, AnchorStartData anchorStartData) {
        Intent intent = new Intent(context, (Class<?>) LiveAnchorCheckAct.class);
        intent.putExtra("start_data", (Serializable) anchorStartData);
        intent.putExtra("type", "live");
        return intent;
    }

    /* JADX INFO: renamed from: n2 */
    public static Intent m5049n2(Context context, AnchorStartData anchorStartData) {
        Intent intent = new Intent(context, (Class<?>) LiveAnchorCheckAct.class);
        intent.putExtra("start_data", (Serializable) anchorStartData);
        intent.putExtra("type", "voice");
        return intent;
    }

    /* JADX INFO: renamed from: r2 */
    public static void m5050r2(BLiveVerificationCenter bLiveVerificationCenter, boolean z, Act act, d30 d30Var) {
        if (z) {
            if (m5031D2(bLiveVerificationCenter)) {
                d30Var.call();
                return;
            }
        } else if (m5031D2(bLiveVerificationCenter) || m5032E2(bLiveVerificationCenter)) {
            d30Var.call();
            return;
        }
        j2e0.n(act, Uri.parse("tantanapp://actualnameVerify"), new f30() { // from class: l.ksr
            public final void call(Object obj, Object obj2) {
                LiveAnchorCheckAct.m5044h2((String) obj, (String) obj2);
            }
        });
        dt0.D(act);
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m5051A2(String str, AnchorStartData anchorStartData) {
        if ("voice".equals(str)) {
            m5060q2(anchorStartData);
        } else {
            m5059p2(anchorStartData);
        }
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m5053C2() {
        dt0.D(this);
    }

    /* JADX INFO: renamed from: F2 */
    public final void m5054F2(Act act, AnchorStartData anchorStartData) {
        gkh0.j(u0t.d, "start_voice_live_act");
        h5j0.INSTANCE.a("voice_res_loading", "voice check res");
        anchorStartData.type = "type_voice_live";
        Intent intent = new Intent((Context) act, (Class<?>) LiveAct.class);
        intent.putExtra("jump_to_tag", true);
        intent.addFlags(67108864);
        intent.putExtra("LIVE_ANCHOR_START_DATA", (Serializable) anchorStartData);
        act.startActivity(intent);
        dt0.D(this);
    }

    /* JADX INFO: renamed from: H2, reason: merged with bridge method [inline-methods] */
    public final void m5052B2(Act act, AnchorStartData anchorStartData) {
        if (!uvr.d().B1() || !vdt.b(3)) {
            m5054F2(act, anchorStartData);
            return;
        }
        AudienceStartData audienceStartDataU = AudienceStartData.getBuilder().Q(true).O(anchorStartData.anchorSource).T(anchorStartData.voiceEntranceType).u();
        gkh0.j(u0t.d, "start_voice_live_act");
        h5j0.INSTANCE.a("voice_res_loading", "voice check res");
        anchorStartData.type = "type_voice_live";
        Intent intent = new Intent((Context) act, (Class<?>) LiveAct.class);
        intent.putExtra("jump_to_tag", false);
        intent.addFlags(67108864);
        intent.putExtra("LIVE_AUDIENCE_START_DATA", (Serializable) audienceStartDataU);
        act.startActivity(intent);
        dt0.D(this);
    }

    /* JADX INFO: renamed from: I2 */
    public final void m5056I2(Act act, final String str, final AnchorStartData anchorStartData) {
        ptn.c(str, new ptn.a((d30) null, new d30() { // from class: l.psr
            public final void call() {
                this.f17634a.m5051A2(str, anchorStartData);
            }
        }));
    }

    /* JADX INFO: renamed from: K2 */
    public final void m5057K2(final Act act, final AnchorStartData anchorStartData) {
        h5j0.INSTANCE.d("voice_res_loading");
        tn0.m23080p(act, anchorStartData, hgt.Companion.S(), new d30() { // from class: l.rsr
            public final void call() {
                this.f18667a.m5052B2(act, anchorStartData);
            }
        }, new d30() { // from class: l.ssr
            public final void call() {
                this.f19264a.m5053C2();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super.initDataOnCreate();
        AnchorStartData serializableExtra = getIntent().getSerializableExtra("start_data");
        if (serializableExtra == null) {
            serializableExtra = AnchorStartData.getBuilder().k();
        }
        if (TextUtils.equals(getIntent().getStringExtra("type"), "voice")) {
            m5060q2(serializableExtra);
        } else {
            m5059p2(serializableExtra);
        }
    }

    /* JADX INFO: renamed from: o2 */
    public final void m5058o2(final Act act, final AnchorStartData anchorStartData, boolean z) {
        dz2.d(act, new d30() { // from class: l.qsr
            public final void call() {
                this.f18204a.m5062u2(act, anchorStartData);
            }
        }, z);
    }

    /* JADX INFO: renamed from: p2 */
    public final void m5059p2(final AnchorStartData anchorStartData) {
        if (l1f.m16936c()) {
            dt0.D(this);
            return;
        }
        String str = u0t.d;
        gkh0.j(str, "anchor_start_live");
        if (ypv.a.R()) {
            ypv.a.o0(1);
            gkh0.j(str, "teenMode_can't_startLive");
            dt0.D(this);
            return;
        }
        AudioBusinessType audioBusinessTypeC = ib1.b().c();
        if (!vdt.b(2) && audioBusinessTypeC != null && audioBusinessTypeC != AudioBusinessType.CHAT_ROOM_WINDOW) {
            m5056I2(((Act) this).act, "live", anchorStartData);
            return;
        }
        eet.m12447a("anchor_start_live_click", true, anchorStartData.traceId, anchorStartData.anchorSource, null, null);
        h5j0.INSTANCE.d("live_res_loading");
        tn0.m23080p(((Act) this).act, anchorStartData, hgt.Companion.O(), new d30() { // from class: l.nsr
            public final void call() {
                this.f16179a.m5063v2(anchorStartData);
            }
        }, new d30() { // from class: l.osr
            public final void call() {
                this.f16774a.m5064w2();
            }
        });
    }

    /* JADX INFO: renamed from: q2 */
    public final void m5060q2(final AnchorStartData anchorStartData) {
        AudioBusinessType audioBusinessTypeC = ib1.b().c();
        if (!vdt.b(3) && audioBusinessTypeC != null && audioBusinessTypeC != AudioBusinessType.CHAT_ROOM_WINDOW) {
            m5056I2(((Act) this).act, "voice", anchorStartData);
            return;
        }
        if (!vdt.b(3)) {
            m5057K2(((Act) this).act, anchorStartData);
            return;
        }
        if (anchorStartData != null && ycp0.d().f()) {
            ycp0.d().j();
            dt0.D(this);
            return;
        }
        String strM6 = ypv.k().m6();
        if ("mobile".equals(strM6)) {
            m5058o2(((Act) this).act, anchorStartData, true);
            return;
        }
        boolean zEquals = "forceRealName".equals(strM6);
        Act act = ((Act) this).act;
        if (zEquals) {
            m5033L2(act, true, new d30() { // from class: l.isr
                public final void call() {
                    this.f13398a.m5065y2(anchorStartData);
                }
            });
        } else {
            m5033L2(act, false, new d30() { // from class: l.msr
                public final void call() {
                    this.f15617a.m5066z2(anchorStartData);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m5061s2(Act act, AnchorStartData anchorStartData, roj0 roj0Var) {
        m5057K2(act, anchorStartData);
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ void m5062u2(final Act act, final AnchorStartData anchorStartData) {
        act.duringCreated(LivingNormalApiProvider.m4552B6()).subscribe(ffw.h(new e30() { // from class: l.lsr
            public final void call(Object obj) {
                this.f15038a.m5061s2(act, anchorStartData, (roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v2 */
    public final /* synthetic */ void m5063v2(AnchorStartData anchorStartData) {
        h5j0.INSTANCE.a("live_res_loading", "live check res");
        gkh0.j(u0t.d, "start_live_act");
        Act act = ((Act) this).act;
        act.startActivity(m5047l2(act, anchorStartData));
        dt0.D(this);
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m5064w2() {
        dt0.D(this);
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m5065y2(AnchorStartData anchorStartData) {
        m5057K2(((Act) this).act, anchorStartData);
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m5066z2(AnchorStartData anchorStartData) {
        m5057K2(((Act) this).act, anchorStartData);
    }
}
