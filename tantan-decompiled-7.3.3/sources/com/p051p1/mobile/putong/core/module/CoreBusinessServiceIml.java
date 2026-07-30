package com.p051p1.mobile.putong.core.module;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.PutongCoreAct;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.CityCBanner;
import com.p051p1.mobile.putong.core.data.CityCData;
import com.p051p1.mobile.putong.core.data.FreeTrialOperateResult;
import com.p051p1.mobile.putong.core.data.HometownSuggest;
import com.p051p1.mobile.putong.core.data.LikedUser;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.data.PicksUser;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProfileCompletionConfig;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.RoamedLocationData;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegePrice;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.SwitchConvNextConfig;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.data.VisitorSortType;
import com.p051p1.mobile.putong.core.map.IntlMapAct;
import com.p051p1.mobile.putong.core.module.CoreBusinessServiceIml;
import com.p051p1.mobile.putong.core.newui.fake.C7997b;
import com.p051p1.mobile.putong.core.newui.greet.DynamicGreetListAct;
import com.p051p1.mobile.putong.core.newui.home.C8145d;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.newui.home.marrymode.MarrModeProfileCardView;
import com.p051p1.mobile.putong.core.newui.intlmeet.IntlMeetAct;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.messages.OOFMkWebViewAct;
import com.p051p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import com.p051p1.mobile.putong.core.newui.messages.search.ConversationSearchAct;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.core.p058ui.greet.C8523d;
import com.p051p1.mobile.putong.core.p058ui.home.VirtualCard;
import com.p051p1.mobile.putong.core.p058ui.intl.visitor.IntlVisitorsAct;
import com.p051p1.mobile.putong.core.p058ui.likedusers.LikedUsersAct;
import com.p051p1.mobile.putong.core.p058ui.likedusers.tablayout.NewMyLikedUsersAct;
import com.p051p1.mobile.putong.core.p058ui.match.C8618a;
import com.p051p1.mobile.putong.core.p058ui.match.C8619b;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.core.p058ui.mediapreview.CommonMediaPreviewAct;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemBase;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.helper.MessageWarmingUpHelper;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchManager;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct_CustomTransition;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8924b;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.report.ReportAct;
import com.p051p1.mobile.putong.core.p058ui.svip.SVIPRefundAct;
import com.p051p1.mobile.putong.core.p058ui.verification.VerificationCenterAct;
import com.p051p1.mobile.putong.core.p058ui.vip.VipAct;
import com.p051p1.mobile.putong.core.p058ui.vip.VipLocationHistoryAct;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.PicksHelper;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.view.header.PicksHeaderView;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.VipBaseFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p051p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CounterLikeLimit;
import com.p051p1.mobile.putong.data.GPSkuDetails;
import com.p051p1.mobile.putong.data.LikeExtraData;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.NavigationCardIntent;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.OmsTagUserCounts;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.QualificationType;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Visitor;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VFrame;
import p153l.a0g;
import p153l.a30;
import p153l.a5i0;
import p153l.aso;
import p153l.aw90;
import p153l.b83;
import p153l.b8d0;
import p153l.bdr;
import p153l.bg40;
import p153l.bhe0;
import p153l.bn50;
import p153l.bnl0;
import p153l.bsj0;
import p153l.c8d0;
import p153l.c9c0;
import p153l.cjj;
import p153l.d79;
import p153l.dbc0;
import p153l.dzl;
import p153l.e1b;
import p153l.ebn;
import p153l.efh0;
import p153l.ej1;
import p153l.ela;
import p153l.eu4;
import p153l.fcp;
import p153l.fe5;
import p153l.fp5;
import p153l.g3k0;
import p153l.gj40;
import p153l.gp5;
import p153l.gra;
import p153l.gs50;
import p153l.gta;
import p153l.gw90;
import p153l.hso;
import p153l.hxf;
import p153l.i25;
import p153l.i4g0;
import p153l.joa;
import p153l.jyb;
import p153l.k3d0;
import p153l.kec0;
import p153l.kn5;
import p153l.ktl0;
import p153l.l4g0;
import p153l.ljf;
import p153l.lrj0;
import p153l.m27;
import p153l.ma3;
import p153l.n3x;
import p153l.n55;
import p153l.n6d0;
import p153l.nwb;
import p153l.o5h0;
import p153l.o6d0;
import p153l.oby;
import p153l.och0;
import p153l.ojr;
import p153l.oql0;
import p153l.p6d0;
import p153l.pa3;
import p153l.pci;
import p153l.pcj;
import p153l.pej0;
import p153l.pf60;
import p153l.pn90;
import p153l.pow;
import p153l.pqb;
import p153l.psd0;
import p153l.psl0;
import p153l.q8g0;
import p153l.qa00;
import p153l.qcj;
import p153l.qj90;
import p153l.qs50;
import p153l.qtk;
import p153l.r1j0;
import p153l.r3c0;
import p153l.rbb0;
import p153l.rk60;
import p153l.rm50;
import p153l.rv4;
import p153l.smd0;
import p153l.spl0;
import p153l.tje0;
import p153l.tmp;
import p153l.u1z;
import p153l.u2n;
import p153l.u73;
import p153l.ugy;
import p153l.ux0;
import p153l.uxj0;
import p153l.v7m;
import p153l.v83;
import p153l.vnb;
import p153l.w1e;
import p153l.wcl0;
import p153l.wtd0;
import p153l.wyb0;
import p153l.x0m;
import p153l.x20;
import p153l.x6d0;
import p153l.xck;
import p153l.xhj;
import p153l.xu90;
import p153l.xwa;
import p153l.xxv;
import p153l.xzc0;
import p153l.y20;
import p153l.y3m;
import p153l.y6d0;
import p153l.yie0;
import p153l.z5h0;
import p153l.z97;
import p153l.zki0;

/* JADX INFO: loaded from: classes10.dex */
@Route(name = "CoreBusinessService", path = "/core_business/service")
public class CoreBusinessServiceIml implements CoreBusinessService, z97 {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.module.CoreBusinessServiceIml$a */
    public class C7978a implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x0m f21938a;

        public C7978a(x0m x0mVar) {
            this.f21938a = x0mVar;
        }

        @Override // p153l.x20
        public void call() {
            ma3.m157623f(this.f21938a.mo37761q1(), true, ma3.m157620c(), false, Privilege.minBoost);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.module.CoreBusinessServiceIml$b */
    public class C7979b implements a30<PurchaseType, Act, String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x0m f21940a;

        public C7979b(x0m x0mVar) {
            this.f21940a = x0mVar;
        }

        @Override // p153l.a30
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo37058a(PurchaseType purchaseType, Act act, String str) {
            ma3.m157623f(this.f21940a.mo37761q1(), true, ma3.m157620c(), false, Privilege.minBoost);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.module.CoreBusinessServiceIml$c */
    public class C7980c implements y3m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x0m f21942a;

        public C7980c(x0m x0mVar) {
            this.f21942a = x0mVar;
        }

        @Override // p153l.y3m
        /* JADX INFO: renamed from: d */
        public boolean mo37060d() {
            return true;
        }

        @Override // p153l.y3m
        /* JADX INFO: renamed from: e */
        public boolean mo37061e() {
            this.f21942a.mo37749V(SwipeDirection.RIGHT);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.module.CoreBusinessServiceIml$d */
    public class C7981d implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x0m f21944a;

        public C7981d(x0m x0mVar) {
            this.f21944a = x0mVar;
        }

        @Override // p153l.x20
        public void call() {
            r1j0.m179420g(this.f21944a.mo37751Y1(R$string.f18786Q9));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.module.CoreBusinessServiceIml$e */
    public class C7982e implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x0m f21946a;

        public C7982e(x0m x0mVar) {
            this.f21946a = x0mVar;
        }

        @Override // p153l.x20
        public void call() {
            this.f21946a.mo37749V(SwipeDirection.RIGHT);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.module.CoreBusinessServiceIml$f */
    public class C7983f implements bn50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f21948a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ x20 f21949b;

        public C7983f(x20 x20Var, x20 x20Var2) {
            this.f21948a = x20Var;
            this.f21949b = x20Var2;
        }

        @Override // p153l.bn50
        /* JADX INFO: renamed from: a */
        public void mo31848a() {
            if (NullChecker.m82486a(this.f21949b)) {
                this.f21949b.call();
            }
        }

        @Override // p153l.bn50
        /* JADX INFO: renamed from: c */
        public void mo31849c() {
            if (NullChecker.m82486a(this.f21948a)) {
                this.f21948a.call();
            }
        }
    }

    /* JADX INFO: renamed from: Gt */
    public static /* synthetic */ void m37030Gt(Boolean bool) {
    }

    /* JADX INFO: renamed from: Jt */
    public static /* synthetic */ void m37033Jt(Boolean bool) {
    }

    /* JADX INFO: renamed from: Kt */
    public static /* synthetic */ void m37034Kt(C8145d c8145d, boolean z, Act act, Relationship relationship) {
        HomeStatisticsHelper.m37691B(c8145d, "success");
        if (!TEnum.equals(relationship.state, "matched")) {
            if (z) {
                z5h0.m218665L(act);
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
        act.startActivityWithCustomTransition(MatchAct.m48746g2(act, jyb.m147507f0(relationship.f39654id), i, new ArrayList()), new MatchAct.C8617b());
    }

    /* JADX INFO: renamed from: Mt */
    public static /* synthetic */ void m37036Mt(Act act) {
        i4g0.m138520r("e_avatarVerification_explain_click", "p_avatarVerification_icon_explain_guide_Unverified");
        if (TEnum.equals(CoreModule.f18264c.f20294B0.m32623s4(), "pending")) {
            CoreDlg.m46170G1(act, act.string(R$string.f19259fs), act.string(R$string.f19228es), dbc0.f87123jk, act.string(R$string.f18894Tr), null, false, null, null, null, null, true, false, null, null, false);
        } else {
            hxf.m137587h(act, OMSTemplateType.dialog);
        }
    }

    /* JADX INFO: renamed from: Nt */
    public static /* synthetic */ void m37037Nt(Throwable th) {
        if (ela.m121122r3() > 0) {
            CoreModule.f18264c.f20297C0.m146425v4();
        }
    }

    /* JADX INFO: renamed from: Ot */
    public static /* synthetic */ void m37038Ot(y20 y20Var) {
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: Qt */
    public static /* synthetic */ void m37040Qt(Act act) {
        a5i0.m96160p0().m96204S0();
        ma3.m157621d(act, true);
    }

    /* JADX INFO: renamed from: Tt */
    public static /* synthetic */ void m37043Tt(Boolean bool) {
    }

    /* JADX INFO: renamed from: Wt */
    public static /* synthetic */ void m37046Wt(y20 y20Var) {
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: Xt */
    public static /* synthetic */ void m37047Xt() {
        CoreModule.f18264c.f20400k1.m121123A3();
        CoreModule.f18264c.f20297C0.m146425v4();
    }

    /* JADX INFO: renamed from: Yt */
    public static /* synthetic */ void m37048Yt(ugy ugyVar) {
    }

    /* JADX INFO: renamed from: bu */
    public static /* synthetic */ void m37051bu(boolean z, Act act, boolean z2, boolean z3, User user, Relationship relationship) {
        CoreModule.f18264c.f20400k1.m121123A3();
        int i = 1;
        if (TEnum.equals(relationship.state, "matched")) {
            if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get(MatchFrom.superLikedEach)) {
                i = 13;
            } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get(MatchFrom.superLiked)) {
                i = z ? 12 : 11;
            } else if (relationship.status.size() == 0 || relationship.status.get(0) != MatchFrom.get("secretcrush")) {
                i = 0;
            }
            act.startActivityWithCustomTransition(MatchAct.m48746g2(act, jyb.m147507f0(relationship.f39654id), i, new ArrayList()), new MatchAct.C8617b());
        } else if (z2) {
            if (z) {
                if (z3) {
                    PicksHelper.m57909o(act, user, true);
                    CoreModule.f18264c.f20297C0.m146425v4();
                } else {
                    z5h0.m218665L(act);
                }
            } else if (z3) {
                PicksHelper.m57909o(act, user, false);
                CoreModule.f18264c.f20297C0.m146425v4();
            }
        }
        if (gta.m132210e().m132214d().mo34925t() && z3) {
            CoreModule.f18264c.f20405m0.m32097d9();
        }
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: A4 */
    public void mo34283A4(Act act) {
        CoreBusinessModule.m30906m0().mo122540A4(act);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: A7 */
    public Intent mo34284A7(Act act) {
        return NewMainAct.m40697M5(act, NavigationIntent.get("cards"));
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: A9 */
    public void mo34285A9(Act act, String str) {
        eu4.m122523b().m122527e(act, str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ab */
    public boolean mo34286Ab(PurchaseType purchaseType) {
        return ej1.m120955b(purchaseType);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ad */
    public void mo34287Ad(Act act, String str, View view, y20<Boolean> y20Var) {
        act.startActivityForResultWithCustomTransition(ProfileAct.m51920o2(act, str, "from_intl_meet", true), 18, new pn90(view, y20Var));
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ak */
    public boolean mo34288Ak(List<OmsTagUserCounts> list) {
        return gj40.m130415o().m130433R(list).f104596a;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Al */
    public String mo34289Al(Media media) {
        return nwb.m164968f(media).formatted();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ao */
    public void mo34290Ao(final boolean z, final boolean z2, final boolean z3, final User user, final Act act, final String str, final boolean z4) {
        final C8145d c8145dM37702e = HomeStatisticsHelper.m37702e("p_vas_paid_recovery_pop", z3, z, z2, user);
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            c8145dM37702e.f23721h = HomeStatisticsHelper.ScActionFrom.INTL_RECOVERY_POP;
            final CounterLikeLimit counterLikeLimit = CoreModule.f18264c.m32487o3().likeLimit;
            if (userM116600p9.isJailed()) {
                CoreModule.m30930K().startJailedDialogLikeAct();
                HomeStatisticsHelper.m37691B(c8145dM37702e, "failJailedUser");
            } else if (!userM116600p9.isNameFake()) {
                act.duringCreated((C22421c) CoreModule.f18264c.f20297C0.m146425v4().flatMap(new qcj() { // from class: l.ka7
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return CoreModule.f18264c.f20381e0.m116470H9();
                    }
                })).subscribe(psd0.m173596G(new y20() { // from class: l.ma7
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f135477a.m37056eu(z, counterLikeLimit, act, str, z4, z2, c8145dM37702e, z3, user, (uxj0) obj);
                    }
                }));
            } else {
                HomeStatisticsHelper.m37691B(c8145dM37702e, "failFakeUser");
                qtk.m177999T0(act);
            }
        }
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: B7 */
    public boolean mo34291B7() {
        return gra.m131782z3();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: B9 */
    public float mo34292B9() {
        return VSwipeCard.f21018C;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Bb */
    public void mo34293Bb(Act act) {
        b83.m102905g(act);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Bc */
    public CharSequence mo34294Bc(User user, Context context, int[] iArr) {
        return tje0.m191430c(user, context, iArr);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Be */
    public void mo34295Be() {
        u1z.f177142g.m137019l(uxj0.f181467a);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Bn */
    public long mo34296Bn() {
        return rbb0.m180735g();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Bp */
    public void mo34297Bp(PutongFrag putongFrag, int i) {
        if ((putongFrag instanceof VipNewUiFrag) && i == 2) {
            ((VipNewUiFrag) putongFrag).m58683S4();
        }
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: C7 */
    public void mo34298C7(Act act, CityCBanner cityCBanner) {
        new n55(act, "").m161674K(1, null, cityCBanner);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: C9 */
    public void mo34299C9(View view, BusinessEntranceStyle businessEntranceStyle) {
        ((PicksHeaderView) view).m58006b((businessEntranceStyle == BusinessEntranceStyle.PICKS && PicksHelper.INSTANCE.m57923b().m57919n()) ? PicksHelper.HeaderType.EXPAND : PicksHelper.HeaderType.HIDE);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Cc */
    public Act.AbstractC4455w mo34300Cc(View view, y20<Boolean> y20Var) {
        return new pn90(view, y20Var);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Cj */
    public String mo34301Cj() {
        return "https://auto.tancdn.com/v1/raw/bd957249-2f80-4f31-adcd-a3eefc6afbad12.svga";
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ck */
    public int mo34302Ck() {
        return 18;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Cm */
    public int mo34303Cm() {
        return r3c0.m179589k();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Cs */
    public CharSequence mo34304Cs(User user, User user2) {
        return b8d0.m102964d(user, user2);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: D6 */
    public String mo34305D6() {
        return spl0.m187378d();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Dc */
    public C22421c<View> mo34306Dc(Act act, x20 x20Var) {
        if (u2n.m194290q()) {
            return u2n.m194285l().m194294j(4).mo154049a(act, x20Var);
        }
        return null;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: De */
    public boolean mo34307De() {
        return gra.m131750t1();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Dl */
    public void mo34308Dl(Act act, User user, String str, x20 x20Var) {
        C8619b.m48818n(act, user, str, x20Var);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Dn */
    public boolean mo34309Dn(QualificationType qualificationType) {
        return bsj0.m106252J(qualificationType);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: E5 */
    public C22421c<View> mo34310E5(Act act) {
        return !u2n.m194288o() ? C22421c.just(null) : u2n.m194285l().m194294j(6).mo109584c(act);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: E9 */
    public void mo34311E9() {
        rbb0.m180750w();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Eb */
    public void mo34312Eb(Act act) {
        gs50.m131966O().m131993H(act, "use_up");
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ef */
    public void mo34313Ef(x0m x0mVar, String str) {
        wyb0.m208493O().m208542M(x0mVar.mo37761q1(), str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: En */
    public boolean mo34314En() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Eo */
    public void mo34315Eo(Act act, PurchaseType purchaseType, boolean z, x20 x20Var, x20 x20Var2, String str) {
        hso hsoVar = new hso(act, purchaseType);
        hsoVar.m137011t(new C7983f(x20Var, x20Var2));
        hsoVar.m137007p(aso.m99953h(act, act instanceof PutongAct ? ((PutongAct) act).iap().m103295i() : null), z, str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Eq */
    public void mo34316Eq(Act act, String str, x20 x20Var, Privilege privilege, boolean z, User user) {
        C8927c.m54595M1(act, str, privilege, x20Var, null, z, user);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Es */
    public boolean mo34317Es() {
        return spl0.m187386l();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: F0 */
    public String mo34318F0() {
        return "diamond";
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: F2 */
    public String mo34319F2() {
        return "platinum";
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: F4 */
    public boolean mo34320F4() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: F9 */
    public boolean mo34321F9(List<String> list) {
        gj40.C17227h c17227hM130431P = gj40.m130415o().m130431P(list);
        if (NullChecker.m82486a(c17227hM130431P)) {
            return c17227hM130431P.f104596a;
        }
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Fe */
    public void mo34322Fe(Act act) {
        Intent intentM213316k = xwa.m213316k(act, NavigationIntent.get("vip"));
        intentM213316k.putExtra("navigation_to_vip_page_index", oql0.m168817a("svip"));
        act.startActivity(intentM213316k);
        act.m68056e2();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Fi */
    public String mo34323Fi() {
        return "bubble_superlike_push_id";
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: G7 */
    public boolean mo34324G7() {
        return d79.m114687k0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: G8 */
    public String mo34325G8() {
        return n6d0.m161762a();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Gd */
    public void mo34326Gd(Act act, String str, Privilege privilege, PurchaseType purchaseType, y20<PurchaseType> y20Var, int i, x20 x20Var, x20 x20Var2, String str2, Object obj, boolean z) {
        C8927c.m54561B0(act, str, privilege, purchaseType, y20Var, i, x20Var, x20Var2, str2, obj, z);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Gf */
    public boolean mo34327Gf() {
        return spl0.m187356H();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Gg */
    public int mo34328Gg() {
        return wyb0.m208508i0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Gl */
    public int mo34329Gl() {
        return -1289674463;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Go */
    public void mo34330Go(Act act, x20 x20Var, PurchaseType purchaseType, boolean z, boolean z2) {
        b83.m102912n(act, x20Var, purchaseType, z, z2);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Gq */
    public void mo34331Gq(Act act) {
        act.startActivity(DynamicGreetListAct.m37458Y1(act, null, "from_meet"));
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: H8 */
    public boolean mo34332H8(@NonNull Date date) {
        return ItemBase.m49215e(date);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: H9 */
    public String mo34333H9() {
        return SummarizedPrivilegesId.ultraPremium;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Hc */
    public void mo34334Hc(Act act, x20 x20Var, pcj<Boolean> pcjVar) {
        b83.m102914p(act, x20Var, pcjVar);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Hd */
    public boolean mo34335Hd() {
        return gra.m131614P2();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Hi */
    public boolean mo34336Hi() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Hk */
    public Intent mo34337Hk(Act act) {
        return SVIPRefundAct.m57012a2(act);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Hl */
    public int mo34338Hl(String str) {
        return z5h0.m218677r(str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ho */
    public boolean mo34339Ho() {
        return gra.m131756u2();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Hr */
    public boolean mo34340Hr() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: I9 */
    public void mo34341I9(Frag frag, User user) {
        frag.startActivity(ProfileAct.m51920o2(frag.getContext(), user.f56859id, "supreme_partner_nearby", true));
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ie */
    public String mo34342Ie() {
        return "svip";
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: If */
    public boolean mo34343If() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Il */
    public String mo34344Il() {
        return qs50.m177726b();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Im */
    public void mo34345Im(int i, ImageView imageView, boolean z) {
        xu90.m213122d().m213131j(i, imageView, z);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Iq */
    public String mo34346Iq() {
        return "currentUserId";
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: J6 */
    public void mo34347J6(Context context) {
        context.startActivity(ProfileAct.m51922q2(context, CoreModule.m30929H().userId(), "profile_frag_menu", false, true));
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: J7 */
    public void mo34348J7(Act act, PurchaseType purchaseType, x20 x20Var, x20 x20Var2) {
        C8772a.m51455o0(act, purchaseType, x20Var, x20Var2);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ja */
    public SwitchConvNextConfig mo34349Ja() {
        return gra.m131690h1();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Jj */
    public String mo34350Jj() {
        return qs50.m177729e();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Jl */
    public void mo34351Jl(Act act) {
        C7997b.m37423r().m37444y(act, a0g.m95349E(act));
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: K4 */
    public boolean mo34352K4() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: K6 */
    public Intent mo34353K6(Context context) {
        return VipAct.m57419b2(context);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Kc */
    public void mo34354Kc(Act act, int i, x20 x20Var) {
        g3k0 g3k0Var = new g3k0(act, 0);
        g3k0Var.m128750F(x20Var);
        g3k0Var.show();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Kf */
    public boolean mo34355Kf() {
        return d79.m114654M();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Kj */
    public boolean mo34356Kj() {
        return spl0.m187387m();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Kp */
    public int mo34357Kp() {
        return o6d0.m166220j0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ks */
    public boolean mo34358Ks(Privilege privilege) {
        return a5i0.m96180x(privilege);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: L6 */
    public void mo34359L6(Act act, String str, Privilege privilege, User user) {
        C8927c.m54595M1(act, str, privilege, null, null, false, user);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: L8 */
    public String mo34360L8() {
        return "heart_confession_content";
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: L9 */
    public CharSequence mo34361L9(User user, View view, TextView textView) {
        return tje0.m191434g(user, view, textView);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: La */
    public List<NewTags> mo34362La(List<String> list) {
        return gj40.m130415o().m130431P(list).m130460b();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Lb */
    public String mo34363Lb() {
        return tmp.m191802h();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ld */
    public boolean mo34364Ld(@Nullable Counter counter) {
        return rbb0.m180745r(counter);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Lf */
    public void mo34365Lf(Act act, String str, Privilege privilege, y20<PurchaseType> y20Var, final y20<Boolean> y20Var2) {
        C8927c.m54558A0(act, str, privilege, null, y20Var, -1, new x20() { // from class: l.la7
            @Override // p153l.x20
            public final void call() {
                CoreBusinessServiceIml.m37046Wt(y20Var2);
            }
        }, new x20() { // from class: l.qa7
            @Override // p153l.x20
            public final void call() {
                CoreBusinessServiceIml.m37038Ot(y20Var2);
            }
        });
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: Lg */
    public boolean mo37052Lg() {
        return joa.m146354D3();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Lm */
    public Intent mo34366Lm(Act act, ArrayList<String> arrayList, int i, ArrayList<String> arrayList2) {
        return MatchAct.m48746g2(act, arrayList, i, arrayList2);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Lp */
    public void mo34367Lp(SpannableString spannableString, String str, String str2, int i, int i2, int i3, int i4) {
        yie0.m216086s(spannableString, str, str2, i, i2, i3, i4);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Mb */
    public boolean mo34368Mb() {
        return d79.m114662U();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Mc */
    public void mo34369Mc(final Act act, String str) {
        C8927c.m54674s1(act, str, new y20() { // from class: l.aa7
            @Override // p153l.y20
            public final void call(Object obj) {
                l51.m152888H(act, new Runnable() { // from class: l.ra7
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreBusinessServiceIml.m37047Xt();
                    }
                }, 1000L);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Me */
    public void mo34370Me(Act act, User user, String str, x20 x20Var) {
        C8618a.m48771w().m48793p(act, user, str, x20Var);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Mf */
    public boolean mo34371Mf() {
        return spl0.m187374Z();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Mi */
    public boolean mo34372Mi() {
        return spl0.m187382h();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Mj */
    public v7m mo34373Mj(FrameLayout frameLayout, String str, RecyclerView.AbstractC0584t abstractC0584t) {
        MarrModeProfileCardView marrModeProfileCardView = new MarrModeProfileCardView(frameLayout.getContext());
        marrModeProfileCardView.m39761d(str);
        marrModeProfileCardView.m45511b(abstractC0584t);
        frameLayout.addView(marrModeProfileCardView, new FrameLayout.LayoutParams(-1, -1));
        return marrModeProfileCardView;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Mp */
    public void mo34374Mp(Act act, User user, y20<String> y20Var, boolean z) {
        bdr.m103630h(act, user, y20Var, z);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Mr */
    public void mo34375Mr(Act act, String str, x20 x20Var, x20 x20Var2, y20<PurchaseType> y20Var) {
        C8927c.m54625b1(act, str, x20Var, x20Var2, y20Var);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: N7 */
    public int mo34376N7() {
        return 48;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: N8 */
    public boolean mo34377N8() {
        Settings settings = CoreModule.f18264c.f20381e0.m116600p9().settings;
        return settings != null && TEnum.equals(settings.getLookingFor(), "female");
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Nf */
    public int mo34378Nf() {
        return rbb0.m180731c();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Nm */
    public int mo34379Nm() {
        return c8d0.m108354d0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Nn */
    public void mo34380Nn(Act act, String str, View view, boolean z) {
        if (gra.m131596L3()) {
            act.startActivityForResult(ProfileAct.m51920o2(act, str, "from_new_meet_likers", true), z ? 82 : 81);
        } else {
            act.startActivityForResultWithCustomTransition(ProfileAct.m51920o2(act, str, "from_new_meet_likers", true), z ? 82 : 81, new pn90(view, new y20() { // from class: l.ea7
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreBusinessServiceIml.m37043Tt((Boolean) obj);
                }
            }));
        }
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: No */
    public boolean mo34381No() {
        return fcp.m125033y();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Np */
    public boolean mo34382Np() {
        return spl0.m187350B();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: O */
    public boolean mo34383O() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: O1 */
    public String mo34384O1() {
        return "partner";
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: O7 */
    public boolean mo34385O7() {
        return spl0.m187363O();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: O8 */
    public boolean mo34386O8() {
        return gra.m131564F1();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: O9 */
    public Intent mo34387O9(Act act, String str, boolean z, ResultReceiver resultReceiver) {
        return ReportAct.m55811b2(act, str, z, resultReceiver);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ob */
    public String mo34388Ob(int i, String str) {
        return C8772a.m51402C(i, str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Oo */
    public boolean mo34389Oo() {
        return spl0.m187381g();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Op */
    public boolean mo34390Op() {
        return gra.m131594L1();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: P7 */
    public boolean mo34391P7() {
        return bhe0.m104330c();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: P8 */
    public int mo34392P8() {
        return 50;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ph */
    public boolean mo34393Ph() {
        return o6d0.m166214d0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Pl */
    public void mo34394Pl(boolean z, View view) {
        if (view instanceof VirtualCard) {
            ((VirtualCard) view).m47269L0(z);
        }
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Po */
    public void mo34395Po(final Act act) {
        hxf.m137593n();
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_avatarVerification_icon_explain_guide_Unverified", Dialog.class.getName());
        w1e.m204402f(l4g0VarM204399c);
        CoreDlg.m46170G1(act, act.string(R$string.f18924Ur), act.string(R$string.f19567ps), dbc0.f87506v8, act.string(R$string.f19505ns), new x20() { // from class: l.wa7
            @Override // p153l.x20
            public final void call() {
                CoreBusinessServiceIml.m37036Mt(act);
            }
        }, true, act.string(R$string.f19474ms), new x20() { // from class: l.xa7
            @Override // p153l.x20
            public final void call() {
                i4g0.m138520r("e_avatarVerification_explain_cancle_click", "p_avatarVerification_icon_explain_guide_Unverified");
            }
        }, new x20() { // from class: l.ba7
            @Override // p153l.x20
            public final void call() {
                w1e.m204401e(l4g0VarM204399c);
            }
        }, null, true, false, null, null, false);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Q8 */
    public void mo34396Q8(Act act, RoamedLocationData roamedLocationData) {
        if (psl0.m173668n("p_select_location_view,e_manyou,click", act, null)) {
            xxv.m213579f();
            if (roamedLocationData.data.size() >= 5) {
                act.startActivityForResult(VipLocationHistoryAct.m57459X1(act, VipBaseFrag.f38350B), 3);
            } else {
                act.startActivityForResult(IntlMapAct.m36949g2(act, 1, VipBaseFrag.f38350B), 2);
            }
        }
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Qb */
    public boolean mo34397Qb() {
        return spl0.m187372X();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Qp */
    public void mo34398Qp(Activity activity) {
        activity.startActivity(mo34436Vf() ? NewMyLikedUsersAct.m48003Z1(activity) : new Intent(activity, (Class<?>) LikedUsersAct.class));
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Qr */
    public int mo34399Qr() {
        return 49;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: R6 */
    public String mo34400R6() {
        return fcp.m125032x();
    }

    @Override // p153l.r97
    /* JADX INFO: renamed from: R7 */
    public void mo37053R7(String str, String str2) {
        gp5.m131237k(str, str2);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ri */
    public void mo34401Ri(boolean z) {
        C8772a.f33518f = true;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Rj */
    public Intent mo34402Rj(Act act, String str, LikedUser likedUser) {
        return ProfileAct.m51921p2(act, str, "from_meet_feed", true, likedUser);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Rl */
    public String mo34403Rl(int i) {
        return yie0.m216074f(i);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Rm */
    public void mo34404Rm(Act act, String str) {
        C8927c.m54685w0(act, str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Rn */
    public boolean mo34405Rn() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Rr */
    public void mo34406Rr(long j) {
        aw90.m100562F().m100636z(j);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Sc */
    public void mo34407Sc(Act act, String str, y20<PurchaseType> y20Var) {
        C8927c.m54674s1(act, str, y20Var);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Sh */
    public void mo34408Sh() {
        och0.m167218d();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Sk */
    public boolean mo34409Sk() {
        return gra.m131560E2();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Sl */
    public void mo34410Sl(Act act, String str, Privilege privilege, x20 x20Var, Object obj) {
        C8927c.m54568D1(act, str, privilege, x20Var, obj);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Sm */
    public C22421c<Optional<List<GPSkuDetails>>> mo34411Sm(Context context, ArrayList<String> arrayList, boolean z, long j) {
        return cjj.m110207O(context, arrayList, z, j);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Sn */
    public void mo34412Sn(Context context, String str, int i, boolean z, String str2) {
        context.startActivity(VipAct.m57425i2(context, str, i, z, str2));
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: So */
    public void mo34413So(x0m x0mVar) {
        b83.m102913o(x0mVar.mo37761q1(), new C7981d(x0mVar), new C7982e(x0mVar), PurchaseType.TYPE_SPOTLIGHT, true);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Sp */
    public boolean mo34414Sp() {
        return o6d0.m166224n0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Sq */
    public Intent mo34415Sq(Act act, String str) {
        return ProfileAct.m51920o2(act, str, "from_new_meet_see_feed", true);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: T9 */
    public void mo34416T9(Act act, PurchaseType purchaseType, x20 x20Var, x20 x20Var2, int i) {
        o5h0.m166149v(act, purchaseType, x20Var, x20Var2, i);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ta */
    public void mo34417Ta(boolean z) {
        i25.f112582a = z;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Tb */
    public int mo34418Tb(boolean z) {
        return c8d0.m108355e0(z);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Td */
    public CharSequence mo34419Td(int i) {
        return b8d0.m102967j(i);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Th */
    public void mo34420Th(String str) {
        aw90.m100562F().m100623m0(str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Tj */
    public void mo34421Tj(boolean z, User user, VFrame vFrame) {
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Tl */
    public int mo34422Tl(User user) {
        return xu90.m213122d().m213127f(user);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Tm */
    public int mo34423Tm() {
        return lrj0.m155631b();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Tn */
    public int mo34424Tn() {
        return ktl0.m151379q0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Tq */
    public long mo34425Tq() {
        return wtd0.m207833e().m207842l();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Tr */
    public boolean mo34426Tr() {
        return n3x.m161369j();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ts */
    public List<String> mo34427Ts(List<String> list) {
        return gj40.m130415o().m130437V(list);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: U */
    public boolean mo34428U() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: U7 */
    public void mo34429U7(Act act, SummarizedPrivilegePrice summarizedPrivilegePrice, x20 x20Var, x20 x20Var2) {
        z5h0.m218675j().m218689h(act, summarizedPrivilegePrice, x20Var, x20Var2);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ub */
    public String mo34430Ub(Media media) {
        return nwb.m164970h(media).formatted();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ue */
    public void mo34431Ue(Act act, boolean z) {
        qtk.m177997S0(act, z);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Uh */
    public void mo34432Uh(Act act, String str) {
        C8927c.m54574F1(act, str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Un */
    public String mo34433Un(VirtualCardType virtualCardType) {
        return y6d0.m214468g(virtualCardType);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Up */
    public boolean mo34434Up() {
        return OnlineMatchManager.m51326z().m51327A() == OnlineMatchManager.QuickChatProduce.Heartbeat;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: V7 */
    public boolean mo34435V7(double d) {
        return MessageWarmingUpHelper.m50371r(d).value >= MessageWarmingUpHelper.WarmingUpLevel.third.value;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Vf */
    public boolean mo34436Vf() {
        return spl0.m187349A() || spl0.m187350B();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Vl */
    public PurchaseType mo34437Vl() {
        return C8772a.m51457p0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: W9 */
    public boolean mo34438W9() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: We */
    public boolean mo34439We() {
        return gra.m131776y2() || gra.m131540A2();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Wf */
    public Intent mo34440Wf(Context context, NavigationCardIntent navigationCardIntent, Map<String, String> map) {
        return NewMainAct.m40702O5(context, NavigationIntent.get("cards"), navigationCardIntent, map);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Ws */
    public void mo34441Ws(final Act act, User user, final boolean z, final boolean z2, final User user2) {
        if (user.isJailed()) {
            CoreModule.m30930K().startJailedDialogLikeAct();
            return;
        }
        if (user.isNameFake()) {
            qtk.m177999T0(act);
            return;
        }
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(HomeStatisticsHelper.ScActionFrom.MEET.toString()).isLike(true).isFromButton(false).isSuperLiked(z2).user(user2.f56859id).build();
        boolean z3 = !joa.m146358H3() && ela.m121122r3() > 0;
        PicksUser picksUser = (PicksUser) jyb.m147529r(CoreModule.f18264c.f20400k1.m121127F3().f184001a, new qcj() { // from class: l.sa7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((PicksUser) obj).f21210id, user2.f56859id));
            }
        });
        final boolean z4 = z3;
        act.duringCreated(CoreModule.f18264c.f20405m0.m32076Y7(true, z2, null, user2, "", LikeFrom.get("mymeet"), true, likeExtraDataNew_, 0, NullChecker.m82486a(picksUser) ? picksUser.picksTracker : null)).subscribe(psd0.m173597H(new y20() { // from class: l.ta7
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreBusinessServiceIml.m37051bu(z2, act, z, z4, user2, (Relationship) obj);
            }
        }, new y20() { // from class: l.ua7
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreBusinessServiceIml.m37037Nt((Throwable) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: X5 */
    public boolean mo34442X5() {
        return gra.m131646X2();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: X6 */
    public boolean mo34443X6() {
        return m27.m156744I3();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Xc */
    public void mo34444Xc(Frag frag, String str, View view, y20<Boolean> y20Var) {
        if (gra.m131596L3()) {
            frag.startActivityForResult(ProfileAct.m51920o2(frag.getContext(), str, "liked_users", true), 18);
        } else {
            frag.m21601v4(ProfileAct.m51920o2(frag.getContext(), str, "liked_users", true), 18, new pn90(view, y20Var));
        }
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Xi */
    public boolean mo34445Xi() {
        return d79.m114661T();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Xn */
    public boolean mo34446Xn() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Xo */
    public View mo34447Xo(Act act, ViewGroup viewGroup) {
        return act.inflater().inflate(kec0.f125441H8, viewGroup, false);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Xq */
    public int mo34448Xq() {
        return tmp.m191803i();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Xr */
    public Intent mo34449Xr(Context context, String str) {
        return MessagesAct.m50126k2(context, str, false, false);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Y3 */
    public String mo34450Y3() {
        return "vip";
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Y4 */
    public int mo34451Y4() {
        return rbb0.m180739l();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Y9 */
    public boolean mo34452Y9() {
        return spl0.m187360L();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Yd */
    public boolean mo34453Yd() {
        return spl0.m187357I();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Yf */
    public smd0.C20104a mo34454Yf(int i, int i2) {
        return tje0.m191429b(i, i2);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Yj */
    public void mo34455Yj(Act act, User user, VDraweeView vDraweeView, LinearLayout linearLayout) {
        act.startActivityForResultWithCustomTransition(ProfileAct.m51920o2(act, user.f56859id, "likers", true), 18, (!(act instanceof LikersAct) || gra.m131596L3()) ? null : new ojr(vDraweeView, linearLayout));
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Yo */
    public void mo34456Yo(boolean z) {
        p6d0.m170847d0().f150816i = z;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Yp */
    public boolean mo34457Yp() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Z9 */
    public int mo34458Z9() {
        return 24;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Za */
    public void mo34459Za(Act act, String str, Object obj, String str2, boolean z) {
        C8523d.a aVar = new C8523d.a(str, "meet");
        aVar.m47099m(obj).m47100n(str2).m47096j(z);
        C8523d.m47075a(act, aVar);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Zd */
    public void mo34460Zd() {
        p6d0.m170847d0().m170853h0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Zh */
    public void mo34461Zh(Act act, String str, ArrayList<String> arrayList, C4468a.a aVar) {
        act.startActivityForResultWithCustomTransition(CommonMediaPreviewAct.m48988a2(act, str, arrayList), 100, new kn5(), aVar);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Zi */
    public boolean mo34462Zi() {
        return yie0.m216073e();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: Zp */
    public boolean mo34463Zp() {
        return xzc0.m213720r().m213750y();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ad */
    public boolean mo34464ad() {
        return OnlineMatchManager.m51326z().m51338L();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ah */
    public void mo34465ah(x0m x0mVar) {
        CoreModule.m30933P().m143405a().mo34575qm(x0mVar.mo37761q1(), "feedBoostCard", Privilege.boost, null);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ai */
    public List<NewTags> mo34466ai(List<OmsTagUserCounts> list) {
        return gj40.m130415o().m130433R(list).m130460b();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: aj */
    public Intent mo34467aj(Context context, String str) {
        return VipLocationHistoryAct.m57459X1(context, str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: al */
    public String mo34468al() {
        return qs50.m177728d();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: an */
    public void mo34469an(Frag frag, User user) {
        frag.startActivity(ProfileAct.m51920o2(frag.getContext(), user.f56859id, "supreme_partner_customize", true));
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ap */
    public void mo34470ap(Act act, CityCData cityCData) {
        new n55(act, "").m161674K(2, cityCData, null);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: b3 */
    public int mo34471b3() {
        return C8772a.m51429b0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: b9 */
    public boolean mo34472b9() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: bc */
    public int mo34473bc() {
        return dbc0.f86963en;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: bd */
    public pej0 mo34474bd(Act act, String str, x20 x20Var, x20 x20Var2) {
        return qtk.m178001U0(act, str, x20Var, x20Var2);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: bi */
    public boolean mo34475bi(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(MonetizationPromotionsId.lowPriceFirstTime12MSVIP);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: bk */
    public String mo34476bk() {
        return qs50.m177727c();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: c6 */
    public int mo34477c6() {
        return dbc0.f86933dq;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: c7 */
    public String mo34478c7() {
        return bg40.m104112a();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ca */
    public CharSequence mo34479ca(User user, View view, TextView textView, int i, int i2) {
        return tje0.m191435h(user, view, textView, i, i2);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: cl */
    public boolean mo34480cl(Activity activity) {
        return activity instanceof ProfileAct_CustomTransition;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: cm */
    public void mo34481cm(Act act, boolean z) {
        OnlineMatchManager.m51326z().m51366o0(act, z);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: cn */
    public boolean mo34482cn() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: cr */
    public boolean mo34483cr() {
        return gra.m131609O1();
    }

    /* JADX INFO: renamed from: cu */
    public final void m37054cu(boolean z, final boolean z2, boolean z3, final C8145d c8145d, User user, final Act act) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(c8145d.m39474f().getFrom()).isLike(z).isFromButton(z3).isSuperLiked(z2).user(user).pageId(c8145d.m39476h()).build();
        act.duringCreated(CoreModule.f18264c.f20405m0.m32076Y7(z, z2, null, user, null, LikeFrom.get("picks"), true, likeExtraDataNew_, 0, null)).subscribe(psd0.m173597H(new y20() { // from class: l.oa7
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreBusinessServiceIml.m37034Kt(c8145d, z2, act, (Relationship) obj);
            }
        }, new y20() { // from class: l.pa7
            @Override // p153l.y20
            public final void call(Object obj) {
                HomeStatisticsHelper.m37690A(c8145d, (Throwable) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: dc */
    public void mo34484dc(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, int i) {
        C8772a.m51465x(simpleDraweeView, imageUri, i);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: dd */
    public boolean mo34485dd() {
        return spl0.m187355G();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: de */
    public int mo34486de() {
        return gra.m131659b0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: dj */
    public boolean mo34487dj() {
        return gra.m131676e2();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: dm */
    public void mo34488dm(Act act, C4468a.a aVar) {
        aw90.m100562F().f73701a = null;
        ljf.m154505b(act, LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS, null, aVar);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: dn */
    public Intent mo34489dn(Context context, boolean z, String str) {
        return VerificationCenterAct.m57175Z1(context, z, str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: dp */
    public String mo34490dp(long j) {
        return a5i0.m96120U(j);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ds */
    public boolean mo34491ds() {
        return false;
    }

    /* JADX INFO: renamed from: du */
    public final /* synthetic */ void m37055du(C8145d c8145d, boolean z, boolean z2, boolean z3, User user, Act act) {
        c8145d.m39484p();
        m37054cu(z, z2, z3, c8145d, user, act);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: e2 */
    public boolean mo34492e2() {
        return rbb0.m180744q();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ea */
    public void mo34493ea(Act act, PurchaseType purchaseType, x20 x20Var, x20 x20Var2) {
        wyb0.m208531y0(act, purchaseType, x20Var, x20Var2);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: eg */
    public boolean mo34494eg() {
        Settings settings = CoreModule.f18264c.f20381e0.m116600p9().settings;
        return settings != null && TEnum.equals(settings.getLookingFor(), "male");
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: eh */
    public void mo34495eh(Act act) {
        act.startActivity(IntlVisitorsAct.INSTANCE.m47371a(act));
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ei */
    public void mo34496ei(String str) {
        y6d0.m214462a(str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: en */
    public void mo34497en() {
        p6d0.m170847d0().m170855k0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: eo */
    public void mo34498eo(Act act, String str, x20 x20Var, x20 x20Var2) {
        CoreDlg.m46286t1(act, str, x20Var, x20Var2);
    }

    /* JADX INFO: renamed from: eu */
    public final /* synthetic */ void m37056eu(final boolean z, CounterLikeLimit counterLikeLimit, final Act act, String str, boolean z2, final boolean z3, final C8145d c8145d, final boolean z4, final User user, uxj0 uxj0Var) {
        if (z && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !qj90.m176830b(PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
            m37057fu(act, str, Privilege.vip_unlimited_likes, null, z2);
            return;
        }
        if (!z3 || a5i0.m96181x0() > 0) {
            if (z3 && a5i0.m96098G1(act, new x20() { // from class: l.na7
                @Override // p153l.x20
                public final void call() {
                    this.f140982a.m37055du(c8145d, z, z3, z4, user, act);
                }
            })) {
                return;
            }
            Act act2 = act;
            m37054cu(z, z3, z4, c8145d, user, act2);
            return;
        }
        if (!joa.m146361M3()) {
            m37057fu(act, str, Privilege.vip_super_like, null, z2);
        } else {
            C8927c.m54574F1(act, str);
            HomeStatisticsHelper.m37691B(c8145d, "failExhaustSuperlike");
        }
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: fb */
    public CharSequence mo34499fb(User user) {
        return xhj.m211049d(user);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ff */
    public boolean mo34500ff(String str) {
        return TextUtils.equals(str, "from_picks") || TextUtils.equals(str, "from_meet_picks_feed") || TextUtils.equals(str, "from_meet_picks_card") || TextUtils.equals(str, "from_new_meet_picks_feed");
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: fg */
    public void mo34501fg(final Act act) {
        ebn.m120188C(act, act.string(R$string.f18463Fm), act.string(R$string.f18432Em), act.string(R$string.f18370Cm), new Runnable() { // from class: l.fa7
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                act2.startActivity(NewMainAct.m40707Q5(act2, NavigationIntent.get("setting")));
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: fh */
    public C22421c<View> mo34502fh(Act act) {
        if (u2n.m194293t()) {
            return u2n.m194285l().m194294j(5).mo109584c(act);
        }
        return null;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: fl */
    public void mo34503fl() {
        aw90.m100562F().f73701a = null;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: fm */
    public boolean mo34504fm() {
        return fcp.m125023j();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: fo */
    public int mo34505fo() {
        return tmp.m191800f();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: fr */
    public void mo34506fr(Act act, x20 x20Var, x20 x20Var2) {
        bdr.m103629g(act, x20Var, x20Var2);
    }

    /* JADX INFO: renamed from: fu */
    public final void m37057fu(Act act, String str, Privilege privilege, y20<PurchaseType> y20Var, boolean z) {
        if (z) {
            mo34577r6(act, str, privilege, y20Var, null);
        } else {
            mo34365Lf(act, str, privilege, y20Var, null);
        }
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: g5 */
    public C22421c<List<Merchandise>> mo34507g5(Context context, List<Merchandise> list) {
        return cjj.m110205M(context, list);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: gd */
    public boolean mo34508gd() {
        return o6d0.m166213c0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: gl */
    public String mo34509gl() {
        return "heart_confession_uid";
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: h5 */
    public boolean mo34510h5() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: h7 */
    public int mo34511h7() {
        return 40;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ha */
    public void mo34512ha(Act act, CityCData cityCData) {
        new n55(act, "").m161674K(3, cityCData, null);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: hc */
    public String mo34513hc(Context context, User user) {
        return e1b.m118946D0(context, user);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: he */
    public boolean mo34514he(Act act) {
        return act instanceof NewMainAct;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: hg */
    public <T extends Act> Act.AbstractC4455w mo34515hg(T t) {
        return new MatchAct.C8617b();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: hl */
    public boolean mo34516hl() {
        return !LoopFragmentFactory.m52649J(LoopInputType.HEIGHT, CoreModule.f18264c.f20381e0.m116600p9(), "from_explore_card_height");
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: hm */
    public boolean mo34517hm() {
        return spl0.m187380f();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: hn */
    public int mo34518hn() {
        return lrj0.m155630a();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ho */
    public void mo34519ho(Act act, User user) {
        fp5.m126537s(act, user);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: hp */
    public String mo34520hp() {
        return "e_card_add_tag";
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: hq */
    public boolean mo34521hq(View view) {
        return view instanceof PicksHeaderView;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ht */
    public boolean mo34522ht() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: i0 */
    public C22421c<View> mo34523i0(Act act) {
        return !u2n.m194287n() ? C22421c.just(null) : u2n.m194285l().m194294j(7).mo109584c(act);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: i6 */
    public void mo34524i6(Act act, String str, Privilege privilege) {
        C8927c.m54586J1(act, str, privilege);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ij */
    public boolean mo34525ij() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: in */
    public void mo34526in(float f) {
        CoreBusinessModule.f18252c.m193942R(f);
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: j3 */
    public boolean mo34527j3() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: jh */
    public boolean mo34528jh() {
        return spl0.m187383i();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: jj */
    public boolean mo34529jj() {
        return spl0.m187362N();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: jl */
    public void mo34530jl(Context context, String str) {
        context.startActivity(OOFMkWebViewAct.m42794o2(context, str));
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: jr */
    public Intent mo34531jr(Context context, String str, String str2, boolean z) {
        return ProfileAct.m51920o2(context, str, str2, z);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: k */
    public boolean mo34532k() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: k4 */
    public boolean mo34533k4() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: kb */
    public boolean mo34534kb() {
        return gra.m131544B1();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: kh */
    public LiteraturesComments mo34535kh(String str, String str2) {
        return BookMoviesDramasHelper.m60630m(str, str2);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: kp */
    public boolean mo34536kp(boolean z) {
        return wyb0.m208493O().m208546U(z);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: l1 */
    public void mo34537l1(Act act, String str) {
        C8927c.m54559A1(act, str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: l6 */
    public boolean mo34538l6() {
        return gra.m131766w2();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: lc */
    public boolean mo34539lc() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: lh */
    public boolean mo34540lh() {
        return gra.m131618Q2();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: lq */
    public String mo34541lq() {
        return gra.m131583J0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: lr */
    public C22421c<View> mo34542lr(Act act) {
        if (u2n.m194293t()) {
            return u2n.m194285l().m194294j(8).mo109584c(act);
        }
        return null;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ls */
    public double mo34543ls() {
        return spl0.m187379e();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: m2 */
    public boolean mo34544m2() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: m3 */
    public boolean mo34545m3() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: m7 */
    public boolean mo34546m7() {
        return spl0.m187352D();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: m9 */
    public int mo34547m9() {
        return a5i0.m96168s0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: mb */
    public String mo34548mb() {
        return fcp.m125022i().m125038h();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: me */
    public dzl mo34549me(Act act) {
        return new oby(act);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: mh */
    public void mo34550mh(x0m x0mVar, Active active) {
        C7980c c7980c = new C7980c(x0mVar);
        Act actMo37761q1 = x0mVar.mo37761q1();
        PurchaseType purchaseType = PurchaseType.TYPE_GET_LIKERS;
        rk60.m181779a(x0mVar.mo37761q1(), purchaseType, true, active.skuId, null, new pow(actMo37761q1, purchaseType, c7980c));
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: mi */
    public String mo34551mi(int i) {
        return xhj.m211047b(i);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: mo */
    public boolean mo34552mo() {
        return d79.m114659R();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: mt */
    public Intent mo34553mt(Act act, String str) {
        return ProfileAct.m51920o2(act, str, "from_new_meet_picks_feed", true);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: n8 */
    public Intent mo34554n8(Act act, ArrayList<String> arrayList, int i, ArrayList<String> arrayList2, String str) {
        return MatchAct.m48747h2(act, arrayList, i, arrayList2, str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: nk */
    public Intent mo34555nk(Context context, String str, int i) {
        return VipAct.m57423g2(context, str, i);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: nr */
    public int mo34556nr() {
        return 41;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: o6 */
    public boolean mo34557o6() {
        return C8772a.m51421V();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: oc */
    public String mo34558oc() {
        return spl0.m187377c();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: og */
    public void mo34559og() {
        rv4.m183257g();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: oi */
    public pf60<String, String> mo34560oi(int i) {
        return yie0.m216075g(i);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: op */
    public void mo34561op(@NonNull Act act, final x20 x20Var) {
        new C8924b.d(act).m54504c(1).m54509h(new a30() { // from class: l.da7
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                x20Var.call();
            }
        }).m54505d("picks").m54513l(PurchaseType.TYPE_PICKS).m54517p();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: p0 */
    public boolean mo34562p0() {
        return gra.m131776y2();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: pf */
    public boolean mo34563pf(Context context) {
        return context instanceof VipAct;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: pg */
    public void mo34564pg(Act act, a30<PurchaseType, Act, String> a30Var, int i, String str) {
        o5h0.m166151x(act, a30Var, i, str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: pi */
    public String mo34565pi(int i) {
        return xhj.m211048c(i);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: pl */
    public void mo34566pl(Act act, String str, View view, boolean z) {
        act.startActivityForResultWithCustomTransition(ProfileAct.m51920o2(act, str, "from_intl_meet_likers", true), z ? 82 : 81, new pn90(view, new y20() { // from class: l.va7
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreBusinessServiceIml.m37030Gt((Boolean) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: pp */
    public void mo34567pp(Act act) {
        CoreDlg.m46280r1(act);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: pr */
    public void mo34568pr(Act act, String str, Privilege privilege) {
        C8927c.m54687x0(act, str, privilege);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: q0 */
    public boolean mo34569q0() {
        return gra.m131586J3();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: q6 */
    public void mo34570q6(Act act, String str, y20<PurchaseType> y20Var) {
        C8927c.m54680u1(act, str, y20Var);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: qb */
    public void mo34571qb(Act act, String str, View view) {
        if (gra.m131596L3()) {
            act.startActivityForResult(ProfileAct.m51920o2(act, str, "from_new_meet_likers", true), 25);
        } else {
            act.startActivityForResultWithCustomTransition(ProfileAct.m51920o2(act, str, "from_new_meet_likers", true), 25, new pn90(view, new y20() { // from class: l.ca7
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreBusinessServiceIml.m37033Jt((Boolean) obj);
                }
            }));
        }
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: qd */
    public void mo34572qd(Context context, String str, String str2) {
        context.startActivity(VipAct.m57423g2(context, str, oql0.m168817a(str2)));
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: qj */
    public String mo34573qj(User user) {
        return String.format("%1$s · %2$s", C8772a.m51407H(user), q8g0.m175804j0(user.profile.zodiac));
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: qk */
    public void mo34574qk(Act act) {
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).m40810d6().m41017l0();
        }
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: qm */
    public void mo34575qm(Act act, String str, Privilege privilege, y20<PurchaseType> y20Var) {
        C8927c.m54690y0(act, str, privilege, null, y20Var);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: qt */
    public boolean mo34576qt() {
        return a5i0.m96174v();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: r6 */
    public void mo34577r6(Act act, String str, Privilege privilege, y20<PurchaseType> y20Var, x20 x20Var) {
        C8927c.m54591L0(act, str, y20Var, x20Var, null, privilege);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: rc */
    public boolean mo34578rc() {
        return gra.m131540A2();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: rd */
    public void mo34579rd(x0m x0mVar) {
        if (v83.m200282b()) {
            r1j0.m179420g(x0mVar.mo37751Y1(R$string.f19630rt));
        } else if (a5i0.m96149l0() > 0) {
            u73.m194835z(x0mVar.mo37761q1(), new C7978a(x0mVar), Privilege.minBoost);
        } else {
            new fe5.C16962e(x0mVar.mo37761q1()).m125281j(PurchaseType.TYPE_INTL_TTT_COIN).m125275d("e_intl_boost_trial_card").m125280i(Privilege.minBoost).m125274c(1).m125278g(new C7979b(x0mVar)).m125283l();
        }
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: re */
    public int mo34580re() {
        return 25;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ri */
    public boolean mo34581ri() {
        return p6d0.m170847d0().m170850e0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: rj */
    public Intent mo34582rj(Act act, String str) {
        return ConversationSearchAct.m43563d2(act, str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: rl */
    public CharSequence mo34583rl(Merchandise merchandise, @ColorInt int i) {
        return efh0.m120692j().m120695h(merchandise, i);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: rn */
    public void mo34584rn(User user, Frag frag) {
        frag.startActivityForResult(ProfileAct.m51920o2(frag.getContext(), user.f56859id, "likers", true), 18);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: s */
    public boolean mo34585s() {
        return gra.m131692h3();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: s3 */
    public boolean mo34586s3() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: s6 */
    public boolean mo34587s6() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: s7 */
    public void mo34588s7(Act act, String str, View view, y20<Boolean> y20Var) {
        if (gra.m131596L3()) {
            act.startActivityForResult(ProfileAct.m51920o2(act, str, "liked_users", true), 18);
        } else {
            act.startActivityForResultWithCustomTransition(ProfileAct.m51920o2(act, str, "liked_users", true), 18, new pn90(view, y20Var));
        }
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: s8 */
    public boolean mo34589s8() {
        return rbb0.m180742o();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: sf */
    public boolean mo34590sf() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    public void showSeeDialog(Act act, x20 x20Var, String str) {
        C8927c.m54565C1(act, str, Privilege.see_who_likes_me, x20Var);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: si */
    public boolean mo34591si() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: sk */
    public int mo34592sk(String str) {
        return oql0.m168817a(str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: sl */
    public String mo34593sl() {
        return gra.m131749t0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: sp */
    public void mo34594sp(final Act act) {
        if (a5i0.m96174v() && a5i0.m96160p0().m96214c1()) {
            a5i0.m96085B1(act, PurchaseType.TYPE_GET_BOOST, new x20() { // from class: l.ga7
                @Override // p153l.x20
                public final void call() {
                    CoreBusinessServiceIml.m37040Qt(act);
                }
            }, null);
        } else {
            ma3.m157621d(act, true);
        }
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ss */
    public void mo34595ss(User user, VDraweeView vDraweeView, LinearLayout linearLayout, Act act) {
        act.startActivityForResultWithCustomTransition(ProfileAct.m51920o2(act, user.f56859id, "likers", true), 18, (!(act instanceof LikersAct) || gra.m131596L3()) ? null : new ojr(vDraweeView, linearLayout));
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: st */
    public void mo34596st(Act act, String str, CharSequence charSequence, String str2, String str3, int i, int i2, int i3, boolean z, ViewOutlineProvider viewOutlineProvider, l4g0 l4g0Var, final x20 x20Var, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        ugy ugyVarM195998t = new ugy.C20573a(act).m195995D(str).m195994C(charSequence).m195992A(false).m196002x(str2, new y20() { // from class: l.ia7
            @Override // p153l.y20
            public final void call(Object obj) {
                x20Var.call();
            }
        }).m196000v(str3, new y20() { // from class: l.ja7
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreBusinessServiceIml.m37048Yt((ugy) obj);
            }
        }).m196004z(z).m196001w(i, onCheckedChangeListener).m195998t();
        if (ugyVarM195998t == null || ugyVarM195998t.m195967g() == null) {
            return;
        }
        if (NullChecker.m82486a(ugyVarM195998t.m195967g().f29795a)) {
            ugyVarM195998t.m195967g().f29795a.setOutlineProvider(viewOutlineProvider);
            ugyVarM195998t.m195967g().f29795a.setClipToOutline(true);
        }
        ugyVarM195998t.m195967g().m46340F(i2);
        ugyVarM195998t.m195967g().m46349R(i3);
        if (NullChecker.m82486a(ugyVarM195998t.m195967g().f29797c)) {
            bnl0.m105505C0(ugyVarM195998t.m195967g().f29797c, qa00.m175859d(250.0f));
        }
        ugyVarM195998t.m195967g().m46363j0();
        ugyVarM195998t.m195967g().m46360f0(k3d0.m148005a(c9c0.f80464v0));
        ugyVarM195998t.m195973m(l4g0Var);
        ugyVarM195998t.m195974n();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ta */
    public boolean mo34597ta() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: tc */
    public String mo34598tc() {
        return "https://auto.tancdn.com/v1/raw/bd3b6c84-2d79-4eb5-928f-4dc06d19cdf513.pdf";
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: tk */
    public void mo34599tk(final Act act) {
        ebn.m120188C(act, act.string(R$string.f18692N5), act.string(R$string.f18662M5), act.string(R$string.f18370Cm), new Runnable() { // from class: l.ha7
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                act2.startActivity(NewMainAct.m40707Q5(act2, NavigationIntent.get("setting")));
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: tn */
    public String mo34600tn() {
        return n3x.m161372m();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ts */
    public boolean mo34601ts(int i) {
        return v83.m200283c(i);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: tt */
    public boolean mo34602tt() {
        return gra.m131668d();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: u5 */
    public boolean mo34603u5() {
        return wcl0.m205822c();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ug */
    public void mo34604ug(Activity activity, Uri uri) {
        xwa.m213304D(activity, uri);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: uh */
    public boolean mo34605uh() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: um */
    public C22421c<String> mo34606um() {
        return OnlineMatchManager.m51326z().m51330D();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: un */
    public boolean mo34607un() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: uo */
    public void mo34608uo(Throwable th) {
        xck.m210153c(th);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: v4 */
    public boolean mo34609v4() {
        return gra.m131778z();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: v7 */
    public void mo34610v7(Act act, User user, int i, boolean z) {
        pci.m171663L(act, user, i, z);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: vb */
    public boolean mo34611vb(User user, CoreLikers.C4870a c4870a) {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: vc */
    public int mo34612vc() {
        return o6d0.m166223m0();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: vh */
    public void mo34613vh(Act act) {
        CoreDlg.m46170G1(act, act.string(R$string.f18924Ur), act.string(R$string.f19567ps), dbc0.f87506v8, act.string(R$string.f19536os), null, false, null, null, null, null, true, false, null, null, false);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: vl */
    public ux0 mo34614vl(PutongCoreAct putongCoreAct) {
        return new pqb(putongCoreAct);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: vo */
    public String mo34615vo(String str) {
        if (TextUtils.equals(str, "from_meet_picks_feed") || TextUtils.equals(str, "from_new_meet_picks_feed") || TextUtils.equals(str, "from_meet_picks_card")) {
            return "p_meet_view,e_picks_feed_card,like_swipe";
        }
        return (TextUtils.equals(str, "from_meet_feed") || TextUtils.equals(str, "from_meet_profile")) ? "p_meet_view,e_whoiliked_card,sayhi_superlike" : "p_meet_view,e_meet_card_sayhi,click";
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: vs */
    public void mo34616vs(x0m x0mVar, String str, FreeTrialOperateResult freeTrialOperateResult) {
        if (!"success".equals(freeTrialOperateResult.operateResult)) {
            if (jyb.m147481L(freeTrialOperateResult.msg)) {
                return;
            }
            r1j0.m179420g(freeTrialOperateResult.msg);
            return;
        }
        y6d0.m214481t(x0mVar.mo37761q1(), str, x0mVar.mo37764u0());
        CoreModule.f18264c.f20306F0.m118454q3();
        CoreModule.f18264c.f20405m0.m32042Q5();
        CoreModule.f18264c.f20405m0.m32046R5();
        CoreModule.f18264c.f20405m0.m32130m8();
        if (VisitorSortType.realUser.equals(str)) {
            x6d0.m209475l0().m209483q0(true);
            x6d0.m209475l0().m209482p0(true);
        } else if ("online".equals(str)) {
            x6d0.m209475l0().m209480n0(true);
        }
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: w */
    public boolean mo34617w() {
        return gra.m131596L3();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: w6 */
    public boolean mo34618w6() {
        return vnb.m201956p1();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: wa */
    public void mo34619wa(String str) {
        aw90.m100562F().m100633w(str);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: we */
    public C22421c<HometownSuggest> mo34620we() {
        return gw90.m132587g();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: wh */
    public void mo34621wh(Act act, String str, y20<PurchaseType> y20Var, x20 x20Var, x20 x20Var2, Privilege privilege) {
        C8927c.m54622a0(act, str, y20Var, x20Var, x20Var2, privilege);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: wi */
    public void mo34622wi(Act act, boolean z) {
        ma3.m157621d(act, z);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: wk */
    public void mo34623wk(User user) {
        rbb0.m180751x(user);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: wp */
    public String mo34624wp() {
        return qs50.m177727c();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: wr */
    public void mo34625wr(Act act, String str, Privilege privilege) {
        C8927c.m54562B1(act, str, privilege);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ws */
    public long mo34626ws() {
        return rbb0.m180736i();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: wt */
    public void mo34627wt(Act act, String str, Act.AbstractC4455w abstractC4455w) {
        if (gra.m131596L3()) {
            act.startActivityForResult(ProfileAct.m51920o2(act, str, "from_picks", true), 24);
        } else {
            act.startActivityForResultWithCustomTransition(ProfileAct.m51920o2(act, str, "from_picks", true), 24, abstractC4455w);
        }
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: x8 */
    public C22421c<View> mo34628x8(Act act, x20 x20Var) {
        if (u2n.m194290q()) {
            return u2n.m194285l().m194294j(9).mo154049a(act, x20Var);
        }
        return null;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: xb */
    public String mo34629xb() {
        return n6d0.m161763b();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: xg */
    public void mo34630xg(Act act) {
        act.startActivity(IntlMeetAct.m40356Z1(act, "", Visitor.TYPE));
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: xo */
    public ProfileCompletionConfig mo34631xo() {
        return gra.m131728p();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: ye */
    public void mo34632ye(Act act, a30<PurchaseType, Act, String> a30Var) {
        new fe5.C16962e(act).m125281j(PurchaseType.TYPE_INTL_TTT_COIN).m125274c(17).m125275d("p_knowmyself_purchase,e_knowmyself_test,click").m125278g(a30Var).m125283l();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: yl */
    public CharSequence mo34633yl(User user) {
        return tje0.m191431d(user);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: z1 */
    public boolean mo34634z1() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: z6 */
    public int mo34635z6() {
        return tmp.m191799e();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: z7 */
    public boolean mo34636z7() {
        return pa3.m171412f();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: z9 */
    public boolean mo34637z9() {
        return C8772a.m51420U();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: za */
    public smd0.C20104a mo34638za(int i, int i2) {
        return tje0.m191437j(i, i2);
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: zc */
    public int mo34639zc(Relationship relationship) {
        if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), MatchFrom.superLikedEach)) {
            return 13;
        }
        if (relationship.status.size() == 0 || !TEnum.equals(relationship.status.get(0), MatchFrom.superLiked)) {
            return (relationship.status.size() == 0 || !TEnum.equals(relationship.status.get(0), "secretcrush")) ? 0 : 1;
        }
        return 11;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: zg */
    public boolean mo34640zg() {
        return rm50.m182040a();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: zi */
    public boolean mo34641zi(Act act) {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: zj */
    public String mo34642zj(@NonNull User user) {
        return NullChecker.m82487b(user.m61308fp()) ? user.m61308fp().profileSize(qa00.f156302O).formatted() : "";
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService
    /* JADX INFO: renamed from: zq */
    public void mo34643zq(Act act, boolean z) {
        zki0.m220086O(act, z);
    }
}
