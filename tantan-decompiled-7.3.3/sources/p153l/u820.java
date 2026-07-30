package p153l;

import android.content.Intent;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.data.AppealInfo;
import com.p051p1.mobile.putong.core.data.DatingGuideData;
import com.p051p1.mobile.putong.core.data.FakeGuideData;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.NotificationCounter;
import com.p051p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.newui.appeal.AppealProgressAct;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.SidesSlipActivity;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8929e;
import com.p051p1.mobile.putong.data.FollowshipCounter;
import com.p051p1.mobile.putong.data.FollowshipCounters;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.OMSSwipeMoment;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class u820 extends u1b0<f920> implements yek0 {

    /* JADX INFO: renamed from: a */
    public iq40 f177965a;

    /* JADX INFO: renamed from: b */
    public ip40 f177966b;

    /* JADX INFO: renamed from: c */
    public v1b0 f177967c;

    /* JADX INFO: renamed from: d */
    public p520 f177968d;

    /* JADX INFO: renamed from: e */
    public AppealInfo f177969e;

    /* JADX INFO: renamed from: f */
    public Frag f177970f;

    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ FollowshipCounters m194921O0(TabName tabName, FollowshipCounters followshipCounters) {
        return followshipCounters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ Boolean m194924R0(bkj0 bkj0Var) {
        boolean z = false;
        List<Merchandise> listM118111d = du80.m118106g().m118111d(false);
        if (jyb.m147479J(listM118111d) || (!jyb.m147479J(listM118111d) && ((((PaymentResultWrapper) bkj0Var.f77081a).purchaseType == PurchaseType.TYPE_GET_VIP && TEnum.equals(listM118111d.get(0).category, ProductCategory.tttVip)) || (((PaymentResultWrapper) bkj0Var.f77081a).purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && TEnum.equals(listM118111d.get(0).category, "svip"))))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m194940j0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public /* synthetic */ void m194947p1(Bundle bundle) {
        ((f920) this.viewModel).m124618V();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m194956B1(pf60 pf60Var) {
        new b9c.C15951b(act()).m103090c((DatingGuideData) pf60Var.f152156a).m103088a().show();
        CoreModule.f18264c.f20422r2.f137249R.put(Long.valueOf(pzi0.m174454o()));
        CoreModule.f18264c.f20422r2.m158748w3();
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m194957C1(FollowshipCounters followshipCounters) {
        FollowshipCounter followshipCounter = followshipCounters.counters;
        if (followshipCounter.followers + followshipCounter.followings <= 0 || CoreModule.f18264c.f20381e0.f89370y6.get().booleanValue()) {
            return;
        }
        ((f920) this.viewModel).m124620X();
        CoreModule.f18264c.f20381e0.f89370y6.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m194958D1(FakeGuideData fakeGuideData) {
        ((f920) this.viewModel).m124616T(fakeGuideData);
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m194959E1(uxj0 uxj0Var) {
        ((f920) this.viewModel).m124623a0();
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ boolean m194960F1(int i, int i2, Intent intent) {
        if (i2 != -1) {
            return false;
        }
        qtk.m177983L0(act(), (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h));
        CoreModule.f18264c.f20381e0.m116468H7();
        return true;
    }

    /* JADX INFO: renamed from: H1 */
    public void m194961H1() {
        sfj0.m185596c("e_sidebar", mo194978v(), new sfj0.C20032a[0]);
        act().startActivity(new Intent(act(), (Class<?>) SidesSlipActivity.class));
        act().overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: I1 */
    public void m194962I1() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        sfj0.m185596c("e_my_profile_navigation_appeal_guide", mo194978v(), sfj0.C20032a.m185615h("ban_user_appeal_state", yc2.m215118e().m215120b()));
        AppealInfo appealInfo = this.f177969e;
        if (!appealInfo.allowAppeal) {
            o1j0.m165634h(R$string.f19324i0);
            return;
        }
        String str = appealInfo.status;
        str.getClass();
        if (str.equals(OMSSwipeMoment.before)) {
            act().startActivity(CoreModule.m30929H().buildBanReleaseVerifyIntent(act(), (NullChecker.m82486a(userM116600p9.settings) && NullChecker.m82487b(userM116600p9.settings.phoneNumber)) ? userM116600p9.settings.phoneNumber : null));
        } else if (str.equals("inProgress")) {
            act().startActivity(AppealProgressAct.m37174Z1(act()));
        }
    }

    /* JADX INFO: renamed from: J1 */
    public void m194963J1() {
        i4g0.m138520r("e_picture_fake_button", mo194978v());
        syx syxVar = new syx();
        syxVar.f171323a = 1;
        syxVar.f171325c = false;
        syxVar.f171324b = false;
        syxVar.f171326d = true;
        syxVar.f171328f = MediaPickerAct.f31471D;
        syxVar.f171331i = CoreModule.f18264c.f20381e0.m116593na().gender;
        act().startActivityForResult(com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct.m80102Y1(act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(bnl0.m105592y0() - qa00.m175859d(60.0f)).build()).withFromType(1).build()), new C4468a.a() { // from class: l.n820
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return this.f140645a.m194960F1(i, i2, intent);
            }
        });
        act().overridePendingTransition(x7c0.f192710y, 0);
    }

    /* JADX INFO: renamed from: L1 */
    public final void m194964L1(AppealInfo appealInfo) {
        this.f177969e = appealInfo;
        yc2.m215118e().m215125h(appealInfo);
        if (appealInfo == null || !appealInfo.needAppeal) {
            ((f920) this.viewModel).m124621Y(false, "appeal");
        } else {
            ((f920) this.viewModel).m124621Y(true, "appeal");
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        this.f177966b.mo40473a0();
        this.f177968d.mo40473a0();
        creates(new y20() { // from class: l.x620
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192553a.m194947p1((Bundle) obj);
            }
        });
        NewMainAct newMainAct = act() instanceof NewMainAct ? (NewMainAct) act() : null;
        if (NullChecker.m82486a(newMainAct)) {
            if ((gra.m131726o2() || gra.m131731p2()) && !CoreModule.f18264c.f20381e0.f89370y6.get().booleanValue() && tzi0.m193670h(1732118400000L, (long) CoreModule.f18264c.f20381e0.m116600p9().createdTime, 0)) {
                duringCreated(psd0.m173625r(newMainAct.m40829o7().distinctUntilChanged().filter(new qcj() { // from class: l.y620
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((TabName) obj) == TabName.Me);
                    }
                }), CoreModule.f18264c.f20381e0.m116596o9().map(new qcj() { // from class: l.j720
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((User) obj).profile.followships;
                    }
                }).distinctUntilChanged(), new rcj() { // from class: l.u720
                    @Override // p153l.rcj
                    public final Object call(Object obj, Object obj2) {
                        return u820.m194921O0((TabName) obj, (FollowshipCounters) obj2);
                    }
                })).subscribe(psd0.m173596G(new y20() { // from class: l.g820
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f102639a.m194957C1((FollowshipCounters) obj);
                    }
                }));
            }
            duringCreated(psd0.m173625r(newMainAct.m40829o7().distinctUntilChanged().filter(new qcj() { // from class: l.h820
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Me);
                }
            }), lifecycle().filter(new qcj() { // from class: l.i820
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
                }
            }), new rcj() { // from class: l.j820
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return uxj0.f181467a;
                }
            })).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.k820
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f124350a.m194959E1((uxj0) obj);
                }
            }));
            C22421c<TabName> c22421cFilter = newMainAct.m40829o7().distinctUntilChanged().filter(new qcj() { // from class: l.l820
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Me);
                }
            });
            C22421c<C4470c> c22421cFilter2 = lifecycle().filter(new qcj() { // from class: l.i720
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
                }
            });
            C22421c c22421cDistinctUntilChanged = CoreModule.f18264c.f20381e0.m116596o9().map(new uy30()).distinctUntilChanged();
            C22421c c22421cDistinctUntilChanged2 = CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip")).map(new qcj() { // from class: l.t720
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(joa.m146361M3());
                }
            }).distinctUntilChanged();
            uxj0 uxj0Var = uxj0.f181467a;
            duringCreated(psd0.m173631x(c22421cFilter, c22421cFilter2, c22421cDistinctUntilChanged, c22421cDistinctUntilChanged2, C22421c.just(uxj0Var), CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("oDiamond")).map(new qcj() { // from class: l.e820
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(joa.m146357G3());
                }
            }).distinctUntilChanged(), CoreModule.f18264c.f20376c1.m197857x3().map(new qcj() { // from class: l.o820
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return jyb.m147494Y(du80.m118106g().m118112e(ProductCategory.get(ProductCategory.tttVip)), du80.m118106g().m118112e(ProductCategory.get("svip")));
                }
            }).distinctUntilChanged(), C22421c.just(uxj0Var), C22421c.just(uxj0Var), new ycj() { // from class: l.p820
                @Override // p153l.ycj
                /* JADX INFO: renamed from: a */
                public final Object mo138300a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
                    return uxj0.f181467a;
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.q820
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f156063a.m194973q1((uxj0) obj);
                }
            }));
            duringCreated(psd0.m173626s(fp60.m126543E().observeOn(fo0.m126432a()), C8929e.m54831v(newMainAct, PurchaseType.TYPE_GET_VIP), C8929e.m54831v(newMainAct, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE), new scj() { // from class: l.r820
                @Override // p153l.scj
                /* JADX INFO: renamed from: a */
                public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                    return new bkj0((PaymentResultWrapper) obj, (C8928d) obj2, (C8928d) obj3);
                }
            }).observeOn(fo0.m126432a())).filter(new qcj() { // from class: l.s820
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return u820.m194924R0((bkj0) obj);
                }
            }).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.t820
                @Override // p153l.y20
                public final void call(Object obj) {
                    du80.m118106g().m118114l();
                }
            }));
        }
        duringCreated(psd0.m173625r(CoreModule.f18264c.f20327M0.m194843e3(), CoreModule.f18264c.f20381e0.m116596o9(), new rcj() { // from class: l.z620
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return pf60.m172085a((Boolean) obj, (User) obj2);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.a720
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68784a.m194974r1((pf60) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20294B0.m32614j4().distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.b720
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75248a.m194975s1((VerificationCenter) obj);
            }
        }));
        if (NullChecker.m82486a(newMainAct)) {
            duringCreated(psd0.m173625r(newMainAct.m40829o7().distinctUntilChanged().filter(new qcj() { // from class: l.c720
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Me);
                }
            }), CoreModule.f18264c.f20396j0.m31583E4(), new rcj() { // from class: l.d720
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return jyb.m147494Y((TabName) obj, (List) obj2);
                }
            }).distinctUntilChanged().map(new qcj() { // from class: l.e720
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return jyb.m147522n((Collection) ((pf60) obj).f152157b, new qcj() { // from class: l.m820
                        @Override // p153l.qcj
                        public final Object call(Object obj2) {
                            return Boolean.valueOf(v5b0.m199787m((Merchandise) obj2));
                        }
                    });
                }
            }).filter(new qcj() { // from class: l.f720
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!jyb.m147479J((ArrayList) obj));
                }
            }).take(1)).subscribe(psd0.m173596G(new y20() { // from class: l.g720
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f102504a.m194976t1((ArrayList) obj);
                }
            }));
        }
        C22421c.combineLatest(CoreModule.f18264c.f20381e0.m116596o9().map(new uy30()).distinctUntilChanged(), CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip")).map(new qcj() { // from class: l.h720
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(joa.m146361M3());
            }
        }).distinctUntilChanged(), new rcj() { // from class: l.k720
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return uxj0.f181467a;
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.l720
            @Override // p153l.y20
            public final void call(Object obj) {
                xzc0.m213720r().m213731J();
            }
        }));
        duringCreated(psd0.m173625r(CoreModule.f18264c.f20381e0.f89005C0.distinctUntilChanged(), CoreModule.f18264c.f20381e0.m116596o9().distinctUntilChanged(), new rcj() { // from class: l.m720
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return new pf60((AppealInfo) obj, (User) obj2);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.n720
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140571a.m194977u1((pf60) obj);
            }
        }, new y20() { // from class: l.o720
            @Override // p153l.y20
            public final void call(Object obj) {
                u820.m194940j0((Throwable) obj);
            }
        }));
        if (gra.m131637V1()) {
            duringCreated(CoreModule.f18264c.f20387g0.m32814H8()).subscribe(psd0.m173596G(new y20() { // from class: l.p720
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20405m0.f20170l1.put(Boolean.valueOf(gra.m131579I1() && ((NotificationCounter) obj).unread > 0));
                }
            }));
        }
        duringCreated(psd0.m173625r(CoreModule.f18264c.f20405m0.f20167k1.obs(), CoreModule.f18264c.f20405m0.f20170l1.obs(), new utq())).subscribe(psd0.m173596G(new y20() { // from class: l.q720
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155933a.m194979v1((pf60) obj);
            }
        }));
        lifecycle().filter(new qcj() { // from class: l.r720
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.FALSE;
            }
        }).skip(1).subscribe(psd0.m173596G(new y20() { // from class: l.s720
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166634a.m194980x1((C4470c) obj);
            }
        }));
        if (xra.m212796o() || gra.m131676e2()) {
            duringCreated(newMainAct.m40829o7().distinctUntilChanged().filter(new qcj() { // from class: l.v720
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Me);
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.w720
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f187702a.m194981z1((TabName) obj);
                }
            }));
        }
        if (gra.m131596L3() && !gra.m131726o2() && !gra.m131731p2()) {
            duringCreated(newMainAct.m40829o7().distinctUntilChanged()).filter(new qcj() { // from class: l.x720
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Me && aw90.m100562F().m100608S() && !pzi0.m174439D(CoreModule.f18264c.f20422r2.f137249R.get().longValue()) && pzi0.m174454o() - CoreModule.f18264c.f20422r2.f137250S.get().longValue() > ((long) gra.m131593L0()) * Constants.ONE_MIN_IN_MILLIS);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.y720
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20422r2.m158739n3();
                }
            }));
            duringCreated(CoreModule.f18264c.f20422r2.m158750y3()).filter(new qcj() { // from class: l.z720
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    pf60 pf60Var = (pf60) obj;
                    return Boolean.valueOf(pf60Var != null && Boolean.FALSE.equals(pf60Var.f152157b));
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.a820
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f68884a.m194956B1((pf60) obj);
                }
            }));
        }
        ((f920) this.viewModel).m97582f();
        if (CoreModule.f18264c.f20381e0.m116571i8()) {
            duringCreated(ji30.m144967k().filter(new qcj() { // from class: l.b820
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Me);
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.c820
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20381e0.m116633xa();
                }
            }));
            duringCreated(CoreModule.f18264c.f20381e0.f89149V6).subscribe(psd0.m173596G(new y20() { // from class: l.d820
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f85573a.m194958D1((FakeGuideData) obj);
                }
            }));
        }
        if (gra.m131781z2() || gra.m131540A2()) {
            creates(new y20() { // from class: l.f820
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20422r2.m158742q3();
                }
            });
        }
    }

    @Override // p153l.k3m
    public void destroy() {
        this.f177966b.destroy();
        this.f177968d.destroy();
    }

    @Override // p153l.u1b0
    /* JADX INFO: renamed from: e0 */
    public void mo193949e0(int i, int i2, Intent intent) {
        super.mo193949e0(i, i2, intent);
        if (NullChecker.m82486a(this.f177968d)) {
            this.f177968d.mo157171f0(i, i2, intent);
        }
    }

    @Override // p153l.u1b0
    /* JADX INFO: renamed from: g0 */
    public void mo121680g0(boolean z) {
        this.f177966b.m141440f1(z);
        this.f177968d.mo157172g0(z);
        if (z) {
            return;
        }
        CoreLikers coreLikers = CoreModule.f18264c.f20429u0;
        coreLikers.m31478s7(coreLikers.f20001q0.get().longValue());
    }

    @Override // p153l.ar2, p153l.k3m
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public void mo52715C(f920 f920Var) {
        super.mo52715C(f920Var);
        m194971n1();
        if (gra.m131731p2()) {
            m194970m1();
        } else {
            m194969l1();
        }
    }

    /* JADX INFO: renamed from: i1 */
    public p520 m194966i1() {
        return this.f177968d;
    }

    /* JADX INFO: renamed from: j1 */
    public v1b0 m194967j1() {
        return this.f177967c;
    }

    /* JADX INFO: renamed from: k1 */
    public iq40 m194968k1() {
        return this.f177965a;
    }

    /* JADX INFO: renamed from: l1 */
    public final void m194969l1() {
        this.f177967c = new p620(m99640Y());
        m620 m620Var = new m620(this.f177970f);
        this.f177968d = m620Var;
        m620Var.mo52715C(this.f177967c);
    }

    /* JADX INFO: renamed from: m1 */
    public final void m194970m1() {
        this.f177967c = new w620(this.f177970f);
        v620 v620Var = new v620(this.f177970f);
        this.f177968d = v620Var;
        v620Var.mo52715C(this.f177967c);
    }

    /* JADX INFO: renamed from: n1 */
    public final void m194971n1() {
        this.f177965a = new iq40(m99640Y());
        ip40 ip40Var = new ip40(this.f177970f);
        this.f177966b = ip40Var;
        ip40Var.m141426N0(this.f177965a, this);
    }

    /* JADX INFO: renamed from: o1 */
    public boolean m194972o1() {
        return ((f920) this.viewModel).m97583i();
    }

    @Override // p153l.u1b0
    public String pageId() {
        return OMSDialogPositon.p_navigation_view;
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m194973q1(uxj0 uxj0Var) {
        ((f920) this.viewModel).m124623a0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m194974r1(pf60 pf60Var) {
        ((f920) this.viewModel).m124619W(1, ((Boolean) pf60Var.f152156a).booleanValue() && !((User) pf60Var.f152157b).isIdCardVerified());
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m194975s1(VerificationCenter verificationCenter) {
        ((f920) this.viewModel).m97585k();
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m194976t1(ArrayList arrayList) {
        long jRound = Math.round(((Merchandise) arrayList.get(0)).localCoupons.get(0).endTime);
        tqi.m192301a().m192304d(jRound);
        if (tqi.m192301a().m192306f(jRound)) {
            tqi.m192301a().m192305e();
        }
        tqi.m192301a().f175741h = true;
        ((NewMainAct) act()).m40836t7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m194977u1(pf60 pf60Var) {
        ((f920) this.viewModel).m124622Z(pf60Var);
        m194964L1((AppealInfo) pf60Var.f152156a);
    }

    @Override // p153l.yek0
    /* JADX INFO: renamed from: v */
    public String mo194978v() {
        return pageId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m194979v1(pf60 pf60Var) {
        ((f920) this.viewModel).m124619W(6, ((Boolean) pf60Var.f152156a).booleanValue() || ((Boolean) pf60Var.f152157b).booleanValue());
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m194980x1(C4470c c4470c) {
        ((f920) this.viewModel).m124617U();
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m194981z1(TabName tabName) {
        ((f920) this.viewModel).m124615S();
    }
}
