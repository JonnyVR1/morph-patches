package com.p046p1.mobile.putong.core.module;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.LikeUser;
import com.p046p1.mobile.putong.core.data.LikedUser;
import com.p046p1.mobile.putong.core.data.PicksTagType;
import com.p046p1.mobile.putong.core.data.PicksUser;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService;
import com.p046p1.mobile.putong.core.module.CoreMemberBusinessServiceImpl;
import com.p046p1.mobile.putong.core.newui.home.C7994d;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.PicksHelper;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.act.PicksAct;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.PicksItemView;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CounterLikeLimit;
import com.p046p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p046p1.mobile.putong.data.LikeExtraData;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveResOperation;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import p147v.VRelative;
import p149l.abi;
import p149l.aeh0;
import p149l.ark;
import p149l.d30;
import p149l.dac0;
import p149l.e30;
import p149l.f30;
import p149l.f5y;
import p149l.kg70;
import p149l.lf90;
import p149l.lsi0;
import p149l.m73;
import p149l.mb90;
import p149l.me70;
import p149l.mkd0;
import p149l.mlr;
import p149l.myc0;
import p149l.nmn;
import p149l.otl;
import p149l.ptl;
import p149l.qer;
import p149l.qtl;
import p149l.r6n;
import p149l.rmp;
import p149l.rxg0;
import p149l.sja;
import p149l.stl;
import p149l.swh0;
import p149l.t100;
import p149l.tz00;
import p149l.u59;
import p149l.ue70;
import p149l.ukf0;
import p149l.upa;
import p149l.ura;
import p149l.vwb;
import p149l.w2b0;
import p149l.x2c0;
import p149l.xma;
import p149l.zar;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
@Route(name = "CoreMemberBusinessService", path = "/member_business_service/service")
public class CoreMemberBusinessServiceImpl implements CoreMemberBusinessService {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.module.CoreMemberBusinessServiceImpl$a */
    public class C7833a implements e30<Relationship> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C7994d f21209a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f21210b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Act f21211c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ User f21212d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f21213e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ue70 f21214f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ String f21215g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ boolean f21216h;

        public C7833a(C7994d c7994d, boolean z, Act act, User user, boolean z2, ue70 ue70Var, String str, boolean z3) {
            this.f21209a = c7994d;
            this.f21210b = z;
            this.f21211c = act;
            this.f21212d = user;
            this.f21213e = z2;
            this.f21214f = ue70Var;
            this.f21215g = str;
            this.f21216h = z3;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Relationship relationship) {
            HomeStatisticsHelper.m36688B(this.f21209a, "success");
            int i = 1;
            if (TEnum.equals(relationship.state, "matched")) {
                if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get(MatchFrom.superLikedEach)) {
                    i = 13;
                } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get(MatchFrom.superLiked)) {
                    i = this.f21210b ? 12 : 11;
                } else if (relationship.status.size() == 0 || relationship.status.get(0) != MatchFrom.get("secretcrush")) {
                    i = 0;
                }
                Act act = this.f21211c;
                act.startActivityWithCustomTransition(MatchAct.m47563e2(act, vwb.m200324f0(relationship.f38806id), i, new ArrayList()), new MatchAct.C8454b());
                CoreModule.f17545c.f19687u0.m30491x7(this.f21212d.f56011id);
            } else if (this.f21213e) {
                this.f21214f.m193232l().notifyDataSetChanged();
                if (this.f21210b) {
                    if (TextUtils.isEmpty(this.f21215g)) {
                        boolean z = this.f21216h;
                        Act act2 = this.f21211c;
                        if (z) {
                            PicksHelper.m56726o(act2, this.f21212d, true);
                            CoreModule.f17545c.f19555C0.m210112u4();
                        } else {
                            rxg0.m181562L(act2);
                        }
                    } else {
                        zar.m217750i(this.f21211c);
                    }
                } else if (this.f21216h) {
                    PicksHelper.m56726o(this.f21211c, this.f21212d, false);
                    CoreModule.f17545c.f19555C0.m210112u4();
                }
            }
            if (ura.m195053e().m195057d().mo33922t() && this.f21216h) {
                CoreModule.f17545c.f19663m0.m31094d9();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m36061J(C7994d c7994d, boolean z, boolean z2, ptl ptlVar, otl otlVar, boolean z3, Relationship relationship) {
        HomeStatisticsHelper.m36688B(c7994d, "success");
        if (TEnum.equals(relationship.state, "matched")) {
            int i = 0;
            if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), MatchFrom.superLikedEach)) {
                i = 13;
            } else if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), MatchFrom.superLiked)) {
                i = z ? 12 : 11;
            } else if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), "secretcrush")) {
                i = 1;
            }
            if (z2) {
                ptlVar.mo56683L(ptlVar.getClickedUser());
            } else {
                otlVar.act().startActivityWithCustomTransition(MatchAct.m47563e2(otlVar.act(), vwb.m200324f0(relationship.f38806id), i, new ArrayList()), new MatchAct.C8454b());
            }
        } else if (z3) {
            lsi0.m151578h(R$string.f18933t4);
        }
        if (TextUtils.equals(ptlVar.getFrom(), "from_meet")) {
            if (z3) {
                f5y.m119547l(ptlVar.getClickedUser().f56011id, relationship.state);
            } else {
                f5y.m119546k(ptlVar.getClickedUser().f56011id);
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m36062K(C7994d c7994d, ue70 ue70Var, Throwable th) {
        HomeStatisticsHelper.m36687A(c7994d, th);
        ue70Var.m193232l().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m36069S(C7994d c7994d, boolean z, Act act, Relationship relationship) {
        HomeStatisticsHelper.m36688B(c7994d, "success");
        if (z) {
            rxg0.m181562L(act);
        }
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m36073X(C7994d c7994d, Boolean bool, Act act, User user, Boolean bool2, Relationship relationship) {
        HomeStatisticsHelper.m36688B(c7994d, "success");
        if (!TEnum.equals(relationship.state, "matched")) {
            if (bool2.booleanValue() && bool.booleanValue()) {
                rxg0.m181562L(act);
                return;
            }
            return;
        }
        int i = 0;
        if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get(MatchFrom.superLikedEach)) {
            i = 13;
        } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get(MatchFrom.superLiked)) {
            i = bool.booleanValue() ? 12 : 11;
        } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get("secretcrush")) {
            i = 1;
        }
        if (CoreModule.f17545c.f19639e0.m169527p9().isFemale()) {
            abi.m95622J(act, user);
        } else {
            act.startActivityWithCustomTransition(MatchAct.m47563e2(act, vwb.m200324f0(relationship.f38806id), i, new ArrayList()), new MatchAct.C8454b());
        }
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m36074Y(C7994d c7994d, boolean z, Act act, boolean z2, String str, Relationship relationship) {
        HomeStatisticsHelper.m36688B(c7994d, "success");
        if (!TEnum.equals(relationship.state, "matched")) {
            if (z2) {
                if (TextUtils.isEmpty(str)) {
                    rxg0.m181562L(act);
                    return;
                } else {
                    lsi0.m151580j(act.getString(R$string.f18229W2));
                    return;
                }
            }
            return;
        }
        int i = 0;
        if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), MatchFrom.superLikedEach)) {
            i = 13;
        } else if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), MatchFrom.superLiked)) {
            i = z ? 12 : 11;
        } else if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), "secretcrush")) {
            i = 1;
        }
        act.startActivityWithCustomTransition(MatchAct.m47563e2(act, vwb.m200324f0(relationship.f38806id), i, new ArrayList()), new MatchAct.C8454b());
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ void m36076a0(PurchaseType purchaseType) {
        CoreModule.f17545c.f19658k1.m184462A3();
        CoreModule.f17545c.f19555C0.m210112u4();
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: An */
    public void mo35969An(User user) {
        if (r6n.m178067f().m178070c(user.f56011id)) {
            r6n.m178067f().m178079n(user);
        }
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Bi */
    public void mo35970Bi(User user) {
        CoreBusinessModule.f17537g.m146315b().f133032c = user;
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Ej */
    public boolean mo35971Ej(boolean z, boolean z2, boolean z3, int i, String str, User user, Act act, String str2, f30<Relationship, Integer> f30Var, d30 d30Var) {
        C7994d c7994dM96104h = aeh0.m96104h(str2, z3, z, z2, user);
        c7994dM96104h.m38483r(HomeStatisticsHelper.ScActionFrom.MEET);
        c7994dM96104h.m38491z(i);
        c7994dM96104h.m38461B(str);
        c7994dM96104h.m38463D("seewholikeme");
        c7994dM96104h.m38465F("relationshipUI:seeWhoLikedMe");
        return aeh0.m96107k(z, z2, z3, c7994dM96104h, user, act, f30Var, d30Var);
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Jb */
    public void mo35972Jb(Act act, int i, Intent intent) {
        if (i == -1) {
            ark.m98433L0(act, (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h));
        }
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Ml, reason: merged with bridge method [inline-methods] */
    public boolean m36088o0(final Act act, final User user, final boolean z, final boolean z2, final boolean z3, final String str, final e30<Relationship> e30Var, final e30<Throwable> e30Var2, final String str2, final LikeExtraData likeExtraData, final String str3, final String str4) {
        return qer.m174243n(act, user, z, z2, z3, str, aeh0.m96105i(act, user, new d30() { // from class: l.uq9
            @Override // p149l.d30
            public final void call() {
                this.f177717a.m36088o0(act, user, z, z2, z3, str, e30Var, e30Var2, str2, likeExtraData, str3, str4);
            }
        }), e30Var, e30Var2, str2, likeExtraData, str3, str4);
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: O6 */
    public void mo35974O6() {
        myc0.m157001d0().m157008j0();
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Pb */
    public boolean mo35975Pb(boolean z, boolean z2, boolean z3, int i, String str, User user, Act act, String str2, f30<Relationship, Integer> f30Var, d30 d30Var) {
        C7994d c7994dM96104h = aeh0.m96104h(str2, z3, z, z2, user);
        c7994dM96104h.m38483r(HomeStatisticsHelper.ScActionFrom.NEARBY);
        c7994dM96104h.m38491z(i);
        c7994dM96104h.m38461B(str);
        c7994dM96104h.m38463D("nearby");
        return aeh0.m96107k(z, z2, z3, c7994dM96104h, user, act, f30Var, d30Var);
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Qd */
    public boolean mo35976Qd(final Act act, boolean z, boolean z2, int i, String str, final String str2, final User user, final LikeUser likeUser, String str3, final e30<LikeUser> e30Var) {
        Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterM31484o3 == null ? null : counterM31484o3.superLikeLimit;
        boolean zEquals = TextUtils.equals(str3, "p_intl_like_i_sent,e_intl_i_like_photo,swipe_like");
        final boolean z3 = !zEquals;
        final C7994d c7994dM38461B = HomeStatisticsHelper.m36700f(!zEquals ? OMSDialogPositon.p_suggest_user_profile_info_view : "p_who_i_liked", z3, z, z2, user).m38491z(i).m38461B(str);
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        c7994dM38461B.m38483r(HomeStatisticsHelper.ScActionFrom.WHO_I_LIKE);
        if (xma.m210071e4() && z2) {
            if (CoreModule.f17545c.f19672p0.m173363k3()) {
                C8764c.m53408L0(act, str3, null, null, null, Privilege.unlimit_free_super_like);
            } else {
                C8764c.m53504x0(act, str3, Privilege.liked_user);
            }
            return false;
        }
        if (userM169527p9.isJailed()) {
            CoreModule.m29932K().startJailedDialogLikeAct();
            HomeStatisticsHelper.m36688B(c7994dM38461B, "failJailedUser");
            return false;
        }
        if (ark.m98421F0(act, new Runnable() { // from class: l.er9
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                act2.startActivityForResult(MediaPickerAct.m47783d2(act2, 1, false, false, true, null), PutongAct.REQUEST_CODE_PICKER);
            }
        })) {
            HomeStatisticsHelper.m36688B(c7994dM38461B, "failFakeUser");
            return false;
        }
        if (userM169527p9.isNameFake()) {
            HomeStatisticsHelper.m36688B(c7994dM38461B, "failFakeUser");
            ark.m98449T0(act);
            return false;
        }
        if ((z || z2) && counterM31484o3 == null) {
            HomeStatisticsHelper.m36688B(c7994dM38461B, "failDataError");
            return false;
        }
        if (z2 && u59.m191811T()) {
            nmn.m160123g(act, new nmn.C18733a(user.f56011id, ""), "");
            return false;
        }
        if (z2 && swh0.m186193G1(act, new d30() { // from class: l.fr9
            @Override // p149l.d30
            public final void call() {
                this.f98899a.m36083h0(c7994dM38461B, act, z3, str2, user, likeUser, e30Var);
            }
        })) {
            c7994dM38461B = c7994dM38461B;
            return false;
        }
        if (!z2 || swh0.m186273w0(counterSuperlikeAndUndoLimit.remainToday()) != 0) {
            m36078c0(act, z, z2, z3, c7994dM38461B, str2, user, likeUser, e30Var);
            return true;
        }
        C8764c.m53391F1(act, str3);
        HomeStatisticsHelper.m36688B(c7994dM38461B, "failExhaustSuperlike");
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Qe */
    public void mo35977Qe(Act act, BoostViewContainer boostViewContainer) {
        m73.m153328h(act, boostViewContainer, null);
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Ra */
    public void mo35978Ra(@NonNull VRelative vRelative, @Nullable Act act, @NonNull String str, final PicksItemView picksItemView) {
        lf90 lf90Var = new lf90(picksItemView, new e30() { // from class: l.tq9
            @Override // p149l.e30
            public final void call(Object obj) {
                xdl0.m208345M0(picksItemView._personal_info, ((Boolean) obj).booleanValue());
            }
        });
        if (upa.m194665L3()) {
            act.startActivityForResult(ProfileAct.m50736n2(act, str, "from_picks", true), 24);
        } else {
            act.startActivityForResultWithCustomTransition(ProfileAct.m50736n2(act, str, "from_picks", true), 24, lf90Var);
        }
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Ss */
    public void mo35979Ss(mlr mlrVar) {
        mlrVar.f134493h.setImageResource(x2c0.f190120er);
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: X8 */
    public void mo35980X8(@NonNull String str, Act act) {
        C8764c.m53491s1(act, str, new e30() { // from class: l.xq9
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreMemberBusinessServiceImpl.m36076a0((PurchaseType) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Yq */
    public void mo35981Yq(int i, Intent intent, Act act) {
        if (i == -1) {
            ark.m98433L0(act, (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h));
        }
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: a9 */
    public Intent mo35982a9(Context context) {
        return new Intent(context, (Class<?>) PicksAct.class);
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: be */
    public boolean mo35983be(final Act act, final stl stlVar, final boolean z, final boolean z2, final boolean z3, int i, String str, final String str2, final User user, final LikedUser likedUser) {
        final boolean z4;
        Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterM31484o3 == null ? null : counterM31484o3.superLikeLimit;
        final C7994d c7994dM38461B = HomeStatisticsHelper.m36700f(z3 ? OMSDialogPositon.p_suggest_user_profile_info_view : "p_who_i_liked", z3, z, z2, user).m38491z(i).m38461B(str);
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        c7994dM38461B.m38483r(HomeStatisticsHelper.ScActionFrom.WHO_I_LIKE);
        if (userM169527p9.isJailed()) {
            CoreModule.m29932K().startJailedDialogLikeAct();
            stlVar.notifyDataSetChanged();
            HomeStatisticsHelper.m36688B(c7994dM38461B, "failJailedUser");
            return false;
        }
        if (userM169527p9.isNameFake()) {
            HomeStatisticsHelper.m36688B(c7994dM38461B, "failFakeUser");
            ark.m98449T0(act);
            return false;
        }
        if (xma.m210071e4() && z2) {
            C8764c.m53504x0(act, stlVar.mo46779G2(z3), Privilege.liked_user);
            return false;
        }
        if ((z || z2) && counterM31484o3 == null) {
            HomeStatisticsHelper.m36688B(c7994dM38461B, "failDataError");
            return false;
        }
        if (z2 && !TextUtils.isEmpty(str2) && !xma.m210041D3() && swh0.m186191G() && swh0.m186255p0().m186311e1()) {
            PurchaseType purchaseType = PurchaseType.TYPE_GET_LETTER;
            d30 d30Var = new d30() { // from class: l.zq9
                @Override // p149l.d30
                public final void call() {
                    this.f204354a.m36084k0(act, stlVar, z, z2, z3, c7994dM38461B, str2, user, likedUser);
                }
            };
            Objects.requireNonNull(stlVar);
            swh0.m186180B1(act, purchaseType, d30Var, new d30() { // from class: l.ar9
                @Override // p149l.d30
                public final void call() {
                    stlVar.mo46786Z0();
                }
            });
            return false;
        }
        final C7994d c7994d = c7994dM38461B;
        if (z2 && TextUtils.isEmpty(str2)) {
            z4 = z3;
            if (swh0.m186193G1(act, new d30() { // from class: l.br9
                @Override // p149l.d30
                public final void call() {
                    this.f76883a.m36085l0(c7994d, act, stlVar, z4, str2, user, likedUser);
                }
            })) {
                c7994d = c7994d;
                return false;
            }
        } else {
            z4 = z3;
        }
        if (!z2 || !TextUtils.isEmpty(str2) || swh0.m186273w0(counterSuperlikeAndUndoLimit.remainToday()) != 0) {
            m36079d0(act, stlVar, z, z2, z4, c7994d, str2, user, likedUser);
            return true;
        }
        C8764c.m53391F1(act, stlVar.mo46779G2(z4));
        HomeStatisticsHelper.m36688B(c7994d, "failExhaustSuperlike");
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: bj */
    public int mo35984bj() {
        return 24;
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: bo */
    public String mo35985bo() {
        return "currentImageIndex";
    }

    /* JADX INFO: renamed from: c0 */
    public final void m36078c0(final Act act, boolean z, final boolean z2, boolean z3, final C7994d c7994d, String str, User user, LikeUser likeUser, e30<LikeUser> e30Var) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c7994d.m38471f().getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(likeUser.userId).pageId(c7994d.m38473h()).build();
        act.duringCreated(CoreModule.f17545c.f19663m0.m31065W7(z, z2, null, user, str, LikeFrom.get("myLiked"), true, likeExtraDataNew_)).subscribe(mkd0.m154956H(new e30() { // from class: l.vq9
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreMemberBusinessServiceImpl.m36069S(c7994d, z2, act, (Relationship) obj);
            }
        }, new e30() { // from class: l.wq9
            @Override // p149l.e30
            public final void call(Object obj) {
                HomeStatisticsHelper.m36687A(c7994d, (Throwable) obj);
            }
        }));
        if (e30Var != null) {
            e30Var.call(likeUser);
        }
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: cb */
    public boolean mo35986cb(final Act act, final Boolean bool, final Boolean bool2, final Boolean bool3, final User user) {
        final C7994d c7994dM36699e = HomeStatisticsHelper.m36699e(act.pageId(), bool3.booleanValue(), bool.booleanValue(), bool2.booleanValue(), user);
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (!NullChecker.m81303a(userM169527p9)) {
            return false;
        }
        c7994dM36699e.f22979h = HomeStatisticsHelper.ScActionFrom.INTL_VISITOR;
        CounterLikeLimit counterLikeLimit = CoreModule.f17545c.m31484o3().likeLimit;
        if (userM169527p9.isJailed()) {
            CoreModule.m29932K().startJailedDialogLikeAct();
            HomeStatisticsHelper.m36688B(c7994dM36699e, "failJailedUser");
            return false;
        }
        if (userM169527p9.isNameFake()) {
            HomeStatisticsHelper.m36688B(c7994dM36699e, "failFakeUser");
            ark.m98449T0(act);
            return false;
        }
        if (!xma.m210047L3()) {
            rmp.INSTANCE.m180041o(act, "p_intl_visitors_list,e_intl_visitors_list_check_btn,check", null);
            return false;
        }
        if (bool.booleanValue() && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !mb90.m153866b(PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
            rmp.INSTANCE.m180041o(act, "p_intl_visitors_list,e_intl_visitors_list_check_btn,check", null);
            return false;
        }
        if (!bool2.booleanValue() || swh0.m186276x0() > 0) {
            if (bool2.booleanValue() && swh0.m186193G1(act, new d30() { // from class: l.yq9
                @Override // p149l.d30
                public final void call() {
                    this.f199532a.m36086m0(c7994dM36699e, act, bool, bool2, bool3, user);
                }
            })) {
                return false;
            }
            m36080e0(act, bool, bool2, bool3, c7994dM36699e, user);
            return true;
        }
        if (xma.m210047L3()) {
            C8764c.m53391F1(act, bool3.booleanValue() ? "p_who_i_liked,e_iliked_superlike,click" : "p_who_i_liked,e_card,swipe_like");
            HomeStatisticsHelper.m36688B(c7994dM36699e, "failExhaustSuperlike");
        } else {
            rmp.INSTANCE.m180041o(act, "p_intl_visitors_list,e_intl_visitors_list_check_btn,check", null);
        }
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: ch */
    public String mo35987ch() {
        return "currentImageUrl";
    }

    /* JADX INFO: renamed from: d0 */
    public final void m36079d0(final Act act, stl stlVar, final boolean z, final boolean z2, boolean z3, final C7994d c7994d, final String str, User user, LikedUser likedUser) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c7994d.m38471f().getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(likedUser.f20432id).pageId(c7994d.m38473h()).build();
        stlVar.duringCreated(CoreModule.f17545c.f19663m0.m31065W7(z, z2, null, user, str, LikeFrom.get("myLiked"), true, likeExtraDataNew_)).subscribe(mkd0.m154956H(new e30() { // from class: l.rq9
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreMemberBusinessServiceImpl.m36074Y(c7994d, z2, act, z, str, (Relationship) obj);
            }
        }, new e30() { // from class: l.sq9
            @Override // p149l.e30
            public final void call(Object obj) {
                HomeStatisticsHelper.m36687A(c7994d, (Throwable) obj);
            }
        }));
        stlVar.mo46788w0(z2, str, likedUser);
    }

    /* JADX INFO: renamed from: e0 */
    public void m36080e0(final Act act, final Boolean bool, final Boolean bool2, Boolean bool3, final C7994d c7994d, final User user) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c7994d.f22979h.getFrom()).isLike(bool.booleanValue()).isFromButton(bool3.booleanValue()).isSuperLiked(bool2.booleanValue()).user(user.f56011id).pageId(c7994d.m38473h()).build();
        act.duringCreated(CoreModule.f17545c.f19663m0.m31073Y7(bool.booleanValue(), bool2.booleanValue(), null, user, null, LikeFrom.get(LikeFrom.intl_visitor), true, likeExtraDataNew_, 0, null)).subscribe(mkd0.m154956H(new e30() { // from class: l.pq9
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreMemberBusinessServiceImpl.m36073X(c7994d, bool2, act, user, bool, (Relationship) obj);
            }
        }, new e30() { // from class: l.qq9
            @Override // p149l.e30
            public final void call(Object obj) {
                HomeStatisticsHelper.m36687A(c7994d, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f0 */
    public final void m36081f0(boolean z, boolean z2, boolean z3, final C7994d c7994d, User user, String str, PicksUser picksUser, Act act, final ue70 ue70Var, me70 me70Var) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c7994d.f22979h.getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(picksUser.f20468id).pageId(c7994d.m38473h()).build();
        act.duringCreated(CoreModule.f17545c.f19663m0.m31073Y7(z, z2, null, user, str, LikeFrom.get("picks"), true, likeExtraDataNew_, 0, picksUser.picksTracker)).subscribe(mkd0.m154956H(new C7833a(c7994d, z2, act, user, z, ue70Var, str, !xma.m210044G3() && sja.m184461r3() > 0), new e30() { // from class: l.mq9
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreMemberBusinessServiceImpl.m36062K(c7994d, ue70Var, (Throwable) obj);
            }
        }));
        m36089r0(picksUser, ue70Var, me70Var);
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: fe */
    public boolean mo35988fe(boolean z, boolean z2, final boolean z3, final boolean z4, int i, String str, final ptl ptlVar, final qtl qtlVar, final otl otlVar) {
        Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
        CounterLikeLimit counterLikeLimit = counterM31484o3 == null ? null : counterM31484o3.likeLimit;
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterM31484o3 != null ? counterM31484o3.superLikeLimit : null;
        final C7994d c7994dM38461B = HomeStatisticsHelper.m36700f(z3 ? OMSDialogPositon.p_suggest_user_profile_info_view : "p_see_who_likes_me_view", z3, z, z2, ptlVar.getClickedUser()).m38491z(i).m38461B(str);
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9.isJailed()) {
            CoreModule.m29932K().startJailedDialogLikeAct();
            otlVar.notifyDataSetChanged();
            HomeStatisticsHelper.m36688B(c7994dM38461B, "failJailedUser");
            return false;
        }
        if (ark.m98421F0(otlVar.act(), new Runnable() { // from class: l.cr9
            @Override // java.lang.Runnable
            public final void run() {
                otl otlVar2 = otlVar;
                otlVar2.act().startActivityForResult(MediaPickerAct.m47783d2(otlVar2.act(), 1, false, false, true, null), PutongAct.REQUEST_CODE_PICKER);
            }
        })) {
            HomeStatisticsHelper.m36688B(c7994dM38461B, "failFakeUser");
            if (NullChecker.m81303a(ptlVar.getClickedItem())) {
                ptlVar.getClickedItem().setClickable(true);
            }
            return false;
        }
        if (NullChecker.m81303a(userM169527p9) && userM169527p9.isNameFake()) {
            HomeStatisticsHelper.m36688B(c7994dM38461B, "failFakeUser");
            ark.m98449T0(otlVar.act());
            return false;
        }
        if ((z || z2) && counterM31484o3 == null) {
            HomeStatisticsHelper.m36688B(c7994dM38461B, "failDataError");
            return false;
        }
        if (z && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !mb90.m153867c(userM169527p9, PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
            C8764c.m53412M1(otlVar.act(), "p_home,likelimit", Privilege.vip_unlimited_likes, null, null, false, ptlVar.getClickedUser());
            if (NullChecker.m81303a(ptlVar.getClickedItem())) {
                ptlVar.getClickedItem().setClickable(true);
            }
            HomeStatisticsHelper.m36688B(c7994dM38461B, "failExhaustSwipe");
            return false;
        }
        if (z2 && swh0.m186193G1(otlVar.act(), new d30() { // from class: l.dr9
            @Override // p149l.d30
            public final void call() {
                this.f87593a.m36087n0(c7994dM38461B, z3, z4, ptlVar, qtlVar, otlVar);
            }
        })) {
            if (NullChecker.m81303a(ptlVar.getClickedItem())) {
                ptlVar.getClickedItem().setClickable(true);
            }
            HomeStatisticsHelper.m36688B(c7994dM38461B, "tantanCoin");
            return false;
        }
        if (!z2 || swh0.m186273w0(counterSuperlikeAndUndoLimit.remainToday()) != 0) {
            m36082g0(z, z2, z3, z4, c7994dM38461B, ptlVar, qtlVar, otlVar);
            return true;
        }
        if (mb90.m153866b(PurchaseType.TYPE_SUPERLIKE_PKG) || u59.m191818a0()) {
            C8764c.m53391F1(otlVar.act(), "p_see_who_likes_me_view,e_superlike,click");
            HomeStatisticsHelper.m36688B(c7994dM38461B, "failExhaustSuperlike");
        } else {
            C8764c.m53412M1(otlVar.act(), "p_see_who_likes_me_view,e_superlike,click", Privilege.vip_super_like, null, null, false, ptlVar.getClickedUser());
            HomeStatisticsHelper.m36688B(c7994dM38461B, "failLessVipSuperLike");
        }
        if (NullChecker.m81303a(ptlVar.getClickedItem())) {
            ptlVar.getClickedItem().setClickable(true);
        }
        return false;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m36082g0(final boolean z, final boolean z2, boolean z3, final boolean z4, final C7994d c7994d, final ptl ptlVar, qtl qtlVar, final otl otlVar) {
        String strMo56687P;
        HashMap map = new HashMap();
        map.put("X-Testing-Variance", "relationshipUI:seeWhoLikedMe");
        map.put("sourcepage", "seewholikeme");
        map.put("actiontype", z3 ? "click" : "swipe");
        c7994d.m38470e(map);
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c7994d.m38471f().getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(ptlVar.getClickedUser()).pageId(c7994d.m38473h()).build();
        otlVar.duringCreated(CoreModule.f17545c.f19663m0.m31057U7(z, z2, map, ptlVar.getClickedUser(), likeExtraDataNew_, LikeFrom.get("likers"))).subscribe(mkd0.m154956H(new e30() { // from class: l.nq9
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreMemberBusinessServiceImpl.m36061J(c7994d, z2, z4, ptlVar, otlVar, z, (Relationship) obj);
            }
        }, new e30() { // from class: l.oq9
            @Override // p149l.e30
            public final void call(Object obj) {
                HomeStatisticsHelper.m36687A(c7994d, (Throwable) obj);
            }
        }));
        if (otlVar.mo56574A1(ptlVar.getClickedUser(), z)) {
            ptlVar.mo56681J(ptlVar.getSeeCount() - 1);
            if (ptlVar.getSeeCount() <= 0) {
                qtlVar.mo154901a(false, otlVar.mo56577O2() <= 1);
            }
            strMo56687P = ptlVar.mo56687P(ptlVar.getSeeCount());
        } else {
            strMo56687P = ptlVar.mo56687P(ptlVar.getSeeCount());
        }
        qtlVar.setTitle(strMo56687P);
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: ge */
    public boolean mo35989ge(@NonNull Act act) {
        return act instanceof PicksAct;
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m36083h0(C7994d c7994d, Act act, boolean z, String str, User user, LikeUser likeUser, e30 e30Var) {
        c7994d.m38481p();
        m36078c0(act, true, true, z, c7994d, str, user, likeUser, e30Var);
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: k */
    public boolean mo35990k() {
        return false;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m36084k0(Act act, stl stlVar, boolean z, boolean z2, boolean z3, C7994d c7994d, String str, User user, LikedUser likedUser) {
        swh0.m186255p0().m186301U0();
        m36079d0(act, stlVar, z, z2, z3, c7994d, str, user, likedUser);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m36085l0(C7994d c7994d, Act act, stl stlVar, boolean z, String str, User user, LikedUser likedUser) {
        c7994d.m38481p();
        m36079d0(act, stlVar, true, true, z, c7994d, str, user, likedUser);
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: l1 */
    public void mo35991l1(Act act, String str) {
        CoreModule.m29935P().m94651a().mo33534l1(act, str);
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: lm */
    public void mo35992lm(Act act, User user, String str, boolean z, Runnable runnable, Runnable runnable2, String str2) {
        tz00.m191128j(act, user, str, z, runnable, runnable2, str2);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m36086m0(C7994d c7994d, Act act, Boolean bool, Boolean bool2, Boolean bool3, User user) {
        c7994d.m38481p();
        m36080e0(act, bool, bool2, bool3, c7994d, user);
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: m6 */
    public void mo35993m6(mlr mlrVar) {
        mlrVar.f134495j.setBackgroundColor(-1);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m36087n0(C7994d c7994d, boolean z, boolean z2, ptl ptlVar, qtl qtlVar, otl otlVar) {
        c7994d.m38481p();
        m36082g0(true, true, z, z2, c7994d, ptlVar, qtlVar, otlVar);
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: n9 */
    public void mo35994n9(mlr mlrVar) {
        mlrVar.f134491f.setTextColor(-1725882079);
        mlrVar.f134491f.setTextSize(2, 16.0f);
        ViewGroup.LayoutParams layoutParams = mlrVar.f134493h.getLayoutParams();
        int i = t100.f167261j;
        layoutParams.width = i;
        layoutParams.height = i;
        mlrVar.f134493h.setLayoutParams(layoutParams);
        mlrVar.f134493h.setImageResource(x2c0.f190120er);
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: on */
    public boolean mo35995on(boolean z, boolean z2, boolean z3, int i, @NonNull String str, @NonNull User user, String str2, @NonNull Frag frag, @NonNull PicksUser picksUser, @Nullable String str3, @NonNull dac0 dac0Var, @NonNull e30<String> e30Var, @NonNull d30 d30Var) {
        return kg70.INSTANCE.m145885f(z, z2, z3, i, str, user, str2, frag, picksUser, str3, dac0Var, e30Var, d30Var);
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: pc */
    public String mo35996pc() {
        return "heart_confession_content";
    }

    /* JADX INFO: renamed from: r0 */
    public final void m36089r0(PicksUser picksUser, ue70 ue70Var, me70 me70Var) {
        if (ue70Var.m193232l().m214490M(picksUser)) {
            CoreModule.f17545c.f19658k1.m184469I3(picksUser.f20468id);
            me70Var.m154162r0(me70Var.getSwipeCount() + 1);
        }
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: tq */
    public boolean mo35997tq(Act act, User user, boolean z, boolean z2, boolean z3, String str, e30<Relationship> e30Var, e30<Throwable> e30Var2, String str2, LikeExtraData likeExtraData, String str3, String str4) {
        return qer.m174243n(act, user, z, z2, z3, str, null, e30Var, e30Var2, str2, likeExtraData, str3, str4);
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: vk */
    public boolean mo35998vk(boolean z, boolean z2, boolean z3, int i, @NonNull String str, @NonNull User user, @Nullable String str2, @Nullable Act act, ue70 ue70Var, @NonNull PicksUser picksUser, me70 me70Var) {
        zvf0.m220401w("e_picks_module_card", act.pageId(), vwb.m200311Y("picks_card_type", TEnum.equals(picksUser.picksTagType, PicksTagType.masking) ? "grayed" : BLiveResOperation.clear), vwb.m200311Y("other_user_id", user.f56011id), vwb.m200311Y("direction", z ? "like" : "dislike"));
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        C7994d c7994dM38461B = HomeStatisticsHelper.m36699e(act.pageId(), z3, z, z2, user).m38491z(i).m38461B(str);
        c7994dM38461B.f22979h = HomeStatisticsHelper.ScActionFrom.PICKS;
        if (userM169527p9.isJailed()) {
            ue70Var.m193232l().notifyDataSetChanged();
            CoreModule.m29932K().startJailedDialogLikeAct();
            HomeStatisticsHelper.m36688B(c7994dM38461B, "failJailedUser");
            return false;
        }
        if (userM169527p9.isNameFake()) {
            HomeStatisticsHelper.m36688B(c7994dM38461B, "failFakeUser");
            ark.m98449T0(act);
            return false;
        }
        if (me70Var.getSwipeCount() >= 4 || ue70Var.m193232l().m214489L() <= 4) {
            act.startActivity(new Intent(act, (Class<?>) PicksAct.class));
            ue70Var.m193231k();
            return false;
        }
        if (TEnum.equals(picksUser.picksTagType, PicksTagType.masking)) {
            mo35980X8("picks_module_card", act);
            ue70Var.m193232l().notifyDataSetChanged();
            return false;
        }
        if (!z && !xma.m210044G3()) {
            ue70Var.m193232l().notifyDataSetChanged();
            return false;
        }
        if (!xma.m210044G3() && sja.m184461r3() <= 0) {
            mo35980X8("picks_module_card", act);
            ue70Var.m193232l().notifyDataSetChanged();
            return false;
        }
        CounterLikeLimit counterLikeLimit = CoreModule.f17545c.m31484o3().likeLimit;
        if (z && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !mb90.m153867c(userM169527p9, PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
            CoreModule.m29935P().m94651a().mo33565pr(act, z3 ? "picks_module_card" : "", Privilege.vip_unlimited_likes);
            return false;
        }
        if (!z2 || !TextUtils.isEmpty(str2) || swh0.m186276x0() > 0) {
            m36081f0(z, z2, z3, c7994dM38461B, user, str2, picksUser, act, ue70Var, me70Var);
            return true;
        }
        if (xma.m210071e4()) {
            if (!xma.m210044G3() && sja.m184461r3() <= 0) {
                mo35980X8("picks_module_card", act);
            } else if (mb90.m153867c(userM169527p9, PurchaseType.TYPE_SUPERLIKE_PKG) || u59.m191818a0()) {
                C8764c.m53391F1(act, w2b0.m201089c("p_navigation_ilike,card_button_pull", z3 ? 2 : 1));
            } else {
                CoreModule.m29935P().m94651a().mo33565pr(act, "e_picks_card_superlike", Privilege.vip_super_like);
            }
        } else if (xma.m210044G3() || sja.m184461r3() > 0) {
            C8764c.m53391F1(act, w2b0.m201089c("p_navigation_ilike,card_button_pull", z3 ? 2 : 1));
        } else {
            mo35980X8("picks_module_card", act);
        }
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: yk */
    public void mo35999yk(Act act) {
        new ukf0(act).m194154a();
    }
}
