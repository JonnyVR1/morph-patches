package com.p000p1.mobile.putong.core.util;

import android.app.Activity;
import android.content.Context;
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
import com.google.common.base.Optional;
import com.google.gson.Gson;
import com.p000p1.mobile.putong.core.data.ActionData;
import com.p000p1.mobile.putong.core.data.ActionToast;
import com.p000p1.mobile.putong.core.data.ActionToastStyle;
import com.p000p1.mobile.putong.core.data.ActionToastStyleButton;
import com.p000p1.mobile.putong.core.data.ActionToastStyleIcons;
import com.p000p1.mobile.putong.core.data.Active;
import com.p000p1.mobile.putong.core.data.AppealInfo;
import com.p000p1.mobile.putong.core.data.BarLoverplaces;
import com.p000p1.mobile.putong.core.data.CardOption;
import com.p000p1.mobile.putong.core.data.ChatGiftInfo;
import com.p000p1.mobile.putong.core.data.ChatMM;
import com.p000p1.mobile.putong.core.data.ChatPartnerText;
import com.p000p1.mobile.putong.core.data.ChatPartners;
import com.p000p1.mobile.putong.core.data.CityCBanner;
import com.p000p1.mobile.putong.core.data.CityCData;
import com.p000p1.mobile.putong.core.data.ConvAdditionalSwiper;
import com.p000p1.mobile.putong.core.data.Conversation;
import com.p000p1.mobile.putong.core.data.ConversationType;
import com.p000p1.mobile.putong.core.data.CoreGiftPanelName;
import com.p000p1.mobile.putong.core.data.CoreStaticData;
import com.p000p1.mobile.putong.core.data.Coupon;
import com.p000p1.mobile.putong.core.data.FakeGuideData;
import com.p000p1.mobile.putong.core.data.Figure;
import com.p000p1.mobile.putong.core.data.FourSelectOneAdCardData;
import com.p000p1.mobile.putong.core.data.Greeting;
import com.p000p1.mobile.putong.core.data.GreetingSummary;
import com.p000p1.mobile.putong.core.data.GroupInvitation;
import com.p000p1.mobile.putong.core.data.InvitationInfo;
import com.p000p1.mobile.putong.core.data.Literatures;
import com.p000p1.mobile.putong.core.data.LiteraturesComments;
import com.p000p1.mobile.putong.core.data.MatchSuccessAnimTime;
import com.p000p1.mobile.putong.core.data.Merchandise;
import com.p000p1.mobile.putong.core.data.MerchandiseTimeUnit;
import com.p000p1.mobile.putong.core.data.Message;
import com.p000p1.mobile.putong.core.data.MessageAdditionalData;
import com.p000p1.mobile.putong.core.data.MessageExtData;
import com.p000p1.mobile.putong.core.data.MessageType;
import com.p000p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p000p1.mobile.putong.core.data.NotificationStatus;
import com.p000p1.mobile.putong.core.data.PartialListOpt;
import com.p000p1.mobile.putong.core.data.PopGuide;
import com.p000p1.mobile.putong.core.data.Privilege;
import com.p000p1.mobile.putong.core.data.PrivilegeDetail;
import com.p000p1.mobile.putong.core.data.ProductCategory;
import com.p000p1.mobile.putong.core.data.PurchaseType;
import com.p000p1.mobile.putong.core.data.Questionnaire;
import com.p000p1.mobile.putong.core.data.QuestionnaireScene;
import com.p000p1.mobile.putong.core.data.QuestionnaireStrategy;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.data.ReminderAction;
import com.p000p1.mobile.putong.core.data.SalvagePopUser;
import com.p000p1.mobile.putong.core.data.SalvagePopUserType;
import com.p000p1.mobile.putong.core.data.SeeBlindBoxEnvelope;
import com.p000p1.mobile.putong.core.data.StateData;
import com.p000p1.mobile.putong.core.data.SuggestedComplimentItem;
import com.p000p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p000p1.mobile.putong.core.data.SwipeDirection;
import com.p000p1.mobile.putong.core.data.SystemReminder;
import com.p000p1.mobile.putong.core.data.UserIdType;
import com.p000p1.mobile.putong.core.data.UserWithRelationShip;
import com.p000p1.mobile.putong.core.data.VerificationCenter;
import com.p000p1.mobile.putong.core.data.VirtualCardType;
import com.p000p1.mobile.putong.core.data.VisitorSortType;
import com.p000p1.mobile.putong.core.data.VoiceCallStatus;
import com.p000p1.mobile.putong.core.data.WechatNotifySetting;
import com.p000p1.mobile.putong.core.p001ui.campus.StudentInfoAct;
import com.p000p1.mobile.putong.core.p001ui.debug.LabelDemoAct;
import com.p000p1.mobile.putong.core.p001ui.debug.PopDebugLayout;
import com.p000p1.mobile.putong.core.p001ui.diamond.TabUniteManager;
import com.p000p1.mobile.putong.core.p001ui.dlg.CoreDlg;
import com.p000p1.mobile.putong.core.p001ui.greet.C3135d;
import com.p000p1.mobile.putong.core.p001ui.growth.agealert.birthdayverify.BirthdayVerifyAct;
import com.p000p1.mobile.putong.core.p001ui.p002gp.C3121a;
import com.p000p1.mobile.putong.core.util.DebugUtil;
import com.p000p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p000p1.mobile.putong.core.util.verificationoptimization.VerificationAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.a;
import com.p1.mobile.android.ui.pushbubble.SimplePushBubble;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.api.push.PushTrackData;
import com.p1.mobile.putong.core.CoreBusinessModule;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.api.c;
import com.p1.mobile.putong.core.api.e;
import com.p1.mobile.putong.core.api.x;
import com.p1.mobile.putong.core.api.y;
import com.p1.mobile.putong.core.newui.appeal.AppealProgressAct;
import com.p1.mobile.putong.core.newui.greet.DynamicGreetListAct;
import com.p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p1.mobile.putong.core.newui.home.b;
import com.p1.mobile.putong.core.newui.home.base.impl.swipe.m1;
import com.p1.mobile.putong.core.newui.home.base.impl.swipe.u;
import com.p1.mobile.putong.core.newui.home.card.expanded.holder.HomeCardExpandedType;
import com.p1.mobile.putong.core.newui.home.card.expanded.transform.OldInfoTransNewAct;
import com.p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p1.mobile.putong.core.newui.intltribe.IntlTribeSwipeAct;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.newui.main.NewMainViewModel;
import com.p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p1.mobile.putong.core.newui.newuserbatchgreet.NewUserBatchGreetAct;
import com.p1.mobile.putong.core.newui.profile.dialog.MediaRecorderFrag;
import com.p1.mobile.putong.core.newui.profile.expandprofilelike.ExpandProfileLikeAct;
import com.p1.mobile.putong.core.newui.profile.understandme.BusinessWebViewAct;
import com.p1.mobile.putong.core.newui.supreme.SupremeCustomAct;
import com.p1.mobile.putong.core.newui.voicecall.VoiceCallAct;
import com.p1.mobile.putong.core.ui.ad.tencent.debug.DebugSplashAdAct;
import com.p1.mobile.putong.core.ui.ad.tencent.debug.DebugSplashTTAdAct;
import com.p1.mobile.putong.core.ui.likedusers.LikedUsersAct;
import com.p1.mobile.putong.core.ui.likedusers.tablayout.NewMyLikedUsersAct;
import com.p1.mobile.putong.core.ui.lovebuzz.memoji.MemojiBuzzAct;
import com.p1.mobile.putong.core.ui.marry.audit.MarryInfoAuditStatusAct;
import com.p1.mobile.putong.core.ui.marry.profile.edit.MarryProfileEditAct;
import com.p1.mobile.putong.core.ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p1.mobile.putong.core.ui.marry.status.MarryStatusSetAct;
import com.p1.mobile.putong.core.ui.match.MatchAct;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchManager;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchMatchUser;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchPushUser;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.p1.mobile.putong.core.ui.pricerecall.PriceRecallGetSurprise2Dialog;
import com.p1.mobile.putong.core.ui.profile.CityTopGreetDialog;
import com.p1.mobile.putong.core.ui.profile.TagGuidePicAct;
import com.p1.mobile.putong.core.ui.profile.loop.LoopFragmentFactory;
import com.p1.mobile.putong.core.ui.profile.loop.LoopInputType;
import com.p1.mobile.putong.core.ui.profile.loop.ProfileInfoLoopEditAct;
import com.p1.mobile.putong.core.ui.promotion.PurchasePromotionAct;
import com.p1.mobile.putong.core.ui.result.PurchaseResultAct;
import com.p1.mobile.putong.core.ui.seepop.NewLikeView;
import com.p1.mobile.putong.core.ui.svip.guide.SVIPIntlGuideAct;
import com.p1.mobile.putong.core.ui.verification.national.IntroductionAct;
import com.p1.mobile.putong.core.ui.verification.national.NationalIdAuthAct;
import com.p1.mobile.putong.core.ui.verification.remind.hold.AvatarForceChangeAct;
import com.p1.mobile.putong.core.ui.verification.remind.result.AvatarResultAct;
import com.p1.mobile.putong.core.ui.vip.VipAct;
import com.p1.mobile.putong.core.ui.vip.VipLocationHistoryAct;
import com.p1.mobile.putong.core.ui.vip.picks.PicksHelper;
import com.p1.mobile.putong.data.ComDiamond;
import com.p1.mobile.putong.data.Contact;
import com.p1.mobile.putong.data.ConversationStatus;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.CounterLikeLimit;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.IdVerificationResult;
import com.p1.mobile.putong.data.LiveState;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Membership;
import com.p1.mobile.putong.data.NavigationIntent;
import com.p1.mobile.putong.data.OMSAdCardInfo;
import com.p1.mobile.putong.data.OpenSdkCodeAuth;
import com.p1.mobile.putong.data.Passby;
import com.p1.mobile.putong.data.PicVerification;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.ProfileCompletion;
import com.p1.mobile.putong.data.ProfileLike;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.PushMessageCustom;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.RelationshipExtensions;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.Studies;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserLiveLabel;
import com.p1.mobile.putong.data.UserLiveState;
import com.p1.mobile.putong.data.UssTags;
import com.p1.mobile.putong.data.VerificationNetworkData;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.dbcenter.parse.JsonParseHelper;
import com.p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.ui.webview.AccessTokenWebViewAct;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
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
import l.a5x;
import l.a6h0;
import l.aag0;
import l.aci;
import l.ae70;
import l.ahl0;
import l.ap7;
import l.b83;
import l.bcp;
import l.bkp;
import l.bzv;
import l.c4g0;
import l.cpk0;
import l.d30;
import l.da;
import l.dd80;
import l.dej;
import l.e30;
import l.e4w;
import l.e51;
import l.eqh0;
import l.ezc0;
import l.f30;
import l.f6c0;
import l.f7e0;
import l.f8c;
import l.f9p;
import l.fy80;
import l.g30;
import l.g4h0;
import l.gei;
import l.ggi;
import l.gp80;
import l.h7j;
import l.hdb0;
import l.hpd0;
import l.hpk0;
import l.hqo;
import l.i0e;
import l.ic50;
import l.idi;
import l.itk;
import l.iwf;
import l.j2e0;
import l.j6b0;
import l.j760;
import l.jj4;
import l.jo0;
import l.km80;
import l.l9j;
import l.lra0;
import l.lrb;
import l.lsi0;
import l.lva;
import l.m6h0;
import l.m7e0;
import l.mbj;
import l.mkd0;
import l.mqi0;
import l.mu5;
import l.mvm;
import l.myc0;
import l.myf;
import l.na8;
import l.nah0;
import l.nlm0;
import l.npo;
import l.nt30;
import l.o8m;
import l.osi0;
import l.oxa0;
import l.oyd;
import l.p2b0;
import l.p420;
import l.p5f;
import l.pa30;
import l.peq0;
import l.psm;
import l.psq;
import l.puf0;
import l.puk0;
import l.q860;
import l.q89;
import l.qff0;
import l.qib0;
import l.qqi0;
import l.qsd0;
import l.qth0;
import l.qug0;
import l.r5b0;
import l.r9m;
import l.rnl0;
import l.roj0;
import l.rwk0;
import l.rxa0;
import l.rxg0;
import l.s8b0;
import l.sa40;
import l.sbe0;
import l.sd60;
import l.sh50;
import l.sjp;
import l.swh0;
import l.swk0;
import l.t100;
import l.tbk;
import l.tpd0;
import l.tqm0;
import l.tvf;
import l.u0n;
import l.u4c0;
import l.u59;
import l.uc80;
import l.ud2;
import l.uld0;
import l.upa;
import l.uq40;
import l.uqd0;
import l.ura;
import l.ut20;
import l.uyc0;
import l.uz4;
import l.v0x;
import l.vqd0;
import l.vwb;
import l.w0c0;
import l.w29;
import l.w3z;
import l.w6h0;
import l.w6p;
import l.w9j;
import l.wc80;
import l.wf6;
import l.wn90;
import l.x2c0;
import l.x83;
import l.xaj0;
import l.xdl0;
import l.xdx;
import l.xe40;
import l.xh0;
import l.xl4;
import l.xzc0;
import l.y1j;
import l.ybx;
import l.zar;
import l.zbi0;
import l.zd2;
import l.zl80;
import l.zpd0;
import l.zvf0;
import l.zvo;
import l.zxz;
import l.zyc0;
import org.json.JSONException;
import org.json.JSONObject;
import p003l.aa40;
import p003l.abi;
import p003l.ark;
import p003l.b4h0;
import p003l.bo5;
import p003l.c30;
import p003l.e9n;
import p003l.ew40;
import p003l.g53;
import p003l.gij0;
import p003l.gxf;
import p003l.m45;
import p003l.mah0;
import p003l.n2l;
import p003l.o45;
import p003l.ok3;
import p003l.pmp0;
import p003l.q3h0;
import p003l.snm;
import p003l.v9b;
import p003l.vyc0;
import p003l.xjc0;
import rx.Notification;
import rx.schedulers.Schedulers;
import v.VButton;
import v.VEditText;
import v.VIcon;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class DebugUtil {

    /* JADX INFO: renamed from: a */
    public static final uqd0 f2193a = new uqd0("mt_url", "");

    /* JADX INFO: renamed from: b */
    public static final hpd0 f2194b;

    /* JADX INFO: renamed from: c */
    public static final hpd0 f2195c;

    /* JADX INFO: renamed from: d */
    public static final hpd0 f2196d;

    /* JADX INFO: renamed from: e */
    public static final tpd0 f2197e;

    /* JADX INFO: renamed from: f */
    public static boolean f2198f;

    /* JADX INFO: renamed from: g */
    public static final tpd0 f2199g;

    /* JADX INFO: renamed from: h */
    public static final hpd0 f2200h;

    /* JADX INFO: renamed from: i */
    public static final hpd0 f2201i;

    /* JADX INFO: renamed from: j */
    public static final String[][] f2202j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$a */
    public class C3155a implements w9j<Conversation, Conversation> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$a$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Conversation f2203a;

            public a(Conversation conversation) {
                this.f2203a = conversation;
            }

            public void call() {
                Conversation conversationM12312clone = this.f2203a.m12312clone();
                String str = ((DbObject) conversationM12312clone).id;
                ChatMM chatMM = conversationM12312clone.additional.chatMM;
                chatMM.pinChatSuggested = true;
                chatMM.expireTime = mqi0.o() + 120000;
                CoreModule.c.f0.mq(conversationM12312clone);
            }
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Conversation call(Conversation conversation) {
            CoreModule.c.U.a(new a(conversation));
            return null;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$a0 */
    public class C3156a0 implements e30<User> {
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
    public class C3157a1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2205a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2206b;

        public C3157a1(ArrayList arrayList, b bVar) {
            this.f2205a = arrayList;
            this.f2206b = bVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m4691a() {
            hpd0 hpd0Var = CoreModule.c.f0.q1;
            hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        }

        public void call() {
            this.f2205a.clear();
            this.f2205a.add(vwb.Y("心动信号女性路经变短 开关：".concat(((Boolean) CoreModule.c.f0.q1.get()).booleanValue() ? "true" : "false"), new d30() { // from class: l.jdd
                public final void call() {
                    DebugUtil.C3157a1.m4691a();
                }
            }));
            this.f2206b.K1().showDebugMenu(this.f2205a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$a2 */
    public class RunnableC3158a2 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ v0x f2207a;

        public RunnableC3158a2(v0x v0xVar) {
            this.f2207a = v0xVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2207a.show();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$b */
    public class C3159b implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f2208a;

        public C3159b(b bVar) {
            this.f2208a = bVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m4692a(int i, int i2, Intent intent) {
            CoreModule.P().a().fl();
            return false;
        }

        public void call() {
            if (wn90.F().a == null) {
                ura.e().d().xc(CoreModule.c.e0.na().clone());
            }
            Intent intentX1 = ProfileInfoLoopEditAct.X1(this.f2208a.K1(), LoopFragmentFactory.LoopCreateEntryType.ENTRY_MOMENT_GAME, LoopInputType.BIRTHDAY, ura.e().d().Uc());
            intentX1.putExtra("loop_edit_patch_flag", true);
            xdl0.D(this.f2208a.C0()).startActivityForResult(intentX1, new a.a() { // from class: l.wbd
                /* JADX INFO: renamed from: a */
                public final boolean m10466a(int i, int i2, Intent intent) {
                    return DebugUtil.C3159b.m4692a(i, i2, intent);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$b0 */
    public class C3160b0 implements e30<User> {
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
    public class C3161b1 implements e30<Throwable> {
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$b2 */
    public class RunnableC3162b2 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            CoreModule.c.e0.g4.onNext("");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$c */
    public class C3163c implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f2209a;

        public C3163c(b bVar) {
            this.f2209a = bVar;
        }

        public void call() {
            this.f2209a.K1().Z5().r0(TabName.Me, NewMainViewModel.IconDotType.warning);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$c0 */
    public class C3164c0 implements e30<User> {
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
    public class C3165c1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2210a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2211b;

        public C3165c1(ArrayList arrayList, b bVar) {
            this.f2210a = arrayList;
            this.f2211b = bVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m4696a() {
            hpd0 hpd0Var = CoreModule.c.e0.n3;
            hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        }

        public void call() {
            this.f2210a.clear();
            this.f2210a.add(vwb.Y("好友上线提醒代发端内承接改版 开关：".concat(((Boolean) CoreModule.c.e0.n3.get()).booleanValue() ? "true" : "false"), new d30() { // from class: l.kdd
                public final void call() {
                    DebugUtil.C3165c1.m4696a();
                }
            }));
            this.f2211b.K1().showDebugMenu(this.f2210a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$c2 */
    public class C3166c2 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2212a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ com.p1.mobile.putong.core.newui.home.b f2213b;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$c2$a */
        public class a implements d30 {
            public a() {
            }

            public void call() {
                CoreModule.c.e0.s4.clear();
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$c2$b */
        public class b implements d30 {
            public b() {
            }

            public void call() {
                CoreModule.c.e0.t4.clear();
                CoreModule.c.e0.u4.clear();
                CoreModule.c.e0.v4.clear();
            }
        }

        public C3166c2(ArrayList arrayList, com.p1.mobile.putong.core.newui.home.b bVar) {
            this.f2212a = arrayList;
            this.f2213b = bVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m4697a(com.p1.mobile.putong.core.newui.home.b bVar) {
            ChatPartners chatPartnersNew_ = ChatPartners.new_();
            for (int i = 1; i < 20; i++) {
                ChatPartnerText chatPartnerTextNew_ = ChatPartnerText.new_();
                chatPartnerTextNew_.value = "这是一条文案，普通的文案" + String.valueOf(i);
                chatPartnersNew_.texts.add(chatPartnerTextNew_);
            }
            for (int i2 = 0; i2 < 9; i2++) {
                chatPartnersNew_.users.add(CoreModule.K().me_());
            }
            new uz4(bVar.K1(), chatPartnersNew_).show();
        }

        public void call() {
            this.f2212a.clear();
            ArrayList arrayList = this.f2212a;
            final com.p1.mobile.putong.core.newui.home.b bVar = this.f2213b;
            arrayList.add(vwb.Y("弹出底部半屏弹窗", new d30() { // from class: l.ggd
                public final void call() {
                    DebugUtil.C3166c2.m4697a(bVar);
                }
            }));
            this.f2212a.add(vwb.Y("清楚客户端1小时请求频控", new a()));
            this.f2212a.add(vwb.Y("清楚半屏弹窗展示频控", new b()));
            this.f2213b.K1().showDebugMenu(this.f2212a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$d */
    public class C3167d implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f2216a;

        public C3167d(b bVar) {
            this.f2216a = bVar;
        }

        public void call() {
            this.f2216a.K1().Z5().r0(TabName.Me, NewMainViewModel.IconDotType.diamond);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$d0 */
    public class C3168d0 implements e30<Boolean> {
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$d1 */
    public class C3169d1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2217a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2218b;

        public C3169d1(ArrayList arrayList, b bVar) {
            this.f2217a = arrayList;
            this.f2218b = bVar;
        }

        public void call() {
            this.f2217a.clear();
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
            actionToastStyleButton.buttonBackground = "orange";
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
            qug0.g().k(this.f2218b, actionDataNew_);
            this.f2218b.K1().showDebugMenu(this.f2217a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$d2 */
    public class RunnableC3170d2 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            CoreModule.c.U.a(new d30() { // from class: l.hgd
                public final void call() {
                    CoreModule.k.m.delete("fake_conversation_local_summary_marriage_conversation");
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$e */
    public class C3171e implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f2219a;

        public C3171e(b bVar) {
            this.f2219a = bVar;
        }

        public void call() {
            this.f2219a.K1().Z5().r0(TabName.Me, NewMainViewModel.IconDotType.edit_profile);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$e0 */
    public class C3172e0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2220a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2221b;

        public C3172e0(ArrayList arrayList, b bVar) {
            this.f2220a = arrayList;
            this.f2221b = bVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m4700a() {
            q89 q89Var = CoreModule.c.p0;
            q89Var.V = !q89Var.V;
        }

        public void call() {
            this.f2220a.clear();
            this.f2220a.add(vwb.Y("toggleUltra模式，当前：" + CoreModule.c.p0.V, new d30() { // from class: l.acd
                public final void call() {
                    DebugUtil.C3172e0.m4700a();
                }
            }));
            ArrayList arrayList = this.f2220a;
            final b bVar = this.f2221b;
            arrayList.add(vwb.Y("deeplink", new d30() { // from class: l.bcd
                public final void call() {
                    j2e0.m(bVar.K1(), Uri.parse("tantan://intlPurchase/premium?skuDuration=3m&autoPay=true"));
                }
            }));
            this.f2221b.K1().showDebugMenu(this.f2220a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$e1 */
    public class C3173e1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2222a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2223b;

        public C3173e1(ArrayList arrayList, b bVar) {
            this.f2222a = arrayList;
            this.f2223b = bVar;
        }

        public void call() {
            this.f2222a.clear();
            this.f2222a.add(vwb.Y("超级喜欢pup", new d30() { // from class: l.ldd
                public final void call() {
                    rxg0.j().i.onNext(Boolean.TRUE);
                }
            }));
            this.f2222a.add(vwb.Y("TA已认证头像为本人哦~ show", new d30() { // from class: l.mdd
                public final void call() {
                    CoreModule.c.e0.q2.put(Boolean.FALSE);
                }
            }));
            this.f2223b.K1().showDebugMenu(this.f2222a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$e2 */
    public class C3174e2 implements d30 {
        public void call() {
            CoreModule.c.e0.r5.clear();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$f */
    public class C3175f implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f2224a;

        public C3175f(b bVar) {
            this.f2224a = bVar;
        }

        public void call() {
            this.f2224a.K1().startActivity(CoreModule.K().m5238yp(this.f2224a.C0(), ((DbObject) CoreModule.c.e0.p9()).id, "from_questions_answers", false, true, false, RelationshipStatus.get("unknown_"), 273, false, true, false, ReminderAction.photo));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$f0 */
    public class C3176f0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2225a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2226b;

        public C3176f0(ArrayList arrayList, b bVar) {
            this.f2225a = arrayList;
            this.f2226b = bVar;
        }

        public void call() {
            this.f2225a.clear();
            this.f2225a.add(vwb.Y("清除气泡频控", new d30() { // from class: l.ccd
                public final void call() {
                    CoreModule.c.e0.I6.clear();
                }
            }));
            this.f2226b.K1().showDebugMenu(this.f2225a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$f1 */
    public class C3177f1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2227a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2228b;

        public C3177f1(ArrayList arrayList, b bVar) {
            this.f2227a = arrayList;
            this.f2228b = bVar;
        }

        public void call() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$f2 */
    public class C3178f2 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f2229a;

        public C3178f2(b bVar) {
            this.f2229a = bVar;
        }

        public void call() {
            FakeGuideData fakeGuideDataNew_ = FakeGuideData.new_();
            fakeGuideDataNew_.changeAvatar = true;
            fakeGuideDataNew_.type = "mainAvatar";
            fakeGuideDataNew_.identifier = ((Media) CoreModule.c.e0.p9().picture(0).cover()).url;
            myf.V(this.f2229a.K1(), fakeGuideDataNew_);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$g */
    public class C3179g implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f2230a;

        public C3179g(b bVar) {
            this.f2230a = bVar;
        }

        public void call() {
            wn90.F().i0(this.f2230a.K1());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$g0 */
    public class C3180g0 implements w9j<q860<Conversation>, Conversation> {
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Conversation call(q860<Conversation> q860Var) {
            for (Conversation conversation : q860Var.a) {
                if (((DbObject) conversation)._id > 0 && TextUtils.equals(conversation.convType, "default") && TEnum.equals(conversation.status, "default")) {
                    return conversation;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$g1 */
    public class C3181g1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2231a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2232b;

        public C3181g1(ArrayList arrayList, b bVar) {
            this.f2231a = arrayList;
            this.f2232b = bVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m4706a() {
            DebugUtil.f2197e.put(-1);
            DebugUtil.f2196d.put(Boolean.FALSE);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m4707b() {
            hpd0 hpd0Var = DebugUtil.f2196d;
            hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        }

        public void call() {
            this.f2231a.clear();
            this.f2231a.add(vwb.Y("开启检测" + DebugUtil.f2196d.get(), new d30() { // from class: l.ndd
                public final void call() {
                    DebugUtil.C3181g1.m4707b();
                }
            }));
            this.f2231a.add(vwb.Y("立即检测：" + DebugUtil.f2197e.get(), new d30() { // from class: l.odd
                public final void call() {
                    DebugUtil.f2197e.put(0);
                }
            }));
            this.f2231a.add(vwb.Y("重置检测逻辑：", new d30() { // from class: l.pdd
                public final void call() {
                    DebugUtil.C3181g1.m4706a();
                }
            }));
            this.f2232b.K1().showDebugMenu(this.f2231a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$g2 */
    public class C3182g2 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f2233a;

        public C3182g2(b bVar) {
            this.f2233a = bVar;
        }

        public void call() {
            FakeGuideData fakeGuideDataNew_ = FakeGuideData.new_();
            fakeGuideDataNew_.changeAvatar = true;
            fakeGuideDataNew_.type = "otherAvatar";
            fakeGuideDataNew_.identifier = ((Media) CoreModule.c.e0.p9().picture(1)).url;
            myf.V(this.f2233a.K1(), fakeGuideDataNew_);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$h */
    public class C3183h implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f2234a;

        public C3183h(b bVar) {
            this.f2234a = bVar;
        }

        public void call() {
            qth0.M(this.f2234a.K1(), true, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$h0 */
    public class C3184h0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2235a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2236b;

        public C3184h0(ArrayList arrayList, b bVar) {
            this.f2235a = arrayList;
            this.f2236b = bVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m4709a(b bVar) {
            User userNa = CoreModule.c.e0.na();
            SalvagePopUser salvagePopUserNew_ = SalvagePopUser.new_();
            salvagePopUserNew_.salvagePopUserType = SalvagePopUserType.get(SalvagePopUserType.rightSwipe);
            salvagePopUserNew_.user = userNa;
            SalvagePopUser salvagePopUserNew_2 = SalvagePopUser.new_();
            salvagePopUserNew_2.salvagePopUserType = SalvagePopUserType.get("see");
            salvagePopUserNew_2.user = userNa;
            ArrayList arrayList = new ArrayList();
            arrayList.add(salvagePopUserNew_);
            arrayList.add(salvagePopUserNew_);
            arrayList.add(salvagePopUserNew_2);
            arrayList.add(salvagePopUserNew_2);
            sjp.Companion.i(bVar.K1(), true, arrayList, (e30) null, (e30) null, (e30) null);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m4710b() {
            CoreModule.c.H2.R.clear();
            CoreModule.c.H2.S.clear();
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m4711c(b bVar) {
            User userNa = CoreModule.c.e0.na();
            SalvagePopUser salvagePopUserNew_ = SalvagePopUser.new_();
            salvagePopUserNew_.salvagePopUserType = SalvagePopUserType.get(SalvagePopUserType.rightSwipe);
            salvagePopUserNew_.user = userNa;
            ArrayList arrayList = new ArrayList();
            arrayList.add(salvagePopUserNew_);
            sjp.Companion.i(bVar.K1(), false, arrayList, (e30) null, (e30) null, (e30) null);
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m4712d(b bVar) {
            User userNa = CoreModule.c.e0.na();
            SalvagePopUser salvagePopUserNew_ = SalvagePopUser.new_();
            salvagePopUserNew_.salvagePopUserType = SalvagePopUserType.get(SalvagePopUserType.rightSwipe);
            salvagePopUserNew_.user = userNa;
            SalvagePopUser salvagePopUserNew_2 = SalvagePopUser.new_();
            salvagePopUserNew_2.salvagePopUserType = SalvagePopUserType.get("see");
            salvagePopUserNew_2.user = userNa;
            ArrayList arrayList = new ArrayList();
            arrayList.add(salvagePopUserNew_);
            arrayList.add(salvagePopUserNew_);
            arrayList.add(salvagePopUserNew_2);
            arrayList.add(salvagePopUserNew_2);
            f9p.Companion.i(bVar.K1(), false, arrayList, (Runnable) null, (e30) null, (e30) null, (e30) null);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m4713e(b bVar) {
            User userNa = CoreModule.c.e0.na();
            SalvagePopUser salvagePopUserNew_ = SalvagePopUser.new_();
            salvagePopUserNew_.salvagePopUserType = SalvagePopUserType.get(SalvagePopUserType.rightSwipe);
            salvagePopUserNew_.user = userNa;
            SalvagePopUser salvagePopUserNew_2 = SalvagePopUser.new_();
            salvagePopUserNew_2.salvagePopUserType = SalvagePopUserType.get("see");
            salvagePopUserNew_2.user = userNa;
            ArrayList arrayList = new ArrayList();
            arrayList.add(salvagePopUserNew_);
            arrayList.add(salvagePopUserNew_);
            arrayList.add(salvagePopUserNew_);
            arrayList.add(salvagePopUserNew_2);
            arrayList.add(salvagePopUserNew_2);
            arrayList.add(salvagePopUserNew_2);
            f9p.Companion.i(bVar.K1(), true, arrayList, (Runnable) null, (e30) null, (e30) null, (e30) null);
        }

        public void call() {
            this.f2235a.clear();
            this.f2235a.add(vwb.Y("国际化 会员挽回弹窗缓存清空", new d30() { // from class: l.dcd
                public final void call() {
                    DebugUtil.C3184h0.m4710b();
                }
            }));
            ArrayList arrayList = this.f2235a;
            final b bVar = this.f2236b;
            arrayList.add(vwb.Y("premium 挽回弹窗", new d30() { // from class: l.ecd
                public final void call() {
                    DebugUtil.C3184h0.m4713e(bVar);
                }
            }));
            ArrayList arrayList2 = this.f2235a;
            final b bVar2 = this.f2236b;
            arrayList2.add(vwb.Y("premium 挽回弹窗大", new d30() { // from class: l.fcd
                public final void call() {
                    DebugUtil.C3184h0.m4712d(bVar2);
                }
            }));
            ArrayList arrayList3 = this.f2235a;
            final b bVar3 = this.f2236b;
            arrayList3.add(vwb.Y("ultra 挽回弹窗小", new d30() { // from class: l.gcd
                public final void call() {
                    DebugUtil.C3184h0.m4709a(bVar3);
                }
            }));
            ArrayList arrayList4 = this.f2235a;
            final b bVar4 = this.f2236b;
            arrayList4.add(vwb.Y("ultra 挽回弹窗大", new d30() { // from class: l.hcd
                public final void call() {
                    DebugUtil.C3184h0.m4711c(bVar4);
                }
            }));
            this.f2236b.K1().showDebugMenu(this.f2235a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$h1 */
    public class C3185h1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2237a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2238b;

        public C3185h1(ArrayList arrayList, b bVar) {
            this.f2237a = arrayList;
            this.f2238b = bVar;
        }

        public void call() {
            this.f2237a.clear();
            this.f2237a.add(vwb.Y("清除聊天助手相关本地缓存", new d30() { // from class: l.qdd
                public final void call() {
                    CoreModule.c.U1.R.clear();
                }
            }));
            this.f2238b.K1().showDebugMenu(this.f2237a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$h2 */
    public class C3186h2 implements d30 {
        public void call() {
            hpd0 hpd0Var = CoreModule.c.e0.d5;
            hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$i */
    public class C3187i implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f2239a;

        public C3187i(b bVar) {
            this.f2239a = bVar;
        }

        public void call() {
            this.f2239a.K1().startActivity(TagGuidePicAct.Y1(this.f2239a.K1(), true, "from_upload_pic", "from_complete_equity_guide_card"));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$i0 */
    public class C3188i0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2240a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2241b;

        public C3188i0(ArrayList arrayList, b bVar) {
            this.f2240a = arrayList;
            this.f2241b = bVar;
        }

        public void call() {
            this.f2240a.clear();
            ArrayList arrayList = this.f2240a;
            final b bVar = this.f2241b;
            arrayList.add(vwb.Y("支付 vip 升级 svip", new d30() { // from class: l.icd
                public final void call() {
                    b bVar2 = bVar;
                    new hqo(bVar2.K1(), PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE).p(aqo.m5501h(bVar2.K1(), bVar2.K1() != null ? bVar2.K1().iap().i() : null), false, "test_high_vip_upgrade_to_premium_1mo");
                }
            }));
            ArrayList arrayList2 = this.f2240a;
            final b bVar2 = this.f2241b;
            arrayList2.add(vwb.Y("svip 升级购买时长选择弹窗", new d30() { // from class: l.jcd
                public final void call() {
                    new bkp.f(bVar2.K1()).c("p_knowmyself_purchase,e_knowmyself_test,click").f(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE).g();
                }
            }));
            ArrayList arrayList3 = this.f2240a;
            final b bVar3 = this.f2241b;
            arrayList3.add(vwb.Y("svip 订阅页升级购买时长选择弹窗", new d30() { // from class: l.kcd
                public final void call() {
                    new bkp.f(bVar3.K1()).c("p_knowmyself_purchase,e_knowmyself_test,click").f(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE).d(true).g();
                }
            }));
            ArrayList arrayList4 = this.f2240a;
            final b bVar4 = this.f2241b;
            arrayList4.add(vwb.Y("ultra 升级购买时长选择弹窗", new d30() { // from class: l.lcd
                public final void call() {
                    new bkp.f(bVar4.K1()).c("p_knowmyself_purchase,e_knowmyself_test,click").f(PurchaseType.TYPE_ULTRA_PREMIUM).g();
                }
            }));
            ArrayList arrayList5 = this.f2240a;
            final b bVar5 = this.f2241b;
            arrayList5.add(vwb.Y("ultra 订阅页升级购买时长选择弹窗", new d30() { // from class: l.mcd
                public final void call() {
                    new bkp.f(bVar5.K1()).c("p_knowmyself_purchase,e_knowmyself_test,click").f(PurchaseType.TYPE_ULTRA_PREMIUM).d(true).g();
                }
            }));
            this.f2241b.K1().showDebugMenu(this.f2240a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$i1 */
    public class C3189i1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2242a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2243b;

        public C3189i1(ArrayList arrayList, b bVar) {
            this.f2242a = arrayList;
            this.f2243b = bVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m4720a(b bVar) {
            CoreModule.c.V1.S = new ArrayList();
            for (int i = 0; i < 9; i++) {
                c cVar = CoreModule.c;
                cVar.V1.S.add(cVar.e0.p9());
            }
            xe40.f().j(bVar.K1(), CoreModule.c.V1.S);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m4721b(b bVar) {
            CoreModule.c.V1.R = new ArrayList();
            List<T> list = ((PartialListOpt) CoreModule.c.m0.a0.e()).loaded;
            UserIdType userIdTypeNew_ = UserIdType.new_();
            userIdTypeNew_.userId = ((CoreSuggested.UserInfo) list.get(0)).id;
            CoreModule.c.V1.R.add(userIdTypeNew_);
            if (bVar.A2().d() instanceof NewNewProfileCard) {
                NewNewProfileCard newNewProfileCardD = bVar.A2().d();
                newNewProfileCardD.M2 = false;
                newNewProfileCardD.H3();
            }
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m4722c() {
            hpd0 hpd0Var = CoreModule.c.V1.V;
            hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m4723d() {
            hpd0 hpd0Var = CoreModule.c.V1.U;
            hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m4725f() {
            CoreModule.c.V1.S = new ArrayList();
            for (int i = 0; i < 9; i++) {
                c cVar = CoreModule.c;
                cVar.V1.S.add(cVar.e0.p9());
            }
            ConversationsList.t1.onNext(roj0.a);
        }

        public void call() {
            this.f2242a.clear();
            this.f2242a.add(vwb.Y("实验1开关: " + CoreModule.c.V1.U.get(), new d30() { // from class: l.rdd
                public final void call() {
                    DebugUtil.C3189i1.m4723d();
                }
            }));
            this.f2242a.add(vwb.Y("实验2开关: " + CoreModule.c.V1.V.get(), new d30() { // from class: l.sdd
                public final void call() {
                    DebugUtil.C3189i1.m4722c();
                }
            }));
            this.f2242a.add(vwb.Y("模拟新用户", new d30() { // from class: l.tdd
                public final void call() {
                    DebugUtil.C3189i1.m4725f();
                }
            }));
            ArrayList arrayList = this.f2242a;
            final b bVar = this.f2243b;
            arrayList.add(vwb.Y("划卡迎新bubble", new d30() { // from class: l.udd
                public final void call() {
                    DebugUtil.C3189i1.m4720a(bVar);
                }
            }));
            this.f2242a.add(vwb.Y("清除迎新相关本地数据", new d30() { // from class: l.vdd
                public final void call() {
                    CoreModule.c.V1.W.clear();
                }
            }));
            ArrayList arrayList2 = this.f2242a;
            final b bVar2 = this.f2243b;
            arrayList2.add(vwb.Y("划卡迎新tip", new d30() { // from class: l.wdd
                public final void call() {
                    DebugUtil.C3189i1.m4721b(bVar2);
                }
            }));
            ArrayList arrayList3 = this.f2242a;
            final b bVar3 = this.f2243b;
            arrayList3.add(vwb.Y("打开欢迎页", new d30() { // from class: l.xdd
                public final void call() {
                    b bVar4 = bVar3;
                    bVar4.K1().startActivity(new Intent((Context) bVar4.K1(), (Class<?>) NewUserBatchGreetAct.class));
                }
            }));
            this.f2243b.K1().showDebugMenu(this.f2242a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$i2 */
    public class C3190i2 implements d30 {
        public void call() {
            hpd0 hpd0Var = CoreModule.c.e0.G5;
            hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$j */
    public class C3191j implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f2244a;

        public C3191j(b bVar) {
            this.f2244a = bVar;
        }

        public void call() {
            this.f2244a.K1().startActivity(TagGuidePicAct.Y1(this.f2244a.K1(), true, "from_upload_pic", "from_complete_equity_guide"));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$j0 */
    public class C3192j0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2245a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ com.p1.mobile.putong.core.newui.home.b f2246b;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$j0$a */
        public class a implements d30 {
            public a() {
            }

            public void call() {
                CoreModule.c.e0.M6.clear();
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$j0$b */
        public class b implements d30 {
            public b() {
            }

            public void call() {
                ura.e().d().Ud(C3192j0.this.f2246b.K1());
            }
        }

        public C3192j0(ArrayList arrayList, com.p1.mobile.putong.core.newui.home.b bVar) {
            this.f2245a = arrayList;
            this.f2246b = bVar;
        }

        public void call() {
            this.f2245a.clear();
            ArrayList arrayList = this.f2245a;
            final com.p1.mobile.putong.core.newui.home.b bVar = this.f2246b;
            arrayList.add(vwb.Y("tribe 划卡页", new d30() { // from class: l.ncd
                public final void call() {
                    b bVar2 = bVar;
                    bVar2.K1().startActivity(IntlTribeSwipeAct.X1(bVar2.K1(), "pursue", "short-term-fun", "short-term-fun", "https://auto.tancdn.com/v1/images/eyJpZCI6IjhCRDkzRjE5QkQ0MzQ5RDU4N0JCNTQ3NzQwRTBGMzhEIiwidyI6MTIwLCJoIjoxMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNzQ1MTAyODQzNTQ3NjQ4LCJwdCI6MjAyNTA2MTMxOH0.png", "https://auto.tancdn.com/v1/images/eyJpZCI6IjU0NTA3MkQ2N0MwQTRFN0ZCOEY0QzY2OTUzQUE1ODY1IiwidyI6NzUwLCJoIjoxNjI0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzQ4MzU1MDEyNjY2NDAwMDcxNiwicHQiOjIwMjUwNjEzMTh9.png"));
                }
            }));
            this.f2245a.add(vwb.Y("清除气泡频控", new a()));
            this.f2245a.add(vwb.Y("交友目的弹窗", new b()));
            this.f2246b.K1().showDebugMenu(this.f2245a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$j1 */
    public class C3193j1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f2249a;

        public C3193j1(b bVar) {
            this.f2249a = bVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m4728a(xaj0 xaj0Var) {
        }

        public void call() {
            qib0.R.a(((BitmapDrawable) this.f2249a.K1().getResources().getDrawable(x2c0.ht)).getBitmap()).subscribe(mkd0.H(new e30() { // from class: l.ydd
                public final void call(Object obj) {
                    DebugUtil.C3193j1.m4728a((xaj0) obj);
                }
            }, new e30() { // from class: l.zdd
                public final void call(Object obj) {
                    ((Throwable) obj).toString();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$j2 */
    public class C3194j2 implements d30 {
        public void call() {
            CoreModule.c.e0.E5.clear();
            CoreModule.c.e0.D5.clear();
            CoreModule.c.e0.F5.clear();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$k */
    public class C3195k implements d30 {
        public void call() {
            xjc0.m10866a(xjc0.f8499e);
            xjc0.m10866a(xjc0.f8500f);
            xjc0.m10866a(xjc0.f8501g);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$k0 */
    public class C3196k0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2250a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2251b;

        public C3196k0(ArrayList arrayList, b bVar) {
            this.f2250a = arrayList;
            this.f2251b = bVar;
        }

        public void call() {
            this.f2250a.clear();
            this.f2250a.add(vwb.Y("清除红点记录", new d30() { // from class: l.ocd
                public final void call() {
                    CoreModule.c.e0.L6.put(Boolean.FALSE);
                }
            }));
            this.f2251b.K1().showDebugMenu(this.f2250a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$k1 */
    public class C3197k1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2252a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2253b;

        public C3197k1(ArrayList arrayList, b bVar) {
            this.f2252a = arrayList;
            this.f2253b = bVar;
        }

        public void call() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$k2 */
    public class C3198k2 implements e30<User> {
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(User user) {
            user.toJson().toString();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$l */
    public class C3199l implements d30 {
        public void call() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$l0 */
    public class C3200l0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2254a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2255b;

        public C3200l0(ArrayList arrayList, b bVar) {
            this.f2254a = arrayList;
            this.f2255b = bVar;
        }

        public void call() {
            this.f2254a.clear();
            this.f2254a.add(vwb.Y("清除频控", new d30() { // from class: l.pcd
                public final void call() {
                    CoreModule.c.e0.K6.put(Boolean.FALSE);
                }
            }));
            this.f2255b.K1().showDebugMenu(this.f2254a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$l1 */
    public class C3201l1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2256a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2257b;

        public C3201l1(ArrayList arrayList, b bVar) {
            this.f2256a = arrayList;
            this.f2257b = bVar;
        }

        public void call() {
            this.f2256a.clear();
            this.f2256a.add(vwb.Y("清除boost引导相关本地数据", new d30() { // from class: l.aed
                public final void call() {
                    b83.d().a();
                }
            }));
            ArrayList arrayList = this.f2256a;
            final b bVar = this.f2257b;
            arrayList.add(vwb.Y("boost新引导弹窗", new d30() { // from class: l.bed
                public final void call() {
                    new x83(bVar.K1(), "p_home,accelerate_guide").show();
                }
            }));
            ArrayList arrayList2 = this.f2256a;
            final b bVar2 = this.f2257b;
            arrayList2.add(vwb.Y("boost结束底部弹窗", new d30() { // from class: l.ced
                public final void call() {
                    da.Companion.s(bVar2.K1());
                }
            }));
            this.f2256a.add(vwb.Y("插入boost引导卡", new d30() { // from class: l.ded
                public final void call() {
                    b83.d().e();
                }
            }));
            ArrayList arrayList3 = this.f2256a;
            final b bVar3 = this.f2257b;
            arrayList3.add(vwb.Y("boost引导入口push", new d30() { // from class: l.eed
                public final void call() {
                    b83.d().m(bVar3.K1());
                }
            }));
            this.f2257b.K1().showDebugMenu(this.f2256a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$l2 */
    public class C3202l2 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f2258a;

        public C3202l2(b bVar) {
            this.f2258a = bVar;
        }

        public void call() {
            this.f2258a.K1().startActivity(AvatarForceChangeAct.Z1(this.f2258a.K1(), 1, "debug"));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$m */
    public class C3203m implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f2259a;

        public C3203m(b bVar) {
            this.f2259a = bVar;
        }

        public void call() {
            this.f2259a.K1().startActivity(new Intent((Context) this.f2259a.K1(), (Class<?>) DebugFontWeightAct.class));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$m0 */
    public class C3204m0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2260a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2261b;

        public C3204m0(ArrayList arrayList, b bVar) {
            this.f2260a = arrayList;
            this.f2261b = bVar;
        }

        public void call() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$m1 */
    public class RunnableC3205m1 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            CoreModule.c.e0.h4.onNext(roj0.a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$m2 */
    public class C3206m2 implements d30 {
        public void call() {
            CoreModule.c.B0.g0.clear();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$n */
    public class C3207n implements d30 {
        public void call() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$n0 */
    public class C3208n0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2262a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2263b;

        public C3208n0(ArrayList arrayList, b bVar) {
            this.f2262a = arrayList;
            this.f2263b = bVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m4738a() {
            CoreModule.c.e0.E3.put("");
            c30.m5842g();
            CoreModule.c.e0.E3.put("");
        }

        public void call() {
            this.f2262a.clear();
            this.f2262a.add(vwb.Y("滑卡限制", new d30() { // from class: l.qcd
                public final void call() {
                    DebugUtil.C3208n0.m4738a();
                }
            }));
            this.f2263b.K1().showDebugMenu(this.f2262a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$n1 */
    public class C3209n1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2264a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2265b;

        public C3209n1(ArrayList arrayList, b bVar) {
            this.f2264a = arrayList;
            this.f2265b = bVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m4739a() {
            if (NullChecker.a(CoreModule.c.e0.J3)) {
                CoreModule.c.e0.J3.put("momocv");
            }
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m4740b() {
            if (NullChecker.a(CoreModule.c.e0.J3)) {
                CoreModule.c.e0.J3.put("tencent");
            }
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m4741c() {
            if (NullChecker.a(CoreModule.c.e0.J3)) {
                CoreModule.c.e0.J3.put("aliyunIntl");
            }
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m4742d() {
            if (NullChecker.a(CoreModule.c.e0.J3)) {
                CoreModule.c.e0.J3.put("tencentIntl");
            }
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m4743e() {
            if (NullChecker.a(CoreModule.c.e0.J3)) {
                CoreModule.c.e0.J3.put("volcEnginePro");
            }
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m4744f() {
            if (NullChecker.a(CoreModule.c.e0.J3)) {
                CoreModule.c.e0.J3.put("aliyun");
            }
        }

        public void call() {
            this.f2264a.clear();
            this.f2264a.add(vwb.Y("阿里", new d30() { // from class: l.fed
                public final void call() {
                    DebugUtil.C3209n1.m4744f();
                }
            }));
            this.f2264a.add(vwb.Y("腾讯", new d30() { // from class: l.ged
                public final void call() {
                    DebugUtil.C3209n1.m4740b();
                }
            }));
            this.f2264a.add(vwb.Y("腾讯国际化", new d30() { // from class: l.hed
                public final void call() {
                    DebugUtil.C3209n1.m4742d();
                }
            }));
            this.f2264a.add(vwb.Y("陌陌", new d30() { // from class: l.ied
                public final void call() {
                    DebugUtil.C3209n1.m4739a();
                }
            }));
            this.f2264a.add(vwb.Y("火山", new d30() { // from class: l.jed
                public final void call() {
                    DebugUtil.C3209n1.m4743e();
                }
            }));
            this.f2264a.add(vwb.Y("阿里国际化", new d30() { // from class: l.ked
                public final void call() {
                    DebugUtil.C3209n1.m4741c();
                }
            }));
            this.f2265b.K1().showDebugMenu(this.f2264a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$n2 */
    public class C3210n2 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ nt30 f2266a;

        public C3210n2(nt30 nt30Var) {
            this.f2266a = nt30Var;
        }

        public void call() {
            zar.g(this.f2266a.T4(), (d30) null, (d30) null);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$o */
    public class C3211o implements d30 {
        public void call() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$o0 */
    public class C3212o0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2267a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2268b;

        public C3212o0(ArrayList arrayList, b bVar) {
            this.f2267a = arrayList;
            this.f2268b = bVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m4745a() {
            hpd0 hpd0Var = CoreModule.c.e0.A3;
            Boolean bool = Boolean.TRUE;
            hpd0Var.put(bool);
            CoreModule.c.e0.B3.put(bool);
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m4747c() {
            CoreModule.c.e0.S3.put(Boolean.FALSE);
            CoreModule.c.e0.T3.put(0);
        }

        public void call() {
            this.f2267a.clear();
            this.f2267a.add(vwb.Y("清空tip标记", new d30() { // from class: l.rcd
                public final void call() {
                    CoreModule.c.e0.z3.put(Boolean.TRUE);
                }
            }));
            this.f2267a.add(vwb.Y("清空撤回记录", new d30() { // from class: l.scd
                public final void call() {
                    DebugUtil.C3212o0.m4747c();
                }
            }));
            this.f2267a.add(vwb.Y("启动处理一次", new d30() { // from class: l.tcd
                public final void call() {
                    DebugUtil.C3212o0.m4745a();
                }
            }));
            this.f2268b.K1().showDebugMenu(this.f2267a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$o1 */
    public class C3213o1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2269a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ com.p1.mobile.putong.core.newui.home.b f2270b;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$o1$a */
        public class a implements d30 {
            public a() {
            }

            public void call() {
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$o1$b */
        public class b implements d30 {
            public b() {
            }

            public void call() {
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$o1$c */
        public class c implements d30 {
            public c() {
            }

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

        public C3213o1(ArrayList arrayList, com.p1.mobile.putong.core.newui.home.b bVar) {
            this.f2269a = arrayList;
            this.f2270b = bVar;
        }

        /* JADX INFO: renamed from: A */
        public static /* synthetic */ void m4748A(View view) {
        }

        /* JADX INFO: renamed from: F */
        public static /* synthetic */ void m4753F(final com.p1.mobile.putong.core.newui.home.b bVar) {
            AppealInfo appealInfo = new AppealInfo();
            appealInfo.appeal_count = 0;
            appealInfo.status = "before";
            iwf.e().g(bVar.K1(), new Runnable() { // from class: l.nfd
                @Override // java.lang.Runnable
                public final void run() {
                    b bVar2 = bVar;
                    r3g.m9080i(bVar2.K1(), bVar2.q2(), 786);
                }
            }, appealInfo);
        }

        /* JADX INFO: renamed from: J */
        public static /* synthetic */ void m4757J() {
        }

        /* JADX INFO: renamed from: K */
        public static /* synthetic */ void m4758K(View view) {
        }

        /* JADX INFO: renamed from: L */
        public static /* synthetic */ void m4759L(View view) {
        }

        /* JADX INFO: renamed from: M */
        public static /* synthetic */ void m4760M(View view) {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m4766a(View view) {
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m4768c(com.p1.mobile.putong.core.newui.home.b bVar) {
            u uVar = new u();
            ((com.p1.mobile.putong.core.newui.home.base.impl.swipe.a) uVar).a.put(0);
            ((com.p1.mobile.putong.core.newui.home.base.impl.swipe.a) uVar).b.put(0L);
            h7j.o();
            h7j.a0(CoreModule.K().me_(), bVar.K1(), (d30) null, "swipe_card");
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m4769d(View view) {
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m4770e(View view) {
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m4771f(View view) {
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ void m4772g(View view) {
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ void m4773h(com.p1.mobile.putong.core.newui.home.b bVar) {
            LinearLayout linearLayout = new LinearLayout(bVar.K1());
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            linearLayout.setGravity(16);
            linearLayout.setPadding(t100.d(12.0f), t100.d(12.0f), t100.d(20.0f), t100.d(12.0f));
            View vIcon = new VIcon(bVar.K1());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(t100.d(28.0f), t100.d(28.0f));
            layoutParams.rightMargin = t100.d(8.0f);
            vIcon.setLayoutParams(layoutParams);
            vIcon.setBackgroundResource(x2c0.Fl);
            linearLayout.addView(vIcon);
            VText vText = new VText(bVar.K1());
            vText.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            vText.setTextColor(bVar.K1().getResources().getColor(w0c0.i));
            vText.setTextSize(15.0f);
            vText.setTypeface(eqh0.c(3), 1);
            vText.setText("资料已提交，待审核通过后生效");
            linearLayout.addView(vText);
            hdb0.c().i(new SimplePushBubble.a(bVar.K1(), linearLayout).B(1).z(CorePopLevel.TEST).s());
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ void m4774i(View view) {
        }

        /* JADX INFO: renamed from: n */
        public static /* synthetic */ void m4779n(View view) {
        }

        /* JADX INFO: renamed from: o */
        public static /* synthetic */ void m4780o(com.p1.mobile.putong.core.newui.home.b bVar) {
            Message message = new Message();
            message.value = "XXXX";
            message.messageType = MessageType.get("text");
            message.cid = "1";
            v9b.m10201b(bVar.K1(), psm.c(CoreModule.c.e0.p9(), message));
        }

        /* JADX INFO: renamed from: r */
        public static /* synthetic */ void m4783r(com.p1.mobile.putong.core.newui.home.b bVar) {
            gxf gxfVar = new gxf(bVar.K1());
            gxfVar.m6854C(CoreModule.c.e0.Z7(), false, "p_suggest_users_home_view");
            gxfVar.show();
        }

        /* JADX INFO: renamed from: s */
        public static /* synthetic */ void m4784s(View view) {
        }

        /* JADX INFO: renamed from: u */
        public static /* synthetic */ void m4786u(View view) {
        }

        /* JADX INFO: renamed from: z */
        public static /* synthetic */ void m4791z(View view) {
        }

        /* JADX INFO: renamed from: S */
        public final /* synthetic */ void m4792S(com.p1.mobile.putong.core.newui.home.b bVar) {
            ark.m5576d1(bVar.K1(), new a());
        }

        /* JADX INFO: renamed from: T */
        public final /* synthetic */ void m4793T(com.p1.mobile.putong.core.newui.home.b bVar) {
            CoreDlg.m2370c2(bVar.K1(), new b(), new c());
        }

        /* JADX INFO: renamed from: U */
        public final /* synthetic */ void m4794U(com.p1.mobile.putong.core.newui.home.b bVar) {
            ark.m5542M0(bVar.K1(), new d());
        }

        public void call() {
            this.f2269a.clear();
            ArrayList arrayList = this.f2269a;
            final com.p1.mobile.putong.core.newui.home.b bVar = this.f2270b;
            arrayList.add(vwb.Y("无标题1", new d30() { // from class: l.led
                public final void call() {
                    new xh0.a(bVar.K1()).g(false).j("文字内容").r("按钮").o(new View.OnClickListener() { // from class: l.ffd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C3213o1.m4791z(view);
                        }
                    }).f("按钮").c(new View.OnClickListener() { // from class: l.gfd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C3213o1.m4769d(view);
                        }
                    }).a().g();
                }
            }));
            ArrayList arrayList2 = this.f2269a;
            final com.p1.mobile.putong.core.newui.home.b bVar2 = this.f2270b;
            arrayList2.add(vwb.Y("无标题2", new d30() { // from class: l.ned
                public final void call() {
                    new xh0.a(bVar2.K1()).g(false).j("文字内容文字内容文字内容文字内容文字内容文字").r("按钮").o(new View.OnClickListener() { // from class: l.lfd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C3213o1.m4774i(view);
                        }
                    }).f("按钮").c(new View.OnClickListener() { // from class: l.mfd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C3213o1.m4758K(view);
                        }
                    }).a().g();
                }
            }));
            ArrayList arrayList3 = this.f2269a;
            final com.p1.mobile.putong.core.newui.home.b bVar3 = this.f2270b;
            arrayList3.add(vwb.Y("无标题3  3行", new d30() { // from class: l.xed
                public final void call() {
                    new xh0.a(bVar3.K1()).g(false).j("文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容").r("按钮").o(new View.OnClickListener() { // from class: l.tfd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C3213o1.m4760M(view);
                        }
                    }).f("按钮").c(new View.OnClickListener() { // from class: l.ufd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C3213o1.m4748A(view);
                        }
                    }).a().g();
                }
            }));
            ArrayList arrayList4 = this.f2269a;
            final com.p1.mobile.putong.core.newui.home.b bVar4 = this.f2270b;
            arrayList4.add(vwb.Y("无标题3  4行", new d30() { // from class: l.yed
                public final void call() {
                    new xh0.a(bVar4.K1()).g(false).j("文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容").r("按钮").o(new View.OnClickListener() { // from class: l.vfd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C3213o1.m4770e(view);
                        }
                    }).f("按钮").c(new View.OnClickListener() { // from class: l.wfd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C3213o1.m4771f(view);
                        }
                    }).a().g();
                }
            }));
            ArrayList arrayList5 = this.f2269a;
            final com.p1.mobile.putong.core.newui.home.b bVar5 = this.f2270b;
            arrayList5.add(vwb.Y("无标题4 超出4行", new d30() { // from class: l.zed
                public final void call() {
                    new xh0.a(bVar5.K1()).g(false).j("文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容文字内容").r("按钮").o(new View.OnClickListener() { // from class: l.qfd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C3213o1.m4766a(view);
                        }
                    }).f("按钮").c(new View.OnClickListener() { // from class: l.rfd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C3213o1.m4759L(view);
                        }
                    }).a().g();
                }
            }));
            ArrayList arrayList6 = this.f2269a;
            final com.p1.mobile.putong.core.newui.home.b bVar6 = this.f2270b;
            arrayList6.add(vwb.Y("有标题1 ", new d30() { // from class: l.afd
                public final void call() {
                    new xh0.a(bVar6.K1()).s("标题").g(false).j("文字内容").r("按钮").o(new View.OnClickListener() { // from class: l.ofd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C3213o1.m4786u(view);
                        }
                    }).f("按钮").c(new View.OnClickListener() { // from class: l.pfd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C3213o1.m4784s(view);
                        }
                    }).a().g();
                }
            }));
            ArrayList arrayList7 = this.f2269a;
            final com.p1.mobile.putong.core.newui.home.b bVar7 = this.f2270b;
            arrayList7.add(vwb.Y("有标题2 ", new d30() { // from class: l.bfd
                public final void call() {
                    new xh0.a(bVar7.K1()).s("标题").g(false).j("文字内容文字内容文字内容文字内容文字内容文字内容").r("按钮").o(new View.OnClickListener() { // from class: l.jfd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C3213o1.m4772g(view);
                        }
                    }).f("按钮").c(new View.OnClickListener() { // from class: l.kfd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DebugUtil.C3213o1.m4779n(view);
                        }
                    }).a().g();
                }
            }));
            ArrayList arrayList8 = this.f2269a;
            final com.p1.mobile.putong.core.newui.home.b bVar8 = this.f2270b;
            arrayList8.add(vwb.Y("PopupDialog 1 ", new d30() { // from class: l.cfd
                public final void call() {
                    new dd80.a(bVar8.K1()).y0("标题").t0("文字文字文字文字文字文字文字文字文字文字文字文字文字文字文字文字文字文字文字文字").W("xxxx").b0("yyyy").r0();
                }
            }));
            ArrayList arrayList9 = this.f2269a;
            final com.p1.mobile.putong.core.newui.home.b bVar9 = this.f2270b;
            arrayList9.add(vwb.Y("PopupDialog 2 ", new d30() { // from class: l.dfd
                public final void call() {
                    new dd80.a(bVar9.K1()).y0("标题").t0("文字文字文字文字文字文字文字文字文字文字文字文字文字文字文").b0("按钮").r0();
                }
            }));
            ArrayList arrayList10 = this.f2269a;
            final com.p1.mobile.putong.core.newui.home.b bVar10 = this.f2270b;
            arrayList10.add(vwb.Y("PopupDialog 3 ", new d30() { // from class: l.efd
                public final void call() {
                    new dd80.a(bVar10.K1()).S(x2c0.Xp).y0("标题").b0("按钮").r0();
                }
            }));
            ArrayList arrayList11 = this.f2269a;
            final com.p1.mobile.putong.core.newui.home.b bVar11 = this.f2270b;
            arrayList11.add(vwb.Y("PopupDialog 4 ", new d30() { // from class: l.wed
                public final void call() {
                    new dd80.a(bVar11.K1()).S(x2c0.Xp).y0("标题").t0("描述文字描述文字").b0("按钮").r0();
                }
            }));
            ArrayList arrayList12 = this.f2269a;
            final com.p1.mobile.putong.core.newui.home.b bVar12 = this.f2270b;
            arrayList12.add(vwb.Y("PopupDialog 5 ", new d30() { // from class: l.hfd
                public final void call() {
                    new dd80.a(bVar12.K1()).S(x2c0.Xp).y0("标题").t0("描述文字描述文字").b0("按钮").W("文字").r0();
                }
            }));
            ArrayList arrayList13 = this.f2269a;
            final com.p1.mobile.putong.core.newui.home.b bVar13 = this.f2270b;
            arrayList13.add(vwb.Y("PopupDialog 6 ", new d30() { // from class: l.sfd
                public final void call() {
                    new dd80.a(bVar13.K1()).S(x2c0.Xp).y0("标题").t0("描述文字描述文字").b0("按钮1").g0("按钮2").W("文字").r0();
                }
            }));
            ArrayList arrayList14 = this.f2269a;
            final com.p1.mobile.putong.core.newui.home.b bVar14 = this.f2270b;
            arrayList14.add(vwb.Y("PopupDialog 7 ", new d30() { // from class: l.xfd
                public final void call() {
                    new dd80.a(bVar14.K1()).S(x2c0.Xp).y0("标题").t0("描述文字描述文字").k0("我同意腾讯、阿里、陌陌将采集我的面部信息并与头像比对，详见《真实头像认证协议》").b0("按钮1").W("文字").r0();
                }
            }));
            ArrayList arrayList15 = this.f2269a;
            final com.p1.mobile.putong.core.newui.home.b bVar15 = this.f2270b;
            arrayList15.add(vwb.Y("PopupDialog 协议更新通知 ", new d30() { // from class: l.yfd
                public final void call() {
                    gp80.m(bVar15.K1(), true);
                }
            }));
            ArrayList arrayList16 = this.f2269a;
            final com.p1.mobile.putong.core.newui.home.b bVar16 = this.f2270b;
            arrayList16.add(vwb.Y("PopupDialog 功能全新升级 ", new d30() { // from class: l.zfd
                public final void call() {
                    snm.m9409f0(bVar16.K1(), TabName.Card, null);
                }
            }));
            ArrayList arrayList17 = this.f2269a;
            final com.p1.mobile.putong.core.newui.home.b bVar17 = this.f2270b;
            arrayList17.add(vwb.Y("PopupDialog 分享新功能 1 ", new d30() { // from class: l.agd
                public final void call() {
                    this.f2783a.m4792S(bVar17);
                }
            }));
            ArrayList arrayList18 = this.f2269a;
            final com.p1.mobile.putong.core.newui.home.b bVar18 = this.f2270b;
            arrayList18.add(vwb.Y("PopupDialog 分享新功能 2 ", new d30() { // from class: l.bgd
                public final void call() {
                    this.f3375a.m4793T(bVar18);
                }
            }));
            ArrayList arrayList19 = this.f2269a;
            final com.p1.mobile.putong.core.newui.home.b bVar19 = this.f2270b;
            arrayList19.add(vwb.Y("PopupDialog 别错过TA的消息 ", new d30() { // from class: l.cgd
                public final void call() {
                    uq40.E(bVar19.K1(), new d30() { // from class: l.ifd
                        public final void call() {
                            DebugUtil.C3213o1.m4757J();
                        }
                    }, (d30) null);
                }
            }));
            ArrayList arrayList20 = this.f2269a;
            final com.p1.mobile.putong.core.newui.home.b bVar20 = this.f2270b;
            arrayList20.add(vwb.Y("PopupDialog 你离开后任 ", new d30() { // from class: l.med
                public final void call() {
                    this.f6338a.m4794U(bVar20);
                }
            }));
            ArrayList arrayList21 = this.f2269a;
            final com.p1.mobile.putong.core.newui.home.b bVar21 = this.f2270b;
            arrayList21.add(vwb.Y("PopupDialog 真人实名认证 创建群 ", new d30() { // from class: l.oed
                public final void call() {
                    tbk.u(bVar21.K1());
                }
            }));
            ArrayList arrayList22 = this.f2269a;
            final com.p1.mobile.putong.core.newui.home.b bVar22 = this.f2270b;
            arrayList22.add(vwb.Y("PopupDialog  别着急，等%s回复后再继续聊天 ", new d30() { // from class: l.ped
                public final void call() {
                    w3z.F(bVar22.K1(), CoreModule.c.e0.p9());
                }
            }));
            ArrayList arrayList23 = this.f2269a;
            final com.p1.mobile.putong.core.newui.home.b bVar23 = this.f2270b;
            arrayList23.add(vwb.Y("Dialog 引导上传生活照", new d30() { // from class: l.qed
                public final void call() {
                    DebugUtil.C3213o1.m4783r(bVar23);
                }
            }));
            ArrayList arrayList24 = this.f2269a;
            final com.p1.mobile.putong.core.newui.home.b bVar24 = this.f2270b;
            arrayList24.add(vwb.Y("Dialog 新交友目的 新弹框", new d30() { // from class: l.red
                public final void call() {
                    DebugUtil.C3213o1.m4768c(bVar24);
                }
            }));
            ArrayList arrayList25 = this.f2269a;
            final com.p1.mobile.putong.core.newui.home.b bVar25 = this.f2270b;
            arrayList25.add(new j760("Dialog 网图Fake弹窗", new d30() { // from class: l.sed
                public final void call() {
                    DebugUtil.C3213o1.m4753F(bVar25);
                }
            }));
            ArrayList arrayList26 = this.f2269a;
            final com.p1.mobile.putong.core.newui.home.b bVar26 = this.f2270b;
            arrayList26.add(new j760("push 超级喜欢", new d30() { // from class: l.ted
                public final void call() {
                    rxg0.L(bVar26.K1());
                }
            }));
            ArrayList arrayList27 = this.f2269a;
            final com.p1.mobile.putong.core.newui.home.b bVar27 = this.f2270b;
            arrayList27.add(new j760("push 消息已经发送", new d30() { // from class: l.ued
                public final void call() {
                    DebugUtil.C3213o1.m4780o(bVar27);
                }
            }));
            ArrayList arrayList28 = this.f2269a;
            final com.p1.mobile.putong.core.newui.home.b bVar28 = this.f2270b;
            arrayList28.add(new j760("资料已经提交", new d30() { // from class: l.ved
                public final void call() {
                    DebugUtil.C3213o1.m4773h(bVar28);
                }
            }));
            this.f2270b.K1().showDebugMenu(this.f2269a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$p */
    public class C3214p implements d30 {
        public void call() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$p0 */
    public class C3215p0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2275a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2276b;

        public C3215p0(ArrayList arrayList, b bVar) {
            this.f2275a = arrayList;
            this.f2276b = bVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m4795a() {
            hpd0 hpd0Var = CoreModule.c.e0.b3;
            hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        }

        public void call() {
            this.f2275a.clear();
            this.f2275a.add(vwb.Y("实验组，当前：".concat(((Boolean) CoreModule.c.e0.b3.get()).booleanValue() ? "true" : "false"), new d30() { // from class: l.ucd
                public final void call() {
                    DebugUtil.C3215p0.m4795a();
                }
            }));
            this.f2276b.K1().showDebugMenu(this.f2275a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$p1 */
    public class C3216p1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2277a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2278b;

        public C3216p1(ArrayList arrayList, b bVar) {
            this.f2277a = arrayList;
            this.f2278b = bVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m4796a() {
            CoreModule.c.e0.P0.clear();
            CoreModule.c.e0.O0.clear();
            CoreModule.c.e0.M3.clear();
            CoreModule.c.e0.L3.clear();
            CoreModule.c.e0.K3.clear();
            CoreModule.c.e0.D3.clear();
            CoreModule.c.e0.C3.clear();
        }

        public void call() {
            this.f2277a.clear();
            this.f2277a.add(vwb.Y("清除相关本地数据", new d30() { // from class: l.dgd
                public final void call() {
                    DebugUtil.C3216p1.m4796a();
                }
            }));
            this.f2278b.K1().showDebugMenu(this.f2277a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$q */
    public class C3217q implements d30 {
        public void call() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$q0 */
    public class C3218q0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2279a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2280b;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$q0$a */
        public class a implements e30<Boolean> {
            public a() {
            }

            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(Boolean bool) {
            }
        }

        public C3218q0(ArrayList arrayList, b bVar) {
            this.f2279a = arrayList;
            this.f2280b = bVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m4797a() {
            hpd0 hpd0Var = CoreModule.c.e0.c3;
            hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public /* synthetic */ void m4799c(b bVar) {
            snm.m9377F(bVar.K1(), false, true, "xxx", new a());
        }

        public void call() {
            this.f2279a.clear();
            this.f2279a.add(vwb.Y("实验组，当前：".concat(((Boolean) CoreModule.c.e0.c3.get()).booleanValue() ? "true" : "false"), new d30() { // from class: l.vcd
                public final void call() {
                    DebugUtil.C3218q0.m4797a();
                }
            }));
            ArrayList arrayList = this.f2279a;
            final b bVar = this.f2280b;
            arrayList.add(vwb.Y(" 非svpi 弹svpi", new d30() { // from class: l.wcd
                public final void call() {
                    this.f8156a.m4799c(bVar);
                }
            }));
            this.f2280b.K1().showDebugMenu(this.f2279a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$q1 */
    public class C3219q1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2282a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2283b;

        public C3219q1(ArrayList arrayList, b bVar) {
            this.f2282a = arrayList;
            this.f2283b = bVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m4801a() {
            CoreModule.c.e0.P3.clear();
            CoreModule.c.e0.Q3.clear();
        }

        public void call() {
            this.f2282a.clear();
            this.f2282a.add(vwb.Y("清空频控", new d30() { // from class: l.egd
                public final void call() {
                    DebugUtil.C3219q1.m4801a();
                }
            }));
            this.f2283b.K1().showDebugMenu(this.f2282a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$r */
    public class RunnableC3220r implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f2284a;

        public RunnableC3220r(b bVar) {
            this.f2284a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b4h0 b4h0Var = new b4h0(this.f2284a.K1());
            b4h0Var.show();
            g4h0.c(this.f2284a.K1(), b4h0Var);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$r0 */
    public class C3221r0 implements e30<Conversation> {
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Conversation conversation) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$r1 */
    public class C3222r1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2285a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2286b;

        public C3222r1(ArrayList arrayList, b bVar) {
            this.f2285a = arrayList;
            this.f2286b = bVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m4803a() {
            CoreModule.c.f0.v1.clear();
            CoreModule.c.f0.u1.clear();
            CoreModule.c.f0.t1.clear();
            CoreModule.c.f0.A1.clear();
        }

        public void call() {
            this.f2285a.clear();
            this.f2285a.add(vwb.Y("清楚本地数据", new d30() { // from class: l.fgd
                public final void call() {
                    DebugUtil.C3222r1.m4803a();
                }
            }));
            this.f2286b.K1().showDebugMenu(this.f2285a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$s */
    public class RunnableC3223s implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f2287a;

        public RunnableC3223s(b bVar) {
            this.f2287a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ChatPartners chatPartnersNew_ = ChatPartners.new_();
            User userMe_ = CoreModule.K().me_();
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
            new puf0(this.f2287a.K1()).W(chatPartnersNew_);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$s0 */
    public class C3224s0 implements e30<User> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f2288a;

        public C3224s0(b bVar) {
            this.f2288a = bVar;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(User user) {
            m7e0.b(this.f2288a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$s1 */
    public class C3225s1 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2289a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2290b;

        public C3225s1(ArrayList arrayList, b bVar) {
            this.f2289a = arrayList;
            this.f2290b = bVar;
        }

        public void call() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$t */
    public class RunnableC3226t implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f2291a;

        /* JADX INFO: renamed from: b */
        public TextView f2292b;

        /* JADX INFO: renamed from: c */
        public c4g0 f2293c = rx.c.interval(1, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.xbd
            public final void call(Object obj) {
                this.f8449a.m4808d((Long) obj);
            }
        }));

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CounterLikeLimit f2294d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ b f2295e;

        public RunnableC3226t(CounterLikeLimit counterLikeLimit, b bVar) {
            this.f2294d = counterLikeLimit;
            this.f2295e = bVar;
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m4808d(Long l2) {
            m4811g();
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m4809e() {
            this.f2293c.unsubscribe();
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m4810f(DialogInterface dialogInterface) {
            this.f2293c.unsubscribe();
        }

        /* JADX INFO: renamed from: g */
        public void m4811g() {
            Dialog dialog;
            long jResetNowMillis = this.f2294d.resetNowMillis();
            if (jResetNowMillis <= 0 && (dialog = this.f2291a) != null) {
                dialog.cancel();
            }
            String strB = qqi0.b(jResetNowMillis);
            TextView textView = this.f2292b;
            if (textView != null) {
                textView.setText(strB);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog dialogZ0 = this.f2295e.K1().dialog().G0(this.f2295e.K1().getString(R.string.J3, Integer.valueOf(this.f2294d.total))).F(this.f2295e.K1().getString(R.string.I3, Integer.valueOf(this.f2294d.total))).u().s().c0(x2c0.vt).v0("", new Runnable() { // from class: l.ybd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9021a.m4809e();
                }
            }).w0(this.f2295e.K1().getResources().getDrawable(x2c0.wt)).A(new DialogInterface.OnCancelListener() { // from class: l.zbd
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f9218a.m4810f(dialogInterface);
                }
            }).z0();
            this.f2291a = dialogZ0;
            TextView textViewJ0 = xdl0.J0(dialogZ0.Z());
            this.f2292b = textViewJ0;
            textViewJ0.setTextSize(0, textViewJ0.getTextSize() * 1.1f);
            m4811g();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$t0 */
    public class RunnableC3227t0 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            f8c.o().B(new d30() { // from class: l.xcd
                public final void call() {
                    CoreModule.k.k.deleteAll();
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$t1 */
    public class RunnableC3228t1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ m45 f2296a;

        public RunnableC3228t1(m45 m45Var) {
            this.f2296a = m45Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            CityCBanner cityCBannerNew_ = CityCBanner.new_();
            cityCBannerNew_.cityName = "北京xx";
            this.f2296a.m7966K(1, null, cityCBannerNew_);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$u */
    public class C3229u implements e30<Boolean> {
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$u0 */
    public class C3230u0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2297a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ com.p1.mobile.putong.core.newui.home.b f2298b;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$u0$a */
        public class a implements d30 {
            public a() {
            }

            public void call() {
                CoreModule.c.e0.V2.put(Boolean.TRUE);
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$u0$b */
        public class b implements d30 {
            public b() {
            }

            public void call() {
                PopGuide popGuide = new PopGuide();
                popGuide.userId = "50141";
                popGuide.guide = "我发布了新的动态";
                popGuide.icon = "https://imgoldjii.oss-cn-beijing.aliyuncs.com/7821672838116_.pic.jpg";
                C3230u0.this.f2298b.K1().Z5().z0(popGuide);
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$u0$c */
        public class c implements d30 {
            public c() {
            }

            public void call() {
                CoreModule.c.e0.U2.clear();
                CoreModule.c.e0.Q2.clear();
                CoreModule.c.e0.R2.clear();
                CoreModule.c.e0.T2.clear();
                CoreModule.c.e0.S2.clear();
            }
        }

        public C3230u0(ArrayList arrayList, com.p1.mobile.putong.core.newui.home.b bVar) {
            this.f2297a = arrayList;
            this.f2298b = bVar;
        }

        public void call() {
            this.f2297a.clear();
            this.f2297a.add(vwb.Y("开启实验组", new a()));
            this.f2297a.add(vwb.Y("展示气泡", new b()));
            this.f2297a.add(vwb.Y("清除频控", new c()));
            this.f2298b.K1().showDebugMenu(this.f2297a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$u1 */
    public class RunnableC3231u1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ m45 f2302a;

        public RunnableC3231u1(m45 m45Var) {
            this.f2302a = m45Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            CityCData cityCDataNew_ = CityCData.new_();
            cityCDataNew_.userId = ((DbObject) CoreModule.c.e0.p9()).id;
            cityCDataNew_.expireAt = mqi0.o() + 36000000;
            this.f2302a.m7966K(2, cityCDataNew_, null);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$v */
    public class C3232v implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f2303a;

        public C3232v(b bVar) {
            this.f2303a = bVar;
        }

        public void call() {
            ActionToastStyle actionToastStyle = new ActionToastStyle();
            actionToastStyle.styleId = "1";
            ActionToastStyleIcons actionToastStyleIcons = new ActionToastStyleIcons();
            actionToastStyleIcons.miniIcon = "online";
            actionToastStyle.icons = actionToastStyleIcons;
            actionToastStyle.toastLink = "tantanapp://sendMessage?uid=137071&msg=早上好";
            actionToastStyle.mainImg = ((Media) CoreModule.c.e0.p9().fp()).url;
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
            qug0.g().k(this.f2303a, actionDataNew_);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$v0 */
    public class C3233v0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2304a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2305b;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$v0$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ b f2306a;

            public a(b bVar) {
                this.f2306a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                User userP9 = CoreModule.c.e0.p9();
                ((DbObject) userP9).id = "132375";
                userP9.name = "昵称";
                userP9.description = "爱生活，爱运动，爱美食\r\n爱旅行、爱逛家具店";
                xdx.A().K(this.f2306a.K1(), userP9, true);
            }
        }

        public C3233v0(ArrayList arrayList, b bVar) {
            this.f2304a = arrayList;
            this.f2305b = bVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m4814a() {
            hpd0 hpd0Var = CoreModule.c.e0.a3;
            hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m4815b(b bVar) {
            User userP9 = CoreModule.c.e0.p9();
            ((DbObject) userP9).id = "132375";
            userP9.name = "昵称";
            userP9.description = "爱生活，爱运动，爱美食\n爱旅行、爱逛家具店";
            xdx.A().K(bVar.K1(), userP9, false);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m4818e() {
            hpd0 hpd0Var = CoreModule.c.e0.r4;
            hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public /* synthetic */ void m4819f(b bVar) {
            for (int i = 0; i < 5; i++) {
                e51.H(bVar.K1(), new a(bVar), 200L);
            }
        }

        public void call() {
            this.f2304a.clear();
            this.f2304a.add(vwb.Y("toggle实验组，当前：".concat(((Boolean) CoreModule.c.e0.a3.get()).booleanValue() ? "true" : "false"), new d30() { // from class: l.ycd
                public final void call() {
                    DebugUtil.C3233v0.m4814a();
                }
            }));
            this.f2304a.add(vwb.Y("Ui优化实验：".concat(((Boolean) CoreModule.c.e0.r4.get()).booleanValue() ? "true" : "false"), new d30() { // from class: l.zcd
                public final void call() {
                    DebugUtil.C3233v0.m4818e();
                }
            }));
            ArrayList arrayList = this.f2304a;
            final b bVar = this.f2305b;
            arrayList.add(vwb.Y("弹出弹窗", new d30() { // from class: l.add
                public final void call() {
                    DebugUtil.C3233v0.m4815b(bVar);
                }
            }));
            ArrayList arrayList2 = this.f2304a;
            final b bVar2 = this.f2305b;
            arrayList2.add(vwb.Y("连续弹出弹出", new d30() { // from class: l.bdd
                public final void call() {
                    this.f3365a.m4819f(bVar2);
                }
            }));
            this.f2304a.add(vwb.Y("弹出先发like弹窗", new d30() { // from class: l.cdd
                public final void call() {
                    xdx.A().N("137071");
                }
            }));
            this.f2305b.K1().showDebugMenu(this.f2304a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$v1 */
    public class RunnableC3234v1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ m45 f2308a;

        public RunnableC3234v1(m45 m45Var) {
            this.f2308a = m45Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            CityCData cityCDataNew_ = CityCData.new_();
            cityCDataNew_.userId = ((DbObject) CoreModule.c.e0.p9()).id;
            cityCDataNew_.viewCount = 10001;
            cityCDataNew_.recievedLikeCount = 6000;
            this.f2308a.m7966K(3, cityCDataNew_, null);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$w */
    public class C3235w implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f2309a;

        public C3235w(b bVar) {
            this.f2309a = bVar;
        }

        public void call() {
            ActionToastStyle actionToastStyle = new ActionToastStyle();
            actionToastStyle.styleId = "1";
            ActionToastStyleIcons actionToastStyleIcons = new ActionToastStyleIcons();
            actionToastStyleIcons.miniIcon = "online";
            actionToastStyle.icons = actionToastStyleIcons;
            actionToastStyle.toastLink = "tantanapp://sendMessage?uid=137071&msg=早上好";
            actionToastStyle.mainImg = ((Media) CoreModule.c.e0.p9().fp()).url;
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
            qug0.g().k(this.f2309a, actionDataNew_);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$w0 */
    public class C3236w0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2310a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ com.p1.mobile.putong.core.newui.home.b f2311b;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$w0$a */
        public class a implements d30 {
            public a() {
            }

            public void call() {
                ActionToastStyle actionToastStyle = new ActionToastStyle();
                actionToastStyle.styleId = "1";
                ActionToastStyleIcons actionToastStyleIcons = new ActionToastStyleIcons();
                actionToastStyleIcons.miniIcon = "online";
                actionToastStyle.icons = actionToastStyleIcons;
                actionToastStyle.toastLink = "";
                actionToastStyle.mainImg = ((Media) CoreModule.c.e0.p9().fp()).url;
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
                qug0.g().k(C3236w0.this.f2311b, actionDataNew_);
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$w0$b */
        public class b implements d30 {
            public b() {
            }

            public void call() {
                ActionToastStyle actionToastStyle = new ActionToastStyle();
                actionToastStyle.styleId = "1";
                ActionToastStyleIcons actionToastStyleIcons = new ActionToastStyleIcons();
                actionToastStyleIcons.miniIcon = "online";
                actionToastStyle.icons = actionToastStyleIcons;
                actionToastStyle.toastLink = "";
                actionToastStyle.title = "林青霞";
                actionToastStyle.mainImg = ((Media) CoreModule.c.e0.p9().fp()).url;
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
                qug0.g().k(C3236w0.this.f2311b, actionDataNew_);
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$w0$c */
        public class c implements d30 {
            public c() {
            }

            public void call() {
                ActionToastStyle actionToastStyle = new ActionToastStyle();
                actionToastStyle.styleId = "1";
                ActionToastStyleIcons actionToastStyleIcons = new ActionToastStyleIcons();
                actionToastStyleIcons.miniIcon = "online";
                actionToastStyle.icons = actionToastStyleIcons;
                actionToastStyle.toastLink = "";
                actionToastStyle.mainImg = ((Media) CoreModule.c.e0.p9().fp()).url;
                actionToastStyle.title = "林青霞";
                actionToastStyle.message = "当前在线，打个招呼吧";
                actionToastStyle.showClose = true;
                ActionToastStyleButton actionToastStyleButton = new ActionToastStyleButton();
                actionToastStyleButton.showButton = true;
                actionToastStyleButton.buttonMessage = "早上好";
                actionToastStyleButton.buttonBackground = "orange";
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
                qug0.g().k(C3236w0.this.f2311b, actionDataNew_);
            }
        }

        public C3236w0(ArrayList arrayList, com.p1.mobile.putong.core.newui.home.b bVar) {
            this.f2310a = arrayList;
            this.f2311b = bVar;
        }

        public void call() {
            this.f2310a.clear();
            this.f2310a.add(vwb.Y("弹出测试弹窗：deeplink发消息", new a()));
            this.f2310a.add(vwb.Y("弹出测试弹窗：deeplink跳转聊天页，填入消息并弹起键盘", new b()));
            this.f2310a.add(vwb.Y("弹出测试弹窗：deeplink跳转聊天页，自动发送消息", new c()));
            this.f2311b.K1().showDebugMenu(this.f2310a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$w1 */
    public class RunnableC3237w1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ m45 f2315a;

        public RunnableC3237w1(m45 m45Var) {
            this.f2315a = m45Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2315a.m7966K(5, null, null);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$x */
    public class C3238x implements e30<User> {
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(User user) {
            Relationship relationshipNew_ = user.localRelationship;
            if (relationshipNew_ == null) {
                relationshipNew_ = Relationship.new_();
            }
            relationshipNew_.status.add(MatchFrom.get("superLiked"));
            user.localRelationship = relationshipNew_;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$x0 */
    public class C3239x0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2316a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2317b;

        public C3239x0(ArrayList arrayList, b bVar) {
            this.f2316a = arrayList;
            this.f2317b = bVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m4821a() {
            hpd0 hpd0Var = CoreModule.c.e0.o3;
            hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        }

        public void call() {
            this.f2316a.clear();
            this.f2316a.add(vwb.Y("toggle实验组，当前：".concat(((Boolean) CoreModule.c.e0.o3.get()).booleanValue() ? "true" : "false"), new d30() { // from class: l.ddd
                public final void call() {
                    DebugUtil.C3239x0.m4821a();
                }
            }));
            this.f2317b.K1().showDebugMenu(this.f2316a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$x1 */
    public class C3240x1 implements e30<CoreSuggested.UserInfo> {
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(CoreSuggested.UserInfo userInfo) {
            if (userInfo != null) {
                CoreModule.c.m0.w6(userInfo, 1);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$y */
    public class C3241y implements e30<User> {
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
    public class C3242y0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2318a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2319b;

        public C3242y0(ArrayList arrayList, b bVar) {
            this.f2318a = arrayList;
            this.f2319b = bVar;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m4826c() {
            hpd0 hpd0Var = CoreModule.c.m0.w1;
            hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m4827d() {
            hpd0 hpd0Var = CoreModule.c.m0.y1;
            hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        }

        public void call() {
            this.f2318a.clear();
            this.f2318a.add(vwb.Y("推荐卡片4变3张 开关：".concat(((Boolean) CoreModule.c.m0.w1.get()).booleanValue() ? "true" : "false"), new d30() { // from class: l.edd
                public final void call() {
                    DebugUtil.C3242y0.m4826c();
                }
            }));
            this.f2318a.add(vwb.Y("动态切卡：".concat(((Boolean) CoreModule.c.m0.y1.get()).booleanValue() ? "true" : "false"), new d30() { // from class: l.fdd
                public final void call() {
                    DebugUtil.C3242y0.m4827d();
                }
            }));
            ArrayList arrayList = this.f2318a;
            final b bVar = this.f2319b;
            arrayList.add(vwb.Y("移走第一张", new d30() { // from class: l.gdd
                public final void call() {
                    bVar.K1().postDelayed(new Runnable() { // from class: l.hdd
                        @Override // java.lang.Runnable
                        public final void run() {
                            CoreModule.c.m0.C8("debug");
                        }
                    }, 500L);
                }
            }));
            this.f2319b.K1().showDebugMenu(this.f2318a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$y1 */
    public class RunnableC3243y1 implements Runnable {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$y1$a */
        public class a implements d30 {
            public a() {
            }

            public void call() {
                Conversation conversationNew_ = (Conversation) CoreModule.k.m.query("fake_conversation_local_summary_marriage_conversation");
                long jO = mqi0.o();
                if (conversationNew_ == null) {
                    conversationNew_ = Conversation.new_();
                    ((DbObject) conversationNew_).id = "fake_conversation_local_summary_marriage_conversation";
                    double d = jO;
                    conversationNew_.createdTime = d;
                    conversationNew_.latestTime = d;
                    conversationNew_.convType = "default";
                    conversationNew_.localEverHasMessage = true;
                    conversationNew_.unreadMessages = 2;
                } else {
                    conversationNew_.unreadMessages = 3;
                    conversationNew_.latestTime = jO;
                }
                CoreModule.c.f0.mq(conversationNew_);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            CoreModule.c.U.a(new a());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$z */
    public class C3244z implements e30<User> {
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
    public class C3245z0 implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2321a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f2322b;

        public C3245z0(ArrayList arrayList, b bVar) {
            this.f2321a = arrayList;
            this.f2322b = bVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m4829a() {
            hpd0 hpd0Var = CoreModule.c.f0.p1;
            hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        }

        public void call() {
            this.f2321a.clear();
            this.f2321a.add(vwb.Y("历史消息cell激活 开关：".concat(((Boolean) CoreModule.c.f0.p1.get()).booleanValue() ? "true" : "false"), new d30() { // from class: l.idd
                public final void call() {
                    DebugUtil.C3245z0.m4829a();
                }
            }));
            this.f2322b.K1().showDebugMenu(this.f2321a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.DebugUtil$z1 */
    public class RunnableC3246z1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ o45 f2323a;

        public RunnableC3246z1(o45 o45Var) {
            this.f2323a = o45Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2323a.show();
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f2194b = new hpd0("chat_new_match_with_strategy", bool);
        f2195c = new hpd0("chat_new_match_without_strategy", bool);
        f2196d = new hpd0("refreshBanCard", bool);
        f2197e = new tpd0("refreshCardTime", -1);
        f2198f = false;
        f2199g = new tpd0("new_message_exp", 0);
        f2200h = new hpd0("click_to_end", bool);
        f2201i = new hpd0("debug_compliment_mock_enabled", bool);
        f2202j = new String[][]{new String[]{"received_paid", "paid", "0"}, new String[]{"received_free", "free", "1"}};
    }

    /* JADX INFO: renamed from: A1 */
    public static /* synthetic */ void m3564A1() {
        hpd0 hpd0Var = lra0.B;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        if (((Boolean) lra0.B.get()).booleanValue()) {
            lra0.C.put(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: A3 */
    public static /* synthetic */ void m3566A3(MatchSuccessAnimTime matchSuccessAnimTime, String str) {
        try {
            matchSuccessAnimTime.female_enter_time = Integer.parseInt(str);
            CoreModule.c.e0.e3.put(matchSuccessAnimTime.toJson());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: A4 */
    public static /* synthetic */ void m3567A4(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("首页启动介绍弹窗", new d30() { // from class: l.x8d
            public final void call() {
                new sci(bVar.K1(), "").show();
            }
        }));
        arrayList.add(vwb.Y("首页启动介绍弹窗清除本地记录", new d30() { // from class: l.y8d
            public final void call() {
                DebugUtil.m3666Ef();
            }
        }));
        arrayList.add(vwb.Y("购买弹窗", new d30() { // from class: l.z8d
            public final void call() {
                com.p1.mobile.putong.core.ui.purchase.c.T(bVar.K1());
            }
        }));
        arrayList.add(vwb.Y("全屏购买 - 探探信用分", new d30() { // from class: l.a9d
            public final void call() {
                new r5b0.a(bVar.K1()).h(vwb.f0(new PurchaseType[]{PurchaseType.TYPE_FEMALE_VIP}), vwb.f0(new Privilege[]{Privilege.pick_tantan_credits_users})).j();
            }
        }));
        arrayList.add(vwb.Y("全屏购买 - 解锁更了解他模块", new d30() { // from class: l.b9d
            public final void call() {
                new r5b0.a(bVar.K1()).h(vwb.f0(new PurchaseType[]{PurchaseType.TYPE_FEMALE_VIP}), vwb.f0(new Privilege[]{Privilege.unlock_learn_about_him_module})).j();
            }
        }));
        arrayList.add(vwb.Y("全屏购买 - 隐私", new d30() { // from class: l.c9d
            public final void call() {
                new r5b0.a(bVar.K1()).h(vwb.f0(new PurchaseType[]{PurchaseType.TYPE_FEMALE_VIP}), vwb.f0(new Privilege[]{Privilege.privacy_membership})).j();
            }
        }));
        arrayList.add(vwb.Y("全屏购买 - 广告免打扰", new d30() { // from class: l.d9d
            public final void call() {
                new r5b0.a(bVar.K1()).h(vwb.f0(new PurchaseType[]{PurchaseType.TYPE_FEMALE_VIP}), vwb.f0(new Privilege[]{Privilege.ads_not_disturb})).j();
            }
        }));
        arrayList.add(vwb.Y("全屏购买 - 屏蔽骚扰词", new d30() { // from class: l.e9d
            public final void call() {
                new r5b0.a(bVar.K1()).h(vwb.f0(new PurchaseType[]{PurchaseType.TYPE_FEMALE_VIP}), vwb.f0(new Privilege[]{Privilege.block_harassing_words})).j();
            }
        }));
        arrayList.add(vwb.Y("首页女性会员插卡", new d30() { // from class: l.f9d
            public final void call() {
                DebugUtil.m4039W4();
            }
        }));
        arrayList.add(vwb.Y("清空女性会员引导卡的滑卡数据", new d30() { // from class: l.h9d
            public final void call() {
                idi.c().m();
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: A5 */
    public static /* synthetic */ void m3568A5(b bVar) {
        h7j.Y("marriage", CoreModule.K().me_());
        h7j.Z(bVar.K1(), "marriage", "找个人领证");
    }

    /* JADX INFO: renamed from: A6 */
    public static /* synthetic */ void m3569A6(ArrayList arrayList, b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("toggle实验组", new d30() { // from class: l.m3d
            public final void call() {
                DebugUtil.m4151ba();
            }
        }));
        arrayList.add(vwb.Y("toggle性别", new d30() { // from class: l.n3d
            public final void call() {
                DebugUtil.m3752Id();
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Aa */
    public static /* synthetic */ void m3573Aa(b bVar) {
        puk0.e().h("antispam");
        bVar.K1().startActivity(VerificationAct.m4872m2(bVar.K1(), 2, "id_ability"));
    }

    /* JADX INFO: renamed from: Ab */
    public static /* synthetic */ void m3574Ab() {
        hpd0 hpd0Var = lra0.l;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: Ac */
    public static /* synthetic */ void m3575Ac(b bVar) {
        if (NullChecker.a(bVar.A2().d())) {
            bVar.A2().d().Q0();
        }
    }

    /* JADX INFO: renamed from: Ae */
    public static /* synthetic */ void m3577Ae() {
        hpd0 hpd0Var = CoreModule.c.m0.V0;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        CoreModule.c.m0.W0.put(bool);
    }

    /* JADX INFO: renamed from: Af */
    public static /* synthetic */ void m3578Af(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("SVIP低价召回优惠券领取弹窗", new d30() { // from class: l.i0d
            public final void call() {
                DebugUtil.m4073Xh(bVar);
            }
        }));
        arrayList.add(vwb.Y("SVIP低价召回大页面", new d30() { // from class: l.j0d
            public final void call() {
                DebugUtil.m4173ca(bVar);
            }
        }));
        arrayList.add(vwb.Y("SVIP低价召回情况SP缓存", new d30() { // from class: l.k0d
            public final void call() {
                DebugUtil.m4530sg();
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Ah */
    public static /* synthetic */ void m3580Ah(b bVar) {
        jj4 jj4VarO = bVar.A2().o();
        CoreSuggested.UserInfo userInfoE = jj4VarO.e();
        if (userInfoE == null) {
            osi0.g("顶部卡片无 UserInfo");
            return;
        }
        SuggestedComplimentItem suggestedComplimentItem = new SuggestedComplimentItem();
        suggestedComplimentItem.receiverId = ((DbObject) jj4VarO.d()).id;
        suggestedComplimentItem.senderId = "debug_sender";
        suggestedComplimentItem.type = "debug";
        suggestedComplimentItem.value = "Debug compliment";
        suggestedComplimentItem.media = null;
        suggestedComplimentItem.nullCheck();
        userInfoE.compliment = suggestedComplimentItem;
        osi0.g("已添加 compliment");
    }

    /* JADX INFO: renamed from: Aj */
    public static void m3582Aj(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("购买弹窗 空 sku 测试", new d30() { // from class: l.apc
            public final void call() {
                DebugUtil.m3795Kc();
            }
        }));
    }

    /* JADX INFO: renamed from: Ak */
    public static void m3583Ak(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("滑卡上滑push", new C3169d1(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: B0 */
    public static /* synthetic */ void m3585B0(nt30 nt30Var, b bVar) {
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
        nt30Var.A8(pushMessageNew_);
        hdb0.c().i(new ybx((Activity) Act.foreground_().a.get(), ((Activity) Act.foreground_().a.get()).getString(R.string.yh), 10, CoreModule.K().me_().fp().profileSmall()));
        bVar.u6(((Media) CoreModule.c.e0.p9().fp()).url, bVar.K1().string(R.string.Pm), "old", 1, 1, (Figure) null, 0.0d, (d30) null);
    }

    /* JADX INFO: renamed from: B1 */
    public static /* synthetic */ void m3586B1() {
        hpd0 hpd0Var = lra0.i0;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        hpd0 hpd0Var2 = lra0.h0;
        Boolean bool = Boolean.FALSE;
        hpd0Var2.put(bool);
        lra0.j0.put(bool);
        lra0.k0.put(bool);
    }

    /* JADX INFO: renamed from: B2 */
    public static /* synthetic */ void m3587B2(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("定位权限挽留", new d30() { // from class: l.ipc
            public final void call() {
                b bVar2 = bVar;
                e51.H(bVar2.K1(), new Runnable() { // from class: l.b8d
                    @Override // java.lang.Runnable
                    public final void run() {
                        b bVar3 = bVar2;
                        e4w.i(bVar3.K1(), new d30() { // from class: l.x8c
                            public final void call() {
                                bVar3.v2().K8();
                            }
                        }, (d30) null, false);
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.Y("定位权限挽留选择", new d30() { // from class: l.jpc
            public final void call() {
                b bVar2 = bVar;
                e51.H(bVar2.K1(), new Runnable() { // from class: l.nzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        b bVar3 = bVar2;
                        e4w.i(bVar3.K1(), new d30() { // from class: l.xad
                            public final void call() {
                                bVar3.v2().K8();
                            }
                        }, new d30() { // from class: l.zad
                            public final void call() {
                                DebugUtil.m3952S1();
                            }
                        }, true);
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.Y("定位权限挽留for feed", new d30() { // from class: l.kpc
            public final void call() {
                b bVar2 = bVar;
                e51.H(bVar2.K1(), new Runnable() { // from class: l.o3d
                    @Override // java.lang.Runnable
                    public final void run() {
                        b bVar3 = bVar2;
                        e4w.j(bVar3.K1(), new d30() { // from class: l.ead
                            public final void call() {
                                bVar3.v2().K8();
                            }
                        }, (d30) null, false, true, (String) null);
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.Y("模拟定位刷新", new d30() { // from class: l.lpc
            public final void call() {
                bVar.v2().K8();
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: B6 */
    public static /* synthetic */ void m3591B6(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("插入消息taps：", new d30() { // from class: l.moc
            public final void call() {
                DebugUtil.m4222ef(bVar);
            }
        }));
        arrayList.add(vwb.Y("新版聊天升温：" + CoreModule.c.e0.s2.get(), new d30() { // from class: l.noc
            public final void call() {
                DebugUtil.m3939R9();
            }
        }));
        arrayList.add(vwb.Y("是否升温：" + CoreModule.c.e0.u2.get(), new d30() { // from class: l.ooc
            public final void call() {
                DebugUtil.m4492r0();
            }
        }));
        arrayList.add(vwb.Y("展示邀请", new d30() { // from class: l.poc
            public final void call() {
                b bVar2 = bVar;
                new p5f(bVar2.K1()).E(bVar2.K1(), CoreModule.H().userId());
            }
        }));
        arrayList.add(vwb.Y("升温表情全量：" + CoreModule.c.e0.v2.get(), new d30() { // from class: l.qoc
            public final void call() {
                DebugUtil.m3651E0();
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: B7 */
    public static /* synthetic */ void m3592B7() {
        ew40.m6339h().m6346d();
        lsi0.y("已清除");
    }

    /* JADX INFO: renamed from: Ba */
    public static /* synthetic */ void m3595Ba(ArrayList arrayList, b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("toggle实验组，当前：".concat(((Boolean) CoreModule.c.e0.G6.get()).booleanValue() ? "true" : "false"), new d30() { // from class: l.q9d
            public final void call() {
                DebugUtil.m4470q0();
            }
        }));
        arrayList.add(vwb.Y("是否展示position，当前：".concat(((Boolean) CoreModule.c.e0.H6.get()).booleanValue() ? "true" : "false"), new d30() { // from class: l.s9d
            public final void call() {
                DebugUtil.m4593vd();
            }
        }));
        arrayList.add(new j760("ProfileLoopEditPicFrag", new C3175f(bVar)));
        arrayList.add(new j760("ProfileLoopMyLifeFrag, add_tag_to_photo", new C3179g(bVar)));
        arrayList.add(new j760("ProfileLoopMyLifeFrag, add_photo_to_tag", new C3183h(bVar)));
        arrayList.add(new j760("ProfileLoopMyLifeFrag, from_complete_equity_guide_card", new C3187i(bVar)));
        arrayList.add(new j760("ProfileLoopMyLifeFrag, from_complete_equity_guide", new C3191j(bVar)));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Bb */
    public static /* synthetic */ void m3596Bb() {
        hpd0 hpd0Var = lra0.m;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: Bc */
    public static /* synthetic */ void m3597Bc(b bVar) {
        u uVar = new u();
        ((com.p1.mobile.putong.core.newui.home.base.impl.swipe.a) uVar).a.put(0);
        ((com.p1.mobile.putong.core.newui.home.base.impl.swipe.a) uVar).b.put(0L);
        h7j.o();
        h7j.a0(CoreModule.K().me_(), bVar.K1(), (d30) null, "swipe_card");
    }

    /* JADX INFO: renamed from: Be */
    public static /* synthetic */ void m3599Be(Throwable th) {
    }

    /* JADX INFO: renamed from: Bj */
    public static void m3604Bj(final Act act) {
        i0e.d(act).D(10).r("输入插入Userid").F(new e30() { // from class: l.ntc
            public final void call(Object obj) {
                e51.H(act, new Runnable() { // from class: l.g0d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m3732Hf(str);
                    }
                }, 1000L);
            }
        }).n().show();
    }

    /* JADX INFO: renamed from: Bk */
    public static void m3605Bk(ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("测试环境调整划卡活跃天数", new d30() { // from class: l.iuc
            public final void call() {
                i0e.d(bVar.K1()).r("输入天数（2-9）").F(new e30() { // from class: l.t6d
                    public final void call(Object obj) {
                        DebugUtil.m4552tg((String) obj);
                    }
                }).n().show();
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m3606C() {
        hpd0 hpd0Var = CoreModule.c.e0.E4;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: C1 */
    public static /* synthetic */ void m3608C1(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("首页启动介绍弹窗", new d30() { // from class: l.x6d
            public final void call() {
                new peq0(bVar.K1(), "").show();
            }
        }));
        arrayList.add(vwb.Y("首页启动介绍弹窗清除本地记录", new d30() { // from class: l.y6d
            public final void call() {
                DebugUtil.m4408n4();
            }
        }));
        arrayList.add(vwb.Y("购买弹窗", new d30() { // from class: l.z6d
            public final void call() {
                DebugUtil.m4356ki(bVar);
            }
        }));
        arrayList.add(vwb.Y("购买全屏 - 漫游", new d30() { // from class: l.a7d
            public final void call() {
                com.p1.mobile.putong.core.ui.purchase.c.Q0(bVar.K1(), "", Privilege.youth_roaming);
            }
        }));
        arrayList.add(vwb.Y("购买全屏 - 搭子", new d30() { // from class: l.b7d
            public final void call() {
                com.p1.mobile.putong.core.ui.purchase.c.Q0(bVar.K1(), "", Privilege.youth_find_partner);
            }
        }));
        arrayList.add(vwb.Y("购买全屏 - 盲盒", new d30() { // from class: l.d7d
            public final void call() {
                com.p1.mobile.putong.core.ui.purchase.c.Q0(bVar.K1(), "", Privilege.youth_blind_box);
            }
        }));
        arrayList.add(vwb.Y("购买全屏 - 已读", new d30() { // from class: l.e7d
            public final void call() {
                com.p1.mobile.putong.core.ui.purchase.c.Q0(bVar.K1(), "", Privilege.youth_message_read);
            }
        }));
        arrayList.add(vwb.Y("购买全屏 - 超级喜欢", new d30() { // from class: l.f7d
            public final void call() {
                com.p1.mobile.putong.core.ui.purchase.c.Q0(bVar.K1(), "", Privilege.youth_superlike);
            }
        }));
        arrayList.add(vwb.Y("漫游", new d30() { // from class: l.g7d
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().startActivity(VipLocationHistoryAct.V1(bVar2.K1(), "p_youthvip_page"));
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: C6 */
    public static /* synthetic */ void m3613C6() {
        e eVar = CoreModule.c.g0;
        e.E0.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: C8 */
    public static /* synthetic */ void m3615C8(hpd0 hpd0Var, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            CoreModule.c.f0.Ae();
        } else if (((Boolean) hpd0Var.get()).booleanValue()) {
            hpd0Var.put(Boolean.FALSE);
        } else {
            hpd0Var.put(Boolean.TRUE);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: Cb */
    public static /* synthetic */ void m3618Cb() {
        PartialListOpt partialListOpt = (PartialListOpt) CoreModule.c.m0.a0.e();
        int size = ((PartialListOpt) CoreModule.c.m0.a0.e()).loaded.size() - 1;
        CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) ((PartialListOpt) CoreModule.c.m0.a0.e()).loaded.get(size);
        userInfo.preSwipedDirection = SwipeDirection.RIGHT;
        List<T> list = ((PartialListOpt) CoreModule.c.m0.a0.e()).loaded;
        list.remove(size);
        list.add(0, (T) userInfo);
        CoreModule.c.m0.a0.onNext(new PartialListOpt(list, partialListOpt.links));
    }

    /* JADX INFO: renamed from: Cc */
    public static /* synthetic */ void m3619Cc() {
        CityCData cityCDataNew_ = CityCData.new_();
        cityCDataNew_.userId = ((DbObject) CoreModule.c.e0.p9()).id;
        cityCDataNew_.expireAt = mqi0.o() + 3600000;
        CoreModule.c.h2.V.onNext(vwb.Y(cityCDataNew_, (Object) null));
    }

    /* JADX INFO: renamed from: Cg */
    public static /* synthetic */ void m3623Cg() {
        hpd0 hpd0Var = CoreModule.c.f0.o1;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: Ch */
    public static /* synthetic */ void m3624Ch() {
        CoreModule.c.m1.o4();
        lsi0.y("已清除");
    }

    /* JADX INFO: renamed from: Ci */
    public static /* synthetic */ void m3625Ci(b bVar) {
        if (NullChecker.a(bVar.A2()) && NullChecker.a(bVar.A2().d())) {
            View view = (NewNewProfileCard) bVar.A2().d();
            mah0.m8073s0().m8107Z0(bVar, view, ((NewNewProfileCard) view).v1, ((NewNewProfileCard) view).T);
        }
    }

    /* JADX INFO: renamed from: Cj */
    public static void m3626Cj(ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("国际化 see 盲盒", new d30() { // from class: l.cwc
            public final void call() {
                DebugUtil.m3844Mj(bVar, false);
            }
        }));
        arrayList.add(vwb.Y("国际化 see 盲盒 测试user 入库", new d30() { // from class: l.dwc
            public final void call() {
                DebugUtil.m3844Mj(bVar, true);
            }
        }));
    }

    /* JADX INFO: renamed from: Ck */
    public static void m3627Ck(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("超级喜欢pup", new C3173e1(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m3628D() {
        CoreModule.c.m0.V0.put(Boolean.TRUE);
        CoreModule.c.m0.W0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m3629D0() {
        hpd0 hpd0Var = App.q;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        e51.E();
    }

    /* JADX INFO: renamed from: D1 */
    public static /* synthetic */ void m3630D1() {
    }

    /* JADX INFO: renamed from: D3 */
    public static /* synthetic */ void m3632D3(User user) {
        user.name += "-MOCK用户名字很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长";
    }

    /* JADX INFO: renamed from: D4 */
    public static /* synthetic */ void m3633D4() {
        rx.subjects.a aVar = CoreModule.c.m0.a0;
        aVar.onNext((PartialListOpt) aVar.e());
    }

    /* JADX INFO: renamed from: D6 */
    public static /* synthetic */ void m3635D6(b bVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PurchaseType.TYPE_GET_VIP);
        arrayList.add(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        new j6b0.a(bVar.K1(), arrayList, (List) null, (String) null).a(1).b(new d30() { // from class: l.oad
            public final void call() {
                DebugUtil.m3662Eb();
            }
        }).c(new e30() { // from class: l.pad
            public final void call(Object obj) {
                DebugUtil.m4603w1((PurchaseType) obj);
            }
        }).f(new e30() { // from class: l.qad
            public final void call(Object obj) {
                DebugUtil.m3798Kf((PurchaseType) obj);
            }
        }).d(new e30() { // from class: l.rad
            public final void call(Object obj) {
                DebugUtil.m4564u6((PurchaseType) obj);
            }
        }).e(new g30() { // from class: l.sad
            /* JADX INFO: renamed from: a */
            public final void m9272a(Object obj, Object obj2, Object obj3) {
                DebugUtil.m4394mc((PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).g();
    }

    /* JADX INFO: renamed from: D8 */
    public static /* synthetic */ void m3637D8(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("清除数据", new d30() { // from class: l.p7d
            public final void call() {
                CoreModule.K().m5133Xd();
            }
        }));
        arrayList.add(vwb.Y("插入消息", new d30() { // from class: l.q7d
            public final void call() {
                CoreModule.c.v2.C3(((DbObject) bVar.A2().o().d()).id, mqi0.o());
            }
        }));
        arrayList.add(vwb.Y("顶部卡片设置外露喜欢", new d30() { // from class: l.r7d
            public final void call() {
                bVar.A2().o().e().hasLikeMeSlideCardTop = true;
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Da */
    public static /* synthetic */ void m3639Da(b bVar) {
        gxf gxfVar = new gxf(bVar.K1());
        gxfVar.m6854C(CoreModule.c.e0.Z7(), false, "p_suggest_users_home_view");
        gxfVar.show();
    }

    /* JADX INFO: renamed from: Dc */
    public static /* synthetic */ void m3641Dc() {
        ew40.m6339h().m6353o(0L);
        lsi0.y("已清除");
    }

    /* JADX INFO: renamed from: Dd */
    public static /* synthetic */ void m3642Dd() {
        hpd0 hpd0Var = lra0.r;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: Dj */
    public static void m3648Dj(ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("国际化 520", new d30() { // from class: l.unc
            public final void call() {
                qff0.INSTANCE.n(bVar.K1(), 1);
            }
        }));
    }

    /* JADX INFO: renamed from: Dk */
    public static void m3649Dk(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("滑卡限制", new C3208n0(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m3650E() {
        CoreModule.c.e0.w4.put(Boolean.TRUE);
        com.p1.mobile.android.ui.poplevel.a.p().w(true);
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ void m3651E0() {
        hpd0 hpd0Var = CoreModule.c.e0.v2;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: E1 */
    public static /* synthetic */ void m3652E1(b bVar) {
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(bVar.K1(), "wx67f59443a9c801bb");
        if (!iwxapiCreateWXAPI.isWXAppInstalled()) {
            lsi0.y(CoreModule.b.getString(com.p1.mobile.putong.core.pay.R.string.Y9));
            return;
        }
        WXLaunchMiniProgram.Req req = new WXLaunchMiniProgram.Req();
        req.userName = "gh_3a849b303c14";
        req.path = "pages/association/index?publicId=";
        req.miniprogramType = 0;
        iwxapiCreateWXAPI.sendReq(req);
    }

    /* JADX INFO: renamed from: E2 */
    public static /* synthetic */ void m3653E2() {
        hpd0 hpd0Var = lra0.a;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: E3 */
    public static /* synthetic */ void m3654E3(b bVar) {
        q89 q89Var = CoreModule.c.p0;
        q89Var.S = 0.25d;
        q89Var.U = 0.19d;
        bo5.m5758l(bVar.K1(), m3823Lj(bVar), "debug", null);
    }

    /* JADX INFO: renamed from: E4 */
    public static /* synthetic */ void m3655E4() {
        hpd0 hpd0Var = CoreModule.c.m0.N1;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: E7 */
    public static /* synthetic */ void m3658E7() {
    }

    /* JADX INFO: renamed from: E9 */
    public static /* synthetic */ void m3660E9(b bVar) {
        Window window = bVar.K1().getWindow();
        if (window != null) {
            window.setSoftInputMode(3);
        }
        e51.H(bVar.K1(), new RunnableC3220r(bVar), 1000L);
    }

    /* JADX INFO: renamed from: Ea */
    public static /* synthetic */ void m3661Ea() {
        hpd0 hpd0Var = lra0.s;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        lra0.t.put(bool);
    }

    /* JADX INFO: renamed from: Eb */
    public static /* synthetic */ void m3662Eb() {
    }

    /* JADX INFO: renamed from: Ec */
    public static /* synthetic */ void m3663Ec() {
        hpd0 hpd0Var = lra0.e0;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        lra0.d0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: Ed */
    public static /* synthetic */ void m3664Ed(b bVar) {
        PurchaseType purchaseType = PurchaseType.TYPE_SVIP_PICKS_MEMBERSHIP;
        new com.p1.mobile.putong.core.ui.purchase.mediator.c.a(bVar.K1(), purchaseType, (String) null).g(fy80.j(purchaseType.getPrivilegeData(null), Privilege.picksMembership)).h();
    }

    /* JADX INFO: renamed from: Ee */
    public static /* synthetic */ void m3665Ee(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("查看一键配对本地缓存信息", new d30() { // from class: l.s1d
            public final void call() {
                ew40.m6339h().m6347e();
            }
        }));
        arrayList.add(vwb.Y("清除一键配对本地缓存信息", new d30() { // from class: l.t1d
            public final void call() {
                ew40.m6339h().m6345c();
            }
        }));
        arrayList.add(vwb.Y("一键配对探探币确认使用弹窗", new d30() { // from class: l.u1d
            public final void call() {
                com.p1.mobile.putong.core.ui.match.b.B(bVar.K1(), (d30) null, PurchaseType.TYPE_O_DIAMOND);
            }
        }));
        arrayList.add(vwb.Y("一键配对探探币购买弹窗", new d30() { // from class: l.v1d
            public final void call() {
                swh0.q1(bVar.K1(), "", CoreModule.c.H0.A4());
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Ef */
    public static /* synthetic */ void m3666Ef() {
        CoreModule.c.E0.v3();
        lsi0.y("已清除");
    }

    /* JADX INFO: renamed from: Eh */
    public static /* synthetic */ void m3668Eh() {
        hpd0 hpd0Var = CoreModule.c.K1.V;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: Ej */
    public static void m3670Ej() {
        e51.y(new Runnable() { // from class: l.kzc
            @Override // java.lang.Runnable
            public final void run() {
                DebugUtil.m4289hg();
            }
        });
    }

    /* JADX INFO: renamed from: Ek */
    public static void m3671Ek(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("1v1", new C3222r1(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: F1 */
    public static /* synthetic */ void m3674F1() {
        hpd0 hpd0Var = CoreModule.c.e0.w4;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: F2 */
    public static /* synthetic */ void m3675F2() {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.moment_user_state);
        messageNew_.extData = MessageExtData.new_();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sourceFlag", "1");
            jSONObject.put("emotionUrl", "http://cloud.staging2.p1staff.com/v1/videos/eyJpZCI6IllVTUVVRkRCM1lVSVRDNDRUTkwzWVM0NEpVQU5VNTAxIiwidyI6NDgwLCJoIjo0ODAsImQiOjE1LCJtdCI6InZpZGVvL21wNCIsImRoIjo1Mjc3ODQ4MzZ9");
            jSONObject.put("emotionText", "吃瓜");
            messageNew_.extData.extra = jSONObject.toString(1);
            CoreModule.c.f0.o2.clear();
            CoreModule.c.f0.o2.add(messageNew_);
        } catch (JSONException e) {
            CrashHelper.c(e);
            aag0.a(e);
        }
    }

    /* JADX INFO: renamed from: F3 */
    public static /* synthetic */ void m3676F3() {
        hpd0 hpd0Var = CoreModule.c.m0.s1;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: F4 */
    public static /* synthetic */ void m3677F4() {
    }

    /* JADX INFO: renamed from: F6 */
    public static /* synthetic */ void m3679F6() {
        com.p1.mobile.putong.core.ui.match.a.w().s().clear();
        com.p1.mobile.putong.core.ui.match.a.w().t().clear();
        com.p1.mobile.putong.core.ui.match.a.w().r().clear();
        com.p1.mobile.putong.core.ui.match.a.w().q().clear();
        com.p1.mobile.putong.core.ui.match.a.w().y().clear();
        com.p1.mobile.putong.core.ui.match.a.w().x().clear();
    }

    /* JADX INFO: renamed from: F7 */
    public static /* synthetic */ void m3680F7() {
        hpd0 hpd0Var = CoreModule.c.e0.c5;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: F9 */
    public static /* synthetic */ void m3682F9() {
        PushMessage pushMessage = new PushMessage();
        pushMessage.intent = "newMaleUserLike.received";
        CoreBusinessModule.e.n("", "", "", pushMessage, (PushTrackData) null);
    }

    /* JADX INFO: renamed from: Fc */
    public static /* synthetic */ void m3685Fc(b bVar) {
        if (NullChecker.a(bVar.A2()) && NullChecker.a(bVar.A2().d())) {
            CoreSuggested.UserInfo userInfoJ = bVar.A2().j();
            mah0.m8073s0().m8115i1(bVar, bVar.A2().d(), userInfoJ, 0);
        }
    }

    /* JADX INFO: renamed from: Fd */
    public static /* synthetic */ void m3686Fd() {
        List<LiteraturesComments> listM4853l = BookMoviesDramasHelper.m4853l(CoreModule.H().userId());
        if (listM4853l.isEmpty()) {
            return;
        }
        listM4853l.toString();
    }

    /* JADX INFO: renamed from: Ff */
    public static /* synthetic */ void m3688Ff() {
        Relationship relationship = new Relationship();
        relationship.status = new ArrayList();
        tpd0 tpd0Var = new tpd0("LIKE_USER", 0);
        for (int iIntValue = (((Integer) tpd0Var.get()).intValue() * 300) + 32000; iIntValue < ((((Integer) tpd0Var.get()).intValue() + 1) * 300) + 32000; iIntValue++) {
            y.i3(iIntValue + "", relationship).materialize().subscribe();
        }
        lsi0.y(String.format("第 %s 组 300 人喜欢我", Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1)));
        tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
    }

    /* JADX INFO: renamed from: Fg */
    public static /* synthetic */ void m3689Fg(b bVar) {
        Merchandise merchandise = (Merchandise) vwb.r((List) CoreModule.c.j0.E4().e(), new w9j() { // from class: l.uad
            public final Object call(Object obj) {
                Merchandise merchandise2 = (Merchandise) obj;
                return Boolean.valueOf(TEnum.equals(merchandise2.category, ProductCategory.tttVip) && merchandise2.monthly() && merchandise2.autoRenewable());
            }
        });
        if (merchandise.getCouponForPromotion(MonetizationPromotionsId.trial7DVIP) != null) {
            new rnl0().s(bVar.K1(), merchandise);
        } else {
            lsi0.y("商品或者优惠券为空");
        }
    }

    /* JADX INFO: renamed from: Fh */
    public static /* synthetic */ void m3690Fh() {
        hpd0 hpd0Var = lra0.j0;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        hpd0 hpd0Var2 = lra0.i0;
        Boolean bool = Boolean.FALSE;
        hpd0Var2.put(bool);
        lra0.h0.put(bool);
        lra0.k0.put(bool);
    }

    /* JADX INFO: renamed from: Fi */
    public static void m3691Fi(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("Alerts通用", new C3213o1(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: Fj */
    public static void m3692Fj(e30<User> e30Var, int i) {
        final PartialListOpt partialListOpt = (PartialListOpt) CoreModule.c.m0.a0.e();
        List<T> list = partialListOpt.loaded;
        if (vwb.J(list)) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User userPa = CoreModule.c.e0.Pa(((CoreSuggested.UserInfo) it.next()).id);
            if (userPa != null) {
                User user = new User() { // from class: com.p1.mobile.putong.core.util.DebugUtil.40
                    boolean isMerged = false;

                    public boolean shouldMergeData() {
                        if (this.isMerged) {
                            return false;
                        }
                        this.isMerged = true;
                        return true;
                    }
                };
                user.mergeData(userPa);
                ((DbObject) user).id = ((DbObject) userPa).id;
                ((DbObject) user)._id = ((DbObject) userPa)._id;
                e30Var.call(user);
                arrayList.add(user);
                i--;
                if (i <= 0) {
                    break;
                }
            }
        }
        rx.c.fromCallable(new Callable() { // from class: l.otc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return DebugUtil.m4145b4(arrayList);
            }
        }).compose(mkd0.C()).subscribe(mkd0.G(new e30() { // from class: l.ptc
            public final void call(Object obj) {
                CoreModule.c.m0.a0.onNext(partialListOpt);
            }
        }));
    }

    /* JADX INFO: renamed from: Fk */
    public static void m3693Fk(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("聊天详情页内切换新会话", new C3177f1(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: G1 */
    public static /* synthetic */ void m3696G1() {
    }

    /* JADX INFO: renamed from: G2 */
    public static /* synthetic */ void m3697G2() {
        hpd0 hpd0Var = CoreModule.c.e0.P1;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: G4 */
    public static /* synthetic */ void m3699G4() {
        hpd0 hpd0Var = CoreModule.c.e0.P2;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: G5 */
    public static /* synthetic */ void m3700G5(b bVar) {
        s8b0.e("2170");
        if (NullChecker.a(uld0.i("[{\"channel\":\"buy\",\"privilegeType\":\"roaming\",\"count\":0,\"remaining\":0,\"duration\":7776000,\"expireAt\":1699340315},{\"channel\":\"buy\",\"privilegeType\":\"seeWhoLikedMe\",\"count\":0,\"remaining\":0,\"duration\":7776000,\"expireAt\":1699340315},{\"channel\":\"buy\",\"privilegeType\":\"superLikeMembership\",\"count\":0,\"remaining\":0,\"duration\":7776000,\"expireAt\":1699340315},{\"channel\":\"buy\",\"privilegeType\":\"svip\",\"count\":0,\"remaining\":0,\"duration\":7776000,\"expireAt\":1699340315},{\"channel\":\"buy\",\"privilegeType\":\"undoMembership\",\"count\":0,\"remaining\":0,\"duration\":7776000,\"expireAt\":1699340315},{\"channel\":\"buy\",\"privilegeType\":\"unlimitedSwipes\",\"count\":0,\"remaining\":0,\"duration\":7776000,\"expireAt\":1699340315},{\"channel\":\"buy\",\"privilegeType\":\"vip\",\"count\":0,\"remaining\":0,\"duration\":7776000,\"expireAt\":1699340315},{\"channel\":\"buy\",\"privilegeType\":\"quickchatMembership\",\"count\":0,\"remaining\":0,\"duration\":7776000,\"expireAt\":1699340315},{\"channel\":\"give\",\"privilegeType\":\"superLike\",\"count\":5,\"remaining\":10,\"duration\":0,\"expireAt\":0},{\"channel\":\"give\",\"privilegeType\":\"quickchatNumber\",\"count\":5,\"remaining\":12,\"duration\":0,\"expireAt\":0},{\"channel\":\"give\",\"privilegeType\":\"boost\",\"count\":1,\"remaining\":4,\"duration\":0,\"expireAt\":0}]").second)) {
            s8b0.d(1);
        } else {
            s8b0.d(0);
        }
        bVar.K1().startActivity(AccessTokenWebViewAct.k2(bVar.K1(), "", "http://m.staging2.p1staff.com/commerce/svip?expiresTime=1699340315000&time=1699339716000&duration=7776000&showGift=true&avatarURL=http://cloud.staging2.p1staff.com/v1/images/eyJpZCI6Ik8zNVk2RDVPTjZZN0EyM0M1MlJJRUkzSkQ3UlNEQzAwIiwidyI6MTQ0MCwiaCI6MTQ0MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjEzMTYzMjAxNTczMzEzNjg1NzY0fQ&gender=male&startBoost=false&name=%E4%B8%83%E5%85%AB%E5%85%AB%E5%9B%9B", true, false, true, true));
    }

    /* JADX INFO: renamed from: G8 */
    public static /* synthetic */ void m3703G8(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("城市封面 没人购买", new d30() { // from class: l.b2d
            public final void call() {
                b bVar2 = bVar;
                e51.H(bVar2.K1(), new DebugUtil.RunnableC3228t1(new m45(bVar2.K1(), "")), 300L);
            }
        }));
        arrayList.add(vwb.Y("城市封面 自己购买后", new d30() { // from class: l.c2d
            public final void call() {
                b bVar2 = bVar;
                e51.H(bVar2.K1(), new DebugUtil.RunnableC3231u1(new m45(bVar2.K1(), "")), 300L);
            }
        }));
        arrayList.add(vwb.Y("城市封面 查看其他人购买", new d30() { // from class: l.d2d
            public final void call() {
                b bVar2 = bVar;
                e51.H(bVar2.K1(), new DebugUtil.RunnableC3234v1(new m45(bVar2.K1(), "")), 300L);
            }
        }));
        arrayList.add(vwb.Y("城市封面 确认", new d30() { // from class: l.e2d
            public final void call() {
                b bVar2 = bVar;
                e51.H(bVar2.K1(), new DebugUtil.RunnableC3237w1(new m45(bVar2.K1(), "")), 300L);
            }
        }));
        arrayList.add(vwb.Y("城市封面 购买成功", new d30() { // from class: l.f2d
            public final void call() {
                b bVar2 = bVar;
                e51.H(bVar2.K1(), new DebugUtil.RunnableC3246z1(new o45(bVar2.K1(), "")), 300L);
            }
        }));
        arrayList.add(vwb.Y("城市封面 清理购买成功插卡标记:" + CoreModule.c.m0.C1.get(), new d30() { // from class: l.g2d
            public final void call() {
                CoreModule.c.m0.C1.put(Boolean.FALSE);
            }
        }));
        arrayList.add(vwb.Y("城市封面 测试收到 CoreCityTop 插卡:" + CoreModule.c.m0.D1.get(), new d30() { // from class: l.h2d
            public final void call() {
                DebugUtil.m3754If();
            }
        }));
        arrayList.add(vwb.Y("城市封面 购买成功插卡", new d30() { // from class: l.i2d
            public final void call() {
                DebugUtil.m3619Cc();
            }
        }));
        arrayList.add(vwb.Y("城市置顶，清除活跃时间", new d30() { // from class: l.j2d
            public final void call() {
                CoreModule.c.h2.C3().subscribe(mkd0.B());
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: G9 */
    public static /* synthetic */ void m3704G9() {
        CoreModule.c.u2.R.clear();
        CoreModule.c.u2.S.clear();
        CoreModule.c.u2.U.clear();
        CoreModule.c.u2.T.clear();
        CoreModule.c.u2.V.clear();
        CoreModule.c.u2.W.clear();
        CoreModule.c.u2.X.clear();
    }

    /* JADX INFO: renamed from: Gb */
    public static /* synthetic */ void m3706Gb() {
        hpd0 hpd0Var = CoreModule.c.m0.G1;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: Gc */
    public static /* synthetic */ void m3707Gc() {
        hpd0 hpd0Var = lra0.E;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: Gd */
    public static /* synthetic */ void m3708Gd() {
        hpd0 hpd0Var = CoreModule.c.m0.E1;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: Ge */
    public static /* synthetic */ void m3709Ge() {
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
        new uqd0("tantanAuthTipsShowDate", (String) null).put("");
        new vqd0("tantanAuthTipsShowUser", new HashSet()).put(new HashSet());
        new tpd0("tantanAuthToastShowTimes", 0).put(0);
        new uqd0("tantanAuthToastShowDate", (String) null).put("");
        new vqd0("tantanAuthToastShowUser", new HashSet()).put(new HashSet());
    }

    /* JADX INFO: renamed from: Gg */
    public static /* synthetic */ void m3711Gg() {
        hpd0 hpd0Var = lra0.M;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: Gi */
    public static void m3713Gi(final b bVar) {
        VButton vButton = new VButton(bVar.K1());
        vButton.setText("Debug");
        vButton.setPadding(t100.d(30.0f), t100.d(30.0f), t100.d(30.0f), t100.d(30.0f));
        vButton.setBackgroundColor(-16711936);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        layoutParams.topMargin = t100.d(-180.0f);
        bVar.a.addView((View) vButton, (ViewGroup.LayoutParams) layoutParams);
        xdl0.E0(vButton, new View.OnClickListener() { // from class: l.xzc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugUtil.m3809L5(bVar, view);
            }
        });
        VButton vButton2 = new VButton(bVar.K1());
        vButton2.setText("Debug");
        vButton2.setPadding(t100.d(30.0f), t100.d(30.0f), t100.d(30.0f), t100.d(30.0f));
        vButton2.setBackgroundColor(-16711936);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        bVar.a.addView((View) vButton2, (ViewGroup.LayoutParams) layoutParams2);
        xdl0.E0(vButton2, new View.OnClickListener() { // from class: l.yzc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.c.m0.W5(1);
            }
        });
        VButton vButton3 = new VButton(bVar.K1());
        vButton3.setBackgroundColor(-16711936);
        vButton3.setText("Refresh");
        vButton3.setPadding(t100.d(30.0f), t100.d(30.0f), t100.d(30.0f), t100.d(30.0f));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        layoutParams3.topMargin = t100.d(130.0f);
        bVar.a.addView((View) vButton3, (ViewGroup.LayoutParams) layoutParams3);
        xdl0.E0(vButton3, new View.OnClickListener() { // from class: l.zzc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.c.m0.W5(-1);
            }
        });
    }

    /* JADX INFO: renamed from: Gj */
    public static void m3714Gj(User user, String str, int i) {
        if (qib0.k0.d.query(str) != null) {
            return;
        }
        User userNew_ = User.new_();
        ((DbObject) userNew_).id = str;
        userNew_.name = "MockUser" + (i + 1);
        userNew_.gender = Gender.get("female");
        userNew_.pictures = new ArrayList();
        if (user != null && !vwb.J(user.pictures)) {
            Media media = (Media) user.pictures.get(0);
            Picture pictureCover = media != null ? media.cover() : null;
            if (pictureCover != null) {
                userNew_.pictures.add(pictureCover.clone());
            }
        }
        if (vwb.J(userNew_.pictures)) {
            Picture pictureNew_ = Picture.new_();
            ((Media) pictureNew_).url = "";
            userNew_.pictures.add(pictureNew_);
        }
        qib0.k0.d.upsert(userNew_);
    }

    /* JADX INFO: renamed from: Gk */
    public static void m3715Gk(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("特定行为进四选一", new C3216p1(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m3717H0(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: H1 */
    public static /* synthetic */ void m3718H1() {
        xjc0.m10866a(xjc0.f8495a);
        xjc0.m10866a(xjc0.f8496b);
        xjc0.m10866a(xjc0.f8497c);
        xjc0.m10866a(xjc0.f8498d);
    }

    /* JADX INFO: renamed from: H3 */
    public static /* synthetic */ void m3720H3(b bVar) {
        if (NullChecker.a(bVar.A2().d())) {
            bVar.A2().d().Q0();
        }
    }

    /* JADX INFO: renamed from: H6 */
    public static /* synthetic */ void m3723H6() {
        String str = "message_read_state_text_guide_shown_" + CoreModule.H().userId();
        Boolean bool = Boolean.FALSE;
        new hpd0(str, bool).put(bool);
        lsi0.y("已重置");
    }

    /* JADX INFO: renamed from: Hf */
    public static /* synthetic */ void m3732Hf(String str) {
        if (NullChecker.a(CoreModule.c.e0.Pa(str))) {
            lsi0.j("有结果");
        } else {
            lsi0.j("空结果");
        }
    }

    /* JADX INFO: renamed from: Hi */
    public static void m3735Hi(final ArrayList<j760<String, d30>> arrayList, final b bVar, final HashMap<String, hpd0> map) {
        arrayList.add(vwb.Y("AB 实验 Debug 开关", new d30() { // from class: l.pkc
            public final void call() {
                DebugUtil.m4150b9(map, arrayList, bVar);
            }
        }));
    }

    /* JADX INFO: renamed from: Hj */
    public static void m3736Hj(final ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("FakeGuide", new d30() { // from class: l.juc
            public final void call() {
                DebugUtil.m4128a9(arrayList, bVar);
            }
        }));
    }

    /* JADX INFO: renamed from: Hk */
    public static void m3737Hk(final ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("AvatarCards改造", new d30() { // from class: l.luc
            public final void call() {
                DebugUtil.m3595Ba(arrayList, bVar);
            }
        }));
    }

    /* JADX INFO: renamed from: I1 */
    public static /* synthetic */ void m3740I1() {
        hpd0 hpd0Var = lra0.f0;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: I4 */
    public static /* synthetic */ void m3743I4() {
    }

    /* JADX INFO: renamed from: I5 */
    public static /* synthetic */ void m3744I5() {
        hpd0 hpd0Var = tvf.c;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        tvf.b.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: I7 */
    public static /* synthetic */ void m3746I7() {
        hpd0 hpd0Var = f2200h;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: Ib */
    public static /* synthetic */ void m3750Ib() {
        hpd0 hpd0Var = lra0.D;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: Id */
    public static /* synthetic */ void m3752Id() {
        hpd0 hpd0Var = CoreModule.c.e0.K2;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: Ie */
    public static /* synthetic */ void m3753Ie() {
        snm.f7404j = true;
        snm.f7401g = true;
        snm.f7402h = true;
        snm.f7403i = true;
    }

    /* JADX INFO: renamed from: If */
    public static /* synthetic */ void m3754If() {
        hpd0 hpd0Var = CoreModule.c.m0.D1;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: Ii */
    public static void m3757Ii(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("异常会话处理", new C3212o0(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: Ij */
    public static void m3758Ij(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("引导用户进动态", new C3230u0(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: Ik */
    public static void m3759Ik(final ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("体验弹窗", new d30() { // from class: l.skc
            public final void call() {
                DebugUtil.m3953S2(arrayList, bVar);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m3760J(ArrayList arrayList, b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("清除引导标记(气泡、特权入口、访客入口)", new d30() { // from class: l.ezc
            public final void call() {
                DebugUtil.m3592B7();
            }
        }));
        arrayList.add(vwb.Y("我的tab访客入口标志切换" + ew40.m6339h().m6351l(), new d30() { // from class: l.fzc
            public final void call() {
                DebugUtil.m4329jd();
            }
        }));
        arrayList.add(vwb.Y("推荐卡片黑金样式", new d30() { // from class: l.gzc
            public final void call() {
                CoreModule.c.m0.W8().subscribe(mkd0.G(new e30() { // from class: l.tad
                    public final void call(Object obj) {
                        vwb.z(((PartialListOpt) obj).loaded, new e30() { // from class: l.k9c
                            public final void call(Object obj2) {
                                DebugUtil.m3923Qe((CoreSuggested.UserInfo) obj2);
                            }
                        });
                    }
                }));
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: J1 */
    public static /* synthetic */ void m3762J1() {
        if (NullChecker.a(CoreModule.c) && NullChecker.a(CoreModule.c.m0)) {
            CoreSuggested coreSuggested = CoreModule.c.m0;
            if (coreSuggested.a2.containsKey(coreSuggested.q6())) {
                CoreSuggested coreSuggested2 = CoreModule.c.m0;
                coreSuggested2.a2.remove(coreSuggested2.q6());
            } else {
                CoreSuggested coreSuggested3 = CoreModule.c.m0;
                coreSuggested3.a2.put(coreSuggested3.q6(), 0);
            }
        }
    }

    /* JADX INFO: renamed from: J2 */
    public static /* synthetic */ void m3763J2(String str) {
        Relationship relationship = new Relationship();
        ArrayList arrayList = new ArrayList();
        relationship.status = arrayList;
        arrayList.add(MatchFrom.get("diamondReceived"));
        y.i3(str, relationship).materialize().subscribe();
    }

    /* JADX INFO: renamed from: J9 */
    public static /* synthetic */ void m3770J9() {
        Message messageNew_ = Message.new_();
        tpd0 tpd0Var = App.i;
        ((DbObject) messageNew_).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) tpd0Var.get()).intValue());
        messageNew_.messageType = MessageType.get(MessageType.moment_user_state);
        messageNew_.createdTime = mqi0.o();
        messageNew_.localCreatedTime = System.nanoTime();
        messageNew_.localCreatedSession = ((Integer) tpd0Var.get()).intValue();
        messageNew_.localInConversation = true;
        messageNew_.owner = ((DbObject) CoreModule.c.e0.na()).id;
        messageNew_.recalled = Boolean.FALSE;
        StateData stateData = new StateData();
        stateData.emotionId = "1";
        stateData.emotionText = "学习";
        stateData.emotionUrl = ((Media) CoreModule.K().me_().fp()).url;
        stateData.value = "找搭子一起学习找搭子一起学习";
        MessageExtData messageExtData = new MessageExtData();
        messageExtData.extra = stateData.toJson();
        messageNew_.extData = messageExtData;
        CoreModule.c.f0.o2.clear();
        CoreModule.c.f0.o2.add(messageNew_);
    }

    /* JADX INFO: renamed from: Ja */
    public static /* synthetic */ void m3771Ja(b bVar) {
        PartialListOpt partialListOpt = (PartialListOpt) CoreModule.c.m0.a0.e();
        if (partialListOpt.loaded == null) {
            return;
        }
        for (int i = 0; i < Math.min(partialListOpt.loaded.size(), 10); i++) {
            abi.m5323J(bVar.K1(), CoreModule.c.e0.Pa(((CoreSuggested.UserInfo) partialListOpt.loaded.get(i)).id));
        }
    }

    /* JADX INFO: renamed from: Jb */
    public static /* synthetic */ void m3772Jb(ArrayList arrayList) {
        arrayList.clear();
        CoreModule.c.f0.l1.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: Jd */
    public static /* synthetic */ void m3774Jd(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("精选插卡", new d30() { // from class: l.a3d
            public final void call() {
                PicksHelper.Companion.b().p(true);
            }
        }));
        arrayList.add(vwb.Y("精选插卡动效", new d30() { // from class: l.b3d
            public final void call() {
                DebugUtil.m4653y7(bVar);
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Je */
    public static /* synthetic */ void m3775Je() {
        hpd0 hpd0Var = lra0.I;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: Ji */
    public static void m3779Ji(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("检查被ban卡片", new C3181g1(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: Jj */
    public static void m3780Jj(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("心动信号女性路经变短", new C3157a1(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: Jk */
    public static void m3781Jk(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("强制指定认证类型", new C3209n1(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ void m3783K0(b bVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        arrayList.add(PurchaseType.TYPE_O_DIAMOND);
        new j6b0.a(bVar.K1(), arrayList, (List) null, (String) null).a(1).b(new d30() { // from class: l.nbd
            public final void call() {
                DebugUtil.m4461pd();
            }
        }).c(new e30() { // from class: l.obd
            public final void call(Object obj) {
                DebugUtil.m3717H0((PurchaseType) obj);
            }
        }).f(new e30() { // from class: l.pbd
            public final void call(Object obj) {
                DebugUtil.m3880Od((PurchaseType) obj);
            }
        }).d(new e30() { // from class: l.qbd
            public final void call(Object obj) {
                DebugUtil.m3988Tg((PurchaseType) obj);
            }
        }).e(new g30() { // from class: l.rbd
            /* JADX INFO: renamed from: a */
            public final void m9128a(Object obj, Object obj2, Object obj3) {
                DebugUtil.m4535t((PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).g();
    }

    /* JADX INFO: renamed from: K1 */
    public static /* synthetic */ void m3784K1() {
        hpd0 hpd0Var = CoreModule.c.e0.t5;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: K2 */
    public static /* synthetic */ void m3785K2(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("划卡优化开：" + CoreModule.c.m0.s1.get(), new d30() { // from class: l.opc
            public final void call() {
                DebugUtil.m3676F3();
            }
        }));
        arrayList.add(vwb.Y("底部debug：", new d30() { // from class: l.bqc
            public final void call() {
                bVar.K1().h7();
            }
        }));
        arrayList.add(vwb.Y("新UiDebug：" + CoreModule.c.e0.B6.get(), new d30() { // from class: l.oqc
            public final void call() {
                DebugUtil.m4217ea();
            }
        }));
        arrayList.add(vwb.Y("修改按钮样式：", new d30() { // from class: l.arc
            public final void call() {
                bVar.J0.setButtonStyleType("oDiamond");
            }
        }));
        arrayList.add(vwb.Y("贴纸Debug：" + CoreModule.c.e0.k6.get(), new d30() { // from class: l.krc
            public final void call() {
                DebugUtil.m4553th();
            }
        }));
        arrayList.add(vwb.Y("清空贴纸Debug：" + CoreModule.c.e0.k6.get(), new d30() { // from class: l.lrc
            public final void call() {
                CoreModule.c.e0.k6.put(-1);
            }
        }));
        arrayList.add(vwb.Y("划卡debug check：" + CoreModule.c.e0.h6.get(), new d30() { // from class: l.mrc
            public final void call() {
                DebugUtil.m4572ue();
            }
        }));
        arrayList.add(vwb.Y("划卡debug 返回：" + CoreModule.c.e0.i6.get(), new d30() { // from class: l.nrc
            public final void call() {
                DebugUtil.m4274h1();
            }
        }));
        arrayList.add(vwb.Y("强制黑金：", new d30() { // from class: l.orc
            public final void call() {
                TabUniteManager.m2267i().m2277r();
            }
        }));
        arrayList.add(vwb.Y("认证成功Bubble", new d30() { // from class: l.prc
            public final void call() {
                b bVar2 = bVar;
                e51.H(bVar2.K1(), new Runnable() { // from class: l.uyc
                    @Override // java.lang.Runnable
                    public final void run() {
                        rwk0.l(bVar2.K1(), false, (InvitationInfo) null);
                    }
                }, 1500L);
            }
        }));
        arrayList.add(vwb.Y("自动滚动", new d30() { // from class: l.qpc
            public final void call() {
                e51.H(bVar.K1(), new Runnable() { // from class: l.e5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.c.e0.u6.onNext(roj0.a);
                    }
                }, 1500L);
            }
        }));
        arrayList.add(vwb.Y("debug默认数据：" + CoreModule.c.e0.j6.get(), new d30() { // from class: l.rpc
            public final void call() {
                DebugUtil.m4610w8();
            }
        }));
        arrayList.add(vwb.Y("认证相关数据清空：", new d30() { // from class: l.spc
            public final void call() {
                DebugUtil.m3863Nh();
            }
        }));
        arrayList.add(vwb.Y("划卡上限弹窗：" + m1.g, new d30() { // from class: l.tpc
            public final void call() {
                m1.g = !m1.g;
            }
        }));
        arrayList.add(vwb.Y("认证链路-头像确认：", new d30() { // from class: l.upc
            public final void call() {
                rwk0.m(bVar.K1(), 1, "debug");
            }
        }));
        arrayList.add(vwb.Y("认证链路-身份证：", new d30() { // from class: l.vpc
            public final void call() {
                rwk0.m(bVar.K1(), 2, "debug");
            }
        }));
        arrayList.add(vwb.Y("认证链路-认证结果-头像", new d30() { // from class: l.wpc
            public final void call() {
                AvatarResultAct.e2(bVar.K1(), 1);
            }
        }));
        arrayList.add(vwb.Y("认证链路-认证结果-身份证：", new d30() { // from class: l.xpc
            public final void call() {
                AvatarResultAct.e2(bVar.K1(), 2);
            }
        }));
        arrayList.add(vwb.Y("认证链路-认证结果-国家网络：", new d30() { // from class: l.ypc
            public final void call() {
                AvatarResultAct.e2(bVar.K1(), 3);
            }
        }));
        arrayList.add(vwb.Y("添加Debug控制：", new d30() { // from class: l.zpc
            public final void call() {
                DebugUtil.m3713Gi(bVar);
            }
        }));
        arrayList.add(vwb.Y("新Ui demo：", new d30() { // from class: l.cqc
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().startActivity(new Intent((Context) bVar2.K1(), (Class<?>) LabelDemoAct.class));
            }
        }));
        arrayList.add(vwb.Y("清空网图：", new d30() { // from class: l.dqc
            public final void call() {
                myf.B();
            }
        }));
        arrayList.add(vwb.Y("插入引导填写资料卡：", new d30() { // from class: l.eqc
            public final void call() {
                DebugUtil.m4253g2();
            }
        }));
        arrayList.add(vwb.Y("清空只看认证数据：", new d30() { // from class: l.fqc
            public final void call() {
                CoreModule.c.z2.x3();
            }
        }));
        arrayList.add(vwb.Y("假请求：" + CoreModule.c.z2.f0.get(), new d30() { // from class: l.gqc
            public final void call() {
                DebugUtil.m3916Q7();
            }
        }));
        arrayList.add(vwb.Y("开启只看认证：" + CoreModule.c.z2.g0.get(), new d30() { // from class: l.hqc
            public final void call() {
                DebugUtil.m4631x7();
            }
        }));
        arrayList.add(vwb.Y("展示认证成功后发送弹窗：", new d30() { // from class: l.iqc
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().postDelayed(new Runnable() { // from class: l.w8d
                    @Override // java.lang.Runnable
                    public final void run() {
                        psq.V(bVar2.K1());
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.Y("插入新用户优化引导", new d30() { // from class: l.jqc
            public final void call() {
                DebugUtil.m3824M();
            }
        }));
        arrayList.add(vwb.Y("照镜子忽略年龄：false", new d30() { // from class: l.kqc
            public final void call() {
                DebugUtil.m4522s8();
            }
        }));
        arrayList.add(vwb.Y("清空新手引导数据", new d30() { // from class: l.nqc
            public final void call() {
                DebugUtil.m4421nh();
            }
        }));
        arrayList.add(vwb.Y("清除Save标记", new d30() { // from class: l.pqc
            public final void call() {
                DebugUtil.m4297i2();
            }
        }));
        arrayList.add(vwb.Y("清除理想型Save标记", new d30() { // from class: l.qqc
            public final void call() {
                CoreModule.c.K1.T.put(Boolean.FALSE);
            }
        }));
        arrayList.add(vwb.Y("理想型设置滑动过N：" + CoreModule.c.r2.b0.get(), new d30() { // from class: l.rqc
            public final void call() {
                DebugUtil.m4291hi();
            }
        }));
        arrayList.add(vwb.Y("插入点赞入口", new d30() { // from class: l.sqc
            public final void call() {
                CoreModule.c.K1.m3();
            }
        }));
        arrayList.add(vwb.Y("每次都展示气泡" + CoreModule.c.K1.V.get(), new d30() { // from class: l.tqc
            public final void call() {
                DebugUtil.m3668Eh();
            }
        }));
        arrayList.add(vwb.Y("额迈瑞卡：" + CoreModule.c.m0.t1.get() + " - " + qib0.f0, new d30() { // from class: l.uqc
            public final void call() {
                DebugUtil.m4597vh();
            }
        }));
        StringBuilder sb = new StringBuilder("fake用户mock：");
        sb.append(CoreModule.c.e0.E4.get());
        arrayList.add(vwb.Y(sb.toString(), new d30() { // from class: l.vqc
            public final void call() {
                DebugUtil.m3606C();
            }
        }));
        arrayList.add(vwb.Y("fake用户买成弹窗：", new d30() { // from class: l.wqc
            public final void call() {
                myf.U(bVar.K1());
            }
        }));
        arrayList.add(vwb.Y("跳转memo：", new d30() { // from class: l.yqc
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().startActivity(MemojiBuzzAct.Companion.a(bVar2.K1(), "memoji_call"));
            }
        }));
        arrayList.add(vwb.Y("划卡日志：" + BifrostLayout.d, new d30() { // from class: l.zqc
            public final void call() {
                BifrostLayout.d = !BifrostLayout.d;
            }
        }));
        arrayList.add(vwb.Y("清理引导标记：", new d30() { // from class: l.brc
            public final void call() {
                nah0.c().a();
            }
        }));
        arrayList.add(vwb.Y("新页面：", new d30() { // from class: l.crc
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().postDelayed(new Runnable() { // from class: l.d5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m4435o9(bVar2);
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.Y("设置打招呼卡：", new d30() { // from class: l.drc
            public final void call() {
                bVar.K1().postDelayed(new Runnable() { // from class: l.l8d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m4675z7();
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.Y("网络信息：", new d30() { // from class: l.erc
            public final void call() {
                DebugUtil.m4568ua();
            }
        }));
        arrayList.add(vwb.Y("输入首张User信息：", new d30() { // from class: l.frc
            public final void call() {
                DebugUtil.m4193d8();
            }
        }));
        arrayList.add(vwb.Y("划卡提示View：" + CoreModule.c.m0.u1.get(), new d30() { // from class: l.grc
            public final void call() {
                DebugUtil.m4230f1();
            }
        }));
        arrayList.add(vwb.Y("情况引导滑动：", new d30() { // from class: l.hrc
            public final void call() {
                mah0.m8073s0().m8118l1();
            }
        }));
        arrayList.add(vwb.Y("延迟刷新：", new d30() { // from class: l.jrc
            public final void call() {
                bVar.K1().postDelayed(new Runnable() { // from class: l.m7d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m3633D4();
                    }
                }, 1000L);
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: K4 */
    public static /* synthetic */ void m3787K4() {
        GreetingSummary greetingSummaryNew_ = GreetingSummary.new_();
        greetingSummaryNew_.unseen = 0;
        greetingSummaryNew_.latestTime = mqi0.o();
        greetingSummaryNew_.latestUserId = "";
        greetingSummaryNew_.latestMessageId = "";
        CoreModule.c.r0.d0.onNext(greetingSummaryNew_);
    }

    /* JADX INFO: renamed from: K9 */
    public static /* synthetic */ void m3792K9(User user) {
        Studies studies = user.profile.studies;
        studies.active = true;
        studies.verified = true;
        double dGuessedCurrentServerTime = qib0.H.guessedCurrentServerTime() + 3600000;
        user.membership.expiresTime = dGuessedCurrentServerTime;
        List list = user.memberships;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Membership) it.next()).expiresTime = dGuessedCurrentServerTime;
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
    public static /* synthetic */ void m3793Ka(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("清除限频次数", new d30() { // from class: l.tmc
            public final void call() {
                DebugUtil.m4309ie();
            }
        }));
        arrayList.add(vwb.Y("当前限频次数", new d30() { // from class: l.zmc
            public final void call() {
                lsi0.j(CoreModule.c.H1.f0.get() + "");
            }
        }));
        arrayList.add(vwb.Y("放开各种频次限制" + CoreModule.c.H1.g0.get(), new d30() { // from class: l.anc
            public final void call() {
                DebugUtil.m4634xa();
            }
        }));
        arrayList.add(vwb.Y("关闭SvipDebug：" + com.p1.mobile.putong.core.ui.onlinematch.a.b0(), new d30() { // from class: l.cnc
            public final void call() {
                snm.f7404j = false;
            }
        }));
        arrayList.add(vwb.Y("清除30分钟间隔：", new d30() { // from class: l.dnc
            public final void call() {
                CoreModule.c.H1.a4();
            }
        }));
        arrayList.add(vwb.Y("忽略本地超时：", new d30() { // from class: l.enc
            public final void call() {
                DebugUtil.m3856Na();
            }
        }));
        arrayList.add(vwb.Y("Svip弹窗：", new d30() { // from class: l.fnc
            public final void call() {
                DebugUtil.m4632x8();
            }
        }));
        arrayList.add(vwb.Y("探探币购买：", new d30() { // from class: l.gnc
            public final void call() {
                DebugUtil.m4363l3();
            }
        }));
        arrayList.add(vwb.Y("探探币使用弹框：", new d30() { // from class: l.hnc
            public final void call() {
                DebugUtil.m3753Ie();
            }
        }));
        arrayList.add(vwb.Y("打开关闭心动：", new d30() { // from class: l.inc
            public final void call() {
                DebugUtil.m3743I4();
            }
        }));
        arrayList.add(vwb.Y("特权提示弹窗", new d30() { // from class: l.umc
            public final void call() {
                snm.m9409f0(bVar.K1(), TabName.Card, null);
            }
        }));
        arrayList.add(vwb.Y("恢复特权消耗提示", new d30() { // from class: l.vmc
            public final void call() {
                CoreModule.c.H1.X.put(Boolean.FALSE);
            }
        }));
        arrayList.add(vwb.Y("关闭debug搜索" + CoreModule.c.H1.Y, new d30() { // from class: l.wmc
            public final void call() {
                CoreModule.c.H1.Y = false;
            }
        }));
        arrayList.add(vwb.Y("打开debug搜索" + CoreModule.c.H1.Y, new d30() { // from class: l.xmc
            public final void call() {
                DebugUtil.m4578uk(bVar.K1());
            }
        }));
        arrayList.add(vwb.Y("心动阈值二期时间限制清除", new d30() { // from class: l.ymc
            public final void call() {
                CoreModule.c.H1.d0.put(0L);
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Kc */
    public static /* synthetic */ void m3795Kc() {
        CoreModule.c.j0.q0 = true;
        e51.y(new RunnableC3227t0());
    }

    /* JADX INFO: renamed from: Kf */
    public static /* synthetic */ void m3798Kf(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: Kh */
    public static /* synthetic */ void m3800Kh(b bVar) {
        User userClone = CoreModule.c.e0.p9().clone();
        ProfileCompletion profileCompletion = userClone.profile.extensions.profileCompletion;
        List list = Collections.EMPTY_LIST;
        profileCompletion.progress = vwb.c(list, "未完成");
        userClone.profile.extensions.profileCompletion.briefIntroduction = vwb.c(list, "我是一个up主");
        User userSubtract = userClone.subtract(CoreModule.c.e0.p9());
        if (NullChecker.a(userSubtract)) {
            bVar.K1().duringCreated(CoreModule.c.e0.u9(userSubtract)).subscribe(mkd0.H(new e30() { // from class: l.iwc
                public final void call(Object obj) {
                    lsi0.y(CoreModule.c.e0.p9().profile.extensions.profileCompletion.toJson());
                }
            }, new e30() { // from class: l.jwc
                public final void call(Object obj) {
                    lsi0.y(((Throwable) obj).getMessage());
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Ki */
    public static void m3801Ki(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("已经认证首页tab", new C3204m0(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: Kj */
    public static void m3802Kj(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("好友上线提醒", new C3236w0(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m3803L() {
        hpd0 hpd0Var = CoreModule.c.m0.J1;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m3804L0(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        e eVar = CoreModule.c.g0;
        arrayList.add(vwb.Y(((Boolean) e.D0.get()).booleanValue() ? "关闭建群认证校验" : "打开群认证校验", new d30() { // from class: l.mvc
            public final void call() {
                DebugUtil.m4642xi();
            }
        }));
        arrayList.add(vwb.Y("随机创建一个群", new d30() { // from class: l.nvc
            public final void call() {
                CoreModule.c.g0.t6();
            }
        }));
        arrayList.add(vwb.Y("清除气泡", new d30() { // from class: l.ovc
            public final void call() {
                DebugUtil.m3613C6();
            }
        }));
        arrayList.add(vwb.Y("最新的群消息，随机插入一些@逻辑", new d30() { // from class: l.qvc
            public final void call() {
                CoreModule.c.g0.u6(true, false);
            }
        }));
        arrayList.add(vwb.Y("最新的群消息，随机插入一些@逻辑 有自己", new d30() { // from class: l.rvc
            public final void call() {
                CoreModule.c.g0.u6(false, true);
            }
        }));
        arrayList.add(vwb.Y("最新的群消息，随机插入一个没有头像的", new d30() { // from class: l.svc
            public final void call() {
                CoreModule.c.g0.v6();
            }
        }));
        e eVar2 = CoreModule.c.g0;
        arrayList.add(vwb.Y(((Boolean) e.C0.get()).booleanValue() ? "关闭V3" : "开启V3", new d30() { // from class: l.tvc
            public final void call() {
                DebugUtil.m3979T7();
            }
        }));
        arrayList.add(vwb.Y("跳转到固定的群", new d30() { // from class: l.uvc
            public final void call() {
                j2e0.m(bVar.K1(), Uri.parse("tantanapp://group/chat?groupId=4233"));
            }
        }));
        arrayList.add(vwb.Y("添加固定群组", new d30() { // from class: l.vvc
            public final void call() {
                b bVar2 = bVar;
                e51.H(bVar2.K1(), new Runnable() { // from class: l.p6d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m3973T1(bVar2);
                    }
                }, 300L);
            }
        }));
        arrayList.add(vwb.Y("打开别的dlg", new d30() { // from class: l.wvc
            public final void call() {
                DebugUtil.m4361l1(bVar);
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: L1 */
    public static /* synthetic */ void m3805L1(int[] iArr, int i, CoreSuggested.UserInfo userInfo) {
        if (iArr[0] >= i) {
            return;
        }
        UserWithRelationShip userWithRelationShipNew_ = UserWithRelationShip.new_();
        userWithRelationShipNew_.userId = userInfo.id;
        Relationship relationshipNew_ = Relationship.new_();
        relationshipNew_.status.add(MatchFrom.get(SummarizedPrivilegesId.pinLike));
        relationshipNew_.updateTime = mqi0.o() - TimeUnit.HOURS.toMillis(iArr[0]);
        userWithRelationShipNew_.relationship = relationshipNew_;
        CoreModule.c.e2.U.add(userWithRelationShipNew_);
        userInfo.isPinLike = true;
        userInfo.topLikeRelationship = relationshipNew_;
        iArr[0] = iArr[0] + 1;
    }

    /* JADX INFO: renamed from: L4 */
    public static /* synthetic */ void m3808L4() {
        CoreModule.c.b1.V.put("");
        CoreModule.c.b1.W = null;
    }

    /* JADX INFO: renamed from: L5 */
    public static /* synthetic */ void m3809L5(b bVar, View view) {
        OnlineMatchPushUser onlineMatchPushUser = new OnlineMatchPushUser();
        onlineMatchPushUser.name = "重生的小胖子";
        onlineMatchPushUser.userId = "349281368";
        CoreModule.c.e0.p9().fp().profileMiddle().formatted();
        onlineMatchPushUser.avatarUrl = "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2MlRQNldBSVFaM1ZRRFRPU01FSFdIS043Nk5RUTA0IiwidyI6MTk2MCwiaCI6MTk1OSwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjYxNzE0NDg5Nzk1MzUzMzg2ODAsImFiIjowfQ.jpg?format=128x128";
        onlineMatchPushUser.action = "";
        onlineMatchPushUser.gender = "female";
        onlineMatchPushUser.age = "10";
        onlineMatchPushUser.distance = 100;
        onlineMatchPushUser.userTagList = vwb.R(new String[]{"唱各萨达多个", "喜欢广场舞", "喜欢哈哈哈"}, new w9j() { // from class: l.kbd
            public final Object call(Object obj) {
                return DebugUtil.m3877Oa((String) obj);
            }
        });
        QuickChatCardWrapper quickChatCardWrapper = new QuickChatCardWrapper(onlineMatchPushUser);
        if (((PartialListOpt) CoreModule.c.m0.a0.e()).loaded.size() < 1) {
            return;
        }
        c cVar = CoreModule.c;
        onlineMatchPushUser.user = cVar.e0.Pa(((CoreSuggested.UserInfo) ((PartialListOpt) cVar.m0.a0.e()).loaded.get(1)).id);
        xzc0.x0().B0(bVar.K1(), quickChatCardWrapper);
    }

    /* JADX INFO: renamed from: L7 */
    public static /* synthetic */ void m3811L7(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("VIP", new d30() { // from class: l.u3d
            public final void call() {
                new w6p.a(bVar.K1()).i(vwb.f0(new PurchaseType[]{PurchaseType.TYPE_GET_VIP}), vwb.f0(new Privilege[]{Privilege.vip_super_like})).d("debug").k();
            }
        }));
        arrayList.add(vwb.Y("SVIP", new d30() { // from class: l.v3d
            public final void call() {
                new w6p.a(bVar.K1()).i(vwb.f0(new PurchaseType[]{PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE}), vwb.f0(new Privilege[]{Privilege.see_who_likes_me})).d("debug").k();
            }
        }));
        arrayList.add(vwb.Y("SVIP Premium折扣全屏", new d30() { // from class: l.w3d
            public final void call() {
                new zvo.a(bVar.K1()).i(vwb.f0(new Privilege[]{Privilege.see_who_likes_me})).d("debug").j();
            }
        }));
        arrayList.add(vwb.Y("VIP+SVIP-默认vip", new d30() { // from class: l.x3d
            public final void call() {
                DebugUtil.m4532si(bVar);
            }
        }));
        arrayList.add(vwb.Y("VIP+SVIP-默认svip", new d30() { // from class: l.y3d
            public final void call() {
                new w6p.a(bVar.K1()).i(vwb.f0(new PurchaseType[]{PurchaseType.TYPE_GET_VIP, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE}), vwb.f0(new Privilege[]{Privilege.vip_location, Privilege.svip_badge})).d("debug").j(1).k();
            }
        }));
        arrayList.add(vwb.Y("See", new d30() { // from class: l.z3d
            public final void call() {
                new w6p.a(bVar.K1()).i(vwb.f0(new PurchaseType[]{PurchaseType.TYPE_GET_LIKERS}), vwb.f0(new Privilege[]{Privilege.see_who_likes_me})).d("debug").k();
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: La */
    public static /* synthetic */ void m3814La() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.MinBoostCard;
        userInfo.id = "VirtualCard";
        Active active = new Active();
        active.f3id = "boostactivecardid100";
        active.cardBackgroundUrl = "https://auto.tancdn.com/v1/raw/05959a2c-2543-4d35-aa98-83c0956d023e10.png";
        active.cardTitle = "Turbo Trial";
        active.cardBtnTitle = "Turbo Me";
        active.cardDesc = "Taste how boost bring matches to you with only 42 coins";
        active.cardLogo = "https://auto.tancdn.com/v1/raw/4524bd6c-e859-4a3a-a65f-4d7c6ce74e3711.png";
        userInfo.active = active;
        CoreModule.c.m0.w6(userInfo, 3);
    }

    /* JADX INFO: renamed from: Lc */
    public static /* synthetic */ void m3816Lc(b bVar) {
        CoreModule.l.d().mo714q4();
        ura.e().a().q4();
        bVar.K1().startActivity(CoreModule.l.d().mo713Wo(bVar.C0()));
    }

    /* JADX INFO: renamed from: Lf */
    public static /* synthetic */ void m3819Lf() {
        rxg0.j().x();
        rxg0.j().d.put(Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: Li */
    public static void m3822Li(final Act act) {
        act.postDelayed(new Runnable() { // from class: l.q6d
            @Override // java.lang.Runnable
            public final void run() {
                DebugUtil.m4391m9(act);
            }
        }, 800L);
    }

    /* JADX INFO: renamed from: Lj */
    public static User m3823Lj(b bVar) {
        return (bVar.A2().o() == null || bVar.A2().o().d() == null) ? CoreModule.c.e0.p9() : bVar.A2().o().d();
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m3824M() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.id = "VirtualCard";
        userInfo.virtualCardType = VirtualCardType.ExpandedNewUserRightGuide;
        CoreModule.c.m0.t6(userInfo, 0, true);
    }

    /* JADX INFO: renamed from: M1 */
    public static /* synthetic */ void m3826M1() {
        hpd0 hpd0Var = CoreModule.c.e0.B4;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: M5 */
    public static /* synthetic */ void m3830M5() {
    }

    /* JADX INFO: renamed from: Ma */
    public static /* synthetic */ void m3835Ma() {
    }

    /* JADX INFO: renamed from: Mb */
    public static /* synthetic */ void m3836Mb(VEditText vEditText) {
        String strTrim = vEditText.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        lra0.k.put(Double.valueOf(Math.min(Math.max(Double.parseDouble(strTrim), 0.6d), 0.8d)));
    }

    /* JADX INFO: renamed from: Me */
    public static /* synthetic */ void m3839Me() {
        hpd0 hpd0Var = lra0.n;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: Mg */
    public static /* synthetic */ void m3841Mg(b bVar, Dialog dialog, View view, int i, CharSequence charSequence) {
        switch (i) {
            case 0:
                hpd0 hpd0Var = lra0.h;
                hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
                break;
            case 1:
                hpd0 hpd0Var2 = lra0.g;
                hpd0Var2.put(Boolean.valueOf(!((Boolean) hpd0Var2.get()).booleanValue()));
                break;
            case QuickChatCardWrapper.QuickChatCardType.PASSIVE /* 2 */:
                final VEditText vEditText = new VEditText(bVar.C0());
                vEditText.setLayoutParams(new FrameLayout.LayoutParams(-1, t100.A));
                vEditText.setInputType(8192);
                vEditText.setText(String.valueOf(lra0.k.get()));
                vEditText.setSelection(vEditText.getText().length());
                bVar.K1().dialog().P(vEditText, false).t0(R.string.u, new Runnable() { // from class: l.j1d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m3836Mb(vEditText);
                    }
                }).z().show();
                break;
            case QuickChatCardWrapper.QuickChatCardType.PEI_LIAO /* 3 */:
                lra0.j.put(640);
                break;
            case 4:
                lra0.j.put(720);
                break;
            case CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE /* 5 */:
                lra0.j.put(1080);
                break;
            case 6:
                lra0.j.put(1440);
                break;
            case 7:
                hpd0 hpd0Var3 = lra0.i;
                hpd0Var3.put(Boolean.valueOf(!((Boolean) hpd0Var3.get()).booleanValue()));
                break;
            case 8:
                StringBuilder sb = new StringBuilder("Model: ");
                sb.append(oyd.g());
                sb.append("\nBrand: ");
                sb.append(oyd.b());
                sb.append("\nHardWare: ");
                sb.append(oyd.f());
                sb.append("\nRAM容量: ");
                sb.append(oyd.i(bVar.K1()));
                sb.append("\nCPU核数: ");
                sb.append(oyd.h());
                sb.append("\nCPU最大主频: ");
                sb.append(oyd.c());
                sb.append("\n屏幕分辨率: ");
                DisplayMetrics displayMetrics = bVar.K1().getResources().getDisplayMetrics();
                sb.append(displayMetrics.widthPixels + "x" + displayMetrics.heightPixels);
                sb.append("\n\n");
                int iK = oyd.k(bVar.K1());
                if (iK == 2) {
                    sb.append("当前机型为高端机型");
                } else if (iK == 1) {
                    sb.append("当前机型为中端机型");
                } else if (iK == 0) {
                    sb.append("当前机型为低端机型");
                }
                VText vText = new VText(bVar.K1());
                vText.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                vText.setText(sb.toString());
                bVar.K1().dialog().P(vText, false).z().show();
                break;
        }
    }

    /* JADX INFO: renamed from: Mi */
    public static void m3843Mi(final ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("酒吧爱人", new d30() { // from class: l.zoc
            public final void call() {
                DebugUtil.m4369l9(arrayList, bVar);
            }
        }));
    }

    /* JADX INFO: renamed from: Mj */
    public static void m3844Mj(final b bVar, final boolean z) {
        i0e.d(bVar.K1()).D(10).r("输入Userid").F(new e30() { // from class: l.n8d
            public final void call(Object obj) {
                DebugUtil.m4554ti(z, bVar, (String) obj);
            }
        }).n().show();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m3845N(Throwable th) {
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m3846N0() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.AdCard;
        userInfo.id = "VirtualCard";
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        List listH = ic50.j().h();
        if (vwb.J(listH)) {
            return;
        }
        userInfo.extensionObject = listH.get(0);
        CoreModule.c.m0.w6(userInfo, 1);
        CoreModule.c.m0.S1.put(userInfo, 1);
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m3849N3() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.DailySelectionAdCard;
        userInfo.id = "VirtualCard";
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.c.m0.w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ Tag m3850N4(String str) {
        return new Tag((String) null, str);
    }

    /* JADX INFO: renamed from: N6 */
    public static /* synthetic */ void m3852N6() {
        PartialListOpt partialListOpt = (PartialListOpt) CoreModule.c.m0.a0.e();
        if (partialListOpt == null || vwb.J(partialListOpt.loaded)) {
            return;
        }
        Iterator it = partialListOpt.loaded.iterator();
        while (it.hasNext()) {
            User userPa = CoreModule.c.e0.Pa(((CoreSuggested.UserInfo) it.next()).id);
            UserLiveState userLiveStateLt = CoreModule.Q().lt(((DbObject) userPa).id);
            if (userLiveStateLt == null) {
                userPa.liveState = UserLiveState.new_();
            } else {
                userPa.liveState = userLiveStateLt;
            }
            UserLiveState userLiveState = userPa.liveState;
            userLiveState.liveId = ((DbObject) userPa).id;
            userLiveState.callInfo.ongoingCall = true;
            userLiveState.state = LiveState.get("onlive");
            userPa.liveState.liveLabel = UserLiveLabel.new_();
            UserLiveLabel userLiveLabel = userPa.liveState.liveLabel;
            userLiveLabel.mainTitle = "直播中";
            userLiveLabel.subTitle = "多人连线已开启";
            CoreModule.Q().putLiveState(Collections.singletonList(userPa));
        }
        CoreModule.c.m0.a0.onNext(partialListOpt);
    }

    /* JADX INFO: renamed from: N8 */
    public static /* synthetic */ void m3854N8(ArrayList arrayList, b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("审核中是否可编辑实验）：" + CoreModule.c.e0.P2.get(), new d30() { // from class: l.fvc
            public final void call() {
                DebugUtil.m3699G4();
            }
        }));
        arrayList.add(vwb.Y("单项功能限制（profile资料编辑）：" + CoreModule.c.e0.N2.get(), new d30() { // from class: l.gvc
            public final void call() {
                DebugUtil.m4328jc();
            }
        }));
        arrayList.add(vwb.Y("单项功能限制（swipe划卡）：" + CoreModule.c.e0.O2.get(), new d30() { // from class: l.hvc
            public final void call() {
                DebugUtil.m4372lc();
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: N9 */
    public static /* synthetic */ void m3855N9() {
        hpd0 hpd0Var = com.p1.mobile.putong.core.newui.messages.a.f;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        CoreModule.c.f0.V0.put("https://m.tantanapp.com/static-pages/commerce/newuserguide.html?category=0");
        c cVar = CoreModule.c;
        cVar.f0.T0.put(upa.c0(cVar.e0.p9()));
        c cVar2 = CoreModule.c;
        cVar2.f0.S0.put(upa.Z(cVar2.e0.p9()));
    }

    /* JADX INFO: renamed from: Na */
    public static /* synthetic */ void m3856Na() {
        snm.f7405k = true;
        snm.f7404j = true;
    }

    /* JADX INFO: renamed from: Ne */
    public static /* synthetic */ void m3860Ne(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("划卡优化，清理蒙层", new d30() { // from class: l.buc
            public final void call() {
                DebugUtil.m4596vg();
            }
        }));
        arrayList.add(vwb.Y("展示设置蒙层", new d30() { // from class: l.cuc
            public final void call() {
                e51.H(bVar.K1(), new Runnable() { // from class: l.l2d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m3696G1();
                    }
                }, 1500L);
            }
        }));
        arrayList.add(vwb.Y("显示superlike动画", new d30() { // from class: l.duc
            public final void call() {
                b bVar2 = bVar;
                e51.H(bVar2.K1(), new Runnable() { // from class: l.dzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        b bVar3 = bVar2;
                        rxg0.M(bVar3.q2(), bVar3.z2(), bVar3.C2().getRealView(), 1300);
                    }
                }, 1500L);
            }
        }));
        arrayList.add(vwb.Y("清除所有标记", new d30() { // from class: l.euc
            public final void call() {
                DebugUtil.m3577Ae();
            }
        }));
        arrayList.add(vwb.Y("所有都有letter", new d30() { // from class: l.fuc
            public final void call() {
                DebugUtil.m4471q1();
            }
        }));
        arrayList.add(vwb.Y("所有都有新喜欢", new d30() { // from class: l.guc
            public final void call() {
                DebugUtil.m4005Uc();
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Nf */
    public static /* synthetic */ void m3861Nf(String str, roj0 roj0Var) {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.id = str;
        userInfo.meetAgain = true;
        if (CoreModule.c.f0.xh(str)) {
            CoreModule.c.m0.w6(userInfo, 0);
        } else {
            lsi0.y("非配对好友");
        }
    }

    /* JADX INFO: renamed from: Ng */
    public static /* synthetic */ void m3862Ng() {
        hpd0 hpd0Var = lra0.U;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: Nh */
    public static /* synthetic */ void m3863Nh() {
        CoreModule.c.e0.s6.put("");
        CoreModule.c.e0.m7.put(0);
        CoreModule.c.e0.n7.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: Ni */
    public static void m3864Ni(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("boost队列重构 清空数据", new d30() { // from class: l.kuc
            public final void call() {
                DebugUtil.m3960S9();
            }
        }));
    }

    /* JADX INFO: renamed from: Nj */
    public static void m3865Nj(final ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("破冰和联想表情优化", new d30() { // from class: l.okc
            public final void call() {
                DebugUtil.m4633x9(arrayList, bVar);
            }
        }));
    }

    /* JADX INFO: renamed from: O1 */
    public static /* synthetic */ void m3868O1() {
        hpd0 hpd0Var = CoreModule.c.f0.X0;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m3870O3(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("VIP落地页", new d30() { // from class: l.tzc
            public final void call() {
                DebugUtil.m4177ce(bVar);
            }
        }));
        arrayList.add(vwb.Y("SVIP落地页", new d30() { // from class: l.uzc
            public final void call() {
                DebugUtil.m3700G5(bVar);
            }
        }));
        arrayList.add(vwb.Y("黑金会员落地页", new d30() { // from class: l.vzc
            public final void call() {
                DebugUtil.m3917Q8(bVar);
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: O4 */
    public static /* synthetic */ void m3871O4(b bVar) {
        User userClone = CoreModule.c.e0.p9().clone();
        userClone.profile.extensions.profileCompletion.briefIntroduction = vwb.c(Collections.EMPTY_LIST, "我是一个up主");
        User userSubtract = userClone.subtract(CoreModule.c.e0.p9());
        if (NullChecker.a(userSubtract)) {
            bVar.K1().duringCreated(CoreModule.c.e0.u9(userSubtract)).subscribe(mkd0.H(new e30() { // from class: l.tsc
                public final void call(Object obj) {
                    lsi0.y(CoreModule.c.e0.p9().profile.extensions.profileCompletion.toJson());
                }
            }, new e30() { // from class: l.usc
                public final void call(Object obj) {
                    lsi0.y(((Throwable) obj).getMessage());
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Oa */
    public static /* synthetic */ Tag m3877Oa(String str) {
        return new Tag((String) null, str);
    }

    /* JADX INFO: renamed from: Oc */
    public static /* synthetic */ void m3879Oc(ArrayList arrayList, b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("还原速度", new d30() { // from class: l.utc
            public final void call() {
                l9j.b(1);
            }
        }));
        arrayList.add(vwb.Y("x2速度", new d30() { // from class: l.vtc
            public final void call() {
                l9j.b(2);
            }
        }));
        arrayList.add(vwb.Y("x5速度", new d30() { // from class: l.xtc
            public final void call() {
                l9j.b(5);
            }
        }));
        arrayList.add(vwb.Y("x10速度", new d30() { // from class: l.ytc
            public final void call() {
                l9j.b(10);
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Od */
    public static /* synthetic */ void m3880Od(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: Og */
    public static /* synthetic */ void m3883Og() {
        String str;
        for (String str2 : m4116Zi()) {
            CoreModule.k.m.delete(str2);
            CoreModule.k.c.J(str2);
        }
        for (String str3 : m4138aj()) {
            User userQuery = qib0.k0.d.query(str3);
            if (userQuery != null && (str = userQuery.name) != null && str.startsWith("MockUser")) {
                qib0.k0.d.delete(str3);
            }
        }
    }

    /* JADX INFO: renamed from: Oi */
    public static void m3885Oi(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("boost重构", new C3201l1(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: Oj */
    public static void m3886Oj(final ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("网络请求真人认证", new d30() { // from class: l.csc
            public final void call() {
                DebugUtil.m4392ma(arrayList, bVar);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m3887P() {
        qsd0 qsd0Var = qsd0.INSTANCE;
        qsd0Var.b();
        qsd0Var.c();
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m3888P0() {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.ai_picture_query_auth);
        CoreModule.c.f0.o2.clear();
        CoreModule.c.f0.o2.add(messageNew_);
    }

    /* JADX INFO: renamed from: P1 */
    public static /* synthetic */ void m3889P1() {
        CoreModule.c.e0.S4.put(0L);
        CoreModule.c.e0.P4.put(0L);
        CoreModule.c.e0.Q4.put(0L);
        CoreModule.c.e0.R4.put(0);
        CoreModule.c.e0.T4.put(0);
    }

    /* JADX INFO: renamed from: P4 */
    public static /* synthetic */ void m3892P4() {
        hpd0 hpd0Var = x.S;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: P5 */
    public static /* synthetic */ void m3893P5(User user) {
        double dO = (mqi0.o() / 1000.0d) + 86400.0d;
        int i = 0;
        while (true) {
            String[][] strArr = f2202j;
            if (i >= strArr.length) {
                return;
            }
            String[] strArr2 = strArr[i];
            int i2 = Integer.parseInt(strArr2[2]);
            String strM4205dk = m4205dk(i2);
            m4182cj(strM4205dk, strArr2[1], ((double) (strArr.length - i)) + dO, strM4205dk);
            m3714Gj(user, strM4205dk, i2);
            i++;
        }
    }

    /* JADX INFO: renamed from: P6 */
    public static /* synthetic */ void m3894P6() {
        hpd0 hpd0Var = lra0.R;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: P7 */
    public static /* synthetic */ void m3895P7() {
        hpd0 hpd0Var = lra0.W;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: Pa */
    public static /* synthetic */ void m3898Pa() {
        hpd0 hpd0Var = lra0.g0;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: Pd */
    public static /* synthetic */ void m3901Pd(b bVar) {
        String str = "first_left_slide_" + CoreModule.H().userId();
        Boolean bool = Boolean.FALSE;
        new hpd0(str, bool).put(bool);
        new aa40(bVar.K1()).show();
    }

    /* JADX INFO: renamed from: Pg */
    public static /* synthetic */ void m3904Pg(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("测试广告框架", new d30() { // from class: l.m9d
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().startActivity(new Intent((Context) bVar2.K1(), (Class<?>) DebugSplashTTAdAct.class));
            }
        }));
        arrayList.add(vwb.Y("开屏广告", new d30() { // from class: l.n9d
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().startActivity(new Intent((Context) bVar2.K1(), (Class<?>) DebugSplashAdAct.class));
            }
        }));
        arrayList.add(vwb.Y("SDK助手", new d30() { // from class: l.o9d
            public final void call() {
                mbj.a(bVar.K1());
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Ph */
    public static /* synthetic */ void m3905Ph() {
        Message messageNew_ = Message.new_();
        messageNew_.value = "你好，我叫小宇，现在在北京工作，老家是湖南长沙，我性格外向";
        messageNew_.messageType = MessageType.get(MessageType.marriage_prologue);
        CoreModule.c.f0.o2.clear();
        CoreModule.c.f0.o2.add(messageNew_);
    }

    /* JADX INFO: renamed from: Pi */
    public static void m3906Pi(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("推荐卡片4变3张", new C3242y0(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: Pj */
    public static void m3907Pj(final ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("弹窗管控", new d30() { // from class: l.coc
            public final void call() {
                DebugUtil.m4236f7(arrayList, bVar);
            }
        }));
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m3909Q0(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(0, vwb.Y("身份证认证", new d30() { // from class: l.doc
            public final void call() {
                b bVar2 = bVar;
                bVar2.q2().startActivity(NationalIdAuthAct.V1(bVar2.q2().getContext(), "mainDebug"));
            }
        }));
        arrayList.add(1, vwb.Y("身份证认证成功dlg", new d30() { // from class: l.eoc
            public final void call() {
                p420.x(bVar.K1(), (d30) null);
            }
        }));
        arrayList.add(1, vwb.Y("身份证认证状态查询", new d30() { // from class: l.foc
            public final void call() {
                lsi0.j("认证状态为:".concat(CoreModule.c.e0.p9().isIdCardVerified() ? "已认证" : "未认证"));
            }
        }));
        arrayList.add(1, vwb.Y("实时查询认证状态", new d30() { // from class: l.goc
            public final void call() {
                bVar.K1().duringCreated(CoreModule.c.B0.p4(CoreModule.H().userId())).subscribe(mkd0.H(new e30() { // from class: l.m6d
                    public final void call(Object obj) {
                        DebugUtil.m4104Z6((roj0) obj);
                    }
                }, new e30() { // from class: l.n6d
                    public final void call(Object obj) {
                        DebugUtil.m4207e0((Throwable) obj);
                    }
                }));
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Q1 */
    public static /* synthetic */ void m3910Q1() {
        CoreModule.c.e0.i3.put(0L);
        CoreModule.c.e0.h3.put(0);
    }

    /* JADX INFO: renamed from: Q7 */
    public static /* synthetic */ void m3916Q7() {
        hpd0 hpd0Var = CoreModule.c.z2.f0;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: Q8 */
    public static /* synthetic */ void m3917Q8(b bVar) {
        Intent intentB2 = VipAct.b2(bVar.K1(), ahl0.p0(PurchaseType.TYPE_O_DIAMOND));
        Intent intentA = lva.A(bVar.K1(), (String) null, "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/pricey-member/index.html?speed=true&_bid=1003173&hideNavigationBar=1&hideNotch=1&webviewColor=181614&expiresTime=1699341086000&duration=2592000", true, true, true);
        intentA.putExtra("hideNotch", true);
        bVar.K1().startActivities(new Intent[]{intentB2, intentA});
    }

    /* JADX INFO: renamed from: Q9 */
    public static /* synthetic */ void m3918Q9(ArrayList arrayList, b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("清除'我'的tab，谁看过我入口假红点时间戳", new d30() { // from class: l.j7d
            public final void call() {
                DebugUtil.m3641Dc();
            }
        }));
        arrayList.add(vwb.Y("清除'谁看过我'第二个tab访问时间戳", new d30() { // from class: l.k7d
            public final void call() {
                DebugUtil.m3624Ch();
            }
        }));
        arrayList.add(vwb.Y("清除'恢复足迹'标记", new d30() { // from class: l.l7d
            public final void call() {
                DebugUtil.m4147b6();
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Qa */
    public static /* synthetic */ void m3919Qa(b bVar) {
        PurchaseType purchaseType = PurchaseType.TYPE_O_PLATINUM;
        new com.p1.mobile.putong.core.ui.purchase.mediator.c.a(bVar.K1(), purchaseType, (String) null).g(fy80.k(purchaseType.getPrivilegeData(null), (Privilege) null)).h();
    }

    /* JADX INFO: renamed from: Qd */
    public static /* synthetic */ void m3922Qd(ArrayList arrayList, b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y(wf6.e() ? "关闭优化" : "打开优化", new d30() { // from class: l.nsc
            public final void call() {
                wf6.i(!wf6.e());
            }
        }));
        arrayList.add(vwb.Y(wf6.f() ? "关闭同步Counter" : "打开同步Counter", new d30() { // from class: l.osc
            public final void call() {
                wf6.j(!wf6.f());
            }
        }));
        arrayList.add(vwb.Y("检查本地Counversation Counter数据上报", new d30() { // from class: l.qsc
            public final void call() {
                DebugUtil.m4565u7();
            }
        }));
        arrayList.add(vwb.Y("检查数据上报", new d30() { // from class: l.rsc
            public final void call() {
                CoreModule.c.f0.ze(true);
            }
        }));
        arrayList.add(vwb.Y("清除本地数据", new d30() { // from class: l.ssc
            public final void call() {
                CoreModule.c.e0.x1.put(0L);
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Qe */
    public static /* synthetic */ void m3923Qe(CoreSuggested.UserInfo userInfo) {
        User userPa = CoreModule.c.e0.Pa(userInfo.id);
        if (NullChecker.a(userPa) && NullChecker.a(userPa.settings) && !vwb.J(userPa.settings.settingGroups)) {
            SettingGroups settingGroups = (SettingGroups) userPa.settings.settingGroups.get(0);
            if (NullChecker.a(settingGroups)) {
                if (NullChecker.a(settingGroups.comDiamond)) {
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
    public static /* synthetic */ void m3926Qh(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("首页启动介绍弹窗", new d30() { // from class: l.ozc
            public final void call() {
                new hq80(bVar.K1(), "").show();
            }
        }));
        arrayList.add(vwb.Y("首页启动介绍弹窗清除本地记录", new d30() { // from class: l.pzc
            public final void call() {
                DebugUtil.m4411n7();
            }
        }));
        arrayList.add(vwb.Y("购买弹窗-私人定制特权", new d30() { // from class: l.qzc
            public final void call() {
                com.p1.mobile.putong.core.ui.purchase.c.r0(bVar.K1(), "debug");
            }
        }));
        arrayList.add(vwb.Y("购买弹窗-私人定制+黑金", new d30() { // from class: l.rzc
            public final void call() {
                com.p1.mobile.putong.core.ui.purchase.c.c0(bVar.K1(), "debug");
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Qi */
    public static void m3927Qi(final ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("认证优化Q4", new d30() { // from class: l.src
            public final void call() {
                DebugUtil.m4218eb(arrayList, bVar);
            }
        }));
    }

    /* JADX INFO: renamed from: Qj */
    public static void m3928Qj() {
        final User userP9 = CoreModule.c.e0.p9();
        e51.y(new Runnable() { // from class: l.l6d
            @Override // java.lang.Runnable
            public final void run() {
                DebugUtil.m4168c5(userP9);
            }
        });
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m3930R0() {
        hpd0 hpd0Var = lra0.b0;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        lra0.c0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: R3 */
    public static /* synthetic */ void m3933R3(MatchSuccessAnimTime matchSuccessAnimTime, String str) {
        try {
            matchSuccessAnimTime.female_exit_time = Integer.parseInt(str);
            CoreModule.c.e0.e3.put(matchSuccessAnimTime.toJson());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: R4 */
    public static /* synthetic */ void m3934R4() {
        hpd0 hpd0Var = a5x.b;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: R5 */
    public static /* synthetic */ void m3935R5(b bVar) {
        q3h0.C3407b c3407b = new q3h0.C3407b();
        c3407b.m8907a(2);
        c3407b.m8909c(bVar.K1());
    }

    /* JADX INFO: renamed from: R7 */
    public static /* synthetic */ void m3937R7() {
        hpd0 hpd0Var = lra0.f;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: R8 */
    public static /* synthetic */ void m3938R8() {
        hpd0 hpd0Var = lra0.V;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: R9 */
    public static /* synthetic */ void m3939R9() {
        hpd0 hpd0Var = CoreModule.c.e0.s2;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: Ra */
    public static /* synthetic */ void m3940Ra(Throwable th) {
    }

    /* JADX INFO: renamed from: Rc */
    public static /* synthetic */ void m3942Rc() {
        com.p1.mobile.putong.core.newui.fake.b.r().o();
        lsi0.y("已清除");
    }

    /* JADX INFO: renamed from: Re */
    public static /* synthetic */ void m3944Re() {
        TabUniteManager.m2267i().m2268h(TabUniteManager.BadgeIconType.BOOST);
        TabUniteManager.m2267i().m2268h(TabUniteManager.BadgeIconType.BOOST_ONCE);
    }

    /* JADX INFO: renamed from: Rf */
    public static /* synthetic */ void m3945Rf(ArrayList arrayList, b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("清除拍一拍", new d30() { // from class: l.dsc
            public final void call() {
                DebugUtil.m4509rh();
            }
        }));
        arrayList.add(vwb.Y("清除两次记录", new d30() { // from class: l.fsc
            public final void call() {
                DebugUtil.m3808L4();
            }
        }));
        arrayList.add(vwb.Y("清除拍一拍全部逻辑", new d30() { // from class: l.gsc
            public final void call() {
                DebugUtil.m4014V0();
            }
        }));
        arrayList.add(vwb.Y("检查文案", new d30() { // from class: l.hsc
            public final void call() {
                com.p1.mobile.putong.core.ui.messages.b.c = true;
            }
        }));
        arrayList.add(vwb.Y("不检查文案", new d30() { // from class: l.isc
            public final void call() {
                com.p1.mobile.putong.core.ui.messages.b.c = false;
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Rg */
    public static /* synthetic */ void m3946Rg(EditText editText, b bVar) {
        String strTrim = editText.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        Intent intentF = lva.f(bVar.K1());
        intentF.putExtra("extra_join_group_id", strTrim);
        bVar.K1().startActivity(intentF);
    }

    /* JADX INFO: renamed from: Rh */
    public static /* synthetic */ void m3947Rh() {
        ConversationsList.B2(true);
        ConversationsList.u1.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: Ri */
    public static void m3948Ri(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("真人认证优化", new C3197k1(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: Rj */
    public static void m3949Rj(final ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("国际化黑金单次购买", new d30() { // from class: l.zlc
            public final void call() {
                DebugUtil.m4082Y5(arrayList, bVar);
            }
        }));
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m3951S0() {
        Message messageNew_ = Message.new_();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("needOpen", true);
            MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
            messageNew_.additionalData = messageAdditionalDataNew_;
            messageAdditionalDataNew_.chatGiftInfo = ChatGiftInfo.new_();
            ChatGiftInfo chatGiftInfo = messageNew_.additionalData.chatGiftInfo;
            chatGiftInfo.f23id = "116";
            chatGiftInfo.extra = jSONObject.toString(1);
            messageNew_.messageType = MessageType.get(MessageType.chat_gift);
            CoreModule.c.f0.o2.clear();
            CoreModule.c.f0.o2.add(messageNew_);
        } catch (JSONException e) {
            CrashHelper.c(e);
            aag0.a(e);
        }
    }

    /* JADX INFO: renamed from: S1 */
    public static /* synthetic */ void m3952S1() {
    }

    /* JADX INFO: renamed from: S2 */
    public static /* synthetic */ void m3953S2(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("清除体验弹窗数据", new d30() { // from class: l.h5d
            public final void call() {
                DebugUtil.m3704G9();
            }
        }));
        arrayList.add(vwb.Y("划卡体验弹窗一", new d30() { // from class: l.i5d
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().duringCreated(CoreModule.c.u2.c3(QuestionnaireScene.get("swipe"), QuestionnaireStrategy.get("default"))).subscribe(mkd0.H(new e30() { // from class: l.c9c
                    public final void call(Object obj) {
                        DebugUtil.m4030Vg(bVar2, (Questionnaire) obj);
                    }
                }, new e30() { // from class: l.d9c
                    public final void call(Object obj) {
                        DebugUtil.m3940Ra((Throwable) obj);
                    }
                }));
            }
        }));
        arrayList.add(vwb.Y("划卡体验弹窗二", new d30() { // from class: l.j5d
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().duringCreated(CoreModule.c.u2.c3(QuestionnaireScene.get("swipe"), QuestionnaireStrategy.get(QuestionnaireStrategy.lowLikeRatio))).subscribe(mkd0.H(new e30() { // from class: l.s8c
                    public final void call(Object obj) {
                        DebugUtil.m3963Sc(bVar2, (Questionnaire) obj);
                    }
                }, new e30() { // from class: l.t8c
                    public final void call(Object obj) {
                        DebugUtil.m4516s2((Throwable) obj);
                    }
                }));
            }
        }));
        arrayList.add(vwb.Y("消息列表体验弹窗", new d30() { // from class: l.l5d
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().duringCreated(CoreModule.c.u2.c3(QuestionnaireScene.get("message"), (QuestionnaireStrategy) null)).subscribe(mkd0.H(new e30() { // from class: l.lad
                    public final void call(Object obj) {
                        DebugUtil.m4154bd(bVar2, (Questionnaire) obj);
                    }
                }, new e30() { // from class: l.mad
                    public final void call(Object obj) {
                        DebugUtil.m4186d1((Throwable) obj);
                    }
                }));
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: S4 */
    public static /* synthetic */ void m3955S4(Notification notification) {
        if (NullChecker.a(AccessToken.d())) {
            bzv.m().u();
        }
    }

    /* JADX INFO: renamed from: S6 */
    public static /* synthetic */ void m3957S6() {
        CoreModule.c.e0.j0.put(0L);
        CoreModule.c.e0.m0.put(0L);
        CoreModule.c.e0.k0.put(new HashSet());
        CoreModule.c.e0.l0.put(0L);
        CoreModule.c.e0.n0.put(0L);
        CoreModule.c.e0.o0.put(new HashSet());
        CoreModule.c.e0.p0.put(0L);
        CoreModule.c.e0.q0.put(new HashSet());
        CoreModule.c.e0.r0.put(0L);
        CoreModule.c.e0.s0.put(new HashSet());
    }

    /* JADX INFO: renamed from: S7 */
    public static /* synthetic */ void m3958S7(String str) {
        Relationship relationship = new Relationship();
        relationship.status = new ArrayList();
        y.i3(str, relationship).materialize().subscribe();
    }

    /* JADX INFO: renamed from: S9 */
    public static /* synthetic */ void m3960S9() {
        CoreModule.c.e0.p6.clear();
        CoreModule.c.e0.q6.clear();
        CoreModule.c.e0.r6.clear();
    }

    /* JADX INFO: renamed from: Sa */
    public static /* synthetic */ void m3961Sa() {
        CoreModule.c.q2.U.clear();
        CoreModule.c.q2.V.clear();
        CoreModule.c.q2.T.clear();
    }

    /* JADX INFO: renamed from: Sc */
    public static /* synthetic */ void m3963Sc(b bVar, Questionnaire questionnaire) {
        if (!NullChecker.a(questionnaire) || vwb.J(questionnaire.options)) {
            return;
        }
        new gij0(bVar.K1()).m6675A0(questionnaire);
    }

    /* JADX INFO: renamed from: Se */
    public static /* synthetic */ void m3965Se(Boolean bool) {
    }

    /* JADX INFO: renamed from: Sh */
    public static /* synthetic */ void m3968Sh() {
        hpd0 hpd0Var = CoreModule.c.e0.o6;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: Si */
    public static void m3969Si(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("历史消息cell激活", new C3245z0(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: Sj */
    public static void m3970Sj(final ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("国际化全屏购买弹窗【汇总】", new d30() { // from class: l.npc
            public final void call() {
                DebugUtil.m3811L7(arrayList, bVar);
            }
        }));
    }

    /* JADX INFO: renamed from: T1 */
    public static /* synthetic */ void m3973T1(final b bVar) {
        Dialog.e eVar = new Dialog.e(bVar.K1());
        final EditText editText = new EditText(bVar.K1());
        editText.setHint("请输入群id");
        eVar.P(editText, false);
        eVar.v0("加入", new Runnable() { // from class: l.q8c
            @Override // java.lang.Runnable
            public final void run() {
                DebugUtil.m3946Rg(editText, bVar);
            }
        });
        eVar.z0();
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ void m3975T3() {
        hpd0 hpd0Var = lra0.Q;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: T6 */
    public static /* synthetic */ void m3978T6(final b bVar, final String str) {
        Pattern patternCompile = Pattern.compile("[0-9]*");
        if (TextUtils.isEmpty(str) || !patternCompile.matcher(str).matches() || TextUtils.isEmpty(str)) {
            return;
        }
        e51.G(new Runnable() { // from class: l.p9d
            @Override // java.lang.Runnable
            public final void run() {
                nmn.m8352g(bVar.K1(), new nmn.C3386a(str, ""), "");
            }
        });
    }

    /* JADX INFO: renamed from: T7 */
    public static /* synthetic */ void m3979T7() {
        e eVar = CoreModule.c.g0;
        hpd0 hpd0Var = e.C0;
        e eVar2 = CoreModule.c.g0;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: T8 */
    public static /* synthetic */ void m3980T8() {
        hpd0 hpd0Var = h7j.a;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: Tc */
    public static /* synthetic */ void m3984Tc(Throwable th) {
    }

    /* JADX INFO: renamed from: Td */
    public static /* synthetic */ void m3985Td(PartialListOpt partialListOpt) {
        final int[] iArr = {0};
        CoreModule.c.e2.U = new ArrayList();
        final int i = 3;
        vwb.z(partialListOpt.loaded, new e30() { // from class: l.j9c
            public final void call(Object obj) {
                DebugUtil.m3805L1(iArr, i, (CoreSuggested.UserInfo) obj);
            }
        });
        CoreModule.c.e2.u3();
    }

    /* JADX INFO: renamed from: Te */
    public static /* synthetic */ void m3986Te(b bVar) {
        PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        new com.p1.mobile.putong.core.ui.purchase.mediator.c.a(bVar.K1(), purchaseType, (String) null).g(fy80.q(purchaseType.getPrivilegeData(null), (Privilege) null, purchaseType)).h();
    }

    /* JADX INFO: renamed from: Tf */
    public static /* synthetic */ void m3987Tf(User user) {
        Studies studies = user.profile.studies;
        studies.active = true;
        studies.verified = true;
    }

    /* JADX INFO: renamed from: Tg */
    public static /* synthetic */ void m3988Tg(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: Ti */
    public static void m3990Ti(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("聊天助手", new C3185h1(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: Tj */
    public static void m3991Tj(final ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("国际化外露喜欢", new d30() { // from class: l.joc
            public final void call() {
                DebugUtil.m3637D8(arrayList, bVar);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ void m3996U3(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("试用购买大页面", new d30() { // from class: l.x7d
            public final void call() {
                com.p1.mobile.putong.core.ui.purchase.c.F0(bVar.K1(), "debug");
            }
        }));
        arrayList.add(vwb.Y("插入See试用聚合会话", new d30() { // from class: l.y7d
            public final void call() {
                CoreModule.c.f0.qq(mqi0.o());
            }
        }));
        arrayList.add(vwb.Y("删除See试用聚合会话", new d30() { // from class: l.a8d
            public final void call() {
                CoreModule.c.f0.qq(-1.0d);
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Uc */
    public static /* synthetic */ void m4005Uc() {
        CoreModule.c.m0.V0.put(Boolean.FALSE);
        CoreModule.c.m0.W0.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: Ue */
    public static /* synthetic */ void m4007Ue() {
        hpd0 hpd0Var = CoreModule.c.e0.v6;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: Uf */
    public static /* synthetic */ void m4008Uf(b bVar) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = "你好！";
        CoreDlg.m2336R1(bVar.K1(), "sendMsg", "发送消息", "每次分享最多选择5位好友", 5, "分享", "最多可以选择5位好友", messageNew_.toJson(), new f30() { // from class: l.vkc
            public final void call(Object obj, Object obj2) {
                lsi0.y("发送消息结果：" + ((String) obj));
            }
        });
    }

    /* JADX INFO: renamed from: Ug */
    public static /* synthetic */ void m4009Ug() {
    }

    /* JADX INFO: renamed from: Ui */
    public static void m4011Ui(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("找个聊天搭子", new C3166c2(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: Uj */
    public static void m4012Uj(final ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("国际化黑金", new d30() { // from class: l.vwc
            public final void call() {
                DebugUtil.m4146b5(arrayList, bVar);
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m4013V() {
        if (((Integer) CoreModule.c.e0.y4.get()).intValue() == 110) {
            CoreModule.c.e0.y4.put(9);
        } else {
            CoreModule.c.e0.y4.put(110);
        }
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ void m4014V0() {
        zxz.h().l();
        hpd0 hpd0Var = CoreModule.c.e0.d1;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        CoreModule.c.e0.e1.put(bool);
        CoreModule.c.b1.R.put(bool);
        CoreModule.c.b1.S.put(bool);
        CoreModule.c.b1.V.put("");
        CoreModule.c.b1.W = null;
    }

    /* JADX INFO: renamed from: V1 */
    public static /* synthetic */ void m4015V1(b bVar) {
        ((CoreSuggested.UserInfo) ((PartialListOpt) CoreModule.c.m0.a0.e()).loaded.get(0)).canGreet = true;
        bVar.M.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: V2 */
    public static /* synthetic */ void m4016V2(final b bVar) {
        Dialog.e eVarDialog = bVar.K1().dialog();
        String str = "卡片清晰度优化实验入组：" + lra0.h.get();
        String str2 = "profile裁剪上传原图：" + lra0.g.get();
        String strConcat = "选择加载640图片 ".concat(((Integer) lra0.j.get()).intValue() == 640 ? "*" : "");
        String strConcat2 = "选择加载720图片 ".concat(((Integer) lra0.j.get()).intValue() == 720 ? "*" : "");
        String strConcat3 = "选择加载1080图片 ".concat(((Integer) lra0.j.get()).intValue() == 1080 ? "*" : "");
        eVarDialog.e0(vwb.f0(new String[]{str, str2, "修改卡片照片宽高比", strConcat, strConcat2, strConcat3, "选择加载1440图片 ".concat(((Integer) lra0.j.get()).intValue() == 1440 ? "*" : ""), "动态清晰度：" + lra0.i.get(), "显示当前设备参数信息"})).g0(new Dialog.g() { // from class: l.jxc
            /* JADX INFO: renamed from: a */
            public final void m7467a(Dialog dialog, View view, int i, CharSequence charSequence) {
                DebugUtil.m3841Mg(bVar, dialog, view, i, charSequence);
            }
        }).z().show();
    }

    /* JADX INFO: renamed from: V5 */
    public static /* synthetic */ void m4019V5(b bVar) {
        final zpd0 zpd0Var = new zpd0("msg_chat_guide_waiting_time", 3600L);
        i0e.d(bVar.K1()).I("输入聊天引导的等候时间，单位秒").E(1).D(80).r(zpd0Var.get() + "").H(zpd0Var.get() + "").F(new e30() { // from class: l.jsc
            public final void call(Object obj) {
                DebugUtil.m4026Vc(zpd0Var, (String) obj);
            }
        }).n().show();
    }

    /* JADX INFO: renamed from: V8 */
    public static /* synthetic */ void m4022V8() {
        hpd0 hpd0Var = lra0.H;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: Va */
    public static /* synthetic */ void m4024Va(b bVar) {
        CoreModule.c.e0.L5.clear();
        CoreModule.c.e0.M5.clear();
        new n2l(bVar.K1()).show();
    }

    /* JADX INFO: renamed from: Vc */
    public static /* synthetic */ void m4026Vc(zpd0 zpd0Var, String str) {
        try {
            zpd0Var.put(Long.valueOf(Long.parseLong(str)));
        } catch (Exception e) {
            CrashHelper.c(e);
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: Vf */
    public static /* synthetic */ void m4029Vf(String str, SuggestedComplimentItem suggestedComplimentItem, roj0 roj0Var) {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.id = str;
        userInfo.compliment = suggestedComplimentItem;
        CoreModule.c.m0.w6(userInfo, 0).subscribe(mkd0.H(new e30() { // from class: l.h9c
            public final void call(Object obj) {
                osi0.g("已插入到顶部");
            }
        }, new e30() { // from class: l.i9c
            public final void call(Object obj) {
                DebugUtil.m3984Tc((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Vg */
    public static /* synthetic */ void m4030Vg(b bVar, Questionnaire questionnaire) {
        if (NullChecker.a(questionnaire) && !vwb.J(questionnaire.options) && questionnaire.options.size() == 3) {
            new gij0(bVar.K1()).m6711z0(questionnaire);
        }
    }

    /* JADX INFO: renamed from: Vi */
    public static void m4032Vi(final ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("聊天真实性", new d30() { // from class: l.fwc
            public final void call() {
                DebugUtil.m4317j1(arrayList, bVar);
            }
        }));
    }

    /* JADX INFO: renamed from: Vj */
    public static void m4033Vj(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("男性心动信号二期", new C3218q0(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: W2 */
    public static /* synthetic */ void m4037W2() {
        hpd0 hpd0Var = lra0.X;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m4038W3() {
        hpd0 hpd0Var = CoreModule.c.m0.I1;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: W4 */
    public static /* synthetic */ void m4039W4() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.FemaleVipGuideCard;
        userInfo.id = "VirtualCard";
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.c.m0.w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: W6 */
    public static /* synthetic */ void m4041W6() {
        lra0.s.put(Boolean.FALSE);
        lra0.t.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: W8 */
    public static /* synthetic */ void m4043W8(b bVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CoreModule.c.e0.p9().fp().profile180().formatted());
        arrayList.add(CoreModule.c.e0.p9().fp().profile180().formatted());
        arrayList.add(CoreModule.c.e0.p9().fp().profile180().formatted());
        ok3.m8469H(bVar.K1(), 3, arrayList);
    }

    /* JADX INFO: renamed from: Wd */
    public static /* synthetic */ void m4048Wd(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("启动男性配对成功页面", new d30() { // from class: l.a0d
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().startActivityWithCustomTransition(MatchAct.g2(bVar2.K1(), vwb.M(bVar2.A2().j().id), 0, new ArrayList(), ""), new MatchAct.a());
            }
        }));
        arrayList.add(vwb.Y("启动女性配对成功页面", new d30() { // from class: l.b0d
            public final void call() {
                b bVar2 = bVar;
                aci.c0(bVar2.K1(), CoreModule.c.e0.oa(bVar2.A2().j().id), false, "", true);
            }
        }));
        final MatchSuccessAnimTime matchSuccessAnimTimeL = pa30.l();
        arrayList.add(vwb.Y("女性 进入动画时间 " + matchSuccessAnimTimeL.female_enter_time, new d30() { // from class: l.c0d
            public final void call() {
                b bVar2 = bVar;
                MatchSuccessAnimTime matchSuccessAnimTime = matchSuccessAnimTimeL;
                i0e.d(bVar2.K1()).I("时间 = " + matchSuccessAnimTime.female_enter_time).F(new e30() { // from class: l.vad
                    public final void call(Object obj) {
                        DebugUtil.m3566A3(matchSuccessAnimTime, (String) obj);
                    }
                }).n().show();
            }
        }));
        arrayList.add(vwb.Y("女性 退出动画时间 " + matchSuccessAnimTimeL.female_exit_time, new d30() { // from class: l.d0d
            public final void call() {
                b bVar2 = bVar;
                MatchSuccessAnimTime matchSuccessAnimTime = matchSuccessAnimTimeL;
                i0e.d(bVar2.K1()).I("时间 = " + matchSuccessAnimTime.female_exit_time).F(new e30() { // from class: l.r8c
                    public final void call(Object obj) {
                        DebugUtil.m3933R3(matchSuccessAnimTime, (String) obj);
                    }
                }).n().show();
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: We */
    public static /* synthetic */ void m4049We() {
        hpd0 hpd0Var = CoreModule.c.m0.V0;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        CoreModule.c.m0.W0.put(bool);
    }

    /* JADX INFO: renamed from: Wh */
    public static /* synthetic */ void m4052Wh() {
    }

    /* JADX INFO: renamed from: Wi */
    public static void m4053Wi(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("验证二维码", new C3193j1(bVar)));
    }

    /* JADX INFO: renamed from: Wj */
    public static void m4054Wj(final ArrayList<j760<String, d30>> arrayList, final b bVar) {
        Date date = new Date();
        date.setTime(CoreModule.c.f0.eg());
        final String str = mqi0.f.format(date);
        final boolean zBooleanValue = ((Boolean) CoreModule.c.e0.Y2.get()).booleanValue();
        arrayList.add(vwb.Y("新增通讯录", new d30() { // from class: l.bwc
            public final void call() {
                DebugUtil.m4176cd(arrayList, str, zBooleanValue, bVar);
            }
        }));
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ void m4056X0(ArrayList arrayList, b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("新旧切换开关:" + CoreModule.c.m0.E1.get(), new d30() { // from class: l.jzc
            public final void call() {
                DebugUtil.m3708Gd();
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m4057X1(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            y1j.d().c.put(Lifecycle.State.CREATED.name());
        } else if (i == 1) {
            y1j.d().c.put(Lifecycle.State.STARTED.name());
        } else if (i == 2) {
            y1j.d().c.put(Lifecycle.State.RESUMED.name());
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m4059X3() {
        r9m.i.put(Boolean.TRUE);
        hpd0 hpd0Var = r9m.j;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: X5 */
    public static /* synthetic */ void m4061X5() {
    }

    /* JADX INFO: renamed from: X9 */
    public static /* synthetic */ void m4065X9(final ArrayList arrayList, b bVar) {
        PartialListOpt partialListOpt = (PartialListOpt) CoreModule.c.m0.a0.e();
        if (partialListOpt == null || vwb.J(partialListOpt.loaded)) {
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
        final NewMainAct newMainActK1 = bVar.K1();
        final ArrayList arrayList2 = new ArrayList();
        arrayList2.add(((CoreSuggested.UserInfo) partialListOpt.loaded.get(0)).id);
        vwb.z(linkedHashMap.entrySet(), new e30() { // from class: l.exc
            public final void call(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                arrayList.add(vwb.Y((String) entry.getKey(), new d30() { // from class: l.l9d
                    public final void call() {
                        NewMainAct newMainAct = newMainAct;
                        newMainAct.startActivityWithCustomTransition(MatchAct.e2(newMainAct, arrayList, ((Integer) entry.getValue()).intValue(), new ArrayList()), new MatchAct.b());
                    }
                }));
            }
        });
        newMainActK1.showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Xd */
    public static /* synthetic */ void m4069Xd(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("关于我", new d30() { // from class: l.f1d
            public final void call() {
                DebugUtil.m4283ha(bVar);
            }
        }));
        arrayList.add(vwb.Y("问答", new d30() { // from class: l.g1d
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().startActivity(ExpandProfileLikeAct.V1(bVar2.K1(), new CoreSuggested.UserInfo(), ((DbObject) CoreModule.c.e0.p9()).id, "card", HomeCardExpandedType.QUESTION.getAlias(), 0));
            }
        }));
        arrayList.add(vwb.Y("生活照片点赞", new d30() { // from class: l.h1d
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().startActivity(ExpandProfileLikeAct.V1(bVar2.K1(), new CoreSuggested.UserInfo(), ((DbObject) CoreModule.c.e0.p9()).id, "card", HomeCardExpandedType.LIFE_PIC.getAlias(), 0));
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Xh */
    public static /* synthetic */ void m4073Xh(b bVar) {
        ArrayList arrayList = new ArrayList();
        for (Merchandise merchandise : zl80.g().d(true)) {
            if (arrayList.size() >= 2) {
                break;
            } else if (TEnum.equals(merchandise.category, "svip")) {
                arrayList.add(merchandise);
            }
        }
        PriceRecallGetSurprise2Dialog.l(bVar.K1(), arrayList, true);
    }

    /* JADX INFO: renamed from: Xi */
    public static void m4074Xi(final ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("城市C位", new d30() { // from class: l.mwc
            public final void call() {
                DebugUtil.m3703G8(arrayList, bVar);
            }
        }));
    }

    /* JADX INFO: renamed from: Xj */
    public static void m4075Xj(Act act, final boolean z) {
        if (!upa.a2()) {
            CoreModule.c.f0.Yf(act);
        }
        if (z) {
            CoreModule.c.f0.Ie();
        } else {
            CoreModule.c.f0.Je();
        }
        CoreModule.c.f0.on().take(1).observeOn(Schedulers.io()).delay(1L, TimeUnit.SECONDS).observeOn(jo0.a()).map(new w9j() { // from class: l.vnc
            public final Object call(Object obj) {
                return ((q860) obj).a;
            }
        }).filter(new w9j() { // from class: l.wnc
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((List) obj));
            }
        }).flatMap(new na8()).filter(new w9j() { // from class: l.ync
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((Conversation) obj).status, "default"));
            }
        }).filter(new w9j() { // from class: l.znc
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Conversation) obj).otherUser.startsWith(CoreStaticData.FriendPurposeDataType.HOUSE_RIEGION_NONE_STR));
            }
        }).filter(new w9j() { // from class: l.aoc
            public final Object call(Object obj) {
                return Boolean.valueOf(z || ((Conversation) obj).localHasMessage);
            }
        }).skip(z ? 6 : 0).take(50).buffer(50).subscribe(mkd0.G(new e30() { // from class: l.boc
            public final void call(Object obj) {
                DebugUtil.m4121a2(z, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m4076Y(b bVar) {
        f7e0 f7e0Var = new f7e0(bVar, ((Media) CoreModule.c.e0.p9().fp()).url, bVar.K1().string(R.string.Pm), 1, 1, (Figure) null, 0.0d, "old");
        f7e0Var.s(new d30() { // from class: l.auc
            public final void call() {
                DebugUtil.m4607w5();
            }
        });
        f7e0Var.x(CorePopLevel.INTL_SEE_ANIM_BUBBLE);
        hdb0.c().i(f7e0Var);
    }

    /* JADX INFO: renamed from: Y2 */
    public static /* synthetic */ void m4079Y2(b bVar) {
        BarLoverplaces barLoverplacesNew_ = BarLoverplaces.new_();
        barLoverplacesNew_.f16id = "201";
        barLoverplacesNew_.name = "Sounding唱跳俱乐部";
        new ud2(bVar.K1(), barLoverplacesNew_).show();
    }

    /* JADX INFO: renamed from: Y5 */
    public static /* synthetic */ void m4082Y5(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("购买弹窗", new d30() { // from class: l.c3d
            public final void call() {
                new mvm.e(bVar.K1()).b("p_knowmyself_purchase,e_knowmyself_test,click").c(new g30() { // from class: l.abd
                    /* JADX INFO: renamed from: a */
                    public final void m5313a(Object obj, Object obj2, Object obj3) {
                        DebugUtil.m4255g4((PurchaseType) obj, (Act) obj2, (String) obj3);
                    }
                }).d();
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Y7 */
    public static /* synthetic */ void m4084Y7(b bVar) {
        puk0.e().h("antispam");
        bVar.K1().startActivity(VerificationAct.m4872m2(bVar.K1(), 1, "avatar_ability"));
    }

    /* JADX INFO: renamed from: Ya */
    public static /* synthetic */ void m4087Ya(b bVar) {
        PurchaseType purchaseType = PurchaseType.TYPE_FEMALE_VIP;
        new com.p1.mobile.putong.core.ui.purchase.mediator.c.a(bVar.K1(), purchaseType, (String) null).g(fy80.p(purchaseType, purchaseType.getPrivilegeData(null), Privilege.ads_not_disturb)).h();
    }

    /* JADX INFO: renamed from: Ye */
    public static /* synthetic */ void m4091Ye() {
        m3670Ej();
        lsi0.y("称赞Mock数据已删除");
    }

    /* JADX INFO: renamed from: Yf */
    public static /* synthetic */ void m4092Yf() {
        hpd0 hpd0Var = lra0.G;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        lra0.F.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: Yi */
    public static void m4095Yi(final ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("全部配对气泡 " + CoreModule.c.f0.l1.get(), new d30() { // from class: l.bpc
            public final void call() {
                DebugUtil.m3772Jb(arrayList);
            }
        }));
    }

    /* JADX INFO: renamed from: Yj */
    public static void m4096Yj(final ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("婚恋", new d30() { // from class: l.lsc
            public final void call() {
                DebugUtil.m4542t6(arrayList, bVar);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m4097Z() {
        CoreModule.c.e0.w4.put(Boolean.FALSE);
        com.p1.mobile.android.ui.poplevel.a.p().w(false);
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m4101Z3(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("清空标签", new d30() { // from class: l.ctc
            public final void call() {
                bVar.K1().duringCreated(CoreModule.c.e0.o9()).take(1).map(new w9j() { // from class: l.a6d
                    public final Object call(Object obj) {
                        return DebugUtil.m4377lh((User) obj);
                    }
                }).flatMap(new w9j() { // from class: l.b6d
                    public final Object call(Object obj) {
                        return DebugUtil.m4393mb((User) obj);
                    }
                }).subscribe(mkd0.G(new e30() { // from class: l.c6d
                    public final void call(Object obj) {
                        DebugUtil.m4216e9((roj0) obj);
                    }
                }));
            }
        }));
        arrayList.add(vwb.Y("标签添加完成弹出 - 聊天详情页", new d30() { // from class: l.dtc
            public final void call() {
                sa40.o().U(bVar.K1(), "from_message_tag_guide");
            }
        }));
        arrayList.add(vwb.Y("标签添加完成弹出 - 心动信号广播", new d30() { // from class: l.etc
            public final void call() {
                sa40.o().U(bVar.K1(), "from_heartbeat");
            }
        }));
        arrayList.add(vwb.Y("标签添加完成弹出 - 引导标签添加划卡", new d30() { // from class: l.ftc
            public final void call() {
                sa40.o().U(bVar.K1(), "from_card_tag_guide");
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Z4 */
    public static /* synthetic */ void m4102Z4() {
        hpd0 hpd0Var = lra0.h0;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        hpd0 hpd0Var2 = lra0.i0;
        Boolean bool = Boolean.FALSE;
        hpd0Var2.put(bool);
        lra0.j0.put(bool);
        lra0.k0.put(bool);
    }

    /* JADX INFO: renamed from: Z6 */
    public static /* synthetic */ void m4104Z6(roj0 roj0Var) {
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (verificationCenterK4 != null) {
            lsi0.j("认证状态为:".concat(TEnum.equals(verificationCenterK4.idCard.status, "verified") ? "已认证" : "未认证"));
        }
    }

    /* JADX INFO: renamed from: Zd */
    public static /* synthetic */ void m4111Zd(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("打开通话Act", new d30() { // from class: l.roc
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().startActivity(VoiceCallAct.Z1(bVar2.K1()));
            }
        }));
        arrayList.add(vwb.Y("打开Push通知", new d30() { // from class: l.soc
            public final void call() {
                nlm0.b = true;
            }
        }));
        arrayList.add(vwb.Y("关闭Push通知", new d30() { // from class: l.uoc
            public final void call() {
                nlm0.b = false;
            }
        }));
        arrayList.add(vwb.Y("清除Debug 模拟", new d30() { // from class: l.voc
            public final void call() {
                nlm0.d(-1);
            }
        }));
        arrayList.add(vwb.Y("设置已经同意", new d30() { // from class: l.woc
            public final void call() {
                nlm0.d(0);
            }
        }));
        arrayList.add(vwb.Y("设置已经拒绝", new d30() { // from class: l.xoc
            public final void call() {
                nlm0.d(1);
            }
        }));
        arrayList.add(vwb.Y("设置同意", new d30() { // from class: l.yoc
            public final void call() {
                nlm0.d(2);
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Zg */
    public static /* synthetic */ void m4114Zg() {
    }

    /* JADX INFO: renamed from: Zi */
    public static String[] m4116Zi() {
        return m4138aj();
    }

    /* JADX INFO: renamed from: Zj */
    public static void m4117Zj(final ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("配对成功引导聊天", new d30() { // from class: l.cpc
            public final void call() {
                DebugUtil.m3569A6(arrayList, bVar);
            }
        }));
    }

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ void m4121a2(boolean z, List list) {
        int iMin = Math.min(50, list.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < iMin; i++) {
            String str = ((Conversation) list.get(i)).otherUser;
            if (!str.startsWith(CoreStaticData.FriendPurposeDataType.HOUSE_RIEGION_NONE_STR)) {
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
            CoreModule.c.f0.B2.onNext(linkedHashMap);
        } else {
            CoreModule.c.f0.C2.onNext(linkedHashMap);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public static /* synthetic */ void m4123a4(String str) {
        try {
            f2199g.put(Integer.valueOf(Integer.parseInt(str)));
        } catch (Exception e) {
            CrashHelper.c(e);
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a9 */
    public static /* synthetic */ void m4128a9(ArrayList arrayList, b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("清除频控", new C3174e2()));
        arrayList.add(vwb.Y("弹出弹窗，样式1", new C3178f2(bVar)));
        arrayList.add(vwb.Y("弹出弹窗，样式2", new C3182g2(bVar)));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: aa */
    public static /* synthetic */ void m4129aa() {
        hpd0 hpd0Var = lra0.o;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: ab */
    public static /* synthetic */ void m4130ab() {
        if (NullChecker.a(CoreModule.c.m0.a0.e())) {
            List<T> list = ((PartialListOpt) CoreModule.c.m0.a0.e()).loaded;
            if (vwb.J(list)) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) list.get(size);
                if (!CoreModule.c.m0.r0.contains(userInfo.id)) {
                    CoreModule.c.m0.i6(userInfo.id);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ac */
    public static /* synthetic */ void m4131ac(PurchaseType purchaseType, Act act, String str) {
    }

    /* JADX INFO: renamed from: af */
    public static /* synthetic */ void m4134af(Throwable th) {
    }

    /* JADX INFO: renamed from: ag */
    public static /* synthetic */ void m4135ag(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("清除白金会话相关本地变量", new d30() { // from class: l.a4d
            public final void call() {
                DebugUtil.m4440oe();
            }
        }));
        arrayList.add(vwb.Y("划卡前三张设置白金置顶喜欢", new d30() { // from class: l.b4d
            public final void call() {
                CoreModule.c.m0.W8().take(1).subscribe(mkd0.G(new e30() { // from class: l.u8c
                    public final void call(Object obj) {
                        DebugUtil.m3985Td((PartialListOpt) obj);
                    }
                }));
            }
        }));
        arrayList.add(vwb.Y("白金置顶喜欢发送push气泡", new d30() { // from class: l.c4d
            public final void call() {
                xl4.a(bVar.K1());
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: aj */
    public static String[] m4138aj() {
        String[][] strArr = f2202j;
        String[] strArr2 = new String[strArr.length];
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            strArr2[i2] = m4205dk(Integer.parseInt(strArr[i][2]));
            i++;
            i2++;
        }
        return strArr2;
    }

    /* JADX INFO: renamed from: ak */
    public static void m4139ak(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("配对成功页2期", new C3233v0(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m4140b() {
        CoreModule.c.e0.W4.put(0L);
        CoreModule.c.e0.X4.put(0);
        CoreModule.c.e0.Y4.put(Boolean.FALSE);
        CoreModule.c.e0.Z4.put(0L);
        CoreModule.c.e0.a5.put(0);
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m4141b0(b bVar) {
        CityTopGreetDialog.c cVar = new CityTopGreetDialog.c(bVar.K1());
        cVar.b(CoreModule.c.e0.p9());
        cVar.a().show();
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ void m4144b3(b bVar, String str, Conversation conversation) {
        if (NullChecker.a(conversation)) {
            bVar.K1().startActivity(MessagesAct.k2(bVar.K1(), str, true, false, -1));
        } else {
            C3135d.m3238a(bVar.K1(), new C3135d.a(str, "from_h5_suggest_user"));
        }
    }

    /* JADX INFO: renamed from: b4 */
    public static /* synthetic */ roj0 m4145b4(final List list) {
        CoreModule.c.U.a(new d30() { // from class: l.u8d
            public final void call() {
                DebugUtil.m4166c3(list);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: b5 */
    public static /* synthetic */ void m4146b5(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("清除bubble计数", new d30() { // from class: l.vyc
            public final void call() {
                DebugUtil.m3679F6();
            }
        }));
        arrayList.add(vwb.Y("跳转黑金遇见访客页", new d30() { // from class: l.wyc
            public final void call() {
                CoreModule.P().a().xg(bVar.K1());
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: b6 */
    public static /* synthetic */ void m4147b6() {
        CoreModule.c.n2.E3();
        lsi0.y("已清除");
    }

    /* JADX INFO: renamed from: b7 */
    public static /* synthetic */ void m4148b7(ArrayList arrayList, b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("清除划卡按钮提示", new d30() { // from class: l.swc
            public final void call() {
                DebugUtil.m4307ic();
            }
        }));
        arrayList.add(vwb.Y("打开显示43信息", new d30() { // from class: l.twc
            public final void call() {
                CoreModule.c.e0.k1.put(Boolean.TRUE);
            }
        }));
        arrayList.add(vwb.Y("关闭显示43信息", new d30() { // from class: l.uwc
            public final void call() {
                CoreModule.c.e0.k1.put(Boolean.FALSE);
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: b9 */
    public static /* synthetic */ void m4150b9(HashMap map, ArrayList arrayList, b bVar) {
    }

    /* JADX INFO: renamed from: ba */
    public static /* synthetic */ void m4151ba() {
        hpd0 hpd0Var = CoreModule.c.e0.J2;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: bb */
    public static /* synthetic */ void m4152bb() {
        CoreModule.c.j0.w4();
        p2b0.h().e();
    }

    /* JADX INFO: renamed from: bd */
    public static /* synthetic */ void m4154bd(b bVar, Questionnaire questionnaire) {
        if (NullChecker.a(questionnaire) && !vwb.J(questionnaire.options) && questionnaire.options.size() == 3) {
            new gij0(bVar.K1()).m6677C0(questionnaire);
        }
    }

    /* JADX INFO: renamed from: bf */
    public static /* synthetic */ void m4156bf() {
        hpd0 hpd0Var = a5x.a;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: bg */
    public static /* synthetic */ void m4157bg(b bVar) {
        Window window = bVar.K1().getWindow();
        if (window != null) {
            window.setSoftInputMode(3);
        }
        e51.H(bVar.K1(), new RunnableC3223s(bVar), 1000L);
    }

    /* JADX INFO: renamed from: bh */
    public static /* synthetic */ void m4158bh() {
        hpd0 hpd0Var = CoreModule.c.e0.m6;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: bi */
    public static /* synthetic */ void m4159bi() {
        hpd0 hpd0Var = CoreModule.c.m0.U0;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: bj */
    public static void m4160bj(ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("连续聊天外显", new d30() { // from class: l.tkc
            public final void call() {
                i0e.d(bVar.K1()).I("是否开启 debug模式").E(1).D(80).H(CoreModule.c.f0.x1.get() + "").F(new e30() { // from class: l.e0d
                    public final void call(Object obj) {
                        DebugUtil.m4389m7((String) obj);
                    }
                }).n().show();
            }
        }));
    }

    /* JADX INFO: renamed from: bk */
    public static void m4161bk(final ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("消息帧二期", new d30() { // from class: l.axc
            public final void call() {
                DebugUtil.m4505rd(arrayList, bVar);
            }
        }));
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m4163c0(Throwable th) {
    }

    /* JADX INFO: renamed from: c2 */
    public static /* synthetic */ void m4165c2() {
        hpd0 hpd0Var = f2194b;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        f2195c.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ void m4166c3(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qib0.k0.d.upsert((User) it.next());
        }
    }

    /* JADX INFO: renamed from: c5 */
    public static /* synthetic */ void m4168c5(final User user) {
        try {
            CoreModule.c.U.a(new d30() { // from class: l.e9c
                public final void call() {
                    DebugUtil.m3893P5(user);
                }
            });
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        m4534sk();
    }

    /* JADX INFO: renamed from: ca */
    public static /* synthetic */ void m4173ca(b bVar) {
        ArrayList arrayList = new ArrayList();
        for (Merchandise merchandise : zl80.g().d(true)) {
            if (arrayList.size() >= 2) {
                break;
            } else if (TEnum.equals(merchandise.category, "svip")) {
                arrayList.add(merchandise);
            }
        }
        km80.h0(bVar.K1(), (e30) null, arrayList, "p_promotion,callback_other", (Object) null);
    }

    /* JADX INFO: renamed from: cd */
    public static /* synthetic */ void m4176cd(ArrayList arrayList, String str, final boolean z, b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("清空上次记录新配对个数 = " + str, new d30() { // from class: l.hzc
            public final void call() {
                CoreModule.c.f0.Cp(0L);
            }
        }));
        arrayList.add(vwb.Y("显示空数据 = " + z, new d30() { // from class: l.izc
            public final void call() {
                CoreModule.c.e0.Y2.put(Boolean.valueOf(!z));
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: ce */
    public static /* synthetic */ void m4177ce(b bVar) {
        ArrayList arrayList = new ArrayList();
        PrivilegeDetail privilegeDetailNew_ = PrivilegeDetail.new_();
        privilegeDetailNew_.channel = "buy";
        privilegeDetailNew_.privilegeType = "vip";
        arrayList.add(privilegeDetailNew_);
        bVar.K1().startActivity(PurchaseResultAct.X1(bVar.K1(), "vip", "111", "￥", "11", new Gson().toJson(arrayList)));
    }

    /* JADX INFO: renamed from: cf */
    public static /* synthetic */ void m4178cf() {
        hpd0 hpd0Var = lra0.c0;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        lra0.b0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: ci */
    public static /* synthetic */ void m4181ci() {
        String str = "svip_new_prom_dlg_first_is_show" + CoreModule.H().userId();
        Boolean bool = Boolean.FALSE;
        new hpd0(str, bool).put(bool);
        new hpd0("svip_new_prom_dlg_end_is_show" + CoreModule.H().userId(), bool).put(bool);
    }

    /* JADX INFO: renamed from: cj */
    public static void m4182cj(String str, String str2, double d, String str3) {
        Conversation conversationNew_ = (Conversation) CoreModule.k.m.query(str);
        if (conversationNew_ == null) {
            conversationNew_ = Conversation.new_();
            ((DbObject) conversationNew_).id = str;
        }
        conversationNew_.convType = ConversationType.swiper;
        conversationNew_.createdTime = d;
        conversationNew_.latestTime = d;
        conversationNew_.localEverHasMessage = true;
        conversationNew_.localHasMessage = true;
        conversationNew_.otherUser = str3;
        conversationNew_.status = ConversationStatus.get("default");
        if (conversationNew_.additional == null) {
            conversationNew_.nullCheck();
        }
        ConvAdditionalSwiper convAdditionalSwiperNew_ = ConvAdditionalSwiper.new_();
        convAdditionalSwiperNew_.isPassive = true;
        convAdditionalSwiperNew_.type = str2;
        conversationNew_.additional.swiper = convAdditionalSwiperNew_;
        CoreModule.c.f0.mq(conversationNew_);
    }

    /* JADX INFO: renamed from: ck */
    public static void m4183ck(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("消息页面增加筛选选项", new C3215p0(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m4184d() {
        CoreModule.c.e0.R5.clear();
        CoreModule.c.e0.S5.clear();
        CoreModule.c.e0.T5.clear();
        CoreModule.c.e0.U5.clear();
        CoreModule.c.e0.V5.clear();
        CoreModule.c.e0.W5.clear();
        CoreModule.c.e0.X5.clear();
        CoreModule.c.e0.Y5.clear();
        CoreModule.c.e0.d6.clear();
        CoreModule.c.e0.e6.clear();
        CoreModule.c.e0.f6.clear();
        CoreModule.c.e0.g6.clear();
        CoreModule.c.Y0.c.clear();
    }

    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ void m4186d1(Throwable th) {
    }

    /* JADX INFO: renamed from: d2 */
    public static /* synthetic */ void m4187d2(b bVar) {
        HashMap mapH6 = CoreModule.c.m0.h6();
        if (mapH6 == null || mapH6.isEmpty()) {
            osi0.g("无 suggest 称赞数据");
            return;
        }
        Map.Entry entry = (Map.Entry) mapH6.entrySet().iterator().next();
        final String str = (String) entry.getKey();
        final SuggestedComplimentItem suggestedComplimentItem = (SuggestedComplimentItem) entry.getValue();
        PartialListOpt partialListOpt = (PartialListOpt) CoreModule.c.m0.a0.e();
        Collection collection = partialListOpt == null ? null : partialListOpt.loaded;
        CoreSuggested.UserInfo userInfo = vwb.J(collection) ? null : (CoreSuggested.UserInfo) vwb.r(collection, new w9j() { // from class: l.bbd
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((CoreSuggested.UserInfo) obj).id, str));
            }
        });
        if (userInfo == null) {
            bVar.K1().duringCreated(CoreModule.c.e0.W9(str)).subscribe(mkd0.H(new e30() { // from class: l.ebd
                public final void call(Object obj) {
                    DebugUtil.m4029Vf(str, suggestedComplimentItem, (roj0) obj);
                }
            }, new e30() { // from class: l.fbd
                public final void call(Object obj) {
                    osi0.g("拉取用户失败");
                }
            }));
        } else {
            userInfo.compliment = suggestedComplimentItem;
            CoreModule.c.m0.w6(userInfo, 0).subscribe(mkd0.H(new e30() { // from class: l.cbd
                public final void call(Object obj) {
                    osi0.g("已移到顶部");
                }
            }, new e30() { // from class: l.dbd
                public final void call(Object obj) {
                    DebugUtil.m3599Be((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: d4 */
    public static /* synthetic */ void m4189d4() {
        hpd0 hpd0Var = h7j.b;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: d6 */
    public static /* synthetic */ void m4191d6() {
        String str = "app_toolbar_white_theme_" + CoreModule.H().userId();
        Boolean bool = Boolean.FALSE;
        hpd0 hpd0Var = new hpd0(str, bool);
        if (((Boolean) hpd0Var.get()).booleanValue()) {
            hpd0Var.put(bool);
        } else {
            hpd0Var.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: d8 */
    public static /* synthetic */ void m4193d8() {
        CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) ((PartialListOpt) CoreModule.c.m0.a0.e()).loaded.get(0);
        Gson gson = new Gson();
        gson.toJson(userInfo);
        lsi0.j(gson.toJson(userInfo));
    }

    /* JADX INFO: renamed from: d9 */
    public static /* synthetic */ void m4194d9(b bVar, Dialog dialog, View view, int i, CharSequence charSequence) {
        String string = charSequence.toString();
        string.getClass();
        switch (string) {
            case "查看喜欢我的人":
                bVar.K1().startActivity(CoreModule.P().a().Vf() ? NewMyLikedUsersAct.Y1(bVar.K1()) : new Intent((Context) bVar.K1(), (Class<?>) LikedUsersAct.class));
                break;
            case "清除svip红点记录":
                uld0.e().c();
                break;
            case "SVIPIntlGuideAct":
                bVar.K1().startActivity(SVIPIntlGuideAct.Y1(bVar.K1()));
                break;
        }
    }

    /* JADX INFO: renamed from: dd */
    public static /* synthetic */ void m4198dd(d30 d30Var, d30 d30Var2, d30 d30Var3, d30 d30Var4, d30 d30Var5, d30 d30Var6) {
        d30Var.call();
        d30Var2.call();
        d30Var3.call();
        d30Var4.call();
        d30Var5.call();
        d30Var6.call();
    }

    /* JADX INFO: renamed from: dh */
    public static /* synthetic */ void m4202dh(b bVar) {
        q89 q89Var = CoreModule.c.p0;
        q89Var.S = 0.15d;
        q89Var.U = 0.19d;
        bo5.m5758l(bVar.K1(), m3823Lj(bVar), "debug", null);
    }

    /* JADX INFO: renamed from: dj */
    public static void m4204dj(ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("国际化 同道中人", new d30() { // from class: l.fpc
            public final void call() {
                com.p1.mobile.putong.core.ui.likeminded.a.INSTANCE.f(bVar.K1(), true);
            }
        }));
    }

    /* JADX INFO: renamed from: dk */
    public static String m4205dk(int i) {
        return String.valueOf(i + 25541);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m4207e0(Throwable th) {
    }

    /* JADX INFO: renamed from: e2 */
    public static /* synthetic */ void m4209e2() {
        u0n.c = true;
        CoreModule.c.e0.S1.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ void m4210e3() {
        m3928Qj();
        lsi0.y("称赞Mock数据已插入");
    }

    /* JADX INFO: renamed from: e5 */
    public static /* synthetic */ void m4212e5(ArrayList arrayList, b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("清除缓存", new d30() { // from class: l.i1d
            public final void call() {
                DebugUtil.m4244ff();
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: e6 */
    public static /* synthetic */ void m4213e6(ArrayList arrayList, b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("送你AI魔法照", new d30() { // from class: l.wkc
            public final void call() {
                DebugUtil.m3888P0();
            }
        }));
        arrayList.add(vwb.Y("摇骰子游戏邀请", new d30() { // from class: l.ykc
            public final void call() {
                DebugUtil.m4459pb();
            }
        }));
        arrayList.add(vwb.Y("送你一个清凉的夏天 收到", new d30() { // from class: l.zkc
            public final void call() {
                DebugUtil.m3951S0();
            }
        }));
        arrayList.add(vwb.Y("邀请加入“欧美好剧的群…", new d30() { // from class: l.alc
            public final void call() {
                DebugUtil.m4517s3();
            }
        }));
        arrayList.add(vwb.Y("找搭子一起学习", new d30() { // from class: l.blc
            public final void call() {
                DebugUtil.m3770J9();
            }
        }));
        arrayList.add(vwb.Y("设置开场白", new d30() { // from class: l.clc
            public final void call() {
                DebugUtil.m3905Ph();
            }
        }));
        arrayList.add(vwb.Y("她今天生日 tip", new d30() { // from class: l.dlc
            public final void call() {
                DebugUtil.m4495r3();
            }
        }));
        arrayList.add(vwb.Y("我的状态·吃瓜 tip", new d30() { // from class: l.elc
            public final void call() {
                DebugUtil.m3675F2();
            }
        }));
        arrayList.add(vwb.Y("上线提醒", new d30() { // from class: l.flc
            public final void call() {
                DebugUtil.m4584v4();
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: e7 */
    public static /* synthetic */ void m4214e7() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.AdCard;
        userInfo.id = "VirtualCard";
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        for (OMSAdCardInfo oMSAdCardInfo : ic50.j().h()) {
            if (TextUtils.equals(oMSAdCardInfo.contentType, "literatureCardGuide")) {
                userInfo.extensionObject = oMSAdCardInfo;
                CoreModule.c.m0.w6(userInfo, 0);
                CoreModule.c.m0.S1.put(userInfo, 0);
            }
        }
    }

    /* JADX INFO: renamed from: e9 */
    public static /* synthetic */ void m4216e9(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: ea */
    public static /* synthetic */ void m4217ea() {
        hpd0 hpd0Var = CoreModule.c.e0.B6;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: eb */
    public static /* synthetic */ void m4218eb(ArrayList arrayList, b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("开关，当前".concat(((Boolean) CoreModule.c.e0.m6.get()).booleanValue() ? "true" : "false"), new d30() { // from class: l.f5d
            public final void call() {
                DebugUtil.m4158bh();
            }
        }));
        arrayList.add(new j760("新上传图片都打标，当前".concat(((Boolean) CoreModule.c.e0.n6.get()).booleanValue() ? "true" : "false"), new d30() { // from class: l.g5d
            public final void call() {
                DebugUtil.m4476q6();
            }
        }));
        arrayList.add(new j760("强制更换头像页", new C3202l2(bVar)));
        arrayList.add(new j760("清除我的Tab认证失败红点频控", new C3206m2()));
        arrayList.add(new j760("修改年龄", new C3159b(bVar)));
        arrayList.add(new j760("我的Tab展示叹号", new C3163c(bVar)));
        arrayList.add(new j760("我的Tab展示黑金", new C3167d(bVar)));
        arrayList.add(new j760("我的Tab展示未完善", new C3171e(bVar)));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: ee */
    public static /* synthetic */ void m4221ee(final b bVar) {
        final User userP9 = CoreModule.c.e0.p9();
        Counter counterO3 = CoreModule.c.o3();
        final CounterLikeLimit counterLikeLimit = counterO3 == null ? null : counterO3.likeLimit;
        bVar.K1().dialog().e0(vwb.f0(new String[]{"10 last swipe alert already delete", "1-swipe 500 cards alert", "2-thin profile popup", "3-first left swipe", "4-first right swipe", "5-first superlike swipe", "6-first undo", "7-see expired dialog", "8-vip expired dialog", "9-out of superlike", "10-out of undo", "11-first scenario like", "12-vip alert", "13-only buy superlike alert", "14-show name fake alert", "15-fake alert", "16-school navigate dialog", "17-school approval failed", "18-matched !!", "19-ugly alert", "20-superlike intro", "21-permission alert", "22-share card", "23-good2fake alert", "24-superlike awrad recived", "25-scenario intro dialog", "26-scenario active dialog", "27-uglyalert special one", "28-TBH introduce dialog", "29-see not match dlg 3", "30-gp_ratev2", "31-gp renew subs failed", "32-gp renew subs data toast", "33-gp miss match toast", "34-see privilege activated", "35-gp pay failed dlg"})).g0(new Dialog.g() { // from class: l.xsc
            /* JADX INFO: renamed from: a */
            public final void m10951a(Dialog dialog, View view, int i, CharSequence charSequence) {
                DebugUtil.m4558u0(counterLikeLimit, bVar, userP9, dialog, view, i, charSequence);
            }
        }).z0();
    }

    /* JADX INFO: renamed from: ef */
    public static /* synthetic */ void m4222ef(b bVar) {
        ActionToast actionToastNew_ = ActionToast.new_();
        actionToastNew_.message = "哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈";
        actionToastNew_.mainImg = "http://cloud.staging2.p1staff.com/v1/images/eyJpZCI6IkJSRlRDQkJaVk1FT0UzTkpEUkw3NlRUV0ZUVFdMRjAyIiwidyI6NDAwLCJoIjo1MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MDI4ODUyMzIxODk5Njg3MzA5fQ.webp?format=max_960xX";
        CardOption cardOptionNew_ = CardOption.new_();
        cardOptionNew_.link = "tantanapp://home?action=location";
        actionToastNew_.option = cardOptionNew_;
        qug0.g().l(bVar, actionToastNew_);
    }

    /* JADX INFO: renamed from: eg */
    public static /* synthetic */ void m4223eg() {
        List<T> list = ((PartialListOpt) CoreModule.c.m0.a0.e()).loaded;
        if (vwb.J(list)) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            stringBuffer.append(((CoreSuggested.UserInfo) list.get(i)).id + ",");
        }
    }

    /* JADX INFO: renamed from: ei */
    public static /* synthetic */ void m4225ei() {
        CoreModule.c.m0.V0.put(Boolean.FALSE);
        CoreModule.c.m0.W0.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: ej */
    public static void m4226ej(ArrayList<j760<String, d30>> arrayList) {
    }

    /* JADX INFO: renamed from: ek */
    public static void m4227ek(final ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("新资料页改版", new d30() { // from class: l.jtc
            public final void call() {
                DebugUtil.m4056X0(arrayList, bVar);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m4228f() {
        hpd0 hpd0Var = f2195c;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        f2194b.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m4229f0(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ void m4230f1() {
        hpd0 hpd0Var = CoreModule.c.m0.u1;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: f4 */
    public static /* synthetic */ void m4233f4(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("插入闪聊广播弹窗", new d30() { // from class: l.p3d
            public final void call() {
                DebugUtil.m4360l0(bVar);
            }
        }));
        arrayList.add(vwb.Y("闪聊配对成功弹窗-》消息页面", new d30() { // from class: l.q3d
            public final void call() {
                DebugUtil.m4374le();
            }
        }));
        arrayList.add(vwb.Y("闪聊配对成功弹窗-》popwindow", new d30() { // from class: l.r3d
            public final void call() {
                com.p1.mobile.putong.core.ui.onlinematch.a.l0(bVar.K1(), CoreModule.c.e0.p9());
            }
        }));
        arrayList.add(vwb.Y("清理 插入闪聊广播弹窗 次数:" + CoreModule.c.D0.V.get(), new d30() { // from class: l.t3d
            public final void call() {
                CoreModule.c.D0.V.put(0);
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: f6 */
    public static /* synthetic */ void m4235f6() {
        hpd0 hpd0Var = CoreModule.c.e0.x4;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: f7 */
    public static /* synthetic */ void m4236f7(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("一键打开：" + com.p1.mobile.android.ui.poplevel.a.p().n(), new d30() { // from class: l.a1d
            public final void call() {
                DebugUtil.m3650E();
            }
        }));
        arrayList.add(vwb.Y("一键关闭：" + com.p1.mobile.android.ui.poplevel.a.p().n(), new d30() { // from class: l.b1d
            public final void call() {
                DebugUtil.m4097Z();
            }
        }));
        arrayList.add(vwb.Y("展示debug入口", new d30() { // from class: l.c1d
            public final void call() {
                DebugUtil.m4600vk(bVar);
            }
        }));
        arrayList.add(vwb.Y("默认展示入口", new d30() { // from class: l.e1d
            public final void call() {
                DebugUtil.m3674F1();
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: f8 */
    public static /* synthetic */ void m4237f8() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.MarryAdCard;
        userInfo.id = "VirtualCard";
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.c.m0.w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: fa */
    public static /* synthetic */ void m4239fa() {
        hpd0 hpd0Var = CoreModule.c.m0.H1;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: fb */
    public static /* synthetic */ void m4240fb() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.FourSelectOneAdCard;
        userInfo.id = "VirtualCard";
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        FourSelectOneAdCardData fourSelectOneAdCardDataNew_ = FourSelectOneAdCardData.new_();
        fourSelectOneAdCardDataNew_.adTitle = "同分享生活中的小幸运？";
        fourSelectOneAdCardDataNew_.adContent = "挑一挑谁最符合问题描述";
        fourSelectOneAdCardDataNew_.avatarList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlJDSlFTVVNCWlROVjVDSVdZS0xLQldWRzNOT0VQTzE0IiwidyI6MzY2LCJoIjo1NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTkxMDU4OTA2OTkyMDY4NzcyOX0.png");
        fourSelectOneAdCardDataNew_.avatarList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IkVBUERJVE9NT0o0Sk5ZNlJUVlA0UjRXSU1XSk03RjE0IiwidyI6MzY2LCJoIjo1NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjQ2NjAzMTQ0OTY1NDM0NzA3fQ.png");
        fourSelectOneAdCardDataNew_.avatarList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IlJDSlFTVVNCWlROVjVDSVdZS0xLQldWRzNOT0VQTzE0IiwidyI6MzY2LCJoIjo1NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTkxMDU4OTA2OTkyMDY4NzcyOX0.png");
        fourSelectOneAdCardDataNew_.avatarList.add("https://auto.tancdn.com/v1/images/eyJpZCI6IkVBUERJVE9NT0o0Sk5ZNlJUVlA0UjRXSU1XSk03RjE0IiwidyI6MzY2LCJoIjo1NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjQ2NjAzMTQ0OTY1NDM0NzA3fQ.png");
        userInfo.fourSelectOneAdCardData = fourSelectOneAdCardDataNew_;
        CoreModule.c.m0.w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: fe */
    public static /* synthetic */ void m4243fe() {
        hpd0 hpd0Var = tvf.b;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        tvf.c.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: ff */
    public static /* synthetic */ void m4244ff() {
        CoreModule.c.Q1.l3(false);
        osi0.g("已清除");
    }

    /* JADX INFO: renamed from: fg */
    public static /* synthetic */ void m4245fg(final b bVar) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, 4, 20);
        CoreModule.c.u0.r0.put(Long.valueOf(calendar.getTimeInMillis()));
        e51.H(bVar.K1(), new Runnable() { // from class: l.dpc
            @Override // java.lang.Runnable
            public final void run() {
                bVar.v2().B5();
            }
        }, 2000L);
    }

    /* JADX INFO: renamed from: fh */
    public static /* synthetic */ void m4246fh() {
        Boolean bool = Boolean.FALSE;
        new hpd0("tantan_verification_tip_show", bool).put(bool);
    }

    /* JADX INFO: renamed from: fj */
    public static void m4248fj(ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("露营活动", new d30() { // from class: l.gxc
            public final void call() {
                com.p1.mobile.putong.core.ui.intloperation.campingactivity.b.INSTANCE.i(bVar.K1(), 1);
            }
        }));
    }

    /* JADX INFO: renamed from: fk */
    public static void m4249fk(final ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("新版配对成功", new d30() { // from class: l.snc
            public final void call() {
                DebugUtil.m4048Wd(arrayList, bVar);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m4250g() {
        hpd0 hpd0Var = lra0.d0;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        lra0.e0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: g2 */
    public static /* synthetic */ void m4253g2() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.NewUserSeeMyself;
        userInfo.id = "VirtualCard";
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.c.m0.w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ void m4254g3(b bVar) {
        c cVar = CoreModule.c;
        cVar.Y0.r = 0;
        cVar.e0.L5.clear();
        CoreModule.c.e0.M5.clear();
        bVar.f6();
    }

    /* JADX INFO: renamed from: g4 */
    public static /* synthetic */ void m4255g4(PurchaseType purchaseType, Act act, String str) {
    }

    /* JADX INFO: renamed from: g5 */
    public static /* synthetic */ void m4256g5() {
        uyc0.l0().p0(true);
        uyc0.l0().q0(true);
    }

    /* JADX INFO: renamed from: g6 */
    public static /* synthetic */ void m4257g6() {
        hpd0 hpd0Var = CoreModule.c.e0.c4;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: g7 */
    public static /* synthetic */ void m4258g7(b bVar) {
        ((CoreSuggested.UserInfo) ((PartialListOpt) CoreModule.c.m0.a0.e()).loaded.get(0)).debugRecommendMessage();
        bVar.M.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: g8 */
    public static /* synthetic */ void m4259g8(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("自动划卡", new d30() { // from class: l.gmc
            public final void call() {
                DebugUtil.m3822Li(bVar.K1());
            }
        }));
        arrayList.add(vwb.Y("还原速度", new d30() { // from class: l.hmc
            public final void call() {
                new tpd0("swipe_trans_speed", 1).put(1);
            }
        }));
        arrayList.add(vwb.Y("x2速度", new d30() { // from class: l.imc
            public final void call() {
                new tpd0("swipe_trans_speed", 1).put(2);
            }
        }));
        arrayList.add(vwb.Y("x5速度", new d30() { // from class: l.jmc
            public final void call() {
                new tpd0("swipe_trans_speed", 1).put(5);
            }
        }));
        arrayList.add(vwb.Y("x10速度", new d30() { // from class: l.kmc
            public final void call() {
                new tpd0("swipe_trans_speed", 1).put(10);
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: ga */
    public static /* synthetic */ void m4261ga() {
        hpd0 hpd0Var = CoreModule.c.e0.O1;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: gb */
    public static /* synthetic */ void m4262gb(b bVar) {
        Merchandise merchandise = (Merchandise) vwb.r((List) CoreModule.c.j0.E4().e(), new w9j() { // from class: l.w8c
            public final Object call(Object obj) {
                Merchandise merchandise2 = (Merchandise) obj;
                return Boolean.valueOf(TEnum.equals(merchandise2.category, ProductCategory.tttVip) && merchandise2.monthly() && merchandise2.autoRenewable());
            }
        });
        Coupon couponForPromotion = merchandise.getCouponForPromotion(MonetizationPromotionsId.trial7DVIP);
        if (couponForPromotion != null) {
            new cpk0.a(bVar.K1()).d(merchandise).b(couponForPromotion).c("debug").e();
        } else {
            lsi0.y("商品或者优惠券为空");
        }
    }

    /* JADX INFO: renamed from: gd */
    public static /* synthetic */ void m4264gd(ArrayList arrayList, b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("模拟卸载", new d30() { // from class: l.urc
            public final void call() {
                DebugUtil.m4446ok(-1L);
            }
        }));
        arrayList.add(vwb.Y("设置时间为半小时时间", new d30() { // from class: l.vrc
            public final void call() {
                DebugUtil.m4446ok(mqi0.o() - 1800000);
            }
        }));
        arrayList.add(vwb.Y("设置时间为1小时时间", new d30() { // from class: l.wrc
            public final void call() {
                DebugUtil.m4446ok(mqi0.o() - 3600000);
            }
        }));
        arrayList.add(vwb.Y("设置时间为当前时间", new d30() { // from class: l.xrc
            public final void call() {
                DebugUtil.m4446ok(mqi0.o());
            }
        }));
        arrayList.add(vwb.Y("设置时间为一天前时间", new d30() { // from class: l.yrc
            public final void call() {
                DebugUtil.m4446ok(mqi0.o() - 86400000);
            }
        }));
        arrayList.add(vwb.Y("设置时间为一周前时间", new d30() { // from class: l.zrc
            public final void call() {
                DebugUtil.m4446ok(mqi0.o() - 604800000);
            }
        }));
        arrayList.add(vwb.Y("设置时间为一月前时间", new d30() { // from class: l.asc
            public final void call() {
                DebugUtil.m4446ok(mqi0.o() - 2592000000L);
            }
        }));
        arrayList.add(vwb.Y("设置时间为覆盖安装", new d30() { // from class: l.bsc
            public final void call() {
                DebugUtil.m4446ok(-1000L);
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: ge */
    public static /* synthetic */ void m4265ge() {
        PushMessage pushMessage = new PushMessage();
        pushMessage.intent = "newMaleUserLike.send";
        CoreBusinessModule.e.n("", "", "", pushMessage, (PushTrackData) null);
    }

    /* JADX INFO: renamed from: gf */
    public static /* synthetic */ void m4266gf() {
        lra0.s.put(Boolean.TRUE);
        lra0.t.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: gj */
    public static void m4270gj(final ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("全屏称赞页", new d30() { // from class: l.ztc
            public final void call() {
                DebugUtil.m4672z4(arrayList, bVar);
            }
        }));
    }

    /* JADX INFO: renamed from: gk */
    public static void m4271gk(final ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("跳转新资料点赞页 ", new d30() { // from class: l.zwc
            public final void call() {
                DebugUtil.m4069Xd(arrayList, bVar);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m4272h() {
        hpd0 hpd0Var = lra0.n0;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ void m4274h1() {
        tpd0 tpd0Var = CoreModule.c.e0.i6;
        tpd0Var.put(Integer.valueOf((((Integer) tpd0Var.get()).intValue() + 1) % 3));
    }

    /* JADX INFO: renamed from: h3 */
    public static /* synthetic */ void m4276h3() {
        hpd0 hpd0Var = CoreModule.c.e0.d4;
        if (NullChecker.a(hpd0Var)) {
            hpd0Var.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: h5 */
    public static /* synthetic */ void m4278h5(b bVar) {
        q3h0.C3407b c3407b = new q3h0.C3407b();
        c3407b.m8907a(0);
        c3407b.m8908b(CoreModule.K().getUserById(CoreModule.c.m0.q6()));
        c3407b.m8909c(bVar.K1());
    }

    /* JADX INFO: renamed from: h7 */
    public static /* synthetic */ void m4280h7(final ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("添加促销", new d30() { // from class: l.mxc
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().startActivity(new Intent((Context) bVar2.K1(), (Class<?>) PurchasePromotionAct.class));
            }
        }));
        arrayList.add(vwb.Y("2024双11svip-6m优惠", new d30() { // from class: l.yxc
            public final void call() {
                b bVar2 = bVar;
                oxa0.i0(bVar2.K1(), new e30() { // from class: l.y1d
                    public final void call(Object obj) {
                        DebugUtil.m3965Se((Boolean) obj);
                    }
                }, (Merchandise) vwb.r(CoreModule.c.j0.D5(ProductCategory.get("svip")), new w9j() { // from class: l.x1d
                    public final Object call(Object obj) {
                        return Boolean.valueOf(rxa0.l((Merchandise) obj, MonetizationPromotionsId.giftDurationSVIP));
                    }
                }), bVar2.K1().pageId());
            }
        }));
        arrayList.add(vwb.Y("重构购买弹窗【汇总】", new d30() { // from class: l.kyc
            public final void call() {
                DebugUtil.m4637xd(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("优惠卷 首页弹窗时间重置", new d30() { // from class: l.myc
            public final void call() {
                DebugUtil.m4524sa();
            }
        }));
        arrayList.add(vwb.Y("腾讯广告SDK【汇总】", new d30() { // from class: l.nyc
            public final void call() {
                DebugUtil.m3904Pg(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("检查支付宝安装", new d30() { // from class: l.pyc
            public final void call() {
                sd60.k();
            }
        }));
        arrayList.add(vwb.Y("vip 右滑上线提示弹窗", new d30() { // from class: l.qyc
            public final void call() {
                DebugUtil.m4387m5(bVar);
            }
        }));
        arrayList.add(vwb.Y("购买项是否监管平铺切换", new d30() { // from class: l.ryc
            public final void call() {
                DebugUtil.m4152bb();
            }
        }));
        arrayList.add(vwb.Y("购买弹窗【汇总】", new d30() { // from class: l.syc
            public final void call() {
                DebugUtil.m4656ya(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("全屏购买弹窗【汇总】", new d30() { // from class: l.tyc
            public final void call() {
                DebugUtil.m4681zd(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("落地页【汇总】", new d30() { // from class: l.nxc
            public final void call() {
                DebugUtil.m3870O3(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("打招呼配对页【汇总】", new d30() { // from class: l.oxc
            public final void call() {
                DebugUtil.m4664yi(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("访客相关【汇总】", new d30() { // from class: l.pxc
            public final void call() {
                DebugUtil.m3918Q9(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("高价会员【汇总】", new d30() { // from class: l.qxc
            public final void call() {
                DebugUtil.m3760J(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("SVIP低价召回【汇总】", new d30() { // from class: l.rxc
            public final void call() {
                DebugUtil.m3578Af(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("出现superlike引导一次", new d30() { // from class: l.txc
            public final void call() {
                DebugUtil.m3819Lf();
            }
        }));
        arrayList.add(vwb.Y("插入superlike卡片", new d30() { // from class: l.uxc
            public final void call() {
                DebugUtil.m4615wd(bVar);
            }
        }));
        arrayList.add(vwb.Y("插入undo卡片", new d30() { // from class: l.vxc
            public final void call() {
                DebugUtil.m4567u9();
            }
        }));
        arrayList.add(vwb.Y("插入打招呼2卡片", new d30() { // from class: l.wxc
            public final void call() {
                e51.H(bVar.K1(), new Runnable() { // from class: l.w1d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m3887P();
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.Y("svip试用弹窗", new d30() { // from class: l.xxc
            public final void call() {
                DebugUtil.m4465ph(bVar);
            }
        }));
        arrayList.add(vwb.Y("See离线弹窗", new d30() { // from class: l.zxc
            public final void call() {
                DebugUtil.m4378li(bVar);
            }
        }));
        arrayList.add(vwb.Y("揭秘喜欢我的人", new d30() { // from class: l.ayc
            public final void call() {
                DebugUtil.m4043W8(bVar);
            }
        }));
        arrayList.add(new j760("清除超级喜欢划卡引导时间戳", new d30() { // from class: l.byc
            public final void call() {
                DebugUtil.m4375lf();
            }
        }));
        arrayList.add(new j760("清除fake用户引导引导时间戳", new d30() { // from class: l.cyc
            public final void call() {
                DebugUtil.m3942Rc();
            }
        }));
        arrayList.add(new j760("已读标记重置", new d30() { // from class: l.eyc
            public final void call() {
                DebugUtil.m3723H6();
            }
        }));
        arrayList.add(vwb.Y("试用link", new d30() { // from class: l.fyc
            public final void call() {
                j2e0.m(bVar.K1(), Uri.parse("tantan://monetization_promotion/svip/trail"));
            }
        }));
        arrayList.add(vwb.Y("svip优惠券link", new d30() { // from class: l.gyc
            public final void call() {
                j2e0.m(bVar.K1(), Uri.parse("tantan://svip/svip/buy?couponId=lowPriceCustomerSVIP@local_3M_under23age_h"));
            }
        }));
        arrayList.add(vwb.Y("svip低价优惠link", new d30() { // from class: l.hyc
            public final void call() {
                j2e0.m(bVar.K1(), Uri.parse("tantan://svip/svip/buy?couponId=lowPriceCustomerSVIP@local_1M_exceed23age_h"));
            }
        }));
        arrayList.add(vwb.Y("vip低价优惠link", new d30() { // from class: l.iyc
            public final void call() {
                j2e0.m(bVar.K1(), Uri.parse("tantan://vip/vip/buy?couponId=lowPriceCustomerVIP@local_1M"));
            }
        }));
        arrayList.add(vwb.Y("vip首月link", new d30() { // from class: l.jyc
            public final void call() {
                j2e0.m(bVar.K1(), Uri.parse("tantan://vip/vip/buy?couponId=lowPriceFirstMonthVIP1M@local"));
            }
        }));
        arrayList.add(vwb.Y("合伙人定制页面", new d30() { // from class: l.lyc
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().startActivity(SupremeCustomAct.Companion.a(bVar2.K1()));
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: ha */
    public static /* synthetic */ void m4283ha(b bVar) {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        User userP9 = CoreModule.c.e0.p9();
        userP9.description = "赞赞赞赞赞赞赞赞赞赞赞赞，收到咖啡店升降开关阿萨德开发的索拉卡风管机手打立卡高发季双打卡估计啊老大说";
        bVar.K1().startActivity(ExpandProfileLikeAct.V1(bVar.K1(), userInfo, ((DbObject) userP9).id, "card", HomeCardExpandedType.ABOUT_ME.getAlias(), 0));
    }

    /* JADX INFO: renamed from: hg */
    public static /* synthetic */ void m4289hg() {
        try {
            CoreModule.c.U.a(new d30() { // from class: l.y8c
                public final void call() {
                    DebugUtil.m3883Og();
                }
            });
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        m4534sk();
    }

    /* JADX INFO: renamed from: hi */
    public static /* synthetic */ void m4291hi() {
        if (((Integer) CoreModule.c.r2.b0.get()).intValue() != 0) {
            CoreModule.c.r2.b0.put(0);
            return;
        }
        CoreModule.c.r2.b0.put(8);
        CoreModule.c.r2.a0.put(0L);
        CoreModule.c.r2.b0.put(0);
    }

    /* JADX INFO: renamed from: hj */
    public static void m4292hj(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("称赞Mock数据 当前:".concat(((Boolean) f2201i.get()).booleanValue() ? "开" : "关"), new d30() { // from class: l.jnc
            public final void call() {
                DebugUtil.m4327jb();
            }
        }));
        arrayList.add(vwb.Y("称赞Mock: 插入Mock数据", new d30() { // from class: l.knc
            public final void call() {
                DebugUtil.m4210e3();
            }
        }));
        arrayList.add(vwb.Y("称赞Mock: 删除Mock数据", new d30() { // from class: l.lnc
            public final void call() {
                DebugUtil.m4091Ye();
            }
        }));
    }

    /* JADX INFO: renamed from: hk */
    public static void m4293hk(ArrayList<j760<String, d30>> arrayList, b bVar) {
        final boolean zBooleanValue = ((Boolean) CoreModule.c.e0.N4.get()).booleanValue();
        arrayList.add(vwb.Y("新编辑资料页UI " + zBooleanValue, new d30() { // from class: l.btc
            public final void call() {
                CoreModule.c.e0.N4.put(Boolean.valueOf(!zBooleanValue));
            }
        }));
    }

    /* JADX INFO: renamed from: i2 */
    public static /* synthetic */ void m4297i2() {
        hpd0 hpd0Var = CoreModule.c.e0.h5;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        CoreModule.c.K1.S.put(bool);
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ void m4298i3(final b bVar, final String str) {
        Pattern patternCompile = Pattern.compile("[0-9]*");
        if (TextUtils.isEmpty(str) || !patternCompile.matcher(str).matches() || TextUtils.isEmpty(str)) {
            return;
        }
        e51.G(new Runnable() { // from class: l.a2d
            @Override // java.lang.Runnable
            public final void run() {
                b bVar2 = bVar;
                String str2 = str;
                bVar2.K1().duringCreated(CoreModule.c.f0.Ue(str2)).take(1).subscribe(mkd0.H(new e30() { // from class: l.z8c
                    public final void call(Object obj) {
                        DebugUtil.m4144b3(bVar2, str2, (Conversation) obj);
                    }
                }, new e30() { // from class: l.b9c
                    public final void call(Object obj) {
                        C3135d.m3238a(bVar2.K1(), new C3135d.a(str2, "from_h5_suggest_user"));
                    }
                }));
            }
        });
    }

    /* JADX INFO: renamed from: i6 */
    public static /* synthetic */ void m4301i6() {
        List listJ = CoreModule.k.c.K().j();
        final GreetingSummary greetingSummaryNew_ = GreetingSummary.new_();
        greetingSummaryNew_.latestMessageId = ((DbObject) ((Message) listJ.get(0))).id;
        if (listJ.size() > 0) {
            e51.G(new Runnable() { // from class: l.d6d
                @Override // java.lang.Runnable
                public final void run() {
                    DebugUtil.m4686zi(greetingSummaryNew_);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i8 */
    public static /* synthetic */ void m4303i8(b bVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PurchaseType.TYPE_GET_VIP);
        arrayList.add(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        new j6b0.a(bVar.K1(), arrayList, (List) null, (String) null).a(0).b(new d30() { // from class: l.fad
            public final void call() {
                DebugUtil.m3658E7();
            }
        }).c(new e30() { // from class: l.gad
            public final void call(Object obj) {
                DebugUtil.m4229f0((PurchaseType) obj);
            }
        }).f(new e30() { // from class: l.had
            public final void call(Object obj) {
                DebugUtil.m4501r9((PurchaseType) obj);
            }
        }).d(new e30() { // from class: l.iad
            public final void call(Object obj) {
                DebugUtil.m4438oc((PurchaseType) obj);
            }
        }).e(new g30() { // from class: l.jad
            /* JADX INFO: renamed from: a */
            public final void m7382a(Object obj, Object obj2, Object obj3) {
                DebugUtil.m4131ac((PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).g();
    }

    /* JADX INFO: renamed from: i9 */
    public static /* synthetic */ void m4304i9() {
        hpd0 hpd0Var = lra0.k0;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        hpd0 hpd0Var2 = lra0.i0;
        Boolean bool = Boolean.FALSE;
        hpd0Var2.put(bool);
        lra0.h0.put(bool);
        lra0.j0.put(bool);
    }

    /* JADX INFO: renamed from: ic */
    public static /* synthetic */ void m4307ic() {
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
    public static /* synthetic */ void m4308id() {
        hpd0 hpd0Var = lra0.C;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        if (((Boolean) lra0.C.get()).booleanValue()) {
            lra0.B.put(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: ie */
    public static /* synthetic */ void m4309ie() {
        CoreModule.c.H1.e0.clear();
        CoreModule.c.H1.f0.clear();
    }

    /* JADX INFO: renamed from: ih */
    public static /* synthetic */ void m4311ih() {
        hpd0 hpd0Var = lra0.N;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: ij */
    public static String m4313ij() {
        ProfileLike profileLike;
        Counter counterO3 = CoreModule.c.o3();
        return (counterO3 == null || (profileLike = counterO3.profileLike) == null) ? "—" : String.valueOf(profileLike.remaining);
    }

    /* JADX INFO: renamed from: ik */
    public static void m4314ik(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("老用户迎新", new C3189i1(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m4315j(ArrayList arrayList, b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("清除所有曝光次数", new d30() { // from class: l.e6d
            public final void call() {
                DebugUtil.m3718H1();
            }
        }));
        arrayList.add(vwb.Y("清除婚恋曝光次数", new d30() { // from class: l.f6d
            public final void call() {
                xjc0.m10866a(xjc0.f8495a);
            }
        }));
        arrayList.add(vwb.Y("清除我的tab认证曝光次数", new d30() { // from class: l.h6d
            public final void call() {
                xjc0.m10866a(xjc0.f8496b);
            }
        }));
        arrayList.add(vwb.Y("清除我的侧边栏入口曝光次数", new d30() { // from class: l.i6d
            public final void call() {
                xjc0.m10866a(xjc0.f8497c);
            }
        }));
        arrayList.add(vwb.Y("清除我的侧边栏我的客服曝光次数", new d30() { // from class: l.j6d
            public final void call() {
                xjc0.m10866a(xjc0.f8498d);
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m4316j0(ArrayList arrayList, b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("mock 插入推荐配对", new d30() { // from class: l.bxc
            public final void call() {
                DebugUtil.m4477q7();
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: j1 */
    public static /* synthetic */ void m4317j1(ArrayList arrayList, b bVar) {
        arrayList.clear();
        if (NullChecker.a(CoreModule.c.e0.d5)) {
            arrayList.add(vwb.Y("切换ab，当前".concat(((Boolean) CoreModule.c.e0.d5.get()).booleanValue() ? "true" : "false"), new C3186h2()));
            bVar.K1().showDebugMenu(arrayList);
        }
    }

    /* JADX INFO: renamed from: j8 */
    public static /* synthetic */ void m4324j8() {
        hpd0 hpd0Var = CoreModule.c.f0.f1;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: jb */
    public static /* synthetic */ void m4327jb() {
        hpd0 hpd0Var = f2201i;
        boolean zBooleanValue = ((Boolean) hpd0Var.get()).booleanValue();
        hpd0Var.put(Boolean.valueOf(!zBooleanValue));
        if (zBooleanValue) {
            m3670Ej();
            lsi0.y("称赞Mock数据已删除");
        } else {
            m3928Qj();
            lsi0.y("称赞Mock数据已插入");
        }
    }

    /* JADX INFO: renamed from: jc */
    public static /* synthetic */ void m4328jc() {
        hpd0 hpd0Var = CoreModule.c.e0.N2;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: jd */
    public static /* synthetic */ void m4329jd() {
        ew40.m6339h().m6348f();
        lsi0.y("已修改");
    }

    /* JADX INFO: renamed from: jj */
    public static void m4335jj(ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("资料完整度", new d30() { // from class: l.ewc
            public final void call() {
                i0e.d(bVar.K1()).D(10).r("资料完成百分之多少").F(new e30() { // from class: l.mzc
                    public final void call(Object obj) {
                        wn90.F().o0((String) obj);
                    }
                }).n().show();
            }
        }));
    }

    /* JADX INFO: renamed from: jk */
    public static void m4336jk(final ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("新用户破冰新手引导", new d30() { // from class: l.mtc
            public final void call() {
                DebugUtil.m4668z0(arrayList, bVar);
            }
        }));
    }

    /* JADX INFO: renamed from: k2 */
    public static /* synthetic */ void m4340k2(Throwable th) {
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ void m4342k4() {
    }

    /* JADX INFO: renamed from: ka */
    public static /* synthetic */ void m4348ka() {
        hpd0 hpd0Var = CoreModule.c.f0.n1;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: kb */
    public static /* synthetic */ void m4349kb(b bVar, List list) {
        if (vwb.J(list)) {
            o8m.a().i = true;
            return;
        }
        com.p1.mobile.putong.core.newui.icebreak.a aVar = new com.p1.mobile.putong.core.newui.icebreak.a(bVar.K1());
        aVar.N(list);
        if (com.p1.mobile.android.ui.poplevel.a.p().I()) {
            com.p1.mobile.android.ui.poplevel.a.p().C(CorePopLevel.ICE_BREAK_OFFLINE, bVar.K1(), aVar, 20000);
        } else {
            wc80.e().q(uc80.a(aVar));
        }
    }

    /* JADX INFO: renamed from: kc */
    public static /* synthetic */ void m4350kc() {
        hpd0 hpd0Var = lra0.e;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: ke */
    public static /* synthetic */ void m4352ke(ArrayList arrayList, b bVar) {
        arrayList.clear();
        if (NullChecker.a(CoreModule.c.e0.C6)) {
            arrayList.add(vwb.Y("强制展示邀请认证样式的认证入口，当前：".concat(((Boolean) CoreModule.c.e0.C6.get()).booleanValue() ? "true" : "false"), new d30() { // from class: l.aad
                public final void call() {
                    DebugUtil.m4456p8();
                }
            }));
        }
        arrayList.add(vwb.Y("清除认证中心入口点击频控", new C3195k()));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: kg */
    public static /* synthetic */ void m4354kg(b bVar) {
        NewNewProfileCard newNewProfileCardD = bVar.A2().d();
        if (newNewProfileCardD instanceof NewNewProfileCard) {
            NewNewProfileCard newNewProfileCard = newNewProfileCardD;
            if (newNewProfileCard.q0()) {
                return;
            }
            newNewProfileCard.N3("newUser");
        }
    }

    /* JADX INFO: renamed from: ki */
    public static /* synthetic */ void m4356ki(b bVar) {
        PurchaseType purchaseType = PurchaseType.TYPE_YOUTH_VIP;
        new com.p1.mobile.putong.core.ui.purchase.mediator.c.a(bVar.K1(), purchaseType, "debug").g(fy80.p(purchaseType, purchaseType.getPrivilegeData(null), Privilege.youth_blind_box)).e(new g30() { // from class: l.wad
            /* JADX INFO: renamed from: a */
            public final void m10457a(Object obj, Object obj2, Object obj3) {
                lsi0.y("购买成功，立刻体验专属权益吧");
            }
        }).h();
    }

    /* JADX INFO: renamed from: kj */
    public static void m4357kj(ArrayList<j760<String, d30>> arrayList, final b bVar) {
        if (upa.P1()) {
            arrayList.add(vwb.Y("动态打招呼：首张用户卡片展示打招呼入口", new d30() { // from class: l.rtc
                public final void call() {
                    DebugUtil.m4015V1(bVar);
                }
            }));
            arrayList.add(vwb.Y("动态打招呼：首张用户卡片展示打招呼内容", new d30() { // from class: l.stc
                public final void call() {
                    DebugUtil.m4258g7(bVar);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: kk */
    public static void m4358kk(final ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("新用户快速指引", new d30() { // from class: l.ttc
            public final void call() {
                DebugUtil.m4431o5(arrayList, bVar);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m4359l() {
        CoreModule.c.m0.B1.put("");
        CoreModule.c.e0.f4.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m4360l0(b bVar) {
        OnlineMatchPushUser onlineMatchPushUser = new OnlineMatchPushUser();
        onlineMatchPushUser.name = "重生的小胖子";
        onlineMatchPushUser.userId = "349281368";
        CoreModule.c.e0.p9().fp().profileMiddle().formatted();
        onlineMatchPushUser.avatarUrl = "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2MlRQNldBSVFaM1ZRRFRPU01FSFdIS043Nk5RUTA0IiwidyI6MTk2MCwiaCI6MTk1OSwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjYxNzE0NDg5Nzk1MzUzMzg2ODAsImFiIjowfQ.jpg?format=128x128";
        onlineMatchPushUser.action = "";
        onlineMatchPushUser.gender = "female";
        onlineMatchPushUser.age = "10";
        onlineMatchPushUser.distance = 100;
        onlineMatchPushUser.userTagList = vwb.R(new String[]{"唱各萨达多个", "喜欢广场舞", "喜欢哈哈哈"}, new w9j() { // from class: l.g9c
            public final Object call(Object obj) {
                return DebugUtil.m3850N4((String) obj);
            }
        });
        QuickChatCardWrapper quickChatCardWrapper = new QuickChatCardWrapper(onlineMatchPushUser);
        c cVar = CoreModule.c;
        onlineMatchPushUser.user = cVar.e0.Pa(((CoreSuggested.UserInfo) ((PartialListOpt) cVar.m0.a0.e()).loaded.get(1)).id);
        xzc0.x0().B0(bVar.K1(), quickChatCardWrapper);
    }

    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ void m4361l1(b bVar) {
        String str = tbk.a.format(new Date());
        bVar.K1().getString(R.string.z1, str.substring(0, 4), str.substring(5, 7), str.substring(8, 10));
    }

    /* JADX INFO: renamed from: l2 */
    public static /* synthetic */ void m4362l2(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("探探认证引导Dlg 点击产生", new d30() { // from class: l.hlc
            public final void call() {
                zbi0.J(bVar.K1(), false, CoreModule.c.e0.p9());
            }
        }));
        arrayList.add(vwb.Y("探探认证能量提示Dlg 划卡产生", new d30() { // from class: l.nlc
            public final void call() {
                zbi0.M(bVar.K1());
            }
        }));
        arrayList.add(vwb.Y("升级实名认证弹窗", new d30() { // from class: l.olc
            public final void call() {
                b bVar2 = bVar;
                zbi0.L(bVar2.K1(), new d30() { // from class: l.d3d
                    public final void call() {
                        b bVar3 = bVar2;
                        bVar3.K1().startActivity(IntroductionAct.X1(bVar3.K1(), "", true));
                    }
                });
            }
        }));
        arrayList.add(vwb.Y("探探认证设置页开关提示", new d30() { // from class: l.plc
            public final void call() {
                zbi0.N(bVar.K1());
            }
        }));
        arrayList.add(vwb.Y("探探认证取消挽留", new d30() { // from class: l.qlc
            public final void call() {
                zbi0.I(bVar.K1());
            }
        }));
        arrayList.add(vwb.Y("探探认证结果（失败）", new d30() { // from class: l.rlc
            public final void call() {
                zbi0.P(bVar.K1(), StudentVerificationStatus.get("rejected"), StudentVerificationStatus.get("rejected"));
            }
        }));
        arrayList.add(vwb.Y("探探认证结果（认证中）", new d30() { // from class: l.slc
            public final void call() {
                zbi0.P(bVar.K1(), StudentVerificationStatus.get("pending"), StudentVerificationStatus.get("rejected"));
            }
        }));
        arrayList.add(vwb.Y("探探认证结果（成功）", new d30() { // from class: l.ulc
            public final void call() {
                zbi0.P(bVar.K1(), StudentVerificationStatus.get("verified"), StudentVerificationStatus.get("verified"));
            }
        }));
        arrayList.add(vwb.Y("探探认证结果（成功未激活）", new d30() { // from class: l.vlc
            public final void call() {
                zbi0.P(bVar.K1(), StudentVerificationStatus.get("verified"), StudentVerificationStatus.get("rejected"));
            }
        }));
        arrayList.add(vwb.Y("探探认证显示我的tab红点", new d30() { // from class: l.wlc
            public final void call() {
                CoreModule.c.M0.f3(true);
            }
        }));
        arrayList.add(vwb.Y("探探认证设置页显示气泡", new d30() { // from class: l.jlc
            public final void call() {
                DebugUtil.m4246fh();
            }
        }));
        arrayList.add(vwb.Y("探探认证右上角图标（我的信息）", new d30() { // from class: l.klc
            public final void call() {
                zbi0.O(bVar.K1(), true);
            }
        }));
        arrayList.add(vwb.Y("探探认证右上角图标（别人的信息）", new d30() { // from class: l.llc
            public final void call() {
                zbi0.O(bVar.K1(), false);
            }
        }));
        arrayList.add(vwb.Y("探探认证清空数据", new d30() { // from class: l.mlc
            public final void call() {
                DebugUtil.m3709Ge();
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ void m4363l3() {
        snm.f7404j = true;
        snm.f7401g = true;
        snm.f7402h = false;
    }

    /* JADX INFO: renamed from: l5 */
    public static /* synthetic */ void m4365l5() {
        hpd0 hpd0Var = lra0.P;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: l9 */
    public static /* synthetic */ void m4369l9(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("弹窗1", new d30() { // from class: l.xyc
            public final void call() {
                DebugUtil.m4079Y2(bVar);
            }
        }));
        arrayList.add(vwb.Y("弹窗2", new d30() { // from class: l.yyc
            public final void call() {
                new zd2(bVar.K1()).show();
            }
        }));
        arrayList.add(vwb.Y("插入卡片", new d30() { // from class: l.bzc
            public final void call() {
                DebugUtil.m4620wi();
            }
        }));
        arrayList.add(vwb.Y("清空", new d30() { // from class: l.czc
            public final void call() {
                DebugUtil.m4140b();
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: lc */
    public static /* synthetic */ void m4372lc() {
        hpd0 hpd0Var = CoreModule.c.e0.O2;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: ld */
    public static /* synthetic */ void m4373ld(String str) {
        w29 w29Var = CoreModule.c.H1;
        w29Var.Y = true;
        w29Var.Z = str;
    }

    /* JADX INFO: renamed from: le */
    public static /* synthetic */ void m4374le() {
        OnlineMatchMatchUser onlineMatchMatchUser = new OnlineMatchMatchUser();
        onlineMatchMatchUser.userId = CoreModule.H().userId();
        onlineMatchMatchUser.user = CoreModule.K().me_();
        com.p1.mobile.putong.core.ui.onlinematch.a.m0(onlineMatchMatchUser);
    }

    /* JADX INFO: renamed from: lf */
    public static /* synthetic */ void m4375lf() {
        myc0.d0().c0();
        lsi0.y("已清除");
    }

    /* JADX INFO: renamed from: lh */
    public static /* synthetic */ User m4377lh(User user) {
        User userClone = user.clone();
        userClone.profile.extensions.interest.tags.clear();
        return userClone.subtract(user);
    }

    /* JADX INFO: renamed from: li */
    public static /* synthetic */ void m4378li(b bVar) {
        CoreLikers.a aVar = new CoreLikers.a();
        aVar.d = new ArrayList();
        List<T> list = ((PartialListOpt) CoreModule.c.m0.a0.e()).loaded;
        for (int i = 0; i < 3; i++) {
            aVar.d.add(CoreModule.c.e0.Pa(((CoreSuggested.UserInfo) list.get(i)).id));
        }
        ok3.m8471J(bVar.K1(), 3, aVar);
    }

    /* JADX INFO: renamed from: lj */
    public static void m4379lj(ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("Facebook 绑定手机号", new d30() { // from class: l.qtc
            public final void call() {
                new ccn(bVar.K1()).m5924Z();
            }
        }));
    }

    /* JADX INFO: renamed from: lk */
    public static void m4380lk(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("好友上线提醒代发端内承接改版", new C3165c1(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m4381m(b bVar, Notification notification) {
        if (notification.j()) {
            lsi0.m("something wrong!");
            return;
        }
        if (bVar.A2().o().d().localRelationship == null) {
            Relationship relationship = new Relationship();
            relationship.id = bVar.A2().j().id;
            relationship.state = RelationshipStatus.get("liked");
            relationship.status = vwb.f0(new MatchFrom[]{MatchFrom.get("superLiked")});
            bVar.A2().o().d().localRelationship = relationship;
        } else {
            bVar.A2().o().d().localRelationship.status = vwb.f0(new MatchFrom[]{MatchFrom.get("superLiked")});
        }
        com.p1.mobile.putong.core.newui.home.c cVar = bVar.M;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m4382m0() {
        hpd0 hpd0Var = lra0.L;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: m1 */
    public static /* synthetic */ void m4383m1(Throwable th) {
    }

    /* JADX INFO: renamed from: m5 */
    public static /* synthetic */ void m4387m5(b bVar) {
        hpk0 hpk0Var = new hpk0(bVar.K1());
        hpk0Var.I(bVar.K1());
        hpk0Var.s(new d30() { // from class: l.w6d
            public final void call() {
                DebugUtil.m4590va();
            }
        });
        hdb0.c().i(hpk0Var);
    }

    /* JADX INFO: renamed from: m6 */
    public static /* synthetic */ void m4388m6() {
        hpd0 hpd0Var = lra0.O;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        CoreModule.c.e0.W0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: m7 */
    public static /* synthetic */ void m4389m7(String str) {
        try {
            CoreModule.c.f0.x1.put(Boolean.valueOf(Boolean.parseBoolean(str)));
        } catch (Exception e) {
            CrashHelper.c(e);
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: m8 */
    public static /* synthetic */ void m4390m8(String str, final b bVar) {
        Relationship relationship = new Relationship();
        relationship.state = RelationshipStatus.get("liked");
        relationship.status = vwb.f0(new MatchFrom[]{MatchFrom.get("superLiked")});
        y.i3(str, relationship).materialize().subscribe(mkd0.G(new e30() { // from class: l.ywc
            public final void call(Object obj) {
                DebugUtil.m4381m(bVar, (Notification) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m9 */
    public static /* synthetic */ void m4391m9(Act act) {
        CoreModule.c.m0.I2.onNext(j760.a(SwipeDirection.LEFT, (Object) null));
        m3822Li(act);
    }

    /* JADX INFO: renamed from: ma */
    public static /* synthetic */ void m4392ma(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("打开认证", new d30() { // from class: l.d8d
            public final void call() {
                DebugUtil.m4611w9(bVar);
            }
        }));
        arrayList.add(vwb.Y("打开认证中", new d30() { // from class: l.e8d
            public final void call() {
                DebugUtil.m4550te(bVar);
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: mb */
    public static /* synthetic */ rx.c m4393mb(User user) {
        return !NullChecker.a(user) ? rx.c.just(roj0.a) : CoreModule.c.e0.u9(user);
    }

    /* JADX INFO: renamed from: mc */
    public static /* synthetic */ void m4394mc(PurchaseType purchaseType, Act act, String str) {
    }

    /* JADX INFO: renamed from: mi */
    public static /* synthetic */ void m4400mi(b bVar) {
        User userClone = CoreModule.c.e0.p9().clone();
        ProfileCompletion profileCompletion = userClone.profile.extensions.profileCompletion;
        List list = Collections.EMPTY_LIST;
        profileCompletion.progress = vwb.c(list, VoiceCallStatus.finished);
        userClone.profile.extensions.profileCompletion.briefIntroduction = vwb.c(list, "我是一个up主");
        User userSubtract = userClone.subtract(CoreModule.c.e0.p9());
        if (NullChecker.a(userSubtract)) {
            bVar.K1().duringCreated(CoreModule.c.e0.u9(userSubtract)).subscribe(mkd0.H(new e30() { // from class: l.mmc
                public final void call(Object obj) {
                    lsi0.y(CoreModule.c.e0.p9().profile.extensions.profileCompletion.toJson());
                }
            }, new e30() { // from class: l.nmc
                public final void call(Object obj) {
                    lsi0.y(((Throwable) obj).getMessage());
                }
            }));
        }
    }

    /* JADX INFO: renamed from: mj */
    public static void m4401mj(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("字体粗细", new C3203m(bVar)));
    }

    /* JADX INFO: renamed from: mk */
    public static void m4402mk(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("认证引导", new C3225s1(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m4403n() {
        hpd0 hpd0Var = lra0.y;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        lra0.x.put(bool);
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m4404n0(b bVar) {
        pmp0 pmp0Var = new pmp0(bVar.K1());
        pmp0Var.m8783M((WechatNotifySetting) ((Optional) CoreModule.c.e0.K1.e()).get());
        pmp0Var.show();
    }

    /* JADX INFO: renamed from: n4 */
    public static /* synthetic */ void m4408n4() {
        CoreModule.c.g2.e3();
        lsi0.y("已重置");
    }

    /* JADX INFO: renamed from: n7 */
    public static /* synthetic */ void m4411n7() {
        CoreModule.c.y2.v3();
        lsi0.y("已重置");
    }

    /* JADX INFO: renamed from: n8 */
    public static /* synthetic */ void m4412n8(b bVar, String str) {
        if (TextUtils.isEmpty(str)) {
            osi0.b("请先输入跳转地址");
            return;
        }
        f2193a.put(str);
        Intent intentZ1 = WebViewAct.Z1(bVar.K1(), "美团h5", str);
        intentZ1.putExtra("AD_WebView", true);
        intentZ1.putExtra("is_mt_pay", true);
        bVar.K1().startActivity(intentZ1);
    }

    /* JADX INFO: renamed from: na */
    public static /* synthetic */ void m4414na(String str, int i, roj0 roj0Var) {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.id = str;
        CoreModule.c.m0.w6(userInfo, i);
    }

    /* JADX INFO: renamed from: nc */
    public static /* synthetic */ void m4416nc() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.AdCard;
        userInfo.id = "VirtualCard";
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        List listH = ic50.j().h();
        if (vwb.J(listH)) {
            return;
        }
        userInfo.extensionObject = listH.get(0);
        CoreModule.c.m0.w6(userInfo, 0);
        CoreModule.c.m0.S1.put(userInfo, 0);
    }

    /* JADX INFO: renamed from: ne */
    public static /* synthetic */ void m4418ne() {
        hpd0 hpd0Var = lra0.J;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: nf */
    public static /* synthetic */ void m4419nf() {
        com.p1.mobile.putong.core.newui.messages.a.f.put(Boolean.FALSE);
        CoreModule.c.e0.Q1.put(-1L);
    }

    /* JADX INFO: renamed from: nh */
    public static /* synthetic */ void m4421nh() {
        String str = "insert_see_myself_" + CoreModule.H().userId();
        Boolean bool = Boolean.FALSE;
        new hpd0(str, bool).put(bool);
        CoreModule.c.e0.P0.put(0L);
    }

    /* JADX INFO: renamed from: ni */
    public static /* synthetic */ void m4422ni() {
        hpd0 hpd0Var = h7j.d;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: nj */
    public static void m4423nj(final String str, Act act, final int i) {
        act.duringCreated(CoreModule.c.e0.W9(str)).subscribe(mkd0.H(new e30() { // from class: l.gbd
            public final void call(Object obj) {
                DebugUtil.m4414na(str, i, (roj0) obj);
            }
        }, new e30() { // from class: l.hbd
            public final void call(Object obj) {
                DebugUtil.m4383m1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: nk */
    public static void m4424nk(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("资料页体验优化", new C3219q1(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m4425o() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.AdCard;
        userInfo.id = "VirtualCard";
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        List listH = ic50.j().h();
        if (vwb.J(listH) || listH.size() <= 1) {
            return;
        }
        userInfo.extensionObject = (OMSAdCardInfo) listH.get(1);
        CoreModule.c.m0.w6(userInfo, 0);
        CoreModule.c.m0.S1.put(userInfo, 0);
    }

    /* JADX INFO: renamed from: o1 */
    public static /* synthetic */ void m4427o1(List list) {
        if (vwb.J(list)) {
            return;
        }
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.id = "VirtualCard";
        userInfo.extensionObject = list;
        userInfo.virtualCardType = VirtualCardType.IceBreakQuestionOfflineCard;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.c.m0.w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: o2 */
    public static /* synthetic */ void m4428o2(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("低价试用大页面", new d30() { // from class: l.h7d
            public final void call() {
                DebugUtil.m4262gb(bVar);
            }
        }));
        arrayList.add(vwb.Y("低价试用弹窗", new d30() { // from class: l.i7d
            public final void call() {
                DebugUtil.m3689Fg(bVar);
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: o3 */
    public static /* synthetic */ void m4429o3() {
        hpd0 hpd0Var = lra0.S;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: o5 */
    public static /* synthetic */ void m4431o5(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("快速指引", new d30() { // from class: l.e4d
            public final void call() {
                ke7.m7567o().m7573B(bVar.K1());
            }
        }));
        arrayList.add(vwb.Y("闪聊匹配快速指引", new d30() { // from class: l.f4d
            public final void call() {
                OnlineMatchManager.z().x(bVar.K1(), "planA");
            }
        }));
        arrayList.add(vwb.Y("附近动态快速指引", new d30() { // from class: l.g4d
            public final void call() {
                CoreModule.N().Bh(bVar.K1(), CoreModule.c.e0.p9().isFemale());
            }
        }));
        arrayList.add(vwb.Y("手势动画指引", new d30() { // from class: l.h4d
            public final void call() {
                DebugUtil.m4354kg(bVar);
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: o9 */
    public static /* synthetic */ void m4435o9(b bVar) {
        bVar.K1().startActivity(new Intent((Context) bVar.K1(), (Class<?>) OldInfoTransNewAct.class));
        bVar.K1().overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: oc */
    public static /* synthetic */ void m4438oc(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: oe */
    public static /* synthetic */ void m4440oe() {
        CoreModule.c.e2.R.clear();
        CoreModule.c.e2.S.clear();
        CoreModule.c.e2.b0.put(0);
    }

    /* JADX INFO: renamed from: oj */
    public static void m4445oj(final String str, Act act, final boolean z, final int i) {
        act.duringCreated(CoreModule.c.e0.W9(str)).subscribe(mkd0.H(new e30() { // from class: l.lbd
            public final void call(Object obj) {
                DebugUtil.m4473q3(str, z, i, (roj0) obj);
            }
        }, new e30() { // from class: l.mbd
            public final void call(Object obj) {
                DebugUtil.m4163c0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: ok */
    public static void m4446ok(long j) {
        zpd0 zpd0Var = new zpd0("use_first_login_local_time_" + qib0.c0.userId(), -1L);
        qib0.x0 = j;
        zpd0Var.put(Long.valueOf(j));
        qib0.Z0(true, false).materialize().first().subscribe(mkd0.H(new e30() { // from class: l.j9d
            public final void call(Object obj) {
                DebugUtil.m3955S4((Notification) obj);
            }
        }, new e30() { // from class: l.k9d
            public final void call(Object obj) {
                DebugUtil.m3845N((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m4448p0() {
        hpd0 hpd0Var = lra0.m0;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: p1 */
    public static /* synthetic */ void m4449p1() {
        if (((Long) x.R.get()).longValue() == 1) {
            x.R.put(10L);
        } else {
            x.R.put(1L);
        }
    }

    /* JADX INFO: renamed from: p2 */
    public static /* synthetic */ void m4450p2() {
        hpd0 hpd0Var = lra0.x;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        lra0.y.put(Boolean.valueOf(!((Boolean) lra0.x.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: p3 */
    public static /* synthetic */ void m4451p3() {
    }

    /* JADX INFO: renamed from: p5 */
    public static /* synthetic */ void m4453p5(b bVar) {
        PurchaseType purchaseType = PurchaseType.TYPE_PICKS_MEMBERSHIP;
        new com.p1.mobile.putong.core.ui.purchase.mediator.c.a(bVar.K1(), purchaseType, (String) null).g(fy80.j(purchaseType.getPrivilegeData(null), Privilege.picksMembership)).h();
    }

    /* JADX INFO: renamed from: p6 */
    public static /* synthetic */ void m4454p6() {
        hpd0 hpd0Var = CoreModule.c.m0.w0;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        CoreModule.c.e0.W0.put(bool);
    }

    /* JADX INFO: renamed from: p8 */
    public static /* synthetic */ void m4456p8() {
        hpd0 hpd0Var = CoreModule.c.e0.C6;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: p9 */
    public static /* synthetic */ void m4457p9() {
        List listJ = CoreModule.k.c.K().j();
        final GreetingSummary greetingSummaryNew_ = GreetingSummary.new_();
        greetingSummaryNew_.latestMessageId = ((DbObject) ((Message) listJ.get(0))).id;
        if (listJ.size() > 0) {
            e51.G(new Runnable() { // from class: l.s6d
                @Override // java.lang.Runnable
                public final void run() {
                    DebugUtil.m4609w7(greetingSummaryNew_);
                }
            });
        }
    }

    /* JADX INFO: renamed from: pa */
    public static /* synthetic */ void m4458pa() {
        hpd0 hpd0Var = lra0.l0;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        hpd0 hpd0Var2 = lra0.h0;
        Boolean bool = Boolean.FALSE;
        hpd0Var2.put(bool);
        lra0.i0.put(bool);
        lra0.j0.put(bool);
        lra0.k0.put(bool);
    }

    /* JADX INFO: renamed from: pb */
    public static /* synthetic */ void m4459pb() {
        Message messageNew_ = Message.new_();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("gameId", "dice");
            jSONObject.put("receiverTitle", "摇骰子游戏邀请");
            jSONObject.put("receiverSubtitle", "对方邀请你玩“掷骰子”游戏");
            jSONObject.put("buttonText", "加入游戏");
            messageNew_.msgData = jSONObject.toString(1);
            messageNew_.messageType = MessageType.get(MessageType.wanwan_invite);
            CoreModule.c.f0.o2.clear();
            CoreModule.c.f0.o2.add(messageNew_);
        } catch (JSONException e) {
            CrashHelper.c(e);
            aag0.a(e);
        }
    }

    /* JADX INFO: renamed from: pd */
    public static /* synthetic */ void m4461pd() {
    }

    /* JADX INFO: renamed from: ph */
    public static /* synthetic */ void m4465ph(b bVar) {
        List list = (List) CoreModule.c.j0.E4().e();
        m6h0.r(bVar.K1(), !vwb.J(list) ? (Merchandise) list.get(0) : null);
    }

    /* JADX INFO: renamed from: pj */
    public static void m4467pj(final String str, Act act) {
        act.duringCreated(CoreModule.c.e0.t9(str)).subscribe(mkd0.H(new e30() { // from class: l.sbd
            public final void call(Object obj) {
                DebugUtil.m3861Nf(str, (roj0) obj);
            }
        }, new e30() { // from class: l.tbd
            public final void call(Object obj) {
                DebugUtil.m4645y((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: pk */
    public static void m4468pk(ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("用户查询", new d30() { // from class: l.ktc
            public final void call() {
                i0e.d(bVar.K1()).r("属于UserId").F(new e30() { // from class: l.c8d
                    public final void call(Object obj) {
                        CoreModule.c.e0.Ka((String) obj).subscribe(mkd0.G(new DebugUtil.C3198k2()));
                    }
                }).n().show();
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m4470q0() {
        hpd0 hpd0Var = CoreModule.c.e0.G6;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: q1 */
    public static /* synthetic */ void m4471q1() {
        CoreModule.c.m0.V0.put(Boolean.TRUE);
        CoreModule.c.m0.W0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: q3 */
    public static /* synthetic */ void m4473q3(String str, boolean z, int i, roj0 roj0Var) {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.id = str;
        userInfo.setUserLikeMe(z);
        CoreModule.c.m0.w6(userInfo, i);
    }

    /* JADX INFO: renamed from: q4 */
    public static /* synthetic */ void m4474q4() {
        hpd0 hpd0Var = CoreModule.c.m0.F1;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: q6 */
    public static /* synthetic */ void m4476q6() {
        hpd0 hpd0Var = CoreModule.c.e0.n6;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: q7 */
    public static /* synthetic */ void m4477q7() {
    }

    /* JADX INFO: renamed from: qc */
    public static /* synthetic */ void m4482qc() {
    }

    /* JADX INFO: renamed from: qd */
    public static /* synthetic */ void m4483qd(b bVar) {
        b4h0 b4h0Var = new b4h0(bVar.K1());
        b4h0Var.show();
        g4h0.c(bVar.K1(), b4h0Var);
    }

    /* JADX INFO: renamed from: qe */
    public static /* synthetic */ void m4484qe(b bVar) {
        View viewInflate = LayoutInflater.from(bVar.K1()).inflate(f6c0.l4, (ViewGroup) null);
        qib0.G.O(viewInflate.findViewById(u4c0.u5), ((Media) CoreModule.c.e0.p9().picture(0)).url, 4, 100);
        viewInflate.findViewById(u4c0.Pd).setText("测试");
        SimplePushBubble simplePushBubbleS = new SimplePushBubble.a(bVar.K1(), viewInflate).u("" + System.currentTimeMillis()).w(30000).B(2).s();
        viewInflate.findViewById(u4c0.E0).setText("去聊聊");
        simplePushBubbleS.x(CorePopLevel.IMMERSION_SEND_MSG);
        hdb0.c().i(simplePushBubbleS);
    }

    /* JADX INFO: renamed from: qf */
    public static /* synthetic */ void m4485qf(b bVar) {
        Literatures literaturesNew_ = Literatures.new_();
        literaturesNew_.title = "小王子";
        literaturesNew_.f95id = "1";
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
        new g53().m6567F(bVar.K1(), "11111", "pageId", false, arrayList, arrayList2, new g53.C3332d("card", "both_like"), new C3168d0());
    }

    /* JADX INFO: renamed from: qj */
    public static void m4489qj(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("国际化-翁翁二楼", new C3200l0(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: qk */
    public static void m4490qk(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("推荐聊天室", new C3239x0(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m4491r() {
        hpd0 hpd0Var = CoreModule.c.m0.v1;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m4492r0() {
        hpd0 hpd0Var = CoreModule.c.e0.u2;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: r1 */
    public static /* synthetic */ void m4493r1() {
        String str = "core_greet_say_hi_gift_guide_is_never_show_" + CoreModule.H().userId();
        Boolean bool = Boolean.FALSE;
        new hpd0(str, bool).put(bool);
    }

    /* JADX INFO: renamed from: r3 */
    public static /* synthetic */ void m4495r3() {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.local_birthday_tip);
        CoreModule.c.f0.o2.clear();
        CoreModule.c.f0.o2.add(messageNew_);
    }

    /* JADX INFO: renamed from: r8 */
    public static /* synthetic */ void m4500r8(final ArrayList arrayList, final b bVar, final nt30 nt30Var) {
        arrayList.clear();
        arrayList.add(vwb.Y("隐身功能回收【汇总】", new d30() { // from class: l.nuc
            public final void call() {
                DebugUtil.m4212e5(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("See试用配对失效引导【汇总】", new d30() { // from class: l.ruc
            public final void call() {
                DebugUtil.m3996U3(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("一键配对【汇总】", new d30() { // from class: l.uuc
            public final void call() {
                DebugUtil.m3665Ee(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("闪聊优化三期【汇总】", new d30() { // from class: l.vuc
            public final void call() {
                DebugUtil.m4233f4(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("每日精选【汇总】", new d30() { // from class: l.wuc
            public final void call() {
                DebugUtil.m3774Jd(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("免费试用SVIP特权【汇总】", new d30() { // from class: l.xuc
            public final void call() {
                DebugUtil.m4667z(arrayList, nt30Var, bVar);
            }
        }));
        arrayList.add(vwb.Y("会员改版入口联动【汇总】", new d30() { // from class: l.yuc
            public final void call() {
                DebugUtil.m4523s9(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("插入一个see画像升级用户到see列表", new d30() { // from class: l.zuc
            public final void call() {
                sbe0.d().c(bVar.K1());
            }
        }));
        arrayList.add(vwb.Y("白金会员【汇总】", new d30() { // from class: l.avc
            public final void call() {
                DebugUtil.m4135ag(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("女性会员【汇总】", new d30() { // from class: l.bvc
            public final void call() {
                DebugUtil.m3567A4(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("青春专享会员【汇总】", new d30() { // from class: l.ouc
            public final void call() {
                DebugUtil.m3608C1(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("私人定制【汇总】", new d30() { // from class: l.puc
            public final void call() {
                DebugUtil.m3926Qh(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("VIP试用【汇总】", new d30() { // from class: l.quc
            public final void call() {
                DebugUtil.m4428o2(arrayList, bVar);
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: r9 */
    public static /* synthetic */ void m4501r9(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: ra */
    public static /* synthetic */ void m4502ra(b bVar) {
        vyc0.m10412s(bVar.g2(), "测试");
        vyc0.m10412s(bVar.g2(), "测试");
    }

    /* JADX INFO: renamed from: rd */
    public static /* synthetic */ void m4505rd(ArrayList arrayList, b bVar) {
        arrayList.clear();
        if (NullChecker.a(CoreModule.c.e0.G5)) {
            arrayList.add(vwb.Y("强制展示消息弱化提醒，当前".concat(((Boolean) CoreModule.c.e0.G5.get()).booleanValue() ? "true" : "false"), new C3190i2()));
            arrayList.add(vwb.Y("清除所有频控", new C3194j2()));
            bVar.K1().showDebugMenu(arrayList);
        }
    }

    /* JADX INFO: renamed from: rg */
    public static /* synthetic */ void m4508rg() {
        hpd0 hpd0Var = lsi0.a;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: rh */
    public static /* synthetic */ void m4509rh() {
        zxz.h().l();
        hpd0 hpd0Var = CoreModule.c.e0.d1;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        CoreModule.c.e0.e1.put(bool);
        CoreModule.c.b1.R.put(bool);
        CoreModule.c.b1.S.put(bool);
    }

    /* JADX INFO: renamed from: rj */
    public static void m4511rj(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("国际化-交友目的", new C3196k0(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: rk */
    public static void m4512rk(final ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("红点曝光优化", new d30() { // from class: l.gpc
            public final void call() {
                DebugUtil.m4315j(arrayList, bVar);
            }
        }));
    }

    /* JADX INFO: renamed from: s2 */
    public static /* synthetic */ void m4516s2(Throwable th) {
    }

    /* JADX INFO: renamed from: s3 */
    public static /* synthetic */ void m4517s3() {
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
            CoreModule.c.f0.o2.clear();
            CoreModule.c.f0.o2.add(messageNew_);
        } catch (JSONException e) {
            CrashHelper.c(e);
            aag0.a(e);
        }
    }

    /* JADX INFO: renamed from: s4 */
    public static /* synthetic */ void m4518s4(String str) {
        CoreModule.c.f0.J0.put(str);
        CoreModule.c.f0.H0.put(Long.valueOf(mqi0.o()));
        CoreModule.c.f0.I0.put(Long.valueOf(mqi0.o() + 300000));
    }

    /* JADX INFO: renamed from: s7 */
    public static /* synthetic */ void m4521s7() {
        hpd0 hpd0Var = CoreModule.c.e0.U4;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: s8 */
    public static /* synthetic */ void m4522s8() {
    }

    /* JADX INFO: renamed from: s9 */
    public static /* synthetic */ void m4523s9(ArrayList arrayList, b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("清除所有标记", new d30() { // from class: l.s7d
            public final void call() {
                TabUniteManager.m2267i().m2268h(TabUniteManager.BadgeIconType.NONE);
            }
        }));
        arrayList.add(vwb.Y("清除促销标记", new d30() { // from class: l.t7d
            public final void call() {
                TabUniteManager.m2267i().m2268h(TabUniteManager.BadgeIconType.PROMOTION);
            }
        }));
        arrayList.add(vwb.Y("清除See标记", new d30() { // from class: l.u7d
            public final void call() {
                TabUniteManager.m2267i().m2268h(TabUniteManager.BadgeIconType.SEE);
            }
        }));
        arrayList.add(vwb.Y("清除Boost标记", new d30() { // from class: l.v7d
            public final void call() {
                DebugUtil.m3944Re();
            }
        }));
        arrayList.add(vwb.Y("清除黑金会员标记", new d30() { // from class: l.w7d
            public final void call() {
                TabUniteManager.m2267i().m2268h(TabUniteManager.BadgeIconType.ODIAMOND);
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: sa */
    public static /* synthetic */ void m4524sa() {
        a6h0.a().put(0L);
        new zpd0("svip_trial_dlg_show" + CoreModule.H().userId(), -1L).put(0L);
        String str = "recall_dlg_show" + CoreModule.H().userId();
        Boolean bool = Boolean.TRUE;
        new hpd0(str, bool).put(bool);
        new uqd0("svip_year_prom_coupon_id" + CoreModule.H().userId(), "").put("");
        new uqd0("svip_6m_double11_prom_coupon_id" + CoreModule.H().userId(), "").put("");
    }

    /* JADX INFO: renamed from: sc */
    public static /* synthetic */ void m4526sc() {
        CoreModule.c.e0.q4.clear();
        CoreModule.c.e0.p4.clear();
    }

    /* JADX INFO: renamed from: sd */
    public static /* synthetic */ void m4527sd(nt30 nt30Var) {
        if (uq40.y(nt30Var.T4(), true)) {
            return;
        }
        nt30Var.G.onNext(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: sg */
    public static /* synthetic */ void m4530sg() {
        zl80.g().a();
        osi0.g("已清除");
    }

    /* JADX INFO: renamed from: si */
    public static /* synthetic */ void m4532si(b bVar) {
        w6p.a aVar = new w6p.a(bVar.K1());
        ArrayList arrayListF0 = vwb.f0(new PurchaseType[]{PurchaseType.TYPE_GET_VIP, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE});
        Privilege privilege = Privilege.vip_location;
        aVar.i(arrayListF0, vwb.f0(new Privilege[]{privilege, privilege})).d("debug").j(0).k();
    }

    /* JADX INFO: renamed from: sj */
    public static void m4533sj(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("Intl-ILIke", new C3172e0(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: sk */
    public static void m4534sk() {
        e51.M(new Runnable() { // from class: l.m9c
            @Override // java.lang.Runnable
            public final void run() {
                DebugUtil.m3947Rh();
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m4535t(PurchaseType purchaseType, Act act, String str) {
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m4536t0() {
        hpd0 hpd0Var = CoreModule.c.e0.V4;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: t1 */
    public static /* synthetic */ void m4537t1() {
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < 7; i++) {
            arrayList.add(i + "");
        }
        sa40.o().P(arrayList);
    }

    /* JADX INFO: renamed from: t2 */
    public static /* synthetic */ void m4538t2() {
        CoreModule.c.e0.U0.put(0);
        CoreModule.c.f0.mp(true);
    }

    /* JADX INFO: renamed from: t3 */
    public static /* synthetic */ String m4539t3(OpenSdkCodeAuth openSdkCodeAuth) {
        return (!NullChecker.a(openSdkCodeAuth) || TextUtils.isEmpty(openSdkCodeAuth.code)) ? "" : openSdkCodeAuth.code;
    }

    /* JADX INFO: renamed from: t4 */
    public static /* synthetic */ void m4540t4(final b bVar) {
        uq40.G(bVar.K1(), true);
        e51.H(bVar.K1(), new Runnable() { // from class: l.xvc
            @Override // java.lang.Runnable
            public final void run() {
                uq40.G(bVar.K1(), true);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: t5 */
    public static /* synthetic */ void m4541t5(b bVar) {
        PurchaseType purchaseType = PurchaseType.TYPE_O_DIAMOND;
        new com.p1.mobile.putong.core.ui.purchase.mediator.c.a(bVar.K1(), purchaseType, (String) null).g(fy80.i(purchaseType.getPrivilegeData(null), (Privilege) null)).h();
    }

    /* JADX INFO: renamed from: t6 */
    public static /* synthetic */ void m4542t6(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("春节活动清理弹框：", new d30() { // from class: l.i4d
            public final void call() {
                DebugUtil.m4526sc();
            }
        }));
        arrayList.add(vwb.Y("实验开关：" + CoreModule.c.e0.c4.get(), new d30() { // from class: l.t4d
            public final void call() {
                DebugUtil.m4257g6();
            }
        }));
        arrayList.add(vwb.Y("清理首页保存的已经推荐的数据：", new d30() { // from class: l.u4d
            public final void call() {
                CoreModule.c.m0.q1.clear();
            }
        }));
        arrayList.add(vwb.Y("清理 插入特定的想结婚用", new d30() { // from class: l.v4d
            public final void call() {
                DebugUtil.m4359l();
            }
        }));
        arrayList.add(vwb.Y("插入特定的想结婚用：", new d30() { // from class: l.w4d
            public final void call() {
                i0e.d(bVar.K1()).D(10).r("输入插入Userid").F(new e30() { // from class: l.f9c
                    public final void call(Object obj) {
                        CoreModule.c.m0.B1.put((String) obj);
                    }
                }).n().show();
            }
        }));
        arrayList.add(vwb.Y("打开交友目的选择", new d30() { // from class: l.x4d
            public final void call() {
                b bVar2 = bVar;
                e51.H(bVar2.K1(), new DebugUtil.RunnableC3158a2(new v0x(bVar2.K1(), "")), 1000L);
            }
        }));
        arrayList.add(vwb.Y("切换弹框", new d30() { // from class: l.y4d
            public final void call() {
                e51.H(bVar.K1(), new DebugUtil.RunnableC3162b2(), 1000L);
            }
        }));
        arrayList.add(vwb.Y("Debug模式控制入口：" + CoreModule.c.e0.a4.get(), new d30() { // from class: l.a5d
            public final void call() {
                DebugUtil.m4658yc();
            }
        }));
        arrayList.add(vwb.Y("侧边开", new d30() { // from class: l.b5d
            public final void call() {
                CoreModule.c.e0.E1.onNext(Boolean.TRUE);
            }
        }));
        arrayList.add(vwb.Y("prfile页", new d30() { // from class: l.c5d
            public final void call() {
                b bVar2 = bVar;
                bVar2.D6(MarryProfileEditAct.Y1(bVar2.K1()));
            }
        }));
        arrayList.add(vwb.Y("进入落地页", new d30() { // from class: l.j4d
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().startActivity(new Intent((Context) bVar2.K1(), (Class<?>) MarryInfoAuditStatusAct.class));
            }
        }));
        arrayList.add(vwb.Y("交友目的", new d30() { // from class: l.k4d
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().startActivity(new Intent((Context) bVar2.K1(), (Class<?>) MarryStatusSetAct.class));
            }
        }));
        arrayList.add(vwb.Y("跳转连续编辑页 null测试", new d30() { // from class: l.l4d
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().startActivity(MarryEditProfileSeriesAct.Y1(bVar2.K1(), CoreModule.K().me_(), (ArrayList) null, true, false, false));
            }
        }));
        arrayList.add(vwb.Y("插入广告卡", new d30() { // from class: l.m4d
            public final void call() {
                bVar.K1().postDelayed(new Runnable() { // from class: l.kad
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m4237f8();
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.Y("插入四选一广告卡", new d30() { // from class: l.n4d
            public final void call() {
                bVar.K1().postDelayed(new Runnable() { // from class: l.dad
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m4240fb();
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.Y("清空四选一数据", new d30() { // from class: l.p4d
            public final void call() {
                DebugUtil.m3889P1();
            }
        }));
        arrayList.add(vwb.Y("四选一变身小姐姐:" + CoreModule.c.e0.U4.get(), new d30() { // from class: l.q4d
            public final void call() {
                DebugUtil.m4521s7();
            }
        }));
        arrayList.add(vwb.Y("忽略支付" + f2198f, new d30() { // from class: l.r4d
            public final void call() {
                DebugUtil.f2198f = !DebugUtil.f2198f;
            }
        }));
        arrayList.add(vwb.Y("清空标记数据", new d30() { // from class: l.s4d
            public final void call() {
                DebugUtil.m4678za();
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: tc */
    public static /* synthetic */ void m4548tc() {
        hpd0 hpd0Var = CoreModule.c.f0.Z0;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: te */
    public static /* synthetic */ void m4550te(b bVar) {
        final VerificationNetworkData verificationNetworkDataNew_ = VerificationNetworkData.new_();
        verificationNetworkDataNew_.meta.code = 400314;
        verificationNetworkDataNew_.data.status = 2;
        puk0.e().b().onNext(verificationNetworkDataNew_);
        bVar.K1().postDelayed(new Runnable() { // from class: l.ibd
            @Override // java.lang.Runnable
            public final void run() {
                puk0.e().b().onNext(verificationNetworkDataNew_);
            }
        }, 5000L);
    }

    /* JADX INFO: renamed from: tg */
    public static /* synthetic */ void m4552tg(String str) {
        try {
            CoreModule.c.e0.F6.put(Integer.valueOf(Integer.parseInt(str)));
        } catch (NumberFormatException unused) {
            lsi0.j("输入错误");
        }
    }

    /* JADX INFO: renamed from: th */
    public static /* synthetic */ void m4553th() {
        tpd0 tpd0Var = CoreModule.c.e0.k6;
        tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
    }

    /* JADX INFO: renamed from: ti */
    public static /* synthetic */ void m4554ti(boolean z, b bVar, String str) {
        CoreModule.c.x1.R = new SeeBlindBoxEnvelope();
        CoreModule.c.x1.R.nullCheck();
        User userMe_ = CoreModule.K().me_();
        if (!TextUtils.isEmpty(str)) {
            ((DbObject) userMe_).id = str;
            if (CoreModule.c.e0.Pa(str) == null) {
                lsi0.j("输入的uid 本地数据库没有");
            }
        }
        CoreModule.c.x1.R.data.users.add(userMe_);
        if (z) {
            bVar.K1().duringCreated(CoreModule.c.e0.Ka(str)).observeOn(jo0.a()).subscribe(mkd0.G(new C3224s0(bVar)));
        } else {
            m7e0.b(bVar);
        }
    }

    /* JADX INFO: renamed from: tj */
    public static void m4555tj(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("国际化-已读回执", new C3176f0(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: tk */
    public static void m4556tk(final ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("see toast trace debug", new d30() { // from class: l.glc
            public final void call() {
                DebugUtil.m4647y1(arrayList, bVar);
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m4558u0(CounterLikeLimit counterLikeLimit, final b bVar, User user, Dialog dialog, View view, int i, CharSequence charSequence) {
        zvf0.u("e_debug_tool", "p_debug_tool_dialog_view", new j760[]{vwb.Y("debug_tool_name", charSequence)});
        switch (i) {
            case 1:
                new RunnableC3226t(counterLikeLimit, bVar).run();
                break;
            case QuickChatCardWrapper.QuickChatCardType.PEI_LIAO /* 3 */:
                CoreDlg.m2434y1(bVar.K1(), CoreModule.c.e0.p9(), false, new Runnable() { // from class: l.m5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m3575Ac(bVar);
                    }
                }, new Runnable() { // from class: l.q5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m4009Ug();
                    }
                });
                break;
            case 4:
                CoreDlg.m2434y1(bVar.K1(), CoreModule.c.e0.p9(), true, new Runnable() { // from class: l.r5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m3720H3(bVar);
                    }
                }, new Runnable() { // from class: l.s5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m4052Wh();
                    }
                });
                break;
            case CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE /* 5 */:
                ok3.m8468G(bVar.K1(), true, "kingty", CoreModule.c.o3().superLikeLimit.remainToday() + "", true, new Runnable() { // from class: l.t5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar.A2().A(SwipeDirection.UP);
                    }
                }, new Runnable() { // from class: l.u5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m4482qc();
                    }
                });
                break;
            case 6:
                ok3.m8468G(bVar.K1(), false, "kingty", CoreModule.c.o3().superLikeLimit.remainToday() + "", true, new Runnable() { // from class: l.w5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar.A2().A(SwipeDirection.UP);
                    }
                }, new Runnable() { // from class: l.x5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m3677F4();
                    }
                });
                break;
            case 8:
                com.p1.mobile.putong.core.ui.purchase.c.L1(bVar.K1(), "p_home,expired_vip", (Privilege) null, (d30) null, (d30) null, true);
                break;
            case 12:
                com.p1.mobile.putong.core.ui.purchase.c.J1(bVar.K1(), (String) null, Privilege.vip_super_like);
                break;
            case 13:
                com.p1.mobile.putong.core.ui.purchase.c.F1(bVar.K1(), (String) null);
                break;
            case 14:
                ark.m5556T0(bVar.K1());
                break;
            case 15:
                ark.m5560V0(bVar.K1(), true, user.fp(), bVar.K1().string(R.string.Ik), new Runnable() { // from class: l.y5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        b bVar2 = bVar;
                        bVar2.q2().startActivityForResult(MediaPickerAct.X1(bVar2.K1(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.y0() - t100.d(40.0f)).build()).withFromType(1).build()), 19);
                    }
                });
                break;
            case 16:
                bVar.C6();
                break;
            case 17:
                bVar.K1().dialog().F(bVar.e2(bVar.K1().getString(R.string.H0) + ((String) CoreModule.c.P2.get()) + bVar.K1().getString(R.string.G0))).m0(bVar.K1().getString(R.string.c)).v0(bVar.K1().getString(R.string.z), new Runnable() { // from class: l.z5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        b bVar2 = bVar;
                        bVar2.D6(StudentInfoAct.m1784V1(bVar2.K1(), "Chanel6.SchoolIdentifyPage.Shown", false));
                    }
                }).z0();
                break;
            case 18:
                bVar.q2().w4(MatchAct.e2(bVar.K1(), vwb.f0(new String[]{((DbObject) user).id}), 0, new ArrayList()), new MatchAct.b());
                break;
            case 21:
                bVar.t6();
                break;
            case 22:
                lsi0.r(NotificationStatus.removed);
                break;
            case 23:
                ark.m5560V0(bVar.K1(), true, user.fp(), bVar.K1().string(R.string.m), null);
                break;
            case 29:
                ok3.m8470I(bVar.K1(), 3, vwb.f0(new String[]{"http://cloud.staging1.p1staff.com/v1/images/eyJpZCI6IktVSldUR0tCQU9HU1JXQklRQ1FPUlhWUVE2R0xEWiIsInciOjk2MCwiaCI6OTYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NzgyMjA1OTUzOTczMzQ5NjYxOCwiYWIiOjB9", "http://cloud.staging1.p1staff.com/v1/images/eyJpZCI6IkJONk1QNk9CN0RJUTNaVFdYQTVKWVE0MjRLVlBSQSIsInciOjU4NywiaCI6NTg3LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTQ1NzkxNTcxOTgwMzQwMTg5MTksImFiIjowfQ", "http://cloud.staging1.p1staff.com/v1/images/eyJpZCI6IjJXVk8ySEJUR0xHR1VLTU1KR0JBSlA3QVJSWU5VRyIsInciOjc1MCwiaCI6NzUwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTI4MzY5ODM3MDc4MjEzMjE0ODJ"}));
                break;
            case 30:
                C3121a.m2899j();
                C3121a.m2900q(bVar.K1(), new Runnable() { // from class: l.n5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m4114Zg();
                    }
                }, new Runnable() { // from class: l.o5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m3835Ma();
                    }
                });
                break;
            case 31:
                e9n.m6262D(bVar.K1(), "", "homePage");
                break;
            case 33:
                new dej().j(bVar.K1(), CoreModule.c.e0.p9());
                break;
            case 34:
                e9n.m6259A(bVar.K1(), PurchaseType.TYPE_GET_LIKERS, "");
                break;
            case 35:
                e9n.m6261C(bVar.K1(), bVar.K1().string(R.string.jm), bVar.K1().string(R.string.im), bVar.K1().string(R.string.gm), new Runnable() { // from class: l.p5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        b bVar2 = bVar;
                        bVar2.K1().startActivity(NewMainAct.M5(bVar2.K1(), NavigationIntent.get("setting")));
                    }
                });
                break;
        }
    }

    /* JADX INFO: renamed from: u3 */
    public static /* synthetic */ void m4561u3(b bVar) {
        View viewInflate = LayoutInflater.from(bVar.K1()).inflate(f6c0.l4, (ViewGroup) null);
        qib0.G.O(viewInflate.findViewById(u4c0.u5), ((Media) CoreModule.c.e0.p9().picture(0)).url, 4, 100);
        viewInflate.findViewById(u4c0.Pd).setText("测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试");
        SimplePushBubble simplePushBubbleS = new SimplePushBubble.a(bVar.K1(), viewInflate).u("" + System.currentTimeMillis()).w(30000).B(2).s();
        viewInflate.findViewById(u4c0.E0).setText("去聊聊");
        simplePushBubbleS.x(CorePopLevel.IMMERSION_SEND_MSG);
        hdb0.c().i(simplePushBubbleS);
    }

    /* JADX INFO: renamed from: u6 */
    public static /* synthetic */ void m4564u6(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: u7 */
    public static /* synthetic */ void m4565u7() {
        CoreModule.c.e0.w1.put(0L);
        CoreModule.c.e0.x1.put(0L);
        CoreModule.c.f0.gn();
    }

    /* JADX INFO: renamed from: u9 */
    public static /* synthetic */ void m4567u9() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.UndoGuideCard;
        userInfo.id = "VirtualCard";
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.c.m0.w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: ua */
    public static /* synthetic */ void m4568ua() {
        String str = BifrostLayout.c;
        ConnectivityReceiver.i();
    }

    /* JADX INFO: renamed from: ub */
    public static /* synthetic */ void m4569ub() {
        hpd0 hpd0Var = lra0.y;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        lra0.x.put(Boolean.valueOf(!((Boolean) lra0.y.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: uc */
    public static /* synthetic */ void m4570uc() {
        hpd0 hpd0Var = lra0.c;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: ue */
    public static /* synthetic */ void m4572ue() {
        hpd0 hpd0Var = CoreModule.c.e0.h6;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: uf */
    public static /* synthetic */ void m4573uf() {
        PartialListOpt partialListOpt = (PartialListOpt) CoreModule.c.m0.a0.e();
        if (partialListOpt == null || vwb.J(partialListOpt.loaded)) {
            return;
        }
        for (T t : partialListOpt.loaded) {
            if (t.ussTags == null) {
                t.ussTags = UssTags.new_();
            }
            t.ussTags.cardStyle = "likeSupport";
        }
        CoreModule.c.m0.a0.onNext(partialListOpt);
    }

    /* JADX INFO: renamed from: uj */
    public static void m4577uj(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("国际化 会员购买挽回弹窗", new C3184h0(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: uk */
    public static void m4578uk(final Act act) {
        i0e.d(act).D(10).r("输入插入Userid").F(new e30() { // from class: l.k6d
            public final void call(Object obj) {
                e51.H(act, new Runnable() { // from class: l.v8c
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m4373ld(str);
                    }
                }, 1000L);
            }
        }).n().show();
    }

    /* JADX INFO: renamed from: v1 */
    public static /* synthetic */ void m4581v1(String str) {
        try {
            CoreModule.c.e0.t2.put(Double.valueOf(Double.parseDouble(str)));
        } catch (Exception e) {
            CrashHelper.c(e);
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: v4 */
    public static /* synthetic */ void m4584v4() {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.system_reminder);
        MessageAdditionalData messageAdditionalDataNew_ = MessageAdditionalData.new_();
        messageNew_.additionalData = messageAdditionalDataNew_;
        messageAdditionalDataNew_.systemReminder = SystemReminder.new_();
        messageNew_.additionalData.systemReminder.icon = "https://auto.tancdn.com/v1/images/eyJpZCI6IlpMWEZNRjQ1NEFDVlRSUjNWN0hDQlRPRjVGQTcyNzE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NDM3MjA2NzE3MTA4NzkyNTg4fQ.png";
        messageNew_.value = "好友上线了";
        CoreModule.c.f0.o2.clear();
        CoreModule.c.f0.o2.add(messageNew_);
    }

    /* JADX INFO: renamed from: v6 */
    public static /* synthetic */ void m4586v6(b bVar) {
        PurchaseType purchaseType = PurchaseType.TYPE_PICKS_MEMBERSHIP;
        ArrayList<Privilege> privilegeData = purchaseType.getPrivilegeData(null);
        Privilege privilege = Privilege.picksMembership;
        new com.p1.mobile.putong.core.ui.purchase.b.d(bVar.K1()).m(purchaseType, privilege).k(fy80.j(privilegeData, privilege)).p();
    }

    /* JADX INFO: renamed from: v7 */
    public static /* synthetic */ void m4587v7(b bVar) {
        bVar.k6();
        CoreModule.c.e0.P5.put(0L);
        CoreModule.c.e0.O5.put(0);
    }

    /* JADX INFO: renamed from: v8 */
    public static /* synthetic */ void m4588v8(Throwable th) {
    }

    /* JADX INFO: renamed from: v9 */
    public static /* synthetic */ void m4589v9() {
        hpd0 hpd0Var = lra0.K;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: va */
    public static /* synthetic */ void m4590va() {
    }

    /* JADX INFO: renamed from: vd */
    public static /* synthetic */ void m4593vd() {
        hpd0 hpd0Var = CoreModule.c.e0.H6;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: ve */
    public static /* synthetic */ void m4594ve(b bVar) {
        q3h0.C3407b c3407b = new q3h0.C3407b();
        c3407b.m8907a(3);
        c3407b.m8909c(bVar.K1());
    }

    /* JADX INFO: renamed from: vg */
    public static /* synthetic */ void m4596vg() {
        hpd0 hpd0Var = CoreModule.c.e0.W0;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        CoreModule.c.m0.w0.put(bool);
    }

    /* JADX INFO: renamed from: vh */
    public static /* synthetic */ void m4597vh() {
        hpd0 hpd0Var = CoreModule.c.m0.t1;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: vj */
    public static void m4599vj(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("国际化 tribe", new C3192j0(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: vk */
    public static void m4600vk(b bVar) {
        View viewInflate = LayoutInflater.from(bVar.C0()).inflate(f6c0.I8, (ViewGroup) null);
        View decorView = bVar.K1().getWindow().getDecorView();
        if (decorView instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            layoutParams.bottomMargin = t100.d(150.0f);
            ((FrameLayout) decorView).addView(viewInflate, layoutParams);
            ((PopDebugLayout) viewInflate).setMainViewModel(bVar);
        }
    }

    /* JADX INFO: renamed from: w1 */
    public static /* synthetic */ void m4603w1(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: w5 */
    public static /* synthetic */ void m4607w5() {
    }

    /* JADX INFO: renamed from: w7 */
    public static /* synthetic */ void m4609w7(GreetingSummary greetingSummary) {
        greetingSummary.unseen = 0;
        greetingSummary.latestTime = mqi0.o();
        greetingSummary.latestUserId = ((DbObject) CoreModule.c.e0.p9()).id;
        CoreModule.c.r0.d0.onNext(greetingSummary);
    }

    /* JADX INFO: renamed from: w8 */
    public static /* synthetic */ void m4610w8() {
        hpd0 hpd0Var = CoreModule.c.e0.j6;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: w9 */
    public static /* synthetic */ void m4611w9(b bVar) {
        final VerificationNetworkData verificationNetworkDataNew_ = VerificationNetworkData.new_();
        verificationNetworkDataNew_.meta.code = 400314;
        verificationNetworkDataNew_.data.status = 1;
        puk0.e().b().onNext(verificationNetworkDataNew_);
        bVar.K1().postDelayed(new Runnable() { // from class: l.bad
            @Override // java.lang.Runnable
            public final void run() {
                puk0.e().b().onNext(verificationNetworkDataNew_);
            }
        }, 5000L);
    }

    /* JADX INFO: renamed from: wb */
    public static /* synthetic */ void m4613wb(ArrayList arrayList, b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("消息红点脱敏实验一：" + CoreModule.c.f0.n1.get(), new d30() { // from class: l.xlc
            public final void call() {
                DebugUtil.m4348ka();
            }
        }));
        arrayList.add(vwb.Y("消息红点脱敏实验二：" + CoreModule.c.f0.o1.get(), new d30() { // from class: l.ylc
            public final void call() {
                DebugUtil.m3623Cg();
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: wd */
    public static /* synthetic */ void m4615wd(b bVar) {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.SuperlikeGuideCard;
        userInfo.id = "VirtualCard";
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        e51.H(bVar.K1(), new Runnable() { // from class: l.l0d
            @Override // java.lang.Runnable
            public final void run() {
                ezc0.i0().j0();
            }
        }, 2000L);
    }

    /* JADX INFO: renamed from: wh */
    public static /* synthetic */ void m4619wh() {
    }

    /* JADX INFO: renamed from: wi */
    public static /* synthetic */ void m4620wi() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.BarLoverGuideCard;
        userInfo.id = "VirtualCard";
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.c.m0.w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: wj */
    public static void m4621wj(ArrayList<j760<String, d30>> arrayList, b bVar) {
        arrayList.add(vwb.Y("国际化 会员升级", new C3188i0(arrayList, bVar)));
    }

    /* JADX INFO: renamed from: wk */
    public static void m4622wk(final Act act) {
        i0e.d(act).D(10).r("输入插入Userid").F(new e30() { // from class: l.yvc
            public final void call(Object obj) {
                Act act2 = act;
                e51.H(act2, new Runnable() { // from class: l.f0d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m4423nj(str, act2, 0);
                    }
                }, 1000L);
            }
        }).n().show();
    }

    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ void m4625x1() {
        hpd0 hpd0Var = CoreModule.c.e0.z4;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: x2 */
    public static /* synthetic */ void m4626x2(b bVar) {
        m4075Xj(bVar.K1(), true);
        m4075Xj(bVar.K1(), false);
    }

    /* JADX INFO: renamed from: x3 */
    public static /* synthetic */ void m4627x3() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.FemaleVerificationGuideCard;
        userInfo.id = "VirtualCard";
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.c.m0.w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: x7 */
    public static /* synthetic */ void m4631x7() {
        hpd0 hpd0Var = CoreModule.c.z2.g0;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: x8 */
    public static /* synthetic */ void m4632x8() {
        snm.f7404j = true;
        snm.f7401g = false;
        snm.f7402h = false;
    }

    /* JADX INFO: renamed from: x9 */
    public static /* synthetic */ void m4633x9(ArrayList arrayList, b bVar) {
        arrayList.clear();
        final ConversationCounterTypeSp conversationCounterTypeSp = ConversationCounterTypeSp.aEmojiIceBreakingNoReplyTime;
        Objects.requireNonNull(conversationCounterTypeSp);
        final d30 d30Var = new d30() { // from class: l.e3d
            public final void call() {
                conversationCounterTypeSp.clear();
            }
        };
        arrayList.add(vwb.Y("（同一个对话一天内只展示一次）b 类型 = " + conversationCounterTypeSp, d30Var));
        final ConversationCounterTypeSp conversationCounterTypeSp2 = ConversationCounterTypeSp.aEmojiIceBreakingMessageTimeLimitTime;
        Objects.requireNonNull(conversationCounterTypeSp2);
        final d30 d30Var2 = new d30() { // from class: l.e3d
            public final void call() {
                conversationCounterTypeSp2.clear();
            }
        };
        arrayList.add(vwb.Y("（同一个对话一天内只展示一次）c 类型 = " + conversationCounterTypeSp2, d30Var2));
        final d30 d30Var3 = new d30() { // from class: l.f3d
            public final void call() {
                CoreModule.c.f0.M0.put(0L);
            }
        };
        StringBuilder sb = new StringBuilder("破冰表情 对方发过消息，但我方没有发过消息类型上次展示时间 (b类型) = ");
        SimpleDateFormat simpleDateFormat = mqi0.f;
        sb.append(simpleDateFormat.format(CoreModule.c.f0.M0.get()));
        arrayList.add(vwb.Y(sb.toString(), d30Var3));
        final d30 d30Var4 = new d30() { // from class: l.i3d
            public final void call() {
                CoreModule.c.f0.N0.put(0);
            }
        };
        arrayList.add(vwb.Y("对方发过消息，但我方没有发过消息类型同一天展示次数 (b类型)  = " + CoreModule.c.f0.N0.get(), d30Var4));
        final d30 d30Var5 = new d30() { // from class: l.j3d
            public final void call() {
                CoreModule.c.f0.O0.put(0L);
            }
        };
        arrayList.add(vwb.Y("破冰表情 无未读且最后一条消息距现在超过 3 天类型上次展示时间 (c类型) = " + simpleDateFormat.format(CoreModule.c.f0.O0.get()), d30Var5));
        final d30 d30Var6 = new d30() { // from class: l.k3d
            public final void call() {
                CoreModule.c.f0.P0.put(0);
            }
        };
        arrayList.add(vwb.Y("破冰表情 无未读且最后一条消息距现在超过 3 天类型上次展示次数 (c类型) = " + CoreModule.c.f0.P0.get(), d30Var6));
        arrayList.add(vwb.Y("一键全部置空", new d30() { // from class: l.l3d
            public final void call() {
                DebugUtil.m4198dd(d30Var, d30Var2, d30Var3, d30Var4, d30Var5, d30Var6);
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: xa */
    public static /* synthetic */ void m4634xa() {
        hpd0 hpd0Var = CoreModule.c.H1.g0;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: xd */
    public static /* synthetic */ void m4637xd(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("购买对话框-VIP", new d30() { // from class: l.m0d
            public final void call() {
                new com.p1.mobile.putong.core.ui.purchase.mediator.c.a(bVar.K1(), PurchaseType.TYPE_GET_VIP, (String) null).h();
            }
        }));
        arrayList.add(vwb.Y("购买对话框-SVIP", new d30() { // from class: l.q0d
            public final void call() {
                DebugUtil.m3986Te(bVar);
            }
        }));
        arrayList.add(vwb.Y("购买对话框-黑金", new d30() { // from class: l.r0d
            public final void call() {
                DebugUtil.m4541t5(bVar);
            }
        }));
        arrayList.add(vwb.Y("购买对话框-白金", new d30() { // from class: l.t0d
            public final void call() {
                DebugUtil.m3919Qa(bVar);
            }
        }));
        arrayList.add(vwb.Y("购买对话框-加速配对", new d30() { // from class: l.u0d
            public final void call() {
                new com.p1.mobile.putong.core.ui.purchase.mediator.c.a(bVar.K1(), PurchaseType.TYPE_GET_ACCELERATE_PAIRING, (String) null).h();
            }
        }));
        arrayList.add(vwb.Y("购买对话框-SVIP精选", new d30() { // from class: l.v0d
            public final void call() {
                DebugUtil.m3664Ed(bVar);
            }
        }));
        arrayList.add(vwb.Y("购买对话框-精选", new d30() { // from class: l.w0d
            public final void call() {
                DebugUtil.m4453p5(bVar);
            }
        }));
        arrayList.add(vwb.Y("购买对话框-女性会员", new d30() { // from class: l.x0d
            public final void call() {
                DebugUtil.m4087Ya(bVar);
            }
        }));
        arrayList.add(vwb.Y("购买对话框-VIP+SVIP-默认VIP", new d30() { // from class: l.y0d
            public final void call() {
                DebugUtil.m3635D6(bVar);
            }
        }));
        arrayList.add(vwb.Y("购买对话框-VIP+SVIP-默认SVIP", new d30() { // from class: l.z0d
            public final void call() {
                DebugUtil.m4303i8(bVar);
            }
        }));
        arrayList.add(vwb.Y("购买对话框-SVIP+ODiamond", new d30() { // from class: l.n0d
            public final void call() {
                DebugUtil.m3783K0(bVar);
            }
        }));
        arrayList.add(vwb.Y("VIP升级SVIP弹窗New", new d30() { // from class: l.o0d
            public final void call() {
                vk3.m10239h(bVar.K1());
            }
        }));
        arrayList.add(vwb.Y("SVIP升级黑金弹窗New", new d30() { // from class: l.p0d
            public final void call() {
                vk3.m10238g(bVar.K1());
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: xh */
    public static /* synthetic */ void m4641xh(b bVar) {
        final hpd0 hpd0Var = new hpd0("enable_delete_local_conversation", Boolean.FALSE);
        bVar.K1().dialog().e0(vwb.f0(new String[]{"长按删除本地Conversation: " + hpd0Var.get(), "Conversation Counter Verify"})).g0(new Dialog.g() { // from class: l.rrc
            /* JADX INFO: renamed from: a */
            public final void m9180a(Dialog dialog, View view, int i, CharSequence charSequence) {
                DebugUtil.m3615C8(hpd0Var, dialog, view, i, charSequence);
            }
        }).z0();
    }

    /* JADX INFO: renamed from: xi */
    public static /* synthetic */ void m4642xi() {
        e eVar = CoreModule.c.g0;
        hpd0 hpd0Var = e.D0;
        e eVar2 = CoreModule.c.g0;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: xj */
    public static ArrayList<j760<String, d30>> m4643xj(final b bVar, final nt30 nt30Var) {
        final ArrayList<j760<String, d30>> arrayList = new ArrayList<>();
        m4226ej(arrayList);
        m4270gj(arrayList, bVar);
        arrayList.add(vwb.Y("聊天论数外显 推荐会话 ", new d30() { // from class: l.p8c
            public final void call() {
                CoreModule.c.f0.Ye().take(1).map(new DebugUtil.C3180g0()).observeOn(Schedulers.io()).map(new DebugUtil.C3155a()).subscribe(mkd0.H(new DebugUtil.C3221r0(), new DebugUtil.C3161b1()));
            }
        }));
        arrayList.add(vwb.Y("婚恋 弹框: ", new d30() { // from class: l.x9c
            public final void call() {
                e51.H(bVar.K1(), new DebugUtil.RunnableC3205m1(), 1000L);
            }
        }));
        arrayList.add(vwb.Y("首页改版兼容 强制开关： " + CoreModule.c.e0.v6.get(), new d30() { // from class: l.qec
            public final void call() {
                DebugUtil.m4007Ue();
            }
        }));
        arrayList.add(vwb.Y("关闭检测的Taost: " + lsi0.a.get(), new d30() { // from class: l.rhc
            public final void call() {
                DebugUtil.m4508rg();
            }
        }));
        arrayList.add(vwb.Y("卡片只看认证 强制显示  :" + CoreModule.c.m0.N1.get(), new d30() { // from class: l.eic
            public final void call() {
                DebugUtil.m3655E4();
            }
        }));
        arrayList.add(vwb.Y("更多场景引导资料 卡片 引导 : " + CoreModule.c.e0.o6.get(), new d30() { // from class: l.qic
            public final void call() {
                DebugUtil.m3968Sh();
            }
        }));
        arrayList.add(vwb.Y("更多场景引导资料 卡片 清理本地数据 : ", new d30() { // from class: l.cjc
            public final void call() {
                DebugUtil.m4184d();
            }
        }));
        arrayList.add(vwb.Y("更多场景引导资料 卡片 当前数据 : 可以留言数：" + m4313ij() + " 当天显示次数：" + itk.m() + " 当前划卡数：" + CoreModule.c.Y0.c.get() + " 上次在次划卡显示：" + itk.k(), new d30() { // from class: l.ojc
            public final void call() {
                DebugUtil.m4451p3();
            }
        }));
        arrayList.add(vwb.Y("更多场景引导资料 卡片 当前数据 : 健身显示没有点击次数：" + itk.c() + " 喝酒显示没有点击次数：" + itk.b() + " 吸烟显示没有点击次数：" + itk.l() + " 游戏显示没有点击次数：" + itk.e(), new d30() { // from class: l.akc
            public final void call() {
                DebugUtil.m4342k4();
            }
        }));
        arrayList.add(vwb.Y("只看认证全量- 点击 认证弹框", new d30() { // from class: l.nkc
            public final void call() {
                psq.T(bVar.K1());
            }
        }));
        arrayList.add(vwb.Y("只看认证全量- 划卡 认证弹框", new d30() { // from class: l.gac
            public final void call() {
                psq.W(bVar.K1());
            }
        }));
        arrayList.add(vwb.Y("只看认证全量- 划卡 tips", new d30() { // from class: l.yec
            public final void call() {
                DebugUtil.m4587v7(bVar);
            }
        }));
        arrayList.add(vwb.Y("首页优化改版- 调用直播引流接口", new d30() { // from class: l.qjc
            public final void call() {
                CoreModule.c.m0.k6().subscribe(mkd0.H(new DebugUtil.C3240x1(), new e30() { // from class: l.jvc
                    public final void call(Object obj) {
                        DebugUtil.m4588v8((Throwable) obj);
                    }
                }));
            }
        }));
        arrayList.add(vwb.Y("首页优化改版-show 筛选 tips", new d30() { // from class: l.ioc
            public final void call() {
                DebugUtil.m4254g3(bVar);
            }
        }));
        arrayList.add(vwb.Y("首页优化改版-show 快速右滑 弹框", new d30() { // from class: l.atc
            public final void call() {
                DebugUtil.m4024Va(bVar);
            }
        }));
        arrayList.add(vwb.Y("首页优化改版-实验强制打开" + CoreModule.c.e0.B4.get(), new d30() { // from class: l.sxc
            public final void call() {
                DebugUtil.m3826M1();
            }
        }));
        arrayList.add(vwb.Y("首页优化改版-显示房主标签" + CoreModule.c.e0.A4.get(), new d30() { // from class: l.k2d
            public final void call() {
                DebugUtil.m4682ze();
            }
        }));
        arrayList.add(vwb.Y("首页优化改版-显示直播标签" + CoreModule.c.e0.z4.get(), new d30() { // from class: l.c7d
            public final void call() {
                DebugUtil.m4625x1();
            }
        }));
        arrayList.add(vwb.Y("首页优化改版-超级喜欢显示" + CoreModule.c.e0.x4.get(), new d30() { // from class: l.ubd
            public final void call() {
                DebugUtil.m4235f6();
            }
        }));
        arrayList.add(vwb.Y("首页优化改版-超级喜数显示数量" + CoreModule.c.e0.y4.get(), new d30() { // from class: l.w9c
            public final void call() {
                DebugUtil.m4013V();
            }
        }));
        arrayList.add(vwb.Y("首页优化改版-超级喜数显示数量111", new d30() { // from class: l.jac
            public final void call() {
                CoreModule.c.e0.y4.put(1);
            }
        }));
        arrayList.add(vwb.Y("生日选择", new d30() { // from class: l.vac
            public final void call() {
                bVar.K1().startActivity(new Intent((Context) nt30Var.T4(), (Class<?>) BirthdayVerifyAct.class));
            }
        }));
        arrayList.add(vwb.Y("isFilterDistanceExpDebug_manualSetUpDistance:" + CoreModule.c.e0.t5.get(), new d30() { // from class: l.hbc
            public final void call() {
                DebugUtil.m3784K1();
            }
        }));
        arrayList.add(vwb.Y("测试路由1 tantan://realpicVerify", new d30() { // from class: l.tbc
            public final void call() {
                lva.D(bVar.K1(), Uri.parse("tantanapp://realpicVerify"));
            }
        }));
        arrayList.add(vwb.Y("插入认证卡", new d30() { // from class: l.fcc
            public final void call() {
                DebugUtil.m4627x3();
            }
        }));
        arrayList.add(vwb.Y("测试路由2 tantan://profileEdit", new d30() { // from class: l.rcc
            public final void call() {
                lva.D(bVar.K1(), Uri.parse("tantanapp://profileEdit"));
            }
        }));
        arrayList.add(vwb.Y("婚恋消息优化:插入一条婚恋汇总会话", new d30() { // from class: l.ddc
            public final void call() {
                e51.y(new DebugUtil.RunnableC3243y1());
            }
        }));
        arrayList.add(vwb.Y("婚恋消息优化:删除全部汇总会话", new d30() { // from class: l.pdc
            public final void call() {
                e51.y(new DebugUtil.RunnableC3170d2());
            }
        }));
        arrayList.add(vwb.Y("启动优化标签时间:" + CoreModule.c.e0.V4.get(), new d30() { // from class: l.dec
            public final void call() {
                DebugUtil.m4536t0();
            }
        }));
        arrayList.add(vwb.Y("打开微信小程序界面", new d30() { // from class: l.pec
            public final void call() {
                DebugUtil.m3652E1(bVar);
            }
        }));
        arrayList.add(vwb.Y("showCoinGuideDialog", new C3210n2(nt30Var)));
        arrayList.add(vwb.Y("显示女性会员弹窗", new d30() { // from class: l.cfc
            public final void call() {
                new gei().I(bVar.K1());
            }
        }));
        arrayList.add(vwb.Y("缘分雷达 清理气泡标记", new d30() { // from class: l.ofc
            public final void call() {
                CoreModule.c.s2.R.put(Boolean.FALSE);
            }
        }));
        arrayList.add(vwb.Y("资料页改版 清理标签", new d30() { // from class: l.agc
            public final void call() {
                sa40.o().h();
            }
        }));
        arrayList.add(vwb.Y("资料页改版 强制切换到改版" + CoreModule.c.m0.F1.get(), new d30() { // from class: l.mgc
            public final void call() {
                DebugUtil.m4474q4();
            }
        }));
        arrayList.add(vwb.Y("ttt国际化资料页改版 强制切换到改版" + CoreModule.c.m0.G1.get(), new d30() { // from class: l.ygc
            public final void call() {
                DebugUtil.m3706Gb();
            }
        }));
        arrayList.add(vwb.Y("ttt国际化首页划卡改版 首页划卡切换到改版" + CoreModule.c.m0.H1.get(), new d30() { // from class: l.khc
            public final void call() {
                DebugUtil.m4239fa();
            }
        }));
        arrayList.add(vwb.Y("资料页改版 强制切换到改版旧版本" + CoreModule.c.m0.I1.get(), new d30() { // from class: l.nhc
            public final void call() {
                DebugUtil.m4038W3();
            }
        }));
        arrayList.add(vwb.Y("资料页改版 一键配对:" + CoreModule.c.e0.c5.get(), new d30() { // from class: l.ohc
            public final void call() {
                DebugUtil.m3680F7();
            }
        }));
        arrayList.add(vwb.Y("ideal type force enable:" + CoreModule.c.m0.J1.get(), new d30() { // from class: l.phc
            public final void call() {
                DebugUtil.m3803L();
            }
        }));
        arrayList.add(vwb.Y("资料正反馈 弹框0", new d30() { // from class: l.qhc
            public final void call() {
                new opa0(bVar.K1(), "").m8578K(1, new DebugUtil.C3199l());
            }
        }));
        arrayList.add(vwb.Y("资料正反馈 弹框1", new d30() { // from class: l.shc
            public final void call() {
                new opa0(bVar.K1(), "").m8578K(2, new DebugUtil.C3207n());
            }
        }));
        arrayList.add(vwb.Y("资料正反馈 弹框2", new d30() { // from class: l.thc
            public final void call() {
                new opa0(bVar.K1(), "").m8578K(3, new DebugUtil.C3211o());
            }
        }));
        arrayList.add(vwb.Y("资料正反馈 弹框3", new d30() { // from class: l.uhc
            public final void call() {
                new opa0(bVar.K1(), "").m8578K(4, new DebugUtil.C3214p());
            }
        }));
        arrayList.add(vwb.Y("资料正反馈 弹框4", new d30() { // from class: l.vhc
            public final void call() {
                new opa0(bVar.K1(), "").m8578K(5, new DebugUtil.C3217q());
            }
        }));
        arrayList.add(vwb.Y("资料正反馈 清理广告卡标记", new d30() { // from class: l.whc
            public final void call() {
                DebugUtil.m3961Sa();
            }
        }));
        arrayList.add(vwb.Y("资料正反馈 插卡广告", new d30() { // from class: l.zhc
            public final void call() {
                bVar.K1().postDelayed(new Runnable() { // from class: l.tnc
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m3849N3();
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.Y("盲盒二期_弹框动画", new d30() { // from class: l.aic
            public final void call() {
                DebugUtil.m3660E9(bVar);
            }
        }));
        arrayList.add(vwb.Y("盲盒二期_即使聊天", new d30() { // from class: l.bic
            public final void call() {
                DebugUtil.m4157bg(bVar);
            }
        }));
        arrayList.add(vwb.Y("盲盒二期_插入惊喜礼盒会话", new d30() { // from class: l.cic
            public final void call() {
                CoreModule.c.f0.lq(mqi0.o());
            }
        }));
        arrayList.add(vwb.Y("盲盒二期_删除惊喜礼盒会话", new d30() { // from class: l.dic
            public final void call() {
                CoreModule.c.f0.Af();
            }
        }));
        arrayList.add(vwb.Y("盲盒二期_插入礼盒结束时间 2天", new d30() { // from class: l.fic
            public final void call() {
                CoreModule.c.k2.Y.put(Long.valueOf(mqi0.o() + 172800000));
            }
        }));
        arrayList.add(vwb.Y("盲盒二期_插入礼盒结束时间 1分", new d30() { // from class: l.gic
            public final void call() {
                CoreModule.c.k2.Y.put(Long.valueOf(mqi0.o() + 60000));
            }
        }));
        arrayList.add(vwb.Y("盲盒二期_清理礼盒结束时间", new d30() { // from class: l.hic
            public final void call() {
                CoreModule.c.k2.Y.clear();
            }
        }));
        arrayList.add(vwb.Y("盲盒二期_调用接口获取奖励弹框", new d30() { // from class: l.iic
            public final void call() {
                DebugUtil.m4483qd(bVar);
            }
        }));
        arrayList.add(vwb.Y("盲盒_bubble", new d30() { // from class: l.kic
            public final void call() {
                bVar.K1().Z5().B0();
            }
        }));
        arrayList.add(vwb.Y("盲盒_liked_user", new d30() { // from class: l.lic
            public final void call() {
                DebugUtil.m4278h5(bVar);
            }
        }));
        arrayList.add(vwb.Y("盲盒_normal_user", new d30() { // from class: l.mic
            public final void call() {
                DebugUtil.m4685zh(bVar);
            }
        }));
        arrayList.add(vwb.Y("盲盒_Boost", new d30() { // from class: l.nic
            public final void call() {
                DebugUtil.m3935R5(bVar);
            }
        }));
        arrayList.add(vwb.Y("盲盒_Exposure", new d30() { // from class: l.oic
            public final void call() {
                DebugUtil.m4594ve(bVar);
            }
        }));
        arrayList.add(vwb.Y("盲盒", new d30() { // from class: l.pic
            public final void call() {
                new y3h0(bVar.K1()).show();
            }
        }));
        arrayList.add(vwb.Y("微信引导弹窗", new d30() { // from class: l.ric
            public final void call() {
                DebugUtil.m4404n0(bVar);
            }
        }));
        arrayList.add(vwb.Y("CITY_TOP_GREETING", new d30() { // from class: l.sic
            public final void call() {
                DebugUtil.m4141b0(bVar);
            }
        }));
        arrayList.add(vwb.Y("12M优惠券", new d30() { // from class: l.tic
            public final void call() {
                w6h0.j().f(bVar.K1());
            }
        }));
        arrayList.add(vwb.Y("划卡聊天室开关 = " + CoreModule.c.m0.v1.get(), new d30() { // from class: l.vic
            public final void call() {
                DebugUtil.m4491r();
            }
        }));
        arrayList.add(vwb.Y("黑钻测试", new d30() { // from class: l.wic
            public final void call() {
                com.p1.mobile.putong.core.ui.match.b.l(bVar.K1(), "", (d30) null);
            }
        }));
        arrayList.add(vwb.Y("鉴权", new d30() { // from class: l.xic
            public final void call() {
                bVar.K1().duringCreated(CoreModule.c.P0.e3(zyc0.j0() ? "1000002" : "1000003", "code", "user_mobile,user_profile", "", "").map(new w9j() { // from class: l.rmc
                    public final Object call(Object obj) {
                        return DebugUtil.m4539t3((OpenSdkCodeAuth) obj);
                    }
                })).subscribe(mkd0.H(new npo(), new e30() { // from class: l.smc
                    public final void call(Object obj) {
                        osi0.g("网络请求异常");
                    }
                }));
            }
        }));
        arrayList.add(vwb.Y("打开美团 h5", new d30() { // from class: l.yic
            public final void call() {
                b bVar2 = bVar;
                i0e.d(bVar2.K1()).I("美团h5").H((String) DebugUtil.f2193a.get()).F(new e30() { // from class: l.gtc
                    public final void call(Object obj) {
                        DebugUtil.m4412n8(bVar2, (String) obj);
                    }
                }).n().show();
            }
        }));
        arrayList.add(vwb.Y("真实头像认证弹窗", new d30() { // from class: l.zic
            public final void call() {
                DebugUtil.m4084Y7(bVar);
            }
        }));
        arrayList.add(vwb.Y("真人实名认证弹窗", new d30() { // from class: l.ajc
            public final void call() {
                DebugUtil.m3573Aa(bVar);
            }
        }));
        arrayList.add(vwb.Y("真人活体认证弹窗-》国际化", new d30() { // from class: l.bjc
            public final void call() {
                bcp.INSTANCE.q(bVar.K1(), "need_person_verify");
            }
        }));
        arrayList.add(vwb.Y("头像审核中弹窗", new d30() { // from class: l.djc
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().startActivity(VerificationAct.m4872m2(bVar2.K1(), 3, ""));
            }
        }));
        arrayList.add(vwb.Y("实名审核中弹窗", new d30() { // from class: l.ejc
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().startActivity(VerificationAct.m4872m2(bVar2.K1(), 4, ""));
            }
        }));
        arrayList.add(vwb.Y("取消实名认证", new d30() { // from class: l.gjc
            public final void call() {
                CoreModule.c.M0.d3("fromNameVerificationDlg");
            }
        }));
        arrayList.add(vwb.Y("取消头像认证", new d30() { // from class: l.hjc
            public final void call() {
                CoreModule.c.B0.Q3(CoreModule.H().userId(), "fromPicVerificationDlg");
            }
        }));
        arrayList.add(vwb.Y("引导上传生活照", new d30() { // from class: l.ijc
            public final void call() {
                DebugUtil.m3639Da(bVar);
            }
        }));
        arrayList.add(vwb.Y("MK Bridge测试", new d30() { // from class: l.jjc
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().startActivity(MkWebViewAct.b2(bVar2.K1(), "", "https://m.staging2.p1staff.com/fep/tantan/frontend/tantan-js-bridge/index.html?_bid=1002620#/", true));
            }
        }));
        arrayList.add(vwb.Y("测试跳转MkWebview页面", new d30() { // from class: l.kjc
            public final void call() {
                b bVar2 = bVar;
                i0e.d(bVar2.K1()).I("跳转MkWebview页面").E(1).D(300).F(new e30() { // from class: l.hwc
                    public final void call(Object obj) {
                        b bVar3 = bVar2;
                        bVar3.K1().startActivity(MkWebViewAct.g2(bVar3.K1(), true, "", (String) obj));
                    }
                }).n().show();
            }
        }));
        arrayList.add(vwb.Y("跳转主题答题页面", new d30() { // from class: l.ljc
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().startActivity(lva.A(bVar2.K1(), (String) null, "https://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-static-pages-fep/src/apps/material-access/index.html?speed=true&_bid=1002757&type=theme#/questionnaire", true, false, true));
            }
        }));
        arrayList.add(vwb.Y("添加小组件", new d30() { // from class: l.mjc
            public final void call() {
                DebugUtil.m3830M5();
            }
        }));
        arrayList.add(vwb.Y("照片上传引导关闭 = " + lra0.n0.get(), new d30() { // from class: l.njc
            public final void call() {
                DebugUtil.m4272h();
            }
        }));
        arrayList.add(vwb.Y(" 重置动态打招呼接收消息状态引导气泡", new d30() { // from class: l.pjc
            public final void call() {
                CoreModule.c.r0.R.put(Boolean.FALSE);
            }
        }));
        arrayList.add(vwb.Y("进入动态打招呼列表", new d30() { // from class: l.rjc
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().startActivity(DynamicGreetListAct.V1(bVar2.K1(), (Greeting) null));
            }
        }));
        arrayList.add(vwb.Y("右滑引导", new d30() { // from class: l.sjc
            public final void call() {
                DebugUtil.m3685Fc(bVar);
            }
        }));
        arrayList.add(vwb.Y("左滑引导", new d30() { // from class: l.tjc
            public final void call() {
                DebugUtil.m3625Ci(bVar);
            }
        }));
        arrayList.add(vwb.Y("禁止切卡功能：" + lra0.f.get(), new d30() { // from class: l.ujc
            public final void call() {
                DebugUtil.m3937R7();
            }
        }));
        arrayList.add(vwb.Y("FragInitializeStep", new d30() { // from class: l.vjc
            public final void call() {
                bVar.K1().dialog().e0(vwb.f0(new String[]{"Create", "Start", "Resume"})).g0(new Dialog.g() { // from class: l.rkc
                    /* JADX INFO: renamed from: a */
                    public final void m9148a(Dialog dialog, View view, int i, CharSequence charSequence) {
                        DebugUtil.m4057X1(dialog, view, i, charSequence);
                    }
                }).z0();
            }
        }));
        arrayList.add(vwb.Y("设置聊天引导等候时间", new d30() { // from class: l.wjc
            public final void call() {
                DebugUtil.m4019V5(bVar);
            }
        }));
        arrayList.add(vwb.Y("卡片清晰度优化", new d30() { // from class: l.xjc
            public final void call() {
                DebugUtil.m4016V2(bVar);
            }
        }));
        arrayList.add(vwb.Y("站内Push", new d30() { // from class: l.yjc
            public final void call() {
                DebugUtil.m3585B0(nt30Var, bVar);
            }
        }));
        arrayList.add(vwb.Y("新配对动效Debug开关：" + a5x.b.get(), new d30() { // from class: l.zjc
            public final void call() {
                DebugUtil.m3934R4();
            }
        }));
        arrayList.add(vwb.Y("插入广告卡片 position 3", new d30() { // from class: l.ckc
            public final void call() {
                DebugUtil.m4651y5();
            }
        }));
        arrayList.add(vwb.Y("插入广告卡片 position 1", new d30() { // from class: l.dkc
            public final void call() {
                DebugUtil.m3846N0();
            }
        }));
        arrayList.add(vwb.Y("插入广告卡片 position 0", new d30() { // from class: l.ekc
            public final void call() {
                DebugUtil.m4416nc();
            }
        }));
        arrayList.add(vwb.Y("插入广告卡片书影剧httpdata position 0", new d30() { // from class: l.fkc
            public final void call() {
                DebugUtil.m4425o();
            }
        }));
        arrayList.add(vwb.Y("插入 boost position 3", new d30() { // from class: l.gkc
            public final void call() {
                DebugUtil.m3814La();
            }
        }));
        arrayList.add(vwb.Y("插入书影剧三期运营卡片 position 0", new d30() { // from class: l.hkc
            public final void call() {
                DebugUtil.m4214e7();
            }
        }));
        arrayList.add(vwb.Y("消息推送权限弹窗", new d30() { // from class: l.ikc
            public final void call() {
                b bVar2 = bVar;
                nt30 nt30Var2 = nt30Var;
                uq40.F(bVar2.K1(), new d30() { // from class: l.pnc
                    public final void call() {
                        nt30Var2.Y4();
                    }
                }, new d30() { // from class: l.qnc
                    public final void call() {
                        DebugUtil.m4527sd(nt30Var2);
                    }
                });
            }
        }));
        arrayList.add(vwb.Y("Mock配对页", new d30() { // from class: l.jkc
            public final void call() {
                DebugUtil.m4065X9(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("切换白色主题", new d30() { // from class: l.kkc
            public final void call() {
                DebugUtil.m4191d6();
            }
        }));
        arrayList.add(0, vwb.Y("DIALOGS AT HOME ", new d30() { // from class: l.lkc
            public final void call() {
                DebugUtil.m4221ee(bVar);
            }
        }));
        arrayList.add(vwb.Y("展示顶部弹窗", new d30() { // from class: l.rdc
            public final void call() {
                abi.m5323J(bVar.K1(), CoreModule.c.e0.p9());
            }
        }));
        arrayList.add(vwb.Y("show radar", new d30() { // from class: l.yhc
            public final void call() {
                bVar.L5(true, false);
            }
        }));
        arrayList.add(vwb.Y("show radar", new d30() { // from class: l.fmc
            public final void call() {
                bVar.L5(true, false);
            }
        }));
        arrayList.add(vwb.Y("show toast top!!!!!", new d30() { // from class: l.mqc
            public final void call() {
                b bVar2 = bVar;
                lsi0.H(bVar2.K1().getResources().getString(R.string.Xo), bVar2.K1().getResources().getDrawable(x2c0.Cp), bVar2.K1().getResources().getDrawable(x2c0.vr));
            }
        }));
        arrayList.add(vwb.Y("knowme", new d30() { // from class: l.tuc
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().startActivity(BusinessWebViewAct.X1(bVar2.K1(), "aaa", 1L, "http://m-test.kanjianxinli.com/ceping/index.html#/?channelId=281", "webview_load_type_knowme"));
            }
        }));
        if (bVar.A2().d() != null && bVar.A2().j() != null) {
            final String str = bVar.A2().j().id;
            arrayList.add(vwb.Y("make first user superlike me", new d30() { // from class: l.azc
                public final void call() {
                    DebugUtil.m4390m8(str, bVar);
                }
            }));
            arrayList.add(vwb.Y("make first user like me", new d30() { // from class: l.h3d
                public final void call() {
                    DebugUtil.m3958S7(str);
                }
            }));
            arrayList.add(vwb.Y("make first user invite me", new d30() { // from class: l.o7d
                public final void call() {
                    CoreModule.c.B0.V3(CoreModule.H().userId(), str);
                }
            }));
            arrayList.add(vwb.Y("重置优惠卷重构 svip大页面", new d30() { // from class: l.vbd
                public final void call() {
                    DebugUtil.m4181ci();
                }
            }));
            arrayList.add(vwb.Y("匿名打招呼", new d30() { // from class: l.v9c
                public final void call() {
                    CoreModule.K().m5214s0(nt30Var.T4(), str);
                }
            }));
            arrayList.add(vwb.Y("[男用户未消耗like限时出现]", new d30() { // from class: l.rac
                public final void call() {
                    DebugUtil.m4518s4(str);
                }
            }));
            arrayList.add(vwb.Y("[打开关闭男用户的like开关：]" + CoreModule.c.f0.f1.get(), new d30() { // from class: l.cbc
                public final void call() {
                    DebugUtil.m4324j8();
                }
            }));
            arrayList.add(vwb.Y("make users like me", new d30() { // from class: l.nbc
                public final void call() {
                    DebugUtil.m3688Ff();
                }
            }));
            arrayList.add(vwb.Y("make first user diamond received like me", new d30() { // from class: l.ybc
                public final void call() {
                    DebugUtil.m3763J2(str);
                }
            }));
            arrayList.add(vwb.Y("make first user like me delay 5s", new d30() { // from class: l.jcc
                public final void call() {
                    e51.I(bVar.q2(), new Runnable() { // from class: l.ysc
                        @Override // java.lang.Runnable
                        public final void run() {
                            y.h3(str).materialize().subscribe();
                        }
                    }, 5000L);
                }
            }));
            arrayList.add(vwb.Y("show user id", new d30() { // from class: l.ucc
                public final void call() {
                    bVar.K1().dialog().G0("user id").F(CoreModule.H().userId()).z().show();
                }
            }));
            arrayList.add(vwb.Y("boost guide", new d30() { // from class: l.fdc
                public final void call() {
                    bVar.K1().dialog().G0("boost_peak_guide_switch").F(u59.n).z().show();
                }
            }));
            arrayList.add(vwb.Y("match user with inputed id", new d30() { // from class: l.qdc
                public final void call() {
                    i0e.d(bVar.K1()).D(10).r("input the user id you like").F(new e30() { // from class: l.lxc
                        public final void call(Object obj) {
                            y.j3((String) obj).subscribe();
                        }
                    }).n().show();
                }
            }));
        }
        arrayList.add(vwb.Y("show alert toast in 5 secs", new d30() { // from class: l.cec
            public final void call() {
                e51.I(bVar.q2(), new Runnable() { // from class: l.ukc
                    @Override // java.lang.Runnable
                    public final void run() {
                        lsi0.j("test");
                    }
                }, 5000L);
            }
        }));
        arrayList.add(vwb.Y("show alert toast in 5 secs (background)", new d30() { // from class: l.nec
            public final void call() {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: l.koc
                    @Override // java.lang.Runnable
                    public final void run() {
                        lsi0.j("test background");
                    }
                }, 5000L);
            }
        }));
        arrayList.add(vwb.Y("clear init file cache", new d30() { // from class: l.jfc
            public final void call() {
                ggi.d();
            }
        }));
        arrayList.add(vwb.Y("toggle debug server unavailable", new d30() { // from class: l.ufc
            public final void call() {
                Network.debug_fakeServerUnavailable = !Network.debug_fakeServerUnavailable;
            }
        }));
        arrayList.add(vwb.Y("delete crushes", new d30() { // from class: l.fgc
            public final void call() {
                ap7.c3().subscribe();
            }
        }));
        arrayList.add(vwb.Y("Open Instagram like  Media picker", new d30() { // from class: l.qgc
            public final void call() {
                CoreModule.N().startInstaLikePickerAct(bVar.K1());
            }
        }));
        arrayList.add(vwb.Y("认证相关DebugItem", new d30() { // from class: l.bhc
            public final void call() {
                DebugUtil.m3909Q0(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("插入聊天消息", new d30() { // from class: l.mhc
            public final void call() {
                DebugUtil.m4213e6(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("首页切换动画DebugItem", new d30() { // from class: l.xhc
            public final void call() {
                DebugUtil.m3879Oc(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("划卡速DebugItem", new d30() { // from class: l.jic
            public final void call() {
                DebugUtil.m4259g8(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("真人认证：模拟bad token = " + swk0.a, new d30() { // from class: l.uic
            public final void call() {
                swk0.g();
            }
        }));
        arrayList.add(vwb.Y("插入广告卡 ", new d30() { // from class: l.fjc
            public final void call() {
                u0n.m();
            }
        }));
        arrayList.add(vwb.Y("开启 Ad ", new d30() { // from class: l.bkc
            public final void call() {
                DebugUtil.m4209e2();
            }
        }));
        arrayList.add(vwb.Y("ad： 1:1 ", new d30() { // from class: l.mkc
            public final void call() {
                u0n.b = 1.0f;
            }
        }));
        arrayList.add(vwb.Y("ad：16:9 ", new d30() { // from class: l.xkc
            public final void call() {
                u0n.b = 1.7777778f;
            }
        }));
        arrayList.add(vwb.Y("ad:9:16 ", new d30() { // from class: l.ilc
            public final void call() {
                u0n.b = 0.5625f;
            }
        }));
        arrayList.add(vwb.Y("ad:4:3 ", new d30() { // from class: l.tlc
            public final void call() {
                u0n.b = 1.3333334f;
            }
        }));
        arrayList.add(vwb.Y("ad:3:4", new d30() { // from class: l.emc
            public final void call() {
                u0n.b = 0.75f;
            }
        }));
        arrayList.add(vwb.Y("ad:1.91:1 ", new d30() { // from class: l.qmc
            public final void call() {
                u0n.b = 1.91f;
            }
        }));
        arrayList.add(vwb.Y("国际化特权周期", new d30() { // from class: l.bnc
            public final void call() {
                i0e.d(bVar.K1()).I("特权时长day").E(1).D(80).r(MerchandiseTimeUnit.day).F(new e30() { // from class: l.ixc
                    public final void call(Object obj) {
                        com.p1.mobile.putong.core.ui.purchase.a.Companion.b(Integer.valueOf((String) obj).intValue());
                    }
                }).n().show();
            }
        }));
        arrayList.add(vwb.Y("国际化特权到期时间", new d30() { // from class: l.mnc
            public final void call() {
                i0e.d(bVar.K1()).I("设置到期时间毫秒").r("毫秒").E(1).D(80).r((String) mu5.a.get()).H((String) mu5.a.get()).F(new e30() { // from class: l.cxc
                    public final void call(Object obj) {
                        com.p1.mobile.putong.core.ui.purchase.a.Companion.a(Long.valueOf((String) obj).longValue());
                    }
                }).n().show();
            }
        }));
        StringBuilder sb = new StringBuilder("主播清晰度优化： ");
        CoreSuggested coreSuggested = CoreModule.c.m0;
        sb.append(coreSuggested.a2.containsKey(coreSuggested.q6()));
        arrayList.add(vwb.Y(sb.toString(), new d30() { // from class: l.xnc
            public final void call() {
                DebugUtil.m3762J1();
            }
        }));
        arrayList.add(vwb.Y("设置turbo guide 位置3", new d30() { // from class: l.toc
            public final void call() {
                g83.m6612e();
            }
        }));
        arrayList.add(vwb.Y("设置superlike guide 位置6", new d30() { // from class: l.epc
            public final void call() {
                rxg0.N();
            }
        }));
        arrayList.add(vwb.Y("特殊喜欢dlg", new d30() { // from class: l.ppc
            public final void call() {
                CoreDlg.m2373d2(CoreModule.c.e0.p9(), bVar.K1(), null, null);
            }
        }));
        arrayList.add(vwb.Y("男性用户插卡新样式", new d30() { // from class: l.aqc
            public final void call() {
                DebugUtil.m4573uf();
            }
        }));
        arrayList.add(vwb.Y("zb直播状态-连线中", new d30() { // from class: l.lqc
            public final void call() {
                DebugUtil.m3852N6();
            }
        }));
        arrayList.add(vwb.Y("zb直播状态-会话列表", new d30() { // from class: l.xqc
            public final void call() {
                DebugUtil.m4626x2(bVar);
            }
        }));
        arrayList.add(vwb.Y("收到Push喜欢debugItems", new d30() { // from class: l.irc
            public final void call() {
                DebugUtil.m4670z2(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("探探认证相关debugItems", new d30() { // from class: l.trc
            public final void call() {
                DebugUtil.m4362l2(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("定位相关debugItems", new d30() { // from class: l.esc
            public final void call() {
                DebugUtil.m3587B2(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("new user see pop in card", new d30() { // from class: l.psc
            public final void call() {
                DebugUtil.m4076Y(bVar);
            }
        }));
        arrayList.add(vwb.Y("fake视频闪聊", new d30() { // from class: l.ltc
            public final void call() {
                tqm0.p().h(bVar.K1(), "143023", "voiceQuickChat");
            }
        }));
        arrayList.add(vwb.Y("LocalVariable", new d30() { // from class: l.wtc
            public final void call() {
                Objects.toString(ic50.j().o().a("me.avatar").get());
            }
        }));
        arrayList.add(vwb.Y("show fake dlg", new d30() { // from class: l.huc
            public final void call() {
                bVar.K1().postDelayed(new Runnable() { // from class: l.onc
                    @Override // java.lang.Runnable
                    public final void run() {
                        cxf.m6013f().m6017h(CoreModule.c.e0.p9());
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.Y("取消认证弹窗", new d30() { // from class: l.suc
            public final void call() {
                CoreDlg.m2413r1(bVar.K1());
            }
        }));
        arrayList.add(vwb.Y("letterSendPanel", new d30() { // from class: l.evc
            public final void call() {
                lrb.f().m(bVar.K1(), CoreModule.c.e0.p9(), new DebugUtil.C3229u());
            }
        }));
        arrayList.add(vwb.Y("letterSendPanelintl", new d30() { // from class: l.pvc
            public final void call() {
                b bVar2 = bVar;
                nt30 nt30Var2 = nt30Var;
                CoreDlg.m2345U1(bVar2.K1(), bVar2.A2().o().d(), new e30() { // from class: l.vsc
                    public final void call(Object obj) {
                        DebugUtil.m4669z1(nt30Var2, bVar2, (String) obj);
                    }
                }, new d30() { // from class: l.wsc
                    public final void call() {
                        nt30Var2.i9(true);
                    }
                });
            }
        }));
        arrayList.add(vwb.Y("fake更换性别", new d30() { // from class: l.awc
            public final void call() {
                myf.T(bVar.K1(), new Runnable() { // from class: l.rnc
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m4619wh();
                    }
                });
            }
        }));
        arrayList.add(vwb.Y("show one id", new d30() { // from class: l.lwc
            public final void call() {
                bVar.K1().dialog().G0("one id").F(sh50.d()).z().show();
            }
        }));
        arrayList.add(vwb.Y("go to appeal loading", new d30() { // from class: l.wwc
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().startActivity(AppealProgressAct.Y1(bVar2.K1()));
            }
        }));
        arrayList.add(vwb.Y("语音闪聊loading", new d30() { // from class: l.hxc
            public final void call() {
                CoreModule.K().m5160em(bVar.K1(), "", "");
            }
        }));
        arrayList.add(vwb.Y("isCardSwipeGuideEnable:" + lra0.r.get(), new d30() { // from class: l.dyc
            public final void call() {
                DebugUtil.m3642Dd();
            }
        }));
        arrayList.add(vwb.Y("红包动画延长10x:" + x.R.get(), new d30() { // from class: l.oyc
            public final void call() {
                DebugUtil.m4449p1();
            }
        }));
        arrayList.add(vwb.Y("红包动画一直展示:" + x.S.get(), new d30() { // from class: l.zyc
            public final void call() {
                DebugUtil.m3892P4();
            }
        }));
        arrayList.add(vwb.Y("isCardSwipe,reset all guide", new d30() { // from class: l.lzc
            public final void call() {
                DebugUtil.m4454p6();
            }
        }));
        arrayList.add(vwb.Y("isProrileVerExp1:" + lra0.x.get(), new d30() { // from class: l.wzc
            public final void call() {
                DebugUtil.m4450p2();
            }
        }));
        arrayList.add(vwb.Y("isProrileVerExp2:" + lra0.y.get(), new d30() { // from class: l.h0d
            public final void call() {
                DebugUtil.m4569ub();
            }
        }));
        arrayList.add(vwb.Y("isProrileVer clean:" + lra0.y.get(), new d30() { // from class: l.s0d
            public final void call() {
                DebugUtil.m4403n();
            }
        }));
        arrayList.add(vwb.Y("延长profile切tab时间:5秒", new d30() { // from class: l.d1d
            public final void call() {
                DebugUtil.m4266gf();
            }
        }));
        arrayList.add(vwb.Y("延长profile切tab时间:10秒", new d30() { // from class: l.o1d
            public final void call() {
                DebugUtil.m4041W6();
            }
        }));
        arrayList.add(vwb.Y("延长profile切tab时间:默认", new d30() { // from class: l.z1d
            public final void call() {
                DebugUtil.m3661Ea();
            }
        }));
        arrayList.add(vwb.Y("清除划卡按钮提示", new d30() { // from class: l.v2d
            public final void call() {
                DebugUtil.m4652y6();
            }
        }));
        arrayList.add(vwb.Y("显示所有认证图标-profile:" + lra0.o.get(), new d30() { // from class: l.g3d
            public final void call() {
                DebugUtil.m4129aa();
            }
        }));
        arrayList.add(vwb.Y("动态基建：实验 = " + lra0.X.get(), new d30() { // from class: l.s3d
            public final void call() {
                DebugUtil.m4037W2();
            }
        }));
        arrayList.add(vwb.Y("禁言申诉实验：强制弹滑块 = " + lra0.P.get(), new d30() { // from class: l.d4d
            public final void call() {
                DebugUtil.m4365l5();
            }
        }));
        arrayList.add(vwb.Y("禁言申诉实验：强制数美1 = " + lra0.Q.get(), new d30() { // from class: l.o4d
            public final void call() {
                DebugUtil.m3975T3();
            }
        }));
        arrayList.add(vwb.Y("动态外露：profile展示脱单中 = " + lra0.V.get(), new d30() { // from class: l.z4d
            public final void call() {
                DebugUtil.m3938R8();
            }
        }));
        arrayList.add(vwb.Y("动态外露：profile展示superlike = " + lra0.U.get(), new d30() { // from class: l.k5d
            public final void call() {
                DebugUtil.m3862Ng();
            }
        }));
        arrayList.add(vwb.Y("动态外露：动态文案过长 = " + lra0.W.get(), new d30() { // from class: l.v5d
            public final void call() {
                DebugUtil.m3895P7();
            }
        }));
        arrayList.add(vwb.Y("丰富资料：实验入组 = " + lra0.N.get(), new d30() { // from class: l.g6d
            public final void call() {
                DebugUtil.m4311ih();
            }
        }));
        arrayList.add(vwb.Y("丰富资料：展示红点(特邀嘉宾聊天框) = " + CoreModule.c.f0.Z0.get(), new d30() { // from class: l.r6d
            public final void call() {
                DebugUtil.m4548tc();
            }
        }));
        arrayList.add(vwb.Y("年龄过大 超过100岁:" + lra0.M.get(), new d30() { // from class: l.n7d
            public final void call() {
                DebugUtil.m3711Gg();
            }
        }));
        arrayList.add(vwb.Y("破冰实验开关:" + r9m.i.get(), new d30() { // from class: l.z7d
            public final void call() {
                DebugUtil.m4659yd();
            }
        }));
        arrayList.add(vwb.Y("破冰实验，弹框一定展示:" + r9m.j.get(), new d30() { // from class: l.k8d
            public final void call() {
                DebugUtil.m4059X3();
            }
        }));
        arrayList.add(vwb.Y("破冰实验，清除破冰时间", new d30() { // from class: l.v8d
            public final void call() {
                DebugUtil.m3910Q1();
            }
        }));
        arrayList.add(vwb.Y("引导用户开启push实验 = " + lra0.J.get(), new d30() { // from class: l.g9d
            public final void call() {
                DebugUtil.m4418ne();
            }
        }));
        arrayList.add(vwb.Y("引导用户push的dialog:", new d30() { // from class: l.r9d
            public final void call() {
                uq40.G(bVar.K1(), true);
            }
        }));
        arrayList.add(vwb.Y("引导用户push的dialog(多次):", new d30() { // from class: l.cad
            public final void call() {
                DebugUtil.m4540t4(bVar);
            }
        }));
        arrayList.add(vwb.Y("引导用户，重置列表header弹出次数：", new d30() { // from class: l.nad
            public final void call() {
                DebugUtil.m3957S6();
            }
        }));
        arrayList.add(vwb.Y("强制开启直播间和语音房功能= " + App.q.get(), new d30() { // from class: l.yad
            public final void call() {
                DebugUtil.m3629D0();
            }
        }));
        arrayList.add(vwb.Y("聊天破冰：新配对 有策略= " + f2194b.get(), new d30() { // from class: l.jbd
            public final void call() {
                DebugUtil.m4165c2();
            }
        }));
        arrayList.add(vwb.Y("聊天破冰：新配对 无策略= " + f2195c.get(), new d30() { // from class: l.a9c
            public final void call() {
                DebugUtil.m4228f();
            }
        }));
        arrayList.add(vwb.Y("聊天破冰：新配对 关闭弹框本地值清空", new d30() { // from class: l.l9c
            public final void call() {
                CoreModule.c.e0.w0.put(Boolean.FALSE);
            }
        }));
        arrayList.add(vwb.Y("聊天破冰：新配对 最大数量限制：5", new d30() { // from class: l.n9c
            public final void call() {
                CoreModule.c.e0.x0.put(5);
            }
        }));
        arrayList.add(vwb.Y("聊天破冰：新配对 最大数量限制：10", new d30() { // from class: l.o9c
            public final void call() {
                CoreModule.c.e0.x0.put(10);
            }
        }));
        arrayList.add(vwb.Y("聊天破冰：新配对 最大数量限制：20", new d30() { // from class: l.p9c
            public final void call() {
                CoreModule.c.e0.x0.put(20);
            }
        }));
        arrayList.add(vwb.Y("聊天破冰：新配对 最大数量限制：100", new d30() { // from class: l.q9c
            public final void call() {
                CoreModule.c.e0.x0.put(100);
            }
        }));
        arrayList.add(vwb.Y("好友上线弹窗", new C3232v(bVar)));
        arrayList.add(vwb.Y("女性召回", new C3235w(bVar)));
        arrayList.add(vwb.Y("新卡片切卡：profile昵称过长 = " + lra0.K.get(), new d30() { // from class: l.r9c
            public final void call() {
                DebugUtil.m4589v9();
            }
        }));
        arrayList.add(vwb.Y("新卡片切卡：profile展示头像审核失败 = " + lra0.L.get(), new d30() { // from class: l.s9c
            public final void call() {
                DebugUtil.m4382m0();
            }
        }));
        arrayList.add(vwb.Y("新卡片切卡：profile重置蒙层引导 = " + lra0.O.get(), new d30() { // from class: l.t9c
            public final void call() {
                DebugUtil.m4388m6();
            }
        }));
        arrayList.add(vwb.Y("新卡片切卡：profile抢先表白 = " + lra0.a0.get(), new d30() { // from class: l.u9c
            public final void call() {
                DebugUtil.m4674z6();
            }
        }));
        arrayList.add(vwb.Y("新卡片切卡：profile开启直播 = " + lra0.b0.get(), new d30() { // from class: l.y9c
            public final void call() {
                DebugUtil.m3930R0();
            }
        }));
        arrayList.add(vwb.Y("新卡片切卡：profile关闭直播 = " + lra0.c0.get(), new d30() { // from class: l.z9c
            public final void call() {
                DebugUtil.m4178cf();
            }
        }));
        arrayList.add(vwb.Y("新卡片切卡：profile语音直播 = " + lra0.d0.get(), new d30() { // from class: l.aac
            public final void call() {
                DebugUtil.m4250g();
            }
        }));
        arrayList.add(vwb.Y("新卡片切卡：profile视频直播 = " + lra0.e0.get(), new d30() { // from class: l.bac
            public final void call() {
                DebugUtil.m3663Ec();
            }
        }));
        arrayList.add(vwb.Y("新卡片切卡：profile双直播样式 = " + lra0.f0.get(), new d30() { // from class: l.cac
            public final void call() {
                DebugUtil.m3740I1();
            }
        }));
        arrayList.add(vwb.Y("新卡片切卡：profile sueprlike动画 = " + lra0.R.get(), new d30() { // from class: l.dac
            public final void call() {
                DebugUtil.m3894P6();
            }
        }));
        arrayList.add(vwb.Y("新卡片切卡：profile 国际化私信样式 = " + lra0.S.get(), new d30() { // from class: l.eac
            public final void call() {
                DebugUtil.m4429o3();
            }
        }));
        arrayList.add(vwb.Y("新卡片切卡：切卡+关于我 = " + lra0.B.get(), new d30() { // from class: l.fac
            public final void call() {
                DebugUtil.m3564A1();
            }
        }));
        arrayList.add(vwb.Y("新卡片切卡：控制组 = " + lra0.C.get(), new d30() { // from class: l.hac
            public final void call() {
                DebugUtil.m4308id();
            }
        }));
        arrayList.add(vwb.Y("新卡片切卡：清除入组", new d30() { // from class: l.iac
            public final void call() {
                lra0.B.put(Boolean.FALSE);
            }
        }));
        arrayList.add(vwb.Y("新卡片切卡：显示所有tag:" + lra0.D.get(), new d30() { // from class: l.kac
            public final void call() {
                DebugUtil.m3750Ib();
            }
        }));
        arrayList.add(vwb.Y("新卡片切卡：显示首张视频:" + lra0.E.get(), new d30() { // from class: l.lac
            public final void call() {
                DebugUtil.m3707Gc();
            }
        }));
        arrayList.add(vwb.Y("新卡片切卡：显示擦肩而过tag:" + lra0.F.get(), new d30() { // from class: l.mac
            public final void call() {
                DebugUtil.m4676z8();
            }
        }));
        arrayList.add(vwb.Y("新卡片切卡： 隐藏擦肩而过tag:" + lra0.G.get(), new d30() { // from class: l.nac
            public final void call() {
                DebugUtil.m4092Yf();
            }
        }));
        arrayList.add(vwb.Y("新卡片切卡：显示profile可点击区域:" + lra0.H.get(), new d30() { // from class: l.oac
            public final void call() {
                DebugUtil.m4022V8();
            }
        }));
        arrayList.add(vwb.Y("新卡片切卡：进profile就能显示蒙层:" + lra0.I.get(), new d30() { // from class: l.pac
            public final void call() {
                DebugUtil.m3775Je();
            }
        }));
        arrayList.add(vwb.Y("ui优化0:", new d30() { // from class: l.qac
            public final void call() {
                DebugUtil.m4484qe(bVar);
            }
        }));
        arrayList.add(vwb.Y("ui优化1:", new d30() { // from class: l.sac
            public final void call() {
                DebugUtil.m4561u3(bVar);
            }
        }));
        arrayList.add(vwb.Y("ui优化2:", new d30() { // from class: l.tac
            public final void call() {
                ke7.m7567o().m7572A(bVar.K1(), "3x");
            }
        }));
        arrayList.add(vwb.Y("ui优化3:", new d30() { // from class: l.uac
            public final void call() {
                ke7.m7567o().m7573B(bVar.K1());
            }
        }));
        arrayList.add(vwb.Y("ui优化4:", new d30() { // from class: l.wac
            public final void call() {
                ke7.m7567o().m7574C(bVar.K1(), "我的测试", CoreModule.c.e0.p9().picture(0).profileSmall().formatted(), new d30() { // from class: l.zsc
                    public final void call() {
                        DebugUtil.m3630D1();
                    }
                });
            }
        }));
        arrayList.add(vwb.Y("全量卡片非切卡 - profile全量 - 控制组:" + lra0.n.get(), new d30() { // from class: l.xac
            public final void call() {
                DebugUtil.m3839Me();
            }
        }));
        arrayList.add(vwb.Y("标签 - 动态标签在线:" + lra0.h0.get(), new d30() { // from class: l.yac
            public final void call() {
                DebugUtil.m4102Z4();
            }
        }));
        arrayList.add(vwb.Y("标签 - 动态标签国家:" + lra0.i0.get(), new d30() { // from class: l.zac
            public final void call() {
                DebugUtil.m3586B1();
            }
        }));
        arrayList.add(vwb.Y("标签 - 标签擦肩而过:" + lra0.j0.get(), new d30() { // from class: l.abc
            public final void call() {
                DebugUtil.m3690Fh();
            }
        }));
        arrayList.add(vwb.Y("标签 - 标签纯文案:" + lra0.k0.get(), new d30() { // from class: l.bbc
            public final void call() {
                DebugUtil.m4304i9();
            }
        }));
        arrayList.add(vwb.Y("标签 - 漫游用户标签:" + lra0.l0.get(), new d30() { // from class: l.dbc
            public final void call() {
                DebugUtil.m4458pa();
            }
        }));
        arrayList.add(vwb.Y("标签 - 朋友圈:" + lra0.m0.get(), new d30() { // from class: l.ebc
            public final void call() {
                DebugUtil.m4448p0();
            }
        }));
        arrayList.add(vwb.Y("full card 优化", new d30() { // from class: l.fbc
            public final void call() {
                DebugUtil.m4148b7(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("看看打招呼入口 显示未读", new d30() { // from class: l.gbc
            public final void call() {
                e51.y(new Runnable() { // from class: l.bmc
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m4301i6();
                    }
                });
            }
        }));
        arrayList.add(vwb.Y("看看打招呼入口 显示消息", new d30() { // from class: l.ibc
            public final void call() {
                e51.y(new Runnable() { // from class: l.cmc
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m4457p9();
                    }
                });
            }
        }));
        arrayList.add(vwb.Y("看看打招呼入口 显示空白", new d30() { // from class: l.jbc
            public final void call() {
                DebugUtil.m3787K4();
            }
        }));
        arrayList.add(vwb.Y("反诈骗提醒1", new d30() { // from class: l.kbc
            public final void call() {
                ark.m5554S0(bVar.K1(), false);
            }
        }));
        arrayList.add(vwb.Y("反诈骗提醒2", new d30() { // from class: l.lbc
            public final void call() {
                CoreDlg.m2342T1(bVar.K1());
            }
        }));
        arrayList.add(vwb.Y("反诈骗提醒3", new d30() { // from class: l.mbc
            public final void call() {
                CoreDlg.m2339S1(bVar.K1(), false);
            }
        }));
        arrayList.add(vwb.Y("new fake", new d30() { // from class: l.obc
            public final void call() {
                wm20.m10524m(bVar.K1());
            }
        }));
        arrayList.add(vwb.Y("语音通话相关", new d30() { // from class: l.pbc
            public final void call() {
                DebugUtil.m4111Zd(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("新喜欢弹窗", new d30() { // from class: l.qbc
            public final void call() {
                NewLikeView.E(bVar.K1(), CoreLikers.a.a(CoreLikers.LikersTriggerBy.normal, 1, 1, vwb.f0(new User[]{CoreModule.K().me_()}), (List) null, (String) null, (Figure) null), new d30() { // from class: l.amc
                    public final void call() {
                        lsi0.y("show  see  dialog");
                    }
                });
            }
        }));
        arrayList.add(vwb.Y("国际化SVIP", new d30() { // from class: l.rbc
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().dialog().e0(vwb.f0(new String[]{"查看喜欢我的人", "清除svip红点记录", "SVIPIntlGuideAct"})).g0(new Dialog.g() { // from class: l.lvc
                    /* JADX INFO: renamed from: a */
                    public final void m7922a(Dialog dialog, View view, int i, CharSequence charSequence) {
                        DebugUtil.m4194d9(bVar2, dialog, view, i, charSequence);
                    }
                }).z0();
            }
        }));
        arrayList.add(vwb.Y("mock first user supper like Me ", new d30() { // from class: l.sbc
            public final void call() {
                DebugUtil.m3692Fj(new DebugUtil.C3238x(), 1);
            }
        }));
        arrayList.add(vwb.Y("mock first user supper like Me And Has Letter", new d30() { // from class: l.ubc
            public final void call() {
                DebugUtil.m3692Fj(new DebugUtil.C3241y(), 1);
            }
        }));
        arrayList.add(vwb.Y("mock user passby 10", new d30() { // from class: l.vbc
            public final void call() {
                DebugUtil.m3692Fj(new DebugUtil.C3244z(), 1);
            }
        }));
        arrayList.add(vwb.Y("mock user is student mock前3张卡片用户学生认证", new d30() { // from class: l.wbc
            public final void call() {
                DebugUtil.m3692Fj(new e30() { // from class: l.loc
                    public final void call(Object obj) {
                        DebugUtil.m3987Tf((User) obj);
                    }
                }, 3);
            }
        }));
        arrayList.add(vwb.Y("mock user  前3张卡用户名字超长", new d30() { // from class: l.xbc
            public final void call() {
                DebugUtil.m3692Fj(new e30() { // from class: l.htc
                    public final void call(Object obj) {
                        DebugUtil.m3632D3((User) obj);
                    }
                }, 3);
            }
        }));
        arrayList.add(vwb.Y("mock user has all tag mock前3张卡片用户有所有标签(不包含朋友圈)", new d30() { // from class: l.zbc
            public final void call() {
                DebugUtil.m3692Fj(new e30() { // from class: l.nwc
                    public final void call(Object obj) {
                        DebugUtil.m3792K9((User) obj);
                    }
                }, 3);
            }
        }));
        arrayList.add(vwb.Y("mock user 共同联系人 2", new d30() { // from class: l.acc
            public final void call() {
                DebugUtil.m3692Fj(new DebugUtil.C3156a0(), 2);
            }
        }));
        arrayList.add(vwb.Y("mock user 共同联系人 10", new d30() { // from class: l.bcc
            public final void call() {
                DebugUtil.m3692Fj(new DebugUtil.C3160b0(), 2);
            }
        }));
        arrayList.add(vwb.Y("mock user 共同联系人 25", new d30() { // from class: l.ccc
            public final void call() {
                DebugUtil.m3692Fj(new DebugUtil.C3164c0(), 2);
            }
        }));
        arrayList.add(vwb.Y("卡片左右切卡引导 状态重制", new d30() { // from class: l.dcc
            public final void call() {
                CoreModule.c.m0.w0.put(Boolean.FALSE);
            }
        }));
        arrayList.add(vwb.Y("后端下发认证实验强制方式 头像认证: " + tvf.b.get(), new d30() { // from class: l.ecc
            public final void call() {
                DebugUtil.m4243fe();
            }
        }));
        arrayList.add(vwb.Y("后端下发认证实验强制方式 实名认证:" + tvf.c.get(), new d30() { // from class: l.gcc
            public final void call() {
                DebugUtil.m3744I5();
            }
        }));
        arrayList.add(vwb.Y("mock profile refactor =" + lra0.l.get(), new d30() { // from class: l.hcc
            public final void call() {
                DebugUtil.m3574Ab();
            }
        }));
        arrayList.add(vwb.Y("mock profile refactor isProfileRefactorWithOutGuide  =" + lra0.m.get(), new d30() { // from class: l.icc
            public final void call() {
                DebugUtil.m3596Bb();
            }
        }));
        arrayList.add(vwb.Y("mock profile card bottom view render   =" + lra0.b.get(), new d30() { // from class: l.kcc
            public final void call() {
                DebugUtil.m4648y2();
            }
        }));
        arrayList.add(vwb.Y("mock profile refactor no about Profile改版-解耦“关于我 =" + lra0.a.get(), new d30() { // from class: l.lcc
            public final void call() {
                DebugUtil.m3653E2();
            }
        }));
        arrayList.add(vwb.Y("mock profile card bottom view debugBlockBottomAboutMe   =" + lra0.c.get(), new d30() { // from class: l.mcc
            public final void call() {
                DebugUtil.m4570uc();
            }
        }));
        arrayList.add(vwb.Y("xxx 新交友目的 筛选 二期实验:" + h7j.a.get(), new d30() { // from class: l.ncc
            public final void call() {
                DebugUtil.m3980T8();
            }
        }));
        arrayList.add(vwb.Y("xxx 新交友目的 筛选 保存资料清空交友目的:" + h7j.b.get(), new d30() { // from class: l.occ
            public final void call() {
                DebugUtil.m4189d4();
            }
        }));
        arrayList.add(vwb.Y("xxx 新交友目的 新弹框", new d30() { // from class: l.pcc
            public final void call() {
                DebugUtil.m3597Bc(bVar);
            }
        }));
        arrayList.add(vwb.Y("xxx 新交友目的 新弹框 划卡一定弹:" + h7j.d.get(), new d30() { // from class: l.qcc
            public final void call() {
                DebugUtil.m4422ni();
            }
        }));
        arrayList.add(vwb.Y("xxx 新交友目的 二期完善资料弹框", new d30() { // from class: l.scc
            public final void call() {
                DebugUtil.m3568A5(bVar);
            }
        }));
        arrayList.add(vwb.Y("mock profile card 卡片原图显示 =" + lra0.e.get(), new d30() { // from class: l.tcc
            public final void call() {
                DebugUtil.m4350kc();
            }
        }));
        arrayList.add(vwb.Y("新喜欢弹窗本地记录清除", new d30() { // from class: l.vcc
            public final void call() {
                ut20.d();
            }
        }));
        arrayList.add(vwb.Y("SVIP双tab购买", new d30() { // from class: l.wcc
            public final void call() {
                com.p1.mobile.putong.core.ui.purchase.c.z0(bVar.K1(), "", Privilege.letter, PurchaseType.TYPE_GET_VIP, (e30) null, 0);
            }
        }));
        arrayList.add(vwb.Y("插入online boost用户", new d30() { // from class: l.xcc
            public final void call() {
                DebugUtil.m4130ab();
            }
        }));
        arrayList.add(vwb.Y("绑定手机号弹窗", new d30() { // from class: l.ycc
            public final void call() {
                b bVar2 = bVar;
                ark.m5546O0(bVar2.K1(), "", new d30() { // from class: l.ivc
                    public final void call() {
                        uq40.y(bVar2.K1(), true);
                    }
                }, false);
            }
        }));
        arrayList.add(vwb.Y("最后一张提前到都一张", new d30() { // from class: l.zcc
            public final void call() {
                DebugUtil.m3618Cb();
            }
        }));
        arrayList.add(vwb.Y("无匹配弹窗", new d30() { // from class: l.adc
            public final void call() {
                CoreModule.c.m0.B0.onNext(roj0.a);
            }
        }));
        arrayList.add(vwb.Y("清除性别fake本地标记", new d30() { // from class: l.bdc
            public final void call() {
                CoreModule.c.e0.q1.put(Boolean.FALSE);
            }
        }));
        arrayList.add(vwb.Y("拍一拍", new d30() { // from class: l.cdc
            public final void call() {
                DebugUtil.m3945Rf(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("列表加载速度优化", new d30() { // from class: l.edc
            public final void call() {
                DebugUtil.m3922Qd(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("群聊 group debug", new d30() { // from class: l.gdc
            public final void call() {
                DebugUtil.m3804L0(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("新配对Congrats开关:".concat(((Boolean) a5x.a.get()).booleanValue() ? "true" : "false"), new d30() { // from class: l.hdc
            public final void call() {
                DebugUtil.m4156bf();
            }
        }));
        arrayList.add(vwb.Y("展示顶部弹窗 x 10", new d30() { // from class: l.idc
            public final void call() {
                DebugUtil.m3771Ja(bVar);
            }
        }));
        arrayList.add(vwb.Y("clear intl fake dialog count", new d30() { // from class: l.jdc
            public final void call() {
                DebugUtil.m4538t2();
            }
        }));
        arrayList.add(vwb.Y("Conversation Counter Verification", new d30() { // from class: l.kdc
            public final void call() {
                DebugUtil.m4641xh(bVar);
            }
        }));
        arrayList.add(vwb.Y("商业化通用【汇总】", new d30() { // from class: l.ldc
            public final void call() {
                DebugUtil.m4280h7(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("商业化AB实验【汇总】", new d30() { // from class: l.mdc
            public final void call() {
                DebugUtil.m4500r8(arrayList, bVar, nt30Var);
            }
        }));
        arrayList.add(vwb.Y("刷新表情数据", new d30() { // from class: l.ndc
            public final void call() {
                CoreModule.c.Z.S.z();
            }
        }));
        arrayList.add(vwb.Y("女性显示喜欢标记" + CoreModule.c.m0.U0.get(), new d30() { // from class: l.odc
            public final void call() {
                DebugUtil.m4159bi();
            }
        }));
        arrayList.add(vwb.Y("清除女性Banner展示时间", new d30() { // from class: l.sdc
            public final void call() {
                CoreModule.c.u0.r0.put(0L);
            }
        }));
        arrayList.add(vwb.Y("展示女性新喜欢Banner", new d30() { // from class: l.tdc
            public final void call() {
                DebugUtil.m4245fg(bVar);
            }
        }));
        arrayList.add(vwb.Y("插入固定的User到顶部", new d30() { // from class: l.udc
            public final void call() {
                DebugUtil.m4622wk(bVar.K1());
            }
        }));
        arrayList.add(vwb.Y("插入固定的User到顶部喜欢我", new d30() { // from class: l.vdc
            public final void call() {
                DebugUtil.m4644xk(bVar.K1(), true, 0);
            }
        }));
        arrayList.add(vwb.Y("查询固定的User", new d30() { // from class: l.wdc
            public final void call() {
                DebugUtil.m3604Bj(bVar.K1());
            }
        }));
        arrayList.add(vwb.Y("插入固定的User到顶部没有喜欢我", new d30() { // from class: l.xdc
            public final void call() {
                DebugUtil.m4644xk(bVar.K1(), false, 0);
            }
        }));
        arrayList.add(vwb.Y("插入固定1的User到顶部没有喜欢我", new d30() { // from class: l.ydc
            public final void call() {
                DebugUtil.m4644xk(bVar.K1(), false, 1);
            }
        }));
        arrayList.add(vwb.Y("插入固定的User到顶部重逢配对", new d30() { // from class: l.zdc
            public final void call() {
                DebugUtil.m4666yk(bVar.K1());
            }
        }));
        arrayList.add(vwb.Y("城市c位广播", new d30() { // from class: l.aec
            public final void call() {
                DebugUtil.m4677z9(bVar);
            }
        }));
        arrayList.add(vwb.Y("消息tab优化 = " + lra0.g0.get(), new d30() { // from class: l.bec
            public final void call() {
                DebugUtil.m3898Pa();
            }
        }));
        arrayList.add(vwb.Y("显示superlike动画", new d30() { // from class: l.eec
            public final void call() {
                b bVar2 = bVar;
                e51.H(bVar2.K1(), new Runnable() { // from class: l.itc
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar2.v6();
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.Y("superlike探探币连送确定", new d30() { // from class: l.fec
            public final void call() {
                b bVar2 = bVar;
                e51.H(bVar2.K1(), new Runnable() { // from class: l.dxc
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar2.m6(99999);
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.Y("显示superlike探探币提示", new d30() { // from class: l.gec
            public final void call() {
                b bVar2 = bVar;
                e51.H(bVar2.K1(), new Runnable() { // from class: l.kwc
                    @Override // java.lang.Runnable
                    public final void run() {
                        b bVar3 = bVar2;
                        rxg0.M(bVar3.q2(), bVar3.z2(), bVar3.C2().getRealView(), 1300);
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.Y("显示superlike长按引导", new d30() { // from class: l.hec
            public final void call() {
                b bVar2 = bVar;
                e51.H(bVar2.K1(), new Runnable() { // from class: l.ksc
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar2.w6(true);
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.Y("展示设置蒙层", new d30() { // from class: l.iec
            public final void call() {
                e51.H(bVar.K1(), new Runnable() { // from class: l.mpc
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m4061X5();
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.Y("所有都有letter", new d30() { // from class: l.jec
            public final void call() {
                DebugUtil.m3628D();
            }
        }));
        arrayList.add(vwb.Y("所有都有新喜欢", new d30() { // from class: l.kec
            public final void call() {
                DebugUtil.m4225ei();
            }
        }));
        arrayList.add(vwb.Y("清除所有标记", new d30() { // from class: l.lec
            public final void call() {
                DebugUtil.m4049We();
            }
        }));
        arrayList.add(vwb.Y("首页蒙层相关", new d30() { // from class: l.mec
            public final void call() {
                DebugUtil.m3860Ne(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("关闭Google地图服务", new d30() { // from class: l.oec
            public final void call() {
                qib0.v = false;
            }
        }));
        arrayList.add(vwb.Y("圣诞活动-选择好友", new d30() { // from class: l.rec
            public final void call() {
                CoreDlg.m2336R1(bVar.K1(), "selectFriends", "选择好友", "每次分享最多选择5位好友", 5, "分享", "最多可以选择5位好友", null, new f30() { // from class: l.hoc
                    public final void call(Object obj, Object obj2) {
                        lsi0.y("选择好友：" + ((String) obj2));
                    }
                });
            }
        }));
        arrayList.add(vwb.Y("圣诞活动-发送消息", new d30() { // from class: l.sec
            public final void call() {
                DebugUtil.m4008Uf(bVar);
            }
        }));
        arrayList.add(vwb.Y("推荐接口的全部用户id", new d30() { // from class: l.tec
            public final void call() {
                DebugUtil.m4223eg();
            }
        }));
        arrayList.add(vwb.Y("测试打电话给28331", new d30() { // from class: l.uec
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().startActivity(MessagesAct.e2(bVar2.K1(), "28331", 31, new j760[]{vwb.Y("ISCALLEER", "1")}));
            }
        }));
        arrayList.add(vwb.Y("接受28331语聊match", new d30() { // from class: l.vec
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().startActivity(MessagesAct.e2(bVar2.K1(), "28331", 31, new j760[]{vwb.Y("ISCALLEER", "0")}));
            }
        }));
        arrayList.add(vwb.Y("语音闪聊充值弹窗", new d30() { // from class: l.wec
            public final void call() {
                swh0.z1(bVar.K1(), "", (g30) null, (d30) null);
            }
        }));
        arrayList.add(vwb.Y("语音闪聊确认弹窗", new d30() { // from class: l.xec
            public final void call() {
                swh0.B1(bVar.K1(), PurchaseType.TYPE_GET_VOICE_ONLINE_MATCH_TICKETS_EXTRA, (d30) null, (d30) null);
            }
        }));
        arrayList.add(vwb.Y("完善资料", new d30() { // from class: l.zec
            public final void call() {
                DebugUtil.m4316j0(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("打开关闭tantanlist " + CoreModule.c.e0.O1.get(), new d30() { // from class: l.afc
            public final void call() {
                DebugUtil.m4261ga();
            }
        }));
        arrayList.add(vwb.Y("跳转到闪聊二楼 ", new d30() { // from class: l.bfc
            public final void call() {
                j2e0.m(bVar.K1(), Uri.parse("tantanapp://quickChat2Floor"));
            }
        }));
        arrayList.add(vwb.Y("跳转See deep", new d30() { // from class: l.dfc
            public final void call() {
                j2e0.m(bVar.K1(), Uri.parse("tantanapp://seeLikes?preferredShowPurchase=false&preferredShowDetail=true"));
            }
        }));
        arrayList.add(vwb.Y("跳转See deep show prchase", new d30() { // from class: l.efc
            public final void call() {
                j2e0.m(bVar.K1(), Uri.parse("tantanapp://seeLikes?preferredShowPurchase=true&preferredShowDetail=true"));
            }
        }));
        arrayList.add(vwb.Y("跳转See deep no jump", new d30() { // from class: l.ffc
            public final void call() {
                j2e0.m(bVar.K1(), Uri.parse("tantanapp://seeLikes?preferredShowPurchase=true&preferredShowDetail=false"));
            }
        }));
        arrayList.add(vwb.Y("跳转遇见 deep see", new d30() { // from class: l.gfc
            public final void call() {
                j2e0.m(bVar.K1(), Uri.parse("tantanapp://myMeet?preferredShowPurchase=false&tab=see"));
            }
        }));
        arrayList.add(vwb.Y("跳转遇见 deep like", new d30() { // from class: l.hfc
            public final void call() {
                j2e0.m(bVar.K1(), Uri.parse("tantanapp://myMeet?preferredShowPurchase=false&tab=like"));
            }
        }));
        arrayList.add(vwb.Y("跳转遇见 deep see  show pur", new d30() { // from class: l.ifc
            public final void call() {
                j2e0.m(bVar.K1(), Uri.parse("tantanapp://myMeet?preferredShowPurchase=true&tab=see"));
            }
        }));
        arrayList.add(vwb.Y("跳转遇见 deep like show pur", new d30() { // from class: l.kfc
            public final void call() {
                j2e0.m(bVar.K1(), Uri.parse("tantanapp://myMeet?preferredShowPurchase=true&tab=like"));
            }
        }));
        arrayList.add(vwb.Y("打开关闭tantanlistDebug " + CoreModule.c.e0.P1.get(), new d30() { // from class: l.lfc
            public final void call() {
                DebugUtil.m3697G2();
            }
        }));
        arrayList.add(vwb.Y("书影剧：dlg2", new d30() { // from class: l.mfc
            public final void call() {
                DebugUtil.m4485qf(bVar);
            }
        }));
        arrayList.add(vwb.Y("书影剧 登录用户评论：", new d30() { // from class: l.nfc
            public final void call() {
                DebugUtil.m3686Fd();
            }
        }));
        arrayList.add(vwb.Y("书影剧 聊一聊 第一次提示: " + CoreModule.c.e0.h2.get(), new d30() { // from class: l.pfc
            public final void call() {
                CoreModule.c.e0.h2.put(Boolean.TRUE);
            }
        }));
        arrayList.add(vwb.Y("展示内部push", new d30() { // from class: l.qfc
            public final void call() {
                bVar.K1().postDelayed(new Runnable() { // from class: l.zvc
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.c.j1.k();
                    }
                }, 1000L);
            }
        }));
        arrayList.add(vwb.Y("展示模拟限时配对", new d30() { // from class: l.rfc
            public final void call() {
                bVar.K1().postDelayed(new Runnable() { // from class: l.xwc
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.c.j1.l();
                    }
                }, 3000L);
            }
        }));
        arrayList.add(vwb.Y("展示选择头像Frag", new d30() { // from class: l.sfc
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().postDelayed(new Runnable() { // from class: l.qkc
                    @Override // java.lang.Runnable
                    public final void run() {
                        new MediaRecorderFrag().show(bVar2.K1().getSupportFragmentManager(), "update_avatar");
                    }
                }, 500L);
            }
        }));
        arrayList.add(vwb.Y("打开丰富资料debug入口：" + com.p1.mobile.putong.core.newui.messages.a.f.get(), new d30() { // from class: l.tfc
            public final void call() {
                DebugUtil.m4660ye();
            }
        }));
        arrayList.add(vwb.Y("丰富资料用户是否需要跳转打招呼：", new d30() { // from class: l.vfc
            public final void call() {
                b bVar2 = bVar;
                i0e.d(bVar2.K1()).r("input the user id").F(new e30() { // from class: l.owc
                    public final void call(Object obj) {
                        DebugUtil.m4298i3(bVar2, (String) obj);
                    }
                }).n().show();
            }
        }));
        arrayList.add(vwb.Y("触发丰富资料(线上url)：" + com.p1.mobile.putong.core.newui.messages.a.f.get(), new d30() { // from class: l.wfc
            public final void call() {
                DebugUtil.m3855N9();
            }
        }));
        arrayList.add(vwb.Y("触发丰富资料结束语：" + CoreModule.c.f0.X0.get(), new d30() { // from class: l.xfc
            public final void call() {
                DebugUtil.m3868O1();
            }
        }));
        arrayList.add(vwb.Y("打开丰富资料debug入口有效时间：" + com.p1.mobile.putong.core.newui.messages.a.f.get(), new d30() { // from class: l.yfc
            public final void call() {
                CoreModule.c.e0.Q1.put(Long.valueOf(mqi0.o() + (((long) (upa.b0() * 86400)) * 1000)));
            }
        }));
        arrayList.add(vwb.Y("清空丰富资料本地数据：" + com.p1.mobile.putong.core.newui.messages.a.f.get(), new d30() { // from class: l.zfc
            public final void call() {
                DebugUtil.m4419nf();
            }
        }));
        arrayList.add(vwb.Y("mock 完成来填写", new d30() { // from class: l.bgc
            public final void call() {
                CoreModule.c.f0.ln();
            }
        }));
        arrayList.add(vwb.Y("mock 打开应用", new d30() { // from class: l.cgc
            public final void call() {
                bVar.a.postDelayed(new Runnable() { // from class: l.lmc
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.c.f0.up();
                    }
                }, 3000L);
            }
        }));
        arrayList.add(vwb.Y("丰富资料修改成finished", new d30() { // from class: l.dgc
            public final void call() {
                DebugUtil.m4400mi(bVar);
            }
        }));
        arrayList.add(vwb.Y("丰富资料修改成not-finished", new d30() { // from class: l.egc
            public final void call() {
                DebugUtil.m3800Kh(bVar);
            }
        }));
        arrayList.add(vwb.Y("修改briefIntroduction改为我是一个up主", new d30() { // from class: l.ggc
            public final void call() {
                DebugUtil.m3871O4(bVar);
            }
        }));
        arrayList.add(vwb.Y("动态打招呼二期男性气泡文案设置为false", new d30() { // from class: l.hgc
            public final void call() {
                CoreModule.c.r0.c0.put(Boolean.FALSE);
            }
        }));
        arrayList.add(vwb.Y("心动信号", new d30() { // from class: l.igc
            public final void call() {
                DebugUtil.m3793Ka(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("消息合规", new d30() { // from class: l.jgc
            public final void call() {
                DebugUtil.m4264gd(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("解析ListDemo", new d30() { // from class: l.kgc
            public final void call() {
                JsonParseHelper.parseList("[{\n\t\"convType\": \"defalut\"\n}, {\n\t\"convType\": \"hahah\"\n}]", Conversation.JSON_ADAPTER).size();
            }
        }));
        arrayList.add(vwb.Y("交友目的全量,严肃弹框", new d30() { // from class: l.lgc
            public final void call() {
                h7j.b0(bVar.K1());
            }
        }));
        arrayList.add(vwb.Y("新标签，弹框添加标签", new d30() { // from class: l.ngc
            public final void call() {
                DebugUtil.m3901Pd(bVar);
            }
        }));
        arrayList.add(vwb.Y("新标签，测试queryTags", new d30() { // from class: l.ogc
            public final void call() {
                DebugUtil.m4537t1();
            }
        }));
        arrayList.add(vwb.Y("新标签，测试ffirstLeftSlide.put(true)", new d30() { // from class: l.pgc
            public final void call() {
                new hpd0("first_left_slide_" + CoreModule.H().userId(), Boolean.FALSE).put(Boolean.TRUE);
            }
        }));
        arrayList.add(vwb.Y("标签找人页-跳转profile-输入userId", new d30() { // from class: l.rgc
            public final void call() {
                b bVar2 = bVar;
                i0e.d(bVar2.K1()).D(10).r("input the user id").F(new e30() { // from class: l.fxc
                    public final void call(Object obj) {
                        b bVar3 = bVar2;
                        String str2 = (String) obj;
                        bVar3.K1().duringCreated(CoreModule.K().userObsById(str2)).take(1).subscribe(mkd0.G(new e30() { // from class: l.t8d
                            public final void call(Object obj2) {
                                b bVar4 = bVar3;
                                bVar4.K1().startActivity(CoreModule.K().m5071Ar(bVar4.K1(), str2, "from_mew_tags", false));
                            }
                        }));
                    }
                }).n().show();
            }
        }));
        arrayList.add(vwb.Y("书影剧三期最大添加个数 = " + CoreModule.c.s1.S.get(), new d30() { // from class: l.sgc
            public final void call() {
                CoreModule.c.s1.S.put(10);
            }
        }));
        arrayList.add(vwb.Y("心动信号引导添加标签", new d30() { // from class: l.tgc
            public final void call() {
                DebugUtil.m4101Z3(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("触发破冰插卡", new d30() { // from class: l.ugc
            public final void call() {
                bVar.K1().duringCreated(CoreModule.c.e0.q7("card")).subscribe(mkd0.H(new e30() { // from class: l.cvc
                    public final void call(Object obj) {
                        DebugUtil.m4427o1((List) obj);
                    }
                }, new e30() { // from class: l.dvc
                    public final void call(Object obj) {
                        DebugUtil.m4134af((Throwable) obj);
                    }
                }));
            }
        }));
        arrayList.add(vwb.Y("触发破冰弹窗", new d30() { // from class: l.vgc
            public final void call() {
                b bVar2 = bVar;
                bVar2.K1().duringCreated(CoreModule.c.e0.q7(CoreGiftPanelName.chat)).subscribe(mkd0.H(new e30() { // from class: l.omc
                    public final void call(Object obj) {
                        DebugUtil.m4349kb(bVar2, (List) obj);
                    }
                }, new e30() { // from class: l.pmc
                    public final void call(Object obj) {
                        DebugUtil.m4340k2((Throwable) obj);
                    }
                }));
            }
        }));
        m4357kj(arrayList, bVar);
        m4335jj(arrayList, bVar);
        m3626Cj(arrayList, bVar);
        m4665yj(arrayList, bVar);
        m3648Dj(arrayList, bVar);
        m4248fj(arrayList, bVar);
        m4204dj(arrayList, bVar);
        m4379lj(arrayList, bVar);
        m3582Aj(arrayList, bVar);
        m4054Wj(arrayList, bVar);
        arrayList.add(vwb.Y("心动信号--引导标签填写", new d30() { // from class: l.wgc
            public final void call() {
                sa40.o().F(bVar.q2(), CoreModule.H().userId(), "from_card_tag_guide", TabName.Card.name(), 3002);
            }
        }));
        arrayList.add(vwb.Y("打开&关闭过热：" + C3135d.f1848a, new d30() { // from class: l.xgc
            public final void call() {
                C3135d.f1848a = !C3135d.f1848a;
            }
        }));
        arrayList.add(vwb.Y("升温", new d30() { // from class: l.zgc
            public final void call() {
                DebugUtil.m3591B6(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("设置新版聊天升温温度：" + CoreModule.c.e0.t2.get(), new d30() { // from class: l.ahc
            public final void call() {
                i0e.d(bVar.K1()).I("输入温度").E(1).D(80).F(new e30() { // from class: l.muc
                    public final void call(Object obj) {
                        DebugUtil.m4581v1((String) obj);
                    }
                }).n().show();
            }
        }));
        arrayList.add(vwb.Y("划卡优化开", new d30() { // from class: l.chc
            public final void call() {
                DebugUtil.m3785K2(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("插卡管控：" + CoreModule.c.Y0.i.get(), new d30() { // from class: l.dhc
            public final void call() {
                CoreModule.c.Y0.i.put(0L);
            }
        }));
        arrayList.add(vwb.Y("测试桥", new d30() { // from class: l.ehc
            public final void call() {
                DebugUtil.m3816Lc(bVar);
            }
        }));
        arrayList.add(vwb.Y("插入认证问询卡片：", new d30() { // from class: l.fhc
            public final void call() {
                CoreModule.c.B0.U3().subscribe(mkd0.G(new e30() { // from class: l.kxc
                    public final void call(Object obj) {
                        DebugUtil.m4679zb((j760) obj);
                    }
                }));
            }
        }));
        arrayList.add(vwb.Y("选择消息帧改版实验：" + f2199g.get(), new d30() { // from class: l.ghc
            public final void call() {
                i0e.d(bVar.K1()).I("输入实验").E(1).D(80).F(new e30() { // from class: l.nnc
                    public final void call(Object obj) {
                        DebugUtil.m4123a4((String) obj);
                    }
                }).n().show();
            }
        }));
        arrayList.add(vwb.Y("甩尾逻辑:" + f2200h.get(), new d30() { // from class: l.hhc
            public final void call() {
                DebugUtil.m3746I7();
            }
        }));
        arrayList.add(vwb.Y("图文审核中台化", new d30() { // from class: l.ihc
            public final void call() {
                DebugUtil.m3854N8(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("消息红点脱敏", new d30() { // from class: l.jhc
            public final void call() {
                DebugUtil.m4613wb(arrayList, bVar);
            }
        }));
        arrayList.add(vwb.Y("国际化跳转打招呼：", new d30() { // from class: l.lhc
            public final void call() {
                b bVar2 = bVar;
                i0e.d(bVar2.K1()).r("input the user id").F(new e30() { // from class: l.hpc
                    public final void call(Object obj) {
                        DebugUtil.m3978T6(bVar2, (String) obj);
                    }
                }).n().show();
            }
        }));
        m4117Zj(arrayList, bVar);
        m3758Ij(arrayList, bVar);
        m4358kk(arrayList, bVar);
        m4139ak(arrayList, bVar);
        m4183ck(arrayList, bVar);
        m4033Vj(arrayList, bVar);
        m3802Kj(arrayList, bVar);
        m4490qk(arrayList, bVar);
        m3906Pi(arrayList, bVar);
        m3969Si(arrayList, bVar);
        m3780Jj(arrayList, bVar);
        m4380lk(arrayList, bVar);
        m3583Ak(arrayList, bVar);
        m3627Ck(arrayList, bVar);
        m3693Fk(arrayList, bVar);
        m3779Ji(arrayList, bVar);
        m3990Ti(arrayList, bVar);
        m3948Ri(arrayList, bVar);
        m4314ik(arrayList, bVar);
        m3757Ii(arrayList, bVar);
        m3649Dk(arrayList, bVar);
        m4160bj(arrayList, bVar);
        m3885Oi(arrayList, bVar);
        m4336jk(arrayList, bVar);
        HashMap map = new HashMap();
        map.put("资产配图", CoreModule.c.e0.H3);
        map.put("资料页体验优化", CoreModule.c.e0.O3);
        map.put("书影剧pic2txt", CoreModule.c.e0.t6);
        m3735Hi(arrayList, bVar, map);
        m4053Wi(arrayList, bVar);
        m3781Jk(arrayList, bVar);
        m3865Nj(arrayList, bVar);
        m3691Fi(arrayList, bVar);
        m3715Gk(arrayList, bVar);
        m4424nk(arrayList, bVar);
        m3801Ki(arrayList, bVar);
        m4402mk(arrayList, bVar);
        m4556tk(arrayList, bVar);
        m3671Ek(arrayList, bVar);
        m4096Yj(arrayList, bVar);
        m3886Oj(arrayList, bVar);
        m4074Xi(arrayList, bVar);
        m4011Ui(arrayList, bVar);
        m3907Pj(arrayList, bVar);
        m4227ek(arrayList, bVar);
        m4293hk(arrayList, bVar);
        m4271gk(arrayList, bVar);
        m3843Mi(arrayList, bVar);
        m4512rk(arrayList, bVar);
        m3736Hj(arrayList, bVar);
        m3759Ik(arrayList, bVar);
        m4249fk(arrayList, bVar);
        m4032Vi(arrayList, bVar);
        m3991Tj(arrayList, bVar);
        m3970Sj(arrayList, bVar);
        m4012Uj(arrayList, bVar);
        m4161bk(arrayList, bVar);
        m4468pk(arrayList, bVar);
        m4095Yi(arrayList, bVar);
        m3927Qi(arrayList, bVar);
        m3864Ni(arrayList, bVar);
        m3737Hk(arrayList, bVar);
        m3949Rj(arrayList, bVar);
        m3605Bk(arrayList, bVar);
        m4687zj(arrayList, bVar);
        m4555tj(arrayList, bVar);
        m4489qj(arrayList, bVar);
        m4511rj(arrayList, bVar);
        m4599vj(arrayList, bVar);
        m4401mj(arrayList, bVar);
        m4621wj(arrayList, bVar);
        m4577uj(arrayList, bVar);
        m4533sj(arrayList, bVar);
        m4292hj(arrayList, bVar);
        return arrayList;
    }

    /* JADX INFO: renamed from: xk */
    public static void m4644xk(final Act act, final boolean z, final int i) {
        i0e.d(act).D(10).r("输入插入Userid").F(new e30() { // from class: l.gwc
            public final void call(Object obj) {
                Act act2 = act;
                e51.H(act2, new Runnable() { // from class: l.o6d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m4445oj(str, act2, z, i);
                    }
                }, 1000L);
            }
        }).n().show();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m4645y(Throwable th) {
    }

    /* JADX INFO: renamed from: y1 */
    public static /* synthetic */ void m4647y1(ArrayList arrayList, b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("ab", new d30() { // from class: l.i9d
            public final void call() {
                DebugUtil.m4276h3();
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: y2 */
    public static /* synthetic */ void m4648y2() {
        hpd0 hpd0Var = lra0.b;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: y5 */
    public static /* synthetic */ void m4651y5() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.AdCard;
        userInfo.id = "VirtualCard";
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        List listH = ic50.j().h();
        if (vwb.J(listH)) {
            return;
        }
        userInfo.extensionObject = listH.get(0);
        CoreModule.c.m0.w6(userInfo, 3);
        CoreModule.c.m0.S1.put(userInfo, 3);
    }

    /* JADX INFO: renamed from: y6 */
    public static /* synthetic */ void m4652y6() {
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
    public static /* synthetic */ void m4653y7(b bVar) {
        ae70 ae70Var = new ae70(bVar.K1(), CoreModule.c.e0.p9(), SwipeDirection.UP);
        ae70Var.x(CorePopLevel.PICKS_GUIDE);
        hdb0.c().i(ae70Var);
    }

    /* JADX INFO: renamed from: ya */
    public static /* synthetic */ void m4656ya(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("VIP购买弹窗", new d30() { // from class: l.k1d
            public final void call() {
                com.p1.mobile.putong.core.ui.purchase.c.I1(bVar.K1(), "");
            }
        }));
        arrayList.add(vwb.Y("SVIP购买弹窗", new d30() { // from class: l.l1d
            public final void call() {
                com.p1.mobile.putong.core.ui.purchase.c.w0(bVar.K1(), "");
            }
        }));
        arrayList.add(vwb.Y("白金会员", new d30() { // from class: l.m1d
            public final void call() {
                com.p1.mobile.putong.core.ui.purchase.c.n0(bVar.K1(), "");
            }
        }));
        arrayList.add(vwb.Y("黑金会员购买弹窗", new d30() { // from class: l.n1d
            public final void call() {
                com.p1.mobile.putong.core.ui.purchase.c.a0(bVar.K1(), "", (e30) null, (d30) null, (d30) null, Privilege.oDiamondGreetings);
            }
        }));
        arrayList.add(vwb.Y("精选购买弹窗", new d30() { // from class: l.p1d
            public final void call() {
                com.p1.mobile.putong.core.ui.purchase.c.r1(bVar.K1(), "");
            }
        }));
        arrayList.add(vwb.Y("每日心动购买弹窗", new d30() { // from class: l.q1d
            public final void call() {
                DebugUtil.m4586v6(bVar);
            }
        }));
        arrayList.add(vwb.Y("VIP过期弹窗", new d30() { // from class: l.r1d
            public final void call() {
                ok3.m8474M(bVar.K1());
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: yc */
    public static /* synthetic */ void m4658yc() {
        hpd0 hpd0Var = CoreModule.c.e0.a4;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        CoreModule.c.e0.F1.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: yd */
    public static /* synthetic */ void m4659yd() {
        hpd0 hpd0Var = r9m.i;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: ye */
    public static /* synthetic */ void m4660ye() {
        hpd0 hpd0Var = com.p1.mobile.putong.core.newui.messages.a.f;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        CoreModule.c.f0.V0.put("xxxurl=http://m.staging2.p1staff.com/app-pages/commerce/newuserguide?category=0");
        c cVar = CoreModule.c;
        cVar.f0.T0.put(upa.c0(cVar.e0.p9()));
        c cVar2 = CoreModule.c;
        cVar2.f0.S0.put(upa.Z(cVar2.e0.p9()));
    }

    /* JADX INFO: renamed from: yi */
    public static /* synthetic */ void m4664yi(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("SVIP单tab购买弹窗-打招呼", new d30() { // from class: l.f8d
            public final void call() {
                com.p1.mobile.putong.core.ui.purchase.c.v0(bVar.K1());
            }
        }));
        arrayList.add(vwb.Y("打招呼消耗探币提示弹窗", new d30() { // from class: l.g8d
            public final void call() {
                CoreModule.o.d().jf(bVar.K1(), CoreModule.c.H0.t5(), (Runnable) null, (Runnable) null, (d30) null);
            }
        }));
        arrayList.add(vwb.Y("打招呼 探探币消耗 不再提醒 重置", new d30() { // from class: l.h8d
            public final void call() {
                swh0.p0().R0(false);
            }
        }));
        arrayList.add(vwb.Y("打招呼 探币不足充值弹窗", new d30() { // from class: l.i8d
            public final void call() {
                CoreModule.P().g().Pk(bVar.K1(), "debug", (e30) null);
            }
        }));
        arrayList.add(vwb.Y("打招呼 礼物引导动画重置", new d30() { // from class: l.j8d
            public final void call() {
                DebugUtil.m4493r1();
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: yj */
    public static void m4665yj(ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("国际化 同道中人", new d30() { // from class: l.dmc
            public final void call() {
                com.p1.mobile.putong.core.ui.likeminded.a.INSTANCE.f(bVar.K1(), true);
            }
        }));
    }

    /* JADX INFO: renamed from: yk */
    public static void m4666yk(final Act act) {
        i0e.d(act).D(10).r("输入插入Userid").F(new e30() { // from class: l.qrc
            public final void call(Object obj) {
                Act act2 = act;
                e51.H(act2, new Runnable() { // from class: l.szc
                    @Override // java.lang.Runnable
                    public final void run() {
                        DebugUtil.m4467pj(str, act2);
                    }
                }, 1000L);
            }
        }).n().show();
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m4667z(ArrayList arrayList, final nt30 nt30Var, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("试用真实头像用户特权插卡", new d30() { // from class: l.m2d
            public final void call() {
                vyc0.m10410q();
            }
        }));
        arrayList.add(vwb.Y("试用优先看最受欢迎用户", new d30() { // from class: l.q2d
            public final void call() {
                vyc0.m10409p();
            }
        }));
        arrayList.add(vwb.Y("试用优先看在线用户", new d30() { // from class: l.r2d
            public final void call() {
                vyc0.m10408o();
            }
        }));
        arrayList.add(vwb.Y("试用未读", new d30() { // from class: l.s2d
            public final void call() {
                uyc0.l0().t0(nt30Var.T4(), "haveRead", "");
            }
        }));
        arrayList.add(vwb.Y("设置可以弹出真实用户气泡", new d30() { // from class: l.t2d
            public final void call() {
                DebugUtil.m4256g5();
            }
        }));
        arrayList.add(vwb.Y("设置可以弹出在线气泡", new d30() { // from class: l.u2d
            public final void call() {
                uyc0.l0().n0(true);
            }
        }));
        arrayList.add(vwb.Y("开始使用提示", new d30() { // from class: l.w2d
            public final void call() {
                vyc0.m10411r(nt30Var.T4(), "已优先看最受欢迎用户！");
            }
        }));
        arrayList.add(vwb.Y("使用结束棋牌提示", new d30() { // from class: l.x2d
            public final void call() {
                vyc0.m10411r(nt30Var.T4(), "最受欢迎用户筛选试用完成！");
            }
        }));
        arrayList.add(vwb.Y("结束弹窗真实头像", new d30() { // from class: l.y2d
            public final void call() {
                uyc0.l0().s0(nt30Var.T4(), VisitorSortType.realUser);
            }
        }));
        arrayList.add(vwb.Y("结束弹窗优先推荐", new d30() { // from class: l.z2d
            public final void call() {
                uyc0.l0().s0(nt30Var.T4(), "popular");
            }
        }));
        arrayList.add(vwb.Y("结束弹窗在线", new d30() { // from class: l.n2d
            public final void call() {
                uyc0.l0().s0(nt30Var.T4(), "online");
            }
        }));
        arrayList.add(vwb.Y("结束弹窗已读", new d30() { // from class: l.o2d
            public final void call() {
                uyc0.l0().s0(nt30Var.T4(), "haveRead");
            }
        }));
        arrayList.add(vwb.Y("气泡测试", new d30() { // from class: l.p2d
            public final void call() {
                DebugUtil.m4502ra(bVar);
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m4668z0(ArrayList arrayList, b bVar) {
        final boolean zBooleanValue = ((Boolean) CoreModule.c.f0.z1.get()).booleanValue();
        final boolean zBooleanValue2 = ((Boolean) CoreModule.c.f0.y1.get()).booleanValue();
        arrayList.clear();
        arrayList.add(vwb.Y("清推荐新配对 Sp " + zBooleanValue, new d30() { // from class: l.u6d
            public final void call() {
                CoreModule.c.f0.z1.put(Boolean.valueOf(!zBooleanValue));
            }
        }));
        arrayList.add(vwb.Y("清快捷表情消息 Sp " + zBooleanValue2, new d30() { // from class: l.v6d
            public final void call() {
                CoreModule.c.f0.y1.put(Boolean.valueOf(!zBooleanValue2));
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: z1 */
    public static /* synthetic */ void m4669z1(nt30 nt30Var, b bVar, String str) {
        nt30Var.P = ((DbObject) bVar.A2().o().d()).id;
        nt30Var.Q = str;
        nt30Var.i9(true);
    }

    /* JADX INFO: renamed from: z2 */
    public static /* synthetic */ void m4670z2(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("收到Push喜欢  newMaleUserLike.received", new d30() { // from class: l.pwc
            public final void call() {
                DebugUtil.m3682F9();
            }
        }));
        arrayList.add(vwb.Y("收到Push喜欢  newMaleUserLike.send", new d30() { // from class: l.qwc
            public final void call() {
                DebugUtil.m4265ge();
            }
        }));
        arrayList.add(vwb.Y("收到Push喜欢逻辑 delay 1s", new d30() { // from class: l.rwc
            public final void call() {
                e51.I(bVar.q2(), new Runnable() { // from class: l.m8d
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.c.m0.K5();
                    }
                }, 1000L);
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: z4 */
    public static /* synthetic */ void m4672z4(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("单Tab模式（payWillScore>=0.19）", new d30() { // from class: l.o8d
            public final void call() {
                DebugUtil.m3654E3(bVar);
            }
        }));
        arrayList.add(vwb.Y("双Tab模式（payWillScore<0.19）", new d30() { // from class: l.p8d
            public final void call() {
                DebugUtil.m4202dh(bVar);
            }
        }));
        arrayList.add(vwb.Y("测试顶部通知弹层", new d30() { // from class: l.q8d
            public final void call() {
                b bVar2 = bVar;
                bo5.m5762p(bVar2.K1(), DebugUtil.m3823Lj(bVar2), "Wow, seriously! You look absolutely ripped in that photo! 💪");
            }
        }));
        arrayList.add(vwb.Y("顶部卡片添加 compliment", new d30() { // from class: l.r8d
            public final void call() {
                DebugUtil.m3580Ah(bVar);
            }
        }));
        arrayList.add(vwb.Y("收到称赞用户插入到卡片栈顶部", new d30() { // from class: l.s8d
            public final void call() {
                DebugUtil.m4187d2(bVar);
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: z6 */
    public static /* synthetic */ void m4674z6() {
        hpd0 hpd0Var = lra0.a0;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: z7 */
    public static /* synthetic */ void m4675z7() {
        ((CoreSuggested.UserInfo) ((PartialListOpt) CoreModule.c.m0.a0.e()).loaded.get(1)).payCardStyle = CoreGiftPanelName.chat;
        ((PartialListOpt) CoreModule.c.m0.a0.e()).setRefreshValue(true);
        rx.subjects.a aVar = CoreModule.c.m0.a0;
        aVar.onNext(((PartialListOpt) aVar.e()).setReason(PartialListOpt.RefreshReason.NOTIFY_INNER));
    }

    /* JADX INFO: renamed from: z8 */
    public static /* synthetic */ void m4676z8() {
        hpd0 hpd0Var = lra0.F;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
        lra0.G.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: z9 */
    public static /* synthetic */ void m4677z9(b bVar) {
        final CityCData cityCDataNew_ = CityCData.new_();
        cityCDataNew_.userId = CoreModule.H().userId();
        cityCDataNew_.cardTag = "豪掷50000探币占领封面";
        e51.H(bVar.K1(), new Runnable() { // from class: l.kvc
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.c.h2.S.onNext(cityCDataNew_);
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: za */
    public static /* synthetic */ void m4678za() {
        zpd0 zpd0Var = new zpd0("marry_guide_dlg_show_date_" + CoreModule.H().userId(), 0L);
        zpd0 zpd0Var2 = new zpd0("marry_guide_dlg_show_times_" + CoreModule.H().userId(), 0L);
        String str = "marry_guide_show_by_quality_" + CoreModule.H().userId();
        Boolean bool = Boolean.FALSE;
        hpd0 hpd0Var = new hpd0(str, bool);
        zpd0Var.put(0L);
        zpd0Var2.put(0L);
        hpd0Var.put(bool);
        CoreModule.c.e0.O4.put(0L);
        CoreModule.c.e0.I4.put(bool);
        CoreModule.c.e0.J4.put(0);
        CoreModule.c.e0.K4.put(0L);
        CoreModule.c.e0.L4.put(bool);
        CoreModule.c.e0.M4.put(0);
    }

    /* JADX INFO: renamed from: zb */
    public static /* synthetic */ void m4679zb(j760 j760Var) {
        if (vwb.J((Collection) j760Var.a)) {
            return;
        }
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.QuestionOfNotVerify;
        userInfo.id = "VirtualCard";
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.c.m0.w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: zd */
    public static /* synthetic */ void m4681zd(ArrayList arrayList, final b bVar) {
        arrayList.clear();
        arrayList.add(vwb.Y("VIP", new d30() { // from class: l.t9d
            public final void call() {
                new r5b0.a(bVar.K1()).h(vwb.f0(new PurchaseType[]{PurchaseType.TYPE_GET_VIP}), vwb.f0(new Privilege[]{Privilege.vip_super_like})).b("debug").j();
            }
        }));
        arrayList.add(vwb.Y("SVIP", new d30() { // from class: l.u9d
            public final void call() {
                new r5b0.a(bVar.K1()).h(vwb.f0(new PurchaseType[]{PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE}), vwb.f0(new Privilege[]{Privilege.see_who_likes_me})).b("debug").j();
            }
        }));
        arrayList.add(vwb.Y("ODiamond", new d30() { // from class: l.v9d
            public final void call() {
                new r5b0.a(bVar.K1()).h(vwb.f0(new PurchaseType[]{PurchaseType.TYPE_O_DIAMOND}), vwb.f0(new Privilege[]{Privilege.immediately_match})).b("debug").j();
            }
        }));
        arrayList.add(vwb.Y("FemaleVIP", new d30() { // from class: l.w9d
            public final void call() {
                new r5b0.a(bVar.K1()).h(vwb.f0(new PurchaseType[]{PurchaseType.TYPE_FEMALE_VIP}), vwb.f0(new Privilege[]{Privilege.pick_tantan_credits_users})).b("debug").j();
            }
        }));
        arrayList.add(vwb.Y("YouthVIP", new d30() { // from class: l.x9d
            public final void call() {
                new r5b0.a(bVar.K1()).h(vwb.f0(new PurchaseType[]{PurchaseType.TYPE_YOUTH_VIP}), vwb.f0(new Privilege[]{Privilege.youth_roaming})).b("debug").j();
            }
        }));
        arrayList.add(vwb.Y("VIP+SVIP-默认vip", new d30() { // from class: l.y9d
            public final void call() {
                new r5b0.a(bVar.K1()).h(vwb.f0(new PurchaseType[]{PurchaseType.TYPE_GET_VIP, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE}), vwb.f0(new Privilege[]{Privilege.vip_location, Privilege.svip_badge})).b("debug").i(0).j();
            }
        }));
        arrayList.add(vwb.Y("VIP+SVIP-默认svip", new d30() { // from class: l.z9d
            public final void call() {
                new r5b0.a(bVar.K1()).h(vwb.f0(new PurchaseType[]{PurchaseType.TYPE_GET_VIP, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE}), vwb.f0(new Privilege[]{Privilege.vip_location, Privilege.svip_badge})).b("debug").i(1).j();
            }
        }));
        bVar.K1().showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: ze */
    public static /* synthetic */ void m4682ze() {
        hpd0 hpd0Var = CoreModule.c.e0.A4;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: zh */
    public static /* synthetic */ void m4685zh(b bVar) {
        q3h0.C3407b c3407b = new q3h0.C3407b();
        c3407b.m8907a(1);
        c3407b.m8908b(CoreModule.K().getUserById(CoreModule.c.m0.q6()));
        c3407b.m8909c(bVar.K1());
    }

    /* JADX INFO: renamed from: zi */
    public static /* synthetic */ void m4686zi(GreetingSummary greetingSummary) {
        greetingSummary.unseen = 100;
        greetingSummary.latestTime = mqi0.o();
        greetingSummary.latestUserId = ((DbObject) CoreModule.c.e0.p9()).id;
        CoreModule.c.r0.d0.onNext(greetingSummary);
    }

    /* JADX INFO: renamed from: zj */
    public static void m4687zj(final ArrayList<j760<String, d30>> arrayList, final b bVar) {
        arrayList.add(vwb.Y("我的Tab兼容V2", new d30() { // from class: l.msc
            public final void call() {
                DebugUtil.m4352ke(arrayList, bVar);
            }
        }));
    }

    /* JADX INFO: renamed from: zk */
    public static void m4688zk(User user, Act act) {
        Dialog.e eVarDialog = act.dialog();
        eVarDialog.G0("用户位置信息：" + user.name);
        StringBuilder sb = new StringBuilder("距离:");
        sb.append(user.location.distance);
        if (NullChecker.a(user.location.region)) {
            sb.append("\n国家:");
            sb.append(user.location.region.country);
            sb.append("\n城市:");
            sb.append(user.location.region.city);
            sb.append("\n地区:");
            sb.append(user.location.region.district);
        }
        eVarDialog.F(sb.toString());
        eVarDialog.z0();
    }
}
