package com.p000p1.mobile.putong.app;

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
import com.p000p1.mobile.putong.api.ABManager;
import com.p000p1.mobile.putong.api.push.PushTrackData;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.app.statistics.AppOpenWayStats;
import com.p000p1.mobile.putong.app.surveysparrow.SurveySparrowHelper;
import com.p000p1.mobile.putong.common.R$string;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.ExtraActLifecycle;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import com.p1.mobile.putong.ui.splash.SplashProxyAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import l.bd50;
import l.cwf0;
import l.d30;
import l.ddq0;
import l.e30;
import l.e51;
import l.gbl0;
import l.j760;
import l.kce;
import l.l8m;
import l.lqf;
import l.lsi0;
import l.mgh0;
import l.mkd0;
import l.n3m;
import l.nx0;
import l.s5c0;
import l.vwb;
import l.w9j;
import l.xaj0;
import l.xdl0;
import l.y6q0;
import l.ygj0;
import l.zvf0;
import p006l.au2;
import p006l.c6q0;
import p006l.cdq0;
import p006l.edq0;
import p006l.jkb0;
import p006l.k0c0;
import p006l.m7c0;
import p006l.qib0;
import p006l.rol;
import p006l.s4c0;
import p006l.shd;
import p006l.tqx;
import p006l.u7c0;
import p006l.v0c0;
import p006l.vhd;
import p006l.w2c0;
import p006l.ydb0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@SuppressLint({"Registered"})
public class PutongAct extends Act implements n3m {
    private static final String KEY_SAVE_WINDOW_DENSITY = "window_density";
    public static final int REQUEST_CODE_PICKER = 786;
    public static final int REQUEST_CODE_PICKER_WITH_SWIPE = 6666;
    private static final String TAG = "PutongAct";
    public static final String TANKER_PLUGIN_VERSION = ".tanker_plugin_version";
    protected static tqx defaultMediaPickerHandlerFactory = new C0125a.a();
    private static boolean hasReport;
    public static volatile long lastDispatchTouchEventMillis;
    static long previousCheck;
    private nx0 appTheme;
    private shd floatButtonManager;
    private vhd floatButtonManagerForXHS;
    protected boolean mIfInNewUi1ShouldUseThemNewUI2;
    protected C0125a mediaPickerHandler;
    public View statusHeaderView;
    protected edq0 xmlMonitorLayoutInflater;
    protected cwf0 pageHelper = null;
    private Theme currentTheme = Theme.normal;
    private l8m iapManager = new l8m(this);
    boolean badTokenExpireControl = RemoteConfig.x().s("bad_token_exprie_control");
    private Boolean isAnonymousMode = null;

    public enum Theme {
        normal,
        ui1,
        ui2
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.app.PutongAct$a */
    public class C0122a implements bd50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f1159a;

        public C0122a(View view) {
            this.f1159a = view;
        }

        @NonNull
        public y6q0 onApplyWindowInsets(@NonNull View view, @NonNull y6q0 y6q0Var) {
            int systemUiVisibility = PutongAct.this.getWindow().getDecorView().getSystemUiVisibility() & 1024;
            View view2 = this.f1159a;
            if (systemUiVisibility == 1024) {
                view2.setTag(s4c0.f21063g, null);
                Integer num = (Integer) this.f1159a.getTag(s4c0.f21061f);
                if (num != null) {
                    View view3 = this.f1159a;
                    view3.setPadding(view3.getPaddingLeft(), num.intValue(), this.f1159a.getPaddingRight(), this.f1159a.getPaddingBottom());
                }
            } else if (view2.getTag(s4c0.f21063g) == null) {
                PutongAct.paddingToStatusBar(this.f1159a, y6q0Var);
            }
            PutongAct.this.setPaddingToNavigationBar(y6q0Var.f(y6q0.l.d()).d);
            return y6q0Var;
        }
    }

    static {
        Act.debugShowMenu = false;
        boolean z = App.b;
        previousCheck = SystemClock.elapsedRealtime();
        Act.foreground().subscribe(mkd0.G(new e30() { // from class: l.zib0
            public final void call(Object obj) {
                PutongAct.m1518C1((Act.r) obj);
            }
        }));
        Act.foreground().distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.ajb0
            public final void call(Object obj) {
                PutongAct.m1531S1((Act.r) obj);
            }
        }));
        lqf.a().b(ExtraActLifecycle.onResumeFromAppStartOrBackground, new e30() { // from class: l.bjb0
            public final void call(Object obj) {
                e51.H((Act) obj, new Runnable() { // from class: l.sib0
                    @Override // java.lang.Runnable
                    public final void run() {
                        PutongAct.m1528O1();
                    }
                }, 200L);
            }
        });
        lqf.a().b(ExtraActLifecycle.onResumeFromAppStart, new e30() { // from class: l.cjb0
            public final void call(Object obj) {
                qib0.m22163h0();
            }
        });
        lastDispatchTouchEventMillis = 0L;
    }

    /* JADX INFO: renamed from: C1 */
    public static /* synthetic */ void m1518C1(Act.r rVar) {
        lastDispatchTouchEventMillis = SystemClock.elapsedRealtime();
        if (NullChecker.a(rVar) && SystemClock.elapsedRealtime() - previousCheck > 240000 && qib0.f19805c0.signedIn_()) {
            previousCheck = SystemClock.elapsedRealtime();
            TantanApp.f1169c.m28213e0();
        }
    }

    public static boolean FlymeSetStatusBarLightMode(Window window, boolean z) {
        if (!NullChecker.a(window)) {
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
        if (NullChecker.a(window)) {
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
    public static /* synthetic */ void m1528O1() {
        if (qib0.f19805c0.signedIn_() && e51.A(App.e)) {
            qib0.f19790N.tryMarkAsDAU();
        }
    }

    /* JADX INFO: renamed from: S1 */
    public static /* synthetic */ void m1531S1(Act.r rVar) {
        if (rVar == null) {
            AppOpenWayStats.m1580b();
        } else if (NullChecker.a((Activity) rVar.a.get())) {
            AppOpenWayStats.m1584f();
        } else {
            AppOpenWayStats.m1580b();
        }
    }

    /* JADX INFO: renamed from: T1 */
    public static /* synthetic */ void m1532T1(SearchView searchView, SearchableInfo searchableInfo) {
        if (searchView != null) {
            searchView.setSearchableInfo(searchableInfo);
        }
    }

    private void checkAndAddLinkView(Intent intent) {
        shd shdVar = new shd(((Act) this).act, intent);
        this.floatButtonManager = shdVar;
        shdVar.m23760i();
    }

    private void checkAnonymousMode() {
        HashMap mapGlobalLifeCycle_ = Act.globalLifeCycle_();
        if (NullChecker.a(mapGlobalLifeCycle_) && mapGlobalLifeCycle_.containsKey(Integer.valueOf(act().getTaskId()))) {
            ArrayList arrayList = (ArrayList) mapGlobalLifeCycle_.get(Integer.valueOf(act().getTaskId()));
            Object obj = arrayList.size() > 0 ? (Activity) ((Act.r) arrayList.get(arrayList.size() - 1)).a.get() : null;
            if (obj instanceof PutongAct) {
                this.isAnonymousMode = Boolean.valueOf(((PutongAct) obj).isAnonymousMode());
            }
        }
        act().getClass();
        NullChecker.a(this.isAnonymousMode);
    }

    private void checkPatchResNotFound() {
    }

    private void checkPushTrack(Intent intent) {
        try {
            if (NullChecker.b(intent) && intent.getBooleanExtra("bundle_from_notification", false)) {
                PushTrackData pushTrackData = (PushTrackData) intent.getSerializableExtra("bundle_push_track_info");
                if (NullChecker.a(pushTrackData)) {
                    pushTrackData.alreadyClick();
                    ydb0.m28169f0(pushTrackData);
                    AppOpenWayStats.m1583e(pushTrackData);
                }
            }
        } catch (Throwable th) {
            CrashHelper.c(th);
        }
    }

    private void checkXHSAndAddLinkView(Intent intent) {
        vhd vhdVar = this.floatButtonManagerForXHS;
        if (vhdVar == null || !vhdVar.m25816g()) {
            vhd vhdVar2 = new vhd(((Act) this).act, intent);
            this.floatButtonManagerForXHS = vhdVar2;
            vhdVar2.m25819j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$customSearchView$10(final SearchView searchView) {
        final SearchableInfo searchableInfo = ((SearchManager) act().getSystemService("search")).getSearchableInfo(act().getComponentName());
        e51.F(act(), new Runnable() { // from class: l.yib0
            @Override // java.lang.Runnable
            public final void run() {
                PutongAct.m1532T1(searchView, searchableInfo);
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
            this.iapManager.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$initSubscription$2(Bundle bundle) {
        checkPushTrack(getIntent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$4(c cVar) {
        this.iapManager.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$5(c cVar) {
        if (NullChecker.b(this.pageHelper)) {
            if (cVar == c.f) {
                this.pageHelper.c();
                return;
            }
            if (cVar == c.i) {
                this.pageHelper.r();
            } else if (cVar == c.j) {
                this.pageHelper.g();
            } else if (cVar == c.m) {
                this.pageHelper.e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$6(Bundle bundle) {
        checkAnonymousMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$8(c cVar) {
        hideDeepLinkFloatButton(false);
    }

    public static void paddingToStatusBar(View view, y6q0 y6q0Var) {
        if (y6q0Var != null) {
            view.setPadding(view.getPaddingLeft(), y6q0Var.f(y6q0.l.e()).b, view.getPaddingRight(), view.getPaddingBottom());
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
            xdl0.R(viewFindViewById);
        }
    }

    public String actionItemPadding(String str) {
        return "  " + str.trim() + "  ";
    }

    public void attachBaseContext(Context context) {
        if (IntlCountryCodeController.m21v()) {
            context = ygj0.c(context);
        }
        super/*androidx.appcompat.app.AppCompatActivity*/.attachBaseContext(context);
    }

    public void checkGradientColors() {
        if (getAppTheme().m()) {
            getAppTheme().a();
            return;
        }
        if (shouldShowGradientActionBar() && NullChecker.a(toolbar())) {
            toolbar().setBackgroundResource(w2c0.f24871w0);
        }
        if (shouldShowGradientStatusBar()) {
            setGradientStatusBar();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean checkRunningCondition() {
        if (!ensureCoreAndAccount()) {
            lsi0.h(R$string.f1294B);
            startActivity(SplashProxyAct.l(App.e));
            return true;
        }
        if (ensurePermission() && ensurePlugin()) {
            return false;
        }
        startActivity(mgh0.t(getIntent()));
        return true;
    }

    public void checkSavedInstanceStateAndCache(Bundle bundle) {
        super.checkSavedInstanceStateAndCache(bundle);
    }

    public void checkStatusBarHeight() {
        if (Build.VERSION.SDK_INT <= 34) {
            return;
        }
        View viewFindViewById = findViewById(R.id.content);
        viewFindViewById.setTag(s4c0.f21061f, Integer.valueOf(viewFindViewById.getPaddingTop()));
        gbl0.y0(viewFindViewById, new C0122a(viewFindViewById));
        gbl0.g0(viewFindViewById);
    }

    public void cropImage(String str) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo1563a(str);
    }

    public xaj0<SearchView, View, View> customSearchView(final SearchView searchView) {
        AutoCompleteTextView autoCompleteTextView;
        View view;
        e51.y(new Runnable() { // from class: l.xib0
            @Override // java.lang.Runnable
            public final void run() {
                this.f27527a.lambda$customSearchView$10(searchView);
            }
        });
        try {
            autoCompleteTextView = (AutoCompleteTextView) searchView.findViewById(s5c0.J);
            Field declaredField = SearchView.class.getDeclaredField("mCloseButton");
            declaredField.setAccessible(true);
            view = (View) declaredField.get(searchView);
        } catch (IllegalAccessException e) {
            CrashHelper.c(e);
            autoCompleteTextView = null;
            view = null;
        } catch (NoSuchFieldException e2) {
            CrashHelper.c(e2);
            autoCompleteTextView = null;
            view = null;
        }
        getAppTheme().l(searchView);
        return xaj0.a(searchView, view, autoCompleteTextView);
    }

    public ArrayList<j760<String, d30>> debugItems() {
        return super.debugItems();
    }

    public boolean disableAutoPV() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        lastDispatchTouchEventMillis = SystemClock.elapsedRealtime();
        return super/*android.app.Activity*/.dispatchTouchEvent(motionEvent);
    }

    public boolean ensureCoreAndAccount() {
        if (TantanApp.f1168b == null || !qib0.f19805c0.signedIn_()) {
            return !(this instanceof rol);
        }
        return true;
    }

    public void ensureMediaPickerHandler() {
        if (this.mediaPickerHandler == null) {
            this.mediaPickerHandler = defaultMediaPickerHandlerFactory.mo1097a(this);
        }
    }

    public boolean ensurePermission() {
        return true;
    }

    public boolean ensurePlugin() {
        if (TantanApp.f1168b == null || !qib0.f19805c0.signedIn_()) {
            return !(this instanceof rol);
        }
        return qib0.m22123J0() || !(this instanceof rol);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getActionBarHeight() {
        if (getSupportActionBar() == null) {
            return 0;
        }
        int iK = getSupportActionBar().k();
        if (iK == 0) {
            TypedValue typedValue = new TypedValue();
            if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
                return TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
            }
        }
        return iK;
    }

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
        return u7c0.f23421i;
    }

    public Resources getResources() {
        return super/*androidx.appcompat.app.AppCompatActivity*/.getResources();
    }

    public edq0 getXmlMonitorLayoutInflater() {
        return this.xmlMonitorLayoutInflater;
    }

    public void hideDeepLinkFloatButton(boolean z) {
        if (NullChecker.a(this.floatButtonManager)) {
            if (!z || this.floatButtonManager.m23756e()) {
                this.floatButtonManager.m23755d();
            }
        }
    }

    public l8m iap() {
        return this.iapManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public LayoutInflater inflater() {
        if (!needXmlMonitor() || !ddq0.a().b()) {
            return super.inflater();
        }
        if (this.xmlMonitorLayoutInflater == null) {
            this.xmlMonitorLayoutInflater = new edq0(this);
        }
        this.xmlMonitorLayoutInflater.m14486a(pageId());
        return this.xmlMonitorLayoutInflater;
    }

    public void initDataOnCreate() {
        au2.m12241z();
        super.initDataOnCreate();
        if (this instanceof rol) {
            ABManager.m1222D();
        }
        initPageHelper();
    }

    public void initPageHelper() {
        this.pageHelper = new cwf0(this);
    }

    public xaj0<SearchView, View, View> initSearchMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(m7c0.f16838a, menu);
        return customSearchView((SearchView) menu.findItem(s4c0.f21046V).getActionView());
    }

    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.djb0
            public final void call(Object obj) {
                this.f10427a.lambda$initSubscription$0((Bundle) obj);
            }
        });
        creates(new e30() { // from class: l.ejb0
            public final void call(Object obj) {
                this.f11183a.lambda$initSubscription$1((Bundle) obj);
            }
        });
        creates(new e30() { // from class: l.fjb0
            public final void call(Object obj) {
                this.f12739a.lambda$initSubscription$2((Bundle) obj);
            }
        });
        lifecycle().filter(new w9j() { // from class: l.gjb0
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.m);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.hjb0
            public final void call(Object obj) {
                this.f13911a.lambda$initSubscription$4((c) obj);
            }
        }));
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.tib0
            public final void call(Object obj) {
                this.f22131a.lambda$initSubscription$5((c) obj);
            }
        }));
        creates(new e30() { // from class: l.uib0
            public final void call(Object obj) {
                this.f23556a.lambda$initSubscription$6((Bundle) obj);
            }
        });
        lifecycle().filter(new w9j() { // from class: l.vib0
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.j);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.wib0
            public final void call(Object obj) {
                this.f25169a.lambda$initSubscription$8((c) obj);
            }
        }));
    }

    public boolean isAnonymousMode() {
        if (NullChecker.a(this.isAnonymousMode)) {
            return this.isAnonymousMode.booleanValue();
        }
        return true;
    }

    public void monitorInflateViewCost(long j) {
        if (needXmlMonitor() && ddq0.a().b()) {
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            if (jCurrentTimeMillis > ddq0.a().c()) {
                zvf0.B("e_inflate_view", pageId(), new j760[]{vwb.Y("page_name", pageId()), vwb.Y("time_consume", Long.valueOf(jCurrentTimeMillis))});
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
        return qib0.f19805c0.signedIn_();
    }

    public boolean needXmlMonitor() {
        return this instanceof cdq0;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 786) {
            if (i2 == -1) {
                ArrayList arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.h);
                if (intent.hasExtra("extra_from_type")) {
                    onPickImagesResult(arrayList, intent.getIntExtra("extra_from_type", 0));
                } else {
                    onPickImagesResult(arrayList);
                }
            }
        } else if (i == 1011) {
            jkb0.m17508q(intent);
        } else if (i == 1242) {
            SurveySparrowHelper.INSTANCE.m1603o(i2, intent);
        } else {
            super.onActivityResult(i, i2, intent);
        }
        this.iapManager.o(i, i2, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (IntlCountryCodeController.m21v()) {
            configuration = ygj0.b(configuration);
        }
        super.onConfigurationChanged(configuration);
    }

    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        checkPushTrack(intent);
        checkXHSAndAddLinkView(intent);
    }

    public void onPauseLifecycle() {
        super.onPauseLifecycle();
    }

    public void onPickImagesResult(List<Media> list) {
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onReadIntentError() {
        try {
            startActivity(SplashProxyAct.l(App.e));
        } catch (Exception e) {
            CrashHelper.c(e);
            finish();
        }
    }

    public void onRestoreGlobalState(Bundle bundle) {
        super.onRestoreGlobalState(bundle);
        if (bundle.containsKey(KEY_SAVE_WINDOW_DENSITY)) {
            float f = bundle.getFloat(KEY_SAVE_WINDOW_DENSITY);
            float f2 = getResources().getDisplayMetrics().density;
            if (f > 0.0f && f != f2) {
                xdl0.G0(true);
            }
        }
        ABManager.m1226J(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"LogUseError"})
    public void onResumeLifecycle() {
        if (this.badTokenExpireControl) {
            int taskId = getTaskId();
            Log.e(TAG, "PutongAct onResumeLifecycle taskId:" + taskId);
            if (taskId <= 0) {
                CrashHelper.c(new IllegalStateException("ActBadTokenException occurs!!! Act:" + this + " taskId:" + taskId));
                finish();
                return;
            }
        }
        super.onResumeLifecycle();
    }

    public void onSaveGlobalState(Bundle bundle) {
        super.onSaveGlobalState(bundle);
        bundle.putFloat(KEY_SAVE_WINDOW_DENSITY, getResources().getDisplayMetrics().density);
        ABManager.m1227K(bundle);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    public void onStopLifecycle() {
        super.onStopLifecycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void overridePendingTransition(int i, int i2) {
        super/*android.app.Activity*/.overridePendingTransition(i, i2);
    }

    public String pageId() {
        return getClass().getName();
    }

    public void pickImagesWithInstaPicker(int i) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo1564b(i);
    }

    public void pickImagesWithInstaPickerWithExtraAction(int i, e30<Intent> e30Var) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo1565c(i, e30Var);
    }

    public void pickImagesWithPicker(int i, boolean z, boolean z2, boolean z3) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo1566d(i, z, z2, z3);
    }

    public void pickImagesWithPickerInFloatLayerExp(int i, boolean z, boolean z2, boolean z3, Gender gender) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo1570h(i, z, z2, z3, gender);
    }

    public void pickMediasWithInstaPicker() {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo1572j();
    }

    public void pickVideoWithPicker(boolean z) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo1575m(z);
    }

    public void preCreateView(Bundle bundle) {
        checkGradientColors();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setContentView(View view) {
        if (shouldWrapContentViewWithTransparentHeader() && shouldSwitchToTransparentStatus()) {
            view = wrapContentViewWithTransparentHeader(view);
        }
        checkAndAddLinkView(getIntent());
        checkXHSAndAddLinkView(getIntent());
        super/*androidx.appcompat.app.AppCompatActivity*/.setContentView(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCustomAppTheme() {
        if (NullChecker.a(toolbar())) {
            getAppTheme().i(toolbar());
        }
        if (NullChecker.a(getSupportActionBar())) {
            getAppTheme().h(getSupportActionBar());
        }
        getAppTheme().k(getWindow());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setNewUI2Theme() {
        this.currentTheme = Theme.ui2;
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(k0c0.f15527a, typedValue, true);
        TypedValue typedValue2 = new TypedValue();
        getTheme().resolveAttribute(k0c0.f15528b, typedValue2, true);
        if (typedValue.data == 0 || typedValue2.data != 0) {
            return;
        }
        setTheme(getDefaultThemeResId());
        if (NullChecker.a(getSupportActionBar())) {
            getSupportActionBar().A(0.0f);
            kce kceVar = new kce(this);
            kceVar.c(getResources().getColor(v0c0.f23863k));
            kceVar.e(1.0f);
            getSupportActionBar().C(kceVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setStatusBarColorResId(int i) {
        setLightStatusBar(16);
        setStatusBarColor(getResources().getColor(i));
        FlymeSetStatusBarLightMode(getWindow(), true);
        MIUISetStatusBarLightMode(getWindow(), true);
    }

    public void setTheme() {
        if (getAppTheme().m()) {
            setCustomAppTheme();
            return;
        }
        if (shouldSwitchToGradientColoredStatusBar()) {
            setUI1Theme();
        }
        if (NullChecker.a(getSupportActionBar()) && "Lenovo".equals(Build.BRAND) && "Lenovo K10e70".equals(Build.MODEL)) {
            getSupportActionBar().B(w2c0.f24826a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTransparentStatusBar() {
        if (Build.VERSION.SDK_INT >= 26) {
            getWindow().getDecorView().setSystemUiVisibility(1040);
        } else {
            getWindow().getDecorView().setSystemUiVisibility(1024);
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(67108864);
        getWindow().setStatusBarColor(0);
        setStatusBarColor(0);
        if (NullChecker.a(getSupportActionBar())) {
            getSupportActionBar().A(0.0f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setUI1Theme() {
        this.currentTheme = Theme.ui1;
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(k0c0.f15527a, typedValue, true);
        TypedValue typedValue2 = new TypedValue();
        getTheme().resolveAttribute(k0c0.f15528b, typedValue2, true);
        if (typedValue.data == 0 || typedValue2.data != 0) {
            return;
        }
        setTheme(u7c0.f23420h);
        if (NullChecker.a(getSupportActionBar())) {
            getSupportActionBar().A(0.0f);
        }
    }

    public void setXmlMonitorLayoutInflater(edq0 edq0Var) {
        this.xmlMonitorLayoutInflater = edq0Var;
    }

    public boolean shouldBlockOnCreate(Bundle bundle) {
        return checkRunningCondition();
    }

    public boolean shouldBlockOnResume() {
        return checkRunningCondition();
    }

    public boolean shouldBlockOnStart() {
        return checkRunningCondition();
    }

    public boolean shouldRemarginContent() {
        return false;
    }

    public boolean shouldShowGradientActionBar() {
        return getAppTheme().o();
    }

    public boolean shouldShowGradientStatusBar() {
        return getAppTheme().p();
    }

    public boolean shouldSwitchToGradientColoredStatusBar() {
        return getAppTheme().q();
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

    /* JADX WARN: Multi-variable type inference failed */
    public View wrapContentViewWithTransparentHeader(View view) {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.addView(view);
        FrameLayout frameLayout2 = new FrameLayout(this);
        if (getAppTheme().m()) {
            frameLayout2.setBackground(getAppTheme().g());
        } else {
            frameLayout2.setBackgroundResource(w2c0.f24873x0);
        }
        xdl0.r0(new View[]{frameLayout2});
        xdl0.q0(getActionBarHeight(), new View[]{frameLayout2});
        xdl0.D0(-1, new View[]{frameLayout2});
        if (shouldRemarginContent()) {
            xdl0.Z(new View[]{view});
            xdl0.Y(getActionBarHeight(), new View[]{view});
        }
        this.statusHeaderView = frameLayout2;
        frameLayout.addView(frameLayout2);
        return frameLayout;
    }

    public void onPickImagesResult(List<Media> list, int i) {
    }

    public void pickImagesWithPicker(int i, boolean z, boolean z2, boolean z3, String str) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo1568f(i, z, z2, z3, str);
    }

    public void pickImagesWithPickerInFloatLayerExp(int i, boolean z, boolean z2, boolean z3, Gender gender, String str) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo1571i(i, z, z2, z3, gender, str);
    }

    public void pickMediasWithInstaPicker(MusicContent musicContent) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo1573k(musicContent);
    }

    public void pickImagesWithPicker(int i, boolean z, boolean z2, boolean z3, String str, int i2) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo1569g(i, z, z2, z3, str, i2);
    }

    public void pickMediasWithInstaPicker(String str, MusicContent musicContent) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo1574l(str, musicContent);
    }

    public void pickImagesWithPicker(int i, boolean z, boolean z2, boolean z3, int i2) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo1567e(i, z, z2, z3, i2);
    }

    public static void setLightStatusBar(Window window, int i) {
        setLightStatusBar(window, true, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setLightStatusBar(int i) {
        setLightStatusBar(getWindow(), i);
    }
}
