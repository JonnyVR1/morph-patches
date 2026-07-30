package com.p000p1.mobile.putong.core.module;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.ResultReceiver;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.core.data.Active;
import com.p000p1.mobile.putong.core.data.CityCBanner;
import com.p000p1.mobile.putong.core.data.CityCData;
import com.p000p1.mobile.putong.core.data.ConsumeType;
import com.p000p1.mobile.putong.core.data.FreeTrialOperateResult;
import com.p000p1.mobile.putong.core.data.GiftSubBizType;
import com.p000p1.mobile.putong.core.data.Greeting;
import com.p000p1.mobile.putong.core.data.HometownSuggest;
import com.p000p1.mobile.putong.core.data.LikedUser;
import com.p000p1.mobile.putong.core.data.LiteraturesComments;
import com.p000p1.mobile.putong.core.data.Merchandise;
import com.p000p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p000p1.mobile.putong.core.data.NewTags;
import com.p000p1.mobile.putong.core.data.PicksUser;
import com.p000p1.mobile.putong.core.data.Privilege;
import com.p000p1.mobile.putong.core.data.ProfileCompletionConfig;
import com.p000p1.mobile.putong.core.data.PurchaseType;
import com.p000p1.mobile.putong.core.data.RoamedLocationData;
import com.p000p1.mobile.putong.core.data.SummarizedPrivilegePrice;
import com.p000p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p000p1.mobile.putong.core.data.SwipeDirection;
import com.p000p1.mobile.putong.core.data.SwitchConvNextConfig;
import com.p000p1.mobile.putong.core.data.VirtualCardType;
import com.p000p1.mobile.putong.core.data.VisitorSortType;
import com.p000p1.mobile.putong.core.map.IntlMapAct;
import com.p000p1.mobile.putong.core.module.CoreBusinessServiceIml;
import com.p000p1.mobile.putong.core.p001ui.dlg.CoreDlg;
import com.p000p1.mobile.putong.core.p001ui.greet.C3135d;
import com.p000p1.mobile.putong.core.p001ui.home.VirtualCard;
import com.p000p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreBusinessModule;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.PutongCoreAct;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p1.mobile.putong.core.card.VSwipeCard;
import com.p1.mobile.putong.core.newui.greet.DynamicGreetListAct;
import com.p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p1.mobile.putong.core.newui.home.d;
import com.p1.mobile.putong.core.newui.home.marrymode.MarrModeProfileCardView;
import com.p1.mobile.putong.core.newui.intlmeet.IntlMeetAct;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.newui.messages.OOFMkWebViewAct;
import com.p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import com.p1.mobile.putong.core.newui.messages.search.ConversationSearchAct;
import com.p1.mobile.putong.core.ui.intl.visitor.IntlVisitorsAct;
import com.p1.mobile.putong.core.ui.likedusers.LikedUsersAct;
import com.p1.mobile.putong.core.ui.likedusers.tablayout.NewMyLikedUsersAct;
import com.p1.mobile.putong.core.ui.match.MatchAct;
import com.p1.mobile.putong.core.ui.match.b;
import com.p1.mobile.putong.core.ui.mediapreview.CommonMediaPreviewAct;
import com.p1.mobile.putong.core.ui.messages.ItemBase;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.messages.helper.MessageWarmingUpHelper;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchManager;
import com.p1.mobile.putong.core.ui.onlinematch.a;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.core.ui.profile.ProfileAct_CustomTransition;
import com.p1.mobile.putong.core.ui.profile.exploop.item.ExpLoopInputType;
import com.p1.mobile.putong.core.ui.profile.loop.LoopFragmentFactory;
import com.p1.mobile.putong.core.ui.profile.loop.LoopInputType;
import com.p1.mobile.putong.core.ui.report.ReportAct;
import com.p1.mobile.putong.core.ui.svip.SVIPRefundAct;
import com.p1.mobile.putong.core.ui.verification.VerificationCenterAct;
import com.p1.mobile.putong.core.ui.vip.VipAct;
import com.p1.mobile.putong.core.ui.vip.VipLocationHistoryAct;
import com.p1.mobile.putong.core.ui.vip.likers.LikersAct;
import com.p1.mobile.putong.core.ui.vip.picks.PicksHelper;
import com.p1.mobile.putong.core.ui.vip.picks.view.header.PicksHeaderView;
import com.p1.mobile.putong.core.ui.vip.privilege.VipBaseFrag;
import com.p1.mobile.putong.core.ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.CounterLikeLimit;
import com.p1.mobile.putong.data.GPSkuDetails;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.MatchScData;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.NavigationCardIntent;
import com.p1.mobile.putong.data.NavigationIntent;
import com.p1.mobile.putong.data.OmsTagUserCounts;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.QualificationType;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import l.bpb;
import l.co90;
import l.cwf0;
import l.d30;
import l.dfj;
import l.duj0;
import l.e30;
import l.e51;
import l.eyl;
import l.f1m;
import l.f5m;
import l.f6c0;
import l.fap;
import l.fd5;
import l.fif;
import l.ft4;
import l.g30;
import l.g4h0;
import l.gak;
import l.gkl0;
import l.gm5;
import l.hqo;
import l.hvc0;
import l.i0e;
import l.i0g0;
import l.iij0;
import l.j15;
import l.j17;
import l.j760;
import l.ke50;
import l.khl0;
import l.kk50;
import l.kyc0;
import l.l5j0;
import l.lf90;
import l.ljl0;
import l.lva;
import l.lwl;
import l.lyc0;
import l.mc60;
import l.mkd0;
import l.myc0;
import l.myf;
import l.n3b0;
import l.n740;
import l.nhr;
import l.nvb0;
import l.nx0;
import l.o0x;
import l.obe0;
import l.ogl0;
import l.osi0;
import l.qed0;
import l.qlw;
import l.r2y;
import l.r3l0;
import l.roj0;
import l.rxg0;
import l.rza;
import l.sa40;
import l.sja;
import l.sqb0;
import l.src0;
import l.su4;
import l.swh0;
import l.t100;
import l.tae0;
import l.tkp;
import l.tm90;
import l.tvf;
import l.u0n;
import l.u59;
import l.ue50;
import l.uld0;
import l.upa;
import l.ura;
import l.uyc0;
import l.v9j;
import l.vwb;
import l.w0c0;
import l.w6h0;
import l.w8e0;
import l.w9j;
import l.wn90;
import l.x2c0;
import l.xdl0;
import l.xi1;
import l.xma;
import l.xsy;
import l.yij0;
import l.yzc0;
import l.zar;
import l.zbi0;
import l.zub;
import l.zvf0;
import l.zzc0;
import p003l.aa3;
import p003l.abi;
import p003l.ak50;
import p003l.aqo;
import p003l.ark;
import p003l.bo5;
import p003l.co5;
import p003l.e9n;
import p003l.f73;
import p003l.g83;
import p003l.gxg0;
import p003l.hmb;
import p003l.igj;
import p003l.m45;
import p003l.m73;
import p003l.mb90;
import p003l.v87;
import p003l.vyc0;
import p003l.wvv;
import p003l.x7y;
import p003l.x93;
import rx.c;
import v.VDraweeView;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Route(name = "CoreBusinessService", path = "/core_business/service")
public class CoreBusinessServiceIml implements CoreBusinessService, v87 {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.module.CoreBusinessServiceIml$a */
    public class C3059a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ eyl f858a;

        public C3059a(eyl eylVar) {
            this.f858a = eylVar;
        }

        public void call() {
            x93.m10705f(this.f858a.q1(), true, x93.m10702c(), false, Privilege.minBoost);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.module.CoreBusinessServiceIml$b */
    public class C3060b implements g30<PurchaseType, Act, String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ eyl f860a;

        public C3060b(eyl eylVar) {
            this.f860a = eylVar;
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void m1283a(PurchaseType purchaseType, Act act, String str) {
            x93.m10705f(this.f860a.q1(), true, x93.m10702c(), false, Privilege.minBoost);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.module.CoreBusinessServiceIml$c */
    public class C3061c implements f1m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ eyl f862a;

        public C3061c(eyl eylVar) {
            this.f862a = eylVar;
        }

        /* JADX INFO: renamed from: d */
        public boolean m1285d() {
            return true;
        }

        /* JADX INFO: renamed from: e */
        public boolean m1286e() {
            this.f862a.V(SwipeDirection.RIGHT);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.module.CoreBusinessServiceIml$d */
    public class C3062d implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ eyl f864a;

        public C3062d(eyl eylVar) {
            this.f864a = eylVar;
        }

        public void call() {
            osi0.g(this.f864a.Y1(R.string.H9));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.module.CoreBusinessServiceIml$e */
    public class C3063e implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ eyl f866a;

        public C3063e(eyl eylVar) {
            this.f866a = eylVar;
        }

        public void call() {
            this.f866a.V(SwipeDirection.RIGHT);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.module.CoreBusinessServiceIml$f */
    public class C3064f implements ue50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f868a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d30 f869b;

        public C3064f(d30 d30Var, d30 d30Var2) {
            this.f868a = d30Var;
            this.f869b = d30Var2;
        }

        /* JADX INFO: renamed from: a */
        public void m1287a() {
            if (NullChecker.a(this.f869b)) {
                this.f869b.call();
            }
        }

        /* JADX INFO: renamed from: c */
        public void m1288c() {
            if (NullChecker.a(this.f868a)) {
                this.f868a.call();
            }
        }
    }

    /* JADX INFO: renamed from: Gt */
    public static /* synthetic */ void m894Gt(Boolean bool) {
    }

    /* JADX INFO: renamed from: Jt */
    public static /* synthetic */ void m897Jt(Boolean bool) {
    }

    /* JADX INFO: renamed from: Kt */
    public static /* synthetic */ void m898Kt(d dVar, boolean z, Act act, Relationship relationship) {
        HomeStatisticsHelper.B(dVar, "success");
        if (!TEnum.equals(relationship.state, "matched")) {
            if (z) {
                rxg0.L(act);
                return;
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

    /* JADX INFO: renamed from: Mt */
    public static /* synthetic */ void m900Mt(Act act) {
        zvf0.r("e_avatarVerification_explain_click", "p_avatarVerification_icon_explain_guide_Unverified");
        if (TEnum.equals(CoreModule.c.B0.s4(), "pending")) {
            CoreDlg.m2303G1(act, act.string(R.string.Jr), act.string(R.string.Ir), x2c0.vj, act.string(R.string.xr), null, false, null, null, null, null, true, false, null, null, false);
        } else {
            tvf.h(act, "dialog");
        }
    }

    /* JADX INFO: renamed from: Nt */
    public static /* synthetic */ void m901Nt(Throwable th) {
        if (sja.r3() > 0) {
            CoreModule.c.C0.u4();
        }
    }

    /* JADX INFO: renamed from: Ot */
    public static /* synthetic */ void m902Ot(e30 e30Var) {
        if (NullChecker.a(e30Var)) {
            e30Var.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: Qt */
    public static /* synthetic */ void m904Qt(Act act) {
        swh0.p0().S0();
        x93.m10703d(act, true);
    }

    /* JADX INFO: renamed from: Tt */
    public static /* synthetic */ void m907Tt(Boolean bool) {
    }

    /* JADX INFO: renamed from: Wt */
    public static /* synthetic */ void m910Wt(e30 e30Var) {
        if (NullChecker.a(e30Var)) {
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: Xt */
    public static /* synthetic */ void m911Xt() {
        CoreModule.c.k1.A3();
        CoreModule.c.C0.u4();
    }

    /* JADX INFO: renamed from: Yt */
    public static /* synthetic */ void m912Yt(x7y x7yVar) {
    }

    /* JADX INFO: renamed from: bu */
    public static /* synthetic */ void m915bu(boolean z, Act act, boolean z2, boolean z3, User user, Relationship relationship) {
        CoreModule.c.k1.A3();
        int i = 1;
        if (TEnum.equals(relationship.state, "matched")) {
            if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get("superLikedEach")) {
                i = 13;
            } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get("superLiked")) {
                i = z ? 12 : 11;
            } else if (relationship.status.size() == 0 || relationship.status.get(0) != MatchFrom.get("secretcrush")) {
                i = 0;
            }
            act.startActivityWithCustomTransition(MatchAct.e2(act, vwb.f0(new String[]{relationship.id}), i, new ArrayList()), new MatchAct.b());
        } else if (z2) {
            if (z) {
                if (z3) {
                    PicksHelper.o(act, user, true);
                    CoreModule.c.C0.u4();
                } else {
                    rxg0.L(act);
                }
            } else if (z3) {
                PicksHelper.o(act, user, false);
                CoreModule.c.C0.u4();
            }
        }
        if (ura.e().d().t() && z3) {
            CoreModule.c.m0.d9();
        }
    }

    /* JADX INFO: renamed from: A4 */
    public void m916A4(Act act) {
        CoreBusinessModule.m0().A4(act);
    }

    /* JADX INFO: renamed from: A7 */
    public Intent m917A7(Act act) {
        return NewMainAct.I5(act, NavigationIntent.get("cards"));
    }

    /* JADX INFO: renamed from: A9 */
    public void m918A9(Act act, String str) {
        ft4.b().e(act, str);
    }

    /* JADX INFO: renamed from: Ab */
    public boolean m919Ab(PurchaseType purchaseType) {
        return xi1.b(purchaseType);
    }

    /* JADX INFO: renamed from: Ad */
    public void m920Ad(Act act, String str, View view, e30<Boolean> e30Var) {
        act.startActivityForResultWithCustomTransition(ProfileAct.n2(act, str, "from_intl_meet", true), 18, new lf90(view, e30Var));
    }

    /* JADX INFO: renamed from: Ak */
    public boolean m921Ak(List<OmsTagUserCounts> list) {
        return sa40.o().R(list).a;
    }

    /* JADX INFO: renamed from: Al */
    public String m922Al(Media media) {
        return zub.f(media).formatted();
    }

    /* JADX INFO: renamed from: Ao */
    public void m923Ao(final boolean z, final boolean z2, final boolean z3, final User user, final Act act, final String str, final boolean z4) {
        final d dVarE = HomeStatisticsHelper.e("p_vas_paid_recovery_pop", z3, z, z2, user);
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(userP9)) {
            dVarE.h = HomeStatisticsHelper.ScActionFrom.INTL_RECOVERY_POP;
            final CounterLikeLimit counterLikeLimit = CoreModule.c.o3().likeLimit;
            if (userP9.isJailed()) {
                CoreModule.K().startJailedDialogLikeAct();
                HomeStatisticsHelper.B(dVarE, "failJailedUser");
            } else if (!userP9.isNameFake()) {
                act.duringCreated(CoreModule.c.C0.u4().flatMap(new w9j() { // from class: l.g97
                    public final Object call(Object obj) {
                        return CoreModule.c.e0.H9();
                    }
                })).subscribe(mkd0.G(new e30() { // from class: l.i97
                    public final void call(Object obj) {
                        this.f5015a.m1136eu(z, counterLikeLimit, act, str, z4, z2, dVarE, z3, user, (roj0) obj);
                    }
                }));
            } else {
                HomeStatisticsHelper.B(dVarE, "failFakeUser");
                ark.m5556T0(act);
            }
        }
    }

    /* JADX INFO: renamed from: B7 */
    public boolean m924B7() {
        return upa.z3();
    }

    /* JADX INFO: renamed from: B9 */
    public float m925B9() {
        return VSwipeCard.C;
    }

    /* JADX INFO: renamed from: Bb */
    public void m926Bb(Act act) {
        m73.m7991g(act);
    }

    /* JADX INFO: renamed from: Bc */
    public CharSequence m927Bc(User user, Context context, int[] iArr) {
        return obe0.c(user, context, iArr);
    }

    /* JADX INFO: renamed from: Be */
    public void m928Be() {
        xsy.g.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: Bn */
    public long m929Bn() {
        return n3b0.g();
    }

    /* JADX INFO: renamed from: Bp */
    public void m930Bp(PutongFrag putongFrag, int i) {
        if ((putongFrag instanceof VipNewUiFrag) && i == 2) {
            ((VipNewUiFrag) putongFrag).S4();
        }
    }

    /* JADX INFO: renamed from: C7 */
    public void m931C7(Act act, CityCBanner cityCBanner) {
        new m45(act, "").m7966K(1, null, cityCBanner);
    }

    /* JADX INFO: renamed from: C9 */
    public void m932C9(View view, BusinessEntranceStyle businessEntranceStyle) {
        ((PicksHeaderView) view).b((businessEntranceStyle == BusinessEntranceStyle.PICKS && PicksHelper.Companion.b().n()) ? PicksHelper.HeaderType.EXPAND : PicksHelper.HeaderType.HIDE);
    }

    /* JADX INFO: renamed from: Cc */
    public Act.w m933Cc(View view, e30<Boolean> e30Var) {
        return new lf90(view, e30Var);
    }

    /* JADX INFO: renamed from: Cj */
    public String m934Cj() {
        return "https://auto.tancdn.com/v1/raw/bd957249-2f80-4f31-adcd-a3eefc6afbad12.svga";
    }

    /* JADX INFO: renamed from: Ck */
    public int m935Ck() {
        return 18;
    }

    /* JADX INFO: renamed from: Cm */
    public int m936Cm() {
        return nvb0.k();
    }

    /* JADX INFO: renamed from: Cs */
    public CharSequence m937Cs(User user, User user2) {
        return yzc0.d(user, user2);
    }

    /* JADX INFO: renamed from: D6 */
    public String m938D6() {
        return ogl0.d();
    }

    /* JADX INFO: renamed from: Dc */
    public c<View> m939Dc(Act act, d30 d30Var) {
        if (u0n.q()) {
            return u0n.l().j(4).a(act, d30Var);
        }
        return null;
    }

    /* JADX INFO: renamed from: De */
    public boolean m940De() {
        return upa.t1();
    }

    /* JADX INFO: renamed from: Dl */
    public void m941Dl(Act act, User user, String str, d30 d30Var) {
        b.n(act, user, str, d30Var);
    }

    /* JADX INFO: renamed from: Dn */
    public boolean m942Dn(QualificationType qualificationType) {
        return yij0.J(qualificationType);
    }

    /* JADX INFO: renamed from: E5 */
    public c<View> m943E5(Act act) {
        return !u0n.o() ? c.just((Object) null) : u0n.l().j(6).c(act);
    }

    /* JADX INFO: renamed from: E9 */
    public void m944E9() {
        n3b0.w();
    }

    /* JADX INFO: renamed from: Eb */
    public void m945Eb(Act act) {
        ak50.m5396O().m5423H(act, "use_up");
    }

    /* JADX INFO: renamed from: Ef */
    public void m946Ef(eyl eylVar, String str) {
        sqb0.O().M(eylVar.q1(), str);
    }

    /* JADX INFO: renamed from: En */
    public boolean m947En() {
        return false;
    }

    /* JADX INFO: renamed from: Eo */
    public void m948Eo(Act act, PurchaseType purchaseType, boolean z, d30 d30Var, d30 d30Var2, String str) {
        hqo hqoVar = new hqo(act, purchaseType);
        hqoVar.t(new C3064f(d30Var, d30Var2));
        hqoVar.p(aqo.m5501h(act, act instanceof PutongAct ? ((PutongAct) act).iap().i() : null), z, str);
    }

    /* JADX INFO: renamed from: Eq */
    public void m949Eq(Act act, String str, d30 d30Var, Privilege privilege, boolean z, User user) {
        com.p1.mobile.putong.core.ui.purchase.c.M1(act, str, privilege, d30Var, (d30) null, z, user);
    }

    /* JADX INFO: renamed from: Es */
    public boolean m950Es() {
        return ogl0.l();
    }

    /* JADX INFO: renamed from: F0 */
    public String m951F0() {
        return ConsumeType.diamond;
    }

    /* JADX INFO: renamed from: F2 */
    public String m952F2() {
        return "platinum";
    }

    /* JADX INFO: renamed from: F4 */
    public boolean m953F4() {
        return false;
    }

    /* JADX INFO: renamed from: F9 */
    public boolean m954F9(List<String> list) {
        sa40.h hVarP = sa40.o().P(list);
        if (NullChecker.a(hVarP)) {
            return hVarP.a;
        }
        return false;
    }

    /* JADX INFO: renamed from: Fe */
    public void m955Fe(Act act) {
        Intent intentK = lva.k(act, NavigationIntent.get("vip"));
        intentK.putExtra("navigation_to_vip_page_index", khl0.a("svip"));
        act.startActivity(intentK);
        act.finish();
    }

    /* JADX INFO: renamed from: Fi */
    public String m956Fi() {
        return "bubble_superlike_push_id";
    }

    /* JADX INFO: renamed from: G7 */
    public boolean m957G7() {
        return u59.g0();
    }

    /* JADX INFO: renamed from: G8 */
    public String m958G8() {
        return kyc0.a();
    }

    /* JADX INFO: renamed from: Gd */
    public void m959Gd(Act act, String str, Privilege privilege, PurchaseType purchaseType, e30<PurchaseType> e30Var, int i, d30 d30Var, d30 d30Var2, String str2, Object obj, boolean z) {
        com.p1.mobile.putong.core.ui.purchase.c.B0(act, str, privilege, purchaseType, e30Var, i, d30Var, d30Var2, str2, obj, z);
    }

    /* JADX INFO: renamed from: Gf */
    public boolean m960Gf() {
        return ogl0.H();
    }

    /* JADX INFO: renamed from: Gg */
    public int m961Gg() {
        return sqb0.i0();
    }

    /* JADX INFO: renamed from: Gl */
    public int m962Gl() {
        return -1289674463;
    }

    /* JADX INFO: renamed from: Go */
    public void m963Go(Act act, d30 d30Var, PurchaseType purchaseType, boolean z, boolean z2) {
        m73.m7998n(act, d30Var, purchaseType, z, z2);
    }

    /* JADX INFO: renamed from: Gq */
    public void m964Gq(Act act) {
        act.startActivity(DynamicGreetListAct.X1(act, (Greeting) null, "from_meet"));
    }

    /* JADX INFO: renamed from: H8 */
    public boolean m965H8(@NonNull Date date) {
        return ItemBase.e(date);
    }

    /* JADX INFO: renamed from: H9 */
    public String m966H9() {
        return SummarizedPrivilegesId.ultraPremium;
    }

    /* JADX INFO: renamed from: Hc */
    public void m967Hc(Act act, d30 d30Var, v9j<Boolean> v9jVar) {
        m73.m8000p(act, d30Var, v9jVar);
    }

    /* JADX INFO: renamed from: Hd */
    public boolean m968Hd() {
        return upa.P2();
    }

    /* JADX INFO: renamed from: Hi */
    public boolean m969Hi() {
        return false;
    }

    /* JADX INFO: renamed from: Hk */
    public Intent m970Hk(Act act) {
        return SVIPRefundAct.Z1(act);
    }

    /* JADX INFO: renamed from: Hl */
    public int m971Hl(String str) {
        return rxg0.r(str);
    }

    /* JADX INFO: renamed from: Ho */
    public boolean m972Ho() {
        return upa.u2();
    }

    /* JADX INFO: renamed from: Hr */
    public boolean m973Hr() {
        return false;
    }

    /* JADX INFO: renamed from: I9 */
    public void m974I9(Frag frag, User user) {
        frag.startActivity(ProfileAct.n2(frag.getContext(), ((DbObject) user).id, "supreme_partner_nearby", true));
    }

    /* JADX INFO: renamed from: Ie */
    public String m975Ie() {
        return "svip";
    }

    /* JADX INFO: renamed from: If */
    public boolean m976If() {
        return false;
    }

    /* JADX INFO: renamed from: Il */
    public String m977Il() {
        return kk50.b();
    }

    /* JADX INFO: renamed from: Im */
    public void m978Im(int i, ImageView imageView, boolean z) {
        tm90.d().j(i, imageView, z);
    }

    /* JADX INFO: renamed from: Iq */
    public String m979Iq() {
        return "currentUserId";
    }

    /* JADX INFO: renamed from: J6 */
    public void m980J6(Context context) {
        context.startActivity(ProfileAct.p2(context, CoreModule.H().userId(), "profile_frag_menu", false, true));
    }

    /* JADX INFO: renamed from: J7 */
    public void m981J7(Act act, PurchaseType purchaseType, d30 d30Var, d30 d30Var2) {
        a.o0(act, purchaseType, d30Var, d30Var2);
    }

    /* JADX INFO: renamed from: Ja */
    public SwitchConvNextConfig m982Ja() {
        return upa.h1();
    }

    /* JADX INFO: renamed from: Jj */
    public String m983Jj() {
        return kk50.e();
    }

    /* JADX INFO: renamed from: Jl */
    public void m984Jl(Act act) {
        com.p1.mobile.putong.core.newui.fake.b.r().C(act, myf.E(act));
    }

    /* JADX INFO: renamed from: K4 */
    public boolean m985K4() {
        return false;
    }

    /* JADX INFO: renamed from: K6 */
    public Intent m986K6(Context context) {
        return VipAct.a2(context);
    }

    /* JADX INFO: renamed from: Kc */
    public void m987Kc(Act act, int i, d30 d30Var) {
        duj0 duj0Var = new duj0(act, 0);
        duj0Var.F(d30Var);
        duj0Var.show();
    }

    /* JADX INFO: renamed from: Kf */
    public boolean m988Kf() {
        return u59.L();
    }

    /* JADX INFO: renamed from: Kj */
    public boolean m989Kj() {
        return ogl0.m();
    }

    /* JADX INFO: renamed from: Kp */
    public int m990Kp() {
        return lyc0.j0();
    }

    /* JADX INFO: renamed from: Ks */
    public boolean m991Ks(Privilege privilege) {
        return swh0.x(privilege);
    }

    /* JADX INFO: renamed from: L6 */
    public void m992L6(Act act, String str, Privilege privilege, User user) {
        com.p1.mobile.putong.core.ui.purchase.c.M1(act, str, privilege, (d30) null, (d30) null, false, user);
    }

    /* JADX INFO: renamed from: L8 */
    public String m993L8() {
        return "heart_confession_content";
    }

    /* JADX INFO: renamed from: L9 */
    public CharSequence m994L9(User user, View view, TextView textView) {
        return obe0.g(user, view, textView);
    }

    /* JADX INFO: renamed from: La */
    public List<NewTags> m995La(List<String> list) {
        return sa40.o().P(list).b();
    }

    /* JADX INFO: renamed from: Lb */
    public String m996Lb() {
        return tkp.h();
    }

    /* JADX INFO: renamed from: Ld */
    public boolean m997Ld(@Nullable Counter counter) {
        return n3b0.r(counter);
    }

    /* JADX INFO: renamed from: Lf */
    public void m998Lf(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, final e30<Boolean> e30Var2) {
        com.p1.mobile.putong.core.ui.purchase.c.A0(act, str, privilege, (PurchaseType) null, e30Var, -1, new d30() { // from class: l.h97
            public final void call() {
                CoreBusinessServiceIml.m910Wt(e30Var2);
            }
        }, new d30() { // from class: l.m97
            public final void call() {
                CoreBusinessServiceIml.m902Ot(e30Var2);
            }
        });
    }

    /* JADX INFO: renamed from: Lg */
    public boolean m999Lg() {
        return xma.C3();
    }

    /* JADX INFO: renamed from: Lm */
    public Intent m1000Lm(Act act, ArrayList<String> arrayList, int i, ArrayList<String> arrayList2) {
        return MatchAct.e2(act, arrayList, i, arrayList2);
    }

    /* JADX INFO: renamed from: Lp */
    public void m1001Lp(SpannableString spannableString, String str, String str2, int i, int i2, int i3, int i4) {
        tae0.s(spannableString, str, str2, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: Mb */
    public boolean m1002Mb() {
        return u59.T();
    }

    /* JADX INFO: renamed from: Mc */
    public void m1003Mc(final Act act, String str) {
        com.p1.mobile.putong.core.ui.purchase.c.s1(act, str, new e30() { // from class: l.w87
            public final void call(Object obj) {
                e51.H(act, new Runnable() { // from class: l.n97
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreBusinessServiceIml.m911Xt();
                    }
                }, 1000L);
            }
        });
    }

    /* JADX INFO: renamed from: Me */
    public void m1004Me(Act act, User user, String str, d30 d30Var) {
        com.p1.mobile.putong.core.ui.match.a.w().p(act, user, str, d30Var);
    }

    /* JADX INFO: renamed from: Mf */
    public boolean m1005Mf() {
        return ogl0.Z();
    }

    /* JADX INFO: renamed from: Mi */
    public boolean m1006Mi() {
        return ogl0.h();
    }

    /* JADX INFO: renamed from: Mj */
    public f5m m1007Mj(FrameLayout frameLayout, String str, RecyclerView.t tVar) {
        MarrModeProfileCardView marrModeProfileCardView = new MarrModeProfileCardView(frameLayout.getContext());
        marrModeProfileCardView.d(str);
        marrModeProfileCardView.b(tVar);
        frameLayout.addView((View) marrModeProfileCardView, (ViewGroup.LayoutParams) new FrameLayout.LayoutParams(-1, -1));
        return marrModeProfileCardView;
    }

    /* JADX INFO: renamed from: Mp */
    public void m1008Mp(Act act, User user, e30<String> e30Var, boolean z) {
        zar.h(act, user, e30Var, z);
    }

    /* JADX INFO: renamed from: Mr */
    public void m1009Mr(Act act, String str, d30 d30Var, d30 d30Var2, e30<PurchaseType> e30Var) {
        com.p1.mobile.putong.core.ui.purchase.c.b1(act, str, d30Var, d30Var2, e30Var);
    }

    /* JADX INFO: renamed from: N7 */
    public int m1010N7() {
        return 48;
    }

    /* JADX INFO: renamed from: N8 */
    public boolean m1011N8() {
        Settings settings = CoreModule.c.e0.p9().settings;
        return settings != null && TEnum.equals(settings.getLookingFor(), "female");
    }

    /* JADX INFO: renamed from: Nf */
    public int m1012Nf() {
        return n3b0.c();
    }

    /* JADX INFO: renamed from: Nm */
    public int m1013Nm() {
        return zzc0.d0();
    }

    /* JADX INFO: renamed from: Nn */
    public void m1014Nn(Act act, String str, View view, boolean z) {
        if (upa.L3()) {
            act.startActivityForResult(ProfileAct.n2(act, str, "from_new_meet_likers", true), z ? 82 : 81);
        } else {
            act.startActivityForResultWithCustomTransition(ProfileAct.n2(act, str, "from_new_meet_likers", true), z ? 82 : 81, new lf90(view, new e30() { // from class: l.a97
                public final void call(Object obj) {
                    CoreBusinessServiceIml.m907Tt((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: No */
    public boolean m1015No() {
        return fap.y();
    }

    /* JADX INFO: renamed from: Np */
    public boolean m1016Np() {
        return ogl0.B();
    }

    /* JADX INFO: renamed from: O */
    public boolean m1017O() {
        return false;
    }

    /* JADX INFO: renamed from: O1 */
    public String m1018O1() {
        return "partner";
    }

    /* JADX INFO: renamed from: O7 */
    public boolean m1019O7() {
        return ogl0.O();
    }

    /* JADX INFO: renamed from: O8 */
    public boolean m1020O8() {
        return upa.F1();
    }

    /* JADX INFO: renamed from: O9 */
    public Intent m1021O9(Act act, String str, boolean z, ResultReceiver resultReceiver) {
        return ReportAct.a2(act, str, z, resultReceiver);
    }

    /* JADX INFO: renamed from: Ob */
    public String m1022Ob(int i, String str) {
        return a.C(i, str);
    }

    /* JADX INFO: renamed from: Oo */
    public boolean m1023Oo() {
        return ogl0.g();
    }

    /* JADX INFO: renamed from: Op */
    public boolean m1024Op() {
        return upa.L1();
    }

    /* JADX INFO: renamed from: P7 */
    public boolean m1025P7() {
        return w8e0.c();
    }

    /* JADX INFO: renamed from: P8 */
    public int m1026P8() {
        return 50;
    }

    /* JADX INFO: renamed from: Ph */
    public boolean m1027Ph() {
        return lyc0.d0();
    }

    /* JADX INFO: renamed from: Pl */
    public void m1028Pl(boolean z, View view) {
        if (view instanceof VirtualCard) {
            ((VirtualCard) view).m3448L0(z);
        }
    }

    /* JADX INFO: renamed from: Po */
    public void m1029Po(final Act act) {
        tvf.n();
        final cwf0 cwf0VarC = i0e.c("p_avatarVerification_icon_explain_guide_Unverified", Dialog.class.getName());
        i0e.f(cwf0VarC);
        CoreDlg.m2303G1(act, act.string(R.string.yr), act.string(R.string.Tr), x2c0.u8, act.string(R.string.Rr), new d30() { // from class: l.s97
            public final void call() {
                CoreBusinessServiceIml.m900Mt(act);
            }
        }, true, act.string(R.string.Qr), new d30() { // from class: l.t97
            public final void call() {
                zvf0.r("e_avatarVerification_explain_cancle_click", "p_avatarVerification_icon_explain_guide_Unverified");
            }
        }, new d30() { // from class: l.x87
            public final void call() {
                i0e.e(cwf0VarC);
            }
        }, null, true, false, null, null, false);
    }

    /* JADX INFO: renamed from: Q8 */
    public void m1030Q8(Act act, RoamedLocationData roamedLocationData) {
        if (ljl0.n("p_select_location_view,e_manyou,click", act, (String) null)) {
            wvv.m10572f();
            if (roamedLocationData.data.size() >= 5) {
                act.startActivityForResult(VipLocationHistoryAct.V1(act, VipBaseFrag.B), 3);
            } else {
                act.startActivityForResult(IntlMapAct.m756e2(act, 1, VipBaseFrag.B), 2);
            }
        }
    }

    /* JADX INFO: renamed from: Qb */
    public boolean m1031Qb() {
        return ogl0.X();
    }

    /* JADX INFO: renamed from: Qp */
    public void m1032Qp(Activity activity) {
        activity.startActivity(m1071Vf() ? NewMyLikedUsersAct.Y1(activity) : new Intent(activity, (Class<?>) LikedUsersAct.class));
    }

    /* JADX INFO: renamed from: Qr */
    public int m1033Qr() {
        return 49;
    }

    /* JADX INFO: renamed from: R6 */
    public String m1034R6() {
        return fap.x();
    }

    /* JADX INFO: renamed from: R7 */
    public void m1035R7(String str, String str2) {
        co5.m5984k(str, str2);
    }

    /* JADX INFO: renamed from: Ri */
    public void m1036Ri(boolean z) {
        a.f = true;
    }

    /* JADX INFO: renamed from: Rj */
    public Intent m1037Rj(Act act, String str, LikedUser likedUser) {
        return ProfileAct.o2(act, str, "from_meet_feed", true, likedUser);
    }

    /* JADX INFO: renamed from: Rl */
    public String m1038Rl(int i) {
        return tae0.f(i);
    }

    /* JADX INFO: renamed from: Rm */
    public void m1039Rm(Act act, String str) {
        com.p1.mobile.putong.core.ui.purchase.c.w0(act, str);
    }

    /* JADX INFO: renamed from: Rn */
    public boolean m1040Rn() {
        return false;
    }

    /* JADX INFO: renamed from: Rr */
    public void m1041Rr(long j) {
        wn90.F().z(j);
    }

    /* JADX INFO: renamed from: Sc */
    public void m1042Sc(Act act, String str, e30<PurchaseType> e30Var) {
        com.p1.mobile.putong.core.ui.purchase.c.s1(act, str, e30Var);
    }

    /* JADX INFO: renamed from: Sh */
    public void m1043Sh() {
        g4h0.d();
    }

    /* JADX INFO: renamed from: Sk */
    public boolean m1044Sk() {
        return upa.E2();
    }

    /* JADX INFO: renamed from: Sl */
    public void m1045Sl(Act act, String str, Privilege privilege, d30 d30Var, Object obj) {
        com.p1.mobile.putong.core.ui.purchase.c.D1(act, str, privilege, d30Var, obj);
    }

    /* JADX INFO: renamed from: Sm */
    public c<Optional<List<GPSkuDetails>>> m1046Sm(Context context, ArrayList<String> arrayList, boolean z, long j) {
        return igj.m7196O(context, arrayList, z, j);
    }

    /* JADX INFO: renamed from: Sn */
    public void m1047Sn(Context context, String str, int i, boolean z, String str2) {
        context.startActivity(VipAct.h2(context, str, i, z, str2));
    }

    /* JADX INFO: renamed from: So */
    public void m1048So(eyl eylVar) {
        m73.m7999o(eylVar.q1(), new C3062d(eylVar), new C3063e(eylVar), PurchaseType.TYPE_SPOTLIGHT, true);
    }

    /* JADX INFO: renamed from: Sp */
    public boolean m1049Sp() {
        return lyc0.n0();
    }

    /* JADX INFO: renamed from: Sq */
    public Intent m1050Sq(Act act, String str) {
        return ProfileAct.n2(act, str, "from_new_meet_see_feed", true);
    }

    /* JADX INFO: renamed from: T9 */
    public void m1051T9(Act act, PurchaseType purchaseType, d30 d30Var, d30 d30Var2, int i) {
        gxg0.m6895v(act, purchaseType, d30Var, d30Var2, i);
    }

    /* JADX INFO: renamed from: Ta */
    public void m1052Ta(boolean z) {
        j15.a = z;
    }

    /* JADX INFO: renamed from: Tb */
    public int m1053Tb(boolean z) {
        return zzc0.e0(z);
    }

    /* JADX INFO: renamed from: Td */
    public CharSequence m1054Td(int i) {
        return yzc0.j(i);
    }

    /* JADX INFO: renamed from: Th */
    public void m1055Th(String str) {
        wn90.F().m0(str);
    }

    /* JADX INFO: renamed from: Tj */
    public void m1056Tj(boolean z, User user, VFrame vFrame) {
    }

    /* JADX INFO: renamed from: Tl */
    public int m1057Tl(User user) {
        return tm90.d().f(user);
    }

    /* JADX INFO: renamed from: Tm */
    public int m1058Tm() {
        return iij0.b();
    }

    /* JADX INFO: renamed from: Tn */
    public int m1059Tn() {
        return gkl0.q0();
    }

    /* JADX INFO: renamed from: Tq */
    public long m1060Tq() {
        return uld0.e().l();
    }

    /* JADX INFO: renamed from: Tr */
    public boolean m1061Tr() {
        return o0x.j();
    }

    /* JADX INFO: renamed from: Ts */
    public List<String> m1062Ts(List<String> list) {
        return sa40.o().V(list);
    }

    /* JADX INFO: renamed from: U */
    public boolean m1063U() {
        return false;
    }

    /* JADX INFO: renamed from: U7 */
    public void m1064U7(Act act, SummarizedPrivilegePrice summarizedPrivilegePrice, d30 d30Var, d30 d30Var2) {
        rxg0.j().h(act, summarizedPrivilegePrice, d30Var, d30Var2);
    }

    /* JADX INFO: renamed from: Ub */
    public String m1065Ub(Media media) {
        return zub.h(media).formatted();
    }

    /* JADX INFO: renamed from: Ue */
    public void m1066Ue(Act act, boolean z) {
        ark.m5554S0(act, z);
    }

    /* JADX INFO: renamed from: Uh */
    public void m1067Uh(Act act, String str) {
        com.p1.mobile.putong.core.ui.purchase.c.F1(act, str);
    }

    /* JADX INFO: renamed from: Un */
    public String m1068Un(VirtualCardType virtualCardType) {
        return vyc0.m10400g(virtualCardType);
    }

    /* JADX INFO: renamed from: Up */
    public boolean m1069Up() {
        return OnlineMatchManager.z().A() == OnlineMatchManager.QuickChatProduce.Heartbeat;
    }

    /* JADX INFO: renamed from: V7 */
    public boolean m1070V7(double d) {
        return MessageWarmingUpHelper.r(d).value >= MessageWarmingUpHelper.WarmingUpLevel.third.value;
    }

    /* JADX INFO: renamed from: Vf */
    public boolean m1071Vf() {
        return ogl0.A() || ogl0.B();
    }

    /* JADX INFO: renamed from: Vl */
    public PurchaseType m1072Vl() {
        return a.p0();
    }

    /* JADX INFO: renamed from: W9 */
    public boolean m1073W9() {
        return false;
    }

    /* JADX INFO: renamed from: We */
    public boolean m1074We() {
        return upa.y2() || upa.A2();
    }

    /* JADX INFO: renamed from: Wf */
    public Intent m1075Wf(Context context, NavigationCardIntent navigationCardIntent, Map<String, String> map) {
        return NewMainAct.K5(context, NavigationIntent.get("cards"), navigationCardIntent, map);
    }

    /* JADX INFO: renamed from: Ws */
    public void m1076Ws(final Act act, User user, final boolean z, final boolean z2, final User user2) {
        if (user.isJailed()) {
            CoreModule.K().startJailedDialogLikeAct();
            return;
        }
        if (user.isNameFake()) {
            ark.m5556T0(act);
            return;
        }
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(HomeStatisticsHelper.ScActionFrom.MEET.toString()).isLike(true).isFromButton(false).isSuperLiked(z2).user(((DbObject) user2).id).build();
        boolean z3 = !xma.G3() && sja.r3() > 0;
        PicksUser picksUser = (PicksUser) vwb.r(CoreModule.c.k1.F3().a, new w9j() { // from class: l.o97
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((PicksUser) obj).f130id, ((DbObject) user2).id));
            }
        });
        final boolean z4 = z3;
        act.duringCreated(CoreModule.c.m0.Y7(true, z2, (Map) null, user2, "", LikeFrom.get(GiftSubBizType.mymeet), true, likeExtraDataNew_, 0, NullChecker.a(picksUser) ? picksUser.picksTracker : null)).subscribe(mkd0.H(new e30() { // from class: l.p97
            public final void call(Object obj) {
                CoreBusinessServiceIml.m915bu(z2, act, z, z4, user2, (Relationship) obj);
            }
        }, new e30() { // from class: l.q97
            public final void call(Object obj) {
                CoreBusinessServiceIml.m901Nt((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X5 */
    public boolean m1077X5() {
        return upa.X2();
    }

    /* JADX INFO: renamed from: X6 */
    public boolean m1078X6() {
        return j17.I3();
    }

    /* JADX INFO: renamed from: Xc */
    public void m1079Xc(Frag frag, String str, View view, e30<Boolean> e30Var) {
        if (upa.L3()) {
            frag.startActivityForResult(ProfileAct.n2(frag.getContext(), str, "liked_users", true), 18);
        } else {
            frag.v4(ProfileAct.n2(frag.getContext(), str, "liked_users", true), 18, new lf90(view, e30Var));
        }
    }

    /* JADX INFO: renamed from: Xi */
    public boolean m1080Xi() {
        return u59.S();
    }

    /* JADX INFO: renamed from: Xn */
    public boolean m1081Xn() {
        return false;
    }

    /* JADX INFO: renamed from: Xo */
    public View m1082Xo(Act act, ViewGroup viewGroup) {
        return act.inflater().inflate(f6c0.A8, viewGroup, false);
    }

    /* JADX INFO: renamed from: Xq */
    public int m1083Xq() {
        return tkp.i();
    }

    /* JADX INFO: renamed from: Xr */
    public Intent m1084Xr(Context context, String str) {
        return MessagesAct.i2(context, str, false, false);
    }

    /* JADX INFO: renamed from: Y3 */
    public String m1085Y3() {
        return "vip";
    }

    /* JADX INFO: renamed from: Y4 */
    public int m1086Y4() {
        return n3b0.l();
    }

    /* JADX INFO: renamed from: Y9 */
    public boolean m1087Y9() {
        return ogl0.L();
    }

    /* JADX INFO: renamed from: Yd */
    public boolean m1088Yd() {
        return ogl0.I();
    }

    /* JADX INFO: renamed from: Yf */
    public qed0.a m1089Yf(int i, int i2) {
        return obe0.b(i, i2);
    }

    /* JADX INFO: renamed from: Yj */
    public void m1090Yj(Act act, User user, VDraweeView vDraweeView, LinearLayout linearLayout) {
        act.startActivityForResultWithCustomTransition(ProfileAct.n2(act, ((DbObject) user).id, "likers", true), 18, (!(act instanceof LikersAct) || upa.L3()) ? null : new nhr(vDraweeView, linearLayout));
    }

    /* JADX INFO: renamed from: Yo */
    public void m1091Yo(boolean z) {
        myc0.d0().i = z;
    }

    /* JADX INFO: renamed from: Yp */
    public boolean m1092Yp() {
        return false;
    }

    /* JADX INFO: renamed from: Z9 */
    public int m1093Z9() {
        return 24;
    }

    /* JADX INFO: renamed from: Za */
    public void m1094Za(Act act, String str, Object obj, String str2, boolean z) {
        C3135d.a aVar = new C3135d.a(str, "meet");
        aVar.m3262m(obj).m3263n(str2).m3259j(z);
        C3135d.m3238a(act, aVar);
    }

    /* JADX INFO: renamed from: Zd */
    public void m1095Zd() {
        myc0.d0().h0();
    }

    /* JADX INFO: renamed from: Zh */
    public void m1096Zh(Act act, String str, ArrayList<String> arrayList, com.p1.mobile.android.app.a.a aVar) {
        act.startActivityForResultWithCustomTransition(CommonMediaPreviewAct.Z1(act, str, arrayList), 100, new gm5(), aVar);
    }

    /* JADX INFO: renamed from: Zi */
    public boolean m1097Zi() {
        return tae0.e();
    }

    /* JADX INFO: renamed from: Zp */
    public boolean m1098Zp() {
        return src0.r().y();
    }

    /* JADX INFO: renamed from: ad */
    public boolean m1099ad() {
        return OnlineMatchManager.z().L();
    }

    /* JADX INFO: renamed from: ah */
    public void m1100ah(eyl eylVar) {
        CoreModule.P().a().qm(eylVar.q1(), "feedBoostCard", Privilege.boost, (e30) null);
    }

    /* JADX INFO: renamed from: ai */
    public List<NewTags> m1101ai(List<OmsTagUserCounts> list) {
        return sa40.o().R(list).b();
    }

    /* JADX INFO: renamed from: aj */
    public Intent m1102aj(Context context, String str) {
        return VipLocationHistoryAct.V1(context, str);
    }

    /* JADX INFO: renamed from: al */
    public String m1103al() {
        return kk50.d();
    }

    /* JADX INFO: renamed from: an */
    public void m1104an(Frag frag, User user) {
        frag.startActivity(ProfileAct.n2(frag.getContext(), ((DbObject) user).id, "supreme_partner_customize", true));
    }

    /* JADX INFO: renamed from: ap */
    public void m1105ap(Act act, CityCData cityCData) {
        new m45(act, "").m7966K(2, cityCData, null);
    }

    /* JADX INFO: renamed from: b3 */
    public int m1106b3() {
        return a.b0();
    }

    /* JADX INFO: renamed from: b9 */
    public boolean m1107b9() {
        return true;
    }

    /* JADX INFO: renamed from: bc */
    public int m1108bc() {
        return x2c0.qm;
    }

    /* JADX INFO: renamed from: bd */
    public l5j0 m1109bd(Act act, String str, d30 d30Var, d30 d30Var2) {
        return ark.m5558U0(act, str, d30Var, d30Var2);
    }

    /* JADX INFO: renamed from: bi */
    public boolean m1110bi(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(MonetizationPromotionsId.lowPriceFirstTime12MSVIP);
    }

    /* JADX INFO: renamed from: bk */
    public String m1111bk() {
        return kk50.c();
    }

    /* JADX INFO: renamed from: c6 */
    public int m1112c6() {
        return x2c0.pp;
    }

    /* JADX INFO: renamed from: c7 */
    public String m1113c7() {
        return n740.a();
    }

    /* JADX INFO: renamed from: ca */
    public CharSequence m1114ca(User user, View view, TextView textView, int i, int i2) {
        return obe0.h(user, view, textView, i, i2);
    }

    /* JADX INFO: renamed from: cl */
    public boolean m1115cl(Activity activity) {
        return activity instanceof ProfileAct_CustomTransition;
    }

    /* JADX INFO: renamed from: cm */
    public void m1116cm(Act act, boolean z) {
        OnlineMatchManager.z().o0(act, z);
    }

    /* JADX INFO: renamed from: cn */
    public boolean m1117cn() {
        return false;
    }

    /* JADX INFO: renamed from: cr */
    public boolean m1118cr() {
        return upa.O1();
    }

    /* JADX INFO: renamed from: cu */
    public final void m1119cu(boolean z, final boolean z2, boolean z3, final d dVar, User user, final Act act) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(dVar.f().getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(user).pageId(dVar.h()).build();
        act.duringCreated(CoreModule.c.m0.Y7(z, z2, (Map) null, user, (String) null, LikeFrom.get("picks"), true, likeExtraDataNew_, 0, (String) null)).subscribe(mkd0.H(new e30() { // from class: l.k97
            public final void call(Object obj) {
                CoreBusinessServiceIml.m898Kt(dVar, z2, act, (Relationship) obj);
            }
        }, new e30() { // from class: l.l97
            public final void call(Object obj) {
                HomeStatisticsHelper.A(dVar, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: dc */
    public void m1120dc(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, int i) {
        a.x(simpleDraweeView, imageUri, i);
    }

    /* JADX INFO: renamed from: dd */
    public boolean m1121dd() {
        return ogl0.G();
    }

    /* JADX INFO: renamed from: de */
    public int m1122de() {
        return upa.b0();
    }

    /* JADX INFO: renamed from: dj */
    public boolean m1123dj() {
        return upa.e2();
    }

    /* JADX INFO: renamed from: dm */
    public void m1124dm(Act act, com.p1.mobile.android.app.a.a aVar) {
        wn90.F().a = null;
        fif.b(act, LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS, (ExpLoopInputType) null, aVar);
    }

    /* JADX INFO: renamed from: dn */
    public Intent m1125dn(Context context, boolean z, String str) {
        return VerificationCenterAct.Y1(context, z, str);
    }

    /* JADX INFO: renamed from: dp */
    public String m1126dp(long j) {
        return swh0.U(j);
    }

    /* JADX INFO: renamed from: ds */
    public boolean m1127ds() {
        return false;
    }

    /* JADX INFO: renamed from: du */
    public final /* synthetic */ void m1128du(d dVar, boolean z, boolean z2, boolean z3, User user, Act act) {
        dVar.p();
        m1119cu(z, z2, z3, dVar, user, act);
    }

    /* JADX INFO: renamed from: e2 */
    public boolean m1129e2() {
        return n3b0.q();
    }

    /* JADX INFO: renamed from: ea */
    public void m1130ea(Act act, PurchaseType purchaseType, d30 d30Var, d30 d30Var2) {
        sqb0.y0(act, purchaseType, d30Var, d30Var2);
    }

    /* JADX INFO: renamed from: eg */
    public boolean m1131eg() {
        Settings settings = CoreModule.c.e0.p9().settings;
        return settings != null && TEnum.equals(settings.getLookingFor(), "male");
    }

    /* JADX INFO: renamed from: eh */
    public void m1132eh(Act act) {
        act.startActivity(IntlVisitorsAct.Companion.a(act));
    }

    /* JADX INFO: renamed from: ei */
    public void m1133ei(String str) {
        vyc0.m10394a(str);
    }

    /* JADX INFO: renamed from: en */
    public void m1134en() {
        myc0.d0().k0();
    }

    /* JADX INFO: renamed from: eo */
    public void m1135eo(Act act, String str, d30 d30Var, d30 d30Var2) {
        CoreDlg.m2419t1(act, str, d30Var, d30Var2);
    }

    /* JADX INFO: renamed from: eu */
    public final /* synthetic */ void m1136eu(final boolean z, CounterLikeLimit counterLikeLimit, final Act act, String str, boolean z2, final boolean z3, final d dVar, final boolean z4, final User user, roj0 roj0Var) {
        if (z && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !mb90.m8137b(PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
            m1145fu(act, str, Privilege.vip_unlimited_likes, null, z2);
            return;
        }
        if (!z3 || swh0.x0() > 0) {
            if (z3 && swh0.G1(act, new d30() { // from class: l.j97
                public final void call() {
                    this.f5269a.m1128du(dVar, z, z3, z4, user, act);
                }
            })) {
                return;
            }
            Act act2 = act;
            m1119cu(z, z3, z4, dVar, user, act2);
            return;
        }
        if (!xma.L3()) {
            m1145fu(act, str, Privilege.vip_super_like, null, z2);
        } else {
            com.p1.mobile.putong.core.ui.purchase.c.F1(act, str);
            HomeStatisticsHelper.B(dVar, "failExhaustSuperlike");
        }
    }

    /* JADX INFO: renamed from: fb */
    public CharSequence m1137fb(User user) {
        return dfj.d(user);
    }

    /* JADX INFO: renamed from: ff */
    public boolean m1138ff(String str) {
        return TextUtils.equals(str, "from_picks") || TextUtils.equals(str, "from_meet_picks_feed") || TextUtils.equals(str, "from_meet_picks_card") || TextUtils.equals(str, "from_new_meet_picks_feed");
    }

    /* JADX INFO: renamed from: fg */
    public void m1139fg(final Act act) {
        e9n.m6261C(act, act.string(R.string.jm), act.string(R.string.im), act.string(R.string.gm), new Runnable() { // from class: l.b97
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                act2.startActivity(NewMainAct.M5(act2, NavigationIntent.get("setting")));
            }
        });
    }

    /* JADX INFO: renamed from: fh */
    public c<View> m1140fh(Act act) {
        if (u0n.t()) {
            return u0n.l().j(5).c(act);
        }
        return null;
    }

    /* JADX INFO: renamed from: fl */
    public void m1141fl() {
        wn90.F().a = null;
    }

    /* JADX INFO: renamed from: fm */
    public boolean m1142fm() {
        return fap.j();
    }

    /* JADX INFO: renamed from: fo */
    public int m1143fo() {
        return tkp.f();
    }

    /* JADX INFO: renamed from: fr */
    public void m1144fr(Act act, d30 d30Var, d30 d30Var2) {
        zar.g(act, d30Var, d30Var2);
    }

    /* JADX INFO: renamed from: fu */
    public final void m1145fu(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, boolean z) {
        if (z) {
            m1216r6(act, str, privilege, e30Var, null);
        } else {
            m998Lf(act, str, privilege, e30Var, null);
        }
    }

    /* JADX INFO: renamed from: g5 */
    public c<List<Merchandise>> m1146g5(Context context, List<Merchandise> list) {
        return igj.m7194M(context, list);
    }

    /* JADX INFO: renamed from: gd */
    public boolean m1147gd() {
        return lyc0.c0();
    }

    /* JADX INFO: renamed from: gl */
    public String m1148gl() {
        return "heart_confession_uid";
    }

    /* JADX INFO: renamed from: h5 */
    public boolean m1149h5() {
        return false;
    }

    /* JADX INFO: renamed from: h7 */
    public int m1150h7() {
        return 40;
    }

    /* JADX INFO: renamed from: ha */
    public void m1151ha(Act act, CityCData cityCData) {
        new m45(act, "").m7966K(3, cityCData, null);
    }

    /* JADX INFO: renamed from: hc */
    public String m1152hc(Context context, User user) {
        return rza.D0(context, user);
    }

    /* JADX INFO: renamed from: he */
    public boolean m1153he(Act act) {
        return act instanceof NewMainAct;
    }

    /* JADX INFO: renamed from: hg */
    public <T extends Act> Act.w m1154hg(T t) {
        return new MatchAct.b();
    }

    /* JADX INFO: renamed from: hl */
    public boolean m1155hl() {
        return !LoopFragmentFactory.J(LoopInputType.HEIGHT, CoreModule.c.e0.p9(), "from_explore_card_height");
    }

    /* JADX INFO: renamed from: hm */
    public boolean m1156hm() {
        return ogl0.f();
    }

    /* JADX INFO: renamed from: hn */
    public int m1157hn() {
        return iij0.a();
    }

    /* JADX INFO: renamed from: ho */
    public void m1158ho(Act act, User user) {
        bo5.m5765s(act, user);
    }

    /* JADX INFO: renamed from: hp */
    public String m1159hp() {
        return "e_card_add_tag";
    }

    /* JADX INFO: renamed from: hq */
    public boolean m1160hq(View view) {
        return view instanceof PicksHeaderView;
    }

    /* JADX INFO: renamed from: ht */
    public boolean m1161ht() {
        return false;
    }

    /* JADX INFO: renamed from: i0 */
    public c<View> m1162i0(Act act) {
        return !u0n.n() ? c.just((Object) null) : u0n.l().j(7).c(act);
    }

    /* JADX INFO: renamed from: i6 */
    public void m1163i6(Act act, String str, Privilege privilege) {
        com.p1.mobile.putong.core.ui.purchase.c.J1(act, str, privilege);
    }

    /* JADX INFO: renamed from: ij */
    public boolean m1164ij() {
        return false;
    }

    /* JADX INFO: renamed from: in */
    public void m1165in(float f) {
        CoreBusinessModule.c.R(f);
    }

    public void init(Context context) {
    }

    /* JADX INFO: renamed from: j3 */
    public boolean m1166j3() {
        return false;
    }

    /* JADX INFO: renamed from: jh */
    public boolean m1167jh() {
        return ogl0.i();
    }

    /* JADX INFO: renamed from: jj */
    public boolean m1168jj() {
        return ogl0.N();
    }

    /* JADX INFO: renamed from: jl */
    public void m1169jl(Context context, String str) {
        context.startActivity(OOFMkWebViewAct.n2(context, str));
    }

    /* JADX INFO: renamed from: jr */
    public Intent m1170jr(Context context, String str, String str2, boolean z) {
        return ProfileAct.n2(context, str, str2, z);
    }

    /* JADX INFO: renamed from: k */
    public boolean m1171k() {
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m1172k4() {
        return false;
    }

    /* JADX INFO: renamed from: kb */
    public boolean m1173kb() {
        return upa.B1();
    }

    /* JADX INFO: renamed from: kh */
    public LiteraturesComments m1174kh(String str, String str2) {
        return BookMoviesDramasHelper.m4854m(str, str2);
    }

    /* JADX INFO: renamed from: kp */
    public boolean m1175kp(boolean z) {
        return sqb0.O().U(z);
    }

    /* JADX INFO: renamed from: l1 */
    public void m1176l1(Act act, String str) {
        com.p1.mobile.putong.core.ui.purchase.c.A1(act, str);
    }

    /* JADX INFO: renamed from: l6 */
    public boolean m1177l6() {
        return upa.w2();
    }

    /* JADX INFO: renamed from: lc */
    public boolean m1178lc() {
        return false;
    }

    /* JADX INFO: renamed from: lh */
    public boolean m1179lh() {
        return upa.Q2();
    }

    /* JADX INFO: renamed from: lq */
    public String m1180lq() {
        return upa.J0();
    }

    /* JADX INFO: renamed from: lr */
    public c<View> m1181lr(Act act) {
        if (u0n.t()) {
            return u0n.l().j(8).c(act);
        }
        return null;
    }

    /* JADX INFO: renamed from: ls */
    public double m1182ls() {
        return ogl0.e();
    }

    /* JADX INFO: renamed from: m2 */
    public boolean m1183m2() {
        return false;
    }

    /* JADX INFO: renamed from: m3 */
    public boolean m1184m3() {
        return false;
    }

    /* JADX INFO: renamed from: m7 */
    public boolean m1185m7() {
        return ogl0.D();
    }

    /* JADX INFO: renamed from: m9 */
    public int m1186m9() {
        return swh0.s0();
    }

    /* JADX INFO: renamed from: mb */
    public String m1187mb() {
        return fap.i().h();
    }

    /* JADX INFO: renamed from: me */
    public lwl m1188me(Act act) {
        return new r2y(act);
    }

    /* JADX INFO: renamed from: mh */
    public void m1189mh(eyl eylVar, Active active) {
        C3061c c3061c = new C3061c(eylVar);
        Act actQ1 = eylVar.q1();
        PurchaseType purchaseType = PurchaseType.TYPE_GET_LIKERS;
        mc60.a(eylVar.q1(), purchaseType, true, active.skuId, (String) null, new qlw(actQ1, purchaseType, c3061c));
    }

    /* JADX INFO: renamed from: mi */
    public String m1190mi(int i) {
        return dfj.b(i);
    }

    /* JADX INFO: renamed from: mo */
    public boolean m1191mo() {
        return u59.Q();
    }

    /* JADX INFO: renamed from: mt */
    public Intent m1192mt(Act act, String str) {
        return ProfileAct.n2(act, str, "from_new_meet_picks_feed", true);
    }

    /* JADX INFO: renamed from: n8 */
    public Intent m1193n8(Act act, ArrayList<String> arrayList, int i, ArrayList<String> arrayList2, String str) {
        return MatchAct.g2(act, arrayList, i, arrayList2, str);
    }

    /* JADX INFO: renamed from: nk */
    public Intent m1194nk(Context context, String str, int i) {
        return VipAct.e2(context, str, i);
    }

    /* JADX INFO: renamed from: nr */
    public int m1195nr() {
        return 41;
    }

    /* JADX INFO: renamed from: o6 */
    public boolean m1196o6() {
        return a.V();
    }

    /* JADX INFO: renamed from: oc */
    public String m1197oc() {
        return ogl0.c();
    }

    /* JADX INFO: renamed from: og */
    public void m1198og() {
        su4.g();
    }

    /* JADX INFO: renamed from: oi */
    public j760<String, String> m1199oi(int i) {
        return tae0.g(i);
    }

    /* JADX INFO: renamed from: op */
    public void m1200op(@NonNull Act act, final d30 d30Var) {
        new com.p1.mobile.putong.core.ui.purchase.b.d(act).c(1).h(new g30() { // from class: l.z87
            /* JADX INFO: renamed from: a */
            public final void m11358a(Object obj, Object obj2, Object obj3) {
                d30Var.call();
            }
        }).d("picks").l(PurchaseType.TYPE_PICKS).p();
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m1201p0() {
        return upa.y2();
    }

    /* JADX INFO: renamed from: pf */
    public boolean m1202pf(Context context) {
        return context instanceof VipAct;
    }

    /* JADX INFO: renamed from: pg */
    public void m1203pg(Act act, g30<PurchaseType, Act, String> g30Var, int i, String str) {
        gxg0.m6897x(act, g30Var, i, str);
    }

    /* JADX INFO: renamed from: pi */
    public String m1204pi(int i) {
        return dfj.c(i);
    }

    /* JADX INFO: renamed from: pl */
    public void m1205pl(Act act, String str, View view, boolean z) {
        act.startActivityForResultWithCustomTransition(ProfileAct.n2(act, str, "from_intl_meet_likers", true), z ? 82 : 81, new lf90(view, new e30() { // from class: l.r97
            public final void call(Object obj) {
                CoreBusinessServiceIml.m894Gt((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: pp */
    public void m1206pp(Act act) {
        CoreDlg.m2413r1(act);
    }

    /* JADX INFO: renamed from: pr */
    public void m1207pr(Act act, String str, Privilege privilege) {
        com.p1.mobile.putong.core.ui.purchase.c.x0(act, str, privilege);
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m1208q0() {
        return upa.J3();
    }

    /* JADX INFO: renamed from: q6 */
    public void m1209q6(Act act, String str, e30<PurchaseType> e30Var) {
        com.p1.mobile.putong.core.ui.purchase.c.u1(act, str, e30Var);
    }

    /* JADX INFO: renamed from: qb */
    public void m1210qb(Act act, String str, View view) {
        if (upa.L3()) {
            act.startActivityForResult(ProfileAct.n2(act, str, "from_new_meet_likers", true), 25);
        } else {
            act.startActivityForResultWithCustomTransition(ProfileAct.n2(act, str, "from_new_meet_likers", true), 25, new lf90(view, new e30() { // from class: l.y87
                public final void call(Object obj) {
                    CoreBusinessServiceIml.m897Jt((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: qd */
    public void m1211qd(Context context, String str, String str2) {
        context.startActivity(VipAct.e2(context, str, khl0.a(str2)));
    }

    /* JADX INFO: renamed from: qj */
    public String m1212qj(User user) {
        return String.format("%1$s · %2$s", a.H(user), i0g0.j0(user.profile.zodiac));
    }

    /* JADX INFO: renamed from: qk */
    public void m1213qk(Act act) {
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).Z5().l0();
        }
    }

    /* JADX INFO: renamed from: qm */
    public void m1214qm(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var) {
        com.p1.mobile.putong.core.ui.purchase.c.y0(act, str, privilege, (PurchaseType) null, e30Var);
    }

    /* JADX INFO: renamed from: qt */
    public boolean m1215qt() {
        return swh0.v();
    }

    /* JADX INFO: renamed from: r6 */
    public void m1216r6(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, d30 d30Var) {
        com.p1.mobile.putong.core.ui.purchase.c.L0(act, str, e30Var, d30Var, (d30) null, privilege);
    }

    /* JADX INFO: renamed from: rc */
    public boolean m1217rc() {
        return upa.A2();
    }

    /* JADX INFO: renamed from: rd */
    public void m1218rd(eyl eylVar) {
        if (g83.m6609b()) {
            osi0.g(eylVar.Y1(R.string.Us));
        } else if (swh0.l0() > 0) {
            f73.m6455z(eylVar.q1(), new C3059a(eylVar), Privilege.minBoost);
        } else {
            new fd5.e(eylVar.q1()).j(PurchaseType.TYPE_INTL_TTT_COIN).d("e_intl_boost_trial_card").i(Privilege.minBoost).c(1).g(new C3060b(eylVar)).l();
        }
    }

    /* JADX INFO: renamed from: re */
    public int m1219re() {
        return 25;
    }

    /* JADX INFO: renamed from: ri */
    public boolean m1220ri() {
        return myc0.d0().e0();
    }

    /* JADX INFO: renamed from: rj */
    public Intent m1221rj(Act act, String str) {
        return ConversationSearchAct.c2(act, str);
    }

    /* JADX INFO: renamed from: rl */
    public CharSequence m1222rl(Merchandise merchandise, @ColorInt int i) {
        return w6h0.j().h(merchandise, i);
    }

    /* JADX INFO: renamed from: rn */
    public void m1223rn(User user, Frag frag) {
        frag.startActivityForResult(ProfileAct.n2(frag.getContext(), ((DbObject) user).id, "likers", true), 18);
    }

    /* JADX INFO: renamed from: s */
    public boolean m1224s() {
        return upa.h3();
    }

    /* JADX INFO: renamed from: s3 */
    public boolean m1225s3() {
        return false;
    }

    /* JADX INFO: renamed from: s6 */
    public boolean m1226s6() {
        return false;
    }

    /* JADX INFO: renamed from: s7 */
    public void m1227s7(Act act, String str, View view, e30<Boolean> e30Var) {
        if (upa.L3()) {
            act.startActivityForResult(ProfileAct.n2(act, str, "liked_users", true), 18);
        } else {
            act.startActivityForResultWithCustomTransition(ProfileAct.n2(act, str, "liked_users", true), 18, new lf90(view, e30Var));
        }
    }

    /* JADX INFO: renamed from: s8 */
    public boolean m1228s8() {
        return n3b0.o();
    }

    /* JADX INFO: renamed from: sf */
    public boolean m1229sf() {
        return false;
    }

    public void showSeeDialog(Act act, d30 d30Var, String str) {
        com.p1.mobile.putong.core.ui.purchase.c.C1(act, str, Privilege.see_who_likes_me, d30Var);
    }

    /* JADX INFO: renamed from: si */
    public boolean m1230si() {
        return false;
    }

    /* JADX INFO: renamed from: sk */
    public int m1231sk(String str) {
        return khl0.a(str);
    }

    /* JADX INFO: renamed from: sl */
    public String m1232sl() {
        return upa.t0();
    }

    /* JADX INFO: renamed from: sp */
    public void m1233sp(final Act act) {
        if (swh0.v() && swh0.p0().c1()) {
            swh0.B1(act, PurchaseType.TYPE_GET_BOOST, new d30() { // from class: l.c97
                public final void call() {
                    CoreBusinessServiceIml.m904Qt(act);
                }
            }, (d30) null);
        } else {
            x93.m10703d(act, true);
        }
    }

    /* JADX INFO: renamed from: ss */
    public void m1234ss(User user, VDraweeView vDraweeView, LinearLayout linearLayout, Act act) {
        act.startActivityForResultWithCustomTransition(ProfileAct.n2(act, ((DbObject) user).id, "likers", true), 18, (!(act instanceof LikersAct) || upa.L3()) ? null : new nhr(vDraweeView, linearLayout));
    }

    /* JADX INFO: renamed from: st */
    public void m1235st(Act act, String str, CharSequence charSequence, String str2, String str3, int i, int i2, int i3, boolean z, ViewOutlineProvider viewOutlineProvider, cwf0 cwf0Var, final d30 d30Var, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        x7y x7yVarM10690t = new x7y.C3477a(act).m10687D(str).m10686C(charSequence).m10684A(false).m10694x(str2, new e30() { // from class: l.e97
            public final void call(Object obj) {
                d30Var.call();
            }
        }).m10692v(str3, new e30() { // from class: l.f97
            public final void call(Object obj) {
                CoreBusinessServiceIml.m912Yt((x7y) obj);
            }
        }).m10696z(z).m10693w(i, onCheckedChangeListener).m10690t();
        if (x7yVarM10690t == null || x7yVarM10690t.m10659g() == null) {
            return;
        }
        if (NullChecker.a(x7yVarM10690t.m10659g().f1341a)) {
            x7yVarM10690t.m10659g().f1341a.setOutlineProvider(viewOutlineProvider);
            x7yVarM10690t.m10659g().f1341a.setClipToOutline(true);
        }
        x7yVarM10690t.m10659g().m2474F(i2);
        x7yVarM10690t.m10659g().m2483R(i3);
        if (NullChecker.a(x7yVarM10690t.m10659g().f1343c)) {
            xdl0.C0(x7yVarM10690t.m10659g().f1343c, t100.d(250.0f));
        }
        x7yVarM10690t.m10659g().m2497j0();
        x7yVarM10690t.m10659g().m2494f0(hvc0.a(w0c0.u0));
        x7yVarM10690t.m10665m(cwf0Var);
        x7yVarM10690t.m10666n();
    }

    /* JADX INFO: renamed from: ta */
    public boolean m1236ta() {
        return false;
    }

    /* JADX INFO: renamed from: tc */
    public String m1237tc() {
        return "https://auto.tancdn.com/v1/raw/bd3b6c84-2d79-4eb5-928f-4dc06d19cdf513.pdf";
    }

    /* JADX INFO: renamed from: tk */
    public void m1238tk(final Act act) {
        e9n.m6261C(act, act.string(R.string.L5), act.string(R.string.K5), act.string(R.string.gm), new Runnable() { // from class: l.d97
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                act2.startActivity(NewMainAct.M5(act2, NavigationIntent.get("setting")));
            }
        });
    }

    /* JADX INFO: renamed from: tn */
    public String m1239tn() {
        return o0x.m();
    }

    /* JADX INFO: renamed from: ts */
    public boolean m1240ts(int i) {
        return g83.m6610c(i);
    }

    /* JADX INFO: renamed from: tt */
    public boolean m1241tt() {
        return upa.d();
    }

    /* JADX INFO: renamed from: u5 */
    public boolean m1242u5() {
        return r3l0.c();
    }

    /* JADX INFO: renamed from: ug */
    public void m1243ug(Activity activity, Uri uri) {
        lva.D(activity, uri);
    }

    /* JADX INFO: renamed from: uh */
    public boolean m1244uh() {
        return false;
    }

    /* JADX INFO: renamed from: um */
    public c<String> m1245um() {
        return OnlineMatchManager.z().D();
    }

    /* JADX INFO: renamed from: un */
    public boolean m1246un() {
        return false;
    }

    /* JADX INFO: renamed from: uo */
    public void m1247uo(Throwable th) {
        gak.c(th);
    }

    /* JADX INFO: renamed from: v4 */
    public boolean m1248v4() {
        return upa.z();
    }

    /* JADX INFO: renamed from: v7 */
    public void m1249v7(Act act, User user, int i, boolean z) {
        abi.m5325L(act, user, i, z);
    }

    /* JADX INFO: renamed from: vb */
    public boolean m1250vb(User user, CoreLikers.a aVar) {
        return false;
    }

    /* JADX INFO: renamed from: vc */
    public int m1251vc() {
        return lyc0.m0();
    }

    /* JADX INFO: renamed from: vh */
    public void m1252vh(Act act) {
        CoreDlg.m2303G1(act, act.string(R.string.yr), act.string(R.string.Tr), x2c0.u8, act.string(R.string.Sr), null, false, null, null, null, null, true, false, null, null, false);
    }

    /* JADX INFO: renamed from: vl */
    public nx0 m1253vl(PutongCoreAct putongCoreAct) {
        return new bpb(putongCoreAct);
    }

    /* JADX INFO: renamed from: vo */
    public String m1254vo(String str) {
        if (TextUtils.equals(str, "from_meet_picks_feed") || TextUtils.equals(str, "from_new_meet_picks_feed") || TextUtils.equals(str, "from_meet_picks_card")) {
            return "p_meet_view,e_picks_feed_card,like_swipe";
        }
        return (TextUtils.equals(str, "from_meet_feed") || TextUtils.equals(str, "from_meet_profile")) ? "p_meet_view,e_whoiliked_card,sayhi_superlike" : "p_meet_view,e_meet_card_sayhi,click";
    }

    /* JADX INFO: renamed from: vs */
    public void m1255vs(eyl eylVar, String str, FreeTrialOperateResult freeTrialOperateResult) {
        if (!"success".equals(freeTrialOperateResult.operateResult)) {
            if (vwb.L(freeTrialOperateResult.msg)) {
                return;
            }
            osi0.g(freeTrialOperateResult.msg);
            return;
        }
        vyc0.m10413t(eylVar.q1(), str, eylVar.u0());
        CoreModule.c.F0.q3();
        CoreModule.c.m0.Q5();
        CoreModule.c.m0.R5();
        CoreModule.c.m0.m8();
        if (VisitorSortType.realUser.equals(str)) {
            uyc0.l0().q0(true);
            uyc0.l0().p0(true);
        } else if ("online".equals(str)) {
            uyc0.l0().n0(true);
        }
    }

    /* JADX INFO: renamed from: w */
    public boolean m1256w() {
        return upa.L3();
    }

    /* JADX INFO: renamed from: w6 */
    public boolean m1257w6() {
        return hmb.m7030p1();
    }

    /* JADX INFO: renamed from: wa */
    public void m1258wa(String str) {
        wn90.F().w(str);
    }

    /* JADX INFO: renamed from: we */
    public c<HometownSuggest> m1259we() {
        return co90.g();
    }

    /* JADX INFO: renamed from: wh */
    public void m1260wh(Act act, String str, e30<PurchaseType> e30Var, d30 d30Var, d30 d30Var2, Privilege privilege) {
        com.p1.mobile.putong.core.ui.purchase.c.a0(act, str, e30Var, d30Var, d30Var2, privilege);
    }

    /* JADX INFO: renamed from: wi */
    public void m1261wi(Act act, boolean z) {
        x93.m10703d(act, z);
    }

    /* JADX INFO: renamed from: wk */
    public void m1262wk(User user) {
        n3b0.x(user);
    }

    /* JADX INFO: renamed from: wp */
    public String m1263wp() {
        return kk50.c();
    }

    /* JADX INFO: renamed from: wr */
    public void m1264wr(Act act, String str, Privilege privilege) {
        com.p1.mobile.putong.core.ui.purchase.c.B1(act, str, privilege);
    }

    /* JADX INFO: renamed from: ws */
    public long m1265ws() {
        return n3b0.i();
    }

    /* JADX INFO: renamed from: wt */
    public void m1266wt(Act act, String str, Act.w wVar) {
        if (upa.L3()) {
            act.startActivityForResult(ProfileAct.n2(act, str, "from_picks", true), 24);
        } else {
            act.startActivityForResultWithCustomTransition(ProfileAct.n2(act, str, "from_picks", true), 24, wVar);
        }
    }

    /* JADX INFO: renamed from: x8 */
    public c<View> m1267x8(Act act, d30 d30Var) {
        if (u0n.q()) {
            return u0n.l().j(9).a(act, d30Var);
        }
        return null;
    }

    /* JADX INFO: renamed from: xb */
    public String m1268xb() {
        return kyc0.b();
    }

    /* JADX INFO: renamed from: xg */
    public void m1269xg(Act act) {
        act.startActivity(IntlMeetAct.Y1(act, "", "visitor"));
    }

    /* JADX INFO: renamed from: xo */
    public ProfileCompletionConfig m1270xo() {
        return upa.p();
    }

    /* JADX INFO: renamed from: ye */
    public void m1271ye(Act act, g30<PurchaseType, Act, String> g30Var) {
        new fd5.e(act).j(PurchaseType.TYPE_INTL_TTT_COIN).c(17).d("p_knowmyself_purchase,e_knowmyself_test,click").g(g30Var).l();
    }

    /* JADX INFO: renamed from: yl */
    public CharSequence m1272yl(User user) {
        return obe0.d(user);
    }

    /* JADX INFO: renamed from: z1 */
    public boolean m1273z1() {
        return false;
    }

    /* JADX INFO: renamed from: z6 */
    public int m1274z6() {
        return tkp.e();
    }

    /* JADX INFO: renamed from: z7 */
    public boolean m1275z7() {
        return aa3.m5305f();
    }

    /* JADX INFO: renamed from: z9 */
    public boolean m1276z9() {
        return a.U();
    }

    /* JADX INFO: renamed from: za */
    public qed0.a m1277za(int i, int i2) {
        return obe0.j(i, i2);
    }

    /* JADX INFO: renamed from: zc */
    public int m1278zc(Relationship relationship) {
        if (relationship.status.size() != 0 && TEnum.equals((MatchFrom) relationship.status.get(0), "superLikedEach")) {
            return 13;
        }
        if (relationship.status.size() == 0 || !TEnum.equals((MatchFrom) relationship.status.get(0), "superLiked")) {
            return (relationship.status.size() == 0 || !TEnum.equals((MatchFrom) relationship.status.get(0), "secretcrush")) ? 0 : 1;
        }
        return 11;
    }

    /* JADX INFO: renamed from: zg */
    public boolean m1279zg() {
        return ke50.a();
    }

    /* JADX INFO: renamed from: zi */
    public boolean m1280zi(Act act) {
        return false;
    }

    /* JADX INFO: renamed from: zj */
    public String m1281zj(@NonNull User user) {
        return NullChecker.b(user.fp()) ? user.fp().profileSize(t100.O).formatted() : "";
    }

    /* JADX INFO: renamed from: zq */
    public void m1282zq(Act act, boolean z) {
        zbi0.O(act, z);
    }
}
