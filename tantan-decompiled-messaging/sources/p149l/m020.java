package p149l;

import android.content.Intent;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.data.AppealInfo;
import com.p046p1.mobile.putong.core.data.DatingGuideData;
import com.p046p1.mobile.putong.core.data.FakeGuideData;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.NotificationCounter;
import com.p046p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.newui.appeal.AppealProgressAct;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.SidesSlipActivity;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8766e;
import com.p046p1.mobile.putong.data.FollowshipCounter;
import com.p046p1.mobile.putong.data.FollowshipCounters;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.OMSSwipeMoment;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class m020 extends qta0<x020> implements s5k0 {

    /* JADX INFO: renamed from: a */
    public uh40 f130700a;

    /* JADX INFO: renamed from: b */
    public ug40 f130701b;

    /* JADX INFO: renamed from: c */
    public rta0 f130702c;

    /* JADX INFO: renamed from: d */
    public hx10 f130703d;

    /* JADX INFO: renamed from: e */
    public AppealInfo f130704e;

    /* JADX INFO: renamed from: f */
    public Frag f130705f;

    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ FollowshipCounters m152422O0(TabName tabName, FollowshipCounters followshipCounters) {
        return followshipCounters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ Boolean m152425R0(xaj0 xaj0Var) {
        boolean z = false;
        List<Merchandise> listM219257d = zl80.m219252g().m219257d(false);
        if (vwb.m200296J(listM219257d) || (!vwb.m200296J(listM219257d) && ((((PaymentResultWrapper) xaj0Var.f191751a).purchaseType == PurchaseType.TYPE_GET_VIP && TEnum.equals(listM219257d.get(0).category, ProductCategory.tttVip)) || (((PaymentResultWrapper) xaj0Var.f191751a).purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && TEnum.equals(listM219257d.get(0).category, "svip"))))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m152441j0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public /* synthetic */ void m152448p1(Bundle bundle) {
        ((x020) this.viewModel).m206564V();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m152457B1(j760 j760Var) {
        new v7c.C20593b(act()).m197375c((DatingGuideData) j760Var.f116564a).m197373a().show();
        CoreModule.f17545c.f19680r2.f113511R.put(Long.valueOf(mqi0.m155944o()));
        CoreModule.f17545c.f19680r2.m136533w3();
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m152458C1(FollowshipCounters followshipCounters) {
        FollowshipCounter followshipCounter = followshipCounters.counters;
        if (followshipCounter.followers + followshipCounter.followings <= 0 || CoreModule.f17545c.f19639e0.f149513y6.get().booleanValue()) {
            return;
        }
        ((x020) this.viewModel).m206566X();
        CoreModule.f17545c.f19639e0.f149513y6.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m152459D1(FakeGuideData fakeGuideData) {
        ((x020) this.viewModel).m206562T(fakeGuideData);
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m152460E1(roj0 roj0Var) {
        ((x020) this.viewModel).m206569a0();
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ boolean m152461F1(int i, int i2, Intent intent) {
        if (i2 != -1) {
            return false;
        }
        ark.m98433L0(act(), (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h));
        CoreModule.f17545c.f19639e0.m169395H7();
        return true;
    }

    /* JADX INFO: renamed from: H1 */
    public void m152462H1() {
        o6j0.m162859c("e_sidebar", mo152480v(), new o6j0.C18854a[0]);
        act().startActivity(new Intent(act(), (Class<?>) SidesSlipActivity.class));
        act().overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: I1 */
    public void m152463I1() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        o6j0.m162859c("e_my_profile_navigation_appeal_guide", mo152480v(), o6j0.C18854a.m162878h("ban_user_appeal_state", rc2.m178723e().m178725b()));
        AppealInfo appealInfo = this.f130704e;
        if (!appealInfo.allowAppeal) {
            lsi0.m151578h(R$string.f18594i0);
            return;
        }
        String str = appealInfo.status;
        str.getClass();
        if (str.equals(OMSSwipeMoment.before)) {
            act().startActivity(CoreModule.m29931H().buildBanReleaseVerifyIntent(act(), (NullChecker.m81303a(userM169527p9.settings) && NullChecker.m81304b(userM169527p9.settings.phoneNumber)) ? userM169527p9.settings.phoneNumber : null));
        } else if (str.equals("inProgress")) {
            act().startActivity(AppealProgressAct.m36171Y1(act()));
        }
    }

    /* JADX INFO: renamed from: J1 */
    public void m152464J1() {
        zvf0.m220396r("e_picture_fake_button", mo152480v());
        vpx vpxVar = new vpx();
        vpxVar.f182531a = 1;
        vpxVar.f182533c = false;
        vpxVar.f182532b = false;
        vpxVar.f182534d = true;
        vpxVar.f182536f = MediaPickerAct.f30623D;
        vpxVar.f182539i = CoreModule.f17545c.f19639e0.m169520na().gender;
        act().startActivityForResult(com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct.m78919X1(act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.m208412y0() - t100.m186890d(60.0f)).build()).withFromType(1).build()), new C4317a.a() { // from class: l.f020
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return this.f93954a.m152461F1(i, i2, intent);
            }
        });
        act().overridePendingTransition(rzb0.f161653y, 0);
    }

    /* JADX INFO: renamed from: L1 */
    public final void m152465L1(AppealInfo appealInfo) {
        this.f130704e = appealInfo;
        rc2.m178723e().m178730h(appealInfo);
        if (appealInfo == null || !appealInfo.needAppeal) {
            ((x020) this.viewModel).m206567Y(false, "appeal");
        } else {
            ((x020) this.viewModel).m206567Y(true, "appeal");
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        this.f130701b.mo39470a0();
        this.f130703d.mo39470a0();
        creates(new e30() { // from class: l.py10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151776a.m152448p1((Bundle) obj);
            }
        });
        NewMainAct newMainAct = act() instanceof NewMainAct ? (NewMainAct) act() : null;
        if (NullChecker.m81303a(newMainAct)) {
            if ((upa.m194795o2() || upa.m194800p2()) && !CoreModule.f17545c.f19639e0.f149513y6.get().booleanValue() && qqi0.m175940h(1732118400000L, (long) CoreModule.f17545c.f19639e0.m169527p9().createdTime, 0)) {
                duringCreated(mkd0.m154984r(newMainAct.m39819i7().distinctUntilChanged().filter(new w9j() { // from class: l.qy10
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((TabName) obj) == TabName.Me);
                    }
                }), CoreModule.f17545c.f19639e0.m169523o9().map(new w9j() { // from class: l.bz10
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((User) obj).profile.followships;
                    }
                }).distinctUntilChanged(), new x9j() { // from class: l.mz10
                    @Override // p149l.x9j
                    public final Object call(Object obj, Object obj2) {
                        return m020.m152422O0((TabName) obj, (FollowshipCounters) obj2);
                    }
                })).subscribe(mkd0.m154955G(new e30() { // from class: l.yz10
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f200842a.m152458C1((FollowshipCounters) obj);
                    }
                }));
            }
            duringCreated(mkd0.m154984r(newMainAct.m39819i7().distinctUntilChanged().filter(new w9j() { // from class: l.zz10
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Me);
                }
            }), lifecycle().filter(new w9j() { // from class: l.a020
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
                }
            }), new x9j() { // from class: l.b020
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return roj0.f160388a;
                }
            })).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.c020
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f78101a.m152460E1((roj0) obj);
                }
            }));
            C22306c<TabName> c22306cFilter = newMainAct.m39819i7().distinctUntilChanged().filter(new w9j() { // from class: l.d020
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Me);
                }
            });
            C22306c<C4319c> c22306cFilter2 = lifecycle().filter(new w9j() { // from class: l.az10
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
                }
            });
            C22306c c22306cDistinctUntilChanged = CoreModule.f17545c.f19639e0.m169523o9().map(new gq30()).distinctUntilChanged();
            C22306c c22306cDistinctUntilChanged2 = CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip")).map(new w9j() { // from class: l.lz10
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(xma.m210047L3());
                }
            }).distinctUntilChanged();
            roj0 roj0Var = roj0.f160388a;
            duringCreated(mkd0.m154990x(c22306cFilter, c22306cFilter2, c22306cDistinctUntilChanged, c22306cDistinctUntilChanged2, C22306c.just(roj0Var), CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("oDiamond")).map(new w9j() { // from class: l.wz10
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(xma.m210043F3());
                }
            }).distinctUntilChanged(), CoreModule.f17545c.f19634c1.m137870x3().map(new w9j() { // from class: l.g020
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return vwb.m200311Y(zl80.m219252g().m219258e(ProductCategory.get(ProductCategory.tttVip)), zl80.m219252g().m219258e(ProductCategory.get("svip")));
                }
            }).distinctUntilChanged(), C22306c.just(roj0Var), C22306c.just(roj0Var), new eaj() { // from class: l.h020
                @Override // p149l.eaj
                /* JADX INFO: renamed from: a */
                public final Object mo99191a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
                    return roj0.f160388a;
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.i020
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f110255a.m152475q1((roj0) obj);
                }
            }));
            duringCreated(mkd0.m154985s(ah60.m96370E().observeOn(jo0.m142408a()), C8766e.m53648v(newMainAct, PurchaseType.TYPE_GET_VIP), C8766e.m53648v(newMainAct, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE), new y9j() { // from class: l.j020
                @Override // p149l.y9j
                /* JADX INFO: renamed from: a */
                public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                    return new xaj0((PaymentResultWrapper) obj, (C8765d) obj2, (C8765d) obj3);
                }
            }).observeOn(jo0.m142408a())).filter(new w9j() { // from class: l.k020
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return m020.m152425R0((xaj0) obj);
                }
            }).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.l020
                @Override // p149l.e30
                public final void call(Object obj) {
                    zl80.m219252g().m219260l();
                }
            }));
        }
        duringCreated(mkd0.m154984r(CoreModule.f17545c.f19585M0.m129481e3(), CoreModule.f17545c.f19639e0.m169523o9(), new x9j() { // from class: l.ry10
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return j760.m140076a((Boolean) obj, (User) obj2);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.sy10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166881a.m152476r1((j760) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19552B0.m31611j4().distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.ty10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172556a.m152477s1((VerificationCenter) obj);
            }
        }));
        if (NullChecker.m81303a(newMainAct)) {
            duringCreated(mkd0.m154984r(newMainAct.m39819i7().distinctUntilChanged().filter(new w9j() { // from class: l.uy10
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Me);
                }
            }), CoreModule.f17545c.f19654j0.m30580E4(), new x9j() { // from class: l.vy10
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return vwb.m200311Y((TabName) obj, (List) obj2);
                }
            }).distinctUntilChanged().map(new w9j() { // from class: l.wy10
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return vwb.m200339n((Collection) ((j760) obj).f116565b, new w9j() { // from class: l.e020
                        @Override // p149l.w9j
                        public final Object call(Object obj2) {
                            return Boolean.valueOf(rxa0.m181492m((Merchandise) obj2));
                        }
                    });
                }
            }).filter(new w9j() { // from class: l.xy10
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!vwb.m200296J((ArrayList) obj));
                }
            }).take(1)).subscribe(mkd0.m154955G(new e30() { // from class: l.yy10
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f200706a.m152478t1((ArrayList) obj);
                }
            }));
        }
        C22306c.combineLatest(CoreModule.f17545c.f19639e0.m169523o9().map(new gq30()).distinctUntilChanged(), CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip")).map(new w9j() { // from class: l.zy10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.m210047L3());
            }
        }).distinctUntilChanged(), new x9j() { // from class: l.cz10
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return roj0.f160388a;
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.dz10
            @Override // p149l.e30
            public final void call(Object obj) {
                src0.m185656r().m185667J();
            }
        }));
        duringCreated(mkd0.m154984r(CoreModule.f17545c.f19639e0.f149148C0.distinctUntilChanged(), CoreModule.f17545c.f19639e0.m169523o9().distinctUntilChanged(), new x9j() { // from class: l.ez10
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return new j760((AppealInfo) obj, (User) obj2);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.fz10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99926a.m152479u1((j760) obj);
            }
        }, new e30() { // from class: l.gz10
            @Override // p149l.e30
            public final void call(Object obj) {
                m020.m152441j0((Throwable) obj);
            }
        }));
        if (upa.m194706V1()) {
            duringCreated(CoreModule.f17545c.f19645g0.m31811H8()).subscribe(mkd0.m154955G(new e30() { // from class: l.hz10
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19663m0.f19428l1.put(Boolean.valueOf(upa.m194648I1() && ((NotificationCounter) obj).unread > 0));
                }
            }));
        }
        duringCreated(mkd0.m154984r(CoreModule.f17545c.f19663m0.f19425k1.obs(), CoreModule.f17545c.f19663m0.f19428l1.obs(), new trq())).subscribe(mkd0.m154955G(new e30() { // from class: l.iz10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115525a.m152481v1((j760) obj);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.jz10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.FALSE;
            }
        }).skip(1).subscribe(mkd0.m154955G(new e30() { // from class: l.kz10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125350a.m152482x1((C4319c) obj);
            }
        }));
        if (lqa.m150977o() || upa.m194745e2()) {
            duringCreated(newMainAct.m39819i7().distinctUntilChanged().filter(new w9j() { // from class: l.nz10
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Me);
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.oz10
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f146378a.m152483z1((TabName) obj);
                }
            }));
        }
        if (upa.m194665L3() && !upa.m194795o2() && !upa.m194800p2()) {
            duringCreated(newMainAct.m39819i7().distinctUntilChanged()).filter(new w9j() { // from class: l.pz10
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Me && wn90.m204602F().m204648S() && !mqi0.m155929D(CoreModule.f17545c.f19680r2.f113511R.get().longValue()) && mqi0.m155944o() - CoreModule.f17545c.f19680r2.f113512S.get().longValue() > ((long) upa.m194662L0()) * Constants.ONE_MIN_IN_MILLIS);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.qz10
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19680r2.m136524n3();
                }
            }));
            duringCreated(CoreModule.f17545c.f19680r2.m136535y3()).filter(new w9j() { // from class: l.rz10
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    j760 j760Var = (j760) obj;
                    return Boolean.valueOf(j760Var != null && Boolean.FALSE.equals(j760Var.f116565b));
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.sz10
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f167011a.m152457B1((j760) obj);
                }
            }));
        }
        ((x020) this.viewModel).m153342f();
        if (CoreModule.f17545c.f19639e0.m169498i8()) {
            duringCreated(v930.m197537k().filter(new w9j() { // from class: l.tz10
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Me);
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.uz10
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19639e0.m169560xa();
                }
            }));
            duringCreated(CoreModule.f17545c.f19639e0.f149292V6).subscribe(mkd0.m154955G(new e30() { // from class: l.vz10
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f183579a.m152459D1((FakeGuideData) obj);
                }
            }));
        }
        if (upa.m194850z2() || upa.m194609A2()) {
            creates(new e30() { // from class: l.xz10
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19680r2.m136527q3();
                }
            });
        }
    }

    @Override // p149l.q0m
    public void destroy() {
        this.f130701b.destroy();
        this.f130703d.destroy();
    }

    @Override // p149l.qta0
    /* JADX INFO: renamed from: e0 */
    public void mo152466e0(int i, int i2, Intent intent) {
        super.mo152466e0(i, i2, intent);
        if (NullChecker.m81303a(this.f130703d)) {
            this.f130703d.mo118745f0(i, i2, intent);
        }
    }

    @Override // p149l.qta0
    /* JADX INFO: renamed from: g0 */
    public void mo116222g0(boolean z) {
        this.f130701b.m193527f1(z);
        this.f130703d.mo118746g0(z);
        if (z) {
            return;
        }
        CoreLikers coreLikers = CoreModule.f17545c.f19687u0;
        coreLikers.m30464o7(coreLikers.f19259p0.get().longValue());
    }

    @Override // p149l.jq2, p149l.q0m
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public void mo51532C(x020 x020Var) {
        super.mo51532C(x020Var);
        m152473n1();
        if (upa.m194800p2()) {
            m152472m1();
        } else {
            m152471l1();
        }
    }

    /* JADX INFO: renamed from: i1 */
    public hx10 m152468i1() {
        return this.f130703d;
    }

    /* JADX INFO: renamed from: j1 */
    public rta0 m152469j1() {
        return this.f130702c;
    }

    /* JADX INFO: renamed from: k1 */
    public uh40 m152470k1() {
        return this.f130700a;
    }

    /* JADX INFO: renamed from: l1 */
    public final void m152471l1() {
        this.f130702c = new hy10(m142773Y());
        ey10 ey10Var = new ey10(this.f130705f);
        this.f130703d = ey10Var;
        ey10Var.mo51532C(this.f130702c);
    }

    /* JADX INFO: renamed from: m1 */
    public final void m152472m1() {
        this.f130702c = new oy10(this.f130705f);
        ny10 ny10Var = new ny10(this.f130705f);
        this.f130703d = ny10Var;
        ny10Var.mo51532C(this.f130702c);
    }

    /* JADX INFO: renamed from: n1 */
    public final void m152473n1() {
        this.f130700a = new uh40(m142773Y());
        ug40 ug40Var = new ug40(this.f130705f);
        this.f130701b = ug40Var;
        ug40Var.m193513N0(this.f130700a, this);
    }

    /* JADX INFO: renamed from: o1 */
    public boolean m152474o1() {
        return ((x020) this.viewModel).m153343i();
    }

    @Override // p149l.qta0
    public String pageId() {
        return OMSDialogPositon.p_navigation_view;
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m152475q1(roj0 roj0Var) {
        ((x020) this.viewModel).m206569a0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m152476r1(j760 j760Var) {
        ((x020) this.viewModel).m206565W(1, ((Boolean) j760Var.f116564a).booleanValue() && !((User) j760Var.f116565b).isIdCardVerified());
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m152477s1(VerificationCenter verificationCenter) {
        ((x020) this.viewModel).m153345k();
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m152478t1(ArrayList arrayList) {
        long jRound = Math.round(((Merchandise) arrayList.get(0)).localCoupons.get(0).endTime);
        xni.m210163a().m210166d(jRound);
        if (xni.m210163a().m210168f(jRound)) {
            xni.m210163a().m210167e();
        }
        xni.m210163a().f193696h = true;
        ((NewMainAct) act()).m39824n7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m152479u1(j760 j760Var) {
        ((x020) this.viewModel).m206568Z(j760Var);
        m152465L1((AppealInfo) j760Var.f116564a);
    }

    @Override // p149l.s5k0
    /* JADX INFO: renamed from: v */
    public String mo152480v() {
        return pageId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m152481v1(j760 j760Var) {
        ((x020) this.viewModel).m206565W(6, ((Boolean) j760Var.f116564a).booleanValue() || ((Boolean) j760Var.f116565b).booleanValue());
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m152482x1(C4319c c4319c) {
        ((x020) this.viewModel).m206563U();
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m152483z1(TabName tabName) {
        ((x020) this.viewModel).m206561S();
    }
}
