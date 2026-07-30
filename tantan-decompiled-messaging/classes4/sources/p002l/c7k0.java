package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.common.chat.notification.UserNotificationView;
import com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage;
import com.p1.mobile.putong.data.Followship;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.bwr;
import l.e30;
import l.ffw;
import l.j760;
import l.w9j;
import l.ypv;
import l.zvf0;
import p002l.ho2;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class c7k0<T extends ho2> extends h4t<T, UserNotificationView> {

    /* JADX INFO: renamed from: i */
    public List<o7t> f8526i;

    /* JADX INFO: renamed from: j */
    public int f8527j;

    /* JADX INFO: renamed from: k */
    public List<o7t> f8528k;

    public c7k0(bsm<T> bsmVar, UserNotificationView userNotificationView) {
        super(bsmVar);
        this.f8526i = new ArrayList();
        this.f8527j = 0;
        this.f8528k = new ArrayList();
        C(userNotificationView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2] */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ void m10785R3(Long l2) {
        if (this.f8527j > 1 || m25547E2().m14524R0() || this.f8526i.isEmpty()) {
            return;
        }
        o7t o7tVarRemove = this.f8526i.remove(0);
        if (o7tVarRemove.m19281e()) {
            m25548F2().ChatEvent.addNotificationItem().j(o7tVarRemove.m19289m());
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v5, types: [l.ho2] */
    /* JADX INFO: renamed from: N3 */
    public void m10786N3(o7t o7tVar) {
        if (o7tVar.m19283g().equals("follow")) {
            j25.m15558c(mo21430R2(), m25547E2(), "liveMessage_notification");
            m25547E2().m14558d0(false, mo21430R2(), "liveMessage");
            return;
        }
        j25.m15562g(mo21430R2(), m25547E2(), o7tVar);
        m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(100).m25610e(o7tVar.m19280d().getSchema()).m25608c());
        if (TextUtils.equals(o7tVar.m19283g(), "officialShowAudienceTrack")) {
            zvf0.u("e_live_bottom_popup", "p_user_live_room", new j760[]{j760.a("live_category", "to_previous_room")});
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m10787O3(Followship followship) {
        this.f8527j++;
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m10788P3(o7t o7tVar) {
        if (o7tVar.m19283g().equals("follow")) {
            this.f8526i.clear();
            this.f8526i.add(o7tVar);
        } else if (o7tVar.m19281e()) {
            m25548F2().ChatEvent.addNotificationItem().j(o7tVar.m19289m());
        } else if (!((UserNotificationView) ((bwr) this).viewModel).m6250i()) {
            m10791U3(o7tVar);
        } else {
            this.f8528k.add(o7tVar);
            ((UserNotificationView) ((bwr) this).viewModel).m6249f(o7tVar.m19288l());
        }
    }

    /* JADX INFO: renamed from: S3 */
    public void m10789S3() {
        m25548F2().ChatEvent.scrollToEnd().p();
    }

    /* JADX INFO: renamed from: T3 */
    public void m10790T3() {
        if (this.f8528k.isEmpty()) {
            return;
        }
        m10791U3(this.f8528k.remove(0));
        if (this.f8528k.isEmpty()) {
            return;
        }
        ((UserNotificationView) ((bwr) this).viewModel).m6249f(this.f8528k.get(0).m19288l());
    }

    /* JADX INFO: renamed from: U3 */
    public void m10791U3(o7t o7tVar) {
        ((UserNotificationView) ((bwr) this).viewModel).m6255n(o7tVar);
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        this.f8526i.clear();
        this.f8528k.clear();
        this.f8527j = 0;
    }

    /* JADX INFO: renamed from: t */
    public void m10792t() {
        super.t();
        duringCreated(m25547E2().m14601t0()).subscribe(ffw.d(new e30() { // from class: l.y6k0
            public final void call(Object obj) {
                this.f22701a.m10787O3((Followship) obj);
            }
        }));
        duringCreated(m25547E2().m14596q1().m0()).flatMap(new w9j() { // from class: l.z6k0
            public final Object call(Object obj) {
                return c.just(er40.m12682i((LongLinkAdminMessage.UserWithBgColorSocketNotification) obj));
            }
        }).subscribe(ffw.d(new e30() { // from class: l.a7k0
            public final void call(Object obj) {
                this.f7435a.m10788P3((o7t) obj);
            }
        }));
        int iZ3 = ypv.k().Z3();
        if (iZ3 > 0) {
            m14186H3(m25547E2().m14571h2(iZ3, TimeUnit.SECONDS)).take(1).subscribe(ffw.d(new e30() { // from class: l.b7k0
                public final void call(Object obj) {
                    this.f8021a.m10785R3((Long) obj);
                }
            }));
        }
    }
}
