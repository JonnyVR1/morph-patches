package com.p051p1.mobile.putong.live.livingroom.intl.api;

import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveGamePanelButtons;
import com.p051p1.mobile.putong.live.base.data.BLiveUserCompliance;
import com.p051p1.mobile.putong.live.livingroom.intl.api.IntlLivingNormalApiProvider;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.civ;
import p153l.dhw;
import p153l.h9t;
import p153l.hin;
import p153l.htd0;
import p153l.jfv;
import p153l.qcj;
import p153l.rnl;
import p153l.st0;
import p153l.vrv;
import p153l.y20;
import p153l.zrv;
import p153l.zvr;

/* JADX INFO: loaded from: classes4.dex */
public class IntlLivingNormalApiProvider {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m76403b(BLiveEnvelope bLiveEnvelope) {
        ((civ) zrv.m221194l(htd0.f111524f)).m109981y(bLiveEnvelope.data.monetizationConfig.isPaidUser);
        htd0<jfv> htd0Var = htd0.f111520b;
        if (((jfv) zrv.m221194l(htd0Var)).f120641b.m222761e() == null) {
            ((jfv) zrv.m221194l(htd0Var)).f120641b.onNext(bLiveEnvelope.data.monetizationConfig);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ BLiveUserCompliance m76405d(BLiveEnvelope bLiveEnvelope) {
        BLiveUserCompliance bLiveUserCompliance = bLiveEnvelope.data.userCompliance;
        boolean z = bLiveUserCompliance.isPass;
        return bLiveUserCompliance;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m76406e(Throwable th) {
    }

    @NotNull
    public static C22421c<BaseLiveListBean<hin>> fetchIntlGameBanners(String str) {
        return vrv.m202561v(LiveApiBuilder.m68498u(zvr.m221802b("/live/intl-game-banners"), new st0[0]).m182288p().m182300c("anchorId", str).m182301d(), "fetchIntlGameBanners", h9t.m134084a(hin.class, "intlGameBanners"));
    }

    @NotNull
    public static C22421c<String> fetchRealJumpUrl(@Nullable String str) {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/live/campaignBanner")).m182288p().m182300c("schema", str).m182301d(), "fetchRealJumpUrl").map(new qcj() { // from class: l.zao
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.schema;
            }
        });
    }

    @NotNull
    public static C22421c<BLiveUserCompliance> intlCheckUserCompliance() {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/live/intlCheckUserCompliance")).m182288p().m182301d(), "intlCheckUserCompliance").map(new qcj() { // from class: l.abo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlLivingNormalApiProvider.m76405d((BLiveEnvelope) obj);
            }
        });
    }

    public static C22421c<List<BLiveGamePanelButtons>> pollGamePanelMenus(String str, String str2, String str3, String str4) {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/intl-live-gameMenu")).m182288p().m182300c("liveType", str).m182300c("liveMode", str4).m182300c("userType", str2).m182300c("roomId", str3).m182301d(), "pollGamePanelMenus" + str4 + str + str3).map(new qcj() { // from class: l.dbo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.gamePanelMenus.buttons;
            }
        });
    }

    public static void requestBubble() {
        vrv.m202547h(rnl.m182263l(zvr.m221802b("/intl-live-bubble-config")), "getIntlBubbleConfig").subscribe(dhw.m115826e(new y20() { // from class: l.bbo
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlLivingNormalApiProvider.m76403b((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.cbo
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlLivingNormalApiProvider.m76406e((Throwable) obj);
            }
        }));
    }
}
