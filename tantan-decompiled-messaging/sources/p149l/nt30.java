package p149l;

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
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.base.Optional;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.ExtraActLifecycle;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.android.p048ui.poplevel.C4371a;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4729a0;
import com.p046p1.mobile.putong.core.api.C4730b;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.api.C4737e0;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.ActionData;
import com.p046p1.mobile.putong.core.data.ActionInsertPosition;
import com.p046p1.mobile.putong.core.data.BoostStatus;
import com.p046p1.mobile.putong.core.data.CardButtonsShowAndHideType;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.FreeTrialEnvelope;
import com.p046p1.mobile.putong.core.data.GrowthSpamInfo;
import com.p046p1.mobile.putong.core.data.IntlMarketConfigEnvelope;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MigrateAwardDialogData;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.RoamedLocationData;
import com.p046p1.mobile.putong.core.data.SeeExposedUser;
import com.p046p1.mobile.putong.core.data.SuggesterReason;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.TTCMigrateGuideConfig;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.admob.NavigationBarAdmobHelper;
import com.p046p1.mobile.putong.core.newui.home.C7994d;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p046p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p046p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC7866b;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C7867a;
import com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7898j;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p046p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.main.NewMainBaseAct;
import com.p046p1.mobile.putong.core.newui.suggest.SuggestersAct;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.core.p053ui.main.HomeMultiTabSwitcher;
import com.p046p1.mobile.putong.core.p053ui.match.C8455a;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.util.DebugUtil;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CounterLikeLimit;
import com.p046p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSAdCardInfo;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserSearchSettings;
import com.p046p1.mobile.putong.data.UssTags;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p046p1.mobile.putong.util.launch.LaunchStep;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
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
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class nt30 extends jq2<ViewTreeObserverOnGlobalLayoutListenerC7866b> {

    /* JADX INFO: renamed from: R0 */
    public static String f140332R0 = "suggest_user_profile_info";

    /* JADX INFO: renamed from: S0 */
    public static String f140333S0 = "home";

    /* JADX INFO: renamed from: T0 */
    public static String f140334T0 = "click";

    /* JADX INFO: renamed from: U0 */
    public static String f140335U0 = "swipe";

    /* JADX INFO: renamed from: V0 */
    public static String f140336V0 = "";

    /* JADX INFO: renamed from: W0 */
    public static hpd0 f140337W0;

    /* JADX INFO: renamed from: X0 */
    public static boolean f140338X0;

    /* JADX INFO: renamed from: Y0 */
    public static String f140339Y0;

    /* JADX INFO: renamed from: Z0 */
    public static hpd0 f140340Z0;

    /* JADX INFO: renamed from: a1 */
    public static String f140341a1;

    /* JADX INFO: renamed from: A */
    public boolean f140342A;

    /* JADX INFO: renamed from: B */
    public boolean f140343B;

    /* JADX INFO: renamed from: C */
    public boolean f140344C;

    /* JADX INFO: renamed from: D */
    public boolean f140345D;

    /* JADX INFO: renamed from: E */
    public boolean f140346E;

    /* JADX INFO: renamed from: E0 */
    public Runnable f140347E0;

    /* JADX INFO: renamed from: F */
    public boolean f140348F;

    /* JADX INFO: renamed from: F0 */
    public boolean f140349F0;

    /* JADX INFO: renamed from: G */
    public C22392a<Boolean> f140350G;

    /* JADX INFO: renamed from: G0 */
    public xy2 f140351G0;

    /* JADX INFO: renamed from: H */
    public boolean f140352H;

    /* JADX INFO: renamed from: H0 */
    public boolean f140353H0;

    /* JADX INFO: renamed from: I */
    public boolean f140354I;

    /* JADX INFO: renamed from: I0 */
    public String f140355I0;

    /* JADX INFO: renamed from: J */
    public boolean f140356J;

    /* JADX INFO: renamed from: J0 */
    public p3m<C7898j.a, VSwipeStack.OnCardSwipeResult> f140357J0;

    /* JADX INFO: renamed from: K */
    public long f140358K;

    /* JADX INFO: renamed from: K0 */
    public boolean f140359K0;

    /* JADX INFO: renamed from: L */
    public boolean f140360L;

    /* JADX INFO: renamed from: L0 */
    public int f140361L0;

    /* JADX INFO: renamed from: M */
    public p3m<z5l.C21640a, Boolean> f140362M;

    /* JADX INFO: renamed from: M0 */
    public c4g0 f140363M0;

    /* JADX INFO: renamed from: N */
    public z5l.C21640a f140364N;

    /* JADX INFO: renamed from: N0 */
    public uj60 f140365N0;

    /* JADX INFO: renamed from: O */
    public dej f140366O;

    /* JADX INFO: renamed from: O0 */
    public boolean f140367O0;

    /* JADX INFO: renamed from: P */
    public String f140368P;

    /* JADX INFO: renamed from: P0 */
    public boolean f140369P0;

    /* JADX INFO: renamed from: Q */
    public String f140370Q;

    /* JADX INFO: renamed from: Q0 */
    public long f140371Q0;

    /* JADX INFO: renamed from: R */
    public boolean f140372R;

    /* JADX INFO: renamed from: S */
    public boolean f140373S;

    /* JADX INFO: renamed from: T */
    public C22392a<Boolean> f140374T;

    /* JADX INFO: renamed from: U */
    public long f140375U;

    /* JADX INFO: renamed from: V */
    public Merchandise f140376V;

    /* JADX INFO: renamed from: W */
    public Merchandise f140377W;

    /* JADX INFO: renamed from: X */
    public c4g0 f140378X;

    /* JADX INFO: renamed from: Y */
    public c4g0 f140379Y;

    /* JADX INFO: renamed from: Z */
    public HashMap f140380Z;

    /* JADX INFO: renamed from: a */
    public String f140381a;

    /* JADX INFO: renamed from: b */
    public int f140382b;

    /* JADX INFO: renamed from: c */
    public boolean f140383c;

    /* JADX INFO: renamed from: d */
    public boolean f140384d;

    /* JADX INFO: renamed from: e */
    public boolean f140385e;

    /* JADX INFO: renamed from: f */
    public boolean f140386f;

    /* JADX INFO: renamed from: g */
    public boolean f140387g;

    /* JADX INFO: renamed from: h */
    public boolean f140388h;

    /* JADX INFO: renamed from: i */
    public boolean f140389i;

    /* JADX INFO: renamed from: j */
    public boolean f140390j;

    /* JADX INFO: renamed from: k */
    public C22392a<roj0> f140391k;

    /* JADX INFO: renamed from: k0 */
    public final e30<Act> f140392k0;

    /* JADX INFO: renamed from: l */
    public C22392a<PartialListOpt<CoreSuggested.UserInfo>> f140393l;

    /* JADX INFO: renamed from: m */
    public C22392a<roj0> f140394m;

    /* JADX INFO: renamed from: n */
    public C22392a<roj0> f140395n;

    /* JADX INFO: renamed from: o */
    public C22392a<Boolean> f140396o;

    /* JADX INFO: renamed from: p */
    public C22392a<Boolean> f140397p;

    /* JADX INFO: renamed from: p0 */
    public final e30<Act> f140398p0;

    /* JADX INFO: renamed from: q */
    public Settings f140399q;

    /* JADX INFO: renamed from: r */
    public C22393b<roj0> f140400r;

    /* JADX INFO: renamed from: s */
    public tpd0 f140401s;

    /* JADX INFO: renamed from: t */
    public zpd0 f140402t;

    /* JADX INFO: renamed from: u */
    public int f140403u;

    /* JADX INFO: renamed from: v */
    public C22393b<roj0> f140404v;

    /* JADX INFO: renamed from: w */
    public C22393b<Boolean> f140405w;

    /* JADX INFO: renamed from: x */
    public hpd0 f140406x;

    /* JADX INFO: renamed from: y */
    public hpd0 f140407y;

    /* JADX INFO: renamed from: z */
    public boolean f140408z;

    /* JADX INFO: renamed from: l.nt30$a */
    public class ViewOnTouchListenerC18766a implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public boolean f140409a = false;

        /* JADX INFO: renamed from: b */
        public float f140410b = 0.0f;

        /* JADX INFO: renamed from: c */
        public float f140411c = 0.0f;

        public ViewOnTouchListenerC18766a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (C4730b.m31407a(((ViewTreeObserverOnGlobalLayoutListenerC7866b) nt30.this.viewModel).m37125A2().mo38813j())) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f140409a = false;
                this.f140410b = motionEvent.getX();
                this.f140411c = motionEvent.getY();
                return false;
            }
            if (action == 1) {
                return this.f140409a;
            }
            if (action != 2) {
                return false;
            }
            float x = motionEvent.getX() - this.f140410b;
            float y = motionEvent.getY() - this.f140411c;
            if (x > 15.0f || y > 15.0f) {
                this.f140409a = true;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: l.nt30$b */
    public class RunnableC18767b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String[] f140413a;

        public RunnableC18767b(String[] strArr) {
            this.f140413a = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (nt30.this.f140367O0) {
                return;
            }
            Window window = nt30.this.m161157T4().getWindow();
            if (window == null || window.getDecorView() == null || window.getDecorView().getWindowToken() == null) {
                e51.m114743H(nt30.this.m161157T4(), this, 100L);
            } else {
                nt30.this.f140365N0.m194008f(nt30.this.m161157T4());
                ((ViewTreeObserverOnGlobalLayoutListenerC7866b) nt30.this.viewModel).m37341q2().requestPermissions(this.f140413a, 256);
            }
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f140337W0 = new hpd0("superLikeTipHasShown", bool);
        f140338X0 = true;
        f140340Z0 = new hpd0("see_entry_has_shown_" + CoreModule.m29931H().userId(), bool);
    }

    public nt30(mcr mcrVar) {
        super(mcrVar);
        this.f140381a = "";
        this.f140382b = 0;
        this.f140383c = false;
        this.f140384d = false;
        this.f140385e = true;
        this.f140387g = false;
        this.f140388h = false;
        this.f140390j = false;
        this.f140391k = C22392a.m221512b();
        this.f140393l = CoreModule.f17545c.f19663m0.f19394a0;
        this.f140394m = C22392a.m221512b();
        this.f140395n = C22392a.m221512b();
        Boolean bool = Boolean.FALSE;
        this.f140396o = C22392a.m221513c(bool);
        this.f140397p = C22392a.m221513c(bool);
        this.f140399q = new Settings();
        this.f140400r = C22393b.m221521b();
        this.f140401s = new tpd0("see_anim_show_times_after_launch" + CoreModule.m29931H().userId(), 0);
        this.f140402t = new zpd0("last_See_Anim_shown_time" + CoreModule.m29931H().userId(), 0L);
        this.f140403u = 0;
        this.f140404v = C22393b.m221521b();
        this.f140405w = C22393b.m221521b();
        this.f140406x = new hpd0("tantan_coin_boost_bubble_shown_" + CoreModule.m29931H().userId(), bool);
        this.f140407y = new hpd0("tantan_coin_super_like_bubble_shown_" + CoreModule.m29931H().userId(), bool);
        this.f140408z = false;
        this.f140342A = false;
        this.f140343B = false;
        this.f140344C = false;
        this.f140345D = false;
        this.f140346E = false;
        this.f140348F = false;
        this.f140350G = C22392a.m221513c(bool);
        this.f140352H = false;
        this.f140354I = true;
        this.f140356J = true;
        this.f140358K = 0L;
        this.f140360L = false;
        this.f140372R = true;
        this.f140374T = C22392a.m221513c(bool);
        this.f140375U = 0L;
        this.f140376V = null;
        this.f140377W = null;
        this.f140392k0 = new e30() { // from class: l.qr30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155963a.m161204c8((Act) obj);
            }
        };
        this.f140398p0 = new e30() { // from class: l.rr30
            @Override // p149l.e30
            public final void call(Object obj) {
                nt30.m161046s0((Act) obj);
            }
        };
        this.f140347E0 = new Runnable() { // from class: l.sr30
            @Override // java.lang.Runnable
            public final void run() {
                this.f166044a.m160983f8();
            }
        };
        this.f140353H0 = false;
        this.f140355I0 = "";
        this.f140359K0 = false;
        this.f140361L0 = 0;
        this.f140363M0 = null;
        this.f140371Q0 = adi0.INSTANCE.m95899d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D2 */
    public static /* synthetic */ PushMessage m160860D2(j760 j760Var) {
        return (PushMessage) j760Var.f116564a;
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ void m160863E0(Act act) {
        if (CoreModule.m29931H().signedIn_()) {
            CoreModule.f17545c.f19554B2.m141781u3();
            CoreModule.f17545c.f19554B2.m141782y3();
        }
    }

    /* JADX INFO: renamed from: F1 */
    public static /* synthetic */ void m160869F1(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: F3 */
    public static /* synthetic */ void m160871F3(Throwable th) {
    }

    /* JADX INFO: renamed from: H2 */
    public static /* synthetic */ void m160877H2(Throwable th) {
    }

    /* JADX INFO: renamed from: H3 */
    public static /* synthetic */ Boolean m160878H3(TabName tabName, TabName tabName2) {
        return RemoteConfig.m79298x().m79330s("filter_home_tab_unchange") ? Boolean.valueOf(TextUtils.equals(tabName.toString(), tabName2.toString())) : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: J4 */
    public static /* synthetic */ void m160889J4(TabName tabName) {
        if (NullChecker.m81303a(CoreModule.f17545c.f19663m0.f19370S) && NullChecker.m81303a(CoreModule.f17545c.f19663m0.f19370S.m221515e())) {
            CoreSuggested coreSuggested = CoreModule.f17545c.f19663m0;
            coreSuggested.m31143s6("push", null, coreSuggested.f19370S.m221515e().f116564a);
        }
    }

    /* JADX INFO: renamed from: K2 */
    public static /* synthetic */ void m160890K2(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m160893L0(j760 j760Var, View view, j760 j760Var2) {
        VText vText = (VText) view.findViewById(u4c0.f174355m0);
        qib0.f154691G.m102341Q0((VDraweeView) view.findViewById(u4c0.f174061U5), ((User) j760Var2.f116564a).m60124fp().profileSmall());
        vText.setText(CoreModule.f17544b.getString(R$string.f17856Jj, ((Integer) j760Var.f116565b).intValue() > 99 ? "99+" : j760Var.f116565b));
    }

    /* JADX INFO: renamed from: M2 */
    public static /* synthetic */ Boolean m160897M2(CoreLikers.C4719a c4719a) {
        CoreLikers.LikersTriggerBy likersTriggerBy = CoreLikers.LikersTriggerBy.home_total_liker_float;
        CoreLikers.LikersTriggerBy likersTriggerBy2 = c4719a.f19269a;
        return Boolean.valueOf(likersTriggerBy == likersTriggerBy2 || CoreLikers.LikersTriggerBy.home_new_liker_float == likersTriggerBy2);
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m160900N0(HashMap map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((NewTags) ((Map.Entry) it.next()).getValue());
        }
        sa40.m182802o().m182816N(arrayList);
    }

    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ PartialListOpt m160905O0(PartialListOpt partialListOpt, UserPrivilege userPrivilege, VerificationCenter verificationCenter, Long l2) {
        return partialListOpt;
    }

    /* JADX INFO: renamed from: O1 */
    public static /* synthetic */ void m160906O1(Throwable th) {
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m160907O3(Throwable th) {
    }

    /* JADX INFO: renamed from: O5 */
    private void m160909O5() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.nn30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139697a.m161100E7((C4319c) obj);
            }
        }));
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.on30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144740a.m161104F7((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P2 */
    public static /* synthetic */ void m160912P2(TabName tabName) {
        if (tabName != TabName.Card) {
            C4348d.m20896l().m20900k(HomeMultiTabSwitcher.f30343r);
            C4348d.m20896l().m20900k(HomeMultiTabSwitcher.f30344s);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m160915Q0(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q2 */
    public static /* synthetic */ void m160917Q2(j760 j760Var, String str, View view, View view2) {
        String str2;
        CoreModule.f17545c.f19687u0.f19261r0.put(Long.valueOf(mqi0.m155944o()));
        if (((Integer) j760Var.f116565b).intValue() > 99) {
            str2 = "99+";
        } else {
            str2 = j760Var.f116565b + "";
        }
        zvf0.m220368A("e_liked_female_number", "p_suggest_users_home_view", vwb.m200311Y("liked_number", str2));
    }

    /* JADX INFO: renamed from: S2 */
    public static /* synthetic */ void m160927S2(Throwable th) {
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ void m160936U3(TabName tabName) {
        if (tabName == TabName.Msg) {
            CoreModule.f17545c.f19554B2.m141781u3();
            CoreModule.f17545c.f19554B2.m141782y3();
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m160944W3() {
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m160952Y3(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: Z1 */
    public static /* synthetic */ void m160953Z1() {
    }

    /* JADX INFO: renamed from: Z2 */
    public static /* synthetic */ void m160954Z2() {
    }

    /* JADX INFO: renamed from: Z8 */
    public static void m160956Z8(String str) {
        f140341a1 = str;
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ void m160957a1(Throwable th) {
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m160959a3(Throwable th) {
    }

    /* JADX INFO: renamed from: d4 */
    public static /* synthetic */ void m160972d4(TabName tabName) {
        if (tabName != TabName.Card) {
            C4348d.m20896l().m20900k("bubble_superlike_coin_guide");
            C4348d.m20896l().m20900k("bubble_superlike_bubble");
            rxg0.m181577u();
            C4348d.m20896l().m20900k("bubble_undo_remaining");
            C4348d.m20896l().m20900k("bubble_setting_remaining");
            C4348d.m20896l().m20900k("bubble_setting_remaining");
            C4348d.m20896l().m20900k("bubble_undo_remaining");
            x4i.m206977d();
            xdx.m208433A().m208472x(true);
        }
        if (CoreModule.m29934N().mo60365ko()) {
            CoreModule.m29934N().mo60272Ea();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ Boolean m160973e0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ void m160974e1(Bundle bundle) {
        CoreModule.f17545c.f19639e0.m169555w9(qib0.f154697L.f17149g.get());
        qib0.f154697L.f17149g.clear();
    }

    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ void m160979f1(Throwable th) {
    }

    /* JADX INFO: renamed from: f2 */
    public static /* synthetic */ void m160980f2(Throwable th) {
    }

    /* JADX INFO: renamed from: f4 */
    public static /* synthetic */ DoublePair m160982f4(User user) {
        if (user.settings != null) {
            return user.getLatitudeAndLongitude();
        }
        CrashHelper.m81296c(new NullPointerException("user.me.settings==null, userid=" + CoreModule.m29931H().userId() + " ,abheader=" + ABManager.m29349i()));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f8 */
    public /* synthetic */ void m160983f8() {
        this.f140385e = false;
        HashMap map = new HashMap();
        map.put("sourcepage", f140333S0);
        map.put("actiontype", f140334T0);
        final User userM31142r8 = CoreModule.f17545c.f19663m0.m31142r8();
        if (NullChecker.m81303a(CoreModule.f17545c.f19663m0.m31145s8())) {
            CoreModule.f17545c.f19663m0.m31145s8().m223816clone();
        }
        C22306c<Relationship> c22306cM31102f9 = CoreModule.f17545c.f19663m0.m31102f9(map);
        if (NullChecker.m81303a(c22306cM31102f9)) {
            c22306cM31102f9.subscribe(mkd0.m154956H(new e30() { // from class: l.vo30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f182332a.m161209d8(userM31142r8, (Relationship) obj);
                }
            }, new e30() { // from class: l.wo30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f187377a.m161214e8(userM31142r8, (Throwable) obj);
                }
            }));
            return;
        }
        if (NullChecker.m81303a(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2())) {
            m161144P8(m161211e5(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37341q2().pageId(), "", ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2(), userM31142r8), "");
        }
        this.f140385e = true;
        lsi0.m151570H(m161157T4().getResources().getString(R$string.f18804oq), m161157T4().getResources().getDrawable(x2c0.f190665vu), m161157T4().getResources().getDrawable(x2c0.f190662vr));
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m160989h0(Bundle bundle) {
        CoreModule.f17545c.f19639e0.m169555w9(qib0.f154697L.f17148f.get());
        qib0.f154697L.f17148f.clear();
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ void m160990h1(Bundle bundle) {
    }

    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ void m160995i1(roj0 roj0Var) {
        if (CoreModule.f17545c.f19663m0.f19470z1.get().booleanValue()) {
            return;
        }
        CoreModule.f17545c.f19663m0.f19470z1.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: i6 */
    private boolean m160999i6(CoreSuggested.UserInfo userInfo) {
        return NullChecker.m81303a(userInfo) && CoreModule.f17545c.f19663m0.m31024M6(userInfo.f19472id);
    }

    /* JADX INFO: renamed from: j4 */
    public static /* synthetic */ Unit m161004j4(IntlMarketConfigEnvelope intlMarketConfigEnvelope) {
        return null;
    }

    /* JADX INFO: renamed from: k1 */
    public static /* synthetic */ void m161006k1(Throwable th) {
    }

    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ void m161011l1(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ C22306c m161015m0(j760 j760Var) {
        try {
            if (PushMessageCustom.JSON_ADAPTER.parse((String) j760Var.f116564a).newToast) {
                return C22306c.just(v930.m197534h());
            }
        } catch (IOException e) {
            CrashHelper.m81296c(e);
        }
        return v930.m197537k().filter(new w9j() { // from class: l.xo30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((TabName) obj) == TabName.Card);
            }
        }).take(1);
    }

    /* JADX INFO: renamed from: m1 */
    public static /* synthetic */ void m161016m1(Throwable th) {
    }

    /* JADX INFO: renamed from: m3 */
    public static /* synthetic */ Boolean m161018m3(Boolean bool, roj0 roj0Var) {
        return bool;
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m161020n0(Throwable th) {
    }

    /* JADX INFO: renamed from: o2 */
    public static /* synthetic */ Boolean m161027o2(j760 j760Var) {
        C4319c c4319c = C4319c.f15548i;
        S s = j760Var.f116565b;
        return Boolean.valueOf(c4319c == s || C4319c.f15547h == s);
    }

    /* JADX INFO: renamed from: o3 */
    public static /* synthetic */ void m161028o3(Throwable th) {
    }

    /* JADX INFO: renamed from: p5 */
    public static String m161035p5() {
        return f140341a1;
    }

    /* JADX INFO: renamed from: q1 */
    public static /* synthetic */ Boolean m161037q1(roj0 roj0Var, Boolean bool, roj0 roj0Var2) {
        return bool;
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m161046s0(Act act) {
        if (v930.m197534h() == TabName.Card) {
            CoreModule.f17545c.f19663m0.m31143s6("initiative", "back", null);
        }
    }

    /* JADX INFO: renamed from: s1 */
    public static /* synthetic */ C22306c m161047s1(Boolean bool) {
        CoreModule.f17545c.f19639e0.f149333b0.put(bool);
        return CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
    }

    /* JADX INFO: renamed from: s2 */
    public static /* synthetic */ roj0 m161048s2(C4319c c4319c, roj0 roj0Var) {
        if (c4319c == C4319c.f15548i) {
            return roj0.f160388a;
        }
        return null;
    }

    /* JADX INFO: renamed from: s4 */
    public static /* synthetic */ void m161050s4() {
        CoreModule.f17545c.f19620X1.m115682w3();
        if (TEnum.equals(qib0.f154719h0, LiveRegionTag.indonesia)) {
            CoreModule.f17545c.f19654j0.m30583F5();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ Boolean m161056u0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: u1 */
    public static /* synthetic */ void m161057u1(PartialListOpt partialListOpt) {
        CoreSuggested.UserInfo userInfoM31140r6;
        C4737e0.m31949a().m31953d();
        jb0.m140731i(partialListOpt);
        if (upa.m194675N3() && ExpandedCardStyleHelper.m38090o().m38103s() && (userInfoM31140r6 = CoreModule.f17545c.f19663m0.m31140r6()) != null && userInfoM31140r6.virtualCardType == VirtualCardType.FakeCard) {
            ExpandedCardStyleHelper.m38090o().m38107w("fake swipe");
        }
    }

    /* JADX INFO: renamed from: u4 */
    public static /* synthetic */ C22306c m161060u4(List list) {
        User user = new User();
        ArrayList arrayList = new ArrayList(CoreModule.f17545c.f19639e0.m169527p9().pictures);
        arrayList.remove(0);
        arrayList.add(0, (Media) list.get(0));
        user.pictures = arrayList;
        return CoreModule.f17545c.f19639e0.m169547u9(user);
    }

    /* JADX INFO: renamed from: x4 */
    public static /* synthetic */ void m161072x4(Throwable th) {
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m161077z0(Bundle bundle) {
        CoreLikers coreLikers = CoreModule.f17545c.f19687u0;
        coreLikers.m30429a7(coreLikers.f19254k0.get().longValue(), CoreLikers.LikersTriggerBy.new_like_dialog);
    }

    /* JADX INFO: renamed from: z2 */
    public static /* synthetic */ void m161079z2(String str) {
        str.getClass();
        switch (str) {
            case "expired":
            case "recovered":
                CoreModule.f17545c.f19642f0.m32650Fo();
                CoreModule.f17545c.f19642f0.m33102qq(-1.0d);
                break;
            case "waiting":
                CoreModule.f17545c.f19642f0.m32650Fo();
                break;
            case "trialEnd":
                CoreModule.f17545c.f19554B2.m141780q3();
                CoreModule.f17545c.f19642f0.m32650Fo();
                break;
            case "trialing":
                SeeExposedUser seeExposedUserM199973y3 = CoreModule.f17545c.f19608T1.getLocalConvUserData();
                if (seeExposedUserM199973y3 != null) {
                    az50.INSTANCE.m99622b(seeExposedUserM199973y3.userId);
                }
                az50.INSTANCE.m99623c();
                CoreModule.f17545c.f19642f0.m32650Fo();
                break;
        }
    }

    /* JADX INFO: renamed from: z3 */
    public static /* synthetic */ void m161080z3(Throwable th) {
    }

    /* JADX INFO: renamed from: A5 */
    public final void m161082A5() {
        if (upa.m194675N3()) {
            duringCreated(ExpandedCardStyleHelper.m38090o().m38109y().distinctUntilChanged(new x9j() { // from class: l.br30
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return Boolean.valueOf(((ExpandedCardStyleHelper.C7951b) obj).f22418a == ((ExpandedCardStyleHelper.C7951b) obj2).f22418a);
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.cr30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f82148a.m161198b7((ExpandedCardStyleHelper.C7951b) obj);
                }
            }));
            duringCreated(C22306c.merge(va40.f180704d.filter(new w9j() { // from class: l.dr30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(va40.m197623e() != NewTanFragTag.HOME);
                }
            }), v930.m197537k()).filter(new w9j() { // from class: l.er30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Serializable) obj) != TabName.Card);
                }
            }).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.fr30
                @Override // p149l.e30
                public final void call(Object obj) {
                    ExpandedCardStyleHelper.m38090o().m38107w("tab change");
                }
            }));
            duringCreated(ExpandedCardStyleHelper.m38090o().m38094h()).subscribe(mkd0.m154955G(new e30() { // from class: l.gr30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f104012a.m161193a7((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: A6 */
    public final /* synthetic */ void m161083A6(roj0 roj0Var) {
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37341q2().m20599s4();
    }

    /* JADX INFO: renamed from: A7 */
    public final /* synthetic */ void m161084A7() {
        if (y8p.m213413d().m213422k()) {
            y8p.m213413d().m213425o(m161157T4());
        }
    }

    /* JADX INFO: renamed from: A8 */
    public void m161085A8(PushMessage pushMessage) {
        CoreModule.m29932K().mo30769hj(this.viewModel, pushMessage);
    }

    /* JADX INFO: renamed from: B5 */
    public void m161086B5() {
        if (upa.m194698T1() && CoreModule.f17545c.f19639e0.m169527p9().isFemale() && mqi0.m155944o() - CoreModule.f17545c.f19687u0.f19261r0.get().longValue() >= 86400000) {
            long jLongValue = CoreModule.f17545c.f19687u0.f19261r0.get().longValue();
            if (jLongValue <= 0) {
                jLongValue = (long) CoreModule.f17545c.f19639e0.m169527p9().createdTime;
            }
            m161157T4().duringCreated(CoreModule.f17545c.f19687u0.m30458m7(jLongValue)).subscribe(mkd0.m154956H(new e30() { // from class: l.vq30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f182591a.m161203c7((j760) obj);
                }
            }, new e30() { // from class: l.wq30
                @Override // p149l.e30
                public final void call(Object obj) {
                    nt30.m161016m1((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: B6 */
    public final /* synthetic */ void m161087B6(Throwable th) {
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37341q2().m20599s4();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: B7 */
    public final /* synthetic */ void m161088B7(Bundle bundle) {
        y8p.m213413d().m213420g(this, new d30() { // from class: l.dp30
            @Override // p149l.d30
            public final void call() {
                this.f87234a.m161084A7();
            }
        });
    }

    /* JADX INFO: renamed from: B8 */
    public final void m161089B8(final ArrayList<Media> arrayList, final String str) {
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37341q2().m20595o4(R$string.f17842J5);
        ya5.m213793I(arrayList, "profile").compose(mkd0.m154951C()).flatMap(new w9j() { // from class: l.yo30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return nt30.m161060u4((List) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.zo30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204085a.m161228h8(arrayList, str, (roj0) obj);
            }
        }, new e30() { // from class: l.ap30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70976a.m161232i8((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C6 */
    public final /* synthetic */ void m161091C6() {
        if (NullChecker.m81303a(m161157T4())) {
            m161182Y4();
        }
    }

    /* JADX INFO: renamed from: C7 */
    public final /* synthetic */ void m161092C7(Bundle bundle) {
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37172J5();
    }

    /* JADX INFO: renamed from: C8 */
    public void m161093C8() {
        if (SystemClock.uptimeMillis() - this.f140358K >= 2000) {
            this.f140358K = SystemClock.uptimeMillis();
            m161129L8(true);
        }
    }

    /* JADX INFO: renamed from: D5 */
    public final void m161094D5() {
        CoreModule.f17545c.f19639e0.m169474ba();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D6 */
    public final /* synthetic */ void m161095D6(j760 j760Var) {
        if (NullChecker.m81303a(this.viewModel) && NullChecker.m81303a(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2())) {
            HashMap map = (HashMap) j760Var.f116565b;
            this.f140380Z = map;
            if (NullChecker.m81303a(map) && this.f140380Z.containsKey("commercial_card_superlike")) {
                m160956Z8("p_home,superlike");
            }
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38801A((SwipeDirection) j760Var.f116564a);
        }
    }

    /* JADX INFO: renamed from: D7 */
    public final /* synthetic */ void m161096D7() {
        this.f140349F0 = false;
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38801A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: D8 */
    public void m161097D8(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        uj60 uj60Var = this.f140365N0;
        boolean z = true;
        if (uj60Var != null) {
            uj60Var.m194006d();
            this.f140367O0 = true;
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
            ygh0.m214691l0(ygh0.f198173h);
        } else {
            ygh0.m214693m0(ygh0.f198173h, wvv.m205774n(m161157T4()) ? BLiveOperationTitleShowType.off : "on");
        }
        if (i == 256) {
            if (!u59.m191821c0()) {
                this.f140369P0 = false;
            }
            if (!z) {
                m161219f9();
                return;
            }
            if (z) {
                if (!pvv.m171693c() || wvv.m205775o()) {
                    m161280t8();
                    return;
                } else {
                    CoreDlg.m45041Y1(m161157T4(), false, new d30() { // from class: l.gs30
                        @Override // p149l.d30
                        public final void call() {
                            this.f104138a.m161237j8();
                        }
                    });
                    return;
                }
            }
            m161253m9();
            if (this.f140354I) {
                this.f140354I = false;
                if (!this.f140352H) {
                    this.f140391k.m132487l(roj0.f160388a);
                }
            }
            if (z && pvv.m171693c() && !wvv.m205775o()) {
                CoreDlg.m45038X1(m161157T4(), false);
            }
        }
    }

    /* JADX INFO: renamed from: E5 */
    public final void m161098E5() {
        duringCreated(ABManager.m29329W().filter(new w9j() { // from class: l.wr30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() == 2);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.xr30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194084a.m161213e7((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E6 */
    public final /* synthetic */ void m161099E6() {
        this.f140349F0 = false;
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38801A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: E7 */
    public final /* synthetic */ void m161100E7(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            if (this.f140349F0) {
                e51.m114743H(m161157T4(), new Runnable() { // from class: l.cp30
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f81898a.m161096D7();
                    }
                }, 500L);
            }
            if (this.f140386f) {
                this.f140386f = false;
            } else {
                boolean zM31058U8 = CoreModule.f17545c.f19663m0.m31058U8();
                if (zM31058U8 && CoreModule.f17545c.f19663m0.f19385X <= 0) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37184L5(true, true);
                }
                CoreModule.f17545c.f19663m0.m31136p8(zM31058U8);
            }
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37238V1(false);
            if (CoreModule.f17545c.f19654j0.f19294g0) {
                m161157T4().m39803a6();
            }
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37374w5();
        }
        if (CoreModule.m29934N().mo60365ko() && c4319c == C4319c.f15549j) {
            CoreModule.m29934N().mo60272Ea();
        }
    }

    /* JADX INFO: renamed from: E8 */
    public void m161101E8(boolean z) {
        if (!z) {
            CoreModule.f17545c.f19663m0.m31127m8();
        } else {
            qib0.f154687E.m78868t();
            duringCreated(qib0.f154687E.m78864p().take(10L, TimeUnit.SECONDS)).observeOn(jo0.m142408a()).materialize().first().subscribe(mkd0.m154955G(new e30() { // from class: l.co30
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19663m0.m31127m8();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: F5 */
    public final void m161102F5() {
        duringCreated(CoreModule.f17545c.f19605S1.m200717H3()).subscribe(mkd0.m154955G(new e30() { // from class: l.tr30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171786a.m161218f7((Optional) obj);
            }
        }));
        duringCreated(lli.m150483a().f128710b).subscribe(mkd0.m154955G(new e30() { // from class: l.vr30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182699a.m161222g7((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F6 */
    public final /* synthetic */ void m161103F6(String str) {
        if (NullChecker.m81303a(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2()) && NullChecker.m81303a(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38813j()) && TextUtils.equals(str, ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38813j().f19472id)) {
            this.f140349F0 = true;
            CoreModule.f17545c.f19663m0.m31031O5();
            if (g6a.m124570s() && m161157T4().m39820j7() == TabName.Card && lifecycle_() == C4319c.f15548i) {
                e51.m114743H(m161157T4(), new Runnable() { // from class: l.lo30
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f129068a.m161099E6();
                    }
                }, 500L);
            }
        }
    }

    /* JADX INFO: renamed from: F7 */
    public final /* synthetic */ void m161104F7(C4319c c4319c) {
        if (((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37341q2().isHidden()) {
            return;
        }
        if (c4319c != C4319c.f15548i) {
            if (c4319c == C4319c.f15549j) {
                HomeStatisticsHelper.m36690D(false);
                return;
            }
            return;
        }
        CoreModule.f17545c.f19663m0.f19444q2[1] = 1;
        if (this.f140372R) {
            this.f140372R = false;
        }
        HomeStatisticsHelper.m36690D(true);
        m161122K5(m161157T4());
        gj40 gj40Var = gj40.INSTANCE;
        if (gj40Var.m126451m()) {
            gj40Var.m126452n(m161157T4());
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004c  */
    /* JADX INFO: renamed from: F8, reason: merged with bridge method [inline-methods] */
    public final boolean m161242k8(final CoreLikers.C4719a c4719a) {
        String str;
        double d;
        String string;
        String string2;
        if (C4348d.m20896l().m20912x("love_buzz_tab_tip_bubble_key") || C4348d.m20896l().m20912x("key_intl_tribe_pop")) {
            m161157T4().m39811d7(new Runnable() { // from class: l.lp30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f129158a.m161242k8(c4719a);
                }
            });
            return true;
        }
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (vwb.m200296J(c4719a.f19272d)) {
            str = null;
            d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        } else {
            User user = c4719a.f19272d.get(0);
            if (NullChecker.m81303a(user)) {
                str = user.m60124fp().url;
                d = user.location.updatedTime;
            } else {
                str = null;
                d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
        }
        String str2 = str;
        double d2 = d;
        if (!f140338X0) {
            int i = c4719a.f19271c;
            boolean zM110322a = d8e0.m110322a(userM169527p9);
            int i2 = this.f140403u;
            if (!zM110322a ? i2 < 1 : i2 < 2) {
                if (i > 0 && (n3b0.m157742q() || CoreModule.f17545c.f19687u0.f19254k0.get().longValue() > 0)) {
                    String strM133840G = i0g0.m133840G(i);
                    if (!d8e0.m110322a(userM169527p9)) {
                        string = m161157T4().getString(CoreModule.m29935P().m94651a().mo33374N8() ? R$string.f18309Ym : R$string.f18401bn, strM133840G);
                    } else if (!"1".equals(strM133840G)) {
                        String str3 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + strM133840G + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
                        if (CoreModule.m29935P().m94651a().mo33374N8()) {
                            string = m161157T4().getString(R$string.f18339Zm, str3);
                        } else {
                            string = CoreModule.m29935P().m94651a().mo33491eg() ? m161157T4().getString(R$string.f18432cn, str3) : m161157T4().getString(R$string.f18493en, str3);
                        }
                    } else if (CoreModule.m29935P().m94651a().mo33374N8()) {
                        string = m161157T4().getString(R$string.f18370an);
                    } else {
                        string = CoreModule.m29935P().m94651a().mo33491eg() ? m161157T4().getString(R$string.f18463dn) : m161157T4().getString(R$string.f18524fn);
                    }
                    f7e0 f7e0Var = new f7e0((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel, str2, string, i, c4719a.f19270b, c4719a.f19275g, d2, ShareConstants.NEW_VERSION);
                    f7e0Var.m120965s(new d30() { // from class: l.op30
                        @Override // p149l.d30
                        public final void call() {
                            this.f144949a.m161252m8();
                        }
                    });
                    f7e0Var.m96808x(CorePopLevel.INTL_SEE_ANIM_BUBBLE);
                    hdb0.m130575c().m130582i(f7e0Var);
                }
            }
            return false;
        }
        f140338X0 = false;
        if (!mqi0.m155929D(this.f140402t.get().longValue())) {
            this.f140401s.put(0);
        }
        String strM133840G2 = (d8e0.m110322a(userM169527p9) || !n3b0.m157742q()) ? i0g0.m133840G(c4719a.f19270b) : i0g0.m133886z(c4719a.f19270b);
        if (!d8e0.m110322a(userM169527p9)) {
            string2 = m161157T4().getString(CoreModule.m29935P().m94651a().mo33374N8() ? R$string.f18069Qm : R$string.f18159Tm, strM133840G2);
        } else if (!"1".equals(strM133840G2)) {
            String str4 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + strM133840G2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
            if (CoreModule.m29935P().m94651a().mo33374N8()) {
                string2 = m161157T4().getString(R$string.f18099Rm, str4);
            } else {
                string2 = CoreModule.m29935P().m94651a().mo33491eg() ? m161157T4().getString(R$string.f18189Um, str4) : m161157T4().getString(R$string.f18249Wm, str4);
            }
        } else if (CoreModule.m29935P().m94651a().mo33374N8()) {
            string2 = m161157T4().getString(R$string.f18129Sm);
        } else {
            string2 = CoreModule.m29935P().m94651a().mo33491eg() ? m161157T4().getString(R$string.f18219Vm) : m161157T4().getString(R$string.f18279Xm);
        }
        String str5 = string2;
        if (d8e0.m110322a(CoreModule.f17545c.f19639e0.m169527p9())) {
            if (this.f140401s.get().intValue() >= 4) {
                return false;
            }
        } else if (mqi0.m155929D(this.f140402t.get().longValue())) {
            return false;
        }
        f7e0 f7e0Var2 = new f7e0((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel, str2, str5, c4719a.f19271c, c4719a.f19270b, c4719a.f19275g, d2, ShareConstants.OLD_VERSION);
        f7e0Var2.m120965s(new d30() { // from class: l.np30
            @Override // p149l.d30
            public final void call() {
                this.f139909a.m161247l8();
            }
        });
        f7e0Var2.m96808x(CorePopLevel.INTL_SEE_ANIM_BUBBLE);
        hdb0.m130575c().m130582i(f7e0Var2);
        return true;
    }

    /* JADX INFO: renamed from: G5 */
    public final void m161106G5() {
        if (vy8.m200615m()) {
            duringCreated((C22306c) lifecycle().filter(new w9j() { // from class: l.vl30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i && ke7.m145735t());
                }
            }).flatMap(new w9j() { // from class: l.am30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.f17545c.f19605S1.m200716G3();
                }
            })).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.cm30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f81509a.m161227h7((GrowthSpamInfo) obj);
                }
            }));
            duringCreated(ConnectivityReceiver.m81290m()).skip(1).filter(new w9j() { // from class: l.dm30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(ConnectivityReceiver.m81284g());
                }
            }).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.em30
                @Override // p149l.e30
                public final void call(Object obj) {
                    ke7.m145732o().m145750z();
                }
            }));
        }
        if (vy8.m200616n()) {
            duringCreated((C22306c) lifecycle().filter(new w9j() { // from class: l.fm30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i && ke7.m145735t() && !CoreModule.f17545c.f19639e0.f149192I3.get().booleanValue());
                }
            }).flatMap(new w9j() { // from class: l.gm30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.f17545c.f19605S1.m200716G3();
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.hm30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f108393a.m161231i7((GrowthSpamInfo) obj);
                }
            }));
        }
        if (vy8.m200615m() || vy8.m200616n()) {
            duringCreated((C22306c) ke7.m145732o().m145744p().filter(new w9j() { // from class: l.im30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(ke7.m145735t());
                }
            }).flatMap(new w9j() { // from class: l.jm30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.f17545c.f19605S1.m200716G3();
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.wl30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f186870a.m161236j7((GrowthSpamInfo) obj);
                }
            }, new e30() { // from class: l.xl30
                @Override // p149l.e30
                public final void call(Object obj) {
                    nt30.m161011l1((Throwable) obj);
                }
            }));
            duringCreated(ke7.m145732o().m145745q()).subscribe(mkd0.m154956H(new e30() { // from class: l.yl30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f198860a.m161241k7((roj0) obj);
                }
            }, new e30() { // from class: l.zl30
                @Override // p149l.e30
                public final void call(Object obj) {
                    nt30.m161006k1((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G6 */
    public final /* synthetic */ void m161107G6() {
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37341q2().startActivityForResult(MediaPickerAct.m47785g2(m161157T4(), 1, false, false, true, "fake_to_good_dlg", MediaPickerAct.f30623D, false, true, CoreModule.f17545c.f19639e0.m169527p9().gender), 19);
    }

    /* JADX INFO: renamed from: G7 */
    public final /* synthetic */ void m161108G7(MigrateAwardDialogData migrateAwardDialogData) {
        m161182Y4();
    }

    /* JADX INFO: renamed from: G8 */
    public void m161109G8() {
        this.f140356J = false;
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37167I5();
    }

    /* JADX INFO: renamed from: H5 */
    public final void m161110H5() {
        if (mah0.m153720m0()) {
            duringCreated(mkd0.m154985s(this.f140395n, this.f140350G, ogl0.m164248a0() ? zzc0.m221012c0() : C22306c.just(roj0.f160388a), new y9j() { // from class: l.gn30
                @Override // p149l.y9j
                /* JADX INFO: renamed from: a */
                public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                    return nt30.m161037q1((roj0) obj, (Boolean) obj2, (roj0) obj3);
                }
            })).filter(new w9j() { // from class: l.hn30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f108544a.m161246l7((Boolean) obj);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.jn30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f118760a.m161251m7((Boolean) obj);
                }
            }));
        }
        duringCreated(m161157T4().m39819i7()).subscribe(mkd0.m154955G(new e30() { // from class: l.kn30
            @Override // p149l.e30
            public final void call(Object obj) {
                nt30.m160912P2((TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H6 */
    public final /* synthetic */ void m161111H6(String str) {
        ark.m98443Q0(m161157T4(), str, new d30() { // from class: l.mo30
            @Override // p149l.d30
            public final void call() {
                this.f134843a.m161107G6();
            }
        });
        CoreModule.f17545c.f19593O2.put("");
    }

    /* JADX INFO: renamed from: H7 */
    public final /* synthetic */ void m161112H7(Boolean bool) {
        m161182Y4();
    }

    /* JADX INFO: renamed from: H8 */
    public final void m161113H8() {
        mkd0.m154992z(this.f140379Y);
        this.f140379Y = null;
    }

    /* JADX INFO: renamed from: I5 */
    public final void m161114I5() {
        lqf.m151015a().m151016b(ExtraActLifecycle.onResumeFromBackground, this.f140398p0);
        duringCreated(v930.m197537k()).distinctUntilChanged().skip(1).filter(new w9j() { // from class: l.ns30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((TabName) obj) == TabName.Card);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.os30
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19663m0.m31143s6("initiative", "tab", null);
            }
        }));
        duringCreated(CoreModule.f17545c.f19663m0.f19373T).subscribe(mkd0.m154955G(new e30() { // from class: l.ps30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150972a.m161256n7((roj0) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19663m0.f19370S).filter(new w9j() { // from class: l.rs30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(upa.m194837x() || qib0.f154693H.guessedCurrentServerTime() - ((Long) ((j760) obj).f116565b).longValue() < Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
            }
        }).switchMap(new w9j() { // from class: l.ss30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return nt30.m161015m0((j760) obj);
            }
        }).filter(new w9j() { // from class: l.ts30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a(CoreModule.f17545c.f19663m0.f19370S) && NullChecker.m81303a(CoreModule.f17545c.f19663m0.f19370S.m221515e()));
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.us30
            @Override // p149l.e30
            public final void call(Object obj) {
                nt30.m160889J4((TabName) obj);
            }
        }));
        du2.m113670a("[See_Toast]", "insertActionObs sub done");
        duringCreated((C22306c) CoreModule.f17545c.f19663m0.f19394a0.take(1).switchMap(new w9j() { // from class: l.vs30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19663m0.f19397b0;
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.ws30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187861a.m161260o7((ActionData) obj);
            }
        }));
        duringCreated(v930.m197537k()).distinctUntilChanged().skip(1).subscribe(mkd0.m154955G(new e30() { // from class: l.xs30
            @Override // p149l.e30
            public final void call(Object obj) {
                hdb0.m130575c().m130584k();
            }
        }));
    }

    /* JADX INFO: renamed from: I6 */
    public final /* synthetic */ void m161115I6(j760 j760Var) {
        this.f140396o.m132487l(Boolean.FALSE);
        m161187Z4();
    }

    /* JADX INFO: renamed from: I7 */
    public final /* synthetic */ void m161116I7(Pair pair) {
        gj40.INSTANCE.m126456r((String) pair.first, (String) pair.second, m161157T4());
    }

    /* JADX INFO: renamed from: I8 */
    public final void m161117I8() {
        e30<Boolean> e30Var = new e30() { // from class: l.yp30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199386a.m161257n8((Boolean) obj);
            }
        };
        final NewMainAct newMainActM161157T4 = m161157T4();
        if (!m161157T4().getIntent().getBooleanExtra("EXTRA_SHOW_TUTORIAL", false) || CoreModule.f17545c.f19639e0.f149473t1.get().booleanValue()) {
            if (wvv.m205776p(newMainActM161157T4)) {
                m161121J8();
            } else {
                if (!wvv.m205773m()) {
                    wvv.m205765e();
                }
                this.f140391k.m132487l(roj0.f160388a);
            }
            if (!uq40.m194983y(newMainActM161157T4, true)) {
                this.f140350G.m132487l(Boolean.TRUE);
            }
            m161215e9();
            return;
        }
        this.f140352H = true;
        CoreModule.f17545c.f19639e0.f149473t1.put(Boolean.TRUE);
        m161157T4().getIntent().removeExtra("EXTRA_SHOW_TUTORIAL");
        if (TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().source, "facebook") || TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().source, "google")) {
            this.f140391k.m132487l(roj0.f160388a);
        } else {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37356s6(this.f140399q, e30Var, new d30() { // from class: l.zp30
                @Override // p149l.d30
                public final void call() {
                    this.f204173a.m161264p8(newMainActM161157T4);
                }
            });
        }
    }

    /* JADX INFO: renamed from: J5 */
    public final void m161118J5() {
        if (qp8.m175817b()) {
            duringCreated(mkd0.m154984r(zym.m220932a().m220935d(), lifecycle(), new ol30())).filter(new w9j() { // from class: l.pl30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return nt30.m161027o2((j760) obj);
                }
            }).map(new w9j() { // from class: l.rl30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return nt30.m160860D2((j760) obj);
                }
            }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.sl30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f165133a.m161085A8((PushMessage) obj);
                }
            }));
            CoreModule.m29936Q().mo67216Ep();
        }
    }

    /* JADX INFO: renamed from: J6 */
    public final /* synthetic */ C22306c m161119J6(roj0 roj0Var) {
        return mkd0.m154987u(CoreModule.f17545c.f19639e0.m169523o9().distinctUntilChanged(), CoreModule.f17545c.f19663m0.m31066W8().doOnSubscribe(new d30() { // from class: l.rn30
            @Override // p149l.d30
            public final void call() {
                yni.m215417f(LaunchStep.SuggestNet);
            }
        }).doOnNext(new e30() { // from class: l.sn30
            @Override // p149l.e30
            public final void call(Object obj) {
                yni.m215415d(LaunchStep.SuggestNet);
            }
        }), m161157T4().m39819i7().distinctUntilChanged(new x9j() { // from class: l.un30
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return nt30.m160878H3((TabName) obj, (TabName) obj2);
            }
        }), vi4.m198495a().mo102631d(3).timeout(3000L, TimeUnit.MILLISECONDS).materialize().observeOn(jo0.m142408a()).first().doOnNext(new e30() { // from class: l.vn30
            @Override // p149l.e30
            public final void call(Object obj) {
                yni.m215415d(LaunchStep.AsyncLayout);
            }
        }).doOnSubscribe(new d30() { // from class: l.wn30
            @Override // p149l.d30
            public final void call() {
                nt30.m160944W3();
            }
        }), CoreModule.f17545c.f19639e0.f149190I1, new aaj() { // from class: l.xn30
            @Override // p149l.aaj
            /* JADX INFO: renamed from: a */
            public final Object mo95547a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return vwb.m200311Y((PartialListOpt) obj2, (TabName) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: J7 */
    public final /* synthetic */ void m161120J7(UserPrivilege userPrivilege) {
        SVGALoader.with(m161157T4()).from("https://auto.tancdn.com/v1/raw/644d6fdb-68cd-4fd0-997e-d18646ddb13c14.pdf").downloadOnly();
    }

    /* JADX INFO: renamed from: J8 */
    public void m161121J8() {
        if (wvv.m205773m()) {
            if (this.f140354I) {
                this.f140354I = false;
                if (this.f140352H) {
                    return;
                }
                this.f140391k.m132487l(roj0.f160388a);
                return;
            }
            return;
        }
        if (u59.m191821c0() || !this.f140369P0) {
            String[] strArr = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
            if (u59.m191821c0()) {
                if (!wvv.m205777q() || (pvv.m171693c() && !wvv.m205775o())) {
                    m161219f9();
                    return;
                } else {
                    m161280t8();
                    return;
                }
            }
            if (wvv.m205777q() && (!pvv.m171693c() || wvv.m205775o())) {
                m161280t8();
                return;
            }
            if (this.f140365N0 == null) {
                this.f140365N0 = new uj60(Arrays.asList(strArr));
            }
            ygh0.m214695n0(ygh0.f198173h);
            wvv.m205778r();
            this.f140369P0 = true;
            e51.m114748M(new RunnableC18767b(strArr));
        }
    }

    /* JADX INFO: renamed from: K5 */
    public final void m161122K5(NewMainAct newMainAct) {
        CoreModule.f17545c.f19550A1.m182440t3(newMainAct, new Function1() { // from class: l.fo30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return nt30.m161004j4((IntlMarketConfigEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K6 */
    public final /* synthetic */ void m161123K6() {
        m161269r5();
        m161273s5("swipeFinalDelay");
    }

    /* JADX INFO: renamed from: K7 */
    public final /* synthetic */ void m161124K7(C4319c c4319c) {
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37207P5();
    }

    /* JADX INFO: renamed from: K8 */
    public void m161125K8() {
        qib0.f154687E.m78868t();
        CoreModule.f17545c.f19663m0.m31043R5();
        CoreModule.f17545c.f19663m0.m31127m8();
    }

    /* JADX INFO: renamed from: L5 */
    public final void m161126L5() {
        duringCreated(CoreModule.f17545c.f19663m0.f19325B2).subscribe(mkd0.m154955G(new e30() { // from class: l.uq30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177696a.m161263p7((roj0) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX INFO: renamed from: L6 */
    public final /* synthetic */ void m161127L6(j760 j760Var) {
        boolean z;
        boolean z2 = C7867a.f21991g;
        yni.m215415d(LaunchStep.RenderTask);
        PartialListOpt partialListOpt = (PartialListOpt) j760Var.f116564a;
        int size = partialListOpt.loaded.size();
        boolean zNeedRefresh = partialListOpt.needRefresh();
        List<CoreSuggested.UserInfo> listM37912y = ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).f21888M.m37912y(partialListOpt.loaded);
        if (TextUtils.isEmpty(f140336V0) && !vwb.m200296J(listM37912y) && (!mah0.m153720m0() || !mah0.m153738y0(listM37912y.get(0).f19472id))) {
            f140336V0 = listM37912y.get(0).f19472id;
        }
        if (size != listM37912y.size()) {
            y1j.m212199h("render List refresh change " + size + Constants.SEPARATOR_COMMA + listM37912y.size());
            z = true;
        } else {
            z = zNeedRefresh;
        }
        StringBuilder sb = new StringBuilder("render cards: ");
        sb.append(z);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(zNeedRefresh);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(!partialListOpt.hasMore() && listM37912y.size() == 0);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(listM37912y.isEmpty());
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(partialListOpt.getReasonStr());
        y1j.m212199h(sb.toString());
        partialListOpt.resetReason();
        if (upa.m194723Z2()) {
            psq.m171192H(vwb.m200296J(listM37912y));
        }
        if (z) {
            if (upa.m194842y()) {
                ExpandedCardStyleHelper.m38090o().m38091A(vwb.m200296J(listM37912y) ? "" : listM37912y.get(0).f19472id);
            }
            listM37912y.size();
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).f21888M.m37907K(listM37912y);
        }
        if (upa.m194675N3() && vwb.m200296J(listM37912y) && ExpandedCardStyleHelper.m38090o().m38103s()) {
            ExpandedCardStyleHelper.m38090o().m38096k(null, null, "empty card");
        }
        if (!z) {
            partialListOpt.setRefreshValue(true);
        }
        if (listM37912y.size() > 0) {
            m161191a5(listM37912y.get(0));
            if (ogl0.m164247Z()) {
                m161196b5(listM37912y.get(0));
            }
        }
        this.f140383c = true;
        m161157T4().postDelayed(new Runnable() { // from class: l.uo30
            @Override // java.lang.Runnable
            public final void run() {
                this.f177492a.m161123K6();
            }
        }, 100L);
        if (partialListOpt.hasMore() || listM37912y.size() != 0) {
            boolean zIsEmpty = listM37912y.isEmpty();
            V v2 = this.viewModel;
            if (zIsEmpty) {
                ((ViewTreeObserverOnGlobalLayoutListenerC7866b) v2).m37190M5(true, true, true);
            } else {
                ((ViewTreeObserverOnGlobalLayoutListenerC7866b) v2).m37190M5(false, true, true);
            }
        } else {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37190M5(true, false, true);
        }
        if (!((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37176K3() && this.f140394m.m221515e() == null) {
            this.f140394m.m132487l(roj0.f160388a);
        }
        if (vy8.m200609g() && NullChecker.m81303a(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38809d()) && !((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37176K3()) {
            this.f140395n.m132487l(roj0.f160388a);
        }
        if (IntlCountryCodeController.m28126v() && NullChecker.m81303a(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38809d()) && (((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38809d() instanceof NewNewProfileCard)) {
            ((NewNewProfileCard) ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38809d()).setOnTouchListener(new ViewOnTouchListenerC18766a());
        }
        if (!vwb.m200296J(listM37912y) && ((!mah0.m153720m0() || !mah0.m153738y0(listM37912y.get(0).f19472id)) && (((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37341q2().getParentFragment() instanceof psl))) {
            ((psl) ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37341q2().getParentFragment()).mo38563e3();
        }
        if (C8455a.m47588w().m47601M() && NullChecker.m81303a(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2()) && NullChecker.m81303a(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38809d())) {
            if ((((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38809d() instanceof NewNewProfileCard) || (((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38809d() instanceof e5m)) {
                ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37306i6();
            }
        }
    }

    /* JADX INFO: renamed from: L7 */
    public final /* synthetic */ void m161128L7(j760 j760Var) {
        if (xdl0.m208349O0(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).f21904U.mo126602m())) {
            o6j0.m162864h("e_advanced_filter_red_dot", "p_suggest_users_home_view", new o6j0.C18854a[0]);
        }
    }

    /* JADX INFO: renamed from: L8 */
    public void m161129L8(boolean z) {
        final C22392a<PartialListOpt<CoreSuggested.UserInfo>> c22392a = this.f140393l;
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = c22392a.m221515e();
        if (z || partialListOptM221515e == null || partialListOptM221515e.hasMore()) {
            CoreModule.f17545c.f19663m0.m31127m8().subscribe(mkd0.m154956H(new e30() { // from class: l.hp30
                @Override // p149l.e30
                public final void call(Object obj) {
                    nt30.m160952Y3((roj0) obj);
                }
            }, new e30() { // from class: l.ip30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f114264a.m161268q8(c22392a, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: M5 */
    public final void m161130M5() {
        if (IntlCountryCodeController.m28115k()) {
            duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).filter(new w9j() { // from class: l.jk30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((User) obj).isVIP() && n3b0.m157742q() && CoreModule.f17545c.f19639e0.f149262S0.get().booleanValue());
                }
            }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.fl30
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19639e0.m169440S7().subscribe(mkd0.m154950B());
                }
            }));
        }
        if (IntlCountryCodeController.m28115k()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37218R5(false);
        } else {
            C4732c c4732c = CoreModule.f17545c;
            c4732c.f19654j0.f19295h0 = false;
            duringCreated((C22306c) c4732c.f19639e0.m169523o9().flatMap(new w9j() { // from class: l.bp30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return mkd0.m154984r(CoreModule.f17545c.f19654j0.m30584G4(), CoreModule.f17545c.m31483n3().map(new w9j() { // from class: l.fp30
                        @Override // p149l.w9j
                        public final Object call(Object obj2) {
                            return Integer.valueOf(((Counter) obj2).likersLimit.remaining);
                        }
                    }).distinctUntilChanged(), new x9j() { // from class: l.gp30
                        @Override // p149l.x9j
                        public final Object call(Object obj2, Object obj3) {
                            return new j760((FreeTrialEnvelope) obj2, (Integer) obj3);
                        }
                    });
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.mp30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f135008a.m161267q7((j760) obj);
                }
            }, new e30() { // from class: l.xp30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f193895a.m161271r7((Throwable) obj);
                }
            }));
        }
        if (nkp.m159983b()) {
            duringCreated(mkd0.m154984r(CoreModule.f17545c.f19639e0.m169523o9().map(new gq30()).distinctUntilChanged(), CoreModule.f17545c.m31483n3().map(new w9j() { // from class: l.hq30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(n3b0.m157741p());
                }
            }).distinctUntilChanged(), new x9j() { // from class: l.iq30
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return j760.m140076a((Boolean) obj, (Boolean) obj2);
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.jq30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f119248a.m161275s7((j760) obj);
                }
            }, new e30() { // from class: l.kq30
                @Override // p149l.e30
                public final void call(Object obj) {
                    nt30.m160979f1((Throwable) obj);
                }
            }));
        }
        if (!f140340Z0.get().booleanValue() && !vdj.m198001c() && !nkp.m159984c()) {
            duringCreated(new v9j() { // from class: l.qo30
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return CoreModule.f17545c.f19687u0.m30405O6();
                }
            }).filter(new w9j() { // from class: l.nq30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f140028a.m161279t7((CoreLikers.C4719a) obj);
                }
            }).distinctUntilChanged().subscribe(mkd0.m154956H(new e30() { // from class: l.yq30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f199518a.m161283u7((CoreLikers.C4719a) obj);
                }
            }, new e30() { // from class: l.jr30
                @Override // p149l.e30
                public final void call(Object obj) {
                    nt30.m160915Q0((Throwable) obj);
                }
            }));
            duringCreated(this.f140401s.obs()).filter(new w9j() { // from class: l.ur30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Integer) obj).intValue() >= 1);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.fs30
                @Override // p149l.e30
                public final void call(Object obj) {
                    nt30.f140340Z0.put(Boolean.TRUE);
                }
            }));
        }
        duringCreated(CoreModule.f17545c.f19663m0.f19344I0).subscribe(mkd0.m154955G(new e30() { // from class: l.qs30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156098a.m161287v7((roj0) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19663m0.f19368R0).flatMap(new w9j() { // from class: l.bt30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19687u0.m30405O6();
            }
        }).filter(new w9j() { // from class: l.mt30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19663m0.f19368R0.m221515e();
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.uk30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176903a.m161291w7((CoreLikers.C4719a) obj);
            }
        }));
        CoreModule.f17545c.f19559D1.m139629h3();
        duringCreated(CoreModule.f17545c.f19663m0.f19411f2.asObservable()).subscribe(mkd0.m154955G(new e30() { // from class: l.ql30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155190a.m161295x7((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19663m0.f19420i2.asObservable()).subscribe(mkd0.m154955G(new e30() { // from class: l.bm30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76233a.m161299y7((SwipeDirection) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19663m0.f19414g2.asObservable()).subscribe(mkd0.m154955G(new e30() { // from class: l.mm30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134547a.m161303z7((SwipeDirection) obj);
            }
        }));
        int iIntValue = CoreModule.f17545c.f19576J0.f115757i0.get().intValue();
        int i = (iIntValue / 10) % 100;
        Date date = new Date(mqi0.m155944o());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169527p9()) && !CoreModule.f17545c.f19639e0.m169527p9().isFemale() && ((!CoreModule.f17557o.m195057d().mo33766Vd() || !CoreModule.f17545c.f19639e0.m169527p9().isUltraPremium()) && u59.m191846q() && (iIntValue % 10 < 2 || calendar.get(2) + 1 != i))) {
            duringCreated(CoreModule.f17545c.f19576J0.m139279r3()).subscribe(mkd0.m154956H(new e30() { // from class: l.xm30
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19576J0.f115763o0 = ((Boolean) obj).booleanValue();
                }
            }, new e30() { // from class: l.in30
                @Override // p149l.e30
                public final void call(Object obj) {
                    nt30.m160959a3((Throwable) obj);
                }
            }));
        }
        if (u59.m191814W()) {
            creates(new e30() { // from class: l.tn30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f171206a.m161088B7((Bundle) obj);
                }
            });
        }
        if (IntlCountryCodeController.m28116l() && !TextUtils.isEmpty(qib0.f154697L.f17148f.get())) {
            creates(new e30() { // from class: l.eo30
                @Override // p149l.e30
                public final void call(Object obj) {
                    nt30.m160989h0((Bundle) obj);
                }
            });
        }
        if (!TextUtils.isEmpty(qib0.f154697L.f17149g.get())) {
            creates(new e30() { // from class: l.po30
                @Override // p149l.e30
                public final void call(Object obj) {
                    nt30.m160974e1((Bundle) obj);
                }
            });
        }
        if (IntlCountryCodeController.m28113i() && NullChecker.m81303a(qib0.f154697L.f17150h.get())) {
            CoreModule.f17545c.f19639e0.m169377C9(qib0.f154697L.f17150h.get());
            qib0.f154697L.f17150h.clear();
        }
    }

    /* JADX INFO: renamed from: M6 */
    public final /* synthetic */ void m161131M6(roj0 roj0Var) {
        if (!((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37233U2("removeSwipeGuideCard s1 ") && ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37276c6()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37286e6();
        }
    }

    /* JADX INFO: renamed from: M7 */
    public final /* synthetic */ void m161132M7(Integer num) {
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37212Q5(true);
    }

    /* JADX INFO: renamed from: M8 */
    public void m161133M8() {
        if (this.f140389i) {
            this.f140389i = false;
        }
        m161182Y4();
    }

    /* JADX INFO: renamed from: N5 */
    public final void m161134N5() {
        if (upa.m194736c3()) {
            creates(new e30() { // from class: l.nl30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f139505a.m161092C7((Bundle) obj);
                }
            });
            CoreModule.f17545c.f19564F0.m99250q3();
            psq.m171209Y(m161157T4());
        } else if (upa.m194723Z2()) {
            CoreModule.f17545c.f19564F0.m99250q3();
            psq.m171208X(m161157T4());
        }
    }

    /* JADX INFO: renamed from: N6 */
    public final /* synthetic */ void m161135N6(roj0 roj0Var) {
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37329n6();
    }

    /* JADX INFO: renamed from: N7 */
    public final /* synthetic */ void m161136N7() {
        if (!this.f140390j && CoreModule.m29931H().signedIn_()) {
            j63.m139890j().m139899s();
            if (lac0.m149136m()) {
                C19873s9.m182675j().m182684s();
            }
        }
        e51.m114745J(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37380y2());
    }

    /* JADX INFO: renamed from: N8 */
    public boolean m161137N8() {
        return f140340Z0.get().booleanValue();
    }

    /* JADX INFO: renamed from: O6 */
    public final /* synthetic */ void m161138O6(roj0 roj0Var) {
        if (!NullChecker.m81303a(roj0Var) || this.f140389i) {
            return;
        }
        m161182Y4();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O7 */
    public final /* synthetic */ Boolean m161139O7(j760 j760Var) {
        boolean z;
        if (j760Var.f116565b == C4319c.f15548i) {
            CoreLikers.LikersTriggerBy likersTriggerBy = CoreLikers.LikersTriggerBy.home_total_liker_float;
            F f = j760Var.f116564a;
            if ((likersTriggerBy == ((CoreLikers.C4719a) f).f19269a || CoreLikers.LikersTriggerBy.home_new_liker_float == ((CoreLikers.C4719a) f).f19269a) && ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).act().m39812e6(TabName.Card) && !((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).act().isDialogShowing()) {
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
    public void m161140O8(C7994d c7994d, Throwable th) {
        HomeStatisticsHelper.m36687A(c7994d, th);
        this.f140387g = false;
        this.f140388h = false;
        sbp.m183242b();
    }

    /* JADX INFO: renamed from: P5 */
    public final void m161141P5() {
        duringCreated(CoreModule.f17545c.f19597Q0.m173713w3().filter(new w9j() { // from class: l.nr30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                MigrateAwardDialogData migrateAwardDialogData = (MigrateAwardDialogData) obj;
                return Boolean.valueOf(migrateAwardDialogData != null && migrateAwardDialogData.showDialog);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.or30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145231a.m161108G7((MigrateAwardDialogData) obj);
            }
        }, new e30() { // from class: l.pr30
            @Override // p149l.e30
            public final void call(Object obj) {
                nt30.m161028o3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P6 */
    public final /* synthetic */ void m161142P6() {
        if (NullChecker.m81303a(m161157T4())) {
            m161182Y4();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P7 */
    public final /* synthetic */ Boolean m161143P7(j760 j760Var) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (CoreLikers.LikersTriggerBy.home_total_liker_float == ((CoreLikers.C4719a) j760Var.f116564a).f19269a && gzc0.m128840f0() && !m161157T4().isDialogShowing() && !userM169527p9.isBanned()) {
            if (ogl0.m164227F()) {
                kb50 kb50VarM135333f = ic50.m135327j().m135333f();
                OmsDialog omsDialog = OmsDialog.p_offline_popup;
                if (kb50VarM135333f.m145226M(omsDialog.getIdentifier(), false)) {
                    gzc0.m128842h0(this);
                    ic50.m135327j().m135333f().m145241b0(omsDialog.getIdentifier(), 0, false);
                } else {
                    gzc0.m128837c0().f105122f = true;
                }
            } else {
                gzc0.m128842h0(this);
            }
        }
        boolean zM128838d0 = gzc0.m128838d0(((CoreLikers.C4719a) j760Var.f116564a).f19269a);
        if (f140338X0 || !zM128838d0) {
            CoreModule.f17545c.f19687u0.f19256m0.put(Long.valueOf(qib0.f154693H.guessedCurrentServerTime()));
        }
        F f = j760Var.f116564a;
        if (((CoreLikers.C4719a) f).f19270b == 0) {
            f140338X0 = false;
        }
        if (((CoreLikers.C4719a) f).f19270b > 0 && !zM128838d0) {
            return Boolean.TRUE;
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).act().m39815f7();
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: P8 */
    public void m161144P8(C7994d c7994d, String str) {
        HomeStatisticsHelper.m36688B(c7994d, str);
        this.f140387g = false;
        this.f140388h = false;
        sbp.m183242b();
    }

    /* JADX INFO: renamed from: Q5 */
    public final void m161145Q5() {
        duringCreated(mkd0.m154986t(CoreModule.f17545c.f19639e0.m169523o9(), CoreModule.f17545c.f19687u0.m30407P6(), CoreModule.f17545c.m31483n3(), lifecycle(), new z9j() { // from class: l.hr30
            @Override // p149l.z9j
            /* JADX INFO: renamed from: b */
            public final Object mo100621b(Object obj, Object obj2, Object obj3, Object obj4) {
                User user = (User) obj;
                CoreLikers.C4719a c4719a = (CoreLikers.C4719a) obj2;
                return Boolean.valueOf(!user.isFemale() && CoreModule.f17545c.f19639e0.m169502j8(user) && n3b0.m157733g() == 0 && c4719a != null && c4719a.f19269a == CoreLikers.LikersTriggerBy.new_like_dialog && ((Counter) obj3) != null && ((C4319c) obj4) == C4319c.f15548i);
            }
        })).filter(new w9j() { // from class: l.ir30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return nt30.m161056u0((Boolean) obj);
            }
        }).first().compose(mkd0.m154966R()).subscribe(mkd0.m154956H(new e30() { // from class: l.kr30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124320a.m161112H7((Boolean) obj);
            }
        }, new e30() { // from class: l.lr30
            @Override // p149l.e30
            public final void call(Object obj) {
                nt30.m160927S2((Throwable) obj);
            }
        }));
        creates(new e30() { // from class: l.mr30
            @Override // p149l.e30
            public final void call(Object obj) {
                nt30.m161077z0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q6 */
    public final /* synthetic */ void m161146Q6(Boolean bool) {
        e51.m114743H(m161157T4(), new Runnable() { // from class: l.ko30
            @Override // java.lang.Runnable
            public final void run() {
                this.f123950a.m161142P6();
            }
        }, 400L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q7 */
    public final /* synthetic */ void m161147Q7(j760 j760Var) {
        if (m161242k8((CoreLikers.C4719a) j760Var.f116564a)) {
            return;
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).act().m39815f7();
    }

    /* JADX INFO: renamed from: Q8 */
    public void m161148Q8(int i) {
        this.f140382b = i;
    }

    /* JADX INFO: renamed from: R5 */
    public final void m161149R5() {
        gj40 gj40Var = gj40.INSTANCE;
        if (gj40Var.m126451m()) {
            duringCreated(gj40Var.m126450l()).subscribe(mkd0.m154956H(new e30() { // from class: l.tl30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f170992a.m161116I7((Pair) obj);
                }
            }, new e30() { // from class: l.ul30
                @Override // p149l.e30
                public final void call(Object obj) {
                    nt30.m160980f2((Throwable) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R6 */
    public final /* synthetic */ void m161150R6(xaj0 xaj0Var) {
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37247W5((DoublePair) xaj0Var.f191751a, ((RoamedLocationData) xaj0Var.f191752b).data);
    }

    /* JADX INFO: renamed from: R7 */
    public final /* synthetic */ void m161151R7(Boolean bool) {
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37212Q5(true);
    }

    /* JADX INFO: renamed from: R8 */
    public void m161152R8(String str) {
        this.f140381a = str;
    }

    /* JADX INFO: renamed from: S5 */
    public final void m161153S5() {
        if (xma.m210059X3()) {
            duringCreated(CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("oDiamond"))).filter(new w9j() { // from class: l.pq30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(xma.m210043F3());
                }
            }).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.qq30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f155862a.m161120J7((UserPrivilege) obj);
                }
            }));
        } else {
            SVGALoader.with(m161157T4()).from("https://auto.tancdn.com/v1/raw/644d6fdb-68cd-4fd0-997e-d18646ddb13c14.pdf").downloadOnly();
        }
        SVGALoader.with(m161157T4()).from("https://auto.tancdn.com/v1/raw/84746e2a-9059-47ff-90af-07839ec09c0f14.pdf").downloadOnly();
        SVGALoader.with(m161157T4()).from("https://auto.tancdn.com/v1/raw/05053d7f-77ec-4650-a3b2-9eeb949bbafb14.pdf").downloadOnly();
        SVGALoader.with(m161157T4()).from("https://auto.tancdn.com/v1/raw/742c2a25-1a5c-441c-9433-72583a165ddf14.pdf").downloadOnly();
    }

    /* JADX INFO: renamed from: S6 */
    public final /* synthetic */ void m161154S6(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        V v2 = this.viewModel;
        if (zBooleanValue) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) v2).m37319l6();
        } else if (((ViewTreeObserverOnGlobalLayoutListenerC7866b) v2).m37276c6()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37286e6();
        }
    }

    /* JADX INFO: renamed from: S7 */
    public final /* synthetic */ void m161155S7(Boolean bool) {
        if (u59.m191812U() && !mqi0.m155929D(CoreModule.f17545c.f19576J0.f115756h0.get().longValue()) && xma.m210040C3()) {
            CoreModule.f17545c.f19576J0.m139276c4(SummarizedPrivilegesId.ultraPremium);
        }
        if (CoreModule.f17545c.f19576J0.m139254F3()) {
            m73.m153327g(m161157T4());
        } else {
            m73.m153328h(m161157T4(), ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37297h2(), null);
        }
    }

    /* JADX INFO: renamed from: S8 */
    public void m161156S8(String str) {
        this.f140355I0 = str;
    }

    /* JADX INFO: renamed from: T4 */
    public NewMainAct m161157T4() {
        return ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).act();
    }

    /* JADX INFO: renamed from: T5 */
    public final void m161158T5() {
        duringCreated(lifecycle()).filter(new w9j() { // from class: l.ls30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15550k);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.ms30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135439a.m161124K7((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T6 */
    public final /* synthetic */ void m161159T6(Boolean bool) {
        if (bool.booleanValue()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37204P2();
            return;
        }
        if (CoreModule.f17545c.f19663m0.f19350K0.m221519i() && CoreModule.f17545c.f19663m0.f19350K0.m221515e().booleanValue()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37319l6();
        } else if (((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37276c6()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37286e6();
        }
    }

    /* JADX INFO: renamed from: T7 */
    public final /* synthetic */ void m161160T7(TabName tabName) {
        qug0.m176610g().m176616j((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel);
    }

    /* JADX INFO: renamed from: T8 */
    public void m161161T8(boolean z) {
        this.f140346E = z;
    }

    /* JADX INFO: renamed from: U4 */
    public void m161162U4() {
        long jM155944o = this.f140371Q0 - mqi0.m155944o();
        if (jM155944o >= 0 || jM155944o <= -7200000) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37256Y5(1);
        } else {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37256Y5(2);
        }
        this.f140378X = C22306c.interval(0L, 500L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.wp30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187490a.m161270r6((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U5 */
    public final void m161163U5() {
        if (ogl0.m164237P()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("https://fe-static.tancdn.com/v1/raw/b63ed4a9-0bbb-4a36-b6ea-91dbb32addd814.svga");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/4475f01c-8dd0-40b9-851d-f60f578c08db14.svga");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/3fde0b7d-f6d7-410d-9454-59d1b7d1783014.svga");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/1ecec93e-84b2-4731-a927-90928bb72cb114.svga");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/a0ef67b0-beed-4cfc-b970-3b321ea7b78f14.svga");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/444d9220-d23d-4a74-9eb7-43b89c4f2f5614.svga");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/b24ea63e-9d42-4569-a402-a155d1fa76ae14.svga");
            SVGALoader.with(App.f15369e).batchDownload(arrayList);
        }
    }

    /* JADX INFO: renamed from: U6 */
    public final /* synthetic */ void m161164U6(String str) {
        CardButtonsShowAndHideType cardButtonsShowAndHideTypeM37281d6 = ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37281d6();
        if (TEnum.equals(cardButtonsShowAndHideTypeM37281d6, "show")) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37152F5();
        } else if (TEnum.equals(cardButtonsShowAndHideTypeM37281d6, "hide")) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37147E5();
        } else if (TEnum.equals(cardButtonsShowAndHideTypeM37281d6, CardButtonsShowAndHideType.only_hide_operation_btn)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37378x5();
        }
    }

    /* JADX INFO: renamed from: U7 */
    public final /* synthetic */ void m161165U7(String str) {
        if (TextUtils.equals(str, m161157T4().getPopLifeName()) && NullChecker.m81303a(qug0.m176610g().m176614e())) {
            qug0.m176610g().m176616j((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel);
        }
    }

    /* JADX INFO: renamed from: U8 */
    public void m161166U8(boolean z) {
        this.f140345D = z;
    }

    /* JADX INFO: renamed from: V4 */
    public final void m161167V4(User user) {
        m161265q5(user, true);
    }

    /* JADX INFO: renamed from: V5 */
    public final void m161168V5() {
        duringCreated(mkd0.m154984r(m161157T4().m39819i7().distinctUntilChanged(), m161157T4().lifecycle().distinctUntilChanged(), new bs30()).filter(new w9j() { // from class: l.cs30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                j760 j760Var = (j760) obj;
                return Boolean.valueOf(j760Var.f116565b == C4319c.f15548i && TextUtils.equals(((TabName) j760Var.f116564a).name(), TabName.Card.name()));
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.ds30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87715a.m161128L7((j760) obj);
            }
        }, new e30() { // from class: l.es30
            @Override // p149l.e30
            public final void call(Object obj) {
                nt30.m161020n0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V6 */
    public final /* synthetic */ void m161169V6(roj0 roj0Var) {
        if (NullChecker.m81303a(this.viewModel) && NullChecker.m81303a(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37164I2()) && NullChecker.m81303a(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37149F2())) {
            xdl0.m208344M(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37164I2(), false);
            xdl0.m208344M(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37149F2(), true);
        }
    }

    /* JADX INFO: renamed from: V7 */
    public final /* synthetic */ void m161170V7() {
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37340p6();
    }

    /* JADX INFO: renamed from: V8 */
    public void m161171V8(boolean z) {
        this.f140344C = z;
    }

    /* JADX INFO: renamed from: W4 */
    public boolean m161172W4() {
        return (TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().source, "wechat") || TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().source, "qq")) && vy8.m200617o() && !CoreModule.f17545c.f19639e0.f149333b0.get().booleanValue();
    }

    /* JADX INFO: renamed from: W5 */
    public final void m161173W5() {
        if (bzc0.m104566f()) {
            CoreModule.f17545c.f19663m0.m31098e9();
            CoreModule.f17545c.f19668n2.m175433J3(CoreModule.m29931H().userId());
        }
    }

    /* JADX INFO: renamed from: W6 */
    public final /* synthetic */ void m161174W6(roj0 roj0Var) {
        if (NullChecker.m81303a(this.viewModel) && NullChecker.m81303a(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37164I2()) && NullChecker.m81303a(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37149F2())) {
            xdl0.m208344M(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37164I2(), true);
            xdl0.m208344M(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37149F2(), true);
        }
    }

    /* JADX INFO: renamed from: W7 */
    public final /* synthetic */ void m161175W7(Boolean bool) {
        if (zzc0.m221015f0() && bool.booleanValue()) {
            e51.m114743H(m161157T4(), new Runnable() { // from class: l.ep30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f92536a.m161170V7();
                }
            }, 800L);
        }
    }

    /* JADX INFO: renamed from: W8 */
    public void m161176W8(boolean z) {
        this.f140343B = z;
    }

    /* JADX INFO: renamed from: X4 */
    public void m161177X4() {
        if (this.f140360L) {
            return;
        }
        this.f140360L = true;
        CoreModule.f17545c.f19639e0.f149333b0.put(Boolean.valueOf(qgp0.m174450e().m174452g()));
        if (!qgp0.m174450e().m174452g()) {
            this.f140396o.m132487l(Boolean.TRUE);
        } else {
            this.f140353H0 = true;
            qgp0.m174450e().m174453h(m161157T4()).flatMap(new w9j() { // from class: l.no30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return nt30.m161047s1((Boolean) obj);
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.oo30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f144843a.m161274s6((roj0) obj);
                }
            }, new e30() { // from class: l.ro30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f160353a.m161278t6((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: X5 */
    public final void m161178X5() {
        if (ogl0.m164241T()) {
            CoreModule.f17545c.f19671o2.m154148h3();
        }
    }

    /* JADX INFO: renamed from: X6 */
    public final /* synthetic */ void m161179X6(SwipeDirection swipeDirection) {
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37329n6();
        SwipeDirection swipeDirection2 = SwipeDirection.RIGHT;
        if (swipeDirection == swipeDirection2) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38801A(swipeDirection2);
            return;
        }
        SwipeDirection swipeDirection3 = SwipeDirection.LEFT;
        if (swipeDirection == swipeDirection3) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38801A(swipeDirection3);
            return;
        }
        SwipeDirection swipeDirection4 = SwipeDirection.UP;
        if (swipeDirection == swipeDirection4) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38801A(swipeDirection4);
        }
    }

    /* JADX INFO: renamed from: X7 */
    public final /* synthetic */ C22306c m161180X7(User user) {
        return this.f140400r;
    }

    /* JADX INFO: renamed from: X8 */
    public void m161181X8(boolean z) {
        this.f140342A = z;
    }

    /* JADX INFO: renamed from: Y4 */
    public void m161182Y4() {
        if (CoreModule.f17545c.f19639e0.m169527p9() == null) {
            this.f140361L0 = 1;
            if (NullChecker.m81303a(this.f140363M0) && !this.f140363M0.isUnsubscribed()) {
                this.f140363M0.unsubscribe();
            }
            CrashHelper.m81296c(new IllegalStateException("checkIntro error when illegal account state, userId:" + CoreModule.m29931H().userId() + ", login: " + CoreModule.m29931H().signedIn_() + ", me == null"));
            this.f140363M0 = duringCreated(mkd0.m154984r(CoreModule.f17545c.f19642f0.m33073on(), CoreModule.f17545c.f19639e0.m169523o9(), new yn30())).filter(new w9j() { // from class: l.zn30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f203956a.m161282u6((j760) obj);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.ao30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f70785a.m161286v6((j760) obj);
                }
            }));
            return;
        }
        if (ic50.m135327j().m135333f().m145246g0()) {
            return;
        }
        if (!((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).act().m39812e6(TabName.Card) && !m161195a9()) {
            this.f140389i = true;
            return;
        }
        if (!NullChecker.m81303a(m161157T4()) || m161157T4().isDialogShowing()) {
            if (NullChecker.m81303a(m161157T4())) {
                this.f140389i = true;
                m161157T4().onDialogDismissExtra(new d30() { // from class: l.bo30
                    @Override // p149l.d30
                    public final void call() {
                        this.f76479a.m161294x6();
                    }
                });
                return;
            }
            return;
        }
        if (this.f140362M == null) {
            this.f140362M = new z5l();
        }
        if (this.f140364N == null) {
            this.f140364N = new z5l.C21640a(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37341q2(), this, (ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel);
        }
        if (this.f140362M.mo37498b(this.f140364N)) {
            this.f140362M.mo37497a(this.f140364N);
        }
    }

    /* JADX INFO: renamed from: Y5 */
    public final void m161183Y5() {
        if (!lac0.m149136m()) {
            duringCreated(CoreModule.f17545c.m31483n3()).map(new w9j() { // from class: l.km30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Integer.valueOf(n3b0.m157730d((Counter) obj));
                }
            }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.qm30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f155278a.m161132M7((Integer) obj);
                }
            }));
        }
        creates(new e30() { // from class: l.rm30
            @Override // p149l.e30
            public final void call(Object obj) {
                nt30.m160990h1((Bundle) obj);
            }
        }, new d30() { // from class: l.sm30
            @Override // p149l.d30
            public final void call() {
                this.f165323a.m161136N7();
            }
        });
        duringCreated(mkd0.m154985s(CoreModule.f17545c.f19687u0.m30405O6().filter(new w9j() { // from class: l.tm30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return nt30.m160897M2((CoreLikers.C4719a) obj);
            }
        }).throttleFirst(10L, TimeUnit.SECONDS).observeOn(jo0.m142408a()), lifecycle(), this.f140394m, new y9j() { // from class: l.um30
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return vwb.m200311Y((CoreLikers.C4719a) obj, (C4319c) obj2);
            }
        })).filter(new w9j() { // from class: l.vm30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f182078a.m161139O7((j760) obj);
            }
        }).distinctUntilChanged().filter(new w9j() { // from class: l.wm30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f187046a.m161143P7((j760) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.ym30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198958a.m161147Q7((j760) obj);
            }
        }));
        if (!lac0.m149136m()) {
            duringCreated(CoreModule.f17545c.f19576J0.m139281t3().filter(new doa()).map(new w9j() { // from class: l.lm30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BoostStatus) ((Optional) obj).get()).active);
                }
            }).distinctUntilChanged().filter(new w9j() { // from class: l.nm30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return nt30.m160973e0((Boolean) obj);
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.om30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f144581a.m161151R7((Boolean) obj);
                }
            }));
        }
        duringCreated(v930.m197536j(TabName.Card)).subscribe(mkd0.m154955G(new e30() { // from class: l.pm30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150190a.m161155S7((Boolean) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y6 */
    public final /* synthetic */ void m161184Y6(j760 j760Var) {
        if (((Integer) j760Var.f116564a).intValue() > 0) {
            m161229h9(((Integer) j760Var.f116564a).intValue(), (List) j760Var.f116565b);
        }
    }

    /* JADX INFO: renamed from: Y7 */
    public final /* synthetic */ void m161185Y7(roj0 roj0Var) {
        ark.m98449T0(m161157T4());
    }

    /* JADX INFO: renamed from: Y8 */
    public void m161186Y8(boolean z) {
        this.f140408z = z;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        yni.m215417f(LaunchStep.RenderTask);
        if (upa.m194723Z2()) {
            CoreModule.f17545c.f19704z2.m30262y3();
        }
    }

    /* JADX INFO: renamed from: Z4 */
    public final void m161187Z4() {
        NewMainAct newMainActM161157T4 = m161157T4();
        if (!NullChecker.m81303a(newMainActM161157T4) || newMainActM161157T4.isDialogShowing()) {
            this.f140391k.m132487l(roj0.f160388a);
            return;
        }
        if (vy8.m200606d()) {
            CoreModule.f17545c.f19639e0.f149341c0.put(Boolean.TRUE);
            ark.m98439O0(m161157T4(), "", new d30() { // from class: l.pp30
                @Override // p149l.d30
                public final void call() {
                    this.f150619a.m161298y6();
                }
            }, false);
        } else if (!m161172W4()) {
            this.f140391k.m132487l(roj0.f160388a);
        } else {
            CoreModule.f17545c.f19639e0.f149341c0.put(Boolean.TRUE);
            ark.m98439O0(newMainActM161157T4, "", new d30() { // from class: l.qp30
                @Override // p149l.d30
                public final void call() {
                    this.f155668a.m161302z6();
                }
            }, true);
        }
    }

    /* JADX INFO: renamed from: Z5 */
    public final void m161188Z5() {
        if (upa.m194837x()) {
            duringCreated(v930.m197537k().filter(new w9j() { // from class: l.rq30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.m81303a((TabName) obj) && NullChecker.m81303a(qug0.m176610g().m176614e()));
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.sq30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f165927a.m161160T7((TabName) obj);
                }
            }));
            if (C4371a.m21100p().m21108I()) {
                duringCreated(C4371a.m21100p().m21121r()).subscribe(mkd0.m154955G(new e30() { // from class: l.tq30
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f171546a.m161165U7((String) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: Z6 */
    public final /* synthetic */ void m161189Z6(Bundle bundle) {
        if (NullChecker.m81303a(m161157T4())) {
            m161117I8();
        } else {
            this.f140391k.m132487l(roj0.f160388a);
        }
        boolean z = this.f140348F;
        if (NullChecker.m81303a(this.f140393l.m221515e()) && !vwb.m200296J(this.f140393l.m221515e().loaded) && z) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37353s3(false, true);
        } else if (!NullChecker.m81303a(this.f140393l.m221515e()) || this.f140393l.m221515e().hasMore()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37353s3(true, true);
        } else {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37353s3(true, false);
        }
        this.f140348F = true;
        e51.m114774y(new Runnable() { // from class: l.to30
            @Override // java.lang.Runnable
            public final void run() {
                nt30.m161050s4();
            }
        });
    }

    /* JADX INFO: renamed from: Z7 */
    public final /* synthetic */ void m161190Z7(String str) {
        Picture picture = new Picture();
        picture.url = str;
        qib0.f154691G.m102312B0(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37352s2(), picture.profile480());
        qib0.f154691G.m102312B0(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37336p2(), picture.profile480());
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        LaunchStep launchStep = LaunchStep.NewNewHomeSub;
        yni.m215417f(launchStep);
        y8i0.m213379a("NewNewHomePresenter initSubscription");
        CoreModule.f17545c.f19663m0.f19444q2[1] = 0;
        m161301z5();
        m161141P5();
        m161297y5();
        m161207d6();
        m161098E5();
        m161110H5();
        m161130M5();
        m161183Y5();
        m160909O5();
        m161094D5();
        m161145Q5();
        m161158T5();
        m161118J5();
        m161086B5();
        m161197b6();
        m161202c6();
        m161289w5();
        m161090C5();
        m161114I5();
        m161285v5();
        m161106G5();
        m161188Z5();
        m161102F5();
        m161173W5();
        nya0.m161983a(m161157T4());
        m161178X5();
        m161149R5();
        m161153S5();
        m161168V5();
        m161126L5();
        m161163U5();
        m161134N5();
        m161281u5();
        m161192a6();
        m161293x5();
        m161212e6();
        m161082A5();
        yni.m215415d(launchStep);
        y8i0.m213380b();
    }

    /* JADX INFO: renamed from: a5 */
    public final void m161191a5(CoreSuggested.UserInfo userInfo) {
        if (!(NullChecker.m81303a(m161157T4()) && NullChecker.m81303a(userInfo) && NullChecker.m81303a(userInfo.liveLivingCardDataWrapper)) && ((userInfo.extensionObject == null || !userInfo.virtualCardType.equals(VirtualCardType.LiveMultipleCard)) && ((userInfo.extensionObject == null || !userInfo.virtualCardType.equals(VirtualCardType.LiveVoiceNewCard)) && !((userInfo.extensionObject != null && userInfo.virtualCardType.equals(VirtualCardType.LiveVoiceRoomCard)) || m161226h6(userInfo) || m160999i6(userInfo))))) {
            return;
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37147E5();
        if (upa.m194675N3()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37266a6(false);
        }
    }

    /* JADX INFO: renamed from: a6 */
    public final void m161192a6() {
        if (ogl0.m164245X()) {
            CoreModule.f17545c.f19554B2.m141781u3();
            CoreModule.f17545c.f19554B2.m141782y3();
            duringCreated(v930.m197537k().distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.hs30
                @Override // p149l.e30
                public final void call(Object obj) {
                    nt30.m160936U3((TabName) obj);
                }
            }));
            duringCreated(CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip")).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.is30
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19554B2.m141782y3();
                }
            }));
            lqf.m151015a().m151016b(ExtraActLifecycle.onResumeFromAppStartOrBackground, new e30() { // from class: l.js30
                @Override // p149l.e30
                public final void call(Object obj) {
                    nt30.m160863E0((Act) obj);
                }
            });
            duringCreated(CoreModule.f17545c.f19554B2.m141778o3()).subscribe(mkd0.m154955G(new e30() { // from class: l.ks30
                @Override // p149l.e30
                public final void call(Object obj) {
                    nt30.m161079z2((String) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: a7 */
    public final /* synthetic */ void m161193a7(Boolean bool) {
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37226T1(bool.booleanValue());
    }

    /* JADX INFO: renamed from: a8 */
    public final /* synthetic */ void m161194a8(long j, Long l2) {
        m161284u8(j);
    }

    /* JADX INFO: renamed from: a9 */
    public final boolean m161195a9() {
        return m161200b9() || m161205c9();
    }

    /* JADX INFO: renamed from: b5 */
    public final void m161196b5(CoreSuggested.UserInfo userInfo) {
        if (!rxg0.m181572j().m181592o(userInfo.f19472id)) {
            rxg0.m181572j().f161469n = null;
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37158G6();
        } else {
            if (CoreModule.m29932K().me_().isODiamond() || rxg0.m181572j().m181591n()) {
                return;
            }
            if (!m161217f6(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37341q2(), userInfo)) {
                rxg0.m181572j().f161469n = null;
                ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37158G6();
            } else {
                if (rxg0.m181572j().m181592o(userInfo.f19472id)) {
                    return;
                }
                ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37375w6(false);
            }
        }
    }

    /* JADX INFO: renamed from: b6 */
    public final void m161197b6() {
        duringCreated(mkd0.m154984r(rxg0.m181572j().f161456a, rxg0.m181572j().f161457b, new x9j() { // from class: l.xq30
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return nt30.m161018m3((Boolean) obj, (roj0) obj2);
            }
        })).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.zq30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204342a.m161175W7((Boolean) obj);
            }
        }));
        duringCreated(m161157T4().m39819i7()).subscribe(mkd0.m154955G(new e30() { // from class: l.ar30
            @Override // p149l.e30
            public final void call(Object obj) {
                nt30.m160972d4((TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b7 */
    public final /* synthetic */ void m161198b7(ExpandedCardStyleHelper.C7951b c7951b) {
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37253Y1(c7951b.m38115e(), c7951b.f22420c, c7951b.f22421d);
    }

    /* JADX INFO: renamed from: b8 */
    public final /* synthetic */ void m161199b8(Long l2) {
        long jLongValue = l2.longValue();
        V v2 = this.viewModel;
        if (jLongValue <= 0) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) v2).m37242V5(1);
            return;
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) v2).m37242V5(2);
        if (l2.longValue() < 3600000) {
            if (this.f140379Y != null) {
                m161113H8();
            }
            long j = l2.longValue() <= 2000 ? 500L : 2000L;
            final long jM155944o = mqi0.m155944o() + l2.longValue();
            this.f140379Y = C22306c.interval(0L, j, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.dq30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f87382a.m161194a8(jM155944o, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: b9 */
    public final boolean m161200b9() {
        return CoreModule.f17545c.f19696x0.m30196e4();
    }

    /* JADX INFO: renamed from: c5 */
    public void m161201c5() {
        this.f140370Q = null;
        this.f140368P = null;
    }

    /* JADX INFO: renamed from: c6 */
    public final void m161202c6() {
        if (!upa.m194825u2() || CoreModule.f17545c.f19663m0.f19463x0.get().booleanValue()) {
            return;
        }
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (!NullChecker.m81303a(userM169527p9) || userM169527p9.isNewUserIn24H()) {
            return;
        }
        CoreModule.f17545c.f19663m0.f19463x0.put(Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c7 */
    public final /* synthetic */ void m161203c7(final j760 j760Var) {
        if (m161157T4().m39810d6() && j760Var.f116564a != 0 && ((Integer) j760Var.f116565b).intValue() > 0 && !abi.m95617E()) {
            hd2 hd2Var = new hd2(m161157T4());
            ViewGroup viewGroupM161258o5 = m161258o5(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37385z2());
            if (viewGroupM161258o5 == null) {
                viewGroupM161258o5 = ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37385z2();
            }
            hd2Var.m130557s(f6c0.f95923o3, true).m130555q(2500L).m130564z(viewGroupM161258o5).m130538A(new hd2.InterfaceC17285c() { // from class: l.jp30
                @Override // p149l.hd2.InterfaceC17285c
                /* JADX INFO: renamed from: a */
                public final void mo130565a(String str, View view, View view2) {
                    nt30.m160917Q2(j760Var, str, view, view2);
                }
            }).m130563y(j760Var, new hd2.InterfaceC17284b() { // from class: l.kp30
                @Override // p149l.hd2.InterfaceC17284b
                /* JADX INFO: renamed from: a */
                public final void mo97843a(View view, Object obj) {
                    nt30.m160893L0(j760Var, view, (j760) obj);
                }
            });
            nd2.m158964j().m158980s(hd2Var);
        }
    }

    /* JADX INFO: renamed from: c8 */
    public final /* synthetic */ void m161204c8(Act act) {
        if (NullChecker.m81303a(this.viewModel)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37335o6(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
    }

    /* JADX INFO: renamed from: c9 */
    public final boolean m161205c9() {
        return NullChecker.m81303a(CoreModule.f17545c.f19597Q0.m173712v3());
    }

    /* JADX INFO: renamed from: d5, reason: merged with bridge method [inline-methods] */
    public final void m161257n8(Boolean bool) {
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37341q2().m20597q4(m161157T4().getString(R$string.f17842J5), true);
        if (bool.booleanValue()) {
            CoreBusinessModule.m29909z0();
        } else {
            this.f140399q.getSettingGroup().privacy.hideContacts = Boolean.FALSE;
            this.f140399q.getSettingGroup().privacy.hideMutualContacts = Boolean.TRUE;
        }
        if (IntlCountryCodeController.m28124t()) {
            if (this.f140399q.getSettingGroup().search == null) {
                this.f140399q.getSettingGroup().search = new UserSearchSettings();
            }
            this.f140399q.getSettingGroup().search.radius = 99000;
        }
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9)) {
            this.f140399q.getSettingGroup().gender = userM169527p9.settings.getSettingGroup().gender;
        }
        CoreModule.f17545c.f19663m0.m31121k8(this.f140399q.getSettingGroup()).subscribe(mkd0.m154956H(new e30() { // from class: l.pn30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150324a.m161083A6((roj0) obj);
            }
        }, new e30() { // from class: l.qn30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155378a.m161087B6((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d6 */
    public final void m161207d6() {
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).switchMap(new w9j() { // from class: l.zm30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f203691a.m161180X7((User) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.an30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70703a.m161185Y7((roj0) obj);
            }
        }));
        cxf.m109094f().m109096e(duringCreated(CoreModule.f17545c.f19639e0.m169523o9()), m161157T4(), ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37341q2(), 19);
        duringCreated(CoreModule.f17545c.f19639e0.m169556wa()).subscribe(mkd0.m154955G(new e30() { // from class: l.bn30
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19639e0.m169552va(-1);
            }
        }));
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9().filter(new w9j() { // from class: l.cn30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).hasPic());
            }
        }).map(new w9j() { // from class: l.dn30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).m60124fp().url;
            }
        }).distinctUntilChanged()).subscribe(mkd0.m154956H(new e30() { // from class: l.en30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92277a.m161190Z7((String) obj);
            }
        }, new e30() { // from class: l.fn30
            @Override // p149l.e30
            public final void call(Object obj) {
                nt30.m161080z3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d7 */
    public final /* synthetic */ void m161208d7() {
        this.f140390j = true;
        ABManager.m29328V(m161157T4());
        m161157T4().m66873d2();
    }

    /* JADX INFO: renamed from: d8 */
    public final /* synthetic */ void m161209d8(User user, Relationship relationship) {
        UssTags ussTags;
        if (NullChecker.m81303a(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2())) {
            C7994d c7994dM161211e5 = m161211e5(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37341q2().pageId(), relationship.f38806id, ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2(), user);
            c7994dM161211e5.m38487v((user == null || (ussTags = user.ussTags) == null) ? "" : ussTags.eventInfo);
            m161144P8(c7994dM161211e5, "success");
        }
        this.f140385e = true;
    }

    /* JADX INFO: renamed from: d9 */
    public boolean m161210d9(User user) {
        if (n3b0.m157742q()) {
            if (ogl0.m164227F()) {
                return ic50.m135327j().m135333f().m145226M(OmsDialog.see_guide.getIdentifier(), false);
            }
            CoreSuggested coreSuggested = CoreModule.f17545c.f19663m0;
            if (!coreSuggested.f19326C0 && coreSuggested.f19329D0.get().intValue() < 2 && qqi0.m175940h(mqi0.m155944o(), (long) user.createdTime, 2)) {
                return true;
            }
        }
        return false;
    }

    @Override // p149l.q0m
    public void destroy() {
        lqf lqfVarM151015a = lqf.m151015a();
        ExtraActLifecycle extraActLifecycle = ExtraActLifecycle.onResumeFromBackground;
        lqfVarM151015a.m151018d(extraActLifecycle, this.f140392k0);
        lqf.m151015a().m151018d(extraActLifecycle, this.f140398p0);
        mkd0.m154992z(this.f140378X);
        if (this.f140379Y != null) {
            m161113H8();
        }
        cxf.m109094f().m109095d();
    }

    /* JADX INFO: renamed from: e5 */
    public final C7994d m161211e5(String str, String str2, wsf0 wsf0Var, User user) {
        String str3;
        int size;
        int iM31122l6 = CoreModule.f17545c.f19663m0.m31122l6() - 1;
        if (!NullChecker.m81303a(user) || iM31122l6 < 0 || user.pictures.size() <= iM31122l6) {
            str3 = "";
            size = 0;
        } else {
            str3 = user.pictures.get(iM31122l6).url;
            size = user.pictures.size();
        }
        C7994d c7994dM36702h = HomeStatisticsHelper.m36702h(str, str2, wsf0Var);
        c7994dM36702h.m38461B(str3);
        c7994dM36702h.m38491z(iM31122l6);
        c7994dM36702h.m38460A(size);
        return c7994dM36702h;
    }

    /* JADX INFO: renamed from: e6 */
    public final void m161212e6() {
        if (gr9.m127684i()) {
            CoreModule.f17545c.f19668n2.m175433J3(CoreModule.m29931H().userId());
        }
    }

    /* JADX INFO: renamed from: e7 */
    public final /* synthetic */ void m161213e7(Integer num) {
        m161157T4().dialog().m20500D(R$string.f18096Rj).m20496B(false).m20556t0(R$string.f18715m, new Runnable() { // from class: l.do30
            @Override // java.lang.Runnable
            public final void run() {
                this.f87126a.m161208d7();
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: e8 */
    public final /* synthetic */ void m161214e8(User user, Throwable th) {
        if (NullChecker.m81303a(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2())) {
            m161140O8(m161211e5(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37341q2().pageId(), "", ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2(), user), th);
        }
        this.f140385e = true;
        lsi0.m151570H(m161157T4().getResources().getString(R$string.f18804oq), m161157T4().getResources().getDrawable(x2c0.f190665vu), m161157T4().getResources().getDrawable(x2c0.f190662vr));
    }

    /* JADX INFO: renamed from: e9 */
    public void m161215e9() {
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        if (NullChecker.m81303a(userM169520na)) {
            if (NullChecker.m81303a(this.f140351G0) && this.f140351G0.m211693N()) {
                return;
            }
            m161167V4(userM169520na);
        }
    }

    /* JADX INFO: renamed from: f5 */
    public ArrayList<j760<String, d30>> m161216f5() {
        return DebugUtil.m59235xj((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel, this);
    }

    /* JADX INFO: renamed from: f6 */
    public final boolean m161217f6(NewNewHomeFrag newNewHomeFrag, CoreSuggested.UserInfo userInfo) {
        if (!NullChecker.m81303a(userInfo) || userInfo.f19472id.equals(CoreSuggested.UserInfo.VIRTUAL_CARD)) {
            return false;
        }
        User userM141745d = NullChecker.m81303a(newNewHomeFrag.f21678C.m37125A2().mo38818o()) ? newNewHomeFrag.f21678C.m37125A2().mo38818o().m141745d() : null;
        if (NullChecker.m81303a(userM141745d)) {
            return rxg0.m181572j().m181578A(userM141745d);
        }
        return false;
    }

    /* JADX INFO: renamed from: f7 */
    public final /* synthetic */ void m161218f7(Optional optional) {
        if (optional.isPresent() && ((Boolean) optional.get()).booleanValue()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37293g3(((Boolean) optional.get()).booleanValue());
        }
    }

    /* JADX INFO: renamed from: f9 */
    public final void m161219f9() {
        wvv.m205772l(m161157T4(), new PermissionHelper.InterfaceC13129b() { // from class: l.go30
            @Override // com.p046p1.mobile.putong.p065ui.permission.PermissionHelper.InterfaceC13129b
            /* JADX INFO: renamed from: a */
            public final void mo79906a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                this.f103650a.m161272r8(z, permissionDeniedReason);
            }
        }, new DialogInterface.OnCancelListener() { // from class: l.ho30
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f108772a.m161276s8(dialogInterface);
            }
        }, new Runnable() { // from class: l.io30
            @Override // java.lang.Runnable
            public final void run() {
                this.f114098a.m161280t8();
            }
        }, new d30() { // from class: l.jo30
            @Override // p149l.d30
            public final void call() {
                ygh0.m214695n0(ygh0.f198173h);
            }
        });
    }

    /* JADX INFO: renamed from: g5 */
    public void m161220g5() {
        this.f140384d = true;
    }

    /* JADX INFO: renamed from: g6 */
    public boolean m161221g6(String str) {
        return TextUtils.equals(f140336V0, str);
    }

    /* JADX INFO: renamed from: g7 */
    public final /* synthetic */ void m161222g7(Boolean bool) {
        if (bool.booleanValue() && NullChecker.m81303a(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).f21904U) && NullChecker.m81303a(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).f21904U.mo126604o()) && xdl0.m208349O0(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).f21904U.mo126604o())) {
            lli.m150483a().m150484b(m161157T4(), ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).f21904U.mo126604o());
        }
    }

    /* JADX INFO: renamed from: g8 */
    public final /* synthetic */ void m161223g8(String str, int i, C4319c c4319c) {
        if (NullChecker.m81303a(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2())) {
            CoreSuggested.UserInfo userInfoMo38813j = ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38813j();
            if (NullChecker.m81303a(userInfoMo38813j) && TextUtils.equals(str, userInfoMo38813j.f19472id)) {
                if (i != SwipeDirection.UP.getValue()) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38801A(SwipeDirection.fromValue(i));
                } else if (((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38808c(false)) {
                    m160956Z8("p_profile,superlike");
                    m161233i9(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g9 */
    public final void m161224g9(Act act, User user) {
        if (CoreModule.f17545c.f19627a0.m171572v3(user) || CoreModule.f17545c.f19627a0.m171571u3(user)) {
            return;
        }
        if (TEnum.equals(user.source, "facebook") && CoreModule.f17545c.f19639e0.f149304X2.get().booleanValue()) {
            new ccn(act).m106131Z();
            CoreModule.f17545c.f19639e0.f149304X2.put(Boolean.FALSE);
        } else if (TEnum.equals(user.source, "google") && CoreModule.f17545c.f19639e0.f149320Z2.get().booleanValue()) {
            new ccn(act).m106131Z();
            CoreModule.f17545c.f19639e0.f149320Z2.put(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: h5, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m161280t8() {
        wvv.m205765e();
        m161253m9();
        if (this.f140354I) {
            this.f140354I = false;
            this.f140391k.m132487l(roj0.f160388a);
        }
        e51.m114743H(m161157T4(), new Runnable() { // from class: l.rp30
            @Override // java.lang.Runnable
            public final void run() {
                this.f160472a.m161091C6();
            }
        }, 400L);
    }

    /* JADX INFO: renamed from: h6 */
    public final boolean m161226h6(CoreSuggested.UserInfo userInfo) {
        return NullChecker.m81303a(userInfo) && CoreModule.f17545c.f19663m0.m31020L6(userInfo.f19472id);
    }

    /* JADX INFO: renamed from: h7 */
    public final /* synthetic */ void m161227h7(GrowthSpamInfo growthSpamInfo) {
        if (growthSpamInfo.pop) {
            ke7.m145732o().m145741E(m161157T4(), false, ke7.m145733r());
        }
    }

    /* JADX INFO: renamed from: h8 */
    public final /* synthetic */ void m161228h8(ArrayList arrayList, String str, roj0 roj0Var) {
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37341q2().m20599s4();
        CoreModule.f17545c.f19639e0.m169552va(App.f15373i.get().intValue());
        ark.m98453V0(m161157T4(), false, (Media) arrayList.get(0), m161157T4().string(R$string.f18491el), new Runnable() { // from class: l.vp30
            @Override // java.lang.Runnable
            public final void run() {
                nt30.m160954Z2();
            }
        });
        if (TextUtils.equals(str, "fake_to_good_dlg")) {
            ygh0.m214648G();
        } else if (TextUtils.equals(str, "fakeView")) {
            ygh0.m214703v();
        }
    }

    /* JADX INFO: renamed from: h9 */
    public final void m161229h9(int i, List<String> list) {
        if (m161157T4().isDialogShowing() || CoreModule.f17545c.f19663m0.f19326C0 || b0d0.m99749d0()) {
            return;
        }
        CoreSuggested coreSuggested = CoreModule.f17545c.f19663m0;
        coreSuggested.f19326C0 = true;
        tpd0 tpd0Var = coreSuggested.f19329D0;
        tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        if (ogl0.m164227F()) {
            ic50.m135327j().m135333f().m145241b0(OmsDialog.see_guide.getIdentifier(), 0, false);
        }
        ok3.m164810I(m161157T4(), i, list);
        CoreModule.f17545c.f19663m0.f19469z0 = 0;
    }

    /* JADX INFO: renamed from: i5 */
    public void m161230i5() {
        if (NullChecker.m81303a(this.f140351G0)) {
            User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
            if (NullChecker.m81303a(userM169520na)) {
                return;
            }
            if (CoreModule.f17545c.f19627a0.m171573w3(userM169520na) || CoreModule.f17545c.f19627a0.m171571u3(userM169520na)) {
                this.f140351G0.m211682C();
                this.f140351G0 = null;
            }
        }
    }

    /* JADX INFO: renamed from: i7 */
    public final /* synthetic */ void m161231i7(GrowthSpamInfo growthSpamInfo) {
        if (growthSpamInfo.pop) {
            ke7.m145732o().m145741E(m161157T4(), true, false);
        }
    }

    /* JADX INFO: renamed from: i8 */
    public final /* synthetic */ void m161232i8(Throwable th) {
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37341q2().m20599s4();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: i9 */
    public boolean m161233i9(boolean z) {
        return m161238j9(z, false);
    }

    /* JADX INFO: renamed from: j5 */
    public void m161234j5() {
        SettingGroups settingGroups = new SettingGroups();
        UserSearchSettings userSearchSettings = new UserSearchSettings();
        settingGroups.search = userSearchSettings;
        userSearchSettings.autoAdjustRadius = Boolean.TRUE;
        CoreModule.f17545c.f19663m0.m31121k8(settingGroups).subscribe(mkd0.m154956H(new e30() { // from class: l.tp30
            @Override // p149l.e30
            public final void call(Object obj) {
                nt30.m160869F1((roj0) obj);
            }
        }, new e30() { // from class: l.up30
            @Override // p149l.e30
            public final void call(Object obj) {
                nt30.m160871F3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j6 */
    public boolean m161235j6(String str) {
        return (TextUtils.isEmpty(this.f140368P) || !this.f140368P.equals(str) || TextUtils.isEmpty(this.f140370Q)) ? false : true;
    }

    /* JADX INFO: renamed from: j7 */
    public final /* synthetic */ void m161236j7(GrowthSpamInfo growthSpamInfo) {
        if (growthSpamInfo.pop) {
            if (vy8.m200615m()) {
                ke7.m145732o().m145741E(m161157T4(), false, ke7.m145733r());
            } else {
                ke7.m145732o().m145741E(m161157T4(), true, false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x01fb  */
    /* JADX INFO: renamed from: j9 */
    public boolean m161238j9(boolean z, boolean z2) {
        User user;
        C7994d c7994dM36698d;
        UssTags ussTags;
        boolean z3;
        int iM31122l6;
        String str = "";
        if (z) {
            c7994dM36698d = HomeStatisticsHelper.m36698d(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2() == null ? null : ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38818o(), true, this.f140387g, SwipeDirection.UP, ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2());
            user = null;
        } else {
            User userM31142r8 = CoreModule.f17545c.f19663m0.m31142r8();
            C7994d c7994dM36702h = HomeStatisticsHelper.m36702h(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37341q2().pageId(), userM31142r8 == null ? "" : userM31142r8.f56011id, ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2());
            c7994dM36702h.m38487v((userM31142r8 == null || (ussTags = userM31142r8.ussTags) == null) ? "" : ussTags.eventInfo);
            user = userM31142r8;
            c7994dM36698d = c7994dM36702h;
        }
        int size = 0;
        if (CoreModule.f17545c.f19639e0.m169527p9().isJailed()) {
            m160956Z8(null);
            CoreModule.m29932K().startJailedDialogLikeAct();
            m161144P8(c7994dM36698d, "failJailedUser");
            return false;
        }
        if (CoreModule.f17545c.f19639e0.m169486f8()) {
            m160956Z8(null);
            qwp.m176882i().m176888n(m161157T4(), true);
            return false;
        }
        KeyEvent.Callback callbackMo38809d = ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38809d();
        if (!NullChecker.m81303a(callbackMo38809d) || (((callbackMo38809d instanceof d5m) && ((d5m) callbackMo38809d).mo36902k0()) || !this.f140385e)) {
            return false;
        }
        if (z) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38801A(SwipeDirection.UP);
            return false;
        }
        Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
        CounterLikeLimit counterLikeLimit = counterM31484o3.likeLimit;
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterM31484o3.undoLimit;
        if ((((long) (counterSuperlikeAndUndoLimit.reset * 1000)) + counterLikeLimit.serverTime) - qib0.f154693H.guessedCurrentServerTime() > 0 && counterSuperlikeAndUndoLimit.remainToday() == 0) {
            C8764c.m53412M1(m161157T4(), "p_home,undo", Privilege.vip_undo, null, null, false, CoreModule.f17545c.f19663m0.m31142r8());
        } else if (m161243k9()) {
            CoreSuggested.UserInfo userInfoM31145s8 = CoreModule.f17545c.f19663m0.m31145s8();
            if (!q8p.m173425i() || !q8p.INSTANCE.m173437l()) {
                if (this.f140385e && CoreModule.f17545c.f19663m0.m31145s8().canUndo) {
                    if (!n3b0.m157742q() || !NullChecker.m81303a(CoreModule.f17545c.f19663m0.f19343H2.m221515e()) || CoreModule.f17545c.f19663m0.f19343H2.m221515e().f153135a.isEmpty() || !CoreModule.f17545c.f19663m0.f19343H2.m221515e().f153135a.get(0).equals(userInfoM31145s8.f19472id)) {
                        this.f140347E0.run();
                    } else if (C4729a0.m31387j().f19525d.get().isEmpty()) {
                        C4729a0.m31387j().f19525d.put(userInfoM31145s8.f19472id);
                        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
                        userInfo.f19472id = userInfoM31145s8.f19472id;
                        userInfo.canUndo = true;
                        userInfo.preSwipedDirection = SwipeDirection.LEFT;
                        CoreModule.f17545c.f19663m0.m31154w6(userInfo, 0);
                    } else {
                        xnj0.m210172a(m161157T4());
                    }
                    z3 = true;
                }
                boolean z4 = z3;
                if (!z3) {
                    iM31122l6 = CoreModule.f17545c.f19663m0.m31122l6() - 1;
                    if (NullChecker.m81303a(user) && iM31122l6 >= 0 && user.pictures.size() > iM31122l6) {
                        str = user.pictures.get(iM31122l6).url;
                        size = user.pictures.size();
                    }
                    c7994dM36698d.m38461B(str);
                    c7994dM36698d.m38491z(iM31122l6);
                    c7994dM36698d.m38460A(size);
                    m161144P8(c7994dM36698d, "failUndoLocal");
                }
                return z4;
            }
            lsi0.m151580j(m161157T4().getString(R$string.f18544gc));
        } else if (q8p.m173425i() && q8p.INSTANCE.m173437l()) {
            lsi0.m151580j(m161157T4().getString(R$string.f18544gc));
        } else {
            xnj0.m210172a(m161157T4());
        }
        z3 = false;
        boolean z5 = z3;
        if (!z3) {
            iM31122l6 = CoreModule.f17545c.f19663m0.m31122l6() - 1;
            if (NullChecker.m81303a(user)) {
                str = user.pictures.get(iM31122l6).url;
                size = user.pictures.size();
            }
            c7994dM36698d.m38461B(str);
            c7994dM36698d.m38491z(iM31122l6);
            c7994dM36698d.m38460A(size);
            m161144P8(c7994dM36698d, "failUndoLocal");
        }
        return z5;
    }

    /* JADX INFO: renamed from: k5 */
    public final void m161239k5() {
        long jCurrentTimeMillis = this.f140371Q0 - System.currentTimeMillis();
        if (jCurrentTimeMillis < 0 && jCurrentTimeMillis > -7200000) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37256Y5(2);
            return;
        }
        if (jCurrentTimeMillis > 86400000 || jCurrentTimeMillis < -7200000) {
            this.f140371Q0 = adi0.INSTANCE.m95899d();
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37256Y5(1);
    }

    /* JADX INFO: renamed from: k6 */
    public boolean m161240k6() {
        return this.f140353H0;
    }

    /* JADX INFO: renamed from: k7 */
    public final /* synthetic */ void m161241k7(roj0 roj0Var) {
        ke7.m145732o().m145742m(m161157T4());
    }

    /* JADX INFO: renamed from: k9 */
    public final boolean m161243k9() {
        return NullChecker.m81303a(CoreModule.f17545c.f19663m0.m31142r8());
    }

    /* JADX INFO: renamed from: l5 */
    public int m161244l5() {
        return this.f140382b;
    }

    /* JADX INFO: renamed from: l6 */
    public boolean m161245l6() {
        return this.f140359K0;
    }

    /* JADX INFO: renamed from: l7 */
    public final /* synthetic */ Boolean m161246l7(Boolean bool) {
        return Boolean.valueOf(bool.booleanValue() && NullChecker.m81304b(m161157T4()) && !m161157T4().isDialogShowing());
    }

    /* JADX INFO: renamed from: l9 */
    public void m161248l9(e30<roj0> e30Var, e30<Throwable> e30Var2) {
        this.f140391k.m132487l(roj0.f160388a);
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37341q2().m20597q4(m161157T4().getString(R$string.f17842J5), true);
        CoreModule.f17545c.f19663m0.m31121k8(this.f140399q.getSettingGroup()).subscribe(mkd0.m154956H(e30Var, e30Var2));
    }

    /* JADX INFO: renamed from: m5 */
    public String m161249m5() {
        return this.f140381a;
    }

    /* JADX INFO: renamed from: m6 */
    public boolean m161250m6() {
        return this.f140345D;
    }

    /* JADX INFO: renamed from: m7 */
    public final /* synthetic */ void m161251m7(Boolean bool) {
        if (NullChecker.m81303a(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2()) && NullChecker.m81303a(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38809d()) && (((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38809d() instanceof d5m)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37210Q2();
            mah0 mah0VarM153729s0 = mah0.m153729s0();
            V v2 = this.viewModel;
            mah0VarM153729s0.m153769h0((ViewTreeObserverOnGlobalLayoutListenerC7866b) v2, (d5m) ((ViewTreeObserverOnGlobalLayoutListenerC7866b) v2).m37125A2().mo38809d());
            return;
        }
        if (NullChecker.m81303a(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2()) && NullChecker.m81303a(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38809d()) && (((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38809d() instanceof e5m)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37210Q2();
            mah0 mah0VarM153729s1 = mah0.m153729s0();
            V v3 = this.viewModel;
            mah0VarM153729s1.m153770i0((ViewTreeObserverOnGlobalLayoutListenerC7866b) v3, (e5m) ((ViewTreeObserverOnGlobalLayoutListenerC7866b) v3).m37125A2().mo38809d());
        }
    }

    /* JADX INFO: renamed from: m8 */
    public final /* synthetic */ void m161252m8() {
        this.f140403u++;
    }

    /* JADX INFO: renamed from: m9 */
    public void m161253m9() {
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37238V1(true);
    }

    /* JADX INFO: renamed from: n5 */
    public String m161254n5() {
        return this.f140355I0;
    }

    /* JADX INFO: renamed from: n6 */
    public boolean m161255n6() {
        return this.f140344C;
    }

    /* JADX INFO: renamed from: n7 */
    public final /* synthetic */ void m161256n7(roj0 roj0Var) {
        if (m161157T4().isDialogShowing()) {
            m161157T4().onDialogDismissExtra(new d30() { // from class: l.so30
                @Override // p149l.d30
                public final void call() {
                    CoreModule.f17545c.f19663m0.m31143s6("initiative", "suggest", null);
                }
            });
        } else {
            CoreModule.f17545c.f19663m0.m31143s6("initiative", "suggest", null);
        }
        CoreModule.f17545c.f19663m0.f19408e2.m34205E3();
    }

    /* JADX INFO: renamed from: o5 */
    public ViewGroup m161258o5(ViewGroup viewGroup) {
        ViewParent parent = viewGroup.getParent();
        if (parent == null) {
            return null;
        }
        if (viewGroup != m161157T4().getWindow().getDecorView()) {
            if (!(parent instanceof ViewGroup)) {
                return null;
            }
            ViewGroup viewGroup2 = (ViewGroup) parent;
            if (viewGroup2.getId() != u4c0.f174563y4) {
                return m161258o5(viewGroup2);
            }
        }
        return viewGroup;
    }

    /* JADX INFO: renamed from: o6 */
    public boolean m161259o6() {
        return this.f140343B;
    }

    /* JADX INFO: renamed from: o7 */
    public final /* synthetic */ void m161260o7(ActionData actionData) {
        int i;
        du2.m113670a("[See_Toast]", "switch back: " + actionData.toJson());
        if (qib0.f154693H.guessedCurrentServerTime() - actionData.dataTime >= TimeUnit.SECONDS.toMillis(upa.m194837x() ? upa.m194729b1() : 9)) {
            qug0.m176610g().m176613d(null, false, SuggesterReason.WEAK_NETWORK.getReason(), actionData);
            return;
        }
        if ("immediately".equals(actionData.pageFormat.showRules)) {
            SuggestersAct.m43592b2(m161157T4(), actionData.pageFormat);
        } else if (!TextUtils.isEmpty(actionData.toastStyle.title)) {
            du2.m113670a("[See_Toast]", "start show toast: " + actionData.traceId);
            qug0.m176610g().m176617k((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel, actionData);
        } else if (!TextUtils.isEmpty(actionData.toast.message)) {
            qug0.m176610g().m176618l((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel, actionData.toast);
        }
        if (vwb.m200296J(actionData.insertFormat.insertPosition)) {
            return;
        }
        for (ActionInsertPosition actionInsertPosition : actionData.insertFormat.insertPosition) {
            int i2 = actionInsertPosition.position;
            if (!NullChecker.m81303a(this.f140393l.m221515e()) || vwb.m200296J(this.f140393l.m221515e().loaded)) {
                i = -1;
                break;
            }
            i = 0;
            while (true) {
                if (i >= this.f140393l.m221515e().loaded.size()) {
                    i = -1;
                    break;
                } else if (actionInsertPosition.userId.equals(this.f140393l.m221515e().loaded.get(i).f19472id)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0 && i <= i2) {
                i2 = i;
            }
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.f19472id = actionInsertPosition.userId;
            if (!NullChecker.m81303a(actionInsertPosition.cityCData) || TextUtils.isEmpty(actionInsertPosition.cityCData.userId)) {
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
            if (actionInsertPosition.cardStyle.label.contains("liked_me") && (!ura.m195053e().m195055b().mo33649wf() || (NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169524oa(userInfo.f19472id)) && CoreModule.f17545c.f19639e0.m169524oa(userInfo.f19472id).isFemale() && !CoreModule.f17545c.f19639e0.m169524oa(userInfo.f19472id).superLikedMe() && !CoreModule.f17545c.f19639e0.m169524oa(userInfo.f19472id).letter()))) {
                userInfo.hasLikeMeSlideCardTop = true;
            }
            if (actionInsertPosition.likedMe.label.contains("liked_me") && !ura.m195053e().m195055b().mo33649wf()) {
                userInfo.hasLikeMeSlideCardBottom = true;
            }
            CoreModule.f17545c.f19663m0.m31146t6(userInfo, i2, true);
        }
    }

    /* JADX INFO: renamed from: o8 */
    public final /* synthetic */ void m161261o8() {
        this.f140391k.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: p6 */
    public boolean m161262p6() {
        return this.f140342A;
    }

    /* JADX INFO: renamed from: p7 */
    public final /* synthetic */ void m161263p7(roj0 roj0Var) {
        if (NullChecker.m81303a(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2()) && NullChecker.m81303a(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38809d())) {
            V v2 = this.viewModel;
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) v2).m37179K6(((ViewTreeObserverOnGlobalLayoutListenerC7866b) v2).m37125A2().mo38809d());
        }
    }

    /* JADX INFO: renamed from: p8 */
    public final /* synthetic */ void m161264p8(NewMainBaseAct newMainBaseAct) {
        if (wvv.m205776p(newMainBaseAct)) {
            m161121J8();
            return;
        }
        if (!wvv.m205773m()) {
            wvv.m205765e();
        }
        if (PermissionHelper.m79881b("android.permission.READ_CONTACTS")) {
            this.f140391k.m132487l(roj0.f160388a);
        } else {
            e51.m114741F(newMainBaseAct, new Runnable() { // from class: l.eq30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f92759a.m161261o8();
                }
            });
        }
    }

    /* JADX INFO: renamed from: q5 */
    public final void m161265q5(User user, boolean z) {
        if (TEnum.equals(user.source, "google") || TEnum.equals(user.source, "facebook")) {
            m161224g9(m161157T4(), user);
            return;
        }
        TTCMigrateGuideConfig tTCMigrateGuideConfigM194756g3 = upa.m194756g3();
        if (z && NullChecker.m81303a(tTCMigrateGuideConfigM194756g3) && CoreModule.f17545c.f19627a0.m171566F3(tTCMigrateGuideConfigM194756g3) && !CoreModule.f17545c.f19627a0.m171573w3(user) && !CoreModule.f17545c.f19627a0.m171571u3(user)) {
            int i = tTCMigrateGuideConfigM194756g3.dlgType;
            xy2 xy2Var = new xy2(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).act());
            this.f140351G0 = xy2Var;
            xy2Var.m211717l0(tTCMigrateGuideConfigM194756g3);
            CoreModule.f17545c.f19627a0.f151418S.put(Long.valueOf((((long) tTCMigrateGuideConfigM194756g3.frequency) * 1000) + mqi0.m155944o()));
            CoreModule.f17545c.f19627a0.f151419T.put(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: q6 */
    public boolean m161266q6() {
        return this.f140408z;
    }

    /* JADX INFO: renamed from: q7 */
    public final /* synthetic */ void m161267q7(j760 j760Var) {
        if (!CoreModule.f17545c.f19654j0.m30604Q4() || CoreModule.f17545c.f19654j0.f19294g0) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37218R5(false);
        } else {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37287f2();
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37218R5(true);
        }
    }

    /* JADX INFO: renamed from: q8 */
    public final /* synthetic */ void m161268q8(C22392a c22392a, Throwable th) {
        CoreModule.f17545c.f19663m0.m31113i8();
        if ((c22392a.m221515e() == null || ((PartialListOpt) c22392a.m221515e()).loaded.size() == 0) && ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37176K3()) {
            this.f140359K0 = true;
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37184L5(true, false);
        }
    }

    /* JADX INFO: renamed from: r5 */
    public void m161269r5() {
        if (!xij0.m209661d0() || m161157T4().lifecycle_() != C4319c.f15548i || ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37135C3() || ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37341q2().isHidden()) {
            return;
        }
        Object objMo38809d = ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2() == null ? null : ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38809d();
        if (NullChecker.m81303a(objMo38809d) && (objMo38809d instanceof d5m)) {
            d5m d5mVar = (d5m) objMo38809d;
            if (d5mVar.mo36947y()) {
                d5mVar.mo36822I();
            }
        }
    }

    /* JADX INFO: renamed from: r6 */
    public final /* synthetic */ void m161270r6(Long l2) {
        m161239k5();
    }

    /* JADX INFO: renamed from: r7 */
    public final /* synthetic */ void m161271r7(Throwable th) {
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37218R5(false);
        String.format("start freeTrial anim error: %s", th.getMessage());
    }

    /* JADX INFO: renamed from: r8 */
    public final /* synthetic */ void m161272r8(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        if (permissionDeniedReason == PermissionHelper.PermissionDeniedReason.Null) {
            ygh0.m214691l0(ygh0.f198173h);
        } else {
            ygh0.m214693m0(ygh0.f198173h, wvv.m205774n(m161157T4()) ? BLiveOperationTitleShowType.off : "on");
        }
        m161280t8();
    }

    /* JADX INFO: renamed from: s5 */
    public void m161273s5(String str) {
        if (m161157T4().lifecycle_() != C4319c.f15548i || ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37135C3() || ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37341q2().isHidden() || !((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37276c6()) {
            return;
        }
        if (((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37233U2(str + " by:handleShowButtons ")) {
            return;
        }
        if (C8609a.f32670f) {
            C8609a.f32670f = false;
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37286e6();
        }
        if (e2s.m114523d()) {
            e2s.m114524e(false);
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37286e6();
        }
    }

    /* JADX INFO: renamed from: s6 */
    public final /* synthetic */ void m161274s6(roj0 roj0Var) {
        this.f140353H0 = false;
        this.f140396o.m132487l(Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s7 */
    public final /* synthetic */ void m161275s7(j760 j760Var) {
        if (((Boolean) j760Var.f116564a).booleanValue()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37212Q5(true);
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37277d2();
        }
        if (((Boolean) j760Var.f116565b).booleanValue()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37212Q5(true);
        }
    }

    /* JADX INFO: renamed from: s8 */
    public final /* synthetic */ void m161276s8(DialogInterface dialogInterface) {
        m161280t8();
    }

    /* JADX INFO: renamed from: t5, reason: merged with bridge method [inline-methods] */
    public void m161247l8() {
        tpd0 tpd0Var = this.f140401s;
        tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        this.f140402t.put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: t6 */
    public final /* synthetic */ void m161278t6(Throwable th) {
        this.f140353H0 = false;
        this.f140396o.m132487l(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: t7 */
    public final /* synthetic */ Boolean m161279t7(CoreLikers.C4719a c4719a) {
        return Boolean.valueOf(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).act().m39812e6(TabName.Card) && c4719a.f19270b > 0 && !f140340Z0.get().booleanValue() && this.f140346E && !nkp.m159984c());
    }

    /* JADX INFO: renamed from: u5 */
    public final void m161281u5() {
        if (y19.m212158R()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("https://fe-static.tancdn.com/v1/raw/5266f729-e0ff-4677-96f9-09373278f58214.svga");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/8eda1a11-5419-4a73-a3bd-6b54d258c50a14.svga");
            SVGALoader.with(App.f15369e).batchDownload(arrayList);
        }
    }

    /* JADX INFO: renamed from: u6 */
    public final /* synthetic */ Boolean m161282u6(j760 j760Var) {
        return Boolean.valueOf(this.f140361L0 == 1);
    }

    /* JADX INFO: renamed from: u7 */
    public final /* synthetic */ void m161283u7(CoreLikers.C4719a c4719a) {
        if (vwb.m200296J(c4719a.f19272d)) {
            return;
        }
        User user = c4719a.f19272d.get(0);
        String string = m161157T4().getResources().getString(R$string.f18039Pm);
        boolean zM28122r = IntlCountryCodeController.m28122r();
        V v2 = this.viewModel;
        if (zM28122r) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) v2).m37365u6(user.m60124fp().url, string, ShareConstants.OLD_VERSION, c4719a.f19271c, c4719a.f19270b, c4719a.f19275g, user.location.updatedTime, null);
            f140340Z0.put(Boolean.TRUE);
        } else {
            f7e0 f7e0Var = new f7e0((ViewTreeObserverOnGlobalLayoutListenerC7866b) v2, user.m60124fp().url, string, c4719a.f19271c, c4719a.f19270b, c4719a.f19275g, user.location.updatedTime, ShareConstants.OLD_VERSION);
            f7e0Var.m120965s(new d30() { // from class: l.sp30
                @Override // p149l.d30
                public final void call() {
                    nt30.f140340Z0.put(Boolean.TRUE);
                }
            });
            f7e0Var.m96808x(CorePopLevel.INTL_SEE_ANIM_BUBBLE);
            hdb0.m130575c().m130582i(f7e0Var);
        }
    }

    /* JADX INFO: renamed from: u8 */
    public final void m161284u8(long j) {
        if (j - mqi0.m155944o() <= 500) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37242V5(1);
            m161157T4().post(new Runnable() { // from class: l.fq30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f98761a.m161113H8();
                }
            });
        }
    }

    /* JADX INFO: renamed from: v5 */
    public final void m161285v5() {
        if (upa.m194776k3()) {
            duringCreated(v930.m197537k().distinctUntilChanged().filter(new w9j() { // from class: l.lq30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Card);
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.mq30
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19663m0.m31003H5();
                }
            }));
            lqf.m151015a().m151016b(ExtraActLifecycle.onResumeFromBackground, new e30() { // from class: l.oq30
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19663m0.m31003H5();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v6 */
    public final /* synthetic */ void m161286v6(j760 j760Var) {
        StringBuilder sb = new StringBuilder("checkIntro error, local has user me is " + NullChecker.m81303a(j760Var.f116565b));
        sb.append(", ");
        if (!NullChecker.m81303a(j760Var.f116564a) || vwb.m200296J(((q860) j760Var.f116564a).f153135a)) {
            sb.append("local has no conversations");
        } else {
            for (int i = 0; i < ((q860) j760Var.f116564a).f153135a.size() && i < 5; i++) {
                String str = ((Conversation) ((q860) j760Var.f116564a).f153135a.get(i)).f56011id;
                sb.append("cid-");
                sb.append(str);
                sb.append(" : ");
                if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169430Pa(str))) {
                    sb.append("1");
                } else {
                    sb.append("0");
                }
            }
        }
        CrashHelper.m81296c(new Exception(sb.toString()));
        this.f140361L0 = 0;
    }

    /* JADX INFO: renamed from: v7 */
    public final /* synthetic */ void m161287v7(roj0 roj0Var) {
        if (m161157T4().isDialogShowing() || !mgj.m154567a()) {
            return;
        }
        CoreModule.f17545c.f19663m0.f19341H0.put(Long.valueOf(mqi0.m155944o()));
        CoreModule.f17545c.f19663m0.f19338G0 = 0;
    }

    /* JADX INFO: renamed from: v8 */
    public void m161288v8() {
        duringCreated(CoreModule.f17545c.f19700y1.m174006f3()).subscribe(mkd0.m154956H(new e30() { // from class: l.bq30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76752a.m161199b8((Long) obj);
            }
        }, new e30() { // from class: l.cq30
            @Override // p149l.e30
            public final void call(Object obj) {
                nt30.m160957a1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w5 */
    public final void m161289w5() {
        duringCreated(CoreModule.f17545c.f19663m0.f19346I2).filter(new w9j() { // from class: l.yr30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                j760 j760Var = (j760) obj;
                return Boolean.valueOf(NullChecker.m81303a(j760Var) && NullChecker.m81303a(j760Var.f116564a));
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.zr30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204454a.m161095D6((j760) obj);
            }
        }));
        if (CoreModule.m29934N().mo60267Co() || upa.m194649I2() || g6a.m124570s()) {
            duringCreated(CoreModule.f17545c.f19678r0.f20028i0).subscribe(mkd0.m154955G(new e30() { // from class: l.as30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f71381a.m161103F6((String) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: w6 */
    public final /* synthetic */ void m161290w6() {
        if (this.f140389i) {
            this.f140389i = false;
            m161182Y4();
        }
    }

    /* JADX INFO: renamed from: w7 */
    public final /* synthetic */ void m161291w7(CoreLikers.C4719a c4719a) {
        CoreModule.f17545c.f19663m0.f19368R0.m132487l(Boolean.FALSE);
        if (NullChecker.m81303a(c4719a) && NullChecker.m81303a(c4719a.f19273e) && !c4719a.f19273e.isEmpty()) {
            User user = c4719a.f19273e.get(0);
            if (this.f140366O == null) {
                this.f140366O = new dej();
            }
            CoreModule.f17545c.f19663m0.f19363P0.put(Long.valueOf(mqi0.m155944o()));
            tpd0 tpd0Var = CoreModule.f17545c.f19663m0.f19365Q0;
            tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
            this.f140366O.m111267j(m161157T4(), user);
        }
    }

    /* JADX INFO: renamed from: w8 */
    public void m161292w8() {
        this.f140359K0 = false;
    }

    /* JADX INFO: renamed from: x5 */
    public final void m161293x5() {
        if (upa.m194742e()) {
            duringCreated(mkd0.m154986t(CoreModule.f17545c.f19663m0.m31066W8(), CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip")), CoreModule.f17545c.f19552B0.m31611j4(), CoreModule.f17545c.f19663m0.f19430m0, new z9j() { // from class: l.il30
                @Override // p149l.z9j
                /* JADX INFO: renamed from: b */
                public final Object mo100621b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return nt30.m160905O0((PartialListOpt) obj, (UserPrivilege) obj2, (VerificationCenter) obj3, (Long) obj4);
                }
            })).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.jl30
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19704z2.m30247j3();
                }
            }, new e30() { // from class: l.kl30
                @Override // p149l.e30
                public final void call(Object obj) {
                    nt30.m160907O3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: x6 */
    public final /* synthetic */ void m161294x6() {
        e51.m114743H(m161157T4(), new Runnable() { // from class: l.aq30
            @Override // java.lang.Runnable
            public final void run() {
                this.f71125a.m161290w6();
            }
        }, 400L);
    }

    /* JADX INFO: renamed from: x7 */
    public final /* synthetic */ void m161295x7(Boolean bool) {
        if (bool.booleanValue()) {
            u0n.m191357p(m161157T4());
        } else {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38801A(SwipeDirection.RIGHT);
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37329n6();
        }
    }

    /* JADX INFO: renamed from: x8 */
    public void m161296x8(int i, final int i2, Intent intent) {
        if (i == 18 && NullChecker.m81303a(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2())) {
            this.f140386f = true;
            SwipeDirection swipeDirection = SwipeDirection.RIGHT;
            if (i2 == swipeDirection.getValue() || i2 == SwipeDirection.LEFT.getValue() || i2 == SwipeDirection.UP.getValue()) {
                m161157T4().f24439p = true;
            }
            jj4 jj4VarMo38818o = ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38818o();
            if (NullChecker.m81303a(jj4VarMo38818o) && NullChecker.m81303a(jj4VarMo38818o.m141745d())) {
                final String str = jj4VarMo38818o.m141745d().f56011id;
                if (i2 == swipeDirection.getValue() || i2 == SwipeDirection.LEFT.getValue() || i2 == SwipeDirection.UP.getValue()) {
                    this.f140387g = true;
                    lifecycle().takeFirst(new w9j() { // from class: l.ln30
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
                        }
                    }).subscribe(mkd0.m154955G(new e30() { // from class: l.mn30
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f134730a.m161223g8(str, i2, (C4319c) obj);
                        }
                    }));
                    return;
                } else {
                    if (g6a.m124570s() && i2 == 153) {
                        psd0.INSTANCE.m171136a(m161157T4(), jj4VarMo38818o.m141745d(), true);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (i == 19) {
            if (i2 == -1) {
                m161089B8((ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h), intent.getStringExtra("from"));
                return;
            }
            return;
        }
        if (i != 3002 || i2 != -1) {
            if (i == 23 && intent != null && intent.getBooleanExtra("from_sign_up", false)) {
                m161177X4();
                m161257n8(Boolean.FALSE);
                if (wvv.m205776p(m161157T4())) {
                    m161121J8();
                    return;
                } else {
                    this.f140391k.m132487l(roj0.f160388a);
                    return;
                }
            }
            return;
        }
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = CoreModule.f17545c.f19663m0.f19394a0.m221515e();
        if (!NullChecker.m81303a(partialListOptM221515e) || vwb.m200296J(partialListOptM221515e.loaded)) {
            return;
        }
        CoreSuggested.UserInfo userInfo = partialListOptM221515e.loaded.get(0);
        if (NullChecker.m81303a(userInfo)) {
            Object obj = userInfo.extensionObject;
            if (obj instanceof OMSAdCardInfo) {
                if (TextUtils.equals(((OMSAdCardInfo) obj).contentType, "tagCardGuide")) {
                    CoreModule.f17545c.f19663m0.f19405d2.add("tagCardGuide");
                }
                ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38801A(SwipeDirection.RIGHT);
            }
        }
    }

    /* JADX INFO: renamed from: y5 */
    public final void m161297y5() {
        duringCreated(v930.m197537k().distinctUntilChanged()).filter(new w9j() { // from class: l.ys30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((TabName) obj) != TabName.Card);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.kt30
            @Override // p149l.e30
            public final void call(Object obj) {
                sbp.m183242b();
            }
        }));
        duringCreated(CoreModule.f17545c.f19663m0.f19323B0).switchMap(new w9j() { // from class: l.tk30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19687u0.m30399L6();
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.al30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70402a.m161184Y6((j760) obj);
            }
        }, new e30() { // from class: l.bl30
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19663m0.f19469z0 = 0;
            }
        }));
        duringCreated(CoreModule.f17545c.f19593O2.obs()).observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.cl30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((String) obj).equals(""));
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.dl30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86778a.m161111H6((String) obj);
            }
        }));
        duringCreated(mkd0.m154984r(lifecycle(), this.f140396o, new el30()).filter(new w9j() { // from class: l.gl30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                j760 j760Var = (j760) obj;
                return Boolean.valueOf(j760Var.f116564a == C4319c.f15548i && ((Boolean) j760Var.f116565b).booleanValue());
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.hl30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108320a.m161115I6((j760) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19663m0.m31066W8()).subscribe(mkd0.m154955G(new e30() { // from class: l.zs30
            @Override // p149l.e30
            public final void call(Object obj) {
                nt30.m161057u1((PartialListOpt) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19663m0.f19403d0).filter(new w9j() { // from class: l.at30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((HashMap) obj));
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.ct30
            @Override // p149l.e30
            public final void call(Object obj) {
                nt30.m160900N0((HashMap) obj);
            }
        }));
        duringCreated(this.f140391k.doOnNext(new e30() { // from class: l.dt30
            @Override // p149l.e30
            public final void call(Object obj) {
                nt30.m160995i1((roj0) obj);
            }
        }).switchMap(new w9j() { // from class: l.et30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f93072a.m161119J6((roj0) obj);
            }
        }).filter(new w9j() { // from class: l.ft30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((j760) obj).f116565b == TabName.Card);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.gt30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104242a.m161127L6((j760) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19663m0.f19400c0).subscribe(mkd0.m154955G(new e30() { // from class: l.ht30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109364a.m161131M6((roj0) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19639e0.f149311Y1).subscribe(mkd0.m154955G(new e30() { // from class: l.it30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114819a.m161135N6((roj0) obj);
            }
        }));
        duringCreated(mkd0.m154984r(lifecycle(), this.f140394m, new x9j() { // from class: l.jt30
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return nt30.m161048s2((C4319c) obj, (roj0) obj2);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.lt30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129932a.m161138O6((roj0) obj);
            }
        }));
        duringCreated(C22306c.concat(CoreModule.f17545c.f19696x0.m30191W3() ? C22306c.just(Boolean.TRUE) : C22306c.empty(), CoreModule.f17545c.f19696x0.m30212q4())).subscribe(mkd0.m154956H(new e30() { // from class: l.kk30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123528a.m161146Q6((Boolean) obj);
            }
        }, new e30() { // from class: l.lk30
            @Override // p149l.e30
            public final void call(Object obj) {
                nt30.m160877H2((Throwable) obj);
            }
        }));
        duringCreated(mkd0.m154985s(CoreModule.f17545c.f19639e0.m169523o9().map(new w9j() { // from class: l.mk30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return nt30.m160982f4((User) obj);
            }
        }), CoreModule.f17545c.f19657k0.f20088R.m121230k(), lac0.m149136m() ? CoreModule.f17545c.f19635c2.m99143o3().distinctUntilChanged() : C22306c.just(roj0.f160388a), new y9j() { // from class: l.nk30
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return new xaj0((DoublePair) obj, (RoamedLocationData) obj2, obj3);
            }
        }).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.ok30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144396a.m161150R6((xaj0) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19663m0.f19350K0).subscribe(mkd0.m154955G(new e30() { // from class: l.pk30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f149932a.m161154S6((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19663m0.f19347J0).subscribe(mkd0.m154955G(new e30() { // from class: l.qk30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155066a.m161159T6((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19663m0.f19429l2).subscribe(mkd0.m154956H(new e30() { // from class: l.rk30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159773a.m161164U6((String) obj);
            }
        }, new e30() { // from class: l.sk30
            @Override // p149l.e30
            public final void call(Object obj) {
                nt30.m160906O1((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19663m0.f19432m2).subscribe(mkd0.m154956H(new e30() { // from class: l.vk30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181763a.m161169V6((roj0) obj);
            }
        }, new e30() { // from class: l.wk30
            @Override // p149l.e30
            public final void call(Object obj) {
                nt30.m161072x4((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19663m0.f19435n2).subscribe(mkd0.m154956H(new e30() { // from class: l.xk30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193261a.m161174W6((roj0) obj);
            }
        }, new e30() { // from class: l.yk30
            @Override // p149l.e30
            public final void call(Object obj) {
                nt30.m160890K2((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19663m0.f19417h2.asObservable()).subscribe(mkd0.m154955G(new e30() { // from class: l.zk30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203504a.m161179X6((SwipeDirection) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y6 */
    public final /* synthetic */ void m161298y6() {
        this.f140391k.m132487l(roj0.f160388a);
        if (uq40.m194983y(m161157T4(), true)) {
            return;
        }
        this.f140350G.m132487l(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: y7 */
    public final /* synthetic */ void m161299y7(SwipeDirection swipeDirection) {
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37329n6();
        SwipeDirection swipeDirection2 = SwipeDirection.RIGHT;
        if (swipeDirection == swipeDirection2) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38801A(swipeDirection2);
            return;
        }
        SwipeDirection swipeDirection3 = SwipeDirection.LEFT;
        if (swipeDirection == swipeDirection3) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38801A(swipeDirection3);
            return;
        }
        SwipeDirection swipeDirection4 = SwipeDirection.UP;
        if (swipeDirection == swipeDirection4) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38801A(swipeDirection4);
        }
    }

    /* JADX INFO: renamed from: y8 */
    public VSwipeStack.OnCardSwipeResult m161300y8(mol molVar, SwipeDirection swipeDirection, boolean z) {
        if (this.f140357J0 == null) {
            this.f140357J0 = new C7898j();
        }
        if (!this.f140383c) {
            CrashHelper.m81296c(new IllegalStateException("onCardSwipe be called before card rendered"));
        } else if (molVar.mo36883e0() && NullChecker.m81303a(molVar.getCardDataProxy()) && NullChecker.m81303a(molVar.getCardDataProxy().m141745d())) {
            CoreBusinessModule.f17537g.m146315b().f133031b = molVar.getCardDataProxy().m141745d().f56011id;
        } else {
            CoreBusinessModule.f17537g.m146315b().f133031b = "";
        }
        SwipeDirection swipeDirection2 = SwipeDirection.RIGHT;
        boolean z2 = true;
        boolean z3 = swipeDirection == swipeDirection2 || swipeDirection == SwipeDirection.UP;
        SwipeDirection swipeDirection3 = SwipeDirection.UP;
        boolean z4 = swipeDirection == swipeDirection3;
        if (!z) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37257Z1(z3, z4).mo38358i();
        }
        if (!upa.m194675N3()) {
            if (z3) {
                V v2 = this.viewModel;
                if (z4) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC7866b) v2).m37347r2().reset();
                } else {
                    ((ViewTreeObserverOnGlobalLayoutListenerC7866b) v2).m37134C2().reset();
                }
                ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37331o2().reset();
            } else {
                ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37347r2().reset();
                ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37134C2().reset();
            }
        }
        if (z3) {
            yd7 yd7Var = CoreModule.f17545c.f19662l2;
            yd7Var.f197523T = 0;
            yd7Var.f197524U++;
        } else {
            yd7 yd7Var2 = CoreModule.f17545c.f19662l2;
            yd7Var2.f197523T++;
            yd7Var2.f197524U = 0;
        }
        molVar.mo36898j0(swipeDirection);
        HomeStatisticsHelper.m36691E("card");
        HomeStatisticsHelper.m36692F("swipe");
        f3a f3aVar = CoreModule.f17545c.f19622Y0;
        if (swipeDirection != swipeDirection2 && swipeDirection != swipeDirection3) {
            z2 = false;
        }
        f3aVar.m119255e(z2);
        VSwipeStack.OnCardSwipeResult onCardSwipeResultMo37497a = this.f140357J0.mo37497a(new C7898j.a(this, (ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel, molVar.getCardDataProxy(), swipeDirection, z));
        onCardSwipeResultMo37497a.name();
        VSwipeStack.OnCardSwipeResult onCardSwipeResult = VSwipeStack.OnCardSwipeResult.pass;
        if (onCardSwipeResultMo37497a == onCardSwipeResult) {
            CoreModule.f17545c.f19622Y0.m119256f();
        }
        if (g6a.m124574w() && onCardSwipeResultMo37497a != VSwipeStack.OnCardSwipeResult.stay) {
            rxg0.m181572j().m181595w(null);
        }
        VSwipeStack.OnCardSwipeResult onCardSwipeResult2 = VSwipeStack.OnCardSwipeResult.back;
        if (onCardSwipeResultMo37497a == onCardSwipeResult2) {
            yd7 yd7Var3 = CoreModule.f17545c.f19662l2;
            yd7Var3.f197523T = 0;
            yd7Var3.f197524U = 0;
        }
        if (onCardSwipeResultMo37497a == onCardSwipeResult2 || onCardSwipeResultMo37497a == onCardSwipeResult) {
            m161201c5();
        }
        m160956Z8(null);
        this.f140387g = false;
        this.f140380Z = null;
        this.f140388h = false;
        if (!upa.m194675N3() && IntlCountryCodeController.m28126v()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37252X5(onCardSwipeResultMo37497a, swipeDirection);
            if (onCardSwipeResultMo37497a != onCardSwipeResult) {
                return VSwipeStack.OnCardSwipeResult.stay;
            }
        }
        if (upa.m194844y1()) {
            zub.m220214m();
        }
        if (onCardSwipeResultMo37497a == onCardSwipeResult) {
            NavigationBarAdmobHelper.INSTANCE.m36164y();
        }
        CoreModule.f17545c.f19662l2.f197522S = mqi0.m155944o();
        CoreModule.f17545c.f19686t2.m168336p3();
        return onCardSwipeResultMo37497a;
    }

    /* JADX INFO: renamed from: z5 */
    public final void m161301z5() {
        creates(new e30() { // from class: l.ll30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128636a.m161189Z6((Bundle) obj);
            }
        }, new d30() { // from class: l.ml30
            @Override // p149l.d30
            public final void call() {
                nt30.m160953Z1();
            }
        });
    }

    /* JADX INFO: renamed from: z6 */
    public final /* synthetic */ void m161302z6() {
        this.f140391k.m132487l(roj0.f160388a);
        if (uq40.m194983y(m161157T4(), true)) {
            return;
        }
        this.f140350G.m132487l(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: z7 */
    public final /* synthetic */ void m161303z7(SwipeDirection swipeDirection) {
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37329n6();
        SwipeDirection swipeDirection2 = SwipeDirection.RIGHT;
        if (swipeDirection == swipeDirection2) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38801A(swipeDirection2);
            return;
        }
        SwipeDirection swipeDirection3 = SwipeDirection.LEFT;
        if (swipeDirection == swipeDirection3) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38801A(swipeDirection3);
            return;
        }
        SwipeDirection swipeDirection4 = SwipeDirection.UP;
        if (swipeDirection == swipeDirection4) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38801A(swipeDirection4);
        }
    }

    /* JADX INFO: renamed from: z8 */
    public void m161304z8(boolean z) {
        this.f140373S = z;
        this.f140374T.m132487l(Boolean.valueOf(z));
        if (!z) {
            if (this.f140389i) {
                this.f140389i = false;
                m161182Y4();
            }
            if (this.f140384d) {
                this.f140384d = false;
                if (NullChecker.m81303a(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2()) && NullChecker.m81303a(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38813j())) {
                    HomeStatisticsHelper.m36703i(((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38813j(), ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37341q2().pageId());
                    jj4 jj4VarMo38818o = ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37125A2().mo38818o();
                    String strPageId = ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37341q2().pageId();
                    String str = this.f140381a;
                    HomeStatisticsHelper.m36712r(jj4VarMo38818o, strPageId, str, m161221g6(str));
                }
            }
        }
        if (!lac0.m149136m() && CoreModule.f17545c.f19576J0.m139254F3() && ((lifecycle_() == C4319c.f15548i || lifecycle_() == C4319c.f15547h) && !z)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37212Q5(true);
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37369v5(z);
        if (!this.f140373S) {
            if (do80.f87149f && this.f140348F) {
                ((ViewTreeObserverOnGlobalLayoutListenerC7866b) this.viewModel).m37184L5(true, true);
                CoreModule.f17545c.f19663m0.m31136p8(true);
            }
            do80.f87149f = false;
        }
        if (vy8.m200608f()) {
            String str2 = CoreModule.f17545c.f19639e0.f149178G2.get();
            if (this.f140373S || TextUtils.isEmpty(str2) || !mqi0.m155928C(mqi0.m155944o(), CoreModule.f17545c.f19639e0.f149185H2.get().longValue())) {
                return;
            }
            CoreModule.f17545c.f19639e0.f149178G2.put("");
            zvf0.m220402x("e_boost_checkin_toast", "p_suggest_users_home_view");
            ke7.m145732o().m145737A(m161157T4(), str2 + BaseSei.f13930X);
        }
    }

    /* JADX INFO: renamed from: C5 */
    public void m161090C5() {
    }
}
