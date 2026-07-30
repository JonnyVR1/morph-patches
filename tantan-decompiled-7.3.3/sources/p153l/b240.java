package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.ExtraActLifecycle;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.android.p053ui.poplevel.C4522a;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4880a0;
import com.p051p1.mobile.putong.core.api.C4881b;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.api.C4888e0;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.ActionData;
import com.p051p1.mobile.putong.core.data.ActionInsertPosition;
import com.p051p1.mobile.putong.core.data.BoostStatus;
import com.p051p1.mobile.putong.core.data.CardButtonsShowAndHideType;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.FreeTrialEnvelope;
import com.p051p1.mobile.putong.core.data.GrowthSpamInfo;
import com.p051p1.mobile.putong.core.data.IntlMarketConfigEnvelope;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MigrateAwardDialogData;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.RoamedLocationData;
import com.p051p1.mobile.putong.core.data.SeeExposedUser;
import com.p051p1.mobile.putong.core.data.SuggesterReason;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.TTCMigrateGuideConfig;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.admob.NavigationBarAdmobHelper;
import com.p051p1.mobile.putong.core.newui.home.C8145d;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p051p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p051p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC8017b;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C8018a;
import com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8049j;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p051p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.main.NewMainBaseAct;
import com.p051p1.mobile.putong.core.newui.suggest.SuggestersAct;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.core.p058ui.main.HomeMultiTabSwitcher;
import com.p051p1.mobile.putong.core.p058ui.match.C8618a;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.util.DebugUtil;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CounterLikeLimit;
import com.p051p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSAdCardInfo;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserSearchSettings;
import com.p051p1.mobile.putong.data.UssTags;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p051p1.mobile.putong.util.launch.LaunchStep;
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
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class b240 extends ar2<ViewTreeObserverOnGlobalLayoutListenerC8017b> {

    /* JADX INFO: renamed from: R0 */
    public static String f74484R0 = "suggest_user_profile_info";

    /* JADX INFO: renamed from: S0 */
    public static String f74485S0 = "home";

    /* JADX INFO: renamed from: T0 */
    public static String f74486T0 = "click";

    /* JADX INFO: renamed from: U0 */
    public static String f74487U0 = "swipe";

    /* JADX INFO: renamed from: V0 */
    public static String f74488V0 = "";

    /* JADX INFO: renamed from: W0 */
    public static jxd0 f74489W0;

    /* JADX INFO: renamed from: X0 */
    public static boolean f74490X0;

    /* JADX INFO: renamed from: Y0 */
    public static String f74491Y0;

    /* JADX INFO: renamed from: Z0 */
    public static jxd0 f74492Z0;

    /* JADX INFO: renamed from: a1 */
    public static String f74493a1;

    /* JADX INFO: renamed from: A */
    public boolean f74494A;

    /* JADX INFO: renamed from: B */
    public boolean f74495B;

    /* JADX INFO: renamed from: C */
    public boolean f74496C;

    /* JADX INFO: renamed from: D */
    public boolean f74497D;

    /* JADX INFO: renamed from: E */
    public boolean f74498E;

    /* JADX INFO: renamed from: E0 */
    public Runnable f74499E0;

    /* JADX INFO: renamed from: F */
    public boolean f74500F;

    /* JADX INFO: renamed from: F0 */
    public boolean f74501F0;

    /* JADX INFO: renamed from: G */
    public C22507a<Boolean> f74502G;

    /* JADX INFO: renamed from: G0 */
    public mz2 f74503G0;

    /* JADX INFO: renamed from: H */
    public boolean f74504H;

    /* JADX INFO: renamed from: H0 */
    public boolean f74505H0;

    /* JADX INFO: renamed from: I */
    public boolean f74506I;

    /* JADX INFO: renamed from: I0 */
    public String f74507I0;

    /* JADX INFO: renamed from: J */
    public boolean f74508J;

    /* JADX INFO: renamed from: J0 */
    public g6m<C8049j.a, VSwipeStack.OnCardSwipeResult> f74509J0;

    /* JADX INFO: renamed from: K */
    public long f74510K;

    /* JADX INFO: renamed from: K0 */
    public boolean f74511K0;

    /* JADX INFO: renamed from: L */
    public boolean f74512L;

    /* JADX INFO: renamed from: L0 */
    public int f74513L0;

    /* JADX INFO: renamed from: M */
    public g6m<p8l.C19323a, Boolean> f74514M;

    /* JADX INFO: renamed from: M0 */
    public kcg0 f74515M0;

    /* JADX INFO: renamed from: N */
    public p8l.C19323a f74516N;

    /* JADX INFO: renamed from: N0 */
    public as60 f74517N0;

    /* JADX INFO: renamed from: O */
    public xgj f74518O;

    /* JADX INFO: renamed from: O0 */
    public boolean f74519O0;

    /* JADX INFO: renamed from: P */
    public String f74520P;

    /* JADX INFO: renamed from: P0 */
    public boolean f74521P0;

    /* JADX INFO: renamed from: Q */
    public String f74522Q;

    /* JADX INFO: renamed from: Q0 */
    public long f74523Q0;

    /* JADX INFO: renamed from: R */
    public boolean f74524R;

    /* JADX INFO: renamed from: S */
    public boolean f74525S;

    /* JADX INFO: renamed from: T */
    public C22507a<Boolean> f74526T;

    /* JADX INFO: renamed from: U */
    public long f74527U;

    /* JADX INFO: renamed from: V */
    public Merchandise f74528V;

    /* JADX INFO: renamed from: W */
    public Merchandise f74529W;

    /* JADX INFO: renamed from: X */
    public kcg0 f74530X;

    /* JADX INFO: renamed from: Y */
    public kcg0 f74531Y;

    /* JADX INFO: renamed from: Z */
    public HashMap f74532Z;

    /* JADX INFO: renamed from: a */
    public String f74533a;

    /* JADX INFO: renamed from: b */
    public int f74534b;

    /* JADX INFO: renamed from: c */
    public boolean f74535c;

    /* JADX INFO: renamed from: d */
    public boolean f74536d;

    /* JADX INFO: renamed from: e */
    public boolean f74537e;

    /* JADX INFO: renamed from: f */
    public boolean f74538f;

    /* JADX INFO: renamed from: g */
    public boolean f74539g;

    /* JADX INFO: renamed from: h */
    public boolean f74540h;

    /* JADX INFO: renamed from: i */
    public boolean f74541i;

    /* JADX INFO: renamed from: j */
    public boolean f74542j;

    /* JADX INFO: renamed from: k */
    public C22507a<uxj0> f74543k;

    /* JADX INFO: renamed from: k0 */
    public final y20<Act> f74544k0;

    /* JADX INFO: renamed from: l */
    public C22507a<PartialListOpt<CoreSuggested.UserInfo>> f74545l;

    /* JADX INFO: renamed from: m */
    public C22507a<uxj0> f74546m;

    /* JADX INFO: renamed from: n */
    public C22507a<uxj0> f74547n;

    /* JADX INFO: renamed from: o */
    public C22507a<Boolean> f74548o;

    /* JADX INFO: renamed from: p */
    public C22507a<Boolean> f74549p;

    /* JADX INFO: renamed from: p0 */
    public final y20<Act> f74550p0;

    /* JADX INFO: renamed from: q */
    public Settings f74551q;

    /* JADX INFO: renamed from: r */
    public C22508b<uxj0> f74552r;

    /* JADX INFO: renamed from: s */
    public vxd0 f74553s;

    /* JADX INFO: renamed from: t */
    public byd0 f74554t;

    /* JADX INFO: renamed from: u */
    public int f74555u;

    /* JADX INFO: renamed from: v */
    public C22508b<uxj0> f74556v;

    /* JADX INFO: renamed from: w */
    public C22508b<Boolean> f74557w;

    /* JADX INFO: renamed from: x */
    public jxd0 f74558x;

    /* JADX INFO: renamed from: y */
    public jxd0 f74559y;

    /* JADX INFO: renamed from: z */
    public boolean f74560z;

    /* JADX INFO: renamed from: l.b240$a */
    public class ViewOnTouchListenerC15897a implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public boolean f74561a = false;

        /* JADX INFO: renamed from: b */
        public float f74562b = 0.0f;

        /* JADX INFO: renamed from: c */
        public float f74563c = 0.0f;

        public ViewOnTouchListenerC15897a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (C4881b.m32410a(((ViewTreeObserverOnGlobalLayoutListenerC8017b) b240.this.viewModel).m38128A2().mo39816j())) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f74561a = false;
                this.f74562b = motionEvent.getX();
                this.f74563c = motionEvent.getY();
                return false;
            }
            if (action == 1) {
                return this.f74561a;
            }
            if (action != 2) {
                return false;
            }
            float x = motionEvent.getX() - this.f74562b;
            float y = motionEvent.getY() - this.f74563c;
            if (x > 15.0f || y > 15.0f) {
                this.f74561a = true;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: l.b240$b */
    public class RunnableC15898b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String[] f74565a;

        public RunnableC15898b(String[] strArr) {
            this.f74565a = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b240.this.f74519O0) {
                return;
            }
            Window window = b240.this.m101951T4().getWindow();
            if (window == null || window.getDecorView() == null || window.getDecorView().getWindowToken() == null) {
                l51.m152888H(b240.this.m101951T4(), this, 100L);
            } else {
                b240.this.f74517N0.m99890f(b240.this.m101951T4());
                ((ViewTreeObserverOnGlobalLayoutListenerC8017b) b240.this.viewModel).m38344q2().requestPermissions(this.f74565a, 256);
            }
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f74489W0 = new jxd0("superLikeTipHasShown", bool);
        f74490X0 = true;
        f74492Z0 = new jxd0("see_entry_has_shown_" + CoreModule.m30929H().userId(), bool);
    }

    public b240(ner nerVar) {
        super(nerVar);
        this.f74533a = "";
        this.f74534b = 0;
        this.f74535c = false;
        this.f74536d = false;
        this.f74537e = true;
        this.f74539g = false;
        this.f74540h = false;
        this.f74542j = false;
        this.f74543k = C22507a.m222758b();
        this.f74545l = CoreModule.f18264c.f20405m0.f20136a0;
        this.f74546m = C22507a.m222758b();
        this.f74547n = C22507a.m222758b();
        Boolean bool = Boolean.FALSE;
        this.f74548o = C22507a.m222759c(bool);
        this.f74549p = C22507a.m222759c(bool);
        this.f74551q = new Settings();
        this.f74552r = C22508b.m222767b();
        this.f74553s = new vxd0("see_anim_show_times_after_launch" + CoreModule.m30929H().userId(), 0);
        this.f74554t = new byd0("last_See_Anim_shown_time" + CoreModule.m30929H().userId(), 0L);
        this.f74555u = 0;
        this.f74556v = C22508b.m222767b();
        this.f74557w = C22508b.m222767b();
        this.f74558x = new jxd0("tantan_coin_boost_bubble_shown_" + CoreModule.m30929H().userId(), bool);
        this.f74559y = new jxd0("tantan_coin_super_like_bubble_shown_" + CoreModule.m30929H().userId(), bool);
        this.f74560z = false;
        this.f74494A = false;
        this.f74495B = false;
        this.f74496C = false;
        this.f74497D = false;
        this.f74498E = false;
        this.f74500F = false;
        this.f74502G = C22507a.m222759c(bool);
        this.f74504H = false;
        this.f74506I = true;
        this.f74508J = true;
        this.f74510K = 0L;
        this.f74512L = false;
        this.f74524R = true;
        this.f74526T = C22507a.m222759c(bool);
        this.f74527U = 0L;
        this.f74528V = null;
        this.f74529W = null;
        this.f74544k0 = new y20() { // from class: l.e040
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91410a.m101998c8((Act) obj);
            }
        };
        this.f74550p0 = new y20() { // from class: l.f040
            @Override // p153l.y20
            public final void call(Object obj) {
                b240.m101840s0((Act) obj);
            }
        };
        this.f74499E0 = new Runnable() { // from class: l.g040
            @Override // java.lang.Runnable
            public final void run() {
                this.f101608a.m101777f8();
            }
        };
        this.f74505H0 = false;
        this.f74507I0 = "";
        this.f74511K0 = false;
        this.f74513L0 = 0;
        this.f74515M0 = null;
        this.f74523Q0 = ami0.INSTANCE.m98830d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D2 */
    public static /* synthetic */ PushMessage m101654D2(pf60 pf60Var) {
        return (PushMessage) pf60Var.f152156a;
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ void m101657E0(Act act) {
        if (CoreModule.m30929H().signedIn_()) {
            CoreModule.f18264c.f20296B2.m186429u3();
            CoreModule.f18264c.f20296B2.m186430y3();
        }
    }

    /* JADX INFO: renamed from: F1 */
    public static /* synthetic */ void m101663F1(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: F3 */
    public static /* synthetic */ void m101665F3(Throwable th) {
    }

    /* JADX INFO: renamed from: H2 */
    public static /* synthetic */ void m101671H2(Throwable th) {
    }

    /* JADX INFO: renamed from: H3 */
    public static /* synthetic */ Boolean m101672H3(TabName tabName, TabName tabName2) {
        return RemoteConfig.m80481x().m80513s("filter_home_tab_unchange") ? Boolean.valueOf(TextUtils.equals(tabName.toString(), tabName2.toString())) : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: J4 */
    public static /* synthetic */ void m101683J4(TabName tabName) {
        if (NullChecker.m82486a(CoreModule.f18264c.f20405m0.f20112S) && NullChecker.m82486a(CoreModule.f18264c.f20405m0.f20112S.m222761e())) {
            CoreSuggested coreSuggested = CoreModule.f18264c.f20405m0;
            coreSuggested.m32146s6("push", null, coreSuggested.f20112S.m222761e().f152156a);
        }
    }

    /* JADX INFO: renamed from: K2 */
    public static /* synthetic */ void m101684K2(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m101687L0(pf60 pf60Var, View view, pf60 pf60Var2) {
        VText vText = (VText) view.findViewById(adc0.f70446m0);
        uqb0.f180374G.m127125Q0((VDraweeView) view.findViewById(adc0.f70184W5), ((User) pf60Var2.f152156a).m61308fp().profileSmall());
        vText.setText(CoreModule.f18263b.getString(R$string.f19251fk, ((Integer) pf60Var.f152157b).intValue() > 99 ? "99+" : pf60Var.f152157b));
    }

    /* JADX INFO: renamed from: M2 */
    public static /* synthetic */ Boolean m101691M2(CoreLikers.C4870a c4870a) {
        CoreLikers.LikersTriggerBy likersTriggerBy = CoreLikers.LikersTriggerBy.home_total_liker_float;
        CoreLikers.LikersTriggerBy likersTriggerBy2 = c4870a.f20011a;
        return Boolean.valueOf(likersTriggerBy == likersTriggerBy2 || CoreLikers.LikersTriggerBy.home_new_liker_float == likersTriggerBy2);
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m101694N0(HashMap map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((NewTags) ((Map.Entry) it.next()).getValue());
        }
        gj40.m130415o().m130429N(arrayList);
    }

    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ PartialListOpt m101699O0(PartialListOpt partialListOpt, UserPrivilege userPrivilege, VerificationCenter verificationCenter, Long l2) {
        return partialListOpt;
    }

    /* JADX INFO: renamed from: O1 */
    public static /* synthetic */ void m101700O1(Throwable th) {
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m101701O3(Throwable th) {
    }

    /* JADX INFO: renamed from: O5 */
    private void m101703O5() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.bw30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78679a.m101894E7((C4470c) obj);
            }
        }));
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.cw30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84091a.m101898F7((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P2 */
    public static /* synthetic */ void m101706P2(TabName tabName) {
        if (tabName != TabName.Card) {
            C4499d.m21895l().m21899k(HomeMultiTabSwitcher.f31191r);
            C4499d.m21895l().m21899k(HomeMultiTabSwitcher.f31192s);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m101709Q0(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q2 */
    public static /* synthetic */ void m101711Q2(pf60 pf60Var, String str, View view, View view2) {
        String str2;
        CoreModule.f18264c.f20429u0.f20003s0.put(Long.valueOf(pzi0.m174454o()));
        if (((Integer) pf60Var.f152157b).intValue() > 99) {
            str2 = "99+";
        } else {
            str2 = pf60Var.f152157b + "";
        }
        i4g0.m138492A("e_liked_female_number", "p_suggest_users_home_view", jyb.m147494Y("liked_number", str2));
    }

    /* JADX INFO: renamed from: S2 */
    public static /* synthetic */ void m101721S2(Throwable th) {
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ void m101730U3(TabName tabName) {
        if (tabName == TabName.Msg) {
            CoreModule.f18264c.f20296B2.m186429u3();
            CoreModule.f18264c.f20296B2.m186430y3();
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m101738W3() {
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m101746Y3(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: Z1 */
    public static /* synthetic */ void m101747Z1() {
    }

    /* JADX INFO: renamed from: Z2 */
    public static /* synthetic */ void m101748Z2() {
    }

    /* JADX INFO: renamed from: Z8 */
    public static void m101750Z8(String str) {
        f74493a1 = str;
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ void m101751a1(Throwable th) {
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m101753a3(Throwable th) {
    }

    /* JADX INFO: renamed from: d4 */
    public static /* synthetic */ void m101766d4(TabName tabName) {
        if (tabName != TabName.Card) {
            C4499d.m21895l().m21899k("bubble_superlike_coin_guide");
            C4499d.m21895l().m21899k("bubble_superlike_bubble");
            z5h0.m218680u();
            C4499d.m21895l().m21899k("bubble_undo_remaining");
            C4499d.m21895l().m21899k("bubble_setting_remaining");
            C4499d.m21895l().m21899k("bubble_setting_remaining");
            C4499d.m21895l().m21899k("bubble_undo_remaining");
            m6i.m157229d();
            wgx.m206283A().m206318x(true);
        }
        if (CoreModule.m30932N().mo61549ko()) {
            CoreModule.m30932N().mo61456Ea();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ Boolean m101767e0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ void m101768e1(Bundle bundle) {
        CoreModule.f18264c.f20381e0.m116628w9(uqb0.f180380L.f17868g.get());
        uqb0.f180380L.f17868g.clear();
    }

    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ void m101773f1(Throwable th) {
    }

    /* JADX INFO: renamed from: f2 */
    public static /* synthetic */ void m101774f2(Throwable th) {
    }

    /* JADX INFO: renamed from: f4 */
    public static /* synthetic */ DoublePair m101776f4(User user) {
        if (user.settings != null) {
            return user.getLatitudeAndLongitude();
        }
        CrashHelper.m82479c(new NullPointerException("user.me.settings==null, userid=" + CoreModule.m30929H().userId() + " ,abheader=" + ABManager.m30347i()));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f8 */
    public /* synthetic */ void m101777f8() {
        this.f74537e = false;
        HashMap map = new HashMap();
        map.put("sourcepage", f74485S0);
        map.put("actiontype", f74486T0);
        final User userM32145r8 = CoreModule.f18264c.f20405m0.m32145r8();
        if (NullChecker.m82486a(CoreModule.f18264c.f20405m0.m32148s8())) {
            CoreModule.f18264c.f20405m0.m32148s8().m225062clone();
        }
        C22421c<Relationship> c22421cM32105f9 = CoreModule.f18264c.f20405m0.m32105f9(map);
        if (NullChecker.m82486a(c22421cM32105f9)) {
            c22421cM32105f9.subscribe(psd0.m173597H(new y20() { // from class: l.jx30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f122984a.m102003d8(userM32145r8, (Relationship) obj);
                }
            }, new y20() { // from class: l.kx30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f129162a.m102008e8(userM32145r8, (Throwable) obj);
                }
            }));
            return;
        }
        if (NullChecker.m82486a(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2())) {
            m101938P8(m102005e5(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38344q2().pageId(), "", ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2(), userM32145r8), "");
        }
        this.f74537e = true;
        o1j0.m165626H(m101951T4().getResources().getString(R$string.f18591Jq), m101951T4().getResources().getDrawable(dbc0.f87134jv), m101951T4().getResources().getDrawable(dbc0.f87131js));
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m101783h0(Bundle bundle) {
        CoreModule.f18264c.f20381e0.m116628w9(uqb0.f180380L.f17867f.get());
        uqb0.f180380L.f17867f.clear();
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ void m101784h1(Bundle bundle) {
    }

    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ void m101789i1(uxj0 uxj0Var) {
        if (CoreModule.f18264c.f20405m0.f20212z1.get().booleanValue()) {
            return;
        }
        CoreModule.f18264c.f20405m0.f20212z1.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: i6 */
    private boolean m101793i6(CoreSuggested.UserInfo userInfo) {
        return NullChecker.m82486a(userInfo) && CoreModule.f18264c.f20405m0.m32027M6(userInfo.f20214id);
    }

    /* JADX INFO: renamed from: j4 */
    public static /* synthetic */ Unit m101798j4(IntlMarketConfigEnvelope intlMarketConfigEnvelope) {
        return null;
    }

    /* JADX INFO: renamed from: k1 */
    public static /* synthetic */ void m101800k1(Throwable th) {
    }

    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ void m101805l1(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ C22421c m101809m0(pf60 pf60Var) {
        try {
            if (PushMessageCustom.JSON_ADAPTER.parse((String) pf60Var.f152156a).newToast) {
                return C22421c.just(ji30.m144964h());
            }
        } catch (IOException e) {
            CrashHelper.m82479c(e);
        }
        return ji30.m144967k().filter(new qcj() { // from class: l.lx30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((TabName) obj) == TabName.Card);
            }
        }).take(1);
    }

    /* JADX INFO: renamed from: m1 */
    public static /* synthetic */ void m101810m1(Throwable th) {
    }

    /* JADX INFO: renamed from: m3 */
    public static /* synthetic */ Boolean m101812m3(Boolean bool, uxj0 uxj0Var) {
        return bool;
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m101814n0(Throwable th) {
    }

    /* JADX INFO: renamed from: o2 */
    public static /* synthetic */ Boolean m101821o2(pf60 pf60Var) {
        C4470c c4470c = C4470c.f16267i;
        S s = pf60Var.f152157b;
        return Boolean.valueOf(c4470c == s || C4470c.f16266h == s);
    }

    /* JADX INFO: renamed from: o3 */
    public static /* synthetic */ void m101822o3(Throwable th) {
    }

    /* JADX INFO: renamed from: p5 */
    public static String m101829p5() {
        return f74493a1;
    }

    /* JADX INFO: renamed from: q1 */
    public static /* synthetic */ Boolean m101831q1(uxj0 uxj0Var, Boolean bool, uxj0 uxj0Var2) {
        return bool;
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m101840s0(Act act) {
        if (ji30.m144964h() == TabName.Card) {
            CoreModule.f18264c.f20405m0.m32146s6("initiative", "back", null);
        }
    }

    /* JADX INFO: renamed from: s1 */
    public static /* synthetic */ C22421c m101841s1(Boolean bool) {
        CoreModule.f18264c.f20381e0.f89190b0.put(bool);
        return CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
    }

    /* JADX INFO: renamed from: s2 */
    public static /* synthetic */ uxj0 m101842s2(C4470c c4470c, uxj0 uxj0Var) {
        if (c4470c == C4470c.f16267i) {
            return uxj0.f181467a;
        }
        return null;
    }

    /* JADX INFO: renamed from: s4 */
    public static /* synthetic */ void m101844s4() {
        CoreModule.f18264c.f20362X1.m162664w3();
        if (TEnum.equals(uqb0.f180402h0, LiveRegionTag.indonesia)) {
            CoreModule.f18264c.f20396j0.m31586F5();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ Boolean m101850u0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: u1 */
    public static /* synthetic */ void m101851u1(PartialListOpt partialListOpt) {
        CoreSuggested.UserInfo userInfoM32143r6;
        C4888e0.m32952a().m32956d();
        fb0.m124810i(partialListOpt);
        if (gra.m131606N3() && ExpandedCardStyleHelper.m39093o().m39106s() && (userInfoM32143r6 = CoreModule.f18264c.f20405m0.m32143r6()) != null && userInfoM32143r6.virtualCardType == VirtualCardType.FakeCard) {
            ExpandedCardStyleHelper.m39093o().m39110w("fake swipe");
        }
    }

    /* JADX INFO: renamed from: u4 */
    public static /* synthetic */ C22421c m101854u4(List list) {
        User user = new User();
        ArrayList arrayList = new ArrayList(CoreModule.f18264c.f20381e0.m116600p9().pictures);
        arrayList.remove(0);
        arrayList.add(0, (Media) list.get(0));
        user.pictures = arrayList;
        return CoreModule.f18264c.f20381e0.m116620u9(user);
    }

    /* JADX INFO: renamed from: x4 */
    public static /* synthetic */ void m101866x4(Throwable th) {
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m101871z0(Bundle bundle) {
        CoreLikers coreLikers = CoreModule.f18264c.f20429u0;
        coreLikers.m31439e7(coreLikers.f19996l0.get().longValue(), CoreLikers.LikersTriggerBy.new_like_dialog);
    }

    /* JADX INFO: renamed from: z2 */
    public static /* synthetic */ void m101873z2(String str) {
        str.getClass();
        switch (str) {
            case "expired":
            case "recovered":
                CoreModule.f18264c.f20384f0.m33653Fo();
                CoreModule.f18264c.f20384f0.m34105qq(-1.0d);
                break;
            case "waiting":
                CoreModule.f18264c.f20384f0.m33653Fo();
                break;
            case "trialEnd":
                CoreModule.f18264c.f20296B2.m186428q3();
                CoreModule.f18264c.f20384f0.m33653Fo();
                break;
            case "trialing":
                SeeExposedUser seeExposedUserM137307y3 = CoreModule.f18264c.f20350T1.getLocalConvUserData();
                if (seeExposedUserM137307y3 != null) {
                    f760.INSTANCE.m124355b(seeExposedUserM137307y3.userId);
                }
                f760.INSTANCE.m124356c();
                CoreModule.f18264c.f20384f0.m33653Fo();
                break;
        }
    }

    /* JADX INFO: renamed from: z3 */
    public static /* synthetic */ void m101874z3(Throwable th) {
    }

    /* JADX INFO: renamed from: A5 */
    public final void m101876A5() {
        if (gra.m131606N3()) {
            duringCreated(ExpandedCardStyleHelper.m39093o().m39112y().distinctUntilChanged(new rcj() { // from class: l.pz30
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return Boolean.valueOf(((ExpandedCardStyleHelper.C8102b) obj).f23160a == ((ExpandedCardStyleHelper.C8102b) obj2).f23160a);
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.qz30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f160220a.m101992b7((ExpandedCardStyleHelper.C8102b) obj);
                }
            }));
            duringCreated(C22421c.merge(jj40.f121141d.filter(new qcj() { // from class: l.rz30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(jj40.m145002e() != NewTanFragTag.HOME);
                }
            }), ji30.m144967k()).filter(new qcj() { // from class: l.sz30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Serializable) obj) != TabName.Card);
                }
            }).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.tz30
                @Override // p153l.y20
                public final void call(Object obj) {
                    ExpandedCardStyleHelper.m39093o().m39110w("tab change");
                }
            }));
            duringCreated(ExpandedCardStyleHelper.m39093o().m39097h()).subscribe(psd0.m173596G(new y20() { // from class: l.uz30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f181699a.m101987a7((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: A6 */
    public final /* synthetic */ void m101877A6(uxj0 uxj0Var) {
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38344q2().m21598s4();
    }

    /* JADX INFO: renamed from: A7 */
    public final /* synthetic */ void m101878A7() {
        if (yap.m214902d().m214911k()) {
            yap.m214902d().m214914o(m101951T4());
        }
    }

    /* JADX INFO: renamed from: A8 */
    public void m101879A8(PushMessage pushMessage) {
        CoreModule.m30930K().mo31772hj(this.viewModel, pushMessage);
    }

    /* JADX INFO: renamed from: B5 */
    public void m101880B5() {
        if (gra.m131629T1() && CoreModule.f18264c.f20381e0.m116600p9().isFemale() && pzi0.m174454o() - CoreModule.f18264c.f20429u0.f20003s0.get().longValue() >= 86400000) {
            long jLongValue = CoreModule.f18264c.f20429u0.f20003s0.get().longValue();
            if (jLongValue <= 0) {
                jLongValue = (long) CoreModule.f18264c.f20381e0.m116600p9().createdTime;
            }
            m101951T4().duringCreated(CoreModule.f18264c.f20429u0.m31472q7(jLongValue)).subscribe(psd0.m173597H(new y20() { // from class: l.jz30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f123222a.m101997c7((pf60) obj);
                }
            }, new y20() { // from class: l.kz30
                @Override // p153l.y20
                public final void call(Object obj) {
                    b240.m101810m1((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: B6 */
    public final /* synthetic */ void m101881B6(Throwable th) {
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38344q2().m21598s4();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: B7 */
    public final /* synthetic */ void m101882B7(Bundle bundle) {
        yap.m214902d().m214909g(this, new x20() { // from class: l.rx30
            @Override // p153l.x20
            public final void call() {
                this.f165293a.m101878A7();
            }
        });
    }

    /* JADX INFO: renamed from: B8 */
    public final void m101883B8(final ArrayList<Media> arrayList, final String str) {
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38344q2().m21594o4(R$string.f18632L5);
        yb5.m214980I(arrayList, "profile").compose(psd0.m173592C()).flatMap(new qcj() { // from class: l.mx30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return b240.m101854u4((List) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.nx30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144080a.m102022h8(arrayList, str, (uxj0) obj);
            }
        }, new y20() { // from class: l.ox30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149618a.m102026i8((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C6 */
    public final /* synthetic */ void m101885C6() {
        if (NullChecker.m82486a(m101951T4())) {
            m101976Y4();
        }
    }

    /* JADX INFO: renamed from: C7 */
    public final /* synthetic */ void m101886C7(Bundle bundle) {
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38175J5();
    }

    /* JADX INFO: renamed from: C8 */
    public void m101887C8() {
        if (SystemClock.uptimeMillis() - this.f74510K >= 2000) {
            this.f74510K = SystemClock.uptimeMillis();
            m101923L8(true);
        }
    }

    /* JADX INFO: renamed from: D5 */
    public final void m101888D5() {
        CoreModule.f18264c.f20381e0.m116547ba();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D6 */
    public final /* synthetic */ void m101889D6(pf60 pf60Var) {
        if (NullChecker.m82486a(this.viewModel) && NullChecker.m82486a(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2())) {
            HashMap map = (HashMap) pf60Var.f152157b;
            this.f74532Z = map;
            if (NullChecker.m82486a(map) && this.f74532Z.containsKey("commercial_card_superlike")) {
                m101750Z8("p_home,superlike");
            }
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39804A((SwipeDirection) pf60Var.f152156a);
        }
    }

    /* JADX INFO: renamed from: D7 */
    public final /* synthetic */ void m101890D7() {
        this.f74501F0 = false;
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39804A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: D8 */
    public void m101891D8(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        as60 as60Var = this.f74517N0;
        boolean z = true;
        if (as60Var != null) {
            as60Var.m99888d();
            this.f74519O0 = true;
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
            fph0.m126679l0(fph0.f100175h);
        } else {
            fph0.m126681m0(fph0.f100175h, xxv.m213587n(m101951T4()) ? BLiveOperationTitleShowType.off : "on");
        }
        if (i == 256) {
            if (!d79.m114673d0()) {
                this.f74521P0 = false;
            }
            if (!z) {
                m102013f9();
                return;
            }
            if (z) {
                if (!qxv.m178618c() || xxv.m213588o()) {
                    m102074t8();
                    return;
                } else {
                    CoreDlg.m46224Y1(m101951T4(), false, new x20() { // from class: l.u040
                        @Override // p153l.x20
                        public final void call() {
                            this.f176845a.m102031j8();
                        }
                    });
                    return;
                }
            }
            m102047m9();
            if (this.f74506I) {
                this.f74506I = false;
                if (!this.f74504H) {
                    this.f74543k.m137019l(uxj0.f181467a);
                }
            }
            if (z && qxv.m178618c() && !xxv.m213588o()) {
                CoreDlg.m46221X1(m101951T4(), false);
            }
        }
    }

    /* JADX INFO: renamed from: E5 */
    public final void m101892E5() {
        duringCreated(ABManager.m30327W().filter(new qcj() { // from class: l.k040
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() == 2);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.l040
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129517a.m102007e7((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E6 */
    public final /* synthetic */ void m101893E6() {
        this.f74501F0 = false;
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39804A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: E7 */
    public final /* synthetic */ void m101894E7(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            if (this.f74501F0) {
                l51.m152888H(m101951T4(), new Runnable() { // from class: l.qx30
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f160008a.m101890D7();
                    }
                }, 500L);
            }
            if (this.f74538f) {
                this.f74538f = false;
            } else {
                boolean zM32061U8 = CoreModule.f18264c.f20405m0.m32061U8();
                if (zM32061U8 && CoreModule.f18264c.f20405m0.f20127X <= 0) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38187L5(true, true);
                }
                CoreModule.f18264c.f20405m0.m32139p8(zM32061U8);
            }
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38241V1(false);
            if (CoreModule.f18264c.f20396j0.f20036g0) {
                m101951T4().m40812e6();
            }
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38377w5();
        }
        if (CoreModule.m30932N().mo61549ko() && c4470c == C4470c.f16268j) {
            CoreModule.m30932N().mo61456Ea();
        }
    }

    /* JADX INFO: renamed from: E8 */
    public void m101895E8(boolean z) {
        if (!z) {
            CoreModule.f18264c.f20405m0.m32130m8();
        } else {
            uqb0.f180370E.m80051t();
            duringCreated(uqb0.f180370E.m80047p().take(10L, TimeUnit.SECONDS)).observeOn(fo0.m126432a()).materialize().first().subscribe(psd0.m173596G(new y20() { // from class: l.qw30
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20405m0.m32130m8();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: F5 */
    public final void m101896F5() {
        duringCreated(CoreModule.f18264c.f20347S1.m113541H3()).subscribe(psd0.m173596G(new y20() { // from class: l.h040
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107270a.m102012f7((Optional) obj);
            }
        }));
        duringCreated(hoi.m136432a().f110919b).subscribe(psd0.m173596G(new y20() { // from class: l.j040
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117781a.m102016g7((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F6 */
    public final /* synthetic */ void m101897F6(String str) {
        if (NullChecker.m82486a(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2()) && NullChecker.m82486a(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39816j()) && TextUtils.equals(str, ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39816j().f20214id)) {
            this.f74501F0 = true;
            CoreModule.f18264c.f20405m0.m32034O5();
            if (s7a.m184990s() && m101951T4().m40830p7() == TabName.Card && lifecycle_() == C4470c.f16267i) {
                l51.m152888H(m101951T4(), new Runnable() { // from class: l.zw30
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f206321a.m101893E6();
                    }
                }, 500L);
            }
        }
    }

    /* JADX INFO: renamed from: F7 */
    public final /* synthetic */ void m101898F7(C4470c c4470c) {
        if (((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38344q2().isHidden()) {
            return;
        }
        if (c4470c != C4470c.f16267i) {
            if (c4470c == C4470c.f16268j) {
                HomeStatisticsHelper.m37693D(false);
                return;
            }
            return;
        }
        CoreModule.f18264c.f20405m0.f20186q2[1] = 1;
        if (this.f74524R) {
            this.f74524R = false;
        }
        HomeStatisticsHelper.m37693D(true);
        m101916K5(m101951T4());
        ur40 ur40Var = ur40.INSTANCE;
        if (ur40Var.m197469m()) {
            ur40Var.m197470n(m101951T4());
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004c  */
    /* JADX INFO: renamed from: F8, reason: merged with bridge method [inline-methods] */
    public final boolean m102036k8(final CoreLikers.C4870a c4870a) {
        String str;
        double d;
        String string;
        String string2;
        if (C4499d.m21895l().m21911x("love_buzz_tab_tip_bubble_key") || C4499d.m21895l().m21911x("key_intl_tribe_pop")) {
            m101951T4().m40823j7(new Runnable() { // from class: l.zx30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f206431a.m102036k8(c4870a);
                }
            });
            return true;
        }
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (jyb.m147479J(c4870a.f20014d)) {
            str = null;
            d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        } else {
            User user = c4870a.f20014d.get(0);
            if (NullChecker.m82486a(user)) {
                str = user.m61308fp().url;
                d = user.location.updatedTime;
            } else {
                str = null;
                d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
        }
        String str2 = str;
        double d2 = d;
        if (!f74490X0) {
            int i = c4870a.f20013c;
            boolean zM139914a = ige0.m139914a(userM116600p9);
            int i2 = this.f74555u;
            if (!zM139914a ? i2 < 1 : i2 < 2) {
                if (i > 0 && (rbb0.m180744q() || CoreModule.f18264c.f20429u0.f19996l0.get().longValue() > 0)) {
                    String strM175775G = q8g0.m175775G(i);
                    if (!ige0.m139914a(userM116600p9)) {
                        string = m101951T4().getString(CoreModule.m30933P().m143405a().mo34377N8() ? R$string.f19717un : R$string.f19810xn, strM175775G);
                    } else if (!"1".equals(strM175775G)) {
                        String str3 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + strM175775G + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
                        if (CoreModule.m30933P().m143405a().mo34377N8()) {
                            string = m101951T4().getString(R$string.f19748vn, str3);
                        } else {
                            string = CoreModule.m30933P().m143405a().mo34494eg() ? m101951T4().getString(R$string.f19841yn, str3) : m101951T4().getString(R$string.f18309An, str3);
                        }
                    } else if (CoreModule.m30933P().m143405a().mo34377N8()) {
                        string = m101951T4().getString(R$string.f19779wn);
                    } else {
                        string = CoreModule.m30933P().m143405a().mo34494eg() ? m101951T4().getString(R$string.f19872zn) : m101951T4().getString(R$string.f18340Bn);
                    }
                    kfe0 kfe0Var = new kfe0((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel, str2, string, i, c4870a.f20012b, c4870a.f20017g, d2, ShareConstants.NEW_VERSION);
                    kfe0Var.m146060s(new x20() { // from class: l.cy30
                        @Override // p153l.x20
                        public final void call() {
                            this.f84296a.m102046m8();
                        }
                    });
                    kfe0Var.m126745x(CorePopLevel.INTL_SEE_ANIM_BUBBLE);
                    llb0.m154703c().m154710i(kfe0Var);
                }
            }
            return false;
        }
        f74490X0 = false;
        if (!pzi0.m174439D(this.f74554t.get().longValue())) {
            this.f74553s.put(0);
        }
        String strM175775G2 = (ige0.m139914a(userM116600p9) || !rbb0.m180744q()) ? q8g0.m175775G(c4870a.f20012b) : q8g0.m175821z(c4870a.f20012b);
        if (!ige0.m139914a(userM116600p9)) {
            string2 = m101951T4().getString(CoreModule.m30933P().m143405a().mo34377N8() ? R$string.f19469mn : R$string.f19562pn, strM175775G2);
        } else if (!"1".equals(strM175775G2)) {
            String str4 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + strM175775G2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
            if (CoreModule.m30933P().m143405a().mo34377N8()) {
                string2 = m101951T4().getString(R$string.f19500nn, str4);
            } else {
                string2 = CoreModule.m30933P().m143405a().mo34494eg() ? m101951T4().getString(R$string.f19593qn, str4) : m101951T4().getString(R$string.f19655sn, str4);
            }
        } else if (CoreModule.m30933P().m143405a().mo34377N8()) {
            string2 = m101951T4().getString(R$string.f19531on);
        } else {
            string2 = CoreModule.m30933P().m143405a().mo34494eg() ? m101951T4().getString(R$string.f19624rn) : m101951T4().getString(R$string.f19686tn);
        }
        String str5 = string2;
        if (ige0.m139914a(CoreModule.f18264c.f20381e0.m116600p9())) {
            if (this.f74553s.get().intValue() >= 4) {
                return false;
            }
        } else if (pzi0.m174439D(this.f74554t.get().longValue())) {
            return false;
        }
        kfe0 kfe0Var2 = new kfe0((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel, str2, str5, c4870a.f20013c, c4870a.f20012b, c4870a.f20017g, d2, ShareConstants.OLD_VERSION);
        kfe0Var2.m146060s(new x20() { // from class: l.by30
            @Override // p153l.x20
            public final void call() {
                this.f78966a.m102041l8();
            }
        });
        kfe0Var2.m126745x(CorePopLevel.INTL_SEE_ANIM_BUBBLE);
        llb0.m154703c().m154710i(kfe0Var2);
        return true;
    }

    /* JADX INFO: renamed from: G5 */
    public final void m101900G5() {
        if (d09.m113376m()) {
            duringCreated((C22421c) lifecycle().filter(new qcj() { // from class: l.ju30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i && of7.m167423t());
                }
            }).flatMap(new qcj() { // from class: l.ou30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.f18264c.f20347S1.m113540G3();
                }
            })).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.qu30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f159518a.m102021h7((GrowthSpamInfo) obj);
                }
            }));
            duringCreated(ConnectivityReceiver.m82473m()).skip(1).filter(new qcj() { // from class: l.ru30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(ConnectivityReceiver.m82467g());
                }
            }).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.su30
                @Override // p153l.y20
                public final void call(Object obj) {
                    of7.m167420o().m167438z();
                }
            }));
        }
        if (d09.m113377n()) {
            duringCreated((C22421c) lifecycle().filter(new qcj() { // from class: l.tu30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i && of7.m167423t() && !CoreModule.f18264c.f20381e0.f89049I3.get().booleanValue());
                }
            }).flatMap(new qcj() { // from class: l.uu30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.f18264c.f20347S1.m113540G3();
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.vu30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f185762a.m102025i7((GrowthSpamInfo) obj);
                }
            }));
        }
        if (d09.m113376m() || d09.m113377n()) {
            duringCreated((C22421c) of7.m167420o().m167432p().filter(new qcj() { // from class: l.wu30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(of7.m167423t());
                }
            }).flatMap(new qcj() { // from class: l.xu30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.f18264c.f20347S1.m113540G3();
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.ku30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f128810a.m102030j7((GrowthSpamInfo) obj);
                }
            }, new y20() { // from class: l.lu30
                @Override // p153l.y20
                public final void call(Object obj) {
                    b240.m101805l1((Throwable) obj);
                }
            }));
            duringCreated(of7.m167420o().m167433q()).subscribe(psd0.m173597H(new y20() { // from class: l.mu30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f138721a.m102035k7((uxj0) obj);
                }
            }, new y20() { // from class: l.nu30
                @Override // p153l.y20
                public final void call(Object obj) {
                    b240.m101800k1((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G6 */
    public final /* synthetic */ void m101901G6() {
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38344q2().startActivityForResult(MediaPickerAct.m48968h2(m101951T4(), 1, false, false, true, "fake_to_good_dlg", MediaPickerAct.f31471D, false, true, CoreModule.f18264c.f20381e0.m116600p9().gender), 19);
    }

    /* JADX INFO: renamed from: G7 */
    public final /* synthetic */ void m101902G7(MigrateAwardDialogData migrateAwardDialogData) {
        m101976Y4();
    }

    /* JADX INFO: renamed from: G8 */
    public void m101903G8() {
        this.f74508J = false;
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38170I5();
    }

    /* JADX INFO: renamed from: H5 */
    public final void m101904H5() {
        if (uih0.m196214m0()) {
            duringCreated(psd0.m173626s(this.f74547n, this.f74502G, spl0.m187375a0() ? c8d0.m108353c0() : C22421c.just(uxj0.f181467a), new scj() { // from class: l.uv30
                @Override // p153l.scj
                /* JADX INFO: renamed from: a */
                public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                    return b240.m101831q1((uxj0) obj, (Boolean) obj2, (uxj0) obj3);
                }
            })).filter(new qcj() { // from class: l.vv30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f185887a.m102040l7((Boolean) obj);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.xv30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f196349a.m102045m7((Boolean) obj);
                }
            }));
        }
        duringCreated(m101951T4().m40829o7()).subscribe(psd0.m173596G(new y20() { // from class: l.yv30
            @Override // p153l.y20
            public final void call(Object obj) {
                b240.m101706P2((TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H6 */
    public final /* synthetic */ void m101905H6(String str) {
        qtk.m177993Q0(m101951T4(), str, new x20() { // from class: l.ax30
            @Override // p153l.x20
            public final void call() {
                this.f73816a.m101901G6();
            }
        });
        CoreModule.f18264c.f20335O2.put("");
    }

    /* JADX INFO: renamed from: H7 */
    public final /* synthetic */ void m101906H7(Boolean bool) {
        m101976Y4();
    }

    /* JADX INFO: renamed from: H8 */
    public final void m101907H8() {
        psd0.m173633z(this.f74531Y);
        this.f74531Y = null;
    }

    /* JADX INFO: renamed from: I5 */
    public final void m101908I5() {
        srf.m187598a().m187599b(ExtraActLifecycle.onResumeFromBackground, this.f74550p0);
        duringCreated(ji30.m144967k()).distinctUntilChanged().skip(1).filter(new qcj() { // from class: l.b140
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((TabName) obj) == TabName.Card);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.c140
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20405m0.m32146s6("initiative", "tab", null);
            }
        }));
        duringCreated(CoreModule.f18264c.f20405m0.f20115T).subscribe(psd0.m173596G(new y20() { // from class: l.d140
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84638a.m102050n7((uxj0) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20405m0.f20112S).filter(new qcj() { // from class: l.f140
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(gra.m131768x() || uqb0.f180376H.guessedCurrentServerTime() - ((Long) ((pf60) obj).f152157b).longValue() < Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
            }
        }).switchMap(new qcj() { // from class: l.g140
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return b240.m101809m0((pf60) obj);
            }
        }).filter(new qcj() { // from class: l.h140
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a(CoreModule.f18264c.f20405m0.f20112S) && NullChecker.m82486a(CoreModule.f18264c.f20405m0.f20112S.m222761e()));
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.i140
            @Override // p153l.y20
            public final void call(Object obj) {
                b240.m101683J4((TabName) obj);
            }
        }));
        tu2.m192703a("[See_Toast]", "insertActionObs sub done");
        duringCreated((C22421c) CoreModule.f18264c.f20405m0.f20136a0.take(1).switchMap(new qcj() { // from class: l.j140
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20405m0.f20139b0;
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.k140
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123449a.m102054o7((ActionData) obj);
            }
        }));
        duringCreated(ji30.m144967k()).distinctUntilChanged().skip(1).subscribe(psd0.m173596G(new y20() { // from class: l.l140
            @Override // p153l.y20
            public final void call(Object obj) {
                llb0.m154703c().m154712k();
            }
        }));
    }

    /* JADX INFO: renamed from: I6 */
    public final /* synthetic */ void m101909I6(pf60 pf60Var) {
        this.f74548o.m137019l(Boolean.FALSE);
        m101981Z4();
    }

    /* JADX INFO: renamed from: I7 */
    public final /* synthetic */ void m101910I7(Pair pair) {
        ur40.INSTANCE.m197474r((String) pair.first, (String) pair.second, m101951T4());
    }

    /* JADX INFO: renamed from: I8 */
    public final void m101911I8() {
        y20<Boolean> y20Var = new y20() { // from class: l.my30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139313a.m102051n8((Boolean) obj);
            }
        };
        final NewMainAct newMainActM101951T4 = m101951T4();
        if (!m101951T4().getIntent().getBooleanExtra("EXTRA_SHOW_TUTORIAL", false) || CoreModule.f18264c.f20381e0.f89330t1.get().booleanValue()) {
            if (xxv.m213589p(newMainActM101951T4)) {
                m101915J8();
            } else {
                if (!xxv.m213586m()) {
                    xxv.m213578e();
                }
                this.f74543k.m137019l(uxj0.f181467a);
            }
            if (!iz40.m142788y(newMainActM101951T4, true)) {
                this.f74502G.m137019l(Boolean.TRUE);
            }
            m102009e9();
            return;
        }
        this.f74504H = true;
        CoreModule.f18264c.f20381e0.f89330t1.put(Boolean.TRUE);
        m101951T4().getIntent().removeExtra("EXTRA_SHOW_TUTORIAL");
        if (TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().source, "facebook") || TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().source, "google")) {
            this.f74543k.m137019l(uxj0.f181467a);
        } else {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38359s6(this.f74551q, y20Var, new x20() { // from class: l.ny30
                @Override // p153l.x20
                public final void call() {
                    this.f144288a.m102058p8(newMainActM101951T4);
                }
            });
        }
    }

    /* JADX INFO: renamed from: J5 */
    public final void m101912J5() {
        if (vq8.m202358b()) {
            duringCreated(psd0.m173625r(z0n.m218136a().m218139d(), lifecycle(), new cu30())).filter(new qcj() { // from class: l.du30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return b240.m101821o2((pf60) obj);
                }
            }).map(new qcj() { // from class: l.fu30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return b240.m101654D2((pf60) obj);
                }
            }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.gu30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f106464a.m101879A8((PushMessage) obj);
                }
            }));
            CoreModule.m30934Q().mo68399Ep();
        }
    }

    /* JADX INFO: renamed from: J6 */
    public final /* synthetic */ C22421c m101913J6(uxj0 uxj0Var) {
        return psd0.m173628u(CoreModule.f18264c.f20381e0.m116596o9().distinctUntilChanged(), CoreModule.f18264c.f20405m0.m32069W8().doOnSubscribe(new x20() { // from class: l.fw30
            @Override // p153l.x20
            public final void call() {
                uqi.m197339f(LaunchStep.SuggestNet);
            }
        }).doOnNext(new y20() { // from class: l.gw30
            @Override // p153l.y20
            public final void call(Object obj) {
                uqi.m197337d(LaunchStep.SuggestNet);
            }
        }), m101951T4().m40829o7().distinctUntilChanged(new rcj() { // from class: l.iw30
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return b240.m101672H3((TabName) obj, (TabName) obj2);
            }
        }), uj4.m196316a().mo136051d(3).timeout(3000L, TimeUnit.MILLISECONDS).materialize().observeOn(fo0.m126432a()).first().doOnNext(new y20() { // from class: l.jw30
            @Override // p153l.y20
            public final void call(Object obj) {
                uqi.m197337d(LaunchStep.AsyncLayout);
            }
        }).doOnSubscribe(new x20() { // from class: l.kw30
            @Override // p153l.x20
            public final void call() {
                b240.m101738W3();
            }
        }), CoreModule.f18264c.f20381e0.f89047I1, new ucj() { // from class: l.lw30
            @Override // p153l.ucj
            /* JADX INFO: renamed from: a */
            public final Object mo115512a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return jyb.m147494Y((PartialListOpt) obj2, (TabName) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: J7 */
    public final /* synthetic */ void m101914J7(UserPrivilege userPrivilege) {
        SVGALoader.with(m101951T4()).from("https://auto.tancdn.com/v1/raw/644d6fdb-68cd-4fd0-997e-d18646ddb13c14.pdf").downloadOnly();
    }

    /* JADX INFO: renamed from: J8 */
    public void m101915J8() {
        if (xxv.m213586m()) {
            if (this.f74506I) {
                this.f74506I = false;
                if (this.f74504H) {
                    return;
                }
                this.f74543k.m137019l(uxj0.f181467a);
                return;
            }
            return;
        }
        if (d79.m114673d0() || !this.f74521P0) {
            String[] strArr = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
            if (d79.m114673d0()) {
                if (!xxv.m213590q() || (qxv.m178618c() && !xxv.m213588o())) {
                    m102013f9();
                    return;
                } else {
                    m102074t8();
                    return;
                }
            }
            if (xxv.m213590q() && (!qxv.m178618c() || xxv.m213588o())) {
                m102074t8();
                return;
            }
            if (this.f74517N0 == null) {
                this.f74517N0 = new as60(Arrays.asList(strArr));
            }
            fph0.m126683n0(fph0.f100175h);
            xxv.m213591r();
            this.f74521P0 = true;
            l51.m152893M(new RunnableC15898b(strArr));
        }
    }

    /* JADX INFO: renamed from: K5 */
    public final void m101916K5(NewMainAct newMainAct) {
        CoreModule.f18264c.f20292A1.m102936t3(newMainAct, new Function1() { // from class: l.tw30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b240.m101798j4((IntlMarketConfigEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K6 */
    public final /* synthetic */ void m101917K6() {
        m102063r5();
        m102067s5("swipeFinalDelay");
    }

    /* JADX INFO: renamed from: K7 */
    public final /* synthetic */ void m101918K7(C4470c c4470c) {
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38210P5();
    }

    /* JADX INFO: renamed from: K8 */
    public void m101919K8() {
        uqb0.f180370E.m80051t();
        CoreModule.f18264c.f20405m0.m32046R5();
        CoreModule.f18264c.f20405m0.m32130m8();
    }

    /* JADX INFO: renamed from: L5 */
    public final void m101920L5() {
        duringCreated(CoreModule.f18264c.f20405m0.f20067B2).subscribe(psd0.m173596G(new y20() { // from class: l.iz30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117657a.m102057p7((uxj0) obj);
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
    public final /* synthetic */ void m101921L6(pf60 pf60Var) {
        boolean z;
        boolean z2 = C8018a.f22733g;
        uqi.m197337d(LaunchStep.RenderTask);
        PartialListOpt partialListOpt = (PartialListOpt) pf60Var.f152156a;
        int size = partialListOpt.loaded.size();
        boolean zNeedRefresh = partialListOpt.needRefresh();
        List<CoreSuggested.UserInfo> listM38915y = ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).f22630M.m38915y(partialListOpt.loaded);
        if (TextUtils.isEmpty(f74488V0) && !jyb.m147479J(listM38915y) && (!uih0.m196214m0() || !uih0.m196232y0(listM38915y.get(0).f20214id))) {
            f74488V0 = listM38915y.get(0).f20214id;
        }
        if (size != listM38915y.size()) {
            t4j.m189282h("render List refresh change " + size + Constants.SEPARATOR_COMMA + listM38915y.size());
            z = true;
        } else {
            z = zNeedRefresh;
        }
        StringBuilder sb = new StringBuilder("render cards: ");
        sb.append(z);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(zNeedRefresh);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(!partialListOpt.hasMore() && listM38915y.size() == 0);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(listM38915y.isEmpty());
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(partialListOpt.getReasonStr());
        t4j.m189282h(sb.toString());
        partialListOpt.resetReason();
        if (gra.m131654Z2()) {
            quq.m178172H(jyb.m147479J(listM38915y));
        }
        if (z) {
            if (gra.m131773y()) {
                ExpandedCardStyleHelper.m39093o().m39094A(jyb.m147479J(listM38915y) ? "" : listM38915y.get(0).f20214id);
            }
            listM38915y.size();
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).f22630M.m38910K(listM38915y);
        }
        if (gra.m131606N3() && jyb.m147479J(listM38915y) && ExpandedCardStyleHelper.m39093o().m39106s()) {
            ExpandedCardStyleHelper.m39093o().m39099k(null, null, "empty card");
        }
        if (!z) {
            partialListOpt.setRefreshValue(true);
        }
        if (listM38915y.size() > 0) {
            m101985a5(listM38915y.get(0));
            if (spl0.m187374Z()) {
                m101990b5(listM38915y.get(0));
            }
        }
        this.f74535c = true;
        m101951T4().postDelayed(new Runnable() { // from class: l.ix30
            @Override // java.lang.Runnable
            public final void run() {
                this.f117313a.m101917K6();
            }
        }, 100L);
        if (partialListOpt.hasMore() || listM38915y.size() != 0) {
            boolean zIsEmpty = listM38915y.isEmpty();
            V v2 = this.viewModel;
            if (zIsEmpty) {
                ((ViewTreeObserverOnGlobalLayoutListenerC8017b) v2).m38193M5(true, true, true);
            } else {
                ((ViewTreeObserverOnGlobalLayoutListenerC8017b) v2).m38193M5(false, true, true);
            }
        } else {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38193M5(true, false, true);
        }
        if (!((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38179K3() && this.f74546m.m222761e() == null) {
            this.f74546m.m137019l(uxj0.f181467a);
        }
        if (d09.m113370g() && NullChecker.m82486a(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39812d()) && !((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38179K3()) {
            this.f74547n.m137019l(uxj0.f181467a);
        }
        if (IntlCountryCodeController.m29125v() && NullChecker.m82486a(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39812d()) && (((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39812d() instanceof NewNewProfileCard)) {
            ((NewNewProfileCard) ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39812d()).setOnTouchListener(new ViewOnTouchListenerC15897a());
        }
        if (!jyb.m147479J(listM38915y) && ((!uih0.m196214m0() || !uih0.m196232y0(listM38915y.get(0).f20214id)) && (((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38344q2().getParentFragment() instanceof cvl))) {
            ((cvl) ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38344q2().getParentFragment()).mo39566e3();
        }
        if (C8618a.m48771w().m48784M() && NullChecker.m82486a(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2()) && NullChecker.m82486a(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39812d())) {
            if ((((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39812d() instanceof NewNewProfileCard) || (((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39812d() instanceof u7m)) {
                ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38309i6();
            }
        }
    }

    /* JADX INFO: renamed from: L7 */
    public final /* synthetic */ void m101922L7(pf60 pf60Var) {
        if (bnl0.m105529O0(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).f22646U.mo118296m())) {
            sfj0.m185601h("e_advanced_filter_red_dot", "p_suggest_users_home_view", new sfj0.C20032a[0]);
        }
    }

    /* JADX INFO: renamed from: L8 */
    public void m101923L8(boolean z) {
        final C22507a<PartialListOpt<CoreSuggested.UserInfo>> c22507a = this.f74545l;
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = c22507a.m222761e();
        if (z || partialListOptM222761e == null || partialListOptM222761e.hasMore()) {
            CoreModule.f18264c.f20405m0.m32130m8().subscribe(psd0.m173597H(new y20() { // from class: l.vx30
                @Override // p153l.y20
                public final void call(Object obj) {
                    b240.m101746Y3((uxj0) obj);
                }
            }, new y20() { // from class: l.wx30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f191362a.m102062q8(c22507a, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: M5 */
    public final void m101924M5() {
        if (IntlCountryCodeController.m29114k()) {
            duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).filter(new qcj() { // from class: l.xs30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((User) obj).isVIP() && rbb0.m180744q() && CoreModule.f18264c.f20381e0.f89119S0.get().booleanValue());
                }
            }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.tt30
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20381e0.m116513S7().subscribe(psd0.m173591B());
                }
            }));
        }
        if (IntlCountryCodeController.m29114k()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38221R5(false);
        } else {
            C4883c c4883c = CoreModule.f18264c;
            c4883c.f20396j0.f20037h0 = false;
            duringCreated((C22421c) c4883c.f20381e0.m116596o9().flatMap(new qcj() { // from class: l.px30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return psd0.m173625r(CoreModule.f18264c.f20396j0.m31587G4(), CoreModule.f18264c.m32486n3().map(new qcj() { // from class: l.tx30
                        @Override // p153l.qcj
                        public final Object call(Object obj2) {
                            return Integer.valueOf(((Counter) obj2).likersLimit.remaining);
                        }
                    }).distinctUntilChanged(), new rcj() { // from class: l.ux30
                        @Override // p153l.rcj
                        public final Object call(Object obj2, Object obj3) {
                            return new pf60((FreeTrialEnvelope) obj2, (Integer) obj3);
                        }
                    });
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.ay30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f73944a.m102061q7((pf60) obj);
                }
            }, new y20() { // from class: l.ly30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f134028a.m102065r7((Throwable) obj);
                }
            }));
        }
        if (nmp.m163833b()) {
            duringCreated(psd0.m173625r(CoreModule.f18264c.f20381e0.m116596o9().map(new uy30()).distinctUntilChanged(), CoreModule.f18264c.m32486n3().map(new qcj() { // from class: l.vy30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(rbb0.m180743p());
                }
            }).distinctUntilChanged(), new rcj() { // from class: l.wy30
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return pf60.m172085a((Boolean) obj, (Boolean) obj2);
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.xy30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f196714a.m102069s7((pf60) obj);
                }
            }, new y20() { // from class: l.yy30
                @Override // p153l.y20
                public final void call(Object obj) {
                    b240.m101773f1((Throwable) obj);
                }
            }));
        }
        if (!f74492Z0.get().booleanValue() && !pgj.m172246c() && !nmp.m163834c()) {
            duringCreated(new pcj() { // from class: l.ex30
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return CoreModule.f18264c.f20429u0.m31415S6();
                }
            }).filter(new qcj() { // from class: l.bz30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f79094a.m102073t7((CoreLikers.C4870a) obj);
                }
            }).distinctUntilChanged().subscribe(psd0.m173597H(new y20() { // from class: l.mz30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f139475a.m102077u7((CoreLikers.C4870a) obj);
                }
            }, new y20() { // from class: l.xz30
                @Override // p153l.y20
                public final void call(Object obj) {
                    b240.m101709Q0((Throwable) obj);
                }
            }));
            duringCreated(this.f74553s.obs()).filter(new qcj() { // from class: l.i040
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Integer) obj).intValue() >= 1);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.t040
                @Override // p153l.y20
                public final void call(Object obj) {
                    b240.f74492Z0.put(Boolean.TRUE);
                }
            }));
        }
        duringCreated(CoreModule.f18264c.f20405m0.f20086I0).subscribe(psd0.m173596G(new y20() { // from class: l.e140
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91566a.m102081v7((uxj0) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20405m0.f20110R0).flatMap(new qcj() { // from class: l.p140
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20429u0.m31415S6();
            }
        }).filter(new qcj() { // from class: l.a240
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20405m0.f20110R0.m222761e();
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.it30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116788a.m102085w7((CoreLikers.C4870a) obj);
            }
        }));
        CoreModule.f18264c.f20301D1.m184619h3();
        duringCreated(CoreModule.f18264c.f20405m0.f20153f2.asObservable()).subscribe(psd0.m173596G(new y20() { // from class: l.eu30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95838a.m102089x7((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20405m0.f20162i2.asObservable()).subscribe(psd0.m173596G(new y20() { // from class: l.pu30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154150a.m102093y7((SwipeDirection) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20405m0.f20156g2.asObservable()).subscribe(psd0.m173596G(new y20() { // from class: l.av30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73581a.m102097z7((SwipeDirection) obj);
            }
        }));
        int iIntValue = CoreModule.f18264c.f20318J0.f134519i0.get().intValue();
        int i = (iIntValue / 10) % 100;
        Date date = new Date(pzi0.m174454o());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9()) && !CoreModule.f18264c.f20381e0.m116600p9().isFemale() && ((!CoreModule.f18276o.m132214d().mo34769Vd() || !CoreModule.f18264c.f20381e0.m116600p9().isUltraPremium()) && d79.m114698q() && (iIntValue % 10 < 2 || calendar.get(2) + 1 != i))) {
            duringCreated(CoreModule.f18264c.f20318J0.m156791r3()).subscribe(psd0.m173597H(new y20() { // from class: l.lv30
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20318J0.f134525o0 = ((Boolean) obj).booleanValue();
                }
            }, new y20() { // from class: l.wv30
                @Override // p153l.y20
                public final void call(Object obj) {
                    b240.m101753a3((Throwable) obj);
                }
            }));
        }
        if (d79.m114665X()) {
            creates(new y20() { // from class: l.hw30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f111864a.m101882B7((Bundle) obj);
                }
            });
        }
        if (IntlCountryCodeController.m29115l() && !TextUtils.isEmpty(uqb0.f180380L.f17867f.get())) {
            creates(new y20() { // from class: l.sw30
                @Override // p153l.y20
                public final void call(Object obj) {
                    b240.m101783h0((Bundle) obj);
                }
            });
        }
        if (!TextUtils.isEmpty(uqb0.f180380L.f17868g.get())) {
            creates(new y20() { // from class: l.dx30
                @Override // p153l.y20
                public final void call(Object obj) {
                    b240.m101768e1((Bundle) obj);
                }
            });
        }
        if (IntlCountryCodeController.m29112i() && NullChecker.m82486a(uqb0.f180380L.f17869h.get())) {
            CoreModule.f18264c.f20381e0.m116450C9(uqb0.f180380L.f17869h.get());
            uqb0.f180380L.f17869h.clear();
        }
    }

    /* JADX INFO: renamed from: M6 */
    public final /* synthetic */ void m101925M6(uxj0 uxj0Var) {
        if (!((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38236U2("removeSwipeGuideCard s1 ") && ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38279c6()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38289e6();
        }
    }

    /* JADX INFO: renamed from: M7 */
    public final /* synthetic */ void m101926M7(Integer num) {
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38215Q5(true);
    }

    /* JADX INFO: renamed from: M8 */
    public void m101927M8() {
        if (this.f74541i) {
            this.f74541i = false;
        }
        m101976Y4();
    }

    /* JADX INFO: renamed from: N5 */
    public final void m101928N5() {
        if (gra.m131667c3()) {
            creates(new y20() { // from class: l.bu30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f78425a.m101886C7((Bundle) obj);
                }
            });
            CoreModule.f18264c.f20306F0.m118454q3();
            quq.m178189Y(m101951T4());
        } else if (gra.m131654Z2()) {
            CoreModule.f18264c.f20306F0.m118454q3();
            quq.m178188X(m101951T4());
        }
    }

    /* JADX INFO: renamed from: N6 */
    public final /* synthetic */ void m101929N6(uxj0 uxj0Var) {
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38332n6();
    }

    /* JADX INFO: renamed from: N7 */
    public final /* synthetic */ void m101930N7() {
        if (!this.f74542j && CoreModule.m30929H().signedIn_()) {
            y63.m214366j().m214376t();
            if (ric0.m181583m()) {
                C18823n9.m161958j().m161967s();
            }
        }
        l51.m152890J(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38383y2());
    }

    /* JADX INFO: renamed from: N8 */
    public boolean m101931N8() {
        return f74492Z0.get().booleanValue();
    }

    /* JADX INFO: renamed from: O6 */
    public final /* synthetic */ void m101932O6(uxj0 uxj0Var) {
        if (!NullChecker.m82486a(uxj0Var) || this.f74541i) {
            return;
        }
        m101976Y4();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O7 */
    public final /* synthetic */ Boolean m101933O7(pf60 pf60Var) {
        boolean z;
        if (pf60Var.f152157b == C4470c.f16267i) {
            CoreLikers.LikersTriggerBy likersTriggerBy = CoreLikers.LikersTriggerBy.home_total_liker_float;
            F f = pf60Var.f152156a;
            if ((likersTriggerBy == ((CoreLikers.C4870a) f).f20011a || CoreLikers.LikersTriggerBy.home_new_liker_float == ((CoreLikers.C4870a) f).f20011a) && ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).act().m40820i6(TabName.Card) && !((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).act().isDialogShowing()) {
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
    public void m101934O8(C8145d c8145d, Throwable th) {
        HomeStatisticsHelper.m37690A(c8145d, th);
        this.f74539g = false;
        this.f74540h = false;
        sdp.m185485b();
    }

    /* JADX INFO: renamed from: P5 */
    public final void m101935P5() {
        duringCreated(CoreModule.f18264c.f20339Q0.m115267w3().filter(new qcj() { // from class: l.b040
            @Override // p153l.qcj
            public final Object call(Object obj) {
                MigrateAwardDialogData migrateAwardDialogData = (MigrateAwardDialogData) obj;
                return Boolean.valueOf(migrateAwardDialogData != null && migrateAwardDialogData.showDialog);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.c040
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79204a.m101902G7((MigrateAwardDialogData) obj);
            }
        }, new y20() { // from class: l.d040
            @Override // p153l.y20
            public final void call(Object obj) {
                b240.m101822o3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P6 */
    public final /* synthetic */ void m101936P6() {
        if (NullChecker.m82486a(m101951T4())) {
            m101976Y4();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P7 */
    public final /* synthetic */ Boolean m101937P7(pf60 pf60Var) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (CoreLikers.LikersTriggerBy.home_total_liker_float == ((CoreLikers.C4870a) pf60Var.f152156a).f20011a && j7d0.m143777f0() && !m101951T4().isDialogShowing() && !userM116600p9.isBanned()) {
            if (spl0.m187354F()) {
                rj50 rj50VarM172574f = pk50.m172568j().m172574f();
                OmsDialog omsDialog = OmsDialog.p_offline_popup;
                if (rj50VarM172574f.m181649M(omsDialog.getIdentifier(), false)) {
                    j7d0.m143779h0(this);
                    pk50.m172568j().m172574f().m181664b0(omsDialog.getIdentifier(), 0, false);
                } else {
                    j7d0.m143774c0().f118681f = true;
                }
            } else {
                j7d0.m143779h0(this);
            }
        }
        boolean zM143775d0 = j7d0.m143775d0(((CoreLikers.C4870a) pf60Var.f152156a).f20011a);
        if (f74490X0 || !zM143775d0) {
            CoreModule.f18264c.f20429u0.f19998n0.put(Long.valueOf(uqb0.f180376H.guessedCurrentServerTime()));
        }
        F f = pf60Var.f152156a;
        if (((CoreLikers.C4870a) f).f20012b == 0) {
            f74490X0 = false;
        }
        if (((CoreLikers.C4870a) f).f20012b > 0 && !zM143775d0) {
            return Boolean.TRUE;
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).act().m40826l7();
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: P8 */
    public void m101938P8(C8145d c8145d, String str) {
        HomeStatisticsHelper.m37691B(c8145d, str);
        this.f74539g = false;
        this.f74540h = false;
        sdp.m185485b();
    }

    /* JADX INFO: renamed from: Q5 */
    public final void m101939Q5() {
        duringCreated(psd0.m173627t(CoreModule.f18264c.f20381e0.m116596o9(), CoreModule.f18264c.f20429u0.m31417T6(), CoreModule.f18264c.m32486n3(), lifecycle(), new tcj() { // from class: l.vz30
            @Override // p153l.tcj
            /* JADX INFO: renamed from: b */
            public final Object mo112959b(Object obj, Object obj2, Object obj3, Object obj4) {
                User user = (User) obj;
                CoreLikers.C4870a c4870a = (CoreLikers.C4870a) obj2;
                return Boolean.valueOf(!user.isFemale() && CoreModule.f18264c.f20381e0.m116575j8(user) && rbb0.m180735g() == 0 && c4870a != null && c4870a.f20011a == CoreLikers.LikersTriggerBy.new_like_dialog && ((Counter) obj3) != null && ((C4470c) obj4) == C4470c.f16267i);
            }
        })).filter(new qcj() { // from class: l.wz30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return b240.m101850u0((Boolean) obj);
            }
        }).first().compose(psd0.m173607R()).subscribe(psd0.m173597H(new y20() { // from class: l.yz30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202169a.m101906H7((Boolean) obj);
            }
        }, new y20() { // from class: l.zz30
            @Override // p153l.y20
            public final void call(Object obj) {
                b240.m101721S2((Throwable) obj);
            }
        }));
        creates(new y20() { // from class: l.a040
            @Override // p153l.y20
            public final void call(Object obj) {
                b240.m101871z0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q6 */
    public final /* synthetic */ void m101940Q6(Boolean bool) {
        l51.m152888H(m101951T4(), new Runnable() { // from class: l.yw30
            @Override // java.lang.Runnable
            public final void run() {
                this.f201778a.m101936P6();
            }
        }, 400L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q7 */
    public final /* synthetic */ void m101941Q7(pf60 pf60Var) {
        if (m102036k8((CoreLikers.C4870a) pf60Var.f152156a)) {
            return;
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).act().m40826l7();
    }

    /* JADX INFO: renamed from: Q8 */
    public void m101942Q8(int i) {
        this.f74534b = i;
    }

    /* JADX INFO: renamed from: R5 */
    public final void m101943R5() {
        ur40 ur40Var = ur40.INSTANCE;
        if (ur40Var.m197469m()) {
            duringCreated(ur40Var.m197468l()).subscribe(psd0.m173597H(new y20() { // from class: l.hu30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f111615a.m101910I7((Pair) obj);
                }
            }, new y20() { // from class: l.iu30
                @Override // p153l.y20
                public final void call(Object obj) {
                    b240.m101774f2((Throwable) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R6 */
    public final /* synthetic */ void m101944R6(bkj0 bkj0Var) {
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38250W5((DoublePair) bkj0Var.f77081a, ((RoamedLocationData) bkj0Var.f77082b).data);
    }

    /* JADX INFO: renamed from: R7 */
    public final /* synthetic */ void m101945R7(Boolean bool) {
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38215Q5(true);
    }

    /* JADX INFO: renamed from: R8 */
    public void m101946R8(String str) {
        this.f74533a = str;
    }

    /* JADX INFO: renamed from: S5 */
    public final void m101947S5() {
        if (joa.m146373Y3()) {
            duringCreated(CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("oDiamond"))).filter(new qcj() { // from class: l.dz30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(joa.m146357G3());
                }
            }).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.ez30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f96557a.m101914J7((UserPrivilege) obj);
                }
            }));
        } else {
            SVGALoader.with(m101951T4()).from("https://auto.tancdn.com/v1/raw/644d6fdb-68cd-4fd0-997e-d18646ddb13c14.pdf").downloadOnly();
        }
        SVGALoader.with(m101951T4()).from("https://auto.tancdn.com/v1/raw/84746e2a-9059-47ff-90af-07839ec09c0f14.pdf").downloadOnly();
        SVGALoader.with(m101951T4()).from("https://auto.tancdn.com/v1/raw/05053d7f-77ec-4650-a3b2-9eeb949bbafb14.pdf").downloadOnly();
        SVGALoader.with(m101951T4()).from("https://auto.tancdn.com/v1/raw/742c2a25-1a5c-441c-9433-72583a165ddf14.pdf").downloadOnly();
    }

    /* JADX INFO: renamed from: S6 */
    public final /* synthetic */ void m101948S6(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        V v2 = this.viewModel;
        if (zBooleanValue) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) v2).m38322l6();
        } else if (((ViewTreeObserverOnGlobalLayoutListenerC8017b) v2).m38279c6()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38289e6();
        }
    }

    /* JADX INFO: renamed from: S7 */
    public final /* synthetic */ void m101949S7(Boolean bool) {
        if (d79.m114663V() && !pzi0.m174439D(CoreModule.f18264c.f20318J0.f134518h0.get().longValue()) && joa.m146354D3()) {
            CoreModule.f18264c.f20318J0.m156788c4(SummarizedPrivilegesId.ultraPremium);
        }
        if (CoreModule.f18264c.f20318J0.m156766F3()) {
            b83.m102905g(m101951T4());
        } else {
            b83.m102906h(m101951T4(), ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38300h2(), null);
        }
    }

    /* JADX INFO: renamed from: S8 */
    public void m101950S8(String str) {
        this.f74507I0 = str;
    }

    /* JADX INFO: renamed from: T4 */
    public NewMainAct m101951T4() {
        return ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).act();
    }

    /* JADX INFO: renamed from: T5 */
    public final void m101952T5() {
        duringCreated(lifecycle()).filter(new qcj() { // from class: l.z040
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16269k);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.a140
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f67778a.m101918K7((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T6 */
    public final /* synthetic */ void m101953T6(Boolean bool) {
        if (bool.booleanValue()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38207P2();
            return;
        }
        if (CoreModule.f18264c.f20405m0.f20092K0.m222765i() && CoreModule.f18264c.f20405m0.f20092K0.m222761e().booleanValue()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38322l6();
        } else if (((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38279c6()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38289e6();
        }
    }

    /* JADX INFO: renamed from: T7 */
    public final /* synthetic */ void m101954T7(TabName tabName) {
        y2h0.m214080g().m214086j((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel);
    }

    /* JADX INFO: renamed from: T8 */
    public void m101955T8(boolean z) {
        this.f74498E = z;
    }

    /* JADX INFO: renamed from: U4 */
    public void m101956U4() {
        long jM174454o = this.f74523Q0 - pzi0.m174454o();
        if (jM174454o >= 0 || jM174454o <= -7200000) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38259Y5(1);
        } else {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38259Y5(2);
        }
        this.f74530X = C22421c.interval(0L, 500L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.ky30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129284a.m102064r6((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U5 */
    public final void m101957U5() {
        if (spl0.m187364P()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("https://fe-static.tancdn.com/v1/raw/b63ed4a9-0bbb-4a36-b6ea-91dbb32addd814.svga");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/4475f01c-8dd0-40b9-851d-f60f578c08db14.svga");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/3fde0b7d-f6d7-410d-9454-59d1b7d1783014.svga");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/1ecec93e-84b2-4731-a927-90928bb72cb114.svga");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/a0ef67b0-beed-4cfc-b970-3b321ea7b78f14.svga");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/444d9220-d23d-4a74-9eb7-43b89c4f2f5614.svga");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/b24ea63e-9d42-4569-a402-a155d1fa76ae14.svga");
            SVGALoader.with(App.f16088e).batchDownload(arrayList);
        }
    }

    /* JADX INFO: renamed from: U6 */
    public final /* synthetic */ void m101958U6(String str) {
        CardButtonsShowAndHideType cardButtonsShowAndHideTypeM38284d6 = ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38284d6();
        if (TEnum.equals(cardButtonsShowAndHideTypeM38284d6, "show")) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38155F5();
        } else if (TEnum.equals(cardButtonsShowAndHideTypeM38284d6, "hide")) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38150E5();
        } else if (TEnum.equals(cardButtonsShowAndHideTypeM38284d6, CardButtonsShowAndHideType.only_hide_operation_btn)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38381x5();
        }
    }

    /* JADX INFO: renamed from: U7 */
    public final /* synthetic */ void m101959U7(String str) {
        if (TextUtils.equals(str, m101951T4().getPopLifeName()) && NullChecker.m82486a(y2h0.m214080g().m214084e())) {
            y2h0.m214080g().m214086j((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel);
        }
    }

    /* JADX INFO: renamed from: U8 */
    public void m101960U8(boolean z) {
        this.f74497D = z;
    }

    /* JADX INFO: renamed from: V4 */
    public final void m101961V4(User user) {
        m102059q5(user, true);
    }

    /* JADX INFO: renamed from: V5 */
    public final void m101962V5() {
        duringCreated(psd0.m173625r(m101951T4().m40829o7().distinctUntilChanged(), m101951T4().lifecycle().distinctUntilChanged(), new p040()).filter(new qcj() { // from class: l.q040
            @Override // p153l.qcj
            public final Object call(Object obj) {
                pf60 pf60Var = (pf60) obj;
                return Boolean.valueOf(pf60Var.f152157b == C4470c.f16267i && TextUtils.equals(((TabName) pf60Var.f152156a).name(), TabName.Card.name()));
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.r040
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160582a.m101922L7((pf60) obj);
            }
        }, new y20() { // from class: l.s040
            @Override // p153l.y20
            public final void call(Object obj) {
                b240.m101814n0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V6 */
    public final /* synthetic */ void m101963V6(uxj0 uxj0Var) {
        if (NullChecker.m82486a(this.viewModel) && NullChecker.m82486a(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38167I2()) && NullChecker.m82486a(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38152F2())) {
            bnl0.m105524M(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38167I2(), false);
            bnl0.m105524M(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38152F2(), true);
        }
    }

    /* JADX INFO: renamed from: V7 */
    public final /* synthetic */ void m101964V7() {
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38343p6();
    }

    /* JADX INFO: renamed from: V8 */
    public void m101965V8(boolean z) {
        this.f74496C = z;
    }

    /* JADX INFO: renamed from: W4 */
    public boolean m101966W4() {
        return (TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().source, "wechat") || TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().source, "qq")) && d09.m113378o() && !CoreModule.f18264c.f20381e0.f89190b0.get().booleanValue();
    }

    /* JADX INFO: renamed from: W5 */
    public final void m101967W5() {
        if (e7d0.m119697f()) {
            CoreModule.f18264c.f20405m0.m32101e9();
            CoreModule.f18264c.f20410n2.m121464J3(CoreModule.m30929H().userId());
        }
    }

    /* JADX INFO: renamed from: W6 */
    public final /* synthetic */ void m101968W6(uxj0 uxj0Var) {
        if (NullChecker.m82486a(this.viewModel) && NullChecker.m82486a(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38167I2()) && NullChecker.m82486a(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38152F2())) {
            bnl0.m105524M(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38167I2(), true);
            bnl0.m105524M(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38152F2(), true);
        }
    }

    /* JADX INFO: renamed from: W7 */
    public final /* synthetic */ void m101969W7(Boolean bool) {
        if (c8d0.m108356f0() && bool.booleanValue()) {
            l51.m152888H(m101951T4(), new Runnable() { // from class: l.sx30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f171080a.m101964V7();
                }
            }, 800L);
        }
    }

    /* JADX INFO: renamed from: W8 */
    public void m101970W8(boolean z) {
        this.f74495B = z;
    }

    /* JADX INFO: renamed from: X4 */
    public void m101971X4() {
        if (this.f74512L) {
            return;
        }
        this.f74512L = true;
        CoreModule.f18264c.f20381e0.f89190b0.put(Boolean.valueOf(upp0.m197170e().m197172g()));
        if (!upp0.m197170e().m197172g()) {
            this.f74548o.m137019l(Boolean.TRUE);
        } else {
            this.f74505H0 = true;
            upp0.m197170e().m197173h(m101951T4()).flatMap(new qcj() { // from class: l.bx30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return b240.m101841s1((Boolean) obj);
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.cx30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f84170a.m102068s6((uxj0) obj);
                }
            }, new y20() { // from class: l.fx30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f101235a.m102072t6((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: X5 */
    public final void m101972X5() {
        if (spl0.m187368T()) {
            CoreModule.f18264c.f20413o2.m176355h3();
        }
    }

    /* JADX INFO: renamed from: X6 */
    public final /* synthetic */ void m101973X6(SwipeDirection swipeDirection) {
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38332n6();
        SwipeDirection swipeDirection2 = SwipeDirection.RIGHT;
        if (swipeDirection == swipeDirection2) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39804A(swipeDirection2);
            return;
        }
        SwipeDirection swipeDirection3 = SwipeDirection.LEFT;
        if (swipeDirection == swipeDirection3) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39804A(swipeDirection3);
            return;
        }
        SwipeDirection swipeDirection4 = SwipeDirection.UP;
        if (swipeDirection == swipeDirection4) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39804A(swipeDirection4);
        }
    }

    /* JADX INFO: renamed from: X7 */
    public final /* synthetic */ C22421c m101974X7(User user) {
        return this.f74552r;
    }

    /* JADX INFO: renamed from: X8 */
    public void m101975X8(boolean z) {
        this.f74494A = z;
    }

    /* JADX INFO: renamed from: Y4 */
    public void m101976Y4() {
        if (CoreModule.f18264c.f20381e0.m116600p9() == null) {
            this.f74513L0 = 1;
            if (NullChecker.m82486a(this.f74515M0) && !this.f74515M0.isUnsubscribed()) {
                this.f74515M0.unsubscribe();
            }
            CrashHelper.m82479c(new IllegalStateException("checkIntro error when illegal account state, userId:" + CoreModule.m30929H().userId() + ", login: " + CoreModule.m30929H().signedIn_() + ", me == null"));
            this.f74515M0 = duringCreated(psd0.m173625r(CoreModule.f18264c.f20384f0.m34076on(), CoreModule.f18264c.f20381e0.m116596o9(), new mw30())).filter(new qcj() { // from class: l.nw30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f143911a.m102076u6((pf60) obj);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.ow30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f149431a.m102080v6((pf60) obj);
                }
            }));
            return;
        }
        if (pk50.m172568j().m172574f().m181669g0()) {
            return;
        }
        if (!((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).act().m40820i6(TabName.Card) && !m101989a9()) {
            this.f74541i = true;
            return;
        }
        if (!NullChecker.m82486a(m101951T4()) || m101951T4().isDialogShowing()) {
            if (NullChecker.m82486a(m101951T4())) {
                this.f74541i = true;
                m101951T4().onDialogDismissExtra(new x20() { // from class: l.pw30
                    @Override // p153l.x20
                    public final void call() {
                        this.f154368a.m102088x6();
                    }
                });
                return;
            }
            return;
        }
        if (this.f74514M == null) {
            this.f74514M = new p8l();
        }
        if (this.f74516N == null) {
            this.f74516N = new p8l.C19323a(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38344q2(), this, (ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel);
        }
        if (this.f74514M.mo38501b(this.f74516N)) {
            this.f74514M.mo38500a(this.f74516N);
        }
    }

    /* JADX INFO: renamed from: Y5 */
    public final void m101977Y5() {
        if (!ric0.m181583m()) {
            duringCreated(CoreModule.f18264c.m32486n3()).map(new qcj() { // from class: l.yu30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Integer.valueOf(rbb0.m180732d((Counter) obj));
                }
            }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.ev30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f95978a.m101926M7((Integer) obj);
                }
            }));
        }
        creates(new y20() { // from class: l.fv30
            @Override // p153l.y20
            public final void call(Object obj) {
                b240.m101784h1((Bundle) obj);
            }
        }, new x20() { // from class: l.gv30
            @Override // p153l.x20
            public final void call() {
                this.f106600a.m101930N7();
            }
        });
        duringCreated(psd0.m173626s(CoreModule.f18264c.f20429u0.m31415S6().filter(new qcj() { // from class: l.hv30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return b240.m101691M2((CoreLikers.C4870a) obj);
            }
        }).throttleFirst(10L, TimeUnit.SECONDS).observeOn(fo0.m126432a()), lifecycle(), this.f74546m, new scj() { // from class: l.iv30
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return jyb.m147494Y((CoreLikers.C4870a) obj, (C4470c) obj2);
            }
        })).filter(new qcj() { // from class: l.jv30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f122763a.m101933O7((pf60) obj);
            }
        }).distinctUntilChanged().filter(new qcj() { // from class: l.kv30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f128942a.m101937P7((pf60) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.mv30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138871a.m101941Q7((pf60) obj);
            }
        }));
        if (!ric0.m181583m()) {
            duringCreated(CoreModule.f18264c.f20318J0.m156793t3().filter(new ppa()).map(new qcj() { // from class: l.zu30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BoostStatus) ((Optional) obj).get()).active);
                }
            }).distinctUntilChanged().filter(new qcj() { // from class: l.bv30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return b240.m101767e0((Boolean) obj);
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.cv30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f83939a.m101945R7((Boolean) obj);
                }
            }));
        }
        duringCreated(ji30.m144966j(TabName.Card)).subscribe(psd0.m173596G(new y20() { // from class: l.dv30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90907a.m101949S7((Boolean) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y6 */
    public final /* synthetic */ void m101978Y6(pf60 pf60Var) {
        if (((Integer) pf60Var.f152156a).intValue() > 0) {
            m102023h9(((Integer) pf60Var.f152156a).intValue(), (List) pf60Var.f152157b);
        }
    }

    /* JADX INFO: renamed from: Y7 */
    public final /* synthetic */ void m101979Y7(uxj0 uxj0Var) {
        qtk.m177999T0(m101951T4());
    }

    /* JADX INFO: renamed from: Y8 */
    public void m101980Y8(boolean z) {
        this.f74560z = z;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        uqi.m197339f(LaunchStep.RenderTask);
        if (gra.m131654Z2()) {
            CoreModule.f18264c.f20446z2.m31260y3();
        }
    }

    /* JADX INFO: renamed from: Z4 */
    public final void m101981Z4() {
        NewMainAct newMainActM101951T4 = m101951T4();
        if (!NullChecker.m82486a(newMainActM101951T4) || newMainActM101951T4.isDialogShowing()) {
            this.f74543k.m137019l(uxj0.f181467a);
            return;
        }
        if (d09.m113367d()) {
            CoreModule.f18264c.f20381e0.f89198c0.put(Boolean.TRUE);
            qtk.m177989O0(m101951T4(), "", new x20() { // from class: l.dy30
                @Override // p153l.x20
                public final void call() {
                    this.f91133a.m102092y6();
                }
            }, false);
        } else if (!m101966W4()) {
            this.f74543k.m137019l(uxj0.f181467a);
        } else {
            CoreModule.f18264c.f20381e0.f89198c0.put(Boolean.TRUE);
            qtk.m177989O0(newMainActM101951T4, "", new x20() { // from class: l.ey30
                @Override // p153l.x20
                public final void call() {
                    this.f96392a.m102096z6();
                }
            }, true);
        }
    }

    /* JADX INFO: renamed from: Z5 */
    public final void m101982Z5() {
        if (gra.m131768x()) {
            duringCreated(ji30.m144967k().filter(new qcj() { // from class: l.fz30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.m82486a((TabName) obj) && NullChecker.m82486a(y2h0.m214080g().m214084e()));
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.gz30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f107163a.m101954T7((TabName) obj);
                }
            }));
            if (C4522a.m22099p().m22107I()) {
                duringCreated(C4522a.m22099p().m22120r()).subscribe(psd0.m173596G(new y20() { // from class: l.hz30
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f112191a.m101959U7((String) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: Z6 */
    public final /* synthetic */ void m101983Z6(Bundle bundle) {
        if (NullChecker.m82486a(m101951T4())) {
            m101911I8();
        } else {
            this.f74543k.m137019l(uxj0.f181467a);
        }
        boolean z = this.f74500F;
        if (NullChecker.m82486a(this.f74545l.m222761e()) && !jyb.m147479J(this.f74545l.m222761e().loaded) && z) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38356s3(false, true);
        } else if (!NullChecker.m82486a(this.f74545l.m222761e()) || this.f74545l.m222761e().hasMore()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38356s3(true, true);
        } else {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38356s3(true, false);
        }
        this.f74500F = true;
        l51.m152919y(new Runnable() { // from class: l.hx30
            @Override // java.lang.Runnable
            public final void run() {
                b240.m101844s4();
            }
        });
    }

    /* JADX INFO: renamed from: Z7 */
    public final /* synthetic */ void m101984Z7(String str) {
        Picture picture = new Picture();
        picture.url = str;
        uqb0.f180374G.m127096B0(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38355s2(), picture.profile480());
        uqb0.f180374G.m127096B0(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38339p2(), picture.profile480());
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        LaunchStep launchStep = LaunchStep.NewNewHomeSub;
        uqi.m197339f(launchStep);
        yhi0.m215967a("NewNewHomePresenter initSubscription");
        CoreModule.f18264c.f20405m0.f20186q2[1] = 0;
        m102095z5();
        m101935P5();
        m102091y5();
        m102001d6();
        m101892E5();
        m101904H5();
        m101924M5();
        m101977Y5();
        m101703O5();
        m101888D5();
        m101939Q5();
        m101952T5();
        m101912J5();
        m101880B5();
        m101991b6();
        m101996c6();
        m102083w5();
        m101884C5();
        m101908I5();
        m102079v5();
        m101900G5();
        m101982Z5();
        m101896F5();
        m101967W5();
        r6b0.m180003a(m101951T4());
        m101972X5();
        m101943R5();
        m101947S5();
        m101962V5();
        m101920L5();
        m101957U5();
        m101928N5();
        m102075u5();
        m101986a6();
        m102087x5();
        m102006e6();
        m101876A5();
        uqi.m197337d(launchStep);
        yhi0.m215968b();
    }

    /* JADX INFO: renamed from: a5 */
    public final void m101985a5(CoreSuggested.UserInfo userInfo) {
        if (!(NullChecker.m82486a(m101951T4()) && NullChecker.m82486a(userInfo) && NullChecker.m82486a(userInfo.liveLivingCardDataWrapper)) && ((userInfo.extensionObject == null || !userInfo.virtualCardType.equals(VirtualCardType.LiveMultipleCard)) && ((userInfo.extensionObject == null || !userInfo.virtualCardType.equals(VirtualCardType.LiveVoiceNewCard)) && !((userInfo.extensionObject != null && userInfo.virtualCardType.equals(VirtualCardType.LiveVoiceRoomCard)) || m102020h6(userInfo) || m101793i6(userInfo))))) {
            return;
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38150E5();
        if (gra.m131606N3()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38269a6(false);
        }
    }

    /* JADX INFO: renamed from: a6 */
    public final void m101986a6() {
        if (spl0.m187372X()) {
            CoreModule.f18264c.f20296B2.m186429u3();
            CoreModule.f18264c.f20296B2.m186430y3();
            duringCreated(ji30.m144967k().distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.v040
                @Override // p153l.y20
                public final void call(Object obj) {
                    b240.m101730U3((TabName) obj);
                }
            }));
            duringCreated(CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip")).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.w040
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20296B2.m186430y3();
                }
            }));
            srf.m187598a().m187599b(ExtraActLifecycle.onResumeFromAppStartOrBackground, new y20() { // from class: l.x040
                @Override // p153l.y20
                public final void call(Object obj) {
                    b240.m101657E0((Act) obj);
                }
            });
            duringCreated(CoreModule.f18264c.f20296B2.m186426o3()).subscribe(psd0.m173596G(new y20() { // from class: l.y040
                @Override // p153l.y20
                public final void call(Object obj) {
                    b240.m101873z2((String) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: a7 */
    public final /* synthetic */ void m101987a7(Boolean bool) {
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38229T1(bool.booleanValue());
    }

    /* JADX INFO: renamed from: a8 */
    public final /* synthetic */ void m101988a8(long j, Long l2) {
        m102078u8(j);
    }

    /* JADX INFO: renamed from: a9 */
    public final boolean m101989a9() {
        return m101994b9() || m101999c9();
    }

    /* JADX INFO: renamed from: b5 */
    public final void m101990b5(CoreSuggested.UserInfo userInfo) {
        if (!z5h0.m218675j().m218695o(userInfo.f20214id)) {
            z5h0.m218675j().f203056n = null;
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38161G6();
        } else {
            if (CoreModule.m30930K().me_().isODiamond() || z5h0.m218675j().m218694n()) {
                return;
            }
            if (!m102011f6(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38344q2(), userInfo)) {
                z5h0.m218675j().f203056n = null;
                ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38161G6();
            } else {
                if (z5h0.m218675j().m218695o(userInfo.f20214id)) {
                    return;
                }
                ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38378w6(false);
            }
        }
    }

    /* JADX INFO: renamed from: b6 */
    public final void m101991b6() {
        duringCreated(psd0.m173625r(z5h0.m218675j().f203043a, z5h0.m218675j().f203044b, new rcj() { // from class: l.lz30
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return b240.m101812m3((Boolean) obj, (uxj0) obj2);
            }
        })).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.nz30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144405a.m101969W7((Boolean) obj);
            }
        }));
        duringCreated(m101951T4().m40829o7()).subscribe(psd0.m173596G(new y20() { // from class: l.oz30
            @Override // p153l.y20
            public final void call(Object obj) {
                b240.m101766d4((TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b7 */
    public final /* synthetic */ void m101992b7(ExpandedCardStyleHelper.C8102b c8102b) {
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38256Y1(c8102b.m39118e(), c8102b.f23162c, c8102b.f23163d);
    }

    /* JADX INFO: renamed from: b8 */
    public final /* synthetic */ void m101993b8(Long l2) {
        long jLongValue = l2.longValue();
        V v2 = this.viewModel;
        if (jLongValue <= 0) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) v2).m38245V5(1);
            return;
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) v2).m38245V5(2);
        if (l2.longValue() < 3600000) {
            if (this.f74531Y != null) {
                m101907H8();
            }
            long j = l2.longValue() <= 2000 ? 500L : 2000L;
            final long jM174454o = pzi0.m174454o() + l2.longValue();
            this.f74531Y = C22421c.interval(0L, j, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.ry30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f165396a.m101988a8(jM174454o, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: b9 */
    public final boolean m101994b9() {
        return CoreModule.f18264c.f20438x0.m31194e4();
    }

    /* JADX INFO: renamed from: c5 */
    public void m101995c5() {
        this.f74522Q = null;
        this.f74520P = null;
    }

    /* JADX INFO: renamed from: c6 */
    public final void m101996c6() {
        if (!gra.m131756u2() || CoreModule.f18264c.f20405m0.f20205x0.get().booleanValue()) {
            return;
        }
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (!NullChecker.m82486a(userM116600p9) || userM116600p9.isNewUserIn24H()) {
            return;
        }
        CoreModule.f18264c.f20405m0.f20205x0.put(Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c7 */
    public final /* synthetic */ void m101997c7(final pf60 pf60Var) {
        if (m101951T4().m40818h6() && pf60Var.f152156a != 0 && ((Integer) pf60Var.f152157b).intValue() > 0 && !pci.m171656E()) {
            od2 od2Var = new od2(m101951T4());
            ViewGroup viewGroupM102052o5 = m102052o5(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38388z2());
            if (viewGroupM102052o5 == null) {
                viewGroupM102052o5 = ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38388z2();
            }
            od2Var.m167268s(kec0.f125977o3, true).m167266q(2500L).m167275z(viewGroupM102052o5).m167249A(new od2.InterfaceC19108c() { // from class: l.xx30
                @Override // p153l.od2.InterfaceC19108c
                /* JADX INFO: renamed from: a */
                public final void mo167276a(String str, View view, View view2) {
                    b240.m101711Q2(pf60Var, str, view, view2);
                }
            }).m167274y(pf60Var, new od2.InterfaceC19107b() { // from class: l.yx30
                @Override // p153l.od2.InterfaceC19107b
                /* JADX INFO: renamed from: a */
                public final void mo99267a(View view, Object obj) {
                    b240.m101687L0(pf60Var, view, (pf60) obj);
                }
            });
            ud2.m195456j().m195472s(od2Var);
        }
    }

    /* JADX INFO: renamed from: c8 */
    public final /* synthetic */ void m101998c8(Act act) {
        if (NullChecker.m82486a(this.viewModel)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38338o6(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
    }

    /* JADX INFO: renamed from: c9 */
    public final boolean m101999c9() {
        return NullChecker.m82486a(CoreModule.f18264c.f20339Q0.m115266v3());
    }

    /* JADX INFO: renamed from: d5, reason: merged with bridge method [inline-methods] */
    public final void m102051n8(Boolean bool) {
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38344q2().m21596q4(m101951T4().getString(R$string.f18632L5), true);
        if (bool.booleanValue()) {
            CoreBusinessModule.m30907z0();
        } else {
            this.f74551q.getSettingGroup().privacy.hideContacts = Boolean.FALSE;
            this.f74551q.getSettingGroup().privacy.hideMutualContacts = Boolean.TRUE;
        }
        if (IntlCountryCodeController.m29123t()) {
            if (this.f74551q.getSettingGroup().search == null) {
                this.f74551q.getSettingGroup().search = new UserSearchSettings();
            }
            this.f74551q.getSettingGroup().search.radius = 99000;
        }
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            this.f74551q.getSettingGroup().gender = userM116600p9.settings.getSettingGroup().gender;
        }
        CoreModule.f18264c.f20405m0.m32124k8(this.f74551q.getSettingGroup()).subscribe(psd0.m173597H(new y20() { // from class: l.dw30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90991a.m101877A6((uxj0) obj);
            }
        }, new y20() { // from class: l.ew30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96089a.m101881B6((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d6 */
    public final void m102001d6() {
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).switchMap(new qcj() { // from class: l.nv30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f143770a.m101974X7((User) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.ov30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149230a.m101979Y7((uxj0) obj);
            }
        }));
        qyf.m178643f().m178645e(duringCreated(CoreModule.f18264c.f20381e0.m116596o9()), m101951T4(), ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38344q2(), 19);
        duringCreated(CoreModule.f18264c.f20381e0.m116629wa()).subscribe(psd0.m173596G(new y20() { // from class: l.pv30
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20381e0.m116625va(-1);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9().filter(new qcj() { // from class: l.qv30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).hasPic());
            }
        }).map(new qcj() { // from class: l.rv30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).m61308fp().url;
            }
        }).distinctUntilChanged()).subscribe(psd0.m173597H(new y20() { // from class: l.sv30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170793a.m101984Z7((String) obj);
            }
        }, new y20() { // from class: l.tv30
            @Override // p153l.y20
            public final void call(Object obj) {
                b240.m101874z3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d7 */
    public final /* synthetic */ void m102002d7() {
        this.f74542j = true;
        ABManager.m30326V(m101951T4());
        m101951T4().m68056e2();
    }

    /* JADX INFO: renamed from: d8 */
    public final /* synthetic */ void m102003d8(User user, Relationship relationship) {
        UssTags ussTags;
        if (NullChecker.m82486a(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2())) {
            C8145d c8145dM102005e5 = m102005e5(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38344q2().pageId(), relationship.f39654id, ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2(), user);
            c8145dM102005e5.m39490v((user == null || (ussTags = user.ussTags) == null) ? "" : ussTags.eventInfo);
            m101938P8(c8145dM102005e5, "success");
        }
        this.f74537e = true;
    }

    /* JADX INFO: renamed from: d9 */
    public boolean m102004d9(User user) {
        if (rbb0.m180744q()) {
            if (spl0.m187354F()) {
                return pk50.m172568j().m172574f().m181649M(OmsDialog.see_guide.getIdentifier(), false);
            }
            CoreSuggested coreSuggested = CoreModule.f18264c.f20405m0;
            if (!coreSuggested.f20068C0 && coreSuggested.f20071D0.get().intValue() < 2 && tzi0.m193670h(pzi0.m174454o(), (long) user.createdTime, 2)) {
                return true;
            }
        }
        return false;
    }

    @Override // p153l.k3m
    public void destroy() {
        srf srfVarM187598a = srf.m187598a();
        ExtraActLifecycle extraActLifecycle = ExtraActLifecycle.onResumeFromBackground;
        srfVarM187598a.m187601d(extraActLifecycle, this.f74544k0);
        srf.m187598a().m187601d(extraActLifecycle, this.f74550p0);
        psd0.m173633z(this.f74530X);
        if (this.f74531Y != null) {
            m101907H8();
        }
        qyf.m178643f().m178644d();
    }

    /* JADX INFO: renamed from: e5 */
    public final C8145d m102005e5(String str, String str2, f1g0 f1g0Var, User user) {
        String str3;
        int size;
        int iM32125l6 = CoreModule.f18264c.f20405m0.m32125l6() - 1;
        if (!NullChecker.m82486a(user) || iM32125l6 < 0 || user.pictures.size() <= iM32125l6) {
            str3 = "";
            size = 0;
        } else {
            str3 = user.pictures.get(iM32125l6).url;
            size = user.pictures.size();
        }
        C8145d c8145dM37705h = HomeStatisticsHelper.m37705h(str, str2, f1g0Var);
        c8145dM37705h.m39464B(str3);
        c8145dM37705h.m39494z(iM32125l6);
        c8145dM37705h.m39463A(size);
        return c8145dM37705h;
    }

    /* JADX INFO: renamed from: e6 */
    public final void m102006e6() {
        if (rs9.m182940i()) {
            CoreModule.f18264c.f20410n2.m121464J3(CoreModule.m30929H().userId());
        }
    }

    /* JADX INFO: renamed from: e7 */
    public final /* synthetic */ void m102007e7(Integer num) {
        m101951T4().dialog().m21499D(R$string.f19497nk).m21495B(false).m21555t0(R$string.f19445m, new Runnable() { // from class: l.rw30
            @Override // java.lang.Runnable
            public final void run() {
                this.f165098a.m102002d7();
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: e8 */
    public final /* synthetic */ void m102008e8(User user, Throwable th) {
        if (NullChecker.m82486a(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2())) {
            m101934O8(m102005e5(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38344q2().pageId(), "", ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2(), user), th);
        }
        this.f74537e = true;
        o1j0.m165626H(m101951T4().getResources().getString(R$string.f18591Jq), m101951T4().getResources().getDrawable(dbc0.f87134jv), m101951T4().getResources().getDrawable(dbc0.f87131js));
    }

    /* JADX INFO: renamed from: e9 */
    public void m102009e9() {
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        if (NullChecker.m82486a(userM116593na)) {
            if (NullChecker.m82486a(this.f74503G0) && this.f74503G0.m160847N()) {
                return;
            }
            m101961V4(userM116593na);
        }
    }

    /* JADX INFO: renamed from: f5 */
    public ArrayList<pf60<String, x20>> m102010f5() {
        return DebugUtil.m60419xj((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel, this);
    }

    /* JADX INFO: renamed from: f6 */
    public final boolean m102011f6(NewNewHomeFrag newNewHomeFrag, CoreSuggested.UserInfo userInfo) {
        if (!NullChecker.m82486a(userInfo) || userInfo.f20214id.equals(CoreSuggested.UserInfo.VIRTUAL_CARD)) {
            return false;
        }
        User userM140259d = NullChecker.m82486a(newNewHomeFrag.f22420C.m38128A2().mo39821o()) ? newNewHomeFrag.f22420C.m38128A2().mo39821o().m140259d() : null;
        if (NullChecker.m82486a(userM140259d)) {
            return z5h0.m218675j().m218681A(userM140259d);
        }
        return false;
    }

    /* JADX INFO: renamed from: f7 */
    public final /* synthetic */ void m102012f7(Optional optional) {
        if (optional.isPresent() && ((Boolean) optional.get()).booleanValue()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38296g3(((Boolean) optional.get()).booleanValue());
        }
    }

    /* JADX INFO: renamed from: f9 */
    public final void m102013f9() {
        xxv.m213585l(m101951T4(), new PermissionHelper.InterfaceC13292b() { // from class: l.uw30
            @Override // com.p051p1.mobile.putong.p070ui.permission.PermissionHelper.InterfaceC13292b
            /* JADX INFO: renamed from: a */
            public final void mo81089a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                this.f181232a.m102066r8(z, permissionDeniedReason);
            }
        }, new DialogInterface.OnCancelListener() { // from class: l.vw30
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f186062a.m102070s8(dialogInterface);
            }
        }, new Runnable() { // from class: l.ww30
            @Override // java.lang.Runnable
            public final void run() {
                this.f191153a.m102074t8();
            }
        }, new x20() { // from class: l.xw30
            @Override // p153l.x20
            public final void call() {
                fph0.m126683n0(fph0.f100175h);
            }
        });
    }

    /* JADX INFO: renamed from: g5 */
    public void m102014g5() {
        this.f74536d = true;
    }

    /* JADX INFO: renamed from: g6 */
    public boolean m102015g6(String str) {
        return TextUtils.equals(f74488V0, str);
    }

    /* JADX INFO: renamed from: g7 */
    public final /* synthetic */ void m102016g7(Boolean bool) {
        if (bool.booleanValue() && NullChecker.m82486a(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).f22646U) && NullChecker.m82486a(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).f22646U.mo118298o()) && bnl0.m105529O0(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).f22646U.mo118298o())) {
            hoi.m136432a().m136433b(m101951T4(), ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).f22646U.mo118298o());
        }
    }

    /* JADX INFO: renamed from: g8 */
    public final /* synthetic */ void m102017g8(String str, int i, C4470c c4470c) {
        if (NullChecker.m82486a(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2())) {
            CoreSuggested.UserInfo userInfoMo39816j = ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39816j();
            if (NullChecker.m82486a(userInfoMo39816j) && TextUtils.equals(str, userInfoMo39816j.f20214id)) {
                if (i != SwipeDirection.UP.getValue()) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39804A(SwipeDirection.fromValue(i));
                } else if (((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39811c(false)) {
                    m101750Z8("p_profile,superlike");
                    m102027i9(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g9 */
    public final void m102018g9(Act act, User user) {
        if (CoreModule.f18264c.f20369a0.m188268v3(user) || CoreModule.f18264c.f20369a0.m188267u3(user)) {
            return;
        }
        if (TEnum.equals(user.source, "facebook") && CoreModule.f18264c.f20381e0.f89161X2.get().booleanValue()) {
            new cen(act).m109427Z();
            CoreModule.f18264c.f20381e0.f89161X2.put(Boolean.FALSE);
        } else if (TEnum.equals(user.source, "google") && CoreModule.f18264c.f20381e0.f89177Z2.get().booleanValue()) {
            new cen(act).m109427Z();
            CoreModule.f18264c.f20381e0.f89177Z2.put(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: h5, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m102074t8() {
        xxv.m213578e();
        m102047m9();
        if (this.f74506I) {
            this.f74506I = false;
            this.f74543k.m137019l(uxj0.f181467a);
        }
        l51.m152888H(m101951T4(), new Runnable() { // from class: l.fy30
            @Override // java.lang.Runnable
            public final void run() {
                this.f101337a.m101885C6();
            }
        }, 400L);
    }

    /* JADX INFO: renamed from: h6 */
    public final boolean m102020h6(CoreSuggested.UserInfo userInfo) {
        return NullChecker.m82486a(userInfo) && CoreModule.f18264c.f20405m0.m32023L6(userInfo.f20214id);
    }

    /* JADX INFO: renamed from: h7 */
    public final /* synthetic */ void m102021h7(GrowthSpamInfo growthSpamInfo) {
        if (growthSpamInfo.pop) {
            of7.m167420o().m167429E(m101951T4(), false, of7.m167421r());
        }
    }

    /* JADX INFO: renamed from: h8 */
    public final /* synthetic */ void m102022h8(ArrayList arrayList, String str, uxj0 uxj0Var) {
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38344q2().m21598s4();
        CoreModule.f18264c.f20381e0.m116625va(App.f16092i.get().intValue());
        qtk.m178003V0(m101951T4(), false, (Media) arrayList.get(0), m101951T4().string(R$string.f18307Al), new Runnable() { // from class: l.jy30
            @Override // java.lang.Runnable
            public final void run() {
                b240.m101748Z2();
            }
        });
        if (TextUtils.equals(str, "fake_to_good_dlg")) {
            fph0.m126636G();
        } else if (TextUtils.equals(str, "fakeView")) {
            fph0.m126691v();
        }
    }

    /* JADX INFO: renamed from: h9 */
    public final void m102023h9(int i, List<String> list) {
        if (m101951T4().isDialogShowing() || CoreModule.f18264c.f20405m0.f20068C0 || e8d0.m119813d0()) {
            return;
        }
        CoreSuggested coreSuggested = CoreModule.f18264c.f20405m0;
        coreSuggested.f20068C0 = true;
        vxd0 vxd0Var = coreSuggested.f20071D0;
        vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        if (spl0.m187354F()) {
            pk50.m172568j().m172574f().m181664b0(OmsDialog.see_guide.getIdentifier(), 0, false);
        }
        hl3.m135666I(m101951T4(), i, list);
        CoreModule.f18264c.f20405m0.f20211z0 = 0;
    }

    /* JADX INFO: renamed from: i5 */
    public void m102024i5() {
        if (NullChecker.m82486a(this.f74503G0)) {
            User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
            if (NullChecker.m82486a(userM116593na)) {
                return;
            }
            if (CoreModule.f18264c.f20369a0.m188269w3(userM116593na) || CoreModule.f18264c.f20369a0.m188267u3(userM116593na)) {
                this.f74503G0.m160836C();
                this.f74503G0 = null;
            }
        }
    }

    /* JADX INFO: renamed from: i7 */
    public final /* synthetic */ void m102025i7(GrowthSpamInfo growthSpamInfo) {
        if (growthSpamInfo.pop) {
            of7.m167420o().m167429E(m101951T4(), true, false);
        }
    }

    /* JADX INFO: renamed from: i8 */
    public final /* synthetic */ void m102026i8(Throwable th) {
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38344q2().m21598s4();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: i9 */
    public boolean m102027i9(boolean z) {
        return m102032j9(z, false);
    }

    /* JADX INFO: renamed from: j5 */
    public void m102028j5() {
        SettingGroups settingGroups = new SettingGroups();
        UserSearchSettings userSearchSettings = new UserSearchSettings();
        settingGroups.search = userSearchSettings;
        userSearchSettings.autoAdjustRadius = Boolean.TRUE;
        CoreModule.f18264c.f20405m0.m32124k8(settingGroups).subscribe(psd0.m173597H(new y20() { // from class: l.hy30
            @Override // p153l.y20
            public final void call(Object obj) {
                b240.m101663F1((uxj0) obj);
            }
        }, new y20() { // from class: l.iy30
            @Override // p153l.y20
            public final void call(Object obj) {
                b240.m101665F3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j6 */
    public boolean m102029j6(String str) {
        return (TextUtils.isEmpty(this.f74520P) || !this.f74520P.equals(str) || TextUtils.isEmpty(this.f74522Q)) ? false : true;
    }

    /* JADX INFO: renamed from: j7 */
    public final /* synthetic */ void m102030j7(GrowthSpamInfo growthSpamInfo) {
        if (growthSpamInfo.pop) {
            if (d09.m113376m()) {
                of7.m167420o().m167429E(m101951T4(), false, of7.m167421r());
            } else {
                of7.m167420o().m167429E(m101951T4(), true, false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x01fb  */
    /* JADX INFO: renamed from: j9 */
    public boolean m102032j9(boolean z, boolean z2) {
        User user;
        C8145d c8145dM37701d;
        UssTags ussTags;
        boolean z3;
        int iM32125l6;
        String str = "";
        if (z) {
            c8145dM37701d = HomeStatisticsHelper.m37701d(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2() == null ? null : ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39821o(), true, this.f74539g, SwipeDirection.UP, ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2());
            user = null;
        } else {
            User userM32145r8 = CoreModule.f18264c.f20405m0.m32145r8();
            C8145d c8145dM37705h = HomeStatisticsHelper.m37705h(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38344q2().pageId(), userM32145r8 == null ? "" : userM32145r8.f56859id, ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2());
            c8145dM37705h.m39490v((userM32145r8 == null || (ussTags = userM32145r8.ussTags) == null) ? "" : ussTags.eventInfo);
            user = userM32145r8;
            c8145dM37701d = c8145dM37705h;
        }
        int size = 0;
        if (CoreModule.f18264c.f20381e0.m116600p9().isJailed()) {
            m101750Z8(null);
            CoreModule.m30930K().startJailedDialogLikeAct();
            m101938P8(c8145dM37701d, "failJailedUser");
            return false;
        }
        if (CoreModule.f18264c.f20381e0.m116559f8()) {
            m101750Z8(null);
            qyp.m178723i().m178729n(m101951T4(), true);
            return false;
        }
        KeyEvent.Callback callbackMo39812d = ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39812d();
        if (!NullChecker.m82486a(callbackMo39812d) || (((callbackMo39812d instanceof t7m) && ((t7m) callbackMo39812d).mo37905k0()) || !this.f74537e)) {
            return false;
        }
        if (z) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39804A(SwipeDirection.UP);
            return false;
        }
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        CounterLikeLimit counterLikeLimit = counterM32487o3.likeLimit;
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterM32487o3.undoLimit;
        if ((((long) (counterSuperlikeAndUndoLimit.reset * 1000)) + counterLikeLimit.serverTime) - uqb0.f180376H.guessedCurrentServerTime() > 0 && counterSuperlikeAndUndoLimit.remainToday() == 0) {
            C8927c.m54595M1(m101951T4(), "p_home,undo", Privilege.vip_undo, null, null, false, CoreModule.f18264c.f20405m0.m32145r8());
        } else if (m102037k9()) {
            CoreSuggested.UserInfo userInfoM32148s8 = CoreModule.f18264c.f20405m0.m32148s8();
            if (!qap.m175962i() || !qap.INSTANCE.m175974l()) {
                if (this.f74537e && CoreModule.f18264c.f20405m0.m32148s8().canUndo) {
                    if (!rbb0.m180744q() || !NullChecker.m82486a(CoreModule.f18264c.f20405m0.f20085H2.m222761e()) || CoreModule.f18264c.f20405m0.f20085H2.m222761e().f184001a.isEmpty() || !CoreModule.f18264c.f20405m0.f20085H2.m222761e().f184001a.get(0).equals(userInfoM32148s8.f20214id)) {
                        this.f74499E0.run();
                    } else if (C4880a0.m32390j().f20267d.get().isEmpty()) {
                        C4880a0.m32390j().f20267d.put(userInfoM32148s8.f20214id);
                        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
                        userInfo.f20214id = userInfoM32148s8.f20214id;
                        userInfo.canUndo = true;
                        userInfo.preSwipedDirection = SwipeDirection.LEFT;
                        CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0);
                    } else {
                        axj0.m100773a(m101951T4());
                    }
                    z3 = true;
                }
                boolean z4 = z3;
                if (!z3) {
                    iM32125l6 = CoreModule.f18264c.f20405m0.m32125l6() - 1;
                    if (NullChecker.m82486a(user) && iM32125l6 >= 0 && user.pictures.size() > iM32125l6) {
                        str = user.pictures.get(iM32125l6).url;
                        size = user.pictures.size();
                    }
                    c8145dM37701d.m39464B(str);
                    c8145dM37701d.m39494z(iM32125l6);
                    c8145dM37701d.m39463A(size);
                    m101938P8(c8145dM37701d, "failUndoLocal");
                }
                return z4;
            }
            o1j0.m165636j(m101951T4().getString(R$string.f19737vc));
        } else if (qap.m175962i() && qap.INSTANCE.m175974l()) {
            o1j0.m165636j(m101951T4().getString(R$string.f19737vc));
        } else {
            axj0.m100773a(m101951T4());
        }
        z3 = false;
        boolean z5 = z3;
        if (!z3) {
            iM32125l6 = CoreModule.f18264c.f20405m0.m32125l6() - 1;
            if (NullChecker.m82486a(user)) {
                str = user.pictures.get(iM32125l6).url;
                size = user.pictures.size();
            }
            c8145dM37701d.m39464B(str);
            c8145dM37701d.m39494z(iM32125l6);
            c8145dM37701d.m39463A(size);
            m101938P8(c8145dM37701d, "failUndoLocal");
        }
        return z5;
    }

    /* JADX INFO: renamed from: k5 */
    public final void m102033k5() {
        long jCurrentTimeMillis = this.f74523Q0 - System.currentTimeMillis();
        if (jCurrentTimeMillis < 0 && jCurrentTimeMillis > -7200000) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38259Y5(2);
            return;
        }
        if (jCurrentTimeMillis > 86400000 || jCurrentTimeMillis < -7200000) {
            this.f74523Q0 = ami0.INSTANCE.m98830d();
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38259Y5(1);
    }

    /* JADX INFO: renamed from: k6 */
    public boolean m102034k6() {
        return this.f74505H0;
    }

    /* JADX INFO: renamed from: k7 */
    public final /* synthetic */ void m102035k7(uxj0 uxj0Var) {
        of7.m167420o().m167430m(m101951T4());
    }

    /* JADX INFO: renamed from: k9 */
    public final boolean m102037k9() {
        return NullChecker.m82486a(CoreModule.f18264c.f20405m0.m32145r8());
    }

    /* JADX INFO: renamed from: l5 */
    public int m102038l5() {
        return this.f74534b;
    }

    /* JADX INFO: renamed from: l6 */
    public boolean m102039l6() {
        return this.f74511K0;
    }

    /* JADX INFO: renamed from: l7 */
    public final /* synthetic */ Boolean m102040l7(Boolean bool) {
        return Boolean.valueOf(bool.booleanValue() && NullChecker.m82487b(m101951T4()) && !m101951T4().isDialogShowing());
    }

    /* JADX INFO: renamed from: l9 */
    public void m102042l9(y20<uxj0> y20Var, y20<Throwable> y20Var2) {
        this.f74543k.m137019l(uxj0.f181467a);
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38344q2().m21596q4(m101951T4().getString(R$string.f18632L5), true);
        CoreModule.f18264c.f20405m0.m32124k8(this.f74551q.getSettingGroup()).subscribe(psd0.m173597H(y20Var, y20Var2));
    }

    /* JADX INFO: renamed from: m5 */
    public String m102043m5() {
        return this.f74533a;
    }

    /* JADX INFO: renamed from: m6 */
    public boolean m102044m6() {
        return this.f74497D;
    }

    /* JADX INFO: renamed from: m7 */
    public final /* synthetic */ void m102045m7(Boolean bool) {
        if (NullChecker.m82486a(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2()) && NullChecker.m82486a(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39812d()) && (((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39812d() instanceof t7m)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38213Q2();
            uih0 uih0VarM196223s0 = uih0.m196223s0();
            V v2 = this.viewModel;
            uih0VarM196223s0.m196263h0((ViewTreeObserverOnGlobalLayoutListenerC8017b) v2, (t7m) ((ViewTreeObserverOnGlobalLayoutListenerC8017b) v2).m38128A2().mo39812d());
            return;
        }
        if (NullChecker.m82486a(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2()) && NullChecker.m82486a(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39812d()) && (((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39812d() instanceof u7m)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38213Q2();
            uih0 uih0VarM196223s1 = uih0.m196223s0();
            V v3 = this.viewModel;
            uih0VarM196223s1.m196264i0((ViewTreeObserverOnGlobalLayoutListenerC8017b) v3, (u7m) ((ViewTreeObserverOnGlobalLayoutListenerC8017b) v3).m38128A2().mo39812d());
        }
    }

    /* JADX INFO: renamed from: m8 */
    public final /* synthetic */ void m102046m8() {
        this.f74555u++;
    }

    /* JADX INFO: renamed from: m9 */
    public void m102047m9() {
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38241V1(true);
    }

    /* JADX INFO: renamed from: n5 */
    public String m102048n5() {
        return this.f74507I0;
    }

    /* JADX INFO: renamed from: n6 */
    public boolean m102049n6() {
        return this.f74496C;
    }

    /* JADX INFO: renamed from: n7 */
    public final /* synthetic */ void m102050n7(uxj0 uxj0Var) {
        if (m101951T4().isDialogShowing()) {
            m101951T4().onDialogDismissExtra(new x20() { // from class: l.gx30
                @Override // p153l.x20
                public final void call() {
                    CoreModule.f18264c.f20405m0.m32146s6("initiative", "suggest", null);
                }
            });
        } else {
            CoreModule.f18264c.f20405m0.m32146s6("initiative", "suggest", null);
        }
        CoreModule.f18264c.f20405m0.f20150e2.m35208E3();
    }

    /* JADX INFO: renamed from: o5 */
    public ViewGroup m102052o5(ViewGroup viewGroup) {
        ViewParent parent = viewGroup.getParent();
        if (parent == null) {
            return null;
        }
        if (viewGroup != m101951T4().getWindow().getDecorView()) {
            if (!(parent instanceof ViewGroup)) {
                return null;
            }
            ViewGroup viewGroup2 = (ViewGroup) parent;
            if (viewGroup2.getId() != adc0.f69809A4) {
                return m102052o5(viewGroup2);
            }
        }
        return viewGroup;
    }

    /* JADX INFO: renamed from: o6 */
    public boolean m102053o6() {
        return this.f74495B;
    }

    /* JADX INFO: renamed from: o7 */
    public final /* synthetic */ void m102054o7(ActionData actionData) {
        int i;
        tu2.m192703a("[See_Toast]", "switch back: " + actionData.toJson());
        if (uqb0.f180376H.guessedCurrentServerTime() - actionData.dataTime >= TimeUnit.SECONDS.toMillis(gra.m131768x() ? gra.m131660b1() : 9)) {
            y2h0.m214080g().m214083d(null, false, SuggesterReason.WEAK_NETWORK.getReason(), actionData);
            return;
        }
        if ("immediately".equals(actionData.pageFormat.showRules)) {
            SuggestersAct.m44778c2(m101951T4(), actionData.pageFormat);
        } else if (!TextUtils.isEmpty(actionData.toastStyle.title)) {
            tu2.m192703a("[See_Toast]", "start show toast: " + actionData.traceId);
            y2h0.m214080g().m214087k((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel, actionData);
        } else if (!TextUtils.isEmpty(actionData.toast.message)) {
            y2h0.m214080g().m214088l((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel, actionData.toast);
        }
        if (jyb.m147479J(actionData.insertFormat.insertPosition)) {
            return;
        }
        for (ActionInsertPosition actionInsertPosition : actionData.insertFormat.insertPosition) {
            int i2 = actionInsertPosition.position;
            if (!NullChecker.m82486a(this.f74545l.m222761e()) || jyb.m147479J(this.f74545l.m222761e().loaded)) {
                i = -1;
                break;
            }
            i = 0;
            while (true) {
                if (i >= this.f74545l.m222761e().loaded.size()) {
                    i = -1;
                    break;
                } else if (actionInsertPosition.userId.equals(this.f74545l.m222761e().loaded.get(i).f20214id)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0 && i <= i2) {
                i2 = i;
            }
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.f20214id = actionInsertPosition.userId;
            if (!NullChecker.m82486a(actionInsertPosition.cityCData) || TextUtils.isEmpty(actionInsertPosition.cityCData.userId)) {
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
            if (actionInsertPosition.cardStyle.label.contains("liked_me") && (!gta.m132210e().m132212b().mo34652wf() || (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116597oa(userInfo.f20214id)) && CoreModule.f18264c.f20381e0.m116597oa(userInfo.f20214id).isFemale() && !CoreModule.f18264c.f20381e0.m116597oa(userInfo.f20214id).superLikedMe() && !CoreModule.f18264c.f20381e0.m116597oa(userInfo.f20214id).letter()))) {
                userInfo.hasLikeMeSlideCardTop = true;
            }
            if (actionInsertPosition.likedMe.label.contains("liked_me") && !gta.m132210e().m132212b().mo34652wf()) {
                userInfo.hasLikeMeSlideCardBottom = true;
            }
            CoreModule.f18264c.f20405m0.m32149t6(userInfo, i2, true);
        }
    }

    /* JADX INFO: renamed from: o8 */
    public final /* synthetic */ void m102055o8() {
        this.f74543k.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: p6 */
    public boolean m102056p6() {
        return this.f74494A;
    }

    /* JADX INFO: renamed from: p7 */
    public final /* synthetic */ void m102057p7(uxj0 uxj0Var) {
        if (NullChecker.m82486a(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2()) && NullChecker.m82486a(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39812d())) {
            V v2 = this.viewModel;
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) v2).m38182K6(((ViewTreeObserverOnGlobalLayoutListenerC8017b) v2).m38128A2().mo39812d());
        }
    }

    /* JADX INFO: renamed from: p8 */
    public final /* synthetic */ void m102058p8(NewMainBaseAct newMainBaseAct) {
        if (xxv.m213589p(newMainBaseAct)) {
            m101915J8();
            return;
        }
        if (!xxv.m213586m()) {
            xxv.m213578e();
        }
        if (PermissionHelper.m81064b("android.permission.READ_CONTACTS")) {
            this.f74543k.m137019l(uxj0.f181467a);
        } else {
            l51.m152886F(newMainBaseAct, new Runnable() { // from class: l.sy30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f171209a.m102055o8();
                }
            });
        }
    }

    /* JADX INFO: renamed from: q5 */
    public final void m102059q5(User user, boolean z) {
        if (TEnum.equals(user.source, "google") || TEnum.equals(user.source, "facebook")) {
            m102018g9(m101951T4(), user);
            return;
        }
        TTCMigrateGuideConfig tTCMigrateGuideConfigM131687g3 = gra.m131687g3();
        if (z && NullChecker.m82486a(tTCMigrateGuideConfigM131687g3) && CoreModule.f18264c.f20369a0.m188262F3(tTCMigrateGuideConfigM131687g3) && !CoreModule.f18264c.f20369a0.m188269w3(user) && !CoreModule.f18264c.f20369a0.m188267u3(user)) {
            int i = tTCMigrateGuideConfigM131687g3.dlgType;
            mz2 mz2Var = new mz2(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).act());
            this.f74503G0 = mz2Var;
            mz2Var.m160871l0(tTCMigrateGuideConfigM131687g3);
            CoreModule.f18264c.f20369a0.f170920S.put(Long.valueOf((((long) tTCMigrateGuideConfigM131687g3.frequency) * 1000) + pzi0.m174454o()));
            CoreModule.f18264c.f20369a0.f170921T.put(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: q6 */
    public boolean m102060q6() {
        return this.f74560z;
    }

    /* JADX INFO: renamed from: q7 */
    public final /* synthetic */ void m102061q7(pf60 pf60Var) {
        if (!CoreModule.f18264c.f20396j0.m31607Q4() || CoreModule.f18264c.f20396j0.f20036g0) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38221R5(false);
        } else {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38290f2();
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38221R5(true);
        }
    }

    /* JADX INFO: renamed from: q8 */
    public final /* synthetic */ void m102062q8(C22507a c22507a, Throwable th) {
        CoreModule.f18264c.f20405m0.m32116i8();
        if ((c22507a.m222761e() == null || ((PartialListOpt) c22507a.m222761e()).loaded.size() == 0) && ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38179K3()) {
            this.f74511K0 = true;
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38187L5(true, false);
        }
    }

    /* JADX INFO: renamed from: r5 */
    public void m102063r5() {
        if (!asj0.m99935d0() || m101951T4().lifecycle_() != C4470c.f16267i || ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38138C3() || ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38344q2().isHidden()) {
            return;
        }
        Object objMo39812d = ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2() == null ? null : ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39812d();
        if (NullChecker.m82486a(objMo39812d) && (objMo39812d instanceof t7m)) {
            t7m t7mVar = (t7m) objMo39812d;
            if (t7mVar.mo37950y()) {
                t7mVar.mo37825I();
            }
        }
    }

    /* JADX INFO: renamed from: r6 */
    public final /* synthetic */ void m102064r6(Long l2) {
        m102033k5();
    }

    /* JADX INFO: renamed from: r7 */
    public final /* synthetic */ void m102065r7(Throwable th) {
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38221R5(false);
        String.format("start freeTrial anim error: %s", th.getMessage());
    }

    /* JADX INFO: renamed from: r8 */
    public final /* synthetic */ void m102066r8(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        if (permissionDeniedReason == PermissionHelper.PermissionDeniedReason.Null) {
            fph0.m126679l0(fph0.f100175h);
        } else {
            fph0.m126681m0(fph0.f100175h, xxv.m213587n(m101951T4()) ? BLiveOperationTitleShowType.off : "on");
        }
        m102074t8();
    }

    /* JADX INFO: renamed from: s5 */
    public void m102067s5(String str) {
        if (m101951T4().lifecycle_() != C4470c.f16267i || ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38138C3() || ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38344q2().isHidden() || !((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38279c6()) {
            return;
        }
        if (((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38236U2(str + " by:handleShowButtons ")) {
            return;
        }
        if (C8772a.f33518f) {
            C8772a.f33518f = false;
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38289e6();
        }
        if (f4s.m124037d()) {
            f4s.m124038e(false);
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38289e6();
        }
    }

    /* JADX INFO: renamed from: s6 */
    public final /* synthetic */ void m102068s6(uxj0 uxj0Var) {
        this.f74505H0 = false;
        this.f74548o.m137019l(Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s7 */
    public final /* synthetic */ void m102069s7(pf60 pf60Var) {
        if (((Boolean) pf60Var.f152156a).booleanValue()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38215Q5(true);
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38280d2();
        }
        if (((Boolean) pf60Var.f152157b).booleanValue()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38215Q5(true);
        }
    }

    /* JADX INFO: renamed from: s8 */
    public final /* synthetic */ void m102070s8(DialogInterface dialogInterface) {
        m102074t8();
    }

    /* JADX INFO: renamed from: t5, reason: merged with bridge method [inline-methods] */
    public void m102041l8() {
        vxd0 vxd0Var = this.f74553s;
        vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        this.f74554t.put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: t6 */
    public final /* synthetic */ void m102072t6(Throwable th) {
        this.f74505H0 = false;
        this.f74548o.m137019l(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: t7 */
    public final /* synthetic */ Boolean m102073t7(CoreLikers.C4870a c4870a) {
        return Boolean.valueOf(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).act().m40820i6(TabName.Card) && c4870a.f20012b > 0 && !f74492Z0.get().booleanValue() && this.f74498E && !nmp.m163834c());
    }

    /* JADX INFO: renamed from: u5 */
    public final void m102075u5() {
        if (h39.m133429R()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("https://fe-static.tancdn.com/v1/raw/5266f729-e0ff-4677-96f9-09373278f58214.svga");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/8eda1a11-5419-4a73-a3bd-6b54d258c50a14.svga");
            SVGALoader.with(App.f16088e).batchDownload(arrayList);
        }
    }

    /* JADX INFO: renamed from: u6 */
    public final /* synthetic */ Boolean m102076u6(pf60 pf60Var) {
        return Boolean.valueOf(this.f74513L0 == 1);
    }

    /* JADX INFO: renamed from: u7 */
    public final /* synthetic */ void m102077u7(CoreLikers.C4870a c4870a) {
        if (jyb.m147479J(c4870a.f20014d)) {
            return;
        }
        User user = c4870a.f20014d.get(0);
        String string = m101951T4().getResources().getString(R$string.f19438ln);
        boolean zM29121r = IntlCountryCodeController.m29121r();
        V v2 = this.viewModel;
        if (zM29121r) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) v2).m38368u6(user.m61308fp().url, string, ShareConstants.OLD_VERSION, c4870a.f20013c, c4870a.f20012b, c4870a.f20017g, user.location.updatedTime, null);
            f74492Z0.put(Boolean.TRUE);
        } else {
            kfe0 kfe0Var = new kfe0((ViewTreeObserverOnGlobalLayoutListenerC8017b) v2, user.m61308fp().url, string, c4870a.f20013c, c4870a.f20012b, c4870a.f20017g, user.location.updatedTime, ShareConstants.OLD_VERSION);
            kfe0Var.m146060s(new x20() { // from class: l.gy30
                @Override // p153l.x20
                public final void call() {
                    b240.f74492Z0.put(Boolean.TRUE);
                }
            });
            kfe0Var.m126745x(CorePopLevel.INTL_SEE_ANIM_BUBBLE);
            llb0.m154703c().m154710i(kfe0Var);
        }
    }

    /* JADX INFO: renamed from: u8 */
    public final void m102078u8(long j) {
        if (j - pzi0.m174454o() <= 500) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38245V5(1);
            m101951T4().post(new Runnable() { // from class: l.ty30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f176633a.m101907H8();
                }
            });
        }
    }

    /* JADX INFO: renamed from: v5 */
    public final void m102079v5() {
        if (gra.m131707k3()) {
            duringCreated(ji30.m144967k().distinctUntilChanged().filter(new qcj() { // from class: l.zy30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) == TabName.Card);
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.az30
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20405m0.m32006H5();
                }
            }));
            srf.m187598a().m187599b(ExtraActLifecycle.onResumeFromBackground, new y20() { // from class: l.cz30
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20405m0.m32006H5();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v6 */
    public final /* synthetic */ void m102080v6(pf60 pf60Var) {
        StringBuilder sb = new StringBuilder("checkIntro error, local has user me is " + NullChecker.m82486a(pf60Var.f152157b));
        sb.append(", ");
        if (!NullChecker.m82486a(pf60Var.f152156a) || jyb.m147479J(((vg60) pf60Var.f152156a).f184001a)) {
            sb.append("local has no conversations");
        } else {
            for (int i = 0; i < ((vg60) pf60Var.f152156a).f184001a.size() && i < 5; i++) {
                String str = ((Conversation) ((vg60) pf60Var.f152156a).f184001a.get(i)).f56859id;
                sb.append("cid-");
                sb.append(str);
                sb.append(" : ");
                if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116503Pa(str))) {
                    sb.append("1");
                } else {
                    sb.append("0");
                }
            }
        }
        CrashHelper.m82479c(new Exception(sb.toString()));
        this.f74513L0 = 0;
    }

    /* JADX INFO: renamed from: v7 */
    public final /* synthetic */ void m102081v7(uxj0 uxj0Var) {
        if (m101951T4().isDialogShowing() || !gjj.m130520a()) {
            return;
        }
        CoreModule.f18264c.f20405m0.f20083H0.put(Long.valueOf(pzi0.m174454o()));
        CoreModule.f18264c.f20405m0.f20080G0 = 0;
    }

    /* JADX INFO: renamed from: v8 */
    public void m102082v8() {
        duringCreated(CoreModule.f18264c.f20442y1.m219411f3()).subscribe(psd0.m173597H(new y20() { // from class: l.py30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154615a.m101993b8((Long) obj);
            }
        }, new y20() { // from class: l.qy30
            @Override // p153l.y20
            public final void call(Object obj) {
                b240.m101751a1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w5 */
    public final void m102083w5() {
        duringCreated(CoreModule.f18264c.f20405m0.f20088I2).filter(new qcj() { // from class: l.m040
            @Override // p153l.qcj
            public final Object call(Object obj) {
                pf60 pf60Var = (pf60) obj;
                return Boolean.valueOf(NullChecker.m82486a(pf60Var) && NullChecker.m82486a(pf60Var.f152156a));
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.n040
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139588a.m101889D6((pf60) obj);
            }
        }));
        if (CoreModule.m30932N().mo61451Co() || gra.m131580I2() || s7a.m184990s()) {
            duringCreated(CoreModule.f18264c.f20420r0.f20770i0).subscribe(psd0.m173596G(new y20() { // from class: l.o040
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f144496a.m101897F6((String) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: w6 */
    public final /* synthetic */ void m102084w6() {
        if (this.f74541i) {
            this.f74541i = false;
            m101976Y4();
        }
    }

    /* JADX INFO: renamed from: w7 */
    public final /* synthetic */ void m102085w7(CoreLikers.C4870a c4870a) {
        CoreModule.f18264c.f20405m0.f20110R0.m137019l(Boolean.FALSE);
        if (NullChecker.m82486a(c4870a) && NullChecker.m82486a(c4870a.f20015e) && !c4870a.f20015e.isEmpty()) {
            User user = c4870a.f20015e.get(0);
            if (this.f74518O == null) {
                this.f74518O = new xgj();
            }
            CoreModule.f18264c.f20405m0.f20105P0.put(Long.valueOf(pzi0.m174454o()));
            vxd0 vxd0Var = CoreModule.f18264c.f20405m0.f20107Q0;
            vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
            this.f74518O.m210898j(m101951T4(), user);
        }
    }

    /* JADX INFO: renamed from: w8 */
    public void m102086w8() {
        this.f74511K0 = false;
    }

    /* JADX INFO: renamed from: x5 */
    public final void m102087x5() {
        if (gra.m131673e()) {
            duringCreated(psd0.m173627t(CoreModule.f18264c.f20405m0.m32069W8(), CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip")), CoreModule.f18264c.f20294B0.m32614j4(), CoreModule.f18264c.f20405m0.f20172m0, new tcj() { // from class: l.wt30
                @Override // p153l.tcj
                /* JADX INFO: renamed from: b */
                public final Object mo112959b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return b240.m101699O0((PartialListOpt) obj, (UserPrivilege) obj2, (VerificationCenter) obj3, (Long) obj4);
                }
            })).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.xt30
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20446z2.m31245j3();
                }
            }, new y20() { // from class: l.yt30
                @Override // p153l.y20
                public final void call(Object obj) {
                    b240.m101701O3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: x6 */
    public final /* synthetic */ void m102088x6() {
        l51.m152888H(m101951T4(), new Runnable() { // from class: l.oy30
            @Override // java.lang.Runnable
            public final void run() {
                this.f149735a.m102084w6();
            }
        }, 400L);
    }

    /* JADX INFO: renamed from: x7 */
    public final /* synthetic */ void m102089x7(Boolean bool) {
        if (bool.booleanValue()) {
            u2n.m194289p(m101951T4());
        } else {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39804A(SwipeDirection.RIGHT);
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38332n6();
        }
    }

    /* JADX INFO: renamed from: x8 */
    public void m102090x8(int i, final int i2, Intent intent) {
        if (i == 18 && NullChecker.m82486a(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2())) {
            this.f74538f = true;
            SwipeDirection swipeDirection = SwipeDirection.RIGHT;
            if (i2 == swipeDirection.getValue() || i2 == SwipeDirection.LEFT.getValue() || i2 == SwipeDirection.UP.getValue()) {
                m101951T4().f25181p = true;
            }
            ik4 ik4VarMo39821o = ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39821o();
            if (NullChecker.m82486a(ik4VarMo39821o) && NullChecker.m82486a(ik4VarMo39821o.m140259d())) {
                final String str = ik4VarMo39821o.m140259d().f56859id;
                if (i2 == swipeDirection.getValue() || i2 == SwipeDirection.LEFT.getValue() || i2 == SwipeDirection.UP.getValue()) {
                    this.f74539g = true;
                    lifecycle().takeFirst(new qcj() { // from class: l.zv30
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
                        }
                    }).subscribe(psd0.m173596G(new y20() { // from class: l.aw30
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f73685a.m102017g8(str, i2, (C4470c) obj);
                        }
                    }));
                    return;
                } else {
                    if (s7a.m184990s() && i2 == 153) {
                        r0e0.INSTANCE.m179216a(m101951T4(), ik4VarMo39821o.m140259d(), true);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (i == 19) {
            if (i2 == -1) {
                m101883B8((ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h), intent.getStringExtra("from"));
                return;
            }
            return;
        }
        if (i != 3002 || i2 != -1) {
            if (i == 23 && intent != null && intent.getBooleanExtra("from_sign_up", false)) {
                m101971X4();
                m102051n8(Boolean.FALSE);
                if (xxv.m213589p(m101951T4())) {
                    m101915J8();
                    return;
                } else {
                    this.f74543k.m137019l(uxj0.f181467a);
                    return;
                }
            }
            return;
        }
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = CoreModule.f18264c.f20405m0.f20136a0.m222761e();
        if (!NullChecker.m82486a(partialListOptM222761e) || jyb.m147479J(partialListOptM222761e.loaded)) {
            return;
        }
        CoreSuggested.UserInfo userInfo = partialListOptM222761e.loaded.get(0);
        if (NullChecker.m82486a(userInfo)) {
            Object obj = userInfo.extensionObject;
            if (obj instanceof OMSAdCardInfo) {
                if (TextUtils.equals(((OMSAdCardInfo) obj).contentType, "tagCardGuide")) {
                    CoreModule.f18264c.f20405m0.f20147d2.add("tagCardGuide");
                }
                ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39804A(SwipeDirection.RIGHT);
            }
        }
    }

    /* JADX INFO: renamed from: y5 */
    public final void m102091y5() {
        duringCreated(ji30.m144967k().distinctUntilChanged()).filter(new qcj() { // from class: l.m140
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((TabName) obj) != TabName.Card);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.y140
            @Override // p153l.y20
            public final void call(Object obj) {
                sdp.m185485b();
            }
        }));
        duringCreated(CoreModule.f18264c.f20405m0.f20065B0).switchMap(new qcj() { // from class: l.ht30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20429u0.m31409P6();
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.ot30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148922a.m101978Y6((pf60) obj);
            }
        }, new y20() { // from class: l.pt30
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20405m0.f20211z0 = 0;
            }
        }));
        duringCreated(CoreModule.f18264c.f20335O2.obs()).observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.qt30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((String) obj).equals(""));
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.rt30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164766a.m101905H6((String) obj);
            }
        }));
        duringCreated(psd0.m173625r(lifecycle(), this.f74548o, new st30()).filter(new qcj() { // from class: l.ut30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                pf60 pf60Var = (pf60) obj;
                return Boolean.valueOf(pf60Var.f152156a == C4470c.f16267i && ((Boolean) pf60Var.f152157b).booleanValue());
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.vt30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185685a.m101909I6((pf60) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20405m0.m32069W8()).subscribe(psd0.m173596G(new y20() { // from class: l.n140
            @Override // p153l.y20
            public final void call(Object obj) {
                b240.m101851u1((PartialListOpt) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20405m0.f20145d0).filter(new qcj() { // from class: l.o140
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((HashMap) obj));
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.q140
            @Override // p153l.y20
            public final void call(Object obj) {
                b240.m101694N0((HashMap) obj);
            }
        }));
        duringCreated(this.f74543k.doOnNext(new y20() { // from class: l.r140
            @Override // p153l.y20
            public final void call(Object obj) {
                b240.m101789i1((uxj0) obj);
            }
        }).switchMap(new qcj() { // from class: l.s140
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f165758a.m101913J6((uxj0) obj);
            }
        }).filter(new qcj() { // from class: l.t140
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((pf60) obj).f152157b == TabName.Card);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.u140
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176967a.m101921L6((pf60) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20405m0.f20142c0).subscribe(psd0.m173596G(new y20() { // from class: l.v140
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181925a.m101925M6((uxj0) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.f89168Y1).subscribe(psd0.m173596G(new y20() { // from class: l.w140
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186762a.m101929N6((uxj0) obj);
            }
        }));
        duringCreated(psd0.m173625r(lifecycle(), this.f74546m, new rcj() { // from class: l.x140
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return b240.m101842s2((C4470c) obj, (uxj0) obj2);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.z140
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202480a.m101932O6((uxj0) obj);
            }
        }));
        duringCreated(C22421c.concat(CoreModule.f18264c.f20438x0.m31189W3() ? C22421c.just(Boolean.TRUE) : C22421c.empty(), CoreModule.f18264c.f20438x0.m31210q4())).subscribe(psd0.m173597H(new y20() { // from class: l.ys30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201369a.m101940Q6((Boolean) obj);
            }
        }, new y20() { // from class: l.zs30
            @Override // p153l.y20
            public final void call(Object obj) {
                b240.m101671H2((Throwable) obj);
            }
        }));
        duringCreated(psd0.m173626s(CoreModule.f18264c.f20381e0.m116596o9().map(new qcj() { // from class: l.at30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return b240.m101776f4((User) obj);
            }
        }), CoreModule.f18264c.f20399k0.f20830R.m159274k(), ric0.m181583m() ? CoreModule.f18264c.f20377c2.m118403o3().distinctUntilChanged() : C22421c.just(uxj0.f181467a), new scj() { // from class: l.bt30
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return new bkj0((DoublePair) obj, (RoamedLocationData) obj2, obj3);
            }
        }).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.ct30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83659a.m101944R6((bkj0) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20405m0.f20092K0).subscribe(psd0.m173596G(new y20() { // from class: l.dt30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90536a.m101948S6((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20405m0.f20089J0).subscribe(psd0.m173596G(new y20() { // from class: l.et30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95686a.m101953T6((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20405m0.f20171l2).subscribe(psd0.m173597H(new y20() { // from class: l.ft30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100713a.m101958U6((String) obj);
            }
        }, new y20() { // from class: l.gt30
            @Override // p153l.y20
            public final void call(Object obj) {
                b240.m101700O1((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20405m0.f20174m2).subscribe(psd0.m173597H(new y20() { // from class: l.jt30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122551a.m101963V6((uxj0) obj);
            }
        }, new y20() { // from class: l.kt30
            @Override // p153l.y20
            public final void call(Object obj) {
                b240.m101866x4((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20405m0.f20177n2).subscribe(psd0.m173597H(new y20() { // from class: l.lt30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133512a.m101968W6((uxj0) obj);
            }
        }, new y20() { // from class: l.mt30
            @Override // p153l.y20
            public final void call(Object obj) {
                b240.m101684K2((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20405m0.f20159h2.asObservable()).subscribe(psd0.m173596G(new y20() { // from class: l.nt30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143577a.m101973X6((SwipeDirection) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y6 */
    public final /* synthetic */ void m102092y6() {
        this.f74543k.m137019l(uxj0.f181467a);
        if (iz40.m142788y(m101951T4(), true)) {
            return;
        }
        this.f74502G.m137019l(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: y7 */
    public final /* synthetic */ void m102093y7(SwipeDirection swipeDirection) {
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38332n6();
        SwipeDirection swipeDirection2 = SwipeDirection.RIGHT;
        if (swipeDirection == swipeDirection2) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39804A(swipeDirection2);
            return;
        }
        SwipeDirection swipeDirection3 = SwipeDirection.LEFT;
        if (swipeDirection == swipeDirection3) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39804A(swipeDirection3);
            return;
        }
        SwipeDirection swipeDirection4 = SwipeDirection.UP;
        if (swipeDirection == swipeDirection4) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39804A(swipeDirection4);
        }
    }

    /* JADX INFO: renamed from: y8 */
    public VSwipeStack.OnCardSwipeResult m102094y8(xql xqlVar, SwipeDirection swipeDirection, boolean z) {
        if (this.f74509J0 == null) {
            this.f74509J0 = new C8049j();
        }
        if (!this.f74535c) {
            CrashHelper.m82479c(new IllegalStateException("onCardSwipe be called before card rendered"));
        } else if (xqlVar.mo37886e0() && NullChecker.m82486a(xqlVar.getCardDataProxy()) && NullChecker.m82486a(xqlVar.getCardDataProxy().m140259d())) {
            CoreBusinessModule.f18256g.m191629b().f169296b = xqlVar.getCardDataProxy().m140259d().f56859id;
        } else {
            CoreBusinessModule.f18256g.m191629b().f169296b = "";
        }
        SwipeDirection swipeDirection2 = SwipeDirection.RIGHT;
        boolean z2 = true;
        boolean z3 = swipeDirection == swipeDirection2 || swipeDirection == SwipeDirection.UP;
        SwipeDirection swipeDirection3 = SwipeDirection.UP;
        boolean z4 = swipeDirection == swipeDirection3;
        if (!z) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38260Z1(z3, z4).mo39361i();
        }
        if (!gra.m131606N3()) {
            if (z3) {
                V v2 = this.viewModel;
                if (z4) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC8017b) v2).m38350r2().reset();
                } else {
                    ((ViewTreeObserverOnGlobalLayoutListenerC8017b) v2).m38137C2().reset();
                }
                ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38334o2().reset();
            } else {
                ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38350r2().reset();
                ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38137C2().reset();
            }
        }
        if (z3) {
            cf7 cf7Var = CoreModule.f18264c.f20404l2;
            cf7Var.f81482T = 0;
            cf7Var.f81483U++;
        } else {
            cf7 cf7Var2 = CoreModule.f18264c.f20404l2;
            cf7Var2.f81482T++;
            cf7Var2.f81483U = 0;
        }
        xqlVar.mo37901j0(swipeDirection);
        HomeStatisticsHelper.m37694E("card");
        HomeStatisticsHelper.m37695F("swipe");
        r4a r4aVar = CoreModule.f18264c.f20364Y0;
        if (swipeDirection != swipeDirection2 && swipeDirection != swipeDirection3) {
            z2 = false;
        }
        r4aVar.m179746e(z2);
        VSwipeStack.OnCardSwipeResult onCardSwipeResultMo38500a = this.f74509J0.mo38500a(new C8049j.a(this, (ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel, xqlVar.getCardDataProxy(), swipeDirection, z));
        onCardSwipeResultMo38500a.name();
        VSwipeStack.OnCardSwipeResult onCardSwipeResult = VSwipeStack.OnCardSwipeResult.pass;
        if (onCardSwipeResultMo38500a == onCardSwipeResult) {
            CoreModule.f18264c.f20364Y0.m179747f();
        }
        if (s7a.m184994w() && onCardSwipeResultMo38500a != VSwipeStack.OnCardSwipeResult.stay) {
            z5h0.m218675j().m218698w(null);
        }
        VSwipeStack.OnCardSwipeResult onCardSwipeResult2 = VSwipeStack.OnCardSwipeResult.back;
        if (onCardSwipeResultMo38500a == onCardSwipeResult2) {
            cf7 cf7Var3 = CoreModule.f18264c.f20404l2;
            cf7Var3.f81482T = 0;
            cf7Var3.f81483U = 0;
        }
        if (onCardSwipeResultMo38500a == onCardSwipeResult2 || onCardSwipeResultMo38500a == onCardSwipeResult) {
            m101995c5();
        }
        m101750Z8(null);
        this.f74539g = false;
        this.f74532Z = null;
        this.f74540h = false;
        if (!gra.m131606N3() && IntlCountryCodeController.m29125v()) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38255X5(onCardSwipeResultMo38500a, swipeDirection);
            if (onCardSwipeResultMo38500a != onCardSwipeResult) {
                return VSwipeStack.OnCardSwipeResult.stay;
            }
        }
        if (gra.m131775y1()) {
            nwb.m164975m();
        }
        if (onCardSwipeResultMo38500a == onCardSwipeResult) {
            NavigationBarAdmobHelper.INSTANCE.m37167y();
        }
        CoreModule.f18264c.f20404l2.f81481S = pzi0.m174454o();
        CoreModule.f18264c.f20428t2.m215202p3();
        return onCardSwipeResultMo38500a;
    }

    /* JADX INFO: renamed from: z5 */
    public final void m102095z5() {
        creates(new y20() { // from class: l.zt30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205911a.m101983Z6((Bundle) obj);
            }
        }, new x20() { // from class: l.au30
            @Override // p153l.x20
            public final void call() {
                b240.m101747Z1();
            }
        });
    }

    /* JADX INFO: renamed from: z6 */
    public final /* synthetic */ void m102096z6() {
        this.f74543k.m137019l(uxj0.f181467a);
        if (iz40.m142788y(m101951T4(), true)) {
            return;
        }
        this.f74502G.m137019l(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: z7 */
    public final /* synthetic */ void m102097z7(SwipeDirection swipeDirection) {
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38332n6();
        SwipeDirection swipeDirection2 = SwipeDirection.RIGHT;
        if (swipeDirection == swipeDirection2) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39804A(swipeDirection2);
            return;
        }
        SwipeDirection swipeDirection3 = SwipeDirection.LEFT;
        if (swipeDirection == swipeDirection3) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39804A(swipeDirection3);
            return;
        }
        SwipeDirection swipeDirection4 = SwipeDirection.UP;
        if (swipeDirection == swipeDirection4) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39804A(swipeDirection4);
        }
    }

    /* JADX INFO: renamed from: z8 */
    public void m102098z8(boolean z) {
        this.f74525S = z;
        this.f74526T.m137019l(Boolean.valueOf(z));
        if (!z) {
            if (this.f74541i) {
                this.f74541i = false;
                m101976Y4();
            }
            if (this.f74536d) {
                this.f74536d = false;
                if (NullChecker.m82486a(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2()) && NullChecker.m82486a(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39816j())) {
                    HomeStatisticsHelper.m37706i(((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39816j(), ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38344q2().pageId());
                    ik4 ik4VarMo39821o = ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38128A2().mo39821o();
                    String strPageId = ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38344q2().pageId();
                    String str = this.f74533a;
                    HomeStatisticsHelper.m37715r(ik4VarMo39821o, strPageId, str, m102015g6(str));
                }
            }
        }
        if (!ric0.m181583m() && CoreModule.f18264c.f20318J0.m156766F3() && ((lifecycle_() == C4470c.f16267i || lifecycle_() == C4470c.f16266h) && !z)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38215Q5(true);
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38372v5(z);
        if (!this.f74525S) {
            if (hw80.f111874f && this.f74500F) {
                ((ViewTreeObserverOnGlobalLayoutListenerC8017b) this.viewModel).m38187L5(true, true);
                CoreModule.f18264c.f20405m0.m32139p8(true);
            }
            hw80.f111874f = false;
        }
        if (d09.m113369f()) {
            String str2 = CoreModule.f18264c.f20381e0.f89035G2.get();
            if (this.f74525S || TextUtils.isEmpty(str2) || !pzi0.m174438C(pzi0.m174454o(), CoreModule.f18264c.f20381e0.f89042H2.get().longValue())) {
                return;
            }
            CoreModule.f18264c.f20381e0.f89035G2.put("");
            i4g0.m138526x("e_boost_checkin_toast", "p_suggest_users_home_view");
            of7.m167420o().m167425A(m101951T4(), str2 + BaseSei.f14624X);
        }
    }

    /* JADX INFO: renamed from: C5 */
    public void m101884C5() {
    }
}
