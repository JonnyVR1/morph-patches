package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.performance.PerformanceLogUtil;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.performance.ProfileLogEntity;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListFragExpandedImpl;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileShareHelper;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.LikeExtraData;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.PicVerification;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.SwipeExtraScData;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes4.dex */
public class g6a0 extends ar2<p6a0> {

    /* JADX INFO: renamed from: a */
    public final C22507a<uxj0> f102407a;

    /* JADX INFO: renamed from: b */
    public final C22507a<uxj0> f102408b;

    /* JADX INFO: renamed from: c */
    public final zq90 f102409c;

    /* JADX INFO: renamed from: d */
    public final ProfileListFragExpandedImpl f102410d;

    /* JADX INFO: renamed from: e */
    public ProfileShareHelper f102411e;

    /* JADX INFO: renamed from: f */
    public User f102412f;

    /* JADX INFO: renamed from: g */
    public User f102413g;

    public g6a0(ner nerVar, zq90 zq90Var) {
        super(nerVar);
        this.f102407a = C22507a.m222758b();
        this.f102408b = C22507a.m222758b();
        this.f102410d = (ProfileListFragExpandedImpl) nerVar;
        this.f102409c = zq90Var;
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ void m129102F0() {
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ List m129104H0(pf60 pf60Var) {
        return (List) pf60Var.f152157b;
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ void m129106J0() {
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m129107L0(Throwable th) {
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m129111Q0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X1 */
    public /* synthetic */ void m129118X1(uxj0 uxj0Var) {
        m129192o1();
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ void m129119Y0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ RelationshipStatus m129123d1(pf60 pf60Var) {
        return (RelationshipStatus) pf60Var.f152157b;
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m129141n0(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m129143p0() {
    }

    /* JADX INFO: renamed from: u1 */
    private void m129149u1() {
        duringCreated(this.f102407a).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.i4a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112863a.m129118X1((uxj0) obj);
            }
        }, new zh0()));
        duringCreated(CoreModule.m30932N().getMomentLikeChangedSub()).subscribe(psd0.m173596G(new y20() { // from class: l.j4a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118280a.m129174Y1((pf60) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20420r0.f20780s0).filter(new qcj() { // from class: l.k4a0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f123872a.m129175Z1((String) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.l4a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129952a.m129176a2((String) obj);
            }
        }));
        if ((zbj.m219194a(this.f102409c.f205577b) || m129156C1() || "liked_users_anchor".equals(this.f102409c.f205577b) || this.f102409c.m220955H() || "from_greet_act".equals(this.f102409c.f205577b)) && !this.f102409c.m220958K()) {
            duringCreated((C22421c) CoreModule.f18264c.f20384f0.m33823Ue(this.f102409c.f205579d).map(new qcj() { // from class: l.m4a0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Conversation conversation = (Conversation) obj;
                    return Boolean.valueOf(conversation != null && conversation.needCheckValidStatus());
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.n4a0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f140213a.m129177b2((Boolean) obj);
                }
            }));
        }
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.o4a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144954a.m129178c2((C4470c) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20378d0.m151460j3()).subscribe(psd0.m173591B());
        duringCreated(CoreModule.m30934Q().mo68440ao(this.f102409c.f205579d)).subscribe(psd0.m173596G(new y20() { // from class: l.p4a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150521a.m129179d2((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A2 */
    public final void m129153A2(User user) {
        this.f102412f = user;
    }

    /* JADX INFO: renamed from: B1 */
    public final void m129154B1() {
        if (this.f102409c.m220968U()) {
            duringCreated(CoreModule.f18264c.f20381e0.m116484L7(this.f102409c.f205579d)).subscribe(psd0.m173596G(new y20() { // from class: l.x4a0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f192359a.m129204u2((List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: B2 */
    public User m129155B2() {
        zq90 zq90Var = this.f102409c;
        if (zq90Var.f205576a == null && !zq90Var.m220959L()) {
            this.f102409c.m220971X(CoreModule.m30930K().getUserById(this.f102409c.f205579d));
        }
        return this.f102409c.f205576a;
    }

    /* JADX INFO: renamed from: C1 */
    public final boolean m129156C1() {
        if ("from_portrait_like_list".equals(this.f102409c.f205577b) || TextUtils.equals(this.f102409c.f205577b, "from_mew_tags") || this.f102409c.m220984k() || this.f102409c.m220985m() || this.f102409c.m220982i() || TextUtils.equals(this.f102409c.f205577b, "from_literature_third")) {
            return true;
        }
        if (gra.m131637V1()) {
            return "chat_group".equals(this.f102409c.f205577b) || "chat_group_anonymity".equals(this.f102409c.f205577b) || "group_notification".equals(this.f102409c.f205577b) || "group_notification_anonymity".equals(this.f102409c.f205577b);
        }
        return false;
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m129157D1(int i, Intent intent, Relationship relationship) {
        act().setResult(i, intent);
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m129158E1(int i, Intent intent, Throwable th) {
        act().setResult(i, intent);
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m129159F1(int i, Intent intent, Relationship relationship) {
        if (!TEnum.equals(relationship.state, "liked") && !TEnum.equals(relationship.state, "matched") && !TEnum.equals(relationship.state, "superliked")) {
            act().setResult(i, intent);
            act().lambda$debugItems$19();
        } else {
            if (TEnum.equals(relationship.state, "superliked") || relationship.status.contains(MatchFrom.get(MatchFrom.superLiked)) || i == SwipeDirection.UP.getValue()) {
                return;
            }
            o1j0.m165651y("喜欢已发送");
        }
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m129160H1(int i, Intent intent, Throwable th) {
        act().setResult(i, intent);
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m129161I1() {
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m129162J1(final User user, Relationship relationship) {
        User userM116506Q9 = CoreModule.f18264c.f20381e0.m116506Q9(user.f56859id);
        if (userM116506Q9 != null) {
            user = userM116506Q9;
        }
        if (NullChecker.m82486a(relationship) && !relationship.equals(user.localRelationship)) {
            user.localRelationship = relationship;
            CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.w5a0
                @Override // p153l.x20
                public final void call() {
                    uqb0.f180405k0.f184355d.upsert(user);
                }
            });
        }
        l51.m152888H(act(), new Runnable() { // from class: l.y5a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f197550a.m129161I1();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m129163L1(final User user, final Relationship relationship) {
        l51.m152919y(new Runnable() { // from class: l.u5a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f177591a.m129162J1(user, relationship);
            }
        });
    }

    /* JADX INFO: renamed from: N1 */
    public final /* synthetic */ void m129164N1(int i, Intent intent, Relationship relationship) {
        if (i != SwipeDirection.LEFT.getValue()) {
            o1j0.m165651y(String.format("喜欢已发送，%s将收到你的喜欢", this.f102409c.f205576a.isFemale() ? "她" : "他"));
        }
        act().setResult(i, intent);
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: O1 */
    public final /* synthetic */ void m129165O1(int i, Intent intent, Throwable th) {
        act().setResult(i, intent);
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: P1 */
    public final /* synthetic */ void m129166P1(int i, Intent intent, Relationship relationship) {
        act().setResult(i, intent);
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ void m129167Q1(Intent intent, int i, Relationship relationship) {
        intent.putExtra("relationship_result", relationship.state.toString());
        act().setResult(i, intent);
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: R1 */
    public final /* synthetic */ void m129168R1(Intent intent, int i, Relationship relationship) {
        intent.putExtra("relationship_result", relationship.state.toString());
        act().setResult(i, intent);
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ Boolean m129170T1(final String str, final String str2, Boolean bool, Boolean bool2) {
        if (!bool2.booleanValue() || CoreModule.f18264c.f20405m0.f20196u0.get().booleanValue() || !NullChecker.m82486a(CoreModule.f18264c.m32487o3()) || rbb0.m180747t() || !TextUtils.isEmpty(str)) {
            return Boolean.FALSE;
        }
        jxd0 jxd0Var = CoreModule.f18264c.f20405m0.f20196u0;
        Boolean bool3 = Boolean.TRUE;
        jxd0Var.put(bool3);
        hl3.m135664G(act(), true, this.f102413g.name, CoreModule.f18264c.m32487o3().superLikeLimit.remainToday() + "", TEnum.equals(this.f102413g.gender, "male"), new Runnable() { // from class: l.z5a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f203017a.m129169S1(str, str2);
            }
        }, new Runnable() { // from class: l.a6a0
            @Override // java.lang.Runnable
            public final void run() {
                g6a0.m129119Y0();
            }
        });
        return bool3;
    }

    /* JADX INFO: renamed from: U1 */
    public final /* synthetic */ void m129171U1(boolean z, boolean z2, Relationship relationship) {
        if (z) {
            zq90 zq90Var = this.f102409c;
            zq90Var.f205587l = false;
            zq90Var.f205588m = true;
        } else {
            if (CoreModule.m30932N().mo61573so() && (this.f102409c.m220984k() || this.f102409c.m220985m() || this.f102409c.m220982i())) {
                r1j0.m179420g("喜欢已发送");
            }
            this.f102409c.f205586k = false;
        }
        if (z2) {
            m129188m1();
        }
    }

    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m129172V1(boolean z, Throwable th) {
        zq90 zq90Var = this.f102409c;
        if (z) {
            zq90Var.f205587l = false;
        } else {
            zq90Var.f205586k = false;
        }
    }

    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m129173W1(boolean z) {
        zq90 zq90Var = this.f102409c;
        if (z) {
            zq90Var.f205587l = true;
        } else {
            zq90Var.f205586k = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ void m129174Y1(pf60 pf60Var) {
        this.f102409c.f205576a = (User) pf60Var.f152156a;
        m129209x2(3);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f102411e = new ProfileShareHelper(this.f102409c);
        if (this.f102409c.m220958K()) {
            CoreModule.f18264c.f20294B0.m32620p4(CoreModule.m30929H().userId());
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ Boolean m129175Z1(String str) {
        return Boolean.valueOf(this.f102409c.m220981h());
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        if (this.f102409c.m220959L()) {
            m129208x1();
        } else {
            m129211z1();
            xc20.m210108t(act());
            m129205v1();
            m129154B1();
        }
        m129149u1();
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m129176a2(String str) {
        if (TextUtils.equals(str, this.f102409c.f205579d)) {
            m129209x2(1);
        }
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m129177b2(Boolean bool) {
        m129209x2(2);
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m129178c2(C4470c c4470c) {
        if (c4470c == C4470c.f16267i && this.f102409c.f205576a == null) {
            ((p6a0) this.viewModel).m170757O();
        }
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m129179d2(Boolean bool) {
        ((p6a0) this.viewModel).f150758e.f23004B = new pf60<>(this.f102409c.f205579d, bool);
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ C22421c m129180e2() {
        return psd0.m173626s(this.f102409c.m220958K() ? CoreModule.f18264c.f20294B0.m32614j4().distinctUntilChanged() : C22421c.just(null), CoreModule.f18264c.f20381e0.m116483Ka(this.f102409c.f205579d), CoreModule.f18264c.f20381e0.m116596o9(), new jda0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m129181f2(bkj0 bkj0Var) {
        this.f102409c.m220971X((User) bkj0Var.f77082b);
        m129153A2((User) bkj0Var.f77083c);
        m129212z2();
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m129182g2(Bundle bundle) {
        m129153A2(this.f102409c.f205580e.f205601k);
        zq90 zq90Var = this.f102409c;
        zq90Var.m220971X(zq90Var.f205580e.f205601k);
        this.f102407a.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ Boolean m129183h2(PicVerification picVerification) {
        return Boolean.valueOf(!this.f102409c.f205580e.f205601k.verifications.equals(picVerification));
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m129184i2(PicVerification picVerification) {
        this.f102409c.f205580e.f205601k.verifications = picVerification;
        this.f102407a.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: j2 */
    public final /* synthetic */ void m129185j2(User user) {
        m129153A2(user);
        this.f102409c.m220971X(user);
        this.f102407a.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m129186k2(uxj0 uxj0Var) {
        this.f102409c.m220971X(m129155B2());
        m129153A2(CoreModule.m30930K().me_());
        if (this.f102409c.f205576a == null || this.f102412f == null) {
            return;
        }
        this.f102407a.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ C22421c m129187l2() {
        return psd0.m173625r(CoreModule.f18264c.f20381e0.m116483Ka(this.f102409c.f205579d), CoreModule.f18264c.f20381e0.m116596o9().take(1), new kda0());
    }

    /* JADX INFO: renamed from: m1 */
    public void m129188m1() {
        LiveService liveService;
        act().lambda$debugItems$19();
        if (!tnt.m191966c(this.f102409c.f205577b) || this.f102410d.f34740F || (liveService = uqb0.f180396b0.f170326c) == null) {
            return;
        }
        liveService.mo68427Tc(act(), this.f102409c.f205579d, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m129189m2(pf60 pf60Var) {
        this.f102409c.m220971X((User) pf60Var.f152156a);
        m129153A2((User) pf60Var.f152157b);
        this.f102407a.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: n1 */
    public void m129190n1(final int i) {
        m129207w2(i);
        m129196q1(i);
        if (this.f102409c.f205576a == null) {
            act().lambda$debugItems$19();
            return;
        }
        final Intent intent = new Intent();
        intent.putExtra("currentImageIndex", ((p6a0) this.viewModel).m170761m());
        int iM170761m = ((p6a0) this.viewModel).m170761m();
        int size = this.f102409c.f205576a.pictures.size();
        zq90 zq90Var = this.f102409c;
        if (iM170761m < size) {
            intent.putExtra("currentImageUrl", zq90Var.f205576a.pictures.get(((p6a0) this.viewModel).m170761m()).url);
        } else {
            intent.putExtra("currentImageUrl", zq90Var.f205576a.hasPic() ? this.f102409c.f205576a.m61308fp().url : "");
            CrashHelper.m82479c(new Exception("ProfileListFrag user pictures get index crash"));
        }
        intent.putExtra("currentUserId", this.f102409c.f205579d);
        boolean zM220952E = this.f102409c.m220952E();
        zq90 zq90Var2 = this.f102409c;
        if (zM220952E) {
            if (NullChecker.m82486a(zq90Var2.f205576a)) {
                rgr.m181477n(act(), this.f102409c.f205576a, i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue(), i == SwipeDirection.UP.getValue(), false, "home", null, new y20() { // from class: l.e5a0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f92202a.m129157D1(i, intent, (Relationship) obj);
                    }
                }, new y20() { // from class: l.i5a0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f113022a.m129158E1(i, intent, (Throwable) obj);
                    }
                }, pageId(), null, null, null);
                return;
            }
            return;
        }
        boolean zM220992t = zq90Var2.m220992t();
        zq90 zq90Var3 = this.f102409c;
        if (zM220992t) {
            if (NullChecker.m82486a(zq90Var3.f205576a)) {
                rgr.m181477n(act(), this.f102409c.f205576a, i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue(), i == SwipeDirection.UP.getValue(), false, this.f102409c.f205577b, null, new y20() { // from class: l.j5a0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f118409a.m129159F1(i, intent, (Relationship) obj);
                    }
                }, new y20() { // from class: l.k5a0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f123992a.m129160H1(i, intent, (Throwable) obj);
                    }
                }, pageId(), null, null, null);
                return;
            }
            return;
        }
        boolean zM220980g = zq90Var3.m220980g();
        zq90 zq90Var4 = this.f102409c;
        if (zM220980g) {
            if (NullChecker.m82486a(zq90Var4.f205576a)) {
                rgr.m181481r(act(), this.f102409c.f205576a, i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue(), i == SwipeDirection.UP.getValue(), pageId(), new z20() { // from class: l.l5a0
                    @Override // p153l.z20
                    public final void call(Object obj, Object obj2) {
                        this.f130087a.m129163L1((User) obj, (Relationship) obj2);
                    }
                });
                return;
            }
            return;
        }
        boolean zM220986n = zq90Var4.m220986n();
        zq90 zq90Var5 = this.f102409c;
        if (zM220986n) {
            if (NullChecker.m82486a(zq90Var5.f205576a)) {
                rgr.m181477n(act(), this.f102409c.f205576a, i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue(), i == SwipeDirection.UP.getValue(), false, "from_find_partner", null, new y20() { // from class: l.n5a0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f140319a.m129164N1(i, intent, (Relationship) obj);
                    }
                }, new y20() { // from class: l.o5a0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f145044a.m129165O1(i, intent, (Throwable) obj);
                    }
                }, pageId(), null, null, null);
                return;
            }
            return;
        }
        if (zq90Var5.m220951D()) {
            o2c.m165712j(act(), this.f102409c.f205576a, i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue(), i == SwipeDirection.UP.getValue(), pageId(), new y20() { // from class: l.p5a0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f150629a.m129166P1(i, intent, (Relationship) obj);
                }
            }, new x20() { // from class: l.q5a0
                @Override // p153l.x20
                public final void call() {
                    g6a0.m129106J0();
                }
            });
            return;
        }
        if (!this.f102409c.m220950C()) {
            if (this.f102409c.m220983j()) {
                b1a0.m101463f(act(), this.f102409c.f205576a, "", i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue(), i == SwipeDirection.UP.getValue(), pageId(), new y20() { // from class: l.g5a0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f102299a.m129168R1(intent, i, (Relationship) obj);
                    }
                }, new x20() { // from class: l.h5a0
                    @Override // p153l.x20
                    public final void call() {
                        g6a0.m129143p0();
                    }
                });
                return;
            } else {
                act().setResult(i, intent);
                act().lambda$debugItems$19();
                return;
            }
        }
        if (!joa.m146361M3()) {
            CoreModule.m30933P().m143405a().mo34568pr(act(), "profile_like_profile", Privilege.see_who_likes_me);
            return;
        }
        Act act = act();
        zq90 zq90Var6 = this.f102409c;
        boolean z = true;
        User user = zq90Var6.f205576a;
        String str = zq90Var6.f205580e.f205598h;
        if (i != SwipeDirection.RIGHT.getValue() && i != SwipeDirection.UP.getValue()) {
            z = false;
        }
        if (i != SwipeDirection.UP.getValue()) {
            z = false;
        }
        b1a0.m101463f(act, user, str, z, z, pageId(), new y20() { // from class: l.r5a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161331a.m129167Q1(intent, i, (Relationship) obj);
            }
        }, new x20() { // from class: l.f5a0
            @Override // p153l.x20
            public final void call() {
                g6a0.m129102F0();
            }
        });
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ Boolean m129191n2(pf60 pf60Var) {
        return Boolean.valueOf(NullChecker.m82486a(pf60Var) && TextUtils.equals((CharSequence) pf60Var.f152156a, this.f102409c.f205579d));
    }

    @MainThread
    /* JADX INFO: renamed from: o1 */
    public final void m129192o1() {
        if (this.f102410d.f34741G) {
            tu2.m192703a("[core][profile]", "afterGetUserInfo return by Page Animation");
            this.f102410d.f34742H = true;
            return;
        }
        tu2.m192703a("[core][profile]", "afterGetUserInfo refresh list");
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.AFTER_GET_USER_INFO;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        m129209x2(0);
        ((p6a0) this.viewModel).m170755M();
        ((p6a0) this.viewModel).m170751I();
        ((p6a0) this.viewModel).m170750H();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m129193o2(RelationshipStatus relationshipStatus) {
        m129209x2(3);
    }

    /* JADX INFO: renamed from: p1 */
    public rcj<Boolean, Boolean, Boolean> m129194p1(final String str, final String str2) {
        return new rcj() { // from class: l.v5a0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f182491a.m129170T1(str, str2, (Boolean) obj, (Boolean) obj2);
            }
        };
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m129195p2(BubbleInfo bubbleInfo) {
        this.f102409c.f205581f = bubbleInfo;
        ((p6a0) this.viewModel).m170752J();
    }

    public String pageId() {
        if ("my_tab_profile_like".equals(this.f102409c.f205577b)) {
            return "p_my_profile_comment";
        }
        if ("from_guess_liker_result".equals(this.f102409c.f205577b)) {
            return "p_guess_who_likes_me_profile";
        }
        if ("from_christmas".equals(this.f102409c.f205577b)) {
            return "p_christmas_profile";
        }
        return (TextUtils.isEmpty(this.f102409c.f205579d) || !this.f102409c.m220964Q()) ? OMSDialogPositon.p_suggest_user_profile_info_view : "p_unmatch_profile";
    }

    /* JADX INFO: renamed from: q1 */
    public final void m129196q1(int i) {
        if (i == SwipeDirection.LEFT.getValue() && br5.m106044o(this.f102409c.m220975b(), this.f102409c.f205576a)) {
            CoreModule.f18264c.f20384f0.m34180wo(this.f102409c.f205579d, false).subscribe(psd0.m173597H(new y20() { // from class: l.s5a0
                @Override // p153l.y20
                public final void call(Object obj) {
                    g6a0.m129141n0((uxj0) obj);
                }
            }, new y20() { // from class: l.t5a0
                @Override // p153l.y20
                public final void call(Object obj) {
                    g6a0.m129111Q0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m129197q2(uxj0 uxj0Var) {
        m129212z2();
    }

    /* JADX INFO: renamed from: r1 */
    public void m129198r1(final boolean z) {
        if (this.f102413g == null) {
            this.f102413g = this.f102409c.m220973Z();
        }
        if (NullChecker.m82486a(this.f102413g)) {
            LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
            int iM170761m = ((p6a0) this.viewModel).m170761m();
            SwipeExtraScData swipeExtraScData = likeExtraDataNew_.swipeExtraScData;
            swipeExtraScData.picNum = iM170761m;
            swipeExtraScData.picUploads = this.f102413g.pictures.size();
            if (NullChecker.m82486a(this.f102409c.f205576a) && this.f102409c.f205576a.pictures.size() != this.f102413g.pictures.size()) {
                CrashHelper.m82479c(new IllegalStateException(" profilelist picture size diff , user  " + this.f102409c.f205576a.f56859id + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f102409c.f205576a.pictures.size() + " withRelation " + this.f102413g.f56859id + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f102413g.pictures.size()));
            }
            int size = this.f102413g.pictures.size();
            SwipeExtraScData swipeExtraScData2 = likeExtraDataNew_.swipeExtraScData;
            if (iM170761m >= size) {
                swipeExtraScData2.picUrl = "";
            } else {
                swipeExtraScData2.picUrl = this.f102413g.pictures.get(iM170761m).url;
            }
            final boolean zM220967T = this.f102409c.m220967T();
            if (rgr.m181478o(act(), this.f102413g, true, z, false, z ? "p_profile,superlike" : "p_home,likelimit", m129194p1("", ""), new y20() { // from class: l.a5a0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f68525a.m129171U1(z, zM220967T, (Relationship) obj);
                }
            }, new y20() { // from class: l.c5a0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f79820a.m129172V1(z, (Throwable) obj);
                }
            }, pageId(), likeExtraDataNew_, "", "", new x20() { // from class: l.d5a0
                @Override // p153l.x20
                public final void call() {
                    this.f85143a.m129173W1(z);
                }
            })) {
                zq90 zq90Var = this.f102409c;
                if (z) {
                    zq90Var.f205587l = true;
                } else {
                    zq90Var.f205586k = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ C22421c m129199r2(uxj0 uxj0Var) {
        if (m129155B2().isMe()) {
            CoreModule.m30932N().personalMediaMomentsFeedPrevious(m129155B2().f56859id, false, CoreMomentInfo.JSON_ADAPTER);
            return CoreModule.m30932N().mo61530di(CoreMomentInfo.JSON_ADAPTER);
        }
        User userById = CoreModule.m30930K().getUserById(this.f102409c.f205579d);
        if (NullChecker.m82486a(userById) && !userById.unilateralBlock()) {
            duringCreated(CoreModule.m30932N().coreMomentPrevious(this.f102409c.f205579d)).subscribe(psd0.m173596G(new y20() { // from class: l.y4a0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f197442a.m129197q2((uxj0) obj);
                }
            }));
        }
        return CoreModule.m30932N().mo61528cq(this.f102409c.f205579d, false, CoreMomentInfo.JSON_ADAPTER, "profile").map(new qcj() { // from class: l.z4a0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return g6a0.m129104H0((pf60) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] */
    public void m129169S1(String str, String str2) {
        m129198r1(true);
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m129201s2(List list) {
        m129212z2();
    }

    /* JADX INFO: renamed from: t1 */
    public ProfileShareHelper m129202t1() {
        return this.f102411e;
    }

    /* JADX INFO: renamed from: t2 */
    public final /* synthetic */ void m129203t2(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isBlocked() && NullChecker.m82486a(CoreModule.m30930K().getUserById(this.f102409c.f205579d)) && !CoreModule.m30930K().getUserById(this.f102409c.f205579d).unilateralBlock()) {
            CoreModule.f18264c.f20381e0.m116447Ba(this.f102409c.f205579d);
        }
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ void m129204u2(List list) {
        this.f102409c.f205590o = list;
        m129209x2(0);
    }

    /* JADX INFO: renamed from: v1 */
    public final void m129205v1() {
        if (this.f102409c.m220958K()) {
            duringCreated(new pcj() { // from class: l.r4a0
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f161182a.m129180e2();
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.s4a0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f166182a.m129181f2((bkj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: v2 */
    public User m129206v2() {
        if (this.f102412f == null) {
            m129153A2(CoreModule.m30930K().me_());
        }
        return this.f102412f;
    }

    /* JADX INFO: renamed from: w2 */
    public final void m129207w2(int i) {
        if (i == SwipeDirection.LEFT.getValue() && this.f102409c.m220996x()) {
            gr90.m131536b(this.f102409c.f205579d);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m129208x1() {
        creates(new y20() { // from class: l.t4a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172059a.m129182g2((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(this.f102409c.f205579d)).map(new qcj() { // from class: l.u4a0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).verifications;
            }
        }).distinctUntilChanged().filter(new qcj() { // from class: l.v4a0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f182343a.m129183h2((PicVerification) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.w4a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187362a.m129184i2((PicVerification) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x2 */
    public final void m129209x2(int i) {
        if (this.f102409c.m220958K() || !NullChecker.m82486a(this.f102409c.f205576a)) {
            return;
        }
        V v2 = this.viewModel;
        if (i != 3) {
            ((p6a0) v2).m170758P(i);
            return;
        }
        if ((((p6a0) v2).f150765l != null ? ((p6a0) v2).f150765l.m155166d().m53572a() : null) != ((p6a0) this.viewModel).m170758P(i)) {
            m129192o1();
        }
    }

    /* JADX INFO: renamed from: y2 */
    public void m129210y2() {
        if (this.f102409c.m220952E()) {
            i4g0.m138520r("e_push_profile_quit", "p_push_profile");
        }
        m129188m1();
    }

    /* JADX INFO: renamed from: z1 */
    public final void m129211z1() {
        duringCreated((C22421c) CoreModule.f18264c.f20381e0.m116535Y9(this.f102409c.f205579d, false, true).switchMap(new qcj() { // from class: l.f4a0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f97092a.m129199r2((uxj0) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.m5a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134883a.m129201s2((List) obj);
            }
        }, new y20() { // from class: l.x5a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192468a.m129203t2((Throwable) obj);
            }
        }));
        if (this.f102409c.m220958K()) {
            duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.b6a0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f75169a.m129185j2((User) obj);
                }
            }));
            return;
        }
        if (zbj.m219194a(this.f102409c.f205577b)) {
            duringCreated(C22421c.just(uxj0.f181467a)).subscribe(psd0.m173596G(new y20() { // from class: l.c6a0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f79949a.m129186k2((uxj0) obj);
                }
            }));
        }
        duringCreated(new pcj() { // from class: l.d6a0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f85312a.m129187l2();
            }
        }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.e6a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92270a.m129189m2((pf60) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20420r0.m35153v5()).filter(new qcj() { // from class: l.f6a0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f97386a.m129191n2((pf60) obj);
            }
        }).map(new qcj() { // from class: l.g4a0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return g6a0.m129123d1((pf60) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.h4a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107774a.m129193o2((RelationshipStatus) obj);
            }
        }));
        duringCreated(CoreModule.m30932N().mo61584vm(this.f102409c.f205579d)).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.q4a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155548a.m129195p2((BubbleInfo) obj);
            }
        }, new y20() { // from class: l.b5a0
            @Override // p153l.y20
            public final void call(Object obj) {
                g6a0.m129107L0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z2 */
    public void m129212z2() {
        if (this.f102412f == null || this.f102409c.f205576a == null) {
            return;
        }
        this.f102407a.onNext(uxj0.f181467a);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
