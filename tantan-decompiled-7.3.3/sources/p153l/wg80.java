package p153l;

import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class wg80 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m206181a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m206182b(Long l2) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX INFO: renamed from: e */
    public static void m206185e(i6t<?, ?> i6tVar) {
        final ?? M213810E2 = i6tVar.m213810E2();
        if (M213810E2.m168532l0() == null) {
            return;
        }
        final String str = M213810E2.m168532l0().f56859id;
        i6tVar.m138858H3(M213810E2.m168521h2((int) zrv.m221193k().m203412F5(), TimeUnit.SECONDS)).take(1).filter(new qcj() { // from class: l.sg80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(M213810E2.m202193m().m146878d());
            }
        }).doOnNext(new y20() { // from class: l.tg80
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveWatchCounter.m77513h().m77524p(str);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.ug80
            @Override // p153l.y20
            public final void call(Object obj) {
                wg80.m206182b((Long) obj);
            }
        }, new y20() { // from class: l.vg80
            @Override // p153l.y20
            public final void call(Object obj) {
                wg80.m206181a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public static void m206186f(oo2 oo2Var, AudienceStartData audienceStartData, String str, BLiveAbsData bLiveAbsData, boolean z) {
        String strValueOf;
        if (!z || z91.m219043c() <= 0) {
            z = false;
            strValueOf = "";
        } else {
            strValueOf = String.valueOf((pzi0.m174454o() - z91.m219042b()) / 1000.0d);
        }
        i4g0.m138492A("e_live_stream_view", str, jyb.m147494Y("anchorId", bLiveAbsData == null ? "" : bLiveAbsData.anchor.f45267id), jyb.m147494Y("live_id", bLiveAbsData != null ? bLiveAbsData.f45171id : ""), jyb.m147494Y("liveRecommendCategory", audienceStartData.category), jyb.m147494Y("live_outside_source", audienceStartData.source), jyb.m147494Y("live_in_source", oo2Var.mo160117o0()), jyb.m147494Y("click_to_stream_view_type", Boolean.valueOf(z)), jyb.m147494Y("room_enter_diff", strValueOf));
    }

    /* JADX INFO: renamed from: g */
    public static void m206187g(ig80<?> ig80Var, BLiveAbsData bLiveAbsData, boolean z) {
        if (ig80Var.m213810E2() instanceof ou40) {
            ou40 ou40Var = (ou40) ig80Var.m213810E2();
            if (bLiveAbsData == null) {
                bLiveAbsData = ou40Var.m118363A2().mo122892l();
            }
            m206186f(ou40Var, ou40Var.m169225J2(), ig80Var.mo78457R2(), bLiveAbsData, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r5v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: h */
    public static void m206188h(i6t<?, ?> i6tVar) {
        if (i6tVar.m213810E2().m202195r()) {
            User userM168532l0 = i6tVar.m213810E2().m168532l0();
            i4g0.m138493B("e_live_stream_buffer", i6tVar.mo78457R2(), jyb.m147494Y("live_network_type", ConnectivityReceiver.m82464d()), jyb.m147494Y("live_anchor_id", userM168532l0 == null ? "" : userM168532l0.f56859id), jyb.m147494Y("live_user_id", zrv.f205799a.m207631D0()), jyb.m147494Y("live_id", i6tVar.m213810E2().m202191k()));
        }
    }
}
