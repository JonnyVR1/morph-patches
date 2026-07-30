package com.p051p1.mobile.putong.core.api;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.p053ui.label.LabelStyle;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.app.web.WebViewX;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreServiceImpl;
import com.p051p1.mobile.putong.core.data.AppealInfo;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.ChatPartnerScene;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageMomentGuide;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.RegionRule;
import com.p051p1.mobile.putong.core.data.RegionRuleTag;
import com.p051p1.mobile.putong.core.data.Sticker;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.map.IntlMapAct;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.newui.appeal.AppealAct;
import com.p051p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p051p1.mobile.putong.core.newui.group.CoreGroupChatHeaderView;
import com.p051p1.mobile.putong.core.newui.group.GroupSuggestAct;
import com.p051p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.myinterestpeople.CoreMyInterestPeopleTraceAct;
import com.p051p1.mobile.putong.core.newui.newmeet.NewMeetAct;
import com.p051p1.mobile.putong.core.newui.partner.ChatPartnerSelectStatusAct;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view.PlatformQualificationButton;
import com.p051p1.mobile.putong.core.p058ui.account.GPBindPhoneNumberInputAct;
import com.p051p1.mobile.putong.core.p058ui.account.JailedDialogLikeAct;
import com.p051p1.mobile.putong.core.p058ui.account.NewAccountSecureAct;
import com.p051p1.mobile.putong.core.p058ui.account.PasswordResetAct;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.core.p058ui.emoji.CoreCommendHintEmojiView;
import com.p051p1.mobile.putong.core.p058ui.emoji.CoreMomentEmojiNewView;
import com.p051p1.mobile.putong.core.p058ui.emoji.CoreMomentEmojiView;
import com.p051p1.mobile.putong.core.p058ui.greet.C8523d;
import com.p051p1.mobile.putong.core.p058ui.map.MapAct;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPreviewAct;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageRight;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.group.GroupProfileAct;
import com.p051p1.mobile.putong.core.p058ui.moment.MomentMessageAct;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.DropDownAct;
import com.p051p1.mobile.putong.core.p058ui.report.ReportAct;
import com.p051p1.mobile.putong.core.p058ui.settings.IntlSettingGenderAct;
import com.p051p1.mobile.putong.core.p058ui.settings.PersonalDetailsAct;
import com.p051p1.mobile.putong.core.p058ui.settings.privacyandpremisson.PrivacyAndPremissonAct;
import com.p051p1.mobile.putong.core.p058ui.settings.subscriptions.SubscriptionsAct;
import com.p051p1.mobile.putong.core.p058ui.statussquare.CoreStateSquareRecycleView;
import com.p051p1.mobile.putong.core.p058ui.statussquare.CoreStatusSquareTabFrag;
import com.p051p1.mobile.putong.core.p058ui.verification.national.NationalIdAuthAct;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.VipNewUtils;
import com.p051p1.mobile.putong.core.p058ui.vip.roam.VipRoamLocationAct;
import com.p051p1.mobile.putong.core.p058ui.visitor.MomentVisitorsAct;
import com.p051p1.mobile.putong.core.p058ui.webview.UserStoryAct;
import com.p051p1.mobile.putong.core.util.CertificationUtil;
import com.p051p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p051p1.mobile.putong.data.BannerLoc;
import com.p051p1.mobile.putong.data.Banners;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.ConversationStatus;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.IntlOperationArticles;
import com.p051p1.mobile.putong.data.IntlOperationBanner;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MomentFeedPushArgs;
import com.p051p1.mobile.putong.data.Moments;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.PaymentData;
import com.p051p1.mobile.putong.data.PhoneNumber;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.PurchasePaymentParam;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.RecommendMessage;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.Report;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.StickerInfo;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserLiveSettings;
import com.p051p1.mobile.putong.data.UserPushSettings;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.data.VerifyData;
import com.p051p1.mobile.putong.data.VisitorCounter;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.newui.view.MessageInputEditView;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p151v.VImage;
import p153l.C18526m2;
import p153l.Cfor;
import p153l.a30;
import p153l.a5i0;
import p153l.aso;
import p153l.aw90;
import p153l.bkj0;
import p153l.bmg;
import p153l.bn50;
import p153l.bnl0;
import p153l.bt0;
import p153l.byd0;
import p153l.c6w;
import p153l.cjj;
import p153l.csj0;
import p153l.d79;
import p153l.dbc0;
import p153l.dkb;
import p153l.do60;
import p153l.epc0;
import p153l.f760;
import p153l.gra;
import p153l.gv20;
import p153l.gyd0;
import p153l.hlh0;
import p153l.hso;
import p153l.hxf;
import p153l.i25;
import p153l.i4g0;
import p153l.iam;
import p153l.j1a;
import p153l.ji30;
import p153l.joa;
import p153l.jxd0;
import p153l.jyb;
import p153l.kec0;
import p153l.l51;
import p153l.lb2;
import p153l.lj1;
import p153l.llb0;
import p153l.m6i;
import p153l.mge;
import p153l.nab0;
import p153l.niw;
import p153l.nrb0;
import p153l.nv6;
import p153l.o1j0;
import p153l.o3z;
import p153l.of7;
import p153l.ovb0;
import p153l.oze;
import p153l.pdi;
import p153l.pej0;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.q4f;
import p153l.qap;
import p153l.qcj;
import p153l.qeb0;
import p153l.qhk0;
import p153l.qj90;
import p153l.qp7;
import p153l.qtk;
import p153l.rgr;
import p153l.s7a;
import p153l.sb8;
import p153l.sh00;
import p153l.spl0;
import p153l.syu;
import p153l.tq8;
import p153l.tva0;
import p153l.tza0;
import p153l.ui7;
import p153l.uq8;
import p153l.uqb0;
import p153l.uwk;
import p153l.uxj0;
import p153l.vb0;
import p153l.vg60;
import p153l.w0r;
import p153l.wci0;
import p153l.wgx;
import p153l.wtd0;
import p153l.wyb0;
import p153l.x20;
import p153l.x3m;
import p153l.xra;
import p153l.xtj0;
import p153l.xwa;
import p153l.xzm0;
import p153l.y20;
import p153l.y2h0;
import p153l.yc2;
import p153l.z0n;
import p153l.z20;
import p153l.zki0;
import p153l.zzm;

/* JADX INFO: loaded from: classes9.dex */
@Route(name = "CoreService服务", path = "/core_service/service")
public class CoreServiceImpl implements CoreService {

    /* JADX INFO: renamed from: a */
    public C18526m2 f20052a = new nv6();

    /* JADX INFO: renamed from: b */
    public int f20053b = -1;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.CoreServiceImpl$a */
    public class C4871a implements bn50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f20054a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ x20 f20055b;

        public C4871a(x20 x20Var, x20 x20Var2) {
            this.f20054a = x20Var;
            this.f20055b = x20Var2;
        }

        @Override // p153l.bn50
        /* JADX INFO: renamed from: a */
        public void mo31848a() {
            this.f20055b.call();
        }

        @Override // p153l.bn50
        /* JADX INFO: renamed from: c */
        public void mo31849c() {
            this.f20054a.call();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.CoreServiceImpl$b */
    public class C4872b implements bn50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f20057a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ PayMethod f20058b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ x20 f20059c;

        public C4872b(x20 x20Var, PayMethod payMethod, x20 x20Var2) {
            this.f20057a = x20Var;
            this.f20058b = payMethod;
            this.f20059c = x20Var2;
        }

        @Override // p153l.bn50
        /* JADX INFO: renamed from: a */
        public void mo31848a() {
            if (NullChecker.m82486a(this.f20059c)) {
                this.f20059c.call();
            }
        }

        @Override // p153l.bn50
        /* JADX INFO: renamed from: c */
        public void mo31849c() {
            if (NullChecker.m82486a(this.f20057a)) {
                this.f20057a.call();
            }
            a5i0.m96160p0().m96196N0(this.f20058b);
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m31650F(y20 y20Var, StickerInfo stickerInfo) {
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(stickerInfo);
        }
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m31651H(x20 x20Var, PurchaseType purchaseType) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m31652J(Sticker sticker, Act act, uxj0 uxj0Var) {
        if (!jyb.m147479J(sticker.pictures)) {
            uqb0.f180374G.m127160x0(sticker.pictures.get(0).url);
            if (!jyb.m147479J(sticker.pictures.get(0).attachments)) {
                uqb0.f180374G.m127160x0(sticker.pictures.get(0).attachments.get(0).url);
            }
        }
        act.progressDismiss();
        o1j0.m165649w(R$string.f21728h6);
        l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.jxa
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f18264c.f20366Z.f20885T.m159280q();
            }
        }, 50L);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ ConversationStatus m31656N(Conversation conversation) {
        return conversation != null ? conversation.status : ConversationStatus.get("deleted");
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m31657P(Throwable th) {
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ pf60 m31658Q(Conversation conversation) {
        return new pf60(conversation, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m31660S() {
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ Unit m31667a0(String str, Boolean bool) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("remainingtimes", Integer.valueOf(wyb0.m208508i0()));
        map.put("voicechat_results", wyb0.m208493O().getVoicechat_results());
        i4g0.m138521s("e_voicechat_button", str, map);
        return null;
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m31668b0(Throwable th) {
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m31670d0(String str) {
        C4891g c4891g = CoreModule.f18264c.f20384f0;
        c4891g.m34107rf(str, c4891g.m34004jg(str, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m31671e0(Act act, String str, pf60 pf60Var) {
        if (NullChecker.m82486a(pf60Var.f152156a) && TEnum.equals(((Conversation) pf60Var.f152156a).status, "default")) {
            act.startActivity(MessagesAct.m50126k2(act, str, false, false));
            return;
        }
        C8523d.a aVar = new C8523d.a(str, "from_virtual_voice");
        aVar.m47101o("p_audio,greet");
        C8523d.m47075a(act, aVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m31672f0(Sticker sticker) {
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m31673g0(Act act, Throwable th) {
        act.progressDismiss();
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40327) {
            o1j0.m165649w(R$string.f21773m6);
        } else {
            o1j0.m165649w(R$string.f21719g6);
            l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.ixa
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20366Z.f20885T.m159280q();
                }
            }, 50L);
        }
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Ap */
    public void mo31675Ap(Act act, User user, boolean z, Relationship relationship) {
        j1a.m143106w(act, user, z, relationship);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Ar */
    public Intent mo31676Ar(Context context, String str, String str2, boolean z) {
        return ProfileAct.m51922q2(context, str, str2, z, false);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: B6 */
    public void mo31677B6() {
        m6i.m157228c();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Ba */
    public jxd0 mo31678Ba() {
        return CoreModule.f18264c.f20381e0.f89073L6;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Br */
    public boolean mo31679Br() {
        return xra.m212796o();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Cb */
    public void mo31680Cb(Envelope envelope) {
        ((CoreData) envelope.getModuleData(CoreData.class)).messages.clear();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Ch */
    public String mo31681Ch() {
        return qap.INSTANCE.m175970h();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Dd */
    public void mo31682Dd() {
        IVPostImagesSelectAct.f24866i.m137019l(Boolean.TRUE);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Dh */
    public boolean mo31683Dh() {
        return qap.INSTANCE.m175978p();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Dm */
    public String mo31684Dm() {
        return y2h0.m214079f();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Dp */
    public boolean mo31685Dp() {
        return Cfor.INSTANCE.m126490a();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: E5 */
    public C22421c<View> mo31686E5(Act act) {
        return CoreModule.f18273l.m143405a().mo34310E5(act);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: F0 */
    public String mo31687F0() {
        return "diamond";
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: F2 */
    public String mo31688F2() {
        return "platinum";
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Fc */
    public void mo31689Fc(Act act, StickerInfo stickerInfo, final y20<StickerInfo> y20Var) {
        act.duringCreated(CoreModule.f18264c.f20366Z.f20885T.m35956R(stickerInfo)).subscribe(psd0.m173597H(new y20() { // from class: l.sxa
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreServiceImpl.m31650F(y20Var, (StickerInfo) obj);
            }
        }, new y20() { // from class: l.txa
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreServiceImpl.m31657P((Throwable) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Ff */
    public void mo31690Ff(final Act act, StickerInfo stickerInfo) {
        if (NullChecker.m82486a(CoreModule.f18264c.f20366Z.f20885T.m159277n()) && !jyb.m147479J(CoreModule.f18264c.f20366Z.f20885T.m159277n().userStickers) && !jyb.m147479J(CoreModule.f18264c.f20366Z.f20885T.m159277n().userStickers.get(0).favoriteStickers) && CoreModule.f18264c.f20366Z.f20885T.m159277n().userStickers.get(0).favoriteStickers.size() >= 300) {
            o1j0.m165649w(R$string.f21773m6);
            return;
        }
        final Sticker stickerNew_ = Sticker.new_();
        stickerNew_.mergeDataFromStickerInfo(stickerInfo);
        act.progress(R$string.f21517I2, true);
        act.duringCreated(CoreModule.f18264c.f20366Z.f20885T.m35953O(stickerNew_)).subscribe(psd0.m173597H(new y20() { // from class: l.aya
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreServiceImpl.m31652J(stickerNew_, act, (uxj0) obj);
            }
        }, new y20() { // from class: l.bya
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreServiceImpl.m31673g0(act, (Throwable) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Fo */
    public void mo31691Fo(Context context) {
        context.startActivity(new Intent(context, (Class<?>) PrivacyAndPremissonAct.class));
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Gb */
    public void mo31692Gb(Context context) {
        zki0.m220076E(context);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Gn */
    public boolean mo31693Gn() {
        return hlh0.m135741a().m135745e();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Hp */
    public void mo31694Hp(Act act, String str) {
        bt0.m106318a(act, str);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: I4 */
    public boolean mo31695I4() {
        return gra.m131778z();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Ia */
    public boolean mo31696Ia(User user) {
        if (!NullChecker.m82486a(user) || user.isTeamAccount()) {
            return false;
        }
        return ((double) pzi0.m174454o()) - (user.isHideActiveFromSVip() ? (double) wtd0.m207832d(user) : user.location.updatedTime) < 300000.0d;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Ic */
    public boolean mo31697Ic() {
        return gra.m131630T2();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Id */
    public int mo31698Id() {
        return m6i.f135004f;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Ij */
    public void mo31699Ij(Act act, String str, String str2, Object obj, String str3, String str4, boolean z, boolean z2) {
        C8523d.a aVar = new C8523d.a(str, str3);
        aVar.m47099m(obj).m47101o(str4).m47100n(str2).m47096j(z).m47097k(z2);
        C8523d.m47075a(act, aVar);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Io */
    public void mo31700Io(String str) {
        f760.INSTANCE.m124370q(str);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Jn */
    public Class<?> mo31701Jn() {
        return CoreMyInterestPeopleTraceAct.class;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Jq */
    public void mo31702Jq() {
        CoreModule.f18264c.f20391h1.m166317G3();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Js */
    public C22421c<ovb0<Boolean, Integer, IntlOperationBanner, Boolean>> mo31703Js() {
        return CoreModule.f18264c.f20391h1.m166314D3();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: K9 */
    public void mo31704K9(String str, List<String> list, boolean z) {
        CoreModule.f18272k.f115535c.m189460V(str, list, z);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Kg */
    public View mo31705Kg(Context context, String str, String str2, y20<Boolean> y20Var) {
        CoreGroupChatHeaderView coreGroupChatHeaderView = (CoreGroupChatHeaderView) View.inflate(context, kec0.f125420G3, null);
        coreGroupChatHeaderView.m37527H(str, str2, y20Var);
        return coreGroupChatHeaderView;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Km */
    public void mo31706Km(Act act, SettingGroups settingGroups) {
        if (!NullChecker.m82486a(act) || act.isFinishing()) {
            return;
        }
        act.startActivityForResult(IntlSettingGenderAct.INSTANCE.m56191a(act, settingGroups), 18);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Lk */
    public boolean mo31707Lk(String str) {
        return CoreModule.f18264c.f20384f0.m34219zp(str) != null;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Lo */
    public int mo31708Lo() {
        return gra.m131612P0();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: M2 */
    public void mo31709M2(Act act, User user, String str) {
        if (gra.m131722n3()) {
            pdi.m171817b0(act, user, false, str);
        } else {
            wgx.m206283A().m206312L(act, user, false, str);
        }
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: M9 */
    public C22421c<Boolean> mo31710M9(String str) {
        return CoreModule.f18264c.f20384f0.m33823Ue(str).map(new qcj() { // from class: l.exa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Conversation) obj) != null);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Md */
    public boolean mo31711Md() {
        return gra.m131621R1();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Mq */
    public void mo31712Mq(Long l2) {
        f760.INSTANCE.m124367n(l2.longValue());
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Ne */
    public void mo31713Ne(Long l2) {
        qap.INSTANCE.m175983u(l2.longValue());
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Ng */
    public View mo31714Ng(Context context, String str) {
        PlatformQualificationButton platformQualificationButton = new PlatformQualificationButton(context);
        platformQualificationButton.setPageId(str);
        return platformQualificationButton;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Ni */
    public void mo31715Ni(Act act, String str, String str2, x20 x20Var) {
        of7.m167420o().m167428D(act, "feed", str, str2, x20Var);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: O1 */
    public String mo31716O1() {
        return "partner";
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Oa */
    public void mo31717Oa(Act act, String str, String str2, Boolean bool) {
        act.startActivity(DropDownAct.m55631c2(act, str, str2, bool));
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: P3 */
    public C22421c<Boolean> mo31718P3() {
        return !NullChecker.m82486a(CoreModule.f18264c) ? C22507a.m222759c(Boolean.FALSE) : CoreModule.f18264c.f20384f0.m33823Ue(syu.m188587h()).map(new qcj() { // from class: l.lxa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((Conversation) obj));
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Pg */
    public List<IntlOperationBanner> mo31719Pg() {
        return CoreModule.f18264c.f20391h1.m166334z3();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Pq */
    public void mo31720Pq(Act act, boolean z) {
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).m40838u7(z);
        }
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Ps */
    public Intent mo31721Ps(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, boolean z7, String str3) {
        return ProfileAct.m51929z2(context, str, str2, z, z2, z3, relationshipStatus, i, z4, z5, z6, z7, str3);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Q2 */
    public boolean mo31722Q2() {
        return a5i0.m96160p0().m96223l1();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Q7 */
    public void mo31723Q7(boolean z, Act act, User user, y20<Relationship> y20Var, y20<Throwable> y20Var2) {
        j1a.m143099p(z, act, user, y20Var, y20Var2);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Q9 */
    public pej0 mo31724Q9(String str, Act act, String str2, String str3, String str4, String str5, x20 x20Var, x20 x20Var2, x20 x20Var3, x20 x20Var4, x20 x20Var5, x20 x20Var6, x20 x20Var7, x20 x20Var8, User user) {
        return qtk.m177995R0(str, act, str2, str3, str4, str5, x20Var, x20Var2, x20Var3, x20Var4, x20Var5, x20Var6, x20Var7, x20Var8, user);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Qf */
    public boolean mo31725Qf() {
        return !xzm0.m213760p().m213773q();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Rb */
    public void mo31726Rb(Act act, String str) {
        CoreModule.m30933P().m143405a().mo34568pr(act, str, Privilege.liked_user);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Rp */
    public void mo31727Rp(String str) {
        qap.INSTANCE.m175985w(str);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Rs */
    public void mo31728Rs(Act act, User user, boolean z, LikeFrom likeFrom, String str, boolean z2, String str2) {
        bmg.m105058d(act, user, z, likeFrom, str, z2, str2);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Sa */
    public void mo31729Sa(Act act, String str, String str2) {
        act.startActivity(DropDownAct.m55631c2(act, str, str2, Boolean.TRUE));
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Sr */
    public void mo31730Sr(Act act, String str, String str2, boolean z) {
        xtj0.m213100c(act, str, str2, z);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Ug */
    public void mo31731Ug(Act act, String str) {
        C8927c.m54586J1(act, str, Privilege.vip_location);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Us */
    public void mo31732Us(Act act) {
        act.startActivity(new Intent(act, (Class<?>) NewAccountSecureAct.class));
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Vk */
    public void mo31733Vk(Act act, String str, String str2, String str3, String str4, Channel channel, y20<Boolean> y20Var) {
        j1a.m143108y(act, str, str2, str3, str4, channel, y20Var);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Vr */
    public void mo31734Vr() {
        CoreModule.f18264c.f20381e0.f89121S2.clear();
        CoreModule.f18264c.f20381e0.f89129T2.clear();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: W2 */
    public C22421c<Boolean> mo31735W2() {
        return !NullChecker.m82486a(CoreModule.f18264c) ? C22507a.m222759c(Boolean.FALSE) : CoreModule.f18264c.f20384f0.m33740Ne(syu.m188587h()).filter(new sb8()).map(new qcj() { // from class: l.nxa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Conversation) obj).unreadMessages >= 1);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Wp */
    public boolean mo31736Wp() {
        return s7a.m184986o();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Wq */
    public boolean mo31737Wq() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Xd */
    public void mo31738Xd() {
        qap.INSTANCE.m175964b();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Y3 */
    public String mo31739Y3() {
        return "vip";
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Y6 */
    public void mo31740Y6(Act act, String str) {
        act.startActivity(VipRoamLocationAct.m58870Z1(act, str));
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Yn */
    public void mo31741Yn(Act act, String str, String str2, String str3, String str4, boolean z, String str5) {
        C8523d.a aVar = new C8523d.a(str, str3);
        aVar.m47103q(str2).m47101o(str4).m47097k(z).m47102p(str5);
        C8523d.m47075a(act, aVar);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Z3 */
    public boolean mo31742Z3(Activity activity) {
        return (activity instanceof MediaPreviewAct) || (activity instanceof com.p051p1.mobile.putong.core.p058ui.mediapreview.MediaPreviewAct);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Zb */
    public void mo31743Zb(TabName tabName, boolean z) {
        ji30.m144971o(tabName, z);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: Zj */
    public ConversationStatus mo31744Zj(String str) {
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(str);
        if (conversationM33859Xe != null) {
            return conversationM33859Xe.status;
        }
        return null;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: a */
    public tq8 mo31745a() {
        return uq8.m197218l();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: aa */
    public void mo31746aa(Act act, String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
        C8523d.a aVar = new C8523d.a(str, str3);
        aVar.m47103q(str2).m47101o(str4).m47097k(z).m47102p(str5);
        C8523d.m47076b(act, aVar, str6);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ab */
    public C22421c<ConversationStatus> mo31747ab(String str) {
        return CoreModule.f18264c.f20384f0.m33823Ue(str).map(new qcj() { // from class: l.cxa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreServiceImpl.m31656N((Conversation) obj);
            }
        });
    }

    public C22421c<pf60<Integer, String>> alipayAuthWithErrorCode(AuthTask authTask) {
        return CoreModule.f18264c.f20312H0.m155448k4(authTask);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: as */
    public void mo31748as(boolean z) {
        hlh0.m135741a().m135750j(z, "FeedPostStateGuideBottomSheetDialog");
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: b3 */
    public int mo31749b3() {
        return C8772a.m51429b0();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: b6 */
    public View mo31750b6(Act act, EditText editText, boolean z, y20<Boolean> y20Var, boolean z2) {
        CoreCommendHintEmojiView coreCommendHintEmojiView = (CoreCommendHintEmojiView) View.inflate(act, kec0.f126060t1, null);
        coreCommendHintEmojiView.m46474D(editText, z, y20Var, z2);
        return coreCommendHintEmojiView;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22421c<uxj0> blocks(String str) {
        return CoreModule.f18264c.f20384f0.m34119se(str);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: bs */
    public void mo31751bs(Context context, View view, String str) {
        VipNewUtils.m58690d(context, view, str);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: c9 */
    public void mo31752c9(View view, int i) {
        if (view instanceof CoreMomentEmojiNewView) {
            ((CoreMomentEmojiNewView) view).setViewGone(i);
        }
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ci */
    public void mo31753ci(String str, String str2, String str3, boolean z) {
        CoreModule.f18264c.f20418q1.m34274D3(str, str2, str3, z);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ck */
    public boolean mo31754ck() {
        return joa.m146357G3();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void clearCounterUnread() {
        CoreModule.f18264c.m32479g3();
    }

    public void clearCounterUnreadExceptFansForUI1() {
        CoreModule.f18264c.m32480h3();
    }

    public void clearCounterViewersUnread() {
        CoreModule.f18264c.m32481i3();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void clearRequests(String str, int i) {
        CoreModule.f18264c.clearRequests(str, i);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void clearUnReadLikes() {
        CoreModule.f18264c.m32483k3();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void clearUnreadFans() {
        CoreModule.f18264c.m32482j3();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void confirmThenUnmatch(Act act, String str, y20<String> y20Var, x20 x20Var, x20 x20Var2, String str2) {
        CoreDlg.m46292v1(act, str, y20Var, x20Var, x20Var2, str2);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22421c<Counter> counter() {
        return CoreModule.f18264c.m32486n3();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Counter counter_() {
        return CoreModule.f18264c.m32487o3();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: cs */
    public boolean mo31755cs() {
        return tza0.m193654b().m193655a();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: d2 */
    public lb2 mo31756d2(Act act, y20<String> y20Var, EditText editText, ArrayList<oze.C19253a> arrayList, List<List<String>> list, x20 x20Var) {
        return new w0r(act, y20Var, new y20() { // from class: l.hxa
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreServiceImpl.m31672f0((Sticker) obj);
            }
        }, editText, arrayList, list, x20Var, true);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: db */
    public int mo31757db(LabelStyle labelStyle) {
        if (labelStyle == LabelStyle.MAX) {
            return dbc0.f86217Hg;
        }
        if (labelStyle == LabelStyle.MIDDLE) {
            return dbc0.f86249Ig;
        }
        return labelStyle == LabelStyle.SMALL ? dbc0.f86281Jg : dbc0.f86217Hg;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void deleteConversationAndRelated(final String str) {
        CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.bxa
            @Override // p153l.x20
            public final void call() {
                CoreServiceImpl.m31670d0(str);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: dg */
    public HashMap<String, Boolean> mo31758dg(Envelope envelope) {
        Boolean bool;
        HashMap<String, Boolean> map = new HashMap<>();
        List<Message> list = ((CoreData) envelope.getModuleData(CoreData.class)).messages;
        if (!jyb.m147479J(list)) {
            for (Message message : list) {
                if (message != null && (bool = message.recalled) != null && bool.booleanValue()) {
                    map.put(message.f56859id, Boolean.TRUE);
                }
            }
        }
        return map;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void dismissGpBindPhoneRedDot() {
        CoreModule.f18264c.f20381e0.f89214e0.put(Boolean.FALSE);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: dk */
    public void mo31759dk(Boolean bool) {
        qap.INSTANCE.m175984v(bool.booleanValue());
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: dl */
    public void mo31760dl(Act act, boolean z, x20 x20Var) {
        CoreDlg.m46224Y1(act, z, x20Var);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void doGPPayment(Act act, String str, x20 x20Var, x20 x20Var2) throws IOException {
        Merchandise merchandiseNew_ = Merchandise.new_();
        try {
            merchandiseNew_ = Merchandise.JSON_ADAPTER.parse(str);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        hso hsoVar = new hso(act, wci0.m205820a(PurchaseType.TYPE_INTL_TTT_LIVE_COIN));
        hsoVar.m137011t(new C4871a(x20Var, x20Var2));
        hsoVar.m137007p(aso.m99953h(act, act instanceof PutongAct ? ((PutongAct) act).iap().m103295i() : null), merchandiseNew_.autoRenewable(), merchandiseNew_.defaultStockKeepUnit.affiliateProducts.getProductId());
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: e9 */
    public int mo31761e9(LabelStyle labelStyle) {
        if (labelStyle == LabelStyle.MAX) {
            return dbc0.f86313Kg;
        }
        if (labelStyle == LabelStyle.MIDDLE) {
            return dbc0.f86345Lg;
        }
        return labelStyle == LabelStyle.SMALL ? dbc0.f86377Mg : dbc0.f86313Kg;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: eb */
    public C22421c<Boolean> mo31762eb() {
        return CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("oDiamond")).map(new qcj() { // from class: l.zxa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(joa.m146369U3((UserPrivilege) obj));
            }
        }).distinctUntilChanged();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ec */
    public void mo31763ec() {
        CoreModule.f18264c.f20381e0.f89101P6.clear();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ef */
    public C22508b<Boolean> mo31764ef() {
        return CoreStatusSquareTabFrag.f37203X;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: em */
    public void mo31765em(Act act, final String str, String str2) {
        wyb0.m208493O().m208563v0(str2);
        wyb0.m208493O().m208533A0(act, false, true, new Function1() { // from class: l.dxa
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CoreServiceImpl.m31667a0(str, (Boolean) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: fp */
    public void mo31766fp() {
        Intent intentM37169Z1 = AppealAct.m37169Z1(App.f16088e.getApplicationContext(), SchemeKey.chatAppeal, PhoneNumber.new_(), "");
        intentM37169Z1.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        App.f16088e.getApplicationContext().startActivity(intentM37169Z1);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: g4 */
    public boolean mo31767g4() {
        return CoreModule.f18264c.f20340Q1.f20859R.m35762M();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: gc */
    public void mo31768gc() {
        tza0.m193654b().m193656c();
    }

    @NonNull
    public C18526m2 getAbHooker() {
        return this.f20052a;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22507a<uxj0> getAutoPlayVideoBs() {
        return lj1.m154454b().m154455a();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22421c<Banners> getBannersObs(BannerLoc bannerLoc) {
        return mge.m158199o().m158204n(bannerLoc);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public String getCurrencyProductCategory() {
        return wci0.m205820a(PurchaseType.TYPE_INTL_TTT_LIVE_COIN).productCategory().name();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public String getGPMemo(String str) {
        return CoreModule.f18264c.f20381e0.m116634y7(str);
    }

    public String getH5HeaderAuthorization() {
        return uwk.m198383b();
    }

    public Intent getMainActIntent(Context context) {
        return xwa.m213310e(context);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent getMainWithNav(Context context, NavigationIntent navigationIntent) {
        return xwa.m213316k(context, navigationIntent);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public RelativeLayout getMomentBannersView(Act act, ViewGroup viewGroup) {
        return (RelativeLayout) act.inflater().inflate(kec0.f126125wf, viewGroup, false);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22421c<Bundle> getNewMainBundleBs(TabName tabName) {
        return ji30.m144963g(tabName);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22421c<Boolean> getNewMainLiveTabSelectBs() {
        return ji30.m144966j(TabName.Live);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22421c<Boolean> getNewMainMomentTabSelectBs() {
        return ji30.m144966j(TabName.Moment);
    }

    public UserPushSettings getNotifications() {
        return CoreModule.f18264c.f20381e0.f89110R.get().push;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public long getSeeLastReadTime() {
        return CoreModule.f18264c.f20429u0.f19996l0.get().longValue();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Integer getSessionChangedProfile() {
        return CoreModule.f18264c.f20381e0.m116472I7();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Class<?> getSubscriptionsActClass() {
        return SubscriptionsAct.class;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22508b<bkj0<Integer, Integer, String>> getTPayResultBs() {
        return CoreModule.f18264c.f20346S0.m35189v3();
    }

    @Override // p153l.qhk0
    public User getUserById(String str) {
        return qhk0.C19577a.m176593a(this, str);
    }

    @Override // p153l.qhk0
    public User getUserByIdInModule(String str) {
        return CoreModule.f18264c.f20381e0.m116503Pa(str);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22421c<SettingGroups> getUserSettings() {
        return CoreModule.f18264c.f20381e0.m116476J7();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public long getUserSwipeCount() {
        return CoreModule.f18264c.f20381e0.f89158X.get().longValue();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: gi */
    public BottomSheetDialog mo31769gi(String str, String str2, boolean z, @LayoutRes int i, Act act, int i2, boolean z2, a30<String, List<String>, Boolean> a30Var) {
        qp7 qp7Var = new qp7(str, str2, z, i, act, i2, z2, a30Var);
        qp7Var.m177444f0();
        if (NullChecker.m82486a(act) && !act.isFinishing()) {
            qp7Var.show();
        }
        return qp7Var;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: gp */
    public boolean mo31770gp(String str) {
        return epc0.m121848c(str);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22421c<PaymentData> h5PayCanUseForLive() {
        return CoreModule.f18264c.f20346S0.m35190w3();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: hd */
    public void mo31771hd(Act act, String str, String str2, String str3) {
        tva0.m192782c(act, str, str2, str3);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean hideActiveTime(User user) {
        return CoreModule.f18264c.f20303E0.m141088w3(user);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean hideAge(User user) {
        return CoreModule.f18264c.f20303E0.m141091z3(user);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean hideLocation(User user) {
        return CoreModule.f18264c.f20303E0.m141060B3(user);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void hideTabBarWhenNewUIMomentIsCurrentTab(Act act) {
        if (act instanceof NewMainAct) {
            NewMainAct newMainAct = (NewMainAct) act;
            if (newMainAct.m40820i6(TabName.Moment)) {
                newMainAct.m40821i7(Boolean.FALSE);
            }
        }
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: hj */
    public void mo31772hj(iam iamVar, PushMessage pushMessage) {
        zzm zzmVar = new zzm(iamVar, pushMessage);
        if (z0n.m218137b(pushMessage.messageCustom.liveMode)) {
            zzmVar.m126745x(CorePopLevel.VIRTUAL_VOICE_PUSH);
        } else {
            zzmVar.m126745x(CorePopLevel.LIVE_PUSH);
        }
        pushMessage.messageCustom.toJson();
        llb0.m154703c().m154710i(zzmVar);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: i0 */
    public C22421c<View> mo31773i0(Act act) {
        return CoreModule.f18273l.m143405a().mo34523i0(act);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: i5 */
    public C22421c<Boolean> mo31774i5(Act act, @Nullable String str) {
        act.startActivity(GPBindPhoneNumberInputAct.m45304h2(act, false, str));
        return GPBindPhoneNumberInputAct.m45306k2();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: i7 */
    public PutongFrag mo31775i7(String str, BubbleInfo bubbleInfo, int i) {
        return CoreStatusSquareTabFrag.m56912n5(str, bubbleInfo, i);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: i8 */
    public <T extends ValueObject> T mo31776i8(String str, JsonAdapter<T> jsonAdapter) {
        return (T) csj0.m112185c(CoreModule.f18272k.f115535c.queryCache(str), jsonAdapter);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: i9 */
    public C22421c<uxj0> mo31777i9() {
        return CoreModule.f18264c.f20391h1.m166311A3();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ie */
    public <T extends ValueObject> C22421c<T> mo31778ie(final JsonAdapter<T> jsonAdapter, String str, String str2, boolean z) throws IOException {
        Message messageNew_ = Message.new_();
        try {
            messageNew_ = Message.JSON_ADAPTER.parse(str2);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        return (C22421c<T>) CoreModule.f18264c.f20384f0.m33639En(str, messageNew_, null, true).map(new qcj() { // from class: l.oxa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return csj0.m112185c((Message) obj, jsonAdapter);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ii */
    public Intent mo31779ii(Context context, String str, boolean z, ResultReceiver resultReceiver, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return ReportAct.m55811b2(context, str, z, resultReceiver);
        }
        CoreDlg.ProfileMenuBuildParam profileMenuBuildParam = new CoreDlg.ProfileMenuBuildParam();
        profileMenuBuildParam.momentId = str2;
        return ReportAct.m55812c2(context, str, z, resultReceiver, profileMenuBuildParam);
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean instanceofPersonalDetailsAct(Act act) {
        return act instanceof PersonalDetailsAct;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean isCurrentMessageBlock(String str) {
        return o3z.m165898g().m165901e(str);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean isCurrentTabMomentFrag(Act act) {
        if (act instanceof NewMainAct) {
            return ((NewMainAct) act).m40820i6(TabName.Moment);
        }
        return false;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22421c<Boolean> isHideRedByNewUser() {
        return CoreModule.f18264c.f20381e0.m116529X7().asObservable();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean isHttpDnsOpen() {
        RegionRule regionRuleM116565ga = NullChecker.m82486a(CoreModule.f18264c) ? CoreModule.f18264c.f20381e0.m116565ga() : null;
        if (!NullChecker.m82486a(regionRuleM116565ga) || jyb.m147479J(regionRuleM116565ga.tags)) {
            return false;
        }
        return regionRuleM116565ga.tags.contains(RegionRuleTag.get(RegionRuleTag.LiveHijackHttpDNS));
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean isLiveNeedDisableAudio(Activity activity) {
        return (activity instanceof MediaPreviewAct) || (activity instanceof com.p051p1.mobile.putong.core.p058ui.mediapreview.MediaPreviewAct) || (activity instanceof NewMeetAct);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean isMainPage(Act act) {
        return act instanceof NewMainAct;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22421c<Boolean> isMatched(String str) {
        return CoreModule.f18264c.f20384f0.m34173wh(str);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean isMatchedSync(String str) {
        return CoreModule.f18264c.f20384f0.m34185xh(str);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean isNewMainActContext(Activity activity) {
        return activity instanceof NewMainAct;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean isPurchaseDialogShowing() {
        return nab0.m162061a().m162062b();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ja */
    public byd0 mo31780ja() {
        return CoreStateSquareRecycleView.f37198i;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: jc */
    public void mo31781jc(Act act, User user, boolean z, String str, y20<Relationship> y20Var, y20<Throwable> y20Var2, String str2) {
        rgr.m181477n(act, user, z, false, true, str, null, y20Var, y20Var2, "pageId", null, null, null);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: jg */
    public void mo31782jg(Act act, boolean z) {
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).m40834s7(z);
        }
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: jp */
    public boolean mo31783jp(String str, String str2, String str3) {
        MomentFeedPushArgs momentFeedPushArgsNew_ = MomentFeedPushArgs.new_();
        momentFeedPushArgsNew_.uid = str2;
        momentFeedPushArgsNew_.mid = str3;
        momentFeedPushArgsNew_.path = str;
        CoreModule.f18264c.f20381e0.f88991A0.m137019l(momentFeedPushArgsNew_);
        return true;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: k2 */
    public C22421c<String> mo31784k2() {
        return CoreModule.f18264c.f20294B0.m32614j4().map(new qcj() { // from class: l.kxa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((VerificationCenter) obj).toJson();
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: k4 */
    public boolean mo31785k4() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: k7 */
    public C22508b<Boolean> mo31786k7() {
        return CoreGroupChatHeaderView.f22283l;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: k9 */
    public Intent mo31787k9(Context context, String str, String str2, String str3) {
        return MomentMessageAct.m51275X1(context, str, str2, str3);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ki */
    public void mo31788ki(Activity activity) {
        activity.startActivity(CoreModule.m30930K().startMessagesAct(activity, User.ID_TEAM_ACCOUNT, true, false));
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: kj */
    public void mo31789kj(Act act, String str, String str2, z20<Boolean, String> z20Var) {
        BookMoviesDramasHelper.m60627j(act, str, str2, z20Var);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: kk */
    public void mo31790kk(Act act) {
        act.startActivity(ChatPartnerSelectStatusAct.m44120Z1(act));
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: kn */
    public void mo31791kn(Act act, User user, boolean z, String str, LikeFrom likeFrom, String str2, y20<Relationship> y20Var, y20<Throwable> y20Var2) {
        j1a.m143109z(act, user, z, str, likeFrom, y20Var, y20Var2, str2, new boolean[0]);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ks */
    public C22421c<uxj0> mo31792ks(String str, String str2, String str3, x20 x20Var) {
        return CoreModule.f18264c.f20384f0.m33716Le(str, str2, str3, x20Var);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: kt */
    public void mo31793kt() {
        tza0.m193654b().m193657d();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22421c<uxj0> loadLikers(Links links, long j, int i) {
        return CoreModule.f18264c.f20429u0.m31427Y6(links, j, i);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public <T extends ValueObject, K extends ValueObject> C22421c<List<T>> localiseMerchandises(Act act, List<K> list, final JsonAdapter<T> jsonAdapter) {
        return (C22421c<List<T>>) cjj.m110205M(act, csj0.m112184b(list, Merchandise.JSON_ADAPTER)).map(new qcj() { // from class: l.vxa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return csj0.m112184b((List) obj, jsonAdapter);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: m2 */
    public boolean mo31794m2() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: m8 */
    public boolean mo31795m8(String str) {
        Conversation conversationM34219zp = CoreModule.f18264c.f20384f0.m34219zp(str);
        return NullChecker.m82486a(conversationM34219zp) && conversationM34219zp.isHeartbeatConv();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ma */
    public Intent mo31796ma(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, boolean z7) {
        return ProfileAct.m51927w2(context, str, str2, z, z2, z3, relationshipStatus, i, z4, z5, z6, z7);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    @Nullable
    /* JADX INFO: renamed from: mc */
    public VisitorCounter mo31797mc() {
        return CoreModule.f18264c.f20406m1.m35703N4();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: me */
    public C22421c<User> mo31798me() {
        return CoreModule.f18264c.f20381e0.m116596o9();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public User me_() {
        return CoreModule.f18264c.f20381e0.m116600p9();
    }

    public Intent mediaPickerActArgs(Context context, int i, boolean z, boolean z2, boolean z3) {
        return MediaPickerAct.m48965d2(context, i, z, z2, z3);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public <T extends ValueObject> C22421c<List<T>> merchandises(String str, boolean z, final JsonAdapter<T> jsonAdapter) {
        return (C22421c<List<T>>) CoreModule.f18264c.f20396j0.m31576A5(str, z).map(new qcj() { // from class: l.mxa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return csj0.m112184b((List) obj, jsonAdapter);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void mergeNetworkStateIntoLocalState(Envelope envelope, x20 x20Var) {
        CoreModule.f18264c.m32495w3(envelope, x20Var);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ml */
    public void mo31799ml(String str) {
        sh00.m185838h(str);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: mm */
    public void mo31800mm(VImage vImage, boolean z) {
        vImage.setImageResource(z ? dbc0.f87368r1 : dbc0.f87401s1);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22421c<vg60<User>> momentSeeAbLikers() {
        return CoreModule.f18264c.f20429u0.m31499z7();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: mq */
    public void mo31801mq(String str, String str2, int i, List<String> list, String str3, String str4, double d, String str5) {
        MessageMomentGuide messageMomentGuideNew_ = MessageMomentGuide.new_();
        messageMomentGuideNew_.ownerId = str;
        messageMomentGuideNew_.f21188id = str2;
        messageMomentGuideNew_.type = i;
        messageMomentGuideNew_.createdTime = d;
        messageMomentGuideNew_.imageUrlList = list;
        messageMomentGuideNew_.desc = str3;
        messageMomentGuideNew_.audioDuration = str4;
        messageMomentGuideNew_.videoDuration = str5;
        CoreModule.f18264c.f20384f0.m34070oh(str, messageMomentGuideNew_.toJson());
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: n6 */
    public void mo31802n6(String str) {
        CoreModule.f18272k.f115535c.m189457S(str);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: nd */
    public boolean mo31803nd() {
        return m6i.f135002d;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent newMainActClearStack(Context context, boolean z, boolean z2) {
        return CoreModule.f18264c.m32472A3(context, z, z2);
    }

    public Intent newUIContainerAct(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("setting_scroll_to_bottom", z);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public gyd0 notificationSettings() {
        return CoreModule.f18264c.f20381e0.f89110R;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ns */
    public int mo31804ns() {
        return d79.f85487t;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: od */
    public <T extends ValueObject> C22421c<List<T>> mo31805od(String str, final JsonAdapter<T> jsonAdapter) {
        return CoreModule.f18272k.f115535c.m189447I(str).m208677m().map(new qcj() { // from class: l.gxa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return csj0.m112184b((List) obj, jsonAdapter);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void onCoinPay(Act act, PurchasePaymentParam purchasePaymentParam, x20 x20Var, x20 x20Var2, PayMethod payMethod) {
        PurchaseType purchaseType = PurchaseType.TYPE_INTL_TTT_LIVE_COIN;
        PurchasePaymentParam purchasePaymentParamM117176a = new do60(wci0.m205820a(purchaseType)).m117183h(purchasePaymentParam.itemId).m117187l(purchasePaymentParam.quantity).m117186k(purchasePaymentParam.ext.purchaseEnv).m117176a();
        purchasePaymentParamM117176a.setPurchaseTrackId(niw.m163315e(CoreModule.m30929H().userId() + pzi0.m174454o()));
        a5i0.m96084B0(act, payMethod, wci0.m205820a(purchaseType), new qeb0().m176235b(purchasePaymentParamM117176a).m176236c(new C4872b(x20Var, payMethod, x20Var2)).m176234a());
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public pf60<Integer, Integer> onlineMatchCaculaterBlur(int i) {
        return C8772a.m51467z(i);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: p7 */
    public void mo31806p7(View view, Object obj, Media media) {
        if (NullChecker.m82486a(view) && (view instanceof CoreCommendHintEmojiView)) {
            ((CoreCommendHintEmojiView) view).m46488y(obj, media);
        }
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: pa */
    public void mo31807pa(Context context, int i, IntlOperationBanner intlOperationBanner, IntlOperationArticles intlOperationArticles) {
        CoreModule.f18264c.f20391h1.m166333y3(context, i, intlOperationBanner, intlOperationArticles);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22421c<uxj0> patch(User user) {
        return CoreModule.f18264c.f20381e0.m116620u9(user);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22421c<SettingGroups> patchLiveSettings(UserLiveSettings userLiveSettings) {
        return CoreModule.f18264c.f20381e0.m116640z9(userLiveSettings);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22421c<uxj0> patchSettings(SettingGroups settingGroups) {
        return CoreModule.f18264c.f20405m0.m32124k8(settingGroups);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: pe */
    public boolean mo31808pe() {
        return spl0.m187353E();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: pm */
    public Intent mo31809pm(Context context, boolean z, boolean z2) {
        return MomentVisitorsAct.m58969a2(context, z, z2);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22421c<uxj0> pollConversation() {
        return CoreModule.f18264c.f20384f0.m33653Fo();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void pollUserCounters() {
        CoreModule.f18264c.f20381e0.m116470H9();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: pq */
    public boolean mo31810pq() {
        return joa.m146361M3();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ps */
    public void mo31811ps(String str) {
        CoreModule.f18272k.f115535c.delete(Filter.AND(Message.LOCALINMOMENT.m82407T(), Message.MOMENT.mo61359EQ(str)));
    }

    public void purchase(final PutongAct putongAct, final WebViewX webViewX, final String str, final String str2, final String str3) {
        putongAct.post(new Runnable() { // from class: l.wxa
            @Override // java.lang.Runnable
            public final void run() {
                uwk.m198386e(putongAct, webViewX, str, str2, str3, "");
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: q7 */
    public boolean mo31812q7() {
        return qj90.m176830b(PurchaseType.TYPE_ROAMING_PKG);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: q8 */
    public String mo31813q8() {
        return f760.INSTANCE.m124360g();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: q9 */
    public void mo31814q9(Act act, String str, x20 x20Var) {
        a5i0.m96082A1(act, str, x20Var);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: qh */
    public Object mo31815qh(View view) {
        if (!NullChecker.m82486a(view) || !(view instanceof CoreCommendHintEmojiView)) {
            return null;
        }
        CoreCommendHintEmojiView coreCommendHintEmojiView = (CoreCommendHintEmojiView) view;
        Object selectStickerInfoOrMedia = coreCommendHintEmojiView.getSelectStickerInfoOrMedia();
        coreCommendHintEmojiView.m46482s();
        return selectStickerInfoOrMedia;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: qp */
    public String mo31816qp() {
        return m6i.f135003e;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public User queryMe() {
        return CoreModule.f18264c.f20381e0.m116502P9();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22421c<Envelope> raw_messagePost(String str, String str2, String str3, boolean z) throws IOException {
        Message messageNew_ = Message.new_();
        try {
            messageNew_ = Message.JSON_ADAPTER.parse(str2);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        messageNew_.momentShowFromType = str3;
        messageNew_.isFromKanKan = z;
        C4891g c4891g = CoreModule.f18264c.f20384f0;
        return C4891g.m33193Ro(str, messageNew_);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22421c<uxj0> refreshUser(String str, boolean z) {
        return CoreModule.f18264c.f20381e0.m116531X9(str, z);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void registerPurchaseDialogListener(x3m x3mVar) {
        nab0.m162061a().m162065e(x3mVar);
    }

    public void removeUserFromLikers(String str) {
        CoreModule.f18264c.f20429u0.m31383C7(str);
    }

    public void removeUserFromSuggested(String str) {
        CoreModule.f18264c.f20405m0.m31997E8(str);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void renderVipBadge(Act act, User user, ImageView imageView, boolean z, boolean z2) {
        VipNewUtils.m58698l(act, user, imageView, z, z2);
    }

    public C22421c<uxj0> report(String str, String str2, String str3, Report report) {
        return CoreModule.f18264c.f20360X.m174051h3(C4879a.m32369w2("/" + str + "/moments/" + str2 + "/messages/" + str3 + "/reports"), report);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public <T extends ValueObject> void resendDialog(Act act, T t) {
        ItemMessageRight.m49646p1(act, (Message) csj0.m112185c(t, Message.JSON_ADAPTER));
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: rg */
    public boolean mo31817rg() {
        return qap.INSTANCE.m175986x();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: rr */
    public boolean mo31818rr() {
        User userM116593na;
        dkb dkbVar = CoreModule.f18264c.f20381e0;
        if (dkbVar == null || (userM116593na = dkbVar.m116593na()) == null) {
            return false;
        }
        List<UserStatus> list = userM116593na.status;
        return !jyb.m147479J(list) && list.contains(UserStatus.get("hidden")) && list.contains(UserStatus.get(UserStatus.RISK_TAG_UNREAL));
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: s0 */
    public void mo31819s0(final Act act, final String str) {
        if (act == null || TextUtils.isEmpty(str)) {
            return;
        }
        act.duringCreated((C22421c) CoreModule.f18264c.f20384f0.m33823Ue(str).map(new qcj() { // from class: l.xxa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreServiceImpl.m31658Q((Conversation) obj);
            }
        })).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.yxa
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreServiceImpl.m31671e0(act, str, (pf60) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: s2 */
    public void mo31820s2(Context context, final String str) {
        final Act act = (Act) context;
        act.duringCreated(CoreModule.f18264c.f20387g0.m32812H6(str).filter(new ui7()).take(1)).subscribe(psd0.m173597H(new y20() { // from class: l.pxa
            @Override // p153l.y20
            public final void call(Object obj) {
                Act act2 = act;
                act2.startActivity(GroupProfileAct.m50290a2(act2, str, (ChatGroup) obj, true));
            }
        }, new y20() { // from class: l.qxa
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreServiceImpl.m31668b0((Throwable) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: se */
    public C22421c<List<RecommendMessage>> mo31821se(String str) {
        return CoreModule.f18264c.f20420r0.m35147s5(str);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void setIfShowTabBarInNewUI(Act act, boolean z) {
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).m40821i7(Boolean.valueOf(z));
        }
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void setMomentTabDot(Act act, boolean z) {
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).m40813e7(TabName.Moment, z);
        }
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void setMomentTabNum(Act act, int i) {
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).m40825k7(TabName.Moment, i);
        }
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void setNewMainActClass(Context context, Intent intent) {
        NewMainAct.m40694L5(context, intent);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void setTabDot(Act act, TabName tabName, boolean z) {
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).m40813e7(tabName, z);
        }
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void setTabNum(Act act, TabName tabName, int i) {
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).m40825k7(tabName, i);
        }
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: sg */
    public boolean mo31822sg(String str) {
        return CoreModule.f18264c.f20384f0.m33859Xe(str) != null;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean shouldLockComment(String str) {
        return vb0.m200645g(str);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean shouldShowAutoPay() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void showAutoPayHelp(Act act) {
        CoreModule.m30933P().m143410g().mo36013Fn(act);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void showBanner(Act act, ViewGroup viewGroup, Banners banners) {
        mge.m158199o().m158207r(act, viewGroup, banners);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void showBindPhoneDialog(Act act, x20 x20Var) {
        qtk.m177991P0(act, "", new x20() { // from class: l.uxa
            @Override // p153l.x20
            public final void call() {
                CoreServiceImpl.m31660S();
            }
        }, false, false, x20Var);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void showLocationPermissionCallbackDlg(Act act, x20 x20Var, x20 x20Var2, boolean z, boolean z2, String str) {
        c6w.m108186j(act, x20Var, x20Var2, z, z2, str);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public boolean showMomentBanner() {
        return mge.m158199o().m158200j(BannerLoc.get(BannerLoc.moment_feed));
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void showProofAgeDlg(Act act, String str) {
        vb0.m200647i(act, str);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void showSeeDialog(Act act, x20 x20Var, String str) {
        C8927c.m54565C1(act, str, Privilege.see_who_likes_me, x20Var);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void showUserVerificationLogo(Context context, User user, VImage vImage) {
        if (!nrb0.m164466b()) {
            if (!user.isPicVerificationVerified()) {
                bnl0.m105524M(vImage, false);
                return;
            } else {
                vImage.setBackgroundResource(dbc0.f86103Du);
                bnl0.m105524M(vImage, true);
                return;
            }
        }
        int iM59332h = CertificationUtil.m59332h(user);
        if (iM59332h == -1) {
            bnl0.m105524M(vImage, false);
            return;
        }
        vImage.setImageResource(iM59332h);
        vImage.setBackgroundResource(0);
        bnl0.m105524M(vImage, true);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void showVipPurchaseDialog(Act act, String str) {
        C8927c.m54583I1(act, str);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void skipH5PayActivityFromLive(Act act, String str, boolean z) {
        CoreModule.f18264c.f20346S0.m35192z3(act, C4896k.m35183y3(str), z);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: sq */
    public void mo31823sq(Act act, String str, final x20 x20Var, x20 x20Var2, x20 x20Var3) {
        C8927c.m54622a0(act, str, new y20() { // from class: l.rxa
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreServiceImpl.m31651H(x20Var, (PurchaseType) obj);
            }
        }, x20Var2, x20Var3, Privilege.oDiamondVisitor);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void startJailedDialogLikeAct() {
        Intent intent = new Intent(CoreModule.f18263b, (Class<?>) JailedDialogLikeAct.class);
        intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        CoreModule.f18263b.startActivity(intent);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent startLikersAct(Context context, String str) {
        return LikersAct.m57727Y1(context, str);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent startMessagesAct(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, Intent intent, int i) {
        return MessagesAct.m50131p2(context, str, z, z2, z3, z4, intent, i);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent startProfileAct(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6) {
        return ProfileAct.m51925u2(context, str, str2, z, z2, z3, relationshipStatus, i, z4, z5, z6);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: te */
    public boolean mo31824te() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: tg */
    public int mo31825tg() {
        AppealInfo appealInfoM215119a = yc2.m215118e().m215119a();
        if (appealInfoM215119a == null) {
            return 1;
        }
        String str = appealInfoM215119a.method;
        str.getClass();
        return !str.equals("idCard") ? 1 : 2;
    }

    public Intent toBaiduMaps(Context context, int i) {
        return MapAct.m48553a2(context, i);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent toIntlMaps(Context context, int i, boolean z) {
        return IntlMapAct.m36950h2(context, i, z);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent toMessagesActFromPush(Context context, String str, String str2) {
        Intent intentM213319n = xwa.m213319n(context, str, 1);
        intentM213319n.putExtra("bundle_notify_type", str2);
        return intentM213319n;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent toNewMainAct(Context context, boolean z, boolean z2) {
        return NewMainAct.m40715T5(context, z, z2);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent toNewMainActFromPush(Context context, String str, String str2) {
        return NewMainAct.m40727Z6(context, str, str2);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent toPassWordResetAct(Act act, VerifyData verifyData) {
        return PasswordResetAct.m45378X1(act, verifyData);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent toReportAct(Context context, String str, boolean z, ResultReceiver resultReceiver) {
        return ReportAct.m55811b2(context, str, z, resultReceiver);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void trackBannerMV(Banners banners) {
        mge.m158199o().m158209t(banners);
    }

    public void trackPlayerBlockTime(long j, String str, String str2) {
        if (j <= 200 || TextUtils.isEmpty(str)) {
            return;
        }
        HashMap map = new HashMap();
        String strValueOf = String.valueOf(j);
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.SYS_CHECK;
        str.getClass();
        String str3 = Moments.TYPE;
        switch (str) {
            case "from_nearby_falls_feed":
                q4fVar.f155581s = "e_VideoStuck_feed";
                q4fVar.f155576n = OMSDialogPositon.p_nearby;
                str3 = "nearby";
                break;
            case "moments":
                q4fVar.f155581s = "e_VideoStuck_feed";
                q4fVar.f155576n = "p_moment_fullscreen_view";
                break;
            case "from_nearby_focus":
                q4fVar.f155581s = "e_VideoStuck_feed";
                q4fVar.f155576n = "p_follow";
                str3 = "follow";
                break;
            case "home_card":
                q4fVar.f155581s = "e_VideoStuck_profile";
                q4fVar.f155576n = OMSDialogPositon.p_suggest_user_profile_info_view;
            default:
                str3 = "";
                break;
        }
        map.put(BLiveOperationTitleShowType.duration, strValueOf);
        map.put("tag", str3);
        if (!TextUtils.isEmpty(str2)) {
            map.put("url", str2);
        }
        if (TextUtils.isEmpty(q4fVar.f155581s)) {
            return;
        }
        i4g0.m138516n(q4fVar, map);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void triggerCounterFromMemoryCache(Counter counter) {
        C4883c c4883c = CoreModule.f18264c;
        if (c4883c == null) {
            return;
        }
        c4883c.m32476E3(counter);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: u7 */
    public C22508b<pf60<Boolean, Integer>> mo31826u7() {
        return NewMainAct.f25177s;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: u8 */
    public C22507a<uxj0> mo31827u8() {
        return aw90.m100562F().f73705e;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: uf */
    public void mo31828uf(String str) {
        CoreModule.f18272k.f115535c.delete(Filter.AND(Message.CID.mo61359EQ(str), Message.MESSAGETYPE.m61360EQ(MessageType.local_user_moment_message)));
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void unregisterPurchaseDialogListener(x3m x3mVar) {
        nab0.m162061a().m162066f(x3mVar);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: up */
    public void mo31829up(Act act, y20<Boolean> y20Var) {
        gv20.m132477l(act, y20Var).run();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void updateUnreadActivitiesByMoment(int i) {
        CoreModule.f18264c.m32478G3(i);
    }

    @Override // p153l.qhk0
    public void updateUser(User user) {
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ur */
    public void mo31830ur(Act act, String str, y20<Boolean> y20Var) {
        j1a.m143104u(act, str, y20Var);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22421c<User> userObsById(String str) {
        return CoreModule.f18264c.f20381e0.m116483Ka(str);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent userStoryAct(Context context, String str, String str2) {
        return UserStoryAct.m59324a2(context, str, str2);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ut */
    public void mo31831ut() {
        CoreModule.f18264c.m32485m3();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: v8 */
    public void mo31832v8(Act act, User user, boolean z, boolean z2, String str, LikeFrom likeFrom, String str2, String str3, y20<Relationship> y20Var, y20<Throwable> y20Var2) {
        j1a.m143082B(act, user, z, z2, str, likeFrom, y20Var, y20Var2, str2, str3, false, new boolean[0]);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public void verifyAppealIdentity(Act act, PhoneNumber phoneNumber) {
        AppealInfo appealInfoM215119a = yc2.m215118e().m215119a();
        if (appealInfoM215119a == null) {
            return;
        }
        hxf.m137594o(phoneNumber);
        String str = appealInfoM215119a.method;
        str.getClass();
        if (str.equals("idCard")) {
            act.startActivity(NationalIdAuthAct.m57256Y1(act, "appeal", false));
        } else if (str.equals("picture")) {
            hxf.m137587h(act, "appeal");
        }
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: vn */
    public long mo31833vn(User user) {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(user.f56859id);
        return NullChecker.m82486a(userM116503Pa) ? wtd0.m207832d(userM116503Pa) : user.getActiveTimeFromSvip();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: vq */
    public IntlOperationArticles mo31834vq() {
        return CoreModule.f18264c.f20391h1.m166312B3();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: w7 */
    public Intent mo31835w7(Context context) {
        return xwa.m213309d(context);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: w8 */
    public boolean mo31836w8(Act act) {
        if (act instanceof NewMainAct) {
            return ((NewMainAct) act).m40820i6(TabName.Live);
        }
        return false;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22421c<uxj0> waitPatchSettings() {
        return CoreModule.f18264c.wait(Settings.TYPE, -1);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: wb */
    public C22421c<uxj0> mo31837wb() {
        return CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip")).map(new qcj() { // from class: l.fxa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: xf */
    public boolean mo31838xf() {
        return wci0.m205821b();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: xs */
    public C22421c<uxj0> mo31839xs(String str) {
        return CoreModule.f18264c.f20384f0.m33905ap(str);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: yd */
    public boolean mo31840yd(String str) {
        return i25.m138166g(ChatPartnerScene.get(str));
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: yf */
    public void mo31841yf(Act act, boolean z, String str, String str2, Picture.ImageUri imageUri, String str3) {
        CoreModule.f18264c.f20384f0.m33679Hp(act, z, str, str2, imageUri, str3);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: yo */
    public View mo31842yo(Act act, y20<String> y20Var, x20 x20Var, MessageInputEditView messageInputEditView, boolean z, View view) {
        if (z) {
            CoreMomentEmojiNewView coreMomentEmojiNewView = (CoreMomentEmojiNewView) View.inflate(act, kec0.f126169z8, null);
            coreMomentEmojiNewView.m46517B(act, y20Var, x20Var, messageInputEditView, view);
            return coreMomentEmojiNewView;
        }
        CoreMomentEmojiView coreMomentEmojiView = (CoreMomentEmojiView) View.inflate(act, kec0.f125440H7, null);
        coreMomentEmojiView.m46558s(act, y20Var, x20Var, messageInputEditView);
        return coreMomentEmojiView;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: yp */
    public Intent mo31843yp(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, String str3) {
        return ProfileAct.m51926v2(context, str, str2, z, z2, z3, relationshipStatus, i, z4, z5, z6, str3);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: yr */
    public C22421c<TabName> mo31844yr() {
        return ji30.m144967k();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: z8 */
    public void mo31845z8(Act act, String str) {
        i25.m138167h(act, ChatPartnerScene.get(str));
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: ze */
    public void mo31846ze(Act act) {
        act.startActivity(new Intent(act, (Class<?>) GroupSuggestAct.class));
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    /* JADX INFO: renamed from: zp */
    public Intent mo31847zp(Context context, IntentParams intentParams) {
        intentParams.toString();
        return NewMainAct.m40746l6(context, intentParams);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent startMessagesAct(Context context, String str, boolean z, boolean z2) {
        return MessagesAct.m50126k2(context, str, z, z2);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent toNewMainAct(Context context, NavigationIntent navigationIntent) {
        return NewMainAct.m40697M5(context, navigationIntent);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public Intent newMainActClearStack(Context context, boolean z) {
        return CoreModule.f18264c.m32498z3(context, z);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22421c<uxj0> refreshUser(String str) {
        return CoreModule.f18264c.f20381e0.m116527W9(str);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService
    public C22421c<uxj0> report(String str, String str2, Report report) {
        return CoreModule.f18264c.f20360X.m174051h3(C4879a.m32369w2("/" + str + "/moments/" + str2 + "/reports"), report);
    }
}
