package p009l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.annotation.NonNull;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.core.newui.admob.NavigationBarAdmobHelper;
import com.p000p1.mobile.putong.core.newui.home.C0158d;
import com.p000p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p000p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p000p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p000p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC0030b;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C0031a;
import com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.C0062j;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p000p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.core.newui.main.NewMainBaseAct;
import com.p000p1.mobile.putong.core.newui.suggest.SuggestersAct;
import com.p000p1.mobile.putong.core.oms.OmsDialog;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p000p1.mobile.putong.p004ui.mediapicker.MediaPickerBaseAct;
import com.p000p1.mobile.putong.p004ui.permission.PermissionHelper;
import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import com.p000p1.mobile.putong.util.launch.LaunchStep;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.ExtraActLifecycle;
import com.p1.mobile.android.app.c;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.api.ABManager;
import com.p1.mobile.putong.core.CoreBusinessModule;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.api.a0;
import com.p1.mobile.putong.core.api.e0;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.ActionData;
import com.p1.mobile.putong.core.data.ActionInsertPosition;
import com.p1.mobile.putong.core.data.BoostStatus;
import com.p1.mobile.putong.core.data.CardButtonsShowAndHideType;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.FreeTrialEnvelope;
import com.p1.mobile.putong.core.data.GrowthSpamInfo;
import com.p1.mobile.putong.core.data.IntlMarketConfigEnvelope;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.MigrateAwardDialogData;
import com.p1.mobile.putong.core.data.NewTags;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.RoamedLocationData;
import com.p1.mobile.putong.core.data.SeeExposedUser;
import com.p1.mobile.putong.core.data.SuggesterReason;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.TTCMigrateGuideConfig;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.core.ui.main.HomeMultiTabSwitcher;
import com.p1.mobile.putong.core.ui.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.p1.mobile.putong.core.util.DebugUtil;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.CounterLikeLimit;
import com.p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p1.mobile.putong.data.DoublePair;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.OMSAdCardInfo;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.PushMessageCustom;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserSearchSettings;
import com.p1.mobile.putong.data.UserSubscriptionSettings;
import com.p1.mobile.putong.data.UssTags;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l.aaj;
import l.abi;
import l.adi0;
import l.ark;
import l.az50;
import l.b0d0;
import l.bzc0;
import l.c4g0;
import l.ccn;
import l.cxf;
import l.d30;
import l.d8e0;
import l.do80;
import l.doa;
import l.du2;
import l.e2s;
import l.e30;
import l.e51;
import l.f3a;
import l.f6c0;
import l.g6a;
import l.gj40;
import l.gr9;
import l.gzc0;
import l.hd2;
import l.hdb0;
import l.hpd0;
import l.j63;
import l.j760;
import l.jb0;
import l.jo0;
import l.jq2;
import l.ke7;
import l.lac0;
import l.lqf;
import l.lsi0;
import l.m73;
import l.mah0;
import l.mcr;
import l.mgj;
import l.mkd0;
import l.n3b0;
import l.nd2;
import l.nkp;
import l.o6j0;
import l.ogl0;
import l.ok3;
import l.pvv;
import l.q8p;
import l.qgp0;
import l.qib0;
import l.qp8;
import l.qqi0;
import l.qwp;
import l.roj0;
import l.rxg0;
import l.s7m;
import l.s9;
import l.sa40;
import l.tpd0;
import l.u4c0;
import l.u59;
import l.upa;
import l.uq40;
import l.ura;
import l.v930;
import l.v9j;
import l.vdj;
import l.vwb;
import l.vy8;
import l.w9j;
import l.wvv;
import l.x2c0;
import l.x4i;
import l.x9j;
import l.xaj0;
import l.xdl0;
import l.xij0;
import l.xma;
import l.xnj0;
import l.xy2;
import l.y19;
import l.y8p;
import l.y9j;
import l.ya5;
import l.yd7;
import l.ygh0;
import l.z9j;
import l.zpd0;
import l.zvf0;
import l.zzc0;
import rx.subjects.a;
import rx.subjects.b;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class nt30 extends jq2<ViewTreeObserverOnGlobalLayoutListenerC0030b> {

    /* JADX INFO: renamed from: R0 */
    public static String f17642R0 = "suggest_user_profile_info";

    /* JADX INFO: renamed from: S0 */
    public static String f17643S0 = "home";

    /* JADX INFO: renamed from: T0 */
    public static String f17644T0 = "click";

    /* JADX INFO: renamed from: U0 */
    public static String f17645U0 = "swipe";

    /* JADX INFO: renamed from: V0 */
    public static String f17646V0 = "";

    /* JADX INFO: renamed from: W0 */
    public static hpd0 f17647W0;

    /* JADX INFO: renamed from: X0 */
    public static boolean f17648X0;

    /* JADX INFO: renamed from: Y0 */
    public static String f17649Y0;

    /* JADX INFO: renamed from: Z0 */
    public static hpd0 f17650Z0;

    /* JADX INFO: renamed from: a1 */
    public static String f17651a1;

    /* JADX INFO: renamed from: A */
    public boolean f17652A;

    /* JADX INFO: renamed from: B */
    public boolean f17653B;

    /* JADX INFO: renamed from: C */
    public boolean f17654C;

    /* JADX INFO: renamed from: D */
    public boolean f17655D;

    /* JADX INFO: renamed from: E */
    public boolean f17656E;

    /* JADX INFO: renamed from: E0 */
    public Runnable f17657E0;

    /* JADX INFO: renamed from: F */
    public boolean f17658F;

    /* JADX INFO: renamed from: F0 */
    public boolean f17659F0;

    /* JADX INFO: renamed from: G */
    public a<Boolean> f17660G;

    /* JADX INFO: renamed from: G0 */
    public xy2 f17661G0;

    /* JADX INFO: renamed from: H */
    public boolean f17662H;

    /* JADX INFO: renamed from: H0 */
    public boolean f17663H0;

    /* JADX INFO: renamed from: I */
    public boolean f17664I;

    /* JADX INFO: renamed from: I0 */
    public String f17665I0;

    /* JADX INFO: renamed from: J */
    public boolean f17666J;

    /* JADX INFO: renamed from: J0 */
    public p3m<C0062j.a, VSwipeStack.OnCardSwipeResult> f17667J0;

    /* JADX INFO: renamed from: K */
    public long f17668K;

    /* JADX INFO: renamed from: K0 */
    public boolean f17669K0;

    /* JADX INFO: renamed from: L */
    public boolean f17670L;

    /* JADX INFO: renamed from: L0 */
    public int f17671L0;

    /* JADX INFO: renamed from: M */
    public p3m<z5l.C1346a, Boolean> f17672M;

    /* JADX INFO: renamed from: M0 */
    public c4g0 f17673M0;

    /* JADX INFO: renamed from: N */
    public z5l.C1346a f17674N;

    /* JADX INFO: renamed from: N0 */
    public uj60 f17675N0;

    /* JADX INFO: renamed from: O */
    public dej f17676O;

    /* JADX INFO: renamed from: O0 */
    public boolean f17677O0;

    /* JADX INFO: renamed from: P */
    public String f17678P;

    /* JADX INFO: renamed from: P0 */
    public boolean f17679P0;

    /* JADX INFO: renamed from: Q */
    public String f17680Q;

    /* JADX INFO: renamed from: Q0 */
    public long f17681Q0;

    /* JADX INFO: renamed from: R */
    public boolean f17682R;

    /* JADX INFO: renamed from: S */
    public boolean f17683S;

    /* JADX INFO: renamed from: T */
    public a<Boolean> f17684T;

    /* JADX INFO: renamed from: U */
    public long f17685U;

    /* JADX INFO: renamed from: V */
    public Merchandise f17686V;

    /* JADX INFO: renamed from: W */
    public Merchandise f17687W;

    /* JADX INFO: renamed from: X */
    public c4g0 f17688X;

    /* JADX INFO: renamed from: Y */
    public c4g0 f17689Y;

    /* JADX INFO: renamed from: Z */
    public HashMap f17690Z;

    /* JADX INFO: renamed from: a */
    public String f17691a;

    /* JADX INFO: renamed from: b */
    public int f17692b;

    /* JADX INFO: renamed from: c */
    public boolean f17693c;

    /* JADX INFO: renamed from: d */
    public boolean f17694d;

    /* JADX INFO: renamed from: e */
    public boolean f17695e;

    /* JADX INFO: renamed from: f */
    public boolean f17696f;

    /* JADX INFO: renamed from: g */
    public boolean f17697g;

    /* JADX INFO: renamed from: h */
    public boolean f17698h;

    /* JADX INFO: renamed from: i */
    public boolean f17699i;

    /* JADX INFO: renamed from: j */
    public boolean f17700j;

    /* JADX INFO: renamed from: k */
    public a<roj0> f17701k;

    /* JADX INFO: renamed from: k0 */
    public final e30<Act> f17702k0;

    /* JADX INFO: renamed from: l */
    public a<PartialListOpt<CoreSuggested.UserInfo>> f17703l;

    /* JADX INFO: renamed from: m */
    public a<roj0> f17704m;

    /* JADX INFO: renamed from: n */
    public a<roj0> f17705n;

    /* JADX INFO: renamed from: o */
    public a<Boolean> f17706o;

    /* JADX INFO: renamed from: p */
    public a<Boolean> f17707p;

    /* JADX INFO: renamed from: p0 */
    public final e30<Act> f17708p0;

    /* JADX INFO: renamed from: q */
    public Settings f17709q;

    /* JADX INFO: renamed from: r */
    public b<roj0> f17710r;

    /* JADX INFO: renamed from: s */
    public tpd0 f17711s;

    /* JADX INFO: renamed from: t */
    public zpd0 f17712t;

    /* JADX INFO: renamed from: u */
    public int f17713u;

    /* JADX INFO: renamed from: v */
    public b<roj0> f17714v;

    /* JADX INFO: renamed from: w */
    public b<Boolean> f17715w;

    /* JADX INFO: renamed from: x */
    public hpd0 f17716x;

    /* JADX INFO: renamed from: y */
    public hpd0 f17717y;

    /* JADX INFO: renamed from: z */
    public boolean f17718z;

    /* JADX INFO: renamed from: l.nt30$a */
    public class ViewOnTouchListenerC1057a implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public boolean f17719a = false;

        /* JADX INFO: renamed from: b */
        public float f17720b = 0.0f;

        /* JADX INFO: renamed from: c */
        public float f17721c = 0.0f;

        public ViewOnTouchListenerC1057a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (com.p1.mobile.putong.core.api.b.a(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) nt30.this).viewModel).m1092A2().mo2809j())) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f17719a = false;
                this.f17720b = motionEvent.getX();
                this.f17721c = motionEvent.getY();
                return false;
            }
            if (action == 1) {
                return this.f17719a;
            }
            if (action != 2) {
                return false;
            }
            float x = motionEvent.getX() - this.f17720b;
            float y = motionEvent.getY() - this.f17721c;
            if (x > 15.0f || y > 15.0f) {
                this.f17719a = true;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: l.nt30$b */
    public class RunnableC1058b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String[] f17723a;

        public RunnableC1058b(String[] strArr) {
            this.f17723a = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (nt30.this.f17677O0) {
                return;
            }
            Window window = nt30.this.m19361T4().getWindow();
            if (window == null || window.getDecorView() == null || window.getDecorView().getWindowToken() == null) {
                e51.H(nt30.this.m19361T4(), this, 100L);
            } else {
                nt30.this.f17675N0.m23062f(nt30.this.m19361T4());
                ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) nt30.this).viewModel).m1310q2().requestPermissions(this.f17723a, 256);
            }
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f17647W0 = new hpd0("superLikeTipHasShown", bool);
        f17648X0 = true;
        f17650Z0 = new hpd0("see_entry_has_shown_" + CoreModule.H().userId(), bool);
    }

    public nt30(mcr mcrVar) {
        super(mcrVar);
        this.f17691a = "";
        this.f17692b = 0;
        this.f17693c = false;
        this.f17694d = false;
        this.f17695e = true;
        this.f17697g = false;
        this.f17698h = false;
        this.f17700j = false;
        this.f17701k = a.b();
        this.f17703l = CoreModule.c.m0.a0;
        this.f17704m = a.b();
        this.f17705n = a.b();
        Boolean bool = Boolean.FALSE;
        this.f17706o = a.c(bool);
        this.f17707p = a.c(bool);
        this.f17709q = new Settings();
        this.f17710r = b.b();
        this.f17711s = new tpd0("see_anim_show_times_after_launch" + CoreModule.H().userId(), 0);
        this.f17712t = new zpd0("last_See_Anim_shown_time" + CoreModule.H().userId(), 0L);
        this.f17713u = 0;
        this.f17714v = b.b();
        this.f17715w = b.b();
        this.f17716x = new hpd0("tantan_coin_boost_bubble_shown_" + CoreModule.H().userId(), bool);
        this.f17717y = new hpd0("tantan_coin_super_like_bubble_shown_" + CoreModule.H().userId(), bool);
        this.f17718z = false;
        this.f17652A = false;
        this.f17653B = false;
        this.f17654C = false;
        this.f17655D = false;
        this.f17656E = false;
        this.f17658F = false;
        this.f17660G = a.c(bool);
        this.f17662H = false;
        this.f17664I = true;
        this.f17666J = true;
        this.f17668K = 0L;
        this.f17670L = false;
        this.f17682R = true;
        this.f17684T = a.c(bool);
        this.f17685U = 0L;
        this.f17686V = null;
        this.f17687W = null;
        this.f17702k0 = new e30() { // from class: l.qr30
            public final void call(Object obj) {
                this.f19468a.m19410c8((Act) obj);
            }
        };
        this.f17708p0 = new e30() { // from class: l.rr30
            public final void call(Object obj) {
                nt30.m19250s0((Act) obj);
            }
        };
        this.f17657E0 = new Runnable() { // from class: l.sr30
            @Override // java.lang.Runnable
            public final void run() {
                this.f20432a.m19187f8();
            }
        };
        this.f17663H0 = false;
        this.f17665I0 = "";
        this.f17669K0 = false;
        this.f17671L0 = 0;
        this.f17673M0 = null;
        this.f17681Q0 = adi0.INSTANCE.d();
    }

    /* JADX INFO: renamed from: D2 */
    public static /* synthetic */ PushMessage m19064D2(j760 j760Var) {
        return (PushMessage) j760Var.a;
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ void m19067E0(Act act) {
        if (CoreModule.H().signedIn_()) {
            CoreModule.c.B2.u3();
            CoreModule.c.B2.y3();
        }
    }

    /* JADX INFO: renamed from: F1 */
    public static /* synthetic */ void m19073F1(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: F3 */
    public static /* synthetic */ void m19075F3(Throwable th) {
    }

    /* JADX INFO: renamed from: H2 */
    public static /* synthetic */ void m19081H2(Throwable th) {
    }

    /* JADX INFO: renamed from: H3 */
    public static /* synthetic */ Boolean m19082H3(TabName tabName, TabName tabName2) {
        return RemoteConfig.m9619x().m9651s("filter_home_tab_unchange") ? Boolean.valueOf(TextUtils.equals(tabName.toString(), tabName2.toString())) : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: J4 */
    public static /* synthetic */ void m19093J4(TabName tabName) {
        if (NullChecker.a(CoreModule.c.m0.S) && NullChecker.a(CoreModule.c.m0.S.e())) {
            CoreSuggested coreSuggested = CoreModule.c.m0;
            coreSuggested.s6("push", (String) null, (String) ((j760) coreSuggested.S.e()).a);
        }
    }

    /* JADX INFO: renamed from: K2 */
    public static /* synthetic */ void m19094K2(Throwable th) {
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m19097L0(j760 j760Var, View view, j760 j760Var2) {
        VText vTextFindViewById = view.findViewById(u4c0.m0);
        qib0.G.Q0(view.findViewById(u4c0.U5), ((User) j760Var2.a).fp().profileSmall());
        vTextFindViewById.setText(CoreModule.b.getString(R.string.Jj, ((Integer) j760Var.b).intValue() > 99 ? "99+" : j760Var.b));
    }

    /* JADX INFO: renamed from: M2 */
    public static /* synthetic */ Boolean m19101M2(CoreLikers.a aVar) {
        CoreLikers.LikersTriggerBy likersTriggerBy = CoreLikers.LikersTriggerBy.home_total_liker_float;
        CoreLikers.LikersTriggerBy likersTriggerBy2 = aVar.a;
        return Boolean.valueOf(likersTriggerBy == likersTriggerBy2 || CoreLikers.LikersTriggerBy.home_new_liker_float == likersTriggerBy2);
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m19104N0(HashMap map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((NewTags) ((Map.Entry) it.next()).getValue());
        }
        sa40.o().N(arrayList);
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ Boolean m19107N3(CoreLikers.a aVar) {
        return (Boolean) CoreModule.c.m0.R0.e();
    }

    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ PartialListOpt m19109O0(PartialListOpt partialListOpt, UserPrivilege userPrivilege, VerificationCenter verificationCenter, Long l2) {
        return partialListOpt;
    }

    /* JADX INFO: renamed from: O1 */
    public static /* synthetic */ void m19110O1(Throwable th) {
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m19111O3(Throwable th) {
    }

    /* JADX INFO: renamed from: O5 */
    private void m19113O5() {
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.nn30
            public final void call(Object obj) {
                this.f17579a.m19304E7((c) obj);
            }
        }));
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.on30
            public final void call(Object obj) {
                this.f18179a.m19308F7((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P2 */
    public static /* synthetic */ void m19116P2(TabName tabName) {
        if (tabName != TabName.Card) {
            d.l().k(HomeMultiTabSwitcher.r);
            d.l().k(HomeMultiTabSwitcher.s);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m19119Q0(Throwable th) {
    }

    /* JADX INFO: renamed from: Q2 */
    public static /* synthetic */ void m19121Q2(j760 j760Var, String str, View view, View view2) {
        String str2;
        CoreModule.c.u0.r0.put(Long.valueOf(mqi0.m18550o()));
        if (((Integer) j760Var.b).intValue() > 99) {
            str2 = "99+";
        } else {
            str2 = j760Var.b + "";
        }
        zvf0.A("e_liked_female_number", "p_suggest_users_home_view", new j760[]{vwb.Y("liked_number", str2)});
    }

    /* JADX INFO: renamed from: S2 */
    public static /* synthetic */ void m19131S2(Throwable th) {
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ void m19140U3(TabName tabName) {
        if (tabName == TabName.Msg) {
            CoreModule.c.B2.u3();
            CoreModule.c.B2.y3();
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m19148W3() {
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m19156Y3(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: Z1 */
    public static /* synthetic */ void m19157Z1() {
    }

    /* JADX INFO: renamed from: Z2 */
    public static /* synthetic */ void m19158Z2() {
    }

    /* JADX INFO: renamed from: Z8 */
    public static void m19160Z8(String str) {
        f17651a1 = str;
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ void m19161a1(Throwable th) {
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m19163a3(Throwable th) {
    }

    /* JADX INFO: renamed from: d4 */
    public static /* synthetic */ void m19176d4(TabName tabName) {
        if (tabName != TabName.Card) {
            d.l().k("bubble_superlike_coin_guide");
            d.l().k("bubble_superlike_bubble");
            rxg0.u();
            d.l().k("bubble_undo_remaining");
            d.l().k("bubble_setting_remaining");
            d.l().k("bubble_setting_remaining");
            d.l().k("bubble_undo_remaining");
            x4i.d();
            xdx.m24778A().m24817x(true);
        }
        if (CoreModule.N().ko()) {
            CoreModule.N().Ea();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ Boolean m19177e0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ void m19178e1(Bundle bundle) {
        CoreModule.c.e0.w9((String) qib0.L.g.get());
        qib0.L.g.clear();
    }

    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ void m19183f1(Throwable th) {
    }

    /* JADX INFO: renamed from: f2 */
    public static /* synthetic */ void m19184f2(Throwable th) {
    }

    /* JADX INFO: renamed from: f4 */
    public static /* synthetic */ DoublePair m19186f4(User user) {
        if (user.settings != null) {
            return user.getLatitudeAndLongitude();
        }
        CrashHelper.c(new NullPointerException("user.me.settings==null, userid=" + CoreModule.H().userId() + " ,abheader=" + ABManager.i()));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f8 */
    public /* synthetic */ void m19187f8() {
        this.f17695e = false;
        HashMap map = new HashMap();
        map.put("sourcepage", f17643S0);
        map.put("actiontype", f17644T0);
        final User userR8 = CoreModule.c.m0.r8();
        if (NullChecker.a(CoreModule.c.m0.s8())) {
            CoreModule.c.m0.s8().clone();
        }
        rx.c cVarF9 = CoreModule.c.m0.f9(map);
        if (NullChecker.a(cVarF9)) {
            cVarF9.subscribe(mkd0.H(new e30() { // from class: l.vo30
                public final void call(Object obj) {
                    this.f21670a.m19415d8(userR8, (Relationship) obj);
                }
            }, new e30() { // from class: l.wo30
                public final void call(Object obj) {
                    this.f22229a.m19420e8(userR8, (Throwable) obj);
                }
            }));
            return;
        }
        if (NullChecker.a(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2())) {
            m19348P8(m19417e5(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1310q2().pageId(), "", ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2(), userR8), "");
        }
        this.f17695e = true;
        lsi0.H(m19361T4().getResources().getString(R.string.oq), m19361T4().getResources().getDrawable(x2c0.vu), m19361T4().getResources().getDrawable(x2c0.vr));
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m19193h0(Bundle bundle) {
        CoreModule.c.e0.w9((String) qib0.L.f.get());
        qib0.L.f.clear();
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ void m19194h1(Bundle bundle) {
    }

    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ void m19199i1(roj0 roj0Var) {
        if (((Boolean) CoreModule.c.m0.z1.get()).booleanValue()) {
            return;
        }
        CoreModule.c.m0.z1.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: i6 */
    private boolean m19203i6(CoreSuggested.UserInfo userInfo) {
        return NullChecker.a(userInfo) && CoreModule.c.m0.M6(userInfo.id);
    }

    /* JADX INFO: renamed from: j4 */
    public static /* synthetic */ Unit m19208j4(IntlMarketConfigEnvelope intlMarketConfigEnvelope) {
        return null;
    }

    /* JADX INFO: renamed from: k1 */
    public static /* synthetic */ void m19210k1(Throwable th) {
    }

    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ void m19215l1(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ rx.c m19219m0(j760 j760Var) {
        try {
            if (((PushMessageCustom) PushMessageCustom.JSON_ADAPTER.parse((String) j760Var.a)).newToast) {
                return rx.c.just(v930.h());
            }
        } catch (IOException e) {
            CrashHelper.c(e);
        }
        return v930.k().filter(new w9j() { // from class: l.xo30
            public final Object call(Object obj) {
                return Boolean.valueOf(((TabName) obj) == TabName.Card);
            }
        }).take(1);
    }

    /* JADX INFO: renamed from: m1 */
    public static /* synthetic */ void m19220m1(Throwable th) {
    }

    /* JADX INFO: renamed from: m3 */
    public static /* synthetic */ Boolean m19222m3(Boolean bool, roj0 roj0Var) {
        return bool;
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m19224n0(Throwable th) {
    }

    /* JADX INFO: renamed from: o2 */
    public static /* synthetic */ Boolean m19231o2(j760 j760Var) {
        c cVar = c.i;
        Object obj = j760Var.b;
        return Boolean.valueOf(cVar == obj || c.h == obj);
    }

    /* JADX INFO: renamed from: o3 */
    public static /* synthetic */ void m19232o3(Throwable th) {
    }

    /* JADX INFO: renamed from: p5 */
    public static String m19239p5() {
        return f17651a1;
    }

    /* JADX INFO: renamed from: q1 */
    public static /* synthetic */ Boolean m19241q1(roj0 roj0Var, Boolean bool, roj0 roj0Var2) {
        return bool;
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m19250s0(Act act) {
        if (v930.h() == TabName.Card) {
            CoreModule.c.m0.s6("initiative", "back", (String) null);
        }
    }

    /* JADX INFO: renamed from: s1 */
    public static /* synthetic */ rx.c m19251s1(Boolean bool) {
        CoreModule.c.e0.b0.put(bool);
        return CoreModule.c.e0.W9(CoreModule.H().userId());
    }

    /* JADX INFO: renamed from: s2 */
    public static /* synthetic */ roj0 m19252s2(c cVar, roj0 roj0Var) {
        if (cVar == c.i) {
            return roj0.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: s4 */
    public static /* synthetic */ void m19254s4() {
        CoreModule.c.X1.w3();
        if (TEnum.equals(qib0.h0, "indonesia")) {
            CoreModule.c.j0.F5();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ Boolean m19260u0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: u1 */
    public static /* synthetic */ void m19261u1(PartialListOpt partialListOpt) {
        CoreSuggested.UserInfo userInfoR6;
        e0.a().d();
        jb0.i(partialListOpt);
        if (upa.N3() && ExpandedCardStyleHelper.m2064o().m2077s() && (userInfoR6 = CoreModule.c.m0.r6()) != null && userInfoR6.virtualCardType == VirtualCardType.FakeCard) {
            ExpandedCardStyleHelper.m2064o().m2081w("fake swipe");
        }
    }

    /* JADX INFO: renamed from: u4 */
    public static /* synthetic */ rx.c m19264u4(List list) {
        User user = new User();
        ArrayList arrayList = new ArrayList(CoreModule.c.e0.p9().pictures);
        arrayList.remove(0);
        arrayList.add(0, (Media) list.get(0));
        user.pictures = arrayList;
        return CoreModule.c.e0.u9(user);
    }

    /* JADX INFO: renamed from: x4 */
    public static /* synthetic */ void m19276x4(Throwable th) {
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m19281z0(Bundle bundle) {
        CoreLikers coreLikers = CoreModule.c.u0;
        coreLikers.a7(((Long) coreLikers.k0.get()).longValue(), CoreLikers.LikersTriggerBy.new_like_dialog);
    }

    /* JADX INFO: renamed from: z2 */
    public static /* synthetic */ void m19283z2(String str) {
        str.getClass();
        switch (str) {
            case "expired":
            case "recovered":
                CoreModule.c.f0.Fo();
                CoreModule.c.f0.qq(-1.0d);
                break;
            case "waiting":
                CoreModule.c.f0.Fo();
                break;
            case "trialEnd":
                CoreModule.c.B2.q3();
                CoreModule.c.f0.Fo();
                break;
            case "trialing":
                SeeExposedUser seeExposedUserY3 = CoreModule.c.T1.y3();
                if (seeExposedUserY3 != null) {
                    az50.Companion.b(seeExposedUserY3.userId);
                }
                az50.Companion.c();
                CoreModule.c.f0.Fo();
                break;
        }
    }

    /* JADX INFO: renamed from: z3 */
    public static /* synthetic */ void m19284z3(Throwable th) {
    }

    /* JADX INFO: renamed from: A5 */
    public final void m19286A5() {
        if (upa.N3()) {
            duringCreated(ExpandedCardStyleHelper.m2064o().m2083y().distinctUntilChanged(new x9j() { // from class: l.br30
                public final Object call(Object obj, Object obj2) {
                    return Boolean.valueOf(((ExpandedCardStyleHelper.C0115b) obj).f1196a == ((ExpandedCardStyleHelper.C0115b) obj2).f1196a);
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.cr30
                public final void call(Object obj) {
                    this.f10732a.m19404b7((ExpandedCardStyleHelper.C0115b) obj);
                }
            }));
            duringCreated(rx.c.merge(va40.f21503d.filter(new w9j() { // from class: l.dr30
                public final Object call(Object obj) {
                    return Boolean.valueOf(va40.m23334e() != NewTanFragTag.HOME);
                }
            }), v930.k()).filter(new w9j() { // from class: l.er30
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Serializable) obj) != TabName.Card);
                }
            }).distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.fr30
                public final void call(Object obj) {
                    ExpandedCardStyleHelper.m2064o().m2081w("tab change");
                }
            }));
            duringCreated(ExpandedCardStyleHelper.m2064o().m2068h()).subscribe(mkd0.G(new e30() { // from class: l.gr30
                public final void call(Object obj) {
                    this.f13695a.m19399a7((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: A6 */
    public final /* synthetic */ void m19287A6(roj0 roj0Var) {
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1310q2().s4();
    }

    /* JADX INFO: renamed from: A7 */
    public final /* synthetic */ void m19288A7() {
        if (y8p.d().k()) {
            y8p.d().o(m19361T4());
        }
    }

    /* JADX INFO: renamed from: A8 */
    public void m19289A8(PushMessage pushMessage) {
        CoreModule.K().hj(((jq2) this).viewModel, pushMessage);
    }

    /* JADX INFO: renamed from: B5 */
    public void m19290B5() {
        if (upa.T1() && CoreModule.c.e0.p9().isFemale() && mqi0.m18550o() - ((Long) CoreModule.c.u0.r0.get()).longValue() >= 86400000) {
            long jLongValue = ((Long) CoreModule.c.u0.r0.get()).longValue();
            if (jLongValue <= 0) {
                jLongValue = (long) CoreModule.c.e0.p9().createdTime;
            }
            m19361T4().duringCreated(CoreModule.c.u0.m7(jLongValue)).subscribe(mkd0.H(new e30() { // from class: l.vq30
                public final void call(Object obj) {
                    this.f21745a.m19409c7((j760) obj);
                }
            }, new e30() { // from class: l.wq30
                public final void call(Object obj) {
                    nt30.m19220m1((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: B6 */
    public final /* synthetic */ void m19291B6(Throwable th) {
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1310q2().s4();
        yij0.m25382D(th);
    }

    /* JADX INFO: renamed from: B7 */
    public final /* synthetic */ void m19292B7(Bundle bundle) {
        y8p.d().g(this, new d30() { // from class: l.dp30
            public final void call() {
                this.f11933a.m19288A7();
            }
        });
    }

    /* JADX INFO: renamed from: B8 */
    public final void m19293B8(final ArrayList<Media> arrayList, final String str) {
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1310q2().o4(R.string.J5);
        ya5.I(arrayList, "profile").compose(mkd0.C()).flatMap(new w9j() { // from class: l.yo30
            public final Object call(Object obj) {
                return nt30.m19264u4((List) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.zo30
            public final void call(Object obj) {
                this.f23803a.m19434h8(arrayList, str, (roj0) obj);
            }
        }, new e30() { // from class: l.ap30
            public final void call(Object obj) {
                this.f9597a.m19438i8((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C6 */
    public final /* synthetic */ void m19295C6() {
        if (NullChecker.a(m19361T4())) {
            m19386Y4();
        }
    }

    /* JADX INFO: renamed from: C7 */
    public final /* synthetic */ void m19296C7(Bundle bundle) {
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1140J5();
    }

    /* JADX INFO: renamed from: C8 */
    public void m19297C8() {
        if (SystemClock.uptimeMillis() - this.f17668K >= 2000) {
            this.f17668K = SystemClock.uptimeMillis();
            m19333L8(true);
        }
    }

    /* JADX INFO: renamed from: D5 */
    public final void m19298D5() {
        CoreModule.c.e0.ba();
    }

    /* JADX INFO: renamed from: D6 */
    public final /* synthetic */ void m19299D6(j760 j760Var) {
        if (NullChecker.a(((jq2) this).viewModel) && NullChecker.a(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2())) {
            HashMap map = (HashMap) j760Var.b;
            this.f17690Z = map;
            if (NullChecker.a(map) && this.f17690Z.containsKey("commercial_card_superlike")) {
                m19160Z8("p_home,superlike");
            }
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2797A((SwipeDirection) j760Var.a);
        }
    }

    /* JADX INFO: renamed from: D7 */
    public final /* synthetic */ void m19300D7() {
        this.f17659F0 = false;
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2797A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: D8 */
    public void m19301D8(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        uj60 uj60Var = this.f17675N0;
        boolean z = true;
        if (uj60Var != null) {
            uj60Var.m23060d();
            this.f17677O0 = true;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= iArr.length) {
                z = false;
                break;
            } else if (iArr[i2] == 0) {
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            ygh0.l0(ygh0.h);
        } else {
            ygh0.m0(ygh0.h, wvv.n(m19361T4()) ? "off" : "on");
        }
        if (i == 256) {
            if (!u59.c0()) {
                this.f17679P0 = false;
            }
            if (!z) {
                m19425f9();
                return;
            }
            if (z) {
                if (!pvv.c() || wvv.o()) {
                    m19486t8();
                    return;
                } else {
                    CoreDlg.Y1(m19361T4(), false, new d30() { // from class: l.gs30
                        public final void call() {
                            this.f13705a.m19443j8();
                        }
                    });
                    return;
                }
            }
            m19459m9();
            if (this.f17664I) {
                this.f17664I = false;
                if (!this.f17662H) {
                    this.f17701k.onNext(roj0.a);
                }
            }
            if (z && pvv.c() && !wvv.o()) {
                CoreDlg.X1(m19361T4(), false);
            }
        }
    }

    /* JADX INFO: renamed from: E5 */
    public final void m19302E5() {
        duringCreated(ABManager.W().filter(new w9j() { // from class: l.wr30
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() == 2);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.xr30
            public final void call(Object obj) {
                this.f22696a.m19419e7((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E6 */
    public final /* synthetic */ void m19303E6() {
        this.f17659F0 = false;
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2797A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: E7 */
    public final /* synthetic */ void m19304E7(c cVar) {
        if (cVar == c.i) {
            if (this.f17659F0) {
                e51.H(m19361T4(), new Runnable() { // from class: l.cp30
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10719a.m19300D7();
                    }
                }, 500L);
            }
            if (this.f17696f) {
                this.f17696f = false;
            } else {
                boolean zU8 = CoreModule.c.m0.U8();
                if (zU8 && CoreModule.c.m0.X <= 0) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1152L5(true, true);
                }
                CoreModule.c.m0.p8(zU8);
            }
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1206V1(false);
            if (CoreModule.c.j0.g0) {
                m19361T4().m3879a6();
            }
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1343w5();
        }
        if (CoreModule.N().ko() && cVar == c.j) {
            CoreModule.N().Ea();
        }
    }

    /* JADX INFO: renamed from: E8 */
    public void m19305E8(boolean z) {
        if (!z) {
            CoreModule.c.m0.m8();
        } else {
            qib0.E.m9163t();
            duringCreated(qib0.E.m9159p().take(10L, TimeUnit.SECONDS)).observeOn(jo0.a()).materialize().first().subscribe(mkd0.G(new e30() { // from class: l.co30
                public final void call(Object obj) {
                    CoreModule.c.m0.m8();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: F5 */
    public final void m19306F5() {
        duringCreated(CoreModule.c.S1.H3()).subscribe(mkd0.G(new e30() { // from class: l.tr30
            public final void call(Object obj) {
                this.f20843a.m19424f7((Optional) obj);
            }
        }));
        duringCreated(lli.m17962a().f16249b).subscribe(mkd0.G(new e30() { // from class: l.vr30
            public final void call(Object obj) {
                this.f21752a.m19428g7((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F6 */
    public final /* synthetic */ void m19307F6(String str) {
        if (NullChecker.a(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2()) && NullChecker.a(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2809j()) && TextUtils.equals(str, ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2809j().id)) {
            this.f17659F0 = true;
            CoreModule.c.m0.O5();
            if (g6a.s() && m19361T4().m3896j7() == TabName.Card && lifecycle_() == c.i) {
                e51.H(m19361T4(), new Runnable() { // from class: l.lo30
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f16271a.m19303E6();
                    }
                }, 500L);
            }
        }
    }

    /* JADX INFO: renamed from: F7 */
    public final /* synthetic */ void m19308F7(c cVar) {
        if (((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1310q2().isHidden()) {
            return;
        }
        if (cVar != c.i) {
            if (cVar == c.j) {
                HomeStatisticsHelper.m639D(false);
                return;
            }
            return;
        }
        CoreModule.c.m0.q2[1] = 1;
        if (this.f17682R) {
            this.f17682R = false;
        }
        HomeStatisticsHelper.m639D(true);
        m19326K5(m19361T4());
        gj40 gj40Var = gj40.INSTANCE;
        if (gj40Var.m()) {
            gj40Var.n(m19361T4());
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004c  */
    /* JADX INFO: renamed from: F8, reason: merged with bridge method [inline-methods] */
    public final boolean m19448k8(final CoreLikers.a aVar) {
        String str;
        double d;
        String string;
        String string2;
        if (d.l().x("love_buzz_tab_tip_bubble_key") || d.l().x("key_intl_tribe_pop")) {
            m19361T4().m3887d7(new Runnable() { // from class: l.lp30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16287a.m19448k8(aVar);
                }
            });
            return true;
        }
        User userP9 = CoreModule.c.e0.p9();
        if (vwb.J(aVar.d)) {
            str = null;
            d = 0.0d;
        } else {
            User user = (User) aVar.d.get(0);
            if (NullChecker.a(user)) {
                str = ((Media) user.fp()).url;
                d = user.location.updatedTime;
            } else {
                str = null;
                d = 0.0d;
            }
        }
        String str2 = str;
        double d2 = d;
        if (!f17648X0) {
            int i = aVar.c;
            boolean zA = d8e0.a(userP9);
            int i2 = this.f17713u;
            if (!zA ? i2 < 1 : i2 < 2) {
                if (i > 0 && (n3b0.q() || ((Long) CoreModule.c.u0.k0.get()).longValue() > 0)) {
                    String strM16108G = i0g0.m16108G(i);
                    if (!d8e0.a(userP9)) {
                        string = m19361T4().getString(CoreModule.P().a().N8() ? R.string.Ym : R.string.bn, strM16108G);
                    } else if (!"1".equals(strM16108G)) {
                        String str3 = " " + strM16108G + " ";
                        if (CoreModule.P().a().N8()) {
                            string = m19361T4().getString(R.string.Zm, str3);
                        } else {
                            string = CoreModule.P().a().eg() ? m19361T4().getString(R.string.cn, str3) : m19361T4().getString(R.string.en, str3);
                        }
                    } else if (CoreModule.P().a().N8()) {
                        string = m19361T4().getString(R.string.an);
                    } else {
                        string = CoreModule.P().a().eg() ? m19361T4().getString(R.string.dn) : m19361T4().getString(R.string.fn);
                    }
                    f7e0 f7e0Var = new f7e0((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel, str2, string, i, aVar.b, aVar.g, d2, "new");
                    f7e0Var.s(new d30() { // from class: l.op30
                        public final void call() {
                            this.f18194a.m19458m8();
                        }
                    });
                    f7e0Var.x(CorePopLevel.INTL_SEE_ANIM_BUBBLE);
                    hdb0.c().i(f7e0Var);
                }
            }
            return false;
        }
        f17648X0 = false;
        if (!mqi0.m18535D(((Long) this.f17712t.get()).longValue())) {
            this.f17711s.put(0);
        }
        String strM16108G2 = (d8e0.a(userP9) || !n3b0.q()) ? i0g0.m16108G(aVar.b) : i0g0.m16154z(aVar.b);
        if (!d8e0.a(userP9)) {
            string2 = m19361T4().getString(CoreModule.P().a().N8() ? R.string.Qm : R.string.Tm, strM16108G2);
        } else if (!"1".equals(strM16108G2)) {
            String str4 = " " + strM16108G2 + " ";
            if (CoreModule.P().a().N8()) {
                string2 = m19361T4().getString(R.string.Rm, str4);
            } else {
                string2 = CoreModule.P().a().eg() ? m19361T4().getString(R.string.Um, str4) : m19361T4().getString(R.string.Wm, str4);
            }
        } else if (CoreModule.P().a().N8()) {
            string2 = m19361T4().getString(R.string.Sm);
        } else {
            string2 = CoreModule.P().a().eg() ? m19361T4().getString(R.string.Vm) : m19361T4().getString(R.string.Xm);
        }
        String str5 = string2;
        if (d8e0.a(CoreModule.c.e0.p9())) {
            if (((Integer) this.f17711s.get()).intValue() >= 4) {
                return false;
            }
        } else if (mqi0.m18535D(((Long) this.f17712t.get()).longValue())) {
            return false;
        }
        f7e0 f7e0Var2 = new f7e0((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel, str2, str5, aVar.c, aVar.b, aVar.g, d2, "old");
        f7e0Var2.s(new d30() { // from class: l.np30
            public final void call() {
                this.f17591a.m19453l8();
            }
        });
        f7e0Var2.x(CorePopLevel.INTL_SEE_ANIM_BUBBLE);
        hdb0.c().i(f7e0Var2);
        return true;
    }

    /* JADX INFO: renamed from: G5 */
    public final void m19310G5() {
        if (vy8.m()) {
            duringCreated(lifecycle().filter(new w9j() { // from class: l.vl30
                public final Object call(Object obj) {
                    return Boolean.valueOf(((c) obj) == c.i && ke7.t());
                }
            }).flatMap(new w9j() { // from class: l.am30
                public final Object call(Object obj) {
                    return CoreModule.c.S1.G3();
                }
            })).take(1).subscribe(mkd0.G(new e30() { // from class: l.cm30
                public final void call(Object obj) {
                    this.f10665a.m19433h7((GrowthSpamInfo) obj);
                }
            }));
            duringCreated(ConnectivityReceiver.m()).skip(1).filter(new w9j() { // from class: l.dm30
                public final Object call(Object obj) {
                    return Boolean.valueOf(ConnectivityReceiver.g());
                }
            }).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.em30
                public final void call(Object obj) {
                    ke7.o().z();
                }
            }));
        }
        if (vy8.n()) {
            duringCreated(lifecycle().filter(new w9j() { // from class: l.fm30
                public final Object call(Object obj) {
                    return Boolean.valueOf(((c) obj) == c.i && ke7.t() && !((Boolean) CoreModule.c.e0.I3.get()).booleanValue());
                }
            }).flatMap(new w9j() { // from class: l.gm30
                public final Object call(Object obj) {
                    return CoreModule.c.S1.G3();
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.hm30
                public final void call(Object obj) {
                    this.f14175a.m19437i7((GrowthSpamInfo) obj);
                }
            }));
        }
        if (vy8.m() || vy8.n()) {
            duringCreated(ke7.o().p().filter(new w9j() { // from class: l.im30
                public final Object call(Object obj) {
                    return Boolean.valueOf(ke7.t());
                }
            }).flatMap(new w9j() { // from class: l.jm30
                public final Object call(Object obj) {
                    return CoreModule.c.S1.G3();
                }
            })).subscribe(mkd0.H(new e30() { // from class: l.wl30
                public final void call(Object obj) {
                    this.f22181a.m19442j7((GrowthSpamInfo) obj);
                }
            }, new e30() { // from class: l.xl30
                public final void call(Object obj) {
                    nt30.m19215l1((Throwable) obj);
                }
            }));
            duringCreated(ke7.o().q()).subscribe(mkd0.H(new e30() { // from class: l.yl30
                public final void call(Object obj) {
                    this.f23134a.m19447k7((roj0) obj);
                }
            }, new e30() { // from class: l.zl30
                public final void call(Object obj) {
                    nt30.m19210k1((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G6 */
    public final /* synthetic */ void m19311G6() {
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1310q2().startActivityForResult(MediaPickerAct.g2(m19361T4(), 1, false, false, true, "fake_to_good_dlg", MediaPickerAct.D, false, true, CoreModule.c.e0.p9().gender), 19);
    }

    /* JADX INFO: renamed from: G7 */
    public final /* synthetic */ void m19312G7(MigrateAwardDialogData migrateAwardDialogData) {
        m19386Y4();
    }

    /* JADX INFO: renamed from: G8 */
    public void m19313G8() {
        this.f17666J = false;
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1135I5();
    }

    /* JADX INFO: renamed from: H5 */
    public final void m19314H5() {
        if (mah0.m0()) {
            duringCreated(mkd0.s(this.f17705n, this.f17660G, ogl0.a0() ? zzc0.c0() : rx.c.just(roj0.a), new y9j() { // from class: l.gn30
                /* JADX INFO: renamed from: a */
                public final Object m15112a(Object obj, Object obj2, Object obj3) {
                    return nt30.m19241q1((roj0) obj, (Boolean) obj2, (roj0) obj3);
                }
            })).filter(new w9j() { // from class: l.hn30
                public final Object call(Object obj) {
                    return this.f14179a.m19452l7((Boolean) obj);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.jn30
                public final void call(Object obj) {
                    this.f15234a.m19457m7((Boolean) obj);
                }
            }));
        }
        duringCreated(m19361T4().m3895i7()).subscribe(mkd0.G(new e30() { // from class: l.kn30
            public final void call(Object obj) {
                nt30.m19116P2((TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H6 */
    public final /* synthetic */ void m19315H6(String str) {
        ark.Q0(m19361T4(), str, new d30() { // from class: l.mo30
            public final void call() {
                this.f17003a.m19311G6();
            }
        });
        CoreModule.c.O2.put("");
    }

    /* JADX INFO: renamed from: H7 */
    public final /* synthetic */ void m19316H7(Boolean bool) {
        m19386Y4();
    }

    /* JADX INFO: renamed from: H8 */
    public final void m19317H8() {
        mkd0.z(this.f17689Y);
        this.f17689Y = null;
    }

    /* JADX INFO: renamed from: I5 */
    public final void m19318I5() {
        lqf.a().b(ExtraActLifecycle.onResumeFromBackground, this.f17708p0);
        duringCreated(v930.k()).distinctUntilChanged().skip(1).filter(new w9j() { // from class: l.ns30
            public final Object call(Object obj) {
                return Boolean.valueOf(((TabName) obj) == TabName.Card);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.os30
            public final void call(Object obj) {
                CoreModule.c.m0.s6("initiative", "tab", (String) null);
            }
        }));
        duringCreated(CoreModule.c.m0.T).subscribe(mkd0.G(new e30() { // from class: l.ps30
            public final void call(Object obj) {
                this.f18876a.m19462n7((roj0) obj);
            }
        }));
        duringCreated(CoreModule.c.m0.S).filter(new w9j() { // from class: l.rs30
            public final Object call(Object obj) {
                return Boolean.valueOf(upa.x() || qib0.H.guessedCurrentServerTime() - ((Long) ((j760) obj).b).longValue() < 5000);
            }
        }).switchMap(new w9j() { // from class: l.ss30
            public final Object call(Object obj) {
                return nt30.m19219m0((j760) obj);
            }
        }).filter(new w9j() { // from class: l.ts30
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a(CoreModule.c.m0.S) && NullChecker.a(CoreModule.c.m0.S.e()));
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.us30
            public final void call(Object obj) {
                nt30.m19093J4((TabName) obj);
            }
        }));
        du2.a("[See_Toast]", "insertActionObs sub done");
        duringCreated(CoreModule.c.m0.a0.take(1).switchMap(new w9j() { // from class: l.vs30
            public final Object call(Object obj) {
                return CoreModule.c.m0.b0;
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.ws30
            public final void call(Object obj) {
                this.f22298a.m19466o7((ActionData) obj);
            }
        }));
        duringCreated(v930.k()).distinctUntilChanged().skip(1).subscribe(mkd0.G(new e30() { // from class: l.xs30
            public final void call(Object obj) {
                hdb0.c().k();
            }
        }));
    }

    /* JADX INFO: renamed from: I6 */
    public final /* synthetic */ void m19319I6(j760 j760Var) {
        this.f17706o.onNext(Boolean.FALSE);
        m19392Z4();
    }

    /* JADX INFO: renamed from: I7 */
    public final /* synthetic */ void m19320I7(Pair pair) {
        gj40.INSTANCE.r((String) pair.first, (String) pair.second, m19361T4());
    }

    /* JADX INFO: renamed from: I8 */
    public final void m19321I8() {
        e30<Boolean> e30Var = new e30() { // from class: l.yp30
            public final void call(Object obj) {
                this.f23189a.m19463n8((Boolean) obj);
            }
        };
        final NewMainAct newMainActM19361T4 = m19361T4();
        if (!m19361T4().getIntent().getBooleanExtra("EXTRA_SHOW_TUTORIAL", false) || ((Boolean) CoreModule.c.e0.t1.get()).booleanValue()) {
            if (wvv.p(newMainActM19361T4)) {
                m19325J8();
            } else {
                if (!wvv.m()) {
                    wvv.e();
                }
                this.f17701k.onNext(roj0.a);
            }
            if (!uq40.y(newMainActM19361T4, true)) {
                this.f17660G.onNext(Boolean.TRUE);
            }
            m19421e9();
            return;
        }
        this.f17662H = true;
        CoreModule.c.e0.t1.put(Boolean.TRUE);
        m19361T4().getIntent().removeExtra("EXTRA_SHOW_TUTORIAL");
        if (TEnum.equals(CoreModule.c.e0.p9().source, "facebook") || TEnum.equals(CoreModule.c.e0.p9().source, "google")) {
            this.f17701k.onNext(roj0.a);
        } else {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1325s6(this.f17709q, e30Var, new d30() { // from class: l.zp30
                public final void call() {
                    this.f23821a.m19470p8(newMainActM19361T4);
                }
            });
        }
    }

    /* JADX INFO: renamed from: J5 */
    public final void m19322J5() {
        if (qp8.b()) {
            duringCreated(mkd0.r(zym.m26145a().m26148d(), lifecycle(), new x9j() { // from class: l.ol30
                public final Object call(Object obj, Object obj2) {
                    return vwb.Y((PushMessage) obj, (c) obj2);
                }
            })).filter(new w9j() { // from class: l.pl30
                public final Object call(Object obj) {
                    return nt30.m19231o2((j760) obj);
                }
            }).map(new w9j() { // from class: l.rl30
                public final Object call(Object obj) {
                    return nt30.m19064D2((j760) obj);
                }
            }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.sl30
                public final void call(Object obj) {
                    this.f20352a.m19289A8((PushMessage) obj);
                }
            }));
            CoreModule.Q().m9006Ep();
        }
    }

    /* JADX INFO: renamed from: J6 */
    public final /* synthetic */ rx.c m19323J6(roj0 roj0Var) {
        return mkd0.u(CoreModule.c.e0.o9().distinctUntilChanged(), CoreModule.c.m0.W8().doOnSubscribe(new d30() { // from class: l.rn30
            public final void call() {
                yni.m25474f(LaunchStep.SuggestNet);
            }
        }).doOnNext(new e30() { // from class: l.sn30
            public final void call(Object obj) {
                yni.m25472d(LaunchStep.SuggestNet);
            }
        }), m19361T4().m3895i7().distinctUntilChanged(new x9j() { // from class: l.un30
            public final Object call(Object obj, Object obj2) {
                return nt30.m19082H3((TabName) obj, (TabName) obj2);
            }
        }), vi4.m23378a().mo12117d(3).timeout(3000L, TimeUnit.MILLISECONDS).materialize().observeOn(jo0.a()).first().doOnNext(new e30() { // from class: l.vn30
            public final void call(Object obj) {
                yni.m25472d(LaunchStep.AsyncLayout);
            }
        }).doOnSubscribe(new d30() { // from class: l.wn30
            public final void call() {
                nt30.m19148W3();
            }
        }), CoreModule.c.e0.I1, new aaj() { // from class: l.xn30
            /* JADX INFO: renamed from: a */
            public final Object m24945a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return vwb.Y((PartialListOpt) obj2, (TabName) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: J7 */
    public final /* synthetic */ void m19324J7(UserPrivilege userPrivilege) {
        SVGALoader.with(m19361T4()).from("https://auto.tancdn.com/v1/raw/644d6fdb-68cd-4fd0-997e-d18646ddb13c14.pdf").downloadOnly();
    }

    /* JADX INFO: renamed from: J8 */
    public void m19325J8() {
        if (wvv.m()) {
            if (this.f17664I) {
                this.f17664I = false;
                if (this.f17662H) {
                    return;
                }
                this.f17701k.onNext(roj0.a);
                return;
            }
            return;
        }
        if (u59.c0() || !this.f17679P0) {
            String[] strArr = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
            if (u59.c0()) {
                if (!wvv.q() || (pvv.c() && !wvv.o())) {
                    m19425f9();
                    return;
                } else {
                    m19486t8();
                    return;
                }
            }
            if (wvv.q() && (!pvv.c() || wvv.o())) {
                m19486t8();
                return;
            }
            if (this.f17675N0 == null) {
                this.f17675N0 = new uj60(Arrays.asList(strArr));
            }
            ygh0.n0(ygh0.h);
            wvv.r();
            this.f17679P0 = true;
            e51.M(new RunnableC1058b(strArr));
        }
    }

    /* JADX INFO: renamed from: K5 */
    public final void m19326K5(NewMainAct newMainAct) {
        CoreModule.c.A1.t3(newMainAct, new Function1() { // from class: l.fo30
            public final Object invoke(Object obj) {
                return nt30.m19208j4((IntlMarketConfigEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K6 */
    public final /* synthetic */ void m19327K6() {
        m19475r5();
        m19479s5("swipeFinalDelay");
    }

    /* JADX INFO: renamed from: K7 */
    public final /* synthetic */ void m19328K7(c cVar) {
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1175P5();
    }

    /* JADX INFO: renamed from: K8 */
    public void m19329K8() {
        qib0.E.m9163t();
        CoreModule.c.m0.R5();
        CoreModule.c.m0.m8();
    }

    /* JADX INFO: renamed from: L5 */
    public final void m19330L5() {
        duringCreated(CoreModule.c.m0.B2).subscribe(mkd0.G(new e30() { // from class: l.uq30
            public final void call(Object obj) {
                this.f21311a.m19469p7((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L6 */
    public final /* synthetic */ void m19331L6(j760 j760Var) {
        boolean z;
        boolean z2 = C0031a.f769g;
        yni.m25472d(LaunchStep.RenderTask);
        PartialListOpt partialListOpt = (PartialListOpt) j760Var.a;
        int size = partialListOpt.loaded.size();
        boolean zNeedRefresh = partialListOpt.needRefresh();
        List<CoreSuggested.UserInfo> listM1886y = ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).f666M.m1886y(partialListOpt.loaded);
        if (TextUtils.isEmpty(f17646V0) && !vwb.J(listM1886y) && (!mah0.m0() || !mah0.y0(listM1886y.get(0).id))) {
            f17646V0 = listM1886y.get(0).id;
        }
        if (size != listM1886y.size()) {
            y1j.m25171h("render List refresh change " + size + "," + listM1886y.size());
            z = true;
        } else {
            z = zNeedRefresh;
        }
        StringBuilder sb = new StringBuilder("render cards: ");
        sb.append(z);
        sb.append(",");
        sb.append(zNeedRefresh);
        sb.append(",");
        sb.append(!partialListOpt.hasMore() && listM1886y.size() == 0);
        sb.append(",");
        sb.append(listM1886y.isEmpty());
        sb.append(",");
        sb.append(partialListOpt.getReasonStr());
        y1j.m25171h(sb.toString());
        partialListOpt.resetReason();
        if (upa.Z2()) {
            psq.m20637H(vwb.J(listM1886y));
        }
        if (z) {
            if (upa.y()) {
                ExpandedCardStyleHelper.m2064o().m2065A(vwb.J(listM1886y) ? "" : listM1886y.get(0).id);
            }
            listM1886y.size();
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).f666M.m1878K(listM1886y);
        }
        if (upa.N3() && vwb.J(listM1886y) && ExpandedCardStyleHelper.m2064o().m2077s()) {
            ExpandedCardStyleHelper.m2064o().m2070k(null, null, "empty card");
        }
        if (!z) {
            partialListOpt.setRefreshValue(true);
        }
        if (listM1886y.size() > 0) {
            m19397a5(listM1886y.get(0));
            if (ogl0.Z()) {
                m19402b5(listM1886y.get(0));
            }
        }
        this.f17693c = true;
        m19361T4().postDelayed(new Runnable() { // from class: l.uo30
            @Override // java.lang.Runnable
            public final void run() {
                this.f21275a.m19327K6();
            }
        }, 100L);
        if (partialListOpt.hasMore() || listM1886y.size() != 0) {
            boolean zIsEmpty = listM1886y.isEmpty();
            s7m s7mVar = ((jq2) this).viewModel;
            if (zIsEmpty) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0030b) s7mVar).m1158M5(true, true, true);
            } else {
                ((ViewTreeObserverOnGlobalLayoutListenerC0030b) s7mVar).m1158M5(false, true, true);
            }
        } else {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1158M5(true, false, true);
        }
        if (!((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1144K3() && this.f17704m.e() == null) {
            this.f17704m.onNext(roj0.a);
        }
        if (vy8.g() && NullChecker.a(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2805d()) && !((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1144K3()) {
            this.f17705n.onNext(roj0.a);
        }
        if (IntlCountryCodeController.v() && NullChecker.a(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2805d()) && (((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2805d() instanceof NewNewProfileCard)) {
            ((NewNewProfileCard) ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2805d()).setOnTouchListener(new ViewOnTouchListenerC1057a());
        }
        if (!vwb.J(listM1886y) && ((!mah0.m0() || !mah0.y0(listM1886y.get(0).id)) && (((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1310q2().getParentFragment() instanceof psl))) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1310q2().getParentFragment().mo2545e3();
        }
        if (com.p1.mobile.putong.core.ui.match.a.w().M() && NullChecker.a(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2()) && NullChecker.a(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2805d())) {
            if ((((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2805d() instanceof NewNewProfileCard) || (((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2805d() instanceof e5m)) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1275i6();
            }
        }
    }

    /* JADX INFO: renamed from: L7 */
    public final /* synthetic */ void m19332L7(j760 j760Var) {
        if (xdl0.O0(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).f682U.mo15099m())) {
            o6j0.h("e_advanced_filter_red_dot", "p_suggest_users_home_view", new o6j0.a[0]);
        }
    }

    /* JADX INFO: renamed from: L8 */
    public void m19333L8(boolean z) {
        final a<PartialListOpt<CoreSuggested.UserInfo>> aVar = this.f17703l;
        PartialListOpt partialListOpt = (PartialListOpt) aVar.e();
        if (z || partialListOpt == null || partialListOpt.hasMore()) {
            CoreModule.c.m0.m8().subscribe(mkd0.H(new e30() { // from class: l.hp30
                public final void call(Object obj) {
                    nt30.m19156Y3((roj0) obj);
                }
            }, new e30() { // from class: l.ip30
                public final void call(Object obj) {
                    this.f14756a.m19474q8(aVar, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: M5 */
    public final void m19334M5() {
        if (IntlCountryCodeController.k()) {
            duringCreated(CoreModule.c.e0.o9()).filter(new w9j() { // from class: l.jk30
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((User) obj).isVIP() && n3b0.q() && ((Boolean) CoreModule.c.e0.S0.get()).booleanValue());
                }
            }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.fl30
                public final void call(Object obj) {
                    CoreModule.c.e0.S7().subscribe(mkd0.B());
                }
            }));
        }
        if (IntlCountryCodeController.k()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1186R5(false);
        } else {
            com.p1.mobile.putong.core.api.c cVar = CoreModule.c;
            cVar.j0.h0 = false;
            duringCreated(cVar.e0.o9().flatMap(new w9j() { // from class: l.bp30
                public final Object call(Object obj) {
                    return mkd0.r(CoreModule.c.j0.G4(), CoreModule.c.n3().map(new w9j() { // from class: l.fp30
                        public final Object call(Object obj2) {
                            return Integer.valueOf(((Counter) obj2).likersLimit.remaining);
                        }
                    }).distinctUntilChanged(), new x9j() { // from class: l.gp30
                        public final Object call(Object obj2, Object obj3) {
                            return new j760((FreeTrialEnvelope) obj2, (Integer) obj3);
                        }
                    });
                }
            })).subscribe(mkd0.H(new e30() { // from class: l.mp30
                public final void call(Object obj) {
                    this.f17008a.m19473q7((j760) obj);
                }
            }, new e30() { // from class: l.xp30
                public final void call(Object obj) {
                    this.f22686a.m19477r7((Throwable) obj);
                }
            }));
        }
        if (nkp.b()) {
            duringCreated(mkd0.r(CoreModule.c.e0.o9().map(new gq30()).distinctUntilChanged(), CoreModule.c.n3().map(new w9j() { // from class: l.hq30
                public final Object call(Object obj) {
                    return Boolean.valueOf(n3b0.p());
                }
            }).distinctUntilChanged(), new x9j() { // from class: l.iq30
                public final Object call(Object obj, Object obj2) {
                    return j760.a((Boolean) obj, (Boolean) obj2);
                }
            })).subscribe(mkd0.H(new e30() { // from class: l.jq30
                public final void call(Object obj) {
                    this.f15258a.m19481s7((j760) obj);
                }
            }, new e30() { // from class: l.kq30
                public final void call(Object obj) {
                    nt30.m19183f1((Throwable) obj);
                }
            }));
        }
        if (!((Boolean) f17650Z0.get()).booleanValue() && !vdj.c() && !nkp.c()) {
            duringCreated(new v9j() { // from class: l.qo30
                public final Object call() {
                    return CoreModule.c.u0.O6();
                }
            }).filter(new w9j() { // from class: l.nq30
                public final Object call(Object obj) {
                    return this.f17603a.m19485t7((CoreLikers.a) obj);
                }
            }).distinctUntilChanged().subscribe(mkd0.H(new e30() { // from class: l.yq30
                public final void call(Object obj) {
                    this.f23206a.m19489u7((CoreLikers.a) obj);
                }
            }, new e30() { // from class: l.jr30
                public final void call(Object obj) {
                    nt30.m19119Q0((Throwable) obj);
                }
            }));
            duringCreated(this.f17711s.obs()).filter(new w9j() { // from class: l.ur30
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Integer) obj).intValue() >= 1);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.fs30
                public final void call(Object obj) {
                    nt30.f17650Z0.put(Boolean.TRUE);
                }
            }));
        }
        duringCreated(CoreModule.c.m0.I0).subscribe(mkd0.G(new e30() { // from class: l.qs30
            public final void call(Object obj) {
                this.f19482a.m19493v7((roj0) obj);
            }
        }));
        duringCreated(CoreModule.c.m0.R0).flatMap(new w9j() { // from class: l.bt30
            public final Object call(Object obj) {
                return CoreModule.c.u0.O6();
            }
        }).filter(new w9j() { // from class: l.mt30
            public final Object call(Object obj) {
                return nt30.m19107N3((CoreLikers.a) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.uk30
            public final void call(Object obj) {
                this.f21233a.m19497w7((CoreLikers.a) obj);
            }
        }));
        CoreModule.c.D1.h3();
        duringCreated(CoreModule.c.m0.f2.asObservable()).subscribe(mkd0.G(new e30() { // from class: l.ql30
            public final void call(Object obj) {
                this.f19375a.m19501x7((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.c.m0.i2.asObservable()).subscribe(mkd0.G(new e30() { // from class: l.bm30
            public final void call(Object obj) {
                this.f10171a.m19505y7((SwipeDirection) obj);
            }
        }));
        duringCreated(CoreModule.c.m0.g2.asObservable()).subscribe(mkd0.G(new e30() { // from class: l.mm30
            public final void call(Object obj) {
                this.f16994a.m19509z7((SwipeDirection) obj);
            }
        }));
        int iIntValue = ((Integer) CoreModule.c.J0.i0.get()).intValue();
        int i = (iIntValue / 10) % 100;
        Date date = new Date(mqi0.m18550o());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if (NullChecker.a(CoreModule.c.e0.p9()) && !CoreModule.c.e0.p9().isFemale() && ((!CoreModule.o.d().Vd() || !CoreModule.c.e0.p9().isUltraPremium()) && u59.q() && (iIntValue % 10 < 2 || calendar.get(2) + 1 != i))) {
            duringCreated(CoreModule.c.J0.r3()).subscribe(mkd0.H(new e30() { // from class: l.xm30
                public final void call(Object obj) {
                    CoreModule.c.J0.o0 = ((Boolean) obj).booleanValue();
                }
            }, new e30() { // from class: l.in30
                public final void call(Object obj) {
                    nt30.m19163a3((Throwable) obj);
                }
            }));
        }
        if (u59.W()) {
            creates(new e30() { // from class: l.tn30
                public final void call(Object obj) {
                    this.f20774a.m19292B7((Bundle) obj);
                }
            });
        }
        if (IntlCountryCodeController.l() && !TextUtils.isEmpty((CharSequence) qib0.L.f.get())) {
            creates(new e30() { // from class: l.eo30
                public final void call(Object obj) {
                    nt30.m19193h0((Bundle) obj);
                }
            });
        }
        if (!TextUtils.isEmpty((CharSequence) qib0.L.g.get())) {
            creates(new e30() { // from class: l.po30
                public final void call(Object obj) {
                    nt30.m19178e1((Bundle) obj);
                }
            });
        }
        if (IntlCountryCodeController.i() && NullChecker.a(qib0.L.h.get())) {
            CoreModule.c.e0.C9((UserSubscriptionSettings) qib0.L.h.get());
            qib0.L.h.clear();
        }
    }

    /* JADX INFO: renamed from: M6 */
    public final /* synthetic */ void m19335M6(roj0 roj0Var) {
        if (!((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1201U2("removeSwipeGuideCard s1 ") && ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1244c6()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1254e6();
        }
    }

    /* JADX INFO: renamed from: M7 */
    public final /* synthetic */ void m19336M7(Integer num) {
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1180Q5(true);
    }

    /* JADX INFO: renamed from: M8 */
    public void m19337M8() {
        if (this.f17699i) {
            this.f17699i = false;
        }
        m19386Y4();
    }

    /* JADX INFO: renamed from: N5 */
    public final void m19338N5() {
        if (upa.c3()) {
            creates(new e30() { // from class: l.nl30
                public final void call(Object obj) {
                    this.f17570a.m19296C7((Bundle) obj);
                }
            });
            CoreModule.c.F0.q3();
            psq.m20654Y(m19361T4());
        } else if (upa.Z2()) {
            CoreModule.c.F0.q3();
            psq.m20653X(m19361T4());
        }
    }

    /* JADX INFO: renamed from: N6 */
    public final /* synthetic */ void m19339N6(roj0 roj0Var) {
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1298n6();
    }

    /* JADX INFO: renamed from: N7 */
    public final /* synthetic */ void m19340N7() {
        if (!this.f17700j && CoreModule.H().signedIn_()) {
            j63.j().s();
            if (lac0.m()) {
                s9.j().s();
            }
        }
        e51.J(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1349y2());
    }

    /* JADX INFO: renamed from: N8 */
    public boolean m19341N8() {
        return ((Boolean) f17650Z0.get()).booleanValue();
    }

    /* JADX INFO: renamed from: O6 */
    public final /* synthetic */ void m19342O6(roj0 roj0Var) {
        if (!NullChecker.a(roj0Var) || this.f17699i) {
            return;
        }
        m19386Y4();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    /* JADX INFO: renamed from: O7 */
    public final /* synthetic */ Boolean m19343O7(j760 j760Var) {
        boolean z;
        if (j760Var.b == c.i) {
            CoreLikers.LikersTriggerBy likersTriggerBy = CoreLikers.LikersTriggerBy.home_total_liker_float;
            Object obj = j760Var.a;
            if ((likersTriggerBy == ((CoreLikers.a) obj).a || CoreLikers.LikersTriggerBy.home_new_liker_float == ((CoreLikers.a) obj).a) && ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).act().m3888e6(TabName.Card) && !((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).act().isDialogShowing()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: O8 */
    public void m19344O8(C0158d c0158d, Throwable th) {
        HomeStatisticsHelper.m636A(c0158d, th);
        this.f17697g = false;
        this.f17698h = false;
        sbp.m22045b();
    }

    /* JADX INFO: renamed from: P5 */
    public final void m19345P5() {
        duringCreated(CoreModule.c.Q0.w3().filter(new w9j() { // from class: l.nr30
            public final Object call(Object obj) {
                MigrateAwardDialogData migrateAwardDialogData = (MigrateAwardDialogData) obj;
                return Boolean.valueOf(migrateAwardDialogData != null && migrateAwardDialogData.showDialog);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.or30
            public final void call(Object obj) {
                this.f18214a.m19312G7((MigrateAwardDialogData) obj);
            }
        }, new e30() { // from class: l.pr30
            public final void call(Object obj) {
                nt30.m19232o3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P6 */
    public final /* synthetic */ void m19346P6() {
        if (NullChecker.a(m19361T4())) {
            m19386Y4();
        }
    }

    /* JADX INFO: renamed from: P7 */
    public final /* synthetic */ Boolean m19347P7(j760 j760Var) {
        User userP9 = CoreModule.c.e0.p9();
        if (CoreLikers.LikersTriggerBy.home_total_liker_float == ((CoreLikers.a) j760Var.a).a && gzc0.f0() && !m19361T4().isDialogShowing() && !userP9.isBanned()) {
            if (ogl0.F()) {
                kb50 kb50VarM16322f = ic50.m16316j().m16322f();
                OmsDialog omsDialog = OmsDialog.p_offline_popup;
                if (kb50VarM16322f.m17392M(omsDialog.getIdentifier(), false)) {
                    gzc0.h0(this);
                    ic50.m16316j().m16322f().m17407b0(omsDialog.getIdentifier(), 0, false);
                } else {
                    gzc0.c0().f = true;
                }
            } else {
                gzc0.h0(this);
            }
        }
        boolean zD0 = gzc0.d0(((CoreLikers.a) j760Var.a).a);
        if (f17648X0 || !zD0) {
            CoreModule.c.u0.m0.put(Long.valueOf(qib0.H.guessedCurrentServerTime()));
        }
        Object obj = j760Var.a;
        if (((CoreLikers.a) obj).b == 0) {
            f17648X0 = false;
        }
        if (((CoreLikers.a) obj).b > 0 && !zD0) {
            return Boolean.TRUE;
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).act().m3891f7();
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: P8 */
    public void m19348P8(C0158d c0158d, String str) {
        HomeStatisticsHelper.m637B(c0158d, str);
        this.f17697g = false;
        this.f17698h = false;
        sbp.m22045b();
    }

    /* JADX INFO: renamed from: Q5 */
    public final void m19349Q5() {
        duringCreated(mkd0.t(CoreModule.c.e0.o9(), CoreModule.c.u0.P6(), CoreModule.c.n3(), lifecycle(), new z9j() { // from class: l.hr30
            /* JADX INFO: renamed from: b */
            public final Object m15945b(Object obj, Object obj2, Object obj3, Object obj4) {
                User user = (User) obj;
                CoreLikers.a aVar = (CoreLikers.a) obj2;
                return Boolean.valueOf(!user.isFemale() && CoreModule.c.e0.j8(user) && n3b0.g() == 0 && aVar != null && aVar.a == CoreLikers.LikersTriggerBy.new_like_dialog && ((Counter) obj3) != null && ((c) obj4) == c.i);
            }
        })).filter(new w9j() { // from class: l.ir30
            public final Object call(Object obj) {
                return nt30.m19260u0((Boolean) obj);
            }
        }).first().compose(mkd0.R()).subscribe(mkd0.H(new e30() { // from class: l.kr30
            public final void call(Object obj) {
                this.f15821a.m19316H7((Boolean) obj);
            }
        }, new e30() { // from class: l.lr30
            public final void call(Object obj) {
                nt30.m19131S2((Throwable) obj);
            }
        }));
        creates(new e30() { // from class: l.mr30
            public final void call(Object obj) {
                nt30.m19281z0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q6 */
    public final /* synthetic */ void m19350Q6(Boolean bool) {
        e51.H(m19361T4(), new Runnable() { // from class: l.ko30
            @Override // java.lang.Runnable
            public final void run() {
                this.f15782a.m19346P6();
            }
        }, 400L);
    }

    /* JADX INFO: renamed from: Q7 */
    public final /* synthetic */ void m19351Q7(j760 j760Var) {
        if (m19448k8((CoreLikers.a) j760Var.a)) {
            return;
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).act().m3891f7();
    }

    /* JADX INFO: renamed from: Q8 */
    public void m19352Q8(int i) {
        this.f17692b = i;
    }

    /* JADX INFO: renamed from: R5 */
    public final void m19353R5() {
        gj40 gj40Var = gj40.INSTANCE;
        if (gj40Var.m()) {
            duringCreated(gj40Var.l()).subscribe(mkd0.H(new e30() { // from class: l.tl30
                public final void call(Object obj) {
                    this.f20763a.m19320I7((Pair) obj);
                }
            }, new e30() { // from class: l.ul30
                public final void call(Object obj) {
                    nt30.m19184f2((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: R6 */
    public final /* synthetic */ void m19354R6(xaj0 xaj0Var) {
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1215W5((DoublePair) xaj0Var.a, ((RoamedLocationData) xaj0Var.b).data);
    }

    /* JADX INFO: renamed from: R7 */
    public final /* synthetic */ void m19355R7(Boolean bool) {
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1180Q5(true);
    }

    /* JADX INFO: renamed from: R8 */
    public void m19356R8(String str) {
        this.f17691a = str;
    }

    /* JADX INFO: renamed from: S5 */
    public final void m19357S5() {
        if (xma.X3()) {
            duringCreated(CoreModule.c.C0.u3(SummarizedPrivilegesId.get("oDiamond"))).filter(new w9j() { // from class: l.pq30
                public final Object call(Object obj) {
                    return Boolean.valueOf(xma.F3());
                }
            }).take(1).subscribe(mkd0.G(new e30() { // from class: l.qq30
                public final void call(Object obj) {
                    this.f19442a.m19324J7((UserPrivilege) obj);
                }
            }));
        } else {
            SVGALoader.with(m19361T4()).from("https://auto.tancdn.com/v1/raw/644d6fdb-68cd-4fd0-997e-d18646ddb13c14.pdf").downloadOnly();
        }
        SVGALoader.with(m19361T4()).from("https://auto.tancdn.com/v1/raw/84746e2a-9059-47ff-90af-07839ec09c0f14.pdf").downloadOnly();
        SVGALoader.with(m19361T4()).from("https://auto.tancdn.com/v1/raw/05053d7f-77ec-4650-a3b2-9eeb949bbafb14.pdf").downloadOnly();
        SVGALoader.with(m19361T4()).from("https://auto.tancdn.com/v1/raw/742c2a25-1a5c-441c-9433-72583a165ddf14.pdf").downloadOnly();
    }

    /* JADX INFO: renamed from: S6 */
    public final /* synthetic */ void m19358S6(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        s7m s7mVar = ((jq2) this).viewModel;
        if (zBooleanValue) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) s7mVar).m1288l6();
        } else if (((ViewTreeObserverOnGlobalLayoutListenerC0030b) s7mVar).m1244c6()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1254e6();
        }
    }

    /* JADX INFO: renamed from: S7 */
    public final /* synthetic */ void m19359S7(Boolean bool) {
        if (u59.U() && !mqi0.m18535D(((Long) CoreModule.c.J0.h0.get()).longValue()) && xma.C3()) {
            CoreModule.c.J0.c4("ultraPremium");
        }
        if (CoreModule.c.J0.F3()) {
            m73.g(m19361T4());
        } else {
            m73.h(m19361T4(), ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1265h2(), (v9j) null);
        }
    }

    /* JADX INFO: renamed from: S8 */
    public void m19360S8(String str) {
        this.f17665I0 = str;
    }

    /* JADX INFO: renamed from: T4 */
    public NewMainAct m19361T4() {
        return ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).act();
    }

    /* JADX INFO: renamed from: T5 */
    public final void m19362T5() {
        duringCreated(lifecycle()).filter(new w9j() { // from class: l.ls30
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.k);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.ms30
            public final void call(Object obj) {
                this.f17060a.m19328K7((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T6 */
    public final /* synthetic */ void m19363T6(Boolean bool) {
        if (bool.booleanValue()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1172P2();
            return;
        }
        if (CoreModule.c.m0.K0.i() && ((Boolean) CoreModule.c.m0.K0.e()).booleanValue()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1288l6();
        } else if (((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1244c6()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1254e6();
        }
    }

    /* JADX INFO: renamed from: T7 */
    public final /* synthetic */ void m19364T7(TabName tabName) {
        qug0.m21316g().m21322j((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel);
    }

    /* JADX INFO: renamed from: T8 */
    public void m19365T8(boolean z) {
        this.f17656E = z;
    }

    /* JADX INFO: renamed from: U4 */
    public void m19366U4() {
        long jM18550o = this.f17681Q0 - mqi0.m18550o();
        if (jM18550o >= 0 || jM18550o <= -7200000) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1224Y5(1);
        } else {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1224Y5(2);
        }
        this.f17688X = rx.c.interval(0L, 500L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.wp30
            public final void call(Object obj) {
                this.f22258a.m19476r6((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U5 */
    public final void m19367U5() {
        if (ogl0.P()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("https://fe-static.tancdn.com/v1/raw/b63ed4a9-0bbb-4a36-b6ea-91dbb32addd814.svga");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/4475f01c-8dd0-40b9-851d-f60f578c08db14.svga");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/3fde0b7d-f6d7-410d-9454-59d1b7d1783014.svga");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/1ecec93e-84b2-4731-a927-90928bb72cb114.svga");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/a0ef67b0-beed-4cfc-b970-3b321ea7b78f14.svga");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/444d9220-d23d-4a74-9eb7-43b89c4f2f5614.svga");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/b24ea63e-9d42-4569-a402-a155d1fa76ae14.svga");
            SVGALoader.with(App.e).batchDownload(arrayList);
        }
    }

    /* JADX INFO: renamed from: U6 */
    public final /* synthetic */ void m19368U6(String str) {
        CardButtonsShowAndHideType cardButtonsShowAndHideTypeM1249d6 = ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1249d6();
        if (TEnum.equals(cardButtonsShowAndHideTypeM1249d6, "show")) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1120F5();
        } else if (TEnum.equals(cardButtonsShowAndHideTypeM1249d6, "hide")) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1115E5();
        } else if (TEnum.equals(cardButtonsShowAndHideTypeM1249d6, "only_hide_operation_btn")) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1347x5();
        }
    }

    /* JADX INFO: renamed from: U7 */
    public final /* synthetic */ void m19369U7(String str) {
        if (TextUtils.equals(str, m19361T4().getPopLifeName()) && NullChecker.a(qug0.m21316g().m21320e())) {
            qug0.m21316g().m21322j((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel);
        }
    }

    /* JADX INFO: renamed from: U8 */
    public void m19370U8(boolean z) {
        this.f17655D = z;
    }

    /* JADX INFO: renamed from: V4 */
    public final void m19371V4(User user) {
        m19471q5(user, true);
    }

    /* JADX INFO: renamed from: V5 */
    public final void m19372V5() {
        duringCreated(mkd0.r(m19361T4().m3895i7().distinctUntilChanged(), m19361T4().lifecycle().distinctUntilChanged(), new bs30()).filter(new w9j() { // from class: l.cs30
            public final Object call(Object obj) {
                j760 j760Var = (j760) obj;
                return Boolean.valueOf(j760Var.b == c.i && TextUtils.equals(((TabName) j760Var.a).name(), TabName.Card.name()));
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.ds30
            public final void call(Object obj) {
                this.f11974a.m19332L7((j760) obj);
            }
        }, new e30() { // from class: l.es30
            public final void call(Object obj) {
                nt30.m19224n0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V6 */
    public final /* synthetic */ void m19373V6(roj0 roj0Var) {
        if (NullChecker.a(((jq2) this).viewModel) && NullChecker.a(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1132I2()) && NullChecker.a(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1117F2())) {
            xdl0.M(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1132I2(), false);
            xdl0.M(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1117F2(), true);
        }
    }

    /* JADX INFO: renamed from: V7 */
    public final /* synthetic */ void m19374V7() {
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1309p6();
    }

    /* JADX INFO: renamed from: V8 */
    public void m19375V8(boolean z) {
        this.f17654C = z;
    }

    /* JADX INFO: renamed from: W4 */
    public boolean m19376W4() {
        return (TEnum.equals(CoreModule.c.e0.p9().source, "wechat") || TEnum.equals(CoreModule.c.e0.p9().source, "qq")) && vy8.o() && !((Boolean) CoreModule.c.e0.b0.get()).booleanValue();
    }

    /* JADX INFO: renamed from: W5 */
    public final void m19377W5() {
        if (bzc0.f()) {
            CoreModule.c.m0.e9();
            CoreModule.c.n2.J3(CoreModule.H().userId());
        }
    }

    /* JADX INFO: renamed from: W6 */
    public final /* synthetic */ void m19378W6(roj0 roj0Var) {
        if (NullChecker.a(((jq2) this).viewModel) && NullChecker.a(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1132I2()) && NullChecker.a(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1117F2())) {
            xdl0.M(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1132I2(), true);
            xdl0.M(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1117F2(), true);
        }
    }

    /* JADX INFO: renamed from: W7 */
    public final /* synthetic */ void m19379W7(Boolean bool) {
        if (zzc0.f0() && bool.booleanValue()) {
            e51.H(m19361T4(), new Runnable() { // from class: l.ep30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12641a.m19374V7();
                }
            }, 800L);
        }
    }

    /* JADX INFO: renamed from: W8 */
    public void m19380W8(boolean z) {
        this.f17653B = z;
    }

    /* JADX INFO: renamed from: X4 */
    public void m19381X4() {
        if (this.f17670L) {
            return;
        }
        this.f17670L = true;
        CoreModule.c.e0.b0.put(Boolean.valueOf(qgp0.e().g()));
        if (!qgp0.e().g()) {
            this.f17706o.onNext(Boolean.TRUE);
        } else {
            this.f17663H0 = true;
            qgp0.e().h(m19361T4()).flatMap(new w9j() { // from class: l.no30
                public final Object call(Object obj) {
                    return nt30.m19251s1((Boolean) obj);
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.oo30
                public final void call(Object obj) {
                    this.f18188a.m19480s6((roj0) obj);
                }
            }, new e30() { // from class: l.ro30
                public final void call(Object obj) {
                    this.f19926a.m19484t6((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: X5 */
    public final void m19382X5() {
        if (ogl0.T()) {
            CoreModule.c.o2.h3();
        }
    }

    /* JADX INFO: renamed from: X6 */
    public final /* synthetic */ void m19383X6(SwipeDirection swipeDirection) {
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1298n6();
        SwipeDirection swipeDirection2 = SwipeDirection.RIGHT;
        if (swipeDirection == swipeDirection2) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2797A(swipeDirection2);
            return;
        }
        SwipeDirection swipeDirection3 = SwipeDirection.LEFT;
        if (swipeDirection == swipeDirection3) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2797A(swipeDirection3);
            return;
        }
        SwipeDirection swipeDirection4 = SwipeDirection.UP;
        if (swipeDirection == swipeDirection4) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2797A(swipeDirection4);
        }
    }

    /* JADX INFO: renamed from: X7 */
    public final /* synthetic */ rx.c m19384X7(User user) {
        return this.f17710r;
    }

    /* JADX INFO: renamed from: X8 */
    public void m19385X8(boolean z) {
        this.f17652A = z;
    }

    /* JADX INFO: renamed from: Y4 */
    public void m19386Y4() {
        if (CoreModule.c.e0.p9() == null) {
            this.f17671L0 = 1;
            if (NullChecker.a(this.f17673M0) && !this.f17673M0.isUnsubscribed()) {
                this.f17673M0.unsubscribe();
            }
            CrashHelper.c(new IllegalStateException("checkIntro error when illegal account state, userId:" + CoreModule.H().userId() + ", login: " + CoreModule.H().signedIn_() + ", me == null"));
            this.f17673M0 = duringCreated(mkd0.r(CoreModule.c.f0.on(), CoreModule.c.e0.o9(), new yn30())).filter(new w9j() { // from class: l.zn30
                public final Object call(Object obj) {
                    return this.f23756a.m19488u6((j760) obj);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.ao30
                public final void call(Object obj) {
                    this.f9587a.m19492v6((j760) obj);
                }
            }));
            return;
        }
        if (ic50.m16316j().m16322f().m17412g0()) {
            return;
        }
        if (!((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).act().m3888e6(TabName.Card) && !m19401a9()) {
            this.f17699i = true;
            return;
        }
        if (!NullChecker.a(m19361T4()) || m19361T4().isDialogShowing()) {
            if (NullChecker.a(m19361T4())) {
                this.f17699i = true;
                m19361T4().onDialogDismissExtra(new d30() { // from class: l.bo30
                    public final void call() {
                        this.f10215a.m19500x6();
                    }
                });
                return;
            }
            return;
        }
        if (this.f17672M == null) {
            this.f17672M = new z5l();
        }
        if (this.f17674N == null) {
            this.f17674N = new z5l.C1346a(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1310q2(), this, (ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel);
        }
        if (this.f17672M.mo1469b(this.f17674N)) {
            this.f17672M.mo1468a(this.f17674N);
        }
    }

    /* JADX INFO: renamed from: Y5 */
    public final void m19387Y5() {
        if (!lac0.m()) {
            duringCreated(CoreModule.c.n3()).map(new w9j() { // from class: l.km30
                public final Object call(Object obj) {
                    return Integer.valueOf(n3b0.d((Counter) obj));
                }
            }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.qm30
                public final void call(Object obj) {
                    this.f19384a.m19336M7((Integer) obj);
                }
            }));
        }
        creates(new e30() { // from class: l.rm30
            public final void call(Object obj) {
                nt30.m19194h1((Bundle) obj);
            }
        }, new d30() { // from class: l.sm30
            public final void call() {
                this.f20360a.m19340N7();
            }
        });
        duringCreated(mkd0.s(CoreModule.c.u0.O6().filter(new w9j() { // from class: l.tm30
            public final Object call(Object obj) {
                return nt30.m19101M2((CoreLikers.a) obj);
            }
        }).throttleFirst(10L, TimeUnit.SECONDS).observeOn(jo0.a()), lifecycle(), this.f17704m, new y9j() { // from class: l.um30
            /* JADX INFO: renamed from: a */
            public final Object m23066a(Object obj, Object obj2, Object obj3) {
                return vwb.Y((CoreLikers.a) obj, (c) obj2);
            }
        })).filter(new w9j() { // from class: l.vm30
            public final Object call(Object obj) {
                return this.f21648a.m19343O7((j760) obj);
            }
        }).distinctUntilChanged().filter(new w9j() { // from class: l.wm30
            public final Object call(Object obj) {
                return this.f22190a.m19347P7((j760) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.ym30
            public final void call(Object obj) {
                this.f23141a.m19351Q7((j760) obj);
            }
        }));
        if (!lac0.m()) {
            duringCreated(CoreModule.c.J0.t3().filter(new doa()).map(new w9j() { // from class: l.lm30
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BoostStatus) ((Optional) obj).get()).active);
                }
            }).distinctUntilChanged().filter(new w9j() { // from class: l.nm30
                public final Object call(Object obj) {
                    return nt30.m19177e0((Boolean) obj);
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.om30
                public final void call(Object obj) {
                    this.f18170a.m19355R7((Boolean) obj);
                }
            }));
        }
        duringCreated(v930.j(TabName.Card)).subscribe(mkd0.G(new e30() { // from class: l.pm30
            public final void call(Object obj) {
                this.f18784a.m19359S7((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y6 */
    public final /* synthetic */ void m19388Y6(j760 j760Var) {
        if (((Integer) j760Var.a).intValue() > 0) {
            m19435h9(((Integer) j760Var.a).intValue(), (List) j760Var.b);
        }
    }

    /* JADX INFO: renamed from: Y7 */
    public final /* synthetic */ void m19389Y7(roj0 roj0Var) {
        ark.T0(m19361T4());
    }

    /* JADX INFO: renamed from: Y8 */
    public void m19390Y8(boolean z) {
        this.f17718z = z;
    }

    /* JADX INFO: renamed from: Z */
    public void m19391Z() {
        super.Z();
        yni.m25474f(LaunchStep.RenderTask);
        if (upa.Z2()) {
            CoreModule.c.z2.y3();
        }
    }

    /* JADX INFO: renamed from: Z4 */
    public final void m19392Z4() {
        NewMainAct newMainActM19361T4 = m19361T4();
        if (!NullChecker.a(newMainActM19361T4) || newMainActM19361T4.isDialogShowing()) {
            this.f17701k.onNext(roj0.a);
            return;
        }
        if (vy8.d()) {
            CoreModule.c.e0.c0.put(Boolean.TRUE);
            ark.O0(m19361T4(), "", new d30() { // from class: l.pp30
                public final void call() {
                    this.f18821a.m19504y6();
                }
            }, false);
        } else if (!m19376W4()) {
            this.f17701k.onNext(roj0.a);
        } else {
            CoreModule.c.e0.c0.put(Boolean.TRUE);
            ark.O0(newMainActM19361T4, "", new d30() { // from class: l.qp30
                public final void call() {
                    this.f19421a.m19508z6();
                }
            }, true);
        }
    }

    /* JADX INFO: renamed from: Z5 */
    public final void m19393Z5() {
        if (upa.x()) {
            duringCreated(v930.k().filter(new w9j() { // from class: l.rq30
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.a((TabName) obj) && NullChecker.a(qug0.m21316g().m21320e()));
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.sq30
                public final void call(Object obj) {
                    this.f20418a.m19364T7((TabName) obj);
                }
            }));
            if (com.p1.mobile.android.ui.poplevel.a.p().I()) {
                duringCreated(com.p1.mobile.android.ui.poplevel.a.p().r()).subscribe(mkd0.G(new e30() { // from class: l.tq30
                    public final void call(Object obj) {
                        this.f20823a.m19369U7((String) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: Z6 */
    public final /* synthetic */ void m19394Z6(Bundle bundle) {
        if (NullChecker.a(m19361T4())) {
            m19321I8();
        } else {
            this.f17701k.onNext(roj0.a);
        }
        boolean z = this.f17658F;
        if (NullChecker.a(this.f17703l.e()) && !vwb.J(((PartialListOpt) this.f17703l.e()).loaded) && z) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1322s3(false, true);
        } else if (!NullChecker.a(this.f17703l.e()) || ((PartialListOpt) this.f17703l.e()).hasMore()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1322s3(true, true);
        } else {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1322s3(true, false);
        }
        this.f17658F = true;
        e51.y(new Runnable() { // from class: l.to30
            @Override // java.lang.Runnable
            public final void run() {
                nt30.m19254s4();
            }
        });
    }

    /* JADX INFO: renamed from: Z7 */
    public final /* synthetic */ void m19395Z7(String str) {
        Picture picture = new Picture();
        ((Media) picture).url = str;
        qib0.G.B0(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1321s2(), picture.profile480());
        qib0.G.B0(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1305p2(), picture.profile480());
    }

    /* JADX INFO: renamed from: a0 */
    public void m19396a0() {
        LaunchStep launchStep = LaunchStep.NewNewHomeSub;
        yni.m25474f(launchStep);
        y8i0.m25203a("NewNewHomePresenter initSubscription");
        CoreModule.c.m0.q2[1] = 0;
        m19507z5();
        m19345P5();
        m19503y5();
        m19413d6();
        m19302E5();
        m19314H5();
        m19334M5();
        m19387Y5();
        m19113O5();
        m19298D5();
        m19349Q5();
        m19362T5();
        m19322J5();
        m19290B5();
        m19403b6();
        m19408c6();
        m19495w5();
        m19294C5();
        m19318I5();
        m19491v5();
        m19310G5();
        m19393Z5();
        m19306F5();
        m19377W5();
        nya0.m19532a(m19361T4());
        m19382X5();
        m19353R5();
        m19357S5();
        m19372V5();
        m19330L5();
        m19367U5();
        m19338N5();
        m19487u5();
        m19398a6();
        m19499x5();
        m19418e6();
        m19286A5();
        yni.m25472d(launchStep);
        y8i0.m25204b();
    }

    /* JADX INFO: renamed from: a5 */
    public final void m19397a5(CoreSuggested.UserInfo userInfo) {
        if (!(NullChecker.a(m19361T4()) && NullChecker.a(userInfo) && NullChecker.a(userInfo.liveLivingCardDataWrapper)) && ((userInfo.extensionObject == null || !userInfo.virtualCardType.equals(VirtualCardType.LiveMultipleCard)) && ((userInfo.extensionObject == null || !userInfo.virtualCardType.equals(VirtualCardType.LiveVoiceNewCard)) && !((userInfo.extensionObject != null && userInfo.virtualCardType.equals(VirtualCardType.LiveVoiceRoomCard)) || m19432h6(userInfo) || m19203i6(userInfo))))) {
            return;
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1115E5();
        if (upa.N3()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1234a6(false);
        }
    }

    /* JADX INFO: renamed from: a6 */
    public final void m19398a6() {
        if (ogl0.X()) {
            CoreModule.c.B2.u3();
            CoreModule.c.B2.y3();
            duringCreated(v930.k().distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.hs30
                public final void call(Object obj) {
                    nt30.m19140U3((TabName) obj);
                }
            }));
            duringCreated(CoreModule.c.C0.u3(SummarizedPrivilegesId.get("svip")).distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.is30
                public final void call(Object obj) {
                    CoreModule.c.B2.y3();
                }
            }));
            lqf.a().b(ExtraActLifecycle.onResumeFromAppStartOrBackground, new e30() { // from class: l.js30
                public final void call(Object obj) {
                    nt30.m19067E0((Act) obj);
                }
            });
            duringCreated(CoreModule.c.B2.o3()).subscribe(mkd0.G(new e30() { // from class: l.ks30
                public final void call(Object obj) {
                    nt30.m19283z2((String) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: a7 */
    public final /* synthetic */ void m19399a7(Boolean bool) {
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1194T1(bool.booleanValue());
    }

    /* JADX INFO: renamed from: a8 */
    public final /* synthetic */ void m19400a8(long j, Long l2) {
        m19490u8(j);
    }

    /* JADX INFO: renamed from: a9 */
    public final boolean m19401a9() {
        return m19406b9() || m19411c9();
    }

    /* JADX INFO: renamed from: b5 */
    public final void m19402b5(CoreSuggested.UserInfo userInfo) {
        if (!rxg0.j().o(userInfo.id)) {
            rxg0.j().n = null;
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1126G6();
        } else {
            if (CoreModule.K().me_().isODiamond() || rxg0.j().n()) {
                return;
            }
            if (!m19423f6(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1310q2(), userInfo)) {
                rxg0.j().n = null;
                ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1126G6();
            } else {
                if (rxg0.j().o(userInfo.id)) {
                    return;
                }
                ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1344w6(false);
            }
        }
    }

    /* JADX INFO: renamed from: b6 */
    public final void m19403b6() {
        duringCreated(mkd0.r(rxg0.j().a, rxg0.j().b, new x9j() { // from class: l.xq30
            public final Object call(Object obj, Object obj2) {
                return nt30.m19222m3((Boolean) obj, (roj0) obj2);
            }
        })).take(1).subscribe(mkd0.G(new e30() { // from class: l.zq30
            public final void call(Object obj) {
                this.f23830a.m19379W7((Boolean) obj);
            }
        }));
        duringCreated(m19361T4().m3895i7()).subscribe(mkd0.G(new e30() { // from class: l.ar30
            public final void call(Object obj) {
                nt30.m19176d4((TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b7 */
    public final /* synthetic */ void m19404b7(ExpandedCardStyleHelper.C0115b c0115b) {
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1221Y1(c0115b.m2089e(), c0115b.f1198c, c0115b.f1199d);
    }

    /* JADX INFO: renamed from: b8 */
    public final /* synthetic */ void m19405b8(Long l2) {
        long jLongValue = l2.longValue();
        s7m s7mVar = ((jq2) this).viewModel;
        if (jLongValue <= 0) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) s7mVar).m1210V5(1);
            return;
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) s7mVar).m1210V5(2);
        if (l2.longValue() < 3600000) {
            if (this.f17689Y != null) {
                m19317H8();
            }
            long j = l2.longValue() <= 2000 ? 500L : 2000L;
            final long jM18550o = mqi0.m18550o() + l2.longValue();
            this.f17689Y = rx.c.interval(0L, j, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.dq30
                public final void call(Object obj) {
                    this.f11948a.m19400a8(jM18550o, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: b9 */
    public final boolean m19406b9() {
        return CoreModule.c.x0.e4();
    }

    /* JADX INFO: renamed from: c5 */
    public void m19407c5() {
        this.f17680Q = null;
        this.f17678P = null;
    }

    /* JADX INFO: renamed from: c6 */
    public final void m19408c6() {
        if (!upa.u2() || ((Boolean) CoreModule.c.m0.x0.get()).booleanValue()) {
            return;
        }
        User userP9 = CoreModule.c.e0.p9();
        if (!NullChecker.a(userP9) || userP9.isNewUserIn24H()) {
            return;
        }
        CoreModule.c.m0.x0.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: c7 */
    public final /* synthetic */ void m19409c7(final j760 j760Var) {
        if (m19361T4().m3886d6() && j760Var.a != null && ((Integer) j760Var.b).intValue() > 0 && !abi.E()) {
            hd2 hd2Var = new hd2(m19361T4());
            ViewGroup viewGroupM19464o5 = m19464o5(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1354z2());
            if (viewGroupM19464o5 == null) {
                viewGroupM19464o5 = ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1354z2();
            }
            hd2Var.s(f6c0.o3, true).q(2500L).z(viewGroupM19464o5).A(new hd2.c() { // from class: l.jp30
                /* JADX INFO: renamed from: a */
                public final void m17179a(String str, View view, View view2) {
                    nt30.m19121Q2(j760Var, str, view, view2);
                }
            }).y(j760Var, new hd2.b() { // from class: l.kp30
                /* JADX INFO: renamed from: a */
                public final void m17570a(View view, Object obj) {
                    nt30.m19097L0(j760Var, view, (j760) obj);
                }
            });
            nd2.j().s(hd2Var);
        }
    }

    /* JADX INFO: renamed from: c8 */
    public final /* synthetic */ void m19410c8(Act act) {
        if (NullChecker.a(((jq2) this).viewModel)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1304o6(1500);
        }
    }

    /* JADX INFO: renamed from: c9 */
    public final boolean m19411c9() {
        return NullChecker.a(CoreModule.c.Q0.v3());
    }

    /* JADX INFO: renamed from: d5, reason: merged with bridge method [inline-methods] */
    public final void m19463n8(Boolean bool) {
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1310q2().q4(m19361T4().getString(R.string.J5), true);
        if (bool.booleanValue()) {
            CoreBusinessModule.z0();
        } else {
            this.f17709q.getSettingGroup().privacy.hideContacts = Boolean.FALSE;
            this.f17709q.getSettingGroup().privacy.hideMutualContacts = Boolean.TRUE;
        }
        if (IntlCountryCodeController.t()) {
            if (this.f17709q.getSettingGroup().search == null) {
                this.f17709q.getSettingGroup().search = new UserSearchSettings();
            }
            this.f17709q.getSettingGroup().search.radius = 99000;
        }
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(userP9)) {
            this.f17709q.getSettingGroup().gender = userP9.settings.getSettingGroup().gender;
        }
        CoreModule.c.m0.k8(this.f17709q.getSettingGroup()).subscribe(mkd0.H(new e30() { // from class: l.pn30
            public final void call(Object obj) {
                this.f18791a.m19287A6((roj0) obj);
            }
        }, new e30() { // from class: l.qn30
            public final void call(Object obj) {
                this.f19387a.m19291B6((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d6 */
    public final void m19413d6() {
        duringCreated(CoreModule.c.e0.o9()).switchMap(new w9j() { // from class: l.zm30
            public final Object call(Object obj) {
                return this.f23733a.m19384X7((User) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.an30
            public final void call(Object obj) {
                this.f9582a.m19389Y7((roj0) obj);
            }
        }));
        cxf.f().e(duringCreated(CoreModule.c.e0.o9()), m19361T4(), ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1310q2(), 19);
        duringCreated(CoreModule.c.e0.wa()).subscribe(mkd0.G(new e30() { // from class: l.bn30
            public final void call(Object obj) {
                CoreModule.c.e0.va(-1);
            }
        }));
        duringCreated(CoreModule.c.e0.o9().filter(new w9j() { // from class: l.cn30
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).hasPic());
            }
        }).map(new w9j() { // from class: l.dn30
            public final Object call(Object obj) {
                return ((Media) ((User) obj).fp()).url;
            }
        }).distinctUntilChanged()).subscribe(mkd0.H(new e30() { // from class: l.en30
            public final void call(Object obj) {
                this.f12617a.m19395Z7((String) obj);
            }
        }, new e30() { // from class: l.fn30
            public final void call(Object obj) {
                nt30.m19284z3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d7 */
    public final /* synthetic */ void m19414d7() {
        this.f17700j = true;
        ABManager.V(m19361T4());
        m19361T4().finish();
    }

    /* JADX INFO: renamed from: d8 */
    public final /* synthetic */ void m19415d8(User user, Relationship relationship) {
        UssTags ussTags;
        if (NullChecker.a(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2())) {
            C0158d c0158dM19417e5 = m19417e5(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1310q2().pageId(), relationship.id, ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2(), user);
            c0158dM19417e5.m2465v((user == null || (ussTags = user.ussTags) == null) ? "" : ussTags.eventInfo);
            m19348P8(c0158dM19417e5, "success");
        }
        this.f17695e = true;
    }

    /* JADX INFO: renamed from: d9 */
    public boolean m19416d9(User user) {
        if (n3b0.q()) {
            if (ogl0.F()) {
                return ic50.m16316j().m16322f().m17392M(OmsDialog.see_guide.getIdentifier(), false);
            }
            CoreSuggested coreSuggested = CoreModule.c.m0;
            if (!coreSuggested.C0 && ((Integer) coreSuggested.D0.get()).intValue() < 2 && qqi0.h(mqi0.m18550o(), (long) user.createdTime, 2)) {
                return true;
            }
        }
        return false;
    }

    public void destroy() {
        lqf lqfVarA = lqf.a();
        ExtraActLifecycle extraActLifecycle = ExtraActLifecycle.onResumeFromBackground;
        lqfVarA.d(extraActLifecycle, this.f17702k0);
        lqf.a().d(extraActLifecycle, this.f17708p0);
        mkd0.z(this.f17688X);
        if (this.f17689Y != null) {
            m19317H8();
        }
        cxf.f().d();
    }

    /* JADX INFO: renamed from: e5 */
    public final C0158d m19417e5(String str, String str2, wsf0 wsf0Var, User user) {
        String str3;
        int size;
        int iL6 = CoreModule.c.m0.l6() - 1;
        if (!NullChecker.a(user) || iL6 < 0 || user.pictures.size() <= iL6) {
            str3 = "";
            size = 0;
        } else {
            str3 = ((Media) user.pictures.get(iL6)).url;
            size = user.pictures.size();
        }
        C0158d c0158dM651h = HomeStatisticsHelper.m651h(str, str2, wsf0Var);
        c0158dM651h.m2439B(str3);
        c0158dM651h.m2469z(iL6);
        c0158dM651h.m2438A(size);
        return c0158dM651h;
    }

    /* JADX INFO: renamed from: e6 */
    public final void m19418e6() {
        if (gr9.i()) {
            CoreModule.c.n2.J3(CoreModule.H().userId());
        }
    }

    /* JADX INFO: renamed from: e7 */
    public final /* synthetic */ void m19419e7(Integer num) {
        m19361T4().dialog().D(R.string.Rj).B(false).t0(R.string.m, new Runnable() { // from class: l.do30
            @Override // java.lang.Runnable
            public final void run() {
                this.f11922a.m19414d7();
            }
        }).z0();
    }

    /* JADX INFO: renamed from: e8 */
    public final /* synthetic */ void m19420e8(User user, Throwable th) {
        if (NullChecker.a(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2())) {
            m19344O8(m19417e5(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1310q2().pageId(), "", ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2(), user), th);
        }
        this.f17695e = true;
        lsi0.H(m19361T4().getResources().getString(R.string.oq), m19361T4().getResources().getDrawable(x2c0.vu), m19361T4().getResources().getDrawable(x2c0.vr));
    }

    /* JADX INFO: renamed from: e9 */
    public void m19421e9() {
        User userNa = CoreModule.c.e0.na();
        if (NullChecker.a(userNa)) {
            if (NullChecker.a(this.f17661G0) && this.f17661G0.N()) {
                return;
            }
            m19371V4(userNa);
        }
    }

    /* JADX INFO: renamed from: f5 */
    public ArrayList<j760<String, d30>> m19422f5() {
        return DebugUtil.xj((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel, this);
    }

    /* JADX INFO: renamed from: f6 */
    public final boolean m19423f6(NewNewHomeFrag newNewHomeFrag, CoreSuggested.UserInfo userInfo) {
        if (!NullChecker.a(userInfo) || userInfo.id.equals("VirtualCard")) {
            return false;
        }
        User userM17130d = NullChecker.a(newNewHomeFrag.f456C.m1092A2().mo2814o()) ? newNewHomeFrag.f456C.m1092A2().mo2814o().m17130d() : null;
        if (NullChecker.a(userM17130d)) {
            return rxg0.j().A(userM17130d);
        }
        return false;
    }

    /* JADX INFO: renamed from: f7 */
    public final /* synthetic */ void m19424f7(Optional optional) {
        if (optional.isPresent() && ((Boolean) optional.get()).booleanValue()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1261g3(((Boolean) optional.get()).booleanValue());
        }
    }

    /* JADX INFO: renamed from: f9 */
    public final void m19425f9() {
        wvv.l(m19361T4(), new PermissionHelper.InterfaceC0531b() { // from class: l.go30
            @Override // com.p000p1.mobile.putong.p004ui.permission.PermissionHelper.InterfaceC0531b
            /* JADX INFO: renamed from: a */
            public final void mo10235a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                this.f13649a.m19478r8(z, permissionDeniedReason);
            }
        }, new DialogInterface.OnCancelListener() { // from class: l.ho30
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f14195a.m19482s8(dialogInterface);
            }
        }, new Runnable() { // from class: l.io30
            @Override // java.lang.Runnable
            public final void run() {
                this.f14722a.m19486t8();
            }
        }, new d30() { // from class: l.jo30
            public final void call() {
                ygh0.n0(ygh0.h);
            }
        });
    }

    /* JADX INFO: renamed from: g5 */
    public void m19426g5() {
        this.f17694d = true;
    }

    /* JADX INFO: renamed from: g6 */
    public boolean m19427g6(String str) {
        return TextUtils.equals(f17646V0, str);
    }

    /* JADX INFO: renamed from: g7 */
    public final /* synthetic */ void m19428g7(Boolean bool) {
        if (bool.booleanValue() && NullChecker.a(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).f682U) && NullChecker.a(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).f682U.mo15101o()) && xdl0.O0(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).f682U.mo15101o())) {
            lli.m17962a().m17963b(m19361T4(), ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).f682U.mo15101o());
        }
    }

    /* JADX INFO: renamed from: g8 */
    public final /* synthetic */ void m19429g8(String str, int i, c cVar) {
        if (NullChecker.a(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2())) {
            CoreSuggested.UserInfo userInfoMo2809j = ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2809j();
            if (NullChecker.a(userInfoMo2809j) && TextUtils.equals(str, userInfoMo2809j.id)) {
                if (i != SwipeDirection.UP.getValue()) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2797A(SwipeDirection.fromValue(i));
                } else if (((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2804c(false)) {
                    m19160Z8("p_profile,superlike");
                    m19439i9(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g9 */
    public final void m19430g9(Act act, User user) {
        if (CoreModule.c.a0.v3(user) || CoreModule.c.a0.u3(user)) {
            return;
        }
        if (TEnum.equals(user.source, "facebook") && ((Boolean) CoreModule.c.e0.X2.get()).booleanValue()) {
            new ccn(act).Z();
            CoreModule.c.e0.X2.put(Boolean.FALSE);
        } else if (TEnum.equals(user.source, "google") && ((Boolean) CoreModule.c.e0.Z2.get()).booleanValue()) {
            new ccn(act).Z();
            CoreModule.c.e0.Z2.put(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: h5, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m19486t8() {
        wvv.e();
        m19459m9();
        if (this.f17664I) {
            this.f17664I = false;
            this.f17701k.onNext(roj0.a);
        }
        e51.H(m19361T4(), new Runnable() { // from class: l.rp30
            @Override // java.lang.Runnable
            public final void run() {
                this.f19939a.m19295C6();
            }
        }, 400L);
    }

    /* JADX INFO: renamed from: h6 */
    public final boolean m19432h6(CoreSuggested.UserInfo userInfo) {
        return NullChecker.a(userInfo) && CoreModule.c.m0.L6(userInfo.id);
    }

    /* JADX INFO: renamed from: h7 */
    public final /* synthetic */ void m19433h7(GrowthSpamInfo growthSpamInfo) {
        if (growthSpamInfo.pop) {
            ke7.o().E(m19361T4(), false, ke7.r());
        }
    }

    /* JADX INFO: renamed from: h8 */
    public final /* synthetic */ void m19434h8(ArrayList arrayList, String str, roj0 roj0Var) {
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1310q2().s4();
        CoreModule.c.e0.va(((Integer) App.i.get()).intValue());
        ark.V0(m19361T4(), false, (Media) arrayList.get(0), m19361T4().string(R.string.el), new Runnable() { // from class: l.vp30
            @Override // java.lang.Runnable
            public final void run() {
                nt30.m19158Z2();
            }
        });
        if (TextUtils.equals(str, "fake_to_good_dlg")) {
            ygh0.G();
        } else if (TextUtils.equals(str, "fakeView")) {
            ygh0.v();
        }
    }

    /* JADX INFO: renamed from: h9 */
    public final void m19435h9(int i, List<String> list) {
        if (m19361T4().isDialogShowing() || CoreModule.c.m0.C0 || b0d0.d0()) {
            return;
        }
        CoreSuggested coreSuggested = CoreModule.c.m0;
        coreSuggested.C0 = true;
        tpd0 tpd0Var = coreSuggested.D0;
        tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
        if (ogl0.F()) {
            ic50.m16316j().m16322f().m17407b0(OmsDialog.see_guide.getIdentifier(), 0, false);
        }
        ok3.I(m19361T4(), i, list);
        CoreModule.c.m0.z0 = 0;
    }

    /* JADX INFO: renamed from: i5 */
    public void m19436i5() {
        if (NullChecker.a(this.f17661G0)) {
            User userNa = CoreModule.c.e0.na();
            if (NullChecker.a(userNa)) {
                return;
            }
            if (CoreModule.c.a0.w3(userNa) || CoreModule.c.a0.u3(userNa)) {
                this.f17661G0.C();
                this.f17661G0 = null;
            }
        }
    }

    /* JADX INFO: renamed from: i7 */
    public final /* synthetic */ void m19437i7(GrowthSpamInfo growthSpamInfo) {
        if (growthSpamInfo.pop) {
            ke7.o().E(m19361T4(), true, false);
        }
    }

    /* JADX INFO: renamed from: i8 */
    public final /* synthetic */ void m19438i8(Throwable th) {
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1310q2().s4();
        yij0.m25382D(th);
    }

    /* JADX INFO: renamed from: i9 */
    public boolean m19439i9(boolean z) {
        return m19444j9(z, false);
    }

    /* JADX INFO: renamed from: j5 */
    public void m19440j5() {
        SettingGroups settingGroups = new SettingGroups();
        UserSearchSettings userSearchSettings = new UserSearchSettings();
        settingGroups.search = userSearchSettings;
        userSearchSettings.autoAdjustRadius = Boolean.TRUE;
        CoreModule.c.m0.k8(settingGroups).subscribe(mkd0.H(new e30() { // from class: l.tp30
            public final void call(Object obj) {
                nt30.m19073F1((roj0) obj);
            }
        }, new e30() { // from class: l.up30
            public final void call(Object obj) {
                nt30.m19075F3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j6 */
    public boolean m19441j6(String str) {
        return (TextUtils.isEmpty(this.f17678P) || !this.f17678P.equals(str) || TextUtils.isEmpty(this.f17680Q)) ? false : true;
    }

    /* JADX INFO: renamed from: j7 */
    public final /* synthetic */ void m19442j7(GrowthSpamInfo growthSpamInfo) {
        if (growthSpamInfo.pop) {
            if (vy8.m()) {
                ke7.o().E(m19361T4(), false, ke7.r());
            } else {
                ke7.o().E(m19361T4(), true, false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x01fb  */
    /* JADX INFO: renamed from: j9 */
    public boolean m19444j9(boolean z, boolean z2) {
        User user;
        C0158d c0158dM647d;
        UssTags ussTags;
        boolean z3;
        int iL6;
        String str = "";
        if (z) {
            c0158dM647d = HomeStatisticsHelper.m647d(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2() == null ? null : ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2814o(), true, this.f17697g, SwipeDirection.UP, ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2());
            user = null;
        } else {
            User userR8 = CoreModule.c.m0.r8();
            C0158d c0158dM651h = HomeStatisticsHelper.m651h(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1310q2().pageId(), userR8 == null ? "" : ((DbObject) userR8).id, ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2());
            c0158dM651h.m2465v((userR8 == null || (ussTags = userR8.ussTags) == null) ? "" : ussTags.eventInfo);
            user = userR8;
            c0158dM647d = c0158dM651h;
        }
        int size = 0;
        if (CoreModule.c.e0.p9().isJailed()) {
            m19160Z8(null);
            CoreModule.K().startJailedDialogLikeAct();
            m19348P8(c0158dM647d, "failJailedUser");
            return false;
        }
        if (CoreModule.c.e0.f8()) {
            m19160Z8(null);
            qwp.i().n(m19361T4(), true);
            return false;
        }
        KeyEvent.Callback callbackMo2805d = ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2805d();
        if (!NullChecker.a(callbackMo2805d) || (((callbackMo2805d instanceof d5m) && ((d5m) callbackMo2805d).mo865k0()) || !this.f17695e)) {
            return false;
        }
        if (z) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2797A(SwipeDirection.UP);
            return false;
        }
        Counter counterO3 = CoreModule.c.o3();
        CounterLikeLimit counterLikeLimit = counterO3.likeLimit;
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterO3.undoLimit;
        if ((((long) (counterSuperlikeAndUndoLimit.reset * 1000)) + counterLikeLimit.serverTime) - qib0.H.guessedCurrentServerTime() > 0 && counterSuperlikeAndUndoLimit.remainToday() == 0) {
            com.p1.mobile.putong.core.ui.purchase.c.M1(m19361T4(), "p_home,undo", Privilege.vip_undo, (d30) null, (d30) null, false, CoreModule.c.m0.r8());
        } else if (m19449k9()) {
            CoreSuggested.UserInfo userInfoS8 = CoreModule.c.m0.s8();
            if (!q8p.i() || !q8p.Companion.l()) {
                if (this.f17695e && CoreModule.c.m0.s8().canUndo) {
                    if (!n3b0.q() || !NullChecker.a(CoreModule.c.m0.H2.e()) || ((q860) CoreModule.c.m0.H2.e()).f19068a.isEmpty() || !((String) ((q860) CoreModule.c.m0.H2.e()).f19068a.get(0)).equals(userInfoS8.id)) {
                        this.f17657E0.run();
                    } else if (((String) a0.j().d.get()).isEmpty()) {
                        a0.j().d.put(userInfoS8.id);
                        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
                        userInfo.id = userInfoS8.id;
                        userInfo.canUndo = true;
                        userInfo.preSwipedDirection = SwipeDirection.LEFT;
                        CoreModule.c.m0.w6(userInfo, 0);
                    } else {
                        xnj0.a(m19361T4());
                    }
                    z3 = true;
                }
                boolean z4 = z3;
                if (!z3) {
                    iL6 = CoreModule.c.m0.l6() - 1;
                    if (NullChecker.a(user) && iL6 >= 0 && user.pictures.size() > iL6) {
                        str = ((Media) user.pictures.get(iL6)).url;
                        size = user.pictures.size();
                    }
                    c0158dM647d.m2439B(str);
                    c0158dM647d.m2469z(iL6);
                    c0158dM647d.m2438A(size);
                    m19348P8(c0158dM647d, "failUndoLocal");
                }
                return z4;
            }
            lsi0.j(m19361T4().getString(R.string.gc));
        } else if (q8p.i() && q8p.Companion.l()) {
            lsi0.j(m19361T4().getString(R.string.gc));
        } else {
            xnj0.a(m19361T4());
        }
        z3 = false;
        boolean z5 = z3;
        if (!z3) {
            iL6 = CoreModule.c.m0.l6() - 1;
            if (NullChecker.a(user)) {
                str = ((Media) user.pictures.get(iL6)).url;
                size = user.pictures.size();
            }
            c0158dM647d.m2439B(str);
            c0158dM647d.m2469z(iL6);
            c0158dM647d.m2438A(size);
            m19348P8(c0158dM647d, "failUndoLocal");
        }
        return z5;
    }

    /* JADX INFO: renamed from: k5 */
    public final void m19445k5() {
        long jCurrentTimeMillis = this.f17681Q0 - System.currentTimeMillis();
        if (jCurrentTimeMillis < 0 && jCurrentTimeMillis > -7200000) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1224Y5(2);
            return;
        }
        if (jCurrentTimeMillis > 86400000 || jCurrentTimeMillis < -7200000) {
            this.f17681Q0 = adi0.INSTANCE.d();
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1224Y5(1);
    }

    /* JADX INFO: renamed from: k6 */
    public boolean m19446k6() {
        return this.f17663H0;
    }

    /* JADX INFO: renamed from: k7 */
    public final /* synthetic */ void m19447k7(roj0 roj0Var) {
        ke7.o().m(m19361T4());
    }

    /* JADX INFO: renamed from: k9 */
    public final boolean m19449k9() {
        return NullChecker.a(CoreModule.c.m0.r8());
    }

    /* JADX INFO: renamed from: l5 */
    public int m19450l5() {
        return this.f17692b;
    }

    /* JADX INFO: renamed from: l6 */
    public boolean m19451l6() {
        return this.f17669K0;
    }

    /* JADX INFO: renamed from: l7 */
    public final /* synthetic */ Boolean m19452l7(Boolean bool) {
        return Boolean.valueOf(bool.booleanValue() && NullChecker.b(m19361T4()) && !m19361T4().isDialogShowing());
    }

    /* JADX INFO: renamed from: l9 */
    public void m19454l9(e30<roj0> e30Var, e30<Throwable> e30Var2) {
        this.f17701k.onNext(roj0.a);
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1310q2().q4(m19361T4().getString(R.string.J5), true);
        CoreModule.c.m0.k8(this.f17709q.getSettingGroup()).subscribe(mkd0.H(e30Var, e30Var2));
    }

    /* JADX INFO: renamed from: m5 */
    public String m19455m5() {
        return this.f17691a;
    }

    /* JADX INFO: renamed from: m6 */
    public boolean m19456m6() {
        return this.f17655D;
    }

    /* JADX INFO: renamed from: m7 */
    public final /* synthetic */ void m19457m7(Boolean bool) {
        if (NullChecker.a(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2()) && NullChecker.a(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2805d()) && (((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2805d() instanceof d5m)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1178Q2();
            mah0 mah0VarS0 = mah0.s0();
            s7m s7mVar = ((jq2) this).viewModel;
            mah0VarS0.h0((ViewTreeObserverOnGlobalLayoutListenerC0030b) s7mVar, (d5m) ((ViewTreeObserverOnGlobalLayoutListenerC0030b) s7mVar).m1092A2().mo2805d());
            return;
        }
        if (NullChecker.a(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2()) && NullChecker.a(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2805d()) && (((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2805d() instanceof e5m)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1178Q2();
            mah0 mah0VarS1 = mah0.s0();
            s7m s7mVar2 = ((jq2) this).viewModel;
            mah0VarS1.i0((ViewTreeObserverOnGlobalLayoutListenerC0030b) s7mVar2, (e5m) ((ViewTreeObserverOnGlobalLayoutListenerC0030b) s7mVar2).m1092A2().mo2805d());
        }
    }

    /* JADX INFO: renamed from: m8 */
    public final /* synthetic */ void m19458m8() {
        this.f17713u++;
    }

    /* JADX INFO: renamed from: m9 */
    public void m19459m9() {
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1206V1(true);
    }

    /* JADX INFO: renamed from: n5 */
    public String m19460n5() {
        return this.f17665I0;
    }

    /* JADX INFO: renamed from: n6 */
    public boolean m19461n6() {
        return this.f17654C;
    }

    /* JADX INFO: renamed from: n7 */
    public final /* synthetic */ void m19462n7(roj0 roj0Var) {
        if (m19361T4().isDialogShowing()) {
            m19361T4().onDialogDismissExtra(new d30() { // from class: l.so30
                public final void call() {
                    CoreModule.c.m0.s6("initiative", "suggest", (String) null);
                }
            });
        } else {
            CoreModule.c.m0.s6("initiative", "suggest", (String) null);
        }
        CoreModule.c.m0.e2.E3();
    }

    /* JADX INFO: renamed from: o5 */
    public ViewGroup m19464o5(ViewGroup viewGroup) {
        ViewParent parent = viewGroup.getParent();
        if (parent == null) {
            return null;
        }
        if (viewGroup != m19361T4().getWindow().getDecorView()) {
            if (!(parent instanceof ViewGroup)) {
                return null;
            }
            ViewGroup viewGroup2 = (ViewGroup) parent;
            if (viewGroup2.getId() != u4c0.y4) {
                return m19464o5(viewGroup2);
            }
        }
        return viewGroup;
    }

    /* JADX INFO: renamed from: o6 */
    public boolean m19465o6() {
        return this.f17653B;
    }

    /* JADX INFO: renamed from: o7 */
    public final /* synthetic */ void m19466o7(ActionData actionData) {
        int i;
        du2.a("[See_Toast]", "switch back: " + actionData.toJson());
        if (qib0.H.guessedCurrentServerTime() - actionData.dataTime >= TimeUnit.SECONDS.toMillis(upa.x() ? upa.b1() : 9)) {
            qug0.m21316g().m21319d(null, false, SuggesterReason.WEAK_NETWORK.getReason(), actionData);
            return;
        }
        if ("immediately".equals(actionData.pageFormat.showRules)) {
            SuggestersAct.m7838b2(m19361T4(), actionData.pageFormat);
        } else if (!TextUtils.isEmpty(actionData.toastStyle.title)) {
            du2.a("[See_Toast]", "start show toast: " + actionData.traceId);
            qug0.m21316g().m21323k((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel, actionData);
        } else if (!TextUtils.isEmpty(actionData.toast.message)) {
            qug0.m21316g().m21324l((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel, actionData.toast);
        }
        if (vwb.J(actionData.insertFormat.insertPosition)) {
            return;
        }
        for (ActionInsertPosition actionInsertPosition : actionData.insertFormat.insertPosition) {
            int i2 = actionInsertPosition.position;
            if (!NullChecker.a(this.f17703l.e()) || vwb.J(((PartialListOpt) this.f17703l.e()).loaded)) {
                i = -1;
                break;
            }
            i = 0;
            while (true) {
                if (i >= ((PartialListOpt) this.f17703l.e()).loaded.size()) {
                    i = -1;
                    break;
                } else if (actionInsertPosition.userId.equals(((CoreSuggested.UserInfo) ((PartialListOpt) this.f17703l.e()).loaded.get(i)).id)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0 && i <= i2) {
                i2 = i;
            }
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.id = actionInsertPosition.userId;
            if (!NullChecker.a(actionInsertPosition.cityCData) || TextUtils.isEmpty(actionInsertPosition.cityCData.userId)) {
                userInfo.cityCData = null;
            } else {
                userInfo.cityCData = actionInsertPosition.cityCData;
            }
            if (!TextUtils.isEmpty(actionInsertPosition.cardExtraInfo.descriptionId)) {
                userInfo.descriptionId = actionInsertPosition.cardExtraInfo.descriptionId;
            }
            if (!TextUtils.isEmpty(actionInsertPosition.cardExtraInfo.descriptionContent)) {
                userInfo.descriptionContent = actionInsertPosition.cardExtraInfo.descriptionContent;
            }
            if (actionInsertPosition.cardStyle.label.contains("liked_me") && (!ura.e().b().wf() || (NullChecker.a(CoreModule.c.e0.oa(userInfo.id)) && CoreModule.c.e0.oa(userInfo.id).isFemale() && !CoreModule.c.e0.oa(userInfo.id).superLikedMe() && !CoreModule.c.e0.oa(userInfo.id).letter()))) {
                userInfo.hasLikeMeSlideCardTop = true;
            }
            if (actionInsertPosition.likedMe.label.contains("liked_me") && !ura.e().b().wf()) {
                userInfo.hasLikeMeSlideCardBottom = true;
            }
            CoreModule.c.m0.t6(userInfo, i2, true);
        }
    }

    /* JADX INFO: renamed from: o8 */
    public final /* synthetic */ void m19467o8() {
        this.f17701k.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: p6 */
    public boolean m19468p6() {
        return this.f17652A;
    }

    /* JADX INFO: renamed from: p7 */
    public final /* synthetic */ void m19469p7(roj0 roj0Var) {
        if (NullChecker.a(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2()) && NullChecker.a(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2805d())) {
            s7m s7mVar = ((jq2) this).viewModel;
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) s7mVar).m1147K6(((ViewTreeObserverOnGlobalLayoutListenerC0030b) s7mVar).m1092A2().mo2805d());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p8 */
    public final /* synthetic */ void m19470p8(NewMainBaseAct newMainBaseAct) {
        if (wvv.p(newMainBaseAct)) {
            m19325J8();
            return;
        }
        if (!wvv.m()) {
            wvv.e();
        }
        if (PermissionHelper.m10210b("android.permission.READ_CONTACTS")) {
            this.f17701k.onNext(roj0.a);
        } else {
            e51.F(newMainBaseAct, new Runnable() { // from class: l.eq30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12659a.m19467o8();
                }
            });
        }
    }

    /* JADX INFO: renamed from: q5 */
    public final void m19471q5(User user, boolean z) {
        if (TEnum.equals(user.source, "google") || TEnum.equals(user.source, "facebook")) {
            m19430g9(m19361T4(), user);
            return;
        }
        TTCMigrateGuideConfig tTCMigrateGuideConfigG3 = upa.g3();
        if (z && NullChecker.a(tTCMigrateGuideConfigG3) && CoreModule.c.a0.F3(tTCMigrateGuideConfigG3) && !CoreModule.c.a0.w3(user) && !CoreModule.c.a0.u3(user)) {
            int i = tTCMigrateGuideConfigG3.dlgType;
            xy2 xy2Var = new xy2(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).act());
            this.f17661G0 = xy2Var;
            xy2Var.l0(tTCMigrateGuideConfigG3);
            CoreModule.c.a0.S.put(Long.valueOf((((long) tTCMigrateGuideConfigG3.frequency) * 1000) + mqi0.m18550o()));
            CoreModule.c.a0.T.put(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: q6 */
    public boolean m19472q6() {
        return this.f17718z;
    }

    /* JADX INFO: renamed from: q7 */
    public final /* synthetic */ void m19473q7(j760 j760Var) {
        if (!CoreModule.c.j0.Q4() || CoreModule.c.j0.g0) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1186R5(false);
        } else {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1255f2();
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1186R5(true);
        }
    }

    /* JADX INFO: renamed from: q8 */
    public final /* synthetic */ void m19474q8(a aVar, Throwable th) {
        CoreModule.c.m0.i8();
        if ((aVar.e() == null || ((PartialListOpt) aVar.e()).loaded.size() == 0) && ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1144K3()) {
            this.f17669K0 = true;
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1152L5(true, false);
        }
    }

    /* JADX INFO: renamed from: r5 */
    public void m19475r5() {
        if (!xij0.d0() || m19361T4().lifecycle_() != c.i || ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1103C3() || ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1310q2().isHidden()) {
            return;
        }
        Object objMo2805d = ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2() == null ? null : ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2805d();
        if (NullChecker.a(objMo2805d) && (objMo2805d instanceof d5m)) {
            d5m d5mVar = (d5m) objMo2805d;
            if (d5mVar.mo914y()) {
                d5mVar.mo778I();
            }
        }
    }

    /* JADX INFO: renamed from: r6 */
    public final /* synthetic */ void m19476r6(Long l2) {
        m19445k5();
    }

    /* JADX INFO: renamed from: r7 */
    public final /* synthetic */ void m19477r7(Throwable th) {
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1186R5(false);
        String.format("start freeTrial anim error: %s", th.getMessage());
    }

    /* JADX INFO: renamed from: r8 */
    public final /* synthetic */ void m19478r8(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        if (permissionDeniedReason == PermissionHelper.PermissionDeniedReason.Null) {
            ygh0.l0(ygh0.h);
        } else {
            ygh0.m0(ygh0.h, wvv.n(m19361T4()) ? "off" : "on");
        }
        m19486t8();
    }

    /* JADX INFO: renamed from: s5 */
    public void m19479s5(String str) {
        if (m19361T4().lifecycle_() != c.i || ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1103C3() || ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1310q2().isHidden() || !((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1244c6()) {
            return;
        }
        if (((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1201U2(str + " by:handleShowButtons ")) {
            return;
        }
        if (com.p1.mobile.putong.core.ui.onlinematch.a.f) {
            com.p1.mobile.putong.core.ui.onlinematch.a.f = false;
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1254e6();
        }
        if (e2s.d()) {
            e2s.e(false);
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1254e6();
        }
    }

    /* JADX INFO: renamed from: s6 */
    public final /* synthetic */ void m19480s6(roj0 roj0Var) {
        this.f17663H0 = false;
        this.f17706o.onNext(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: s7 */
    public final /* synthetic */ void m19481s7(j760 j760Var) {
        if (((Boolean) j760Var.a).booleanValue()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1180Q5(true);
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1245d2();
        }
        if (((Boolean) j760Var.b).booleanValue()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1180Q5(true);
        }
    }

    /* JADX INFO: renamed from: s8 */
    public final /* synthetic */ void m19482s8(DialogInterface dialogInterface) {
        m19486t8();
    }

    /* JADX INFO: renamed from: t5, reason: merged with bridge method [inline-methods] */
    public void m19453l8() {
        tpd0 tpd0Var = this.f17711s;
        tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
        this.f17712t.put(Long.valueOf(mqi0.m18550o()));
    }

    /* JADX INFO: renamed from: t6 */
    public final /* synthetic */ void m19484t6(Throwable th) {
        this.f17663H0 = false;
        this.f17706o.onNext(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: t7 */
    public final /* synthetic */ Boolean m19485t7(CoreLikers.a aVar) {
        return Boolean.valueOf(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).act().m3888e6(TabName.Card) && aVar.b > 0 && !((Boolean) f17650Z0.get()).booleanValue() && this.f17656E && !nkp.c());
    }

    /* JADX INFO: renamed from: u5 */
    public final void m19487u5() {
        if (y19.R()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("https://fe-static.tancdn.com/v1/raw/5266f729-e0ff-4677-96f9-09373278f58214.svga");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/8eda1a11-5419-4a73-a3bd-6b54d258c50a14.svga");
            SVGALoader.with(App.e).batchDownload(arrayList);
        }
    }

    /* JADX INFO: renamed from: u6 */
    public final /* synthetic */ Boolean m19488u6(j760 j760Var) {
        return Boolean.valueOf(this.f17671L0 == 1);
    }

    /* JADX INFO: renamed from: u7 */
    public final /* synthetic */ void m19489u7(CoreLikers.a aVar) {
        if (vwb.J(aVar.d)) {
            return;
        }
        User user = (User) aVar.d.get(0);
        String string = m19361T4().getResources().getString(R.string.Pm);
        boolean zR = IntlCountryCodeController.r();
        s7m s7mVar = ((jq2) this).viewModel;
        if (zR) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) s7mVar).m1334u6(((Media) user.fp()).url, string, "old", aVar.c, aVar.b, aVar.g, user.location.updatedTime, null);
            f17650Z0.put(Boolean.TRUE);
        } else {
            f7e0 f7e0Var = new f7e0((ViewTreeObserverOnGlobalLayoutListenerC0030b) s7mVar, ((Media) user.fp()).url, string, aVar.c, aVar.b, aVar.g, user.location.updatedTime, "old");
            f7e0Var.s(new d30() { // from class: l.sp30
                public final void call() {
                    nt30.f17650Z0.put(Boolean.TRUE);
                }
            });
            f7e0Var.x(CorePopLevel.INTL_SEE_ANIM_BUBBLE);
            hdb0.c().i(f7e0Var);
        }
    }

    /* JADX INFO: renamed from: u8 */
    public final void m19490u8(long j) {
        if (j - mqi0.m18550o() <= 500) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1210V5(1);
            m19361T4().post(new Runnable() { // from class: l.fq30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13136a.m19317H8();
                }
            });
        }
    }

    /* JADX INFO: renamed from: v5 */
    public final void m19491v5() {
        if (upa.k3()) {
            duringCreated(v930.k().distinctUntilChanged().filter(new w9j() { // from class: l.lq30
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Card);
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.mq30
                public final void call(Object obj) {
                    CoreModule.c.m0.H5();
                }
            }));
            lqf.a().b(ExtraActLifecycle.onResumeFromBackground, new e30() { // from class: l.oq30
                public final void call(Object obj) {
                    CoreModule.c.m0.H5();
                }
            });
        }
    }

    /* JADX INFO: renamed from: v6 */
    public final /* synthetic */ void m19492v6(j760 j760Var) {
        StringBuilder sb = new StringBuilder("checkIntro error, local has user me is " + NullChecker.a(j760Var.b));
        sb.append(", ");
        if (!NullChecker.a(j760Var.a) || vwb.J(((q860) j760Var.a).f19068a)) {
            sb.append("local has no conversations");
        } else {
            for (int i = 0; i < ((q860) j760Var.a).f19068a.size() && i < 5; i++) {
                String str = ((DbObject) ((Conversation) ((q860) j760Var.a).f19068a.get(i))).id;
                sb.append("cid-");
                sb.append(str);
                sb.append(" : ");
                if (NullChecker.a(CoreModule.c.e0.Pa(str))) {
                    sb.append("1");
                } else {
                    sb.append("0");
                }
            }
        }
        CrashHelper.c(new Exception(sb.toString()));
        this.f17671L0 = 0;
    }

    /* JADX INFO: renamed from: v7 */
    public final /* synthetic */ void m19493v7(roj0 roj0Var) {
        if (m19361T4().isDialogShowing() || !mgj.a()) {
            return;
        }
        CoreModule.c.m0.H0.put(Long.valueOf(mqi0.m18550o()));
        CoreModule.c.m0.G0 = 0;
    }

    /* JADX INFO: renamed from: v8 */
    public void m19494v8() {
        duringCreated(CoreModule.c.y1.f3()).subscribe(mkd0.H(new e30() { // from class: l.bq30
            public final void call(Object obj) {
                this.f10236a.m19405b8((Long) obj);
            }
        }, new e30() { // from class: l.cq30
            public final void call(Object obj) {
                nt30.m19161a1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w5 */
    public final void m19495w5() {
        duringCreated(CoreModule.c.m0.I2).filter(new w9j() { // from class: l.yr30
            public final Object call(Object obj) {
                j760 j760Var = (j760) obj;
                return Boolean.valueOf(NullChecker.a(j760Var) && NullChecker.a(j760Var.a));
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.zr30
            public final void call(Object obj) {
                this.f23848a.m19299D6((j760) obj);
            }
        }));
        if (CoreModule.N().Co() || upa.I2() || g6a.s()) {
            duringCreated(CoreModule.c.r0.i0).subscribe(mkd0.G(new e30() { // from class: l.as30
                public final void call(Object obj) {
                    this.f9659a.m19307F6((String) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: w6 */
    public final /* synthetic */ void m19496w6() {
        if (this.f17699i) {
            this.f17699i = false;
            m19386Y4();
        }
    }

    /* JADX INFO: renamed from: w7 */
    public final /* synthetic */ void m19497w7(CoreLikers.a aVar) {
        CoreModule.c.m0.R0.onNext(Boolean.FALSE);
        if (NullChecker.a(aVar) && NullChecker.a(aVar.e) && !aVar.e.isEmpty()) {
            User user = (User) aVar.e.get(0);
            if (this.f17676O == null) {
                this.f17676O = new dej();
            }
            CoreModule.c.m0.P0.put(Long.valueOf(mqi0.m18550o()));
            tpd0 tpd0Var = CoreModule.c.m0.Q0;
            tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
            this.f17676O.m13187j(m19361T4(), user);
        }
    }

    /* JADX INFO: renamed from: w8 */
    public void m19498w8() {
        this.f17669K0 = false;
    }

    /* JADX INFO: renamed from: x5 */
    public final void m19499x5() {
        if (upa.e()) {
            duringCreated(mkd0.t(CoreModule.c.m0.W8(), CoreModule.c.C0.u3(SummarizedPrivilegesId.get("svip")), CoreModule.c.B0.j4(), CoreModule.c.m0.m0, new z9j() { // from class: l.il30
                /* JADX INFO: renamed from: b */
                public final Object m16619b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return nt30.m19109O0((PartialListOpt) obj, (UserPrivilege) obj2, (VerificationCenter) obj3, (Long) obj4);
                }
            })).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.jl30
                public final void call(Object obj) {
                    CoreModule.c.z2.j3();
                }
            }, new e30() { // from class: l.kl30
                public final void call(Object obj) {
                    nt30.m19111O3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: x6 */
    public final /* synthetic */ void m19500x6() {
        e51.H(m19361T4(), new Runnable() { // from class: l.aq30
            @Override // java.lang.Runnable
            public final void run() {
                this.f9617a.m19496w6();
            }
        }, 400L);
    }

    /* JADX INFO: renamed from: x7 */
    public final /* synthetic */ void m19501x7(Boolean bool) {
        if (bool.booleanValue()) {
            u0n.m22730p(m19361T4());
        } else {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2797A(SwipeDirection.RIGHT);
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1298n6();
        }
    }

    /* JADX INFO: renamed from: x8 */
    public void m19502x8(int i, final int i2, Intent intent) {
        if (i == 18 && NullChecker.a(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2())) {
            this.f17696f = true;
            SwipeDirection swipeDirection = SwipeDirection.RIGHT;
            if (i2 == swipeDirection.getValue() || i2 == SwipeDirection.LEFT.getValue() || i2 == SwipeDirection.UP.getValue()) {
                m19361T4().f3217p = true;
            }
            jj4 jj4VarMo2814o = ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2814o();
            if (NullChecker.a(jj4VarMo2814o) && NullChecker.a(jj4VarMo2814o.m17130d())) {
                final String str = ((DbObject) jj4VarMo2814o.m17130d()).id;
                if (i2 == swipeDirection.getValue() || i2 == SwipeDirection.LEFT.getValue() || i2 == SwipeDirection.UP.getValue()) {
                    this.f17697g = true;
                    lifecycle().takeFirst(new w9j() { // from class: l.ln30
                        public final Object call(Object obj) {
                            return Boolean.valueOf(((c) obj) == c.i);
                        }
                    }).subscribe(mkd0.G(new e30() { // from class: l.mn30
                        public final void call(Object obj) {
                            this.f16998a.m19429g8(str, i2, (c) obj);
                        }
                    }));
                    return;
                } else {
                    if (g6a.s() && i2 == 153) {
                        psd0.INSTANCE.m20626a(m19361T4(), jj4VarMo2814o.m17130d(), true);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (i == 19) {
            if (i2 == -1) {
                m19293B8((ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f8209h), intent.getStringExtra("from"));
                return;
            }
            return;
        }
        if (i != 3002 || i2 != -1) {
            if (i == 23 && intent != null && intent.getBooleanExtra("from_sign_up", false)) {
                m19381X4();
                m19463n8(Boolean.FALSE);
                if (wvv.p(m19361T4())) {
                    m19325J8();
                    return;
                } else {
                    this.f17701k.onNext(roj0.a);
                    return;
                }
            }
            return;
        }
        PartialListOpt partialListOpt = (PartialListOpt) CoreModule.c.m0.a0.e();
        if (!NullChecker.a(partialListOpt) || vwb.J(partialListOpt.loaded)) {
            return;
        }
        CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) partialListOpt.loaded.get(0);
        if (NullChecker.a(userInfo)) {
            Object obj = userInfo.extensionObject;
            if (obj instanceof OMSAdCardInfo) {
                if (TextUtils.equals(((OMSAdCardInfo) obj).contentType, "tagCardGuide")) {
                    CoreModule.c.m0.d2.add("tagCardGuide");
                }
                ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2797A(SwipeDirection.RIGHT);
            }
        }
    }

    /* JADX INFO: renamed from: y5 */
    public final void m19503y5() {
        duringCreated(v930.k().distinctUntilChanged()).filter(new w9j() { // from class: l.ys30
            public final Object call(Object obj) {
                return Boolean.valueOf(((TabName) obj) != TabName.Card);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.kt30
            public final void call(Object obj) {
                sbp.m22045b();
            }
        }));
        duringCreated(CoreModule.c.m0.B0).switchMap(new w9j() { // from class: l.tk30
            public final Object call(Object obj) {
                return CoreModule.c.u0.L6();
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.al30
            public final void call(Object obj) {
                this.f9563a.m19388Y6((j760) obj);
            }
        }, new e30() { // from class: l.bl30
            public final void call(Object obj) {
                CoreModule.c.m0.z0 = 0;
            }
        }));
        duringCreated(CoreModule.c.O2.obs()).observeOn(jo0.a()).filter(new w9j() { // from class: l.cl30
            public final Object call(Object obj) {
                return Boolean.valueOf(!((String) obj).equals(""));
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.dl30
            public final void call(Object obj) {
                this.f11895a.m19315H6((String) obj);
            }
        }));
        duringCreated(mkd0.r(lifecycle(), this.f17706o, new el30()).filter(new w9j() { // from class: l.gl30
            public final Object call(Object obj) {
                j760 j760Var = (j760) obj;
                return Boolean.valueOf(j760Var.a == c.i && ((Boolean) j760Var.b).booleanValue());
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.hl30
            public final void call(Object obj) {
                this.f14166a.m19319I6((j760) obj);
            }
        }));
        duringCreated(CoreModule.c.m0.W8()).subscribe(mkd0.G(new e30() { // from class: l.zs30
            public final void call(Object obj) {
                nt30.m19261u1((PartialListOpt) obj);
            }
        }));
        duringCreated(CoreModule.c.m0.d0).filter(new w9j() { // from class: l.at30
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((HashMap) obj));
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.ct30
            public final void call(Object obj) {
                nt30.m19104N0((HashMap) obj);
            }
        }));
        duringCreated(this.f17701k.doOnNext(new e30() { // from class: l.dt30
            public final void call(Object obj) {
                nt30.m19199i1((roj0) obj);
            }
        }).switchMap(new w9j() { // from class: l.et30
            public final Object call(Object obj) {
                return this.f12682a.m19323J6((roj0) obj);
            }
        }).filter(new w9j() { // from class: l.ft30
            public final Object call(Object obj) {
                return Boolean.valueOf(((j760) obj).b == TabName.Card);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.gt30
            public final void call(Object obj) {
                this.f13729a.m19331L6((j760) obj);
            }
        }));
        duringCreated(CoreModule.c.m0.c0).subscribe(mkd0.G(new e30() { // from class: l.ht30
            public final void call(Object obj) {
                this.f14245a.m19335M6((roj0) obj);
            }
        }));
        duringCreated(CoreModule.c.e0.Y1).subscribe(mkd0.G(new e30() { // from class: l.it30
            public final void call(Object obj) {
                this.f14793a.m19339N6((roj0) obj);
            }
        }));
        duringCreated(mkd0.r(lifecycle(), this.f17704m, new x9j() { // from class: l.jt30
            public final Object call(Object obj, Object obj2) {
                return nt30.m19252s2((c) obj, (roj0) obj2);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.lt30
            public final void call(Object obj) {
                this.f16403a.m19342O6((roj0) obj);
            }
        }));
        duringCreated(rx.c.concat(CoreModule.c.x0.W3() ? rx.c.just(Boolean.TRUE) : rx.c.empty(), CoreModule.c.x0.q4())).subscribe(mkd0.H(new e30() { // from class: l.kk30
            public final void call(Object obj) {
                this.f15741a.m19350Q6((Boolean) obj);
            }
        }, new e30() { // from class: l.lk30
            public final void call(Object obj) {
                nt30.m19081H2((Throwable) obj);
            }
        }));
        duringCreated(mkd0.s(CoreModule.c.e0.o9().map(new w9j() { // from class: l.mk30
            public final Object call(Object obj) {
                return nt30.m19186f4((User) obj);
            }
        }), CoreModule.c.k0.R.k(), lac0.m() ? CoreModule.c.c2.o3().distinctUntilChanged() : rx.c.just(roj0.a), new y9j() { // from class: l.nk30
            /* JADX INFO: renamed from: a */
            public final Object m18990a(Object obj, Object obj2, Object obj3) {
                return new xaj0((DoublePair) obj, (RoamedLocationData) obj2, obj3);
            }
        }).distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.ok30
            public final void call(Object obj) {
                this.f18127a.m19354R6((xaj0) obj);
            }
        }));
        duringCreated(CoreModule.c.m0.K0).subscribe(mkd0.G(new e30() { // from class: l.pk30
            public final void call(Object obj) {
                this.f18762a.m19358S6((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.c.m0.J0).subscribe(mkd0.G(new e30() { // from class: l.qk30
            public final void call(Object obj) {
                this.f19364a.m19363T6((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.c.m0.l2).subscribe(mkd0.H(new e30() { // from class: l.rk30
            public final void call(Object obj) {
                this.f19881a.m19368U6((String) obj);
            }
        }, new e30() { // from class: l.sk30
            public final void call(Object obj) {
                nt30.m19110O1((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.c.m0.m2).subscribe(mkd0.H(new e30() { // from class: l.vk30
            public final void call(Object obj) {
                this.f21630a.m19373V6((roj0) obj);
            }
        }, new e30() { // from class: l.wk30
            public final void call(Object obj) {
                nt30.m19276x4((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.c.m0.n2).subscribe(mkd0.H(new e30() { // from class: l.xk30
            public final void call(Object obj) {
                this.f22634a.m19378W6((roj0) obj);
            }
        }, new e30() { // from class: l.yk30
            public final void call(Object obj) {
                nt30.m19094K2((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.c.m0.h2.asObservable()).subscribe(mkd0.G(new e30() { // from class: l.zk30
            public final void call(Object obj) {
                this.f23715a.m19383X6((SwipeDirection) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y6 */
    public final /* synthetic */ void m19504y6() {
        this.f17701k.onNext(roj0.a);
        if (uq40.y(m19361T4(), true)) {
            return;
        }
        this.f17660G.onNext(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: y7 */
    public final /* synthetic */ void m19505y7(SwipeDirection swipeDirection) {
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1298n6();
        SwipeDirection swipeDirection2 = SwipeDirection.RIGHT;
        if (swipeDirection == swipeDirection2) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2797A(swipeDirection2);
            return;
        }
        SwipeDirection swipeDirection3 = SwipeDirection.LEFT;
        if (swipeDirection == swipeDirection3) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2797A(swipeDirection3);
            return;
        }
        SwipeDirection swipeDirection4 = SwipeDirection.UP;
        if (swipeDirection == swipeDirection4) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2797A(swipeDirection4);
        }
    }

    /* JADX INFO: renamed from: y8 */
    public VSwipeStack.OnCardSwipeResult m19506y8(mol molVar, SwipeDirection swipeDirection, boolean z) {
        if (this.f17667J0 == null) {
            this.f17667J0 = new C0062j();
        }
        if (!this.f17693c) {
            CrashHelper.c(new IllegalStateException("onCardSwipe be called before card rendered"));
        } else if (molVar.mo844e0() && NullChecker.a(molVar.getCardDataProxy()) && NullChecker.a(molVar.getCardDataProxy().m17130d())) {
            CoreBusinessModule.g.m17548b().f16792b = ((DbObject) molVar.getCardDataProxy().m17130d()).id;
        } else {
            CoreBusinessModule.g.m17548b().f16792b = "";
        }
        SwipeDirection swipeDirection2 = SwipeDirection.RIGHT;
        boolean z2 = true;
        boolean z3 = swipeDirection == swipeDirection2 || swipeDirection == SwipeDirection.UP;
        SwipeDirection swipeDirection3 = SwipeDirection.UP;
        boolean z4 = swipeDirection == swipeDirection3;
        if (!z) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1225Z1(z3, z4).mo2336i();
        }
        if (!upa.N3()) {
            if (z3) {
                s7m s7mVar = ((jq2) this).viewModel;
                if (z4) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC0030b) s7mVar).m1316r2().reset();
                } else {
                    ((ViewTreeObserverOnGlobalLayoutListenerC0030b) s7mVar).m1102C2().reset();
                }
                ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1300o2().reset();
            } else {
                ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1316r2().reset();
                ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1102C2().reset();
            }
        }
        if (z3) {
            yd7 yd7Var = CoreModule.c.l2;
            yd7Var.T = 0;
            yd7Var.U++;
        } else {
            yd7 yd7Var2 = CoreModule.c.l2;
            yd7Var2.T++;
            yd7Var2.U = 0;
        }
        molVar.mo861j0(swipeDirection);
        HomeStatisticsHelper.m640E("card");
        HomeStatisticsHelper.m641F("swipe");
        f3a f3aVar = CoreModule.c.Y0;
        if (swipeDirection != swipeDirection2 && swipeDirection != swipeDirection3) {
            z2 = false;
        }
        f3aVar.e(z2);
        VSwipeStack.OnCardSwipeResult onCardSwipeResultMo1468a = this.f17667J0.mo1468a(new C0062j.a(this, (ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel, molVar.getCardDataProxy(), swipeDirection, z));
        onCardSwipeResultMo1468a.name();
        VSwipeStack.OnCardSwipeResult onCardSwipeResult = VSwipeStack.OnCardSwipeResult.pass;
        if (onCardSwipeResultMo1468a == onCardSwipeResult) {
            CoreModule.c.Y0.f();
        }
        if (g6a.w() && onCardSwipeResultMo1468a != VSwipeStack.OnCardSwipeResult.stay) {
            rxg0.j().w((String) null);
        }
        VSwipeStack.OnCardSwipeResult onCardSwipeResult2 = VSwipeStack.OnCardSwipeResult.back;
        if (onCardSwipeResultMo1468a == onCardSwipeResult2) {
            yd7 yd7Var3 = CoreModule.c.l2;
            yd7Var3.T = 0;
            yd7Var3.U = 0;
        }
        if (onCardSwipeResultMo1468a == onCardSwipeResult2 || onCardSwipeResultMo1468a == onCardSwipeResult) {
            m19407c5();
        }
        m19160Z8(null);
        this.f17697g = false;
        this.f17690Z = null;
        this.f17698h = false;
        if (!upa.N3() && IntlCountryCodeController.v()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1220X5(onCardSwipeResultMo1468a, swipeDirection);
            if (onCardSwipeResultMo1468a != onCardSwipeResult) {
                return VSwipeStack.OnCardSwipeResult.stay;
            }
        }
        if (upa.y1()) {
            zub.m25973m();
        }
        if (onCardSwipeResultMo1468a == onCardSwipeResult) {
            NavigationBarAdmobHelper.INSTANCE.m61y();
        }
        CoreModule.c.l2.S = mqi0.m18550o();
        CoreModule.c.t2.p3();
        return onCardSwipeResultMo1468a;
    }

    /* JADX INFO: renamed from: z5 */
    public final void m19507z5() {
        creates(new e30() { // from class: l.ll30
            public final void call(Object obj) {
                this.f16246a.m19394Z6((Bundle) obj);
            }
        }, new d30() { // from class: l.ml30
            public final void call() {
                nt30.m19157Z1();
            }
        });
    }

    /* JADX INFO: renamed from: z6 */
    public final /* synthetic */ void m19508z6() {
        this.f17701k.onNext(roj0.a);
        if (uq40.y(m19361T4(), true)) {
            return;
        }
        this.f17660G.onNext(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: z7 */
    public final /* synthetic */ void m19509z7(SwipeDirection swipeDirection) {
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1298n6();
        SwipeDirection swipeDirection2 = SwipeDirection.RIGHT;
        if (swipeDirection == swipeDirection2) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2797A(swipeDirection2);
            return;
        }
        SwipeDirection swipeDirection3 = SwipeDirection.LEFT;
        if (swipeDirection == swipeDirection3) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2797A(swipeDirection3);
            return;
        }
        SwipeDirection swipeDirection4 = SwipeDirection.UP;
        if (swipeDirection == swipeDirection4) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2797A(swipeDirection4);
        }
    }

    /* JADX INFO: renamed from: z8 */
    public void m19510z8(boolean z) {
        this.f17683S = z;
        this.f17684T.onNext(Boolean.valueOf(z));
        if (!z) {
            if (this.f17699i) {
                this.f17699i = false;
                m19386Y4();
            }
            if (this.f17694d) {
                this.f17694d = false;
                if (NullChecker.a(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2()) && NullChecker.a(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2809j())) {
                    HomeStatisticsHelper.m652i(((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2809j(), ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1310q2().pageId());
                    jj4 jj4VarMo2814o = ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1092A2().mo2814o();
                    String strPageId = ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1310q2().pageId();
                    String str = this.f17691a;
                    HomeStatisticsHelper.m661r(jj4VarMo2814o, strPageId, str, m19427g6(str));
                }
            }
        }
        if (!lac0.m() && CoreModule.c.J0.F3() && ((lifecycle_() == c.i || lifecycle_() == c.h) && !z)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1180Q5(true);
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1338v5(z);
        if (!this.f17683S) {
            if (do80.f && this.f17658F) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0030b) ((jq2) this).viewModel).m1152L5(true, true);
                CoreModule.c.m0.p8(true);
            }
            do80.f = false;
        }
        if (vy8.f()) {
            String str2 = (String) CoreModule.c.e0.G2.get();
            if (this.f17683S || TextUtils.isEmpty(str2) || !mqi0.m18534C(mqi0.m18550o(), ((Long) CoreModule.c.e0.H2.get()).longValue())) {
                return;
            }
            CoreModule.c.e0.G2.put("");
            zvf0.x("e_boost_checkin_toast", "p_suggest_users_home_view");
            ke7.o().A(m19361T4(), str2 + "x");
        }
    }

    /* JADX INFO: renamed from: C5 */
    public void m19294C5() {
    }
}
