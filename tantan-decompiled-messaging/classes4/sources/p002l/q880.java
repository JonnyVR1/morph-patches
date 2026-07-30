package p002l;

import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.concurrent.TimeUnit;
import l.e30;
import l.ffw;
import l.j760;
import l.mqi0;
import l.vwb;
import l.w9j;
import l.ypv;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class q880 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m21061a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m21062b(Long l2) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: e */
    public static void m21065e(h4t<?, ?> h4tVar) {
        final ?? M25547E2 = h4tVar.m25547E2();
        if (M25547E2.m14582l0() == null) {
            return;
        }
        final String str = ((DbObject) M25547E2.m14582l0()).id;
        h4tVar.m14186H3(M25547E2.m14571h2((int) ypv.k().F5(), TimeUnit.SECONDS)).take(1).filter(new w9j() { // from class: l.m880
            public final Object call(Object obj) {
                return Boolean.valueOf(M25547E2.m17237m().m15301d());
            }
        }).doOnNext(new e30() { // from class: l.n880
            public final void call(Object obj) {
                LiveWatchCounter.h().p(str);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.o880
            public final void call(Object obj) {
                q880.m21062b((Long) obj);
            }
        }, new e30() { // from class: l.p880
            public final void call(Object obj) {
                q880.m21061a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public static void m21066f(ho2 ho2Var, AudienceStartData audienceStartData, String str, BLiveAbsData bLiveAbsData, boolean z) {
        String strValueOf;
        if (!z || s91.m22254c() <= 0) {
            z = false;
            strValueOf = "";
        } else {
            strValueOf = String.valueOf((mqi0.o() - s91.m22253b()) / 1000.0d);
        }
        zvf0.A("e_live_stream_view", str, new j760[]{vwb.Y("anchorId", bLiveAbsData == null ? "" : bLiveAbsData.anchor.id), vwb.Y("live_id", bLiveAbsData != null ? bLiveAbsData.id : ""), vwb.Y("liveRecommendCategory", audienceStartData.category), vwb.Y("live_outside_source", audienceStartData.source), vwb.Y("live_in_source", ho2Var.mo14591o0()), vwb.Y("click_to_stream_view_type", Boolean.valueOf(z)), vwb.Y("room_enter_diff", strValueOf)});
    }

    /* JADX INFO: renamed from: g */
    public static void m21067g(c880<?> c880Var, BLiveAbsData bLiveAbsData, boolean z) {
        if (c880Var.m25547E2() instanceof am40) {
            am40 am40Var = (am40) c880Var.m25547E2();
            if (bLiveAbsData == null) {
                bLiveAbsData = am40Var.m20501A2().mo19690l();
            }
            m21066f(am40Var, am40Var.m9881J2(), c880Var.mo21430R2(), bLiveAbsData, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r5v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: h */
    public static void m21068h(h4t<?, ?> h4tVar) {
        if (h4tVar.m25547E2().m17241r()) {
            User userM14582l0 = h4tVar.m25547E2().m14582l0();
            zvf0.B("e_live_stream_buffer", h4tVar.mo21430R2(), new j760[]{vwb.Y("live_network_type", ConnectivityReceiver.d()), vwb.Y("live_anchor_id", userM14582l0 == null ? "" : ((DbObject) userM14582l0).id), vwb.Y("live_user_id", ypv.a.D0()), vwb.Y("live_id", h4tVar.m25547E2().m17235k())});
        }
    }
}
