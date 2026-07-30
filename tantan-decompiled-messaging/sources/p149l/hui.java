package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveFollowRatePopupV2;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class hui extends h4t<ho2, yti> {
    public hui(bsm bsmVar) {
        super(bsmVar);
        mo51532C(new yti());
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ void m133104P3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public /* synthetic */ void m133105X3(Followship followship) {
        ((yti) this.viewModel).m216031v();
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [l.ho2] */
    /* JADX INFO: renamed from: R3 */
    public void m133106R3(String str, boolean z) {
        if (((yti) this.viewModel).isShowing()) {
            m206027E2().m132125e0(false, mo77274R2(), "live_popupwindow", new d30() { // from class: l.gui
                @Override // p149l.d30
                public final void call() {
                    lsi0.m151593w(R$string.f46803L4);
                }
            });
            zcu.m218088c(mo77274R2(), m133107S3(str));
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: S3 */
    public sds m133107S3(String str) {
        sds.C19911a c19911aM183550i = sds.m183540k().m183546e("live_popupwindow").m183550i(str);
        User userM132146l0 = m206027E2().m132146l0();
        if (userM132146l0 != null) {
            c19911aM183550i.m183545d(userM132146l0.f56011id).m183549h(userM132146l0.f56011id);
        }
        BLiveAbsData bLiveAbsDataMo149813j = m206027E2().mo149813j();
        if (bLiveAbsDataMo149813j != null) {
            c19911aM183550i.m183547f(bLiveAbsDataMo149813j.f44323id).m183548g(bLiveAbsDataMo149813j.state);
        }
        return c19911aM183550i.m183542a();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().FollowDialogEvent.show().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.aui
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71778a.m133112Y3((BLiveFollowRatePopupV2) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ Boolean m133108T3(Long l2) {
        return Boolean.valueOf(!m206027E2().m132088R0());
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m133109U3(BLiveFollowRatePopupV2 bLiveFollowRatePopupV2, Long l2) {
        ((yti) this.viewModel).m216029s(Long.valueOf(((long) bLiveFollowRatePopupV2.tickerTime) - l2.longValue()));
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m133110V3(BLiveFollowRatePopupV2 bLiveFollowRatePopupV2) {
        m133106R3(bLiveFollowRatePopupV2.text, true);
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m133111W3(Long l2) {
        ((yti) this.viewModel).m216023i();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v13, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2] */
    /* JADX INFO: renamed from: Y3 */
    public void m133112Y3(final BLiveFollowRatePopupV2 bLiveFollowRatePopupV2) {
        if (bLiveFollowRatePopupV2 == null || m206031K2().m182469l(LiveDialogEnum.SIGN_IN) || m206031K2().m182464g()) {
            return;
        }
        ((yti) this.viewModel).m216028q(m206027E2().m132146l0(), bLiveFollowRatePopupV2);
        zcu.m218089d(mo77274R2(), m133107S3(bLiveFollowRatePopupV2.text));
        boolean zEquals = TextUtils.equals(bLiveFollowRatePopupV2.type, "ticker");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (zEquals) {
            m129299H3(m206027E2().m132145k2(timeUnit)).filter(new w9j() { // from class: l.bui
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f77325a.m133108T3((Long) obj);
                }
            }).take(bLiveFollowRatePopupV2.tickerTime).subscribe(ffw.m121195f(new e30() { // from class: l.cui
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f82571a.m133109U3(bLiveFollowRatePopupV2, (Long) obj);
                }
            }, new e30() { // from class: l.dui
                @Override // p149l.e30
                public final void call(Object obj) {
                    hui.m133104P3((Throwable) obj);
                }
            }, new d30() { // from class: l.eui
                @Override // p149l.d30
                public final void call() {
                    this.f93239a.m133110V3(bLiveFollowRatePopupV2);
                }
            }));
        } else if (bLiveFollowRatePopupV2.showDuration > 0) {
            m129299H3(m206027E2().m132135h2(bLiveFollowRatePopupV2.showDuration, timeUnit)).take(1).subscribe(ffw.m121193d(new e30() { // from class: l.fui
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f99341a.m133111W3((Long) obj);
                }
            }));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().m132165t0()).subscribe(ffw.m121193d(new e30() { // from class: l.zti
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204727a.m133105X3((Followship) obj);
            }
        }));
    }
}
