package com.p000p1.mobile.putong.live.livingroom.intl.api;

import com.p000p1.mobile.putong.live.livingroom.intl.api.IntlLivingNormalApiProvider;
import com.p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveGamePanelButtons;
import com.p1.mobile.putong.live.base.data.BLiveUserCompliance;
import java.util.List;
import l.bgv;
import l.cll;
import l.e30;
import l.ffw;
import l.fld0;
import l.g7t;
import l.idv;
import l.mt0;
import l.upv;
import l.w9j;
import l.ypv;
import l.ytr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002l.hgn;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class IntlLivingNormalApiProvider {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m8838b(BLiveEnvelope bLiveEnvelope) {
        ((bgv) ypv.l(fld0.f)).y(bLiveEnvelope.data.monetizationConfig.isPaidUser);
        fld0 fld0Var = fld0.b;
        if (((idv) ypv.l(fld0Var)).b.e() == null) {
            ((idv) ypv.l(fld0Var)).b.onNext(bLiveEnvelope.data.monetizationConfig);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ BLiveUserCompliance m8840d(BLiveEnvelope bLiveEnvelope) {
        BLiveUserCompliance bLiveUserCompliance = bLiveEnvelope.data.userCompliance;
        boolean z = bLiveUserCompliance.isPass;
        return bLiveUserCompliance;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m8841e(Throwable th) {
    }

    @NotNull
    public static c<BaseLiveListBean<hgn>> fetchIntlGameBanners(String str) {
        return upv.v(LiveApiBuilder.u(ytr.b("/live/intl-game-banners"), new mt0[0]).p().c("anchorId", str).d(), "fetchIntlGameBanners", g7t.a(hgn.class, "intlGameBanners"));
    }

    @NotNull
    public static c<String> fetchRealJumpUrl(@Nullable String str) {
        return upv.h(cll.l(ytr.b("/live/campaignBanner")).p().c("schema", str).d(), "fetchRealJumpUrl").map(new w9j() { // from class: l.z8o
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.schema;
            }
        });
    }

    @NotNull
    public static c<BLiveUserCompliance> intlCheckUserCompliance() {
        return upv.h(cll.l(ytr.b("/live/intlCheckUserCompliance")).p().d(), "intlCheckUserCompliance").map(new w9j() { // from class: l.a9o
            public final Object call(Object obj) {
                return IntlLivingNormalApiProvider.m8840d((BLiveEnvelope) obj);
            }
        });
    }

    public static c<List<BLiveGamePanelButtons>> pollGamePanelMenus(String str, String str2, String str3, String str4) {
        return upv.h(cll.l(ytr.b("/intl-live-gameMenu")).p().c("liveType", str).c("liveMode", str4).c("userType", str2).c("roomId", str3).d(), "pollGamePanelMenus" + str4 + str + str3).map(new w9j() { // from class: l.d9o
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.gamePanelMenus.buttons;
            }
        });
    }

    public static void requestBubble() {
        upv.h(cll.l(ytr.b("/intl-live-bubble-config")), "getIntlBubbleConfig").subscribe(ffw.e(new e30() { // from class: l.b9o
            public final void call(Object obj) {
                IntlLivingNormalApiProvider.m8838b((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.c9o
            public final void call(Object obj) {
                IntlLivingNormalApiProvider.m8841e((Throwable) obj);
            }
        }));
    }
}
