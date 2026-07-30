package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4901p;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Literatures;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.performance.PerformanceLogUtil;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.performance.ProfileLogEntity;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListFragLocalImpl;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileShareHelper;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p051p1.mobile.putong.data.LikeExtraData;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.PicVerification;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.SwipeExtraScData;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserWealthGradeConfig;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes4.dex */
public class cla0 extends ar2<ima0> {

    /* JADX INFO: renamed from: a */
    public final C22507a<uxj0> f82356a;

    /* JADX INFO: renamed from: b */
    public final C22507a<uxj0> f82357b;

    /* JADX INFO: renamed from: c */
    public pf60<List<Literatures>, List<LiteraturesComments>> f82358c;

    /* JADX INFO: renamed from: d */
    public final zq90 f82359d;

    /* JADX INFO: renamed from: e */
    public final ProfileListFragLocalImpl f82360e;

    /* JADX INFO: renamed from: f */
    public User f82361f;

    /* JADX INFO: renamed from: g */
    public ProfileShareHelper f82362g;

    /* JADX INFO: renamed from: h */
    public User f82363h;

    public cla0(ner nerVar, zq90 zq90Var) {
        super(nerVar);
        this.f82356a = C22507a.m222758b();
        this.f82357b = C22507a.m222758b();
        this.f82360e = (ProfileListFragLocalImpl) nerVar;
        this.f82359d = zq90Var;
    }

    /* JADX INFO: renamed from: C1 */
    public static /* synthetic */ void m110453C1() {
    }

    @MainThread
    /* JADX INFO: renamed from: F1 */
    private void m110457F1() {
        if (this.f82360e.f34826E) {
            tu2.m192703a("[core][profile]", "afterGetUserInfo return by Page Animation");
            this.f82360e.f34827F = true;
            return;
        }
        tu2.m192703a("[core][profile]", "afterGetUserInfo refresh list");
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.AFTER_GET_USER_INFO;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        m110475T2(0);
        ((ima0) this.viewModel).m140868T0();
        ((ima0) this.viewModel).m140862Q0();
        ((ima0) this.viewModel).m140860P0();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ Boolean m110460I0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: I1 */
    private void m110461I1(int i) {
        if (i == SwipeDirection.LEFT.getValue() && br5.m106044o(this.f82359d.m220975b(), this.f82359d.f205576a)) {
            CoreModule.f18264c.f20384f0.m34180wo(this.f82359d.f205579d, false).subscribe(psd0.m173597H(new y20() { // from class: l.ska0
                @Override // p153l.y20
                public final void call(Object obj) {
                    cla0.m110519t0((uxj0) obj);
                }
            }, new y20() { // from class: l.tka0
                @Override // p153l.y20
                public final void call(Object obj) {
                    cla0.m110501l0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m110463L0(Throwable th) {
    }

    /* JADX INFO: renamed from: P1 */
    private void m110467P1() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.yka0
            @Override // p153l.y20
            public final void call(Object obj) {
                PerformanceLogUtil.logSingle(((C4470c) obj).f16276c);
            }
        }));
        duringCreated(this.f82356a).first().observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.tia0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174453a.m110505m2((uxj0) obj);
            }
        }, new zh0()));
        duringCreated(this.f82356a.throttleLast(1L, TimeUnit.SECONDS).observeOn(fo0.m126432a())).subscribe(psd0.m173597H(new y20() { // from class: l.uia0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179088a.m110575n2((uxj0) obj);
            }
        }, new zh0()));
        duringCreated(CoreModule.m30932N().getMomentLikeChangedSub()).subscribe(psd0.m173596G(new y20() { // from class: l.via0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184223a.m110576o2((pf60) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20420r0.f20780s0).filter(new qcj() { // from class: l.wia0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f189348a.m110577p2((String) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.xia0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194449a.m110578q2((String) obj);
            }
        }));
        duringCreated(C4901p.f20821f0).subscribe(psd0.m173596G(new y20() { // from class: l.zia0
            @Override // p153l.y20
            public final void call(Object obj) {
                cla0.m110470R0((uxj0) obj);
            }
        }));
        duringCreated(C4901p.f20822g0).subscribe(psd0.m173596G(new y20() { // from class: l.aja0
            @Override // p153l.y20
            public final void call(Object obj) {
                cla0.m110479W0((uxj0) obj);
            }
        }));
        if ((zbj.m219194a(this.f82359d.f205577b) || m110477U1() || "liked_users_anchor".equals(this.f82359d.f205577b) || this.f82359d.m220955H() || "from_greet_act".equals(this.f82359d.f205577b)) && !this.f82359d.m220958K()) {
            duringCreated((C22421c) CoreModule.f18264c.f20384f0.m33823Ue(this.f82359d.f205579d).map(new qcj() { // from class: l.zka0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Conversation conversation = (Conversation) obj;
                    return Boolean.valueOf(conversation != null && conversation.needCheckValidStatus());
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.ala0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f72091a.m110516r2((Boolean) obj);
                }
            }));
        }
        duringCreated(new pcj() { // from class: l.bla0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f77178a.m110581u2();
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.oia0
            @Override // p153l.y20
            public final void call(Object obj) {
                cla0.m110496i1((uxj0) obj);
            }
        }, new y20() { // from class: l.pia0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152522a.m110582v2((Throwable) obj);
            }
        }));
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.qia0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157810a.m110583w2((C4470c) obj);
            }
        }));
        duringCreated(new pcj() { // from class: l.ria0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f163346a.m110584x2();
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.sia0
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20294B0.m32620p4(CoreModule.m30929H().userId());
            }
        }));
        duringCreated(CoreModule.f18264c.f20378d0.m151460j3()).subscribe(psd0.m173591B());
        m110548O1();
    }

    /* JADX INFO: renamed from: Q1 */
    private void m110469Q1() {
        if (this.f82359d.m220958K()) {
            duringCreated(new pcj() { // from class: l.fka0
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f99492a.m110585y2();
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.qka0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f158117a.m110586z2((bkj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m110470R0(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: R1 */
    private void m110471R1() {
        creates(new y20() { // from class: l.nia0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142105a.m110529A2((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(this.f82359d.f205579d)).map(new qcj() { // from class: l.yia0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).verifications;
            }
        }).distinctUntilChanged().filter(new qcj() { // from class: l.jja0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f121159a.m110530B2((PicVerification) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.uja0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179197a.m110531C2((PicVerification) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S1 */
    private void m110473S1() {
        if (!this.f82359d.m220964Q()) {
            duringCreated(CoreModule.f18264c.f20381e0.m116535Y9(this.f82359d.f205579d, false, true).flatMap(new qcj() { // from class: l.fja0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.f18264c.f20424s1.m35372s3();
                }
            }).map(new qcj() { // from class: l.hja0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f110170a.m110539I2((List) obj);
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.ija0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f115200a.m110541J2((pf60) obj);
                }
            }, new y20() { // from class: l.kja0
                @Override // p153l.y20
                public final void call(Object obj) {
                    cla0.m110525x1((Throwable) obj);
                }
            }));
        }
        if (this.f82359d.m220958K()) {
            duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.lja0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f132316a.m110542K2((User) obj);
                }
            }));
            return;
        }
        if (zbj.m219194a(this.f82359d.f205577b)) {
            duringCreated(C22421c.just(uxj0.f181467a)).subscribe(psd0.m173596G(new y20() { // from class: l.mja0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f137066a.m110544L2((uxj0) obj);
                }
            }));
        }
        duringCreated(new pcj() { // from class: l.nja0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f142283a.m110533D2();
            }
        }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.oja0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147647a.m110535E2((pf60) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20420r0.m35153v5()).filter(new qcj() { // from class: l.pja0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f152679a.m110536F2((pf60) obj);
            }
        }).map(new qcj() { // from class: l.qja0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return cla0.m110492g1((pf60) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.gja0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104619a.m110538H2((RelationshipStatus) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S2 */
    private void m110474S2(int i) {
        if (i == SwipeDirection.LEFT.getValue() && this.f82359d.m220996x()) {
            gr90.m131536b(this.f82359d.f205579d);
        }
    }

    /* JADX INFO: renamed from: T2 */
    private void m110475T2(int i) {
        if (!this.f82359d.m220958K() && NullChecker.m82486a(this.f82359d.f205576a)) {
            ((ima0) this.viewModel).m140874X0(i);
        }
        if (i == 3 || i == 2) {
            ((ima0) this.viewModel).f115734o.m168312b(new x20() { // from class: l.oka0
                @Override // p153l.x20
                public final void call() {
                    this.f147745a.m110547N2();
                }
            });
        }
    }

    /* JADX INFO: renamed from: U1 */
    private boolean m110477U1() {
        if ("from_portrait_like_list".equals(this.f82359d.f205577b) || TextUtils.equals(this.f82359d.f205577b, "from_mew_tags") || this.f82359d.m220984k() || this.f82359d.m220985m() || this.f82359d.m220982i() || TextUtils.equals(this.f82359d.f205577b, "from_literature_third")) {
            return true;
        }
        if (gra.m131637V1()) {
            return "chat_group".equals(this.f82359d.f205577b) || "chat_group_anonymity".equals(this.f82359d.f205577b) || "group_notification".equals(this.f82359d.f205577b) || "group_notification_anonymity".equals(this.f82359d.f205577b);
        }
        return false;
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m110479W0(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: Y2 */
    private void m110482Y2(User user) {
        this.f82361f = user;
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ void m110483a1() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ RelationshipStatus m110492g1(pf60 pf60Var) {
        return (RelationshipStatus) pf60Var.f152157b;
    }

    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ void m110496i1(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ Boolean m110497j0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m110501l0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m2 */
    public /* synthetic */ void m110505m2(uxj0 uxj0Var) {
        m110457F1();
    }

    /* JADX INFO: renamed from: o1 */
    public static /* synthetic */ void m110509o1(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r2 */
    public /* synthetic */ void m110516r2(Boolean bool) {
        m110475T2(2);
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m110519t0(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ void m110525x1(Throwable th) {
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m110529A2(Bundle bundle) {
        m110482Y2(this.f82359d.f205580e.f205601k);
        zq90 zq90Var = this.f82359d;
        zq90Var.m220971X(zq90Var.f205580e.f205601k);
        this.f82356a.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ Boolean m110530B2(PicVerification picVerification) {
        return Boolean.valueOf(!this.f82359d.f205580e.f205601k.verifications.equals(picVerification));
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m110531C2(PicVerification picVerification) {
        this.f82359d.f205580e.f205601k.verifications = picVerification;
        this.f82356a.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: D1 */
    public void m110532D1() {
        LiveService liveService;
        ((ima0) this.viewModel).m140875Y();
        act().m68056e2();
        if (!tnt.m191966c(this.f82359d.f205577b) || this.f82360e.f34825D || (liveService = uqb0.f180396b0.f170326c) == null) {
            return;
        }
        liveService.mo68427Tc(act(), this.f82359d.f205579d, true);
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ C22421c m110533D2() {
        return psd0.m173625r(CoreModule.f18264c.f20381e0.m116483Ka(this.f82359d.f205579d), CoreModule.f18264c.f20381e0.m116596o9(), new kda0());
    }

    /* JADX INFO: renamed from: E1 */
    public void m110534E1(final int i) {
        m110474S2(i);
        m110461I1(i);
        zq90 zq90Var = this.f82359d;
        if (zq90Var.f205576a == null) {
            act().m68056e2();
            return;
        }
        boolean zM220951D = zq90Var.m220951D();
        SwipeDirection swipeDirection = SwipeDirection.UP;
        if (i == swipeDirection.getValue() && h7d0.m133774m0() && !h7d0.m133773i0().getAllowUpSwipe() && a5i0.m96178w0(CoreModule.f18264c.m32487o3().superLikeLimit.remainToday()) == 0 && !qj90.m176830b(PurchaseType.TYPE_SUPERLIKE_PKG) && !zM220951D) {
            C8927c.m54595M1(act(), "p_profile,superlike", Privilege.vip_super_like, null, null, false, this.f82359d.f205576a);
            return;
        }
        ((ima0) this.viewModel).m140875Y();
        final Intent intent = new Intent();
        intent.putExtra("currentImageIndex", ((ima0) this.viewModel).m140865S());
        int iM140865S = ((ima0) this.viewModel).m140865S();
        int size = this.f82359d.f205576a.pictures.size();
        zq90 zq90Var2 = this.f82359d;
        if (iM140865S < size) {
            intent.putExtra("currentImageUrl", zq90Var2.f205576a.pictures.get(((ima0) this.viewModel).m140865S()).url);
        } else {
            intent.putExtra("currentImageUrl", zq90Var2.f205576a.hasPic() ? this.f82359d.f205576a.m61308fp().url : "");
            CrashHelper.m82479c(new Exception("ProfileListFrag user pictures get index crash"));
        }
        if (this.f82359d.m220994v() || this.f82359d.m220995w() || this.f82359d.m220998z() || this.f82359d.m220948A() || this.f82359d.m220951D() || this.f82359d.m220997y() || this.f82359d.m220988p()) {
            intent.putExtra("currentUserId", this.f82359d.f205579d);
        }
        boolean zM220952E = this.f82359d.m220952E();
        zq90 zq90Var3 = this.f82359d;
        if (zM220952E) {
            if (NullChecker.m82486a(zq90Var3.f205576a)) {
                rgr.m181477n(act(), this.f82359d.f205576a, i == SwipeDirection.RIGHT.getValue() || i == swipeDirection.getValue(), i == swipeDirection.getValue(), false, "home", null, new y20() { // from class: l.zja0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f204647a.m110556W1(i, intent, (Relationship) obj);
                    }
                }, new y20() { // from class: l.aka0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f71976a.m110558X1(i, intent, (Throwable) obj);
                    }
                }, pageId(), null, null, null);
                return;
            }
            return;
        }
        boolean zM220992t = zq90Var3.m220992t();
        zq90 zq90Var4 = this.f82359d;
        if (zM220992t) {
            if (NullChecker.m82486a(zq90Var4.f205576a)) {
                rgr.m181477n(act(), this.f82359d.f205576a, i == SwipeDirection.RIGHT.getValue() || i == swipeDirection.getValue(), i == swipeDirection.getValue(), false, this.f82359d.f205577b, null, new y20() { // from class: l.bka0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f77055a.m110560Y1(i, intent, (Relationship) obj);
                    }
                }, new y20() { // from class: l.cka0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f82270a.m110561Z1(i, intent, (Throwable) obj);
                    }
                }, pageId(), null, null, null);
                return;
            }
            return;
        }
        boolean zM220980g = zq90Var4.m220980g();
        zq90 zq90Var5 = this.f82359d;
        if (zM220980g) {
            if (NullChecker.m82486a(zq90Var5.f205576a)) {
                rgr.m181481r(act(), this.f82359d.f205576a, i == SwipeDirection.RIGHT.getValue() || i == swipeDirection.getValue(), i == swipeDirection.getValue(), pageId(), new z20() { // from class: l.dka0
                    @Override // p153l.z20
                    public final void call(Object obj, Object obj2) {
                        this.f88990a.m110565c2((User) obj, (Relationship) obj2);
                    }
                });
                return;
            }
            return;
        }
        boolean zM220986n = zq90Var5.m220986n();
        zq90 zq90Var6 = this.f82359d;
        if (zM220986n) {
            if (NullChecker.m82486a(zq90Var6.f205576a)) {
                rgr.m181477n(act(), this.f82359d.f205576a, i == SwipeDirection.RIGHT.getValue() || i == swipeDirection.getValue(), i == swipeDirection.getValue(), false, "from_find_partner", null, new y20() { // from class: l.eka0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f94350a.m110566d2(i, intent, (Relationship) obj);
                    }
                }, new y20() { // from class: l.gka0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f104718a.m110567e2(i, intent, (Throwable) obj);
                    }
                }, pageId(), null, null, null);
            }
        } else if (zq90Var6.m220951D()) {
            o2c.m165712j(act(), this.f82359d.f205576a, i == SwipeDirection.RIGHT.getValue() || i == swipeDirection.getValue(), i == swipeDirection.getValue(), pageId(), new y20() { // from class: l.hka0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f110402a.m110568f2(i, intent, (Relationship) obj);
                }
            }, new x20() { // from class: l.ika0
                @Override // p153l.x20
                public final void call() {
                    cla0.m110453C1();
                }
            });
        } else {
            act().setResult(i, intent);
            act().m68056e2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m110535E2(pf60 pf60Var) {
        this.f82359d.m220971X((User) pf60Var.f152156a);
        m110482Y2((User) pf60Var.f152157b);
        this.f82356a.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: F2 */
    public final /* synthetic */ Boolean m110536F2(pf60 pf60Var) {
        return Boolean.valueOf(NullChecker.m82486a(pf60Var) && TextUtils.equals((CharSequence) pf60Var.f152156a, this.f82359d.f205579d));
    }

    /* JADX INFO: renamed from: H1 */
    public rcj<Boolean, Boolean, Boolean> m110537H1(final String str, final String str2) {
        return new rcj() { // from class: l.pka0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f152819a.m110570h2(str, str2, (Boolean) obj, (Boolean) obj2);
            }
        };
    }

    /* JADX INFO: renamed from: H2 */
    public final /* synthetic */ void m110538H2(RelationshipStatus relationshipStatus) {
        m110475T2(3);
    }

    /* JADX INFO: renamed from: I2 */
    public final /* synthetic */ pf60 m110539I2(List list) {
        return jyb.m147494Y(list, BookMoviesDramasHelper.m60629l(this.f82359d.f205579d));
    }

    /* JADX INFO: renamed from: J1 */
    public void m110540J1(final boolean z) {
        if (this.f82363h == null) {
            this.f82363h = this.f82359d.m220973Z();
        }
        if (NullChecker.m82486a(this.f82363h)) {
            LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
            int iM140865S = ((ima0) this.viewModel).m140865S();
            SwipeExtraScData swipeExtraScData = likeExtraDataNew_.swipeExtraScData;
            swipeExtraScData.picNum = iM140865S;
            swipeExtraScData.picUploads = this.f82363h.pictures.size();
            if (NullChecker.m82486a(this.f82359d.f205576a) && this.f82359d.f205576a.pictures.size() != this.f82363h.pictures.size()) {
                CrashHelper.m82479c(new IllegalStateException(" profilelist picture size diff , user  " + this.f82359d.f205576a.f56859id + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f82359d.f205576a.pictures.size() + " withRelation " + this.f82363h.f56859id + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f82363h.pictures.size()));
            }
            int size = this.f82363h.pictures.size();
            SwipeExtraScData swipeExtraScData2 = likeExtraDataNew_.swipeExtraScData;
            if (iM140865S >= size) {
                swipeExtraScData2.picUrl = "";
            } else {
                swipeExtraScData2.picUrl = this.f82363h.pictures.get(iM140865S).url;
            }
            final boolean zM220967T = this.f82359d.m220967T();
            if (rgr.m181478o(act(), this.f82363h, true, z, false, z ? "p_profile,superlike" : "p_home,likelimit", m110537H1("", ""), new y20() { // from class: l.jka0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f121393a.m110571i2(z, zM220967T, (Relationship) obj);
                }
            }, new y20() { // from class: l.kka0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f127178a.m110572j2(z, (Throwable) obj);
                }
            }, pageId(), likeExtraDataNew_, "", "", new x20() { // from class: l.lka0
                @Override // p153l.x20
                public final void call() {
                    this.f132455a.m110573k2(z);
                }
            })) {
                zq90 zq90Var = this.f82359d;
                if (z) {
                    zq90Var.f205587l = true;
                } else {
                    zq90Var.f205586k = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: J2 */
    public final /* synthetic */ void m110541J2(pf60 pf60Var) {
        this.f82358c = pf60Var;
        m110557W2();
    }

    /* JADX INFO: renamed from: K2 */
    public final /* synthetic */ void m110542K2(User user) {
        m110482Y2(user);
        this.f82359d.m220971X(user);
        this.f82356a.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: L1, reason: merged with bridge method [inline-methods] */
    public void m110569g2(String str, String str2) {
        m110540J1(true);
    }

    /* JADX INFO: renamed from: L2 */
    public final /* synthetic */ void m110544L2(uxj0 uxj0Var) {
        this.f82359d.m220971X(m110562Z2());
        m110482Y2(CoreModule.m30930K().me_());
        if (this.f82359d.f205576a == null || this.f82361f == null) {
            return;
        }
        this.f82356a.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: M2 */
    public final /* synthetic */ void m110545M2(uxj0 uxj0Var) {
        ((ima0) this.viewModel).m140871V0();
    }

    /* JADX INFO: renamed from: N1 */
    public ProfileShareHelper m110546N1() {
        return this.f82362g;
    }

    /* JADX INFO: renamed from: N2 */
    public final /* synthetic */ void m110547N2() {
        ((ima0) this.viewModel).f115734o.m53968F1(this.f82359d.f205576a);
    }

    /* JADX INFO: renamed from: O1 */
    public void m110548O1() {
        if (eu4.m122523b().m122529g()) {
            act().duringCreated(CoreModule.f18264c.f20353U1.f98891S).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.xja0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f194545a.m110574l2((Boolean) obj);
                }
            }, new y20() { // from class: l.yja0
                @Override // p153l.y20
                public final void call(Object obj) {
                    cla0.m110509o1((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: P2 */
    public final /* synthetic */ pf60 m110549P2(List list) {
        return jyb.m147494Y(list, BookMoviesDramasHelper.m60629l(this.f82359d.f205579d));
    }

    /* JADX INFO: renamed from: Q2 */
    public final /* synthetic */ void m110550Q2(pf60 pf60Var) {
        this.f82358c = pf60Var;
        m110557W2();
    }

    /* JADX INFO: renamed from: R2 */
    public User m110551R2() {
        if (this.f82361f == null) {
            m110482Y2(CoreModule.m30930K().me_());
        }
        return this.f82361f;
    }

    /* JADX INFO: renamed from: T1 */
    public void m110552T1() {
        if (this.f82359d.m220987o() || TextUtils.equals("share_profile", this.f82359d.f205577b) || this.f82359d.m220953F()) {
            duringCreated(lza0.f134167k).subscribe(psd0.m173596G(new y20() { // from class: l.rja0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f163439a.m110545M2((uxj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: U2 */
    public void m110553U2() {
        if (this.f82359d.m220952E()) {
            i4g0.m138520r("e_push_profile_quit", "p_push_profile");
        }
        m110532D1();
    }

    /* JADX INFO: renamed from: V1 */
    public boolean m110554V1(User user) {
        Settings settings;
        List<SettingGroups> list;
        if (vq8.m202358b() && user != null && (settings = user.settings) != null && (list = settings.settingGroups) != null && !list.isEmpty() && user.settings.settingGroups.get(0) != null && user.settings.settingGroups.get(0).live != null && !user.settings.settingGroups.get(0).live.hideProfileWealthTag.booleanValue()) {
            UserWealthGradeConfig userWealthGradeConfigMo68402Gj = CoreModule.m30934Q().mo68402Gj(user.settings.settingGroups.get(0).live.wealthGrade, false);
            if (userWealthGradeConfigMo68402Gj.openNewIcon && !TextUtils.isEmpty(userWealthGradeConfigMo68402Gj.wealthIconUrl)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: V2 */
    public void m110555V2(User user) {
        zki0.m220079H(act(), user, this.f82361f, this.f82359d);
    }

    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m110556W1(int i, Intent intent, Relationship relationship) {
        act().setResult(i, intent);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: W2 */
    public void m110557W2() {
        if (this.f82361f == null || this.f82359d.f205576a == null) {
            return;
        }
        PerformanceLogUtil.logBegin(new Object().hashCode(), ProfileLogEntity.ProfileLogName.CUSTOM, "reRenderPage!!!");
        this.f82356a.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m110558X1(int i, Intent intent, Throwable th) {
        act().setResult(i, intent);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: X2 */
    public void m110559X2() {
        duringCreated(CoreModule.f18264c.f20381e0.m116527W9(this.f82359d.f205579d).flatMap(new qcj() { // from class: l.bja0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20424s1.m35372s3();
            }
        }).map(new qcj() { // from class: l.cja0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f82111a.m110549P2((List) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.dja0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88825a.m110550Q2((pf60) obj);
            }
        }, new y20() { // from class: l.eja0
            @Override // p153l.y20
            public final void call(Object obj) {
                cla0.m110463L0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ void m110560Y1(int i, Intent intent, Relationship relationship) {
        if (!TEnum.equals(relationship.state, "liked") && !TEnum.equals(relationship.state, "matched") && !TEnum.equals(relationship.state, "superliked")) {
            act().setResult(i, intent);
            act().m68056e2();
        } else {
            if (TEnum.equals(relationship.state, "superliked") || relationship.status.contains(MatchFrom.get(MatchFrom.superLiked)) || i == SwipeDirection.UP.getValue()) {
                return;
            }
            o1j0.m165651y("喜欢已发送");
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        CoreModule.f18264c.f20378d0.f128826R.m159274k().first().subscribe(psd0.m173591B());
        this.f82362g = new ProfileShareHelper(this.f82359d);
        m110559X2();
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m110561Z1(int i, Intent intent, Throwable th) {
        act().setResult(i, intent);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: Z2 */
    public User m110562Z2() {
        zq90 zq90Var = this.f82359d;
        if (zq90Var.f205576a == null && !zq90Var.m220959L()) {
            this.f82359d.m220971X(CoreModule.m30930K().getUserById(this.f82359d.f205579d));
        }
        return this.f82359d.f205576a;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        if (this.f82359d.m220959L()) {
            m110471R1();
        } else {
            m110473S1();
            xc20.m210108t(act());
            m110469Q1();
            m110552T1();
        }
        m110467P1();
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m110563a2() {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m110564b2(final User user, Relationship relationship) {
        User userM116506Q9 = CoreModule.f18264c.f20381e0.m116506Q9(user.f56859id);
        if (userM116506Q9 != null) {
            user = userM116506Q9;
        }
        if (NullChecker.m82486a(relationship) && !relationship.equals(user.localRelationship)) {
            user.localRelationship = relationship;
            CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.wka0
                @Override // p153l.x20
                public final void call() {
                    uqb0.f180405k0.f184355d.upsert(user);
                }
            });
        }
        l51.m152888H(act(), new Runnable() { // from class: l.xka0
            @Override // java.lang.Runnable
            public final void run() {
                this.f194735a.m110563a2();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m110565c2(final User user, final Relationship relationship) {
        l51.m152919y(new Runnable() { // from class: l.rka0
            @Override // java.lang.Runnable
            public final void run() {
                this.f163551a.m110564b2(user, relationship);
            }
        });
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m110566d2(int i, Intent intent, Relationship relationship) {
        if (i != SwipeDirection.LEFT.getValue()) {
            o1j0.m165651y(String.format("喜欢已发送，%s将收到你的喜欢", this.f82359d.f205576a.isFemale() ? "她" : "他"));
        }
        act().setResult(i, intent);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m110567e2(int i, Intent intent, Throwable th) {
        act().setResult(i, intent);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m110568f2(int i, Intent intent, Relationship relationship) {
        act().setResult(i, intent);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ Boolean m110570h2(final String str, final String str2, Boolean bool, Boolean bool2) {
        if (!bool2.booleanValue() || CoreModule.f18264c.f20405m0.f20196u0.get().booleanValue() || !NullChecker.m82486a(CoreModule.f18264c.m32487o3()) || rbb0.m180747t() || !TextUtils.isEmpty(str)) {
            return Boolean.FALSE;
        }
        jxd0 jxd0Var = CoreModule.f18264c.f20405m0.f20196u0;
        Boolean bool3 = Boolean.TRUE;
        jxd0Var.put(bool3);
        hl3.m135664G(act(), true, this.f82363h.name, CoreModule.f18264c.m32487o3().superLikeLimit.remainToday() + "", TEnum.equals(this.f82363h.gender, "male"), new Runnable() { // from class: l.uka0
            @Override // java.lang.Runnable
            public final void run() {
                this.f179379a.m110569g2(str, str2);
            }
        }, new Runnable() { // from class: l.vka0
            @Override // java.lang.Runnable
            public final void run() {
                cla0.m110483a1();
            }
        });
        return bool3;
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m110571i2(boolean z, boolean z2, Relationship relationship) {
        if (z) {
            zq90 zq90Var = this.f82359d;
            zq90Var.f205587l = false;
            zq90Var.f205588m = true;
        } else {
            if (CoreModule.m30932N().mo61573so() && (this.f82359d.m220984k() || this.f82359d.m220985m() || this.f82359d.m220982i())) {
                r1j0.m179420g("喜欢已发送");
            }
            this.f82359d.f205586k = false;
        }
        if (z2) {
            m110532D1();
        }
    }

    /* JADX INFO: renamed from: j2 */
    public final /* synthetic */ void m110572j2(boolean z, Throwable th) {
        zq90 zq90Var = this.f82359d;
        if (z) {
            zq90Var.f205587l = false;
        } else {
            zq90Var.f205586k = false;
        }
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m110573k2(boolean z) {
        zq90 zq90Var = this.f82359d;
        if (z) {
            zq90Var.f205587l = true;
        } else {
            zq90Var.f205586k = true;
        }
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m110574l2(Boolean bool) {
        eu4.m122523b().m122532j(bool.booleanValue());
        m110553U2();
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m110575n2(uxj0 uxj0Var) {
        m110457F1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m110576o2(pf60 pf60Var) {
        this.f82359d.f205576a = (User) pf60Var.f152156a;
        m110475T2(3);
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ Boolean m110577p2(String str) {
        return Boolean.valueOf(this.f82359d.m220981h());
    }

    public String pageId() {
        if ("my_tab_profile_like".equals(this.f82359d.f205577b)) {
            return "p_my_profile_comment";
        }
        if ("from_guess_liker_result".equals(this.f82359d.f205577b)) {
            return "p_guess_who_likes_me_profile";
        }
        if ("from_christmas".equals(this.f82359d.f205577b)) {
            return "p_christmas_profile";
        }
        return (TextUtils.isEmpty(this.f82359d.f205579d) || !this.f82359d.m220964Q()) ? OMSDialogPositon.p_suggest_user_profile_info_view : "p_unmatch_profile";
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m110578q2(String str) {
        if (TextUtils.equals(str, this.f82359d.f205579d)) {
            m110475T2(1);
        }
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ Boolean m110579s2(Long l2) {
        return Boolean.valueOf(!this.f82359d.m220964Q());
    }

    /* JADX INFO: renamed from: t2 */
    public final /* synthetic */ C22421c m110580t2(Long l2) {
        return CoreModule.f18264c.f20381e0.m116527W9(this.f82359d.f205579d);
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ C22421c m110581u2() {
        return C22421c.just(Boolean.valueOf(!this.f82359d.f205580e.f205596f)).filter(new qcj() { // from class: l.sja0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return cla0.m110460I0((Boolean) obj);
            }
        }).switchMap(new qcj() { // from class: l.tja0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C22421c.timer(450L, TimeUnit.MILLISECONDS);
            }
        }).observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.vja0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f184367a.m110579s2((Long) obj);
            }
        }).switchMap(new qcj() { // from class: l.wja0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f189424a.m110580t2((Long) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v2 */
    public final /* synthetic */ void m110582v2(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isBlocked() && NullChecker.m82486a(CoreModule.m30930K().getUserById(this.f82359d.f205579d)) && !CoreModule.m30930K().getUserById(this.f82359d.f205579d).unilateralBlock()) {
            CoreModule.f18264c.f20381e0.m116447Ba(this.f82359d.f205579d);
        }
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m110583w2(C4470c c4470c) {
        if (c4470c == C4470c.f16267i && this.f82359d.f205576a == null) {
            ((ima0) this.viewModel).m140870U0();
        }
    }

    /* JADX INFO: renamed from: x2 */
    public final /* synthetic */ C22421c m110584x2() {
        return C22421c.just(Boolean.valueOf(this.f82359d.m220958K())).filter(new qcj() { // from class: l.mka0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return cla0.m110497j0((Boolean) obj);
            }
        }).switchMap(new qcj() { // from class: l.nka0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C22421c.timer(450L, TimeUnit.MILLISECONDS);
            }
        });
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ C22421c m110585y2() {
        return psd0.m173626s(this.f82359d.m220958K() ? CoreModule.f18264c.f20294B0.m32614j4().distinctUntilChanged() : C22421c.just(null), CoreModule.f18264c.f20381e0.m116483Ka(this.f82359d.f205579d), CoreModule.f18264c.f20381e0.m116596o9(), new jda0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m110586z2(bkj0 bkj0Var) {
        this.f82359d.m220971X((User) bkj0Var.f77082b);
        m110482Y2((User) bkj0Var.f77083c);
        m110557W2();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
