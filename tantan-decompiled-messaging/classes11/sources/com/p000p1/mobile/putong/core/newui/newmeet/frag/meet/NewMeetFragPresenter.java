package com.p000p1.mobile.putong.core.newui.newmeet.frag.meet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.newmeet.frag.meet.NewMeetFragPresenter;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.core.api.s;
import com.p1.mobile.putong.core.businessdata.meet.AbsMeetListData;
import com.p1.mobile.putong.core.businessdata.meet.AbsMeetUserItemData;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedLikersItemData;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedNearbyItemData;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedNoSvipItemData;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedUserItemData;
import com.p1.mobile.putong.core.businessdata.meet.MeetGuideToSwipeCardItemData;
import com.p1.mobile.putong.core.data.FeedType;
import com.p1.mobile.putong.core.data.MyMeetFeedItem;
import com.p1.mobile.putong.core.data.MyMeetSeeReminder;
import com.p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Links;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import l.azc0;
import l.c40;
import l.caj;
import l.d30;
import l.e30;
import l.j760;
import l.jq2;
import l.mkd0;
import l.sja;
import l.vwb;
import l.w9j;
import l.xaj0;
import l.xma;
import l.yvv;
import l.z0c0;
import l.zvf0;
import p009l.f5y;
import p009l.i1y;
import p009l.lwl;
import p009l.q860;
import p009l.u76;
import p009l.zi30;
import v.VListCell;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class NewMeetFragPresenter extends jq2<zi30> {

    /* JADX INFO: renamed from: a */
    public boolean f5093a;

    /* JADX INFO: renamed from: b */
    public boolean f5094b;

    /* JADX INFO: renamed from: c */
    public int f5095c;

    /* JADX INFO: renamed from: d */
    public int f5096d;

    /* JADX INFO: renamed from: e */
    public final ArrayList<String> f5097e;

    /* JADX INFO: renamed from: f */
    public final NewMeetFrag f5098f;

    /* JADX INFO: renamed from: g */
    public lwl f5099g;

    /* JADX INFO: renamed from: h */
    public i1y f5100h;

    /* JADX INFO: renamed from: i */
    public String f5101i;

    /* JADX INFO: renamed from: j */
    public c40 f5102j;

    public NewMeetFragPresenter(NewMeetFrag newMeetFrag) {
        super(newMeetFrag);
        this.f5094b = true;
        this.f5095c = 0;
        this.f5096d = 2;
        this.f5097e = new ArrayList<>();
        this.f5100h = new i1y();
        this.f5098f = newMeetFrag;
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ Boolean m7169C0(String str, AbsMeetListData absMeetListData) {
        return absMeetListData instanceof AbsMeetUserItemData ? Boolean.valueOf(((DbObject) ((AbsMeetUserItemData) absMeetListData).user).id.equals(str)) : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m7170D0(Boolean bool) {
        if (bool.booleanValue()) {
            CoreLikers coreLikers = CoreModule.c.u0;
            coreLikers.V6((Links) null, ((Long) coreLikers.k0.get()).longValue(), 25, "");
        } else {
            CoreLikers coreLikers2 = CoreModule.c.u0;
            coreLikers2.f7(25, ((Long) coreLikers2.k0.get()).longValue(), "");
        }
    }

    /* JADX INFO: renamed from: R0 */
    private void m7177R0() {
        if (CoreModule.P().a().sf()) {
            s sVar = CoreModule.c.m1;
            sVar.y4((DbLinks) null, false, sVar.v4() == 0, true);
        } else {
            CoreModule.c.m1.x4((DbLinks) null, true, false);
        }
        CoreModule.c.m1.Z4();
        CoreModule.c.r0.J6();
        CoreModule.c.H0.k5();
        if (CoreModule.P().g().dh() && xma.L3()) {
            CoreModule.c.m1.y5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public /* synthetic */ void m7178S0(Bundle bundle) {
        ((zi30) ((jq2) this).viewModel).m25820r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public /* synthetic */ void m7179W0(c cVar) {
        if (cVar != c.j || vwb.J(this.f5097e)) {
            return;
        }
        CoreModule.c.m1.O5(this.f5097e);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ rx.c m7185j0(PaymentResultWrapper paymentResultWrapper) {
        return paymentResultWrapper.fromSign ? rx.c.just(paymentResultWrapper) : CoreModule.c.C0.x3().distinctUntilChanged().skip(1).take(1).map(new w9j() { // from class: l.ji30
            public final Object call(Object obj) {
                return NewMeetFragPresenter.m7188m0((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ j760 m7187l0(q860 q860Var) {
        return NullChecker.a(q860Var) ? j760.a(Integer.valueOf(q860Var.m20835d()), q860Var.f19068a) : j760.a(0, new ArrayList());
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ List m7188m0(List list) {
        return list;
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m7189n0() {
        f5y.m14274f().m14284o(false);
        long jLongValue = ((Long) CoreModule.c.u0.k0.get()).longValue();
        long jU4 = CoreModule.c.m1.u4();
        CoreModule.c.m1.m5(jLongValue, CoreModule.c.m1.p4(), jU4);
        CoreModule.c.m1.m4();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ Boolean m7191p0(String str, User user, User user2) {
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

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ Boolean m7199z0(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_PICKS_MEMBERSHIP || purchaseType == PurchaseType.TYPE_SVIP_PICKS_MEMBERSHIP);
    }

    /* JADX INFO: renamed from: L0 */
    public void m7200L0(String str) {
        if (this.f5097e.contains(str)) {
            return;
        }
        this.f5097e.add(str);
    }

    /* JADX INFO: renamed from: N0 */
    public Unit m7201N0(boolean z, String str) {
        if (z) {
            zvf0.r("e_meet_unlock", "p_meet");
        }
        CoreModule.P().a().pr(act(), str, Privilege.see_who_likes_me);
        return null;
    }

    /* JADX INFO: renamed from: O0 */
    public Frag m7202O0() {
        return this.f5098f;
    }

    /* JADX INFO: renamed from: P0 */
    public lwl m7203P0() {
        if (this.f5099g == null) {
            this.f5099g = CoreModule.P().a().me(act());
        }
        return this.f5099g;
    }

    /* JADX INFO: renamed from: Q0 */
    public boolean m7204Q0(AbsMeetUserItemData absMeetUserItemData, boolean z, boolean z2, boolean z3, String str) {
        return this.f5099g.mo18067d(absMeetUserItemData, z, z2, z3, str);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m7205U0(c cVar) {
        if (cVar == c.i) {
            CoreModule.c.m1.n4();
            CoreModule.c.r0.J6();
            if (!this.f5094b) {
                CoreModule.c.m1.Z4();
            }
            if (this.f5094b) {
                m7222l1();
            }
            this.f5094b = false;
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m7206V0(Object obj) {
        m7177R0();
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ xaj0 m7207X0(xaj0 xaj0Var) {
        if (!((Boolean) ((xaj0) xaj0Var.a).b).booleanValue() && !vwb.J(((q860) ((xaj0) xaj0Var.a).a).f19068a) && this.f5095c >= 0) {
            int size = ((q860) ((xaj0) xaj0Var.a).a).f19068a.size();
            int i = this.f5095c;
            int i2 = this.f5096d;
            if (size > i + i2) {
                q860 q860Var = new q860(((q860) ((xaj0) xaj0Var.a).a).f19068a.subList(0, i + i2), ((q860) ((xaj0) xaj0Var.a).a).f19069b);
                Object obj = xaj0Var.a;
                return xaj0.a(xaj0.a(q860Var, (Boolean) ((xaj0) obj).b, (List) ((xaj0) obj).c), (j760) xaj0Var.b, (q860) xaj0Var.c);
            }
        }
        return xaj0Var;
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m7208Y0(xaj0 xaj0Var) {
        int i = 1;
        this.f5093a = (((Boolean) ((xaj0) xaj0Var.a).b).booleanValue() || ((q860) ((xaj0) xaj0Var.a).a).f19068a.size() < this.f5095c) && ((q860) ((xaj0) xaj0Var.a).a).m20834c();
        ((zi30) ((jq2) this).viewModel).m25813i();
        if (((q860) ((xaj0) xaj0Var.a).a).f19068a.isEmpty()) {
            ((zi30) ((jq2) this).viewModel).m25821s();
            return;
        }
        ArrayList arrayList = new ArrayList();
        boolean zBooleanValue = ((Boolean) ((xaj0) xaj0Var.a).b).booleanValue();
        Object obj = xaj0Var.a;
        if (zBooleanValue) {
            boolean z = false;
            int i2 = 0;
            for (T t : ((q860) ((xaj0) obj).a).f19068a) {
                if (t.item.readStatus == 0) {
                    i2++;
                } else if (!z && i2 > 10 && CoreModule.c.m1.g4()) {
                    arrayList.add(new MeetGuideToSwipeCardItemData());
                    z = true;
                }
                arrayList.add(t);
            }
        } else {
            List<T> list = ((q860) ((xaj0) obj).a).f19068a;
            int size = list.size();
            int iMin = Math.min(size - Math.min(this.f5096d, size), this.f5095c);
            arrayList.addAll(list.subList(0, iMin));
            arrayList.add(new MeetFeedNoSvipItemData(new ArrayList(list.subList(iMin, size))));
        }
        List list2 = (List) ((j760) ((j760) xaj0Var.b).a).b;
        if (vwb.J(list2)) {
            i = 0;
        } else {
            int iIntValue = ((Integer) ((j760) ((j760) xaj0Var.b).a).a).intValue();
            if (CoreModule.P().a().Yp()) {
                MyMeetSeeReminder myMeetSeeReminderW4 = CoreModule.c.m1.w4();
                if (!NullChecker.a(myMeetSeeReminderW4) || vwb.J(myMeetSeeReminderW4.userIds)) {
                    vwb.z(list2, new e30() { // from class: l.hi30
                        public final void call(Object obj2) {
                            ((User) obj2).localSeeReminderType = "";
                        }
                    });
                } else {
                    final String str = (String) myMeetSeeReminderW4.userIds.get(0);
                    final User userPa = CoreModule.c.e0.Pa(str);
                    User user = (User) vwb.v(list2, new w9j() { // from class: l.fi30
                        public final Object call(Object obj2) {
                            return NewMeetFragPresenter.m7191p0(str, userPa, (User) obj2);
                        }
                    }, 4);
                    if (user != null) {
                        user.localSeeReminderType = myMeetSeeReminderW4.reminderType.toString();
                    } else if (NullChecker.a(userPa)) {
                        userPa.localSeeReminderType = myMeetSeeReminderW4.reminderType.toString();
                        list2.add(0, userPa);
                    }
                }
            }
            arrayList.add(0, new MeetFeedLikersItemData(iIntValue, list2, ((Integer) ((j760) xaj0Var.b).b).intValue()));
        }
        if (CoreModule.P().g().D9()) {
            arrayList.add(i, new MeetFeedNearbyItemData(((q860) xaj0Var.c).f19068a));
        }
        ((zi30) ((jq2) this).viewModel).m25822u(Boolean.valueOf(this.f5093a));
        if (CoreModule.P().g().dh() && xma.L3() && NullChecker.a(this.f5100h.getSvipWeeklyItemData()) && !vwb.J(this.f5100h.getSvipWeeklyItemData().svipWeeklyItems)) {
            arrayList.add(0, this.f5100h.getSvipWeeklyItemData());
        }
        ((zi30) ((jq2) this).viewModel).m25819q(arrayList, (List) ((xaj0) xaj0Var.a).c);
    }

    /* JADX INFO: renamed from: Z */
    public void m7209Z() {
        super.Z();
        this.f5101i = act().getIntent().getStringExtra("from");
        this.f5095c = f5y.m14275g();
        this.f5096d = f5y.m14276h();
        f5y.m14274f().m14285p(true);
        if (this.f5099g == null) {
            this.f5099g = CoreModule.P().a().me(act());
        }
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
    }

    /* JADX INFO: renamed from: a0 */
    public void m7210a0() {
        super.a0();
        creates(new e30() { // from class: l.qi30
            public final void call(Object obj) {
                this.f19287a.m7178S0((Bundle) obj);
            }
        }, new d30() { // from class: l.xh30
            public final void call() {
                NewMeetFragPresenter.m7189n0();
            }
        });
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.yh30
            public final void call(Object obj) {
                this.f23059a.m7179W0((c) obj);
            }
        }));
        duringCreated(rx.c.combineLatest(CoreModule.c.m1.K4(), CoreModule.c.C0.u3(SummarizedPrivilegesId.get("svip")).map(new w9j() { // from class: l.zh30
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.L3());
            }
        }), CoreModule.c.m1.s4().filter(new u76()), CoreModule.c.C0.u3(SummarizedPrivilegesId.get("svip")).map(new w9j() { // from class: l.ai30
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.L3());
            }
        }).distinctUntilChanged().switchMap(new w9j() { // from class: l.bi30
            public final Object call(Object obj) {
                return this.f10112a.m7217g1(((Boolean) obj).booleanValue());
            }
        }), CoreModule.c.u0.u5(), CoreModule.c.m2.K3(), this.f5100h.m16175e(), new caj() { // from class: l.ci30
            /* JADX INFO: renamed from: a */
            public final Object m12580a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                q860 q860Var = (q860) obj;
                Boolean bool = (Boolean) obj2;
                List list = (List) obj3;
                j760 j760Var = (j760) obj4;
                Integer num = (Integer) obj5;
                q860 q860Var2 = (q860) obj6;
                return xaj0.a(xaj0.a(q860Var, bool, list), j760.a(j760Var, num), q860Var2);
            }
        })).distinctUntilChanged().map(new w9j() { // from class: l.di30
            public final Object call(Object obj) {
                return this.f11846a.m7207X0((xaj0) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.ei30
            public final void call(Object obj) {
                this.f12572a.m7208Y0((xaj0) obj);
            }
        }));
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.ri30
            public final void call(Object obj) {
                this.f19846a.m7205U0((c) obj);
            }
        }));
        duringCreated(CoreModule.P().g().On()).filter(new w9j() { // from class: l.si30
            public final Object call(Object obj) {
                return NewMeetFragPresenter.m7199z0((PaymentResultWrapper) obj);
            }
        }).switchMap(new w9j() { // from class: l.ti30
            public final Object call(Object obj) {
                return NewMeetFragPresenter.m7185j0((PaymentResultWrapper) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.ui30
            public final void call(Object obj) {
                this.f21200a.m7206V0(obj);
            }
        }));
        duringCreated(CoreModule.c.C0.u3(SummarizedPrivilegesId.get("svip")).map(new w9j() { // from class: l.vi30
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.L3());
            }
        })).distinctUntilChanged().skip(1).take(1).subscribe(mkd0.G(new e30() { // from class: l.wh30
            public final void call(Object obj) {
                NewMeetFragPresenter.m7170D0((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m7211a1(AbsMeetUserItemData absMeetUserItemData, String str) {
        this.f5099g.mo18067d(absMeetUserItemData, true, true, false, str);
    }

    @Nullable
    public Act act() {
        return super.act();
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m7212b1(View view) {
        this.f5102j.b();
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m7213c1(final AbsMeetUserItemData absMeetUserItemData, final User user, VListCell vListCell, VListCell.a aVar, int i) {
        Handler handler = null;
        if (i != 0) {
            zvf0.u("e_meet_card_more_report", "p_meet", new j760[]{vwb.Y("other_user_id", ((DbObject) absMeetUserItemData.user).id)});
            act().startActivity(CoreModule.P().a().O9(act(), ((DbObject) absMeetUserItemData.user).id, false, new ResultReceiver(handler) { // from class: com.p1.mobile.putong.core.newui.newmeet.frag.meet.NewMeetFragPresenter.1
                @Override // android.os.ResultReceiver
                public void onReceiveResult(int i2, Bundle bundle) {
                    if (i2 == -1) {
                        NewMeetFragPresenter.this.f5099g.mo18065b(absMeetUserItemData, false, false, null);
                        CoreModule.N().following(CoreModule.H().userId(), user, false, (String) null, (String) null);
                        NewMeetFragPresenter.this.f5102j.b();
                    }
                }
            }));
        } else {
            zvf0.u("e_meet_card_more_dislike", "p_meet", new j760[]{vwb.Y("other_user_id", ((DbObject) absMeetUserItemData.user).id)});
            this.f5099g.mo18065b(absMeetUserItemData, false, false, null);
            CoreModule.N().following(CoreModule.H().userId(), user, false, (String) null, (String) null);
            this.f5102j.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0091  */
    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m7214d1(Intent intent, int i, c cVar) {
        String stringExtra;
        if (intent != null) {
            boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
            boolean z2 = i == SwipeDirection.UP.getValue();
            final String stringExtra2 = intent.getStringExtra(CoreModule.P().a().Iq());
            AbsMeetUserItemData absMeetUserItemData = (AbsMeetUserItemData) vwb.r(CoreModule.c.m1.L4().f19068a, new w9j() { // from class: l.ki30
                public final Object call(Object obj) {
                    return NewMeetFragPresenter.m7169C0(stringExtra2, (AbsMeetListData) obj);
                }
            });
            if (absMeetUserItemData != null) {
                if (z2) {
                    String stringExtra3 = intent.getStringExtra(CoreModule.P().a().gl());
                    stringExtra = intent.getStringExtra(CoreModule.P().a().L8());
                    String stringExtra4 = intent.getStringExtra(CoreModule.P().a().Iq());
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
                this.f5099g.mo18067d(absMeetUserItemData, z, z2, false, str);
            }
        }
    }

    public void destroy() {
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m7215e1(Intent intent, int i, c cVar) {
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
                m7204Q0(new MeetFeedUserItemData(userPa, myMeetFeedItemNew_), z, z2, false, str);
            }
        }
    }

    /* JADX INFO: renamed from: f1 */
    public void m7216f1(final AbsMeetUserItemData absMeetUserItemData, boolean z, boolean z2, boolean z3) {
        if (!z3) {
            this.f5099g.mo18067d(absMeetUserItemData, z, z2, false, null);
            return;
        }
        e30 e30Var = new e30() { // from class: l.ni30
            public final void call(Object obj) {
                this.f17480a.m7211a1(absMeetUserItemData, (String) obj);
            }
        };
        if (TEnum.equals(((AbsMeetListData) absMeetUserItemData).item.relation.status, "superliked")) {
            if (xma.e4() && !xma.D3()) {
                CoreModule.P().a().qm(act(), "p_meet_view,e_meet_feed_button,click", Privilege.letter, (e30) null);
                return;
            }
            if (xma.D3()) {
                CoreModule.P().a().Mp(act(), absMeetUserItemData.user, e30Var, true);
            } else if (CoreModule.P().g().S9()) {
                CoreModule.P().a().Mp(act(), absMeetUserItemData.user, e30Var, true);
            } else {
                CoreModule.P().g().ot(act(), "p_navigation_ilike,card_button_pull");
            }
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final rx.c<j760<Integer, List<User>>> m7217g1(boolean z) {
        return z ? CoreModule.c.u0.J6().map(new w9j() { // from class: l.ii30
            public final Object call(Object obj) {
                return NewMeetFragPresenter.m7187l0((q860) obj);
            }
        }) : CoreModule.c.u0.R6();
    }

    public String getFrom() {
        return this.f5101i;
    }

    /* JADX INFO: renamed from: h1 */
    public void m7218h1(final AbsMeetUserItemData absMeetUserItemData, boolean z) {
        zvf0.u("e_meet_card_more", "p_meet", new j760[]{vwb.Y("other_user_id", ((DbObject) absMeetUserItemData.user).id)});
        final User userPa = CoreModule.c.e0.Pa(((DbObject) absMeetUserItemData.user).id);
        if (NullChecker.a(userPa)) {
            if (NullChecker.a(this.f5102j)) {
                this.f5102j.b();
            }
            ArrayList arrayList = new ArrayList();
            if (z) {
                arrayList.add("不再喜欢/关注");
            } else {
                arrayList.add("不喜欢");
            }
            arrayList.add("举报");
            this.f5102j = new c40.b(Y()).I("取消").U(new View.OnClickListener() { // from class: l.li30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f16171a.m7212b1(view);
                }
            }).Q(arrayList).G(true).V(new c40.d() { // from class: l.mi30
                /* JADX INFO: renamed from: a */
                public final void m18470a(VListCell vListCell, VListCell.a aVar, int i) {
                    this.f16929a.m7213c1(absMeetUserItemData, userPa, vListCell, aVar, i);
                }
            }).R(new int[]{0, 1}, new int[]{z0c0.f, z0c0.g}).F();
        }
        this.f5102j.f();
    }

    /* JADX INFO: renamed from: i1 */
    public void m7219i1(AbsMeetUserItemData absMeetUserItemData, String str, Object obj) {
        m7220j1(absMeetUserItemData.user, str, obj, absMeetUserItemData.isPicksUser());
    }

    /* JADX INFO: renamed from: j1 */
    public final void m7220j1(User user, String str, Object obj, boolean z) {
        String str2 = z ? "p_meet_view,e_picks_feed_card,like_swipe" : "p_meet_view,e_whoiliked_card,sayhi_superlike";
        if (z) {
            if (!CoreModule.c.e0.p9().isFemale() || azc0.d().c()) {
                if (!azc0.d().e() && !xma.G3() && sja.r3() <= 0) {
                    CoreModule.P().a().Mc(act(), str2);
                    return;
                }
            } else if (!xma.L3()) {
                CoreModule.P().a().Rm(act(), str2);
                return;
            } else if (!xma.G3() && sja.r3() <= 0) {
                CoreModule.P().a().Mc(act(), str2);
                return;
            }
        } else if (xma.e4()) {
            if (CoreModule.c.e0.p9().isFemale() && !azc0.d().c()) {
                CoreModule.P().a().pr(act(), str2, Privilege.liked_user);
                return;
            } else if (!CoreModule.c.e0.p9().isFemale() && !azc0.d().e()) {
                CoreModule.P().a().pr(act(), str2, Privilege.liked_user);
                return;
            }
        }
        if (CoreModule.N().Co() && NullChecker.a(act())) {
            CoreModule.P().a().Za(act(), ((DbObject) user).id, obj, str, z);
        }
    }

    /* JADX INFO: renamed from: k1 */
    public boolean m7221k1(int i, final int i2, final Intent intent) {
        if (i == 16) {
            if (i2 != SwipeDirection.RIGHT.getValue() && i2 != SwipeDirection.LEFT.getValue() && i2 != SwipeDirection.UP.getValue()) {
                return false;
            }
            lifecycle().takeFirst(new w9j() { // from class: l.vh30
                public final Object call(Object obj) {
                    return Boolean.valueOf(((c) obj) == c.i);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.gi30
                public final void call(Object obj) {
                    this.f13575a.m7214d1(intent, i2, (c) obj);
                }
            }));
            return true;
        }
        if (i == 18) {
            if (NullChecker.a(intent) && intent.getIntExtra("see_count", 1) == 0) {
                f5y.m14279n();
            }
            return true;
        }
        if (i != CoreModule.P().a().re()) {
            return false;
        }
        if (i2 != SwipeDirection.RIGHT.getValue() && i2 != SwipeDirection.LEFT.getValue() && i2 != SwipeDirection.UP.getValue()) {
            return false;
        }
        lifecycle().takeFirst(new w9j() { // from class: l.oi30
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.i);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.pi30
            public final void call(Object obj) {
                this.f18598a.m7215e1(intent, i2, (c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: l1 */
    public void m7222l1() {
        m7177R0();
        if (TextUtils.isEmpty(this.f5101i) || !this.f5101i.equals("from_notes")) {
            return;
        }
        CoreModule.P().a().Gq(act());
    }

    /* JADX INFO: renamed from: m1 */
    public void m7223m1() {
        if (CoreModule.P().a().sf()) {
            CoreModule.c.m1.y4((DbLinks) null, true, false, true);
        } else {
            CoreModule.c.m1.x4((DbLinks) null, true, false);
        }
        CoreModule.c.m1.Z4();
        if (CoreModule.P().g().dh() && xma.L3()) {
            CoreModule.c.m1.y5();
        }
    }

    /* JADX INFO: renamed from: n1 */
    public void m7224n1(String str, String str2) {
        CoreModule.c.m1.R4(str);
        CoreModule.Q().startAudienceLive(act(), str2, "meet", null);
    }

    /* JADX INFO: renamed from: o1 */
    public void m7225o1(String str, String str2) {
        CoreModule.c.m1.R4(str);
        CoreModule.Q().m9019M6().m12097p(act(), str2, "meet", str, null);
    }

    /* JADX INFO: renamed from: p1 */
    public void m7226p1() {
        if (this.f5093a) {
            if (CoreModule.P().a().sf()) {
                CoreModule.c.m1.e4(true);
            } else {
                CoreModule.c.m1.d4();
            }
        }
    }
}
