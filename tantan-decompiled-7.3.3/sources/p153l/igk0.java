package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.live.livingroom.common.chat.notification.UserNotificationView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class igk0<T extends oo2> extends i6t<T, UserNotificationView> {

    /* JADX INFO: renamed from: i */
    public List<p9t> f114796i;

    /* JADX INFO: renamed from: j */
    public int f114797j;

    /* JADX INFO: renamed from: k */
    public List<p9t> f114798k;

    public igk0(dum<T> dumVar, UserNotificationView userNotificationView) {
        super(dumVar);
        this.f114796i = new ArrayList();
        this.f114797j = 0;
        this.f114798k = new ArrayList();
        mo52715C(userNotificationView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.oo2] */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ void m139936R3(Long l2) {
        if (this.f114797j > 1 || m213810E2().m168474R0() || this.f114796i.isEmpty()) {
            return;
        }
        p9t p9tVarRemove = this.f114796i.remove(0);
        if (p9tVarRemove.m171382e()) {
            m213811F2().ChatEvent.addNotificationItem().mo199273j(p9tVarRemove.m171390m());
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v5, types: [l.oo2] */
    /* JADX INFO: renamed from: N3 */
    public void m139937N3(p9t p9tVar) {
        if (p9tVar.m171384g().equals("follow")) {
            i35.m138267c(mo78457R2(), m213810E2(), "liveMessage_notification");
            m213810E2().m168508d0(false, mo78457R2(), "liveMessage");
            return;
        }
        i35.m138271g(mo78457R2(), m213810E2(), p9tVar);
        m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(100).m103154e(p9tVar.m171381d().getSchema()).m103152c());
        if (TextUtils.equals(p9tVar.m171384g(), "officialShowAudienceTrack")) {
            i4g0.m138523u("e_live_bottom_popup", "p_user_live_room", pf60.m172085a("live_category", "to_previous_room"));
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m139938O3(Followship followship) {
        this.f114797j++;
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m139939P3(p9t p9tVar) {
        if (p9tVar.m171384g().equals("follow")) {
            this.f114796i.clear();
            this.f114796i.add(p9tVar);
        } else if (p9tVar.m171382e()) {
            m213811F2().ChatEvent.addNotificationItem().mo199273j(p9tVar.m171390m());
        } else if (!((UserNotificationView) this.viewModel).m73927i()) {
            m139942U3(p9tVar);
        } else {
            this.f114798k.add(p9tVar);
            ((UserNotificationView) this.viewModel).m73926f(p9tVar.m171389l());
        }
    }

    /* JADX INFO: renamed from: S3 */
    public void m139940S3() {
        m213811F2().ChatEvent.scrollToEnd().m199277p();
    }

    /* JADX INFO: renamed from: T3 */
    public void m139941T3() {
        if (this.f114798k.isEmpty()) {
            return;
        }
        m139942U3(this.f114798k.remove(0));
        if (this.f114798k.isEmpty()) {
            return;
        }
        ((UserNotificationView) this.viewModel).m73926f(this.f114798k.get(0).m171389l());
    }

    /* JADX INFO: renamed from: U3 */
    public void m139942U3(p9t p9tVar) {
        ((UserNotificationView) this.viewModel).m73931n(p9tVar);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f114796i.clear();
        this.f114798k.clear();
        this.f114797j = 0;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated((C22421c<T>) m213810E2().m168549t0()).subscribe(dhw.m115825d(new y20() { // from class: l.egk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93950a.m139938O3((Followship) obj);
            }
        }));
        duringCreated((C22421c<T>) m213810E2().m168545q1().m98305m0()).flatMap(new qcj() { // from class: l.fgk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C22421c.just(tz40.m193650i((LongLinkAdminMessage.UserWithBgColorSocketNotification) obj));
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.ggk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104025a.m139939P3((p9t) obj);
            }
        }));
        int iM203570Z3 = zrv.m221193k().m203570Z3();
        if (iM203570Z3 > 0) {
            m138858H3(m213810E2().m168521h2(iM203570Z3, TimeUnit.SECONDS)).take(1).subscribe(dhw.m115825d(new y20() { // from class: l.hgk0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f109417a.m139936R3((Long) obj);
                }
            }));
        }
    }
}
