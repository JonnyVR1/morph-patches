package p002l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.PerformanceLogUtil;
import com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.ProfileLogEntity;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListFragLocalImpl;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileShareHelper;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0189c;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.p;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Literatures;
import com.p1.mobile.putong.core.data.LiteraturesComments;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.PicVerification;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.SwipeExtraScData;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserWealthGradeConfig;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live_api.api.serviceprovider.api.LiveService;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.b1c;
import l.cj90;
import l.d30;
import l.di0;
import l.du2;
import l.e30;
import l.e51;
import l.ezc0;
import l.f30;
import l.f9j;
import l.ft4;
import l.hpd0;
import l.j760;
import l.jo0;
import l.jq2;
import l.lsi0;
import l.mb90;
import l.mcr;
import l.mkd0;
import l.ok3;
import l.osi0;
import l.p420;
import l.qer;
import l.qib0;
import l.qp8;
import l.rlt;
import l.roj0;
import l.swh0;
import l.upa;
import l.v9j;
import l.vwb;
import l.w9j;
import l.x9j;
import l.xaj0;
import l.xp5;
import l.zbi0;
import l.zvf0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class yca0 extends jq2<eea0> {

    /* JADX INFO: renamed from: a */
    public final a<roj0> f22792a;

    /* JADX INFO: renamed from: b */
    public final a<roj0> f22793b;

    /* JADX INFO: renamed from: c */
    public j760<List<Literatures>, List<LiteraturesComments>> f22794c;

    /* JADX INFO: renamed from: d */
    public final vi90 f22795d;

    /* JADX INFO: renamed from: e */
    public final ProfileListFragLocalImpl f22796e;

    /* JADX INFO: renamed from: f */
    public User f22797f;

    /* JADX INFO: renamed from: g */
    public ProfileShareHelper f22798g;

    /* JADX INFO: renamed from: h */
    public User f22799h;

    public yca0(mcr mcrVar, vi90 vi90Var) {
        super(mcrVar);
        this.f22792a = a.b();
        this.f22793b = a.b();
        this.f22796e = (ProfileListFragLocalImpl) mcrVar;
        this.f22795d = vi90Var;
    }

    /* JADX INFO: renamed from: C1 */
    public static /* synthetic */ void m26508C1() {
    }

    @MainThread
    /* JADX INFO: renamed from: F1 */
    private void m26512F1() {
        if (this.f22796e.f1800E) {
            du2.a("[core][profile]", "afterGetUserInfo return by Page Animation");
            this.f22796e.f1801F = true;
            return;
        }
        du2.a("[core][profile]", "afterGetUserInfo refresh list");
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.AFTER_GET_USER_INFO;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        m26530T2(0);
        ((eea0) ((jq2) this).viewModel).m12397T0();
        ((eea0) ((jq2) this).viewModel).m12391Q0();
        ((eea0) ((jq2) this).viewModel).m12389P0();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ Boolean m26515I0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: I1 */
    private void m26516I1(int i) {
        if (i == SwipeDirection.LEFT.getValue() && xp5.o(this.f22795d.m23980b(), this.f22795d.f21137a)) {
            CoreModule.c.f0.wo(this.f22795d.f21140d, false).subscribe(mkd0.H(new e30() { // from class: l.oca0
                public final void call(Object obj) {
                    yca0.m26574t0((roj0) obj);
                }
            }, new e30() { // from class: l.pca0
                public final void call(Object obj) {
                    yca0.m26556l0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m26518L0(Throwable th) {
    }

    /* JADX INFO: renamed from: P1 */
    private void m26522P1() {
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.uca0
            public final void call(Object obj) {
                PerformanceLogUtil.logSingle(((c) obj).c);
            }
        }));
        duringCreated(this.f22792a).first().observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.paa0
            public final void call(Object obj) {
                this.f17168a.m26560m2((roj0) obj);
            }
        }, new di0()));
        duringCreated(this.f22792a.throttleLast(1L, TimeUnit.SECONDS).observeOn(jo0.a())).subscribe(mkd0.H(new e30() { // from class: l.qaa0
            public final void call(Object obj) {
                this.f17881a.m26632n2((roj0) obj);
            }
        }, new di0()));
        duringCreated(CoreModule.N().getMomentLikeChangedSub()).subscribe(mkd0.G(new e30() { // from class: l.raa0
            public final void call(Object obj) {
                this.f18439a.m26633o2((j760) obj);
            }
        }));
        duringCreated(CoreModule.c.r0.s0).filter(new w9j() { // from class: l.saa0
            public final Object call(Object obj) {
                return this.f18898a.m26634p2((String) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.taa0
            public final void call(Object obj) {
                this.f20144a.m26635q2((String) obj);
            }
        }));
        duringCreated(p.f0).subscribe(mkd0.G(new e30() { // from class: l.vaa0
            public final void call(Object obj) {
                yca0.m26525R0((roj0) obj);
            }
        }));
        duringCreated(p.g0).subscribe(mkd0.G(new e30() { // from class: l.waa0
            public final void call(Object obj) {
                yca0.m26534W0((roj0) obj);
            }
        }));
        if ((f9j.a(this.f22795d.f21138b) || m26532U1() || "liked_users_anchor".equals(this.f22795d.f21138b) || this.f22795d.m23960H() || "from_greet_act".equals(this.f22795d.f21138b)) && !this.f22795d.m23963K()) {
            duringCreated(CoreModule.c.f0.Ue(this.f22795d.f21140d).map(new w9j() { // from class: l.vca0
                public final Object call(Object obj) {
                    Conversation conversation = (Conversation) obj;
                    return Boolean.valueOf(conversation != null && conversation.needCheckValidStatus());
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.wca0
                public final void call(Object obj) {
                    this.f21628a.m26571r2((Boolean) obj);
                }
            }));
        }
        duringCreated(new v9j() { // from class: l.xca0
            public final Object call() {
                return this.f22215a.m26638u2();
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.kaa0
            public final void call(Object obj) {
                yca0.m26551i1((roj0) obj);
            }
        }, new e30() { // from class: l.laa0
            public final void call(Object obj) {
                this.f14744a.m26639v2((Throwable) obj);
            }
        }));
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.maa0
            public final void call(Object obj) {
                this.f15292a.m26640w2((c) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.naa0
            public final Object call() {
                return this.f15886a.m26641x2();
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.oaa0
            public final void call(Object obj) {
                CoreModule.c.B0.p4(CoreModule.H().userId());
            }
        }));
        duringCreated(CoreModule.c.d0.j3()).subscribe(mkd0.B());
        m26603O1();
    }

    /* JADX INFO: renamed from: Q1 */
    private void m26524Q1() {
        if (this.f22795d.m23963K()) {
            duringCreated(new v9j() { // from class: l.bca0
                public final Object call() {
                    return this.f8069a.m26642y2();
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.mca0
                public final void call(Object obj) {
                    this.f15326a.m26643z2((xaj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m26525R0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: R1 */
    private void m26526R1() {
        creates(new e30() { // from class: l.jaa0
            public final void call(Object obj) {
                this.f13651a.m26584A2((Bundle) obj);
            }
        });
        duringCreated(CoreModule.c.e0.Ka(this.f22795d.f21140d)).map(new w9j() { // from class: l.uaa0
            public final Object call(Object obj) {
                return ((User) obj).verifications;
            }
        }).distinctUntilChanged().filter(new w9j() { // from class: l.fba0
            public final Object call(Object obj) {
                return this.f10220a.m26585B2((PicVerification) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.qba0
            public final void call(Object obj) {
                this.f17886a.m26586C2((PicVerification) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S1 */
    private void m26528S1() {
        if (!this.f22795d.m23969Q()) {
            duringCreated(CoreModule.c.e0.Y9(this.f22795d.f21140d, false, true).flatMap(new w9j() { // from class: l.bba0
                public final Object call(Object obj) {
                    return CoreModule.c.s1.s3();
                }
            }).map(new w9j() { // from class: l.dba0
                public final Object call(Object obj) {
                    return this.f9153a.m26594I2((List) obj);
                }
            })).subscribe(mkd0.H(new e30() { // from class: l.eba0
                public final void call(Object obj) {
                    this.f9654a.m26596J2((j760) obj);
                }
            }, new e30() { // from class: l.gba0
                public final void call(Object obj) {
                    yca0.m26580x1((Throwable) obj);
                }
            }));
        }
        if (this.f22795d.m23963K()) {
            duringCreated(CoreModule.c.e0.o9()).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.hba0
                public final void call(Object obj) {
                    this.f11958a.m26597K2((User) obj);
                }
            }));
            return;
        }
        if (f9j.a(this.f22795d.f21138b)) {
            duringCreated(rx.c.just(roj0.a)).subscribe(mkd0.G(new e30() { // from class: l.iba0
                public final void call(Object obj) {
                    this.f13129a.m26599L2((roj0) obj);
                }
            }));
        }
        duringCreated(new v9j() { // from class: l.jba0
            public final Object call() {
                return this.f13665a.m26588D2();
            }
        }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.kba0
            public final void call(Object obj) {
                this.f14268a.m26590E2((j760) obj);
            }
        }));
        duringCreated(CoreModule.c.r0.v5()).filter(new w9j() { // from class: l.lba0
            public final Object call(Object obj) {
                return this.f14752a.m26591F2((j760) obj);
            }
        }).map(new w9j() { // from class: l.mba0
            public final Object call(Object obj) {
                return yca0.m26547g1((j760) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.cba0
            public final void call(Object obj) {
                this.f8576a.m26593H2((RelationshipStatus) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S2 */
    private void m26529S2(int i) {
        if (i == SwipeDirection.LEFT.getValue() && this.f22795d.m24001x()) {
            cj90.b(this.f22795d.f21140d);
        }
    }

    /* JADX INFO: renamed from: T2 */
    private void m26530T2(int i) {
        if (!this.f22795d.m23963K() && NullChecker.a(this.f22795d.f21137a)) {
            ((eea0) ((jq2) this).viewModel).m12403X0(i);
        }
        if (i == 3 || i == 2) {
            ((eea0) ((jq2) this).viewModel).f9706o.m14452b(new d30() { // from class: l.kca0
                public final void call() {
                    this.f14278a.m26602N2();
                }
            });
        }
    }

    /* JADX INFO: renamed from: U1 */
    private boolean m26532U1() {
        if ("from_portrait_like_list".equals(this.f22795d.f21138b) || TextUtils.equals(this.f22795d.f21138b, "from_mew_tags") || this.f22795d.m23989k() || this.f22795d.m23990m() || this.f22795d.m23987i() || TextUtils.equals(this.f22795d.f21138b, "from_literature_third")) {
            return true;
        }
        if (upa.V1()) {
            return "chat_group".equals(this.f22795d.f21138b) || "chat_group_anonymity".equals(this.f22795d.f21138b) || "group_notification".equals(this.f22795d.f21138b) || "group_notification_anonymity".equals(this.f22795d.f21138b);
        }
        return false;
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m26534W0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: Y2 */
    private void m26537Y2(User user) {
        this.f22797f = user;
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ void m26538a1() {
    }

    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ RelationshipStatus m26547g1(j760 j760Var) {
        return (RelationshipStatus) j760Var.b;
    }

    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ void m26551i1(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ Boolean m26552j0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m26556l0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m2 */
    public /* synthetic */ void m26560m2(roj0 roj0Var) {
        m26512F1();
    }

    /* JADX INFO: renamed from: o1 */
    public static /* synthetic */ void m26564o1(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r2 */
    public /* synthetic */ void m26571r2(Boolean bool) {
        m26530T2(2);
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m26574t0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ void m26580x1(Throwable th) {
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m26584A2(Bundle bundle) {
        m26537Y2(this.f22795d.f21141e.f21162k);
        vi90 vi90Var = this.f22795d;
        vi90Var.m23976X(vi90Var.f21141e.f21162k);
        this.f22792a.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ Boolean m26585B2(PicVerification picVerification) {
        return Boolean.valueOf(!this.f22795d.f21141e.f21162k.verifications.equals(picVerification));
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m26586C2(PicVerification picVerification) {
        this.f22795d.f21141e.f21162k.verifications = picVerification;
        this.f22792a.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: D1 */
    public void m26587D1() {
        LiveService liveService;
        ((eea0) ((jq2) this).viewModel).m12404Y();
        act().finish();
        if (!rlt.c(this.f22795d.f21138b) || this.f22796e.f1799D || (liveService = qib0.b0.c) == null) {
            return;
        }
        liveService.Tc(act(), this.f22795d.f21140d, true);
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ rx.c m26588D2() {
        return mkd0.r(CoreModule.c.e0.Ka(this.f22795d.f21140d), CoreModule.c.e0.o9(), new g5a0());
    }

    /* JADX INFO: renamed from: E1 */
    public void m26589E1(final int i) {
        m26529S2(i);
        m26516I1(i);
        vi90 vi90Var = this.f22795d;
        if (vi90Var.f21137a == null) {
            act().finish();
            return;
        }
        boolean zM23956D = vi90Var.m23956D();
        SwipeDirection swipeDirection = SwipeDirection.UP;
        if (i == swipeDirection.getValue() && ezc0.m0() && !ezc0.i0().g0() && swh0.w0(CoreModule.c.o3().superLikeLimit.remainToday()) == 0 && !mb90.b(PurchaseType.TYPE_SUPERLIKE_PKG) && !zM23956D) {
            C0189c.m3978M1(act(), "p_profile,superlike", Privilege.vip_super_like, null, null, false, this.f22795d.f21137a);
            return;
        }
        ((eea0) ((jq2) this).viewModel).m12404Y();
        final Intent intent = new Intent();
        intent.putExtra("currentImageIndex", ((eea0) ((jq2) this).viewModel).m12394S());
        int iM12394S = ((eea0) ((jq2) this).viewModel).m12394S();
        int size = this.f22795d.f21137a.pictures.size();
        vi90 vi90Var2 = this.f22795d;
        if (iM12394S < size) {
            intent.putExtra("currentImageUrl", ((Media) vi90Var2.f21137a.pictures.get(((eea0) ((jq2) this).viewModel).m12394S())).url);
        } else {
            intent.putExtra("currentImageUrl", vi90Var2.f21137a.hasPic() ? ((Media) this.f22795d.f21137a.fp()).url : "");
            CrashHelper.c(new Exception("ProfileListFrag user pictures get index crash"));
        }
        if (this.f22795d.m23999v() || this.f22795d.m24000w() || this.f22795d.m24003z() || this.f22795d.m23953A() || this.f22795d.m23956D() || this.f22795d.m24002y() || this.f22795d.m23993p()) {
            intent.putExtra("currentUserId", this.f22795d.f21140d);
        }
        boolean zM23957E = this.f22795d.m23957E();
        vi90 vi90Var3 = this.f22795d;
        if (zM23957E) {
            if (NullChecker.a(vi90Var3.f21137a)) {
                qer.n(act(), this.f22795d.f21137a, i == SwipeDirection.RIGHT.getValue() || i == swipeDirection.getValue(), i == swipeDirection.getValue(), false, "home", (x9j) null, new e30() { // from class: l.vba0
                    public final void call(Object obj) {
                        this.f21054a.m26611W1(i, intent, (Relationship) obj);
                    }
                }, new e30() { // from class: l.wba0
                    public final void call(Object obj) {
                        this.f21599a.m26613X1(i, intent, (Throwable) obj);
                    }
                }, pageId(), (LikeExtraData) null, (String) null, (String) null);
                return;
            }
            return;
        }
        boolean zM23997t = vi90Var3.m23997t();
        vi90 vi90Var4 = this.f22795d;
        if (zM23997t) {
            if (NullChecker.a(vi90Var4.f21137a)) {
                qer.n(act(), this.f22795d.f21137a, i == SwipeDirection.RIGHT.getValue() || i == swipeDirection.getValue(), i == swipeDirection.getValue(), false, this.f22795d.f21138b, (x9j) null, new e30() { // from class: l.xba0
                    public final void call(Object obj) {
                        this.f22206a.m26615Y1(i, intent, (Relationship) obj);
                    }
                }, new e30() { // from class: l.yba0
                    public final void call(Object obj) {
                        this.f22781a.m26617Z1(i, intent, (Throwable) obj);
                    }
                }, pageId(), (LikeExtraData) null, (String) null, (String) null);
                return;
            }
            return;
        }
        boolean zM23985g = vi90Var4.m23985g();
        vi90 vi90Var5 = this.f22795d;
        if (zM23985g) {
            if (NullChecker.a(vi90Var5.f21137a)) {
                qer.r(act(), this.f22795d.f21137a, i == SwipeDirection.RIGHT.getValue() || i == swipeDirection.getValue(), i == swipeDirection.getValue(), pageId(), new f30() { // from class: l.zba0
                    public final void call(Object obj, Object obj2) {
                        this.f23326a.m26622c2((User) obj, (Relationship) obj2);
                    }
                });
                return;
            }
            return;
        }
        boolean zM23991n = vi90Var5.m23991n();
        vi90 vi90Var6 = this.f22795d;
        if (zM23991n) {
            if (NullChecker.a(vi90Var6.f21137a)) {
                qer.n(act(), this.f22795d.f21137a, i == SwipeDirection.RIGHT.getValue() || i == swipeDirection.getValue(), i == swipeDirection.getValue(), false, "from_find_partner", (x9j) null, new e30() { // from class: l.aca0
                    public final void call(Object obj) {
                        this.f7492a.m26623d2(i, intent, (Relationship) obj);
                    }
                }, new e30() { // from class: l.cca0
                    public final void call(Object obj) {
                        this.f8586a.m26624e2(i, intent, (Throwable) obj);
                    }
                }, pageId(), (LikeExtraData) null, (String) null, (String) null);
            }
        } else if (vi90Var6.m23956D()) {
            b1c.j(act(), this.f22795d.f21137a, i == SwipeDirection.RIGHT.getValue() || i == swipeDirection.getValue(), i == swipeDirection.getValue(), pageId(), new e30() { // from class: l.dca0
                public final void call(Object obj) {
                    this.f9159a.m26625f2(i, intent, (Relationship) obj);
                }
            }, new d30() { // from class: l.eca0
                public final void call() {
                    yca0.m26508C1();
                }
            });
        } else {
            act().setResult(i, intent);
            act().finish();
        }
    }

    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m26590E2(j760 j760Var) {
        this.f22795d.m23976X((User) j760Var.a);
        m26537Y2((User) j760Var.b);
        this.f22792a.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: F2 */
    public final /* synthetic */ Boolean m26591F2(j760 j760Var) {
        return Boolean.valueOf(NullChecker.a(j760Var) && TextUtils.equals((CharSequence) j760Var.a, this.f22795d.f21140d));
    }

    /* JADX INFO: renamed from: H1 */
    public x9j<Boolean, Boolean, Boolean> m26592H1(final String str, final String str2) {
        return new x9j() { // from class: l.lca0
            public final Object call(Object obj, Object obj2) {
                return this.f14760a.m26627h2(str, str2, (Boolean) obj, (Boolean) obj2);
            }
        };
    }

    /* JADX INFO: renamed from: H2 */
    public final /* synthetic */ void m26593H2(RelationshipStatus relationshipStatus) {
        m26530T2(3);
    }

    /* JADX INFO: renamed from: I2 */
    public final /* synthetic */ j760 m26594I2(List list) {
        return vwb.Y(list, BookMoviesDramasHelper.l(this.f22795d.f21140d));
    }

    /* JADX INFO: renamed from: J1 */
    public void m26595J1(final boolean z) {
        if (this.f22799h == null) {
            this.f22799h = this.f22795d.m23978Z();
        }
        if (NullChecker.a(this.f22799h)) {
            LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
            int iM12394S = ((eea0) ((jq2) this).viewModel).m12394S();
            SwipeExtraScData swipeExtraScData = likeExtraDataNew_.swipeExtraScData;
            swipeExtraScData.picNum = iM12394S;
            swipeExtraScData.picUploads = this.f22799h.pictures.size();
            if (NullChecker.a(this.f22795d.f21137a) && this.f22795d.f21137a.pictures.size() != this.f22799h.pictures.size()) {
                CrashHelper.c(new IllegalStateException(" profilelist picture size diff , user  " + ((DbObject) this.f22795d.f21137a).id + " " + this.f22795d.f21137a.pictures.size() + " withRelation " + ((DbObject) this.f22799h).id + " " + this.f22799h.pictures.size()));
            }
            int size = this.f22799h.pictures.size();
            SwipeExtraScData swipeExtraScData2 = likeExtraDataNew_.swipeExtraScData;
            if (iM12394S >= size) {
                swipeExtraScData2.picUrl = "";
            } else {
                swipeExtraScData2.picUrl = ((Media) this.f22799h.pictures.get(iM12394S)).url;
            }
            final boolean zM23972T = this.f22795d.m23972T();
            if (qer.o(act(), this.f22799h, true, z, false, z ? "p_profile,superlike" : "p_home,likelimit", m26592H1("", ""), new e30() { // from class: l.fca0
                public final void call(Object obj) {
                    this.f10226a.m26628i2(z, zM23972T, (Relationship) obj);
                }
            }, new e30() { // from class: l.gca0
                public final void call(Object obj) {
                    this.f11357a.m26629j2(z, (Throwable) obj);
                }
            }, pageId(), likeExtraDataNew_, "", "", new d30() { // from class: l.hca0
                public final void call() {
                    this.f11967a.m26630k2(z);
                }
            })) {
                vi90 vi90Var = this.f22795d;
                if (z) {
                    vi90Var.f21148l = true;
                } else {
                    vi90Var.f21147k = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: J2 */
    public final /* synthetic */ void m26596J2(j760 j760Var) {
        this.f22794c = j760Var;
        m26612W2();
    }

    /* JADX INFO: renamed from: K2 */
    public final /* synthetic */ void m26597K2(User user) {
        m26537Y2(user);
        this.f22795d.m23976X(user);
        this.f22792a.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: L1, reason: merged with bridge method [inline-methods] */
    public void m26626g2(String str, String str2) {
        m26595J1(true);
    }

    /* JADX INFO: renamed from: L2 */
    public final /* synthetic */ void m26599L2(roj0 roj0Var) {
        this.f22795d.m23976X(m26618Z2());
        m26537Y2(CoreModule.K().me_());
        if (this.f22795d.f21137a == null || this.f22797f == null) {
            return;
        }
        this.f22792a.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: M2 */
    public final /* synthetic */ void m26600M2(roj0 roj0Var) {
        ((eea0) ((jq2) this).viewModel).m12400V0();
    }

    /* JADX INFO: renamed from: N1 */
    public ProfileShareHelper m26601N1() {
        return this.f22798g;
    }

    /* JADX INFO: renamed from: N2 */
    public final /* synthetic */ void m26602N2() {
        ((eea0) ((jq2) this).viewModel).f9706o.m3336F1(this.f22795d.f21137a);
    }

    /* JADX INFO: renamed from: O1 */
    public void m26603O1() {
        if (ft4.b().g()) {
            act().duringCreated(CoreModule.c.U1.S).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.tba0
                public final void call(Object obj) {
                    this.f20163a.m26631l2((Boolean) obj);
                }
            }, new e30() { // from class: l.uba0
                public final void call(Object obj) {
                    yca0.m26564o1((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: P2 */
    public final /* synthetic */ j760 m26604P2(List list) {
        return vwb.Y(list, BookMoviesDramasHelper.l(this.f22795d.f21140d));
    }

    /* JADX INFO: renamed from: Q2 */
    public final /* synthetic */ void m26605Q2(j760 j760Var) {
        this.f22794c = j760Var;
        m26612W2();
    }

    /* JADX INFO: renamed from: R2 */
    public User m26606R2() {
        if (this.f22797f == null) {
            m26537Y2(CoreModule.K().me_());
        }
        return this.f22797f;
    }

    /* JADX INFO: renamed from: T1 */
    public void m26607T1() {
        if (this.f22795d.m23992o() || TextUtils.equals("share_profile", this.f22795d.f21138b) || this.f22795d.m23958F()) {
            duringCreated(hra0.f12240k).subscribe(mkd0.G(new e30() { // from class: l.nba0
                public final void call(Object obj) {
                    this.f15909a.m26600M2((roj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: U2 */
    public void m26608U2() {
        if (this.f22795d.m23957E()) {
            zvf0.r("e_push_profile_quit", "p_push_profile");
        }
        m26587D1();
    }

    /* JADX INFO: renamed from: V1 */
    public boolean m26609V1(User user) {
        Settings settings;
        List list;
        if (qp8.b() && user != null && (settings = user.settings) != null && (list = settings.settingGroups) != null && !list.isEmpty() && user.settings.settingGroups.get(0) != null && ((SettingGroups) user.settings.settingGroups.get(0)).live != null && !((SettingGroups) user.settings.settingGroups.get(0)).live.hideProfileWealthTag.booleanValue()) {
            UserWealthGradeConfig userWealthGradeConfigGj = CoreModule.Q().Gj(((SettingGroups) user.settings.settingGroups.get(0)).live.wealthGrade, false);
            if (userWealthGradeConfigGj.openNewIcon && !TextUtils.isEmpty(userWealthGradeConfigGj.wealthIconUrl)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: V2 */
    public void m26610V2(User user) {
        zbi0.H(act(), user, this.f22797f, this.f22795d);
    }

    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m26611W1(int i, Intent intent, Relationship relationship) {
        act().setResult(i, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: W2 */
    public void m26612W2() {
        if (this.f22797f == null || this.f22795d.f21137a == null) {
            return;
        }
        PerformanceLogUtil.logBegin(new Object().hashCode(), ProfileLogEntity.ProfileLogName.CUSTOM, "reRenderPage!!!");
        this.f22792a.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m26613X1(int i, Intent intent, Throwable th) {
        act().setResult(i, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: X2 */
    public void m26614X2() {
        duringCreated(CoreModule.c.e0.W9(this.f22795d.f21140d).flatMap(new w9j() { // from class: l.xaa0
            public final Object call(Object obj) {
                return CoreModule.c.s1.s3();
            }
        }).map(new w9j() { // from class: l.yaa0
            public final Object call(Object obj) {
                return this.f22752a.m26604P2((List) obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.zaa0
            public final void call(Object obj) {
                this.f23320a.m26605Q2((j760) obj);
            }
        }, new e30() { // from class: l.aba0
            public final void call(Object obj) {
                yca0.m26518L0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ void m26615Y1(int i, Intent intent, Relationship relationship) {
        if (!TEnum.equals(relationship.state, "liked") && !TEnum.equals(relationship.state, "matched") && !TEnum.equals(relationship.state, "superliked")) {
            act().setResult(i, intent);
            act().finish();
        } else {
            if (TEnum.equals(relationship.state, "superliked") || relationship.status.contains(MatchFrom.get("superLiked")) || i == SwipeDirection.UP.getValue()) {
                return;
            }
            lsi0.y("喜欢已发送");
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m26616Z() {
        super.Z();
        CoreModule.c.d0.R.k().first().subscribe(mkd0.B());
        this.f22798g = new ProfileShareHelper(this.f22795d);
        m26614X2();
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m26617Z1(int i, Intent intent, Throwable th) {
        act().setResult(i, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: Z2 */
    public User m26618Z2() {
        vi90 vi90Var = this.f22795d;
        if (vi90Var.f21137a == null && !vi90Var.m23964L()) {
            this.f22795d.m23976X(CoreModule.K().getUserById(this.f22795d.f21140d));
        }
        return this.f22795d.f21137a;
    }

    /* JADX INFO: renamed from: a0 */
    public void m26619a0() {
        super.a0();
        if (this.f22795d.m23964L()) {
            m26526R1();
        } else {
            m26528S1();
            p420.t(act());
            m26524Q1();
            m26607T1();
        }
        m26522P1();
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m26620a2() {
        act().finish();
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m26621b2(final User user, Relationship relationship) {
        User userQ9 = CoreModule.c.e0.Q9(((DbObject) user).id);
        if (userQ9 != null) {
            user = userQ9;
        }
        if (NullChecker.a(relationship) && !relationship.equals(user.localRelationship)) {
            user.localRelationship = relationship;
            CoreModule.c.U.a(new d30() { // from class: l.sca0
                public final void call() {
                    qib0.k0.d.upsert(user);
                }
            });
        }
        e51.H(act(), new Runnable() { // from class: l.tca0
            @Override // java.lang.Runnable
            public final void run() {
                this.f20180a.m26620a2();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m26622c2(final User user, final Relationship relationship) {
        e51.y(new Runnable() { // from class: l.nca0
            @Override // java.lang.Runnable
            public final void run() {
                this.f15942a.m26621b2(user, relationship);
            }
        });
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m26623d2(int i, Intent intent, Relationship relationship) {
        if (i != SwipeDirection.LEFT.getValue()) {
            lsi0.y(String.format("喜欢已发送，%s将收到你的喜欢", this.f22795d.f21137a.isFemale() ? "她" : "他"));
        }
        act().setResult(i, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m26624e2(int i, Intent intent, Throwable th) {
        act().setResult(i, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m26625f2(int i, Intent intent, Relationship relationship) {
        act().setResult(i, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ Boolean m26627h2(final String str, final String str2, Boolean bool, Boolean bool2) {
        if (!bool2.booleanValue() || ((Boolean) CoreModule.c.m0.u0.get()).booleanValue() || !NullChecker.a(CoreModule.c.o3()) || n3b0.m18489t() || !TextUtils.isEmpty(str)) {
            return Boolean.FALSE;
        }
        hpd0 hpd0Var = CoreModule.c.m0.u0;
        Boolean bool3 = Boolean.TRUE;
        hpd0Var.put(bool3);
        ok3.G(act(), true, this.f22799h.name, CoreModule.c.o3().superLikeLimit.remainToday() + "", TEnum.equals(this.f22799h.gender, "male"), new Runnable() { // from class: l.qca0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17898a.m26626g2(str, str2);
            }
        }, new Runnable() { // from class: l.rca0
            @Override // java.lang.Runnable
            public final void run() {
                yca0.m26538a1();
            }
        });
        return bool3;
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m26628i2(boolean z, boolean z2, Relationship relationship) {
        if (z) {
            vi90 vi90Var = this.f22795d;
            vi90Var.f21148l = false;
            vi90Var.f21149m = true;
        } else {
            if (CoreModule.N().so() && (this.f22795d.m23989k() || this.f22795d.m23990m() || this.f22795d.m23987i())) {
                osi0.g("喜欢已发送");
            }
            this.f22795d.f21147k = false;
        }
        if (z2) {
            m26587D1();
        }
    }

    /* JADX INFO: renamed from: j2 */
    public final /* synthetic */ void m26629j2(boolean z, Throwable th) {
        vi90 vi90Var = this.f22795d;
        if (z) {
            vi90Var.f21148l = false;
        } else {
            vi90Var.f21147k = false;
        }
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m26630k2(boolean z) {
        vi90 vi90Var = this.f22795d;
        if (z) {
            vi90Var.f21148l = true;
        } else {
            vi90Var.f21147k = true;
        }
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m26631l2(Boolean bool) {
        ft4.b().j(bool.booleanValue());
        m26608U2();
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m26632n2(roj0 roj0Var) {
        m26512F1();
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m26633o2(j760 j760Var) {
        this.f22795d.f21137a = (User) j760Var.a;
        m26530T2(3);
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ Boolean m26634p2(String str) {
        return Boolean.valueOf(this.f22795d.m23986h());
    }

    public String pageId() {
        if ("my_tab_profile_like".equals(this.f22795d.f21138b)) {
            return "p_my_profile_comment";
        }
        if ("from_guess_liker_result".equals(this.f22795d.f21138b)) {
            return "p_guess_who_likes_me_profile";
        }
        if ("from_christmas".equals(this.f22795d.f21138b)) {
            return "p_christmas_profile";
        }
        return (TextUtils.isEmpty(this.f22795d.f21140d) || !this.f22795d.m23969Q()) ? "p_suggest_user_profile_info_view" : "p_unmatch_profile";
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m26635q2(String str) {
        if (TextUtils.equals(str, this.f22795d.f21140d)) {
            m26530T2(1);
        }
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ Boolean m26636s2(Long l2) {
        return Boolean.valueOf(!this.f22795d.m23969Q());
    }

    /* JADX INFO: renamed from: t2 */
    public final /* synthetic */ rx.c m26637t2(Long l2) {
        return CoreModule.c.e0.W9(this.f22795d.f21140d);
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ rx.c m26638u2() {
        return rx.c.just(Boolean.valueOf(!this.f22795d.f21141e.f21157f)).filter(new w9j() { // from class: l.oba0
            public final Object call(Object obj) {
                return yca0.m26515I0((Boolean) obj);
            }
        }).switchMap(new w9j() { // from class: l.pba0
            public final Object call(Object obj) {
                return rx.c.timer(450L, TimeUnit.MILLISECONDS);
            }
        }).observeOn(jo0.a()).filter(new w9j() { // from class: l.rba0
            public final Object call(Object obj) {
                return this.f18450a.m26636s2((Long) obj);
            }
        }).switchMap(new w9j() { // from class: l.sba0
            public final Object call(Object obj) {
                return this.f18908a.m26637t2((Long) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v2 */
    public final /* synthetic */ void m26639v2(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isBlocked() && NullChecker.a(CoreModule.K().getUserById(this.f22795d.f21140d)) && !CoreModule.K().getUserById(this.f22795d.f21140d).unilateralBlock()) {
            CoreModule.c.e0.Ba(this.f22795d.f21140d);
        }
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m26640w2(c cVar) {
        if (cVar == c.i && this.f22795d.f21137a == null) {
            ((eea0) ((jq2) this).viewModel).m12399U0();
        }
    }

    /* JADX INFO: renamed from: x2 */
    public final /* synthetic */ rx.c m26641x2() {
        return rx.c.just(Boolean.valueOf(this.f22795d.m23963K())).filter(new w9j() { // from class: l.ica0
            public final Object call(Object obj) {
                return yca0.m26552j0((Boolean) obj);
            }
        }).switchMap(new w9j() { // from class: l.jca0
            public final Object call(Object obj) {
                return rx.c.timer(450L, TimeUnit.MILLISECONDS);
            }
        });
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ rx.c m26642y2() {
        return mkd0.s(this.f22795d.m23963K() ? CoreModule.c.B0.j4().distinctUntilChanged() : rx.c.just((Object) null), CoreModule.c.e0.Ka(this.f22795d.f21140d), CoreModule.c.e0.o9(), new f5a0());
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m26643z2(xaj0 xaj0Var) {
        this.f22795d.m23976X((User) xaj0Var.b);
        m26537Y2((User) xaj0Var.c);
        m26612W2();
    }

    public void destroy() {
    }
}
