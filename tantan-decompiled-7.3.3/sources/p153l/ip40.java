package p153l;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.data.CoreAssetsSettings;
import com.p051p1.mobile.putong.core.data.MyTabTask;
import com.p051p1.mobile.putong.core.data.RealPicturesBanner;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserHomeMode;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.nearby.NearbyAct;
import com.p051p1.mobile.putong.core.p058ui.likedusers.LikedUsersAct;
import com.p051p1.mobile.putong.core.p058ui.likedusers.tablayout.NewMyLikedUsersAct;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.edit.MarryProfileEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.ProfileListFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.VipAct;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.p051p1.mobile.putong.core.p058ui.visitor.MomentVisitorsAct;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.VisitorCounter;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class ip40 extends w1b0<iq40> {

    /* JADX INFO: renamed from: a */
    public User f116253a;

    /* JADX INFO: renamed from: b */
    public yek0 f116254b;

    /* JADX INFO: renamed from: c */
    public boolean f116255c;

    public ip40(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ ovb0 m141393A0(User user, CoreLikers.C4870a c4870a, Integer num, Integer num2, UserPrivilege userPrivilege) {
        return new ovb0(user, c4870a, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public /* synthetic */ void m141402U0(uxj0 uxj0Var) {
        this.f116253a = CoreModule.f18264c.f20381e0.m116593na();
        ((iq40) this.viewModel).m141613O0();
        ((iq40) this.viewModel).m141614P0(this.f116253a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ void m141403V0(User user) {
        this.f116253a = user;
        ((iq40) this.viewModel).m141614P0(user);
        ((iq40) this.viewModel).m141607L0(user);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m141404e0(Throwable th) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m141409j0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m141412m0(Throwable th) {
    }

    /* JADX INFO: renamed from: m1 */
    private void m141413m1(Class<? extends PutongFrag> cls) {
        Intent intent = new Intent(act(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", cls.getSimpleName());
        act().startActivity(intent);
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ Integer m141416p0(User user) {
        if (NullChecker.m82486a(user) && NullChecker.m82486a(user.profile) && NullChecker.m82486a(user.profile.moments)) {
            return Integer.valueOf(user.profile.moments.counters.totalMoments);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ CoreAssetsSettings m141419s0(pf60 pf60Var) {
        return (CoreAssetsSettings) pf60Var.f152156a;
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m141420t0(Throwable th) {
    }

    @Override // p153l.ar2, p153l.k3m
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public void mo52715C(iq40 iq40Var) {
        super.mo52715C(iq40Var);
    }

    /* JADX INFO: renamed from: N0 */
    public void m141426N0(xek0 xek0Var, yek0 yek0Var) {
        mo52715C((iq40) xek0Var);
        this.f116254b = yek0Var;
    }

    /* JADX INFO: renamed from: O0 */
    public void m141427O0() {
        if (!gra.m131676e2() || !TextUtils.equals(CoreModule.f18264c.f20381e0.f89178Z3.get(), UserHomeMode.marryMode)) {
            act().startActivity(ProfileAct.m51922q2(m99640Y(), CoreModule.m30929H().userId(), "profile_frag_menu", false, true));
        } else {
            act().startActivity(MarryProfileEditAct.m48601Z1(m99640Y()));
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m141428P0() {
        sfj0.m185596c("e_followers", this.f116254b.mo194978v(), new sfj0.C20032a[0]);
        CoreModule.m30932N().argsToPhotoAlbumFansAct(act(), "fans", false);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m141429Q0() {
        sfj0.m185596c("e_i_follow", this.f116254b.mo194978v(), new sfj0.C20032a[0]);
        CoreModule.m30932N().argsToPhotoAlbumFansAct(act(), FollowshipStatus.following, false);
    }

    /* JADX INFO: renamed from: R0 */
    public boolean m141430R0() {
        return !e7d0.m119697f() && gra.m131726o2();
    }

    /* JADX INFO: renamed from: S0 */
    public boolean m141431S0() {
        if (!gra.m131731p2() || aw90.m100566U(this.f116253a)) {
            return false;
        }
        return ((gra.m131676e2() && TextUtils.equals(CoreModule.f18264c.f20381e0.f89178Z3.get(), UserHomeMode.marryMode)) || !NullChecker.m82486a(CoreModule.f18264c.f20381e0.f89261j7.m222761e()) || TextUtils.isEmpty(CoreModule.f18264c.f20381e0.f89261j7.m222761e().type)) ? false : true;
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m141432W0(Integer num) {
        ((iq40) this.viewModel).m141603I0(num.intValue());
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m141433X0(pf60 pf60Var) {
        ((iq40) this.viewModel).m141606K0();
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m141434Y0(bkj0 bkj0Var) {
        ((iq40) this.viewModel).m141643u0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        if (gra.m131676e2()) {
            duringCreated(CoreModule.f18264c.f20381e0.f89027F1).subscribe(psd0.m173596G(new y20() { // from class: l.bo40
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f77611a.m141402U0((uxj0) obj);
                }
            }));
        }
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.do40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f89870a.m141403V0((User) obj);
            }
        }));
        if (gra.m131731p2()) {
            duringCreated(CoreModule.f18264c.f20381e0.f89261j7).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.po40
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f153367a.m141435a1((MyTabTask) obj);
                }
            }));
        }
        duringCreated(CoreModule.f18264c.m32486n3()).map(new qcj() { // from class: l.so40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Integer.valueOf(((Counter) obj).moments.unreadMomentLikes);
            }
        }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.to40
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
            }
        }));
        duringCreated(psd0.m173625r(CoreModule.f18265d.m144642d(), lifecycle(), new rcj() { // from class: l.uo40
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return new pf60((CoreAssetsSettings) obj, (C4470c) obj2);
            }
        })).filter(new qcj() { // from class: l.vo40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                pf60 pf60Var = (pf60) obj;
                return Boolean.valueOf(NullChecker.m82486a(pf60Var.f152156a) && C4470c.f16267i == pf60Var.f152157b);
            }
        }).map(new qcj() { // from class: l.wo40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ip40.m141419s0((pf60) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.yo40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200954a.m141438d1((CoreAssetsSettings) obj);
            }
        }));
        duringCreated(C22421c.combineLatest(CoreModule.f18264c.f20381e0.m116596o9(), CoreModule.f18264c.f20429u0.m31415S6(), CoreModule.f18264c.f20429u0.m31494y5().distinctUntilChanged(), C22421c.just(0), CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip")).distinctUntilChanged(), new ucj() { // from class: l.zo40
            @Override // p153l.ucj
            /* JADX INFO: renamed from: a */
            public final Object mo115512a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return ip40.m141393A0((User) obj, (CoreLikers.C4870a) obj2, (Integer) obj3, (Integer) obj4, (UserPrivilege) obj5);
            }
        })).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.mo40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137772a.m141439e1((ovb0) obj);
            }
        }));
        if (m141430R0() || e7d0.m119697f()) {
            duringCreated((C22421c) CoreModule.f18264c.f20381e0.m116596o9().map(new qcj() { // from class: l.xo40
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ip40.m141416p0((User) obj);
                }
            })).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.bp40
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f77730a.m141432W0((Integer) obj);
                }
            }));
        }
        if (gra.m131781z2() || gra.m131540A2()) {
            duringCreated(ji30.m144967k().filter(new qcj() { // from class: l.cp40
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Me);
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.dp40
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20422r2.m158742q3();
                }
            }));
            duringCreated(C22421c.combineLatest(CoreModule.f18264c.f20422r2.m158751z3(), CoreModule.f18264c.f20381e0.m116596o9().map(new qcj() { // from class: l.ep40
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    User user = (User) obj;
                    return Boolean.valueOf(user.isBanned() || user.isProfileJailed() || user.isFakeUser());
                }
            }).distinctUntilChanged(), new rcj() { // from class: l.fp40
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return jyb.m147494Y((RealPicturesBanner) obj, (Boolean) obj2);
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.gp40
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f105429a.m141433X0((pf60) obj);
                }
            }));
        }
        if (gra.m131678f() && (act() instanceof NewMainAct)) {
            duringCreated((C22421c) ((NewMainAct) act()).m40829o7().distinctUntilChanged().filter(new qcj() { // from class: l.hp40
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((TabName) obj).name(), TabName.Me.name()));
                }
            }).switchMap(new qcj() { // from class: l.co40
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return psd0.m173626s(CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip")), CoreModule.f18264c.f20294B0.m32614j4(), CoreModule.f18264c.f20405m0.f20172m0, new scj() { // from class: l.ap40
                        @Override // p153l.scj
                        /* JADX INFO: renamed from: a */
                        public final Object mo95332a(Object obj2, Object obj3, Object obj4) {
                            return new bkj0((UserPrivilege) obj2, (VerificationCenter) obj3, (Long) obj4);
                        }
                    });
                }
            })).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.eo40
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f94865a.m141434Y0((bkj0) obj);
                }
            }, new y20() { // from class: l.fo40
                @Override // p153l.y20
                public final void call(Object obj) {
                    ip40.m141420t0((Throwable) obj);
                }
            }));
        }
        if (!e7d0.m119697f() && gra.m131726o2() && !gra.m131731p2()) {
            duringCreated(((NewMainAct) act()).m40829o7().distinctUntilChanged().filter(new qcj() { // from class: l.go40
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((TabName) obj).name(), TabName.Me.name()));
                }
            })).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.ho40
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f110868a.m141436b1((TabName) obj);
                }
            }, new y20() { // from class: l.io40
                @Override // p153l.y20
                public final void call(Object obj) {
                    ip40.m141409j0((Throwable) obj);
                }
            }));
        }
        if (spl0.m187360L()) {
            duringCreated(psd0.m173625r(((NewMainAct) act()).m40829o7(), CoreModule.f18264c.f20407m2.m123958H3().distinctUntilChanged(), new rcj() { // from class: l.jo40
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return new pf60((TabName) obj, (Integer) obj2);
                }
            }).filter(new qcj() { // from class: l.ko40
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((TabName) ((pf60) obj).f152156a).name(), TabName.Me.name()));
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.lo40
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f132874a.m141437c1((pf60) obj);
                }
            }, new y20() { // from class: l.no40
                @Override // p153l.y20
                public final void call(Object obj) {
                    ip40.m141412m0((Throwable) obj);
                }
            }));
            duringCreated(((NewMainAct) act()).m40829o7().filter(new qcj() { // from class: l.oo40
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((TabName) obj).name(), TabName.Me.name()));
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.qo40
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20407m2.m123956F3();
                }
            }, new y20() { // from class: l.ro40
                @Override // p153l.y20
                public final void call(Object obj) {
                    ip40.m141404e0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m141435a1(MyTabTask myTabTask) {
        ((iq40) this.viewModel).m141609M0(CoreModule.m30930K().me_());
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m141436b1(TabName tabName) {
        ((iq40) this.viewModel).m141641s0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m141437c1(pf60 pf60Var) {
        i4g0.m138526x("e_nearby_tab", this.f116254b.mo194978v());
        ((iq40) this.viewModel).m141605J0(((Integer) pf60Var.f152157b).intValue());
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m141438d1(CoreAssetsSettings coreAssetsSettings) {
        if ((TEnum.equals(coreAssetsSettings.userBanAppealSwitch, "online") || (TEnum.equals(coreAssetsSettings.userBanAppealSwitch, "grey") && g4a.m128860d())) && !this.f116255c) {
            CoreModule.f18264c.f20381e0.m116539Z9();
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m141439e1(ovb0 ovb0Var) {
        ((iq40) this.viewModel).m141599G0(ovb0Var);
    }

    /* JADX INFO: renamed from: f1 */
    public void m141440f1(boolean z) {
        this.f116255c = z;
        if (!z) {
            ((iq40) this.viewModel).m141601H0();
        }
        if (z) {
            ((iq40) this.viewModel).m141602I();
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void m141441g1() {
        sfj0.m185596c("e_see_who_liked_me_banner", this.f116254b.mo194978v(), new sfj0.C20032a[0]);
        aw90.m100562F().m100636z(CoreModule.f18264c.f20381e0.f89257j3);
        bnl0.m105524M(((iq40) this.viewModel).f116373r, false);
        if (act() instanceof NewMainAct) {
            ((NewMainAct) act()).m40836t7();
        }
        if (NullChecker.m82486a(CoreModule.f18264c.m32487o3()) && CoreModule.f18264c.m32487o3().likersLimit.remaining > 0) {
            act().startActivity(new Intent(act(), (Class<?>) LikersAct.class));
        } else if (!yie0.m216080l(act(), abb0.m96736c("p_navigation_see,default", 1))) {
            CoreModule.m30933P().m143405a().mo34537l1(act(), abb0.m96736c("p_navigation_see,default", 1));
        }
        if (rbb0.m180744q()) {
            CoreModule.f18264c.f20429u0.f19996l0.put(Long.valueOf(uqb0.f180376H.guessedCurrentServerTime()));
            CoreModule.f18264c.f20429u0.m31435c7();
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m141442h1(View view) {
        i4g0.m138520r("e_nearby_tab", this.f116254b.mo194978v());
        CoreModule.f18264c.f20407m2.m123964N3();
        if (act() instanceof NewMainAct) {
            ((NewMainAct) act()).m40836t7();
        }
        act().startActivity(NearbyAct.m43703X1(act(), "from_my_tab"));
    }

    /* JADX INFO: renamed from: i1 */
    public void m141443i1(View view) {
        sfj0.m185596c("e_self_edit", this.f116254b.mo194978v(), new sfj0.C20032a[0]);
        if (!gra.m131676e2() || !CoreModule.f18264c.f20381e0.m116541a8()) {
            m141413m1(ProfileListFrag.class);
            return;
        }
        Intent intentM48601Z1 = MarryProfileEditAct.m48601Z1(act());
        intentM48601Z1.putExtra("editTab", "preview");
        act().startActivity(intentM48601Z1);
    }

    /* JADX INFO: renamed from: j1 */
    public void m141444j1() {
        if (t450.m189175j()) {
            act().startActivity(VipAct.m57420c2(act(), oql0.m168817a("diamond")));
            return;
        }
        if (dk90.m116229h() || joa.m146388g4()) {
            act().startActivity(VipAct.m57420c2(act(), oql0.m168817a("svip")));
        } else if (dk90.m116230i()) {
            act().startActivity(VipAct.m57419b2(act()));
        } else {
            act().startActivity(VipAct.m57420c2(act(), ktl0.m151379q0()));
        }
    }

    /* JADX INFO: renamed from: k1 */
    public void m141445k1() {
        ((iq40) this.viewModel).m141612O();
        VisitorCounter visitorCounterM35703N4 = CoreModule.f18264c.f20406m1.m35703N4();
        i4g0.m138523u("e_my_visitor", this.f116254b.mo194978v(), jyb.m147494Y("visitor_num", Integer.valueOf(NullChecker.m82486a(visitorCounterM35703N4) ? visitorCounterM35703N4.totalCnt : -1)));
        act().startActivity(MomentVisitorsAct.m58966X1(act(), CoreModule.f18264c.f20410n2.m121466L3()));
        t450.m189174h().m189188o(pzi0.m174454o());
    }

    /* JADX INFO: renamed from: l1 */
    public void m141446l1() {
        sfj0.m185596c("e_i_like", this.f116254b.mo194978v(), new sfj0.C20032a[0]);
        act().startActivity(CoreModule.m30933P().m143405a().mo34436Vf() ? NewMyLikedUsersAct.m48003Z1(act()) : new Intent(act(), (Class<?>) LikedUsersAct.class));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
