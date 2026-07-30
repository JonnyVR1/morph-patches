package p009l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p000p1.mobile.putong.core.newui.appeal.AppealProgressAct;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.SidesSlipActivity;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p000p1.mobile.putong.p004ui.mediapicker.MediaPickerBaseAct;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.android.app.a;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.core.data.AppealInfo;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.DatingGuideData;
import com.p1.mobile.putong.core.data.FakeGuideData;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.NotificationCounter;
import com.p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.ui.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.core.ui.purchase.e;
import com.p1.mobile.putong.data.FollowshipCounter;
import com.p1.mobile.putong.data.FollowshipCounters;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import l.ark;
import l.e30;
import l.eaj;
import l.j760;
import l.jo0;
import l.jq2;
import l.lqa;
import l.lsi0;
import l.mkd0;
import l.o6j0;
import l.qqi0;
import l.roj0;
import l.rzb0;
import l.src0;
import l.t100;
import l.upa;
import l.v7c;
import l.v930;
import l.vpx;
import l.vwb;
import l.w9j;
import l.x9j;
import l.xaj0;
import l.xdl0;
import l.xma;
import l.y9j;
import l.zl80;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class m020 extends qta0<x020> implements s5k0 {

    /* JADX INFO: renamed from: a */
    public uh40 f16469a;

    /* JADX INFO: renamed from: b */
    public ug40 f16470b;

    /* JADX INFO: renamed from: c */
    public rta0 f16471c;

    /* JADX INFO: renamed from: d */
    public hx10 f16472d;

    /* JADX INFO: renamed from: e */
    public AppealInfo f16473e;

    /* JADX INFO: renamed from: f */
    public Frag f16474f;

    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ FollowshipCounters m18146O0(TabName tabName, FollowshipCounters followshipCounters) {
        return followshipCounters;
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ Boolean m18149R0(xaj0 xaj0Var) {
        boolean z = false;
        List listD = zl80.g().d(false);
        if (vwb.J(listD) || (!vwb.J(listD) && ((((PaymentResultWrapper) xaj0Var.a).purchaseType == PurchaseType.TYPE_GET_VIP && TEnum.equals(((Merchandise) listD.get(0)).category, "tttVip")) || (((PaymentResultWrapper) xaj0Var.a).purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && TEnum.equals(((Merchandise) listD.get(0)).category, "svip"))))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m18165j0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public /* synthetic */ void m18172p1(Bundle bundle) {
        ((x020) ((jq2) this).viewModel).m24627V();
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m18181B1(j760 j760Var) {
        new v7c.b(act()).c((DatingGuideData) j760Var.a).a().show();
        CoreModule.c.r2.R.put(Long.valueOf(mqi0.m18550o()));
        CoreModule.c.r2.w3();
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m18183C1(FollowshipCounters followshipCounters) {
        FollowshipCounter followshipCounter = followshipCounters.counters;
        if (followshipCounter.followers + followshipCounter.followings <= 0 || ((Boolean) CoreModule.c.e0.y6.get()).booleanValue()) {
            return;
        }
        ((x020) ((jq2) this).viewModel).m24629X();
        CoreModule.c.e0.y6.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m18184D1(FakeGuideData fakeGuideData) {
        ((x020) ((jq2) this).viewModel).m24625T(fakeGuideData);
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m18185E1(roj0 roj0Var) {
        ((x020) ((jq2) this).viewModel).m24632a0();
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ boolean m18186F1(int i, int i2, Intent intent) {
        if (i2 != -1) {
            return false;
        }
        ark.L0(act(), (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f8209h));
        CoreModule.c.e0.H7();
        return true;
    }

    /* JADX INFO: renamed from: H1 */
    public void m18187H1() {
        o6j0.c("e_sidebar", mo18206v(), new o6j0.a[0]);
        act().startActivity(new Intent((Context) act(), (Class<?>) SidesSlipActivity.class));
        act().overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: I1 */
    public void m18188I1() {
        User userP9 = CoreModule.c.e0.p9();
        o6j0.c("e_my_profile_navigation_appeal_guide", mo18206v(), new o6j0.a[]{o6j0.a.h("ban_user_appeal_state", rc2.m21492e().m21494b())});
        AppealInfo appealInfo = this.f16473e;
        if (!appealInfo.allowAppeal) {
            lsi0.h(R.string.i0);
            return;
        }
        String str = appealInfo.status;
        str.getClass();
        if (str.equals("before")) {
            act().startActivity(CoreModule.H().buildBanReleaseVerifyIntent(act(), (NullChecker.a(userP9.settings) && NullChecker.b(userP9.settings.phoneNumber)) ? userP9.settings.phoneNumber : null));
        } else if (str.equals("inProgress")) {
            act().startActivity(AppealProgressAct.m70Y1(act()));
        }
    }

    /* JADX INFO: renamed from: J1 */
    public void m18189J1() {
        zvf0.r("e_picture_fake_button", mo18206v());
        vpx vpxVar = new vpx();
        vpxVar.a = 1;
        vpxVar.c = false;
        vpxVar.b = false;
        vpxVar.d = true;
        vpxVar.f = MediaPickerAct.D;
        vpxVar.i = CoreModule.c.e0.na().gender;
        act().startActivityForResult(com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct.m9216X1(act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.y0() - t100.d(60.0f)).build()).withFromType(1).build()), new a.a() { // from class: l.f020
            /* JADX INFO: renamed from: a */
            public final boolean m14198a(int i, int i2, Intent intent) {
                return this.f12742a.m18186F1(i, i2, intent);
            }
        });
        act().overridePendingTransition(rzb0.y, 0);
    }

    /* JADX INFO: renamed from: L1 */
    public final void m18190L1(AppealInfo appealInfo) {
        this.f16473e = appealInfo;
        rc2.m21492e().m21499h(appealInfo);
        if (appealInfo == null || !appealInfo.needAppeal) {
            ((x020) ((jq2) this).viewModel).m24630Y(false, "appeal");
        } else {
            ((x020) ((jq2) this).viewModel).m24630Y(true, "appeal");
        }
    }

    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.content.Context, com.p1.mobile.putong.core.newui.main.NewMainAct, java.lang.Object] */
    /* JADX INFO: renamed from: a0 */
    public void m18191a0() {
        super.a0();
        this.f16470b.m22920a0();
        this.f16472d.a0();
        creates(new e30() { // from class: l.py10
            public final void call(Object obj) {
                this.f18963a.m18172p1((Bundle) obj);
            }
        });
        ?? Act = act() instanceof NewMainAct ? act() : 0;
        if (NullChecker.a((Object) Act)) {
            if ((upa.o2() || upa.p2()) && !((Boolean) CoreModule.c.e0.y6.get()).booleanValue() && qqi0.h(1732118400000L, (long) CoreModule.c.e0.p9().createdTime, 0)) {
                duringCreated(mkd0.r(Act.m3895i7().distinctUntilChanged().filter(new w9j() { // from class: l.qy10
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((TabName) obj) == TabName.Me);
                    }
                }), CoreModule.c.e0.o9().map(new w9j() { // from class: l.bz10
                    public final Object call(Object obj) {
                        return ((User) obj).profile.followships;
                    }
                }).distinctUntilChanged(), new x9j() { // from class: l.mz10
                    public final Object call(Object obj, Object obj2) {
                        return m020.m18146O0((TabName) obj, (FollowshipCounters) obj2);
                    }
                })).subscribe(mkd0.G(new e30() { // from class: l.yz10
                    public final void call(Object obj) {
                        this.f23295a.m18183C1((FollowshipCounters) obj);
                    }
                }));
            }
            duringCreated(mkd0.r(Act.m3895i7().distinctUntilChanged().filter(new w9j() { // from class: l.zz10
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Me);
                }
            }), lifecycle().filter(new w9j() { // from class: l.a020
                public final Object call(Object obj) {
                    return Boolean.valueOf(((c) obj) == c.i);
                }
            }), new x9j() { // from class: l.b020
                public final Object call(Object obj, Object obj2) {
                    return roj0.a;
                }
            })).take(1).subscribe(mkd0.G(new e30() { // from class: l.c020
                public final void call(Object obj) {
                    this.f10368a.m18185E1((roj0) obj);
                }
            }));
            rx.c cVarFilter = Act.m3895i7().distinctUntilChanged().filter(new w9j() { // from class: l.d020
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Me);
                }
            });
            rx.c cVarFilter2 = lifecycle().filter(new w9j() { // from class: l.az10
                public final Object call(Object obj) {
                    return Boolean.valueOf(((c) obj) == c.i);
                }
            });
            rx.c cVarDistinctUntilChanged = CoreModule.c.e0.o9().map(new gq30()).distinctUntilChanged();
            rx.c cVarDistinctUntilChanged2 = CoreModule.c.C0.u3(SummarizedPrivilegesId.get("svip")).map(new w9j() { // from class: l.lz10
                public final Object call(Object obj) {
                    return Boolean.valueOf(xma.L3());
                }
            }).distinctUntilChanged();
            roj0 roj0Var = roj0.a;
            duringCreated(mkd0.x(cVarFilter, cVarFilter2, cVarDistinctUntilChanged, cVarDistinctUntilChanged2, rx.c.just(roj0Var), CoreModule.c.C0.u3(SummarizedPrivilegesId.get("oDiamond")).map(new w9j() { // from class: l.wz10
                public final Object call(Object obj) {
                    return Boolean.valueOf(xma.F3());
                }
            }).distinctUntilChanged(), CoreModule.c.c1.x3().map(new w9j() { // from class: l.g020
                public final Object call(Object obj) {
                    return vwb.Y(zl80.g().e(ProductCategory.get("tttVip")), zl80.g().e(ProductCategory.get("svip")));
                }
            }).distinctUntilChanged(), rx.c.just(roj0Var), rx.c.just(roj0Var), new eaj() { // from class: l.h020
                /* JADX INFO: renamed from: a */
                public final Object m15372a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
                    return roj0.a;
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.i020
                public final void call(Object obj) {
                    this.f14323a.m18201q1((roj0) obj);
                }
            }));
            duringCreated(mkd0.s(ah60.m11408E().observeOn(jo0.a()), e.v((Context) Act, PurchaseType.TYPE_GET_VIP), e.v((Context) Act, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE), new y9j() { // from class: l.j020
                /* JADX INFO: renamed from: a */
                public final Object m16812a(Object obj, Object obj2, Object obj3) {
                    return new xaj0((PaymentResultWrapper) obj, (d) obj2, (d) obj3);
                }
            }).observeOn(jo0.a())).filter(new w9j() { // from class: l.k020
                public final Object call(Object obj) {
                    return m020.m18149R0((xaj0) obj);
                }
            }).take(1).subscribe(mkd0.G(new e30() { // from class: l.l020
                public final void call(Object obj) {
                    zl80.g().l();
                }
            }));
        }
        duringCreated(mkd0.r(CoreModule.c.M0.e3(), CoreModule.c.e0.o9(), new x9j() { // from class: l.ry10
            public final Object call(Object obj, Object obj2) {
                return j760.a((Boolean) obj, (User) obj2);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.sy10
            public final void call(Object obj) {
                this.f20495a.m18202r1((j760) obj);
            }
        }));
        duringCreated(CoreModule.c.B0.j4().distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.ty10
            public final void call(Object obj) {
                this.f20912a.m18203s1((VerificationCenter) obj);
            }
        }));
        if (NullChecker.a((Object) Act)) {
            duringCreated(mkd0.r(Act.m3895i7().distinctUntilChanged().filter(new w9j() { // from class: l.uy10
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Me);
                }
            }), CoreModule.c.j0.E4(), new x9j() { // from class: l.vy10
                public final Object call(Object obj, Object obj2) {
                    return vwb.Y((TabName) obj, (List) obj2);
                }
            }).distinctUntilChanged().map(new w9j() { // from class: l.wy10
                public final Object call(Object obj) {
                    return vwb.n((Collection) ((j760) obj).b, new w9j() { // from class: l.e020
                        public final Object call(Object obj2) {
                            return Boolean.valueOf(rxa0.m21876m((Merchandise) obj2));
                        }
                    });
                }
            }).filter(new w9j() { // from class: l.xy10
                public final Object call(Object obj) {
                    return Boolean.valueOf(!vwb.J((ArrayList) obj));
                }
            }).take(1)).subscribe(mkd0.G(new e30() { // from class: l.yy10
                public final void call(Object obj) {
                    this.f23284a.m18204t1((ArrayList) obj);
                }
            }));
        }
        rx.c.combineLatest(CoreModule.c.e0.o9().map(new gq30()).distinctUntilChanged(), CoreModule.c.C0.u3(SummarizedPrivilegesId.get("svip")).map(new w9j() { // from class: l.zy10
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.L3());
            }
        }).distinctUntilChanged(), new x9j() { // from class: l.cz10
            public final Object call(Object obj, Object obj2) {
                return roj0.a;
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.dz10
            public final void call(Object obj) {
                src0.r().J();
            }
        }));
        duringCreated(mkd0.r(CoreModule.c.e0.C0.distinctUntilChanged(), CoreModule.c.e0.o9().distinctUntilChanged(), new x9j() { // from class: l.ez10
            public final Object call(Object obj, Object obj2) {
                return new j760((AppealInfo) obj, (User) obj2);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.fz10
            public final void call(Object obj) {
                this.f13240a.m18205u1((j760) obj);
            }
        }, new e30() { // from class: l.gz10
            public final void call(Object obj) {
                m020.m18165j0((Throwable) obj);
            }
        }));
        if (upa.V1()) {
            duringCreated(CoreModule.c.g0.H8()).subscribe(mkd0.G(new e30() { // from class: l.hz10
                public final void call(Object obj) {
                    CoreModule.c.m0.l1.put(Boolean.valueOf(upa.I1() && ((NotificationCounter) obj).unread > 0));
                }
            }));
        }
        duringCreated(mkd0.r(CoreModule.c.m0.k1.obs(), CoreModule.c.m0.l1.obs(), new trq())).subscribe(mkd0.G(new e30() { // from class: l.iz10
            public final void call(Object obj) {
                this.f14868a.m18207v1((j760) obj);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.jz10
            public final Object call(Object obj) {
                return Boolean.FALSE;
            }
        }).skip(1).subscribe(mkd0.G(new e30() { // from class: l.kz10
            public final void call(Object obj) {
                this.f15886a.m18208x1((c) obj);
            }
        }));
        if (lqa.o() || upa.e2()) {
            duringCreated(Act.m3895i7().distinctUntilChanged().filter(new w9j() { // from class: l.nz10
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Me);
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.oz10
                public final void call(Object obj) {
                    this.f18301a.m18209z1((TabName) obj);
                }
            }));
        }
        if (upa.L3() && !upa.o2() && !upa.p2()) {
            duringCreated(Act.m3895i7().distinctUntilChanged()).filter(new w9j() { // from class: l.pz10
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Me && wn90.m24339F().m24385S() && !mqi0.m18535D(((Long) CoreModule.c.r2.R.get()).longValue()) && mqi0.m18550o() - ((Long) CoreModule.c.r2.S.get()).longValue() > ((long) upa.L0()) * 60000);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.qz10
                public final void call(Object obj) {
                    CoreModule.c.r2.n3();
                }
            }));
            duringCreated(CoreModule.c.r2.y3()).filter(new w9j() { // from class: l.rz10
                public final Object call(Object obj) {
                    j760 j760Var = (j760) obj;
                    return Boolean.valueOf(j760Var != null && Boolean.FALSE.equals(j760Var.b));
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.sz10
                public final void call(Object obj) {
                    this.f20501a.m18181B1((j760) obj);
                }
            }));
        }
        ((x020) ((jq2) this).viewModel).m18288f();
        if (CoreModule.c.e0.i8()) {
            duringCreated(v930.k().filter(new w9j() { // from class: l.tz10
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Me);
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.uz10
                public final void call(Object obj) {
                    CoreModule.c.e0.xa();
                }
            }));
            duringCreated(CoreModule.c.e0.V6).subscribe(mkd0.G(new e30() { // from class: l.vz10
                public final void call(Object obj) {
                    this.f21823a.m18184D1((FakeGuideData) obj);
                }
            }));
        }
        if (upa.z2() || upa.A2()) {
            creates(new e30() { // from class: l.xz10
                public final void call(Object obj) {
                    CoreModule.c.r2.q3();
                }
            });
        }
    }

    public void destroy() {
        this.f16470b.destroy();
        this.f16472d.destroy();
    }

    @Override // p009l.qta0
    /* JADX INFO: renamed from: e0 */
    public void mo18192e0(int i, int i2, Intent intent) {
        super.mo18192e0(i, i2, intent);
        if (NullChecker.a(this.f16472d)) {
            this.f16472d.mo14155f0(i, i2, intent);
        }
    }

    @Override // p009l.qta0
    /* JADX INFO: renamed from: g0 */
    public void mo13933g0(boolean z) {
        this.f16470b.m22926f1(z);
        this.f16472d.mo14156g0(z);
        if (z) {
            return;
        }
        CoreLikers coreLikers = CoreModule.c.u0;
        coreLikers.o7(((Long) coreLikers.p0.get()).longValue());
    }

    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public void m18182C(x020 x020Var) {
        super.C(x020Var);
        m18199n1();
        if (upa.p2()) {
            m18198m1();
        } else {
            m18197l1();
        }
    }

    /* JADX INFO: renamed from: i1 */
    public hx10 m18194i1() {
        return this.f16472d;
    }

    /* JADX INFO: renamed from: j1 */
    public rta0 m18195j1() {
        return this.f16471c;
    }

    /* JADX INFO: renamed from: k1 */
    public uh40 m18196k1() {
        return this.f16469a;
    }

    /* JADX INFO: renamed from: l1 */
    public final void m18197l1() {
        this.f16471c = new hy10(Y());
        ey10 ey10Var = new ey10(this.f16474f);
        this.f16472d = ey10Var;
        ey10Var.C(this.f16471c);
    }

    /* JADX INFO: renamed from: m1 */
    public final void m18198m1() {
        this.f16471c = new oy10(this.f16474f);
        ny10 ny10Var = new ny10(this.f16474f);
        this.f16472d = ny10Var;
        ny10Var.C(this.f16471c);
    }

    /* JADX INFO: renamed from: n1 */
    public final void m18199n1() {
        this.f16469a = new uh40(Y());
        ug40 ug40Var = new ug40(this.f16474f);
        this.f16470b = ug40Var;
        ug40Var.m22911N0(this.f16469a, this);
    }

    /* JADX INFO: renamed from: o1 */
    public boolean m18200o1() {
        return ((x020) ((jq2) this).viewModel).m18289i();
    }

    @Override // p009l.qta0
    public String pageId() {
        return "p_navigation_view";
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m18201q1(roj0 roj0Var) {
        ((x020) ((jq2) this).viewModel).m24632a0();
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m18202r1(j760 j760Var) {
        ((x020) ((jq2) this).viewModel).m24628W(1, ((Boolean) j760Var.a).booleanValue() && !((User) j760Var.b).isIdCardVerified());
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m18203s1(VerificationCenter verificationCenter) {
        ((x020) ((jq2) this).viewModel).m18291k();
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m18204t1(ArrayList arrayList) {
        long jRound = Math.round(((Coupon) ((Merchandise) arrayList.get(0)).localCoupons.get(0)).endTime);
        xni.m24946a().m24949d(jRound);
        if (xni.m24946a().m24951f(jRound)) {
            xni.m24946a().m24950e();
        }
        xni.m24946a().f22672h = true;
        act().m3900n7();
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m18205u1(j760 j760Var) {
        ((x020) ((jq2) this).viewModel).m24631Z(j760Var);
        m18190L1((AppealInfo) j760Var.a);
    }

    @Override // p009l.s5k0
    /* JADX INFO: renamed from: v */
    public String mo18206v() {
        return pageId();
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m18207v1(j760 j760Var) {
        ((x020) ((jq2) this).viewModel).m24628W(6, ((Boolean) j760Var.a).booleanValue() || ((Boolean) j760Var.b).booleanValue());
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m18208x1(c cVar) {
        ((x020) ((jq2) this).viewModel).m24626U();
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m18209z1(TabName tabName) {
        ((x020) ((jq2) this).viewModel).m24624S();
    }
}
