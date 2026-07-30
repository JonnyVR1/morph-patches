package p149l;

import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedLikersItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedNearbyItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedUserItemData;
import com.p046p1.mobile.putong.core.data.FeedType;
import com.p046p1.mobile.putong.core.data.MyMeetFeedItem;
import com.p046p1.mobile.putong.core.data.MyMeetSeeReminder;
import com.p046p1.mobile.putong.core.data.MyTabTask;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes11.dex */
public class ey10 extends hx10<hy10> {

    /* JADX INFO: renamed from: a */
    public Frag f93715a;

    /* JADX INFO: renamed from: b */
    public r2y f93716b;

    /* JADX INFO: renamed from: c */
    public final C22392a<xaj0<Boolean, Boolean, Boolean>> f93717c;

    public ey10(mcr mcrVar) {
        super(mcrVar);
        this.f93717c = C22392a.m221512b();
        this.f93715a = (Frag) mcrVar;
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ j760 m118710A0(q860 q860Var) {
        return NullChecker.m81303a(q860Var) ? j760.m140076a(Integer.valueOf(q860Var.m173344d()), q860Var.f153135a) : j760.m140076a(0, new ArrayList());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ Boolean m118713E0(String str, User user, User user2) {
        boolean z;
        if (TextUtils.equals(user2.f56011id, str)) {
            z = true;
        } else {
            z = false;
            if (NullChecker.m81303a(user) && !vwb.m200296J(user.pictures) && !vwb.m200296J(user2.pictures) && TextUtils.equals(user.picture(0).url, user2.picture(0).url)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: F0 */
    private void m118714F0() {
        if (CoreModule.m29935P().m94651a().mo33489e2()) {
            CoreLikers coreLikers = CoreModule.f17545c.f19687u0;
            coreLikers.m30439f7(25, coreLikers.f19254k0.get().longValue(), "");
        } else {
            CoreLikers coreLikers2 = CoreModule.f17545c.f19687u0;
            coreLikers2.m30419V6(null, coreLikers2.f19254k0.get().longValue(), 25, "");
        }
        if (CoreModule.m29935P().m94656g().mo35004D9() && yvv.m216242c()) {
            CoreModule.f17545c.f19665m2.m191463D3(null, 20, true);
        }
        CoreModule.f17545c.f19639e0.m169367A7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m118715I0() {
        ((hy10) this.viewModel).m133500q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public /* synthetic */ void m118716J0() {
        ((hy10) this.viewModel).m133502s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m118717L0() {
        ((hy10) this.viewModel).m133496m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public /* synthetic */ void m118718N0() {
        ((hy10) this.viewModel).m133499p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public /* synthetic */ void m118719O0() {
        ((hy10) this.viewModel).m133497n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public /* synthetic */ void m118720Q0(Boolean bool) {
        ((hy10) this.viewModel).m133495l(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public C22306c<j760<Integer, List<User>>> m118721U0(boolean z) {
        return z ? CoreModule.f17545c.f19687u0.m30395J6().map(new w9j() { // from class: l.nx10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ey10.m118710A0((q860) obj);
            }
        }) : CoreModule.f17545c.f19687u0.m30411R6();
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ MyTabTask m118737y0(List list) {
        return (MyTabTask) vwb.m200346r(list, new w9j() { // from class: l.mx10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((MyTabTask) obj).exposed);
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    public Frag m118739G0() {
        return this.f93715a;
    }

    /* JADX INFO: renamed from: H0 */
    public lwl m118740H0() {
        if (this.f93716b == null) {
            r2y r2yVar = new r2y(act());
            this.f93716b = r2yVar;
            r2yVar.m177629l(true);
        }
        return this.f93716b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [B, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r8v5, types: [C, java.lang.Boolean] */
    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m118741P0(xaj0 xaj0Var) {
        A a = xaj0Var.f191751a;
        List list = (List) ((j760) a).f116565b;
        int iIntValue = ((Integer) ((j760) a).f116564a).intValue();
        if (!vwb.m200296J(list) && CoreModule.m29935P().m94651a().mo33454Yp()) {
            MyMeetSeeReminder myMeetSeeReminderM34731w4 = CoreModule.f17545c.f19664m1.m34731w4();
            if (!NullChecker.m81303a(myMeetSeeReminderM34731w4) || vwb.m200296J(myMeetSeeReminderM34731w4.userIds)) {
                vwb.m200354z(list, new e30() { // from class: l.px10
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ((User) obj).localSeeReminderType = "";
                    }
                });
            } else {
                final String str = myMeetSeeReminderM34731w4.userIds.get(0);
                final User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str);
                User user = (User) vwb.m200350v(list, new w9j() { // from class: l.ox10
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ey10.m118713E0(str, userM169430Pa, (User) obj);
                    }
                }, 4);
                if (user != null) {
                    user.localSeeReminderType = myMeetSeeReminderM34731w4.reminderType.toString();
                } else if (NullChecker.m81303a(userM169430Pa)) {
                    userM169430Pa.localSeeReminderType = myMeetSeeReminderM34731w4.reminderType.toString();
                    list.add(0, userM169430Pa);
                }
            }
        }
        ((hy10) this.viewModel).m133492i(new MeetFeedLikersItemData(iIntValue, list, ((Integer) xaj0Var.f191752b).intValue()), m118740H0());
        if (CoreModule.m29935P().m94656g().mo35004D9()) {
            ((hy10) this.viewModel).m133493j(new MeetFeedNearbyItemData(((q860) xaj0Var.f191753c).f153135a));
        }
        xaj0<Boolean, Boolean, Boolean> xaj0VarM221515e = this.f93717c.m221515e();
        if (xaj0VarM221515e == null) {
            xaj0VarM221515e = xaj0.m207578a(Boolean.FALSE, Boolean.valueOf(iIntValue == 0), Boolean.valueOf(vwb.m200296J(((q860) xaj0Var.f191753c).f153135a)));
        } else {
            xaj0VarM221515e.f191752b = Boolean.valueOf(iIntValue == 0);
            xaj0VarM221515e.f191753c = Boolean.valueOf(vwb.m200296J(((q860) xaj0Var.f191753c).f153135a));
        }
        this.f93717c.m132487l(xaj0VarM221515e);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [A, java.lang.Boolean] */
    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m118742R0(MyTabTask myTabTask) {
        ((hy10) this.viewModel).m133494k(myTabTask);
        xaj0<Boolean, Boolean, Boolean> xaj0VarM221515e = this.f93717c.m221515e();
        if (xaj0VarM221515e == null) {
            Boolean boolValueOf = Boolean.valueOf(myTabTask == null);
            Boolean bool = Boolean.FALSE;
            xaj0VarM221515e = xaj0.m207578a(boolValueOf, bool, bool);
        } else {
            xaj0VarM221515e.f191751a = Boolean.valueOf(myTabTask == null);
        }
        this.f93717c.m132487l(xaj0VarM221515e);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m118743S0(Intent intent, int i, C4319c c4319c) {
        String stringExtra;
        if (intent != null) {
            boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
            boolean z2 = i == SwipeDirection.UP.getValue();
            String stringExtra2 = intent.getStringExtra(CoreModule.f17554l.m94651a().mo33343Iq());
            if (z2) {
                String stringExtra3 = intent.getStringExtra(CoreModule.f17554l.m94651a().mo33506gl());
                stringExtra = intent.getStringExtra(CoreModule.f17554l.m94651a().mo33357L8());
                String stringExtra4 = intent.getStringExtra(CoreModule.f17554l.m94651a().mo33343Iq());
                if (TextUtils.isEmpty(stringExtra3) || TextUtils.isEmpty(stringExtra) || !stringExtra3.equals(stringExtra4)) {
                    stringExtra = null;
                }
            } else {
                stringExtra = null;
            }
            String str = stringExtra;
            if (!TextUtils.isEmpty(str)) {
                zvf0.m220396r("e_iliked_letter", act().pageId());
            }
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(stringExtra2);
            if (NullChecker.m81303a(userM169430Pa)) {
                MyMeetFeedItem myMeetFeedItemNew_ = MyMeetFeedItem.new_();
                myMeetFeedItemNew_.type = FeedType.get(FeedType.localLikersUser);
                m118740H0().mo151978d(new MeetFeedUserItemData(userM169430Pa, myMeetFeedItemNew_), z, z2, false, str);
            }
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        lifecycle().filter(new w9j() { // from class: l.wx10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.yx10
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19639e0.m169367A7();
            }
        }));
        duringCreated(CoreModule.f17545c.f19552B0.m31611j4().distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.zx10
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19639e0.m169367A7();
            }
        }));
        duringCreated(this.f93717c.map(new w9j() { // from class: l.ay10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                xaj0 xaj0Var = (xaj0) obj;
                return Boolean.valueOf(((Boolean) xaj0Var.f191751a).booleanValue() && ((Boolean) xaj0Var.f191752b).booleanValue() && ((Boolean) xaj0Var.f191753c).booleanValue());
            }
        }).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.by10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77849a.m118720Q0((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19639e0.f149396i7.map(new w9j() { // from class: l.cy10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ey10.m118737y0((List) obj);
            }
        }).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.dy10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88341a.m118742R0((MyTabTask) obj);
            }
        }));
        duringCreated(mkd0.m154985s(CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip")).map(new w9j() { // from class: l.jx10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.m210047L3());
            }
        }).distinctUntilChanged().switchMap(new w9j() { // from class: l.kx10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f125046a.m118721U0(((Boolean) obj).booleanValue());
            }
        }), CoreModule.f17545c.f19687u0.m30480u5(), CoreModule.f17545c.f19665m2.m191470K3(), new y9j() { // from class: l.lx10
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return xaj0.m207578a((j760) obj, (Integer) obj2, (q860) obj3);
            }
        })).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.xx10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194805a.m118741P0((xaj0) obj);
            }
        }));
    }

    @Override // p149l.hx10
    /* JADX INFO: renamed from: e0 */
    public Collection<? extends j760<String, d30>> mo118744e0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(vwb.m200311Y("task verify 1", new d30() { // from class: l.qx10
            @Override // p149l.d30
            public final void call() {
                this.f156801a.m118715I0();
            }
        }));
        arrayList.add(vwb.m200311Y("task verify 2", new d30() { // from class: l.rx10
            @Override // p149l.d30
            public final void call() {
                this.f161390a.m118716J0();
            }
        }));
        arrayList.add(vwb.m200311Y("task boost", new d30() { // from class: l.sx10
            @Override // p149l.d30
            public final void call() {
                this.f166775a.m118717L0();
            }
        }));
        arrayList.add(vwb.m200311Y("task mbti", new d30() { // from class: l.ux10
            @Override // p149l.d30
            public final void call() {
                this.f178696a.m118718N0();
            }
        }));
        arrayList.add(vwb.m200311Y("task game", new d30() { // from class: l.vx10
            @Override // p149l.d30
            public final void call() {
                this.f183412a.m118719O0();
            }
        }));
        return arrayList;
    }

    @Override // p149l.hx10
    /* JADX INFO: renamed from: f0 */
    public void mo118745f0(int i, final int i2, final Intent intent) {
        if (i == CoreModule.m29935P().m94651a().mo33577re()) {
            if (i2 == SwipeDirection.RIGHT.getValue() || i2 == SwipeDirection.LEFT.getValue() || i2 == SwipeDirection.UP.getValue()) {
                lifecycle().takeFirst(new w9j() { // from class: l.ix10
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
                    }
                }).subscribe(mkd0.m154955G(new e30() { // from class: l.tx10
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f172468a.m118743S0(intent, i2, (C4319c) obj);
                    }
                }));
            }
        }
    }

    @Override // p149l.hx10
    /* JADX INFO: renamed from: g0 */
    public void mo118746g0(boolean z) {
        if (z) {
            return;
        }
        m118714F0();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
