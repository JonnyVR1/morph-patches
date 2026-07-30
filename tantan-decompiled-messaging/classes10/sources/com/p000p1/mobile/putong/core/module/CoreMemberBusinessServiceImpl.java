package com.p000p1.mobile.putong.core.module;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.LikeUser;
import com.p000p1.mobile.putong.core.data.LikedUser;
import com.p000p1.mobile.putong.core.data.MyMeetSeeReminderType;
import com.p000p1.mobile.putong.core.data.PicksTagType;
import com.p000p1.mobile.putong.core.data.PicksUser;
import com.p000p1.mobile.putong.core.data.Privilege;
import com.p000p1.mobile.putong.core.data.PurchaseType;
import com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService;
import com.p000p1.mobile.putong.core.module.CoreMemberBusinessServiceImpl;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.CoreBusinessModule;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p1.mobile.putong.core.newui.home.d;
import com.p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p1.mobile.putong.core.ui.match.MatchAct;
import com.p1.mobile.putong.core.ui.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.core.ui.vip.picks.PicksHelper;
import com.p1.mobile.putong.core.ui.vip.picks.act.PicksAct;
import com.p1.mobile.putong.core.ui.vip.picks.view.PicksItemView;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.CounterLikeLimit;
import com.p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.MatchScData;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import l.d30;
import l.dac0;
import l.e30;
import l.f30;
import l.f5y;
import l.j760;
import l.lf90;
import l.lsi0;
import l.me70;
import l.mkd0;
import l.mlr;
import l.myc0;
import l.otl;
import l.ptl;
import l.qer;
import l.qtl;
import l.r6n;
import l.rmp;
import l.rxg0;
import l.sja;
import l.stl;
import l.swh0;
import l.t100;
import l.tz00;
import l.u59;
import l.ue70;
import l.upa;
import l.ura;
import l.vwb;
import l.w2b0;
import l.x2c0;
import l.x9j;
import l.xdl0;
import l.xma;
import l.zar;
import l.zvf0;
import p003l.abi;
import p003l.aeh0;
import p003l.ark;
import p003l.kg70;
import p003l.m73;
import p003l.mb90;
import p003l.nmn;
import p003l.ukf0;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Route(name = "CoreMemberBusinessService", path = "/member_business_service/service")
public class CoreMemberBusinessServiceImpl implements CoreMemberBusinessService {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.module.CoreMemberBusinessServiceImpl$a */
    public class C3065a implements e30<Relationship> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d f871a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f872b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Act f873c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ User f874d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f875e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ue70 f876f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ String f877g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ boolean f878h;

        public C3065a(d dVar, boolean z, Act act, User user, boolean z2, ue70 ue70Var, String str, boolean z3) {
            this.f871a = dVar;
            this.f872b = z;
            this.f873c = act;
            this.f874d = user;
            this.f875e = z2;
            this.f876f = ue70Var;
            this.f877g = str;
            this.f878h = z3;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Relationship relationship) {
            HomeStatisticsHelper.B(this.f871a, "success");
            int i = 1;
            if (TEnum.equals(relationship.state, "matched")) {
                if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get("superLikedEach")) {
                    i = 13;
                } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get("superLiked")) {
                    i = this.f872b ? 12 : 11;
                } else if (relationship.status.size() == 0 || relationship.status.get(0) != MatchFrom.get("secretcrush")) {
                    i = 0;
                }
                Act act = this.f873c;
                act.startActivityWithCustomTransition(MatchAct.e2(act, vwb.f0(new String[]{relationship.id}), i, new ArrayList()), new MatchAct.b());
                CoreModule.c.u0.x7(((DbObject) this.f874d).id);
            } else if (this.f875e) {
                this.f876f.l().notifyDataSetChanged();
                if (this.f872b) {
                    if (TextUtils.isEmpty(this.f877g)) {
                        boolean z = this.f878h;
                        Act act2 = this.f873c;
                        if (z) {
                            PicksHelper.o(act2, this.f874d, true);
                            CoreModule.c.C0.u4();
                        } else {
                            rxg0.L(act2);
                        }
                    } else {
                        zar.i(this.f873c);
                    }
                } else if (this.f878h) {
                    PicksHelper.o(this.f873c, this.f874d, false);
                    CoreModule.c.C0.u4();
                }
            }
            if (ura.e().d().t() && this.f878h) {
                CoreModule.c.m0.d9();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m1291J(d dVar, boolean z, boolean z2, ptl ptlVar, otl otlVar, boolean z3, Relationship relationship) {
        HomeStatisticsHelper.B(dVar, "success");
        if (TEnum.equals(relationship.state, "matched")) {
            int i = 0;
            if (relationship.status.size() != 0 && TEnum.equals((MatchFrom) relationship.status.get(0), "superLikedEach")) {
                i = 13;
            } else if (relationship.status.size() != 0 && TEnum.equals((MatchFrom) relationship.status.get(0), "superLiked")) {
                i = z ? 12 : 11;
            } else if (relationship.status.size() != 0 && TEnum.equals((MatchFrom) relationship.status.get(0), "secretcrush")) {
                i = 1;
            }
            if (z2) {
                ptlVar.L(ptlVar.k());
            } else {
                otlVar.act().startActivityWithCustomTransition(MatchAct.e2(otlVar.act(), vwb.f0(new String[]{relationship.id}), i, new ArrayList()), new MatchAct.b());
            }
        } else if (z3) {
            lsi0.h(R.string.t4);
        }
        if (TextUtils.equals(ptlVar.getFrom(), "from_meet")) {
            if (z3) {
                f5y.l(((DbObject) ptlVar.k()).id, relationship.state);
            } else {
                f5y.k(((DbObject) ptlVar.k()).id);
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m1292K(d dVar, ue70 ue70Var, Throwable th) {
        HomeStatisticsHelper.A(dVar, th);
        ue70Var.l().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m1299S(d dVar, boolean z, Act act, Relationship relationship) {
        HomeStatisticsHelper.B(dVar, "success");
        if (z) {
            rxg0.L(act);
        }
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m1303X(d dVar, Boolean bool, Act act, User user, Boolean bool2, Relationship relationship) {
        HomeStatisticsHelper.B(dVar, "success");
        if (!TEnum.equals(relationship.state, "matched")) {
            if (bool2.booleanValue() && bool.booleanValue()) {
                rxg0.L(act);
                return;
            }
            return;
        }
        int i = 0;
        if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get("superLikedEach")) {
            i = 13;
        } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get("superLiked")) {
            i = bool.booleanValue() ? 12 : 11;
        } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get("secretcrush")) {
            i = 1;
        }
        if (CoreModule.c.e0.p9().isFemale()) {
            abi.m5323J(act, user);
        } else {
            act.startActivityWithCustomTransition(MatchAct.e2(act, vwb.f0(new String[]{relationship.id}), i, new ArrayList()), new MatchAct.b());
        }
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m1304Y(d dVar, boolean z, Act act, boolean z2, String str, Relationship relationship) {
        HomeStatisticsHelper.B(dVar, "success");
        if (!TEnum.equals(relationship.state, "matched")) {
            if (z2) {
                if (TextUtils.isEmpty(str)) {
                    rxg0.L(act);
                    return;
                } else {
                    lsi0.j(act.getString(R.string.W2));
                    return;
                }
            }
            return;
        }
        int i = 0;
        if (relationship.status.size() != 0 && TEnum.equals((MatchFrom) relationship.status.get(0), "superLikedEach")) {
            i = 13;
        } else if (relationship.status.size() != 0 && TEnum.equals((MatchFrom) relationship.status.get(0), "superLiked")) {
            i = z ? 12 : 11;
        } else if (relationship.status.size() != 0 && TEnum.equals((MatchFrom) relationship.status.get(0), "secretcrush")) {
            i = 1;
        }
        act.startActivityWithCustomTransition(MatchAct.e2(act, vwb.f0(new String[]{relationship.id}), i, new ArrayList()), new MatchAct.b());
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ void m1306a0(PurchaseType purchaseType) {
        CoreModule.c.k1.A3();
        CoreModule.c.C0.u4();
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: An */
    public void mo792An(User user) {
        if (r6n.f().c(((DbObject) user).id)) {
            r6n.f().n(user);
        }
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Bi */
    public void mo793Bi(User user) {
        CoreBusinessModule.g.b().c = user;
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Ej */
    public boolean mo794Ej(boolean z, boolean z2, boolean z3, int i, String str, User user, Act act, String str2, f30<Relationship, Integer> f30Var, d30 d30Var) {
        d dVarM5368h = aeh0.m5368h(str2, z3, z, z2, user);
        dVarM5368h.r(HomeStatisticsHelper.ScActionFrom.MEET);
        dVarM5368h.z(i);
        dVarM5368h.B(str);
        dVarM5368h.D("seewholikeme");
        dVarM5368h.F("relationshipUI:seeWhoLikedMe");
        return aeh0.m5371k(z, z2, z3, dVarM5368h, user, act, f30Var, d30Var);
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Jb */
    public void mo795Jb(Act act, int i, Intent intent) {
        if (i == -1) {
            ark.m5540L0(act, (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.h));
        }
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Ml, reason: merged with bridge method [inline-methods] */
    public boolean m1318o0(final Act act, final User user, final boolean z, final boolean z2, final boolean z3, final String str, final e30<Relationship> e30Var, final e30<Throwable> e30Var2, final String str2, final LikeExtraData likeExtraData, final String str3, final String str4) {
        return qer.n(act, user, z, z2, z3, str, aeh0.m5369i(act, user, new d30() { // from class: l.uq9
            public final void call() {
                this.f7790a.m1318o0(act, user, z, z2, z3, str, e30Var, e30Var2, str2, likeExtraData, str3, str4);
            }
        }), e30Var, e30Var2, str2, likeExtraData, str3, str4);
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: O6 */
    public void mo797O6() {
        myc0.d0().j0();
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Pb */
    public boolean mo798Pb(boolean z, boolean z2, boolean z3, int i, String str, User user, Act act, String str2, f30<Relationship, Integer> f30Var, d30 d30Var) {
        d dVarM5368h = aeh0.m5368h(str2, z3, z, z2, user);
        dVarM5368h.r(HomeStatisticsHelper.ScActionFrom.NEARBY);
        dVarM5368h.z(i);
        dVarM5368h.B(str);
        dVarM5368h.D(MyMeetSeeReminderType.nearby);
        return aeh0.m5371k(z, z2, z3, dVarM5368h, user, act, f30Var, d30Var);
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Qd */
    public boolean mo799Qd(final Act act, boolean z, boolean z2, int i, String str, final String str2, final User user, final LikeUser likeUser, String str3, final e30<LikeUser> e30Var) {
        Counter counterO3 = CoreModule.c.o3();
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterO3 == null ? null : counterO3.superLikeLimit;
        boolean zEquals = TextUtils.equals(str3, "p_intl_like_i_sent,e_intl_i_like_photo,swipe_like");
        final boolean z3 = !zEquals;
        final d dVarB = HomeStatisticsHelper.f(!zEquals ? "p_suggest_user_profile_info_view" : "p_who_i_liked", z3, z, z2, user).z(i).B(str);
        User userP9 = CoreModule.c.e0.p9();
        dVarB.r(HomeStatisticsHelper.ScActionFrom.WHO_I_LIKE);
        if (xma.e4() && z2) {
            if (CoreModule.c.p0.k3()) {
                c.L0(act, str3, (e30) null, (d30) null, (d30) null, Privilege.unlimit_free_super_like);
            } else {
                c.x0(act, str3, Privilege.liked_user);
            }
            return false;
        }
        if (userP9.isJailed()) {
            CoreModule.K().startJailedDialogLikeAct();
            HomeStatisticsHelper.B(dVarB, "failJailedUser");
            return false;
        }
        if (ark.m5528F0(act, new Runnable() { // from class: l.er9
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                act2.startActivityForResult(MediaPickerAct.d2(act2, 1, false, false, true, (String) null), 786);
            }
        })) {
            HomeStatisticsHelper.B(dVarB, "failFakeUser");
            return false;
        }
        if (userP9.isNameFake()) {
            HomeStatisticsHelper.B(dVarB, "failFakeUser");
            ark.m5556T0(act);
            return false;
        }
        if ((z || z2) && counterO3 == null) {
            HomeStatisticsHelper.B(dVarB, "failDataError");
            return false;
        }
        if (z2 && u59.T()) {
            nmn.m8352g(act, new nmn.C3386a(((DbObject) user).id, ""), "");
            return false;
        }
        if (z2 && swh0.G1(act, new d30() { // from class: l.fr9
            public final void call() {
                this.f4501a.m1313h0(dVarB, act, z3, str2, user, likeUser, e30Var);
            }
        })) {
            dVarB = dVarB;
            return false;
        }
        if (!z2 || swh0.w0(counterSuperlikeAndUndoLimit.remainToday()) != 0) {
            m1308c0(act, z, z2, z3, dVarB, str2, user, likeUser, e30Var);
            return true;
        }
        c.F1(act, str3);
        HomeStatisticsHelper.B(dVarB, "failExhaustSuperlike");
        return false;
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Qe */
    public void mo800Qe(Act act, BoostViewContainer boostViewContainer) {
        m73.m7992h(act, boostViewContainer, null);
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Ra */
    public void mo801Ra(@NonNull VRelative vRelative, @Nullable Act act, @NonNull String str, final PicksItemView picksItemView) {
        lf90 lf90Var = new lf90(picksItemView, new e30() { // from class: l.tq9
            public final void call(Object obj) {
                xdl0.M0(picksItemView.b, ((Boolean) obj).booleanValue());
            }
        });
        if (upa.L3()) {
            act.startActivityForResult(ProfileAct.n2(act, str, "from_picks", true), 24);
        } else {
            act.startActivityForResultWithCustomTransition(ProfileAct.n2(act, str, "from_picks", true), 24, lf90Var);
        }
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Ss */
    public void mo802Ss(mlr mlrVar) {
        mlrVar.h.setImageResource(x2c0.er);
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: X8 */
    public void mo803X8(@NonNull String str, Act act) {
        c.s1(act, str, new e30() { // from class: l.xq9
            public final void call(Object obj) {
                CoreMemberBusinessServiceImpl.m1306a0((PurchaseType) obj);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Yq */
    public void mo804Yq(int i, Intent intent, Act act) {
        if (i == -1) {
            ark.m5540L0(act, (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.h));
        }
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: a9 */
    public Intent mo805a9(Context context) {
        return new Intent(context, (Class<?>) PicksAct.class);
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: be */
    public boolean mo806be(final Act act, final stl stlVar, final boolean z, final boolean z2, final boolean z3, int i, String str, final String str2, final User user, final LikedUser likedUser) {
        final boolean z4;
        Counter counterO3 = CoreModule.c.o3();
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterO3 == null ? null : counterO3.superLikeLimit;
        final d dVarB = HomeStatisticsHelper.f(z3 ? "p_suggest_user_profile_info_view" : "p_who_i_liked", z3, z, z2, user).z(i).B(str);
        User userP9 = CoreModule.c.e0.p9();
        dVarB.r(HomeStatisticsHelper.ScActionFrom.WHO_I_LIKE);
        if (userP9.isJailed()) {
            CoreModule.K().startJailedDialogLikeAct();
            stlVar.notifyDataSetChanged();
            HomeStatisticsHelper.B(dVarB, "failJailedUser");
            return false;
        }
        if (userP9.isNameFake()) {
            HomeStatisticsHelper.B(dVarB, "failFakeUser");
            ark.m5556T0(act);
            return false;
        }
        if (xma.e4() && z2) {
            c.x0(act, stlVar.G2(z3), Privilege.liked_user);
            return false;
        }
        if ((z || z2) && counterO3 == null) {
            HomeStatisticsHelper.B(dVarB, "failDataError");
            return false;
        }
        if (z2 && !TextUtils.isEmpty(str2) && !xma.D3() && swh0.G() && swh0.p0().e1()) {
            PurchaseType purchaseType = PurchaseType.TYPE_GET_LETTER;
            d30 d30Var = new d30() { // from class: l.zq9
                public final void call() {
                    this.f9299a.m1314k0(act, stlVar, z, z2, z3, dVarB, str2, user, likedUser);
                }
            };
            Objects.requireNonNull(stlVar);
            swh0.B1(act, purchaseType, d30Var, new d30() { // from class: l.ar9
                public final void call() {
                    stlVar.Z0();
                }
            });
            return false;
        }
        final d dVar = dVarB;
        if (z2 && TextUtils.isEmpty(str2)) {
            z4 = z3;
            if (swh0.G1(act, new d30() { // from class: l.br9
                public final void call() {
                    this.f3428a.m1315l0(dVar, act, stlVar, z4, str2, user, likedUser);
                }
            })) {
                dVar = dVar;
                return false;
            }
        } else {
            z4 = z3;
        }
        if (!z2 || !TextUtils.isEmpty(str2) || swh0.w0(counterSuperlikeAndUndoLimit.remainToday()) != 0) {
            m1309d0(act, stlVar, z, z2, z4, dVar, str2, user, likedUser);
            return true;
        }
        c.F1(act, stlVar.G2(z4));
        HomeStatisticsHelper.B(dVar, "failExhaustSuperlike");
        return false;
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: bj */
    public int mo807bj() {
        return 24;
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: bo */
    public String mo808bo() {
        return "currentImageIndex";
    }

    /* JADX INFO: renamed from: c0 */
    public final void m1308c0(final Act act, boolean z, final boolean z2, boolean z3, final d dVar, String str, User user, LikeUser likeUser, e30<LikeUser> e30Var) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(dVar.f().getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(likeUser.userId).pageId(dVar.h()).build();
        act.duringCreated(CoreModule.c.m0.W7(z, z2, (Map) null, user, str, LikeFrom.get("myLiked"), true, likeExtraDataNew_)).subscribe(mkd0.H(new e30() { // from class: l.vq9
            public final void call(Object obj) {
                CoreMemberBusinessServiceImpl.m1299S(dVar, z2, act, (Relationship) obj);
            }
        }, new e30() { // from class: l.wq9
            public final void call(Object obj) {
                HomeStatisticsHelper.A(dVar, (Throwable) obj);
            }
        }));
        if (e30Var != null) {
            e30Var.call(likeUser);
        }
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: cb */
    public boolean mo809cb(final Act act, final Boolean bool, final Boolean bool2, final Boolean bool3, final User user) {
        final d dVarE = HomeStatisticsHelper.e(act.pageId(), bool3.booleanValue(), bool.booleanValue(), bool2.booleanValue(), user);
        User userP9 = CoreModule.c.e0.p9();
        if (!NullChecker.a(userP9)) {
            return false;
        }
        dVarE.h = HomeStatisticsHelper.ScActionFrom.INTL_VISITOR;
        CounterLikeLimit counterLikeLimit = CoreModule.c.o3().likeLimit;
        if (userP9.isJailed()) {
            CoreModule.K().startJailedDialogLikeAct();
            HomeStatisticsHelper.B(dVarE, "failJailedUser");
            return false;
        }
        if (userP9.isNameFake()) {
            HomeStatisticsHelper.B(dVarE, "failFakeUser");
            ark.m5556T0(act);
            return false;
        }
        if (!xma.L3()) {
            rmp.INSTANCE.o(act, "p_intl_visitors_list,e_intl_visitors_list_check_btn,check", (Function0) null);
            return false;
        }
        if (bool.booleanValue() && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !mb90.m8137b(PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
            rmp.INSTANCE.o(act, "p_intl_visitors_list,e_intl_visitors_list_check_btn,check", (Function0) null);
            return false;
        }
        if (!bool2.booleanValue() || swh0.x0() > 0) {
            if (bool2.booleanValue() && swh0.G1(act, new d30() { // from class: l.yq9
                public final void call() {
                    this.f9099a.m1316m0(dVarE, act, bool, bool2, bool3, user);
                }
            })) {
                return false;
            }
            m1310e0(act, bool, bool2, bool3, dVarE, user);
            return true;
        }
        if (xma.L3()) {
            c.F1(act, bool3.booleanValue() ? "p_who_i_liked,e_iliked_superlike,click" : "p_who_i_liked,e_card,swipe_like");
            HomeStatisticsHelper.B(dVarE, "failExhaustSuperlike");
        } else {
            rmp.INSTANCE.o(act, "p_intl_visitors_list,e_intl_visitors_list_check_btn,check", (Function0) null);
        }
        return false;
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: ch */
    public String mo810ch() {
        return "currentImageUrl";
    }

    /* JADX INFO: renamed from: d0 */
    public final void m1309d0(final Act act, stl stlVar, final boolean z, final boolean z2, boolean z3, final d dVar, final String str, User user, LikedUser likedUser) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(dVar.f().getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(likedUser.f94id).pageId(dVar.h()).build();
        stlVar.duringCreated(CoreModule.c.m0.W7(z, z2, (Map) null, user, str, LikeFrom.get("myLiked"), true, likeExtraDataNew_)).subscribe(mkd0.H(new e30() { // from class: l.rq9
            public final void call(Object obj) {
                CoreMemberBusinessServiceImpl.m1304Y(dVar, z2, act, z, str, (Relationship) obj);
            }
        }, new e30() { // from class: l.sq9
            public final void call(Object obj) {
                HomeStatisticsHelper.A(dVar, (Throwable) obj);
            }
        }));
        stlVar.w0(z2, str, likedUser);
    }

    /* JADX INFO: renamed from: e0 */
    public void m1310e0(final Act act, final Boolean bool, final Boolean bool2, Boolean bool3, final d dVar, final User user) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(dVar.h.getFrom()).isLike(bool.booleanValue()).isFromButton(bool3.booleanValue()).isSuperLiked(bool2.booleanValue()).user(((DbObject) user).id).pageId(dVar.h()).build();
        act.duringCreated(CoreModule.c.m0.Y7(bool.booleanValue(), bool2.booleanValue(), (Map) null, user, (String) null, LikeFrom.get("intl_visitor"), true, likeExtraDataNew_, 0, (String) null)).subscribe(mkd0.H(new e30() { // from class: l.pq9
            public final void call(Object obj) {
                CoreMemberBusinessServiceImpl.m1303X(dVar, bool2, act, user, bool, (Relationship) obj);
            }
        }, new e30() { // from class: l.qq9
            public final void call(Object obj) {
                HomeStatisticsHelper.A(dVar, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f0 */
    public final void m1311f0(boolean z, boolean z2, boolean z3, final d dVar, User user, String str, PicksUser picksUser, Act act, final ue70 ue70Var, me70 me70Var) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(dVar.h.getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(picksUser.f130id).pageId(dVar.h()).build();
        act.duringCreated(CoreModule.c.m0.Y7(z, z2, (Map) null, user, str, LikeFrom.get("picks"), true, likeExtraDataNew_, 0, picksUser.picksTracker)).subscribe(mkd0.H(new C3065a(dVar, z2, act, user, z, ue70Var, str, !xma.G3() && sja.r3() > 0), new e30() { // from class: l.mq9
            public final void call(Object obj) {
                CoreMemberBusinessServiceImpl.m1292K(dVar, ue70Var, (Throwable) obj);
            }
        }));
        m1319r0(picksUser, ue70Var, me70Var);
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: fe */
    public boolean mo811fe(boolean z, boolean z2, final boolean z3, final boolean z4, int i, String str, final ptl ptlVar, final qtl qtlVar, final otl otlVar) {
        Counter counterO3 = CoreModule.c.o3();
        CounterLikeLimit counterLikeLimit = counterO3 == null ? null : counterO3.likeLimit;
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterO3 != null ? counterO3.superLikeLimit : null;
        final d dVarB = HomeStatisticsHelper.f(z3 ? "p_suggest_user_profile_info_view" : "p_see_who_likes_me_view", z3, z, z2, ptlVar.k()).z(i).B(str);
        User userP9 = CoreModule.c.e0.p9();
        if (userP9.isJailed()) {
            CoreModule.K().startJailedDialogLikeAct();
            otlVar.notifyDataSetChanged();
            HomeStatisticsHelper.B(dVarB, "failJailedUser");
            return false;
        }
        if (ark.m5528F0(otlVar.act(), new Runnable() { // from class: l.cr9
            @Override // java.lang.Runnable
            public final void run() {
                otl otlVar2 = otlVar;
                otlVar2.act().startActivityForResult(MediaPickerAct.d2(otlVar2.act(), 1, false, false, true, (String) null), 786);
            }
        })) {
            HomeStatisticsHelper.B(dVarB, "failFakeUser");
            if (NullChecker.a(ptlVar.s())) {
                ptlVar.s().setClickable(true);
            }
            return false;
        }
        if (NullChecker.a(userP9) && userP9.isNameFake()) {
            HomeStatisticsHelper.B(dVarB, "failFakeUser");
            ark.m5556T0(otlVar.act());
            return false;
        }
        if ((z || z2) && counterO3 == null) {
            HomeStatisticsHelper.B(dVarB, "failDataError");
            return false;
        }
        if (z && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !mb90.m8138c(userP9, PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
            c.M1(otlVar.act(), "p_home,likelimit", Privilege.vip_unlimited_likes, (d30) null, (d30) null, false, ptlVar.k());
            if (NullChecker.a(ptlVar.s())) {
                ptlVar.s().setClickable(true);
            }
            HomeStatisticsHelper.B(dVarB, "failExhaustSwipe");
            return false;
        }
        if (z2 && swh0.G1(otlVar.act(), new d30() { // from class: l.dr9
            public final void call() {
                this.f4216a.m1317n0(dVarB, z3, z4, ptlVar, qtlVar, otlVar);
            }
        })) {
            if (NullChecker.a(ptlVar.s())) {
                ptlVar.s().setClickable(true);
            }
            HomeStatisticsHelper.B(dVarB, "tantanCoin");
            return false;
        }
        if (!z2 || swh0.w0(counterSuperlikeAndUndoLimit.remainToday()) != 0) {
            m1312g0(z, z2, z3, z4, dVarB, ptlVar, qtlVar, otlVar);
            return true;
        }
        if (mb90.m8137b(PurchaseType.TYPE_SUPERLIKE_PKG) || u59.a0()) {
            c.F1(otlVar.act(), "p_see_who_likes_me_view,e_superlike,click");
            HomeStatisticsHelper.B(dVarB, "failExhaustSuperlike");
        } else {
            c.M1(otlVar.act(), "p_see_who_likes_me_view,e_superlike,click", Privilege.vip_super_like, (d30) null, (d30) null, false, ptlVar.k());
            HomeStatisticsHelper.B(dVarB, "failLessVipSuperLike");
        }
        if (NullChecker.a(ptlVar.s())) {
            ptlVar.s().setClickable(true);
        }
        return false;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m1312g0(final boolean z, final boolean z2, boolean z3, final boolean z4, final d dVar, final ptl ptlVar, qtl qtlVar, final otl otlVar) {
        String strP;
        HashMap map = new HashMap();
        map.put("X-Testing-Variance", "relationshipUI:seeWhoLikedMe");
        map.put("sourcepage", "seewholikeme");
        map.put("actiontype", z3 ? "click" : "swipe");
        dVar.e(map);
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(dVar.f().getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(ptlVar.k()).pageId(dVar.h()).build();
        otlVar.duringCreated(CoreModule.c.m0.U7(z, z2, map, ptlVar.k(), likeExtraDataNew_, LikeFrom.get("likers"))).subscribe(mkd0.H(new e30() { // from class: l.nq9
            public final void call(Object obj) {
                CoreMemberBusinessServiceImpl.m1291J(dVar, z2, z4, ptlVar, otlVar, z, (Relationship) obj);
            }
        }, new e30() { // from class: l.oq9
            public final void call(Object obj) {
                HomeStatisticsHelper.A(dVar, (Throwable) obj);
            }
        }));
        if (otlVar.A1(ptlVar.k(), z)) {
            ptlVar.J(ptlVar.l() - 1);
            if (ptlVar.l() <= 0) {
                qtlVar.a(false, otlVar.O2() <= 1);
            }
            strP = ptlVar.P(ptlVar.l());
        } else {
            strP = ptlVar.P(ptlVar.l());
        }
        qtlVar.setTitle(strP);
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: ge */
    public boolean mo812ge(@NonNull Act act) {
        return act instanceof PicksAct;
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m1313h0(d dVar, Act act, boolean z, String str, User user, LikeUser likeUser, e30 e30Var) {
        dVar.p();
        m1308c0(act, true, true, z, dVar, str, user, likeUser, e30Var);
    }

    public void init(Context context) {
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: k */
    public boolean mo813k() {
        return false;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m1314k0(Act act, stl stlVar, boolean z, boolean z2, boolean z3, d dVar, String str, User user, LikedUser likedUser) {
        swh0.p0().U0();
        m1309d0(act, stlVar, z, z2, z3, dVar, str, user, likedUser);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m1315l0(d dVar, Act act, stl stlVar, boolean z, String str, User user, LikedUser likedUser) {
        dVar.p();
        m1309d0(act, stlVar, true, true, z, dVar, str, user, likedUser);
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: l1 */
    public void mo814l1(Act act, String str) {
        CoreModule.P().a().l1(act, str);
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: lm */
    public void mo815lm(Act act, User user, String str, boolean z, Runnable runnable, Runnable runnable2, String str2) {
        tz00.j(act, user, str, z, runnable, runnable2, str2);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m1316m0(d dVar, Act act, Boolean bool, Boolean bool2, Boolean bool3, User user) {
        dVar.p();
        m1310e0(act, bool, bool2, bool3, dVar, user);
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: m6 */
    public void mo816m6(mlr mlrVar) {
        mlrVar.j.setBackgroundColor(-1);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m1317n0(d dVar, boolean z, boolean z2, ptl ptlVar, qtl qtlVar, otl otlVar) {
        dVar.p();
        m1312g0(true, true, z, z2, dVar, ptlVar, qtlVar, otlVar);
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: n9 */
    public void mo817n9(mlr mlrVar) {
        mlrVar.f.setTextColor(-1725882079);
        mlrVar.f.setTextSize(2, 16.0f);
        ViewGroup.LayoutParams layoutParams = mlrVar.h.getLayoutParams();
        int i = t100.j;
        layoutParams.width = i;
        layoutParams.height = i;
        mlrVar.h.setLayoutParams(layoutParams);
        mlrVar.h.setImageResource(x2c0.er);
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: on */
    public boolean mo818on(boolean z, boolean z2, boolean z3, int i, @NonNull String str, @NonNull User user, String str2, @NonNull Frag frag, @NonNull PicksUser picksUser, @Nullable String str3, @NonNull dac0 dac0Var, @NonNull e30<String> e30Var, @NonNull d30 d30Var) {
        return kg70.INSTANCE.m7594f(z, z2, z3, i, str, user, str2, frag, picksUser, str3, dac0Var, e30Var, d30Var);
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: pc */
    public String mo819pc() {
        return "heart_confession_content";
    }

    /* JADX INFO: renamed from: r0 */
    public final void m1319r0(PicksUser picksUser, ue70 ue70Var, me70 me70Var) {
        if (ue70Var.l().M(picksUser)) {
            CoreModule.c.k1.I3(picksUser.f130id);
            me70Var.r0(me70Var.l0() + 1);
        }
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: tq */
    public boolean mo820tq(Act act, User user, boolean z, boolean z2, boolean z3, String str, e30<Relationship> e30Var, e30<Throwable> e30Var2, String str2, LikeExtraData likeExtraData, String str3, String str4) {
        return qer.n(act, user, z, z2, z3, str, (x9j) null, e30Var, e30Var2, str2, likeExtraData, str3, str4);
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: vk */
    public boolean mo821vk(boolean z, boolean z2, boolean z3, int i, @NonNull String str, @NonNull User user, @Nullable String str2, @Nullable Act act, ue70 ue70Var, @NonNull PicksUser picksUser, me70 me70Var) {
        zvf0.w("e_picks_module_card", act.pageId(), new j760[]{vwb.Y("picks_card_type", TEnum.equals(picksUser.picksTagType, PicksTagType.masking) ? "grayed" : "clear"), vwb.Y("other_user_id", ((DbObject) user).id), vwb.Y("direction", z ? "like" : "dislike")});
        User userP9 = CoreModule.c.e0.p9();
        d dVarB = HomeStatisticsHelper.e(act.pageId(), z3, z, z2, user).z(i).B(str);
        dVarB.h = HomeStatisticsHelper.ScActionFrom.PICKS;
        if (userP9.isJailed()) {
            ue70Var.l().notifyDataSetChanged();
            CoreModule.K().startJailedDialogLikeAct();
            HomeStatisticsHelper.B(dVarB, "failJailedUser");
            return false;
        }
        if (userP9.isNameFake()) {
            HomeStatisticsHelper.B(dVarB, "failFakeUser");
            ark.m5556T0(act);
            return false;
        }
        if (me70Var.l0() >= 4 || ue70Var.l().L() <= 4) {
            act.startActivity(new Intent((Context) act, (Class<?>) PicksAct.class));
            ue70Var.k();
            return false;
        }
        if (TEnum.equals(picksUser.picksTagType, PicksTagType.masking)) {
            mo803X8("picks_module_card", act);
            ue70Var.l().notifyDataSetChanged();
            return false;
        }
        if (!z && !xma.G3()) {
            ue70Var.l().notifyDataSetChanged();
            return false;
        }
        if (!xma.G3() && sja.r3() <= 0) {
            mo803X8("picks_module_card", act);
            ue70Var.l().notifyDataSetChanged();
            return false;
        }
        CounterLikeLimit counterLikeLimit = CoreModule.c.o3().likeLimit;
        if (z && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !mb90.m8138c(userP9, PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
            CoreModule.P().a().pr(act, z3 ? "picks_module_card" : "", Privilege.vip_unlimited_likes);
            return false;
        }
        if (!z2 || !TextUtils.isEmpty(str2) || swh0.x0() > 0) {
            m1311f0(z, z2, z3, dVarB, user, str2, picksUser, act, ue70Var, me70Var);
            return true;
        }
        if (xma.e4()) {
            if (!xma.G3() && sja.r3() <= 0) {
                mo803X8("picks_module_card", act);
            } else if (mb90.m8138c(userP9, PurchaseType.TYPE_SUPERLIKE_PKG) || u59.a0()) {
                c.F1(act, w2b0.c("p_navigation_ilike,card_button_pull", z3 ? 2 : 1));
            } else {
                CoreModule.P().a().pr(act, "e_picks_card_superlike", Privilege.vip_super_like);
            }
        } else if (xma.G3() || sja.r3() > 0) {
            c.F1(act, w2b0.c("p_navigation_ilike,card_button_pull", z3 ? 2 : 1));
        } else {
            mo803X8("picks_module_card", act);
        }
        return false;
    }

    @Override // com.p000p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: yk */
    public void mo822yk(Act act) {
        new ukf0(act).m9745a();
    }
}
