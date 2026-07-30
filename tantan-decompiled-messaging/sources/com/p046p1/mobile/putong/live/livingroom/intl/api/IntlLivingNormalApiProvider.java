package com.p046p1.mobile.putong.live.livingroom.intl.api;

import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveGamePanelButtons;
import com.p046p1.mobile.putong.live.base.data.BLiveUserCompliance;
import com.p046p1.mobile.putong.live.livingroom.intl.api.IntlLivingNormalApiProvider;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.bgv;
import p149l.cll;
import p149l.e30;
import p149l.ffw;
import p149l.fld0;
import p149l.g7t;
import p149l.hgn;
import p149l.idv;
import p149l.mt0;
import p149l.upv;
import p149l.w9j;
import p149l.ypv;
import p149l.ytr;

/* JADX INFO: loaded from: classes4.dex */
public class IntlLivingNormalApiProvider {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m75220b(BLiveEnvelope bLiveEnvelope) {
        ((bgv) ypv.m215673l(fld0.f98151f)).m101745y(bLiveEnvelope.data.monetizationConfig.isPaidUser);
        fld0<idv> fld0Var = fld0.f98147b;
        if (((idv) ypv.m215673l(fld0Var)).f112690b.m221515e() == null) {
            ((idv) ypv.m215673l(fld0Var)).f112690b.onNext(bLiveEnvelope.data.monetizationConfig);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ BLiveUserCompliance m75222d(BLiveEnvelope bLiveEnvelope) {
        BLiveUserCompliance bLiveUserCompliance = bLiveEnvelope.data.userCompliance;
        boolean z = bLiveUserCompliance.isPass;
        return bLiveUserCompliance;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m75223e(Throwable th) {
    }

    @NotNull
    public static C22306c<BaseLiveListBean<hgn>> fetchIntlGameBanners(String str) {
        return upv.m194934v(LiveApiBuilder.m67315u(ytr.m216073b("/live/intl-game-banners"), new mt0[0]).m107524p().m107536c("anchorId", str).m107537d(), "fetchIntlGameBanners", g7t.m124728a(hgn.class, "intlGameBanners"));
    }

    @NotNull
    public static C22306c<String> fetchRealJumpUrl(@Nullable String str) {
        return upv.m194920h(cll.m107499l(ytr.m216073b("/live/campaignBanner")).m107524p().m107536c("schema", str).m107537d(), "fetchRealJumpUrl").map(new w9j() { // from class: l.z8o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.schema;
            }
        });
    }

    @NotNull
    public static C22306c<BLiveUserCompliance> intlCheckUserCompliance() {
        return upv.m194920h(cll.m107499l(ytr.m216073b("/live/intlCheckUserCompliance")).m107524p().m107537d(), "intlCheckUserCompliance").map(new w9j() { // from class: l.a9o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlLivingNormalApiProvider.m75222d((BLiveEnvelope) obj);
            }
        });
    }

    public static C22306c<List<BLiveGamePanelButtons>> pollGamePanelMenus(String str, String str2, String str3, String str4) {
        return upv.m194920h(cll.m107499l(ytr.m216073b("/intl-live-gameMenu")).m107524p().m107536c("liveType", str).m107536c("liveMode", str4).m107536c("userType", str2).m107536c("roomId", str3).m107537d(), "pollGamePanelMenus" + str4 + str + str3).map(new w9j() { // from class: l.d9o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.gamePanelMenus.buttons;
            }
        });
    }

    public static void requestBubble() {
        upv.m194920h(cll.m107499l(ytr.m216073b("/intl-live-bubble-config")), "getIntlBubbleConfig").subscribe(ffw.m121194e(new e30() { // from class: l.b9o
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlLivingNormalApiProvider.m75220b((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.c9o
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlLivingNormalApiProvider.m75223e((Throwable) obj);
            }
        }));
    }
}
