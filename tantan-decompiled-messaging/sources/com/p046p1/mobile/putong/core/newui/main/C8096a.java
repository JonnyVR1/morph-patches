package com.p046p1.mobile.putong.core.newui.main;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.android.billingclient.api.AbstractC0865a;
import com.clevertap.android.sdk.Constants;
import com.google.common.base.Optional;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.ExtraActLifecycle;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.putong.api.api.PaymentApi;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.app.surveysparrow.SurveySparrowHelper;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.api.C4736e;
import com.p046p1.mobile.putong.core.api.C4737e0;
import com.p046p1.mobile.putong.core.api.C4740g;
import com.p046p1.mobile.putong.core.api.C4743i;
import com.p046p1.mobile.putong.core.api.CoreInnerPush;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.EmojiAnimData;
import com.p046p1.mobile.putong.core.data.Explore;
import com.p046p1.mobile.putong.core.data.Figure;
import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.core.data.GreetingSummary;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p046p1.mobile.putong.core.data.InsertConversationUser;
import com.p046p1.mobile.putong.core.data.InsertConversationsList;
import com.p046p1.mobile.putong.core.data.IntlThirdQuickLoginEnvelope;
import com.p046p1.mobile.putong.core.data.IntlTribeBubble;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.MonetizationConfiguration;
import com.p046p1.mobile.putong.core.data.PopGuide;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.RegionRule;
import com.p046p1.mobile.putong.core.data.RegionRuleTag;
import com.p046p1.mobile.putong.core.data.RiskSelfData;
import com.p046p1.mobile.putong.core.data.SeeExposedUser;
import com.p046p1.mobile.putong.core.data.SeeSwitchName;
import com.p046p1.mobile.putong.core.data.TtcMigrateDisplayData;
import com.p046p1.mobile.putong.core.data.UserFeedbackInfo;
import com.p046p1.mobile.putong.core.data.UserHomeMode;
import com.p046p1.mobile.putong.core.data.UserLiveHierarchy;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.data.VisitorDoorInfo;
import com.p046p1.mobile.putong.core.newui.admob.NavigationBarAdmobHelper;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p046p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p046p1.mobile.putong.core.newui.home.frag.base.HomeLayoutFrag;
import com.p046p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p046p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeMeetFrag;
import com.p046p1.mobile.putong.core.newui.main.C8096a;
import com.p046p1.mobile.putong.core.newui.messages.C8140a;
import com.p046p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p046p1.mobile.putong.core.newui.messages.ConversationsTabFrag;
import com.p046p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p046p1.mobile.putong.core.newui.profile.ProfileFrag;
import com.p046p1.mobile.putong.core.newui.ttcmigrate.TtcAccountMigrateDisplayAct;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.BuzzComboFrag;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.pop.LoveBuzzNotifyUserPop;
import com.p046p1.mobile.putong.core.p053ui.marry.audit.MarryInfoAuditStatusAct;
import com.p046p1.mobile.putong.core.p053ui.p055gp.C8346a;
import com.p046p1.mobile.putong.data.ADInfo;
import com.p046p1.mobile.putong.data.BannerLoc;
import com.p046p1.mobile.putong.data.ConversationCounter;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.DeeplinkReport;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.LinkAction;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.NavigationCardIntent;
import com.p046p1.mobile.putong.data.OMSADLink;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.OMSLauncherInfo;
import com.p046p1.mobile.putong.data.OmsMerCuryData;
import com.p046p1.mobile.putong.data.Purpose;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.data.VerificationNetworkData;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationActionAfterCountdown;
import com.p046p1.mobile.putong.location.AbstractC13063a;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.LauncherView;
import com.p046p1.mobile.putong.p065ui.webview.AccessTokenWebViewAct;
import com.p046p1.mobile.putong.p065ui.webview.WebViewDialogAct;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p046p1.mobile.putong.util.launch.LaunchStep;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.share.QQShare;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.Notification;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;
import p149l.C16281d;
import p149l.a130;
import p149l.aaj;
import p149l.abi;
import p149l.aqo;
import p149l.b1c;
import p149l.b83;
import p149l.bcp;
import p149l.bs30;
import p149l.bzc0;
import p149l.c30;
import p149l.c4g0;
import p149l.cfx;
import p149l.d30;
import p149l.ddj0;
import p149l.du2;
import p149l.e010;
import p149l.e30;
import p149l.e4w;
import p149l.e51;
import p149l.e5s;
import p149l.e900;
import p149l.f6c0;
import p149l.f8c;
import p149l.g6a;
import p149l.g70;
import p149l.g830;
import p149l.gei;
import p149l.gl5;
import p149l.gp80;
import p149l.gt00;
import p149l.h6a;
import p149l.hc50;
import p149l.hd2;
import p149l.hpd0;
import p149l.hu40;
import p149l.i36;
import p149l.ife;
import p149l.ir9;
import p149l.j2e0;
import p149l.j760;
import p149l.j8w;
import p149l.jn7;
import p149l.jo0;
import p149l.jq2;
import p149l.k6w;
import p149l.ke7;
import p149l.knb0;
import p149l.kye;
import p149l.l9b;
import p149l.lac0;
import p149l.lip0;
import p149l.lqf;
import p149l.lsi0;
import p149l.lva;
import p149l.lxf0;
import p149l.m73;
import p149l.mah0;
import p149l.mcr;
import p149l.mkd0;
import p149l.mqi0;
import p149l.mrm;
import p149l.myf;
import p149l.n3b0;
import p149l.na30;
import p149l.nd2;
import p149l.o6j0;
import p149l.ogl0;
import p149l.ouk;
import p149l.p09;
import p149l.p420;
import p149l.p9w;
import p149l.pcl0;
import p149l.psl;
import p149l.puk0;
import p149l.pxe;
import p149l.q860;
import p149l.q8p;
import p149l.qfh0;
import p149l.qib0;
import p149l.qqi0;
import p149l.qsm;
import p149l.qwp;
import p149l.r65;
import p149l.r6n;
import p149l.r70;
import p149l.r9m;
import p149l.rd6;
import p149l.roj0;
import p149l.sdt;
import p149l.sp8;
import p149l.trq;
import p149l.u4c0;
import p149l.u4e;
import p149l.u59;
import p149l.u9w;
import p149l.uld0;
import p149l.upa;
import p149l.ura;
import p149l.v930;
import p149l.v9j;
import p149l.vjf0;
import p149l.vve0;
import p149l.vwb;
import p149l.vy8;
import p149l.w2e0;
import p149l.w85;
import p149l.w9j;
import p149l.wb3;
import p149l.wb50;
import p149l.wc40;
import p149l.wf6;
import p149l.wjc0;
import p149l.wm20;
import p149l.x2c0;
import p149l.x4i;
import p149l.x9j;
import p149l.xaj0;
import p149l.xdl0;
import p149l.xe40;
import p149l.xma;
import p149l.xzc0;
import p149l.y030;
import p149l.y19;
import p149l.y1j;
import p149l.y59;
import p149l.y8i0;
import p149l.y9j;
import p149l.yni;
import p149l.z2x;
import p149l.z60;
import p149l.zch0;
import p149l.zpd0;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a */
/* JADX INFO: loaded from: classes11.dex */
public class C8096a extends y030<NewMainViewModel> {

    /* JADX INFO: renamed from: A */
    public boolean f24492A;

    /* JADX INFO: renamed from: B */
    public zpd0 f24493B;

    /* JADX INFO: renamed from: C */
    public hpd0 f24494C;

    /* JADX INFO: renamed from: D */
    public boolean f24495D;

    /* JADX INFO: renamed from: E */
    public C22392a<Boolean> f24496E;

    /* JADX INFO: renamed from: F */
    public c4g0 f24497F;

    /* JADX INFO: renamed from: G */
    public TabName f24498G;

    /* JADX INFO: renamed from: H */
    public C22392a<roj0> f24499H;

    /* JADX INFO: renamed from: r */
    @Nullable
    public Runnable f24500r;

    /* JADX INFO: renamed from: s */
    public C22392a<TabName> f24501s;

    /* JADX INFO: renamed from: t */
    public C22392a<roj0> f24502t;

    /* JADX INFO: renamed from: u */
    public PutongFrag f24503u;

    /* JADX INFO: renamed from: v */
    public int f24504v;

    /* JADX INFO: renamed from: w */
    public boolean f24505w;

    /* JADX INFO: renamed from: x */
    public boolean f24506x;

    /* JADX INFO: renamed from: y */
    public boolean f24507y;

    /* JADX INFO: renamed from: z */
    public boolean f24508z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$a */
    public class a implements e30<UserFeedbackInfo> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f24509a;

        public a(boolean z) {
            this.f24509a = z;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(UserFeedbackInfo userFeedbackInfo) {
            if (this.f24509a && TextUtils.equals(myf.m157028H(), "aiPictureDlg")) {
                return;
            }
            myf.m157039S(C8096a.this.act(), "netPictureDlg");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$b */
    public class b implements e30<Throwable> {
        public b() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$c */
    public class c implements e30<TabName> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f24512a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f24513b;

        public c(boolean z, boolean z2) {
            this.f24512a = z;
            this.f24513b = z2;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(TabName tabName) {
            String str;
            if (this.f24512a && CoreModule.f17545c.f19639e0.m169520na().isAiFakeAvatar() && myf.m157029I()) {
                str = "aiPictureDlg";
            } else {
                str = (this.f24513b && NullChecker.m81303a(CoreModule.f17545c.f19639e0.f149300W6) && CoreModule.f17545c.f19639e0.f149300W6.isGetFeedBackPeople) ? "netPictureDlg" : "noPictureDlg";
            }
            if (TextUtils.equals(str, "noPictureDlg")) {
                return;
            }
            myf.m157039S(C8096a.this.act(), str);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$d */
    public class d implements e30<String> {
        public d() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            myf.m157022B();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$e */
    public class e implements e30<Boolean> {
        public e() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            CoreModule.f17545c.f19639e0.m169541t7();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$f */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CoreModule.f17545c.f19663m0.f19406e0.m132487l(roj0.f160388a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$g */
    public class g implements e30<PopGuide> {
        public g() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(PopGuide popGuide) {
            ((NewMainViewModel) ((jq2) C8096a.this).viewModel).m40024z0(popGuide);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$h */
    public class h implements e30<Throwable> {
        public h() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$i */
    public class i implements e30<TabName> {
        public i() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(TabName tabName) {
            if (x4i.f191031g) {
                x4i.f191031g = false;
                return;
            }
            if (tabName == TabName.Card && x4i.m206975b()) {
                x4i.m206978e(C8096a.this.act());
            } else if (tabName == TabName.Moment) {
                CoreModule.f17545c.f19639e0.f149248Q2.put(Long.valueOf(mqi0.m155944o()));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$j */
    public class j implements hd2.InterfaceC17283a {
        public j() {
        }

        @Override // p149l.hd2.InterfaceC17283a
        /* JADX INFO: renamed from: a */
        public Animator mo40466a(View view) {
            return null;
        }

        @Override // p149l.hd2.InterfaceC17283a
        /* JADX INFO: renamed from: b */
        public Animator mo40467b(View view) {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$k */
    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CoreModule.f17545c.f19597Q0.m173709k3();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$l */
    public class l extends lxf0.AbstractC18346a {
        public l() {
        }

        @Override // p149l.lvl
        public void onComplete() {
        }

        @Override // p149l.lvl
        public void onError(@Nullable Throwable th) {
            lsi0.m151570H(C8096a.this.act().getResources().getString(R$string.f18101Ro), null, C8096a.this.act().getResources().getDrawable(x2c0.f190662vr));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$m */
    public static /* synthetic */ class m {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24524a;

        static {
            int[] iArr = new int[TabName.values().length];
            f24524a = iArr;
            try {
                iArr[TabName.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24524a[TabName.Msg.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24524a[TabName.Live.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24524a[TabName.Moment.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24524a[TabName.Me.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24524a[TabName.Buzz.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24524a[TabName.FEATURED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24524a[TabName.Meet.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24524a[TabName.VoiceChat.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$n */
    public class n implements e30<Throwable> {
        public n() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$o */
    public class o implements w9j<Long, C22306c<q860<Conversation>>> {
        public o() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22306c<q860<Conversation>> call(Long l2) {
            return CoreModule.f17545c.f19642f0.m32939ef();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$p */
    public class p implements w9j<j760<q860<Conversation>, TabName>, q860<Conversation>> {
        public p() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public q860<Conversation> call(j760<q860<Conversation>, TabName> j760Var) {
            if (j760Var.f116565b == TabName.Msg) {
                mkd0.m154992z(C8096a.this.f24497F);
            }
            return j760Var.f116564a;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$q */
    public class q implements w9j<q860<Conversation>, Double> {
        public q() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double call(q860<Conversation> q860Var) {
            Double dValueOf = Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            int i = upa.m194777l().last_conversation_not_participating;
            if (q860Var == null || i == 0) {
                return dValueOf;
            }
            List<Conversation> list = q860Var.f153135a;
            if (vwb.m200296J(list)) {
                return dValueOf;
            }
            return i < list.size() ? Double.valueOf(list.get(i - 1).latestTime) : Double.valueOf(-1.0d);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$r */
    public class r implements e30<Double> {
        public r() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Double d) {
            long jRound;
            long jM32988ig;
            if (d.doubleValue() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                jM32988ig = (long) CoreModule.f17545c.f19642f0.m32988ig();
                jRound = (long) CoreModule.f17545c.f19642f0.m32590Bg();
            } else if (d.doubleValue() == -1.0d) {
                jM32988ig = -1;
                jRound = -1;
            } else {
                long jRound2 = d.doubleValue() < CoreModule.f17545c.f19642f0.m32988ig() ? Math.round(d.doubleValue()) - 1 : (long) CoreModule.f17545c.f19642f0.m32988ig();
                jRound = d.doubleValue() < CoreModule.f17545c.f19642f0.m32590Bg() ? Math.round(d.doubleValue()) - 2 : (long) CoreModule.f17545c.f19642f0.m32590Bg();
                jM32988ig = jRound2;
            }
            CoreModule.f17545c.f19642f0.f19946j0.put(Long.valueOf(jM32988ig));
            CoreModule.f17545c.f19642f0.f19952l0.put(Long.valueOf(jRound));
            CoreModule.f17545c.f19642f0.m32938dq(qib0.f154693H.guessedCurrentServerTime());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$s */
    public class s implements e30<roj0> {
        public s() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(roj0 roj0Var) {
            new qfh0(C8096a.this.act(), "p_home,accelerate_guide").show();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$t */
    public class t implements w9j<UserFeedbackInfo, Boolean> {
        public t() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(UserFeedbackInfo userFeedbackInfo) {
            return Boolean.valueOf(userFeedbackInfo.isGetFeedBackPeople);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$u */
    public class u implements w9j<UserFeedbackInfo, Boolean> {
        public u() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(UserFeedbackInfo userFeedbackInfo) {
            return Boolean.valueOf(v930.m197534h() == TabName.Card || v930.m197534h() == TabName.Me);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$v */
    public static class v extends y030.AbstractC21272b<C8096a> {
        public v(C8096a c8096a) {
            super(c8096a);
        }

        /* JADX INFO: renamed from: a */
        public void m40476a(Boolean bool, String str) {
            ((NewMainViewModel) ((jq2) ((C8096a) this.f195271a)).viewModel).m40018t0(bool.booleanValue(), str);
        }
    }

    public C8096a(mcr mcrVar) {
        super(mcrVar);
        this.f24501s = C22392a.m221512b();
        this.f24502t = C22392a.m221512b();
        this.f24503u = null;
        this.f24505w = true;
        this.f24508z = false;
        this.f24492A = false;
        this.f24493B = new zpd0("message_tips_text_update_time_" + CoreModule.m29931H().userId(), 0L);
        this.f24494C = new hpd0("static_hdr_info_reported", Boolean.FALSE);
        this.f24496E = C22392a.m221512b();
        this.f24499H = C22392a.m221513c(roj0.f160388a);
    }

    /* JADX INFO: renamed from: C2 */
    public static /* synthetic */ void m40033C2(jn7.C17824a c17824a) {
        if (!NullChecker.m81303a(c17824a) || !NullChecker.m81303a(c17824a.f118824d)) {
            C4732c c4732c = CoreModule.f17545c;
            c4732c.f19642f0.m32775Qg(c4732c.f19639e0.m169527p9().f56011id, mqi0.m155944o(), 0, 0);
        } else {
            C4740g c4740g = CoreModule.f17545c.f19642f0;
            Greeting greeting = c17824a.f118824d;
            c4740g.m32775Qg(greeting.otherUser, greeting.latestTime, c17824a.f118821a, c17824a.f118822b);
        }
    }

    /* JADX INFO: renamed from: C4 */
    public static /* synthetic */ CoreInnerPush.C4716a m40035C4(CoreInnerPush.C4716a c4716a, C4319c c4319c) {
        return c4716a;
    }

    /* JADX INFO: renamed from: C5 */
    public static /* synthetic */ void m40036C5(C4319c c4319c) {
        CoreModule.f17545c.f19654j0.m30605Q5();
        CoreModule.f17545c.f19654j0.m30603P5();
    }

    /* JADX INFO: renamed from: D2 */
    public static /* synthetic */ void m40037D2(Throwable th) {
    }

    /* JADX INFO: renamed from: E2 */
    public static /* synthetic */ void m40042E2(Bundle bundle) {
    }

    /* JADX INFO: renamed from: E5 */
    public static /* synthetic */ void m40045E5(Throwable th) {
    }

    /* JADX INFO: renamed from: F1 */
    public static /* synthetic */ void m40046F1(TabName tabName) {
        if (tabName == TabName.Msg) {
            SeeExposedUser seeExposedUserM129978A3 = CoreModule.f17545c.f19692v2.getLocalConvUserData();
            if (xma.m210071e4()) {
                if (CoreModule.f17557o.m195055b().mo33649wf() && seeExposedUserM129978A3 != null) {
                    CoreModule.f17545c.f19692v2.m129980C3(seeExposedUserM129978A3.userId, seeExposedUserM129978A3.timestamp);
                    return;
                }
                q8p.Companion companion = q8p.INSTANCE;
                if (companion.m173440o()) {
                    return;
                }
                CoreModule.m29932K().mo30724Rp("");
                CoreModule.f17545c.f19692v2.m129984q3();
                companion.m173445t(mqi0.m155944o());
            }
        }
    }

    /* JADX INFO: renamed from: F3 */
    public static /* synthetic */ void m40048F3(TabName tabName) {
        if (tabName == TabName.Me) {
            CoreModule.f17545c.f19555C0.m210112u4();
        }
    }

    /* JADX INFO: renamed from: F5 */
    public static /* synthetic */ void m40050F5(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G5 */
    public static /* synthetic */ void m40052G5(j760 j760Var) {
        String str = (String) j760Var.f116564a;
        if ((TextUtils.equals(UserStatus.audit, str) || TextUtils.equals("auditing", str) || TextUtils.equals("pending", str) || TextUtils.equals("denied", str) || ((Boolean) j760Var.f116565b).booleanValue()) && TextUtils.equals(CoreModule.f17545c.f19639e0.f149321Z3.get(), UserHomeMode.marryMode)) {
            CoreModule.f17545c.f19639e0.f149321Z3.put(UserHomeMode.loveMode);
            CoreModule.f17545c.f19639e0.f149170F1.m132487l(roj0.f160388a);
        }
    }

    /* JADX INFO: renamed from: G6 */
    private void m40053G6() {
        if (upa.m194675N3()) {
            duringCreated(ExpandedCardStyleHelper.m38090o().m38109y().map(new w9j() { // from class: l.t430
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ExpandedCardStyleHelper.C7951b) obj).f22418a;
                }
            }).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.u430
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f173682a.m40355a8((ExpandedCardStyleHelper.ExpandedCardStyle) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: H1 */
    public static /* synthetic */ void m40054H1(Throwable th) {
    }

    /* JADX INFO: renamed from: H3 */
    public static /* synthetic */ void m40056H3(Throwable th) {
    }

    /* JADX INFO: renamed from: I1 */
    public static /* synthetic */ void m40059I1(Throwable th) {
    }

    /* JADX INFO: renamed from: I3 */
    public static /* synthetic */ void m40061I3(C4319c c4319c) {
        if (NotificationCheckerCommon.m79220a() != NotificationCheckerCommon.State.closed) {
            if (CoreModule.f17545c.f19639e0.f149421m0.get().longValue() == 0) {
                CoreModule.f17545c.f19639e0.f149421m0.put(Long.valueOf(mqi0.m155944o()));
            }
        } else if (CoreModule.f17545c.f19639e0.f149421m0.get().longValue() > 0) {
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
    }

    /* JADX INFO: renamed from: K2 */
    public static /* synthetic */ void m40069K2(Throwable th) {
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ roj0 m40070K3(final List list) {
        f8c.m119878o().m119881B(new d30() { // from class: l.q430
            @Override // p149l.d30
            public final void call() {
                C8096a.m40130W4(list);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: L1 */
    public static /* synthetic */ C22306c m40073L1(TabName tabName) {
        String str;
        if (tabName == TabName.Card) {
            str = "swipe";
        } else {
            str = tabName == TabName.Msg ? "message" : "me";
        }
        return CoreModule.f17545c.f19686t2.m168332l3(str);
    }

    /* JADX INFO: renamed from: L2 */
    public static /* synthetic */ void m40074L2(Throwable th) {
    }

    /* JADX INFO: renamed from: L5 */
    public static /* synthetic */ void m40076L5(Throwable th) {
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ Double m40083N3(q860 q860Var) {
        return (!NullChecker.m81303a(q860Var) || vwb.m200296J(q860Var.f153135a)) ? Double.valueOf(-1.0d) : Double.valueOf(((Conversation) q860Var.f153135a.get(0)).latestTime);
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ void m40084N4(Throwable th) {
        CoreModule.f17545c.f19667n1.m34271R3(false);
        ConversationsList.m41328A2();
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m40087O3(Throwable th) {
    }

    /* JADX INFO: renamed from: O5 */
    public static /* synthetic */ void m40089O5(Throwable th) {
    }

    /* JADX INFO: renamed from: P2 */
    public static /* synthetic */ void m40091P2(Throwable th) {
    }

    /* JADX INFO: renamed from: P4 */
    public static /* synthetic */ void m40093P4(Throwable th) {
    }

    /* JADX INFO: renamed from: Q1 */
    public static /* synthetic */ void m40095Q1(Throwable th) {
        w2e0.f184217g = null;
        lsi0.m151578h(R$string.f18663k9);
    }

    /* JADX INFO: renamed from: Q2 */
    public static /* synthetic */ void m40096Q2(GreetingSummary greetingSummary) {
        if (greetingSummary == null) {
            CoreModule.f17545c.f19678r0.m34128k5();
        } else {
            if (greetingSummary.latestTime <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return;
            }
            CoreModule.f17545c.f19678r0.m34083F5(greetingSummary, "fake_conversation_greeting");
        }
    }

    /* JADX INFO: renamed from: Q3 */
    public static /* synthetic */ void m40097Q3(Throwable th) {
    }

    /* JADX INFO: renamed from: Q4 */
    public static /* synthetic */ void m40098Q4(List list) {
        CoreModule.f17545c.f19678r0.m34087H5();
        ConversationsList.f25080t1.m132487l(roj0.f160388a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q8 */
    public /* synthetic */ void m40100Q8(Bundle bundle) {
        this.f24506x = bundle != null;
    }

    /* JADX INFO: renamed from: R2 */
    public static /* synthetic */ void m40102R2(Throwable th) {
    }

    /* JADX INFO: renamed from: S2 */
    public static /* synthetic */ void m40107S2(List list) {
        ConversationsList.f25079s1.m132487l(list);
        StringBuilder sb = new StringBuilder("convListPre 预加载完成 ");
        sb.append(NullChecker.m81303a(list) ? list.size() : 0);
        rd6.m178864C(sb.toString());
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m40108S3(UserLiveHierarchy userLiveHierarchy) {
        NavigationBarAdmobHelper navigationBarAdmobHelper = NavigationBarAdmobHelper.INSTANCE;
        navigationBarAdmobHelper.m36154o().put(Integer.valueOf(userLiveHierarchy.hierarchy.grade));
        navigationBarAdmobHelper.m36149j().put(Integer.valueOf(userLiveHierarchy.anchorHierarchy.grade));
    }

    /* JADX INFO: renamed from: T1 */
    public static /* synthetic */ void m40111T1(Throwable th) {
    }

    /* JADX INFO: renamed from: U2 */
    public static /* synthetic */ void m40117U2(IntlTribeBubble intlTribeBubble) {
        int i2;
        int i3;
        if (intlTribeBubble == null || ((i2 = intlTribeBubble.seeCount) > 0 && !((i3 = intlTribeBubble.tribeCount) > 0 && i2 == i3 && i3 == intlTribeBubble.seeTribeCount))) {
            CoreModule.f17545c.f19667n1.m34275z3().m132487l(Boolean.FALSE);
        } else {
            CoreModule.f17545c.f19667n1.m34275z3().m132487l(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: U4 */
    public static /* synthetic */ void m40119U4(Throwable th) {
    }

    /* JADX INFO: renamed from: U6 */
    private void m40121U6() {
        if (g6a.m124564m()) {
            CoreModule.f17545c.f19598Q1.m34746k3();
        }
    }

    /* JADX INFO: renamed from: V1 */
    public static /* synthetic */ void m40122V1(Throwable th) {
    }

    /* JADX INFO: renamed from: V2 */
    public static /* synthetic */ void m40123V2(NetworkInfo networkInfo) {
        if (lip0.m149927i().m149935o()) {
            lip0.m149927i().m149937q();
        }
    }

    /* JADX INFO: renamed from: W1 */
    public static /* synthetic */ void m40127W1(Throwable th) {
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m40129W3(Throwable th) {
    }

    /* JADX INFO: renamed from: W4 */
    public static /* synthetic */ void m40130W4(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Conversation conversation = (Conversation) it.next();
            if (NullChecker.m81303a(conversation.property) && NullChecker.m81303a(conversation.property.limitedTrialSee) && TextUtils.equals(conversation.property.limitedTrialSee.actorId, CoreModule.m29931H().userId())) {
                conversation.localIsLimitedTrialSee = 1;
                CoreModule.f17553k.f91950m.upsert(conversation);
            }
        }
    }

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m40131X1(Throwable th) {
    }

    /* JADX INFO: renamed from: X2 */
    public static /* synthetic */ void m40132X2(Throwable th) {
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m40137Y3(C4319c c4319c) {
        Long lValueOf = CoreModule.f17545c.f19687u0.f19254k0.get();
        if (lValueOf.longValue() <= 0) {
            lValueOf = Long.valueOf(mqi0.m155944o());
        }
        CoreModule.f17545c.f19690v0.m105757A3(lValueOf.longValue());
        CoreModule.f17545c.f19690v0.m105775y3("", lValueOf.longValue());
    }

    /* JADX INFO: renamed from: Z2 */
    public static /* synthetic */ void m40140Z2(Throwable th) {
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m40141Z3(Throwable th) {
    }

    /* JADX INFO: renamed from: a5 */
    public static /* synthetic */ void m40146a5(Throwable th) {
    }

    /* JADX INFO: renamed from: b2 */
    public static /* synthetic */ void m40147b2(Throwable th) {
    }

    /* JADX INFO: renamed from: d2 */
    public static /* synthetic */ void m40155d2(Throwable th) {
    }

    /* JADX INFO: renamed from: e2 */
    public static /* synthetic */ void m40159e2() {
        if (C8140a.m41831p(CoreModule.f17545c.f19642f0.f19868J0.get())) {
            CoreModule.f17545c.f19642f0.m33012ke();
        }
    }

    /* JADX INFO: renamed from: g5 */
    public static /* synthetic */ void m40170g5(Throwable th) {
    }

    /* JADX INFO: renamed from: h2 */
    public static /* synthetic */ void m40171h2(Throwable th) {
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ void m40176i3(Throwable th) {
    }

    /* JADX INFO: renamed from: j3 */
    public static /* synthetic */ void m40180j3(Throwable th) {
    }

    /* JADX INFO: renamed from: k5 */
    public static /* synthetic */ void m40186k5(Boolean bool) {
    }

    /* JADX INFO: renamed from: l2 */
    public static /* synthetic */ void m40187l2(Throwable th) {
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ void m40188l3(Boolean bool) {
    }

    /* JADX INFO: renamed from: m2 */
    public static /* synthetic */ void m40191m2(C4319c c4319c) {
        CoreModule.m29936Q().mo67228Lh().mo95354h();
        if (CoreModule.m29932K().mo30835xf()) {
            CoreModule.f17545c.f19573I0.m140260N3();
        }
    }

    /* JADX INFO: renamed from: m3 */
    public static /* synthetic */ void m40192m3(OMSLauncherInfo oMSLauncherInfo) {
        if (Act.foreground_() == null) {
            hc50.m130390g(oMSLauncherInfo.f38790id, oMSLauncherInfo.f38789ad.link.deeplinkReport.success);
        } else {
            hc50.m130390g(oMSLauncherInfo.f38790id, oMSLauncherInfo.f38789ad.link.deeplinkReport.failed);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m5 */
    public static /* synthetic */ void m40194m5(j760 j760Var) {
        VisitorDoorInfo visitorDoorInfo = (VisitorDoorInfo) j760Var.f116564a;
        CoreLikers.C4719a c4719a = (CoreLikers.C4719a) j760Var.f116565b;
        if ((!NullChecker.m81303a(c4719a) || c4719a.f19271c <= 0) && visitorDoorInfo != null && !TextUtils.isEmpty(visitorDoorInfo.userID) && (visitorDoorInfo.unReadCount > 0 || c4719a == null || c4719a.f19270b <= 0)) {
            CoreModule.f17545c.f19667n1.m34271R3(true);
        } else {
            CoreModule.f17545c.f19667n1.m34271R3(false);
        }
        ConversationsList.m41328A2();
    }

    /* JADX INFO: renamed from: n2 */
    public static /* synthetic */ void m40195n2(Throwable th) {
    }

    /* JADX INFO: renamed from: n3 */
    public static /* synthetic */ void m40196n3(Throwable th) {
    }

    /* JADX INFO: renamed from: n5 */
    public static /* synthetic */ void m40198n5(Throwable th) {
    }

    /* JADX INFO: renamed from: o4 */
    public static /* synthetic */ void m40201o4(Throwable th) {
    }

    /* JADX INFO: renamed from: p5 */
    public static /* synthetic */ void m40206p5(RegionRule regionRule) {
        if (regionRule == null) {
            return;
        }
        boolean z = false;
        IntlCountryCodeController.m28130z(NullChecker.m81304b(regionRule.tags) && (regionRule.tags.contains(RegionRuleTag.get(RegionRuleTag.GDPR)) || regionRule.tags.contains(RegionRuleTag.get(RegionRuleTag.CCPA))));
        if (NullChecker.m81304b(regionRule.tags) && regionRule.tags.contains(RegionRuleTag.get(RegionRuleTag.f20493BS))) {
            z = true;
        }
        IntlCountryCodeController.m28129y(z);
        if (CoreModule.m29936Q().mo67255a().mo124834a()) {
            CoreModule.m29936Q().mo67283rk(regionRule.liveRegionTag);
        }
        try {
            qib0.m174801X0("live_region", regionRule.liveRegionTag.toString());
        } catch (Exception e2) {
            CrashHelper.m81296c(e2);
        }
        CoreModule.f17545c.f19639e0.m169478ca();
    }

    /* JADX INFO: renamed from: q3 */
    public static /* synthetic */ void m40208q3(TabName tabName) {
        if (tabName == TabName.Msg || !CoreModule.f17545c.f19557C2.m163507w3()) {
            return;
        }
        CoreModule.f17545c.f19557C2.m163509y3();
    }

    /* JADX INFO: renamed from: r5 */
    public static /* synthetic */ void m40214r5(Throwable th) {
    }

    /* JADX INFO: renamed from: s2 */
    public static /* synthetic */ void m40215s2(Act.C4299r c4299r) {
        WeakReference<Activity> weakReference;
        if (c4299r == null || (weakReference = c4299r.f15343a) == null || !(weakReference.get() instanceof Act)) {
            return;
        }
        r9m.m178395r().m178400E(false);
        r9m.m178395r().m178401F((Act) c4299r.f15343a.get());
    }

    /* JADX INFO: renamed from: s3 */
    public static /* synthetic */ void m40216s3(Throwable th) {
    }

    /* JADX INFO: renamed from: u2 */
    public static /* synthetic */ void m40223u2(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u3 */
    public static /* synthetic */ void m40224u3(Frag frag, String str, C4319c c4319c) {
        if (CoreModule.m29934N().isPhotoAlbumFrag(frag)) {
            ((FeedService.InterfaceC11414a) frag).mo63799m(str);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: u4 */
    public static /* synthetic */ void m40225u4(q860 q860Var) {
        if (!NullChecker.m81303a(q860Var) || vwb.m200296J(q860Var.f153135a)) {
            return;
        }
        CoreModule.f17545c.f19642f0.m32641Ff(q860Var.f153135a);
    }

    /* JADX INFO: renamed from: v4 */
    public static /* synthetic */ void m40229v4(j760 j760Var) {
        if (CoreModule.f17545c.f19639e0.f149221M4.get().intValue() == 0 && CoreModule.f17545c.f19639e0.m169472b8(false)) {
            CoreModule.f17545c.f19639e0.f149221M4.put(1);
        }
    }

    /* JADX INFO: renamed from: v7 */
    private void m40231v7() {
        lifecycle().filter(new w9j() { // from class: l.j430
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(C4319c.f15548i == ((C4319c) obj));
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.l430
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40036C5((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w3 */
    public static /* synthetic */ void m40233w3(Throwable th) {
    }

    /* JADX INFO: renamed from: y4 */
    public static /* synthetic */ void m40242y4(Throwable th) {
    }

    /* JADX INFO: renamed from: z6 */
    private void m40248z6() {
        if (upa.m194747f()) {
            duringCreated(m40307O9().distinctUntilChanged().filter(new w9j() { // from class: l.j830
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    TabName tabName = (TabName) obj;
                    return Boolean.valueOf(TextUtils.equals(tabName.name(), TabName.Card.name()) || TextUtils.equals(tabName.name(), TabName.Me.name()));
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.k830
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19663m0.m30995F5(true);
                }
            }, new e30() { // from class: l.l830
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40195n2((Throwable) obj);
                }
            }));
        } else if (upa.m194742e()) {
            CoreModule.f17545c.f19663m0.f19430m0.m132487l(Long.valueOf(mqi0.m155944o()));
        }
    }

    /* JADX INFO: renamed from: A6 */
    public final void m40249A6() {
        if (!upa.m194645H3() || CoreModule.f17545c.f19639e0.f149495w2.get().booleanValue()) {
            return;
        }
        CoreModule.f17545c.f19624Z.f20142S.m121236q().subscribe(mkd0.m154956H(new e30() { // from class: l.q530
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19639e0.f149495w2.put(Boolean.TRUE);
            }
        }, new e30() { // from class: l.r530
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40214r5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A7, reason: merged with bridge method [inline-methods] */
    public final void m40310P8() {
        duringCreated(ConnectivityReceiver.m81290m()).skip(1).filter(new w9j() { // from class: l.l230
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.m230
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40123V2((NetworkInfo) obj);
            }
        }));
        m40451y7();
        m40300N6();
        m40402m6();
        m40394k6();
        m40427s7();
        m40377g6();
        m40344Y5();
        m40249A6();
        m40399l7();
        qib0.m174829r0(new Runnable() { // from class: l.n230
            @Override // java.lang.Runnable
            public final void run() {
                this.f136763a.m40306O8();
            }
        }, true);
        m40253B6();
        m40435u7();
        m40431t7();
        m40450y6();
    }

    /* JADX INFO: renamed from: A8 */
    public final /* synthetic */ void m40251A8(Bundle bundle) {
        if (!NullChecker.m81303a(this.viewModel) || ((NewMainViewModel) this.viewModel).m39990V() || cfx.m106614a()) {
            return;
        }
        u9w.INSTANCE.m192688v(act(), ((NewMainViewModel) this.viewModel).m39976L(TabName.Buzz), new C4345a.c() { // from class: l.e530
            @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.c
            /* JADX INFO: renamed from: a */
            public final void mo20886a(String str) {
                this.f89346a.m40456z8(str);
            }
        });
    }

    /* JADX INFO: renamed from: A9 */
    public final boolean m40252A9() {
        if (CoreModule.f17545c.f19654j0.f19301n0.get().intValue() <= 0) {
            return false;
        }
        if (qib0.f154732t < 3699000) {
            return true;
        }
        CoreModule.f17545c.f19654j0.f19301n0.put(0);
        return false;
    }

    /* JADX INFO: renamed from: B6 */
    public final void m40253B6() {
        if (!r65.m178035m()) {
            if (CoreModule.f17545c.f19650h2.f118820X.get().booleanValue()) {
                CoreModule.f17545c.f19650h2.m142337D3();
                CoreModule.f17545c.f19650h2.f118820X.put(Boolean.FALSE);
                return;
            }
            return;
        }
        duringCreated(CoreModule.f17545c.f19650h2.f118817U).subscribe(mkd0.m154956H(new e30() { // from class: l.u530
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40033C2((jn7.C17824a) obj);
            }
        }, new e30() { // from class: l.v530
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40147b2((Throwable) obj);
            }
        }));
        if (!CoreModule.f17545c.f19639e0.m169527p9().isFemale()) {
            r65.m178034l().m178041o();
        }
        r65.m178034l();
        r65.m178037p();
    }

    /* JADX INFO: renamed from: B7 */
    public final void m40254B7() {
        duringCreated(this.f24501s.distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.i730
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111824a.m40321S8((TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B8 */
    public final /* synthetic */ void m40255B8(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop, j760 j760Var) {
        if (NullChecker.m81303a(j760Var) && TextUtils.equals((CharSequence) j760Var.f116564a, "intl.text.lovebuzz.show.notify")) {
            TabName tabNameM212083b1 = m212083b1();
            if (NullChecker.m81303a(tabNameM212083b1) && TextUtils.equals(tabNameM212083b1.name(), TabName.Live.name())) {
                return;
            }
        }
        k6w.INSTANCE.m144636e(act(), null, j760Var, loveBuzzNotifyUserPop);
    }

    /* JADX INFO: renamed from: B9 */
    public boolean m40256B9() {
        return m40279H9() || m40275G9() || m40268E9() || m40260C9() || m40264D9() || m40252A9() || m40272F9() || m40457z9();
    }

    /* JADX INFO: renamed from: C6 */
    public final void m40257C6() {
        creates(new e30() { // from class: l.j630
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116385a.m40316R7((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19639e0.m169488fa()).distinctUntilChanged().subscribe(mkd0.m154956H(new e30() { // from class: l.v630
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40206p5((RegionRule) obj);
            }
        }, new e30() { // from class: l.z630
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40196n3((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).distinctUntilChanged().doOnNext(new e30() { // from class: l.b730
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73899a.m40320S7((User) obj);
            }
        }).subscribe();
        duringCreated(mkd0.m154987u(CoreModule.f17545c.m31483n3(), CoreModule.f17545c.f19642f0.m32773Qe(), ife.m135906o().f112985a.map(new w9j() { // from class: l.c730
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ife.m135906o().m135908k(BannerLoc.get("conversation")));
            }
        }).distinctUntilChanged(), CoreModule.m29936Q().mo67255a().mo124836c() ? CoreModule.m29936Q().mo67259bl() : C22306c.just(new e5s()), this.f24499H, new aaj() { // from class: l.d730
            @Override // p149l.aaj
            /* JADX INFO: renamed from: a */
            public final Object mo95547a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return vwb.m200312Z((Counter) obj, (ConversationCounter) obj2, (Boolean) obj3, (e5s) obj4);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.e730
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89666a.m40324T7((knb0) obj);
            }
        }, new e30() { // from class: l.f730
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40074L2((Throwable) obj);
            }
        }));
        duringCreated(qib0.f154713b0.f139232c.mo67228Lh().mo95350d()).subscribe(mkd0.m154956H(new e30() { // from class: l.g730
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101329a.m40327U7((Integer) obj);
            }
        }, new e30() { // from class: l.h730
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40097Q3((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19642f0.f19972r2.distinctUntilChanged()).subscribe(mkd0.m154956H(new e30() { // from class: l.k630
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121260a.m40331V7((Boolean) obj);
            }
        }, new e30() { // from class: l.l630
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40171h2((Throwable) obj);
            }
        }));
        duringCreated(qib0.f154713b0.f139232c.mo67280r9().mo123878d()).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.m630
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131441a.m40336W7((Integer) obj);
            }
        }, new e30() { // from class: l.n630
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40146a5((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19663m0.m31110h9()).subscribe(mkd0.m154955G(new e30() { // from class: l.o630
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141971a.m40341X7((roj0) obj);
            }
        }));
        duringCreated(r6n.m178067f().f157954b.onBackpressureLatest()).filter(new w9j() { // from class: l.q630
            @Override // p149l.w9j
            public final Object call(Object obj) {
                InsertConversationsList insertConversationsList = (InsertConversationsList) obj;
                return Boolean.valueOf(NullChecker.m81303a(insertConversationsList) && NullChecker.m81303a(insertConversationsList.users));
            }
        }).map(new w9j() { // from class: l.r630
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Integer.valueOf(vwb.m200323f(((InsertConversationsList) obj).users, new w9j() { // from class: l.w530
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(!((InsertConversationUser) obj2).clicked.booleanValue());
                    }
                }));
            }
        }).distinctUntilChanged().onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.s630
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162612a.m40346Y7((Integer) obj);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.t630
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).skip(1).filter(new w9j() { // from class: l.u630
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(lip0.m149927i().m149935o());
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.w630
            @Override // p149l.e30
            public final void call(Object obj) {
                lip0.m149927i().m149937q();
            }
        }));
        if (upa.m194624D2()) {
            lifecycle().filter(new w9j() { // from class: l.x630
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.y630
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40061I3((C4319c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: C7 */
    public final void m40258C7() {
        if (ura.m195053e().m195057d().mo33920sa()) {
            duringCreated(CoreModule.f17545c.f19642f0.m32928df().map(new w9j() { // from class: l.d630
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return C8096a.m40083N3((q860) obj);
                }
            }).distinctUntilChanged()).subscribe(mkd0.m154956H(new e30() { // from class: l.h630
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19642f0.m32763Pg(((Double) obj).doubleValue());
                }
            }, new e30() { // from class: l.i630
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40091P2((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: C8 */
    public final /* synthetic */ void m40259C8(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop, TabName tabName) {
        boolean z = NullChecker.m81303a(tabName) && TextUtils.equals(tabName.name(), TabName.Live.name());
        boolean zM47053q = loveBuzzNotifyUserPop.m47053q("textBuzz");
        if (z) {
            if (zM47053q) {
                loveBuzzNotifyUserPop.m47061y();
            }
        } else {
            if (zM47053q) {
                return;
            }
            j760<String, Object> j760VarM221515e = j8w.INSTANCE.m140473a().m140472z0().m221515e();
            if (NullChecker.m81303a(j760VarM221515e) && TextUtils.equals(j760VarM221515e.f116564a, "intl.text.lovebuzz.show.notify")) {
                k6w.INSTANCE.m144636e(act(), null, j760VarM221515e, loveBuzzNotifyUserPop);
            }
        }
    }

    /* JADX INFO: renamed from: C9 */
    public final boolean m40260C9() {
        return upa.m194800p2() && CoreModule.f17545c.f19552B0.f19761i0.get().booleanValue();
    }

    /* JADX INFO: renamed from: D6 */
    public final void m40261D6() {
        if (!upa.m194775k2()) {
            e51.m114774y(new Runnable() { // from class: l.u730
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.a630
                        @Override // p149l.d30
                        public final void call() {
                            CoreModule.f17545c.f19642f0.m32821Uf();
                        }
                    });
                }
            });
            return;
        }
        long jLongValue = CoreModule.f17545c.f19642f0.f19941h1.get().longValue();
        if (jLongValue < 1) {
            return;
        }
        CoreModule.f17545c.f19642f0.m33166vp(l9b.m149005C(mqi0.m155944o(), jLongValue), upa.m194848z0(), upa.m194607A0(), true);
    }

    /* JADX INFO: renamed from: D7 */
    public final void m40262D7() {
        if (!upa.m194745e2()) {
            creates(new e30() { // from class: l.j730
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f116561a.m40325T8((Bundle) obj);
                }
            });
            return;
        }
        duringCreated(this.f24501s.distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.k730
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121528a.m40328U8((TabName) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19639e0.f149377g4).subscribe(mkd0.m154955G(new e30() { // from class: l.m730
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131787a.m40332V8((String) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19639e0.f149163E1).subscribe(mkd0.m154955G(new e30() { // from class: l.n730
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137479a.m40337W8((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19639e0.f149170F1).subscribe(mkd0.m154955G(new e30() { // from class: l.o730
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142453a.m40342X8((roj0) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9().map(new w9j() { // from class: l.p730
            @Override // p149l.w9j
            public final Object call(Object obj) {
                User user = (User) obj;
                return j760.m140076a(user.getUserInfoForMarryStatus(), Boolean.valueOf(user.isFakeUser()));
            }
        }).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.q730
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40052G5((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D8 */
    public final /* synthetic */ void m40263D8(Integer num) {
        m40449x9();
    }

    /* JADX INFO: renamed from: D9 */
    public final boolean m40264D9() {
        return ogl0.m164233L() && xma.m210071e4() && CoreModule.f17545c.f19665m2.m191468I3() > 0 && CoreModule.f17545c.f19665m2.m191474q3();
    }

    /* JADX INFO: renamed from: E6 */
    public final void m40265E6() {
        if (ogl0.m164229H()) {
            CoreModule.f17545c.f19557C2.getNeedDelLocalInstantChatGuideConversation().put(Boolean.TRUE);
            CoreModule.f17545c.f19557C2.m163509y3();
            duringCreated(this.f24501s.distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.s730
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40208q3((TabName) obj);
                }
            }));
        } else if (CoreModule.f17545c.f19557C2.getNeedDelLocalInstantChatGuideConversation().get().booleanValue()) {
            CoreModule.f17545c.f19557C2.getNeedDelLocalInstantChatGuideConversation().put(Boolean.FALSE);
            e51.m114774y(new Runnable() { // from class: l.t730
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19557C2.m163500m3();
                }
            });
        }
    }

    /* JADX INFO: renamed from: E7 */
    public View m40266E7(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((NewMainViewModel) this.viewModel).m39988T(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: E8 */
    public final /* synthetic */ void m40267E8() {
        ((NewMainViewModel) this.viewModel).m39965F();
    }

    /* JADX INFO: renamed from: E9 */
    public boolean m40268E9() {
        if (u59.m191810S()) {
            return !uld0.m194220e().m194225g().get().booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: F6 */
    public final void m40269F6() {
        duringCreated(v930.m197535i()).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.a930
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68108a.m40350Z7((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F7 */
    public final void m40270F7() {
        if (upa.m194777l().enabled) {
            mkd0.m154992z(this.f24497F);
            this.f24497F = duringCreated(v930.m197534h() == TabName.Msg ? C22306c.timer(1500L, TimeUnit.MILLISECONDS).observeOn(jo0.m142408a()).flatMap(new o()).take(1) : mkd0.m154984r(CoreModule.f17545c.f19642f0.m32939ef(), v930.m197537k(), new x9j() { // from class: l.a230
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return new j760((q860) obj, (TabName) obj2);
                }
            }).map(new p())).map(new q()).distinctUntilChanged().subscribe(mkd0.m154956H(new r(), new e30() { // from class: l.b230
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40093P4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: F8 */
    public final /* synthetic */ void m40271F8(C4319c c4319c) {
        if (c4319c != C4319c.f15552m) {
            if (c4319c == C4319c.f15548i) {
                ((NewMainViewModel) this.viewModel).m39980N();
            }
        } else {
            ((NewMainViewModel) this.viewModel).m39974K();
            HomeStatisticsHelper.m36720z();
            this.f24500r = null;
            CoreModule.f17545c.f19632b2.m212964i3();
        }
    }

    /* JADX INFO: renamed from: F9 */
    public final boolean m40272F9() {
        return CoreModule.f17545c.f19569G2.m105992t3();
    }

    /* JADX INFO: renamed from: G7 */
    public boolean m40273G7(TabName tabName) {
        return NullChecker.m81304b(this.f195256b) && this.f195256b.equals(tabName);
    }

    /* JADX INFO: renamed from: G8 */
    public final /* synthetic */ void m40274G8(C4319c c4319c) {
        if (NullChecker.m81303a(this.f24503u)) {
            if (c4319c == C4319c.f15549j) {
                m40314Q9(false);
            } else if (c4319c == C4319c.f15548i) {
                m40326T9(false);
            }
        }
    }

    /* JADX INFO: renamed from: G9 */
    public final boolean m40275G9() {
        return CoreModule.f17545c.f19639e0.m169464Z7();
    }

    /* JADX INFO: renamed from: H6 */
    public final void m40276H6() {
        if (y19.m212151K()) {
            if (e010.m114153a()) {
                xzc0.m211974x0().m211977D0((NewMainAct) act());
            }
            duringCreated(C22306c.combineLatest(m40307O9().distinctUntilChanged(), lifecycle().filter(new w9j() { // from class: l.k930
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i && !Act.isFromBackground);
                }
            }), new x9j() { // from class: l.l930
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return new j760((TabName) obj, (C4319c) obj2);
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.m930
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f132660a.m40359b8((j760) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: H7 */
    public boolean m40277H7() {
        V v2 = this.viewModel;
        if (v2 == 0) {
            return false;
        }
        TabName tabName = TabName.Live;
        return ((NewMainViewModel) v2).m39991W(tabName, BottomBarManager.DotType.Dot) || ((NewMainViewModel) this.viewModel).m39992X(tabName);
    }

    /* JADX INFO: renamed from: H8 */
    public final /* synthetic */ C22306c m40278H8(MonetizationConfiguration monetizationConfiguration) {
        return mkd0.m154984r(m40307O9(), lifecycle(), new bs30());
    }

    /* JADX INFO: renamed from: H9 */
    public boolean m40279H9() {
        if (u59.m191810S()) {
            return !uld0.m194220e().m194227j().get().booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: I6 */
    public final void m40280I6() {
        CoreModule.f17545c.f19642f0.m33049mp(true);
    }

    /* JADX INFO: renamed from: I7 */
    public boolean m40281I7() {
        pcl0 pcl0VarM2557i0 = this.f195255a.fragmentManager().m2557i0(TabName.Card.toString());
        if (NullChecker.m81303a(pcl0VarM2557i0)) {
            return ((psl) pcl0VarM2557i0).mo38555T().getTag().equals("home");
        }
        return false;
    }

    /* JADX INFO: renamed from: I8 */
    public final /* synthetic */ void m40282I8() {
        b83.m100710d().m100722m(act());
    }

    /* JADX INFO: renamed from: I9 */
    public void m40283I9(CharSequence charSequence, String str, Figure figure, String str2, double d2, d30 d30Var) {
        ((NewMainViewModel) this.viewModel).m40023y0(charSequence, str, figure, str2, d2, d30Var);
    }

    /* JADX INFO: renamed from: J6 */
    public final void m40284J6() {
        if (upa.m194690R1()) {
            duringCreated(x4i.f191027c).subscribe(mkd0.m154956H(new g(), new h()));
            duringCreated(m40307O9()).distinctUntilChanged().subscribe(mkd0.m154955G(new i()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0260 A[Catch: ActivityNotFoundException -> 0x02c6, TryCatch #1 {ActivityNotFoundException -> 0x02c6, blocks: (B:59:0x025a, B:61:0x0260, B:65:0x026e, B:66:0x029d), top: B:96:0x025a }] */
    /* JADX WARN: Code duplicated, block: B:63:0x026a  */
    /* JADX WARN: Code duplicated, block: B:64:0x026c  */
    /* JADX WARN: Code duplicated, block: B:66:0x029d A[Catch: ActivityNotFoundException -> 0x02c6, TRY_LEAVE, TryCatch #1 {ActivityNotFoundException -> 0x02c6, blocks: (B:59:0x025a, B:61:0x0260, B:65:0x026e, B:66:0x029d), top: B:96:0x025a }] */
    /* JADX WARN: Code duplicated, block: B:72:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:76:0x031e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0327  */
    /* JADX WARN: Code duplicated, block: B:81:0x0358  */
    /* JADX WARN: Code duplicated, block: B:82:0x037a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0388  */
    /* JADX WARN: Code duplicated, block: B:85:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:93:0x0226 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x02ce, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x02fa, please report this as an issue */
    /* JADX INFO: renamed from: J7 */
    public final void m40285J7() {
        final OMSLauncherInfo oMSLauncherInfo;
        String str;
        Intent intentM79388b;
        List<ResolveInfo> listQueryIntentActivities;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str2;
        String str3;
        boolean zM124682a;
        hc50.m130388e(act());
        try {
            if (!gl5.f103297e.get().booleanValue()) {
                return;
            }
            gl5.f103297e.put(Boolean.FALSE);
            oMSLauncherInfo = (OMSLauncherInfo) m212084c1().getSerializableExtra("ad_launcher_key");
        } catch (Exception e2) {
            CrashHelper.m81296c(e2);
            try {
                act().getIntent().replaceExtras((Bundle) null);
            } catch (Exception unused) {
            }
            CrashHelper.m81296c(e2);
            oMSLauncherInfo = null;
        }
        if (oMSLauncherInfo == null) {
            return;
        }
        double doubleExtra = m212084c1().getDoubleExtra("ad_launcher_touch_key", -1.0d);
        if (!NullChecker.m81303a(oMSLauncherInfo.f38789ad) || !LauncherView.m79387a(oMSLauncherInfo.f38789ad)) {
            if (TextUtils.isEmpty(oMSLauncherInfo.href)) {
                return;
            }
            m40289K7(oMSLauncherInfo.href);
            return;
        }
        boolean zEquals = TEnum.equals(oMSLauncherInfo.f38789ad.link.action, LinkAction.wechatMiniProgram);
        ADInfo aDInfo = oMSLauncherInfo.f38789ad;
        if (zEquals) {
            if (TextUtils.isEmpty(aDInfo.link.originalId)) {
                zM124682a = false;
            } else {
                g70 g70Var = g70.INSTANCE;
                OMSADLink oMSADLink = oMSLauncherInfo.f38789ad.link;
                zM124682a = g70Var.m124682a(oMSADLink.originalId, oMSADLink.path);
            }
            zvf0.m220371D("e_oms_open_mini_program_event", "", vwb.m200311Y("if_jump_success", Boolean.valueOf(zM124682a)), vwb.m200311Y("ad_id", oMSLauncherInfo.f38790id), vwb.m200311Y("dsp_id", oMSLauncherInfo.dspId), vwb.m200311Y(QQShare.SHARE_TO_QQ_MINI_PROGRAM_PATH, oMSLauncherInfo.f38789ad.link.path), vwb.m200311Y("mini_program_originalid", oMSLauncherInfo.f38789ad.link.originalId));
        } else {
            if (TEnum.equals(aDInfo.link.action, LinkAction.tantanDeepLink) && !TextUtils.isEmpty(oMSLauncherInfo.f38789ad.link.url) && oMSLauncherInfo.f38789ad.link.url.startsWith("tantan")) {
                String strReplace = oMSLauncherInfo.f38789ad.link.url;
                if (strReplace.startsWith("tantan://")) {
                    strReplace = strReplace.replace("tantan://", "tantanapp://");
                }
                m40289K7(strReplace);
            } else {
                boolean zEquals2 = TEnum.equals(oMSLauncherInfo.f38789ad.link.action, LinkAction.deeplink);
                ADInfo aDInfo2 = oMSLauncherInfo.f38789ad;
                if (zEquals2) {
                    intentM79388b = new Intent("android.intent.action.VIEW", Uri.parse(wb50.m202528F(aDInfo2.link.url)));
                    intentM79388b.setFlags(268435456);
                    listQueryIntentActivities = act().getPackageManager().queryIntentActivities(intentM79388b, 65536);
                    int size = listQueryIntentActivities.size();
                    String str4 = oMSLauncherInfo.f38790id;
                    z = true;
                    if (size > 0) {
                        hc50.m130390g(str4, oMSLauncherInfo.f38789ad.link.deeplinkReport.appInstall);
                        hc50.m130391h(oMSLauncherInfo, "appInstall", oMSLauncherInfo.f38789ad.link.deeplinkReport.appInstall);
                        Application application = App.f15369e;
                        Runnable runnable = new Runnable() { // from class: l.j330
                            @Override // java.lang.Runnable
                            public final void run() {
                                C8096a.m40192m3(oMSLauncherInfo);
                            }
                        };
                        str = LinkAction.deeplink;
                        e51.m114743H(application, runnable, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
                        DeeplinkReport deeplinkReport = oMSLauncherInfo.f38789ad.link.deeplinkReport;
                        hc50.m130389f(oMSLauncherInfo, deeplinkReport.success, deeplinkReport.failed);
                        z2 = true;
                    } else {
                        str = LinkAction.deeplink;
                        hc50.m130390g(str4, oMSLauncherInfo.f38789ad.link.deeplinkReport.appNoInstall);
                        hc50.m130391h(oMSLauncherInfo, "appNoInstall", oMSLauncherInfo.f38789ad.link.deeplinkReport.appNoInstall);
                        intentM79388b = NullChecker.m81303a(oMSLauncherInfo.f38789ad.link.fallbackLink) ? LauncherView.m79388b(act(), wb50.m202528F(oMSLauncherInfo.f38789ad.link.fallbackLink.url), true) : null;
                    }
                } else {
                    str = LinkAction.deeplink;
                    if (!TEnum.equals(aDInfo2.link.action, "browser") || TextUtils.isEmpty(oMSLauncherInfo.f38789ad.link.url)) {
                        intentM79388b = LauncherView.m79388b(act(), wb50.m202528F(oMSLauncherInfo.f38789ad.link.url), TEnum.equals(oMSLauncherInfo.f38789ad.link.action, "webview"));
                    } else {
                        intentM79388b = new Intent("android.intent.action.VIEW");
                        intentM79388b.addCategory("android.intent.category.BROWSABLE");
                        intentM79388b.setData(Uri.parse(oMSLauncherInfo.f38789ad.link.url));
                    }
                    listQueryIntentActivities = null;
                }
                z2 = false;
                z = false;
            }
            z3 = z2;
            if (NullChecker.m81303a(intentM79388b)) {
                if (TEnum.equals(oMSLauncherInfo.f38789ad.link.action, str)) {
                    zvf0.m220371D("e_start_page_jump_result", "", vwb.m200311Y("jump_url", oMSLauncherInfo.f38789ad.link.url), vwb.m200311Y("jump_action", oMSLauncherInfo.f38789ad.link.action), vwb.m200311Y("ad_id", oMSLauncherInfo.f38790id));
                    return;
                } else {
                    Boolean bool = Boolean.FALSE;
                    zvf0.m220371D("e_start_page_jump_result", "", vwb.m200311Y("if_jump_success", bool), vwb.m200311Y("jump_types", null), vwb.m200311Y("jump_url", oMSLauncherInfo.f38789ad.link.url), vwb.m200311Y("jump_action", oMSLauncherInfo.f38789ad.link.action), vwb.m200311Y("if_app_installed", bool), vwb.m200311Y("ad_id", oMSLauncherInfo.f38790id));
                    return;
                }
            }
            try {
                OmsMerCuryData omsMerCuryData = oMSLauncherInfo.clickMercury;
                z4 = z;
                try {
                    C16281d.m109450b(omsMerCuryData.f38800id, oMSLauncherInfo.viewMercury.f38800id, omsMerCuryData.server, doubleExtra);
                    act().startActivity(intentM79388b);
                    hc50.m130390g(oMSLauncherInfo.f38790id, oMSLauncherInfo.f38789ad.trackingURLs.clickURLs);
                    hc50.m130391h(oMSLauncherInfo, "click", oMSLauncherInfo.f38789ad.trackingURLs.clickURLs);
                    str2 = str;
                    try {
                        if (TEnum.equals(oMSLauncherInfo.f38789ad.link.action, str2)) {
                            j760 j760VarM200311Y = vwb.m200311Y("if_jump_success", Boolean.valueOf(z4));
                            if (z4) {
                                str3 = str2;
                            } else {
                                str3 = "webview";
                            }
                            zvf0.m220371D("e_start_page_jump_result", "", j760VarM200311Y, vwb.m200311Y("jump_types", str3), vwb.m200311Y("jump_url", oMSLauncherInfo.f38789ad.link.url), vwb.m200311Y("jump_action", oMSLauncherInfo.f38789ad.link.action), vwb.m200311Y("if_app_installed", Boolean.valueOf(z3)), vwb.m200311Y("ad_id", oMSLauncherInfo.f38790id));
                        } else {
                            zvf0.m220371D("e_start_page_jump_result", "", vwb.m200311Y("jump_url", oMSLauncherInfo.f38789ad.link.url), vwb.m200311Y("jump_action", oMSLauncherInfo.f38789ad.link.action), vwb.m200311Y("ad_id", oMSLauncherInfo.f38790id));
                        }
                    } catch (ActivityNotFoundException unused2) {
                        if (vwb.m200296J(listQueryIntentActivities)) {
                            CrashHelper.m81296c(new ActivityNotFoundException("Intent: " + intentM79388b.toString()));
                        } else {
                            CrashHelper.m81296c(new ActivityNotFoundException("Intent: " + intentM79388b.toString() + " ResolveList: " + listQueryIntentActivities.get(0).toString()));
                        }
                        if (TEnum.equals(oMSLauncherInfo.f38789ad.link.action, str2)) {
                            zvf0.m220371D("e_start_page_jump_result", "", vwb.m200311Y("jump_url", oMSLauncherInfo.f38789ad.link.url), vwb.m200311Y("jump_action", oMSLauncherInfo.f38789ad.link.action), vwb.m200311Y("ad_id", oMSLauncherInfo.f38790id));
                            return;
                        }
                        j760 j760VarM200311Y2 = vwb.m200311Y("if_jump_success", Boolean.FALSE);
                        if (!z4) {
                            str2 = "webview";
                        }
                        zvf0.m220371D("e_start_page_jump_result", "", j760VarM200311Y2, vwb.m200311Y("jump_types", str2), vwb.m200311Y("jump_url", oMSLauncherInfo.f38789ad.link.url), vwb.m200311Y("jump_action", oMSLauncherInfo.f38789ad.link.action), vwb.m200311Y("if_app_installed", Boolean.valueOf(z3)), vwb.m200311Y("ad_id", oMSLauncherInfo.f38790id));
                        return;
                    }
                } catch (ActivityNotFoundException unused3) {
                    str2 = str;
                    if (vwb.m200296J(listQueryIntentActivities)) {
                        CrashHelper.m81296c(new ActivityNotFoundException("Intent: " + intentM79388b.toString() + " ResolveList: " + listQueryIntentActivities.get(0).toString()));
                    } else {
                        CrashHelper.m81296c(new ActivityNotFoundException("Intent: " + intentM79388b.toString()));
                    }
                    if (TEnum.equals(oMSLauncherInfo.f38789ad.link.action, str2)) {
                        zvf0.m220371D("e_start_page_jump_result", "", vwb.m200311Y("jump_url", oMSLauncherInfo.f38789ad.link.url), vwb.m200311Y("jump_action", oMSLauncherInfo.f38789ad.link.action), vwb.m200311Y("ad_id", oMSLauncherInfo.f38790id));
                        return;
                    }
                    j760 j760VarM200311Y3 = vwb.m200311Y("if_jump_success", Boolean.FALSE);
                    if (!z4) {
                        str2 = "webview";
                    }
                    zvf0.m220371D("e_start_page_jump_result", "", j760VarM200311Y3, vwb.m200311Y("jump_types", str2), vwb.m200311Y("jump_url", oMSLauncherInfo.f38789ad.link.url), vwb.m200311Y("jump_action", oMSLauncherInfo.f38789ad.link.action), vwb.m200311Y("if_app_installed", Boolean.valueOf(z3)), vwb.m200311Y("ad_id", oMSLauncherInfo.f38790id));
                    return;
                }
            } catch (ActivityNotFoundException unused4) {
                z4 = z;
            }
        }
        str = LinkAction.deeplink;
        listQueryIntentActivities = null;
        z2 = false;
        z = false;
        z3 = z2;
        if (NullChecker.m81303a(intentM79388b)) {
            if (TEnum.equals(oMSLauncherInfo.f38789ad.link.action, str)) {
                zvf0.m220371D("e_start_page_jump_result", "", vwb.m200311Y("jump_url", oMSLauncherInfo.f38789ad.link.url), vwb.m200311Y("jump_action", oMSLauncherInfo.f38789ad.link.action), vwb.m200311Y("ad_id", oMSLauncherInfo.f38790id));
                return;
            } else {
                Boolean bool2 = Boolean.FALSE;
                zvf0.m220371D("e_start_page_jump_result", "", vwb.m200311Y("if_jump_success", bool2), vwb.m200311Y("jump_types", null), vwb.m200311Y("jump_url", oMSLauncherInfo.f38789ad.link.url), vwb.m200311Y("jump_action", oMSLauncherInfo.f38789ad.link.action), vwb.m200311Y("if_app_installed", bool2), vwb.m200311Y("ad_id", oMSLauncherInfo.f38790id));
                return;
            }
        }
        OmsMerCuryData omsMerCuryData2 = oMSLauncherInfo.clickMercury;
        z4 = z;
        C16281d.m109450b(omsMerCuryData2.f38800id, oMSLauncherInfo.viewMercury.f38800id, omsMerCuryData2.server, doubleExtra);
        act().startActivity(intentM79388b);
        hc50.m130390g(oMSLauncherInfo.f38790id, oMSLauncherInfo.f38789ad.trackingURLs.clickURLs);
        hc50.m130391h(oMSLauncherInfo, "click", oMSLauncherInfo.f38789ad.trackingURLs.clickURLs);
        str2 = str;
        if (TEnum.equals(oMSLauncherInfo.f38789ad.link.action, str2)) {
            j760 j760VarM200311Y4 = vwb.m200311Y("if_jump_success", Boolean.valueOf(z4));
            if (z4) {
                str3 = str2;
            } else {
                str3 = "webview";
            }
            zvf0.m220371D("e_start_page_jump_result", "", j760VarM200311Y4, vwb.m200311Y("jump_types", str3), vwb.m200311Y("jump_url", oMSLauncherInfo.f38789ad.link.url), vwb.m200311Y("jump_action", oMSLauncherInfo.f38789ad.link.action), vwb.m200311Y("if_app_installed", Boolean.valueOf(z3)), vwb.m200311Y("ad_id", oMSLauncherInfo.f38790id));
        } else {
            zvf0.m220371D("e_start_page_jump_result", "", vwb.m200311Y("jump_url", oMSLauncherInfo.f38789ad.link.url), vwb.m200311Y("jump_action", oMSLauncherInfo.f38789ad.link.action), vwb.m200311Y("ad_id", oMSLauncherInfo.f38790id));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J8 */
    public final /* synthetic */ void m40286J8(j760 j760Var) {
        if (((TabName) j760Var.f116564a) == TabName.Card && b83.m100710d().m100719j()) {
            e51.m114742G(new Runnable() { // from class: l.a530
                @Override // java.lang.Runnable
                public final void run() {
                    this.f67628a.m40282I8();
                }
            });
        } else {
            b83.m100710d().m100712b();
        }
    }

    /* JADX INFO: renamed from: J9 */
    public void m40287J9() {
        if (zch0.m218024a().m218026c()) {
            return;
        }
        String strM177378z = NullChecker.m81303a(CoreBusinessModule.f17533c) ? CoreBusinessModule.f17533c.m177378z() : "";
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        String strM198634m = vjf0.m198623e().m198634m(strM177378z, NullChecker.m81303a(userM169527p9) ? userM169527p9.publicId : "", vjf0.m198623e().m198631i(), "", false);
        if (TextUtils.isEmpty(strM198634m)) {
            return;
        }
        Intent intentM80173m2 = WebViewDialogAct.m80173m2(CoreModule.f17544b, "", strM198634m, true, true);
        intentM80173m2.putExtra("hideNavigationBar", true);
        intentM80173m2.putExtra("skipLoading", true);
        act().startActivity(intentM80173m2);
    }

    /* JADX INFO: renamed from: K6 */
    public final void m40288K6() {
        if (upa.m194675N3()) {
            duringCreated(v930.m197537k().distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.o330
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f141609a.m40363c8((TabName) obj);
                }
            }));
            duringCreated(CoreModule.m29936Q().mo67227L7()).subscribe(mkd0.m154955G(new e30() { // from class: l.z330
                @Override // p149l.e30
                public final void call(Object obj) {
                    f4v.m119459f().m119468n(CoreModule.m29931H().userId());
                }
            }));
        }
    }

    /* JADX INFO: renamed from: K7 */
    public final void m40289K7(String str) {
        if (TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(w2e0.f184217g) && w2e0.f184217g.startsWith("tantan")) {
                j2e0.m139446m(act(), Uri.parse(w2e0.f184217g));
            }
            w2e0.f184217g = null;
            return;
        }
        if (str.startsWith("tantan")) {
            j2e0.m139446m(act(), Uri.parse(str));
        } else {
            act().startActivity(AccessTokenWebViewAct.m80150Z1(act(), "", str));
        }
    }

    /* JADX INFO: renamed from: K8 */
    public final /* synthetic */ void m40290K8(Boolean bool) {
        m40433t9(TabName.Me, m40256B9());
    }

    /* JADX INFO: renamed from: K9 */
    public final void m40291K9() {
        vve0.INSTANCE.m200191a(App.f15369e).getManagerImpl().mo200183c(-2147483648L, new l());
    }

    /* JADX INFO: renamed from: L6 */
    public final void m40292L6() {
        if (CoreModule.f17545c.f19639e0.f149326a1.get().booleanValue()) {
            return;
        }
        CoreModule.f17545c.f19639e0.f149326a1.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: L7 */
    public final void m40293L7() {
        if (!TextUtils.isEmpty(w2e0.f184217g) && w2e0.f184217g.startsWith("tantan") && w2e0.f184217g.contains("https://subscribe.tantanapp.com")) {
            Uri uri = Uri.parse(w2e0.f184217g.trim());
            final String strTrim = uri.getQueryParameter("url") != null ? uri.getQueryParameter("url").trim() : "";
            final boolean zEquals = "true".equals(uri.getQueryParameter("openExternalURL"));
            if (TextUtils.isEmpty(strTrim)) {
                w2e0.f184217g = null;
            } else {
                duringCreated(CoreModule.f17545c.f19556C1.m202273c3()).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.m130
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f130796a.m40347Y8(zEquals, strTrim, (IntlThirdQuickLoginEnvelope) obj);
                    }
                }, new e30() { // from class: l.n130
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        C8096a.m40095Q1((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: L8 */
    public final /* synthetic */ void m40294L8(Boolean bool) {
        m40433t9(TabName.Me, m40256B9());
    }

    /* JADX INFO: renamed from: L9 */
    public void m40295L9(boolean z) {
        if (z && (!CoreModule.f17545c.f19639e0.f149173F4.get().booleanValue() || !CoreModule.f17545c.f19639e0.m169472b8(false) || (CoreModule.f17545c.f19639e0.m169527p9().settings.getSettingGroup() != null && CoreModule.f17545c.f19639e0.m169527p9().settings.getSettingGroup().marriage != null && CoreModule.f17545c.f19639e0.m169527p9().settings.getSettingGroup().marriage.closeMode))) {
            act().startActivity(MarryInfoAuditStatusAct.m47401Z1(act(), "mode_switching"));
            return;
        }
        CoreModule.f17545c.f19639e0.f149321Z3.put(z ? UserHomeMode.marryMode : UserHomeMode.loveMode);
        CoreModule.f17545c.f19639e0.f149170F1.m132487l(roj0.f160388a);
        p09.m166948w().m166960L(this.f195256b, z);
    }

    /* JADX INFO: renamed from: M6 */
    public final void m40296M6() {
        duringCreated(((PutongAct) act()).iap().m148932h()).subscribe(mkd0.m154956H(new e30() { // from class: l.o430
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141734a.m40367d8((AbstractC0865a) obj);
            }
        }, new e30() { // from class: l.p430
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40111T1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M7 */
    public final void m40297M7() {
        if (!upa.m194745e2() || CoreModule.f17545c.f19639e0.f149369f4.get().booleanValue()) {
            return;
        }
        CoreModule.f17545c.f19639e0.f149369f4.put(Boolean.TRUE);
        if (this.f195260f) {
            return;
        }
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        Purpose purpose = (NullChecker.m81303a(userM169527p9.profile.extensions) && NullChecker.m81303a(userM169527p9.profile.extensions.basic) && !vwb.m200296J(userM169527p9.profile.extensions.basic.friendPurpose) && NullChecker.m81303a(userM169527p9.profile.extensions.basic.friendPurpose.get(0))) ? userM169527p9.profile.extensions.basic.friendPurpose.get(0) : null;
        if (!TextUtils.equals(CoreModule.f17545c.f19639e0.f149321Z3.get(), UserHomeMode.marryMode) && TEnum.equals(purpose, "marriage")) {
            act().startActivity(MarryInfoAuditStatusAct.m47401Z1(m142773Y(), "mode_switching"));
        }
    }

    /* JADX INFO: renamed from: M8 */
    public final /* synthetic */ void m40298M8(roj0 roj0Var) {
        if (!ConnectivityReceiver.m81284g() || TextUtils.isEmpty(vjf0.m198623e().m198633k())) {
            return;
        }
        m40287J9();
    }

    /* JADX INFO: renamed from: M9 */
    public final void m40299M9() {
        Act act = this.f195255a;
        if (act == null) {
            return;
        }
        pcl0 pcl0VarM2557i0 = act.fragmentManager().m2557i0(TabName.Card.toString());
        if (pcl0VarM2557i0 instanceof psl) {
            psl pslVar = (psl) pcl0VarM2557i0;
            NewTanFragTag newTanFragTag = NewTanFragTag.HOME;
            pslVar.mo38546I2(newTanFragTag);
            pslVar.mo38565n2(newTanFragTag);
            CoreModule.f17545c.f19663m0.f19423j2.m132487l(roj0.f160388a);
        }
    }

    /* JADX INFO: renamed from: N6 */
    public final void m40300N6() {
        if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169527p9()) && u59.m191810S()) {
            if (CoreModule.f17545c.f19639e0.m169527p9().isSVIP()) {
                CoreModule.f17545c.f19654j0.m30598N4(ProductCategory.get("svip"));
            } else if (CoreModule.f17545c.f19639e0.m169527p9().isVIP()) {
                CoreModule.f17545c.f19654j0.m30598N4(ProductCategory.get("vip"));
            }
            CoreModule.f17545c.f19654j0.m30598N4(ProductCategory.get("seeWhoLikedMe"));
        }
    }

    /* JADX INFO: renamed from: N7 */
    public final /* synthetic */ void m40301N7(Boolean bool) {
        if (bool.booleanValue()) {
            m40333V9(true);
        }
    }

    /* JADX INFO: renamed from: N8 */
    public final /* synthetic */ void m40302N8(NetworkInfo networkInfo) {
        if (TextUtils.isEmpty(vjf0.m198623e().m198633k())) {
            return;
        }
        if (!vjf0.m198623e().m198630g()) {
            m40287J9();
        } else {
            if (vjf0.m198623e().m198635n()) {
                return;
            }
            vjf0.m198623e().m198645x().m132487l(Boolean.FALSE);
            m40287J9();
        }
    }

    /* JADX INFO: renamed from: N9 */
    public final void m40303N9() {
        Act act = this.f195255a;
        if (act == null) {
            return;
        }
        pcl0 pcl0VarM2557i0 = act.fragmentManager().m2557i0(TabName.Card.toString());
        if (pcl0VarM2557i0 instanceof psl) {
            psl pslVar = (psl) pcl0VarM2557i0;
            NewTanFragTag newTanFragTag = NewTanFragTag.MARRY_MODE;
            pslVar.mo38546I2(newTanFragTag);
            pslVar.mo38565n2(newTanFragTag);
            CoreModule.f17545c.f19639e0.f149221M4.put(2);
        }
    }

    /* JADX INFO: renamed from: O6 */
    public final void m40304O6() {
        if (u59.m191811T() || upa.m194649I2()) {
            CoreModule.f17545c.f19678r0.m34092J6();
            duringCreated(new v9j() { // from class: l.w230
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return CoreModule.f17545c.f19678r0.m34098M6();
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.x230
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40096Q2((GreetingSummary) obj);
                }
            }, new e30() { // from class: l.y230
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40069K2((Throwable) obj);
                }
            }));
            duringCreated(new v9j() { // from class: l.z230
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return CoreModule.f17545c.f19678r0.m34096L6();
                }
            }).filter(new w9j() { // from class: l.a330
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.m81303a((GreetingSummary) obj));
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.b330
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19678r0.m34083F5((GreetingSummary) obj, "fake_conversation_anonymous_greeting");
                }
            }, new e30() { // from class: l.c330
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40037D2((Throwable) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O7 */
    public final /* synthetic */ void m40305O7(j760 j760Var) {
        Objects.toString(j760Var.f116564a);
        if (((Integer) j760Var.f116564a).intValue() > 0) {
            mrm.m156049o().m156051C(act());
        }
        mrm.m156049o().m156052D(((Integer) j760Var.f116564a).intValue());
        mrm.m156049o().m156053E((Integer) j760Var.f116565b);
    }

    /* JADX INFO: renamed from: O9 */
    public C22306c<TabName> m40307O9() {
        return this.f24501s;
    }

    /* JADX INFO: renamed from: P6 */
    public final void m40308P6() {
        if (upa.m194706V1()) {
            if (!C4736e.f19768F0.get().booleanValue()) {
                C4736e.f19768F0.put(Boolean.TRUE);
            }
        } else if (C4736e.f19768F0.get().booleanValue()) {
            CoreModule.f17545c.f19642f0.m32678If();
        }
        if (C4740g.f19831T2.get().booleanValue()) {
            CoreModule.f17545c.f19642f0.m32654Gf();
        }
    }

    /* JADX INFO: renamed from: P7 */
    public final /* synthetic */ void m40309P7() {
        ((NewMainViewModel) this.viewModel).m39971I0();
    }

    /* JADX INFO: renamed from: P9 */
    public TabName m40311P9() {
        return this.f24501s.m221515e();
    }

    /* JADX INFO: renamed from: Q6 */
    public final void m40312Q6() {
        if (upa.m194706V1()) {
            CoreModule.f17545c.f19645g0.m31840R8();
            CoreModule.f17545c.f19645g0.m31849U8();
        }
    }

    /* JADX INFO: renamed from: Q7 */
    public final /* synthetic */ void m40313Q7() {
        r70.m178118g().m178120h(act(), new Runnable() { // from class: l.g630
            @Override // java.lang.Runnable
            public final void run() {
                this.f101223a.m40309P7();
            }
        });
    }

    /* JADX INFO: renamed from: Q9 */
    public final void m40314Q9(boolean z) {
        PutongFrag putongFrag = this.f24503u;
        if (putongFrag == null) {
            return;
        }
        if (putongFrag instanceof BuzzComboFrag) {
            ((BuzzComboFrag) putongFrag).m46894M4();
            return;
        }
        String tag = putongFrag.getTag();
        if (!ddj0.m111021b(tag) || !tag.equals(TabName.Card.toString())) {
            this.f24503u.mo29638J4().m109035k();
        } else if (z) {
            HomeStatisticsHelper.m36690D(false);
        }
    }

    /* JADX INFO: renamed from: R6 */
    public final void m40315R6() {
        p09.m166948w().m166955G(act());
        if (vy8.m200612j() || vy8.m200614l() || vy8.m200613k()) {
            p09.m166948w().m166959K(act());
            lqf.m151015a().m151016b(ExtraActLifecycle.onResumeFromBackground, new e30() { // from class: l.i330
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f110606a.m40371e8((Act) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: R7 */
    public final /* synthetic */ void m40316R7(Bundle bundle) {
        m40449x9();
    }

    /* JADX INFO: renamed from: R8 */
    public final /* synthetic */ void m40317R8(Bundle bundle) {
        qib0.f154713b0.f139230a.checkSmartLockSave(act());
    }

    /* JADX INFO: renamed from: R9 */
    public final void m40318R9(TabName tabName, boolean z, boolean z2) {
        TabName tabName2;
        wb3 wb3VarMo67250Ys;
        V v2 = this.viewModel;
        if (v2 != 0 && z && tabName == (tabName2 = TabName.Live)) {
            boolean zM39991W = ((NewMainViewModel) v2).m39991W(tabName2, BottomBarManager.DotType.Dot);
            boolean zM39992X = ((NewMainViewModel) this.viewModel).m39992X(tabName2);
            boolean z3 = false;
            boolean z4 = (zM39991W || zM39992X) ? false : true;
            boolean z5 = z2 && !zM39992X;
            if (!z2 && !zM39991W) {
                z3 = true;
            }
            if ((z4 || z5 || z3) && (this.lifecycleProviderImpl instanceof NewMainAct) && (wb3VarMo67250Ys = CoreModule.m29936Q().mo67250Ys()) != null) {
                sdt.m183553c(((NewMainAct) this.lifecycleProviderImpl).m39799Y5().f116564a, wb3VarMo67250Ys.m202503a(), wb3VarMo67250Ys.f185547b, wb3VarMo67250Ys.f185548c, wb3VarMo67250Ys.f185549d);
            }
        }
    }

    /* JADX INFO: renamed from: S6 */
    public final void m40319S6() {
        if ((upa.m194639G2() || upa.m194644H2() || upa.m194814s1()) && !myf.m157032L()) {
            boolean z = upa.m194639G2() || upa.m194644H2();
            boolean zM194814s1 = upa.m194814s1();
            if (z) {
                duringCreated(CoreModule.f17545c.f19639e0.m169541t7().filter(new u()).filter(new t())).subscribe(mkd0.m154956H(new a(zM194814s1), new b()));
            }
            duringCreated(v930.m197537k().filter(new w9j() { // from class: l.w430
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    TabName tabName = (TabName) obj;
                    return Boolean.valueOf(tabName == TabName.Card || tabName == TabName.Me);
                }
            }).distinctUntilChanged()).subscribe(mkd0.m154956H(new c(zM194814s1, z), new e30() { // from class: l.x430
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40102R2((Throwable) obj);
                }
            }));
            duringCreated(CoreModule.f17545c.f19639e0.m169523o9().map(new w9j() { // from class: l.y430
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((User) obj).pictures.get(0).url;
                }
            }).distinctUntilChanged().skip(1)).subscribe(mkd0.m154955G(new d()));
            duringCreated(CoreModule.f17545c.f19639e0.m169523o9().map(new w9j() { // from class: l.z430
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((User) obj).isAudit());
                }
            }).distinctUntilChanged()).subscribe(mkd0.m154955G(new e()));
        }
    }

    /* JADX INFO: renamed from: S7 */
    public final /* synthetic */ void m40320S7(User user) {
        ((NewMainViewModel) this.viewModel).m39977L0(user.riskAuditUser(CoreModule.m29932K().getUserById("fake_risk_audit_default_" + user.f56011id)).m60124fp().profileSmall().formatted());
        m40338W9();
    }

    /* JADX INFO: renamed from: S8 */
    public final /* synthetic */ void m40321S8(TabName tabName) {
        ((NewMainViewModel) this.viewModel).m40011m0(tabName);
        if (tabName == TabName.Msg) {
            CoreModule.f17545c.f19642f0.m32926cp();
            if (upa.m194841x3() && !CoreModule.f17545c.f19639e0.f149489v3.get().booleanValue()) {
                CoreModule.f17545c.f19639e0.f149489v3.put(Boolean.TRUE);
                lsi0.m151595y("您上线后会为您通知好友，如不需要可到隐私通知里关闭功能");
            }
        } else if (tabName == TabName.Meet) {
            Frag frag = (Frag) this.f195255a.fragmentManager().m2557i0(tabName.toString());
            if (frag instanceof IntlTribeMeetFrag) {
                ((IntlTribeMeetFrag) frag).m39454O4();
            }
        }
        TabName tabName2 = this.f24498G;
        TabName tabName3 = TabName.Live;
        if (tabName2 == tabName3 && tabName != tabName3) {
            m40429s9();
        }
        this.f24498G = tabName;
    }

    /* JADX INFO: renamed from: S9 */
    public final void m40322S9(boolean z) {
        if (m.f24524a[this.f195256b.ordinal()] == 5 && upa.m194795o2() && this.f24492A && z) {
            zvf0.m220396r("e_mytab_incomplete", "p_suggest_users_home_view");
        }
    }

    /* JADX INFO: renamed from: T6 */
    public final void m40323T6() {
        if ((upa.m194639G2() || upa.m194644H2() || upa.m194814s1()) && !myf.m157032L()) {
            duringCreated(CoreModule.f17545c.f19555C0.m210114x3().timeout(5L, TimeUnit.SECONDS).materialize().observeOn(jo0.m142408a()).first()).subscribe(mkd0.m154955G(new e30() { // from class: l.s230
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f161957a.m40375f8((Notification) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T7 */
    public final /* synthetic */ void m40324T7(knb0 knb0Var) {
        Counter counter = (Counter) knb0Var.f123873a;
        ConversationCounter conversationCounter = (ConversationCounter) knb0Var.f123874b;
        if (conversationCounter == null) {
            return;
        }
        Boolean bool = (Boolean) knb0Var.f123875c;
        int iMo33677E7 = ura.m195053e().m195057d().mo33677E7(conversationCounter.conversations);
        int iM203413b = wjc0.m203413b(counter, conversationCounter, bool);
        CoreModule.f17545c.f19642f0.f19978t2.m132487l(new xaj0<>(Integer.valueOf(iMo33677E7), Integer.valueOf(iM203413b - iMo33677E7), Integer.valueOf(conversationCounter.conversations.unseen)));
        int iIntValue = iM203413b + ((e5s) knb0Var.f123876d).f89468g + qib0.f154713b0.f139232c.mo67228Lh().mo95350d().m221515e().intValue() + CoreModule.m29936Q().mo67280r9().mo123878d().m221515e().intValue();
        if (i36.m134149g().m134159n()) {
            iIntValue += i36.m134149g().m134156k();
        }
        if (upa.m194624D2()) {
            hu40.m133026a().m133030e(iIntValue);
        }
        int iMax = Math.max(iIntValue - CoreModule.f17545c.f19642f0.f19975s2, 0);
        ((NewMainViewModel) this.viewModel).m40014p0(TabName.Msg, iMax > 0 || Boolean.TRUE.equals(CoreModule.f17545c.f19642f0.f19972r2.m221515e()));
        CoreModule.f17545c.f19642f0.f19969q2.m132487l(j760.m140076a(Integer.valueOf(iMax), 0));
    }

    /* JADX INFO: renamed from: T8 */
    public final /* synthetic */ void m40325T8(Bundle bundle) {
        ((NewMainViewModel) this.viewModel).f24461a.setDrawerLockMode(1);
    }

    /* JADX INFO: renamed from: T9 */
    public final void m40326T9(boolean z) {
        PutongFrag putongFrag = this.f24503u;
        if (putongFrag == null) {
            return;
        }
        if (putongFrag instanceof BuzzComboFrag) {
            ((BuzzComboFrag) putongFrag).m46895N4();
            return;
        }
        String tag = putongFrag.getTag();
        if (!ddj0.m111021b(tag) || !tag.equals(TabName.Card.toString())) {
            this.f24503u.mo29638J4().m109036l();
            return;
        }
        if (z) {
            HomeStatisticsHelper.m36690D(true);
            if (HomeStatisticsHelper.m36706l()) {
                HomeStatisticsHelper.m36689C(false);
                HomeStatisticsHelper.m36716v();
                HomeStatisticsHelper.m36709o();
                HomeStatisticsHelper.m36689C(true);
                HomeStatisticsHelper.m36717w();
            }
        }
    }

    /* JADX INFO: renamed from: U7 */
    public final /* synthetic */ void m40327U7(Integer num) {
        this.f24499H.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: U8 */
    public final /* synthetic */ void m40328U8(TabName tabName) {
        if (upa.m194745e2() && tabName == TabName.Card) {
            ((NewMainViewModel) this.viewModel).f24461a.setDrawerLockMode(0);
        } else {
            ((NewMainViewModel) this.viewModel).f24461a.setDrawerLockMode(1);
        }
    }

    /* JADX INFO: renamed from: U9 */
    public final void m40329U9(String str, boolean z) {
        int i2 = m.f24524a[this.f195256b.ordinal()];
        if (i2 == 1) {
            o6j0.m162859c("e_suggest_users_home", str, o6j0.C18854a.m162878h("click_change", z ? "change" : "click"));
            return;
        }
        if (i2 == 2) {
            o6j0.m162859c("e_messages", str, o6j0.C18854a.m162878h("click_change", z ? "change" : "click"));
            NewMainViewModel newMainViewModel = (NewMainViewModel) this.viewModel;
            TabName tabName = TabName.Msg;
            if (newMainViewModel.m39991W(tabName, BottomBarManager.DotType.Dot) || ((NewMainViewModel) this.viewModel).m39992X(tabName)) {
                zvf0.m220397s("e_red_dot_message", "p_suggest_users_home_view", u4e.m191728c("red_dot", "red_dot_normal", SeeSwitchName.message_tab, "swipe_page", "sub_page_unread"));
                return;
            } else {
                zvf0.m220397s("e_red_dot_message", "p_suggest_users_home_view", u4e.m191729d());
                return;
            }
        }
        if (i2 != 4) {
            if (i2 == 5) {
                o6j0.m162859c("e_navigation", str, o6j0.C18854a.m162878h("click_change", z ? "change" : "click"));
                return;
            }
            if (i2 == 6) {
                u9w.INSTANCE.m192676i();
                p9w.INSTANCE.m167966z();
                return;
            } else {
                if (i2 != 8) {
                    return;
                }
                o6j0.m162859c("e_intl_tab_meet", "p_intl_meet_view", new o6j0.C18854a[0]);
                return;
            }
        }
        o6j0.C18854a c18854aM162878h = o6j0.C18854a.m162878h("click_change", z ? "change" : "click");
        NewMainViewModel newMainViewModel2 = (NewMainViewModel) this.viewModel;
        TabName tabName2 = TabName.Moment;
        BottomBarManager.DotType dotType = BottomBarManager.DotType.Dot;
        o6j0.m162859c("e_explore", str, c18854aM162878h, o6j0.C18854a.m162878h("red_dot", (newMainViewModel2.m39991W(tabName2, dotType) || ((NewMainViewModel) this.viewModel).m39992X(tabName2)) ? "true" : "false"), o6j0.C18854a.m162878h("tab_state", this.f24495D ? BLiveOperationActionAfterCountdown.refresh : Explore.TYPE));
        if (((NewMainViewModel) this.viewModel).m39991W(tabName2, dotType) || ((NewMainViewModel) this.viewModel).m39992X(tabName2)) {
            zvf0.m220397s("e_red_dot_explore", "p_suggest_users_home_view", u4e.m191728c("red_dot", "red_dot_normal", "explore_tab", "swipe_page", "sub_page_unread"));
        } else {
            zvf0.m220397s("e_red_dot_explore", "p_suggest_users_home_view", u4e.m191729d());
        }
    }

    /* JADX INFO: renamed from: V6 */
    public final void m40330V6() {
        if (y19.m212153M()) {
            duringCreated(new v9j() { // from class: l.a830
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return Act.foreground();
                }
            }, false).filter(new w9j() { // from class: l.b830
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(r9m.m178395r().m178410z());
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.c830
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40215s2((Act.C4299r) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: V7 */
    public final /* synthetic */ void m40331V7(Boolean bool) {
        this.f24499H.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: V8 */
    public final /* synthetic */ void m40332V8(String str) {
        z2x.m217001d(act(), str);
    }

    /* JADX INFO: renamed from: V9 */
    public final void m40333V9(boolean z) {
        duringCreated(z ? CoreModule.f17545c.f19597Q0.m173715y3() : CoreModule.f17545c.f19597Q0.m173716z3()).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.i430
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111404a.m40364c9((TtcMigrateDisplayData) obj);
            }
        }));
        CoreModule.f17545c.f19597Q0.m173710p3(z);
    }

    /* JADX INFO: renamed from: W5 */
    public final void m40334W5() {
        if (upa.m194745e2()) {
            if (CoreModule.f17545c.f19639e0.m169527p9().settings.getSettingGroup() != null && CoreModule.f17545c.f19639e0.m169527p9().settings.getSettingGroup().marriage == null) {
                CrashHelper.m81296c(new RuntimeException("core.user.me_().settings.getSettingGroup().marriage == null"));
                return;
            }
            if (CoreModule.f17545c.f19639e0.m169527p9().settings.getSettingGroup() != null && CoreModule.f17545c.f19639e0.m169527p9().settings.getSettingGroup().marriage != null && CoreModule.f17545c.f19639e0.m169527p9().settings.getSettingGroup().marriage.closeMode) {
                CoreModule.f17545c.f19639e0.f149321Z3.put(UserHomeMode.loveMode);
                CoreModule.f17545c.f19639e0.f149221M4.put(2);
                return;
            }
            if (CoreModule.f17545c.f19639e0.f149221M4.get().intValue() == 2) {
                return;
            }
            if (CoreModule.f17545c.f19639e0.f149221M4.get().intValue() != 0) {
                if (CoreModule.f17545c.f19639e0.f149221M4.get().intValue() == 1) {
                    CoreModule.f17545c.f19639e0.f149221M4.put(2);
                    CoreModule.f17545c.f19639e0.f149321Z3.put(UserHomeMode.marryMode);
                    return;
                }
                return;
            }
            if (TextUtils.equals(CoreModule.f17545c.f19639e0.f149321Z3.get(), UserHomeMode.marryMode)) {
                CoreModule.f17545c.f19639e0.f149221M4.put(2);
            } else if (!CoreModule.f17545c.f19639e0.m169472b8(false)) {
                duringCreated(C22306c.combineLatest(CoreModule.f17545c.f19552B0.m31611j4().distinctUntilChanged(), CoreModule.f17545c.f19639e0.m169523o9().distinctUntilChanged(), new g830())).subscribe(mkd0.m154955G(new e30() { // from class: l.i830
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        C8096a.m40229v4((j760) obj);
                    }
                }));
            } else {
                CoreModule.f17545c.f19639e0.f149221M4.put(2);
                CoreModule.f17545c.f19639e0.f149321Z3.put(UserHomeMode.marryMode);
            }
        }
    }

    /* JADX INFO: renamed from: W6 */
    public final void m40335W6() {
        act().duringCreated((C22306c) CoreModule.f17545c.f19655j1.m30127d(), false).filter(new w9j() { // from class: l.d230
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f83324a.m40379g8((CoreInnerPush.C4716a) obj);
            }
        }).flatMap(new w9j() { // from class: l.e230
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f88878a.m40384h8((CoreInnerPush.C4716a) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.f230
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f94144a.m40392j8((CoreInnerPush.C4716a) obj);
            }
        }, new e30() { // from class: l.g230
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40127W1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W7 */
    public final /* synthetic */ void m40336W7(Integer num) {
        this.f24499H.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: W8 */
    public final /* synthetic */ void m40337W8(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        V v2 = this.viewModel;
        if (!zBooleanValue) {
            ((NewMainViewModel) v2).f24461a.m2415d(3);
        } else {
            ((NewMainViewModel) v2).f24461a.m2399I(3);
            ((NewMainViewModel) this.viewModel).m39985P0();
        }
    }

    /* JADX INFO: renamed from: W9 */
    public final void m40338W9() {
        if (!CoreModule.f17545c.f19639e0.m169464Z7()) {
            C4737e0.m31949a().m31955f();
        } else if (CoreModule.f17545c.f19639e0.m169506k8() || CoreModule.f17545c.f19639e0.m169452W7()) {
            C4737e0.m31949a().m31955f();
        }
    }

    /* JADX INFO: renamed from: X5 */
    public void m40339X5(TabName tabName) {
        mo40352a1(tabName, false);
    }

    /* JADX INFO: renamed from: X6 */
    public final void m40340X6() {
        CoreModule.f17545c.f19696x0.m30180I4();
        duringCreated(CoreModule.f17545c.f19696x0.m30212q4()).subscribe(mkd0.m154956H(new e30() { // from class: l.u830
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175094a.m40396k8((Boolean) obj);
            }
        }, new e30() { // from class: l.v830
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40076L5((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19696x0.m30214r4()).subscribe(mkd0.m154956H(new e30() { // from class: l.w830
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185140a.m40400l8((Long) obj);
            }
        }, new e30() { // from class: l.x830
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40155d2((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19555C0.m210114x3().distinctUntilChanged()).subscribe(mkd0.m154956H(new e30() { // from class: l.y830
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196761a.m40404m8((List) obj);
            }
        }, new e30() { // from class: l.z830
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40170g5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X7 */
    public final /* synthetic */ void m40341X7(roj0 roj0Var) {
        if (m40273G7(TabName.Msg)) {
            CoreModule.f17545c.f19687u0.m30427Z6(0L);
        }
    }

    /* JADX INFO: renamed from: X8 */
    public final /* synthetic */ void m40342X8(roj0 roj0Var) {
        if (!CoreModule.f17545c.f19639e0.f149321Z3.get().equals(UserHomeMode.marryMode)) {
            m40299M9();
        } else {
            m40303N9();
            e51.m114743H(((NewMainViewModel) this.viewModel).getAct(), new f(), 10L);
        }
    }

    /* JADX INFO: renamed from: X9 */
    public final void m40343X9() {
        if (n3b0.m157742q() && CoreModule.f17545c.f19687u0.f19254k0.get().longValue() == 0 && CoreModule.f17545c.f19687u0.f19254k0.get().longValue() == 0) {
            CoreModule.f17545c.f19687u0.f19254k0.put(Long.valueOf(qib0.f154693H.guessedCurrentServerTime()));
        }
    }

    /* JADX INFO: renamed from: Y5 */
    public final void m40344Y5() {
        if (wf6.m202951f()) {
            CoreModule.f17545c.f19642f0.m32971gn();
        }
    }

    /* JADX INFO: renamed from: Y6 */
    public final void m40345Y6() {
        if (TEnum.equals(qib0.f154719h0, LiveRegionTag.indonesia)) {
            final String str = CoreModule.f17545c.f19632b2.f196389R.get();
            duringCreated(CoreModule.f17545c.f19632b2.m212960e3()).subscribe(mkd0.m154956H(new e30() { // from class: l.j230
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f115879a.m40408n8(str, (String) obj);
                }
            }, new e30() { // from class: l.k230
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40059I1((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Y7 */
    public final /* synthetic */ void m40346Y7(Integer num) {
        this.f24499H.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: Y8 */
    public final /* synthetic */ void m40347Y8(boolean z, String str, IntlThirdQuickLoginEnvelope intlThirdQuickLoginEnvelope) {
        HashMap map = new HashMap();
        map.put("step", "4");
        map.put("available", "true");
        map.put("code", intlThirdQuickLoginEnvelope.meta.code + "");
        map.put("tracker", "");
        if (intlThirdQuickLoginEnvelope.meta.code != 200000) {
            lsi0.m151578h(R$string.f18663k9);
        } else if (z) {
            m40405m9(act(), str, intlThirdQuickLoginEnvelope.data.code);
        } else {
            m40409n9(act(), str, intlThirdQuickLoginEnvelope.data.code);
        }
        w2e0.f184217g = null;
    }

    /* JADX INFO: renamed from: Z5 */
    public final void m40348Z5() {
        act().postDelayed(new k(), 1000L);
    }

    /* JADX INFO: renamed from: Z6 */
    public final void m40349Z6() {
        if (CoreModule.f17557o.m195055b().mo33647Eh()) {
            duringCreated(this.f24501s.distinctUntilChanged().filter(new w9j() { // from class: l.v330
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Msg);
                }
            }).map(new w9j() { // from class: l.w330
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.f17545c.f19687u0.m30425Y6();
                }
            }).flatMap(new w9j() { // from class: l.x330
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return mkd0.m154984r(CoreModule.f17545c.f19667n1.m34272S3(), CoreModule.f17545c.f19687u0.m30405O6(), new x9j() { // from class: l.i530
                        @Override // p149l.x9j
                        public final Object call(Object obj2, Object obj3) {
                            return new j760((VisitorDoorInfo) obj2, (CoreLikers.C4719a) obj3);
                        }
                    });
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.y330
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40194m5((j760) obj);
                }
            }, new e30() { // from class: l.a430
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40084N4((Throwable) obj);
                }
            }));
            duringCreated(CoreModule.f17545c.f19555C0.m210114x3().distinctUntilChanged()).subscribe(mkd0.m154956H(new e30() { // from class: l.b430
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19667n1.m34272S3();
                }
            }, new e30() { // from class: l.c430
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40132X2((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Z7 */
    public final /* synthetic */ void m40350Z7(j760 j760Var) {
        ((NewMainViewModel) this.viewModel).m40013o0(j760Var);
    }

    /* JADX INFO: renamed from: Z8 */
    public final /* synthetic */ void m40351Z8(User user) {
        abi.m95624L(act(), user, 0, true);
    }

    @Override // p149l.y030, p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        LaunchStep launchStep = LaunchStep.NewMainBaseSub;
        yni.m215417f(launchStep);
        y8i0.m213379a("NewMainPresenter initSubscription");
        super.mo39470a0();
        LaunchStep launchStep2 = LaunchStep.NewMainSub;
        yni.m215416e(launchStep, launchStep2);
        p420.m167354t(act());
        m40291K9();
        mah0.m153729s0().m153773k1();
        m40411o7();
        m40312Q6();
        m40423r7();
        m40257C6();
        m40296M6();
        creates(new e30() { // from class: l.h530
            @Override // p149l.e30
            public final void call(Object obj) {
                ghd0.m126181e();
            }
        });
        creates(new e30() { // from class: l.p630
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147363a.m40100Q8((Bundle) obj);
            }
        }, new d30() { // from class: l.a730
            @Override // p149l.d30
            public final void call() {
                y1j.m212200j();
            }
        });
        m40300N6();
        creates(new e30() { // from class: l.l730
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f126689a.m40317R8((Bundle) obj);
            }
        });
        m40308P6();
        m40280I6();
        m40269F6();
        duringCreated(this.f24501s).filter(new w9j() { // from class: l.w730
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TabName.Me.equals((TabName) obj) && CoreModule.m29932K().mo30835xf());
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.h830
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19573I0.m140260N3();
            }
        }));
        m40304O6();
        m40231v7();
        m40398l6();
        m40390j6();
        m40368d9();
        m40455z7();
        gp80.m127344l(act());
        m40427s7();
        m40335W6();
        m40421q9();
        CoreModule.f17545c.f19579K0.m176991z3();
        m40391j7();
        m40414p6();
        m40373f6();
        m40254B7();
        m40447x7();
        m40366d7();
        duringCreated(act().lifecycle().filter(new w9j() { // from class: l.s830
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).skip(1)).subscribe(mkd0.m154955G(new e30() { // from class: l.d930
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40191m2((C4319c) obj);
            }
        }));
        m40284J6();
        m40261D6();
        m40362c7();
        m40330V6();
        m40315R6();
        m40419q7();
        m40276H6();
        m40425r9();
        m40415p7();
        m40345Y6();
        m40262D7();
        m40443w7();
        m40383h7();
        m40446x6();
        m40288K6();
        m40361c6();
        m40323T6();
        m40258C7();
        if (RemoteConfig.m79298x().m79330s("delay_jobs_after_cold_start")) {
            qib0.m174829r0(new Runnable() { // from class: l.o930
                @Override // java.lang.Runnable
                public final void run() {
                    this.f142690a.m40310P8();
                }
            }, true);
        } else {
            m40310P8();
        }
        m40340X6();
        m40248z6();
        yni.m215415d(launchStep2);
        y8i0.m213380b();
        m40376f9();
        m40387i7();
        m40265E6();
        m40395k7();
        m40121U6();
        m40403m7();
        m40378g7();
        m40349Z6();
        m40270F7();
        m40407n7();
        m40370e7();
        m40374f7();
        m40358b7();
        m40354a7();
    }

    @Override // p149l.y030
    /* JADX INFO: renamed from: a1 */
    public void mo40352a1(TabName tabName, boolean z) {
        m40406n6(tabName, z);
    }

    /* JADX INFO: renamed from: a6 */
    public final void m40353a6() {
        duringCreated(CoreModule.f17545c.f19597Q0.m173714x3()).subscribe(mkd0.m154955G(new e30() { // from class: l.c230
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f78328a.m40301N7((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a7 */
    public final void m40354a7() {
        duringCreated(NavigationBarAdmobHelper.INSTANCE.m36151l()).subscribe(mkd0.m154955G(new e30() { // from class: l.p230
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146800a.m40412o8((Integer) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19555C0.m210114x3().distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.q230
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152198a.m40416p8((List) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.r230
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return CoreModule.f17545c.f19639e0.m169523o9().distinctUntilChanged();
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.t230
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167439a.m40420q8((User) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19633c0.m112188c3()).subscribe(mkd0.m154956H(new e30() { // from class: l.u230
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40108S3((UserLiveHierarchy) obj);
            }
        }, new n()));
        duringCreated(v930.m197537k().distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.v230
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f179340a.m40424r8((TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a8 */
    public final /* synthetic */ void m40355a8(ExpandedCardStyleHelper.ExpandedCardStyle expandedCardStyle) {
        ((NewMainViewModel) this.viewModel).m39972J(expandedCardStyle == ExpandedCardStyleHelper.ExpandedCardStyle.EXPANDED_PROFILE_STYLE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a9 */
    public final /* synthetic */ void m40356a9(j760 j760Var) {
        this.f24508z = ((Boolean) j760Var.f116564a).booleanValue();
        long jLongValue = CoreModule.f17545c.f19639e0.f149506x6.get().longValue();
        int iM194766i3 = upa.m194766i3();
        if (((Boolean) j760Var.f116565b).booleanValue() || (jLongValue > 1 && iM194766i3 > 0 && mqi0.m155944o() - jLongValue > ((long) iM194766i3) * 86400000)) {
            this.f24508z = false;
        }
        m40449x9();
    }

    /* JADX INFO: renamed from: b6 */
    public final void m40357b6(FragmentManager fragmentManager, TabName tabName) {
        if (y1j.m212196d().m212203e()) {
            return;
        }
        boolean z = false;
        for (TabName tabName2 : TabName.values()) {
            if (tabName != tabName2 && fragmentManager.m2557i0(tabName2.toString()) == null) {
                y1j.m212196d().m212201b(act(), tabName2, new a130(this));
                z = true;
            }
        }
        if (z) {
            y1j.m212196d().m212202c(act());
        }
    }

    /* JADX INFO: renamed from: b7 */
    public final void m40358b7() {
        if (IntlCountryCodeController.m28115k() || CoreModule.f17545c.f19639e0.f149202J6.get().booleanValue()) {
            return;
        }
        duringCreated(CoreModule.f17545c.f19642f0.m33062np(MessageType.get(MessageType.local_intl_prompt_message_type))).subscribe(mkd0.m154955G(new e30() { // from class: l.o230
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19639e0.f149202J6.put(Boolean.TRUE);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b8 */
    public final /* synthetic */ void m40359b8(j760 j760Var) {
        e010.m114155c(act(), (TabName) j760Var.f116564a);
    }

    /* JADX INFO: renamed from: b9 */
    public final /* synthetic */ void m40360b9(Bundle bundle) {
        m40297M7();
        m40369e6();
        m40348Z5();
        m40353a6();
        m40382h6();
        m40365d6();
    }

    /* JADX INFO: renamed from: c6 */
    public final void m40361c6() {
        if (upa.m194614B2()) {
            CoreModule.f17545c.f19580K1.f20006U.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: c7 */
    public final void m40362c7() {
        if (!CoreModule.f17557o.m195055b().mo33649wf() || CoreModule.m29932K().me_().isFemale()) {
            return;
        }
        duringCreated(this.f24501s.distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.b930
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40046F1((TabName) obj);
            }
        }));
        duringCreated((C22306c) this.f24501s.distinctUntilChanged().filter(new w9j() { // from class: l.c930
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((TabName) obj) == TabName.Msg);
            }
        }).flatMap(new w9j() { // from class: l.e930
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19555C0.m210112u4();
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.f930
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationsList.m41328A2();
            }
        }, new e30() { // from class: l.g930
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40198n5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c8 */
    public final /* synthetic */ void m40363c8(TabName tabName) {
        ((NewMainViewModel) this.viewModel).m39971I0();
        ((NewMainViewModel) this.viewModel).m40012n0();
        boolean zEquals = TabName.Card.equals(tabName);
        V v2 = this.viewModel;
        if (zEquals) {
            xdl0.m208357U(((NewMainViewModel) v2).f24465e, NavigationBarAdmobHelper.INSTANCE.m36150k());
        } else {
            xdl0.m208357U(((NewMainViewModel) v2).f24465e, v930.f180607f + NavigationBarAdmobHelper.INSTANCE.m36150k());
        }
    }

    /* JADX INFO: renamed from: c9 */
    public final /* synthetic */ void m40364c9(TtcMigrateDisplayData ttcMigrateDisplayData) {
        if (ttcMigrateDisplayData.open) {
            TtcAccountMigrateDisplayAct.INSTANCE.m43689a(act(), ttcMigrateDisplayData);
        }
    }

    /* JADX INFO: renamed from: d6 */
    public final void m40365d6() {
        if (this.f195260f || this.f195261g) {
            SurveySparrowHelper.INSTANCE.m29690l();
        }
    }

    /* JADX INFO: renamed from: d7 */
    public final void m40366d7() {
        if (bcp.INSTANCE.m101110n()) {
            act().duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).filter(new w9j() { // from class: l.n930
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    User user = (User) obj;
                    return Boolean.valueOf((user == null || vwb.m200296J(user.status)) ? false : true);
                }
            }).take(2).subscribe(mkd0.m154956H(new e30() { // from class: l.b130
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f72486a.m40428s8((User) obj);
                }
            }, new e30() { // from class: l.c130
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40129W3((Throwable) obj);
                }
            }));
            act().duringCreated((C22306c) puk0.m171431e().m171432b(), false).filter(new w9j() { // from class: l.d130
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    VerificationNetworkData verificationNetworkData = (VerificationNetworkData) obj;
                    return Boolean.valueOf((verificationNetworkData == null || verificationNetworkData.meta == null || verificationNetworkData.data == null) ? false : true);
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.e130
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f88704a.m40432t8((VerificationNetworkData) obj);
                }
            }, new e30() { // from class: l.f130
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40054H1((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: d8 */
    public final /* synthetic */ void m40367d8(AbstractC0865a abstractC0865a) {
        aqo.m98316h(act(), abstractC0865a).mo123062a().doOnNext(new e30() { // from class: l.b530
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.c530
            @Override // p149l.e30
            public final void call(Object obj) {
                PaymentApi.PaymentResultStatus.succeed;
            }
        }, new e30() { // from class: l.d530
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40242y4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d9 */
    public final void m40368d9() {
        if (NullChecker.m81303a(CoreModule.f17545c.f19642f0)) {
            if (CoreModule.f17545c.f19642f0.f19859G0.get().booleanValue()) {
                CoreModule.f17545c.f19642f0.m32926cp();
            }
            CoreModule.f17545c.f19642f0.m32937dp(new Runnable() { // from class: l.y730
                @Override // java.lang.Runnable
                public final void run() {
                    C8096a.m40159e2();
                }
            });
            duringCreated(CoreModule.f17545c.f19642f0.f19897S1).subscribe(mkd0.m154955G(new e30() { // from class: l.z730
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f201986a.m40351Z8((User) obj);
                }
            }));
            CoreModule.f17545c.f19642f0.m33010jp();
        }
    }

    /* JADX INFO: renamed from: e6 */
    public final void m40369e6() {
        if (this.f195260f || this.f195261g) {
            m40333V9(false);
        }
    }

    /* JADX INFO: renamed from: e7 */
    public final void m40370e7() {
        CoreModule.f17545c.f19687u0.m30456m5();
        CoreModule.f17545c.f19690v0.m105764n3();
        CoreModule.f17545c.f19690v0.m105763m3();
        duringCreated(lifecycle().distinctUntilChanged().filter(new w9j() { // from class: l.k330
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.l330
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40137Y3((C4319c) obj);
            }
        }));
        duringCreated(mkd0.m154985s(CoreModule.f17545c.f19690v0.m105767q3(), CoreModule.f17545c.f19690v0.m105766p3(), CoreModule.f17545c.f19555C0.m210114x3(), new y9j() { // from class: l.m330
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return new xaj0((Optional) obj, (Optional) obj2, (List) obj3);
            }
        }).map(new w9j() { // from class: l.n330
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f136908a.m40418q6((xaj0) obj);
            }
        }).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.p330
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146958a.m40436u8((j760) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19667n1.m34265A3()).subscribe(mkd0.m154956H(new e30() { // from class: l.q330
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152369a.m40444w8((IntlTribeBubble) obj);
            }
        }, new e30() { // from class: l.r330
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40140Z2((Throwable) obj);
            }
        }));
        if (ir9.m137825e()) {
            duringCreated(CoreModule.f17545c.f19667n1.m34274y3()).subscribe(mkd0.m154956H(new e30() { // from class: l.s330
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40117U2((IntlTribeBubble) obj);
                }
            }, new e30() { // from class: l.t330
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40233w3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: e8 */
    public final /* synthetic */ void m40371e8(Act act) {
        p09.m166948w().m166959K(act());
    }

    /* JADX INFO: renamed from: e9 */
    public final void m40372e9() {
        if (IntlCountryCodeController.m28115k()) {
            return;
        }
        C8346a.m45563j().m45572o(this.f195255a);
    }

    /* JADX INFO: renamed from: f6 */
    public final void m40373f6() {
        if (upa.m194762i()) {
            CoreModule.f17545c.f19642f0.m32627Ee();
        }
    }

    /* JADX INFO: renamed from: f7 */
    public final void m40374f7() {
        if (h6a.m129470c()) {
            if (!xma.m210087m4() || !xma.m210071e4()) {
                CoreModule.f17545c.f19569G2.m105991s3();
            }
            if (!xma.m210071e4()) {
                duringCreated(CoreModule.f17545c.f19569G2.m105993u3()).subscribe(mkd0.m154955G(new e30() { // from class: l.m430
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f131225a.m40448x8((Envelope) obj);
                    }
                }));
            }
            duringCreated(m40307O9()).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.n430
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40048F3((TabName) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: f8 */
    public final /* synthetic */ void m40375f8(Notification notification) {
        m40319S6();
    }

    /* JADX INFO: renamed from: f9 */
    public final void m40376f9() {
        if (bzc0.m104566f() || !upa.m194795o2() || upa.m194800p2()) {
            return;
        }
        duringCreated(mkd0.m154984r(CoreModule.f17545c.f19639e0.m169523o9().map(new w9j() { // from class: l.m830
            @Override // p149l.w9j
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(!qqi0.m175940h(mqi0.m155944o(), (long) user.createdTime, upa.m194771j3()) && (TextUtils.isEmpty(user.description) || user.pictures.size() < 3));
            }
        }).distinctUntilChanged(), CoreModule.f17545c.f19639e0.f149499w6.obs().distinctUntilChanged(), new trq())).subscribe(mkd0.m154955G(new e30() { // from class: l.n830
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137574a.m40356a9((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g6 */
    public final void m40377g6() {
        CoreModule.f17545c.f19642f0.m32589Bf();
    }

    /* JADX INFO: renamed from: g7 */
    public final void m40378g7() {
        CoreModule.f17545c.f19672p0.m173367o3();
    }

    /* JADX INFO: renamed from: g8 */
    public final /* synthetic */ Boolean m40379g8(CoreInnerPush.C4716a c4716a) {
        return Boolean.valueOf(act().lifecycle_() == C4319c.f15548i || c4716a.f19186l);
    }

    /* JADX INFO: renamed from: g9 */
    public void m40380g9() {
        Fragment fragmentM2557i0 = this.f195255a.fragmentManager().m2557i0(this.f195256b.toString());
        if (fragmentM2557i0 instanceof PutongFrag) {
            ((PutongFrag) fragmentM2557i0).mo29637I4();
        }
        if (fragmentM2557i0 instanceof ConversationsTabFrag) {
            o6j0.m162859c("e_messages", OMSDialogPositon.p_messages_view, o6j0.C18854a.m162878h("click_change", "click"));
        }
    }

    @Override // p149l.y030
    /* JADX INFO: renamed from: h1 */
    public void mo40381h1() {
        this.f195266l = new v(this);
    }

    /* JADX INFO: renamed from: h6 */
    public final void m40382h6() {
        try {
            w85.INSTANCE.m202144k(CoreModule.f17545c.f19639e0.m169520na().publicId);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: h7 */
    public final void m40383h7() {
        if (u59.m191850u()) {
            if (NullChecker.m81303a(CoreModule.f17545c.f19686t2.f148152R) && CoreModule.f17545c.f19686t2.f148152R.get().booleanValue()) {
                qwp.m176882i().m176889o(act(), "test", "近期多次向他人髮送廣告信息，已被平颱標記爲風險用戶。再有類似行爲，您的帳號將被<span style=\"color: #FE7E1D;\">限製曝光或封禁</span>");
            } else {
                duringCreated((C22306c) v930.m197537k().take(1).flatMap(new w9j() { // from class: l.d830
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C8096a.m40073L1((TabName) obj);
                    }
                })).subscribe(mkd0.m154956H(new e30() { // from class: l.e830
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f89787a.m40452y8((RiskSelfData) obj);
                    }
                }, new e30() { // from class: l.f830
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        C8096a.m40201o4((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: h8 */
    public final /* synthetic */ C22306c m40384h8(final CoreInnerPush.C4716a c4716a) {
        return c4716a.f19186l ? act().lifecycle().filter(new w9j() { // from class: l.r430
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).first().map(new w9j() { // from class: l.s430
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C8096a.m40035C4(c4716a, (C4319c) obj);
            }
        }) : C22306c.just(c4716a);
    }

    /* JADX INFO: renamed from: h9 */
    public boolean m40385h9(final String str) {
        final Frag frag = (Frag) this.f195255a.fragmentManager().m2557i0(this.f195256b.toString());
        lifecycle().filter(new w9j() { // from class: l.l130
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.w130
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40224u3(frag, str, (C4319c) obj);
            }
        }));
        return CoreModule.m29934N().isPhotoAlbumFrag(frag);
    }

    /* JADX INFO: renamed from: i6 */
    public final Fragment m40386i6(TabName tabName) {
        switch (m.f24524a[tabName.ordinal()]) {
            case 1:
                return HomeLayoutFrag.m38512C5();
            case 2:
                return ConversationsTabFrag.m41575B5(this.f24504v);
            case 3:
                if (((NewMainViewModel) this.viewModel).f24456E.m39642J(TabName.Live)) {
                    return CoreModule.m29936Q().buildLiveSquareFrag();
                }
                return null;
            case 4:
            default:
                return null;
            case 5:
                return new ProfileFrag();
            case 6:
                return u9w.INSTANCE.m192678k();
            case 7:
                if (upa.m194686Q1()) {
                    return b1c.m99819h(m142773Y(), "bottom_navigation_bar");
                }
                return null;
            case 8:
                o6j0.m162864h("e_intl_navbar_meet_view", OMSDialogPositon.p_navigation_view, new o6j0.C18854a[0]);
                return new IntlTribeMeetFrag();
        }
    }

    /* JADX INFO: renamed from: i7 */
    public final void m40387i7() {
        if (ogl0.m164245X()) {
            CoreModule.f17545c.f19642f0.m32638Ep(true);
            duringCreated(CoreModule.f17545c.f19642f0.m32840Vm()).observeOn(Schedulers.m221493io()).take(1).map(new w9j() { // from class: l.d430
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return C8096a.m40070K3((List) obj);
                }
            }).subscribe();
        } else if (CoreModule.f17545c.f19642f0.m32724Lp()) {
            CoreModule.f17545c.f19642f0.m33102qq(-1.0d);
            CoreModule.f17545c.f19642f0.m32638Ep(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i8 */
    public final /* synthetic */ void m40388i8(TabName tabName, View view, CoreInnerPush.C4716a c4716a) {
        if (view instanceof qsm) {
            ((qsm) view).mo39229a(act(), c4716a, tabName, m40410o6());
        }
    }

    /* JADX INFO: renamed from: i9 */
    public void m40389i9(Bundle bundle) {
        TabName tabNameTransform = TabName.transform(bundle.getString("saved_fragment_name"));
        if (NullChecker.m81303a(tabNameTransform)) {
            this.f195256b = tabNameTransform;
        }
        if (bundle.containsKey("msg_tab_index")) {
            this.f24504v = bundle.getInt("msg_tab_index", 0);
        }
    }

    /* JADX INFO: renamed from: j6 */
    public final void m40390j6() {
        act().duringCreated(CoreModule.f17545c.f19642f0.m33008jn(false).take(1)).subscribe(mkd0.m154955G(new e30() { // from class: l.u330
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40107S2((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j7 */
    public final void m40391j7() {
        if (u59.m191823d0()) {
            if (!u9w.INSTANCE.m192675h() && !u59.m191796E()) {
                creates(new e30() { // from class: l.o130
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f141402a.m40251A8((Bundle) obj);
                    }
                });
            }
            final LoveBuzzNotifyUserPop loveBuzzNotifyUserPop = new LoveBuzzNotifyUserPop(act());
            act().duringCreated((C22306c) j8w.INSTANCE.m140473a().m140472z0(), false).subscribe(mkd0.m154956H(new e30() { // from class: l.p130
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f146642a.m40255B8(loveBuzzNotifyUserPop, (j760) obj);
                }
            }, new e30() { // from class: l.q130
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40180j3((Throwable) obj);
                }
            }));
            act().duringCreated(v930.m197537k()).distinctUntilChanged().skip(1).subscribe(mkd0.m154956H(new e30() { // from class: l.r130
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f157228a.m40259C8(loveBuzzNotifyUserPop, (TabName) obj);
                }
            }, new e30() { // from class: l.s130
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40141Z3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: j8 */
    public final /* synthetic */ void m40392j8(CoreInnerPush.C4716a c4716a) {
        int i2;
        final TabName tabNameM212083b1 = m212083b1();
        if (vwb.m200296J(c4716a.f19183i) || c4716a.f19183i.contains(tabNameM212083b1)) {
            hd2 hd2Var = new hd2(act());
            ViewGroup viewGroup = (ViewGroup) act().getWindow().getDecorView();
            int i3 = f6c0.f95961q7;
            if (c4716a.f19184j == CoreInnerPush.InnerPushLayoutType.COUNTDOWN_CONV_CREATE) {
                i3 = f6c0.f95719c2;
                i2 = 0;
            } else {
                i2 = -1;
            }
            hd2 hd2VarM130559u = hd2Var.m130557s(i3, true).m130564z(viewGroup).m130562x(xdl0.m208331F0()).m130559u(200L);
            long j2 = c4716a.f19185k;
            if (j2 <= 0) {
                j2 = 3000;
            }
            hd2VarM130559u.m130555q(j2).m130554p(new j()).m130563y(c4716a, new hd2.InterfaceC17284b() { // from class: l.e630
                @Override // p149l.hd2.InterfaceC17284b
                /* JADX INFO: renamed from: a */
                public final void mo97843a(View view, Object obj) {
                    this.f89489a.m40388i8(tabNameM212083b1, view, (CoreInnerPush.C4716a) obj);
                }
            });
            if (i2 >= 0) {
                hd2Var.m130560v(i2).m130561w(i2);
            }
            if (TextUtils.isEmpty(c4716a.f19181g)) {
                nd2.m158964j().m158980s(hd2Var);
            } else {
                nd2.m158964j().m158981t(hd2Var, c4716a.f19181g);
            }
        }
    }

    /* JADX INFO: renamed from: j9 */
    public void m40393j9() {
        int i2 = 0;
        CoreModule.f17545c.f19663m0.f19444q2[0] = 1;
        this.f24505w = false;
        if (CoreModule.m29934N().mo60259Ah()) {
            this.f195256b = CoreModule.m29934N().mo60347dr();
        }
        if (!this.f24507y) {
            CoreModule.f17545c.f19639e0.f149253R.get();
            if (!TabName.Card.equals(this.f195256b)) {
                if (TabName.Moment.equals(this.f195256b)) {
                    i2 = 1;
                } else {
                    i2 = TabName.Live.equals(this.f195256b) ? 3 : 2;
                }
            }
            zvf0.m220371D("e_apprenew_expose", "p_suggest_users_home_view", vwb.m200311Y("cold_boot_toaddrtype", Integer.valueOf(i2)));
            this.f24507y = true;
        }
        if (CoreModule.f17545c.f19632b2.m212961f3()) {
            this.f195256b = CoreModule.f17545c.f19632b2.m212959d3(CoreModule.f17545c.f19632b2.f196389R.get());
        }
        m40339X5(this.f195256b);
    }

    /* JADX INFO: renamed from: k6 */
    public final void m40394k6() {
        if (CoreModule.m29934N().mo60374n7()) {
            return;
        }
        CoreModule.f17545c.f19679r1.m176776c3().subscribe(mkd0.m154956H(new e30() { // from class: l.b630
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40186k5((Boolean) obj);
            }
        }, new e30() { // from class: l.c630
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40050F5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k7 */
    public final void m40395k7() {
        if (upa.m194715X2()) {
            duringCreated(CoreModule.f17545c.f19639e0.f149385h4).subscribe(mkd0.m154956H(new s(), new e30() { // from class: l.r730
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40089O5((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k8 */
    public final /* synthetic */ void m40396k8(Boolean bool) {
        if (CoreModule.f17545c.f19696x0.m30179I3() != null) {
            m40449x9();
            if (CoreModule.f17545c.f19696x0.m30190T3()) {
                m40441v9();
            }
        }
        ((NewMainViewModel) this.viewModel).m40012n0();
    }

    /* JADX INFO: renamed from: k9 */
    public void m40397k9(Bundle bundle) {
        bundle.putString("saved_fragment_name", this.f195256b.toString());
        Fragment fragmentM2557i0 = this.f195255a.fragmentManager().m2557i0(TabName.Msg.toString());
        if (fragmentM2557i0 instanceof ConversationsTabFrag) {
            int iM41634c0 = ((ConversationsTabFrag) fragmentM2557i0).m41634c0();
            this.f24504v = iM41634c0;
            bundle.putInt("msg_tab_index", iM41634c0);
        }
    }

    /* JADX INFO: renamed from: l6 */
    public final void m40398l6() {
        if (ura.m195053e().m195057d().mo33745R8()) {
            act().duringCreated(CoreModule.f17545c.f19642f0.m32904bf().take(1)).subscribe(mkd0.m154955G(new e30() { // from class: l.d330
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40225u4((q860) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l7 */
    public final void m40399l7() {
        yni.m215417f(LaunchStep.BigEmoji);
        if (!CoreModule.f17545c.f19639e0.f149225N1.get().booleanValue()) {
            CoreModule.f17545c.f19639e0.f149225N1.put(Boolean.TRUE);
            ArrayList arrayList = new ArrayList();
            arrayList.add("https://auto.tancdn.com/v1/raw/bd957249-2f80-4f31-adcd-a3eefc6afbad12.svga");
            SVGALoader.with(act()).batchDownload(arrayList);
        }
        kye.f125284i.clear();
        kye.f125283h.clear();
        for (kye.C18115a c18115a : kye.f125279d) {
            String string = act().getString(c18115a.f125287b);
            kye.f125284i.add(string);
            kye.f125283h.put(string, Integer.valueOf(c18115a.f125289d));
        }
        if (!NullChecker.m81303a(pxe.m171835c().m171839b())) {
            EmojiAnimData emojiAnimDataNew_ = EmojiAnimData.new_();
            emojiAnimDataNew_.emojiAnimCreatedTime = new HashMap();
            pxe.m171835c().m171844j(emojiAnimDataNew_);
        }
        yni.m215415d(LaunchStep.BigEmoji);
    }

    /* JADX INFO: renamed from: l8 */
    public final /* synthetic */ void m40400l8(Long l2) {
        m40449x9();
        if (!CoreModule.f17545c.f19696x0.m30190T3()) {
            m40439v6();
        }
        ((NewMainViewModel) this.viewModel).m40012n0();
    }

    /* JADX INFO: renamed from: l9 */
    public void m40401l9() {
        Fragment fragmentM2557i0 = this.f195255a.fragmentManager().m2557i0(this.f195256b.toString());
        if (fragmentM2557i0 instanceof PutongFrag) {
            ((PutongFrag) fragmentM2557i0).mo29636H4();
        }
        if (fragmentM2557i0 instanceof ConversationsTabFrag) {
            o6j0.m162859c("e_message_double_click", OMSDialogPositon.p_messages_view, new o6j0.C18854a[0]);
        }
    }

    /* JADX INFO: renamed from: m6 */
    public final void m40402m6() {
        if (CoreModule.m29934N().mo60341cd() || !CoreModule.m29934N().mo60353fs()) {
            CoreModule.f17545c.f19676q1.m33272t3().subscribe(mkd0.m154956H(new e30() { // from class: l.k530
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40188l3((Boolean) obj);
                }
            }, new e30() { // from class: l.l530
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40216s3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: m7 */
    public final void m40403m7() {
        if (upa.m194800p2()) {
            duringCreated(this.f24501s).filter(new w9j() { // from class: l.g530
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TabName.Me.equals((TabName) obj));
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.s530
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19639e0.m169371B7();
                }
            }));
            CoreModule.f17545c.f19639e0.m169371B7();
        }
        m40053G6();
    }

    /* JADX INFO: renamed from: m8 */
    public final /* synthetic */ void m40404m8(List list) {
        m40449x9();
    }

    /* JADX INFO: renamed from: m9 */
    public final void m40405m9(Act act, String str, String str2) {
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        act.startActivity(new Intent("android.intent.action.VIEW").setData(builderBuildUpon.appendQueryParameter("serverCode", str2).build()));
    }

    /* JADX INFO: renamed from: n6 */
    public final void m40406n6(TabName tabName, boolean z) {
        TabName tabName2;
        boolean zM2545e0;
        TabName tabName3;
        TabName tabName4;
        Fragment fragmentM40386i6;
        TabName tabName5 = tabName;
        du2.m113670a("[FragmentChange]", "start old: " + this.f195256b + " -> new: " + tabName5);
        TabName tabName6 = TabName.Moment;
        if (tabName6.equals(tabName5) && CoreModule.m29932K().mo30805pe()) {
            return;
        }
        if (upa.m194675N3() && TabName.Card.equals(tabName5) && ExpandedCardStyleHelper.m38090o().m38103s()) {
            return;
        }
        TabName tabName7 = TabName.Live;
        if (tabName5 == tabName7 && !((NewMainViewModel) this.viewModel).f24456E.m39642J(tabName7)) {
            if (upa.m194686Q1()) {
                Act act = act();
                Bundle bundle = new Bundle();
                if (NullChecker.m81303a(act) && NullChecker.m81303a(act.getIntent())) {
                    bundle = act.getIntent().getBundleExtra("extra_new_main_bundle");
                }
                CoreModule.m29936Q().mo67251Z8(act(), bundle);
            }
            tabName5 = TabName.Card;
        }
        TabName tabName8 = this.f195256b;
        FragmentManager fragmentManager = this.f195255a.fragmentManager();
        if (this.f195256b != tabName5) {
            if (e4w.m114719g()) {
                return;
            }
            pcl0 pcl0VarM2557i0 = fragmentManager.m2557i0(tabName6.toString());
            if (pcl0VarM2557i0 instanceof FeedService.InterfaceC11415b) {
                ((FeedService.InterfaceC11415b) pcl0VarM2557i0).mo63744E0();
                e4w.m114718f();
            }
        }
        String strM40426s6 = m40426s6(this.f195256b);
        this.f195256b = tabName5;
        if (CoreModule.m29936Q().mo67230M7()) {
            this.f195256b = tabName7;
            if (z && tabName5 != tabName7) {
                lsi0.m151564B("青少年模式下无法使用", true, true);
            }
        }
        AbstractC13063a abstractC13063a = qib0.f154687E;
        if (abstractC13063a != null) {
            abstractC13063a.m78874z();
        }
        if (CoreModule.m29934N().mo60294M8() && !tabName5.equals(TabName.Card)) {
            NewNewProfileCard.m36787Y1();
        }
        Fragment fragmentM2557i0 = fragmentManager.m2557i0(this.f195256b.toString());
        boolean z2 = false;
        if (lifecycle_() == C4319c.f15549j) {
            tabName2 = tabName5;
            zM2545e0 = false;
            z2 = false;
        } else if (NullChecker.m81303a(fragmentM2557i0) && fragmentM2557i0.getLifecycle().getState() == Lifecycle.State.RESUMED && !fragmentM2557i0.isHidden()) {
            if (y1j.m212197f() && this.f24506x) {
                m40357b6(fragmentManager, this.f195256b);
            }
            tabName2 = tabName5;
            zM2545e0 = true;
        } else {
            if (m.f24524a[this.f195256b.ordinal()] == 3) {
                mcr mcrVar = this.lifecycleProviderImpl;
                if (mcrVar instanceof NewMainAct) {
                    o6j0.m162859c("e_live_entertainment_icon", ((NewMainAct) mcrVar).m39799Y5().f116564a, new o6j0.C18854a[0]);
                }
            }
            AbstractC0427k abstractC0427kM2567m = fragmentManager.m2567m();
            TabName[] tabNameArrValues = TabName.values();
            int length = tabNameArrValues.length;
            int i2 = 0;
            boolean z3 = false;
            while (i2 < length) {
                TabName tabName9 = tabNameArrValues[i2];
                String string = tabName9.toString();
                Fragment fragmentM2557i1 = fragmentManager.m2557i0(string);
                if (fragmentM2557i1 != null) {
                    tabName4 = tabName5;
                    fragmentM40386i6 = fragmentM2557i1;
                } else if (!y1j.m212197f() || this.f195261g || this.f195260f) {
                    tabName4 = tabName5;
                    fragmentM40386i6 = m40386i6(tabName9);
                    if (NullChecker.m81303a(fragmentM40386i6)) {
                        if (this.f195256b.equals(tabName9)) {
                            m40413o9(fragmentM40386i6, false);
                        }
                        abstractC0427kM2567m.m2804c(u4c0.f174563y4, fragmentM40386i6, string);
                    }
                } else if (this.f195256b.equals(tabName9)) {
                    tabName4 = tabName5;
                    boolean zM212205k = y1j.m212196d().m212205k(this.f195256b);
                    Fragment fragmentM40386i7 = m40386i6(tabName9);
                    if (NullChecker.m81303a(fragmentM40386i7)) {
                        m40413o9(fragmentM40386i7, zM212205k);
                        abstractC0427kM2567m.m2804c(u4c0.f174563y4, fragmentM40386i7, string);
                    }
                    fragmentM40386i6 = fragmentM40386i7;
                } else {
                    tabName4 = tabName5;
                    y1j.m212196d().m212201b(act(), tabName9, new a130(this));
                    fragmentM40386i6 = fragmentM2557i1;
                    z3 = true;
                }
                if (NullChecker.m81303a(fragmentM40386i6)) {
                    if (this.f195256b.equals(tabName9)) {
                        abstractC0427kM2567m.mo2716w(fragmentM40386i6, Lifecycle.State.RESUMED);
                        abstractC0427kM2567m.mo2717y(fragmentM40386i6);
                    } else if (!fragmentM40386i6.isHidden()) {
                        abstractC0427kM2567m.mo2713p(fragmentM40386i6);
                    }
                }
                i2++;
                fragmentM2557i0 = fragmentM40386i6;
                tabName5 = tabName4;
            }
            tabName2 = tabName5;
            if (y1j.m212197f() && z3) {
                y1j.m212196d().m212202c(act());
            }
            abstractC0427kM2567m.mo2708j();
            zM2545e0 = fragmentManager.m2545e0();
            z2 = true;
        }
        if (zM2545e0) {
            if (z) {
                m40329U9(strM40426s6, z2);
            }
            TabName tabName10 = this.f195256b;
            TabName tabName11 = TabName.Msg;
            boolean zEquals = tabName10.equals(tabName11);
            V v2 = this.viewModel;
            if (zEquals) {
                ((NewMainViewModel) v2).m40019u0(true);
                if (z && !CoreModule.f17545c.f19663m0.m31032O6()) {
                    User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
                    if (NullChecker.m81303a(userM169527p9) && userM169527p9.isNewUserIn24H() && n3b0.m157742q()) {
                        CoreModule.f17545c.f19687u0.m30419V6(null, 0L, 1, "");
                    }
                    CoreModule.f17545c.f19687u0.f19254k0.get().getClass();
                    CoreModule.f17545c.f19687u0.m30433c7(CoreLikers.LikersTriggerBy.home_tab_msg);
                    CoreModule.f17545c.f19658k1.m184462A3();
                    m40343X9();
                }
                if (vy8.m200615m() || vy8.m200616n()) {
                    ke7.m145732o().m145750z();
                }
            } else {
                ((NewMainViewModel) v2).m40019u0(false);
            }
            v930.m197540n(this.f195256b);
            TabName tabName12 = this.f195256b;
            TabName tabName13 = TabName.Card;
            if (tabName12.equals(tabName13)) {
                gt00.m127870c().m127871d(Active.TYPE);
                v930.m197539m(tabName13, z);
            }
            if (this.f195256b.equals(TabName.Me)) {
                if (z) {
                    CoreModule.f17545c.f19570H0.m210361k5();
                }
                if (CoreModule.f17545c.f19696x0.m30178H4()) {
                    IapAffiliatePromotion iapAffiliatePromotionM30179I3 = CoreModule.f17545c.f19696x0.m30179I3();
                    if (iapAffiliatePromotionM30179I3 != null) {
                        CoreModule.f17545c.f19696x0.f19197Y.put(Long.valueOf(iapAffiliatePromotionM30179I3.promotionHitId));
                    }
                    m40449x9();
                }
                if (upa.m194669M2()) {
                    ((NewMainViewModel) this.viewModel).m39984P();
                }
                if (z && !CoreModule.f17545c.f19663m0.m31032O6()) {
                    CoreModule.f17545c.f19687u0.m30425Y6();
                    m40343X9();
                }
            }
            if (z && CoreModule.f17545c.f19549A0.m113989b3() && CoreModule.f17545c.f19549A0.m113990c3()) {
                CoreModule.f17545c.f19549A0.m113991d3();
            }
            TabName tabName14 = this.f195256b;
            TabName tabName15 = TabName.Moment;
            if (tabName14.equals(tabName15) && na30.m158578a()) {
                hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149302X0;
                Boolean bool = Boolean.TRUE;
                hpd0Var.put(bool);
                CoreModule.f17545c.f19639e0.m169456X7().m132487l(bool);
            }
            if (lac0.m149136m() && tabName8 != (tabName3 = this.f195256b) && tabName3.equals(tabName13)) {
                CoreModule.f17545c.f19635c2.m99150y3();
                lac0.m149134i().m149143o();
            }
            ((NewMainViewModel) this.viewModel).m39964E0(this.f195256b, z);
            if (this.f24505w && CoreModule.m29934N().isPhotoAlbumFrag(fragmentM2557i0) && z) {
                v930.m197539m(tabName15, true);
            }
            Act act2 = act();
            if (NullChecker.m81303a(act2) && NullChecker.m81303a(act2.getIntent())) {
                Bundle bundleExtra = act2.getIntent().getBundleExtra("extra_new_main_bundle");
                if (NullChecker.m81303a(bundleExtra)) {
                    v930.m197538l(this.f195256b, bundleExtra);
                    act2.getIntent().removeExtra("extra_new_main_bundle");
                }
            }
            TabName tabName16 = TabName.Live;
            if (tabName16.equals(this.f195256b) && z) {
                v930.m197539m(tabName16, CoreModule.m29936Q().isLiveSquareHome(this.f24503u));
            }
            if (this.f24503u != fragmentManager.m2557i0(this.f195256b.toString())) {
                if (this.f24503u == null && !tabName13.equals(this.f195256b)) {
                    yni.m215425n(this.f195256b);
                }
                m40314Q9(true);
                this.f24503u = (PutongFrag) fragmentManager.m2557i0(this.f195256b.toString());
                m40326T9(true);
                m40322S9(z);
                if (this.f195256b.equals(tabName11)) {
                    CoreModule.f17545c.f19579K0.m176989x3().m132487l(Optional.m15413of(roj0.f160388a));
                    m40417p9();
                }
            }
            this.f24501s.m132487l(this.f195256b);
            m40372e9();
            fragmentManager.m2557i0(tabName15.toString());
            sp8.m185329a(this.f195256b);
            if (this.f195256b.equals(tabName13) && TEnum.equals(this.f195265k, "cards") && g6a.m124562k() && xma.m210039B3()) {
                gei.m125801u().get().m125814t();
            }
            if (this.f195256b.equals(tabName13)) {
                pcl0 pcl0VarM2557i1 = fragmentManager.m2557i0(tabName13.toString());
                if (pcl0VarM2557i1 instanceof psl) {
                    psl pslVar = (psl) pcl0VarM2557i1;
                    if (TEnum.equals(this.f195265k, "cards")) {
                        pslVar.mo38540C1(NewTanFragTag.HOME, null);
                        this.f195265k = null;
                    } else if (TEnum.equals(this.f195265k, NavigationCardIntent.moment_theme_card)) {
                        if (upa.m194647I0().enabled || e900.m115330b().m115334f()) {
                            NewTanFragTag newTanFragTag = NewTanFragTag.MOMENT_THEME_CARD;
                            pslVar.mo38564f1(newTanFragTag);
                            pslVar.mo38540C1(newTanFragTag, null);
                            this.f195265k = null;
                        }
                    } else if (TEnum.equals(this.f195265k, NavigationCardIntent.play_together)) {
                        NewTanFragTag newTanFragTag2 = NewTanFragTag.PLAY_TOGETHER;
                        pslVar.mo38564f1(newTanFragTag2);
                        pslVar.mo38540C1(newTanFragTag2, null);
                        this.f195265k = null;
                    } else if (TEnum.equals(this.f195265k, NavigationCardIntent.boosting)) {
                        m73.m153331k(act2);
                        this.f195265k = null;
                    } else if (TEnum.equals(this.f195265k, NavigationCardIntent.supreme_sartner)) {
                        this.f195265k = null;
                    } else if (TEnum.equals(this.f195265k, NavigationCardIntent.odiamond_private_custom)) {
                        if (CoreModule.f17545c.f19701y2.m155330E3()) {
                            NewTanFragTag newTanFragTag3 = NewTanFragTag.PRIVATE_CUSTOM;
                            pslVar.mo38564f1(newTanFragTag3);
                            pslVar.mo38540C1(newTanFragTag3, null);
                            this.f195265k = null;
                            if (NullChecker.m81303a(this.f195263i) && this.f195263i.size() > 0 && this.f195263i.containsKey("navigation_to")) {
                                CoreModule.m29935P().m94654e().mo34975W6(pslVar.mo38560Y(), this.f195263i.get("navigation_to"));
                                this.f195263i.remove("navigation_to");
                            }
                        } else {
                            this.f195265k = null;
                        }
                    }
                }
            }
            if (CoreModule.f17545c.f19639e0.m169468a8()) {
                p09.m166948w().m166962v(this.f195256b);
            }
            if ((this.f195256b.equals(tabName11) || this.f195256b.equals(tabName15)) && z && CoreModule.f17545c.f19639e0.m169464Z7() && !qqi0.m175940h(mqi0.m155944o(), (long) CoreModule.f17545c.f19639e0.m169527p9().createdTime, 5)) {
                wm20.m203975o(act2, wm20.m203971k(act2), this.f195256b.equals(tabName11) ? "message_list_page" : "explore_page");
            }
            if (this.f195256b.equals(tabName11) && CoreModule.m29934N().mo60353fs() && z) {
                C4743i c4743i = CoreModule.f17545c.f19676q1;
                C4743i.f20009S.m132487l(roj0.f160388a);
            }
            if (upa.m194762i()) {
                CoreModule.f17545c.f19642f0.m32627Ee();
            }
        }
        this.f24505w = true;
        CoreModule.m29934N().mo60333Yb(act(), tabName2.toString(), z);
        CoreModule.f17545c.f19632b2.m212963h3(tabName2.toString());
        if (CoreModule.m29934N().mo60364ke()) {
            TabName tabName17 = this.f195256b;
            TabName tabName18 = TabName.Card;
            if (tabName17.equals(tabName18)) {
                CoreModule.m29932K().setTabDot(act(), tabName18, false);
            }
        }
        du2.m113670a("[FragmentChange]", "finish : " + this.f195256b);
    }

    /* JADX INFO: renamed from: n7 */
    public final void m40407n7() {
        if (ogl0.m164233L()) {
            duringCreated(CoreModule.f17545c.f19665m2.m191467H3()).subscribe(mkd0.m154956H(new e30() { // from class: l.v730
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f180296a.m40263D8((Integer) obj);
                }
            }, new e30() { // from class: l.x730
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40056H3((Throwable) obj);
                }
            }));
            CoreModule.f17545c.f19665m2.m191465F3();
        }
    }

    /* JADX INFO: renamed from: n8 */
    public final /* synthetic */ void m40408n8(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            y59 y59Var = CoreModule.f17545c.f19632b2;
            if (y59Var.f196390S) {
                m40339X5(y59Var.m212959d3(str2));
            }
        }
    }

    /* JADX INFO: renamed from: n9 */
    public final void m40409n9(Act act, String str, String str2) {
        act.startActivity(lva.m151840A(act, "", Uri.parse(str).buildUpon().appendQueryParameter("serverCode", str2).build().toString(), true, false, false));
    }

    /* JADX INFO: renamed from: o6 */
    public PutongFrag m40410o6() {
        return this.f24503u;
    }

    /* JADX INFO: renamed from: o7 */
    public final void m40411o7() {
        if (wc40.m202629f()) {
            creates(new e30() { // from class: l.i130
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40042E2((Bundle) obj);
                }
            }, new d30() { // from class: l.j130
                @Override // p149l.d30
                public final void call() {
                    this.f115735a.m40267E8();
                }
            });
            if (wc40.m202629f()) {
                creates(new e30() { // from class: l.k130
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        CoreModule.m29934N().initCameraSdk(null);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: o8 */
    public final /* synthetic */ void m40412o8(Integer num) {
        int i2 = v930.f180607f;
        if (upa.m194675N3() && TabName.Card.equals(v930.m197534h())) {
            i2 = 0;
        }
        ((NewMainViewModel) this.viewModel).m39975K0(Integer.valueOf(i2 + num.intValue()));
        ((NewMainViewModel) this.viewModel).m39962D0(num.intValue());
    }

    /* JADX INFO: renamed from: o9 */
    public final void m40413o9(final Fragment fragment, boolean z) {
        if (fragment instanceof NewMainContextFrag) {
            NewMainContextFrag newMainContextFrag = (NewMainContextFrag) fragment;
            newMainContextFrag.m39935R4();
            newMainContextFrag.m39934Q4();
        } else if (z && (fragment instanceof Frag)) {
            ((Frag) fragment).creates(new e30() { // from class: l.i230
                @Override // p149l.e30
                public final void call(Object obj) {
                    fragment.onHiddenChanged(false);
                }
            });
        }
    }

    /* JADX INFO: renamed from: p6 */
    public void m40414p6() {
        act().duringCreated((C22306c) CoreModule.f17545c.f19639e0.f149255R1.filter(new w9j() { // from class: l.h930
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(u59.m191840m());
            }
        }).flatMap(new w9j() { // from class: l.i930
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19568G1.m165033h3();
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.j930
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116841a.m40305O7((j760) obj);
            }
        }, new z60()));
    }

    /* JADX INFO: renamed from: p7 */
    public final void m40415p7() {
        if (upa.m194758h0().enable) {
            duringCreated(this.f24501s.distinctUntilChanged().filter(new w9j() { // from class: l.k430
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Card);
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.v430
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19639e0.f149169F0.m132487l(roj0.f160388a);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: p8 */
    public final /* synthetic */ void m40416p8(List list) {
        ((NewMainViewModel) this.viewModel).f24468h.m30004M();
    }

    /* JADX INFO: renamed from: p9 */
    public final void m40417p9() {
        if (upa.m194726a2()) {
            CoreModule.f17545c.f19642f0.m32972go();
        }
    }

    /* JADX INFO: renamed from: q6 */
    public final j760<Integer, Integer> m40418q6(xaj0<Optional<q860<User>>, Optional<q860<User>>, List<UserPrivilege>> xaj0Var) {
        int i2;
        if (xma.m210081j4()) {
            i2 = !xma.m210071e4() ? x2c0.f190378n : x2c0.f190346m;
        } else {
            i2 = x2c0.f190410o;
        }
        Optional<q860<User>> optional = xaj0Var.f191751a;
        Optional<q860<User>> optional2 = xaj0Var.f191752b;
        if (!optional.isPresent() || !optional2.isPresent()) {
            return j760.m140076a(-1, Integer.valueOf(i2));
        }
        q860<User> q860Var = optional.get();
        int size = !vwb.m200296J(q860Var.f153135a) ? q860Var.f153135a.size() : 0;
        q860<User> q860Var2 = optional2.get();
        return j760.m140076a(Integer.valueOf(size + (vwb.m200296J(q860Var2.f153135a) ? 0 : q860Var2.f153136b.total)), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: q7 */
    public final void m40419q7() {
        if (xe40.m208509f().m208512h()) {
            if (!upa.m194806q3() || CoreModule.m29932K().me_().isFemale()) {
                CoreModule.f17545c.f19678r0.m34132m5();
            } else {
                duringCreated(new v9j() { // from class: l.o830
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return CoreModule.f17545c.f19614V1.m109899i3(9);
                    }
                }).subscribe(mkd0.m154956H(new e30() { // from class: l.p830
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        C8096a.m40098Q4((List) obj);
                    }
                }, new e30() { // from class: l.q830
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        C8096a.m40223u2((Throwable) obj);
                    }
                }));
            }
            if (!upa.m194811r3() || CoreModule.m29932K().me_().isFemale()) {
                return;
            }
            CoreModule.f17545c.f19614V1.m109899i3(50);
            duringCreated(this.f24501s.distinctUntilChanged()).subscribe(mkd0.m154956H(new e30() { // from class: l.r830
                @Override // p149l.e30
                public final void call(Object obj) {
                    xe40.m208509f().m208510e();
                }
            }, new e30() { // from class: l.t830
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40176i3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q8 */
    public final /* synthetic */ void m40420q8(User user) {
        ((NewMainViewModel) this.viewModel).f24468h.m30004M();
    }

    /* JADX INFO: renamed from: q9 */
    public final void m40421q9() {
        if (this.f24494C.get().booleanValue()) {
            return;
        }
        ouk.m166084j(act());
        this.f24494C.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: r6 */
    public Frag m40422r6(TabName tabName) {
        Fragment fragmentM2557i0 = this.f195255a.fragmentManager().m2557i0(tabName.toString());
        if (fragmentM2557i0 instanceof Frag) {
            return (Frag) fragmentM2557i0;
        }
        return null;
    }

    /* JADX INFO: renamed from: r7 */
    public final void m40423r7() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.g130
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100113a.m40271F8((C4319c) obj);
            }
        }));
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.h130
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105275a.m40274G8((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r8 */
    public final /* synthetic */ void m40424r8(TabName tabName) {
        ((NewMainViewModel) this.viewModel).m40012n0();
    }

    /* JADX INFO: renamed from: r9 */
    public final void m40425r9() {
        ConversationCounterTypeSp.resetAll();
    }

    /* JADX INFO: renamed from: s6 */
    public final String m40426s6(TabName tabName) {
        Fragment fragmentM2557i0 = this.f195255a.fragmentManager().m2557i0(tabName.toString());
        return NullChecker.m81303a(fragmentM2557i0) ? ((PutongFrag) fragmentM2557i0).pageId() : "";
    }

    /* JADX INFO: renamed from: s7 */
    public final void m40427s7() {
        CoreModule.f17545c.f19642f0.m32797Sf();
    }

    /* JADX INFO: renamed from: s8 */
    public final /* synthetic */ void m40428s8(User user) {
        bcp.INSTANCE.m101108l(act());
    }

    /* JADX INFO: renamed from: s9 */
    public final void m40429s9() {
        pcl0 pcl0VarM2557i0 = this.f195255a.fragmentManager().m2557i0(TabName.Card.toString());
        if (pcl0VarM2557i0 instanceof psl) {
            Frag fragMo38560Y = ((psl) pcl0VarM2557i0).mo38560Y();
            if (fragMo38560Y instanceof NewNewHomeFrag) {
                ((NewNewHomeFrag) fragMo38560Y).f21677B.m161133M8();
            }
        }
    }

    /* JADX INFO: renamed from: t6 */
    public View m40430t6(TabName tabName) {
        return ((NewMainViewModel) this.viewModel).m39976L(tabName);
    }

    /* JADX INFO: renamed from: t7 */
    public final void m40431t7() {
        if (g6a.m124577z()) {
            duringCreated(CoreModule.f17545c.f19654j0.m30644y5(ProductCategory.get("youthVip"))).subscribe(mkd0.m154950B());
        }
    }

    /* JADX INFO: renamed from: t8 */
    public final /* synthetic */ void m40432t8(VerificationNetworkData verificationNetworkData) {
        int i2 = verificationNetworkData.meta.code;
        if (i2 == 400314 || i2 == 400312) {
            puk0.m171431e().m171437h(verificationNetworkData.data.groupName);
            if (i2 == 400312) {
                bcp.INSTANCE.m101111o(act(), verificationNetworkData.data.status);
            } else {
                bcp.INSTANCE.m101112p(act(), verificationNetworkData.data.status);
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: t9 */
    public void m40433t9(TabName tabName, boolean z) {
        m40318R9(tabName, z, false);
        if (TabName.Me == tabName) {
            m40449x9();
        } else {
            ((NewMainViewModel) this.viewModel).m40014p0(tabName, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u6 */
    public void m40434u6() {
        Frag frag = (Frag) this.f195255a.fragmentManager().m2557i0(this.f195256b.toString());
        if ((frag instanceof ConversationsTabFrag) && !frag.isHidden() && ((ConversationsTabFrag) frag).m41635c6()) {
            return;
        }
        if ((frag instanceof ProfileFrag) && !frag.isHidden() && ((ProfileFrag) frag).m43206o()) {
            return;
        }
        if ((frag instanceof psl) && !frag.isHidden() && ((psl) frag).mo38566o()) {
            return;
        }
        if ((frag instanceof NewNewHomeFrag) && !frag.isHidden() && ((NewNewHomeFrag) frag).m36756o()) {
            return;
        }
        TabName tabName = this.f195256b;
        TabName tabName2 = TabName.Card;
        if (tabName != tabName2) {
            m40339X5(tabName2);
        } else {
            this.f195255a.moveTaskToBack(true);
        }
    }

    /* JADX INFO: renamed from: u7 */
    public final void m40435u7() {
        e51.m114774y(new Runnable() { // from class: l.f530
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.f630
                    @Override // p149l.d30
                    public final void call() {
                        CoreModule.f17545c.f19642f0.m32628Ef("fake_conversation_profile_featured");
                    }
                });
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u8 */
    public final /* synthetic */ void m40436u8(j760 j760Var) {
        if (((Integer) j760Var.f116564a).intValue() > -1) {
            ((NewMainViewModel) this.viewModel).m40020v0(TabName.Meet, ((Integer) j760Var.f116564a).intValue());
        }
        ((NewMainViewModel) this.viewModel).m40022x0(TabName.Meet, ((Integer) j760Var.f116565b).intValue());
    }

    /* JADX INFO: renamed from: u9 */
    public void m40437u9(boolean z) {
        ((NewMainViewModel) this.viewModel).m40014p0(TabName.FEATURED, z);
    }

    /* JADX INFO: renamed from: v */
    public String m40438v() {
        PutongFrag putongFrag = this.f24503u;
        return putongFrag != null ? putongFrag.pageId() : getClass().getName();
    }

    /* JADX INFO: renamed from: v6 */
    public void m40439v6() {
        ((NewMainViewModel) this.viewModel).m40015q0(false);
    }

    /* JADX INFO: renamed from: v8 */
    public final /* synthetic */ void m40440v8(String str) {
        Runnable runnable = this.f24500r;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: v9 */
    public void m40441v9() {
        ((NewMainViewModel) this.viewModel).m40015q0(true);
    }

    /* JADX INFO: renamed from: w6, reason: merged with bridge method [inline-methods] */
    public final void m40306O8() {
        NavigationBarAdmobHelper.INSTANCE.m36161v();
        e51.m114742G(new Runnable() { // from class: l.j530
            @Override // java.lang.Runnable
            public final void run() {
                this.f116265a.m40313Q7();
            }
        });
    }

    /* JADX INFO: renamed from: w7 */
    public final void m40443w7() {
        if (i36.m134149g().m134159n()) {
            duringCreated(i36.m134149g().m134153h()).subscribe(mkd0.m154955G(new e30() { // from class: l.e430
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19642f0.m32938dq(mqi0.m155944o());
                }
            }));
        }
        if (i36.m134149g().m134158m()) {
            duringCreated(m40307O9()).subscribe(mkd0.m154955G(new e30() { // from class: l.f430
                @Override // p149l.e30
                public final void call(Object obj) {
                    i36.m134149g().m134151e();
                }
            }));
            lifecycle().filter(new w9j() { // from class: l.g430
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.h430
                @Override // p149l.e30
                public final void call(Object obj) {
                    i36.m134149g().m134151e();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: w8 */
    public final /* synthetic */ void m40444w8(IntlTribeBubble intlTribeBubble) {
        int i2;
        if (mqi0.m155944o() - CoreModule.f17545c.f19639e0.f149230N6.get().longValue() <= 43200000 || intlTribeBubble == null || (i2 = intlTribeBubble.tribeCount) <= 0) {
            return;
        }
        ((NewMainViewModel) this.viewModel).m39958A0(i2, new C4345a.c() { // from class: l.t530
            @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.c
            /* JADX INFO: renamed from: a */
            public final void mo20886a(String str) {
                this.f167787a.m40440v8(str);
            }
        });
    }

    /* JADX INFO: renamed from: w9 */
    public void m40445w9(Boolean bool) {
        ((NewMainViewModel) this.viewModel).m40017s0(bool.booleanValue());
    }

    /* JADX INFO: renamed from: x6 */
    public final void m40446x6() {
        act();
        CoreModule.f17545c.f19639e0.f149378g5 = false;
    }

    /* JADX INFO: renamed from: x7 */
    public final void m40447x7() {
        if (lac0.m149136m()) {
            duringCreated(CoreModule.f17545c.f19598Q1.f20117R.m121230k().take(1).flatMap(new w9j() { // from class: l.e330
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f88989a.m40278H8((MonetizationConfiguration) obj);
                }
            }).filter(new w9j() { // from class: l.f330
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((j760) obj).f116565b == C4319c.f15548i);
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.g330
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f100338a.m40286J8((j760) obj);
                }
            }, new e30() { // from class: l.h330
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40122V1((Throwable) obj);
                }
            }));
            if (lac0.m149134i().hasPreLoadBoostRefactorSvga.get().booleanValue()) {
                return;
            }
            lac0.m149134i().hasPreLoadBoostRefactorSvga.put(Boolean.TRUE);
            ArrayList arrayList = new ArrayList();
            arrayList.add("https://auto.tancdn.com/v1/raw/0fdc8f64-5452-4968-85c0-79b096797fdc12.svga");
            arrayList.add("https://auto.tancdn.com/v1/raw/41db580d-31c8-4180-8063-c656e986409212.svga");
            arrayList.add("https://auto.tancdn.com/v1/raw/c8af9bff-3dbd-425d-9be3-058125b716eb13.svga");
            arrayList.add("https://auto.tancdn.com/v1/raw/31429bf5-9bbd-42df-b607-5a5929f6256b12.svga");
            SVGALoader.with(act()).batchDownload(arrayList);
        }
    }

    /* JADX INFO: renamed from: x8 */
    public final /* synthetic */ void m40448x8(Envelope envelope) {
        m40433t9(TabName.Me, m40256B9());
    }

    /* JADX INFO: renamed from: x9 */
    public void m40449x9() {
        boolean z = this.f24492A;
        if (upa.m194795o2() && !upa.m194800p2()) {
            ((NewMainViewModel) this.viewModel).m39978M(TabName.Me, NewMainViewModel.IconDotType.edit_profile, false);
            this.f24492A = false;
        }
        NewMainViewModel newMainViewModel = (NewMainViewModel) this.viewModel;
        TabName tabName = TabName.Me;
        if (newMainViewModel.m39992X(tabName)) {
            return;
        }
        ((NewMainViewModel) this.viewModel).m40014p0(tabName, m40256B9());
        if (!upa.m194795o2() || m40256B9() || upa.m194800p2() || ((NewMainViewModel) this.viewModel).m39991W(tabName, BottomBarManager.DotType.ICON)) {
            return;
        }
        boolean z2 = this.f24508z;
        V v2 = this.viewModel;
        if (z2) {
            ((NewMainViewModel) v2).m40016r0(tabName, NewMainViewModel.IconDotType.edit_profile);
        } else {
            ((NewMainViewModel) v2).m39978M(tabName, NewMainViewModel.IconDotType.edit_profile, false);
        }
        boolean z3 = this.f24508z;
        this.f24492A = z3;
        if (z || !z3) {
            return;
        }
        zvf0.m220402x("e_mytab_incomplete", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: y6 */
    public final void m40450y6() {
        if (ogl0.m164259l()) {
            if (!CoreModule.f17545c.f19560D2.f116567S.get().booleanValue()) {
                CoreModule.f17545c.f19560D2.f116567S.put(Boolean.TRUE);
            }
            if (CoreModule.f17545c.f19560D2.f116566R.get().booleanValue()) {
                CoreModule.f17545c.f19642f0.m32902ap(User.ID_AI_1V1).subscribe(mkd0.m154956H(new e30() { // from class: l.m530
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        CoreModule.f17545c.f19560D2.f116566R.put(Boolean.FALSE);
                    }
                }, new e30() { // from class: l.n530
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        C8096a.m40187l2((Throwable) obj);
                    }
                }));
                return;
            }
            return;
        }
        if (CoreModule.f17545c.f19560D2.f116567S.get().booleanValue()) {
            CoreModule.f17545c.f19560D2.m140079c3().subscribe(mkd0.m154956H(new e30() { // from class: l.o530
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19560D2.f116567S.put(Boolean.FALSE);
                }
            }, new e30() { // from class: l.p530
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40131X1((Throwable) obj);
                }
            }));
        }
        if (CoreModule.f17545c.f19560D2.f116566R.get().booleanValue()) {
            return;
        }
        CoreModule.f17545c.f19560D2.f116566R.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: y7 */
    public final void m40451y7() {
        if (u59.m191810S()) {
            duringCreated(uld0.m194220e().m194227j().obs()).subscribe(mkd0.m154955G(new e30() { // from class: l.x530
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f191086a.m40290K8((Boolean) obj);
                }
            }));
            duringCreated(uld0.m194220e().m194225g().obs()).subscribe(mkd0.m154956H(new e30() { // from class: l.y530
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f196378a.m40294L8((Boolean) obj);
                }
            }, new e30() { // from class: l.z530
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8096a.m40087O3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: y8 */
    public final /* synthetic */ void m40452y8(RiskSelfData riskSelfData) {
        boolean z = v930.m197534h() == TabName.Card || v930.m197534h() == TabName.Msg;
        boolean z2 = NullChecker.m81303a(riskSelfData) && !TextUtils.isEmpty(riskSelfData.popUpText);
        if (CoreModule.m29932K().isMainPage(c30.m104962d()) && z && z2) {
            qwp.m176882i().m176889o(act(), riskSelfData.type, riskSelfData.popUpText);
            CoreModule.f17545c.f19686t2.m168337q3(riskSelfData);
        }
    }

    /* JADX INFO: renamed from: y9 */
    public void m40453y9(TabName tabName, int i2) {
        m40318R9(tabName, i2 > 0, true);
        if (TabName.Me == tabName) {
            V v2 = this.viewModel;
            if (i2 <= 0) {
                ((NewMainViewModel) v2).m40014p0(tabName, m40256B9());
            } else if (((NewMainViewModel) v2).m39991W(tabName, BottomBarManager.DotType.Dot)) {
                ((NewMainViewModel) this.viewModel).m40014p0(tabName, false);
            }
        }
        ((NewMainViewModel) this.viewModel).m40020v0(tabName, i2);
    }

    @Override // p149l.y030
    /* JADX INFO: renamed from: z1 */
    public void mo40454z1() {
        super.mo40454z1();
        m40285J7();
        CoreModule.f17545c.f19570H0.m210361k5();
        if (CoreModule.m29932K().mo30835xf()) {
            CoreModule.f17545c.f19573I0.m140262P3();
        }
        if (ogl0.m164237P()) {
            CoreModule.f17545c.f19656j2.m99160j3();
        }
        if (CoreModule.f17545c.f19549A0.f88268R.get().longValue() == 0) {
            CoreModule.f17545c.f19549A0.f88268R.put(Long.valueOf(mqi0.m155944o()));
        }
        m40292L6();
        CoreModule.f17545c.f19663m0.f19444q2[0] = 0;
        m40334W5();
        creates(new e30() { // from class: l.h230
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105486a.m40360b9((Bundle) obj);
            }
        });
        m40293L7();
    }

    /* JADX INFO: renamed from: z7 */
    public final void m40455z7() {
        act().duringCreated((C22306c) vjf0.m198623e().m198647z(), false).subscribe(mkd0.m154956H(new e30() { // from class: l.t130
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167283a.m40298M8((roj0) obj);
            }
        }, new e30() { // from class: l.u130
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40045E5((Throwable) obj);
            }
        }));
        act().duringCreated(new v9j() { // from class: l.v130
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ConnectivityReceiver.m81290m();
            }
        }, false).filter(new w9j() { // from class: l.x130
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.y130
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195381a.m40302N8((NetworkInfo) obj);
            }
        }, new e30() { // from class: l.z130
            @Override // p149l.e30
            public final void call(Object obj) {
                C8096a.m40119U4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z8 */
    public final /* synthetic */ void m40456z8(String str) {
        Runnable runnable = this.f24500r;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: z9 */
    public final boolean m40457z9() {
        return CoreModule.f17545c.f19696x0.m30178H4();
    }
}
