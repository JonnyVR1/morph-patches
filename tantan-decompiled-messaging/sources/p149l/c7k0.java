package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.live.livingroom.common.chat.notification.UserNotificationView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class c7k0<T extends ho2> extends h4t<T, UserNotificationView> {

    /* JADX INFO: renamed from: i */
    public List<o7t> f79623i;

    /* JADX INFO: renamed from: j */
    public int f79624j;

    /* JADX INFO: renamed from: k */
    public List<o7t> f79625k;

    public c7k0(bsm<T> bsmVar, UserNotificationView userNotificationView) {
        super(bsmVar);
        this.f79623i = new ArrayList();
        this.f79624j = 0;
        this.f79625k = new ArrayList();
        mo51532C(userNotificationView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2] */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ void m105571R3(Long l2) {
        if (this.f79624j > 1 || m206027E2().m132088R0() || this.f79623i.isEmpty()) {
            return;
        }
        o7t o7tVarRemove = this.f79623i.remove(0);
        if (o7tVarRemove.m163053e()) {
            m206028F2().ChatEvent.addNotificationItem().mo172463j(o7tVarRemove.m163061m());
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v5, types: [l.ho2] */
    /* JADX INFO: renamed from: N3 */
    public void m105572N3(o7t o7tVar) {
        if (o7tVar.m163055g().equals("follow")) {
            j25.m139407c(mo77274R2(), m206027E2(), "liveMessage_notification");
            m206027E2().m132122d0(false, mo77274R2(), "liveMessage");
            return;
        }
        j25.m139411g(mo77274R2(), m206027E2(), o7tVar);
        m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(100).m206701e(o7tVar.m163052d().getSchema()).m206699c());
        if (TextUtils.equals(o7tVar.m163055g(), "officialShowAudienceTrack")) {
            zvf0.m220399u("e_live_bottom_popup", "p_user_live_room", j760.m140076a("live_category", "to_previous_room"));
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m105573O3(Followship followship) {
        this.f79624j++;
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m105574P3(o7t o7tVar) {
        if (o7tVar.m163055g().equals("follow")) {
            this.f79623i.clear();
            this.f79623i.add(o7tVar);
        } else if (o7tVar.m163053e()) {
            m206028F2().ChatEvent.addNotificationItem().mo172463j(o7tVar.m163061m());
        } else if (!((UserNotificationView) this.viewModel).m72744i()) {
            m105577U3(o7tVar);
        } else {
            this.f79625k.add(o7tVar);
            ((UserNotificationView) this.viewModel).m72743f(o7tVar.m163060l());
        }
    }

    /* JADX INFO: renamed from: S3 */
    public void m105575S3() {
        m206028F2().ChatEvent.scrollToEnd().m172467p();
    }

    /* JADX INFO: renamed from: T3 */
    public void m105576T3() {
        if (this.f79625k.isEmpty()) {
            return;
        }
        m105577U3(this.f79625k.remove(0));
        if (this.f79625k.isEmpty()) {
            return;
        }
        ((UserNotificationView) this.viewModel).m72743f(this.f79625k.get(0).m163060l());
    }

    /* JADX INFO: renamed from: U3 */
    public void m105577U3(o7t o7tVar) {
        ((UserNotificationView) this.viewModel).m72748n(o7tVar);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f79623i.clear();
        this.f79625k.clear();
        this.f79624j = 0;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated((C22306c<T>) m206027E2().m132165t0()).subscribe(ffw.m121193d(new e30() { // from class: l.y6k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196575a.m105573O3((Followship) obj);
            }
        }));
        duringCreated((C22306c<T>) m206027E2().m132160q1().m189123m0()).flatMap(new w9j() { // from class: l.z6k0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C22306c.just(er40.m117821i((LongLinkAdminMessage.UserWithBgColorSocketNotification) obj));
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.a7k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67935a.m105574P3((o7t) obj);
            }
        }));
        int iM195783Z3 = ypv.m215672k().m195783Z3();
        if (iM195783Z3 > 0) {
            m129299H3(m206027E2().m132135h2(iM195783Z3, TimeUnit.SECONDS)).take(1).subscribe(ffw.m121193d(new e30() { // from class: l.b7k0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f73998a.m105571R3((Long) obj);
                }
            }));
        }
    }
}
