package p149l;

import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class q880 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m173345a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m173346b(Long l2) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: e */
    public static void m173349e(h4t<?, ?> h4tVar) {
        final ?? M206027E2 = h4tVar.m206027E2();
        if (M206027E2.m132146l0() == null) {
            return;
        }
        final String str = M206027E2.m132146l0().f56011id;
        h4tVar.m129299H3(M206027E2.m132135h2((int) ypv.m215672k().m195625F5(), TimeUnit.SECONDS)).take(1).filter(new w9j() { // from class: l.m880
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(M206027E2.m149816m().m137797d());
            }
        }).doOnNext(new e30() { // from class: l.n880
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveWatchCounter.m76330h().m76341p(str);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.o880
            @Override // p149l.e30
            public final void call(Object obj) {
                q880.m173346b((Long) obj);
            }
        }, new e30() { // from class: l.p880
            @Override // p149l.e30
            public final void call(Object obj) {
                q880.m173345a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public static void m173350f(ho2 ho2Var, AudienceStartData audienceStartData, String str, BLiveAbsData bLiveAbsData, boolean z) {
        String strValueOf;
        if (!z || s91.m182690c() <= 0) {
            z = false;
            strValueOf = "";
        } else {
            strValueOf = String.valueOf((mqi0.m155944o() - s91.m182689b()) / 1000.0d);
        }
        zvf0.m220368A("e_live_stream_view", str, vwb.m200311Y("anchorId", bLiveAbsData == null ? "" : bLiveAbsData.anchor.f44419id), vwb.m200311Y("live_id", bLiveAbsData != null ? bLiveAbsData.f44323id : ""), vwb.m200311Y("liveRecommendCategory", audienceStartData.category), vwb.m200311Y("live_outside_source", audienceStartData.source), vwb.m200311Y("live_in_source", ho2Var.mo132155o0()), vwb.m200311Y("click_to_stream_view_type", Boolean.valueOf(z)), vwb.m200311Y("room_enter_diff", strValueOf));
    }

    /* JADX INFO: renamed from: g */
    public static void m173351g(c880<?> c880Var, BLiveAbsData bLiveAbsData, boolean z) {
        if (c880Var.m206027E2() instanceof am40) {
            am40 am40Var = (am40) c880Var.m206027E2();
            if (bLiveAbsData == null) {
                bLiveAbsData = am40Var.m170393A2().mo165470l();
            }
            m173350f(am40Var, am40Var.m97478J2(), c880Var.mo77274R2(), bLiveAbsData, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r5v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: h */
    public static void m173352h(h4t<?, ?> h4tVar) {
        if (h4tVar.m206027E2().m149820r()) {
            User userM132146l0 = h4tVar.m206027E2().m132146l0();
            zvf0.m220369B("e_live_stream_buffer", h4tVar.mo77274R2(), vwb.m200311Y("live_network_type", ConnectivityReceiver.m81281d()), vwb.m200311Y("live_anchor_id", userM132146l0 == null ? "" : userM132146l0.f56011id), vwb.m200311Y("live_user_id", ypv.f199493a.m199309D0()), vwb.m200311Y("live_id", h4tVar.m206027E2().m149814k()));
        }
    }
}
