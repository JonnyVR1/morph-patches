package com.p046p1.mobile.putong.core.module;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.PutongCoreAct;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.CityCBanner;
import com.p046p1.mobile.putong.core.data.CityCData;
import com.p046p1.mobile.putong.core.data.FreeTrialOperateResult;
import com.p046p1.mobile.putong.core.data.HometownSuggest;
import com.p046p1.mobile.putong.core.data.LikedUser;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.data.PicksUser;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProfileCompletionConfig;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.RoamedLocationData;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegePrice;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.SwitchConvNextConfig;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.data.VisitorSortType;
import com.p046p1.mobile.putong.core.map.IntlMapAct;
import com.p046p1.mobile.putong.core.module.CoreBusinessServiceIml;
import com.p046p1.mobile.putong.core.newui.fake.C7846b;
import com.p046p1.mobile.putong.core.newui.greet.DynamicGreetListAct;
import com.p046p1.mobile.putong.core.newui.home.C7994d;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.newui.home.marrymode.MarrModeProfileCardView;
import com.p046p1.mobile.putong.core.newui.intlmeet.IntlMeetAct;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.messages.OOFMkWebViewAct;
import com.p046p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import com.p046p1.mobile.putong.core.newui.messages.search.ConversationSearchAct;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.core.p053ui.greet.C8360d;
import com.p046p1.mobile.putong.core.p053ui.home.VirtualCard;
import com.p046p1.mobile.putong.core.p053ui.intl.visitor.IntlVisitorsAct;
import com.p046p1.mobile.putong.core.p053ui.likedusers.LikedUsersAct;
import com.p046p1.mobile.putong.core.p053ui.likedusers.tablayout.NewMyLikedUsersAct;
import com.p046p1.mobile.putong.core.p053ui.match.C8455a;
import com.p046p1.mobile.putong.core.p053ui.match.C8456b;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.core.p053ui.mediapreview.CommonMediaPreviewAct;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemBase;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.helper.MessageWarmingUpHelper;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchManager;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct_CustomTransition;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8761b;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.report.ReportAct;
import com.p046p1.mobile.putong.core.p053ui.svip.SVIPRefundAct;
import com.p046p1.mobile.putong.core.p053ui.verification.VerificationCenterAct;
import com.p046p1.mobile.putong.core.p053ui.vip.VipAct;
import com.p046p1.mobile.putong.core.p053ui.vip.VipLocationHistoryAct;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAct;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.PicksHelper;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.header.PicksHeaderView;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.VipBaseFrag;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p046p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CounterLikeLimit;
import com.p046p1.mobile.putong.data.GPSkuDetails;
import com.p046p1.mobile.putong.data.LikeExtraData;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.NavigationCardIntent;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.OmsTagUserCounts;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.QualificationType;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Visitor;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VFrame;
import p149l.aa3;
import p149l.abi;
import p149l.ak50;
import p149l.aqo;
import p149l.ark;
import p149l.bo5;
import p149l.bpb;
import p149l.co5;
import p149l.co90;
import p149l.cwf0;
import p149l.d30;
import p149l.dfj;
import p149l.duj0;
import p149l.e30;
import p149l.e9n;
import p149l.eyl;
import p149l.f1m;
import p149l.f5m;
import p149l.f6c0;
import p149l.f73;
import p149l.fap;
import p149l.fd5;
import p149l.fif;
import p149l.ft4;
import p149l.g30;
import p149l.g4h0;
import p149l.g83;
import p149l.gak;
import p149l.gkl0;
import p149l.gm5;
import p149l.gxg0;
import p149l.hmb;
import p149l.hqo;
import p149l.hvc0;
import p149l.i0e;
import p149l.i0g0;
import p149l.igj;
import p149l.iij0;
import p149l.j15;
import p149l.j17;
import p149l.j760;
import p149l.ke50;
import p149l.khl0;
import p149l.kk50;
import p149l.kyc0;
import p149l.l5j0;
import p149l.lf90;
import p149l.ljl0;
import p149l.lva;
import p149l.lwl;
import p149l.lyc0;
import p149l.m45;
import p149l.m73;
import p149l.mb90;
import p149l.mc60;
import p149l.mkd0;
import p149l.myc0;
import p149l.myf;
import p149l.n3b0;
import p149l.n740;
import p149l.nhr;
import p149l.nvb0;
import p149l.nx0;
import p149l.o0x;
import p149l.obe0;
import p149l.ogl0;
import p149l.osi0;
import p149l.qed0;
import p149l.qlw;
import p149l.r2y;
import p149l.r3l0;
import p149l.roj0;
import p149l.rxg0;
import p149l.rza;
import p149l.sa40;
import p149l.sja;
import p149l.sqb0;
import p149l.src0;
import p149l.su4;
import p149l.swh0;
import p149l.t100;
import p149l.tae0;
import p149l.tkp;
import p149l.tm90;
import p149l.tvf;
import p149l.u0n;
import p149l.u59;
import p149l.ue50;
import p149l.uld0;
import p149l.upa;
import p149l.ura;
import p149l.uyc0;
import p149l.v87;
import p149l.v9j;
import p149l.vwb;
import p149l.vyc0;
import p149l.w0c0;
import p149l.w6h0;
import p149l.w8e0;
import p149l.w9j;
import p149l.wn90;
import p149l.wvv;
import p149l.x2c0;
import p149l.x7y;
import p149l.x93;
import p149l.xdl0;
import p149l.xi1;
import p149l.xma;
import p149l.xsy;
import p149l.yij0;
import p149l.yzc0;
import p149l.zar;
import p149l.zbi0;
import p149l.zub;
import p149l.zvf0;
import p149l.zzc0;

/* JADX INFO: loaded from: classes10.dex */
@Route(name = "CoreBusinessService", path = "/core_business/service")
public class CoreBusinessServiceIml implements CoreBusinessService, v87 {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.module.CoreBusinessServiceIml$a */
    public class C7827a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ eyl f21196a;

        public C7827a(eyl eylVar) {
            this.f21196a = eylVar;
        }

        @Override // p149l.d30
        public void call() {
            x93.m207470f(this.f21196a.mo36758q1(), true, x93.m207467c(), false, Privilege.minBoost);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.module.CoreBusinessServiceIml$b */
    public class C7828b implements g30<PurchaseType, Act, String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ eyl f21198a;

        public C7828b(eyl eylVar) {
            this.f21198a = eylVar;
        }

        @Override // p149l.g30
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo36055a(PurchaseType purchaseType, Act act, String str) {
            x93.m207470f(this.f21198a.mo36758q1(), true, x93.m207467c(), false, Privilege.minBoost);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.module.CoreBusinessServiceIml$c */
    public class C7829c implements f1m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ eyl f21200a;

        public C7829c(eyl eylVar) {
            this.f21200a = eylVar;
        }

        @Override // p149l.f1m
        /* JADX INFO: renamed from: d */
        public boolean mo36057d() {
            return true;
        }

        @Override // p149l.f1m
        /* JADX INFO: renamed from: e */
        public boolean mo36058e() {
            this.f21200a.mo36746V(SwipeDirection.RIGHT);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.module.CoreBusinessServiceIml$d */
    public class C7830d implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ eyl f21202a;

        public C7830d(eyl eylVar) {
            this.f21202a = eylVar;
        }

        @Override // p149l.d30
        public void call() {
            osi0.m165783g(this.f21202a.mo36748Y1(R$string.f17786H9));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.module.CoreBusinessServiceIml$e */
    public class C7831e implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ eyl f21204a;

        public C7831e(eyl eylVar) {
            this.f21204a = eylVar;
        }

        @Override // p149l.d30
        public void call() {
            this.f21204a.mo36746V(SwipeDirection.RIGHT);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.module.CoreBusinessServiceIml$f */
    public class C7832f implements ue50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f21206a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d30 f21207b;

        public C7832f(d30 d30Var, d30 d30Var2) {
            this.f21206a = d30Var;
            this.f21207b = d30Var2;
        }

        @Override // p149l.ue50
        /* JADX INFO: renamed from: a */
        public void mo30845a() {
            if (NullChecker.m81303a(this.f21207b)) {
                this.f21207b.call();
            }
        }

        @Override // p149l.ue50
        /* JADX INFO: renamed from: c */
        public void mo30846c() {
            if (NullChecker.m81303a(this.f21206a)) {
                this.f21206a.call();
            }
        }
    }

    /* JADX INFO: renamed from: Gt */
    public static /* synthetic */ void m36027Gt(Boolean bool) {
    }

    /* JADX INFO: renamed from: Jt */
    public static /* synthetic */ void m36030Jt(Boolean bool) {
    }

    /* JADX INFO: renamed from: Kt */
    public static /* synthetic */ void m36031Kt(C7994d c7994d, boolean z, Act act, Relationship relationship) {
        HomeStatisticsHelper.m36688B(c7994d, "success");
        if (!TEnum.equals(relationship.state, "matched")) {
            if (z) {
                rxg0.m181562L(act);
                return;
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

    /* JADX INFO: renamed from: Mt */
    public static /* synthetic */ void m36033Mt(Act act) {
        zvf0.m220396r("e_avatarVerification_explain_click", "p_avatarVerification_icon_explain_guide_Unverified");
        if (TEnum.equals(CoreModule.f17545c.f19552B0.m31620s4(), "pending")) {
            CoreDlg.m44987G1(act, act.string(R$string.f17864Jr), act.string(R$string.f17834Ir), x2c0.f190654vj, act.string(R$string.f19076xr), null, false, null, null, null, null, true, false, null, null, false);
        } else {
            tvf.m190730h(act, OMSTemplateType.dialog);
        }
    }

    /* JADX INFO: renamed from: Nt */
    public static /* synthetic */ void m36034Nt(Throwable th) {
        if (sja.m184461r3() > 0) {
            CoreModule.f17545c.f19555C0.m210112u4();
        }
    }

    /* JADX INFO: renamed from: Ot */
    public static /* synthetic */ void m36035Ot(e30 e30Var) {
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: Qt */
    public static /* synthetic */ void m36037Qt(Act act) {
        swh0.m186255p0().m186299S0();
        x93.m207468d(act, true);
    }

    /* JADX INFO: renamed from: Tt */
    public static /* synthetic */ void m36040Tt(Boolean bool) {
    }

    /* JADX INFO: renamed from: Wt */
    public static /* synthetic */ void m36043Wt(e30 e30Var) {
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: Xt */
    public static /* synthetic */ void m36044Xt() {
        CoreModule.f17545c.f19658k1.m184462A3();
        CoreModule.f17545c.f19555C0.m210112u4();
    }

    /* JADX INFO: renamed from: Yt */
    public static /* synthetic */ void m36045Yt(x7y x7yVar) {
    }

    /* JADX INFO: renamed from: bu */
    public static /* synthetic */ void m36048bu(boolean z, Act act, boolean z2, boolean z3, User user, Relationship relationship) {
        CoreModule.f17545c.f19658k1.m184462A3();
        int i = 1;
        if (TEnum.equals(relationship.state, "matched")) {
            if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get(MatchFrom.superLikedEach)) {
                i = 13;
            } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get(MatchFrom.superLiked)) {
                i = z ? 12 : 11;
            } else if (relationship.status.size() == 0 || relationship.status.get(0) != MatchFrom.get("secretcrush")) {
                i = 0;
            }
            act.startActivityWithCustomTransition(MatchAct.m47563e2(act, vwb.m200324f0(relationship.f38806id), i, new ArrayList()), new MatchAct.C8454b());
        } else if (z2) {
            if (z) {
                if (z3) {
                    PicksHelper.m56726o(act, user, true);
                    CoreModule.f17545c.f19555C0.m210112u4();
                } else {
                    rxg0.m181562L(act);
                }
            } else if (z3) {
                PicksHelper.m56726o(act, user, false);
                CoreModule.f17545c.f19555C0.m210112u4();
            }
        }
        if (ura.m195053e().m195057d().mo33922t() && z3) {
            CoreModule.f17545c.f19663m0.m31094d9();
        }
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: A4 */
    public void mo33280A4(Act act) {
        CoreBusinessModule.m29908m0().mo190513A4(act);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: A7 */
    public Intent mo33281A7(Act act) {
        return NewMainAct.m39685I5(act, NavigationIntent.get("cards"));
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: A9 */
    public void mo33282A9(Act act, String str) {
        ft4.m123008b().m123012e(act, str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ab */
    public boolean mo33283Ab(PurchaseType purchaseType) {
        return xi1.m208911b(purchaseType);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ad */
    public void mo33284Ad(Act act, String str, View view, e30<Boolean> e30Var) {
        act.startActivityForResultWithCustomTransition(ProfileAct.m50736n2(act, str, "from_intl_meet", true), 18, new lf90(view, e30Var));
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ak */
    public boolean mo33285Ak(List<OmsTagUserCounts> list) {
        return sa40.m182802o().m182820R(list).f163299a;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Al */
    public String mo33286Al(Media media) {
        return zub.m220207f(media).formatted();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ao */
    public void mo33287Ao(final boolean z, final boolean z2, final boolean z3, final User user, final Act act, final String str, final boolean z4) {
        final C7994d c7994dM36699e = HomeStatisticsHelper.m36699e("p_vas_paid_recovery_pop", z3, z, z2, user);
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9)) {
            c7994dM36699e.f22979h = HomeStatisticsHelper.ScActionFrom.INTL_RECOVERY_POP;
            final CounterLikeLimit counterLikeLimit = CoreModule.f17545c.m31484o3().likeLimit;
            if (userM169527p9.isJailed()) {
                CoreModule.m29932K().startJailedDialogLikeAct();
                HomeStatisticsHelper.m36688B(c7994dM36699e, "failJailedUser");
            } else if (!userM169527p9.isNameFake()) {
                act.duringCreated((C22306c) CoreModule.f17545c.f19555C0.m210112u4().flatMap(new w9j() { // from class: l.g97
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return CoreModule.f17545c.f19639e0.m169397H9();
                    }
                })).subscribe(mkd0.m154955G(new e30() { // from class: l.i97
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f112118a.m36053eu(z, counterLikeLimit, act, str, z4, z2, c7994dM36699e, z3, user, (roj0) obj);
                    }
                }));
            } else {
                HomeStatisticsHelper.m36688B(c7994dM36699e, "failFakeUser");
                ark.m98449T0(act);
            }
        }
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: B7 */
    public boolean mo33288B7() {
        return upa.m194851z3();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: B9 */
    public float mo33289B9() {
        return VSwipeCard.f20276C;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Bb */
    public void mo33290Bb(Act act) {
        m73.m153327g(act);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Bc */
    public CharSequence mo33291Bc(User user, Context context, int[] iArr) {
        return obe0.m163421c(user, context, iArr);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Be */
    public void mo33292Be() {
        xsy.f194325g.m132487l(roj0.f160388a);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Bn */
    public long mo33293Bn() {
        return n3b0.m157733g();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Bp */
    public void mo33294Bp(PutongFrag putongFrag, int i) {
        if ((putongFrag instanceof VipNewUiFrag) && i == 2) {
            ((VipNewUiFrag) putongFrag).m57500S4();
        }
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: C7 */
    public void mo33295C7(Act act, CityCBanner cityCBanner) {
        new m45(act, "").m153003K(1, null, cityCBanner);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: C9 */
    public void mo33296C9(View view, BusinessEntranceStyle businessEntranceStyle) {
        ((PicksHeaderView) view).m56823b((businessEntranceStyle == BusinessEntranceStyle.PICKS && PicksHelper.INSTANCE.m56740b().m56736n()) ? PicksHelper.HeaderType.EXPAND : PicksHelper.HeaderType.HIDE);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Cc */
    public Act.AbstractC4304w mo33297Cc(View view, e30<Boolean> e30Var) {
        return new lf90(view, e30Var);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Cj */
    public String mo33298Cj() {
        return "https://auto.tancdn.com/v1/raw/bd957249-2f80-4f31-adcd-a3eefc6afbad12.svga";
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ck */
    public int mo33299Ck() {
        return 18;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Cm */
    public int mo33300Cm() {
        return nvb0.m161580k();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Cs */
    public CharSequence mo33301Cs(User user, User user2) {
        return yzc0.m216635d(user, user2);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: D6 */
    public String mo33302D6() {
        return ogl0.m164251d();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Dc */
    public C22306c<View> mo33303Dc(Act act, d30 d30Var) {
        if (u0n.m191358q()) {
            return u0n.m191353l().m191362j(4).mo110210a(act, d30Var);
        }
        return null;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: De */
    public boolean mo33304De() {
        return upa.m194819t1();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Dl */
    public void mo33305Dl(Act act, User user, String str, d30 d30Var) {
        C8456b.m47635n(act, user, str, d30Var);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Dn */
    public boolean mo33306Dn(QualificationType qualificationType) {
        return yij0.m214932J(qualificationType);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: E5 */
    public C22306c<View> mo33307E5(Act act) {
        return !u0n.m191356o() ? C22306c.just(null) : u0n.m191353l().m191362j(6).mo100437c(act);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: E9 */
    public void mo33308E9() {
        n3b0.m157748w();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Eb */
    public void mo33309Eb(Act act) {
        ak50.m97109O().m97136H(act, "use_up");
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ef */
    public void mo33310Ef(eyl eylVar, String str) {
        sqb0.m185498O().m185547M(eylVar.mo36758q1(), str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: En */
    public boolean mo33311En() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Eo */
    public void mo33312Eo(Act act, PurchaseType purchaseType, boolean z, d30 d30Var, d30 d30Var2, String str) {
        hqo hqoVar = new hqo(act, purchaseType);
        hqoVar.m132479t(new C7832f(d30Var, d30Var2));
        hqoVar.m132475p(aqo.m98316h(act, act instanceof PutongAct ? ((PutongAct) act).iap().m148933i() : null), z, str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Eq */
    public void mo33313Eq(Act act, String str, d30 d30Var, Privilege privilege, boolean z, User user) {
        C8764c.m53412M1(act, str, privilege, d30Var, null, z, user);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Es */
    public boolean mo33314Es() {
        return ogl0.m164259l();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: F0 */
    public String mo33315F0() {
        return "diamond";
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: F2 */
    public String mo33316F2() {
        return "platinum";
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: F4 */
    public boolean mo33317F4() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: F9 */
    public boolean mo33318F9(List<String> list) {
        sa40.C19884h c19884hM182818P = sa40.m182802o().m182818P(list);
        if (NullChecker.m81303a(c19884hM182818P)) {
            return c19884hM182818P.f163299a;
        }
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Fe */
    public void mo33319Fe(Act act) {
        Intent intentM151855k = lva.m151855k(act, NavigationIntent.get("vip"));
        intentM151855k.putExtra("navigation_to_vip_page_index", khl0.m145975a("svip"));
        act.startActivity(intentM151855k);
        act.m66873d2();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Fi */
    public String mo33320Fi() {
        return "bubble_superlike_push_id";
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: G7 */
    public boolean mo33321G7() {
        return u59.m191829g0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: G8 */
    public String mo33322G8() {
        return kyc0.m147852a();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Gd */
    public void mo33323Gd(Act act, String str, Privilege privilege, PurchaseType purchaseType, e30<PurchaseType> e30Var, int i, d30 d30Var, d30 d30Var2, String str2, Object obj, boolean z) {
        C8764c.m53378B0(act, str, privilege, purchaseType, e30Var, i, d30Var, d30Var2, str2, obj, z);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Gf */
    public boolean mo33324Gf() {
        return ogl0.m164229H();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Gg */
    public int mo33325Gg() {
        return sqb0.m185513i0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Gl */
    public int mo33326Gl() {
        return -1289674463;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Go */
    public void mo33327Go(Act act, d30 d30Var, PurchaseType purchaseType, boolean z, boolean z2) {
        m73.m153334n(act, d30Var, purchaseType, z, z2);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Gq */
    public void mo33328Gq(Act act) {
        act.startActivity(DynamicGreetListAct.m36455X1(act, null, "from_meet"));
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: H8 */
    public boolean mo33329H8(@NonNull Date date) {
        return ItemBase.m48032e(date);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: H9 */
    public String mo33330H9() {
        return SummarizedPrivilegesId.ultraPremium;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Hc */
    public void mo33331Hc(Act act, d30 d30Var, v9j<Boolean> v9jVar) {
        m73.m153336p(act, d30Var, v9jVar);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Hd */
    public boolean mo33332Hd() {
        return upa.m194683P2();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Hi */
    public boolean mo33333Hi() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Hk */
    public Intent mo33334Hk(Act act) {
        return SVIPRefundAct.m55829Z1(act);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Hl */
    public int mo33335Hl(String str) {
        return rxg0.m181574r(str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ho */
    public boolean mo33336Ho() {
        return upa.m194825u2();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Hr */
    public boolean mo33337Hr() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: I9 */
    public void mo33338I9(Frag frag, User user) {
        frag.startActivity(ProfileAct.m50736n2(frag.getContext(), user.f56011id, "supreme_partner_nearby", true));
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ie */
    public String mo33339Ie() {
        return "svip";
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: If */
    public boolean mo33340If() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Il */
    public String mo33341Il() {
        return kk50.m146310b();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Im */
    public void mo33342Im(int i, ImageView imageView, boolean z) {
        tm90.m189643d().m189652j(i, imageView, z);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Iq */
    public String mo33343Iq() {
        return "currentUserId";
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: J6 */
    public void mo33344J6(Context context) {
        context.startActivity(ProfileAct.m50738p2(context, CoreModule.m29931H().userId(), "profile_frag_menu", false, true));
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: J7 */
    public void mo33345J7(Act act, PurchaseType purchaseType, d30 d30Var, d30 d30Var2) {
        C8609a.m50272o0(act, purchaseType, d30Var, d30Var2);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ja */
    public SwitchConvNextConfig mo33346Ja() {
        return upa.m194759h1();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Jj */
    public String mo33347Jj() {
        return kk50.m146313e();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Jl */
    public void mo33348Jl(Act act) {
        C7846b.m36420r().m36441y(act, myf.m157025E(act));
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: K4 */
    public boolean mo33349K4() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: K6 */
    public Intent mo33350K6(Context context) {
        return VipAct.m56236a2(context);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Kc */
    public void mo33351Kc(Act act, int i, d30 d30Var) {
        duj0 duj0Var = new duj0(act, 0);
        duj0Var.m113722F(d30Var);
        duj0Var.show();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Kf */
    public boolean mo33352Kf() {
        return u59.m191803L();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Kj */
    public boolean mo33353Kj() {
        return ogl0.m164260m();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Kp */
    public int mo33354Kp() {
        return lyc0.m152240j0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ks */
    public boolean mo33355Ks(Privilege privilege) {
        return swh0.m186275x(privilege);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: L6 */
    public void mo33356L6(Act act, String str, Privilege privilege, User user) {
        C8764c.m53412M1(act, str, privilege, null, null, false, user);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: L8 */
    public String mo33357L8() {
        return "heart_confession_content";
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: L9 */
    public CharSequence mo33358L9(User user, View view, TextView textView) {
        return obe0.m163425g(user, view, textView);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: La */
    public List<NewTags> mo33359La(List<String> list) {
        return sa40.m182802o().m182818P(list).m182847b();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Lb */
    public String mo33360Lb() {
        return tkp.m189533h();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ld */
    public boolean mo33361Ld(@Nullable Counter counter) {
        return n3b0.m157743r(counter);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Lf */
    public void mo33362Lf(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, final e30<Boolean> e30Var2) {
        C8764c.m53375A0(act, str, privilege, null, e30Var, -1, new d30() { // from class: l.h97
            @Override // p149l.d30
            public final void call() {
                CoreBusinessServiceIml.m36043Wt(e30Var2);
            }
        }, new d30() { // from class: l.m97
            @Override // p149l.d30
            public final void call() {
                CoreBusinessServiceIml.m36035Ot(e30Var2);
            }
        });
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: Lg */
    public boolean mo36049Lg() {
        return xma.m210040C3();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Lm */
    public Intent mo33363Lm(Act act, ArrayList<String> arrayList, int i, ArrayList<String> arrayList2) {
        return MatchAct.m47563e2(act, arrayList, i, arrayList2);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Lp */
    public void mo33364Lp(SpannableString spannableString, String str, String str2, int i, int i2, int i3, int i4) {
        tae0.m187715s(spannableString, str, str2, i, i2, i3, i4);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Mb */
    public boolean mo33365Mb() {
        return u59.m191811T();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Mc */
    public void mo33366Mc(final Act act, String str) {
        C8764c.m53491s1(act, str, new e30() { // from class: l.w87
            @Override // p149l.e30
            public final void call(Object obj) {
                e51.m114743H(act, new Runnable() { // from class: l.n97
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreBusinessServiceIml.m36044Xt();
                    }
                }, 1000L);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Me */
    public void mo33367Me(Act act, User user, String str, d30 d30Var) {
        C8455a.m47588w().m47610p(act, user, str, d30Var);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Mf */
    public boolean mo33368Mf() {
        return ogl0.m164247Z();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Mi */
    public boolean mo33369Mi() {
        return ogl0.m164255h();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Mj */
    public f5m mo33370Mj(FrameLayout frameLayout, String str, RecyclerView.AbstractC0582t abstractC0582t) {
        MarrModeProfileCardView marrModeProfileCardView = new MarrModeProfileCardView(frameLayout.getContext());
        marrModeProfileCardView.m38758d(str);
        marrModeProfileCardView.m44328b(abstractC0582t);
        frameLayout.addView(marrModeProfileCardView, new FrameLayout.LayoutParams(-1, -1));
        return marrModeProfileCardView;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Mp */
    public void mo33371Mp(Act act, User user, e30<String> e30Var, boolean z) {
        zar.m217749h(act, user, e30Var, z);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Mr */
    public void mo33372Mr(Act act, String str, d30 d30Var, d30 d30Var2, e30<PurchaseType> e30Var) {
        C8764c.m53442b1(act, str, d30Var, d30Var2, e30Var);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: N7 */
    public int mo33373N7() {
        return 48;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: N8 */
    public boolean mo33374N8() {
        Settings settings = CoreModule.f17545c.f19639e0.m169527p9().settings;
        return settings != null && TEnum.equals(settings.getLookingFor(), "female");
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Nf */
    public int mo33375Nf() {
        return n3b0.m157729c();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Nm */
    public int mo33376Nm() {
        return zzc0.m221013d0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Nn */
    public void mo33377Nn(Act act, String str, View view, boolean z) {
        if (upa.m194665L3()) {
            act.startActivityForResult(ProfileAct.m50736n2(act, str, "from_new_meet_likers", true), z ? 82 : 81);
        } else {
            act.startActivityForResultWithCustomTransition(ProfileAct.m50736n2(act, str, "from_new_meet_likers", true), z ? 82 : 81, new lf90(view, new e30() { // from class: l.a97
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreBusinessServiceIml.m36040Tt((Boolean) obj);
                }
            }));
        }
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: No */
    public boolean mo33378No() {
        return fap.m120266y();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Np */
    public boolean mo33379Np() {
        return ogl0.m164223B();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: O */
    public boolean mo33380O() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: O1 */
    public String mo33381O1() {
        return "partner";
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: O7 */
    public boolean mo33382O7() {
        return ogl0.m164236O();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: O8 */
    public boolean mo33383O8() {
        return upa.m194633F1();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: O9 */
    public Intent mo33384O9(Act act, String str, boolean z, ResultReceiver resultReceiver) {
        return ReportAct.m54628a2(act, str, z, resultReceiver);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ob */
    public String mo33385Ob(int i, String str) {
        return C8609a.m50219C(i, str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Oo */
    public boolean mo33386Oo() {
        return ogl0.m164254g();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Op */
    public boolean mo33387Op() {
        return upa.m194663L1();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: P7 */
    public boolean mo33388P7() {
        return w8e0.m202165c();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: P8 */
    public int mo33389P8() {
        return 50;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ph */
    public boolean mo33390Ph() {
        return lyc0.m152234d0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Pl */
    public void mo33391Pl(boolean z, View view) {
        if (view instanceof VirtualCard) {
            ((VirtualCard) view).m46086L0(z);
        }
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Po */
    public void mo33392Po(final Act act) {
        tvf.m190736n();
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_avatarVerification_icon_explain_guide_Unverified", Dialog.class.getName());
        i0e.m133797f(cwf0VarM133794c);
        CoreDlg.m44987G1(act, act.string(R$string.f19106yr), act.string(R$string.f18164Tr), x2c0.f190611u8, act.string(R$string.f18104Rr), new d30() { // from class: l.s97
            @Override // p149l.d30
            public final void call() {
                CoreBusinessServiceIml.m36033Mt(act);
            }
        }, true, act.string(R$string.f18074Qr), new d30() { // from class: l.t97
            @Override // p149l.d30
            public final void call() {
                zvf0.m220396r("e_avatarVerification_explain_cancle_click", "p_avatarVerification_icon_explain_guide_Unverified");
            }
        }, new d30() { // from class: l.x87
            @Override // p149l.d30
            public final void call() {
                i0e.m133796e(cwf0VarM133794c);
            }
        }, null, true, false, null, null, false);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Q8 */
    public void mo33393Q8(Act act, RoamedLocationData roamedLocationData) {
        if (ljl0.m149994n("p_select_location_view,e_manyou,click", act, null)) {
            wvv.m205766f();
            if (roamedLocationData.data.size() >= 5) {
                act.startActivityForResult(VipLocationHistoryAct.m56276V1(act, VipBaseFrag.f37502B), 3);
            } else {
                act.startActivityForResult(IntlMapAct.m35946e2(act, 1, VipBaseFrag.f37502B), 2);
            }
        }
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Qb */
    public boolean mo33394Qb() {
        return ogl0.m164245X();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Qp */
    public void mo33395Qp(Activity activity) {
        activity.startActivity(mo33433Vf() ? NewMyLikedUsersAct.m46820Y1(activity) : new Intent(activity, (Class<?>) LikedUsersAct.class));
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Qr */
    public int mo33396Qr() {
        return 49;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: R6 */
    public String mo33397R6() {
        return fap.m120265x();
    }

    @Override // p149l.n87
    /* JADX INFO: renamed from: R7 */
    public void mo36050R7(String str, String str2) {
        co5.m107939k(str, str2);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ri */
    public void mo33398Ri(boolean z) {
        C8609a.f32670f = true;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Rj */
    public Intent mo33399Rj(Act act, String str, LikedUser likedUser) {
        return ProfileAct.m50737o2(act, str, "from_meet_feed", true, likedUser);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Rl */
    public String mo33400Rl(int i) {
        return tae0.m187703f(i);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Rm */
    public void mo33401Rm(Act act, String str) {
        C8764c.m53502w0(act, str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Rn */
    public boolean mo33402Rn() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Rr */
    public void mo33403Rr(long j) {
        wn90.m204602F().m204676z(j);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Sc */
    public void mo33404Sc(Act act, String str, e30<PurchaseType> e30Var) {
        C8764c.m53491s1(act, str, e30Var);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Sh */
    public void mo33405Sh() {
        g4h0.m124372d();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Sk */
    public boolean mo33406Sk() {
        return upa.m194629E2();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Sl */
    public void mo33407Sl(Act act, String str, Privilege privilege, d30 d30Var, Object obj) {
        C8764c.m53385D1(act, str, privilege, d30Var, obj);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Sm */
    public C22306c<Optional<List<GPSkuDetails>>> mo33408Sm(Context context, ArrayList<String> arrayList, boolean z, long j) {
        return igj.m136011O(context, arrayList, z, j);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Sn */
    public void mo33409Sn(Context context, String str, int i, boolean z, String str2) {
        context.startActivity(VipAct.m56242h2(context, str, i, z, str2));
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: So */
    public void mo33410So(eyl eylVar) {
        m73.m153335o(eylVar.mo36758q1(), new C7830d(eylVar), new C7831e(eylVar), PurchaseType.TYPE_SPOTLIGHT, true);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Sp */
    public boolean mo33411Sp() {
        return lyc0.m152244n0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Sq */
    public Intent mo33412Sq(Act act, String str) {
        return ProfileAct.m50736n2(act, str, "from_new_meet_see_feed", true);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: T9 */
    public void mo33413T9(Act act, PurchaseType purchaseType, d30 d30Var, d30 d30Var2, int i) {
        gxg0.m128613v(act, purchaseType, d30Var, d30Var2, i);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ta */
    public void mo33414Ta(boolean z) {
        j15.f115737a = z;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Tb */
    public int mo33415Tb(boolean z) {
        return zzc0.m221014e0(z);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Td */
    public CharSequence mo33416Td(int i) {
        return yzc0.m216638j(i);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Th */
    public void mo33417Th(String str) {
        wn90.m204602F().m204663m0(str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Tj */
    public void mo33418Tj(boolean z, User user, VFrame vFrame) {
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Tl */
    public int mo33419Tl(User user) {
        return tm90.m189643d().m189648f(user);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Tm */
    public int mo33420Tm() {
        return iij0.m136423b();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Tn */
    public int mo33421Tn() {
        return gkl0.m126654q0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Tq */
    public long mo33422Tq() {
        return uld0.m194220e().m194229l();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Tr */
    public boolean mo33423Tr() {
        return o0x.m162201j();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ts */
    public List<String> mo33424Ts(List<String> list) {
        return sa40.m182802o().m182824V(list);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: U */
    public boolean mo33425U() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: U7 */
    public void mo33426U7(Act act, SummarizedPrivilegePrice summarizedPrivilegePrice, d30 d30Var, d30 d30Var2) {
        rxg0.m181572j().m181586h(act, summarizedPrivilegePrice, d30Var, d30Var2);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ub */
    public String mo33427Ub(Media media) {
        return zub.m220209h(media).formatted();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ue */
    public void mo33428Ue(Act act, boolean z) {
        ark.m98447S0(act, z);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Uh */
    public void mo33429Uh(Act act, String str) {
        C8764c.m53391F1(act, str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Un */
    public String mo33430Un(VirtualCardType virtualCardType) {
        return vyc0.m200632g(virtualCardType);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Up */
    public boolean mo33431Up() {
        return OnlineMatchManager.m50143z().m50144A() == OnlineMatchManager.QuickChatProduce.Heartbeat;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: V7 */
    public boolean mo33432V7(double d) {
        return MessageWarmingUpHelper.m49188r(d).value >= MessageWarmingUpHelper.WarmingUpLevel.third.value;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Vf */
    public boolean mo33433Vf() {
        return ogl0.m164222A() || ogl0.m164223B();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Vl */
    public PurchaseType mo33434Vl() {
        return C8609a.m50274p0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: W9 */
    public boolean mo33435W9() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: We */
    public boolean mo33436We() {
        return upa.m194845y2() || upa.m194609A2();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Wf */
    public Intent mo33437Wf(Context context, NavigationCardIntent navigationCardIntent, Map<String, String> map) {
        return NewMainAct.m39690K5(context, NavigationIntent.get("cards"), navigationCardIntent, map);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ws */
    public void mo33438Ws(final Act act, User user, final boolean z, final boolean z2, final User user2) {
        if (user.isJailed()) {
            CoreModule.m29932K().startJailedDialogLikeAct();
            return;
        }
        if (user.isNameFake()) {
            ark.m98449T0(act);
            return;
        }
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(HomeStatisticsHelper.ScActionFrom.MEET.toString()).isLike(true).isFromButton(false).isSuperLiked(z2).user(user2.f56011id).build();
        boolean z3 = !xma.m210044G3() && sja.m184461r3() > 0;
        PicksUser picksUser = (PicksUser) vwb.m200346r(CoreModule.f17545c.f19658k1.m184466F3().f153135a, new w9j() { // from class: l.o97
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((PicksUser) obj).f20468id, user2.f56011id));
            }
        });
        final boolean z4 = z3;
        act.duringCreated(CoreModule.f17545c.f19663m0.m31073Y7(true, z2, null, user2, "", LikeFrom.get("mymeet"), true, likeExtraDataNew_, 0, NullChecker.m81303a(picksUser) ? picksUser.picksTracker : null)).subscribe(mkd0.m154956H(new e30() { // from class: l.p97
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreBusinessServiceIml.m36048bu(z2, act, z, z4, user2, (Relationship) obj);
            }
        }, new e30() { // from class: l.q97
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreBusinessServiceIml.m36034Nt((Throwable) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: X5 */
    public boolean mo33439X5() {
        return upa.m194715X2();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: X6 */
    public boolean mo33440X6() {
        return j17.m139232I3();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Xc */
    public void mo33441Xc(Frag frag, String str, View view, e30<Boolean> e30Var) {
        if (upa.m194665L3()) {
            frag.startActivityForResult(ProfileAct.m50736n2(frag.getContext(), str, "liked_users", true), 18);
        } else {
            frag.m20602v4(ProfileAct.m50736n2(frag.getContext(), str, "liked_users", true), 18, new lf90(view, e30Var));
        }
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Xi */
    public boolean mo33442Xi() {
        return u59.m191810S();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Xn */
    public boolean mo33443Xn() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Xo */
    public View mo33444Xo(Act act, ViewGroup viewGroup) {
        return act.inflater().inflate(f6c0.f95275A8, viewGroup, false);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Xq */
    public int mo33445Xq() {
        return tkp.m189534i();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Xr */
    public Intent mo33446Xr(Context context, String str) {
        return MessagesAct.m48943i2(context, str, false, false);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Y3 */
    public String mo33447Y3() {
        return "vip";
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Y4 */
    public int mo33448Y4() {
        return n3b0.m157737l();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Y9 */
    public boolean mo33449Y9() {
        return ogl0.m164233L();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Yd */
    public boolean mo33450Yd() {
        return ogl0.m164230I();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Yf */
    public qed0.C19470a mo33451Yf(int i, int i2) {
        return obe0.m163420b(i, i2);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Yj */
    public void mo33452Yj(Act act, User user, VDraweeView vDraweeView, LinearLayout linearLayout) {
        act.startActivityForResultWithCustomTransition(ProfileAct.m50736n2(act, user.f56011id, "likers", true), 18, (!(act instanceof LikersAct) || upa.m194665L3()) ? null : new nhr(vDraweeView, linearLayout));
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Yo */
    public void mo33453Yo(boolean z) {
        myc0.m157001d0().f136284i = z;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Yp */
    public boolean mo33454Yp() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Z9 */
    public int mo33455Z9() {
        return 24;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Za */
    public void mo33456Za(Act act, String str, Object obj, String str2, boolean z) {
        C8360d.a aVar = new C8360d.a(str, "meet");
        aVar.m45916m(obj).m45917n(str2).m45913j(z);
        C8360d.m45892a(act, aVar);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Zd */
    public void mo33457Zd() {
        myc0.m157001d0().m157007h0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Zh */
    public void mo33458Zh(Act act, String str, ArrayList<String> arrayList, C4317a.a aVar) {
        act.startActivityForResultWithCustomTransition(CommonMediaPreviewAct.m47805Z1(act, str, arrayList), 100, new gm5(), aVar);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Zi */
    public boolean mo33459Zi() {
        return tae0.m187702e();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Zp */
    public boolean mo33460Zp() {
        return src0.m185656r().m185686y();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ad */
    public boolean mo33461ad() {
        return OnlineMatchManager.m50143z().m50155L();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ah */
    public void mo33462ah(eyl eylVar) {
        CoreModule.m29935P().m94651a().mo33572qm(eylVar.mo36758q1(), "feedBoostCard", Privilege.boost, null);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ai */
    public List<NewTags> mo33463ai(List<OmsTagUserCounts> list) {
        return sa40.m182802o().m182820R(list).m182847b();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: aj */
    public Intent mo33464aj(Context context, String str) {
        return VipLocationHistoryAct.m56276V1(context, str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: al */
    public String mo33465al() {
        return kk50.m146312d();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: an */
    public void mo33466an(Frag frag, User user) {
        frag.startActivity(ProfileAct.m50736n2(frag.getContext(), user.f56011id, "supreme_partner_customize", true));
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ap */
    public void mo33467ap(Act act, CityCData cityCData) {
        new m45(act, "").m153003K(2, cityCData, null);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: b3 */
    public int mo33468b3() {
        return C8609a.m50246b0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: b9 */
    public boolean mo33469b9() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: bc */
    public int mo33470bc() {
        return x2c0.f190497qm;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: bd */
    public l5j0 mo33471bd(Act act, String str, d30 d30Var, d30 d30Var2) {
        return ark.m98451U0(act, str, d30Var, d30Var2);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: bi */
    public boolean mo33472bi(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(MonetizationPromotionsId.lowPriceFirstTime12MSVIP);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: bk */
    public String mo33473bk() {
        return kk50.m146311c();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: c6 */
    public int mo33474c6() {
        return x2c0.f190468pp;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: c7 */
    public String mo33475c7() {
        return n740.m158106a();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ca */
    public CharSequence mo33476ca(User user, View view, TextView textView, int i, int i2) {
        return obe0.m163426h(user, view, textView, i, i2);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: cl */
    public boolean mo33477cl(Activity activity) {
        return activity instanceof ProfileAct_CustomTransition;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: cm */
    public void mo33478cm(Act act, boolean z) {
        OnlineMatchManager.m50143z().m50183o0(act, z);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: cn */
    public boolean mo33479cn() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: cr */
    public boolean mo33480cr() {
        return upa.m194678O1();
    }

    /* JADX INFO: renamed from: cu */
    public final void m36051cu(boolean z, final boolean z2, boolean z3, final C7994d c7994d, User user, final Act act) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c7994d.m38471f().getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(user).pageId(c7994d.m38473h()).build();
        act.duringCreated(CoreModule.f17545c.f19663m0.m31073Y7(z, z2, null, user, null, LikeFrom.get("picks"), true, likeExtraDataNew_, 0, null)).subscribe(mkd0.m154956H(new e30() { // from class: l.k97
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreBusinessServiceIml.m36031Kt(c7994d, z2, act, (Relationship) obj);
            }
        }, new e30() { // from class: l.l97
            @Override // p149l.e30
            public final void call(Object obj) {
                HomeStatisticsHelper.m36687A(c7994d, (Throwable) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: dc */
    public void mo33481dc(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, int i) {
        C8609a.m50282x(simpleDraweeView, imageUri, i);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: dd */
    public boolean mo33482dd() {
        return ogl0.m164228G();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: de */
    public int mo33483de() {
        return upa.m194728b0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: dj */
    public boolean mo33484dj() {
        return upa.m194745e2();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: dm */
    public void mo33485dm(Act act, C4317a.a aVar) {
        wn90.m204602F().f187269a = null;
        fif.m121507b(act, LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS, null, aVar);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: dn */
    public Intent mo33486dn(Context context, boolean z, String str) {
        return VerificationCenterAct.m55992Y1(context, z, str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: dp */
    public String mo33487dp(long j) {
        return swh0.m186215U(j);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ds */
    public boolean mo33488ds() {
        return false;
    }

    /* JADX INFO: renamed from: du */
    public final /* synthetic */ void m36052du(C7994d c7994d, boolean z, boolean z2, boolean z3, User user, Act act) {
        c7994d.m38481p();
        m36051cu(z, z2, z3, c7994d, user, act);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: e2 */
    public boolean mo33489e2() {
        return n3b0.m157742q();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ea */
    public void mo33490ea(Act act, PurchaseType purchaseType, d30 d30Var, d30 d30Var2) {
        sqb0.m185536y0(act, purchaseType, d30Var, d30Var2);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: eg */
    public boolean mo33491eg() {
        Settings settings = CoreModule.f17545c.f19639e0.m169527p9().settings;
        return settings != null && TEnum.equals(settings.getLookingFor(), "male");
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: eh */
    public void mo33492eh(Act act) {
        act.startActivity(IntlVisitorsAct.INSTANCE.m46188a(act));
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ei */
    public void mo33493ei(String str) {
        vyc0.m200626a(str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: en */
    public void mo33494en() {
        myc0.m157001d0().m157009k0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: eo */
    public void mo33495eo(Act act, String str, d30 d30Var, d30 d30Var2) {
        CoreDlg.m45103t1(act, str, d30Var, d30Var2);
    }

    /* JADX INFO: renamed from: eu */
    public final /* synthetic */ void m36053eu(final boolean z, CounterLikeLimit counterLikeLimit, final Act act, String str, boolean z2, final boolean z3, final C7994d c7994d, final boolean z4, final User user, roj0 roj0Var) {
        if (z && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !mb90.m153866b(PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
            m36054fu(act, str, Privilege.vip_unlimited_likes, null, z2);
            return;
        }
        if (!z3 || swh0.m186276x0() > 0) {
            if (z3 && swh0.m186193G1(act, new d30() { // from class: l.j97
                @Override // p149l.d30
                public final void call() {
                    this.f116863a.m36052du(c7994d, z, z3, z4, user, act);
                }
            })) {
                return;
            }
            Act act2 = act;
            m36051cu(z, z3, z4, c7994d, user, act2);
            return;
        }
        if (!xma.m210047L3()) {
            m36054fu(act, str, Privilege.vip_super_like, null, z2);
        } else {
            C8764c.m53391F1(act, str);
            HomeStatisticsHelper.m36688B(c7994d, "failExhaustSuperlike");
        }
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: fb */
    public CharSequence mo33496fb(User user) {
        return dfj.m111467d(user);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ff */
    public boolean mo33497ff(String str) {
        return TextUtils.equals(str, "from_picks") || TextUtils.equals(str, "from_meet_picks_feed") || TextUtils.equals(str, "from_meet_picks_card") || TextUtils.equals(str, "from_new_meet_picks_feed");
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: fg */
    public void mo33498fg(final Act act) {
        e9n.m115354C(act, act.string(R$string.f18645jm), act.string(R$string.f18615im), act.string(R$string.f18554gm), new Runnable() { // from class: l.b97
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                act2.startActivity(NewMainAct.m39695M5(act2, NavigationIntent.get("setting")));
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: fh */
    public C22306c<View> mo33499fh(Act act) {
        if (u0n.m191361t()) {
            return u0n.m191353l().m191362j(5).mo100437c(act);
        }
        return null;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: fl */
    public void mo33500fl() {
        wn90.m204602F().f187269a = null;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: fm */
    public boolean mo33501fm() {
        return fap.m120256j();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: fo */
    public int mo33502fo() {
        return tkp.m189531f();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: fr */
    public void mo33503fr(Act act, d30 d30Var, d30 d30Var2) {
        zar.m217748g(act, d30Var, d30Var2);
    }

    /* JADX INFO: renamed from: fu */
    public final void m36054fu(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, boolean z) {
        if (z) {
            mo33574r6(act, str, privilege, e30Var, null);
        } else {
            mo33362Lf(act, str, privilege, e30Var, null);
        }
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: g5 */
    public C22306c<List<Merchandise>> mo33504g5(Context context, List<Merchandise> list) {
        return igj.m136009M(context, list);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: gd */
    public boolean mo33505gd() {
        return lyc0.m152233c0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: gl */
    public String mo33506gl() {
        return "heart_confession_uid";
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: h5 */
    public boolean mo33507h5() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: h7 */
    public int mo33508h7() {
        return 40;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ha */
    public void mo33509ha(Act act, CityCData cityCData) {
        new m45(act, "").m153003K(3, cityCData, null);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: hc */
    public String mo33510hc(Context context, User user) {
        return rza.m181724D0(context, user);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: he */
    public boolean mo33511he(Act act) {
        return act instanceof NewMainAct;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: hg */
    public <T extends Act> Act.AbstractC4304w mo33512hg(T t) {
        return new MatchAct.C8454b();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: hl */
    public boolean mo33513hl() {
        return !LoopFragmentFactory.m51466J(LoopInputType.HEIGHT, CoreModule.f17545c.f19639e0.m169527p9(), "from_explore_card_height");
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: hm */
    public boolean mo33514hm() {
        return ogl0.m164253f();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: hn */
    public int mo33515hn() {
        return iij0.m136422a();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ho */
    public void mo33516ho(Act act, User user) {
        bo5.m102908s(act, user);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: hp */
    public String mo33517hp() {
        return "e_card_add_tag";
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: hq */
    public boolean mo33518hq(View view) {
        return view instanceof PicksHeaderView;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ht */
    public boolean mo33519ht() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: i0 */
    public C22306c<View> mo33520i0(Act act) {
        return !u0n.m191355n() ? C22306c.just(null) : u0n.m191353l().m191362j(7).mo100437c(act);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: i6 */
    public void mo33521i6(Act act, String str, Privilege privilege) {
        C8764c.m53403J1(act, str, privilege);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ij */
    public boolean mo33522ij() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: in */
    public void mo33523in(float f) {
        CoreBusinessModule.f17533c.m177373R(f);
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: j3 */
    public boolean mo33524j3() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: jh */
    public boolean mo33525jh() {
        return ogl0.m164256i();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: jj */
    public boolean mo33526jj() {
        return ogl0.m164235N();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: jl */
    public void mo33527jl(Context context, String str) {
        context.startActivity(OOFMkWebViewAct.m41783n2(context, str));
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: jr */
    public Intent mo33528jr(Context context, String str, String str2, boolean z) {
        return ProfileAct.m50736n2(context, str, str2, z);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: k */
    public boolean mo33529k() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: k4 */
    public boolean mo33530k4() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: kb */
    public boolean mo33531kb() {
        return upa.m194613B1();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: kh */
    public LiteraturesComments mo33532kh(String str, String str2) {
        return BookMoviesDramasHelper.m59446m(str, str2);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: kp */
    public boolean mo33533kp(boolean z) {
        return sqb0.m185498O().m185551U(z);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: l1 */
    public void mo33534l1(Act act, String str) {
        C8764c.m53376A1(act, str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: l6 */
    public boolean mo33535l6() {
        return upa.m194835w2();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: lc */
    public boolean mo33536lc() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: lh */
    public boolean mo33537lh() {
        return upa.m194687Q2();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: lq */
    public String mo33538lq() {
        return upa.m194652J0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: lr */
    public C22306c<View> mo33539lr(Act act) {
        if (u0n.m191361t()) {
            return u0n.m191353l().m191362j(8).mo100437c(act);
        }
        return null;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ls */
    public double mo33540ls() {
        return ogl0.m164252e();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: m2 */
    public boolean mo33541m2() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: m3 */
    public boolean mo33542m3() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: m7 */
    public boolean mo33543m7() {
        return ogl0.m164225D();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: m9 */
    public int mo33544m9() {
        return swh0.m186263s0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: mb */
    public String mo33545mb() {
        return fap.m120255i().m120271h();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: me */
    public lwl mo33546me(Act act) {
        return new r2y(act);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: mh */
    public void mo33547mh(eyl eylVar, Active active) {
        C7829c c7829c = new C7829c(eylVar);
        Act actMo36758q1 = eylVar.mo36758q1();
        PurchaseType purchaseType = PurchaseType.TYPE_GET_LIKERS;
        mc60.m153987a(eylVar.mo36758q1(), purchaseType, true, active.skuId, null, new qlw(actMo36758q1, purchaseType, c7829c));
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: mi */
    public String mo33548mi(int i) {
        return dfj.m111465b(i);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: mo */
    public boolean mo33549mo() {
        return u59.m191808Q();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: mt */
    public Intent mo33550mt(Act act, String str) {
        return ProfileAct.m50736n2(act, str, "from_new_meet_picks_feed", true);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: n8 */
    public Intent mo33551n8(Act act, ArrayList<String> arrayList, int i, ArrayList<String> arrayList2, String str) {
        return MatchAct.m47564g2(act, arrayList, i, arrayList2, str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: nk */
    public Intent mo33552nk(Context context, String str, int i) {
        return VipAct.m56240e2(context, str, i);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: nr */
    public int mo33553nr() {
        return 41;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: o6 */
    public boolean mo33554o6() {
        return C8609a.m50238V();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: oc */
    public String mo33555oc() {
        return ogl0.m164250c();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: og */
    public void mo33556og() {
        su4.m185997g();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: oi */
    public j760<String, String> mo33557oi(int i) {
        return tae0.m187704g(i);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: op */
    public void mo33558op(@NonNull Act act, final d30 d30Var) {
        new C8761b.d(act).m53321c(1).m53326h(new g30() { // from class: l.z87
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                d30Var.call();
            }
        }).m53322d("picks").m53330l(PurchaseType.TYPE_PICKS).m53334p();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: p0 */
    public boolean mo33559p0() {
        return upa.m194845y2();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: pf */
    public boolean mo33560pf(Context context) {
        return context instanceof VipAct;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: pg */
    public void mo33561pg(Act act, g30<PurchaseType, Act, String> g30Var, int i, String str) {
        gxg0.m128615x(act, g30Var, i, str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: pi */
    public String mo33562pi(int i) {
        return dfj.m111466c(i);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: pl */
    public void mo33563pl(Act act, String str, View view, boolean z) {
        act.startActivityForResultWithCustomTransition(ProfileAct.m50736n2(act, str, "from_intl_meet_likers", true), z ? 82 : 81, new lf90(view, new e30() { // from class: l.r97
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreBusinessServiceIml.m36027Gt((Boolean) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: pp */
    public void mo33564pp(Act act) {
        CoreDlg.m45097r1(act);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: pr */
    public void mo33565pr(Act act, String str, Privilege privilege) {
        C8764c.m53504x0(act, str, privilege);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: q0 */
    public boolean mo33566q0() {
        return upa.m194655J3();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: q6 */
    public void mo33567q6(Act act, String str, e30<PurchaseType> e30Var) {
        C8764c.m53497u1(act, str, e30Var);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: qb */
    public void mo33568qb(Act act, String str, View view) {
        if (upa.m194665L3()) {
            act.startActivityForResult(ProfileAct.m50736n2(act, str, "from_new_meet_likers", true), 25);
        } else {
            act.startActivityForResultWithCustomTransition(ProfileAct.m50736n2(act, str, "from_new_meet_likers", true), 25, new lf90(view, new e30() { // from class: l.y87
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreBusinessServiceIml.m36030Jt((Boolean) obj);
                }
            }));
        }
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: qd */
    public void mo33569qd(Context context, String str, String str2) {
        context.startActivity(VipAct.m56240e2(context, str, khl0.m145975a(str2)));
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: qj */
    public String mo33570qj(User user) {
        return String.format("%1$s · %2$s", C8609a.m50224H(user), i0g0.m133869j0(user.profile.zodiac));
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: qk */
    public void mo33571qk(Act act) {
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).m39801Z5().m40010l0();
        }
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: qm */
    public void mo33572qm(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var) {
        C8764c.m53507y0(act, str, privilege, null, e30Var);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: qt */
    public boolean mo33573qt() {
        return swh0.m186269v();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: r6 */
    public void mo33574r6(Act act, String str, Privilege privilege, e30<PurchaseType> e30Var, d30 d30Var) {
        C8764c.m53408L0(act, str, e30Var, d30Var, null, privilege);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: rc */
    public boolean mo33575rc() {
        return upa.m194609A2();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: rd */
    public void mo33576rd(eyl eylVar) {
        if (g83.m124739b()) {
            osi0.m165783g(eylVar.mo36748Y1(R$string.f18195Us));
        } else if (swh0.m186244l0() > 0) {
            f73.m119758z(eylVar.mo36758q1(), new C7827a(eylVar), Privilege.minBoost);
        } else {
            new fd5.C16808e(eylVar.mo36758q1()).m120958j(PurchaseType.TYPE_INTL_TTT_COIN).m120952d("e_intl_boost_trial_card").m120957i(Privilege.minBoost).m120951c(1).m120955g(new C7828b(eylVar)).m120960l();
        }
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: re */
    public int mo33577re() {
        return 25;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ri */
    public boolean mo33578ri() {
        return myc0.m157001d0().m157004e0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: rj */
    public Intent mo33579rj(Act act, String str) {
        return ConversationSearchAct.m42552c2(act, str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: rl */
    public CharSequence mo33580rl(Merchandise merchandise, @ColorInt int i) {
        return w6h0.m201818j().m201821h(merchandise, i);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: rn */
    public void mo33581rn(User user, Frag frag) {
        frag.startActivityForResult(ProfileAct.m50736n2(frag.getContext(), user.f56011id, "likers", true), 18);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: s */
    public boolean mo33582s() {
        return upa.m194761h3();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: s3 */
    public boolean mo33583s3() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: s6 */
    public boolean mo33584s6() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: s7 */
    public void mo33585s7(Act act, String str, View view, e30<Boolean> e30Var) {
        if (upa.m194665L3()) {
            act.startActivityForResult(ProfileAct.m50736n2(act, str, "liked_users", true), 18);
        } else {
            act.startActivityForResultWithCustomTransition(ProfileAct.m50736n2(act, str, "liked_users", true), 18, new lf90(view, e30Var));
        }
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: s8 */
    public boolean mo33586s8() {
        return n3b0.m157740o();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: sf */
    public boolean mo33587sf() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    public void showSeeDialog(Act act, d30 d30Var, String str) {
        C8764c.m53382C1(act, str, Privilege.see_who_likes_me, d30Var);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: si */
    public boolean mo33588si() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: sk */
    public int mo33589sk(String str) {
        return khl0.m145975a(str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: sl */
    public String mo33590sl() {
        return upa.m194818t0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: sp */
    public void mo33591sp(final Act act) {
        if (swh0.m186269v() && swh0.m186255p0().m186309c1()) {
            swh0.m186180B1(act, PurchaseType.TYPE_GET_BOOST, new d30() { // from class: l.c97
                @Override // p149l.d30
                public final void call() {
                    CoreBusinessServiceIml.m36037Qt(act);
                }
            }, null);
        } else {
            x93.m207468d(act, true);
        }
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ss */
    public void mo33592ss(User user, VDraweeView vDraweeView, LinearLayout linearLayout, Act act) {
        act.startActivityForResultWithCustomTransition(ProfileAct.m50736n2(act, user.f56011id, "likers", true), 18, (!(act instanceof LikersAct) || upa.m194665L3()) ? null : new nhr(vDraweeView, linearLayout));
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: st */
    public void mo33593st(Act act, String str, CharSequence charSequence, String str2, String str3, int i, int i2, int i3, boolean z, ViewOutlineProvider viewOutlineProvider, cwf0 cwf0Var, final d30 d30Var, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        x7y x7yVarM207348t = new x7y.C21039a(act).m207345D(str).m207344C(charSequence).m207342A(false).m207352x(str2, new e30() { // from class: l.e97
            @Override // p149l.e30
            public final void call(Object obj) {
                d30Var.call();
            }
        }).m207350v(str3, new e30() { // from class: l.f97
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreBusinessServiceIml.m36045Yt((x7y) obj);
            }
        }).m207354z(z).m207351w(i, onCheckedChangeListener).m207348t();
        if (x7yVarM207348t == null || x7yVarM207348t.m207317g() == null) {
            return;
        }
        if (NullChecker.m81303a(x7yVarM207348t.m207317g().f28947a)) {
            x7yVarM207348t.m207317g().f28947a.setOutlineProvider(viewOutlineProvider);
            x7yVarM207348t.m207317g().f28947a.setClipToOutline(true);
        }
        x7yVarM207348t.m207317g().m45157F(i2);
        x7yVarM207348t.m207317g().m45166R(i3);
        if (NullChecker.m81303a(x7yVarM207348t.m207317g().f28949c)) {
            xdl0.m208325C0(x7yVarM207348t.m207317g().f28949c, t100.m186890d(250.0f));
        }
        x7yVarM207348t.m207317g().m45180j0();
        x7yVarM207348t.m207317g().m45177f0(hvc0.m133154a(w0c0.f183891u0));
        x7yVarM207348t.m207323m(cwf0Var);
        x7yVarM207348t.m207324n();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ta */
    public boolean mo33594ta() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: tc */
    public String mo33595tc() {
        return "https://auto.tancdn.com/v1/raw/bd3b6c84-2d79-4eb5-928f-4dc06d19cdf513.pdf";
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: tk */
    public void mo33596tk(final Act act) {
        e9n.m115354C(act, act.string(R$string.f17902L5), act.string(R$string.f17872K5), act.string(R$string.f18554gm), new Runnable() { // from class: l.d97
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                act2.startActivity(NewMainAct.m39695M5(act2, NavigationIntent.get("setting")));
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: tn */
    public String mo33597tn() {
        return o0x.m162204m();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ts */
    public boolean mo33598ts(int i) {
        return g83.m124740c(i);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: tt */
    public boolean mo33599tt() {
        return upa.m194737d();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: u5 */
    public boolean mo33600u5() {
        return r3l0.m177674c();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ug */
    public void mo33601ug(Activity activity, Uri uri) {
        lva.m151843D(activity, uri);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: uh */
    public boolean mo33602uh() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: um */
    public C22306c<String> mo33603um() {
        return OnlineMatchManager.m50143z().m50147D();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: un */
    public boolean mo33604un() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: uo */
    public void mo33605uo(Throwable th) {
        gak.m125002c(th);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: v4 */
    public boolean mo33606v4() {
        return upa.m194847z();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: v7 */
    public void mo33607v7(Act act, User user, int i, boolean z) {
        abi.m95624L(act, user, i, z);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: vb */
    public boolean mo33608vb(User user, CoreLikers.C4719a c4719a) {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: vc */
    public int mo33609vc() {
        return lyc0.m152243m0();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: vh */
    public void mo33610vh(Act act) {
        CoreDlg.m44987G1(act, act.string(R$string.f19106yr), act.string(R$string.f18164Tr), x2c0.f190611u8, act.string(R$string.f18134Sr), null, false, null, null, null, null, true, false, null, null, false);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: vl */
    public nx0 mo33611vl(PutongCoreAct putongCoreAct) {
        return new bpb(putongCoreAct);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: vo */
    public String mo33612vo(String str) {
        if (TextUtils.equals(str, "from_meet_picks_feed") || TextUtils.equals(str, "from_new_meet_picks_feed") || TextUtils.equals(str, "from_meet_picks_card")) {
            return "p_meet_view,e_picks_feed_card,like_swipe";
        }
        return (TextUtils.equals(str, "from_meet_feed") || TextUtils.equals(str, "from_meet_profile")) ? "p_meet_view,e_whoiliked_card,sayhi_superlike" : "p_meet_view,e_meet_card_sayhi,click";
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: vs */
    public void mo33613vs(eyl eylVar, String str, FreeTrialOperateResult freeTrialOperateResult) {
        if (!"success".equals(freeTrialOperateResult.operateResult)) {
            if (vwb.m200298L(freeTrialOperateResult.msg)) {
                return;
            }
            osi0.m165783g(freeTrialOperateResult.msg);
            return;
        }
        vyc0.m200645t(eylVar.mo36758q1(), str, eylVar.mo36761u0());
        CoreModule.f17545c.f19564F0.m99250q3();
        CoreModule.f17545c.f19663m0.m31039Q5();
        CoreModule.f17545c.f19663m0.m31043R5();
        CoreModule.f17545c.f19663m0.m31127m8();
        if (VisitorSortType.realUser.equals(str)) {
            uyc0.m196272l0().m196280q0(true);
            uyc0.m196272l0().m196279p0(true);
        } else if ("online".equals(str)) {
            uyc0.m196272l0().m196277n0(true);
        }
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: w */
    public boolean mo33614w() {
        return upa.m194665L3();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: w6 */
    public boolean mo33615w6() {
        return hmb.m131711p1();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: wa */
    public void mo33616wa(String str) {
        wn90.m204602F().m204673w(str);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: we */
    public C22306c<HometownSuggest> mo33617we() {
        return co90.m107946g();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: wh */
    public void mo33618wh(Act act, String str, e30<PurchaseType> e30Var, d30 d30Var, d30 d30Var2, Privilege privilege) {
        C8764c.m53439a0(act, str, e30Var, d30Var, d30Var2, privilege);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: wi */
    public void mo33619wi(Act act, boolean z) {
        x93.m207468d(act, z);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: wk */
    public void mo33620wk(User user) {
        n3b0.m157749x(user);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: wp */
    public String mo33621wp() {
        return kk50.m146311c();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: wr */
    public void mo33622wr(Act act, String str, Privilege privilege) {
        C8764c.m53379B1(act, str, privilege);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ws */
    public long mo33623ws() {
        return n3b0.m157734i();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: wt */
    public void mo33624wt(Act act, String str, Act.AbstractC4304w abstractC4304w) {
        if (upa.m194665L3()) {
            act.startActivityForResult(ProfileAct.m50736n2(act, str, "from_picks", true), 24);
        } else {
            act.startActivityForResultWithCustomTransition(ProfileAct.m50736n2(act, str, "from_picks", true), 24, abstractC4304w);
        }
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: x8 */
    public C22306c<View> mo33625x8(Act act, d30 d30Var) {
        if (u0n.m191358q()) {
            return u0n.m191353l().m191362j(9).mo110210a(act, d30Var);
        }
        return null;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: xb */
    public String mo33626xb() {
        return kyc0.m147853b();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: xg */
    public void mo33627xg(Act act) {
        act.startActivity(IntlMeetAct.m39353Y1(act, "", Visitor.TYPE));
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: xo */
    public ProfileCompletionConfig mo33628xo() {
        return upa.m194797p();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ye */
    public void mo33629ye(Act act, g30<PurchaseType, Act, String> g30Var) {
        new fd5.C16808e(act).m120958j(PurchaseType.TYPE_INTL_TTT_COIN).m120951c(17).m120952d("p_knowmyself_purchase,e_knowmyself_test,click").m120955g(g30Var).m120960l();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: yl */
    public CharSequence mo33630yl(User user) {
        return obe0.m163422d(user);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: z1 */
    public boolean mo33631z1() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: z6 */
    public int mo33632z6() {
        return tkp.m189530e();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: z7 */
    public boolean mo33633z7() {
        return aa3.m95522f();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: z9 */
    public boolean mo33634z9() {
        return C8609a.m50237U();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: za */
    public qed0.C19470a mo33635za(int i, int i2) {
        return obe0.m163428j(i, i2);
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: zc */
    public int mo33636zc(Relationship relationship) {
        if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), MatchFrom.superLikedEach)) {
            return 13;
        }
        if (relationship.status.size() == 0 || !TEnum.equals(relationship.status.get(0), MatchFrom.superLiked)) {
            return (relationship.status.size() == 0 || !TEnum.equals(relationship.status.get(0), "secretcrush")) ? 0 : 1;
        }
        return 11;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: zg */
    public boolean mo33637zg() {
        return ke50.m145714a();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: zi */
    public boolean mo33638zi(Act act) {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: zj */
    public String mo33639zj(@NonNull User user) {
        return NullChecker.m81304b(user.m60124fp()) ? user.m60124fp().profileSize(t100.f167240O).formatted() : "";
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: zq */
    public void mo33640zq(Act act, boolean z) {
        zbi0.m217866O(act, z);
    }
}
