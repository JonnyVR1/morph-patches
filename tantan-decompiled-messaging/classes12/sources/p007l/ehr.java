package p007l;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.likedusers.LikedUserFrag;
import com.p000p1.mobile.putong.core.p001ui.likedusers.LikedUserItemView;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.MatchScData;
import com.p000p1.mobile.putong.data.RelationshipStatus;
import com.p000p1.mobile.putong.data.Settings;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.LikedUser;
import com.p1.mobile.putong.core.data.LikedUserFilterSettings;
import com.p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.core.member.module.CoreMemberModule;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.bzc0;
import l.d30;
import l.e30;
import l.gr9;
import l.j760;
import l.jo0;
import l.jq2;
import l.mkd0;
import l.o6j0;
import l.q860;
import l.s7m;
import l.vwb;
import l.w9j;
import l.x9j;
import l.xma;
import l.zvf0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ehr extends jq2<hhr> implements hfr.InterfaceC2393b {

    /* JADX INFO: renamed from: a */
    public Act f7377a;

    /* JADX INFO: renamed from: b */
    public LikedUserFrag f7378b;

    /* JADX INFO: renamed from: c */
    public LikedUserItemView f7379c;

    /* JADX INFO: renamed from: d */
    public LikedUser f7380d;

    /* JADX INFO: renamed from: e */
    public long f7381e;

    /* JADX INFO: renamed from: f */
    public Links f7382f;

    /* JADX INFO: renamed from: g */
    public boolean f7383g;

    /* JADX INFO: renamed from: h */
    public boolean f7384h;

    /* JADX INFO: renamed from: i */
    public int f7385i;

    /* JADX INFO: renamed from: j */
    public int f7386j;

    /* JADX INFO: renamed from: k */
    public LikedUserFilterSettings f7387k;

    /* JADX INFO: renamed from: l */
    public boolean f7388l;

    /* JADX INFO: renamed from: m */
    public rm0 f7389m;

    /* JADX INFO: renamed from: n */
    public Runnable f7390n;

    public ehr(LikedUserFrag likedUserFrag) {
        super(likedUserFrag);
        this.f7379c = null;
        this.f7380d = null;
        this.f7382f = null;
        this.f7383g = false;
        this.f7386j = 0;
        this.f7387k = ((LikedUserFilterSettings) CoreModule.c.Z0.V.get()).clone();
        this.f7388l = false;
        this.f7390n = new Runnable() { // from class: l.kgr
            @Override // java.lang.Runnable
            public final void run() {
                this.f9715a.m9846R0();
            }
        };
        this.f7377a = likedUserFrag.act();
        this.f7378b = likedUserFrag;
    }

    /* JADX INFO: renamed from: G0 */
    private void m9843G0() {
        CoreModule.c.Z0.y3();
        m9881Y0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public /* synthetic */ void m9844J0() {
        if (this.f7384h) {
            return;
        }
        if (gr9.d() && this.f7383g) {
            return;
        }
        m9889f1("p_navigation_ilike,card_button_pull");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m9845L0(Bundle bundle) {
        ((hhr) ((jq2) this).viewModel).m10635k(new d30() { // from class: l.ngr
            public final void call() {
                this.f10801a.m9844J0();
            }
        });
        ((hhr) ((jq2) this).viewModel).m10640q();
        ((hhr) ((jq2) this).viewModel).m10634j(true, false);
        ((hhr) ((jq2) this).viewModel).m10632i();
        if (gr9.d()) {
            ((hhr) ((jq2) this).viewModel).m10631f();
            this.f7389m = new rm0();
            m9885b1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public /* synthetic */ void m9846R0() {
        LikedUserFilterSettings likedUserFilterSettings = this.f7387k;
        if (likedUserFilterSettings == null) {
            return;
        }
        o6j0.g("e_iliked_age", "p_who_i_liked", new o6j0.a[]{o6j0.a.h("iliked_filter_min_age", String.valueOf(likedUserFilterSettings.minAge)), o6j0.a.h("iliked_filter_max_age", String.valueOf(this.f7387k.maxAge))});
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m9847e0() {
        if (bzc0.f()) {
            bzc0.c().g("my_like");
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ Boolean m9848f0(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM);
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ c m9853k0(final PaymentResultWrapper paymentResultWrapper) {
        return paymentResultWrapper.fromSign ? c.just(paymentResultWrapper) : CoreModule.c.C0.x3().distinctUntilChanged().skip(1).take(1).map(new w9j() { // from class: l.pgr
            public final Object call(Object obj) {
                return ehr.m9864x0(paymentResultWrapper, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m9859q0(Throwable th) {
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ PaymentResultWrapper m9864x0(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m9866z0(Throwable th) {
    }

    @Override // p007l.hfr.InterfaceC2393b
    /* JADX INFO: renamed from: D */
    public void mo8876D(LikedUser likedUser, boolean z) {
        this.f7380d = likedUser;
        User userPa = CoreModule.c.e0.Pa(likedUser.id);
        if (z) {
            if (m9887d1(TEnum.equals(likedUser.status, RelationshipStatus.superliked), likedUser, userPa, false)) {
                return;
            }
            this.f7378b.m454Q4().notifyDataSetChanged();
        } else if (xma.e4()) {
            CoreModule.P().a().qm(this.f7377a, "p_navigation_ilike,card_button_pull", Privilege.liked_user, (e30) null);
            this.f7378b.m454Q4().notifyDataSetChanged();
        } else {
            if (CoreMemberModule.F().b().be(this.f7377a, this.f7378b, false, false, false, 0, userPa.picture(0).cover().profileMiddle().formatted(), "", userPa, likedUser)) {
                return;
            }
            this.f7378b.m454Q4().notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m9867D0() {
        return ((hhr) ((jq2) this).viewModel).f8741s.size() == 0;
    }

    /* JADX INFO: renamed from: E0 */
    public final String m9868E0(Intent intent) {
        String stringExtra = intent.getStringExtra(CoreModule.l.a().gl());
        String stringExtra2 = intent.getStringExtra(CoreModule.l.a().L8());
        String str = this.f7380d.id;
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2) || !stringExtra.equals(str)) {
            return null;
        }
        return stringExtra2;
    }

    /* JADX INFO: renamed from: F0 */
    public boolean m9869F0(User user) {
        return CoreModule.c.Z0.F3(((DbObject) user).id) == null;
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m9870H0(PaymentResultWrapper paymentResultWrapper) {
        boolean z = !xma.e4();
        this.f7384h = z;
        ((hhr) ((jq2) this).viewModel).m10638n(z);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m9871I0(q860 q860Var) {
        int i;
        if (q860Var != null && ((q860Var.a.isEmpty() && q860Var.d() > 0) || ((i = this.f7385i) > 1 && i >= q860Var.a.size()))) {
            this.f7383g = false;
            return;
        }
        int iD = q860Var == null ? 0 : q860Var.d();
        this.f7386j = iD;
        if (iD > 0) {
            this.f7383g = true;
        }
        if (((q860Var == null || vwb.J(q860Var.a)) ? 0 : q860Var.a.size()) >= this.f7386j) {
            this.f7383g = false;
        }
        ((hhr) ((jq2) this).viewModel).m10641s(q860Var, this.f7384h);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m9872N0(NetworkInfo networkInfo) {
        if (CoreModule.c.Z0.H3()) {
            return;
        }
        if (CoreModule.c.Z0.W3() == 0) {
            CoreModule.c.Z0.a4().subscribe(mkd0.B());
        } else {
            m9843G0();
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m9873O0(Settings settings) {
        this.f7382f = null;
        this.f7383g = false;
        CoreModule.c.u0.l5();
        m9880X0();
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m9874P0(j760 j760Var) {
        this.f7389m.m13913i((Links) j760Var.a);
        this.f7389m.m13914j((List) j760Var.b);
        ((hhr) ((jq2) this).viewModel).m10639p(this.f7389m.m13906b());
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m9875Q0(j760 j760Var) {
        this.f7389m.m13913i((Links) j760Var.a);
        this.f7389m.m13915k((List) j760Var.b);
        if (this.f7389m.m13908d()) {
            ((hhr) ((jq2) this).viewModel).m10639p(this.f7389m.m13906b());
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m9876S0(int i, Intent intent, com.p1.mobile.android.app.c cVar) {
        if (NullChecker.a(this.f7379c) && NullChecker.a(this.f7380d)) {
            User userPa = CoreModule.c.e0.Pa(this.f7380d.id);
            int intExtra = 0;
            boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
            SwipeDirection swipeDirection = SwipeDirection.UP;
            boolean z2 = i == swipeDirection.getValue();
            String stringExtra = userPa.pictures.get(0).url;
            if (NullChecker.a(intent)) {
                intExtra = intent.getIntExtra(CoreMemberModule.F().b().bo(), 0);
                stringExtra = intent.getStringExtra(CoreMemberModule.F().b().ch());
            }
            String str = stringExtra;
            int i2 = intExtra;
            String strM9868E0 = (z2 && i == swipeDirection.getValue() && NullChecker.a(intent)) ? m9868E0(intent) : null;
            if (!TextUtils.isEmpty(strM9868E0)) {
                zvf0.r("e_iliked_letter", this.f7377a.pageId());
            }
            CoreMemberModule.F().b().be(this.f7377a, this.f7378b, z, z2, true, i2, str, strM9868E0, userPa, this.f7380d);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m9877U0(Boolean bool) {
        this.f7388l = false;
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m9878V0(boolean z, User user, String str) {
        CoreMemberModule.F().b().be(this.f7377a, this.f7378b, true, true, z, 0, user.picture(0).cover().url, str, user, this.f7380d);
    }

    /* JADX INFO: renamed from: W0 */
    public final boolean m9879W0() {
        return !CoreModule.N().mo1193Co();
    }

    /* JADX INFO: renamed from: X0 */
    public void m9880X0() {
        m9881Y0(false);
    }

    /* JADX INFO: renamed from: Y0 */
    public void m9881Y0(boolean z) {
        this.f7385i = z ? 1 : 1 + this.f7378b.m454Q4().m17390U();
        CoreModule.c.Z0.z3();
        CoreModule.c.Z0.Y3(this.f7385i, 20, false);
        this.f7381e = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: Z */
    public void m9882Z() {
        super.Z();
        this.f7384h = !xma.e4();
        if (CoreModule.P().a().Vf()) {
            return;
        }
        m9843G0();
    }

    /* JADX INFO: renamed from: a0 */
    public void m9883a0() {
        super.a0();
        creates(new e30() { // from class: l.hgr
            public final void call(Object obj) {
                this.f8716a.m9845L0((Bundle) obj);
            }
        }, new d30() { // from class: l.xgr
            public final void call() {
                ehr.m9847e0();
            }
        });
        duringCreated(ConnectivityReceiver.m()).skip(1).filter(new w9j() { // from class: l.ygr
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.zgr
            public final void call(Object obj) {
                this.f15735a.m9872N0((NetworkInfo) obj);
            }
        }));
        duringCreated(CoreModule.c.e0.o9()).map(new w9j() { // from class: l.ahr
            public final Object call(Object obj) {
                return ((User) obj).settings;
            }
        }).distinctUntilChanged(new x9j() { // from class: l.bhr
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(((Settings) obj).searchIntentEquals((Settings) obj2));
            }
        }).skip(1).doOnNext(new e30() { // from class: l.chr
            public final void call(Object obj) {
                CoreModule.c.u0.m5();
            }
        }).delay(1L, TimeUnit.SECONDS).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.dhr
            public final void call(Object obj) {
                this.f6944a.m9873O0((Settings) obj);
            }
        }));
        duringCreated(CoreModule.P().g().On()).filter(new w9j() { // from class: l.igr
            public final Object call(Object obj) {
                return ehr.m9848f0((PaymentResultWrapper) obj);
            }
        }).switchMap(new w9j() { // from class: l.jgr
            public final Object call(Object obj) {
                return ehr.m9853k0((PaymentResultWrapper) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.sgr
            public final void call(Object obj) {
                this.f12952a.m9870H0((PaymentResultWrapper) obj);
            }
        }));
        duringCreated(CoreModule.c.Z0.X3()).subscribe(mkd0.G(new e30() { // from class: l.wgr
            public final void call(Object obj) {
                this.f14543a.m9871I0((q860) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1 */
    public void m9884a1() {
        rm0 rm0Var = this.f7389m;
        if (rm0Var == null || !rm0Var.m13909e()) {
            return;
        }
        rm0 rm0Var2 = this.f7389m;
        duringCreated(rm0Var2.m13911g(rm0Var2.m13907c().next)).subscribe(mkd0.H(new e30() { // from class: l.ugr
            public final void call(Object obj) {
                this.f13833a.m9874P0((j760) obj);
            }
        }, new e30() { // from class: l.vgr
            public final void call(Object obj) {
                ehr.m9859q0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b1 */
    public void m9885b1() {
        rm0 rm0Var = this.f7389m;
        if (rm0Var == null) {
            return;
        }
        duringCreated(rm0Var.m13912h()).subscribe(mkd0.H(new e30() { // from class: l.qgr
            public final void call(Object obj) {
                this.f12236a.m9875Q0((j760) obj);
            }
        }, new e30() { // from class: l.rgr
            public final void call(Object obj) {
                ehr.m9866z0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c1 */
    public boolean m9886c1(int i, final int i2, final Intent intent) {
        if (i != CoreModule.l.a().Ck()) {
            if (i != 786) {
                return false;
            }
            CoreMemberModule.F().b().Jb(act(), i2, intent);
            return true;
        }
        if (i2 != SwipeDirection.RIGHT.getValue() && i2 != SwipeDirection.LEFT.getValue() && i2 != SwipeDirection.UP.getValue()) {
            return false;
        }
        lifecycle().takeFirst(new w9j() { // from class: l.lgr
            public final Object call(Object obj) {
                return Boolean.valueOf(((com.p1.mobile.android.app.c) obj) == com.p1.mobile.android.app.c.i);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.mgr
            public final void call(Object obj) {
                this.f10461a.m9876S0(i2, intent, (com.p1.mobile.android.app.c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: d1 */
    public boolean m9887d1(boolean z, LikedUser likedUser, User user, boolean z2) {
        if (((hhr) ((jq2) this).viewModel).f8741s.size() > 0) {
            return false;
        }
        this.f7380d = likedUser;
        if (z && !m9879W0()) {
            return false;
        }
        if (!z || TEnum.equals(likedUser.status, RelationshipStatus.lettered)) {
            zvf0.r("e_iliked_superlike", this.f7377a.pageId());
            o6j0.c(MatchScData.ModuleId.mid_e_superlikeButton, this.f7377a.pageId(), new o6j0.a[]{o6j0.a.h("moments_user_id", ((DbObject) user).id), o6j0.a.i("is_privileged", !xma.e4()), o6j0.a.h("showfrom_superlike", "ilike")});
            return CoreMemberModule.F().b().be(this.f7377a, this.f7378b, true, true, z2, 0, user.picture(0).cover().url, (String) null, user, this.f7380d);
        }
        CoreMemberModule.F().b().Bi(user);
        zvf0.r("e_iliked_letter", this.f7377a.pageId());
        if (xma.e4()) {
            CoreModule.P().a().qm(this.f7377a, "p_navigation_ilike,card_button_pull", Privilege.liked_user, (e30) null);
            return false;
        }
        m9890g1(user, z2);
        return false;
    }

    /* JADX INFO: renamed from: e1 */
    public void m9888e1(LikedUser likedUser) {
        if (this.f7378b.m454Q4().m17388S(likedUser)) {
            CoreModule.c.Z0.d4(likedUser.id);
            this.f7386j--;
            if (this.f7378b.m454Q4().m17390U() <= 0) {
                ((hhr) ((jq2) this).viewModel).m10634j(false, this.f7378b.m454Q4().m17390U() <= 0);
                boolean zVf = CoreModule.P().a().Vf();
                s7m s7mVar = ((jq2) this).viewModel;
                if (zVf) {
                    ((hhr) s7mVar).m10644w(!this.f7384h);
                } else {
                    ((hhr) s7mVar).m10644w(false);
                }
            }
        }
        Act act = this.f7377a;
        int i = R.string.w;
        int i2 = this.f7386j;
        ((hhr) ((jq2) this).viewModel).m10642u(act.getString(i, i2 > 99 ? "99+" : String.valueOf(i2)));
    }

    /* JADX INFO: renamed from: f1 */
    public void m9889f1(String str) {
        if (this.f7388l) {
            return;
        }
        this.f7388l = true;
        CoreModule.P().a().Lf(this.f7377a, str, Privilege.liked_user, (e30) null, new e30() { // from class: l.tgr
            public final void call(Object obj) {
                this.f13297a.m9877U0((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g1 */
    public final void m9890g1(final User user, final boolean z) {
        e30 e30Var = new e30() { // from class: l.ogr
            public final void call(Object obj) {
                this.f11477a.m9878V0(z, user, (String) obj);
            }
        };
        if (xma.D3()) {
            CoreModule.P().a().Mp(act(), user, e30Var, true);
        } else if (CoreModule.P().g().S9()) {
            CoreModule.P().a().Mp(act(), user, e30Var, true);
        } else {
            CoreModule.P().g().ot(act(), "p_navigation_ilike,card_button_pull");
        }
    }

    public void onResume() {
        if (CoreModule.P().a().Vf()) {
            m9843G0();
        }
    }

    public void destroy() {
    }
}
