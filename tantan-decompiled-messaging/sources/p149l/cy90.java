package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.performance.PerformanceLogUtil;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.performance.ProfileLogEntity;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListFragExpandedImpl;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileShareHelper;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.LikeExtraData;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.PicVerification;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.SwipeExtraScData;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes4.dex */
public class cy90 extends jq2<ly90> {

    /* JADX INFO: renamed from: a */
    public final C22392a<roj0> f82935a;

    /* JADX INFO: renamed from: b */
    public final C22392a<roj0> f82936b;

    /* JADX INFO: renamed from: c */
    public final vi90 f82937c;

    /* JADX INFO: renamed from: d */
    public final ProfileListFragExpandedImpl f82938d;

    /* JADX INFO: renamed from: e */
    public ProfileShareHelper f82939e;

    /* JADX INFO: renamed from: f */
    public User f82940f;

    /* JADX INFO: renamed from: g */
    public User f82941g;

    public cy90(mcr mcrVar, vi90 vi90Var) {
        super(mcrVar);
        this.f82935a = C22392a.m221512b();
        this.f82936b = C22392a.m221512b();
        this.f82938d = (ProfileListFragExpandedImpl) mcrVar;
        this.f82937c = vi90Var;
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ void m109139F0() {
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ List m109141H0(j760 j760Var) {
        return (List) j760Var.f116565b;
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ void m109143J0() {
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m109144L0(Throwable th) {
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m109148Q0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X1 */
    public /* synthetic */ void m109155X1(roj0 roj0Var) {
        m109229o1();
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ void m109156Y0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ RelationshipStatus m109160d1(j760 j760Var) {
        return (RelationshipStatus) j760Var.f116565b;
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m109178n0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m109180p0() {
    }

    /* JADX INFO: renamed from: u1 */
    private void m109186u1() {
        duringCreated(this.f82935a).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.ew90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93475a.m109155X1((roj0) obj);
            }
        }, new di0()));
        duringCreated(CoreModule.m29934N().getMomentLikeChangedSub()).subscribe(mkd0.m154955G(new e30() { // from class: l.fw90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99632a.m109211Y1((j760) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19678r0.f20038s0).filter(new w9j() { // from class: l.gw90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f104687a.m109212Z1((String) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.hw90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109742a.m109213a2((String) obj);
            }
        }));
        if ((f9j.m120084a(this.f82937c.f181562b) || m109193C1() || "liked_users_anchor".equals(this.f82937c.f181562b) || this.f82937c.m198507H() || "from_greet_act".equals(this.f82937c.f181562b)) && !this.f82937c.m198510K()) {
            duringCreated((C22306c) CoreModule.f17545c.f19642f0.m32820Ue(this.f82937c.f181564d).map(new w9j() { // from class: l.iw90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Conversation conversation = (Conversation) obj;
                    return Boolean.valueOf(conversation != null && conversation.needCheckValidStatus());
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.jw90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f120065a.m109214b2((Boolean) obj);
                }
            }));
        }
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.kw90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124946a.m109215c2((C4319c) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19636d0.m215895j3()).subscribe(mkd0.m154950B());
        duringCreated(CoreModule.m29936Q().mo67257ao(this.f82937c.f181564d)).subscribe(mkd0.m154955G(new e30() { // from class: l.lw90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130257a.m109216d2((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A2 */
    public final void m109190A2(User user) {
        this.f82940f = user;
    }

    /* JADX INFO: renamed from: B1 */
    public final void m109191B1() {
        if (this.f82937c.m198520U()) {
            duringCreated(CoreModule.f17545c.f19639e0.m169411L7(this.f82937c.f181564d)).subscribe(mkd0.m154955G(new e30() { // from class: l.tw90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f172382a.m109241u2((List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: B2 */
    public User m109192B2() {
        vi90 vi90Var = this.f82937c;
        if (vi90Var.f181561a == null && !vi90Var.m198511L()) {
            this.f82937c.m198523X(CoreModule.m29932K().getUserById(this.f82937c.f181564d));
        }
        return this.f82937c.f181561a;
    }

    /* JADX INFO: renamed from: C1 */
    public final boolean m109193C1() {
        if ("from_portrait_like_list".equals(this.f82937c.f181562b) || TextUtils.equals(this.f82937c.f181562b, "from_mew_tags") || this.f82937c.m198536k() || this.f82937c.m198537m() || this.f82937c.m198534i() || TextUtils.equals(this.f82937c.f181562b, "from_literature_third")) {
            return true;
        }
        if (upa.m194706V1()) {
            return "chat_group".equals(this.f82937c.f181562b) || "chat_group_anonymity".equals(this.f82937c.f181562b) || "group_notification".equals(this.f82937c.f181562b) || "group_notification_anonymity".equals(this.f82937c.f181562b);
        }
        return false;
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m109194D1(int i, Intent intent, Relationship relationship) {
        act().setResult(i, intent);
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m109195E1(int i, Intent intent, Throwable th) {
        act().setResult(i, intent);
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m109196F1(int i, Intent intent, Relationship relationship) {
        if (!TEnum.equals(relationship.state, "liked") && !TEnum.equals(relationship.state, "matched") && !TEnum.equals(relationship.state, "superliked")) {
            act().setResult(i, intent);
            act().lambda$debugItems$19();
        } else {
            if (TEnum.equals(relationship.state, "superliked") || relationship.status.contains(MatchFrom.get(MatchFrom.superLiked)) || i == SwipeDirection.UP.getValue()) {
                return;
            }
            lsi0.m151595y("喜欢已发送");
        }
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m109197H1(int i, Intent intent, Throwable th) {
        act().setResult(i, intent);
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m109198I1() {
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m109199J1(final User user, Relationship relationship) {
        User userM169433Q9 = CoreModule.f17545c.f19639e0.m169433Q9(user.f56011id);
        if (userM169433Q9 != null) {
            user = userM169433Q9;
        }
        if (NullChecker.m81303a(relationship) && !relationship.equals(user.localRelationship)) {
            user.localRelationship = relationship;
            CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.sx90
                @Override // p149l.d30
                public final void call() {
                    qib0.f154722k0.f176631d.upsert(user);
                }
            });
        }
        e51.m114743H(act(), new Runnable() { // from class: l.ux90
            @Override // java.lang.Runnable
            public final void run() {
                this.f178717a.m109198I1();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m109200L1(final User user, final Relationship relationship) {
        e51.m114774y(new Runnable() { // from class: l.qx90
            @Override // java.lang.Runnable
            public final void run() {
                this.f156822a.m109199J1(user, relationship);
            }
        });
    }

    /* JADX INFO: renamed from: N1 */
    public final /* synthetic */ void m109201N1(int i, Intent intent, Relationship relationship) {
        if (i != SwipeDirection.LEFT.getValue()) {
            lsi0.m151595y(String.format("喜欢已发送，%s将收到你的喜欢", this.f82937c.f181561a.isFemale() ? "她" : "他"));
        }
        act().setResult(i, intent);
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: O1 */
    public final /* synthetic */ void m109202O1(int i, Intent intent, Throwable th) {
        act().setResult(i, intent);
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: P1 */
    public final /* synthetic */ void m109203P1(int i, Intent intent, Relationship relationship) {
        act().setResult(i, intent);
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ void m109204Q1(Intent intent, int i, Relationship relationship) {
        intent.putExtra("relationship_result", relationship.state.toString());
        act().setResult(i, intent);
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: R1 */
    public final /* synthetic */ void m109205R1(Intent intent, int i, Relationship relationship) {
        intent.putExtra("relationship_result", relationship.state.toString());
        act().setResult(i, intent);
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ Boolean m109207T1(final String str, final String str2, Boolean bool, Boolean bool2) {
        if (!bool2.booleanValue() || CoreModule.f17545c.f19663m0.f19454u0.get().booleanValue() || !NullChecker.m81303a(CoreModule.f17545c.m31484o3()) || n3b0.m157745t() || !TextUtils.isEmpty(str)) {
            return Boolean.FALSE;
        }
        hpd0 hpd0Var = CoreModule.f17545c.f19663m0.f19454u0;
        Boolean bool3 = Boolean.TRUE;
        hpd0Var.put(bool3);
        ok3.m164808G(act(), true, this.f82941g.name, CoreModule.f17545c.m31484o3().superLikeLimit.remainToday() + "", TEnum.equals(this.f82941g.gender, "male"), new Runnable() { // from class: l.vx90
            @Override // java.lang.Runnable
            public final void run() {
                this.f183434a.m109206S1(str, str2);
            }
        }, new Runnable() { // from class: l.wx90
            @Override // java.lang.Runnable
            public final void run() {
                cy90.m109156Y0();
            }
        });
        return bool3;
    }

    /* JADX INFO: renamed from: U1 */
    public final /* synthetic */ void m109208U1(boolean z, boolean z2, Relationship relationship) {
        if (z) {
            vi90 vi90Var = this.f82937c;
            vi90Var.f181572l = false;
            vi90Var.f181573m = true;
        } else {
            if (CoreModule.m29934N().mo60389so() && (this.f82937c.m198536k() || this.f82937c.m198537m() || this.f82937c.m198534i())) {
                osi0.m165783g("喜欢已发送");
            }
            this.f82937c.f181571k = false;
        }
        if (z2) {
            m109225m1();
        }
    }

    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m109209V1(boolean z, Throwable th) {
        vi90 vi90Var = this.f82937c;
        if (z) {
            vi90Var.f181572l = false;
        } else {
            vi90Var.f181571k = false;
        }
    }

    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m109210W1(boolean z) {
        vi90 vi90Var = this.f82937c;
        if (z) {
            vi90Var.f181572l = true;
        } else {
            vi90Var.f181571k = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ void m109211Y1(j760 j760Var) {
        this.f82937c.f181561a = (User) j760Var.f116564a;
        m109246x2(3);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f82939e = new ProfileShareHelper(this.f82937c);
        if (this.f82937c.m198510K()) {
            CoreModule.f17545c.f19552B0.m31617p4(CoreModule.m29931H().userId());
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ Boolean m109212Z1(String str) {
        return Boolean.valueOf(this.f82937c.m198533h());
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        if (this.f82937c.m198511L()) {
            m109245x1();
        } else {
            m109248z1();
            p420.m167354t(act());
            m109242v1();
            m109191B1();
        }
        m109186u1();
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m109213a2(String str) {
        if (TextUtils.equals(str, this.f82937c.f181564d)) {
            m109246x2(1);
        }
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m109214b2(Boolean bool) {
        m109246x2(2);
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m109215c2(C4319c c4319c) {
        if (c4319c == C4319c.f15548i && this.f82937c.f181561a == null) {
            ((ly90) this.viewModel).m152141O();
        }
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m109216d2(Boolean bool) {
        ((ly90) this.viewModel).f130504e.f22262B = new j760<>(this.f82937c.f181564d, bool);
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ C22306c m109217e2() {
        return mkd0.m154985s(this.f82937c.m198510K() ? CoreModule.f17545c.f19552B0.m31611j4().distinctUntilChanged() : C22306c.just(null), CoreModule.f17545c.f19639e0.m169410Ka(this.f82937c.f181564d), CoreModule.f17545c.f19639e0.m169523o9(), new f5a0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m109218f2(xaj0 xaj0Var) {
        this.f82937c.m198523X((User) xaj0Var.f191752b);
        m109190A2((User) xaj0Var.f191753c);
        m109249z2();
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m109219g2(Bundle bundle) {
        m109190A2(this.f82937c.f181565e.f181586k);
        vi90 vi90Var = this.f82937c;
        vi90Var.m198523X(vi90Var.f181565e.f181586k);
        this.f82935a.onNext(roj0.f160388a);
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ Boolean m109220h2(PicVerification picVerification) {
        return Boolean.valueOf(!this.f82937c.f181565e.f181586k.verifications.equals(picVerification));
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m109221i2(PicVerification picVerification) {
        this.f82937c.f181565e.f181586k.verifications = picVerification;
        this.f82935a.onNext(roj0.f160388a);
    }

    /* JADX INFO: renamed from: j2 */
    public final /* synthetic */ void m109222j2(User user) {
        m109190A2(user);
        this.f82937c.m198523X(user);
        this.f82935a.onNext(roj0.f160388a);
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m109223k2(roj0 roj0Var) {
        this.f82937c.m198523X(m109192B2());
        m109190A2(CoreModule.m29932K().me_());
        if (this.f82937c.f181561a == null || this.f82940f == null) {
            return;
        }
        this.f82935a.onNext(roj0.f160388a);
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ C22306c m109224l2() {
        return mkd0.m154984r(CoreModule.f17545c.f19639e0.m169410Ka(this.f82937c.f181564d), CoreModule.f17545c.f19639e0.m169523o9().take(1), new g5a0());
    }

    /* JADX INFO: renamed from: m1 */
    public void m109225m1() {
        LiveService liveService;
        act().lambda$debugItems$19();
        if (!rlt.m179882c(this.f82937c.f181562b) || this.f82938d.f33892F || (liveService = qib0.f154713b0.f139232c) == null) {
            return;
        }
        liveService.mo67244Tc(act(), this.f82937c.f181564d, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m109226m2(j760 j760Var) {
        this.f82937c.m198523X((User) j760Var.f116564a);
        m109190A2((User) j760Var.f116565b);
        this.f82935a.onNext(roj0.f160388a);
    }

    /* JADX INFO: renamed from: n1 */
    public void m109227n1(final int i) {
        m109244w2(i);
        m109233q1(i);
        if (this.f82937c.f181561a == null) {
            act().lambda$debugItems$19();
            return;
        }
        final Intent intent = new Intent();
        intent.putExtra("currentImageIndex", ((ly90) this.viewModel).m152145m());
        int iM152145m = ((ly90) this.viewModel).m152145m();
        int size = this.f82937c.f181561a.pictures.size();
        vi90 vi90Var = this.f82937c;
        if (iM152145m < size) {
            intent.putExtra("currentImageUrl", vi90Var.f181561a.pictures.get(((ly90) this.viewModel).m152145m()).url);
        } else {
            intent.putExtra("currentImageUrl", vi90Var.f181561a.hasPic() ? this.f82937c.f181561a.m60124fp().url : "");
            CrashHelper.m81296c(new Exception("ProfileListFrag user pictures get index crash"));
        }
        intent.putExtra("currentUserId", this.f82937c.f181564d);
        boolean zM198504E = this.f82937c.m198504E();
        vi90 vi90Var2 = this.f82937c;
        if (zM198504E) {
            if (NullChecker.m81303a(vi90Var2.f181561a)) {
                qer.m174243n(act(), this.f82937c.f181561a, i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue(), i == SwipeDirection.UP.getValue(), false, "home", null, new e30() { // from class: l.ax90
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f72133a.m109194D1(i, intent, (Relationship) obj);
                    }
                }, new e30() { // from class: l.ex90
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f93586a.m109195E1(i, intent, (Throwable) obj);
                    }
                }, pageId(), null, null, null);
                return;
            }
            return;
        }
        boolean zM198544t = vi90Var2.m198544t();
        vi90 vi90Var3 = this.f82937c;
        if (zM198544t) {
            if (NullChecker.m81303a(vi90Var3.f181561a)) {
                qer.m174243n(act(), this.f82937c.f181561a, i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue(), i == SwipeDirection.UP.getValue(), false, this.f82937c.f181562b, null, new e30() { // from class: l.fx90
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f99742a.m109196F1(i, intent, (Relationship) obj);
                    }
                }, new e30() { // from class: l.gx90
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f104842a.m109197H1(i, intent, (Throwable) obj);
                    }
                }, pageId(), null, null, null);
                return;
            }
            return;
        }
        boolean zM198532g = vi90Var3.m198532g();
        vi90 vi90Var4 = this.f82937c;
        if (zM198532g) {
            if (NullChecker.m81303a(vi90Var4.f181561a)) {
                qer.m174247r(act(), this.f82937c.f181561a, i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue(), i == SwipeDirection.UP.getValue(), pageId(), new f30() { // from class: l.hx90
                    @Override // p149l.f30
                    public final void call(Object obj, Object obj2) {
                        this.f109839a.m109200L1((User) obj, (Relationship) obj2);
                    }
                });
                return;
            }
            return;
        }
        boolean zM198538n = vi90Var4.m198538n();
        vi90 vi90Var5 = this.f82937c;
        if (zM198538n) {
            if (NullChecker.m81303a(vi90Var5.f181561a)) {
                qer.m174243n(act(), this.f82937c.f181561a, i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue(), i == SwipeDirection.UP.getValue(), false, "from_find_partner", null, new e30() { // from class: l.jx90
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f120207a.m109201N1(i, intent, (Relationship) obj);
                    }
                }, new e30() { // from class: l.kx90
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f125090a.m109202O1(i, intent, (Throwable) obj);
                    }
                }, pageId(), null, null, null);
                return;
            }
            return;
        }
        if (vi90Var5.m198503D()) {
            b1c.m99821j(act(), this.f82937c.f181561a, i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue(), i == SwipeDirection.UP.getValue(), pageId(), new e30() { // from class: l.lx90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f130399a.m109203P1(i, intent, (Relationship) obj);
                }
            }, new d30() { // from class: l.mx90
                @Override // p149l.d30
                public final void call() {
                    cy90.m109143J0();
                }
            });
            return;
        }
        if (!this.f82937c.m198502C()) {
            if (this.f82937c.m198535j()) {
                xs90.m210737f(act(), this.f82937c.f181561a, "", i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue(), i == SwipeDirection.UP.getValue(), pageId(), new e30() { // from class: l.cx90
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f82857a.m109205R1(intent, i, (Relationship) obj);
                    }
                }, new d30() { // from class: l.dx90
                    @Override // p149l.d30
                    public final void call() {
                        cy90.m109180p0();
                    }
                });
                return;
            } else {
                act().setResult(i, intent);
                act().lambda$debugItems$19();
                return;
            }
        }
        if (!xma.m210047L3()) {
            CoreModule.m29935P().m94651a().mo33565pr(act(), "profile_like_profile", Privilege.see_who_likes_me);
            return;
        }
        Act act = act();
        vi90 vi90Var6 = this.f82937c;
        boolean z = true;
        User user = vi90Var6.f181561a;
        String str = vi90Var6.f181565e.f181583h;
        if (i != SwipeDirection.RIGHT.getValue() && i != SwipeDirection.UP.getValue()) {
            z = false;
        }
        if (i != SwipeDirection.UP.getValue()) {
            z = false;
        }
        xs90.m210737f(act, user, str, z, z, pageId(), new e30() { // from class: l.nx90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141006a.m109204Q1(intent, i, (Relationship) obj);
            }
        }, new d30() { // from class: l.bx90
            @Override // p149l.d30
            public final void call() {
                cy90.m109139F0();
            }
        });
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ Boolean m109228n2(j760 j760Var) {
        return Boolean.valueOf(NullChecker.m81303a(j760Var) && TextUtils.equals((CharSequence) j760Var.f116564a, this.f82937c.f181564d));
    }

    @MainThread
    /* JADX INFO: renamed from: o1 */
    public final void m109229o1() {
        if (this.f82938d.f33893G) {
            du2.m113670a("[core][profile]", "afterGetUserInfo return by Page Animation");
            this.f82938d.f33894H = true;
            return;
        }
        du2.m113670a("[core][profile]", "afterGetUserInfo refresh list");
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.AFTER_GET_USER_INFO;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        m109246x2(0);
        ((ly90) this.viewModel).m152139M();
        ((ly90) this.viewModel).m152135I();
        ((ly90) this.viewModel).m152134H();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m109230o2(RelationshipStatus relationshipStatus) {
        m109246x2(3);
    }

    /* JADX INFO: renamed from: p1 */
    public x9j<Boolean, Boolean, Boolean> m109231p1(final String str, final String str2) {
        return new x9j() { // from class: l.rx90
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f161410a.m109207T1(str, str2, (Boolean) obj, (Boolean) obj2);
            }
        };
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m109232p2(BubbleInfo bubbleInfo) {
        this.f82937c.f181566f = bubbleInfo;
        ((ly90) this.viewModel).m152136J();
    }

    public String pageId() {
        if ("my_tab_profile_like".equals(this.f82937c.f181562b)) {
            return "p_my_profile_comment";
        }
        if ("from_guess_liker_result".equals(this.f82937c.f181562b)) {
            return "p_guess_who_likes_me_profile";
        }
        if ("from_christmas".equals(this.f82937c.f181562b)) {
            return "p_christmas_profile";
        }
        return (TextUtils.isEmpty(this.f82937c.f181564d) || !this.f82937c.m198516Q()) ? OMSDialogPositon.p_suggest_user_profile_info_view : "p_unmatch_profile";
    }

    /* JADX INFO: renamed from: q1 */
    public final void m109233q1(int i) {
        if (i == SwipeDirection.LEFT.getValue() && xp5.m210475o(this.f82937c.m198527b(), this.f82937c.f181561a)) {
            CoreModule.f17545c.f19642f0.m33177wo(this.f82937c.f181564d, false).subscribe(mkd0.m154956H(new e30() { // from class: l.ox90
                @Override // p149l.e30
                public final void call(Object obj) {
                    cy90.m109178n0((roj0) obj);
                }
            }, new e30() { // from class: l.px90
                @Override // p149l.e30
                public final void call(Object obj) {
                    cy90.m109148Q0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m109234q2(roj0 roj0Var) {
        m109249z2();
    }

    /* JADX INFO: renamed from: r1 */
    public void m109235r1(final boolean z) {
        if (this.f82941g == null) {
            this.f82941g = this.f82937c.m198525Z();
        }
        if (NullChecker.m81303a(this.f82941g)) {
            LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
            int iM152145m = ((ly90) this.viewModel).m152145m();
            SwipeExtraScData swipeExtraScData = likeExtraDataNew_.swipeExtraScData;
            swipeExtraScData.picNum = iM152145m;
            swipeExtraScData.picUploads = this.f82941g.pictures.size();
            if (NullChecker.m81303a(this.f82937c.f181561a) && this.f82937c.f181561a.pictures.size() != this.f82941g.pictures.size()) {
                CrashHelper.m81296c(new IllegalStateException(" profilelist picture size diff , user  " + this.f82937c.f181561a.f56011id + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f82937c.f181561a.pictures.size() + " withRelation " + this.f82941g.f56011id + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f82941g.pictures.size()));
            }
            int size = this.f82941g.pictures.size();
            SwipeExtraScData swipeExtraScData2 = likeExtraDataNew_.swipeExtraScData;
            if (iM152145m >= size) {
                swipeExtraScData2.picUrl = "";
            } else {
                swipeExtraScData2.picUrl = this.f82941g.pictures.get(iM152145m).url;
            }
            final boolean zM198519T = this.f82937c.m198519T();
            if (qer.m174244o(act(), this.f82941g, true, z, false, z ? "p_profile,superlike" : "p_home,likelimit", m109231p1("", ""), new e30() { // from class: l.ww90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f188351a.m109208U1(z, zM198519T, (Relationship) obj);
                }
            }, new e30() { // from class: l.yw90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f200390a.m109209V1(z, (Throwable) obj);
                }
            }, pageId(), likeExtraDataNew_, "", "", new d30() { // from class: l.zw90
                @Override // p149l.d30
                public final void call() {
                    this.f205162a.m109210W1(z);
                }
            })) {
                vi90 vi90Var = this.f82937c;
                if (z) {
                    vi90Var.f181572l = true;
                } else {
                    vi90Var.f181571k = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ C22306c m109236r2(roj0 roj0Var) {
        if (m109192B2().isMe()) {
            CoreModule.m29934N().personalMediaMomentsFeedPrevious(m109192B2().f56011id, false, CoreMomentInfo.JSON_ADAPTER);
            return CoreModule.m29934N().mo60346di(CoreMomentInfo.JSON_ADAPTER);
        }
        User userById = CoreModule.m29932K().getUserById(this.f82937c.f181564d);
        if (NullChecker.m81303a(userById) && !userById.unilateralBlock()) {
            duringCreated(CoreModule.m29934N().coreMomentPrevious(this.f82937c.f181564d)).subscribe(mkd0.m154955G(new e30() { // from class: l.uw90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f178633a.m109234q2((roj0) obj);
                }
            }));
        }
        return CoreModule.m29934N().mo60344cq(this.f82937c.f181564d, false, CoreMomentInfo.JSON_ADAPTER, "profile").map(new w9j() { // from class: l.vw90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return cy90.m109141H0((j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] */
    public void m109206S1(String str, String str2) {
        m109235r1(true);
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m109238s2(List list) {
        m109249z2();
    }

    /* JADX INFO: renamed from: t1 */
    public ProfileShareHelper m109239t1() {
        return this.f82939e;
    }

    /* JADX INFO: renamed from: t2 */
    public final /* synthetic */ void m109240t2(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isBlocked() && NullChecker.m81303a(CoreModule.m29932K().getUserById(this.f82937c.f181564d)) && !CoreModule.m29932K().getUserById(this.f82937c.f181564d).unilateralBlock()) {
            CoreModule.f17545c.f19639e0.m169374Ba(this.f82937c.f181564d);
        }
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ void m109241u2(List list) {
        this.f82937c.f181575o = list;
        m109246x2(0);
    }

    /* JADX INFO: renamed from: v1 */
    public final void m109242v1() {
        if (this.f82937c.m198510K()) {
            duringCreated(new v9j() { // from class: l.nw90
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f140929a.m109217e2();
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.ow90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f145972a.m109218f2((xaj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: v2 */
    public User m109243v2() {
        if (this.f82940f == null) {
            m109190A2(CoreModule.m29932K().me_());
        }
        return this.f82940f;
    }

    /* JADX INFO: renamed from: w2 */
    public final void m109244w2(int i) {
        if (i == SwipeDirection.LEFT.getValue() && this.f82937c.m198548x()) {
            cj90.m107130b(this.f82937c.f181564d);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m109245x1() {
        creates(new e30() { // from class: l.pw90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151554a.m109219g2((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(this.f82937c.f181564d)).map(new w9j() { // from class: l.qw90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).verifications;
            }
        }).distinctUntilChanged().filter(new w9j() { // from class: l.rw90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f161322a.m109220h2((PicVerification) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.sw90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166641a.m109221i2((PicVerification) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x2 */
    public final void m109246x2(int i) {
        if (this.f82937c.m198510K() || !NullChecker.m81303a(this.f82937c.f181561a)) {
            return;
        }
        V v2 = this.viewModel;
        if (i != 3) {
            ((ly90) v2).m152142P(i);
            return;
        }
        if ((((ly90) v2).f130511l != null ? ((ly90) v2).f130511l.m130942d().m52389a() : null) != ((ly90) this.viewModel).m152142P(i)) {
            m109229o1();
        }
    }

    /* JADX INFO: renamed from: y2 */
    public void m109247y2() {
        if (this.f82937c.m198504E()) {
            zvf0.m220396r("e_push_profile_quit", "p_push_profile");
        }
        m109225m1();
    }

    /* JADX INFO: renamed from: z1 */
    public final void m109248z1() {
        duringCreated((C22306c) CoreModule.f17545c.f19639e0.m169462Y9(this.f82937c.f181564d, false, true).switchMap(new w9j() { // from class: l.bw90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f77596a.m109236r2((roj0) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.ix90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115338a.m109238s2((List) obj);
            }
        }, new e30() { // from class: l.tx90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172497a.m109240t2((Throwable) obj);
            }
        }));
        if (this.f82937c.m198510K()) {
            duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.xx90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f194846a.m109222j2((User) obj);
                }
            }));
            return;
        }
        if (f9j.m120084a(this.f82937c.f181562b)) {
            duringCreated(C22306c.just(roj0.f160388a)).subscribe(mkd0.m154955G(new e30() { // from class: l.yx90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f200585a.m109223k2((roj0) obj);
                }
            }));
        }
        duringCreated(new v9j() { // from class: l.zx90
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f205392a.m109224l2();
            }
        }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.ay90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72262a.m109226m2((j760) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19678r0.m34150v5()).filter(new w9j() { // from class: l.by90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f77893a.m109228n2((j760) obj);
            }
        }).map(new w9j() { // from class: l.cw90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return cy90.m109160d1((j760) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.dw90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88158a.m109230o2((RelationshipStatus) obj);
            }
        }));
        duringCreated(CoreModule.m29934N().mo60400vm(this.f82937c.f181564d)).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.mw90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136029a.m109232p2((BubbleInfo) obj);
            }
        }, new e30() { // from class: l.xw90
            @Override // p149l.e30
            public final void call(Object obj) {
                cy90.m109144L0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z2 */
    public void m109249z2() {
        if (this.f82940f == null || this.f82937c.f181561a == null) {
            return;
        }
        this.f82935a.onNext(roj0.f160388a);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
