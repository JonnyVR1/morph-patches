package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p1.mobile.putong.data.Followship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveFollowRatePopupV2;
import com.tantanapp.common.data.DbObject;
import java.util.concurrent.TimeUnit;
import l.bwr;
import l.d30;
import l.e30;
import l.ffw;
import l.lsi0;
import l.sds;
import l.w9j;
import l.zcu;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hui extends h4t<ho2, yti> {
    public hui(bsm bsmVar) {
        super(bsmVar);
        C(new yti());
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ void m14820P3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public /* synthetic */ void m14821X3(Followship followship) {
        ((yti) ((bwr) this).viewModel).m26936v();
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [l.ho2] */
    /* JADX INFO: renamed from: R3 */
    public void m14822R3(String str, boolean z) {
        if (((yti) ((bwr) this).viewModel).isShowing()) {
            m25547E2().m14561e0(false, mo21430R2(), "live_popupwindow", new d30() { // from class: l.gui
                public final void call() {
                    lsi0.w(R$string.f2845L4);
                }
            });
            zcu.c(mo21430R2(), m14823S3(str));
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: S3 */
    public sds m14823S3(String str) {
        sds.a aVarI = sds.k().e("live_popupwindow").i(str);
        User userM14582l0 = m25547E2().m14582l0();
        if (userM14582l0 != null) {
            aVarI.d(((DbObject) userM14582l0).id).h(((DbObject) userM14582l0).id);
        }
        BLiveAbsData bLiveAbsDataM17234j = m25547E2().m17234j();
        if (bLiveAbsDataM17234j != null) {
            aVarI.f(bLiveAbsDataM17234j.id).g(bLiveAbsDataM17234j.state);
        }
        return aVarI.a();
    }

    /* JADX INFO: renamed from: T */
    public void m14824T() {
        super.T();
        duringCreated((c) m25548F2().FollowDialogEvent.show().g()).subscribe(ffw.d(new e30() { // from class: l.aui
            public final void call(Object obj) {
                this.f7889a.m14829Y3((BLiveFollowRatePopupV2) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ Boolean m14825T3(Long l2) {
        return Boolean.valueOf(!m25547E2().m14524R0());
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m14826U3(BLiveFollowRatePopupV2 bLiveFollowRatePopupV2, Long l2) {
        ((yti) ((bwr) this).viewModel).m26934s(Long.valueOf(((long) bLiveFollowRatePopupV2.tickerTime) - l2.longValue()));
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m14827V3(BLiveFollowRatePopupV2 bLiveFollowRatePopupV2) {
        m14822R3(bLiveFollowRatePopupV2.text, true);
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m14828W3(Long l2) {
        ((yti) ((bwr) this).viewModel).m26927i();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v13, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2] */
    /* JADX INFO: renamed from: Y3 */
    public void m14829Y3(final BLiveFollowRatePopupV2 bLiveFollowRatePopupV2) {
        if (bLiveFollowRatePopupV2 == null || m25551K2().m22224l(LiveDialogEnum.SIGN_IN) || m25551K2().m22219g()) {
            return;
        }
        ((yti) ((bwr) this).viewModel).m26933q(m25547E2().m14582l0(), bLiveFollowRatePopupV2);
        zcu.d(mo21430R2(), m14823S3(bLiveFollowRatePopupV2.text));
        boolean zEquals = TextUtils.equals(bLiveFollowRatePopupV2.type, "ticker");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (zEquals) {
            m14186H3(m25547E2().m14581k2(timeUnit)).filter(new w9j() { // from class: l.bui
                public final Object call(Object obj) {
                    return this.f8365a.m14825T3((Long) obj);
                }
            }).take(bLiveFollowRatePopupV2.tickerTime).subscribe(ffw.f(new e30() { // from class: l.cui
                public final void call(Object obj) {
                    this.f8945a.m14826U3(bLiveFollowRatePopupV2, (Long) obj);
                }
            }, new e30() { // from class: l.dui
                public final void call(Object obj) {
                    hui.m14820P3((Throwable) obj);
                }
            }, new d30() { // from class: l.eui
                public final void call() {
                    this.f9969a.m14827V3(bLiveFollowRatePopupV2);
                }
            }));
        } else if (bLiveFollowRatePopupV2.showDuration > 0) {
            m14186H3(m25547E2().m14571h2(bLiveFollowRatePopupV2.showDuration, timeUnit)).take(1).subscribe(ffw.d(new e30() { // from class: l.fui
                public final void call(Object obj) {
                    this.f10638a.m14828W3((Long) obj);
                }
            }));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m14830t() {
        super.t();
        duringCreated(m25547E2().m14601t0()).subscribe(ffw.d(new e30() { // from class: l.zti
            public final void call(Object obj) {
                this.f23584a.m14821X3((Followship) obj);
            }
        }));
    }
}
