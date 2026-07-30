package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4750p;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Literatures;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.performance.PerformanceLogUtil;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.performance.ProfileLogEntity;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListFragLocalImpl;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileShareHelper;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p046p1.mobile.putong.data.LikeExtraData;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.PicVerification;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.SwipeExtraScData;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserWealthGradeConfig;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes4.dex */
public class yca0 extends jq2<eea0> {

    /* JADX INFO: renamed from: a */
    public final C22392a<roj0> f197423a;

    /* JADX INFO: renamed from: b */
    public final C22392a<roj0> f197424b;

    /* JADX INFO: renamed from: c */
    public j760<List<Literatures>, List<LiteraturesComments>> f197425c;

    /* JADX INFO: renamed from: d */
    public final vi90 f197426d;

    /* JADX INFO: renamed from: e */
    public final ProfileListFragLocalImpl f197427e;

    /* JADX INFO: renamed from: f */
    public User f197428f;

    /* JADX INFO: renamed from: g */
    public ProfileShareHelper f197429g;

    /* JADX INFO: renamed from: h */
    public User f197430h;

    public yca0(mcr mcrVar, vi90 vi90Var) {
        super(mcrVar);
        this.f197423a = C22392a.m221512b();
        this.f197424b = C22392a.m221512b();
        this.f197427e = (ProfileListFragLocalImpl) mcrVar;
        this.f197426d = vi90Var;
    }

    /* JADX INFO: renamed from: C1 */
    public static /* synthetic */ void m214008C1() {
    }

    @MainThread
    /* JADX INFO: renamed from: F1 */
    private void m214012F1() {
        if (this.f197427e.f33978E) {
            du2.m113670a("[core][profile]", "afterGetUserInfo return by Page Animation");
            this.f197427e.f33979F = true;
            return;
        }
        du2.m113670a("[core][profile]", "afterGetUserInfo refresh list");
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.AFTER_GET_USER_INFO;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        m214030T2(0);
        ((eea0) this.viewModel).m115929T0();
        ((eea0) this.viewModel).m115923Q0();
        ((eea0) this.viewModel).m115921P0();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ Boolean m214015I0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: I1 */
    private void m214016I1(int i) {
        if (i == SwipeDirection.LEFT.getValue() && xp5.m210475o(this.f197426d.m198527b(), this.f197426d.f181561a)) {
            CoreModule.f17545c.f19642f0.m33177wo(this.f197426d.f181564d, false).subscribe(mkd0.m154956H(new e30() { // from class: l.oca0
                @Override // p149l.e30
                public final void call(Object obj) {
                    yca0.m214074t0((roj0) obj);
                }
            }, new e30() { // from class: l.pca0
                @Override // p149l.e30
                public final void call(Object obj) {
                    yca0.m214056l0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m214018L0(Throwable th) {
    }

    /* JADX INFO: renamed from: P1 */
    private void m214022P1() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.uca0
            @Override // p149l.e30
            public final void call(Object obj) {
                PerformanceLogUtil.logSingle(((C4319c) obj).f15557c);
            }
        }));
        duringCreated(this.f197423a).first().observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.paa0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147968a.m214060m2((roj0) obj);
            }
        }, new di0()));
        duringCreated(this.f197423a.throttleLast(1L, TimeUnit.SECONDS).observeOn(jo0.m142408a())).subscribe(mkd0.m154956H(new e30() { // from class: l.qaa0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153518a.m214130n2((roj0) obj);
            }
        }, new di0()));
        duringCreated(CoreModule.m29934N().getMomentLikeChangedSub()).subscribe(mkd0.m154955G(new e30() { // from class: l.raa0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158498a.m214131o2((j760) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19678r0.f20038s0).filter(new w9j() { // from class: l.saa0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f163346a.m214132p2((String) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.taa0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169105a.m214133q2((String) obj);
            }
        }));
        duringCreated(C4750p.f20079f0).subscribe(mkd0.m154955G(new e30() { // from class: l.vaa0
            @Override // p149l.e30
            public final void call(Object obj) {
                yca0.m214025R0((roj0) obj);
            }
        }));
        duringCreated(C4750p.f20080g0).subscribe(mkd0.m154955G(new e30() { // from class: l.waa0
            @Override // p149l.e30
            public final void call(Object obj) {
                yca0.m214034W0((roj0) obj);
            }
        }));
        if ((f9j.m120084a(this.f197426d.f181562b) || m214032U1() || "liked_users_anchor".equals(this.f197426d.f181562b) || this.f197426d.m198507H() || "from_greet_act".equals(this.f197426d.f181562b)) && !this.f197426d.m198510K()) {
            duringCreated((C22306c) CoreModule.f17545c.f19642f0.m32820Ue(this.f197426d.f181564d).map(new w9j() { // from class: l.vca0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Conversation conversation = (Conversation) obj;
                    return Boolean.valueOf(conversation != null && conversation.needCheckValidStatus());
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.wca0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f185666a.m214071r2((Boolean) obj);
                }
            }));
        }
        duringCreated(new v9j() { // from class: l.xca0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f192211a.m214136u2();
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.kaa0
            @Override // p149l.e30
            public final void call(Object obj) {
                yca0.m214051i1((roj0) obj);
            }
        }, new e30() { // from class: l.laa0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127179a.m214137v2((Throwable) obj);
            }
        }));
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.maa0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f132840a.m214138w2((C4319c) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.naa0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f137872a.m214139x2();
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.oaa0
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19552B0.m31617p4(CoreModule.m29931H().userId());
            }
        }));
        duringCreated(CoreModule.f17545c.f19636d0.m215895j3()).subscribe(mkd0.m154950B());
        m214103O1();
    }

    /* JADX INFO: renamed from: Q1 */
    private void m214024Q1() {
        if (this.f197426d.m198510K()) {
            duringCreated(new v9j() { // from class: l.bca0
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f74911a.m214140y2();
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.mca0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f133089a.m214141z2((xaj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m214025R0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: R1 */
    private void m214026R1() {
        creates(new e30() { // from class: l.jaa0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117075a.m214084A2((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(this.f197426d.f181564d)).map(new w9j() { // from class: l.uaa0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).verifications;
            }
        }).distinctUntilChanged().filter(new w9j() { // from class: l.fba0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f96703a.m214085B2((PicVerification) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.qba0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153635a.m214086C2((PicVerification) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S1 */
    private void m214028S1() {
        if (!this.f197426d.m198516Q()) {
            duringCreated(CoreModule.f17545c.f19639e0.m169462Y9(this.f197426d.f181564d, false, true).flatMap(new w9j() { // from class: l.bba0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.f17545c.f19682s1.m34369s3();
                }
            }).map(new w9j() { // from class: l.dba0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f85304a.m214094I2((List) obj);
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.eba0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f90311a.m214096J2((j760) obj);
                }
            }, new e30() { // from class: l.gba0
                @Override // p149l.e30
                public final void call(Object obj) {
                    yca0.m214080x1((Throwable) obj);
                }
            }));
        }
        if (this.f197426d.m198510K()) {
            duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.hba0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f106920a.m214097K2((User) obj);
                }
            }));
            return;
        }
        if (f9j.m120084a(this.f197426d.f181562b)) {
            duringCreated(C22306c.just(roj0.f160388a)).subscribe(mkd0.m154955G(new e30() { // from class: l.iba0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f112357a.m214099L2((roj0) obj);
                }
            }));
        }
        duringCreated(new v9j() { // from class: l.jba0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f117170a.m214088D2();
            }
        }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.kba0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122226a.m214090E2((j760) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19678r0.m34150v5()).filter(new w9j() { // from class: l.lba0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f127283a.m214091F2((j760) obj);
            }
        }).map(new w9j() { // from class: l.mba0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return yca0.m214047g1((j760) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.cba0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80124a.m214093H2((RelationshipStatus) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S2 */
    private void m214029S2(int i) {
        if (i == SwipeDirection.LEFT.getValue() && this.f197426d.m198548x()) {
            cj90.m107130b(this.f197426d.f181564d);
        }
    }

    /* JADX INFO: renamed from: T2 */
    private void m214030T2(int i) {
        if (!this.f197426d.m198510K() && NullChecker.m81303a(this.f197426d.f181561a)) {
            ((eea0) this.viewModel).m115935X0(i);
        }
        if (i == 3 || i == 2) {
            ((eea0) this.viewModel).f90712o.m131812b(new d30() { // from class: l.kca0
                @Override // p149l.d30
                public final void call() {
                    this.f122310a.m214102N2();
                }
            });
        }
    }

    /* JADX INFO: renamed from: U1 */
    private boolean m214032U1() {
        if ("from_portrait_like_list".equals(this.f197426d.f181562b) || TextUtils.equals(this.f197426d.f181562b, "from_mew_tags") || this.f197426d.m198536k() || this.f197426d.m198537m() || this.f197426d.m198534i() || TextUtils.equals(this.f197426d.f181562b, "from_literature_third")) {
            return true;
        }
        if (upa.m194706V1()) {
            return "chat_group".equals(this.f197426d.f181562b) || "chat_group_anonymity".equals(this.f197426d.f181562b) || "group_notification".equals(this.f197426d.f181562b) || "group_notification_anonymity".equals(this.f197426d.f181562b);
        }
        return false;
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m214034W0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: Y2 */
    private void m214037Y2(User user) {
        this.f197428f = user;
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ void m214038a1() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ RelationshipStatus m214047g1(j760 j760Var) {
        return (RelationshipStatus) j760Var.f116565b;
    }

    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ void m214051i1(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ Boolean m214052j0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m214056l0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m2 */
    public /* synthetic */ void m214060m2(roj0 roj0Var) {
        m214012F1();
    }

    /* JADX INFO: renamed from: o1 */
    public static /* synthetic */ void m214064o1(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r2 */
    public /* synthetic */ void m214071r2(Boolean bool) {
        m214030T2(2);
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m214074t0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ void m214080x1(Throwable th) {
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m214084A2(Bundle bundle) {
        m214037Y2(this.f197426d.f181565e.f181586k);
        vi90 vi90Var = this.f197426d;
        vi90Var.m198523X(vi90Var.f181565e.f181586k);
        this.f197423a.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ Boolean m214085B2(PicVerification picVerification) {
        return Boolean.valueOf(!this.f197426d.f181565e.f181586k.verifications.equals(picVerification));
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m214086C2(PicVerification picVerification) {
        this.f197426d.f181565e.f181586k.verifications = picVerification;
        this.f197423a.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: D1 */
    public void m214087D1() {
        LiveService liveService;
        ((eea0) this.viewModel).m115936Y();
        act().m66873d2();
        if (!rlt.m179882c(this.f197426d.f181562b) || this.f197427e.f33977D || (liveService = qib0.f154713b0.f139232c) == null) {
            return;
        }
        liveService.mo67244Tc(act(), this.f197426d.f181564d, true);
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ C22306c m214088D2() {
        return mkd0.m154984r(CoreModule.f17545c.f19639e0.m169410Ka(this.f197426d.f181564d), CoreModule.f17545c.f19639e0.m169523o9(), new g5a0());
    }

    /* JADX INFO: renamed from: E1 */
    public void m214089E1(final int i) {
        m214029S2(i);
        m214016I1(i);
        vi90 vi90Var = this.f197426d;
        if (vi90Var.f181561a == null) {
            act().m66873d2();
            return;
        }
        boolean zM198503D = vi90Var.m198503D();
        SwipeDirection swipeDirection = SwipeDirection.UP;
        if (i == swipeDirection.getValue() && ezc0.m118907m0() && !ezc0.m118906i0().getAllowUpSwipe() && swh0.m186273w0(CoreModule.f17545c.m31484o3().superLikeLimit.remainToday()) == 0 && !mb90.m153866b(PurchaseType.TYPE_SUPERLIKE_PKG) && !zM198503D) {
            C8764c.m53412M1(act(), "p_profile,superlike", Privilege.vip_super_like, null, null, false, this.f197426d.f181561a);
            return;
        }
        ((eea0) this.viewModel).m115936Y();
        final Intent intent = new Intent();
        intent.putExtra("currentImageIndex", ((eea0) this.viewModel).m115926S());
        int iM115926S = ((eea0) this.viewModel).m115926S();
        int size = this.f197426d.f181561a.pictures.size();
        vi90 vi90Var2 = this.f197426d;
        if (iM115926S < size) {
            intent.putExtra("currentImageUrl", vi90Var2.f181561a.pictures.get(((eea0) this.viewModel).m115926S()).url);
        } else {
            intent.putExtra("currentImageUrl", vi90Var2.f181561a.hasPic() ? this.f197426d.f181561a.m60124fp().url : "");
            CrashHelper.m81296c(new Exception("ProfileListFrag user pictures get index crash"));
        }
        if (this.f197426d.m198546v() || this.f197426d.m198547w() || this.f197426d.m198550z() || this.f197426d.m198500A() || this.f197426d.m198503D() || this.f197426d.m198549y() || this.f197426d.m198540p()) {
            intent.putExtra("currentUserId", this.f197426d.f181564d);
        }
        boolean zM198504E = this.f197426d.m198504E();
        vi90 vi90Var3 = this.f197426d;
        if (zM198504E) {
            if (NullChecker.m81303a(vi90Var3.f181561a)) {
                qer.m174243n(act(), this.f197426d.f181561a, i == SwipeDirection.RIGHT.getValue() || i == swipeDirection.getValue(), i == swipeDirection.getValue(), false, "home", null, new e30() { // from class: l.vba0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f180828a.m214111W1(i, intent, (Relationship) obj);
                    }
                }, new e30() { // from class: l.wba0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f185563a.m214113X1(i, intent, (Throwable) obj);
                    }
                }, pageId(), null, null, null);
                return;
            }
            return;
        }
        boolean zM198544t = vi90Var3.m198544t();
        vi90 vi90Var4 = this.f197426d;
        if (zM198544t) {
            if (NullChecker.m81303a(vi90Var4.f181561a)) {
                qer.m174243n(act(), this.f197426d.f181561a, i == SwipeDirection.RIGHT.getValue() || i == swipeDirection.getValue(), i == swipeDirection.getValue(), false, this.f197426d.f181562b, null, new e30() { // from class: l.xba0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f191937a.m214115Y1(i, intent, (Relationship) obj);
                    }
                }, new e30() { // from class: l.yba0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f197318a.m214116Z1(i, intent, (Throwable) obj);
                    }
                }, pageId(), null, null, null);
                return;
            }
            return;
        }
        boolean zM198532g = vi90Var4.m198532g();
        vi90 vi90Var5 = this.f197426d;
        if (zM198532g) {
            if (NullChecker.m81303a(vi90Var5.f181561a)) {
                qer.m174247r(act(), this.f197426d.f181561a, i == SwipeDirection.RIGHT.getValue() || i == swipeDirection.getValue(), i == swipeDirection.getValue(), pageId(), new f30() { // from class: l.zba0
                    @Override // p149l.f30
                    public final void call(Object obj, Object obj2) {
                        this.f202430a.m214120c2((User) obj, (Relationship) obj2);
                    }
                });
                return;
            }
            return;
        }
        boolean zM198538n = vi90Var5.m198538n();
        vi90 vi90Var6 = this.f197426d;
        if (zM198538n) {
            if (NullChecker.m81303a(vi90Var6.f181561a)) {
                qer.m174243n(act(), this.f197426d.f181561a, i == SwipeDirection.RIGHT.getValue() || i == swipeDirection.getValue(), i == swipeDirection.getValue(), false, "from_find_partner", null, new e30() { // from class: l.aca0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f68786a.m214121d2(i, intent, (Relationship) obj);
                    }
                }, new e30() { // from class: l.cca0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f80222a.m214122e2(i, intent, (Throwable) obj);
                    }
                }, pageId(), null, null, null);
            }
        } else if (vi90Var6.m198503D()) {
            b1c.m99821j(act(), this.f197426d.f181561a, i == SwipeDirection.RIGHT.getValue() || i == swipeDirection.getValue(), i == swipeDirection.getValue(), pageId(), new e30() { // from class: l.dca0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f85388a.m214123f2(i, intent, (Relationship) obj);
                }
            }, new d30() { // from class: l.eca0
                @Override // p149l.d30
                public final void call() {
                    yca0.m214008C1();
                }
            });
        } else {
            act().setResult(i, intent);
            act().m66873d2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m214090E2(j760 j760Var) {
        this.f197426d.m198523X((User) j760Var.f116564a);
        m214037Y2((User) j760Var.f116565b);
        this.f197423a.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: F2 */
    public final /* synthetic */ Boolean m214091F2(j760 j760Var) {
        return Boolean.valueOf(NullChecker.m81303a(j760Var) && TextUtils.equals((CharSequence) j760Var.f116564a, this.f197426d.f181564d));
    }

    /* JADX INFO: renamed from: H1 */
    public x9j<Boolean, Boolean, Boolean> m214092H1(final String str, final String str2) {
        return new x9j() { // from class: l.lca0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f127390a.m214125h2(str, str2, (Boolean) obj, (Boolean) obj2);
            }
        };
    }

    /* JADX INFO: renamed from: H2 */
    public final /* synthetic */ void m214093H2(RelationshipStatus relationshipStatus) {
        m214030T2(3);
    }

    /* JADX INFO: renamed from: I2 */
    public final /* synthetic */ j760 m214094I2(List list) {
        return vwb.m200311Y(list, BookMoviesDramasHelper.m59445l(this.f197426d.f181564d));
    }

    /* JADX INFO: renamed from: J1 */
    public void m214095J1(final boolean z) {
        if (this.f197430h == null) {
            this.f197430h = this.f197426d.m198525Z();
        }
        if (NullChecker.m81303a(this.f197430h)) {
            LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
            int iM115926S = ((eea0) this.viewModel).m115926S();
            SwipeExtraScData swipeExtraScData = likeExtraDataNew_.swipeExtraScData;
            swipeExtraScData.picNum = iM115926S;
            swipeExtraScData.picUploads = this.f197430h.pictures.size();
            if (NullChecker.m81303a(this.f197426d.f181561a) && this.f197426d.f181561a.pictures.size() != this.f197430h.pictures.size()) {
                CrashHelper.m81296c(new IllegalStateException(" profilelist picture size diff , user  " + this.f197426d.f181561a.f56011id + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f197426d.f181561a.pictures.size() + " withRelation " + this.f197430h.f56011id + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f197430h.pictures.size()));
            }
            int size = this.f197430h.pictures.size();
            SwipeExtraScData swipeExtraScData2 = likeExtraDataNew_.swipeExtraScData;
            if (iM115926S >= size) {
                swipeExtraScData2.picUrl = "";
            } else {
                swipeExtraScData2.picUrl = this.f197430h.pictures.get(iM115926S).url;
            }
            final boolean zM198519T = this.f197426d.m198519T();
            if (qer.m174244o(act(), this.f197430h, true, z, false, z ? "p_profile,superlike" : "p_home,likelimit", m214092H1("", ""), new e30() { // from class: l.fca0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f96782a.m214126i2(z, zM198519T, (Relationship) obj);
                }
            }, new e30() { // from class: l.gca0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f101999a.m214127j2(z, (Throwable) obj);
                }
            }, pageId(), likeExtraDataNew_, "", "", new d30() { // from class: l.hca0
                @Override // p149l.d30
                public final void call() {
                    this.f107035a.m214128k2(z);
                }
            })) {
                vi90 vi90Var = this.f197426d;
                if (z) {
                    vi90Var.f181572l = true;
                } else {
                    vi90Var.f181571k = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: J2 */
    public final /* synthetic */ void m214096J2(j760 j760Var) {
        this.f197425c = j760Var;
        m214112W2();
    }

    /* JADX INFO: renamed from: K2 */
    public final /* synthetic */ void m214097K2(User user) {
        m214037Y2(user);
        this.f197426d.m198523X(user);
        this.f197423a.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: L1, reason: merged with bridge method [inline-methods] */
    public void m214124g2(String str, String str2) {
        m214095J1(true);
    }

    /* JADX INFO: renamed from: L2 */
    public final /* synthetic */ void m214099L2(roj0 roj0Var) {
        this.f197426d.m198523X(m214117Z2());
        m214037Y2(CoreModule.m29932K().me_());
        if (this.f197426d.f181561a == null || this.f197428f == null) {
            return;
        }
        this.f197423a.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: M2 */
    public final /* synthetic */ void m214100M2(roj0 roj0Var) {
        ((eea0) this.viewModel).m115932V0();
    }

    /* JADX INFO: renamed from: N1 */
    public ProfileShareHelper m214101N1() {
        return this.f197429g;
    }

    /* JADX INFO: renamed from: N2 */
    public final /* synthetic */ void m214102N2() {
        ((eea0) this.viewModel).f90712o.m52785F1(this.f197426d.f181561a);
    }

    /* JADX INFO: renamed from: O1 */
    public void m214103O1() {
        if (ft4.m123008b().m123014g()) {
            act().duringCreated(CoreModule.f17545c.f19611U1.f75278S).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.tba0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f169245a.m214129l2((Boolean) obj);
                }
            }, new e30() { // from class: l.uba0
                @Override // p149l.e30
                public final void call(Object obj) {
                    yca0.m214064o1((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: P2 */
    public final /* synthetic */ j760 m214104P2(List list) {
        return vwb.m200311Y(list, BookMoviesDramasHelper.m59445l(this.f197426d.f181564d));
    }

    /* JADX INFO: renamed from: Q2 */
    public final /* synthetic */ void m214105Q2(j760 j760Var) {
        this.f197425c = j760Var;
        m214112W2();
    }

    /* JADX INFO: renamed from: R2 */
    public User m214106R2() {
        if (this.f197428f == null) {
            m214037Y2(CoreModule.m29932K().me_());
        }
        return this.f197428f;
    }

    /* JADX INFO: renamed from: T1 */
    public void m214107T1() {
        if (this.f197426d.m198539o() || TextUtils.equals("share_profile", this.f197426d.f181562b) || this.f197426d.m198505F()) {
            duringCreated(hra0.f109191k).subscribe(mkd0.m154955G(new e30() { // from class: l.nba0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f138023a.m214100M2((roj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: U2 */
    public void m214108U2() {
        if (this.f197426d.m198504E()) {
            zvf0.m220396r("e_push_profile_quit", "p_push_profile");
        }
        m214087D1();
    }

    /* JADX INFO: renamed from: V1 */
    public boolean m214109V1(User user) {
        Settings settings;
        List<SettingGroups> list;
        if (qp8.m175817b() && user != null && (settings = user.settings) != null && (list = settings.settingGroups) != null && !list.isEmpty() && user.settings.settingGroups.get(0) != null && user.settings.settingGroups.get(0).live != null && !user.settings.settingGroups.get(0).live.hideProfileWealthTag.booleanValue()) {
            UserWealthGradeConfig userWealthGradeConfigMo67219Gj = CoreModule.m29936Q().mo67219Gj(user.settings.settingGroups.get(0).live.wealthGrade, false);
            if (userWealthGradeConfigMo67219Gj.openNewIcon && !TextUtils.isEmpty(userWealthGradeConfigMo67219Gj.wealthIconUrl)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: V2 */
    public void m214110V2(User user) {
        zbi0.m217859H(act(), user, this.f197428f, this.f197426d);
    }

    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m214111W1(int i, Intent intent, Relationship relationship) {
        act().setResult(i, intent);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: W2 */
    public void m214112W2() {
        if (this.f197428f == null || this.f197426d.f181561a == null) {
            return;
        }
        PerformanceLogUtil.logBegin(new Object().hashCode(), ProfileLogEntity.ProfileLogName.CUSTOM, "reRenderPage!!!");
        this.f197423a.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m214113X1(int i, Intent intent, Throwable th) {
        act().setResult(i, intent);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: X2 */
    public void m214114X2() {
        duringCreated(CoreModule.f17545c.f19639e0.m169454W9(this.f197426d.f181564d).flatMap(new w9j() { // from class: l.xaa0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19682s1.m34369s3();
            }
        }).map(new w9j() { // from class: l.yaa0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f197159a.m214104P2((List) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.zaa0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202342a.m214105Q2((j760) obj);
            }
        }, new e30() { // from class: l.aba0
            @Override // p149l.e30
            public final void call(Object obj) {
                yca0.m214018L0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ void m214115Y1(int i, Intent intent, Relationship relationship) {
        if (!TEnum.equals(relationship.state, "liked") && !TEnum.equals(relationship.state, "matched") && !TEnum.equals(relationship.state, "superliked")) {
            act().setResult(i, intent);
            act().m66873d2();
        } else {
            if (TEnum.equals(relationship.state, "superliked") || relationship.status.contains(MatchFrom.get(MatchFrom.superLiked)) || i == SwipeDirection.UP.getValue()) {
                return;
            }
            lsi0.m151595y("喜欢已发送");
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        CoreModule.f17545c.f19636d0.f199753R.m121230k().first().subscribe(mkd0.m154950B());
        this.f197429g = new ProfileShareHelper(this.f197426d);
        m214114X2();
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m214116Z1(int i, Intent intent, Throwable th) {
        act().setResult(i, intent);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: Z2 */
    public User m214117Z2() {
        vi90 vi90Var = this.f197426d;
        if (vi90Var.f181561a == null && !vi90Var.m198511L()) {
            this.f197426d.m198523X(CoreModule.m29932K().getUserById(this.f197426d.f181564d));
        }
        return this.f197426d.f181561a;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        if (this.f197426d.m198511L()) {
            m214026R1();
        } else {
            m214028S1();
            p420.m167354t(act());
            m214024Q1();
            m214107T1();
        }
        m214022P1();
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m214118a2() {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m214119b2(final User user, Relationship relationship) {
        User userM169433Q9 = CoreModule.f17545c.f19639e0.m169433Q9(user.f56011id);
        if (userM169433Q9 != null) {
            user = userM169433Q9;
        }
        if (NullChecker.m81303a(relationship) && !relationship.equals(user.localRelationship)) {
            user.localRelationship = relationship;
            CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.sca0
                @Override // p149l.d30
                public final void call() {
                    qib0.f154722k0.f176631d.upsert(user);
                }
            });
        }
        e51.m114743H(act(), new Runnable() { // from class: l.tca0
            @Override // java.lang.Runnable
            public final void run() {
                this.f169432a.m214118a2();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m214120c2(final User user, final Relationship relationship) {
        e51.m114774y(new Runnable() { // from class: l.nca0
            @Override // java.lang.Runnable
            public final void run() {
                this.f138143a.m214119b2(user, relationship);
            }
        });
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m214121d2(int i, Intent intent, Relationship relationship) {
        if (i != SwipeDirection.LEFT.getValue()) {
            lsi0.m151595y(String.format("喜欢已发送，%s将收到你的喜欢", this.f197426d.f181561a.isFemale() ? "她" : "他"));
        }
        act().setResult(i, intent);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m214122e2(int i, Intent intent, Throwable th) {
        act().setResult(i, intent);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m214123f2(int i, Intent intent, Relationship relationship) {
        act().setResult(i, intent);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ Boolean m214125h2(final String str, final String str2, Boolean bool, Boolean bool2) {
        if (!bool2.booleanValue() || CoreModule.f17545c.f19663m0.f19454u0.get().booleanValue() || !NullChecker.m81303a(CoreModule.f17545c.m31484o3()) || n3b0.m157745t() || !TextUtils.isEmpty(str)) {
            return Boolean.FALSE;
        }
        hpd0 hpd0Var = CoreModule.f17545c.f19663m0.f19454u0;
        Boolean bool3 = Boolean.TRUE;
        hpd0Var.put(bool3);
        ok3.m164808G(act(), true, this.f197430h.name, CoreModule.f17545c.m31484o3().superLikeLimit.remainToday() + "", TEnum.equals(this.f197430h.gender, "male"), new Runnable() { // from class: l.qca0
            @Override // java.lang.Runnable
            public final void run() {
                this.f153737a.m214124g2(str, str2);
            }
        }, new Runnable() { // from class: l.rca0
            @Override // java.lang.Runnable
            public final void run() {
                yca0.m214038a1();
            }
        });
        return bool3;
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m214126i2(boolean z, boolean z2, Relationship relationship) {
        if (z) {
            vi90 vi90Var = this.f197426d;
            vi90Var.f181572l = false;
            vi90Var.f181573m = true;
        } else {
            if (CoreModule.m29934N().mo60389so() && (this.f197426d.m198536k() || this.f197426d.m198537m() || this.f197426d.m198534i())) {
                osi0.m165783g("喜欢已发送");
            }
            this.f197426d.f181571k = false;
        }
        if (z2) {
            m214087D1();
        }
    }

    /* JADX INFO: renamed from: j2 */
    public final /* synthetic */ void m214127j2(boolean z, Throwable th) {
        vi90 vi90Var = this.f197426d;
        if (z) {
            vi90Var.f181572l = false;
        } else {
            vi90Var.f181571k = false;
        }
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m214128k2(boolean z) {
        vi90 vi90Var = this.f197426d;
        if (z) {
            vi90Var.f181572l = true;
        } else {
            vi90Var.f181571k = true;
        }
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m214129l2(Boolean bool) {
        ft4.m123008b().m123017j(bool.booleanValue());
        m214108U2();
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m214130n2(roj0 roj0Var) {
        m214012F1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m214131o2(j760 j760Var) {
        this.f197426d.f181561a = (User) j760Var.f116564a;
        m214030T2(3);
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ Boolean m214132p2(String str) {
        return Boolean.valueOf(this.f197426d.m198533h());
    }

    public String pageId() {
        if ("my_tab_profile_like".equals(this.f197426d.f181562b)) {
            return "p_my_profile_comment";
        }
        if ("from_guess_liker_result".equals(this.f197426d.f181562b)) {
            return "p_guess_who_likes_me_profile";
        }
        if ("from_christmas".equals(this.f197426d.f181562b)) {
            return "p_christmas_profile";
        }
        return (TextUtils.isEmpty(this.f197426d.f181564d) || !this.f197426d.m198516Q()) ? OMSDialogPositon.p_suggest_user_profile_info_view : "p_unmatch_profile";
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m214133q2(String str) {
        if (TextUtils.equals(str, this.f197426d.f181564d)) {
            m214030T2(1);
        }
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ Boolean m214134s2(Long l2) {
        return Boolean.valueOf(!this.f197426d.m198516Q());
    }

    /* JADX INFO: renamed from: t2 */
    public final /* synthetic */ C22306c m214135t2(Long l2) {
        return CoreModule.f17545c.f19639e0.m169454W9(this.f197426d.f181564d);
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ C22306c m214136u2() {
        return C22306c.just(Boolean.valueOf(!this.f197426d.f181565e.f181581f)).filter(new w9j() { // from class: l.oba0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return yca0.m214015I0((Boolean) obj);
            }
        }).switchMap(new w9j() { // from class: l.pba0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C22306c.timer(450L, TimeUnit.MILLISECONDS);
            }
        }).observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.rba0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f158593a.m214134s2((Long) obj);
            }
        }).switchMap(new w9j() { // from class: l.sba0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f163514a.m214135t2((Long) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v2 */
    public final /* synthetic */ void m214137v2(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isBlocked() && NullChecker.m81303a(CoreModule.m29932K().getUserById(this.f197426d.f181564d)) && !CoreModule.m29932K().getUserById(this.f197426d.f181564d).unilateralBlock()) {
            CoreModule.f17545c.f19639e0.m169374Ba(this.f197426d.f181564d);
        }
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m214138w2(C4319c c4319c) {
        if (c4319c == C4319c.f15548i && this.f197426d.f181561a == null) {
            ((eea0) this.viewModel).m115931U0();
        }
    }

    /* JADX INFO: renamed from: x2 */
    public final /* synthetic */ C22306c m214139x2() {
        return C22306c.just(Boolean.valueOf(this.f197426d.m198510K())).filter(new w9j() { // from class: l.ica0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return yca0.m214052j0((Boolean) obj);
            }
        }).switchMap(new w9j() { // from class: l.jca0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C22306c.timer(450L, TimeUnit.MILLISECONDS);
            }
        });
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ C22306c m214140y2() {
        return mkd0.m154985s(this.f197426d.m198510K() ? CoreModule.f17545c.f19552B0.m31611j4().distinctUntilChanged() : C22306c.just(null), CoreModule.f17545c.f19639e0.m169410Ka(this.f197426d.f181564d), CoreModule.f17545c.f19639e0.m169523o9(), new f5a0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m214141z2(xaj0 xaj0Var) {
        this.f197426d.m198523X((User) xaj0Var.f191752b);
        m214037Y2((User) xaj0Var.f191753c);
        m214112W2();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
