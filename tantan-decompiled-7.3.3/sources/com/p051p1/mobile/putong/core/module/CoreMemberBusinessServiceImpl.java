package com.p051p1.mobile.putong.core.module;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.LikeUser;
import com.p051p1.mobile.putong.core.data.LikedUser;
import com.p051p1.mobile.putong.core.data.PicksTagType;
import com.p051p1.mobile.putong.core.data.PicksUser;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService;
import com.p051p1.mobile.putong.core.module.CoreMemberBusinessServiceImpl;
import com.p051p1.mobile.putong.core.newui.home.C8145d;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.PicksHelper;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.act.PicksAct;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.view.PicksItemView;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CounterLikeLimit;
import com.p051p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p051p1.mobile.putong.data.LikeExtraData;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveResOperation;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import p151v.VRelative;
import p153l.a5i0;
import p153l.abb0;
import p153l.an70;
import p153l.b83;
import p153l.bdr;
import p153l.cey;
import p153l.cwl;
import p153l.d79;
import p153l.d810;
import p153l.dbc0;
import p153l.dtf0;
import p153l.dwl;
import p153l.ela;
import p153l.ewl;
import p153l.gra;
import p153l.gta;
import p153l.gwl;
import p153l.i4g0;
import p153l.imh0;
import p153l.jic0;
import p153l.joa;
import p153l.jyb;
import p153l.nnr;
import p153l.non;
import p153l.o1j0;
import p153l.p6d0;
import p153l.pci;
import p153l.pn90;
import p153l.psd0;
import p153l.qa00;
import p153l.qj90;
import p153l.qo70;
import p153l.qtk;
import p153l.r8n;
import p153l.rgr;
import p153l.rop;
import p153l.sm70;
import p153l.x20;
import p153l.y20;
import p153l.z20;
import p153l.z5h0;

/* JADX INFO: loaded from: classes10.dex */
@Route(name = "CoreMemberBusinessService", path = "/member_business_service/service")
public class CoreMemberBusinessServiceImpl implements CoreMemberBusinessService {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.module.CoreMemberBusinessServiceImpl$a */
    public class C7984a implements y20<Relationship> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8145d f21951a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f21952b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Act f21953c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ User f21954d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f21955e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ an70 f21956f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ String f21957g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ boolean f21958h;

        public C7984a(C8145d c8145d, boolean z, Act act, User user, boolean z2, an70 an70Var, String str, boolean z3) {
            this.f21951a = c8145d;
            this.f21952b = z;
            this.f21953c = act;
            this.f21954d = user;
            this.f21955e = z2;
            this.f21956f = an70Var;
            this.f21957g = str;
            this.f21958h = z3;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Relationship relationship) {
            HomeStatisticsHelper.m37691B(this.f21951a, "success");
            int i = 1;
            if (TEnum.equals(relationship.state, "matched")) {
                if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get(MatchFrom.superLikedEach)) {
                    i = 13;
                } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get(MatchFrom.superLiked)) {
                    i = this.f21952b ? 12 : 11;
                } else if (relationship.status.size() == 0 || relationship.status.get(0) != MatchFrom.get("secretcrush")) {
                    i = 0;
                }
                Act act = this.f21953c;
                act.startActivityWithCustomTransition(MatchAct.m48746g2(act, jyb.m147507f0(relationship.f39654id), i, new ArrayList()), new MatchAct.C8617b());
                CoreModule.f18264c.f20429u0.m31383C7(this.f21954d.f56859id);
            } else if (this.f21955e) {
                this.f21956f.m98945l().notifyDataSetChanged();
                if (this.f21952b) {
                    if (TextUtils.isEmpty(this.f21957g)) {
                        boolean z = this.f21958h;
                        Act act2 = this.f21953c;
                        if (z) {
                            PicksHelper.m57909o(act2, this.f21954d, true);
                            CoreModule.f18264c.f20297C0.m146425v4();
                        } else {
                            z5h0.m218665L(act2);
                        }
                    } else {
                        bdr.m103631i(this.f21953c);
                    }
                } else if (this.f21958h) {
                    PicksHelper.m57909o(this.f21953c, this.f21954d, false);
                    CoreModule.f18264c.f20297C0.m146425v4();
                }
            }
            if (gta.m132210e().m132214d().mo34925t() && this.f21958h) {
                CoreModule.f18264c.f20405m0.m32097d9();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m37064J(C8145d c8145d, boolean z, boolean z2, dwl dwlVar, cwl cwlVar, boolean z3, Relationship relationship) {
        HomeStatisticsHelper.m37691B(c8145d, "success");
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
                dwlVar.mo57866L(dwlVar.getClickedUser());
            } else {
                cwlVar.act().startActivityWithCustomTransition(MatchAct.m48746g2(cwlVar.act(), jyb.m147507f0(relationship.f39654id), i, new ArrayList()), new MatchAct.C8617b());
            }
        } else if (z3) {
            o1j0.m165634h(R$string.f19729v4);
        }
        if (TextUtils.equals(dwlVar.getFrom(), "from_meet")) {
            if (z3) {
                cey.m109477l(dwlVar.getClickedUser().f56859id, relationship.state);
            } else {
                cey.m109476k(dwlVar.getClickedUser().f56859id);
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m37065K(C8145d c8145d, an70 an70Var, Throwable th) {
        HomeStatisticsHelper.m37690A(c8145d, th);
        an70Var.m98945l().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m37072S(C8145d c8145d, boolean z, Act act, Relationship relationship) {
        HomeStatisticsHelper.m37691B(c8145d, "success");
        if (z) {
            z5h0.m218665L(act);
        }
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m37076X(C8145d c8145d, Boolean bool, Act act, User user, Boolean bool2, Relationship relationship) {
        HomeStatisticsHelper.m37691B(c8145d, "success");
        if (!TEnum.equals(relationship.state, "matched")) {
            if (bool2.booleanValue() && bool.booleanValue()) {
                z5h0.m218665L(act);
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
        if (CoreModule.f18264c.f20381e0.m116600p9().isFemale()) {
            pci.m171661J(act, user);
        } else {
            act.startActivityWithCustomTransition(MatchAct.m48746g2(act, jyb.m147507f0(relationship.f39654id), i, new ArrayList()), new MatchAct.C8617b());
        }
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m37077Y(C8145d c8145d, boolean z, Act act, boolean z2, String str, Relationship relationship) {
        HomeStatisticsHelper.m37691B(c8145d, "success");
        if (!TEnum.equals(relationship.state, "matched")) {
            if (z2) {
                if (TextUtils.isEmpty(str)) {
                    z5h0.m218665L(act);
                    return;
                } else {
                    o1j0.m165636j(act.getString(R$string.f19019Y2));
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
        act.startActivityWithCustomTransition(MatchAct.m48746g2(act, jyb.m147507f0(relationship.f39654id), i, new ArrayList()), new MatchAct.C8617b());
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ void m37079a0(PurchaseType purchaseType) {
        CoreModule.f18264c.f20400k1.m121123A3();
        CoreModule.f18264c.f20297C0.m146425v4();
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: An */
    public void mo36972An(User user) {
        if (r8n.m180219f().m180222c(user.f56859id)) {
            r8n.m180219f().m180231n(user);
        }
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Bi */
    public void mo36973Bi(User user) {
        CoreBusinessModule.f18256g.m191629b().f169297c = user;
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Ej */
    public boolean mo36974Ej(boolean z, boolean z2, boolean z3, int i, String str, User user, Act act, String str2, z20<Relationship, Integer> z20Var, x20 x20Var) {
        C8145d c8145dM140930h = imh0.m140930h(str2, z3, z, z2, user);
        c8145dM140930h.m39486r(HomeStatisticsHelper.ScActionFrom.MEET);
        c8145dM140930h.m39494z(i);
        c8145dM140930h.m39464B(str);
        c8145dM140930h.m39466D("seewholikeme");
        c8145dM140930h.m39468F("relationshipUI:seeWhoLikedMe");
        return imh0.m140933k(z, z2, z3, c8145dM140930h, user, act, z20Var, x20Var);
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Jb */
    public void mo36975Jb(Act act, int i, Intent intent) {
        if (i == -1) {
            qtk.m177983L0(act, (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h));
        }
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Ml, reason: merged with bridge method [inline-methods] */
    public boolean m37091o0(final Act act, final User user, final boolean z, final boolean z2, final boolean z3, final String str, final y20<Relationship> y20Var, final y20<Throwable> y20Var2, final String str2, final LikeExtraData likeExtraData, final String str3, final String str4) {
        return rgr.m181477n(act, user, z, z2, z3, str, imh0.m140931i(act, user, new x20() { // from class: l.fs9
            @Override // p153l.x20
            public final void call() {
                this.f100555a.m37091o0(act, user, z, z2, z3, str, y20Var, y20Var2, str2, likeExtraData, str3, str4);
            }
        }), y20Var, y20Var2, str2, likeExtraData, str3, str4);
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: O6 */
    public void mo36977O6() {
        p6d0.m170847d0().m170854j0();
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Pb */
    public boolean mo36978Pb(boolean z, boolean z2, boolean z3, int i, String str, User user, Act act, String str2, z20<Relationship, Integer> z20Var, x20 x20Var) {
        C8145d c8145dM140930h = imh0.m140930h(str2, z3, z, z2, user);
        c8145dM140930h.m39486r(HomeStatisticsHelper.ScActionFrom.NEARBY);
        c8145dM140930h.m39494z(i);
        c8145dM140930h.m39464B(str);
        c8145dM140930h.m39466D("nearby");
        return imh0.m140933k(z, z2, z3, c8145dM140930h, user, act, z20Var, x20Var);
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Qd */
    public boolean mo36979Qd(final Act act, boolean z, boolean z2, int i, String str, final String str2, final User user, final LikeUser likeUser, String str3, final y20<LikeUser> y20Var) {
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterM32487o3 == null ? null : counterM32487o3.superLikeLimit;
        boolean zEquals = TextUtils.equals(str3, "p_intl_like_i_sent,e_intl_i_like_photo,swipe_like");
        final boolean z3 = !zEquals;
        final C8145d c8145dM39464B = HomeStatisticsHelper.m37703f(!zEquals ? OMSDialogPositon.p_suggest_user_profile_info_view : "p_who_i_liked", z3, z, z2, user).m39494z(i).m39464B(str);
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        c8145dM39464B.m39486r(HomeStatisticsHelper.ScActionFrom.WHO_I_LIKE);
        if (joa.m146386f4() && z2) {
            if (CoreModule.f18264c.f20414p0.m219066k3()) {
                C8927c.m54591L0(act, str3, null, null, null, Privilege.unlimit_free_super_like);
            } else {
                C8927c.m54687x0(act, str3, Privilege.liked_user);
            }
            return false;
        }
        if (userM116600p9.isJailed()) {
            CoreModule.m30930K().startJailedDialogLikeAct();
            HomeStatisticsHelper.m37691B(c8145dM39464B, "failJailedUser");
            return false;
        }
        if (qtk.m177971F0(act, new Runnable() { // from class: l.ps9
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                act2.startActivityForResult(MediaPickerAct.m48966e2(act2, 1, false, false, true, null), PutongAct.REQUEST_CODE_PICKER);
            }
        })) {
            HomeStatisticsHelper.m37691B(c8145dM39464B, "failFakeUser");
            return false;
        }
        if (userM116600p9.isNameFake()) {
            HomeStatisticsHelper.m37691B(c8145dM39464B, "failFakeUser");
            qtk.m177999T0(act);
            return false;
        }
        if ((z || z2) && counterM32487o3 == null) {
            HomeStatisticsHelper.m37691B(c8145dM39464B, "failDataError");
            return false;
        }
        if (z2 && d79.m114662U()) {
            non.m164145g(act, new non.C18915a(user.f56859id, ""), "");
            return false;
        }
        if (z2 && a5i0.m96098G1(act, new x20() { // from class: l.qs9
            @Override // p153l.x20
            public final void call() {
                this.f159258a.m37086h0(c8145dM39464B, act, z3, str2, user, likeUser, y20Var);
            }
        })) {
            c8145dM39464B = c8145dM39464B;
            return false;
        }
        if (!z2 || a5i0.m96178w0(counterSuperlikeAndUndoLimit.remainToday()) != 0) {
            m37081c0(act, z, z2, z3, c8145dM39464B, str2, user, likeUser, y20Var);
            return true;
        }
        C8927c.m54574F1(act, str3);
        HomeStatisticsHelper.m37691B(c8145dM39464B, "failExhaustSuperlike");
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Qe */
    public void mo36980Qe(Act act, BoostViewContainer boostViewContainer) {
        b83.m102906h(act, boostViewContainer, null);
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Ra */
    public void mo36981Ra(@NonNull VRelative vRelative, @Nullable Act act, @NonNull String str, final PicksItemView picksItemView) {
        pn90 pn90Var = new pn90(picksItemView, new y20() { // from class: l.es9
            @Override // p153l.y20
            public final void call(Object obj) {
                bnl0.m105525M0(picksItemView._personal_info, ((Boolean) obj).booleanValue());
            }
        });
        if (gra.m131596L3()) {
            act.startActivityForResult(ProfileAct.m51920o2(act, str, "from_picks", true), 24);
        } else {
            act.startActivityForResultWithCustomTransition(ProfileAct.m51920o2(act, str, "from_picks", true), 24, pn90Var);
        }
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Ss */
    public void mo36982Ss(nnr nnrVar) {
        nnrVar.f142842h.setImageResource(dbc0.f86580Sr);
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: X8 */
    public void mo36983X8(@NonNull String str, Act act) {
        C8927c.m54674s1(act, str, new y20() { // from class: l.is9
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreMemberBusinessServiceImpl.m37079a0((PurchaseType) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: Yq */
    public void mo36984Yq(int i, Intent intent, Act act) {
        if (i == -1) {
            qtk.m177983L0(act, (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h));
        }
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: a9 */
    public Intent mo36985a9(Context context) {
        return new Intent(context, (Class<?>) PicksAct.class);
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: be */
    public boolean mo36986be(final Act act, final gwl gwlVar, final boolean z, final boolean z2, final boolean z3, int i, String str, final String str2, final User user, final LikedUser likedUser) {
        final boolean z4;
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterM32487o3 == null ? null : counterM32487o3.superLikeLimit;
        final C8145d c8145dM39464B = HomeStatisticsHelper.m37703f(z3 ? OMSDialogPositon.p_suggest_user_profile_info_view : "p_who_i_liked", z3, z, z2, user).m39494z(i).m39464B(str);
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        c8145dM39464B.m39486r(HomeStatisticsHelper.ScActionFrom.WHO_I_LIKE);
        if (userM116600p9.isJailed()) {
            CoreModule.m30930K().startJailedDialogLikeAct();
            gwlVar.notifyDataSetChanged();
            HomeStatisticsHelper.m37691B(c8145dM39464B, "failJailedUser");
            return false;
        }
        if (userM116600p9.isNameFake()) {
            HomeStatisticsHelper.m37691B(c8145dM39464B, "failFakeUser");
            qtk.m177999T0(act);
            return false;
        }
        if (joa.m146386f4() && z2) {
            C8927c.m54687x0(act, gwlVar.mo47962G2(z3), Privilege.liked_user);
            return false;
        }
        if ((z || z2) && counterM32487o3 == null) {
            HomeStatisticsHelper.m37691B(c8145dM39464B, "failDataError");
            return false;
        }
        if (z2 && !TextUtils.isEmpty(str2) && !joa.m146355E3() && a5i0.m96096G() && a5i0.m96160p0().m96216e1()) {
            PurchaseType purchaseType = PurchaseType.TYPE_GET_LETTER;
            x20 x20Var = new x20() { // from class: l.ks9
                @Override // p153l.x20
                public final void call() {
                    this.f128542a.m37087k0(act, gwlVar, z, z2, z3, c8145dM39464B, str2, user, likedUser);
                }
            };
            Objects.requireNonNull(gwlVar);
            a5i0.m96085B1(act, purchaseType, x20Var, new x20() { // from class: l.ls9
                @Override // p153l.x20
                public final void call() {
                    gwlVar.mo47969Z0();
                }
            });
            return false;
        }
        final C8145d c8145d = c8145dM39464B;
        if (z2 && TextUtils.isEmpty(str2)) {
            z4 = z3;
            if (a5i0.m96098G1(act, new x20() { // from class: l.ms9
                @Override // p153l.x20
                public final void call() {
                    this.f138459a.m37088l0(c8145d, act, gwlVar, z4, str2, user, likedUser);
                }
            })) {
                c8145d = c8145d;
                return false;
            }
        } else {
            z4 = z3;
        }
        if (!z2 || !TextUtils.isEmpty(str2) || a5i0.m96178w0(counterSuperlikeAndUndoLimit.remainToday()) != 0) {
            m37082d0(act, gwlVar, z, z2, z4, c8145d, str2, user, likedUser);
            return true;
        }
        C8927c.m54574F1(act, gwlVar.mo47962G2(z4));
        HomeStatisticsHelper.m37691B(c8145d, "failExhaustSuperlike");
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: bj */
    public int mo36987bj() {
        return 24;
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: bo */
    public String mo36988bo() {
        return "currentImageIndex";
    }

    /* JADX INFO: renamed from: c0 */
    public final void m37081c0(final Act act, boolean z, final boolean z2, boolean z3, final C8145d c8145d, String str, User user, LikeUser likeUser, y20<LikeUser> y20Var) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c8145d.m39474f().getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(likeUser.userId).pageId(c8145d.m39476h()).build();
        act.duringCreated(CoreModule.f18264c.f20405m0.m32068W7(z, z2, null, user, str, LikeFrom.get("myLiked"), true, likeExtraDataNew_)).subscribe(psd0.m173597H(new y20() { // from class: l.gs9
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreMemberBusinessServiceImpl.m37072S(c8145d, z2, act, (Relationship) obj);
            }
        }, new y20() { // from class: l.hs9
            @Override // p153l.y20
            public final void call(Object obj) {
                HomeStatisticsHelper.m37690A(c8145d, (Throwable) obj);
            }
        }));
        if (y20Var != null) {
            y20Var.call(likeUser);
        }
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: cb */
    public boolean mo36989cb(final Act act, final Boolean bool, final Boolean bool2, final Boolean bool3, final User user) {
        final C8145d c8145dM37702e = HomeStatisticsHelper.m37702e(act.pageId(), bool3.booleanValue(), bool.booleanValue(), bool2.booleanValue(), user);
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (!NullChecker.m82486a(userM116600p9)) {
            return false;
        }
        c8145dM37702e.f23721h = HomeStatisticsHelper.ScActionFrom.INTL_VISITOR;
        CounterLikeLimit counterLikeLimit = CoreModule.f18264c.m32487o3().likeLimit;
        if (userM116600p9.isJailed()) {
            CoreModule.m30930K().startJailedDialogLikeAct();
            HomeStatisticsHelper.m37691B(c8145dM37702e, "failJailedUser");
            return false;
        }
        if (userM116600p9.isNameFake()) {
            HomeStatisticsHelper.m37691B(c8145dM37702e, "failFakeUser");
            qtk.m177999T0(act);
            return false;
        }
        if (!joa.m146361M3()) {
            rop.INSTANCE.m182437o(act, "p_intl_visitors_list,e_intl_visitors_list_check_btn,check", null);
            return false;
        }
        if (bool.booleanValue() && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !qj90.m176830b(PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
            rop.INSTANCE.m182437o(act, "p_intl_visitors_list,e_intl_visitors_list_check_btn,check", null);
            return false;
        }
        if (!bool2.booleanValue() || a5i0.m96181x0() > 0) {
            if (bool2.booleanValue() && a5i0.m96098G1(act, new x20() { // from class: l.js9
                @Override // p153l.x20
                public final void call() {
                    this.f122434a.m37089m0(c8145dM37702e, act, bool, bool2, bool3, user);
                }
            })) {
                return false;
            }
            m37083e0(act, bool, bool2, bool3, c8145dM37702e, user);
            return true;
        }
        if (joa.m146361M3()) {
            C8927c.m54574F1(act, bool3.booleanValue() ? "p_who_i_liked,e_iliked_superlike,click" : "p_who_i_liked,e_card,swipe_like");
            HomeStatisticsHelper.m37691B(c8145dM37702e, "failExhaustSuperlike");
        } else {
            rop.INSTANCE.m182437o(act, "p_intl_visitors_list,e_intl_visitors_list_check_btn,check", null);
        }
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: ch */
    public String mo36990ch() {
        return "currentImageUrl";
    }

    /* JADX INFO: renamed from: d0 */
    public final void m37082d0(final Act act, gwl gwlVar, final boolean z, final boolean z2, boolean z3, final C8145d c8145d, final String str, User user, LikedUser likedUser) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c8145d.m39474f().getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(likedUser.f21174id).pageId(c8145d.m39476h()).build();
        gwlVar.duringCreated(CoreModule.f18264c.f20405m0.m32068W7(z, z2, null, user, str, LikeFrom.get("myLiked"), true, likeExtraDataNew_)).subscribe(psd0.m173597H(new y20() { // from class: l.cs9
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreMemberBusinessServiceImpl.m37077Y(c8145d, z2, act, z, str, (Relationship) obj);
            }
        }, new y20() { // from class: l.ds9
            @Override // p153l.y20
            public final void call(Object obj) {
                HomeStatisticsHelper.m37690A(c8145d, (Throwable) obj);
            }
        }));
        gwlVar.mo47971w0(z2, str, likedUser);
    }

    /* JADX INFO: renamed from: e0 */
    public void m37083e0(final Act act, final Boolean bool, final Boolean bool2, Boolean bool3, final C8145d c8145d, final User user) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c8145d.f23721h.getFrom()).isLike(bool.booleanValue()).isFromButton(bool3.booleanValue()).isSuperLiked(bool2.booleanValue()).user(user.f56859id).pageId(c8145d.m39476h()).build();
        act.duringCreated(CoreModule.f18264c.f20405m0.m32076Y7(bool.booleanValue(), bool2.booleanValue(), null, user, null, LikeFrom.get(LikeFrom.intl_visitor), true, likeExtraDataNew_, 0, null)).subscribe(psd0.m173597H(new y20() { // from class: l.as9
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreMemberBusinessServiceImpl.m37076X(c8145d, bool2, act, user, bool, (Relationship) obj);
            }
        }, new y20() { // from class: l.bs9
            @Override // p153l.y20
            public final void call(Object obj) {
                HomeStatisticsHelper.m37690A(c8145d, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f0 */
    public final void m37084f0(boolean z, boolean z2, boolean z3, final C8145d c8145d, User user, String str, PicksUser picksUser, Act act, final an70 an70Var, sm70 sm70Var) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c8145d.f23721h.getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(picksUser.f21210id).pageId(c8145d.m39476h()).build();
        act.duringCreated(CoreModule.f18264c.f20405m0.m32076Y7(z, z2, null, user, str, LikeFrom.get("picks"), true, likeExtraDataNew_, 0, picksUser.picksTracker)).subscribe(psd0.m173597H(new C7984a(c8145d, z2, act, user, z, an70Var, str, !joa.m146358H3() && ela.m121122r3() > 0), new y20() { // from class: l.xr9
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreMemberBusinessServiceImpl.m37065K(c8145d, an70Var, (Throwable) obj);
            }
        }));
        m37092r0(picksUser, an70Var, sm70Var);
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: fe */
    public boolean mo36991fe(boolean z, boolean z2, final boolean z3, final boolean z4, int i, String str, final dwl dwlVar, final ewl ewlVar, final cwl cwlVar) {
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        CounterLikeLimit counterLikeLimit = counterM32487o3 == null ? null : counterM32487o3.likeLimit;
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterM32487o3 != null ? counterM32487o3.superLikeLimit : null;
        final C8145d c8145dM39464B = HomeStatisticsHelper.m37703f(z3 ? OMSDialogPositon.p_suggest_user_profile_info_view : "p_see_who_likes_me_view", z3, z, z2, dwlVar.getClickedUser()).m39494z(i).m39464B(str);
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9.isJailed()) {
            CoreModule.m30930K().startJailedDialogLikeAct();
            cwlVar.notifyDataSetChanged();
            HomeStatisticsHelper.m37691B(c8145dM39464B, "failJailedUser");
            return false;
        }
        if (qtk.m177971F0(cwlVar.act(), new Runnable() { // from class: l.ns9
            @Override // java.lang.Runnable
            public final void run() {
                cwl cwlVar2 = cwlVar;
                cwlVar2.act().startActivityForResult(MediaPickerAct.m48966e2(cwlVar2.act(), 1, false, false, true, null), PutongAct.REQUEST_CODE_PICKER);
            }
        })) {
            HomeStatisticsHelper.m37691B(c8145dM39464B, "failFakeUser");
            if (NullChecker.m82486a(dwlVar.getClickedItem())) {
                dwlVar.getClickedItem().setClickable(true);
            }
            return false;
        }
        if (NullChecker.m82486a(userM116600p9) && userM116600p9.isNameFake()) {
            HomeStatisticsHelper.m37691B(c8145dM39464B, "failFakeUser");
            qtk.m177999T0(cwlVar.act());
            return false;
        }
        if ((z || z2) && counterM32487o3 == null) {
            HomeStatisticsHelper.m37691B(c8145dM39464B, "failDataError");
            return false;
        }
        if (z && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !qj90.m176831c(userM116600p9, PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
            C8927c.m54595M1(cwlVar.act(), "p_home,likelimit", Privilege.vip_unlimited_likes, null, null, false, dwlVar.getClickedUser());
            if (NullChecker.m82486a(dwlVar.getClickedItem())) {
                dwlVar.getClickedItem().setClickable(true);
            }
            HomeStatisticsHelper.m37691B(c8145dM39464B, "failExhaustSwipe");
            return false;
        }
        if (z2 && a5i0.m96098G1(cwlVar.act(), new x20() { // from class: l.os9
            @Override // p153l.x20
            public final void call() {
                this.f148793a.m37090n0(c8145dM39464B, z3, z4, dwlVar, ewlVar, cwlVar);
            }
        })) {
            if (NullChecker.m82486a(dwlVar.getClickedItem())) {
                dwlVar.getClickedItem().setClickable(true);
            }
            HomeStatisticsHelper.m37691B(c8145dM39464B, "tantanCoin");
            return false;
        }
        if (!z2 || a5i0.m96178w0(counterSuperlikeAndUndoLimit.remainToday()) != 0) {
            m37085g0(z, z2, z3, z4, c8145dM39464B, dwlVar, ewlVar, cwlVar);
            return true;
        }
        if (qj90.m176830b(PurchaseType.TYPE_SUPERLIKE_PKG) || d79.m114669b0()) {
            C8927c.m54574F1(cwlVar.act(), "p_see_who_likes_me_view,e_superlike,click");
            HomeStatisticsHelper.m37691B(c8145dM39464B, "failExhaustSuperlike");
        } else {
            C8927c.m54595M1(cwlVar.act(), "p_see_who_likes_me_view,e_superlike,click", Privilege.vip_super_like, null, null, false, dwlVar.getClickedUser());
            HomeStatisticsHelper.m37691B(c8145dM39464B, "failLessVipSuperLike");
        }
        if (NullChecker.m82486a(dwlVar.getClickedItem())) {
            dwlVar.getClickedItem().setClickable(true);
        }
        return false;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m37085g0(final boolean z, final boolean z2, boolean z3, final boolean z4, final C8145d c8145d, final dwl dwlVar, ewl ewlVar, final cwl cwlVar) {
        String strMo57870P;
        HashMap map = new HashMap();
        map.put("X-Testing-Variance", "relationshipUI:seeWhoLikedMe");
        map.put("sourcepage", "seewholikeme");
        map.put("actiontype", z3 ? "click" : "swipe");
        c8145d.m39473e(map);
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c8145d.m39474f().getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(dwlVar.getClickedUser()).pageId(c8145d.m39476h()).build();
        cwlVar.duringCreated(CoreModule.f18264c.f20405m0.m32060U7(z, z2, map, dwlVar.getClickedUser(), likeExtraDataNew_, LikeFrom.get("likers"))).subscribe(psd0.m173597H(new y20() { // from class: l.yr9
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreMemberBusinessServiceImpl.m37064J(c8145d, z2, z4, dwlVar, cwlVar, z, (Relationship) obj);
            }
        }, new y20() { // from class: l.zr9
            @Override // p153l.y20
            public final void call(Object obj) {
                HomeStatisticsHelper.m37690A(c8145d, (Throwable) obj);
            }
        }));
        if (cwlVar.mo57757A1(dwlVar.getClickedUser(), z)) {
            dwlVar.mo57864J(dwlVar.getSeeCount() - 1);
            if (dwlVar.getSeeCount() <= 0) {
                ewlVar.mo122954a(false, cwlVar.mo57760O2() <= 1);
            }
            strMo57870P = dwlVar.mo57870P(dwlVar.getSeeCount());
        } else {
            strMo57870P = dwlVar.mo57870P(dwlVar.getSeeCount());
        }
        ewlVar.setTitle(strMo57870P);
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: ge */
    public boolean mo36992ge(@NonNull Act act) {
        return act instanceof PicksAct;
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m37086h0(C8145d c8145d, Act act, boolean z, String str, User user, LikeUser likeUser, y20 y20Var) {
        c8145d.m39484p();
        m37081c0(act, true, true, z, c8145d, str, user, likeUser, y20Var);
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: k */
    public boolean mo36993k() {
        return false;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m37087k0(Act act, gwl gwlVar, boolean z, boolean z2, boolean z3, C8145d c8145d, String str, User user, LikedUser likedUser) {
        a5i0.m96160p0().m96206U0();
        m37082d0(act, gwlVar, z, z2, z3, c8145d, str, user, likedUser);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m37088l0(C8145d c8145d, Act act, gwl gwlVar, boolean z, String str, User user, LikedUser likedUser) {
        c8145d.m39484p();
        m37082d0(act, gwlVar, true, true, z, c8145d, str, user, likedUser);
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: l1 */
    public void mo36994l1(Act act, String str) {
        CoreModule.m30933P().m143405a().mo34537l1(act, str);
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: lm */
    public void mo36995lm(Act act, User user, String str, boolean z, Runnable runnable, Runnable runnable2, String str2) {
        d810.m114777j(act, user, str, z, runnable, runnable2, str2);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m37089m0(C8145d c8145d, Act act, Boolean bool, Boolean bool2, Boolean bool3, User user) {
        c8145d.m39484p();
        m37083e0(act, bool, bool2, bool3, c8145d, user);
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: m6 */
    public void mo36996m6(nnr nnrVar) {
        nnrVar.f142844j.setBackgroundColor(-1);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m37090n0(C8145d c8145d, boolean z, boolean z2, dwl dwlVar, ewl ewlVar, cwl cwlVar) {
        c8145d.m39484p();
        m37085g0(true, true, z, z2, c8145d, dwlVar, ewlVar, cwlVar);
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: n9 */
    public void mo36997n9(nnr nnrVar) {
        nnrVar.f142840f.setTextColor(-1725882079);
        nnrVar.f142840f.setTextSize(2, 16.0f);
        ViewGroup.LayoutParams layoutParams = nnrVar.f142842h.getLayoutParams();
        int i = qa00.f156323j;
        layoutParams.width = i;
        layoutParams.height = i;
        nnrVar.f142842h.setLayoutParams(layoutParams);
        nnrVar.f142842h.setImageResource(dbc0.f86580Sr);
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: on */
    public boolean mo36998on(boolean z, boolean z2, boolean z3, int i, @NonNull String str, @NonNull User user, String str2, @NonNull Frag frag, @NonNull PicksUser picksUser, @Nullable String str3, @NonNull jic0 jic0Var, @NonNull y20<String> y20Var, @NonNull x20 x20Var) {
        return qo70.INSTANCE.m177292f(z, z2, z3, i, str, user, str2, frag, picksUser, str3, jic0Var, y20Var, x20Var);
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: pc */
    public String mo36999pc() {
        return "heart_confession_content";
    }

    /* JADX INFO: renamed from: r0 */
    public final void m37092r0(PicksUser picksUser, an70 an70Var, sm70 sm70Var) {
        if (an70Var.m98945l().m121735M(picksUser)) {
            CoreModule.f18264c.f20400k1.m121130I3(picksUser.f21210id);
            sm70Var.m186773r0(sm70Var.getSwipeCount() + 1);
        }
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: tq */
    public boolean mo37000tq(Act act, User user, boolean z, boolean z2, boolean z3, String str, y20<Relationship> y20Var, y20<Throwable> y20Var2, String str2, LikeExtraData likeExtraData, String str3, String str4) {
        return rgr.m181477n(act, user, z, z2, z3, str, null, y20Var, y20Var2, str2, likeExtraData, str3, str4);
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: vk */
    public boolean mo37001vk(boolean z, boolean z2, boolean z3, int i, @NonNull String str, @NonNull User user, @Nullable String str2, @Nullable Act act, an70 an70Var, @NonNull PicksUser picksUser, sm70 sm70Var) {
        i4g0.m138525w("e_picks_module_card", act.pageId(), jyb.m147494Y("picks_card_type", TEnum.equals(picksUser.picksTagType, PicksTagType.masking) ? "grayed" : BLiveResOperation.clear), jyb.m147494Y("other_user_id", user.f56859id), jyb.m147494Y("direction", z ? "like" : "dislike"));
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        C8145d c8145dM39464B = HomeStatisticsHelper.m37702e(act.pageId(), z3, z, z2, user).m39494z(i).m39464B(str);
        c8145dM39464B.f23721h = HomeStatisticsHelper.ScActionFrom.PICKS;
        if (userM116600p9.isJailed()) {
            an70Var.m98945l().notifyDataSetChanged();
            CoreModule.m30930K().startJailedDialogLikeAct();
            HomeStatisticsHelper.m37691B(c8145dM39464B, "failJailedUser");
            return false;
        }
        if (userM116600p9.isNameFake()) {
            HomeStatisticsHelper.m37691B(c8145dM39464B, "failFakeUser");
            qtk.m177999T0(act);
            return false;
        }
        if (sm70Var.getSwipeCount() >= 4 || an70Var.m98945l().m121734L() <= 4) {
            act.startActivity(new Intent(act, (Class<?>) PicksAct.class));
            an70Var.m98944k();
            return false;
        }
        if (TEnum.equals(picksUser.picksTagType, PicksTagType.masking)) {
            mo36983X8("picks_module_card", act);
            an70Var.m98945l().notifyDataSetChanged();
            return false;
        }
        if (!z && !joa.m146358H3()) {
            an70Var.m98945l().notifyDataSetChanged();
            return false;
        }
        if (!joa.m146358H3() && ela.m121122r3() <= 0) {
            mo36983X8("picks_module_card", act);
            an70Var.m98945l().notifyDataSetChanged();
            return false;
        }
        CounterLikeLimit counterLikeLimit = CoreModule.f18264c.m32487o3().likeLimit;
        if (z && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !qj90.m176831c(userM116600p9, PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
            CoreModule.m30933P().m143405a().mo34568pr(act, z3 ? "picks_module_card" : "", Privilege.vip_unlimited_likes);
            return false;
        }
        if (!z2 || !TextUtils.isEmpty(str2) || a5i0.m96181x0() > 0) {
            m37084f0(z, z2, z3, c8145dM39464B, user, str2, picksUser, act, an70Var, sm70Var);
            return true;
        }
        if (joa.m146386f4()) {
            if (!joa.m146358H3() && ela.m121122r3() <= 0) {
                mo36983X8("picks_module_card", act);
            } else if (qj90.m176831c(userM116600p9, PurchaseType.TYPE_SUPERLIKE_PKG) || d79.m114669b0()) {
                C8927c.m54574F1(act, abb0.m96736c("p_navigation_ilike,card_button_pull", z3 ? 2 : 1));
            } else {
                CoreModule.m30933P().m143405a().mo34568pr(act, "e_picks_card_superlike", Privilege.vip_super_like);
            }
        } else if (joa.m146358H3() || ela.m121122r3() > 0) {
            C8927c.m54574F1(act, abb0.m96736c("p_navigation_ilike,card_button_pull", z3 ? 2 : 1));
        } else {
            mo36983X8("picks_module_card", act);
        }
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.member.module.CoreMemberBusinessService
    /* JADX INFO: renamed from: yk */
    public void mo37002yk(Act act) {
        new dtf0(act).m117853a();
    }
}
