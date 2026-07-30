package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveFollowRatePopupV2;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class dxi extends i6t<oo2, uwi> {
    public dxi(dum dumVar) {
        super(dumVar);
        mo52715C(new uwi());
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ void m118485P3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public /* synthetic */ void m118486X3(Followship followship) {
        ((uwi) this.viewModel).m198377v();
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [l.oo2] */
    /* JADX INFO: renamed from: R3 */
    public void m118487R3(String str, boolean z) {
        if (((uwi) this.viewModel).isShowing()) {
            m213810E2().m168511e0(false, mo78457R2(), "live_popupwindow", new x20() { // from class: l.cxi
                @Override // p153l.x20
                public final void call() {
                    o1j0.m165649w(R$string.f47651L4);
                }
            });
            afu.m97554c(mo78457R2(), m118488S3(str));
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: S3 */
    public tfs m118488S3(String str) {
        tfs.C20303a c20303aM190979i = tfs.m190969k().m190975e("live_popupwindow").m190979i(str);
        User userM168532l0 = m213810E2().m168532l0();
        if (userM168532l0 != null) {
            c20303aM190979i.m190974d(userM168532l0.f56859id).m190978h(userM168532l0.f56859id);
        }
        BLiveAbsData bLiveAbsDataMo183435j = m213810E2().mo183435j();
        if (bLiveAbsDataMo183435j != null) {
            c20303aM190979i.m190976f(bLiveAbsDataMo183435j.f45171id).m190977g(bLiveAbsDataMo183435j.state);
        }
        return c20303aM190979i.m190971a();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().FollowDialogEvent.show().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.wwi
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191285a.m118493Y3((BLiveFollowRatePopupV2) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ Boolean m118489T3(Long l2) {
        return Boolean.valueOf(!m213810E2().m168474R0());
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m118490U3(BLiveFollowRatePopupV2 bLiveFollowRatePopupV2, Long l2) {
        ((uwi) this.viewModel).m198375s(Long.valueOf(((long) bLiveFollowRatePopupV2.tickerTime) - l2.longValue()));
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m118491V3(BLiveFollowRatePopupV2 bLiveFollowRatePopupV2) {
        m118487R3(bLiveFollowRatePopupV2.text, true);
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m118492W3(Long l2) {
        ((uwi) this.viewModel).m198369i();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v13, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.oo2] */
    /* JADX INFO: renamed from: Y3 */
    public void m118493Y3(final BLiveFollowRatePopupV2 bLiveFollowRatePopupV2) {
        if (bLiveFollowRatePopupV2 == null || m213814K2().m189705l(LiveDialogEnum.SIGN_IN) || m213814K2().m189700g()) {
            return;
        }
        ((uwi) this.viewModel).m198374q(m213810E2().m168532l0(), bLiveFollowRatePopupV2);
        afu.m97555d(mo78457R2(), m118488S3(bLiveFollowRatePopupV2.text));
        boolean zEquals = TextUtils.equals(bLiveFollowRatePopupV2.type, "ticker");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (zEquals) {
            m138858H3(m213810E2().m168531k2(timeUnit)).filter(new qcj() { // from class: l.xwi
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f196503a.m118489T3((Long) obj);
                }
            }).take(bLiveFollowRatePopupV2.tickerTime).subscribe(dhw.m115827f(new y20() { // from class: l.ywi
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f201840a.m118490U3(bLiveFollowRatePopupV2, (Long) obj);
                }
            }, new y20() { // from class: l.zwi
                @Override // p153l.y20
                public final void call(Object obj) {
                    dxi.m118485P3((Throwable) obj);
                }
            }, new x20() { // from class: l.axi
                @Override // p153l.x20
                public final void call() {
                    this.f73860a.m118491V3(bLiveFollowRatePopupV2);
                }
            }));
        } else if (bLiveFollowRatePopupV2.showDuration > 0) {
            m138858H3(m213810E2().m168521h2(bLiveFollowRatePopupV2.showDuration, timeUnit)).take(1).subscribe(dhw.m115825d(new y20() { // from class: l.bxi
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f78876a.m118492W3((Long) obj);
                }
            }));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().m168549t0()).subscribe(dhw.m115825d(new y20() { // from class: l.vwi
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186143a.m118486X3((Followship) obj);
            }
        }));
    }
}
