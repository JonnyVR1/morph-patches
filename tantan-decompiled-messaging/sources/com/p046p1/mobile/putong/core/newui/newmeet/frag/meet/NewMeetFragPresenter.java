package com.p046p1.mobile.putong.core.newui.newmeet.frag.meet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4753s;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.businessdata.meet.AbsMeetListData;
import com.p046p1.mobile.putong.core.businessdata.meet.AbsMeetUserItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedLikersItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedNearbyItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedNoSvipItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedUserItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetGuideToSwipeCardItemData;
import com.p046p1.mobile.putong.core.data.FeedType;
import com.p046p1.mobile.putong.core.data.MyMeetFeedItem;
import com.p046p1.mobile.putong.core.data.MyMeetSeeReminder;
import com.p046p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.newmeet.frag.meet.NewMeetFragPresenter;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import p133rx.C22306c;
import p147v.VListCell;
import p149l.azc0;
import p149l.c40;
import p149l.caj;
import p149l.d30;
import p149l.e30;
import p149l.f5y;
import p149l.i1y;
import p149l.j760;
import p149l.jq2;
import p149l.lwl;
import p149l.mkd0;
import p149l.q860;
import p149l.sja;
import p149l.u76;
import p149l.vwb;
import p149l.w9j;
import p149l.xaj0;
import p149l.xma;
import p149l.yvv;
import p149l.z0c0;
import p149l.zi30;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class NewMeetFragPresenter extends jq2<zi30> {

    /* JADX INFO: renamed from: a */
    public boolean f26315a;

    /* JADX INFO: renamed from: b */
    public boolean f26316b;

    /* JADX INFO: renamed from: c */
    public int f26317c;

    /* JADX INFO: renamed from: d */
    public int f26318d;

    /* JADX INFO: renamed from: e */
    public final ArrayList<String> f26319e;

    /* JADX INFO: renamed from: f */
    public final NewMeetFrag f26320f;

    /* JADX INFO: renamed from: g */
    public lwl f26321g;

    /* JADX INFO: renamed from: h */
    public i1y f26322h;

    /* JADX INFO: renamed from: i */
    public String f26323i;

    /* JADX INFO: renamed from: j */
    public c40 f26324j;

    public NewMeetFragPresenter(NewMeetFrag newMeetFrag) {
        super(newMeetFrag);
        this.f26316b = true;
        this.f26317c = 0;
        this.f26318d = 2;
        this.f26319e = new ArrayList<>();
        this.f26322h = new i1y();
        this.f26320f = newMeetFrag;
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ Boolean m42971C0(String str, AbsMeetListData absMeetListData) {
        return absMeetListData instanceof AbsMeetUserItemData ? Boolean.valueOf(((AbsMeetUserItemData) absMeetListData).user.f56011id.equals(str)) : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m42972D0(Boolean bool) {
        if (bool.booleanValue()) {
            CoreLikers coreLikers = CoreModule.f17545c.f19687u0;
            coreLikers.m30419V6(null, coreLikers.f19254k0.get().longValue(), 25, "");
        } else {
            CoreLikers coreLikers2 = CoreModule.f17545c.f19687u0;
            coreLikers2.m30439f7(25, coreLikers2.f19254k0.get().longValue(), "");
        }
    }

    /* JADX INFO: renamed from: R0 */
    private void m42979R0() {
        if (CoreModule.m29935P().m94651a().mo33587sf()) {
            C4753s c4753s = CoreModule.f17545c.f19664m1;
            c4753s.m34733y4(null, false, c4753s.m34730v4() == 0, true);
        } else {
            CoreModule.f17545c.f19664m1.m34732x4(null, true, false);
        }
        CoreModule.f17545c.f19664m1.m34709Z4();
        CoreModule.f17545c.f19678r0.m34092J6();
        CoreModule.f17545c.f19570H0.m210361k5();
        if (CoreModule.m29935P().m94656g().mo35055dh() && xma.m210047L3()) {
            CoreModule.f17545c.f19664m1.m34734y5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public /* synthetic */ void m42980S0(Bundle bundle) {
        ((zi30) this.viewModel).m218954r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public /* synthetic */ void m42981W0(C4319c c4319c) {
        if (c4319c != C4319c.f15549j || vwb.m200296J(this.f26319e)) {
            return;
        }
        CoreModule.f17545c.f19664m1.m34703O5(this.f26319e);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ C22306c m42987j0(PaymentResultWrapper paymentResultWrapper) {
        return paymentResultWrapper.fromSign ? C22306c.just(paymentResultWrapper) : CoreModule.f17545c.f19555C0.m210114x3().distinctUntilChanged().skip(1).take(1).map(new w9j() { // from class: l.ji30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return NewMeetFragPresenter.m42990m0((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ j760 m42989l0(q860 q860Var) {
        return NullChecker.m81303a(q860Var) ? j760.m140076a(Integer.valueOf(q860Var.m173344d()), q860Var.f153135a) : j760.m140076a(0, new ArrayList());
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ List m42990m0(List list) {
        return list;
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m42991n0() {
        f5y.m119543f().m119553o(false);
        long jLongValue = CoreModule.f17545c.f19687u0.f19254k0.get().longValue();
        long jM34729u4 = CoreModule.f17545c.f19664m1.m34729u4();
        CoreModule.f17545c.f19664m1.m34720m5(jLongValue, CoreModule.f17545c.f19664m1.m34723p4(), jM34729u4);
        CoreModule.f17545c.f19664m1.m34719m4();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ Boolean m42993p0(String str, User user, User user2) {
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

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ Boolean m43001z0(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_PICKS_MEMBERSHIP || purchaseType == PurchaseType.TYPE_SVIP_PICKS_MEMBERSHIP);
    }

    /* JADX INFO: renamed from: L0 */
    public void m43002L0(String str) {
        if (this.f26319e.contains(str)) {
            return;
        }
        this.f26319e.add(str);
    }

    /* JADX INFO: renamed from: N0 */
    public Unit m43003N0(boolean z, String str) {
        if (z) {
            zvf0.m220396r("e_meet_unlock", "p_meet");
        }
        CoreModule.m29935P().m94651a().mo33565pr(act(), str, Privilege.see_who_likes_me);
        return null;
    }

    /* JADX INFO: renamed from: O0 */
    public Frag m43004O0() {
        return this.f26320f;
    }

    /* JADX INFO: renamed from: P0 */
    public lwl m43005P0() {
        if (this.f26321g == null) {
            this.f26321g = CoreModule.m29935P().m94651a().mo33546me(act());
        }
        return this.f26321g;
    }

    /* JADX INFO: renamed from: Q0 */
    public boolean m43006Q0(AbsMeetUserItemData absMeetUserItemData, boolean z, boolean z2, boolean z3, String str) {
        return this.f26321g.mo151978d(absMeetUserItemData, z, z2, z3, str);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m43007U0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            CoreModule.f17545c.f19664m1.m34721n4();
            CoreModule.f17545c.f19678r0.m34092J6();
            if (!this.f26316b) {
                CoreModule.f17545c.f19664m1.m34709Z4();
            }
            if (this.f26316b) {
                m43022l1();
            }
            this.f26316b = false;
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m43008V0(Object obj) {
        m42979R0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ xaj0 m43009X0(xaj0 xaj0Var) {
        if (!((Boolean) ((xaj0) xaj0Var.f191751a).f191752b).booleanValue() && !vwb.m200296J(((q860) ((xaj0) xaj0Var.f191751a).f191751a).f153135a) && this.f26317c >= 0) {
            int size = ((q860) ((xaj0) xaj0Var.f191751a).f191751a).f153135a.size();
            int i = this.f26317c;
            int i2 = this.f26318d;
            if (size > i + i2) {
                q860 q860Var = new q860(((q860) ((xaj0) xaj0Var.f191751a).f191751a).f153135a.subList(0, i + i2), ((q860) ((xaj0) xaj0Var.f191751a).f191751a).f153136b);
                A a = xaj0Var.f191751a;
                return xaj0.m207578a(xaj0.m207578a(q860Var, (Boolean) ((xaj0) a).f191752b, (List) ((xaj0) a).f191753c), (j760) xaj0Var.f191752b, (q860) xaj0Var.f191753c);
            }
        }
        return xaj0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m43010Y0(xaj0 xaj0Var) {
        int i = 1;
        this.f26315a = (((Boolean) ((xaj0) xaj0Var.f191751a).f191752b).booleanValue() || ((q860) ((xaj0) xaj0Var.f191751a).f191751a).f153135a.size() < this.f26317c) && ((q860) ((xaj0) xaj0Var.f191751a).f191751a).m173343c();
        ((zi30) this.viewModel).m218948i();
        if (((q860) ((xaj0) xaj0Var.f191751a).f191751a).f153135a.isEmpty()) {
            ((zi30) this.viewModel).m218955s();
            return;
        }
        ArrayList arrayList = new ArrayList();
        boolean zBooleanValue = ((Boolean) ((xaj0) xaj0Var.f191751a).f191752b).booleanValue();
        A a = xaj0Var.f191751a;
        if (zBooleanValue) {
            boolean z = false;
            int i2 = 0;
            for (T t : ((q860) ((xaj0) a).f191751a).f153135a) {
                if (t.item.readStatus == 0) {
                    i2++;
                } else if (!z && i2 > 10 && CoreModule.f17545c.f19664m1.m34713g4()) {
                    arrayList.add(new MeetGuideToSwipeCardItemData());
                    z = true;
                }
                arrayList.add(t);
            }
        } else {
            List<T> list = ((q860) ((xaj0) a).f191751a).f153135a;
            int size = list.size();
            int iMin = Math.min(size - Math.min(this.f26318d, size), this.f26317c);
            arrayList.addAll(list.subList(0, iMin));
            arrayList.add(new MeetFeedNoSvipItemData(new ArrayList(list.subList(iMin, size))));
        }
        List list2 = (List) ((j760) ((j760) xaj0Var.f191752b).f116564a).f116565b;
        if (vwb.m200296J(list2)) {
            i = 0;
        } else {
            int iIntValue = ((Integer) ((j760) ((j760) xaj0Var.f191752b).f116564a).f116564a).intValue();
            if (CoreModule.m29935P().m94651a().mo33454Yp()) {
                MyMeetSeeReminder myMeetSeeReminderM34731w4 = CoreModule.f17545c.f19664m1.m34731w4();
                if (!NullChecker.m81303a(myMeetSeeReminderM34731w4) || vwb.m200296J(myMeetSeeReminderM34731w4.userIds)) {
                    vwb.m200354z(list2, new e30() { // from class: l.hi30
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            ((User) obj).localSeeReminderType = "";
                        }
                    });
                } else {
                    final String str = myMeetSeeReminderM34731w4.userIds.get(0);
                    final User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str);
                    User user = (User) vwb.m200350v(list2, new w9j() { // from class: l.fi30
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return NewMeetFragPresenter.m42993p0(str, userM169430Pa, (User) obj);
                        }
                    }, 4);
                    if (user != null) {
                        user.localSeeReminderType = myMeetSeeReminderM34731w4.reminderType.toString();
                    } else if (NullChecker.m81303a(userM169430Pa)) {
                        userM169430Pa.localSeeReminderType = myMeetSeeReminderM34731w4.reminderType.toString();
                        list2.add(0, userM169430Pa);
                    }
                }
            }
            arrayList.add(0, new MeetFeedLikersItemData(iIntValue, list2, ((Integer) ((j760) xaj0Var.f191752b).f116565b).intValue()));
        }
        if (CoreModule.m29935P().m94656g().mo35004D9()) {
            arrayList.add(i, new MeetFeedNearbyItemData(((q860) xaj0Var.f191753c).f153135a));
        }
        ((zi30) this.viewModel).m218956u(Boolean.valueOf(this.f26315a));
        if (CoreModule.m29935P().m94656g().mo35055dh() && xma.m210047L3() && NullChecker.m81303a(this.f26322h.getSvipWeeklyItemData()) && !vwb.m200296J(this.f26322h.getSvipWeeklyItemData().svipWeeklyItems)) {
            arrayList.add(0, this.f26322h.getSvipWeeklyItemData());
        }
        ((zi30) this.viewModel).m218953q(arrayList, (List) ((xaj0) xaj0Var.f191751a).f191753c);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f26323i = act().getIntent().getStringExtra("from");
        this.f26317c = f5y.m119544g();
        this.f26318d = f5y.m119545h();
        f5y.m119543f().m119554p(true);
        if (this.f26321g == null) {
            this.f26321g = CoreModule.m29935P().m94651a().mo33546me(act());
        }
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
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.qi30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154666a.m42980S0((Bundle) obj);
            }
        }, new d30() { // from class: l.xh30
            @Override // p149l.d30
            public final void call() {
                NewMeetFragPresenter.m42991n0();
            }
        });
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.yh30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198269a.m42981W0((C4319c) obj);
            }
        }));
        duringCreated(C22306c.combineLatest(CoreModule.f17545c.f19664m1.m34694K4(), CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip")).map(new w9j() { // from class: l.zh30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.m210047L3());
            }
        }), CoreModule.f17545c.f19664m1.m34726s4().filter(new u76()), CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip")).map(new w9j() { // from class: l.ai30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.m210047L3());
            }
        }).distinctUntilChanged().switchMap(new w9j() { // from class: l.bi30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f75694a.m43017g1(((Boolean) obj).booleanValue());
            }
        }), CoreModule.f17545c.f19687u0.m30480u5(), CoreModule.f17545c.f19665m2.m191470K3(), this.f26322h.m134018e(), new caj() { // from class: l.ci30
            @Override // p149l.caj
            /* JADX INFO: renamed from: a */
            public final Object mo105926a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                q860 q860Var = (q860) obj;
                Boolean bool = (Boolean) obj2;
                List list = (List) obj3;
                j760 j760Var = (j760) obj4;
                Integer num = (Integer) obj5;
                q860 q860Var2 = (q860) obj6;
                return xaj0.m207578a(xaj0.m207578a(q860Var, bool, list), j760.m140076a(j760Var, num), q860Var2);
            }
        })).distinctUntilChanged().map(new w9j() { // from class: l.di30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f86353a.m43009X0((xaj0) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.ei30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f91544a.m43010Y0((xaj0) obj);
            }
        }));
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.ri30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159518a.m43007U0((C4319c) obj);
            }
        }));
        duringCreated(CoreModule.m29935P().m94656g().mo35022On()).filter(new w9j() { // from class: l.si30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return NewMeetFragPresenter.m43001z0((PaymentResultWrapper) obj);
            }
        }).switchMap(new w9j() { // from class: l.ti30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return NewMeetFragPresenter.m42987j0((PaymentResultWrapper) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.ui30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176620a.m43008V0(obj);
            }
        }));
        duringCreated((C22306c) CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip")).map(new w9j() { // from class: l.vi30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.m210047L3());
            }
        })).distinctUntilChanged().skip(1).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.wh30
            @Override // p149l.e30
            public final void call(Object obj) {
                NewMeetFragPresenter.m42972D0((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m43011a1(AbsMeetUserItemData absMeetUserItemData, String str) {
        this.f26321g.mo151978d(absMeetUserItemData, true, true, false, str);
    }

    @Override // p149l.jq2
    @Nullable
    public Act act() {
        return super.act();
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m43012b1(View view) {
        this.f26324j.m105113b();
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m43013c1(final AbsMeetUserItemData absMeetUserItemData, final User user, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        Handler handler = null;
        if (i != 0) {
            zvf0.m220399u("e_meet_card_more_report", "p_meet", vwb.m200311Y("other_user_id", absMeetUserItemData.user.f56011id));
            act().startActivity(CoreModule.m29935P().m94651a().mo33384O9(act(), absMeetUserItemData.user.f56011id, false, new ResultReceiver(handler) { // from class: com.p1.mobile.putong.core.newui.newmeet.frag.meet.NewMeetFragPresenter.1
                @Override // android.os.ResultReceiver
                public void onReceiveResult(int i2, Bundle bundle) {
                    if (i2 == -1) {
                        NewMeetFragPresenter.this.f26321g.mo151976b(absMeetUserItemData, false, false, null);
                        CoreModule.m29934N().following(CoreModule.m29931H().userId(), user, false, null, null);
                        NewMeetFragPresenter.this.f26324j.m105113b();
                    }
                }
            }));
        } else {
            zvf0.m220399u("e_meet_card_more_dislike", "p_meet", vwb.m200311Y("other_user_id", absMeetUserItemData.user.f56011id));
            this.f26321g.mo151976b(absMeetUserItemData, false, false, null);
            CoreModule.m29934N().following(CoreModule.m29931H().userId(), user, false, null, null);
            this.f26324j.m105113b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0091  */
    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m43014d1(Intent intent, int i, C4319c c4319c) {
        String stringExtra;
        if (intent != null) {
            boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
            boolean z2 = i == SwipeDirection.UP.getValue();
            final String stringExtra2 = intent.getStringExtra(CoreModule.m29935P().m94651a().mo33343Iq());
            AbsMeetUserItemData absMeetUserItemData = (AbsMeetUserItemData) vwb.m200346r(CoreModule.f17545c.f19664m1.m34696L4().f153135a, new w9j() { // from class: l.ki30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return NewMeetFragPresenter.m42971C0(stringExtra2, (AbsMeetListData) obj);
                }
            });
            if (absMeetUserItemData != null) {
                if (z2) {
                    String stringExtra3 = intent.getStringExtra(CoreModule.m29935P().m94651a().mo33506gl());
                    stringExtra = intent.getStringExtra(CoreModule.m29935P().m94651a().mo33357L8());
                    String stringExtra4 = intent.getStringExtra(CoreModule.m29935P().m94651a().mo33343Iq());
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
                this.f26321g.mo151978d(absMeetUserItemData, z, z2, false, str);
            }
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m43015e1(Intent intent, int i, C4319c c4319c) {
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
                m43006Q0(new MeetFeedUserItemData(userM169430Pa, myMeetFeedItemNew_), z, z2, false, str);
            }
        }
    }

    /* JADX INFO: renamed from: f1 */
    public void m43016f1(final AbsMeetUserItemData absMeetUserItemData, boolean z, boolean z2, boolean z3) {
        if (!z3) {
            this.f26321g.mo151978d(absMeetUserItemData, z, z2, false, null);
            return;
        }
        e30<String> e30Var = new e30() { // from class: l.ni30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139055a.m43011a1(absMeetUserItemData, (String) obj);
            }
        };
        if (TEnum.equals(absMeetUserItemData.item.relation.status, "superliked")) {
            if (xma.m210071e4() && !xma.m210041D3()) {
                CoreModule.m29935P().m94651a().mo33572qm(act(), "p_meet_view,e_meet_feed_button,click", Privilege.letter, null);
                return;
            }
            if (xma.m210041D3()) {
                CoreModule.m29935P().m94651a().mo33371Mp(act(), absMeetUserItemData.user, e30Var, true);
            } else if (CoreModule.m29935P().m94656g().mo35029S9()) {
                CoreModule.m29935P().m94651a().mo33371Mp(act(), absMeetUserItemData.user, e30Var, true);
            } else {
                CoreModule.m29935P().m94656g().mo35071ot(act(), "p_navigation_ilike,card_button_pull");
            }
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final C22306c<j760<Integer, List<User>>> m43017g1(boolean z) {
        return z ? CoreModule.f17545c.f19687u0.m30395J6().map(new w9j() { // from class: l.ii30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return NewMeetFragPresenter.m42989l0((q860) obj);
            }
        }) : CoreModule.f17545c.f19687u0.m30411R6();
    }

    public String getFrom() {
        return this.f26323i;
    }

    /* JADX INFO: renamed from: h1 */
    public void m43018h1(final AbsMeetUserItemData absMeetUserItemData, boolean z) {
        zvf0.m220399u("e_meet_card_more", "p_meet", vwb.m200311Y("other_user_id", absMeetUserItemData.user.f56011id));
        final User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(absMeetUserItemData.user.f56011id);
        if (NullChecker.m81303a(userM169430Pa)) {
            if (NullChecker.m81303a(this.f26324j)) {
                this.f26324j.m105113b();
            }
            ArrayList arrayList = new ArrayList();
            if (z) {
                arrayList.add("不再喜欢/关注");
            } else {
                arrayList.add("不喜欢");
            }
            arrayList.add("举报");
            this.f26324j = new c40.C16057b(m142773Y()).m105156I("取消").m105168U(new View.OnClickListener() { // from class: l.li30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f128164a.m43012b1(view);
                }
            }).m105164Q(arrayList).m105154G(true).m105169V(new c40.InterfaceC16059d() { // from class: l.mi30
                @Override // p149l.c40.InterfaceC16059d
                /* JADX INFO: renamed from: a */
                public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                    this.f133935a.m43013c1(absMeetUserItemData, userM169430Pa, vListCell, c22545a, i);
                }
            }).m105165R(new int[]{0, 1}, new int[]{z0c0.f200978f, z0c0.f200979g}).m105153F();
        }
        this.f26324j.m105117f();
    }

    /* JADX INFO: renamed from: i1 */
    public void m43019i1(AbsMeetUserItemData absMeetUserItemData, String str, Object obj) {
        m43020j1(absMeetUserItemData.user, str, obj, absMeetUserItemData.isPicksUser());
    }

    /* JADX INFO: renamed from: j1 */
    public final void m43020j1(User user, String str, Object obj, boolean z) {
        String str2 = z ? "p_meet_view,e_picks_feed_card,like_swipe" : "p_meet_view,e_whoiliked_card,sayhi_superlike";
        if (z) {
            if (!CoreModule.f17545c.f19639e0.m169527p9().isFemale() || azc0.m99651d().m99653c()) {
                if (!azc0.m99651d().m99654e() && !xma.m210044G3() && sja.m184461r3() <= 0) {
                    CoreModule.m29935P().m94651a().mo33366Mc(act(), str2);
                    return;
                }
            } else if (!xma.m210047L3()) {
                CoreModule.m29935P().m94651a().mo33401Rm(act(), str2);
                return;
            } else if (!xma.m210044G3() && sja.m184461r3() <= 0) {
                CoreModule.m29935P().m94651a().mo33366Mc(act(), str2);
                return;
            }
        } else if (xma.m210071e4()) {
            if (CoreModule.f17545c.f19639e0.m169527p9().isFemale() && !azc0.m99651d().m99653c()) {
                CoreModule.m29935P().m94651a().mo33565pr(act(), str2, Privilege.liked_user);
                return;
            } else if (!CoreModule.f17545c.f19639e0.m169527p9().isFemale() && !azc0.m99651d().m99654e()) {
                CoreModule.m29935P().m94651a().mo33565pr(act(), str2, Privilege.liked_user);
                return;
            }
        }
        if (CoreModule.m29934N().mo60267Co() && NullChecker.m81303a(act())) {
            CoreModule.m29935P().m94651a().mo33456Za(act(), user.f56011id, obj, str, z);
        }
    }

    /* JADX INFO: renamed from: k1 */
    public boolean m43021k1(int i, final int i2, final Intent intent) {
        if (i == 16) {
            if (i2 != SwipeDirection.RIGHT.getValue() && i2 != SwipeDirection.LEFT.getValue() && i2 != SwipeDirection.UP.getValue()) {
                return false;
            }
            lifecycle().takeFirst(new w9j() { // from class: l.vh30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.gi30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f102837a.m43014d1(intent, i2, (C4319c) obj);
                }
            }));
            return true;
        }
        if (i == 18) {
            if (NullChecker.m81303a(intent) && intent.getIntExtra("see_count", 1) == 0) {
                f5y.m119548n();
            }
            return true;
        }
        if (i != CoreModule.m29935P().m94651a().mo33577re()) {
            return false;
        }
        if (i2 != SwipeDirection.RIGHT.getValue() && i2 != SwipeDirection.LEFT.getValue() && i2 != SwipeDirection.UP.getValue()) {
            return false;
        }
        lifecycle().takeFirst(new w9j() { // from class: l.oi30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.pi30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f149076a.m43015e1(intent, i2, (C4319c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: l1 */
    public void m43022l1() {
        m42979R0();
        if (TextUtils.isEmpty(this.f26323i) || !this.f26323i.equals("from_notes")) {
            return;
        }
        CoreModule.m29935P().m94651a().mo33328Gq(act());
    }

    /* JADX INFO: renamed from: m1 */
    public void m43023m1() {
        if (CoreModule.m29935P().m94651a().mo33587sf()) {
            CoreModule.f17545c.f19664m1.m34733y4(null, true, false, true);
        } else {
            CoreModule.f17545c.f19664m1.m34732x4(null, true, false);
        }
        CoreModule.f17545c.f19664m1.m34709Z4();
        if (CoreModule.m29935P().m94656g().mo35055dh() && xma.m210047L3()) {
            CoreModule.f17545c.f19664m1.m34734y5();
        }
    }

    /* JADX INFO: renamed from: n1 */
    public void m43024n1(String str, String str2) {
        CoreModule.f17545c.f19664m1.m34706R4(str);
        CoreModule.m29936Q().startAudienceLive(act(), str2, "meet", null);
    }

    /* JADX INFO: renamed from: o1 */
    public void m43025o1(String str, String str2) {
        CoreModule.f17545c.f19664m1.m34706R4(str);
        CoreModule.m29936Q().mo67229M6().mo102431p(act(), str2, "meet", str, null);
    }

    /* JADX INFO: renamed from: p1 */
    public void m43026p1() {
        if (this.f26315a) {
            if (CoreModule.m29935P().m94651a().mo33587sf()) {
                CoreModule.f17545c.f19664m1.m34711e4(true);
            } else {
                CoreModule.f17545c.f19664m1.m34710d4();
            }
        }
    }
}
