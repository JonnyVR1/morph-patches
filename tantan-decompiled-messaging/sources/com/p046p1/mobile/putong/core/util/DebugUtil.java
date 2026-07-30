package com.p046p1.mobile.putong.core.util;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.android.p048ui.poplevel.C4371a;
import com.p046p1.mobile.android.p048ui.pushbubble.SimplePushBubble;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.api.C4736e;
import com.p046p1.mobile.putong.core.api.C4758x;
import com.p046p1.mobile.putong.core.api.C4759y;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.ActionData;
import com.p046p1.mobile.putong.core.data.ActionToast;
import com.p046p1.mobile.putong.core.data.ActionToastStyle;
import com.p046p1.mobile.putong.core.data.ActionToastStyleButton;
import com.p046p1.mobile.putong.core.data.ActionToastStyleIcons;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.AppealInfo;
import com.p046p1.mobile.putong.core.data.BarLoverplaces;
import com.p046p1.mobile.putong.core.data.CardOption;
import com.p046p1.mobile.putong.core.data.ChatGiftInfo;
import com.p046p1.mobile.putong.core.data.ChatMM;
import com.p046p1.mobile.putong.core.data.ChatPartnerText;
import com.p046p1.mobile.putong.core.data.ChatPartners;
import com.p046p1.mobile.putong.core.data.CityCBanner;
import com.p046p1.mobile.putong.core.data.CityCData;
import com.p046p1.mobile.putong.core.data.ConvAdditionalSwiper;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationType;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.FakeGuideData;
import com.p046p1.mobile.putong.core.data.FourSelectOneAdCardData;
import com.p046p1.mobile.putong.core.data.GreetingSummary;
import com.p046p1.mobile.putong.core.data.GroupInvitation;
import com.p046p1.mobile.putong.core.data.Literatures;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.core.data.MatchSuccessAnimTime;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageAdditionalData;
import com.p046p1.mobile.putong.core.data.MessageExtData;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.data.PopGuide;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PrivilegeDetail;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.Questionnaire;
import com.p046p1.mobile.putong.core.data.QuestionnaireScene;
import com.p046p1.mobile.putong.core.data.QuestionnaireStrategy;
import com.p046p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p046p1.mobile.putong.core.data.ReminderAction;
import com.p046p1.mobile.putong.core.data.SalvagePopUser;
import com.p046p1.mobile.putong.core.data.SalvagePopUserType;
import com.p046p1.mobile.putong.core.data.SeeBlindBoxEnvelope;
import com.p046p1.mobile.putong.core.data.StateData;
import com.p046p1.mobile.putong.core.data.SuggestedComplimentItem;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.SystemReminder;
import com.p046p1.mobile.putong.core.data.UserIdType;
import com.p046p1.mobile.putong.core.data.UserWithRelationShip;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.data.VisitorSortType;
import com.p046p1.mobile.putong.core.newui.appeal.AppealProgressAct;
import com.p046p1.mobile.putong.core.newui.fake.C7846b;
import com.p046p1.mobile.putong.core.newui.greet.DynamicGreetListAct;
import com.p046p1.mobile.putong.core.newui.home.C7943c;
import com.p046p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p046p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC7866b;
import com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7909m1;
import com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7926u;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.holder.HomeCardExpandedType;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.transform.OldInfoTransNewAct;
import com.p046p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p046p1.mobile.putong.core.newui.icebreak.DialogC8068a;
import com.p046p1.mobile.putong.core.newui.intltribe.IntlTribeSwipeAct;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.main.NewMainViewModel;
import com.p046p1.mobile.putong.core.newui.messages.C8140a;
import com.p046p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p046p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p046p1.mobile.putong.core.newui.newuserbatchgreet.NewUserBatchGreetAct;
import com.p046p1.mobile.putong.core.newui.profile.dialog.MediaRecorderFrag;
import com.p046p1.mobile.putong.core.newui.profile.expandprofilelike.ExpandProfileLikeAct;
import com.p046p1.mobile.putong.core.newui.profile.understandme.BusinessWebViewAct;
import com.p046p1.mobile.putong.core.newui.supreme.SupremeCustomAct;
import com.p046p1.mobile.putong.core.newui.voicecall.VoiceCallAct;
import com.p046p1.mobile.putong.core.p053ui.campus.StudentInfoAct;
import com.p046p1.mobile.putong.core.p053ui.debug.LabelDemoAct;
import com.p046p1.mobile.putong.core.p053ui.debug.PopDebugLayout;
import com.p046p1.mobile.putong.core.p053ui.diamond.TabUniteManager;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.core.p053ui.greet.C8360d;
import com.p046p1.mobile.putong.core.p053ui.growth.agealert.birthdayverify.BirthdayVerifyAct;
import com.p046p1.mobile.putong.core.p053ui.intloperation.campingactivity.C8382b;
import com.p046p1.mobile.putong.core.p053ui.likedusers.LikedUsersAct;
import com.p046p1.mobile.putong.core.p053ui.likedusers.tablayout.NewMyLikedUsersAct;
import com.p046p1.mobile.putong.core.p053ui.likeminded.C8411a;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.memoji.MemojiBuzzAct;
import com.p046p1.mobile.putong.core.p053ui.marry.audit.MarryInfoAuditStatusAct;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.edit.MarryProfileEditAct;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p046p1.mobile.putong.core.p053ui.marry.status.MarryStatusSetAct;
import com.p046p1.mobile.putong.core.p053ui.match.C8455a;
import com.p046p1.mobile.putong.core.p053ui.match.C8456b;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.core.p053ui.messages.C8524b;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchManager;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchMatchUser;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchPushUser;
import com.p046p1.mobile.putong.core.p053ui.p054ad.tencent.debug.DebugSplashAdAct;
import com.p046p1.mobile.putong.core.p053ui.p054ad.tencent.debug.DebugSplashTTAdAct;
import com.p046p1.mobile.putong.core.p053ui.p055gp.C8346a;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.core.p053ui.pricerecall.PriceRecallGetSurprise2Dialog;
import com.p046p1.mobile.putong.core.p053ui.profile.CityTopGreetDialog;
import com.p046p1.mobile.putong.core.p053ui.profile.TagGuidePicAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.core.p053ui.promotion.PurchasePromotionAct;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8758a;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8761b;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.C8778c;
import com.p046p1.mobile.putong.core.p053ui.result.PurchaseResultAct;
import com.p046p1.mobile.putong.core.p053ui.seepop.NewLikeView;
import com.p046p1.mobile.putong.core.p053ui.svip.guide.SVIPIntlGuideAct;
import com.p046p1.mobile.putong.core.p053ui.verification.national.IntroductionAct;
import com.p046p1.mobile.putong.core.p053ui.verification.national.NationalIdAuthAct;
import com.p046p1.mobile.putong.core.p053ui.verification.remind.hold.AvatarForceChangeAct;
import com.p046p1.mobile.putong.core.p053ui.verification.remind.result.AvatarResultAct;
import com.p046p1.mobile.putong.core.p053ui.vip.VipAct;
import com.p046p1.mobile.putong.core.p053ui.vip.VipLocationHistoryAct;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.PicksHelper;
import com.p046p1.mobile.putong.core.util.DebugUtil;
import com.p046p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p046p1.mobile.putong.core.util.verificationoptimization.VerificationAct;
import com.p046p1.mobile.putong.data.ComDiamond;
import com.p046p1.mobile.putong.data.Contact;
import com.p046p1.mobile.putong.data.ConversationStatus;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CounterLikeLimit;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.IdVerificationResult;
import com.p046p1.mobile.putong.data.IntlPurpose;
import com.p046p1.mobile.putong.data.LinkAction;
import com.p046p1.mobile.putong.data.LiveState;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Membership;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.OMSAdCardInfo;
import com.p046p1.mobile.putong.data.OMSSwipeMoment;
import com.p046p1.mobile.putong.data.OpenSdkCodeAuth;
import com.p046p1.mobile.putong.data.Passby;
import com.p046p1.mobile.putong.data.PicVerification;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.ProfileCompletion;
import com.p046p1.mobile.putong.data.ProfileLike;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipExtensions;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.Studies;
import com.p046p1.mobile.putong.data.SuperlikeReason;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserLiveLabel;
import com.p046p1.mobile.putong.data.UserLiveState;
import com.p046p1.mobile.putong.data.UssTags;
import com.p046p1.mobile.putong.data.VerificationNetworkData;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.dbcenter.parse.JsonParseHelper;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.p065ui.webview.AccessTokenWebViewAct;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import com.p046p1.mobile.putong.wxapi.WXEntryActivity;
import com.p069ss.bytertc.engine.BuildConfig;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import com.tencent.connect.common.Constants;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.mmkv.MMKV;
import com.tencent.p101mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.p101mm.opensdk.openapi.IWXAPI;
import com.tencent.p101mm.opensdk.openapi.WXAPIFactory;
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
import p133rx.C22306c;
import p133rx.Notification;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VIcon;
import p147v.VText;
import p149l.a5x;
import p149l.a6h0;
import p149l.aa40;
import p149l.aag0;
import p149l.abi;
import p149l.ae70;
import p149l.ahl0;
import p149l.ark;
import p149l.b4h0;
import p149l.bo5;
import p149l.bzv;
import p149l.c30;
import p149l.c4g0;
import p149l.cpk0;
import p149l.d30;
import p149l.dej;
import p149l.e30;
import p149l.e51;
import p149l.e9n;
import p149l.eqh0;
import p149l.ew40;
import p149l.f30;
import p149l.f6c0;
import p149l.f7e0;
import p149l.f8c;
import p149l.f9p;
import p149l.fy80;
import p149l.g30;
import p149l.g4h0;
import p149l.g53;
import p149l.gij0;
import p149l.gxf;
import p149l.h7j;
import p149l.hdb0;
import p149l.hpd0;
import p149l.hpk0;
import p149l.i0e;
import p149l.ic50;
import p149l.itk;
import p149l.iwf;
import p149l.j6b0;
import p149l.j760;
import p149l.jj4;
import p149l.jo0;
import p149l.km80;
import p149l.lra0;
import p149l.lsi0;
import p149l.lva;
import p149l.m45;
import p149l.m6h0;
import p149l.m7e0;
import p149l.mah0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.myc0;
import p149l.myf;
import p149l.n2l;
import p149l.na8;
import p149l.nt30;
import p149l.o45;
import p149l.o8m;
import p149l.ok3;
import p149l.osi0;
import p149l.oyd;
import p149l.p2b0;
import p149l.pa30;
import p149l.pmp0;
import p149l.psm;
import p149l.puf0;
import p149l.puk0;
import p149l.q3h0;
import p149l.q860;
import p149l.q89;
import p149l.qib0;
import p149l.qqi0;
import p149l.qsd0;
import p149l.qth0;
import p149l.qug0;
import p149l.r9m;
import p149l.rnl0;
import p149l.roj0;
import p149l.rxg0;
import p149l.s8b0;
import p149l.sa40;
import p149l.sjp;
import p149l.snm;
import p149l.swk0;
import p149l.t100;
import p149l.tbk;
import p149l.tpd0;
import p149l.tvf;
import p149l.u0n;
import p149l.u4c0;
import p149l.uc80;
import p149l.ud2;
import p149l.uld0;
import p149l.upa;
import p149l.uq40;
import p149l.uqd0;
import p149l.ura;
import p149l.uyc0;
import p149l.uz4;
import p149l.v0x;
import p149l.v9b;
import p149l.vqd0;
import p149l.vwb;
import p149l.vyc0;
import p149l.w0c0;
import p149l.w29;
import p149l.w6p;
import p149l.w9j;
import p149l.wc80;
import p149l.wf6;
import p149l.wn90;
import p149l.x2c0;
import p149l.xaj0;
import p149l.xdl0;
import p149l.xdx;
import p149l.xe40;
import p149l.xjc0;
import p149l.xzc0;
import p149l.y1j;
import p149l.ybx;
import p149l.zar;
import p149l.zl80;
import p149l.zpd0;
import p149l.zvf0;
import p149l.zxz;

/* JADX INFO: loaded from: classes10.dex */
public class DebugUtil {

    /* JADX INFO: renamed from: a */
    public static final uqd0 f38251a = new uqd0("mt_url", "");

    /* JADX INFO: renamed from: b */
    public static final hpd0 f38252b;

    /* JADX INFO: renamed from: c */
    public static final hpd0 f38253c;

    /* JADX INFO: renamed from: d */
    public static final hpd0 f38254d;

    /* JADX INFO: renamed from: e */
    public static final tpd0 f38255e;

    /* JADX INFO: renamed from: f */
    public static boolean f38256f;

    /* JADX INFO: renamed from: g */
    public static final tpd0 f38257g;

    /* JADX INFO: renamed from: h */
    public static final hpd0 f38258h;

    /* JADX INFO: renamed from: i */
    public static final hpd0 f38259i;

    /* JADX INFO: renamed from: j */
    public static final String[][] f38260j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$a */
    public class C9057a implements w9j<Conversation, Conversation> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$a$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Conversation f38261a;

            public a(Conversation conversation) {
                this.f38261a = conversation;
            }

            @Override // p149l.d30
            public void call() {
                Conversation conversationMo223809clone = this.f38261a.mo223809clone();
                String str = conversationMo223809clone.f56011id;
                ChatMM chatMM = conversationMo223809clone.additional.chatMM;
                chatMM.pinChatSuggested = true;
                chatMM.expireTime = mqi0.m155944o() + 120000;
                CoreModule.f17545c.f19642f0.m33050mq(conversationMo223809clone);
            }
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Conversation call(Conversation conversation) {
            CoreModule.f17545c.f19609U.m109085a(new a(conversation));
            return null;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$a0 */
    public class C9058a0 implements e30<User> {
        @Override // p149l.e30
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
    public class C9059a1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38263a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38264b;

        public C9059a1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38263a = arrayList;
            this.f38264b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m59283a() {
            hpd0 hpd0Var = CoreModule.f17545c.f19642f0.f19968q1;
            hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        }

        @Override // p149l.d30
        public void call() {
            this.f38263a.clear();
            this.f38263a.add(vwb.m200311Y("心动信号女性路经变短 开关：".concat(CoreModule.f17545c.f19642f0.f19968q1.get().booleanValue() ? "true" : "false"), new d30() { // from class: l.jdd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9059a1.m59283a();
                }
            }));
            this.f38264b.act().showDebugMenu(this.f38263a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$a2 */
    public class RunnableC9060a2 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ v0x f38265a;

        public RunnableC9060a2(v0x v0xVar) {
            this.f38265a = v0xVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38265a.show();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$b */
    public class C9061b implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38266a;

        public C9061b(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38266a = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m59284a(int i, int i2, Intent intent) {
            CoreModule.m29935P().m94651a().mo33500fl();
            return false;
        }

        @Override // p149l.d30
        public void call() {
            if (wn90.m204602F().f187269a == null) {
                ura.m195053e().m195057d().mo33944xc(CoreModule.f17545c.f19639e0.m169520na().mo223809clone());
            }
            Intent intentM51506X1 = ProfileInfoLoopEditAct.m51506X1(this.f38266a.act(), LoopFragmentFactory.LoopCreateEntryType.ENTRY_MOMENT_GAME, LoopInputType.BIRTHDAY, ura.m195053e().m195057d().mo33757Uc());
            intentM51506X1.putExtra("loop_edit_patch_flag", true);
            ((Act) xdl0.m208326D(this.f38266a.getContext())).startActivityForResult(intentM51506X1, new C4317a.a() { // from class: l.wbd
                @Override // com.p046p1.mobile.android.app.C4317a.a
                /* JADX INFO: renamed from: a */
                public final boolean mo20401a(int i, int i2, Intent intent) {
                    return DebugUtil.C9061b.m59284a(i, i2, intent);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$b0 */
    public class C9062b0 implements e30<User> {
        @Override // p149l.e30
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
    public class C9063b1 implements e30<Throwable> {
        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$b2 */
    public class RunnableC9064b2 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            CoreModule.f17545c.f19639e0.f149377g4.m132487l("");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$c */
    public class C9065c implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38267a;

        public C9065c(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38267a = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.d30
        public void call() {
            this.f38267a.act().m39801Z5().m40016r0(TabName.Me, NewMainViewModel.IconDotType.warning);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$c0 */
    public class C9066c0 implements e30<User> {
        @Override // p149l.e30
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
    public class C9067c1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38268a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38269b;

        public C9067c1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38268a = arrayList;
            this.f38269b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m59288a() {
            hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149432n3;
            hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        }

        @Override // p149l.d30
        public void call() {
            this.f38268a.clear();
            this.f38268a.add(vwb.m200311Y("好友上线提醒代发端内承接改版 开关：".concat(CoreModule.f17545c.f19639e0.f149432n3.get().booleanValue() ? "true" : "false"), new d30() { // from class: l.kdd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9067c1.m59288a();
                }
            }));
            this.f38269b.act().showDebugMenu(this.f38268a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$c2 */
    public class C9068c2 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38270a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38271b;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$c2$a */
        public class a implements d30 {
            public a() {
            }

            @Override // p149l.d30
            public void call() {
                CoreModule.f17545c.f19639e0.f149469s4.clear();
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$c2$b */
        public class b implements d30 {
            public b() {
            }

            @Override // p149l.d30
            public void call() {
                CoreModule.f17545c.f19639e0.f149476t4.clear();
                CoreModule.f17545c.f19639e0.f149483u4.clear();
                CoreModule.f17545c.f19639e0.f149490v4.clear();
            }
        }

        public C9068c2(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38270a = arrayList;
            this.f38271b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m59289a(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            ChatPartners chatPartnersNew_ = ChatPartners.new_();
            for (int i = 1; i < 20; i++) {
                ChatPartnerText chatPartnerTextNew_ = ChatPartnerText.new_();
                chatPartnerTextNew_.value = "这是一条文案，普通的文案" + String.valueOf(i);
                chatPartnersNew_.texts.add(chatPartnerTextNew_);
            }
            for (int i2 = 0; i2 < 9; i2++) {
                chatPartnersNew_.users.add(CoreModule.m29932K().me_());
            }
            new uz4(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), chatPartnersNew_).show();
        }

        @Override // p149l.d30
        public void call() {
            this.f38270a.clear();
            ArrayList arrayList = this.f38270a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b = this.f38271b;
            arrayList.add(vwb.m200311Y("弹出底部半屏弹窗", new d30() { // from class: l.ggd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9068c2.m59289a(viewTreeObserverOnGlobalLayoutListenerC7866b);
                }
            }));
            this.f38270a.add(vwb.m200311Y("清楚客户端1小时请求频控", new a()));
            this.f38270a.add(vwb.m200311Y("清楚半屏弹窗展示频控", new b()));
            this.f38271b.act().showDebugMenu(this.f38270a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$d */
    public class C9069d implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38274a;

        public C9069d(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38274a = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.d30
        public void call() {
            this.f38274a.act().m39801Z5().m40016r0(TabName.Me, NewMainViewModel.IconDotType.diamond);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$d0 */
    public class C9070d0 implements e30<Boolean> {
        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$d1 */
    public class C9071d1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38275a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38276b;

        public C9071d1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38275a = arrayList;
            this.f38276b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.d30
        public void call() {
            this.f38275a.clear();
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
            qug0.m176610g().m176617k(this.f38276b, actionDataNew_);
            this.f38276b.act().showDebugMenu(this.f38275a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$d2 */
    public class RunnableC9072d2 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.hgd
                @Override // p149l.d30
                public final void call() {
                    CoreModule.f17553k.f91950m.delete("fake_conversation_local_summary_marriage_conversation");
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$e */
    public class C9073e implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38277a;

        public C9073e(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38277a = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.d30
        public void call() {
            this.f38277a.act().m39801Z5().m40016r0(TabName.Me, NewMainViewModel.IconDotType.edit_profile);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$e0 */
    public class C9074e0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38278a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38279b;

        public C9074e0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38278a = arrayList;
            this.f38279b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m59292a() {
            q89 q89Var = CoreModule.f17545c.f19672p0;
            q89Var.f153144V = !q89Var.f153144V;
        }

        @Override // p149l.d30
        public void call() {
            this.f38278a.clear();
            this.f38278a.add(vwb.m200311Y("toggleUltra模式，当前：" + CoreModule.f17545c.f19672p0.f153144V, new d30() { // from class: l.acd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9074e0.m59292a();
                }
            }));
            ArrayList arrayList = this.f38278a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b = this.f38279b;
            arrayList.add(vwb.m200311Y(LinkAction.deeplink, new d30() { // from class: l.bcd
                @Override // p149l.d30
                public final void call() {
                    j2e0.m139446m(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), Uri.parse("tantan://intlPurchase/premium?skuDuration=3m&autoPay=true"));
                }
            }));
            this.f38279b.act().showDebugMenu(this.f38278a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$e1 */
    public class C9075e1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38280a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38281b;

        public C9075e1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38280a = arrayList;
            this.f38281b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.d30
        public void call() {
            this.f38280a.clear();
            this.f38280a.add(vwb.m200311Y("超级喜欢pup", new d30() { // from class: l.ldd
                @Override // p149l.d30
                public final void call() {
                    rxg0.m181572j().f161464i.m132487l(Boolean.TRUE);
                }
            }));
            this.f38280a.add(vwb.m200311Y("TA已认证头像为本人哦~ show", new d30() { // from class: l.mdd
                @Override // p149l.d30
                public final void call() {
                    CoreModule.f17545c.f19639e0.f149453q2.put(Boolean.FALSE);
                }
            }));
            this.f38281b.act().showDebugMenu(this.f38280a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$e2 */
    public class C9076e2 implements d30 {
        @Override // p149l.d30
        public void call() {
            CoreModule.f17545c.f19639e0.f149463r5.clear();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$f */
    public class C9077f implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38282a;

        public C9077f(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38282a = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.d30
        public void call() {
            this.f38282a.act().startActivity(CoreModule.m29932K().mo30840yp(this.f38282a.getContext(), CoreModule.f17545c.f19639e0.m169527p9().f56011id, "from_questions_answers", false, true, false, RelationshipStatus.get("unknown_"), 273, false, true, false, ReminderAction.photo));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$f0 */
    public class C9078f0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38283a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38284b;

        public C9078f0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38283a = arrayList;
            this.f38284b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.d30
        public void call() {
            this.f38283a.clear();
            this.f38283a.add(vwb.m200311Y("清除气泡频控", new d30() { // from class: l.ccd
                @Override // p149l.d30
                public final void call() {
                    CoreModule.f17545c.f19639e0.f149195I6.clear();
                }
            }));
            this.f38284b.act().showDebugMenu(this.f38283a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$f1 */
    public class C9079f1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38285a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38286b;

        public C9079f1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38285a = arrayList;
            this.f38286b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.d30
        public void call() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$f2 */
    public class C9080f2 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38287a;

        public C9080f2(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38287a = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.d30
        public void call() {
            FakeGuideData fakeGuideDataNew_ = FakeGuideData.new_();
            fakeGuideDataNew_.changeAvatar = true;
            fakeGuideDataNew_.type = "mainAvatar";
            fakeGuideDataNew_.identifier = CoreModule.f17545c.f19639e0.m169527p9().picture(0).cover().url;
            myf.m157042V(this.f38287a.act(), fakeGuideDataNew_);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$g */
    public class C9081g implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38288a;

        public C9081g(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38288a = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.d30
        public void call() {
            wn90.m204602F().m204661i0(this.f38288a.act());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$g0 */
    public class C9082g0 implements w9j<q860<Conversation>, Conversation> {
        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Conversation call(q860<Conversation> q860Var) {
            for (Conversation conversation : q860Var.f153135a) {
                if (conversation._id > 0 && TextUtils.equals(conversation.convType, "default") && TEnum.equals(conversation.status, "default")) {
                    return conversation;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$g1 */
    public class C9083g1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38289a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38290b;

        public C9083g1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38289a = arrayList;
            this.f38290b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m59298a() {
            DebugUtil.f38255e.put(-1);
            DebugUtil.f38254d.put(Boolean.FALSE);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m59299b() {
            hpd0 hpd0Var = DebugUtil.f38254d;
            hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        }

        @Override // p149l.d30
        public void call() {
            this.f38289a.clear();
            this.f38289a.add(vwb.m200311Y("开启检测" + DebugUtil.f38254d.get(), new d30() { // from class: l.ndd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9083g1.m59299b();
                }
            }));
            this.f38289a.add(vwb.m200311Y("立即检测：" + DebugUtil.f38255e.get(), new d30() { // from class: l.odd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.f38255e.put(0);
                }
            }));
            this.f38289a.add(vwb.m200311Y("重置检测逻辑：", new d30() { // from class: l.pdd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9083g1.m59298a();
                }
            }));
            this.f38290b.act().showDebugMenu(this.f38289a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$g2 */
    public class C9084g2 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38291a;

        public C9084g2(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38291a = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.d30
        public void call() {
            FakeGuideData fakeGuideDataNew_ = FakeGuideData.new_();
            fakeGuideDataNew_.changeAvatar = true;
            fakeGuideDataNew_.type = "otherAvatar";
            fakeGuideDataNew_.identifier = CoreModule.f17545c.f19639e0.m169527p9().picture(1).url;
            myf.m157042V(this.f38291a.act(), fakeGuideDataNew_);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$h */
    public class C9085h implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38292a;

        public C9085h(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38292a = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.d30
        public void call() {
            qth0.m176454M(this.f38292a.act(), true, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$h0 */
    public class C9086h0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38293a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38294b;

        public C9086h0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38293a = arrayList;
            this.f38294b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m59301a(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
            SalvagePopUser salvagePopUserNew_ = SalvagePopUser.new_();
            salvagePopUserNew_.salvagePopUserType = SalvagePopUserType.get(SalvagePopUserType.rightSwipe);
            salvagePopUserNew_.user = userM169520na;
            SalvagePopUser salvagePopUserNew_2 = SalvagePopUser.new_();
            salvagePopUserNew_2.salvagePopUserType = SalvagePopUserType.get("see");
            salvagePopUserNew_2.user = userM169520na;
            ArrayList arrayList = new ArrayList();
            arrayList.add(salvagePopUserNew_);
            arrayList.add(salvagePopUserNew_);
            arrayList.add(salvagePopUserNew_2);
            arrayList.add(salvagePopUserNew_2);
            sjp.INSTANCE.m184521i(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), true, arrayList, null, null, null);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m59302b() {
            CoreModule.f17545c.f19572H2.f168996R.clear();
            CoreModule.f17545c.f19572H2.f168997S.clear();
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m59303c(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
            SalvagePopUser salvagePopUserNew_ = SalvagePopUser.new_();
            salvagePopUserNew_.salvagePopUserType = SalvagePopUserType.get(SalvagePopUserType.rightSwipe);
            salvagePopUserNew_.user = userM169520na;
            ArrayList arrayList = new ArrayList();
            arrayList.add(salvagePopUserNew_);
            sjp.INSTANCE.m184521i(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), false, arrayList, null, null, null);
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m59304d(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
            SalvagePopUser salvagePopUserNew_ = SalvagePopUser.new_();
            salvagePopUserNew_.salvagePopUserType = SalvagePopUserType.get(SalvagePopUserType.rightSwipe);
            salvagePopUserNew_.user = userM169520na;
            SalvagePopUser salvagePopUserNew_2 = SalvagePopUser.new_();
            salvagePopUserNew_2.salvagePopUserType = SalvagePopUserType.get("see");
            salvagePopUserNew_2.user = userM169520na;
            ArrayList arrayList = new ArrayList();
            arrayList.add(salvagePopUserNew_);
            arrayList.add(salvagePopUserNew_);
            arrayList.add(salvagePopUserNew_2);
            arrayList.add(salvagePopUserNew_2);
            f9p.INSTANCE.m120106i(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), false, arrayList, null, null, null, null);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m59305e(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
            SalvagePopUser salvagePopUserNew_ = SalvagePopUser.new_();
            salvagePopUserNew_.salvagePopUserType = SalvagePopUserType.get(SalvagePopUserType.rightSwipe);
            salvagePopUserNew_.user = userM169520na;
            SalvagePopUser salvagePopUserNew_2 = SalvagePopUser.new_();
            salvagePopUserNew_2.salvagePopUserType = SalvagePopUserType.get("see");
            salvagePopUserNew_2.user = userM169520na;
            ArrayList arrayList = new ArrayList();
            arrayList.add(salvagePopUserNew_);
            arrayList.add(salvagePopUserNew_);
            arrayList.add(salvagePopUserNew_);
            arrayList.add(salvagePopUserNew_2);
            arrayList.add(salvagePopUserNew_2);
            arrayList.add(salvagePopUserNew_2);
            f9p.INSTANCE.m120106i(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), true, arrayList, null, null, null, null);
        }

        @Override // p149l.d30
        public void call() {
            this.f38293a.clear();
            this.f38293a.add(vwb.m200311Y("国际化 会员挽回弹窗缓存清空", new d30() { // from class: l.dcd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9086h0.m59302b();
                }
            }));
            ArrayList arrayList = this.f38293a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b = this.f38294b;
            arrayList.add(vwb.m200311Y("premium 挽回弹窗", new d30() { // from class: l.ecd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9086h0.m59305e(viewTreeObserverOnGlobalLayoutListenerC7866b);
                }
            }));
            ArrayList arrayList2 = this.f38293a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = this.f38294b;
            arrayList2.add(vwb.m200311Y("premium 挽回弹窗大", new d30() { // from class: l.fcd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9086h0.m59304d(viewTreeObserverOnGlobalLayoutListenerC7866b2);
                }
            }));
            ArrayList arrayList3 = this.f38293a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b3 = this.f38294b;
            arrayList3.add(vwb.m200311Y("ultra 挽回弹窗小", new d30() { // from class: l.gcd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9086h0.m59301a(viewTreeObserverOnGlobalLayoutListenerC7866b3);
                }
            }));
            ArrayList arrayList4 = this.f38293a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b4 = this.f38294b;
            arrayList4.add(vwb.m200311Y("ultra 挽回弹窗大", new d30() { // from class: l.hcd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9086h0.m59303c(viewTreeObserverOnGlobalLayoutListenerC7866b4);
                }
            }));
            this.f38294b.act().showDebugMenu(this.f38293a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$h1 */
    public class C9087h1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38295a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38296b;

        public C9087h1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38295a = arrayList;
            this.f38296b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.d30
        public void call() {
            this.f38295a.clear();
            this.f38295a.add(vwb.m200311Y("清除聊天助手相关本地缓存", new d30() { // from class: l.qdd
                @Override // p149l.d30
                public final void call() {
                    CoreModule.f17545c.f19611U1.f75277R.clear();
                }
            }));
            this.f38296b.act().showDebugMenu(this.f38295a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$h2 */
    public class C9088h2 implements d30 {
        @Override // p149l.d30
        public void call() {
            hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149354d5;
            hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$i */
    public class C9089i implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38297a;

        public C9089i(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38297a = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.d30
        public void call() {
            this.f38297a.act().startActivity(TagGuidePicAct.m50772Y1(this.f38297a.act(), true, "from_upload_pic", "from_complete_equity_guide_card"));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$i0 */
    public class C9090i0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38298a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38299b;

        public C9090i0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38298a = arrayList;
            this.f38299b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.d30
        public void call() {
            this.f38298a.clear();
            ArrayList arrayList = this.f38298a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b = this.f38299b;
            arrayList.add(vwb.m200311Y("支付 vip 升级 svip", new d30() { // from class: l.icd
                @Override // p149l.d30
                public final void call() {
                    ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                    new hqo(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE).m132475p(aqo.m98316h(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), viewTreeObserverOnGlobalLayoutListenerC7866b2.act() != null ? viewTreeObserverOnGlobalLayoutListenerC7866b2.act().iap().m148933i() : null), false, "test_high_vip_upgrade_to_premium_1mo");
                }
            }));
            ArrayList arrayList2 = this.f38298a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = this.f38299b;
            arrayList2.add(vwb.m200311Y("svip 升级购买时长选择弹窗", new d30() { // from class: l.jcd
                @Override // p149l.d30
                public final void call() {
                    new bkp.C15900f(viewTreeObserverOnGlobalLayoutListenerC7866b2.act()).m102492c("p_knowmyself_purchase,e_knowmyself_test,click").m102495f(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE).m102496g();
                }
            }));
            ArrayList arrayList3 = this.f38298a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b3 = this.f38299b;
            arrayList3.add(vwb.m200311Y("svip 订阅页升级购买时长选择弹窗", new d30() { // from class: l.kcd
                @Override // p149l.d30
                public final void call() {
                    new bkp.C15900f(viewTreeObserverOnGlobalLayoutListenerC7866b3.act()).m102492c("p_knowmyself_purchase,e_knowmyself_test,click").m102495f(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE).m102493d(true).m102496g();
                }
            }));
            ArrayList arrayList4 = this.f38298a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b4 = this.f38299b;
            arrayList4.add(vwb.m200311Y("ultra 升级购买时长选择弹窗", new d30() { // from class: l.lcd
                @Override // p149l.d30
                public final void call() {
                    new bkp.C15900f(viewTreeObserverOnGlobalLayoutListenerC7866b4.act()).m102492c("p_knowmyself_purchase,e_knowmyself_test,click").m102495f(PurchaseType.TYPE_ULTRA_PREMIUM).m102496g();
                }
            }));
            ArrayList arrayList5 = this.f38298a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b5 = this.f38299b;
            arrayList5.add(vwb.m200311Y("ultra 订阅页升级购买时长选择弹窗", new d30() { // from class: l.mcd
                @Override // p149l.d30
                public final void call() {
                    new bkp.C15900f(viewTreeObserverOnGlobalLayoutListenerC7866b5.act()).m102492c("p_knowmyself_purchase,e_knowmyself_test,click").m102495f(PurchaseType.TYPE_ULTRA_PREMIUM).m102493d(true).m102496g();
                }
            }));
            this.f38299b.act().showDebugMenu(this.f38298a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$i1 */
    public class C9091i1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38300a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38301b;

        public C9091i1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38300a = arrayList;
            this.f38301b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m59312a(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            CoreModule.f17545c.f19614V1.f83480S = new ArrayList();
            for (int i = 0; i < 9; i++) {
                C4732c c4732c = CoreModule.f17545c;
                c4732c.f19614V1.f83480S.add(c4732c.f19639e0.m169527p9());
            }
            xe40.m208509f().m208514j(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), CoreModule.f17545c.f19614V1.f83480S);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m59313b(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            CoreModule.f17545c.f19614V1.f83479R = new ArrayList();
            List<CoreSuggested.UserInfo> list = CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded;
            UserIdType userIdTypeNew_ = UserIdType.new_();
            userIdTypeNew_.userId = list.get(0).f19472id;
            CoreModule.f17545c.f19614V1.f83479R.add(userIdTypeNew_);
            if (viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2().mo38809d() instanceof NewNewProfileCard) {
                NewNewProfileCard newNewProfileCard = (NewNewProfileCard) viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2().mo38809d();
                newNewProfileCard.f21718M2 = false;
                newNewProfileCard.m36821H3();
            }
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m59314c() {
            hpd0 hpd0Var = CoreModule.f17545c.f19614V1.f83483V;
            hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m59315d() {
            hpd0 hpd0Var = CoreModule.f17545c.f19614V1.f83482U;
            hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m59317f() {
            CoreModule.f17545c.f19614V1.f83480S = new ArrayList();
            for (int i = 0; i < 9; i++) {
                C4732c c4732c = CoreModule.f17545c;
                c4732c.f19614V1.f83480S.add(c4732c.f19639e0.m169527p9());
            }
            ConversationsList.f25080t1.m132487l(roj0.f160388a);
        }

        @Override // p149l.d30
        public void call() {
            this.f38300a.clear();
            this.f38300a.add(vwb.m200311Y("实验1开关: " + CoreModule.f17545c.f19614V1.f83482U.get(), new d30() { // from class: l.rdd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9091i1.m59315d();
                }
            }));
            this.f38300a.add(vwb.m200311Y("实验2开关: " + CoreModule.f17545c.f19614V1.f83483V.get(), new d30() { // from class: l.sdd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9091i1.m59314c();
                }
            }));
            this.f38300a.add(vwb.m200311Y("模拟新用户", new d30() { // from class: l.tdd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9091i1.m59317f();
                }
            }));
            ArrayList arrayList = this.f38300a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b = this.f38301b;
            arrayList.add(vwb.m200311Y("划卡迎新bubble", new d30() { // from class: l.udd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9091i1.m59312a(viewTreeObserverOnGlobalLayoutListenerC7866b);
                }
            }));
            this.f38300a.add(vwb.m200311Y("清除迎新相关本地数据", new d30() { // from class: l.vdd
                @Override // p149l.d30
                public final void call() {
                    CoreModule.f17545c.f19614V1.f83484W.clear();
                }
            }));
            ArrayList arrayList2 = this.f38300a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = this.f38301b;
            arrayList2.add(vwb.m200311Y("划卡迎新tip", new d30() { // from class: l.wdd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9091i1.m59313b(viewTreeObserverOnGlobalLayoutListenerC7866b2);
                }
            }));
            ArrayList arrayList3 = this.f38300a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b3 = this.f38301b;
            arrayList3.add(vwb.m200311Y("打开欢迎页", new d30() { // from class: l.xdd
                @Override // p149l.d30
                public final void call() {
                    ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b4 = viewTreeObserverOnGlobalLayoutListenerC7866b3;
                    viewTreeObserverOnGlobalLayoutListenerC7866b4.act().startActivity(new Intent(viewTreeObserverOnGlobalLayoutListenerC7866b4.act(), (Class<?>) NewUserBatchGreetAct.class));
                }
            }));
            this.f38301b.act().showDebugMenu(this.f38300a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$i2 */
    public class C9092i2 implements d30 {
        @Override // p149l.d30
        public void call() {
            hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149181G5;
            hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$j */
    public class C9093j implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38302a;

        public C9093j(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38302a = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.d30
        public void call() {
            this.f38302a.act().startActivity(TagGuidePicAct.m50772Y1(this.f38302a.act(), true, "from_upload_pic", "from_complete_equity_guide"));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$j0 */
    public class C9094j0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38303a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38304b;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$j0$a */
        public class a implements d30 {
            public a() {
            }

            @Override // p149l.d30
            public void call() {
                CoreModule.f17545c.f19639e0.f149223M6.clear();
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$j0$b */
        public class b implements d30 {
            public b() {
            }

            @Override // p149l.d30
            public void call() {
                ura.m195053e().m195057d().mo33758Ud(C9094j0.this.f38304b.act());
            }
        }

        public C9094j0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38303a = arrayList;
            this.f38304b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.d30
        public void call() {
            this.f38303a.clear();
            ArrayList arrayList = this.f38303a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b = this.f38304b;
            arrayList.add(vwb.m200311Y("tribe 划卡页", new d30() { // from class: l.ncd
                @Override // p149l.d30
                public final void call() {
                    ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                    viewTreeObserverOnGlobalLayoutListenerC7866b2.act().startActivity(IntlTribeSwipeAct.m39525X1(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), "pursue", IntlPurpose.short_term_fun, IntlPurpose.short_term_fun, "https://auto.tancdn.com/v1/images/eyJpZCI6IjhCRDkzRjE5QkQ0MzQ5RDU4N0JCNTQ3NzQwRTBGMzhEIiwidyI6MTIwLCJoIjoxMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNzQ1MTAyODQzNTQ3NjQ4LCJwdCI6MjAyNTA2MTMxOH0.png", "https://auto.tancdn.com/v1/images/eyJpZCI6IjU0NTA3MkQ2N0MwQTRFN0ZCOEY0QzY2OTUzQUE1ODY1IiwidyI6NzUwLCJoIjoxNjI0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzQ4MzU1MDEyNjY2NDAwMDcxNiwicHQiOjIwMjUwNjEzMTh9.png"));
                }
            }));
            this.f38303a.add(vwb.m200311Y("清除气泡频控", new a()));
            this.f38303a.add(vwb.m200311Y("交友目的弹窗", new b()));
            this.f38304b.act().showDebugMenu(this.f38303a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$j1 */
    public class C9095j1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38307a;

        public C9095j1(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38307a = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m59320a(xaj0 xaj0Var) {
        }

        @Override // p149l.d30
        public void call() {
            qib0.f154703R.m94725a(((BitmapDrawable) this.f38307a.act().getResources().getDrawable(x2c0.f190218ht)).getBitmap()).subscribe(mkd0.m154956H(new e30() { // from class: l.ydd
                @Override // p149l.e30
                public final void call(Object obj) {
                    DebugUtil.C9095j1.m59320a((xaj0) obj);
                }
            }, new e30() { // from class: l.zdd
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((Throwable) obj).toString();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$j2 */
    public class C9096j2 implements d30 {
        @Override // p149l.d30
        public void call() {
            CoreModule.f17545c.f19639e0.f149167E5.clear();
            CoreModule.f17545c.f19639e0.f149160D5.clear();
            CoreModule.f17545c.f19639e0.f149174F5.clear();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$k */
    public class C9097k implements d30 {
        @Override // p149l.d30
        public void call() {
            xjc0.m209686a(xjc0.f193202e);
            xjc0.m209686a(xjc0.f193203f);
            xjc0.m209686a(xjc0.f193204g);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$k0 */
    public class C9098k0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38308a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38309b;

        public C9098k0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38308a = arrayList;
            this.f38309b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.d30
        public void call() {
            this.f38308a.clear();
            this.f38308a.add(vwb.m200311Y("清除红点记录", new d30() { // from class: l.ocd
                @Override // p149l.d30
                public final void call() {
                    CoreModule.f17545c.f19639e0.f149216L6.put(Boolean.FALSE);
                }
            }));
            this.f38309b.act().showDebugMenu(this.f38308a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$k1 */
    public class C9099k1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38310a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38311b;

        public C9099k1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38310a = arrayList;
            this.f38311b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.d30
        public void call() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$k2 */
    public class C9100k2 implements e30<User> {
        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(User user) {
            user.toJson().toString();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$l */
    public class C9101l implements d30 {
        @Override // p149l.d30
        public void call() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$l0 */
    public class C9102l0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38312a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38313b;

        public C9102l0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38312a = arrayList;
            this.f38313b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.d30
        public void call() {
            this.f38312a.clear();
            this.f38312a.add(vwb.m200311Y("清除频控", new d30() { // from class: l.pcd
                @Override // p149l.d30
                public final void call() {
                    CoreModule.f17545c.f19639e0.f149209K6.put(Boolean.FALSE);
                }
            }));
            this.f38313b.act().showDebugMenu(this.f38312a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$l1 */
    public class C9103l1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38314a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38315b;

        public C9103l1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38314a = arrayList;
            this.f38315b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.d30
        public void call() {
            this.f38314a.clear();
            this.f38314a.add(vwb.m200311Y("清除boost引导相关本地数据", new d30() { // from class: l.aed
                @Override // p149l.d30
                public final void call() {
                    b83.m100710d().m100711a();
                }
            }));
            ArrayList arrayList = this.f38314a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b = this.f38315b;
            arrayList.add(vwb.m200311Y("boost新引导弹窗", new d30() { // from class: l.bed
                @Override // p149l.d30
                public final void call() {
                    new x83(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "p_home,accelerate_guide").show();
                }
            }));
            ArrayList arrayList2 = this.f38314a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = this.f38315b;
            arrayList2.add(vwb.m200311Y("boost结束底部弹窗", new d30() { // from class: l.ced
                @Override // p149l.d30
                public final void call() {
                    C16319da.INSTANCE.m110517s(viewTreeObserverOnGlobalLayoutListenerC7866b2.act());
                }
            }));
            this.f38314a.add(vwb.m200311Y("插入boost引导卡", new d30() { // from class: l.ded
                @Override // p149l.d30
                public final void call() {
                    b83.m100710d().m100714e();
                }
            }));
            ArrayList arrayList3 = this.f38314a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b3 = this.f38315b;
            arrayList3.add(vwb.m200311Y("boost引导入口push", new d30() { // from class: l.eed
                @Override // p149l.d30
                public final void call() {
                    b83.m100710d().m100722m(viewTreeObserverOnGlobalLayoutListenerC7866b3.act());
                }
            }));
            this.f38315b.act().showDebugMenu(this.f38314a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$l2 */
    public class C9104l2 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38316a;

        public C9104l2(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38316a = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.d30
        public void call() {
            this.f38316a.act().startActivity(AvatarForceChangeAct.m56078Z1(this.f38316a.act(), 1, BuildConfig.BUILD_TYPE));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$m */
    public class C9105m implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38317a;

        public C9105m(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38317a = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.d30
        public void call() {
            this.f38317a.act().startActivity(new Intent(this.f38317a.act(), (Class<?>) DebugFontWeightAct.class));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$m0 */
    public class C9106m0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38318a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38319b;

        public C9106m0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38318a = arrayList;
            this.f38319b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.d30
        public void call() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$m1 */
    public class RunnableC9107m1 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            CoreModule.f17545c.f19639e0.f149385h4.m132487l(roj0.f160388a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$m2 */
    public class C9108m2 implements d30 {
        @Override // p149l.d30
        public void call() {
            CoreModule.f17545c.f19552B0.f19759g0.clear();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$n */
    public class C9109n implements d30 {
        @Override // p149l.d30
        public void call() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$n0 */
    public class C9110n0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38320a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38321b;

        public C9110n0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38320a = arrayList;
            this.f38321b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m59330a() {
            CoreModule.f17545c.f19639e0.f149165E3.put("");
            c30.m104965g();
            CoreModule.f17545c.f19639e0.f149165E3.put("");
        }

        @Override // p149l.d30
        public void call() {
            this.f38320a.clear();
            this.f38320a.add(vwb.m200311Y("滑卡限制", new d30() { // from class: l.qcd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9110n0.m59330a();
                }
            }));
            this.f38321b.act().showDebugMenu(this.f38320a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$n1 */
    public class C9111n1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38322a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38323b;

        public C9111n1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38322a = arrayList;
            this.f38323b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m59331a() {
            if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.f149199J3)) {
                CoreModule.f17545c.f19639e0.f149199J3.put("momocv");
            }
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m59332b() {
            if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.f149199J3)) {
                CoreModule.f17545c.f19639e0.f149199J3.put("tencent");
            }
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m59333c() {
            if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.f149199J3)) {
                CoreModule.f17545c.f19639e0.f149199J3.put("aliyunIntl");
            }
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m59334d() {
            if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.f149199J3)) {
                CoreModule.f17545c.f19639e0.f149199J3.put("tencentIntl");
            }
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m59335e() {
            if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.f149199J3)) {
                CoreModule.f17545c.f19639e0.f149199J3.put("volcEnginePro");
            }
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m59336f() {
            if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.f149199J3)) {
                CoreModule.f17545c.f19639e0.f149199J3.put("aliyun");
            }
        }

        @Override // p149l.d30
        public void call() {
            this.f38322a.clear();
            this.f38322a.add(vwb.m200311Y("阿里", new d30() { // from class: l.fed
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9111n1.m59336f();
                }
            }));
            this.f38322a.add(vwb.m200311Y("腾讯", new d30() { // from class: l.ged
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9111n1.m59332b();
                }
            }));
            this.f38322a.add(vwb.m200311Y("腾讯国际化", new d30() { // from class: l.hed
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9111n1.m59334d();
                }
            }));
            this.f38322a.add(vwb.m200311Y("陌陌", new d30() { // from class: l.ied
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9111n1.m59331a();
                }
            }));
            this.f38322a.add(vwb.m200311Y("火山", new d30() { // from class: l.jed
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9111n1.m59335e();
                }
            }));
            this.f38322a.add(vwb.m200311Y("阿里国际化", new d30() { // from class: l.ked
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9111n1.m59333c();
                }
            }));
            this.f38323b.act().showDebugMenu(this.f38322a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$n2 */
    public class C9112n2 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ nt30 f38324a;

        public C9112n2(nt30 nt30Var) {
            this.f38324a = nt30Var;
        }

        @Override // p149l.d30
        public void call() {
            zar.m217748g(this.f38324a.m161157T4(), null, null);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$o */
    public class C9113o implements d30 {
        @Override // p149l.d30
        public void call() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$o0 */
    public class C9114o0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38325a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38326b;

        public C9114o0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38325a = arrayList;
            this.f38326b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m59337a() {
            hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149137A3;
            Boolean bool = Boolean.TRUE;
            hpd0Var.put(bool);
            CoreModule.f17545c.f19639e0.f149144B3.put(bool);
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m59339c() {
            CoreModule.f17545c.f19639e0.f149265S3.put(Boolean.FALSE);
            CoreModule.f17545c.f19639e0.f149273T3.put(0);
        }

        @Override // p149l.d30
        public void call() {
            this.f38325a.clear();
            this.f38325a.add(vwb.m200311Y("清空tip标记", new d30() { // from class: l.rcd
                @Override // p149l.d30
                public final void call() {
                    CoreModule.f17545c.f19639e0.f149517z3.put(Boolean.TRUE);
                }
            }));
            this.f38325a.add(vwb.m200311Y("清空撤回记录", new d30() { // from class: l.scd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9114o0.m59339c();
                }
            }));
            this.f38325a.add(vwb.m200311Y("启动处理一次", new d30() { // from class: l.tcd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9114o0.m59337a();
                }
            }));
            this.f38326b.act().showDebugMenu(this.f38325a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$o1 */
    public class C9115o1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38327a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38328b;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$o1$a */
        public class a implements d30 {
            public a() {
            }

            @Override // p149l.d30
            public void call() {
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$o1$b */
        public class b implements d30 {
            public b() {
            }

            @Override // p149l.d30
            public void call() {
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$o1$c */
        public class c implements d30 {
            public c() {
            }

            @Override // p149l.d30
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

        public C9115o1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38327a = arrayList;
            this.f38328b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        /* JADX INFO: renamed from: A */
        public static /* synthetic */ void m59340A(View view) {
        }

        /* JADX INFO: renamed from: F */
        public static /* synthetic */ void m59345F(final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            AppealInfo appealInfo = new AppealInfo();
            appealInfo.appeal_count = 0;
            appealInfo.status = OMSSwipeMoment.before;
            iwf.m138738e().m138740g(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), new Runnable() { // from class: l.nfd
                @Override // java.lang.Runnable
                public final void run() {
                    ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                    r3g.m177670i(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), viewTreeObserverOnGlobalLayoutListenerC7866b2.m37341q2(), PutongAct.REQUEST_CODE_PICKER);
                }
            }, appealInfo);
        }

        /* JADX INFO: renamed from: J */
        public static /* synthetic */ void m59349J() {
        }

        /* JADX INFO: renamed from: K */
        public static /* synthetic */ void m59350K(View view) {
        }

        /* JADX INFO: renamed from: L */
        public static /* synthetic */ void m59351L(View view) {
        }

        /* JADX INFO: renamed from: M */
        public static /* synthetic */ void m59352M(View view) {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m59358a(View view) {
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m59360c(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            C7926u c7926u = new C7926u();
            c7926u.f22053a.put(0);
            c7926u.f22054b.put(0L);
            h7j.m129731o();
            h7j.m129716a0(CoreModule.m29932K().me_(), viewTreeObserverOnGlobalLayoutListenerC7866b.act(), null, "swipe_card");
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m59361d(View view) {
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m59362e(View view) {
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m59363f(View view) {
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ void m59364g(View view) {
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ void m59365h(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            LinearLayout linearLayout = new LinearLayout(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            linearLayout.setGravity(16);
            linearLayout.setPadding(t100.m186890d(12.0f), t100.m186890d(12.0f), t100.m186890d(20.0f), t100.m186890d(12.0f));
            View vIcon = new VIcon(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(t100.m186890d(28.0f), t100.m186890d(28.0f));
            layoutParams.rightMargin = t100.m186890d(8.0f);
            vIcon.setLayoutParams(layoutParams);
            vIcon.setBackgroundResource(x2c0.f189335Fl);
            linearLayout.addView(vIcon);
            VText vText = new VText(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            vText.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            vText.setTextColor(viewTreeObserverOnGlobalLayoutListenerC7866b.act().getResources().getColor(w0c0.f183854i));
            vText.setTextSize(15.0f);
            vText.setTypeface(eqh0.m117752c(3), 1);
            vText.setText("资料已提交，待审核通过后生效");
            linearLayout.addView(vText);
            hdb0.m130575c().m130582i(new SimplePushBubble.C4372a(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), linearLayout).m21164B(1).m21176z(CorePopLevel.TEST).m21169s());
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ void m59366i(View view) {
        }

        /* JADX INFO: renamed from: n */
        public static /* synthetic */ void m59371n(View view) {
        }

        /* JADX INFO: renamed from: o */
        public static /* synthetic */ void m59372o(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            Message message = new Message();
            message.value = "XXXX";
            message.messageType = MessageType.get("text");
            message.cid = "1";
            v9b.m197548b(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), psm.m171183c(CoreModule.f17545c.f19639e0.m169527p9(), message));
        }

        /* JADX INFO: renamed from: r */
        public static /* synthetic */ void m59375r(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            gxf gxfVar = new gxf(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            gxfVar.m128575C(CoreModule.f17545c.f19639e0.m169464Z7(), false, "p_suggest_users_home_view");
            gxfVar.show();
        }

        /* JADX INFO: renamed from: s */
        public static /* synthetic */ void m59376s(View view) {
        }

        /* JADX INFO: renamed from: u */
        public static /* synthetic */ void m59378u(View view) {
        }

        /* JADX INFO: renamed from: z */
        public static /* synthetic */ void m59383z(View view) {
        }

        /* JADX INFO: renamed from: S */
        public final /* synthetic */ void m59384S(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            ark.m98469d1(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), new a());
        }

        /* JADX INFO: renamed from: T */
        public final /* synthetic */ void m59385T(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            CoreDlg.m45054c2(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), new b(), new c());
        }

        /* JADX INFO: renamed from: U */
        public final /* synthetic */ void m59386U(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            ark.m98435M0(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), new d());
        }

        @Override // p149l.d30
        public void call() {
            this.f38327a.clear();
            ArrayList arrayList = this.f38327a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b = this.f38328b;
            arrayList.add(vwb.m200311Y("无标题1", new d30() { // from class: l.led
                @Override // p149l.d30
                public final void call() {
                    new xh0.C21150a(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m208728g(false).m208731j("文字内容").m208739r("按钮").m208736o(new View.OnClickListener() { // from class: l.ffd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C9115o1.m59383z(view);
                        }
                    }).m208727f("按钮").m208724c(new View.OnClickListener() { // from class: l.gfd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C9115o1.m59361d(view);
                        }
                    }).m208722a().m208721g();
                }
            }));
            ArrayList arrayList2 = this.f38327a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = this.f38328b;
            arrayList2.add(vwb.m200311Y("无标题2", new d30() { // from class: l.ned
                @Override // p149l.d30
                public final void call() {
                    new xh0.C21150a(viewTreeObserverOnGlobalLayoutListenerC7866b2.act()).m208728g(false).m208731j("文字内容文字内容文字内容文字内容文字内容文字").m208739r("按钮").m208736o(new View.OnClickListener() { // from class: l.lfd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C9115o1.m59366i(view);
                        }
                    }).m208727f("按钮").m208724c(new View.OnClickListener() { // from class: l.mfd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C9115o1.m59350K(view);
                        }
                    }).m208722a().m208721g();
                }
            }));
            ArrayList arrayList3 = this.f38327a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b3 = this.f38328b;
            arrayList3.add(vwb.m200311Y("无标题3  3行", new d30() { // from class: l.xed
                @Override // p149l.d30
                public final void call() {
                    new xh0.C21150a(viewTreeObserverOnGlobalLayoutListenerC7866b3.act()).m208728g(false).m208731j("文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容").m208739r("按钮").m208736o(new View.OnClickListener() { // from class: l.tfd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C9115o1.m59352M(view);
                        }
                    }).m208727f("按钮").m208724c(new View.OnClickListener() { // from class: l.ufd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C9115o1.m59340A(view);
                        }
                    }).m208722a().m208721g();
                }
            }));
            ArrayList arrayList4 = this.f38327a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b4 = this.f38328b;
            arrayList4.add(vwb.m200311Y("无标题3  4行", new d30() { // from class: l.yed
                @Override // p149l.d30
                public final void call() {
                    new xh0.C21150a(viewTreeObserverOnGlobalLayoutListenerC7866b4.act()).m208728g(false).m208731j("文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容").m208739r("按钮").m208736o(new View.OnClickListener() { // from class: l.vfd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C9115o1.m59362e(view);
                        }
                    }).m208727f("按钮").m208724c(new View.OnClickListener() { // from class: l.wfd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C9115o1.m59363f(view);
                        }
                    }).m208722a().m208721g();
                }
            }));
            ArrayList arrayList5 = this.f38327a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b5 = this.f38328b;
            arrayList5.add(vwb.m200311Y("无标题4 超出4行", new d30() { // from class: l.zed
                @Override // p149l.d30
                public final void call() {
                    new xh0.C21150a(viewTreeObserverOnGlobalLayoutListenerC7866b5.act()).m208728g(false).m208731j("文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容").m208739r("按钮").m208736o(new View.OnClickListener() { // from class: l.qfd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C9115o1.m59358a(view);
                        }
                    }).m208727f("按钮").m208724c(new View.OnClickListener() { // from class: l.rfd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C9115o1.m59351L(view);
                        }
                    }).m208722a().m208721g();
                }
            }));
            ArrayList arrayList6 = this.f38327a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b6 = this.f38328b;
            arrayList6.add(vwb.m200311Y("有标题1 ", new d30() { // from class: l.afd
                @Override // p149l.d30
                public final void call() {
                    new xh0.C21150a(viewTreeObserverOnGlobalLayoutListenerC7866b6.act()).m208740s("标题").m208728g(false).m208731j("文字内容").m208739r("按钮").m208736o(new View.OnClickListener() { // from class: l.ofd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C9115o1.m59378u(view);
                        }
                    }).m208727f("按钮").m208724c(new View.OnClickListener() { // from class: l.pfd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C9115o1.m59376s(view);
                        }
                    }).m208722a().m208721g();
                }
            }));
            ArrayList arrayList7 = this.f38327a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b7 = this.f38328b;
            arrayList7.add(vwb.m200311Y("有标题2 ", new d30() { // from class: l.bfd
                @Override // p149l.d30
                public final void call() {
                    new xh0.C21150a(viewTreeObserverOnGlobalLayoutListenerC7866b7.act()).m208740s("标题").m208728g(false).m208731j("文字内容文字内容文字内容文字内容文字内容文字内容").m208739r("按钮").m208736o(new View.OnClickListener() { // from class: l.jfd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C9115o1.m59364g(view);
                        }
                    }).m208727f("按钮").m208724c(new View.OnClickListener() { // from class: l.kfd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C9115o1.m59371n(view);
                        }
                    }).m208722a().m208721g();
                }
            }));
            ArrayList arrayList8 = this.f38327a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b8 = this.f38328b;
            arrayList8.add(vwb.m200311Y("PopupDialog 1 ", new d30() { // from class: l.cfd
                @Override // p149l.d30
                public final void call() {
                    new dd80.C16336a(viewTreeObserverOnGlobalLayoutListenerC7866b8.act()).m110996y0("标题").m110991t0("文字文字文字文字文字文字文字文字文字文字文字文字文字文字文字文字文字文字文字文字").m110968W("xxxx").m110973b0("yyyy").m110989r0();
                }
            }));
            ArrayList arrayList9 = this.f38327a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b9 = this.f38328b;
            arrayList9.add(vwb.m200311Y("PopupDialog 2 ", new d30() { // from class: l.dfd
                @Override // p149l.d30
                public final void call() {
                    new dd80.C16336a(viewTreeObserverOnGlobalLayoutListenerC7866b9.act()).m110996y0("标题").m110991t0("文字文字文字文字文字文字文字文字文字文字文字文字文字文字文").m110973b0("按钮").m110989r0();
                }
            }));
            ArrayList arrayList10 = this.f38327a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b10 = this.f38328b;
            arrayList10.add(vwb.m200311Y("PopupDialog 3 ", new d30() { // from class: l.efd
                @Override // p149l.d30
                public final void call() {
                    new dd80.C16336a(viewTreeObserverOnGlobalLayoutListenerC7866b10.act()).m110964S(x2c0.f189898Xp).m110996y0("标题").m110973b0("按钮").m110989r0();
                }
            }));
            ArrayList arrayList11 = this.f38327a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b11 = this.f38328b;
            arrayList11.add(vwb.m200311Y("PopupDialog 4 ", new d30() { // from class: l.wed
                @Override // p149l.d30
                public final void call() {
                    new dd80.C16336a(viewTreeObserverOnGlobalLayoutListenerC7866b11.act()).m110964S(x2c0.f189898Xp).m110996y0("标题").m110991t0("描述文字描述文字").m110973b0("按钮").m110989r0();
                }
            }));
            ArrayList arrayList12 = this.f38327a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b12 = this.f38328b;
            arrayList12.add(vwb.m200311Y("PopupDialog 5 ", new d30() { // from class: l.hfd
                @Override // p149l.d30
                public final void call() {
                    new dd80.C16336a(viewTreeObserverOnGlobalLayoutListenerC7866b12.act()).m110964S(x2c0.f189898Xp).m110996y0("标题").m110991t0("描述文字描述文字").m110973b0("按钮").m110968W("文字").m110989r0();
                }
            }));
            ArrayList arrayList13 = this.f38327a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b13 = this.f38328b;
            arrayList13.add(vwb.m200311Y("PopupDialog 6 ", new d30() { // from class: l.sfd
                @Override // p149l.d30
                public final void call() {
                    new dd80.C16336a(viewTreeObserverOnGlobalLayoutListenerC7866b13.act()).m110964S(x2c0.f189898Xp).m110996y0("标题").m110991t0("描述文字描述文字").m110973b0("按钮1").m110978g0("按钮2").m110968W("文字").m110989r0();
                }
            }));
            ArrayList arrayList14 = this.f38327a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b14 = this.f38328b;
            arrayList14.add(vwb.m200311Y("PopupDialog 7 ", new d30() { // from class: l.xfd
                @Override // p149l.d30
                public final void call() {
                    new dd80.C16336a(viewTreeObserverOnGlobalLayoutListenerC7866b14.act()).m110964S(x2c0.f189898Xp).m110996y0("标题").m110991t0("描述文字描述文字").m110982k0("我同意腾讯、阿里、陌陌将采集我的面部信息并与头像比对，详见《真实头像认证协议》").m110973b0("按钮1").m110968W("文字").m110989r0();
                }
            }));
            ArrayList arrayList15 = this.f38327a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b15 = this.f38328b;
            arrayList15.add(vwb.m200311Y("PopupDialog 协议更新通知 ", new d30() { // from class: l.yfd
                @Override // p149l.d30
                public final void call() {
                    gp80.m127345m(viewTreeObserverOnGlobalLayoutListenerC7866b15.act(), true);
                }
            }));
            ArrayList arrayList16 = this.f38327a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b16 = this.f38328b;
            arrayList16.add(vwb.m200311Y("PopupDialog 功能全新升级 ", new d30() { // from class: l.zfd
                @Override // p149l.d30
                public final void call() {
                    snm.m185107f0(viewTreeObserverOnGlobalLayoutListenerC7866b16.act(), TabName.Card, null);
                }
            }));
            ArrayList arrayList17 = this.f38327a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b17 = this.f38328b;
            arrayList17.add(vwb.m200311Y("PopupDialog 分享新功能 1 ", new d30() { // from class: l.agd
                @Override // p149l.d30
                public final void call() {
                    this.f69349a.m59384S(viewTreeObserverOnGlobalLayoutListenerC7866b17);
                }
            }));
            ArrayList arrayList18 = this.f38327a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b18 = this.f38328b;
            arrayList18.add(vwb.m200311Y("PopupDialog 分享新功能 2 ", new d30() { // from class: l.bgd
                @Override // p149l.d30
                public final void call() {
                    this.f75421a.m59385T(viewTreeObserverOnGlobalLayoutListenerC7866b18);
                }
            }));
            ArrayList arrayList19 = this.f38327a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b19 = this.f38328b;
            arrayList19.add(vwb.m200311Y("PopupDialog 别错过TA的消息 ", new d30() { // from class: l.cgd
                @Override // p149l.d30
                public final void call() {
                    uq40.m194955E(viewTreeObserverOnGlobalLayoutListenerC7866b19.act(), new d30() { // from class: l.ifd
                        @Override // p149l.d30
                        public final void call() {
                            DebugUtil.C9115o1.m59349J();
                        }
                    }, null);
                }
            }));
            ArrayList arrayList20 = this.f38327a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b20 = this.f38328b;
            arrayList20.add(vwb.m200311Y("PopupDialog 你离开后任 ", new d30() { // from class: l.med
                @Override // p149l.d30
                public final void call() {
                    this.f133400a.m59386U(viewTreeObserverOnGlobalLayoutListenerC7866b20);
                }
            }));
            ArrayList arrayList21 = this.f38327a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b21 = this.f38328b;
            arrayList21.add(vwb.m200311Y("PopupDialog 真人实名认证 创建群 ", new d30() { // from class: l.oed
                @Override // p149l.d30
                public final void call() {
                    tbk.m187874u(viewTreeObserverOnGlobalLayoutListenerC7866b21.act());
                }
            }));
            ArrayList arrayList22 = this.f38327a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b22 = this.f38328b;
            arrayList22.add(vwb.m200311Y("PopupDialog  别着急，等%s回复后再继续聊天 ", new d30() { // from class: l.ped
                @Override // p149l.d30
                public final void call() {
                    w3z.m201400F(viewTreeObserverOnGlobalLayoutListenerC7866b22.act(), CoreModule.f17545c.f19639e0.m169527p9());
                }
            }));
            ArrayList arrayList23 = this.f38327a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b23 = this.f38328b;
            arrayList23.add(vwb.m200311Y("Dialog 引导上传生活照", new d30() { // from class: l.qed
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9115o1.m59375r(viewTreeObserverOnGlobalLayoutListenerC7866b23);
                }
            }));
            ArrayList arrayList24 = this.f38327a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b24 = this.f38328b;
            arrayList24.add(vwb.m200311Y("Dialog 新交友目的 新弹框", new d30() { // from class: l.red
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9115o1.m59360c(viewTreeObserverOnGlobalLayoutListenerC7866b24);
                }
            }));
            ArrayList arrayList25 = this.f38327a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b25 = this.f38328b;
            arrayList25.add(new j760("Dialog 网图Fake弹窗", new d30() { // from class: l.sed
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9115o1.m59345F(viewTreeObserverOnGlobalLayoutListenerC7866b25);
                }
            }));
            ArrayList arrayList26 = this.f38327a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b26 = this.f38328b;
            arrayList26.add(new j760("push 超级喜欢", new d30() { // from class: l.ted
                @Override // p149l.d30
                public final void call() {
                    rxg0.m181562L(viewTreeObserverOnGlobalLayoutListenerC7866b26.act());
                }
            }));
            ArrayList arrayList27 = this.f38327a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b27 = this.f38328b;
            arrayList27.add(new j760("push 消息已经发送", new d30() { // from class: l.ued
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9115o1.m59372o(viewTreeObserverOnGlobalLayoutListenerC7866b27);
                }
            }));
            ArrayList arrayList28 = this.f38327a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b28 = this.f38328b;
            arrayList28.add(new j760("资料已经提交", new d30() { // from class: l.ved
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9115o1.m59365h(viewTreeObserverOnGlobalLayoutListenerC7866b28);
                }
            }));
            this.f38328b.act().showDebugMenu(this.f38327a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$p */
    public class C9116p implements d30 {
        @Override // p149l.d30
        public void call() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$p0 */
    public class C9117p0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38333a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38334b;

        public C9117p0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38333a = arrayList;
            this.f38334b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m59387a() {
            hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149336b3;
            hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        }

        @Override // p149l.d30
        public void call() {
            this.f38333a.clear();
            this.f38333a.add(vwb.m200311Y("实验组，当前：".concat(CoreModule.f17545c.f19639e0.f149336b3.get().booleanValue() ? "true" : "false"), new d30() { // from class: l.ucd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9117p0.m59387a();
                }
            }));
            this.f38334b.act().showDebugMenu(this.f38333a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$p1 */
    public class C9118p1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38335a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38336b;

        public C9118p1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38335a = arrayList;
            this.f38336b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m59388a() {
            CoreModule.f17545c.f19639e0.f149238P0.clear();
            CoreModule.f17545c.f19639e0.f149231O0.clear();
            CoreModule.f17545c.f19639e0.f149220M3.clear();
            CoreModule.f17545c.f19639e0.f149213L3.clear();
            CoreModule.f17545c.f19639e0.f149206K3.clear();
            CoreModule.f17545c.f19639e0.f149158D3.clear();
            CoreModule.f17545c.f19639e0.f149151C3.clear();
        }

        @Override // p149l.d30
        public void call() {
            this.f38335a.clear();
            this.f38335a.add(vwb.m200311Y("清除相关本地数据", new d30() { // from class: l.dgd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9118p1.m59388a();
                }
            }));
            this.f38336b.act().showDebugMenu(this.f38335a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$q */
    public class C9119q implements d30 {
        @Override // p149l.d30
        public void call() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$q0 */
    public class C9120q0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38337a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38338b;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$q0$a */
        public class a implements e30<Boolean> {
            public a() {
            }

            @Override // p149l.e30
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(Boolean bool) {
            }
        }

        public C9120q0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38337a = arrayList;
            this.f38338b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m59389a() {
            hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149344c3;
            hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public /* synthetic */ void m59391c(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            snm.m185075F(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), false, true, "xxx", new a());
        }

        @Override // p149l.d30
        public void call() {
            this.f38337a.clear();
            this.f38337a.add(vwb.m200311Y("实验组，当前：".concat(CoreModule.f17545c.f19639e0.f149344c3.get().booleanValue() ? "true" : "false"), new d30() { // from class: l.vcd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9120q0.m59389a();
                }
            }));
            ArrayList arrayList = this.f38337a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b = this.f38338b;
            arrayList.add(vwb.m200311Y(" 非svpi 弹svpi", new d30() { // from class: l.wcd
                @Override // p149l.d30
                public final void call() {
                    this.f185676a.m59391c(viewTreeObserverOnGlobalLayoutListenerC7866b);
                }
            }));
            this.f38338b.act().showDebugMenu(this.f38337a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$q1 */
    public class C9121q1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38340a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38341b;

        public C9121q1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38340a = arrayList;
            this.f38341b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m59393a() {
            CoreModule.f17545c.f19639e0.f149241P3.clear();
            CoreModule.f17545c.f19639e0.f149249Q3.clear();
        }

        @Override // p149l.d30
        public void call() {
            this.f38340a.clear();
            this.f38340a.add(vwb.m200311Y("清空频控", new d30() { // from class: l.egd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9121q1.m59393a();
                }
            }));
            this.f38341b.act().showDebugMenu(this.f38340a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$r */
    public class RunnableC9122r implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38342a;

        public RunnableC9122r(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38342a = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // java.lang.Runnable
        public void run() {
            b4h0 b4h0Var = new b4h0(this.f38342a.act());
            b4h0Var.show();
            g4h0.m124371c(this.f38342a.act(), b4h0Var);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$r0 */
    public class C9123r0 implements e30<Conversation> {
        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Conversation conversation) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$r1 */
    public class C9124r1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38343a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38344b;

        public C9124r1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38343a = arrayList;
            this.f38344b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m59395a() {
            CoreModule.f17545c.f19642f0.f19983v1.clear();
            CoreModule.f17545c.f19642f0.f19980u1.clear();
            CoreModule.f17545c.f19642f0.f19977t1.clear();
            CoreModule.f17545c.f19642f0.f19842A1.clear();
        }

        @Override // p149l.d30
        public void call() {
            this.f38343a.clear();
            this.f38343a.add(vwb.m200311Y("清楚本地数据", new d30() { // from class: l.fgd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9124r1.m59395a();
                }
            }));
            this.f38344b.act().showDebugMenu(this.f38343a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$s */
    public class RunnableC9125s implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38345a;

        public RunnableC9125s(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38345a = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // java.lang.Runnable
        public void run() {
            ChatPartners chatPartnersNew_ = ChatPartners.new_();
            User userMe_ = CoreModule.m29932K().me_();
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
            new puf0(this.f38345a.act()).m171426W(chatPartnersNew_);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$s0 */
    public class C9126s0 implements e30<User> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38346a;

        public C9126s0(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38346a = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(User user) {
            m7e0.m153367b(this.f38346a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$s1 */
    public class C9127s1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38347a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38348b;

        public C9127s1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38347a = arrayList;
            this.f38348b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.d30
        public void call() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$t */
    public class RunnableC9128t implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f38349a;

        /* JADX INFO: renamed from: b */
        public TextView f38350b;

        /* JADX INFO: renamed from: c */
        public c4g0 f38351c = C22306c.interval(1, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.xbd
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191941a.m59400d((Long) obj);
            }
        }));

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CounterLikeLimit f38352d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38353e;

        public RunnableC9128t(CounterLikeLimit counterLikeLimit, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38352d = counterLikeLimit;
            this.f38353e = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m59400d(Long l2) {
            m59403g();
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m59401e() {
            this.f38351c.unsubscribe();
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m59402f(DialogInterface dialogInterface) {
            this.f38351c.unsubscribe();
        }

        /* JADX INFO: renamed from: g */
        public void m59403g() {
            Dialog dialog;
            long jResetNowMillis = this.f38352d.resetNowMillis();
            if (jResetNowMillis <= 0 && (dialog = this.f38349a) != null) {
                dialog.cancel();
            }
            String strM175934b = qqi0.m175934b(jResetNowMillis);
            TextView textView = this.f38350b;
            if (textView != null) {
                textView.setText(strM175934b);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog dialogM20568z0 = this.f38353e.act().dialog().m20507G0(this.f38353e.act().getString(R$string.f17840J3, Integer.valueOf(this.f38352d.total))).m20504F(this.f38353e.act().getString(R$string.f17810I3, Integer.valueOf(this.f38352d.total))).m20557u().m20553s().m20533c0(x2c0.f190664vt).m20560v0("", new Runnable() { // from class: l.ybd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f197326a.m59401e();
                }
            }).m20562w0(this.f38353e.act().getResources().getDrawable(x2c0.f190696wt)).m20494A(new DialogInterface.OnCancelListener() { // from class: l.zbd
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f202435a.m59402f(dialogInterface);
                }
            }).m20568z0();
            this.f38349a = dialogM20568z0;
            TextView textViewM208339J0 = xdl0.m208339J0(dialogM20568z0.m20465Z());
            this.f38350b = textViewM208339J0;
            textViewM208339J0.setTextSize(0, textViewM208339J0.getTextSize() * 1.1f);
            m59403g();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$t0 */
    public class RunnableC9129t0 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            f8c.m119878o().m119881B(new d30() { // from class: l.xcd
                @Override // p149l.d30
                public final void call() {
                    CoreModule.f17553k.f91948k.deleteAll();
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$t1 */
    public class RunnableC9130t1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ m45 f38354a;

        public RunnableC9130t1(m45 m45Var) {
            this.f38354a = m45Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            CityCBanner cityCBannerNew_ = CityCBanner.new_();
            cityCBannerNew_.cityName = "北京xx";
            this.f38354a.m153003K(1, null, cityCBannerNew_);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$u */
    public class C9131u implements e30<Boolean> {
        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$u0 */
    public class C9132u0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38355a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38356b;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$u0$a */
        public class a implements d30 {
            public a() {
            }

            @Override // p149l.d30
            public void call() {
                CoreModule.f17545c.f19639e0.f149288V2.put(Boolean.TRUE);
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$u0$b */
        public class b implements d30 {
            public b() {
            }

            @Override // p149l.d30
            public void call() {
                PopGuide popGuide = new PopGuide();
                popGuide.userId = "50141";
                popGuide.guide = "我发布了新的动态";
                popGuide.icon = "https://imgoldjii.oss-cn-beijing.aliyuncs.com/7821672838116_.pic.jpg";
                C9132u0.this.f38356b.act().m39801Z5().m40024z0(popGuide);
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$u0$c */
        public class c implements d30 {
            public c() {
            }

            @Override // p149l.d30
            public void call() {
                CoreModule.f17545c.f19639e0.f149280U2.clear();
                CoreModule.f17545c.f19639e0.f149248Q2.clear();
                CoreModule.f17545c.f19639e0.f149256R2.clear();
                CoreModule.f17545c.f19639e0.f149272T2.clear();
                CoreModule.f17545c.f19639e0.f149264S2.clear();
            }
        }

        public C9132u0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38355a = arrayList;
            this.f38356b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.d30
        public void call() {
            this.f38355a.clear();
            this.f38355a.add(vwb.m200311Y("开启实验组", new a()));
            this.f38355a.add(vwb.m200311Y("展示气泡", new b()));
            this.f38355a.add(vwb.m200311Y("清除频控", new c()));
            this.f38356b.act().showDebugMenu(this.f38355a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$u1 */
    public class RunnableC9133u1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ m45 f38360a;

        public RunnableC9133u1(m45 m45Var) {
            this.f38360a = m45Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            CityCData cityCDataNew_ = CityCData.new_();
            cityCDataNew_.userId = CoreModule.f17545c.f19639e0.m169527p9().f56011id;
            cityCDataNew_.expireAt = mqi0.m155944o() + 36000000;
            this.f38360a.m153003K(2, cityCDataNew_, null);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$v */
    public class C9134v implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38361a;

        public C9134v(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38361a = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.d30
        public void call() {
            ActionToastStyle actionToastStyle = new ActionToastStyle();
            actionToastStyle.styleId = "1";
            ActionToastStyleIcons actionToastStyleIcons = new ActionToastStyleIcons();
            actionToastStyleIcons.miniIcon = "online";
            actionToastStyle.icons = actionToastStyleIcons;
            actionToastStyle.toastLink = "tantanapp://sendMessage?uid=137071&msg=早上好";
            actionToastStyle.mainImg = CoreModule.f17545c.f19639e0.m169527p9().m60124fp().url;
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
            qug0.m176610g().m176617k(this.f38361a, actionDataNew_);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$v0 */
    public class C9135v0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38362a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38363b;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$v0$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38364a;

            public a(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
                this.f38364a = viewTreeObserverOnGlobalLayoutListenerC7866b;
            }

            @Override // java.lang.Runnable
            public void run() {
                User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
                userM169527p9.f56011id = "132375";
                userM169527p9.name = "昵称";
                userM169527p9.description = "爱生活，爱运动，爱美食\r\n爱旅行、爱逛家具店";
                xdx.m208433A().m208461K(this.f38364a.act(), userM169527p9, true);
            }
        }

        public C9135v0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38362a = arrayList;
            this.f38363b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m59406a() {
            hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149328a3;
            hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m59407b(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            userM169527p9.f56011id = "132375";
            userM169527p9.name = "昵称";
            userM169527p9.description = "爱生活，爱运动，爱美食\n爱旅行、爱逛家具店";
            xdx.m208433A().m208461K(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), userM169527p9, false);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m59410e() {
            hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149462r4;
            hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public /* synthetic */ void m59411f(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            for (int i = 0; i < 5; i++) {
                e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), new a(viewTreeObserverOnGlobalLayoutListenerC7866b), 200L);
            }
        }

        @Override // p149l.d30
        public void call() {
            this.f38362a.clear();
            this.f38362a.add(vwb.m200311Y("toggle实验组，当前：".concat(CoreModule.f17545c.f19639e0.f149328a3.get().booleanValue() ? "true" : "false"), new d30() { // from class: l.ycd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9135v0.m59406a();
                }
            }));
            this.f38362a.add(vwb.m200311Y("Ui优化实验：".concat(CoreModule.f17545c.f19639e0.f149462r4.get().booleanValue() ? "true" : "false"), new d30() { // from class: l.zcd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9135v0.m59410e();
                }
            }));
            ArrayList arrayList = this.f38362a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b = this.f38363b;
            arrayList.add(vwb.m200311Y("弹出弹窗", new d30() { // from class: l.add
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9135v0.m59407b(viewTreeObserverOnGlobalLayoutListenerC7866b);
                }
            }));
            ArrayList arrayList2 = this.f38362a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = this.f38363b;
            arrayList2.add(vwb.m200311Y("连续弹出弹出", new d30() { // from class: l.bdd
                @Override // p149l.d30
                public final void call() {
                    this.f75024a.m59411f(viewTreeObserverOnGlobalLayoutListenerC7866b2);
                }
            }));
            this.f38362a.add(vwb.m200311Y("弹出先发like弹窗", new d30() { // from class: l.cdd
                @Override // p149l.d30
                public final void call() {
                    xdx.m208433A().m208464N("137071");
                }
            }));
            this.f38363b.act().showDebugMenu(this.f38362a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$v1 */
    public class RunnableC9136v1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ m45 f38366a;

        public RunnableC9136v1(m45 m45Var) {
            this.f38366a = m45Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            CityCData cityCDataNew_ = CityCData.new_();
            cityCDataNew_.userId = CoreModule.f17545c.f19639e0.m169527p9().f56011id;
            cityCDataNew_.viewCount = 10001;
            cityCDataNew_.recievedLikeCount = PlaybackException.ERROR_CODE_DRM_UNSPECIFIED;
            this.f38366a.m153003K(3, cityCDataNew_, null);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$w */
    public class C9137w implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38367a;

        public C9137w(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38367a = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.d30
        public void call() {
            ActionToastStyle actionToastStyle = new ActionToastStyle();
            actionToastStyle.styleId = "1";
            ActionToastStyleIcons actionToastStyleIcons = new ActionToastStyleIcons();
            actionToastStyleIcons.miniIcon = "online";
            actionToastStyle.icons = actionToastStyleIcons;
            actionToastStyle.toastLink = "tantanapp://sendMessage?uid=137071&msg=早上好";
            actionToastStyle.mainImg = CoreModule.f17545c.f19639e0.m169527p9().m60124fp().url;
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
            qug0.m176610g().m176617k(this.f38367a, actionDataNew_);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$w0 */
    public class C9138w0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38368a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38369b;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$w0$a */
        public class a implements d30 {
            public a() {
            }

            @Override // p149l.d30
            public void call() {
                ActionToastStyle actionToastStyle = new ActionToastStyle();
                actionToastStyle.styleId = "1";
                ActionToastStyleIcons actionToastStyleIcons = new ActionToastStyleIcons();
                actionToastStyleIcons.miniIcon = "online";
                actionToastStyle.icons = actionToastStyleIcons;
                actionToastStyle.toastLink = "";
                actionToastStyle.mainImg = CoreModule.f17545c.f19639e0.m169527p9().m60124fp().url;
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
                qug0.m176610g().m176617k(C9138w0.this.f38369b, actionDataNew_);
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$w0$b */
        public class b implements d30 {
            public b() {
            }

            @Override // p149l.d30
            public void call() {
                ActionToastStyle actionToastStyle = new ActionToastStyle();
                actionToastStyle.styleId = "1";
                ActionToastStyleIcons actionToastStyleIcons = new ActionToastStyleIcons();
                actionToastStyleIcons.miniIcon = "online";
                actionToastStyle.icons = actionToastStyleIcons;
                actionToastStyle.toastLink = "";
                actionToastStyle.title = "林青霞";
                actionToastStyle.mainImg = CoreModule.f17545c.f19639e0.m169527p9().m60124fp().url;
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
                qug0.m176610g().m176617k(C9138w0.this.f38369b, actionDataNew_);
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$w0$c */
        public class c implements d30 {
            public c() {
            }

            @Override // p149l.d30
            public void call() {
                ActionToastStyle actionToastStyle = new ActionToastStyle();
                actionToastStyle.styleId = "1";
                ActionToastStyleIcons actionToastStyleIcons = new ActionToastStyleIcons();
                actionToastStyleIcons.miniIcon = "online";
                actionToastStyle.icons = actionToastStyleIcons;
                actionToastStyle.toastLink = "";
                actionToastStyle.mainImg = CoreModule.f17545c.f19639e0.m169527p9().m60124fp().url;
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
                qug0.m176610g().m176617k(C9138w0.this.f38369b, actionDataNew_);
            }
        }

        public C9138w0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38368a = arrayList;
            this.f38369b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        @Override // p149l.d30
        public void call() {
            this.f38368a.clear();
            this.f38368a.add(vwb.m200311Y("弹出测试弹窗：deeplink发消息", new a()));
            this.f38368a.add(vwb.m200311Y("弹出测试弹窗：deeplink跳转聊天页，填入消息并弹起键盘", new b()));
            this.f38368a.add(vwb.m200311Y("弹出测试弹窗：deeplink跳转聊天页，自动发送消息", new c()));
            this.f38369b.act().showDebugMenu(this.f38368a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$w1 */
    public class RunnableC9139w1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ m45 f38373a;

        public RunnableC9139w1(m45 m45Var) {
            this.f38373a = m45Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38373a.m153003K(5, null, null);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$x */
    public class C9140x implements e30<User> {
        @Override // p149l.e30
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
    public class C9141x0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38374a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38375b;

        public C9141x0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38374a = arrayList;
            this.f38375b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m59413a() {
            hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149440o3;
            hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        }

        @Override // p149l.d30
        public void call() {
            this.f38374a.clear();
            this.f38374a.add(vwb.m200311Y("toggle实验组，当前：".concat(CoreModule.f17545c.f19639e0.f149440o3.get().booleanValue() ? "true" : "false"), new d30() { // from class: l.ddd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9141x0.m59413a();
                }
            }));
            this.f38375b.act().showDebugMenu(this.f38374a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$x1 */
    public class C9142x1 implements e30<CoreSuggested.UserInfo> {
        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(CoreSuggested.UserInfo userInfo) {
            if (userInfo != null) {
                CoreModule.f17545c.f19663m0.m31154w6(userInfo, 1);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$y */
    public class C9143y implements e30<User> {
        @Override // p149l.e30
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
    public class C9144y0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38376a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38377b;

        public C9144y0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38376a = arrayList;
            this.f38377b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m59418c() {
            hpd0 hpd0Var = CoreModule.f17545c.f19663m0.f19461w1;
            hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m59419d() {
            hpd0 hpd0Var = CoreModule.f17545c.f19663m0.f19467y1;
            hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        }

        @Override // p149l.d30
        public void call() {
            this.f38376a.clear();
            this.f38376a.add(vwb.m200311Y("推荐卡片4变3张 开关：".concat(CoreModule.f17545c.f19663m0.f19461w1.get().booleanValue() ? "true" : "false"), new d30() { // from class: l.edd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9144y0.m59418c();
                }
            }));
            this.f38376a.add(vwb.m200311Y("动态切卡：".concat(CoreModule.f17545c.f19663m0.f19467y1.get().booleanValue() ? "true" : "false"), new d30() { // from class: l.fdd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9144y0.m59419d();
                }
            }));
            ArrayList arrayList = this.f38376a;
            final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b = this.f38377b;
            arrayList.add(vwb.m200311Y("移走第一张", new d30() { // from class: l.gdd
                @Override // p149l.d30
                public final void call() {
                    viewTreeObserverOnGlobalLayoutListenerC7866b.act().postDelayed(new Runnable() { // from class: l.hdd
                        @Override // java.lang.Runnable
                        public final void run() {
                            CoreModule.f17545c.f19663m0.m30986C8(BuildConfig.BUILD_TYPE);
                        }
                    }, 500L);
                }
            }));
            this.f38377b.act().showDebugMenu(this.f38376a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$y1 */
    public class RunnableC9145y1 implements Runnable {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$y1$a */
        public class a implements d30 {
            public a() {
            }

            @Override // p149l.d30
            public void call() {
                Conversation conversationQuery = CoreModule.f17553k.f91950m.query("fake_conversation_local_summary_marriage_conversation");
                long jM155944o = mqi0.m155944o();
                if (conversationQuery == null) {
                    conversationQuery = Conversation.new_();
                    conversationQuery.f56011id = "fake_conversation_local_summary_marriage_conversation";
                    double d = jM155944o;
                    conversationQuery.createdTime = d;
                    conversationQuery.latestTime = d;
                    conversationQuery.convType = "default";
                    conversationQuery.localEverHasMessage = true;
                    conversationQuery.unreadMessages = 2;
                } else {
                    conversationQuery.unreadMessages = 3;
                    conversationQuery.latestTime = jM155944o;
                }
                CoreModule.f17545c.f19642f0.m33050mq(conversationQuery);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            CoreModule.f17545c.f19609U.m109085a(new a());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$z */
    public class C9146z implements e30<User> {
        @Override // p149l.e30
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
    public class C9147z0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f38379a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f38380b;

        public C9147z0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f38379a = arrayList;
            this.f38380b = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m59421a() {
            hpd0 hpd0Var = CoreModule.f17545c.f19642f0.f19965p1;
            hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        }

        @Override // p149l.d30
        public void call() {
            this.f38379a.clear();
            this.f38379a.add(vwb.m200311Y("历史消息cell激活 开关：".concat(CoreModule.f17545c.f19642f0.f19965p1.get().booleanValue() ? "true" : "false"), new d30() { // from class: l.idd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.C9147z0.m59421a();
                }
            }));
            this.f38380b.act().showDebugMenu(this.f38379a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$z1 */
    public class RunnableC9148z1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ o45 f38381a;

        public RunnableC9148z1(o45 o45Var) {
            this.f38381a = o45Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38381a.show();
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f38252b = new hpd0("chat_new_match_with_strategy", bool);
        f38253c = new hpd0("chat_new_match_without_strategy", bool);
        f38254d = new hpd0("refreshBanCard", bool);
        f38255e = new tpd0("refreshCardTime", -1);
        f38256f = false;
        f38257g = new tpd0("new_message_exp", 0);
        f38258h = new hpd0("click_to_end", bool);
        f38259i = new hpd0("debug_compliment_mock_enabled", bool);
        f38260j = new String[][]{new String[]{"received_paid", "paid", "0"}, new String[]{"received_free", "free", "1"}};
    }

    /* JADX INFO: renamed from: A1 */
    public static /* synthetic */ void m58156A1() {
        hpd0 hpd0Var = lra0.f129474B;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        if (lra0.f129474B.get().booleanValue()) {
            lra0.f129475C.put(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: A3 */
    public static /* synthetic */ void m58158A3(MatchSuccessAnimTime matchSuccessAnimTime, String str) {
        try {
            matchSuccessAnimTime.female_enter_time = Integer.parseInt(str);
            CoreModule.f17545c.f19639e0.f149360e3.put(matchSuccessAnimTime.toJson());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: A4 */
    public static /* synthetic */ void m58159A4(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("首页启动介绍弹窗", new d30() { // from class: l.x8d
            @Override // p149l.d30
            public final void call() {
                new sci(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "").show();
            }
        }));
        arrayList.add(vwb.m200311Y("首页启动介绍弹窗清除本地记录", new d30() { // from class: l.y8d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58258Ef();
            }
        }));
        arrayList.add(vwb.m200311Y("购买弹窗", new d30() { // from class: l.z8d
            @Override // p149l.d30
            public final void call() {
                C8764c.m53427T(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            }
        }));
        arrayList.add(vwb.m200311Y("全屏购买 - 探探信用分", new d30() { // from class: l.a9d
            @Override // p149l.d30
            public final void call() {
                new r5b0.C19640a(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m177924h(vwb.m200324f0(PurchaseType.TYPE_FEMALE_VIP), vwb.m200324f0(Privilege.pick_tantan_credits_users)).m177926j();
            }
        }));
        arrayList.add(vwb.m200311Y("全屏购买 - 解锁更了解他模块", new d30() { // from class: l.b9d
            @Override // p149l.d30
            public final void call() {
                new r5b0.C19640a(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m177924h(vwb.m200324f0(PurchaseType.TYPE_FEMALE_VIP), vwb.m200324f0(Privilege.unlock_learn_about_him_module)).m177926j();
            }
        }));
        arrayList.add(vwb.m200311Y("全屏购买 - 隐私", new d30() { // from class: l.c9d
            @Override // p149l.d30
            public final void call() {
                new r5b0.C19640a(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m177924h(vwb.m200324f0(PurchaseType.TYPE_FEMALE_VIP), vwb.m200324f0(Privilege.privacy_membership)).m177926j();
            }
        }));
        arrayList.add(vwb.m200311Y("全屏购买 - 广告免打扰", new d30() { // from class: l.d9d
            @Override // p149l.d30
            public final void call() {
                new r5b0.C19640a(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m177924h(vwb.m200324f0(PurchaseType.TYPE_FEMALE_VIP), vwb.m200324f0(Privilege.ads_not_disturb)).m177926j();
            }
        }));
        arrayList.add(vwb.m200311Y("全屏购买 - 屏蔽骚扰词", new d30() { // from class: l.e9d
            @Override // p149l.d30
            public final void call() {
                new r5b0.C19640a(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m177924h(vwb.m200324f0(PurchaseType.TYPE_FEMALE_VIP), vwb.m200324f0(Privilege.block_harassing_words)).m177926j();
            }
        }));
        arrayList.add(vwb.m200311Y("首页女性会员插卡", new d30() { // from class: l.f9d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58631W4();
            }
        }));
        arrayList.add(vwb.m200311Y("清空女性会员引导卡的滑卡数据", new d30() { // from class: l.h9d
            @Override // p149l.d30
            public final void call() {
                idi.m135447c().m135459m();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: A5 */
    public static /* synthetic */ void m58160A5(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        h7j.m129713Y("marriage", CoreModule.m29932K().me_());
        h7j.m129714Z(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "marriage", "找个人领证");
    }

    /* JADX INFO: renamed from: A6 */
    public static /* synthetic */ void m58161A6(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("toggle实验组", new d30() { // from class: l.m3d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58743ba();
            }
        }));
        arrayList.add(vwb.m200311Y("toggle性别", new d30() { // from class: l.n3d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58344Id();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Aa */
    public static /* synthetic */ void m58165Aa(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        puk0.m171431e().m171437h("antispam");
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().startActivity(VerificationAct.m59464m2(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), 2, "id_ability"));
    }

    /* JADX INFO: renamed from: Ab */
    public static /* synthetic */ void m58166Ab() {
        hpd0 hpd0Var = lra0.f129521l;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Ac */
    public static /* synthetic */ void m58167Ac(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        if (NullChecker.m81303a(viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2().mo38809d())) {
            ((NewNewProfileCard) viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2().mo38809d()).mo35149Q0();
        }
    }

    /* JADX INFO: renamed from: Ae */
    public static /* synthetic */ void m58169Ae() {
        hpd0 hpd0Var = CoreModule.f17545c.f19663m0.f19380V0;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        CoreModule.f17545c.f19663m0.f19383W0.put(bool);
    }

    /* JADX INFO: renamed from: Af */
    public static /* synthetic */ void m58170Af(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("SVIP低价召回优惠券领取弹窗", new d30() { // from class: l.i0d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58665Xh(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("SVIP低价召回大页面", new d30() { // from class: l.j0d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58765ca(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("SVIP低价召回情况SP缓存", new d30() { // from class: l.k0d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59122sg();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Ah */
    public static /* synthetic */ void m58172Ah(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        jj4 jj4VarMo38818o = viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2().mo38818o();
        CoreSuggested.UserInfo userInfoM141746e = jj4VarMo38818o.m141746e();
        if (userInfoM141746e == null) {
            osi0.m165783g("顶部卡片无 UserInfo");
            return;
        }
        SuggestedComplimentItem suggestedComplimentItem = new SuggestedComplimentItem();
        suggestedComplimentItem.receiverId = jj4VarMo38818o.m141745d().f56011id;
        suggestedComplimentItem.senderId = "debug_sender";
        suggestedComplimentItem.type = BuildConfig.BUILD_TYPE;
        suggestedComplimentItem.value = "Debug compliment";
        suggestedComplimentItem.media = null;
        suggestedComplimentItem.nullCheck();
        userInfoM141746e.compliment = suggestedComplimentItem;
        osi0.m165783g("已添加 compliment");
    }

    /* JADX INFO: renamed from: Aj */
    public static void m58174Aj(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("购买弹窗 空 sku 测试", new d30() { // from class: l.apc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58387Kc();
            }
        }));
    }

    /* JADX INFO: renamed from: Ak */
    public static void m58175Ak(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("滑卡上滑push", new C9071d1(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: B0 */
    public static /* synthetic */ void m58177B0(nt30 nt30Var, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
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
        nt30Var.m161085A8(pushMessageNew_);
        hdb0.m130575c().m130582i(new ybx(Act.foreground_().f15343a.get(), Act.foreground_().f15343a.get().getString(R$string.f19096yh), 10, CoreModule.m29932K().me_().m60124fp().profileSmall()));
        viewTreeObserverOnGlobalLayoutListenerC7866b.m37365u6(CoreModule.f17545c.f19639e0.m169527p9().m60124fp().url, viewTreeObserverOnGlobalLayoutListenerC7866b.act().string(R$string.f18039Pm), ShareConstants.OLD_VERSION, 1, 1, null, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, null);
    }

    /* JADX INFO: renamed from: B1 */
    public static /* synthetic */ void m58178B1() {
        hpd0 hpd0Var = lra0.f129516i0;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        hpd0 hpd0Var2 = lra0.f129514h0;
        Boolean bool = Boolean.FALSE;
        hpd0Var2.put(bool);
        lra0.f129518j0.put(bool);
        lra0.f129520k0.put(bool);
    }

    /* JADX INFO: renamed from: B2 */
    public static /* synthetic */ void m58179B2(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("定位权限挽留", new d30() { // from class: l.ipc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), new Runnable() { // from class: l.b8d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b3 = viewTreeObserverOnGlobalLayoutListenerC7866b2;
                        e4w.m114721i(viewTreeObserverOnGlobalLayoutListenerC7866b3.act(), new d30() { // from class: l.x8c
                            @Override // p149l.d30
                            public final void call() {
                                viewTreeObserverOnGlobalLayoutListenerC7866b3.m37366v2().m161125K8();
                            }
                        }, null, false);
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.m200311Y("定位权限挽留选择", new d30() { // from class: l.jpc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), new Runnable() { // from class: l.nzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b3 = viewTreeObserverOnGlobalLayoutListenerC7866b2;
                        e4w.m114721i(viewTreeObserverOnGlobalLayoutListenerC7866b3.act(), new d30() { // from class: l.xad
                            @Override // p149l.d30
                            public final void call() {
                                viewTreeObserverOnGlobalLayoutListenerC7866b3.m37366v2().m161125K8();
                            }
                        }, new d30() { // from class: l.zad
                            @Override // p149l.d30
                            public final void call() {
                                DebugUtil.m58544S1();
                            }
                        }, true);
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.m200311Y("定位权限挽留for feed", new d30() { // from class: l.kpc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), new Runnable() { // from class: l.o3d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b3 = viewTreeObserverOnGlobalLayoutListenerC7866b2;
                        e4w.m114722j(viewTreeObserverOnGlobalLayoutListenerC7866b3.act(), new d30() { // from class: l.ead
                            @Override // p149l.d30
                            public final void call() {
                                viewTreeObserverOnGlobalLayoutListenerC7866b3.m37366v2().m161125K8();
                            }
                        }, null, false, true, null);
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.m200311Y("模拟定位刷新", new d30() { // from class: l.lpc
            @Override // p149l.d30
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC7866b.m37366v2().m161125K8();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: B6 */
    public static /* synthetic */ void m58183B6(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("插入消息taps：", new d30() { // from class: l.moc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58814ef(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("新版聊天升温：" + CoreModule.f17545c.f19639e0.f149467s2.get(), new d30() { // from class: l.noc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58531R9();
            }
        }));
        arrayList.add(vwb.m200311Y("是否升温：" + CoreModule.f17545c.f19639e0.f149481u2.get(), new d30() { // from class: l.ooc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59084r0();
            }
        }));
        arrayList.add(vwb.m200311Y("展示邀请", new d30() { // from class: l.poc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                new p5f(viewTreeObserverOnGlobalLayoutListenerC7866b2.act()).m167481E(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), CoreModule.m29931H().userId());
            }
        }));
        arrayList.add(vwb.m200311Y("升温表情全量：" + CoreModule.f17545c.f19639e0.f149488v2.get(), new d30() { // from class: l.qoc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58243E0();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: B7 */
    public static /* synthetic */ void m58184B7() {
        ew40.m118397h().m118404d();
        lsi0.m151595y("已清除");
    }

    /* JADX INFO: renamed from: Ba */
    public static /* synthetic */ void m58187Ba(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("toggle实验组，当前：".concat(CoreModule.f17545c.f19639e0.f149182G6.get().booleanValue() ? "true" : "false"), new d30() { // from class: l.q9d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59062q0();
            }
        }));
        arrayList.add(vwb.m200311Y("是否展示position，当前：".concat(CoreModule.f17545c.f19639e0.f149188H6.get().booleanValue() ? "true" : "false"), new d30() { // from class: l.s9d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59185vd();
            }
        }));
        arrayList.add(new j760("ProfileLoopEditPicFrag", new C9077f(viewTreeObserverOnGlobalLayoutListenerC7866b)));
        arrayList.add(new j760("ProfileLoopMyLifeFrag, add_tag_to_photo", new C9081g(viewTreeObserverOnGlobalLayoutListenerC7866b)));
        arrayList.add(new j760("ProfileLoopMyLifeFrag, add_photo_to_tag", new C9085h(viewTreeObserverOnGlobalLayoutListenerC7866b)));
        arrayList.add(new j760("ProfileLoopMyLifeFrag, from_complete_equity_guide_card", new C9089i(viewTreeObserverOnGlobalLayoutListenerC7866b)));
        arrayList.add(new j760("ProfileLoopMyLifeFrag, from_complete_equity_guide", new C9093j(viewTreeObserverOnGlobalLayoutListenerC7866b)));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Bb */
    public static /* synthetic */ void m58188Bb() {
        hpd0 hpd0Var = lra0.f129523m;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Bc */
    public static /* synthetic */ void m58189Bc(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        C7926u c7926u = new C7926u();
        c7926u.f22053a.put(0);
        c7926u.f22054b.put(0L);
        h7j.m129731o();
        h7j.m129716a0(CoreModule.m29932K().me_(), viewTreeObserverOnGlobalLayoutListenerC7866b.act(), null, "swipe_card");
    }

    /* JADX INFO: renamed from: Be */
    public static /* synthetic */ void m58191Be(Throwable th) {
    }

    /* JADX INFO: renamed from: Bj */
    public static void m58196Bj(final Act act) {
        i0e.m133795d(act).m133814D(10).m133825r("输入插入Userid").m133816F(new e30() { // from class: l.ntc
            @Override // p149l.e30
            public final void call(Object obj) {
                e51.m114743H(act, new Runnable() { // from class: l.g0d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m58324Hf(str);
                    }
                }, 1000L);
            }
        }).m133821n().show();
    }

    /* JADX INFO: renamed from: Bk */
    public static void m58197Bk(ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("测试环境调整划卡活跃天数", new d30() { // from class: l.iuc
            @Override // p149l.d30
            public final void call() {
                i0e.m133795d(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m133825r("输入天数（2-9）").m133816F(new e30() { // from class: l.t6d
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m59144tg((String) obj);
                    }
                }).m133821n().show();
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m58198C() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149166E4;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: C1 */
    public static /* synthetic */ void m58200C1(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("首页启动介绍弹窗", new d30() { // from class: l.x6d
            @Override // p149l.d30
            public final void call() {
                new peq0(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "").show();
            }
        }));
        arrayList.add(vwb.m200311Y("首页启动介绍弹窗清除本地记录", new d30() { // from class: l.y6d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59000n4();
            }
        }));
        arrayList.add(vwb.m200311Y("购买弹窗", new d30() { // from class: l.z6d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58948ki(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("购买全屏 - 漫游", new d30() { // from class: l.a7d
            @Override // p149l.d30
            public final void call() {
                C8764c.m53422Q0(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "", Privilege.youth_roaming);
            }
        }));
        arrayList.add(vwb.m200311Y("购买全屏 - 搭子", new d30() { // from class: l.b7d
            @Override // p149l.d30
            public final void call() {
                C8764c.m53422Q0(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "", Privilege.youth_find_partner);
            }
        }));
        arrayList.add(vwb.m200311Y("购买全屏 - 盲盒", new d30() { // from class: l.d7d
            @Override // p149l.d30
            public final void call() {
                C8764c.m53422Q0(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "", Privilege.youth_blind_box);
            }
        }));
        arrayList.add(vwb.m200311Y("购买全屏 - 已读", new d30() { // from class: l.e7d
            @Override // p149l.d30
            public final void call() {
                C8764c.m53422Q0(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "", Privilege.youth_message_read);
            }
        }));
        arrayList.add(vwb.m200311Y("购买全屏 - 超级喜欢", new d30() { // from class: l.f7d
            @Override // p149l.d30
            public final void call() {
                C8764c.m53422Q0(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "", Privilege.youth_superlike);
            }
        }));
        arrayList.add(vwb.m200311Y("漫游", new d30() { // from class: l.g7d
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().startActivity(VipLocationHistoryAct.m56276V1(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), "p_youthvip_page"));
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: C6 */
    public static /* synthetic */ void m58205C6() {
        C4736e c4736e = CoreModule.f17545c.f19645g0;
        C4736e.f19767E0.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: C8 */
    public static /* synthetic */ void m58207C8(hpd0 hpd0Var, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            CoreModule.f17545c.f19642f0.m32575Ae();
        } else if (hpd0Var.get().booleanValue()) {
            hpd0Var.put(Boolean.FALSE);
        } else {
            hpd0Var.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: Cb */
    public static /* synthetic */ void m58210Cb() {
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = CoreModule.f17545c.f19663m0.f19394a0.m221515e();
        int size = CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded.size() - 1;
        CoreSuggested.UserInfo userInfo = CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded.get(size);
        userInfo.preSwipedDirection = SwipeDirection.RIGHT;
        List<CoreSuggested.UserInfo> list = CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded;
        list.remove(size);
        list.add(0, userInfo);
        CoreModule.f17545c.f19663m0.f19394a0.m132487l(new PartialListOpt<>(list, partialListOptM221515e.links));
    }

    /* JADX INFO: renamed from: Cc */
    public static /* synthetic */ void m58211Cc() {
        CityCData cityCDataNew_ = CityCData.new_();
        cityCDataNew_.userId = CoreModule.f17545c.f19639e0.m169527p9().f56011id;
        cityCDataNew_.expireAt = mqi0.m155944o() + 3600000;
        CoreModule.f17545c.f19650h2.f118818V.m132487l(vwb.m200311Y(cityCDataNew_, null));
    }

    /* JADX INFO: renamed from: Cg */
    public static /* synthetic */ void m58215Cg() {
        hpd0 hpd0Var = CoreModule.f17545c.f19642f0.f19962o1;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Ch */
    public static /* synthetic */ void m58216Ch() {
        CoreModule.f17545c.f19664m1.m34722o4();
        lsi0.m151595y("已清除");
    }

    /* JADX INFO: renamed from: Ci */
    public static /* synthetic */ void m58217Ci(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        if (NullChecker.m81303a(viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2()) && NullChecker.m81303a(viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2().mo38809d())) {
            NewNewProfileCard newNewProfileCard = (NewNewProfileCard) viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2().mo38809d();
            mah0.m153729s0().m153763Z0(viewTreeObserverOnGlobalLayoutListenerC7866b, newNewProfileCard, newNewProfileCard.f21799v1, newNewProfileCard.f21737T);
        }
    }

    /* JADX INFO: renamed from: Cj */
    public static void m58218Cj(ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("国际化 see 盲盒", new d30() { // from class: l.cwc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58436Mj(viewTreeObserverOnGlobalLayoutListenerC7866b, false);
            }
        }));
        arrayList.add(vwb.m200311Y("国际化 see 盲盒 测试user 入库", new d30() { // from class: l.dwc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58436Mj(viewTreeObserverOnGlobalLayoutListenerC7866b, true);
            }
        }));
    }

    /* JADX INFO: renamed from: Ck */
    public static void m58219Ck(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("超级喜欢pup", new C9075e1(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m58220D() {
        CoreModule.f17545c.f19663m0.f19380V0.put(Boolean.TRUE);
        CoreModule.f17545c.f19663m0.f19383W0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m58221D0() {
        hpd0 hpd0Var = App.f15381q;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        e51.m114740E();
    }

    /* JADX INFO: renamed from: D1 */
    public static /* synthetic */ void m58222D1() {
    }

    /* JADX INFO: renamed from: D3 */
    public static /* synthetic */ void m58224D3(User user) {
        user.name += "-MOCK用户名字很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长";
    }

    /* JADX INFO: renamed from: D4 */
    public static /* synthetic */ void m58225D4() {
        C22392a<PartialListOpt<CoreSuggested.UserInfo>> c22392a = CoreModule.f17545c.f19663m0.f19394a0;
        c22392a.m132487l(c22392a.m221515e());
    }

    /* JADX INFO: renamed from: D6 */
    public static /* synthetic */ void m58227D6(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PurchaseType.TYPE_GET_VIP);
        arrayList.add(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        new j6b0.C17693a(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), arrayList, null, null).m139941a(1).m139942b(new d30() { // from class: l.oad
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58254Eb();
            }
        }).m139943c(new e30() { // from class: l.pad
            @Override // p149l.e30
            public final void call(Object obj) {
                DebugUtil.m59195w1((PurchaseType) obj);
            }
        }).m139946f(new e30() { // from class: l.qad
            @Override // p149l.e30
            public final void call(Object obj) {
                DebugUtil.m58390Kf((PurchaseType) obj);
            }
        }).m139944d(new e30() { // from class: l.rad
            @Override // p149l.e30
            public final void call(Object obj) {
                DebugUtil.m59156u6((PurchaseType) obj);
            }
        }).m139945e(new g30() { // from class: l.sad
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                DebugUtil.m58986mc((PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).m139947g();
    }

    /* JADX INFO: renamed from: D8 */
    public static /* synthetic */ void m58229D8(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("清除数据", new d30() { // from class: l.p7d
            @Override // p149l.d30
            public final void call() {
                CoreModule.m29932K().mo30735Xd();
            }
        }));
        arrayList.add(vwb.m200311Y("插入消息", new d30() { // from class: l.q7d
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19692v2.m129980C3(viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2().mo38818o().m141745d().f56011id, mqi0.m155944o());
            }
        }));
        arrayList.add(vwb.m200311Y("顶部卡片设置外露喜欢", new d30() { // from class: l.r7d
            @Override // p149l.d30
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2().mo38818o().m141746e().hasLikeMeSlideCardTop = true;
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Da */
    public static /* synthetic */ void m58231Da(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        gxf gxfVar = new gxf(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
        gxfVar.m128575C(CoreModule.f17545c.f19639e0.m169464Z7(), false, "p_suggest_users_home_view");
        gxfVar.show();
    }

    /* JADX INFO: renamed from: Dc */
    public static /* synthetic */ void m58233Dc() {
        ew40.m118397h().m118411o(0L);
        lsi0.m151595y("已清除");
    }

    /* JADX INFO: renamed from: Dd */
    public static /* synthetic */ void m58234Dd() {
        hpd0 hpd0Var = lra0.f129531r;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Dj */
    public static void m58240Dj(ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("国际化 520", new d30() { // from class: l.unc
            @Override // p149l.d30
            public final void call() {
                qff0.INSTANCE.m174302n(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), 1);
            }
        }));
    }

    /* JADX INFO: renamed from: Dk */
    public static void m58241Dk(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("滑卡限制", new C9110n0(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m58242E() {
        CoreModule.f17545c.f19639e0.f149497w4.put(Boolean.TRUE);
        C4371a.m21100p().m21126w(true);
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ void m58243E0() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149488v2;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: E1 */
    public static /* synthetic */ void m58244E1(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), WXEntryActivity.APPID);
        if (!iwxapiCreateWXAPI.isWXAppInstalled()) {
            lsi0.m151595y(CoreModule.f17544b.getString(com.p046p1.mobile.putong.core.pay.R$string.f27364Y9));
            return;
        }
        WXLaunchMiniProgram.Req req = new WXLaunchMiniProgram.Req();
        req.userName = "gh_3a849b303c14";
        req.path = "pages/association/index?publicId=";
        req.miniprogramType = 0;
        iwxapiCreateWXAPI.sendReq(req);
    }

    /* JADX INFO: renamed from: E2 */
    public static /* synthetic */ void m58245E2() {
        hpd0 hpd0Var = lra0.f129499a;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: E3 */
    public static /* synthetic */ void m58246E3(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        q89 q89Var = CoreModule.f17545c.f19672p0;
        q89Var.f153141S = 0.25d;
        q89Var.f153143U = 0.19d;
        bo5.m102901l(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), m58415Lj(viewTreeObserverOnGlobalLayoutListenerC7866b), BuildConfig.BUILD_TYPE, null);
    }

    /* JADX INFO: renamed from: E4 */
    public static /* synthetic */ void m58247E4() {
        hpd0 hpd0Var = CoreModule.f17545c.f19663m0.f19360N1;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: E7 */
    public static /* synthetic */ void m58250E7() {
    }

    /* JADX INFO: renamed from: E9 */
    public static /* synthetic */ void m58252E9(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        Window window = viewTreeObserverOnGlobalLayoutListenerC7866b.act().getWindow();
        if (window != null) {
            window.setSoftInputMode(3);
        }
        e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), new RunnableC9122r(viewTreeObserverOnGlobalLayoutListenerC7866b), 1000L);
    }

    /* JADX INFO: renamed from: Ea */
    public static /* synthetic */ void m58253Ea() {
        hpd0 hpd0Var = lra0.f129532s;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        lra0.f129533t.put(bool);
    }

    /* JADX INFO: renamed from: Eb */
    public static /* synthetic */ void m58254Eb() {
    }

    /* JADX INFO: renamed from: Ec */
    public static /* synthetic */ void m58255Ec() {
        hpd0 hpd0Var = lra0.f129508e0;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        lra0.f129506d0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: Ed */
    public static /* synthetic */ void m58256Ed(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        PurchaseType purchaseType = PurchaseType.TYPE_SVIP_PICKS_MEMBERSHIP;
        new C8778c.a(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), purchaseType, null).m54094g(fy80.m123714j(purchaseType.getPrivilegeData(null), Privilege.picksMembership)).m54095h();
    }

    /* JADX INFO: renamed from: Ee */
    public static /* synthetic */ void m58257Ee(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("查看一键配对本地缓存信息", new d30() { // from class: l.s1d
            @Override // p149l.d30
            public final void call() {
                ew40.m118397h().m118405e();
            }
        }));
        arrayList.add(vwb.m200311Y("清除一键配对本地缓存信息", new d30() { // from class: l.t1d
            @Override // p149l.d30
            public final void call() {
                ew40.m118397h().m118403c();
            }
        }));
        arrayList.add(vwb.m200311Y("一键配对探探币确认使用弹窗", new d30() { // from class: l.u1d
            @Override // p149l.d30
            public final void call() {
                C8456b.m47621B(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), null, PurchaseType.TYPE_O_DIAMOND);
            }
        }));
        arrayList.add(vwb.m200311Y("一键配对探探币购买弹窗", new d30() { // from class: l.v1d
            @Override // p149l.d30
            public final void call() {
                swh0.m186259q1(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "", CoreModule.f17545c.f19570H0.m210318A4());
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Ef */
    public static /* synthetic */ void m58258Ef() {
        CoreModule.f17545c.f19561E0.m203799v3();
        lsi0.m151595y("已清除");
    }

    /* JADX INFO: renamed from: Eh */
    public static /* synthetic */ void m58260Eh() {
        hpd0 hpd0Var = CoreModule.f17545c.f19580K1.f20007V;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Ej */
    public static void m58262Ej() {
        e51.m114774y(new Runnable() { // from class: l.kzc
            @Override // java.lang.Runnable
            public final void run() {
                DebugUtil.m58881hg();
            }
        });
    }

    /* JADX INFO: renamed from: Ek */
    public static void m58263Ek(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("1v1", new C9124r1(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: F1 */
    public static /* synthetic */ void m58266F1() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149497w4;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: F2 */
    public static /* synthetic */ void m58267F2() {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.moment_user_state);
        messageNew_.extData = MessageExtData.new_();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sourceFlag", "1");
            jSONObject.put("emotionUrl", "http://cloud.staging2.p1staff.com/v1/videos/eyJpZCI6IllVTUVVRkRCM1lVSVRDNDRUTkwzWVM0NEpVQU5VNTAxIiwidyI6NDgwLCJoIjo0ODAsImQiOjE1LCJtdCI6InZpZGVvL21wNCIsImRoIjo1Mjc3ODQ4MzZ9");
            jSONObject.put("emotionText", "吃瓜");
            messageNew_.extData.extra = jSONObject.toString(1);
            CoreModule.f17545c.f19642f0.f19963o2.clear();
            CoreModule.f17545c.f19642f0.f19963o2.add(messageNew_);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            aag0.m95543a(e);
        }
    }

    /* JADX INFO: renamed from: F3 */
    public static /* synthetic */ void m58268F3() {
        hpd0 hpd0Var = CoreModule.f17545c.f19663m0.f19449s1;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: F4 */
    public static /* synthetic */ void m58269F4() {
    }

    /* JADX INFO: renamed from: F6 */
    public static /* synthetic */ void m58271F6() {
        C8455a.m47588w().m47613s().clear();
        C8455a.m47588w().m47614t().clear();
        C8455a.m47588w().m47612r().clear();
        C8455a.m47588w().m47611q().clear();
        C8455a.m47588w().m47618y().clear();
        C8455a.m47588w().m47617x().clear();
    }

    /* JADX INFO: renamed from: F7 */
    public static /* synthetic */ void m58272F7() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149346c5;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: F9 */
    public static /* synthetic */ void m58274F9() {
        PushMessage pushMessage = new PushMessage();
        pushMessage.intent = "newMaleUserLike.received";
        CoreBusinessModule.f17535e.m171128n("", "", "", pushMessage, null);
    }

    /* JADX INFO: renamed from: Fc */
    public static /* synthetic */ void m58277Fc(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        if (NullChecker.m81303a(viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2()) && NullChecker.m81303a(viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2().mo38809d())) {
            mah0.m153729s0().m153771i1(viewTreeObserverOnGlobalLayoutListenerC7866b, (NewNewProfileCard) viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2().mo38809d(), viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2().mo38813j(), 0);
        }
    }

    /* JADX INFO: renamed from: Fd */
    public static /* synthetic */ void m58278Fd() {
        List<LiteraturesComments> listM59445l = BookMoviesDramasHelper.m59445l(CoreModule.m29931H().userId());
        if (listM59445l.isEmpty()) {
            return;
        }
        listM59445l.toString();
    }

    /* JADX INFO: renamed from: Ff */
    public static /* synthetic */ void m58280Ff() {
        Relationship relationship = new Relationship();
        relationship.status = new ArrayList();
        tpd0 tpd0Var = new tpd0("LIKE_USER", 0);
        for (int iIntValue = (tpd0Var.get().intValue() * 300) + 32000; iIntValue < ((tpd0Var.get().intValue() + 1) * 300) + 32000; iIntValue++) {
            C4759y.m34901i3(iIntValue + "", relationship).materialize().subscribe();
        }
        lsi0.m151595y(String.format("第 %s 组 300 人喜欢我", Integer.valueOf(tpd0Var.get().intValue() + 1)));
        tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
    }

    /* JADX INFO: renamed from: Fg */
    public static /* synthetic */ void m58281Fg(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        Merchandise merchandise = (Merchandise) vwb.m200346r(CoreModule.f17545c.f19654j0.m30580E4().m221515e(), new w9j() { // from class: l.uad
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Merchandise merchandise2 = (Merchandise) obj;
                return Boolean.valueOf(TEnum.equals(merchandise2.category, ProductCategory.tttVip) && merchandise2.monthly() && merchandise2.autoRenewable());
            }
        });
        if (merchandise.getCouponForPromotion(MonetizationPromotionsId.trial7DVIP) != null) {
            new rnl0().m180122s(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), merchandise);
        } else {
            lsi0.m151595y("商品或者优惠券为空");
        }
    }

    /* JADX INFO: renamed from: Fh */
    public static /* synthetic */ void m58282Fh() {
        hpd0 hpd0Var = lra0.f129518j0;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        hpd0 hpd0Var2 = lra0.f129516i0;
        Boolean bool = Boolean.FALSE;
        hpd0Var2.put(bool);
        lra0.f129514h0.put(bool);
        lra0.f129520k0.put(bool);
    }

    /* JADX INFO: renamed from: Fi */
    public static void m58283Fi(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("Alerts通用", new C9115o1(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: Fj */
    public static void m58284Fj(e30<User> e30Var, int i) {
        final PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = CoreModule.f17545c.f19663m0.f19394a0.m221515e();
        List<CoreSuggested.UserInfo> list = partialListOptM221515e.loaded;
        if (vwb.m200296J(list)) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        Iterator<CoreSuggested.UserInfo> it = list.iterator();
        while (it.hasNext()) {
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(it.next().f19472id);
            if (userM169430Pa != null) {
                User user = new User() { // from class: com.p1.mobile.putong.core.util.DebugUtil.40
                    boolean isMerged = false;

                    @Override // com.p046p1.mobile.putong.data.User, com.tantanapp.common.data.ValueObject
                    public boolean shouldMergeData() {
                        if (this.isMerged) {
                            return false;
                        }
                        this.isMerged = true;
                        return true;
                    }
                };
                user.mergeData(userM169430Pa);
                user.f56011id = userM169430Pa.f56011id;
                user._id = userM169430Pa._id;
                e30Var.call(user);
                arrayList.add(user);
                i--;
                if (i <= 0) {
                    break;
                }
            }
        }
        C22306c.fromCallable(new Callable() { // from class: l.otc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return DebugUtil.m58737b4(arrayList);
            }
        }).compose(mkd0.m154951C()).subscribe(mkd0.m154955G(new e30() { // from class: l.ptc
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19663m0.f19394a0.m132487l(partialListOptM221515e);
            }
        }));
    }

    /* JADX INFO: renamed from: Fk */
    public static void m58285Fk(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("聊天详情页内切换新会话", new C9079f1(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: G1 */
    public static /* synthetic */ void m58288G1() {
    }

    /* JADX INFO: renamed from: G2 */
    public static /* synthetic */ void m58289G2() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149239P1;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: G4 */
    public static /* synthetic */ void m58291G4() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149240P2;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: G5 */
    public static /* synthetic */ void m58292G5(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        s8b0.m182584e("2170");
        if (NullChecker.m81303a(uld0.m194221i("[{\"channel\":\"buy\",\"privilegeType\":\"roaming\",\"count\":0,\"remaining\":0,\"duration\":7776000,\"expireAt\":1699340315},{\"channel\":\"buy\",\"privilegeType\":\"seeWhoLikedMe\",\"count\":0,\"remaining\":0,\"duration\":7776000,\"expireAt\":1699340315},{\"channel\":\"buy\",\"privilegeType\":\"superLikeMembership\",\"count\":0,\"remaining\":0,\"duration\":7776000,\"expireAt\":1699340315},{\"channel\":\"buy\",\"privilegeType\":\"svip\",\"count\":0,\"remaining\":0,\"duration\":7776000,\"expireAt\":1699340315},{\"channel\":\"buy\",\"privilegeType\":\"undoMembership\",\"count\":0,\"remaining\":0,\"duration\":7776000,\"expireAt\":1699340315},{\"channel\":\"buy\",\"privilegeType\":\"unlimitedSwipes\",\"count\":0,\"remaining\":0,\"duration\":7776000,\"expireAt\":1699340315},{\"channel\":\"buy\",\"privilegeType\":\"vip\",\"count\":0,\"remaining\":0,\"duration\":7776000,\"expireAt\":1699340315},{\"channel\":\"buy\",\"privilegeType\":\"quickchatMembership\",\"count\":0,\"remaining\":0,\"duration\":7776000,\"expireAt\":1699340315},{\"channel\":\"give\",\"privilegeType\":\"superLike\",\"count\":5,\"remaining\":10,\"duration\":0,\"expireAt\":0},{\"channel\":\"give\",\"privilegeType\":\"quickchatNumber\",\"count\":5,\"remaining\":12,\"duration\":0,\"expireAt\":0},{\"channel\":\"give\",\"privilegeType\":\"boost\",\"count\":1,\"remaining\":4,\"duration\":0,\"expireAt\":0}]").second)) {
            s8b0.m182583d(1);
        } else {
            s8b0.m182583d(0);
        }
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().startActivity(AccessTokenWebViewAct.m80155k2(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "", "http://m.staging2.p1staff.com/commerce/svip?expiresTime=1699340315000&time=1699339716000&duration=7776000&showGift=true&avatarURL=http://cloud.staging2.p1staff.com/v1/images/eyJpZCI6Ik8zNVk2RDVPTjZZN0EyM0M1MlJJRUkzSkQ3UlNEQzAwIiwidyI6MTQ0MCwiaCI6MTQ0MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjEzMTYzMjAxNTczMzEzNjg1NzY0fQ&gender=male&startBoost=false&name=%E4%B8%83%E5%85%AB%E5%85%AB%E5%9B%9B", true, false, true, true));
    }

    /* JADX INFO: renamed from: G8 */
    public static /* synthetic */ void m58295G8(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("城市封面 没人购买", new d30() { // from class: l.b2d
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), new DebugUtil.RunnableC9130t1(new m45(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), "")), 300L);
            }
        }));
        arrayList.add(vwb.m200311Y("城市封面 自己购买后", new d30() { // from class: l.c2d
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), new DebugUtil.RunnableC9133u1(new m45(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), "")), 300L);
            }
        }));
        arrayList.add(vwb.m200311Y("城市封面 查看其他人购买", new d30() { // from class: l.d2d
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), new DebugUtil.RunnableC9136v1(new m45(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), "")), 300L);
            }
        }));
        arrayList.add(vwb.m200311Y("城市封面 确认", new d30() { // from class: l.e2d
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), new DebugUtil.RunnableC9139w1(new m45(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), "")), 300L);
            }
        }));
        arrayList.add(vwb.m200311Y("城市封面 购买成功", new d30() { // from class: l.f2d
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), new DebugUtil.RunnableC9148z1(new o45(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), "")), 300L);
            }
        }));
        arrayList.add(vwb.m200311Y("城市封面 清理购买成功插卡标记:" + CoreModule.f17545c.f19663m0.f19327C1.get(), new d30() { // from class: l.g2d
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19663m0.f19327C1.put(Boolean.FALSE);
            }
        }));
        arrayList.add(vwb.m200311Y("城市封面 测试收到 CoreCityTop 插卡:" + CoreModule.f17545c.f19663m0.f19330D1.get(), new d30() { // from class: l.h2d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58346If();
            }
        }));
        arrayList.add(vwb.m200311Y("城市封面 购买成功插卡", new d30() { // from class: l.i2d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58211Cc();
            }
        }));
        arrayList.add(vwb.m200311Y("城市置顶，清除活跃时间", new d30() { // from class: l.j2d
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19650h2.m142336C3().subscribe(mkd0.m154950B());
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: G9 */
    public static /* synthetic */ void m58296G9() {
        CoreModule.f17545c.f19689u2.f175585R.clear();
        CoreModule.f17545c.f19689u2.f175586S.clear();
        CoreModule.f17545c.f19689u2.f175588U.clear();
        CoreModule.f17545c.f19689u2.f175587T.clear();
        CoreModule.f17545c.f19689u2.f175589V.clear();
        CoreModule.f17545c.f19689u2.f175590W.clear();
        CoreModule.f17545c.f19689u2.f175591X.clear();
    }

    /* JADX INFO: renamed from: Gb */
    public static /* synthetic */ void m58298Gb() {
        hpd0 hpd0Var = CoreModule.f17545c.f19663m0.f19339G1;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Gc */
    public static /* synthetic */ void m58299Gc() {
        hpd0 hpd0Var = lra0.f129477E;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Gd */
    public static /* synthetic */ void m58300Gd() {
        hpd0 hpd0Var = CoreModule.f17545c.f19663m0.f19333E1;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Ge */
    public static /* synthetic */ void m58301Ge() {
        tpd0 tpd0Var = new tpd0("tantanAuthSwipeNotifyDefaultCount", 0);
        zpd0 zpd0Var = new zpd0("tantanAuthSwipeNotifyDefaultLastShowTime", 0L);
        uqd0 uqd0Var = new uqd0("tantanAuthSwipeDefaultDate", "");
        new zpd0("tantanAuthSwipeDefaultCount", 0L).put(0L);
        tpd0Var.put(0);
        uqd0Var.put("");
        zpd0Var.put(0L);
        tpd0 tpd0Var2 = new tpd0("tantanAuthSwipeNotifyCount", 0);
        zpd0 zpd0Var2 = new zpd0("tantanAuthSwipeNotifyLastShowTime", 0L);
        uqd0 uqd0Var2 = new uqd0("tantanAuthSwipeDate", "");
        new zpd0("tantanAuthSwipeCount", 0L).put(0L);
        tpd0Var2.put(0);
        uqd0Var2.put("");
        zpd0Var2.put(0L);
        tpd0 tpd0Var3 = new tpd0("tantanAuthGuideCount", 0);
        zpd0 zpd0Var3 = new zpd0("tantanAuthGuideLastShowTime", 0L);
        tpd0Var3.put(0);
        zpd0Var3.put(0L);
        new tpd0("tantanAuthTipsShowTimes", 0).put(0);
        new uqd0("tantanAuthTipsShowDate", null).put("");
        new vqd0("tantanAuthTipsShowUser", new HashSet()).put(new HashSet());
        new tpd0("tantanAuthToastShowTimes", 0).put(0);
        new uqd0("tantanAuthToastShowDate", null).put("");
        new vqd0("tantanAuthToastShowUser", new HashSet()).put(new HashSet());
    }

    /* JADX INFO: renamed from: Gg */
    public static /* synthetic */ void m58303Gg() {
        hpd0 hpd0Var = lra0.f129485M;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Gi */
    public static void m58305Gi(final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        VButton vButton = new VButton(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
        vButton.setText("Debug");
        vButton.setPadding(t100.m186890d(30.0f), t100.m186890d(30.0f), t100.m186890d(30.0f), t100.m186890d(30.0f));
        vButton.setBackgroundColor(-16711936);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        layoutParams.topMargin = t100.m186890d(-180.0f);
        viewTreeObserverOnGlobalLayoutListenerC7866b.f21916a.addView(vButton, layoutParams);
        xdl0.m208329E0(vButton, new View.OnClickListener() { // from class: l.xzc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugUtil.m58401L5(viewTreeObserverOnGlobalLayoutListenerC7866b, view);
            }
        });
        VButton vButton2 = new VButton(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
        vButton2.setText("Debug");
        vButton2.setPadding(t100.m186890d(30.0f), t100.m186890d(30.0f), t100.m186890d(30.0f), t100.m186890d(30.0f));
        vButton2.setBackgroundColor(-16711936);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        viewTreeObserverOnGlobalLayoutListenerC7866b.f21916a.addView(vButton2, layoutParams2);
        xdl0.m208329E0(vButton2, new View.OnClickListener() { // from class: l.yzc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.f17545c.f19663m0.m31063W5(1);
            }
        });
        VButton vButton3 = new VButton(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
        vButton3.setBackgroundColor(-16711936);
        vButton3.setText("Refresh");
        vButton3.setPadding(t100.m186890d(30.0f), t100.m186890d(30.0f), t100.m186890d(30.0f), t100.m186890d(30.0f));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        layoutParams3.topMargin = t100.m186890d(130.0f);
        viewTreeObserverOnGlobalLayoutListenerC7866b.f21916a.addView(vButton3, layoutParams3);
        xdl0.m208329E0(vButton3, new View.OnClickListener() { // from class: l.zzc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.f17545c.f19663m0.m31063W5(-1);
            }
        });
    }

    /* JADX INFO: renamed from: Gj */
    public static void m58306Gj(User user, String str, int i) {
        if (qib0.f154722k0.f176631d.query(str) != null) {
            return;
        }
        User userNew_ = User.new_();
        userNew_.f56011id = str;
        userNew_.name = "MockUser" + (i + 1);
        userNew_.gender = Gender.get("female");
        userNew_.pictures = new ArrayList();
        if (user != null && !vwb.m200296J(user.pictures)) {
            Media media = user.pictures.get(0);
            Picture pictureCover = media != null ? media.cover() : null;
            if (pictureCover != null) {
                userNew_.pictures.add(pictureCover.mo223809clone());
            }
        }
        if (vwb.m200296J(userNew_.pictures)) {
            Picture pictureNew_ = Picture.new_();
            pictureNew_.url = "";
            userNew_.pictures.add(pictureNew_);
        }
        qib0.f154722k0.f176631d.upsert(userNew_);
    }

    /* JADX INFO: renamed from: Gk */
    public static void m58307Gk(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("特定行为进四选一", new C9118p1(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m58309H0(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: H1 */
    public static /* synthetic */ void m58310H1() {
        xjc0.m209686a(xjc0.f193198a);
        xjc0.m209686a(xjc0.f193199b);
        xjc0.m209686a(xjc0.f193200c);
        xjc0.m209686a(xjc0.f193201d);
    }

    /* JADX INFO: renamed from: H3 */
    public static /* synthetic */ void m58312H3(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        if (NullChecker.m81303a(viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2().mo38809d())) {
            ((NewNewProfileCard) viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2().mo38809d()).mo35149Q0();
        }
    }

    /* JADX INFO: renamed from: H6 */
    public static /* synthetic */ void m58315H6() {
        String str = "message_read_state_text_guide_shown_" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        new hpd0(str, bool).put(bool);
        lsi0.m151595y("已重置");
    }

    /* JADX INFO: renamed from: Hf */
    public static /* synthetic */ void m58324Hf(String str) {
        if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169430Pa(str))) {
            lsi0.m151580j("有结果");
        } else {
            lsi0.m151580j("空结果");
        }
    }

    /* JADX INFO: renamed from: Hi */
    public static void m58327Hi(final ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, final HashMap<String, hpd0> map) {
        arrayList.add(vwb.m200311Y("AB 实验 Debug 开关", new d30() { // from class: l.pkc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58742b9(map, arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
    }

    /* JADX INFO: renamed from: Hj */
    public static void m58328Hj(final ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("FakeGuide", new d30() { // from class: l.juc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58720a9(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
    }

    /* JADX INFO: renamed from: Hk */
    public static void m58329Hk(final ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("AvatarCards改造", new d30() { // from class: l.luc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58187Ba(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
    }

    /* JADX INFO: renamed from: I1 */
    public static /* synthetic */ void m58332I1() {
        hpd0 hpd0Var = lra0.f129510f0;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: I4 */
    public static /* synthetic */ void m58335I4() {
    }

    /* JADX INFO: renamed from: I5 */
    public static /* synthetic */ void m58336I5() {
        hpd0 hpd0Var = tvf.f172282c;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        tvf.f172281b.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: I7 */
    public static /* synthetic */ void m58338I7() {
        hpd0 hpd0Var = f38258h;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Ib */
    public static /* synthetic */ void m58342Ib() {
        hpd0 hpd0Var = lra0.f129476D;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Id */
    public static /* synthetic */ void m58344Id() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149205K2;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Ie */
    public static /* synthetic */ void m58345Ie() {
        snm.f165470j = true;
        snm.f165467g = true;
        snm.f165468h = true;
        snm.f165469i = true;
    }

    /* JADX INFO: renamed from: If */
    public static /* synthetic */ void m58346If() {
        hpd0 hpd0Var = CoreModule.f17545c.f19663m0.f19330D1;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Ii */
    public static void m58349Ii(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("异常会话处理", new C9114o0(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: Ij */
    public static void m58350Ij(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("引导用户进动态", new C9132u0(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: Ik */
    public static void m58351Ik(final ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("体验弹窗", new d30() { // from class: l.skc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58545S2(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m58352J(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("清除引导标记(气泡、特权入口、访客入口)", new d30() { // from class: l.ezc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58184B7();
            }
        }));
        arrayList.add(vwb.m200311Y("我的tab访客入口标志切换" + ew40.m118397h().m118409l(), new d30() { // from class: l.fzc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58921jd();
            }
        }));
        arrayList.add(vwb.m200311Y("推荐卡片黑金样式", new d30() { // from class: l.gzc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19663m0.m31066W8().subscribe(mkd0.m154955G(new e30() { // from class: l.tad
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        vwb.m200354z(((PartialListOpt) obj).loaded, new e30() { // from class: l.k9c
                            @Override // p149l.e30
                            public final void call(Object obj2) {
                                DebugUtil.m58515Qe((CoreSuggested.UserInfo) obj2);
                            }
                        });
                    }
                }));
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: J1 */
    public static /* synthetic */ void m58354J1() {
        if (NullChecker.m81303a(CoreModule.f17545c) && NullChecker.m81303a(CoreModule.f17545c.f19663m0)) {
            CoreSuggested coreSuggested = CoreModule.f17545c.f19663m0;
            if (coreSuggested.f19396a2.containsKey(coreSuggested.m31137q6())) {
                CoreSuggested coreSuggested2 = CoreModule.f17545c.f19663m0;
                coreSuggested2.f19396a2.remove(coreSuggested2.m31137q6());
            } else {
                CoreSuggested coreSuggested3 = CoreModule.f17545c.f19663m0;
                coreSuggested3.f19396a2.put(coreSuggested3.m31137q6(), 0);
            }
        }
    }

    /* JADX INFO: renamed from: J2 */
    public static /* synthetic */ void m58355J2(String str) {
        Relationship relationship = new Relationship();
        ArrayList arrayList = new ArrayList();
        relationship.status = arrayList;
        arrayList.add(MatchFrom.get(MatchFrom.diamondReceived));
        C4759y.m34901i3(str, relationship).materialize().subscribe();
    }

    /* JADX INFO: renamed from: J9 */
    public static /* synthetic */ void m58362J9() {
        Message messageNew_ = Message.new_();
        tpd0 tpd0Var = App.f15373i;
        messageNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(tpd0Var.get().intValue());
        messageNew_.messageType = MessageType.get(MessageType.moment_user_state);
        messageNew_.createdTime = mqi0.m155944o();
        messageNew_.localCreatedTime = System.nanoTime();
        messageNew_.localCreatedSession = tpd0Var.get().intValue();
        messageNew_.localInConversation = true;
        messageNew_.owner = CoreModule.f17545c.f19639e0.m169520na().f56011id;
        messageNew_.recalled = Boolean.FALSE;
        StateData stateData = new StateData();
        stateData.emotionId = "1";
        stateData.emotionText = "学习";
        stateData.emotionUrl = CoreModule.m29932K().me_().m60124fp().url;
        stateData.value = "找搭子一起学习找搭子一起学习";
        MessageExtData messageExtData = new MessageExtData();
        messageExtData.extra = stateData.toJson();
        messageNew_.extData = messageExtData;
        CoreModule.f17545c.f19642f0.f19963o2.clear();
        CoreModule.f17545c.f19642f0.f19963o2.add(messageNew_);
    }

    /* JADX INFO: renamed from: Ja */
    public static /* synthetic */ void m58363Ja(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = CoreModule.f17545c.f19663m0.f19394a0.m221515e();
        if (partialListOptM221515e.loaded == null) {
            return;
        }
        for (int i = 0; i < Math.min(partialListOptM221515e.loaded.size(), 10); i++) {
            abi.m95622J(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), CoreModule.f17545c.f19639e0.m169430Pa(partialListOptM221515e.loaded.get(i).f19472id));
        }
    }

    /* JADX INFO: renamed from: Jb */
    public static /* synthetic */ void m58364Jb(ArrayList arrayList) {
        arrayList.clear();
        CoreModule.f17545c.f19642f0.f19953l1.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: Jd */
    public static /* synthetic */ void m58366Jd(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("精选插卡", new d30() { // from class: l.a3d
            @Override // p149l.d30
            public final void call() {
                PicksHelper.INSTANCE.m56740b().m56737p(true);
            }
        }));
        arrayList.add(vwb.m200311Y("精选插卡动效", new d30() { // from class: l.b3d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59245y7(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Je */
    public static /* synthetic */ void m58367Je() {
        hpd0 hpd0Var = lra0.f129481I;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Ji */
    public static void m58371Ji(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("检查被ban卡片", new C9083g1(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: Jj */
    public static void m58372Jj(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("心动信号女性路经变短", new C9059a1(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: Jk */
    public static void m58373Jk(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("强制指定认证类型", new C9111n1(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ void m58375K0(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        arrayList.add(PurchaseType.TYPE_O_DIAMOND);
        new j6b0.C17693a(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), arrayList, null, null).m139941a(1).m139942b(new d30() { // from class: l.nbd
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59053pd();
            }
        }).m139943c(new e30() { // from class: l.obd
            @Override // p149l.e30
            public final void call(Object obj) {
                DebugUtil.m58309H0((PurchaseType) obj);
            }
        }).m139946f(new e30() { // from class: l.pbd
            @Override // p149l.e30
            public final void call(Object obj) {
                DebugUtil.m58472Od((PurchaseType) obj);
            }
        }).m139944d(new e30() { // from class: l.qbd
            @Override // p149l.e30
            public final void call(Object obj) {
                DebugUtil.m58580Tg((PurchaseType) obj);
            }
        }).m139945e(new g30() { // from class: l.rbd
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                DebugUtil.m59127t((PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).m139947g();
    }

    /* JADX INFO: renamed from: K1 */
    public static /* synthetic */ void m58376K1() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149477t5;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: K2 */
    public static /* synthetic */ void m58377K2(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("划卡优化开：" + CoreModule.f17545c.f19663m0.f19449s1.get(), new d30() { // from class: l.opc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58268F3();
            }
        }));
        arrayList.add(vwb.m200311Y("底部debug：", new d30() { // from class: l.bqc
            @Override // p149l.d30
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC7866b.act().m39818h7();
            }
        }));
        arrayList.add(vwb.m200311Y("新UiDebug：" + CoreModule.f17545c.f19639e0.f149147B6.get(), new d30() { // from class: l.oqc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58809ea();
            }
        }));
        arrayList.add(vwb.m200311Y("修改按钮样式：", new d30() { // from class: l.arc
            @Override // p149l.d30
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC7866b.f21883J0.setButtonStyleType("oDiamond");
            }
        }));
        arrayList.add(vwb.m200311Y("贴纸Debug：" + CoreModule.f17545c.f19639e0.f149411k6.get(), new d30() { // from class: l.krc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59145th();
            }
        }));
        arrayList.add(vwb.m200311Y("清空贴纸Debug：" + CoreModule.f17545c.f19639e0.f149411k6.get(), new d30() { // from class: l.lrc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19639e0.f149411k6.put(-1);
            }
        }));
        arrayList.add(vwb.m200311Y("划卡debug check：" + CoreModule.f17545c.f19639e0.f149387h6.get(), new d30() { // from class: l.mrc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59164ue();
            }
        }));
        arrayList.add(vwb.m200311Y("划卡debug 返回：" + CoreModule.f17545c.f19639e0.f149395i6.get(), new d30() { // from class: l.nrc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58866h1();
            }
        }));
        arrayList.add(vwb.m200311Y("强制黑金：", new d30() { // from class: l.orc
            @Override // p149l.d30
            public final void call() {
                TabUniteManager.m44953i().m44963r();
            }
        }));
        arrayList.add(vwb.m200311Y("认证成功Bubble", new d30() { // from class: l.prc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), new Runnable() { // from class: l.uyc
                    @Override // java.lang.Runnable
                    public final void run() {
                        rwk0.m181429l(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), false, null);
                    }
                }, 1500L);
            }
        }));
        arrayList.add(vwb.m200311Y("自动滚动", new d30() { // from class: l.qpc
            @Override // p149l.d30
            public final void call() {
                e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), new Runnable() { // from class: l.e5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.f17545c.f19639e0.f149485u6.m132487l(roj0.f160388a);
                    }
                }, 1500L);
            }
        }));
        arrayList.add(vwb.m200311Y("debug默认数据：" + CoreModule.f17545c.f19639e0.f149403j6.get(), new d30() { // from class: l.rpc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59202w8();
            }
        }));
        arrayList.add(vwb.m200311Y("认证相关数据清空：", new d30() { // from class: l.spc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58455Nh();
            }
        }));
        arrayList.add(vwb.m200311Y("划卡上限弹窗：" + C7909m1.f22109g, new d30() { // from class: l.tpc
            @Override // p149l.d30
            public final void call() {
                C7909m1.f22109g = !C7909m1.f22109g;
            }
        }));
        arrayList.add(vwb.m200311Y("认证链路-头像确认：", new d30() { // from class: l.upc
            @Override // p149l.d30
            public final void call() {
                rwk0.m181430m(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), 1, BuildConfig.BUILD_TYPE);
            }
        }));
        arrayList.add(vwb.m200311Y("认证链路-身份证：", new d30() { // from class: l.vpc
            @Override // p149l.d30
            public final void call() {
                rwk0.m181430m(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), 2, BuildConfig.BUILD_TYPE);
            }
        }));
        arrayList.add(vwb.m200311Y("认证链路-认证结果-头像", new d30() { // from class: l.wpc
            @Override // p149l.d30
            public final void call() {
                AvatarResultAct.m56084e2(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), 1);
            }
        }));
        arrayList.add(vwb.m200311Y("认证链路-认证结果-身份证：", new d30() { // from class: l.xpc
            @Override // p149l.d30
            public final void call() {
                AvatarResultAct.m56084e2(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), 2);
            }
        }));
        arrayList.add(vwb.m200311Y("认证链路-认证结果-国家网络：", new d30() { // from class: l.ypc
            @Override // p149l.d30
            public final void call() {
                AvatarResultAct.m56084e2(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), 3);
            }
        }));
        arrayList.add(vwb.m200311Y("添加Debug控制：", new d30() { // from class: l.zpc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58305Gi(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("新Ui demo：", new d30() { // from class: l.cqc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().startActivity(new Intent(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), (Class<?>) LabelDemoAct.class));
            }
        }));
        arrayList.add(vwb.m200311Y("清空网图：", new d30() { // from class: l.dqc
            @Override // p149l.d30
            public final void call() {
                myf.m157022B();
            }
        }));
        arrayList.add(vwb.m200311Y("插入引导填写资料卡：", new d30() { // from class: l.eqc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58845g2();
            }
        }));
        arrayList.add(vwb.m200311Y("清空只看认证数据：", new d30() { // from class: l.fqc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19704z2.m30261x3();
            }
        }));
        arrayList.add(vwb.m200311Y("假请求：" + CoreModule.f17545c.f19704z2.f19227f0.get(), new d30() { // from class: l.gqc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58508Q7();
            }
        }));
        arrayList.add(vwb.m200311Y("开启只看认证：" + CoreModule.f17545c.f19704z2.f19228g0.get(), new d30() { // from class: l.hqc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59223x7();
            }
        }));
        arrayList.add(vwb.m200311Y("展示认证成功后发送弹窗：", new d30() { // from class: l.iqc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().postDelayed(new Runnable() { // from class: l.w8d
                    @Override // java.lang.Runnable
                    public final void run() {
                        psq.m171206V(viewTreeObserverOnGlobalLayoutListenerC7866b2.act());
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.m200311Y("插入新用户优化引导", new d30() { // from class: l.jqc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58416M();
            }
        }));
        arrayList.add(vwb.m200311Y("照镜子忽略年龄：false", new d30() { // from class: l.kqc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59114s8();
            }
        }));
        arrayList.add(vwb.m200311Y("清空新手引导数据", new d30() { // from class: l.nqc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59013nh();
            }
        }));
        arrayList.add(vwb.m200311Y("清除Save标记", new d30() { // from class: l.pqc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58889i2();
            }
        }));
        arrayList.add(vwb.m200311Y("清除理想型Save标记", new d30() { // from class: l.qqc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19580K1.f20005T.put(Boolean.FALSE);
            }
        }));
        arrayList.add(vwb.m200311Y("理想型设置滑动过N：" + CoreModule.f17545c.f19680r2.f113521b0.get(), new d30() { // from class: l.rqc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58883hi();
            }
        }));
        arrayList.add(vwb.m200311Y("插入点赞入口", new d30() { // from class: l.sqc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19580K1.m33238m3();
            }
        }));
        arrayList.add(vwb.m200311Y("每次都展示气泡" + CoreModule.f17545c.f19580K1.f20007V.get(), new d30() { // from class: l.tqc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58260Eh();
            }
        }));
        arrayList.add(vwb.m200311Y("额迈瑞卡：" + CoreModule.f17545c.f19663m0.f19452t1.get() + " - " + qib0.f154717f0, new d30() { // from class: l.uqc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59189vh();
            }
        }));
        StringBuilder sb = new StringBuilder("fake用户mock：");
        sb.append(CoreModule.f17545c.f19639e0.f149166E4.get());
        arrayList.add(vwb.m200311Y(sb.toString(), new d30() { // from class: l.vqc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58198C();
            }
        }));
        arrayList.add(vwb.m200311Y("fake用户买成弹窗：", new d30() { // from class: l.wqc
            @Override // p149l.d30
            public final void call() {
                myf.m157041U(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            }
        }));
        arrayList.add(vwb.m200311Y("跳转memo：", new d30() { // from class: l.yqc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().startActivity(MemojiBuzzAct.INSTANCE.m47013a(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), "memoji_call"));
            }
        }));
        arrayList.add(vwb.m200311Y("划卡日志：" + BifrostLayout.f23321d, new d30() { // from class: l.zqc
            @Override // p149l.d30
            public final void call() {
                BifrostLayout.f23321d = !BifrostLayout.f23321d;
            }
        }));
        arrayList.add(vwb.m200311Y("清理引导标记：", new d30() { // from class: l.brc
            @Override // p149l.d30
            public final void call() {
                nah0.m158679c().m158682a();
            }
        }));
        arrayList.add(vwb.m200311Y("新页面：", new d30() { // from class: l.crc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().postDelayed(new Runnable() { // from class: l.d5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m59027o9(viewTreeObserverOnGlobalLayoutListenerC7866b2);
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.m200311Y("设置打招呼卡：", new d30() { // from class: l.drc
            @Override // p149l.d30
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC7866b.act().postDelayed(new Runnable() { // from class: l.l8d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m59267z7();
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.m200311Y("网络信息：", new d30() { // from class: l.erc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59160ua();
            }
        }));
        arrayList.add(vwb.m200311Y("输入首张User信息：", new d30() { // from class: l.frc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58785d8();
            }
        }));
        arrayList.add(vwb.m200311Y("划卡提示View：" + CoreModule.f17545c.f19663m0.f19455u1.get(), new d30() { // from class: l.grc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58822f1();
            }
        }));
        arrayList.add(vwb.m200311Y("情况引导滑动：", new d30() { // from class: l.hrc
            @Override // p149l.d30
            public final void call() {
                mah0.m153729s0().m153774l1();
            }
        }));
        arrayList.add(vwb.m200311Y("延迟刷新：", new d30() { // from class: l.jrc
            @Override // p149l.d30
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC7866b.act().postDelayed(new Runnable() { // from class: l.m7d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m58225D4();
                    }
                }, 1000L);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: K4 */
    public static /* synthetic */ void m58379K4() {
        GreetingSummary greetingSummaryNew_ = GreetingSummary.new_();
        greetingSummaryNew_.unseen = 0;
        greetingSummaryNew_.latestTime = mqi0.m155944o();
        greetingSummaryNew_.latestUserId = "";
        greetingSummaryNew_.latestMessageId = "";
        CoreModule.f17545c.f19678r0.f20023d0.m132487l(greetingSummaryNew_);
    }

    /* JADX INFO: renamed from: K9 */
    public static /* synthetic */ void m58384K9(User user) {
        Studies studies = user.profile.studies;
        studies.active = true;
        studies.verified = true;
        double dGuessedCurrentServerTime = qib0.f154693H.guessedCurrentServerTime() + 3600000;
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

    /* JADX INFO: renamed from: Ka */
    public static /* synthetic */ void m58385Ka(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("清除限频次数", new d30() { // from class: l.tmc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58901ie();
            }
        }));
        arrayList.add(vwb.m200311Y("当前限频次数", new d30() { // from class: l.zmc
            @Override // p149l.d30
            public final void call() {
                lsi0.m151580j(CoreModule.f17545c.f19571H1.f184112f0.get() + "");
            }
        }));
        arrayList.add(vwb.m200311Y("放开各种频次限制" + CoreModule.f17545c.f19571H1.f184113g0.get(), new d30() { // from class: l.anc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59226xa();
            }
        }));
        arrayList.add(vwb.m200311Y("关闭SvipDebug：" + C8609a.m50246b0(), new d30() { // from class: l.cnc
            @Override // p149l.d30
            public final void call() {
                snm.f165470j = false;
            }
        }));
        arrayList.add(vwb.m200311Y("清除30分钟间隔：", new d30() { // from class: l.dnc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19571H1.m201068a4();
            }
        }));
        arrayList.add(vwb.m200311Y("忽略本地超时：", new d30() { // from class: l.enc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58448Na();
            }
        }));
        arrayList.add(vwb.m200311Y("Svip弹窗：", new d30() { // from class: l.fnc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59224x8();
            }
        }));
        arrayList.add(vwb.m200311Y("探探币购买：", new d30() { // from class: l.gnc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58955l3();
            }
        }));
        arrayList.add(vwb.m200311Y("探探币使用弹框：", new d30() { // from class: l.hnc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58345Ie();
            }
        }));
        arrayList.add(vwb.m200311Y("打开关闭心动：", new d30() { // from class: l.inc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58335I4();
            }
        }));
        arrayList.add(vwb.m200311Y("特权提示弹窗", new d30() { // from class: l.umc
            @Override // p149l.d30
            public final void call() {
                snm.m185107f0(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), TabName.Card, null);
            }
        }));
        arrayList.add(vwb.m200311Y("恢复特权消耗提示", new d30() { // from class: l.vmc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19571H1.f184104X.put(Boolean.FALSE);
            }
        }));
        arrayList.add(vwb.m200311Y("关闭debug搜索" + CoreModule.f17545c.f19571H1.f184105Y, new d30() { // from class: l.wmc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19571H1.f184105Y = false;
            }
        }));
        arrayList.add(vwb.m200311Y("打开debug搜索" + CoreModule.f17545c.f19571H1.f184105Y, new d30() { // from class: l.xmc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59170uk(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            }
        }));
        arrayList.add(vwb.m200311Y("心动阈值二期时间限制清除", new d30() { // from class: l.ymc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19571H1.f184110d0.put(0L);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Kc */
    public static /* synthetic */ void m58387Kc() {
        CoreModule.f17545c.f19654j0.f19304q0 = true;
        e51.m114774y(new RunnableC9129t0());
    }

    /* JADX INFO: renamed from: Kf */
    public static /* synthetic */ void m58390Kf(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: Kh */
    public static /* synthetic */ void m58392Kh(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        User userMo223809clone = CoreModule.f17545c.f19639e0.m169527p9().mo223809clone();
        ProfileCompletion profileCompletion = userMo223809clone.profile.extensions.profileCompletion;
        List list = Collections.EMPTY_LIST;
        profileCompletion.progress = vwb.m200317c(list, "未完成");
        userMo223809clone.profile.extensions.profileCompletion.briefIntroduction = vwb.m200317c(list, "我是一个up主");
        User userSubtract = userMo223809clone.subtract(CoreModule.f17545c.f19639e0.m169527p9());
        if (NullChecker.m81303a(userSubtract)) {
            viewTreeObserverOnGlobalLayoutListenerC7866b.act().duringCreated(CoreModule.f17545c.f19639e0.m169547u9(userSubtract)).subscribe(mkd0.m154956H(new e30() { // from class: l.iwc
                @Override // p149l.e30
                public final void call(Object obj) {
                    lsi0.m151595y(CoreModule.f17545c.f19639e0.m169527p9().profile.extensions.profileCompletion.toJson());
                }
            }, new e30() { // from class: l.jwc
                @Override // p149l.e30
                public final void call(Object obj) {
                    lsi0.m151595y(((Throwable) obj).getMessage());
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Ki */
    public static void m58393Ki(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("已经认证首页tab", new C9106m0(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: Kj */
    public static void m58394Kj(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("好友上线提醒", new C9138w0(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m58395L() {
        hpd0 hpd0Var = CoreModule.f17545c.f19663m0.f19348J1;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m58396L0(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        C4736e c4736e = CoreModule.f17545c.f19645g0;
        arrayList.add(vwb.m200311Y(C4736e.f19766D0.get().booleanValue() ? "关闭建群认证校验" : "打开群认证校验", new d30() { // from class: l.mvc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59234xi();
            }
        }));
        arrayList.add(vwb.m200311Y("随机创建一个群", new d30() { // from class: l.nvc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19645g0.m31923t6();
            }
        }));
        arrayList.add(vwb.m200311Y("清除气泡", new d30() { // from class: l.ovc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58205C6();
            }
        }));
        arrayList.add(vwb.m200311Y("最新的群消息，随机插入一些@逻辑", new d30() { // from class: l.qvc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19645g0.m31926u6(true, false);
            }
        }));
        arrayList.add(vwb.m200311Y("最新的群消息，随机插入一些@逻辑 有自己", new d30() { // from class: l.rvc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19645g0.m31926u6(false, true);
            }
        }));
        arrayList.add(vwb.m200311Y("最新的群消息，随机插入一个没有头像的", new d30() { // from class: l.svc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19645g0.m31929v6();
            }
        }));
        C4736e c4736e2 = CoreModule.f17545c.f19645g0;
        arrayList.add(vwb.m200311Y(C4736e.f19765C0.get().booleanValue() ? "关闭V3" : "开启V3", new d30() { // from class: l.tvc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58571T7();
            }
        }));
        arrayList.add(vwb.m200311Y("跳转到固定的群", new d30() { // from class: l.uvc
            @Override // p149l.d30
            public final void call() {
                j2e0.m139446m(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), Uri.parse("tantanapp://group/chat?groupId=4233"));
            }
        }));
        arrayList.add(vwb.m200311Y("添加固定群组", new d30() { // from class: l.vvc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), new Runnable() { // from class: l.p6d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m58565T1(viewTreeObserverOnGlobalLayoutListenerC7866b2);
                    }
                }, 300L);
            }
        }));
        arrayList.add(vwb.m200311Y("打开别的dlg", new d30() { // from class: l.wvc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58953l1(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: L1 */
    public static /* synthetic */ void m58397L1(int[] iArr, int i, CoreSuggested.UserInfo userInfo) {
        if (iArr[0] >= i) {
            return;
        }
        UserWithRelationShip userWithRelationShipNew_ = UserWithRelationShip.new_();
        userWithRelationShipNew_.userId = userInfo.f19472id;
        Relationship relationshipNew_ = Relationship.new_();
        relationshipNew_.status.add(MatchFrom.get("pinLike"));
        relationshipNew_.updateTime = mqi0.m155944o() - TimeUnit.HOURS.toMillis(iArr[0]);
        userWithRelationShipNew_.relationship = relationshipNew_;
        CoreModule.f17545c.f19641e2.f86632U.add(userWithRelationShipNew_);
        userInfo.isPinLike = true;
        userInfo.topLikeRelationship = relationshipNew_;
        iArr[0] = iArr[0] + 1;
    }

    /* JADX INFO: renamed from: L4 */
    public static /* synthetic */ void m58400L4() {
        CoreModule.f17545c.f19631b1.f121930V.put("");
        CoreModule.f17545c.f19631b1.f121931W = null;
    }

    /* JADX INFO: renamed from: L5 */
    public static /* synthetic */ void m58401L5(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, View view) {
        OnlineMatchPushUser onlineMatchPushUser = new OnlineMatchPushUser();
        onlineMatchPushUser.name = "重生的小胖子";
        onlineMatchPushUser.userId = "349281368";
        CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileMiddle().formatted();
        onlineMatchPushUser.avatarUrl = "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2MlRQNldBSVFaM1ZRRFRPU01FSFdIS043Nk5RUTA0IiwidyI6MTk2MCwiaCI6MTk1OSwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjYxNzE0NDg5Nzk1MzUzMzg2ODAsImFiIjowfQ.jpg?format=128x128";
        onlineMatchPushUser.action = "";
        onlineMatchPushUser.gender = "female";
        onlineMatchPushUser.age = Constants.VIA_REPORT_TYPE_SHARE_TO_QQ;
        onlineMatchPushUser.distance = 100;
        onlineMatchPushUser.userTagList = vwb.m200304R(new String[]{"唱各萨达多个", "喜欢广场舞", "喜欢哈哈哈"}, new w9j() { // from class: l.kbd
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return DebugUtil.m58469Oa((String) obj);
            }
        });
        QuickChatCardWrapper quickChatCardWrapper = new QuickChatCardWrapper(onlineMatchPushUser);
        if (CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded.size() < 1) {
            return;
        }
        C4732c c4732c = CoreModule.f17545c;
        onlineMatchPushUser.user = c4732c.f19639e0.m169430Pa(c4732c.f19663m0.f19394a0.m221515e().loaded.get(1).f19472id);
        xzc0.m211974x0().m211975B0(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), quickChatCardWrapper);
    }

    /* JADX INFO: renamed from: L7 */
    public static /* synthetic */ void m58403L7(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("VIP", new d30() { // from class: l.u3d
            @Override // p149l.d30
            public final void call() {
                new w6p.C20813a(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m201953i(vwb.m200324f0(PurchaseType.TYPE_GET_VIP), vwb.m200324f0(Privilege.vip_super_like)).m201948d(BuildConfig.BUILD_TYPE).m201955k();
            }
        }));
        arrayList.add(vwb.m200311Y("SVIP", new d30() { // from class: l.v3d
            @Override // p149l.d30
            public final void call() {
                new w6p.C20813a(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m201953i(vwb.m200324f0(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE), vwb.m200324f0(Privilege.see_who_likes_me)).m201948d(BuildConfig.BUILD_TYPE).m201955k();
            }
        }));
        arrayList.add(vwb.m200311Y("SVIP Premium折扣全屏", new d30() { // from class: l.w3d
            @Override // p149l.d30
            public final void call() {
                new zvo.C21788a(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m220462i(vwb.m200324f0(Privilege.see_who_likes_me)).m220457d(BuildConfig.BUILD_TYPE).m220463j();
            }
        }));
        arrayList.add(vwb.m200311Y("VIP+SVIP-默认vip", new d30() { // from class: l.x3d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59124si(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("VIP+SVIP-默认svip", new d30() { // from class: l.y3d
            @Override // p149l.d30
            public final void call() {
                new w6p.C20813a(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m201953i(vwb.m200324f0(PurchaseType.TYPE_GET_VIP, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE), vwb.m200324f0(Privilege.vip_location, Privilege.svip_badge)).m201948d(BuildConfig.BUILD_TYPE).m201954j(1).m201955k();
            }
        }));
        arrayList.add(vwb.m200311Y("See", new d30() { // from class: l.z3d
            @Override // p149l.d30
            public final void call() {
                new w6p.C20813a(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m201953i(vwb.m200324f0(PurchaseType.TYPE_GET_LIKERS), vwb.m200324f0(Privilege.see_who_likes_me)).m201948d(BuildConfig.BUILD_TYPE).m201955k();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: La */
    public static /* synthetic */ void m58406La() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.MinBoostCard;
        userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        Active active = new Active();
        active.f20341id = "boostactivecardid100";
        active.cardBackgroundUrl = "https://auto.tancdn.com/v1/raw/05959a2c-2543-4d35-aa98-83c0956d023e10.png";
        active.cardTitle = "Turbo Trial";
        active.cardBtnTitle = "Turbo Me";
        active.cardDesc = "Taste how boost bring matches to you with only 42 coins";
        active.cardLogo = "https://auto.tancdn.com/v1/raw/4524bd6c-e859-4a3a-a65f-4d7c6ce74e3711.png";
        userInfo.active = active;
        CoreModule.f17545c.f19663m0.m31154w6(userInfo, 3);
    }

    /* JADX INFO: renamed from: Lc */
    public static /* synthetic */ void m58408Lc(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        CoreModule.f17554l.m94653d().mo35912q4();
        ura.m195053e().m195054a().mo33646q4();
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().startActivity(CoreModule.f17554l.m94653d().mo35911Wo(viewTreeObserverOnGlobalLayoutListenerC7866b.getContext()));
    }

    /* JADX INFO: renamed from: Lf */
    public static /* synthetic */ void m58411Lf() {
        rxg0.m181572j().m181596x();
        rxg0.m181572j().f161459d.put(Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: Li */
    public static void m58414Li(final Act act) {
        act.postDelayed(new Runnable() { // from class: l.q6d
            @Override // java.lang.Runnable
            public final void run() {
                DebugUtil.m58983m9(act);
            }
        }, 800L);
    }

    /* JADX INFO: renamed from: Lj */
    public static User m58415Lj(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        return (viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2().mo38818o() == null || viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2().mo38818o().m141745d() == null) ? CoreModule.f17545c.f19639e0.m169527p9() : viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2().mo38818o().m141745d();
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m58416M() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.virtualCardType = VirtualCardType.ExpandedNewUserRightGuide;
        CoreModule.f17545c.f19663m0.m31146t6(userInfo, 0, true);
    }

    /* JADX INFO: renamed from: M1 */
    public static /* synthetic */ void m58418M1() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149145B4;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: M5 */
    public static /* synthetic */ void m58422M5() {
    }

    /* JADX INFO: renamed from: Ma */
    public static /* synthetic */ void m58427Ma() {
    }

    /* JADX INFO: renamed from: Mb */
    public static /* synthetic */ void m58428Mb(VEditText vEditText) {
        String strTrim = vEditText.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        lra0.f129519k.put(Double.valueOf(Math.min(Math.max(Double.parseDouble(strTrim), 0.6d), 0.8d)));
    }

    /* JADX INFO: renamed from: Me */
    public static /* synthetic */ void m58431Me() {
        hpd0 hpd0Var = lra0.f129525n;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Mg */
    public static /* synthetic */ void m58433Mg(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, Dialog dialog, View view, int i, CharSequence charSequence) {
        switch (i) {
            case 0:
                hpd0 hpd0Var = lra0.f129513h;
                hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
                break;
            case 1:
                hpd0 hpd0Var2 = lra0.f129511g;
                hpd0Var2.put(Boolean.valueOf(!hpd0Var2.get().booleanValue()));
                break;
            case 2:
                final VEditText vEditText = new VEditText(viewTreeObserverOnGlobalLayoutListenerC7866b.getContext());
                vEditText.setLayoutParams(new FrameLayout.LayoutParams(-1, t100.f167226A));
                vEditText.setInputType(8192);
                vEditText.setText(String.valueOf(lra0.f129519k.get()));
                vEditText.setSelection(vEditText.getText().length());
                viewTreeObserverOnGlobalLayoutListenerC7866b.act().dialog().m20520P(vEditText, false).m20556t0(R$string.f18958u, new Runnable() { // from class: l.j1d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m58428Mb(vEditText);
                    }
                }).m20567z().show();
                break;
            case 3:
                lra0.f129517j.put(640);
                break;
            case 4:
                lra0.f129517j.put(720);
                break;
            case 5:
                lra0.f129517j.put(1080);
                break;
            case 6:
                lra0.f129517j.put(1440);
                break;
            case 7:
                hpd0 hpd0Var3 = lra0.f129515i;
                hpd0Var3.put(Boolean.valueOf(!hpd0Var3.get().booleanValue()));
                break;
            case 8:
                StringBuilder sb = new StringBuilder("Model: ");
                sb.append(oyd.m166654g());
                sb.append("\nBrand: ");
                sb.append(oyd.m166649b());
                sb.append("\nHardWare: ");
                sb.append(oyd.m166653f());
                sb.append("\nRAM容量: ");
                sb.append(oyd.m166656i(viewTreeObserverOnGlobalLayoutListenerC7866b.act()));
                sb.append("\nCPU核数: ");
                sb.append(oyd.m166655h());
                sb.append("\nCPU最大主频: ");
                sb.append(oyd.m166650c());
                sb.append("\n屏幕分辨率: ");
                DisplayMetrics displayMetrics = viewTreeObserverOnGlobalLayoutListenerC7866b.act().getResources().getDisplayMetrics();
                sb.append(displayMetrics.widthPixels + BaseSei.f13930X + displayMetrics.heightPixels);
                sb.append("\n\n");
                int iM166658k = oyd.m166658k(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
                if (iM166658k == 2) {
                    sb.append("当前机型为高端机型");
                } else if (iM166658k == 1) {
                    sb.append("当前机型为中端机型");
                } else if (iM166658k == 0) {
                    sb.append("当前机型为低端机型");
                }
                VText vText = new VText(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
                vText.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                vText.setText(sb.toString());
                viewTreeObserverOnGlobalLayoutListenerC7866b.act().dialog().m20520P(vText, false).m20567z().show();
                break;
        }
    }

    /* JADX INFO: renamed from: Mi */
    public static void m58435Mi(final ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("酒吧爱人", new d30() { // from class: l.zoc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58961l9(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
    }

    /* JADX INFO: renamed from: Mj */
    public static void m58436Mj(final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, final boolean z) {
        i0e.m133795d(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m133814D(10).m133825r("输入Userid").m133816F(new e30() { // from class: l.n8d
            @Override // p149l.e30
            public final void call(Object obj) {
                DebugUtil.m59146ti(z, viewTreeObserverOnGlobalLayoutListenerC7866b, (String) obj);
            }
        }).m133821n().show();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m58437N(Throwable th) {
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m58438N0() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.AdCard;
        userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        List<OMSAdCardInfo> listM135335h = ic50.m135327j().m135335h();
        if (vwb.m200296J(listM135335h)) {
            return;
        }
        userInfo.extensionObject = listM135335h.get(0);
        CoreModule.f17545c.f19663m0.m31154w6(userInfo, 1);
        CoreModule.f17545c.f19663m0.f19372S1.put(userInfo, 1);
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m58441N3() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.DailySelectionAdCard;
        userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f17545c.f19663m0.m31154w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ Tag m58442N4(String str) {
        return new Tag(null, str);
    }

    /* JADX INFO: renamed from: N6 */
    public static /* synthetic */ void m58444N6() {
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = CoreModule.f17545c.f19663m0.f19394a0.m221515e();
        if (partialListOptM221515e == null || vwb.m200296J(partialListOptM221515e.loaded)) {
            return;
        }
        Iterator<CoreSuggested.UserInfo> it = partialListOptM221515e.loaded.iterator();
        while (it.hasNext()) {
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(it.next().f19472id);
            UserLiveState userLiveStateMo67272lt = CoreModule.m29936Q().mo67272lt(userM169430Pa.f56011id);
            if (userLiveStateMo67272lt == null) {
                userM169430Pa.liveState = UserLiveState.new_();
            } else {
                userM169430Pa.liveState = userLiveStateMo67272lt;
            }
            UserLiveState userLiveState = userM169430Pa.liveState;
            userLiveState.liveId = userM169430Pa.f56011id;
            userLiveState.callInfo.ongoingCall = true;
            userLiveState.state = LiveState.get("onlive");
            userM169430Pa.liveState.liveLabel = UserLiveLabel.new_();
            UserLiveLabel userLiveLabel = userM169430Pa.liveState.liveLabel;
            userLiveLabel.mainTitle = "直播中";
            userLiveLabel.subTitle = "多人连线已开启";
            CoreModule.m29936Q().putLiveState(Collections.singletonList(userM169430Pa));
        }
        CoreModule.f17545c.f19663m0.f19394a0.m132487l(partialListOptM221515e);
    }

    /* JADX INFO: renamed from: N8 */
    public static /* synthetic */ void m58446N8(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("审核中是否可编辑实验）：" + CoreModule.f17545c.f19639e0.f149240P2.get(), new d30() { // from class: l.fvc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58291G4();
            }
        }));
        arrayList.add(vwb.m200311Y("单项功能限制（profile资料编辑）：" + CoreModule.f17545c.f19639e0.f149226N2.get(), new d30() { // from class: l.gvc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58920jc();
            }
        }));
        arrayList.add(vwb.m200311Y("单项功能限制（swipe划卡）：" + CoreModule.f17545c.f19639e0.f149233O2.get(), new d30() { // from class: l.hvc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58964lc();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: N9 */
    public static /* synthetic */ void m58447N9() {
        hpd0 hpd0Var = C8140a.f25299f;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        CoreModule.f17545c.f19642f0.f19905V0.put("https://m.tantanapp.com/static-pages/commerce/newuserguide.html?category=0");
        C4732c c4732c = CoreModule.f17545c;
        c4732c.f19642f0.f19899T0.put(upa.m194733c0(c4732c.f19639e0.m169527p9()));
        C4732c c4732c2 = CoreModule.f17545c;
        c4732c2.f19642f0.f19896S0.put(upa.m194720Z(c4732c2.f19639e0.m169527p9()));
    }

    /* JADX INFO: renamed from: Na */
    public static /* synthetic */ void m58448Na() {
        snm.f165471k = true;
        snm.f165470j = true;
    }

    /* JADX INFO: renamed from: Ne */
    public static /* synthetic */ void m58452Ne(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("划卡优化，清理蒙层", new d30() { // from class: l.buc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59188vg();
            }
        }));
        arrayList.add(vwb.m200311Y("展示设置蒙层", new d30() { // from class: l.cuc
            @Override // p149l.d30
            public final void call() {
                e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), new Runnable() { // from class: l.l2d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m58288G1();
                    }
                }, 1500L);
            }
        }));
        arrayList.add(vwb.m200311Y("显示superlike动画", new d30() { // from class: l.duc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), new Runnable() { // from class: l.dzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b3 = viewTreeObserverOnGlobalLayoutListenerC7866b2;
                        rxg0.m181563M(viewTreeObserverOnGlobalLayoutListenerC7866b3.m37341q2(), viewTreeObserverOnGlobalLayoutListenerC7866b3.m37385z2(), viewTreeObserverOnGlobalLayoutListenerC7866b3.m37134C2().getRealView(), 1300);
                    }
                }, 1500L);
            }
        }));
        arrayList.add(vwb.m200311Y("清除所有标记", new d30() { // from class: l.euc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58169Ae();
            }
        }));
        arrayList.add(vwb.m200311Y("所有都有letter", new d30() { // from class: l.fuc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59063q1();
            }
        }));
        arrayList.add(vwb.m200311Y("所有都有新喜欢", new d30() { // from class: l.guc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58597Uc();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Nf */
    public static /* synthetic */ void m58453Nf(String str, roj0 roj0Var) {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f19472id = str;
        userInfo.meetAgain = true;
        if (CoreModule.f17545c.f19642f0.m33182xh(str)) {
            CoreModule.f17545c.f19663m0.m31154w6(userInfo, 0);
        } else {
            lsi0.m151595y("非配对好友");
        }
    }

    /* JADX INFO: renamed from: Ng */
    public static /* synthetic */ void m58454Ng() {
        hpd0 hpd0Var = lra0.f129493U;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Nh */
    public static /* synthetic */ void m58455Nh() {
        CoreModule.f17545c.f19639e0.f149471s6.put("");
        CoreModule.f17545c.f19639e0.f149428m7.put(0);
        CoreModule.f17545c.f19639e0.f149436n7.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: Ni */
    public static void m58456Ni(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("boost队列重构 清空数据", new d30() { // from class: l.kuc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58552S9();
            }
        }));
    }

    /* JADX INFO: renamed from: Nj */
    public static void m58457Nj(final ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("破冰和联想表情优化", new d30() { // from class: l.okc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59225x9(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
    }

    /* JADX INFO: renamed from: O1 */
    public static /* synthetic */ void m58460O1() {
        hpd0 hpd0Var = CoreModule.f17545c.f19642f0.f19911X0;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m58462O3(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("VIP落地页", new d30() { // from class: l.tzc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58769ce(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("SVIP落地页", new d30() { // from class: l.uzc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58292G5(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("黑金会员落地页", new d30() { // from class: l.vzc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58509Q8(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: O4 */
    public static /* synthetic */ void m58463O4(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        User userMo223809clone = CoreModule.f17545c.f19639e0.m169527p9().mo223809clone();
        userMo223809clone.profile.extensions.profileCompletion.briefIntroduction = vwb.m200317c(Collections.EMPTY_LIST, "我是一个up主");
        User userSubtract = userMo223809clone.subtract(CoreModule.f17545c.f19639e0.m169527p9());
        if (NullChecker.m81303a(userSubtract)) {
            viewTreeObserverOnGlobalLayoutListenerC7866b.act().duringCreated(CoreModule.f17545c.f19639e0.m169547u9(userSubtract)).subscribe(mkd0.m154956H(new e30() { // from class: l.tsc
                @Override // p149l.e30
                public final void call(Object obj) {
                    lsi0.m151595y(CoreModule.f17545c.f19639e0.m169527p9().profile.extensions.profileCompletion.toJson());
                }
            }, new e30() { // from class: l.usc
                @Override // p149l.e30
                public final void call(Object obj) {
                    lsi0.m151595y(((Throwable) obj).getMessage());
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Oa */
    public static /* synthetic */ Tag m58469Oa(String str) {
        return new Tag(null, str);
    }

    /* JADX INFO: renamed from: Oc */
    public static /* synthetic */ void m58471Oc(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("还原速度", new d30() { // from class: l.utc
            @Override // p149l.d30
            public final void call() {
                l9j.m149034b(1);
            }
        }));
        arrayList.add(vwb.m200311Y("x2速度", new d30() { // from class: l.vtc
            @Override // p149l.d30
            public final void call() {
                l9j.m149034b(2);
            }
        }));
        arrayList.add(vwb.m200311Y("x5速度", new d30() { // from class: l.xtc
            @Override // p149l.d30
            public final void call() {
                l9j.m149034b(5);
            }
        }));
        arrayList.add(vwb.m200311Y("x10速度", new d30() { // from class: l.ytc
            @Override // p149l.d30
            public final void call() {
                l9j.m149034b(10);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Od */
    public static /* synthetic */ void m58472Od(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: Og */
    public static /* synthetic */ void m58475Og() {
        String str;
        for (String str2 : m58708Zi()) {
            CoreModule.f17553k.f91950m.delete(str2);
            CoreModule.f17553k.f91940c.m206052J(str2);
        }
        for (String str3 : m58730aj()) {
            User userQuery = qib0.f154722k0.f176631d.query(str3);
            if (userQuery != null && (str = userQuery.name) != null && str.startsWith("MockUser")) {
                qib0.f154722k0.f176631d.delete(str3);
            }
        }
    }

    /* JADX INFO: renamed from: Oi */
    public static void m58477Oi(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("boost重构", new C9103l1(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: Oj */
    public static void m58478Oj(final ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("网络请求真人认证", new d30() { // from class: l.csc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58984ma(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m58479P() {
        qsd0 qsd0Var = qsd0.INSTANCE;
        qsd0Var.m176228b();
        qsd0Var.m176229c();
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m58480P0() {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.ai_picture_query_auth);
        CoreModule.f17545c.f19642f0.f19963o2.clear();
        CoreModule.f17545c.f19642f0.f19963o2.add(messageNew_);
    }

    /* JADX INFO: renamed from: P1 */
    public static /* synthetic */ void m58481P1() {
        CoreModule.f17545c.f19639e0.f149266S4.put(0L);
        CoreModule.f17545c.f19639e0.f149242P4.put(0L);
        CoreModule.f17545c.f19639e0.f149250Q4.put(0L);
        CoreModule.f17545c.f19639e0.f149258R4.put(0);
        CoreModule.f17545c.f19639e0.f149274T4.put(0);
    }

    /* JADX INFO: renamed from: P4 */
    public static /* synthetic */ void m58484P4() {
        hpd0 hpd0Var = C4758x.f20137S;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: P5 */
    public static /* synthetic */ void m58485P5(User user) {
        double dM155944o = (mqi0.m155944o() / 1000.0d) + 86400.0d;
        int i = 0;
        while (true) {
            String[][] strArr = f38260j;
            if (i >= strArr.length) {
                return;
            }
            String[] strArr2 = strArr[i];
            int i2 = Integer.parseInt(strArr2[2]);
            String strM58797dk = m58797dk(i2);
            m58774cj(strM58797dk, strArr2[1], ((double) (strArr.length - i)) + dM155944o, strM58797dk);
            m58306Gj(user, strM58797dk, i2);
            i++;
        }
    }

    /* JADX INFO: renamed from: P6 */
    public static /* synthetic */ void m58486P6() {
        hpd0 hpd0Var = lra0.f129490R;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: P7 */
    public static /* synthetic */ void m58487P7() {
        hpd0 hpd0Var = lra0.f129495W;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Pa */
    public static /* synthetic */ void m58490Pa() {
        hpd0 hpd0Var = lra0.f129512g0;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Pd */
    public static /* synthetic */ void m58493Pd(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        String str = "first_left_slide_" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        new hpd0(str, bool).put(bool);
        new aa40(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).show();
    }

    /* JADX INFO: renamed from: Pg */
    public static /* synthetic */ void m58496Pg(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("测试广告框架", new d30() { // from class: l.m9d
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().startActivity(new Intent(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), (Class<?>) DebugSplashTTAdAct.class));
            }
        }));
        arrayList.add(vwb.m200311Y("开屏广告", new d30() { // from class: l.n9d
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().startActivity(new Intent(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), (Class<?>) DebugSplashAdAct.class));
            }
        }));
        arrayList.add(vwb.m200311Y("SDK助手", new d30() { // from class: l.o9d
            @Override // p149l.d30
            public final void call() {
                mbj.m153890a(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Ph */
    public static /* synthetic */ void m58497Ph() {
        Message messageNew_ = Message.new_();
        messageNew_.value = "你好，我叫小宇，现在在北京工作，老家是湖南长沙，我性格外向";
        messageNew_.messageType = MessageType.get(MessageType.marriage_prologue);
        CoreModule.f17545c.f19642f0.f19963o2.clear();
        CoreModule.f17545c.f19642f0.f19963o2.add(messageNew_);
    }

    /* JADX INFO: renamed from: Pi */
    public static void m58498Pi(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("推荐卡片4变3张", new C9144y0(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: Pj */
    public static void m58499Pj(final ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("弹窗管控", new d30() { // from class: l.coc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58828f7(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m58501Q0(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(0, vwb.m200311Y("身份证认证", new d30() { // from class: l.doc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.m37341q2().startActivity(NationalIdAuthAct.m56072V1(viewTreeObserverOnGlobalLayoutListenerC7866b2.m37341q2().getContext(), "mainDebug"));
            }
        }));
        arrayList.add(1, vwb.m200311Y("身份证认证成功dlg", new d30() { // from class: l.eoc
            @Override // p149l.d30
            public final void call() {
                p420.m167358x(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), null);
            }
        }));
        arrayList.add(1, vwb.m200311Y("身份证认证状态查询", new d30() { // from class: l.foc
            @Override // p149l.d30
            public final void call() {
                lsi0.m151580j("认证状态为:".concat(CoreModule.f17545c.f19639e0.m169527p9().isIdCardVerified() ? "已认证" : "未认证"));
            }
        }));
        arrayList.add(1, vwb.m200311Y("实时查询认证状态", new d30() { // from class: l.goc
            @Override // p149l.d30
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC7866b.act().duringCreated(CoreModule.f17545c.f19552B0.m31617p4(CoreModule.m29931H().userId())).subscribe(mkd0.m154956H(new e30() { // from class: l.m6d
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m58696Z6((roj0) obj);
                    }
                }, new e30() { // from class: l.n6d
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m58799e0((Throwable) obj);
                    }
                }));
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Q1 */
    public static /* synthetic */ void m58502Q1() {
        CoreModule.f17545c.f19639e0.f149392i3.put(0L);
        CoreModule.f17545c.f19639e0.f149384h3.put(0);
    }

    /* JADX INFO: renamed from: Q7 */
    public static /* synthetic */ void m58508Q7() {
        hpd0 hpd0Var = CoreModule.f17545c.f19704z2.f19227f0;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Q8 */
    public static /* synthetic */ void m58509Q8(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        Intent intentM56237b2 = VipAct.m56237b2(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), ahl0.m96501p0(PurchaseType.TYPE_O_DIAMOND));
        Intent intentM151840A = lva.m151840A(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), null, "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/pricey-member/index.html?speed=true&_bid=1003173&hideNavigationBar=1&hideNotch=1&webviewColor=181614&expiresTime=1699341086000&duration=2592000", true, true, true);
        intentM151840A.putExtra("hideNotch", true);
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().startActivities(new Intent[]{intentM56237b2, intentM151840A});
    }

    /* JADX INFO: renamed from: Q9 */
    public static /* synthetic */ void m58510Q9(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("清除'我'的tab，谁看过我入口假红点时间戳", new d30() { // from class: l.j7d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58233Dc();
            }
        }));
        arrayList.add(vwb.m200311Y("清除'谁看过我'第二个tab访问时间戳", new d30() { // from class: l.k7d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58216Ch();
            }
        }));
        arrayList.add(vwb.m200311Y("清除'恢复足迹'标记", new d30() { // from class: l.l7d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58739b6();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Qa */
    public static /* synthetic */ void m58511Qa(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        PurchaseType purchaseType = PurchaseType.TYPE_O_PLATINUM;
        new C8778c.a(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), purchaseType, null).m54094g(fy80.m123715k(purchaseType.getPrivilegeData(null), null)).m54095h();
    }

    /* JADX INFO: renamed from: Qd */
    public static /* synthetic */ void m58514Qd(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y(wf6.m202950e() ? "关闭优化" : "打开优化", new d30() { // from class: l.nsc
            @Override // p149l.d30
            public final void call() {
                wf6.m202954i(!wf6.m202950e());
            }
        }));
        arrayList.add(vwb.m200311Y(wf6.m202951f() ? "关闭同步Counter" : "打开同步Counter", new d30() { // from class: l.osc
            @Override // p149l.d30
            public final void call() {
                wf6.m202955j(!wf6.m202951f());
            }
        }));
        arrayList.add(vwb.m200311Y("检查本地Counversation Counter数据上报", new d30() { // from class: l.qsc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59157u7();
            }
        }));
        arrayList.add(vwb.m200311Y("检查数据上报", new d30() { // from class: l.rsc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m33205ze(true);
            }
        }));
        arrayList.add(vwb.m200311Y("清除本地数据", new d30() { // from class: l.ssc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19639e0.f149501x1.put(0L);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Qe */
    public static /* synthetic */ void m58515Qe(CoreSuggested.UserInfo userInfo) {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(userInfo.f19472id);
        if (NullChecker.m81303a(userM169430Pa) && NullChecker.m81303a(userM169430Pa.settings) && !vwb.m200296J(userM169430Pa.settings.settingGroups)) {
            SettingGroups settingGroups = userM169430Pa.settings.settingGroups.get(0);
            if (NullChecker.m81303a(settingGroups)) {
                if (NullChecker.m81303a(settingGroups.comDiamond)) {
                    settingGroups.comDiamond.isODiamond = true;
                    return;
                }
                ComDiamond comDiamondNew_ = ComDiamond.new_();
                comDiamondNew_.isODiamond = true;
                settingGroups.comDiamond = comDiamondNew_;
            }
        }
    }

    /* JADX INFO: renamed from: Qh */
    public static /* synthetic */ void m58518Qh(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("首页启动介绍弹窗", new d30() { // from class: l.ozc
            @Override // p149l.d30
            public final void call() {
                new hq80(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "").show();
            }
        }));
        arrayList.add(vwb.m200311Y("首页启动介绍弹窗清除本地记录", new d30() { // from class: l.pzc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59003n7();
            }
        }));
        arrayList.add(vwb.m200311Y("购买弹窗-私人定制特权", new d30() { // from class: l.qzc
            @Override // p149l.d30
            public final void call() {
                C8764c.m53487r0(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), BuildConfig.BUILD_TYPE);
            }
        }));
        arrayList.add(vwb.m200311Y("购买弹窗-私人定制+黑金", new d30() { // from class: l.rzc
            @Override // p149l.d30
            public final void call() {
                C8764c.m53444c0(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), BuildConfig.BUILD_TYPE);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Qi */
    public static void m58519Qi(final ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("认证优化Q4", new d30() { // from class: l.src
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58810eb(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
    }

    /* JADX INFO: renamed from: Qj */
    public static void m58520Qj() {
        final User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        e51.m114774y(new Runnable() { // from class: l.l6d
            @Override // java.lang.Runnable
            public final void run() {
                DebugUtil.m58760c5(userM169527p9);
            }
        });
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m58522R0() {
        hpd0 hpd0Var = lra0.f129502b0;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        lra0.f129504c0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: R3 */
    public static /* synthetic */ void m58525R3(MatchSuccessAnimTime matchSuccessAnimTime, String str) {
        try {
            matchSuccessAnimTime.female_exit_time = Integer.parseInt(str);
            CoreModule.f17545c.f19639e0.f149360e3.put(matchSuccessAnimTime.toJson());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: R4 */
    public static /* synthetic */ void m58526R4() {
        hpd0 hpd0Var = a5x.f67732b;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: R5 */
    public static /* synthetic */ void m58527R5(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        q3h0.C19423b c19423b = new q3h0.C19423b();
        c19423b.m172864a(2);
        c19423b.m172866c(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
    }

    /* JADX INFO: renamed from: R7 */
    public static /* synthetic */ void m58529R7() {
        hpd0 hpd0Var = lra0.f129509f;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: R8 */
    public static /* synthetic */ void m58530R8() {
        hpd0 hpd0Var = lra0.f129494V;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: R9 */
    public static /* synthetic */ void m58531R9() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149467s2;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Ra */
    public static /* synthetic */ void m58532Ra(Throwable th) {
    }

    /* JADX INFO: renamed from: Rc */
    public static /* synthetic */ void m58534Rc() {
        C7846b.m36420r().m36432o();
        lsi0.m151595y("已清除");
    }

    /* JADX INFO: renamed from: Re */
    public static /* synthetic */ void m58536Re() {
        TabUniteManager.m44953i().m44954h(TabUniteManager.BadgeIconType.BOOST);
        TabUniteManager.m44953i().m44954h(TabUniteManager.BadgeIconType.BOOST_ONCE);
    }

    /* JADX INFO: renamed from: Rf */
    public static /* synthetic */ void m58537Rf(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("清除拍一拍", new d30() { // from class: l.dsc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59101rh();
            }
        }));
        arrayList.add(vwb.m200311Y("清除两次记录", new d30() { // from class: l.fsc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58400L4();
            }
        }));
        arrayList.add(vwb.m200311Y("清除拍一拍全部逻辑", new d30() { // from class: l.gsc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58606V0();
            }
        }));
        arrayList.add(vwb.m200311Y("检查文案", new d30() { // from class: l.hsc
            @Override // p149l.d30
            public final void call() {
                C8524b.f31761c = true;
            }
        }));
        arrayList.add(vwb.m200311Y("不检查文案", new d30() { // from class: l.isc
            @Override // p149l.d30
            public final void call() {
                C8524b.f31761c = false;
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Rg */
    public static /* synthetic */ void m58538Rg(EditText editText, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        String strTrim = editText.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        Intent intentM151850f = lva.m151850f(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
        intentM151850f.putExtra("extra_join_group_id", strTrim);
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().startActivity(intentM151850f);
    }

    /* JADX INFO: renamed from: Rh */
    public static /* synthetic */ void m58539Rh() {
        ConversationsList.m41331B2(true);
        ConversationsList.f25081u1.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: Ri */
    public static void m58540Ri(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("真人认证优化", new C9099k1(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: Rj */
    public static void m58541Rj(final ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("国际化黑金单次购买", new d30() { // from class: l.zlc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58674Y5(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m58543S0() {
        Message messageNew_ = Message.new_();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("needOpen", true);
            MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
            messageNew_.additionalData = messageAdditionalDataNew_;
            messageAdditionalDataNew_.chatGiftInfo = ChatGiftInfo.new_();
            ChatGiftInfo chatGiftInfo = messageNew_.additionalData.chatGiftInfo;
            chatGiftInfo.f20361id = "116";
            chatGiftInfo.extra = jSONObject.toString(1);
            messageNew_.messageType = MessageType.get(MessageType.chat_gift);
            CoreModule.f17545c.f19642f0.f19963o2.clear();
            CoreModule.f17545c.f19642f0.f19963o2.add(messageNew_);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            aag0.m95543a(e);
        }
    }

    /* JADX INFO: renamed from: S1 */
    public static /* synthetic */ void m58544S1() {
    }

    /* JADX INFO: renamed from: S2 */
    public static /* synthetic */ void m58545S2(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("清除体验弹窗数据", new d30() { // from class: l.h5d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58296G9();
            }
        }));
        arrayList.add(vwb.m200311Y("划卡体验弹窗一", new d30() { // from class: l.i5d
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().duringCreated(CoreModule.f17545c.f19689u2.m192750c3(QuestionnaireScene.get("swipe"), QuestionnaireStrategy.get("default"))).subscribe(mkd0.m154956H(new e30() { // from class: l.c9c
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m58622Vg(viewTreeObserverOnGlobalLayoutListenerC7866b2, (Questionnaire) obj);
                    }
                }, new e30() { // from class: l.d9c
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m58532Ra((Throwable) obj);
                    }
                }));
            }
        }));
        arrayList.add(vwb.m200311Y("划卡体验弹窗二", new d30() { // from class: l.j5d
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().duringCreated(CoreModule.f17545c.f19689u2.m192750c3(QuestionnaireScene.get("swipe"), QuestionnaireStrategy.get(QuestionnaireStrategy.lowLikeRatio))).subscribe(mkd0.m154956H(new e30() { // from class: l.s8c
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m58555Sc(viewTreeObserverOnGlobalLayoutListenerC7866b2, (Questionnaire) obj);
                    }
                }, new e30() { // from class: l.t8c
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m59108s2((Throwable) obj);
                    }
                }));
            }
        }));
        arrayList.add(vwb.m200311Y("消息列表体验弹窗", new d30() { // from class: l.l5d
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().duringCreated(CoreModule.f17545c.f19689u2.m192750c3(QuestionnaireScene.get("message"), null)).subscribe(mkd0.m154956H(new e30() { // from class: l.lad
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m58746bd(viewTreeObserverOnGlobalLayoutListenerC7866b2, (Questionnaire) obj);
                    }
                }, new e30() { // from class: l.mad
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m58778d1((Throwable) obj);
                    }
                }));
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: S4 */
    public static /* synthetic */ void m58547S4(Notification notification) {
        if (NullChecker.m81303a(AccessToken.m7408d())) {
            bzv.m104655m().m104682u();
        }
    }

    /* JADX INFO: renamed from: S6 */
    public static /* synthetic */ void m58549S6() {
        CoreModule.f17545c.f19639e0.f149397j0.put(0L);
        CoreModule.f17545c.f19639e0.f149421m0.put(0L);
        CoreModule.f17545c.f19639e0.f149405k0.put(new HashSet());
        CoreModule.f17545c.f19639e0.f149413l0.put(0L);
        CoreModule.f17545c.f19639e0.f149429n0.put(0L);
        CoreModule.f17545c.f19639e0.f149437o0.put(new HashSet());
        CoreModule.f17545c.f19639e0.f149444p0.put(0L);
        CoreModule.f17545c.f19639e0.f149451q0.put(new HashSet());
        CoreModule.f17545c.f19639e0.f149458r0.put(0L);
        CoreModule.f17545c.f19639e0.f149465s0.put(new HashSet());
    }

    /* JADX INFO: renamed from: S7 */
    public static /* synthetic */ void m58550S7(String str) {
        Relationship relationship = new Relationship();
        relationship.status = new ArrayList();
        C4759y.m34901i3(str, relationship).materialize().subscribe();
    }

    /* JADX INFO: renamed from: S9 */
    public static /* synthetic */ void m58552S9() {
        CoreModule.f17545c.f19639e0.f149450p6.clear();
        CoreModule.f17545c.f19639e0.f149457q6.clear();
        CoreModule.f17545c.f19639e0.f149464r6.clear();
    }

    /* JADX INFO: renamed from: Sa */
    public static /* synthetic */ void m58553Sa() {
        CoreModule.f17545c.f19677q2.f114440U.clear();
        CoreModule.f17545c.f19677q2.f114441V.clear();
        CoreModule.f17545c.f19677q2.f114439T.clear();
    }

    /* JADX INFO: renamed from: Sc */
    public static /* synthetic */ void m58555Sc(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, Questionnaire questionnaire) {
        if (!NullChecker.m81303a(questionnaire) || vwb.m200296J(questionnaire.options)) {
            return;
        }
        new gij0(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m126318A0(questionnaire);
    }

    /* JADX INFO: renamed from: Se */
    public static /* synthetic */ void m58557Se(Boolean bool) {
    }

    /* JADX INFO: renamed from: Sh */
    public static /* synthetic */ void m58560Sh() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149443o6;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Si */
    public static void m58561Si(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("历史消息cell激活", new C9147z0(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: Sj */
    public static void m58562Sj(final ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("国际化全屏购买弹窗【汇总】", new d30() { // from class: l.npc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58403L7(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
    }

    /* JADX INFO: renamed from: T1 */
    public static /* synthetic */ void m58565T1(final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        Dialog.C4309e c4309e = new Dialog.C4309e(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
        final EditText editText = new EditText(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
        editText.setHint("请输入群id");
        c4309e.m20520P(editText, false);
        c4309e.m20560v0("加入", new Runnable() { // from class: l.q8c
            @Override // java.lang.Runnable
            public final void run() {
                DebugUtil.m58538Rg(editText, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        });
        c4309e.m20568z0();
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ void m58567T3() {
        hpd0 hpd0Var = lra0.f129489Q;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: T6 */
    public static /* synthetic */ void m58570T6(final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, final String str) {
        Pattern patternCompile = Pattern.compile("[0-9]*");
        if (TextUtils.isEmpty(str) || !patternCompile.matcher(str).matches() || TextUtils.isEmpty(str)) {
            return;
        }
        e51.m114742G(new Runnable() { // from class: l.p9d
            @Override // java.lang.Runnable
            public final void run() {
                nmn.m160123g(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), new nmn.C18733a(str, ""), "");
            }
        });
    }

    /* JADX INFO: renamed from: T7 */
    public static /* synthetic */ void m58571T7() {
        C4736e c4736e = CoreModule.f17545c.f19645g0;
        hpd0 hpd0Var = C4736e.f19765C0;
        C4736e c4736e2 = CoreModule.f17545c.f19645g0;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: T8 */
    public static /* synthetic */ void m58572T8() {
        hpd0 hpd0Var = h7j.f106283a;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Tc */
    public static /* synthetic */ void m58576Tc(Throwable th) {
    }

    /* JADX INFO: renamed from: Td */
    public static /* synthetic */ void m58577Td(PartialListOpt partialListOpt) {
        final int[] iArr = {0};
        CoreModule.f17545c.f19641e2.f86632U = new ArrayList();
        final int i = 3;
        vwb.m200354z(partialListOpt.loaded, new e30() { // from class: l.j9c
            @Override // p149l.e30
            public final void call(Object obj) {
                DebugUtil.m58397L1(iArr, i, (CoreSuggested.UserInfo) obj);
            }
        });
        CoreModule.f17545c.f19641e2.m112212u3();
    }

    /* JADX INFO: renamed from: Te */
    public static /* synthetic */ void m58578Te(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        new C8778c.a(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), purchaseType, null).m54094g(fy80.m123721q(purchaseType.getPrivilegeData(null), null, purchaseType)).m54095h();
    }

    /* JADX INFO: renamed from: Tf */
    public static /* synthetic */ void m58579Tf(User user) {
        Studies studies = user.profile.studies;
        studies.active = true;
        studies.verified = true;
    }

    /* JADX INFO: renamed from: Tg */
    public static /* synthetic */ void m58580Tg(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: Ti */
    public static void m58582Ti(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("聊天助手", new C9087h1(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: Tj */
    public static void m58583Tj(final ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("国际化外露喜欢", new d30() { // from class: l.joc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58229D8(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ void m58588U3(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("试用购买大页面", new d30() { // from class: l.x7d
            @Override // p149l.d30
            public final void call() {
                C8764c.m53390F0(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), BuildConfig.BUILD_TYPE);
            }
        }));
        arrayList.add(vwb.m200311Y("插入See试用聚合会话", new d30() { // from class: l.y7d
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m33102qq(mqi0.m155944o());
            }
        }));
        arrayList.add(vwb.m200311Y("删除See试用聚合会话", new d30() { // from class: l.a8d
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m33102qq(-1.0d);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Uc */
    public static /* synthetic */ void m58597Uc() {
        CoreModule.f17545c.f19663m0.f19380V0.put(Boolean.FALSE);
        CoreModule.f17545c.f19663m0.f19383W0.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: Ue */
    public static /* synthetic */ void m58599Ue() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149492v6;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Uf */
    public static /* synthetic */ void m58600Uf(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = "你好！";
        CoreDlg.m45020R1(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "sendMsg", "发送消息", "每次分享最多选择5位好友", 5, "分享", "最多可以选择5位好友", messageNew_.toJson(), new f30() { // from class: l.vkc
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                lsi0.m151595y("发送消息结果：" + ((String) obj));
            }
        });
    }

    /* JADX INFO: renamed from: Ug */
    public static /* synthetic */ void m58601Ug() {
    }

    /* JADX INFO: renamed from: Ui */
    public static void m58603Ui(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("找个聊天搭子", new C9068c2(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: Uj */
    public static void m58604Uj(final ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("国际化黑金", new d30() { // from class: l.vwc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58738b5(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m58605V() {
        if (CoreModule.f17545c.f19639e0.f149511y4.get().intValue() == 110) {
            CoreModule.f17545c.f19639e0.f149511y4.put(9);
        } else {
            CoreModule.f17545c.f19639e0.f149511y4.put(110);
        }
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ void m58606V0() {
        zxz.m220864h().m220869l();
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149350d1;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        CoreModule.f17545c.f19639e0.f149358e1.put(bool);
        CoreModule.f17545c.f19631b1.f121926R.put(bool);
        CoreModule.f17545c.f19631b1.f121927S.put(bool);
        CoreModule.f17545c.f19631b1.f121930V.put("");
        CoreModule.f17545c.f19631b1.f121931W = null;
    }

    /* JADX INFO: renamed from: V1 */
    public static /* synthetic */ void m58607V1(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded.get(0).canGreet = true;
        viewTreeObserverOnGlobalLayoutListenerC7866b.f21888M.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: V2 */
    public static /* synthetic */ void m58608V2(final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        Dialog.C4309e c4309eDialog = viewTreeObserverOnGlobalLayoutListenerC7866b.act().dialog();
        String str = "卡片清晰度优化实验入组：" + lra0.f129513h.get();
        String str2 = "profile裁剪上传原图：" + lra0.f129511g.get();
        String strConcat = "选择加载640图片 ".concat(lra0.f129517j.get().intValue() == 640 ? "*" : "");
        String strConcat2 = "选择加载720图片 ".concat(lra0.f129517j.get().intValue() == 720 ? "*" : "");
        String strConcat3 = "选择加载1080图片 ".concat(lra0.f129517j.get().intValue() == 1080 ? "*" : "");
        c4309eDialog.m20535e0(vwb.m200324f0(str, str2, "修改卡片照片宽高比", strConcat, strConcat2, strConcat3, "选择加载1440图片 ".concat(lra0.f129517j.get().intValue() == 1440 ? "*" : ""), "动态清晰度：" + lra0.f129515i.get(), "显示当前设备参数信息")).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.jxc
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                DebugUtil.m58433Mg(viewTreeObserverOnGlobalLayoutListenerC7866b, dialog, view, i, charSequence);
            }
        }).m20567z().show();
    }

    /* JADX INFO: renamed from: V5 */
    public static /* synthetic */ void m58611V5(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        final zpd0 zpd0Var = new zpd0("msg_chat_guide_waiting_time", 3600L);
        i0e.m133795d(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m133819I("输入聊天引导的等候时间，单位秒").m133815E(1).m133814D(80).m133825r(zpd0Var.get() + "").m133818H(zpd0Var.get() + "").m133816F(new e30() { // from class: l.jsc
            @Override // p149l.e30
            public final void call(Object obj) {
                DebugUtil.m58618Vc(zpd0Var, (String) obj);
            }
        }).m133821n().show();
    }

    /* JADX INFO: renamed from: V8 */
    public static /* synthetic */ void m58614V8() {
        hpd0 hpd0Var = lra0.f129480H;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: Va */
    public static /* synthetic */ void m58616Va(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        CoreModule.f17545c.f19639e0.f149215L5.clear();
        CoreModule.f17545c.f19639e0.f149222M5.clear();
        new n2l(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).show();
    }

    /* JADX INFO: renamed from: Vc */
    public static /* synthetic */ void m58618Vc(zpd0 zpd0Var, String str) {
        try {
            zpd0Var.put(Long.valueOf(Long.parseLong(str)));
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: Vf */
    public static /* synthetic */ void m58621Vf(String str, SuggestedComplimentItem suggestedComplimentItem, roj0 roj0Var) {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f19472id = str;
        userInfo.compliment = suggestedComplimentItem;
        CoreModule.f17545c.f19663m0.m31154w6(userInfo, 0).subscribe(mkd0.m154956H(new e30() { // from class: l.h9c
            @Override // p149l.e30
            public final void call(Object obj) {
                osi0.m165783g("已插入到顶部");
            }
        }, new e30() { // from class: l.i9c
            @Override // p149l.e30
            public final void call(Object obj) {
                DebugUtil.m58576Tc((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Vg */
    public static /* synthetic */ void m58622Vg(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, Questionnaire questionnaire) {
        if (NullChecker.m81303a(questionnaire) && !vwb.m200296J(questionnaire.options) && questionnaire.options.size() == 3) {
            new gij0(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m126354z0(questionnaire);
        }
    }

    /* JADX INFO: renamed from: Vi */
    public static void m58624Vi(final ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("聊天真实性", new d30() { // from class: l.fwc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58909j1(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
    }

    /* JADX INFO: renamed from: Vj */
    public static void m58625Vj(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("男性心动信号二期", new C9120q0(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: W2 */
    public static /* synthetic */ void m58629W2() {
        hpd0 hpd0Var = lra0.f129496X;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m58630W3() {
        hpd0 hpd0Var = CoreModule.f17545c.f19663m0.f19345I1;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: W4 */
    public static /* synthetic */ void m58631W4() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.FemaleVipGuideCard;
        userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f17545c.f19663m0.m31154w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: W6 */
    public static /* synthetic */ void m58633W6() {
        lra0.f129532s.put(Boolean.FALSE);
        lra0.f129533t.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: W8 */
    public static /* synthetic */ void m58635W8(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profile180().formatted());
        arrayList.add(CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profile180().formatted());
        arrayList.add(CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profile180().formatted());
        ok3.m164809H(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), 3, arrayList);
    }

    /* JADX INFO: renamed from: Wd */
    public static /* synthetic */ void m58640Wd(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("启动男性配对成功页面", new d30() { // from class: l.a0d
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().startActivityWithCustomTransition(MatchAct.m47564g2(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), vwb.m200299M(viewTreeObserverOnGlobalLayoutListenerC7866b2.m37125A2().mo38813j().f19472id), 0, new ArrayList(), ""), new MatchAct.C8453a());
            }
        }));
        arrayList.add(vwb.m200311Y("启动女性配对成功页面", new d30() { // from class: l.b0d
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                aci.m95753c0(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), CoreModule.f17545c.f19639e0.m169524oa(viewTreeObserverOnGlobalLayoutListenerC7866b2.m37125A2().mo38813j().f19472id), false, "", true);
            }
        }));
        final MatchSuccessAnimTime matchSuccessAnimTimeM167982l = pa30.m167982l();
        arrayList.add(vwb.m200311Y("女性 进入动画时间 " + matchSuccessAnimTimeM167982l.female_enter_time, new d30() { // from class: l.c0d
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                MatchSuccessAnimTime matchSuccessAnimTime = matchSuccessAnimTimeM167982l;
                i0e.m133795d(viewTreeObserverOnGlobalLayoutListenerC7866b2.act()).m133819I("时间 = " + matchSuccessAnimTime.female_enter_time).m133816F(new e30() { // from class: l.vad
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m58158A3(matchSuccessAnimTime, (String) obj);
                    }
                }).m133821n().show();
            }
        }));
        arrayList.add(vwb.m200311Y("女性 退出动画时间 " + matchSuccessAnimTimeM167982l.female_exit_time, new d30() { // from class: l.d0d
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                MatchSuccessAnimTime matchSuccessAnimTime = matchSuccessAnimTimeM167982l;
                i0e.m133795d(viewTreeObserverOnGlobalLayoutListenerC7866b2.act()).m133819I("时间 = " + matchSuccessAnimTime.female_exit_time).m133816F(new e30() { // from class: l.r8c
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m58525R3(matchSuccessAnimTime, (String) obj);
                    }
                }).m133821n().show();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: We */
    public static /* synthetic */ void m58641We() {
        hpd0 hpd0Var = CoreModule.f17545c.f19663m0.f19380V0;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        CoreModule.f17545c.f19663m0.f19383W0.put(bool);
    }

    /* JADX INFO: renamed from: Wh */
    public static /* synthetic */ void m58644Wh() {
    }

    /* JADX INFO: renamed from: Wi */
    public static void m58645Wi(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("验证二维码", new C9095j1(viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: Wj */
    public static void m58646Wj(final ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        Date date = new Date();
        date.setTime(CoreModule.f17545c.f19642f0.m32940eg());
        final String str = mqi0.f135254f.format(date);
        final boolean zBooleanValue = CoreModule.f17545c.f19639e0.f149312Y2.get().booleanValue();
        arrayList.add(vwb.m200311Y("新增通讯录", new d30() { // from class: l.bwc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58768cd(arrayList, str, zBooleanValue, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ void m58648X0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("新旧切换开关:" + CoreModule.f17545c.f19663m0.f19333E1.get(), new d30() { // from class: l.jzc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58300Gd();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m58649X1(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            y1j.m212196d().f195418c.put(Lifecycle.State.CREATED.name());
        } else if (i == 1) {
            y1j.m212196d().f195418c.put(Lifecycle.State.STARTED.name());
        } else if (i == 2) {
            y1j.m212196d().f195418c.put(Lifecycle.State.RESUMED.name());
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m58651X3() {
        r9m.f158389i.put(Boolean.TRUE);
        hpd0 hpd0Var = r9m.f158390j;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: X5 */
    public static /* synthetic */ void m58653X5() {
    }

    /* JADX INFO: renamed from: X9 */
    public static /* synthetic */ void m58657X9(final ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = CoreModule.f17545c.f19663m0.f19394a0.m221515e();
        if (partialListOptM221515e == null || vwb.m200296J(partialListOptM221515e.loaded)) {
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
        final NewMainAct newMainActAct = viewTreeObserverOnGlobalLayoutListenerC7866b.act();
        final ArrayList arrayList2 = new ArrayList();
        arrayList2.add(partialListOptM221515e.loaded.get(0).f19472id);
        vwb.m200354z(linkedHashMap.entrySet(), new e30() { // from class: l.exc
            @Override // p149l.e30
            public final void call(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                arrayList.add(vwb.m200311Y((String) entry.getKey(), new d30() { // from class: l.l9d
                    @Override // p149l.d30
                    public final void call() {
                        NewMainAct newMainAct = newMainAct;
                        newMainAct.startActivityWithCustomTransition(MatchAct.m47563e2(newMainAct, arrayList, ((Integer) entry.getValue()).intValue(), new ArrayList()), new MatchAct.C8454b());
                    }
                }));
            }
        });
        newMainActAct.showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Xd */
    public static /* synthetic */ void m58661Xd(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("关于我", new d30() { // from class: l.f1d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58875ha(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("问答", new d30() { // from class: l.g1d
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().startActivity(ExpandProfileLikeAct.m43249V1(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), new CoreSuggested.UserInfo(), CoreModule.f17545c.f19639e0.m169527p9().f56011id, "card", HomeCardExpandedType.QUESTION.getAlias(), 0));
            }
        }));
        arrayList.add(vwb.m200311Y("生活照片点赞", new d30() { // from class: l.h1d
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().startActivity(ExpandProfileLikeAct.m43249V1(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), new CoreSuggested.UserInfo(), CoreModule.f17545c.f19639e0.m169527p9().f56011id, "card", HomeCardExpandedType.LIFE_PIC.getAlias(), 0));
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Xh */
    public static /* synthetic */ void m58665Xh(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        ArrayList arrayList = new ArrayList();
        for (Merchandise merchandise : zl80.m219252g().m219257d(true)) {
            if (arrayList.size() >= 2) {
                break;
            } else if (TEnum.equals(merchandise.category, "svip")) {
                arrayList.add(merchandise);
            }
        }
        PriceRecallGetSurprise2Dialog.m50489l(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), arrayList, true);
    }

    /* JADX INFO: renamed from: Xi */
    public static void m58666Xi(final ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("城市C位", new d30() { // from class: l.mwc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58295G8(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
    }

    /* JADX INFO: renamed from: Xj */
    public static void m58667Xj(Act act, final boolean z) {
        if (!upa.m194726a2()) {
            CoreModule.f17545c.f19642f0.m32869Yf(act);
        }
        if (z) {
            CoreModule.f17545c.f19642f0.m32677Ie();
        } else {
            CoreModule.f17545c.f19642f0.m32689Je();
        }
        CoreModule.f17545c.f19642f0.m33073on().take(1).observeOn(Schedulers.m221493io()).delay(1L, TimeUnit.SECONDS).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.vnc
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((q860) obj).f153135a;
            }
        }).filter(new w9j() { // from class: l.wnc
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((List) obj));
            }
        }).flatMap(new na8()).filter(new w9j() { // from class: l.ync
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Conversation) obj).status, "default"));
            }
        }).filter(new w9j() { // from class: l.znc
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Conversation) obj).otherUser.startsWith("-"));
            }
        }).filter(new w9j() { // from class: l.aoc
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(z || ((Conversation) obj).localHasMessage);
            }
        }).skip(z ? 6 : 0).take(50).buffer(50).subscribe(mkd0.m154955G(new e30() { // from class: l.boc
            @Override // p149l.e30
            public final void call(Object obj) {
                DebugUtil.m58713a2(z, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m58668Y(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        f7e0 f7e0Var = new f7e0(viewTreeObserverOnGlobalLayoutListenerC7866b, CoreModule.f17545c.f19639e0.m169527p9().m60124fp().url, viewTreeObserverOnGlobalLayoutListenerC7866b.act().string(R$string.f18039Pm), 1, 1, null, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, ShareConstants.OLD_VERSION);
        f7e0Var.m120965s(new d30() { // from class: l.auc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59199w5();
            }
        });
        f7e0Var.m96808x(CorePopLevel.INTL_SEE_ANIM_BUBBLE);
        hdb0.m130575c().m130582i(f7e0Var);
    }

    /* JADX INFO: renamed from: Y2 */
    public static /* synthetic */ void m58671Y2(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        BarLoverplaces barLoverplacesNew_ = BarLoverplaces.new_();
        barLoverplacesNew_.f20354id = "201";
        barLoverplacesNew_.name = "Sounding唱跳俱乐部";
        new ud2(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), barLoverplacesNew_).show();
    }

    /* JADX INFO: renamed from: Y5 */
    public static /* synthetic */ void m58674Y5(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("购买弹窗", new d30() { // from class: l.c3d
            @Override // p149l.d30
            public final void call() {
                new mvm.C18569e(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m156569b("p_knowmyself_purchase,e_knowmyself_test,click").m156570c(new g30() { // from class: l.abd
                    @Override // p149l.g30
                    /* JADX INFO: renamed from: a */
                    public final void mo36055a(Object obj, Object obj2, Object obj3) {
                        DebugUtil.m58847g4((PurchaseType) obj, (Act) obj2, (String) obj3);
                    }
                }).m156571d();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Y7 */
    public static /* synthetic */ void m58676Y7(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        puk0.m171431e().m171437h("antispam");
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().startActivity(VerificationAct.m59464m2(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), 1, "avatar_ability"));
    }

    /* JADX INFO: renamed from: Ya */
    public static /* synthetic */ void m58679Ya(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        PurchaseType purchaseType = PurchaseType.TYPE_FEMALE_VIP;
        new C8778c.a(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), purchaseType, null).m54094g(fy80.m123720p(purchaseType, purchaseType.getPrivilegeData(null), Privilege.ads_not_disturb)).m54095h();
    }

    /* JADX INFO: renamed from: Ye */
    public static /* synthetic */ void m58683Ye() {
        m58262Ej();
        lsi0.m151595y("称赞Mock数据已删除");
    }

    /* JADX INFO: renamed from: Yf */
    public static /* synthetic */ void m58684Yf() {
        hpd0 hpd0Var = lra0.f129479G;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        lra0.f129478F.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: Yi */
    public static void m58687Yi(final ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("全部配对气泡 " + CoreModule.f17545c.f19642f0.f19953l1.get(), new d30() { // from class: l.bpc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58364Jb(arrayList);
            }
        }));
    }

    /* JADX INFO: renamed from: Yj */
    public static void m58688Yj(final ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("婚恋", new d30() { // from class: l.lsc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59134t6(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m58689Z() {
        CoreModule.f17545c.f19639e0.f149497w4.put(Boolean.FALSE);
        C4371a.m21100p().m21126w(false);
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m58693Z3(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("清空标签", new d30() { // from class: l.ctc
            @Override // p149l.d30
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC7866b.act().duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).take(1).map(new w9j() { // from class: l.a6d
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return DebugUtil.m58969lh((User) obj);
                    }
                }).flatMap(new w9j() { // from class: l.b6d
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return DebugUtil.m58985mb((User) obj);
                    }
                }).subscribe(mkd0.m154955G(new e30() { // from class: l.c6d
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m58808e9((roj0) obj);
                    }
                }));
            }
        }));
        arrayList.add(vwb.m200311Y("标签添加完成弹出 - 聊天详情页", new d30() { // from class: l.dtc
            @Override // p149l.d30
            public final void call() {
                sa40.m182802o().m182823U(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "from_message_tag_guide");
            }
        }));
        arrayList.add(vwb.m200311Y("标签添加完成弹出 - 心动信号广播", new d30() { // from class: l.etc
            @Override // p149l.d30
            public final void call() {
                sa40.m182802o().m182823U(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "from_heartbeat");
            }
        }));
        arrayList.add(vwb.m200311Y("标签添加完成弹出 - 引导标签添加划卡", new d30() { // from class: l.ftc
            @Override // p149l.d30
            public final void call() {
                sa40.m182802o().m182823U(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "from_card_tag_guide");
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Z4 */
    public static /* synthetic */ void m58694Z4() {
        hpd0 hpd0Var = lra0.f129514h0;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        hpd0 hpd0Var2 = lra0.f129516i0;
        Boolean bool = Boolean.FALSE;
        hpd0Var2.put(bool);
        lra0.f129518j0.put(bool);
        lra0.f129520k0.put(bool);
    }

    /* JADX INFO: renamed from: Z6 */
    public static /* synthetic */ void m58696Z6(roj0 roj0Var) {
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (verificationCenterM31612k4 != null) {
            lsi0.m151580j("认证状态为:".concat(TEnum.equals(verificationCenterM31612k4.idCard.status, "verified") ? "已认证" : "未认证"));
        }
    }

    /* JADX INFO: renamed from: Zd */
    public static /* synthetic */ void m58703Zd(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("打开通话Act", new d30() { // from class: l.roc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().startActivity(VoiceCallAct.m43824Z1(viewTreeObserverOnGlobalLayoutListenerC7866b2.act()));
            }
        }));
        arrayList.add(vwb.m200311Y("打开Push通知", new d30() { // from class: l.soc
            @Override // p149l.d30
            public final void call() {
                nlm0.f139569b = true;
            }
        }));
        arrayList.add(vwb.m200311Y("关闭Push通知", new d30() { // from class: l.uoc
            @Override // p149l.d30
            public final void call() {
                nlm0.f139569b = false;
            }
        }));
        arrayList.add(vwb.m200311Y("清除Debug 模拟", new d30() { // from class: l.voc
            @Override // p149l.d30
            public final void call() {
                nlm0.m160071d(-1);
            }
        }));
        arrayList.add(vwb.m200311Y("设置已经同意", new d30() { // from class: l.woc
            @Override // p149l.d30
            public final void call() {
                nlm0.m160071d(0);
            }
        }));
        arrayList.add(vwb.m200311Y("设置已经拒绝", new d30() { // from class: l.xoc
            @Override // p149l.d30
            public final void call() {
                nlm0.m160071d(1);
            }
        }));
        arrayList.add(vwb.m200311Y("设置同意", new d30() { // from class: l.yoc
            @Override // p149l.d30
            public final void call() {
                nlm0.m160071d(2);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Zg */
    public static /* synthetic */ void m58706Zg() {
    }

    /* JADX INFO: renamed from: Zi */
    public static String[] m58708Zi() {
        return m58730aj();
    }

    /* JADX INFO: renamed from: Zj */
    public static void m58709Zj(final ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("配对成功引导聊天", new d30() { // from class: l.cpc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58161A6(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
    }

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ void m58713a2(boolean z, List list) {
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
            CoreModule.f17545c.f19642f0.f19846B2.m132487l(linkedHashMap);
        } else {
            CoreModule.f17545c.f19642f0.f19849C2.m132487l(linkedHashMap);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public static /* synthetic */ void m58715a4(String str) {
        try {
            f38257g.put(Integer.valueOf(Integer.parseInt(str)));
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a9 */
    public static /* synthetic */ void m58720a9(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("清除频控", new C9076e2()));
        arrayList.add(vwb.m200311Y("弹出弹窗，样式1", new C9080f2(viewTreeObserverOnGlobalLayoutListenerC7866b)));
        arrayList.add(vwb.m200311Y("弹出弹窗，样式2", new C9084g2(viewTreeObserverOnGlobalLayoutListenerC7866b)));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: aa */
    public static /* synthetic */ void m58721aa() {
        hpd0 hpd0Var = lra0.f129527o;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: ab */
    public static /* synthetic */ void m58722ab() {
        if (NullChecker.m81303a(CoreModule.f17545c.f19663m0.f19394a0.m221515e())) {
            List<CoreSuggested.UserInfo> list = CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded;
            if (vwb.m200296J(list)) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                CoreSuggested.UserInfo userInfo = list.get(size);
                if (!CoreModule.f17545c.f19663m0.f19445r0.contains(userInfo.f19472id)) {
                    CoreModule.f17545c.f19663m0.m31111i6(userInfo.f19472id);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ac */
    public static /* synthetic */ void m58723ac(PurchaseType purchaseType, Act act, String str) {
    }

    /* JADX INFO: renamed from: af */
    public static /* synthetic */ void m58726af(Throwable th) {
    }

    /* JADX INFO: renamed from: ag */
    public static /* synthetic */ void m58727ag(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("清除白金会话相关本地变量", new d30() { // from class: l.a4d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59032oe();
            }
        }));
        arrayList.add(vwb.m200311Y("划卡前三张设置白金置顶喜欢", new d30() { // from class: l.b4d
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19663m0.m31066W8().take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.u8c
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m58577Td((PartialListOpt) obj);
                    }
                }));
            }
        }));
        arrayList.add(vwb.m200311Y("白金置顶喜欢发送push气泡", new d30() { // from class: l.c4d
            @Override // p149l.d30
            public final void call() {
                xl4.m209842a(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: aj */
    public static String[] m58730aj() {
        String[][] strArr = f38260j;
        String[] strArr2 = new String[strArr.length];
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            strArr2[i2] = m58797dk(Integer.parseInt(strArr[i][2]));
            i++;
            i2++;
        }
        return strArr2;
    }

    /* JADX INFO: renamed from: ak */
    public static void m58731ak(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("配对成功页2期", new C9135v0(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m58732b() {
        CoreModule.f17545c.f19639e0.f149298W4.put(0L);
        CoreModule.f17545c.f19639e0.f149306X4.put(0);
        CoreModule.f17545c.f19639e0.f149314Y4.put(Boolean.FALSE);
        CoreModule.f17545c.f19639e0.f149322Z4.put(0L);
        CoreModule.f17545c.f19639e0.f149330a5.put(0);
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m58733b0(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        CityTopGreetDialog.C8619c c8619c = new CityTopGreetDialog.C8619c(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
        c8619c.m50562b(CoreModule.f17545c.f19639e0.m169527p9());
        c8619c.m50561a().show();
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ void m58736b3(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, String str, Conversation conversation) {
        if (NullChecker.m81303a(conversation)) {
            viewTreeObserverOnGlobalLayoutListenerC7866b.act().startActivity(MessagesAct.m48944k2(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), str, true, false, -1));
        } else {
            C8360d.m45892a(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), new C8360d.a(str, "from_h5_suggest_user"));
        }
    }

    /* JADX INFO: renamed from: b4 */
    public static /* synthetic */ roj0 m58737b4(final List list) {
        CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.u8d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58758c3(list);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: b5 */
    public static /* synthetic */ void m58738b5(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("清除bubble计数", new d30() { // from class: l.vyc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58271F6();
            }
        }));
        arrayList.add(vwb.m200311Y("跳转黑金遇见访客页", new d30() { // from class: l.wyc
            @Override // p149l.d30
            public final void call() {
                CoreModule.m29935P().m94651a().mo33627xg(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: b6 */
    public static /* synthetic */ void m58739b6() {
        CoreModule.f17545c.f19668n2.m175428E3();
        lsi0.m151595y("已清除");
    }

    /* JADX INFO: renamed from: b7 */
    public static /* synthetic */ void m58740b7(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("清除划卡按钮提示", new d30() { // from class: l.swc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58899ic();
            }
        }));
        arrayList.add(vwb.m200311Y("打开显示43信息", new d30() { // from class: l.twc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19639e0.f149406k1.put(Boolean.TRUE);
            }
        }));
        arrayList.add(vwb.m200311Y("关闭显示43信息", new d30() { // from class: l.uwc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19639e0.f149406k1.put(Boolean.FALSE);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: b9 */
    public static /* synthetic */ void m58742b9(HashMap map, ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
    }

    /* JADX INFO: renamed from: ba */
    public static /* synthetic */ void m58743ba() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149198J2;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: bb */
    public static /* synthetic */ void m58744bb() {
        CoreModule.f17545c.f19654j0.m30639w4();
        p2b0.m167133h().m167137e();
    }

    /* JADX INFO: renamed from: bd */
    public static /* synthetic */ void m58746bd(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, Questionnaire questionnaire) {
        if (NullChecker.m81303a(questionnaire) && !vwb.m200296J(questionnaire.options) && questionnaire.options.size() == 3) {
            new gij0(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m126320C0(questionnaire);
        }
    }

    /* JADX INFO: renamed from: bf */
    public static /* synthetic */ void m58748bf() {
        hpd0 hpd0Var = a5x.f67731a;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: bg */
    public static /* synthetic */ void m58749bg(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        Window window = viewTreeObserverOnGlobalLayoutListenerC7866b.act().getWindow();
        if (window != null) {
            window.setSoftInputMode(3);
        }
        e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), new RunnableC9125s(viewTreeObserverOnGlobalLayoutListenerC7866b), 1000L);
    }

    /* JADX INFO: renamed from: bh */
    public static /* synthetic */ void m58750bh() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149427m6;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: bi */
    public static /* synthetic */ void m58751bi() {
        hpd0 hpd0Var = CoreModule.f17545c.f19663m0.f19377U0;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: bj */
    public static void m58752bj(ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("连续聊天外显", new d30() { // from class: l.tkc
            @Override // p149l.d30
            public final void call() {
                i0e.m133795d(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m133819I("是否开启 debug模式").m133815E(1).m133814D(80).m133818H(CoreModule.f17545c.f19642f0.f19989x1.get() + "").m133816F(new e30() { // from class: l.e0d
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m58981m7((String) obj);
                    }
                }).m133821n().show();
            }
        }));
    }

    /* JADX INFO: renamed from: bk */
    public static void m58753bk(final ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("消息帧二期", new d30() { // from class: l.axc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59097rd(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m58755c0(Throwable th) {
    }

    /* JADX INFO: renamed from: c2 */
    public static /* synthetic */ void m58757c2() {
        hpd0 hpd0Var = f38252b;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        f38253c.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ void m58758c3(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qib0.f154722k0.f176631d.upsert((User) it.next());
        }
    }

    /* JADX INFO: renamed from: c5 */
    public static /* synthetic */ void m58760c5(final User user) {
        try {
            CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.e9c
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.m58485P5(user);
                }
            });
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        m59126sk();
    }

    /* JADX INFO: renamed from: ca */
    public static /* synthetic */ void m58765ca(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        ArrayList arrayList = new ArrayList();
        for (Merchandise merchandise : zl80.m219252g().m219257d(true)) {
            if (arrayList.size() >= 2) {
                break;
            } else if (TEnum.equals(merchandise.category, "svip")) {
                arrayList.add(merchandise);
            }
        }
        km80.m146459h0(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), null, arrayList, "p_promotion,callback_other", null);
    }

    /* JADX INFO: renamed from: cd */
    public static /* synthetic */ void m58768cd(ArrayList arrayList, String str, final boolean z, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("清空上次记录新配对个数 = " + str, new d30() { // from class: l.hzc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m32612Cp(0L);
            }
        }));
        arrayList.add(vwb.m200311Y("显示空数据 = " + z, new d30() { // from class: l.izc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19639e0.f149312Y2.put(Boolean.valueOf(!z));
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: ce */
    public static /* synthetic */ void m58769ce(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        ArrayList arrayList = new ArrayList();
        PrivilegeDetail privilegeDetailNew_ = PrivilegeDetail.new_();
        privilegeDetailNew_.channel = "buy";
        privilegeDetailNew_.privilegeType = "vip";
        arrayList.add(privilegeDetailNew_);
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().startActivity(PurchaseResultAct.m54733X1(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "vip", "111", "￥", Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE, new Gson().toJson(arrayList)));
    }

    /* JADX INFO: renamed from: cf */
    public static /* synthetic */ void m58770cf() {
        hpd0 hpd0Var = lra0.f129504c0;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        lra0.f129502b0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: ci */
    public static /* synthetic */ void m58773ci() {
        String str = "svip_new_prom_dlg_first_is_show" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        new hpd0(str, bool).put(bool);
        new hpd0("svip_new_prom_dlg_end_is_show" + CoreModule.m29931H().userId(), bool).put(bool);
    }

    /* JADX INFO: renamed from: cj */
    public static void m58774cj(String str, String str2, double d, String str3) {
        Conversation conversationQuery = CoreModule.f17553k.f91950m.query(str);
        if (conversationQuery == null) {
            conversationQuery = Conversation.new_();
            conversationQuery.f56011id = str;
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
        CoreModule.f17545c.f19642f0.m33050mq(conversationQuery);
    }

    /* JADX INFO: renamed from: ck */
    public static void m58775ck(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("消息页面增加筛选选项", new C9117p0(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m58776d() {
        CoreModule.f17545c.f19639e0.f149259R5.clear();
        CoreModule.f17545c.f19639e0.f149267S5.clear();
        CoreModule.f17545c.f19639e0.f149275T5.clear();
        CoreModule.f17545c.f19639e0.f149283U5.clear();
        CoreModule.f17545c.f19639e0.f149291V5.clear();
        CoreModule.f17545c.f19639e0.f149299W5.clear();
        CoreModule.f17545c.f19639e0.f149307X5.clear();
        CoreModule.f17545c.f19639e0.f149315Y5.clear();
        CoreModule.f17545c.f19639e0.f149355d6.clear();
        CoreModule.f17545c.f19639e0.f149363e6.clear();
        CoreModule.f17545c.f19639e0.f149371f6.clear();
        CoreModule.f17545c.f19639e0.f149379g6.clear();
        CoreModule.f17545c.f19622Y0.f94258c.clear();
    }

    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ void m58778d1(Throwable th) {
    }

    /* JADX INFO: renamed from: d2 */
    public static /* synthetic */ void m58779d2(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        HashMap<String, SuggestedComplimentItem> mapM31107h6 = CoreModule.f17545c.f19663m0.m31107h6();
        if (mapM31107h6 == null || mapM31107h6.isEmpty()) {
            osi0.m165783g("无 suggest 称赞数据");
            return;
        }
        Map.Entry<String, SuggestedComplimentItem> next = mapM31107h6.entrySet().iterator().next();
        final String key = next.getKey();
        final SuggestedComplimentItem value = next.getValue();
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = CoreModule.f17545c.f19663m0.f19394a0.m221515e();
        List<CoreSuggested.UserInfo> list = partialListOptM221515e == null ? null : partialListOptM221515e.loaded;
        CoreSuggested.UserInfo userInfo = vwb.m200296J(list) ? null : (CoreSuggested.UserInfo) vwb.m200346r(list, new w9j() { // from class: l.bbd
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((CoreSuggested.UserInfo) obj).f19472id, key));
            }
        });
        if (userInfo == null) {
            viewTreeObserverOnGlobalLayoutListenerC7866b.act().duringCreated(CoreModule.f17545c.f19639e0.m169454W9(key)).subscribe(mkd0.m154956H(new e30() { // from class: l.ebd
                @Override // p149l.e30
                public final void call(Object obj) {
                    DebugUtil.m58621Vf(key, value, (roj0) obj);
                }
            }, new e30() { // from class: l.fbd
                @Override // p149l.e30
                public final void call(Object obj) {
                    osi0.m165783g("拉取用户失败");
                }
            }));
        } else {
            userInfo.compliment = value;
            CoreModule.f17545c.f19663m0.m31154w6(userInfo, 0).subscribe(mkd0.m154956H(new e30() { // from class: l.cbd
                @Override // p149l.e30
                public final void call(Object obj) {
                    osi0.m165783g("已移到顶部");
                }
            }, new e30() { // from class: l.dbd
                @Override // p149l.e30
                public final void call(Object obj) {
                    DebugUtil.m58191Be((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: d4 */
    public static /* synthetic */ void m58781d4() {
        hpd0 hpd0Var = h7j.f106284b;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: d6 */
    public static /* synthetic */ void m58783d6() {
        String str = "app_toolbar_white_theme_" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        hpd0 hpd0Var = new hpd0(str, bool);
        if (((Boolean) hpd0Var.get()).booleanValue()) {
            hpd0Var.put(bool);
        } else {
            hpd0Var.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: d8 */
    public static /* synthetic */ void m58785d8() {
        CoreSuggested.UserInfo userInfo = CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded.get(0);
        Gson gson = new Gson();
        gson.toJson(userInfo);
        lsi0.m151580j(gson.toJson(userInfo));
    }

    /* JADX INFO: renamed from: d9 */
    public static /* synthetic */ void m58786d9(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, Dialog dialog, View view, int i, CharSequence charSequence) {
        String string = charSequence.toString();
        string.getClass();
        switch (string) {
            case "查看喜欢我的人":
                viewTreeObserverOnGlobalLayoutListenerC7866b.act().startActivity(CoreModule.m29935P().m94651a().mo33433Vf() ? NewMyLikedUsersAct.m46820Y1(viewTreeObserverOnGlobalLayoutListenerC7866b.act()) : new Intent(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), (Class<?>) LikedUsersAct.class));
                break;
            case "清除svip红点记录":
                uld0.m194220e().m194223c();
                break;
            case "SVIPIntlGuideAct":
                viewTreeObserverOnGlobalLayoutListenerC7866b.act().startActivity(SVIPIntlGuideAct.m55842Y1(viewTreeObserverOnGlobalLayoutListenerC7866b.act()));
                break;
        }
    }

    /* JADX INFO: renamed from: dd */
    public static /* synthetic */ void m58790dd(d30 d30Var, d30 d30Var2, d30 d30Var3, d30 d30Var4, d30 d30Var5, d30 d30Var6) {
        d30Var.call();
        d30Var2.call();
        d30Var3.call();
        d30Var4.call();
        d30Var5.call();
        d30Var6.call();
    }

    /* JADX INFO: renamed from: dh */
    public static /* synthetic */ void m58794dh(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        q89 q89Var = CoreModule.f17545c.f19672p0;
        q89Var.f153141S = 0.15d;
        q89Var.f153143U = 0.19d;
        bo5.m102901l(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), m58415Lj(viewTreeObserverOnGlobalLayoutListenerC7866b), BuildConfig.BUILD_TYPE, null);
    }

    /* JADX INFO: renamed from: dj */
    public static void m58796dj(ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("国际化 同道中人", new d30() { // from class: l.fpc
            @Override // p149l.d30
            public final void call() {
                C8411a.INSTANCE.m46885f(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), true);
            }
        }));
    }

    /* JADX INFO: renamed from: dk */
    public static String m58797dk(int i) {
        return String.valueOf(i + 25541);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m58799e0(Throwable th) {
    }

    /* JADX INFO: renamed from: e2 */
    public static /* synthetic */ void m58801e2() {
        u0n.f172927c = true;
        CoreModule.f17545c.f19639e0.f149263S1.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ void m58802e3() {
        m58520Qj();
        lsi0.m151595y("称赞Mock数据已插入");
    }

    /* JADX INFO: renamed from: e5 */
    public static /* synthetic */ void m58804e5(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("清除缓存", new d30() { // from class: l.i1d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58836ff();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: e6 */
    public static /* synthetic */ void m58805e6(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("送你AI魔法照", new d30() { // from class: l.wkc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58480P0();
            }
        }));
        arrayList.add(vwb.m200311Y("摇骰子游戏邀请", new d30() { // from class: l.ykc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59051pb();
            }
        }));
        arrayList.add(vwb.m200311Y("送你一个清凉的夏天 收到", new d30() { // from class: l.zkc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58543S0();
            }
        }));
        arrayList.add(vwb.m200311Y("邀请加入“欧美好剧的群…", new d30() { // from class: l.alc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59109s3();
            }
        }));
        arrayList.add(vwb.m200311Y("找搭子一起学习", new d30() { // from class: l.blc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58362J9();
            }
        }));
        arrayList.add(vwb.m200311Y("设置开场白", new d30() { // from class: l.clc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58497Ph();
            }
        }));
        arrayList.add(vwb.m200311Y("她今天生日 tip", new d30() { // from class: l.dlc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59087r3();
            }
        }));
        arrayList.add(vwb.m200311Y("我的状态·吃瓜 tip", new d30() { // from class: l.elc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58267F2();
            }
        }));
        arrayList.add(vwb.m200311Y("上线提醒", new d30() { // from class: l.flc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59176v4();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: e7 */
    public static /* synthetic */ void m58806e7() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.AdCard;
        userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        for (OMSAdCardInfo oMSAdCardInfo : ic50.m135327j().m135335h()) {
            if (TextUtils.equals(oMSAdCardInfo.contentType, "literatureCardGuide")) {
                userInfo.extensionObject = oMSAdCardInfo;
                CoreModule.f17545c.f19663m0.m31154w6(userInfo, 0);
                CoreModule.f17545c.f19663m0.f19372S1.put(userInfo, 0);
            }
        }
    }

    /* JADX INFO: renamed from: e9 */
    public static /* synthetic */ void m58808e9(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: ea */
    public static /* synthetic */ void m58809ea() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149147B6;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: eb */
    public static /* synthetic */ void m58810eb(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("开关，当前".concat(CoreModule.f17545c.f19639e0.f149427m6.get().booleanValue() ? "true" : "false"), new d30() { // from class: l.f5d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58750bh();
            }
        }));
        arrayList.add(new j760("新上传图片都打标，当前".concat(CoreModule.f17545c.f19639e0.f149435n6.get().booleanValue() ? "true" : "false"), new d30() { // from class: l.g5d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59068q6();
            }
        }));
        arrayList.add(new j760("强制更换头像页", new C9104l2(viewTreeObserverOnGlobalLayoutListenerC7866b)));
        arrayList.add(new j760("清除我的Tab认证失败红点频控", new C9108m2()));
        arrayList.add(new j760("修改年龄", new C9061b(viewTreeObserverOnGlobalLayoutListenerC7866b)));
        arrayList.add(new j760("我的Tab展示叹号", new C9065c(viewTreeObserverOnGlobalLayoutListenerC7866b)));
        arrayList.add(new j760("我的Tab展示黑金", new C9069d(viewTreeObserverOnGlobalLayoutListenerC7866b)));
        arrayList.add(new j760("我的Tab展示未完善", new C9073e(viewTreeObserverOnGlobalLayoutListenerC7866b)));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: ee */
    public static /* synthetic */ void m58813ee(final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        final User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
        final CounterLikeLimit counterLikeLimit = counterM31484o3 == null ? null : counterM31484o3.likeLimit;
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().dialog().m20535e0(vwb.m200324f0("10 last swipe alert already delete", "1-swipe 500 cards alert", "2-thin profile popup", "3-first left swipe", "4-first right swipe", "5-first superlike swipe", "6-first undo", "7-see expired dialog", "8-vip expired dialog", "9-out of superlike", "10-out of undo", "11-first scenario like", "12-vip alert", "13-only buy superlike alert", "14-show name fake alert", "15-fake alert", "16-school navigate dialog", "17-school approval failed", "18-matched !!", "19-ugly alert", "20-superlike intro", "21-permission alert", "22-share card", "23-good2fake alert", "24-superlike awrad recived", "25-scenario intro dialog", "26-scenario active dialog", "27-uglyalert special one", "28-TBH introduce dialog", "29-see not match dlg 3", "30-gp_ratev2", "31-gp renew subs failed", "32-gp renew subs data toast", "33-gp miss match toast", "34-see privilege activated", "35-gp pay failed dlg")).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.xsc
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                DebugUtil.m59150u0(counterLikeLimit, viewTreeObserverOnGlobalLayoutListenerC7866b, userM169527p9, dialog, view, i, charSequence);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: ef */
    public static /* synthetic */ void m58814ef(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        ActionToast actionToastNew_ = ActionToast.new_();
        actionToastNew_.message = "哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈";
        actionToastNew_.mainImg = "http://cloud.staging2.p1staff.com/v1/images/eyJpZCI6IkJSRlRDQkJaVk1FT0UzTkpEUkw3NlRUV0ZUVFdMRjAyIiwidyI6NDAwLCJoIjo1MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MDI4ODUyMzIxODk5Njg3MzA5fQ.webp?format=max_960xX";
        CardOption cardOptionNew_ = CardOption.new_();
        cardOptionNew_.link = "tantanapp://home?action=location";
        actionToastNew_.option = cardOptionNew_;
        qug0.m176610g().m176618l(viewTreeObserverOnGlobalLayoutListenerC7866b, actionToastNew_);
    }

    /* JADX INFO: renamed from: eg */
    public static /* synthetic */ void m58815eg() {
        List<CoreSuggested.UserInfo> list = CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded;
        if (vwb.m200296J(list)) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            stringBuffer.append(list.get(i).f19472id + com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
        }
    }

    /* JADX INFO: renamed from: ei */
    public static /* synthetic */ void m58817ei() {
        CoreModule.f17545c.f19663m0.f19380V0.put(Boolean.FALSE);
        CoreModule.f17545c.f19663m0.f19383W0.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: ej */
    public static void m58818ej(ArrayList<j760<String, d30>> arrayList) {
    }

    /* JADX INFO: renamed from: ek */
    public static void m58819ek(final ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("新资料页改版", new d30() { // from class: l.jtc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58648X0(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m58820f() {
        hpd0 hpd0Var = f38253c;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        f38252b.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m58821f0(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ void m58822f1() {
        hpd0 hpd0Var = CoreModule.f17545c.f19663m0.f19455u1;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: f4 */
    public static /* synthetic */ void m58825f4(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("插入闪聊广播弹窗", new d30() { // from class: l.p3d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58952l0(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("闪聊配对成功弹窗-》消息页面", new d30() { // from class: l.q3d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58966le();
            }
        }));
        arrayList.add(vwb.m200311Y("闪聊配对成功弹窗-》popwindow", new d30() { // from class: l.r3d
            @Override // p149l.d30
            public final void call() {
                C8609a.m50266l0(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), CoreModule.f17545c.f19639e0.m169527p9());
            }
        }));
        arrayList.add(vwb.m200311Y("清理 插入闪聊广播弹窗 次数:" + CoreModule.f17545c.f19558D0.f20131V.get(), new d30() { // from class: l.t3d
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19558D0.f20131V.put(0);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: f6 */
    public static /* synthetic */ void m58827f6() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149504x4;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: f7 */
    public static /* synthetic */ void m58828f7(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("一键打开：" + C4371a.m21100p().m21118n(), new d30() { // from class: l.a1d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58242E();
            }
        }));
        arrayList.add(vwb.m200311Y("一键关闭：" + C4371a.m21100p().m21118n(), new d30() { // from class: l.b1d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58689Z();
            }
        }));
        arrayList.add(vwb.m200311Y("展示debug入口", new d30() { // from class: l.c1d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59192vk(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("默认展示入口", new d30() { // from class: l.e1d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58266F1();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: f8 */
    public static /* synthetic */ void m58829f8() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.MarryAdCard;
        userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f17545c.f19663m0.m31154w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: fa */
    public static /* synthetic */ void m58831fa() {
        hpd0 hpd0Var = CoreModule.f17545c.f19663m0.f19342H1;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: fb */
    public static /* synthetic */ void m58832fb() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.FourSelectOneAdCard;
        userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        FourSelectOneAdCardData fourSelectOneAdCardDataNew_ = FourSelectOneAdCardData.new_();
        fourSelectOneAdCardDataNew_.adTitle = "同分享生活中的小幸运？";
        fourSelectOneAdCardDataNew_.adContent = "挑一挑谁最符合问题描述";
        fourSelectOneAdCardDataNew_.avatarList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlJDSlFTVVNCWlROVjVDSVdZS0xLQldWRzNOT0VQTzE0IiwidyI6MzY2LCJoIjo1NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTkxMDU4OTA2OTkyMDY4NzcyOX0.png");
        fourSelectOneAdCardDataNew_.avatarList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IkVBUERJVE9NT0o0Sk5ZNlJUVlA0UjRXSU1XSk03RjE0IiwidyI6MzY2LCJoIjo1NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjQ2NjAzMTQ0OTY1NDM0NzA3fQ.png");
        fourSelectOneAdCardDataNew_.avatarList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlJDSlFTVVNCWlROVjVDSVdZS0xLQldWRzNOT0VQTzE0IiwidyI6MzY2LCJoIjo1NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTkxMDU4OTA2OTkyMDY4NzcyOX0.png");
        fourSelectOneAdCardDataNew_.avatarList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IkVBUERJVE9NT0o0Sk5ZNlJUVlA0UjRXSU1XSk03RjE0IiwidyI6MzY2LCJoIjo1NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjQ2NjAzMTQ0OTY1NDM0NzA3fQ.png");
        userInfo.fourSelectOneAdCardData = fourSelectOneAdCardDataNew_;
        CoreModule.f17545c.f19663m0.m31154w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: fe */
    public static /* synthetic */ void m58835fe() {
        hpd0 hpd0Var = tvf.f172281b;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        tvf.f172282c.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: ff */
    public static /* synthetic */ void m58836ff() {
        CoreModule.f17545c.f19598Q1.m34747l3(false);
        osi0.m165783g("已清除");
    }

    /* JADX INFO: renamed from: fg */
    public static /* synthetic */ void m58837fg(final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(TXLiteAVCode.EVT_HW_DECODER_START_SUCC, 4, 20);
        CoreModule.f17545c.f19687u0.f19261r0.put(Long.valueOf(calendar.getTimeInMillis()));
        e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), new Runnable() { // from class: l.dpc
            @Override // java.lang.Runnable
            public final void run() {
                viewTreeObserverOnGlobalLayoutListenerC7866b.m37366v2().m161086B5();
            }
        }, 2000L);
    }

    /* JADX INFO: renamed from: fh */
    public static /* synthetic */ void m58838fh() {
        Boolean bool = Boolean.FALSE;
        new hpd0("tantan_verification_tip_show", bool).put(bool);
    }

    /* JADX INFO: renamed from: fj */
    public static void m58840fj(ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("露营活动", new d30() { // from class: l.gxc
            @Override // p149l.d30
            public final void call() {
                C8382b.INSTANCE.m46287i(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), 1);
            }
        }));
    }

    /* JADX INFO: renamed from: fk */
    public static void m58841fk(final ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("新版配对成功", new d30() { // from class: l.snc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58640Wd(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m58842g() {
        hpd0 hpd0Var = lra0.f129506d0;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        lra0.f129508e0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: g2 */
    public static /* synthetic */ void m58845g2() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.NewUserSeeMyself;
        userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f17545c.f19663m0.m31154w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ void m58846g3(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        C4732c c4732c = CoreModule.f17545c;
        c4732c.f19622Y0.f94273r = 0;
        c4732c.f19639e0.f149215L5.clear();
        CoreModule.f17545c.f19639e0.f149222M5.clear();
        viewTreeObserverOnGlobalLayoutListenerC7866b.m37291f6();
    }

    /* JADX INFO: renamed from: g4 */
    public static /* synthetic */ void m58847g4(PurchaseType purchaseType, Act act, String str) {
    }

    /* JADX INFO: renamed from: g5 */
    public static /* synthetic */ void m58848g5() {
        uyc0.m196272l0().m196279p0(true);
        uyc0.m196272l0().m196280q0(true);
    }

    /* JADX INFO: renamed from: g6 */
    public static /* synthetic */ void m58849g6() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149345c4;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: g7 */
    public static /* synthetic */ void m58850g7(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded.get(0).debugRecommendMessage();
        viewTreeObserverOnGlobalLayoutListenerC7866b.f21888M.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: g8 */
    public static /* synthetic */ void m58851g8(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("自动划卡", new d30() { // from class: l.gmc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58414Li(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            }
        }));
        arrayList.add(vwb.m200311Y("还原速度", new d30() { // from class: l.hmc
            @Override // p149l.d30
            public final void call() {
                new tpd0("swipe_trans_speed", 1).put(1);
            }
        }));
        arrayList.add(vwb.m200311Y("x2速度", new d30() { // from class: l.imc
            @Override // p149l.d30
            public final void call() {
                new tpd0("swipe_trans_speed", 1).put(2);
            }
        }));
        arrayList.add(vwb.m200311Y("x5速度", new d30() { // from class: l.jmc
            @Override // p149l.d30
            public final void call() {
                new tpd0("swipe_trans_speed", 1).put(5);
            }
        }));
        arrayList.add(vwb.m200311Y("x10速度", new d30() { // from class: l.kmc
            @Override // p149l.d30
            public final void call() {
                new tpd0("swipe_trans_speed", 1).put(10);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: ga */
    public static /* synthetic */ void m58853ga() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149232O1;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: gb */
    public static /* synthetic */ void m58854gb(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        Merchandise merchandise = (Merchandise) vwb.m200346r(CoreModule.f17545c.f19654j0.m30580E4().m221515e(), new w9j() { // from class: l.w8c
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Merchandise merchandise2 = (Merchandise) obj;
                return Boolean.valueOf(TEnum.equals(merchandise2.category, ProductCategory.tttVip) && merchandise2.monthly() && merchandise2.autoRenewable());
            }
        });
        Coupon couponForPromotion = merchandise.getCouponForPromotion(MonetizationPromotionsId.trial7DVIP);
        if (couponForPromotion != null) {
            new cpk0.C16206a(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m108166d(merchandise).m108164b(couponForPromotion).m108165c(BuildConfig.BUILD_TYPE).m108167e();
        } else {
            lsi0.m151595y("商品或者优惠券为空");
        }
    }

    /* JADX INFO: renamed from: gd */
    public static /* synthetic */ void m58856gd(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("模拟卸载", new d30() { // from class: l.urc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59038ok(-1L);
            }
        }));
        arrayList.add(vwb.m200311Y("设置时间为半小时时间", new d30() { // from class: l.vrc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59038ok(mqi0.m155944o() - 1800000);
            }
        }));
        arrayList.add(vwb.m200311Y("设置时间为1小时时间", new d30() { // from class: l.wrc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59038ok(mqi0.m155944o() - 3600000);
            }
        }));
        arrayList.add(vwb.m200311Y("设置时间为当前时间", new d30() { // from class: l.xrc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59038ok(mqi0.m155944o());
            }
        }));
        arrayList.add(vwb.m200311Y("设置时间为一天前时间", new d30() { // from class: l.yrc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59038ok(mqi0.m155944o() - 86400000);
            }
        }));
        arrayList.add(vwb.m200311Y("设置时间为一周前时间", new d30() { // from class: l.zrc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59038ok(mqi0.m155944o() - 604800000);
            }
        }));
        arrayList.add(vwb.m200311Y("设置时间为一月前时间", new d30() { // from class: l.asc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59038ok(mqi0.m155944o() - 2592000000L);
            }
        }));
        arrayList.add(vwb.m200311Y("设置时间为覆盖安装", new d30() { // from class: l.bsc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59038ok(-1000L);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: ge */
    public static /* synthetic */ void m58857ge() {
        PushMessage pushMessage = new PushMessage();
        pushMessage.intent = "newMaleUserLike.send";
        CoreBusinessModule.f17535e.m171128n("", "", "", pushMessage, null);
    }

    /* JADX INFO: renamed from: gf */
    public static /* synthetic */ void m58858gf() {
        lra0.f129532s.put(Boolean.TRUE);
        lra0.f129533t.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: gj */
    public static void m58862gj(final ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("全屏称赞页", new d30() { // from class: l.ztc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59264z4(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
    }

    /* JADX INFO: renamed from: gk */
    public static void m58863gk(final ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("跳转新资料点赞页 ", new d30() { // from class: l.zwc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58661Xd(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m58864h() {
        hpd0 hpd0Var = lra0.f129526n0;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ void m58866h1() {
        tpd0 tpd0Var = CoreModule.f17545c.f19639e0.f149395i6;
        tpd0Var.put(Integer.valueOf((tpd0Var.get().intValue() + 1) % 3));
    }

    /* JADX INFO: renamed from: h3 */
    public static /* synthetic */ void m58868h3() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149353d4;
        if (NullChecker.m81303a(hpd0Var)) {
            hpd0Var.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: h5 */
    public static /* synthetic */ void m58870h5(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        q3h0.C19423b c19423b = new q3h0.C19423b();
        c19423b.m172864a(0);
        c19423b.m172865b(CoreModule.m29932K().getUserById(CoreModule.f17545c.f19663m0.m31137q6()));
        c19423b.m172866c(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
    }

    /* JADX INFO: renamed from: h7 */
    public static /* synthetic */ void m58872h7(final ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("添加促销", new d30() { // from class: l.mxc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().startActivity(new Intent(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), (Class<?>) PurchasePromotionAct.class));
            }
        }));
        arrayList.add(vwb.m200311Y("2024双11svip-6m优惠", new d30() { // from class: l.yxc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                oxa0.m166516i0(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), new e30() { // from class: l.y1d
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m58557Se((Boolean) obj);
                    }
                }, (Merchandise) vwb.m200346r(CoreModule.f17545c.f19654j0.m30579D5(ProductCategory.get("svip")), new w9j() { // from class: l.x1d
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(rxa0.m181491l((Merchandise) obj, MonetizationPromotionsId.giftDurationSVIP));
                    }
                }), viewTreeObserverOnGlobalLayoutListenerC7866b2.act().pageId());
            }
        }));
        arrayList.add(vwb.m200311Y("重构购买弹窗【汇总】", new d30() { // from class: l.kyc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59229xd(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("优惠卷 首页弹窗时间重置", new d30() { // from class: l.myc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59116sa();
            }
        }));
        arrayList.add(vwb.m200311Y("腾讯广告SDK【汇总】", new d30() { // from class: l.nyc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58496Pg(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("检查支付宝安装", new d30() { // from class: l.pyc
            @Override // p149l.d30
            public final void call() {
                sd60.m183460k();
            }
        }));
        arrayList.add(vwb.m200311Y("vip 右滑上线提示弹窗", new d30() { // from class: l.qyc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58979m5(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("购买项是否监管平铺切换", new d30() { // from class: l.ryc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58744bb();
            }
        }));
        arrayList.add(vwb.m200311Y("购买弹窗【汇总】", new d30() { // from class: l.syc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59248ya(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("全屏购买弹窗【汇总】", new d30() { // from class: l.tyc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59273zd(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("落地页【汇总】", new d30() { // from class: l.nxc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58462O3(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("打招呼配对页【汇总】", new d30() { // from class: l.oxc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59256yi(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("访客相关【汇总】", new d30() { // from class: l.pxc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58510Q9(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("高价会员【汇总】", new d30() { // from class: l.qxc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58352J(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("SVIP低价召回【汇总】", new d30() { // from class: l.rxc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58170Af(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("出现superlike引导一次", new d30() { // from class: l.txc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58411Lf();
            }
        }));
        arrayList.add(vwb.m200311Y("插入superlike卡片", new d30() { // from class: l.uxc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59207wd(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("插入undo卡片", new d30() { // from class: l.vxc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59159u9();
            }
        }));
        arrayList.add(vwb.m200311Y("插入打招呼2卡片", new d30() { // from class: l.wxc
            @Override // p149l.d30
            public final void call() {
                e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), new Runnable() { // from class: l.w1d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m58479P();
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.m200311Y("svip试用弹窗", new d30() { // from class: l.xxc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59057ph(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("See离线弹窗", new d30() { // from class: l.zxc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58970li(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("揭秘喜欢我的人", new d30() { // from class: l.ayc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58635W8(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(new j760("清除超级喜欢划卡引导时间戳", new d30() { // from class: l.byc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58967lf();
            }
        }));
        arrayList.add(new j760("清除fake用户引导引导时间戳", new d30() { // from class: l.cyc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58534Rc();
            }
        }));
        arrayList.add(new j760("已读标记重置", new d30() { // from class: l.eyc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58315H6();
            }
        }));
        arrayList.add(vwb.m200311Y("试用link", new d30() { // from class: l.fyc
            @Override // p149l.d30
            public final void call() {
                j2e0.m139446m(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), Uri.parse("tantan://monetization_promotion/svip/trail"));
            }
        }));
        arrayList.add(vwb.m200311Y("svip优惠券link", new d30() { // from class: l.gyc
            @Override // p149l.d30
            public final void call() {
                j2e0.m139446m(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), Uri.parse("tantan://svip/svip/buy?couponId=lowPriceCustomerSVIP@local_3M_under23age_h"));
            }
        }));
        arrayList.add(vwb.m200311Y("svip低价优惠link", new d30() { // from class: l.hyc
            @Override // p149l.d30
            public final void call() {
                j2e0.m139446m(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), Uri.parse("tantan://svip/svip/buy?couponId=lowPriceCustomerSVIP@local_1M_exceed23age_h"));
            }
        }));
        arrayList.add(vwb.m200311Y("vip低价优惠link", new d30() { // from class: l.iyc
            @Override // p149l.d30
            public final void call() {
                j2e0.m139446m(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), Uri.parse("tantan://vip/vip/buy?couponId=lowPriceCustomerVIP@local_1M"));
            }
        }));
        arrayList.add(vwb.m200311Y("vip首月link", new d30() { // from class: l.jyc
            @Override // p149l.d30
            public final void call() {
                j2e0.m139446m(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), Uri.parse("tantan://vip/vip/buy?couponId=lowPriceFirstMonthVIP1M@local"));
            }
        }));
        arrayList.add(vwb.m200311Y("合伙人定制页面", new d30() { // from class: l.lyc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().startActivity(SupremeCustomAct.INSTANCE.m43601a(viewTreeObserverOnGlobalLayoutListenerC7866b2.act()));
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: ha */
    public static /* synthetic */ void m58875ha(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        userM169527p9.description = "赞赞赞赞赞赞赞赞赞赞赞赞，收到咖啡店升降开关阿萨德开发的索拉卡风管机手打立卡高发季双打卡估计啊老大说";
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().startActivity(ExpandProfileLikeAct.m43249V1(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), userInfo, userM169527p9.f56011id, "card", HomeCardExpandedType.ABOUT_ME.getAlias(), 0));
    }

    /* JADX INFO: renamed from: hg */
    public static /* synthetic */ void m58881hg() {
        try {
            CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.y8c
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.m58475Og();
                }
            });
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        m59126sk();
    }

    /* JADX INFO: renamed from: hi */
    public static /* synthetic */ void m58883hi() {
        if (CoreModule.f17545c.f19680r2.f113521b0.get().intValue() != 0) {
            CoreModule.f17545c.f19680r2.f113521b0.put(0);
            return;
        }
        CoreModule.f17545c.f19680r2.f113521b0.put(8);
        CoreModule.f17545c.f19680r2.f113520a0.put(0L);
        CoreModule.f17545c.f19680r2.f113521b0.put(0);
    }

    /* JADX INFO: renamed from: hj */
    public static void m58884hj(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("称赞Mock数据 当前:".concat(f38259i.get().booleanValue() ? "开" : "关"), new d30() { // from class: l.jnc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58919jb();
            }
        }));
        arrayList.add(vwb.m200311Y("称赞Mock: 插入Mock数据", new d30() { // from class: l.knc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58802e3();
            }
        }));
        arrayList.add(vwb.m200311Y("称赞Mock: 删除Mock数据", new d30() { // from class: l.lnc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58683Ye();
            }
        }));
    }

    /* JADX INFO: renamed from: hk */
    public static void m58885hk(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        final boolean zBooleanValue = CoreModule.f17545c.f19639e0.f149228N4.get().booleanValue();
        arrayList.add(vwb.m200311Y("新编辑资料页UI " + zBooleanValue, new d30() { // from class: l.btc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19639e0.f149228N4.put(Boolean.valueOf(!zBooleanValue));
            }
        }));
    }

    /* JADX INFO: renamed from: i2 */
    public static /* synthetic */ void m58889i2() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149386h5;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        CoreModule.f17545c.f19580K1.f20004S.put(bool);
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ void m58890i3(final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, final String str) {
        Pattern patternCompile = Pattern.compile("[0-9]*");
        if (TextUtils.isEmpty(str) || !patternCompile.matcher(str).matches() || TextUtils.isEmpty(str)) {
            return;
        }
        e51.m114742G(new Runnable() { // from class: l.a2d
            @Override // java.lang.Runnable
            public final void run() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                String str2 = str;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().duringCreated(CoreModule.f17545c.f19642f0.m32820Ue(str2)).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.z8c
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m58736b3(viewTreeObserverOnGlobalLayoutListenerC7866b2, str2, (Conversation) obj);
                    }
                }, new e30() { // from class: l.b9c
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        C8360d.m45892a(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), new C8360d.a(str2, "from_h5_suggest_user"));
                    }
                }));
            }
        });
    }

    /* JADX INFO: renamed from: i6 */
    public static /* synthetic */ void m58893i6() {
        List<T> listM165617j = CoreModule.f17553k.f91940c.m206053K().m165617j();
        final GreetingSummary greetingSummaryNew_ = GreetingSummary.new_();
        greetingSummaryNew_.latestMessageId = ((Message) listM165617j.get(0)).f56011id;
        if (listM165617j.size() > 0) {
            e51.m114742G(new Runnable() { // from class: l.d6d
                @Override // java.lang.Runnable
                public final void run() {
                    DebugUtil.m59278zi(greetingSummaryNew_);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i8 */
    public static /* synthetic */ void m58895i8(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PurchaseType.TYPE_GET_VIP);
        arrayList.add(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        new j6b0.C17693a(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), arrayList, null, null).m139941a(0).m139942b(new d30() { // from class: l.fad
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58250E7();
            }
        }).m139943c(new e30() { // from class: l.gad
            @Override // p149l.e30
            public final void call(Object obj) {
                DebugUtil.m58821f0((PurchaseType) obj);
            }
        }).m139946f(new e30() { // from class: l.had
            @Override // p149l.e30
            public final void call(Object obj) {
                DebugUtil.m59093r9((PurchaseType) obj);
            }
        }).m139944d(new e30() { // from class: l.iad
            @Override // p149l.e30
            public final void call(Object obj) {
                DebugUtil.m59030oc((PurchaseType) obj);
            }
        }).m139945e(new g30() { // from class: l.jad
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                DebugUtil.m58723ac((PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).m139947g();
    }

    /* JADX INFO: renamed from: i9 */
    public static /* synthetic */ void m58896i9() {
        hpd0 hpd0Var = lra0.f129520k0;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        hpd0 hpd0Var2 = lra0.f129516i0;
        Boolean bool = Boolean.FALSE;
        hpd0Var2.put(bool);
        lra0.f129514h0.put(bool);
        lra0.f129518j0.put(bool);
    }

    /* JADX INFO: renamed from: ic */
    public static /* synthetic */ void m58899ic() {
        tpd0 tpd0Var = new tpd0("full_card_5_btn_tran_x", 0);
        tpd0 tpd0Var2 = new tpd0("full_card_5_btn_tran_y", 0);
        tpd0 tpd0Var3 = new tpd0("full_card_btn_5_tran_count", 0);
        Boolean bool = Boolean.FALSE;
        hpd0 hpd0Var = new hpd0("full_card_clicked", bool);
        tpd0Var2.put(0);
        tpd0Var3.put(0);
        hpd0Var.put(bool);
        tpd0Var.put(-500);
    }

    /* JADX INFO: renamed from: id */
    public static /* synthetic */ void m58900id() {
        hpd0 hpd0Var = lra0.f129475C;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        if (lra0.f129475C.get().booleanValue()) {
            lra0.f129474B.put(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: ie */
    public static /* synthetic */ void m58901ie() {
        CoreModule.f17545c.f19571H1.f184111e0.clear();
        CoreModule.f17545c.f19571H1.f184112f0.clear();
    }

    /* JADX INFO: renamed from: ih */
    public static /* synthetic */ void m58903ih() {
        hpd0 hpd0Var = lra0.f129486N;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: ij */
    public static String m58905ij() {
        ProfileLike profileLike;
        Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
        return (counterM31484o3 == null || (profileLike = counterM31484o3.profileLike) == null) ? "—" : String.valueOf(profileLike.remaining);
    }

    /* JADX INFO: renamed from: ik */
    public static void m58906ik(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("老用户迎新", new C9091i1(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m58907j(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("清除所有曝光次数", new d30() { // from class: l.e6d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58310H1();
            }
        }));
        arrayList.add(vwb.m200311Y("清除婚恋曝光次数", new d30() { // from class: l.f6d
            @Override // p149l.d30
            public final void call() {
                xjc0.m209686a(xjc0.f193198a);
            }
        }));
        arrayList.add(vwb.m200311Y("清除我的tab认证曝光次数", new d30() { // from class: l.h6d
            @Override // p149l.d30
            public final void call() {
                xjc0.m209686a(xjc0.f193199b);
            }
        }));
        arrayList.add(vwb.m200311Y("清除我的侧边栏入口曝光次数", new d30() { // from class: l.i6d
            @Override // p149l.d30
            public final void call() {
                xjc0.m209686a(xjc0.f193200c);
            }
        }));
        arrayList.add(vwb.m200311Y("清除我的侧边栏我的客服曝光次数", new d30() { // from class: l.j6d
            @Override // p149l.d30
            public final void call() {
                xjc0.m209686a(xjc0.f193201d);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m58908j0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("mock 插入推荐配对", new d30() { // from class: l.bxc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59069q7();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: j1 */
    public static /* synthetic */ void m58909j1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.f149354d5)) {
            arrayList.add(vwb.m200311Y("切换ab，当前".concat(CoreModule.f17545c.f19639e0.f149354d5.get().booleanValue() ? "true" : "false"), new C9088h2()));
            viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
        }
    }

    /* JADX INFO: renamed from: j8 */
    public static /* synthetic */ void m58916j8() {
        hpd0 hpd0Var = CoreModule.f17545c.f19642f0.f19935f1;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: jb */
    public static /* synthetic */ void m58919jb() {
        hpd0 hpd0Var = f38259i;
        boolean zBooleanValue = hpd0Var.get().booleanValue();
        hpd0Var.put(Boolean.valueOf(!zBooleanValue));
        if (zBooleanValue) {
            m58262Ej();
            lsi0.m151595y("称赞Mock数据已删除");
        } else {
            m58520Qj();
            lsi0.m151595y("称赞Mock数据已插入");
        }
    }

    /* JADX INFO: renamed from: jc */
    public static /* synthetic */ void m58920jc() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149226N2;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: jd */
    public static /* synthetic */ void m58921jd() {
        ew40.m118397h().m118406f();
        lsi0.m151595y("已修改");
    }

    /* JADX INFO: renamed from: jj */
    public static void m58927jj(ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("资料完整度", new d30() { // from class: l.ewc
            @Override // p149l.d30
            public final void call() {
                i0e.m133795d(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m133814D(10).m133825r("资料完成百分之多少").m133816F(new e30() { // from class: l.mzc
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        wn90.m204602F().m204665o0((String) obj);
                    }
                }).m133821n().show();
            }
        }));
    }

    /* JADX INFO: renamed from: jk */
    public static void m58928jk(final ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("新用户破冰新手引导", new d30() { // from class: l.mtc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59260z0(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
    }

    /* JADX INFO: renamed from: k2 */
    public static /* synthetic */ void m58932k2(Throwable th) {
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ void m58934k4() {
    }

    /* JADX INFO: renamed from: ka */
    public static /* synthetic */ void m58940ka() {
        hpd0 hpd0Var = CoreModule.f17545c.f19642f0.f19959n1;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: kb */
    public static /* synthetic */ void m58941kb(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, List list) {
        if (vwb.m200296J(list)) {
            o8m.m163183a().f142656i = true;
            return;
        }
        DialogC8068a dialogC8068a = new DialogC8068a(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
        dialogC8068a.m39260N(list);
        if (C4371a.m21100p().m21108I()) {
            C4371a.m21100p().m21103C(CorePopLevel.ICE_BREAK_OFFLINE, viewTreeObserverOnGlobalLayoutListenerC7866b.act(), dialogC8068a, ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
        } else {
            wc80.m202636e().m202649q(uc80.m192995a(dialogC8068a));
        }
    }

    /* JADX INFO: renamed from: kc */
    public static /* synthetic */ void m58942kc() {
        hpd0 hpd0Var = lra0.f129507e;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: ke */
    public static /* synthetic */ void m58944ke(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.f149154C6)) {
            arrayList.add(vwb.m200311Y("强制展示邀请认证样式的认证入口，当前：".concat(CoreModule.f17545c.f19639e0.f149154C6.get().booleanValue() ? "true" : "false"), new d30() { // from class: l.aad
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.m59048p8();
                }
            }));
        }
        arrayList.add(vwb.m200311Y("清除认证中心入口点击频控", new C9097k()));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: kg */
    public static /* synthetic */ void m58946kg(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        View viewMo38809d = viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2().mo38809d();
        if (viewMo38809d instanceof NewNewProfileCard) {
            NewNewProfileCard newNewProfileCard = (NewNewProfileCard) viewMo38809d;
            if (newNewProfileCard.mo36922q0()) {
                return;
            }
            newNewProfileCard.m36838N3("newUser");
        }
    }

    /* JADX INFO: renamed from: ki */
    public static /* synthetic */ void m58948ki(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        PurchaseType purchaseType = PurchaseType.TYPE_YOUTH_VIP;
        new C8778c.a(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), purchaseType, BuildConfig.BUILD_TYPE).m54094g(fy80.m123720p(purchaseType, purchaseType.getPrivilegeData(null), Privilege.youth_blind_box)).m54092e(new g30() { // from class: l.wad
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                lsi0.m151595y("购买成功，立刻体验专属权益吧");
            }
        }).m54095h();
    }

    /* JADX INFO: renamed from: kj */
    public static void m58949kj(ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        if (upa.m194682P1()) {
            arrayList.add(vwb.m200311Y("动态打招呼：首张用户卡片展示打招呼入口", new d30() { // from class: l.rtc
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.m58607V1(viewTreeObserverOnGlobalLayoutListenerC7866b);
                }
            }));
            arrayList.add(vwb.m200311Y("动态打招呼：首张用户卡片展示打招呼内容", new d30() { // from class: l.stc
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.m58850g7(viewTreeObserverOnGlobalLayoutListenerC7866b);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: kk */
    public static void m58950kk(final ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("新用户快速指引", new d30() { // from class: l.ttc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59023o5(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m58951l() {
        CoreModule.f17545c.f19663m0.f19324B1.put("");
        CoreModule.f17545c.f19639e0.f149369f4.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m58952l0(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        OnlineMatchPushUser onlineMatchPushUser = new OnlineMatchPushUser();
        onlineMatchPushUser.name = "重生的小胖子";
        onlineMatchPushUser.userId = "349281368";
        CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileMiddle().formatted();
        onlineMatchPushUser.avatarUrl = "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2MlRQNldBSVFaM1ZRRFRPU01FSFdIS043Nk5RUTA0IiwidyI6MTk2MCwiaCI6MTk1OSwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjYxNzE0NDg5Nzk1MzUzMzg2ODAsImFiIjowfQ.jpg?format=128x128";
        onlineMatchPushUser.action = "";
        onlineMatchPushUser.gender = "female";
        onlineMatchPushUser.age = Constants.VIA_REPORT_TYPE_SHARE_TO_QQ;
        onlineMatchPushUser.distance = 100;
        onlineMatchPushUser.userTagList = vwb.m200304R(new String[]{"唱各萨达多个", "喜欢广场舞", "喜欢哈哈哈"}, new w9j() { // from class: l.g9c
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return DebugUtil.m58442N4((String) obj);
            }
        });
        QuickChatCardWrapper quickChatCardWrapper = new QuickChatCardWrapper(onlineMatchPushUser);
        C4732c c4732c = CoreModule.f17545c;
        onlineMatchPushUser.user = c4732c.f19639e0.m169430Pa(c4732c.f19663m0.f19394a0.m221515e().loaded.get(1).f19472id);
        xzc0.m211974x0().m211975B0(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), quickChatCardWrapper);
    }

    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ void m58953l1(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        String str = tbk.f169267a.format(new Date());
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().getString(R$string.f19110z1, str.substring(0, 4), str.substring(5, 7), str.substring(8, 10));
    }

    /* JADX INFO: renamed from: l2 */
    public static /* synthetic */ void m58954l2(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("探探认证引导Dlg 点击产生", new d30() { // from class: l.hlc
            @Override // p149l.d30
            public final void call() {
                zbi0.m217861J(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), false, CoreModule.f17545c.f19639e0.m169527p9());
            }
        }));
        arrayList.add(vwb.m200311Y("探探认证能量提示Dlg 划卡产生", new d30() { // from class: l.nlc
            @Override // p149l.d30
            public final void call() {
                zbi0.m217864M(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            }
        }));
        arrayList.add(vwb.m200311Y("升级实名认证弹窗", new d30() { // from class: l.olc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                zbi0.m217863L(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), new d30() { // from class: l.d3d
                    @Override // p149l.d30
                    public final void call() {
                        ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b3 = viewTreeObserverOnGlobalLayoutListenerC7866b2;
                        viewTreeObserverOnGlobalLayoutListenerC7866b3.act().startActivity(IntroductionAct.m56069X1(viewTreeObserverOnGlobalLayoutListenerC7866b3.act(), "", true));
                    }
                });
            }
        }));
        arrayList.add(vwb.m200311Y("探探认证设置页开关提示", new d30() { // from class: l.plc
            @Override // p149l.d30
            public final void call() {
                zbi0.m217865N(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            }
        }));
        arrayList.add(vwb.m200311Y("探探认证取消挽留", new d30() { // from class: l.qlc
            @Override // p149l.d30
            public final void call() {
                zbi0.m217860I(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            }
        }));
        arrayList.add(vwb.m200311Y("探探认证结果（失败）", new d30() { // from class: l.rlc
            @Override // p149l.d30
            public final void call() {
                zbi0.m217867P(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), StudentVerificationStatus.get("rejected"), StudentVerificationStatus.get("rejected"));
            }
        }));
        arrayList.add(vwb.m200311Y("探探认证结果（认证中）", new d30() { // from class: l.slc
            @Override // p149l.d30
            public final void call() {
                zbi0.m217867P(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), StudentVerificationStatus.get("pending"), StudentVerificationStatus.get("rejected"));
            }
        }));
        arrayList.add(vwb.m200311Y("探探认证结果（成功）", new d30() { // from class: l.ulc
            @Override // p149l.d30
            public final void call() {
                zbi0.m217867P(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), StudentVerificationStatus.get("verified"), StudentVerificationStatus.get("verified"));
            }
        }));
        arrayList.add(vwb.m200311Y("探探认证结果（成功未激活）", new d30() { // from class: l.vlc
            @Override // p149l.d30
            public final void call() {
                zbi0.m217867P(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), StudentVerificationStatus.get("verified"), StudentVerificationStatus.get("rejected"));
            }
        }));
        arrayList.add(vwb.m200311Y("探探认证显示我的tab红点", new d30() { // from class: l.wlc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19585M0.m129482f3(true);
            }
        }));
        arrayList.add(vwb.m200311Y("探探认证设置页显示气泡", new d30() { // from class: l.jlc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58838fh();
            }
        }));
        arrayList.add(vwb.m200311Y("探探认证右上角图标（我的信息）", new d30() { // from class: l.klc
            @Override // p149l.d30
            public final void call() {
                zbi0.m217866O(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), true);
            }
        }));
        arrayList.add(vwb.m200311Y("探探认证右上角图标（别人的信息）", new d30() { // from class: l.llc
            @Override // p149l.d30
            public final void call() {
                zbi0.m217866O(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), false);
            }
        }));
        arrayList.add(vwb.m200311Y("探探认证清空数据", new d30() { // from class: l.mlc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58301Ge();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ void m58955l3() {
        snm.f165470j = true;
        snm.f165467g = true;
        snm.f165468h = false;
    }

    /* JADX INFO: renamed from: l5 */
    public static /* synthetic */ void m58957l5() {
        hpd0 hpd0Var = lra0.f129488P;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: l9 */
    public static /* synthetic */ void m58961l9(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("弹窗1", new d30() { // from class: l.xyc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58671Y2(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("弹窗2", new d30() { // from class: l.yyc
            @Override // p149l.d30
            public final void call() {
                new zd2(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).show();
            }
        }));
        arrayList.add(vwb.m200311Y("插入卡片", new d30() { // from class: l.bzc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59212wi();
            }
        }));
        arrayList.add(vwb.m200311Y("清空", new d30() { // from class: l.czc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58732b();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: lc */
    public static /* synthetic */ void m58964lc() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149233O2;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: ld */
    public static /* synthetic */ void m58965ld(String str) {
        w29 w29Var = CoreModule.f17545c.f19571H1;
        w29Var.f184105Y = true;
        w29Var.f184106Z = str;
    }

    /* JADX INFO: renamed from: le */
    public static /* synthetic */ void m58966le() {
        OnlineMatchMatchUser onlineMatchMatchUser = new OnlineMatchMatchUser();
        onlineMatchMatchUser.userId = CoreModule.m29931H().userId();
        onlineMatchMatchUser.user = CoreModule.m29932K().me_();
        C8609a.m50268m0(onlineMatchMatchUser);
    }

    /* JADX INFO: renamed from: lf */
    public static /* synthetic */ void m58967lf() {
        myc0.m157001d0().m157003c0();
        lsi0.m151595y("已清除");
    }

    /* JADX INFO: renamed from: lh */
    public static /* synthetic */ User m58969lh(User user) {
        User userMo223809clone = user.mo223809clone();
        userMo223809clone.profile.extensions.interest.tags.clear();
        return userMo223809clone.subtract(user);
    }

    /* JADX INFO: renamed from: li */
    public static /* synthetic */ void m58970li(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        CoreLikers.C4719a c4719a = new CoreLikers.C4719a();
        c4719a.f19272d = new ArrayList();
        List<CoreSuggested.UserInfo> list = CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded;
        for (int i = 0; i < 3; i++) {
            c4719a.f19272d.add(CoreModule.f17545c.f19639e0.m169430Pa(list.get(i).f19472id));
        }
        ok3.m164811J(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), 3, c4719a);
    }

    /* JADX INFO: renamed from: lj */
    public static void m58971lj(ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("Facebook 绑定手机号", new d30() { // from class: l.qtc
            @Override // p149l.d30
            public final void call() {
                new ccn(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m106131Z();
            }
        }));
    }

    /* JADX INFO: renamed from: lk */
    public static void m58972lk(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("好友上线提醒代发端内承接改版", new C9067c1(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m58973m(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, Notification notification) {
        if (notification.m221299j()) {
            lsi0.m151583m("something wrong!");
            return;
        }
        if (viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2().mo38818o().m141745d().localRelationship == null) {
            Relationship relationship = new Relationship();
            relationship.f38806id = viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2().mo38813j().f19472id;
            relationship.state = RelationshipStatus.get("liked");
            relationship.status = vwb.m200324f0(MatchFrom.get(MatchFrom.superLiked));
            viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2().mo38818o().m141745d().localRelationship = relationship;
        } else {
            viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2().mo38818o().m141745d().localRelationship.status = vwb.m200324f0(MatchFrom.get(MatchFrom.superLiked));
        }
        C7943c c7943c = viewTreeObserverOnGlobalLayoutListenerC7866b.f21888M;
        if (c7943c != null) {
            c7943c.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m58974m0() {
        hpd0 hpd0Var = lra0.f129484L;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: m1 */
    public static /* synthetic */ void m58975m1(Throwable th) {
    }

    /* JADX INFO: renamed from: m5 */
    public static /* synthetic */ void m58979m5(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        hpk0 hpk0Var = new hpk0(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
        hpk0Var.m132362I(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
        hpk0Var.m120965s(new d30() { // from class: l.w6d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59182va();
            }
        });
        hdb0.m130575c().m130582i(hpk0Var);
    }

    /* JADX INFO: renamed from: m6 */
    public static /* synthetic */ void m58980m6() {
        hpd0 hpd0Var = lra0.f129487O;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        CoreModule.f17545c.f19639e0.f149294W0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: m7 */
    public static /* synthetic */ void m58981m7(String str) {
        try {
            CoreModule.f17545c.f19642f0.f19989x1.put(Boolean.valueOf(Boolean.parseBoolean(str)));
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: m8 */
    public static /* synthetic */ void m58982m8(String str, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        Relationship relationship = new Relationship();
        relationship.state = RelationshipStatus.get("liked");
        relationship.status = vwb.m200324f0(MatchFrom.get(MatchFrom.superLiked));
        C4759y.m34901i3(str, relationship).materialize().subscribe(mkd0.m154955G(new e30() { // from class: l.ywc
            @Override // p149l.e30
            public final void call(Object obj) {
                DebugUtil.m58973m(viewTreeObserverOnGlobalLayoutListenerC7866b, (Notification) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m9 */
    public static /* synthetic */ void m58983m9(Act act) {
        CoreModule.f17545c.f19663m0.f19346I2.m132487l(j760.m140076a(SwipeDirection.LEFT, null));
        m58414Li(act);
    }

    /* JADX INFO: renamed from: ma */
    public static /* synthetic */ void m58984ma(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("打开认证", new d30() { // from class: l.d8d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59203w9(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("打开认证中", new d30() { // from class: l.e8d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59142te(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: mb */
    public static /* synthetic */ C22306c m58985mb(User user) {
        return !NullChecker.m81303a(user) ? C22306c.just(roj0.f160388a) : CoreModule.f17545c.f19639e0.m169547u9(user);
    }

    /* JADX INFO: renamed from: mc */
    public static /* synthetic */ void m58986mc(PurchaseType purchaseType, Act act, String str) {
    }

    /* JADX INFO: renamed from: mi */
    public static /* synthetic */ void m58992mi(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        User userMo223809clone = CoreModule.f17545c.f19639e0.m169527p9().mo223809clone();
        ProfileCompletion profileCompletion = userMo223809clone.profile.extensions.profileCompletion;
        List list = Collections.EMPTY_LIST;
        profileCompletion.progress = vwb.m200317c(list, "finished");
        userMo223809clone.profile.extensions.profileCompletion.briefIntroduction = vwb.m200317c(list, "我是一个up主");
        User userSubtract = userMo223809clone.subtract(CoreModule.f17545c.f19639e0.m169527p9());
        if (NullChecker.m81303a(userSubtract)) {
            viewTreeObserverOnGlobalLayoutListenerC7866b.act().duringCreated(CoreModule.f17545c.f19639e0.m169547u9(userSubtract)).subscribe(mkd0.m154956H(new e30() { // from class: l.mmc
                @Override // p149l.e30
                public final void call(Object obj) {
                    lsi0.m151595y(CoreModule.f17545c.f19639e0.m169527p9().profile.extensions.profileCompletion.toJson());
                }
            }, new e30() { // from class: l.nmc
                @Override // p149l.e30
                public final void call(Object obj) {
                    lsi0.m151595y(((Throwable) obj).getMessage());
                }
            }));
        }
    }

    /* JADX INFO: renamed from: mj */
    public static void m58993mj(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("字体粗细", new C9105m(viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: mk */
    public static void m58994mk(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("认证引导", new C9127s1(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m58995n() {
        hpd0 hpd0Var = lra0.f129538y;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        lra0.f129537x.put(bool);
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m58996n0(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        pmp0 pmp0Var = new pmp0(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
        pmp0Var.m170361M(CoreModule.f17545c.f19639e0.f149204K1.m221515e().get());
        pmp0Var.show();
    }

    /* JADX INFO: renamed from: n4 */
    public static /* synthetic */ void m59000n4() {
        CoreModule.f17545c.f19647g2.m122572e3();
        lsi0.m151595y("已重置");
    }

    /* JADX INFO: renamed from: n7 */
    public static /* synthetic */ void m59003n7() {
        CoreModule.f17545c.f19701y2.m155359v3();
        lsi0.m151595y("已重置");
    }

    /* JADX INFO: renamed from: n8 */
    public static /* synthetic */ void m59004n8(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, String str) {
        if (TextUtils.isEmpty(str)) {
            osi0.m165778b("请先输入跳转地址");
            return;
        }
        f38251a.put(str);
        Intent intentM80164Z1 = WebViewAct.m80164Z1(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "美团h5", str);
        intentM80164Z1.putExtra("AD_WebView", true);
        intentM80164Z1.putExtra("is_mt_pay", true);
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().startActivity(intentM80164Z1);
    }

    /* JADX INFO: renamed from: na */
    public static /* synthetic */ void m59006na(String str, int i, roj0 roj0Var) {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f19472id = str;
        CoreModule.f17545c.f19663m0.m31154w6(userInfo, i);
    }

    /* JADX INFO: renamed from: nc */
    public static /* synthetic */ void m59008nc() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.AdCard;
        userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        List<OMSAdCardInfo> listM135335h = ic50.m135327j().m135335h();
        if (vwb.m200296J(listM135335h)) {
            return;
        }
        userInfo.extensionObject = listM135335h.get(0);
        CoreModule.f17545c.f19663m0.m31154w6(userInfo, 0);
        CoreModule.f17545c.f19663m0.f19372S1.put(userInfo, 0);
    }

    /* JADX INFO: renamed from: ne */
    public static /* synthetic */ void m59010ne() {
        hpd0 hpd0Var = lra0.f129482J;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: nf */
    public static /* synthetic */ void m59011nf() {
        C8140a.f25299f.put(Boolean.FALSE);
        CoreModule.f17545c.f19639e0.f149247Q1.put(-1L);
    }

    /* JADX INFO: renamed from: nh */
    public static /* synthetic */ void m59013nh() {
        String str = "insert_see_myself_" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        new hpd0(str, bool).put(bool);
        CoreModule.f17545c.f19639e0.f149238P0.put(0L);
    }

    /* JADX INFO: renamed from: ni */
    public static /* synthetic */ void m59014ni() {
        hpd0 hpd0Var = h7j.f106286d;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: nj */
    public static void m59015nj(final String str, Act act, final int i) {
        act.duringCreated(CoreModule.f17545c.f19639e0.m169454W9(str)).subscribe(mkd0.m154956H(new e30() { // from class: l.gbd
            @Override // p149l.e30
            public final void call(Object obj) {
                DebugUtil.m59006na(str, i, (roj0) obj);
            }
        }, new e30() { // from class: l.hbd
            @Override // p149l.e30
            public final void call(Object obj) {
                DebugUtil.m58975m1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: nk */
    public static void m59016nk(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("资料页体验优化", new C9121q1(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m59017o() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.AdCard;
        userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        List<OMSAdCardInfo> listM135335h = ic50.m135327j().m135335h();
        if (vwb.m200296J(listM135335h) || listM135335h.size() <= 1) {
            return;
        }
        userInfo.extensionObject = listM135335h.get(1);
        CoreModule.f17545c.f19663m0.m31154w6(userInfo, 0);
        CoreModule.f17545c.f19663m0.f19372S1.put(userInfo, 0);
    }

    /* JADX INFO: renamed from: o1 */
    public static /* synthetic */ void m59019o1(List list) {
        if (vwb.m200296J(list)) {
            return;
        }
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.extensionObject = list;
        userInfo.virtualCardType = VirtualCardType.IceBreakQuestionOfflineCard;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f17545c.f19663m0.m31154w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: o2 */
    public static /* synthetic */ void m59020o2(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("低价试用大页面", new d30() { // from class: l.h7d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58854gb(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("低价试用弹窗", new d30() { // from class: l.i7d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58281Fg(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: o3 */
    public static /* synthetic */ void m59021o3() {
        hpd0 hpd0Var = lra0.f129491S;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: o5 */
    public static /* synthetic */ void m59023o5(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("快速指引", new d30() { // from class: l.e4d
            @Override // p149l.d30
            public final void call() {
                ke7.m145732o().m145738B(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            }
        }));
        arrayList.add(vwb.m200311Y("闪聊匹配快速指引", new d30() { // from class: l.f4d
            @Override // p149l.d30
            public final void call() {
                OnlineMatchManager.m50143z().m50193x(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "planA");
            }
        }));
        arrayList.add(vwb.m200311Y("附近动态快速指引", new d30() { // from class: l.g4d
            @Override // p149l.d30
            public final void call() {
                CoreModule.m29934N().mo60263Bh(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), CoreModule.f17545c.f19639e0.m169527p9().isFemale());
            }
        }));
        arrayList.add(vwb.m200311Y("手势动画指引", new d30() { // from class: l.h4d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58946kg(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: o9 */
    public static /* synthetic */ void m59027o9(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().startActivity(new Intent(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), (Class<?>) OldInfoTransNewAct.class));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: oc */
    public static /* synthetic */ void m59030oc(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: oe */
    public static /* synthetic */ void m59032oe() {
        CoreModule.f17545c.f19641e2.f86629R.clear();
        CoreModule.f17545c.f19641e2.f86630S.clear();
        CoreModule.f17545c.f19641e2.f86639b0.put(0);
    }

    /* JADX INFO: renamed from: oj */
    public static void m59037oj(final String str, Act act, final boolean z, final int i) {
        act.duringCreated(CoreModule.f17545c.f19639e0.m169454W9(str)).subscribe(mkd0.m154956H(new e30() { // from class: l.lbd
            @Override // p149l.e30
            public final void call(Object obj) {
                DebugUtil.m59065q3(str, z, i, (roj0) obj);
            }
        }, new e30() { // from class: l.mbd
            @Override // p149l.e30
            public final void call(Object obj) {
                DebugUtil.m58755c0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: ok */
    public static void m59038ok(long j) {
        zpd0 zpd0Var = new zpd0("use_first_login_local_time_" + qib0.f154714c0.userId(), -1L);
        qib0.f154741x0 = j;
        zpd0Var.put(Long.valueOf(j));
        qib0.m174805Z0(true, false).materialize().first().subscribe(mkd0.m154956H(new e30() { // from class: l.j9d
            @Override // p149l.e30
            public final void call(Object obj) {
                DebugUtil.m58547S4((Notification) obj);
            }
        }, new e30() { // from class: l.k9d
            @Override // p149l.e30
            public final void call(Object obj) {
                DebugUtil.m58437N((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m59040p0() {
        hpd0 hpd0Var = lra0.f129524m0;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: p1 */
    public static /* synthetic */ void m59041p1() {
        if (C4758x.f20136R.get().longValue() == 1) {
            C4758x.f20136R.put(10L);
        } else {
            C4758x.f20136R.put(1L);
        }
    }

    /* JADX INFO: renamed from: p2 */
    public static /* synthetic */ void m59042p2() {
        hpd0 hpd0Var = lra0.f129537x;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        lra0.f129538y.put(Boolean.valueOf(!lra0.f129537x.get().booleanValue()));
    }

    /* JADX INFO: renamed from: p3 */
    public static /* synthetic */ void m59043p3() {
    }

    /* JADX INFO: renamed from: p5 */
    public static /* synthetic */ void m59045p5(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        PurchaseType purchaseType = PurchaseType.TYPE_PICKS_MEMBERSHIP;
        new C8778c.a(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), purchaseType, null).m54094g(fy80.m123714j(purchaseType.getPrivilegeData(null), Privilege.picksMembership)).m54095h();
    }

    /* JADX INFO: renamed from: p6 */
    public static /* synthetic */ void m59046p6() {
        hpd0 hpd0Var = CoreModule.f17545c.f19663m0.f19460w0;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        CoreModule.f17545c.f19639e0.f149294W0.put(bool);
    }

    /* JADX INFO: renamed from: p8 */
    public static /* synthetic */ void m59048p8() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149154C6;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: p9 */
    public static /* synthetic */ void m59049p9() {
        List<T> listM165617j = CoreModule.f17553k.f91940c.m206053K().m165617j();
        final GreetingSummary greetingSummaryNew_ = GreetingSummary.new_();
        greetingSummaryNew_.latestMessageId = ((Message) listM165617j.get(0)).f56011id;
        if (listM165617j.size() > 0) {
            e51.m114742G(new Runnable() { // from class: l.s6d
                @Override // java.lang.Runnable
                public final void run() {
                    DebugUtil.m59201w7(greetingSummaryNew_);
                }
            });
        }
    }

    /* JADX INFO: renamed from: pa */
    public static /* synthetic */ void m59050pa() {
        hpd0 hpd0Var = lra0.f129522l0;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        hpd0 hpd0Var2 = lra0.f129514h0;
        Boolean bool = Boolean.FALSE;
        hpd0Var2.put(bool);
        lra0.f129516i0.put(bool);
        lra0.f129518j0.put(bool);
        lra0.f129520k0.put(bool);
    }

    /* JADX INFO: renamed from: pb */
    public static /* synthetic */ void m59051pb() {
        Message messageNew_ = Message.new_();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("gameId", BLiveButtonType.dice);
            jSONObject.put("receiverTitle", "摇骰子游戏邀请");
            jSONObject.put("receiverSubtitle", "对方邀请你玩“掷骰子”游戏");
            jSONObject.put("buttonText", "加入游戏");
            messageNew_.msgData = jSONObject.toString(1);
            messageNew_.messageType = MessageType.get(MessageType.wanwan_invite);
            CoreModule.f17545c.f19642f0.f19963o2.clear();
            CoreModule.f17545c.f19642f0.f19963o2.add(messageNew_);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            aag0.m95543a(e);
        }
    }

    /* JADX INFO: renamed from: pd */
    public static /* synthetic */ void m59053pd() {
    }

    /* JADX INFO: renamed from: ph */
    public static /* synthetic */ void m59057ph(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        List<Merchandise> listM221515e = CoreModule.f17545c.f19654j0.m30580E4().m221515e();
        m6h0.m153231r(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), !vwb.m200296J(listM221515e) ? listM221515e.get(0) : null);
    }

    /* JADX INFO: renamed from: pj */
    public static void m59059pj(final String str, Act act) {
        act.duringCreated(CoreModule.f17545c.f19639e0.m169543t9(str)).subscribe(mkd0.m154956H(new e30() { // from class: l.sbd
            @Override // p149l.e30
            public final void call(Object obj) {
                DebugUtil.m58453Nf(str, (roj0) obj);
            }
        }, new e30() { // from class: l.tbd
            @Override // p149l.e30
            public final void call(Object obj) {
                DebugUtil.m59237y((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: pk */
    public static void m59060pk(ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("用户查询", new d30() { // from class: l.ktc
            @Override // p149l.d30
            public final void call() {
                i0e.m133795d(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m133825r("属于UserId").m133816F(new e30() { // from class: l.c8d
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        CoreModule.f17545c.f19639e0.m169410Ka((String) obj).subscribe(mkd0.m154955G(new DebugUtil.C9100k2()));
                    }
                }).m133821n().show();
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m59062q0() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149182G6;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: q1 */
    public static /* synthetic */ void m59063q1() {
        CoreModule.f17545c.f19663m0.f19380V0.put(Boolean.TRUE);
        CoreModule.f17545c.f19663m0.f19383W0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: q3 */
    public static /* synthetic */ void m59065q3(String str, boolean z, int i, roj0 roj0Var) {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f19472id = str;
        userInfo.setUserLikeMe(z);
        CoreModule.f17545c.f19663m0.m31154w6(userInfo, i);
    }

    /* JADX INFO: renamed from: q4 */
    public static /* synthetic */ void m59066q4() {
        hpd0 hpd0Var = CoreModule.f17545c.f19663m0.f19336F1;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: q6 */
    public static /* synthetic */ void m59068q6() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149435n6;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: q7 */
    public static /* synthetic */ void m59069q7() {
    }

    /* JADX INFO: renamed from: qc */
    public static /* synthetic */ void m59074qc() {
    }

    /* JADX INFO: renamed from: qd */
    public static /* synthetic */ void m59075qd(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        b4h0 b4h0Var = new b4h0(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
        b4h0Var.show();
        g4h0.m124371c(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), b4h0Var);
    }

    /* JADX INFO: renamed from: qe */
    public static /* synthetic */ void m59076qe(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        View viewInflate = LayoutInflater.from(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).inflate(f6c0.f95873l4, (ViewGroup) null);
        qib0.f154691G.m102336O((VDraweeView) viewInflate.findViewById(u4c0.f174496u5), CoreModule.f17545c.f19639e0.m169527p9().picture(0).url, 4, 100);
        ((VText) viewInflate.findViewById(u4c0.f173985Pd)).setText("测试");
        SimplePushBubble simplePushBubbleM21169s = new SimplePushBubble.C4372a(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), viewInflate).m21171u("" + System.currentTimeMillis()).m21173w(30000).m21164B(2).m21169s();
        ((VButton) viewInflate.findViewById(u4c0.f173785E0)).setText("去聊聊");
        simplePushBubbleM21169s.m96808x(CorePopLevel.IMMERSION_SEND_MSG);
        hdb0.m130575c().m130582i(simplePushBubbleM21169s);
    }

    /* JADX INFO: renamed from: qf */
    public static /* synthetic */ void m59077qf(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        Literatures literaturesNew_ = Literatures.new_();
        literaturesNew_.title = "小王子";
        literaturesNew_.f20433id = "1";
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
        new g53().m124460F(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "11111", "pageId", false, arrayList, arrayList2, new g53.C17002d("card", "both_like"), new C9070d0());
    }

    /* JADX INFO: renamed from: qj */
    public static void m59081qj(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("国际化-翁翁二楼", new C9102l0(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: qk */
    public static void m59082qk(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("推荐聊天室", new C9141x0(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m59083r() {
        hpd0 hpd0Var = CoreModule.f17545c.f19663m0.f19458v1;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m59084r0() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149481u2;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: r1 */
    public static /* synthetic */ void m59085r1() {
        String str = "core_greet_say_hi_gift_guide_is_never_show_" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        new hpd0(str, bool).put(bool);
    }

    /* JADX INFO: renamed from: r3 */
    public static /* synthetic */ void m59087r3() {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.local_birthday_tip);
        CoreModule.f17545c.f19642f0.f19963o2.clear();
        CoreModule.f17545c.f19642f0.f19963o2.add(messageNew_);
    }

    /* JADX INFO: renamed from: r8 */
    public static /* synthetic */ void m59092r8(final ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, final nt30 nt30Var) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("隐身功能回收【汇总】", new d30() { // from class: l.nuc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58804e5(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("See试用配对失效引导【汇总】", new d30() { // from class: l.ruc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58588U3(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("一键配对【汇总】", new d30() { // from class: l.uuc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58257Ee(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("闪聊优化三期【汇总】", new d30() { // from class: l.vuc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58825f4(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("每日精选【汇总】", new d30() { // from class: l.wuc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58366Jd(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("免费试用SVIP特权【汇总】", new d30() { // from class: l.xuc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59259z(arrayList, nt30Var, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("会员改版入口联动【汇总】", new d30() { // from class: l.yuc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59115s9(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("插入一个see画像升级用户到see列表", new d30() { // from class: l.zuc
            @Override // p149l.d30
            public final void call() {
                sbe0.m183218d().m183220c(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            }
        }));
        arrayList.add(vwb.m200311Y("白金会员【汇总】", new d30() { // from class: l.avc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58727ag(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("女性会员【汇总】", new d30() { // from class: l.bvc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58159A4(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("青春专享会员【汇总】", new d30() { // from class: l.ouc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58200C1(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("私人定制【汇总】", new d30() { // from class: l.puc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58518Qh(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("VIP试用【汇总】", new d30() { // from class: l.quc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59020o2(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: r9 */
    public static /* synthetic */ void m59093r9(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: ra */
    public static /* synthetic */ void m59094ra(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        vyc0.m200644s(viewTreeObserverOnGlobalLayoutListenerC7866b.m37292g2(), "测试");
        vyc0.m200644s(viewTreeObserverOnGlobalLayoutListenerC7866b.m37292g2(), "测试");
    }

    /* JADX INFO: renamed from: rd */
    public static /* synthetic */ void m59097rd(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.f149181G5)) {
            arrayList.add(vwb.m200311Y("强制展示消息弱化提醒，当前".concat(CoreModule.f17545c.f19639e0.f149181G5.get().booleanValue() ? "true" : "false"), new C9092i2()));
            arrayList.add(vwb.m200311Y("清除所有频控", new C9096j2()));
            viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
        }
    }

    /* JADX INFO: renamed from: rg */
    public static /* synthetic */ void m59100rg() {
        hpd0 hpd0Var = lsi0.f129869a;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: rh */
    public static /* synthetic */ void m59101rh() {
        zxz.m220864h().m220869l();
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149350d1;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        CoreModule.f17545c.f19639e0.f149358e1.put(bool);
        CoreModule.f17545c.f19631b1.f121926R.put(bool);
        CoreModule.f17545c.f19631b1.f121927S.put(bool);
    }

    /* JADX INFO: renamed from: rj */
    public static void m59103rj(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("国际化-交友目的", new C9098k0(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: rk */
    public static void m59104rk(final ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("红点曝光优化", new d30() { // from class: l.gpc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58907j(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
    }

    /* JADX INFO: renamed from: s2 */
    public static /* synthetic */ void m59108s2(Throwable th) {
    }

    /* JADX INFO: renamed from: s3 */
    public static /* synthetic */ void m59109s3() {
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
            CoreModule.f17545c.f19642f0.f19963o2.clear();
            CoreModule.f17545c.f19642f0.f19963o2.add(messageNew_);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            aag0.m95543a(e);
        }
    }

    /* JADX INFO: renamed from: s4 */
    public static /* synthetic */ void m59110s4(String str) {
        CoreModule.f17545c.f19642f0.f19868J0.put(str);
        CoreModule.f17545c.f19642f0.f19862H0.put(Long.valueOf(mqi0.m155944o()));
        CoreModule.f17545c.f19642f0.f19865I0.put(Long.valueOf(mqi0.m155944o() + com.clevertap.android.sdk.Constants.INBOX_V2_THROTTLE_WINDOW_MS));
    }

    /* JADX INFO: renamed from: s7 */
    public static /* synthetic */ void m59113s7() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149282U4;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: s8 */
    public static /* synthetic */ void m59114s8() {
    }

    /* JADX INFO: renamed from: s9 */
    public static /* synthetic */ void m59115s9(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("清除所有标记", new d30() { // from class: l.s7d
            @Override // p149l.d30
            public final void call() {
                TabUniteManager.m44953i().m44954h(TabUniteManager.BadgeIconType.NONE);
            }
        }));
        arrayList.add(vwb.m200311Y("清除促销标记", new d30() { // from class: l.t7d
            @Override // p149l.d30
            public final void call() {
                TabUniteManager.m44953i().m44954h(TabUniteManager.BadgeIconType.PROMOTION);
            }
        }));
        arrayList.add(vwb.m200311Y("清除See标记", new d30() { // from class: l.u7d
            @Override // p149l.d30
            public final void call() {
                TabUniteManager.m44953i().m44954h(TabUniteManager.BadgeIconType.SEE);
            }
        }));
        arrayList.add(vwb.m200311Y("清除Boost标记", new d30() { // from class: l.v7d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58536Re();
            }
        }));
        arrayList.add(vwb.m200311Y("清除黑金会员标记", new d30() { // from class: l.w7d
            @Override // p149l.d30
            public final void call() {
                TabUniteManager.m44953i().m44954h(TabUniteManager.BadgeIconType.ODIAMOND);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: sa */
    public static /* synthetic */ void m59116sa() {
        a6h0.m95140a().put(0L);
        new zpd0("svip_trial_dlg_show" + CoreModule.m29931H().userId(), -1L).put(0L);
        String str = "recall_dlg_show" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.TRUE;
        new hpd0(str, bool).put(bool);
        new uqd0("svip_year_prom_coupon_id" + CoreModule.m29931H().userId(), "").put("");
        new uqd0("svip_6m_double11_prom_coupon_id" + CoreModule.m29931H().userId(), "").put("");
    }

    /* JADX INFO: renamed from: sc */
    public static /* synthetic */ void m59118sc() {
        CoreModule.f17545c.f19639e0.f149455q4.clear();
        CoreModule.f17545c.f19639e0.f149448p4.clear();
    }

    /* JADX INFO: renamed from: sd */
    public static /* synthetic */ void m59119sd(nt30 nt30Var) {
        if (uq40.m194983y(nt30Var.m161157T4(), true)) {
            return;
        }
        nt30Var.f140350G.m132487l(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: sg */
    public static /* synthetic */ void m59122sg() {
        zl80.m219252g().m219256a();
        osi0.m165783g("已清除");
    }

    /* JADX INFO: renamed from: si */
    public static /* synthetic */ void m59124si(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        w6p.C20813a c20813a = new w6p.C20813a(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
        ArrayList arrayListM200324f0 = vwb.m200324f0(PurchaseType.TYPE_GET_VIP, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        Privilege privilege = Privilege.vip_location;
        c20813a.m201953i(arrayListM200324f0, vwb.m200324f0(privilege, privilege)).m201948d(BuildConfig.BUILD_TYPE).m201954j(0).m201955k();
    }

    /* JADX INFO: renamed from: sj */
    public static void m59125sj(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("Intl-ILIke", new C9074e0(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: sk */
    public static void m59126sk() {
        e51.m114748M(new Runnable() { // from class: l.m9c
            @Override // java.lang.Runnable
            public final void run() {
                DebugUtil.m58539Rh();
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m59127t(PurchaseType purchaseType, Act act, String str) {
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m59128t0() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149290V4;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: t1 */
    public static /* synthetic */ void m59129t1() {
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < 7; i++) {
            arrayList.add(i + "");
        }
        sa40.m182802o().m182818P(arrayList);
    }

    /* JADX INFO: renamed from: t2 */
    public static /* synthetic */ void m59130t2() {
        CoreModule.f17545c.f19639e0.f149278U0.put(0);
        CoreModule.f17545c.f19642f0.m33049mp(true);
    }

    /* JADX INFO: renamed from: t3 */
    public static /* synthetic */ String m59131t3(OpenSdkCodeAuth openSdkCodeAuth) {
        return (!NullChecker.m81303a(openSdkCodeAuth) || TextUtils.isEmpty(openSdkCodeAuth.code)) ? "" : openSdkCodeAuth.code;
    }

    /* JADX INFO: renamed from: t4 */
    public static /* synthetic */ void m59132t4(final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        uq40.m194957G(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), true);
        e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), new Runnable() { // from class: l.xvc
            @Override // java.lang.Runnable
            public final void run() {
                uq40.m194957G(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), true);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: t5 */
    public static /* synthetic */ void m59133t5(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        PurchaseType purchaseType = PurchaseType.TYPE_O_DIAMOND;
        new C8778c.a(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), purchaseType, null).m54094g(fy80.m123713i(purchaseType.getPrivilegeData(null), null)).m54095h();
    }

    /* JADX INFO: renamed from: t6 */
    public static /* synthetic */ void m59134t6(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("春节活动清理弹框：", new d30() { // from class: l.i4d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59118sc();
            }
        }));
        arrayList.add(vwb.m200311Y("实验开关：" + CoreModule.f17545c.f19639e0.f149345c4.get(), new d30() { // from class: l.t4d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58849g6();
            }
        }));
        arrayList.add(vwb.m200311Y("清理首页保存的已经推荐的数据：", new d30() { // from class: l.u4d
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19663m0.f19443q1.clear();
            }
        }));
        arrayList.add(vwb.m200311Y("清理 插入特定的想结婚用", new d30() { // from class: l.v4d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58951l();
            }
        }));
        arrayList.add(vwb.m200311Y("插入特定的想结婚用：", new d30() { // from class: l.w4d
            @Override // p149l.d30
            public final void call() {
                i0e.m133795d(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m133814D(10).m133825r("输入插入Userid").m133816F(new e30() { // from class: l.f9c
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        CoreModule.f17545c.f19663m0.f19324B1.put((String) obj);
                    }
                }).m133821n().show();
            }
        }));
        arrayList.add(vwb.m200311Y("打开交友目的选择", new d30() { // from class: l.x4d
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), new DebugUtil.RunnableC9060a2(new v0x(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), "")), 1000L);
            }
        }));
        arrayList.add(vwb.m200311Y("切换弹框", new d30() { // from class: l.y4d
            @Override // p149l.d30
            public final void call() {
                e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), new DebugUtil.RunnableC9064b2(), 1000L);
            }
        }));
        arrayList.add(vwb.m200311Y("Debug模式控制入口：" + CoreModule.f17545c.f19639e0.f149329a4.get(), new d30() { // from class: l.a5d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59250yc();
            }
        }));
        arrayList.add(vwb.m200311Y("侧边开", new d30() { // from class: l.b5d
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19639e0.f149163E1.m132487l(Boolean.TRUE);
            }
        }));
        arrayList.add(vwb.m200311Y("prfile页", new d30() { // from class: l.c5d
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.m37143D6(MarryProfileEditAct.m47418Y1(viewTreeObserverOnGlobalLayoutListenerC7866b2.act()));
            }
        }));
        arrayList.add(vwb.m200311Y("进入落地页", new d30() { // from class: l.j4d
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().startActivity(new Intent(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), (Class<?>) MarryInfoAuditStatusAct.class));
            }
        }));
        arrayList.add(vwb.m200311Y("交友目的", new d30() { // from class: l.k4d
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().startActivity(new Intent(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), (Class<?>) MarryStatusSetAct.class));
            }
        }));
        arrayList.add(vwb.m200311Y("跳转连续编辑页 null测试", new d30() { // from class: l.l4d
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().startActivity(MarryEditProfileSeriesAct.m47452Y1(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), CoreModule.m29932K().me_(), null, true, false, false));
            }
        }));
        arrayList.add(vwb.m200311Y("插入广告卡", new d30() { // from class: l.m4d
            @Override // p149l.d30
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC7866b.act().postDelayed(new Runnable() { // from class: l.kad
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m58829f8();
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.m200311Y("插入四选一广告卡", new d30() { // from class: l.n4d
            @Override // p149l.d30
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC7866b.act().postDelayed(new Runnable() { // from class: l.dad
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m58832fb();
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.m200311Y("清空四选一数据", new d30() { // from class: l.p4d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58481P1();
            }
        }));
        arrayList.add(vwb.m200311Y("四选一变身小姐姐:" + CoreModule.f17545c.f19639e0.f149282U4.get(), new d30() { // from class: l.q4d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59113s7();
            }
        }));
        arrayList.add(vwb.m200311Y("忽略支付" + f38256f, new d30() { // from class: l.r4d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.f38256f = !DebugUtil.f38256f;
            }
        }));
        arrayList.add(vwb.m200311Y("清空标记数据", new d30() { // from class: l.s4d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59270za();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: tc */
    public static /* synthetic */ void m59140tc() {
        hpd0 hpd0Var = CoreModule.f17545c.f19642f0.f19917Z0;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: te */
    public static /* synthetic */ void m59142te(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        final VerificationNetworkData verificationNetworkDataNew_ = VerificationNetworkData.new_();
        verificationNetworkDataNew_.meta.code = TantanException.NET_ACTION_AVATAR_VERIFICATION;
        verificationNetworkDataNew_.data.status = 2;
        puk0.m171431e().m171432b().m132487l(verificationNetworkDataNew_);
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().postDelayed(new Runnable() { // from class: l.ibd
            @Override // java.lang.Runnable
            public final void run() {
                puk0.m171431e().m171432b().m132487l(verificationNetworkDataNew_);
            }
        }, com.clevertap.android.sdk.Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
    }

    /* JADX INFO: renamed from: tg */
    public static /* synthetic */ void m59144tg(String str) {
        try {
            CoreModule.f17545c.f19639e0.f149175F6.put(Integer.valueOf(Integer.parseInt(str)));
        } catch (NumberFormatException unused) {
            lsi0.m151580j("输入错误");
        }
    }

    /* JADX INFO: renamed from: th */
    public static /* synthetic */ void m59145th() {
        tpd0 tpd0Var = CoreModule.f17545c.f19639e0.f149411k6;
        tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
    }

    /* JADX INFO: renamed from: ti */
    public static /* synthetic */ void m59146ti(boolean z, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, String str) {
        CoreModule.f17545c.f19697x1.seeBlindBoxEnvelope = new SeeBlindBoxEnvelope();
        CoreModule.f17545c.f19697x1.seeBlindBoxEnvelope.nullCheck();
        User userMe_ = CoreModule.m29932K().me_();
        if (!TextUtils.isEmpty(str)) {
            userMe_.f56011id = str;
            if (CoreModule.f17545c.f19639e0.m169430Pa(str) == null) {
                lsi0.m151580j("输入的uid 本地数据库没有");
            }
        }
        CoreModule.f17545c.f19697x1.seeBlindBoxEnvelope.data.users.add(userMe_);
        if (z) {
            viewTreeObserverOnGlobalLayoutListenerC7866b.act().duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(str)).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new C9126s0(viewTreeObserverOnGlobalLayoutListenerC7866b)));
        } else {
            m7e0.m153367b(viewTreeObserverOnGlobalLayoutListenerC7866b);
        }
    }

    /* JADX INFO: renamed from: tj */
    public static void m59147tj(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("国际化-已读回执", new C9078f0(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: tk */
    public static void m59148tk(final ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("see toast trace debug", new d30() { // from class: l.glc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59239y1(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m59150u0(CounterLikeLimit counterLikeLimit, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, User user, Dialog dialog, View view, int i, CharSequence charSequence) {
        zvf0.m220399u("e_debug_tool", "p_debug_tool_dialog_view", vwb.m200311Y("debug_tool_name", charSequence));
        switch (i) {
            case 1:
                new RunnableC9128t(counterLikeLimit, viewTreeObserverOnGlobalLayoutListenerC7866b).run();
                break;
            case 3:
                CoreDlg.m45118y1(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), CoreModule.f17545c.f19639e0.m169527p9(), false, new Runnable() { // from class: l.m5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m58167Ac(viewTreeObserverOnGlobalLayoutListenerC7866b);
                    }
                }, new Runnable() { // from class: l.q5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m58601Ug();
                    }
                });
                break;
            case 4:
                CoreDlg.m45118y1(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), CoreModule.f17545c.f19639e0.m169527p9(), true, new Runnable() { // from class: l.r5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m58312H3(viewTreeObserverOnGlobalLayoutListenerC7866b);
                    }
                }, new Runnable() { // from class: l.s5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m58644Wh();
                    }
                });
                break;
            case 5:
                ok3.m164808G(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), true, "kingty", CoreModule.f17545c.m31484o3().superLikeLimit.remainToday() + "", true, new Runnable() { // from class: l.t5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2().mo38801A(SwipeDirection.UP);
                    }
                }, new Runnable() { // from class: l.u5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m59074qc();
                    }
                });
                break;
            case 6:
                ok3.m164808G(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), false, "kingty", CoreModule.f17545c.m31484o3().superLikeLimit.remainToday() + "", true, new Runnable() { // from class: l.w5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2().mo38801A(SwipeDirection.UP);
                    }
                }, new Runnable() { // from class: l.x5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m58269F4();
                    }
                });
                break;
            case 8:
                C8764c.m53409L1(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "p_home,expired_vip", null, null, null, true);
                break;
            case 12:
                C8764c.m53403J1(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), null, Privilege.vip_super_like);
                break;
            case 13:
                C8764c.m53391F1(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), null);
                break;
            case 14:
                ark.m98449T0(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
                break;
            case 15:
                ark.m98453V0(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), true, user.m60124fp(), viewTreeObserverOnGlobalLayoutListenerC7866b.act().string(R$string.f17827Ik), new Runnable() { // from class: l.y5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                        viewTreeObserverOnGlobalLayoutListenerC7866b2.m37341q2().startActivityForResult(MediaPickerAct.m78919X1(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.m208412y0() - t100.m186890d(40.0f)).build()).withFromType(1).build()), 19);
                    }
                });
                break;
            case 16:
                viewTreeObserverOnGlobalLayoutListenerC7866b.m37138C6();
                break;
            case 17:
                viewTreeObserverOnGlobalLayoutListenerC7866b.act().dialog().m20504F(viewTreeObserverOnGlobalLayoutListenerC7866b.m37282e2(viewTreeObserverOnGlobalLayoutListenerC7866b.act().getString(R$string.f17777H0) + CoreModule.f17545c.f19596P2.get() + viewTreeObserverOnGlobalLayoutListenerC7866b.act().getString(R$string.f17747G0))).m20543m0(viewTreeObserverOnGlobalLayoutListenerC7866b.act().getString(R$string.f18408c)).m20560v0(viewTreeObserverOnGlobalLayoutListenerC7866b.act().getString(R$string.f19108z), new Runnable() { // from class: l.z5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                        viewTreeObserverOnGlobalLayoutListenerC7866b2.m37143D6(StudentInfoAct.m44485V1(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), "Chanel6.SchoolIdentifyPage.Shown", false));
                    }
                }).m20568z0();
                break;
            case 18:
                viewTreeObserverOnGlobalLayoutListenerC7866b.m37341q2().m20603w4(MatchAct.m47563e2(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), vwb.m200324f0(user.f56011id), 0, new ArrayList()), new MatchAct.C8454b());
                break;
            case 21:
                viewTreeObserverOnGlobalLayoutListenerC7866b.m37360t6();
                break;
            case 22:
                lsi0.m151588r("removed");
                break;
            case 23:
                ark.m98453V0(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), true, user.m60124fp(), viewTreeObserverOnGlobalLayoutListenerC7866b.act().string(R$string.f18715m), null);
                break;
            case 29:
                ok3.m164810I(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), 3, vwb.m200324f0("http://cloud.staging1.p1staff.com/v1/images/eyJpZCI6IktVSldUR0tCQU9HU1JXQklRQ1FPUlhWUVE2R0xEWiIsInciOjk2MCwiaCI6OTYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NzgyMjA1OTUzOTczMzQ5NjYxOCwiYWIiOjB9", "http://cloud.staging1.p1staff.com/v1/images/eyJpZCI6IkJONk1QNk9CN0RJUTNaVFdYQTVKWVE0MjRLVlBSQSIsInciOjU4NywiaCI6NTg3LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTQ1NzkxNTcxOTgwMzQwMTg5MTksImFiIjowfQ", "http://cloud.staging1.p1staff.com/v1/images/eyJpZCI6IjJXVk8ySEJUR0xHR1VLTU1KR0JBSlA3QVJSWU5VRyIsInciOjc1MCwiaCI6NzUwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTI4MzY5ODM3MDc4MjEzMjE0ODJ"));
                break;
            case 30:
                C8346a.m45563j();
                C8346a.m45564q(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), new Runnable() { // from class: l.n5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m58706Zg();
                    }
                }, new Runnable() { // from class: l.o5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m58427Ma();
                    }
                });
                break;
            case 31:
                e9n.m115355D(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "", "homePage");
                break;
            case 33:
                new dej().m111267j(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), CoreModule.f17545c.f19639e0.m169527p9());
                break;
            case 34:
                e9n.m115352A(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), PurchaseType.TYPE_GET_LIKERS, "");
                break;
            case 35:
                e9n.m115354C(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), viewTreeObserverOnGlobalLayoutListenerC7866b.act().string(R$string.f18645jm), viewTreeObserverOnGlobalLayoutListenerC7866b.act().string(R$string.f18615im), viewTreeObserverOnGlobalLayoutListenerC7866b.act().string(R$string.f18554gm), new Runnable() { // from class: l.p5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                        viewTreeObserverOnGlobalLayoutListenerC7866b2.act().startActivity(NewMainAct.m39695M5(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), NavigationIntent.get("setting")));
                    }
                });
                break;
        }
    }

    /* JADX INFO: renamed from: u3 */
    public static /* synthetic */ void m59153u3(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        View viewInflate = LayoutInflater.from(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).inflate(f6c0.f95873l4, (ViewGroup) null);
        qib0.f154691G.m102336O((VDraweeView) viewInflate.findViewById(u4c0.f174496u5), CoreModule.f17545c.f19639e0.m169527p9().picture(0).url, 4, 100);
        ((VText) viewInflate.findViewById(u4c0.f173985Pd)).setText("测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试");
        SimplePushBubble simplePushBubbleM21169s = new SimplePushBubble.C4372a(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), viewInflate).m21171u("" + System.currentTimeMillis()).m21173w(30000).m21164B(2).m21169s();
        ((VButton) viewInflate.findViewById(u4c0.f173785E0)).setText("去聊聊");
        simplePushBubbleM21169s.m96808x(CorePopLevel.IMMERSION_SEND_MSG);
        hdb0.m130575c().m130582i(simplePushBubbleM21169s);
    }

    /* JADX INFO: renamed from: u6 */
    public static /* synthetic */ void m59156u6(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: u7 */
    public static /* synthetic */ void m59157u7() {
        CoreModule.f17545c.f19639e0.f149494w1.put(0L);
        CoreModule.f17545c.f19639e0.f149501x1.put(0L);
        CoreModule.f17545c.f19642f0.m32971gn();
    }

    /* JADX INFO: renamed from: u9 */
    public static /* synthetic */ void m59159u9() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.UndoGuideCard;
        userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f17545c.f19663m0.m31154w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: ua */
    public static /* synthetic */ void m59160ua() {
        String str = BifrostLayout.f23320c;
        ConnectivityReceiver.m81286i();
    }

    /* JADX INFO: renamed from: ub */
    public static /* synthetic */ void m59161ub() {
        hpd0 hpd0Var = lra0.f129538y;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        lra0.f129537x.put(Boolean.valueOf(!lra0.f129538y.get().booleanValue()));
    }

    /* JADX INFO: renamed from: uc */
    public static /* synthetic */ void m59162uc() {
        hpd0 hpd0Var = lra0.f129503c;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: ue */
    public static /* synthetic */ void m59164ue() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149387h6;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: uf */
    public static /* synthetic */ void m59165uf() {
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = CoreModule.f17545c.f19663m0.f19394a0.m221515e();
        if (partialListOptM221515e == null || vwb.m200296J(partialListOptM221515e.loaded)) {
            return;
        }
        for (CoreSuggested.UserInfo userInfo : partialListOptM221515e.loaded) {
            if (userInfo.ussTags == null) {
                userInfo.ussTags = UssTags.new_();
            }
            userInfo.ussTags.cardStyle = "likeSupport";
        }
        CoreModule.f17545c.f19663m0.f19394a0.m132487l(partialListOptM221515e);
    }

    /* JADX INFO: renamed from: uj */
    public static void m59169uj(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("国际化 会员购买挽回弹窗", new C9086h0(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: uk */
    public static void m59170uk(final Act act) {
        i0e.m133795d(act).m133814D(10).m133825r("输入插入Userid").m133816F(new e30() { // from class: l.k6d
            @Override // p149l.e30
            public final void call(Object obj) {
                e51.m114743H(act, new Runnable() { // from class: l.v8c
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m58965ld(str);
                    }
                }, 1000L);
            }
        }).m133821n().show();
    }

    /* JADX INFO: renamed from: v1 */
    public static /* synthetic */ void m59173v1(String str) {
        try {
            CoreModule.f17545c.f19639e0.f149474t2.put(Double.valueOf(Double.parseDouble(str)));
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: v4 */
    public static /* synthetic */ void m59176v4() {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.system_reminder);
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        messageNew_.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.systemReminder = SystemReminder.new_();
        messageNew_.additionalData.systemReminder.icon = "https://auto.tancdn.com/v1/images/eyJpZCI6IlpMWEZNRjQ1NEFDVlRSUjNWN0hDQlRPRjVGQTcyNzE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NDM3MjA2NzE3MTA4NzkyNTg4fQ.png";
        messageNew_.value = "好友上线了";
        CoreModule.f17545c.f19642f0.f19963o2.clear();
        CoreModule.f17545c.f19642f0.f19963o2.add(messageNew_);
    }

    /* JADX INFO: renamed from: v6 */
    public static /* synthetic */ void m59178v6(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        PurchaseType purchaseType = PurchaseType.TYPE_PICKS_MEMBERSHIP;
        ArrayList<Privilege> privilegeData = purchaseType.getPrivilegeData(null);
        Privilege privilege = Privilege.picksMembership;
        new C8761b.d(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m53331m(purchaseType, privilege).m53329k(fy80.m123714j(privilegeData, privilege)).m53334p();
    }

    /* JADX INFO: renamed from: v7 */
    public static /* synthetic */ void m59179v7(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        viewTreeObserverOnGlobalLayoutListenerC7866b.m37315k6();
        CoreModule.f17545c.f19639e0.f149243P5.put(0L);
        CoreModule.f17545c.f19639e0.f149236O5.put(0);
    }

    /* JADX INFO: renamed from: v8 */
    public static /* synthetic */ void m59180v8(Throwable th) {
    }

    /* JADX INFO: renamed from: v9 */
    public static /* synthetic */ void m59181v9() {
        hpd0 hpd0Var = lra0.f129483K;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: va */
    public static /* synthetic */ void m59182va() {
    }

    /* JADX INFO: renamed from: vd */
    public static /* synthetic */ void m59185vd() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149188H6;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: ve */
    public static /* synthetic */ void m59186ve(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        q3h0.C19423b c19423b = new q3h0.C19423b();
        c19423b.m172864a(3);
        c19423b.m172866c(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
    }

    /* JADX INFO: renamed from: vg */
    public static /* synthetic */ void m59188vg() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149294W0;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        CoreModule.f17545c.f19663m0.f19460w0.put(bool);
    }

    /* JADX INFO: renamed from: vh */
    public static /* synthetic */ void m59189vh() {
        hpd0 hpd0Var = CoreModule.f17545c.f19663m0.f19452t1;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: vj */
    public static void m59191vj(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("国际化 tribe", new C9094j0(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: vk */
    public static void m59192vk(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        View viewInflate = LayoutInflater.from(viewTreeObserverOnGlobalLayoutListenerC7866b.getContext()).inflate(f6c0.f95403I8, (ViewGroup) null);
        View decorView = viewTreeObserverOnGlobalLayoutListenerC7866b.act().getWindow().getDecorView();
        if (decorView instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            layoutParams.bottomMargin = t100.m186890d(150.0f);
            ((FrameLayout) decorView).addView(viewInflate, layoutParams);
            ((PopDebugLayout) viewInflate).setMainViewModel(viewTreeObserverOnGlobalLayoutListenerC7866b);
        }
    }

    /* JADX INFO: renamed from: w1 */
    public static /* synthetic */ void m59195w1(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: w5 */
    public static /* synthetic */ void m59199w5() {
    }

    /* JADX INFO: renamed from: w7 */
    public static /* synthetic */ void m59201w7(GreetingSummary greetingSummary) {
        greetingSummary.unseen = 0;
        greetingSummary.latestTime = mqi0.m155944o();
        greetingSummary.latestUserId = CoreModule.f17545c.f19639e0.m169527p9().f56011id;
        CoreModule.f17545c.f19678r0.f20023d0.m132487l(greetingSummary);
    }

    /* JADX INFO: renamed from: w8 */
    public static /* synthetic */ void m59202w8() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149403j6;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: w9 */
    public static /* synthetic */ void m59203w9(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        final VerificationNetworkData verificationNetworkDataNew_ = VerificationNetworkData.new_();
        verificationNetworkDataNew_.meta.code = TantanException.NET_ACTION_AVATAR_VERIFICATION;
        verificationNetworkDataNew_.data.status = 1;
        puk0.m171431e().m171432b().m132487l(verificationNetworkDataNew_);
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().postDelayed(new Runnable() { // from class: l.bad
            @Override // java.lang.Runnable
            public final void run() {
                puk0.m171431e().m171432b().m132487l(verificationNetworkDataNew_);
            }
        }, com.clevertap.android.sdk.Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
    }

    /* JADX INFO: renamed from: wb */
    public static /* synthetic */ void m59205wb(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("消息红点脱敏实验一：" + CoreModule.f17545c.f19642f0.f19959n1.get(), new d30() { // from class: l.xlc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58940ka();
            }
        }));
        arrayList.add(vwb.m200311Y("消息红点脱敏实验二：" + CoreModule.f17545c.f19642f0.f19962o1.get(), new d30() { // from class: l.ylc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58215Cg();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: wd */
    public static /* synthetic */ void m59207wd(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.SuperlikeGuideCard;
        userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), new Runnable() { // from class: l.l0d
            @Override // java.lang.Runnable
            public final void run() {
                ezc0.m118906i0().m118913j0();
            }
        }, 2000L);
    }

    /* JADX INFO: renamed from: wh */
    public static /* synthetic */ void m59211wh() {
    }

    /* JADX INFO: renamed from: wi */
    public static /* synthetic */ void m59212wi() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.BarLoverGuideCard;
        userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f17545c.f19663m0.m31154w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: wj */
    public static void m59213wj(ArrayList<j760<String, d30>> arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("国际化 会员升级", new C9090i0(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b)));
    }

    /* JADX INFO: renamed from: wk */
    public static void m59214wk(final Act act) {
        i0e.m133795d(act).m133814D(10).m133825r("输入插入Userid").m133816F(new e30() { // from class: l.yvc
            @Override // p149l.e30
            public final void call(Object obj) {
                Act act2 = act;
                e51.m114743H(act2, new Runnable() { // from class: l.f0d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m59015nj(str, act2, 0);
                    }
                }, 1000L);
            }
        }).m133821n().show();
    }

    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ void m59217x1() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149518z4;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: x2 */
    public static /* synthetic */ void m59218x2(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        m58667Xj(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), true);
        m58667Xj(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), false);
    }

    /* JADX INFO: renamed from: x3 */
    public static /* synthetic */ void m59219x3() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.FemaleVerificationGuideCard;
        userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f17545c.f19663m0.m31154w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: x7 */
    public static /* synthetic */ void m59223x7() {
        hpd0 hpd0Var = CoreModule.f17545c.f19704z2.f19228g0;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: x8 */
    public static /* synthetic */ void m59224x8() {
        snm.f165470j = true;
        snm.f165467g = false;
        snm.f165468h = false;
    }

    /* JADX INFO: renamed from: x9 */
    public static /* synthetic */ void m59225x9(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        final ConversationCounterTypeSp conversationCounterTypeSp = ConversationCounterTypeSp.aEmojiIceBreakingNoReplyTime;
        Objects.requireNonNull(conversationCounterTypeSp);
        final d30 d30Var = new d30() { // from class: l.e3d
            @Override // p149l.d30
            public final void call() {
                conversationCounterTypeSp.clear();
            }
        };
        arrayList.add(vwb.m200311Y("（同一个对话一天内只展示一次）b 类型 = " + conversationCounterTypeSp, d30Var));
        final ConversationCounterTypeSp conversationCounterTypeSp2 = ConversationCounterTypeSp.aEmojiIceBreakingMessageTimeLimitTime;
        Objects.requireNonNull(conversationCounterTypeSp2);
        final d30 d30Var2 = new d30() { // from class: l.e3d
            @Override // p149l.d30
            public final void call() {
                conversationCounterTypeSp2.clear();
            }
        };
        arrayList.add(vwb.m200311Y("（同一个对话一天内只展示一次）c 类型 = " + conversationCounterTypeSp2, d30Var2));
        final d30 d30Var3 = new d30() { // from class: l.f3d
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.f19877M0.put(0L);
            }
        };
        StringBuilder sb = new StringBuilder("破冰表情 对方发过消息，但我方没有发过消息类型上次展示时间 (b类型) = ");
        SimpleDateFormat simpleDateFormat = mqi0.f135254f;
        sb.append(simpleDateFormat.format(CoreModule.f17545c.f19642f0.f19877M0.get()));
        arrayList.add(vwb.m200311Y(sb.toString(), d30Var3));
        final d30 d30Var4 = new d30() { // from class: l.i3d
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.f19880N0.put(0);
            }
        };
        arrayList.add(vwb.m200311Y("对方发过消息，但我方没有发过消息类型同一天展示次数 (b类型)  = " + CoreModule.f17545c.f19642f0.f19880N0.get(), d30Var4));
        final d30 d30Var5 = new d30() { // from class: l.j3d
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.f19883O0.put(0L);
            }
        };
        arrayList.add(vwb.m200311Y("破冰表情 无未读且最后一条消息距现在超过 3 天类型上次展示时间 (c类型) = " + simpleDateFormat.format(CoreModule.f17545c.f19642f0.f19883O0.get()), d30Var5));
        final d30 d30Var6 = new d30() { // from class: l.k3d
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.f19886P0.put(0);
            }
        };
        arrayList.add(vwb.m200311Y("破冰表情 无未读且最后一条消息距现在超过 3 天类型上次展示次数 (c类型) = " + CoreModule.f17545c.f19642f0.f19886P0.get(), d30Var6));
        arrayList.add(vwb.m200311Y("一键全部置空", new d30() { // from class: l.l3d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58790dd(d30Var, d30Var2, d30Var3, d30Var4, d30Var5, d30Var6);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: xa */
    public static /* synthetic */ void m59226xa() {
        hpd0 hpd0Var = CoreModule.f17545c.f19571H1.f184113g0;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: xd */
    public static /* synthetic */ void m59229xd(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("购买对话框-VIP", new d30() { // from class: l.m0d
            @Override // p149l.d30
            public final void call() {
                new C8778c.a(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), PurchaseType.TYPE_GET_VIP, null).m54095h();
            }
        }));
        arrayList.add(vwb.m200311Y("购买对话框-SVIP", new d30() { // from class: l.q0d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58578Te(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("购买对话框-黑金", new d30() { // from class: l.r0d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59133t5(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("购买对话框-白金", new d30() { // from class: l.t0d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58511Qa(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("购买对话框-加速配对", new d30() { // from class: l.u0d
            @Override // p149l.d30
            public final void call() {
                new C8778c.a(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), PurchaseType.TYPE_GET_ACCELERATE_PAIRING, null).m54095h();
            }
        }));
        arrayList.add(vwb.m200311Y("购买对话框-SVIP精选", new d30() { // from class: l.v0d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58256Ed(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("购买对话框-精选", new d30() { // from class: l.w0d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59045p5(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("购买对话框-女性会员", new d30() { // from class: l.x0d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58679Ya(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("购买对话框-VIP+SVIP-默认VIP", new d30() { // from class: l.y0d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58227D6(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("购买对话框-VIP+SVIP-默认SVIP", new d30() { // from class: l.z0d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58895i8(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("购买对话框-SVIP+ODiamond", new d30() { // from class: l.n0d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58375K0(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("VIP升级SVIP弹窗New", new d30() { // from class: l.o0d
            @Override // p149l.d30
            public final void call() {
                vk3.m198715h(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            }
        }));
        arrayList.add(vwb.m200311Y("SVIP升级黑金弹窗New", new d30() { // from class: l.p0d
            @Override // p149l.d30
            public final void call() {
                vk3.m198714g(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: xh */
    public static /* synthetic */ void m59233xh(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        final hpd0 hpd0Var = new hpd0("enable_delete_local_conversation", Boolean.FALSE);
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().dialog().m20535e0(vwb.m200324f0("长按删除本地Conversation: " + hpd0Var.get(), "Conversation Counter Verify")).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.rrc
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                DebugUtil.m58207C8(hpd0Var, dialog, view, i, charSequence);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: xi */
    public static /* synthetic */ void m59234xi() {
        C4736e c4736e = CoreModule.f17545c.f19645g0;
        hpd0 hpd0Var = C4736e.f19766D0;
        C4736e c4736e2 = CoreModule.f17545c.f19645g0;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: xj */
    public static ArrayList<j760<String, d30>> m59235xj(final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, final nt30 nt30Var) {
        final ArrayList<j760<String, d30>> arrayList = new ArrayList<>();
        m58818ej(arrayList);
        m58862gj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        arrayList.add(vwb.m200311Y("聊天论数外显 推荐会话 ", new d30() { // from class: l.p8c
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m32868Ye().take(1).map(new DebugUtil.C9082g0()).observeOn(Schedulers.m221493io()).map(new DebugUtil.C9057a()).subscribe(mkd0.m154956H(new DebugUtil.C9123r0(), new DebugUtil.C9063b1()));
            }
        }));
        arrayList.add(vwb.m200311Y("婚恋 弹框: ", new d30() { // from class: l.x9c
            @Override // p149l.d30
            public final void call() {
                e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), new DebugUtil.RunnableC9107m1(), 1000L);
            }
        }));
        arrayList.add(vwb.m200311Y("首页改版兼容 强制开关： " + CoreModule.f17545c.f19639e0.f149492v6.get(), new d30() { // from class: l.qec
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58599Ue();
            }
        }));
        arrayList.add(vwb.m200311Y("关闭检测的Taost: " + lsi0.f129869a.get(), new d30() { // from class: l.rhc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59100rg();
            }
        }));
        arrayList.add(vwb.m200311Y("卡片只看认证 强制显示  :" + CoreModule.f17545c.f19663m0.f19360N1.get(), new d30() { // from class: l.eic
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58247E4();
            }
        }));
        arrayList.add(vwb.m200311Y("更多场景引导资料 卡片 引导 : " + CoreModule.f17545c.f19639e0.f149443o6.get(), new d30() { // from class: l.qic
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58560Sh();
            }
        }));
        arrayList.add(vwb.m200311Y("更多场景引导资料 卡片 清理本地数据 : ", new d30() { // from class: l.cjc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58776d();
            }
        }));
        arrayList.add(vwb.m200311Y("更多场景引导资料 卡片 当前数据 : 可以留言数：" + m58905ij() + " 当天显示次数：" + itk.m138213m() + " 当前划卡数：" + CoreModule.f17545c.f19622Y0.f94258c.get() + " 上次在次划卡显示：" + itk.m138211k(), new d30() { // from class: l.ojc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59043p3();
            }
        }));
        arrayList.add(vwb.m200311Y("更多场景引导资料 卡片 当前数据 : 健身显示没有点击次数：" + itk.m138203c() + " 喝酒显示没有点击次数：" + itk.m138202b() + " 吸烟显示没有点击次数：" + itk.m138212l() + " 游戏显示没有点击次数：" + itk.m138205e(), new d30() { // from class: l.akc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58934k4();
            }
        }));
        arrayList.add(vwb.m200311Y("只看认证全量- 点击 认证弹框", new d30() { // from class: l.nkc
            @Override // p149l.d30
            public final void call() {
                psq.m171204T(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            }
        }));
        arrayList.add(vwb.m200311Y("只看认证全量- 划卡 认证弹框", new d30() { // from class: l.gac
            @Override // p149l.d30
            public final void call() {
                psq.m171207W(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            }
        }));
        arrayList.add(vwb.m200311Y("只看认证全量- 划卡 tips", new d30() { // from class: l.yec
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59179v7(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("首页优化改版- 调用直播引流接口", new d30() { // from class: l.qjc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19663m0.m31119k6().subscribe(mkd0.m154956H(new DebugUtil.C9142x1(), new e30() { // from class: l.jvc
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m59180v8((Throwable) obj);
                    }
                }));
            }
        }));
        arrayList.add(vwb.m200311Y("首页优化改版-show 筛选 tips", new d30() { // from class: l.ioc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58846g3(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("首页优化改版-show 快速右滑 弹框", new d30() { // from class: l.atc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58616Va(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("首页优化改版-实验强制打开" + CoreModule.f17545c.f19639e0.f149145B4.get(), new d30() { // from class: l.sxc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58418M1();
            }
        }));
        arrayList.add(vwb.m200311Y("首页优化改版-显示房主标签" + CoreModule.f17545c.f19639e0.f149138A4.get(), new d30() { // from class: l.k2d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59274ze();
            }
        }));
        arrayList.add(vwb.m200311Y("首页优化改版-显示直播标签" + CoreModule.f17545c.f19639e0.f149518z4.get(), new d30() { // from class: l.c7d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59217x1();
            }
        }));
        arrayList.add(vwb.m200311Y("首页优化改版-超级喜欢显示" + CoreModule.f17545c.f19639e0.f149504x4.get(), new d30() { // from class: l.ubd
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58827f6();
            }
        }));
        arrayList.add(vwb.m200311Y("首页优化改版-超级喜数显示数量" + CoreModule.f17545c.f19639e0.f149511y4.get(), new d30() { // from class: l.w9c
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58605V();
            }
        }));
        arrayList.add(vwb.m200311Y("首页优化改版-超级喜数显示数量111", new d30() { // from class: l.jac
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19639e0.f149511y4.put(1);
            }
        }));
        arrayList.add(vwb.m200311Y("生日选择", new d30() { // from class: l.vac
            @Override // p149l.d30
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC7866b.act().startActivity(new Intent(nt30Var.m161157T4(), (Class<?>) BirthdayVerifyAct.class));
            }
        }));
        arrayList.add(vwb.m200311Y("isFilterDistanceExpDebug_manualSetUpDistance:" + CoreModule.f17545c.f19639e0.f149477t5.get(), new d30() { // from class: l.hbc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58376K1();
            }
        }));
        arrayList.add(vwb.m200311Y("测试路由1 tantan://realpicVerify", new d30() { // from class: l.tbc
            @Override // p149l.d30
            public final void call() {
                lva.m151843D(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), Uri.parse("tantanapp://realpicVerify"));
            }
        }));
        arrayList.add(vwb.m200311Y("插入认证卡", new d30() { // from class: l.fcc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59219x3();
            }
        }));
        arrayList.add(vwb.m200311Y("测试路由2 tantan://profileEdit", new d30() { // from class: l.rcc
            @Override // p149l.d30
            public final void call() {
                lva.m151843D(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), Uri.parse("tantanapp://profileEdit"));
            }
        }));
        arrayList.add(vwb.m200311Y("婚恋消息优化:插入一条婚恋汇总会话", new d30() { // from class: l.ddc
            @Override // p149l.d30
            public final void call() {
                e51.m114774y(new DebugUtil.RunnableC9145y1());
            }
        }));
        arrayList.add(vwb.m200311Y("婚恋消息优化:删除全部汇总会话", new d30() { // from class: l.pdc
            @Override // p149l.d30
            public final void call() {
                e51.m114774y(new DebugUtil.RunnableC9072d2());
            }
        }));
        arrayList.add(vwb.m200311Y("启动优化标签时间:" + CoreModule.f17545c.f19639e0.f149290V4.get(), new d30() { // from class: l.dec
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59128t0();
            }
        }));
        arrayList.add(vwb.m200311Y("打开微信小程序界面", new d30() { // from class: l.pec
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58244E1(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("showCoinGuideDialog", new C9112n2(nt30Var)));
        arrayList.add(vwb.m200311Y("显示女性会员弹窗", new d30() { // from class: l.cfc
            @Override // p149l.d30
            public final void call() {
                new gei().m125810I(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            }
        }));
        arrayList.add(vwb.m200311Y("缘分雷达 清理气泡标记", new d30() { // from class: l.ofc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19683s2.f170715R.put(Boolean.FALSE);
            }
        }));
        arrayList.add(vwb.m200311Y("资料页改版 清理标签", new d30() { // from class: l.agc
            @Override // p149l.d30
            public final void call() {
                sa40.m182802o().m182825h();
            }
        }));
        arrayList.add(vwb.m200311Y("资料页改版 强制切换到改版" + CoreModule.f17545c.f19663m0.f19336F1.get(), new d30() { // from class: l.mgc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59066q4();
            }
        }));
        arrayList.add(vwb.m200311Y("ttt国际化资料页改版 强制切换到改版" + CoreModule.f17545c.f19663m0.f19339G1.get(), new d30() { // from class: l.ygc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58298Gb();
            }
        }));
        arrayList.add(vwb.m200311Y("ttt国际化首页划卡改版 首页划卡切换到改版" + CoreModule.f17545c.f19663m0.f19342H1.get(), new d30() { // from class: l.khc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58831fa();
            }
        }));
        arrayList.add(vwb.m200311Y("资料页改版 强制切换到改版旧版本" + CoreModule.f17545c.f19663m0.f19345I1.get(), new d30() { // from class: l.nhc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58630W3();
            }
        }));
        arrayList.add(vwb.m200311Y("资料页改版 一键配对:" + CoreModule.f17545c.f19639e0.f149346c5.get(), new d30() { // from class: l.ohc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58272F7();
            }
        }));
        arrayList.add(vwb.m200311Y("ideal type force enable:" + CoreModule.f17545c.f19663m0.f19348J1.get(), new d30() { // from class: l.phc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58395L();
            }
        }));
        arrayList.add(vwb.m200311Y("资料正反馈 弹框0", new d30() { // from class: l.qhc
            @Override // p149l.d30
            public final void call() {
                new opa0(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "").m165327K(1, new DebugUtil.C9101l());
            }
        }));
        arrayList.add(vwb.m200311Y("资料正反馈 弹框1", new d30() { // from class: l.shc
            @Override // p149l.d30
            public final void call() {
                new opa0(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "").m165327K(2, new DebugUtil.C9109n());
            }
        }));
        arrayList.add(vwb.m200311Y("资料正反馈 弹框2", new d30() { // from class: l.thc
            @Override // p149l.d30
            public final void call() {
                new opa0(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "").m165327K(3, new DebugUtil.C9113o());
            }
        }));
        arrayList.add(vwb.m200311Y("资料正反馈 弹框3", new d30() { // from class: l.uhc
            @Override // p149l.d30
            public final void call() {
                new opa0(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "").m165327K(4, new DebugUtil.C9116p());
            }
        }));
        arrayList.add(vwb.m200311Y("资料正反馈 弹框4", new d30() { // from class: l.vhc
            @Override // p149l.d30
            public final void call() {
                new opa0(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "").m165327K(5, new DebugUtil.C9119q());
            }
        }));
        arrayList.add(vwb.m200311Y("资料正反馈 清理广告卡标记", new d30() { // from class: l.whc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58553Sa();
            }
        }));
        arrayList.add(vwb.m200311Y("资料正反馈 插卡广告", new d30() { // from class: l.zhc
            @Override // p149l.d30
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC7866b.act().postDelayed(new Runnable() { // from class: l.tnc
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m58441N3();
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.m200311Y("盲盒二期_弹框动画", new d30() { // from class: l.aic
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58252E9(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("盲盒二期_即使聊天", new d30() { // from class: l.bic
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58749bg(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("盲盒二期_插入惊喜礼盒会话", new d30() { // from class: l.cic
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m33037lq(mqi0.m155944o());
            }
        }));
        arrayList.add(vwb.m200311Y("盲盒二期_删除惊喜礼盒会话", new d30() { // from class: l.dic
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m32576Af();
            }
        }));
        arrayList.add(vwb.m200311Y("盲盒二期_插入礼盒结束时间 2天", new d30() { // from class: l.fic
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19659k2.f184663Y.put(Long.valueOf(mqi0.m155944o() + 172800000));
            }
        }));
        arrayList.add(vwb.m200311Y("盲盒二期_插入礼盒结束时间 1分", new d30() { // from class: l.gic
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19659k2.f184663Y.put(Long.valueOf(mqi0.m155944o() + com.clevertap.android.sdk.Constants.ONE_MIN_IN_MILLIS));
            }
        }));
        arrayList.add(vwb.m200311Y("盲盒二期_清理礼盒结束时间", new d30() { // from class: l.hic
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19659k2.f184663Y.clear();
            }
        }));
        arrayList.add(vwb.m200311Y("盲盒二期_调用接口获取奖励弹框", new d30() { // from class: l.iic
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59075qd(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("盲盒_bubble", new d30() { // from class: l.kic
            @Override // p149l.d30
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC7866b.act().m39801Z5().m39960B0();
            }
        }));
        arrayList.add(vwb.m200311Y("盲盒_liked_user", new d30() { // from class: l.lic
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58870h5(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("盲盒_normal_user", new d30() { // from class: l.mic
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59277zh(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("盲盒_Boost", new d30() { // from class: l.nic
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58527R5(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("盲盒_Exposure", new d30() { // from class: l.oic
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59186ve(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("盲盒", new d30() { // from class: l.pic
            @Override // p149l.d30
            public final void call() {
                new y3h0(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).show();
            }
        }));
        arrayList.add(vwb.m200311Y("微信引导弹窗", new d30() { // from class: l.ric
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58996n0(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("CITY_TOP_GREETING", new d30() { // from class: l.sic
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58733b0(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("12M优惠券", new d30() { // from class: l.tic
            @Override // p149l.d30
            public final void call() {
                w6h0.m201818j().m201819f(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            }
        }));
        arrayList.add(vwb.m200311Y("划卡聊天室开关 = " + CoreModule.f17545c.f19663m0.f19458v1.get(), new d30() { // from class: l.vic
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59083r();
            }
        }));
        arrayList.add(vwb.m200311Y("黑钻测试", new d30() { // from class: l.wic
            @Override // p149l.d30
            public final void call() {
                C8456b.m47633l(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "", null);
            }
        }));
        arrayList.add(vwb.m200311Y("鉴权", new d30() { // from class: l.xic
            @Override // p149l.d30
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC7866b.act().duringCreated((C22306c) CoreModule.f17545c.f19594P0.m177886e3(zyc0.m220918j0() ? "1000002" : "1000003", "code", "user_mobile,user_profile", "", "").map(new w9j() { // from class: l.rmc
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return DebugUtil.m59131t3((OpenSdkCodeAuth) obj);
                    }
                })).subscribe(mkd0.m154956H(new npo(), new e30() { // from class: l.smc
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        osi0.m165783g("网络请求异常");
                    }
                }));
            }
        }));
        arrayList.add(vwb.m200311Y("打开美团 h5", new d30() { // from class: l.yic
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                i0e.m133795d(viewTreeObserverOnGlobalLayoutListenerC7866b2.act()).m133819I("美团h5").m133818H(DebugUtil.f38251a.get()).m133816F(new e30() { // from class: l.gtc
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m59004n8(viewTreeObserverOnGlobalLayoutListenerC7866b2, (String) obj);
                    }
                }).m133821n().show();
            }
        }));
        arrayList.add(vwb.m200311Y("真实头像认证弹窗", new d30() { // from class: l.zic
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58676Y7(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("真人实名认证弹窗", new d30() { // from class: l.ajc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58165Aa(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("真人活体认证弹窗-》国际化", new d30() { // from class: l.bjc
            @Override // p149l.d30
            public final void call() {
                bcp.INSTANCE.m101113q(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "need_person_verify");
            }
        }));
        arrayList.add(vwb.m200311Y("头像审核中弹窗", new d30() { // from class: l.djc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().startActivity(VerificationAct.m59464m2(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), 3, ""));
            }
        }));
        arrayList.add(vwb.m200311Y("实名审核中弹窗", new d30() { // from class: l.ejc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().startActivity(VerificationAct.m59464m2(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), 4, ""));
            }
        }));
        arrayList.add(vwb.m200311Y("取消实名认证", new d30() { // from class: l.gjc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19585M0.m129480d3("fromNameVerificationDlg");
            }
        }));
        arrayList.add(vwb.m200311Y("取消头像认证", new d30() { // from class: l.hjc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19552B0.m31593Q3(CoreModule.m29931H().userId(), "fromPicVerificationDlg");
            }
        }));
        arrayList.add(vwb.m200311Y("引导上传生活照", new d30() { // from class: l.ijc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58231Da(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("MK Bridge测试", new d30() { // from class: l.jjc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().startActivity(MkWebViewAct.m80237b2(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), "", "https://m.staging2.p1staff.com/fep/tantan/frontend/tantan-js-bridge/index.html?_bid=1002620#/", true));
            }
        }));
        arrayList.add(vwb.m200311Y("测试跳转MkWebview页面", new d30() { // from class: l.kjc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                i0e.m133795d(viewTreeObserverOnGlobalLayoutListenerC7866b2.act()).m133819I("跳转MkWebview页面").m133815E(1).m133814D(300).m133816F(new e30() { // from class: l.hwc
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b3 = viewTreeObserverOnGlobalLayoutListenerC7866b2;
                        viewTreeObserverOnGlobalLayoutListenerC7866b3.act().startActivity(MkWebViewAct.m80241g2(viewTreeObserverOnGlobalLayoutListenerC7866b3.act(), true, "", (String) obj));
                    }
                }).m133821n().show();
            }
        }));
        arrayList.add(vwb.m200311Y("跳转主题答题页面", new d30() { // from class: l.ljc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().startActivity(lva.m151840A(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), null, "https://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-static-pages-fep/src/apps/material-access/index.html?speed=true&_bid=1002757&type=theme#/questionnaire", true, false, true));
            }
        }));
        arrayList.add(vwb.m200311Y("添加小组件", new d30() { // from class: l.mjc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58422M5();
            }
        }));
        arrayList.add(vwb.m200311Y("照片上传引导关闭 = " + lra0.f129526n0.get(), new d30() { // from class: l.njc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58864h();
            }
        }));
        arrayList.add(vwb.m200311Y(" 重置动态打招呼接收消息状态引导气泡", new d30() { // from class: l.pjc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19678r0.f20011R.put(Boolean.FALSE);
            }
        }));
        arrayList.add(vwb.m200311Y("进入动态打招呼列表", new d30() { // from class: l.rjc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().startActivity(DynamicGreetListAct.m36454V1(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), null));
            }
        }));
        arrayList.add(vwb.m200311Y("右滑引导", new d30() { // from class: l.sjc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58277Fc(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("左滑引导", new d30() { // from class: l.tjc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58217Ci(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("禁止切卡功能：" + lra0.f129509f.get(), new d30() { // from class: l.ujc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58529R7();
            }
        }));
        arrayList.add(vwb.m200311Y("FragInitializeStep", new d30() { // from class: l.vjc
            @Override // p149l.d30
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC7866b.act().dialog().m20535e0(vwb.m200324f0("Create", "Start", "Resume")).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.rkc
                    @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
                    /* JADX INFO: renamed from: a */
                    public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                        DebugUtil.m58649X1(dialog, view, i, charSequence);
                    }
                }).m20568z0();
            }
        }));
        arrayList.add(vwb.m200311Y("设置聊天引导等候时间", new d30() { // from class: l.wjc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58611V5(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("卡片清晰度优化", new d30() { // from class: l.xjc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58608V2(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("站内Push", new d30() { // from class: l.yjc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58177B0(nt30Var, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("新配对动效Debug开关：" + a5x.f67732b.get(), new d30() { // from class: l.zjc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58526R4();
            }
        }));
        arrayList.add(vwb.m200311Y("插入广告卡片 position 3", new d30() { // from class: l.ckc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59243y5();
            }
        }));
        arrayList.add(vwb.m200311Y("插入广告卡片 position 1", new d30() { // from class: l.dkc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58438N0();
            }
        }));
        arrayList.add(vwb.m200311Y("插入广告卡片 position 0", new d30() { // from class: l.ekc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59008nc();
            }
        }));
        arrayList.add(vwb.m200311Y("插入广告卡片书影剧httpdata position 0", new d30() { // from class: l.fkc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59017o();
            }
        }));
        arrayList.add(vwb.m200311Y("插入 boost position 3", new d30() { // from class: l.gkc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58406La();
            }
        }));
        arrayList.add(vwb.m200311Y("插入书影剧三期运营卡片 position 0", new d30() { // from class: l.hkc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58806e7();
            }
        }));
        arrayList.add(vwb.m200311Y("消息推送权限弹窗", new d30() { // from class: l.ikc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                nt30 nt30Var2 = nt30Var;
                uq40.m194956F(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), new d30() { // from class: l.pnc
                    @Override // p149l.d30
                    public final void call() {
                        nt30Var2.m161182Y4();
                    }
                }, new d30() { // from class: l.qnc
                    @Override // p149l.d30
                    public final void call() {
                        DebugUtil.m59119sd(nt30Var2);
                    }
                });
            }
        }));
        arrayList.add(vwb.m200311Y("Mock配对页", new d30() { // from class: l.jkc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58657X9(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("切换白色主题", new d30() { // from class: l.kkc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58783d6();
            }
        }));
        arrayList.add(0, vwb.m200311Y("DIALOGS AT HOME ", new d30() { // from class: l.lkc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58813ee(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("展示顶部弹窗", new d30() { // from class: l.rdc
            @Override // p149l.d30
            public final void call() {
                abi.m95622J(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), CoreModule.f17545c.f19639e0.m169527p9());
            }
        }));
        arrayList.add(vwb.m200311Y("show radar", new d30() { // from class: l.yhc
            @Override // p149l.d30
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC7866b.m37184L5(true, false);
            }
        }));
        arrayList.add(vwb.m200311Y("show radar", new d30() { // from class: l.fmc
            @Override // p149l.d30
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC7866b.m37184L5(true, false);
            }
        }));
        arrayList.add(vwb.m200311Y("show toast top!!!!!", new d30() { // from class: l.mqc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                lsi0.m151570H(viewTreeObserverOnGlobalLayoutListenerC7866b2.act().getResources().getString(R$string.f18281Xo), viewTreeObserverOnGlobalLayoutListenerC7866b2.act().getResources().getDrawable(x2c0.f189243Cp), viewTreeObserverOnGlobalLayoutListenerC7866b2.act().getResources().getDrawable(x2c0.f190662vr));
            }
        }));
        arrayList.add(vwb.m200311Y("knowme", new d30() { // from class: l.tuc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().startActivity(BusinessWebViewAct.m43532X1(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), "aaa", 1L, "http://m-test.kanjianxinli.com/ceping/index.html#/?channelId=281", "webview_load_type_knowme"));
            }
        }));
        if (viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2().mo38809d() != null && viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2().mo38813j() != null) {
            final String str = viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2().mo38813j().f19472id;
            arrayList.add(vwb.m200311Y("make first user superlike me", new d30() { // from class: l.azc
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.m58982m8(str, viewTreeObserverOnGlobalLayoutListenerC7866b);
                }
            }));
            arrayList.add(vwb.m200311Y("make first user like me", new d30() { // from class: l.h3d
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.m58550S7(str);
                }
            }));
            arrayList.add(vwb.m200311Y("make first user invite me", new d30() { // from class: l.o7d
                @Override // p149l.d30
                public final void call() {
                    CoreModule.f17545c.f19552B0.m31598V3(CoreModule.m29931H().userId(), str);
                }
            }));
            arrayList.add(vwb.m200311Y("重置优惠卷重构 svip大页面", new d30() { // from class: l.vbd
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.m58773ci();
                }
            }));
            arrayList.add(vwb.m200311Y("匿名打招呼", new d30() { // from class: l.v9c
                @Override // p149l.d30
                public final void call() {
                    CoreModule.m29932K().mo30816s0(nt30Var.m161157T4(), str);
                }
            }));
            arrayList.add(vwb.m200311Y("[男用户未消耗like限时出现]", new d30() { // from class: l.rac
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.m59110s4(str);
                }
            }));
            arrayList.add(vwb.m200311Y("[打开关闭男用户的like开关：]" + CoreModule.f17545c.f19642f0.f19935f1.get(), new d30() { // from class: l.cbc
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.m58916j8();
                }
            }));
            arrayList.add(vwb.m200311Y("make users like me", new d30() { // from class: l.nbc
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.m58280Ff();
                }
            }));
            arrayList.add(vwb.m200311Y("make first user diamond received like me", new d30() { // from class: l.ybc
                @Override // p149l.d30
                public final void call() {
                    DebugUtil.m58355J2(str);
                }
            }));
            arrayList.add(vwb.m200311Y("make first user like me delay 5s", new d30() { // from class: l.jcc
                @Override // p149l.d30
                public final void call() {
                    e51.m114744I(viewTreeObserverOnGlobalLayoutListenerC7866b.m37341q2(), new Runnable() { // from class: l.ysc
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4759y.m34900h3(str).materialize().subscribe();
                        }
                    }, com.clevertap.android.sdk.Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
                }
            }));
            arrayList.add(vwb.m200311Y("show user id", new d30() { // from class: l.ucc
                @Override // p149l.d30
                public final void call() {
                    viewTreeObserverOnGlobalLayoutListenerC7866b.act().dialog().m20507G0("user id").m20504F(CoreModule.m29931H().userId()).m20567z().show();
                }
            }));
            arrayList.add(vwb.m200311Y("boost guide", new d30() { // from class: l.fdc
                @Override // p149l.d30
                public final void call() {
                    viewTreeObserverOnGlobalLayoutListenerC7866b.act().dialog().m20507G0("boost_peak_guide_switch").m20504F(u59.f174674n).m20567z().show();
                }
            }));
            arrayList.add(vwb.m200311Y("match user with inputed id", new d30() { // from class: l.qdc
                @Override // p149l.d30
                public final void call() {
                    i0e.m133795d(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m133814D(10).m133825r("input the user id you like").m133816F(new e30() { // from class: l.lxc
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            C4759y.m34902j3((String) obj).subscribe();
                        }
                    }).m133821n().show();
                }
            }));
        }
        arrayList.add(vwb.m200311Y("show alert toast in 5 secs", new d30() { // from class: l.cec
            @Override // p149l.d30
            public final void call() {
                e51.m114744I(viewTreeObserverOnGlobalLayoutListenerC7866b.m37341q2(), new Runnable() { // from class: l.ukc
                    @Override // java.lang.Runnable
                    public final void run() {
                        lsi0.m151580j("test");
                    }
                }, com.clevertap.android.sdk.Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
            }
        }));
        arrayList.add(vwb.m200311Y("show alert toast in 5 secs (background)", new d30() { // from class: l.nec
            @Override // p149l.d30
            public final void call() {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: l.koc
                    @Override // java.lang.Runnable
                    public final void run() {
                        lsi0.m151580j("test background");
                    }
                }, com.clevertap.android.sdk.Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
            }
        }));
        arrayList.add(vwb.m200311Y("clear init file cache", new d30() { // from class: l.jfc
            @Override // p149l.d30
            public final void call() {
                ggi.m125964d();
            }
        }));
        arrayList.add(vwb.m200311Y("toggle debug server unavailable", new d30() { // from class: l.ufc
            @Override // p149l.d30
            public final void call() {
                Network.debug_fakeServerUnavailable = !Network.debug_fakeServerUnavailable;
            }
        }));
        arrayList.add(vwb.m200311Y("delete crushes", new d30() { // from class: l.fgc
            @Override // p149l.d30
            public final void call() {
                ap7.m98031c3().subscribe();
            }
        }));
        arrayList.add(vwb.m200311Y("Open Instagram like  Media picker", new d30() { // from class: l.qgc
            @Override // p149l.d30
            public final void call() {
                CoreModule.m29934N().startInstaLikePickerAct(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            }
        }));
        arrayList.add(vwb.m200311Y("认证相关DebugItem", new d30() { // from class: l.bhc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58501Q0(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("插入聊天消息", new d30() { // from class: l.mhc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58805e6(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("首页切换动画DebugItem", new d30() { // from class: l.xhc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58471Oc(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("划卡速DebugItem", new d30() { // from class: l.jic
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58851g8(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("真人认证：模拟bad token = " + swk0.f166701a, new d30() { // from class: l.uic
            @Override // p149l.d30
            public final void call() {
                swk0.m186331g();
            }
        }));
        arrayList.add(vwb.m200311Y("插入广告卡 ", new d30() { // from class: l.fjc
            @Override // p149l.d30
            public final void call() {
                u0n.m191354m();
            }
        }));
        arrayList.add(vwb.m200311Y("开启 Ad ", new d30() { // from class: l.bkc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58801e2();
            }
        }));
        arrayList.add(vwb.m200311Y("ad： 1:1 ", new d30() { // from class: l.mkc
            @Override // p149l.d30
            public final void call() {
                u0n.f172926b = 1.0f;
            }
        }));
        arrayList.add(vwb.m200311Y("ad：16:9 ", new d30() { // from class: l.xkc
            @Override // p149l.d30
            public final void call() {
                u0n.f172926b = 1.7777778f;
            }
        }));
        arrayList.add(vwb.m200311Y("ad:9:16 ", new d30() { // from class: l.ilc
            @Override // p149l.d30
            public final void call() {
                u0n.f172926b = 0.5625f;
            }
        }));
        arrayList.add(vwb.m200311Y("ad:4:3 ", new d30() { // from class: l.tlc
            @Override // p149l.d30
            public final void call() {
                u0n.f172926b = 1.3333334f;
            }
        }));
        arrayList.add(vwb.m200311Y("ad:3:4", new d30() { // from class: l.emc
            @Override // p149l.d30
            public final void call() {
                u0n.f172926b = 0.75f;
            }
        }));
        arrayList.add(vwb.m200311Y("ad:1.91:1 ", new d30() { // from class: l.qmc
            @Override // p149l.d30
            public final void call() {
                u0n.f172926b = 1.91f;
            }
        }));
        arrayList.add(vwb.m200311Y("国际化特权周期", new d30() { // from class: l.bnc
            @Override // p149l.d30
            public final void call() {
                i0e.m133795d(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m133819I("特权时长day").m133815E(1).m133814D(80).m133825r("day").m133816F(new e30() { // from class: l.ixc
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        C8758a.INSTANCE.m53203b(Integer.valueOf((String) obj).intValue());
                    }
                }).m133821n().show();
            }
        }));
        arrayList.add(vwb.m200311Y("国际化特权到期时间", new d30() { // from class: l.mnc
            @Override // p149l.d30
            public final void call() {
                i0e.m133795d(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m133819I("设置到期时间毫秒").m133825r("毫秒").m133815E(1).m133814D(80).m133825r(mu5.f135733a.get()).m133818H(mu5.f135733a.get()).m133816F(new e30() { // from class: l.cxc
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        C8758a.INSTANCE.m53202a(Long.valueOf((String) obj).longValue());
                    }
                }).m133821n().show();
            }
        }));
        StringBuilder sb = new StringBuilder("主播清晰度优化： ");
        CoreSuggested coreSuggested = CoreModule.f17545c.f19663m0;
        sb.append(coreSuggested.f19396a2.containsKey(coreSuggested.m31137q6()));
        arrayList.add(vwb.m200311Y(sb.toString(), new d30() { // from class: l.xnc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58354J1();
            }
        }));
        arrayList.add(vwb.m200311Y("设置turbo guide 位置3", new d30() { // from class: l.toc
            @Override // p149l.d30
            public final void call() {
                g83.m124742e();
            }
        }));
        arrayList.add(vwb.m200311Y("设置superlike guide 位置6", new d30() { // from class: l.epc
            @Override // p149l.d30
            public final void call() {
                rxg0.m181564N();
            }
        }));
        arrayList.add(vwb.m200311Y("特殊喜欢dlg", new d30() { // from class: l.ppc
            @Override // p149l.d30
            public final void call() {
                CoreDlg.m45057d2(CoreModule.f17545c.f19639e0.m169527p9(), viewTreeObserverOnGlobalLayoutListenerC7866b.act(), null, null);
            }
        }));
        arrayList.add(vwb.m200311Y("男性用户插卡新样式", new d30() { // from class: l.aqc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59165uf();
            }
        }));
        arrayList.add(vwb.m200311Y("zb直播状态-连线中", new d30() { // from class: l.lqc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58444N6();
            }
        }));
        arrayList.add(vwb.m200311Y("zb直播状态-会话列表", new d30() { // from class: l.xqc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59218x2(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("收到Push喜欢debugItems", new d30() { // from class: l.irc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59262z2(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("探探认证相关debugItems", new d30() { // from class: l.trc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58954l2(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("定位相关debugItems", new d30() { // from class: l.esc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58179B2(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("new user see pop in card", new d30() { // from class: l.psc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58668Y(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("fake视频闪聊", new d30() { // from class: l.ltc
            @Override // p149l.d30
            public final void call() {
                tqm0.m190131p().m190136h(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "143023", "voiceQuickChat");
            }
        }));
        arrayList.add(vwb.m200311Y("LocalVariable", new d30() { // from class: l.wtc
            @Override // p149l.d30
            public final void call() {
                Objects.toString(ic50.m135327j().m135341o().m108955a("me.avatar").get());
            }
        }));
        arrayList.add(vwb.m200311Y("show fake dlg", new d30() { // from class: l.huc
            @Override // p149l.d30
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC7866b.act().postDelayed(new Runnable() { // from class: l.onc
                    @Override // java.lang.Runnable
                    public final void run() {
                        cxf.m109094f().m109098h(CoreModule.f17545c.f19639e0.m169527p9());
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.m200311Y("取消认证弹窗", new d30() { // from class: l.suc
            @Override // p149l.d30
            public final void call() {
                CoreDlg.m45097r1(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            }
        }));
        arrayList.add(vwb.m200311Y("letterSendPanel", new d30() { // from class: l.evc
            @Override // p149l.d30
            public final void call() {
                lrb.m151154f().m151163m(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), CoreModule.f17545c.f19639e0.m169527p9(), new DebugUtil.C9131u());
            }
        }));
        arrayList.add(vwb.m200311Y("letterSendPanelintl", new d30() { // from class: l.pvc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                nt30 nt30Var2 = nt30Var;
                CoreDlg.m45029U1(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), viewTreeObserverOnGlobalLayoutListenerC7866b2.m37125A2().mo38818o().m141745d(), new e30() { // from class: l.vsc
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m59261z1(nt30Var2, viewTreeObserverOnGlobalLayoutListenerC7866b2, (String) obj);
                    }
                }, new d30() { // from class: l.wsc
                    @Override // p149l.d30
                    public final void call() {
                        nt30Var2.m161233i9(true);
                    }
                });
            }
        }));
        arrayList.add(vwb.m200311Y("fake更换性别", new d30() { // from class: l.awc
            @Override // p149l.d30
            public final void call() {
                myf.m157040T(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), new Runnable() { // from class: l.rnc
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m59211wh();
                    }
                });
            }
        }));
        arrayList.add(vwb.m200311Y("show one id", new d30() { // from class: l.lwc
            @Override // p149l.d30
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC7866b.act().dialog().m20507G0("one id").m20504F(sh50.m184159d()).m20567z().show();
            }
        }));
        arrayList.add(vwb.m200311Y("go to appeal loading", new d30() { // from class: l.wwc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().startActivity(AppealProgressAct.m36171Y1(viewTreeObserverOnGlobalLayoutListenerC7866b2.act()));
            }
        }));
        arrayList.add(vwb.m200311Y("语音闪聊loading", new d30() { // from class: l.hxc
            @Override // p149l.d30
            public final void call() {
                CoreModule.m29932K().mo30762em(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "", "");
            }
        }));
        arrayList.add(vwb.m200311Y("isCardSwipeGuideEnable:" + lra0.f129531r.get(), new d30() { // from class: l.dyc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58234Dd();
            }
        }));
        arrayList.add(vwb.m200311Y("红包动画延长10x:" + C4758x.f20136R.get(), new d30() { // from class: l.oyc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59041p1();
            }
        }));
        arrayList.add(vwb.m200311Y("红包动画一直展示:" + C4758x.f20137S.get(), new d30() { // from class: l.zyc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58484P4();
            }
        }));
        arrayList.add(vwb.m200311Y("isCardSwipe,reset all guide", new d30() { // from class: l.lzc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59046p6();
            }
        }));
        arrayList.add(vwb.m200311Y("isProrileVerExp1:" + lra0.f129537x.get(), new d30() { // from class: l.wzc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59042p2();
            }
        }));
        arrayList.add(vwb.m200311Y("isProrileVerExp2:" + lra0.f129538y.get(), new d30() { // from class: l.h0d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59161ub();
            }
        }));
        arrayList.add(vwb.m200311Y("isProrileVer clean:" + lra0.f129538y.get(), new d30() { // from class: l.s0d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58995n();
            }
        }));
        arrayList.add(vwb.m200311Y("延长profile切tab时间:5秒", new d30() { // from class: l.d1d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58858gf();
            }
        }));
        arrayList.add(vwb.m200311Y("延长profile切tab时间:10秒", new d30() { // from class: l.o1d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58633W6();
            }
        }));
        arrayList.add(vwb.m200311Y("延长profile切tab时间:默认", new d30() { // from class: l.z1d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58253Ea();
            }
        }));
        arrayList.add(vwb.m200311Y("清除划卡按钮提示", new d30() { // from class: l.v2d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59244y6();
            }
        }));
        arrayList.add(vwb.m200311Y("显示所有认证图标-profile:" + lra0.f129527o.get(), new d30() { // from class: l.g3d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58721aa();
            }
        }));
        arrayList.add(vwb.m200311Y("动态基建：实验 = " + lra0.f129496X.get(), new d30() { // from class: l.s3d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58629W2();
            }
        }));
        arrayList.add(vwb.m200311Y("禁言申诉实验：强制弹滑块 = " + lra0.f129488P.get(), new d30() { // from class: l.d4d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58957l5();
            }
        }));
        arrayList.add(vwb.m200311Y("禁言申诉实验：强制数美1 = " + lra0.f129489Q.get(), new d30() { // from class: l.o4d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58567T3();
            }
        }));
        arrayList.add(vwb.m200311Y("动态外露：profile展示脱单中 = " + lra0.f129494V.get(), new d30() { // from class: l.z4d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58530R8();
            }
        }));
        arrayList.add(vwb.m200311Y("动态外露：profile展示superlike = " + lra0.f129493U.get(), new d30() { // from class: l.k5d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58454Ng();
            }
        }));
        arrayList.add(vwb.m200311Y("动态外露：动态文案过长 = " + lra0.f129495W.get(), new d30() { // from class: l.v5d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58487P7();
            }
        }));
        arrayList.add(vwb.m200311Y("丰富资料：实验入组 = " + lra0.f129486N.get(), new d30() { // from class: l.g6d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58903ih();
            }
        }));
        arrayList.add(vwb.m200311Y("丰富资料：展示红点(特邀嘉宾聊天框) = " + CoreModule.f17545c.f19642f0.f19917Z0.get(), new d30() { // from class: l.r6d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59140tc();
            }
        }));
        arrayList.add(vwb.m200311Y("年龄过大 超过100岁:" + lra0.f129485M.get(), new d30() { // from class: l.n7d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58303Gg();
            }
        }));
        arrayList.add(vwb.m200311Y("破冰实验开关:" + r9m.f158389i.get(), new d30() { // from class: l.z7d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59251yd();
            }
        }));
        arrayList.add(vwb.m200311Y("破冰实验，弹框一定展示:" + r9m.f158390j.get(), new d30() { // from class: l.k8d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58651X3();
            }
        }));
        arrayList.add(vwb.m200311Y("破冰实验，清除破冰时间", new d30() { // from class: l.v8d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58502Q1();
            }
        }));
        arrayList.add(vwb.m200311Y("引导用户开启push实验 = " + lra0.f129482J.get(), new d30() { // from class: l.g9d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59010ne();
            }
        }));
        arrayList.add(vwb.m200311Y("引导用户push的dialog:", new d30() { // from class: l.r9d
            @Override // p149l.d30
            public final void call() {
                uq40.m194957G(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), true);
            }
        }));
        arrayList.add(vwb.m200311Y("引导用户push的dialog(多次):", new d30() { // from class: l.cad
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59132t4(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("引导用户，重置列表header弹出次数：", new d30() { // from class: l.nad
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58549S6();
            }
        }));
        arrayList.add(vwb.m200311Y("强制开启直播间和语音房功能= " + App.f15381q.get(), new d30() { // from class: l.yad
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58221D0();
            }
        }));
        arrayList.add(vwb.m200311Y("聊天破冰：新配对 有策略= " + f38252b.get(), new d30() { // from class: l.jbd
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58757c2();
            }
        }));
        arrayList.add(vwb.m200311Y("聊天破冰：新配对 无策略= " + f38253c.get(), new d30() { // from class: l.a9c
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58820f();
            }
        }));
        arrayList.add(vwb.m200311Y("聊天破冰：新配对 关闭弹框本地值清空", new d30() { // from class: l.l9c
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19639e0.f149493w0.put(Boolean.FALSE);
            }
        }));
        arrayList.add(vwb.m200311Y("聊天破冰：新配对 最大数量限制：5", new d30() { // from class: l.n9c
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19639e0.f149500x0.put(5);
            }
        }));
        arrayList.add(vwb.m200311Y("聊天破冰：新配对 最大数量限制：10", new d30() { // from class: l.o9c
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19639e0.f149500x0.put(10);
            }
        }));
        arrayList.add(vwb.m200311Y("聊天破冰：新配对 最大数量限制：20", new d30() { // from class: l.p9c
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19639e0.f149500x0.put(20);
            }
        }));
        arrayList.add(vwb.m200311Y("聊天破冰：新配对 最大数量限制：100", new d30() { // from class: l.q9c
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19639e0.f149500x0.put(100);
            }
        }));
        arrayList.add(vwb.m200311Y("好友上线弹窗", new C9134v(viewTreeObserverOnGlobalLayoutListenerC7866b)));
        arrayList.add(vwb.m200311Y("女性召回", new C9137w(viewTreeObserverOnGlobalLayoutListenerC7866b)));
        arrayList.add(vwb.m200311Y("新卡片切卡：profile昵称过长 = " + lra0.f129483K.get(), new d30() { // from class: l.r9c
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59181v9();
            }
        }));
        arrayList.add(vwb.m200311Y("新卡片切卡：profile展示头像审核失败 = " + lra0.f129484L.get(), new d30() { // from class: l.s9c
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58974m0();
            }
        }));
        arrayList.add(vwb.m200311Y("新卡片切卡：profile重置蒙层引导 = " + lra0.f129487O.get(), new d30() { // from class: l.t9c
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58980m6();
            }
        }));
        arrayList.add(vwb.m200311Y("新卡片切卡：profile抢先表白 = " + lra0.f129500a0.get(), new d30() { // from class: l.u9c
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59266z6();
            }
        }));
        arrayList.add(vwb.m200311Y("新卡片切卡：profile开启直播 = " + lra0.f129502b0.get(), new d30() { // from class: l.y9c
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58522R0();
            }
        }));
        arrayList.add(vwb.m200311Y("新卡片切卡：profile关闭直播 = " + lra0.f129504c0.get(), new d30() { // from class: l.z9c
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58770cf();
            }
        }));
        arrayList.add(vwb.m200311Y("新卡片切卡：profile语音直播 = " + lra0.f129506d0.get(), new d30() { // from class: l.aac
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58842g();
            }
        }));
        arrayList.add(vwb.m200311Y("新卡片切卡：profile视频直播 = " + lra0.f129508e0.get(), new d30() { // from class: l.bac
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58255Ec();
            }
        }));
        arrayList.add(vwb.m200311Y("新卡片切卡：profile双直播样式 = " + lra0.f129510f0.get(), new d30() { // from class: l.cac
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58332I1();
            }
        }));
        arrayList.add(vwb.m200311Y("新卡片切卡：profile sueprlike动画 = " + lra0.f129490R.get(), new d30() { // from class: l.dac
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58486P6();
            }
        }));
        arrayList.add(vwb.m200311Y("新卡片切卡：profile 国际化私信样式 = " + lra0.f129491S.get(), new d30() { // from class: l.eac
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59021o3();
            }
        }));
        arrayList.add(vwb.m200311Y("新卡片切卡：切卡+关于我 = " + lra0.f129474B.get(), new d30() { // from class: l.fac
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58156A1();
            }
        }));
        arrayList.add(vwb.m200311Y("新卡片切卡：控制组 = " + lra0.f129475C.get(), new d30() { // from class: l.hac
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58900id();
            }
        }));
        arrayList.add(vwb.m200311Y("新卡片切卡：清除入组", new d30() { // from class: l.iac
            @Override // p149l.d30
            public final void call() {
                lra0.f129474B.put(Boolean.FALSE);
            }
        }));
        arrayList.add(vwb.m200311Y("新卡片切卡：显示所有tag:" + lra0.f129476D.get(), new d30() { // from class: l.kac
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58342Ib();
            }
        }));
        arrayList.add(vwb.m200311Y("新卡片切卡：显示首张视频:" + lra0.f129477E.get(), new d30() { // from class: l.lac
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58299Gc();
            }
        }));
        arrayList.add(vwb.m200311Y("新卡片切卡：显示擦肩而过tag:" + lra0.f129478F.get(), new d30() { // from class: l.mac
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59268z8();
            }
        }));
        arrayList.add(vwb.m200311Y("新卡片切卡： 隐藏擦肩而过tag:" + lra0.f129479G.get(), new d30() { // from class: l.nac
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58684Yf();
            }
        }));
        arrayList.add(vwb.m200311Y("新卡片切卡：显示profile可点击区域:" + lra0.f129480H.get(), new d30() { // from class: l.oac
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58614V8();
            }
        }));
        arrayList.add(vwb.m200311Y("新卡片切卡：进profile就能显示蒙层:" + lra0.f129481I.get(), new d30() { // from class: l.pac
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58367Je();
            }
        }));
        arrayList.add(vwb.m200311Y("ui优化0:", new d30() { // from class: l.qac
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59076qe(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("ui优化1:", new d30() { // from class: l.sac
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59153u3(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("ui优化2:", new d30() { // from class: l.tac
            @Override // p149l.d30
            public final void call() {
                ke7.m145732o().m145737A(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "3x");
            }
        }));
        arrayList.add(vwb.m200311Y("ui优化3:", new d30() { // from class: l.uac
            @Override // p149l.d30
            public final void call() {
                ke7.m145732o().m145738B(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            }
        }));
        arrayList.add(vwb.m200311Y("ui优化4:", new d30() { // from class: l.wac
            @Override // p149l.d30
            public final void call() {
                ke7.m145732o().m145739C(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "我的测试", CoreModule.f17545c.f19639e0.m169527p9().picture(0).profileSmall().formatted(), new d30() { // from class: l.zsc
                    @Override // p149l.d30
                    public final void call() {
                        DebugUtil.m58222D1();
                    }
                });
            }
        }));
        arrayList.add(vwb.m200311Y("全量卡片非切卡 - profile全量 - 控制组:" + lra0.f129525n.get(), new d30() { // from class: l.xac
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58431Me();
            }
        }));
        arrayList.add(vwb.m200311Y("标签 - 动态标签在线:" + lra0.f129514h0.get(), new d30() { // from class: l.yac
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58694Z4();
            }
        }));
        arrayList.add(vwb.m200311Y("标签 - 动态标签国家:" + lra0.f129516i0.get(), new d30() { // from class: l.zac
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58178B1();
            }
        }));
        arrayList.add(vwb.m200311Y("标签 - 标签擦肩而过:" + lra0.f129518j0.get(), new d30() { // from class: l.abc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58282Fh();
            }
        }));
        arrayList.add(vwb.m200311Y("标签 - 标签纯文案:" + lra0.f129520k0.get(), new d30() { // from class: l.bbc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58896i9();
            }
        }));
        arrayList.add(vwb.m200311Y("标签 - 漫游用户标签:" + lra0.f129522l0.get(), new d30() { // from class: l.dbc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59050pa();
            }
        }));
        arrayList.add(vwb.m200311Y("标签 - 朋友圈:" + lra0.f129524m0.get(), new d30() { // from class: l.ebc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59040p0();
            }
        }));
        arrayList.add(vwb.m200311Y("full card 优化", new d30() { // from class: l.fbc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58740b7(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("看看打招呼入口 显示未读", new d30() { // from class: l.gbc
            @Override // p149l.d30
            public final void call() {
                e51.m114774y(new Runnable() { // from class: l.bmc
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m58893i6();
                    }
                });
            }
        }));
        arrayList.add(vwb.m200311Y("看看打招呼入口 显示消息", new d30() { // from class: l.ibc
            @Override // p149l.d30
            public final void call() {
                e51.m114774y(new Runnable() { // from class: l.cmc
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m59049p9();
                    }
                });
            }
        }));
        arrayList.add(vwb.m200311Y("看看打招呼入口 显示空白", new d30() { // from class: l.jbc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58379K4();
            }
        }));
        arrayList.add(vwb.m200311Y("反诈骗提醒1", new d30() { // from class: l.kbc
            @Override // p149l.d30
            public final void call() {
                ark.m98447S0(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), false);
            }
        }));
        arrayList.add(vwb.m200311Y("反诈骗提醒2", new d30() { // from class: l.lbc
            @Override // p149l.d30
            public final void call() {
                CoreDlg.m45026T1(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            }
        }));
        arrayList.add(vwb.m200311Y("反诈骗提醒3", new d30() { // from class: l.mbc
            @Override // p149l.d30
            public final void call() {
                CoreDlg.m45023S1(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), false);
            }
        }));
        arrayList.add(vwb.m200311Y("new fake", new d30() { // from class: l.obc
            @Override // p149l.d30
            public final void call() {
                wm20.m203973m(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            }
        }));
        arrayList.add(vwb.m200311Y("语音通话相关", new d30() { // from class: l.pbc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58703Zd(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("新喜欢弹窗", new d30() { // from class: l.qbc
            @Override // p149l.d30
            public final void call() {
                NewLikeView.m54991E(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), CoreLikers.C4719a.m30497a(CoreLikers.LikersTriggerBy.normal, 1, 1, vwb.m200324f0(CoreModule.m29932K().me_()), null, null, null), new d30() { // from class: l.amc
                    @Override // p149l.d30
                    public final void call() {
                        lsi0.m151595y("show  see  dialog");
                    }
                });
            }
        }));
        arrayList.add(vwb.m200311Y("国际化SVIP", new d30() { // from class: l.rbc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().dialog().m20535e0(vwb.m200324f0("查看喜欢我的人", "清除svip红点记录", "SVIPIntlGuideAct")).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.lvc
                    @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
                    /* JADX INFO: renamed from: a */
                    public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                        DebugUtil.m58786d9(viewTreeObserverOnGlobalLayoutListenerC7866b2, dialog, view, i, charSequence);
                    }
                }).m20568z0();
            }
        }));
        arrayList.add(vwb.m200311Y("mock first user supper like Me ", new d30() { // from class: l.sbc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58284Fj(new DebugUtil.C9140x(), 1);
            }
        }));
        arrayList.add(vwb.m200311Y("mock first user supper like Me And Has Letter", new d30() { // from class: l.ubc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58284Fj(new DebugUtil.C9143y(), 1);
            }
        }));
        arrayList.add(vwb.m200311Y("mock user passby 10", new d30() { // from class: l.vbc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58284Fj(new DebugUtil.C9146z(), 1);
            }
        }));
        arrayList.add(vwb.m200311Y("mock user is student mock前3张卡片用户学生认证", new d30() { // from class: l.wbc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58284Fj(new e30() { // from class: l.loc
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m58579Tf((User) obj);
                    }
                }, 3);
            }
        }));
        arrayList.add(vwb.m200311Y("mock user  前3张卡用户名字超长", new d30() { // from class: l.xbc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58284Fj(new e30() { // from class: l.htc
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m58224D3((User) obj);
                    }
                }, 3);
            }
        }));
        arrayList.add(vwb.m200311Y("mock user has all tag mock前3张卡片用户有所有标签(不包含朋友圈)", new d30() { // from class: l.zbc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58284Fj(new e30() { // from class: l.nwc
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m58384K9((User) obj);
                    }
                }, 3);
            }
        }));
        arrayList.add(vwb.m200311Y("mock user 共同联系人 2", new d30() { // from class: l.acc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58284Fj(new DebugUtil.C9058a0(), 2);
            }
        }));
        arrayList.add(vwb.m200311Y("mock user 共同联系人 10", new d30() { // from class: l.bcc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58284Fj(new DebugUtil.C9062b0(), 2);
            }
        }));
        arrayList.add(vwb.m200311Y("mock user 共同联系人 25", new d30() { // from class: l.ccc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58284Fj(new DebugUtil.C9066c0(), 2);
            }
        }));
        arrayList.add(vwb.m200311Y("卡片左右切卡引导 状态重制", new d30() { // from class: l.dcc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19663m0.f19460w0.put(Boolean.FALSE);
            }
        }));
        arrayList.add(vwb.m200311Y("后端下发认证实验强制方式 头像认证: " + tvf.f172281b.get(), new d30() { // from class: l.ecc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58835fe();
            }
        }));
        arrayList.add(vwb.m200311Y("后端下发认证实验强制方式 实名认证:" + tvf.f172282c.get(), new d30() { // from class: l.gcc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58336I5();
            }
        }));
        arrayList.add(vwb.m200311Y("mock profile refactor =" + lra0.f129521l.get(), new d30() { // from class: l.hcc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58166Ab();
            }
        }));
        arrayList.add(vwb.m200311Y("mock profile refactor isProfileRefactorWithOutGuide  =" + lra0.f129523m.get(), new d30() { // from class: l.icc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58188Bb();
            }
        }));
        arrayList.add(vwb.m200311Y("mock profile card bottom view render   =" + lra0.f129501b.get(), new d30() { // from class: l.kcc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59240y2();
            }
        }));
        arrayList.add(vwb.m200311Y("mock profile refactor no about Profile改版-解耦“关于我 =" + lra0.f129499a.get(), new d30() { // from class: l.lcc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58245E2();
            }
        }));
        arrayList.add(vwb.m200311Y("mock profile card bottom view debugBlockBottomAboutMe   =" + lra0.f129503c.get(), new d30() { // from class: l.mcc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59162uc();
            }
        }));
        arrayList.add(vwb.m200311Y("xxx 新交友目的 筛选 二期实验:" + h7j.f106283a.get(), new d30() { // from class: l.ncc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58572T8();
            }
        }));
        arrayList.add(vwb.m200311Y("xxx 新交友目的 筛选 保存资料清空交友目的:" + h7j.f106284b.get(), new d30() { // from class: l.occ
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58781d4();
            }
        }));
        arrayList.add(vwb.m200311Y("xxx 新交友目的 新弹框", new d30() { // from class: l.pcc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58189Bc(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("xxx 新交友目的 新弹框 划卡一定弹:" + h7j.f106286d.get(), new d30() { // from class: l.qcc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59014ni();
            }
        }));
        arrayList.add(vwb.m200311Y("xxx 新交友目的 二期完善资料弹框", new d30() { // from class: l.scc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58160A5(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("mock profile card 卡片原图显示 =" + lra0.f129507e.get(), new d30() { // from class: l.tcc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58942kc();
            }
        }));
        arrayList.add(vwb.m200311Y("新喜欢弹窗本地记录清除", new d30() { // from class: l.vcc
            @Override // p149l.d30
            public final void call() {
                ut20.m195275d();
            }
        }));
        arrayList.add(vwb.m200311Y("SVIP双tab购买", new d30() { // from class: l.wcc
            @Override // p149l.d30
            public final void call() {
                C8764c.m53509z0(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "", Privilege.letter, PurchaseType.TYPE_GET_VIP, null, 0);
            }
        }));
        arrayList.add(vwb.m200311Y("插入online boost用户", new d30() { // from class: l.xcc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58722ab();
            }
        }));
        arrayList.add(vwb.m200311Y("绑定手机号弹窗", new d30() { // from class: l.ycc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                ark.m98439O0(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), "", new d30() { // from class: l.ivc
                    @Override // p149l.d30
                    public final void call() {
                        uq40.m194983y(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), true);
                    }
                }, false);
            }
        }));
        arrayList.add(vwb.m200311Y("最后一张提前到都一张", new d30() { // from class: l.zcc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58210Cb();
            }
        }));
        arrayList.add(vwb.m200311Y("无匹配弹窗", new d30() { // from class: l.adc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19663m0.f19323B0.m132487l(roj0.f160388a);
            }
        }));
        arrayList.add(vwb.m200311Y("清除性别fake本地标记", new d30() { // from class: l.bdc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19639e0.f149452q1.put(Boolean.FALSE);
            }
        }));
        arrayList.add(vwb.m200311Y("拍一拍", new d30() { // from class: l.cdc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58537Rf(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("列表加载速度优化", new d30() { // from class: l.edc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58514Qd(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("群聊 group debug", new d30() { // from class: l.gdc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58396L0(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("新配对Congrats开关:".concat(a5x.f67731a.get().booleanValue() ? "true" : "false"), new d30() { // from class: l.hdc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58748bf();
            }
        }));
        arrayList.add(vwb.m200311Y("展示顶部弹窗 x 10", new d30() { // from class: l.idc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58363Ja(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("clear intl fake dialog count", new d30() { // from class: l.jdc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59130t2();
            }
        }));
        arrayList.add(vwb.m200311Y("Conversation Counter Verification", new d30() { // from class: l.kdc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59233xh(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("商业化通用【汇总】", new d30() { // from class: l.ldc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58872h7(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("商业化AB实验【汇总】", new d30() { // from class: l.mdc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59092r8(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b, nt30Var);
            }
        }));
        arrayList.add(vwb.m200311Y("刷新表情数据", new d30() { // from class: l.ndc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19624Z.f20142S.m121236q();
            }
        }));
        arrayList.add(vwb.m200311Y("女性显示喜欢标记" + CoreModule.f17545c.f19663m0.f19377U0.get(), new d30() { // from class: l.odc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58751bi();
            }
        }));
        arrayList.add(vwb.m200311Y("清除女性Banner展示时间", new d30() { // from class: l.sdc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19687u0.f19261r0.put(0L);
            }
        }));
        arrayList.add(vwb.m200311Y("展示女性新喜欢Banner", new d30() { // from class: l.tdc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58837fg(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("插入固定的User到顶部", new d30() { // from class: l.udc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59214wk(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            }
        }));
        arrayList.add(vwb.m200311Y("插入固定的User到顶部喜欢我", new d30() { // from class: l.vdc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59236xk(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), true, 0);
            }
        }));
        arrayList.add(vwb.m200311Y("查询固定的User", new d30() { // from class: l.wdc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58196Bj(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            }
        }));
        arrayList.add(vwb.m200311Y("插入固定的User到顶部没有喜欢我", new d30() { // from class: l.xdc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59236xk(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), false, 0);
            }
        }));
        arrayList.add(vwb.m200311Y("插入固定1的User到顶部没有喜欢我", new d30() { // from class: l.ydc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59236xk(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), false, 1);
            }
        }));
        arrayList.add(vwb.m200311Y("插入固定的User到顶部重逢配对", new d30() { // from class: l.zdc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59258yk(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            }
        }));
        arrayList.add(vwb.m200311Y("城市c位广播", new d30() { // from class: l.aec
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59269z9(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("消息tab优化 = " + lra0.f129512g0.get(), new d30() { // from class: l.bec
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58490Pa();
            }
        }));
        arrayList.add(vwb.m200311Y("显示superlike动画", new d30() { // from class: l.eec
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), new Runnable() { // from class: l.itc
                    @Override // java.lang.Runnable
                    public final void run() {
                        viewTreeObserverOnGlobalLayoutListenerC7866b2.m37370v6();
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.m200311Y("superlike探探币连送确定", new d30() { // from class: l.fec
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), new Runnable() { // from class: l.dxc
                    @Override // java.lang.Runnable
                    public final void run() {
                        viewTreeObserverOnGlobalLayoutListenerC7866b2.m37324m6(99999);
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.m200311Y("显示superlike探探币提示", new d30() { // from class: l.gec
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), new Runnable() { // from class: l.kwc
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b3 = viewTreeObserverOnGlobalLayoutListenerC7866b2;
                        rxg0.m181563M(viewTreeObserverOnGlobalLayoutListenerC7866b3.m37341q2(), viewTreeObserverOnGlobalLayoutListenerC7866b3.m37385z2(), viewTreeObserverOnGlobalLayoutListenerC7866b3.m37134C2().getRealView(), 1300);
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.m200311Y("显示superlike长按引导", new d30() { // from class: l.hec
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), new Runnable() { // from class: l.ksc
                    @Override // java.lang.Runnable
                    public final void run() {
                        viewTreeObserverOnGlobalLayoutListenerC7866b2.m37375w6(true);
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.m200311Y("展示设置蒙层", new d30() { // from class: l.iec
            @Override // p149l.d30
            public final void call() {
                e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), new Runnable() { // from class: l.mpc
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m58653X5();
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.m200311Y("所有都有letter", new d30() { // from class: l.jec
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58220D();
            }
        }));
        arrayList.add(vwb.m200311Y("所有都有新喜欢", new d30() { // from class: l.kec
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58817ei();
            }
        }));
        arrayList.add(vwb.m200311Y("清除所有标记", new d30() { // from class: l.lec
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58641We();
            }
        }));
        arrayList.add(vwb.m200311Y("首页蒙层相关", new d30() { // from class: l.mec
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58452Ne(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("关闭Google地图服务", new d30() { // from class: l.oec
            @Override // p149l.d30
            public final void call() {
                qib0.f154736v = false;
            }
        }));
        arrayList.add(vwb.m200311Y("圣诞活动-选择好友", new d30() { // from class: l.rec
            @Override // p149l.d30
            public final void call() {
                CoreDlg.m45020R1(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "selectFriends", "选择好友", "每次分享最多选择5位好友", 5, "分享", "最多可以选择5位好友", null, new f30() { // from class: l.hoc
                    @Override // p149l.f30
                    public final void call(Object obj, Object obj2) {
                        lsi0.m151595y("选择好友：" + ((String) obj2));
                    }
                });
            }
        }));
        arrayList.add(vwb.m200311Y("圣诞活动-发送消息", new d30() { // from class: l.sec
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58600Uf(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("推荐接口的全部用户id", new d30() { // from class: l.tec
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58815eg();
            }
        }));
        arrayList.add(vwb.m200311Y("测试打电话给28331", new d30() { // from class: l.uec
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().startActivity(MessagesAct.m48940e2(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), "28331", 31, vwb.m200311Y("ISCALLEER", "1")));
            }
        }));
        arrayList.add(vwb.m200311Y("接受28331语聊match", new d30() { // from class: l.vec
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().startActivity(MessagesAct.m48940e2(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), "28331", 31, vwb.m200311Y("ISCALLEER", "0")));
            }
        }));
        arrayList.add(vwb.m200311Y("语音闪聊充值弹窗", new d30() { // from class: l.wec
            @Override // p149l.d30
            public final void call() {
                swh0.m186281z1(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "", null, null);
            }
        }));
        arrayList.add(vwb.m200311Y("语音闪聊确认弹窗", new d30() { // from class: l.xec
            @Override // p149l.d30
            public final void call() {
                swh0.m186180B1(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), PurchaseType.TYPE_GET_VOICE_ONLINE_MATCH_TICKETS_EXTRA, null, null);
            }
        }));
        arrayList.add(vwb.m200311Y("完善资料", new d30() { // from class: l.zec
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58908j0(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("打开关闭tantanlist " + CoreModule.f17545c.f19639e0.f149232O1.get(), new d30() { // from class: l.afc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58853ga();
            }
        }));
        arrayList.add(vwb.m200311Y("跳转到闪聊二楼 ", new d30() { // from class: l.bfc
            @Override // p149l.d30
            public final void call() {
                j2e0.m139446m(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), Uri.parse("tantanapp://quickChat2Floor"));
            }
        }));
        arrayList.add(vwb.m200311Y("跳转See deep", new d30() { // from class: l.dfc
            @Override // p149l.d30
            public final void call() {
                j2e0.m139446m(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), Uri.parse("tantanapp://seeLikes?preferredShowPurchase=false&preferredShowDetail=true"));
            }
        }));
        arrayList.add(vwb.m200311Y("跳转See deep show prchase", new d30() { // from class: l.efc
            @Override // p149l.d30
            public final void call() {
                j2e0.m139446m(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), Uri.parse("tantanapp://seeLikes?preferredShowPurchase=true&preferredShowDetail=true"));
            }
        }));
        arrayList.add(vwb.m200311Y("跳转See deep no jump", new d30() { // from class: l.ffc
            @Override // p149l.d30
            public final void call() {
                j2e0.m139446m(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), Uri.parse("tantanapp://seeLikes?preferredShowPurchase=true&preferredShowDetail=false"));
            }
        }));
        arrayList.add(vwb.m200311Y("跳转遇见 deep see", new d30() { // from class: l.gfc
            @Override // p149l.d30
            public final void call() {
                j2e0.m139446m(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), Uri.parse("tantanapp://myMeet?preferredShowPurchase=false&tab=see"));
            }
        }));
        arrayList.add(vwb.m200311Y("跳转遇见 deep like", new d30() { // from class: l.hfc
            @Override // p149l.d30
            public final void call() {
                j2e0.m139446m(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), Uri.parse("tantanapp://myMeet?preferredShowPurchase=false&tab=like"));
            }
        }));
        arrayList.add(vwb.m200311Y("跳转遇见 deep see  show pur", new d30() { // from class: l.ifc
            @Override // p149l.d30
            public final void call() {
                j2e0.m139446m(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), Uri.parse("tantanapp://myMeet?preferredShowPurchase=true&tab=see"));
            }
        }));
        arrayList.add(vwb.m200311Y("跳转遇见 deep like show pur", new d30() { // from class: l.kfc
            @Override // p149l.d30
            public final void call() {
                j2e0.m139446m(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), Uri.parse("tantanapp://myMeet?preferredShowPurchase=true&tab=like"));
            }
        }));
        arrayList.add(vwb.m200311Y("打开关闭tantanlistDebug " + CoreModule.f17545c.f19639e0.f149239P1.get(), new d30() { // from class: l.lfc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58289G2();
            }
        }));
        arrayList.add(vwb.m200311Y("书影剧：dlg2", new d30() { // from class: l.mfc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59077qf(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("书影剧 登录用户评论：", new d30() { // from class: l.nfc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58278Fd();
            }
        }));
        arrayList.add(vwb.m200311Y("书影剧 聊一聊 第一次提示: " + CoreModule.f17545c.f19639e0.f149383h2.get(), new d30() { // from class: l.pfc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19639e0.f149383h2.put(Boolean.TRUE);
            }
        }));
        arrayList.add(vwb.m200311Y("展示内部push", new d30() { // from class: l.qfc
            @Override // p149l.d30
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC7866b.act().postDelayed(new Runnable() { // from class: l.zvc
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.f17545c.f19655j1.m30134k();
                    }
                }, 1000L);
            }
        }));
        arrayList.add(vwb.m200311Y("展示模拟限时配对", new d30() { // from class: l.rfc
            @Override // p149l.d30
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC7866b.act().postDelayed(new Runnable() { // from class: l.xwc
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.f17545c.f19655j1.m30135l();
                    }
                }, 3000L);
            }
        }));
        arrayList.add(vwb.m200311Y("展示选择头像Frag", new d30() { // from class: l.sfc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().postDelayed(new Runnable() { // from class: l.qkc
                    @Override // java.lang.Runnable
                    public final void run() {
                        new MediaRecorderFrag().show(viewTreeObserverOnGlobalLayoutListenerC7866b2.act().getSupportFragmentManager(), "update_avatar");
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.m200311Y("打开丰富资料debug入口：" + C8140a.f25299f.get(), new d30() { // from class: l.tfc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59252ye();
            }
        }));
        arrayList.add(vwb.m200311Y("丰富资料用户是否需要跳转打招呼：", new d30() { // from class: l.vfc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                i0e.m133795d(viewTreeObserverOnGlobalLayoutListenerC7866b2.act()).m133825r("input the user id").m133816F(new e30() { // from class: l.owc
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m58890i3(viewTreeObserverOnGlobalLayoutListenerC7866b2, (String) obj);
                    }
                }).m133821n().show();
            }
        }));
        arrayList.add(vwb.m200311Y("触发丰富资料(线上url)：" + C8140a.f25299f.get(), new d30() { // from class: l.wfc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58447N9();
            }
        }));
        arrayList.add(vwb.m200311Y("触发丰富资料结束语：" + CoreModule.f17545c.f19642f0.f19911X0.get(), new d30() { // from class: l.xfc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58460O1();
            }
        }));
        arrayList.add(vwb.m200311Y("打开丰富资料debug入口有效时间：" + C8140a.f25299f.get(), new d30() { // from class: l.yfc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19639e0.f149247Q1.put(Long.valueOf(mqi0.m155944o() + (((long) (upa.m194728b0() * MMKV.ExpireInDay)) * 1000)));
            }
        }));
        arrayList.add(vwb.m200311Y("清空丰富资料本地数据：" + C8140a.f25299f.get(), new d30() { // from class: l.zfc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59011nf();
            }
        }));
        arrayList.add(vwb.m200311Y("mock 完成来填写", new d30() { // from class: l.bgc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m33034ln();
            }
        }));
        arrayList.add(vwb.m200311Y("mock 打开应用", new d30() { // from class: l.cgc
            @Override // p149l.d30
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC7866b.f21916a.postDelayed(new Runnable() { // from class: l.lmc
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.f17545c.f19642f0.m33153up();
                    }
                }, 3000L);
            }
        }));
        arrayList.add(vwb.m200311Y("丰富资料修改成finished", new d30() { // from class: l.dgc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58992mi(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("丰富资料修改成not-finished", new d30() { // from class: l.egc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58392Kh(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("修改briefIntroduction改为我是一个up主", new d30() { // from class: l.ggc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58463O4(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("动态打招呼二期男性气泡文案设置为false", new d30() { // from class: l.hgc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19678r0.f20022c0.put(Boolean.FALSE);
            }
        }));
        arrayList.add(vwb.m200311Y("心动信号", new d30() { // from class: l.igc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58385Ka(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("消息合规", new d30() { // from class: l.jgc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58856gd(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("解析ListDemo", new d30() { // from class: l.kgc
            @Override // p149l.d30
            public final void call() {
                JsonParseHelper.parseList("[{\n\t\"convType\": \"defalut\"\n}, {\n\t\"convType\": \"hahah\"\n}]", Conversation.JSON_ADAPTER).size();
            }
        }));
        arrayList.add(vwb.m200311Y("交友目的全量,严肃弹框", new d30() { // from class: l.lgc
            @Override // p149l.d30
            public final void call() {
                h7j.m129718b0(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            }
        }));
        arrayList.add(vwb.m200311Y("新标签，弹框添加标签", new d30() { // from class: l.ngc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58493Pd(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("新标签，测试queryTags", new d30() { // from class: l.ogc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59129t1();
            }
        }));
        arrayList.add(vwb.m200311Y("新标签，测试ffirstLeftSlide.put(true)", new d30() { // from class: l.pgc
            @Override // p149l.d30
            public final void call() {
                new hpd0("first_left_slide_" + CoreModule.m29931H().userId(), Boolean.FALSE).put(Boolean.TRUE);
            }
        }));
        arrayList.add(vwb.m200311Y("标签找人页-跳转profile-输入userId", new d30() { // from class: l.rgc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                i0e.m133795d(viewTreeObserverOnGlobalLayoutListenerC7866b2.act()).m133814D(10).m133825r("input the user id").m133816F(new e30() { // from class: l.fxc
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b3 = viewTreeObserverOnGlobalLayoutListenerC7866b2;
                        String str2 = (String) obj;
                        viewTreeObserverOnGlobalLayoutListenerC7866b3.act().duringCreated(CoreModule.m29932K().userObsById(str2)).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.t8d
                            @Override // p149l.e30
                            public final void call(Object obj2) {
                                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b4 = viewTreeObserverOnGlobalLayoutListenerC7866b3;
                                viewTreeObserverOnGlobalLayoutListenerC7866b4.act().startActivity(CoreModule.m29932K().mo30673Ar(viewTreeObserverOnGlobalLayoutListenerC7866b4.act(), str2, "from_mew_tags", false));
                            }
                        }));
                    }
                }).m133821n().show();
            }
        }));
        arrayList.add(vwb.m200311Y("书影剧三期最大添加个数 = " + CoreModule.f17545c.f19682s1.f20082S.get(), new d30() { // from class: l.sgc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19682s1.f20082S.put(10);
            }
        }));
        arrayList.add(vwb.m200311Y("心动信号引导添加标签", new d30() { // from class: l.tgc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58693Z3(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("触发破冰插卡", new d30() { // from class: l.ugc
            @Override // p149l.d30
            public final void call() {
                viewTreeObserverOnGlobalLayoutListenerC7866b.act().duringCreated(CoreModule.f17545c.f19639e0.m169529q7("card")).subscribe(mkd0.m154956H(new e30() { // from class: l.cvc
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m59019o1((List) obj);
                    }
                }, new e30() { // from class: l.dvc
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m58726af((Throwable) obj);
                    }
                }));
            }
        }));
        arrayList.add(vwb.m200311Y("触发破冰弹窗", new d30() { // from class: l.vgc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                viewTreeObserverOnGlobalLayoutListenerC7866b2.act().duringCreated(CoreModule.f17545c.f19639e0.m169529q7("chat")).subscribe(mkd0.m154956H(new e30() { // from class: l.omc
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m58941kb(viewTreeObserverOnGlobalLayoutListenerC7866b2, (List) obj);
                    }
                }, new e30() { // from class: l.pmc
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m58932k2((Throwable) obj);
                    }
                }));
            }
        }));
        m58949kj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58927jj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58218Cj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m59257yj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58240Dj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58840fj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58796dj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58971lj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58174Aj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58646Wj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        arrayList.add(vwb.m200311Y("心动信号--引导标签填写", new d30() { // from class: l.wgc
            @Override // p149l.d30
            public final void call() {
                sa40.m182802o().m182808F(viewTreeObserverOnGlobalLayoutListenerC7866b.m37341q2(), CoreModule.m29931H().userId(), "from_card_tag_guide", TabName.Card.name(), 3002);
            }
        }));
        arrayList.add(vwb.m200311Y("打开&关闭过热：" + C8360d.f29454a, new d30() { // from class: l.xgc
            @Override // p149l.d30
            public final void call() {
                C8360d.f29454a = !C8360d.f29454a;
            }
        }));
        arrayList.add(vwb.m200311Y("升温", new d30() { // from class: l.zgc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58183B6(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("设置新版聊天升温温度：" + CoreModule.f17545c.f19639e0.f149474t2.get(), new d30() { // from class: l.ahc
            @Override // p149l.d30
            public final void call() {
                i0e.m133795d(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m133819I("输入温度").m133815E(1).m133814D(80).m133816F(new e30() { // from class: l.muc
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m59173v1((String) obj);
                    }
                }).m133821n().show();
            }
        }));
        arrayList.add(vwb.m200311Y("划卡优化开", new d30() { // from class: l.chc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58377K2(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("插卡管控：" + CoreModule.f17545c.f19622Y0.f94264i.get(), new d30() { // from class: l.dhc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19622Y0.f94264i.put(0L);
            }
        }));
        arrayList.add(vwb.m200311Y("测试桥", new d30() { // from class: l.ehc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58408Lc(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("插入认证问询卡片：", new d30() { // from class: l.fhc
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19552B0.m31597U3().subscribe(mkd0.m154955G(new e30() { // from class: l.kxc
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m59271zb((j760) obj);
                    }
                }));
            }
        }));
        arrayList.add(vwb.m200311Y("选择消息帧改版实验：" + f38257g.get(), new d30() { // from class: l.ghc
            @Override // p149l.d30
            public final void call() {
                i0e.m133795d(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m133819I("输入实验").m133815E(1).m133814D(80).m133816F(new e30() { // from class: l.nnc
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m58715a4((String) obj);
                    }
                }).m133821n().show();
            }
        }));
        arrayList.add(vwb.m200311Y("甩尾逻辑:" + f38258h.get(), new d30() { // from class: l.hhc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58338I7();
            }
        }));
        arrayList.add(vwb.m200311Y("图文审核中台化", new d30() { // from class: l.ihc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58446N8(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("消息红点脱敏", new d30() { // from class: l.jhc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59205wb(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("国际化跳转打招呼：", new d30() { // from class: l.lhc
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                i0e.m133795d(viewTreeObserverOnGlobalLayoutListenerC7866b2.act()).m133825r("input the user id").m133816F(new e30() { // from class: l.hpc
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        DebugUtil.m58570T6(viewTreeObserverOnGlobalLayoutListenerC7866b2, (String) obj);
                    }
                }).m133821n().show();
            }
        }));
        m58709Zj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58350Ij(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58950kk(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58731ak(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58775ck(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58625Vj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58394Kj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m59082qk(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58498Pi(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58561Si(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58372Jj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58972lk(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58175Ak(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58219Ck(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58285Fk(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58371Ji(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58582Ti(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58540Ri(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58906ik(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58349Ii(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58241Dk(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58752bj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58477Oi(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58928jk(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        HashMap map = new HashMap();
        map.put("资产配图", CoreModule.f17545c.f19639e0.f149186H3);
        map.put("资料页体验优化", CoreModule.f17545c.f19639e0.f149234O3);
        map.put("书影剧pic2txt", CoreModule.f17545c.f19639e0.f149478t6);
        m58327Hi(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b, map);
        m58645Wi(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58373Jk(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58457Nj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58283Fi(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58307Gk(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m59016nk(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58393Ki(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58994mk(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m59148tk(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58263Ek(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58688Yj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58478Oj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58666Xi(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58603Ui(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58499Pj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58819ek(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58885hk(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58863gk(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58435Mi(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m59104rk(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58328Hj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58351Ik(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58841fk(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58624Vi(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58583Tj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58562Sj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58604Uj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58753bk(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m59060pk(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58687Yi(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58519Qi(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58456Ni(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58329Hk(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58541Rj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58197Bk(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m59279zj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m59147tj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m59081qj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m59103rj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m59191vj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58993mj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m59213wj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m59169uj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m59125sj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        m58884hj(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
        return arrayList;
    }

    /* JADX INFO: renamed from: xk */
    public static void m59236xk(final Act act, final boolean z, final int i) {
        i0e.m133795d(act).m133814D(10).m133825r("输入插入Userid").m133816F(new e30() { // from class: l.gwc
            @Override // p149l.e30
            public final void call(Object obj) {
                Act act2 = act;
                e51.m114743H(act2, new Runnable() { // from class: l.o6d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m59037oj(str, act2, z, i);
                    }
                }, 1000L);
            }
        }).m133821n().show();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m59237y(Throwable th) {
    }

    /* JADX INFO: renamed from: y1 */
    public static /* synthetic */ void m59239y1(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("ab", new d30() { // from class: l.i9d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58868h3();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: y2 */
    public static /* synthetic */ void m59240y2() {
        hpd0 hpd0Var = lra0.f129501b;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: y5 */
    public static /* synthetic */ void m59243y5() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.AdCard;
        userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        List<OMSAdCardInfo> listM135335h = ic50.m135327j().m135335h();
        if (vwb.m200296J(listM135335h)) {
            return;
        }
        userInfo.extensionObject = listM135335h.get(0);
        CoreModule.f17545c.f19663m0.m31154w6(userInfo, 3);
        CoreModule.f17545c.f19663m0.f19372S1.put(userInfo, 3);
    }

    /* JADX INFO: renamed from: y6 */
    public static /* synthetic */ void m59244y6() {
        tpd0 tpd0Var = new tpd0("full_card_5_btn_tran_x", 0);
        tpd0 tpd0Var2 = new tpd0("full_card_5_btn_tran_y", 0);
        tpd0 tpd0Var3 = new tpd0("full_card_btn_5_tran_count", 0);
        Boolean bool = Boolean.FALSE;
        hpd0 hpd0Var = new hpd0("full_card_clicked", bool);
        tpd0Var2.put(0);
        tpd0Var3.put(0);
        hpd0Var.put(bool);
        tpd0Var.put(-500);
    }

    /* JADX INFO: renamed from: y7 */
    public static /* synthetic */ void m59245y7(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        ae70 ae70Var = new ae70(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), CoreModule.f17545c.f19639e0.m169527p9(), SwipeDirection.UP);
        ae70Var.m96808x(CorePopLevel.PICKS_GUIDE);
        hdb0.m130575c().m130582i(ae70Var);
    }

    /* JADX INFO: renamed from: ya */
    public static /* synthetic */ void m59248ya(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("VIP购买弹窗", new d30() { // from class: l.k1d
            @Override // p149l.d30
            public final void call() {
                C8764c.m53400I1(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "");
            }
        }));
        arrayList.add(vwb.m200311Y("SVIP购买弹窗", new d30() { // from class: l.l1d
            @Override // p149l.d30
            public final void call() {
                C8764c.m53502w0(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "");
            }
        }));
        arrayList.add(vwb.m200311Y("白金会员", new d30() { // from class: l.m1d
            @Override // p149l.d30
            public final void call() {
                C8764c.m53475n0(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "");
            }
        }));
        arrayList.add(vwb.m200311Y("黑金会员购买弹窗", new d30() { // from class: l.n1d
            @Override // p149l.d30
            public final void call() {
                C8764c.m53439a0(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "", null, null, null, Privilege.oDiamondGreetings);
            }
        }));
        arrayList.add(vwb.m200311Y("精选购买弹窗", new d30() { // from class: l.p1d
            @Override // p149l.d30
            public final void call() {
                C8764c.m53488r1(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), "");
            }
        }));
        arrayList.add(vwb.m200311Y("每日心动购买弹窗", new d30() { // from class: l.q1d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59178v6(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("VIP过期弹窗", new d30() { // from class: l.r1d
            @Override // p149l.d30
            public final void call() {
                ok3.m164814M(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: yc */
    public static /* synthetic */ void m59250yc() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149329a4;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        CoreModule.f17545c.f19639e0.f149170F1.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: yd */
    public static /* synthetic */ void m59251yd() {
        hpd0 hpd0Var = r9m.f158389i;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: ye */
    public static /* synthetic */ void m59252ye() {
        hpd0 hpd0Var = C8140a.f25299f;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        CoreModule.f17545c.f19642f0.f19905V0.put("xxxurl=http://m.staging2.p1staff.com/app-pages/commerce/newuserguide?category=0");
        C4732c c4732c = CoreModule.f17545c;
        c4732c.f19642f0.f19899T0.put(upa.m194733c0(c4732c.f19639e0.m169527p9()));
        C4732c c4732c2 = CoreModule.f17545c;
        c4732c2.f19642f0.f19896S0.put(upa.m194720Z(c4732c2.f19639e0.m169527p9()));
    }

    /* JADX INFO: renamed from: yi */
    public static /* synthetic */ void m59256yi(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("SVIP单tab购买弹窗-打招呼", new d30() { // from class: l.f8d
            @Override // p149l.d30
            public final void call() {
                C8764c.m53499v0(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
            }
        }));
        arrayList.add(vwb.m200311Y("打招呼消耗探币提示弹窗", new d30() { // from class: l.g8d
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17557o.m195057d().mo33860jf(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), CoreModule.f17545c.f19570H0.m210379t5(), null, null, null);
            }
        }));
        arrayList.add(vwb.m200311Y("打招呼 探探币消耗 不再提醒 重置", new d30() { // from class: l.h8d
            @Override // p149l.d30
            public final void call() {
                swh0.m186255p0().m186297R0(false);
            }
        }));
        arrayList.add(vwb.m200311Y("打招呼 探币不足充值弹窗", new d30() { // from class: l.i8d
            @Override // p149l.d30
            public final void call() {
                CoreModule.m29935P().m94656g().mo35024Pk(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), BuildConfig.BUILD_TYPE, null);
            }
        }));
        arrayList.add(vwb.m200311Y("打招呼 礼物引导动画重置", new d30() { // from class: l.j8d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59085r1();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: yj */
    public static void m59257yj(ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("国际化 同道中人", new d30() { // from class: l.dmc
            @Override // p149l.d30
            public final void call() {
                C8411a.INSTANCE.m46885f(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), true);
            }
        }));
    }

    /* JADX INFO: renamed from: yk */
    public static void m59258yk(final Act act) {
        i0e.m133795d(act).m133814D(10).m133825r("输入插入Userid").m133816F(new e30() { // from class: l.qrc
            @Override // p149l.e30
            public final void call(Object obj) {
                Act act2 = act;
                e51.m114743H(act2, new Runnable() { // from class: l.szc
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m59059pj(str, act2);
                    }
                }, 1000L);
            }
        }).m133821n().show();
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m59259z(ArrayList arrayList, final nt30 nt30Var, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("试用真实头像用户特权插卡", new d30() { // from class: l.m2d
            @Override // p149l.d30
            public final void call() {
                vyc0.m200642q();
            }
        }));
        arrayList.add(vwb.m200311Y("试用优先看最受欢迎用户", new d30() { // from class: l.q2d
            @Override // p149l.d30
            public final void call() {
                vyc0.m200641p();
            }
        }));
        arrayList.add(vwb.m200311Y("试用优先看在线用户", new d30() { // from class: l.r2d
            @Override // p149l.d30
            public final void call() {
                vyc0.m200640o();
            }
        }));
        arrayList.add(vwb.m200311Y("试用未读", new d30() { // from class: l.s2d
            @Override // p149l.d30
            public final void call() {
                uyc0.m196272l0().m196283t0(nt30Var.m161157T4(), "haveRead", "");
            }
        }));
        arrayList.add(vwb.m200311Y("设置可以弹出真实用户气泡", new d30() { // from class: l.t2d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58848g5();
            }
        }));
        arrayList.add(vwb.m200311Y("设置可以弹出在线气泡", new d30() { // from class: l.u2d
            @Override // p149l.d30
            public final void call() {
                uyc0.m196272l0().m196277n0(true);
            }
        }));
        arrayList.add(vwb.m200311Y("开始使用提示", new d30() { // from class: l.w2d
            @Override // p149l.d30
            public final void call() {
                vyc0.m200643r(nt30Var.m161157T4(), "已优先看最受欢迎用户！");
            }
        }));
        arrayList.add(vwb.m200311Y("使用结束棋牌提示", new d30() { // from class: l.x2d
            @Override // p149l.d30
            public final void call() {
                vyc0.m200643r(nt30Var.m161157T4(), "最受欢迎用户筛选试用完成！");
            }
        }));
        arrayList.add(vwb.m200311Y("结束弹窗真实头像", new d30() { // from class: l.y2d
            @Override // p149l.d30
            public final void call() {
                uyc0.m196272l0().m196282s0(nt30Var.m161157T4(), VisitorSortType.realUser);
            }
        }));
        arrayList.add(vwb.m200311Y("结束弹窗优先推荐", new d30() { // from class: l.z2d
            @Override // p149l.d30
            public final void call() {
                uyc0.m196272l0().m196282s0(nt30Var.m161157T4(), SuperlikeReason.popular);
            }
        }));
        arrayList.add(vwb.m200311Y("结束弹窗在线", new d30() { // from class: l.n2d
            @Override // p149l.d30
            public final void call() {
                uyc0.m196272l0().m196282s0(nt30Var.m161157T4(), "online");
            }
        }));
        arrayList.add(vwb.m200311Y("结束弹窗已读", new d30() { // from class: l.o2d
            @Override // p149l.d30
            public final void call() {
                uyc0.m196272l0().m196282s0(nt30Var.m161157T4(), "haveRead");
            }
        }));
        arrayList.add(vwb.m200311Y("气泡测试", new d30() { // from class: l.p2d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m59094ra(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m59260z0(ArrayList arrayList, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        final boolean zBooleanValue = CoreModule.f17545c.f19642f0.f19995z1.get().booleanValue();
        final boolean zBooleanValue2 = CoreModule.f17545c.f19642f0.f19992y1.get().booleanValue();
        arrayList.clear();
        arrayList.add(vwb.m200311Y("清推荐新配对 Sp " + zBooleanValue, new d30() { // from class: l.u6d
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.f19995z1.put(Boolean.valueOf(!zBooleanValue));
            }
        }));
        arrayList.add(vwb.m200311Y("清快捷表情消息 Sp " + zBooleanValue2, new d30() { // from class: l.v6d
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.f19992y1.put(Boolean.valueOf(!zBooleanValue2));
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: z1 */
    public static /* synthetic */ void m59261z1(nt30 nt30Var, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, String str) {
        nt30Var.f140368P = viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2().mo38818o().m141745d().f56011id;
        nt30Var.f140370Q = str;
        nt30Var.m161233i9(true);
    }

    /* JADX INFO: renamed from: z2 */
    public static /* synthetic */ void m59262z2(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("收到Push喜欢  newMaleUserLike.received", new d30() { // from class: l.pwc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58274F9();
            }
        }));
        arrayList.add(vwb.m200311Y("收到Push喜欢  newMaleUserLike.send", new d30() { // from class: l.qwc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58857ge();
            }
        }));
        arrayList.add(vwb.m200311Y("收到Push喜欢逻辑 delay 1s", new d30() { // from class: l.rwc
            @Override // p149l.d30
            public final void call() {
                e51.m114744I(viewTreeObserverOnGlobalLayoutListenerC7866b.m37341q2(), new Runnable() { // from class: l.m8d
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.f17545c.f19663m0.m31015K5();
                    }
                }, 1000L);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: z4 */
    public static /* synthetic */ void m59264z4(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("单Tab模式（payWillScore>=0.19）", new d30() { // from class: l.o8d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58246E3(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("双Tab模式（payWillScore<0.19）", new d30() { // from class: l.p8d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58794dh(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("测试顶部通知弹层", new d30() { // from class: l.q8d
            @Override // p149l.d30
            public final void call() {
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = viewTreeObserverOnGlobalLayoutListenerC7866b;
                bo5.m102905p(viewTreeObserverOnGlobalLayoutListenerC7866b2.act(), DebugUtil.m58415Lj(viewTreeObserverOnGlobalLayoutListenerC7866b2), "Wow, seriously! You look absolutely ripped in that photo! 💪");
            }
        }));
        arrayList.add(vwb.m200311Y("顶部卡片添加 compliment", new d30() { // from class: l.r8d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58172Ah(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        arrayList.add(vwb.m200311Y("收到称赞用户插入到卡片栈顶部", new d30() { // from class: l.s8d
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58779d2(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: z6 */
    public static /* synthetic */ void m59266z6() {
        hpd0 hpd0Var = lra0.f129500a0;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: z7 */
    public static /* synthetic */ void m59267z7() {
        CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded.get(1).payCardStyle = "chat";
        CoreModule.f17545c.f19663m0.f19394a0.m221515e().setRefreshValue(true);
        C22392a<PartialListOpt<CoreSuggested.UserInfo>> c22392a = CoreModule.f17545c.f19663m0.f19394a0;
        c22392a.m132487l(c22392a.m221515e().setReason(PartialListOpt.RefreshReason.NOTIFY_INNER));
    }

    /* JADX INFO: renamed from: z8 */
    public static /* synthetic */ void m59268z8() {
        hpd0 hpd0Var = lra0.f129478F;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
        lra0.f129479G.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: z9 */
    public static /* synthetic */ void m59269z9(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        final CityCData cityCDataNew_ = CityCData.new_();
        cityCDataNew_.userId = CoreModule.m29931H().userId();
        cityCDataNew_.cardTag = "豪掷50000探币占领封面";
        e51.m114743H(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), new Runnable() { // from class: l.kvc
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f17545c.f19650h2.f118815S.m132487l(cityCDataNew_);
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: za */
    public static /* synthetic */ void m59270za() {
        zpd0 zpd0Var = new zpd0("marry_guide_dlg_show_date_" + CoreModule.m29931H().userId(), 0L);
        zpd0 zpd0Var2 = new zpd0("marry_guide_dlg_show_times_" + CoreModule.m29931H().userId(), 0L);
        String str = "marry_guide_show_by_quality_" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        hpd0 hpd0Var = new hpd0(str, bool);
        zpd0Var.put(0L);
        zpd0Var2.put(0L);
        hpd0Var.put(bool);
        CoreModule.f17545c.f19639e0.f149235O4.put(0L);
        CoreModule.f17545c.f19639e0.f149193I4.put(bool);
        CoreModule.f17545c.f19639e0.f149200J4.put(0);
        CoreModule.f17545c.f19639e0.f149207K4.put(0L);
        CoreModule.f17545c.f19639e0.f149214L4.put(bool);
        CoreModule.f17545c.f19639e0.f149221M4.put(0);
    }

    /* JADX INFO: renamed from: zb */
    public static /* synthetic */ void m59271zb(j760 j760Var) {
        if (vwb.m200296J((Collection) j760Var.f116564a)) {
            return;
        }
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.QuestionOfNotVerify;
        userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f17545c.f19663m0.m31154w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: zd */
    public static /* synthetic */ void m59273zd(ArrayList arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("VIP", new d30() { // from class: l.t9d
            @Override // p149l.d30
            public final void call() {
                new r5b0.C19640a(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m177924h(vwb.m200324f0(PurchaseType.TYPE_GET_VIP), vwb.m200324f0(Privilege.vip_super_like)).m177918b(BuildConfig.BUILD_TYPE).m177926j();
            }
        }));
        arrayList.add(vwb.m200311Y("SVIP", new d30() { // from class: l.u9d
            @Override // p149l.d30
            public final void call() {
                new r5b0.C19640a(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m177924h(vwb.m200324f0(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE), vwb.m200324f0(Privilege.see_who_likes_me)).m177918b(BuildConfig.BUILD_TYPE).m177926j();
            }
        }));
        arrayList.add(vwb.m200311Y("ODiamond", new d30() { // from class: l.v9d
            @Override // p149l.d30
            public final void call() {
                new r5b0.C19640a(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m177924h(vwb.m200324f0(PurchaseType.TYPE_O_DIAMOND), vwb.m200324f0(Privilege.immediately_match)).m177918b(BuildConfig.BUILD_TYPE).m177926j();
            }
        }));
        arrayList.add(vwb.m200311Y("FemaleVIP", new d30() { // from class: l.w9d
            @Override // p149l.d30
            public final void call() {
                new r5b0.C19640a(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m177924h(vwb.m200324f0(PurchaseType.TYPE_FEMALE_VIP), vwb.m200324f0(Privilege.pick_tantan_credits_users)).m177918b(BuildConfig.BUILD_TYPE).m177926j();
            }
        }));
        arrayList.add(vwb.m200311Y("YouthVIP", new d30() { // from class: l.x9d
            @Override // p149l.d30
            public final void call() {
                new r5b0.C19640a(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m177924h(vwb.m200324f0(PurchaseType.TYPE_YOUTH_VIP), vwb.m200324f0(Privilege.youth_roaming)).m177918b(BuildConfig.BUILD_TYPE).m177926j();
            }
        }));
        arrayList.add(vwb.m200311Y("VIP+SVIP-默认vip", new d30() { // from class: l.y9d
            @Override // p149l.d30
            public final void call() {
                new r5b0.C19640a(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m177924h(vwb.m200324f0(PurchaseType.TYPE_GET_VIP, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE), vwb.m200324f0(Privilege.vip_location, Privilege.svip_badge)).m177918b(BuildConfig.BUILD_TYPE).m177925i(0).m177926j();
            }
        }));
        arrayList.add(vwb.m200311Y("VIP+SVIP-默认svip", new d30() { // from class: l.z9d
            @Override // p149l.d30
            public final void call() {
                new r5b0.C19640a(viewTreeObserverOnGlobalLayoutListenerC7866b.act()).m177924h(vwb.m200324f0(PurchaseType.TYPE_GET_VIP, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE), vwb.m200324f0(Privilege.vip_location, Privilege.svip_badge)).m177918b(BuildConfig.BUILD_TYPE).m177925i(1).m177926j();
            }
        }));
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: ze */
    public static /* synthetic */ void m59274ze() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149138A4;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: zh */
    public static /* synthetic */ void m59277zh(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        q3h0.C19423b c19423b = new q3h0.C19423b();
        c19423b.m172864a(1);
        c19423b.m172865b(CoreModule.m29932K().getUserById(CoreModule.f17545c.f19663m0.m31137q6()));
        c19423b.m172866c(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
    }

    /* JADX INFO: renamed from: zi */
    public static /* synthetic */ void m59278zi(GreetingSummary greetingSummary) {
        greetingSummary.unseen = 100;
        greetingSummary.latestTime = mqi0.m155944o();
        greetingSummary.latestUserId = CoreModule.f17545c.f19639e0.m169527p9().f56011id;
        CoreModule.f17545c.f19678r0.f20023d0.m132487l(greetingSummary);
    }

    /* JADX INFO: renamed from: zj */
    public static void m59279zj(final ArrayList<j760<String, d30>> arrayList, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        arrayList.add(vwb.m200311Y("我的Tab兼容V2", new d30() { // from class: l.msc
            @Override // p149l.d30
            public final void call() {
                DebugUtil.m58944ke(arrayList, viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
        }));
    }

    /* JADX INFO: renamed from: zk */
    public static void m59280zk(User user, Act act) {
        Dialog.C4309e c4309eDialog = act.dialog();
        c4309eDialog.m20507G0("用户位置信息：" + user.name);
        StringBuilder sb = new StringBuilder("距离:");
        sb.append(user.location.distance);
        if (NullChecker.m81303a(user.location.region)) {
            sb.append("\n国家:");
            sb.append(user.location.region.country);
            sb.append("\n城市:");
            sb.append(user.location.region.city);
            sb.append("\n地区:");
            sb.append(user.location.region.district);
        }
        c4309eDialog.m20504F(sb.toString());
        c4309eDialog.m20568z0();
    }
}
