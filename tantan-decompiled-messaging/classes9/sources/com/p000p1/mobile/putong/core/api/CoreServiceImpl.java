package com.p000p1.mobile.putong.core.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.sdk.app.AuthTask;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.app.web.WebViewX;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreServiceImpl;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.DropDownAct;
import com.p000p1.mobile.putong.core.p004ui.report.ReportAct;
import com.p000p1.mobile.putong.core.p004ui.settings.IntlSettingGenderAct;
import com.p000p1.mobile.putong.core.p004ui.settings.PersonalDetailsAct;
import com.p000p1.mobile.putong.core.p004ui.settings.privacyandpremisson.PrivacyAndPremissonAct;
import com.p000p1.mobile.putong.core.p004ui.settings.subscriptions.SubscriptionsAct;
import com.p000p1.mobile.putong.core.p004ui.statussquare.CoreStateSquareRecycleView;
import com.p000p1.mobile.putong.core.p004ui.statussquare.CoreStatusSquareTabFrag;
import com.p000p1.mobile.putong.core.p004ui.verification.national.NationalIdAuthAct;
import com.p000p1.mobile.putong.core.p004ui.vip.likers.LikersAct;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.VipNewUtils;
import com.p000p1.mobile.putong.core.p004ui.vip.roam.VipRoamLocationAct;
import com.p000p1.mobile.putong.core.p004ui.visitor.MomentVisitorsAct;
import com.p000p1.mobile.putong.core.p004ui.webview.UserStoryAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.ui.label.LabelStyle;
import com.p1.mobile.putong.core.data.AppealInfo;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatPartnerScene;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageMomentGuide;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.RegionRule;
import com.p1.mobile.putong.core.data.RegionRuleTag;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.core.data.UserSticker;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.map.IntlMapAct;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.newui.appeal.AppealAct;
import com.p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p1.mobile.putong.core.newui.group.CoreGroupChatHeaderView;
import com.p1.mobile.putong.core.newui.group.GroupSuggestAct;
import com.p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.newui.myinterestpeople.CoreMyInterestPeopleTraceAct;
import com.p1.mobile.putong.core.newui.newmeet.NewMeetAct;
import com.p1.mobile.putong.core.newui.partner.ChatPartnerSelectStatusAct;
import com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.PlatformQualificationButton;
import com.p1.mobile.putong.core.ui.account.GPBindPhoneNumberInputAct;
import com.p1.mobile.putong.core.ui.account.JailedDialogLikeAct;
import com.p1.mobile.putong.core.ui.account.NewAccountSecureAct;
import com.p1.mobile.putong.core.ui.account.PasswordResetAct;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.core.ui.emoji.CoreCommendHintEmojiView;
import com.p1.mobile.putong.core.ui.emoji.CoreMomentEmojiNewView;
import com.p1.mobile.putong.core.ui.emoji.CoreMomentEmojiView;
import com.p1.mobile.putong.core.ui.greet.d;
import com.p1.mobile.putong.core.ui.map.MapAct;
import com.p1.mobile.putong.core.ui.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.core.ui.mediapicker.MediaPreviewAct;
import com.p1.mobile.putong.core.ui.messages.ItemMessageRight;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.messages.group.GroupProfileAct;
import com.p1.mobile.putong.core.ui.moment.MomentMessageAct;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.core.util.CertificationUtil;
import com.p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p1.mobile.putong.data.BannerLoc;
import com.p1.mobile.putong.data.Banners;
import com.p1.mobile.putong.data.BubbleInfo;
import com.p1.mobile.putong.data.Channel;
import com.p1.mobile.putong.data.ConversationStatus;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.IntlOperationArticles;
import com.p1.mobile.putong.data.IntlOperationBanner;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.Links;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MomentFeedPushArgs;
import com.p1.mobile.putong.data.NavigationIntent;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.PaymentData;
import com.p1.mobile.putong.data.PaymentParam;
import com.p1.mobile.putong.data.PhoneNumber;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.PurchasePaymentParam;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.RecommendMessage;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.Report;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.StickerInfo;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserLiveSettings;
import com.p1.mobile.putong.data.UserPushSettings;
import com.p1.mobile.putong.data.UserStatus;
import com.p1.mobile.putong.data.VerifyData;
import com.p1.mobile.putong.data.VisitorCounter;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams;
import com.p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.putong.newui.view.MessageInputEditView;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l.aci;
import l.aqo;
import l.ark;
import l.az50;
import l.d30;
import l.e1m;
import l.e30;
import l.e4w;
import l.e51;
import l.eb2;
import l.eqd0;
import l.f30;
import l.g30;
import l.hdb0;
import l.hpd0;
import l.hqo;
import l.ife;
import l.igj;
import l.j15;
import l.j2b0;
import l.j760;
import l.j900;
import l.ke7;
import l.knb0;
import l.kye;
import l.l3f;
import l.l5j0;
import l.lqa;
import l.lsi0;
import l.m6b0;
import l.mb90;
import l.mkd0;
import l.mkg;
import l.mo7;
import l.mqi0;
import l.n4i0;
import l.ogw;
import l.op8;
import l.pna0;
import l.pra0;
import l.q860;
import l.q8p;
import l.qer;
import l.qug0;
import l.rc2;
import l.roj0;
import l.ruy;
import l.rwu;
import l.s7m;
import l.tqm0;
import l.ue50;
import l.ukj0;
import l.v930;
import l.vwb;
import l.w9j;
import l.wm20;
import l.wn90;
import l.ws0;
import l.wyq;
import l.x4i;
import l.x9j;
import l.xaj0;
import l.xdl0;
import l.xdx;
import l.xgc0;
import l.yf60;
import l.yz9;
import l.zch0;
import l.zij0;
import l.zpd0;
import l.zvf0;
import l.zxm;
import l.zym;
import p006l.C1000m2;
import p006l.ej1;
import p006l.emr;
import p006l.euk;
import p006l.f6c0;
import p006l.g6a;
import p006l.jjb0;
import p006l.k8k0;
import p006l.ku6;
import p006l.lva;
import p006l.oa8;
import p006l.ogl0;
import p006l.pib;
import p006l.pp8;
import p006l.qh7;
import p006l.qib0;
import p006l.sqb0;
import p006l.swh0;
import p006l.tvf;
import p006l.u59;
import p006l.uld0;
import p006l.upa;
import p006l.x2c0;
import p006l.xma;
import p006l.zb0;
import p006l.zbi0;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Route(name = "CoreService服务", path = "/core_service/service")
public class CoreServiceImpl implements CoreService {

    /* JADX INFO: renamed from: a */
    public C1000m2 f3299a = new ku6();

    /* JADX INFO: renamed from: b */
    public int f3300b = -1;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.CoreServiceImpl$a */
    public class C0146a implements ue50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f3301a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d30 f3302b;

        public C0146a(d30 d30Var, d30 d30Var2) {
            this.f3301a = d30Var;
            this.f3302b = d30Var2;
        }

        /* JADX INFO: renamed from: a */
        public void m2773a() {
            this.f3302b.call();
        }

        /* JADX INFO: renamed from: c */
        public void m2774c() {
            this.f3301a.call();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.CoreServiceImpl$b */
    public class C0147b implements ue50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f3304a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ PayMethod f3305b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ d30 f3306c;

        public C0147b(d30 d30Var, PayMethod payMethod, d30 d30Var2) {
            this.f3304a = d30Var;
            this.f3305b = payMethod;
            this.f3306c = d30Var2;
        }

        /* JADX INFO: renamed from: a */
        public void m2775a() {
            if (NullChecker.a(this.f3306c)) {
                this.f3306c.call();
            }
        }

        /* JADX INFO: renamed from: c */
        public void m2776c() {
            if (NullChecker.a(this.f3304a)) {
                this.f3304a.call();
            }
            swh0.m24306p0().m24342N0(this.f3305b);
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m2575F(e30 e30Var, StickerInfo stickerInfo) {
        if (NullChecker.a(e30Var)) {
            e30Var.call(stickerInfo);
        }
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m2576H(d30 d30Var, PurchaseType purchaseType) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m2577J(Sticker sticker, Act act, roj0 roj0Var) {
        if (!vwb.J(sticker.pictures)) {
            qib0.f19782G.m12790x0(((Media) ((Picture) sticker.pictures.get(0))).url);
            if (!vwb.J(((Picture) sticker.pictures.get(0)).attachments)) {
                qib0.f19782G.m12790x0(((Media) ((Picture) ((Picture) sticker.pictures.get(0)).attachments.get(0))).url);
            }
        }
        act.progressDismiss();
        lsi0.w(R.string.h6);
        e51.H(CoreModule.f1533b, new Runnable() { // from class: l.xva
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f1534c.f3613Z.f4132T.z();
            }
        }, 50L);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ ConversationStatus m2581N(Conversation conversation) {
        return conversation != null ? conversation.status : ConversationStatus.get("deleted");
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m2582P(Throwable th) {
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ j760 m2583Q(Conversation conversation) {
        return new j760(conversation, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m2585S() {
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ Unit m2592a0(String str, Boolean bool) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("remainingtimes", Integer.valueOf(sqb0.m24051i0()));
        map.put("voicechat_results", sqb0.m24036O().getVoicechat_results());
        zvf0.s("e_voicechat_button", str, map);
        return null;
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m2593b0(Throwable th) {
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m2595d0(String str) {
        C0166g c0166g = CoreModule.f1534c.f3631f0;
        c0166g.m5034rf(str, c0166g.m4931jg(str, true));
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m2596e0(Act act, String str, j760 j760Var) {
        if (NullChecker.a(j760Var.a) && TEnum.equals(((Conversation) j760Var.a).status, CameraSticker.CATEGORY_DEFAULT_FILTER)) {
            act.startActivity(MessagesAct.i2(act, str, false, false));
            return;
        }
        d.a aVar = new d.a(str, "from_virtual_voice");
        aVar.o("p_audio,greet");
        d.a(act, aVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m2597f0(Sticker sticker) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m2598g0(Act act, Throwable th) {
        act.progressDismiss();
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40327) {
            lsi0.w(R.string.m6);
        } else {
            lsi0.w(R.string.g6);
            e51.H(CoreModule.f1533b, new Runnable() { // from class: l.wva
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f1534c.f3613Z.f4132T.z();
                }
            }, 50L);
        }
    }

    /* JADX INFO: renamed from: Ap */
    public void m2600Ap(Act act, User user, boolean z, Relationship relationship) {
        yz9.w(act, user, z, relationship);
    }

    /* JADX INFO: renamed from: Ar */
    public Intent m2601Ar(Context context, String str, String str2, boolean z) {
        return ProfileAct.p2(context, str, str2, z, false);
    }

    /* JADX INFO: renamed from: B6 */
    public void m2602B6() {
        x4i.c();
    }

    /* JADX INFO: renamed from: Ba */
    public hpd0 m2603Ba() {
        return CoreModule.f1534c.f3628e0.f18828L6;
    }

    /* JADX INFO: renamed from: Br */
    public boolean m2604Br() {
        return lqa.o();
    }

    /* JADX INFO: renamed from: Cb */
    public void m2605Cb(Envelope envelope) {
        envelope.getModuleData(CoreData.class).messages.clear();
    }

    /* JADX INFO: renamed from: Ch */
    public String m2606Ch() {
        return q8p.Companion.h();
    }

    /* JADX INFO: renamed from: Dd */
    public void m2607Dd() {
        IVPostImagesSelectAct.i.onNext(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: Dh */
    public boolean m2608Dh() {
        return q8p.Companion.p();
    }

    /* JADX INFO: renamed from: Dm */
    public String m2609Dm() {
        return qug0.f();
    }

    /* JADX INFO: renamed from: Dp */
    public boolean m2610Dp() {
        return emr.INSTANCE.m14705a();
    }

    /* JADX INFO: renamed from: E5 */
    public c<View> m2611E5(Act act) {
        return CoreModule.f1543l.m11706a().m5244E5(act);
    }

    /* JADX INFO: renamed from: F0 */
    public String m2612F0() {
        return "diamond";
    }

    /* JADX INFO: renamed from: F2 */
    public String m2613F2() {
        return "platinum";
    }

    /* JADX INFO: renamed from: Fc */
    public void m2614Fc(Act act, StickerInfo stickerInfo, final e30<StickerInfo> e30Var) {
        act.duringCreated(CoreModule.f1534c.f3613Z.f4132T.m6890R(stickerInfo)).subscribe(mkd0.H(new e30() { // from class: l.gwa
            public final void call(Object obj) {
                CoreServiceImpl.m2575F(e30Var, (StickerInfo) obj);
            }
        }, new e30() { // from class: l.hwa
            public final void call(Object obj) {
                CoreServiceImpl.m2582P((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Ff */
    public void m2615Ff(final Act act, StickerInfo stickerInfo) {
        if (NullChecker.a(CoreModule.f1534c.f3613Z.f4132T.n()) && !vwb.J(((CoreData) CoreModule.f1534c.f3613Z.f4132T.n()).userStickers) && !vwb.J(((UserSticker) ((CoreData) CoreModule.f1534c.f3613Z.f4132T.n()).userStickers.get(0)).favoriteStickers) && ((UserSticker) ((CoreData) CoreModule.f1534c.f3613Z.f4132T.n()).userStickers.get(0)).favoriteStickers.size() >= 300) {
            lsi0.w(R.string.m6);
            return;
        }
        final Sticker stickerNew_ = Sticker.new_();
        stickerNew_.mergeDataFromStickerInfo(stickerInfo);
        act.progress(R.string.I2, true);
        act.duringCreated(CoreModule.f1534c.f3613Z.f4132T.m6887O(stickerNew_)).subscribe(mkd0.H(new e30() { // from class: l.owa
            public final void call(Object obj) {
                CoreServiceImpl.m2577J(stickerNew_, act, (roj0) obj);
            }
        }, new e30() { // from class: l.pwa
            public final void call(Object obj) {
                CoreServiceImpl.m2598g0(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Fo */
    public void m2616Fo(Context context) {
        context.startActivity(new Intent(context, (Class<?>) PrivacyAndPremissonAct.class));
    }

    /* JADX INFO: renamed from: Gb */
    public void m2617Gb(Context context) {
        zbi0.m28647E(context);
    }

    /* JADX INFO: renamed from: Gn */
    public boolean m2618Gn() {
        return zch0.a().e();
    }

    /* JADX INFO: renamed from: Hp */
    public void m2619Hp(Act act, String str) {
        ws0.a(act, str);
    }

    /* JADX INFO: renamed from: I4 */
    public boolean m2620I4() {
        return upa.m25545z();
    }

    /* JADX INFO: renamed from: Ia */
    public boolean m2621Ia(User user) {
        if (!NullChecker.a(user) || user.isTeamAccount()) {
            return false;
        }
        return ((double) mqi0.o()) - (user.isHideActiveFromSVip() ? (double) uld0.m25254d(user) : user.location.updatedTime) < 300000.0d;
    }

    /* JADX INFO: renamed from: Ic */
    public boolean m2622Ic() {
        return upa.m25397T2();
    }

    /* JADX INFO: renamed from: Id */
    public int m2623Id() {
        return x4i.f;
    }

    /* JADX INFO: renamed from: Ij */
    public void m2624Ij(Act act, String str, String str2, Object obj, String str3, String str4, boolean z, boolean z2) {
        d.a aVar = new d.a(str, str3);
        aVar.m(obj).o(str4).n(str2).j(z).k(z2);
        d.a(act, aVar);
    }

    /* JADX INFO: renamed from: Io */
    public void m2625Io(String str) {
        az50.Companion.q(str);
    }

    /* JADX INFO: renamed from: Jn */
    public Class<?> m2626Jn() {
        return CoreMyInterestPeopleTraceAct.class;
    }

    /* JADX INFO: renamed from: Jq */
    public void m2627Jq() {
        CoreModule.f1534c.f3638h1.m13222G3();
    }

    /* JADX INFO: renamed from: Js */
    public c<knb0<Boolean, Integer, IntlOperationBanner, Boolean>> m2628Js() {
        return CoreModule.f1534c.f3638h1.m13219D3();
    }

    /* JADX INFO: renamed from: K9 */
    public void m2629K9(String str, List<String> list, boolean z) {
        CoreModule.f1542k.f11195c.m26895V(str, list, z);
    }

    /* JADX INFO: renamed from: Kg */
    public View m2630Kg(Context context, String str, String str2, e30<Boolean> e30Var) {
        CoreGroupChatHeaderView coreGroupChatHeaderViewInflate = View.inflate(context, f6c0.f11780G3, null);
        coreGroupChatHeaderViewInflate.H(str, str2, e30Var);
        return coreGroupChatHeaderViewInflate;
    }

    /* JADX INFO: renamed from: Km */
    public void m2631Km(Act act, SettingGroups settingGroups) {
        if (!NullChecker.a(act) || act.isFinishing()) {
            return;
        }
        act.startActivityForResult(IntlSettingGenderAct.INSTANCE.m8374a(act, settingGroups), 18);
    }

    /* JADX INFO: renamed from: Lk */
    public boolean m2632Lk(String str) {
        return CoreModule.f1534c.f3631f0.m5146zp(str) != null;
    }

    /* JADX INFO: renamed from: Lo */
    public int m2633Lo() {
        return upa.m25379P0();
    }

    /* JADX INFO: renamed from: M2 */
    public void m2634M2(Act act, User user, String str) {
        if (upa.m25489n3()) {
            aci.b0(act, user, false, str);
        } else {
            xdx.A().L(act, user, false, str);
        }
    }

    /* JADX INFO: renamed from: M9 */
    public c<Boolean> m2635M9(String str) {
        return CoreModule.f1534c.f3631f0.m4750Ue(str).map(new w9j() { // from class: l.sva
            public final Object call(Object obj) {
                return Boolean.valueOf(((Conversation) obj) != null);
            }
        });
    }

    /* JADX INFO: renamed from: Md */
    public boolean m2636Md() {
        return upa.m25388R1();
    }

    /* JADX INFO: renamed from: Mq */
    public void m2637Mq(Long l2) {
        az50.Companion.n(l2.longValue());
    }

    /* JADX INFO: renamed from: Ne */
    public void m2638Ne(Long l2) {
        q8p.Companion.u(l2.longValue());
    }

    /* JADX INFO: renamed from: Ng */
    public View m2639Ng(Context context, String str) {
        PlatformQualificationButton platformQualificationButton = new PlatformQualificationButton(context);
        platformQualificationButton.setPageId(str);
        return platformQualificationButton;
    }

    /* JADX INFO: renamed from: Ni */
    public void m2640Ni(Act act, String str, String str2, d30 d30Var) {
        ke7.o().D(act, "feed", str, str2, d30Var);
    }

    /* JADX INFO: renamed from: O1 */
    public String m2641O1() {
        return "partner";
    }

    /* JADX INFO: renamed from: Oa */
    public void m2642Oa(Act act, String str, String str2, Boolean bool) {
        act.startActivity(DropDownAct.m7783b2(act, str, str2, bool));
    }

    /* JADX INFO: renamed from: P3 */
    public c<Boolean> m2643P3() {
        return !NullChecker.a(CoreModule.f1534c) ? a.c(Boolean.FALSE) : CoreModule.f1534c.f3631f0.m4750Ue(rwu.h()).map(new w9j() { // from class: l.zva
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((Conversation) obj));
            }
        });
    }

    /* JADX INFO: renamed from: Pg */
    public List<IntlOperationBanner> m2644Pg() {
        return CoreModule.f1534c.f3638h1.m13239z3();
    }

    /* JADX INFO: renamed from: Pq */
    public void m2645Pq(Act act, boolean z) {
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).o7(z);
        }
    }

    /* JADX INFO: renamed from: Ps */
    public Intent m2646Ps(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, boolean z7, String str3) {
        return ProfileAct.y2(context, str, str2, z, z2, z3, relationshipStatus, i, z4, z5, z6, z7, str3);
    }

    /* JADX INFO: renamed from: Q2 */
    public boolean m2647Q2() {
        return swh0.m24306p0().m24369l1();
    }

    /* JADX INFO: renamed from: Q7 */
    public void m2648Q7(boolean z, Act act, User user, e30<Relationship> e30Var, e30<Throwable> e30Var2) {
        yz9.p(z, act, user, e30Var, e30Var2);
    }

    /* JADX INFO: renamed from: Q9 */
    public l5j0 m2649Q9(String str, Act act, String str2, String str3, String str4, String str5, d30 d30Var, d30 d30Var2, d30 d30Var3, d30 d30Var4, d30 d30Var5, d30 d30Var6, d30 d30Var7, d30 d30Var8, User user) {
        return ark.R0(str, act, str2, str3, str4, str5, d30Var, d30Var2, d30Var3, d30Var4, d30Var5, d30Var6, d30Var7, d30Var8, user);
    }

    /* JADX INFO: renamed from: Qf */
    public boolean m2650Qf() {
        return !tqm0.p().q();
    }

    /* JADX INFO: renamed from: Rb */
    public void m2651Rb(Act act, String str) {
        CoreModule.m1854P().m11706a().m5502pr(act, str, Privilege.liked_user);
    }

    /* JADX INFO: renamed from: Rp */
    public void m2652Rp(String str) {
        q8p.Companion.w(str);
    }

    /* JADX INFO: renamed from: Rs */
    public void m2653Rs(Act act, User user, boolean z, LikeFrom likeFrom, String str, boolean z2, String str2) {
        mkg.d(act, user, z, likeFrom, str, z2, str2);
    }

    /* JADX INFO: renamed from: Sa */
    public void m2654Sa(Act act, String str, String str2) {
        act.startActivity(DropDownAct.m7783b2(act, str, str2, Boolean.TRUE));
    }

    /* JADX INFO: renamed from: Sr */
    public void m2655Sr(Act act, String str, String str2, boolean z) {
        ukj0.c(act, str, str2, z);
    }

    /* JADX INFO: renamed from: Ug */
    public void m2656Ug(Act act, String str) {
        com.p1.mobile.putong.core.ui.purchase.c.J1(act, str, Privilege.vip_location);
    }

    /* JADX INFO: renamed from: Us */
    public void m2657Us(Act act) {
        act.startActivity(new Intent((Context) act, (Class<?>) NewAccountSecureAct.class));
    }

    /* JADX INFO: renamed from: Vk */
    public void m2658Vk(Act act, String str, String str2, String str3, String str4, Channel channel, e30<Boolean> e30Var) {
        yz9.y(act, str, str2, str3, str4, channel, e30Var);
    }

    /* JADX INFO: renamed from: Vr */
    public void m2659Vr() {
        CoreModule.f1534c.f3628e0.f18876S2.clear();
        CoreModule.f1534c.f3628e0.f18884T2.clear();
    }

    /* JADX INFO: renamed from: W2 */
    public c<Boolean> m2660W2() {
        return !NullChecker.a(CoreModule.f1534c) ? a.c(Boolean.FALSE) : CoreModule.f1534c.f3631f0.m4667Ne(rwu.h()).filter(new oa8()).map(new w9j() { // from class: l.bwa
            public final Object call(Object obj) {
                return Boolean.valueOf(((Conversation) obj).unreadMessages >= 1);
            }
        });
    }

    /* JADX INFO: renamed from: Wp */
    public boolean m2661Wp() {
        return g6a.m15592o();
    }

    /* JADX INFO: renamed from: Wq */
    public boolean m2662Wq() {
        return false;
    }

    /* JADX INFO: renamed from: Xd */
    public void m2663Xd() {
        q8p.Companion.b();
    }

    /* JADX INFO: renamed from: Y3 */
    public String m2664Y3() {
        return "vip";
    }

    /* JADX INFO: renamed from: Y6 */
    public void m2665Y6(Act act, String str) {
        act.startActivity(VipRoamLocationAct.m11180Y1(act, str));
    }

    /* JADX INFO: renamed from: Yn */
    public void m2666Yn(Act act, String str, String str2, String str3, String str4, boolean z, String str5) {
        d.a aVar = new d.a(str, str3);
        aVar.q(str2).o(str4).k(z).p(str5);
        d.a(act, aVar);
    }

    /* JADX INFO: renamed from: Z3 */
    public boolean m2667Z3(Activity activity) {
        return (activity instanceof MediaPreviewAct) || (activity instanceof com.p1.mobile.putong.core.ui.mediapreview.MediaPreviewAct);
    }

    /* JADX INFO: renamed from: Zb */
    public void m2668Zb(TabName tabName, boolean z) {
        v930.o(tabName, z);
    }

    /* JADX INFO: renamed from: Zj */
    public ConversationStatus m2669Zj(String str) {
        Conversation conversationM4786Xe = CoreModule.f1534c.f3631f0.m4786Xe(str);
        if (conversationM4786Xe != null) {
            return conversationM4786Xe.status;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public op8 m2670a() {
        return pp8.m21639l();
    }

    /* JADX INFO: renamed from: aa */
    public void m2671aa(Act act, String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
        d.a aVar = new d.a(str, str3);
        aVar.q(str2).o(str4).k(z).p(str5);
        d.b(act, aVar, str6);
    }

    /* JADX INFO: renamed from: ab */
    public c<ConversationStatus> m2672ab(String str) {
        return CoreModule.f1534c.f3631f0.m4750Ue(str).map(new w9j() { // from class: l.qva
            public final Object call(Object obj) {
                return CoreServiceImpl.m2581N((Conversation) obj);
            }
        });
    }

    public c<j760<Integer, String>> alipayAuthWithErrorCode(AuthTask authTask) {
        return CoreModule.f1534c.f3559H0.m27535k4(authTask);
    }

    /* JADX INFO: renamed from: as */
    public void m2673as(boolean z) {
        zch0.a().j(z, "FeedPostStateGuideBottomSheetDialog");
    }

    /* JADX INFO: renamed from: b3 */
    public int m2674b3() {
        return com.p1.mobile.putong.core.ui.onlinematch.a.b0();
    }

    /* JADX INFO: renamed from: b6 */
    public View m2675b6(Act act, EditText editText, boolean z, e30<Boolean> e30Var, boolean z2) {
        CoreCommendHintEmojiView coreCommendHintEmojiViewInflate = View.inflate(act, f6c0.f12420t1, null);
        coreCommendHintEmojiViewInflate.D(editText, z, e30Var, z2);
        return coreCommendHintEmojiViewInflate;
    }

    public c<roj0> blocks(String str) {
        return CoreModule.f1534c.f3631f0.m5046se(str);
    }

    /* JADX INFO: renamed from: bs */
    public void m2676bs(Context context, View view, String str) {
        VipNewUtils.m10999d(context, view, str);
    }

    /* JADX INFO: renamed from: c9 */
    public void m2677c9(View view, int i) {
        if (view instanceof CoreMomentEmojiNewView) {
            ((CoreMomentEmojiNewView) view).setViewGone(i);
        }
    }

    /* JADX INFO: renamed from: ci */
    public void m2678ci(String str, String str2, String str3, boolean z) {
        CoreModule.f1534c.f3665q1.m5201D3(str, str2, str3, z);
    }

    /* JADX INFO: renamed from: ck */
    public boolean m2679ck() {
        return xma.m27351F3();
    }

    public void clearCounterUnread() {
        CoreModule.f1534c.m3406g3();
    }

    public void clearCounterUnreadExceptFansForUI1() {
        CoreModule.f1534c.m3407h3();
    }

    public void clearCounterViewersUnread() {
        CoreModule.f1534c.m3408i3();
    }

    public void clearRequests(String str, int i) {
        CoreModule.f1534c.clearRequests(str, i);
    }

    public void clearUnReadLikes() {
        CoreModule.f1534c.m3410k3();
    }

    public void clearUnreadFans() {
        CoreModule.f1534c.m3409j3();
    }

    public void confirmThenUnmatch(Act act, String str, e30<String> e30Var, d30 d30Var, d30 d30Var2, String str2) {
        CoreDlg.v1(act, str, e30Var, d30Var, d30Var2, str2);
    }

    public c<Counter> counter() {
        return CoreModule.f1534c.m3413n3();
    }

    public Counter counter_() {
        return CoreModule.f1534c.m3414o3();
    }

    /* JADX INFO: renamed from: cs */
    public boolean m2680cs() {
        return pra0.b().a();
    }

    /* JADX INFO: renamed from: d2 */
    public eb2 m2681d2(Act act, e30<String> e30Var, EditText editText, ArrayList<kye.a> arrayList, List<List<String>> list, d30 d30Var) {
        return new wyq(act, e30Var, new e30() { // from class: l.vva
            public final void call(Object obj) {
                CoreServiceImpl.m2597f0((Sticker) obj);
            }
        }, editText, arrayList, list, d30Var, true);
    }

    /* JADX INFO: renamed from: db */
    public int m2682db(LabelStyle labelStyle) {
        if (labelStyle == LabelStyle.MAX) {
            return x2c0.f26300Tf;
        }
        if (labelStyle == LabelStyle.MIDDLE) {
            return x2c0.f26331Uf;
        }
        return labelStyle == LabelStyle.SMALL ? x2c0.f26362Vf : x2c0.f26300Tf;
    }

    public void deleteConversationAndRelated(final String str) {
        CoreModule.f1534c.f3598U.m13685a(new d30() { // from class: l.pva
            public final void call() {
                CoreServiceImpl.m2595d0(str);
            }
        });
    }

    /* JADX INFO: renamed from: dg */
    public HashMap<String, Boolean> m2683dg(Envelope envelope) {
        Boolean bool;
        HashMap<String, Boolean> map = new HashMap<>();
        List<Message> list = envelope.getModuleData(CoreData.class).messages;
        if (!vwb.J(list)) {
            for (Message message : list) {
                if (message != null && (bool = message.recalled) != null && bool.booleanValue()) {
                    map.put(((DbObject) message).id, Boolean.TRUE);
                }
            }
        }
        return map;
    }

    public void dismissGpBindPhoneRedDot() {
        CoreModule.f1534c.f3628e0.f18969e0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: dk */
    public void m2684dk(Boolean bool) {
        q8p.Companion.v(bool.booleanValue());
    }

    /* JADX INFO: renamed from: dl */
    public void m2685dl(Act act, boolean z, d30 d30Var) {
        CoreDlg.Y1(act, z, d30Var);
    }

    public void doGPPayment(Act act, String str, d30 d30Var, d30 d30Var2) {
        Merchandise merchandiseNew_ = Merchandise.new_();
        try {
            merchandiseNew_ = (Merchandise) Merchandise.JSON_ADAPTER.parse(str);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        hqo hqoVar = new hqo(act, n4i0.a(PurchaseType.TYPE_INTL_TTT_LIVE_COIN));
        hqoVar.t(new C0146a(d30Var, d30Var2));
        hqoVar.p(aqo.h(act, act instanceof PutongAct ? ((PutongAct) act).iap().i() : null), merchandiseNew_.autoRenewable(), merchandiseNew_.defaultStockKeepUnit.affiliateProducts.getProductId());
    }

    /* JADX INFO: renamed from: e9 */
    public int m2686e9(LabelStyle labelStyle) {
        if (labelStyle == LabelStyle.MAX) {
            return x2c0.f26393Wf;
        }
        if (labelStyle == LabelStyle.MIDDLE) {
            return x2c0.f26424Xf;
        }
        return labelStyle == LabelStyle.SMALL ? x2c0.f26455Yf : x2c0.f26393Wf;
    }

    /* JADX INFO: renamed from: eb */
    public c<Boolean> m2687eb() {
        return CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("oDiamond")).map(new w9j() { // from class: l.nwa
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.m27363T3((UserPrivilege) obj));
            }
        }).distinctUntilChanged();
    }

    /* JADX INFO: renamed from: ec */
    public void m2688ec() {
        CoreModule.f1534c.f3628e0.f18856P6.clear();
    }

    /* JADX INFO: renamed from: ef */
    public b<Boolean> m2689ef() {
        return CoreStatusSquareTabFrag.f6136X;
    }

    /* JADX INFO: renamed from: em */
    public void m2690em(Act act, final String str, String str2) {
        sqb0.m24036O().m24106v0(str2);
        sqb0.m24036O().m24076A0(act, false, true, new Function1() { // from class: l.rva
            public final Object invoke(Object obj) {
                return CoreServiceImpl.m2592a0(str, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: fp */
    public void m2691fp() {
        Intent intentY1 = AppealAct.Y1(App.e.getApplicationContext(), "chatAppeal", PhoneNumber.new_(), "");
        intentY1.setFlags(268435456);
        App.e.getApplicationContext().startActivity(intentY1);
    }

    /* JADX INFO: renamed from: g4 */
    public boolean m2692g4() {
        return CoreModule.f1534c.f3587Q1.f4106R.m6696M();
    }

    /* JADX INFO: renamed from: gc */
    public void m2693gc() {
        pra0.b().c();
    }

    @NonNull
    public C1000m2 getAbHooker() {
        return this.f3299a;
    }

    public a<roj0> getAutoPlayVideoBs() {
        return ej1.m14552b().m14553a();
    }

    public c<Banners> getBannersObs(BannerLoc bannerLoc) {
        return ife.o().n(bannerLoc);
    }

    public String getCurrencyProductCategory() {
        return n4i0.a(PurchaseType.TYPE_INTL_TTT_LIVE_COIN).productCategory().name();
    }

    public String getGPMemo(String str) {
        return CoreModule.f1534c.f3628e0.m21524y7(str);
    }

    public String getH5HeaderAuthorization() {
        return euk.m14888b();
    }

    public Intent getMainActIntent(Context context) {
        return lva.m19026e(context);
    }

    public Intent getMainWithNav(Context context, NavigationIntent navigationIntent) {
        return lva.m19032k(context, navigationIntent);
    }

    public RelativeLayout getMomentBannersView(Act act, ViewGroup viewGroup) {
        return (RelativeLayout) act.inflater().inflate(f6c0.f12366pf, viewGroup, false);
    }

    public c<Bundle> getNewMainBundleBs(TabName tabName) {
        return v930.g(tabName);
    }

    public c<Boolean> getNewMainLiveTabSelectBs() {
        return v930.j(TabName.Live);
    }

    public c<Boolean> getNewMainMomentTabSelectBs() {
        return v930.j(TabName.Moment);
    }

    public UserPushSettings getNotifications() {
        return ((SettingGroups) CoreModule.f1534c.f3628e0.f18865R.get()).push;
    }

    public long getSeeLastReadTime() {
        return ((Long) CoreModule.f1534c.f3676u0.f3243k0.get()).longValue();
    }

    public Integer getSessionChangedProfile() {
        return CoreModule.f1534c.f3628e0.m21362I7();
    }

    public Class<?> getSubscriptionsActClass() {
        return SubscriptionsAct.class;
    }

    public b<xaj0<Integer, Integer, String>> getTPayResultBs() {
        return CoreModule.f1534c.f3593S0.m6123v3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public User getUserById(String str) {
        return k8k0.C0922a.m17991a(this, str);
    }

    public User getUserByIdInModule(String str) {
        return CoreModule.f1534c.f3628e0.m21393Pa(str);
    }

    public c<SettingGroups> getUserSettings() {
        return CoreModule.f1534c.f3628e0.m21366J7();
    }

    public long getUserSwipeCount() {
        return ((Long) CoreModule.f1534c.f3628e0.f18913X.get()).longValue();
    }

    /* JADX INFO: renamed from: gi */
    public BottomSheetDialog m2694gi(String str, String str2, boolean z, @LayoutRes int i, Act act, int i2, boolean z2, g30<String, List<String>, Boolean> g30Var) {
        mo7 mo7Var = new mo7(str, str2, z, i, act, i2, z2, g30Var);
        mo7Var.f0();
        if (NullChecker.a(act) && !act.isFinishing()) {
            mo7Var.show();
        }
        return mo7Var;
    }

    /* JADX INFO: renamed from: gp */
    public boolean m2695gp(String str) {
        return xgc0.c(str);
    }

    public c<PaymentData> h5PayCanUseForLive() {
        return CoreModule.f1534c.f3593S0.m6124w3();
    }

    /* JADX INFO: renamed from: hd */
    public void m2696hd(Act act, String str, String str2, String str3) {
        pna0.c(act, str, str2, str3);
    }

    public boolean hideActiveTime(User user) {
        return CoreModule.f1534c.f3550E0.m26492w3(user);
    }

    public boolean hideAge(User user) {
        return CoreModule.f1534c.f3550E0.m26495z3(user);
    }

    public boolean hideLocation(User user) {
        return CoreModule.f1534c.f3550E0.m26464B3(user);
    }

    public void hideTabBarWhenNewUIMomentIsCurrentTab(Act act) {
        if (act instanceof NewMainAct) {
            NewMainAct newMainAct = (NewMainAct) act;
            if (newMainAct.e6(TabName.Moment)) {
                newMainAct.c7(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: renamed from: hj */
    public void m2697hj(s7m s7mVar, PushMessage pushMessage) {
        zxm zxmVar = new zxm(s7mVar, pushMessage);
        if (zym.b(pushMessage.messageCustom.liveMode)) {
            zxmVar.x(CorePopLevel.VIRTUAL_VOICE_PUSH);
        } else {
            zxmVar.x(CorePopLevel.LIVE_PUSH);
        }
        pushMessage.messageCustom.toJson();
        hdb0.c().i(zxmVar);
    }

    /* JADX INFO: renamed from: i0 */
    public c<View> m2698i0(Act act) {
        return CoreModule.f1543l.m11706a().m5457i0(act);
    }

    /* JADX INFO: renamed from: i5 */
    public c<Boolean> m2699i5(Act act, @Nullable String str) {
        act.startActivity(GPBindPhoneNumberInputAct.g2(act, false, str));
        return GPBindPhoneNumberInputAct.i2();
    }

    /* JADX INFO: renamed from: i7 */
    public PutongFrag m2700i7(String str, BubbleInfo bubbleInfo, int i) {
        return CoreStatusSquareTabFrag.m9126n5(str, bubbleInfo, i);
    }

    /* JADX INFO: renamed from: i8 */
    public <T extends ValueObject> T m2701i8(String str, JsonAdapter<T> jsonAdapter) {
        return (T) zij0.c(CoreModule.f1542k.f11195c.queryCache(str), jsonAdapter);
    }

    /* JADX INFO: renamed from: i9 */
    public c<roj0> m2702i9() {
        return CoreModule.f1534c.f3638h1.m13216A3();
    }

    /* JADX INFO: renamed from: ie */
    public <T extends ValueObject> c<T> m2703ie(final JsonAdapter<T> jsonAdapter, String str, String str2, boolean z) {
        Message messageNew_ = Message.new_();
        try {
            messageNew_ = (Message) Message.JSON_ADAPTER.parse(str2);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        return CoreModule.f1534c.f3631f0.m4566En(str, messageNew_, null, true).map(new w9j() { // from class: l.cwa
            public final Object call(Object obj) {
                return zij0.c((Message) obj, jsonAdapter);
            }
        });
    }

    /* JADX INFO: renamed from: ii */
    public Intent m2704ii(Context context, String str, boolean z, ResultReceiver resultReceiver, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return ReportAct.m7978a2(context, str, z, resultReceiver);
        }
        CoreDlg.ProfileMenuBuildParam profileMenuBuildParam = new CoreDlg.ProfileMenuBuildParam();
        profileMenuBuildParam.momentId = str2;
        return ReportAct.m7979b2(context, str, z, resultReceiver, profileMenuBuildParam);
    }

    public void init(Context context) {
    }

    public boolean instanceofPersonalDetailsAct(Act act) {
        return act instanceof PersonalDetailsAct;
    }

    public boolean isCurrentMessageBlock(String str) {
        return ruy.g().e(str);
    }

    public boolean isCurrentTabMomentFrag(Act act) {
        if (act instanceof NewMainAct) {
            return ((NewMainAct) act).e6(TabName.Moment);
        }
        return false;
    }

    public c<Boolean> isHideRedByNewUser() {
        return CoreModule.f1534c.f3628e0.m21419X7().asObservable();
    }

    public boolean isHttpDnsOpen() {
        RegionRule regionRuleM21455ga = NullChecker.a(CoreModule.f1534c) ? CoreModule.f1534c.f3628e0.m21455ga() : null;
        if (!NullChecker.a(regionRuleM21455ga) || vwb.J(regionRuleM21455ga.tags)) {
            return false;
        }
        return regionRuleM21455ga.tags.contains(RegionRuleTag.get("LiveHijackHttpDNS"));
    }

    public boolean isLiveNeedDisableAudio(Activity activity) {
        return (activity instanceof MediaPreviewAct) || (activity instanceof com.p1.mobile.putong.core.ui.mediapreview.MediaPreviewAct) || (activity instanceof NewMeetAct);
    }

    public boolean isMainPage(Act act) {
        return act instanceof NewMainAct;
    }

    public c<Boolean> isMatched(String str) {
        return CoreModule.f1534c.f3631f0.m5100wh(str);
    }

    public boolean isMatchedSync(String str) {
        return CoreModule.f1534c.f3631f0.m5112xh(str);
    }

    public boolean isNewMainActContext(Activity activity) {
        return activity instanceof NewMainAct;
    }

    public boolean isPurchaseDialogShowing() {
        return j2b0.a().b();
    }

    /* JADX INFO: renamed from: ja */
    public zpd0 m2705ja() {
        return CoreStateSquareRecycleView.f6131i;
    }

    /* JADX INFO: renamed from: jc */
    public void m2706jc(Act act, User user, boolean z, String str, e30<Relationship> e30Var, e30<Throwable> e30Var2, String str2) {
        qer.n(act, user, z, false, true, str, (x9j) null, e30Var, e30Var2, "pageId", (LikeExtraData) null, (String) null, (String) null);
    }

    /* JADX INFO: renamed from: jg */
    public void m2707jg(Act act, boolean z) {
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).m7(z);
        }
    }

    /* JADX INFO: renamed from: jp */
    public boolean m2708jp(String str, String str2, String str3) {
        MomentFeedPushArgs momentFeedPushArgsNew_ = MomentFeedPushArgs.new_();
        momentFeedPushArgsNew_.uid = str2;
        momentFeedPushArgsNew_.mid = str3;
        momentFeedPushArgsNew_.path = str;
        CoreModule.f1534c.f3628e0.f18746A0.onNext(momentFeedPushArgsNew_);
        return true;
    }

    /* JADX INFO: renamed from: k2 */
    public c<String> m2709k2() {
        return CoreModule.f1534c.f3541B0.m3541j4().map(new w9j() { // from class: l.yva
            public final Object call(Object obj) {
                return ((VerificationCenter) obj).toJson();
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m2710k4() {
        return false;
    }

    /* JADX INFO: renamed from: k7 */
    public b<Boolean> m2711k7() {
        return CoreGroupChatHeaderView.l;
    }

    /* JADX INFO: renamed from: k9 */
    public Intent m2712k9(Context context, String str, String str2, String str3) {
        return MomentMessageAct.V1(context, str, str2, str3);
    }

    /* JADX INFO: renamed from: ki */
    public void m2713ki(Activity activity) {
        activity.startActivity(CoreModule.m1851K().startMessagesAct(activity, "-1", true, false));
    }

    /* JADX INFO: renamed from: kj */
    public void m2714kj(Act act, String str, String str2, f30<Boolean, String> f30Var) {
        BookMoviesDramasHelper.j(act, str, str2, f30Var);
    }

    /* JADX INFO: renamed from: kk */
    public void m2715kk(Act act) {
        act.startActivity(ChatPartnerSelectStatusAct.Y1(act));
    }

    /* JADX INFO: renamed from: kn */
    public void m2716kn(Act act, User user, boolean z, String str, LikeFrom likeFrom, String str2, e30<Relationship> e30Var, e30<Throwable> e30Var2) {
        yz9.z(act, user, z, str, likeFrom, e30Var, e30Var2, str2, new boolean[0]);
    }

    /* JADX INFO: renamed from: ks */
    public c<roj0> m2717ks(String str, String str2, String str3, d30 d30Var) {
        return CoreModule.f1534c.f3631f0.m4643Le(str, str2, str3, d30Var);
    }

    /* JADX INFO: renamed from: kt */
    public void m2718kt() {
        pra0.b().d();
    }

    public c<roj0> loadLikers(Links links, long j, int i) {
        return CoreModule.f1534c.f3676u0.m2345U6(links, j, i);
    }

    public <T extends ValueObject, K extends ValueObject> c<List<T>> localiseMerchandises(Act act, List<K> list, final JsonAdapter<T> jsonAdapter) {
        return igj.M(act, zij0.b(list, Merchandise.JSON_ADAPTER)).map(new w9j() { // from class: l.jwa
            public final Object call(Object obj) {
                return zij0.b((List) obj, jsonAdapter);
            }
        });
    }

    /* JADX INFO: renamed from: m2 */
    public boolean m2719m2() {
        return false;
    }

    /* JADX INFO: renamed from: m8 */
    public boolean m2720m8(String str) {
        Conversation conversationM5146zp = CoreModule.f1534c.f3631f0.m5146zp(str);
        return NullChecker.a(conversationM5146zp) && conversationM5146zp.isHeartbeatConv();
    }

    /* JADX INFO: renamed from: ma */
    public Intent m2721ma(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, boolean z7) {
        return ProfileAct.v2(context, str, str2, z, z2, z3, relationshipStatus, i, z4, z5, z6, z7);
    }

    @Nullable
    /* JADX INFO: renamed from: mc */
    public VisitorCounter m2722mc() {
        return CoreModule.f1534c.f3653m1.m6637N4();
    }

    /* JADX INFO: renamed from: me */
    public c<User> m2723me() {
        return CoreModule.f1534c.f3628e0.m21486o9();
    }

    public User me_() {
        return CoreModule.f1534c.f3628e0.m21490p9();
    }

    public Intent mediaPickerActArgs(Context context, int i, boolean z, boolean z2, boolean z3) {
        return MediaPickerAct.c2(context, i, z, z2, z3);
    }

    public <T extends ValueObject> c<List<T>> merchandises(String str, boolean z, final JsonAdapter<T> jsonAdapter) {
        return CoreModule.f1534c.f3643j0.m2501A5(str, z).map(new w9j() { // from class: l.awa
            public final Object call(Object obj) {
                return zij0.b((List) obj, jsonAdapter);
            }
        });
    }

    public void mergeNetworkStateIntoLocalState(Envelope envelope, d30 d30Var) {
        CoreModule.f1534c.m3422w3(envelope, d30Var);
    }

    /* JADX INFO: renamed from: ml */
    public void m2724ml(String str) {
        j900.h(str);
    }

    /* JADX INFO: renamed from: mm */
    public void m2725mm(VImage vImage, boolean z) {
        vImage.setImageResource(z ? x2c0.f27012q1 : x2c0.f27044r1);
    }

    public c<q860<User>> momentSeeAbLikers() {
        return CoreModule.f1534c.f3676u0.m2410u7();
    }

    /* JADX INFO: renamed from: mq */
    public void m2726mq(String str, String str2, int i, List<String> list, String str3, String str4, double d, String str5) {
        MessageMomentGuide messageMomentGuideNew_ = MessageMomentGuide.new_();
        messageMomentGuideNew_.ownerId = str;
        messageMomentGuideNew_.id = str2;
        messageMomentGuideNew_.type = i;
        messageMomentGuideNew_.createdTime = d;
        messageMomentGuideNew_.imageUrlList = list;
        messageMomentGuideNew_.desc = str3;
        messageMomentGuideNew_.audioDuration = str4;
        messageMomentGuideNew_.videoDuration = str5;
        CoreModule.f1534c.f3631f0.m4997oh(str, messageMomentGuideNew_.toJson());
    }

    /* JADX INFO: renamed from: n6 */
    public void m2727n6(String str) {
        CoreModule.f1542k.f11195c.m26892S(str);
    }

    /* JADX INFO: renamed from: nd */
    public boolean m2728nd() {
        return x4i.d;
    }

    public Intent newMainActClearStack(Context context, boolean z, boolean z2) {
        return CoreModule.f1534c.m3399A3(context, z, z2);
    }

    public Intent newUIContainerAct(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("setting_scroll_to_bottom", z);
        return intent;
    }

    public eqd0 notificationSettings() {
        return CoreModule.f1534c.f3628e0.f18865R;
    }

    /* JADX INFO: renamed from: ns */
    public int m2729ns() {
        return u59.f23362t;
    }

    /* JADX INFO: renamed from: od */
    public <T extends ValueObject> c<List<T>> m2730od(String str, final JsonAdapter<T> jsonAdapter) {
        return CoreModule.f1542k.f11195c.m26882I(str).m().map(new w9j() { // from class: l.uva
            public final Object call(Object obj) {
                return zij0.b((List) obj, jsonAdapter);
            }
        });
    }

    public void onCoinPay(Act act, PurchasePaymentParam purchasePaymentParam, d30 d30Var, d30 d30Var2, PayMethod payMethod) {
        PurchaseType purchaseType = PurchaseType.TYPE_INTL_TTT_LIVE_COIN;
        PurchasePaymentParam purchasePaymentParamA = new yf60(n4i0.a(purchaseType)).h(((PaymentParam) purchasePaymentParam).itemId).l(purchasePaymentParam.quantity).k(((PaymentParam) purchasePaymentParam).ext.purchaseEnv).a();
        purchasePaymentParamA.setPurchaseTrackId(ogw.e(CoreModule.m1850H().userId() + mqi0.o()));
        swh0.m24230B0(act, payMethod, n4i0.a(purchaseType), new m6b0().b(purchasePaymentParamA).c(new C0147b(d30Var, payMethod, d30Var2)).a());
    }

    public j760<Integer, Integer> onlineMatchCaculaterBlur(int i) {
        return com.p1.mobile.putong.core.ui.onlinematch.a.z(i);
    }

    /* JADX INFO: renamed from: p7 */
    public void m2731p7(View view, Object obj, Media media) {
        if (NullChecker.a(view) && (view instanceof CoreCommendHintEmojiView)) {
            ((CoreCommendHintEmojiView) view).y(obj, media);
        }
    }

    /* JADX INFO: renamed from: pa */
    public void m2732pa(Context context, int i, IntlOperationBanner intlOperationBanner, IntlOperationArticles intlOperationArticles) {
        CoreModule.f1534c.f3638h1.m13238y3(context, i, intlOperationBanner, intlOperationArticles);
    }

    public c<roj0> patch(User user) {
        return CoreModule.f1534c.f3628e0.m21510u9(user);
    }

    public c<SettingGroups> patchLiveSettings(UserLiveSettings userLiveSettings) {
        return CoreModule.f1534c.f3628e0.m21530z9(userLiveSettings);
    }

    public c<roj0> patchSettings(SettingGroups settingGroups) {
        return CoreModule.f1534c.f3652m0.m3051k8(settingGroups);
    }

    /* JADX INFO: renamed from: pe */
    public boolean m2733pe() {
        return ogl0.m20616E();
    }

    /* JADX INFO: renamed from: pm */
    public Intent m2734pm(Context context, boolean z, boolean z2) {
        return MomentVisitorsAct.m11286Z1(context, z, z2);
    }

    public c<roj0> pollConversation() {
        return CoreModule.f1534c.f3631f0.m4580Fo();
    }

    public void pollUserCounters() {
        CoreModule.f1534c.f3628e0.m21360H9();
    }

    /* JADX INFO: renamed from: pq */
    public boolean m2735pq() {
        return xma.m27355L3();
    }

    /* JADX INFO: renamed from: ps */
    public void m2736ps(String str) {
        CoreModule.f1542k.f11195c.delete(Filter.AND(new Filter[]{Message.LOCALINMOMENT.T(), Message.MOMENT.EQ(str)}));
    }

    public void purchase(final PutongAct putongAct, final WebViewX webViewX, final String str, final String str2, final String str3) {
        putongAct.post(new Runnable() { // from class: l.kwa
            @Override // java.lang.Runnable
            public final void run() {
                euk.m14891e(putongAct, webViewX, str, str2, str3, "");
            }
        });
    }

    /* JADX INFO: renamed from: q7 */
    public boolean m2737q7() {
        return mb90.b(PurchaseType.TYPE_ROAMING_PKG);
    }

    /* JADX INFO: renamed from: q8 */
    public String m2738q8() {
        return az50.Companion.g();
    }

    /* JADX INFO: renamed from: q9 */
    public void m2739q9(Act act, String str, d30 d30Var) {
        swh0.m24228A1(act, str, d30Var);
    }

    /* JADX INFO: renamed from: qh */
    public Object m2740qh(View view) {
        if (!NullChecker.a(view) || !(view instanceof CoreCommendHintEmojiView)) {
            return null;
        }
        CoreCommendHintEmojiView coreCommendHintEmojiView = (CoreCommendHintEmojiView) view;
        Object selectStickerInfoOrMedia = coreCommendHintEmojiView.getSelectStickerInfoOrMedia();
        coreCommendHintEmojiView.s();
        return selectStickerInfoOrMedia;
    }

    /* JADX INFO: renamed from: qp */
    public String m2741qp() {
        return x4i.e;
    }

    public User queryMe() {
        return CoreModule.f1534c.f3628e0.m21392P9();
    }

    public c<Envelope> raw_messagePost(String str, String str2, String str3, boolean z) {
        Message messageNew_ = Message.new_();
        try {
            messageNew_ = (Message) Message.JSON_ADAPTER.parse(str2);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        messageNew_.momentShowFromType = str3;
        messageNew_.isFromKanKan = z;
        C0166g c0166g = CoreModule.f1534c.f3631f0;
        return C0166g.m4120Ro(str, messageNew_);
    }

    public c<roj0> refreshUser(String str, boolean z) {
        return CoreModule.f1534c.f3628e0.m21421X9(str, z);
    }

    public void registerPurchaseDialogListener(e1m e1mVar) {
        j2b0.a().e(e1mVar);
    }

    public void removeUserFromLikers(String str) {
        CoreModule.f1534c.f3676u0.m2419x7(str);
    }

    public void removeUserFromSuggested(String str) {
        CoreModule.f1534c.f3652m0.m2924E8(str);
    }

    public void renderVipBadge(Act act, User user, ImageView imageView, boolean z, boolean z2) {
        VipNewUtils.m11007l(act, user, imageView, z, z2);
    }

    public c<roj0> report(String str, String str2, String str3, Report report) {
        return CoreModule.f1534c.f3607X.m14303h3(C0154a.m3296w2("/" + str + "/moments/" + str2 + "/messages/" + str3 + "/reports"), report);
    }

    public <T extends ValueObject> void resendDialog(Act act, T t) {
        ItemMessageRight.p1(act, zij0.c(t, Message.JSON_ADAPTER));
    }

    /* JADX INFO: renamed from: rg */
    public boolean m2742rg() {
        return q8p.Companion.x();
    }

    /* JADX INFO: renamed from: rr */
    public boolean m2743rr() {
        User userM21483na;
        pib pibVar = CoreModule.f1534c.f3628e0;
        if (pibVar == null || (userM21483na = pibVar.m21483na()) == null) {
            return false;
        }
        List list = userM21483na.status;
        return !vwb.J(list) && list.contains(UserStatus.get("hidden")) && list.contains(UserStatus.get("RISK_TAG_UNREAL"));
    }

    /* JADX INFO: renamed from: s0 */
    public void m2744s0(final Act act, final String str) {
        if (act == null || TextUtils.isEmpty(str)) {
            return;
        }
        act.duringCreated(CoreModule.f1534c.f3631f0.m4750Ue(str).map(new w9j() { // from class: l.lwa
            public final Object call(Object obj) {
                return CoreServiceImpl.m2583Q((Conversation) obj);
            }
        })).take(1).subscribe(mkd0.G(new e30() { // from class: l.mwa
            public final void call(Object obj) {
                CoreServiceImpl.m2596e0(act, str, (j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s2 */
    public void m2745s2(Context context, final String str) {
        final Act act = (Act) context;
        act.duringCreated(CoreModule.f1534c.f3634g0.m3739H6(str).filter(new qh7()).take(1)).subscribe(mkd0.H(new e30() { // from class: l.dwa
            public final void call(Object obj) {
                Act act2 = act;
                act2.startActivity(GroupProfileAct.Z1(act2, str, (ChatGroup) obj, true));
            }
        }, new e30() { // from class: l.ewa
            public final void call(Object obj) {
                CoreServiceImpl.m2593b0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: se */
    public c<List<RecommendMessage>> m2746se(String str) {
        return CoreModule.f1534c.f3667r0.m6081s5(str);
    }

    public void setIfShowTabBarInNewUI(Act act, boolean z) {
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).c7(Boolean.valueOf(z));
        }
    }

    public void setMomentTabDot(Act act, boolean z) {
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).Y6(TabName.Moment, z);
        }
    }

    public void setMomentTabNum(Act act, int i) {
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).e7(TabName.Moment, i);
        }
    }

    public void setNewMainActClass(Context context, Intent intent) {
        NewMainAct.H5(context, intent);
    }

    public void setTabDot(Act act, TabName tabName, boolean z) {
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).Y6(tabName, z);
        }
    }

    public void setTabNum(Act act, TabName tabName, int i) {
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).e7(tabName, i);
        }
    }

    /* JADX INFO: renamed from: sg */
    public boolean m2747sg(String str) {
        return CoreModule.f1534c.f3631f0.m4786Xe(str) != null;
    }

    public boolean shouldLockComment(String str) {
        return zb0.m28640g(str);
    }

    public boolean shouldShowAutoPay() {
        return false;
    }

    public void showAutoPayHelp(Act act) {
        CoreModule.m1854P().m11711g().m6947Fn(act);
    }

    public void showBanner(Act act, ViewGroup viewGroup, Banners banners) {
        ife.o().r(act, viewGroup, banners);
    }

    public void showBindPhoneDialog(Act act, d30 d30Var) {
        ark.P0(act, "", new d30() { // from class: l.iwa
            public final void call() {
                CoreServiceImpl.m2585S();
            }
        }, false, false, d30Var);
    }

    public void showLocationPermissionCallbackDlg(Act act, d30 d30Var, d30 d30Var2, boolean z, boolean z2, String str) {
        e4w.j(act, d30Var, d30Var2, z, z2, str);
    }

    public boolean showMomentBanner() {
        return ife.o().j(BannerLoc.get("moment_feed"));
    }

    public void showProofAgeDlg(Act act, String str) {
        zb0.m28642i(act, str);
    }

    public void showSeeDialog(Act act, d30 d30Var, String str) {
        com.p1.mobile.putong.core.ui.purchase.c.C1(act, str, Privilege.see_who_likes_me, d30Var);
    }

    public void showUserVerificationLogo(Context context, User user, VImage vImage) {
        if (!jjb0.m17487b()) {
            if (!user.isPicVerificationVerified()) {
                xdl0.M(vImage, false);
                return;
            } else {
                vImage.setBackgroundResource(x2c0.f26190Pt);
                xdl0.M(vImage, true);
                return;
            }
        }
        int iH = CertificationUtil.h(user);
        if (iH == -1) {
            xdl0.M(vImage, false);
            return;
        }
        vImage.setImageResource(iH);
        vImage.setBackgroundResource(0);
        xdl0.M(vImage, true);
    }

    public void showVipPurchaseDialog(Act act, String str) {
        com.p1.mobile.putong.core.ui.purchase.c.I1(act, str);
    }

    public void skipH5PayActivityFromLive(Act act, String str, boolean z) {
        CoreModule.f1534c.f3593S0.m6126z3(act, C0171k.m6117y3(str), z);
    }

    /* JADX INFO: renamed from: sq */
    public void m2748sq(Act act, String str, final d30 d30Var, d30 d30Var2, d30 d30Var3) {
        com.p1.mobile.putong.core.ui.purchase.c.a0(act, str, new e30() { // from class: l.fwa
            public final void call(Object obj) {
                CoreServiceImpl.m2576H(d30Var, (PurchaseType) obj);
            }
        }, d30Var2, d30Var3, Privilege.oDiamondVisitor);
    }

    public void startJailedDialogLikeAct() {
        Intent intent = new Intent(CoreModule.f1533b, (Class<?>) JailedDialogLikeAct.class);
        intent.setFlags(268435456);
        CoreModule.f1533b.startActivity(intent);
    }

    public Intent startLikersAct(Context context, String str) {
        return LikersAct.m9986X1(context, str);
    }

    public Intent startMessagesAct(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, Intent intent, int i) {
        return MessagesAct.o2(context, str, z, z2, z3, z4, intent, i);
    }

    public Intent startProfileAct(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6) {
        return ProfileAct.s2(context, str, str2, z, z2, z3, relationshipStatus, i, z4, z5, z6);
    }

    /* JADX INFO: renamed from: te */
    public boolean m2749te() {
        return false;
    }

    /* JADX INFO: renamed from: tg */
    public int m2750tg() {
        AppealInfo appealInfoA = rc2.e().a();
        if (appealInfoA == null) {
            return 1;
        }
        String str = appealInfoA.method;
        str.getClass();
        return !str.equals("idCard") ? 1 : 2;
    }

    public Intent toBaiduMaps(Context context, int i) {
        return MapAct.Z1(context, i);
    }

    public Intent toIntlMaps(Context context, int i, boolean z) {
        return IntlMapAct.g2(context, i, z);
    }

    public Intent toMessagesActFromPush(Context context, String str, String str2) {
        Intent intentM19035n = lva.m19035n(context, str, 1);
        intentM19035n.putExtra("bundle_notify_type", str2);
        return intentM19035n;
    }

    public Intent toNewMainAct(Context context, boolean z, boolean z2) {
        return NewMainAct.P5(context, z, z2);
    }

    public Intent toNewMainActFromPush(Context context, String str, String str2) {
        return NewMainAct.T6(context, str, str2);
    }

    public Intent toPassWordResetAct(Act act, VerifyData verifyData) {
        return PasswordResetAct.V1(act, verifyData);
    }

    public Intent toReportAct(Context context, String str, boolean z, ResultReceiver resultReceiver) {
        return ReportAct.m7978a2(context, str, z, resultReceiver);
    }

    public void trackBannerMV(Banners banners) {
        ife.o().t(banners);
    }

    public void trackPlayerBlockTime(long j, String str, String str2) {
        if (j <= 200 || TextUtils.isEmpty(str)) {
            return;
        }
        HashMap map = new HashMap();
        String strValueOf = String.valueOf(j);
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.SYS_CHECK;
        str.getClass();
        String str3 = "moments";
        switch (str) {
            case "from_nearby_falls_feed":
                l3fVar.s = "e_VideoStuck_feed";
                l3fVar.n = "p_nearby";
                str3 = "nearby";
                break;
            case "moments":
                l3fVar.s = "e_VideoStuck_feed";
                l3fVar.n = "p_moment_fullscreen_view";
                break;
            case "from_nearby_focus":
                l3fVar.s = "e_VideoStuck_feed";
                l3fVar.n = "p_follow";
                str3 = "follow";
                break;
            case "home_card":
                l3fVar.s = "e_VideoStuck_profile";
                l3fVar.n = "p_suggest_user_profile_info_view";
            default:
                str3 = "";
                break;
        }
        map.put("duration", strValueOf);
        map.put("tag", str3);
        if (!TextUtils.isEmpty(str2)) {
            map.put("url", str2);
        }
        if (TextUtils.isEmpty(l3fVar.s)) {
            return;
        }
        zvf0.n(l3fVar, map);
    }

    public void triggerCounterFromMemoryCache(Counter counter) {
        C0158c c0158c = CoreModule.f1534c;
        if (c0158c == null) {
            return;
        }
        c0158c.m3403E3(counter);
    }

    /* JADX INFO: renamed from: u7 */
    public b<j760<Boolean, Integer>> m2751u7() {
        return NewMainAct.s;
    }

    /* JADX INFO: renamed from: u8 */
    public a<roj0> m2752u8() {
        return wn90.F().e;
    }

    /* JADX INFO: renamed from: uf */
    public void m2753uf(String str) {
        CoreModule.f1542k.f11195c.delete(Filter.AND(new Filter[]{Message.CID.EQ(str), Message.MESSAGETYPE.EQ("local_user_moment_message")}));
    }

    public void unregisterPurchaseDialogListener(e1m e1mVar) {
        j2b0.a().f(e1mVar);
    }

    /* JADX INFO: renamed from: up */
    public void m2754up(Act act, e30<Boolean> e30Var) {
        wm20.l(act, e30Var).run();
    }

    public void updateUnreadActivitiesByMoment(int i) {
        CoreModule.f1534c.m3405G3(i);
    }

    public void updateUser(User user) {
    }

    /* JADX INFO: renamed from: ur */
    public void m2755ur(Act act, String str, e30<Boolean> e30Var) {
        yz9.u(act, str, e30Var);
    }

    public c<User> userObsById(String str) {
        return CoreModule.f1534c.f3628e0.m21373Ka(str);
    }

    public Intent userStoryAct(Context context, String str, String str2) {
        return UserStoryAct.m11674Z1(context, str, str2);
    }

    /* JADX INFO: renamed from: ut */
    public void m2756ut() {
        CoreModule.f1534c.m3412m3();
    }

    /* JADX INFO: renamed from: v8 */
    public void m2757v8(Act act, User user, boolean z, boolean z2, String str, LikeFrom likeFrom, String str2, String str3, e30<Relationship> e30Var, e30<Throwable> e30Var2) {
        yz9.B(act, user, z, z2, str, likeFrom, e30Var, e30Var2, str2, str3, false, new boolean[0]);
    }

    public void verifyAppealIdentity(Act act, PhoneNumber phoneNumber) {
        AppealInfo appealInfoA = rc2.e().a();
        if (appealInfoA == null) {
            return;
        }
        tvf.m24836o(phoneNumber);
        String str = appealInfoA.method;
        str.getClass();
        if (str.equals("idCard")) {
            act.startActivity(NationalIdAuthAct.m9498X1(act, "appeal", false));
        } else if (str.equals("picture")) {
            tvf.m24829h(act, "appeal");
        }
    }

    /* JADX INFO: renamed from: vn */
    public long m2758vn(User user) {
        User userM21393Pa = CoreModule.f1534c.f3628e0.m21393Pa(((DbObject) user).id);
        return NullChecker.a(userM21393Pa) ? uld0.m25254d(userM21393Pa) : user.getActiveTimeFromSvip();
    }

    /* JADX INFO: renamed from: vq */
    public IntlOperationArticles m2759vq() {
        return CoreModule.f1534c.f3638h1.m13217B3();
    }

    /* JADX INFO: renamed from: w7 */
    public Intent m2760w7(Context context) {
        return lva.m19025d(context);
    }

    /* JADX INFO: renamed from: w8 */
    public boolean m2761w8(Act act) {
        if (act instanceof NewMainAct) {
            return ((NewMainAct) act).e6(TabName.Live);
        }
        return false;
    }

    public c<roj0> waitPatchSettings() {
        return CoreModule.f1534c.wait("settings", -1);
    }

    /* JADX INFO: renamed from: wb */
    public c<roj0> m2762wb() {
        return CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("svip")).map(new w9j() { // from class: l.tva
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: xf */
    public boolean m2763xf() {
        return n4i0.b();
    }

    /* JADX INFO: renamed from: xs */
    public c<roj0> m2764xs(String str) {
        return CoreModule.f1534c.f3631f0.m4832ap(str);
    }

    /* JADX INFO: renamed from: yd */
    public boolean m2765yd(String str) {
        return j15.g(ChatPartnerScene.get(str));
    }

    /* JADX INFO: renamed from: yf */
    public void m2766yf(Act act, boolean z, String str, String str2, Picture.ImageUri imageUri, String str3) {
        CoreModule.f1534c.f3631f0.m4606Hp(act, z, str, str2, imageUri, str3);
    }

    /* JADX INFO: renamed from: yo */
    public View m2767yo(Act act, e30<String> e30Var, d30 d30Var, MessageInputEditView messageInputEditView, boolean z, View view) {
        if (z) {
            CoreMomentEmojiNewView coreMomentEmojiNewViewInflate = View.inflate(act, f6c0.f12410s8, null);
            coreMomentEmojiNewViewInflate.B(act, e30Var, d30Var, messageInputEditView, view);
            return coreMomentEmojiNewViewInflate;
        }
        CoreMomentEmojiView coreMomentEmojiViewInflate = View.inflate(act, f6c0.f11688A7, null);
        coreMomentEmojiViewInflate.s(act, e30Var, d30Var, messageInputEditView);
        return coreMomentEmojiViewInflate;
    }

    /* JADX INFO: renamed from: yp */
    public Intent m2768yp(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, String str3) {
        return ProfileAct.u2(context, str, str2, z, z2, z3, relationshipStatus, i, z4, z5, z6, str3);
    }

    /* JADX INFO: renamed from: yr */
    public c<TabName> m2769yr() {
        return v930.k();
    }

    /* JADX INFO: renamed from: z8 */
    public void m2770z8(Act act, String str) {
        j15.h(act, ChatPartnerScene.get(str));
    }

    /* JADX INFO: renamed from: ze */
    public void m2771ze(Act act) {
        act.startActivity(new Intent((Context) act, (Class<?>) GroupSuggestAct.class));
    }

    /* JADX INFO: renamed from: zp */
    public Intent m2772zp(Context context, IntentParams intentParams) {
        intentParams.toString();
        return NewMainAct.h6(context, intentParams);
    }

    public Intent startMessagesAct(Context context, String str, boolean z, boolean z2) {
        return MessagesAct.i2(context, str, z, z2);
    }

    public Intent toNewMainAct(Context context, NavigationIntent navigationIntent) {
        return NewMainAct.I5(context, navigationIntent);
    }

    public Intent newMainActClearStack(Context context, boolean z) {
        return CoreModule.f1534c.m3425z3(context, z);
    }

    public c<roj0> refreshUser(String str) {
        return CoreModule.f1534c.f3628e0.m21417W9(str);
    }

    public c<roj0> report(String str, String str2, Report report) {
        return CoreModule.f1534c.f3607X.m14303h3(C0154a.m3296w2("/" + str + "/moments/" + str2 + "/reports"), report);
    }
}
