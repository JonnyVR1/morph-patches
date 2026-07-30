package com.p046p1.mobile.putong.core.api;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.p048ui.label.LabelStyle;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.app.web.WebViewX;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreServiceImpl;
import com.p046p1.mobile.putong.core.data.AppealInfo;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatPartnerScene;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageMomentGuide;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.RegionRule;
import com.p046p1.mobile.putong.core.data.RegionRuleTag;
import com.p046p1.mobile.putong.core.data.Sticker;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.map.IntlMapAct;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.newui.appeal.AppealAct;
import com.p046p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p046p1.mobile.putong.core.newui.group.CoreGroupChatHeaderView;
import com.p046p1.mobile.putong.core.newui.group.GroupSuggestAct;
import com.p046p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.myinterestpeople.CoreMyInterestPeopleTraceAct;
import com.p046p1.mobile.putong.core.newui.newmeet.NewMeetAct;
import com.p046p1.mobile.putong.core.newui.partner.ChatPartnerSelectStatusAct;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view.PlatformQualificationButton;
import com.p046p1.mobile.putong.core.p053ui.account.GPBindPhoneNumberInputAct;
import com.p046p1.mobile.putong.core.p053ui.account.JailedDialogLikeAct;
import com.p046p1.mobile.putong.core.p053ui.account.NewAccountSecureAct;
import com.p046p1.mobile.putong.core.p053ui.account.PasswordResetAct;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.core.p053ui.emoji.CoreCommendHintEmojiView;
import com.p046p1.mobile.putong.core.p053ui.emoji.CoreMomentEmojiNewView;
import com.p046p1.mobile.putong.core.p053ui.emoji.CoreMomentEmojiView;
import com.p046p1.mobile.putong.core.p053ui.greet.C8360d;
import com.p046p1.mobile.putong.core.p053ui.map.MapAct;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPreviewAct;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageRight;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.group.GroupProfileAct;
import com.p046p1.mobile.putong.core.p053ui.moment.MomentMessageAct;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.DropDownAct;
import com.p046p1.mobile.putong.core.p053ui.report.ReportAct;
import com.p046p1.mobile.putong.core.p053ui.settings.IntlSettingGenderAct;
import com.p046p1.mobile.putong.core.p053ui.settings.PersonalDetailsAct;
import com.p046p1.mobile.putong.core.p053ui.settings.privacyandpremisson.PrivacyAndPremissonAct;
import com.p046p1.mobile.putong.core.p053ui.settings.subscriptions.SubscriptionsAct;
import com.p046p1.mobile.putong.core.p053ui.statussquare.CoreStateSquareRecycleView;
import com.p046p1.mobile.putong.core.p053ui.statussquare.CoreStatusSquareTabFrag;
import com.p046p1.mobile.putong.core.p053ui.verification.national.NationalIdAuthAct;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAct;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.VipNewUtils;
import com.p046p1.mobile.putong.core.p053ui.vip.roam.VipRoamLocationAct;
import com.p046p1.mobile.putong.core.p053ui.visitor.MomentVisitorsAct;
import com.p046p1.mobile.putong.core.p053ui.webview.UserStoryAct;
import com.p046p1.mobile.putong.core.util.CertificationUtil;
import com.p046p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p046p1.mobile.putong.data.BannerLoc;
import com.p046p1.mobile.putong.data.Banners;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.ConversationStatus;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.IntlOperationArticles;
import com.p046p1.mobile.putong.data.IntlOperationBanner;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MomentFeedPushArgs;
import com.p046p1.mobile.putong.data.Moments;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.PaymentData;
import com.p046p1.mobile.putong.data.PhoneNumber;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.PurchasePaymentParam;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.RecommendMessage;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.Report;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.StickerInfo;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserLiveSettings;
import com.p046p1.mobile.putong.data.UserPushSettings;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.data.VerifyData;
import com.p046p1.mobile.putong.data.VisitorCounter;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.newui.view.MessageInputEditView;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;
import p147v.VImage;
import p149l.C18367m2;
import p149l.aci;
import p149l.aqo;
import p149l.ark;
import p149l.az50;
import p149l.d30;
import p149l.e1m;
import p149l.e30;
import p149l.e4w;
import p149l.e51;
import p149l.eb2;
import p149l.ej1;
import p149l.emr;
import p149l.eqd0;
import p149l.euk;
import p149l.f30;
import p149l.f6c0;
import p149l.g30;
import p149l.g6a;
import p149l.hdb0;
import p149l.hpd0;
import p149l.hqo;
import p149l.ife;
import p149l.igj;
import p149l.j15;
import p149l.j2b0;
import p149l.j760;
import p149l.j900;
import p149l.jjb0;
import p149l.k8k0;
import p149l.ke7;
import p149l.knb0;
import p149l.ku6;
import p149l.kye;
import p149l.l3f;
import p149l.l5j0;
import p149l.lqa;
import p149l.lsi0;
import p149l.lva;
import p149l.m6b0;
import p149l.mb90;
import p149l.mkd0;
import p149l.mkg;
import p149l.mo7;
import p149l.mqi0;
import p149l.n4i0;
import p149l.oa8;
import p149l.ogl0;
import p149l.ogw;
import p149l.op8;
import p149l.pib;
import p149l.pna0;
import p149l.pp8;
import p149l.pra0;
import p149l.q860;
import p149l.q8p;
import p149l.qer;
import p149l.qh7;
import p149l.qib0;
import p149l.qug0;
import p149l.rc2;
import p149l.roj0;
import p149l.ruy;
import p149l.rwu;
import p149l.s7m;
import p149l.sqb0;
import p149l.swh0;
import p149l.tqm0;
import p149l.tvf;
import p149l.u59;
import p149l.ue50;
import p149l.ukj0;
import p149l.uld0;
import p149l.upa;
import p149l.v930;
import p149l.vwb;
import p149l.w9j;
import p149l.wm20;
import p149l.wn90;
import p149l.ws0;
import p149l.wyq;
import p149l.x2c0;
import p149l.x4i;
import p149l.xaj0;
import p149l.xdl0;
import p149l.xdx;
import p149l.xgc0;
import p149l.xma;
import p149l.yf60;
import p149l.yz9;
import p149l.zb0;
import p149l.zbi0;
import p149l.zch0;
import p149l.zij0;
import p149l.zpd0;
import p149l.zvf0;
import p149l.zxm;
import p149l.zym;

/* JADX INFO: loaded from: classes9.dex */
@Route(name = "CoreService服务", path = "/core_service/service")
public class CoreServiceImpl implements CoreService {

    /* JADX INFO: renamed from: a */
    public C18367m2 f19310a = new ku6();

    /* JADX INFO: renamed from: b */
    public int f19311b = -1;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.CoreServiceImpl$a */
    public class C4720a implements ue50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f19312a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d30 f19313b;

        public C4720a(d30 d30Var, d30 d30Var2) {
            this.f19312a = d30Var;
            this.f19313b = d30Var2;
        }

        @Override // p149l.ue50
        /* JADX INFO: renamed from: a */
        public void mo30845a() {
            this.f19313b.call();
        }

        @Override // p149l.ue50
        /* JADX INFO: renamed from: c */
        public void mo30846c() {
            this.f19312a.call();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.CoreServiceImpl$b */
    public class C4721b implements ue50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f19315a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ PayMethod f19316b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ d30 f19317c;

        public C4721b(d30 d30Var, PayMethod payMethod, d30 d30Var2) {
            this.f19315a = d30Var;
            this.f19316b = payMethod;
            this.f19317c = d30Var2;
        }

        @Override // p149l.ue50
        /* JADX INFO: renamed from: a */
        public void mo30845a() {
            if (NullChecker.m81303a(this.f19317c)) {
                this.f19317c.call();
            }
        }

        @Override // p149l.ue50
        /* JADX INFO: renamed from: c */
        public void mo30846c() {
            if (NullChecker.m81303a(this.f19315a)) {
                this.f19315a.call();
            }
            swh0.m186255p0().m186291N0(this.f19316b);
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m30647F(e30 e30Var, StickerInfo stickerInfo) {
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(stickerInfo);
        }
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m30648H(d30 d30Var, PurchaseType purchaseType) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m30649J(Sticker sticker, Act act, roj0 roj0Var) {
        if (!vwb.m200296J(sticker.pictures)) {
            qib0.f154691G.m102377x0(sticker.pictures.get(0).url);
            if (!vwb.m200296J(sticker.pictures.get(0).attachments)) {
                qib0.f154691G.m102377x0(sticker.pictures.get(0).attachments.get(0).url);
            }
        }
        act.progressDismiss();
        lsi0.m151593w(R$string.f20986h6);
        e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.xva
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f17545c.f19624Z.f20143T.m121236q();
            }
        }, 50L);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ ConversationStatus m30653N(Conversation conversation) {
        return conversation != null ? conversation.status : ConversationStatus.get("deleted");
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m30654P(Throwable th) {
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ j760 m30655Q(Conversation conversation) {
        return new j760(conversation, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m30657S() {
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ Unit m30664a0(String str, Boolean bool) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("remainingtimes", Integer.valueOf(sqb0.m185513i0()));
        map.put("voicechat_results", sqb0.m185498O().getVoicechat_results());
        zvf0.m220397s("e_voicechat_button", str, map);
        return null;
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m30665b0(Throwable th) {
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m30667d0(String str) {
        C4740g c4740g = CoreModule.f17545c.f19642f0;
        c4740g.m33104rf(str, c4740g.m33001jg(str, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m30668e0(Act act, String str, j760 j760Var) {
        if (NullChecker.m81303a(j760Var.f116564a) && TEnum.equals(((Conversation) j760Var.f116564a).status, "default")) {
            act.startActivity(MessagesAct.m48943i2(act, str, false, false));
            return;
        }
        C8360d.a aVar = new C8360d.a(str, "from_virtual_voice");
        aVar.m45918o("p_audio,greet");
        C8360d.m45892a(act, aVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m30669f0(Sticker sticker) {
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m30670g0(Act act, Throwable th) {
        act.progressDismiss();
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40327) {
            lsi0.m151593w(R$string.f21031m6);
        } else {
            lsi0.m151593w(R$string.f20977g6);
            e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.wva
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19624Z.f20143T.m121236q();
                }
            }, 50L);
        }
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Ap */
    public void mo30672Ap(Act act, User user, boolean z, Relationship relationship) {
        yz9.m216629w(act, user, z, relationship);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Ar */
    public Intent mo30673Ar(Context context, String str, String str2, boolean z) {
        return ProfileAct.m50738p2(context, str, str2, z, false);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: B6 */
    public void mo30674B6() {
        x4i.m206976c();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Ba */
    public hpd0 mo30675Ba() {
        return CoreModule.f17545c.f19639e0.f149216L6;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Br */
    public boolean mo30676Br() {
        return lqa.m150977o();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Cb */
    public void mo30677Cb(Envelope envelope) {
        ((CoreData) envelope.getModuleData(CoreData.class)).messages.clear();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Ch */
    public String mo30678Ch() {
        return q8p.INSTANCE.m173433h();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Dd */
    public void mo30679Dd() {
        IVPostImagesSelectAct.f24124i.m132487l(Boolean.TRUE);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Dh */
    public boolean mo30680Dh() {
        return q8p.INSTANCE.m173441p();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Dm */
    public String mo30681Dm() {
        return qug0.m176609f();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Dp */
    public boolean mo30682Dp() {
        return emr.INSTANCE.m117219a();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: E5 */
    public C22306c<View> mo30683E5(Act act) {
        return CoreModule.f17554l.m94651a().mo33307E5(act);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: F0 */
    public String mo30684F0() {
        return "diamond";
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: F2 */
    public String mo30685F2() {
        return "platinum";
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Fc */
    public void mo30686Fc(Act act, StickerInfo stickerInfo, final e30<StickerInfo> e30Var) {
        act.duringCreated(CoreModule.f17545c.f19624Z.f20143T.m34953R(stickerInfo)).subscribe(mkd0.m154956H(new e30() { // from class: l.gwa
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreServiceImpl.m30647F(e30Var, (StickerInfo) obj);
            }
        }, new e30() { // from class: l.hwa
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreServiceImpl.m30654P((Throwable) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Ff */
    public void mo30687Ff(final Act act, StickerInfo stickerInfo) {
        if (NullChecker.m81303a(CoreModule.f17545c.f19624Z.f20143T.m121233n()) && !vwb.m200296J(CoreModule.f17545c.f19624Z.f20143T.m121233n().userStickers) && !vwb.m200296J(CoreModule.f17545c.f19624Z.f20143T.m121233n().userStickers.get(0).favoriteStickers) && CoreModule.f17545c.f19624Z.f20143T.m121233n().userStickers.get(0).favoriteStickers.size() >= 300) {
            lsi0.m151593w(R$string.f21031m6);
            return;
        }
        final Sticker stickerNew_ = Sticker.new_();
        stickerNew_.mergeDataFromStickerInfo(stickerInfo);
        act.progress(R$string.f20775I2, true);
        act.duringCreated(CoreModule.f17545c.f19624Z.f20143T.m34950O(stickerNew_)).subscribe(mkd0.m154956H(new e30() { // from class: l.owa
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreServiceImpl.m30649J(stickerNew_, act, (roj0) obj);
            }
        }, new e30() { // from class: l.pwa
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreServiceImpl.m30670g0(act, (Throwable) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Fo */
    public void mo30688Fo(Context context) {
        context.startActivity(new Intent(context, (Class<?>) PrivacyAndPremissonAct.class));
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Gb */
    public void mo30689Gb(Context context) {
        zbi0.m217856E(context);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Gn */
    public boolean mo30690Gn() {
        return zch0.m218024a().m218028e();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Hp */
    public void mo30691Hp(Act act, String str) {
        ws0.m205335a(act, str);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: I4 */
    public boolean mo30692I4() {
        return upa.m194847z();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Ia */
    public boolean mo30693Ia(User user) {
        if (!NullChecker.m81303a(user) || user.isTeamAccount()) {
            return false;
        }
        return ((double) mqi0.m155944o()) - (user.isHideActiveFromSVip() ? (double) uld0.m194219d(user) : user.location.updatedTime) < 300000.0d;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Ic */
    public boolean mo30694Ic() {
        return upa.m194699T2();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Id */
    public int mo30695Id() {
        return x4i.f191030f;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Ij */
    public void mo30696Ij(Act act, String str, String str2, Object obj, String str3, String str4, boolean z, boolean z2) {
        C8360d.a aVar = new C8360d.a(str, str3);
        aVar.m45916m(obj).m45918o(str4).m45917n(str2).m45913j(z).m45914k(z2);
        C8360d.m45892a(act, aVar);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Io */
    public void mo30697Io(String str) {
        az50.INSTANCE.m99637q(str);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Jn */
    public Class<?> mo30698Jn() {
        return CoreMyInterestPeopleTraceAct.class;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Jq */
    public void mo30699Jq() {
        CoreModule.f17545c.f19649h1.m105393G3();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Js */
    public C22306c<knb0<Boolean, Integer, IntlOperationBanner, Boolean>> mo30700Js() {
        return CoreModule.f17545c.f19649h1.m105390D3();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: K9 */
    public void mo30701K9(String str, List<String> list, boolean z) {
        CoreModule.f17553k.f91940c.m206064V(str, list, z);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Kg */
    public View mo30702Kg(Context context, String str, String str2, e30<Boolean> e30Var) {
        CoreGroupChatHeaderView coreGroupChatHeaderView = (CoreGroupChatHeaderView) View.inflate(context, f6c0.f95366G3, null);
        coreGroupChatHeaderView.m36524H(str, str2, e30Var);
        return coreGroupChatHeaderView;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Km */
    public void mo30703Km(Act act, SettingGroups settingGroups) {
        if (!NullChecker.m81303a(act) || act.isFinishing()) {
            return;
        }
        act.startActivityForResult(IntlSettingGenderAct.INSTANCE.m55008a(act, settingGroups), 18);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Lk */
    public boolean mo30704Lk(String str) {
        return CoreModule.f17545c.f19642f0.m33216zp(str) != null;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Lo */
    public int mo30705Lo() {
        return upa.m194681P0();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: M2 */
    public void mo30706M2(Act act, User user, String str) {
        if (upa.m194791n3()) {
            aci.m95751b0(act, user, false, str);
        } else {
            xdx.m208433A().m208462L(act, user, false, str);
        }
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: M9 */
    public C22306c<Boolean> mo30707M9(String str) {
        return CoreModule.f17545c.f19642f0.m32820Ue(str).map(new w9j() { // from class: l.sva
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Conversation) obj) != null);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Md */
    public boolean mo30708Md() {
        return upa.m194690R1();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Mq */
    public void mo30709Mq(Long l2) {
        az50.INSTANCE.m99634n(l2.longValue());
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Ne */
    public void mo30710Ne(Long l2) {
        q8p.INSTANCE.m173446u(l2.longValue());
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Ng */
    public View mo30711Ng(Context context, String str) {
        PlatformQualificationButton platformQualificationButton = new PlatformQualificationButton(context);
        platformQualificationButton.setPageId(str);
        return platformQualificationButton;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Ni */
    public void mo30712Ni(Act act, String str, String str2, d30 d30Var) {
        ke7.m145732o().m145740D(act, "feed", str, str2, d30Var);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: O1 */
    public String mo30713O1() {
        return "partner";
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Oa */
    public void mo30714Oa(Act act, String str, String str2, Boolean bool) {
        act.startActivity(DropDownAct.m54448b2(act, str, str2, bool));
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: P3 */
    public C22306c<Boolean> mo30715P3() {
        return !NullChecker.m81303a(CoreModule.f17545c) ? C22392a.m221513c(Boolean.FALSE) : CoreModule.f17545c.f19642f0.m32820Ue(rwu.m181459h()).map(new w9j() { // from class: l.zva
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((Conversation) obj));
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Pg */
    public List<IntlOperationBanner> mo30716Pg() {
        return CoreModule.f17545c.f19649h1.m105410z3();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Pq */
    public void mo30717Pq(Act act, boolean z) {
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).m39826o7(z);
        }
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Ps */
    public Intent mo30718Ps(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, boolean z7, String str3) {
        return ProfileAct.m50745y2(context, str, str2, z, z2, z3, relationshipStatus, i, z4, z5, z6, z7, str3);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Q2 */
    public boolean mo30719Q2() {
        return swh0.m186255p0().m186318l1();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Q7 */
    public void mo30720Q7(boolean z, Act act, User user, e30<Relationship> e30Var, e30<Throwable> e30Var2) {
        yz9.m216622p(z, act, user, e30Var, e30Var2);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Q9 */
    public l5j0 mo30721Q9(String str, Act act, String str2, String str3, String str4, String str5, d30 d30Var, d30 d30Var2, d30 d30Var3, d30 d30Var4, d30 d30Var5, d30 d30Var6, d30 d30Var7, d30 d30Var8, User user) {
        return ark.m98445R0(str, act, str2, str3, str4, str5, d30Var, d30Var2, d30Var3, d30Var4, d30Var5, d30Var6, d30Var7, d30Var8, user);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Qf */
    public boolean mo30722Qf() {
        return !tqm0.m190131p().m190144q();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Rb */
    public void mo30723Rb(Act act, String str) {
        CoreModule.m29935P().m94651a().mo33565pr(act, str, Privilege.liked_user);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Rp */
    public void mo30724Rp(String str) {
        q8p.INSTANCE.m173448w(str);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Rs */
    public void mo30725Rs(Act act, User user, boolean z, LikeFrom likeFrom, String str, boolean z2, String str2) {
        mkg.m155011d(act, user, z, likeFrom, str, z2, str2);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Sa */
    public void mo30726Sa(Act act, String str, String str2) {
        act.startActivity(DropDownAct.m54448b2(act, str, str2, Boolean.TRUE));
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Sr */
    public void mo30727Sr(Act act, String str, String str2, boolean z) {
        ukj0.m194175c(act, str, str2, z);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Ug */
    public void mo30728Ug(Act act, String str) {
        C8764c.m53403J1(act, str, Privilege.vip_location);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Us */
    public void mo30729Us(Act act) {
        act.startActivity(new Intent(act, (Class<?>) NewAccountSecureAct.class));
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Vk */
    public void mo30730Vk(Act act, String str, String str2, String str3, String str4, Channel channel, e30<Boolean> e30Var) {
        yz9.m216631y(act, str, str2, str3, str4, channel, e30Var);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Vr */
    public void mo30731Vr() {
        CoreModule.f17545c.f19639e0.f149264S2.clear();
        CoreModule.f17545c.f19639e0.f149272T2.clear();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: W2 */
    public C22306c<Boolean> mo30732W2() {
        return !NullChecker.m81303a(CoreModule.f17545c) ? C22392a.m221513c(Boolean.FALSE) : CoreModule.f17545c.f19642f0.m32737Ne(rwu.m181459h()).filter(new oa8()).map(new w9j() { // from class: l.bwa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Conversation) obj).unreadMessages >= 1);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Wp */
    public boolean mo30733Wp() {
        return g6a.m124566o();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Wq */
    public boolean mo30734Wq() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Xd */
    public void mo30735Xd() {
        q8p.INSTANCE.m173427b();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Y3 */
    public String mo30736Y3() {
        return "vip";
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Y6 */
    public void mo30737Y6(Act act, String str) {
        act.startActivity(VipRoamLocationAct.m57687Y1(act, str));
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Yn */
    public void mo30738Yn(Act act, String str, String str2, String str3, String str4, boolean z, String str5) {
        C8360d.a aVar = new C8360d.a(str, str3);
        aVar.m45920q(str2).m45918o(str4).m45914k(z).m45919p(str5);
        C8360d.m45892a(act, aVar);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Z3 */
    public boolean mo30739Z3(Activity activity) {
        return (activity instanceof MediaPreviewAct) || (activity instanceof com.p046p1.mobile.putong.core.p053ui.mediapreview.MediaPreviewAct);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Zb */
    public void mo30740Zb(TabName tabName, boolean z) {
        v930.m197541o(tabName, z);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Zj */
    public ConversationStatus mo30741Zj(String str) {
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(str);
        if (conversationM32856Xe != null) {
            return conversationM32856Xe.status;
        }
        return null;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: a */
    public op8 mo30742a() {
        return pp8.m170711l();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: aa */
    public void mo30743aa(Act act, String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
        C8360d.a aVar = new C8360d.a(str, str3);
        aVar.m45920q(str2).m45918o(str4).m45914k(z).m45919p(str5);
        C8360d.m45893b(act, aVar, str6);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ab */
    public C22306c<ConversationStatus> mo30744ab(String str) {
        return CoreModule.f17545c.f19642f0.m32820Ue(str).map(new w9j() { // from class: l.qva
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreServiceImpl.m30653N((Conversation) obj);
            }
        });
    }

    public C22306c<j760<Integer, String>> alipayAuthWithErrorCode(AuthTask authTask) {
        return CoreModule.f17545c.f19570H0.m210360k4(authTask);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: as */
    public void mo30745as(boolean z) {
        zch0.m218024a().m218033j(z, "FeedPostStateGuideBottomSheetDialog");
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: b3 */
    public int mo30746b3() {
        return C8609a.m50246b0();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: b6 */
    public View mo30747b6(Act act, EditText editText, boolean z, e30<Boolean> e30Var, boolean z2) {
        CoreCommendHintEmojiView coreCommendHintEmojiView = (CoreCommendHintEmojiView) View.inflate(act, f6c0.f96006t1, null);
        coreCommendHintEmojiView.m45291D(editText, z, e30Var, z2);
        return coreCommendHintEmojiView;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22306c<roj0> blocks(String str) {
        return CoreModule.f17545c.f19642f0.m33116se(str);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: bs */
    public void mo30748bs(Context context, View view, String str) {
        VipNewUtils.m57507d(context, view, str);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: c9 */
    public void mo30749c9(View view, int i) {
        if (view instanceof CoreMomentEmojiNewView) {
            ((CoreMomentEmojiNewView) view).setViewGone(i);
        }
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ci */
    public void mo30750ci(String str, String str2, String str3, boolean z) {
        CoreModule.f17545c.f19676q1.m33271D3(str, str2, str3, z);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ck */
    public boolean mo30751ck() {
        return xma.m210043F3();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void clearCounterUnread() {
        CoreModule.f17545c.m31476g3();
    }

    public void clearCounterUnreadExceptFansForUI1() {
        CoreModule.f17545c.m31477h3();
    }

    public void clearCounterViewersUnread() {
        CoreModule.f17545c.m31478i3();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void clearRequests(String str, int i) {
        CoreModule.f17545c.clearRequests(str, i);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void clearUnReadLikes() {
        CoreModule.f17545c.m31480k3();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void clearUnreadFans() {
        CoreModule.f17545c.m31479j3();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void confirmThenUnmatch(Act act, String str, e30<String> e30Var, d30 d30Var, d30 d30Var2, String str2) {
        CoreDlg.m45109v1(act, str, e30Var, d30Var, d30Var2, str2);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22306c<Counter> counter() {
        return CoreModule.f17545c.m31483n3();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Counter counter_() {
        return CoreModule.f17545c.m31484o3();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: cs */
    public boolean mo30752cs() {
        return pra0.m170994b().m170995a();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: d2 */
    public eb2 mo30753d2(Act act, e30<String> e30Var, EditText editText, ArrayList<kye.C18115a> arrayList, List<List<String>> list, d30 d30Var) {
        return new wyq(act, e30Var, new e30() { // from class: l.vva
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreServiceImpl.m30669f0((Sticker) obj);
            }
        }, editText, arrayList, list, d30Var, true);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: db */
    public int mo30754db(LabelStyle labelStyle) {
        if (labelStyle == LabelStyle.MAX) {
            return x2c0.f189764Tf;
        }
        if (labelStyle == LabelStyle.MIDDLE) {
            return x2c0.f189795Uf;
        }
        return labelStyle == LabelStyle.SMALL ? x2c0.f189826Vf : x2c0.f189764Tf;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void deleteConversationAndRelated(final String str) {
        CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.pva
            @Override // p149l.d30
            public final void call() {
                CoreServiceImpl.m30667d0(str);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: dg */
    public HashMap<String, Boolean> mo30755dg(Envelope envelope) {
        Boolean bool;
        HashMap<String, Boolean> map = new HashMap<>();
        List<Message> list = ((CoreData) envelope.getModuleData(CoreData.class)).messages;
        if (!vwb.m200296J(list)) {
            for (Message message : list) {
                if (message != null && (bool = message.recalled) != null && bool.booleanValue()) {
                    map.put(message.f56011id, Boolean.TRUE);
                }
            }
        }
        return map;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void dismissGpBindPhoneRedDot() {
        CoreModule.f17545c.f19639e0.f149357e0.put(Boolean.FALSE);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: dk */
    public void mo30756dk(Boolean bool) {
        q8p.INSTANCE.m173447v(bool.booleanValue());
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: dl */
    public void mo30757dl(Act act, boolean z, d30 d30Var) {
        CoreDlg.m45041Y1(act, z, d30Var);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void doGPPayment(Act act, String str, d30 d30Var, d30 d30Var2) throws IOException {
        Merchandise merchandiseNew_ = Merchandise.new_();
        try {
            merchandiseNew_ = Merchandise.JSON_ADAPTER.parse(str);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        hqo hqoVar = new hqo(act, n4i0.m157865a(PurchaseType.TYPE_INTL_TTT_LIVE_COIN));
        hqoVar.m132479t(new C4720a(d30Var, d30Var2));
        hqoVar.m132475p(aqo.m98316h(act, act instanceof PutongAct ? ((PutongAct) act).iap().m148933i() : null), merchandiseNew_.autoRenewable(), merchandiseNew_.defaultStockKeepUnit.affiliateProducts.getProductId());
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: e9 */
    public int mo30758e9(LabelStyle labelStyle) {
        if (labelStyle == LabelStyle.MAX) {
            return x2c0.f189857Wf;
        }
        if (labelStyle == LabelStyle.MIDDLE) {
            return x2c0.f189888Xf;
        }
        return labelStyle == LabelStyle.SMALL ? x2c0.f189919Yf : x2c0.f189857Wf;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: eb */
    public C22306c<Boolean> mo30759eb() {
        return CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("oDiamond")).map(new w9j() { // from class: l.nwa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.m210055T3((UserPrivilege) obj));
            }
        }).distinctUntilChanged();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ec */
    public void mo30760ec() {
        CoreModule.f17545c.f19639e0.f149244P6.clear();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ef */
    public C22393b<Boolean> mo30761ef() {
        return CoreStatusSquareTabFrag.f36355X;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: em */
    public void mo30762em(Act act, final String str, String str2) {
        sqb0.m185498O().m185568v0(str2);
        sqb0.m185498O().m185538A0(act, false, true, new Function1() { // from class: l.rva
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CoreServiceImpl.m30664a0(str, (Boolean) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: fp */
    public void mo30763fp() {
        Intent intentM36166Y1 = AppealAct.m36166Y1(App.f15369e.getApplicationContext(), SchemeKey.chatAppeal, PhoneNumber.new_(), "");
        intentM36166Y1.setFlags(268435456);
        App.f15369e.getApplicationContext().startActivity(intentM36166Y1);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: g4 */
    public boolean mo30764g4() {
        return CoreModule.f17545c.f19598Q1.f20117R.m34759M();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: gc */
    public void mo30765gc() {
        pra0.m170994b().m170996c();
    }

    @NonNull
    public C18367m2 getAbHooker() {
        return this.f19310a;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22392a<roj0> getAutoPlayVideoBs() {
        return ej1.m116750b().m116751a();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22306c<Banners> getBannersObs(BannerLoc bannerLoc) {
        return ife.m135906o().m135911n(bannerLoc);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public String getCurrencyProductCategory() {
        return n4i0.m157865a(PurchaseType.TYPE_INTL_TTT_LIVE_COIN).productCategory().name();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public String getGPMemo(String str) {
        return CoreModule.f17545c.f19639e0.m169561y7(str);
    }

    public String getH5HeaderAuthorization() {
        return euk.m118170b();
    }

    public Intent getMainActIntent(Context context) {
        return lva.m151849e(context);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent getMainWithNav(Context context, NavigationIntent navigationIntent) {
        return lva.m151855k(context, navigationIntent);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public RelativeLayout getMomentBannersView(Act act, ViewGroup viewGroup) {
        return (RelativeLayout) act.inflater().inflate(f6c0.f95952pf, viewGroup, false);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22306c<Bundle> getNewMainBundleBs(TabName tabName) {
        return v930.m197533g(tabName);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22306c<Boolean> getNewMainLiveTabSelectBs() {
        return v930.m197536j(TabName.Live);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22306c<Boolean> getNewMainMomentTabSelectBs() {
        return v930.m197536j(TabName.Moment);
    }

    public UserPushSettings getNotifications() {
        return CoreModule.f17545c.f19639e0.f149253R.get().push;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public long getSeeLastReadTime() {
        return CoreModule.f17545c.f19687u0.f19254k0.get().longValue();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Integer getSessionChangedProfile() {
        return CoreModule.f17545c.f19639e0.m169399I7();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Class<?> getSubscriptionsActClass() {
        return SubscriptionsAct.class;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22393b<xaj0<Integer, Integer, String>> getTPayResultBs() {
        return CoreModule.f17545c.f19604S0.m34186v3();
    }

    @Override // p149l.k8k0
    public User getUserById(String str) {
        return k8k0.C17956a.m144943a(this, str);
    }

    @Override // p149l.k8k0
    public User getUserByIdInModule(String str) {
        return CoreModule.f17545c.f19639e0.m169430Pa(str);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22306c<SettingGroups> getUserSettings() {
        return CoreModule.f17545c.f19639e0.m169403J7();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public long getUserSwipeCount() {
        return CoreModule.f17545c.f19639e0.f149301X.get().longValue();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: gi */
    public BottomSheetDialog mo30766gi(String str, String str2, boolean z, @LayoutRes int i, Act act, int i2, boolean z2, g30<String, List<String>, Boolean> g30Var) {
        mo7 mo7Var = new mo7(str, str2, z, i, act, i2, z2, g30Var);
        mo7Var.m155655f0();
        if (NullChecker.m81303a(act) && !act.isFinishing()) {
            mo7Var.show();
        }
        return mo7Var;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: gp */
    public boolean mo30767gp(String str) {
        return xgc0.m208625c(str);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22306c<PaymentData> h5PayCanUseForLive() {
        return CoreModule.f17545c.f19604S0.m34187w3();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: hd */
    public void mo30768hd(Act act, String str, String str2, String str3) {
        pna0.m170404c(act, str, str2, str3);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean hideActiveTime(User user) {
        return CoreModule.f17545c.f19561E0.m203800w3(user);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean hideAge(User user) {
        return CoreModule.f17545c.f19561E0.m203803z3(user);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean hideLocation(User user) {
        return CoreModule.f17545c.f19561E0.m203772B3(user);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void hideTabBarWhenNewUIMomentIsCurrentTab(Act act) {
        if (act instanceof NewMainAct) {
            NewMainAct newMainAct = (NewMainAct) act;
            if (newMainAct.m39812e6(TabName.Moment)) {
                newMainAct.m39809c7(Boolean.FALSE);
            }
        }
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: hj */
    public void mo30769hj(s7m s7mVar, PushMessage pushMessage) {
        zxm zxmVar = new zxm(s7mVar, pushMessage);
        if (zym.m220933b(pushMessage.messageCustom.liveMode)) {
            zxmVar.m96808x(CorePopLevel.VIRTUAL_VOICE_PUSH);
        } else {
            zxmVar.m96808x(CorePopLevel.LIVE_PUSH);
        }
        pushMessage.messageCustom.toJson();
        hdb0.m130575c().m130582i(zxmVar);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: i0 */
    public C22306c<View> mo30770i0(Act act) {
        return CoreModule.f17554l.m94651a().mo33520i0(act);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: i5 */
    public C22306c<Boolean> mo30771i5(Act act, @Nullable String str) {
        act.startActivity(GPBindPhoneNumberInputAct.m44121g2(act, false, str));
        return GPBindPhoneNumberInputAct.m44123i2();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: i7 */
    public PutongFrag mo30772i7(String str, BubbleInfo bubbleInfo, int i) {
        return CoreStatusSquareTabFrag.m55729n5(str, bubbleInfo, i);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: i8 */
    public <T extends ValueObject> T mo30773i8(String str, JsonAdapter<T> jsonAdapter) {
        return (T) zij0.m219048c(CoreModule.f17553k.f91940c.queryCache(str), jsonAdapter);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: i9 */
    public C22306c<roj0> mo30774i9() {
        return CoreModule.f17545c.f19649h1.m105387A3();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ie */
    public <T extends ValueObject> C22306c<T> mo30775ie(final JsonAdapter<T> jsonAdapter, String str, String str2, boolean z) throws IOException {
        Message messageNew_ = Message.new_();
        try {
            messageNew_ = Message.JSON_ADAPTER.parse(str2);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        return (C22306c<T>) CoreModule.f17545c.f19642f0.m32636En(str, messageNew_, null, true).map(new w9j() { // from class: l.cwa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zij0.m219048c((Message) obj, jsonAdapter);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ii */
    public Intent mo30776ii(Context context, String str, boolean z, ResultReceiver resultReceiver, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return ReportAct.m54628a2(context, str, z, resultReceiver);
        }
        CoreDlg.ProfileMenuBuildParam profileMenuBuildParam = new CoreDlg.ProfileMenuBuildParam();
        profileMenuBuildParam.momentId = str2;
        return ReportAct.m54629b2(context, str, z, resultReceiver, profileMenuBuildParam);
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean instanceofPersonalDetailsAct(Act act) {
        return act instanceof PersonalDetailsAct;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean isCurrentMessageBlock(String str) {
        return ruy.m181215g().m181218e(str);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean isCurrentTabMomentFrag(Act act) {
        if (act instanceof NewMainAct) {
            return ((NewMainAct) act).m39812e6(TabName.Moment);
        }
        return false;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22306c<Boolean> isHideRedByNewUser() {
        return CoreModule.f17545c.f19639e0.m169456X7().asObservable();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean isHttpDnsOpen() {
        RegionRule regionRuleM169492ga = NullChecker.m81303a(CoreModule.f17545c) ? CoreModule.f17545c.f19639e0.m169492ga() : null;
        if (!NullChecker.m81303a(regionRuleM169492ga) || vwb.m200296J(regionRuleM169492ga.tags)) {
            return false;
        }
        return regionRuleM169492ga.tags.contains(RegionRuleTag.get(RegionRuleTag.LiveHijackHttpDNS));
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean isLiveNeedDisableAudio(Activity activity) {
        return (activity instanceof MediaPreviewAct) || (activity instanceof com.p046p1.mobile.putong.core.p053ui.mediapreview.MediaPreviewAct) || (activity instanceof NewMeetAct);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean isMainPage(Act act) {
        return act instanceof NewMainAct;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22306c<Boolean> isMatched(String str) {
        return CoreModule.f17545c.f19642f0.m33170wh(str);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean isMatchedSync(String str) {
        return CoreModule.f17545c.f19642f0.m33182xh(str);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean isNewMainActContext(Activity activity) {
        return activity instanceof NewMainAct;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean isPurchaseDialogShowing() {
        return j2b0.m139417a().m139418b();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ja */
    public zpd0 mo30777ja() {
        return CoreStateSquareRecycleView.f36350i;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: jc */
    public void mo30778jc(Act act, User user, boolean z, String str, e30<Relationship> e30Var, e30<Throwable> e30Var2, String str2) {
        qer.m174243n(act, user, z, false, true, str, null, e30Var, e30Var2, "pageId", null, null, null);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: jg */
    public void mo30779jg(Act act, boolean z) {
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).m39822m7(z);
        }
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: jp */
    public boolean mo30780jp(String str, String str2, String str3) {
        MomentFeedPushArgs momentFeedPushArgsNew_ = MomentFeedPushArgs.new_();
        momentFeedPushArgsNew_.uid = str2;
        momentFeedPushArgsNew_.mid = str3;
        momentFeedPushArgsNew_.path = str;
        CoreModule.f17545c.f19639e0.f149134A0.m132487l(momentFeedPushArgsNew_);
        return true;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: k2 */
    public C22306c<String> mo30781k2() {
        return CoreModule.f17545c.f19552B0.m31611j4().map(new w9j() { // from class: l.yva
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((VerificationCenter) obj).toJson();
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: k4 */
    public boolean mo30782k4() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: k7 */
    public C22393b<Boolean> mo30783k7() {
        return CoreGroupChatHeaderView.f21541l;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: k9 */
    public Intent mo30784k9(Context context, String str, String str2, String str3) {
        return MomentMessageAct.m50092V1(context, str, str2, str3);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ki */
    public void mo30785ki(Activity activity) {
        activity.startActivity(CoreModule.m29932K().startMessagesAct(activity, User.ID_TEAM_ACCOUNT, true, false));
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: kj */
    public void mo30786kj(Act act, String str, String str2, f30<Boolean, String> f30Var) {
        BookMoviesDramasHelper.m59443j(act, str, str2, f30Var);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: kk */
    public void mo30787kk(Act act) {
        act.startActivity(ChatPartnerSelectStatusAct.m43109Y1(act));
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: kn */
    public void mo30788kn(Act act, User user, boolean z, String str, LikeFrom likeFrom, String str2, e30<Relationship> e30Var, e30<Throwable> e30Var2) {
        yz9.m216632z(act, user, z, str, likeFrom, e30Var, e30Var2, str2, new boolean[0]);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ks */
    public C22306c<roj0> mo30789ks(String str, String str2, String str3, d30 d30Var) {
        return CoreModule.f17545c.f19642f0.m32713Le(str, str2, str3, d30Var);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: kt */
    public void mo30790kt() {
        pra0.m170994b().m170997d();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22306c<roj0> loadLikers(Links links, long j, int i) {
        return CoreModule.f17545c.f19687u0.m30417U6(links, j, i);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public <T extends ValueObject, K extends ValueObject> C22306c<List<T>> localiseMerchandises(Act act, List<K> list, final JsonAdapter<T> jsonAdapter) {
        return (C22306c<List<T>>) igj.m136009M(act, zij0.m219047b(list, Merchandise.JSON_ADAPTER)).map(new w9j() { // from class: l.jwa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zij0.m219047b((List) obj, jsonAdapter);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: m2 */
    public boolean mo30791m2() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: m8 */
    public boolean mo30792m8(String str) {
        Conversation conversationM33216zp = CoreModule.f17545c.f19642f0.m33216zp(str);
        return NullChecker.m81303a(conversationM33216zp) && conversationM33216zp.isHeartbeatConv();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ma */
    public Intent mo30793ma(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, boolean z7) {
        return ProfileAct.m50743v2(context, str, str2, z, z2, z3, relationshipStatus, i, z4, z5, z6, z7);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    @Nullable
    /* JADX INFO: renamed from: mc */
    public VisitorCounter mo30794mc() {
        return CoreModule.f17545c.f19664m1.m34700N4();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: me */
    public C22306c<User> mo30795me() {
        return CoreModule.f17545c.f19639e0.m169523o9();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public User me_() {
        return CoreModule.f17545c.f19639e0.m169527p9();
    }

    public Intent mediaPickerActArgs(Context context, int i, boolean z, boolean z2, boolean z3) {
        return MediaPickerAct.m47782c2(context, i, z, z2, z3);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public <T extends ValueObject> C22306c<List<T>> merchandises(String str, boolean z, final JsonAdapter<T> jsonAdapter) {
        return (C22306c<List<T>>) CoreModule.f17545c.f19654j0.m30573A5(str, z).map(new w9j() { // from class: l.awa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zij0.m219047b((List) obj, jsonAdapter);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void mergeNetworkStateIntoLocalState(Envelope envelope, d30 d30Var) {
        CoreModule.f17545c.m31492w3(envelope, d30Var);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ml */
    public void mo30796ml(String str) {
        j900.m140494h(str);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: mm */
    public void mo30797mm(VImage vImage, boolean z) {
        vImage.setImageResource(z ? x2c0.f190476q1 : x2c0.f190508r1);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22306c<q860<User>> momentSeeAbLikers() {
        return CoreModule.f17545c.f19687u0.m30482u7();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: mq */
    public void mo30798mq(String str, String str2, int i, List<String> list, String str3, String str4, double d, String str5) {
        MessageMomentGuide messageMomentGuideNew_ = MessageMomentGuide.new_();
        messageMomentGuideNew_.ownerId = str;
        messageMomentGuideNew_.f20446id = str2;
        messageMomentGuideNew_.type = i;
        messageMomentGuideNew_.createdTime = d;
        messageMomentGuideNew_.imageUrlList = list;
        messageMomentGuideNew_.desc = str3;
        messageMomentGuideNew_.audioDuration = str4;
        messageMomentGuideNew_.videoDuration = str5;
        CoreModule.f17545c.f19642f0.m33067oh(str, messageMomentGuideNew_.toJson());
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: n6 */
    public void mo30799n6(String str) {
        CoreModule.f17553k.f91940c.m206061S(str);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: nd */
    public boolean mo30800nd() {
        return x4i.f191028d;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent newMainActClearStack(Context context, boolean z, boolean z2) {
        return CoreModule.f17545c.m31469A3(context, z, z2);
    }

    public Intent newUIContainerAct(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("setting_scroll_to_bottom", z);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public eqd0 notificationSettings() {
        return CoreModule.f17545c.f19639e0.f149253R;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ns */
    public int mo30801ns() {
        return u59.f174680t;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: od */
    public <T extends ValueObject> C22306c<List<T>> mo30802od(String str, final JsonAdapter<T> jsonAdapter) {
        return CoreModule.f17553k.f91940c.m206051I(str).m165620m().map(new w9j() { // from class: l.uva
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zij0.m219047b((List) obj, jsonAdapter);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void onCoinPay(Act act, PurchasePaymentParam purchasePaymentParam, d30 d30Var, d30 d30Var2, PayMethod payMethod) {
        PurchaseType purchaseType = PurchaseType.TYPE_INTL_TTT_LIVE_COIN;
        PurchasePaymentParam purchasePaymentParamM214467a = new yf60(n4i0.m157865a(purchaseType)).m214474h(purchasePaymentParam.itemId).m214478l(purchasePaymentParam.quantity).m214477k(purchasePaymentParam.ext.purchaseEnv).m214467a();
        purchasePaymentParamM214467a.setPurchaseTrackId(ogw.m164284e(CoreModule.m29931H().userId() + mqi0.m155944o()));
        swh0.m186179B0(act, payMethod, n4i0.m157865a(purchaseType), new m6b0().m153189b(purchasePaymentParamM214467a).m153190c(new C4721b(d30Var, payMethod, d30Var2)).m153188a());
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public j760<Integer, Integer> onlineMatchCaculaterBlur(int i) {
        return C8609a.m50284z(i);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: p7 */
    public void mo30803p7(View view, Object obj, Media media) {
        if (NullChecker.m81303a(view) && (view instanceof CoreCommendHintEmojiView)) {
            ((CoreCommendHintEmojiView) view).m45305y(obj, media);
        }
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: pa */
    public void mo30804pa(Context context, int i, IntlOperationBanner intlOperationBanner, IntlOperationArticles intlOperationArticles) {
        CoreModule.f17545c.f19649h1.m105409y3(context, i, intlOperationBanner, intlOperationArticles);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22306c<roj0> patch(User user) {
        return CoreModule.f17545c.f19639e0.m169547u9(user);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22306c<SettingGroups> patchLiveSettings(UserLiveSettings userLiveSettings) {
        return CoreModule.f17545c.f19639e0.m169567z9(userLiveSettings);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22306c<roj0> patchSettings(SettingGroups settingGroups) {
        return CoreModule.f17545c.f19663m0.m31121k8(settingGroups);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: pe */
    public boolean mo30805pe() {
        return ogl0.m164226E();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: pm */
    public Intent mo30806pm(Context context, boolean z, boolean z2) {
        return MomentVisitorsAct.m57786Z1(context, z, z2);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22306c<roj0> pollConversation() {
        return CoreModule.f17545c.f19642f0.m32650Fo();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void pollUserCounters() {
        CoreModule.f17545c.f19639e0.m169397H9();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: pq */
    public boolean mo30807pq() {
        return xma.m210047L3();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ps */
    public void mo30808ps(String str) {
        CoreModule.f17553k.f91940c.delete(Filter.AND(Message.LOCALINMOMENT.m81224T(), Message.MOMENT.mo60175EQ(str)));
    }

    public void purchase(final PutongAct putongAct, final WebViewX webViewX, final String str, final String str2, final String str3) {
        putongAct.post(new Runnable() { // from class: l.kwa
            @Override // java.lang.Runnable
            public final void run() {
                euk.m118173e(putongAct, webViewX, str, str2, str3, "");
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: q7 */
    public boolean mo30809q7() {
        return mb90.m153866b(PurchaseType.TYPE_ROAMING_PKG);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: q8 */
    public String mo30810q8() {
        return az50.INSTANCE.m99627g();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: q9 */
    public void mo30811q9(Act act, String str, d30 d30Var) {
        swh0.m186177A1(act, str, d30Var);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: qh */
    public Object mo30812qh(View view) {
        if (!NullChecker.m81303a(view) || !(view instanceof CoreCommendHintEmojiView)) {
            return null;
        }
        CoreCommendHintEmojiView coreCommendHintEmojiView = (CoreCommendHintEmojiView) view;
        Object selectStickerInfoOrMedia = coreCommendHintEmojiView.getSelectStickerInfoOrMedia();
        coreCommendHintEmojiView.m45299s();
        return selectStickerInfoOrMedia;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: qp */
    public String mo30813qp() {
        return x4i.f191029e;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public User queryMe() {
        return CoreModule.f17545c.f19639e0.m169429P9();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22306c<Envelope> raw_messagePost(String str, String str2, String str3, boolean z) throws IOException {
        Message messageNew_ = Message.new_();
        try {
            messageNew_ = Message.JSON_ADAPTER.parse(str2);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        messageNew_.momentShowFromType = str3;
        messageNew_.isFromKanKan = z;
        C4740g c4740g = CoreModule.f17545c.f19642f0;
        return C4740g.m32190Ro(str, messageNew_);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22306c<roj0> refreshUser(String str, boolean z) {
        return CoreModule.f17545c.f19639e0.m169458X9(str, z);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void registerPurchaseDialogListener(e1m e1mVar) {
        j2b0.m139417a().m139421e(e1mVar);
    }

    public void removeUserFromLikers(String str) {
        CoreModule.f17545c.f19687u0.m30491x7(str);
    }

    public void removeUserFromSuggested(String str) {
        CoreModule.f17545c.f19663m0.m30994E8(str);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void renderVipBadge(Act act, User user, ImageView imageView, boolean z, boolean z2) {
        VipNewUtils.m57515l(act, user, imageView, z, z2);
    }

    public C22306c<roj0> report(String str, String str2, String str3, Report report) {
        return CoreModule.f17545c.f19618X.m113772h3(C4728a.m31366w2("/" + str + "/moments/" + str2 + "/messages/" + str3 + "/reports"), report);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public <T extends ValueObject> void resendDialog(Act act, T t) {
        ItemMessageRight.m48463p1(act, (Message) zij0.m219048c(t, Message.JSON_ADAPTER));
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: rg */
    public boolean mo30814rg() {
        return q8p.INSTANCE.m173449x();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: rr */
    public boolean mo30815rr() {
        User userM169520na;
        pib pibVar = CoreModule.f17545c.f19639e0;
        if (pibVar == null || (userM169520na = pibVar.m169520na()) == null) {
            return false;
        }
        List<UserStatus> list = userM169520na.status;
        return !vwb.m200296J(list) && list.contains(UserStatus.get("hidden")) && list.contains(UserStatus.get(UserStatus.RISK_TAG_UNREAL));
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: s0 */
    public void mo30816s0(final Act act, final String str) {
        if (act == null || TextUtils.isEmpty(str)) {
            return;
        }
        act.duringCreated((C22306c) CoreModule.f17545c.f19642f0.m32820Ue(str).map(new w9j() { // from class: l.lwa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreServiceImpl.m30655Q((Conversation) obj);
            }
        })).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.mwa
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreServiceImpl.m30668e0(act, str, (j760) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: s2 */
    public void mo30817s2(Context context, final String str) {
        final Act act = (Act) context;
        act.duringCreated(CoreModule.f17545c.f19645g0.m31809H6(str).filter(new qh7()).take(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.dwa
            @Override // p149l.e30
            public final void call(Object obj) {
                Act act2 = act;
                act2.startActivity(GroupProfileAct.m49107Z1(act2, str, (ChatGroup) obj, true));
            }
        }, new e30() { // from class: l.ewa
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreServiceImpl.m30665b0((Throwable) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: se */
    public C22306c<List<RecommendMessage>> mo30818se(String str) {
        return CoreModule.f17545c.f19678r0.m34144s5(str);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void setIfShowTabBarInNewUI(Act act, boolean z) {
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).m39809c7(Boolean.valueOf(z));
        }
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void setMomentTabDot(Act act, boolean z) {
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).m39800Y6(TabName.Moment, z);
        }
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void setMomentTabNum(Act act, int i) {
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).m39813e7(TabName.Moment, i);
        }
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void setNewMainActClass(Context context, Intent intent) {
        NewMainAct.m39682H5(context, intent);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void setTabDot(Act act, TabName tabName, boolean z) {
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).m39800Y6(tabName, z);
        }
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void setTabNum(Act act, TabName tabName, int i) {
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).m39813e7(tabName, i);
        }
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: sg */
    public boolean mo30819sg(String str) {
        return CoreModule.f17545c.f19642f0.m32856Xe(str) != null;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean shouldLockComment(String str) {
        return zb0.m217810g(str);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean shouldShowAutoPay() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void showAutoPayHelp(Act act) {
        CoreModule.m29935P().m94656g().mo35010Fn(act);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void showBanner(Act act, ViewGroup viewGroup, Banners banners) {
        ife.m135906o().m135914r(act, viewGroup, banners);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void showBindPhoneDialog(Act act, d30 d30Var) {
        ark.m98441P0(act, "", new d30() { // from class: l.iwa
            @Override // p149l.d30
            public final void call() {
                CoreServiceImpl.m30657S();
            }
        }, false, false, d30Var);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void showLocationPermissionCallbackDlg(Act act, d30 d30Var, d30 d30Var2, boolean z, boolean z2, String str) {
        e4w.m114722j(act, d30Var, d30Var2, z, z2, str);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean showMomentBanner() {
        return ife.m135906o().m135907j(BannerLoc.get(BannerLoc.moment_feed));
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void showProofAgeDlg(Act act, String str) {
        zb0.m217812i(act, str);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void showSeeDialog(Act act, d30 d30Var, String str) {
        C8764c.m53382C1(act, str, Privilege.see_who_likes_me, d30Var);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void showUserVerificationLogo(Context context, User user, VImage vImage) {
        if (!jjb0.m141784b()) {
            if (!user.isPicVerificationVerified()) {
                xdl0.m208344M(vImage, false);
                return;
            } else {
                vImage.setBackgroundResource(x2c0.f189654Pt);
                xdl0.m208344M(vImage, true);
                return;
            }
        }
        int iM58149h = CertificationUtil.m58149h(user);
        if (iM58149h == -1) {
            xdl0.m208344M(vImage, false);
            return;
        }
        vImage.setImageResource(iM58149h);
        vImage.setBackgroundResource(0);
        xdl0.m208344M(vImage, true);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void showVipPurchaseDialog(Act act, String str) {
        C8764c.m53400I1(act, str);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void skipH5PayActivityFromLive(Act act, String str, boolean z) {
        CoreModule.f17545c.f19604S0.m34189z3(act, C4745k.m34180y3(str), z);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: sq */
    public void mo30820sq(Act act, String str, final d30 d30Var, d30 d30Var2, d30 d30Var3) {
        C8764c.m53439a0(act, str, new e30() { // from class: l.fwa
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreServiceImpl.m30648H(d30Var, (PurchaseType) obj);
            }
        }, d30Var2, d30Var3, Privilege.oDiamondVisitor);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void startJailedDialogLikeAct() {
        Intent intent = new Intent(CoreModule.f17544b, (Class<?>) JailedDialogLikeAct.class);
        intent.setFlags(268435456);
        CoreModule.f17544b.startActivity(intent);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent startLikersAct(Context context, String str) {
        return LikersAct.m56544X1(context, str);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent startMessagesAct(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, Intent intent, int i) {
        return MessagesAct.m48948o2(context, str, z, z2, z3, z4, intent, i);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent startProfileAct(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6) {
        return ProfileAct.m50741s2(context, str, str2, z, z2, z3, relationshipStatus, i, z4, z5, z6);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: te */
    public boolean mo30821te() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: tg */
    public int mo30822tg() {
        AppealInfo appealInfoM178724a = rc2.m178723e().m178724a();
        if (appealInfoM178724a == null) {
            return 1;
        }
        String str = appealInfoM178724a.method;
        str.getClass();
        return !str.equals("idCard") ? 1 : 2;
    }

    public Intent toBaiduMaps(Context context, int i) {
        return MapAct.m47370Z1(context, i);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent toIntlMaps(Context context, int i, boolean z) {
        return IntlMapAct.m35947g2(context, i, z);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent toMessagesActFromPush(Context context, String str, String str2) {
        Intent intentM151858n = lva.m151858n(context, str, 1);
        intentM151858n.putExtra("bundle_notify_type", str2);
        return intentM151858n;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent toNewMainAct(Context context, boolean z, boolean z2) {
        return NewMainAct.m39703P5(context, z, z2);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent toNewMainActFromPush(Context context, String str, String str2) {
        return NewMainAct.m39711T6(context, str, str2);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent toPassWordResetAct(Act act, VerifyData verifyData) {
        return PasswordResetAct.m44195V1(act, verifyData);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent toReportAct(Context context, String str, boolean z, ResultReceiver resultReceiver) {
        return ReportAct.m54628a2(context, str, z, resultReceiver);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void trackBannerMV(Banners banners) {
        ife.m135906o().m135916t(banners);
    }

    public void trackPlayerBlockTime(long j, String str, String str2) {
        if (j <= 200 || TextUtils.isEmpty(str)) {
            return;
        }
        HashMap map = new HashMap();
        String strValueOf = String.valueOf(j);
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.SYS_CHECK;
        str.getClass();
        String str3 = Moments.TYPE;
        switch (str) {
            case "from_nearby_falls_feed":
                l3fVar.f125900s = "e_VideoStuck_feed";
                l3fVar.f125895n = OMSDialogPositon.p_nearby;
                str3 = "nearby";
                break;
            case "moments":
                l3fVar.f125900s = "e_VideoStuck_feed";
                l3fVar.f125895n = "p_moment_fullscreen_view";
                break;
            case "from_nearby_focus":
                l3fVar.f125900s = "e_VideoStuck_feed";
                l3fVar.f125895n = "p_follow";
                str3 = "follow";
                break;
            case "home_card":
                l3fVar.f125900s = "e_VideoStuck_profile";
                l3fVar.f125895n = OMSDialogPositon.p_suggest_user_profile_info_view;
            default:
                str3 = "";
                break;
        }
        map.put(BLiveOperationTitleShowType.duration, strValueOf);
        map.put("tag", str3);
        if (!TextUtils.isEmpty(str2)) {
            map.put("url", str2);
        }
        if (TextUtils.isEmpty(l3fVar.f125900s)) {
            return;
        }
        zvf0.m220392n(l3fVar, map);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void triggerCounterFromMemoryCache(Counter counter) {
        C4732c c4732c = CoreModule.f17545c;
        if (c4732c == null) {
            return;
        }
        c4732c.m31473E3(counter);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: u7 */
    public C22393b<j760<Boolean, Integer>> mo30823u7() {
        return NewMainAct.f24435s;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: u8 */
    public C22392a<roj0> mo30824u8() {
        return wn90.m204602F().f187273e;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: uf */
    public void mo30825uf(String str) {
        CoreModule.f17553k.f91940c.delete(Filter.AND(Message.CID.mo60175EQ(str), Message.MESSAGETYPE.m60176EQ(MessageType.local_user_moment_message)));
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void unregisterPurchaseDialogListener(e1m e1mVar) {
        j2b0.m139417a().m139422f(e1mVar);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: up */
    public void mo30826up(Act act, e30<Boolean> e30Var) {
        wm20.m203972l(act, e30Var).run();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void updateUnreadActivitiesByMoment(int i) {
        CoreModule.f17545c.m31475G3(i);
    }

    @Override // p149l.k8k0
    public void updateUser(User user) {
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ur */
    public void mo30827ur(Act act, String str, e30<Boolean> e30Var) {
        yz9.m216627u(act, str, e30Var);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22306c<User> userObsById(String str) {
        return CoreModule.f17545c.f19639e0.m169410Ka(str);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent userStoryAct(Context context, String str, String str2) {
        return UserStoryAct.m58141Z1(context, str, str2);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ut */
    public void mo30828ut() {
        CoreModule.f17545c.m31482m3();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: v8 */
    public void mo30829v8(Act act, User user, boolean z, boolean z2, String str, LikeFrom likeFrom, String str2, String str3, e30<Relationship> e30Var, e30<Throwable> e30Var2) {
        yz9.m216605B(act, user, z, z2, str, likeFrom, e30Var, e30Var2, str2, str3, false, new boolean[0]);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void verifyAppealIdentity(Act act, PhoneNumber phoneNumber) {
        AppealInfo appealInfoM178724a = rc2.m178723e().m178724a();
        if (appealInfoM178724a == null) {
            return;
        }
        tvf.m190737o(phoneNumber);
        String str = appealInfoM178724a.method;
        str.getClass();
        if (str.equals("idCard")) {
            act.startActivity(NationalIdAuthAct.m56073X1(act, "appeal", false));
        } else if (str.equals("picture")) {
            tvf.m190730h(act, "appeal");
        }
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: vn */
    public long mo30830vn(User user) {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(user.f56011id);
        return NullChecker.m81303a(userM169430Pa) ? uld0.m194219d(userM169430Pa) : user.getActiveTimeFromSvip();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: vq */
    public IntlOperationArticles mo30831vq() {
        return CoreModule.f17545c.f19649h1.m105388B3();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: w7 */
    public Intent mo30832w7(Context context) {
        return lva.m151848d(context);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: w8 */
    public boolean mo30833w8(Act act) {
        if (act instanceof NewMainAct) {
            return ((NewMainAct) act).m39812e6(TabName.Live);
        }
        return false;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22306c<roj0> waitPatchSettings() {
        return CoreModule.f17545c.wait(Settings.TYPE, -1);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: wb */
    public C22306c<roj0> mo30834wb() {
        return CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip")).map(new w9j() { // from class: l.tva
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: xf */
    public boolean mo30835xf() {
        return n4i0.m157866b();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: xs */
    public C22306c<roj0> mo30836xs(String str) {
        return CoreModule.f17545c.f19642f0.m32902ap(str);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: yd */
    public boolean mo30837yd(String str) {
        return j15.m139227g(ChatPartnerScene.get(str));
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: yf */
    public void mo30838yf(Act act, boolean z, String str, String str2, Picture.ImageUri imageUri, String str3) {
        CoreModule.f17545c.f19642f0.m32676Hp(act, z, str, str2, imageUri, str3);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: yo */
    public View mo30839yo(Act act, e30<String> e30Var, d30 d30Var, MessageInputEditView messageInputEditView, boolean z, View view) {
        if (z) {
            CoreMomentEmojiNewView coreMomentEmojiNewView = (CoreMomentEmojiNewView) View.inflate(act, f6c0.f95996s8, null);
            coreMomentEmojiNewView.m45334B(act, e30Var, d30Var, messageInputEditView, view);
            return coreMomentEmojiNewView;
        }
        CoreMomentEmojiView coreMomentEmojiView = (CoreMomentEmojiView) View.inflate(act, f6c0.f95274A7, null);
        coreMomentEmojiView.m45375s(act, e30Var, d30Var, messageInputEditView);
        return coreMomentEmojiView;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: yp */
    public Intent mo30840yp(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, String str3) {
        return ProfileAct.m50742u2(context, str, str2, z, z2, z3, relationshipStatus, i, z4, z5, z6, str3);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: yr */
    public C22306c<TabName> mo30841yr() {
        return v930.m197537k();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: z8 */
    public void mo30842z8(Act act, String str) {
        j15.m139228h(act, ChatPartnerScene.get(str));
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ze */
    public void mo30843ze(Act act) {
        act.startActivity(new Intent(act, (Class<?>) GroupSuggestAct.class));
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: zp */
    public Intent mo30844zp(Context context, IntentParams intentParams) {
        intentParams.toString();
        return NewMainAct.m39731h6(context, intentParams);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent startMessagesAct(Context context, String str, boolean z, boolean z2) {
        return MessagesAct.m48943i2(context, str, z, z2);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent toNewMainAct(Context context, NavigationIntent navigationIntent) {
        return NewMainAct.m39685I5(context, navigationIntent);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent newMainActClearStack(Context context, boolean z) {
        return CoreModule.f17545c.m31495z3(context, z);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22306c<roj0> refreshUser(String str) {
        return CoreModule.f17545c.f19639e0.m169454W9(str);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22306c<roj0> report(String str, String str2, Report report) {
        return CoreModule.f17545c.f19618X.m113772h3(C4728a.m31366w2("/" + str + "/moments/" + str2 + "/reports"), report);
    }
}
