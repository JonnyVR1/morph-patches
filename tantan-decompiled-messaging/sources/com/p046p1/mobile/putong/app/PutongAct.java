package com.p046p1.mobile.putong.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AutoCompleteTextView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SearchView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.ExtraActLifecycle;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.api.push.PushTrackData;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.statistics.AppOpenWayStats;
import com.p046p1.mobile.putong.app.surveysparrow.SurveySparrowHelper;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.p046p1.mobile.putong.p065ui.splash.SplashProxyAct;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p149l.au2;
import p149l.bd50;
import p149l.c6q0;
import p149l.cdq0;
import p149l.cwf0;
import p149l.d30;
import p149l.ddq0;
import p149l.e30;
import p149l.e51;
import p149l.edq0;
import p149l.gbl0;
import p149l.j760;
import p149l.jkb0;
import p149l.k0c0;
import p149l.kce;
import p149l.l8m;
import p149l.lqf;
import p149l.lsi0;
import p149l.m7c0;
import p149l.mgh0;
import p149l.mkd0;
import p149l.n3m;
import p149l.nx0;
import p149l.qib0;
import p149l.rol;
import p149l.s4c0;
import p149l.s5c0;
import p149l.shd;
import p149l.tqx;
import p149l.u7c0;
import p149l.v0c0;
import p149l.vhd;
import p149l.vwb;
import p149l.w2c0;
import p149l.w9j;
import p149l.xaj0;
import p149l.xdl0;
import p149l.y6q0;
import p149l.ydb0;
import p149l.ygj0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"Registered"})
public class PutongAct extends Act implements n3m {
    private static final String KEY_SAVE_WINDOW_DENSITY = "window_density";
    public static final int REQUEST_CODE_PICKER = 786;
    public static final int REQUEST_CODE_PICKER_WITH_SWIPE = 6666;
    private static final String TAG = "PutongAct";
    public static final String TANKER_PLUGIN_VERSION = ".tanker_plugin_version";
    protected static tqx defaultMediaPickerHandlerFactory = new C4699a.a();
    private static boolean hasReport;
    public static volatile long lastDispatchTouchEventMillis;
    static long previousCheck;
    private nx0 appTheme;
    private shd floatButtonManager;
    private vhd floatButtonManagerForXHS;
    protected boolean mIfInNewUi1ShouldUseThemNewUI2;
    protected C4699a mediaPickerHandler;
    public View statusHeaderView;
    protected edq0 xmlMonitorLayoutInflater;
    protected cwf0 pageHelper = null;
    private Theme currentTheme = Theme.normal;
    private l8m iapManager = new l8m(this);
    boolean badTokenExpireControl = RemoteConfig.m79298x().m79330s("bad_token_exprie_control");
    private Boolean isAnonymousMode = null;

    public enum Theme {
        normal,
        ui1,
        ui2
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.app.PutongAct$a */
    public class C4696a implements bd50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f17170a;

        public C4696a(View view) {
            this.f17170a = view;
        }

        @Override // p149l.bd50
        @NonNull
        public y6q0 onApplyWindowInsets(@NonNull View view, @NonNull y6q0 y6q0Var) {
            int systemUiVisibility = PutongAct.this.getWindow().getDecorView().getSystemUiVisibility() & 1024;
            View view2 = this.f17170a;
            if (systemUiVisibility == 1024) {
                view2.setTag(s4c0.f162335g, null);
                Integer num = (Integer) this.f17170a.getTag(s4c0.f162333f);
                if (num != null) {
                    View view3 = this.f17170a;
                    view3.setPadding(view3.getPaddingLeft(), num.intValue(), this.f17170a.getPaddingRight(), this.f17170a.getPaddingBottom());
                }
            } else if (view2.getTag(s4c0.f162335g) == null) {
                PutongAct.paddingToStatusBar(this.f17170a, y6q0Var);
            }
            PutongAct.this.setPaddingToNavigationBar(y6q0Var.m213179f(y6q0.C21326l.m213234d()).f160975d);
            return y6q0Var;
        }
    }

    static {
        Act.debugShowMenu = false;
        boolean z = App.f15366b;
        previousCheck = SystemClock.elapsedRealtime();
        Act.foreground().subscribe(mkd0.m154955G(new e30() { // from class: l.zib0
            @Override // p149l.e30
            public final void call(Object obj) {
                PutongAct.m29612C1((Act.C4299r) obj);
            }
        }));
        Act.foreground().distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.ajb0
            @Override // p149l.e30
            public final void call(Object obj) {
                PutongAct.m29625S1((Act.C4299r) obj);
            }
        }));
        lqf.m151015a().m151016b(ExtraActLifecycle.onResumeFromAppStartOrBackground, new e30() { // from class: l.bjb0
            @Override // p149l.e30
            public final void call(Object obj) {
                e51.m114743H((Act) obj, new Runnable() { // from class: l.sib0
                    @Override // java.lang.Runnable
                    public final void run() {
                        PutongAct.m29622O1();
                    }
                }, 200L);
            }
        });
        lqf.m151015a().m151016b(ExtraActLifecycle.onResumeFromAppStart, new e30() { // from class: l.cjb0
            @Override // p149l.e30
            public final void call(Object obj) {
                qib0.m174819h0();
            }
        });
        lastDispatchTouchEventMillis = 0L;
    }

    /* JADX INFO: renamed from: C1 */
    public static /* synthetic */ void m29612C1(Act.C4299r c4299r) {
        lastDispatchTouchEventMillis = SystemClock.elapsedRealtime();
        if (NullChecker.m81303a(c4299r) && SystemClock.elapsedRealtime() - previousCheck > 240000 && qib0.f154714c0.signedIn_()) {
            previousCheck = SystemClock.elapsedRealtime();
            TantanApp.f17180c.m214266e0();
        }
    }

    public static boolean FlymeSetStatusBarLightMode(Window window, boolean z) {
        if (!NullChecker.m81303a(window)) {
            return false;
        }
        try {
            WindowManager.LayoutParams attributes = window.getAttributes();
            Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
            Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            int i = declaredField.getInt(null);
            int i2 = declaredField2.getInt(attributes);
            declaredField2.setInt(attributes, z ? i2 | i : (~i) & i2);
            window.setAttributes(attributes);
            return true;
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException unused) {
            return false;
        }
    }

    public static boolean MIUISetStatusBarLightMode(Window window, boolean z) {
        if (NullChecker.m81303a(window)) {
            Class<?> cls = window.getClass();
            try {
                Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
                Class cls3 = Integer.TYPE;
                Method method = cls.getMethod("setExtraFlags", cls3, cls3);
                if (z) {
                    method.invoke(window, Integer.valueOf(i), Integer.valueOf(i));
                    return true;
                }
                method.invoke(window, 0, Integer.valueOf(i));
                return true;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: O1 */
    public static /* synthetic */ void m29622O1() {
        if (qib0.f154714c0.signedIn_() && e51.m114736A(App.f15369e)) {
            qib0.f154699N.tryMarkAsDAU();
        }
    }

    /* JADX INFO: renamed from: S1 */
    public static /* synthetic */ void m29625S1(Act.C4299r c4299r) {
        if (c4299r == null) {
            AppOpenWayStats.m29670b();
        } else if (NullChecker.m81303a(c4299r.f15343a.get())) {
            AppOpenWayStats.m29674f();
        } else {
            AppOpenWayStats.m29670b();
        }
    }

    /* JADX INFO: renamed from: T1 */
    public static /* synthetic */ void m29626T1(SearchView searchView, SearchableInfo searchableInfo) {
        if (searchView != null) {
            searchView.setSearchableInfo(searchableInfo);
        }
    }

    private void checkAndAddLinkView(Intent intent) {
        shd shdVar = new shd(this.act, intent);
        this.floatButtonManager = shdVar;
        shdVar.m184188i();
    }

    private void checkAnonymousMode() {
        HashMap<Integer, ArrayList<Act.C4299r>> mapGlobalLifeCycle_ = Act.globalLifeCycle_();
        if (NullChecker.m81303a(mapGlobalLifeCycle_) && mapGlobalLifeCycle_.containsKey(Integer.valueOf(act().getTaskId()))) {
            ArrayList<Act.C4299r> arrayList = mapGlobalLifeCycle_.get(Integer.valueOf(act().getTaskId()));
            Activity activity = arrayList.size() > 0 ? arrayList.get(arrayList.size() - 1).f15343a.get() : null;
            if (activity instanceof PutongAct) {
                this.isAnonymousMode = Boolean.valueOf(((PutongAct) activity).isAnonymousMode());
            }
        }
        act().getClass();
        NullChecker.m81303a(this.isAnonymousMode);
    }

    private void checkPatchResNotFound() {
    }

    private void checkPushTrack(Intent intent) {
        try {
            if (NullChecker.m81304b(intent) && intent.getBooleanExtra("bundle_from_notification", false)) {
                PushTrackData pushTrackData = (PushTrackData) intent.getSerializableExtra("bundle_push_track_info");
                if (NullChecker.m81303a(pushTrackData)) {
                    pushTrackData.alreadyClick();
                    ydb0.m214222f0(pushTrackData);
                    AppOpenWayStats.m29673e(pushTrackData);
                }
            }
        } catch (Throwable th) {
            CrashHelper.m81296c(th);
        }
    }

    private void checkXHSAndAddLinkView(Intent intent) {
        vhd vhdVar = this.floatButtonManagerForXHS;
        if (vhdVar == null || !vhdVar.m198432g()) {
            vhd vhdVar2 = new vhd(this.act, intent);
            this.floatButtonManagerForXHS = vhdVar2;
            vhdVar2.m198435j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$customSearchView$10(final SearchView searchView) {
        final SearchableInfo searchableInfo = ((SearchManager) act().getSystemService(FirebaseAnalytics.Event.SEARCH)).getSearchableInfo(act().getComponentName());
        e51.m114741F(act(), new Runnable() { // from class: l.yib0
            @Override // java.lang.Runnable
            public final void run() {
                PutongAct.m29626T1(searchView, searchableInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        if (shouldSwitchToTransparentStatus()) {
            setTransparentStatusBar();
        }
        tryToInitStatusBarHeight();
        checkStatusBarHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$1(Bundle bundle) {
        if (needBindBillingService()) {
            this.iapManager.m148936l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$2(Bundle bundle) {
        checkPushTrack(getIntent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$4(C4319c c4319c) {
        this.iapManager.m148940p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$5(C4319c c4319c) {
        if (NullChecker.m81304b(this.pageHelper)) {
            if (c4319c == C4319c.f15545f) {
                this.pageHelper.m109027c();
                return;
            }
            if (c4319c == C4319c.f15548i) {
                this.pageHelper.m109042r();
            } else if (c4319c == C4319c.f15549j) {
                this.pageHelper.m109031g();
            } else if (c4319c == C4319c.f15552m) {
                this.pageHelper.m109029e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$6(Bundle bundle) {
        checkAnonymousMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$8(C4319c c4319c) {
        hideDeepLinkFloatButton(false);
    }

    public static void paddingToStatusBar(View view, y6q0 y6q0Var) {
        if (y6q0Var != null) {
            view.setPadding(view.getPaddingLeft(), y6q0Var.m213179f(y6q0.C21326l.m213235e()).f160973b, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public static void setLightStatusBar(Window window, boolean z, int i) {
        View decorView = window.getDecorView();
        int systemUiVisibility = i | decorView.getSystemUiVisibility();
        if (z && (systemUiVisibility & 8192) == 0) {
            systemUiVisibility |= 8192;
        } else if (!z && (systemUiVisibility & 8192) != 0) {
            systemUiVisibility ^= 8192;
        }
        decorView.setSystemUiVisibility(systemUiVisibility);
    }

    public static void setMediaPickerHandlerFactory(tqx tqxVar) {
        defaultMediaPickerHandlerFactory = tqxVar;
    }

    private void tryToInitStatusBarHeight() {
        View viewFindViewById = findViewById(R.id.content);
        if (viewFindViewById != null) {
            xdl0.m208354R(viewFindViewById);
        }
    }

    @Override // com.p046p1.mobile.android.app.Act
    public String actionItemPadding(String str) {
        return "  " + str.trim() + "  ";
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (IntlCountryCodeController.m28126v()) {
            context = ygj0.m214728c(context);
        }
        super.attachBaseContext(context);
    }

    public void checkGradientColors() {
        if (getAppTheme().mo105497m()) {
            getAppTheme().mo105491a();
            return;
        }
        if (shouldShowGradientActionBar() && NullChecker.m81303a(toolbar())) {
            toolbar().setBackgroundResource(w2c0.f184207w0);
        }
        if (shouldShowGradientStatusBar()) {
            setGradientStatusBar();
        }
    }

    public boolean checkRunningCondition() {
        if (!ensureCoreAndAccount()) {
            lsi0.m151578h(R$string.f17305B);
            startActivity(SplashProxyAct.m80105l(App.f15369e));
            return true;
        }
        if (ensurePermission() && ensurePlugin()) {
            return false;
        }
        startActivity(mgh0.m154564t(getIntent()));
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void checkSavedInstanceStateAndCache(Bundle bundle) {
        super.checkSavedInstanceStateAndCache(bundle);
    }

    public void checkStatusBarHeight() {
        if (Build.VERSION.SDK_INT <= 34) {
            return;
        }
        View viewFindViewById = findViewById(R.id.content);
        viewFindViewById.setTag(s4c0.f162333f, Integer.valueOf(viewFindViewById.getPaddingTop()));
        gbl0.m125231y0(viewFindViewById, new C4696a(viewFindViewById));
        gbl0.m125195g0(viewFindViewById);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void cropImage(String str) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo29653a(str);
    }

    public xaj0<SearchView, View, View> customSearchView(final SearchView searchView) {
        AutoCompleteTextView autoCompleteTextView;
        View view;
        e51.m114774y(new Runnable() { // from class: l.xib0
            @Override // java.lang.Runnable
            public final void run() {
                this.f193094a.lambda$customSearchView$10(searchView);
            }
        });
        try {
            autoCompleteTextView = (AutoCompleteTextView) searchView.findViewById(s5c0.f162504J);
            Field declaredField = SearchView.class.getDeclaredField("mCloseButton");
            declaredField.setAccessible(true);
            view = (View) declaredField.get(searchView);
        } catch (IllegalAccessException e) {
            CrashHelper.m81296c(e);
            autoCompleteTextView = null;
            view = null;
        } catch (NoSuchFieldException e2) {
            CrashHelper.m81296c(e2);
            autoCompleteTextView = null;
            view = null;
        }
        getAppTheme().mo103049l(searchView);
        return xaj0.m207578a(searchView, view, autoCompleteTextView);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public ArrayList<j760<String, d30>> debugItems() {
        return super.debugItems();
    }

    public boolean disableAutoPV() {
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        lastDispatchTouchEventMillis = SystemClock.elapsedRealtime();
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean ensureCoreAndAccount() {
        if (TantanApp.f17179b == null || !qib0.f154714c0.signedIn_()) {
            return !(this instanceof rol);
        }
        return true;
    }

    public void ensureMediaPickerHandler() {
        if (this.mediaPickerHandler == null) {
            this.mediaPickerHandler = defaultMediaPickerHandlerFactory.mo29191a(this);
        }
    }

    public boolean ensurePermission() {
        return true;
    }

    public boolean ensurePlugin() {
        if (TantanApp.f17179b == null || !qib0.f154714c0.signedIn_()) {
            return !(this instanceof rol);
        }
        return qib0.m174779J0() || !(this instanceof rol);
    }

    public int getActionBarHeight() {
        if (getSupportActionBar() == null) {
            return 0;
        }
        int iMo134124k = getSupportActionBar().mo134124k();
        if (iMo134124k == 0) {
            TypedValue typedValue = new TypedValue();
            if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
                return TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
            }
        }
        return iMo134124k;
    }

    @Override // com.p046p1.mobile.android.app.Act
    @NonNull
    public nx0 getAppTheme() {
        if (this.appTheme == null) {
            this.appTheme = new c6q0(this);
        }
        return this.appTheme;
    }

    public Theme getCurrentTheme() {
        return this.currentTheme;
    }

    public int getDefaultThemeResId() {
        return u7c0.f174991i;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return super.getResources();
    }

    public edq0 getXmlMonitorLayoutInflater() {
        return this.xmlMonitorLayoutInflater;
    }

    public void hideDeepLinkFloatButton(boolean z) {
        if (NullChecker.m81303a(this.floatButtonManager)) {
            if (!z || this.floatButtonManager.m184184e()) {
                this.floatButtonManager.m184183d();
            }
        }
    }

    public l8m iap() {
        return this.iapManager;
    }

    @Override // com.p046p1.mobile.android.app.Act
    @NonNull
    public LayoutInflater inflater() {
        if (!needXmlMonitor() || !ddq0.m111055a().m111056b()) {
            return super.inflater();
        }
        if (this.xmlMonitorLayoutInflater == null) {
            this.xmlMonitorLayoutInflater = new edq0(this);
        }
        this.xmlMonitorLayoutInflater.m115827a(pageId());
        return this.xmlMonitorLayoutInflater;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        au2.m98938z();
        super.initDataOnCreate();
        if (this instanceof rol) {
            ABManager.m29316D();
        }
        initPageHelper();
    }

    public void initPageHelper() {
        this.pageHelper = new cwf0(this);
    }

    public xaj0<SearchView, View, View> initSearchMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(m7c0.f131819a, menu);
        return customSearchView((SearchView) menu.findItem(s4c0.f162318V).getActionView());
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.djb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86514a.lambda$initSubscription$0((Bundle) obj);
            }
        });
        creates(new e30() { // from class: l.ejb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f91681a.lambda$initSubscription$1((Bundle) obj);
            }
        });
        creates(new e30() { // from class: l.fjb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97767a.lambda$initSubscription$2((Bundle) obj);
            }
        });
        lifecycle().filter(new w9j() { // from class: l.gjb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15552m);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.hjb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108056a.lambda$initSubscription$4((C4319c) obj);
            }
        }));
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.tib0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170550a.lambda$initSubscription$5((C4319c) obj);
            }
        }));
        creates(new e30() { // from class: l.uib0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176640a.lambda$initSubscription$6((Bundle) obj);
            }
        });
        lifecycle().filter(new w9j() { // from class: l.vib0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15549j);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.wib0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186517a.lambda$initSubscription$8((C4319c) obj);
            }
        }));
    }

    public boolean isAnonymousMode() {
        if (NullChecker.m81303a(this.isAnonymousMode)) {
            return this.isAnonymousMode.booleanValue();
        }
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void monitorInflateViewCost(long j) {
        if (needXmlMonitor() && ddq0.m111055a().m111056b()) {
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            if (jCurrentTimeMillis > ddq0.m111055a().m111057c()) {
                zvf0.m220369B("e_inflate_view", pageId(), vwb.m200311Y("page_name", pageId()), vwb.m200311Y("time_consume", Long.valueOf(jCurrentTimeMillis)));
            }
        }
    }

    public boolean needBindBillingService() {
        return false;
    }

    public boolean needRefreshPrivilege() {
        return false;
    }

    public boolean needRefreshUser() {
        return qib0.f154714c0.signedIn_();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public boolean needXmlMonitor() {
        return this instanceof cdq0;
    }

    @Override // com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 786) {
            if (i2 == -1) {
                ArrayList arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h);
                if (intent.hasExtra("extra_from_type")) {
                    onPickImagesResult(arrayList, intent.getIntExtra("extra_from_type", 0));
                } else {
                    onPickImagesResult(arrayList);
                }
            }
        } else if (i == 1011) {
            jkb0.m141847q(intent);
        } else if (i == 1242) {
            SurveySparrowHelper.INSTANCE.m29693o(i2, intent);
        } else {
            super.onActivityResult(i, i2, intent);
        }
        this.iapManager.m148939o(i, i2, intent);
    }

    @Override // com.p046p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (IntlCountryCodeController.m28126v()) {
            configuration = ygj0.m214727b(configuration);
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
    }

    @Override // com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        checkPushTrack(intent);
        checkXHSAndAddLinkView(intent);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onPauseLifecycle() {
        super.onPauseLifecycle();
    }

    public void onPickImagesResult(List<Media> list) {
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onReadIntentError() {
        try {
            startActivity(SplashProxyAct.m80105l(App.f15369e));
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            m50458m2();
        }
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onRestoreGlobalState(Bundle bundle) {
        super.onRestoreGlobalState(bundle);
        if (bundle.containsKey(KEY_SAVE_WINDOW_DENSITY)) {
            float f = bundle.getFloat(KEY_SAVE_WINDOW_DENSITY);
            float f2 = getResources().getDisplayMetrics().density;
            if (f > 0.0f && f != f2) {
                xdl0.m208333G0(true);
            }
        }
        ABManager.m29320J(bundle);
    }

    @Override // com.p046p1.mobile.android.app.Act
    @SuppressLint({"LogUseError"})
    public void onResumeLifecycle() {
        if (this.badTokenExpireControl) {
            int taskId = getTaskId();
            Log.e(TAG, "PutongAct onResumeLifecycle taskId:" + taskId);
            if (taskId <= 0) {
                CrashHelper.m81296c(new IllegalStateException("ActBadTokenException occurs!!! Act:" + this + " taskId:" + taskId));
                m50458m2();
                return;
            }
        }
        super.onResumeLifecycle();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onSaveGlobalState(Bundle bundle) {
        super.onSaveGlobalState(bundle);
        bundle.putFloat(KEY_SAVE_WINDOW_DENSITY, getResources().getDisplayMetrics().density);
        ABManager.m29321K(bundle);
    }

    @Override // com.p046p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onStopLifecycle() {
        super.onStopLifecycle();
    }

    @Override // android.app.Activity
    public void overridePendingTransition(int i, int i2) {
        super.overridePendingTransition(i, i2);
    }

    @Override // com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return getClass().getName();
    }

    public void pickImagesWithInstaPicker(int i) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo29654b(i);
    }

    public void pickImagesWithInstaPickerWithExtraAction(int i, e30<Intent> e30Var) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo29655c(i, e30Var);
    }

    public void pickImagesWithPicker(int i, boolean z, boolean z2, boolean z3) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo29656d(i, z, z2, z3);
    }

    public void pickImagesWithPickerInFloatLayerExp(int i, boolean z, boolean z2, boolean z3, Gender gender) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo29660h(i, z, z2, z3, gender);
    }

    public void pickMediasWithInstaPicker() {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo29662j();
    }

    public void pickVideoWithPicker(boolean z) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo29665m(z);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        checkGradientColors();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        if (shouldWrapContentViewWithTransparentHeader() && shouldSwitchToTransparentStatus()) {
            view = wrapContentViewWithTransparentHeader(view);
        }
        checkAndAddLinkView(getIntent());
        checkXHSAndAddLinkView(getIntent());
        super.setContentView(view);
    }

    public void setCustomAppTheme() {
        if (NullChecker.m81303a(toolbar())) {
            getAppTheme().mo103047i(toolbar());
        }
        if (NullChecker.m81303a(getSupportActionBar())) {
            getAppTheme().mo105495h(getSupportActionBar());
        }
        getAppTheme().mo105496k(getWindow());
    }

    public void setNewUI2Theme() {
        this.currentTheme = Theme.ui2;
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(k0c0.f120477a, typedValue, true);
        TypedValue typedValue2 = new TypedValue();
        getTheme().resolveAttribute(k0c0.f120478b, typedValue2, true);
        if (typedValue.data == 0 || typedValue2.data != 0) {
            return;
        }
        setTheme(getDefaultThemeResId());
        if (NullChecker.m81303a(getSupportActionBar())) {
            getSupportActionBar().mo134111A(0.0f);
            kce kceVar = new kce(this);
            kceVar.m145374c(getResources().getColor(v0c0.f179104k));
            kceVar.m145376e(1.0f);
            getSupportActionBar().mo134113C(kceVar);
        }
    }

    public void setStatusBarColorResId(int i) {
        setLightStatusBar(16);
        setStatusBarColor(getResources().getColor(i));
        FlymeSetStatusBarLightMode(getWindow(), true);
        MIUISetStatusBarLightMode(getWindow(), true);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void setTheme() {
        if (getAppTheme().mo105497m()) {
            setCustomAppTheme();
            return;
        }
        if (shouldSwitchToGradientColoredStatusBar()) {
            setUI1Theme();
        }
        if (NullChecker.m81303a(getSupportActionBar()) && "Lenovo".equals(Build.BRAND) && "Lenovo K10e70".equals(Build.MODEL)) {
            getSupportActionBar().mo134112B(w2c0.f184162a);
        }
    }

    public void setTransparentStatusBar() {
        if (Build.VERSION.SDK_INT >= 26) {
            getWindow().getDecorView().setSystemUiVisibility(1040);
        } else {
            getWindow().getDecorView().setSystemUiVisibility(1024);
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().setStatusBarColor(0);
        setStatusBarColor(0);
        if (NullChecker.m81303a(getSupportActionBar())) {
            getSupportActionBar().mo134111A(0.0f);
        }
    }

    public void setUI1Theme() {
        this.currentTheme = Theme.ui1;
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(k0c0.f120477a, typedValue, true);
        TypedValue typedValue2 = new TypedValue();
        getTheme().resolveAttribute(k0c0.f120478b, typedValue2, true);
        if (typedValue.data == 0 || typedValue2.data != 0) {
            return;
        }
        setTheme(u7c0.f174990h);
        if (NullChecker.m81303a(getSupportActionBar())) {
            getSupportActionBar().mo134111A(0.0f);
        }
    }

    public void setXmlMonitorLayoutInflater(edq0 edq0Var) {
        this.xmlMonitorLayoutInflater = edq0Var;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public boolean shouldBlockOnCreate(Bundle bundle) {
        return checkRunningCondition();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public boolean shouldBlockOnResume() {
        return checkRunningCondition();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public boolean shouldBlockOnStart() {
        return checkRunningCondition();
    }

    public boolean shouldRemarginContent() {
        return false;
    }

    public boolean shouldShowGradientActionBar() {
        return getAppTheme().mo105499o();
    }

    public boolean shouldShowGradientStatusBar() {
        return getAppTheme().mo105500p();
    }

    public boolean shouldSwitchToGradientColoredStatusBar() {
        return getAppTheme().mo105501q();
    }

    public boolean shouldSwitchToTransparentStatus() {
        return false;
    }

    public boolean shouldWrapContentViewWithTransparentHeader() {
        return false;
    }

    public List<Object> trackedArgs() {
        return Collections.EMPTY_LIST;
    }

    public View wrapContentViewWithTransparentHeader(View view) {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.addView(view);
        FrameLayout frameLayout2 = new FrameLayout(this);
        if (getAppTheme().mo105497m()) {
            frameLayout2.setBackground(getAppTheme().mo105494g());
        } else {
            frameLayout2.setBackgroundResource(w2c0.f184209x0);
        }
        xdl0.m208398r0(frameLayout2);
        xdl0.m208396q0(getActionBarHeight(), frameLayout2);
        xdl0.m208327D0(-1, frameLayout2);
        if (shouldRemarginContent()) {
            xdl0.m208362Z(view);
            xdl0.m208361Y(getActionBarHeight(), view);
        }
        this.statusHeaderView = frameLayout2;
        frameLayout.addView(frameLayout2);
        return frameLayout;
    }

    public void onPickImagesResult(List<Media> list, int i) {
    }

    public void pickImagesWithPicker(int i, boolean z, boolean z2, boolean z3, String str) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo29658f(i, z, z2, z3, str);
    }

    public void pickImagesWithPickerInFloatLayerExp(int i, boolean z, boolean z2, boolean z3, Gender gender, String str) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo29661i(i, z, z2, z3, gender, str);
    }

    public void pickMediasWithInstaPicker(MusicContent musicContent) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo29663k(musicContent);
    }

    public void pickImagesWithPicker(int i, boolean z, boolean z2, boolean z3, String str, int i2) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo29659g(i, z, z2, z3, str, i2);
    }

    public void pickMediasWithInstaPicker(String str, MusicContent musicContent) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo29664l(str, musicContent);
    }

    public void pickImagesWithPicker(int i, boolean z, boolean z2, boolean z3, int i2) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo29657e(i, z, z2, z3, i2);
    }

    public static void setLightStatusBar(Window window, int i) {
        setLightStatusBar(window, true, i);
    }

    public void setLightStatusBar(int i) {
        setLightStatusBar(getWindow(), i);
    }
}
