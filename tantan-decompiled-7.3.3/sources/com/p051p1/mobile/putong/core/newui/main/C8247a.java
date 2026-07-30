package com.p051p1.mobile.putong.core.newui.main;

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
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.InterfaceC0476e;
import androidx.lifecycle.Lifecycle;
import com.android.billingclient.api.AbstractC0869a;
import com.clevertap.android.sdk.Constants;
import com.google.common.base.Optional;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.ExtraActLifecycle;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.putong.api.api.PaymentApi;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.app.surveysparrow.SurveySparrowHelper;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.api.C4887e;
import com.p051p1.mobile.putong.core.api.C4888e0;
import com.p051p1.mobile.putong.core.api.C4891g;
import com.p051p1.mobile.putong.core.api.C4894i;
import com.p051p1.mobile.putong.core.api.CoreInnerPush;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.EmojiAnimData;
import com.p051p1.mobile.putong.core.data.Explore;
import com.p051p1.mobile.putong.core.data.Figure;
import com.p051p1.mobile.putong.core.data.Greeting;
import com.p051p1.mobile.putong.core.data.GreetingSummary;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p051p1.mobile.putong.core.data.InsertConversationUser;
import com.p051p1.mobile.putong.core.data.InsertConversationsList;
import com.p051p1.mobile.putong.core.data.IntlThirdQuickLoginEnvelope;
import com.p051p1.mobile.putong.core.data.IntlTribeBubble;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.MonetizationConfiguration;
import com.p051p1.mobile.putong.core.data.PopGuide;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.RegionRule;
import com.p051p1.mobile.putong.core.data.RegionRuleTag;
import com.p051p1.mobile.putong.core.data.RiskSelfData;
import com.p051p1.mobile.putong.core.data.SeeExposedUser;
import com.p051p1.mobile.putong.core.data.SeeSwitchName;
import com.p051p1.mobile.putong.core.data.TtcMigrateDisplayData;
import com.p051p1.mobile.putong.core.data.UserFeedbackInfo;
import com.p051p1.mobile.putong.core.data.UserHomeMode;
import com.p051p1.mobile.putong.core.data.UserLiveHierarchy;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.data.VisitorDoorInfo;
import com.p051p1.mobile.putong.core.newui.admob.NavigationBarAdmobHelper;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p051p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p051p1.mobile.putong.core.newui.home.frag.base.HomeLayoutFrag;
import com.p051p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p051p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeMeetFrag;
import com.p051p1.mobile.putong.core.newui.main.C8247a;
import com.p051p1.mobile.putong.core.newui.messages.C8291a;
import com.p051p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p051p1.mobile.putong.core.newui.messages.ConversationsTabFrag;
import com.p051p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p051p1.mobile.putong.core.newui.profile.ProfileFrag;
import com.p051p1.mobile.putong.core.newui.ttcmigrate.TtcAccountMigrateDisplayAct;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.BuzzComboFrag;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.pop.LoveBuzzNotifyUserPop;
import com.p051p1.mobile.putong.core.p058ui.marry.audit.MarryInfoAuditStatusAct;
import com.p051p1.mobile.putong.core.p058ui.p060gp.C8509a;
import com.p051p1.mobile.putong.data.ADInfo;
import com.p051p1.mobile.putong.data.BannerLoc;
import com.p051p1.mobile.putong.data.ConversationCounter;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.DeeplinkReport;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.LinkAction;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.NavigationCardIntent;
import com.p051p1.mobile.putong.data.OMSADLink;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.OMSLauncherInfo;
import com.p051p1.mobile.putong.data.OmsMerCuryData;
import com.p051p1.mobile.putong.data.Purpose;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.data.VerificationNetworkData;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationActionAfterCountdown;
import com.p051p1.mobile.putong.location.AbstractC13226a;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.LauncherView;
import com.p051p1.mobile.putong.p070ui.webview.AccessTokenWebViewAct;
import com.p051p1.mobile.putong.p070ui.webview.WebViewDialogAct;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p051p1.mobile.putong.util.launch.LaunchStep;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.share.QQShare;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.Notification;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;
import p153l.C16400d;
import p153l.a0g;
import p153l.a8d0;
import p153l.abe0;
import p153l.adc0;
import p153l.ar2;
import p153l.aso;
import p153l.b83;
import p153l.bep;
import p153l.bj30;
import p153l.bkj0;
import p153l.bnl0;
import p153l.byd0;
import p153l.c4f0;
import p153l.c6w;
import p153l.c70;
import p153l.cix;
import p153l.cvl;
import p153l.d09;
import p153l.d79;
import p153l.dbc0;
import p153l.dk50;
import p153l.dsc0;
import p153l.e7d0;
import p153l.esf0;
import p153l.exk;
import p153l.f7s;
import p153l.fo0;
import p153l.gra;
import p153l.gta;
import p153l.gv20;
import p153l.h39;
import p153l.h79;
import p153l.haw;
import p153l.hcm;
import p153l.hlh0;
import p153l.hmj0;
import p153l.i4g0;
import p153l.i6e;
import p153l.i8w;
import p153l.ji30;
import p153l.jm5;
import p153l.joa;
import p153l.jxd0;
import p153l.jyb;
import p153l.k930;
import p153l.kcg0;
import p153l.kec0;
import p153l.kl40;
import p153l.kx80;
import p153l.l51;
import p153l.l9c;
import p153l.lc3;
import p153l.lhl;
import p153l.ln40;
import p153l.m6i;
import p153l.m930;
import p153l.mge;
import p153l.n46;
import p153l.n70;
import p153l.nae0;
import p153l.nbw;
import p153l.ner;
import p153l.nh00;
import p153l.no7;
import p153l.o1j0;
import p153l.o2c;
import p153l.o810;
import p153l.od2;
import p153l.of7;
import p153l.ok50;
import p153l.otm;
import p153l.ovb0;
import p153l.oze;
import p153l.p040;
import p153l.p110;
import p153l.pci;
import p153l.pcj;
import p153l.pf60;
import p153l.prp0;
import p153l.psd0;
import p153l.pzi0;
import p153l.q83;
import p153l.qap;
import p153l.qcj;
import p153l.qyp;
import p153l.r8n;
import p153l.rbb0;
import p153l.rcj;
import p153l.ric0;
import p153l.s75;
import p153l.s7a;
import p153l.sbw;
import p153l.scj;
import p153l.sfj0;
import p153l.spl0;
import p153l.srf;
import p153l.sum;
import p153l.t4j;
import p153l.t7a;
import p153l.tft;
import p153l.ts9;
import p153l.tu2;
import p153l.tye;
import p153l.tzi0;
import p153l.u5g0;
import p153l.ucj;
import p153l.ud2;
import p153l.ue6;
import p153l.ug30;
import p153l.uih0;
import p153l.uqb0;
import p153l.uqi;
import p153l.utq;
import p153l.uxj0;
import p153l.v3l0;
import p153l.v60;
import p153l.vfi;
import p153l.vg60;
import p153l.w20;
import p153l.w250;
import p153l.wtd0;
import p153l.x19;
import p153l.x20;
import p153l.x95;
import p153l.xc20;
import p153l.xq8;
import p153l.xwa;
import p153l.y20;
import p153l.y5x;
import p153l.yab;
import p153l.yhi0;
import p153l.ynh0;
import p153l.zg6;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a */
/* JADX INFO: loaded from: classes11.dex */
public class C8247a extends k930<NewMainViewModel> {

    /* JADX INFO: renamed from: A */
    public boolean f25234A;

    /* JADX INFO: renamed from: B */
    public byd0 f25235B;

    /* JADX INFO: renamed from: C */
    public jxd0 f25236C;

    /* JADX INFO: renamed from: D */
    public boolean f25237D;

    /* JADX INFO: renamed from: E */
    public C22507a<Boolean> f25238E;

    /* JADX INFO: renamed from: F */
    public kcg0 f25239F;

    /* JADX INFO: renamed from: G */
    public TabName f25240G;

    /* JADX INFO: renamed from: H */
    public C22507a<uxj0> f25241H;

    /* JADX INFO: renamed from: r */
    @Nullable
    public Runnable f25242r;

    /* JADX INFO: renamed from: s */
    public C22507a<TabName> f25243s;

    /* JADX INFO: renamed from: t */
    public C22507a<uxj0> f25244t;

    /* JADX INFO: renamed from: u */
    public PutongFrag f25245u;

    /* JADX INFO: renamed from: v */
    public int f25246v;

    /* JADX INFO: renamed from: w */
    public boolean f25247w;

    /* JADX INFO: renamed from: x */
    public boolean f25248x;

    /* JADX INFO: renamed from: y */
    public boolean f25249y;

    /* JADX INFO: renamed from: z */
    public boolean f25250z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$a */
    public class a implements y20<UserFeedbackInfo> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f25251a;

        public a(boolean z) {
            this.f25251a = z;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(UserFeedbackInfo userFeedbackInfo) {
            if (this.f25251a && TextUtils.equals(a0g.m95352H(), "aiPictureDlg")) {
                return;
            }
            a0g.m95363S(C8247a.this.act(), "netPictureDlg");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$b */
    public class b implements y20<Throwable> {
        public b() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$c */
    public class c implements y20<TabName> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f25254a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f25255b;

        public c(boolean z, boolean z2) {
            this.f25254a = z;
            this.f25255b = z2;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(TabName tabName) {
            String str;
            if (this.f25254a && CoreModule.f18264c.f20381e0.m116593na().isAiFakeAvatar() && a0g.m95353I()) {
                str = "aiPictureDlg";
            } else {
                str = (this.f25255b && NullChecker.m82486a(CoreModule.f18264c.f20381e0.f89157W6) && CoreModule.f18264c.f20381e0.f89157W6.isGetFeedBackPeople) ? "netPictureDlg" : "noPictureDlg";
            }
            if (TextUtils.equals(str, "noPictureDlg")) {
                return;
            }
            a0g.m95363S(C8247a.this.act(), str);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$d */
    public class d implements y20<String> {
        public d() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            a0g.m95346B();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$e */
    public class e implements y20<Boolean> {
        public e() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            CoreModule.f18264c.f20381e0.m116614t7();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$f */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CoreModule.f18264c.f20405m0.f20148e0.m137019l(uxj0.f181467a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$g */
    public class g implements y20<PopGuide> {
        public g() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(PopGuide popGuide) {
            ((NewMainViewModel) ((ar2) C8247a.this).viewModel).m41031z0(popGuide);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$h */
    public class h implements y20<Throwable> {
        public h() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$i */
    public class i implements y20<TabName> {
        public i() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(TabName tabName) {
            if (m6i.f135005g) {
                m6i.f135005g = false;
                return;
            }
            if (tabName == TabName.Card && m6i.m157227b()) {
                m6i.m157230e(C8247a.this.act());
            } else if (tabName == TabName.Moment) {
                CoreModule.f18264c.f20381e0.f89105Q2.put(Long.valueOf(pzi0.m174454o()));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$j */
    public class j implements od2.InterfaceC19106a {
        public j() {
        }

        @Override // p153l.od2.InterfaceC19106a
        /* JADX INFO: renamed from: a */
        public Animator mo41477a(View view) {
            return null;
        }

        @Override // p153l.od2.InterfaceC19106a
        /* JADX INFO: renamed from: b */
        public Animator mo41478b(View view) {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$k */
    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CoreModule.f18264c.f20339Q0.m115263k3();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$l */
    public class l extends u5g0.AbstractC20489a {
        public l() {
        }

        @Override // p153l.dyl
        public void onComplete() {
        }

        @Override // p153l.dyl
        public void onError(@Nullable Throwable th) {
            o1j0.m165626H(C8247a.this.act().getResources().getString(R$string.f19502np), null, C8247a.this.act().getResources().getDrawable(dbc0.f87131js));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$m */
    public static /* synthetic */ class m {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f25266a;

        static {
            int[] iArr = new int[TabName.values().length];
            f25266a = iArr;
            try {
                iArr[TabName.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25266a[TabName.Msg.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25266a[TabName.Live.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25266a[TabName.Moment.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25266a[TabName.Me.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25266a[TabName.Buzz.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f25266a[TabName.FEATURED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f25266a[TabName.Meet.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f25266a[TabName.VoiceChat.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$n */
    public class n implements y20<Throwable> {
        public n() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$o */
    public class o implements qcj<Long, C22421c<vg60<Conversation>>> {
        public o() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22421c<vg60<Conversation>> call(Long l2) {
            return CoreModule.f18264c.f20384f0.m33942ef();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$p */
    public class p implements qcj<pf60<vg60<Conversation>, TabName>, vg60<Conversation>> {
        public p() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public vg60<Conversation> call(pf60<vg60<Conversation>, TabName> pf60Var) {
            if (pf60Var.f152157b == TabName.Msg) {
                psd0.m173633z(C8247a.this.f25239F);
            }
            return pf60Var.f152156a;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$q */
    public class q implements qcj<vg60<Conversation>, Double> {
        public q() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double call(vg60<Conversation> vg60Var) {
            Double dValueOf = Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            int i = gra.m131708l().last_conversation_not_participating;
            if (vg60Var == null || i == 0) {
                return dValueOf;
            }
            List<Conversation> list = vg60Var.f184001a;
            if (jyb.m147479J(list)) {
                return dValueOf;
            }
            return i < list.size() ? Double.valueOf(list.get(i - 1).latestTime) : Double.valueOf(-1.0d);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$r */
    public class r implements y20<Double> {
        public r() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Double d) {
            long jRound;
            long jM33991ig;
            if (d.doubleValue() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                jM33991ig = (long) CoreModule.f18264c.f20384f0.m33991ig();
                jRound = (long) CoreModule.f18264c.f20384f0.m33593Bg();
            } else if (d.doubleValue() == -1.0d) {
                jM33991ig = -1;
                jRound = -1;
            } else {
                long jRound2 = d.doubleValue() < CoreModule.f18264c.f20384f0.m33991ig() ? Math.round(d.doubleValue()) - 1 : (long) CoreModule.f18264c.f20384f0.m33991ig();
                jRound = d.doubleValue() < CoreModule.f18264c.f20384f0.m33593Bg() ? Math.round(d.doubleValue()) - 2 : (long) CoreModule.f18264c.f20384f0.m33593Bg();
                jM33991ig = jRound2;
            }
            CoreModule.f18264c.f20384f0.f20688j0.put(Long.valueOf(jM33991ig));
            CoreModule.f18264c.f20384f0.f20694l0.put(Long.valueOf(jRound));
            CoreModule.f18264c.f20384f0.m33941dq(uqb0.f180376H.guessedCurrentServerTime());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$s */
    public class s implements y20<uxj0> {
        public s() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(uxj0 uxj0Var) {
            new ynh0(C8247a.this.act(), "p_home,accelerate_guide").show();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$t */
    public class t implements qcj<UserFeedbackInfo, Boolean> {
        public t() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(UserFeedbackInfo userFeedbackInfo) {
            return Boolean.valueOf(userFeedbackInfo.isGetFeedBackPeople);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$u */
    public class u implements qcj<UserFeedbackInfo, Boolean> {
        public u() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(UserFeedbackInfo userFeedbackInfo) {
            return Boolean.valueOf(ji30.m144964h() == TabName.Card || ji30.m144964h() == TabName.Me);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.a$v */
    public static class v extends k930.AbstractC18122b<C8247a> {
        public v(C8247a c8247a) {
            super(c8247a);
        }

        /* JADX INFO: renamed from: a */
        public void m41487a(Boolean bool, String str) {
            ((NewMainViewModel) ((ar2) ((C8247a) this.f124454a)).viewModel).m41025t0(bool.booleanValue(), str);
        }
    }

    public C8247a(ner nerVar) {
        super(nerVar);
        this.f25243s = C22507a.m222758b();
        this.f25244t = C22507a.m222758b();
        this.f25245u = null;
        this.f25247w = true;
        this.f25250z = false;
        this.f25234A = false;
        this.f25235B = new byd0("message_tips_text_update_time_" + CoreModule.m30929H().userId(), 0L);
        this.f25236C = new jxd0("static_hdr_info_reported", Boolean.FALSE);
        this.f25238E = C22507a.m222758b();
        this.f25241H = C22507a.m222759c(uxj0.f181467a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A4 */
    public static /* synthetic */ void m41034A4(Frag frag, String str, C4470c c4470c) {
        if (CoreModule.m30932N().isPhotoAlbumFrag(frag)) {
            ((FeedService.InterfaceC11577a) frag).mo64982m(str);
        }
    }

    /* JADX INFO: renamed from: B3 */
    public static /* synthetic */ void m41037B3(OMSLauncherInfo oMSLauncherInfo) {
        if (Act.foreground_() == null) {
            ok50.m167984g(oMSLauncherInfo.f39638id, oMSLauncherInfo.f39637ad.link.deeplinkReport.success);
        } else {
            ok50.m167984g(oMSLauncherInfo.f39638id, oMSLauncherInfo.f39637ad.link.deeplinkReport.failed);
        }
    }

    /* JADX INFO: renamed from: B6 */
    private void m41040B6() {
        if (gra.m131678f()) {
            duringCreated(m41331S9().distinctUntilChanged().filter(new qcj() { // from class: l.xg30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    TabName tabName = (TabName) obj;
                    return Boolean.valueOf(TextUtils.equals(tabName.name(), TabName.Card.name()) || TextUtils.equals(tabName.name(), TabName.Me.name()));
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.yg30
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20405m0.m31998F5(true);
                }
            }, new y20() { // from class: l.zg30
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41161c2((Throwable) obj);
                }
            }));
        } else if (gra.m131673e()) {
            CoreModule.f18264c.f20405m0.f20172m0.m137019l(Long.valueOf(pzi0.m174454o()));
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
    /* JADX INFO: renamed from: C3 */
    public static /* synthetic */ void m41042C3(vg60 vg60Var) {
        if (!NullChecker.m82486a(vg60Var) || jyb.m147479J(vg60Var.f184001a)) {
            return;
        }
        CoreModule.f18264c.f20384f0.m33644Ff(vg60Var.f184001a);
    }

    /* JADX INFO: renamed from: C4 */
    public static /* synthetic */ void m41043C4(Throwable th) {
    }

    /* JADX INFO: renamed from: D2 */
    public static /* synthetic */ void m41045D2() {
        if (C8291a.m42842p(CoreModule.f18264c.f20384f0.f20610J0.get())) {
            CoreModule.f18264c.f20384f0.m34015ke();
        }
    }

    /* JADX INFO: renamed from: E1 */
    public static /* synthetic */ CoreInnerPush.C4867a m41049E1(CoreInnerPush.C4867a c4867a, C4470c c4470c) {
        return c4867a;
    }

    /* JADX INFO: renamed from: E3 */
    public static /* synthetic */ void m41051E3(TabName tabName) {
        if (tabName == TabName.Msg || !CoreModule.f18264c.f20299C2.m185454w3()) {
            return;
        }
        CoreModule.f18264c.f20299C2.m185456y3();
    }

    /* JADX INFO: renamed from: F3 */
    public static /* synthetic */ void m41056F3(C4470c c4470c) {
        CoreModule.f18264c.f20396j0.m31608Q5();
        CoreModule.f18264c.f20396j0.m31606P5();
    }

    /* JADX INFO: renamed from: H2 */
    public static /* synthetic */ void m41062H2(Boolean bool) {
    }

    /* JADX INFO: renamed from: H3 */
    public static /* synthetic */ void m41063H3(GreetingSummary greetingSummary) {
        if (greetingSummary == null) {
            CoreModule.f18264c.f20420r0.m35131k5();
        } else {
            if (greetingSummary.latestTime <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return;
            }
            CoreModule.f18264c.f20420r0.m35086F5(greetingSummary, "fake_conversation_greeting");
        }
    }

    /* JADX INFO: renamed from: H4 */
    public static /* synthetic */ void m41064H4(Throwable th) {
    }

    /* JADX INFO: renamed from: I1 */
    public static /* synthetic */ void m41066I1(Throwable th) {
        abe0.f69605g = null;
        o1j0.m165634h(R$string.f19455m9);
    }

    /* JADX INFO: renamed from: I4 */
    public static /* synthetic */ void m41069I4(List list) {
        CoreModule.f18264c.f20420r0.m35090H5();
        ConversationsList.f25822t1.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: I6 */
    private void m41071I6() {
        if (gra.m131606N3()) {
            duringCreated(ExpandedCardStyleHelper.m39093o().m39112y().map(new qcj() { // from class: l.jd30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((ExpandedCardStyleHelper.C8102b) obj).f23160a;
                }
            }).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.kd30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f125148a.m41373c8((ExpandedCardStyleHelper.ExpandedCardStyle) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: L1 */
    public static /* synthetic */ void m41081L1(Throwable th) {
    }

    /* JADX INFO: renamed from: L4 */
    public static /* synthetic */ C22421c m41083L4(TabName tabName) {
        String str;
        if (tabName == TabName.Card) {
            str = "swipe";
        } else {
            str = tabName == TabName.Msg ? "message" : "me";
        }
        return CoreModule.f18264c.f20428t2.m215198l3(str);
    }

    /* JADX INFO: renamed from: L5 */
    public static /* synthetic */ void m41084L5(Throwable th) {
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ void m41086M3(Throwable th) {
    }

    /* JADX INFO: renamed from: M5 */
    public static /* synthetic */ void m41088M5(Throwable th) {
    }

    /* JADX INFO: renamed from: O1 */
    public static /* synthetic */ void m41094O1(Throwable th) {
    }

    /* JADX INFO: renamed from: O5 */
    public static /* synthetic */ void m41097O5(Throwable th) {
    }

    /* JADX INFO: renamed from: Q3 */
    public static /* synthetic */ void m41105Q3(TabName tabName) {
        if (tabName == TabName.Me) {
            CoreModule.f18264c.f20297C0.m146425v4();
        }
    }

    /* JADX INFO: renamed from: R3 */
    public static /* synthetic */ void m41110R3(Throwable th) {
    }

    /* JADX INFO: renamed from: R5 */
    public static /* synthetic */ void m41112R5(Throwable th) {
    }

    /* JADX INFO: renamed from: S4 */
    public static /* synthetic */ void m41116S4(pf60 pf60Var) {
        if (CoreModule.f18264c.f20381e0.f89078M4.get().intValue() == 0 && CoreModule.f18264c.f20381e0.m116545b8(false)) {
            CoreModule.f18264c.f20381e0.f89078M4.put(1);
        }
    }

    /* JADX INFO: renamed from: S5 */
    public static /* synthetic */ void m41117S5(Throwable th) {
    }

    /* JADX INFO: renamed from: T2 */
    public static /* synthetic */ void m41119T2(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T8 */
    public /* synthetic */ void m41123T8(Bundle bundle) {
        this.f25248x = bundle != null;
    }

    /* JADX INFO: renamed from: V1 */
    public static /* synthetic */ void m41129V1(Throwable th) {
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ uxj0 m41131V3(final List list) {
        l9c.m153394o().m153397B(new x20() { // from class: l.ed30
            @Override // p153l.x20
            public final void call() {
                C8247a.m41188i5(list);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: W1 */
    public static /* synthetic */ void m41134W1(Throwable th) {
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m41136W3(Throwable th) {
    }

    /* JADX INFO: renamed from: W6 */
    private void m41139W6() {
        if (s7a.m184984m()) {
            CoreModule.f18264c.f20340Q1.m35749k3();
        }
    }

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m41140X1(Throwable th) {
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m41147Y3(Throwable th) {
    }

    /* JADX INFO: renamed from: Z1 */
    public static /* synthetic */ void m41149Z1(Throwable th) {
    }

    /* JADX INFO: renamed from: Z4 */
    public static /* synthetic */ void m41152Z4(Throwable th) {
    }

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ void m41153a2(C4470c c4470c) {
        CoreModule.m30934Q().mo68411Lh().mo175951h();
        if (CoreModule.m30930K().mo31838xf()) {
            CoreModule.f18264c.f20315I0.m144057N3();
        }
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m41154a3(Throwable th) {
    }

    /* JADX INFO: renamed from: a4 */
    public static /* synthetic */ void m41155a4(UserLiveHierarchy userLiveHierarchy) {
        NavigationBarAdmobHelper navigationBarAdmobHelper = NavigationBarAdmobHelper.INSTANCE;
        navigationBarAdmobHelper.m37157o().put(Integer.valueOf(userLiveHierarchy.hierarchy.grade));
        navigationBarAdmobHelper.m37152j().put(Integer.valueOf(userLiveHierarchy.anchorHierarchy.grade));
    }

    /* JADX INFO: renamed from: b5 */
    public static /* synthetic */ void m41160b5(Throwable th) {
    }

    /* JADX INFO: renamed from: c2 */
    public static /* synthetic */ void m41161c2(Throwable th) {
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ void m41162c3(IntlTribeBubble intlTribeBubble) {
        int i2;
        int i3;
        if (intlTribeBubble == null || ((i2 = intlTribeBubble.seeCount) > 0 && !((i3 = intlTribeBubble.tribeCount) > 0 && i2 == i3 && i3 == intlTribeBubble.seeTribeCount))) {
            CoreModule.f18264c.f20409n1.m35278z3().m137019l(Boolean.FALSE);
        } else {
            CoreModule.f18264c.f20409n1.m35278z3().m137019l(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: c4 */
    public static /* synthetic */ void m41163c4(TabName tabName) {
        if (tabName == TabName.Msg) {
            SeeExposedUser seeExposedUserM175890A3 = CoreModule.f18264c.f20434v2.getLocalConvUserData();
            if (joa.m146386f4()) {
                if (CoreModule.f18276o.m132212b().mo34652wf() && seeExposedUserM175890A3 != null) {
                    CoreModule.f18264c.f20434v2.m175892C3(seeExposedUserM175890A3.userId, seeExposedUserM175890A3.timestamp);
                    return;
                }
                qap.Companion companion = qap.INSTANCE;
                if (companion.m175977o()) {
                    return;
                }
                CoreModule.m30930K().mo31727Rp("");
                CoreModule.f18264c.f20434v2.m175896q3();
                companion.m175982t(pzi0.m174454o());
            }
        }
    }

    /* JADX INFO: renamed from: d2 */
    public static /* synthetic */ void m41165d2(Throwable th) {
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ void m41166d3(NetworkInfo networkInfo) {
        if (prp0.m173528i().m173536o()) {
            prp0.m173528i().m173538q();
        }
    }

    /* JADX INFO: renamed from: d5 */
    public static /* synthetic */ void m41168d5(Throwable th) {
    }

    /* JADX INFO: renamed from: e2 */
    public static /* synthetic */ void m41169e2(Boolean bool) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    public static /* synthetic */ void m41171e4(pf60 pf60Var) {
        String str = (String) pf60Var.f152156a;
        if ((TextUtils.equals(UserStatus.audit, str) || TextUtils.equals("auditing", str) || TextUtils.equals("pending", str) || TextUtils.equals("denied", str) || ((Boolean) pf60Var.f152157b).booleanValue()) && TextUtils.equals(CoreModule.f18264c.f20381e0.f89178Z3.get(), UserHomeMode.marryMode)) {
            CoreModule.f18264c.f20381e0.f89178Z3.put(UserHomeMode.loveMode);
            CoreModule.f18264c.f20381e0.f89027F1.m137019l(uxj0.f181467a);
        }
    }

    /* JADX INFO: renamed from: e5 */
    public static /* synthetic */ void m41172e5(Throwable th) {
    }

    /* JADX INFO: renamed from: f4 */
    public static /* synthetic */ void m41175f4(RegionRule regionRule) {
        if (regionRule == null) {
            return;
        }
        boolean z = false;
        IntlCountryCodeController.m29129z(NullChecker.m82487b(regionRule.tags) && (regionRule.tags.contains(RegionRuleTag.get(RegionRuleTag.GDPR)) || regionRule.tags.contains(RegionRuleTag.get(RegionRuleTag.CCPA))));
        if (NullChecker.m82487b(regionRule.tags) && regionRule.tags.contains(RegionRuleTag.get(RegionRuleTag.f21235BS))) {
            z = true;
        }
        IntlCountryCodeController.m29128y(z);
        if (CoreModule.m30934Q().mo68438a().mo134409a()) {
            CoreModule.m30934Q().mo68466rk(regionRule.liveRegionTag);
        }
        try {
            uqb0.m197255X0("live_region", regionRule.liveRegionTag.toString());
        } catch (Exception e2) {
            CrashHelper.m82479c(e2);
        }
        CoreModule.f18264c.f20381e0.m116551ca();
    }

    /* JADX INFO: renamed from: g2 */
    public static /* synthetic */ void m41177g2(Throwable th) {
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ void m41178g3(Throwable th) {
        CoreModule.f18264c.f20409n1.m35274R3(false);
        ConversationsList.m42339A2();
    }

    /* JADX INFO: renamed from: h3 */
    public static /* synthetic */ void m41182h3(Throwable th) {
    }

    /* JADX INFO: renamed from: i4 */
    public static /* synthetic */ void m41187i4(Act.C4450r c4450r) {
        WeakReference<Activity> weakReference;
        if (c4450r == null || (weakReference = c4450r.f16062a) == null || !(weakReference.get() instanceof Act)) {
            return;
        }
        hcm.m134472r().m134477E(false);
        hcm.m134472r().m134478F((Act) c4450r.f16062a.get());
    }

    /* JADX INFO: renamed from: i5 */
    public static /* synthetic */ void m41188i5(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Conversation conversation = (Conversation) it.next();
            if (NullChecker.m82486a(conversation.property) && NullChecker.m82486a(conversation.property.limitedTrialSee) && TextUtils.equals(conversation.property.limitedTrialSee.actorId, CoreModule.m30929H().userId())) {
                conversation.localIsLimitedTrialSee = 1;
                CoreModule.f18272k.f115545m.upsert(conversation);
            }
        }
    }

    /* JADX INFO: renamed from: l2 */
    public static /* synthetic */ void m41197l2(Throwable th) {
    }

    /* JADX INFO: renamed from: l4 */
    public static /* synthetic */ void m41199l4(C4470c c4470c) {
        Long lValueOf = CoreModule.f18264c.f20429u0.f19996l0.get();
        if (lValueOf.longValue() <= 0) {
            lValueOf = Long.valueOf(pzi0.m174454o());
        }
        CoreModule.f18264c.f20432v0.m153369A3(lValueOf.longValue());
        CoreModule.f18264c.f20432v0.m153388y3("", lValueOf.longValue());
    }

    /* JADX INFO: renamed from: m3 */
    public static /* synthetic */ void m41202m3(Throwable th) {
    }

    /* JADX INFO: renamed from: n4 */
    public static /* synthetic */ void m41207n4(Throwable th) {
    }

    /* JADX INFO: renamed from: n5 */
    public static /* synthetic */ void m41208n5(Throwable th) {
    }

    /* JADX INFO: renamed from: o2 */
    public static /* synthetic */ Double m41209o2(vg60 vg60Var) {
        return (!NullChecker.m82486a(vg60Var) || jyb.m147479J(vg60Var.f184001a)) ? Double.valueOf(-1.0d) : Double.valueOf(((Conversation) vg60Var.f184001a.get(0)).latestTime);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o3 */
    public static /* synthetic */ void m41210o3(pf60 pf60Var) {
        VisitorDoorInfo visitorDoorInfo = (VisitorDoorInfo) pf60Var.f152156a;
        CoreLikers.C4870a c4870a = (CoreLikers.C4870a) pf60Var.f152157b;
        if ((!NullChecker.m82486a(c4870a) || c4870a.f20013c <= 0) && visitorDoorInfo != null && !TextUtils.isEmpty(visitorDoorInfo.userID) && (visitorDoorInfo.unReadCount > 0 || c4870a == null || c4870a.f20012b <= 0)) {
            CoreModule.f18264c.f20409n1.m35274R3(true);
        } else {
            CoreModule.f18264c.f20409n1.m35274R3(false);
        }
        ConversationsList.m42339A2();
    }

    /* JADX INFO: renamed from: o4 */
    public static /* synthetic */ void m41211o4(Throwable th) {
    }

    /* JADX INFO: renamed from: p3 */
    public static /* synthetic */ void m41214p3(Throwable th) {
    }

    /* JADX INFO: renamed from: p4 */
    public static /* synthetic */ void m41215p4(Throwable th) {
    }

    /* JADX INFO: renamed from: p5 */
    public static /* synthetic */ void m41216p5(no7.C18912a c18912a) {
        if (!NullChecker.m82486a(c18912a) || !NullChecker.m82486a(c18912a.f142925d)) {
            C4883c c4883c = CoreModule.f18264c;
            c4883c.f20384f0.m33778Qg(c4883c.f20381e0.m116600p9().f56859id, pzi0.m174454o(), 0, 0);
        } else {
            C4891g c4891g = CoreModule.f18264c.f20384f0;
            Greeting greeting = c18912a.f142925d;
            c4891g.m33778Qg(greeting.otherUser, greeting.latestTime, c18912a.f142922a, c18912a.f142923b);
        }
    }

    /* JADX INFO: renamed from: r2 */
    public static /* synthetic */ void m41221r2(List list) {
        ConversationsList.f25821s1.m137019l(list);
        StringBuilder sb = new StringBuilder("convListPre 预加载完成 ");
        sb.append(NullChecker.m82486a(list) ? list.size() : 0);
        ue6.m195658C(sb.toString());
    }

    /* JADX INFO: renamed from: s3 */
    public static /* synthetic */ void m41226s3(Throwable th) {
    }

    /* JADX INFO: renamed from: s5 */
    public static /* synthetic */ void m41228s5(Throwable th) {
    }

    /* JADX INFO: renamed from: u3 */
    public static /* synthetic */ void m41234u3(Throwable th) {
    }

    /* JADX INFO: renamed from: u5 */
    public static /* synthetic */ void m41236u5(Throwable th) {
    }

    /* JADX INFO: renamed from: w3 */
    public static /* synthetic */ void m41242w3(Throwable th) {
    }

    /* JADX INFO: renamed from: x2 */
    public static /* synthetic */ void m41245x2(Throwable th) {
    }

    /* JADX INFO: renamed from: x3 */
    public static /* synthetic */ void m41246x3(Throwable th) {
    }

    /* JADX INFO: renamed from: x5 */
    public static /* synthetic */ void m41248x5(Bundle bundle) {
    }

    /* JADX INFO: renamed from: x7 */
    private void m41249x7() {
        lifecycle().filter(new qcj() { // from class: l.yc30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(C4470c.f16267i == ((C4470c) obj));
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.zc30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41056F3((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z4 */
    public static /* synthetic */ void m41256z4(Throwable th) {
    }

    /* JADX INFO: renamed from: z5 */
    public static /* synthetic */ void m41257z5(C4470c c4470c) {
        if (NotificationCheckerCommon.m80403a() != NotificationCheckerCommon.State.closed) {
            if (CoreModule.f18264c.f20381e0.f89278m0.get().longValue() == 0) {
                CoreModule.f18264c.f20381e0.f89278m0.put(Long.valueOf(pzi0.m174454o()));
            }
        } else if (CoreModule.f18264c.f20381e0.f89278m0.get().longValue() > 0) {
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
    }

    /* JADX INFO: renamed from: A6 */
    public final void m41258A6() {
        if (spl0.m187386l()) {
            if (!CoreModule.f18264c.f20302D2.f140655S.get().booleanValue()) {
                CoreModule.f18264c.f20302D2.f140655S.put(Boolean.TRUE);
            }
            if (CoreModule.f18264c.f20302D2.f140654R.get().booleanValue()) {
                CoreModule.f18264c.f20384f0.m33905ap(User.ID_AI_1V1).subscribe(psd0.m173597H(new y20() { // from class: l.ae30
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        CoreModule.f18264c.f20302D2.f140654R.put(Boolean.FALSE);
                    }
                }, new y20() { // from class: l.be30
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        C8247a.m41094O1((Throwable) obj);
                    }
                }));
                return;
            }
            return;
        }
        if (CoreModule.f18264c.f20302D2.f140655S.get().booleanValue()) {
            CoreModule.f18264c.f20302D2.m161901c3().subscribe(psd0.m173597H(new y20() { // from class: l.ce30
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20302D2.f140655S.put(Boolean.FALSE);
                }
            }, new y20() { // from class: l.de30
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41154a3((Throwable) obj);
                }
            }));
        }
        if (CoreModule.f18264c.f20302D2.f140654R.get().booleanValue()) {
            return;
        }
        CoreModule.f18264c.f20302D2.f140654R.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: A7 */
    public final void m41259A7() {
        if (d79.m114661T()) {
            duringCreated(wtd0.m207833e().m207840j().obs()).subscribe(psd0.m173596G(new y20() { // from class: l.le30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f131711a.m41310N8((Boolean) obj);
                }
            }));
            duringCreated(wtd0.m207833e().m207838g().obs()).subscribe(psd0.m173597H(new y20() { // from class: l.me30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f136433a.m41314O8((Boolean) obj);
                }
            }, new y20() { // from class: l.ne30
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41043C4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: A8 */
    public final /* synthetic */ void m41260A8(Envelope envelope) {
        m41456w9(TabName.Me, m41276E9());
    }

    /* JADX INFO: renamed from: A9 */
    public void m41261A9() {
        boolean z = this.f25234A;
        if (gra.m131726o2() && !gra.m131731p2()) {
            ((NewMainViewModel) this.viewModel).m40985M(TabName.Me, NewMainViewModel.IconDotType.edit_profile, false);
            this.f25234A = false;
        }
        NewMainViewModel newMainViewModel = (NewMainViewModel) this.viewModel;
        TabName tabName = TabName.Me;
        if (newMainViewModel.m40999X(tabName)) {
            return;
        }
        boolean zM41276E9 = m41276E9();
        ((NewMainViewModel) this.viewModel).m41021p0(tabName, zM41276E9);
        if (!gra.m131726o2() || zM41276E9 || gra.m131731p2() || ((NewMainViewModel) this.viewModel).m40998W(tabName, BottomBarManager.DotType.ICON)) {
            return;
        }
        boolean z2 = this.f25250z;
        V v2 = this.viewModel;
        if (z2) {
            ((NewMainViewModel) v2).m41023r0(tabName, NewMainViewModel.IconDotType.edit_profile);
        } else {
            ((NewMainViewModel) v2).m40985M(tabName, NewMainViewModel.IconDotType.edit_profile, false);
        }
        boolean z3 = this.f25250z;
        this.f25234A = z3;
        if (z || !z3) {
            return;
        }
        i4g0.m138526x("e_mytab_incomplete", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: B7 */
    public final void m41262B7() {
        act().duringCreated((C22421c) esf0.m122324e().m122348z(), false).subscribe(psd0.m173597H(new y20() { // from class: l.ha30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108465a.m41318P8((uxj0) obj);
            }
        }, new y20() { // from class: l.ja30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41165d2((Throwable) obj);
            }
        }));
        act().duringCreated(new pcj() { // from class: l.ka30
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return ConnectivityReceiver.m82473m();
            }
        }, false).filter(new qcj() { // from class: l.la30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.ma30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135467a.m41322Q8((NetworkInfo) obj);
            }
        }, new y20() { // from class: l.na30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41140X1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B8 */
    public final /* synthetic */ void m41263B8(RiskSelfData riskSelfData) {
        boolean z = ji30.m144964h() == TabName.Card || ji30.m144964h() == TabName.Msg;
        boolean z2 = NullChecker.m82486a(riskSelfData) && !TextUtils.isEmpty(riskSelfData.popUpText);
        if (CoreModule.m30930K().isMainPage(w20.m204489d()) && z && z2) {
            qyp.m178723i().m178730o(act(), riskSelfData.type, riskSelfData.popUpText);
            CoreModule.f18264c.f20428t2.m215203q3(riskSelfData);
        }
    }

    /* JADX INFO: renamed from: B9 */
    public void m41264B9(TabName tabName, int i2) {
        m41342V9(tabName, i2 > 0, true);
        if (TabName.Me == tabName) {
            V v2 = this.viewModel;
            if (i2 <= 0) {
                ((NewMainViewModel) v2).m41021p0(tabName, m41276E9());
            } else if (((NewMainViewModel) v2).m40998W(tabName, BottomBarManager.DotType.Dot)) {
                ((NewMainViewModel) this.viewModel).m41021p0(tabName, false);
            }
        }
        ((NewMainViewModel) this.viewModel).m41027v0(tabName, i2);
    }

    /* JADX INFO: renamed from: C6 */
    public final void m41265C6() {
        if (!gra.m131576H3() || CoreModule.f18264c.f20381e0.f89352w2.get().booleanValue()) {
            return;
        }
        CoreModule.f18264c.f20366Z.f20884S.m159280q().subscribe(psd0.m173597H(new y20() { // from class: l.fe30
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20381e0.f89352w2.put(Boolean.TRUE);
            }
        }, new y20() { // from class: l.ge30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41136W3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C7, reason: merged with bridge method [inline-methods] */
    public final void m41330S8() {
        duringCreated(ConnectivityReceiver.m82473m()).skip(1).filter(new qcj() { // from class: l.za30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.ab30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41166d3((NetworkInfo) obj);
            }
        }));
        m41259A7();
        m41316P6();
        m41420o6();
        m41412m6();
        m41445u7();
        m41396i6();
        m41361a6();
        m41265C6();
        m41417n7();
        uqb0.m197283r0(new Runnable() { // from class: l.bb30
            @Override // java.lang.Runnable
            public final void run() {
                this.f75770a.m41326R8();
            }
        }, true);
        m41269D6();
        m41454w7();
        m41450v7();
        m41258A6();
    }

    /* JADX INFO: renamed from: C8 */
    public final /* synthetic */ void m41267C8(String str) {
        Runnable runnable = this.f25242r;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: C9 */
    public final boolean m41268C9() {
        return CoreModule.f18264c.f20438x0.m31176H4();
    }

    /* JADX INFO: renamed from: D6 */
    public final void m41269D6() {
        if (!s75.m184965m()) {
            if (CoreModule.f18264c.f20392h2.f142921X.get().booleanValue()) {
                CoreModule.f18264c.f20392h2.m164073D3();
                CoreModule.f18264c.f20392h2.f142921X.put(Boolean.FALSE);
                return;
            }
            return;
        }
        duringCreated(CoreModule.f18264c.f20392h2.f142918U).subscribe(psd0.m173597H(new y20() { // from class: l.ie30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41216p5((no7.C18912a) obj);
            }
        }, new y20() { // from class: l.je30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41215p4((Throwable) obj);
            }
        }));
        if (!CoreModule.f18264c.f20381e0.m116600p9().isFemale()) {
            s75.m184964l().m184971o();
        }
        s75.m184964l();
        s75.m184967p();
    }

    /* JADX INFO: renamed from: D7 */
    public final void m41270D7() {
        duringCreated(this.f25243s.distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.wf30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188741a.m41341V8((TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D8 */
    public final /* synthetic */ void m41271D8(Bundle bundle) {
        if (!NullChecker.m82486a(this.viewModel) || ((NewMainViewModel) this.viewModel).m40997V() || cix.m110032a()) {
            return;
        }
        sbw.INSTANCE.m185356v(act(), ((NewMainViewModel) this.viewModel).m40983L(TabName.Buzz), new C4496a.c() { // from class: l.ke30
            @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.c
            /* JADX INFO: renamed from: a */
            public final void mo21885a(String str) {
                this.f125294a.m41267C8(str);
            }
        });
    }

    /* JADX INFO: renamed from: D9 */
    public final boolean m41272D9() {
        if (CoreModule.f18264c.f20396j0.f20043n0.get().intValue() <= 0) {
            return false;
        }
        if (uqb0.f180415t < 3699000) {
            return true;
        }
        CoreModule.f18264c.f20396j0.f20043n0.put(0);
        return false;
    }

    /* JADX INFO: renamed from: E6 */
    public final void m41273E6() {
        creates(new y20() { // from class: l.xe30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193667a.m41333T7((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20381e0.m116561fa()).distinctUntilChanged().subscribe(psd0.m173597H(new y20() { // from class: l.jf30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41175f4((RegionRule) obj);
            }
        }, new y20() { // from class: l.nf30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41228s5((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).distinctUntilChanged().doOnNext(new y20() { // from class: l.pf30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152152a.m41336U7((User) obj);
            }
        }).subscribe();
        duringCreated(psd0.m173628u(CoreModule.f18264c.m32486n3(), CoreModule.f18264c.f20384f0.m33776Qe(), mge.m158199o().f136705a.map(new qcj() { // from class: l.qf30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(mge.m158199o().m158201k(BannerLoc.get("conversation")));
            }
        }).distinctUntilChanged(), CoreModule.m30934Q().mo68438a().mo134411c() ? CoreModule.m30934Q().mo68442bl() : C22421c.just(new f7s()), this.f25241H, new ucj() { // from class: l.rf30
            @Override // p153l.ucj
            /* JADX INFO: renamed from: a */
            public final Object mo115512a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return jyb.m147495Z((Counter) obj, (ConversationCounter) obj2, (Boolean) obj3, (f7s) obj4);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.sf30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167666a.m41340V7((ovb0) obj);
            }
        }, new y20() { // from class: l.tf30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41147Y3((Throwable) obj);
            }
        }));
        duringCreated(uqb0.f180396b0.f170326c.mo68411Lh().mo175947d()).subscribe(psd0.m173597H(new y20() { // from class: l.uf30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178733a.m41343W7((Integer) obj);
            }
        }, new y20() { // from class: l.vf30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41149Z1((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20384f0.f20714r2.distinctUntilChanged()).subscribe(psd0.m173597H(new y20() { // from class: l.ye30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198662a.m41347X7((Boolean) obj);
            }
        }, new y20() { // from class: l.ze30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41208n5((Throwable) obj);
            }
        }));
        duringCreated(uqb0.f180396b0.f170326c.mo68463r9().mo108370d()).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.af30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f70847a.m41352Y7((Integer) obj);
            }
        }, new y20() { // from class: l.bf30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41134W1((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20405m0.m32113h9()).subscribe(psd0.m173596G(new y20() { // from class: l.cf30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81478a.m41357Z7((uxj0) obj);
            }
        }));
        duringCreated(r8n.m180219f().f161728b.onBackpressureLatest()).filter(new qcj() { // from class: l.ef30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                InsertConversationsList insertConversationsList = (InsertConversationsList) obj;
                return Boolean.valueOf(NullChecker.m82486a(insertConversationsList) && NullChecker.m82486a(insertConversationsList.users));
            }
        }).map(new qcj() { // from class: l.ff30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Integer.valueOf(jyb.m147506f(((InsertConversationsList) obj).users, new qcj() { // from class: l.pd30
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(!((InsertConversationUser) obj2).clicked.booleanValue());
                    }
                }));
            }
        }).distinctUntilChanged().onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.gf30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f103879a.m41363a8((Integer) obj);
            }
        }));
        lifecycle().filter(new qcj() { // from class: l.hf30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).skip(1).filter(new qcj() { // from class: l.if30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(prp0.m173528i().m173536o());
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.kf30
            @Override // p153l.y20
            public final void call(Object obj) {
                prp0.m173528i().m173538q();
            }
        }));
        if (gra.m131555D2()) {
            lifecycle().filter(new qcj() { // from class: l.lf30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.mf30
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41257z5((C4470c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: E7 */
    public final void m41274E7() {
        if (gta.m132210e().m132214d().mo34923sa()) {
            duringCreated(CoreModule.f18264c.f20384f0.m33931df().map(new qcj() { // from class: l.pe30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return C8247a.m41209o2((vg60) obj);
                }
            }).distinctUntilChanged()).subscribe(psd0.m173597H(new y20() { // from class: l.ve30
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20384f0.m33766Pg(((Double) obj).doubleValue());
                }
            }, new y20() { // from class: l.we30
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41119T2((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: E8 */
    public final /* synthetic */ void m41275E8(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop, pf60 pf60Var) {
        if (NullChecker.m82486a(pf60Var) && TextUtils.equals((CharSequence) pf60Var.f152156a, "intl.text.lovebuzz.show.notify")) {
            TabName tabNameM148843b1 = m148843b1();
            if (NullChecker.m82486a(tabNameM148843b1) && TextUtils.equals(tabNameM148843b1.name(), TabName.Live.name())) {
                return;
            }
        }
        i8w.INSTANCE.m139033e(act(), null, pf60Var, loveBuzzNotifyUserPop);
    }

    /* JADX INFO: renamed from: E9 */
    public boolean m41276E9() {
        return m41303L9() || m41299K9() || m41291I9() || m41284G9() || m41288H9() || m41272D9() || m41295J9() || m41268C9() || m41280F9();
    }

    /* JADX INFO: renamed from: F6 */
    public final void m41277F6() {
        if (!gra.m131706k2()) {
            l51.m152919y(new Runnable() { // from class: l.ig30
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.oe30
                        @Override // p153l.x20
                        public final void call() {
                            CoreModule.f18264c.f20384f0.m33824Uf();
                        }
                    });
                }
            });
            return;
        }
        long jLongValue = CoreModule.f18264c.f20384f0.f20683h1.get().longValue();
        if (jLongValue < 1) {
            return;
        }
        CoreModule.f18264c.f20384f0.m34169vp(yab.m214857C(pzi0.m174454o(), jLongValue), gra.m131779z0(), gra.m131538A0(), true);
    }

    /* JADX INFO: renamed from: F7 */
    public final void m41278F7() {
        if (!gra.m131676e2()) {
            creates(new y20() { // from class: l.xf30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f194002a.m41344W8((Bundle) obj);
                }
            });
            return;
        }
        duringCreated(this.f25243s.distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.yf30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f199445a.m41348X8((TabName) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.f89234g4).subscribe(psd0.m173596G(new y20() { // from class: l.ag30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71082a.m41353Y8((String) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.f89020E1).subscribe(psd0.m173596G(new y20() { // from class: l.bg30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76565a.m41358Z8((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.f89027F1).subscribe(psd0.m173596G(new y20() { // from class: l.cg30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81619a.m41364a9((uxj0) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9().map(new qcj() { // from class: l.dg30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                User user = (User) obj;
                return pf60.m172085a(user.getUserInfoForMarryStatus(), Boolean.valueOf(user.isFakeUser()));
            }
        }).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.eg30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41171e4((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F8 */
    public final /* synthetic */ void m41279F8(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop, TabName tabName) {
        boolean z = NullChecker.m82486a(tabName) && TextUtils.equals(tabName.name(), TabName.Live.name());
        boolean zM48236q = loveBuzzNotifyUserPop.m48236q("textBuzz");
        if (z) {
            if (zM48236q) {
                loveBuzzNotifyUserPop.m48244y();
            }
        } else {
            if (zM48236q) {
                return;
            }
            pf60<String, Object> pf60VarM222761e = haw.INSTANCE.m134320a().m134319z0().m222761e();
            if (NullChecker.m82486a(pf60VarM222761e) && TextUtils.equals(pf60VarM222761e.f152156a, "intl.text.lovebuzz.show.notify")) {
                i8w.INSTANCE.m139033e(act(), null, pf60VarM222761e, loveBuzzNotifyUserPop);
            }
        }
    }

    /* JADX INFO: renamed from: F9 */
    public final boolean m41280F9() {
        if (d79.m114679g0() || d79.m114681h0()) {
            return CoreModule.f18264c.f20429u0.m31375A5();
        }
        return false;
    }

    /* JADX INFO: renamed from: G6 */
    public final void m41281G6() {
        if (spl0.m187356H()) {
            CoreModule.f18264c.f20299C2.getNeedDelLocalInstantChatGuideConversation().put(Boolean.TRUE);
            CoreModule.f18264c.f20299C2.m185456y3();
            duringCreated(this.f25243s.distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.gg30
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41051E3((TabName) obj);
                }
            }));
        } else if (CoreModule.f18264c.f20299C2.getNeedDelLocalInstantChatGuideConversation().get().booleanValue()) {
            CoreModule.f18264c.f20299C2.getNeedDelLocalInstantChatGuideConversation().put(Boolean.FALSE);
            l51.m152919y(new Runnable() { // from class: l.hg30
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20299C2.m185447m3();
                }
            });
        }
    }

    /* JADX INFO: renamed from: G7 */
    public View m41282G7(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((NewMainViewModel) this.viewModel).m40995T(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: G8 */
    public final /* synthetic */ void m41283G8(Integer num) {
        m41261A9();
    }

    /* JADX INFO: renamed from: G9 */
    public final boolean m41284G9() {
        return gra.m131731p2() && CoreModule.f18264c.f20294B0.f20503i0.get().booleanValue();
    }

    /* JADX INFO: renamed from: H6 */
    public final void m41285H6() {
        duringCreated(ji30.m144965i()).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.qh30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157503a.m41368b8((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H7 */
    public final void m41286H7() {
        if (gra.m131708l().enabled) {
            psd0.m173633z(this.f25239F);
            this.f25239F = duringCreated(ji30.m144964h() == TabName.Msg ? C22421c.timer(1500L, TimeUnit.MILLISECONDS).observeOn(fo0.m126432a()).flatMap(new o()).take(1) : psd0.m173625r(CoreModule.f18264c.f20384f0.m33942ef(), ji30.m144967k(), new rcj() { // from class: l.oa30
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return new pf60((vg60) obj, (TabName) obj2);
                }
            }).map(new p())).map(new q()).distinctUntilChanged().subscribe(psd0.m173597H(new r(), new y20() { // from class: l.pa30
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41172e5((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: H8 */
    public final /* synthetic */ void m41287H8() {
        ((NewMainViewModel) this.viewModel).m40972F();
    }

    /* JADX INFO: renamed from: H9 */
    public final boolean m41288H9() {
        return spl0.m187360L() && joa.m146386f4() && CoreModule.f18264c.f20407m2.m123959I3() > 0 && CoreModule.f18264c.f20407m2.m123965q3();
    }

    /* JADX INFO: renamed from: I7 */
    public boolean m41289I7(TabName tabName) {
        return NullChecker.m82487b(this.f124439b) && this.f124439b.equals(tabName);
    }

    /* JADX INFO: renamed from: I8 */
    public final /* synthetic */ void m41290I8(C4470c c4470c) {
        if (c4470c != C4470c.f16271m) {
            if (c4470c == C4470c.f16267i) {
                ((NewMainViewModel) this.viewModel).m40987N();
            }
        } else {
            ((NewMainViewModel) this.viewModel).m40981K();
            HomeStatisticsHelper.m37723z();
            this.f25242r = null;
            CoreModule.f18264c.f20374b2.m133768i3();
        }
    }

    /* JADX INFO: renamed from: I9 */
    public boolean m41291I9() {
        if (d79.m114661T()) {
            return !wtd0.m207833e().m207838g().get().booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: J6 */
    public final void m41292J6() {
        if (h39.m133422K()) {
            if (o810.m166444a()) {
                a8d0.m96437x0().m96440D0((NewMainAct) act());
            }
            duringCreated(C22421c.combineLatest(m41331S9().distinctUntilChanged(), lifecycle().filter(new qcj() { // from class: l.ai30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i && !Act.isFromBackground);
                }
            }), new rcj() { // from class: l.bi30
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return new pf60((TabName) obj, (C4470c) obj2);
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.n930
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f140738a.m41377d8((pf60) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: J7 */
    public boolean m41293J7() {
        V v2 = this.viewModel;
        if (v2 == 0) {
            return false;
        }
        TabName tabName = TabName.Live;
        return ((NewMainViewModel) v2).m40998W(tabName, BottomBarManager.DotType.Dot) || ((NewMainViewModel) this.viewModel).m40999X(tabName);
    }

    /* JADX INFO: renamed from: J8 */
    public final /* synthetic */ void m41294J8(C4470c c4470c) {
        if (NullChecker.m82486a(this.f25245u)) {
            if (c4470c == C4470c.f16268j) {
                m41338U9(false);
            } else if (c4470c == C4470c.f16267i) {
                m41349X9(false);
            }
        }
    }

    /* JADX INFO: renamed from: J9 */
    public final boolean m41295J9() {
        return CoreModule.f18264c.f20311G2.m153662t3();
    }

    /* JADX INFO: renamed from: K6 */
    public final void m41296K6() {
        CoreModule.f18264c.f20384f0.m34052mp(true);
    }

    /* JADX INFO: renamed from: K7 */
    public boolean m41297K7() {
        InterfaceC0476e interfaceC0476eM2558i0 = this.f124438a.fragmentManager().m2558i0(TabName.Card.toString());
        if (NullChecker.m82486a(interfaceC0476eM2558i0)) {
            return ((cvl) interfaceC0476eM2558i0).mo39558T().getTag().equals("home");
        }
        return false;
    }

    /* JADX INFO: renamed from: K8 */
    public final /* synthetic */ C22421c m41298K8(MonetizationConfiguration monetizationConfiguration) {
        return psd0.m173625r(m41331S9(), lifecycle(), new p040());
    }

    /* JADX INFO: renamed from: K9 */
    public final boolean m41299K9() {
        return CoreModule.f18264c.f20381e0.m116537Z7();
    }

    /* JADX INFO: renamed from: L6 */
    public final void m41300L6() {
        if (gra.m131621R1()) {
            duringCreated(m6i.f135001c).subscribe(psd0.m173597H(new g(), new h()));
            duringCreated(m41331S9()).distinctUntilChanged().subscribe(psd0.m173596G(new i()));
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
    /* JADX INFO: renamed from: L7 */
    public final void m41301L7() {
        final OMSLauncherInfo oMSLauncherInfo;
        String str;
        Intent intentM80571b;
        List<ResolveInfo> listQueryIntentActivities;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str2;
        String str3;
        boolean zM108261a;
        ok50.m167982e(act());
        try {
            if (!jm5.f121642e.get().booleanValue()) {
                return;
            }
            jm5.f121642e.put(Boolean.FALSE);
            oMSLauncherInfo = (OMSLauncherInfo) m148844c1().getSerializableExtra("ad_launcher_key");
        } catch (Exception e2) {
            CrashHelper.m82479c(e2);
            try {
                act().getIntent().replaceExtras((Bundle) null);
            } catch (Exception unused) {
            }
            CrashHelper.m82479c(e2);
            oMSLauncherInfo = null;
        }
        if (oMSLauncherInfo == null) {
            return;
        }
        double doubleExtra = m148844c1().getDoubleExtra("ad_launcher_touch_key", -1.0d);
        if (!NullChecker.m82486a(oMSLauncherInfo.f39637ad) || !LauncherView.m80570a(oMSLauncherInfo.f39637ad)) {
            if (TextUtils.isEmpty(oMSLauncherInfo.href)) {
                return;
            }
            m41305M7(oMSLauncherInfo.href);
            return;
        }
        boolean zEquals = TEnum.equals(oMSLauncherInfo.f39637ad.link.action, LinkAction.wechatMiniProgram);
        ADInfo aDInfo = oMSLauncherInfo.f39637ad;
        if (zEquals) {
            if (TextUtils.isEmpty(aDInfo.link.originalId)) {
                zM108261a = false;
            } else {
                c70 c70Var = c70.INSTANCE;
                OMSADLink oMSADLink = oMSLauncherInfo.f39637ad.link;
                zM108261a = c70Var.m108261a(oMSADLink.originalId, oMSADLink.path);
            }
            i4g0.m138495D("e_oms_open_mini_program_event", "", jyb.m147494Y("if_jump_success", Boolean.valueOf(zM108261a)), jyb.m147494Y("ad_id", oMSLauncherInfo.f39638id), jyb.m147494Y("dsp_id", oMSLauncherInfo.dspId), jyb.m147494Y(QQShare.SHARE_TO_QQ_MINI_PROGRAM_PATH, oMSLauncherInfo.f39637ad.link.path), jyb.m147494Y("mini_program_originalid", oMSLauncherInfo.f39637ad.link.originalId));
        } else {
            if (TEnum.equals(aDInfo.link.action, LinkAction.tantanDeepLink) && !TextUtils.isEmpty(oMSLauncherInfo.f39637ad.link.url) && oMSLauncherInfo.f39637ad.link.url.startsWith("tantan")) {
                String strReplace = oMSLauncherInfo.f39637ad.link.url;
                if (strReplace.startsWith("tantan://")) {
                    strReplace = strReplace.replace("tantan://", "tantanapp://");
                }
                m41305M7(strReplace);
            } else {
                boolean zEquals2 = TEnum.equals(oMSLauncherInfo.f39637ad.link.action, LinkAction.deeplink);
                ADInfo aDInfo2 = oMSLauncherInfo.f39637ad;
                if (zEquals2) {
                    intentM80571b = new Intent("android.intent.action.VIEW", Uri.parse(dk50.m116217F(aDInfo2.link.url)));
                    intentM80571b.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                    listQueryIntentActivities = act().getPackageManager().queryIntentActivities(intentM80571b, 65536);
                    int size = listQueryIntentActivities.size();
                    String str4 = oMSLauncherInfo.f39638id;
                    z = true;
                    if (size > 0) {
                        ok50.m167984g(str4, oMSLauncherInfo.f39637ad.link.deeplinkReport.appInstall);
                        ok50.m167985h(oMSLauncherInfo, "appInstall", oMSLauncherInfo.f39637ad.link.deeplinkReport.appInstall);
                        Application application = App.f16088e;
                        Runnable runnable = new Runnable() { // from class: l.xb30
                            @Override // java.lang.Runnable
                            public final void run() {
                                C8247a.m41037B3(oMSLauncherInfo);
                            }
                        };
                        str = LinkAction.deeplink;
                        l51.m152888H(application, runnable, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
                        DeeplinkReport deeplinkReport = oMSLauncherInfo.f39637ad.link.deeplinkReport;
                        ok50.m167983f(oMSLauncherInfo, deeplinkReport.success, deeplinkReport.failed);
                        z2 = true;
                    } else {
                        str = LinkAction.deeplink;
                        ok50.m167984g(str4, oMSLauncherInfo.f39637ad.link.deeplinkReport.appNoInstall);
                        ok50.m167985h(oMSLauncherInfo, "appNoInstall", oMSLauncherInfo.f39637ad.link.deeplinkReport.appNoInstall);
                        intentM80571b = NullChecker.m82486a(oMSLauncherInfo.f39637ad.link.fallbackLink) ? LauncherView.m80571b(act(), dk50.m116217F(oMSLauncherInfo.f39637ad.link.fallbackLink.url), true) : null;
                    }
                } else {
                    str = LinkAction.deeplink;
                    if (!TEnum.equals(aDInfo2.link.action, "browser") || TextUtils.isEmpty(oMSLauncherInfo.f39637ad.link.url)) {
                        intentM80571b = LauncherView.m80571b(act(), dk50.m116217F(oMSLauncherInfo.f39637ad.link.url), TEnum.equals(oMSLauncherInfo.f39637ad.link.action, "webview"));
                    } else {
                        intentM80571b = new Intent("android.intent.action.VIEW");
                        intentM80571b.addCategory("android.intent.category.BROWSABLE");
                        intentM80571b.setData(Uri.parse(oMSLauncherInfo.f39637ad.link.url));
                    }
                    listQueryIntentActivities = null;
                }
                z2 = false;
                z = false;
            }
            z3 = z2;
            if (NullChecker.m82486a(intentM80571b)) {
                if (TEnum.equals(oMSLauncherInfo.f39637ad.link.action, str)) {
                    i4g0.m138495D("e_start_page_jump_result", "", jyb.m147494Y("jump_url", oMSLauncherInfo.f39637ad.link.url), jyb.m147494Y("jump_action", oMSLauncherInfo.f39637ad.link.action), jyb.m147494Y("ad_id", oMSLauncherInfo.f39638id));
                    return;
                } else {
                    Boolean bool = Boolean.FALSE;
                    i4g0.m138495D("e_start_page_jump_result", "", jyb.m147494Y("if_jump_success", bool), jyb.m147494Y("jump_types", null), jyb.m147494Y("jump_url", oMSLauncherInfo.f39637ad.link.url), jyb.m147494Y("jump_action", oMSLauncherInfo.f39637ad.link.action), jyb.m147494Y("if_app_installed", bool), jyb.m147494Y("ad_id", oMSLauncherInfo.f39638id));
                    return;
                }
            }
            try {
                OmsMerCuryData omsMerCuryData = oMSLauncherInfo.clickMercury;
                z4 = z;
                try {
                    C16400d.m113361b(omsMerCuryData.f39648id, oMSLauncherInfo.viewMercury.f39648id, omsMerCuryData.server, doubleExtra);
                    act().startActivity(intentM80571b);
                    ok50.m167984g(oMSLauncherInfo.f39638id, oMSLauncherInfo.f39637ad.trackingURLs.clickURLs);
                    ok50.m167985h(oMSLauncherInfo, "click", oMSLauncherInfo.f39637ad.trackingURLs.clickURLs);
                    str2 = str;
                    try {
                        if (TEnum.equals(oMSLauncherInfo.f39637ad.link.action, str2)) {
                            pf60 pf60VarM147494Y = jyb.m147494Y("if_jump_success", Boolean.valueOf(z4));
                            if (z4) {
                                str3 = str2;
                            } else {
                                str3 = "webview";
                            }
                            i4g0.m138495D("e_start_page_jump_result", "", pf60VarM147494Y, jyb.m147494Y("jump_types", str3), jyb.m147494Y("jump_url", oMSLauncherInfo.f39637ad.link.url), jyb.m147494Y("jump_action", oMSLauncherInfo.f39637ad.link.action), jyb.m147494Y("if_app_installed", Boolean.valueOf(z3)), jyb.m147494Y("ad_id", oMSLauncherInfo.f39638id));
                        } else {
                            i4g0.m138495D("e_start_page_jump_result", "", jyb.m147494Y("jump_url", oMSLauncherInfo.f39637ad.link.url), jyb.m147494Y("jump_action", oMSLauncherInfo.f39637ad.link.action), jyb.m147494Y("ad_id", oMSLauncherInfo.f39638id));
                        }
                    } catch (ActivityNotFoundException unused2) {
                        if (jyb.m147479J(listQueryIntentActivities)) {
                            CrashHelper.m82479c(new ActivityNotFoundException("Intent: " + intentM80571b.toString()));
                        } else {
                            CrashHelper.m82479c(new ActivityNotFoundException("Intent: " + intentM80571b.toString() + " ResolveList: " + listQueryIntentActivities.get(0).toString()));
                        }
                        if (TEnum.equals(oMSLauncherInfo.f39637ad.link.action, str2)) {
                            i4g0.m138495D("e_start_page_jump_result", "", jyb.m147494Y("jump_url", oMSLauncherInfo.f39637ad.link.url), jyb.m147494Y("jump_action", oMSLauncherInfo.f39637ad.link.action), jyb.m147494Y("ad_id", oMSLauncherInfo.f39638id));
                            return;
                        }
                        pf60 pf60VarM147494Y2 = jyb.m147494Y("if_jump_success", Boolean.FALSE);
                        if (!z4) {
                            str2 = "webview";
                        }
                        i4g0.m138495D("e_start_page_jump_result", "", pf60VarM147494Y2, jyb.m147494Y("jump_types", str2), jyb.m147494Y("jump_url", oMSLauncherInfo.f39637ad.link.url), jyb.m147494Y("jump_action", oMSLauncherInfo.f39637ad.link.action), jyb.m147494Y("if_app_installed", Boolean.valueOf(z3)), jyb.m147494Y("ad_id", oMSLauncherInfo.f39638id));
                        return;
                    }
                } catch (ActivityNotFoundException unused3) {
                    str2 = str;
                    if (jyb.m147479J(listQueryIntentActivities)) {
                        CrashHelper.m82479c(new ActivityNotFoundException("Intent: " + intentM80571b.toString() + " ResolveList: " + listQueryIntentActivities.get(0).toString()));
                    } else {
                        CrashHelper.m82479c(new ActivityNotFoundException("Intent: " + intentM80571b.toString()));
                    }
                    if (TEnum.equals(oMSLauncherInfo.f39637ad.link.action, str2)) {
                        i4g0.m138495D("e_start_page_jump_result", "", jyb.m147494Y("jump_url", oMSLauncherInfo.f39637ad.link.url), jyb.m147494Y("jump_action", oMSLauncherInfo.f39637ad.link.action), jyb.m147494Y("ad_id", oMSLauncherInfo.f39638id));
                        return;
                    }
                    pf60 pf60VarM147494Y3 = jyb.m147494Y("if_jump_success", Boolean.FALSE);
                    if (!z4) {
                        str2 = "webview";
                    }
                    i4g0.m138495D("e_start_page_jump_result", "", pf60VarM147494Y3, jyb.m147494Y("jump_types", str2), jyb.m147494Y("jump_url", oMSLauncherInfo.f39637ad.link.url), jyb.m147494Y("jump_action", oMSLauncherInfo.f39637ad.link.action), jyb.m147494Y("if_app_installed", Boolean.valueOf(z3)), jyb.m147494Y("ad_id", oMSLauncherInfo.f39638id));
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
        if (NullChecker.m82486a(intentM80571b)) {
            if (TEnum.equals(oMSLauncherInfo.f39637ad.link.action, str)) {
                i4g0.m138495D("e_start_page_jump_result", "", jyb.m147494Y("jump_url", oMSLauncherInfo.f39637ad.link.url), jyb.m147494Y("jump_action", oMSLauncherInfo.f39637ad.link.action), jyb.m147494Y("ad_id", oMSLauncherInfo.f39638id));
                return;
            } else {
                Boolean bool2 = Boolean.FALSE;
                i4g0.m138495D("e_start_page_jump_result", "", jyb.m147494Y("if_jump_success", bool2), jyb.m147494Y("jump_types", null), jyb.m147494Y("jump_url", oMSLauncherInfo.f39637ad.link.url), jyb.m147494Y("jump_action", oMSLauncherInfo.f39637ad.link.action), jyb.m147494Y("if_app_installed", bool2), jyb.m147494Y("ad_id", oMSLauncherInfo.f39638id));
                return;
            }
        }
        OmsMerCuryData omsMerCuryData2 = oMSLauncherInfo.clickMercury;
        z4 = z;
        C16400d.m113361b(omsMerCuryData2.f39648id, oMSLauncherInfo.viewMercury.f39648id, omsMerCuryData2.server, doubleExtra);
        act().startActivity(intentM80571b);
        ok50.m167984g(oMSLauncherInfo.f39638id, oMSLauncherInfo.f39637ad.trackingURLs.clickURLs);
        ok50.m167985h(oMSLauncherInfo, "click", oMSLauncherInfo.f39637ad.trackingURLs.clickURLs);
        str2 = str;
        if (TEnum.equals(oMSLauncherInfo.f39637ad.link.action, str2)) {
            pf60 pf60VarM147494Y4 = jyb.m147494Y("if_jump_success", Boolean.valueOf(z4));
            if (z4) {
                str3 = str2;
            } else {
                str3 = "webview";
            }
            i4g0.m138495D("e_start_page_jump_result", "", pf60VarM147494Y4, jyb.m147494Y("jump_types", str3), jyb.m147494Y("jump_url", oMSLauncherInfo.f39637ad.link.url), jyb.m147494Y("jump_action", oMSLauncherInfo.f39637ad.link.action), jyb.m147494Y("if_app_installed", Boolean.valueOf(z3)), jyb.m147494Y("ad_id", oMSLauncherInfo.f39638id));
        } else {
            i4g0.m138495D("e_start_page_jump_result", "", jyb.m147494Y("jump_url", oMSLauncherInfo.f39637ad.link.url), jyb.m147494Y("jump_action", oMSLauncherInfo.f39637ad.link.action), jyb.m147494Y("ad_id", oMSLauncherInfo.f39638id));
        }
    }

    /* JADX INFO: renamed from: L8 */
    public final /* synthetic */ void m41302L8() {
        q83.m175748d().m175760m(act());
    }

    /* JADX INFO: renamed from: L9 */
    public boolean m41303L9() {
        if (d79.m114661T()) {
            return !wtd0.m207833e().m207840j().get().booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: M6 */
    public final void m41304M6() {
        if (gra.m131606N3()) {
            duringCreated(ji30.m144967k().distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.ac30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f69674a.m41381e8((TabName) obj);
                }
            }));
            duringCreated(CoreModule.m30934Q().mo68410L7()).subscribe(psd0.m173596G(new y20() { // from class: l.lc30
                @Override // p153l.y20
                public final void call(Object obj) {
                    g6v.m129273f().m129282n(CoreModule.m30929H().userId());
                }
            }));
        }
    }

    /* JADX INFO: renamed from: M7 */
    public final void m41305M7(String str) {
        if (TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(abe0.f69605g) && abe0.f69605g.startsWith("tantan")) {
                nae0.m162083m(act(), Uri.parse(abe0.f69605g));
            }
            abe0.f69605g = null;
            return;
        }
        if (str.startsWith("tantan")) {
            nae0.m162083m(act(), Uri.parse(str));
        } else {
            act().startActivity(AccessTokenWebViewAct.m81333a2(act(), "", str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M8 */
    public final /* synthetic */ void m41306M8(pf60 pf60Var) {
        if (((TabName) pf60Var.f152156a) == TabName.Card && q83.m175748d().m175757j()) {
            l51.m152887G(new Runnable() { // from class: l.wd30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f188525a.m41302L8();
                }
            });
        } else {
            q83.m175748d().m175750b();
        }
    }

    /* JADX INFO: renamed from: M9 */
    public void m41307M9(CharSequence charSequence, String str, Figure figure, String str2, double d2, x20 x20Var) {
        ((NewMainViewModel) this.viewModel).m41030y0(charSequence, str, figure, str2, d2, x20Var);
    }

    /* JADX INFO: renamed from: N6 */
    public final void m41308N6() {
        if (CoreModule.f18264c.f20381e0.f89183a1.get().booleanValue()) {
            return;
        }
        CoreModule.f18264c.f20381e0.f89183a1.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: N7 */
    public final void m41309N7() {
        if (TextUtils.isEmpty(abe0.f69605g) || !abe0.f69605g.startsWith("tantan")) {
            return;
        }
        if (abe0.f69605g.contains("https://subscribe.tantanapp.com") || abe0.f69605g.contains(lhl.INSTANCE.m154220m("https://subscribe.tantanapp.com"))) {
            Uri uri = Uri.parse(abe0.f69605g.trim());
            final String strTrim = uri.getQueryParameter("url") != null ? uri.getQueryParameter("url").trim() : "";
            final boolean zEquals = "true".equals(uri.getQueryParameter("openExternalURL"));
            if (TextUtils.isEmpty(strTrim)) {
                abe0.f69605g = null;
            } else {
                duringCreated(CoreModule.f18264c.f20298C1.m124888c3()).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.aa30
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f69097a.m41369b9(zEquals, strTrim, (IntlThirdQuickLoginEnvelope) obj);
                    }
                }, new y20() { // from class: l.ba30
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        C8247a.m41066I1((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: N8 */
    public final /* synthetic */ void m41310N8(Boolean bool) {
        m41456w9(TabName.Me, m41276E9());
    }

    /* JADX INFO: renamed from: N9 */
    public void m41311N9() {
        if (hlh0.m135741a().m135743c()) {
            return;
        }
        String strM193947z = NullChecker.m82486a(CoreBusinessModule.f18252c) ? CoreBusinessModule.f18252c.m193947z() : "";
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        String strM122335m = esf0.m122324e().m122335m(strM193947z, NullChecker.m82486a(userM116600p9) ? userM116600p9.publicId : "", esf0.m122324e().m122332i(), "", false);
        if (TextUtils.isEmpty(strM122335m)) {
            return;
        }
        Intent intentM81356n2 = WebViewDialogAct.m81356n2(CoreModule.f18263b, "", strM122335m, true, true);
        intentM81356n2.putExtra("hideNavigationBar", true);
        intentM81356n2.putExtra("skipLoading", true);
        act().startActivity(intentM81356n2);
    }

    /* JADX INFO: renamed from: O6 */
    public final void m41312O6() {
        duringCreated(((PutongAct) act()).iap().m103294h()).subscribe(psd0.m173597H(new y20() { // from class: l.cd30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81104a.m41385f8((AbstractC0869a) obj);
            }
        }, new y20() { // from class: l.dd30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41256z4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O7 */
    public final void m41313O7() {
        if (!gra.m131676e2() || CoreModule.f18264c.f20381e0.f89226f4.get().booleanValue()) {
            return;
        }
        CoreModule.f18264c.f20381e0.f89226f4.put(Boolean.TRUE);
        if (this.f124443f) {
            return;
        }
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        Purpose purpose = (NullChecker.m82486a(userM116600p9.profile.extensions) && NullChecker.m82486a(userM116600p9.profile.extensions.basic) && !jyb.m147479J(userM116600p9.profile.extensions.basic.friendPurpose) && NullChecker.m82486a(userM116600p9.profile.extensions.basic.friendPurpose.get(0))) ? userM116600p9.profile.extensions.basic.friendPurpose.get(0) : null;
        if (!TextUtils.equals(CoreModule.f18264c.f20381e0.f89178Z3.get(), UserHomeMode.marryMode) && TEnum.equals(purpose, "marriage")) {
            act().startActivity(MarryInfoAuditStatusAct.m48584a2(m99640Y(), "mode_switching"));
        }
    }

    /* JADX INFO: renamed from: O8 */
    public final /* synthetic */ void m41314O8(Boolean bool) {
        m41456w9(TabName.Me, m41276E9());
    }

    /* JADX INFO: renamed from: O9 */
    public final void m41315O9() {
        c4f0.INSTANCE.m107881a(App.f16088e).getManagerImpl().mo107873c(-2147483648L, new l());
    }

    /* JADX INFO: renamed from: P6 */
    public final void m41316P6() {
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9()) && d79.m114661T()) {
            if (CoreModule.f18264c.f20381e0.m116600p9().isSVIP()) {
                CoreModule.f18264c.f20396j0.m31601N4(ProductCategory.get("svip"));
            } else if (CoreModule.f18264c.f20381e0.m116600p9().isVIP()) {
                CoreModule.f18264c.f20396j0.m31601N4(ProductCategory.get("vip"));
            }
            CoreModule.f18264c.f20396j0.m31601N4(ProductCategory.get("seeWhoLikedMe"));
        }
    }

    /* JADX INFO: renamed from: P7 */
    public final /* synthetic */ void m41317P7(Boolean bool) {
        if (bool.booleanValue()) {
            m41359Z9(true);
        }
    }

    /* JADX INFO: renamed from: P8 */
    public final /* synthetic */ void m41318P8(uxj0 uxj0Var) {
        if (!ConnectivityReceiver.m82467g() || TextUtils.isEmpty(esf0.m122324e().m122334k())) {
            return;
        }
        m41311N9();
    }

    /* JADX INFO: renamed from: P9 */
    public void m41319P9(boolean z) {
        if (z && (!CoreModule.f18264c.f20381e0.f89030F4.get().booleanValue() || !CoreModule.f18264c.f20381e0.m116545b8(false) || (CoreModule.f18264c.f20381e0.m116600p9().settings.getSettingGroup() != null && CoreModule.f18264c.f20381e0.m116600p9().settings.getSettingGroup().marriage != null && CoreModule.f18264c.f20381e0.m116600p9().settings.getSettingGroup().marriage.closeMode))) {
            act().startActivity(MarryInfoAuditStatusAct.m48584a2(act(), "mode_switching"));
            return;
        }
        CoreModule.f18264c.f20381e0.f89178Z3.put(z ? UserHomeMode.marryMode : UserHomeMode.loveMode);
        CoreModule.f18264c.f20381e0.f89027F1.m137019l(uxj0.f181467a);
        x19.m208996w().m209008L(this.f124439b, z);
    }

    /* JADX INFO: renamed from: Q6 */
    public final void m41320Q6() {
        if (d79.m114662U() || gra.m131580I2()) {
            CoreModule.f18264c.f20420r0.m35095J6();
            duringCreated(new pcj() { // from class: l.kb30
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return CoreModule.f18264c.f20420r0.m35101M6();
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.lb30
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41063H3((GreetingSummary) obj);
                }
            }, new y20() { // from class: l.mb30
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41246x3((Throwable) obj);
                }
            }));
            duringCreated(new pcj() { // from class: l.nb30
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return CoreModule.f18264c.f20420r0.m35099L6();
                }
            }).filter(new qcj() { // from class: l.ob30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.m82486a((GreetingSummary) obj));
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.qb30
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20420r0.m35086F5((GreetingSummary) obj, "fake_conversation_anonymous_greeting");
                }
            }, new y20() { // from class: l.rb30
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41117S5((Throwable) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q7 */
    public final /* synthetic */ void m41321Q7(pf60 pf60Var) {
        Objects.toString(pf60Var.f152156a);
        if (((Integer) pf60Var.f152156a).intValue() > 0) {
            otm.m169137o().m169139C(act());
        }
        otm.m169137o().m169140D(((Integer) pf60Var.f152156a).intValue());
        otm.m169137o().m169141E((Integer) pf60Var.f152157b);
    }

    /* JADX INFO: renamed from: Q8 */
    public final /* synthetic */ void m41322Q8(NetworkInfo networkInfo) {
        if (TextUtils.isEmpty(esf0.m122324e().m122334k())) {
            return;
        }
        if (!esf0.m122324e().m122331g()) {
            m41311N9();
        } else {
            if (esf0.m122324e().m122336n()) {
                return;
            }
            esf0.m122324e().m122346x().m137019l(Boolean.FALSE);
            m41311N9();
        }
    }

    /* JADX INFO: renamed from: Q9 */
    public final void m41323Q9() {
        Act act = this.f124438a;
        if (act == null) {
            return;
        }
        InterfaceC0476e interfaceC0476eM2558i0 = act.fragmentManager().m2558i0(TabName.Card.toString());
        if (interfaceC0476eM2558i0 instanceof cvl) {
            cvl cvlVar = (cvl) interfaceC0476eM2558i0;
            NewTanFragTag newTanFragTag = NewTanFragTag.HOME;
            cvlVar.mo39549I2(newTanFragTag);
            cvlVar.mo39568n2(newTanFragTag);
            CoreModule.f18264c.f20405m0.f20165j2.m137019l(uxj0.f181467a);
        }
    }

    /* JADX INFO: renamed from: R6 */
    public final void m41324R6() {
        if (gra.m131637V1()) {
            if (!C4887e.f20510F0.get().booleanValue()) {
                C4887e.f20510F0.put(Boolean.TRUE);
            }
        } else if (C4887e.f20510F0.get().booleanValue()) {
            CoreModule.f18264c.f20384f0.m33681If();
        }
        if (C4891g.f20573T2.get().booleanValue()) {
            CoreModule.f18264c.f20384f0.m33657Gf();
        }
    }

    /* JADX INFO: renamed from: R7 */
    public final /* synthetic */ void m41325R7() {
        ((NewMainViewModel) this.viewModel).m40978I0();
    }

    /* JADX INFO: renamed from: R9 */
    public final void m41327R9() {
        Act act = this.f124438a;
        if (act == null) {
            return;
        }
        InterfaceC0476e interfaceC0476eM2558i0 = act.fragmentManager().m2558i0(TabName.Card.toString());
        if (interfaceC0476eM2558i0 instanceof cvl) {
            cvl cvlVar = (cvl) interfaceC0476eM2558i0;
            NewTanFragTag newTanFragTag = NewTanFragTag.MARRY_MODE;
            cvlVar.mo39549I2(newTanFragTag);
            cvlVar.mo39568n2(newTanFragTag);
            CoreModule.f18264c.f20381e0.f89078M4.put(2);
        }
    }

    /* JADX INFO: renamed from: S6 */
    public final void m41328S6() {
        if (gra.m131637V1()) {
            CoreModule.f18264c.f20387g0.m32843R8();
            CoreModule.f18264c.f20387g0.m32852U8();
        }
    }

    /* JADX INFO: renamed from: S7 */
    public final /* synthetic */ void m41329S7() {
        n70.m161856g().m161858h(act(), new Runnable() { // from class: l.te30
            @Override // java.lang.Runnable
            public final void run() {
                this.f173439a.m41325R7();
            }
        });
    }

    /* JADX INFO: renamed from: S9 */
    public C22421c<TabName> m41331S9() {
        return this.f25243s;
    }

    /* JADX INFO: renamed from: T6 */
    public final void m41332T6() {
        x19.m208996w().m209003G(act());
        if (d09.m113373j() || d09.m113375l() || d09.m113374k()) {
            x19.m208996w().m209007K(act());
            srf.m187598a().m187599b(ExtraActLifecycle.onResumeFromBackground, new y20() { // from class: l.wb30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f188200a.m41389g8((Act) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: T7 */
    public final /* synthetic */ void m41333T7(Bundle bundle) {
        m41261A9();
    }

    /* JADX INFO: renamed from: T9 */
    public TabName m41334T9() {
        return this.f25243s.m222761e();
    }

    /* JADX INFO: renamed from: U6 */
    public final void m41335U6() {
        if ((gra.m131570G2() || gra.m131575H2() || gra.m131745s1()) && !a0g.m95356L()) {
            boolean z = gra.m131570G2() || gra.m131575H2();
            boolean zM131745s1 = gra.m131745s1();
            if (z) {
                duringCreated(CoreModule.f18264c.f20381e0.m116614t7().filter(new u()).filter(new t())).subscribe(psd0.m173597H(new a(zM131745s1), new b()));
            }
            duringCreated(ji30.m144967k().filter(new qcj() { // from class: l.ld30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    TabName tabName = (TabName) obj;
                    return Boolean.valueOf(tabName == TabName.Card || tabName == TabName.Me);
                }
            }).distinctUntilChanged()).subscribe(psd0.m173597H(new c(zM131745s1, z), new y20() { // from class: l.md30
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41214p3((Throwable) obj);
                }
            }));
            duringCreated(CoreModule.f18264c.f20381e0.m116596o9().map(new qcj() { // from class: l.nd30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((User) obj).pictures.get(0).url;
                }
            }).distinctUntilChanged().skip(1)).subscribe(psd0.m173596G(new d()));
            duringCreated(CoreModule.f18264c.f20381e0.m116596o9().map(new qcj() { // from class: l.od30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((User) obj).isAudit());
                }
            }).distinctUntilChanged()).subscribe(psd0.m173596G(new e()));
        }
    }

    /* JADX INFO: renamed from: U7 */
    public final /* synthetic */ void m41336U7(User user) {
        ((NewMainViewModel) this.viewModel).m40984L0(user.riskAuditUser(CoreModule.m30930K().getUserById("fake_risk_audit_default_" + user.f56859id)).m61308fp().profileSmall().formatted());
        m41365aa();
        m41261A9();
    }

    /* JADX INFO: renamed from: U8 */
    public final /* synthetic */ void m41337U8(Bundle bundle) {
        uqb0.f180396b0.f170324a.checkSmartLockSave(act());
    }

    /* JADX INFO: renamed from: U9 */
    public final void m41338U9(boolean z) {
        PutongFrag putongFrag = this.f25245u;
        if (putongFrag == null) {
            return;
        }
        if (putongFrag instanceof BuzzComboFrag) {
            ((BuzzComboFrag) putongFrag).m48077M4();
            return;
        }
        String tag = putongFrag.getTag();
        if (!hmj0.m135866b(tag) || !tag.equals(TabName.Card.toString())) {
            this.f25245u.mo30636J4().m152776k();
        } else if (z) {
            HomeStatisticsHelper.m37693D(false);
        }
    }

    /* JADX INFO: renamed from: V6 */
    public final void m41339V6() {
        if ((gra.m131570G2() || gra.m131575H2() || gra.m131745s1()) && !a0g.m95356L()) {
            duringCreated(CoreModule.f18264c.f20297C0.m146427y3().timeout(5L, TimeUnit.SECONDS).materialize().observeOn(fo0.m126432a()).first()).subscribe(psd0.m173596G(new y20() { // from class: l.eb30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f92827a.m41394h8((Notification) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V7 */
    public final /* synthetic */ void m41340V7(ovb0 ovb0Var) {
        Counter counter = (Counter) ovb0Var.f149248a;
        ConversationCounter conversationCounter = (ConversationCounter) ovb0Var.f149249b;
        if (conversationCounter == null) {
            return;
        }
        Boolean bool = (Boolean) ovb0Var.f149250c;
        int iMo34680E7 = gta.m132210e().m132214d().mo34680E7(conversationCounter.conversations);
        int iM117723b = dsc0.m117723b(counter, conversationCounter, bool);
        CoreModule.f18264c.f20384f0.f20720t2.m137019l(new bkj0<>(Integer.valueOf(iMo34680E7), Integer.valueOf(iM117723b - iMo34680E7), Integer.valueOf(conversationCounter.conversations.unseen)));
        int iIntValue = iM117723b + ((f7s) ovb0Var.f149251d).f97594g + uqb0.f180396b0.f170326c.mo68411Lh().mo175947d().m222761e().intValue() + CoreModule.m30934Q().mo68463r9().mo108370d().m222761e().intValue();
        if (n46.m161541g().m161551n()) {
            iIntValue += n46.m161541g().m161548k();
        }
        if (gra.m131555D2()) {
            w250.m204531a().m204535e(iIntValue);
        }
        int iMax = Math.max(iIntValue - CoreModule.f18264c.f20384f0.f20717s2, 0);
        ((NewMainViewModel) this.viewModel).m41021p0(TabName.Msg, iMax > 0 || Boolean.TRUE.equals(CoreModule.f18264c.f20384f0.f20714r2.m222761e()));
        CoreModule.f18264c.f20384f0.f20711q2.m137019l(pf60.m172085a(Integer.valueOf(iMax), 0));
    }

    /* JADX INFO: renamed from: V8 */
    public final /* synthetic */ void m41341V8(TabName tabName) {
        ((NewMainViewModel) this.viewModel).m41018m0(tabName);
        if (tabName == TabName.Msg) {
            CoreModule.f18264c.f20384f0.m33929cp();
            if (gra.m131772x3() && !CoreModule.f18264c.f20381e0.f89346v3.get().booleanValue()) {
                CoreModule.f18264c.f20381e0.f89346v3.put(Boolean.TRUE);
                o1j0.m165651y("您上线后会为您通知好友，如不需要可到隐私通知里关闭功能");
            }
        } else if (tabName == TabName.Meet) {
            Frag frag = (Frag) this.f124438a.fragmentManager().m2558i0(tabName.toString());
            if (frag instanceof IntlTribeMeetFrag) {
                ((IntlTribeMeetFrag) frag).m40457O4();
            }
        }
        TabName tabName2 = this.f25240G;
        TabName tabName3 = TabName.Live;
        if (tabName2 == tabName3 && tabName != tabName3) {
            m41452v9();
        }
        this.f25240G = tabName;
    }

    /* JADX INFO: renamed from: V9 */
    public final void m41342V9(TabName tabName, boolean z, boolean z2) {
        TabName tabName2;
        lc3 lc3VarMo68433Ys;
        V v2 = this.viewModel;
        if (v2 != 0 && z && tabName == (tabName2 = TabName.Live)) {
            boolean zM40998W = ((NewMainViewModel) v2).m40998W(tabName2, BottomBarManager.DotType.Dot);
            boolean zM40999X = ((NewMainViewModel) this.viewModel).m40999X(tabName2);
            boolean z3 = false;
            boolean z4 = (zM40998W || zM40999X) ? false : true;
            boolean z5 = z2 && !zM40999X;
            if (!z2 && !zM40998W) {
                z3 = true;
            }
            if ((z4 || z5 || z3) && (this.lifecycleProviderImpl instanceof NewMainAct) && (lc3VarMo68433Ys = CoreModule.m30934Q().mo68433Ys()) != null) {
                tft.m190985c(((NewMainAct) this.lifecycleProviderImpl).m40808c6().f152156a, lc3VarMo68433Ys.m153619a(), lc3VarMo68433Ys.f131268b, lc3VarMo68433Ys.f131269c, lc3VarMo68433Ys.f131270d);
            }
        }
    }

    /* JADX INFO: renamed from: W7 */
    public final /* synthetic */ void m41343W7(Integer num) {
        this.f25241H.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: W8 */
    public final /* synthetic */ void m41344W8(Bundle bundle) {
        ((NewMainViewModel) this.viewModel).f25203a.setDrawerLockMode(1);
    }

    /* JADX INFO: renamed from: W9 */
    public final void m41345W9(boolean z) {
        if (m.f25266a[this.f124439b.ordinal()] == 5 && gra.m131726o2() && this.f25234A && z) {
            i4g0.m138520r("e_mytab_incomplete", "p_suggest_users_home_view");
        }
    }

    /* JADX INFO: renamed from: X6 */
    public final void m41346X6() {
        if (h39.m133424M()) {
            duringCreated(new pcj() { // from class: l.og30
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return Act.foreground();
                }
            }, false).filter(new qcj() { // from class: l.pg30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(hcm.m134472r().m134487z());
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.qg30
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41187i4((Act.C4450r) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: X7 */
    public final /* synthetic */ void m41347X7(Boolean bool) {
        this.f25241H.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: X8 */
    public final /* synthetic */ void m41348X8(TabName tabName) {
        if (gra.m131676e2() && tabName == TabName.Card) {
            ((NewMainViewModel) this.viewModel).f25203a.setDrawerLockMode(0);
        } else {
            ((NewMainViewModel) this.viewModel).f25203a.setDrawerLockMode(1);
        }
    }

    /* JADX INFO: renamed from: X9 */
    public final void m41349X9(boolean z) {
        PutongFrag putongFrag = this.f25245u;
        if (putongFrag == null) {
            return;
        }
        if (putongFrag instanceof BuzzComboFrag) {
            ((BuzzComboFrag) putongFrag).m48078N4();
            return;
        }
        String tag = putongFrag.getTag();
        if (!hmj0.m135866b(tag) || !tag.equals(TabName.Card.toString())) {
            this.f25245u.mo30636J4().m152777l();
            return;
        }
        if (z) {
            HomeStatisticsHelper.m37693D(true);
            if (HomeStatisticsHelper.m37709l()) {
                HomeStatisticsHelper.m37692C(false);
                HomeStatisticsHelper.m37719v();
                HomeStatisticsHelper.m37712o();
                HomeStatisticsHelper.m37692C(true);
                HomeStatisticsHelper.m37720w();
            }
        }
    }

    /* JADX INFO: renamed from: Y5 */
    public final void m41350Y5() {
        if (gra.m131676e2()) {
            if (CoreModule.f18264c.f20381e0.m116600p9().settings.getSettingGroup() != null && CoreModule.f18264c.f20381e0.m116600p9().settings.getSettingGroup().marriage == null) {
                CrashHelper.m82479c(new RuntimeException("core.user.me_().settings.getSettingGroup().marriage == null"));
                return;
            }
            if (CoreModule.f18264c.f20381e0.m116600p9().settings.getSettingGroup() != null && CoreModule.f18264c.f20381e0.m116600p9().settings.getSettingGroup().marriage != null && CoreModule.f18264c.f20381e0.m116600p9().settings.getSettingGroup().marriage.closeMode) {
                CoreModule.f18264c.f20381e0.f89178Z3.put(UserHomeMode.loveMode);
                CoreModule.f18264c.f20381e0.f89078M4.put(2);
                return;
            }
            if (CoreModule.f18264c.f20381e0.f89078M4.get().intValue() == 2) {
                return;
            }
            if (CoreModule.f18264c.f20381e0.f89078M4.get().intValue() != 0) {
                if (CoreModule.f18264c.f20381e0.f89078M4.get().intValue() == 1) {
                    CoreModule.f18264c.f20381e0.f89078M4.put(2);
                    CoreModule.f18264c.f20381e0.f89178Z3.put(UserHomeMode.marryMode);
                    return;
                }
                return;
            }
            if (TextUtils.equals(CoreModule.f18264c.f20381e0.f89178Z3.get(), UserHomeMode.marryMode)) {
                CoreModule.f18264c.f20381e0.f89078M4.put(2);
            } else if (!CoreModule.f18264c.f20381e0.m116545b8(false)) {
                duringCreated(C22421c.combineLatest(CoreModule.f18264c.f20294B0.m32614j4().distinctUntilChanged(), CoreModule.f18264c.f20381e0.m116596o9().distinctUntilChanged(), new ug30())).subscribe(psd0.m173596G(new y20() { // from class: l.wg30
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        C8247a.m41116S4((pf60) obj);
                    }
                }));
            } else {
                CoreModule.f18264c.f20381e0.f89078M4.put(2);
                CoreModule.f18264c.f20381e0.f89178Z3.put(UserHomeMode.marryMode);
            }
        }
    }

    /* JADX INFO: renamed from: Y6 */
    public final void m41351Y6() {
        act().duringCreated((C22421c) CoreModule.f18264c.f20397j1.m31125d(), false).filter(new qcj() { // from class: l.ra30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f161894a.m41398i8((CoreInnerPush.C4867a) obj);
            }
        }).flatMap(new qcj() { // from class: l.sa30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f167002a.m41402j8((CoreInnerPush.C4867a) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.ua30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178176a.m41410l8((CoreInnerPush.C4867a) obj);
            }
        }, new y20() { // from class: l.va30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41226s3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y7 */
    public final /* synthetic */ void m41352Y7(Integer num) {
        this.f25241H.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: Y8 */
    public final /* synthetic */ void m41353Y8(String str) {
        y5x.m214336d(act(), str);
    }

    /* JADX INFO: renamed from: Y9 */
    public final void m41354Y9(String str, boolean z) {
        int i2 = m.f25266a[this.f124439b.ordinal()];
        if (i2 == 1) {
            sfj0.m185596c("e_suggest_users_home", str, sfj0.C20032a.m185615h("click_change", z ? "change" : "click"));
            return;
        }
        if (i2 == 2) {
            sfj0.m185596c("e_messages", str, sfj0.C20032a.m185615h("click_change", z ? "change" : "click"));
            NewMainViewModel newMainViewModel = (NewMainViewModel) this.viewModel;
            TabName tabName = TabName.Msg;
            if (newMainViewModel.m40998W(tabName, BottomBarManager.DotType.Dot) || ((NewMainViewModel) this.viewModel).m40999X(tabName)) {
                i4g0.m138521s("e_red_dot_message", "p_suggest_users_home_view", i6e.m138811c("red_dot", "red_dot_normal", SeeSwitchName.message_tab, "swipe_page", "sub_page_unread"));
                return;
            } else {
                i4g0.m138521s("e_red_dot_message", "p_suggest_users_home_view", i6e.m138812d());
                return;
            }
        }
        if (i2 != 4) {
            if (i2 == 5) {
                sfj0.m185596c("e_navigation", str, sfj0.C20032a.m185615h("click_change", z ? "change" : "click"));
                return;
            }
            if (i2 == 6) {
                sbw.INSTANCE.m185344i();
                nbw.INSTANCE.m162270z();
                return;
            } else {
                if (i2 != 8) {
                    return;
                }
                sfj0.m185596c("e_intl_tab_meet", "p_intl_meet_view", new sfj0.C20032a[0]);
                return;
            }
        }
        sfj0.C20032a c20032aM185615h = sfj0.C20032a.m185615h("click_change", z ? "change" : "click");
        NewMainViewModel newMainViewModel2 = (NewMainViewModel) this.viewModel;
        TabName tabName2 = TabName.Moment;
        BottomBarManager.DotType dotType = BottomBarManager.DotType.Dot;
        sfj0.m185596c("e_explore", str, c20032aM185615h, sfj0.C20032a.m185615h("red_dot", (newMainViewModel2.m40998W(tabName2, dotType) || ((NewMainViewModel) this.viewModel).m40999X(tabName2)) ? "true" : "false"), sfj0.C20032a.m185615h("tab_state", this.f25237D ? BLiveOperationActionAfterCountdown.refresh : Explore.TYPE));
        if (((NewMainViewModel) this.viewModel).m40998W(tabName2, dotType) || ((NewMainViewModel) this.viewModel).m40999X(tabName2)) {
            i4g0.m138521s("e_red_dot_explore", "p_suggest_users_home_view", i6e.m138811c("red_dot", "red_dot_normal", "explore_tab", "swipe_page", "sub_page_unread"));
        } else {
            i4g0.m138521s("e_red_dot_explore", "p_suggest_users_home_view", i6e.m138812d());
        }
    }

    /* JADX INFO: renamed from: Z5 */
    public void m41355Z5(TabName tabName) {
        mo41360a1(tabName, false);
    }

    /* JADX INFO: renamed from: Z6 */
    public final void m41356Z6() {
        CoreModule.f18264c.f20438x0.m31178I4();
        duringCreated(CoreModule.f18264c.f20438x0.m31210q4()).subscribe(psd0.m173597H(new y20() { // from class: l.ih30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114867a.m41414m8((Boolean) obj);
            }
        }, new y20() { // from class: l.jh30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41084L5((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20438x0.m31212r4()).subscribe(psd0.m173597H(new y20() { // from class: l.kh30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f126692a.m41418n8((Long) obj);
            }
        }, new y20() { // from class: l.lh30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41129V1((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20297C0.m146427y3().distinctUntilChanged()).subscribe(psd0.m173597H(new y20() { // from class: l.mh30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136826a.m41422o8((List) obj);
            }
        }, new y20() { // from class: l.nh30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41236u5((Throwable) obj);
            }
        }));
        if (d79.m114679g0() || d79.m114681h0()) {
            duringCreated(CoreModule.f18264c.f20429u0.m31497z5().distinctUntilChanged()).subscribe(psd0.m173597H(new y20() { // from class: l.oh30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f147339a.m41426p8((Long) obj);
                }
            }, new y20() { // from class: l.ph30
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41088M5((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Z7 */
    public final /* synthetic */ void m41357Z7(uxj0 uxj0Var) {
        if (m41289I7(TabName.Msg)) {
            CoreModule.f18264c.f20429u0.m31437d7(0L);
        }
    }

    /* JADX INFO: renamed from: Z8 */
    public final /* synthetic */ void m41358Z8(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        V v2 = this.viewModel;
        if (!zBooleanValue) {
            ((NewMainViewModel) v2).f25203a.m2416d(3);
        } else {
            ((NewMainViewModel) v2).f25203a.m2400I(3);
            ((NewMainViewModel) this.viewModel).m40992P0();
        }
    }

    /* JADX INFO: renamed from: Z9 */
    public final void m41359Z9(boolean z) {
        duringCreated(z ? CoreModule.f18264c.f20339Q0.m115269y3() : CoreModule.f18264c.f20339Q0.m115270z3()).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.xc30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193256a.m41386f9((TtcMigrateDisplayData) obj);
            }
        }));
        CoreModule.f18264c.f20339Q0.m115264p3(z);
    }

    @Override // p153l.k930, p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        LaunchStep launchStep = LaunchStep.NewMainBaseSub;
        uqi.m197339f(launchStep);
        yhi0.m215967a("NewMainPresenter initSubscription");
        super.mo40473a0();
        LaunchStep launchStep2 = LaunchStep.NewMainSub;
        uqi.m197338e(launchStep, launchStep2);
        xc20.m210108t(act());
        m41315O9();
        uih0.m196223s0().m196267k1();
        m41429q7();
        m41328S6();
        m41441t7();
        m41273E6();
        m41312O6();
        creates(new y20() { // from class: l.td30
            @Override // p153l.y20
            public final void call(Object obj) {
                jpd0.m146490e();
            }
        });
        creates(new y20() { // from class: l.df30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88114a.m41123T8((Bundle) obj);
            }
        }, new x20() { // from class: l.of30
            @Override // p153l.x20
            public final void call() {
                t4j.m189283j();
            }
        });
        m41316P6();
        creates(new y20() { // from class: l.zf30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204102a.m41337U8((Bundle) obj);
            }
        });
        m41324R6();
        m41296K6();
        m41285H6();
        duringCreated(this.f25243s).filter(new qcj() { // from class: l.kg30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TabName.Me.equals((TabName) obj) && CoreModule.m30930K().mo31838xf());
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.vg30
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20315I0.m144057N3();
            }
        }));
        m41320Q6();
        m41249x7();
        m41416n6();
        m41408l6();
        m41390g9();
        m41262B7();
        kx80.m151820l(act());
        m41445u7();
        m41351Y6();
        m41443t9();
        CoreModule.f18264c.f20321K0.m113318z3();
        m41409l7();
        m41432r6();
        m41392h6();
        m41270D7();
        m41466z7();
        m41384f7();
        duringCreated(act().lifecycle().filter(new qcj() { // from class: l.gh30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).skip(1)).subscribe(psd0.m173596G(new y20() { // from class: l.rh30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41153a2((C4470c) obj);
            }
        }));
        m41300L6();
        m41277F6();
        m41380e7();
        m41346X6();
        m41332T6();
        m41437s7();
        m41292J6();
        m41447u9();
        m41433r7();
        m41362a7();
        m41278F7();
        m41461y7();
        m41401j7();
        m41465z6();
        m41304M6();
        m41379e6();
        m41339V6();
        m41274E7();
        if (RemoteConfig.m80481x().m80513s("delay_jobs_after_cold_start")) {
            uqb0.m197283r0(new Runnable() { // from class: l.ci30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f81892a.m41330S8();
                }
            }, true);
        } else {
            m41330S8();
        }
        m41356Z6();
        m41040B6();
        uqi.m197337d(launchStep2);
        yhi0.m215968b();
        m41399i9();
        m41405k7();
        m41281G6();
        m41413m7();
        m41139W6();
        m41421o7();
        m41397i7();
        m41367b7();
        m41286H7();
        m41425p7();
        m41388g7();
        m41393h7();
        m41376d7();
        m41372c7();
    }

    @Override // p153l.k930
    /* JADX INFO: renamed from: a1 */
    public void mo41360a1(TabName tabName, boolean z) {
        m41424p6(tabName, z);
    }

    /* JADX INFO: renamed from: a6 */
    public final void m41361a6() {
        if (zg6.m219595f()) {
            CoreModule.f18264c.f20384f0.m33974gn();
        }
    }

    /* JADX INFO: renamed from: a7 */
    public final void m41362a7() {
        if (TEnum.equals(uqb0.f180402h0, LiveRegionTag.indonesia)) {
            final String str = CoreModule.f18264c.f20374b2.f108101R.get();
            duringCreated(CoreModule.f18264c.f20374b2.m133764e3()).subscribe(psd0.m173597H(new y20() { // from class: l.xa30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f192985a.m41430q8(str, (String) obj);
                }
            }, new y20() { // from class: l.ya30
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41112R5((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: a8 */
    public final /* synthetic */ void m41363a8(Integer num) {
        this.f25241H.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: a9 */
    public final /* synthetic */ void m41364a9(uxj0 uxj0Var) {
        if (!CoreModule.f18264c.f20381e0.f89178Z3.get().equals(UserHomeMode.marryMode)) {
            m41323Q9();
        } else {
            m41327R9();
            l51.m152888H(((NewMainViewModel) this.viewModel).getAct(), new f(), 10L);
        }
    }

    /* JADX INFO: renamed from: aa */
    public final void m41365aa() {
        if (!CoreModule.f18264c.f20381e0.m116537Z7()) {
            C4888e0.m32952a().m32958f();
        } else if (CoreModule.f18264c.f20381e0.m116579k8() || CoreModule.f18264c.f20381e0.m116525W7()) {
            C4888e0.m32952a().m32958f();
        }
    }

    /* JADX INFO: renamed from: b6 */
    public final void m41366b6() {
        act().postDelayed(new k(), 1000L);
    }

    /* JADX INFO: renamed from: b7 */
    public final void m41367b7() {
        if (CoreModule.f18276o.m132212b().mo34650Eh()) {
            duringCreated(this.f25243s.distinctUntilChanged().filter(new qcj() { // from class: l.jc30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Msg);
                }
            }).map(new qcj() { // from class: l.kc30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.f18264c.f20429u0.m31435c7();
                }
            }).flatMap(new qcj() { // from class: l.mc30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return psd0.m173625r(CoreModule.f18264c.f20409n1.m35275S3(), CoreModule.f18264c.f20429u0.m31415S6(), new rcj() { // from class: l.zd30
                        @Override // p153l.rcj
                        public final Object call(Object obj2, Object obj3) {
                            return new pf60((VisitorDoorInfo) obj2, (CoreLikers.C4870a) obj3);
                        }
                    });
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.nc30
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41210o3((pf60) obj);
                }
            }, new y20() { // from class: l.oc30
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41178g3((Throwable) obj);
                }
            }));
            duringCreated(CoreModule.f18264c.f20297C0.m146427y3().distinctUntilChanged()).subscribe(psd0.m173597H(new y20() { // from class: l.pc30
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20409n1.m35275S3();
                }
            }, new y20() { // from class: l.qc30
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41197l2((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: b8 */
    public final /* synthetic */ void m41368b8(pf60 pf60Var) {
        ((NewMainViewModel) this.viewModel).m41020o0(pf60Var);
    }

    /* JADX INFO: renamed from: b9 */
    public final /* synthetic */ void m41369b9(boolean z, String str, IntlThirdQuickLoginEnvelope intlThirdQuickLoginEnvelope) {
        HashMap map = new HashMap();
        map.put("step", "4");
        map.put("available", "true");
        map.put("code", intlThirdQuickLoginEnvelope.meta.code + "");
        map.put("tracker", "");
        if (intlThirdQuickLoginEnvelope.meta.code != 200000) {
            o1j0.m165634h(R$string.f19455m9);
        } else if (z) {
            m41427p9(act(), str, intlThirdQuickLoginEnvelope.data.code);
        } else {
            m41431q9(act(), str, intlThirdQuickLoginEnvelope.data.code);
        }
        abe0.f69605g = null;
    }

    /* JADX INFO: renamed from: ba */
    public final void m41370ba() {
        if (rbb0.m180744q() && CoreModule.f18264c.f20429u0.f19996l0.get().longValue() == 0 && CoreModule.f18264c.f20429u0.f19996l0.get().longValue() == 0) {
            CoreModule.f18264c.f20429u0.f19996l0.put(Long.valueOf(uqb0.f180376H.guessedCurrentServerTime()));
        }
    }

    /* JADX INFO: renamed from: c6 */
    public final void m41371c6() {
        duringCreated(CoreModule.f18264c.f20339Q0.m115268x3()).subscribe(psd0.m173596G(new y20() { // from class: l.qa30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156342a.m41317P7((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c7 */
    public final void m41372c7() {
        duringCreated(NavigationBarAdmobHelper.INSTANCE.m37154l()).subscribe(psd0.m173596G(new y20() { // from class: l.db30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85962a.m41434r8((Integer) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20297C0.m146427y3().distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.fb30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98035a.m41438s8((List) obj);
            }
        }));
        duringCreated(new pcj() { // from class: l.gb30
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return CoreModule.f18264c.f20381e0.m116596o9().distinctUntilChanged();
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.hb30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108562a.m41442t8((User) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20375c0.m158863c3()).subscribe(psd0.m173597H(new y20() { // from class: l.ib30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41155a4((UserLiveHierarchy) obj);
            }
        }, new n()));
        duringCreated(ji30.m144967k().distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.jb30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f119125a.m41446u8((TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c8 */
    public final /* synthetic */ void m41373c8(ExpandedCardStyleHelper.ExpandedCardStyle expandedCardStyle) {
        ((NewMainViewModel) this.viewModel).m40979J(expandedCardStyle == ExpandedCardStyleHelper.ExpandedCardStyle.EXPANDED_PROFILE_STYLE);
    }

    /* JADX INFO: renamed from: c9 */
    public final /* synthetic */ void m41374c9(User user) {
        pci.m171663L(act(), user, 0, true);
    }

    /* JADX INFO: renamed from: d6 */
    public final void m41375d6(FragmentManager fragmentManager, TabName tabName) {
        if (t4j.m189279d().m189286e()) {
            return;
        }
        boolean z = false;
        for (TabName tabName2 : TabName.values()) {
            if (tabName != tabName2 && fragmentManager.m2558i0(tabName2.toString()) == null) {
                t4j.m189279d().m189284b(act(), tabName2, new m930(this));
                z = true;
            }
        }
        if (z) {
            t4j.m189279d().m189285c(act());
        }
    }

    /* JADX INFO: renamed from: d7 */
    public final void m41376d7() {
        if (IntlCountryCodeController.m29114k() || CoreModule.f18264c.f20381e0.f89059J6.get().booleanValue()) {
            return;
        }
        duringCreated(CoreModule.f18264c.f20384f0.m34065np(MessageType.get(MessageType.local_intl_prompt_message_type))).subscribe(psd0.m173596G(new y20() { // from class: l.cb30
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20381e0.f89059J6.put(Boolean.TRUE);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d8 */
    public final /* synthetic */ void m41377d8(pf60 pf60Var) {
        o810.m166446c(act(), (TabName) pf60Var.f152156a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d9 */
    public final /* synthetic */ void m41378d9(pf60 pf60Var) {
        this.f25250z = ((Boolean) pf60Var.f152156a).booleanValue();
        long jLongValue = CoreModule.f18264c.f20381e0.f89363x6.get().longValue();
        int iM131697i3 = gra.m131697i3();
        if (((Boolean) pf60Var.f152157b).booleanValue() || (jLongValue > 1 && iM131697i3 > 0 && pzi0.m174454o() - jLongValue > ((long) iM131697i3) * 86400000)) {
            this.f25250z = false;
        }
        m41261A9();
    }

    /* JADX INFO: renamed from: e6 */
    public final void m41379e6() {
        if (gra.m131545B2()) {
            CoreModule.f18264c.f20322K1.f20748U.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: e7 */
    public final void m41380e7() {
        if (!CoreModule.f18276o.m132212b().mo34652wf() || CoreModule.m30930K().me_().isFemale()) {
            return;
        }
        duringCreated(this.f25243s.distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.sh30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41163c4((TabName) obj);
            }
        }));
        duringCreated((C22421c) this.f25243s.distinctUntilChanged().filter(new qcj() { // from class: l.th30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((TabName) obj) == TabName.Msg);
            }
        }).flatMap(new qcj() { // from class: l.uh30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20297C0.m146425v4();
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.vh30
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationsList.m42339A2();
            }
        }, new y20() { // from class: l.wh30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41242w3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e8 */
    public final /* synthetic */ void m41381e8(TabName tabName) {
        ((NewMainViewModel) this.viewModel).m40978I0();
        ((NewMainViewModel) this.viewModel).m41019n0();
        boolean zEquals = TabName.Card.equals(tabName);
        V v2 = this.viewModel;
        if (zEquals) {
            bnl0.m105537U(((NewMainViewModel) v2).f25207e, NavigationBarAdmobHelper.INSTANCE.m37153k());
        } else {
            bnl0.m105537U(((NewMainViewModel) v2).f25207e, ji30.f121041f + NavigationBarAdmobHelper.INSTANCE.m37153k());
        }
    }

    /* JADX INFO: renamed from: e9 */
    public final /* synthetic */ void m41382e9(Bundle bundle) {
        m41313O7();
        m41387g6();
        m41366b6();
        m41371c6();
        m41400j6();
        m41383f6();
    }

    /* JADX INFO: renamed from: f6 */
    public final void m41383f6() {
        if (this.f124443f || this.f124444g) {
            SurveySparrowHelper.INSTANCE.m30688l();
        }
    }

    /* JADX INFO: renamed from: f7 */
    public final void m41384f7() {
        if (bep.INSTANCE.m103749n()) {
            act().duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).filter(new qcj() { // from class: l.o930
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    User user = (User) obj;
                    return Boolean.valueOf((user == null || jyb.m147479J(user.status)) ? false : true);
                }
            }).take(2).subscribe(psd0.m173597H(new y20() { // from class: l.p930
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f151089a.m41451v8((User) obj);
                }
            }, new y20() { // from class: l.q930
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41177g2((Throwable) obj);
                }
            }));
            act().duringCreated((C22421c) v3l0.m199281e().m199282b(), false).filter(new qcj() { // from class: l.r930
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    VerificationNetworkData verificationNetworkData = (VerificationNetworkData) obj;
                    return Boolean.valueOf((verificationNetworkData == null || verificationNetworkData.meta == null || verificationNetworkData.data == null) ? false : true);
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.s930
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f166897a.m41455w8((VerificationNetworkData) obj);
                }
            }, new y20() { // from class: l.t930
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41245x2((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: f8 */
    public final /* synthetic */ void m41385f8(AbstractC0869a abstractC0869a) {
        aso.m99953h(act(), abstractC0869a).mo192810a().doOnNext(new y20() { // from class: l.fd30
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.gd30
            @Override // p153l.y20
            public final void call(Object obj) {
                PaymentApi.PaymentResultStatus.succeed;
            }
        }, new y20() { // from class: l.id30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41081L1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f9 */
    public final /* synthetic */ void m41386f9(TtcMigrateDisplayData ttcMigrateDisplayData) {
        if (ttcMigrateDisplayData.open) {
            TtcAccountMigrateDisplayAct.INSTANCE.m44875a(act(), ttcMigrateDisplayData);
        }
    }

    /* JADX INFO: renamed from: g6 */
    public final void m41387g6() {
        if (this.f124443f || this.f124444g) {
            m41359Z9(false);
        }
    }

    /* JADX INFO: renamed from: g7 */
    public final void m41388g7() {
        CoreModule.f18264c.f20429u0.m31458m5();
        CoreModule.f18264c.f20432v0.m153377n3();
        CoreModule.f18264c.f20432v0.m153376m3();
        duringCreated(lifecycle().distinctUntilChanged().filter(new qcj() { // from class: l.yb30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.zb30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41199l4((C4470c) obj);
            }
        }));
        duringCreated(psd0.m173626s(CoreModule.f18264c.f20432v0.m153380q3(), CoreModule.f18264c.f20432v0.m153379p3(), CoreModule.f18264c.f20297C0.m146427y3(), new scj() { // from class: l.bc30
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return new bkj0((Optional) obj, (Optional) obj2, (List) obj3);
            }
        }).map(new qcj() { // from class: l.cc30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f80885a.m41436s6((bkj0) obj);
            }
        }).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.dc30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f87738a.m41458x8((pf60) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20409n1.m35268A3()).subscribe(psd0.m173597H(new y20() { // from class: l.ec30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93004a.m41467z8((IntlTribeBubble) obj);
            }
        }, new y20() { // from class: l.fc30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41182h3((Throwable) obj);
            }
        }));
        if (ts9.m192573e()) {
            duringCreated(CoreModule.f18264c.f20409n1.m35277y3()).subscribe(psd0.m173597H(new y20() { // from class: l.gc30
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41162c3((IntlTribeBubble) obj);
                }
            }, new y20() { // from class: l.hc30
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41086M3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: g8 */
    public final /* synthetic */ void m41389g8(Act act) {
        x19.m208996w().m209007K(act());
    }

    /* JADX INFO: renamed from: g9 */
    public final void m41390g9() {
        if (NullChecker.m82486a(CoreModule.f18264c.f20384f0)) {
            if (CoreModule.f18264c.f20384f0.f20601G0.get().booleanValue()) {
                CoreModule.f18264c.f20384f0.m33929cp();
            }
            CoreModule.f18264c.f20384f0.m33940dp(new Runnable() { // from class: l.mg30
                @Override // java.lang.Runnable
                public final void run() {
                    C8247a.m41045D2();
                }
            });
            duringCreated(CoreModule.f18264c.f20384f0.f20639S1).subscribe(psd0.m173596G(new y20() { // from class: l.ng30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f141786a.m41374c9((User) obj);
                }
            }));
            CoreModule.f18264c.f20384f0.m34013jp();
        }
    }

    @Override // p153l.k930
    /* JADX INFO: renamed from: h1 */
    public void mo41391h1() {
        this.f124449l = new v(this);
    }

    /* JADX INFO: renamed from: h6 */
    public final void m41392h6() {
        if (gra.m131693i()) {
            CoreModule.f18264c.f20384f0.m33630Ee();
        }
    }

    /* JADX INFO: renamed from: h7 */
    public final void m41393h7() {
        if (t7a.m189547c()) {
            if (!joa.m146401n4() || !joa.m146386f4()) {
                CoreModule.f18264c.f20311G2.m153661s3();
            }
            if (!joa.m146386f4()) {
                duringCreated(CoreModule.f18264c.f20311G2.m153663u3()).subscribe(psd0.m173596G(new y20() { // from class: l.ad30
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f69784a.m41260A8((Envelope) obj);
                    }
                }));
            }
            duringCreated(m41331S9()).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.bd30
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41105Q3((TabName) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: h8 */
    public final /* synthetic */ void m41394h8(Notification notification) {
        m41335U6();
    }

    /* JADX INFO: renamed from: h9 */
    public final void m41395h9() {
        if (IntlCountryCodeController.m29114k()) {
            return;
        }
        C8509a.m46746j().m46755o(this.f124438a);
    }

    /* JADX INFO: renamed from: i6 */
    public final void m41396i6() {
        CoreModule.f18264c.f20384f0.m33592Bf();
    }

    /* JADX INFO: renamed from: i7 */
    public final void m41397i7() {
        CoreModule.f18264c.f20414p0.m219070o3();
    }

    /* JADX INFO: renamed from: i8 */
    public final /* synthetic */ Boolean m41398i8(CoreInnerPush.C4867a c4867a) {
        return Boolean.valueOf(act().lifecycle_() == C4470c.f16267i || c4867a.f19927l);
    }

    /* JADX INFO: renamed from: i9 */
    public final void m41399i9() {
        if (e7d0.m119697f() || !gra.m131726o2() || gra.m131731p2()) {
            return;
        }
        duringCreated(psd0.m173625r(CoreModule.f18264c.f20381e0.m116596o9().map(new qcj() { // from class: l.ah30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(!tzi0.m193670h(pzi0.m174454o(), (long) user.createdTime, gra.m131702j3()) && (TextUtils.isEmpty(user.description) || user.pictures.size() < 3));
            }
        }).distinctUntilChanged(), CoreModule.f18264c.f20381e0.f89356w6.obs().distinctUntilChanged(), new utq())).subscribe(psd0.m173596G(new y20() { // from class: l.bh30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76712a.m41378d9((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j6 */
    public final void m41400j6() {
        try {
            x95.INSTANCE.m209792k(CoreModule.f18264c.f20381e0.m116593na().publicId);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: j7 */
    public final void m41401j7() {
        if (d79.m114704u()) {
            if (NullChecker.m82486a(CoreModule.f18264c.f20428t2.f198578R) && CoreModule.f18264c.f20428t2.f198578R.get().booleanValue()) {
                qyp.m178723i().m178730o(act(), "test", "近期多次向他人髮送廣告信息，已被平颱標記爲風險用戶。再有類似行爲，您的帳號將被<span style=\"color: #FE7E1D;\">限製曝光或封禁</span>");
            } else {
                duringCreated((C22421c) ji30.m144967k().take(1).flatMap(new qcj() { // from class: l.rg30
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C8247a.m41083L4((TabName) obj);
                    }
                })).subscribe(psd0.m173597H(new y20() { // from class: l.sg30
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f167787a.m41263B8((RiskSelfData) obj);
                    }
                }, new y20() { // from class: l.tg30
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        C8247a.m41152Z4((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: j8 */
    public final /* synthetic */ C22421c m41402j8(final CoreInnerPush.C4867a c4867a) {
        return c4867a.f19927l ? act().lifecycle().filter(new qcj() { // from class: l.rd30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).first().map(new qcj() { // from class: l.ud30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C8247a.m41049E1(c4867a, (C4470c) obj);
            }
        }) : C22421c.just(c4867a);
    }

    /* JADX INFO: renamed from: j9 */
    public void m41403j9() {
        Fragment fragmentM2558i0 = this.f124438a.fragmentManager().m2558i0(this.f124439b.toString());
        if (fragmentM2558i0 instanceof PutongFrag) {
            ((PutongFrag) fragmentM2558i0).mo30635I4();
        }
        if (fragmentM2558i0 instanceof ConversationsTabFrag) {
            sfj0.m185596c("e_messages", OMSDialogPositon.p_messages_view, sfj0.C20032a.m185615h("click_change", "click"));
        }
    }

    /* JADX INFO: renamed from: k6 */
    public final Fragment m41404k6(TabName tabName) {
        switch (m.f25266a[tabName.ordinal()]) {
            case 1:
                return HomeLayoutFrag.m39515C5();
            case 2:
                return ConversationsTabFrag.m42586B5(this.f25246v);
            case 3:
                if (((NewMainViewModel) this.viewModel).f25198E.m40645J(TabName.Live)) {
                    return CoreModule.m30934Q().buildLiveSquareFrag();
                }
                return null;
            case 4:
            default:
                return null;
            case 5:
                return new ProfileFrag();
            case 6:
                return sbw.INSTANCE.m185346k();
            case 7:
                if (gra.m131617Q1()) {
                    return o2c.m165710h(m99640Y(), "bottom_navigation_bar");
                }
                return null;
            case 8:
                sfj0.m185601h("e_intl_navbar_meet_view", OMSDialogPositon.p_navigation_view, new sfj0.C20032a[0]);
                return new IntlTribeMeetFrag();
        }
    }

    /* JADX INFO: renamed from: k7 */
    public final void m41405k7() {
        if (spl0.m187372X()) {
            CoreModule.f18264c.f20384f0.m33641Ep(true);
            duringCreated(CoreModule.f18264c.f20384f0.m33843Vm()).observeOn(Schedulers.m222739io()).take(1).map(new qcj() { // from class: l.rc30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return C8247a.m41131V3((List) obj);
                }
            }).subscribe();
        } else if (CoreModule.f18264c.f20384f0.m33727Lp()) {
            CoreModule.f18264c.f20384f0.m34105qq(-1.0d);
            CoreModule.f18264c.f20384f0.m33641Ep(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k8 */
    public final /* synthetic */ void m41406k8(TabName tabName, View view, CoreInnerPush.C4867a c4867a) {
        if (view instanceof sum) {
            ((sum) view).mo40232a(act(), c4867a, tabName, m41428q6());
        }
    }

    /* JADX INFO: renamed from: k9 */
    public boolean m41407k9(final String str) {
        final Frag frag = (Frag) this.f124438a.fragmentManager().m2558i0(this.f124439b.toString());
        lifecycle().filter(new qcj() { // from class: l.x930
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.ia30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41034A4(frag, str, (C4470c) obj);
            }
        }));
        return CoreModule.m30932N().isPhotoAlbumFrag(frag);
    }

    /* JADX INFO: renamed from: l6 */
    public final void m41408l6() {
        act().duringCreated(CoreModule.f18264c.f20384f0.m34011jn(false).take(1)).subscribe(psd0.m173596G(new y20() { // from class: l.ic30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41221r2((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l7 */
    public final void m41409l7() {
        if (d79.m114675e0()) {
            if (!sbw.INSTANCE.m185343h() && !d79.m114647F()) {
                creates(new y20() { // from class: l.ca30
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f80542a.m41271D8((Bundle) obj);
                    }
                });
            }
            final LoveBuzzNotifyUserPop loveBuzzNotifyUserPop = new LoveBuzzNotifyUserPop(act());
            act().duringCreated((C22421c) haw.INSTANCE.m134320a().m134319z0(), false).subscribe(psd0.m173597H(new y20() { // from class: l.da30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f85835a.m41275E8(loveBuzzNotifyUserPop, (pf60) obj);
                }
            }, new y20() { // from class: l.ea30
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41207n4((Throwable) obj);
                }
            }));
            act().duringCreated(ji30.m144967k()).distinctUntilChanged().skip(1).subscribe(psd0.m173597H(new y20() { // from class: l.fa30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f97939a.m41279F8(loveBuzzNotifyUserPop, (TabName) obj);
                }
            }, new y20() { // from class: l.ga30
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41064H4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l8 */
    public final /* synthetic */ void m41410l8(CoreInnerPush.C4867a c4867a) {
        int i2;
        final TabName tabNameM148843b1 = m148843b1();
        if (jyb.m147479J(c4867a.f19924i) || c4867a.f19924i.contains(tabNameM148843b1)) {
            od2 od2Var = new od2(act());
            ViewGroup viewGroup = (ViewGroup) act().getWindow().getDecorView();
            int i3 = kec0.f126134x7;
            if (c4867a.f19925j == CoreInnerPush.InnerPushLayoutType.COUNTDOWN_CONV_CREATE) {
                i3 = kec0.f125773c2;
                i2 = 0;
            } else {
                i2 = -1;
            }
            od2 od2VarM167270u = od2Var.m167268s(i3, true).m167275z(viewGroup).m167273x(bnl0.m105511F0()).m167270u(200L);
            long j2 = c4867a.f19926k;
            if (j2 <= 0) {
                j2 = 3000;
            }
            od2VarM167270u.m167266q(j2).m167265p(new j()).m167274y(c4867a, new od2.InterfaceC19107b() { // from class: l.qe30
                @Override // p153l.od2.InterfaceC19107b
                /* JADX INFO: renamed from: a */
                public final void mo99267a(View view, Object obj) {
                    this.f156792a.m41406k8(tabNameM148843b1, view, (CoreInnerPush.C4867a) obj);
                }
            });
            if (i2 >= 0) {
                od2Var.m167271v(i2).m167272w(i2);
            }
            if (TextUtils.isEmpty(c4867a.f19922g)) {
                ud2.m195456j().m195472s(od2Var);
            } else {
                ud2.m195456j().m195473t(od2Var, c4867a.f19922g);
            }
        }
    }

    /* JADX INFO: renamed from: l9 */
    public void m41411l9(Bundle bundle) {
        TabName tabNameTransform = TabName.transform(bundle.getString("saved_fragment_name"));
        if (NullChecker.m82486a(tabNameTransform)) {
            this.f124439b = tabNameTransform;
        }
        if (bundle.containsKey("msg_tab_index")) {
            this.f25246v = bundle.getInt("msg_tab_index", 0);
        }
    }

    /* JADX INFO: renamed from: m6 */
    public final void m41412m6() {
        if (CoreModule.m30932N().mo61558n7()) {
            return;
        }
        CoreModule.f18264c.f20421r1.m193484c3().subscribe(psd0.m173597H(new y20() { // from class: l.re30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41062H2((Boolean) obj);
            }
        }, new y20() { // from class: l.se30
            @Override // p153l.y20
            public final void call(Object obj) {
                C8247a.m41202m3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m7 */
    public final void m41413m7() {
        if (gra.m131646X2()) {
            duringCreated(CoreModule.f18264c.f20381e0.f89242h4).subscribe(psd0.m173597H(new s(), new y20() { // from class: l.fg30
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41097O5((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: m8 */
    public final /* synthetic */ void m41414m8(Boolean bool) {
        if (CoreModule.f18264c.f20438x0.m31177I3() != null) {
            m41261A9();
            if (CoreModule.f18264c.f20438x0.m31188T3()) {
                m41463y9();
            }
        }
        ((NewMainViewModel) this.viewModel).m41019n0();
    }

    /* JADX INFO: renamed from: m9 */
    public void m41415m9() {
        int i2 = 0;
        CoreModule.f18264c.f20405m0.f20186q2[0] = 1;
        this.f25247w = false;
        if (CoreModule.m30932N().mo61443Ah()) {
            this.f124439b = CoreModule.m30932N().mo61531dr();
        }
        if (!this.f25249y) {
            CoreModule.f18264c.f20381e0.f89110R.get();
            if (!TabName.Card.equals(this.f124439b)) {
                if (TabName.Moment.equals(this.f124439b)) {
                    i2 = 1;
                } else {
                    i2 = TabName.Live.equals(this.f124439b) ? 3 : 2;
                }
            }
            i4g0.m138495D("e_apprenew_expose", "p_suggest_users_home_view", jyb.m147494Y("cold_boot_toaddrtype", Integer.valueOf(i2)));
            this.f25249y = true;
        }
        if (CoreModule.f18264c.f20374b2.m133765f3()) {
            this.f124439b = CoreModule.f18264c.f20374b2.m133763d3(CoreModule.f18264c.f20374b2.f108101R.get());
        }
        m41355Z5(this.f124439b);
    }

    /* JADX INFO: renamed from: n6 */
    public final void m41416n6() {
        if (gta.m132210e().m132214d().mo34748R8()) {
            act().duringCreated(CoreModule.f18264c.f20384f0.m33907bf().take(1)).subscribe(psd0.m173596G(new y20() { // from class: l.pb30
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41042C3((vg60) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: n7 */
    public final void m41417n7() {
        uqi.m197339f(LaunchStep.BigEmoji);
        if (!CoreModule.f18264c.f20381e0.f89082N1.get().booleanValue()) {
            CoreModule.f18264c.f20381e0.f89082N1.put(Boolean.TRUE);
            ArrayList arrayList = new ArrayList();
            arrayList.add("https://auto.tancdn.com/v1/raw/bd957249-2f80-4f31-adcd-a3eefc6afbad12.svga");
            SVGALoader.with(act()).batchDownload(arrayList);
        }
        oze.f149871i.clear();
        oze.f149870h.clear();
        for (oze.C19253a c19253a : oze.f149866d) {
            String string = act().getString(c19253a.f149874b);
            oze.f149871i.add(string);
            oze.f149870h.put(string, Integer.valueOf(c19253a.f149876d));
        }
        if (!NullChecker.m82486a(tye.m193572c().m193576b())) {
            EmojiAnimData emojiAnimDataNew_ = EmojiAnimData.new_();
            emojiAnimDataNew_.emojiAnimCreatedTime = new HashMap();
            tye.m193572c().m193581j(emojiAnimDataNew_);
        }
        uqi.m197337d(LaunchStep.BigEmoji);
    }

    /* JADX INFO: renamed from: n8 */
    public final /* synthetic */ void m41418n8(Long l2) {
        m41261A9();
        if (!CoreModule.f18264c.f20438x0.m31188T3()) {
            m41457x6();
        }
        ((NewMainViewModel) this.viewModel).m41019n0();
    }

    /* JADX INFO: renamed from: n9 */
    public void m41419n9(Bundle bundle) {
        bundle.putString("saved_fragment_name", this.f124439b.toString());
        Fragment fragmentM2558i0 = this.f124438a.fragmentManager().m2558i0(TabName.Msg.toString());
        if (fragmentM2558i0 instanceof ConversationsTabFrag) {
            int iM42645c0 = ((ConversationsTabFrag) fragmentM2558i0).m42645c0();
            this.f25246v = iM42645c0;
            bundle.putInt("msg_tab_index", iM42645c0);
        }
    }

    /* JADX INFO: renamed from: o6 */
    public final void m41420o6() {
        if (CoreModule.m30932N().mo61525cd() || !CoreModule.m30932N().mo61537fs()) {
            CoreModule.f18264c.f20418q1.m34275t3().subscribe(psd0.m173597H(new y20() { // from class: l.xd30
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41169e2((Boolean) obj);
                }
            }, new y20() { // from class: l.yd30
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41211o4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: o7 */
    public final void m41421o7() {
        if (gra.m131731p2()) {
            duringCreated(this.f25243s).filter(new qcj() { // from class: l.sd30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TabName.Me.equals((TabName) obj));
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.ee30
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20381e0.m116444B7();
                }
            }));
            CoreModule.f18264c.f20381e0.m116444B7();
        }
        m41071I6();
    }

    /* JADX INFO: renamed from: o8 */
    public final /* synthetic */ void m41422o8(List list) {
        m41261A9();
    }

    /* JADX INFO: renamed from: o9 */
    public void m41423o9() {
        Fragment fragmentM2558i0 = this.f124438a.fragmentManager().m2558i0(this.f124439b.toString());
        if (fragmentM2558i0 instanceof PutongFrag) {
            ((PutongFrag) fragmentM2558i0).mo30634H4();
        }
        if (fragmentM2558i0 instanceof ConversationsTabFrag) {
            sfj0.m185596c("e_message_double_click", OMSDialogPositon.p_messages_view, new sfj0.C20032a[0]);
        }
    }

    /* JADX INFO: renamed from: p6 */
    public final void m41424p6(TabName tabName, boolean z) {
        TabName tabName2;
        boolean zM2546e0;
        TabName tabName3;
        TabName tabName4;
        Fragment fragmentM41404k6;
        TabName tabName5 = tabName;
        tu2.m192703a("[FragmentChange]", "start old: " + this.f124439b + " -> new: " + tabName5);
        TabName tabName6 = TabName.Moment;
        if (tabName6.equals(tabName5) && CoreModule.m30930K().mo31808pe()) {
            return;
        }
        if (gra.m131606N3() && TabName.Card.equals(tabName5) && ExpandedCardStyleHelper.m39093o().m39106s()) {
            return;
        }
        TabName tabName7 = TabName.Live;
        if (tabName5 == tabName7 && !((NewMainViewModel) this.viewModel).f25198E.m40645J(tabName7)) {
            if (gra.m131617Q1()) {
                Act act = act();
                Bundle bundle = new Bundle();
                if (NullChecker.m82486a(act) && NullChecker.m82486a(act.getIntent())) {
                    bundle = act.getIntent().getBundleExtra("extra_new_main_bundle");
                }
                CoreModule.m30934Q().mo68434Z8(act(), bundle);
            }
            tabName5 = TabName.Card;
        }
        TabName tabName8 = this.f124439b;
        FragmentManager fragmentManager = this.f124438a.fragmentManager();
        if (this.f124439b != tabName5) {
            if (c6w.m108183g()) {
                return;
            }
            InterfaceC0476e interfaceC0476eM2558i0 = fragmentManager.m2558i0(tabName6.toString());
            if (interfaceC0476eM2558i0 instanceof FeedService.InterfaceC11578b) {
                ((FeedService.InterfaceC11578b) interfaceC0476eM2558i0).mo64927E0();
                c6w.m108182f();
            }
        }
        String strM41444u6 = m41444u6(this.f124439b);
        this.f124439b = tabName5;
        if (CoreModule.m30934Q().mo68413M7()) {
            this.f124439b = tabName7;
            if (z && tabName5 != tabName7) {
                o1j0.m165620B("青少年模式下无法使用", true, true);
            }
        }
        AbstractC13226a abstractC13226a = uqb0.f180370E;
        if (abstractC13226a != null) {
            abstractC13226a.m80057z();
        }
        if (CoreModule.m30932N().mo61478M8() && !tabName5.equals(TabName.Card)) {
            NewNewProfileCard.m37790Y1();
        }
        Fragment fragmentM2558i0 = fragmentManager.m2558i0(this.f124439b.toString());
        boolean z2 = false;
        if (lifecycle_() == C4470c.f16268j) {
            tabName2 = tabName5;
            zM2546e0 = false;
            z2 = false;
        } else if (NullChecker.m82486a(fragmentM2558i0) && fragmentM2558i0.getLifecycle().getState() == Lifecycle.State.RESUMED && !fragmentM2558i0.isHidden()) {
            if (t4j.m189280f() && this.f25248x) {
                m41375d6(fragmentManager, this.f124439b);
            }
            tabName2 = tabName5;
            zM2546e0 = true;
        } else {
            if (m.f25266a[this.f124439b.ordinal()] == 3) {
                ner nerVar = this.lifecycleProviderImpl;
                if (nerVar instanceof NewMainAct) {
                    sfj0.m185596c("e_live_entertainment_icon", ((NewMainAct) nerVar).m40808c6().f152156a, new sfj0.C20032a[0]);
                }
            }
            AbstractC0428k abstractC0428kM2568m = fragmentManager.m2568m();
            TabName[] tabNameArrValues = TabName.values();
            int length = tabNameArrValues.length;
            int i2 = 0;
            boolean z3 = false;
            while (i2 < length) {
                TabName tabName9 = tabNameArrValues[i2];
                String string = tabName9.toString();
                Fragment fragmentM2558i1 = fragmentManager.m2558i0(string);
                if (fragmentM2558i1 != null) {
                    tabName4 = tabName5;
                    fragmentM41404k6 = fragmentM2558i1;
                } else if (!t4j.m189280f() || this.f124444g || this.f124443f) {
                    tabName4 = tabName5;
                    fragmentM41404k6 = m41404k6(tabName9);
                    if (NullChecker.m82486a(fragmentM41404k6)) {
                        if (this.f124439b.equals(tabName9)) {
                            m41435r9(fragmentM41404k6, false);
                        }
                        abstractC0428kM2568m.m2805c(adc0.f69809A4, fragmentM41404k6, string);
                    }
                } else if (this.f124439b.equals(tabName9)) {
                    tabName4 = tabName5;
                    boolean zM189288k = t4j.m189279d().m189288k(this.f124439b);
                    Fragment fragmentM41404k7 = m41404k6(tabName9);
                    if (NullChecker.m82486a(fragmentM41404k7)) {
                        m41435r9(fragmentM41404k7, zM189288k);
                        abstractC0428kM2568m.m2805c(adc0.f69809A4, fragmentM41404k7, string);
                    }
                    fragmentM41404k6 = fragmentM41404k7;
                } else {
                    tabName4 = tabName5;
                    t4j.m189279d().m189284b(act(), tabName9, new m930(this));
                    fragmentM41404k6 = fragmentM2558i1;
                    z3 = true;
                }
                if (NullChecker.m82486a(fragmentM41404k6)) {
                    if (this.f124439b.equals(tabName9)) {
                        abstractC0428kM2568m.mo2717w(fragmentM41404k6, Lifecycle.State.RESUMED);
                        abstractC0428kM2568m.mo2718y(fragmentM41404k6);
                    } else if (!fragmentM41404k6.isHidden()) {
                        abstractC0428kM2568m.mo2714p(fragmentM41404k6);
                    }
                }
                i2++;
                fragmentM2558i0 = fragmentM41404k6;
                tabName5 = tabName4;
            }
            tabName2 = tabName5;
            if (t4j.m189280f() && z3) {
                t4j.m189279d().m189285c(act());
            }
            abstractC0428kM2568m.mo2709j();
            zM2546e0 = fragmentManager.m2546e0();
            z2 = true;
        }
        if (zM2546e0) {
            if (z) {
                m41354Y9(strM41444u6, z2);
            }
            TabName tabName10 = this.f124439b;
            TabName tabName11 = TabName.Msg;
            boolean zEquals = tabName10.equals(tabName11);
            V v2 = this.viewModel;
            if (zEquals) {
                ((NewMainViewModel) v2).m41026u0(true);
                if (z && !CoreModule.f18264c.f20405m0.m32035O6()) {
                    User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
                    if (NullChecker.m82486a(userM116600p9) && userM116600p9.isNewUserIn24H() && rbb0.m180744q()) {
                        CoreModule.f18264c.f20429u0.m31429Z6(null, 0L, 1, "");
                    }
                    CoreModule.f18264c.f20429u0.f19996l0.get().getClass();
                    CoreModule.f18264c.f20429u0.m31443g7(CoreLikers.LikersTriggerBy.home_tab_msg);
                    CoreModule.f18264c.f20400k1.m121123A3();
                    m41370ba();
                }
                if (d09.m113376m() || d09.m113377n()) {
                    of7.m167420o().m167438z();
                }
            } else {
                ((NewMainViewModel) v2).m41026u0(false);
            }
            ji30.m144970n(this.f124439b);
            TabName tabName12 = this.f124439b;
            TabName tabName13 = TabName.Card;
            if (tabName12.equals(tabName13)) {
                p110.m170190c().m170191d(Active.TYPE);
                ji30.m144969m(tabName13, z);
            }
            if (this.f124439b.equals(TabName.Me)) {
                if (z) {
                    CoreModule.f18264c.f20312H0.m155449k5();
                }
                if (CoreModule.f18264c.f20438x0.m31176H4()) {
                    IapAffiliatePromotion iapAffiliatePromotionM31177I3 = CoreModule.f18264c.f20438x0.m31177I3();
                    if (iapAffiliatePromotionM31177I3 != null) {
                        CoreModule.f18264c.f20438x0.f19938Y.put(Long.valueOf(iapAffiliatePromotionM31177I3.promotionHitId));
                    }
                    m41261A9();
                }
                if (gra.m131600M2()) {
                    ((NewMainViewModel) this.viewModel).m40991P();
                }
                if (z && !CoreModule.f18264c.f20405m0.m32035O6()) {
                    CoreModule.f18264c.f20429u0.m31435c7();
                    m41370ba();
                }
            }
            if (z && CoreModule.f18264c.f20291A0.m132934b3() && CoreModule.f18264c.f20291A0.m132935c3()) {
                CoreModule.f18264c.f20291A0.m132936d3();
            }
            TabName tabName14 = this.f124439b;
            TabName tabName15 = TabName.Moment;
            if (tabName14.equals(tabName15) && bj30.m104592a()) {
                jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89159X0;
                Boolean bool = Boolean.TRUE;
                jxd0Var.put(bool);
                CoreModule.f18264c.f20381e0.m116529X7().m137019l(bool);
            }
            if (ric0.m181583m() && tabName8 != (tabName3 = this.f124439b) && tabName3.equals(tabName13)) {
                CoreModule.f18264c.f20377c2.m118410y3();
                ric0.m181581i().m181590o();
            }
            ((NewMainViewModel) this.viewModel).m40971E0(this.f124439b, z);
            if (this.f25247w && CoreModule.m30932N().isPhotoAlbumFrag(fragmentM2558i0) && z) {
                ji30.m144969m(tabName15, true);
            }
            Act act2 = act();
            if (NullChecker.m82486a(act2) && NullChecker.m82486a(act2.getIntent())) {
                Bundle bundleExtra = act2.getIntent().getBundleExtra("extra_new_main_bundle");
                if (NullChecker.m82486a(bundleExtra)) {
                    ji30.m144968l(this.f124439b, bundleExtra);
                    act2.getIntent().removeExtra("extra_new_main_bundle");
                }
            }
            TabName tabName16 = TabName.Live;
            if (tabName16.equals(this.f124439b) && z) {
                ji30.m144969m(tabName16, CoreModule.m30934Q().isLiveSquareHome(this.f25245u));
            }
            if (this.f25245u != fragmentManager.m2558i0(this.f124439b.toString())) {
                if (this.f25245u == null && !tabName13.equals(this.f124439b)) {
                    uqi.m197347n(this.f124439b);
                }
                m41338U9(true);
                this.f25245u = (PutongFrag) fragmentManager.m2558i0(this.f124439b.toString());
                m41349X9(true);
                m41345W9(z);
                if (this.f124439b.equals(tabName11)) {
                    CoreModule.f18264c.f20321K0.m113316x3().m137019l(Optional.m15467of(uxj0.f181467a));
                    m41439s9();
                }
            }
            this.f25243s.m137019l(this.f124439b);
            m41395h9();
            fragmentManager.m2558i0(tabName15.toString());
            xq8.m212718a(this.f124439b);
            if (this.f124439b.equals(tabName13) && TEnum.equals(this.f124448k, "cards") && s7a.m184982k() && joa.m146353C3()) {
                vfi.m201143u().get().m201156t();
            }
            if (this.f124439b.equals(tabName13)) {
                InterfaceC0476e interfaceC0476eM2558i1 = fragmentManager.m2558i0(tabName13.toString());
                if (interfaceC0476eM2558i1 instanceof cvl) {
                    cvl cvlVar = (cvl) interfaceC0476eM2558i1;
                    if (TEnum.equals(this.f124448k, "cards")) {
                        cvlVar.mo39543C1(NewTanFragTag.HOME, null);
                        this.f124448k = null;
                    } else if (TEnum.equals(this.f124448k, NavigationCardIntent.moment_theme_card)) {
                        if (gra.m131578I0().enabled || nh00.m163018b().m163022f()) {
                            NewTanFragTag newTanFragTag = NewTanFragTag.MOMENT_THEME_CARD;
                            cvlVar.mo39567f1(newTanFragTag);
                            cvlVar.mo39543C1(newTanFragTag, null);
                            this.f124448k = null;
                        }
                    } else if (TEnum.equals(this.f124448k, NavigationCardIntent.play_together)) {
                        NewTanFragTag newTanFragTag2 = NewTanFragTag.PLAY_TOGETHER;
                        cvlVar.mo39567f1(newTanFragTag2);
                        cvlVar.mo39543C1(newTanFragTag2, null);
                        this.f124448k = null;
                    } else if (TEnum.equals(this.f124448k, NavigationCardIntent.boosting)) {
                        b83.m102909k(act2);
                        this.f124448k = null;
                    } else if (TEnum.equals(this.f124448k, NavigationCardIntent.supreme_sartner)) {
                        this.f124448k = null;
                    } else if (TEnum.equals(this.f124448k, NavigationCardIntent.odiamond_private_custom)) {
                        if (CoreModule.f18264c.f20443y2.m216799E3()) {
                            NewTanFragTag newTanFragTag3 = NewTanFragTag.PRIVATE_CUSTOM;
                            cvlVar.mo39567f1(newTanFragTag3);
                            cvlVar.mo39543C1(newTanFragTag3, null);
                            this.f124448k = null;
                            if (NullChecker.m82486a(this.f124446i) && this.f124446i.size() > 0 && this.f124446i.containsKey("navigation_to")) {
                                CoreModule.m30933P().m143408e().mo35978W6(cvlVar.mo39563Y(), this.f124446i.get("navigation_to"));
                                this.f124446i.remove("navigation_to");
                            }
                        } else {
                            this.f124448k = null;
                        }
                    }
                }
            }
            if (CoreModule.f18264c.f20381e0.m116541a8()) {
                x19.m208996w().m209010v(this.f124439b);
            }
            if ((this.f124439b.equals(tabName11) || this.f124439b.equals(tabName15)) && z && CoreModule.f18264c.f20381e0.m116537Z7() && !tzi0.m193670h(pzi0.m174454o(), (long) CoreModule.f18264c.f20381e0.m116600p9().createdTime, 5)) {
                gv20.m132480o(act2, gv20.m132476k(act2), this.f124439b.equals(tabName11) ? "message_list_page" : "explore_page");
            }
            if (this.f124439b.equals(tabName11) && CoreModule.m30932N().mo61537fs() && z) {
                C4894i c4894i = CoreModule.f18264c.f20418q1;
                C4894i.f20751S.m137019l(uxj0.f181467a);
            }
            if (gra.m131693i()) {
                CoreModule.f18264c.f20384f0.m33630Ee();
            }
        }
        this.f25247w = true;
        CoreModule.m30932N().mo61517Yb(act(), tabName2.toString(), z);
        CoreModule.f18264c.f20374b2.m133767h3(tabName2.toString());
        if (CoreModule.m30932N().mo61548ke()) {
            TabName tabName17 = this.f124439b;
            TabName tabName18 = TabName.Card;
            if (tabName17.equals(tabName18)) {
                CoreModule.m30930K().setTabDot(act(), tabName18, false);
            }
        }
        tu2.m192703a("[FragmentChange]", "finish : " + this.f124439b);
    }

    /* JADX INFO: renamed from: p7 */
    public final void m41425p7() {
        if (spl0.m187360L()) {
            duringCreated(CoreModule.f18264c.f20407m2.m123958H3()).subscribe(psd0.m173597H(new y20() { // from class: l.jg30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f120668a.m41283G8((Integer) obj);
                }
            }, new y20() { // from class: l.lg30
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41110R3((Throwable) obj);
                }
            }));
            CoreModule.f18264c.f20407m2.m123956F3();
        }
    }

    /* JADX INFO: renamed from: p8 */
    public final /* synthetic */ void m41426p8(Long l2) {
        m41261A9();
    }

    /* JADX INFO: renamed from: p9 */
    public final void m41427p9(Act act, String str, String str2) {
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        act.startActivity(new Intent("android.intent.action.VIEW").setData(builderBuildUpon.appendQueryParameter("serverCode", str2).build()));
    }

    /* JADX INFO: renamed from: q6 */
    public PutongFrag m41428q6() {
        return this.f25245u;
    }

    /* JADX INFO: renamed from: q7 */
    public final void m41429q7() {
        if (kl40.m150348f()) {
            creates(new y20() { // from class: l.w930
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41248x5((Bundle) obj);
                }
            }, new x20() { // from class: l.y930
                @Override // p153l.x20
                public final void call() {
                    this.f198062a.m41287H8();
                }
            });
            if (kl40.m150348f()) {
                creates(new y20() { // from class: l.z930
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        CoreModule.m30932N().initCameraSdk(null);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: q8 */
    public final /* synthetic */ void m41430q8(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            h79 h79Var = CoreModule.f18264c.f20374b2;
            if (h79Var.f108102S) {
                m41355Z5(h79Var.m133763d3(str2));
            }
        }
    }

    /* JADX INFO: renamed from: q9 */
    public final void m41431q9(Act act, String str, String str2) {
        act.startActivity(xwa.m213301A(act, "", Uri.parse(str).buildUpon().appendQueryParameter("serverCode", str2).build().toString(), true, false, false));
    }

    /* JADX INFO: renamed from: r6 */
    public void m41432r6() {
        act().duringCreated((C22421c) CoreModule.f18264c.f20381e0.f89112R1.filter(new qcj() { // from class: l.xh30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(d79.m114690m());
            }
        }).flatMap(new qcj() { // from class: l.yh30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20310G1.m111581h3();
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.zh30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204372a.m41321Q7((pf60) obj);
            }
        }, new v60()));
    }

    /* JADX INFO: renamed from: r7 */
    public final void m41433r7() {
        if (gra.m131689h0().enable) {
            duringCreated(this.f25243s.distinctUntilChanged().filter(new qcj() { // from class: l.wc30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Card);
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.hd30
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20381e0.f89026F0.m137019l(uxj0.f181467a);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r8 */
    public final /* synthetic */ void m41434r8(Integer num) {
        int i2 = ji30.f121041f;
        if (gra.m131606N3() && TabName.Card.equals(ji30.m144964h())) {
            i2 = 0;
        }
        ((NewMainViewModel) this.viewModel).m40982K0(Integer.valueOf(i2 + num.intValue()));
        ((NewMainViewModel) this.viewModel).m40969D0(num.intValue());
    }

    /* JADX INFO: renamed from: r9 */
    public final void m41435r9(final Fragment fragment, boolean z) {
        if (fragment instanceof NewMainContextFrag) {
            NewMainContextFrag newMainContextFrag = (NewMainContextFrag) fragment;
            newMainContextFrag.m40942R4();
            newMainContextFrag.m40941Q4();
        } else if (z && (fragment instanceof Frag)) {
            ((Frag) fragment).creates(new y20() { // from class: l.wa30
                @Override // p153l.y20
                public final void call(Object obj) {
                    fragment.onHiddenChanged(false);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s6 */
    public final pf60<Integer, Integer> m41436s6(bkj0<Optional<vg60<User>>, Optional<vg60<User>>, List<UserPrivilege>> bkj0Var) {
        int i2;
        if (joa.m146396k4()) {
            i2 = !joa.m146386f4() ? dbc0.f87267o : dbc0.f87234n;
        } else {
            i2 = dbc0.f87300p;
        }
        Optional<vg60<User>> optional = bkj0Var.f77081a;
        Optional<vg60<User>> optional2 = bkj0Var.f77082b;
        if (!optional.isPresent() || !optional2.isPresent()) {
            return pf60.m172085a(-1, Integer.valueOf(i2));
        }
        vg60<User> vg60Var = optional.get();
        int size = !jyb.m147479J(vg60Var.f184001a) ? vg60Var.f184001a.size() : 0;
        vg60<User> vg60Var2 = optional2.get();
        return pf60.m172085a(Integer.valueOf(size + (jyb.m147479J(vg60Var2.f184001a) ? 0 : vg60Var2.f184002b.total)), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: s7 */
    public final void m41437s7() {
        if (ln40.m154956f().m154959h()) {
            if (!gra.m131737q3() || CoreModule.m30930K().me_().isFemale()) {
                CoreModule.f18264c.f20420r0.m35135m5();
            } else {
                duringCreated(new pcj() { // from class: l.ch30
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return CoreModule.f18264c.f20356V1.m170553i3(9);
                    }
                }).subscribe(psd0.m173597H(new y20() { // from class: l.dh30
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        C8247a.m41069I4((List) obj);
                    }
                }, new y20() { // from class: l.eh30
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        C8247a.m41234u3((Throwable) obj);
                    }
                }));
            }
            if (!gra.m131742r3() || CoreModule.m30930K().me_().isFemale()) {
                return;
            }
            CoreModule.f18264c.f20356V1.m170553i3(50);
            duringCreated(this.f25243s.distinctUntilChanged()).subscribe(psd0.m173597H(new y20() { // from class: l.fh30
                @Override // p153l.y20
                public final void call(Object obj) {
                    ln40.m154956f().m154957e();
                }
            }, new y20() { // from class: l.hh30
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41160b5((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: s8 */
    public final /* synthetic */ void m41438s8(List list) {
        ((NewMainViewModel) this.viewModel).f25210h.m31002M();
    }

    /* JADX INFO: renamed from: s9 */
    public final void m41439s9() {
        if (gra.m131657a2()) {
            CoreModule.f18264c.f20384f0.m33975go();
        }
    }

    /* JADX INFO: renamed from: t6 */
    public Frag m41440t6(TabName tabName) {
        Fragment fragmentM2558i0 = this.f124438a.fragmentManager().m2558i0(tabName.toString());
        if (fragmentM2558i0 instanceof Frag) {
            return (Frag) fragmentM2558i0;
        }
        return null;
    }

    /* JADX INFO: renamed from: t7 */
    public final void m41441t7() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.u930
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178092a.m41290I8((C4470c) obj);
            }
        }));
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.v930
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182932a.m41294J8((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t8 */
    public final /* synthetic */ void m41442t8(User user) {
        ((NewMainViewModel) this.viewModel).f25210h.m31002M();
    }

    /* JADX INFO: renamed from: t9 */
    public final void m41443t9() {
        if (this.f25236C.get().booleanValue()) {
            return;
        }
        exk.m123067j(act());
        this.f25236C.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: u6 */
    public final String m41444u6(TabName tabName) {
        Fragment fragmentM2558i0 = this.f124438a.fragmentManager().m2558i0(tabName.toString());
        return NullChecker.m82486a(fragmentM2558i0) ? ((PutongFrag) fragmentM2558i0).pageId() : "";
    }

    /* JADX INFO: renamed from: u7 */
    public final void m41445u7() {
        CoreModule.f18264c.f20384f0.m33800Sf();
    }

    /* JADX INFO: renamed from: u8 */
    public final /* synthetic */ void m41446u8(TabName tabName) {
        ((NewMainViewModel) this.viewModel).m41019n0();
    }

    /* JADX INFO: renamed from: u9 */
    public final void m41447u9() {
        ConversationCounterTypeSp.resetAll();
    }

    /* JADX INFO: renamed from: v */
    public String m41448v() {
        PutongFrag putongFrag = this.f25245u;
        return putongFrag != null ? putongFrag.pageId() : getClass().getName();
    }

    /* JADX INFO: renamed from: v6 */
    public View m41449v6(TabName tabName) {
        return ((NewMainViewModel) this.viewModel).m40983L(tabName);
    }

    /* JADX INFO: renamed from: v7 */
    public final void m41450v7() {
        if (s7a.m184997z()) {
            duringCreated(CoreModule.f18264c.f20396j0.m31647y5(ProductCategory.get("youthVip"))).subscribe(psd0.m173591B());
        }
    }

    /* JADX INFO: renamed from: v8 */
    public final /* synthetic */ void m41451v8(User user) {
        bep.INSTANCE.m103747l(act());
    }

    /* JADX INFO: renamed from: v9 */
    public final void m41452v9() {
        InterfaceC0476e interfaceC0476eM2558i0 = this.f124438a.fragmentManager().m2558i0(TabName.Card.toString());
        if (interfaceC0476eM2558i0 instanceof cvl) {
            Frag fragMo39563Y = ((cvl) interfaceC0476eM2558i0).mo39563Y();
            if (fragMo39563Y instanceof NewNewHomeFrag) {
                ((NewNewHomeFrag) fragMo39563Y).f22419B.m101927M8();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w6 */
    public void m41453w6() {
        Frag frag = (Frag) this.f124438a.fragmentManager().m2558i0(this.f124439b.toString());
        if ((frag instanceof ConversationsTabFrag) && !frag.isHidden() && ((ConversationsTabFrag) frag).m42646c6()) {
            return;
        }
        if ((frag instanceof ProfileFrag) && !frag.isHidden() && ((ProfileFrag) frag).m44217o()) {
            return;
        }
        if ((frag instanceof cvl) && !frag.isHidden() && ((cvl) frag).mo39569o()) {
            return;
        }
        if ((frag instanceof NewNewHomeFrag) && !frag.isHidden() && ((NewNewHomeFrag) frag).m37759o()) {
            return;
        }
        TabName tabName = this.f124439b;
        TabName tabName2 = TabName.Card;
        if (tabName != tabName2) {
            m41355Z5(tabName2);
        } else {
            this.f124438a.moveTaskToBack(true);
        }
    }

    /* JADX INFO: renamed from: w7 */
    public final void m41454w7() {
        l51.m152919y(new Runnable() { // from class: l.qd30
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.ue30
                    @Override // p153l.x20
                    public final void call() {
                        CoreModule.f18264c.f20384f0.m33631Ef("fake_conversation_profile_featured");
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: w8 */
    public final /* synthetic */ void m41455w8(VerificationNetworkData verificationNetworkData) {
        int i2 = verificationNetworkData.meta.code;
        if (i2 == 400314 || i2 == 400312) {
            v3l0.m199281e().m199287h(verificationNetworkData.data.groupName);
            if (i2 == 400312) {
                bep.INSTANCE.m103750o(act(), verificationNetworkData.data.status);
            } else {
                bep.INSTANCE.m103751p(act(), verificationNetworkData.data.status);
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: w9 */
    public void m41456w9(TabName tabName, boolean z) {
        m41342V9(tabName, z, false);
        if (TabName.Me == tabName) {
            m41261A9();
        } else {
            ((NewMainViewModel) this.viewModel).m41021p0(tabName, z);
        }
    }

    /* JADX INFO: renamed from: x6 */
    public void m41457x6() {
        ((NewMainViewModel) this.viewModel).m41022q0(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x8 */
    public final /* synthetic */ void m41458x8(pf60 pf60Var) {
        if (((Integer) pf60Var.f152156a).intValue() > -1) {
            ((NewMainViewModel) this.viewModel).m41027v0(TabName.Meet, ((Integer) pf60Var.f152156a).intValue());
        }
        ((NewMainViewModel) this.viewModel).m41029x0(TabName.Meet, ((Integer) pf60Var.f152157b).intValue());
    }

    /* JADX INFO: renamed from: x9 */
    public void m41459x9(boolean z) {
        ((NewMainViewModel) this.viewModel).m41021p0(TabName.FEATURED, z);
    }

    /* JADX INFO: renamed from: y6, reason: merged with bridge method [inline-methods] */
    public final void m41326R8() {
        NavigationBarAdmobHelper.INSTANCE.m37164v();
        l51.m152887G(new Runnable() { // from class: l.vd30
            @Override // java.lang.Runnable
            public final void run() {
                this.f183536a.m41329S7();
            }
        });
    }

    /* JADX INFO: renamed from: y7 */
    public final void m41461y7() {
        if (n46.m161541g().m161551n()) {
            duringCreated(n46.m161541g().m161545h()).subscribe(psd0.m173596G(new y20() { // from class: l.sc30
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20384f0.m33941dq(pzi0.m174454o());
                }
            }));
        }
        if (n46.m161541g().m161550m()) {
            duringCreated(m41331S9()).subscribe(psd0.m173596G(new y20() { // from class: l.tc30
                @Override // p153l.y20
                public final void call(Object obj) {
                    n46.m161541g().m161543e();
                }
            }));
            lifecycle().filter(new qcj() { // from class: l.uc30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.vc30
                @Override // p153l.y20
                public final void call(Object obj) {
                    n46.m161541g().m161543e();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: y8 */
    public final /* synthetic */ void m41462y8(String str) {
        Runnable runnable = this.f25242r;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: y9 */
    public void m41463y9() {
        ((NewMainViewModel) this.viewModel).m41022q0(true);
    }

    @Override // p153l.k930
    /* JADX INFO: renamed from: z1 */
    public void mo41464z1() {
        super.mo41464z1();
        m41301L7();
        CoreModule.f18264c.f20312H0.m155449k5();
        if (CoreModule.m30930K().mo31838xf()) {
            CoreModule.f18264c.f20315I0.m144059P3();
        }
        if (spl0.m187364P()) {
            CoreModule.f18264c.f20398j2.m119266j3();
        }
        if (CoreModule.f18264c.f20291A0.f107031R.get().longValue() == 0) {
            CoreModule.f18264c.f20291A0.f107031R.put(Long.valueOf(pzi0.m174454o()));
        }
        m41308N6();
        CoreModule.f18264c.f20405m0.f20186q2[0] = 0;
        m41350Y5();
        creates(new y20() { // from class: l.ta30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172686a.m41382e9((Bundle) obj);
            }
        });
        m41309N7();
    }

    /* JADX INFO: renamed from: z6 */
    public final void m41465z6() {
        act();
        CoreModule.f18264c.f20381e0.f89235g5 = false;
    }

    /* JADX INFO: renamed from: z7 */
    public final void m41466z7() {
        if (ric0.m181583m()) {
            duringCreated(CoreModule.f18264c.f20340Q1.f20859R.m159274k().take(1).flatMap(new qcj() { // from class: l.sb30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f167103a.m41298K8((MonetizationConfiguration) obj);
                }
            }).filter(new qcj() { // from class: l.tb30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((pf60) obj).f152157b == C4470c.f16267i);
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.ub30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f178259a.m41306M8((pf60) obj);
                }
            }, new y20() { // from class: l.vb30
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8247a.m41168d5((Throwable) obj);
                }
            }));
            if (ric0.m181581i().hasPreLoadBoostRefactorSvga.get().booleanValue()) {
                return;
            }
            ric0.m181581i().hasPreLoadBoostRefactorSvga.put(Boolean.TRUE);
            ArrayList arrayList = new ArrayList();
            arrayList.add("https://auto.tancdn.com/v1/raw/0fdc8f64-5452-4968-85c0-79b096797fdc12.svga");
            arrayList.add("https://auto.tancdn.com/v1/raw/41db580d-31c8-4180-8063-c656e986409212.svga");
            arrayList.add("https://auto.tancdn.com/v1/raw/c8af9bff-3dbd-425d-9be3-058125b716eb13.svga");
            arrayList.add("https://auto.tancdn.com/v1/raw/31429bf5-9bbd-42df-b607-5a5929f6256b12.svga");
            SVGALoader.with(act()).batchDownload(arrayList);
        }
    }

    /* JADX INFO: renamed from: z8 */
    public final /* synthetic */ void m41467z8(IntlTribeBubble intlTribeBubble) {
        int i2;
        if (pzi0.m174454o() - CoreModule.f18264c.f20381e0.f89087N6.get().longValue() <= 43200000 || intlTribeBubble == null || (i2 = intlTribeBubble.tribeCount) <= 0) {
            return;
        }
        ((NewMainViewModel) this.viewModel).m40965A0(i2, new C4496a.c() { // from class: l.he30
            @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.c
            /* JADX INFO: renamed from: a */
            public final void mo21885a(String str) {
                this.f109061a.m41462y8(str);
            }
        });
    }

    /* JADX INFO: renamed from: z9 */
    public void m41468z9(Boolean bool) {
        ((NewMainViewModel) this.viewModel).m41024s0(bool.booleanValue());
    }
}
