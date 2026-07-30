package p153l;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LikedUser;
import com.p051p1.mobile.putong.core.data.LikedUserFilterSettings;
import com.p051p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p051p1.mobile.putong.core.p058ui.likedusers.LikedUserFrag;
import com.p051p1.mobile.putong.core.p058ui.likedusers.LikedUserItemView;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class fjr extends ar2<ijr> implements ihr.InterfaceC17721b {

    /* JADX INFO: renamed from: a */
    public Act f99413a;

    /* JADX INFO: renamed from: b */
    public LikedUserFrag f99414b;

    /* JADX INFO: renamed from: c */
    public LikedUserItemView f99415c;

    /* JADX INFO: renamed from: d */
    public LikedUser f99416d;

    /* JADX INFO: renamed from: e */
    public long f99417e;

    /* JADX INFO: renamed from: f */
    public Links f99418f;

    /* JADX INFO: renamed from: g */
    public boolean f99419g;

    /* JADX INFO: renamed from: h */
    public boolean f99420h;

    /* JADX INFO: renamed from: i */
    public int f99421i;

    /* JADX INFO: renamed from: j */
    public int f99422j;

    /* JADX INFO: renamed from: k */
    public LikedUserFilterSettings f99423k;

    /* JADX INFO: renamed from: l */
    public boolean f99424l;

    /* JADX INFO: renamed from: m */
    public nm0 f99425m;

    /* JADX INFO: renamed from: n */
    public Runnable f99426n;

    public fjr(LikedUserFrag likedUserFrag) {
        super(likedUserFrag);
        this.f99415c = null;
        this.f99416d = null;
        this.f99418f = null;
        this.f99419g = false;
        this.f99422j = 0;
        this.f99423k = CoreModule.f18264c.f20367Z0.f194015V.get().mo225055clone();
        this.f99424l = false;
        this.f99426n = new Runnable() { // from class: l.lir
            @Override // java.lang.Runnable
            public final void run() {
                this.f132245a.m125871R0();
            }
        };
        this.f99413a = likedUserFrag.act();
        this.f99414b = likedUserFrag;
    }

    /* JADX INFO: renamed from: G0 */
    private void m125868G0() {
        CoreModule.f18264c.f20367Z0.m210791y3();
        m125906Y0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public /* synthetic */ void m125869J0() {
        if (this.f99420h) {
            return;
        }
        if (rs9.m182935d() && this.f99419g) {
            return;
        }
        m125912f1("p_navigation_ilike,card_button_pull");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m125870L0(Bundle bundle) {
        ((ijr) this.viewModel).m140229k(new x20() { // from class: l.oir
            @Override // p153l.x20
            public final void call() {
                this.f147573a.m125869J0();
            }
        });
        ((ijr) this.viewModel).m140234q();
        ((ijr) this.viewModel).m140228j(true, false);
        ((ijr) this.viewModel).m140227i();
        if (rs9.m182935d()) {
            ((ijr) this.viewModel).m140226f();
            this.f99425m = new nm0();
            m125908b1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public /* synthetic */ void m125871R0() {
        LikedUserFilterSettings likedUserFilterSettings = this.f99423k;
        if (likedUserFilterSettings == null) {
            return;
        }
        sfj0.m185600g("e_iliked_age", "p_who_i_liked", sfj0.C20032a.m185615h("iliked_filter_min_age", String.valueOf(likedUserFilterSettings.minAge)), sfj0.C20032a.m185615h("iliked_filter_max_age", String.valueOf(this.f99423k.maxAge)));
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m125872e0() {
        if (e7d0.m119697f()) {
            e7d0.m119695c().m119699g("my_like");
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ Boolean m125873f0(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM);
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ C22421c m125878k0(final PaymentResultWrapper paymentResultWrapper) {
        return paymentResultWrapper.fromSign ? C22421c.just(paymentResultWrapper) : CoreModule.f18264c.f20297C0.m146427y3().distinctUntilChanged().skip(1).take(1).map(new qcj() { // from class: l.qir
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return fjr.m125889x0(paymentResultWrapper, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m125884q0(Throwable th) {
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ PaymentResultWrapper m125889x0(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m125891z0(Throwable th) {
    }

    @Override // p153l.ihr.InterfaceC17721b
    /* JADX INFO: renamed from: D */
    public void mo109928D(LikedUser likedUser, boolean z) {
        this.f99416d = likedUser;
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(likedUser.f21174id);
        if (z) {
            if (m125910d1(TEnum.equals(likedUser.status, "superliked"), likedUser, userM116503Pa, false)) {
                return;
            }
            this.f99414b.m47965Q4().notifyDataSetChanged();
        } else if (joa.m146386f4()) {
            CoreModule.m30933P().m143405a().mo34575qm(this.f99413a, "p_navigation_ilike,card_button_pull", Privilege.liked_user, null);
            this.f99414b.m47965Q4().notifyDataSetChanged();
        } else {
            if (CoreMemberModule.m37004F().m187693b().mo36986be(this.f99413a, this.f99414b, false, false, false, 0, userM116503Pa.picture(0).cover().profileMiddle().formatted(), "", userM116503Pa, likedUser)) {
                return;
            }
            this.f99414b.m47965Q4().notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m125892D0() {
        return ((ijr) this.viewModel).f115273s.size() == 0;
    }

    /* JADX INFO: renamed from: E0 */
    public final String m125893E0(Intent intent) {
        String stringExtra = intent.getStringExtra(CoreModule.f18273l.m143405a().mo34509gl());
        String stringExtra2 = intent.getStringExtra(CoreModule.f18273l.m143405a().mo34360L8());
        String str = this.f99416d.f21174id;
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2) || !stringExtra.equals(str)) {
            return null;
        }
        return stringExtra2;
    }

    /* JADX INFO: renamed from: F0 */
    public boolean m125894F0(User user) {
        return CoreModule.f18264c.f20367Z0.m210763F3(user.f56859id) == null;
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m125895H0(PaymentResultWrapper paymentResultWrapper) {
        boolean z = !joa.m146386f4();
        this.f99420h = z;
        ((ijr) this.viewModel).m140232n(z);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m125896I0(vg60 vg60Var) {
        int i;
        if (vg60Var != null && ((vg60Var.f184001a.isEmpty() && vg60Var.m201222d() > 0) || ((i = this.f99421i) > 1 && i >= vg60Var.f184001a.size()))) {
            this.f99419g = false;
            return;
        }
        int iM201222d = vg60Var == null ? 0 : vg60Var.m201222d();
        this.f99422j = iM201222d;
        if (iM201222d > 0) {
            this.f99419g = true;
        }
        if (((vg60Var == null || jyb.m147479J(vg60Var.f184001a)) ? 0 : vg60Var.f184001a.size()) >= this.f99422j) {
            this.f99419g = false;
        }
        ((ijr) this.viewModel).m140235s(vg60Var, this.f99420h);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m125897N0(NetworkInfo networkInfo) {
        if (CoreModule.f18264c.f20367Z0.m210765H3()) {
            return;
        }
        if (CoreModule.f18264c.f20367Z0.m210780W3() == 0) {
            CoreModule.f18264c.f20367Z0.m210784a4().subscribe(psd0.m173591B());
        } else {
            m125868G0();
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m125898O0(Settings settings) {
        this.f99418f = null;
        this.f99419g = false;
        CoreModule.f18264c.f20429u0.m31455l5();
        m125905X0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m125899P0(pf60 pf60Var) {
        this.f99425m.m163798i((Links) pf60Var.f152156a);
        this.f99425m.m163799j((List) pf60Var.f152157b);
        ((ijr) this.viewModel).m140233p(this.f99425m.m163791b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m125900Q0(pf60 pf60Var) {
        this.f99425m.m163798i((Links) pf60Var.f152156a);
        this.f99425m.m163800k((List) pf60Var.f152157b);
        if (this.f99425m.m163793d()) {
            ((ijr) this.viewModel).m140233p(this.f99425m.m163791b());
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m125901S0(int i, Intent intent, C4470c c4470c) {
        if (NullChecker.m82486a(this.f99415c) && NullChecker.m82486a(this.f99416d)) {
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f99416d.f21174id);
            int intExtra = 0;
            boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
            SwipeDirection swipeDirection = SwipeDirection.UP;
            boolean z2 = i == swipeDirection.getValue();
            String stringExtra = userM116503Pa.pictures.get(0).url;
            if (NullChecker.m82486a(intent)) {
                intExtra = intent.getIntExtra(CoreMemberModule.m37004F().m187693b().mo36988bo(), 0);
                stringExtra = intent.getStringExtra(CoreMemberModule.m37004F().m187693b().mo36990ch());
            }
            String str = stringExtra;
            int i2 = intExtra;
            String strM125893E0 = (z2 && i == swipeDirection.getValue() && NullChecker.m82486a(intent)) ? m125893E0(intent) : null;
            if (!TextUtils.isEmpty(strM125893E0)) {
                i4g0.m138520r("e_iliked_letter", this.f99413a.pageId());
            }
            CoreMemberModule.m37004F().m187693b().mo36986be(this.f99413a, this.f99414b, z, z2, true, i2, str, strM125893E0, userM116503Pa, this.f99416d);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m125902U0(Boolean bool) {
        this.f99424l = false;
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m125903V0(boolean z, User user, String str) {
        CoreMemberModule.m37004F().m187693b().mo36986be(this.f99413a, this.f99414b, true, true, z, 0, user.picture(0).cover().url, str, user, this.f99416d);
    }

    /* JADX INFO: renamed from: W0 */
    public final boolean m125904W0() {
        return !CoreModule.m30932N().mo61451Co();
    }

    /* JADX INFO: renamed from: X0 */
    public void m125905X0() {
        m125906Y0(false);
    }

    /* JADX INFO: renamed from: Y0 */
    public void m125906Y0(boolean z) {
        this.f99421i = z ? 1 : 1 + this.f99414b.m47965Q4().m97902U();
        CoreModule.f18264c.f20367Z0.m210792z3();
        CoreModule.f18264c.f20367Z0.m210782Y3(this.f99421i, 20, false);
        this.f99417e = SystemClock.elapsedRealtime();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f99420h = !joa.m146386f4();
        if (CoreModule.m30933P().m143405a().mo34436Vf()) {
            return;
        }
        m125868G0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.iir
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115118a.m125870L0((Bundle) obj);
            }
        }, new x20() { // from class: l.yir
            @Override // p153l.x20
            public final void call() {
                fjr.m125872e0();
            }
        });
        duringCreated(ConnectivityReceiver.m82473m()).skip(1).filter(new qcj() { // from class: l.zir
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.ajr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71856a.m125897N0((NetworkInfo) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).map(new qcj() { // from class: l.bjr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).settings;
            }
        }).distinctUntilChanged(new cjr()).skip(1).doOnNext(new y20() { // from class: l.djr
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20429u0.m31458m5();
            }
        }).delay(1L, TimeUnit.SECONDS).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.ejr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94317a.m125898O0((Settings) obj);
            }
        }));
        duringCreated(CoreModule.m30933P().m143410g().mo36025On()).filter(new qcj() { // from class: l.jir
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return fjr.m125873f0((PaymentResultWrapper) obj);
            }
        }).switchMap(new qcj() { // from class: l.kir
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return fjr.m125878k0((PaymentResultWrapper) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.tir
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174498a.m125895H0((PaymentResultWrapper) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20367Z0.m210781X3()).subscribe(psd0.m173596G(new y20() { // from class: l.xir
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194492a.m125896I0((vg60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1 */
    public void m125907a1() {
        nm0 nm0Var = this.f99425m;
        if (nm0Var == null || !nm0Var.m163794e()) {
            return;
        }
        nm0 nm0Var2 = this.f99425m;
        duringCreated(nm0Var2.m163796g(nm0Var2.m163792c().next)).subscribe(psd0.m173597H(new y20() { // from class: l.vir
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184298a.m125899P0((pf60) obj);
            }
        }, new y20() { // from class: l.wir
            @Override // p153l.y20
            public final void call(Object obj) {
                fjr.m125884q0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b1 */
    public void m125908b1() {
        nm0 nm0Var = this.f99425m;
        if (nm0Var == null) {
            return;
        }
        duringCreated(nm0Var.m163797h()).subscribe(psd0.m173597H(new y20() { // from class: l.rir
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163386a.m125900Q0((pf60) obj);
            }
        }, new y20() { // from class: l.sir
            @Override // p153l.y20
            public final void call(Object obj) {
                fjr.m125891z0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c1 */
    public boolean m125909c1(int i, final int i2, final Intent intent) {
        if (i != CoreModule.f18273l.m143405a().mo34302Ck()) {
            if (i != 786) {
                return false;
            }
            CoreMemberModule.m37004F().m187693b().mo36975Jb(act(), i2, intent);
            return true;
        }
        if (i2 != SwipeDirection.RIGHT.getValue() && i2 != SwipeDirection.LEFT.getValue() && i2 != SwipeDirection.UP.getValue()) {
            return false;
        }
        lifecycle().takeFirst(new qcj() { // from class: l.mir
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.nir
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142151a.m125901S0(i2, intent, (C4470c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: d1 */
    public boolean m125910d1(boolean z, LikedUser likedUser, User user, boolean z2) {
        if (((ijr) this.viewModel).f115273s.size() > 0) {
            return false;
        }
        this.f99416d = likedUser;
        if (z && !m125904W0()) {
            return false;
        }
        if (!z || TEnum.equals(likedUser.status, "lettered")) {
            i4g0.m138520r("e_iliked_superlike", this.f99413a.pageId());
            sfj0.m185596c(MatchScData.ModuleId.mid_e_superlikeButton, this.f99413a.pageId(), sfj0.C20032a.m185615h("moments_user_id", user.f56859id), sfj0.C20032a.m185616i("is_privileged", !joa.m146386f4()), sfj0.C20032a.m185615h("showfrom_superlike", "ilike"));
            return CoreMemberModule.m37004F().m187693b().mo36986be(this.f99413a, this.f99414b, true, true, z2, 0, user.picture(0).cover().url, null, user, this.f99416d);
        }
        CoreMemberModule.m37004F().m187693b().mo36973Bi(user);
        i4g0.m138520r("e_iliked_letter", this.f99413a.pageId());
        if (joa.m146386f4()) {
            CoreModule.m30933P().m143405a().mo34575qm(this.f99413a, "p_navigation_ilike,card_button_pull", Privilege.liked_user, null);
            return false;
        }
        m125913g1(user, z2);
        return false;
    }

    /* JADX INFO: renamed from: e1 */
    public void m125911e1(LikedUser likedUser) {
        if (this.f99414b.m47965Q4().m97900S(likedUser)) {
            CoreModule.f18264c.f20367Z0.m210787d4(likedUser.f21174id);
            this.f99422j--;
            if (this.f99414b.m47965Q4().m97902U() <= 0) {
                ((ijr) this.viewModel).m140228j(false, this.f99414b.m47965Q4().m97902U() <= 0);
                boolean zMo34436Vf = CoreModule.m30933P().m143405a().mo34436Vf();
                V v2 = this.viewModel;
                if (zMo34436Vf) {
                    ((ijr) v2).m140238w(!this.f99420h);
                } else {
                    ((ijr) v2).m140238w(false);
                }
            }
        }
        Act act = this.f99413a;
        int i = R$string.f21435w;
        int i2 = this.f99422j;
        ((ijr) this.viewModel).m140236u(act.getString(i, i2 > 99 ? "99+" : String.valueOf(i2)));
    }

    /* JADX INFO: renamed from: f1 */
    public void m125912f1(String str) {
        if (this.f99424l) {
            return;
        }
        this.f99424l = true;
        CoreModule.m30933P().m143405a().mo34365Lf(this.f99413a, str, Privilege.liked_user, null, new y20() { // from class: l.uir
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179142a.m125902U0((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g1 */
    public final void m125913g1(final User user, final boolean z) {
        y20<String> y20Var = new y20() { // from class: l.pir
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152599a.m125903V0(z, user, (String) obj);
            }
        };
        if (joa.m146355E3()) {
            CoreModule.m30933P().m143405a().mo34374Mp(act(), user, y20Var, true);
        } else if (CoreModule.m30933P().m143410g().mo36032S9()) {
            CoreModule.m30933P().m143405a().mo34374Mp(act(), user, y20Var, true);
        } else {
            CoreModule.m30933P().m143410g().mo36074ot(act(), "p_navigation_ilike,card_button_pull");
        }
    }

    public void onResume() {
        if (CoreModule.m30933P().m143405a().mo34436Vf()) {
            m125868G0();
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
