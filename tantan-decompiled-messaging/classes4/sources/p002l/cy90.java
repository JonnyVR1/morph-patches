package p002l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.PerformanceLogUtil;
import com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.ProfileLogEntity;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListFragExpandedImpl;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileShareHelper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.BubbleInfo;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.PicVerification;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.SwipeExtraScData;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live_api.api.serviceprovider.api.LiveService;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.b1c;
import l.cj90;
import l.d30;
import l.di0;
import l.du2;
import l.e30;
import l.e51;
import l.f30;
import l.f9j;
import l.hpd0;
import l.j760;
import l.jo0;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.ok3;
import l.osi0;
import l.p420;
import l.qer;
import l.qib0;
import l.rlt;
import l.roj0;
import l.s7m;
import l.upa;
import l.v9j;
import l.w9j;
import l.x9j;
import l.xaj0;
import l.xma;
import l.xp5;
import l.zvf0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cy90 extends jq2<ly90> {

    /* JADX INFO: renamed from: a */
    public final a<roj0> f8977a;

    /* JADX INFO: renamed from: b */
    public final a<roj0> f8978b;

    /* JADX INFO: renamed from: c */
    public final vi90 f8979c;

    /* JADX INFO: renamed from: d */
    public final ProfileListFragExpandedImpl f8980d;

    /* JADX INFO: renamed from: e */
    public ProfileShareHelper f8981e;

    /* JADX INFO: renamed from: f */
    public User f8982f;

    /* JADX INFO: renamed from: g */
    public User f8983g;

    public cy90(mcr mcrVar, vi90 vi90Var) {
        super(mcrVar);
        this.f8977a = a.b();
        this.f8978b = a.b();
        this.f8980d = (ProfileListFragExpandedImpl) mcrVar;
        this.f8979c = vi90Var;
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ void m11414F0() {
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ List m11416H0(j760 j760Var) {
        return (List) j760Var.b;
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ void m11418J0() {
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m11419L0(Throwable th) {
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m11423Q0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X1 */
    public /* synthetic */ void m11430X1(roj0 roj0Var) {
        m11506o1();
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ void m11431Y0() {
    }

    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ RelationshipStatus m11435d1(j760 j760Var) {
        return (RelationshipStatus) j760Var.b;
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m11453n0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m11455p0() {
    }

    /* JADX INFO: renamed from: u1 */
    private void m11461u1() {
        duringCreated(this.f8977a).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.ew90
            public final void call(Object obj) {
                this.f10019a.m11430X1((roj0) obj);
            }
        }, new di0()));
        duringCreated(CoreModule.N().getMomentLikeChangedSub()).subscribe(mkd0.G(new e30() { // from class: l.fw90
            public final void call(Object obj) {
                this.f10660a.m11486Y1((j760) obj);
            }
        }));
        duringCreated(CoreModule.c.r0.s0).filter(new w9j() { // from class: l.gw90
            public final Object call(Object obj) {
                return this.f11647a.m11488Z1((String) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.hw90
            public final void call(Object obj) {
                this.f12311a.m11490a2((String) obj);
            }
        }));
        if ((f9j.a(this.f8979c.f21138b) || m11468C1() || "liked_users_anchor".equals(this.f8979c.f21138b) || this.f8979c.m23960H() || "from_greet_act".equals(this.f8979c.f21138b)) && !this.f8979c.m23963K()) {
            duringCreated(CoreModule.c.f0.Ue(this.f8979c.f21140d).map(new w9j() { // from class: l.iw90
                public final Object call(Object obj) {
                    Conversation conversation = (Conversation) obj;
                    return Boolean.valueOf(conversation != null && conversation.needCheckValidStatus());
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.jw90
                public final void call(Object obj) {
                    this.f14091a.m11491b2((Boolean) obj);
                }
            }));
        }
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.kw90
            public final void call(Object obj) {
                this.f14561a.m11492c2((c) obj);
            }
        }));
        duringCreated(CoreModule.c.d0.j3()).subscribe(mkd0.B());
        duringCreated(CoreModule.Q().ao(this.f8979c.f21140d)).subscribe(mkd0.G(new e30() { // from class: l.lw90
            public final void call(Object obj) {
                this.f15094a.m11493d2((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A2 */
    public final void m11465A2(User user) {
        this.f8982f = user;
    }

    /* JADX INFO: renamed from: B1 */
    public final void m11466B1() {
        if (this.f8979c.m23973U()) {
            duringCreated(CoreModule.c.e0.L7(this.f8979c.f21140d)).subscribe(mkd0.G(new e30() { // from class: l.tw90
                public final void call(Object obj) {
                    this.f20412a.m11518u2((List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: B2 */
    public User m11467B2() {
        vi90 vi90Var = this.f8979c;
        if (vi90Var.f21137a == null && !vi90Var.m23964L()) {
            this.f8979c.m23976X(CoreModule.K().getUserById(this.f8979c.f21140d));
        }
        return this.f8979c.f21137a;
    }

    /* JADX INFO: renamed from: C1 */
    public final boolean m11468C1() {
        if ("from_portrait_like_list".equals(this.f8979c.f21138b) || TextUtils.equals(this.f8979c.f21138b, "from_mew_tags") || this.f8979c.m23989k() || this.f8979c.m23990m() || this.f8979c.m23987i() || TextUtils.equals(this.f8979c.f21138b, "from_literature_third")) {
            return true;
        }
        if (upa.V1()) {
            return "chat_group".equals(this.f8979c.f21138b) || "chat_group_anonymity".equals(this.f8979c.f21138b) || "group_notification".equals(this.f8979c.f21138b) || "group_notification_anonymity".equals(this.f8979c.f21138b);
        }
        return false;
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m11469D1(int i, Intent intent, Relationship relationship) {
        act().setResult(i, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m11470E1(int i, Intent intent, Throwable th) {
        act().setResult(i, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m11471F1(int i, Intent intent, Relationship relationship) {
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

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m11472H1(int i, Intent intent, Throwable th) {
        act().setResult(i, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m11473I1() {
        act().finish();
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m11474J1(final User user, Relationship relationship) {
        User userQ9 = CoreModule.c.e0.Q9(((DbObject) user).id);
        if (userQ9 != null) {
            user = userQ9;
        }
        if (NullChecker.a(relationship) && !relationship.equals(user.localRelationship)) {
            user.localRelationship = relationship;
            CoreModule.c.U.a(new d30() { // from class: l.sx90
                public final void call() {
                    qib0.k0.d.upsert(user);
                }
            });
        }
        e51.H(act(), new Runnable() { // from class: l.ux90
            @Override // java.lang.Runnable
            public final void run() {
                this.f20867a.m11473I1();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m11475L1(final User user, final Relationship relationship) {
        e51.y(new Runnable() { // from class: l.qx90
            @Override // java.lang.Runnable
            public final void run() {
                this.f18266a.m11474J1(user, relationship);
            }
        });
    }

    /* JADX INFO: renamed from: N1 */
    public final /* synthetic */ void m11476N1(int i, Intent intent, Relationship relationship) {
        if (i != SwipeDirection.LEFT.getValue()) {
            lsi0.y(String.format("喜欢已发送，%s将收到你的喜欢", this.f8979c.f21137a.isFemale() ? "她" : "他"));
        }
        act().setResult(i, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: O1 */
    public final /* synthetic */ void m11477O1(int i, Intent intent, Throwable th) {
        act().setResult(i, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: P1 */
    public final /* synthetic */ void m11478P1(int i, Intent intent, Relationship relationship) {
        act().setResult(i, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ void m11479Q1(Intent intent, int i, Relationship relationship) {
        intent.putExtra("relationship_result", relationship.state.toString());
        act().setResult(i, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: R1 */
    public final /* synthetic */ void m11480R1(Intent intent, int i, Relationship relationship) {
        intent.putExtra("relationship_result", relationship.state.toString());
        act().setResult(i, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ Boolean m11482T1(final String str, final String str2, Boolean bool, Boolean bool2) {
        if (!bool2.booleanValue() || ((Boolean) CoreModule.c.m0.u0.get()).booleanValue() || !NullChecker.a(CoreModule.c.o3()) || n3b0.m18489t() || !TextUtils.isEmpty(str)) {
            return Boolean.FALSE;
        }
        hpd0 hpd0Var = CoreModule.c.m0.u0;
        Boolean bool3 = Boolean.TRUE;
        hpd0Var.put(bool3);
        ok3.G(act(), true, this.f8983g.name, CoreModule.c.o3().superLikeLimit.remainToday() + "", TEnum.equals(this.f8983g.gender, "male"), new Runnable() { // from class: l.vx90
            @Override // java.lang.Runnable
            public final void run() {
                this.f21369a.m11481S1(str, str2);
            }
        }, new Runnable() { // from class: l.wx90
            @Override // java.lang.Runnable
            public final void run() {
                cy90.m11431Y0();
            }
        });
        return bool3;
    }

    /* JADX INFO: renamed from: U1 */
    public final /* synthetic */ void m11483U1(boolean z, boolean z2, Relationship relationship) {
        if (z) {
            vi90 vi90Var = this.f8979c;
            vi90Var.f21148l = false;
            vi90Var.f21149m = true;
        } else {
            if (CoreModule.N().so() && (this.f8979c.m23989k() || this.f8979c.m23990m() || this.f8979c.m23987i())) {
                osi0.g("喜欢已发送");
            }
            this.f8979c.f21147k = false;
        }
        if (z2) {
            m11502m1();
        }
    }

    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m11484V1(boolean z, Throwable th) {
        vi90 vi90Var = this.f8979c;
        if (z) {
            vi90Var.f21148l = false;
        } else {
            vi90Var.f21147k = false;
        }
    }

    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m11485W1(boolean z) {
        vi90 vi90Var = this.f8979c;
        if (z) {
            vi90Var.f21148l = true;
        } else {
            vi90Var.f21147k = true;
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ void m11486Y1(j760 j760Var) {
        this.f8979c.f21137a = (User) j760Var.a;
        m11523x2(3);
    }

    /* JADX INFO: renamed from: Z */
    public void m11487Z() {
        super.Z();
        this.f8981e = new ProfileShareHelper(this.f8979c);
        if (this.f8979c.m23963K()) {
            CoreModule.c.B0.p4(CoreModule.H().userId());
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ Boolean m11488Z1(String str) {
        return Boolean.valueOf(this.f8979c.m23986h());
    }

    /* JADX INFO: renamed from: a0 */
    public void m11489a0() {
        super.a0();
        if (this.f8979c.m23964L()) {
            m11522x1();
        } else {
            m11525z1();
            p420.t(act());
            m11519v1();
            m11466B1();
        }
        m11461u1();
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m11490a2(String str) {
        if (TextUtils.equals(str, this.f8979c.f21140d)) {
            m11523x2(1);
        }
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m11491b2(Boolean bool) {
        m11523x2(2);
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m11492c2(c cVar) {
        if (cVar == c.i && this.f8979c.f21137a == null) {
            ((ly90) ((jq2) this).viewModel).m17531O();
        }
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m11493d2(Boolean bool) {
        ((ly90) ((jq2) this).viewModel).f15125e.B = new j760(this.f8979c.f21140d, bool);
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ rx.c m11494e2() {
        return mkd0.s(this.f8979c.m23963K() ? CoreModule.c.B0.j4().distinctUntilChanged() : rx.c.just((Object) null), CoreModule.c.e0.Ka(this.f8979c.f21140d), CoreModule.c.e0.o9(), new f5a0());
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m11495f2(xaj0 xaj0Var) {
        this.f8979c.m23976X((User) xaj0Var.b);
        m11465A2((User) xaj0Var.c);
        m11526z2();
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m11496g2(Bundle bundle) {
        m11465A2(this.f8979c.f21141e.f21162k);
        vi90 vi90Var = this.f8979c;
        vi90Var.m23976X(vi90Var.f21141e.f21162k);
        this.f8977a.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ Boolean m11497h2(PicVerification picVerification) {
        return Boolean.valueOf(!this.f8979c.f21141e.f21162k.verifications.equals(picVerification));
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m11498i2(PicVerification picVerification) {
        this.f8979c.f21141e.f21162k.verifications = picVerification;
        this.f8977a.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: j2 */
    public final /* synthetic */ void m11499j2(User user) {
        m11465A2(user);
        this.f8979c.m23976X(user);
        this.f8977a.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m11500k2(roj0 roj0Var) {
        this.f8979c.m23976X(m11467B2());
        m11465A2(CoreModule.K().me_());
        if (this.f8979c.f21137a == null || this.f8982f == null) {
            return;
        }
        this.f8977a.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ rx.c m11501l2() {
        return mkd0.r(CoreModule.c.e0.Ka(this.f8979c.f21140d), CoreModule.c.e0.o9().take(1), new g5a0());
    }

    /* JADX INFO: renamed from: m1 */
    public void m11502m1() {
        LiveService liveService;
        act().finish();
        if (!rlt.c(this.f8979c.f21138b) || this.f8980d.f1714F || (liveService = qib0.b0.c) == null) {
            return;
        }
        liveService.Tc(act(), this.f8979c.f21140d, true);
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m11503m2(j760 j760Var) {
        this.f8979c.m23976X((User) j760Var.a);
        m11465A2((User) j760Var.b);
        this.f8977a.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: n1 */
    public void m11504n1(final int i) {
        m11521w2(i);
        m11510q1(i);
        if (this.f8979c.f21137a == null) {
            act().finish();
            return;
        }
        final Intent intent = new Intent();
        intent.putExtra("currentImageIndex", ((ly90) ((jq2) this).viewModel).m17536m());
        int iM17536m = ((ly90) ((jq2) this).viewModel).m17536m();
        int size = this.f8979c.f21137a.pictures.size();
        vi90 vi90Var = this.f8979c;
        if (iM17536m < size) {
            intent.putExtra("currentImageUrl", ((Media) vi90Var.f21137a.pictures.get(((ly90) ((jq2) this).viewModel).m17536m())).url);
        } else {
            intent.putExtra("currentImageUrl", vi90Var.f21137a.hasPic() ? ((Media) this.f8979c.f21137a.fp()).url : "");
            CrashHelper.c(new Exception("ProfileListFrag user pictures get index crash"));
        }
        intent.putExtra("currentUserId", this.f8979c.f21140d);
        boolean zM23957E = this.f8979c.m23957E();
        vi90 vi90Var2 = this.f8979c;
        if (zM23957E) {
            if (NullChecker.a(vi90Var2.f21137a)) {
                qer.n(act(), this.f8979c.f21137a, i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue(), i == SwipeDirection.UP.getValue(), false, "home", (x9j) null, new e30() { // from class: l.ax90
                    public final void call(Object obj) {
                        this.f7914a.m11469D1(i, intent, (Relationship) obj);
                    }
                }, new e30() { // from class: l.ex90
                    public final void call(Object obj) {
                        this.f10039a.m11470E1(i, intent, (Throwable) obj);
                    }
                }, pageId(), (LikeExtraData) null, (String) null, (String) null);
                return;
            }
            return;
        }
        boolean zM23997t = vi90Var2.m23997t();
        vi90 vi90Var3 = this.f8979c;
        if (zM23997t) {
            if (NullChecker.a(vi90Var3.f21137a)) {
                qer.n(act(), this.f8979c.f21137a, i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue(), i == SwipeDirection.UP.getValue(), false, this.f8979c.f21138b, (x9j) null, new e30() { // from class: l.fx90
                    public final void call(Object obj) {
                        this.f10677a.m11471F1(i, intent, (Relationship) obj);
                    }
                }, new e30() { // from class: l.gx90
                    public final void call(Object obj) {
                        this.f11671a.m11472H1(i, intent, (Throwable) obj);
                    }
                }, pageId(), (LikeExtraData) null, (String) null, (String) null);
                return;
            }
            return;
        }
        boolean zM23985g = vi90Var3.m23985g();
        vi90 vi90Var4 = this.f8979c;
        if (zM23985g) {
            if (NullChecker.a(vi90Var4.f21137a)) {
                qer.r(act(), this.f8979c.f21137a, i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue(), i == SwipeDirection.UP.getValue(), pageId(), new f30() { // from class: l.hx90
                    public final void call(Object obj, Object obj2) {
                        this.f12335a.m11475L1((User) obj, (Relationship) obj2);
                    }
                });
                return;
            }
            return;
        }
        boolean zM23991n = vi90Var4.m23991n();
        vi90 vi90Var5 = this.f8979c;
        if (zM23991n) {
            if (NullChecker.a(vi90Var5.f21137a)) {
                qer.n(act(), this.f8979c.f21137a, i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue(), i == SwipeDirection.UP.getValue(), false, "from_find_partner", (x9j) null, new e30() { // from class: l.jx90
                    public final void call(Object obj) {
                        this.f14120a.m11476N1(i, intent, (Relationship) obj);
                    }
                }, new e30() { // from class: l.kx90
                    public final void call(Object obj) {
                        this.f14574a.m11477O1(i, intent, (Throwable) obj);
                    }
                }, pageId(), (LikeExtraData) null, (String) null, (String) null);
                return;
            }
            return;
        }
        if (vi90Var5.m23956D()) {
            b1c.j(act(), this.f8979c.f21137a, i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue(), i == SwipeDirection.UP.getValue(), pageId(), new e30() { // from class: l.lx90
                public final void call(Object obj) {
                    this.f15109a.m11478P1(i, intent, (Relationship) obj);
                }
            }, new d30() { // from class: l.mx90
                public final void call() {
                    cy90.m11418J0();
                }
            });
            return;
        }
        if (!this.f8979c.m23955C()) {
            if (this.f8979c.m23988j()) {
                xs90.m26093f(act(), this.f8979c.f21137a, "", i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue(), i == SwipeDirection.UP.getValue(), pageId(), new e30() { // from class: l.cx90
                    public final void call(Object obj) {
                        this.f8971a.m11480R1(intent, i, (Relationship) obj);
                    }
                }, new d30() { // from class: l.dx90
                    public final void call() {
                        cy90.m11455p0();
                    }
                });
                return;
            } else {
                act().setResult(i, intent);
                act().finish();
                return;
            }
        }
        if (!xma.L3()) {
            CoreModule.P().a().pr(act(), "profile_like_profile", Privilege.see_who_likes_me);
            return;
        }
        Act act = act();
        vi90 vi90Var6 = this.f8979c;
        boolean z = true;
        User user = vi90Var6.f21137a;
        String str = vi90Var6.f21141e.f21159h;
        if (i != SwipeDirection.RIGHT.getValue() && i != SwipeDirection.UP.getValue()) {
            z = false;
        }
        if (i != SwipeDirection.UP.getValue()) {
            z = false;
        }
        xs90.m26093f(act, user, str, z, z, pageId(), new e30() { // from class: l.nx90
            public final void call(Object obj) {
                this.f16290a.m11479Q1(intent, i, (Relationship) obj);
            }
        }, new d30() { // from class: l.bx90
            public final void call() {
                cy90.m11414F0();
            }
        });
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ Boolean m11505n2(j760 j760Var) {
        return Boolean.valueOf(NullChecker.a(j760Var) && TextUtils.equals((CharSequence) j760Var.a, this.f8979c.f21140d));
    }

    @MainThread
    /* JADX INFO: renamed from: o1 */
    public final void m11506o1() {
        if (this.f8980d.f1715G) {
            du2.a("[core][profile]", "afterGetUserInfo return by Page Animation");
            this.f8980d.f1716H = true;
            return;
        }
        du2.a("[core][profile]", "afterGetUserInfo refresh list");
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.AFTER_GET_USER_INFO;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        m11523x2(0);
        ((ly90) ((jq2) this).viewModel).m17529M();
        ((ly90) ((jq2) this).viewModel).m17525I();
        ((ly90) ((jq2) this).viewModel).m17524H();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m11507o2(RelationshipStatus relationshipStatus) {
        m11523x2(3);
    }

    /* JADX INFO: renamed from: p1 */
    public x9j<Boolean, Boolean, Boolean> m11508p1(final String str, final String str2) {
        return new x9j() { // from class: l.rx90
            public final Object call(Object obj, Object obj2) {
                return this.f18713a.m11482T1(str, str2, (Boolean) obj, (Boolean) obj2);
            }
        };
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m11509p2(BubbleInfo bubbleInfo) {
        this.f8979c.f21142f = bubbleInfo;
        ((ly90) ((jq2) this).viewModel).m17526J();
    }

    public String pageId() {
        if ("my_tab_profile_like".equals(this.f8979c.f21138b)) {
            return "p_my_profile_comment";
        }
        if ("from_guess_liker_result".equals(this.f8979c.f21138b)) {
            return "p_guess_who_likes_me_profile";
        }
        if ("from_christmas".equals(this.f8979c.f21138b)) {
            return "p_christmas_profile";
        }
        return (TextUtils.isEmpty(this.f8979c.f21140d) || !this.f8979c.m23969Q()) ? "p_suggest_user_profile_info_view" : "p_unmatch_profile";
    }

    /* JADX INFO: renamed from: q1 */
    public final void m11510q1(int i) {
        if (i == SwipeDirection.LEFT.getValue() && xp5.o(this.f8979c.m23980b(), this.f8979c.f21137a)) {
            CoreModule.c.f0.wo(this.f8979c.f21140d, false).subscribe(mkd0.H(new e30() { // from class: l.ox90
                public final void call(Object obj) {
                    cy90.m11453n0((roj0) obj);
                }
            }, new e30() { // from class: l.px90
                public final void call(Object obj) {
                    cy90.m11423Q0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m11511q2(roj0 roj0Var) {
        m11526z2();
    }

    /* JADX INFO: renamed from: r1 */
    public void m11512r1(final boolean z) {
        if (this.f8983g == null) {
            this.f8983g = this.f8979c.m23978Z();
        }
        if (NullChecker.a(this.f8983g)) {
            LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
            int iM17536m = ((ly90) ((jq2) this).viewModel).m17536m();
            SwipeExtraScData swipeExtraScData = likeExtraDataNew_.swipeExtraScData;
            swipeExtraScData.picNum = iM17536m;
            swipeExtraScData.picUploads = this.f8983g.pictures.size();
            if (NullChecker.a(this.f8979c.f21137a) && this.f8979c.f21137a.pictures.size() != this.f8983g.pictures.size()) {
                CrashHelper.c(new IllegalStateException(" profilelist picture size diff , user  " + ((DbObject) this.f8979c.f21137a).id + " " + this.f8979c.f21137a.pictures.size() + " withRelation " + ((DbObject) this.f8983g).id + " " + this.f8983g.pictures.size()));
            }
            int size = this.f8983g.pictures.size();
            SwipeExtraScData swipeExtraScData2 = likeExtraDataNew_.swipeExtraScData;
            if (iM17536m >= size) {
                swipeExtraScData2.picUrl = "";
            } else {
                swipeExtraScData2.picUrl = ((Media) this.f8983g.pictures.get(iM17536m)).url;
            }
            final boolean zM23972T = this.f8979c.m23972T();
            if (qer.o(act(), this.f8983g, true, z, false, z ? "p_profile,superlike" : "p_home,likelimit", m11508p1("", ""), new e30() { // from class: l.ww90
                public final void call(Object obj) {
                    this.f22017a.m11483U1(z, zM23972T, (Relationship) obj);
                }
            }, new e30() { // from class: l.yw90
                public final void call(Object obj) {
                    this.f23130a.m11484V1(z, (Throwable) obj);
                }
            }, pageId(), likeExtraDataNew_, "", "", new d30() { // from class: l.zw90
                public final void call() {
                    this.f23654a.m11485W1(z);
                }
            })) {
                vi90 vi90Var = this.f8979c;
                if (z) {
                    vi90Var.f21148l = true;
                } else {
                    vi90Var.f21147k = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ rx.c m11513r2(roj0 roj0Var) {
        if (m11467B2().isMe()) {
            CoreModule.N().personalMediaMomentsFeedPrevious(((DbObject) m11467B2()).id, false, CoreMomentInfo.JSON_ADAPTER);
            return CoreModule.N().di(CoreMomentInfo.JSON_ADAPTER);
        }
        User userById = CoreModule.K().getUserById(this.f8979c.f21140d);
        if (NullChecker.a(userById) && !userById.unilateralBlock()) {
            duringCreated(CoreModule.N().coreMomentPrevious(this.f8979c.f21140d)).subscribe(mkd0.G(new e30() { // from class: l.uw90
                public final void call(Object obj) {
                    this.f20854a.m11511q2((roj0) obj);
                }
            }));
        }
        return CoreModule.N().cq(this.f8979c.f21140d, false, CoreMomentInfo.JSON_ADAPTER, "profile").map(new w9j() { // from class: l.vw90
            public final Object call(Object obj) {
                return cy90.m11416H0((j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] */
    public void m11481S1(String str, String str2) {
        m11512r1(true);
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m11515s2(List list) {
        m11526z2();
    }

    /* JADX INFO: renamed from: t1 */
    public ProfileShareHelper m11516t1() {
        return this.f8981e;
    }

    /* JADX INFO: renamed from: t2 */
    public final /* synthetic */ void m11517t2(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isBlocked() && NullChecker.a(CoreModule.K().getUserById(this.f8979c.f21140d)) && !CoreModule.K().getUserById(this.f8979c.f21140d).unilateralBlock()) {
            CoreModule.c.e0.Ba(this.f8979c.f21140d);
        }
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ void m11518u2(List list) {
        this.f8979c.f21151o = list;
        m11523x2(0);
    }

    /* JADX INFO: renamed from: v1 */
    public final void m11519v1() {
        if (this.f8979c.m23963K()) {
            duringCreated(new v9j() { // from class: l.nw90
                public final Object call() {
                    return this.f16282a.m11494e2();
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.ow90
                public final void call(Object obj) {
                    this.f16812a.m11495f2((xaj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: v2 */
    public User m11520v2() {
        if (this.f8982f == null) {
            m11465A2(CoreModule.K().me_());
        }
        return this.f8982f;
    }

    /* JADX INFO: renamed from: w2 */
    public final void m11521w2(int i) {
        if (i == SwipeDirection.LEFT.getValue() && this.f8979c.m24001x()) {
            cj90.b(this.f8979c.f21140d);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m11522x1() {
        creates(new e30() { // from class: l.pw90
            public final void call(Object obj) {
                this.f17708a.m11496g2((Bundle) obj);
            }
        });
        duringCreated(CoreModule.c.e0.Ka(this.f8979c.f21140d)).map(new w9j() { // from class: l.qw90
            public final Object call(Object obj) {
                return ((User) obj).verifications;
            }
        }).distinctUntilChanged().filter(new w9j() { // from class: l.rw90
            public final Object call(Object obj) {
                return this.f18702a.m11497h2((PicVerification) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.sw90
            public final void call(Object obj) {
                this.f19310a.m11498i2((PicVerification) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x2 */
    public final void m11523x2(int i) {
        if (this.f8979c.m23963K() || !NullChecker.a(this.f8979c.f21137a)) {
            return;
        }
        s7m s7mVar = ((jq2) this).viewModel;
        if (i != 3) {
            ((ly90) s7mVar).m17532P(i);
            return;
        }
        if ((((ly90) s7mVar).f15132l != null ? ((ly90) s7mVar).f15132l.m14368d().m2923a() : null) != ((ly90) ((jq2) this).viewModel).m17532P(i)) {
            m11506o1();
        }
    }

    /* JADX INFO: renamed from: y2 */
    public void m11524y2() {
        if (this.f8979c.m23957E()) {
            zvf0.r("e_push_profile_quit", "p_push_profile");
        }
        m11502m1();
    }

    /* JADX INFO: renamed from: z1 */
    public final void m11525z1() {
        duringCreated(CoreModule.c.e0.Y9(this.f8979c.f21140d, false, true).switchMap(new w9j() { // from class: l.bw90
            public final Object call(Object obj) {
                return this.f8387a.m11513r2((roj0) obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.ix90
            public final void call(Object obj) {
                this.f13464a.m11515s2((List) obj);
            }
        }, new e30() { // from class: l.tx90
            public final void call(Object obj) {
                this.f20417a.m11517t2((Throwable) obj);
            }
        }));
        if (this.f8979c.m23963K()) {
            duringCreated(CoreModule.c.e0.o9()).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.xx90
                public final void call(Object obj) {
                    this.f22497a.m11499j2((User) obj);
                }
            }));
            return;
        }
        if (f9j.a(this.f8979c.f21138b)) {
            duringCreated(rx.c.just(roj0.a)).subscribe(mkd0.G(new e30() { // from class: l.yx90
                public final void call(Object obj) {
                    this.f23138a.m11500k2((roj0) obj);
                }
            }));
        }
        duringCreated(new v9j() { // from class: l.zx90
            public final Object call() {
                return this.f23660a.m11501l2();
            }
        }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.ay90
            public final void call(Object obj) {
                this.f7923a.m11503m2((j760) obj);
            }
        }));
        duringCreated(CoreModule.c.r0.v5()).filter(new w9j() { // from class: l.by90
            public final Object call(Object obj) {
                return this.f8422a.m11505n2((j760) obj);
            }
        }).map(new w9j() { // from class: l.cw90
            public final Object call(Object obj) {
                return cy90.m11435d1((j760) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.dw90
            public final void call(Object obj) {
                this.f9460a.m11507o2((RelationshipStatus) obj);
            }
        }));
        duringCreated(CoreModule.N().vm(this.f8979c.f21140d)).take(1).subscribe(mkd0.H(new e30() { // from class: l.mw90
            public final void call(Object obj) {
                this.f15723a.m11509p2((BubbleInfo) obj);
            }
        }, new e30() { // from class: l.xw90
            public final void call(Object obj) {
                cy90.m11419L0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z2 */
    public void m11526z2() {
        if (this.f8982f == null || this.f8979c.f21137a == null) {
            return;
        }
        this.f8977a.onNext(roj0.a);
    }

    public void destroy() {
    }
}
