package p149l;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LikedUser;
import com.p046p1.mobile.putong.core.data.LikedUserFilterSettings;
import com.p046p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p046p1.mobile.putong.core.p053ui.likedusers.LikedUserFrag;
import com.p046p1.mobile.putong.core.p053ui.likedusers.LikedUserItemView;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class ehr extends jq2<hhr> implements hfr.InterfaceC17302b {

    /* JADX INFO: renamed from: a */
    public Act f91372a;

    /* JADX INFO: renamed from: b */
    public LikedUserFrag f91373b;

    /* JADX INFO: renamed from: c */
    public LikedUserItemView f91374c;

    /* JADX INFO: renamed from: d */
    public LikedUser f91375d;

    /* JADX INFO: renamed from: e */
    public long f91376e;

    /* JADX INFO: renamed from: f */
    public Links f91377f;

    /* JADX INFO: renamed from: g */
    public boolean f91378g;

    /* JADX INFO: renamed from: h */
    public boolean f91379h;

    /* JADX INFO: renamed from: i */
    public int f91380i;

    /* JADX INFO: renamed from: j */
    public int f91381j;

    /* JADX INFO: renamed from: k */
    public LikedUserFilterSettings f91382k;

    /* JADX INFO: renamed from: l */
    public boolean f91383l;

    /* JADX INFO: renamed from: m */
    public rm0 f91384m;

    /* JADX INFO: renamed from: n */
    public Runnable f91385n;

    public ehr(LikedUserFrag likedUserFrag) {
        super(likedUserFrag);
        this.f91374c = null;
        this.f91375d = null;
        this.f91377f = null;
        this.f91378g = false;
        this.f91381j = 0;
        this.f91382k = CoreModule.f17545c.f19625Z0.f143294V.get().mo223809clone();
        this.f91383l = false;
        this.f91385n = new Runnable() { // from class: l.kgr
            @Override // java.lang.Runnable
            public final void run() {
                this.f123057a.m116516R0();
            }
        };
        this.f91372a = likedUserFrag.act();
        this.f91373b = likedUserFrag;
    }

    /* JADX INFO: renamed from: G0 */
    private void m116513G0() {
        CoreModule.f17545c.f19625Z0.m163933y3();
        m116551Y0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public /* synthetic */ void m116514J0() {
        if (this.f91379h) {
            return;
        }
        if (gr9.m127679d() && this.f91378g) {
            return;
        }
        m116557f1("p_navigation_ilike,card_button_pull");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m116515L0(Bundle bundle) {
        ((hhr) this.viewModel).m131138k(new d30() { // from class: l.ngr
            @Override // p149l.d30
            public final void call() {
                this.f138893a.m116514J0();
            }
        });
        ((hhr) this.viewModel).m131143q();
        ((hhr) this.viewModel).m131137j(true, false);
        ((hhr) this.viewModel).m131136i();
        if (gr9.m127679d()) {
            ((hhr) this.viewModel).m131135f();
            this.f91384m = new rm0();
            m116553b1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public /* synthetic */ void m116516R0() {
        LikedUserFilterSettings likedUserFilterSettings = this.f91382k;
        if (likedUserFilterSettings == null) {
            return;
        }
        o6j0.m162863g("e_iliked_age", "p_who_i_liked", o6j0.C18854a.m162878h("iliked_filter_min_age", String.valueOf(likedUserFilterSettings.minAge)), o6j0.C18854a.m162878h("iliked_filter_max_age", String.valueOf(this.f91382k.maxAge)));
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m116517e0() {
        if (bzc0.m104566f()) {
            bzc0.m104564c().m104568g("my_like");
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ Boolean m116518f0(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM);
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ C22306c m116523k0(final PaymentResultWrapper paymentResultWrapper) {
        return paymentResultWrapper.fromSign ? C22306c.just(paymentResultWrapper) : CoreModule.f17545c.f19555C0.m210114x3().distinctUntilChanged().skip(1).take(1).map(new w9j() { // from class: l.pgr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ehr.m116534x0(paymentResultWrapper, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m116529q0(Throwable th) {
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ PaymentResultWrapper m116534x0(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m116536z0(Throwable th) {
    }

    @Override // p149l.hfr.InterfaceC17302b
    /* JADX INFO: renamed from: D */
    public void mo101698D(LikedUser likedUser, boolean z) {
        this.f91375d = likedUser;
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(likedUser.f20432id);
        if (z) {
            if (m116555d1(TEnum.equals(likedUser.status, "superliked"), likedUser, userM169430Pa, false)) {
                return;
            }
            this.f91373b.m46782Q4().notifyDataSetChanged();
        } else if (xma.m210071e4()) {
            CoreModule.m29935P().m94651a().mo33572qm(this.f91372a, "p_navigation_ilike,card_button_pull", Privilege.liked_user, null);
            this.f91373b.m46782Q4().notifyDataSetChanged();
        } else {
            if (CoreMemberModule.m36001F().m132651b().mo35983be(this.f91372a, this.f91373b, false, false, false, 0, userM169430Pa.picture(0).cover().profileMiddle().formatted(), "", userM169430Pa, likedUser)) {
                return;
            }
            this.f91373b.m46782Q4().notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m116537D0() {
        return ((hhr) this.viewModel).f107821s.size() == 0;
    }

    /* JADX INFO: renamed from: E0 */
    public final String m116538E0(Intent intent) {
        String stringExtra = intent.getStringExtra(CoreModule.f17554l.m94651a().mo33506gl());
        String stringExtra2 = intent.getStringExtra(CoreModule.f17554l.m94651a().mo33357L8());
        String str = this.f91375d.f20432id;
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2) || !stringExtra.equals(str)) {
            return null;
        }
        return stringExtra2;
    }

    /* JADX INFO: renamed from: F0 */
    public boolean m116539F0(User user) {
        return CoreModule.f17545c.f19625Z0.m163905F3(user.f56011id) == null;
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m116540H0(PaymentResultWrapper paymentResultWrapper) {
        boolean z = !xma.m210071e4();
        this.f91379h = z;
        ((hhr) this.viewModel).m131141n(z);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m116541I0(q860 q860Var) {
        int i;
        if (q860Var != null && ((q860Var.f153135a.isEmpty() && q860Var.m173344d() > 0) || ((i = this.f91380i) > 1 && i >= q860Var.f153135a.size()))) {
            this.f91378g = false;
            return;
        }
        int iM173344d = q860Var == null ? 0 : q860Var.m173344d();
        this.f91381j = iM173344d;
        if (iM173344d > 0) {
            this.f91378g = true;
        }
        if (((q860Var == null || vwb.m200296J(q860Var.f153135a)) ? 0 : q860Var.f153135a.size()) >= this.f91381j) {
            this.f91378g = false;
        }
        ((hhr) this.viewModel).m131144s(q860Var, this.f91379h);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m116542N0(NetworkInfo networkInfo) {
        if (CoreModule.f17545c.f19625Z0.m163907H3()) {
            return;
        }
        if (CoreModule.f17545c.f19625Z0.m163922W3() == 0) {
            CoreModule.f17545c.f19625Z0.m163926a4().subscribe(mkd0.m154950B());
        } else {
            m116513G0();
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m116543O0(Settings settings) {
        this.f91377f = null;
        this.f91378g = false;
        CoreModule.f17545c.f19687u0.m30453l5();
        m116550X0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m116544P0(j760 j760Var) {
        this.f91384m.m179954i((Links) j760Var.f116564a);
        this.f91384m.m179955j((List) j760Var.f116565b);
        ((hhr) this.viewModel).m131142p(this.f91384m.m179947b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m116545Q0(j760 j760Var) {
        this.f91384m.m179954i((Links) j760Var.f116564a);
        this.f91384m.m179956k((List) j760Var.f116565b);
        if (this.f91384m.m179949d()) {
            ((hhr) this.viewModel).m131142p(this.f91384m.m179947b());
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m116546S0(int i, Intent intent, C4319c c4319c) {
        if (NullChecker.m81303a(this.f91374c) && NullChecker.m81303a(this.f91375d)) {
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f91375d.f20432id);
            int intExtra = 0;
            boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
            SwipeDirection swipeDirection = SwipeDirection.UP;
            boolean z2 = i == swipeDirection.getValue();
            String stringExtra = userM169430Pa.pictures.get(0).url;
            if (NullChecker.m81303a(intent)) {
                intExtra = intent.getIntExtra(CoreMemberModule.m36001F().m132651b().mo35985bo(), 0);
                stringExtra = intent.getStringExtra(CoreMemberModule.m36001F().m132651b().mo35987ch());
            }
            String str = stringExtra;
            int i2 = intExtra;
            String strM116538E0 = (z2 && i == swipeDirection.getValue() && NullChecker.m81303a(intent)) ? m116538E0(intent) : null;
            if (!TextUtils.isEmpty(strM116538E0)) {
                zvf0.m220396r("e_iliked_letter", this.f91372a.pageId());
            }
            CoreMemberModule.m36001F().m132651b().mo35983be(this.f91372a, this.f91373b, z, z2, true, i2, str, strM116538E0, userM169430Pa, this.f91375d);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m116547U0(Boolean bool) {
        this.f91383l = false;
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m116548V0(boolean z, User user, String str) {
        CoreMemberModule.m36001F().m132651b().mo35983be(this.f91372a, this.f91373b, true, true, z, 0, user.picture(0).cover().url, str, user, this.f91375d);
    }

    /* JADX INFO: renamed from: W0 */
    public final boolean m116549W0() {
        return !CoreModule.m29934N().mo60267Co();
    }

    /* JADX INFO: renamed from: X0 */
    public void m116550X0() {
        m116551Y0(false);
    }

    /* JADX INFO: renamed from: Y0 */
    public void m116551Y0(boolean z) {
        this.f91380i = z ? 1 : 1 + this.f91373b.m46782Q4().m218403U();
        CoreModule.f17545c.f19625Z0.m163934z3();
        CoreModule.f17545c.f19625Z0.m163924Y3(this.f91380i, 20, false);
        this.f91376e = SystemClock.elapsedRealtime();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f91379h = !xma.m210071e4();
        if (CoreModule.m29935P().m94651a().mo33433Vf()) {
            return;
        }
        m116513G0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.hgr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107643a.m116515L0((Bundle) obj);
            }
        }, new d30() { // from class: l.xgr
            @Override // p149l.d30
            public final void call() {
                ehr.m116517e0();
            }
        });
        duringCreated(ConnectivityReceiver.m81290m()).skip(1).filter(new w9j() { // from class: l.ygr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.zgr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203078a.m116542N0((NetworkInfo) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).map(new w9j() { // from class: l.ahr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).settings;
            }
        }).distinctUntilChanged(new bhr()).skip(1).doOnNext(new e30() { // from class: l.chr
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19687u0.m30456m5();
            }
        }).delay(1L, TimeUnit.SECONDS).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.dhr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86316a.m116543O0((Settings) obj);
            }
        }));
        duringCreated(CoreModule.m29935P().m94656g().mo35022On()).filter(new w9j() { // from class: l.igr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ehr.m116518f0((PaymentResultWrapper) obj);
            }
        }).switchMap(new w9j() { // from class: l.jgr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ehr.m116523k0((PaymentResultWrapper) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.sgr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164464a.m116540H0((PaymentResultWrapper) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19625Z0.m163923X3()).subscribe(mkd0.m154955G(new e30() { // from class: l.wgr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186214a.m116541I0((q860) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1 */
    public void m116552a1() {
        rm0 rm0Var = this.f91384m;
        if (rm0Var == null || !rm0Var.m179950e()) {
            return;
        }
        rm0 rm0Var2 = this.f91384m;
        duringCreated(rm0Var2.m179952g(rm0Var2.m179948c().next)).subscribe(mkd0.m154956H(new e30() { // from class: l.ugr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176410a.m116544P0((j760) obj);
            }
        }, new e30() { // from class: l.vgr
            @Override // p149l.e30
            public final void call(Object obj) {
                ehr.m116529q0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b1 */
    public void m116553b1() {
        rm0 rm0Var = this.f91384m;
        if (rm0Var == null) {
            return;
        }
        duringCreated(rm0Var.m179953h()).subscribe(mkd0.m154956H(new e30() { // from class: l.qgr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154369a.m116545Q0((j760) obj);
            }
        }, new e30() { // from class: l.rgr
            @Override // p149l.e30
            public final void call(Object obj) {
                ehr.m116536z0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c1 */
    public boolean m116554c1(int i, final int i2, final Intent intent) {
        if (i != CoreModule.f17554l.m94651a().mo33299Ck()) {
            if (i != 786) {
                return false;
            }
            CoreMemberModule.m36001F().m132651b().mo35972Jb(act(), i2, intent);
            return true;
        }
        if (i2 != SwipeDirection.RIGHT.getValue() && i2 != SwipeDirection.LEFT.getValue() && i2 != SwipeDirection.UP.getValue()) {
            return false;
        }
        lifecycle().takeFirst(new w9j() { // from class: l.lgr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.mgr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133711a.m116546S0(i2, intent, (C4319c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: d1 */
    public boolean m116555d1(boolean z, LikedUser likedUser, User user, boolean z2) {
        if (((hhr) this.viewModel).f107821s.size() > 0) {
            return false;
        }
        this.f91375d = likedUser;
        if (z && !m116549W0()) {
            return false;
        }
        if (!z || TEnum.equals(likedUser.status, "lettered")) {
            zvf0.m220396r("e_iliked_superlike", this.f91372a.pageId());
            o6j0.m162859c(MatchScData.ModuleId.mid_e_superlikeButton, this.f91372a.pageId(), o6j0.C18854a.m162878h("moments_user_id", user.f56011id), o6j0.C18854a.m162879i("is_privileged", !xma.m210071e4()), o6j0.C18854a.m162878h("showfrom_superlike", "ilike"));
            return CoreMemberModule.m36001F().m132651b().mo35983be(this.f91372a, this.f91373b, true, true, z2, 0, user.picture(0).cover().url, null, user, this.f91375d);
        }
        CoreMemberModule.m36001F().m132651b().mo35970Bi(user);
        zvf0.m220396r("e_iliked_letter", this.f91372a.pageId());
        if (xma.m210071e4()) {
            CoreModule.m29935P().m94651a().mo33572qm(this.f91372a, "p_navigation_ilike,card_button_pull", Privilege.liked_user, null);
            return false;
        }
        m116558g1(user, z2);
        return false;
    }

    /* JADX INFO: renamed from: e1 */
    public void m116556e1(LikedUser likedUser) {
        if (this.f91373b.m46782Q4().m218401S(likedUser)) {
            CoreModule.f17545c.f19625Z0.m163929d4(likedUser.f20432id);
            this.f91381j--;
            if (this.f91373b.m46782Q4().m218403U() <= 0) {
                ((hhr) this.viewModel).m131137j(false, this.f91373b.m46782Q4().m218403U() <= 0);
                boolean zMo33433Vf = CoreModule.m29935P().m94651a().mo33433Vf();
                V v2 = this.viewModel;
                if (zMo33433Vf) {
                    ((hhr) v2).m131147w(!this.f91379h);
                } else {
                    ((hhr) v2).m131147w(false);
                }
            }
        }
        Act act = this.f91372a;
        int i = R$string.f20693w;
        int i2 = this.f91381j;
        ((hhr) this.viewModel).m131145u(act.getString(i, i2 > 99 ? "99+" : String.valueOf(i2)));
    }

    /* JADX INFO: renamed from: f1 */
    public void m116557f1(String str) {
        if (this.f91383l) {
            return;
        }
        this.f91383l = true;
        CoreModule.m29935P().m94651a().mo33362Lf(this.f91372a, str, Privilege.liked_user, null, new e30() { // from class: l.tgr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170119a.m116547U0((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g1 */
    public final void m116558g1(final User user, final boolean z) {
        e30<String> e30Var = new e30() { // from class: l.ogr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143897a.m116548V0(z, user, (String) obj);
            }
        };
        if (xma.m210041D3()) {
            CoreModule.m29935P().m94651a().mo33371Mp(act(), user, e30Var, true);
        } else if (CoreModule.m29935P().m94656g().mo35029S9()) {
            CoreModule.m29935P().m94651a().mo33371Mp(act(), user, e30Var, true);
        } else {
            CoreModule.m29935P().m94656g().mo35071ot(act(), "p_navigation_ilike,card_button_pull");
        }
    }

    public void onResume() {
        if (CoreModule.m29935P().m94651a().mo33433Vf()) {
            m116513G0();
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
