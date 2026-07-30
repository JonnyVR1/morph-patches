package p009l;

import android.content.Intent;
import android.text.TextUtils;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedLikersItemData;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedNearbyItemData;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedUserItemData;
import com.p1.mobile.putong.core.data.FeedType;
import com.p1.mobile.putong.core.data.MyMeetFeedItem;
import com.p1.mobile.putong.core.data.MyMeetSeeReminder;
import com.p1.mobile.putong.core.data.MyTabTask;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.Links;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import l.d30;
import l.e30;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.vwb;
import l.w9j;
import l.xaj0;
import l.xma;
import l.y9j;
import l.yvv;
import l.zvf0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ey10 extends hx10<hy10> {

    /* JADX INFO: renamed from: a */
    public Frag f12709a;

    /* JADX INFO: renamed from: b */
    public r2y f12710b;

    /* JADX INFO: renamed from: c */
    public final a<xaj0<Boolean, Boolean, Boolean>> f12711c;

    public ey10(mcr mcrVar) {
        super(mcrVar);
        this.f12711c = a.b();
        this.f12709a = (Frag) mcrVar;
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ j760 m14119A0(q860 q860Var) {
        return NullChecker.a(q860Var) ? j760.a(Integer.valueOf(q860Var.m20835d()), q860Var.f19068a) : j760.a(0, new ArrayList());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ Boolean m14122E0(String str, User user, User user2) {
        boolean z;
        if (TextUtils.equals(((DbObject) user2).id, str)) {
            z = true;
        } else {
            z = false;
            if (NullChecker.a(user) && !vwb.J(user.pictures) && !vwb.J(user2.pictures) && TextUtils.equals(((Media) user.picture(0)).url, ((Media) user2.picture(0)).url)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: F0 */
    private void m14123F0() {
        if (CoreModule.P().a().e2()) {
            CoreLikers coreLikers = CoreModule.c.u0;
            coreLikers.f7(25, ((Long) coreLikers.k0.get()).longValue(), "");
        } else {
            CoreLikers coreLikers2 = CoreModule.c.u0;
            coreLikers2.V6((Links) null, ((Long) coreLikers2.k0.get()).longValue(), 25, "");
        }
        if (CoreModule.P().g().D9() && yvv.c()) {
            CoreModule.c.m2.D3((Links) null, 20, true);
        }
        CoreModule.c.e0.A7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m14124I0() {
        ((hy10) ((jq2) this).viewModel).m16028q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public /* synthetic */ void m14125J0() {
        ((hy10) ((jq2) this).viewModel).m16030s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m14126L0() {
        ((hy10) ((jq2) this).viewModel).m16024m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public /* synthetic */ void m14127N0() {
        ((hy10) ((jq2) this).viewModel).m16027p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public /* synthetic */ void m14128O0() {
        ((hy10) ((jq2) this).viewModel).m16025n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public /* synthetic */ void m14129Q0(Boolean bool) {
        ((hy10) ((jq2) this).viewModel).m16023l(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public c<j760<Integer, List<User>>> m14130U0(boolean z) {
        return z ? CoreModule.c.u0.J6().map(new w9j() { // from class: l.nx10
            public final Object call(Object obj) {
                return ey10.m14119A0((q860) obj);
            }
        }) : CoreModule.c.u0.R6();
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ MyTabTask m14146y0(List list) {
        return (MyTabTask) vwb.r(list, new w9j() { // from class: l.mx10
            public final Object call(Object obj) {
                return Boolean.valueOf(((MyTabTask) obj).exposed);
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    public Frag m14148G0() {
        return this.f12709a;
    }

    /* JADX INFO: renamed from: H0 */
    public lwl m14149H0() {
        if (this.f12710b == null) {
            r2y r2yVar = new r2y(act());
            this.f12710b = r2yVar;
            r2yVar.m21382l(true);
        }
        return this.f12710b;
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m14150P0(xaj0 xaj0Var) {
        Object obj = xaj0Var.a;
        List list = (List) ((j760) obj).b;
        int iIntValue = ((Integer) ((j760) obj).a).intValue();
        if (!vwb.J(list) && CoreModule.P().a().Yp()) {
            MyMeetSeeReminder myMeetSeeReminderW4 = CoreModule.c.m1.w4();
            if (!NullChecker.a(myMeetSeeReminderW4) || vwb.J(myMeetSeeReminderW4.userIds)) {
                vwb.z(list, new e30() { // from class: l.px10
                    public final void call(Object obj2) {
                        ((User) obj2).localSeeReminderType = "";
                    }
                });
            } else {
                final String str = (String) myMeetSeeReminderW4.userIds.get(0);
                final User userPa = CoreModule.c.e0.Pa(str);
                User user = (User) vwb.v(list, new w9j() { // from class: l.ox10
                    public final Object call(Object obj2) {
                        return ey10.m14122E0(str, userPa, (User) obj2);
                    }
                }, 4);
                if (user != null) {
                    user.localSeeReminderType = myMeetSeeReminderW4.reminderType.toString();
                } else if (NullChecker.a(userPa)) {
                    userPa.localSeeReminderType = myMeetSeeReminderW4.reminderType.toString();
                    list.add(0, userPa);
                }
            }
        }
        ((hy10) ((jq2) this).viewModel).m16019i(new MeetFeedLikersItemData(iIntValue, list, ((Integer) xaj0Var.b).intValue()), m14149H0());
        if (CoreModule.P().g().D9()) {
            ((hy10) ((jq2) this).viewModel).m16021j(new MeetFeedNearbyItemData(((q860) xaj0Var.c).f19068a));
        }
        xaj0 xaj0VarA = (xaj0) this.f12711c.e();
        if (xaj0VarA == null) {
            xaj0VarA = xaj0.a(Boolean.FALSE, Boolean.valueOf(iIntValue == 0), Boolean.valueOf(vwb.J(((q860) xaj0Var.c).f19068a)));
        } else {
            xaj0VarA.b = Boolean.valueOf(iIntValue == 0);
            xaj0VarA.c = Boolean.valueOf(vwb.J(((q860) xaj0Var.c).f19068a));
        }
        this.f12711c.onNext(xaj0VarA);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m14151R0(MyTabTask myTabTask) {
        ((hy10) ((jq2) this).viewModel).m16022k(myTabTask);
        xaj0 xaj0VarA = (xaj0) this.f12711c.e();
        if (xaj0VarA == null) {
            Boolean boolValueOf = Boolean.valueOf(myTabTask == null);
            Boolean bool = Boolean.FALSE;
            xaj0VarA = xaj0.a(boolValueOf, bool, bool);
        } else {
            xaj0VarA.a = Boolean.valueOf(myTabTask == null);
        }
        this.f12711c.onNext(xaj0VarA);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m14152S0(Intent intent, int i, com.p1.mobile.android.app.c cVar) {
        String stringExtra;
        if (intent != null) {
            boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
            boolean z2 = i == SwipeDirection.UP.getValue();
            String stringExtra2 = intent.getStringExtra(CoreModule.l.a().Iq());
            if (z2) {
                String stringExtra3 = intent.getStringExtra(CoreModule.l.a().gl());
                stringExtra = intent.getStringExtra(CoreModule.l.a().L8());
                String stringExtra4 = intent.getStringExtra(CoreModule.l.a().Iq());
                if (TextUtils.isEmpty(stringExtra3) || TextUtils.isEmpty(stringExtra) || !stringExtra3.equals(stringExtra4)) {
                    stringExtra = null;
                }
            } else {
                stringExtra = null;
            }
            String str = stringExtra;
            if (!TextUtils.isEmpty(str)) {
                zvf0.r("e_iliked_letter", act().pageId());
            }
            User userPa = CoreModule.c.e0.Pa(stringExtra2);
            if (NullChecker.a(userPa)) {
                MyMeetFeedItem myMeetFeedItemNew_ = MyMeetFeedItem.new_();
                myMeetFeedItemNew_.type = FeedType.get("localLikersUser");
                m14149H0().mo18067d(new MeetFeedUserItemData(userPa, myMeetFeedItemNew_), z, z2, false, str);
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m14153a0() {
        super.a0();
        lifecycle().filter(new w9j() { // from class: l.wx10
            public final Object call(Object obj) {
                return Boolean.valueOf(((com.p1.mobile.android.app.c) obj) == com.p1.mobile.android.app.c.i);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.yx10
            public final void call(Object obj) {
                CoreModule.c.e0.A7();
            }
        }));
        duringCreated(CoreModule.c.B0.j4().distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.zx10
            public final void call(Object obj) {
                CoreModule.c.e0.A7();
            }
        }));
        duringCreated(this.f12711c.map(new w9j() { // from class: l.ay10
            public final Object call(Object obj) {
                xaj0 xaj0Var = (xaj0) obj;
                return Boolean.valueOf(((Boolean) xaj0Var.a).booleanValue() && ((Boolean) xaj0Var.b).booleanValue() && ((Boolean) xaj0Var.c).booleanValue());
            }
        }).distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.by10
            public final void call(Object obj) {
                this.f10353a.m14129Q0((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.c.e0.i7.map(new w9j() { // from class: l.cy10
            public final Object call(Object obj) {
                return ey10.m14146y0((List) obj);
            }
        }).distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.dy10
            public final void call(Object obj) {
                this.f12042a.m14151R0((MyTabTask) obj);
            }
        }));
        duringCreated(mkd0.s(CoreModule.c.C0.u3(SummarizedPrivilegesId.get("svip")).map(new w9j() { // from class: l.jx10
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.L3());
            }
        }).distinctUntilChanged().switchMap(new w9j() { // from class: l.kx10
            public final Object call(Object obj) {
                return this.f15873a.m14130U0(((Boolean) obj).booleanValue());
            }
        }), CoreModule.c.u0.u5(), CoreModule.c.m2.K3(), new y9j() { // from class: l.lx10
            /* JADX INFO: renamed from: a */
            public final Object m18071a(Object obj, Object obj2, Object obj3) {
                return xaj0.a((j760) obj, (Integer) obj2, (q860) obj3);
            }
        })).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.xx10
            public final void call(Object obj) {
                this.f22750a.m14150P0((xaj0) obj);
            }
        }));
    }

    @Override // p009l.hx10
    /* JADX INFO: renamed from: e0 */
    public Collection<? extends j760<String, d30>> mo14154e0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(vwb.Y("task verify 1", new d30() { // from class: l.qx10
            public final void call() {
                this.f19570a.m14124I0();
            }
        }));
        arrayList.add(vwb.Y("task verify 2", new d30() { // from class: l.rx10
            public final void call() {
                this.f20015a.m14125J0();
            }
        }));
        arrayList.add(vwb.Y("task boost", new d30() { // from class: l.sx10
            public final void call() {
                this.f20489a.m14126L0();
            }
        }));
        arrayList.add(vwb.Y("task mbti", new d30() { // from class: l.ux10
            public final void call() {
                this.f21358a.m14127N0();
            }
        }));
        arrayList.add(vwb.Y("task game", new d30() { // from class: l.vx10
            public final void call() {
                this.f21811a.m14128O0();
            }
        }));
        return arrayList;
    }

    @Override // p009l.hx10
    /* JADX INFO: renamed from: f0 */
    public void mo14155f0(int i, final int i2, final Intent intent) {
        if (i == CoreModule.P().a().re()) {
            if (i2 == SwipeDirection.RIGHT.getValue() || i2 == SwipeDirection.LEFT.getValue() || i2 == SwipeDirection.UP.getValue()) {
                lifecycle().takeFirst(new w9j() { // from class: l.ix10
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((com.p1.mobile.android.app.c) obj) == com.p1.mobile.android.app.c.i);
                    }
                }).subscribe(mkd0.G(new e30() { // from class: l.tx10
                    public final void call(Object obj) {
                        this.f20903a.m14152S0(intent, i2, (com.p1.mobile.android.app.c) obj);
                    }
                }));
            }
        }
    }

    @Override // p009l.hx10
    /* JADX INFO: renamed from: g0 */
    public void mo14156g0(boolean z) {
        if (z) {
            return;
        }
        m14123F0();
    }

    public void destroy() {
    }
}
