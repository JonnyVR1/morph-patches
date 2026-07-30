package p009l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.core.newui.nearby.NearbyAct;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.core.data.CoreAssetsSettings;
import com.p1.mobile.putong.core.data.MyTabTask;
import com.p1.mobile.putong.core.data.RealPicturesBanner;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.ui.likedusers.LikedUsersAct;
import com.p1.mobile.putong.core.ui.likedusers.tablayout.NewMyLikedUsersAct;
import com.p1.mobile.putong.core.ui.marry.profile.edit.MarryProfileEditAct;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag;
import com.p1.mobile.putong.core.ui.vip.VipAct;
import com.p1.mobile.putong.core.ui.vip.likers.LikersAct;
import com.p1.mobile.putong.core.ui.visitor.MomentVisitorsAct;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.VisitorCounter;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.aaj;
import l.bzc0;
import l.e30;
import l.ew40;
import l.gkl0;
import l.j760;
import l.jo0;
import l.jq2;
import l.khl0;
import l.knb0;
import l.mcr;
import l.mkd0;
import l.n3b0;
import l.o6j0;
import l.ogl0;
import l.qib0;
import l.roj0;
import l.tae0;
import l.upa;
import l.v2a;
import l.v930;
import l.vwb;
import l.w9j;
import l.x9j;
import l.xaj0;
import l.xdl0;
import l.xma;
import l.y9j;
import l.zb90;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ug40 extends sta0<uh40> {

    /* JADX INFO: renamed from: a */
    public User f21132a;

    /* JADX INFO: renamed from: b */
    public s5k0 f21133b;

    /* JADX INFO: renamed from: c */
    public boolean f21134c;

    public ug40(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ knb0 m22877A0(User user, CoreLikers.a aVar, Integer num, Integer num2, UserPrivilege userPrivilege) {
        return new knb0(user, aVar, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public /* synthetic */ void m22886U0(roj0 roj0Var) {
        this.f21132a = CoreModule.c.e0.na();
        ((uh40) ((jq2) this).viewModel).m22986O0();
        ((uh40) ((jq2) this).viewModel).m22987P0(this.f21132a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ void m22887V0(User user) {
        this.f21132a = user;
        ((uh40) ((jq2) this).viewModel).m22987P0(user);
        ((uh40) ((jq2) this).viewModel).m22980L0(user);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m22888e0(Throwable th) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m22893j0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m22896m0(Throwable th) {
    }

    /* JADX INFO: renamed from: m1 */
    private void m22897m1(Class<? extends PutongFrag> cls) {
        Intent intent = new Intent((Context) act(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", cls.getSimpleName());
        act().startActivity(intent);
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ Integer m22900p0(User user) {
        if (NullChecker.a(user) && NullChecker.a(user.profile) && NullChecker.a(user.profile.moments)) {
            return Integer.valueOf(user.profile.moments.counters.totalMoments);
        }
        return 0;
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ CoreAssetsSettings m22903s0(j760 j760Var) {
        return (CoreAssetsSettings) j760Var.a;
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m22904t0(Throwable th) {
    }

    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public void m22909C(uh40 uh40Var) {
        super.C(uh40Var);
    }

    /* JADX INFO: renamed from: N0 */
    public void m22911N0(r5k0 r5k0Var, s5k0 s5k0Var) {
        m22909C((uh40) r5k0Var);
        this.f21133b = s5k0Var;
    }

    /* JADX INFO: renamed from: O0 */
    public void m22912O0() {
        if (!upa.e2() || !TextUtils.equals((CharSequence) CoreModule.c.e0.Z3.get(), "marryMode")) {
            act().startActivity(ProfileAct.p2(Y(), CoreModule.H().userId(), "profile_frag_menu", false, true));
        } else {
            act().startActivity(MarryProfileEditAct.Y1(Y()));
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m22913P0() {
        o6j0.c("e_followers", this.f21133b.mo18206v(), new o6j0.a[0]);
        CoreModule.N().argsToPhotoAlbumFansAct(act(), "fans", false);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m22914Q0() {
        o6j0.c("e_i_follow", this.f21133b.mo18206v(), new o6j0.a[0]);
        CoreModule.N().argsToPhotoAlbumFansAct(act(), "following", false);
    }

    /* JADX INFO: renamed from: R0 */
    public boolean m22915R0() {
        return !bzc0.f() && upa.o2();
    }

    /* JADX INFO: renamed from: S0 */
    public boolean m22916S0() {
        if (!upa.p2() || wn90.m24343U(this.f21132a)) {
            return false;
        }
        return ((upa.e2() && TextUtils.equals((CharSequence) CoreModule.c.e0.Z3.get(), "marryMode")) || !NullChecker.a(CoreModule.c.e0.j7.e()) || TextUtils.isEmpty(((MyTabTask) CoreModule.c.e0.j7.e()).type)) ? false : true;
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m22917W0(Integer num) {
        ((uh40) ((jq2) this).viewModel).m22976I0(num.intValue());
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m22918X0(j760 j760Var) {
        ((uh40) ((jq2) this).viewModel).m22979K0();
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m22919Y0(xaj0 xaj0Var) {
        ((uh40) ((jq2) this).viewModel).m23017u0();
    }

    /* JADX INFO: renamed from: a0 */
    public void m22920a0() {
        if (upa.e2()) {
            duringCreated(CoreModule.c.e0.F1).subscribe(mkd0.G(new e30() { // from class: l.nf40
                public final void call(Object obj) {
                    this.f17437a.m22886U0((roj0) obj);
                }
            }));
        }
        duringCreated(CoreModule.c.e0.o9()).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.pf40
            public final void call(Object obj) {
                this.f18518a.m22887V0((User) obj);
            }
        }));
        if (upa.p2()) {
            duringCreated(CoreModule.c.e0.j7).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.bg40
                public final void call(Object obj) {
                    this.f10062a.m22921a1((MyTabTask) obj);
                }
            }));
        }
        duringCreated(CoreModule.c.n3()).map(new w9j() { // from class: l.eg40
            public final Object call(Object obj) {
                return Integer.valueOf(((Counter) obj).moments.unreadMomentLikes);
            }
        }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.fg40
            public final void call(Object obj) {
                CoreModule.c.e0.W9(CoreModule.H().userId());
            }
        }));
        duringCreated(mkd0.r(CoreModule.d.d(), lifecycle(), new x9j() { // from class: l.gg40
            public final Object call(Object obj, Object obj2) {
                return new j760((CoreAssetsSettings) obj, (c) obj2);
            }
        })).filter(new w9j() { // from class: l.hg40
            public final Object call(Object obj) {
                j760 j760Var = (j760) obj;
                return Boolean.valueOf(NullChecker.a(j760Var.a) && c.i == j760Var.b);
            }
        }).map(new w9j() { // from class: l.ig40
            public final Object call(Object obj) {
                return ug40.m22903s0((j760) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.kg40
            public final void call(Object obj) {
                this.f15659a.m22924d1((CoreAssetsSettings) obj);
            }
        }));
        duringCreated(rx.c.combineLatest(CoreModule.c.e0.o9(), CoreModule.c.u0.O6(), CoreModule.c.u0.w5().distinctUntilChanged(), rx.c.just(0), CoreModule.c.C0.u3(SummarizedPrivilegesId.get("svip")).distinctUntilChanged(), new aaj() { // from class: l.lg40
            /* JADX INFO: renamed from: a */
            public final Object m17891a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return ug40.m22877A0((User) obj, (CoreLikers.a) obj2, (Integer) obj3, (Integer) obj4, (UserPrivilege) obj5);
            }
        })).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.yf40
            public final void call(Object obj) {
                this.f23031a.m22925e1((knb0) obj);
            }
        }));
        if (m22915R0() || bzc0.f()) {
            duringCreated(CoreModule.c.e0.o9().map(new w9j() { // from class: l.jg40
                public final Object call(Object obj) {
                    return ug40.m22900p0((User) obj);
                }
            })).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.ng40
                public final void call(Object obj) {
                    this.f17448a.m22917W0((Integer) obj);
                }
            }));
        }
        if (upa.z2() || upa.A2()) {
            duringCreated(v930.k().filter(new w9j() { // from class: l.og40
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Me);
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.pg40
                public final void call(Object obj) {
                    CoreModule.c.r2.q3();
                }
            }));
            duringCreated(rx.c.combineLatest(CoreModule.c.r2.z3(), CoreModule.c.e0.o9().map(new w9j() { // from class: l.qg40
                public final Object call(Object obj) {
                    User user = (User) obj;
                    return Boolean.valueOf(user.isBanned() || user.isProfileJailed() || user.isFakeUser());
                }
            }).distinctUntilChanged(), new x9j() { // from class: l.rg40
                public final Object call(Object obj, Object obj2) {
                    return vwb.Y((RealPicturesBanner) obj, (Boolean) obj2);
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.sg40
                public final void call(Object obj) {
                    this.f20236a.m22918X0((j760) obj);
                }
            }));
        }
        if (upa.f() && (act() instanceof NewMainAct)) {
            duringCreated(act().m3895i7().distinctUntilChanged().filter(new w9j() { // from class: l.tg40
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((TabName) obj).name(), TabName.Me.name()));
                }
            }).switchMap(new w9j() { // from class: l.of40
                public final Object call(Object obj) {
                    return mkd0.s(CoreModule.c.C0.u3(SummarizedPrivilegesId.get("svip")), CoreModule.c.B0.j4(), CoreModule.c.m0.m0, new y9j() { // from class: l.mg40
                        /* JADX INFO: renamed from: a */
                        public final Object m18446a(Object obj2, Object obj3, Object obj4) {
                            return new xaj0((UserPrivilege) obj2, (VerificationCenter) obj3, (Long) obj4);
                        }
                    });
                }
            })).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.qf40
                public final void call(Object obj) {
                    this.f19203a.m22919Y0((xaj0) obj);
                }
            }, new e30() { // from class: l.rf40
                public final void call(Object obj) {
                    ug40.m22904t0((Throwable) obj);
                }
            }));
        }
        if (!bzc0.f() && upa.o2() && !upa.p2()) {
            duringCreated(act().m3895i7().distinctUntilChanged().filter(new w9j() { // from class: l.sf40
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((TabName) obj).name(), TabName.Me.name()));
                }
            })).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.tf40
                public final void call(Object obj) {
                    this.f20655a.m22922b1((TabName) obj);
                }
            }, new e30() { // from class: l.uf40
                public final void call(Object obj) {
                    ug40.m22893j0((Throwable) obj);
                }
            }));
        }
        if (ogl0.L()) {
            duringCreated(mkd0.r(act().m3895i7(), CoreModule.c.m2.H3().distinctUntilChanged(), new x9j() { // from class: l.vf40
                public final Object call(Object obj, Object obj2) {
                    return new j760((TabName) obj, (Integer) obj2);
                }
            }).filter(new w9j() { // from class: l.wf40
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((TabName) ((j760) obj).a).name(), TabName.Me.name()));
                }
            })).subscribe(mkd0.H(new e30() { // from class: l.xf40
                public final void call(Object obj) {
                    this.f22585a.m22923c1((j760) obj);
                }
            }, new e30() { // from class: l.zf40
                public final void call(Object obj) {
                    ug40.m22896m0((Throwable) obj);
                }
            }));
            duringCreated(act().m3895i7().filter(new w9j() { // from class: l.ag40
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((TabName) obj).name(), TabName.Me.name()));
                }
            })).subscribe(mkd0.H(new e30() { // from class: l.cg40
                public final void call(Object obj) {
                    CoreModule.c.m2.F3();
                }
            }, new e30() { // from class: l.dg40
                public final void call(Object obj) {
                    ug40.m22888e0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m22921a1(MyTabTask myTabTask) {
        ((uh40) ((jq2) this).viewModel).m22982M0(CoreModule.K().me_());
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m22922b1(TabName tabName) {
        ((uh40) ((jq2) this).viewModel).m23015s0();
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m22923c1(j760 j760Var) {
        zvf0.x("e_nearby_tab", this.f21133b.mo18206v());
        ((uh40) ((jq2) this).viewModel).m22978J0(((Integer) j760Var.b).intValue());
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m22924d1(CoreAssetsSettings coreAssetsSettings) {
        if ((TEnum.equals(coreAssetsSettings.userBanAppealSwitch, "online") || (TEnum.equals(coreAssetsSettings.userBanAppealSwitch, "grey") && v2a.d())) && !this.f21134c) {
            CoreModule.c.e0.Z9();
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m22925e1(knb0 knb0Var) {
        ((uh40) ((jq2) this).viewModel).m22972G0(knb0Var);
    }

    /* JADX INFO: renamed from: f1 */
    public void m22926f1(boolean z) {
        this.f21134c = z;
        if (!z) {
            ((uh40) ((jq2) this).viewModel).m22974H0();
        }
        if (z) {
            ((uh40) ((jq2) this).viewModel).m22975I();
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void m22927g1() {
        o6j0.c("e_see_who_liked_me_banner", this.f21133b.mo18206v(), new o6j0.a[0]);
        wn90.m24339F().m24413z(CoreModule.c.e0.j3);
        xdl0.M(((uh40) ((jq2) this).viewModel).f21184r, false);
        if (act() instanceof NewMainAct) {
            act().m3900n7();
        }
        if (NullChecker.a(CoreModule.c.o3()) && CoreModule.c.o3().likersLimit.remaining > 0) {
            act().startActivity(new Intent((Context) act(), (Class<?>) LikersAct.class));
        } else if (!tae0.l(act(), w2b0.m23782c("p_navigation_see,default", 1))) {
            CoreModule.P().a().l1(act(), w2b0.m23782c("p_navigation_see,default", 1));
        }
        if (n3b0.q()) {
            CoreModule.c.u0.k0.put(Long.valueOf(qib0.H.guessedCurrentServerTime()));
            CoreModule.c.u0.Y6();
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m22928h1(View view) {
        zvf0.r("e_nearby_tab", this.f21133b.mo18206v());
        CoreModule.c.m2.N3();
        if (act() instanceof NewMainAct) {
            act().m3900n7();
        }
        act().startActivity(NearbyAct.m6858V1(act(), "from_my_tab"));
    }

    /* JADX INFO: renamed from: i1 */
    public void m22929i1(View view) {
        o6j0.c("e_self_edit", this.f21133b.mo18206v(), new o6j0.a[0]);
        if (!upa.e2() || !CoreModule.c.e0.a8()) {
            m22897m1(ProfileListFrag.class);
            return;
        }
        Intent intentY1 = MarryProfileEditAct.Y1(act());
        intentY1.putExtra("editTab", "preview");
        act().startActivity(intentY1);
    }

    /* JADX INFO: renamed from: j1 */
    public void m22930j1() {
        if (ew40.j()) {
            act().startActivity(VipAct.b2(act(), khl0.a("diamond")));
            return;
        }
        if (zb90.h() || xma.f4()) {
            act().startActivity(VipAct.b2(act(), khl0.a("svip")));
        } else if (zb90.i()) {
            act().startActivity(VipAct.a2(act()));
        } else {
            act().startActivity(VipAct.b2(act(), gkl0.q0()));
        }
    }

    /* JADX INFO: renamed from: k1 */
    public void m22931k1() {
        ((uh40) ((jq2) this).viewModel).m22985O();
        VisitorCounter visitorCounterN4 = CoreModule.c.m1.N4();
        zvf0.u("e_my_visitor", this.f21133b.mo18206v(), new j760[]{vwb.Y("visitor_num", Integer.valueOf(NullChecker.a(visitorCounterN4) ? visitorCounterN4.totalCnt : -1))});
        act().startActivity(MomentVisitorsAct.V1(act(), CoreModule.c.n2.L3()));
        ew40.h().o(mqi0.m18550o());
    }

    /* JADX INFO: renamed from: l1 */
    public void m22932l1() {
        o6j0.c("e_i_like", this.f21133b.mo18206v(), new o6j0.a[0]);
        act().startActivity(CoreModule.P().a().Vf() ? NewMyLikedUsersAct.Y1(act()) : new Intent((Context) act(), (Class<?>) LikedUsersAct.class));
    }

    public void destroy() {
    }
}
