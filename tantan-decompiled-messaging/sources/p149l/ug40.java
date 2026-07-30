package p149l;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.data.CoreAssetsSettings;
import com.p046p1.mobile.putong.core.data.MyTabTask;
import com.p046p1.mobile.putong.core.data.RealPicturesBanner;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserHomeMode;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.nearby.NearbyAct;
import com.p046p1.mobile.putong.core.p053ui.likedusers.LikedUsersAct;
import com.p046p1.mobile.putong.core.p053ui.likedusers.tablayout.NewMyLikedUsersAct;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.edit.MarryProfileEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.ProfileListFrag;
import com.p046p1.mobile.putong.core.p053ui.vip.VipAct;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAct;
import com.p046p1.mobile.putong.core.p053ui.visitor.MomentVisitorsAct;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.VisitorCounter;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class ug40 extends sta0<uh40> {

    /* JADX INFO: renamed from: a */
    public User f176353a;

    /* JADX INFO: renamed from: b */
    public s5k0 f176354b;

    /* JADX INFO: renamed from: c */
    public boolean f176355c;

    public ug40(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ knb0 m193480A0(User user, CoreLikers.C4719a c4719a, Integer num, Integer num2, UserPrivilege userPrivilege) {
        return new knb0(user, c4719a, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public /* synthetic */ void m193489U0(roj0 roj0Var) {
        this.f176353a = CoreModule.f17545c.f19639e0.m169520na();
        ((uh40) this.viewModel).m193665O0();
        ((uh40) this.viewModel).m193666P0(this.f176353a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ void m193490V0(User user) {
        this.f176353a = user;
        ((uh40) this.viewModel).m193666P0(user);
        ((uh40) this.viewModel).m193659L0(user);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m193491e0(Throwable th) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m193496j0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m193499m0(Throwable th) {
    }

    /* JADX INFO: renamed from: m1 */
    private void m193500m1(Class<? extends PutongFrag> cls) {
        Intent intent = new Intent(act(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", cls.getSimpleName());
        act().startActivity(intent);
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ Integer m193503p0(User user) {
        if (NullChecker.m81303a(user) && NullChecker.m81303a(user.profile) && NullChecker.m81303a(user.profile.moments)) {
            return Integer.valueOf(user.profile.moments.counters.totalMoments);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ CoreAssetsSettings m193506s0(j760 j760Var) {
        return (CoreAssetsSettings) j760Var.f116564a;
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m193507t0(Throwable th) {
    }

    @Override // p149l.jq2, p149l.q0m
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public void mo51532C(uh40 uh40Var) {
        super.mo51532C(uh40Var);
    }

    /* JADX INFO: renamed from: N0 */
    public void m193513N0(r5k0 r5k0Var, s5k0 s5k0Var) {
        mo51532C((uh40) r5k0Var);
        this.f176354b = s5k0Var;
    }

    /* JADX INFO: renamed from: O0 */
    public void m193514O0() {
        if (!upa.m194745e2() || !TextUtils.equals(CoreModule.f17545c.f19639e0.f149321Z3.get(), UserHomeMode.marryMode)) {
            act().startActivity(ProfileAct.m50738p2(m142773Y(), CoreModule.m29931H().userId(), "profile_frag_menu", false, true));
        } else {
            act().startActivity(MarryProfileEditAct.m47418Y1(m142773Y()));
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m193515P0() {
        o6j0.m162859c("e_followers", this.f176354b.mo152480v(), new o6j0.C18854a[0]);
        CoreModule.m29934N().argsToPhotoAlbumFansAct(act(), "fans", false);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m193516Q0() {
        o6j0.m162859c("e_i_follow", this.f176354b.mo152480v(), new o6j0.C18854a[0]);
        CoreModule.m29934N().argsToPhotoAlbumFansAct(act(), FollowshipStatus.following, false);
    }

    /* JADX INFO: renamed from: R0 */
    public boolean m193517R0() {
        return !bzc0.m104566f() && upa.m194795o2();
    }

    /* JADX INFO: renamed from: S0 */
    public boolean m193518S0() {
        if (!upa.m194800p2() || wn90.m204606U(this.f176353a)) {
            return false;
        }
        return ((upa.m194745e2() && TextUtils.equals(CoreModule.f17545c.f19639e0.f149321Z3.get(), UserHomeMode.marryMode)) || !NullChecker.m81303a(CoreModule.f17545c.f19639e0.f149404j7.m221515e()) || TextUtils.isEmpty(CoreModule.f17545c.f19639e0.f149404j7.m221515e().type)) ? false : true;
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m193519W0(Integer num) {
        ((uh40) this.viewModel).m193655I0(num.intValue());
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m193520X0(j760 j760Var) {
        ((uh40) this.viewModel).m193658K0();
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m193521Y0(xaj0 xaj0Var) {
        ((uh40) this.viewModel).m193695u0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        if (upa.m194745e2()) {
            duringCreated(CoreModule.f17545c.f19639e0.f149170F1).subscribe(mkd0.m154955G(new e30() { // from class: l.nf40
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f138682a.m193489U0((roj0) obj);
                }
            }));
        }
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.pf40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148515a.m193490V0((User) obj);
            }
        }));
        if (upa.m194800p2()) {
            duringCreated(CoreModule.f17545c.f19639e0.f149404j7).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.bg40
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f75404a.m193522a1((MyTabTask) obj);
                }
            }));
        }
        duringCreated(CoreModule.f17545c.m31483n3()).map(new w9j() { // from class: l.eg40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Integer.valueOf(((Counter) obj).moments.unreadMomentLikes);
            }
        }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.fg40
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
            }
        }));
        duringCreated(mkd0.m154984r(CoreModule.f17546d.m95174d(), lifecycle(), new x9j() { // from class: l.gg40
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return new j760((CoreAssetsSettings) obj, (C4319c) obj2);
            }
        })).filter(new w9j() { // from class: l.hg40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                j760 j760Var = (j760) obj;
                return Boolean.valueOf(NullChecker.m81303a(j760Var.f116564a) && C4319c.f15548i == j760Var.f116565b);
            }
        }).map(new w9j() { // from class: l.ig40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ug40.m193506s0((j760) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.kg40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123000a.m193525d1((CoreAssetsSettings) obj);
            }
        }));
        duringCreated(C22306c.combineLatest(CoreModule.f17545c.f19639e0.m169523o9(), CoreModule.f17545c.f19687u0.m30405O6(), CoreModule.f17545c.f19687u0.m30486w5().distinctUntilChanged(), C22306c.just(0), CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip")).distinctUntilChanged(), new aaj() { // from class: l.lg40
            @Override // p149l.aaj
            /* JADX INFO: renamed from: a */
            public final Object mo95547a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return ug40.m193480A0((User) obj, (CoreLikers.C4719a) obj2, (Integer) obj3, (Integer) obj4, (UserPrivilege) obj5);
            }
        })).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.yf40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197980a.m193526e1((knb0) obj);
            }
        }));
        if (m193517R0() || bzc0.m104566f()) {
            duringCreated((C22306c) CoreModule.f17545c.f19639e0.m169523o9().map(new w9j() { // from class: l.jg40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ug40.m193503p0((User) obj);
                }
            })).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.ng40
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f138839a.m193519W0((Integer) obj);
                }
            }));
        }
        if (upa.m194850z2() || upa.m194609A2()) {
            duringCreated(v930.m197537k().filter(new w9j() { // from class: l.og40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Me);
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.pg40
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19680r2.m136527q3();
                }
            }));
            duringCreated(C22306c.combineLatest(CoreModule.f17545c.f19680r2.m136536z3(), CoreModule.f17545c.f19639e0.m169523o9().map(new w9j() { // from class: l.qg40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    User user = (User) obj;
                    return Boolean.valueOf(user.isBanned() || user.isProfileJailed() || user.isFakeUser());
                }
            }).distinctUntilChanged(), new x9j() { // from class: l.rg40
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return vwb.m200311Y((RealPicturesBanner) obj, (Boolean) obj2);
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.sg40
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f164369a.m193520X0((j760) obj);
                }
            }));
        }
        if (upa.m194747f() && (act() instanceof NewMainAct)) {
            duringCreated((C22306c) ((NewMainAct) act()).m39819i7().distinctUntilChanged().filter(new w9j() { // from class: l.tg40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((TabName) obj).name(), TabName.Me.name()));
                }
            }).switchMap(new w9j() { // from class: l.of40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return mkd0.m154985s(CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip")), CoreModule.f17545c.f19552B0.m31611j4(), CoreModule.f17545c.f19663m0.f19430m0, new y9j() { // from class: l.mg40
                        @Override // p149l.y9j
                        /* JADX INFO: renamed from: a */
                        public final Object mo94599a(Object obj2, Object obj3, Object obj4) {
                            return new xaj0((UserPrivilege) obj2, (VerificationCenter) obj3, (Long) obj4);
                        }
                    });
                }
            })).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.qf40
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f154083a.m193521Y0((xaj0) obj);
                }
            }, new e30() { // from class: l.rf40
                @Override // p149l.e30
                public final void call(Object obj) {
                    ug40.m193507t0((Throwable) obj);
                }
            }));
        }
        if (!bzc0.m104566f() && upa.m194795o2() && !upa.m194800p2()) {
            duringCreated(((NewMainAct) act()).m39819i7().distinctUntilChanged().filter(new w9j() { // from class: l.sf40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((TabName) obj).name(), TabName.Me.name()));
                }
            })).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.tf40
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f169945a.m193523b1((TabName) obj);
                }
            }, new e30() { // from class: l.uf40
                @Override // p149l.e30
                public final void call(Object obj) {
                    ug40.m193496j0((Throwable) obj);
                }
            }));
        }
        if (ogl0.m164233L()) {
            duringCreated(mkd0.m154984r(((NewMainAct) act()).m39819i7(), CoreModule.f17545c.f19665m2.m191467H3().distinctUntilChanged(), new x9j() { // from class: l.vf40
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return new j760((TabName) obj, (Integer) obj2);
                }
            }).filter(new w9j() { // from class: l.wf40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((TabName) ((j760) obj).f116564a).name(), TabName.Me.name()));
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.xf40
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f192651a.m193524c1((j760) obj);
                }
            }, new e30() { // from class: l.zf40
                @Override // p149l.e30
                public final void call(Object obj) {
                    ug40.m193499m0((Throwable) obj);
                }
            }));
            duringCreated(((NewMainAct) act()).m39819i7().filter(new w9j() { // from class: l.ag40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((TabName) obj).name(), TabName.Me.name()));
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.cg40
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19665m2.m191465F3();
                }
            }, new e30() { // from class: l.dg40
                @Override // p149l.e30
                public final void call(Object obj) {
                    ug40.m193491e0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m193522a1(MyTabTask myTabTask) {
        ((uh40) this.viewModel).m193661M0(CoreModule.m29932K().me_());
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m193523b1(TabName tabName) {
        ((uh40) this.viewModel).m193693s0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m193524c1(j760 j760Var) {
        zvf0.m220402x("e_nearby_tab", this.f176354b.mo152480v());
        ((uh40) this.viewModel).m193657J0(((Integer) j760Var.f116565b).intValue());
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m193525d1(CoreAssetsSettings coreAssetsSettings) {
        if ((TEnum.equals(coreAssetsSettings.userBanAppealSwitch, "online") || (TEnum.equals(coreAssetsSettings.userBanAppealSwitch, "grey") && v2a.m196755d())) && !this.f176355c) {
            CoreModule.f17545c.f19639e0.m169466Z9();
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m193526e1(knb0 knb0Var) {
        ((uh40) this.viewModel).m193651G0(knb0Var);
    }

    /* JADX INFO: renamed from: f1 */
    public void m193527f1(boolean z) {
        this.f176355c = z;
        if (!z) {
            ((uh40) this.viewModel).m193653H0();
        }
        if (z) {
            ((uh40) this.viewModel).m193654I();
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void m193528g1() {
        o6j0.m162859c("e_see_who_liked_me_banner", this.f176354b.mo152480v(), new o6j0.C18854a[0]);
        wn90.m204602F().m204676z(CoreModule.f17545c.f19639e0.f149400j3);
        xdl0.m208344M(((uh40) this.viewModel).f176523r, false);
        if (act() instanceof NewMainAct) {
            ((NewMainAct) act()).m39824n7();
        }
        if (NullChecker.m81303a(CoreModule.f17545c.m31484o3()) && CoreModule.f17545c.m31484o3().likersLimit.remaining > 0) {
            act().startActivity(new Intent(act(), (Class<?>) LikersAct.class));
        } else if (!tae0.m187709l(act(), w2b0.m201089c("p_navigation_see,default", 1))) {
            CoreModule.m29935P().m94651a().mo33534l1(act(), w2b0.m201089c("p_navigation_see,default", 1));
        }
        if (n3b0.m157742q()) {
            CoreModule.f17545c.f19687u0.f19254k0.put(Long.valueOf(qib0.f154693H.guessedCurrentServerTime()));
            CoreModule.f17545c.f19687u0.m30425Y6();
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m193529h1(View view) {
        zvf0.m220396r("e_nearby_tab", this.f176354b.mo152480v());
        CoreModule.f17545c.f19665m2.m191473N3();
        if (act() instanceof NewMainAct) {
            ((NewMainAct) act()).m39824n7();
        }
        act().startActivity(NearbyAct.m42692V1(act(), "from_my_tab"));
    }

    /* JADX INFO: renamed from: i1 */
    public void m193530i1(View view) {
        o6j0.m162859c("e_self_edit", this.f176354b.mo152480v(), new o6j0.C18854a[0]);
        if (!upa.m194745e2() || !CoreModule.f17545c.f19639e0.m169468a8()) {
            m193500m1(ProfileListFrag.class);
            return;
        }
        Intent intentM47418Y1 = MarryProfileEditAct.m47418Y1(act());
        intentM47418Y1.putExtra("editTab", "preview");
        act().startActivity(intentM47418Y1);
    }

    /* JADX INFO: renamed from: j1 */
    public void m193531j1() {
        if (ew40.m118398j()) {
            act().startActivity(VipAct.m56237b2(act(), khl0.m145975a("diamond")));
            return;
        }
        if (zb90.m217831h() || xma.m210073f4()) {
            act().startActivity(VipAct.m56237b2(act(), khl0.m145975a("svip")));
        } else if (zb90.m217832i()) {
            act().startActivity(VipAct.m56236a2(act()));
        } else {
            act().startActivity(VipAct.m56237b2(act(), gkl0.m126654q0()));
        }
    }

    /* JADX INFO: renamed from: k1 */
    public void m193532k1() {
        ((uh40) this.viewModel).m193664O();
        VisitorCounter visitorCounterM34700N4 = CoreModule.f17545c.f19664m1.m34700N4();
        zvf0.m220399u("e_my_visitor", this.f176354b.mo152480v(), vwb.m200311Y("visitor_num", Integer.valueOf(NullChecker.m81303a(visitorCounterM34700N4) ? visitorCounterM34700N4.totalCnt : -1)));
        act().startActivity(MomentVisitorsAct.m57783V1(act(), CoreModule.f17545c.f19668n2.m175435L3()));
        ew40.m118397h().m118411o(mqi0.m155944o());
    }

    /* JADX INFO: renamed from: l1 */
    public void m193533l1() {
        o6j0.m162859c("e_i_like", this.f176354b.mo152480v(), new o6j0.C18854a[0]);
        act().startActivity(CoreModule.m29935P().m94651a().mo33433Vf() ? NewMyLikedUsersAct.m46820Y1(act()) : new Intent(act(), (Class<?>) LikedUsersAct.class));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
