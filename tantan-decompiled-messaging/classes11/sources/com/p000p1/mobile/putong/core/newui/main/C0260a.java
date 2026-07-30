package com.p000p1.mobile.putong.core.newui.main;

import android.animation.Animator;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.android.billingclient.api.a;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.core.newui.admob.NavigationBarAdmobHelper;
import com.p000p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p000p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p000p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p000p1.mobile.putong.core.newui.home.frag.base.HomeLayoutFrag;
import com.p000p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p000p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeMeetFrag;
import com.p000p1.mobile.putong.core.newui.main.C0260a;
import com.p000p1.mobile.putong.core.newui.messages.C0304a;
import com.p000p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p000p1.mobile.putong.core.newui.messages.ConversationsTabFrag;
import com.p000p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p000p1.mobile.putong.core.newui.profile.ProfileFrag;
import com.p000p1.mobile.putong.core.newui.ttcmigrate.TtcAccountMigrateDisplayAct;
import com.p000p1.mobile.putong.location.AbstractC0465a;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p000p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p000p1.mobile.putong.p004ui.LauncherView;
import com.p000p1.mobile.putong.p004ui.webview.AccessTokenWebViewAct;
import com.p000p1.mobile.putong.p004ui.webview.WebViewDialogAct;
import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import com.p000p1.mobile.putong.util.launch.LaunchStep;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.ExtraActLifecycle;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.api.api.PaymentApi;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.app.surveysparrow.SurveySparrowHelper;
import com.p1.mobile.putong.core.CoreBusinessModule;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreInnerPush;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.core.api.e0;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.EmojiAnimData;
import com.p1.mobile.putong.core.data.Figure;
import com.p1.mobile.putong.core.data.Greeting;
import com.p1.mobile.putong.core.data.GreetingSummary;
import com.p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p1.mobile.putong.core.data.InsertConversationUser;
import com.p1.mobile.putong.core.data.InsertConversationsList;
import com.p1.mobile.putong.core.data.IntlThirdQuickLoginEnvelope;
import com.p1.mobile.putong.core.data.IntlTribeBubble;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.MonetizationConfiguration;
import com.p1.mobile.putong.core.data.PopGuide;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.RegionRule;
import com.p1.mobile.putong.core.data.RegionRuleTag;
import com.p1.mobile.putong.core.data.RiskSelfData;
import com.p1.mobile.putong.core.data.SeeExposedUser;
import com.p1.mobile.putong.core.data.TtcMigrateDisplayData;
import com.p1.mobile.putong.core.data.UserFeedbackInfo;
import com.p1.mobile.putong.core.data.UserLiveHierarchy;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.data.VisitorDoorInfo;
import com.p1.mobile.putong.core.ui.lovebuzz.BuzzComboFrag;
import com.p1.mobile.putong.core.ui.lovebuzz.pop.LoveBuzzNotifyUserPop;
import com.p1.mobile.putong.core.ui.marry.audit.MarryInfoAuditStatusAct;
import com.p1.mobile.putong.data.ADInfo;
import com.p1.mobile.putong.data.BannerLoc;
import com.p1.mobile.putong.data.ConversationCounter;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.DeeplinkReport;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Links;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.OMSADLink;
import com.p1.mobile.putong.data.OMSLauncherInfo;
import com.p1.mobile.putong.data.OmsMerCuryData;
import com.p1.mobile.putong.data.Purpose;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.VerificationNetworkData;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import l.aaj;
import l.abi;
import l.aqo;
import l.b1c;
import l.bzc0;
import l.c30;
import l.c4g0;
import l.cfx;
import l.d30;
import l.ddj0;
import l.du2;
import l.e010;
import l.e30;
import l.e51;
import l.e900;
import l.f6c0;
import l.f8c;
import l.g6a;
import l.ghd0;
import l.gl5;
import l.gt00;
import l.h6a;
import l.hd2;
import l.hpd0;
import l.hu40;
import l.i36;
import l.ife;
import l.ir9;
import l.j2e0;
import l.j760;
import l.j8w;
import l.jn7;
import l.jo0;
import l.jq2;
import l.k6w;
import l.ke7;
import l.knb0;
import l.kye;
import l.l9b;
import l.lac0;
import l.lip0;
import l.lqf;
import l.lsi0;
import l.lva;
import l.lxf0;
import l.m73;
import l.mah0;
import l.mcr;
import l.mkd0;
import l.mrm;
import l.n3b0;
import l.nd2;
import l.o6j0;
import l.ogl0;
import l.p09;
import l.p420;
import l.p9w;
import l.pxe;
import l.q8p;
import l.qib0;
import l.qqi0;
import l.qwp;
import l.r65;
import l.r70;
import l.r9m;
import l.roj0;
import l.s7m;
import l.sp8;
import l.u4c0;
import l.u59;
import l.u9w;
import l.uld0;
import l.upa;
import l.ura;
import l.v930;
import l.v9j;
import l.vve0;
import l.vwb;
import l.vy8;
import l.w2e0;
import l.w9j;
import l.wb50;
import l.wc40;
import l.wjc0;
import l.wm20;
import l.x2c0;
import l.x4i;
import l.x9j;
import l.xaj0;
import l.xdl0;
import l.xma;
import l.xzc0;
import l.y19;
import l.y59;
import l.y9j;
import l.z2x;
import l.z60;
import l.zpd0;
import l.zvf0;
import p009l.C0836d;
import p009l.a130;
import p009l.b83;
import p009l.bcp;
import p009l.bs30;
import p009l.e4w;
import p009l.e5s;
import p009l.g70;
import p009l.gei;
import p009l.gp80;
import p009l.hc50;
import p009l.mqi0;
import p009l.myf;
import p009l.na30;
import p009l.ouk;
import p009l.psl;
import p009l.puk0;
import p009l.q860;
import p009l.qfh0;
import p009l.qsm;
import p009l.r6n;
import p009l.rd6;
import p009l.sdt;
import p009l.trq;
import p009l.u4e;
import p009l.vjf0;
import p009l.w85;
import p009l.wb3;
import p009l.wf6;
import p009l.xe40;
import p009l.y030;
import p009l.y1j;
import p009l.y8i0;
import p009l.yni;
import p009l.zch0;
import rx.Notification;
import rx.schedulers.Schedulers;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0260a extends y030<NewMainViewModel> {

    /* JADX INFO: renamed from: A */
    public boolean f3270A;

    /* JADX INFO: renamed from: B */
    public zpd0 f3271B;

    /* JADX INFO: renamed from: C */
    public hpd0 f3272C;

    /* JADX INFO: renamed from: D */
    public boolean f3273D;

    /* JADX INFO: renamed from: E */
    public rx.subjects.a<Boolean> f3274E;

    /* JADX INFO: renamed from: F */
    public c4g0 f3275F;

    /* JADX INFO: renamed from: G */
    public TabName f3276G;

    /* JADX INFO: renamed from: H */
    public rx.subjects.a<roj0> f3277H;

    /* JADX INFO: renamed from: r */
    @Nullable
    public Runnable f3278r;

    /* JADX INFO: renamed from: s */
    public rx.subjects.a<TabName> f3279s;

    /* JADX INFO: renamed from: t */
    public rx.subjects.a<roj0> f3280t;

    /* JADX INFO: renamed from: u */
    public PutongFrag f3281u;

    /* JADX INFO: renamed from: v */
    public int f3282v;

    /* JADX INFO: renamed from: w */
    public boolean f3283w;

    /* JADX INFO: renamed from: x */
    public boolean f3284x;

    /* JADX INFO: renamed from: y */
    public boolean f3285y;

    /* JADX INFO: renamed from: z */
    public boolean f3286z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$a */
    public class a implements e30<UserFeedbackInfo> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f3287a;

        public a(boolean z) {
            this.f3287a = z;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(UserFeedbackInfo userFeedbackInfo) {
            if (this.f3287a && TextUtils.equals(myf.m18686H(), "aiPictureDlg")) {
                return;
            }
            myf.m18697S(C0260a.this.act(), "netPictureDlg");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$b */
    public class b implements e30<Throwable> {
        public b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$c */
    public class c implements e30<TabName> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f3290a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f3291b;

        public c(boolean z, boolean z2) {
            this.f3290a = z;
            this.f3291b = z2;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(TabName tabName) {
            String str;
            if (this.f3290a && CoreModule.c.e0.na().isAiFakeAvatar() && myf.m18687I()) {
                str = "aiPictureDlg";
            } else {
                str = (this.f3291b && NullChecker.a(CoreModule.c.e0.W6) && CoreModule.c.e0.W6.isGetFeedBackPeople) ? "netPictureDlg" : "noPictureDlg";
            }
            if (TextUtils.equals(str, "noPictureDlg")) {
                return;
            }
            myf.m18697S(C0260a.this.act(), str);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$d */
    public class d implements e30<String> {
        public d() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            myf.m18680B();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$e */
    public class e implements e30<Boolean> {
        public e() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            CoreModule.c.e0.t7();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$f */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CoreModule.c.m0.e0.onNext(roj0.a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$g */
    public class g implements e30<PopGuide> {
        public g() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(PopGuide popGuide) {
            ((NewMainViewModel) ((jq2) C0260a.this).viewModel).m4103z0(popGuide);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$h */
    public class h implements e30<Throwable> {
        public h() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$i */
    public class i implements e30<TabName> {
        public i() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(TabName tabName) {
            if (x4i.g) {
                x4i.g = false;
                return;
            }
            if (tabName == TabName.Card && x4i.b()) {
                x4i.e(C0260a.this.act());
            } else if (tabName == TabName.Moment) {
                CoreModule.c.e0.Q2.put(Long.valueOf(mqi0.m18550o()));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$j */
    public class j implements hd2.a {
        public j() {
        }

        /* JADX INFO: renamed from: a */
        public Animator m4550a(View view) {
            return null;
        }

        /* JADX INFO: renamed from: b */
        public Animator m4551b(View view) {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$k */
    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CoreModule.c.Q0.k3();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$l */
    public class l extends lxf0.a {
        public l() {
        }

        public void onComplete() {
        }

        public void onError(@Nullable Throwable th) {
            lsi0.H(C0260a.this.act().getResources().getString(R.string.Ro), (Drawable) null, C0260a.this.act().getResources().getDrawable(x2c0.vr));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$m */
    public static /* synthetic */ class m {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3302a;

        static {
            int[] iArr = new int[TabName.values().length];
            f3302a = iArr;
            try {
                iArr[TabName.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3302a[TabName.Msg.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3302a[TabName.Live.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3302a[TabName.Moment.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3302a[TabName.Me.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3302a[TabName.Buzz.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3302a[TabName.FEATURED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3302a[TabName.Meet.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3302a[TabName.VoiceChat.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$n */
    public class n implements e30<Throwable> {
        public n() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$o */
    public class o implements w9j<Long, rx.c<q860<Conversation>>> {
        public o() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<q860<Conversation>> call(Long l2) {
            return CoreModule.c.f0.ef();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$p */
    public class p implements w9j<j760<q860<Conversation>, TabName>, q860<Conversation>> {
        public p() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public q860<Conversation> call(j760<q860<Conversation>, TabName> j760Var) {
            if (j760Var.b == TabName.Msg) {
                mkd0.z(C0260a.this.f3275F);
            }
            return (q860) j760Var.a;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$q */
    public class q implements w9j<q860<Conversation>, Double> {
        public q() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double call(q860<Conversation> q860Var) {
            Double dValueOf = Double.valueOf(0.0d);
            int i = upa.l().last_conversation_not_participating;
            if (q860Var == null || i == 0) {
                return dValueOf;
            }
            List<Conversation> list = q860Var.f19068a;
            if (vwb.J(list)) {
                return dValueOf;
            }
            return i < list.size() ? Double.valueOf(list.get(i - 1).latestTime) : Double.valueOf(-1.0d);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$r */
    public class r implements e30<Double> {
        public r() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Double d) {
            long jRound;
            long jIg;
            if (d.doubleValue() == 0.0d) {
                jIg = (long) CoreModule.c.f0.ig();
                jRound = (long) CoreModule.c.f0.Bg();
            } else if (d.doubleValue() == -1.0d) {
                jIg = -1;
                jRound = -1;
            } else {
                long jRound2 = d.doubleValue() < CoreModule.c.f0.ig() ? Math.round(d.doubleValue()) - 1 : (long) CoreModule.c.f0.ig();
                jRound = d.doubleValue() < CoreModule.c.f0.Bg() ? Math.round(d.doubleValue()) - 2 : (long) CoreModule.c.f0.Bg();
                jIg = jRound2;
            }
            CoreModule.c.f0.j0.put(Long.valueOf(jIg));
            CoreModule.c.f0.l0.put(Long.valueOf(jRound));
            CoreModule.c.f0.dq(qib0.H.guessedCurrentServerTime());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$s */
    public class s implements e30<roj0> {
        public s() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(roj0 roj0Var) {
            new qfh0(C0260a.this.act(), "p_home,accelerate_guide").show();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$t */
    public class t implements w9j<UserFeedbackInfo, Boolean> {
        public t() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(UserFeedbackInfo userFeedbackInfo) {
            return Boolean.valueOf(userFeedbackInfo.isGetFeedBackPeople);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$u */
    public class u implements w9j<UserFeedbackInfo, Boolean> {
        public u() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(UserFeedbackInfo userFeedbackInfo) {
            return Boolean.valueOf(v930.h() == TabName.Card || v930.h() == TabName.Me);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$v */
    public static class v extends y030.AbstractC1319b<C0260a> {
        public v(C0260a c0260a) {
            super(c0260a);
        }

        /* JADX INFO: renamed from: a */
        public void m4560a(Boolean bool, String str) {
            ((NewMainViewModel) ((jq2) ((C0260a) this.f22839a)).viewModel).m4097t0(bool.booleanValue(), str);
        }
    }

    public C0260a(mcr mcrVar) {
        super(mcrVar);
        this.f3279s = rx.subjects.a.b();
        this.f3280t = rx.subjects.a.b();
        this.f3281u = null;
        this.f3283w = true;
        this.f3286z = false;
        this.f3270A = false;
        this.f3271B = new zpd0("message_tips_text_update_time_" + CoreModule.H().userId(), 0L);
        this.f3272C = new hpd0("static_hdr_info_reported", Boolean.FALSE);
        this.f3274E = rx.subjects.a.b();
        this.f3277H = rx.subjects.a.c(roj0.a);
    }

    /* JADX INFO: renamed from: C2 */
    public static /* synthetic */ void m4116C2(jn7.a aVar) {
        if (!NullChecker.a(aVar) || !NullChecker.a(aVar.d)) {
            com.p1.mobile.putong.core.api.c cVar = CoreModule.c;
            cVar.f0.Qg(((DbObject) cVar.e0.p9()).id, mqi0.m18550o(), 0, 0);
        } else {
            com.p1.mobile.putong.core.api.g gVar = CoreModule.c.f0;
            Greeting greeting = aVar.d;
            gVar.Qg(greeting.otherUser, greeting.latestTime, aVar.a, aVar.b);
        }
    }

    /* JADX INFO: renamed from: C4 */
    public static /* synthetic */ CoreInnerPush.a m4118C4(CoreInnerPush.a aVar, com.p1.mobile.android.app.c cVar) {
        return aVar;
    }

    /* JADX INFO: renamed from: C5 */
    public static /* synthetic */ void m4119C5(com.p1.mobile.android.app.c cVar) {
        CoreModule.c.j0.Q5();
        CoreModule.c.j0.P5();
    }

    /* JADX INFO: renamed from: D2 */
    public static /* synthetic */ void m4120D2(Throwable th) {
    }

    /* JADX INFO: renamed from: E2 */
    public static /* synthetic */ void m4125E2(Bundle bundle) {
    }

    /* JADX INFO: renamed from: E5 */
    public static /* synthetic */ void m4128E5(Throwable th) {
    }

    /* JADX INFO: renamed from: F1 */
    public static /* synthetic */ void m4129F1(TabName tabName) {
        if (tabName == TabName.Msg) {
            SeeExposedUser seeExposedUserA3 = CoreModule.c.v2.A3();
            if (xma.e4()) {
                if (CoreModule.o.b().wf() && seeExposedUserA3 != null) {
                    CoreModule.c.v2.C3(seeExposedUserA3.userId, seeExposedUserA3.timestamp);
                    return;
                }
                q8p.a aVar = q8p.Companion;
                if (aVar.o()) {
                    return;
                }
                CoreModule.K().Rp("");
                CoreModule.c.v2.q3();
                aVar.t(mqi0.m18550o());
            }
        }
    }

    /* JADX INFO: renamed from: F3 */
    public static /* synthetic */ void m4131F3(TabName tabName) {
        if (tabName == TabName.Me) {
            CoreModule.c.C0.u4();
        }
    }

    /* JADX INFO: renamed from: F5 */
    public static /* synthetic */ void m4133F5(Throwable th) {
    }

    /* JADX INFO: renamed from: G5 */
    public static /* synthetic */ void m4135G5(j760 j760Var) {
        String str = (String) j760Var.a;
        if ((TextUtils.equals("audit", str) || TextUtils.equals("auditing", str) || TextUtils.equals("pending", str) || TextUtils.equals("denied", str) || ((Boolean) j760Var.b).booleanValue()) && TextUtils.equals((CharSequence) CoreModule.c.e0.Z3.get(), "marryMode")) {
            CoreModule.c.e0.Z3.put("loveMode");
            CoreModule.c.e0.F1.onNext(roj0.a);
        }
    }

    /* JADX INFO: renamed from: G6 */
    private void m4136G6() {
        if (upa.N3()) {
            duringCreated(ExpandedCardStyleHelper.m2064o().m2083y().map(new w9j() { // from class: l.t430
                public final Object call(Object obj) {
                    return ((ExpandedCardStyleHelper.C0115b) obj).f1196a;
                }
            }).distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.u430
                public final void call(Object obj) {
                    this.f20981a.m4439a8((ExpandedCardStyleHelper.ExpandedCardStyle) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: H1 */
    public static /* synthetic */ void m4137H1(Throwable th) {
    }

    /* JADX INFO: renamed from: H3 */
    public static /* synthetic */ void m4139H3(Throwable th) {
    }

    /* JADX INFO: renamed from: I1 */
    public static /* synthetic */ void m4142I1(Throwable th) {
    }

    /* JADX INFO: renamed from: I3 */
    public static /* synthetic */ void m4144I3(com.p1.mobile.android.app.c cVar) {
        if (NotificationCheckerCommon.m9539a() != NotificationCheckerCommon.State.closed) {
            if (((Long) CoreModule.c.e0.m0.get()).longValue() == 0) {
                CoreModule.c.e0.m0.put(Long.valueOf(mqi0.m18550o()));
            }
        } else if (((Long) CoreModule.c.e0.m0.get()).longValue() > 0) {
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
    }

    /* JADX INFO: renamed from: K2 */
    public static /* synthetic */ void m4152K2(Throwable th) {
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ roj0 m4153K3(final List list) {
        f8c.o().B(new d30() { // from class: l.q430
            public final void call() {
                C0260a.m4213W4(list);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: L1 */
    public static /* synthetic */ rx.c m4156L1(TabName tabName) {
        String str;
        if (tabName == TabName.Card) {
            str = "swipe";
        } else {
            str = tabName == TabName.Msg ? "message" : "me";
        }
        return CoreModule.c.t2.l3(str);
    }

    /* JADX INFO: renamed from: L2 */
    public static /* synthetic */ void m4157L2(Throwable th) {
    }

    /* JADX INFO: renamed from: L5 */
    public static /* synthetic */ void m4159L5(Throwable th) {
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ Double m4166N3(q860 q860Var) {
        return (!NullChecker.a(q860Var) || vwb.J(q860Var.f19068a)) ? Double.valueOf(-1.0d) : Double.valueOf(((Conversation) q860Var.f19068a.get(0)).latestTime);
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ void m4167N4(Throwable th) {
        CoreModule.c.n1.R3(false);
        ConversationsList.m5434A2();
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m4170O3(Throwable th) {
    }

    /* JADX INFO: renamed from: O5 */
    public static /* synthetic */ void m4172O5(Throwable th) {
    }

    /* JADX INFO: renamed from: P2 */
    public static /* synthetic */ void m4174P2(Throwable th) {
    }

    /* JADX INFO: renamed from: P4 */
    public static /* synthetic */ void m4176P4(Throwable th) {
    }

    /* JADX INFO: renamed from: Q1 */
    public static /* synthetic */ void m4178Q1(Throwable th) {
        w2e0.g = null;
        lsi0.h(R.string.k9);
    }

    /* JADX INFO: renamed from: Q2 */
    public static /* synthetic */ void m4179Q2(GreetingSummary greetingSummary) {
        if (greetingSummary == null) {
            CoreModule.c.r0.k5();
        } else {
            if (greetingSummary.latestTime <= 0.0d) {
                return;
            }
            CoreModule.c.r0.F5(greetingSummary, "fake_conversation_greeting");
        }
    }

    /* JADX INFO: renamed from: Q3 */
    public static /* synthetic */ void m4180Q3(Throwable th) {
    }

    /* JADX INFO: renamed from: Q4 */
    public static /* synthetic */ void m4181Q4(List list) {
        CoreModule.c.r0.H5();
        ConversationsList.f3858t1.onNext(roj0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q8 */
    public /* synthetic */ void m4183Q8(Bundle bundle) {
        this.f3284x = bundle != null;
    }

    /* JADX INFO: renamed from: R2 */
    public static /* synthetic */ void m4185R2(Throwable th) {
    }

    /* JADX INFO: renamed from: S2 */
    public static /* synthetic */ void m4190S2(List list) {
        ConversationsList.f3857s1.onNext(list);
        StringBuilder sb = new StringBuilder("convListPre 预加载完成 ");
        sb.append(NullChecker.a(list) ? list.size() : 0);
        rd6.m21505C(sb.toString());
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m4191S3(UserLiveHierarchy userLiveHierarchy) {
        NavigationBarAdmobHelper navigationBarAdmobHelper = NavigationBarAdmobHelper.INSTANCE;
        navigationBarAdmobHelper.m51o().put(Integer.valueOf(userLiveHierarchy.hierarchy.grade));
        navigationBarAdmobHelper.m46j().put(Integer.valueOf(userLiveHierarchy.anchorHierarchy.grade));
    }

    /* JADX INFO: renamed from: T1 */
    public static /* synthetic */ void m4194T1(Throwable th) {
    }

    /* JADX INFO: renamed from: U2 */
    public static /* synthetic */ void m4200U2(IntlTribeBubble intlTribeBubble) {
        int i2;
        int i3;
        if (intlTribeBubble == null || ((i2 = intlTribeBubble.seeCount) > 0 && !((i3 = intlTribeBubble.tribeCount) > 0 && i2 == i3 && i3 == intlTribeBubble.seeTribeCount))) {
            CoreModule.c.n1.z3().onNext(Boolean.FALSE);
        } else {
            CoreModule.c.n1.z3().onNext(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: U4 */
    public static /* synthetic */ void m4202U4(Throwable th) {
    }

    /* JADX INFO: renamed from: U6 */
    private void m4204U6() {
        if (g6a.m()) {
            CoreModule.c.Q1.k3();
        }
    }

    /* JADX INFO: renamed from: V1 */
    public static /* synthetic */ void m4205V1(Throwable th) {
    }

    /* JADX INFO: renamed from: V2 */
    public static /* synthetic */ void m4206V2(NetworkInfo networkInfo) {
        if (lip0.i().o()) {
            lip0.i().q();
        }
    }

    /* JADX INFO: renamed from: W1 */
    public static /* synthetic */ void m4210W1(Throwable th) {
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m4212W3(Throwable th) {
    }

    /* JADX INFO: renamed from: W4 */
    public static /* synthetic */ void m4213W4(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Conversation conversation = (Conversation) it.next();
            if (NullChecker.a(conversation.property) && NullChecker.a(conversation.property.limitedTrialSee) && TextUtils.equals(conversation.property.limitedTrialSee.actorId, CoreModule.H().userId())) {
                conversation.localIsLimitedTrialSee = 1;
                CoreModule.k.m.upsert(conversation);
            }
        }
    }

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m4214X1(Throwable th) {
    }

    /* JADX INFO: renamed from: X2 */
    public static /* synthetic */ void m4215X2(Throwable th) {
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m4220Y3(com.p1.mobile.android.app.c cVar) {
        Long lValueOf = (Long) CoreModule.c.u0.k0.get();
        if (lValueOf.longValue() <= 0) {
            lValueOf = Long.valueOf(mqi0.m18550o());
        }
        CoreModule.c.v0.A3(lValueOf.longValue());
        CoreModule.c.v0.y3("", lValueOf.longValue());
    }

    /* JADX INFO: renamed from: Z2 */
    public static /* synthetic */ void m4223Z2(Throwable th) {
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m4224Z3(Throwable th) {
    }

    /* JADX INFO: renamed from: a5 */
    public static /* synthetic */ void m4229a5(Throwable th) {
    }

    /* JADX INFO: renamed from: b2 */
    public static /* synthetic */ void m4230b2(Throwable th) {
    }

    /* JADX INFO: renamed from: d2 */
    public static /* synthetic */ void m4238d2(Throwable th) {
    }

    /* JADX INFO: renamed from: e2 */
    public static /* synthetic */ void m4242e2() {
        if (C0304a.m5957p((String) CoreModule.c.f0.J0.get())) {
            CoreModule.c.f0.ke();
        }
    }

    /* JADX INFO: renamed from: g5 */
    public static /* synthetic */ void m4253g5(Throwable th) {
    }

    /* JADX INFO: renamed from: h2 */
    public static /* synthetic */ void m4254h2(Throwable th) {
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ void m4259i3(Throwable th) {
    }

    /* JADX INFO: renamed from: j3 */
    public static /* synthetic */ void m4263j3(Throwable th) {
    }

    /* JADX INFO: renamed from: k5 */
    public static /* synthetic */ void m4269k5(Boolean bool) {
    }

    /* JADX INFO: renamed from: l2 */
    public static /* synthetic */ void m4270l2(Throwable th) {
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ void m4271l3(Boolean bool) {
    }

    /* JADX INFO: renamed from: m2 */
    public static /* synthetic */ void m4274m2(com.p1.mobile.android.app.c cVar) {
        CoreModule.Q().m9018Lh().m11270h();
        if (CoreModule.K().xf()) {
            CoreModule.c.I0.N3();
        }
    }

    /* JADX INFO: renamed from: m3 */
    public static /* synthetic */ void m4275m3(OMSLauncherInfo oMSLauncherInfo) {
        if (Act.foreground_() == null) {
            hc50.m15527g(oMSLauncherInfo.id, oMSLauncherInfo.ad.link.deeplinkReport.success);
        } else {
            hc50.m15527g(oMSLauncherInfo.id, oMSLauncherInfo.ad.link.deeplinkReport.failed);
        }
    }

    /* JADX INFO: renamed from: m5 */
    public static /* synthetic */ void m4277m5(j760 j760Var) {
        VisitorDoorInfo visitorDoorInfo = (VisitorDoorInfo) j760Var.a;
        CoreLikers.a aVar = (CoreLikers.a) j760Var.b;
        if ((!NullChecker.a(aVar) || aVar.c <= 0) && visitorDoorInfo != null && !TextUtils.isEmpty(visitorDoorInfo.userID) && (visitorDoorInfo.unReadCount > 0 || aVar == null || aVar.b <= 0)) {
            CoreModule.c.n1.R3(true);
        } else {
            CoreModule.c.n1.R3(false);
        }
        ConversationsList.m5434A2();
    }

    /* JADX INFO: renamed from: n2 */
    public static /* synthetic */ void m4278n2(Throwable th) {
    }

    /* JADX INFO: renamed from: n3 */
    public static /* synthetic */ void m4279n3(Throwable th) {
    }

    /* JADX INFO: renamed from: n5 */
    public static /* synthetic */ void m4281n5(Throwable th) {
    }

    /* JADX INFO: renamed from: o4 */
    public static /* synthetic */ void m4284o4(Throwable th) {
    }

    /* JADX INFO: renamed from: p5 */
    public static /* synthetic */ void m4289p5(RegionRule regionRule) {
        if (regionRule == null) {
            return;
        }
        boolean z = false;
        IntlCountryCodeController.z(NullChecker.b(regionRule.tags) && (regionRule.tags.contains(RegionRuleTag.get("GDPR")) || regionRule.tags.contains(RegionRuleTag.get("CCPA"))));
        if (NullChecker.b(regionRule.tags) && regionRule.tags.contains(RegionRuleTag.get("BS"))) {
            z = true;
        }
        IntlCountryCodeController.y(z);
        if (CoreModule.Q().m9040a().m14846a()) {
            CoreModule.Q().m9068rk(regionRule.liveRegionTag);
        }
        try {
            qib0.X0("live_region", regionRule.liveRegionTag.toString());
        } catch (Exception e2) {
            CrashHelper.c(e2);
        }
        CoreModule.c.e0.ca();
    }

    /* JADX INFO: renamed from: q3 */
    public static /* synthetic */ void m4291q3(TabName tabName) {
        if (tabName == TabName.Msg || !CoreModule.c.C2.w3()) {
            return;
        }
        CoreModule.c.C2.y3();
    }

    /* JADX INFO: renamed from: r5 */
    public static /* synthetic */ void m4297r5(Throwable th) {
    }

    /* JADX INFO: renamed from: s2 */
    public static /* synthetic */ void m4298s2(Act.r rVar) {
        WeakReference weakReference;
        if (rVar == null || (weakReference = rVar.a) == null || !(weakReference.get() instanceof Act)) {
            return;
        }
        r9m.r().E(false);
        r9m.r().F((Act) rVar.a.get());
    }

    /* JADX INFO: renamed from: s3 */
    public static /* synthetic */ void m4299s3(Throwable th) {
    }

    /* JADX INFO: renamed from: u2 */
    public static /* synthetic */ void m4306u2(Throwable th) {
    }

    /* JADX INFO: renamed from: u3 */
    public static /* synthetic */ void m4307u3(Frag frag, String str, com.p1.mobile.android.app.c cVar) {
        if (CoreModule.N().isPhotoAlbumFrag(frag)) {
            ((FeedService.a) frag).m(str);
        }
    }

    /* JADX INFO: renamed from: u4 */
    public static /* synthetic */ void m4308u4(q860 q860Var) {
        if (!NullChecker.a(q860Var) || vwb.J(q860Var.f19068a)) {
            return;
        }
        CoreModule.c.f0.Ff(q860Var.f19068a);
    }

    /* JADX INFO: renamed from: v4 */
    public static /* synthetic */ void m4312v4(j760 j760Var) {
        if (((Integer) CoreModule.c.e0.M4.get()).intValue() == 0 && CoreModule.c.e0.b8(false)) {
            CoreModule.c.e0.M4.put(1);
        }
    }

    /* JADX INFO: renamed from: v7 */
    private void m4314v7() {
        lifecycle().filter(new w9j() { // from class: l.j430
            public final Object call(Object obj) {
                return Boolean.valueOf(c.i == ((c) obj));
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.l430
            public final void call(Object obj) {
                C0260a.m4119C5((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w3 */
    public static /* synthetic */ void m4316w3(Throwable th) {
    }

    /* JADX INFO: renamed from: y4 */
    public static /* synthetic */ void m4325y4(Throwable th) {
    }

    /* JADX INFO: renamed from: z6 */
    private void m4331z6() {
        if (upa.f()) {
            duringCreated(m4390O9().distinctUntilChanged().filter(new w9j() { // from class: l.j830
                public final Object call(Object obj) {
                    TabName tabName = (TabName) obj;
                    return Boolean.valueOf(TextUtils.equals(tabName.name(), TabName.Card.name()) || TextUtils.equals(tabName.name(), TabName.Me.name()));
                }
            })).subscribe(mkd0.H(new e30() { // from class: l.k830
                public final void call(Object obj) {
                    CoreModule.c.m0.F5(true);
                }
            }, new e30() { // from class: l.l830
                public final void call(Object obj) {
                    C0260a.m4278n2((Throwable) obj);
                }
            }));
        } else if (upa.e()) {
            CoreModule.c.m0.m0.onNext(Long.valueOf(mqi0.m18550o()));
        }
    }

    /* JADX INFO: renamed from: A6 */
    public final void m4332A6() {
        if (!upa.H3() || ((Boolean) CoreModule.c.e0.w2.get()).booleanValue()) {
            return;
        }
        CoreModule.c.Z.S.z().subscribe(mkd0.H(new e30() { // from class: l.q530
            public final void call(Object obj) {
                CoreModule.c.e0.w2.put(Boolean.TRUE);
            }
        }, new e30() { // from class: l.r530
            public final void call(Object obj) {
                C0260a.m4297r5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A7, reason: merged with bridge method [inline-methods] */
    public final void m4393P8() {
        duringCreated(ConnectivityReceiver.m()).skip(1).filter(new w9j() { // from class: l.l230
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.m230
            public final void call(Object obj) {
                C0260a.m4206V2((NetworkInfo) obj);
            }
        }));
        m4535y7();
        m4383N6();
        m4486m6();
        m4478k6();
        m4511s7();
        m4461g6();
        m4427Y5();
        m4332A6();
        m4483l7();
        qib0.r0(new Runnable() { // from class: l.n230
            @Override // java.lang.Runnable
            public final void run() {
                this.f17198a.m4389O8();
            }
        }, true);
        m4336B6();
        m4519u7();
        m4515t7();
        m4534y6();
    }

    /* JADX INFO: renamed from: A8 */
    public final /* synthetic */ void m4334A8(Bundle bundle) {
        if (!NullChecker.a(((jq2) this).viewModel) || ((NewMainViewModel) ((jq2) this).viewModel).m4068V() || cfx.a()) {
            return;
        }
        u9w.INSTANCE.v(act(), ((NewMainViewModel) ((jq2) this).viewModel).m4054L(TabName.Buzz), new com.p1.mobile.android.ui.bubble.a.c() { // from class: l.e530
            /* JADX INFO: renamed from: a */
            public final void m13732a(String str) {
                this.f12370a.m4540z8(str);
            }
        });
    }

    /* JADX INFO: renamed from: A9 */
    public final boolean m4335A9() {
        if (((Integer) CoreModule.c.j0.n0.get()).intValue() <= 0) {
            return false;
        }
        if (qib0.t < 3699000) {
            return true;
        }
        CoreModule.c.j0.n0.put(0);
        return false;
    }

    /* JADX INFO: renamed from: B6 */
    public final void m4336B6() {
        if (!r65.m()) {
            if (((Boolean) CoreModule.c.h2.X.get()).booleanValue()) {
                CoreModule.c.h2.D3();
                CoreModule.c.h2.X.put(Boolean.FALSE);
                return;
            }
            return;
        }
        duringCreated(CoreModule.c.h2.U).subscribe(mkd0.H(new e30() { // from class: l.u530
            public final void call(Object obj) {
                C0260a.m4116C2((jn7.a) obj);
            }
        }, new e30() { // from class: l.v530
            public final void call(Object obj) {
                C0260a.m4230b2((Throwable) obj);
            }
        }));
        if (!CoreModule.c.e0.p9().isFemale()) {
            r65.l().o();
        }
        r65.l();
        r65.p();
    }

    /* JADX INFO: renamed from: B7 */
    public final void m4337B7() {
        duringCreated(this.f3279s.distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.i730
            public final void call(Object obj) {
                this.f14415a.m4404S8((TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B8 */
    public final /* synthetic */ void m4338B8(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop, j760 j760Var) {
        if (NullChecker.a(j760Var) && TextUtils.equals((CharSequence) j760Var.a, "intl.text.lovebuzz.show.notify")) {
            TabName tabNameM25147b1 = m25147b1();
            if (NullChecker.a(tabNameM25147b1) && TextUtils.equals(tabNameM25147b1.name(), TabName.Live.name())) {
                return;
            }
        }
        k6w.INSTANCE.e(act(), (ViewGroup) null, j760Var, loveBuzzNotifyUserPop);
    }

    /* JADX INFO: renamed from: B9 */
    public boolean m4339B9() {
        return m4362H9() || m4358G9() || m4351E9() || m4343C9() || m4347D9() || m4335A9() || m4355F9() || m4541z9();
    }

    /* JADX INFO: renamed from: C6 */
    public final void m4340C6() {
        creates(new e30() { // from class: l.j630
            public final void call(Object obj) {
                this.f14945a.m4399R7((Bundle) obj);
            }
        });
        duringCreated(CoreModule.c.e0.fa()).distinctUntilChanged().subscribe(mkd0.H(new e30() { // from class: l.v630
            public final void call(Object obj) {
                C0260a.m4289p5((RegionRule) obj);
            }
        }, new e30() { // from class: l.z630
            public final void call(Object obj) {
                C0260a.m4279n3((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.c.e0.o9()).distinctUntilChanged().doOnNext(new e30() { // from class: l.b730
            public final void call(Object obj) {
                this.f9923a.m4403S7((User) obj);
            }
        }).subscribe();
        duringCreated(mkd0.u(CoreModule.c.n3(), CoreModule.c.f0.Qe(), ife.o().a.map(new w9j() { // from class: l.c730
            public final Object call(Object obj) {
                return Boolean.valueOf(ife.o().k(BannerLoc.get("conversation")));
            }
        }).distinctUntilChanged(), CoreModule.Q().m9040a().m14848c() ? CoreModule.Q().m9044bl() : rx.c.just(new e5s()), this.f3277H, new aaj() { // from class: l.d730
            /* JADX INFO: renamed from: a */
            public final Object m13013a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return vwb.Z((Counter) obj, (ConversationCounter) obj2, (Boolean) obj3, (e5s) obj4);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.e730
            public final void call(Object obj) {
                this.f12430a.m4407T7((knb0) obj);
            }
        }, new e30() { // from class: l.f730
            public final void call(Object obj) {
                C0260a.m4157L2((Throwable) obj);
            }
        }));
        duringCreated(qib0.b0.c.m9018Lh().m11266d()).subscribe(mkd0.H(new e30() { // from class: l.g730
            public final void call(Object obj) {
                this.f13333a.m4410U7((Integer) obj);
            }
        }, new e30() { // from class: l.h730
            public final void call(Object obj) {
                C0260a.m4180Q3((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.c.f0.r2.distinctUntilChanged()).subscribe(mkd0.H(new e30() { // from class: l.k630
            public final void call(Object obj) {
                this.f15421a.m4414V7((Boolean) obj);
            }
        }, new e30() { // from class: l.l630
            public final void call(Object obj) {
                C0260a.m4254h2((Throwable) obj);
            }
        }));
        duringCreated(qib0.b0.c.m9065r9().m25556d()).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.m630
            public final void call(Object obj) {
                this.f16510a.m4419W7((Integer) obj);
            }
        }, new e30() { // from class: l.n630
            public final void call(Object obj) {
                C0260a.m4229a5((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.c.m0.h9()).subscribe(mkd0.G(new e30() { // from class: l.o630
            public final void call(Object obj) {
                this.f17847a.m4424X7((roj0) obj);
            }
        }));
        duringCreated(r6n.m21419f().f19656b.onBackpressureLatest()).filter(new w9j() { // from class: l.q630
            public final Object call(Object obj) {
                InsertConversationsList insertConversationsList = (InsertConversationsList) obj;
                return Boolean.valueOf(NullChecker.a(insertConversationsList) && NullChecker.a(insertConversationsList.users));
            }
        }).map(new w9j() { // from class: l.r630
            public final Object call(Object obj) {
                return Integer.valueOf(vwb.f(((InsertConversationsList) obj).users, new w9j() { // from class: l.w530
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(!((InsertConversationUser) obj2).clicked.booleanValue());
                    }
                }));
            }
        }).distinctUntilChanged().onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.s630
            public final void call(Object obj) {
                this.f20099a.m4429Y7((Integer) obj);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.t630
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.i);
            }
        }).skip(1).filter(new w9j() { // from class: l.u630
            public final Object call(Object obj) {
                return Boolean.valueOf(lip0.i().o());
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.w630
            public final void call(Object obj) {
                lip0.i().q();
            }
        }));
        if (upa.D2()) {
            lifecycle().filter(new w9j() { // from class: l.x630
                public final Object call(Object obj) {
                    return Boolean.valueOf(((c) obj) == c.i);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.y630
                public final void call(Object obj) {
                    C0260a.m4144I3((c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: C7 */
    public final void m4341C7() {
        if (ura.e().d().sa()) {
            duringCreated(CoreModule.c.f0.df().map(new w9j() { // from class: l.d630
                public final Object call(Object obj) {
                    return C0260a.m4166N3((q860) obj);
                }
            }).distinctUntilChanged()).subscribe(mkd0.H(new e30() { // from class: l.h630
                public final void call(Object obj) {
                    CoreModule.c.f0.Pg(((Double) obj).doubleValue());
                }
            }, new e30() { // from class: l.i630
                public final void call(Object obj) {
                    C0260a.m4174P2((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: C8 */
    public final /* synthetic */ void m4342C8(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop, TabName tabName) {
        boolean z = NullChecker.a(tabName) && TextUtils.equals(tabName.name(), TabName.Live.name());
        boolean zQ = loveBuzzNotifyUserPop.q("textBuzz");
        if (z) {
            if (zQ) {
                loveBuzzNotifyUserPop.y();
            }
        } else {
            if (zQ) {
                return;
            }
            j760 j760Var = (j760) j8w.Companion.a().z0().e();
            if (NullChecker.a(j760Var) && TextUtils.equals((CharSequence) j760Var.a, "intl.text.lovebuzz.show.notify")) {
                k6w.INSTANCE.e(act(), (ViewGroup) null, j760Var, loveBuzzNotifyUserPop);
            }
        }
    }

    /* JADX INFO: renamed from: C9 */
    public final boolean m4343C9() {
        return upa.p2() && ((Boolean) CoreModule.c.B0.i0.get()).booleanValue();
    }

    /* JADX INFO: renamed from: D6 */
    public final void m4344D6() {
        if (!upa.k2()) {
            e51.y(new Runnable() { // from class: l.u730
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.U.a(new d30() { // from class: l.a630
                        public final void call() {
                            CoreModule.c.f0.Uf();
                        }
                    });
                }
            });
            return;
        }
        long jLongValue = ((Long) CoreModule.c.f0.h1.get()).longValue();
        if (jLongValue < 1) {
            return;
        }
        CoreModule.c.f0.vp(l9b.C(mqi0.m18550o(), jLongValue), upa.z0(), upa.A0(), true);
    }

    /* JADX INFO: renamed from: D7 */
    public final void m4345D7() {
        if (!upa.e2()) {
            creates(new e30() { // from class: l.j730
                public final void call(Object obj) {
                    this.f14959a.m4408T8((Bundle) obj);
                }
            });
            return;
        }
        duringCreated(this.f3279s.distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.k730
            public final void call(Object obj) {
                this.f15432a.m4411U8((TabName) obj);
            }
        }));
        duringCreated(CoreModule.c.e0.g4).subscribe(mkd0.G(new e30() { // from class: l.m730
            public final void call(Object obj) {
                this.f16742a.m4415V8((String) obj);
            }
        }));
        duringCreated(CoreModule.c.e0.E1).subscribe(mkd0.G(new e30() { // from class: l.n730
            public final void call(Object obj) {
                this.f17349a.m4420W8((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.c.e0.F1).subscribe(mkd0.G(new e30() { // from class: l.o730
            public final void call(Object obj) {
                this.f17858a.m4425X8((roj0) obj);
            }
        }));
        duringCreated(CoreModule.c.e0.o9().map(new w9j() { // from class: l.p730
            public final Object call(Object obj) {
                User user = (User) obj;
                return j760.a(user.getUserInfoForMarryStatus(), Boolean.valueOf(user.isFakeUser()));
            }
        }).distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.q730
            public final void call(Object obj) {
                C0260a.m4135G5((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D8 */
    public final /* synthetic */ void m4346D8(Integer num) {
        m4533x9();
    }

    /* JADX INFO: renamed from: D9 */
    public final boolean m4347D9() {
        return ogl0.L() && xma.e4() && CoreModule.c.m2.I3() > 0 && CoreModule.c.m2.q3();
    }

    /* JADX INFO: renamed from: E6 */
    public final void m4348E6() {
        if (ogl0.H()) {
            CoreModule.c.C2.u3().put(Boolean.TRUE);
            CoreModule.c.C2.y3();
            duringCreated(this.f3279s.distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.s730
                public final void call(Object obj) {
                    C0260a.m4291q3((TabName) obj);
                }
            }));
        } else if (((Boolean) CoreModule.c.C2.u3().get()).booleanValue()) {
            CoreModule.c.C2.u3().put(Boolean.FALSE);
            e51.y(new Runnable() { // from class: l.t730
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.C2.m3();
                }
            });
        }
    }

    /* JADX INFO: renamed from: E7 */
    public View m4349E7(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((NewMainViewModel) ((jq2) this).viewModel).m4066T(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: E8 */
    public final /* synthetic */ void m4350E8() {
        ((NewMainViewModel) ((jq2) this).viewModel).m4043F();
    }

    /* JADX INFO: renamed from: E9 */
    public boolean m4351E9() {
        if (u59.S()) {
            return !((Boolean) uld0.e().g().get()).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: F6 */
    public final void m4352F6() {
        duringCreated(v930.i()).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.a930
            public final void call(Object obj) {
                this.f9333a.m4433Z7((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F7 */
    public final void m4353F7() {
        if (upa.l().enabled) {
            mkd0.z(this.f3275F);
            this.f3275F = duringCreated(v930.h() == TabName.Msg ? rx.c.timer(1500L, TimeUnit.MILLISECONDS).observeOn(jo0.a()).flatMap(new o()).take(1) : mkd0.r(CoreModule.c.f0.ef(), v930.k(), new x9j() { // from class: l.a230
                public final Object call(Object obj, Object obj2) {
                    return new j760((q860) obj, (TabName) obj2);
                }
            }).map(new p())).map(new q()).distinctUntilChanged().subscribe(mkd0.H(new r(), new e30() { // from class: l.b230
                public final void call(Object obj) {
                    C0260a.m4176P4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: F8 */
    public final /* synthetic */ void m4354F8(com.p1.mobile.android.app.c cVar) {
        if (cVar != com.p1.mobile.android.app.c.m) {
            if (cVar == com.p1.mobile.android.app.c.i) {
                ((NewMainViewModel) ((jq2) this).viewModel).m4058N();
            }
        } else {
            ((NewMainViewModel) ((jq2) this).viewModel).m4052K();
            HomeStatisticsHelper.m669z();
            this.f3278r = null;
            CoreModule.c.b2.i3();
        }
    }

    /* JADX INFO: renamed from: F9 */
    public final boolean m4355F9() {
        return CoreModule.c.G2.t3();
    }

    /* JADX INFO: renamed from: G7 */
    public boolean m4356G7(TabName tabName) {
        return NullChecker.b(this.f22824b) && this.f22824b.equals(tabName);
    }

    /* JADX INFO: renamed from: G8 */
    public final /* synthetic */ void m4357G8(com.p1.mobile.android.app.c cVar) {
        if (NullChecker.a(this.f3281u)) {
            if (cVar == com.p1.mobile.android.app.c.j) {
                m4397Q9(false);
            } else if (cVar == com.p1.mobile.android.app.c.i) {
                m4409T9(false);
            }
        }
    }

    /* JADX INFO: renamed from: G9 */
    public final boolean m4358G9() {
        return CoreModule.c.e0.Z7();
    }

    /* JADX INFO: renamed from: H6 */
    public final void m4359H6() {
        if (y19.K()) {
            if (e010.a()) {
                xzc0.x0().D0(act());
            }
            duringCreated(rx.c.combineLatest(m4390O9().distinctUntilChanged(), lifecycle().filter(new w9j() { // from class: l.k930
                public final Object call(Object obj) {
                    return Boolean.valueOf(((c) obj) == c.i && !Act.isFromBackground);
                }
            }), new x9j() { // from class: l.l930
                public final Object call(Object obj, Object obj2) {
                    return new j760((TabName) obj, (c) obj2);
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.m930
                public final void call(Object obj) {
                    this.f16760a.m4443b8((j760) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: H7 */
    public boolean m4360H7() {
        s7m s7mVar = ((jq2) this).viewModel;
        if (s7mVar == null) {
            return false;
        }
        TabName tabName = TabName.Live;
        return ((NewMainViewModel) s7mVar).m4069W(tabName, BottomBarManager.DotType.Dot) || ((NewMainViewModel) ((jq2) this).viewModel).m4070X(tabName);
    }

    /* JADX INFO: renamed from: H8 */
    public final /* synthetic */ rx.c m4361H8(MonetizationConfiguration monetizationConfiguration) {
        return mkd0.r(m4390O9(), lifecycle(), new bs30());
    }

    /* JADX INFO: renamed from: H9 */
    public boolean m4362H9() {
        if (u59.S()) {
            return !((Boolean) uld0.e().j().get()).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: I6 */
    public final void m4363I6() {
        CoreModule.c.f0.mp(true);
    }

    /* JADX INFO: renamed from: I7 */
    public boolean m4364I7() {
        psl pslVarI0 = this.f22823a.fragmentManager().i0(TabName.Card.toString());
        if (NullChecker.a(pslVarI0)) {
            return pslVarI0.mo2537T().getTag().equals("home");
        }
        return false;
    }

    /* JADX INFO: renamed from: I8 */
    public final /* synthetic */ void m4365I8() {
        b83.m11899d().m11911m(act());
    }

    /* JADX INFO: renamed from: I9 */
    public void m4366I9(CharSequence charSequence, String str, Figure figure, String str2, double d2, d30 d30Var) {
        ((NewMainViewModel) ((jq2) this).viewModel).m4102y0(charSequence, str, figure, str2, d2, d30Var);
    }

    /* JADX INFO: renamed from: J6 */
    public final void m4367J6() {
        if (upa.R1()) {
            duringCreated(x4i.c).subscribe(mkd0.H(new g(), new h()));
            duringCreated(m4390O9()).distinctUntilChanged().subscribe(mkd0.G(new i()));
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
    public final void m4368J7() {
        final OMSLauncherInfo oMSLauncherInfo;
        String str;
        Intent intentM9709b;
        List<ResolveInfo> listQueryIntentActivities;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str2;
        String str3;
        boolean zM14794a;
        hc50.m15525e(act());
        try {
            if (!((Boolean) gl5.e.get()).booleanValue()) {
                return;
            }
            gl5.e.put(Boolean.FALSE);
            oMSLauncherInfo = (OMSLauncherInfo) m25148c1().getSerializableExtra("ad_launcher_key");
        } catch (Exception e2) {
            CrashHelper.c(e2);
            try {
                act().getIntent().replaceExtras((Bundle) null);
            } catch (Exception unused) {
            }
            CrashHelper.c(e2);
            oMSLauncherInfo = null;
        }
        if (oMSLauncherInfo == null) {
            return;
        }
        double doubleExtra = m25148c1().getDoubleExtra("ad_launcher_touch_key", -1.0d);
        if (!NullChecker.a(oMSLauncherInfo.ad) || !LauncherView.m9708a(oMSLauncherInfo.ad)) {
            if (TextUtils.isEmpty(oMSLauncherInfo.href)) {
                return;
            }
            m4372K7(oMSLauncherInfo.href);
            return;
        }
        boolean zEquals = TEnum.equals(oMSLauncherInfo.ad.link.action, "wechatMiniProgram");
        ADInfo aDInfo = oMSLauncherInfo.ad;
        if (zEquals) {
            if (TextUtils.isEmpty(aDInfo.link.originalId)) {
                zM14794a = false;
            } else {
                g70 g70Var = g70.INSTANCE;
                OMSADLink oMSADLink = oMSLauncherInfo.ad.link;
                zM14794a = g70Var.m14794a(oMSADLink.originalId, oMSADLink.path);
            }
            zvf0.D("e_oms_open_mini_program_event", "", new j760[]{vwb.Y("if_jump_success", Boolean.valueOf(zM14794a)), vwb.Y("ad_id", oMSLauncherInfo.id), vwb.Y("dsp_id", oMSLauncherInfo.dspId), vwb.Y("mini_program_path", oMSLauncherInfo.ad.link.path), vwb.Y("mini_program_originalid", oMSLauncherInfo.ad.link.originalId)});
        } else {
            if (TEnum.equals(aDInfo.link.action, "tantanDeepLink") && !TextUtils.isEmpty(oMSLauncherInfo.ad.link.url) && oMSLauncherInfo.ad.link.url.startsWith("tantan")) {
                String strReplace = oMSLauncherInfo.ad.link.url;
                if (strReplace.startsWith("tantan://")) {
                    strReplace = strReplace.replace("tantan://", "tantanapp://");
                }
                m4372K7(strReplace);
            } else {
                boolean zEquals2 = TEnum.equals(oMSLauncherInfo.ad.link.action, "deeplink");
                ADInfo aDInfo2 = oMSLauncherInfo.ad;
                if (zEquals2) {
                    intentM9709b = new Intent("android.intent.action.VIEW", Uri.parse(wb50.F(aDInfo2.link.url)));
                    intentM9709b.setFlags(268435456);
                    listQueryIntentActivities = act().getPackageManager().queryIntentActivities(intentM9709b, 65536);
                    int size = listQueryIntentActivities.size();
                    String str4 = oMSLauncherInfo.id;
                    z = true;
                    if (size > 0) {
                        hc50.m15527g(str4, oMSLauncherInfo.ad.link.deeplinkReport.appInstall);
                        hc50.m15528h(oMSLauncherInfo, "appInstall", oMSLauncherInfo.ad.link.deeplinkReport.appInstall);
                        str = "deeplink";
                        e51.H(App.e, new Runnable() { // from class: l.j330
                            @Override // java.lang.Runnable
                            public final void run() {
                                C0260a.m4275m3(oMSLauncherInfo);
                            }
                        }, 5000L);
                        DeeplinkReport deeplinkReport = oMSLauncherInfo.ad.link.deeplinkReport;
                        hc50.m15526f(oMSLauncherInfo, deeplinkReport.success, deeplinkReport.failed);
                        z2 = true;
                    } else {
                        str = "deeplink";
                        hc50.m15527g(str4, oMSLauncherInfo.ad.link.deeplinkReport.appNoInstall);
                        hc50.m15528h(oMSLauncherInfo, "appNoInstall", oMSLauncherInfo.ad.link.deeplinkReport.appNoInstall);
                        intentM9709b = NullChecker.a(oMSLauncherInfo.ad.link.fallbackLink) ? LauncherView.m9709b(act(), wb50.F(oMSLauncherInfo.ad.link.fallbackLink.url), true) : null;
                    }
                } else {
                    str = "deeplink";
                    if (!TEnum.equals(aDInfo2.link.action, "browser") || TextUtils.isEmpty(oMSLauncherInfo.ad.link.url)) {
                        intentM9709b = LauncherView.m9709b(act(), wb50.F(oMSLauncherInfo.ad.link.url), TEnum.equals(oMSLauncherInfo.ad.link.action, "webview"));
                    } else {
                        intentM9709b = new Intent("android.intent.action.VIEW");
                        intentM9709b.addCategory("android.intent.category.BROWSABLE");
                        intentM9709b.setData(Uri.parse(oMSLauncherInfo.ad.link.url));
                    }
                    listQueryIntentActivities = null;
                }
                z2 = false;
                z = false;
            }
            z3 = z2;
            if (NullChecker.a(intentM9709b)) {
                if (TEnum.equals(oMSLauncherInfo.ad.link.action, str)) {
                    zvf0.D("e_start_page_jump_result", "", new j760[]{vwb.Y("jump_url", oMSLauncherInfo.ad.link.url), vwb.Y("jump_action", oMSLauncherInfo.ad.link.action), vwb.Y("ad_id", oMSLauncherInfo.id)});
                    return;
                } else {
                    Boolean bool = Boolean.FALSE;
                    zvf0.D("e_start_page_jump_result", "", new j760[]{vwb.Y("if_jump_success", bool), vwb.Y("jump_types", (Object) null), vwb.Y("jump_url", oMSLauncherInfo.ad.link.url), vwb.Y("jump_action", oMSLauncherInfo.ad.link.action), vwb.Y("if_app_installed", bool), vwb.Y("ad_id", oMSLauncherInfo.id)});
                    return;
                }
            }
            try {
                OmsMerCuryData omsMerCuryData = oMSLauncherInfo.clickMercury;
                z4 = z;
                try {
                    C0836d.m12878b(omsMerCuryData.id, oMSLauncherInfo.viewMercury.id, omsMerCuryData.server, doubleExtra);
                    act().startActivity(intentM9709b);
                    hc50.m15527g(oMSLauncherInfo.id, oMSLauncherInfo.ad.trackingURLs.clickURLs);
                    hc50.m15528h(oMSLauncherInfo, "click", oMSLauncherInfo.ad.trackingURLs.clickURLs);
                    str2 = str;
                    try {
                        if (TEnum.equals(oMSLauncherInfo.ad.link.action, str2)) {
                            j760 j760VarY = vwb.Y("if_jump_success", Boolean.valueOf(z4));
                            if (z4) {
                                str3 = str2;
                            } else {
                                str3 = "webview";
                            }
                            zvf0.D("e_start_page_jump_result", "", new j760[]{j760VarY, vwb.Y("jump_types", str3), vwb.Y("jump_url", oMSLauncherInfo.ad.link.url), vwb.Y("jump_action", oMSLauncherInfo.ad.link.action), vwb.Y("if_app_installed", Boolean.valueOf(z3)), vwb.Y("ad_id", oMSLauncherInfo.id)});
                        } else {
                            zvf0.D("e_start_page_jump_result", "", new j760[]{vwb.Y("jump_url", oMSLauncherInfo.ad.link.url), vwb.Y("jump_action", oMSLauncherInfo.ad.link.action), vwb.Y("ad_id", oMSLauncherInfo.id)});
                        }
                    } catch (ActivityNotFoundException unused2) {
                        if (vwb.J(listQueryIntentActivities)) {
                            CrashHelper.c(new ActivityNotFoundException("Intent: " + intentM9709b.toString()));
                        } else {
                            CrashHelper.c(new ActivityNotFoundException("Intent: " + intentM9709b.toString() + " ResolveList: " + listQueryIntentActivities.get(0).toString()));
                        }
                        if (TEnum.equals(oMSLauncherInfo.ad.link.action, str2)) {
                            zvf0.D("e_start_page_jump_result", "", new j760[]{vwb.Y("jump_url", oMSLauncherInfo.ad.link.url), vwb.Y("jump_action", oMSLauncherInfo.ad.link.action), vwb.Y("ad_id", oMSLauncherInfo.id)});
                            return;
                        }
                        j760 j760VarY2 = vwb.Y("if_jump_success", Boolean.FALSE);
                        if (!z4) {
                            str2 = "webview";
                        }
                        zvf0.D("e_start_page_jump_result", "", new j760[]{j760VarY2, vwb.Y("jump_types", str2), vwb.Y("jump_url", oMSLauncherInfo.ad.link.url), vwb.Y("jump_action", oMSLauncherInfo.ad.link.action), vwb.Y("if_app_installed", Boolean.valueOf(z3)), vwb.Y("ad_id", oMSLauncherInfo.id)});
                        return;
                    }
                } catch (ActivityNotFoundException unused3) {
                    str2 = str;
                    if (vwb.J(listQueryIntentActivities)) {
                        CrashHelper.c(new ActivityNotFoundException("Intent: " + intentM9709b.toString() + " ResolveList: " + listQueryIntentActivities.get(0).toString()));
                    } else {
                        CrashHelper.c(new ActivityNotFoundException("Intent: " + intentM9709b.toString()));
                    }
                    if (TEnum.equals(oMSLauncherInfo.ad.link.action, str2)) {
                        zvf0.D("e_start_page_jump_result", "", new j760[]{vwb.Y("jump_url", oMSLauncherInfo.ad.link.url), vwb.Y("jump_action", oMSLauncherInfo.ad.link.action), vwb.Y("ad_id", oMSLauncherInfo.id)});
                        return;
                    }
                    j760 j760VarY3 = vwb.Y("if_jump_success", Boolean.FALSE);
                    if (!z4) {
                        str2 = "webview";
                    }
                    zvf0.D("e_start_page_jump_result", "", new j760[]{j760VarY3, vwb.Y("jump_types", str2), vwb.Y("jump_url", oMSLauncherInfo.ad.link.url), vwb.Y("jump_action", oMSLauncherInfo.ad.link.action), vwb.Y("if_app_installed", Boolean.valueOf(z3)), vwb.Y("ad_id", oMSLauncherInfo.id)});
                    return;
                }
            } catch (ActivityNotFoundException unused4) {
                z4 = z;
            }
        }
        str = "deeplink";
        listQueryIntentActivities = null;
        z2 = false;
        z = false;
        z3 = z2;
        if (NullChecker.a(intentM9709b)) {
            if (TEnum.equals(oMSLauncherInfo.ad.link.action, str)) {
                zvf0.D("e_start_page_jump_result", "", new j760[]{vwb.Y("jump_url", oMSLauncherInfo.ad.link.url), vwb.Y("jump_action", oMSLauncherInfo.ad.link.action), vwb.Y("ad_id", oMSLauncherInfo.id)});
                return;
            } else {
                Boolean bool2 = Boolean.FALSE;
                zvf0.D("e_start_page_jump_result", "", new j760[]{vwb.Y("if_jump_success", bool2), vwb.Y("jump_types", (Object) null), vwb.Y("jump_url", oMSLauncherInfo.ad.link.url), vwb.Y("jump_action", oMSLauncherInfo.ad.link.action), vwb.Y("if_app_installed", bool2), vwb.Y("ad_id", oMSLauncherInfo.id)});
                return;
            }
        }
        OmsMerCuryData omsMerCuryData2 = oMSLauncherInfo.clickMercury;
        z4 = z;
        C0836d.m12878b(omsMerCuryData2.id, oMSLauncherInfo.viewMercury.id, omsMerCuryData2.server, doubleExtra);
        act().startActivity(intentM9709b);
        hc50.m15527g(oMSLauncherInfo.id, oMSLauncherInfo.ad.trackingURLs.clickURLs);
        hc50.m15528h(oMSLauncherInfo, "click", oMSLauncherInfo.ad.trackingURLs.clickURLs);
        str2 = str;
        if (TEnum.equals(oMSLauncherInfo.ad.link.action, str2)) {
            j760 j760VarY4 = vwb.Y("if_jump_success", Boolean.valueOf(z4));
            if (z4) {
                str3 = str2;
            } else {
                str3 = "webview";
            }
            zvf0.D("e_start_page_jump_result", "", new j760[]{j760VarY4, vwb.Y("jump_types", str3), vwb.Y("jump_url", oMSLauncherInfo.ad.link.url), vwb.Y("jump_action", oMSLauncherInfo.ad.link.action), vwb.Y("if_app_installed", Boolean.valueOf(z3)), vwb.Y("ad_id", oMSLauncherInfo.id)});
        } else {
            zvf0.D("e_start_page_jump_result", "", new j760[]{vwb.Y("jump_url", oMSLauncherInfo.ad.link.url), vwb.Y("jump_action", oMSLauncherInfo.ad.link.action), vwb.Y("ad_id", oMSLauncherInfo.id)});
        }
    }

    /* JADX INFO: renamed from: J8 */
    public final /* synthetic */ void m4369J8(j760 j760Var) {
        if (((TabName) j760Var.a) == TabName.Card && b83.m11899d().m11908j()) {
            e51.G(new Runnable() { // from class: l.a530
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9251a.m4365I8();
                }
            });
        } else {
            b83.m11899d().m11901b();
        }
    }

    /* JADX INFO: renamed from: J9 */
    public void m4370J9() {
        if (zch0.m25654a().m25656c()) {
            return;
        }
        String strZ = NullChecker.a(CoreBusinessModule.c) ? CoreBusinessModule.c.z() : "";
        User userP9 = CoreModule.c.e0.p9();
        String strM23417m = vjf0.m23406e().m23417m(strZ, NullChecker.a(userP9) ? userP9.publicId : "", vjf0.m23406e().m23414i(), "", false);
        if (TextUtils.isEmpty(strM23417m)) {
            return;
        }
        Intent intentM10511m2 = WebViewDialogAct.m10511m2(CoreModule.b, "", strM23417m, true, true);
        intentM10511m2.putExtra("hideNavigationBar", true);
        intentM10511m2.putExtra("skipLoading", true);
        act().startActivity(intentM10511m2);
    }

    /* JADX INFO: renamed from: K6 */
    public final void m4371K6() {
        if (upa.N3()) {
            duringCreated(v930.k().distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.o330
                public final void call(Object obj) {
                    this.f17816a.m4447c8((TabName) obj);
                }
            }));
            duringCreated(CoreModule.Q().m9017L7()).subscribe(mkd0.G(new e30() { // from class: l.z330
                public final void call(Object obj) {
                    f4v.m14251f().m14260n(CoreModule.H().userId());
                }
            }));
        }
    }

    /* JADX INFO: renamed from: K7 */
    public final void m4372K7(String str) {
        if (TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(w2e0.g) && w2e0.g.startsWith("tantan")) {
                j2e0.m(act(), Uri.parse(w2e0.g));
            }
            w2e0.g = null;
            return;
        }
        if (str.startsWith("tantan")) {
            j2e0.m(act(), Uri.parse(str));
        } else {
            act().startActivity(AccessTokenWebViewAct.m10482Z1(act(), "", str));
        }
    }

    /* JADX INFO: renamed from: K8 */
    public final /* synthetic */ void m4373K8(Boolean bool) {
        m4517t9(TabName.Me, m4339B9());
    }

    /* JADX INFO: renamed from: K9 */
    public final void m4374K9() {
        vve0.e.a(App.e).a().c(-2147483648L, new l());
    }

    /* JADX INFO: renamed from: L6 */
    public final void m4375L6() {
        if (((Boolean) CoreModule.c.e0.a1.get()).booleanValue()) {
            return;
        }
        CoreModule.c.e0.a1.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: L7 */
    public final void m4376L7() {
        if (!TextUtils.isEmpty(w2e0.g) && w2e0.g.startsWith("tantan") && w2e0.g.contains("https://subscribe.tantanapp.com")) {
            Uri uri = Uri.parse(w2e0.g.trim());
            final String strTrim = uri.getQueryParameter("url") != null ? uri.getQueryParameter("url").trim() : "";
            final boolean zEquals = "true".equals(uri.getQueryParameter("openExternalURL"));
            if (TextUtils.isEmpty(strTrim)) {
                w2e0.g = null;
            } else {
                duringCreated(CoreModule.c.C1.c3()).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.m130
                    public final void call(Object obj) {
                        this.f16480a.m4430Y8(zEquals, strTrim, (IntlThirdQuickLoginEnvelope) obj);
                    }
                }, new e30() { // from class: l.n130
                    public final void call(Object obj) {
                        C0260a.m4178Q1((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: L8 */
    public final /* synthetic */ void m4377L8(Boolean bool) {
        m4517t9(TabName.Me, m4339B9());
    }

    /* JADX INFO: renamed from: L9 */
    public void m4378L9(boolean z) {
        if (z && (!((Boolean) CoreModule.c.e0.F4.get()).booleanValue() || !CoreModule.c.e0.b8(false) || (CoreModule.c.e0.p9().settings.getSettingGroup() != null && CoreModule.c.e0.p9().settings.getSettingGroup().marriage != null && CoreModule.c.e0.p9().settings.getSettingGroup().marriage.closeMode))) {
            act().startActivity(MarryInfoAuditStatusAct.Z1(act(), "mode_switching"));
            return;
        }
        CoreModule.c.e0.Z3.put(z ? "marryMode" : "loveMode");
        CoreModule.c.e0.F1.onNext(roj0.a);
        p09.w().L(this.f22824b, z);
    }

    /* JADX INFO: renamed from: M6 */
    public final void m4379M6() {
        duringCreated(act().iap().h()).subscribe(mkd0.H(new e30() { // from class: l.o430
            public final void call(Object obj) {
                this.f17826a.m4451d8((a) obj);
            }
        }, new e30() { // from class: l.p430
            public final void call(Object obj) {
                C0260a.m4194T1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M7 */
    public final void m4380M7() {
        if (!upa.e2() || ((Boolean) CoreModule.c.e0.f4.get()).booleanValue()) {
            return;
        }
        CoreModule.c.e0.f4.put(Boolean.TRUE);
        if (this.f22828f) {
            return;
        }
        User userP9 = CoreModule.c.e0.p9();
        Purpose purpose = (NullChecker.a(userP9.profile.extensions) && NullChecker.a(userP9.profile.extensions.basic) && !vwb.J(userP9.profile.extensions.basic.friendPurpose) && NullChecker.a(userP9.profile.extensions.basic.friendPurpose.get(0))) ? (Purpose) userP9.profile.extensions.basic.friendPurpose.get(0) : null;
        if (!TextUtils.equals((CharSequence) CoreModule.c.e0.Z3.get(), "marryMode") && TEnum.equals(purpose, "marriage")) {
            act().startActivity(MarryInfoAuditStatusAct.Z1(Y(), "mode_switching"));
        }
    }

    /* JADX INFO: renamed from: M8 */
    public final /* synthetic */ void m4381M8(roj0 roj0Var) {
        if (!ConnectivityReceiver.g() || TextUtils.isEmpty(vjf0.m23406e().m23416k())) {
            return;
        }
        m4370J9();
    }

    /* JADX INFO: renamed from: M9 */
    public final void m4382M9() {
        Act act = this.f22823a;
        if (act == null) {
            return;
        }
        psl pslVarI0 = act.fragmentManager().i0(TabName.Card.toString());
        if (pslVarI0 instanceof psl) {
            psl pslVar = pslVarI0;
            NewTanFragTag newTanFragTag = NewTanFragTag.HOME;
            pslVar.mo2528I2(newTanFragTag);
            pslVar.mo2550n2(newTanFragTag);
            CoreModule.c.m0.j2.onNext(roj0.a);
        }
    }

    /* JADX INFO: renamed from: N6 */
    public final void m4383N6() {
        if (NullChecker.a(CoreModule.c.e0.p9()) && u59.S()) {
            if (CoreModule.c.e0.p9().isSVIP()) {
                CoreModule.c.j0.N4(ProductCategory.get("svip"));
            } else if (CoreModule.c.e0.p9().isVIP()) {
                CoreModule.c.j0.N4(ProductCategory.get("vip"));
            }
            CoreModule.c.j0.N4(ProductCategory.get("seeWhoLikedMe"));
        }
    }

    /* JADX INFO: renamed from: N7 */
    public final /* synthetic */ void m4384N7(Boolean bool) {
        if (bool.booleanValue()) {
            m4416V9(true);
        }
    }

    /* JADX INFO: renamed from: N8 */
    public final /* synthetic */ void m4385N8(NetworkInfo networkInfo) {
        if (TextUtils.isEmpty(vjf0.m23406e().m23416k())) {
            return;
        }
        if (!vjf0.m23406e().m23413g()) {
            m4370J9();
        } else {
            if (vjf0.m23406e().m23418n()) {
                return;
            }
            vjf0.m23406e().m23428x().onNext(Boolean.FALSE);
            m4370J9();
        }
    }

    /* JADX INFO: renamed from: N9 */
    public final void m4386N9() {
        Act act = this.f22823a;
        if (act == null) {
            return;
        }
        psl pslVarI0 = act.fragmentManager().i0(TabName.Card.toString());
        if (pslVarI0 instanceof psl) {
            psl pslVar = pslVarI0;
            NewTanFragTag newTanFragTag = NewTanFragTag.MARRY_MODE;
            pslVar.mo2528I2(newTanFragTag);
            pslVar.mo2550n2(newTanFragTag);
            CoreModule.c.e0.M4.put(2);
        }
    }

    /* JADX INFO: renamed from: O6 */
    public final void m4387O6() {
        if (u59.T() || upa.I2()) {
            CoreModule.c.r0.J6();
            duringCreated(new v9j() { // from class: l.w230
                public final Object call() {
                    return CoreModule.c.r0.M6();
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.x230
                public final void call(Object obj) {
                    C0260a.m4179Q2((GreetingSummary) obj);
                }
            }, new e30() { // from class: l.y230
                public final void call(Object obj) {
                    C0260a.m4152K2((Throwable) obj);
                }
            }));
            duringCreated(new v9j() { // from class: l.z230
                public final Object call() {
                    return CoreModule.c.r0.L6();
                }
            }).filter(new w9j() { // from class: l.a330
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.a((GreetingSummary) obj));
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.b330
                public final void call(Object obj) {
                    CoreModule.c.r0.F5((GreetingSummary) obj, "fake_conversation_anonymous_greeting");
                }
            }, new e30() { // from class: l.c330
                public final void call(Object obj) {
                    C0260a.m4120D2((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: O7 */
    public final /* synthetic */ void m4388O7(j760 j760Var) {
        Objects.toString(j760Var.a);
        if (((Integer) j760Var.a).intValue() > 0) {
            mrm.o().C(act());
        }
        mrm.o().D(((Integer) j760Var.a).intValue());
        mrm.o().E((Integer) j760Var.b);
    }

    /* JADX INFO: renamed from: O9 */
    public rx.c<TabName> m4390O9() {
        return this.f3279s;
    }

    /* JADX INFO: renamed from: P6 */
    public final void m4391P6() {
        if (upa.V1()) {
            if (!((Boolean) com.p1.mobile.putong.core.api.e.F0.get()).booleanValue()) {
                com.p1.mobile.putong.core.api.e.F0.put(Boolean.TRUE);
            }
        } else if (((Boolean) com.p1.mobile.putong.core.api.e.F0.get()).booleanValue()) {
            CoreModule.c.f0.If();
        }
        if (((Boolean) com.p1.mobile.putong.core.api.g.T2.get()).booleanValue()) {
            CoreModule.c.f0.Gf();
        }
    }

    /* JADX INFO: renamed from: P7 */
    public final /* synthetic */ void m4392P7() {
        ((NewMainViewModel) ((jq2) this).viewModel).m4049I0();
    }

    /* JADX INFO: renamed from: P9 */
    public TabName m4394P9() {
        return (TabName) this.f3279s.e();
    }

    /* JADX INFO: renamed from: Q6 */
    public final void m4395Q6() {
        if (upa.V1()) {
            CoreModule.c.g0.R8();
            CoreModule.c.g0.U8();
        }
    }

    /* JADX INFO: renamed from: Q7 */
    public final /* synthetic */ void m4396Q7() {
        r70.g().h(act(), new Runnable() { // from class: l.g630
            @Override // java.lang.Runnable
            public final void run() {
                this.f13321a.m4392P7();
            }
        });
    }

    /* JADX INFO: renamed from: Q9 */
    public final void m4397Q9(boolean z) {
        BuzzComboFrag buzzComboFrag = this.f3281u;
        if (buzzComboFrag == null) {
            return;
        }
        if (buzzComboFrag instanceof BuzzComboFrag) {
            buzzComboFrag.M4();
            return;
        }
        String tag = buzzComboFrag.getTag();
        if (!ddj0.b(tag) || !tag.equals(TabName.Card.toString())) {
            this.f3281u.J4().k();
        } else if (z) {
            HomeStatisticsHelper.m639D(false);
        }
    }

    /* JADX INFO: renamed from: R6 */
    public final void m4398R6() {
        p09.w().G(act());
        if (vy8.j() || vy8.l() || vy8.k()) {
            p09.w().K(act());
            lqf.a().b(ExtraActLifecycle.onResumeFromBackground, new e30() { // from class: l.i330
                public final void call(Object obj) {
                    this.f14387a.m4455e8((Act) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: R7 */
    public final /* synthetic */ void m4399R7(Bundle bundle) {
        m4533x9();
    }

    /* JADX INFO: renamed from: R8 */
    public final /* synthetic */ void m4400R8(Bundle bundle) {
        qib0.b0.a.checkSmartLockSave(act());
    }

    /* JADX INFO: renamed from: R9 */
    public final void m4401R9(TabName tabName, boolean z, boolean z2) {
        TabName tabName2;
        wb3 wb3VarM9035Ys;
        s7m s7mVar = ((jq2) this).viewModel;
        if (s7mVar != null && z && tabName == (tabName2 = TabName.Live)) {
            boolean zM4069W = ((NewMainViewModel) s7mVar).m4069W(tabName2, BottomBarManager.DotType.Dot);
            boolean zM4070X = ((NewMainViewModel) ((jq2) this).viewModel).m4070X(tabName2);
            boolean z3 = false;
            boolean z4 = (zM4069W || zM4070X) ? false : true;
            boolean z5 = z2 && !zM4070X;
            if (!z2 && !zM4069W) {
                z3 = true;
            }
            if ((z4 || z5 || z3) && (((jq2) this).lifecycleProviderImpl instanceof NewMainAct) && (wb3VarM9035Ys = CoreModule.Q().m9035Ys()) != null) {
                sdt.m22108c((String) ((jq2) this).lifecycleProviderImpl.m3875Y5().a, wb3VarM9035Ys.m24043a(), wb3VarM9035Ys.f21984b, wb3VarM9035Ys.f21985c, wb3VarM9035Ys.f21986d);
            }
        }
    }

    /* JADX INFO: renamed from: S6 */
    public final void m4402S6() {
        if ((upa.G2() || upa.H2() || upa.s1()) && !myf.m18690L()) {
            boolean z = upa.G2() || upa.H2();
            boolean zS1 = upa.s1();
            if (z) {
                duringCreated(CoreModule.c.e0.t7().filter(new u()).filter(new t())).subscribe(mkd0.H(new a(zS1), new b()));
            }
            duringCreated(v930.k().filter(new w9j() { // from class: l.w430
                public final Object call(Object obj) {
                    TabName tabName = (TabName) obj;
                    return Boolean.valueOf(tabName == TabName.Card || tabName == TabName.Me);
                }
            }).distinctUntilChanged()).subscribe(mkd0.H(new c(zS1, z), new e30() { // from class: l.x430
                public final void call(Object obj) {
                    C0260a.m4185R2((Throwable) obj);
                }
            }));
            duringCreated(CoreModule.c.e0.o9().map(new w9j() { // from class: l.y430
                public final Object call(Object obj) {
                    return ((Media) ((User) obj).pictures.get(0)).url;
                }
            }).distinctUntilChanged().skip(1)).subscribe(mkd0.G(new d()));
            duringCreated(CoreModule.c.e0.o9().map(new w9j() { // from class: l.z430
                public final Object call(Object obj) {
                    return Boolean.valueOf(((User) obj).isAudit());
                }
            }).distinctUntilChanged()).subscribe(mkd0.G(new e()));
        }
    }

    /* JADX INFO: renamed from: S7 */
    public final /* synthetic */ void m4403S7(User user) {
        ((NewMainViewModel) ((jq2) this).viewModel).m4055L0(user.riskAuditUser(CoreModule.K().getUserById("fake_risk_audit_default_" + ((DbObject) user).id)).fp().profileSmall().formatted());
        m4421W9();
    }

    /* JADX INFO: renamed from: S8 */
    public final /* synthetic */ void m4404S8(TabName tabName) {
        ((NewMainViewModel) ((jq2) this).viewModel).m4090m0(tabName);
        if (tabName == TabName.Msg) {
            CoreModule.c.f0.cp();
            if (upa.x3() && !((Boolean) CoreModule.c.e0.v3.get()).booleanValue()) {
                CoreModule.c.e0.v3.put(Boolean.TRUE);
                lsi0.y("您上线后会为您通知好友，如不需要可到隐私通知里关闭功能");
            }
        } else if (tabName == TabName.Meet) {
            IntlTribeMeetFrag intlTribeMeetFrag = (Frag) this.f22823a.fragmentManager().i0(tabName.toString());
            if (intlTribeMeetFrag instanceof IntlTribeMeetFrag) {
                intlTribeMeetFrag.m3511O4();
            }
        }
        TabName tabName2 = this.f3276G;
        TabName tabName3 = TabName.Live;
        if (tabName2 == tabName3 && tabName != tabName3) {
            m4513s9();
        }
        this.f3276G = tabName;
    }

    /* JADX INFO: renamed from: S9 */
    public final void m4405S9(boolean z) {
        if (m.f3302a[this.f22824b.ordinal()] == 5 && upa.o2() && this.f3270A && z) {
            zvf0.r("e_mytab_incomplete", "p_suggest_users_home_view");
        }
    }

    /* JADX INFO: renamed from: T6 */
    public final void m4406T6() {
        if ((upa.G2() || upa.H2() || upa.s1()) && !myf.m18690L()) {
            duringCreated(CoreModule.c.C0.x3().timeout(5L, TimeUnit.SECONDS).materialize().observeOn(jo0.a()).first()).subscribe(mkd0.G(new e30() { // from class: l.s230
                public final void call(Object obj) {
                    this.f20078a.m4459f8((Notification) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: T7 */
    public final /* synthetic */ void m4407T7(knb0 knb0Var) {
        Counter counter = (Counter) knb0Var.a;
        ConversationCounter conversationCounter = (ConversationCounter) knb0Var.b;
        if (conversationCounter == null) {
            return;
        }
        Boolean bool = (Boolean) knb0Var.c;
        int iE7 = ura.e().d().E7(conversationCounter.conversations);
        int iB = wjc0.b(counter, conversationCounter, bool);
        CoreModule.c.f0.t2.onNext(new xaj0(Integer.valueOf(iE7), Integer.valueOf(iB - iE7), Integer.valueOf(conversationCounter.conversations.unseen)));
        int iIntValue = iB + ((e5s) knb0Var.d).f12384g + ((Integer) qib0.b0.c.m9018Lh().m11266d().e()).intValue() + ((Integer) CoreModule.Q().m9065r9().m25556d().e()).intValue();
        if (i36.g().n()) {
            iIntValue += i36.g().k();
        }
        if (upa.D2()) {
            hu40.a().e(iIntValue);
        }
        int iMax = Math.max(iIntValue - CoreModule.c.f0.s2, 0);
        ((NewMainViewModel) ((jq2) this).viewModel).m4093p0(TabName.Msg, iMax > 0 || Boolean.TRUE.equals(CoreModule.c.f0.r2.e()));
        CoreModule.c.f0.q2.onNext(j760.a(Integer.valueOf(iMax), 0));
    }

    /* JADX INFO: renamed from: T8 */
    public final /* synthetic */ void m4408T8(Bundle bundle) {
        ((NewMainViewModel) ((jq2) this).viewModel).f3239a.setDrawerLockMode(1);
    }

    /* JADX INFO: renamed from: T9 */
    public final void m4409T9(boolean z) {
        BuzzComboFrag buzzComboFrag = this.f3281u;
        if (buzzComboFrag == null) {
            return;
        }
        if (buzzComboFrag instanceof BuzzComboFrag) {
            buzzComboFrag.N4();
            return;
        }
        String tag = buzzComboFrag.getTag();
        if (!ddj0.b(tag) || !tag.equals(TabName.Card.toString())) {
            this.f3281u.J4().l();
            return;
        }
        if (z) {
            HomeStatisticsHelper.m639D(true);
            if (HomeStatisticsHelper.m655l()) {
                HomeStatisticsHelper.m638C(false);
                HomeStatisticsHelper.m665v();
                HomeStatisticsHelper.m658o();
                HomeStatisticsHelper.m638C(true);
                HomeStatisticsHelper.m666w();
            }
        }
    }

    /* JADX INFO: renamed from: U7 */
    public final /* synthetic */ void m4410U7(Integer num) {
        this.f3277H.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: U8 */
    public final /* synthetic */ void m4411U8(TabName tabName) {
        if (upa.e2() && tabName == TabName.Card) {
            ((NewMainViewModel) ((jq2) this).viewModel).f3239a.setDrawerLockMode(0);
        } else {
            ((NewMainViewModel) ((jq2) this).viewModel).f3239a.setDrawerLockMode(1);
        }
    }

    /* JADX INFO: renamed from: U9 */
    public final void m4412U9(String str, boolean z) {
        int i2 = m.f3302a[this.f22824b.ordinal()];
        if (i2 == 1) {
            o6j0.c("e_suggest_users_home", str, new o6j0.a[]{o6j0.a.h("click_change", z ? "change" : "click")});
            return;
        }
        if (i2 == 2) {
            o6j0.c("e_messages", str, new o6j0.a[]{o6j0.a.h("click_change", z ? "change" : "click")});
            NewMainViewModel newMainViewModel = (NewMainViewModel) ((jq2) this).viewModel;
            TabName tabName = TabName.Msg;
            if (newMainViewModel.m4069W(tabName, BottomBarManager.DotType.Dot) || ((NewMainViewModel) ((jq2) this).viewModel).m4070X(tabName)) {
                zvf0.s("e_red_dot_message", "p_suggest_users_home_view", u4e.m22746c("red_dot", "red_dot_normal", "message_tab", "swipe_page", "sub_page_unread"));
                return;
            } else {
                zvf0.s("e_red_dot_message", "p_suggest_users_home_view", u4e.m22747d());
                return;
            }
        }
        if (i2 != 4) {
            if (i2 == 5) {
                o6j0.c("e_navigation", str, new o6j0.a[]{o6j0.a.h("click_change", z ? "change" : "click")});
                return;
            }
            if (i2 == 6) {
                u9w.INSTANCE.i();
                p9w.INSTANCE.z();
                return;
            } else {
                if (i2 != 8) {
                    return;
                }
                o6j0.c("e_intl_tab_meet", "p_intl_meet_view", new o6j0.a[0]);
                return;
            }
        }
        o6j0.a aVarH = o6j0.a.h("click_change", z ? "change" : "click");
        NewMainViewModel newMainViewModel2 = (NewMainViewModel) ((jq2) this).viewModel;
        TabName tabName2 = TabName.Moment;
        BottomBarManager.DotType dotType = BottomBarManager.DotType.Dot;
        o6j0.c("e_explore", str, new o6j0.a[]{aVarH, o6j0.a.h("red_dot", (newMainViewModel2.m4069W(tabName2, dotType) || ((NewMainViewModel) ((jq2) this).viewModel).m4070X(tabName2)) ? "true" : "false"), o6j0.a.h("tab_state", this.f3273D ? "refresh" : "explore")});
        if (((NewMainViewModel) ((jq2) this).viewModel).m4069W(tabName2, dotType) || ((NewMainViewModel) ((jq2) this).viewModel).m4070X(tabName2)) {
            zvf0.s("e_red_dot_explore", "p_suggest_users_home_view", u4e.m22746c("red_dot", "red_dot_normal", "explore_tab", "swipe_page", "sub_page_unread"));
        } else {
            zvf0.s("e_red_dot_explore", "p_suggest_users_home_view", u4e.m22747d());
        }
    }

    /* JADX INFO: renamed from: V6 */
    public final void m4413V6() {
        if (y19.M()) {
            duringCreated(new v9j() { // from class: l.a830
                public final Object call() {
                    return Act.foreground();
                }
            }, false).filter(new w9j() { // from class: l.b830
                public final Object call(Object obj) {
                    return Boolean.valueOf(r9m.r().z());
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.c830
                public final void call(Object obj) {
                    C0260a.m4298s2((Act.r) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: V7 */
    public final /* synthetic */ void m4414V7(Boolean bool) {
        this.f3277H.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: V8 */
    public final /* synthetic */ void m4415V8(String str) {
        z2x.d(act(), str);
    }

    /* JADX INFO: renamed from: V9 */
    public final void m4416V9(boolean z) {
        duringCreated(z ? CoreModule.c.Q0.y3() : CoreModule.c.Q0.z3()).take(1).subscribe(mkd0.G(new e30() { // from class: l.i430
            public final void call(Object obj) {
                this.f14394a.m4448c9((TtcMigrateDisplayData) obj);
            }
        }));
        CoreModule.c.Q0.p3(z);
    }

    /* JADX INFO: renamed from: W5 */
    public final void m4417W5() {
        if (upa.e2()) {
            if (CoreModule.c.e0.p9().settings.getSettingGroup() != null && CoreModule.c.e0.p9().settings.getSettingGroup().marriage == null) {
                CrashHelper.c(new RuntimeException("core.user.me_().settings.getSettingGroup().marriage == null"));
                return;
            }
            if (CoreModule.c.e0.p9().settings.getSettingGroup() != null && CoreModule.c.e0.p9().settings.getSettingGroup().marriage != null && CoreModule.c.e0.p9().settings.getSettingGroup().marriage.closeMode) {
                CoreModule.c.e0.Z3.put("loveMode");
                CoreModule.c.e0.M4.put(2);
                return;
            }
            if (((Integer) CoreModule.c.e0.M4.get()).intValue() == 2) {
                return;
            }
            if (((Integer) CoreModule.c.e0.M4.get()).intValue() != 0) {
                if (((Integer) CoreModule.c.e0.M4.get()).intValue() == 1) {
                    CoreModule.c.e0.M4.put(2);
                    CoreModule.c.e0.Z3.put("marryMode");
                    return;
                }
                return;
            }
            if (TextUtils.equals((CharSequence) CoreModule.c.e0.Z3.get(), "marryMode")) {
                CoreModule.c.e0.M4.put(2);
            } else if (!CoreModule.c.e0.b8(false)) {
                duringCreated(rx.c.combineLatest(CoreModule.c.B0.j4().distinctUntilChanged(), CoreModule.c.e0.o9().distinctUntilChanged(), new x9j() { // from class: l.g830
                    public final Object call(Object obj, Object obj2) {
                        return new j760((VerificationCenter) obj, (User) obj2);
                    }
                })).subscribe(mkd0.G(new e30() { // from class: l.i830
                    public final void call(Object obj) {
                        C0260a.m4312v4((j760) obj);
                    }
                }));
            } else {
                CoreModule.c.e0.M4.put(2);
                CoreModule.c.e0.Z3.put("marryMode");
            }
        }
    }

    /* JADX INFO: renamed from: W6 */
    public final void m4418W6() {
        act().duringCreated(CoreModule.c.j1.d(), false).filter(new w9j() { // from class: l.d230
            public final Object call(Object obj) {
                return this.f10848a.m4463g8((CoreInnerPush.a) obj);
            }
        }).flatMap(new w9j() { // from class: l.e230
            public final Object call(Object obj) {
                return this.f12162a.m4468h8((CoreInnerPush.a) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.f230
            public final void call(Object obj) {
                this.f12752a.m4476j8((CoreInnerPush.a) obj);
            }
        }, new e30() { // from class: l.g230
            public final void call(Object obj) {
                C0260a.m4210W1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W7 */
    public final /* synthetic */ void m4419W7(Integer num) {
        this.f3277H.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: W8 */
    public final /* synthetic */ void m4420W8(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        s7m s7mVar = ((jq2) this).viewModel;
        if (!zBooleanValue) {
            ((NewMainViewModel) s7mVar).f3239a.d(3);
        } else {
            ((NewMainViewModel) s7mVar).f3239a.I(3);
            ((NewMainViewModel) ((jq2) this).viewModel).m4063P0();
        }
    }

    /* JADX INFO: renamed from: W9 */
    public final void m4421W9() {
        if (!CoreModule.c.e0.Z7()) {
            e0.a().f();
        } else if (CoreModule.c.e0.k8() || CoreModule.c.e0.W7()) {
            e0.a().f();
        }
    }

    /* JADX INFO: renamed from: X5 */
    public void m4422X5(TabName tabName) {
        mo4436a1(tabName, false);
    }

    /* JADX INFO: renamed from: X6 */
    public final void m4423X6() {
        CoreModule.c.x0.I4();
        duringCreated(CoreModule.c.x0.q4()).subscribe(mkd0.H(new e30() { // from class: l.u830
            public final void call(Object obj) {
                this.f21014a.m4480k8((Boolean) obj);
            }
        }, new e30() { // from class: l.v830
            public final void call(Object obj) {
                C0260a.m4159L5((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.c.x0.r4()).subscribe(mkd0.H(new e30() { // from class: l.w830
            public final void call(Object obj) {
                this.f21944a.m4484l8((Long) obj);
            }
        }, new e30() { // from class: l.x830
            public final void call(Object obj) {
                C0260a.m4238d2((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.c.C0.x3().distinctUntilChanged()).subscribe(mkd0.H(new e30() { // from class: l.y830
            public final void call(Object obj) {
                this.f22929a.m4488m8((List) obj);
            }
        }, new e30() { // from class: l.z830
            public final void call(Object obj) {
                C0260a.m4253g5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X7 */
    public final /* synthetic */ void m4424X7(roj0 roj0Var) {
        if (m4356G7(TabName.Msg)) {
            CoreModule.c.u0.Z6(0L);
        }
    }

    /* JADX INFO: renamed from: X8 */
    public final /* synthetic */ void m4425X8(roj0 roj0Var) {
        if (!((String) CoreModule.c.e0.Z3.get()).equals("marryMode")) {
            m4382M9();
        } else {
            m4386N9();
            e51.H(((NewMainViewModel) ((jq2) this).viewModel).act(), new f(), 10L);
        }
    }

    /* JADX INFO: renamed from: X9 */
    public final void m4426X9() {
        if (n3b0.q() && ((Long) CoreModule.c.u0.k0.get()).longValue() == 0 && ((Long) CoreModule.c.u0.k0.get()).longValue() == 0) {
            CoreModule.c.u0.k0.put(Long.valueOf(qib0.H.guessedCurrentServerTime()));
        }
    }

    /* JADX INFO: renamed from: Y5 */
    public final void m4427Y5() {
        if (wf6.m24194f()) {
            CoreModule.c.f0.gn();
        }
    }

    /* JADX INFO: renamed from: Y6 */
    public final void m4428Y6() {
        if (TEnum.equals(qib0.h0, "indonesia")) {
            final String str = (String) CoreModule.c.b2.R.get();
            duringCreated(CoreModule.c.b2.e3()).subscribe(mkd0.H(new e30() { // from class: l.j230
                public final void call(Object obj) {
                    this.f14917a.m4492n8(str, (String) obj);
                }
            }, new e30() { // from class: l.k230
                public final void call(Object obj) {
                    C0260a.m4142I1((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Y7 */
    public final /* synthetic */ void m4429Y7(Integer num) {
        this.f3277H.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: Y8 */
    public final /* synthetic */ void m4430Y8(boolean z, String str, IntlThirdQuickLoginEnvelope intlThirdQuickLoginEnvelope) {
        HashMap map = new HashMap();
        map.put("step", "4");
        map.put("available", "true");
        map.put(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_CODE, intlThirdQuickLoginEnvelope.meta.code + "");
        map.put("tracker", "");
        if (intlThirdQuickLoginEnvelope.meta.code != 200000) {
            lsi0.h(R.string.k9);
        } else if (z) {
            m4489m9(act(), str, intlThirdQuickLoginEnvelope.data.code);
        } else {
            m4493n9(act(), str, intlThirdQuickLoginEnvelope.data.code);
        }
        w2e0.g = null;
    }

    /* JADX INFO: renamed from: Z5 */
    public final void m4431Z5() {
        act().postDelayed(new k(), 1000L);
    }

    /* JADX INFO: renamed from: Z6 */
    public final void m4432Z6() {
        if (CoreModule.o.b().Eh()) {
            duringCreated(this.f3279s.distinctUntilChanged().filter(new w9j() { // from class: l.v330
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Msg);
                }
            }).map(new w9j() { // from class: l.w330
                public final Object call(Object obj) {
                    return CoreModule.c.u0.Y6();
                }
            }).flatMap(new w9j() { // from class: l.x330
                public final Object call(Object obj) {
                    return mkd0.r(CoreModule.c.n1.S3(), CoreModule.c.u0.O6(), new x9j() { // from class: l.i530
                        public final Object call(Object obj2, Object obj3) {
                            return new j760((VisitorDoorInfo) obj2, (CoreLikers.a) obj3);
                        }
                    });
                }
            })).subscribe(mkd0.H(new e30() { // from class: l.y330
                public final void call(Object obj) {
                    C0260a.m4277m5((j760) obj);
                }
            }, new e30() { // from class: l.a430
                public final void call(Object obj) {
                    C0260a.m4167N4((Throwable) obj);
                }
            }));
            duringCreated(CoreModule.c.C0.x3().distinctUntilChanged()).subscribe(mkd0.H(new e30() { // from class: l.b430
                public final void call(Object obj) {
                    CoreModule.c.n1.S3();
                }
            }, new e30() { // from class: l.c430
                public final void call(Object obj) {
                    C0260a.m4215X2((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Z7 */
    public final /* synthetic */ void m4433Z7(j760 j760Var) {
        ((NewMainViewModel) ((jq2) this).viewModel).m4092o0(j760Var);
    }

    /* JADX INFO: renamed from: Z8 */
    public final /* synthetic */ void m4434Z8(User user) {
        abi.L(act(), user, 0, true);
    }

    @Override // p009l.y030
    /* JADX INFO: renamed from: a0 */
    public void mo4435a0() {
        LaunchStep launchStep = LaunchStep.NewMainBaseSub;
        yni.m25474f(launchStep);
        y8i0.m25203a("NewMainPresenter initSubscription");
        super.mo4435a0();
        LaunchStep launchStep2 = LaunchStep.NewMainSub;
        yni.m25473e(launchStep, launchStep2);
        p420.t(act());
        m4374K9();
        mah0.s0().k1();
        m4495o7();
        m4395Q6();
        m4507r7();
        m4340C6();
        m4379M6();
        creates(new e30() { // from class: l.h530
            public final void call(Object obj) {
                ghd0.e();
            }
        });
        creates(new e30() { // from class: l.p630
            public final void call(Object obj) {
                this.f18404a.m4183Q8((Bundle) obj);
            }
        }, new d30() { // from class: l.a730
            public final void call() {
                y1j.m25172j();
            }
        });
        m4383N6();
        creates(new e30() { // from class: l.l730
            public final void call(Object obj) {
                this.f15973a.m4400R8((Bundle) obj);
            }
        });
        m4391P6();
        m4363I6();
        m4352F6();
        duringCreated(this.f3279s).filter(new w9j() { // from class: l.w730
            public final Object call(Object obj) {
                return Boolean.valueOf(TabName.Me.equals((TabName) obj) && CoreModule.K().xf());
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.h830
            public final void call(Object obj) {
                CoreModule.c.I0.N3();
            }
        }));
        m4387O6();
        m4314v7();
        m4482l6();
        m4474j6();
        m4452d9();
        m4539z7();
        gp80.m15143l(act());
        m4511s7();
        m4418W6();
        m4505q9();
        CoreModule.c.K0.z3();
        m4475j7();
        m4498p6();
        m4457f6();
        m4337B7();
        m4531x7();
        m4450d7();
        duringCreated(act().lifecycle().filter(new w9j() { // from class: l.s830
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.i);
            }
        }).skip(1)).subscribe(mkd0.G(new e30() { // from class: l.d930
            public final void call(Object obj) {
                C0260a.m4274m2((c) obj);
            }
        }));
        m4367J6();
        m4344D6();
        m4446c7();
        m4413V6();
        m4398R6();
        m4503q7();
        m4359H6();
        m4509r9();
        m4499p7();
        m4428Y6();
        m4345D7();
        m4527w7();
        m4467h7();
        m4530x6();
        m4371K6();
        m4445c6();
        m4406T6();
        m4341C7();
        if (RemoteConfig.m9619x().m9651s("delay_jobs_after_cold_start")) {
            qib0.r0(new Runnable() { // from class: l.o930
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17883a.m4393P8();
                }
            }, true);
        } else {
            m4393P8();
        }
        m4423X6();
        m4331z6();
        yni.m25472d(launchStep2);
        y8i0.m25204b();
        m4460f9();
        m4471i7();
        m4348E6();
        m4479k7();
        m4204U6();
        m4487m7();
        m4462g7();
        m4432Z6();
        m4353F7();
        m4491n7();
        m4454e7();
        m4458f7();
        m4442b7();
        m4438a7();
    }

    @Override // p009l.y030
    /* JADX INFO: renamed from: a1 */
    public void mo4436a1(TabName tabName, boolean z) {
        m4490n6(tabName, z);
    }

    /* JADX INFO: renamed from: a6 */
    public final void m4437a6() {
        duringCreated(CoreModule.c.Q0.x3()).subscribe(mkd0.G(new e30() { // from class: l.c230
            public final void call(Object obj) {
                this.f10414a.m4384N7((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a7 */
    public final void m4438a7() {
        duringCreated(NavigationBarAdmobHelper.INSTANCE.m48l()).subscribe(mkd0.G(new e30() { // from class: l.p230
            public final void call(Object obj) {
                this.f18361a.m4496o8((Integer) obj);
            }
        }));
        duringCreated(CoreModule.c.C0.x3().distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.q230
            public final void call(Object obj) {
                this.f18995a.m4500p8((List) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.r230
            public final Object call() {
                return CoreModule.c.e0.o9().distinctUntilChanged();
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.t230
            public final void call(Object obj) {
                this.f20526a.m4504q8((User) obj);
            }
        }));
        duringCreated(CoreModule.c.c0.c3()).subscribe(mkd0.H(new e30() { // from class: l.u230
            public final void call(Object obj) {
                C0260a.m4191S3((UserLiveHierarchy) obj);
            }
        }, new n()));
        duringCreated(v930.k().distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.v230
            public final void call(Object obj) {
                this.f21433a.m4508r8((TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a8 */
    public final /* synthetic */ void m4439a8(ExpandedCardStyleHelper.ExpandedCardStyle expandedCardStyle) {
        ((NewMainViewModel) ((jq2) this).viewModel).m4050J(expandedCardStyle == ExpandedCardStyleHelper.ExpandedCardStyle.EXPANDED_PROFILE_STYLE);
    }

    /* JADX INFO: renamed from: a9 */
    public final /* synthetic */ void m4440a9(j760 j760Var) {
        this.f3286z = ((Boolean) j760Var.a).booleanValue();
        long jLongValue = ((Long) CoreModule.c.e0.x6.get()).longValue();
        int iI3 = upa.i3();
        if (((Boolean) j760Var.b).booleanValue() || (jLongValue > 1 && iI3 > 0 && mqi0.m18550o() - jLongValue > ((long) iI3) * 86400000)) {
            this.f3286z = false;
        }
        m4533x9();
    }

    /* JADX INFO: renamed from: b6 */
    public final void m4441b6(FragmentManager fragmentManager, TabName tabName) {
        if (y1j.m25168d().m25175e()) {
            return;
        }
        boolean z = false;
        for (TabName tabName2 : TabName.values()) {
            if (tabName != tabName2 && fragmentManager.i0(tabName2.toString()) == null) {
                y1j.m25168d().m25173b(act(), tabName2, new a130(this));
                z = true;
            }
        }
        if (z) {
            y1j.m25168d().m25174c(act());
        }
    }

    /* JADX INFO: renamed from: b7 */
    public final void m4442b7() {
        if (IntlCountryCodeController.k() || ((Boolean) CoreModule.c.e0.J6.get()).booleanValue()) {
            return;
        }
        duringCreated(CoreModule.c.f0.np(MessageType.get("local_intl_prompt_message_type"))).subscribe(mkd0.G(new e30() { // from class: l.o230
            public final void call(Object obj) {
                CoreModule.c.e0.J6.put(Boolean.TRUE);
            }
        }));
    }

    /* JADX INFO: renamed from: b8 */
    public final /* synthetic */ void m4443b8(j760 j760Var) {
        e010.c(act(), (TabName) j760Var.a);
    }

    /* JADX INFO: renamed from: b9 */
    public final /* synthetic */ void m4444b9(Bundle bundle) {
        m4380M7();
        m4453e6();
        m4431Z5();
        m4437a6();
        m4466h6();
        m4449d6();
    }

    /* JADX INFO: renamed from: c6 */
    public final void m4445c6() {
        if (upa.B2()) {
            CoreModule.c.K1.U.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: c7 */
    public final void m4446c7() {
        if (!CoreModule.o.b().wf() || CoreModule.K().me_().isFemale()) {
            return;
        }
        duringCreated(this.f3279s.distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.b930
            public final void call(Object obj) {
                C0260a.m4129F1((TabName) obj);
            }
        }));
        duringCreated(this.f3279s.distinctUntilChanged().filter(new w9j() { // from class: l.c930
            public final Object call(Object obj) {
                return Boolean.valueOf(((TabName) obj) == TabName.Msg);
            }
        }).flatMap(new w9j() { // from class: l.e930
            public final Object call(Object obj) {
                return CoreModule.c.C0.u4();
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.f930
            public final void call(Object obj) {
                ConversationsList.m5434A2();
            }
        }, new e30() { // from class: l.g930
            public final void call(Object obj) {
                C0260a.m4281n5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c8 */
    public final /* synthetic */ void m4447c8(TabName tabName) {
        ((NewMainViewModel) ((jq2) this).viewModel).m4049I0();
        ((NewMainViewModel) ((jq2) this).viewModel).m4091n0();
        boolean zEquals = TabName.Card.equals(tabName);
        s7m s7mVar = ((jq2) this).viewModel;
        if (zEquals) {
            xdl0.U(((NewMainViewModel) s7mVar).f3243e, NavigationBarAdmobHelper.INSTANCE.m47k());
        } else {
            xdl0.U(((NewMainViewModel) s7mVar).f3243e, v930.f + NavigationBarAdmobHelper.INSTANCE.m47k());
        }
    }

    /* JADX INFO: renamed from: c9 */
    public final /* synthetic */ void m4448c9(TtcMigrateDisplayData ttcMigrateDisplayData) {
        if (ttcMigrateDisplayData.open) {
            TtcAccountMigrateDisplayAct.INSTANCE.m7953a(act(), ttcMigrateDisplayData);
        }
    }

    /* JADX INFO: renamed from: d6 */
    public final void m4449d6() {
        if (this.f22828f || this.f22829g) {
            SurveySparrowHelper.INSTANCE.l();
        }
    }

    /* JADX INFO: renamed from: d7 */
    public final void m4450d7() {
        if (bcp.INSTANCE.m11953n()) {
            act().duringCreated(CoreModule.c.e0.o9()).filter(new w9j() { // from class: l.n930
                public final Object call(Object obj) {
                    User user = (User) obj;
                    return Boolean.valueOf((user == null || vwb.J(user.status)) ? false : true);
                }
            }).take(2).subscribe(mkd0.H(new e30() { // from class: l.b130
                public final void call(Object obj) {
                    this.f9788a.m4512s8((User) obj);
                }
            }, new e30() { // from class: l.c130
                public final void call(Object obj) {
                    C0260a.m4212W3((Throwable) obj);
                }
            }));
            act().duringCreated(puk0.m20720e().m20721b(), false).filter(new w9j() { // from class: l.d130
                public final Object call(Object obj) {
                    VerificationNetworkData verificationNetworkData = (VerificationNetworkData) obj;
                    return Boolean.valueOf((verificationNetworkData == null || verificationNetworkData.meta == null || verificationNetworkData.data == null) ? false : true);
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.e130
                public final void call(Object obj) {
                    this.f12134a.m4516t8((VerificationNetworkData) obj);
                }
            }, new e30() { // from class: l.f130
                public final void call(Object obj) {
                    C0260a.m4137H1((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: d8 */
    public final /* synthetic */ void m4451d8(com.android.billingclient.api.a aVar) {
        aqo.h(act(), aVar).a().doOnNext(new e30() { // from class: l.b530
            public final void call(Object obj) {
                CoreModule.c.e0.W9(CoreModule.H().userId());
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.c530
            public final void call(Object obj) {
                PaymentApi.PaymentResultStatus.succeed;
            }
        }, new e30() { // from class: l.d530
            public final void call(Object obj) {
                C0260a.m4325y4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d9 */
    public final void m4452d9() {
        if (NullChecker.a(CoreModule.c.f0)) {
            if (((Boolean) CoreModule.c.f0.G0.get()).booleanValue()) {
                CoreModule.c.f0.cp();
            }
            CoreModule.c.f0.dp(new Runnable() { // from class: l.y730
                @Override // java.lang.Runnable
                public final void run() {
                    C0260a.m4242e2();
                }
            });
            duringCreated(CoreModule.c.f0.S1).subscribe(mkd0.G(new e30() { // from class: l.z730
                public final void call(Object obj) {
                    this.f23500a.m4434Z8((User) obj);
                }
            }));
            CoreModule.c.f0.jp();
        }
    }

    /* JADX INFO: renamed from: e6 */
    public final void m4453e6() {
        if (this.f22828f || this.f22829g) {
            m4416V9(false);
        }
    }

    /* JADX INFO: renamed from: e7 */
    public final void m4454e7() {
        CoreModule.c.u0.m5();
        CoreModule.c.v0.n3();
        CoreModule.c.v0.m3();
        duringCreated(lifecycle().distinctUntilChanged().filter(new w9j() { // from class: l.k330
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.i);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.l330
            public final void call(Object obj) {
                C0260a.m4220Y3((c) obj);
            }
        }));
        duringCreated(mkd0.s(CoreModule.c.v0.q3(), CoreModule.c.v0.p3(), CoreModule.c.C0.x3(), new y9j() { // from class: l.m330
            /* JADX INFO: renamed from: a */
            public final Object m18220a(Object obj, Object obj2, Object obj3) {
                return new xaj0((Optional) obj, (Optional) obj2, (List) obj3);
            }
        }).map(new w9j() { // from class: l.n330
            public final Object call(Object obj) {
                return this.f17220a.m4502q6((xaj0) obj);
            }
        }).distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.p330
            public final void call(Object obj) {
                this.f18371a.m4520u8((j760) obj);
            }
        }));
        duringCreated(CoreModule.c.n1.A3()).subscribe(mkd0.H(new e30() { // from class: l.q330
            public final void call(Object obj) {
                this.f19003a.m4528w8((IntlTribeBubble) obj);
            }
        }, new e30() { // from class: l.r330
            public final void call(Object obj) {
                C0260a.m4223Z2((Throwable) obj);
            }
        }));
        if (ir9.e()) {
            duringCreated(CoreModule.c.n1.y3()).subscribe(mkd0.H(new e30() { // from class: l.s330
                public final void call(Object obj) {
                    C0260a.m4200U2((IntlTribeBubble) obj);
                }
            }, new e30() { // from class: l.t330
                public final void call(Object obj) {
                    C0260a.m4316w3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: e8 */
    public final /* synthetic */ void m4455e8(Act act) {
        p09.w().K(act());
    }

    /* JADX INFO: renamed from: e9 */
    public final void m4456e9() {
        if (IntlCountryCodeController.k()) {
            return;
        }
        com.p1.mobile.putong.core.ui.gp.a.j().o(this.f22823a);
    }

    /* JADX INFO: renamed from: f6 */
    public final void m4457f6() {
        if (upa.i()) {
            CoreModule.c.f0.Ee();
        }
    }

    /* JADX INFO: renamed from: f7 */
    public final void m4458f7() {
        if (h6a.c()) {
            if (!xma.m4() || !xma.e4()) {
                CoreModule.c.G2.s3();
            }
            if (!xma.e4()) {
                duringCreated(CoreModule.c.G2.u3()).subscribe(mkd0.G(new e30() { // from class: l.m430
                    public final void call(Object obj) {
                        this.f16496a.m4532x8((Envelope) obj);
                    }
                }));
            }
            duringCreated(m4390O9()).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.n430
                public final void call(Object obj) {
                    C0260a.m4131F3((TabName) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: f8 */
    public final /* synthetic */ void m4459f8(Notification notification) {
        m4402S6();
    }

    /* JADX INFO: renamed from: f9 */
    public final void m4460f9() {
        if (bzc0.f() || !upa.o2() || upa.p2()) {
            return;
        }
        duringCreated(mkd0.r(CoreModule.c.e0.o9().map(new w9j() { // from class: l.m830
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(!qqi0.h(mqi0.m18550o(), (long) user.createdTime, upa.j3()) && (TextUtils.isEmpty(user.description) || user.pictures.size() < 3));
            }
        }).distinctUntilChanged(), CoreModule.c.e0.w6.obs().distinctUntilChanged(), new trq())).subscribe(mkd0.G(new e30() { // from class: l.n830
            public final void call(Object obj) {
                this.f17353a.m4440a9((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g6 */
    public final void m4461g6() {
        CoreModule.c.f0.Bf();
    }

    /* JADX INFO: renamed from: g7 */
    public final void m4462g7() {
        CoreModule.c.p0.o3();
    }

    /* JADX INFO: renamed from: g8 */
    public final /* synthetic */ Boolean m4463g8(CoreInnerPush.a aVar) {
        return Boolean.valueOf(act().lifecycle_() == com.p1.mobile.android.app.c.i || aVar.l);
    }

    /* JADX INFO: renamed from: g9 */
    public void m4464g9() {
        PutongFrag putongFragI0 = this.f22823a.fragmentManager().i0(this.f22824b.toString());
        if (putongFragI0 instanceof PutongFrag) {
            putongFragI0.I4();
        }
        if (putongFragI0 instanceof ConversationsTabFrag) {
            o6j0.c("e_messages", "p_messages_view", new o6j0.a[]{o6j0.a.h("click_change", "click")});
        }
    }

    @Override // p009l.y030
    /* JADX INFO: renamed from: h1 */
    public void mo4465h1() {
        this.f22834l = new v(this);
    }

    /* JADX INFO: renamed from: h6 */
    public final void m4466h6() {
        try {
            w85.INSTANCE.m23999k(CoreModule.c.e0.na().publicId);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: h7 */
    public final void m4467h7() {
        if (u59.u()) {
            if (NullChecker.a(CoreModule.c.t2.R) && ((Boolean) CoreModule.c.t2.R.get()).booleanValue()) {
                qwp.i().o(act(), "test", "近期多次向他人髮送廣告信息，已被平颱標記爲風險用戶。再有類似行爲，您的帳號將被<span style=\"color: #FE7E1D;\">限製曝光或封禁</span>");
            } else {
                duringCreated(v930.k().take(1).flatMap(new w9j() { // from class: l.d830
                    public final Object call(Object obj) {
                        return C0260a.m4156L1((TabName) obj);
                    }
                })).subscribe(mkd0.H(new e30() { // from class: l.e830
                    public final void call(Object obj) {
                        this.f12446a.m4536y8((RiskSelfData) obj);
                    }
                }, new e30() { // from class: l.f830
                    public final void call(Object obj) {
                        C0260a.m4284o4((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: h8 */
    public final /* synthetic */ rx.c m4468h8(final CoreInnerPush.a aVar) {
        return aVar.l ? act().lifecycle().filter(new w9j() { // from class: l.r430
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.i);
            }
        }).first().map(new w9j() { // from class: l.s430
            public final Object call(Object obj) {
                return C0260a.m4118C4(aVar, (c) obj);
            }
        }) : rx.c.just(aVar);
    }

    /* JADX INFO: renamed from: h9 */
    public boolean m4469h9(final String str) {
        final Frag fragI0 = this.f22823a.fragmentManager().i0(this.f22824b.toString());
        lifecycle().filter(new w9j() { // from class: l.l130
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.i);
            }
        }).take(1).subscribe(mkd0.G(new e30() { // from class: l.w130
            public final void call(Object obj) {
                C0260a.m4307u3(fragI0, str, (c) obj);
            }
        }));
        return CoreModule.N().isPhotoAlbumFrag(fragI0);
    }

    /* JADX INFO: renamed from: i6 */
    public final Fragment m4470i6(TabName tabName) {
        switch (m.f3302a[tabName.ordinal()]) {
            case 1:
                return HomeLayoutFrag.m2491C5();
            case 2:
                return ConversationsTabFrag.m5684B5(this.f3282v);
            case 3:
                if (((NewMainViewModel) ((jq2) this).viewModel).f3234E.m3718J(TabName.Live)) {
                    return CoreModule.Q().buildLiveSquareFrag();
                }
                return null;
            case 4:
            default:
                return null;
            case 5:
                return new ProfileFrag();
            case 6:
                return u9w.INSTANCE.k();
            case 7:
                if (upa.Q1()) {
                    return b1c.h(Y(), "bottom_navigation_bar");
                }
                return null;
            case 8:
                o6j0.h("e_intl_navbar_meet_view", "p_navigation_view", new o6j0.a[0]);
                return new IntlTribeMeetFrag();
        }
    }

    /* JADX INFO: renamed from: i7 */
    public final void m4471i7() {
        if (ogl0.X()) {
            CoreModule.c.f0.Ep(true);
            duringCreated(CoreModule.c.f0.Vm()).observeOn(Schedulers.io()).take(1).map(new w9j() { // from class: l.d430
                public final Object call(Object obj) {
                    return C0260a.m4153K3((List) obj);
                }
            }).subscribe();
        } else if (CoreModule.c.f0.Lp()) {
            CoreModule.c.f0.qq(-1.0d);
            CoreModule.c.f0.Ep(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i8 */
    public final /* synthetic */ void m4472i8(TabName tabName, View view, CoreInnerPush.a aVar) {
        if (view instanceof qsm) {
            ((qsm) view).mo3247a(act(), aVar, tabName, m4494o6());
        }
    }

    /* JADX INFO: renamed from: i9 */
    public void m4473i9(Bundle bundle) {
        TabName tabNameTransform = TabName.transform(bundle.getString("saved_fragment_name"));
        if (NullChecker.a(tabNameTransform)) {
            this.f22824b = tabNameTransform;
        }
        if (bundle.containsKey("msg_tab_index")) {
            this.f3282v = bundle.getInt("msg_tab_index", 0);
        }
    }

    /* JADX INFO: renamed from: j6 */
    public final void m4474j6() {
        act().duringCreated(CoreModule.c.f0.jn(false).take(1)).subscribe(mkd0.G(new e30() { // from class: l.u330
            public final void call(Object obj) {
                C0260a.m4190S2((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j7 */
    public final void m4475j7() {
        if (u59.d0()) {
            if (!u9w.INSTANCE.h() && !u59.E()) {
                creates(new e30() { // from class: l.o130
                    public final void call(Object obj) {
                        this.f17797a.m4334A8((Bundle) obj);
                    }
                });
            }
            final LoveBuzzNotifyUserPop loveBuzzNotifyUserPop = new LoveBuzzNotifyUserPop(act());
            act().duringCreated(j8w.Companion.a().z0(), false).subscribe(mkd0.H(new e30() { // from class: l.p130
                public final void call(Object obj) {
                    this.f18311a.m4338B8(loveBuzzNotifyUserPop, (j760) obj);
                }
            }, new e30() { // from class: l.q130
                public final void call(Object obj) {
                    C0260a.m4263j3((Throwable) obj);
                }
            }));
            act().duringCreated(v930.k()).distinctUntilChanged().skip(1).subscribe(mkd0.H(new e30() { // from class: l.r130
                public final void call(Object obj) {
                    this.f19607a.m4342C8(loveBuzzNotifyUserPop, (TabName) obj);
                }
            }, new e30() { // from class: l.s130
                public final void call(Object obj) {
                    C0260a.m4224Z3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: j8 */
    public final /* synthetic */ void m4476j8(CoreInnerPush.a aVar) {
        int i2;
        final TabName tabNameM25147b1 = m25147b1();
        if (vwb.J(aVar.i) || aVar.i.contains(tabNameM25147b1)) {
            hd2 hd2Var = new hd2(act());
            ViewGroup viewGroup = (ViewGroup) act().getWindow().getDecorView();
            int i3 = f6c0.q7;
            if (aVar.j == CoreInnerPush.InnerPushLayoutType.COUNTDOWN_CONV_CREATE) {
                i3 = f6c0.c2;
                i2 = 0;
            } else {
                i2 = -1;
            }
            hd2 hd2VarU = hd2Var.s(i3, true).z(viewGroup).x(xdl0.F0()).u(200L);
            long j2 = aVar.k;
            if (j2 <= 0) {
                j2 = 3000;
            }
            hd2VarU.q(j2).p(new j()).y(aVar, new hd2.b() { // from class: l.e630
                /* JADX INFO: renamed from: a */
                public final void m13745a(View view, Object obj) {
                    this.f12387a.m4472i8(tabNameM25147b1, view, (CoreInnerPush.a) obj);
                }
            });
            if (i2 >= 0) {
                hd2Var.v(i2).w(i2);
            }
            if (TextUtils.isEmpty(aVar.g)) {
                nd2.j().s(hd2Var);
            } else {
                nd2.j().t(hd2Var, aVar.g);
            }
        }
    }

    /* JADX INFO: renamed from: j9 */
    public void m4477j9() {
        int i2 = 0;
        CoreModule.c.m0.q2[0] = 1;
        this.f3283w = false;
        if (CoreModule.N().Ah()) {
            this.f22824b = CoreModule.N().dr();
        }
        if (!this.f3285y) {
            if (!TabName.Card.equals(this.f22824b)) {
                if (TabName.Moment.equals(this.f22824b)) {
                    i2 = 1;
                } else {
                    i2 = TabName.Live.equals(this.f22824b) ? 3 : 2;
                }
            }
            zvf0.D("e_apprenew_expose", "p_suggest_users_home_view", new j760[]{vwb.Y("cold_boot_toaddrtype", Integer.valueOf(i2))});
            this.f3285y = true;
        }
        if (CoreModule.c.b2.f3()) {
            this.f22824b = CoreModule.c.b2.d3((String) CoreModule.c.b2.R.get());
        }
        m4422X5(this.f22824b);
    }

    /* JADX INFO: renamed from: k6 */
    public final void m4478k6() {
        if (CoreModule.N().n7()) {
            return;
        }
        CoreModule.c.r1.c3().subscribe(mkd0.H(new e30() { // from class: l.b630
            public final void call(Object obj) {
                C0260a.m4269k5((Boolean) obj);
            }
        }, new e30() { // from class: l.c630
            public final void call(Object obj) {
                C0260a.m4133F5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k7 */
    public final void m4479k7() {
        if (upa.X2()) {
            duringCreated(CoreModule.c.e0.h4).subscribe(mkd0.H(new s(), new e30() { // from class: l.r730
                public final void call(Object obj) {
                    C0260a.m4172O5((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k8 */
    public final /* synthetic */ void m4480k8(Boolean bool) {
        if (CoreModule.c.x0.I3() != null) {
            m4533x9();
            if (CoreModule.c.x0.T3()) {
                m4525v9();
            }
        }
        ((NewMainViewModel) ((jq2) this).viewModel).m4091n0();
    }

    /* JADX INFO: renamed from: k9 */
    public void m4481k9(Bundle bundle) {
        bundle.putString("saved_fragment_name", this.f22824b.toString());
        ConversationsTabFrag conversationsTabFragI0 = this.f22823a.fragmentManager().i0(TabName.Msg.toString());
        if (conversationsTabFragI0 instanceof ConversationsTabFrag) {
            int iM5748c0 = conversationsTabFragI0.m5748c0();
            this.f3282v = iM5748c0;
            bundle.putInt("msg_tab_index", iM5748c0);
        }
    }

    /* JADX INFO: renamed from: l6 */
    public final void m4482l6() {
        if (ura.e().d().R8()) {
            act().duringCreated(CoreModule.c.f0.bf().take(1)).subscribe(mkd0.G(new e30() { // from class: l.d330
                public final void call(Object obj) {
                    C0260a.m4308u4((q860) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l7 */
    public final void m4483l7() {
        yni.m25474f(LaunchStep.BigEmoji);
        if (!((Boolean) CoreModule.c.e0.N1.get()).booleanValue()) {
            CoreModule.c.e0.N1.put(Boolean.TRUE);
            ArrayList arrayList = new ArrayList();
            arrayList.add("https://auto.tancdn.com/v1/raw/bd957249-2f80-4f31-adcd-a3eefc6afbad12.svga");
            SVGALoader.with(act()).batchDownload(arrayList);
        }
        kye.i.clear();
        kye.h.clear();
        for (kye.a aVar : kye.d) {
            String string = act().getString(aVar.b);
            kye.i.add(string);
            kye.h.put(string, Integer.valueOf(aVar.d));
        }
        if (!NullChecker.a(pxe.c().b())) {
            EmojiAnimData emojiAnimDataNew_ = EmojiAnimData.new_();
            emojiAnimDataNew_.emojiAnimCreatedTime = new HashMap();
            pxe.c().j(emojiAnimDataNew_);
        }
        yni.m25472d(LaunchStep.BigEmoji);
    }

    /* JADX INFO: renamed from: l8 */
    public final /* synthetic */ void m4484l8(Long l2) {
        m4533x9();
        if (!CoreModule.c.x0.T3()) {
            m4523v6();
        }
        ((NewMainViewModel) ((jq2) this).viewModel).m4091n0();
    }

    /* JADX INFO: renamed from: l9 */
    public void m4485l9() {
        PutongFrag putongFragI0 = this.f22823a.fragmentManager().i0(this.f22824b.toString());
        if (putongFragI0 instanceof PutongFrag) {
            putongFragI0.H4();
        }
        if (putongFragI0 instanceof ConversationsTabFrag) {
            o6j0.c("e_message_double_click", "p_messages_view", new o6j0.a[0]);
        }
    }

    /* JADX INFO: renamed from: m6 */
    public final void m4486m6() {
        if (CoreModule.N().cd() || !CoreModule.N().fs()) {
            CoreModule.c.q1.t3().subscribe(mkd0.H(new e30() { // from class: l.k530
                public final void call(Object obj) {
                    C0260a.m4271l3((Boolean) obj);
                }
            }, new e30() { // from class: l.l530
                public final void call(Object obj) {
                    C0260a.m4299s3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: m7 */
    public final void m4487m7() {
        if (upa.p2()) {
            duringCreated(this.f3279s).filter(new w9j() { // from class: l.g530
                public final Object call(Object obj) {
                    return Boolean.valueOf(TabName.Me.equals((TabName) obj));
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.s530
                public final void call(Object obj) {
                    CoreModule.c.e0.B7();
                }
            }));
            CoreModule.c.e0.B7();
        }
        m4136G6();
    }

    /* JADX INFO: renamed from: m8 */
    public final /* synthetic */ void m4488m8(List list) {
        m4533x9();
    }

    /* JADX INFO: renamed from: m9 */
    public final void m4489m9(Act act, String str, String str2) {
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        act.startActivity(new Intent("android.intent.action.VIEW").setData(builderBuildUpon.appendQueryParameter("serverCode", str2).build()));
    }

    /* JADX INFO: renamed from: n6 */
    public final void m4490n6(TabName tabName, boolean z) {
        TabName tabName2;
        boolean zE0;
        TabName tabName3;
        TabName tabName4;
        Fragment fragmentM4470i6;
        TabName tabName5 = tabName;
        du2.a("[FragmentChange]", "start old: " + this.f22824b + " -> new: " + tabName5);
        TabName tabName6 = TabName.Moment;
        if (tabName6.equals(tabName5) && CoreModule.K().pe()) {
            return;
        }
        if (upa.N3() && TabName.Card.equals(tabName5) && ExpandedCardStyleHelper.m2064o().m2077s()) {
            return;
        }
        TabName tabName7 = TabName.Live;
        if (tabName5 == tabName7 && !((NewMainViewModel) ((jq2) this).viewModel).f3234E.m3718J(tabName7)) {
            if (upa.Q1()) {
                Act act = act();
                Bundle bundle = new Bundle();
                if (NullChecker.a(act) && NullChecker.a(act.getIntent())) {
                    bundle = act.getIntent().getBundleExtra("extra_new_main_bundle");
                }
                CoreModule.Q().m9036Z8(act(), bundle);
            }
            tabName5 = TabName.Card;
        }
        TabName tabName8 = this.f22824b;
        FragmentManager fragmentManager = this.f22823a.fragmentManager();
        if (this.f22824b != tabName5) {
            if (e4w.m13727g()) {
                return;
            }
            FeedService.b bVarI0 = fragmentManager.i0(tabName6.toString());
            if (bVarI0 instanceof FeedService.b) {
                bVarI0.E0();
                e4w.m13726f();
            }
        }
        String strM4510s6 = m4510s6(this.f22824b);
        this.f22824b = tabName5;
        if (CoreModule.Q().m9020M7()) {
            this.f22824b = tabName7;
            if (z && tabName5 != tabName7) {
                lsi0.B("青少年模式下无法使用", true, true);
            }
        }
        AbstractC0465a abstractC0465a = qib0.E;
        if (abstractC0465a != null) {
            abstractC0465a.m9169z();
        }
        if (CoreModule.N().M8() && !tabName5.equals(TabName.Card)) {
            NewNewProfileCard.m743Y1();
        }
        Fragment fragmentI0 = fragmentManager.i0(this.f22824b.toString());
        boolean z2 = false;
        if (lifecycle_() == com.p1.mobile.android.app.c.j) {
            tabName2 = tabName5;
            zE0 = false;
            z2 = false;
        } else if (NullChecker.a(fragmentI0) && fragmentI0.getLifecycle().b() == Lifecycle.State.RESUMED && !fragmentI0.isHidden()) {
            if (y1j.m25169f() && this.f3284x) {
                m4441b6(fragmentManager, this.f22824b);
            }
            tabName2 = tabName5;
            zE0 = true;
        } else {
            if (m.f3302a[this.f22824b.ordinal()] == 3) {
                NewMainAct newMainAct = ((jq2) this).lifecycleProviderImpl;
                if (newMainAct instanceof NewMainAct) {
                    o6j0.c("e_live_entertainment_icon", (String) newMainAct.m3875Y5().a, new o6j0.a[0]);
                }
            }
            androidx.fragment.app.k kVarM = fragmentManager.m();
            TabName[] tabNameArrValues = TabName.values();
            int length = tabNameArrValues.length;
            int i2 = 0;
            boolean z3 = false;
            while (i2 < length) {
                TabName tabName9 = tabNameArrValues[i2];
                String string = tabName9.toString();
                Fragment fragmentI1 = fragmentManager.i0(string);
                if (fragmentI1 != null) {
                    tabName4 = tabName5;
                    fragmentM4470i6 = fragmentI1;
                } else if (!y1j.m25169f() || this.f22829g || this.f22828f) {
                    tabName4 = tabName5;
                    fragmentM4470i6 = m4470i6(tabName9);
                    if (NullChecker.a(fragmentM4470i6)) {
                        if (this.f22824b.equals(tabName9)) {
                            m4497o9(fragmentM4470i6, false);
                        }
                        kVarM.c(u4c0.y4, fragmentM4470i6, string);
                    }
                } else if (this.f22824b.equals(tabName9)) {
                    tabName4 = tabName5;
                    boolean zM25177k = y1j.m25168d().m25177k(this.f22824b);
                    Fragment fragmentM4470i7 = m4470i6(tabName9);
                    if (NullChecker.a(fragmentM4470i7)) {
                        m4497o9(fragmentM4470i7, zM25177k);
                        kVarM.c(u4c0.y4, fragmentM4470i7, string);
                    }
                    fragmentM4470i6 = fragmentM4470i7;
                } else {
                    tabName4 = tabName5;
                    y1j.m25168d().m25173b(act(), tabName9, new a130(this));
                    fragmentM4470i6 = fragmentI1;
                    z3 = true;
                }
                if (NullChecker.a(fragmentM4470i6)) {
                    if (this.f22824b.equals(tabName9)) {
                        kVarM.w(fragmentM4470i6, Lifecycle.State.RESUMED);
                        kVarM.y(fragmentM4470i6);
                    } else if (!fragmentM4470i6.isHidden()) {
                        kVarM.p(fragmentM4470i6);
                    }
                }
                i2++;
                fragmentI0 = fragmentM4470i6;
                tabName5 = tabName4;
            }
            tabName2 = tabName5;
            if (y1j.m25169f() && z3) {
                y1j.m25168d().m25174c(act());
            }
            kVarM.j();
            zE0 = fragmentManager.e0();
            z2 = true;
        }
        if (zE0) {
            if (z) {
                m4412U9(strM4510s6, z2);
            }
            TabName tabName10 = this.f22824b;
            TabName tabName11 = TabName.Msg;
            boolean zEquals = tabName10.equals(tabName11);
            s7m s7mVar = ((jq2) this).viewModel;
            if (zEquals) {
                ((NewMainViewModel) s7mVar).m4098u0(true);
                if (z && !CoreModule.c.m0.O6()) {
                    User userP9 = CoreModule.c.e0.p9();
                    if (NullChecker.a(userP9) && userP9.isNewUserIn24H() && n3b0.q()) {
                        CoreModule.c.u0.V6((Links) null, 0L, 1, "");
                    }
                    ((Long) CoreModule.c.u0.k0.get()).getClass();
                    CoreModule.c.u0.c7(CoreLikers.LikersTriggerBy.home_tab_msg);
                    CoreModule.c.k1.A3();
                    m4426X9();
                }
                if (vy8.m() || vy8.n()) {
                    ke7.o().z();
                }
            } else {
                ((NewMainViewModel) s7mVar).m4098u0(false);
            }
            v930.n(this.f22824b);
            TabName tabName12 = this.f22824b;
            TabName tabName13 = TabName.Card;
            if (tabName12.equals(tabName13)) {
                gt00.c().d("active");
                v930.m(tabName13, z);
            }
            if (this.f22824b.equals(TabName.Me)) {
                if (z) {
                    CoreModule.c.H0.k5();
                }
                if (CoreModule.c.x0.H4()) {
                    IapAffiliatePromotion iapAffiliatePromotionI3 = CoreModule.c.x0.I3();
                    if (iapAffiliatePromotionI3 != null) {
                        CoreModule.c.x0.Y.put(Long.valueOf(iapAffiliatePromotionI3.promotionHitId));
                    }
                    m4533x9();
                }
                if (upa.M2()) {
                    ((NewMainViewModel) ((jq2) this).viewModel).m4062P();
                }
                if (z && !CoreModule.c.m0.O6()) {
                    CoreModule.c.u0.Y6();
                    m4426X9();
                }
            }
            if (z && CoreModule.c.A0.b3() && CoreModule.c.A0.c3()) {
                CoreModule.c.A0.d3();
            }
            TabName tabName14 = this.f22824b;
            TabName tabName15 = TabName.Moment;
            if (tabName14.equals(tabName15) && na30.m18811a()) {
                hpd0 hpd0Var = CoreModule.c.e0.X0;
                Boolean bool = Boolean.TRUE;
                hpd0Var.put(bool);
                CoreModule.c.e0.X7().onNext(bool);
            }
            if (lac0.m() && tabName8 != (tabName3 = this.f22824b) && tabName3.equals(tabName13)) {
                CoreModule.c.c2.y3();
                lac0.i().o();
            }
            ((NewMainViewModel) ((jq2) this).viewModel).m4042E0(this.f22824b, z);
            if (this.f3283w && CoreModule.N().isPhotoAlbumFrag(fragmentI0) && z) {
                v930.m(tabName15, true);
            }
            Act act2 = act();
            if (NullChecker.a(act2) && NullChecker.a(act2.getIntent())) {
                Bundle bundleExtra = act2.getIntent().getBundleExtra("extra_new_main_bundle");
                if (NullChecker.a(bundleExtra)) {
                    v930.l(this.f22824b, bundleExtra);
                    act2.getIntent().removeExtra("extra_new_main_bundle");
                }
            }
            TabName tabName16 = TabName.Live;
            if (tabName16.equals(this.f22824b) && z) {
                v930.m(tabName16, CoreModule.Q().isLiveSquareHome(this.f3281u));
            }
            if (this.f3281u != fragmentManager.i0(this.f22824b.toString())) {
                if (this.f3281u == null && !tabName13.equals(this.f22824b)) {
                    yni.m25482n(this.f22824b);
                }
                m4397Q9(true);
                this.f3281u = fragmentManager.i0(this.f22824b.toString());
                m4409T9(true);
                m4405S9(z);
                if (this.f22824b.equals(tabName11)) {
                    CoreModule.c.K0.x3().onNext(Optional.of(roj0.a));
                    m4501p9();
                }
            }
            this.f3279s.onNext(this.f22824b);
            m4456e9();
            fragmentManager.i0(tabName15.toString());
            sp8.a(this.f22824b);
            if (this.f22824b.equals(tabName13) && TEnum.equals(this.f22833k, "cards") && g6a.k() && xma.B3()) {
                gei.m14948u().get().m14961t();
            }
            if (this.f22824b.equals(tabName13)) {
                psl pslVarI0 = fragmentManager.i0(tabName13.toString());
                if (pslVarI0 instanceof psl) {
                    psl pslVar = pslVarI0;
                    if (TEnum.equals(this.f22833k, "cards")) {
                        pslVar.mo2520C1(NewTanFragTag.HOME, null);
                        this.f22833k = null;
                    } else if (TEnum.equals(this.f22833k, "moment_theme_card")) {
                        if (upa.I0().enabled || e900.b().f()) {
                            NewTanFragTag newTanFragTag = NewTanFragTag.MOMENT_THEME_CARD;
                            pslVar.mo2546f1(newTanFragTag);
                            pslVar.mo2520C1(newTanFragTag, null);
                            this.f22833k = null;
                        }
                    } else if (TEnum.equals(this.f22833k, "play_together")) {
                        NewTanFragTag newTanFragTag2 = NewTanFragTag.PLAY_TOGETHER;
                        pslVar.mo2546f1(newTanFragTag2);
                        pslVar.mo2520C1(newTanFragTag2, null);
                        this.f22833k = null;
                    } else if (TEnum.equals(this.f22833k, "boosting")) {
                        m73.k(act2);
                        this.f22833k = null;
                    } else if (TEnum.equals(this.f22833k, "supreme_sartner")) {
                        this.f22833k = null;
                    } else if (TEnum.equals(this.f22833k, "odiamond_private_custom")) {
                        if (CoreModule.c.y2.E3()) {
                            NewTanFragTag newTanFragTag3 = NewTanFragTag.PRIVATE_CUSTOM;
                            pslVar.mo2546f1(newTanFragTag3);
                            pslVar.mo2520C1(newTanFragTag3, null);
                            this.f22833k = null;
                            if (NullChecker.a(this.f22831i) && this.f22831i.size() > 0 && this.f22831i.containsKey("navigation_to")) {
                                CoreModule.P().e().W6(pslVar.mo2542Y(), this.f22831i.get("navigation_to"));
                                this.f22831i.remove("navigation_to");
                            }
                        } else {
                            this.f22833k = null;
                        }
                    }
                }
            }
            if (CoreModule.c.e0.a8()) {
                p09.w().v(this.f22824b);
            }
            if ((this.f22824b.equals(tabName11) || this.f22824b.equals(tabName15)) && z && CoreModule.c.e0.Z7() && !qqi0.h(mqi0.m18550o(), (long) CoreModule.c.e0.p9().createdTime, 5)) {
                wm20.o(act2, wm20.k(act2), this.f22824b.equals(tabName11) ? "message_list_page" : "explore_page");
            }
            if (this.f22824b.equals(tabName11) && CoreModule.N().fs() && z) {
                com.p1.mobile.putong.core.api.i iVar = CoreModule.c.q1;
                com.p1.mobile.putong.core.api.i.S.onNext(roj0.a);
            }
            if (upa.i()) {
                CoreModule.c.f0.Ee();
            }
        }
        this.f3283w = true;
        CoreModule.N().Yb(act(), tabName2.toString(), z);
        CoreModule.c.b2.h3(tabName2.toString());
        if (CoreModule.N().ke()) {
            TabName tabName17 = this.f22824b;
            TabName tabName18 = TabName.Card;
            if (tabName17.equals(tabName18)) {
                CoreModule.K().setTabDot(act(), tabName18, false);
            }
        }
        fragmentManager.i0(this.f22824b.toString());
        du2.a("[FragmentChange]", "finish : " + this.f22824b);
    }

    /* JADX INFO: renamed from: n7 */
    public final void m4491n7() {
        if (ogl0.L()) {
            duringCreated(CoreModule.c.m2.H3()).subscribe(mkd0.H(new e30() { // from class: l.v730
                public final void call(Object obj) {
                    this.f21469a.m4346D8((Integer) obj);
                }
            }, new e30() { // from class: l.x730
                public final void call(Object obj) {
                    C0260a.m4139H3((Throwable) obj);
                }
            }));
            CoreModule.c.m2.F3();
        }
    }

    /* JADX INFO: renamed from: n8 */
    public final /* synthetic */ void m4492n8(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            y59 y59Var = CoreModule.c.b2;
            if (y59Var.S) {
                m4422X5(y59Var.d3(str2));
            }
        }
    }

    /* JADX INFO: renamed from: n9 */
    public final void m4493n9(Act act, String str, String str2) {
        act.startActivity(lva.A(act, "", Uri.parse(str).buildUpon().appendQueryParameter("serverCode", str2).build().toString(), true, false, false));
    }

    /* JADX INFO: renamed from: o6 */
    public PutongFrag m4494o6() {
        return this.f3281u;
    }

    /* JADX INFO: renamed from: o7 */
    public final void m4495o7() {
        if (wc40.f()) {
            creates(new e30() { // from class: l.i130
                public final void call(Object obj) {
                    C0260a.m4125E2((Bundle) obj);
                }
            }, new d30() { // from class: l.j130
                public final void call() {
                    this.f14893a.m4350E8();
                }
            });
            if (wc40.f()) {
                creates(new e30() { // from class: l.k130
                    public final void call(Object obj) {
                        CoreModule.N().initCameraSdk((d30) null);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: o8 */
    public final /* synthetic */ void m4496o8(Integer num) {
        int i2 = v930.f;
        if (upa.N3() && TabName.Card.equals(v930.h())) {
            i2 = 0;
        }
        ((NewMainViewModel) ((jq2) this).viewModel).m4053K0(Integer.valueOf(i2 + num.intValue()));
        ((NewMainViewModel) ((jq2) this).viewModel).m4040D0(num.intValue());
    }

    /* JADX INFO: renamed from: o9 */
    public final void m4497o9(final Fragment fragment, boolean z) {
        if (fragment instanceof NewMainContextFrag) {
            NewMainContextFrag newMainContextFrag = (NewMainContextFrag) fragment;
            newMainContextFrag.m4012R4();
            newMainContextFrag.m4011Q4();
        } else if (z && (fragment instanceof Frag)) {
            ((Frag) fragment).creates(new e30() { // from class: l.i230
                public final void call(Object obj) {
                    fragment.onHiddenChanged(false);
                }
            });
        }
    }

    /* JADX INFO: renamed from: p6 */
    public void m4498p6() {
        act().duringCreated(CoreModule.c.e0.R1.filter(new w9j() { // from class: l.h930
            public final Object call(Object obj) {
                return Boolean.valueOf(u59.m());
            }
        }).flatMap(new w9j() { // from class: l.i930
            public final Object call(Object obj) {
                return CoreModule.c.G1.h3();
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.j930
            public final void call(Object obj) {
                this.f14993a.m4388O7((j760) obj);
            }
        }, new z60()));
    }

    /* JADX INFO: renamed from: p7 */
    public final void m4499p7() {
        if (upa.h0().enable) {
            duringCreated(this.f3279s.distinctUntilChanged().filter(new w9j() { // from class: l.k430
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Card);
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.v430
                public final void call(Object obj) {
                    CoreModule.c.e0.F0.onNext(roj0.a);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: p8 */
    public final /* synthetic */ void m4500p8(List list) {
        ((NewMainViewModel) ((jq2) this).viewModel).f3246h.M();
    }

    /* JADX INFO: renamed from: p9 */
    public final void m4501p9() {
        if (upa.a2()) {
            CoreModule.c.f0.go();
        }
    }

    /* JADX INFO: renamed from: q6 */
    public final j760<Integer, Integer> m4502q6(xaj0<Optional<q860<User>>, Optional<q860<User>>, List<UserPrivilege>> xaj0Var) {
        int i2;
        if (xma.j4()) {
            i2 = !xma.e4() ? x2c0.n : x2c0.m;
        } else {
            i2 = x2c0.o;
        }
        Optional optional = (Optional) xaj0Var.a;
        Optional optional2 = (Optional) xaj0Var.b;
        if (!optional.isPresent() || !optional2.isPresent()) {
            return j760.a(-1, Integer.valueOf(i2));
        }
        q860 q860Var = (q860) optional.get();
        int size = !vwb.J(q860Var.f19068a) ? q860Var.f19068a.size() : 0;
        q860 q860Var2 = (q860) optional2.get();
        return j760.a(Integer.valueOf(size + (vwb.J(q860Var2.f19068a) ? 0 : q860Var2.f19069b.total)), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: q7 */
    public final void m4503q7() {
        if (xe40.m24830f().m24833h()) {
            if (!upa.q3() || CoreModule.K().me_().isFemale()) {
                CoreModule.c.r0.m5();
            } else {
                duringCreated(new v9j() { // from class: l.o830
                    public final Object call() {
                        return CoreModule.c.V1.i3(9);
                    }
                }).subscribe(mkd0.H(new e30() { // from class: l.p830
                    public final void call(Object obj) {
                        C0260a.m4181Q4((List) obj);
                    }
                }, new e30() { // from class: l.q830
                    public final void call(Object obj) {
                        C0260a.m4306u2((Throwable) obj);
                    }
                }));
            }
            if (!upa.r3() || CoreModule.K().me_().isFemale()) {
                return;
            }
            CoreModule.c.V1.i3(50);
            duringCreated(this.f3279s.distinctUntilChanged()).subscribe(mkd0.H(new e30() { // from class: l.r830
                public final void call(Object obj) {
                    xe40.m24830f().m24831e();
                }
            }, new e30() { // from class: l.t830
                public final void call(Object obj) {
                    C0260a.m4259i3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q8 */
    public final /* synthetic */ void m4504q8(User user) {
        ((NewMainViewModel) ((jq2) this).viewModel).f3246h.M();
    }

    /* JADX INFO: renamed from: q9 */
    public final void m4505q9() {
        if (((Boolean) this.f3272C.get()).booleanValue()) {
            return;
        }
        ouk.m20035j(act());
        this.f3272C.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: r6 */
    public Frag m4506r6(TabName tabName) {
        Frag fragI0 = this.f22823a.fragmentManager().i0(tabName.toString());
        if (fragI0 instanceof Frag) {
            return fragI0;
        }
        return null;
    }

    /* JADX INFO: renamed from: r7 */
    public final void m4507r7() {
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.g130
            public final void call(Object obj) {
                this.f13260a.m4354F8((c) obj);
            }
        }));
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.h130
            public final void call(Object obj) {
                this.f13836a.m4357G8((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r8 */
    public final /* synthetic */ void m4508r8(TabName tabName) {
        ((NewMainViewModel) ((jq2) this).viewModel).m4091n0();
    }

    /* JADX INFO: renamed from: r9 */
    public final void m4509r9() {
        ConversationCounterTypeSp.resetAll();
    }

    /* JADX INFO: renamed from: s6 */
    public final String m4510s6(TabName tabName) {
        PutongFrag putongFragI0 = this.f22823a.fragmentManager().i0(tabName.toString());
        return NullChecker.a(putongFragI0) ? putongFragI0.pageId() : "";
    }

    /* JADX INFO: renamed from: s7 */
    public final void m4511s7() {
        CoreModule.c.f0.Sf();
    }

    /* JADX INFO: renamed from: s8 */
    public final /* synthetic */ void m4512s8(User user) {
        bcp.INSTANCE.m11951l(act());
    }

    /* JADX INFO: renamed from: s9 */
    public final void m4513s9() {
        psl pslVarI0 = this.f22823a.fragmentManager().i0(TabName.Card.toString());
        if (pslVarI0 instanceof psl) {
            NewNewHomeFrag newNewHomeFragMo2542Y = pslVarI0.mo2542Y();
            if (newNewHomeFragMo2542Y instanceof NewNewHomeFrag) {
                newNewHomeFragMo2542Y.f455B.m19337M8();
            }
        }
    }

    /* JADX INFO: renamed from: t6 */
    public View m4514t6(TabName tabName) {
        return ((NewMainViewModel) ((jq2) this).viewModel).m4054L(tabName);
    }

    /* JADX INFO: renamed from: t7 */
    public final void m4515t7() {
        if (g6a.z()) {
            duringCreated(CoreModule.c.j0.y5(ProductCategory.get("youthVip"))).subscribe(mkd0.B());
        }
    }

    /* JADX INFO: renamed from: t8 */
    public final /* synthetic */ void m4516t8(VerificationNetworkData verificationNetworkData) {
        int i2 = verificationNetworkData.meta.code;
        if (i2 == 400314 || i2 == 400312) {
            puk0.m20720e().m20726h(verificationNetworkData.data.groupName);
            if (i2 == 400312) {
                bcp.INSTANCE.m11954o(act(), verificationNetworkData.data.status);
            } else {
                bcp.INSTANCE.m11955p(act(), verificationNetworkData.data.status);
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: t9 */
    public void m4517t9(TabName tabName, boolean z) {
        m4401R9(tabName, z, false);
        if (TabName.Me == tabName) {
            m4533x9();
        } else {
            ((NewMainViewModel) ((jq2) this).viewModel).m4093p0(tabName, z);
        }
    }

    /* JADX INFO: renamed from: u6 */
    public void m4518u6() {
        Frag fragI0 = this.f22823a.fragmentManager().i0(this.f22824b.toString());
        if ((fragI0 instanceof ConversationsTabFrag) && !fragI0.isHidden() && ((ConversationsTabFrag) fragI0).m5749c6()) {
            return;
        }
        if ((fragI0 instanceof ProfileFrag) && !fragI0.isHidden() && ((ProfileFrag) fragI0).m7427o()) {
            return;
        }
        if ((fragI0 instanceof psl) && !fragI0.isHidden() && ((psl) fragI0).mo2551o()) {
            return;
        }
        if ((fragI0 instanceof NewNewHomeFrag) && !fragI0.isHidden() && ((NewNewHomeFrag) fragI0).m711o()) {
            return;
        }
        TabName tabName = this.f22824b;
        TabName tabName2 = TabName.Card;
        if (tabName != tabName2) {
            m4422X5(tabName2);
        } else {
            this.f22823a.moveTaskToBack(true);
        }
    }

    /* JADX INFO: renamed from: u7 */
    public final void m4519u7() {
        e51.y(new Runnable() { // from class: l.f530
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.c.U.a(new d30() { // from class: l.f630
                    public final void call() {
                        CoreModule.c.f0.Ef("fake_conversation_profile_featured");
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: u8 */
    public final /* synthetic */ void m4520u8(j760 j760Var) {
        if (((Integer) j760Var.a).intValue() > -1) {
            ((NewMainViewModel) ((jq2) this).viewModel).m4099v0(TabName.Meet, ((Integer) j760Var.a).intValue());
        }
        ((NewMainViewModel) ((jq2) this).viewModel).m4101x0(TabName.Meet, ((Integer) j760Var.b).intValue());
    }

    /* JADX INFO: renamed from: u9 */
    public void m4521u9(boolean z) {
        ((NewMainViewModel) ((jq2) this).viewModel).m4093p0(TabName.FEATURED, z);
    }

    /* JADX INFO: renamed from: v */
    public String m4522v() {
        PutongFrag putongFrag = this.f3281u;
        return putongFrag != null ? putongFrag.pageId() : getClass().getName();
    }

    /* JADX INFO: renamed from: v6 */
    public void m4523v6() {
        ((NewMainViewModel) ((jq2) this).viewModel).m4094q0(false);
    }

    /* JADX INFO: renamed from: v8 */
    public final /* synthetic */ void m4524v8(String str) {
        Runnable runnable = this.f3278r;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: v9 */
    public void m4525v9() {
        ((NewMainViewModel) ((jq2) this).viewModel).m4094q0(true);
    }

    /* JADX INFO: renamed from: w6, reason: merged with bridge method [inline-methods] */
    public final void m4389O8() {
        NavigationBarAdmobHelper.INSTANCE.m58v();
        e51.G(new Runnable() { // from class: l.j530
            @Override // java.lang.Runnable
            public final void run() {
                this.f14940a.m4396Q7();
            }
        });
    }

    /* JADX INFO: renamed from: w7 */
    public final void m4527w7() {
        if (i36.g().n()) {
            duringCreated(i36.g().h()).subscribe(mkd0.G(new e30() { // from class: l.e430
                public final void call(Object obj) {
                    CoreModule.c.f0.dq(mqi0.m18550o());
                }
            }));
        }
        if (i36.g().m()) {
            duringCreated(m4390O9()).subscribe(mkd0.G(new e30() { // from class: l.f430
                public final void call(Object obj) {
                    i36.g().e();
                }
            }));
            lifecycle().filter(new w9j() { // from class: l.g430
                public final Object call(Object obj) {
                    return Boolean.valueOf(((c) obj) == c.i);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.h430
                public final void call(Object obj) {
                    i36.g().e();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: w8 */
    public final /* synthetic */ void m4528w8(IntlTribeBubble intlTribeBubble) {
        int i2;
        if (mqi0.m18550o() - ((Long) CoreModule.c.e0.N6.get()).longValue() <= 43200000 || intlTribeBubble == null || (i2 = intlTribeBubble.tribeCount) <= 0) {
            return;
        }
        ((NewMainViewModel) ((jq2) this).viewModel).m4035A0(i2, new com.p1.mobile.android.ui.bubble.a.c() { // from class: l.t530
            /* JADX INFO: renamed from: a */
            public final void m22464a(String str) {
                this.f20561a.m4524v8(str);
            }
        });
    }

    /* JADX INFO: renamed from: w9 */
    public void m4529w9(Boolean bool) {
        ((NewMainViewModel) ((jq2) this).viewModel).m4096s0(bool.booleanValue());
    }

    /* JADX INFO: renamed from: x6 */
    public final void m4530x6() {
        act();
        CoreModule.c.e0.g5 = false;
    }

    /* JADX INFO: renamed from: x7 */
    public final void m4531x7() {
        if (lac0.m()) {
            duringCreated(CoreModule.c.Q1.R.k().take(1).flatMap(new w9j() { // from class: l.e330
                public final Object call(Object obj) {
                    return this.f12191a.m4361H8((MonetizationConfiguration) obj);
                }
            }).filter(new w9j() { // from class: l.f330
                public final Object call(Object obj) {
                    return Boolean.valueOf(((j760) obj).b == c.i);
                }
            })).subscribe(mkd0.H(new e30() { // from class: l.g330
                public final void call(Object obj) {
                    this.f13297a.m4369J8((j760) obj);
                }
            }, new e30() { // from class: l.h330
                public final void call(Object obj) {
                    C0260a.m4205V1((Throwable) obj);
                }
            }));
            if (((Boolean) lac0.i().a.get()).booleanValue()) {
                return;
            }
            lac0.i().a.put(Boolean.TRUE);
            ArrayList arrayList = new ArrayList();
            arrayList.add("https://auto.tancdn.com/v1/raw/0fdc8f64-5452-4968-85c0-79b096797fdc12.svga");
            arrayList.add("https://auto.tancdn.com/v1/raw/41db580d-31c8-4180-8063-c656e986409212.svga");
            arrayList.add("https://auto.tancdn.com/v1/raw/c8af9bff-3dbd-425d-9be3-058125b716eb13.svga");
            arrayList.add("https://auto.tancdn.com/v1/raw/31429bf5-9bbd-42df-b607-5a5929f6256b12.svga");
            SVGALoader.with(act()).batchDownload(arrayList);
        }
    }

    /* JADX INFO: renamed from: x8 */
    public final /* synthetic */ void m4532x8(Envelope envelope) {
        m4517t9(TabName.Me, m4339B9());
    }

    /* JADX INFO: renamed from: x9 */
    public void m4533x9() {
        boolean z = this.f3270A;
        if (upa.o2() && !upa.p2()) {
            ((NewMainViewModel) ((jq2) this).viewModel).m4056M(TabName.Me, NewMainViewModel.IconDotType.edit_profile, false);
            this.f3270A = false;
        }
        NewMainViewModel newMainViewModel = (NewMainViewModel) ((jq2) this).viewModel;
        TabName tabName = TabName.Me;
        if (newMainViewModel.m4070X(tabName)) {
            return;
        }
        ((NewMainViewModel) ((jq2) this).viewModel).m4093p0(tabName, m4339B9());
        if (!upa.o2() || m4339B9() || upa.p2() || ((NewMainViewModel) ((jq2) this).viewModel).m4069W(tabName, BottomBarManager.DotType.ICON)) {
            return;
        }
        boolean z2 = this.f3286z;
        s7m s7mVar = ((jq2) this).viewModel;
        if (z2) {
            ((NewMainViewModel) s7mVar).m4095r0(tabName, NewMainViewModel.IconDotType.edit_profile);
        } else {
            ((NewMainViewModel) s7mVar).m4056M(tabName, NewMainViewModel.IconDotType.edit_profile, false);
        }
        boolean z3 = this.f3286z;
        this.f3270A = z3;
        if (z || !z3) {
            return;
        }
        zvf0.x("e_mytab_incomplete", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: y6 */
    public final void m4534y6() {
        if (ogl0.l()) {
            if (!((Boolean) CoreModule.c.D2.S.get()).booleanValue()) {
                CoreModule.c.D2.S.put(Boolean.TRUE);
            }
            if (((Boolean) CoreModule.c.D2.R.get()).booleanValue()) {
                CoreModule.c.f0.ap("-10025").subscribe(mkd0.H(new e30() { // from class: l.m530
                    public final void call(Object obj) {
                        CoreModule.c.D2.R.put(Boolean.FALSE);
                    }
                }, new e30() { // from class: l.n530
                    public final void call(Object obj) {
                        C0260a.m4270l2((Throwable) obj);
                    }
                }));
                return;
            }
            return;
        }
        if (((Boolean) CoreModule.c.D2.S.get()).booleanValue()) {
            CoreModule.c.D2.c3().subscribe(mkd0.H(new e30() { // from class: l.o530
                public final void call(Object obj) {
                    CoreModule.c.D2.S.put(Boolean.FALSE);
                }
            }, new e30() { // from class: l.p530
                public final void call(Object obj) {
                    C0260a.m4214X1((Throwable) obj);
                }
            }));
        }
        if (((Boolean) CoreModule.c.D2.R.get()).booleanValue()) {
            return;
        }
        CoreModule.c.D2.R.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: y7 */
    public final void m4535y7() {
        if (u59.S()) {
            duringCreated(uld0.e().j().obs()).subscribe(mkd0.G(new e30() { // from class: l.x530
                public final void call(Object obj) {
                    this.f22439a.m4373K8((Boolean) obj);
                }
            }));
            duringCreated(uld0.e().g().obs()).subscribe(mkd0.H(new e30() { // from class: l.y530
                public final void call(Object obj) {
                    this.f22896a.m4377L8((Boolean) obj);
                }
            }, new e30() { // from class: l.z530
                public final void call(Object obj) {
                    C0260a.m4170O3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: y8 */
    public final /* synthetic */ void m4536y8(RiskSelfData riskSelfData) {
        boolean z = v930.h() == TabName.Card || v930.h() == TabName.Msg;
        boolean z2 = NullChecker.a(riskSelfData) && !TextUtils.isEmpty(riskSelfData.popUpText);
        if (CoreModule.K().isMainPage(c30.d()) && z && z2) {
            qwp.i().o(act(), riskSelfData.type, riskSelfData.popUpText);
            CoreModule.c.t2.q3(riskSelfData);
        }
    }

    /* JADX INFO: renamed from: y9 */
    public void m4537y9(TabName tabName, int i2) {
        m4401R9(tabName, i2 > 0, true);
        if (TabName.Me == tabName) {
            s7m s7mVar = ((jq2) this).viewModel;
            if (i2 <= 0) {
                ((NewMainViewModel) s7mVar).m4093p0(tabName, m4339B9());
            } else if (((NewMainViewModel) s7mVar).m4069W(tabName, BottomBarManager.DotType.Dot)) {
                ((NewMainViewModel) ((jq2) this).viewModel).m4093p0(tabName, false);
            }
        }
        ((NewMainViewModel) ((jq2) this).viewModel).m4099v0(tabName, i2);
    }

    @Override // p009l.y030
    /* JADX INFO: renamed from: z1 */
    public void mo4538z1() {
        super.mo4538z1();
        m4368J7();
        CoreModule.c.H0.k5();
        if (CoreModule.K().xf()) {
            CoreModule.c.I0.P3();
        }
        if (ogl0.P()) {
            CoreModule.c.j2.j3();
        }
        if (((Long) CoreModule.c.A0.R.get()).longValue() == 0) {
            CoreModule.c.A0.R.put(Long.valueOf(mqi0.m18550o()));
        }
        m4375L6();
        CoreModule.c.m0.q2[0] = 0;
        m4417W5();
        creates(new e30() { // from class: l.h230
            public final void call(Object obj) {
                this.f13844a.m4444b9((Bundle) obj);
            }
        });
        m4376L7();
    }

    /* JADX INFO: renamed from: z7 */
    public final void m4539z7() {
        act().duringCreated(vjf0.m23406e().m23430z(), false).subscribe(mkd0.H(new e30() { // from class: l.t130
            public final void call(Object obj) {
                this.f20514a.m4381M8((roj0) obj);
            }
        }, new e30() { // from class: l.u130
            public final void call(Object obj) {
                C0260a.m4128E5((Throwable) obj);
            }
        }));
        act().duringCreated(new v9j() { // from class: l.v130
            public final Object call() {
                return ConnectivityReceiver.m();
            }
        }, false).filter(new w9j() { // from class: l.x130
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.y130
            public final void call(Object obj) {
                this.f22848a.m4385N8((NetworkInfo) obj);
            }
        }, new e30() { // from class: l.z130
            public final void call(Object obj) {
                C0260a.m4202U4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z8 */
    public final /* synthetic */ void m4540z8(String str) {
        Runnable runnable = this.f3278r;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: z9 */
    public final boolean m4541z9() {
        return CoreModule.c.x0.H4();
    }
}
