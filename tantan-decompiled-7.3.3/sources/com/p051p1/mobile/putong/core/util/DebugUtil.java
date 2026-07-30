package com.p051p1.mobile.putong.core.util;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import com.facebook.AccessToken;
import com.google.android.exoplayer2.PlaybackException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.gson.Gson;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.android.p053ui.poplevel.C4522a;
import com.p051p1.mobile.android.p053ui.pushbubble.SimplePushBubble;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.api.C4887e;
import com.p051p1.mobile.putong.core.api.C4909x;
import com.p051p1.mobile.putong.core.api.C4910y;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.ActionData;
import com.p051p1.mobile.putong.core.data.ActionToast;
import com.p051p1.mobile.putong.core.data.ActionToastStyle;
import com.p051p1.mobile.putong.core.data.ActionToastStyleButton;
import com.p051p1.mobile.putong.core.data.ActionToastStyleIcons;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.AppealInfo;
import com.p051p1.mobile.putong.core.data.BarLoverplaces;
import com.p051p1.mobile.putong.core.data.CardOption;
import com.p051p1.mobile.putong.core.data.ChatGiftInfo;
import com.p051p1.mobile.putong.core.data.ChatMM;
import com.p051p1.mobile.putong.core.data.ChatPartnerText;
import com.p051p1.mobile.putong.core.data.ChatPartners;
import com.p051p1.mobile.putong.core.data.CityCBanner;
import com.p051p1.mobile.putong.core.data.CityCData;
import com.p051p1.mobile.putong.core.data.ConvAdditionalSwiper;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationType;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.FakeGuideData;
import com.p051p1.mobile.putong.core.data.FourSelectOneAdCardData;
import com.p051p1.mobile.putong.core.data.GreetingSummary;
import com.p051p1.mobile.putong.core.data.GroupInvitation;
import com.p051p1.mobile.putong.core.data.Literatures;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import com.p051p1.mobile.putong.core.data.MatchSuccessAnimTime;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageAdditionalData;
import com.p051p1.mobile.putong.core.data.MessageExtData;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.PopGuide;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PrivilegeDetail;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.Questionnaire;
import com.p051p1.mobile.putong.core.data.QuestionnaireScene;
import com.p051p1.mobile.putong.core.data.QuestionnaireStrategy;
import com.p051p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p051p1.mobile.putong.core.data.ReminderAction;
import com.p051p1.mobile.putong.core.data.SalvagePopUser;
import com.p051p1.mobile.putong.core.data.SalvagePopUserType;
import com.p051p1.mobile.putong.core.data.SeeBlindBoxEnvelope;
import com.p051p1.mobile.putong.core.data.StateData;
import com.p051p1.mobile.putong.core.data.SuggestedComplimentItem;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.SystemReminder;
import com.p051p1.mobile.putong.core.data.UserIdType;
import com.p051p1.mobile.putong.core.data.UserWithRelationShip;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.data.VisitorSortType;
import com.p051p1.mobile.putong.core.newui.appeal.AppealProgressAct;
import com.p051p1.mobile.putong.core.newui.fake.C7997b;
import com.p051p1.mobile.putong.core.newui.greet.DynamicGreetListAct;
import com.p051p1.mobile.putong.core.newui.home.C8094c;
import com.p051p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p051p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC8017b;
import com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8060m1;
import com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8077u;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.holder.HomeCardExpandedType;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.transform.OldInfoTransNewAct;
import com.p051p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p051p1.mobile.putong.core.newui.icebreak.DialogC8219a;
import com.p051p1.mobile.putong.core.newui.intltribe.IntlTribeSwipeAct;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.main.NewMainViewModel;
import com.p051p1.mobile.putong.core.newui.messages.C8291a;
import com.p051p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p051p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p051p1.mobile.putong.core.newui.newuserbatchgreet.NewUserBatchGreetAct;
import com.p051p1.mobile.putong.core.newui.profile.dialog.MediaRecorderFrag;
import com.p051p1.mobile.putong.core.newui.profile.expandprofilelike.ExpandProfileLikeAct;
import com.p051p1.mobile.putong.core.newui.profile.understandme.BusinessWebViewAct;
import com.p051p1.mobile.putong.core.newui.supreme.SupremeCustomAct;
import com.p051p1.mobile.putong.core.newui.voicecall.VoiceCallAct;
import com.p051p1.mobile.putong.core.p058ui.campus.StudentInfoAct;
import com.p051p1.mobile.putong.core.p058ui.debug.LabelDemoAct;
import com.p051p1.mobile.putong.core.p058ui.debug.PopDebugLayout;
import com.p051p1.mobile.putong.core.p058ui.diamond.TabUniteManager;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.core.p058ui.greet.C8523d;
import com.p051p1.mobile.putong.core.p058ui.growth.agealert.birthdayverify.BirthdayVerifyAct;
import com.p051p1.mobile.putong.core.p058ui.intloperation.campingactivity.C8545b;
import com.p051p1.mobile.putong.core.p058ui.likedusers.LikedUsersAct;
import com.p051p1.mobile.putong.core.p058ui.likedusers.tablayout.NewMyLikedUsersAct;
import com.p051p1.mobile.putong.core.p058ui.likeminded.C8574a;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.memoji.MemojiBuzzAct;
import com.p051p1.mobile.putong.core.p058ui.marry.audit.MarryInfoAuditStatusAct;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.edit.MarryProfileEditAct;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p051p1.mobile.putong.core.p058ui.marry.status.MarryStatusSetAct;
import com.p051p1.mobile.putong.core.p058ui.match.C8618a;
import com.p051p1.mobile.putong.core.p058ui.match.C8619b;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.core.p058ui.messages.C8687b;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchManager;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchMatchUser;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchPushUser;
import com.p051p1.mobile.putong.core.p058ui.p059ad.tencent.debug.DebugSplashAdAct;
import com.p051p1.mobile.putong.core.p058ui.p059ad.tencent.debug.DebugSplashTTAdAct;
import com.p051p1.mobile.putong.core.p058ui.p060gp.C8509a;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.core.p058ui.pricerecall.PriceRecallGetSurprise2Dialog;
import com.p051p1.mobile.putong.core.p058ui.profile.CityTopGreetDialog;
import com.p051p1.mobile.putong.core.p058ui.profile.TagGuidePicAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.core.p058ui.promotion.PurchasePromotionAct;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8921a;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8924b;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.C8941c;
import com.p051p1.mobile.putong.core.p058ui.result.PurchaseResultAct;
import com.p051p1.mobile.putong.core.p058ui.seepop.NewLikeView;
import com.p051p1.mobile.putong.core.p058ui.svip.guide.SVIPIntlGuideAct;
import com.p051p1.mobile.putong.core.p058ui.verification.national.IntroductionAct;
import com.p051p1.mobile.putong.core.p058ui.verification.national.NationalIdAuthAct;
import com.p051p1.mobile.putong.core.p058ui.verification.remind.hold.AvatarForceChangeAct;
import com.p051p1.mobile.putong.core.p058ui.verification.remind.result.AvatarResultAct;
import com.p051p1.mobile.putong.core.p058ui.vip.VipAct;
import com.p051p1.mobile.putong.core.p058ui.vip.VipLocationHistoryAct;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.PicksHelper;
import com.p051p1.mobile.putong.core.util.DebugUtil;
import com.p051p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p051p1.mobile.putong.core.util.verificationoptimization.VerificationAct;
import com.p051p1.mobile.putong.data.ComDiamond;
import com.p051p1.mobile.putong.data.Contact;
import com.p051p1.mobile.putong.data.ConversationStatus;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CounterLikeLimit;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.IdVerificationResult;
import com.p051p1.mobile.putong.data.IntlPurpose;
import com.p051p1.mobile.putong.data.LinkAction;
import com.p051p1.mobile.putong.data.LiveState;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Membership;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.OMSAdCardInfo;
import com.p051p1.mobile.putong.data.OMSSwipeMoment;
import com.p051p1.mobile.putong.data.OpenSdkCodeAuth;
import com.p051p1.mobile.putong.data.Passby;
import com.p051p1.mobile.putong.data.PicVerification;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.ProfileCompletion;
import com.p051p1.mobile.putong.data.ProfileLike;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipExtensions;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.Studies;
import com.p051p1.mobile.putong.data.SuperlikeReason;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserLiveLabel;
import com.p051p1.mobile.putong.data.UserLiveState;
import com.p051p1.mobile.putong.data.UssTags;
import com.p051p1.mobile.putong.data.VerificationNetworkData;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.dbcenter.parse.JsonParseHelper;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.p070ui.webview.AccessTokenWebViewAct;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.p051p1.mobile.putong.wxapi.WXEntryActivity;
import com.p074ss.bytertc.engine.BuildConfig;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import com.tencent.connect.common.Constants;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.mmkv.MMKV;
import com.tencent.p106mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.p106mm.opensdk.openapi.IWXAPI;
import com.tencent.p106mm.opensdk.openapi.WXAPIFactory;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.Notification;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VIcon;
import p151v.VText;
import p153l.a0g;
import p153l.a30;
import p153l.a8d0;
import p153l.adc0;
import p153l.al80;
import p153l.aw90;
import p153l.b0e;
import p153l.b240;
import p153l.baj;
import p153l.bdr;
import p153l.be2;
import p153l.bkj0;
import p153l.bnl0;
import p153l.byd0;
import p153l.c9c0;
import p153l.cl80;
import p153l.d5l;
import p153l.dbc0;
import p153l.dj30;
import p153l.du80;
import p153l.ebm;
import p153l.ebn;
import p153l.eql0;
import p153l.esc0;
import p153l.f49;
import p153l.fbp;
import p153l.fo0;
import p153l.fp5;
import p153l.gj40;
import p153l.gm70;
import p153l.gra;
import p153l.gta;
import p153l.hcm;
import p153l.hl3;
import p153l.hxf;
import p153l.i4g0;
import p153l.ibb;
import p153l.ieh0;
import p153l.iig0;
import p153l.ik4;
import p153l.iyk0;
import p153l.iz40;
import p153l.j690;
import p153l.jch0;
import p153l.jek;
import p153l.jrj0;
import p153l.jxd0;
import p153l.jyb;
import p153l.kcg0;
import p153l.kec0;
import p153l.kfe0;
import p153l.l51;
import p153l.l9c;
import p153l.llb0;
import p153l.ln40;
import p153l.lyh0;
import p153l.n55;
import p153l.neb0;
import p153l.nyk0;
import p153l.o1j0;
import p153l.och0;
import p153l.oi40;
import p153l.ou80;
import p153l.p55;
import p153l.p6d0;
import p153l.pci;
import p153l.pf60;
import p153l.pk50;
import p153l.psd0;
import p153l.pza0;
import p153l.pzi0;
import p153l.qa00;
import p153l.qcj;
import p153l.qtk;
import p153l.r1j0;
import p153l.rb8;
import p153l.rfe0;
import p153l.rum;
import p153l.s0e0;
import p153l.slp;
import p153l.t05;
import p153l.t450;
import p153l.t4j;
import p153l.tab0;
import p153l.tvp0;
import p153l.tzi0;
import p153l.u2n;
import p153l.u3x;
import p153l.ueh0;
import p153l.uih0;
import p153l.upm;
import p153l.uqb0;
import p153l.uxj0;
import p153l.uyf;
import p153l.v3l0;
import p153l.vg60;
import p153l.vwl0;
import p153l.vxd0;
import p153l.w1e;
import p153l.w20;
import p153l.w53;
import p153l.w600;
import p153l.w8p;
import p153l.wgb0;
import p153l.wgx;
import p153l.wtd0;
import p153l.wxf;
import p153l.wyd0;
import p153l.x20;
import p153l.x6d0;
import p153l.xex;
import p153l.xgj;
import p153l.xwa;
import p153l.xyd0;
import p153l.y1i0;
import p153l.y20;
import p153l.y2g0;
import p153l.y2h0;
import p153l.y5l0;
import p153l.y6d0;
import p153l.ybh0;
import p153l.yvk;
import p153l.z0w;
import p153l.z20;
import p153l.z5h0;
import p153l.z7x;
import p153l.z99;
import p153l.zg6;

/* JADX INFO: loaded from: classes12.dex */
public class DebugUtil {

    /* JADX INFO: renamed from: a */
    public static final wyd0 f39099a = new wyd0("mt_url", "");

    /* JADX INFO: renamed from: b */
    public static final jxd0 f39100b;

    /* JADX INFO: renamed from: c */
    public static final jxd0 f39101c;

    /* JADX INFO: renamed from: d */
    public static final jxd0 f39102d;

    /* JADX INFO: renamed from: e */
    public static final vxd0 f39103e;

    /* JADX INFO: renamed from: f */
    public static boolean f39104f;

    /* JADX INFO: renamed from: g */
    public static final vxd0 f39105g;

    /* JADX INFO: renamed from: h */
    public static final jxd0 f39106h;

    /* JADX INFO: renamed from: i */
    public static final jxd0 f39107i;

    /* JADX INFO: renamed from: j */
    public static final String[][] f39108j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$a */
    public class C9220a implements qcj<Conversation, Conversation> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$a$a */
        public class a implements x20 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Conversation f39109a;

            public a(Conversation conversation) {
                this.f39109a = conversation;
            }

            @Override // p153l.x20
            public void call() {
                Conversation conversationMo225055clone = this.f39109a.mo225055clone();
                String str = conversationMo225055clone.f56859id;
                ChatMM chatMM = conversationMo225055clone.additional.chatMM;
                chatMM.pinChatSuggested = true;
                chatMM.expireTime = pzi0.m174454o() + 120000;
                CoreModule.f18264c.f20384f0.m34053mq(conversationMo225055clone);
            }
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Conversation call(Conversation conversation) {
            CoreModule.f18264c.f20351U.m128074a(new a(conversation));
            return null;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$a0 */
    public class C9221a0 implements y20<User> {
        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(User user) {
            for (int i = 0; i < 2; i++) {
                Contact contactNew_ = Contact.new_();
                contactNew_.name = "张三 " + i;
                user.profile.contactLookups.lookups.add(contactNew_);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$a1 */
    public class C9222a1 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39111a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39112b;

        public C9222a1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39111a = arrayList;
            this.f39112b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m60467a() {
            jxd0 jxd0Var = CoreModule.f18264c.f20384f0.f20710q1;
            jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        }

        @Override // p153l.x20
        public void call() {
            this.f39111a.clear();
            this.f39111a.add(jyb.m147494Y("心动信号女性路经变短 开关：".concat(CoreModule.f18264c.f20384f0.f20710q1.get().booleanValue() ? "true" : "false"), new x20() { // from class: l.ped
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9222a1.m60467a();
                }
            }));
            this.f39112b.act().showDebugMenu(this.f39111a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$a2 */
    public class RunnableC9223a2 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ u3x f39113a;

        public RunnableC9223a2(u3x u3xVar) {
            this.f39113a = u3xVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f39113a.show();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$b */
    public class C9224b implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39114a;

        public C9224b(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39114a = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m60468a(int i, int i2, Intent intent) {
            CoreModule.m30933P().m143405a().mo34503fl();
            return false;
        }

        @Override // p153l.x20
        public void call() {
            if (aw90.m100562F().f73701a == null) {
                gta.m132210e().m132214d().mo34947xc(CoreModule.f18264c.f20381e0.m116593na().mo225055clone());
            }
            Intent intentM52689Y1 = ProfileInfoLoopEditAct.m52689Y1(this.f39114a.act(), LoopFragmentFactory.LoopCreateEntryType.ENTRY_MOMENT_GAME, LoopInputType.BIRTHDAY, gta.m132210e().m132214d().mo34760Uc());
            intentM52689Y1.putExtra("loop_edit_patch_flag", true);
            ((Act) bnl0.m105506D(this.f39114a.getContext())).startActivityForResult(intentM52689Y1, new C4468a.a() { // from class: l.cdd
                @Override // com.p051p1.mobile.android.app.C4468a.a
                /* JADX INFO: renamed from: a */
                public final boolean mo21400a(int i, int i2, Intent intent) {
                    return DebugUtil.C9224b.m60468a(i, i2, intent);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$b0 */
    public class C9225b0 implements y20<User> {
        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(User user) {
            for (int i = 0; i < 10; i++) {
                Contact contactNew_ = Contact.new_();
                contactNew_.name = "张三 " + i;
                user.profile.contactLookups.lookups.add(contactNew_);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$b1 */
    public class C9226b1 implements y20<Throwable> {
        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$b2 */
    public class RunnableC9227b2 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            CoreModule.f18264c.f20381e0.f89234g4.m137019l("");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$c */
    public class C9228c implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39115a;

        public C9228c(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39115a = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.x20
        public void call() {
            this.f39115a.act().m40810d6().m41023r0(TabName.Me, NewMainViewModel.IconDotType.warning);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$c0 */
    public class C9229c0 implements y20<User> {
        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(User user) {
            for (int i = 0; i < 25; i++) {
                Contact contactNew_ = Contact.new_();
                contactNew_.name = "张三 " + i;
                user.profile.contactLookups.lookups.add(contactNew_);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$c1 */
    public class C9230c1 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39116a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39117b;

        public C9230c1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39116a = arrayList;
            this.f39117b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m60472a() {
            jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89289n3;
            jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        }

        @Override // p153l.x20
        public void call() {
            this.f39116a.clear();
            this.f39116a.add(jyb.m147494Y("好友上线提醒代发端内承接改版 开关：".concat(CoreModule.f18264c.f20381e0.f89289n3.get().booleanValue() ? "true" : "false"), new x20() { // from class: l.qed
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9230c1.m60472a();
                }
            }));
            this.f39117b.act().showDebugMenu(this.f39116a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$c2 */
    public class C9231c2 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39118a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39119b;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$c2$a */
        public class a implements x20 {
            public a() {
            }

            @Override // p153l.x20
            public void call() {
                CoreModule.f18264c.f20381e0.f89326s4.clear();
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$c2$b */
        public class b implements x20 {
            public b() {
            }

            @Override // p153l.x20
            public void call() {
                CoreModule.f18264c.f20381e0.f89333t4.clear();
                CoreModule.f18264c.f20381e0.f89340u4.clear();
                CoreModule.f18264c.f20381e0.f89347v4.clear();
            }
        }

        public C9231c2(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39118a = arrayList;
            this.f39119b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m60473a(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            ChatPartners chatPartnersNew_ = ChatPartners.new_();
            for (int i = 1; i < 20; i++) {
                ChatPartnerText chatPartnerTextNew_ = ChatPartnerText.new_();
                chatPartnerTextNew_.value = "这是一条文案，普通的文案" + String.valueOf(i);
                chatPartnersNew_.texts.add(chatPartnerTextNew_);
            }
            for (int i2 = 0; i2 < 9; i2++) {
                chatPartnersNew_.users.add(CoreModule.m30930K().me_());
            }
            new t05(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), chatPartnersNew_).show();
        }

        @Override // p153l.x20
        public void call() {
            this.f39118a.clear();
            ArrayList arrayList = this.f39118a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = this.f39119b;
            arrayList.add(jyb.m147494Y("弹出底部半屏弹窗", new x20() { // from class: l.mhd
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9231c2.m60473a(viewTreeObserverOnGlobalLayoutListenerC8017b);
                }
            }));
            this.f39118a.add(jyb.m147494Y("清楚客户端1小时请求频控", new a()));
            this.f39118a.add(jyb.m147494Y("清楚半屏弹窗展示频控", new b()));
            this.f39119b.act().showDebugMenu(this.f39118a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$d */
    public class C9232d implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39122a;

        public C9232d(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39122a = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.x20
        public void call() {
            this.f39122a.act().m40810d6().m41023r0(TabName.Me, NewMainViewModel.IconDotType.diamond);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$d0 */
    public class C9233d0 implements y20<Boolean> {
        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$d1 */
    public class C9234d1 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39123a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39124b;

        public C9234d1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39123a = arrayList;
            this.f39124b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.x20
        public void call() {
            this.f39123a.clear();
            ActionToastStyle actionToastStyle = new ActionToastStyle();
            actionToastStyle.styleId = "2";
            ActionToastStyleIcons actionToastStyleIcons = new ActionToastStyleIcons();
            actionToastStyleIcons.miniIcon = "online";
            actionToastStyle.icons = actionToastStyleIcons;
            actionToastStyle.toastLink = "";
            actionToastStyle.title = "XXXX";
            actionToastStyle.message = "当前在线，打个招呼吧";
            actionToastStyle.showClose = true;
            ActionToastStyleButton actionToastStyleButton = new ActionToastStyleButton();
            actionToastStyleButton.showButton = true;
            actionToastStyleButton.buttonMessage = "YYYYY";
            actionToastStyleButton.buttonBackground = LiveVoiceInternalEntryBean.TYPE_BG_STYLE_ORANGE;
            ArrayList arrayList = new ArrayList();
            arrayList.add(actionToastStyleButton);
            actionToastStyle.buttons = arrayList;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("swipe");
            actionToastStyle.scenes = arrayList2;
            actionToastStyle.showTime = 5000;
            actionToastStyle.business = "666";
            actionToastStyle.localReportId = "123456";
            ActionData actionDataNew_ = ActionData.new_();
            actionDataNew_.toastStyle = actionToastStyle;
            y2h0.m214080g().m214087k(this.f39124b, actionDataNew_);
            this.f39124b.act().showDebugMenu(this.f39123a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$d2 */
    public class RunnableC9235d2 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.nhd
                @Override // p153l.x20
                public final void call() {
                    CoreModule.f18272k.f115545m.delete("fake_conversation_local_summary_marriage_conversation");
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$e */
    public class C9236e implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39125a;

        public C9236e(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39125a = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.x20
        public void call() {
            this.f39125a.act().m40810d6().m41023r0(TabName.Me, NewMainViewModel.IconDotType.edit_profile);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$e0 */
    public class C9237e0 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39126a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39127b;

        public C9237e0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39126a = arrayList;
            this.f39127b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m60476a() {
            z99 z99Var = CoreModule.f18264c.f20414p0;
            z99Var.f203455V = !z99Var.f203455V;
        }

        @Override // p153l.x20
        public void call() {
            this.f39126a.clear();
            this.f39126a.add(jyb.m147494Y("toggleUltra模式，当前：" + CoreModule.f18264c.f20414p0.f203455V, new x20() { // from class: l.gdd
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9237e0.m60476a();
                }
            }));
            ArrayList arrayList = this.f39126a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = this.f39127b;
            arrayList.add(jyb.m147494Y(LinkAction.deeplink, new x20() { // from class: l.hdd
                @Override // p153l.x20
                public final void call() {
                    nae0.m162083m(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), Uri.parse("tantan://intlPurchase/premium?skuDuration=3m&autoPay=true"));
                }
            }));
            this.f39127b.act().showDebugMenu(this.f39126a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$e1 */
    public class C9238e1 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39128a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39129b;

        public C9238e1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39128a = arrayList;
            this.f39129b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.x20
        public void call() {
            this.f39128a.clear();
            this.f39128a.add(jyb.m147494Y("超级喜欢pup", new x20() { // from class: l.red
                @Override // p153l.x20
                public final void call() {
                    z5h0.m218675j().f203051i.m137019l(Boolean.TRUE);
                }
            }));
            this.f39128a.add(jyb.m147494Y("TA已认证头像为本人哦~ show", new x20() { // from class: l.sed
                @Override // p153l.x20
                public final void call() {
                    CoreModule.f18264c.f20381e0.f89310q2.put(Boolean.FALSE);
                }
            }));
            this.f39129b.act().showDebugMenu(this.f39128a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$e2 */
    public class C9239e2 implements x20 {
        @Override // p153l.x20
        public void call() {
            CoreModule.f18264c.f20381e0.f89320r5.clear();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$f */
    public class C9240f implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39130a;

        public C9240f(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39130a = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.x20
        public void call() {
            this.f39130a.act().startActivity(CoreModule.m30930K().mo31843yp(this.f39130a.getContext(), CoreModule.f18264c.f20381e0.m116600p9().f56859id, "from_questions_answers", false, true, false, RelationshipStatus.get("unknown_"), 273, false, true, false, ReminderAction.photo));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$f0 */
    public class C9241f0 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39131a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39132b;

        public C9241f0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39131a = arrayList;
            this.f39132b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.x20
        public void call() {
            this.f39131a.clear();
            this.f39131a.add(jyb.m147494Y("清除气泡频控", new x20() { // from class: l.idd
                @Override // p153l.x20
                public final void call() {
                    CoreModule.f18264c.f20381e0.f89052I6.clear();
                }
            }));
            this.f39132b.act().showDebugMenu(this.f39131a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$f1 */
    public class C9242f1 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39133a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39134b;

        public C9242f1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39133a = arrayList;
            this.f39134b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.x20
        public void call() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$f2 */
    public class C9243f2 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39135a;

        public C9243f2(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39135a = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.x20
        public void call() {
            FakeGuideData fakeGuideDataNew_ = FakeGuideData.new_();
            fakeGuideDataNew_.changeAvatar = true;
            fakeGuideDataNew_.type = "mainAvatar";
            fakeGuideDataNew_.identifier = CoreModule.f18264c.f20381e0.m116600p9().picture(0).cover().url;
            a0g.m95366V(this.f39135a.act(), fakeGuideDataNew_);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$g */
    public class C9244g implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39136a;

        public C9244g(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39136a = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.x20
        public void call() {
            aw90.m100562F().m100621i0(this.f39136a.act());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$g0 */
    public class C9245g0 implements qcj<vg60<Conversation>, Conversation> {
        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Conversation call(vg60<Conversation> vg60Var) {
            for (Conversation conversation : vg60Var.f184001a) {
                if (conversation._id > 0 && TextUtils.equals(conversation.convType, "default") && TEnum.equals(conversation.status, "default")) {
                    return conversation;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$g1 */
    public class C9246g1 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39137a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39138b;

        public C9246g1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39137a = arrayList;
            this.f39138b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m60482a() {
            DebugUtil.f39103e.put(-1);
            DebugUtil.f39102d.put(Boolean.FALSE);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m60483b() {
            jxd0 jxd0Var = DebugUtil.f39102d;
            jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        }

        @Override // p153l.x20
        public void call() {
            this.f39137a.clear();
            this.f39137a.add(jyb.m147494Y("开启检测" + DebugUtil.f39102d.get(), new x20() { // from class: l.ted
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9246g1.m60483b();
                }
            }));
            this.f39137a.add(jyb.m147494Y("立即检测：" + DebugUtil.f39103e.get(), new x20() { // from class: l.ued
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.f39103e.put(0);
                }
            }));
            this.f39137a.add(jyb.m147494Y("重置检测逻辑：", new x20() { // from class: l.ved
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9246g1.m60482a();
                }
            }));
            this.f39138b.act().showDebugMenu(this.f39137a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$g2 */
    public class C9247g2 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39139a;

        public C9247g2(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39139a = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.x20
        public void call() {
            FakeGuideData fakeGuideDataNew_ = FakeGuideData.new_();
            fakeGuideDataNew_.changeAvatar = true;
            fakeGuideDataNew_.type = "otherAvatar";
            fakeGuideDataNew_.identifier = CoreModule.f18264c.f20381e0.m116600p9().picture(1).url;
            a0g.m95366V(this.f39139a.act(), fakeGuideDataNew_);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$h */
    public class C9248h implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39140a;

        public C9248h(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39140a = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.x20
        public void call() {
            y1i0.m213948M(this.f39140a.act(), true, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$h0 */
    public class C9249h0 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39141a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39142b;

        public C9249h0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39141a = arrayList;
            this.f39142b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m60485a(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
            SalvagePopUser salvagePopUserNew_ = SalvagePopUser.new_();
            salvagePopUserNew_.salvagePopUserType = SalvagePopUserType.get(SalvagePopUserType.rightSwipe);
            salvagePopUserNew_.user = userM116593na;
            SalvagePopUser salvagePopUserNew_2 = SalvagePopUser.new_();
            salvagePopUserNew_2.salvagePopUserType = SalvagePopUserType.get("see");
            salvagePopUserNew_2.user = userM116593na;
            ArrayList arrayList = new ArrayList();
            arrayList.add(salvagePopUserNew_);
            arrayList.add(salvagePopUserNew_);
            arrayList.add(salvagePopUserNew_2);
            arrayList.add(salvagePopUserNew_2);
            slp.INSTANCE.m186615i(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), true, arrayList, null, null, null);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m60486b() {
            CoreModule.f18264c.f20314H2.f80710R.clear();
            CoreModule.f18264c.f20314H2.f80711S.clear();
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m60487c(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
            SalvagePopUser salvagePopUserNew_ = SalvagePopUser.new_();
            salvagePopUserNew_.salvagePopUserType = SalvagePopUserType.get(SalvagePopUserType.rightSwipe);
            salvagePopUserNew_.user = userM116593na;
            ArrayList arrayList = new ArrayList();
            arrayList.add(salvagePopUserNew_);
            slp.INSTANCE.m186615i(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), false, arrayList, null, null, null);
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m60488d(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
            SalvagePopUser salvagePopUserNew_ = SalvagePopUser.new_();
            salvagePopUserNew_.salvagePopUserType = SalvagePopUserType.get(SalvagePopUserType.rightSwipe);
            salvagePopUserNew_.user = userM116593na;
            SalvagePopUser salvagePopUserNew_2 = SalvagePopUser.new_();
            salvagePopUserNew_2.salvagePopUserType = SalvagePopUserType.get("see");
            salvagePopUserNew_2.user = userM116593na;
            ArrayList arrayList = new ArrayList();
            arrayList.add(salvagePopUserNew_);
            arrayList.add(salvagePopUserNew_);
            arrayList.add(salvagePopUserNew_2);
            arrayList.add(salvagePopUserNew_2);
            fbp.INSTANCE.m124913i(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), false, arrayList, null, null, null, null);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m60489e(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
            SalvagePopUser salvagePopUserNew_ = SalvagePopUser.new_();
            salvagePopUserNew_.salvagePopUserType = SalvagePopUserType.get(SalvagePopUserType.rightSwipe);
            salvagePopUserNew_.user = userM116593na;
            SalvagePopUser salvagePopUserNew_2 = SalvagePopUser.new_();
            salvagePopUserNew_2.salvagePopUserType = SalvagePopUserType.get("see");
            salvagePopUserNew_2.user = userM116593na;
            ArrayList arrayList = new ArrayList();
            arrayList.add(salvagePopUserNew_);
            arrayList.add(salvagePopUserNew_);
            arrayList.add(salvagePopUserNew_);
            arrayList.add(salvagePopUserNew_2);
            arrayList.add(salvagePopUserNew_2);
            arrayList.add(salvagePopUserNew_2);
            fbp.INSTANCE.m124913i(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), true, arrayList, null, null, null, null);
        }

        @Override // p153l.x20
        public void call() {
            this.f39141a.clear();
            this.f39141a.add(jyb.m147494Y("国际化 会员挽回弹窗缓存清空", new x20() { // from class: l.jdd
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9249h0.m60486b();
                }
            }));
            ArrayList arrayList = this.f39141a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = this.f39142b;
            arrayList.add(jyb.m147494Y("premium 挽回弹窗", new x20() { // from class: l.kdd
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9249h0.m60489e(viewTreeObserverOnGlobalLayoutListenerC8017b);
                }
            }));
            ArrayList arrayList2 = this.f39141a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = this.f39142b;
            arrayList2.add(jyb.m147494Y("premium 挽回弹窗大", new x20() { // from class: l.ldd
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9249h0.m60488d(viewTreeObserverOnGlobalLayoutListenerC8017b2);
                }
            }));
            ArrayList arrayList3 = this.f39141a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b3 = this.f39142b;
            arrayList3.add(jyb.m147494Y("ultra 挽回弹窗小", new x20() { // from class: l.mdd
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9249h0.m60485a(viewTreeObserverOnGlobalLayoutListenerC8017b3);
                }
            }));
            ArrayList arrayList4 = this.f39141a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b4 = this.f39142b;
            arrayList4.add(jyb.m147494Y("ultra 挽回弹窗大", new x20() { // from class: l.ndd
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9249h0.m60487c(viewTreeObserverOnGlobalLayoutListenerC8017b4);
                }
            }));
            this.f39142b.act().showDebugMenu(this.f39141a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$h1 */
    public class C9250h1 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39143a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39144b;

        public C9250h1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39143a = arrayList;
            this.f39144b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.x20
        public void call() {
            this.f39143a.clear();
            this.f39143a.add(jyb.m147494Y("清除聊天助手相关本地缓存", new x20() { // from class: l.wed
                @Override // p153l.x20
                public final void call() {
                    CoreModule.f18264c.f20353U1.f98890R.clear();
                }
            }));
            this.f39144b.act().showDebugMenu(this.f39143a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$h2 */
    public class C9251h2 implements x20 {
        @Override // p153l.x20
        public void call() {
            jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89211d5;
            jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$i */
    public class C9252i implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39145a;

        public C9252i(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39145a = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.x20
        public void call() {
            this.f39145a.act().startActivity(TagGuidePicAct.m51955Z1(this.f39145a.act(), true, "from_upload_pic", "from_complete_equity_guide_card"));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$i0 */
    public class C9253i0 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39146a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39147b;

        public C9253i0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39146a = arrayList;
            this.f39147b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.x20
        public void call() {
            this.f39146a.clear();
            ArrayList arrayList = this.f39146a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = this.f39147b;
            arrayList.add(jyb.m147494Y("支付 vip 升级 svip", new x20() { // from class: l.odd
                @Override // p153l.x20
                public final void call() {
                    ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                    new hso(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE).m137007p(aso.m99953h(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), viewTreeObserverOnGlobalLayoutListenerC8017b2.act() != null ? viewTreeObserverOnGlobalLayoutListenerC8017b2.act().iap().m103295i() : null), false, "test_high_vip_upgrade_to_premium_1mo");
                }
            }));
            ArrayList arrayList2 = this.f39146a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = this.f39147b;
            arrayList2.add(jyb.m147494Y("svip 升级购买时长选择弹窗", new x20() { // from class: l.pdd
                @Override // p153l.x20
                public final void call() {
                    new bmp.C16056f(viewTreeObserverOnGlobalLayoutListenerC8017b2.act()).m105244c("p_knowmyself_purchase,e_knowmyself_test,click").m105247f(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE).m105248g();
                }
            }));
            ArrayList arrayList3 = this.f39146a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b3 = this.f39147b;
            arrayList3.add(jyb.m147494Y("svip 订阅页升级购买时长选择弹窗", new x20() { // from class: l.qdd
                @Override // p153l.x20
                public final void call() {
                    new bmp.C16056f(viewTreeObserverOnGlobalLayoutListenerC8017b3.act()).m105244c("p_knowmyself_purchase,e_knowmyself_test,click").m105247f(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE).m105245d(true).m105248g();
                }
            }));
            ArrayList arrayList4 = this.f39146a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b4 = this.f39147b;
            arrayList4.add(jyb.m147494Y("ultra 升级购买时长选择弹窗", new x20() { // from class: l.rdd
                @Override // p153l.x20
                public final void call() {
                    new bmp.C16056f(viewTreeObserverOnGlobalLayoutListenerC8017b4.act()).m105244c("p_knowmyself_purchase,e_knowmyself_test,click").m105247f(PurchaseType.TYPE_ULTRA_PREMIUM).m105248g();
                }
            }));
            ArrayList arrayList5 = this.f39146a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b5 = this.f39147b;
            arrayList5.add(jyb.m147494Y("ultra 订阅页升级购买时长选择弹窗", new x20() { // from class: l.sdd
                @Override // p153l.x20
                public final void call() {
                    new bmp.C16056f(viewTreeObserverOnGlobalLayoutListenerC8017b5.act()).m105244c("p_knowmyself_purchase,e_knowmyself_test,click").m105247f(PurchaseType.TYPE_ULTRA_PREMIUM).m105245d(true).m105248g();
                }
            }));
            this.f39147b.act().showDebugMenu(this.f39146a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$i1 */
    public class C9254i1 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39148a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39149b;

        public C9254i1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39148a = arrayList;
            this.f39149b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m60496a(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            CoreModule.f18264c.f20356V1.f150516S = new ArrayList();
            for (int i = 0; i < 9; i++) {
                C4883c c4883c = CoreModule.f18264c;
                c4883c.f20356V1.f150516S.add(c4883c.f20381e0.m116600p9());
            }
            ln40.m154956f().m154961j(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), CoreModule.f18264c.f20356V1.f150516S);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m60497b(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            CoreModule.f18264c.f20356V1.f150515R = new ArrayList();
            List<CoreSuggested.UserInfo> list = CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded;
            UserIdType userIdTypeNew_ = UserIdType.new_();
            userIdTypeNew_.userId = list.get(0).f20214id;
            CoreModule.f18264c.f20356V1.f150515R.add(userIdTypeNew_);
            if (viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2().mo39812d() instanceof NewNewProfileCard) {
                NewNewProfileCard newNewProfileCard = (NewNewProfileCard) viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2().mo39812d();
                newNewProfileCard.f22460M2 = false;
                newNewProfileCard.m37824H3();
            }
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m60498c() {
            jxd0 jxd0Var = CoreModule.f18264c.f20356V1.f150519V;
            jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m60499d() {
            jxd0 jxd0Var = CoreModule.f18264c.f20356V1.f150518U;
            jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m60501f() {
            CoreModule.f18264c.f20356V1.f150516S = new ArrayList();
            for (int i = 0; i < 9; i++) {
                C4883c c4883c = CoreModule.f18264c;
                c4883c.f20356V1.f150516S.add(c4883c.f20381e0.m116600p9());
            }
            ConversationsList.f25822t1.m137019l(uxj0.f181467a);
        }

        @Override // p153l.x20
        public void call() {
            this.f39148a.clear();
            this.f39148a.add(jyb.m147494Y("实验1开关: " + CoreModule.f18264c.f20356V1.f150518U.get(), new x20() { // from class: l.xed
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9254i1.m60499d();
                }
            }));
            this.f39148a.add(jyb.m147494Y("实验2开关: " + CoreModule.f18264c.f20356V1.f150519V.get(), new x20() { // from class: l.yed
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9254i1.m60498c();
                }
            }));
            this.f39148a.add(jyb.m147494Y("模拟新用户", new x20() { // from class: l.zed
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9254i1.m60501f();
                }
            }));
            ArrayList arrayList = this.f39148a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = this.f39149b;
            arrayList.add(jyb.m147494Y("划卡迎新bubble", new x20() { // from class: l.afd
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9254i1.m60496a(viewTreeObserverOnGlobalLayoutListenerC8017b);
                }
            }));
            this.f39148a.add(jyb.m147494Y("清除迎新相关本地数据", new x20() { // from class: l.bfd
                @Override // p153l.x20
                public final void call() {
                    CoreModule.f18264c.f20356V1.f150520W.clear();
                }
            }));
            ArrayList arrayList2 = this.f39148a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = this.f39149b;
            arrayList2.add(jyb.m147494Y("划卡迎新tip", new x20() { // from class: l.cfd
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9254i1.m60497b(viewTreeObserverOnGlobalLayoutListenerC8017b2);
                }
            }));
            ArrayList arrayList3 = this.f39148a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b3 = this.f39149b;
            arrayList3.add(jyb.m147494Y("打开欢迎页", new x20() { // from class: l.dfd
                @Override // p153l.x20
                public final void call() {
                    ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b4 = viewTreeObserverOnGlobalLayoutListenerC8017b3;
                    viewTreeObserverOnGlobalLayoutListenerC8017b4.act().startActivity(new Intent(viewTreeObserverOnGlobalLayoutListenerC8017b4.act(), (Class<?>) NewUserBatchGreetAct.class));
                }
            }));
            this.f39149b.act().showDebugMenu(this.f39148a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$i2 */
    public class C9255i2 implements x20 {
        @Override // p153l.x20
        public void call() {
            jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89038G5;
            jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$j */
    public class C9256j implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39150a;

        public C9256j(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39150a = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.x20
        public void call() {
            this.f39150a.act().startActivity(TagGuidePicAct.m51955Z1(this.f39150a.act(), true, "from_upload_pic", "from_complete_equity_guide"));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$j0 */
    public class C9257j0 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39151a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39152b;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$j0$a */
        public class a implements x20 {
            public a() {
            }

            @Override // p153l.x20
            public void call() {
                CoreModule.f18264c.f20381e0.f89080M6.clear();
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$j0$b */
        public class b implements x20 {
            public b() {
            }

            @Override // p153l.x20
            public void call() {
                gta.m132210e().m132214d().mo34761Ud(C9257j0.this.f39152b.act());
            }
        }

        public C9257j0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39151a = arrayList;
            this.f39152b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.x20
        public void call() {
            this.f39151a.clear();
            ArrayList arrayList = this.f39151a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = this.f39152b;
            arrayList.add(jyb.m147494Y("tribe 划卡页", new x20() { // from class: l.tdd
                @Override // p153l.x20
                public final void call() {
                    ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                    viewTreeObserverOnGlobalLayoutListenerC8017b2.act().startActivity(IntlTribeSwipeAct.m40528Y1(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), "pursue", IntlPurpose.short_term_fun, IntlPurpose.short_term_fun, "https://auto.tancdn.com/v1/images/eyJpZCI6IjhCRDkzRjE5QkQ0MzQ5RDU4N0JCNTQ3NzQwRTBGMzhEIiwidyI6MTIwLCJoIjoxMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNzQ1MTAyODQzNTQ3NjQ4LCJwdCI6MjAyNTA2MTMxOH0.png", "https://auto.tancdn.com/v1/images/eyJpZCI6IjU0NTA3MkQ2N0MwQTRFN0ZCOEY0QzY2OTUzQUE1ODY1IiwidyI6NzUwLCJoIjoxNjI0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzQ4MzU1MDEyNjY2NDAwMDcxNiwicHQiOjIwMjUwNjEzMTh9.png"));
                }
            }));
            this.f39151a.add(jyb.m147494Y("清除气泡频控", new a()));
            this.f39151a.add(jyb.m147494Y("交友目的弹窗", new b()));
            this.f39152b.act().showDebugMenu(this.f39151a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$j1 */
    public class C9258j1 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39155a;

        public C9258j1(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39155a = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m60504a(bkj0 bkj0Var) {
        }

        @Override // p153l.x20
        public void call() {
            uqb0.f180386R.m184738a(((BitmapDrawable) this.f39155a.act().getResources().getDrawable(dbc0.f86710Wt)).getBitmap()).subscribe(psd0.m173597H(new y20() { // from class: l.efd
                @Override // p153l.y20
                public final void call(Object obj) {
                    DebugUtil.C9258j1.m60504a((bkj0) obj);
                }
            }, new y20() { // from class: l.ffd
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((Throwable) obj).toString();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$j2 */
    public class C9259j2 implements x20 {
        @Override // p153l.x20
        public void call() {
            CoreModule.f18264c.f20381e0.f89024E5.clear();
            CoreModule.f18264c.f20381e0.f89017D5.clear();
            CoreModule.f18264c.f20381e0.f89031F5.clear();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$k */
    public class C9260k implements x20 {
        @Override // p153l.x20
        public void call() {
            esc0.m122314a(esc0.f95589e);
            esc0.m122314a(esc0.f95590f);
            esc0.m122314a(esc0.f95591g);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$k0 */
    public class C9261k0 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39156a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39157b;

        public C9261k0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39156a = arrayList;
            this.f39157b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.x20
        public void call() {
            this.f39156a.clear();
            this.f39156a.add(jyb.m147494Y("清除红点记录", new x20() { // from class: l.udd
                @Override // p153l.x20
                public final void call() {
                    CoreModule.f18264c.f20381e0.f89073L6.put(Boolean.FALSE);
                }
            }));
            this.f39157b.act().showDebugMenu(this.f39156a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$k1 */
    public class C9262k1 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39158a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39159b;

        public C9262k1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39158a = arrayList;
            this.f39159b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.x20
        public void call() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$k2 */
    public class C9263k2 implements y20<User> {
        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(User user) {
            user.toJson().toString();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$l */
    public class C9264l implements x20 {
        @Override // p153l.x20
        public void call() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$l0 */
    public class C9265l0 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39160a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39161b;

        public C9265l0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39160a = arrayList;
            this.f39161b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.x20
        public void call() {
            this.f39160a.clear();
            this.f39160a.add(jyb.m147494Y("清除频控", new x20() { // from class: l.vdd
                @Override // p153l.x20
                public final void call() {
                    CoreModule.f18264c.f20381e0.f89066K6.put(Boolean.FALSE);
                }
            }));
            this.f39161b.act().showDebugMenu(this.f39160a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$l1 */
    public class C9266l1 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39162a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39163b;

        public C9266l1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39162a = arrayList;
            this.f39163b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.x20
        public void call() {
            this.f39162a.clear();
            this.f39162a.add(jyb.m147494Y("清除boost引导相关本地数据", new x20() { // from class: l.gfd
                @Override // p153l.x20
                public final void call() {
                    q83.m175748d().m175749a();
                }
            }));
            ArrayList arrayList = this.f39162a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = this.f39163b;
            arrayList.add(jyb.m147494Y("boost新引导弹窗", new x20() { // from class: l.hfd
                @Override // p153l.x20
                public final void call() {
                    new m93(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "p_home,accelerate_guide").show();
                }
            }));
            ArrayList arrayList2 = this.f39162a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = this.f39163b;
            arrayList2.add(jyb.m147494Y("boost结束底部弹窗", new x20() { // from class: l.ifd
                @Override // p153l.x20
                public final void call() {
                    C21545y9.INSTANCE.m214804s(viewTreeObserverOnGlobalLayoutListenerC8017b2.act());
                }
            }));
            this.f39162a.add(jyb.m147494Y("插入boost引导卡", new x20() { // from class: l.jfd
                @Override // p153l.x20
                public final void call() {
                    q83.m175748d().m175752e();
                }
            }));
            ArrayList arrayList3 = this.f39162a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b3 = this.f39163b;
            arrayList3.add(jyb.m147494Y("boost引导入口push", new x20() { // from class: l.kfd
                @Override // p153l.x20
                public final void call() {
                    q83.m175748d().m175760m(viewTreeObserverOnGlobalLayoutListenerC8017b3.act());
                }
            }));
            this.f39163b.act().showDebugMenu(this.f39162a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$l2 */
    public class C9267l2 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39164a;

        public C9267l2(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39164a = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.x20
        public void call() {
            this.f39164a.act().startActivity(AvatarForceChangeAct.m57261a2(this.f39164a.act(), 1, BuildConfig.BUILD_TYPE));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$m */
    public class C9268m implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39165a;

        public C9268m(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39165a = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.x20
        public void call() {
            this.f39165a.act().startActivity(new Intent(this.f39165a.act(), (Class<?>) DebugFontWeightAct.class));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$m0 */
    public class C9269m0 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39166a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39167b;

        public C9269m0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39166a = arrayList;
            this.f39167b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.x20
        public void call() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$m1 */
    public class RunnableC9270m1 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            CoreModule.f18264c.f20381e0.f89242h4.m137019l(uxj0.f181467a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$m2 */
    public class C9271m2 implements x20 {
        @Override // p153l.x20
        public void call() {
            CoreModule.f18264c.f20294B0.f20501g0.clear();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$n */
    public class C9272n implements x20 {
        @Override // p153l.x20
        public void call() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$n0 */
    public class C9273n0 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39168a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39169b;

        public C9273n0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39168a = arrayList;
            this.f39169b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m60514a() {
            CoreModule.f18264c.f20381e0.f89022E3.put("");
            w20.m204492g();
            CoreModule.f18264c.f20381e0.f89022E3.put("");
        }

        @Override // p153l.x20
        public void call() {
            this.f39168a.clear();
            this.f39168a.add(jyb.m147494Y("滑卡限制", new x20() { // from class: l.wdd
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9273n0.m60514a();
                }
            }));
            this.f39169b.act().showDebugMenu(this.f39168a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$n1 */
    public class C9274n1 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39170a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39171b;

        public C9274n1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39170a = arrayList;
            this.f39171b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m60515a() {
            if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.f89056J3)) {
                CoreModule.f18264c.f20381e0.f89056J3.put("momocv");
            }
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m60516b() {
            if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.f89056J3)) {
                CoreModule.f18264c.f20381e0.f89056J3.put("tencent");
            }
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m60517c() {
            if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.f89056J3)) {
                CoreModule.f18264c.f20381e0.f89056J3.put("aliyunIntl");
            }
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m60518d() {
            if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.f89056J3)) {
                CoreModule.f18264c.f20381e0.f89056J3.put("tencentIntl");
            }
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m60519e() {
            if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.f89056J3)) {
                CoreModule.f18264c.f20381e0.f89056J3.put("volcEnginePro");
            }
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m60520f() {
            if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.f89056J3)) {
                CoreModule.f18264c.f20381e0.f89056J3.put("aliyun");
            }
        }

        @Override // p153l.x20
        public void call() {
            this.f39170a.clear();
            this.f39170a.add(jyb.m147494Y("阿里", new x20() { // from class: l.lfd
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9274n1.m60520f();
                }
            }));
            this.f39170a.add(jyb.m147494Y("腾讯", new x20() { // from class: l.mfd
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9274n1.m60516b();
                }
            }));
            this.f39170a.add(jyb.m147494Y("腾讯国际化", new x20() { // from class: l.nfd
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9274n1.m60518d();
                }
            }));
            this.f39170a.add(jyb.m147494Y("陌陌", new x20() { // from class: l.ofd
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9274n1.m60515a();
                }
            }));
            this.f39170a.add(jyb.m147494Y("火山", new x20() { // from class: l.pfd
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9274n1.m60519e();
                }
            }));
            this.f39170a.add(jyb.m147494Y("阿里国际化", new x20() { // from class: l.qfd
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9274n1.m60517c();
                }
            }));
            this.f39171b.act().showDebugMenu(this.f39170a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$n2 */
    public class C9275n2 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b240 f39172a;

        public C9275n2(b240 b240Var) {
            this.f39172a = b240Var;
        }

        @Override // p153l.x20
        public void call() {
            bdr.m103629g(this.f39172a.m101951T4(), null, null);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$o */
    public class C9276o implements x20 {
        @Override // p153l.x20
        public void call() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$o0 */
    public class C9277o0 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39173a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39174b;

        public C9277o0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39173a = arrayList;
            this.f39174b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m60521a() {
            jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f88994A3;
            Boolean bool = Boolean.TRUE;
            jxd0Var.put(bool);
            CoreModule.f18264c.f20381e0.f89001B3.put(bool);
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m60523c() {
            CoreModule.f18264c.f20381e0.f89122S3.put(Boolean.FALSE);
            CoreModule.f18264c.f20381e0.f89130T3.put(0);
        }

        @Override // p153l.x20
        public void call() {
            this.f39173a.clear();
            this.f39173a.add(jyb.m147494Y("清空tip标记", new x20() { // from class: l.xdd
                @Override // p153l.x20
                public final void call() {
                    CoreModule.f18264c.f20381e0.f89374z3.put(Boolean.TRUE);
                }
            }));
            this.f39173a.add(jyb.m147494Y("清空撤回记录", new x20() { // from class: l.ydd
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9277o0.m60523c();
                }
            }));
            this.f39173a.add(jyb.m147494Y("启动处理一次", new x20() { // from class: l.zdd
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9277o0.m60521a();
                }
            }));
            this.f39174b.act().showDebugMenu(this.f39173a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$o1 */
    public class C9278o1 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39175a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39176b;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$o1$a */
        public class a implements x20 {
            public a() {
            }

            @Override // p153l.x20
            public void call() {
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$o1$b */
        public class b implements x20 {
            public b() {
            }

            @Override // p153l.x20
            public void call() {
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$o1$c */
        public class c implements x20 {
            public c() {
            }

            @Override // p153l.x20
            public void call() {
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$o1$d */
        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public C9278o1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39175a = arrayList;
            this.f39176b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        /* JADX INFO: renamed from: A */
        public static /* synthetic */ void m60524A(View view) {
        }

        /* JADX INFO: renamed from: F */
        public static /* synthetic */ void m60529F(final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            AppealInfo appealInfo = new AppealInfo();
            appealInfo.appeal_count = 0;
            appealInfo.status = OMSSwipeMoment.before;
            wxf.m208408e().m208410g(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), new Runnable() { // from class: l.tgd
                @Override // java.lang.Runnable
                public final void run() {
                    ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                    f5g.m124131i(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), viewTreeObserverOnGlobalLayoutListenerC8017b2.m38344q2(), PutongAct.REQUEST_CODE_PICKER);
                }
            }, appealInfo);
        }

        /* JADX INFO: renamed from: J */
        public static /* synthetic */ void m60533J() {
        }

        /* JADX INFO: renamed from: K */
        public static /* synthetic */ void m60534K(View view) {
        }

        /* JADX INFO: renamed from: L */
        public static /* synthetic */ void m60535L(View view) {
        }

        /* JADX INFO: renamed from: M */
        public static /* synthetic */ void m60536M(View view) {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m60542a(View view) {
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m60544c(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            C8077u c8077u = new C8077u();
            c8077u.f22795a.put(0);
            c8077u.f22796b.put(0L);
            baj.m103202o();
            baj.m103187a0(CoreModule.m30930K().me_(), viewTreeObserverOnGlobalLayoutListenerC8017b.act(), null, "swipe_card");
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m60545d(View view) {
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m60546e(View view) {
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m60547f(View view) {
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ void m60548g(View view) {
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ void m60549h(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            LinearLayout linearLayout = new LinearLayout(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            linearLayout.setGravity(16);
            linearLayout.setPadding(qa00.m175859d(12.0f), qa00.m175859d(12.0f), qa00.m175859d(20.0f), qa00.m175859d(12.0f));
            View vIcon = new VIcon(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(qa00.m175859d(28.0f), qa00.m175859d(28.0f));
            layoutParams.rightMargin = qa00.m175859d(8.0f);
            vIcon.setLayoutParams(layoutParams);
            vIcon.setBackgroundResource(dbc0.f87455tm);
            linearLayout.addView(vIcon);
            VText vText = new VText(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            vText.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            vText.setTextColor(viewTreeObserverOnGlobalLayoutListenerC8017b.act().getResources().getColor(c9c0.f80424i));
            vText.setTextSize(15.0f);
            vText.setTypeface(lyh0.m156283c(3), 1);
            vText.setText("资料已提交，待审核通过后生效");
            linearLayout.addView(vText);
            llb0.m154703c().m154710i(new SimplePushBubble.C4523a(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), linearLayout).m22163B(1).m22175z(CorePopLevel.TEST).m22168s());
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ void m60550i(View view) {
        }

        /* JADX INFO: renamed from: n */
        public static /* synthetic */ void m60555n(View view) {
        }

        /* JADX INFO: renamed from: o */
        public static /* synthetic */ void m60556o(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            Message message = new Message();
            message.value = "XXXX";
            message.messageType = MessageType.get("text");
            message.cid = "1";
            ibb.m139303b(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), rum.m183205c(CoreModule.f18264c.f20381e0.m116600p9(), message));
        }

        /* JADX INFO: renamed from: r */
        public static /* synthetic */ void m60559r(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            uyf uyfVar = new uyf(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            uyfVar.m198611C(CoreModule.f18264c.f20381e0.m116537Z7(), false, "p_suggest_users_home_view");
            uyfVar.show();
        }

        /* JADX INFO: renamed from: s */
        public static /* synthetic */ void m60560s(View view) {
        }

        /* JADX INFO: renamed from: u */
        public static /* synthetic */ void m60562u(View view) {
        }

        /* JADX INFO: renamed from: z */
        public static /* synthetic */ void m60567z(View view) {
        }

        /* JADX INFO: renamed from: S */
        public final /* synthetic */ void m60568S(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            qtk.m178019d1(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), new a());
        }

        /* JADX INFO: renamed from: T */
        public final /* synthetic */ void m60569T(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            CoreDlg.m46237c2(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), new b(), new c());
        }

        /* JADX INFO: renamed from: U */
        public final /* synthetic */ void m60570U(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            qtk.m177985M0(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), new d());
        }

        @Override // p153l.x20
        public void call() {
            this.f39175a.clear();
            ArrayList arrayList = this.f39175a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = this.f39176b;
            arrayList.add(jyb.m147494Y("无标题1", new x20() { // from class: l.rfd
                @Override // p153l.x20
                public final void call() {
                    new th0.C20312a(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m191148g(false).m191151j("文字内容").m191159r("按钮").m191156o(new View.OnClickListener() { // from class: l.lgd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C9278o1.m60567z(view);
                        }
                    }).m191147f("按钮").m191144c(new View.OnClickListener() { // from class: l.mgd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C9278o1.m60545d(view);
                        }
                    }).m191142a().m191141g();
                }
            }));
            ArrayList arrayList2 = this.f39175a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = this.f39176b;
            arrayList2.add(jyb.m147494Y("无标题2", new x20() { // from class: l.tfd
                @Override // p153l.x20
                public final void call() {
                    new th0.C20312a(viewTreeObserverOnGlobalLayoutListenerC8017b2.act()).m191148g(false).m191151j("文字内容文字内容文字内容文字内容文字内容文字").m191159r("按钮").m191156o(new View.OnClickListener() { // from class: l.rgd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C9278o1.m60550i(view);
                        }
                    }).m191147f("按钮").m191144c(new View.OnClickListener() { // from class: l.sgd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C9278o1.m60534K(view);
                        }
                    }).m191142a().m191141g();
                }
            }));
            ArrayList arrayList3 = this.f39175a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b3 = this.f39176b;
            arrayList3.add(jyb.m147494Y("无标题3  3行", new x20() { // from class: l.dgd
                @Override // p153l.x20
                public final void call() {
                    new th0.C20312a(viewTreeObserverOnGlobalLayoutListenerC8017b3.act()).m191148g(false).m191151j("文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容").m191159r("按钮").m191156o(new View.OnClickListener() { // from class: l.zgd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C9278o1.m60536M(view);
                        }
                    }).m191147f("按钮").m191144c(new View.OnClickListener() { // from class: l.ahd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C9278o1.m60524A(view);
                        }
                    }).m191142a().m191141g();
                }
            }));
            ArrayList arrayList4 = this.f39175a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b4 = this.f39176b;
            arrayList4.add(jyb.m147494Y("无标题3  4行", new x20() { // from class: l.egd
                @Override // p153l.x20
                public final void call() {
                    new th0.C20312a(viewTreeObserverOnGlobalLayoutListenerC8017b4.act()).m191148g(false).m191151j("文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容").m191159r("按钮").m191156o(new View.OnClickListener() { // from class: l.bhd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C9278o1.m60546e(view);
                        }
                    }).m191147f("按钮").m191144c(new View.OnClickListener() { // from class: l.chd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C9278o1.m60547f(view);
                        }
                    }).m191142a().m191141g();
                }
            }));
            ArrayList arrayList5 = this.f39175a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b5 = this.f39176b;
            arrayList5.add(jyb.m147494Y("无标题4 超出4行", new x20() { // from class: l.fgd
                @Override // p153l.x20
                public final void call() {
                    new th0.C20312a(viewTreeObserverOnGlobalLayoutListenerC8017b5.act()).m191148g(false).m191151j("文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容").m191159r("按钮").m191156o(new View.OnClickListener() { // from class: l.wgd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C9278o1.m60542a(view);
                        }
                    }).m191147f("按钮").m191144c(new View.OnClickListener() { // from class: l.xgd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C9278o1.m60535L(view);
                        }
                    }).m191142a().m191141g();
                }
            }));
            ArrayList arrayList6 = this.f39175a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b6 = this.f39176b;
            arrayList6.add(jyb.m147494Y("有标题1 ", new x20() { // from class: l.ggd
                @Override // p153l.x20
                public final void call() {
                    new th0.C20312a(viewTreeObserverOnGlobalLayoutListenerC8017b6.act()).m191160s("标题").m191148g(false).m191151j("文字内容").m191159r("按钮").m191156o(new View.OnClickListener() { // from class: l.ugd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C9278o1.m60562u(view);
                        }
                    }).m191147f("按钮").m191144c(new View.OnClickListener() { // from class: l.vgd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C9278o1.m60560s(view);
                        }
                    }).m191142a().m191141g();
                }
            }));
            ArrayList arrayList7 = this.f39175a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b7 = this.f39176b;
            arrayList7.add(jyb.m147494Y("有标题2 ", new x20() { // from class: l.hgd
                @Override // p153l.x20
                public final void call() {
                    new th0.C20312a(viewTreeObserverOnGlobalLayoutListenerC8017b7.act()).m191160s("标题").m191148g(false).m191151j("文字内容文字内容文字内容文字内容文字内容文字内容").m191159r("按钮").m191156o(new View.OnClickListener() { // from class: l.pgd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C9278o1.m60548g(view);
                        }
                    }).m191147f("按钮").m191144c(new View.OnClickListener() { // from class: l.qgd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C9278o1.m60555n(view);
                        }
                    }).m191142a().m191141g();
                }
            }));
            ArrayList arrayList8 = this.f39175a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b8 = this.f39176b;
            arrayList8.add(jyb.m147494Y("PopupDialog 1 ", new x20() { // from class: l.igd
                @Override // p153l.x20
                public final void call() {
                    new jl80.C17971a(viewTreeObserverOnGlobalLayoutListenerC8017b8.act()).m146056y0("标题").m146051t0("文字文字文字文字文字文字文字文字文字文字文字文字文字文字文字文字文字文字文字文字").m146028W("xxxx").m146033b0("yyyy").m146049r0();
                }
            }));
            ArrayList arrayList9 = this.f39175a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b9 = this.f39176b;
            arrayList9.add(jyb.m147494Y("PopupDialog 2 ", new x20() { // from class: l.jgd
                @Override // p153l.x20
                public final void call() {
                    new jl80.C17971a(viewTreeObserverOnGlobalLayoutListenerC8017b9.act()).m146056y0("标题").m146051t0("文字文字文字文字文字文字文字文字文字文字文字文字文字文字文").m146033b0("按钮").m146049r0();
                }
            }));
            ArrayList arrayList10 = this.f39175a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b10 = this.f39176b;
            arrayList10.add(jyb.m147494Y("PopupDialog 3 ", new x20() { // from class: l.kgd
                @Override // p153l.x20
                public final void call() {
                    new jl80.C17971a(viewTreeObserverOnGlobalLayoutListenerC8017b10.act()).m146024S(dbc0.f86355Lq).m146056y0("标题").m146033b0("按钮").m146049r0();
                }
            }));
            ArrayList arrayList11 = this.f39175a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b11 = this.f39176b;
            arrayList11.add(jyb.m147494Y("PopupDialog 4 ", new x20() { // from class: l.cgd
                @Override // p153l.x20
                public final void call() {
                    new jl80.C17971a(viewTreeObserverOnGlobalLayoutListenerC8017b11.act()).m146024S(dbc0.f86355Lq).m146056y0("标题").m146051t0("描述文字描述文字").m146033b0("按钮").m146049r0();
                }
            }));
            ArrayList arrayList12 = this.f39175a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b12 = this.f39176b;
            arrayList12.add(jyb.m147494Y("PopupDialog 5 ", new x20() { // from class: l.ngd
                @Override // p153l.x20
                public final void call() {
                    new jl80.C17971a(viewTreeObserverOnGlobalLayoutListenerC8017b12.act()).m146024S(dbc0.f86355Lq).m146056y0("标题").m146051t0("描述文字描述文字").m146033b0("按钮").m146028W("文字").m146049r0();
                }
            }));
            ArrayList arrayList13 = this.f39175a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b13 = this.f39176b;
            arrayList13.add(jyb.m147494Y("PopupDialog 6 ", new x20() { // from class: l.ygd
                @Override // p153l.x20
                public final void call() {
                    new jl80.C17971a(viewTreeObserverOnGlobalLayoutListenerC8017b13.act()).m146024S(dbc0.f86355Lq).m146056y0("标题").m146051t0("描述文字描述文字").m146033b0("按钮1").m146038g0("按钮2").m146028W("文字").m146049r0();
                }
            }));
            ArrayList arrayList14 = this.f39175a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b14 = this.f39176b;
            arrayList14.add(jyb.m147494Y("PopupDialog 7 ", new x20() { // from class: l.dhd
                @Override // p153l.x20
                public final void call() {
                    new jl80.C17971a(viewTreeObserverOnGlobalLayoutListenerC8017b14.act()).m146024S(dbc0.f86355Lq).m146056y0("标题").m146051t0("描述文字描述文字").m146042k0("我同意腾讯、阿里、陌陌将采集我的面部信息并与头像比对，详见《真实头像认证协议》").m146033b0("按钮1").m146028W("文字").m146049r0();
                }
            }));
            ArrayList arrayList15 = this.f39175a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b15 = this.f39176b;
            arrayList15.add(jyb.m147494Y("PopupDialog 协议更新通知 ", new x20() { // from class: l.ehd
                @Override // p153l.x20
                public final void call() {
                    kx80.m151821m(viewTreeObserverOnGlobalLayoutListenerC8017b15.act(), true);
                }
            }));
            ArrayList arrayList16 = this.f39175a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b16 = this.f39176b;
            arrayList16.add(jyb.m147494Y("PopupDialog 功能全新升级 ", new x20() { // from class: l.fhd
                @Override // p153l.x20
                public final void call() {
                    upm.m197141f0(viewTreeObserverOnGlobalLayoutListenerC8017b16.act(), TabName.Card, null);
                }
            }));
            ArrayList arrayList17 = this.f39175a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b17 = this.f39176b;
            arrayList17.add(jyb.m147494Y("PopupDialog 分享新功能 1 ", new x20() { // from class: l.ghd
                @Override // p153l.x20
                public final void call() {
                    this.f104114a.m60568S(viewTreeObserverOnGlobalLayoutListenerC8017b17);
                }
            }));
            ArrayList arrayList18 = this.f39175a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b18 = this.f39176b;
            arrayList18.add(jyb.m147494Y("PopupDialog 分享新功能 2 ", new x20() { // from class: l.hhd
                @Override // p153l.x20
                public final void call() {
                    this.f109876a.m60569T(viewTreeObserverOnGlobalLayoutListenerC8017b18);
                }
            }));
            ArrayList arrayList19 = this.f39175a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b19 = this.f39176b;
            arrayList19.add(jyb.m147494Y("PopupDialog 别错过TA的消息 ", new x20() { // from class: l.ihd
                @Override // p153l.x20
                public final void call() {
                    iz40.m142760E(viewTreeObserverOnGlobalLayoutListenerC8017b19.act(), new x20() { // from class: l.ogd
                        @Override // p153l.x20
                        public final void call() {
                            DebugUtil.C9278o1.m60533J();
                        }
                    }, null);
                }
            }));
            ArrayList arrayList20 = this.f39175a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b20 = this.f39176b;
            arrayList20.add(jyb.m147494Y("PopupDialog 你离开后任 ", new x20() { // from class: l.sfd
                @Override // p153l.x20
                public final void call() {
                    this.f167687a.m60570U(viewTreeObserverOnGlobalLayoutListenerC8017b20);
                }
            }));
            ArrayList arrayList21 = this.f39175a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b21 = this.f39176b;
            arrayList21.add(jyb.m147494Y("PopupDialog 真人实名认证 创建群 ", new x20() { // from class: l.ufd
                @Override // p153l.x20
                public final void call() {
                    jek.m144589u(viewTreeObserverOnGlobalLayoutListenerC8017b21.act());
                }
            }));
            ArrayList arrayList22 = this.f39175a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b22 = this.f39176b;
            arrayList22.add(jyb.m147494Y("PopupDialog  别着急，等%s回复后再继续聊天 ", new x20() { // from class: l.vfd
                @Override // p153l.x20
                public final void call() {
                    tcz.m190528F(viewTreeObserverOnGlobalLayoutListenerC8017b22.act(), CoreModule.f18264c.f20381e0.m116600p9());
                }
            }));
            ArrayList arrayList23 = this.f39175a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b23 = this.f39176b;
            arrayList23.add(jyb.m147494Y("Dialog 引导上传生活照", new x20() { // from class: l.wfd
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9278o1.m60559r(viewTreeObserverOnGlobalLayoutListenerC8017b23);
                }
            }));
            ArrayList arrayList24 = this.f39175a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b24 = this.f39176b;
            arrayList24.add(jyb.m147494Y("Dialog 新交友目的 新弹框", new x20() { // from class: l.xfd
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9278o1.m60544c(viewTreeObserverOnGlobalLayoutListenerC8017b24);
                }
            }));
            ArrayList arrayList25 = this.f39175a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b25 = this.f39176b;
            arrayList25.add(new pf60("Dialog 网图Fake弹窗", new x20() { // from class: l.yfd
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9278o1.m60529F(viewTreeObserverOnGlobalLayoutListenerC8017b25);
                }
            }));
            ArrayList arrayList26 = this.f39175a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b26 = this.f39176b;
            arrayList26.add(new pf60("push 超级喜欢", new x20() { // from class: l.zfd
                @Override // p153l.x20
                public final void call() {
                    z5h0.m218665L(viewTreeObserverOnGlobalLayoutListenerC8017b26.act());
                }
            }));
            ArrayList arrayList27 = this.f39175a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b27 = this.f39176b;
            arrayList27.add(new pf60("push 消息已经发送", new x20() { // from class: l.agd
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9278o1.m60556o(viewTreeObserverOnGlobalLayoutListenerC8017b27);
                }
            }));
            ArrayList arrayList28 = this.f39175a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b28 = this.f39176b;
            arrayList28.add(new pf60("资料已经提交", new x20() { // from class: l.bgd
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9278o1.m60549h(viewTreeObserverOnGlobalLayoutListenerC8017b28);
                }
            }));
            this.f39176b.act().showDebugMenu(this.f39175a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$p */
    public class C9279p implements x20 {
        @Override // p153l.x20
        public void call() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$p0 */
    public class C9280p0 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39181a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39182b;

        public C9280p0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39181a = arrayList;
            this.f39182b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m60571a() {
            jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89193b3;
            jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        }

        @Override // p153l.x20
        public void call() {
            this.f39181a.clear();
            this.f39181a.add(jyb.m147494Y("实验组，当前：".concat(CoreModule.f18264c.f20381e0.f89193b3.get().booleanValue() ? "true" : "false"), new x20() { // from class: l.aed
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9280p0.m60571a();
                }
            }));
            this.f39182b.act().showDebugMenu(this.f39181a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$p1 */
    public class C9281p1 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39183a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39184b;

        public C9281p1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39183a = arrayList;
            this.f39184b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m60572a() {
            CoreModule.f18264c.f20381e0.f89095P0.clear();
            CoreModule.f18264c.f20381e0.f89088O0.clear();
            CoreModule.f18264c.f20381e0.f89077M3.clear();
            CoreModule.f18264c.f20381e0.f89070L3.clear();
            CoreModule.f18264c.f20381e0.f89063K3.clear();
            CoreModule.f18264c.f20381e0.f89015D3.clear();
            CoreModule.f18264c.f20381e0.f89008C3.clear();
        }

        @Override // p153l.x20
        public void call() {
            this.f39183a.clear();
            this.f39183a.add(jyb.m147494Y("清除相关本地数据", new x20() { // from class: l.jhd
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9281p1.m60572a();
                }
            }));
            this.f39184b.act().showDebugMenu(this.f39183a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$q */
    public class C9282q implements x20 {
        @Override // p153l.x20
        public void call() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$q0 */
    public class C9283q0 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39185a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39186b;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$q0$a */
        public class a implements y20<Boolean> {
            public a() {
            }

            @Override // p153l.y20
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(Boolean bool) {
            }
        }

        public C9283q0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39185a = arrayList;
            this.f39186b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m60573a() {
            jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89201c3;
            jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public /* synthetic */ void m60575c(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            upm.m197109F(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), false, true, "xxx", new a());
        }

        @Override // p153l.x20
        public void call() {
            this.f39185a.clear();
            this.f39185a.add(jyb.m147494Y("实验组，当前：".concat(CoreModule.f18264c.f20381e0.f89201c3.get().booleanValue() ? "true" : "false"), new x20() { // from class: l.bed
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9283q0.m60573a();
                }
            }));
            ArrayList arrayList = this.f39185a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = this.f39186b;
            arrayList.add(jyb.m147494Y(" 非svpi 弹svpi", new x20() { // from class: l.ced
                @Override // p153l.x20
                public final void call() {
                    this.f81338a.m60575c(viewTreeObserverOnGlobalLayoutListenerC8017b);
                }
            }));
            this.f39186b.act().showDebugMenu(this.f39185a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$q1 */
    public class C9284q1 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39188a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39189b;

        public C9284q1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39188a = arrayList;
            this.f39189b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m60577a() {
            CoreModule.f18264c.f20381e0.f89098P3.clear();
            CoreModule.f18264c.f20381e0.f89106Q3.clear();
        }

        @Override // p153l.x20
        public void call() {
            this.f39188a.clear();
            this.f39188a.add(jyb.m147494Y("清空频控", new x20() { // from class: l.khd
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9284q1.m60577a();
                }
            }));
            this.f39189b.act().showDebugMenu(this.f39188a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$r */
    public class RunnableC9285r implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39190a;

        public RunnableC9285r(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39190a = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // java.lang.Runnable
        public void run() {
            jch0 jch0Var = new jch0(this.f39190a.act());
            jch0Var.show();
            och0.m167217c(this.f39190a.act(), jch0Var);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$r0 */
    public class C9286r0 implements y20<Conversation> {
        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Conversation conversation) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$r1 */
    public class C9287r1 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39191a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39192b;

        public C9287r1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39191a = arrayList;
            this.f39192b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m60579a() {
            CoreModule.f18264c.f20384f0.f20725v1.clear();
            CoreModule.f18264c.f20384f0.f20722u1.clear();
            CoreModule.f18264c.f20384f0.f20719t1.clear();
            CoreModule.f18264c.f20384f0.f20584A1.clear();
        }

        @Override // p153l.x20
        public void call() {
            this.f39191a.clear();
            this.f39191a.add(jyb.m147494Y("清楚本地数据", new x20() { // from class: l.lhd
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9287r1.m60579a();
                }
            }));
            this.f39192b.act().showDebugMenu(this.f39191a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$s */
    public class RunnableC9288s implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39193a;

        public RunnableC9288s(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39193a = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // java.lang.Runnable
        public void run() {
            ChatPartners chatPartnersNew_ = ChatPartners.new_();
            User userMe_ = CoreModule.m30930K().me_();
            chatPartnersNew_.users.add(userMe_);
            chatPartnersNew_.users.add(userMe_);
            chatPartnersNew_.users.add(userMe_);
            ChatPartnerText chatPartnerTextNew_ = ChatPartnerText.new_();
            chatPartnerTextNew_.value = "11111111111111111";
            ChatPartnerText chatPartnerTextNew_2 = ChatPartnerText.new_();
            chatPartnerTextNew_2.value = "22222222222222222";
            ChatPartnerText chatPartnerTextNew_3 = ChatPartnerText.new_();
            chatPartnerTextNew_3.value = "3333333333333333";
            ChatPartnerText chatPartnerTextNew_4 = ChatPartnerText.new_();
            chatPartnerTextNew_4.value = "44444444444444";
            chatPartnersNew_.texts.add(chatPartnerTextNew_);
            chatPartnersNew_.texts.add(chatPartnerTextNew_2);
            chatPartnersNew_.texts.add(chatPartnerTextNew_3);
            chatPartnersNew_.texts.add(chatPartnerTextNew_4);
            new y2g0(this.f39193a.act()).m214075W(chatPartnersNew_);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$s0 */
    public class C9289s0 implements y20<User> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39194a;

        public C9289s0(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39194a = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(User user) {
            rfe0.m181170b(this.f39194a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$s1 */
    public class C9290s1 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39195a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39196b;

        public C9290s1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39195a = arrayList;
            this.f39196b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.x20
        public void call() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$t */
    public class RunnableC9291t implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f39197a;

        /* JADX INFO: renamed from: b */
        public TextView f39198b;

        /* JADX INFO: renamed from: c */
        public kcg0 f39199c = C22421c.interval(1, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.ddd
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f87921a.m60584d((Long) obj);
            }
        }));

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CounterLikeLimit f39200d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39201e;

        public RunnableC9291t(CounterLikeLimit counterLikeLimit, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39200d = counterLikeLimit;
            this.f39201e = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m60584d(Long l2) {
            m60587g();
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m60585e() {
            this.f39199c.unsubscribe();
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m60586f(DialogInterface dialogInterface) {
            this.f39199c.unsubscribe();
        }

        /* JADX INFO: renamed from: g */
        public void m60587g() {
            Dialog dialog;
            long jResetNowMillis = this.f39200d.resetNowMillis();
            if (jResetNowMillis <= 0 && (dialog = this.f39197a) != null) {
                dialog.cancel();
            }
            String strM193664b = tzi0.m193664b(jResetNowMillis);
            TextView textView = this.f39198b;
            if (textView != null) {
                textView.setText(strM193664b);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog dialogM21567z0 = this.f39201e.act().dialog().m21506G0(this.f39201e.act().getString(R$string.f18630L3, Integer.valueOf(this.f39200d.total))).m21503F(this.f39201e.act().getString(R$string.f18599K3, Integer.valueOf(this.f39200d.total))).m21556u().m21552s().m21532c0(dbc0.f87133ju).m21559v0("", new Runnable() { // from class: l.edd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f93504a.m60585e();
                }
            }).m21561w0(this.f39201e.act().getResources().getDrawable(dbc0.f87166ku)).m21493A(new DialogInterface.OnCancelListener() { // from class: l.fdd
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f98454a.m60586f(dialogInterface);
                }
            }).m21567z0();
            this.f39197a = dialogM21567z0;
            TextView textViewM105519J0 = bnl0.m105519J0(dialogM21567z0.m21464Z());
            this.f39198b = textViewM105519J0;
            textViewM105519J0.setTextSize(0, textViewM105519J0.getTextSize() * 1.1f);
            m60587g();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$t0 */
    public class RunnableC9292t0 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            l9c.m153394o().m153397B(new x20() { // from class: l.ded
                @Override // p153l.x20
                public final void call() {
                    CoreModule.f18272k.f115543k.deleteAll();
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$t1 */
    public class RunnableC9293t1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ n55 f39202a;

        public RunnableC9293t1(n55 n55Var) {
            this.f39202a = n55Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            CityCBanner cityCBannerNew_ = CityCBanner.new_();
            cityCBannerNew_.cityName = "北京xx";
            this.f39202a.m161674K(1, null, cityCBannerNew_);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$u */
    public class C9294u implements y20<Boolean> {
        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$u0 */
    public class C9295u0 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39203a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39204b;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$u0$a */
        public class a implements x20 {
            public a() {
            }

            @Override // p153l.x20
            public void call() {
                CoreModule.f18264c.f20381e0.f89145V2.put(Boolean.TRUE);
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$u0$b */
        public class b implements x20 {
            public b() {
            }

            @Override // p153l.x20
            public void call() {
                PopGuide popGuide = new PopGuide();
                popGuide.userId = "50141";
                popGuide.guide = "我发布了新的动态";
                popGuide.icon = "https://imgoldjii.oss-cn-beijing.aliyuncs.com/7821672838116_.pic.jpg";
                C9295u0.this.f39204b.act().m40810d6().m41031z0(popGuide);
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$u0$c */
        public class c implements x20 {
            public c() {
            }

            @Override // p153l.x20
            public void call() {
                CoreModule.f18264c.f20381e0.f89137U2.clear();
                CoreModule.f18264c.f20381e0.f89105Q2.clear();
                CoreModule.f18264c.f20381e0.f89113R2.clear();
                CoreModule.f18264c.f20381e0.f89129T2.clear();
                CoreModule.f18264c.f20381e0.f89121S2.clear();
            }
        }

        public C9295u0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39203a = arrayList;
            this.f39204b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.x20
        public void call() {
            this.f39203a.clear();
            this.f39203a.add(jyb.m147494Y("开启实验组", new a()));
            this.f39203a.add(jyb.m147494Y("展示气泡", new b()));
            this.f39203a.add(jyb.m147494Y("清除频控", new c()));
            this.f39204b.act().showDebugMenu(this.f39203a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$u1 */
    public class RunnableC9296u1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ n55 f39208a;

        public RunnableC9296u1(n55 n55Var) {
            this.f39208a = n55Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            CityCData cityCDataNew_ = CityCData.new_();
            cityCDataNew_.userId = CoreModule.f18264c.f20381e0.m116600p9().f56859id;
            cityCDataNew_.expireAt = pzi0.m174454o() + 36000000;
            this.f39208a.m161674K(2, cityCDataNew_, null);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$v */
    public class C9297v implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39209a;

        public C9297v(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39209a = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.x20
        public void call() {
            ActionToastStyle actionToastStyle = new ActionToastStyle();
            actionToastStyle.styleId = "1";
            ActionToastStyleIcons actionToastStyleIcons = new ActionToastStyleIcons();
            actionToastStyleIcons.miniIcon = "online";
            actionToastStyle.icons = actionToastStyleIcons;
            actionToastStyle.toastLink = "tantanapp://sendMessage?uid=137071&msg=早上好";
            actionToastStyle.mainImg = CoreModule.f18264c.f20381e0.m116600p9().m61308fp().url;
            actionToastStyle.title = "林青霞";
            actionToastStyle.message = "当前在线，打个招呼吧";
            actionToastStyle.showClose = false;
            ActionToastStyleButton actionToastStyleButton = new ActionToastStyleButton();
            actionToastStyleButton.showButton = true;
            actionToastStyleButton.buttonMessage = "[爱心]早上好";
            actionToastStyleButton.buttonBackground = "white";
            actionToastStyleButton.buttonLink = "tantanapp://sendMessage?uid=137071&msg=早上好";
            ArrayList arrayList = new ArrayList();
            arrayList.add(actionToastStyleButton);
            actionToastStyle.buttons = arrayList;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("swipe");
            actionToastStyle.localReportId = "123456";
            actionToastStyle.scenes = arrayList2;
            actionToastStyle.showTime = 5000;
            actionToastStyle.business = "female_online";
            ActionData actionDataNew_ = ActionData.new_();
            actionDataNew_.toastStyle = actionToastStyle;
            y2h0.m214080g().m214087k(this.f39209a, actionDataNew_);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$v0 */
    public class C9298v0 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39210a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39211b;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$v0$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39212a;

            public a(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
                this.f39212a = viewTreeObserverOnGlobalLayoutListenerC8017b;
            }

            @Override // java.lang.Runnable
            public void run() {
                User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
                userM116600p9.f56859id = "132375";
                userM116600p9.name = "昵称";
                userM116600p9.description = "爱生活，爱运动，爱美食\r\n爱旅行、爱逛家具店";
                wgx.m206283A().m206311K(this.f39212a.act(), userM116600p9, true);
            }
        }

        public C9298v0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39210a = arrayList;
            this.f39211b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m60590a() {
            jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89185a3;
            jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m60591b(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            userM116600p9.f56859id = "132375";
            userM116600p9.name = "昵称";
            userM116600p9.description = "爱生活，爱运动，爱美食\n爱旅行、爱逛家具店";
            wgx.m206283A().m206311K(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), userM116600p9, false);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m60594e() {
            jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89319r4;
            jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public /* synthetic */ void m60595f(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            for (int i = 0; i < 5; i++) {
                l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), new a(viewTreeObserverOnGlobalLayoutListenerC8017b), 200L);
            }
        }

        @Override // p153l.x20
        public void call() {
            this.f39210a.clear();
            this.f39210a.add(jyb.m147494Y("toggle实验组，当前：".concat(CoreModule.f18264c.f20381e0.f89185a3.get().booleanValue() ? "true" : "false"), new x20() { // from class: l.eed
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9298v0.m60590a();
                }
            }));
            this.f39210a.add(jyb.m147494Y("Ui优化实验：".concat(CoreModule.f18264c.f20381e0.f89319r4.get().booleanValue() ? "true" : "false"), new x20() { // from class: l.fed
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9298v0.m60594e();
                }
            }));
            ArrayList arrayList = this.f39210a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = this.f39211b;
            arrayList.add(jyb.m147494Y("弹出弹窗", new x20() { // from class: l.ged
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9298v0.m60591b(viewTreeObserverOnGlobalLayoutListenerC8017b);
                }
            }));
            ArrayList arrayList2 = this.f39210a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = this.f39211b;
            arrayList2.add(jyb.m147494Y("连续弹出弹出", new x20() { // from class: l.hed
                @Override // p153l.x20
                public final void call() {
                    this.f109141a.m60595f(viewTreeObserverOnGlobalLayoutListenerC8017b2);
                }
            }));
            this.f39210a.add(jyb.m147494Y("弹出先发like弹窗", new x20() { // from class: l.ied
                @Override // p153l.x20
                public final void call() {
                    wgx.m206283A().m206314N("137071");
                }
            }));
            this.f39211b.act().showDebugMenu(this.f39210a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$v1 */
    public class RunnableC9299v1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ n55 f39214a;

        public RunnableC9299v1(n55 n55Var) {
            this.f39214a = n55Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            CityCData cityCDataNew_ = CityCData.new_();
            cityCDataNew_.userId = CoreModule.f18264c.f20381e0.m116600p9().f56859id;
            cityCDataNew_.viewCount = 10001;
            cityCDataNew_.recievedLikeCount = PlaybackException.ERROR_CODE_DRM_UNSPECIFIED;
            this.f39214a.m161674K(3, cityCDataNew_, null);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$w */
    public class C9300w implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39215a;

        public C9300w(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39215a = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.x20
        public void call() {
            ActionToastStyle actionToastStyle = new ActionToastStyle();
            actionToastStyle.styleId = "1";
            ActionToastStyleIcons actionToastStyleIcons = new ActionToastStyleIcons();
            actionToastStyleIcons.miniIcon = "online";
            actionToastStyle.icons = actionToastStyleIcons;
            actionToastStyle.toastLink = "tantanapp://sendMessage?uid=137071&msg=早上好";
            actionToastStyle.mainImg = CoreModule.f18264c.f20381e0.m116600p9().m61308fp().url;
            actionToastStyle.title = "林青霞";
            actionToastStyle.message = "当前在线，打个招呼吧";
            actionToastStyle.showClose = false;
            actionToastStyle.localReportId = "123456";
            ActionToastStyleButton actionToastStyleButton = new ActionToastStyleButton();
            actionToastStyleButton.showButton = true;
            actionToastStyleButton.buttonMessage = "[爱心]早上好";
            actionToastStyleButton.buttonBackground = "white";
            actionToastStyleButton.buttonLink = "tantanapp://sendMessage?uid=137071&msg=早上好";
            ArrayList arrayList = new ArrayList();
            arrayList.add(actionToastStyleButton);
            actionToastStyle.buttons = arrayList;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("swipe");
            actionToastStyle.scenes = arrayList2;
            actionToastStyle.showTime = 5000;
            actionToastStyle.business = "female_recall";
            ActionData actionDataNew_ = ActionData.new_();
            actionDataNew_.toastStyle = actionToastStyle;
            y2h0.m214080g().m214087k(this.f39215a, actionDataNew_);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$w0 */
    public class C9301w0 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39216a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39217b;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$w0$a */
        public class a implements x20 {
            public a() {
            }

            @Override // p153l.x20
            public void call() {
                ActionToastStyle actionToastStyle = new ActionToastStyle();
                actionToastStyle.styleId = "1";
                ActionToastStyleIcons actionToastStyleIcons = new ActionToastStyleIcons();
                actionToastStyleIcons.miniIcon = "online";
                actionToastStyle.icons = actionToastStyleIcons;
                actionToastStyle.toastLink = "";
                actionToastStyle.mainImg = CoreModule.f18264c.f20381e0.m116600p9().m61308fp().url;
                actionToastStyle.title = "林青霞";
                actionToastStyle.message = "当前在线，打个招呼吧";
                actionToastStyle.showClose = false;
                ActionToastStyleButton actionToastStyleButton = new ActionToastStyleButton();
                actionToastStyleButton.showButton = true;
                actionToastStyleButton.buttonMessage = "[爱心]早上好";
                actionToastStyleButton.buttonBackground = "white";
                actionToastStyleButton.buttonLink = "tantanapp://sendMessage?uid=137071&msg=早上好";
                ArrayList arrayList = new ArrayList();
                arrayList.add(actionToastStyleButton);
                actionToastStyle.buttons = arrayList;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("swipe");
                actionToastStyle.scenes = arrayList2;
                actionToastStyle.showTime = 5000;
                actionToastStyle.business = "666";
                ActionData actionDataNew_ = ActionData.new_();
                actionDataNew_.toastStyle = actionToastStyle;
                y2h0.m214080g().m214087k(C9301w0.this.f39217b, actionDataNew_);
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$w0$b */
        public class b implements x20 {
            public b() {
            }

            @Override // p153l.x20
            public void call() {
                ActionToastStyle actionToastStyle = new ActionToastStyle();
                actionToastStyle.styleId = "1";
                ActionToastStyleIcons actionToastStyleIcons = new ActionToastStyleIcons();
                actionToastStyleIcons.miniIcon = "online";
                actionToastStyle.icons = actionToastStyleIcons;
                actionToastStyle.toastLink = "";
                actionToastStyle.title = "林青霞";
                actionToastStyle.mainImg = CoreModule.f18264c.f20381e0.m116600p9().m61308fp().url;
                actionToastStyle.message = "当前在线，打个招呼吧";
                actionToastStyle.showClose = true;
                ActionToastStyleButton actionToastStyleButton = new ActionToastStyleButton();
                actionToastStyleButton.showButton = true;
                actionToastStyleButton.buttonMessage = "[爱心]早上好";
                actionToastStyleButton.buttonBackground = "white";
                actionToastStyleButton.buttonLink = "tantanapp://jumpChat?uid=137071&showKeyboard=true&appendMsg=早上好";
                ArrayList arrayList = new ArrayList();
                arrayList.add(actionToastStyleButton);
                actionToastStyle.buttons = arrayList;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("swipe");
                actionToastStyle.scenes = arrayList2;
                actionToastStyle.showTime = 5000;
                actionToastStyle.business = "666";
                ActionData actionDataNew_ = ActionData.new_();
                actionDataNew_.toastStyle = actionToastStyle;
                y2h0.m214080g().m214087k(C9301w0.this.f39217b, actionDataNew_);
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$w0$c */
        public class c implements x20 {
            public c() {
            }

            @Override // p153l.x20
            public void call() {
                ActionToastStyle actionToastStyle = new ActionToastStyle();
                actionToastStyle.styleId = "1";
                ActionToastStyleIcons actionToastStyleIcons = new ActionToastStyleIcons();
                actionToastStyleIcons.miniIcon = "online";
                actionToastStyle.icons = actionToastStyleIcons;
                actionToastStyle.toastLink = "";
                actionToastStyle.mainImg = CoreModule.f18264c.f20381e0.m116600p9().m61308fp().url;
                actionToastStyle.title = "林青霞";
                actionToastStyle.message = "当前在线，打个招呼吧";
                actionToastStyle.showClose = true;
                ActionToastStyleButton actionToastStyleButton = new ActionToastStyleButton();
                actionToastStyleButton.showButton = true;
                actionToastStyleButton.buttonMessage = "早上好";
                actionToastStyleButton.buttonBackground = LiveVoiceInternalEntryBean.TYPE_BG_STYLE_ORANGE;
                actionToastStyleButton.buttonLink = "tantanapp://jumpChat?uid=137071&autoSendMsg=早上好";
                ArrayList arrayList = new ArrayList();
                arrayList.add(actionToastStyleButton);
                actionToastStyle.buttons = arrayList;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("swipe");
                actionToastStyle.scenes = arrayList2;
                actionToastStyle.showTime = 5000;
                actionToastStyle.business = "666";
                ActionData actionDataNew_ = ActionData.new_();
                actionDataNew_.toastStyle = actionToastStyle;
                y2h0.m214080g().m214087k(C9301w0.this.f39217b, actionDataNew_);
            }
        }

        public C9301w0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39216a = arrayList;
            this.f39217b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        @Override // p153l.x20
        public void call() {
            this.f39216a.clear();
            this.f39216a.add(jyb.m147494Y("弹出测试弹窗：deeplink发消息", new a()));
            this.f39216a.add(jyb.m147494Y("弹出测试弹窗：deeplink跳转聊天页，填入消息并弹起键盘", new b()));
            this.f39216a.add(jyb.m147494Y("弹出测试弹窗：deeplink跳转聊天页，自动发送消息", new c()));
            this.f39217b.act().showDebugMenu(this.f39216a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$w1 */
    public class RunnableC9302w1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ n55 f39221a;

        public RunnableC9302w1(n55 n55Var) {
            this.f39221a = n55Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f39221a.m161674K(5, null, null);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$x */
    public class C9303x implements y20<User> {
        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(User user) {
            Relationship relationshipNew_ = user.localRelationship;
            if (relationshipNew_ == null) {
                relationshipNew_ = Relationship.new_();
            }
            relationshipNew_.status.add(MatchFrom.get(MatchFrom.superLiked));
            user.localRelationship = relationshipNew_;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$x0 */
    public class C9304x0 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39222a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39223b;

        public C9304x0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39222a = arrayList;
            this.f39223b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m60597a() {
            jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89297o3;
            jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        }

        @Override // p153l.x20
        public void call() {
            this.f39222a.clear();
            this.f39222a.add(jyb.m147494Y("toggle实验组，当前：".concat(CoreModule.f18264c.f20381e0.f89297o3.get().booleanValue() ? "true" : "false"), new x20() { // from class: l.jed
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9304x0.m60597a();
                }
            }));
            this.f39223b.act().showDebugMenu(this.f39222a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$x1 */
    public class C9305x1 implements y20<CoreSuggested.UserInfo> {
        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(CoreSuggested.UserInfo userInfo) {
            if (userInfo != null) {
                CoreModule.f18264c.f20405m0.m32157w6(userInfo, 1);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$y */
    public class C9306y implements y20<User> {
        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(User user) {
            Relationship relationshipNew_ = user.localRelationship;
            if (relationshipNew_ == null) {
                relationshipNew_ = Relationship.new_();
            }
            if (relationshipNew_.relationshipExtensions == null) {
                relationshipNew_.relationshipExtensions = RelationshipExtensions.new_();
            }
            relationshipNew_.relationshipExtensions.otherLetter = "我对你说 哈哈哈哈哈 嘻嘻嘻嘻 啦啦啦啦 呱呱呱呱 ~~~~~~~~~~~~~~~~~~~~~~~~哈哈哈哈哈 嘻嘻嘻嘻 啦啦啦啦 呱呱呱呱 ~~~~~~~~~~~~~~~~~~~~~~~~哈哈哈哈哈 嘻嘻嘻嘻 啦啦啦啦 呱呱呱呱 ~~~~~~~~~~~~~~~~~~~~~~~~哈哈哈哈哈 嘻嘻嘻嘻 啦啦啦啦 呱呱呱呱 ~~~~~~~~~~~~~~~~~~~~~~~~哈哈哈哈哈 嘻嘻嘻嘻 啦啦啦啦 呱呱呱呱 ~~~~~~~~~~~~~~~~~~~~~~~~";
            relationshipNew_.status.add(MatchFrom.get("letter"));
            user.localRelationship = relationshipNew_;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$y0 */
    public class C9307y0 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39224a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39225b;

        public C9307y0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39224a = arrayList;
            this.f39225b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m60602c() {
            jxd0 jxd0Var = CoreModule.f18264c.f20405m0.f20203w1;
            jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m60603d() {
            jxd0 jxd0Var = CoreModule.f18264c.f20405m0.f20209y1;
            jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        }

        @Override // p153l.x20
        public void call() {
            this.f39224a.clear();
            this.f39224a.add(jyb.m147494Y("推荐卡片4变3张 开关：".concat(CoreModule.f18264c.f20405m0.f20203w1.get().booleanValue() ? "true" : "false"), new x20() { // from class: l.ked
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9307y0.m60602c();
                }
            }));
            this.f39224a.add(jyb.m147494Y("动态切卡：".concat(CoreModule.f18264c.f20405m0.f20209y1.get().booleanValue() ? "true" : "false"), new x20() { // from class: l.led
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9307y0.m60603d();
                }
            }));
            ArrayList arrayList = this.f39224a;
            final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = this.f39225b;
            arrayList.add(jyb.m147494Y("移走第一张", new x20() { // from class: l.med
                @Override // p153l.x20
                public final void call() {
                    viewTreeObserverOnGlobalLayoutListenerC8017b.act().postDelayed(new Runnable() { // from class: l.ned
                        @Override // java.lang.Runnable
                        public final void run() {
                            CoreModule.f18264c.f20405m0.m31989C8(BuildConfig.BUILD_TYPE);
                        }
                    }, 500L);
                }
            }));
            this.f39225b.act().showDebugMenu(this.f39224a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$y1 */
    public class RunnableC9308y1 implements Runnable {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$y1$a */
        public class a implements x20 {
            public a() {
            }

            @Override // p153l.x20
            public void call() {
                Conversation conversationQuery = CoreModule.f18272k.f115545m.query("fake_conversation_local_summary_marriage_conversation");
                long jM174454o = pzi0.m174454o();
                if (conversationQuery == null) {
                    conversationQuery = Conversation.new_();
                    conversationQuery.f56859id = "fake_conversation_local_summary_marriage_conversation";
                    double d = jM174454o;
                    conversationQuery.createdTime = d;
                    conversationQuery.latestTime = d;
                    conversationQuery.convType = "default";
                    conversationQuery.localEverHasMessage = true;
                    conversationQuery.unreadMessages = 2;
                } else {
                    conversationQuery.unreadMessages = 3;
                    conversationQuery.latestTime = jM174454o;
                }
                CoreModule.f18264c.f20384f0.m34053mq(conversationQuery);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            CoreModule.f18264c.f20351U.m128074a(new a());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$z */
    public class C9309z implements y20<User> {
        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(User user) {
            Location location = user.location;
            Passby passby = location.passby;
            if (passby != null) {
                passby.count = 10;
            } else {
                location.passby = Passby.new_();
                user.location.passby.count = 10;
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$z0 */
    public class C9310z0 implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f39227a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f39228b;

        public C9310z0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f39227a = arrayList;
            this.f39228b = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m60605a() {
            jxd0 jxd0Var = CoreModule.f18264c.f20384f0.f20707p1;
            jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        }

        @Override // p153l.x20
        public void call() {
            this.f39227a.clear();
            this.f39227a.add(jyb.m147494Y("历史消息cell激活 开关：".concat(CoreModule.f18264c.f20384f0.f20707p1.get().booleanValue() ? "true" : "false"), new x20() { // from class: l.oed
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.C9310z0.m60605a();
                }
            }));
            this.f39228b.act().showDebugMenu(this.f39227a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$z1 */
    public class RunnableC9311z1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ p55 f39229a;

        public RunnableC9311z1(p55 p55Var) {
            this.f39229a = p55Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f39229a.show();
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f39100b = new jxd0("chat_new_match_with_strategy", bool);
        f39101c = new jxd0("chat_new_match_without_strategy", bool);
        f39102d = new jxd0("refreshBanCard", bool);
        f39103e = new vxd0("refreshCardTime", -1);
        f39104f = false;
        f39105g = new vxd0("new_message_exp", 0);
        f39106h = new jxd0("click_to_end", bool);
        f39107i = new jxd0("debug_compliment_mock_enabled", bool);
        f39108j = new String[][]{new String[]{"received_paid", "paid", "0"}, new String[]{"received_free", "free", "1"}};
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m59337A() {
        String str;
        for (String str2 : m59892Zi()) {
            CoreModule.f18272k.f115545m.delete(str2);
            CoreModule.f18272k.f115535c.m189448J(str2);
        }
        for (String str3 : m59914aj()) {
            User userQuery = uqb0.f180405k0.f184355d.query(str3);
            if (userQuery != null && (str = userQuery.name) != null && str.startsWith("MockUser")) {
                uqb0.f180405k0.f184355d.delete(str3);
            }
        }
    }

    /* JADX INFO: renamed from: A1 */
    public static /* synthetic */ void m59339A1(String str) {
        try {
            CoreModule.f18264c.f20381e0.f89331t2.put(Double.valueOf(Double.parseDouble(str)));
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: A3 */
    public static /* synthetic */ void m59341A3(String str) {
        try {
            CoreModule.f18264c.f20381e0.f89032F6.put(Integer.valueOf(Integer.parseInt(str)));
        } catch (NumberFormatException unused) {
            o1j0.m165636j("输入错误");
        }
    }

    /* JADX INFO: renamed from: A5 */
    public static /* synthetic */ void m59343A5() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.AdCard;
        userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        List<OMSAdCardInfo> listM172576h = pk50.m172568j().m172576h();
        if (jyb.m147479J(listM172576h)) {
            return;
        }
        userInfo.extensionObject = listM172576h.get(0);
        CoreModule.f18264c.f20405m0.m32157w6(userInfo, 3);
        CoreModule.f18264c.f20405m0.f20114S1.put(userInfo, 3);
    }

    /* JADX INFO: renamed from: A6 */
    public static /* synthetic */ void m59344A6() {
        jxd0 jxd0Var = pza0.f154760a0;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: A7 */
    public static /* synthetic */ void m59345A7() {
        jxd0 jxd0Var = CoreModule.f18264c.f20446z2.f19969g0;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Aa */
    public static /* synthetic */ void m59348Aa() {
        jxd0 jxd0Var = CoreModule.f18264c.f20313H1.f97079g0;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Ad */
    public static /* synthetic */ void m59351Ad(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.SuperlikeGuideCard;
        userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), new Runnable() { // from class: l.x1d
            @Override // java.lang.Runnable
            public final void run() {
                h7d0.m133773i0().m133780j0();
            }
        }, 2000L);
    }

    /* JADX INFO: renamed from: Aj */
    public static void m59357Aj(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
    }

    /* JADX INFO: renamed from: Ak */
    public static void m59358Ak(User user, Act act) {
        Dialog.C4460e c4460eDialog = act.dialog();
        c4460eDialog.m21506G0("用户位置信息：" + user.name);
        StringBuilder sb = new StringBuilder("距离:");
        sb.append(user.location.distance);
        if (NullChecker.m82486a(user.location.region)) {
            sb.append("\n国家:");
            sb.append(user.location.region.country);
            sb.append("\n城市:");
            sb.append(user.location.region.city);
            sb.append("\n地区:");
            sb.append(user.location.region.district);
        }
        c4460eDialog.m21503F(sb.toString());
        c4460eDialog.m21567z0();
    }

    /* JADX INFO: renamed from: B1 */
    public static /* synthetic */ void m59361B1(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: B3 */
    public static /* synthetic */ void m59363B3() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.FemaleVerificationGuideCard;
        userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: B6 */
    public static /* synthetic */ void m59366B6(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("toggle实验组", new x20() { // from class: l.a5d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59993ea();
            }
        }));
        arrayList.add(jyb.m147494Y("toggle性别", new x20() { // from class: l.b5d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59614Md();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: B7 */
    public static /* synthetic */ void m59367B7(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        gm70 gm70Var = new gm70(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), CoreModule.f18264c.f20381e0.m116600p9(), SwipeDirection.UP);
        gm70Var.m126745x(CorePopLevel.PICKS_GUIDE);
        llb0.m154703c().m154710i(gm70Var);
    }

    /* JADX INFO: renamed from: B8 */
    public static /* synthetic */ void m59368B8() {
        jxd0 jxd0Var = pza0.f154738F;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        pza0.f154739G.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: B9 */
    public static /* synthetic */ void m59369B9(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        final CityCData cityCDataNew_ = CityCData.new_();
        cityCDataNew_.userId = CoreModule.m30929H().userId();
        cityCDataNew_.cardTag = "豪掷50000探币占领封面";
        l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), new Runnable() { // from class: l.qwc
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f18264c.f20392h2.f142916S.m137019l(cityCDataNew_);
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: Ba */
    public static /* synthetic */ void m59370Ba(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("VIP购买弹窗", new x20() { // from class: l.x2d
            @Override // p153l.x20
            public final void call() {
                C8927c.m54583I1(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "");
            }
        }));
        arrayList.add(jyb.m147494Y("SVIP购买弹窗", new x20() { // from class: l.y2d
            @Override // p153l.x20
            public final void call() {
                C8927c.m54685w0(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "");
            }
        }));
        arrayList.add(jyb.m147494Y("白金会员", new x20() { // from class: l.z2d
            @Override // p153l.x20
            public final void call() {
                C8927c.m54658n0(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "");
            }
        }));
        arrayList.add(jyb.m147494Y("黑金会员购买弹窗", new x20() { // from class: l.a3d
            @Override // p153l.x20
            public final void call() {
                C8927c.m54622a0(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "", null, null, null, Privilege.oDiamondGreetings);
            }
        }));
        arrayList.add(jyb.m147494Y("精选购买弹窗", new x20() { // from class: l.b3d
            @Override // p153l.x20
            public final void call() {
                C8927c.m54671r1(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "");
            }
        }));
        arrayList.add(jyb.m147494Y("每日心动购买弹窗", new x20() { // from class: l.c3d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60384w6(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("VIP过期弹窗", new x20() { // from class: l.d3d
            @Override // p153l.x20
            public final void call() {
                hl3.m135670M(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Bc */
    public static /* synthetic */ void m59372Bc() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89186a4;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        CoreModule.f18264c.f20381e0.f89027F1.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: Bd */
    public static /* synthetic */ void m59373Bd(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("购买对话框-VIP", new x20() { // from class: l.z1d
            @Override // p153l.x20
            public final void call() {
                new C8941c.a(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), PurchaseType.TYPE_GET_VIP, null).m55278h();
            }
        }));
        arrayList.add(jyb.m147494Y("购买对话框-SVIP", new x20() { // from class: l.d2d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59846Xe(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("购买对话框-黑金", new x20() { // from class: l.e2d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60317t5(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("购买对话框-白金", new x20() { // from class: l.f2d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59758Ta(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("购买对话框-加速配对", new x20() { // from class: l.g2d
            @Override // p153l.x20
            public final void call() {
                new C8941c.a(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), PurchaseType.TYPE_GET_ACCELERATE_PAIRING, null).m55278h();
            }
        }));
        arrayList.add(jyb.m147494Y("购买对话框-SVIP精选", new x20() { // from class: l.h2d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59527Id(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("购买对话框-精选", new x20() { // from class: l.i2d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60229p5(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("购买对话框-女性会员", new x20() { // from class: l.k2d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59928bb(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("购买对话框-VIP+SVIP-默认VIP", new x20() { // from class: l.l2d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59432E6(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("购买对话框-VIP+SVIP-默认SVIP", new x20() { // from class: l.m2d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60144l8(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("购买对话框-SVIP+ODiamond", new x20() { // from class: l.a2d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59643O0(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("VIP升级SVIP弹窗New", new x20() { // from class: l.b2d
            @Override // p153l.x20
            public final void call() {
                ol3.m168100h(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            }
        }));
        arrayList.add(jyb.m147494Y("SVIP升级黑金弹窗New", new x20() { // from class: l.c2d
            @Override // p153l.x20
            public final void call() {
                ol3.m168099g(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Be */
    public static /* synthetic */ void m59374Be() {
        jxd0 jxd0Var = C8291a.f26041f;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        CoreModule.f18264c.f20384f0.f20647V0.put("xxxurl=http://m.staging2.p1staff.com/app-pages/commerce/newuserguide?category=0");
        C4883c c4883c = CoreModule.f18264c;
        c4883c.f20384f0.f20641T0.put(gra.m131664c0(c4883c.f20381e0.m116600p9()));
        C4883c c4883c2 = CoreModule.f18264c;
        c4883c2.f20384f0.f20638S0.put(gra.m131651Z(c4883c2.f20381e0.m116600p9()));
    }

    /* JADX INFO: renamed from: Bh */
    public static /* synthetic */ void m59377Bh() {
        CoreModule.f18264c.f20406m1.m35725o4();
        o1j0.m165651y("已清除");
    }

    /* JADX INFO: renamed from: Bj */
    public static void m59379Bj(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("购买弹窗 空 sku 测试", new x20() { // from class: l.gqc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59634Nc();
            }
        }));
    }

    /* JADX INFO: renamed from: Bk */
    public static void m59380Bk(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("滑卡上滑push", new C9234d1(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: C1 */
    public static /* synthetic */ void m59383C1() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89375z4;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: C2 */
    public static /* synthetic */ void m59384C2(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        m59872Yj(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), true);
        m59872Yj(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), false);
    }

    /* JADX INFO: renamed from: C4 */
    public static /* synthetic */ void m59386C4(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("首页启动介绍弹窗", new x20() { // from class: l.ead
            @Override // p153l.x20
            public final void call() {
                new hei(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "").show();
            }
        }));
        arrayList.add(jyb.m147494Y("首页启动介绍弹窗清除本地记录", new x20() { // from class: l.fad
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59507Hf();
            }
        }));
        arrayList.add(jyb.m147494Y("购买弹窗", new x20() { // from class: l.gad
            @Override // p153l.x20
            public final void call() {
                C8927c.m54610T(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            }
        }));
        arrayList.add(jyb.m147494Y("全屏购买 - 探探信用分", new x20() { // from class: l.had
            @Override // p153l.x20
            public final void call() {
                new vdb0.C20815a(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m200962h(jyb.m147507f0(PurchaseType.TYPE_FEMALE_VIP), jyb.m147507f0(Privilege.pick_tantan_credits_users)).m200964j();
            }
        }));
        arrayList.add(jyb.m147494Y("全屏购买 - 解锁更了解他模块", new x20() { // from class: l.iad
            @Override // p153l.x20
            public final void call() {
                new vdb0.C20815a(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m200962h(jyb.m147507f0(PurchaseType.TYPE_FEMALE_VIP), jyb.m147507f0(Privilege.unlock_learn_about_him_module)).m200964j();
            }
        }));
        arrayList.add(jyb.m147494Y("全屏购买 - 隐私", new x20() { // from class: l.jad
            @Override // p153l.x20
            public final void call() {
                new vdb0.C20815a(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m200962h(jyb.m147507f0(PurchaseType.TYPE_FEMALE_VIP), jyb.m147507f0(Privilege.privacy_membership)).m200964j();
            }
        }));
        arrayList.add(jyb.m147494Y("全屏购买 - 广告免打扰", new x20() { // from class: l.kad
            @Override // p153l.x20
            public final void call() {
                new vdb0.C20815a(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m200962h(jyb.m147507f0(PurchaseType.TYPE_FEMALE_VIP), jyb.m147507f0(Privilege.ads_not_disturb)).m200964j();
            }
        }));
        arrayList.add(jyb.m147494Y("全屏购买 - 屏蔽骚扰词", new x20() { // from class: l.lad
            @Override // p153l.x20
            public final void call() {
                new vdb0.C20815a(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m200962h(jyb.m147507f0(PurchaseType.TYPE_FEMALE_VIP), jyb.m147507f0(Privilege.block_harassing_words)).m200964j();
            }
        }));
        arrayList.add(jyb.m147494Y("首页女性会员插卡", new x20() { // from class: l.nad
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59857Y4();
            }
        }));
        arrayList.add(jyb.m147494Y("清空女性会员引导卡的滑卡数据", new x20() { // from class: l.oad
            @Override // p153l.x20
            public final void call() {
                xei.m210680c().m210692m();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: C5 */
    public static /* synthetic */ void m59387C5(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        baj.m103184Y("marriage", CoreModule.m30930K().me_());
        baj.m103185Z(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "marriage", "找个人领证");
    }

    /* JADX INFO: renamed from: C6 */
    public static /* synthetic */ void m59388C6(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("插入消息taps：", new x20() { // from class: l.spc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60064hf(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("新版聊天升温：" + CoreModule.f18264c.f20381e0.f89324s2.get(), new x20() { // from class: l.tpc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59757T9();
            }
        }));
        arrayList.add(jyb.m147494Y("是否升温：" + CoreModule.f18264c.f20381e0.f89338u2.get(), new x20() { // from class: l.upc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60356v0();
            }
        }));
        arrayList.add(jyb.m147494Y("展示邀请", new x20() { // from class: l.vpc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                new t6f(viewTreeObserverOnGlobalLayoutListenerC8017b2.act()).m189525E(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), CoreModule.m30929H().userId());
            }
        }));
        arrayList.add(jyb.m147494Y("升温表情全量：" + CoreModule.f18264c.f20381e0.f89345v2.get(), new x20() { // from class: l.wpc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59514I0();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: C7 */
    public static /* synthetic */ void m59389C7() {
        CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded.get(1).payCardStyle = "chat";
        CoreModule.f18264c.f20405m0.f20136a0.m222761e().setRefreshValue(true);
        C22507a<PartialListOpt<CoreSuggested.UserInfo>> c22507a = CoreModule.f18264c.f20405m0.f20136a0;
        c22507a.m137019l(c22507a.m222761e().setReason(PartialListOpt.RefreshReason.NOTIFY_INNER));
    }

    /* JADX INFO: renamed from: Ca */
    public static /* synthetic */ void m59392Ca() {
        byd0 byd0Var = new byd0("marry_guide_dlg_show_date_" + CoreModule.m30929H().userId(), 0L);
        byd0 byd0Var2 = new byd0("marry_guide_dlg_show_times_" + CoreModule.m30929H().userId(), 0L);
        String str = "marry_guide_show_by_quality_" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        jxd0 jxd0Var = new jxd0(str, bool);
        byd0Var.put(0L);
        byd0Var2.put(0L);
        jxd0Var.put(bool);
        CoreModule.f18264c.f20381e0.f89092O4.put(0L);
        CoreModule.f18264c.f20381e0.f89050I4.put(bool);
        CoreModule.f18264c.f20381e0.f89057J4.put(0);
        CoreModule.f18264c.f20381e0.f89064K4.put(0L);
        CoreModule.f18264c.f20381e0.f89071L4.put(bool);
        CoreModule.f18264c.f20381e0.f89078M4.put(0);
    }

    /* JADX INFO: renamed from: Cb */
    public static /* synthetic */ void m59393Cb(pf60 pf60Var) {
        if (jyb.m147479J((Collection) pf60Var.f152156a)) {
            return;
        }
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.QuestionOfNotVerify;
        userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: Cd */
    public static /* synthetic */ void m59395Cd() {
        jxd0 jxd0Var = hcm.f108714i;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Ce */
    public static /* synthetic */ void m59396Ce() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f88995A4;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Ci */
    public static /* synthetic */ void m59400Ci(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        if (NullChecker.m82486a(viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2()) && NullChecker.m82486a(viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2().mo39812d())) {
            NewNewProfileCard newNewProfileCard = (NewNewProfileCard) viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2().mo39812d();
            uih0.m196223s0().m196257Z0(viewTreeObserverOnGlobalLayoutListenerC8017b, newNewProfileCard, newNewProfileCard.f22541v1, newNewProfileCard.f22479T);
        }
    }

    /* JADX INFO: renamed from: Cj */
    public static void m59401Cj(final Act act) {
        w1e.m204400d(act).m204419D(10).m204430r("输入插入Userid").m204421F(new y20() { // from class: l.tuc
            @Override // p153l.y20
            public final void call(Object obj) {
                l51.m152888H(act, new Runnable() { // from class: l.s1d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m59573Kf(str);
                    }
                }, 1000L);
            }
        }).m204426n().show();
    }

    /* JADX INFO: renamed from: Ck */
    public static void m59402Ck(ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("测试环境调整划卡活跃天数", new x20() { // from class: l.ovc
            @Override // p153l.x20
            public final void call() {
                w1e.m204400d(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m204430r("输入天数（2-9）").m204421F(new y20() { // from class: l.w1d
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m59341A3((String) obj);
                    }
                }).m204426n().show();
            }
        }));
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m59403D() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89023E4;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m59404D0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        final boolean zBooleanValue = CoreModule.f18264c.f20384f0.f20737z1.get().booleanValue();
        final boolean zBooleanValue2 = CoreModule.f18264c.f20384f0.f20734y1.get().booleanValue();
        arrayList.clear();
        arrayList.add(jyb.m147494Y("清推荐新配对 Sp " + zBooleanValue, new x20() { // from class: l.g8d
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.f20737z1.put(Boolean.valueOf(!zBooleanValue));
            }
        }));
        arrayList.add(jyb.m147494Y("清快捷表情消息 Sp " + zBooleanValue2, new x20() { // from class: l.h8d
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.f20734y1.put(Boolean.valueOf(!zBooleanValue2));
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: D1 */
    public static /* synthetic */ void m59405D1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("ab", new x20() { // from class: l.pad
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60117k3();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: D2 */
    public static /* synthetic */ void m59406D2() {
        jxd0 jxd0Var = pza0.f154761b;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: D6 */
    public static /* synthetic */ void m59410D6() {
        C4887e c4887e = CoreModule.f18264c.f20387g0;
        C4887e.f20509E0.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: Da */
    public static /* synthetic */ void m59414Da(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        v3l0.m199281e().m199287h("antispam");
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().startActivity(VerificationAct.m60648n2(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), 2, "id_ability"));
    }

    /* JADX INFO: renamed from: Db */
    public static /* synthetic */ void m59415Db() {
        jxd0 jxd0Var = pza0.f154781l;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Dc */
    public static /* synthetic */ void m59416Dc(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        if (NullChecker.m82486a(viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2().mo39812d())) {
            ((NewNewProfileCard) viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2().mo39812d()).mo36152Q0();
        }
    }

    /* JADX INFO: renamed from: Dd */
    public static /* synthetic */ void m59417Dd(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("VIP", new x20() { // from class: l.abd
            @Override // p153l.x20
            public final void call() {
                new vdb0.C20815a(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m200962h(jyb.m147507f0(PurchaseType.TYPE_GET_VIP), jyb.m147507f0(Privilege.vip_super_like)).m200956b(BuildConfig.BUILD_TYPE).m200964j();
            }
        }));
        arrayList.add(jyb.m147494Y("SVIP", new x20() { // from class: l.bbd
            @Override // p153l.x20
            public final void call() {
                new vdb0.C20815a(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m200962h(jyb.m147507f0(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE), jyb.m147507f0(Privilege.see_who_likes_me)).m200956b(BuildConfig.BUILD_TYPE).m200964j();
            }
        }));
        arrayList.add(jyb.m147494Y("ODiamond", new x20() { // from class: l.cbd
            @Override // p153l.x20
            public final void call() {
                new vdb0.C20815a(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m200962h(jyb.m147507f0(PurchaseType.TYPE_O_DIAMOND), jyb.m147507f0(Privilege.immediately_match)).m200956b(BuildConfig.BUILD_TYPE).m200964j();
            }
        }));
        arrayList.add(jyb.m147494Y("FemaleVIP", new x20() { // from class: l.dbd
            @Override // p153l.x20
            public final void call() {
                new vdb0.C20815a(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m200962h(jyb.m147507f0(PurchaseType.TYPE_FEMALE_VIP), jyb.m147507f0(Privilege.pick_tantan_credits_users)).m200956b(BuildConfig.BUILD_TYPE).m200964j();
            }
        }));
        arrayList.add(jyb.m147494Y("YouthVIP", new x20() { // from class: l.ebd
            @Override // p153l.x20
            public final void call() {
                new vdb0.C20815a(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m200962h(jyb.m147507f0(PurchaseType.TYPE_YOUTH_VIP), jyb.m147507f0(Privilege.youth_roaming)).m200956b(BuildConfig.BUILD_TYPE).m200964j();
            }
        }));
        arrayList.add(jyb.m147494Y("VIP+SVIP-默认vip", new x20() { // from class: l.fbd
            @Override // p153l.x20
            public final void call() {
                new vdb0.C20815a(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m200962h(jyb.m147507f0(PurchaseType.TYPE_GET_VIP, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE), jyb.m147507f0(Privilege.vip_location, Privilege.svip_badge)).m200956b(BuildConfig.BUILD_TYPE).m200963i(0).m200964j();
            }
        }));
        arrayList.add(jyb.m147494Y("VIP+SVIP-默认svip", new x20() { // from class: l.gbd
            @Override // p153l.x20
            public final void call() {
                new vdb0.C20815a(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m200962h(jyb.m147507f0(PurchaseType.TYPE_GET_VIP, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE), jyb.m147507f0(Privilege.vip_location, Privilege.svip_badge)).m200956b(BuildConfig.BUILD_TYPE).m200963i(1).m200964j();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: De */
    public static /* synthetic */ void m59418De() {
        jxd0 jxd0Var = CoreModule.f18264c.f20405m0.f20122V0;
        Boolean bool = Boolean.FALSE;
        jxd0Var.put(bool);
        CoreModule.f18264c.f20405m0.f20125W0.put(bool);
    }

    /* JADX INFO: renamed from: Df */
    public static /* synthetic */ void m59419Df(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("SVIP低价召回优惠券领取弹窗", new x20() { // from class: l.t1d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59828Wh(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("SVIP低价召回大页面", new x20() { // from class: l.u1d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60015fa(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("SVIP低价召回情况SP缓存", new x20() { // from class: l.v1d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60372vg();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Dh */
    public static /* synthetic */ void m59421Dh() {
        jxd0 jxd0Var = CoreModule.f18264c.f20322K1.f20749V;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Dj */
    public static void m59423Dj(ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("国际化 see 盲盒", new x20() { // from class: l.ixc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59641Nj(viewTreeObserverOnGlobalLayoutListenerC8017b, false);
            }
        }));
        arrayList.add(jyb.m147494Y("国际化 see 盲盒 测试user 入库", new x20() { // from class: l.jxc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59641Nj(viewTreeObserverOnGlobalLayoutListenerC8017b, true);
            }
        }));
    }

    /* JADX INFO: renamed from: Dk */
    public static void m59424Dk(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("超级喜欢pup", new C9238e1(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m59425E() {
        CoreModule.f18264c.f20405m0.f20122V0.put(Boolean.TRUE);
        CoreModule.f18264c.f20405m0.f20125W0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: E1 */
    public static /* synthetic */ void m59427E1(b240 b240Var, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, String str) {
        b240Var.f74520P = viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2().mo39821o().m140259d().f56859id;
        b240Var.f74522Q = str;
        b240Var.m102027i9(true);
    }

    /* JADX INFO: renamed from: E2 */
    public static /* synthetic */ void m59428E2(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("收到Push喜欢  newMaleUserLike.received", new x20() { // from class: l.vxc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59501H9();
            }
        }));
        arrayList.add(jyb.m147494Y("收到Push喜欢  newMaleUserLike.send", new x20() { // from class: l.wxc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60128ke();
            }
        }));
        arrayList.add(jyb.m147494Y("收到Push喜欢逻辑 delay 1s", new x20() { // from class: l.xxc
            @Override // p153l.x20
            public final void call() {
                l51.m152889I(viewTreeObserverOnGlobalLayoutListenerC8017b.m38344q2(), new Runnable() { // from class: l.y9d
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.f18264c.f20405m0.m32018K5();
                    }
                }, 1000L);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: E3 */
    public static /* synthetic */ void m59429E3(MatchSuccessAnimTime matchSuccessAnimTime, String str) {
        try {
            matchSuccessAnimTime.female_enter_time = Integer.parseInt(str);
            CoreModule.f18264c.f20381e0.f89217e3.put(matchSuccessAnimTime.toJson());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: E6 */
    public static /* synthetic */ void m59432E6(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PurchaseType.TYPE_GET_VIP);
        arrayList.add(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        new neb0.C18861a(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), arrayList, null, null).m162852a(1).m162853b(new x20() { // from class: l.ubd
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59503Hb();
            }
        }).m162854c(new y20() { // from class: l.vbd
            @Override // p153l.y20
            public final void call(Object obj) {
                DebugUtil.m59361B1((PurchaseType) obj);
            }
        }).m162857f(new y20() { // from class: l.wbd
            @Override // p153l.y20
            public final void call(Object obj) {
                DebugUtil.m59637Nf((PurchaseType) obj);
            }
        }).m162855d(new y20() { // from class: l.xbd
            @Override // p153l.y20
            public final void call(Object obj) {
                DebugUtil.m60362v6((PurchaseType) obj);
            }
        }).m162856e(new a30() { // from class: l.ybd
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                DebugUtil.m60236pc((PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).m162858g();
    }

    /* JADX INFO: renamed from: E7 */
    public static /* synthetic */ void m59433E7() {
        t450.m189174h().m189181d();
        o1j0.m165651y("已清除");
    }

    /* JADX INFO: renamed from: E8 */
    public static /* synthetic */ void m59434E8(jxd0 jxd0Var, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            CoreModule.f18264c.f20384f0.m33578Ae();
        } else if (jxd0Var.get().booleanValue()) {
            jxd0Var.put(Boolean.FALSE);
        } else {
            jxd0Var.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: Ea */
    public static /* synthetic */ void m59436Ea(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("toggle实验组，当前：".concat(CoreModule.f18264c.f20381e0.f89039G6.get().booleanValue() ? "true" : "false"), new x20() { // from class: l.yad
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60334u0();
            }
        }));
        arrayList.add(jyb.m147494Y("是否展示position，当前：".concat(CoreModule.f18264c.f20381e0.f89045H6.get().booleanValue() ? "true" : "false"), new x20() { // from class: l.zad
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60435yd();
            }
        }));
        arrayList.add(new pf60("ProfileLoopEditPicFrag", new C9240f(viewTreeObserverOnGlobalLayoutListenerC8017b)));
        arrayList.add(new pf60("ProfileLoopMyLifeFrag, add_tag_to_photo", new C9244g(viewTreeObserverOnGlobalLayoutListenerC8017b)));
        arrayList.add(new pf60("ProfileLoopMyLifeFrag, add_photo_to_tag", new C9248h(viewTreeObserverOnGlobalLayoutListenerC8017b)));
        arrayList.add(new pf60("ProfileLoopMyLifeFrag, from_complete_equity_guide_card", new C9252i(viewTreeObserverOnGlobalLayoutListenerC8017b)));
        arrayList.add(new pf60("ProfileLoopMyLifeFrag, from_complete_equity_guide", new C9256j(viewTreeObserverOnGlobalLayoutListenerC8017b)));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Eb */
    public static /* synthetic */ void m59437Eb() {
        jxd0 jxd0Var = pza0.f154783m;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Ec */
    public static /* synthetic */ void m59438Ec(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        C8077u c8077u = new C8077u();
        c8077u.f22795a.put(0);
        c8077u.f22796b.put(0L);
        baj.m103202o();
        baj.m103187a0(CoreModule.m30930K().me_(), viewTreeObserverOnGlobalLayoutListenerC8017b.act(), null, "swipe_card");
    }

    /* JADX INFO: renamed from: Eh */
    public static /* synthetic */ void m59443Eh() {
        jxd0 jxd0Var = pza0.f154778j0;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        jxd0 jxd0Var2 = pza0.f154776i0;
        Boolean bool = Boolean.FALSE;
        jxd0Var2.put(bool);
        pza0.f154774h0.put(bool);
        pza0.f154780k0.put(bool);
    }

    /* JADX INFO: renamed from: Ej */
    public static void m59445Ej(ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("国际化 520", new x20() { // from class: l.apc
            @Override // p153l.x20
            public final void call() {
                xnf0.INSTANCE.m212196n(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), 1);
            }
        }));
    }

    /* JADX INFO: renamed from: Ek */
    public static void m59446Ek(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("滑卡限制", new C9273n0(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m59447F() {
        CoreModule.f18264c.f20381e0.f89354w4.put(Boolean.TRUE);
        C4522a.m22099p().m22125w(true);
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ void m59448F0(b240 b240Var, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        PushMessage pushMessageNew_ = PushMessage.new_();
        PushMessageCustom pushMessageCustomNew_ = PushMessageCustom.new_();
        pushMessageNew_.messageCustom = pushMessageCustomNew_;
        pushMessageCustomNew_.liveId = "5908440";
        pushMessageCustomNew_.title = "主播昵称显示";
        pushMessageCustomNew_.content = "好久不见，为你准备了一份礼包";
        pushMessageCustomNew_.extra = "popExperimentStyle3";
        pushMessageCustomNew_.buttonText = "去领取";
        pushMessageCustomNew_.type = "popExperimentStyleA";
        pushMessageCustomNew_.subTitle = "你的好友";
        pushMessageCustomNew_.state = "super_like";
        pushMessageCustomNew_.avatars = "https://auto.tancdn.com/v1/images/eyJpZCI6IjVCVjZMSlFXQjY1VlJHVlJVWUw1V1pHVkVJUktLSDE0IiwidyI6NzAsImgiOjcwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NjU2OTU0MDU3ODAyMzEyMjczOX0.png";
        pushMessageCustomNew_.tabId = "card,message,moment,me";
        pushMessageNew_.intent = "live.ongoingLive.pinkCard";
        pushMessageCustomNew_.bgImg = "https://fe-static.tancdn.com/v1/images/eyJpZCI6IldIN0lYNDNXNDNEVzNETzZLU1RQVjdGNDNaVzRIRzEyIiwidyI6MTEyNSwiaCI6OTU0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzYyODM1NjQ2OTc0NTQ0MDcyfQ.png";
        pushMessageCustomNew_.image = "https://auto.tancdn.com/v1/images/eyJpZCI6IjVCVjZMSlFXQjY1VlJHVlJVWUw1V1pHVkVJUktLSDE0IiwidyI6NzAsImgiOjcwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NjU2OTU0MDU3ODAyMzEyMjczOX0.png";
        b240Var.m101879A8(pushMessageNew_);
        llb0.m154703c().m154710i(new xex(Act.foreground_().f16062a.get(), Act.foreground_().f16062a.get().getString(R$string.f18884Th), 10, CoreModule.m30930K().me_().m61308fp().profileSmall()));
        viewTreeObserverOnGlobalLayoutListenerC8017b.m38368u6(CoreModule.f18264c.f20381e0.m116600p9().m61308fp().url, viewTreeObserverOnGlobalLayoutListenerC8017b.act().string(R$string.f19438ln), ShareConstants.OLD_VERSION, 1, 1, null, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, null);
    }

    /* JADX INFO: renamed from: F1 */
    public static /* synthetic */ void m59449F1() {
        jxd0 jxd0Var = pza0.f154734B;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        if (pza0.f154734B.get().booleanValue()) {
            pza0.f154735C.put(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: F4 */
    public static /* synthetic */ void m59452F4() {
        C22507a<PartialListOpt<CoreSuggested.UserInfo>> c22507a = CoreModule.f18264c.f20405m0.f20136a0;
        c22507a.m137019l(c22507a.m222761e());
    }

    /* JADX INFO: renamed from: F8 */
    public static /* synthetic */ void m59456F8(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("清除数据", new x20() { // from class: l.b9d
            @Override // p153l.x20
            public final void call() {
                CoreModule.m30930K().mo31738Xd();
            }
        }));
        arrayList.add(jyb.m147494Y("插入消息", new x20() { // from class: l.c9d
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20434v2.m175892C3(viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2().mo39821o().m140259d().f56859id, pzi0.m174454o());
            }
        }));
        arrayList.add(jyb.m147494Y("顶部卡片设置外露喜欢", new x20() { // from class: l.d9d
            @Override // p153l.x20
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2().mo39821o().m140260e().hasLikeMeSlideCardTop = true;
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Fb */
    public static /* synthetic */ void m59459Fb() {
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = CoreModule.f18264c.f20405m0.f20136a0.m222761e();
        int size = CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded.size() - 1;
        CoreSuggested.UserInfo userInfo = CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded.get(size);
        userInfo.preSwipedDirection = SwipeDirection.RIGHT;
        List<CoreSuggested.UserInfo> list = CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded;
        list.remove(size);
        list.add(0, userInfo);
        CoreModule.f18264c.f20405m0.f20136a0.m137019l(new PartialListOpt<>(list, partialListOptM222761e.links));
    }

    /* JADX INFO: renamed from: Fc */
    public static /* synthetic */ void m59460Fc() {
        CityCData cityCDataNew_ = CityCData.new_();
        cityCDataNew_.userId = CoreModule.f18264c.f20381e0.m116600p9().f56859id;
        cityCDataNew_.expireAt = pzi0.m174454o() + 3600000;
        CoreModule.f18264c.f20392h2.f142919V.m137019l(jyb.m147494Y(cityCDataNew_, null));
    }

    /* JADX INFO: renamed from: Fg */
    public static /* synthetic */ void m59464Fg() {
        jxd0 jxd0Var = CoreModule.f18264c.f20384f0.f20704o1;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Fi */
    public static void m59466Fi(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("Alerts通用", new C9278o1(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: Fj */
    public static void m59467Fj() {
        l51.m152919y(new Runnable() { // from class: l.w0d
            @Override // java.lang.Runnable
            public final void run() {
                DebugUtil.m60067hi();
            }
        });
    }

    /* JADX INFO: renamed from: Fk */
    public static void m59468Fk(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("1v1", new C9287r1(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: G1 */
    public static /* synthetic */ void m59471G1() {
        jxd0 jxd0Var = pza0.f154776i0;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        jxd0 jxd0Var2 = pza0.f154774h0;
        Boolean bool = Boolean.FALSE;
        jxd0Var2.put(bool);
        pza0.f154778j0.put(bool);
        pza0.f154780k0.put(bool);
    }

    /* JADX INFO: renamed from: G2 */
    public static /* synthetic */ void m59472G2(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("定位权限挽留", new x20() { // from class: l.oqc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), new Runnable() { // from class: l.n9d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b3 = viewTreeObserverOnGlobalLayoutListenerC8017b2;
                        c6w.m108185i(viewTreeObserverOnGlobalLayoutListenerC8017b3.act(), new x20() { // from class: l.fac
                            @Override // p153l.x20
                            public final void call() {
                                viewTreeObserverOnGlobalLayoutListenerC8017b3.m38369v2().m101919K8();
                            }
                        }, null, false);
                    }
                }, 500L);
            }
        }));
        arrayList.add(jyb.m147494Y("定位权限挽留选择", new x20() { // from class: l.pqc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), new Runnable() { // from class: l.y0d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b3 = viewTreeObserverOnGlobalLayoutListenerC8017b2;
                        c6w.m108185i(viewTreeObserverOnGlobalLayoutListenerC8017b3.act(), new x20() { // from class: l.dcd
                            @Override // p153l.x20
                            public final void call() {
                                viewTreeObserverOnGlobalLayoutListenerC8017b3.m38369v2().m101919K8();
                            }
                        }, new x20() { // from class: l.fcd
                            @Override // p153l.x20
                            public final void call() {
                                DebugUtil.m59833X1();
                            }
                        }, true);
                    }
                }, 500L);
            }
        }));
        arrayList.add(jyb.m147494Y("定位权限挽留for feed", new x20() { // from class: l.qqc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), new Runnable() { // from class: l.c5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b3 = viewTreeObserverOnGlobalLayoutListenerC8017b2;
                        c6w.m108186j(viewTreeObserverOnGlobalLayoutListenerC8017b3.act(), new x20() { // from class: l.kbd
                            @Override // p153l.x20
                            public final void call() {
                                viewTreeObserverOnGlobalLayoutListenerC8017b3.m38369v2().m101919K8();
                            }
                        }, null, false, true, null);
                    }
                }, 500L);
            }
        }));
        arrayList.add(jyb.m147494Y("模拟定位刷新", new x20() { // from class: l.rqc
            @Override // p153l.x20
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC8017b.m38369v2().m101919K8();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: G4 */
    public static /* synthetic */ void m59474G4() {
        jxd0 jxd0Var = CoreModule.f18264c.f20405m0.f20102N1;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: G6 */
    public static /* synthetic */ void m59476G6() {
        C8618a.m48771w().m48796s().clear();
        C8618a.m48771w().m48797t().clear();
        C8618a.m48771w().m48795r().clear();
        C8618a.m48771w().m48794q().clear();
        C8618a.m48771w().m48801y().clear();
        C8618a.m48771w().m48800x().clear();
    }

    /* JADX INFO: renamed from: G9 */
    public static /* synthetic */ void m59479G9(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        Window window = viewTreeObserverOnGlobalLayoutListenerC8017b.act().getWindow();
        if (window != null) {
            window.setSoftInputMode(3);
        }
        l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), new RunnableC9285r(viewTreeObserverOnGlobalLayoutListenerC8017b), 1000L);
    }

    /* JADX INFO: renamed from: Ga */
    public static /* synthetic */ void m59480Ga(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        uyf uyfVar = new uyf(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
        uyfVar.m198611C(CoreModule.f18264c.f20381e0.m116537Z7(), false, "p_suggest_users_home_view");
        uyfVar.show();
    }

    /* JADX INFO: renamed from: Gc */
    public static /* synthetic */ void m59482Gc() {
        t450.m189174h().m189188o(0L);
        o1j0.m165651y("已清除");
    }

    /* JADX INFO: renamed from: Ge */
    public static /* synthetic */ void m59484Ge(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("查看一键配对本地缓存信息", new x20() { // from class: l.e3d
            @Override // p153l.x20
            public final void call() {
                t450.m189174h().m189182e();
            }
        }));
        arrayList.add(jyb.m147494Y("清除一键配对本地缓存信息", new x20() { // from class: l.g3d
            @Override // p153l.x20
            public final void call() {
                t450.m189174h().m189180c();
            }
        }));
        arrayList.add(jyb.m147494Y("一键配对探探币确认使用弹窗", new x20() { // from class: l.h3d
            @Override // p153l.x20
            public final void call() {
                C8619b.m48804B(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), null, PurchaseType.TYPE_O_DIAMOND);
            }
        }));
        arrayList.add(jyb.m147494Y("一键配对探探币购买弹窗", new x20() { // from class: l.i3d
            @Override // p153l.x20
            public final void call() {
                a5i0.m96164q1(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "", CoreModule.f18264c.f20312H0.m155406A4());
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Gi */
    public static void m59488Gi(final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        VButton vButton = new VButton(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
        vButton.setText("Debug");
        vButton.setPadding(qa00.m175859d(30.0f), qa00.m175859d(30.0f), qa00.m175859d(30.0f), qa00.m175859d(30.0f));
        vButton.setBackgroundColor(-16711936);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        layoutParams.topMargin = qa00.m175859d(-180.0f);
        viewTreeObserverOnGlobalLayoutListenerC8017b.f22658a.addView(vButton, layoutParams);
        bnl0.m105509E0(vButton, new View.OnClickListener() { // from class: l.i1d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugUtil.m59627N5(viewTreeObserverOnGlobalLayoutListenerC8017b, view);
            }
        });
        VButton vButton2 = new VButton(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
        vButton2.setText("Debug");
        vButton2.setPadding(qa00.m175859d(30.0f), qa00.m175859d(30.0f), qa00.m175859d(30.0f), qa00.m175859d(30.0f));
        vButton2.setBackgroundColor(-16711936);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        viewTreeObserverOnGlobalLayoutListenerC8017b.f22658a.addView(vButton2, layoutParams2);
        bnl0.m105509E0(vButton2, new View.OnClickListener() { // from class: l.j1d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.f18264c.f20405m0.m32066W5(1);
            }
        });
        VButton vButton3 = new VButton(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
        vButton3.setBackgroundColor(-16711936);
        vButton3.setText("Refresh");
        vButton3.setPadding(qa00.m175859d(30.0f), qa00.m175859d(30.0f), qa00.m175859d(30.0f), qa00.m175859d(30.0f));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        layoutParams3.topMargin = qa00.m175859d(130.0f);
        viewTreeObserverOnGlobalLayoutListenerC8017b.f22658a.addView(vButton3, layoutParams3);
        bnl0.m105509E0(vButton3, new View.OnClickListener() { // from class: l.k1d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.f18264c.f20405m0.m32066W5(-1);
            }
        });
    }

    /* JADX INFO: renamed from: Gj */
    public static void m59489Gj(y20<User> y20Var, int i) {
        final PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = CoreModule.f18264c.f20405m0.f20136a0.m222761e();
        List<CoreSuggested.UserInfo> list = partialListOptM222761e.loaded;
        if (jyb.m147479J(list)) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        Iterator<CoreSuggested.UserInfo> it = list.iterator();
        while (it.hasNext()) {
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(it.next().f20214id);
            if (userM116503Pa != null) {
                User user = new User() { // from class: com.p1.mobile.putong.core.util.DebugUtil.40
                    boolean isMerged = false;

                    @Override // com.p051p1.mobile.putong.data.User, com.tantanapp.common.data.ValueObject
                    public boolean shouldMergeData() {
                        if (this.isMerged) {
                            return false;
                        }
                        this.isMerged = true;
                        return true;
                    }
                };
                user.mergeData(userM116503Pa);
                user.f56859id = userM116503Pa.f56859id;
                user._id = userM116503Pa._id;
                y20Var.call(user);
                arrayList.add(user);
                i--;
                if (i <= 0) {
                    break;
                }
            }
        }
        C22421c.fromCallable(new Callable() { // from class: l.uuc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return DebugUtil.m59987e4(arrayList);
            }
        }).compose(psd0.m173592C()).subscribe(psd0.m173596G(new y20() { // from class: l.vuc
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20405m0.f20136a0.m137019l(partialListOptM222761e);
            }
        }));
    }

    /* JADX INFO: renamed from: Gk */
    public static void m59490Gk(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("聊天详情页内切换新会话", new C9242f1(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m59492H0() {
        jxd0 jxd0Var = App.f16100q;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        l51.m152885E();
    }

    /* JADX INFO: renamed from: H1 */
    public static /* synthetic */ void m59493H1(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("首页启动介绍弹窗", new x20() { // from class: l.k8d
            @Override // p153l.x20
            public final void call() {
                new unq0(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "").show();
            }
        }));
        arrayList.add(jyb.m147494Y("首页启动介绍弹窗清除本地记录", new x20() { // from class: l.l8d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60250q4();
            }
        }));
        arrayList.add(jyb.m147494Y("购买弹窗", new x20() { // from class: l.m8d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60110ji(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("购买全屏 - 漫游", new x20() { // from class: l.n8d
            @Override // p153l.x20
            public final void call() {
                C8927c.m54605Q0(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "", Privilege.youth_roaming);
            }
        }));
        arrayList.add(jyb.m147494Y("购买全屏 - 搭子", new x20() { // from class: l.o8d
            @Override // p153l.x20
            public final void call() {
                C8927c.m54605Q0(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "", Privilege.youth_find_partner);
            }
        }));
        arrayList.add(jyb.m147494Y("购买全屏 - 盲盒", new x20() { // from class: l.p8d
            @Override // p153l.x20
            public final void call() {
                C8927c.m54605Q0(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "", Privilege.youth_blind_box);
            }
        }));
        arrayList.add(jyb.m147494Y("购买全屏 - 已读", new x20() { // from class: l.q8d
            @Override // p153l.x20
            public final void call() {
                C8927c.m54605Q0(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "", Privilege.youth_message_read);
            }
        }));
        arrayList.add(jyb.m147494Y("购买全屏 - 超级喜欢", new x20() { // from class: l.r8d
            @Override // p153l.x20
            public final void call() {
                C8927c.m54605Q0(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "", Privilege.youth_superlike);
            }
        }));
        arrayList.add(jyb.m147494Y("漫游", new x20() { // from class: l.s8d
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().startActivity(VipLocationHistoryAct.m57459X1(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), "p_youthvip_page"));
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: H3 */
    public static /* synthetic */ void m59495H3(User user) {
        user.name += "-MOCK用户名字很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长";
    }

    /* JADX INFO: renamed from: H4 */
    public static /* synthetic */ void m59496H4() {
    }

    /* JADX INFO: renamed from: H7 */
    public static /* synthetic */ void m59499H7() {
    }

    /* JADX INFO: renamed from: H9 */
    public static /* synthetic */ void m59501H9() {
        PushMessage pushMessage = new PushMessage();
        pushMessage.intent = "newMaleUserLike.received";
        CoreBusinessModule.f18254e.m106507n("", "", "", pushMessage, null);
    }

    /* JADX INFO: renamed from: Ha */
    public static /* synthetic */ void m59502Ha() {
        jxd0 jxd0Var = pza0.f154792s;
        Boolean bool = Boolean.FALSE;
        jxd0Var.put(bool);
        pza0.f154793t.put(bool);
    }

    /* JADX INFO: renamed from: Hb */
    public static /* synthetic */ void m59503Hb() {
    }

    /* JADX INFO: renamed from: Hc */
    public static /* synthetic */ void m59504Hc() {
        jxd0 jxd0Var = pza0.f154768e0;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        pza0.f154766d0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: Hd */
    public static /* synthetic */ void m59505Hd() {
        jxd0 jxd0Var = pza0.f154791r;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Hf */
    public static /* synthetic */ void m59507Hf() {
        CoreModule.f18264c.f20303E0.m141087v3();
        o1j0.m165651y("已清除");
    }

    /* JADX INFO: renamed from: Hi */
    public static void m59510Hi(final ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, final HashMap<String, jxd0> map) {
        arrayList.add(jyb.m147494Y("AB 实验 Debug 开关", new x20() { // from class: l.vlc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59970d9(map, arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
    }

    /* JADX INFO: renamed from: Hj */
    public static void m59511Hj(User user, String str, int i) {
        if (uqb0.f180405k0.f184355d.query(str) != null) {
            return;
        }
        User userNew_ = User.new_();
        userNew_.f56859id = str;
        userNew_.name = "MockUser" + (i + 1);
        userNew_.gender = Gender.get("female");
        userNew_.pictures = new ArrayList();
        if (user != null && !jyb.m147479J(user.pictures)) {
            Media media = user.pictures.get(0);
            Picture pictureCover = media != null ? media.cover() : null;
            if (pictureCover != null) {
                userNew_.pictures.add(pictureCover.mo225055clone());
            }
        }
        if (jyb.m147479J(userNew_.pictures)) {
            Picture pictureNew_ = Picture.new_();
            pictureNew_.url = "";
            userNew_.pictures.add(pictureNew_);
        }
        uqb0.f180405k0.f184355d.upsert(userNew_);
    }

    /* JADX INFO: renamed from: Hk */
    public static void m59512Hk(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("特定行为进四选一", new C9281p1(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ void m59514I0() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89345v2;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: I1 */
    public static /* synthetic */ void m59515I1() {
    }

    /* JADX INFO: renamed from: I3 */
    public static /* synthetic */ void m59517I3() {
        jxd0 jxd0Var = CoreModule.f18264c.f20405m0.f20191s1;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: I4 */
    public static /* synthetic */ void m59518I4() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89097P2;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: I5 */
    public static /* synthetic */ void m59519I5(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        wgb0.m206193e("2170");
        if (NullChecker.m82486a(wtd0.m207834i("[{\"channel\":\"buy\",\"privilegeType\":\"roaming\",\"count\":0,\"remaining\":0,\"duration\":7776000,\"expireAt\":1699340315},{\"channel\":\"buy\",\"privilegeType\":\"seeWhoLikedMe\",\"count\":0,\"remaining\":0,\"duration\":7776000,\"expireAt\":1699340315},{\"channel\":\"buy\",\"privilegeType\":\"superLikeMembership\",\"count\":0,\"remaining\":0,\"duration\":7776000,\"expireAt\":1699340315},{\"channel\":\"buy\",\"privilegeType\":\"svip\",\"count\":0,\"remaining\":0,\"duration\":7776000,\"expireAt\":1699340315},{\"channel\":\"buy\",\"privilegeType\":\"undoMembership\",\"count\":0,\"remaining\":0,\"duration\":7776000,\"expireAt\":1699340315},{\"channel\":\"buy\",\"privilegeType\":\"unlimitedSwipes\",\"count\":0,\"remaining\":0,\"duration\":7776000,\"expireAt\":1699340315},{\"channel\":\"buy\",\"privilegeType\":\"vip\",\"count\":0,\"remaining\":0,\"duration\":7776000,\"expireAt\":1699340315},{\"channel\":\"buy\",\"privilegeType\":\"quickchatMembership\",\"count\":0,\"remaining\":0,\"duration\":7776000,\"expireAt\":1699340315},{\"channel\":\"give\",\"privilegeType\":\"superLike\",\"count\":5,\"remaining\":10,\"duration\":0,\"expireAt\":0},{\"channel\":\"give\",\"privilegeType\":\"quickchatNumber\",\"count\":5,\"remaining\":12,\"duration\":0,\"expireAt\":0},{\"channel\":\"give\",\"privilegeType\":\"boost\",\"count\":1,\"remaining\":4,\"duration\":0,\"expireAt\":0}]").second)) {
            wgb0.m206192d(1);
        } else {
            wgb0.m206192d(0);
        }
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().startActivity(AccessTokenWebViewAct.m81338l2(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "", "http://m.staging2.p1staff.com/commerce/svip?expiresTime=1699340315000&time=1699339716000&duration=7776000&showGift=true&avatarURL=http://cloud.staging2.p1staff.com/v1/images/eyJpZCI6Ik8zNVk2RDVPTjZZN0EyM0M1MlJJRUkzSkQ3UlNEQzAwIiwidyI6MTQ0MCwiaCI6MTQ0MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjEzMTYzMjAxNTczMzEzNjg1NzY0fQ&gender=male&startBoost=false&name=%E4%B8%83%E5%85%AB%E5%85%AB%E5%9B%9B", true, false, true, true));
    }

    /* JADX INFO: renamed from: I6 */
    public static /* synthetic */ void m59520I6() {
        String str = "message_read_state_text_guide_shown_" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        new jxd0(str, bool).put(bool);
        o1j0.m165651y("已重置");
    }

    /* JADX INFO: renamed from: I7 */
    public static /* synthetic */ void m59521I7() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89203c5;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: I8 */
    public static /* synthetic */ void m59522I8(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("城市封面 没人购买", new x20() { // from class: l.o3d
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), new DebugUtil.RunnableC9293t1(new n55(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), "")), 300L);
            }
        }));
        arrayList.add(jyb.m147494Y("城市封面 自己购买后", new x20() { // from class: l.p3d
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), new DebugUtil.RunnableC9296u1(new n55(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), "")), 300L);
            }
        }));
        arrayList.add(jyb.m147494Y("城市封面 查看其他人购买", new x20() { // from class: l.r3d
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), new DebugUtil.RunnableC9299v1(new n55(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), "")), 300L);
            }
        }));
        arrayList.add(jyb.m147494Y("城市封面 确认", new x20() { // from class: l.s3d
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), new DebugUtil.RunnableC9302w1(new n55(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), "")), 300L);
            }
        }));
        arrayList.add(jyb.m147494Y("城市封面 购买成功", new x20() { // from class: l.t3d
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), new DebugUtil.RunnableC9311z1(new p55(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), "")), 300L);
            }
        }));
        arrayList.add(jyb.m147494Y("城市封面 清理购买成功插卡标记:" + CoreModule.f18264c.f20405m0.f20069C1.get(), new x20() { // from class: l.u3d
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20405m0.f20069C1.put(Boolean.FALSE);
            }
        }));
        arrayList.add(jyb.m147494Y("城市封面 测试收到 CoreCityTop 插卡:" + CoreModule.f18264c.f20405m0.f20072D1.get(), new x20() { // from class: l.v3d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59595Lf();
            }
        }));
        arrayList.add(jyb.m147494Y("城市封面 购买成功插卡", new x20() { // from class: l.w3d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59460Fc();
            }
        }));
        arrayList.add(jyb.m147494Y("城市置顶，清除活跃时间", new x20() { // from class: l.x3d
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20392h2.m164072C3().subscribe(psd0.m173591B());
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: I9 */
    public static /* synthetic */ void m59523I9() {
        CoreModule.f18264c.f20431u2.f114294R.clear();
        CoreModule.f18264c.f20431u2.f114295S.clear();
        CoreModule.f18264c.f20431u2.f114297U.clear();
        CoreModule.f18264c.f20431u2.f114296T.clear();
        CoreModule.f18264c.f20431u2.f114298V.clear();
        CoreModule.f18264c.f20431u2.f114299W.clear();
        CoreModule.f18264c.f20431u2.f114300X.clear();
    }

    /* JADX INFO: renamed from: Ic */
    public static /* synthetic */ void m59526Ic(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        if (NullChecker.m82486a(viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2()) && NullChecker.m82486a(viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2().mo39812d())) {
            uih0.m196223s0().m196265i1(viewTreeObserverOnGlobalLayoutListenerC8017b, (NewNewProfileCard) viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2().mo39812d(), viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2().mo39816j(), 0);
        }
    }

    /* JADX INFO: renamed from: Id */
    public static /* synthetic */ void m59527Id(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        PurchaseType purchaseType = PurchaseType.TYPE_SVIP_PICKS_MEMBERSHIP;
        new C8941c.a(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), purchaseType, null).m55277g(j690.m143618j(purchaseType.getPrivilegeData(null), Privilege.picksMembership)).m55278h();
    }

    /* JADX INFO: renamed from: Ie */
    public static /* synthetic */ void m59528Ie() {
        vxd0 vxd0Var = new vxd0("tantanAuthSwipeNotifyDefaultCount", 0);
        byd0 byd0Var = new byd0("tantanAuthSwipeNotifyDefaultLastShowTime", 0L);
        wyd0 wyd0Var = new wyd0("tantanAuthSwipeDefaultDate", "");
        new byd0("tantanAuthSwipeDefaultCount", 0L).put(0L);
        vxd0Var.put(0);
        wyd0Var.put("");
        byd0Var.put(0L);
        vxd0 vxd0Var2 = new vxd0("tantanAuthSwipeNotifyCount", 0);
        byd0 byd0Var2 = new byd0("tantanAuthSwipeNotifyLastShowTime", 0L);
        wyd0 wyd0Var2 = new wyd0("tantanAuthSwipeDate", "");
        new byd0("tantanAuthSwipeCount", 0L).put(0L);
        vxd0Var2.put(0);
        wyd0Var2.put("");
        byd0Var2.put(0L);
        vxd0 vxd0Var3 = new vxd0("tantanAuthGuideCount", 0);
        byd0 byd0Var3 = new byd0("tantanAuthGuideLastShowTime", 0L);
        vxd0Var3.put(0);
        byd0Var3.put(0L);
        new vxd0("tantanAuthTipsShowTimes", 0).put(0);
        new wyd0("tantanAuthTipsShowDate", null).put("");
        new xyd0("tantanAuthTipsShowUser", new HashSet()).put(new HashSet());
        new vxd0("tantanAuthToastShowTimes", 0).put(0);
        new wyd0("tantanAuthToastShowDate", null).put("");
        new xyd0("tantanAuthToastShowUser", new HashSet()).put(new HashSet());
    }

    /* JADX INFO: renamed from: If */
    public static /* synthetic */ void m59529If() {
        Relationship relationship = new Relationship();
        relationship.status = new ArrayList();
        vxd0 vxd0Var = new vxd0("LIKE_USER", 0);
        for (int iIntValue = (vxd0Var.get().intValue() * 300) + 32000; iIntValue < ((vxd0Var.get().intValue() + 1) * 300) + 32000; iIntValue++) {
            C4910y.m35904i3(iIntValue + "", relationship).materialize().subscribe();
        }
        o1j0.m165651y(String.format("第 %s 组 300 人喜欢我", Integer.valueOf(vxd0Var.get().intValue() + 1)));
        vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
    }

    /* JADX INFO: renamed from: Ig */
    public static /* synthetic */ void m59530Ig(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        Merchandise merchandise = (Merchandise) jyb.m147529r(CoreModule.f18264c.f20396j0.m31583E4().m222761e(), new qcj() { // from class: l.acd
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Merchandise merchandise2 = (Merchandise) obj;
                return Boolean.valueOf(TEnum.equals(merchandise2.category, ProductCategory.tttVip) && merchandise2.monthly() && merchandise2.autoRenewable());
            }
        });
        if (merchandise.getCouponForPromotion(MonetizationPromotionsId.trial7DVIP) != null) {
            new vwl0().m203167s(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), merchandise);
        } else {
            o1j0.m165651y("商品或者优惠券为空");
        }
    }

    /* JADX INFO: renamed from: Ii */
    public static void m59532Ii(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("异常会话处理", new C9277o0(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: Ij */
    public static void m59533Ij(final ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("FakeGuide", new x20() { // from class: l.pvc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59948c9(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
    }

    /* JADX INFO: renamed from: Ik */
    public static void m59534Ik(final ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("AvatarCards改造", new x20() { // from class: l.rvc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59436Ea(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m59535J(String str, SuggestedComplimentItem suggestedComplimentItem, uxj0 uxj0Var) {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f20214id = str;
        userInfo.compliment = suggestedComplimentItem;
        CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0).subscribe(psd0.m173597H(new y20() { // from class: l.pac
            @Override // p153l.y20
            public final void call(Object obj) {
                r1j0.m179420g("已插入到顶部");
            }
        }, new y20() { // from class: l.qac
            @Override // p153l.y20
            public final void call(Object obj) {
                DebugUtil.m60006f1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J1 */
    public static /* synthetic */ void m59537J1(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), WXEntryActivity.APPID);
        if (!iwxapiCreateWXAPI.isWXAppInstalled()) {
            o1j0.m165651y(CoreModule.f18263b.getString(com.p051p1.mobile.putong.core.pay.R$string.f28212Y9));
            return;
        }
        WXLaunchMiniProgram.Req req = new WXLaunchMiniProgram.Req();
        req.userName = "gh_3a849b303c14";
        req.path = "pages/association/index?publicId=";
        req.miniprogramType = 0;
        iwxapiCreateWXAPI.sendReq(req);
    }

    /* JADX INFO: renamed from: J2 */
    public static /* synthetic */ void m59538J2() {
        jxd0 jxd0Var = pza0.f154759a;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Jb */
    public static /* synthetic */ void m59547Jb() {
        jxd0 jxd0Var = CoreModule.f18264c.f20405m0.f20081G1;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Jc */
    public static /* synthetic */ void m59548Jc() {
        jxd0 jxd0Var = pza0.f154737E;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Jd */
    public static /* synthetic */ void m59549Jd() {
        List<LiteraturesComments> listM60629l = BookMoviesDramasHelper.m60629l(CoreModule.m30929H().userId());
        if (listM60629l.isEmpty()) {
            return;
        }
        listM60629l.toString();
    }

    /* JADX INFO: renamed from: Jg */
    public static /* synthetic */ void m59552Jg() {
        jxd0 jxd0Var = pza0.f154745M;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Jh */
    public static /* synthetic */ void m59553Jh() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89011C6;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Ji */
    public static void m59554Ji(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("检查被ban卡片", new C9246g1(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: Jj */
    public static void m59555Jj(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("引导用户进动态", new C9295u0(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: Jk */
    public static void m59556Jk(final ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("体验弹窗", new x20() { // from class: l.ylc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59834X2(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
    }

    /* JADX INFO: renamed from: K1 */
    public static /* synthetic */ void m59559K1() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89354w4;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: K2 */
    public static /* synthetic */ void m59560K2() {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.moment_user_state);
        messageNew_.extData = MessageExtData.new_();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sourceFlag", "1");
            jSONObject.put("emotionUrl", "http://cloud.staging2.p1staff.com/v1/videos/eyJpZCI6IllVTUVVRkRCM1lVSVRDNDRUTkwzWVM0NEpVQU5VNTAxIiwidyI6NDgwLCJoIjo0ODAsImQiOjE1LCJtdCI6InZpZGVvL21wNCIsImRoIjo1Mjc3ODQ4MzZ9");
            jSONObject.put("emotionText", "吃瓜");
            messageNew_.extData.extra = jSONObject.toString(1);
            CoreModule.f18264c.f20384f0.f20705o2.clear();
            CoreModule.f18264c.f20384f0.f20705o2.add(messageNew_);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            iig0.m140070a(e);
        }
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m59561K3(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        if (NullChecker.m82486a(viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2().mo39812d())) {
            ((NewNewProfileCard) viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2().mo39812d()).mo36152Q0();
        }
    }

    /* JADX INFO: renamed from: K4 */
    public static /* synthetic */ void m59562K4() {
    }

    /* JADX INFO: renamed from: K5 */
    public static /* synthetic */ void m59563K5() {
        jxd0 jxd0Var = hxf.f111999c;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        hxf.f111998b.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: Kd */
    public static /* synthetic */ void m59571Kd() {
        jxd0 jxd0Var = CoreModule.f18264c.f20405m0.f20075E1;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Ke */
    public static /* synthetic */ void m59572Ke() {
        upm.f180293j = true;
        upm.f180290g = true;
        upm.f180291h = true;
        upm.f180292i = true;
    }

    /* JADX INFO: renamed from: Kf */
    public static /* synthetic */ void m59573Kf(String str) {
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116503Pa(str))) {
            o1j0.m165636j("有结果");
        } else {
            o1j0.m165636j("空结果");
        }
    }

    /* JADX INFO: renamed from: Kh */
    public static /* synthetic */ void m59575Kh(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        User userMo225055clone = CoreModule.f18264c.f20381e0.m116600p9().mo225055clone();
        ProfileCompletion profileCompletion = userMo225055clone.profile.extensions.profileCompletion;
        List list = Collections.EMPTY_LIST;
        profileCompletion.progress = jyb.m147500c(list, "未完成");
        userMo225055clone.profile.extensions.profileCompletion.briefIntroduction = jyb.m147500c(list, "我是一个up主");
        User userSubtract = userMo225055clone.subtract(CoreModule.f18264c.f20381e0.m116600p9());
        if (NullChecker.m82486a(userSubtract)) {
            viewTreeObserverOnGlobalLayoutListenerC8017b.act().duringCreated(CoreModule.f18264c.f20381e0.m116620u9(userSubtract)).subscribe(psd0.m173597H(new y20() { // from class: l.oxc
                @Override // p153l.y20
                public final void call(Object obj) {
                    o1j0.m165651y(CoreModule.f18264c.f20381e0.m116600p9().profile.extensions.profileCompletion.toJson());
                }
            }, new y20() { // from class: l.pxc
                @Override // p153l.y20
                public final void call(Object obj) {
                    o1j0.m165651y(((Throwable) obj).getMessage());
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Ki */
    public static void m59576Ki(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("已经认证首页tab", new C9269m0(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: Kj */
    public static void m59577Kj(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("心动信号女性路经变短", new C9222a1(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: Kk */
    public static void m59578Kk(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("强制指定认证类型", new C9274n1(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m59579L(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("清除引导标记(气泡、特权入口、访客入口)", new x20() { // from class: l.p0d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59433E7();
            }
        }));
        arrayList.add(jyb.m147494Y("我的tab访客入口标志切换" + t450.m189174h().m189186l(), new x20() { // from class: l.q0d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60171md();
            }
        }));
        arrayList.add(jyb.m147494Y("推荐卡片黑金样式", new x20() { // from class: l.s0d
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20405m0.m32069W8().subscribe(psd0.m173596G(new y20() { // from class: l.zbd
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        jyb.m147537z(((PartialListOpt) obj).loaded, new y20() { // from class: l.oac
                            @Override // p153l.y20
                            public final void call(Object obj2) {
                                DebugUtil.m59762Te((CoreSuggested.UserInfo) obj2);
                            }
                        });
                    }
                }));
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m59580L0(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: L1 */
    public static /* synthetic */ void m59581L1() {
    }

    /* JADX INFO: renamed from: L2 */
    public static /* synthetic */ void m59582L2() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89096P1;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: L7 */
    public static /* synthetic */ void m59587L7() {
        jxd0 jxd0Var = f39106h;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: L9 */
    public static /* synthetic */ void m59589L9() {
        Message messageNew_ = Message.new_();
        vxd0 vxd0Var = App.f16092i;
        messageNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(vxd0Var.get().intValue());
        messageNew_.messageType = MessageType.get(MessageType.moment_user_state);
        messageNew_.createdTime = pzi0.m174454o();
        messageNew_.localCreatedTime = System.nanoTime();
        messageNew_.localCreatedSession = vxd0Var.get().intValue();
        messageNew_.localInConversation = true;
        messageNew_.owner = CoreModule.f18264c.f20381e0.m116593na().f56859id;
        messageNew_.recalled = Boolean.FALSE;
        StateData stateData = new StateData();
        stateData.emotionId = "1";
        stateData.emotionText = "学习";
        stateData.emotionUrl = CoreModule.m30930K().me_().m61308fp().url;
        stateData.value = "找搭子一起学习找搭子一起学习";
        MessageExtData messageExtData = new MessageExtData();
        messageExtData.extra = stateData.toJson();
        messageNew_.extData = messageExtData;
        CoreModule.f18264c.f20384f0.f20705o2.clear();
        CoreModule.f18264c.f20384f0.f20705o2.add(messageNew_);
    }

    /* JADX INFO: renamed from: Lb */
    public static /* synthetic */ void m59591Lb() {
        jxd0 jxd0Var = pza0.f154736D;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Le */
    public static /* synthetic */ void m59594Le(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        z99 z99Var = CoreModule.f18264c.f20414p0;
        z99Var.f203452S = 0.25d;
        z99Var.f203454U = 0.19d;
        fp5.m126530l(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), m59620Mj(viewTreeObserverOnGlobalLayoutListenerC8017b), BuildConfig.BUILD_TYPE, null);
    }

    /* JADX INFO: renamed from: Lf */
    public static /* synthetic */ void m59595Lf() {
        jxd0 jxd0Var = CoreModule.f18264c.f20405m0.f20072D1;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Li */
    public static void m59598Li(final Act act) {
        act.postDelayed(new Runnable() { // from class: l.e8d
            @Override // java.lang.Runnable
            public final void run() {
                DebugUtil.m60211o9(act);
            }
        }, 800L);
    }

    /* JADX INFO: renamed from: Lj */
    public static void m59599Lj(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("好友上线提醒", new C9301w0(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: M1 */
    public static /* synthetic */ void m59602M1() {
        esc0.m122314a(esc0.f95585a);
        esc0.m122314a(esc0.f95586b);
        esc0.m122314a(esc0.f95587c);
        esc0.m122314a(esc0.f95588d);
    }

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ void m59605M4() {
        GreetingSummary greetingSummaryNew_ = GreetingSummary.new_();
        greetingSummaryNew_.unseen = 0;
        greetingSummaryNew_.latestTime = pzi0.m174454o();
        greetingSummaryNew_.latestUserId = "";
        greetingSummaryNew_.latestMessageId = "";
        CoreModule.f18264c.f20420r0.f20765d0.m137019l(greetingSummaryNew_);
    }

    /* JADX INFO: renamed from: M9 */
    public static /* synthetic */ void m59610M9(User user) {
        Studies studies = user.profile.studies;
        studies.active = true;
        studies.verified = true;
        double dGuessedCurrentServerTime = uqb0.f180376H.guessedCurrentServerTime() + 3600000;
        user.membership.expiresTime = dGuessedCurrentServerTime;
        List<Membership> list = user.memberships;
        if (list != null) {
            Iterator<Membership> it = list.iterator();
            while (it.hasNext()) {
                it.next().expiresTime = dGuessedCurrentServerTime;
            }
        }
        PicVerification picVerification = user.verifications;
        IdVerificationResult idVerificationResult = picVerification.idCard;
        if (idVerificationResult != null) {
            idVerificationResult.verified = true;
        }
        picVerification.picVerificationResult.verified = true;
        Location location = user.location;
        Passby passby = location.passby;
        if (passby != null) {
            passby.count = 10;
        } else {
            location.passby = Passby.new_();
            user.location.passby.count = 10;
        }
    }

    /* JADX INFO: renamed from: Ma */
    public static /* synthetic */ void m59611Ma(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = CoreModule.f18264c.f20405m0.f20136a0.m222761e();
        if (partialListOptM222761e.loaded == null) {
            return;
        }
        for (int i = 0; i < Math.min(partialListOptM222761e.loaded.size(), 10); i++) {
            pci.m171661J(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), CoreModule.f18264c.f20381e0.m116503Pa(partialListOptM222761e.loaded.get(i).f20214id));
        }
    }

    /* JADX INFO: renamed from: Mb */
    public static /* synthetic */ void m59612Mb(ArrayList arrayList) {
        arrayList.clear();
        CoreModule.f18264c.f20384f0.f20695l1.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: Md */
    public static /* synthetic */ void m59614Md() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89062K2;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Me */
    public static /* synthetic */ void m59615Me() {
        jxd0 jxd0Var = pza0.f154741I;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Mi */
    public static void m59619Mi(final ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("酒吧爱人", new x20() { // from class: l.fqc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60189n9(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
    }

    /* JADX INFO: renamed from: Mj */
    public static User m59620Mj(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        return (viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2().mo39821o() == null || viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2().mo39821o().m140259d() == null) ? CoreModule.f18264c.f20381e0.m116600p9() : viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2().mo39821o().m140259d();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m59621N() {
        jxd0 jxd0Var = CoreModule.f18264c.f20405m0.f20090J1;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: N1 */
    public static /* synthetic */ void m59623N1() {
        jxd0 jxd0Var = pza0.f154770f0;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ void m59626N4() {
        CoreModule.f18264c.f20373b1.f193008V.put("");
        CoreModule.f18264c.f20373b1.f193009W = null;
    }

    /* JADX INFO: renamed from: N5 */
    public static /* synthetic */ void m59627N5(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, View view) {
        OnlineMatchPushUser onlineMatchPushUser = new OnlineMatchPushUser();
        onlineMatchPushUser.name = "重生的小胖子";
        onlineMatchPushUser.userId = "349281368";
        CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileMiddle().formatted();
        onlineMatchPushUser.avatarUrl = "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2MlRQNldBSVFaM1ZRRFRPU01FSFdIS043Nk5RUTA0IiwidyI6MTk2MCwiaCI6MTk1OSwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjYxNzE0NDg5Nzk1MzUzMzg2ODAsImFiIjowfQ.jpg?format=128x128";
        onlineMatchPushUser.action = "";
        onlineMatchPushUser.gender = "female";
        onlineMatchPushUser.age = Constants.VIA_REPORT_TYPE_SHARE_TO_QQ;
        onlineMatchPushUser.distance = 100;
        onlineMatchPushUser.userTagList = jyb.m147487R(new String[]{"唱各萨达多个", "喜欢广场舞", "喜欢哈哈哈"}, new qcj() { // from class: l.qcd
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return DebugUtil.m59716Ra((String) obj);
            }
        });
        QuickChatCardWrapper quickChatCardWrapper = new QuickChatCardWrapper(onlineMatchPushUser);
        if (CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded.size() < 1) {
            return;
        }
        C4883c c4883c = CoreModule.f18264c;
        onlineMatchPushUser.user = c4883c.f20381e0.m116503Pa(c4883c.f20405m0.f20136a0.m222761e().loaded.get(1).f20214id);
        a8d0.m96437x0().m96438B0(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), quickChatCardWrapper);
    }

    /* JADX INFO: renamed from: Na */
    public static /* synthetic */ void m59632Na(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("清除限频次数", new x20() { // from class: l.znc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60172me();
            }
        }));
        arrayList.add(jyb.m147494Y("当前限频次数", new x20() { // from class: l.foc
            @Override // p153l.x20
            public final void call() {
                o1j0.m165636j(CoreModule.f18264c.f20313H1.f97078f0.get() + "");
            }
        }));
        arrayList.add(jyb.m147494Y("放开各种频次限制" + CoreModule.f18264c.f20313H1.f97079g0.get(), new x20() { // from class: l.goc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59348Aa();
            }
        }));
        arrayList.add(jyb.m147494Y("关闭SvipDebug：" + C8772a.m51429b0(), new x20() { // from class: l.ioc
            @Override // p153l.x20
            public final void call() {
                upm.f180293j = false;
            }
        }));
        arrayList.add(jyb.m147494Y("清除30分钟间隔：", new x20() { // from class: l.joc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20313H1.m123921a4();
            }
        }));
        arrayList.add(jyb.m147494Y("忽略本地超时：", new x20() { // from class: l.koc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59695Qa();
            }
        }));
        arrayList.add(jyb.m147494Y("Svip弹窗：", new x20() { // from class: l.loc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60452z8();
            }
        }));
        arrayList.add(jyb.m147494Y("探探币购买：", new x20() { // from class: l.moc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60205o3();
            }
        }));
        arrayList.add(jyb.m147494Y("探探币使用弹框：", new x20() { // from class: l.noc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59572Ke();
            }
        }));
        arrayList.add(jyb.m147494Y("打开关闭心动：", new x20() { // from class: l.ooc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59562K4();
            }
        }));
        arrayList.add(jyb.m147494Y("特权提示弹窗", new x20() { // from class: l.aoc
            @Override // p153l.x20
            public final void call() {
                upm.m197141f0(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), TabName.Card, null);
            }
        }));
        arrayList.add(jyb.m147494Y("恢复特权消耗提示", new x20() { // from class: l.boc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20313H1.f97070X.put(Boolean.FALSE);
            }
        }));
        arrayList.add(jyb.m147494Y("关闭debug搜索" + CoreModule.f18264c.f20313H1.f97071Y, new x20() { // from class: l.coc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20313H1.f97071Y = false;
            }
        }));
        arrayList.add(jyb.m147494Y("打开debug搜索" + CoreModule.f18264c.f20313H1.f97071Y, new x20() { // from class: l.doc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60376vk(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            }
        }));
        arrayList.add(jyb.m147494Y("心动阈值二期时间限制清除", new x20() { // from class: l.eoc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20313H1.f97076d0.put(0L);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Nc */
    public static /* synthetic */ void m59634Nc() {
        CoreModule.f18264c.f20396j0.f20046q0 = true;
        l51.m152919y(new RunnableC9292t0());
    }

    /* JADX INFO: renamed from: Nd */
    public static /* synthetic */ void m59635Nd(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("精选插卡", new x20() { // from class: l.p4d
            @Override // p153l.x20
            public final void call() {
                PicksHelper.INSTANCE.m57923b().m57920p(true);
            }
        }));
        arrayList.add(jyb.m147494Y("精选插卡动效", new x20() { // from class: l.q4d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59367B7(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Nf */
    public static /* synthetic */ void m59637Nf(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: Nh */
    public static /* synthetic */ void m59639Nh() {
        CoreModule.f18264c.f20381e0.f89328s6.put("");
        CoreModule.f18264c.f20381e0.f89285m7.put(0);
        CoreModule.f18264c.f20381e0.f89293n7.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: Ni */
    public static void m59640Ni(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("boost队列重构 清空数据", new x20() { // from class: l.qvc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59778U9();
            }
        }));
    }

    /* JADX INFO: renamed from: Nj */
    public static void m59641Nj(final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, final boolean z) {
        w1e.m204400d(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m204419D(10).m204430r("输入Userid").m204421F(new y20() { // from class: l.z9d
            @Override // p153l.y20
            public final void call(Object obj) {
                DebugUtil.m60308si(z, viewTreeObserverOnGlobalLayoutListenerC8017b, (String) obj);
            }
        }).m204426n().show();
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m59642O() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.virtualCardType = VirtualCardType.ExpandedNewUserRightGuide;
        CoreModule.f18264c.f20405m0.m32149t6(userInfo, 0, true);
    }

    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ void m59643O0(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        arrayList.add(PurchaseType.TYPE_O_DIAMOND);
        new neb0.C18861a(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), arrayList, null, null).m162852a(1).m162853b(new x20() { // from class: l.tcd
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60303sd();
            }
        }).m162854c(new y20() { // from class: l.ucd
            @Override // p153l.y20
            public final void call(Object obj) {
                DebugUtil.m59580L0((PurchaseType) obj);
            }
        }).m162857f(new y20() { // from class: l.vcd
            @Override // p153l.y20
            public final void call(Object obj) {
                DebugUtil.m59740Sd((PurchaseType) obj);
            }
        }).m162855d(new y20() { // from class: l.wcd
            @Override // p153l.y20
            public final void call(Object obj) {
                DebugUtil.m59806Vg((PurchaseType) obj);
            }
        }).m162856e(new a30() { // from class: l.xcd
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                DebugUtil.m60311t((PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).m162858g();
    }

    /* JADX INFO: renamed from: O1 */
    public static /* synthetic */ void m59644O1() {
        if (NullChecker.m82486a(CoreModule.f18264c) && NullChecker.m82486a(CoreModule.f18264c.f20405m0)) {
            CoreSuggested coreSuggested = CoreModule.f18264c.f20405m0;
            if (coreSuggested.f20138a2.containsKey(coreSuggested.m32140q6())) {
                CoreSuggested coreSuggested2 = CoreModule.f18264c.f20405m0;
                coreSuggested2.f20138a2.remove(coreSuggested2.m32140q6());
            } else {
                CoreSuggested coreSuggested3 = CoreModule.f18264c.f20405m0;
                coreSuggested3.f20138a2.put(coreSuggested3.m32140q6(), 0);
            }
        }
    }

    /* JADX INFO: renamed from: O2 */
    public static /* synthetic */ void m59645O2(String str) {
        Relationship relationship = new Relationship();
        ArrayList arrayList = new ArrayList();
        relationship.status = arrayList;
        arrayList.add(MatchFrom.get(MatchFrom.diamondReceived));
        C4910y.m35904i3(str, relationship).materialize().subscribe();
    }

    /* JADX INFO: renamed from: O5 */
    public static /* synthetic */ void m59648O5() {
    }

    /* JADX INFO: renamed from: O6 */
    public static /* synthetic */ void m59649O6() {
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = CoreModule.f18264c.f20405m0.f20136a0.m222761e();
        if (partialListOptM222761e == null || jyb.m147479J(partialListOptM222761e.loaded)) {
            return;
        }
        Iterator<CoreSuggested.UserInfo> it = partialListOptM222761e.loaded.iterator();
        while (it.hasNext()) {
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(it.next().f20214id);
            UserLiveState userLiveStateMo68455lt = CoreModule.m30934Q().mo68455lt(userM116503Pa.f56859id);
            if (userLiveStateMo68455lt == null) {
                userM116503Pa.liveState = UserLiveState.new_();
            } else {
                userM116503Pa.liveState = userLiveStateMo68455lt;
            }
            UserLiveState userLiveState = userM116503Pa.liveState;
            userLiveState.liveId = userM116503Pa.f56859id;
            userLiveState.callInfo.ongoingCall = true;
            userLiveState.state = LiveState.get("onlive");
            userM116503Pa.liveState.liveLabel = UserLiveLabel.new_();
            UserLiveLabel userLiveLabel = userM116503Pa.liveState.liveLabel;
            userLiveLabel.mainTitle = "直播中";
            userLiveLabel.subTitle = "多人连线已开启";
            CoreModule.m30934Q().putLiveState(Collections.singletonList(userM116503Pa));
        }
        CoreModule.f18264c.f20405m0.f20136a0.m137019l(partialListOptM222761e);
    }

    /* JADX INFO: renamed from: O7 */
    public static /* synthetic */ void m59650O7(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("VIP", new x20() { // from class: l.h5d
            @Override // p153l.x20
            public final void call() {
                new w8p.C21047a(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m205520i(jyb.m147507f0(PurchaseType.TYPE_GET_VIP), jyb.m147507f0(Privilege.vip_super_like)).m205515d(BuildConfig.BUILD_TYPE).m205522k();
            }
        }));
        arrayList.add(jyb.m147494Y("SVIP", new x20() { // from class: l.i5d
            @Override // p153l.x20
            public final void call() {
                new w8p.C21047a(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m205520i(jyb.m147507f0(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE), jyb.m147507f0(Privilege.see_who_likes_me)).m205515d(BuildConfig.BUILD_TYPE).m205522k();
            }
        }));
        arrayList.add(jyb.m147494Y("SVIP Premium折扣全屏", new x20() { // from class: l.k5d
            @Override // p153l.x20
            public final void call() {
                new zxo.C21918a(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m222058i(jyb.m147507f0(Privilege.see_who_likes_me)).m222053d(BuildConfig.BUILD_TYPE).m222059j();
            }
        }));
        arrayList.add(jyb.m147494Y("VIP+SVIP-默认vip", new x20() { // from class: l.l5d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60286ri(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("VIP+SVIP-默认svip", new x20() { // from class: l.m5d
            @Override // p153l.x20
            public final void call() {
                new w8p.C21047a(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m205520i(jyb.m147507f0(PurchaseType.TYPE_GET_VIP, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE), jyb.m147507f0(Privilege.vip_location, Privilege.svip_badge)).m205515d(BuildConfig.BUILD_TYPE).m205521j(1).m205522k();
            }
        }));
        arrayList.add(jyb.m147494Y("See", new x20() { // from class: l.n5d
            @Override // p153l.x20
            public final void call() {
                new w8p.C21047a(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m205520i(jyb.m147507f0(PurchaseType.TYPE_GET_LIKERS), jyb.m147507f0(Privilege.see_who_likes_me)).m205515d(BuildConfig.BUILD_TYPE).m205522k();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Oa */
    public static /* synthetic */ void m59653Oa() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.MinBoostCard;
        userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        Active active = new Active();
        active.f21083id = "boostactivecardid100";
        active.cardBackgroundUrl = "https://auto.tancdn.com/v1/raw/05959a2c-2543-4d35-aa98-83c0956d023e10.png";
        active.cardTitle = "Turbo Trial";
        active.cardBtnTitle = "Turbo Me";
        active.cardDesc = "Taste how boost bring matches to you with only 42 coins";
        active.cardLogo = "https://auto.tancdn.com/v1/raw/4524bd6c-e859-4a3a-a65f-4d7c6ce74e3711.png";
        userInfo.active = active;
        CoreModule.f18264c.f20405m0.m32157w6(userInfo, 3);
    }

    /* JADX INFO: renamed from: Oc */
    public static /* synthetic */ void m59655Oc(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        CoreModule.f18273l.m143407d().mo36915q4();
        gta.m132210e().m132211a().mo34649q4();
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().startActivity(CoreModule.f18273l.m143407d().mo36914Wo(viewTreeObserverOnGlobalLayoutListenerC8017b.getContext()));
    }

    /* JADX INFO: renamed from: Of */
    public static /* synthetic */ void m59658Of() {
        z5h0.m218675j().m218699x();
        z5h0.m218675j().f203046d.put(Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: Oi */
    public static void m59661Oi(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("boost重构", new C9266l1(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: Oj */
    public static void m59662Oj(final ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("破冰和联想表情优化", new x20() { // from class: l.ulc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60453z9(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m59663P(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        z99 z99Var = CoreModule.f18264c.f20414p0;
        z99Var.f203452S = 0.15d;
        z99Var.f203454U = 0.19d;
        fp5.m126530l(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), m59620Mj(viewTreeObserverOnGlobalLayoutListenerC8017b), BuildConfig.BUILD_TYPE, null);
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m59664P0(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        C4887e c4887e = CoreModule.f18264c.f20387g0;
        arrayList.add(jyb.m147494Y(C4887e.f20508D0.get().booleanValue() ? "关闭建群认证校验" : "打开群认证校验", new x20() { // from class: l.swc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60418xi();
            }
        }));
        arrayList.add(jyb.m147494Y("随机创建一个群", new x20() { // from class: l.twc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20387g0.m32926t6();
            }
        }));
        arrayList.add(jyb.m147494Y("清除气泡", new x20() { // from class: l.uwc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59410D6();
            }
        }));
        arrayList.add(jyb.m147494Y("最新的群消息，随机插入一些@逻辑", new x20() { // from class: l.wwc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20387g0.m32929u6(true, false);
            }
        }));
        arrayList.add(jyb.m147494Y("最新的群消息，随机插入一些@逻辑 有自己", new x20() { // from class: l.xwc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20387g0.m32929u6(false, true);
            }
        }));
        arrayList.add(jyb.m147494Y("最新的群消息，随机插入一个没有头像的", new x20() { // from class: l.ywc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20387g0.m32932v6();
            }
        }));
        C4887e c4887e2 = CoreModule.f18264c.f20387g0;
        arrayList.add(jyb.m147494Y(C4887e.f20507C0.get().booleanValue() ? "关闭V3" : "开启V3", new x20() { // from class: l.zwc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59818W7();
            }
        }));
        arrayList.add(jyb.m147494Y("跳转到固定的群", new x20() { // from class: l.axc
            @Override // p153l.x20
            public final void call() {
                nae0.m162083m(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), Uri.parse("tantanapp://group/chat?groupId=4233"));
            }
        }));
        arrayList.add(jyb.m147494Y("添加固定群组", new x20() { // from class: l.bxc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), new Runnable() { // from class: l.d8d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m59854Y1(viewTreeObserverOnGlobalLayoutListenerC8017b2);
                    }
                }, 300L);
            }
        }));
        arrayList.add(jyb.m147494Y("打开别的dlg", new x20() { // from class: l.cxc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60247q1(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: P1 */
    public static /* synthetic */ void m59665P1() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89334t5;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: P2 */
    public static /* synthetic */ void m59666P2(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("划卡优化开：" + CoreModule.f18264c.f20405m0.f20191s1.get(), new x20() { // from class: l.uqc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59517I3();
            }
        }));
        arrayList.add(jyb.m147494Y("底部debug：", new x20() { // from class: l.hrc
            @Override // p153l.x20
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC8017b.act().m40828n7();
            }
        }));
        arrayList.add(jyb.m147494Y("新UiDebug：" + CoreModule.f18264c.f20381e0.f89004B6.get(), new x20() { // from class: l.urc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60059ha();
            }
        }));
        arrayList.add(jyb.m147494Y("修改按钮样式：", new x20() { // from class: l.gsc
            @Override // p153l.x20
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC8017b.f22625J0.setButtonStyleType("oDiamond");
            }
        }));
        arrayList.add(jyb.m147494Y("贴纸Debug：" + CoreModule.f18264c.f20381e0.f89268k6.get(), new x20() { // from class: l.qsc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60329th();
            }
        }));
        arrayList.add(jyb.m147494Y("清空贴纸Debug：" + CoreModule.f18264c.f20381e0.f89268k6.get(), new x20() { // from class: l.rsc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20381e0.f89268k6.put(-1);
            }
        }));
        arrayList.add(jyb.m147494Y("划卡debug check：" + CoreModule.f18264c.f20381e0.f89244h6.get(), new x20() { // from class: l.ssc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60414xe();
            }
        }));
        arrayList.add(jyb.m147494Y("划卡debug 返回：" + CoreModule.f18264c.f20381e0.f89252i6.get(), new x20() { // from class: l.tsc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60159m1();
            }
        }));
        arrayList.add(jyb.m147494Y("强制黑金：", new x20() { // from class: l.usc
            @Override // p153l.x20
            public final void call() {
                TabUniteManager.m46136i().m46146r();
            }
        }));
        arrayList.add(jyb.m147494Y("认证成功Bubble", new x20() { // from class: l.vsc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), new Runnable() { // from class: l.a0d
                    @Override // java.lang.Runnable
                    public final void run() {
                        x5l0.m209399l(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), false, null);
                    }
                }, 1500L);
            }
        }));
        arrayList.add(jyb.m147494Y("自动滚动", new x20() { // from class: l.wqc
            @Override // p153l.x20
            public final void call() {
                l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), new Runnable() { // from class: l.s6d
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.f18264c.f20381e0.f89342u6.m137019l(uxj0.f181467a);
                    }
                }, 1500L);
            }
        }));
        arrayList.add(jyb.m147494Y("debug默认数据：" + CoreModule.f18264c.f20381e0.f89260j6.get(), new x20() { // from class: l.xqc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60430y8();
            }
        }));
        arrayList.add(jyb.m147494Y("认证相关数据清空：", new x20() { // from class: l.yqc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59639Nh();
            }
        }));
        arrayList.add(jyb.m147494Y("划卡上限弹窗：" + C8060m1.f22851g, new x20() { // from class: l.zqc
            @Override // p153l.x20
            public final void call() {
                C8060m1.f22851g = !C8060m1.f22851g;
            }
        }));
        arrayList.add(jyb.m147494Y("认证链路-头像确认：", new x20() { // from class: l.arc
            @Override // p153l.x20
            public final void call() {
                x5l0.m209400m(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), 1, BuildConfig.BUILD_TYPE);
            }
        }));
        arrayList.add(jyb.m147494Y("认证链路-身份证：", new x20() { // from class: l.brc
            @Override // p153l.x20
            public final void call() {
                x5l0.m209400m(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), 2, BuildConfig.BUILD_TYPE);
            }
        }));
        arrayList.add(jyb.m147494Y("认证链路-认证结果-头像", new x20() { // from class: l.crc
            @Override // p153l.x20
            public final void call() {
                AvatarResultAct.m57267g2(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), 1);
            }
        }));
        arrayList.add(jyb.m147494Y("认证链路-认证结果-身份证：", new x20() { // from class: l.drc
            @Override // p153l.x20
            public final void call() {
                AvatarResultAct.m57267g2(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), 2);
            }
        }));
        arrayList.add(jyb.m147494Y("认证链路-认证结果-国家网络：", new x20() { // from class: l.erc
            @Override // p153l.x20
            public final void call() {
                AvatarResultAct.m57267g2(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), 3);
            }
        }));
        arrayList.add(jyb.m147494Y("添加Debug控制：", new x20() { // from class: l.frc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59488Gi(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("新Ui demo：", new x20() { // from class: l.irc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().startActivity(new Intent(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), (Class<?>) LabelDemoAct.class));
            }
        }));
        arrayList.add(jyb.m147494Y("清空网图：", new x20() { // from class: l.jrc
            @Override // p153l.x20
            public final void call() {
                a0g.m95346B();
            }
        }));
        arrayList.add(jyb.m147494Y("插入引导填写资料卡：", new x20() { // from class: l.krc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60116k2();
            }
        }));
        arrayList.add(jyb.m147494Y("清空只看认证数据：", new x20() { // from class: l.lrc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20446z2.m31259x3();
            }
        }));
        arrayList.add(jyb.m147494Y("假请求：" + CoreModule.f18264c.f20446z2.f19968f0.get(), new x20() { // from class: l.mrc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59755T7();
            }
        }));
        arrayList.add(jyb.m147494Y("开启只看认证：" + CoreModule.f18264c.f20446z2.f19969g0.get(), new x20() { // from class: l.nrc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59345A7();
            }
        }));
        arrayList.add(jyb.m147494Y("展示认证成功后发送弹窗：", new x20() { // from class: l.orc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().postDelayed(new Runnable() { // from class: l.dad
                    @Override // java.lang.Runnable
                    public final void run() {
                        quq.m178186V(viewTreeObserverOnGlobalLayoutListenerC8017b2.act());
                    }
                }, 500L);
            }
        }));
        arrayList.add(jyb.m147494Y("插入新用户优化引导", new x20() { // from class: l.prc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59642O();
            }
        }));
        arrayList.add(jyb.m147494Y("照镜子忽略年龄：false", new x20() { // from class: l.qrc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60342u8();
            }
        }));
        arrayList.add(jyb.m147494Y("清空新手引导数据", new x20() { // from class: l.trc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60197nh();
            }
        }));
        arrayList.add(jyb.m147494Y("清除Save标记", new x20() { // from class: l.vrc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60182n2();
            }
        }));
        arrayList.add(jyb.m147494Y("清除理想型Save标记", new x20() { // from class: l.wrc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20322K1.f20747T.put(Boolean.FALSE);
            }
        }));
        arrayList.add(jyb.m147494Y("理想型设置滑动过N：" + CoreModule.f18264c.f20422r2.f137259b0.get(), new x20() { // from class: l.xrc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60023fi();
            }
        }));
        arrayList.add(jyb.m147494Y("插入点赞入口", new x20() { // from class: l.yrc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20322K1.m34241m3();
            }
        }));
        arrayList.add(jyb.m147494Y("每次都展示气泡" + CoreModule.f18264c.f20322K1.f20749V.get(), new x20() { // from class: l.zrc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59421Dh();
            }
        }));
        arrayList.add(jyb.m147494Y("额迈瑞卡：" + CoreModule.f18264c.f20405m0.f20194t1.get() + " - " + uqb0.f180400f0, new x20() { // from class: l.asc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60373vh();
            }
        }));
        StringBuilder sb = new StringBuilder("fake用户mock：");
        sb.append(CoreModule.f18264c.f20381e0.f89023E4.get());
        arrayList.add(jyb.m147494Y(sb.toString(), new x20() { // from class: l.bsc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59403D();
            }
        }));
        arrayList.add(jyb.m147494Y("fake用户买成弹窗：", new x20() { // from class: l.csc
            @Override // p153l.x20
            public final void call() {
                a0g.m95365U(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            }
        }));
        arrayList.add(jyb.m147494Y("跳转memo：", new x20() { // from class: l.esc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().startActivity(MemojiBuzzAct.INSTANCE.m48196a(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), "memoji_call"));
            }
        }));
        arrayList.add(jyb.m147494Y("划卡日志：" + BifrostLayout.f24063d, new x20() { // from class: l.fsc
            @Override // p153l.x20
            public final void call() {
                BifrostLayout.f24063d = !BifrostLayout.f24063d;
            }
        }));
        arrayList.add(jyb.m147494Y("清理引导标记：", new x20() { // from class: l.hsc
            @Override // p153l.x20
            public final void call() {
                vih0.m201338c().m201341a();
            }
        }));
        arrayList.add(jyb.m147494Y("新页面：", new x20() { // from class: l.isc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().postDelayed(new Runnable() { // from class: l.r6d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m60255q9(viewTreeObserverOnGlobalLayoutListenerC8017b2);
                    }
                }, 500L);
            }
        }));
        arrayList.add(jyb.m147494Y("设置打招呼卡：", new x20() { // from class: l.jsc
            @Override // p153l.x20
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC8017b.act().postDelayed(new Runnable() { // from class: l.x9d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m59389C7();
                    }
                }, 500L);
            }
        }));
        arrayList.add(jyb.m147494Y("网络信息：", new x20() { // from class: l.ksc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60410xa();
            }
        }));
        arrayList.add(jyb.m147494Y("输入首张User信息：", new x20() { // from class: l.lsc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60035g8();
            }
        }));
        arrayList.add(jyb.m147494Y("划卡提示View：" + CoreModule.f18264c.f20405m0.f20197u1.get(), new x20() { // from class: l.msc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60115k1();
            }
        }));
        arrayList.add(jyb.m147494Y("情况引导滑动：", new x20() { // from class: l.nsc
            @Override // p153l.x20
            public final void call() {
                uih0.m196223s0().m196268l1();
            }
        }));
        arrayList.add(jyb.m147494Y("延迟刷新：", new x20() { // from class: l.psc
            @Override // p153l.x20
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC8017b.act().postDelayed(new Runnable() { // from class: l.a9d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m59452F4();
                    }
                }, 1000L);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: P4 */
    public static /* synthetic */ Tag m59668P4(String str) {
        return new Tag(null, str);
    }

    /* JADX INFO: renamed from: P8 */
    public static /* synthetic */ void m59672P8(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("审核中是否可编辑实验）：" + CoreModule.f18264c.f20381e0.f89097P2.get(), new x20() { // from class: l.lwc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59518I4();
            }
        }));
        arrayList.add(jyb.m147494Y("单项功能限制（profile资料编辑）：" + CoreModule.f18264c.f20381e0.f89083N2.get(), new x20() { // from class: l.mwc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60170mc();
            }
        }));
        arrayList.add(jyb.m147494Y("单项功能限制（swipe划卡）：" + CoreModule.f18264c.f20381e0.f89090O2.get(), new x20() { // from class: l.nwc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60214oc();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: P9 */
    public static /* synthetic */ void m59673P9() {
        jxd0 jxd0Var = C8291a.f26041f;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        CoreModule.f18264c.f20384f0.f20647V0.put("https://m.tantanapp.com/static-pages/commerce/newuserguide.html?category=0");
        C4883c c4883c = CoreModule.f18264c;
        c4883c.f20384f0.f20641T0.put(gra.m131664c0(c4883c.f20381e0.m116600p9()));
        C4883c c4883c2 = CoreModule.f18264c;
        c4883c2.f20384f0.f20638S0.put(gra.m131651Z(c4883c2.f20381e0.m116600p9()));
    }

    /* JADX INFO: renamed from: Pa */
    public static /* synthetic */ void m59674Pa() {
    }

    /* JADX INFO: renamed from: Pb */
    public static /* synthetic */ void m59675Pb(VEditText vEditText) {
        String strTrim = vEditText.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        pza0.f154779k.put(Double.valueOf(Math.min(Math.max(Double.parseDouble(strTrim), 0.6d), 0.8d)));
    }

    /* JADX INFO: renamed from: Pe */
    public static /* synthetic */ void m59678Pe() {
        jxd0 jxd0Var = pza0.f154785n;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Pf */
    public static /* synthetic */ void m59679Pf(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        HashMap<String, SuggestedComplimentItem> mapM32110h6 = CoreModule.f18264c.f20405m0.m32110h6();
        if (mapM32110h6 == null || mapM32110h6.isEmpty()) {
            r1j0.m179420g("无 suggest 称赞数据");
            return;
        }
        Map.Entry<String, SuggestedComplimentItem> next = mapM32110h6.entrySet().iterator().next();
        final String key = next.getKey();
        final SuggestedComplimentItem value = next.getValue();
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = CoreModule.f18264c.f20405m0.f20136a0.m222761e();
        List<CoreSuggested.UserInfo> list = partialListOptM222761e == null ? null : partialListOptM222761e.loaded;
        CoreSuggested.UserInfo userInfo = jyb.m147479J(list) ? null : (CoreSuggested.UserInfo) jyb.m147529r(list, new qcj() { // from class: l.hcd
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((CoreSuggested.UserInfo) obj).f20214id, key));
            }
        });
        if (userInfo == null) {
            viewTreeObserverOnGlobalLayoutListenerC8017b.act().duringCreated(CoreModule.f18264c.f20381e0.m116527W9(key)).subscribe(psd0.m173597H(new y20() { // from class: l.kcd
                @Override // p153l.y20
                public final void call(Object obj) {
                    DebugUtil.m59535J(key, value, (uxj0) obj);
                }
            }, new y20() { // from class: l.lcd
                @Override // p153l.y20
                public final void call(Object obj) {
                    r1j0.m179420g("拉取用户失败");
                }
            }));
        } else {
            userInfo.compliment = value;
            CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0).subscribe(psd0.m173597H(new y20() { // from class: l.icd
                @Override // p153l.y20
                public final void call(Object obj) {
                    r1j0.m179420g("已移到顶部");
                }
            }, new y20() { // from class: l.jcd
                @Override // p153l.y20
                public final void call(Object obj) {
                    DebugUtil.m60160m2((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Pg */
    public static /* synthetic */ void m59680Pg(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, Dialog dialog, View view, int i, CharSequence charSequence) {
        switch (i) {
            case 0:
                jxd0 jxd0Var = pza0.f154773h;
                jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
                break;
            case 1:
                jxd0 jxd0Var2 = pza0.f154771g;
                jxd0Var2.put(Boolean.valueOf(!jxd0Var2.get().booleanValue()));
                break;
            case 2:
                final VEditText vEditText = new VEditText(viewTreeObserverOnGlobalLayoutListenerC8017b.getContext());
                vEditText.setLayoutParams(new FrameLayout.LayoutParams(-1, qa00.f156288A));
                vEditText.setInputType(8192);
                vEditText.setText(String.valueOf(pza0.f154779k.get()));
                vEditText.setSelection(vEditText.getText().length());
                viewTreeObserverOnGlobalLayoutListenerC8017b.act().dialog().m21519P(vEditText, false).m21555t0(R$string.f19693u, new Runnable() { // from class: l.w2d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m59675Pb(vEditText);
                    }
                }).m21566z().show();
                break;
            case 3:
                pza0.f154777j.put(640);
                break;
            case 4:
                pza0.f154777j.put(720);
                break;
            case 5:
                pza0.f154777j.put(1080);
                break;
            case 6:
                pza0.f154777j.put(1440);
                break;
            case 7:
                jxd0 jxd0Var3 = pza0.f154775i;
                jxd0Var3.put(Boolean.valueOf(!jxd0Var3.get().booleanValue()));
                break;
            case 8:
                StringBuilder sb = new StringBuilder("Model: ");
                sb.append(b0e.m101293g());
                sb.append("\nBrand: ");
                sb.append(b0e.m101288b());
                sb.append("\nHardWare: ");
                sb.append(b0e.m101292f());
                sb.append("\nRAM容量: ");
                sb.append(b0e.m101295i(viewTreeObserverOnGlobalLayoutListenerC8017b.act()));
                sb.append("\nCPU核数: ");
                sb.append(b0e.m101294h());
                sb.append("\nCPU最大主频: ");
                sb.append(b0e.m101289c());
                sb.append("\n屏幕分辨率: ");
                DisplayMetrics displayMetrics = viewTreeObserverOnGlobalLayoutListenerC8017b.act().getResources().getDisplayMetrics();
                sb.append(displayMetrics.widthPixels + BaseSei.f14624X + displayMetrics.heightPixels);
                sb.append("\n\n");
                int iM101297k = b0e.m101297k(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
                if (iM101297k == 2) {
                    sb.append("当前机型为高端机型");
                } else if (iM101297k == 1) {
                    sb.append("当前机型为中端机型");
                } else if (iM101297k == 0) {
                    sb.append("当前机型为低端机型");
                }
                VText vText = new VText(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
                vText.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                vText.setText(sb.toString());
                viewTreeObserverOnGlobalLayoutListenerC8017b.act().dialog().m21519P(vText, false).m21566z().show();
                break;
        }
    }

    /* JADX INFO: renamed from: Ph */
    public static /* synthetic */ void m59681Ph() {
        Message messageNew_ = Message.new_();
        messageNew_.value = "你好，我叫小宇，现在在北京工作，老家是湖南长沙，我性格外向";
        messageNew_.messageType = MessageType.get(MessageType.marriage_prologue);
        CoreModule.f18264c.f20384f0.f20705o2.clear();
        CoreModule.f18264c.f20384f0.f20705o2.add(messageNew_);
    }

    /* JADX INFO: renamed from: Pi */
    public static void m59682Pi(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("推荐卡片4变3张", new C9307y0(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: Pj */
    public static void m59683Pj(final ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("网络请求真人认证", new x20() { // from class: l.itc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60234pa(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m59684Q(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("单Tab模式（payWillScore>=0.19）", new x20() { // from class: l.b0d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59594Le(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("双Tab模式（payWillScore<0.19）", new x20() { // from class: l.c0d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59663P(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("测试顶部通知弹层", new x20() { // from class: l.d0d
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                fp5.m126534p(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), DebugUtil.m59620Mj(viewTreeObserverOnGlobalLayoutListenerC8017b2), "Wow, seriously! You look absolutely ripped in that photo! 💪");
            }
        }));
        arrayList.add(jyb.m147494Y("顶部卡片添加 compliment", new x20() { // from class: l.e0d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60257qb(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("收到称赞用户插入到卡片栈顶部", new x20() { // from class: l.h0d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59679Pf(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Q1 */
    public static /* synthetic */ void m59686Q1(int[] iArr, int i, CoreSuggested.UserInfo userInfo) {
        if (iArr[0] >= i) {
            return;
        }
        UserWithRelationShip userWithRelationShipNew_ = UserWithRelationShip.new_();
        userWithRelationShipNew_.userId = userInfo.f20214id;
        Relationship relationshipNew_ = Relationship.new_();
        relationshipNew_.status.add(MatchFrom.get("pinLike"));
        relationshipNew_.updateTime = pzi0.m174454o() - TimeUnit.HOURS.toMillis(iArr[0]);
        userWithRelationShipNew_.relationship = relationshipNew_;
        CoreModule.f18264c.f20383e2.f153006U.add(userWithRelationShipNew_);
        userInfo.isPinLike = true;
        userInfo.topLikeRelationship = relationshipNew_;
        iArr[0] = iArr[0] + 1;
    }

    /* JADX INFO: renamed from: Q3 */
    public static /* synthetic */ void m59688Q3() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.DailySelectionAdCard;
        userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: Q4 */
    public static /* synthetic */ void m59689Q4(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        User userMo225055clone = CoreModule.f18264c.f20381e0.m116600p9().mo225055clone();
        userMo225055clone.profile.extensions.profileCompletion.briefIntroduction = jyb.m147500c(Collections.EMPTY_LIST, "我是一个up主");
        User userSubtract = userMo225055clone.subtract(CoreModule.f18264c.f20381e0.m116600p9());
        if (NullChecker.m82486a(userSubtract)) {
            viewTreeObserverOnGlobalLayoutListenerC8017b.act().duringCreated(CoreModule.f18264c.f20381e0.m116620u9(userSubtract)).subscribe(psd0.m173597H(new y20() { // from class: l.ztc
                @Override // p153l.y20
                public final void call(Object obj) {
                    o1j0.m165651y(CoreModule.f18264c.f20381e0.m116600p9().profile.extensions.profileCompletion.toJson());
                }
            }, new y20() { // from class: l.auc
                @Override // p153l.y20
                public final void call(Object obj) {
                    o1j0.m165651y(((Throwable) obj).getMessage());
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Q6 */
    public static /* synthetic */ void m59691Q6() {
        jxd0 jxd0Var = pza0.f154750R;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Qa */
    public static /* synthetic */ void m59695Qa() {
        upm.f180294k = true;
        upm.f180293j = true;
    }

    /* JADX INFO: renamed from: Qe */
    public static /* synthetic */ void m59699Qe(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("划卡优化，清理蒙层", new x20() { // from class: l.hvc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60416xg();
            }
        }));
        arrayList.add(jyb.m147494Y("展示设置蒙层", new x20() { // from class: l.ivc
            @Override // p153l.x20
            public final void call() {
                l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), new Runnable() { // from class: l.y3d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m59581L1();
                    }
                }, 1500L);
            }
        }));
        arrayList.add(jyb.m147494Y("显示superlike动画", new x20() { // from class: l.jvc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), new Runnable() { // from class: l.o0d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b3 = viewTreeObserverOnGlobalLayoutListenerC8017b2;
                        z5h0.m218666M(viewTreeObserverOnGlobalLayoutListenerC8017b3.m38344q2(), viewTreeObserverOnGlobalLayoutListenerC8017b3.m38388z2(), viewTreeObserverOnGlobalLayoutListenerC8017b3.m38137C2().getRealView(), 1300);
                    }
                }, 1500L);
            }
        }));
        arrayList.add(jyb.m147494Y("清除所有标记", new x20() { // from class: l.kvc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59418De();
            }
        }));
        arrayList.add(jyb.m147494Y("所有都有letter", new x20() { // from class: l.lvc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60357v1();
            }
        }));
        arrayList.add(jyb.m147494Y("所有都有新喜欢", new x20() { // from class: l.mvc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59844Xc();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Qg */
    public static /* synthetic */ void m59701Qg() {
        jxd0 jxd0Var = pza0.f154753U;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Qh */
    public static /* synthetic */ void m59702Qh(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("首页启动介绍弹窗", new x20() { // from class: l.z0d
            @Override // p153l.x20
            public final void call() {
                new ly80(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "").show();
            }
        }));
        arrayList.add(jyb.m147494Y("首页启动介绍弹窗清除本地记录", new x20() { // from class: l.a1d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60253q7();
            }
        }));
        arrayList.add(jyb.m147494Y("购买弹窗-私人定制特权", new x20() { // from class: l.b1d
            @Override // p153l.x20
            public final void call() {
                C8927c.m54670r0(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), BuildConfig.BUILD_TYPE);
            }
        }));
        arrayList.add(jyb.m147494Y("购买弹窗-私人定制+黑金", new x20() { // from class: l.d1d
            @Override // p153l.x20
            public final void call() {
                C8927c.m54627c0(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), BuildConfig.BUILD_TYPE);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Qi */
    public static void m59703Qi(final ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("认证优化Q4", new x20() { // from class: l.ysc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60060hb(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
    }

    /* JADX INFO: renamed from: Qj */
    public static void m59704Qj(final ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("弹窗管控", new x20() { // from class: l.ipc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60078i7(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m59705R(Throwable th) {
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m59706R0() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.AdCard;
        userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        List<OMSAdCardInfo> listM172576h = pk50.m172568j().m172576h();
        if (jyb.m147479J(listM172576h)) {
            return;
        }
        userInfo.extensionObject = listM172576h.get(0);
        CoreModule.f18264c.f20405m0.m32157w6(userInfo, 1);
        CoreModule.f18264c.f20405m0.f20114S1.put(userInfo, 1);
    }

    /* JADX INFO: renamed from: R1 */
    public static /* synthetic */ void m59707R1() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89002B4;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: R3 */
    public static /* synthetic */ void m59709R3(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("VIP落地页", new x20() { // from class: l.f1d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60041ge(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("SVIP落地页", new x20() { // from class: l.g1d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59519I5(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("黑金会员落地页", new x20() { // from class: l.h1d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59735S8(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: R4 */
    public static /* synthetic */ void m59710R4() {
        jxd0 jxd0Var = C4909x.f20879S;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: R5 */
    public static /* synthetic */ void m59711R5(User user) {
        double dM174454o = (pzi0.m174454o() / 1000.0d) + 86400.0d;
        int i = 0;
        while (true) {
            String[][] strArr = f39108j;
            if (i >= strArr.length) {
                return;
            }
            String[] strArr2 = strArr[i];
            int i2 = Integer.parseInt(strArr2[2]);
            String strM60003ek = m60003ek(i2);
            m59958cj(strM60003ek, strArr2[1], ((double) (strArr.length - i)) + dM174454o, strM60003ek);
            m59511Hj(user, strM60003ek, i2);
            i++;
        }
    }

    /* JADX INFO: renamed from: Ra */
    public static /* synthetic */ Tag m59716Ra(String str) {
        return new Tag(null, str);
    }

    /* JADX INFO: renamed from: Rc */
    public static /* synthetic */ void m59718Rc(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("还原速度", new x20() { // from class: l.avc
            @Override // p153l.x20
            public final void call() {
                fcj.m125015b(1);
            }
        }));
        arrayList.add(jyb.m147494Y("x2速度", new x20() { // from class: l.bvc
            @Override // p153l.x20
            public final void call() {
                fcj.m125015b(2);
            }
        }));
        arrayList.add(jyb.m147494Y("x5速度", new x20() { // from class: l.dvc
            @Override // p153l.x20
            public final void call() {
                fcj.m125015b(5);
            }
        }));
        arrayList.add(jyb.m147494Y("x10速度", new x20() { // from class: l.evc
            @Override // p153l.x20
            public final void call() {
                fcj.m125015b(10);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Rg */
    public static /* synthetic */ void m59722Rg(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("测试广告框架", new x20() { // from class: l.tad
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().startActivity(new Intent(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), (Class<?>) DebugSplashTTAdAct.class));
            }
        }));
        arrayList.add(jyb.m147494Y("开屏广告", new x20() { // from class: l.uad
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().startActivity(new Intent(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), (Class<?>) DebugSplashAdAct.class));
            }
        }));
        arrayList.add(jyb.m147494Y("SDK助手", new x20() { // from class: l.vad
            @Override // p153l.x20
            public final void call() {
                gej.m130013a(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Rh */
    public static /* synthetic */ void m59723Rh() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89300o6;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Ri */
    public static void m59724Ri(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("真人认证优化", new C9262k1(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: Rj */
    public static void m59725Rj() {
        final User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        l51.m152919y(new Runnable() { // from class: l.z7d
            @Override // java.lang.Runnable
            public final void run() {
                DebugUtil.m60034g7(userM116600p9);
            }
        });
    }

    /* JADX INFO: renamed from: S7 */
    public static /* synthetic */ void m59734S7() {
        jxd0 jxd0Var = pza0.f154755W;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: S8 */
    public static /* synthetic */ void m59735S8(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        Intent intentM57420c2 = VipAct.m57420c2(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), eql0.m121937p0(PurchaseType.TYPE_O_DIAMOND));
        Intent intentM213301A = xwa.m213301A(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), null, "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/pricey-member/index.html?speed=true&_bid=1003173&hideNavigationBar=1&hideNotch=1&webviewColor=181614&expiresTime=1699341086000&duration=2592000", true, true, true);
        intentM213301A.putExtra("hideNotch", true);
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().startActivities(new Intent[]{intentM57420c2, intentM213301A});
    }

    /* JADX INFO: renamed from: S9 */
    public static /* synthetic */ void m59736S9(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("清除'我'的tab，谁看过我入口假红点时间戳", new x20() { // from class: l.x8d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59482Gc();
            }
        }));
        arrayList.add(jyb.m147494Y("清除'谁看过我'第二个tab访问时间戳", new x20() { // from class: l.y8d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59377Bh();
            }
        }));
        arrayList.add(jyb.m147494Y("清除'恢复足迹'标记", new x20() { // from class: l.z8d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59967d6();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Sa */
    public static /* synthetic */ void m59737Sa() {
        jxd0 jxd0Var = pza0.f154772g0;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Sd */
    public static /* synthetic */ void m59740Sd(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: Sf */
    public static /* synthetic */ void m59742Sf(String str, uxj0 uxj0Var) {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f20214id = str;
        userInfo.meetAgain = true;
        if (CoreModule.f18264c.f20384f0.m34185xh(str)) {
            CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0);
        } else {
            o1j0.m165651y("非配对好友");
        }
    }

    /* JADX INFO: renamed from: Si */
    public static void m59745Si(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("历史消息cell激活", new C9310z0(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: Sj */
    public static void m59746Sj(final ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("国际化黑金单次购买", new x20() { // from class: l.fnc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59901a6(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m59747T() {
        s0e0 s0e0Var = s0e0.INSTANCE;
        s0e0Var.m183923b();
        s0e0Var.m183924c();
    }

    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ void m59748T0() {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.ai_picture_query_auth);
        CoreModule.f18264c.f20384f0.f20705o2.clear();
        CoreModule.f18264c.f20384f0.f20705o2.add(messageNew_);
    }

    /* JADX INFO: renamed from: T1 */
    public static /* synthetic */ void m59749T1() {
        jxd0 jxd0Var = CoreModule.f18264c.f20384f0.f20653X0;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: T4 */
    public static /* synthetic */ void m59752T4() {
        jxd0 jxd0Var = z7x.f203279b;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: T5 */
    public static /* synthetic */ void m59753T5(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        ybh0.C21557b c21557b = new ybh0.C21557b();
        c21557b.m215072a(2);
        c21557b.m215074c(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
    }

    /* JADX INFO: renamed from: T7 */
    public static /* synthetic */ void m59755T7() {
        jxd0 jxd0Var = CoreModule.f18264c.f20446z2.f19968f0;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: T8 */
    public static /* synthetic */ void m59756T8() {
        jxd0 jxd0Var = pza0.f154754V;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: T9 */
    public static /* synthetic */ void m59757T9() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89324s2;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Ta */
    public static /* synthetic */ void m59758Ta(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        PurchaseType purchaseType = PurchaseType.TYPE_O_PLATINUM;
        new C8941c.a(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), purchaseType, null).m55277g(j690.m143619k(purchaseType.getPrivilegeData(null), null)).m55278h();
    }

    /* JADX INFO: renamed from: Td */
    public static /* synthetic */ void m59761Td(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        String str = "first_left_slide_" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        new jxd0(str, bool).put(bool);
        new oi40(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).show();
    }

    /* JADX INFO: renamed from: Te */
    public static /* synthetic */ void m59762Te(CoreSuggested.UserInfo userInfo) {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(userInfo.f20214id);
        if (NullChecker.m82486a(userM116503Pa) && NullChecker.m82486a(userM116503Pa.settings) && !jyb.m147479J(userM116503Pa.settings.settingGroups)) {
            SettingGroups settingGroups = userM116503Pa.settings.settingGroups.get(0);
            if (NullChecker.m82486a(settingGroups)) {
                if (NullChecker.m82486a(settingGroups.comDiamond)) {
                    settingGroups.comDiamond.isODiamond = true;
                    return;
                }
                ComDiamond comDiamondNew_ = ComDiamond.new_();
                comDiamondNew_.isODiamond = true;
                settingGroups.comDiamond = comDiamondNew_;
            }
        }
    }

    /* JADX INFO: renamed from: Tg */
    public static /* synthetic */ void m59764Tg(EditText editText, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        String strTrim = editText.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        Intent intentM213311f = xwa.m213311f(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
        intentM213311f.putExtra("extra_join_group_id", strTrim);
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().startActivity(intentM213311f);
    }

    /* JADX INFO: renamed from: Ti */
    public static void m59766Ti(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("聊天助手", new C9250h1(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: Tj */
    public static void m59767Tj(final ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("国际化全屏购买弹窗【汇总】", new x20() { // from class: l.tqc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59650O7(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m59769U0(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(0, jyb.m147494Y("身份证认证", new x20() { // from class: l.jpc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.m38344q2().startActivity(NationalIdAuthAct.m57255X1(viewTreeObserverOnGlobalLayoutListenerC8017b2.m38344q2().getContext(), "mainDebug"));
            }
        }));
        arrayList.add(1, jyb.m147494Y("身份证认证成功dlg", new x20() { // from class: l.kpc
            @Override // p153l.x20
            public final void call() {
                xc20.m210112x(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), null);
            }
        }));
        arrayList.add(1, jyb.m147494Y("身份证认证状态查询", new x20() { // from class: l.lpc
            @Override // p153l.x20
            public final void call() {
                o1j0.m165636j("认证状态为:".concat(CoreModule.f18264c.f20381e0.m116600p9().isIdCardVerified() ? "已认证" : "未认证"));
            }
        }));
        arrayList.add(1, jyb.m147494Y("实时查询认证状态", new x20() { // from class: l.mpc
            @Override // p153l.x20
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC8017b.act().duringCreated(CoreModule.f18264c.f20294B0.m32620p4(CoreModule.m30929H().userId())).subscribe(psd0.m173597H(new y20() { // from class: l.a8d
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m59924b7((uxj0) obj);
                    }
                }, new y20() { // from class: l.b8d
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m60071i0((Throwable) obj);
                    }
                }));
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: U1 */
    public static /* synthetic */ void m59770U1() {
        CoreModule.f18264c.f20381e0.f89123S4.put(0L);
        CoreModule.f18264c.f20381e0.f89099P4.put(0L);
        CoreModule.f18264c.f20381e0.f89107Q4.put(0L);
        CoreModule.f18264c.f20381e0.f89115R4.put(0);
        CoreModule.f18264c.f20381e0.f89131T4.put(0);
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ void m59772U3(MatchSuccessAnimTime matchSuccessAnimTime, String str) {
        try {
            matchSuccessAnimTime.female_exit_time = Integer.parseInt(str);
            CoreModule.f18264c.f20381e0.f89217e3.put(matchSuccessAnimTime.toJson());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: U4 */
    public static /* synthetic */ void m59773U4(Notification notification) {
        if (NullChecker.m82486a(AccessToken.m7462d())) {
            z0w.m218186m().m218213u();
        }
    }

    /* JADX INFO: renamed from: U6 */
    public static /* synthetic */ void m59775U6() {
        CoreModule.f18264c.f20381e0.f89254j0.put(0L);
        CoreModule.f18264c.f20381e0.f89278m0.put(0L);
        CoreModule.f18264c.f20381e0.f89262k0.put(new HashSet());
        CoreModule.f18264c.f20381e0.f89270l0.put(0L);
        CoreModule.f18264c.f20381e0.f89286n0.put(0L);
        CoreModule.f18264c.f20381e0.f89294o0.put(new HashSet());
        CoreModule.f18264c.f20381e0.f89301p0.put(0L);
        CoreModule.f18264c.f20381e0.f89308q0.put(new HashSet());
        CoreModule.f18264c.f20381e0.f89315r0.put(0L);
        CoreModule.f18264c.f20381e0.f89322s0.put(new HashSet());
    }

    /* JADX INFO: renamed from: U7 */
    public static /* synthetic */ void m59776U7() {
        jxd0 jxd0Var = pza0.f154769f;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: U9 */
    public static /* synthetic */ void m59778U9() {
        CoreModule.f18264c.f20381e0.f89307p6.clear();
        CoreModule.f18264c.f20381e0.f89314q6.clear();
        CoreModule.f18264c.f20381e0.f89321r6.clear();
    }

    /* JADX INFO: renamed from: Ua */
    public static /* synthetic */ void m59779Ua(Throwable th) {
    }

    /* JADX INFO: renamed from: Uc */
    public static /* synthetic */ void m59781Uc() {
        C7997b.m37423r().m37435o();
        o1j0.m165651y("已清除");
    }

    /* JADX INFO: renamed from: Ud */
    public static /* synthetic */ void m59782Ud(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y(zg6.m219594e() ? "关闭优化" : "打开优化", new x20() { // from class: l.ttc
            @Override // p153l.x20
            public final void call() {
                zg6.m219598i(!zg6.m219594e());
            }
        }));
        arrayList.add(jyb.m147494Y(zg6.m219595f() ? "关闭同步Counter" : "打开同步Counter", new x20() { // from class: l.utc
            @Override // p153l.x20
            public final void call() {
                zg6.m219599j(!zg6.m219595f());
            }
        }));
        arrayList.add(jyb.m147494Y("检查本地Counversation Counter数据上报", new x20() { // from class: l.wtc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60407x7();
            }
        }));
        arrayList.add(jyb.m147494Y("检查数据上报", new x20() { // from class: l.xtc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m34208ze(true);
            }
        }));
        arrayList.add(jyb.m147494Y("清除本地数据", new x20() { // from class: l.ytc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20381e0.f89358x1.put(0L);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Ue */
    public static /* synthetic */ void m59783Ue() {
        TabUniteManager.m46136i().m46137h(TabUniteManager.BadgeIconType.BOOST);
        TabUniteManager.m46136i().m46137h(TabUniteManager.BadgeIconType.BOOST_ONCE);
    }

    /* JADX INFO: renamed from: Ui */
    public static void m59787Ui(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("找个聊天搭子", new C9231c2(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: Uj */
    public static void m59788Uj(final ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("国际化外露喜欢", new x20() { // from class: l.ppc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59456F8(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ void m59790V0() {
        jxd0 jxd0Var = pza0.f154762b0;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        pza0.f154764c0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: V1 */
    public static /* synthetic */ void m59791V1() {
        CoreModule.f18264c.f20381e0.f89249i3.put(0L);
        CoreModule.f18264c.f20381e0.f89241h3.put(0);
    }

    /* JADX INFO: renamed from: V6 */
    public static /* synthetic */ void m59796V6(final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, final String str) {
        Pattern patternCompile = Pattern.compile("[0-9]*");
        if (TextUtils.isEmpty(str) || !patternCompile.matcher(str).matches() || TextUtils.isEmpty(str)) {
            return;
        }
        l51.m152887G(new Runnable() { // from class: l.wad
            @Override // java.lang.Runnable
            public final void run() {
                non.m164145g(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), new non.C18915a(str, ""), "");
            }
        });
    }

    /* JADX INFO: renamed from: V7 */
    public static /* synthetic */ void m59797V7(String str) {
        Relationship relationship = new Relationship();
        relationship.status = new ArrayList();
        C4910y.m35904i3(str, relationship).materialize().subscribe();
    }

    /* JADX INFO: renamed from: V8 */
    public static /* synthetic */ void m59798V8() {
        jxd0 jxd0Var = baj.f75700a;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Va */
    public static /* synthetic */ void m59800Va() {
        CoreModule.f18264c.f20419q2.f180581U.clear();
        CoreModule.f18264c.f20419q2.f180582V.clear();
        CoreModule.f18264c.f20419q2.f180580T.clear();
    }

    /* JADX INFO: renamed from: Vc */
    public static /* synthetic */ void m59802Vc(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, Questionnaire questionnaire) {
        if (!NullChecker.m82486a(questionnaire) || jyb.m147479J(questionnaire.options)) {
            return;
        }
        new jrj0(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m146777A0(questionnaire);
    }

    /* JADX INFO: renamed from: Ve */
    public static /* synthetic */ void m59804Ve(Boolean bool) {
    }

    /* JADX INFO: renamed from: Vg */
    public static /* synthetic */ void m59806Vg(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: Vh */
    public static /* synthetic */ void m59807Vh() {
    }

    /* JADX INFO: renamed from: Vi */
    public static void m59808Vi(final ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("聊天真实性", new x20() { // from class: l.lxc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60203o1(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
    }

    /* JADX INFO: renamed from: Vj */
    public static void m59809Vj(final ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("国际化黑金", new x20() { // from class: l.byc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59966d5(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m59811W0() {
        Message messageNew_ = Message.new_();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("needOpen", true);
            MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
            messageNew_.additionalData = messageAdditionalDataNew_;
            messageAdditionalDataNew_.chatGiftInfo = ChatGiftInfo.new_();
            ChatGiftInfo chatGiftInfo = messageNew_.additionalData.chatGiftInfo;
            chatGiftInfo.f21103id = "116";
            chatGiftInfo.extra = jSONObject.toString(1);
            messageNew_.messageType = MessageType.get(MessageType.chat_gift);
            CoreModule.f18264c.f20384f0.f20705o2.clear();
            CoreModule.f18264c.f20384f0.f20705o2.add(messageNew_);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            iig0.m140070a(e);
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m59814W3() {
        jxd0 jxd0Var = pza0.f154749Q;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: W7 */
    public static /* synthetic */ void m59818W7() {
        C4887e c4887e = CoreModule.f18264c.f20387g0;
        jxd0 jxd0Var = C4887e.f20507C0;
        C4887e c4887e2 = CoreModule.f18264c.f20387g0;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Wf */
    public static /* synthetic */ void m59826Wf(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("清除拍一拍", new x20() { // from class: l.jtc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60285rh();
            }
        }));
        arrayList.add(jyb.m147494Y("清除两次记录", new x20() { // from class: l.ltc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59626N4();
            }
        }));
        arrayList.add(jyb.m147494Y("清除拍一拍全部逻辑", new x20() { // from class: l.mtc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59874Z0();
            }
        }));
        arrayList.add(jyb.m147494Y("检查文案", new x20() { // from class: l.ntc
            @Override // p153l.x20
            public final void call() {
                C8687b.f32609c = true;
            }
        }));
        arrayList.add(jyb.m147494Y("不检查文案", new x20() { // from class: l.otc
            @Override // p153l.x20
            public final void call() {
                C8687b.f32609c = false;
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Wg */
    public static /* synthetic */ void m59827Wg() {
    }

    /* JADX INFO: renamed from: Wh */
    public static /* synthetic */ void m59828Wh(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        ArrayList arrayList = new ArrayList();
        for (Merchandise merchandise : du80.m118106g().m118111d(true)) {
            if (arrayList.size() >= 2) {
                break;
            } else if (TEnum.equals(merchandise.category, "svip")) {
                arrayList.add(merchandise);
            }
        }
        PriceRecallGetSurprise2Dialog.m51672l(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), arrayList, true);
    }

    /* JADX INFO: renamed from: Wi */
    public static void m59829Wi(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("验证二维码", new C9258j1(viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: Wj */
    public static void m59830Wj(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("男性心动信号二期", new C9283q0(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m59833X1() {
    }

    /* JADX INFO: renamed from: X2 */
    public static /* synthetic */ void m59834X2(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("清除体验弹窗数据", new x20() { // from class: l.v6d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59523I9();
            }
        }));
        arrayList.add(jyb.m147494Y("划卡体验弹窗一", new x20() { // from class: l.w6d
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().duringCreated(CoreModule.f18264c.f20431u2.m139433c3(QuestionnaireScene.get("swipe"), QuestionnaireStrategy.get("default"))).subscribe(psd0.m173597H(new y20() { // from class: l.jac
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m59848Xg(viewTreeObserverOnGlobalLayoutListenerC8017b2, (Questionnaire) obj);
                    }
                }, new y20() { // from class: l.kac
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m59779Ua((Throwable) obj);
                    }
                }));
            }
        }));
        arrayList.add(jyb.m147494Y("划卡体验弹窗二", new x20() { // from class: l.x6d
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().duringCreated(CoreModule.f18264c.f20431u2.m139433c3(QuestionnaireScene.get("swipe"), QuestionnaireStrategy.get(QuestionnaireStrategy.lowLikeRatio))).subscribe(psd0.m173597H(new y20() { // from class: l.z9c
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m59802Vc(viewTreeObserverOnGlobalLayoutListenerC8017b2, (Questionnaire) obj);
                    }
                }, new y20() { // from class: l.aac
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m60402x2((Throwable) obj);
                    }
                }));
            }
        }));
        arrayList.add(jyb.m147494Y("消息列表体验弹窗", new x20() { // from class: l.y6d
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().duringCreated(CoreModule.f18264c.f20431u2.m139433c3(QuestionnaireScene.get("message"), null)).subscribe(psd0.m173597H(new y20() { // from class: l.rbd
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m59996ed(viewTreeObserverOnGlobalLayoutListenerC8017b2, (Questionnaire) obj);
                    }
                }, new y20() { // from class: l.sbd
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m60093j1((Throwable) obj);
                    }
                }));
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m59835X3(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("试用购买大页面", new x20() { // from class: l.k9d
            @Override // p153l.x20
            public final void call() {
                C8927c.m54573F0(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), BuildConfig.BUILD_TYPE);
            }
        }));
        arrayList.add(jyb.m147494Y("插入See试用聚合会话", new x20() { // from class: l.l9d
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m34105qq(pzi0.m174454o());
            }
        }));
        arrayList.add(jyb.m147494Y("删除See试用聚合会话", new x20() { // from class: l.m9d
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m34105qq(-1.0d);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: X5 */
    public static /* synthetic */ void m59837X5(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        final byd0 byd0Var = new byd0("msg_chat_guide_waiting_time", 3600L);
        w1e.m204400d(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m204424I("输入聊天引导的等候时间，单位秒").m204420E(1).m204419D(80).m204430r(byd0Var.get() + "").m204423H(byd0Var.get() + "").m204421F(new y20() { // from class: l.ptc
            @Override // p153l.y20
            public final void call(Object obj) {
                DebugUtil.m59865Yc(byd0Var, (String) obj);
            }
        }).m204426n().show();
    }

    /* JADX INFO: renamed from: X8 */
    public static /* synthetic */ void m59840X8() {
        jxd0 jxd0Var = pza0.f154740H;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Xc */
    public static /* synthetic */ void m59844Xc() {
        CoreModule.f18264c.f20405m0.f20122V0.put(Boolean.FALSE);
        CoreModule.f18264c.f20405m0.f20125W0.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: Xd */
    public static /* synthetic */ void m59845Xd(PartialListOpt partialListOpt) {
        final int[] iArr = {0};
        CoreModule.f18264c.f20383e2.f153006U = new ArrayList();
        final int i = 3;
        jyb.m147537z(partialListOpt.loaded, new y20() { // from class: l.nac
            @Override // p153l.y20
            public final void call(Object obj) {
                DebugUtil.m59686Q1(iArr, i, (CoreSuggested.UserInfo) obj);
            }
        });
        CoreModule.f18264c.f20383e2.m172821u3();
    }

    /* JADX INFO: renamed from: Xe */
    public static /* synthetic */ void m59846Xe(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        new C8941c.a(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), purchaseType, null).m55277g(j690.m143625q(purchaseType.getPrivilegeData(null), null, purchaseType)).m55278h();
    }

    /* JADX INFO: renamed from: Xg */
    public static /* synthetic */ void m59848Xg(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, Questionnaire questionnaire) {
        if (NullChecker.m82486a(questionnaire) && !jyb.m147479J(questionnaire.options) && questionnaire.options.size() == 3) {
            new jrj0(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m146813z0(questionnaire);
        }
    }

    /* JADX INFO: renamed from: Xi */
    public static void m59850Xi(final ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("城市C位", new x20() { // from class: l.sxc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59522I8(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
    }

    /* JADX INFO: renamed from: Xj */
    public static void m59851Xj(final ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        Date date = new Date();
        date.setTime(CoreModule.f18264c.f20384f0.m33943eg());
        final String str = pzi0.f154859f.format(date);
        final boolean zBooleanValue = CoreModule.f18264c.f20381e0.f89169Y2.get().booleanValue();
        arrayList.add(jyb.m147494Y("新增通讯录", new x20() { // from class: l.hxc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60018fd(arrayList, str, zBooleanValue, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
    }

    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ void m59854Y1(final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        Dialog.C4460e c4460e = new Dialog.C4460e(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
        final EditText editText = new EditText(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
        editText.setHint("请输入群id");
        c4460e.m21519P(editText, false);
        c4460e.m21559v0("加入", new Runnable() { // from class: l.w9c
            @Override // java.lang.Runnable
            public final void run() {
                DebugUtil.m59764Tg(editText, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        });
        c4460e.m21567z0();
    }

    /* JADX INFO: renamed from: Y4 */
    public static /* synthetic */ void m59857Y4() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.FemaleVipGuideCard;
        userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: Y6 */
    public static /* synthetic */ void m59859Y6() {
        pza0.f154792s.put(Boolean.FALSE);
        pza0.f154793t.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: Y8 */
    public static /* synthetic */ void m59861Y8(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profile180().formatted());
        arrayList.add(CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profile180().formatted());
        arrayList.add(CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profile180().formatted());
        hl3.m135665H(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), 3, arrayList);
    }

    /* JADX INFO: renamed from: Ya */
    public static /* synthetic */ void m59863Ya(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        CoreModule.f18264c.f20381e0.f89072L5.clear();
        CoreModule.f18264c.f20381e0.f89079M5.clear();
        new d5l(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).show();
    }

    /* JADX INFO: renamed from: Yc */
    public static /* synthetic */ void m59865Yc(byd0 byd0Var, String str) {
        try {
            byd0Var.put(Long.valueOf(Long.parseLong(str)));
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: Ye */
    public static /* synthetic */ void m59867Ye() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89349v6;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Yf */
    public static /* synthetic */ void m59868Yf(User user) {
        Studies studies = user.profile.studies;
        studies.active = true;
        studies.verified = true;
    }

    /* JADX INFO: renamed from: Yi */
    public static void m59871Yi(final ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("全部配对气泡 " + CoreModule.f18264c.f20384f0.f20695l1.get(), new x20() { // from class: l.hqc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59612Mb(arrayList);
            }
        }));
    }

    /* JADX INFO: renamed from: Yj */
    public static void m59872Yj(Act act, final boolean z) {
        if (!gra.m131657a2()) {
            CoreModule.f18264c.f20384f0.m33872Yf(act);
        }
        if (z) {
            CoreModule.f18264c.f20384f0.m33680Ie();
        } else {
            CoreModule.f18264c.f20384f0.m33692Je();
        }
        CoreModule.f18264c.f20384f0.m34076on().take(1).observeOn(Schedulers.m222739io()).delay(1L, TimeUnit.SECONDS).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.bpc
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((vg60) obj).f184001a;
            }
        }).filter(new qcj() { // from class: l.cpc
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((List) obj));
            }
        }).flatMap(new rb8()).filter(new qcj() { // from class: l.epc
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Conversation) obj).status, "default"));
            }
        }).filter(new qcj() { // from class: l.fpc
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Conversation) obj).otherUser.startsWith("-"));
            }
        }).filter(new qcj() { // from class: l.gpc
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(z || ((Conversation) obj).localHasMessage);
            }
        }).skip(z ? 6 : 0).take(50).buffer(50).subscribe(psd0.m173596G(new y20() { // from class: l.hpc
            @Override // p153l.y20
            public final void call(Object obj) {
                DebugUtil.m60007f2(z, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m59873Z() {
        if (CoreModule.f18264c.f20381e0.f89368y4.get().intValue() == 110) {
            CoreModule.f18264c.f20381e0.f89368y4.put(9);
        } else {
            CoreModule.f18264c.f20381e0.f89368y4.put(110);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public static /* synthetic */ void m59874Z0() {
        w600.m205009h().m205014l();
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89207d1;
        Boolean bool = Boolean.FALSE;
        jxd0Var.put(bool);
        CoreModule.f18264c.f20381e0.f89215e1.put(bool);
        CoreModule.f18264c.f20373b1.f193004R.put(bool);
        CoreModule.f18264c.f20373b1.f193005S.put(bool);
        CoreModule.f18264c.f20373b1.f193008V.put("");
        CoreModule.f18264c.f20373b1.f193009W = null;
    }

    /* JADX INFO: renamed from: Z2 */
    public static /* synthetic */ void m59876Z2(final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        Dialog.C4460e c4460eDialog = viewTreeObserverOnGlobalLayoutListenerC8017b.act().dialog();
        String str = "卡片清晰度优化实验入组：" + pza0.f154773h.get();
        String str2 = "profile裁剪上传原图：" + pza0.f154771g.get();
        String strConcat = "选择加载640图片 ".concat(pza0.f154777j.get().intValue() == 640 ? "*" : "");
        String strConcat2 = "选择加载720图片 ".concat(pza0.f154777j.get().intValue() == 720 ? "*" : "");
        String strConcat3 = "选择加载1080图片 ".concat(pza0.f154777j.get().intValue() == 1080 ? "*" : "");
        c4460eDialog.m21534e0(jyb.m147507f0(str, str2, "修改卡片照片宽高比", strConcat, strConcat2, strConcat3, "选择加载1440图片 ".concat(pza0.f154777j.get().intValue() == 1440 ? "*" : ""), "动态清晰度：" + pza0.f154775i.get(), "显示当前设备参数信息")).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.pyc
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                DebugUtil.m59680Pg(viewTreeObserverOnGlobalLayoutListenerC8017b, dialog, view, i, charSequence);
            }
        }).m21566z().show();
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m59877Z3() {
        jxd0 jxd0Var = CoreModule.f18264c.f20405m0.f20087I1;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Z5 */
    public static /* synthetic */ void m59879Z5() {
    }

    /* JADX INFO: renamed from: Z9 */
    public static /* synthetic */ void m59883Z9(final ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = CoreModule.f18264c.f20405m0.f20136a0.m222761e();
        if (partialListOptM222761e == null || jyb.m147479J(partialListOptM222761e.loaded)) {
            return;
        }
        arrayList.clear();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("MATCH_TYPE_NORMAL           ", 0);
        linkedHashMap.put("MATCH_TYPE_SECRET_CRUSH     ", 1);
        linkedHashMap.put("MATCH_TYPE_SCENARIO_DATE", 10);
        linkedHashMap.put("MATCH_TYPE_SUPERLIKED       ", 11);
        linkedHashMap.put("MATCH_TYPE_SUPERLIKE        ", 12);
        linkedHashMap.put("MATCH_TYPE_SUPERLIKE_EACH   ", 13);
        linkedHashMap.put("MATCH_TYPE_BOOST            ", 14);
        linkedHashMap.put("MATCH_TYPE_CHRISTMAS        ", 15);
        linkedHashMap.put("MATCH_TYPE_HEART_CONFESSION ", 26);
        linkedHashMap.put("MATCH_TYPE_TALK_FEED        ", 35);
        linkedHashMap.put("MATCH_TYPE_TALK_SEE         ", 36);
        linkedHashMap.put("MATCH_TYPE_LETTER_RECEIVED  ", 37);
        linkedHashMap.put("MATCH_TYPE_LETTER_SENT      ", 38);
        linkedHashMap.put("MATCH_TYPE_LETTER_EACH      ", 39);
        linkedHashMap.put("MATCH_TYPE_INTL_WHO_LIKE_ME ", 47);
        linkedHashMap.put("MATCH_TYPE_INTL_RECEIVE_LIKE", 48);
        linkedHashMap.put("MATCH_TYPE_INTL_RECEIVE_LIKE_WITH_DLG", 49);
        linkedHashMap.put("MATCH_TYPE_ONE_MATCH_ODIAMOND", 46);
        linkedHashMap.put("MATCH_TYPE_INTL_FAKE_ODIAMOND_MATCH", 50);
        linkedHashMap.put("MATCH_TYPE_INTL_ONE_MATCH_ODIAMOND", 51);
        final NewMainAct newMainActAct = viewTreeObserverOnGlobalLayoutListenerC8017b.act();
        final ArrayList arrayList2 = new ArrayList();
        arrayList2.add(partialListOptM222761e.loaded.get(0).f20214id);
        jyb.m147537z(linkedHashMap.entrySet(), new y20() { // from class: l.kyc
            @Override // p153l.y20
            public final void call(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                arrayList.add(jyb.m147494Y((String) entry.getKey(), new x20() { // from class: l.sad
                    @Override // p153l.x20
                    public final void call() {
                        NewMainAct newMainAct = newMainAct;
                        newMainAct.startActivityWithCustomTransition(MatchAct.m48746g2(newMainAct, arrayList, ((Integer) entry.getValue()).intValue(), new ArrayList()), new MatchAct.C8617b());
                    }
                }));
            }
        });
        newMainActAct.showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Zf */
    public static /* synthetic */ void m59889Zf(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = "你好！";
        CoreDlg.m46203R1(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "sendMsg", "发送消息", "每次分享最多选择5位好友", 5, "分享", "最多可以选择5位好友", messageNew_.toJson(), new z20() { // from class: l.bmc
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                o1j0.m165651y("发送消息结果：" + ((String) obj));
            }
        });
    }

    /* JADX INFO: renamed from: Zh */
    public static /* synthetic */ void m59891Zh() {
        jxd0 jxd0Var = CoreModule.f18264c.f20405m0.f20119U0;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Zi */
    public static String[] m59892Zi() {
        return m59914aj();
    }

    /* JADX INFO: renamed from: Zj */
    public static void m59893Zj(final ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("婚恋", new x20() { // from class: l.rtc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60340u6(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
    }

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ void m59897a2(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded.get(0).canGreet = true;
        viewTreeObserverOnGlobalLayoutListenerC8017b.f22630M.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m59898a3() {
        jxd0 jxd0Var = pza0.f154756X;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: a4 */
    public static /* synthetic */ void m59899a4() {
        hcm.f108714i.put(Boolean.TRUE);
        jxd0 jxd0Var = hcm.f108715j;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: a6 */
    public static /* synthetic */ void m59901a6(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("购买弹窗", new x20() { // from class: l.r4d
            @Override // p153l.x20
            public final void call() {
                new nxm.C18984e(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m165204b("p_knowmyself_purchase,e_knowmyself_test,click").m165205c(new a30() { // from class: l.gcd
                    @Override // p153l.a30
                    /* JADX INFO: renamed from: a */
                    public final void mo37058a(Object obj, Object obj2, Object obj3) {
                        DebugUtil.m60096j4((PurchaseType) obj, (Act) obj2, (String) obj3);
                    }
                }).m165206d();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: ae */
    public static /* synthetic */ void m59909ae(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("启动男性配对成功页面", new x20() { // from class: l.l1d
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().startActivityWithCustomTransition(MatchAct.m48747h2(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), jyb.m147482M(viewTreeObserverOnGlobalLayoutListenerC8017b2.m38128A2().mo39816j().f20214id), 0, new ArrayList(), ""), new MatchAct.C8616a());
            }
        }));
        arrayList.add(jyb.m147494Y("启动女性配对成功页面", new x20() { // from class: l.m1d
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                pdi.m171819c0(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), CoreModule.f18264c.f20381e0.m116597oa(viewTreeObserverOnGlobalLayoutListenerC8017b2.m38128A2().mo39816j().f20214id), false, "", true);
            }
        }));
        final MatchSuccessAnimTime matchSuccessAnimTimeM116035l = dj30.m116035l();
        arrayList.add(jyb.m147494Y("女性 进入动画时间 " + matchSuccessAnimTimeM116035l.female_enter_time, new x20() { // from class: l.o1d
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                MatchSuccessAnimTime matchSuccessAnimTime = matchSuccessAnimTimeM116035l;
                w1e.m204400d(viewTreeObserverOnGlobalLayoutListenerC8017b2.act()).m204424I("时间 = " + matchSuccessAnimTime.female_enter_time).m204421F(new y20() { // from class: l.bcd
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m59429E3(matchSuccessAnimTime, (String) obj);
                    }
                }).m204426n().show();
            }
        }));
        arrayList.add(jyb.m147494Y("女性 退出动画时间 " + matchSuccessAnimTimeM116035l.female_exit_time, new x20() { // from class: l.p1d
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                MatchSuccessAnimTime matchSuccessAnimTime = matchSuccessAnimTimeM116035l;
                w1e.m204400d(viewTreeObserverOnGlobalLayoutListenerC8017b2.act()).m204424I("时间 = " + matchSuccessAnimTime.female_exit_time).m204421F(new y20() { // from class: l.y9c
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m59772U3(matchSuccessAnimTime, (String) obj);
                    }
                }).m204426n().show();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: af */
    public static /* synthetic */ void m59910af() {
        jxd0 jxd0Var = CoreModule.f18264c.f20405m0.f20122V0;
        Boolean bool = Boolean.FALSE;
        jxd0Var.put(bool);
        CoreModule.f18264c.f20405m0.f20125W0.put(bool);
    }

    /* JADX INFO: renamed from: ai */
    public static /* synthetic */ void m59913ai() {
        String str = "svip_new_prom_dlg_first_is_show" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        new jxd0(str, bool).put(bool);
        new jxd0("svip_new_prom_dlg_end_is_show" + CoreModule.m30929H().userId(), bool).put(bool);
    }

    /* JADX INFO: renamed from: aj */
    public static String[] m59914aj() {
        String[][] strArr = f39108j;
        String[] strArr2 = new String[strArr.length];
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            strArr2[i2] = m60003ek(Integer.parseInt(strArr[i][2]));
            i++;
            i2++;
        }
        return strArr2;
    }

    /* JADX INFO: renamed from: ak */
    public static void m59915ak(final ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("配对成功引导聊天", new x20() { // from class: l.iqc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59366B6(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m59916b() {
        CoreModule.f18264c.f20381e0.f89155W4.put(0L);
        CoreModule.f18264c.f20381e0.f89163X4.put(0);
        CoreModule.f18264c.f20381e0.f89171Y4.put(Boolean.FALSE);
        CoreModule.f18264c.f20381e0.f89179Z4.put(0L);
        CoreModule.f18264c.f20381e0.f89187a5.put(0);
    }

    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ void m59918b1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("新旧切换开关:" + CoreModule.f18264c.f20405m0.f20075E1.get(), new x20() { // from class: l.v0d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59571Kd();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: b5 */
    public static /* synthetic */ void m59922b5() {
        jxd0 jxd0Var = pza0.f154774h0;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        jxd0 jxd0Var2 = pza0.f154776i0;
        Boolean bool = Boolean.FALSE;
        jxd0Var2.put(bool);
        pza0.f154778j0.put(bool);
        pza0.f154780k0.put(bool);
    }

    /* JADX INFO: renamed from: b7 */
    public static /* synthetic */ void m59924b7(uxj0 uxj0Var) {
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (verificationCenterM32615k4 != null) {
            o1j0.m165636j("认证状态为:".concat(TEnum.equals(verificationCenterM32615k4.idCard.status, "verified") ? "已认证" : "未认证"));
        }
    }

    /* JADX INFO: renamed from: b8 */
    public static /* synthetic */ void m59925b8(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        v3l0.m199281e().m199287h("antispam");
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().startActivity(VerificationAct.m60648n2(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), 1, "avatar_ability"));
    }

    /* JADX INFO: renamed from: bb */
    public static /* synthetic */ void m59928bb(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        PurchaseType purchaseType = PurchaseType.TYPE_FEMALE_VIP;
        new C8941c.a(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), purchaseType, null).m55277g(j690.m143624p(purchaseType, purchaseType.getPrivilegeData(null), Privilege.ads_not_disturb)).m55278h();
    }

    /* JADX INFO: renamed from: be */
    public static /* synthetic */ void m59931be(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("关于我", new x20() { // from class: l.r2d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60124ka(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("问答", new x20() { // from class: l.s2d
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().startActivity(ExpandProfileLikeAct.m44260X1(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), new CoreSuggested.UserInfo(), CoreModule.f18264c.f20381e0.m116600p9().f56859id, "card", HomeCardExpandedType.QUESTION.getAlias(), 0));
            }
        }));
        arrayList.add(jyb.m147494Y("生活照片点赞", new x20() { // from class: l.t2d
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().startActivity(ExpandProfileLikeAct.m44260X1(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), new CoreSuggested.UserInfo(), CoreModule.f18264c.f20381e0.m116600p9().f56859id, "card", HomeCardExpandedType.LIFE_PIC.getAlias(), 0));
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: bh */
    public static /* synthetic */ void m59934bh() {
    }

    /* JADX INFO: renamed from: bj */
    public static void m59936bj(ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("连续聊天外显", new x20() { // from class: l.zlc
            @Override // p153l.x20
            public final void call() {
                w1e.m204400d(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m204424I("是否开启 debug模式").m204420E(1).m204419D(80).m204423H(CoreModule.f18264c.f20384f0.f20731x1.get() + "").m204421F(new y20() { // from class: l.q1d
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m60231p7((String) obj);
                    }
                }).m204426n().show();
            }
        }));
    }

    /* JADX INFO: renamed from: bk */
    public static void m59937bk(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("配对成功页2期", new C9298v0(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m59939c0(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        kfe0 kfe0Var = new kfe0(viewTreeObserverOnGlobalLayoutListenerC8017b, CoreModule.f18264c.f20381e0.m116600p9().m61308fp().url, viewTreeObserverOnGlobalLayoutListenerC8017b.act().string(R$string.f19438ln), 1, 1, null, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, ShareConstants.OLD_VERSION);
        kfe0Var.m146060s(new x20() { // from class: l.gvc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60427y5();
            }
        });
        kfe0Var.m126745x(CorePopLevel.INTL_SEE_ANIM_BUBBLE);
        llb0.m154703c().m154710i(kfe0Var);
    }

    /* JADX INFO: renamed from: c2 */
    public static /* synthetic */ void m59941c2(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            t4j.m189279d().f172085c.put(Lifecycle.State.CREATED.name());
        } else if (i == 1) {
            t4j.m189279d().f172085c.put(Lifecycle.State.STARTED.name());
        } else if (i == 2) {
            t4j.m189279d().f172085c.put(Lifecycle.State.RESUMED.name());
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ void m59942c3(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        BarLoverplaces barLoverplacesNew_ = BarLoverplaces.new_();
        barLoverplacesNew_.f21096id = "201";
        barLoverplacesNew_.name = "Sounding唱跳俱乐部";
        new be2(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), barLoverplacesNew_).show();
    }

    /* JADX INFO: renamed from: c4 */
    public static /* synthetic */ void m59943c4(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("清空标签", new x20() { // from class: l.iuc
            @Override // p153l.x20
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC8017b.act().duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).take(1).map(new qcj() { // from class: l.o7d
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return DebugUtil.m60153lh((User) obj);
                    }
                }).flatMap(new qcj() { // from class: l.p7d
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return DebugUtil.m60213ob((User) obj);
                    }
                }).subscribe(psd0.m173596G(new y20() { // from class: l.q7d
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m60036g9((uxj0) obj);
                    }
                }));
            }
        }));
        arrayList.add(jyb.m147494Y("标签添加完成弹出 - 聊天详情页", new x20() { // from class: l.juc
            @Override // p153l.x20
            public final void call() {
                gj40.m130415o().m130436U(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "from_message_tag_guide");
            }
        }));
        arrayList.add(jyb.m147494Y("标签添加完成弹出 - 心动信号广播", new x20() { // from class: l.kuc
            @Override // p153l.x20
            public final void call() {
                gj40.m130415o().m130436U(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "from_heartbeat");
            }
        }));
        arrayList.add(jyb.m147494Y("标签添加完成弹出 - 引导标签添加划卡", new x20() { // from class: l.luc
            @Override // p153l.x20
            public final void call() {
                gj40.m130415o().m130436U(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "from_card_tag_guide");
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: c9 */
    public static /* synthetic */ void m59948c9(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("清除频控", new C9239e2()));
        arrayList.add(jyb.m147494Y("弹出弹窗，样式1", new C9243f2(viewTreeObserverOnGlobalLayoutListenerC8017b)));
        arrayList.add(jyb.m147494Y("弹出弹窗，样式2", new C9247g2(viewTreeObserverOnGlobalLayoutListenerC8017b)));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: cg */
    public static /* synthetic */ void m59955cg() {
        jxd0 jxd0Var = pza0.f154739G;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        pza0.f154738F.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: ci */
    public static /* synthetic */ void m59957ci() {
        CoreModule.f18264c.f20405m0.f20122V0.put(Boolean.FALSE);
        CoreModule.f18264c.f20405m0.f20125W0.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: cj */
    public static void m59958cj(String str, String str2, double d, String str3) {
        Conversation conversationQuery = CoreModule.f18272k.f115545m.query(str);
        if (conversationQuery == null) {
            conversationQuery = Conversation.new_();
            conversationQuery.f56859id = str;
        }
        conversationQuery.convType = ConversationType.swiper;
        conversationQuery.createdTime = d;
        conversationQuery.latestTime = d;
        conversationQuery.localEverHasMessage = true;
        conversationQuery.localHasMessage = true;
        conversationQuery.otherUser = str3;
        conversationQuery.status = ConversationStatus.get("default");
        if (conversationQuery.additional == null) {
            conversationQuery.nullCheck();
        }
        ConvAdditionalSwiper convAdditionalSwiperNew_ = ConvAdditionalSwiper.new_();
        convAdditionalSwiperNew_.isPassive = true;
        convAdditionalSwiperNew_.type = str2;
        conversationQuery.additional.swiper = convAdditionalSwiperNew_;
        CoreModule.f18264c.f20384f0.m34053mq(conversationQuery);
    }

    /* JADX INFO: renamed from: ck */
    public static void m59959ck(final ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("消息帧二期", new x20() { // from class: l.gyc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60347ud(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m59960d() {
        CoreModule.f18264c.f20381e0.f89116R5.clear();
        CoreModule.f18264c.f20381e0.f89124S5.clear();
        CoreModule.f18264c.f20381e0.f89132T5.clear();
        CoreModule.f18264c.f20381e0.f89140U5.clear();
        CoreModule.f18264c.f20381e0.f89148V5.clear();
        CoreModule.f18264c.f20381e0.f89156W5.clear();
        CoreModule.f18264c.f20381e0.f89164X5.clear();
        CoreModule.f18264c.f20381e0.f89172Y5.clear();
        CoreModule.f18264c.f20381e0.f89212d6.clear();
        CoreModule.f18264c.f20381e0.f89220e6.clear();
        CoreModule.f18264c.f20381e0.f89228f6.clear();
        CoreModule.f18264c.f20381e0.f89236g6.clear();
        CoreModule.f18264c.f20364Y0.f161161c.clear();
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m59961d0() {
        CoreModule.f18264c.f20381e0.f89354w4.put(Boolean.FALSE);
        C4522a.m22099p().m22125w(false);
    }

    /* JADX INFO: renamed from: d4 */
    public static /* synthetic */ void m59965d4(String str) {
        try {
            f39105g.put(Integer.valueOf(Integer.parseInt(str)));
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d5 */
    public static /* synthetic */ void m59966d5(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("清除bubble计数", new x20() { // from class: l.i0d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59476G6();
            }
        }));
        arrayList.add(jyb.m147494Y("跳转黑金遇见访客页", new x20() { // from class: l.j0d
            @Override // p153l.x20
            public final void call() {
                CoreModule.m30933P().m143405a().mo34630xg(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: d6 */
    public static /* synthetic */ void m59967d6() {
        CoreModule.f18264c.f20410n2.m121459E3();
        o1j0.m165651y("已清除");
    }

    /* JADX INFO: renamed from: d7 */
    public static /* synthetic */ void m59968d7(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("清除划卡按钮提示", new x20() { // from class: l.yxc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60148lc();
            }
        }));
        arrayList.add(jyb.m147494Y("打开显示43信息", new x20() { // from class: l.zxc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20381e0.f89263k1.put(Boolean.TRUE);
            }
        }));
        arrayList.add(jyb.m147494Y("关闭显示43信息", new x20() { // from class: l.ayc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20381e0.f89263k1.put(Boolean.FALSE);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: d9 */
    public static /* synthetic */ void m59970d9(HashMap map, ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
    }

    /* JADX INFO: renamed from: da */
    public static /* synthetic */ void m59971da() {
        jxd0 jxd0Var = pza0.f154787o;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: db */
    public static /* synthetic */ void m59972db() {
        if (NullChecker.m82486a(CoreModule.f18264c.f20405m0.f20136a0.m222761e())) {
            List<CoreSuggested.UserInfo> list = CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded;
            if (jyb.m147479J(list)) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                CoreSuggested.UserInfo userInfo = list.get(size);
                if (!CoreModule.f18264c.f20405m0.f20187r0.contains(userInfo.f20214id)) {
                    CoreModule.f18264c.f20405m0.m32114i6(userInfo.f20214id);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: dc */
    public static /* synthetic */ void m59973dc(PurchaseType purchaseType, Act act, String str) {
    }

    /* JADX INFO: renamed from: de */
    public static /* synthetic */ void m59975de(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("打开通话Act", new x20() { // from class: l.xpc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().startActivity(VoiceCallAct.m45010a2(viewTreeObserverOnGlobalLayoutListenerC8017b2.act()));
            }
        }));
        arrayList.add(jyb.m147494Y("打开Push通知", new x20() { // from class: l.ypc
            @Override // p153l.x20
            public final void call() {
                rum0.f164925b = true;
            }
        }));
        arrayList.add(jyb.m147494Y("关闭Push通知", new x20() { // from class: l.aqc
            @Override // p153l.x20
            public final void call() {
                rum0.f164925b = false;
            }
        }));
        arrayList.add(jyb.m147494Y("清除Debug 模拟", new x20() { // from class: l.bqc
            @Override // p153l.x20
            public final void call() {
                rum0.m183209d(-1);
            }
        }));
        arrayList.add(jyb.m147494Y("设置已经同意", new x20() { // from class: l.cqc
            @Override // p153l.x20
            public final void call() {
                rum0.m183209d(0);
            }
        }));
        arrayList.add(jyb.m147494Y("设置已经拒绝", new x20() { // from class: l.dqc
            @Override // p153l.x20
            public final void call() {
                rum0.m183209d(1);
            }
        }));
        arrayList.add(jyb.m147494Y("设置同意", new x20() { // from class: l.eqc
            @Override // p153l.x20
            public final void call() {
                rum0.m183209d(2);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: df */
    public static /* synthetic */ void m59976df(Throwable th) {
    }

    /* JADX INFO: renamed from: dh */
    public static /* synthetic */ void m59978dh() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89284m6;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: dj */
    public static void m59980dj(ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("国际化 同道中人", new x20() { // from class: l.lqc
            @Override // p153l.x20
            public final void call() {
                C8574a.INSTANCE.m48068f(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), true);
            }
        }));
    }

    /* JADX INFO: renamed from: dk */
    public static void m59981dk(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("消息页面增加筛选选项", new C9280p0(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: e4 */
    public static /* synthetic */ uxj0 m59987e4(final List list) {
        CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.cad
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60030g3(list);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: ea */
    public static /* synthetic */ void m59993ea() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89055J2;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: eb */
    public static /* synthetic */ void m59994eb() {
        CoreModule.f18264c.f20396j0.m31642w4();
        tab0.m189811h().m189815e();
    }

    /* JADX INFO: renamed from: ed */
    public static /* synthetic */ void m59996ed(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, Questionnaire questionnaire) {
        if (NullChecker.m82486a(questionnaire) && !jyb.m147479J(questionnaire.options) && questionnaire.options.size() == 3) {
            new jrj0(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m146779C0(questionnaire);
        }
    }

    /* JADX INFO: renamed from: ef */
    public static /* synthetic */ void m59998ef() {
        jxd0 jxd0Var = z7x.f203278a;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: eg */
    public static /* synthetic */ void m59999eg(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("清除白金会话相关本地变量", new x20() { // from class: l.o5d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60282re();
            }
        }));
        arrayList.add(jyb.m147494Y("划卡前三张设置白金置顶喜欢", new x20() { // from class: l.p5d
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20405m0.m32069W8().take(1).subscribe(psd0.m173596G(new y20() { // from class: l.bac
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m59845Xd((PartialListOpt) obj);
                    }
                }));
            }
        }));
        arrayList.add(jyb.m147494Y("白金置顶喜欢发送push气泡", new x20() { // from class: l.q5d
            @Override // p153l.x20
            public final void call() {
                wm4.m207090a(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: ej */
    public static void m60002ej(ArrayList<pf60<String, x20>> arrayList) {
    }

    /* JADX INFO: renamed from: ek */
    public static String m60003ek(int i) {
        return String.valueOf(i + 25541);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m60004f() {
        jxd0 jxd0Var = f39101c;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        f39100b.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m60005f0(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        CityTopGreetDialog.C8782c c8782c = new CityTopGreetDialog.C8782c(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
        c8782c.m51745b(CoreModule.f18264c.f20381e0.m116600p9());
        c8782c.m51744a().show();
    }

    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ void m60006f1(Throwable th) {
    }

    /* JADX INFO: renamed from: f2 */
    public static /* synthetic */ void m60007f2(boolean z, List list) {
        int iMin = Math.min(50, list.size());
        LinkedHashMap<String, UserLiveLabel> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < iMin; i++) {
            String str = ((Conversation) list.get(i)).otherUser;
            if (!str.startsWith("-")) {
                UserLiveLabel userLiveLabelNew_ = UserLiveLabel.new_();
                userLiveLabelNew_.buttonTitle = "进入直播间";
                userLiveLabelNew_.userId = str;
                userLiveLabelNew_.ongoingCall = false;
                userLiveLabelNew_.iconTitle = "直播中";
                userLiveLabelNew_.mainTitle = "多人连线中";
                userLiveLabelNew_.subTitle = "多人连线已开启";
                linkedHashMap.put(str, userLiveLabelNew_);
            }
        }
        if (z) {
            CoreModule.f18264c.f20384f0.f20588B2.m137019l(linkedHashMap);
        } else {
            CoreModule.f18264c.f20384f0.f20591C2.m137019l(linkedHashMap);
        }
    }

    /* JADX INFO: renamed from: f3 */
    public static /* synthetic */ void m60008f3(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, String str, Conversation conversation) {
        if (NullChecker.m82486a(conversation)) {
            viewTreeObserverOnGlobalLayoutListenerC8017b.act().startActivity(MessagesAct.m50127l2(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), str, true, false, -1));
        } else {
            C8523d.m47075a(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), new C8523d.a(str, "from_h5_suggest_user"));
        }
    }

    /* JADX INFO: renamed from: f5 */
    public static /* synthetic */ void m60010f5(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("清除缓存", new x20() { // from class: l.v2d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60107jf();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: f6 */
    public static /* synthetic */ void m60011f6() {
        String str = "app_toolbar_white_theme_" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        jxd0 jxd0Var = new jxd0(str, bool);
        if (((Boolean) jxd0Var.get()).booleanValue()) {
            jxd0Var.put(bool);
        } else {
            jxd0Var.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: f9 */
    public static /* synthetic */ void m60014f9(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, Dialog dialog, View view, int i, CharSequence charSequence) {
        String string = charSequence.toString();
        string.getClass();
        switch (string) {
            case "查看喜欢我的人":
                viewTreeObserverOnGlobalLayoutListenerC8017b.act().startActivity(CoreModule.m30933P().m143405a().mo34436Vf() ? NewMyLikedUsersAct.m48003Z1(viewTreeObserverOnGlobalLayoutListenerC8017b.act()) : new Intent(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), (Class<?>) LikedUsersAct.class));
                break;
            case "清除svip红点记录":
                wtd0.m207833e().m207836c();
                break;
            case "SVIPIntlGuideAct":
                viewTreeObserverOnGlobalLayoutListenerC8017b.act().startActivity(SVIPIntlGuideAct.m57025Z1(viewTreeObserverOnGlobalLayoutListenerC8017b.act()));
                break;
        }
    }

    /* JADX INFO: renamed from: fa */
    public static /* synthetic */ void m60015fa(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        ArrayList arrayList = new ArrayList();
        for (Merchandise merchandise : du80.m118106g().m118111d(true)) {
            if (arrayList.size() >= 2) {
                break;
            } else if (TEnum.equals(merchandise.category, "svip")) {
                arrayList.add(merchandise);
            }
        }
        ou80.m169253h0(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), null, arrayList, "p_promotion,callback_other", null);
    }

    /* JADX INFO: renamed from: fd */
    public static /* synthetic */ void m60018fd(ArrayList arrayList, String str, final boolean z, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("清空上次记录新配对个数 = " + str, new x20() { // from class: l.t0d
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m33615Cp(0L);
            }
        }));
        arrayList.add(jyb.m147494Y("显示空数据 = " + z, new x20() { // from class: l.u0d
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20381e0.f89169Y2.put(Boolean.valueOf(!z));
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: ff */
    public static /* synthetic */ void m60020ff() {
        jxd0 jxd0Var = pza0.f154764c0;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        pza0.f154762b0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: fg */
    public static /* synthetic */ void m60021fg(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        Window window = viewTreeObserverOnGlobalLayoutListenerC8017b.act().getWindow();
        if (window != null) {
            window.setSoftInputMode(3);
        }
        l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), new RunnableC9288s(viewTreeObserverOnGlobalLayoutListenerC8017b), 1000L);
    }

    /* JADX INFO: renamed from: fh */
    public static /* synthetic */ void m60022fh() {
        Boolean bool = Boolean.FALSE;
        new jxd0("tantan_verification_tip_show", bool).put(bool);
    }

    /* JADX INFO: renamed from: fi */
    public static /* synthetic */ void m60023fi() {
        if (CoreModule.f18264c.f20422r2.f137259b0.get().intValue() != 0) {
            CoreModule.f18264c.f20422r2.f137259b0.put(0);
            return;
        }
        CoreModule.f18264c.f20422r2.f137259b0.put(8);
        CoreModule.f18264c.f20422r2.f137258a0.put(0L);
        CoreModule.f18264c.f20422r2.f137259b0.put(0);
    }

    /* JADX INFO: renamed from: fj */
    public static void m60024fj(ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("露营活动", new x20() { // from class: l.myc
            @Override // p153l.x20
            public final void call() {
                C8545b.INSTANCE.m47470i(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), 1);
            }
        }));
    }

    /* JADX INFO: renamed from: fk */
    public static void m60025fk(final ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("新资料页改版", new x20() { // from class: l.puc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59918b1(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m60026g() {
        jxd0 jxd0Var = pza0.f154766d0;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        pza0.f154768e0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m60027g0(Throwable th) {
    }

    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ void m60028g1() {
        m59725Rj();
        o1j0.m165651y("称赞Mock数据已插入");
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ void m60030g3(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uqb0.f180405k0.f184355d.upsert((User) it.next());
        }
    }

    /* JADX INFO: renamed from: g4 */
    public static /* synthetic */ void m60031g4() {
        jxd0 jxd0Var = baj.f75701b;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: g5 */
    public static /* synthetic */ void m60032g5() {
        x6d0.m209475l0().m209482p0(true);
        x6d0.m209475l0().m209483q0(true);
    }

    /* JADX INFO: renamed from: g6 */
    public static /* synthetic */ void m60033g6(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("送你AI魔法照", new x20() { // from class: l.cmc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59748T0();
            }
        }));
        arrayList.add(jyb.m147494Y("摇骰子游戏邀请", new x20() { // from class: l.emc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60301sb();
            }
        }));
        arrayList.add(jyb.m147494Y("送你一个清凉的夏天 收到", new x20() { // from class: l.fmc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59811W0();
            }
        }));
        arrayList.add(jyb.m147494Y("邀请加入“欧美好剧的群…", new x20() { // from class: l.gmc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60359v3();
            }
        }));
        arrayList.add(jyb.m147494Y("找搭子一起学习", new x20() { // from class: l.hmc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59589L9();
            }
        }));
        arrayList.add(jyb.m147494Y("设置开场白", new x20() { // from class: l.imc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59681Ph();
            }
        }));
        arrayList.add(jyb.m147494Y("她今天生日 tip", new x20() { // from class: l.jmc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60337u3();
            }
        }));
        arrayList.add(jyb.m147494Y("我的状态·吃瓜 tip", new x20() { // from class: l.kmc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59560K2();
            }
        }));
        arrayList.add(jyb.m147494Y("上线提醒", new x20() { // from class: l.lmc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60426y4();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: g7 */
    public static /* synthetic */ void m60034g7(final User user) {
        try {
            CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.x9c
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.m59711R5(user);
                }
            });
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        m60332tk();
    }

    /* JADX INFO: renamed from: g8 */
    public static /* synthetic */ void m60035g8() {
        CoreSuggested.UserInfo userInfo = CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded.get(0);
        Gson gson = new Gson();
        gson.toJson(userInfo);
        o1j0.m165636j(gson.toJson(userInfo));
    }

    /* JADX INFO: renamed from: g9 */
    public static /* synthetic */ void m60036g9(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: gd */
    public static /* synthetic */ void m60040gd(x20 x20Var, x20 x20Var2, x20 x20Var3, x20 x20Var4, x20 x20Var5, x20 x20Var6) {
        x20Var.call();
        x20Var2.call();
        x20Var3.call();
        x20Var4.call();
        x20Var5.call();
        x20Var6.call();
    }

    /* JADX INFO: renamed from: ge */
    public static /* synthetic */ void m60041ge(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        ArrayList arrayList = new ArrayList();
        PrivilegeDetail privilegeDetailNew_ = PrivilegeDetail.new_();
        privilegeDetailNew_.channel = "buy";
        privilegeDetailNew_.privilegeType = "vip";
        arrayList.add(privilegeDetailNew_);
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().startActivity(PurchaseResultAct.m55916Y1(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "vip", "111", "￥", Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE, new Gson().toJson(arrayList)));
    }

    /* JADX INFO: renamed from: gj */
    public static void m60046gj(final ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("全屏称赞页", new x20() { // from class: l.fvc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59684Q(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
    }

    /* JADX INFO: renamed from: gk */
    public static void m60047gk(final ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("新版配对成功", new x20() { // from class: l.yoc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59909ae(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m60048h() {
        jxd0 jxd0Var = pza0.f154786n0;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: h2 */
    public static /* synthetic */ void m60051h2() {
        jxd0 jxd0Var = f39100b;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        f39101c.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: h5 */
    public static /* synthetic */ void m60054h5(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        ybh0.C21557b c21557b = new ybh0.C21557b();
        c21557b.m215072a(0);
        c21557b.m215073b(CoreModule.m30930K().getUserById(CoreModule.f18264c.f20405m0.m32140q6()));
        c21557b.m215074c(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
    }

    /* JADX INFO: renamed from: h6 */
    public static /* synthetic */ void m60055h6() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89361x4;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: h7 */
    public static /* synthetic */ void m60056h7() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.AdCard;
        userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        for (OMSAdCardInfo oMSAdCardInfo : pk50.m172568j().m172576h()) {
            if (TextUtils.equals(oMSAdCardInfo.contentType, "literatureCardGuide")) {
                userInfo.extensionObject = oMSAdCardInfo;
                CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0);
                CoreModule.f18264c.f20405m0.f20114S1.put(userInfo, 0);
            }
        }
    }

    /* JADX INFO: renamed from: ha */
    public static /* synthetic */ void m60059ha() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89004B6;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: hb */
    public static /* synthetic */ void m60060hb(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("开关，当前".concat(CoreModule.f18264c.f20381e0.f89284m6.get().booleanValue() ? "true" : "false"), new x20() { // from class: l.t6d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59978dh();
            }
        }));
        arrayList.add(new pf60("新上传图片都打标，当前".concat(CoreModule.f18264c.f20381e0.f89292n6.get().booleanValue() ? "true" : "false"), new x20() { // from class: l.u6d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60274r6();
            }
        }));
        arrayList.add(new pf60("强制更换头像页", new C9267l2(viewTreeObserverOnGlobalLayoutListenerC8017b)));
        arrayList.add(new pf60("清除我的Tab认证失败红点频控", new C9271m2()));
        arrayList.add(new pf60("修改年龄", new C9224b(viewTreeObserverOnGlobalLayoutListenerC8017b)));
        arrayList.add(new pf60("我的Tab展示叹号", new C9228c(viewTreeObserverOnGlobalLayoutListenerC8017b)));
        arrayList.add(new pf60("我的Tab展示黑金", new C9232d(viewTreeObserverOnGlobalLayoutListenerC8017b)));
        arrayList.add(new pf60("我的Tab展示未完善", new C9236e(viewTreeObserverOnGlobalLayoutListenerC8017b)));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: hf */
    public static /* synthetic */ void m60064hf(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        ActionToast actionToastNew_ = ActionToast.new_();
        actionToastNew_.message = "哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈";
        actionToastNew_.mainImg = "http://cloud.staging2.p1staff.com/v1/images/eyJpZCI6IkJSRlRDQkJaVk1FT0UzTkpEUkw3NlRUV0ZUVFdMRjAyIiwidyI6NDAwLCJoIjo1MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MDI4ODUyMzIxODk5Njg3MzA5fQ.webp?format=max_960xX";
        CardOption cardOptionNew_ = CardOption.new_();
        cardOptionNew_.link = "tantanapp://home?action=location";
        actionToastNew_.option = cardOptionNew_;
        y2h0.m214080g().m214088l(viewTreeObserverOnGlobalLayoutListenerC8017b, actionToastNew_);
    }

    /* JADX INFO: renamed from: hi */
    public static /* synthetic */ void m60067hi() {
        try {
            CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.eac
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.m59337A();
                }
            });
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        m60332tk();
    }

    /* JADX INFO: renamed from: hj */
    public static void m60068hj(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("称赞Mock数据 当前:".concat(f39107i.get().booleanValue() ? "开" : "关"), new x20() { // from class: l.poc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60460zg();
            }
        }));
        arrayList.add(jyb.m147494Y("称赞Mock: 插入Mock数据", new x20() { // from class: l.qoc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60028g1();
            }
        }));
        arrayList.add(jyb.m147494Y("称赞Mock: 删除Mock数据", new x20() { // from class: l.roc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60405x5();
            }
        }));
    }

    /* JADX INFO: renamed from: hk */
    public static void m60069hk(final ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("跳转新资料点赞页 ", new x20() { // from class: l.fyc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59931be(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m60071i0(Throwable th) {
    }

    /* JADX INFO: renamed from: i2 */
    public static /* synthetic */ void m60073i2() {
        u2n.f177228c = true;
        CoreModule.f18264c.f20381e0.f89120S1.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: i4 */
    public static /* synthetic */ void m60075i4(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("插入闪聊广播弹窗", new x20() { // from class: l.d5d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60224p0(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("闪聊配对成功弹窗-》消息页面", new x20() { // from class: l.e5d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60216oe();
            }
        }));
        arrayList.add(jyb.m147494Y("闪聊配对成功弹窗-》popwindow", new x20() { // from class: l.f5d
            @Override // p153l.x20
            public final void call() {
                C8772a.m51449l0(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), CoreModule.f18264c.f20381e0.m116600p9());
            }
        }));
        arrayList.add(jyb.m147494Y("清理 插入闪聊广播弹窗 次数:" + CoreModule.f18264c.f20300D0.f20873V.get(), new x20() { // from class: l.g5d
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20300D0.f20873V.put(0);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: i6 */
    public static /* synthetic */ void m60077i6() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89202c4;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: i7 */
    public static /* synthetic */ void m60078i7(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("一键打开：" + C4522a.m22099p().m22117n(), new x20() { // from class: l.n2d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59447F();
            }
        }));
        arrayList.add(jyb.m147494Y("一键关闭：" + C4522a.m22099p().m22117n(), new x20() { // from class: l.o2d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59961d0();
            }
        }));
        arrayList.add(jyb.m147494Y("展示debug入口", new x20() { // from class: l.p2d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60398wk(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("默认展示入口", new x20() { // from class: l.q2d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59559K1();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: i8 */
    public static /* synthetic */ void m60079i8() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.MarryAdCard;
        userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: ia */
    public static /* synthetic */ void m60081ia() {
        jxd0 jxd0Var = CoreModule.f18264c.f20405m0.f20084H1;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: ib */
    public static /* synthetic */ void m60082ib() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.FourSelectOneAdCard;
        userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        FourSelectOneAdCardData fourSelectOneAdCardDataNew_ = FourSelectOneAdCardData.new_();
        fourSelectOneAdCardDataNew_.adTitle = "同分享生活中的小幸运？";
        fourSelectOneAdCardDataNew_.adContent = "挑一挑谁最符合问题描述";
        fourSelectOneAdCardDataNew_.avatarList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlJDSlFTVVNCWlROVjVDSVdZS0xLQldWRzNOT0VQTzE0IiwidyI6MzY2LCJoIjo1NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTkxMDU4OTA2OTkyMDY4NzcyOX0.png");
        fourSelectOneAdCardDataNew_.avatarList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IkVBUERJVE9NT0o0Sk5ZNlJUVlA0UjRXSU1XSk03RjE0IiwidyI6MzY2LCJoIjo1NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjQ2NjAzMTQ0OTY1NDM0NzA3fQ.png");
        fourSelectOneAdCardDataNew_.avatarList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlJDSlFTVVNCWlROVjVDSVdZS0xLQldWRzNOT0VQTzE0IiwidyI6MzY2LCJoIjo1NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTkxMDU4OTA2OTkyMDY4NzcyOX0.png");
        fourSelectOneAdCardDataNew_.avatarList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IkVBUERJVE9NT0o0Sk5ZNlJUVlA0UjRXSU1XSk03RjE0IiwidyI6MzY2LCJoIjo1NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjQ2NjAzMTQ0OTY1NDM0NzA3fQ.png");
        userInfo.fourSelectOneAdCardData = fourSelectOneAdCardDataNew_;
        CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: ie */
    public static /* synthetic */ void m60085ie(final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        final User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        final CounterLikeLimit counterLikeLimit = counterM32487o3 == null ? null : counterM32487o3.likeLimit;
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().dialog().m21534e0(jyb.m147507f0("10 last swipe alert already delete", "1-swipe 500 cards alert", "2-thin profile popup", "3-first left swipe", "4-first right swipe", "5-first superlike swipe", "6-first undo", "7-see expired dialog", "8-vip expired dialog", "9-out of superlike", "10-out of undo", "11-first scenario like", "12-vip alert", "13-only buy superlike alert", "14-show name fake alert", "15-fake alert", "16-school navigate dialog", "17-school approval failed", "18-matched !!", "19-ugly alert", "20-superlike intro", "21-permission alert", "22-share card", "23-good2fake alert", "24-superlike awrad recived", "25-scenario intro dialog", "26-scenario active dialog", "27-uglyalert special one", "28-TBH introduce dialog", "29-see not match dlg 3", "30-gp_ratev2", "31-gp renew subs failed", "32-gp renew subs data toast", "33-gp miss match toast", "34-see privilege activated", "35-gp pay failed dlg")).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.duc
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                DebugUtil.m60422y0(counterLikeLimit, viewTreeObserverOnGlobalLayoutListenerC8017b, userM116600p9, dialog, view, i, charSequence);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: ig */
    public static /* synthetic */ void m60086ig() {
        List<CoreSuggested.UserInfo> list = CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded;
        if (jyb.m147479J(list)) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            stringBuffer.append(list.get(i).f20214id + com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
        }
    }

    /* JADX INFO: renamed from: ih */
    public static /* synthetic */ void m60087ih() {
        jxd0 jxd0Var = pza0.f154746N;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: ij */
    public static String m60089ij() {
        ProfileLike profileLike;
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        return (counterM32487o3 == null || (profileLike = counterM32487o3.profileLike) == null) ? "—" : String.valueOf(profileLike.remaining);
    }

    /* JADX INFO: renamed from: ik */
    public static void m60090ik(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        final boolean zBooleanValue = CoreModule.f18264c.f20381e0.f89085N4.get().booleanValue();
        arrayList.add(jyb.m147494Y("新编辑资料页UI " + zBooleanValue, new x20() { // from class: l.huc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20381e0.f89085N4.put(Boolean.valueOf(!zBooleanValue));
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m60091j(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("清除所有曝光次数", new x20() { // from class: l.s7d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59602M1();
            }
        }));
        arrayList.add(jyb.m147494Y("清除婚恋曝光次数", new x20() { // from class: l.t7d
            @Override // p153l.x20
            public final void call() {
                esc0.m122314a(esc0.f95585a);
            }
        }));
        arrayList.add(jyb.m147494Y("清除我的tab认证曝光次数", new x20() { // from class: l.u7d
            @Override // p153l.x20
            public final void call() {
                esc0.m122314a(esc0.f95586b);
            }
        }));
        arrayList.add(jyb.m147494Y("清除我的侧边栏入口曝光次数", new x20() { // from class: l.v7d
            @Override // p153l.x20
            public final void call() {
                esc0.m122314a(esc0.f95587c);
            }
        }));
        arrayList.add(jyb.m147494Y("清除我的侧边栏我的客服曝光次数", new x20() { // from class: l.w7d
            @Override // p153l.x20
            public final void call() {
                esc0.m122314a(esc0.f95588d);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m60092j0(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: j1 */
    public static /* synthetic */ void m60093j1(Throwable th) {
    }

    /* JADX INFO: renamed from: j3 */
    public static /* synthetic */ void m60095j3(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        C4883c c4883c = CoreModule.f18264c;
        c4883c.f20364Y0.f161176r = 0;
        c4883c.f20381e0.f89072L5.clear();
        CoreModule.f18264c.f20381e0.f89079M5.clear();
        viewTreeObserverOnGlobalLayoutListenerC8017b.m38294f6();
    }

    /* JADX INFO: renamed from: j4 */
    public static /* synthetic */ void m60096j4(PurchaseType purchaseType, Act act, String str) {
    }

    /* JADX INFO: renamed from: j7 */
    public static /* synthetic */ void m60099j7(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded.get(0).debugRecommendMessage();
        viewTreeObserverOnGlobalLayoutListenerC8017b.f22630M.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: j8 */
    public static /* synthetic */ void m60100j8(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("自动划卡", new x20() { // from class: l.mnc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59598Li(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            }
        }));
        arrayList.add(jyb.m147494Y("还原速度", new x20() { // from class: l.nnc
            @Override // p153l.x20
            public final void call() {
                new vxd0("swipe_trans_speed", 1).put(1);
            }
        }));
        arrayList.add(jyb.m147494Y("x2速度", new x20() { // from class: l.onc
            @Override // p153l.x20
            public final void call() {
                new vxd0("swipe_trans_speed", 1).put(2);
            }
        }));
        arrayList.add(jyb.m147494Y("x5速度", new x20() { // from class: l.pnc
            @Override // p153l.x20
            public final void call() {
                new vxd0("swipe_trans_speed", 1).put(5);
            }
        }));
        arrayList.add(jyb.m147494Y("x10速度", new x20() { // from class: l.qnc
            @Override // p153l.x20
            public final void call() {
                new vxd0("swipe_trans_speed", 1).put(10);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: ja */
    public static /* synthetic */ void m60102ja() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89089O1;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: jb */
    public static /* synthetic */ void m60103jb(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        Merchandise merchandise = (Merchandise) jyb.m147529r(CoreModule.f18264c.f20396j0.m31583E4().m222761e(), new qcj() { // from class: l.dac
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Merchandise merchandise2 = (Merchandise) obj;
                return Boolean.valueOf(TEnum.equals(merchandise2.category, ProductCategory.tttVip) && merchandise2.monthly() && merchandise2.autoRenewable());
            }
        });
        Coupon couponForPromotion = merchandise.getCouponForPromotion(MonetizationPromotionsId.trial7DVIP);
        if (couponForPromotion != null) {
            new iyk0.C17829a(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m142692d(merchandise).m142690b(couponForPromotion).m142691c(BuildConfig.BUILD_TYPE).m142693e();
        } else {
            o1j0.m165651y("商品或者优惠券为空");
        }
    }

    /* JADX INFO: renamed from: jd */
    public static /* synthetic */ void m60105jd(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("模拟卸载", new x20() { // from class: l.atc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60244pk(-1L);
            }
        }));
        arrayList.add(jyb.m147494Y("设置时间为半小时时间", new x20() { // from class: l.btc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60244pk(pzi0.m174454o() - 1800000);
            }
        }));
        arrayList.add(jyb.m147494Y("设置时间为1小时时间", new x20() { // from class: l.ctc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60244pk(pzi0.m174454o() - 3600000);
            }
        }));
        arrayList.add(jyb.m147494Y("设置时间为当前时间", new x20() { // from class: l.dtc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60244pk(pzi0.m174454o());
            }
        }));
        arrayList.add(jyb.m147494Y("设置时间为一天前时间", new x20() { // from class: l.etc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60244pk(pzi0.m174454o() - 86400000);
            }
        }));
        arrayList.add(jyb.m147494Y("设置时间为一周前时间", new x20() { // from class: l.ftc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60244pk(pzi0.m174454o() - 604800000);
            }
        }));
        arrayList.add(jyb.m147494Y("设置时间为一月前时间", new x20() { // from class: l.gtc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60244pk(pzi0.m174454o() - 2592000000L);
            }
        }));
        arrayList.add(jyb.m147494Y("设置时间为覆盖安装", new x20() { // from class: l.htc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60244pk(-1000L);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: je */
    public static /* synthetic */ void m60106je() {
        jxd0 jxd0Var = hxf.f111998b;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        hxf.f111999c.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: jf */
    public static /* synthetic */ void m60107jf() {
        CoreModule.f18264c.f20340Q1.m35750l3(false);
        r1j0.m179420g("已清除");
    }

    /* JADX INFO: renamed from: jg */
    public static /* synthetic */ void m60108jg(final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(TXLiteAVCode.EVT_HW_DECODER_START_SUCC, 4, 20);
        CoreModule.f18264c.f20429u0.f20003s0.put(Long.valueOf(calendar.getTimeInMillis()));
        l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), new Runnable() { // from class: l.jqc
            @Override // java.lang.Runnable
            public final void run() {
                viewTreeObserverOnGlobalLayoutListenerC8017b.m38369v2().m101880B5();
            }
        }, 2000L);
    }

    /* JADX INFO: renamed from: ji */
    public static /* synthetic */ void m60110ji(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        PurchaseType purchaseType = PurchaseType.TYPE_YOUTH_VIP;
        new C8941c.a(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), purchaseType, BuildConfig.BUILD_TYPE).m55277g(j690.m143624p(purchaseType, purchaseType.getPrivilegeData(null), Privilege.youth_blind_box)).m55275e(new a30() { // from class: l.ccd
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                o1j0.m165651y("购买成功，立刻体验专属权益吧");
            }
        }).m55278h();
    }

    /* JADX INFO: renamed from: jj */
    public static void m60111jj(ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("资料完整度", new x20() { // from class: l.kxc
            @Override // p153l.x20
            public final void call() {
                w1e.m204400d(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m204419D(10).m204430r("资料完成百分之多少").m204421F(new y20() { // from class: l.x0d
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        aw90.m100562F().m100625o0((String) obj);
                    }
                }).m204426n().show();
            }
        }));
    }

    /* JADX INFO: renamed from: jk */
    public static void m60112jk(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("老用户迎新", new C9254i1(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: k1 */
    public static /* synthetic */ void m60115k1() {
        jxd0 jxd0Var = CoreModule.f18264c.f20405m0.f20197u1;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: k2 */
    public static /* synthetic */ void m60116k2() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.NewUserSeeMyself;
        userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: k3 */
    public static /* synthetic */ void m60117k3() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89210d4;
        if (NullChecker.m82486a(jxd0Var)) {
            jxd0Var.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: k6 */
    public static /* synthetic */ void m60120k6() {
        List<T> listM208674j = CoreModule.f18272k.f115535c.m189449K().m208674j();
        final GreetingSummary greetingSummaryNew_ = GreetingSummary.new_();
        greetingSummaryNew_.latestMessageId = ((Message) listM208674j.get(0)).f56859id;
        if (listM208674j.size() > 0) {
            l51.m152887G(new Runnable() { // from class: l.r7d
                @Override // java.lang.Runnable
                public final void run() {
                    DebugUtil.m60462zi(greetingSummaryNew_);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k7 */
    public static /* synthetic */ void m60121k7(final ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("添加促销", new x20() { // from class: l.syc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().startActivity(new Intent(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), (Class<?>) PurchasePromotionAct.class));
            }
        }));
        arrayList.add(jyb.m147494Y("2024双11svip-6m优惠", new x20() { // from class: l.ezc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                s5b0.m184641i0(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), new y20() { // from class: l.l3d
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m59804Ve((Boolean) obj);
                    }
                }, (Merchandise) jyb.m147529r(CoreModule.f18264c.f20396j0.m31582D5(ProductCategory.get("svip")), new qcj() { // from class: l.k3d
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(v5b0.m199786l((Merchandise) obj, MonetizationPromotionsId.giftDurationSVIP));
                    }
                }), viewTreeObserverOnGlobalLayoutListenerC8017b2.act().pageId());
            }
        }));
        arrayList.add(jyb.m147494Y("重构购买弹窗【汇总】", new x20() { // from class: l.qzc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59373Bd(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("优惠卷 首页弹窗时间重置", new x20() { // from class: l.szc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60366va();
            }
        }));
        arrayList.add(jyb.m147494Y("腾讯广告SDK【汇总】", new x20() { // from class: l.tzc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59722Rg(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("检查支付宝安装", new x20() { // from class: l.vzc
            @Override // p153l.x20
            public final void call() {
                xl60.m211506k();
            }
        }));
        arrayList.add(jyb.m147494Y("vip 右滑上线提示弹窗", new x20() { // from class: l.wzc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60163m5(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("购买项是否监管平铺切换", new x20() { // from class: l.xzc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59994eb();
            }
        }));
        arrayList.add(jyb.m147494Y("购买弹窗【汇总】", new x20() { // from class: l.yzc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59370Ba(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("全屏购买弹窗【汇总】", new x20() { // from class: l.zzc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59417Dd(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("落地页【汇总】", new x20() { // from class: l.tyc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59709R3(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("打招呼配对页【汇总】", new x20() { // from class: l.uyc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60440yi(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("访客相关【汇总】", new x20() { // from class: l.vyc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59736S9(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("高价会员【汇总】", new x20() { // from class: l.wyc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59579L(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("SVIP低价召回【汇总】", new x20() { // from class: l.xyc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59419Df(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("出现superlike引导一次", new x20() { // from class: l.zyc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59658Of();
            }
        }));
        arrayList.add(jyb.m147494Y("插入superlike卡片", new x20() { // from class: l.azc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59351Ad(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("插入undo卡片", new x20() { // from class: l.bzc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60387w9();
            }
        }));
        arrayList.add(jyb.m147494Y("插入打招呼2卡片", new x20() { // from class: l.czc
            @Override // p153l.x20
            public final void call() {
                l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), new Runnable() { // from class: l.j3d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m59747T();
                    }
                }, 500L);
            }
        }));
        arrayList.add(jyb.m147494Y("svip试用弹窗", new x20() { // from class: l.dzc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60241ph(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("See离线弹窗", new x20() { // from class: l.fzc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60132ki(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("揭秘喜欢我的人", new x20() { // from class: l.gzc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59861Y8(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(new pf60("清除超级喜欢划卡引导时间戳", new x20() { // from class: l.hzc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60217of();
            }
        }));
        arrayList.add(new pf60("清除fake用户引导引导时间戳", new x20() { // from class: l.izc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59781Uc();
            }
        }));
        arrayList.add(new pf60("已读标记重置", new x20() { // from class: l.kzc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59520I6();
            }
        }));
        arrayList.add(jyb.m147494Y("试用link", new x20() { // from class: l.lzc
            @Override // p153l.x20
            public final void call() {
                nae0.m162083m(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), Uri.parse("tantan://monetization_promotion/svip/trail"));
            }
        }));
        arrayList.add(jyb.m147494Y("svip优惠券link", new x20() { // from class: l.mzc
            @Override // p153l.x20
            public final void call() {
                nae0.m162083m(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), Uri.parse("tantan://svip/svip/buy?couponId=lowPriceCustomerSVIP@local_3M_under23age_h"));
            }
        }));
        arrayList.add(jyb.m147494Y("svip低价优惠link", new x20() { // from class: l.nzc
            @Override // p153l.x20
            public final void call() {
                nae0.m162083m(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), Uri.parse("tantan://svip/svip/buy?couponId=lowPriceCustomerSVIP@local_1M_exceed23age_h"));
            }
        }));
        arrayList.add(jyb.m147494Y("vip低价优惠link", new x20() { // from class: l.ozc
            @Override // p153l.x20
            public final void call() {
                nae0.m162083m(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), Uri.parse("tantan://vip/vip/buy?couponId=lowPriceCustomerVIP@local_1M"));
            }
        }));
        arrayList.add(jyb.m147494Y("vip首月link", new x20() { // from class: l.pzc
            @Override // p153l.x20
            public final void call() {
                nae0.m162083m(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), Uri.parse("tantan://vip/vip/buy?couponId=lowPriceFirstMonthVIP1M@local"));
            }
        }));
        arrayList.add(jyb.m147494Y("合伙人定制页面", new x20() { // from class: l.rzc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().startActivity(SupremeCustomAct.INSTANCE.m44787a(viewTreeObserverOnGlobalLayoutListenerC8017b2.act()));
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: k9 */
    public static /* synthetic */ void m60123k9() {
        jxd0 jxd0Var = pza0.f154780k0;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        jxd0 jxd0Var2 = pza0.f154776i0;
        Boolean bool = Boolean.FALSE;
        jxd0Var2.put(bool);
        pza0.f154774h0.put(bool);
        pza0.f154778j0.put(bool);
    }

    /* JADX INFO: renamed from: ka */
    public static /* synthetic */ void m60124ka(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        userM116600p9.description = "赞赞赞赞赞赞赞赞赞赞赞赞，收到咖啡店升降开关阿萨德开发的索拉卡风管机手打立卡高发季双打卡估计啊老大说";
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().startActivity(ExpandProfileLikeAct.m44260X1(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), userInfo, userM116600p9.f56859id, "card", HomeCardExpandedType.ABOUT_ME.getAlias(), 0));
    }

    /* JADX INFO: renamed from: ke */
    public static /* synthetic */ void m60128ke() {
        PushMessage pushMessage = new PushMessage();
        pushMessage.intent = "newMaleUserLike.send";
        CoreBusinessModule.f18254e.m106507n("", "", "", pushMessage, null);
    }

    /* JADX INFO: renamed from: kf */
    public static /* synthetic */ void m60129kf() {
        pza0.f154792s.put(Boolean.TRUE);
        pza0.f154793t.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: ki */
    public static /* synthetic */ void m60132ki(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        CoreLikers.C4870a c4870a = new CoreLikers.C4870a();
        c4870a.f20014d = new ArrayList();
        List<CoreSuggested.UserInfo> list = CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded;
        for (int i = 0; i < 3; i++) {
            c4870a.f20014d.add(CoreModule.f18264c.f20381e0.m116503Pa(list.get(i).f20214id));
        }
        hl3.m135667J(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), 3, c4870a);
    }

    /* JADX INFO: renamed from: kj */
    public static void m60133kj(ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        if (gra.m131613P1()) {
            arrayList.add(jyb.m147494Y("动态打招呼：首张用户卡片展示打招呼入口", new x20() { // from class: l.xuc
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.m59897a2(viewTreeObserverOnGlobalLayoutListenerC8017b);
                }
            }));
            arrayList.add(jyb.m147494Y("动态打招呼：首张用户卡片展示打招呼内容", new x20() { // from class: l.yuc
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.m60099j7(viewTreeObserverOnGlobalLayoutListenerC8017b);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: kk */
    public static void m60134kk(final ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("新用户破冰新手引导", new x20() { // from class: l.suc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59404D0(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m60135l() {
        CoreModule.f18264c.f20405m0.f20066B1.put("");
        CoreModule.f18264c.f20381e0.f89226f4.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ void m60139l3(final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, final String str) {
        Pattern patternCompile = Pattern.compile("[0-9]*");
        if (TextUtils.isEmpty(str) || !patternCompile.matcher(str).matches() || TextUtils.isEmpty(str)) {
            return;
        }
        l51.m152887G(new Runnable() { // from class: l.n3d
            @Override // java.lang.Runnable
            public final void run() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                String str2 = str;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().duringCreated(CoreModule.f18264c.f20384f0.m33823Ue(str2)).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.hac
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m60008f3(viewTreeObserverOnGlobalLayoutListenerC8017b2, str2, (Conversation) obj);
                    }
                }, new y20() { // from class: l.iac
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        C8523d.m47075a(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), new C8523d.a(str2, "from_h5_suggest_user"));
                    }
                }));
            }
        });
    }

    /* JADX INFO: renamed from: l5 */
    public static /* synthetic */ void m60141l5() {
        jxd0 jxd0Var = pza0.f154748P;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: l8 */
    public static /* synthetic */ void m60144l8(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PurchaseType.TYPE_GET_VIP);
        arrayList.add(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        new neb0.C18861a(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), arrayList, null, null).m162852a(0).m162853b(new x20() { // from class: l.lbd
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59499H7();
            }
        }).m162854c(new y20() { // from class: l.mbd
            @Override // p153l.y20
            public final void call(Object obj) {
                DebugUtil.m60092j0((PurchaseType) obj);
            }
        }).m162857f(new y20() { // from class: l.nbd
            @Override // p153l.y20
            public final void call(Object obj) {
                DebugUtil.m60321t9((PurchaseType) obj);
            }
        }).m162855d(new y20() { // from class: l.obd
            @Override // p153l.y20
            public final void call(Object obj) {
                DebugUtil.m60280rc((PurchaseType) obj);
            }
        }).m162856e(new a30() { // from class: l.pbd
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                DebugUtil.m59973dc((PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).m162858g();
    }

    /* JADX INFO: renamed from: lc */
    public static /* synthetic */ void m60148lc() {
        vxd0 vxd0Var = new vxd0("full_card_5_btn_tran_x", 0);
        vxd0 vxd0Var2 = new vxd0("full_card_5_btn_tran_y", 0);
        vxd0 vxd0Var3 = new vxd0("full_card_btn_5_tran_count", 0);
        Boolean bool = Boolean.FALSE;
        jxd0 jxd0Var = new jxd0("full_card_clicked", bool);
        vxd0Var2.put(0);
        vxd0Var3.put(0);
        jxd0Var.put(bool);
        vxd0Var.put(-500);
    }

    /* JADX INFO: renamed from: ld */
    public static /* synthetic */ void m60149ld() {
        jxd0 jxd0Var = pza0.f154735C;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        if (pza0.f154735C.get().booleanValue()) {
            pza0.f154734B.put(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: lh */
    public static /* synthetic */ User m60153lh(User user) {
        User userMo225055clone = user.mo225055clone();
        userMo225055clone.profile.extensions.interest.tags.clear();
        return userMo225055clone.subtract(user);
    }

    /* JADX INFO: renamed from: li */
    public static /* synthetic */ void m60154li(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        User userMo225055clone = CoreModule.f18264c.f20381e0.m116600p9().mo225055clone();
        ProfileCompletion profileCompletion = userMo225055clone.profile.extensions.profileCompletion;
        List list = Collections.EMPTY_LIST;
        profileCompletion.progress = jyb.m147500c(list, "finished");
        userMo225055clone.profile.extensions.profileCompletion.briefIntroduction = jyb.m147500c(list, "我是一个up主");
        User userSubtract = userMo225055clone.subtract(CoreModule.f18264c.f20381e0.m116600p9());
        if (NullChecker.m82486a(userSubtract)) {
            viewTreeObserverOnGlobalLayoutListenerC8017b.act().duringCreated(CoreModule.f18264c.f20381e0.m116620u9(userSubtract)).subscribe(psd0.m173597H(new y20() { // from class: l.snc
                @Override // p153l.y20
                public final void call(Object obj) {
                    o1j0.m165651y(CoreModule.f18264c.f20381e0.m116600p9().profile.extensions.profileCompletion.toJson());
                }
            }, new y20() { // from class: l.tnc
                @Override // p153l.y20
                public final void call(Object obj) {
                    o1j0.m165651y(((Throwable) obj).getMessage());
                }
            }));
        }
    }

    /* JADX INFO: renamed from: lj */
    public static void m60155lj(ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("Facebook 绑定手机号", new x20() { // from class: l.wuc
            @Override // p153l.x20
            public final void call() {
                new cen(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m109427Z();
            }
        }));
    }

    /* JADX INFO: renamed from: lk */
    public static void m60156lk(final ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("新用户快速指引", new x20() { // from class: l.zuc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60207o5(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m60157m(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, Notification notification) {
        if (notification.m222545j()) {
            o1j0.m165639m("something wrong!");
            return;
        }
        if (viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2().mo39821o().m140259d().localRelationship == null) {
            Relationship relationship = new Relationship();
            relationship.f39654id = viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2().mo39816j().f20214id;
            relationship.state = RelationshipStatus.get("liked");
            relationship.status = jyb.m147507f0(MatchFrom.get(MatchFrom.superLiked));
            viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2().mo39821o().m140259d().localRelationship = relationship;
        } else {
            viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2().mo39821o().m140259d().localRelationship.status = jyb.m147507f0(MatchFrom.get(MatchFrom.superLiked));
        }
        C8094c c8094c = viewTreeObserverOnGlobalLayoutListenerC8017b.f22630M;
        if (c8094c != null) {
            c8094c.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: m1 */
    public static /* synthetic */ void m60159m1() {
        vxd0 vxd0Var = CoreModule.f18264c.f20381e0.f89252i6;
        vxd0Var.put(Integer.valueOf((vxd0Var.get().intValue() + 1) % 3));
    }

    /* JADX INFO: renamed from: m2 */
    public static /* synthetic */ void m60160m2(Throwable th) {
    }

    /* JADX INFO: renamed from: m5 */
    public static /* synthetic */ void m60163m5(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        nyk0 nyk0Var = new nyk0(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
        nyk0Var.m165334I(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
        nyk0Var.m146060s(new x20() { // from class: l.j8d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60432ya();
            }
        });
        llb0.m154703c().m154710i(nyk0Var);
    }

    /* JADX INFO: renamed from: m8 */
    public static /* synthetic */ void m60166m8() {
        jxd0 jxd0Var = CoreModule.f18264c.f20384f0.f20677f1;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: mb */
    public static /* synthetic */ void m60169mb(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, List list) {
        if (jyb.m147479J(list)) {
            ebm.m120180a().f92941i = true;
            return;
        }
        DialogC8219a dialogC8219a = new DialogC8219a(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
        dialogC8219a.m40263N(list);
        if (C4522a.m22099p().m22107I()) {
            C4522a.m22099p().m22102C(CorePopLevel.ICE_BREAK_OFFLINE, viewTreeObserverOnGlobalLayoutListenerC8017b.act(), dialogC8219a, ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
        } else {
            cl80.m110426e().m110439q(al80.m98641a(dialogC8219a));
        }
    }

    /* JADX INFO: renamed from: mc */
    public static /* synthetic */ void m60170mc() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89083N2;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: md */
    public static /* synthetic */ void m60171md() {
        t450.m189174h().m189183f();
        o1j0.m165651y("已修改");
    }

    /* JADX INFO: renamed from: me */
    public static /* synthetic */ void m60172me() {
        CoreModule.f18264c.f20313H1.f97077e0.clear();
        CoreModule.f18264c.f20313H1.f97078f0.clear();
    }

    /* JADX INFO: renamed from: mi */
    public static /* synthetic */ void m60176mi() {
        jxd0 jxd0Var = baj.f75703d;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: mj */
    public static void m60177mj(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("字体粗细", new C9268m(viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: mk */
    public static void m60178mk(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("好友上线提醒代发端内承接改版", new C9230c1(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m60179n() {
        jxd0 jxd0Var = pza0.f154798y;
        Boolean bool = Boolean.FALSE;
        jxd0Var.put(bool);
        pza0.f154797x.put(bool);
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m60180n0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("mock 插入推荐配对", new x20() { // from class: l.hyc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60319t7();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: n2 */
    public static /* synthetic */ void m60182n2() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89243h5;
        Boolean bool = Boolean.FALSE;
        jxd0Var.put(bool);
        CoreModule.f18264c.f20322K1.f20746S.put(bool);
    }

    /* JADX INFO: renamed from: n4 */
    public static /* synthetic */ void m60184n4() {
    }

    /* JADX INFO: renamed from: n6 */
    public static /* synthetic */ void m60186n6() {
        jxd0 jxd0Var = pza0.f154747O;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        CoreModule.f18264c.f20381e0.f89151W0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: n9 */
    public static /* synthetic */ void m60189n9(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("弹窗1", new x20() { // from class: l.k0d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59942c3(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("弹窗2", new x20() { // from class: l.l0d
            @Override // p153l.x20
            public final void call() {
                new ge2(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).show();
            }
        }));
        arrayList.add(jyb.m147494Y("插入卡片", new x20() { // from class: l.m0d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60374vi();
            }
        }));
        arrayList.add(jyb.m147494Y("清空", new x20() { // from class: l.n0d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59916b();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: na */
    public static /* synthetic */ void m60190na() {
        jxd0 jxd0Var = CoreModule.f18264c.f20384f0.f20701n1;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: nc */
    public static /* synthetic */ void m60192nc() {
        jxd0 jxd0Var = pza0.f154767e;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: ng */
    public static /* synthetic */ void m60196ng(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        View viewMo39812d = viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2().mo39812d();
        if (viewMo39812d instanceof NewNewProfileCard) {
            NewNewProfileCard newNewProfileCard = (NewNewProfileCard) viewMo39812d;
            if (newNewProfileCard.mo37925q0()) {
                return;
            }
            newNewProfileCard.m37841N3("newUser");
        }
    }

    /* JADX INFO: renamed from: nh */
    public static /* synthetic */ void m60197nh() {
        String str = "insert_see_myself_" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        new jxd0(str, bool).put(bool);
        CoreModule.f18264c.f20381e0.f89095P0.put(0L);
    }

    /* JADX INFO: renamed from: nj */
    public static void m60199nj(final String str, Act act, final int i) {
        act.duringCreated(CoreModule.f18264c.f20381e0.m116527W9(str)).subscribe(psd0.m173597H(new y20() { // from class: l.mcd
            @Override // p153l.y20
            public final void call(Object obj) {
                DebugUtil.m60256qa(str, i, (uxj0) obj);
            }
        }, new y20() { // from class: l.ncd
            @Override // p153l.y20
            public final void call(Object obj) {
                DebugUtil.m60269r1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: nk */
    public static void m60200nk(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("认证引导", new C9290s1(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m60201o() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.AdCard;
        userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        List<OMSAdCardInfo> listM172576h = pk50.m172568j().m172576h();
        if (jyb.m147479J(listM172576h) || listM172576h.size() <= 1) {
            return;
        }
        userInfo.extensionObject = listM172576h.get(1);
        CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0);
        CoreModule.f18264c.f20405m0.f20114S1.put(userInfo, 0);
    }

    /* JADX INFO: renamed from: o1 */
    public static /* synthetic */ void m60203o1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.f89211d5)) {
            arrayList.add(jyb.m147494Y("切换ab，当前".concat(CoreModule.f18264c.f20381e0.f89211d5.get().booleanValue() ? "true" : "false"), new C9251h2()));
            viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
        }
    }

    /* JADX INFO: renamed from: o3 */
    public static /* synthetic */ void m60205o3() {
        upm.f180293j = true;
        upm.f180290g = true;
        upm.f180291h = false;
    }

    /* JADX INFO: renamed from: o5 */
    public static /* synthetic */ void m60207o5(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("快速指引", new x20() { // from class: l.r5d
            @Override // p153l.x20
            public final void call() {
                of7.m167420o().m167426B(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            }
        }));
        arrayList.add(jyb.m147494Y("闪聊匹配快速指引", new x20() { // from class: l.s5d
            @Override // p153l.x20
            public final void call() {
                OnlineMatchManager.m51326z().m51376x(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "planA");
            }
        }));
        arrayList.add(jyb.m147494Y("附近动态快速指引", new x20() { // from class: l.t5d
            @Override // p153l.x20
            public final void call() {
                CoreModule.m30932N().mo61447Bh(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), CoreModule.f18264c.f20381e0.m116600p9().isFemale());
            }
        }));
        arrayList.add(jyb.m147494Y("手势动画指引", new x20() { // from class: l.v5d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60196ng(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: o9 */
    public static /* synthetic */ void m60211o9(Act act) {
        CoreModule.f18264c.f20405m0.f20088I2.m137019l(pf60.m172085a(SwipeDirection.LEFT, null));
        m59598Li(act);
    }

    /* JADX INFO: renamed from: ob */
    public static /* synthetic */ C22421c m60213ob(User user) {
        return !NullChecker.m82486a(user) ? C22421c.just(uxj0.f181467a) : CoreModule.f18264c.f20381e0.m116620u9(user);
    }

    /* JADX INFO: renamed from: oc */
    public static /* synthetic */ void m60214oc() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89090O2;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: od */
    public static /* synthetic */ void m60215od(String str) {
        f49 f49Var = CoreModule.f18264c.f20313H1;
        f49Var.f97071Y = true;
        f49Var.f97072Z = str;
    }

    /* JADX INFO: renamed from: oe */
    public static /* synthetic */ void m60216oe() {
        OnlineMatchMatchUser onlineMatchMatchUser = new OnlineMatchMatchUser();
        onlineMatchMatchUser.userId = CoreModule.m30929H().userId();
        onlineMatchMatchUser.user = CoreModule.m30930K().me_();
        C8772a.m51451m0(onlineMatchMatchUser);
    }

    /* JADX INFO: renamed from: of */
    public static /* synthetic */ void m60217of() {
        p6d0.m170847d0().m170849c0();
        o1j0.m165651y("已清除");
    }

    /* JADX INFO: renamed from: oj */
    public static void m60221oj(final String str, Act act, final boolean z, final int i) {
        act.duringCreated(CoreModule.f18264c.f20381e0.m116527W9(str)).subscribe(psd0.m173597H(new y20() { // from class: l.rcd
            @Override // p153l.y20
            public final void call(Object obj) {
                DebugUtil.m60315t3(str, z, i, (uxj0) obj);
            }
        }, new y20() { // from class: l.scd
            @Override // p153l.y20
            public final void call(Object obj) {
                DebugUtil.m60027g0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: ok */
    public static void m60222ok(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("资料页体验优化", new C9284q1(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m60224p0(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        OnlineMatchPushUser onlineMatchPushUser = new OnlineMatchPushUser();
        onlineMatchPushUser.name = "重生的小胖子";
        onlineMatchPushUser.userId = "349281368";
        CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileMiddle().formatted();
        onlineMatchPushUser.avatarUrl = "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2MlRQNldBSVFaM1ZRRFRPU01FSFdIS043Nk5RUTA0IiwidyI6MTk2MCwiaCI6MTk1OSwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjYxNzE0NDg5Nzk1MzUzMzg2ODAsImFiIjowfQ.jpg?format=128x128";
        onlineMatchPushUser.action = "";
        onlineMatchPushUser.gender = "female";
        onlineMatchPushUser.age = Constants.VIA_REPORT_TYPE_SHARE_TO_QQ;
        onlineMatchPushUser.distance = 100;
        onlineMatchPushUser.userTagList = jyb.m147487R(new String[]{"唱各萨达多个", "喜欢广场舞", "喜欢哈哈哈"}, new qcj() { // from class: l.mac
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return DebugUtil.m59668P4((String) obj);
            }
        });
        QuickChatCardWrapper quickChatCardWrapper = new QuickChatCardWrapper(onlineMatchPushUser);
        C4883c c4883c = CoreModule.f18264c;
        onlineMatchPushUser.user = c4883c.f20381e0.m116503Pa(c4883c.f20405m0.f20136a0.m222761e().loaded.get(1).f20214id);
        a8d0.m96437x0().m96438B0(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), quickChatCardWrapper);
    }

    /* JADX INFO: renamed from: p2 */
    public static /* synthetic */ void m60226p2(Throwable th) {
    }

    /* JADX INFO: renamed from: p5 */
    public static /* synthetic */ void m60229p5(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        PurchaseType purchaseType = PurchaseType.TYPE_PICKS_MEMBERSHIP;
        new C8941c.a(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), purchaseType, null).m55277g(j690.m143618j(purchaseType.getPrivilegeData(null), Privilege.picksMembership)).m55278h();
    }

    /* JADX INFO: renamed from: p7 */
    public static /* synthetic */ void m60231p7(String str) {
        try {
            CoreModule.f18264c.f20384f0.f20731x1.put(Boolean.valueOf(Boolean.parseBoolean(str)));
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: p8 */
    public static /* synthetic */ void m60232p8(String str, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        Relationship relationship = new Relationship();
        relationship.state = RelationshipStatus.get("liked");
        relationship.status = jyb.m147507f0(MatchFrom.get(MatchFrom.superLiked));
        C4910y.m35904i3(str, relationship).materialize().subscribe(psd0.m173596G(new y20() { // from class: l.eyc
            @Override // p153l.y20
            public final void call(Object obj) {
                DebugUtil.m60157m(viewTreeObserverOnGlobalLayoutListenerC8017b, (Notification) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: pa */
    public static /* synthetic */ void m60234pa(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("打开认证", new x20() { // from class: l.p9d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60431y9(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("打开认证中", new x20() { // from class: l.r9d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60392we(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: pc */
    public static /* synthetic */ void m60236pc(PurchaseType purchaseType, Act act, String str) {
    }

    /* JADX INFO: renamed from: ph */
    public static /* synthetic */ void m60241ph(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        List<Merchandise> listM222761e = CoreModule.f18264c.f20396j0.m31583E4().m222761e();
        ueh0.m195763r(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), !jyb.m147479J(listM222761e) ? listM222761e.get(0) : null);
    }

    /* JADX INFO: renamed from: pj */
    public static void m60243pj(final String str, Act act) {
        act.duringCreated(CoreModule.f18264c.f20381e0.m116616t9(str)).subscribe(psd0.m173597H(new y20() { // from class: l.ycd
            @Override // p153l.y20
            public final void call(Object obj) {
                DebugUtil.m59742Sf(str, (uxj0) obj);
            }
        }, new y20() { // from class: l.zcd
            @Override // p153l.y20
            public final void call(Object obj) {
                DebugUtil.m60421y((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: pk */
    public static void m60244pk(long j) {
        byd0 byd0Var = new byd0("use_first_login_local_time_" + uqb0.f180397c0.userId(), -1L);
        uqb0.f180424x0 = j;
        byd0Var.put(Long.valueOf(j));
        uqb0.m197259Z0(true, false).materialize().first().subscribe(psd0.m173597H(new y20() { // from class: l.qad
            @Override // p153l.y20
            public final void call(Object obj) {
                DebugUtil.m59773U4((Notification) obj);
            }
        }, new y20() { // from class: l.rad
            @Override // p153l.y20
            public final void call(Object obj) {
                DebugUtil.m59705R((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m60246q0() {
        jxd0 jxd0Var = pza0.f154744L;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: q1 */
    public static /* synthetic */ void m60247q1(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        String str = jek.f120505a.format(new Date());
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().getString(R$string.f19850z1, str.substring(0, 4), str.substring(5, 7), str.substring(8, 10));
    }

    /* JADX INFO: renamed from: q2 */
    public static /* synthetic */ void m60248q2(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("探探认证引导Dlg 点击产生", new x20() { // from class: l.nmc
            @Override // p153l.x20
            public final void call() {
                zki0.m220081J(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), false, CoreModule.f18264c.f20381e0.m116600p9());
            }
        }));
        arrayList.add(jyb.m147494Y("探探认证能量提示Dlg 划卡产生", new x20() { // from class: l.tmc
            @Override // p153l.x20
            public final void call() {
                zki0.m220084M(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            }
        }));
        arrayList.add(jyb.m147494Y("升级实名认证弹窗", new x20() { // from class: l.umc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                zki0.m220083L(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), new x20() { // from class: l.s4d
                    @Override // p153l.x20
                    public final void call() {
                        ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b3 = viewTreeObserverOnGlobalLayoutListenerC8017b2;
                        viewTreeObserverOnGlobalLayoutListenerC8017b3.act().startActivity(IntroductionAct.m57252Y1(viewTreeObserverOnGlobalLayoutListenerC8017b3.act(), "", true));
                    }
                });
            }
        }));
        arrayList.add(jyb.m147494Y("探探认证设置页开关提示", new x20() { // from class: l.vmc
            @Override // p153l.x20
            public final void call() {
                zki0.m220085N(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            }
        }));
        arrayList.add(jyb.m147494Y("探探认证取消挽留", new x20() { // from class: l.wmc
            @Override // p153l.x20
            public final void call() {
                zki0.m220080I(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            }
        }));
        arrayList.add(jyb.m147494Y("探探认证结果（失败）", new x20() { // from class: l.xmc
            @Override // p153l.x20
            public final void call() {
                zki0.m220087P(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), StudentVerificationStatus.get("rejected"), StudentVerificationStatus.get("rejected"));
            }
        }));
        arrayList.add(jyb.m147494Y("探探认证结果（认证中）", new x20() { // from class: l.ymc
            @Override // p153l.x20
            public final void call() {
                zki0.m220087P(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), StudentVerificationStatus.get("pending"), StudentVerificationStatus.get("rejected"));
            }
        }));
        arrayList.add(jyb.m147494Y("探探认证结果（成功）", new x20() { // from class: l.anc
            @Override // p153l.x20
            public final void call() {
                zki0.m220087P(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), StudentVerificationStatus.get("verified"), StudentVerificationStatus.get("verified"));
            }
        }));
        arrayList.add(jyb.m147494Y("探探认证结果（成功未激活）", new x20() { // from class: l.bnc
            @Override // p153l.x20
            public final void call() {
                zki0.m220087P(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), StudentVerificationStatus.get("verified"), StudentVerificationStatus.get("rejected"));
            }
        }));
        arrayList.add(jyb.m147494Y("探探认证显示我的tab红点", new x20() { // from class: l.cnc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20327M0.m194844f3(true);
            }
        }));
        arrayList.add(jyb.m147494Y("探探认证设置页显示气泡", new x20() { // from class: l.pmc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60022fh();
            }
        }));
        arrayList.add(jyb.m147494Y("探探认证右上角图标（我的信息）", new x20() { // from class: l.qmc
            @Override // p153l.x20
            public final void call() {
                zki0.m220086O(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), true);
            }
        }));
        arrayList.add(jyb.m147494Y("探探认证右上角图标（别人的信息）", new x20() { // from class: l.rmc
            @Override // p153l.x20
            public final void call() {
                zki0.m220086O(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), false);
            }
        }));
        arrayList.add(jyb.m147494Y("探探认证清空数据", new x20() { // from class: l.smc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59528Ie();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: q4 */
    public static /* synthetic */ void m60250q4() {
        CoreModule.f18264c.f20389g2.m192262e3();
        o1j0.m165651y("已重置");
    }

    /* JADX INFO: renamed from: q6 */
    public static /* synthetic */ void m60252q6() {
        jxd0 jxd0Var = CoreModule.f18264c.f20405m0.f20202w0;
        Boolean bool = Boolean.FALSE;
        jxd0Var.put(bool);
        CoreModule.f18264c.f20381e0.f89151W0.put(bool);
    }

    /* JADX INFO: renamed from: q7 */
    public static /* synthetic */ void m60253q7() {
        CoreModule.f18264c.f20443y2.m216828v3();
        o1j0.m165651y("已重置");
    }

    /* JADX INFO: renamed from: q8 */
    public static /* synthetic */ void m60254q8(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, String str) {
        if (TextUtils.isEmpty(str)) {
            r1j0.m179415b("请先输入跳转地址");
            return;
        }
        f39099a.put(str);
        Intent intentM81347a2 = WebViewAct.m81347a2(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "美团h5", str);
        intentM81347a2.putExtra("AD_WebView", true);
        intentM81347a2.putExtra("is_mt_pay", true);
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().startActivity(intentM81347a2);
    }

    /* JADX INFO: renamed from: q9 */
    public static /* synthetic */ void m60255q9(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().startActivity(new Intent(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), (Class<?>) OldInfoTransNewAct.class));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: qa */
    public static /* synthetic */ void m60256qa(String str, int i, uxj0 uxj0Var) {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f20214id = str;
        CoreModule.f18264c.f20405m0.m32157w6(userInfo, i);
    }

    /* JADX INFO: renamed from: qb */
    public static /* synthetic */ void m60257qb(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        ik4 ik4VarMo39821o = viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2().mo39821o();
        CoreSuggested.UserInfo userInfoM140260e = ik4VarMo39821o.m140260e();
        if (userInfoM140260e == null) {
            r1j0.m179420g("顶部卡片无 UserInfo");
            return;
        }
        SuggestedComplimentItem suggestedComplimentItem = new SuggestedComplimentItem();
        suggestedComplimentItem.receiverId = ik4VarMo39821o.m140259d().f56859id;
        suggestedComplimentItem.senderId = "debug_sender";
        suggestedComplimentItem.type = BuildConfig.BUILD_TYPE;
        suggestedComplimentItem.value = "Debug compliment";
        suggestedComplimentItem.media = null;
        suggestedComplimentItem.nullCheck();
        userInfoM140260e.compliment = suggestedComplimentItem;
        r1j0.m179420g("已添加 compliment");
    }

    /* JADX INFO: renamed from: qc */
    public static /* synthetic */ void m60258qc() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.AdCard;
        userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        List<OMSAdCardInfo> listM172576h = pk50.m172568j().m172576h();
        if (jyb.m147479J(listM172576h)) {
            return;
        }
        userInfo.extensionObject = listM172576h.get(0);
        CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0);
        CoreModule.f18264c.f20405m0.f20114S1.put(userInfo, 0);
    }

    /* JADX INFO: renamed from: qe */
    public static /* synthetic */ void m60260qe() {
        jxd0 jxd0Var = pza0.f154742J;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: qf */
    public static /* synthetic */ void m60261qf() {
        C8291a.f26041f.put(Boolean.FALSE);
        CoreModule.f18264c.f20381e0.f89104Q1.put(-1L);
    }

    /* JADX INFO: renamed from: qj */
    public static void m60265qj(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("国际化-翁翁二楼", new C9265l0(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: qk */
    public static void m60266qk(ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("用户查询", new x20() { // from class: l.quc
            @Override // p153l.x20
            public final void call() {
                w1e.m204400d(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m204430r("属于UserId").m204421F(new y20() { // from class: l.o9d
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        CoreModule.f18264c.f20381e0.m116483Ka((String) obj).subscribe(psd0.m173596G(new DebugUtil.C9263k2()));
                    }
                }).m204426n().show();
            }
        }));
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m60267r() {
        jxd0 jxd0Var = CoreModule.f18264c.f20405m0.f20200v1;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m60268r0(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        tvp0 tvp0Var = new tvp0(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
        tvp0Var.m192830M(CoreModule.f18264c.f20381e0.f89061K1.m222761e().get());
        tvp0Var.show();
    }

    /* JADX INFO: renamed from: r1 */
    public static /* synthetic */ void m60269r1(Throwable th) {
    }

    /* JADX INFO: renamed from: r3 */
    public static /* synthetic */ void m60271r3() {
        jxd0 jxd0Var = pza0.f154751S;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: r6 */
    public static /* synthetic */ void m60274r6() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89292n6;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: r9 */
    public static /* synthetic */ void m60277r9() {
        List<T> listM208674j = CoreModule.f18272k.f115535c.m189449K().m208674j();
        final GreetingSummary greetingSummaryNew_ = GreetingSummary.new_();
        greetingSummaryNew_.latestMessageId = ((Message) listM208674j.get(0)).f56859id;
        if (listM208674j.size() > 0) {
            l51.m152887G(new Runnable() { // from class: l.f8d
                @Override // java.lang.Runnable
                public final void run() {
                    DebugUtil.m60451z7(greetingSummaryNew_);
                }
            });
        }
    }

    /* JADX INFO: renamed from: rc */
    public static /* synthetic */ void m60280rc(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: re */
    public static /* synthetic */ void m60282re() {
        CoreModule.f18264c.f20383e2.f153003R.clear();
        CoreModule.f18264c.f20383e2.f153004S.clear();
        CoreModule.f18264c.f20383e2.f153013b0.put(0);
    }

    /* JADX INFO: renamed from: rh */
    public static /* synthetic */ void m60285rh() {
        w600.m205009h().m205014l();
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89207d1;
        Boolean bool = Boolean.FALSE;
        jxd0Var.put(bool);
        CoreModule.f18264c.f20381e0.f89215e1.put(bool);
        CoreModule.f18264c.f20373b1.f193004R.put(bool);
        CoreModule.f18264c.f20373b1.f193005S.put(bool);
    }

    /* JADX INFO: renamed from: ri */
    public static /* synthetic */ void m60286ri(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        w8p.C21047a c21047a = new w8p.C21047a(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
        ArrayList arrayListM147507f0 = jyb.m147507f0(PurchaseType.TYPE_GET_VIP, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        Privilege privilege = Privilege.vip_location;
        c21047a.m205520i(arrayListM147507f0, jyb.m147507f0(privilege, privilege)).m205515d(BuildConfig.BUILD_TYPE).m205521j(0).m205522k();
    }

    /* JADX INFO: renamed from: rj */
    public static void m60287rj(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("国际化-交友目的", new C9261k0(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: rk */
    public static void m60288rk(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("推荐聊天室", new C9304x0(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: s3 */
    public static /* synthetic */ void m60293s3() {
    }

    /* JADX INFO: renamed from: sa */
    public static /* synthetic */ void m60300sa() {
        jxd0 jxd0Var = pza0.f154782l0;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        jxd0 jxd0Var2 = pza0.f154774h0;
        Boolean bool = Boolean.FALSE;
        jxd0Var2.put(bool);
        pza0.f154776i0.put(bool);
        pza0.f154778j0.put(bool);
        pza0.f154780k0.put(bool);
    }

    /* JADX INFO: renamed from: sb */
    public static /* synthetic */ void m60301sb() {
        Message messageNew_ = Message.new_();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("gameId", BLiveButtonType.dice);
            jSONObject.put("receiverTitle", "摇骰子游戏邀请");
            jSONObject.put("receiverSubtitle", "对方邀请你玩“掷骰子”游戏");
            jSONObject.put("buttonText", "加入游戏");
            messageNew_.msgData = jSONObject.toString(1);
            messageNew_.messageType = MessageType.get(MessageType.wanwan_invite);
            CoreModule.f18264c.f20384f0.f20705o2.clear();
            CoreModule.f18264c.f20384f0.f20705o2.add(messageNew_);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            iig0.m140070a(e);
        }
    }

    /* JADX INFO: renamed from: sd */
    public static /* synthetic */ void m60303sd() {
    }

    /* JADX INFO: renamed from: si */
    public static /* synthetic */ void m60308si(boolean z, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, String str) {
        CoreModule.f18264c.f20439x1.seeBlindBoxEnvelope = new SeeBlindBoxEnvelope();
        CoreModule.f18264c.f20439x1.seeBlindBoxEnvelope.nullCheck();
        User userMe_ = CoreModule.m30930K().me_();
        if (!TextUtils.isEmpty(str)) {
            userMe_.f56859id = str;
            if (CoreModule.f18264c.f20381e0.m116503Pa(str) == null) {
                o1j0.m165636j("输入的uid 本地数据库没有");
            }
        }
        CoreModule.f18264c.f20439x1.seeBlindBoxEnvelope.data.users.add(userMe_);
        if (z) {
            viewTreeObserverOnGlobalLayoutListenerC8017b.act().duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(str)).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new C9289s0(viewTreeObserverOnGlobalLayoutListenerC8017b)));
        } else {
            rfe0.m181170b(viewTreeObserverOnGlobalLayoutListenerC8017b);
        }
    }

    /* JADX INFO: renamed from: sj */
    public static void m60309sj(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("Intl-ILIke", new C9237e0(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: sk */
    public static void m60310sk(final ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("红点曝光优化", new x20() { // from class: l.mqc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60091j(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m60311t(PurchaseType purchaseType, Act act, String str) {
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m60312t0() {
        jxd0 jxd0Var = pza0.f154784m0;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: t1 */
    public static /* synthetic */ void m60313t1(List list) {
        if (jyb.m147479J(list)) {
            return;
        }
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.extensionObject = list;
        userInfo.virtualCardType = VirtualCardType.IceBreakQuestionOfflineCard;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: t2 */
    public static /* synthetic */ void m60314t2(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("低价试用大页面", new x20() { // from class: l.v8d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60103jb(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("低价试用弹窗", new x20() { // from class: l.w8d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59530Ig(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: t3 */
    public static /* synthetic */ void m60315t3(String str, boolean z, int i, uxj0 uxj0Var) {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f20214id = str;
        userInfo.setUserLikeMe(z);
        CoreModule.f18264c.f20405m0.m32157w6(userInfo, i);
    }

    /* JADX INFO: renamed from: t4 */
    public static /* synthetic */ void m60316t4() {
        jxd0 jxd0Var = CoreModule.f18264c.f20405m0.f20078F1;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: t5 */
    public static /* synthetic */ void m60317t5(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        PurchaseType purchaseType = PurchaseType.TYPE_O_DIAMOND;
        new C8941c.a(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), purchaseType, null).m55277g(j690.m143617i(purchaseType.getPrivilegeData(null), null)).m55278h();
    }

    /* JADX INFO: renamed from: t7 */
    public static /* synthetic */ void m60319t7() {
    }

    /* JADX INFO: renamed from: t8 */
    public static /* synthetic */ void m60320t8(final ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, final b240 b240Var) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("隐身功能回收【汇总】", new x20() { // from class: l.tvc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60010f5(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("See试用配对失效引导【汇总】", new x20() { // from class: l.xvc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59835X3(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("一键配对【汇总】", new x20() { // from class: l.awc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59484Ge(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("闪聊优化三期【汇总】", new x20() { // from class: l.bwc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60075i4(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("每日精选【汇总】", new x20() { // from class: l.cwc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59635Nd(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("免费试用SVIP特权【汇总】", new x20() { // from class: l.dwc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60443z(arrayList, b240Var, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("会员改版入口联动【汇总】", new x20() { // from class: l.ewc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60343u9(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("插入一个see画像升级用户到see列表", new x20() { // from class: l.fwc
            @Override // p153l.x20
            public final void call() {
                xje0.m211212d().m211214c(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            }
        }));
        arrayList.add(jyb.m147494Y("白金会员【汇总】", new x20() { // from class: l.gwc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59999eg(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("女性会员【汇总】", new x20() { // from class: l.hwc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59386C4(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("青春专享会员【汇总】", new x20() { // from class: l.uvc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59493H1(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("私人定制【汇总】", new x20() { // from class: l.vvc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59702Qh(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("VIP试用【汇总】", new x20() { // from class: l.wvc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60314t2(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: t9 */
    public static /* synthetic */ void m60321t9(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: tc */
    public static /* synthetic */ void m60324tc() {
    }

    /* JADX INFO: renamed from: td */
    public static /* synthetic */ void m60325td(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        jch0 jch0Var = new jch0(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
        jch0Var.show();
        och0.m167217c(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), jch0Var);
    }

    /* JADX INFO: renamed from: te */
    public static /* synthetic */ void m60326te(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        View viewInflate = LayoutInflater.from(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).inflate(kec0.f125927l4, (ViewGroup) null);
        uqb0.f180374G.m127120O((VDraweeView) viewInflate.findViewById(adc0.f70621w5), CoreModule.f18264c.f20381e0.m116600p9().picture(0).url, 4, 100);
        ((VText) viewInflate.findViewById(adc0.f70124Sd)).setText("测试");
        SimplePushBubble simplePushBubbleM22168s = new SimplePushBubble.C4523a(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), viewInflate).m22170u("" + System.currentTimeMillis()).m22172w(30000).m22163B(2).m22168s();
        ((VButton) viewInflate.findViewById(adc0.f69873E0)).setText("去聊聊");
        simplePushBubbleM22168s.m126745x(CorePopLevel.IMMERSION_SEND_MSG);
        llb0.m154703c().m154710i(simplePushBubbleM22168s);
    }

    /* JADX INFO: renamed from: tf */
    public static /* synthetic */ void m60327tf(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        Literatures literaturesNew_ = Literatures.new_();
        literaturesNew_.title = "小王子";
        literaturesNew_.f21175id = "1";
        literaturesNew_.headUrl = "http://cloud.staging2.p1staff.com/v1/images/eyJpZCI6Ik5PNVRKQ1NMUUdEM1RXTk5SMzdUUTZCQ1lVWVdKRzAxIiwidyI6MTI0MiwiaCI6MTI0MiwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjExMzM3MTUwODAzMjE1MTAyMjc3fQ";
        literaturesNew_.category = "book";
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 5; i++) {
            LiteraturesComments literaturesComments = new LiteraturesComments();
            Literatures literatures = new Literatures();
            if (i == 0) {
                literatures.headUrl = "http://cloud.staging2.p1staff.com/v1/images/eyJpZCI6IlZXUEJFTVczNFY0RU9PUFhDREFMREhHNVBCRU5STzAzIiwidyI6MTkzOCwiaCI6MjQyMywiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjEzNTMxMzg1MjUwMjE3ODc3NTkyfQ";
            } else {
                literatures.headUrl = "http://cloud.staging2.p1staff.com/v1/images/eyJpZCI6Ik5PNVRKQ1NMUUdEM1RXTk5SMzdUUTZCQ1lVWVdKRzAxIiwidyI6MTI0MiwiaCI6MTI0MiwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjExMzM3MTUwODAzMjE1MTAyMjc3fQ";
            }
            literaturesComments.localLiteratures = literatures;
            arrayList.add(literaturesComments);
        }
        for (int i2 = 0; i2 < 5; i2++) {
            arrayList2.add("你们都对《作品名称》感兴趣");
        }
        new w53().m204943F(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "11111", "pageId", false, arrayList, arrayList2, new w53.C21023d("card", "both_like"), new C9233d0());
    }

    /* JADX INFO: renamed from: th */
    public static /* synthetic */ void m60329th() {
        vxd0 vxd0Var = CoreModule.f18264c.f20381e0.f89268k6;
        vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
    }

    /* JADX INFO: renamed from: tj */
    public static void m60331tj(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("国际化-已读回执", new C9241f0(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: tk */
    public static void m60332tk() {
        l51.m152893M(new Runnable() { // from class: l.sac
            @Override // java.lang.Runnable
            public final void run() {
                DebugUtil.m60457zd();
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m60334u0() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89039G6;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: u1 */
    public static /* synthetic */ void m60335u1() {
        if (C4909x.f20878R.get().longValue() == 1) {
            C4909x.f20878R.put(10L);
        } else {
            C4909x.f20878R.put(1L);
        }
    }

    /* JADX INFO: renamed from: u2 */
    public static /* synthetic */ void m60336u2() {
        jxd0 jxd0Var = pza0.f154797x;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        pza0.f154798y.put(Boolean.valueOf(!pza0.f154797x.get().booleanValue()));
    }

    /* JADX INFO: renamed from: u3 */
    public static /* synthetic */ void m60337u3() {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.local_birthday_tip);
        CoreModule.f18264c.f20384f0.f20705o2.clear();
        CoreModule.f18264c.f20384f0.f20705o2.add(messageNew_);
    }

    /* JADX INFO: renamed from: u6 */
    public static /* synthetic */ void m60340u6(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("春节活动清理弹框：", new x20() { // from class: l.w5d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60368vc();
            }
        }));
        arrayList.add(jyb.m147494Y("实验开关：" + CoreModule.f18264c.f20381e0.f89202c4.get(), new x20() { // from class: l.h6d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60077i6();
            }
        }));
        arrayList.add(jyb.m147494Y("清理首页保存的已经推荐的数据：", new x20() { // from class: l.i6d
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20405m0.f20185q1.clear();
            }
        }));
        arrayList.add(jyb.m147494Y("清理 插入特定的想结婚用", new x20() { // from class: l.j6d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60135l();
            }
        }));
        arrayList.add(jyb.m147494Y("插入特定的想结婚用：", new x20() { // from class: l.k6d
            @Override // p153l.x20
            public final void call() {
                w1e.m204400d(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m204419D(10).m204430r("输入插入Userid").m204421F(new y20() { // from class: l.lac
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        CoreModule.f18264c.f20405m0.f20066B1.put((String) obj);
                    }
                }).m204426n().show();
            }
        }));
        arrayList.add(jyb.m147494Y("打开交友目的选择", new x20() { // from class: l.l6d
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), new DebugUtil.RunnableC9223a2(new u3x(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), "")), 1000L);
            }
        }));
        arrayList.add(jyb.m147494Y("切换弹框", new x20() { // from class: l.m6d
            @Override // p153l.x20
            public final void call() {
                l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), new DebugUtil.RunnableC9227b2(), 1000L);
            }
        }));
        arrayList.add(jyb.m147494Y("Debug模式控制入口：" + CoreModule.f18264c.f20381e0.f89186a4.get(), new x20() { // from class: l.n6d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59372Bc();
            }
        }));
        arrayList.add(jyb.m147494Y("侧边开", new x20() { // from class: l.o6d
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20381e0.f89020E1.m137019l(Boolean.TRUE);
            }
        }));
        arrayList.add(jyb.m147494Y("prfile页", new x20() { // from class: l.p6d
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.m38146D6(MarryProfileEditAct.m48601Z1(viewTreeObserverOnGlobalLayoutListenerC8017b2.act()));
            }
        }));
        arrayList.add(jyb.m147494Y("进入落地页", new x20() { // from class: l.x5d
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().startActivity(new Intent(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), (Class<?>) MarryInfoAuditStatusAct.class));
            }
        }));
        arrayList.add(jyb.m147494Y("交友目的", new x20() { // from class: l.y5d
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().startActivity(new Intent(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), (Class<?>) MarryStatusSetAct.class));
            }
        }));
        arrayList.add(jyb.m147494Y("跳转连续编辑页 null测试", new x20() { // from class: l.z5d
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().startActivity(MarryEditProfileSeriesAct.m48635Z1(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), CoreModule.m30930K().me_(), null, true, false, false));
            }
        }));
        arrayList.add(jyb.m147494Y("插入广告卡", new x20() { // from class: l.a6d
            @Override // p153l.x20
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC8017b.act().postDelayed(new Runnable() { // from class: l.qbd
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m60079i8();
                    }
                }, 500L);
            }
        }));
        arrayList.add(jyb.m147494Y("插入四选一广告卡", new x20() { // from class: l.b6d
            @Override // p153l.x20
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC8017b.act().postDelayed(new Runnable() { // from class: l.jbd
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m60082ib();
                    }
                }, 500L);
            }
        }));
        arrayList.add(jyb.m147494Y("清空四选一数据", new x20() { // from class: l.c6d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59770U1();
            }
        }));
        arrayList.add(jyb.m147494Y("四选一变身小姐姐:" + CoreModule.f18264c.f20381e0.f89139U4.get(), new x20() { // from class: l.d6d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60363v7();
            }
        }));
        arrayList.add(jyb.m147494Y("忽略支付" + f39104f, new x20() { // from class: l.e6d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.f39104f = !DebugUtil.f39104f;
            }
        }));
        arrayList.add(jyb.m147494Y("清空标记数据", new x20() { // from class: l.g6d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59392Ca();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: u8 */
    public static /* synthetic */ void m60342u8() {
    }

    /* JADX INFO: renamed from: u9 */
    public static /* synthetic */ void m60343u9(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("清除所有标记", new x20() { // from class: l.e9d
            @Override // p153l.x20
            public final void call() {
                TabUniteManager.m46136i().m46137h(TabUniteManager.BadgeIconType.NONE);
            }
        }));
        arrayList.add(jyb.m147494Y("清除促销标记", new x20() { // from class: l.g9d
            @Override // p153l.x20
            public final void call() {
                TabUniteManager.m46136i().m46137h(TabUniteManager.BadgeIconType.PROMOTION);
            }
        }));
        arrayList.add(jyb.m147494Y("清除See标记", new x20() { // from class: l.h9d
            @Override // p153l.x20
            public final void call() {
                TabUniteManager.m46136i().m46137h(TabUniteManager.BadgeIconType.SEE);
            }
        }));
        arrayList.add(jyb.m147494Y("清除Boost标记", new x20() { // from class: l.i9d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59783Ue();
            }
        }));
        arrayList.add(jyb.m147494Y("清除黑金会员标记", new x20() { // from class: l.j9d
            @Override // p153l.x20
            public final void call() {
                TabUniteManager.m46136i().m46137h(TabUniteManager.BadgeIconType.ODIAMOND);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: ua */
    public static /* synthetic */ void m60344ua(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        y6d0.m214480s(viewTreeObserverOnGlobalLayoutListenerC8017b.m38295g2(), "测试");
        y6d0.m214480s(viewTreeObserverOnGlobalLayoutListenerC8017b.m38295g2(), "测试");
    }

    /* JADX INFO: renamed from: ud */
    public static /* synthetic */ void m60347ud(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.f89038G5)) {
            arrayList.add(jyb.m147494Y("强制展示消息弱化提醒，当前".concat(CoreModule.f18264c.f20381e0.f89038G5.get().booleanValue() ? "true" : "false"), new C9255i2()));
            arrayList.add(jyb.m147494Y("清除所有频控", new C9259j2()));
            viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
        }
    }

    /* JADX INFO: renamed from: ug */
    public static /* synthetic */ void m60350ug() {
        jxd0 jxd0Var = o1j0.f144660a;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: uj */
    public static void m60353uj(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("国际化 会员购买挽回弹窗", new C9249h0(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: uk */
    public static void m60354uk(final ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("see toast trace debug", new x20() { // from class: l.mmc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59405D1(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
    }

    /* JADX INFO: renamed from: v0 */
    public static /* synthetic */ void m60356v0() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89338u2;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: v1 */
    public static /* synthetic */ void m60357v1() {
        CoreModule.f18264c.f20405m0.f20122V0.put(Boolean.TRUE);
        CoreModule.f18264c.f20405m0.f20125W0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: v3 */
    public static /* synthetic */ void m60359v3() {
        Message messageNew_ = Message.new_();
        try {
            new JSONObject().put("needOpen", true);
            MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
            messageNew_.additionalData = messageAdditionalDataNew_;
            messageAdditionalDataNew_.groupInvitation = GroupInvitation.new_();
            GroupInvitation groupInvitation = messageNew_.additionalData.groupInvitation;
            groupInvitation.button.title = "查看群消息";
            groupInvitation.title = "邀请加入“欧美好剧的群…";
            groupInvitation.subTitle = "这个群有点意思，快来一起聊~";
            messageNew_.messageType = MessageType.get(MessageType.group_invitation);
            CoreModule.f18264c.f20384f0.f20705o2.clear();
            CoreModule.f18264c.f20384f0.f20705o2.add(messageNew_);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            iig0.m140070a(e);
        }
    }

    /* JADX INFO: renamed from: v4 */
    public static /* synthetic */ void m60360v4(String str) {
        CoreModule.f18264c.f20384f0.f20610J0.put(str);
        CoreModule.f18264c.f20384f0.f20604H0.put(Long.valueOf(pzi0.m174454o()));
        CoreModule.f18264c.f20384f0.f20607I0.put(Long.valueOf(pzi0.m174454o() + com.clevertap.android.sdk.Constants.INBOX_V2_THROTTLE_WINDOW_MS));
    }

    /* JADX INFO: renamed from: v6 */
    public static /* synthetic */ void m60362v6(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: v7 */
    public static /* synthetic */ void m60363v7() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89139U4;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: va */
    public static /* synthetic */ void m60366va() {
        ieh0.m139612a().put(0L);
        new byd0("svip_trial_dlg_show" + CoreModule.m30929H().userId(), -1L).put(0L);
        String str = "recall_dlg_show" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.TRUE;
        new jxd0(str, bool).put(bool);
        new wyd0("svip_year_prom_coupon_id" + CoreModule.m30929H().userId(), "").put("");
        new wyd0("svip_6m_double11_prom_coupon_id" + CoreModule.m30929H().userId(), "").put("");
    }

    /* JADX INFO: renamed from: vc */
    public static /* synthetic */ void m60368vc() {
        CoreModule.f18264c.f20381e0.f89312q4.clear();
        CoreModule.f18264c.f20381e0.f89305p4.clear();
    }

    /* JADX INFO: renamed from: vd */
    public static /* synthetic */ void m60369vd(b240 b240Var) {
        if (iz40.m142788y(b240Var.m101951T4(), true)) {
            return;
        }
        b240Var.f74502G.m137019l(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: vg */
    public static /* synthetic */ void m60372vg() {
        du80.m118106g().m118110a();
        r1j0.m179420g("已清除");
    }

    /* JADX INFO: renamed from: vh */
    public static /* synthetic */ void m60373vh() {
        jxd0 jxd0Var = CoreModule.f18264c.f20405m0.f20194t1;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: vi */
    public static /* synthetic */ void m60374vi() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.BarLoverGuideCard;
        userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: vj */
    public static void m60375vj(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("国际化 tribe", new C9257j0(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: vk */
    public static void m60376vk(final Act act) {
        w1e.m204400d(act).m204419D(10).m204430r("输入插入Userid").m204421F(new y20() { // from class: l.y7d
            @Override // p153l.y20
            public final void call(Object obj) {
                l51.m152888H(act, new Runnable() { // from class: l.cac
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m60215od(str);
                    }
                }, 1000L);
            }
        }).m204426n().show();
    }

    /* JADX INFO: renamed from: w1 */
    public static /* synthetic */ void m60379w1() {
        String str = "core_greet_say_hi_gift_guide_is_never_show_" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        new jxd0(str, bool).put(bool);
    }

    /* JADX INFO: renamed from: w3 */
    public static /* synthetic */ String m60381w3(OpenSdkCodeAuth openSdkCodeAuth) {
        return (!NullChecker.m82486a(openSdkCodeAuth) || TextUtils.isEmpty(openSdkCodeAuth.code)) ? "" : openSdkCodeAuth.code;
    }

    /* JADX INFO: renamed from: w4 */
    public static /* synthetic */ void m60382w4(final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        iz40.m142762G(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), true);
        l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), new Runnable() { // from class: l.dxc
            @Override // java.lang.Runnable
            public final void run() {
                iz40.m142762G(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), true);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: w6 */
    public static /* synthetic */ void m60384w6(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        PurchaseType purchaseType = PurchaseType.TYPE_PICKS_MEMBERSHIP;
        ArrayList<Privilege> privilegeData = purchaseType.getPrivilegeData(null);
        Privilege privilege = Privilege.picksMembership;
        new C8924b.d(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m54514m(purchaseType, privilege).m54512k(j690.m143618j(privilegeData, privilege)).m54517p();
    }

    /* JADX INFO: renamed from: w9 */
    public static /* synthetic */ void m60387w9() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.UndoGuideCard;
        userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: wc */
    public static /* synthetic */ void m60390wc() {
        jxd0 jxd0Var = CoreModule.f18264c.f20384f0.f20659Z0;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: we */
    public static /* synthetic */ void m60392we(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        final VerificationNetworkData verificationNetworkDataNew_ = VerificationNetworkData.new_();
        verificationNetworkDataNew_.meta.code = TantanException.NET_ACTION_AVATAR_VERIFICATION;
        verificationNetworkDataNew_.data.status = 2;
        v3l0.m199281e().m199282b().m137019l(verificationNetworkDataNew_);
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().postDelayed(new Runnable() { // from class: l.ocd
            @Override // java.lang.Runnable
            public final void run() {
                v3l0.m199281e().m199282b().m137019l(verificationNetworkDataNew_);
            }
        }, com.clevertap.android.sdk.Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
    }

    /* JADX INFO: renamed from: wh */
    public static /* synthetic */ void m60395wh() {
    }

    /* JADX INFO: renamed from: wi */
    public static /* synthetic */ void m60396wi(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.f89011C6)) {
            arrayList.add(jyb.m147494Y("强制展示邀请认证样式的认证入口，当前：".concat(CoreModule.f18264c.f20381e0.f89011C6.get().booleanValue() ? "true" : "false"), new x20() { // from class: l.m3d
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.m59553Jh();
                }
            }));
        }
        arrayList.add(jyb.m147494Y("清除认证中心入口点击频控", new C9260k()));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: wj */
    public static void m60397wj(ArrayList<pf60<String, x20>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("国际化 会员升级", new C9253i0(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b)));
    }

    /* JADX INFO: renamed from: wk */
    public static void m60398wk(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        View viewInflate = LayoutInflater.from(viewTreeObserverOnGlobalLayoutListenerC8017b.getContext()).inflate(kec0.f125569P8, (ViewGroup) null);
        View decorView = viewTreeObserverOnGlobalLayoutListenerC8017b.act().getWindow().getDecorView();
        if (decorView instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            layoutParams.bottomMargin = qa00.m175859d(150.0f);
            ((FrameLayout) decorView).addView(viewInflate, layoutParams);
            ((PopDebugLayout) viewInflate).setMainViewModel(viewTreeObserverOnGlobalLayoutListenerC8017b);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ void m60400x0() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89147V4;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: x2 */
    public static /* synthetic */ void m60402x2(Throwable th) {
    }

    /* JADX INFO: renamed from: x3 */
    public static /* synthetic */ void m60403x3(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        View viewInflate = LayoutInflater.from(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).inflate(kec0.f125927l4, (ViewGroup) null);
        uqb0.f180374G.m127120O((VDraweeView) viewInflate.findViewById(adc0.f70621w5), CoreModule.f18264c.f20381e0.m116600p9().picture(0).url, 4, 100);
        ((VText) viewInflate.findViewById(adc0.f70124Sd)).setText("测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试");
        SimplePushBubble simplePushBubbleM22168s = new SimplePushBubble.C4523a(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), viewInflate).m22170u("" + System.currentTimeMillis()).m22172w(30000).m22163B(2).m22168s();
        ((VButton) viewInflate.findViewById(adc0.f69873E0)).setText("去聊聊");
        simplePushBubbleM22168s.m126745x(CorePopLevel.IMMERSION_SEND_MSG);
        llb0.m154703c().m154710i(simplePushBubbleM22168s);
    }

    /* JADX INFO: renamed from: x5 */
    public static /* synthetic */ void m60405x5() {
        m59467Fj();
        o1j0.m165651y("称赞Mock数据已删除");
    }

    /* JADX INFO: renamed from: x7 */
    public static /* synthetic */ void m60407x7() {
        CoreModule.f18264c.f20381e0.f89351w1.put(0L);
        CoreModule.f18264c.f20381e0.f89358x1.put(0L);
        CoreModule.f18264c.f20384f0.m33974gn();
    }

    /* JADX INFO: renamed from: x8 */
    public static /* synthetic */ void m60408x8(Throwable th) {
    }

    /* JADX INFO: renamed from: x9 */
    public static /* synthetic */ void m60409x9() {
        jxd0 jxd0Var = pza0.f154743K;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: xa */
    public static /* synthetic */ void m60410xa() {
        String str = BifrostLayout.f24062c;
        ConnectivityReceiver.m82469i();
    }

    /* JADX INFO: renamed from: xb */
    public static /* synthetic */ void m60411xb() {
        jxd0 jxd0Var = pza0.f154798y;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
        pza0.f154797x.put(Boolean.valueOf(!pza0.f154798y.get().booleanValue()));
    }

    /* JADX INFO: renamed from: xc */
    public static /* synthetic */ void m60412xc() {
        jxd0 jxd0Var = pza0.f154763c;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: xe */
    public static /* synthetic */ void m60414xe() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89244h6;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: xf */
    public static /* synthetic */ void m60415xf() {
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = CoreModule.f18264c.f20405m0.f20136a0.m222761e();
        if (partialListOptM222761e == null || jyb.m147479J(partialListOptM222761e.loaded)) {
            return;
        }
        for (CoreSuggested.UserInfo userInfo : partialListOptM222761e.loaded) {
            if (userInfo.ussTags == null) {
                userInfo.ussTags = UssTags.new_();
            }
            userInfo.ussTags.cardStyle = "likeSupport";
        }
        CoreModule.f18264c.f20405m0.f20136a0.m137019l(partialListOptM222761e);
    }

    /* JADX INFO: renamed from: xg */
    public static /* synthetic */ void m60416xg() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89151W0;
        Boolean bool = Boolean.FALSE;
        jxd0Var.put(bool);
        CoreModule.f18264c.f20405m0.f20202w0.put(bool);
    }

    /* JADX INFO: renamed from: xh */
    public static /* synthetic */ void m60417xh(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        final jxd0 jxd0Var = new jxd0("enable_delete_local_conversation", Boolean.FALSE);
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().dialog().m21534e0(jyb.m147507f0("长按删除本地Conversation: " + jxd0Var.get(), "Conversation Counter Verify")).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.xsc
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                DebugUtil.m59434E8(jxd0Var, dialog, view, i, charSequence);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: xi */
    public static /* synthetic */ void m60418xi() {
        C4887e c4887e = CoreModule.f18264c.f20387g0;
        jxd0 jxd0Var = C4887e.f20508D0;
        C4887e c4887e2 = CoreModule.f18264c.f20387g0;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: xj */
    public static ArrayList<pf60<String, x20>> m60419xj(final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, final b240 b240Var) {
        final ArrayList<pf60<String, x20>> arrayList = new ArrayList<>();
        m60002ej(arrayList);
        m60046gj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        arrayList.add(jyb.m147494Y("聊天论数外显 推荐会话 ", new x20() { // from class: l.v9c
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m33871Ye().take(1).map(new DebugUtil.C9245g0()).observeOn(Schedulers.m222739io()).map(new DebugUtil.C9220a()).subscribe(psd0.m173597H(new DebugUtil.C9286r0(), new DebugUtil.C9226b1()));
            }
        }));
        arrayList.add(jyb.m147494Y("婚恋 弹框: ", new x20() { // from class: l.dbc
            @Override // p153l.x20
            public final void call() {
                l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), new DebugUtil.RunnableC9270m1(), 1000L);
            }
        }));
        arrayList.add(jyb.m147494Y("首页改版兼容 强制开关： " + CoreModule.f18264c.f20381e0.f89349v6.get(), new x20() { // from class: l.wfc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59867Ye();
            }
        }));
        arrayList.add(jyb.m147494Y("关闭检测的Taost: " + o1j0.f144660a.get(), new x20() { // from class: l.xic
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60350ug();
            }
        }));
        arrayList.add(jyb.m147494Y("卡片只看认证 强制显示  :" + CoreModule.f18264c.f20405m0.f20102N1.get(), new x20() { // from class: l.kjc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59474G4();
            }
        }));
        arrayList.add(jyb.m147494Y("更多场景引导资料 卡片 引导 : " + CoreModule.f18264c.f20381e0.f89300o6.get(), new x20() { // from class: l.wjc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59723Rh();
            }
        }));
        arrayList.add(jyb.m147494Y("更多场景引导资料 卡片 清理本地数据 : ", new x20() { // from class: l.ikc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59960d();
            }
        }));
        arrayList.add(jyb.m147494Y("更多场景引导资料 卡片 当前数据 : 可以留言数：" + m60089ij() + " 当天显示次数：" + yvk.m217532m() + " 当前划卡数：" + CoreModule.f18264c.f20364Y0.f161161c.get() + " 上次在次划卡显示：" + yvk.m217530k(), new x20() { // from class: l.ukc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60293s3();
            }
        }));
        arrayList.add(jyb.m147494Y("更多场景引导资料 卡片 当前数据 : 健身显示没有点击次数：" + yvk.m217522c() + " 喝酒显示没有点击次数：" + yvk.m217521b() + " 吸烟显示没有点击次数：" + yvk.m217531l() + " 游戏显示没有点击次数：" + yvk.m217524e(), new x20() { // from class: l.glc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60184n4();
            }
        }));
        arrayList.add(jyb.m147494Y("只看认证全量- 点击 认证弹框", new x20() { // from class: l.tlc
            @Override // p153l.x20
            public final void call() {
                quq.m178184T(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            }
        }));
        arrayList.add(jyb.m147494Y("只看认证全量- 划卡 认证弹框", new x20() { // from class: l.mbc
            @Override // p153l.x20
            public final void call() {
                quq.m178187W(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            }
        }));
        arrayList.add(jyb.m147494Y("只看认证全量- 划卡 tips", new x20() { // from class: l.egc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60429y7(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("首页优化改版- 调用直播引流接口", new x20() { // from class: l.wkc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20405m0.m32122k6().subscribe(psd0.m173597H(new DebugUtil.C9305x1(), new y20() { // from class: l.pwc
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m60408x8((Throwable) obj);
                    }
                }));
            }
        }));
        arrayList.add(jyb.m147494Y("首页优化改版-show 筛选 tips", new x20() { // from class: l.opc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60095j3(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("首页优化改版-show 快速右滑 弹框", new x20() { // from class: l.guc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59863Ya(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("首页优化改版-实验强制打开" + CoreModule.f18264c.f20381e0.f89002B4.get(), new x20() { // from class: l.yyc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59707R1();
            }
        }));
        arrayList.add(jyb.m147494Y("首页优化改版-显示房主标签" + CoreModule.f18264c.f20381e0.f88995A4.get(), new x20() { // from class: l.q3d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59396Ce();
            }
        }));
        arrayList.add(jyb.m147494Y("首页优化改版-显示直播标签" + CoreModule.f18264c.f20381e0.f89375z4.get(), new x20() { // from class: l.i8d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59383C1();
            }
        }));
        arrayList.add(jyb.m147494Y("首页优化改版-超级喜欢显示" + CoreModule.f18264c.f20381e0.f89361x4.get(), new x20() { // from class: l.add
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60055h6();
            }
        }));
        arrayList.add(jyb.m147494Y("首页优化改版-超级喜数显示数量" + CoreModule.f18264c.f20381e0.f89368y4.get(), new x20() { // from class: l.cbc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59873Z();
            }
        }));
        arrayList.add(jyb.m147494Y("首页优化改版-超级喜数显示数量111", new x20() { // from class: l.pbc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20381e0.f89368y4.put(1);
            }
        }));
        arrayList.add(jyb.m147494Y("生日选择", new x20() { // from class: l.bcc
            @Override // p153l.x20
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC8017b.act().startActivity(new Intent(b240Var.m101951T4(), (Class<?>) BirthdayVerifyAct.class));
            }
        }));
        arrayList.add(jyb.m147494Y("isFilterDistanceExpDebug_manualSetUpDistance:" + CoreModule.f18264c.f20381e0.f89334t5.get(), new x20() { // from class: l.ncc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59665P1();
            }
        }));
        arrayList.add(jyb.m147494Y("测试路由1 tantan://realpicVerify", new x20() { // from class: l.zcc
            @Override // p153l.x20
            public final void call() {
                xwa.m213304D(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), Uri.parse("tantanapp://realpicVerify"));
            }
        }));
        arrayList.add(jyb.m147494Y("插入认证卡", new x20() { // from class: l.ldc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59363B3();
            }
        }));
        arrayList.add(jyb.m147494Y("测试路由2 tantan://profileEdit", new x20() { // from class: l.xdc
            @Override // p153l.x20
            public final void call() {
                xwa.m213304D(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), Uri.parse("tantanapp://profileEdit"));
            }
        }));
        arrayList.add(jyb.m147494Y("婚恋消息优化:插入一条婚恋汇总会话", new x20() { // from class: l.jec
            @Override // p153l.x20
            public final void call() {
                l51.m152919y(new DebugUtil.RunnableC9308y1());
            }
        }));
        arrayList.add(jyb.m147494Y("婚恋消息优化:删除全部汇总会话", new x20() { // from class: l.vec
            @Override // p153l.x20
            public final void call() {
                l51.m152919y(new DebugUtil.RunnableC9235d2());
            }
        }));
        arrayList.add(jyb.m147494Y("启动优化标签时间:" + CoreModule.f18264c.f20381e0.f89147V4.get(), new x20() { // from class: l.jfc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60400x0();
            }
        }));
        arrayList.add(jyb.m147494Y("打开微信小程序界面", new x20() { // from class: l.vfc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59537J1(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("showCoinGuideDialog", new C9275n2(b240Var)));
        arrayList.add(jyb.m147494Y("显示女性会员弹窗", new x20() { // from class: l.igc
            @Override // p153l.x20
            public final void call() {
                new vfi().m201152I(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            }
        }));
        arrayList.add(jyb.m147494Y("缘分雷达 清理气泡标记", new x20() { // from class: l.ugc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20425s2.f110501R.put(Boolean.FALSE);
            }
        }));
        arrayList.add(jyb.m147494Y("资料页改版 清理标签", new x20() { // from class: l.ghc
            @Override // p153l.x20
            public final void call() {
                gj40.m130415o().m130438h();
            }
        }));
        arrayList.add(jyb.m147494Y("资料页改版 强制切换到改版" + CoreModule.f18264c.f20405m0.f20078F1.get(), new x20() { // from class: l.shc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60316t4();
            }
        }));
        arrayList.add(jyb.m147494Y("ttt国际化资料页改版 强制切换到改版" + CoreModule.f18264c.f20405m0.f20081G1.get(), new x20() { // from class: l.eic
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59547Jb();
            }
        }));
        arrayList.add(jyb.m147494Y("ttt国际化首页划卡改版 首页划卡切换到改版" + CoreModule.f18264c.f20405m0.f20084H1.get(), new x20() { // from class: l.qic
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60081ia();
            }
        }));
        arrayList.add(jyb.m147494Y("资料页改版 强制切换到改版旧版本" + CoreModule.f18264c.f20405m0.f20087I1.get(), new x20() { // from class: l.tic
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59877Z3();
            }
        }));
        arrayList.add(jyb.m147494Y("资料页改版 一键配对:" + CoreModule.f18264c.f20381e0.f89203c5.get(), new x20() { // from class: l.uic
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59521I7();
            }
        }));
        arrayList.add(jyb.m147494Y("ideal type force enable:" + CoreModule.f18264c.f20405m0.f20090J1.get(), new x20() { // from class: l.vic
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59621N();
            }
        }));
        arrayList.add(jyb.m147494Y("资料正反馈 弹框0", new x20() { // from class: l.wic
            @Override // p153l.x20
            public final void call() {
                new sxa0(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "").m188474K(1, new DebugUtil.C9264l());
            }
        }));
        arrayList.add(jyb.m147494Y("资料正反馈 弹框1", new x20() { // from class: l.yic
            @Override // p153l.x20
            public final void call() {
                new sxa0(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "").m188474K(2, new DebugUtil.C9272n());
            }
        }));
        arrayList.add(jyb.m147494Y("资料正反馈 弹框2", new x20() { // from class: l.zic
            @Override // p153l.x20
            public final void call() {
                new sxa0(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "").m188474K(3, new DebugUtil.C9276o());
            }
        }));
        arrayList.add(jyb.m147494Y("资料正反馈 弹框3", new x20() { // from class: l.ajc
            @Override // p153l.x20
            public final void call() {
                new sxa0(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "").m188474K(4, new DebugUtil.C9279p());
            }
        }));
        arrayList.add(jyb.m147494Y("资料正反馈 弹框4", new x20() { // from class: l.bjc
            @Override // p153l.x20
            public final void call() {
                new sxa0(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "").m188474K(5, new DebugUtil.C9282q());
            }
        }));
        arrayList.add(jyb.m147494Y("资料正反馈 清理广告卡标记", new x20() { // from class: l.cjc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59800Va();
            }
        }));
        arrayList.add(jyb.m147494Y("资料正反馈 插卡广告", new x20() { // from class: l.fjc
            @Override // p153l.x20
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC8017b.act().postDelayed(new Runnable() { // from class: l.zoc
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m59688Q3();
                    }
                }, 500L);
            }
        }));
        arrayList.add(jyb.m147494Y("盲盒二期_弹框动画", new x20() { // from class: l.gjc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59479G9(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("盲盒二期_即使聊天", new x20() { // from class: l.hjc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60021fg(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("盲盒二期_插入惊喜礼盒会话", new x20() { // from class: l.ijc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m34040lq(pzi0.m174454o());
            }
        }));
        arrayList.add(jyb.m147494Y("盲盒二期_删除惊喜礼盒会话", new x20() { // from class: l.jjc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m33579Af();
            }
        }));
        arrayList.add(jyb.m147494Y("盲盒二期_插入礼盒结束时间 2天", new x20() { // from class: l.ljc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20401k2.f118666Y.put(Long.valueOf(pzi0.m174454o() + 172800000));
            }
        }));
        arrayList.add(jyb.m147494Y("盲盒二期_插入礼盒结束时间 1分", new x20() { // from class: l.mjc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20401k2.f118666Y.put(Long.valueOf(pzi0.m174454o() + com.clevertap.android.sdk.Constants.ONE_MIN_IN_MILLIS));
            }
        }));
        arrayList.add(jyb.m147494Y("盲盒二期_清理礼盒结束时间", new x20() { // from class: l.njc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20401k2.f118666Y.clear();
            }
        }));
        arrayList.add(jyb.m147494Y("盲盒二期_调用接口获取奖励弹框", new x20() { // from class: l.ojc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60325td(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("盲盒_bubble", new x20() { // from class: l.qjc
            @Override // p153l.x20
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC8017b.act().m40810d6().m40967B0();
            }
        }));
        arrayList.add(jyb.m147494Y("盲盒_liked_user", new x20() { // from class: l.rjc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60054h5(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("盲盒_normal_user", new x20() { // from class: l.sjc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60461zh(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("盲盒_Boost", new x20() { // from class: l.tjc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59753T5(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("盲盒_Exposure", new x20() { // from class: l.ujc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60436ye(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("盲盒", new x20() { // from class: l.vjc
            @Override // p153l.x20
            public final void call() {
                new gch0(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).show();
            }
        }));
        arrayList.add(jyb.m147494Y("微信引导弹窗", new x20() { // from class: l.xjc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60268r0(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("CITY_TOP_GREETING", new x20() { // from class: l.yjc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60005f0(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("12M优惠券", new x20() { // from class: l.zjc
            @Override // p153l.x20
            public final void call() {
                efh0.m120692j().m120693f(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            }
        }));
        arrayList.add(jyb.m147494Y("划卡聊天室开关 = " + CoreModule.f18264c.f20405m0.f20200v1.get(), new x20() { // from class: l.bkc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60267r();
            }
        }));
        arrayList.add(jyb.m147494Y("黑钻测试", new x20() { // from class: l.ckc
            @Override // p153l.x20
            public final void call() {
                C8619b.m48816l(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "", null);
            }
        }));
        arrayList.add(jyb.m147494Y("鉴权", new x20() { // from class: l.dkc
            @Override // p153l.x20
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC8017b.act().duringCreated((C22421c) CoreModule.f18264c.f20336P0.m114714e3(c7d0.m108301j0() ? "1000002" : "1000003", "code", "user_mobile,user_profile", "", "").map(new qcj() { // from class: l.xnc
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return DebugUtil.m60381w3((OpenSdkCodeAuth) obj);
                    }
                })).subscribe(psd0.m173597H(new nro(), new y20() { // from class: l.ync
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        r1j0.m179420g("网络请求异常");
                    }
                }));
            }
        }));
        arrayList.add(jyb.m147494Y("打开美团 h5", new x20() { // from class: l.ekc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                w1e.m204400d(viewTreeObserverOnGlobalLayoutListenerC8017b2.act()).m204424I("美团h5").m204423H(DebugUtil.f39099a.get()).m204421F(new y20() { // from class: l.muc
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m60254q8(viewTreeObserverOnGlobalLayoutListenerC8017b2, (String) obj);
                    }
                }).m204426n().show();
            }
        }));
        arrayList.add(jyb.m147494Y("真实头像认证弹窗", new x20() { // from class: l.fkc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59925b8(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("真人实名认证弹窗", new x20() { // from class: l.gkc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59414Da(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("真人活体认证弹窗-》国际化", new x20() { // from class: l.hkc
            @Override // p153l.x20
            public final void call() {
                bep.INSTANCE.m103752q(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "need_person_verify");
            }
        }));
        arrayList.add(jyb.m147494Y("头像审核中弹窗", new x20() { // from class: l.jkc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().startActivity(VerificationAct.m60648n2(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), 3, ""));
            }
        }));
        arrayList.add(jyb.m147494Y("实名审核中弹窗", new x20() { // from class: l.kkc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().startActivity(VerificationAct.m60648n2(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), 4, ""));
            }
        }));
        arrayList.add(jyb.m147494Y("取消实名认证", new x20() { // from class: l.mkc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20327M0.m194842d3("fromNameVerificationDlg");
            }
        }));
        arrayList.add(jyb.m147494Y("取消头像认证", new x20() { // from class: l.nkc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20294B0.m32596Q3(CoreModule.m30929H().userId(), "fromPicVerificationDlg");
            }
        }));
        arrayList.add(jyb.m147494Y("引导上传生活照", new x20() { // from class: l.okc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59480Ga(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("MK Bridge测试", new x20() { // from class: l.pkc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().startActivity(MkWebViewAct.m81420c2(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), "", "https://m.staging2.p1staff.com/fep/tantan/frontend/tantan-js-bridge/index.html?_bid=1002620#/", true));
            }
        }));
        arrayList.add(jyb.m147494Y("测试跳转MkWebview页面", new x20() { // from class: l.qkc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                w1e.m204400d(viewTreeObserverOnGlobalLayoutListenerC8017b2.act()).m204424I("跳转MkWebview页面").m204420E(1).m204419D(300).m204421F(new y20() { // from class: l.nxc
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b3 = viewTreeObserverOnGlobalLayoutListenerC8017b2;
                        viewTreeObserverOnGlobalLayoutListenerC8017b3.act().startActivity(MkWebViewAct.m81424h2(viewTreeObserverOnGlobalLayoutListenerC8017b3.act(), true, "", (String) obj));
                    }
                }).m204426n().show();
            }
        }));
        arrayList.add(jyb.m147494Y("跳转主题答题页面", new x20() { // from class: l.rkc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().startActivity(xwa.m213301A(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), null, "https://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-static-pages-fep/src/apps/material-access/index.html?speed=true&_bid=1002757&type=theme#/questionnaire", true, false, true));
            }
        }));
        arrayList.add(jyb.m147494Y("添加小组件", new x20() { // from class: l.skc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59648O5();
            }
        }));
        arrayList.add(jyb.m147494Y("照片上传引导关闭 = " + pza0.f154786n0.get(), new x20() { // from class: l.tkc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60048h();
            }
        }));
        arrayList.add(jyb.m147494Y(" 重置动态打招呼接收消息状态引导气泡", new x20() { // from class: l.vkc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20420r0.f20753R.put(Boolean.FALSE);
            }
        }));
        arrayList.add(jyb.m147494Y("进入动态打招呼列表", new x20() { // from class: l.xkc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().startActivity(DynamicGreetListAct.m37457X1(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), null));
            }
        }));
        arrayList.add(jyb.m147494Y("右滑引导", new x20() { // from class: l.ykc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59526Ic(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("左滑引导", new x20() { // from class: l.zkc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59400Ci(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("禁止切卡功能：" + pza0.f154769f.get(), new x20() { // from class: l.alc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59776U7();
            }
        }));
        arrayList.add(jyb.m147494Y("FragInitializeStep", new x20() { // from class: l.blc
            @Override // p153l.x20
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC8017b.act().dialog().m21534e0(jyb.m147507f0("Create", "Start", "Resume")).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.xlc
                    @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
                    /* JADX INFO: renamed from: a */
                    public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                        DebugUtil.m59941c2(dialog, view, i, charSequence);
                    }
                }).m21567z0();
            }
        }));
        arrayList.add(jyb.m147494Y("设置聊天引导等候时间", new x20() { // from class: l.clc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59837X5(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("卡片清晰度优化", new x20() { // from class: l.dlc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59876Z2(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("站内Push", new x20() { // from class: l.elc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59448F0(b240Var, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("新配对动效Debug开关：" + z7x.f203279b.get(), new x20() { // from class: l.flc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59752T4();
            }
        }));
        arrayList.add(jyb.m147494Y("插入广告卡片 position 3", new x20() { // from class: l.ilc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59343A5();
            }
        }));
        arrayList.add(jyb.m147494Y("插入广告卡片 position 1", new x20() { // from class: l.jlc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59706R0();
            }
        }));
        arrayList.add(jyb.m147494Y("插入广告卡片 position 0", new x20() { // from class: l.klc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60258qc();
            }
        }));
        arrayList.add(jyb.m147494Y("插入广告卡片书影剧httpdata position 0", new x20() { // from class: l.llc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60201o();
            }
        }));
        arrayList.add(jyb.m147494Y("插入 boost position 3", new x20() { // from class: l.mlc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59653Oa();
            }
        }));
        arrayList.add(jyb.m147494Y("插入书影剧三期运营卡片 position 0", new x20() { // from class: l.nlc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60056h7();
            }
        }));
        arrayList.add(jyb.m147494Y("消息推送权限弹窗", new x20() { // from class: l.olc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                b240 b240Var2 = b240Var;
                iz40.m142761F(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), new x20() { // from class: l.voc
                    @Override // p153l.x20
                    public final void call() {
                        b240Var2.m101976Y4();
                    }
                }, new x20() { // from class: l.woc
                    @Override // p153l.x20
                    public final void call() {
                        DebugUtil.m60369vd(b240Var2);
                    }
                });
            }
        }));
        arrayList.add(jyb.m147494Y("Mock配对页", new x20() { // from class: l.plc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59883Z9(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("切换白色主题", new x20() { // from class: l.qlc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60011f6();
            }
        }));
        arrayList.add(0, jyb.m147494Y("DIALOGS AT HOME ", new x20() { // from class: l.rlc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60085ie(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("展示顶部弹窗", new x20() { // from class: l.xec
            @Override // p153l.x20
            public final void call() {
                pci.m171661J(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), CoreModule.f18264c.f20381e0.m116600p9());
            }
        }));
        arrayList.add(jyb.m147494Y("show radar", new x20() { // from class: l.ejc
            @Override // p153l.x20
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC8017b.m38187L5(true, false);
            }
        }));
        arrayList.add(jyb.m147494Y("show radar", new x20() { // from class: l.lnc
            @Override // p153l.x20
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC8017b.m38187L5(true, false);
            }
        }));
        arrayList.add(jyb.m147494Y("show toast top!!!!!", new x20() { // from class: l.src
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                o1j0.m165626H(viewTreeObserverOnGlobalLayoutListenerC8017b2.act().getResources().getString(R$string.f19688tp), viewTreeObserverOnGlobalLayoutListenerC8017b2.act().getResources().getDrawable(dbc0.f87360qq), viewTreeObserverOnGlobalLayoutListenerC8017b2.act().getResources().getDrawable(dbc0.f87131js));
            }
        }));
        arrayList.add(jyb.m147494Y("knowme", new x20() { // from class: l.zvc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().startActivity(BusinessWebViewAct.m44718Y1(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), "aaa", 1L, "http://m-test.kanjianxinli.com/ceping/index.html#/?channelId=281", "webview_load_type_knowme"));
            }
        }));
        if (viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2().mo39812d() != null && viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2().mo39816j() != null) {
            final String str = viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2().mo39816j().f20214id;
            arrayList.add(jyb.m147494Y("make first user superlike me", new x20() { // from class: l.g0d
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.m60232p8(str, viewTreeObserverOnGlobalLayoutListenerC8017b);
                }
            }));
            arrayList.add(jyb.m147494Y("make first user like me", new x20() { // from class: l.n4d
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.m59797V7(str);
                }
            }));
            arrayList.add(jyb.m147494Y("make first user invite me", new x20() { // from class: l.u8d
                @Override // p153l.x20
                public final void call() {
                    CoreModule.f18264c.f20294B0.m32601V3(CoreModule.m30929H().userId(), str);
                }
            }));
            arrayList.add(jyb.m147494Y("重置优惠卷重构 svip大页面", new x20() { // from class: l.bdd
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.m59913ai();
                }
            }));
            arrayList.add(jyb.m147494Y("匿名打招呼", new x20() { // from class: l.bbc
                @Override // p153l.x20
                public final void call() {
                    CoreModule.m30930K().mo31819s0(b240Var.m101951T4(), str);
                }
            }));
            arrayList.add(jyb.m147494Y("[男用户未消耗like限时出现]", new x20() { // from class: l.xbc
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.m60360v4(str);
                }
            }));
            arrayList.add(jyb.m147494Y("[打开关闭男用户的like开关：]" + CoreModule.f18264c.f20384f0.f20677f1.get(), new x20() { // from class: l.icc
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.m60166m8();
                }
            }));
            arrayList.add(jyb.m147494Y("make users like me", new x20() { // from class: l.tcc
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.m59529If();
                }
            }));
            arrayList.add(jyb.m147494Y("make first user diamond received like me", new x20() { // from class: l.edc
                @Override // p153l.x20
                public final void call() {
                    DebugUtil.m59645O2(str);
                }
            }));
            arrayList.add(jyb.m147494Y("make first user like me delay 5s", new x20() { // from class: l.pdc
                @Override // p153l.x20
                public final void call() {
                    l51.m152889I(viewTreeObserverOnGlobalLayoutListenerC8017b.m38344q2(), new Runnable() { // from class: l.euc
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4910y.m35903h3(str).materialize().subscribe();
                        }
                    }, com.clevertap.android.sdk.Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
                }
            }));
            arrayList.add(jyb.m147494Y("show user id", new x20() { // from class: l.aec
                @Override // p153l.x20
                public final void call() {
                    viewTreeObserverOnGlobalLayoutListenerC8017b.act().dialog().m21506G0("user id").m21503F(CoreModule.m30929H().userId()).m21566z().show();
                }
            }));
            arrayList.add(jyb.m147494Y("boost guide", new x20() { // from class: l.lec
                @Override // p153l.x20
                public final void call() {
                    viewTreeObserverOnGlobalLayoutListenerC8017b.act().dialog().m21506G0("boost_peak_guide_switch").m21503F(d79.f85481n).m21566z().show();
                }
            }));
            arrayList.add(jyb.m147494Y("match user with inputed id", new x20() { // from class: l.wec
                @Override // p153l.x20
                public final void call() {
                    w1e.m204400d(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m204419D(10).m204430r("input the user id you like").m204421F(new y20() { // from class: l.ryc
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            C4910y.m35905j3((String) obj).subscribe();
                        }
                    }).m204426n().show();
                }
            }));
        }
        arrayList.add(jyb.m147494Y("show alert toast in 5 secs", new x20() { // from class: l.ifc
            @Override // p153l.x20
            public final void call() {
                l51.m152889I(viewTreeObserverOnGlobalLayoutListenerC8017b.m38344q2(), new Runnable() { // from class: l.amc
                    @Override // java.lang.Runnable
                    public final void run() {
                        o1j0.m165636j("test");
                    }
                }, com.clevertap.android.sdk.Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
            }
        }));
        arrayList.add(jyb.m147494Y("show alert toast in 5 secs (background)", new x20() { // from class: l.tfc
            @Override // p153l.x20
            public final void call() {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: l.qpc
                    @Override // java.lang.Runnable
                    public final void run() {
                        o1j0.m165636j("test background");
                    }
                }, com.clevertap.android.sdk.Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
            }
        }));
        arrayList.add(jyb.m147494Y("clear init file cache", new x20() { // from class: l.pgc
            @Override // p153l.x20
            public final void call() {
                dji.m116096d();
            }
        }));
        arrayList.add(jyb.m147494Y("toggle debug server unavailable", new x20() { // from class: l.ahc
            @Override // p153l.x20
            public final void call() {
                Network.debug_fakeServerUnavailable = !Network.debug_fakeServerUnavailable;
            }
        }));
        arrayList.add(jyb.m147494Y("delete crushes", new x20() { // from class: l.lhc
            @Override // p153l.x20
            public final void call() {
                eq7.m121900c3().subscribe();
            }
        }));
        arrayList.add(jyb.m147494Y("Open Instagram like  Media picker", new x20() { // from class: l.whc
            @Override // p153l.x20
            public final void call() {
                CoreModule.m30932N().startInstaLikePickerAct(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            }
        }));
        arrayList.add(jyb.m147494Y("认证相关DebugItem", new x20() { // from class: l.hic
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59769U0(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("插入聊天消息", new x20() { // from class: l.sic
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60033g6(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("首页切换动画DebugItem", new x20() { // from class: l.djc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59718Rc(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("划卡速DebugItem", new x20() { // from class: l.pjc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60100j8(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("真人认证：模拟bad token = " + y5l0.f197570a, new x20() { // from class: l.akc
            @Override // p153l.x20
            public final void call() {
                y5l0.m214313g();
            }
        }));
        arrayList.add(jyb.m147494Y("插入广告卡 ", new x20() { // from class: l.lkc
            @Override // p153l.x20
            public final void call() {
                u2n.m194286m();
            }
        }));
        arrayList.add(jyb.m147494Y("开启 Ad ", new x20() { // from class: l.hlc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60073i2();
            }
        }));
        arrayList.add(jyb.m147494Y("ad： 1:1 ", new x20() { // from class: l.slc
            @Override // p153l.x20
            public final void call() {
                u2n.f177227b = 1.0f;
            }
        }));
        arrayList.add(jyb.m147494Y("ad：16:9 ", new x20() { // from class: l.dmc
            @Override // p153l.x20
            public final void call() {
                u2n.f177227b = 1.7777778f;
            }
        }));
        arrayList.add(jyb.m147494Y("ad:9:16 ", new x20() { // from class: l.omc
            @Override // p153l.x20
            public final void call() {
                u2n.f177227b = 0.5625f;
            }
        }));
        arrayList.add(jyb.m147494Y("ad:4:3 ", new x20() { // from class: l.zmc
            @Override // p153l.x20
            public final void call() {
                u2n.f177227b = 1.3333334f;
            }
        }));
        arrayList.add(jyb.m147494Y("ad:3:4", new x20() { // from class: l.knc
            @Override // p153l.x20
            public final void call() {
                u2n.f177227b = 0.75f;
            }
        }));
        arrayList.add(jyb.m147494Y("ad:1.91:1 ", new x20() { // from class: l.wnc
            @Override // p153l.x20
            public final void call() {
                u2n.f177227b = 1.91f;
            }
        }));
        arrayList.add(jyb.m147494Y("国际化特权周期", new x20() { // from class: l.hoc
            @Override // p153l.x20
            public final void call() {
                w1e.m204400d(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m204424I("特权时长day").m204420E(1).m204419D(80).m204430r("day").m204421F(new y20() { // from class: l.oyc
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        C8921a.INSTANCE.m54386b(Integer.valueOf((String) obj).intValue());
                    }
                }).m204426n().show();
            }
        }));
        arrayList.add(jyb.m147494Y("国际化特权到期时间", new x20() { // from class: l.soc
            @Override // p153l.x20
            public final void call() {
                w1e.m204400d(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m204424I("设置到期时间毫秒").m204430r("毫秒").m204420E(1).m204419D(80).m204430r(qv5.f159697a.get()).m204423H(qv5.f159697a.get()).m204421F(new y20() { // from class: l.iyc
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        C8921a.INSTANCE.m54385a(Long.valueOf((String) obj).longValue());
                    }
                }).m204426n().show();
            }
        }));
        StringBuilder sb = new StringBuilder("主播清晰度优化： ");
        CoreSuggested coreSuggested = CoreModule.f18264c.f20405m0;
        sb.append(coreSuggested.f20138a2.containsKey(coreSuggested.m32140q6()));
        arrayList.add(jyb.m147494Y(sb.toString(), new x20() { // from class: l.dpc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59644O1();
            }
        }));
        arrayList.add(jyb.m147494Y("设置turbo guide 位置3", new x20() { // from class: l.zpc
            @Override // p153l.x20
            public final void call() {
                v83.m200285e();
            }
        }));
        arrayList.add(jyb.m147494Y("设置superlike guide 位置6", new x20() { // from class: l.kqc
            @Override // p153l.x20
            public final void call() {
                z5h0.m218667N();
            }
        }));
        arrayList.add(jyb.m147494Y("特殊喜欢dlg", new x20() { // from class: l.vqc
            @Override // p153l.x20
            public final void call() {
                CoreDlg.m46240d2(CoreModule.f18264c.f20381e0.m116600p9(), viewTreeObserverOnGlobalLayoutListenerC8017b.act(), null, null);
            }
        }));
        arrayList.add(jyb.m147494Y("男性用户插卡新样式", new x20() { // from class: l.grc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60415xf();
            }
        }));
        arrayList.add(jyb.m147494Y("zb直播状态-连线中", new x20() { // from class: l.rrc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59649O6();
            }
        }));
        arrayList.add(jyb.m147494Y("zb直播状态-会话列表", new x20() { // from class: l.dsc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59384C2(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("收到Push喜欢debugItems", new x20() { // from class: l.osc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59428E2(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("探探认证相关debugItems", new x20() { // from class: l.zsc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60248q2(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("定位相关debugItems", new x20() { // from class: l.ktc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59472G2(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("new user see pop in card", new x20() { // from class: l.vtc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59939c0(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("fake视频闪聊", new x20() { // from class: l.ruc
            @Override // p153l.x20
            public final void call() {
                xzm0.m213760p().m213765h(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "143023", "voiceQuickChat");
            }
        }));
        arrayList.add(jyb.m147494Y("LocalVariable", new x20() { // from class: l.cvc
            @Override // p153l.x20
            public final void call() {
                Objects.toString(pk50.m172568j().m172582o().m118572a("me.avatar").get());
            }
        }));
        arrayList.add(jyb.m147494Y("show fake dlg", new x20() { // from class: l.nvc
            @Override // p153l.x20
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC8017b.act().postDelayed(new Runnable() { // from class: l.uoc
                    @Override // java.lang.Runnable
                    public final void run() {
                        qyf.m178643f().m178647h(CoreModule.f18264c.f20381e0.m116600p9());
                    }
                }, 500L);
            }
        }));
        arrayList.add(jyb.m147494Y("取消认证弹窗", new x20() { // from class: l.yvc
            @Override // p153l.x20
            public final void call() {
                CoreDlg.m46280r1(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            }
        }));
        arrayList.add(jyb.m147494Y("letterSendPanel", new x20() { // from class: l.kwc
            @Override // p153l.x20
            public final void call() {
                zsb.m221313f().m221322m(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), CoreModule.f18264c.f20381e0.m116600p9(), new DebugUtil.C9294u());
            }
        }));
        arrayList.add(jyb.m147494Y("letterSendPanelintl", new x20() { // from class: l.vwc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                b240 b240Var2 = b240Var;
                CoreDlg.m46212U1(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), viewTreeObserverOnGlobalLayoutListenerC8017b2.m38128A2().mo39821o().m140259d(), new y20() { // from class: l.buc
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m59427E1(b240Var2, viewTreeObserverOnGlobalLayoutListenerC8017b2, (String) obj);
                    }
                }, new x20() { // from class: l.cuc
                    @Override // p153l.x20
                    public final void call() {
                        b240Var2.m102027i9(true);
                    }
                });
            }
        }));
        arrayList.add(jyb.m147494Y("fake更换性别", new x20() { // from class: l.gxc
            @Override // p153l.x20
            public final void call() {
                a0g.m95364T(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), new Runnable() { // from class: l.xoc
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m60395wh();
                    }
                });
            }
        }));
        arrayList.add(jyb.m147494Y("show one id", new x20() { // from class: l.rxc
            @Override // p153l.x20
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC8017b.act().dialog().m21506G0("one id").m21503F(yp50.m217001d()).m21566z().show();
            }
        }));
        arrayList.add(jyb.m147494Y("go to appeal loading", new x20() { // from class: l.cyc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().startActivity(AppealProgressAct.m37174Z1(viewTreeObserverOnGlobalLayoutListenerC8017b2.act()));
            }
        }));
        arrayList.add(jyb.m147494Y("语音闪聊loading", new x20() { // from class: l.nyc
            @Override // p153l.x20
            public final void call() {
                CoreModule.m30930K().mo31765em(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "", "");
            }
        }));
        arrayList.add(jyb.m147494Y("isCardSwipeGuideEnable:" + pza0.f154791r.get(), new x20() { // from class: l.jzc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59505Hd();
            }
        }));
        arrayList.add(jyb.m147494Y("红包动画延长10x:" + C4909x.f20878R.get(), new x20() { // from class: l.uzc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60335u1();
            }
        }));
        arrayList.add(jyb.m147494Y("红包动画一直展示:" + C4909x.f20879S.get(), new x20() { // from class: l.f0d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59710R4();
            }
        }));
        arrayList.add(jyb.m147494Y("isCardSwipe,reset all guide", new x20() { // from class: l.r0d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60252q6();
            }
        }));
        arrayList.add(jyb.m147494Y("isProrileVerExp1:" + pza0.f154797x.get(), new x20() { // from class: l.c1d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60336u2();
            }
        }));
        arrayList.add(jyb.m147494Y("isProrileVerExp2:" + pza0.f154798y.get(), new x20() { // from class: l.n1d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60411xb();
            }
        }));
        arrayList.add(jyb.m147494Y("isProrileVer clean:" + pza0.f154798y.get(), new x20() { // from class: l.y1d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60179n();
            }
        }));
        arrayList.add(jyb.m147494Y("延长profile切tab时间:5秒", new x20() { // from class: l.j2d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60129kf();
            }
        }));
        arrayList.add(jyb.m147494Y("延长profile切tab时间:10秒", new x20() { // from class: l.u2d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59859Y6();
            }
        }));
        arrayList.add(jyb.m147494Y("延长profile切tab时间:默认", new x20() { // from class: l.f3d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59502Ha();
            }
        }));
        arrayList.add(jyb.m147494Y("清除划卡按钮提示", new x20() { // from class: l.b4d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60450z6();
            }
        }));
        arrayList.add(jyb.m147494Y("显示所有认证图标-profile:" + pza0.f154787o.get(), new x20() { // from class: l.m4d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59971da();
            }
        }));
        arrayList.add(jyb.m147494Y("动态基建：实验 = " + pza0.f154756X.get(), new x20() { // from class: l.y4d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59898a3();
            }
        }));
        arrayList.add(jyb.m147494Y("禁言申诉实验：强制弹滑块 = " + pza0.f154748P.get(), new x20() { // from class: l.j5d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60141l5();
            }
        }));
        arrayList.add(jyb.m147494Y("禁言申诉实验：强制数美1 = " + pza0.f154749Q.get(), new x20() { // from class: l.u5d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59814W3();
            }
        }));
        arrayList.add(jyb.m147494Y("动态外露：profile展示脱单中 = " + pza0.f154754V.get(), new x20() { // from class: l.f6d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59756T8();
            }
        }));
        arrayList.add(jyb.m147494Y("动态外露：profile展示superlike = " + pza0.f154753U.get(), new x20() { // from class: l.q6d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59701Qg();
            }
        }));
        arrayList.add(jyb.m147494Y("动态外露：动态文案过长 = " + pza0.f154755W.get(), new x20() { // from class: l.b7d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59734S7();
            }
        }));
        arrayList.add(jyb.m147494Y("丰富资料：实验入组 = " + pza0.f154746N.get(), new x20() { // from class: l.m7d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60087ih();
            }
        }));
        arrayList.add(jyb.m147494Y("丰富资料：展示红点(特邀嘉宾聊天框) = " + CoreModule.f18264c.f20384f0.f20659Z0.get(), new x20() { // from class: l.x7d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60390wc();
            }
        }));
        arrayList.add(jyb.m147494Y("年龄过大 超过100岁:" + pza0.f154745M.get(), new x20() { // from class: l.t8d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59552Jg();
            }
        }));
        arrayList.add(jyb.m147494Y("破冰实验开关:" + hcm.f108714i.get(), new x20() { // from class: l.f9d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59395Cd();
            }
        }));
        arrayList.add(jyb.m147494Y("破冰实验，弹框一定展示:" + hcm.f108715j.get(), new x20() { // from class: l.q9d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59899a4();
            }
        }));
        arrayList.add(jyb.m147494Y("破冰实验，清除破冰时间", new x20() { // from class: l.bad
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59791V1();
            }
        }));
        arrayList.add(jyb.m147494Y("引导用户开启push实验 = " + pza0.f154742J.get(), new x20() { // from class: l.mad
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60260qe();
            }
        }));
        arrayList.add(jyb.m147494Y("引导用户push的dialog:", new x20() { // from class: l.xad
            @Override // p153l.x20
            public final void call() {
                iz40.m142762G(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), true);
            }
        }));
        arrayList.add(jyb.m147494Y("引导用户push的dialog(多次):", new x20() { // from class: l.ibd
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60382w4(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("引导用户，重置列表header弹出次数：", new x20() { // from class: l.tbd
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59775U6();
            }
        }));
        arrayList.add(jyb.m147494Y("强制开启直播间和语音房功能= " + App.f16100q.get(), new x20() { // from class: l.ecd
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59492H0();
            }
        }));
        arrayList.add(jyb.m147494Y("聊天破冰：新配对 有策略= " + f39100b.get(), new x20() { // from class: l.pcd
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60051h2();
            }
        }));
        arrayList.add(jyb.m147494Y("聊天破冰：新配对 无策略= " + f39101c.get(), new x20() { // from class: l.gac
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60004f();
            }
        }));
        arrayList.add(jyb.m147494Y("聊天破冰：新配对 关闭弹框本地值清空", new x20() { // from class: l.rac
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20381e0.f89350w0.put(Boolean.FALSE);
            }
        }));
        arrayList.add(jyb.m147494Y("聊天破冰：新配对 最大数量限制：5", new x20() { // from class: l.tac
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20381e0.f89357x0.put(5);
            }
        }));
        arrayList.add(jyb.m147494Y("聊天破冰：新配对 最大数量限制：10", new x20() { // from class: l.uac
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20381e0.f89357x0.put(10);
            }
        }));
        arrayList.add(jyb.m147494Y("聊天破冰：新配对 最大数量限制：20", new x20() { // from class: l.vac
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20381e0.f89357x0.put(20);
            }
        }));
        arrayList.add(jyb.m147494Y("聊天破冰：新配对 最大数量限制：100", new x20() { // from class: l.wac
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20381e0.f89357x0.put(100);
            }
        }));
        arrayList.add(jyb.m147494Y("好友上线弹窗", new C9297v(viewTreeObserverOnGlobalLayoutListenerC8017b)));
        arrayList.add(jyb.m147494Y("女性召回", new C9300w(viewTreeObserverOnGlobalLayoutListenerC8017b)));
        arrayList.add(jyb.m147494Y("新卡片切卡：profile昵称过长 = " + pza0.f154743K.get(), new x20() { // from class: l.xac
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60409x9();
            }
        }));
        arrayList.add(jyb.m147494Y("新卡片切卡：profile展示头像审核失败 = " + pza0.f154744L.get(), new x20() { // from class: l.yac
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60246q0();
            }
        }));
        arrayList.add(jyb.m147494Y("新卡片切卡：profile重置蒙层引导 = " + pza0.f154747O.get(), new x20() { // from class: l.zac
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60186n6();
            }
        }));
        arrayList.add(jyb.m147494Y("新卡片切卡：profile抢先表白 = " + pza0.f154760a0.get(), new x20() { // from class: l.abc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59344A6();
            }
        }));
        arrayList.add(jyb.m147494Y("新卡片切卡：profile开启直播 = " + pza0.f154762b0.get(), new x20() { // from class: l.ebc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59790V0();
            }
        }));
        arrayList.add(jyb.m147494Y("新卡片切卡：profile关闭直播 = " + pza0.f154764c0.get(), new x20() { // from class: l.fbc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60020ff();
            }
        }));
        arrayList.add(jyb.m147494Y("新卡片切卡：profile语音直播 = " + pza0.f154766d0.get(), new x20() { // from class: l.gbc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60026g();
            }
        }));
        arrayList.add(jyb.m147494Y("新卡片切卡：profile视频直播 = " + pza0.f154768e0.get(), new x20() { // from class: l.hbc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59504Hc();
            }
        }));
        arrayList.add(jyb.m147494Y("新卡片切卡：profile双直播样式 = " + pza0.f154770f0.get(), new x20() { // from class: l.ibc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59623N1();
            }
        }));
        arrayList.add(jyb.m147494Y("新卡片切卡：profile sueprlike动画 = " + pza0.f154750R.get(), new x20() { // from class: l.jbc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59691Q6();
            }
        }));
        arrayList.add(jyb.m147494Y("新卡片切卡：profile 国际化私信样式 = " + pza0.f154751S.get(), new x20() { // from class: l.kbc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60271r3();
            }
        }));
        arrayList.add(jyb.m147494Y("新卡片切卡：切卡+关于我 = " + pza0.f154734B.get(), new x20() { // from class: l.lbc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59449F1();
            }
        }));
        arrayList.add(jyb.m147494Y("新卡片切卡：控制组 = " + pza0.f154735C.get(), new x20() { // from class: l.nbc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60149ld();
            }
        }));
        arrayList.add(jyb.m147494Y("新卡片切卡：清除入组", new x20() { // from class: l.obc
            @Override // p153l.x20
            public final void call() {
                pza0.f154734B.put(Boolean.FALSE);
            }
        }));
        arrayList.add(jyb.m147494Y("新卡片切卡：显示所有tag:" + pza0.f154736D.get(), new x20() { // from class: l.qbc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59591Lb();
            }
        }));
        arrayList.add(jyb.m147494Y("新卡片切卡：显示首张视频:" + pza0.f154737E.get(), new x20() { // from class: l.rbc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59548Jc();
            }
        }));
        arrayList.add(jyb.m147494Y("新卡片切卡：显示擦肩而过tag:" + pza0.f154738F.get(), new x20() { // from class: l.sbc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59368B8();
            }
        }));
        arrayList.add(jyb.m147494Y("新卡片切卡： 隐藏擦肩而过tag:" + pza0.f154739G.get(), new x20() { // from class: l.tbc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59955cg();
            }
        }));
        arrayList.add(jyb.m147494Y("新卡片切卡：显示profile可点击区域:" + pza0.f154740H.get(), new x20() { // from class: l.ubc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59840X8();
            }
        }));
        arrayList.add(jyb.m147494Y("新卡片切卡：进profile就能显示蒙层:" + pza0.f154741I.get(), new x20() { // from class: l.vbc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59615Me();
            }
        }));
        arrayList.add(jyb.m147494Y("ui优化0:", new x20() { // from class: l.wbc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60326te(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("ui优化1:", new x20() { // from class: l.ybc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60403x3(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("ui优化2:", new x20() { // from class: l.zbc
            @Override // p153l.x20
            public final void call() {
                of7.m167420o().m167425A(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "3x");
            }
        }));
        arrayList.add(jyb.m147494Y("ui优化3:", new x20() { // from class: l.acc
            @Override // p153l.x20
            public final void call() {
                of7.m167420o().m167426B(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            }
        }));
        arrayList.add(jyb.m147494Y("ui优化4:", new x20() { // from class: l.ccc
            @Override // p153l.x20
            public final void call() {
                of7.m167420o().m167427C(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "我的测试", CoreModule.f18264c.f20381e0.m116600p9().picture(0).profileSmall().formatted(), new x20() { // from class: l.fuc
                    @Override // p153l.x20
                    public final void call() {
                        DebugUtil.m59515I1();
                    }
                });
            }
        }));
        arrayList.add(jyb.m147494Y("全量卡片非切卡 - profile全量 - 控制组:" + pza0.f154785n.get(), new x20() { // from class: l.dcc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59678Pe();
            }
        }));
        arrayList.add(jyb.m147494Y("标签 - 动态标签在线:" + pza0.f154774h0.get(), new x20() { // from class: l.ecc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59922b5();
            }
        }));
        arrayList.add(jyb.m147494Y("标签 - 动态标签国家:" + pza0.f154776i0.get(), new x20() { // from class: l.fcc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59471G1();
            }
        }));
        arrayList.add(jyb.m147494Y("标签 - 标签擦肩而过:" + pza0.f154778j0.get(), new x20() { // from class: l.gcc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59443Eh();
            }
        }));
        arrayList.add(jyb.m147494Y("标签 - 标签纯文案:" + pza0.f154780k0.get(), new x20() { // from class: l.hcc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60123k9();
            }
        }));
        arrayList.add(jyb.m147494Y("标签 - 漫游用户标签:" + pza0.f154782l0.get(), new x20() { // from class: l.jcc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60300sa();
            }
        }));
        arrayList.add(jyb.m147494Y("标签 - 朋友圈:" + pza0.f154784m0.get(), new x20() { // from class: l.kcc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60312t0();
            }
        }));
        arrayList.add(jyb.m147494Y("full card 优化", new x20() { // from class: l.lcc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59968d7(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("看看打招呼入口 显示未读", new x20() { // from class: l.mcc
            @Override // p153l.x20
            public final void call() {
                l51.m152919y(new Runnable() { // from class: l.hnc
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m60120k6();
                    }
                });
            }
        }));
        arrayList.add(jyb.m147494Y("看看打招呼入口 显示消息", new x20() { // from class: l.occ
            @Override // p153l.x20
            public final void call() {
                l51.m152919y(new Runnable() { // from class: l.inc
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m60277r9();
                    }
                });
            }
        }));
        arrayList.add(jyb.m147494Y("看看打招呼入口 显示空白", new x20() { // from class: l.pcc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59605M4();
            }
        }));
        arrayList.add(jyb.m147494Y("反诈骗提醒1", new x20() { // from class: l.qcc
            @Override // p153l.x20
            public final void call() {
                qtk.m177997S0(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), false);
            }
        }));
        arrayList.add(jyb.m147494Y("反诈骗提醒2", new x20() { // from class: l.rcc
            @Override // p153l.x20
            public final void call() {
                CoreDlg.m46209T1(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            }
        }));
        arrayList.add(jyb.m147494Y("反诈骗提醒3", new x20() { // from class: l.scc
            @Override // p153l.x20
            public final void call() {
                CoreDlg.m46206S1(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), false);
            }
        }));
        arrayList.add(jyb.m147494Y("new fake", new x20() { // from class: l.ucc
            @Override // p153l.x20
            public final void call() {
                gv20.m132478m(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            }
        }));
        arrayList.add(jyb.m147494Y("语音通话相关", new x20() { // from class: l.vcc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59975de(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("新喜欢弹窗", new x20() { // from class: l.wcc
            @Override // p153l.x20
            public final void call() {
                NewLikeView.m56174E(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), CoreLikers.C4870a.m31500a(CoreLikers.LikersTriggerBy.normal, 1, 1, jyb.m147507f0(CoreModule.m30930K().me_()), null, null, null), new x20() { // from class: l.gnc
                    @Override // p153l.x20
                    public final void call() {
                        o1j0.m165651y("show  see  dialog");
                    }
                });
            }
        }));
        arrayList.add(jyb.m147494Y("国际化SVIP", new x20() { // from class: l.xcc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().dialog().m21534e0(jyb.m147507f0("查看喜欢我的人", "清除svip红点记录", "SVIPIntlGuideAct")).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.rwc
                    @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
                    /* JADX INFO: renamed from: a */
                    public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                        DebugUtil.m60014f9(viewTreeObserverOnGlobalLayoutListenerC8017b2, dialog, view, i, charSequence);
                    }
                }).m21567z0();
            }
        }));
        arrayList.add(jyb.m147494Y("mock first user supper like Me ", new x20() { // from class: l.ycc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59489Gj(new DebugUtil.C9303x(), 1);
            }
        }));
        arrayList.add(jyb.m147494Y("mock first user supper like Me And Has Letter", new x20() { // from class: l.adc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59489Gj(new DebugUtil.C9306y(), 1);
            }
        }));
        arrayList.add(jyb.m147494Y("mock user passby 10", new x20() { // from class: l.bdc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59489Gj(new DebugUtil.C9309z(), 1);
            }
        }));
        arrayList.add(jyb.m147494Y("mock user is student mock前3张卡片用户学生认证", new x20() { // from class: l.cdc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59489Gj(new y20() { // from class: l.rpc
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m59868Yf((User) obj);
                    }
                }, 3);
            }
        }));
        arrayList.add(jyb.m147494Y("mock user  前3张卡用户名字超长", new x20() { // from class: l.ddc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59489Gj(new y20() { // from class: l.nuc
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m59495H3((User) obj);
                    }
                }, 3);
            }
        }));
        arrayList.add(jyb.m147494Y("mock user has all tag mock前3张卡片用户有所有标签(不包含朋友圈)", new x20() { // from class: l.fdc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59489Gj(new y20() { // from class: l.txc
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m59610M9((User) obj);
                    }
                }, 3);
            }
        }));
        arrayList.add(jyb.m147494Y("mock user 共同联系人 2", new x20() { // from class: l.gdc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59489Gj(new DebugUtil.C9221a0(), 2);
            }
        }));
        arrayList.add(jyb.m147494Y("mock user 共同联系人 10", new x20() { // from class: l.hdc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59489Gj(new DebugUtil.C9225b0(), 2);
            }
        }));
        arrayList.add(jyb.m147494Y("mock user 共同联系人 25", new x20() { // from class: l.idc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59489Gj(new DebugUtil.C9229c0(), 2);
            }
        }));
        arrayList.add(jyb.m147494Y("卡片左右切卡引导 状态重制", new x20() { // from class: l.jdc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20405m0.f20202w0.put(Boolean.FALSE);
            }
        }));
        arrayList.add(jyb.m147494Y("后端下发认证实验强制方式 头像认证: " + hxf.f111998b.get(), new x20() { // from class: l.kdc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60106je();
            }
        }));
        arrayList.add(jyb.m147494Y("后端下发认证实验强制方式 实名认证:" + hxf.f111999c.get(), new x20() { // from class: l.mdc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59563K5();
            }
        }));
        arrayList.add(jyb.m147494Y("mock profile refactor =" + pza0.f154781l.get(), new x20() { // from class: l.ndc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59415Db();
            }
        }));
        arrayList.add(jyb.m147494Y("mock profile refactor isProfileRefactorWithOutGuide  =" + pza0.f154783m.get(), new x20() { // from class: l.odc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59437Eb();
            }
        }));
        arrayList.add(jyb.m147494Y("mock profile card bottom view render   =" + pza0.f154761b.get(), new x20() { // from class: l.qdc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59406D2();
            }
        }));
        arrayList.add(jyb.m147494Y("mock profile refactor no about Profile改版-解耦“关于我 =" + pza0.f154759a.get(), new x20() { // from class: l.rdc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59538J2();
            }
        }));
        arrayList.add(jyb.m147494Y("mock profile card bottom view debugBlockBottomAboutMe   =" + pza0.f154763c.get(), new x20() { // from class: l.sdc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60412xc();
            }
        }));
        arrayList.add(jyb.m147494Y("xxx 新交友目的 筛选 二期实验:" + baj.f75700a.get(), new x20() { // from class: l.tdc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59798V8();
            }
        }));
        arrayList.add(jyb.m147494Y("xxx 新交友目的 筛选 保存资料清空交友目的:" + baj.f75701b.get(), new x20() { // from class: l.udc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60031g4();
            }
        }));
        arrayList.add(jyb.m147494Y("xxx 新交友目的 新弹框", new x20() { // from class: l.vdc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59438Ec(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("xxx 新交友目的 新弹框 划卡一定弹:" + baj.f75703d.get(), new x20() { // from class: l.wdc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60176mi();
            }
        }));
        arrayList.add(jyb.m147494Y("xxx 新交友目的 二期完善资料弹框", new x20() { // from class: l.ydc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59387C5(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("mock profile card 卡片原图显示 =" + pza0.f154767e.get(), new x20() { // from class: l.zdc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60192nc();
            }
        }));
        arrayList.add(jyb.m147494Y("新喜欢弹窗本地记录清除", new x20() { // from class: l.bec
            @Override // p153l.x20
            public final void call() {
                e230.m119042d();
            }
        }));
        arrayList.add(jyb.m147494Y("SVIP双tab购买", new x20() { // from class: l.cec
            @Override // p153l.x20
            public final void call() {
                C8927c.m54692z0(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "", Privilege.letter, PurchaseType.TYPE_GET_VIP, null, 0);
            }
        }));
        arrayList.add(jyb.m147494Y("插入online boost用户", new x20() { // from class: l.dec
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59972db();
            }
        }));
        arrayList.add(jyb.m147494Y("绑定手机号弹窗", new x20() { // from class: l.eec
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                qtk.m177989O0(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), "", new x20() { // from class: l.owc
                    @Override // p153l.x20
                    public final void call() {
                        iz40.m142788y(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), true);
                    }
                }, false);
            }
        }));
        arrayList.add(jyb.m147494Y("最后一张提前到都一张", new x20() { // from class: l.fec
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59459Fb();
            }
        }));
        arrayList.add(jyb.m147494Y("无匹配弹窗", new x20() { // from class: l.gec
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20405m0.f20065B0.m137019l(uxj0.f181467a);
            }
        }));
        arrayList.add(jyb.m147494Y("清除性别fake本地标记", new x20() { // from class: l.hec
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20381e0.f89309q1.put(Boolean.FALSE);
            }
        }));
        arrayList.add(jyb.m147494Y("拍一拍", new x20() { // from class: l.iec
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59826Wf(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("列表加载速度优化", new x20() { // from class: l.kec
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59782Ud(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("群聊 group debug", new x20() { // from class: l.mec
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59664P0(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("新配对Congrats开关:".concat(z7x.f203278a.get().booleanValue() ? "true" : "false"), new x20() { // from class: l.nec
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59998ef();
            }
        }));
        arrayList.add(jyb.m147494Y("展示顶部弹窗 x 10", new x20() { // from class: l.oec
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59611Ma(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("clear intl fake dialog count", new x20() { // from class: l.pec
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60424y2();
            }
        }));
        arrayList.add(jyb.m147494Y("Conversation Counter Verification", new x20() { // from class: l.qec
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60417xh(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("商业化通用【汇总】", new x20() { // from class: l.rec
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60121k7(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("商业化AB实验【汇总】", new x20() { // from class: l.sec
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60320t8(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b, b240Var);
            }
        }));
        arrayList.add(jyb.m147494Y("刷新表情数据", new x20() { // from class: l.tec
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20366Z.f20884S.m159280q();
            }
        }));
        arrayList.add(jyb.m147494Y("女性显示喜欢标记" + CoreModule.f18264c.f20405m0.f20119U0.get(), new x20() { // from class: l.uec
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59891Zh();
            }
        }));
        arrayList.add(jyb.m147494Y("清除女性Banner展示时间", new x20() { // from class: l.yec
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20429u0.f20003s0.put(0L);
            }
        }));
        arrayList.add(jyb.m147494Y("展示女性新喜欢Banner", new x20() { // from class: l.zec
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60108jg(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("插入固定的User到顶部", new x20() { // from class: l.afc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60420xk(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            }
        }));
        arrayList.add(jyb.m147494Y("插入固定的User到顶部喜欢我", new x20() { // from class: l.bfc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60442yk(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), true, 0);
            }
        }));
        arrayList.add(jyb.m147494Y("查询固定的User", new x20() { // from class: l.cfc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59401Cj(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            }
        }));
        arrayList.add(jyb.m147494Y("插入固定的User到顶部没有喜欢我", new x20() { // from class: l.dfc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60442yk(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), false, 0);
            }
        }));
        arrayList.add(jyb.m147494Y("插入固定1的User到顶部没有喜欢我", new x20() { // from class: l.efc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60442yk(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), false, 1);
            }
        }));
        arrayList.add(jyb.m147494Y("插入固定的User到顶部重逢配对", new x20() { // from class: l.ffc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60464zk(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            }
        }));
        arrayList.add(jyb.m147494Y("城市c位广播", new x20() { // from class: l.gfc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59369B9(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("消息tab优化 = " + pza0.f154772g0.get(), new x20() { // from class: l.hfc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59737Sa();
            }
        }));
        arrayList.add(jyb.m147494Y("显示superlike动画", new x20() { // from class: l.kfc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), new Runnable() { // from class: l.ouc
                    @Override // java.lang.Runnable
                    public final void run() {
                        viewTreeObserverOnGlobalLayoutListenerC8017b2.m38373v6();
                    }
                }, 500L);
            }
        }));
        arrayList.add(jyb.m147494Y("superlike探探币连送确定", new x20() { // from class: l.lfc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), new Runnable() { // from class: l.jyc
                    @Override // java.lang.Runnable
                    public final void run() {
                        viewTreeObserverOnGlobalLayoutListenerC8017b2.m38327m6(99999);
                    }
                }, 500L);
            }
        }));
        arrayList.add(jyb.m147494Y("显示superlike探探币提示", new x20() { // from class: l.mfc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), new Runnable() { // from class: l.qxc
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b3 = viewTreeObserverOnGlobalLayoutListenerC8017b2;
                        z5h0.m218666M(viewTreeObserverOnGlobalLayoutListenerC8017b3.m38344q2(), viewTreeObserverOnGlobalLayoutListenerC8017b3.m38388z2(), viewTreeObserverOnGlobalLayoutListenerC8017b3.m38137C2().getRealView(), 1300);
                    }
                }, 500L);
            }
        }));
        arrayList.add(jyb.m147494Y("显示superlike长按引导", new x20() { // from class: l.nfc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), new Runnable() { // from class: l.qtc
                    @Override // java.lang.Runnable
                    public final void run() {
                        viewTreeObserverOnGlobalLayoutListenerC8017b2.m38378w6(true);
                    }
                }, 500L);
            }
        }));
        arrayList.add(jyb.m147494Y("展示设置蒙层", new x20() { // from class: l.ofc
            @Override // p153l.x20
            public final void call() {
                l51.m152888H(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), new Runnable() { // from class: l.sqc
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m59879Z5();
                    }
                }, 500L);
            }
        }));
        arrayList.add(jyb.m147494Y("所有都有letter", new x20() { // from class: l.pfc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59425E();
            }
        }));
        arrayList.add(jyb.m147494Y("所有都有新喜欢", new x20() { // from class: l.qfc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59957ci();
            }
        }));
        arrayList.add(jyb.m147494Y("清除所有标记", new x20() { // from class: l.rfc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59910af();
            }
        }));
        arrayList.add(jyb.m147494Y("首页蒙层相关", new x20() { // from class: l.sfc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59699Qe(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("关闭Google地图服务", new x20() { // from class: l.ufc
            @Override // p153l.x20
            public final void call() {
                uqb0.f180419v = false;
            }
        }));
        arrayList.add(jyb.m147494Y("圣诞活动-选择好友", new x20() { // from class: l.xfc
            @Override // p153l.x20
            public final void call() {
                CoreDlg.m46203R1(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "selectFriends", "选择好友", "每次分享最多选择5位好友", 5, "分享", "最多可以选择5位好友", null, new z20() { // from class: l.npc
                    @Override // p153l.z20
                    public final void call(Object obj, Object obj2) {
                        o1j0.m165651y("选择好友：" + ((String) obj2));
                    }
                });
            }
        }));
        arrayList.add(jyb.m147494Y("圣诞活动-发送消息", new x20() { // from class: l.yfc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59889Zf(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("推荐接口的全部用户id", new x20() { // from class: l.zfc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60086ig();
            }
        }));
        arrayList.add(jyb.m147494Y("测试打电话给28331", new x20() { // from class: l.agc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().startActivity(MessagesAct.m50123g2(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), "28331", 31, jyb.m147494Y("ISCALLEER", "1")));
            }
        }));
        arrayList.add(jyb.m147494Y("接受28331语聊match", new x20() { // from class: l.bgc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().startActivity(MessagesAct.m50123g2(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), "28331", 31, jyb.m147494Y("ISCALLEER", "0")));
            }
        }));
        arrayList.add(jyb.m147494Y("语音闪聊充值弹窗", new x20() { // from class: l.cgc
            @Override // p153l.x20
            public final void call() {
                a5i0.m96186z1(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "", null, null);
            }
        }));
        arrayList.add(jyb.m147494Y("语音闪聊确认弹窗", new x20() { // from class: l.dgc
            @Override // p153l.x20
            public final void call() {
                a5i0.m96085B1(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), PurchaseType.TYPE_GET_VOICE_ONLINE_MATCH_TICKETS_EXTRA, null, null);
            }
        }));
        arrayList.add(jyb.m147494Y("完善资料", new x20() { // from class: l.fgc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60180n0(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("打开关闭tantanlist " + CoreModule.f18264c.f20381e0.f89089O1.get(), new x20() { // from class: l.ggc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60102ja();
            }
        }));
        arrayList.add(jyb.m147494Y("跳转到闪聊二楼 ", new x20() { // from class: l.hgc
            @Override // p153l.x20
            public final void call() {
                nae0.m162083m(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), Uri.parse("tantanapp://quickChat2Floor"));
            }
        }));
        arrayList.add(jyb.m147494Y("跳转See deep", new x20() { // from class: l.jgc
            @Override // p153l.x20
            public final void call() {
                nae0.m162083m(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), Uri.parse("tantanapp://seeLikes?preferredShowPurchase=false&preferredShowDetail=true"));
            }
        }));
        arrayList.add(jyb.m147494Y("跳转See deep show prchase", new x20() { // from class: l.kgc
            @Override // p153l.x20
            public final void call() {
                nae0.m162083m(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), Uri.parse("tantanapp://seeLikes?preferredShowPurchase=true&preferredShowDetail=true"));
            }
        }));
        arrayList.add(jyb.m147494Y("跳转See deep no jump", new x20() { // from class: l.lgc
            @Override // p153l.x20
            public final void call() {
                nae0.m162083m(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), Uri.parse("tantanapp://seeLikes?preferredShowPurchase=true&preferredShowDetail=false"));
            }
        }));
        arrayList.add(jyb.m147494Y("跳转遇见 deep see", new x20() { // from class: l.mgc
            @Override // p153l.x20
            public final void call() {
                nae0.m162083m(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), Uri.parse("tantanapp://myMeet?preferredShowPurchase=false&tab=see"));
            }
        }));
        arrayList.add(jyb.m147494Y("跳转遇见 deep like", new x20() { // from class: l.ngc
            @Override // p153l.x20
            public final void call() {
                nae0.m162083m(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), Uri.parse("tantanapp://myMeet?preferredShowPurchase=false&tab=like"));
            }
        }));
        arrayList.add(jyb.m147494Y("跳转遇见 deep see  show pur", new x20() { // from class: l.ogc
            @Override // p153l.x20
            public final void call() {
                nae0.m162083m(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), Uri.parse("tantanapp://myMeet?preferredShowPurchase=true&tab=see"));
            }
        }));
        arrayList.add(jyb.m147494Y("跳转遇见 deep like show pur", new x20() { // from class: l.qgc
            @Override // p153l.x20
            public final void call() {
                nae0.m162083m(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), Uri.parse("tantanapp://myMeet?preferredShowPurchase=true&tab=like"));
            }
        }));
        arrayList.add(jyb.m147494Y("打开关闭tantanlistDebug " + CoreModule.f18264c.f20381e0.f89096P1.get(), new x20() { // from class: l.rgc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59582L2();
            }
        }));
        arrayList.add(jyb.m147494Y("书影剧：dlg2", new x20() { // from class: l.sgc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60327tf(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("书影剧 登录用户评论：", new x20() { // from class: l.tgc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59549Jd();
            }
        }));
        arrayList.add(jyb.m147494Y("书影剧 聊一聊 第一次提示: " + CoreModule.f18264c.f20381e0.f89240h2.get(), new x20() { // from class: l.vgc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20381e0.f89240h2.put(Boolean.TRUE);
            }
        }));
        arrayList.add(jyb.m147494Y("展示内部push", new x20() { // from class: l.wgc
            @Override // p153l.x20
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC8017b.act().postDelayed(new Runnable() { // from class: l.fxc
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.f18264c.f20397j1.m31132k();
                    }
                }, 1000L);
            }
        }));
        arrayList.add(jyb.m147494Y("展示模拟限时配对", new x20() { // from class: l.xgc
            @Override // p153l.x20
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC8017b.act().postDelayed(new Runnable() { // from class: l.dyc
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.f18264c.f20397j1.m31133l();
                    }
                }, 3000L);
            }
        }));
        arrayList.add(jyb.m147494Y("展示选择头像Frag", new x20() { // from class: l.ygc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().postDelayed(new Runnable() { // from class: l.wlc
                    @Override // java.lang.Runnable
                    public final void run() {
                        new MediaRecorderFrag().show(viewTreeObserverOnGlobalLayoutListenerC8017b2.act().getSupportFragmentManager(), "update_avatar");
                    }
                }, 500L);
            }
        }));
        arrayList.add(jyb.m147494Y("打开丰富资料debug入口：" + C8291a.f26041f.get(), new x20() { // from class: l.zgc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59374Be();
            }
        }));
        arrayList.add(jyb.m147494Y("丰富资料用户是否需要跳转打招呼：", new x20() { // from class: l.bhc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                w1e.m204400d(viewTreeObserverOnGlobalLayoutListenerC8017b2.act()).m204430r("input the user id").m204421F(new y20() { // from class: l.uxc
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m60139l3(viewTreeObserverOnGlobalLayoutListenerC8017b2, (String) obj);
                    }
                }).m204426n().show();
            }
        }));
        arrayList.add(jyb.m147494Y("触发丰富资料(线上url)：" + C8291a.f26041f.get(), new x20() { // from class: l.chc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59673P9();
            }
        }));
        arrayList.add(jyb.m147494Y("触发丰富资料结束语：" + CoreModule.f18264c.f20384f0.f20653X0.get(), new x20() { // from class: l.dhc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59749T1();
            }
        }));
        arrayList.add(jyb.m147494Y("打开丰富资料debug入口有效时间：" + C8291a.f26041f.get(), new x20() { // from class: l.ehc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20381e0.f89104Q1.put(Long.valueOf(pzi0.m174454o() + (((long) (gra.m131659b0() * MMKV.ExpireInDay)) * 1000)));
            }
        }));
        arrayList.add(jyb.m147494Y("清空丰富资料本地数据：" + C8291a.f26041f.get(), new x20() { // from class: l.fhc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60261qf();
            }
        }));
        arrayList.add(jyb.m147494Y("mock 完成来填写", new x20() { // from class: l.hhc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m34037ln();
            }
        }));
        arrayList.add(jyb.m147494Y("mock 打开应用", new x20() { // from class: l.ihc
            @Override // p153l.x20
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC8017b.f22658a.postDelayed(new Runnable() { // from class: l.rnc
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.f18264c.f20384f0.m34156up();
                    }
                }, 3000L);
            }
        }));
        arrayList.add(jyb.m147494Y("丰富资料修改成finished", new x20() { // from class: l.jhc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60154li(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("丰富资料修改成not-finished", new x20() { // from class: l.khc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59575Kh(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("修改briefIntroduction改为我是一个up主", new x20() { // from class: l.mhc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59689Q4(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("动态打招呼二期男性气泡文案设置为false", new x20() { // from class: l.nhc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20420r0.f20764c0.put(Boolean.FALSE);
            }
        }));
        arrayList.add(jyb.m147494Y("心动信号", new x20() { // from class: l.ohc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59632Na(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("消息合规", new x20() { // from class: l.phc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60105jd(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("解析ListDemo", new x20() { // from class: l.qhc
            @Override // p153l.x20
            public final void call() {
                JsonParseHelper.parseList("[{\n\t\"convType\": \"defalut\"\n}, {\n\t\"convType\": \"hahah\"\n}]", Conversation.JSON_ADAPTER).size();
            }
        }));
        arrayList.add(jyb.m147494Y("交友目的全量,严肃弹框", new x20() { // from class: l.rhc
            @Override // p153l.x20
            public final void call() {
                baj.m103189b0(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            }
        }));
        arrayList.add(jyb.m147494Y("新标签，弹框添加标签", new x20() { // from class: l.thc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59761Td(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("新标签，测试queryTags", new x20() { // from class: l.uhc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60423y1();
            }
        }));
        arrayList.add(jyb.m147494Y("新标签，测试ffirstLeftSlide.put(true)", new x20() { // from class: l.vhc
            @Override // p153l.x20
            public final void call() {
                new jxd0("first_left_slide_" + CoreModule.m30929H().userId(), Boolean.FALSE).put(Boolean.TRUE);
            }
        }));
        arrayList.add(jyb.m147494Y("标签找人页-跳转profile-输入userId", new x20() { // from class: l.xhc
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                w1e.m204400d(viewTreeObserverOnGlobalLayoutListenerC8017b2.act()).m204419D(10).m204430r("input the user id").m204421F(new y20() { // from class: l.lyc
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b3 = viewTreeObserverOnGlobalLayoutListenerC8017b2;
                        String str2 = (String) obj;
                        viewTreeObserverOnGlobalLayoutListenerC8017b3.act().duringCreated(CoreModule.m30930K().userObsById(str2)).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.aad
                            @Override // p153l.y20
                            public final void call(Object obj2) {
                                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b4 = viewTreeObserverOnGlobalLayoutListenerC8017b3;
                                viewTreeObserverOnGlobalLayoutListenerC8017b4.act().startActivity(CoreModule.m30930K().mo31676Ar(viewTreeObserverOnGlobalLayoutListenerC8017b4.act(), str2, "from_mew_tags", false));
                            }
                        }));
                    }
                }).m204426n().show();
            }
        }));
        arrayList.add(jyb.m147494Y("书影剧三期最大添加个数 = " + CoreModule.f18264c.f20424s1.f20824S.get(), new x20() { // from class: l.yhc
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20424s1.f20824S.put(10);
            }
        }));
        arrayList.add(jyb.m147494Y("心动信号引导添加标签", new x20() { // from class: l.zhc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59943c4(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("触发破冰插卡", new x20() { // from class: l.aic
            @Override // p153l.x20
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC8017b.act().duringCreated(CoreModule.f18264c.f20381e0.m116602q7("card")).subscribe(psd0.m173597H(new y20() { // from class: l.iwc
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m60313t1((List) obj);
                    }
                }, new y20() { // from class: l.jwc
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m59976df((Throwable) obj);
                    }
                }));
            }
        }));
        arrayList.add(jyb.m147494Y("触发破冰弹窗", new x20() { // from class: l.bic
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                viewTreeObserverOnGlobalLayoutListenerC8017b2.act().duringCreated(CoreModule.f18264c.f20381e0.m116602q7("chat")).subscribe(psd0.m173597H(new y20() { // from class: l.unc
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m60169mb(viewTreeObserverOnGlobalLayoutListenerC8017b2, (List) obj);
                    }
                }, new y20() { // from class: l.vnc
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m60226p2((Throwable) obj);
                    }
                }));
            }
        }));
        m60133kj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m60111jj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59423Dj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m60441yj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59445Ej(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m60024fj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59980dj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m60155lj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59379Bj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59851Xj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        arrayList.add(jyb.m147494Y("心动信号--引导标签填写", new x20() { // from class: l.cic
            @Override // p153l.x20
            public final void call() {
                gj40.m130415o().m130421F(viewTreeObserverOnGlobalLayoutListenerC8017b.m38344q2(), CoreModule.m30929H().userId(), "from_card_tag_guide", TabName.Card.name(), 3002);
            }
        }));
        arrayList.add(jyb.m147494Y("打开&关闭过热：" + C8523d.f30302a, new x20() { // from class: l.dic
            @Override // p153l.x20
            public final void call() {
                C8523d.f30302a = !C8523d.f30302a;
            }
        }));
        arrayList.add(jyb.m147494Y("升温", new x20() { // from class: l.fic
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59388C6(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("设置新版聊天升温温度：" + CoreModule.f18264c.f20381e0.f89331t2.get(), new x20() { // from class: l.gic
            @Override // p153l.x20
            public final void call() {
                w1e.m204400d(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m204424I("输入温度").m204420E(1).m204419D(80).m204421F(new y20() { // from class: l.svc
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m59339A1((String) obj);
                    }
                }).m204426n().show();
            }
        }));
        arrayList.add(jyb.m147494Y("划卡优化开", new x20() { // from class: l.iic
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59666P2(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("插卡管控：" + CoreModule.f18264c.f20364Y0.f161167i.get(), new x20() { // from class: l.jic
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20364Y0.f161167i.put(0L);
            }
        }));
        arrayList.add(jyb.m147494Y("测试桥", new x20() { // from class: l.kic
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59655Oc(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("插入认证问询卡片：", new x20() { // from class: l.lic
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20294B0.m32600U3().subscribe(psd0.m173596G(new y20() { // from class: l.qyc
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m59393Cb((pf60) obj);
                    }
                }));
            }
        }));
        arrayList.add(jyb.m147494Y("选择消息帧改版实验：" + f39105g.get(), new x20() { // from class: l.mic
            @Override // p153l.x20
            public final void call() {
                w1e.m204400d(viewTreeObserverOnGlobalLayoutListenerC8017b.act()).m204424I("输入实验").m204420E(1).m204419D(80).m204421F(new y20() { // from class: l.toc
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m59965d4((String) obj);
                    }
                }).m204426n().show();
            }
        }));
        arrayList.add(jyb.m147494Y("甩尾逻辑:" + f39106h.get(), new x20() { // from class: l.nic
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59587L7();
            }
        }));
        arrayList.add(jyb.m147494Y("图文审核中台化", new x20() { // from class: l.oic
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59672P8(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("消息红点脱敏", new x20() { // from class: l.pic
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60455zb(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        arrayList.add(jyb.m147494Y("国际化跳转打招呼：", new x20() { // from class: l.ric
            @Override // p153l.x20
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                w1e.m204400d(viewTreeObserverOnGlobalLayoutListenerC8017b2.act()).m204430r("input the user id").m204421F(new y20() { // from class: l.nqc
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        DebugUtil.m59796V6(viewTreeObserverOnGlobalLayoutListenerC8017b2, (String) obj);
                    }
                }).m204426n().show();
            }
        }));
        m59915ak(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59555Jj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m60156lk(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59937bk(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59981dk(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59830Wj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59599Lj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m60288rk(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59682Pi(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59745Si(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59577Kj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m60178mk(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59380Bk(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59424Dk(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59490Gk(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59554Ji(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59766Ti(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59724Ri(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m60112jk(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59532Ii(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59446Ek(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59936bj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59661Oi(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m60134kk(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        HashMap map = new HashMap();
        map.put("资产配图", CoreModule.f18264c.f20381e0.f89043H3);
        map.put("资料页体验优化", CoreModule.f18264c.f20381e0.f89091O3);
        map.put("书影剧pic2txt", CoreModule.f18264c.f20381e0.f89335t6);
        m59510Hi(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b, map);
        m59829Wi(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59578Kk(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59662Oj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59466Fi(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59512Hk(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m60222ok(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59576Ki(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m60200nk(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m60354uk(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59468Fk(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59893Zj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59683Pj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59850Xi(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59787Ui(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59704Qj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m60025fk(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m60090ik(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m60069hk(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59619Mi(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m60310sk(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59533Ij(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59556Jk(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m60047gk(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59808Vi(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59788Uj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59767Tj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59809Vj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59959ck(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m60266qk(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59871Yi(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59703Qi(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59640Ni(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59534Ik(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59746Sj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59402Ck(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m60463zj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m59357Aj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m60331tj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m60265qj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m60287rj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m60375vj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m60177mj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m60397wj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m60353uj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m60309sj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        m60068hj(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
        return arrayList;
    }

    /* JADX INFO: renamed from: xk */
    public static void m60420xk(final Act act) {
        w1e.m204400d(act).m204419D(10).m204430r("输入插入Userid").m204421F(new y20() { // from class: l.exc
            @Override // p153l.y20
            public final void call(Object obj) {
                Act act2 = act;
                l51.m152888H(act2, new Runnable() { // from class: l.r1d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m60199nj(str, act2, 0);
                    }
                }, 1000L);
            }
        }).m204426n().show();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m60421y(Throwable th) {
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m60422y0(CounterLikeLimit counterLikeLimit, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, User user, Dialog dialog, View view, int i, CharSequence charSequence) {
        i4g0.m138523u("e_debug_tool", "p_debug_tool_dialog_view", jyb.m147494Y("debug_tool_name", charSequence));
        switch (i) {
            case 1:
                new RunnableC9291t(counterLikeLimit, viewTreeObserverOnGlobalLayoutListenerC8017b).run();
                break;
            case 3:
                CoreDlg.m46301y1(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), CoreModule.f18264c.f20381e0.m116600p9(), false, new Runnable() { // from class: l.z6d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m59416Dc(viewTreeObserverOnGlobalLayoutListenerC8017b);
                    }
                }, new Runnable() { // from class: l.e7d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m59827Wg();
                    }
                });
                break;
            case 4:
                CoreDlg.m46301y1(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), CoreModule.f18264c.f20381e0.m116600p9(), true, new Runnable() { // from class: l.f7d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m59561K3(viewTreeObserverOnGlobalLayoutListenerC8017b);
                    }
                }, new Runnable() { // from class: l.g7d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m59807Vh();
                    }
                });
                break;
            case 5:
                hl3.m135664G(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), true, "kingty", CoreModule.f18264c.m32487o3().superLikeLimit.remainToday() + "", true, new Runnable() { // from class: l.h7d
                    @Override // java.lang.Runnable
                    public final void run() {
                        viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2().mo39804A(SwipeDirection.UP);
                    }
                }, new Runnable() { // from class: l.i7d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m60324tc();
                    }
                });
                break;
            case 6:
                hl3.m135664G(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), false, "kingty", CoreModule.f18264c.m32487o3().superLikeLimit.remainToday() + "", true, new Runnable() { // from class: l.j7d
                    @Override // java.lang.Runnable
                    public final void run() {
                        viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2().mo39804A(SwipeDirection.UP);
                    }
                }, new Runnable() { // from class: l.k7d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m59496H4();
                    }
                });
                break;
            case 8:
                C8927c.m54592L1(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "p_home,expired_vip", null, null, null, true);
                break;
            case 12:
                C8927c.m54586J1(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), null, Privilege.vip_super_like);
                break;
            case 13:
                C8927c.m54574F1(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), null);
                break;
            case 14:
                qtk.m177999T0(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
                break;
            case 15:
                qtk.m178003V0(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), true, user.m61308fp(), viewTreeObserverOnGlobalLayoutListenerC8017b.act().string(R$string.f19221el), new Runnable() { // from class: l.l7d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                        viewTreeObserverOnGlobalLayoutListenerC8017b2.m38344q2().startActivityForResult(MediaPickerAct.m80102Y1(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(bnl0.m105592y0() - qa00.m175859d(40.0f)).build()).withFromType(1).build()), 19);
                    }
                });
                break;
            case 16:
                viewTreeObserverOnGlobalLayoutListenerC8017b.m38141C6();
                break;
            case 17:
                viewTreeObserverOnGlobalLayoutListenerC8017b.act().dialog().m21503F(viewTreeObserverOnGlobalLayoutListenerC8017b.m38285e2(viewTreeObserverOnGlobalLayoutListenerC8017b.act().getString(R$string.f18503H0) + CoreModule.f18264c.f20338P2.get() + viewTreeObserverOnGlobalLayoutListenerC8017b.act().getString(R$string.f18472G0))).m21542m0(viewTreeObserverOnGlobalLayoutListenerC8017b.act().getString(R$string.f19138c)).m21559v0(viewTreeObserverOnGlobalLayoutListenerC8017b.act().getString(R$string.f19848z), new Runnable() { // from class: l.n7d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                        viewTreeObserverOnGlobalLayoutListenerC8017b2.m38146D6(StudentInfoAct.m45668X1(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), "Chanel6.SchoolIdentifyPage.Shown", false));
                    }
                }).m21567z0();
                break;
            case 18:
                viewTreeObserverOnGlobalLayoutListenerC8017b.m38344q2().m21602w4(MatchAct.m48746g2(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), jyb.m147507f0(user.f56859id), 0, new ArrayList()), new MatchAct.C8617b());
                break;
            case 21:
                viewTreeObserverOnGlobalLayoutListenerC8017b.m38363t6();
                break;
            case 22:
                o1j0.m165644r("removed");
                break;
            case 23:
                qtk.m178003V0(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), true, user.m61308fp(), viewTreeObserverOnGlobalLayoutListenerC8017b.act().string(R$string.f19445m), null);
                break;
            case 29:
                hl3.m135666I(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), 3, jyb.m147507f0("http://cloud.staging1.p1staff.com/v1/images/eyJpZCI6IktVSldUR0tCQU9HU1JXQklRQ1FPUlhWUVE2R0xEWiIsInciOjk2MCwiaCI6OTYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NzgyMjA1OTUzOTczMzQ5NjYxOCwiYWIiOjB9", "http://cloud.staging1.p1staff.com/v1/images/eyJpZCI6IkJONk1QNk9CN0RJUTNaVFdYQTVKWVE0MjRLVlBSQSIsInciOjU4NywiaCI6NTg3LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTQ1NzkxNTcxOTgwMzQwMTg5MTksImFiIjowfQ", "http://cloud.staging1.p1staff.com/v1/images/eyJpZCI6IjJXVk8ySEJUR0xHR1VLTU1KR0JBSlA3QVJSWU5VRyIsInciOjc1MCwiaCI6NzUwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTI4MzY5ODM3MDc4MjEzMjE0ODJ"));
                break;
            case 30:
                C8509a.m46746j();
                C8509a.m46747q(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), new Runnable() { // from class: l.a7d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m59934bh();
                    }
                }, new Runnable() { // from class: l.c7d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m59674Pa();
                    }
                });
                break;
            case 31:
                ebn.m120189D(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), "", "homePage");
                break;
            case 33:
                new xgj().m210898j(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), CoreModule.f18264c.f20381e0.m116600p9());
                break;
            case 34:
                ebn.m120186A(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), PurchaseType.TYPE_GET_LIKERS, "");
                break;
            case 35:
                ebn.m120188C(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), viewTreeObserverOnGlobalLayoutListenerC8017b.act().string(R$string.f18463Fm), viewTreeObserverOnGlobalLayoutListenerC8017b.act().string(R$string.f18432Em), viewTreeObserverOnGlobalLayoutListenerC8017b.act().string(R$string.f18370Cm), new Runnable() { // from class: l.d7d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = viewTreeObserverOnGlobalLayoutListenerC8017b;
                        viewTreeObserverOnGlobalLayoutListenerC8017b2.act().startActivity(NewMainAct.m40707Q5(viewTreeObserverOnGlobalLayoutListenerC8017b2.act(), NavigationIntent.get("setting")));
                    }
                });
                break;
        }
    }

    /* JADX INFO: renamed from: y1 */
    public static /* synthetic */ void m60423y1() {
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < 7; i++) {
            arrayList.add(i + "");
        }
        gj40.m130415o().m130431P(arrayList);
    }

    /* JADX INFO: renamed from: y2 */
    public static /* synthetic */ void m60424y2() {
        CoreModule.f18264c.f20381e0.f89135U0.put(0);
        CoreModule.f18264c.f20384f0.m34052mp(true);
    }

    /* JADX INFO: renamed from: y4 */
    public static /* synthetic */ void m60426y4() {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.system_reminder);
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        messageNew_.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.systemReminder = SystemReminder.new_();
        messageNew_.additionalData.systemReminder.icon = "https://auto.tancdn.com/v1/images/eyJpZCI6IlpMWEZNRjQ1NEFDVlRSUjNWN0hDQlRPRjVGQTcyNzE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NDM3MjA2NzE3MTA4NzkyNTg4fQ.png";
        messageNew_.value = "好友上线了";
        CoreModule.f18264c.f20384f0.f20705o2.clear();
        CoreModule.f18264c.f20384f0.f20705o2.add(messageNew_);
    }

    /* JADX INFO: renamed from: y5 */
    public static /* synthetic */ void m60427y5() {
    }

    /* JADX INFO: renamed from: y7 */
    public static /* synthetic */ void m60429y7(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        viewTreeObserverOnGlobalLayoutListenerC8017b.m38318k6();
        CoreModule.f18264c.f20381e0.f89100P5.put(0L);
        CoreModule.f18264c.f20381e0.f89093O5.put(0);
    }

    /* JADX INFO: renamed from: y8 */
    public static /* synthetic */ void m60430y8() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89260j6;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: y9 */
    public static /* synthetic */ void m60431y9(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        final VerificationNetworkData verificationNetworkDataNew_ = VerificationNetworkData.new_();
        verificationNetworkDataNew_.meta.code = TantanException.NET_ACTION_AVATAR_VERIFICATION;
        verificationNetworkDataNew_.data.status = 1;
        v3l0.m199281e().m199282b().m137019l(verificationNetworkDataNew_);
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().postDelayed(new Runnable() { // from class: l.hbd
            @Override // java.lang.Runnable
            public final void run() {
                v3l0.m199281e().m199282b().m137019l(verificationNetworkDataNew_);
            }
        }, com.clevertap.android.sdk.Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
    }

    /* JADX INFO: renamed from: ya */
    public static /* synthetic */ void m60432ya() {
    }

    /* JADX INFO: renamed from: yd */
    public static /* synthetic */ void m60435yd() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89045H6;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: ye */
    public static /* synthetic */ void m60436ye(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        ybh0.C21557b c21557b = new ybh0.C21557b();
        c21557b.m215072a(3);
        c21557b.m215074c(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
    }

    /* JADX INFO: renamed from: yi */
    public static /* synthetic */ void m60440yi(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("SVIP单tab购买弹窗-打招呼", new x20() { // from class: l.s9d
            @Override // p153l.x20
            public final void call() {
                C8927c.m54682v0(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
            }
        }));
        arrayList.add(jyb.m147494Y("打招呼消耗探币提示弹窗", new x20() { // from class: l.t9d
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18276o.m132214d().mo34863jf(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), CoreModule.f18264c.f20312H0.m155467t5(), null, null, null);
            }
        }));
        arrayList.add(jyb.m147494Y("打招呼 探探币消耗 不再提醒 重置", new x20() { // from class: l.u9d
            @Override // p153l.x20
            public final void call() {
                a5i0.m96160p0().m96202R0(false);
            }
        }));
        arrayList.add(jyb.m147494Y("打招呼 探币不足充值弹窗", new x20() { // from class: l.v9d
            @Override // p153l.x20
            public final void call() {
                CoreModule.m30933P().m143410g().mo36027Pk(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), BuildConfig.BUILD_TYPE, null);
            }
        }));
        arrayList.add(jyb.m147494Y("打招呼 礼物引导动画重置", new x20() { // from class: l.w9d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60379w1();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: yj */
    public static void m60441yj(ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("国际化 同道中人", new x20() { // from class: l.jnc
            @Override // p153l.x20
            public final void call() {
                C8574a.INSTANCE.m48068f(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), true);
            }
        }));
    }

    /* JADX INFO: renamed from: yk */
    public static void m60442yk(final Act act, final boolean z, final int i) {
        w1e.m204400d(act).m204419D(10).m204430r("输入插入Userid").m204421F(new y20() { // from class: l.mxc
            @Override // p153l.y20
            public final void call(Object obj) {
                Act act2 = act;
                l51.m152888H(act2, new Runnable() { // from class: l.c8d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m60221oj(str, act2, z, i);
                    }
                }, 1000L);
            }
        }).m204426n().show();
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m60443z(ArrayList arrayList, final b240 b240Var, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("试用真实头像用户特权插卡", new x20() { // from class: l.z3d
            @Override // p153l.x20
            public final void call() {
                y6d0.m214478q();
            }
        }));
        arrayList.add(jyb.m147494Y("试用优先看最受欢迎用户", new x20() { // from class: l.e4d
            @Override // p153l.x20
            public final void call() {
                y6d0.m214477p();
            }
        }));
        arrayList.add(jyb.m147494Y("试用优先看在线用户", new x20() { // from class: l.f4d
            @Override // p153l.x20
            public final void call() {
                y6d0.m214476o();
            }
        }));
        arrayList.add(jyb.m147494Y("试用未读", new x20() { // from class: l.g4d
            @Override // p153l.x20
            public final void call() {
                x6d0.m209475l0().m209486t0(b240Var.m101951T4(), "haveRead", "");
            }
        }));
        arrayList.add(jyb.m147494Y("设置可以弹出真实用户气泡", new x20() { // from class: l.h4d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60032g5();
            }
        }));
        arrayList.add(jyb.m147494Y("设置可以弹出在线气泡", new x20() { // from class: l.i4d
            @Override // p153l.x20
            public final void call() {
                x6d0.m209475l0().m209480n0(true);
            }
        }));
        arrayList.add(jyb.m147494Y("开始使用提示", new x20() { // from class: l.j4d
            @Override // p153l.x20
            public final void call() {
                y6d0.m214479r(b240Var.m101951T4(), "已优先看最受欢迎用户！");
            }
        }));
        arrayList.add(jyb.m147494Y("使用结束棋牌提示", new x20() { // from class: l.k4d
            @Override // p153l.x20
            public final void call() {
                y6d0.m214479r(b240Var.m101951T4(), "最受欢迎用户筛选试用完成！");
            }
        }));
        arrayList.add(jyb.m147494Y("结束弹窗真实头像", new x20() { // from class: l.l4d
            @Override // p153l.x20
            public final void call() {
                x6d0.m209475l0().m209485s0(b240Var.m101951T4(), VisitorSortType.realUser);
            }
        }));
        arrayList.add(jyb.m147494Y("结束弹窗优先推荐", new x20() { // from class: l.o4d
            @Override // p153l.x20
            public final void call() {
                x6d0.m209475l0().m209485s0(b240Var.m101951T4(), SuperlikeReason.popular);
            }
        }));
        arrayList.add(jyb.m147494Y("结束弹窗在线", new x20() { // from class: l.a4d
            @Override // p153l.x20
            public final void call() {
                x6d0.m209475l0().m209485s0(b240Var.m101951T4(), "online");
            }
        }));
        arrayList.add(jyb.m147494Y("结束弹窗已读", new x20() { // from class: l.c4d
            @Override // p153l.x20
            public final void call() {
                x6d0.m209475l0().m209485s0(b240Var.m101951T4(), "haveRead");
            }
        }));
        arrayList.add(jyb.m147494Y("气泡测试", new x20() { // from class: l.d4d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60344ua(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: z6 */
    public static /* synthetic */ void m60450z6() {
        vxd0 vxd0Var = new vxd0("full_card_5_btn_tran_x", 0);
        vxd0 vxd0Var2 = new vxd0("full_card_5_btn_tran_y", 0);
        vxd0 vxd0Var3 = new vxd0("full_card_btn_5_tran_count", 0);
        Boolean bool = Boolean.FALSE;
        jxd0 jxd0Var = new jxd0("full_card_clicked", bool);
        vxd0Var2.put(0);
        vxd0Var3.put(0);
        jxd0Var.put(bool);
        vxd0Var.put(-500);
    }

    /* JADX INFO: renamed from: z7 */
    public static /* synthetic */ void m60451z7(GreetingSummary greetingSummary) {
        greetingSummary.unseen = 0;
        greetingSummary.latestTime = pzi0.m174454o();
        greetingSummary.latestUserId = CoreModule.f18264c.f20381e0.m116600p9().f56859id;
        CoreModule.f18264c.f20420r0.f20765d0.m137019l(greetingSummary);
    }

    /* JADX INFO: renamed from: z8 */
    public static /* synthetic */ void m60452z8() {
        upm.f180293j = true;
        upm.f180290g = false;
        upm.f180291h = false;
    }

    /* JADX INFO: renamed from: z9 */
    public static /* synthetic */ void m60453z9(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        final ConversationCounterTypeSp conversationCounterTypeSp = ConversationCounterTypeSp.aEmojiIceBreakingNoReplyTime;
        Objects.requireNonNull(conversationCounterTypeSp);
        final x20 x20Var = new x20() { // from class: l.t4d
            @Override // p153l.x20
            public final void call() {
                conversationCounterTypeSp.clear();
            }
        };
        arrayList.add(jyb.m147494Y("（同一个对话一天内只展示一次）b 类型 = " + conversationCounterTypeSp, x20Var));
        final ConversationCounterTypeSp conversationCounterTypeSp2 = ConversationCounterTypeSp.aEmojiIceBreakingMessageTimeLimitTime;
        Objects.requireNonNull(conversationCounterTypeSp2);
        final x20 x20Var2 = new x20() { // from class: l.t4d
            @Override // p153l.x20
            public final void call() {
                conversationCounterTypeSp2.clear();
            }
        };
        arrayList.add(jyb.m147494Y("（同一个对话一天内只展示一次）c 类型 = " + conversationCounterTypeSp2, x20Var2));
        final x20 x20Var3 = new x20() { // from class: l.u4d
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.f20619M0.put(0L);
            }
        };
        StringBuilder sb = new StringBuilder("破冰表情 对方发过消息，但我方没有发过消息类型上次展示时间 (b类型) = ");
        SimpleDateFormat simpleDateFormat = pzi0.f154859f;
        sb.append(simpleDateFormat.format(CoreModule.f18264c.f20384f0.f20619M0.get()));
        arrayList.add(jyb.m147494Y(sb.toString(), x20Var3));
        final x20 x20Var4 = new x20() { // from class: l.v4d
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.f20622N0.put(0);
            }
        };
        arrayList.add(jyb.m147494Y("对方发过消息，但我方没有发过消息类型同一天展示次数 (b类型)  = " + CoreModule.f18264c.f20384f0.f20622N0.get(), x20Var4));
        final x20 x20Var5 = new x20() { // from class: l.w4d
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.f20625O0.put(0L);
            }
        };
        arrayList.add(jyb.m147494Y("破冰表情 无未读且最后一条消息距现在超过 3 天类型上次展示时间 (c类型) = " + simpleDateFormat.format(CoreModule.f18264c.f20384f0.f20625O0.get()), x20Var5));
        final x20 x20Var6 = new x20() { // from class: l.x4d
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.f20628P0.put(0);
            }
        };
        arrayList.add(jyb.m147494Y("破冰表情 无未读且最后一条消息距现在超过 3 天类型上次展示次数 (c类型) = " + CoreModule.f18264c.f20384f0.f20628P0.get(), x20Var6));
        arrayList.add(jyb.m147494Y("一键全部置空", new x20() { // from class: l.z4d
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60040gd(x20Var, x20Var2, x20Var3, x20Var4, x20Var5, x20Var6);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: zb */
    public static /* synthetic */ void m60455zb(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("消息红点脱敏实验一：" + CoreModule.f18264c.f20384f0.f20701n1.get(), new x20() { // from class: l.dnc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60190na();
            }
        }));
        arrayList.add(jyb.m147494Y("消息红点脱敏实验二：" + CoreModule.f18264c.f20384f0.f20704o1.get(), new x20() { // from class: l.enc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m59464Fg();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: zd */
    public static /* synthetic */ void m60457zd() {
        ConversationsList.m42342B2(true);
        ConversationsList.f25823u1.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: zg */
    public static /* synthetic */ void m60460zg() {
        jxd0 jxd0Var = f39107i;
        boolean zBooleanValue = jxd0Var.get().booleanValue();
        jxd0Var.put(Boolean.valueOf(!zBooleanValue));
        if (zBooleanValue) {
            m59467Fj();
            o1j0.m165651y("称赞Mock数据已删除");
        } else {
            m59725Rj();
            o1j0.m165651y("称赞Mock数据已插入");
        }
    }

    /* JADX INFO: renamed from: zh */
    public static /* synthetic */ void m60461zh(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        ybh0.C21557b c21557b = new ybh0.C21557b();
        c21557b.m215072a(1);
        c21557b.m215073b(CoreModule.m30930K().getUserById(CoreModule.f18264c.f20405m0.m32140q6()));
        c21557b.m215074c(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
    }

    /* JADX INFO: renamed from: zi */
    public static /* synthetic */ void m60462zi(GreetingSummary greetingSummary) {
        greetingSummary.unseen = 100;
        greetingSummary.latestTime = pzi0.m174454o();
        greetingSummary.latestUserId = CoreModule.f18264c.f20381e0.m116600p9().f56859id;
        CoreModule.f18264c.f20420r0.f20765d0.m137019l(greetingSummary);
    }

    /* JADX INFO: renamed from: zj */
    public static void m60463zj(final ArrayList<pf60<String, x20>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        arrayList.add(jyb.m147494Y("我的Tab兼容V2", new x20() { // from class: l.stc
            @Override // p153l.x20
            public final void call() {
                DebugUtil.m60396wi(arrayList, viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
        }));
    }

    /* JADX INFO: renamed from: zk */
    public static void m60464zk(final Act act) {
        w1e.m204400d(act).m204419D(10).m204430r("输入插入Userid").m204421F(new y20() { // from class: l.wsc
            @Override // p153l.y20
            public final void call(Object obj) {
                Act act2 = act;
                l51.m152888H(act2, new Runnable() { // from class: l.e1d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m60243pj(str, act2);
                    }
                }, 1000L);
            }
        }).m204426n().show();
    }
}
