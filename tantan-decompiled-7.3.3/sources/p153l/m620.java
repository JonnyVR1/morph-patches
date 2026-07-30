package p153l;

import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedLikersItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedNearbyItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedUserItemData;
import com.p051p1.mobile.putong.core.data.FeedType;
import com.p051p1.mobile.putong.core.data.MyMeetFeedItem;
import com.p051p1.mobile.putong.core.data.MyMeetSeeReminder;
import com.p051p1.mobile.putong.core.data.MyTabTask;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes11.dex */
public class m620 extends p520<p620> {

    /* JADX INFO: renamed from: a */
    public Frag f134961a;

    /* JADX INFO: renamed from: b */
    public oby f134962b;

    /* JADX INFO: renamed from: c */
    public final C22507a<bkj0<Boolean, Boolean, Boolean>> f134963c;

    public m620(ner nerVar) {
        super(nerVar);
        this.f134963c = C22507a.m222758b();
        this.f134961a = (Frag) nerVar;
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ pf60 m157136A0(vg60 vg60Var) {
        return NullChecker.m82486a(vg60Var) ? pf60.m172085a(Integer.valueOf(vg60Var.m201222d()), vg60Var.f184001a) : pf60.m172085a(0, new ArrayList());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ Boolean m157139E0(String str, User user, User user2) {
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

    /* JADX INFO: renamed from: F0 */
    private void m157140F0() {
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
        CoreModule.f18264c.f20381e0.m116440A7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m157141I0() {
        ((p620) this.viewModel).m170723q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public /* synthetic */ void m157142J0() {
        ((p620) this.viewModel).m170724s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m157143L0() {
        ((p620) this.viewModel).m170720m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public /* synthetic */ void m157144N0() {
        ((p620) this.viewModel).m170722p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public /* synthetic */ void m157145O0() {
        ((p620) this.viewModel).m170721n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public /* synthetic */ void m157146Q0(Boolean bool) {
        ((p620) this.viewModel).m170719l(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public C22421c<pf60<Integer, List<User>>> m157147U0(boolean z) {
        return z ? CoreModule.f18264c.f20429u0.m31405N6().map(new qcj() { // from class: l.v520
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return m620.m157136A0((vg60) obj);
            }
        }) : CoreModule.f18264c.f20429u0.m31421V6();
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ MyTabTask m157163y0(List list) {
        return (MyTabTask) jyb.m147529r(list, new qcj() { // from class: l.u520
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((MyTabTask) obj).exposed);
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    public Frag m157165G0() {
        return this.f134961a;
    }

    /* JADX INFO: renamed from: H0 */
    public dzl m157166H0() {
        if (this.f134962b == null) {
            oby obyVar = new oby(act());
            this.f134962b = obyVar;
            obyVar.m167069l(true);
        }
        return this.f134962b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [B, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r8v5, types: [C, java.lang.Boolean] */
    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m157167P0(bkj0 bkj0Var) {
        A a = bkj0Var.f77081a;
        List list = (List) ((pf60) a).f152157b;
        int iIntValue = ((Integer) ((pf60) a).f152156a).intValue();
        if (!jyb.m147479J(list) && CoreModule.m30933P().m143405a().mo34457Yp()) {
            MyMeetSeeReminder myMeetSeeReminderM35734w4 = CoreModule.f18264c.f20406m1.m35734w4();
            if (!NullChecker.m82486a(myMeetSeeReminderM35734w4) || jyb.m147479J(myMeetSeeReminderM35734w4.userIds)) {
                jyb.m147537z(list, new y20() { // from class: l.x520
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ((User) obj).localSeeReminderType = "";
                    }
                });
            } else {
                final String str = myMeetSeeReminderM35734w4.userIds.get(0);
                final User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str);
                User user = (User) jyb.m147533v(list, new qcj() { // from class: l.w520
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return m620.m157139E0(str, userM116503Pa, (User) obj);
                    }
                }, 4);
                if (user != null) {
                    user.localSeeReminderType = myMeetSeeReminderM35734w4.reminderType.toString();
                } else if (NullChecker.m82486a(userM116503Pa)) {
                    userM116503Pa.localSeeReminderType = myMeetSeeReminderM35734w4.reminderType.toString();
                    list.add(0, userM116503Pa);
                }
            }
        }
        ((p620) this.viewModel).m170716i(new MeetFeedLikersItemData(iIntValue, list, ((Integer) bkj0Var.f77082b).intValue()), m157166H0());
        if (CoreModule.m30933P().m143410g().mo36007D9()) {
            ((p620) this.viewModel).m170717j(new MeetFeedNearbyItemData(((vg60) bkj0Var.f77083c).f184001a));
        }
        bkj0<Boolean, Boolean, Boolean> bkj0VarM222761e = this.f134963c.m222761e();
        if (bkj0VarM222761e == null) {
            bkj0VarM222761e = bkj0.m104818a(Boolean.FALSE, Boolean.valueOf(iIntValue == 0), Boolean.valueOf(jyb.m147479J(((vg60) bkj0Var.f77083c).f184001a)));
        } else {
            bkj0VarM222761e.f77082b = Boolean.valueOf(iIntValue == 0);
            bkj0VarM222761e.f77083c = Boolean.valueOf(jyb.m147479J(((vg60) bkj0Var.f77083c).f184001a));
        }
        this.f134963c.m137019l(bkj0VarM222761e);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [A, java.lang.Boolean] */
    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m157168R0(MyTabTask myTabTask) {
        ((p620) this.viewModel).m170718k(myTabTask);
        bkj0<Boolean, Boolean, Boolean> bkj0VarM222761e = this.f134963c.m222761e();
        if (bkj0VarM222761e == null) {
            Boolean boolValueOf = Boolean.valueOf(myTabTask == null);
            Boolean bool = Boolean.FALSE;
            bkj0VarM222761e = bkj0.m104818a(boolValueOf, bool, bool);
        } else {
            bkj0VarM222761e.f77081a = Boolean.valueOf(myTabTask == null);
        }
        this.f134963c.m137019l(bkj0VarM222761e);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m157169S0(Intent intent, int i, C4470c c4470c) {
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
                m157166H0().mo118749d(new MeetFeedUserItemData(userM116503Pa, myMeetFeedItemNew_), z, z2, false, str);
            }
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        lifecycle().filter(new qcj() { // from class: l.e620
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.g620
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20381e0.m116440A7();
            }
        }));
        duringCreated(CoreModule.f18264c.f20294B0.m32614j4().distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.h620
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20381e0.m116440A7();
            }
        }));
        duringCreated(this.f134963c.map(new qcj() { // from class: l.i620
            @Override // p153l.qcj
            public final Object call(Object obj) {
                bkj0 bkj0Var = (bkj0) obj;
                return Boolean.valueOf(((Boolean) bkj0Var.f77081a).booleanValue() && ((Boolean) bkj0Var.f77082b).booleanValue() && ((Boolean) bkj0Var.f77083c).booleanValue());
            }
        }).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.j620
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118514a.m157146Q0((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.f89253i7.map(new qcj() { // from class: l.k620
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return m620.m157163y0((List) obj);
            }
        }).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.l620
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130222a.m157168R0((MyTabTask) obj);
            }
        }));
        duringCreated(psd0.m173626s(CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip")).map(new qcj() { // from class: l.r520
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(joa.m146361M3());
            }
        }).distinctUntilChanged().switchMap(new qcj() { // from class: l.s520
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f166309a.m157147U0(((Boolean) obj).booleanValue());
            }
        }), CoreModule.f18264c.f20429u0.m31488w5(), CoreModule.f18264c.f20407m2.m123961K3(), new scj() { // from class: l.t520
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return bkj0.m104818a((pf60) obj, (Integer) obj2, (vg60) obj3);
            }
        })).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.f620
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97372a.m157167P0((bkj0) obj);
            }
        }));
    }

    @Override // p153l.p520
    /* JADX INFO: renamed from: e0 */
    public Collection<? extends pf60<String, x20>> mo157170e0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(jyb.m147494Y("task verify 1", new x20() { // from class: l.y520
            @Override // p153l.x20
            public final void call() {
                this.f197527a.m157141I0();
            }
        }));
        arrayList.add(jyb.m147494Y("task verify 2", new x20() { // from class: l.z520
            @Override // p153l.x20
            public final void call() {
                this.f203000a.m157142J0();
            }
        }));
        arrayList.add(jyb.m147494Y("task boost", new x20() { // from class: l.a620
            @Override // p153l.x20
            public final void call() {
                this.f68660a.m157143L0();
            }
        }));
        arrayList.add(jyb.m147494Y("task mbti", new x20() { // from class: l.c620
            @Override // p153l.x20
            public final void call() {
                this.f79925a.m157144N0();
            }
        }));
        arrayList.add(jyb.m147494Y("task game", new x20() { // from class: l.d620
            @Override // p153l.x20
            public final void call() {
                this.f85251a.m157145O0();
            }
        }));
        return arrayList;
    }

    @Override // p153l.p520
    /* JADX INFO: renamed from: f0 */
    public void mo157171f0(int i, final int i2, final Intent intent) {
        if (i == CoreModule.m30933P().m143405a().mo34580re()) {
            if (i2 == SwipeDirection.RIGHT.getValue() || i2 == SwipeDirection.LEFT.getValue() || i2 == SwipeDirection.UP.getValue()) {
                lifecycle().takeFirst(new qcj() { // from class: l.q520
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
                    }
                }).subscribe(psd0.m173596G(new y20() { // from class: l.b620
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f75124a.m157169S0(intent, i2, (C4470c) obj);
                    }
                }));
            }
        }
    }

    @Override // p153l.p520
    /* JADX INFO: renamed from: g0 */
    public void mo157172g0(boolean z) {
        if (z) {
            return;
        }
        m157140F0();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
