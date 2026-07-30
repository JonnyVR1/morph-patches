package com.p051p1.mobile.putong.core.newui.newmeet.frag.meet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4904s;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.businessdata.meet.AbsMeetListData;
import com.p051p1.mobile.putong.core.businessdata.meet.AbsMeetUserItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedLikersItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedNearbyItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedNoSvipItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedUserItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetGuideToSwipeCardItemData;
import com.p051p1.mobile.putong.core.data.FeedType;
import com.p051p1.mobile.putong.core.data.MyMeetFeedItem;
import com.p051p1.mobile.putong.core.data.MyMeetSeeReminder;
import com.p051p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.newmeet.frag.meet.NewMeetFragPresenter;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import p137rx.C22421c;
import p151v.VListCell;
import p153l.ar2;
import p153l.bkj0;
import p153l.cey;
import p153l.d7d0;
import p153l.dzl;
import p153l.ela;
import p153l.f9c0;
import p153l.fay;
import p153l.i4g0;
import p153l.joa;
import p153l.jyb;
import p153l.nr30;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.vg60;
import p153l.w30;
import p153l.wcj;
import p153l.x20;
import p153l.y20;
import p153l.z86;
import p153l.zxv;

/* JADX INFO: loaded from: classes11.dex */
public class NewMeetFragPresenter extends ar2<nr30> {

    /* JADX INFO: renamed from: a */
    public boolean f27057a;

    /* JADX INFO: renamed from: b */
    public boolean f27058b;

    /* JADX INFO: renamed from: c */
    public int f27059c;

    /* JADX INFO: renamed from: d */
    public int f27060d;

    /* JADX INFO: renamed from: e */
    public final ArrayList<String> f27061e;

    /* JADX INFO: renamed from: f */
    public final NewMeetFrag f27062f;

    /* JADX INFO: renamed from: g */
    public dzl f27063g;

    /* JADX INFO: renamed from: h */
    public fay f27064h;

    /* JADX INFO: renamed from: i */
    public String f27065i;

    /* JADX INFO: renamed from: j */
    public w30 f27066j;

    public NewMeetFragPresenter(NewMeetFrag newMeetFrag) {
        super(newMeetFrag);
        this.f27058b = true;
        this.f27059c = 0;
        this.f27060d = 2;
        this.f27061e = new ArrayList<>();
        this.f27064h = new fay();
        this.f27062f = newMeetFrag;
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ Boolean m43982C0(String str, AbsMeetListData absMeetListData) {
        return absMeetListData instanceof AbsMeetUserItemData ? Boolean.valueOf(((AbsMeetUserItemData) absMeetListData).user.f56859id.equals(str)) : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m43983D0(Boolean bool) {
        if (bool.booleanValue()) {
            CoreLikers coreLikers = CoreModule.f18264c.f20429u0;
            coreLikers.m31429Z6(null, coreLikers.f19996l0.get().longValue(), 25, "");
        } else {
            CoreLikers coreLikers2 = CoreModule.f18264c.f20429u0;
            coreLikers2.m31451j7(25, coreLikers2.f19996l0.get().longValue(), "");
        }
    }

    /* JADX INFO: renamed from: R0 */
    private void m43990R0() {
        if (CoreModule.m30933P().m143405a().mo34590sf()) {
            C4904s c4904s = CoreModule.f18264c.f20406m1;
            c4904s.m35736y4(null, false, c4904s.m35733v4() == 0, true);
        } else {
            CoreModule.f18264c.f20406m1.m35735x4(null, true, false);
        }
        CoreModule.f18264c.f20406m1.m35712Z4();
        CoreModule.f18264c.f20420r0.m35095J6();
        CoreModule.f18264c.f20312H0.m155449k5();
        if (CoreModule.m30933P().m143410g().mo36058dh() && joa.m146361M3()) {
            CoreModule.f18264c.f20406m1.m35737y5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public /* synthetic */ void m43991S0(Bundle bundle) {
        ((nr30) this.viewModel).m164456r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public /* synthetic */ void m43992W0(C4470c c4470c) {
        if (c4470c != C4470c.f16268j || jyb.m147479J(this.f27061e)) {
            return;
        }
        CoreModule.f18264c.f20406m1.m35706O5(this.f27061e);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ C22421c m43998j0(PaymentResultWrapper paymentResultWrapper) {
        return paymentResultWrapper.fromSign ? C22421c.just(paymentResultWrapper) : CoreModule.f18264c.f20297C0.m146427y3().distinctUntilChanged().skip(1).take(1).map(new qcj() { // from class: l.xq30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return NewMeetFragPresenter.m44001m0((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ pf60 m44000l0(vg60 vg60Var) {
        return NullChecker.m82486a(vg60Var) ? pf60.m172085a(Integer.valueOf(vg60Var.m201222d()), vg60Var.f184001a) : pf60.m172085a(0, new ArrayList());
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ List m44001m0(List list) {
        return list;
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m44002n0() {
        cey.m109473f().m109483o(false);
        long jLongValue = CoreModule.f18264c.f20429u0.f19996l0.get().longValue();
        long jM35732u4 = CoreModule.f18264c.f20406m1.m35732u4();
        CoreModule.f18264c.f20406m1.m35723m5(jLongValue, CoreModule.f18264c.f20406m1.m35726p4(), jM35732u4);
        CoreModule.f18264c.f20406m1.m35722m4();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ Boolean m44004p0(String str, User user, User user2) {
        boolean z;
        if (TextUtils.equals(user2.f56859id, str)) {
            z = true;
        } else {
            z = false;
            if (NullChecker.m82486a(user) && !jyb.m147479J(user.pictures) && !jyb.m147479J(user2.pictures) && TextUtils.equals(user.picture(0).url, user2.picture(0).url)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ Boolean m44012z0(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_PICKS_MEMBERSHIP || purchaseType == PurchaseType.TYPE_SVIP_PICKS_MEMBERSHIP);
    }

    /* JADX INFO: renamed from: L0 */
    public void m44013L0(String str) {
        if (this.f27061e.contains(str)) {
            return;
        }
        this.f27061e.add(str);
    }

    /* JADX INFO: renamed from: N0 */
    public Unit m44014N0(boolean z, String str) {
        if (z) {
            i4g0.m138520r("e_meet_unlock", "p_meet");
        }
        CoreModule.m30933P().m143405a().mo34568pr(act(), str, Privilege.see_who_likes_me);
        return null;
    }

    /* JADX INFO: renamed from: O0 */
    public Frag m44015O0() {
        return this.f27062f;
    }

    /* JADX INFO: renamed from: P0 */
    public dzl m44016P0() {
        if (this.f27063g == null) {
            this.f27063g = CoreModule.m30933P().m143405a().mo34549me(act());
        }
        return this.f27063g;
    }

    /* JADX INFO: renamed from: Q0 */
    public boolean m44017Q0(AbsMeetUserItemData absMeetUserItemData, boolean z, boolean z2, boolean z3, String str) {
        return this.f27063g.mo118749d(absMeetUserItemData, z, z2, z3, str);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m44018U0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            CoreModule.f18264c.f20406m1.m35724n4();
            CoreModule.f18264c.f20420r0.m35095J6();
            if (!this.f27058b) {
                CoreModule.f18264c.f20406m1.m35712Z4();
            }
            if (this.f27058b) {
                m44033l1();
            }
            this.f27058b = false;
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m44019V0(Object obj) {
        m43990R0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ bkj0 m44020X0(bkj0 bkj0Var) {
        if (!((Boolean) ((bkj0) bkj0Var.f77081a).f77082b).booleanValue() && !jyb.m147479J(((vg60) ((bkj0) bkj0Var.f77081a).f77081a).f184001a) && this.f27059c >= 0) {
            int size = ((vg60) ((bkj0) bkj0Var.f77081a).f77081a).f184001a.size();
            int i = this.f27059c;
            int i2 = this.f27060d;
            if (size > i + i2) {
                vg60 vg60Var = new vg60(((vg60) ((bkj0) bkj0Var.f77081a).f77081a).f184001a.subList(0, i + i2), ((vg60) ((bkj0) bkj0Var.f77081a).f77081a).f184002b);
                A a = bkj0Var.f77081a;
                return bkj0.m104818a(bkj0.m104818a(vg60Var, (Boolean) ((bkj0) a).f77082b, (List) ((bkj0) a).f77083c), (pf60) bkj0Var.f77082b, (vg60) bkj0Var.f77083c);
            }
        }
        return bkj0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m44021Y0(bkj0 bkj0Var) {
        int i = 1;
        this.f27057a = (((Boolean) ((bkj0) bkj0Var.f77081a).f77082b).booleanValue() || ((vg60) ((bkj0) bkj0Var.f77081a).f77081a).f184001a.size() < this.f27059c) && ((vg60) ((bkj0) bkj0Var.f77081a).f77081a).m201221c();
        ((nr30) this.viewModel).m164450i();
        if (((vg60) ((bkj0) bkj0Var.f77081a).f77081a).f184001a.isEmpty()) {
            ((nr30) this.viewModel).m164457s();
            return;
        }
        ArrayList arrayList = new ArrayList();
        boolean zBooleanValue = ((Boolean) ((bkj0) bkj0Var.f77081a).f77082b).booleanValue();
        A a = bkj0Var.f77081a;
        if (zBooleanValue) {
            boolean z = false;
            int i2 = 0;
            for (T t : ((vg60) ((bkj0) a).f77081a).f184001a) {
                if (t.item.readStatus == 0) {
                    i2++;
                } else if (!z && i2 > 10 && CoreModule.f18264c.f20406m1.m35716g4()) {
                    arrayList.add(new MeetGuideToSwipeCardItemData());
                    z = true;
                }
                arrayList.add(t);
            }
        } else {
            List<T> list = ((vg60) ((bkj0) a).f77081a).f184001a;
            int size = list.size();
            int iMin = Math.min(size - Math.min(this.f27060d, size), this.f27059c);
            arrayList.addAll(list.subList(0, iMin));
            arrayList.add(new MeetFeedNoSvipItemData(new ArrayList(list.subList(iMin, size))));
        }
        List list2 = (List) ((pf60) ((pf60) bkj0Var.f77082b).f152156a).f152157b;
        if (jyb.m147479J(list2)) {
            i = 0;
        } else {
            int iIntValue = ((Integer) ((pf60) ((pf60) bkj0Var.f77082b).f152156a).f152156a).intValue();
            if (CoreModule.m30933P().m143405a().mo34457Yp()) {
                MyMeetSeeReminder myMeetSeeReminderM35734w4 = CoreModule.f18264c.f20406m1.m35734w4();
                if (!NullChecker.m82486a(myMeetSeeReminderM35734w4) || jyb.m147479J(myMeetSeeReminderM35734w4.userIds)) {
                    jyb.m147537z(list2, new y20() { // from class: l.vq30
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            ((User) obj).localSeeReminderType = "";
                        }
                    });
                } else {
                    final String str = myMeetSeeReminderM35734w4.userIds.get(0);
                    final User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str);
                    User user = (User) jyb.m147533v(list2, new qcj() { // from class: l.tq30
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return NewMeetFragPresenter.m44004p0(str, userM116503Pa, (User) obj);
                        }
                    }, 4);
                    if (user != null) {
                        user.localSeeReminderType = myMeetSeeReminderM35734w4.reminderType.toString();
                    } else if (NullChecker.m82486a(userM116503Pa)) {
                        userM116503Pa.localSeeReminderType = myMeetSeeReminderM35734w4.reminderType.toString();
                        list2.add(0, userM116503Pa);
                    }
                }
            }
            arrayList.add(0, new MeetFeedLikersItemData(iIntValue, list2, ((Integer) ((pf60) bkj0Var.f77082b).f152157b).intValue()));
        }
        if (CoreModule.m30933P().m143410g().mo36007D9()) {
            arrayList.add(i, new MeetFeedNearbyItemData(((vg60) bkj0Var.f77083c).f184001a));
        }
        ((nr30) this.viewModel).m164458u(Boolean.valueOf(this.f27057a));
        if (CoreModule.m30933P().m143410g().mo36058dh() && joa.m146361M3() && NullChecker.m82486a(this.f27064h.getSvipWeeklyItemData()) && !jyb.m147479J(this.f27064h.getSvipWeeklyItemData().svipWeeklyItems)) {
            arrayList.add(0, this.f27064h.getSvipWeeklyItemData());
        }
        ((nr30) this.viewModel).m164455q(arrayList, (List) ((bkj0) bkj0Var.f77081a).f77083c);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f27065i = act().getIntent().getStringExtra("from");
        this.f27059c = cey.m109474g();
        this.f27060d = cey.m109475h();
        cey.m109473f().m109484p(true);
        if (this.f27063g == null) {
            this.f27063g = CoreModule.m30933P().m143405a().mo34549me(act());
        }
        if (CoreModule.m30933P().m143405a().mo34492e2()) {
            CoreLikers coreLikers = CoreModule.f18264c.f20429u0;
            coreLikers.m31451j7(25, coreLikers.f19996l0.get().longValue(), "");
        } else {
            CoreLikers coreLikers2 = CoreModule.f18264c.f20429u0;
            coreLikers2.m31429Z6(null, coreLikers2.f19996l0.get().longValue(), 25, "");
        }
        if (CoreModule.m30933P().m143410g().mo36007D9() && zxv.m222086c()) {
            CoreModule.f18264c.f20407m2.m123954D3(null, 20, true);
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.er30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95442a.m43991S0((Bundle) obj);
            }
        }, new x20() { // from class: l.lq30
            @Override // p153l.x20
            public final void call() {
                NewMeetFragPresenter.m44002n0();
            }
        });
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.mq30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137999a.m43992W0((C4470c) obj);
            }
        }));
        duringCreated(C22421c.combineLatest(CoreModule.f18264c.f20406m1.m35697K4(), CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip")).map(new qcj() { // from class: l.nq30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(joa.m146361M3());
            }
        }), CoreModule.f18264c.f20406m1.m35729s4().filter(new z86()), CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip")).map(new qcj() { // from class: l.oq30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(joa.m146361M3());
            }
        }).distinctUntilChanged().switchMap(new qcj() { // from class: l.pq30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f153626a.m44028g1(((Boolean) obj).booleanValue());
            }
        }), CoreModule.f18264c.f20429u0.m31488w5(), CoreModule.f18264c.f20407m2.m123961K3(), this.f27064h.m124799e(), new wcj() { // from class: l.qq30
            @Override // p153l.wcj
            /* JADX INFO: renamed from: a */
            public final Object mo177479a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                vg60 vg60Var = (vg60) obj;
                Boolean bool = (Boolean) obj2;
                List list = (List) obj3;
                pf60 pf60Var = (pf60) obj4;
                Integer num = (Integer) obj5;
                vg60 vg60Var2 = (vg60) obj6;
                return bkj0.m104818a(bkj0.m104818a(vg60Var, bool, list), pf60.m172085a(pf60Var, num), vg60Var2);
            }
        })).distinctUntilChanged().map(new qcj() { // from class: l.rq30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f164428a.m44020X0((bkj0) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.sq30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170133a.m44021Y0((bkj0) obj);
            }
        }));
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.fr30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100394a.m44018U0((C4470c) obj);
            }
        }));
        duringCreated(CoreModule.m30933P().m143410g().mo36025On()).filter(new qcj() { // from class: l.gr30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return NewMeetFragPresenter.m44012z0((PaymentResultWrapper) obj);
            }
        }).switchMap(new qcj() { // from class: l.hr30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return NewMeetFragPresenter.m43998j0((PaymentResultWrapper) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.ir30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116503a.m44019V0(obj);
            }
        }));
        duringCreated((C22421c) CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip")).map(new qcj() { // from class: l.jr30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(joa.m146361M3());
            }
        })).distinctUntilChanged().skip(1).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.kq30
            @Override // p153l.y20
            public final void call(Object obj) {
                NewMeetFragPresenter.m43983D0((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m44022a1(AbsMeetUserItemData absMeetUserItemData, String str) {
        this.f27063g.mo118749d(absMeetUserItemData, true, true, false, str);
    }

    @Override // p153l.ar2
    @Nullable
    public Act act() {
        return super.act();
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m44023b1(View view) {
        this.f27066j.m204614b();
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m44024c1(final AbsMeetUserItemData absMeetUserItemData, final User user, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        Handler handler = null;
        if (i != 0) {
            i4g0.m138523u("e_meet_card_more_report", "p_meet", jyb.m147494Y("other_user_id", absMeetUserItemData.user.f56859id));
            act().startActivity(CoreModule.m30933P().m143405a().mo34387O9(act(), absMeetUserItemData.user.f56859id, false, new ResultReceiver(handler) { // from class: com.p1.mobile.putong.core.newui.newmeet.frag.meet.NewMeetFragPresenter.1
                @Override // android.os.ResultReceiver
                public void onReceiveResult(int i2, Bundle bundle) {
                    if (i2 == -1) {
                        NewMeetFragPresenter.this.f27063g.mo118747b(absMeetUserItemData, false, false, null);
                        CoreModule.m30932N().following(CoreModule.m30929H().userId(), user, false, null, null);
                        NewMeetFragPresenter.this.f27066j.m204614b();
                    }
                }
            }));
        } else {
            i4g0.m138523u("e_meet_card_more_dislike", "p_meet", jyb.m147494Y("other_user_id", absMeetUserItemData.user.f56859id));
            this.f27063g.mo118747b(absMeetUserItemData, false, false, null);
            CoreModule.m30932N().following(CoreModule.m30929H().userId(), user, false, null, null);
            this.f27066j.m204614b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0091  */
    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m44025d1(Intent intent, int i, C4470c c4470c) {
        String stringExtra;
        if (intent != null) {
            boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
            boolean z2 = i == SwipeDirection.UP.getValue();
            final String stringExtra2 = intent.getStringExtra(CoreModule.m30933P().m143405a().mo34346Iq());
            AbsMeetUserItemData absMeetUserItemData = (AbsMeetUserItemData) jyb.m147529r(CoreModule.f18264c.f20406m1.m35699L4().f184001a, new qcj() { // from class: l.yq30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return NewMeetFragPresenter.m43982C0(stringExtra2, (AbsMeetListData) obj);
                }
            });
            if (absMeetUserItemData != null) {
                if (z2) {
                    String stringExtra3 = intent.getStringExtra(CoreModule.m30933P().m143405a().mo34509gl());
                    stringExtra = intent.getStringExtra(CoreModule.m30933P().m143405a().mo34360L8());
                    String stringExtra4 = intent.getStringExtra(CoreModule.m30933P().m143405a().mo34346Iq());
                    if (TextUtils.isEmpty(stringExtra3) || TextUtils.isEmpty(stringExtra) || !stringExtra3.equals(stringExtra4)) {
                        stringExtra = null;
                    }
                } else {
                    stringExtra = null;
                }
                String str = stringExtra;
                if (!TextUtils.isEmpty(str)) {
                    i4g0.m138520r("e_iliked_letter", act().pageId());
                }
                this.f27063g.mo118749d(absMeetUserItemData, z, z2, false, str);
            }
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m44026e1(Intent intent, int i, C4470c c4470c) {
        String stringExtra;
        if (intent != null) {
            boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
            boolean z2 = i == SwipeDirection.UP.getValue();
            String stringExtra2 = intent.getStringExtra(CoreModule.f18273l.m143405a().mo34346Iq());
            if (z2) {
                String stringExtra3 = intent.getStringExtra(CoreModule.f18273l.m143405a().mo34509gl());
                stringExtra = intent.getStringExtra(CoreModule.f18273l.m143405a().mo34360L8());
                String stringExtra4 = intent.getStringExtra(CoreModule.f18273l.m143405a().mo34346Iq());
                if (TextUtils.isEmpty(stringExtra3) || TextUtils.isEmpty(stringExtra) || !stringExtra3.equals(stringExtra4)) {
                    stringExtra = null;
                }
            } else {
                stringExtra = null;
            }
            String str = stringExtra;
            if (!TextUtils.isEmpty(str)) {
                i4g0.m138520r("e_iliked_letter", act().pageId());
            }
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(stringExtra2);
            if (NullChecker.m82486a(userM116503Pa)) {
                MyMeetFeedItem myMeetFeedItemNew_ = MyMeetFeedItem.new_();
                myMeetFeedItemNew_.type = FeedType.get(FeedType.localLikersUser);
                m44017Q0(new MeetFeedUserItemData(userM116503Pa, myMeetFeedItemNew_), z, z2, false, str);
            }
        }
    }

    /* JADX INFO: renamed from: f1 */
    public void m44027f1(final AbsMeetUserItemData absMeetUserItemData, boolean z, boolean z2, boolean z3) {
        if (!z3) {
            this.f27063g.mo118749d(absMeetUserItemData, z, z2, false, null);
            return;
        }
        y20<String> y20Var = new y20() { // from class: l.br30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77977a.m44022a1(absMeetUserItemData, (String) obj);
            }
        };
        if (TEnum.equals(absMeetUserItemData.item.relation.status, "superliked")) {
            if (joa.m146386f4() && !joa.m146355E3()) {
                CoreModule.m30933P().m143405a().mo34575qm(act(), "p_meet_view,e_meet_feed_button,click", Privilege.letter, null);
                return;
            }
            if (joa.m146355E3()) {
                CoreModule.m30933P().m143405a().mo34374Mp(act(), absMeetUserItemData.user, y20Var, true);
            } else if (CoreModule.m30933P().m143410g().mo36032S9()) {
                CoreModule.m30933P().m143405a().mo34374Mp(act(), absMeetUserItemData.user, y20Var, true);
            } else {
                CoreModule.m30933P().m143410g().mo36074ot(act(), "p_navigation_ilike,card_button_pull");
            }
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final C22421c<pf60<Integer, List<User>>> m44028g1(boolean z) {
        return z ? CoreModule.f18264c.f20429u0.m31405N6().map(new qcj() { // from class: l.wq30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return NewMeetFragPresenter.m44000l0((vg60) obj);
            }
        }) : CoreModule.f18264c.f20429u0.m31421V6();
    }

    public String getFrom() {
        return this.f27065i;
    }

    /* JADX INFO: renamed from: h1 */
    public void m44029h1(final AbsMeetUserItemData absMeetUserItemData, boolean z) {
        i4g0.m138523u("e_meet_card_more", "p_meet", jyb.m147494Y("other_user_id", absMeetUserItemData.user.f56859id));
        final User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(absMeetUserItemData.user.f56859id);
        if (NullChecker.m82486a(userM116503Pa)) {
            if (NullChecker.m82486a(this.f27066j)) {
                this.f27066j.m204614b();
            }
            ArrayList arrayList = new ArrayList();
            if (z) {
                arrayList.add("不再喜欢/关注");
            } else {
                arrayList.add("不喜欢");
            }
            arrayList.add("举报");
            this.f27066j = new w30.C21001b(m99640Y()).m204657I("取消").m204669U(new View.OnClickListener() { // from class: l.zq30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f205567a.m44023b1(view);
                }
            }).m204665Q(arrayList).m204655G(true).m204670V(new w30.InterfaceC21003d() { // from class: l.ar30
                @Override // p153l.w30.InterfaceC21003d
                /* JADX INFO: renamed from: a */
                public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                    this.f72909a.m44024c1(absMeetUserItemData, userM116503Pa, vListCell, c22660a, i);
                }
            }).m204666R(new int[]{0, 1}, new int[]{f9c0.f97861f, f9c0.f97862g}).m204654F();
        }
        this.f27066j.m204618f();
    }

    /* JADX INFO: renamed from: i1 */
    public void m44030i1(AbsMeetUserItemData absMeetUserItemData, String str, Object obj) {
        m44031j1(absMeetUserItemData.user, str, obj, absMeetUserItemData.isPicksUser());
    }

    /* JADX INFO: renamed from: j1 */
    public final void m44031j1(User user, String str, Object obj, boolean z) {
        String str2 = z ? "p_meet_view,e_picks_feed_card,like_swipe" : "p_meet_view,e_whoiliked_card,sayhi_superlike";
        if (z) {
            if (!CoreModule.f18264c.f20381e0.m116600p9().isFemale() || d7d0.m114719d().m114721c()) {
                if (!d7d0.m114719d().m114722e() && !joa.m146358H3() && ela.m121122r3() <= 0) {
                    CoreModule.m30933P().m143405a().mo34369Mc(act(), str2);
                    return;
                }
            } else if (!joa.m146361M3()) {
                CoreModule.m30933P().m143405a().mo34404Rm(act(), str2);
                return;
            } else if (!joa.m146358H3() && ela.m121122r3() <= 0) {
                CoreModule.m30933P().m143405a().mo34369Mc(act(), str2);
                return;
            }
        } else if (joa.m146386f4()) {
            if (CoreModule.f18264c.f20381e0.m116600p9().isFemale() && !d7d0.m114719d().m114721c()) {
                CoreModule.m30933P().m143405a().mo34568pr(act(), str2, Privilege.liked_user);
                return;
            } else if (!CoreModule.f18264c.f20381e0.m116600p9().isFemale() && !d7d0.m114719d().m114722e()) {
                CoreModule.m30933P().m143405a().mo34568pr(act(), str2, Privilege.liked_user);
                return;
            }
        }
        if (CoreModule.m30932N().mo61451Co() && NullChecker.m82486a(act())) {
            CoreModule.m30933P().m143405a().mo34459Za(act(), user.f56859id, obj, str, z);
        }
    }

    /* JADX INFO: renamed from: k1 */
    public boolean m44032k1(int i, final int i2, final Intent intent) {
        if (i == 16) {
            if (i2 != SwipeDirection.RIGHT.getValue() && i2 != SwipeDirection.LEFT.getValue() && i2 != SwipeDirection.UP.getValue()) {
                return false;
            }
            lifecycle().takeFirst(new qcj() { // from class: l.jq30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.uq30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f180351a.m44025d1(intent, i2, (C4470c) obj);
                }
            }));
            return true;
        }
        if (i == 18) {
            if (NullChecker.m82486a(intent) && intent.getIntExtra("see_count", 1) == 0) {
                cey.m109478n();
            }
            return true;
        }
        if (i != CoreModule.m30933P().m143405a().mo34580re()) {
            return false;
        }
        if (i2 != SwipeDirection.RIGHT.getValue() && i2 != SwipeDirection.LEFT.getValue() && i2 != SwipeDirection.UP.getValue()) {
            return false;
        }
        lifecycle().takeFirst(new qcj() { // from class: l.cr30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.dr30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90355a.m44026e1(intent, i2, (C4470c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: l1 */
    public void m44033l1() {
        m43990R0();
        if (TextUtils.isEmpty(this.f27065i) || !this.f27065i.equals("from_notes")) {
            return;
        }
        CoreModule.m30933P().m143405a().mo34331Gq(act());
    }

    /* JADX INFO: renamed from: m1 */
    public void m44034m1() {
        if (CoreModule.m30933P().m143405a().mo34590sf()) {
            CoreModule.f18264c.f20406m1.m35736y4(null, true, false, true);
        } else {
            CoreModule.f18264c.f20406m1.m35735x4(null, true, false);
        }
        CoreModule.f18264c.f20406m1.m35712Z4();
        if (CoreModule.m30933P().m143410g().mo36058dh() && joa.m146361M3()) {
            CoreModule.f18264c.f20406m1.m35737y5();
        }
    }

    /* JADX INFO: renamed from: n1 */
    public void m44035n1(String str, String str2) {
        CoreModule.f18264c.f20406m1.m35709R4(str);
        CoreModule.m30934Q().startAudienceLive(act(), str2, "meet", null);
    }

    /* JADX INFO: renamed from: o1 */
    public void m44036o1(String str, String str2) {
        CoreModule.f18264c.f20406m1.m35709R4(str);
        CoreModule.m30934Q().mo68412M6().mo127345p(act(), str2, "meet", str, null);
    }

    /* JADX INFO: renamed from: p1 */
    public void m44037p1() {
        if (this.f27057a) {
            if (CoreModule.m30933P().m143405a().mo34590sf()) {
                CoreModule.f18264c.f20406m1.m35714e4(true);
            } else {
                CoreModule.f18264c.f20406m1.m35713d4();
            }
        }
    }
}
