package com.p051p1.mobile.putong.app;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.ExtraActLifecycle;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.api.push.PushTrackData;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.statistics.AppOpenWayStats;
import com.p051p1.mobile.putong.app.surveysparrow.SurveySparrowHelper;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.p051p1.mobile.putong.p070ui.splash.SplashProxyAct;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
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
import p153l.b9c0;
import p153l.bbm;
import p153l.bjd;
import p153l.bkj0;
import p153l.bnl0;
import p153l.bqj0;
import p153l.cbc0;
import p153l.cmb0;
import p153l.crl;
import p153l.dgq0;
import p153l.e6m;
import p153l.hfq0;
import p153l.hmq0;
import p153l.i4g0;
import p153l.il50;
import p153l.imq0;
import p153l.jmq0;
import p153l.jyb;
import p153l.kkl0;
import p153l.l4g0;
import p153l.l51;
import p153l.nsb0;
import p153l.o1j0;
import p153l.ode;
import p153l.p8c0;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.qfc0;
import p153l.qu2;
import p153l.qzx;
import p153l.srf;
import p153l.toh0;
import p153l.uqb0;
import p153l.ux0;
import p153l.x20;
import p153l.xdc0;
import p153l.y20;
import p153l.ycc0;
import p153l.yid;
import p153l.zfc0;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"Registered"})
public class PutongAct extends Act implements e6m {
    private static final String KEY_SAVE_WINDOW_DENSITY = "window_density";
    public static final int REQUEST_CODE_PICKER = 786;
    public static final int REQUEST_CODE_PICKER_WITH_SWIPE = 6666;
    private static final String TAG = "PutongAct";
    public static final String TANKER_PLUGIN_VERSION = ".tanker_plugin_version";
    protected static qzx defaultMediaPickerHandlerFactory = new C4850a.a();
    private static boolean hasReport;
    public static volatile long lastDispatchTouchEventMillis;
    static long previousCheck;
    private ux0 appTheme;
    private yid floatButtonManager;
    private bjd floatButtonManagerForXHS;
    protected boolean mIfInNewUi1ShouldUseThemNewUI2;
    protected C4850a mediaPickerHandler;
    public View statusHeaderView;
    protected jmq0 xmlMonitorLayoutInflater;
    protected l4g0 pageHelper = null;
    private Theme currentTheme = Theme.normal;
    private bbm iapManager = new bbm(this);
    boolean badTokenExpireControl = RemoteConfig.m80481x().m80513s("bad_token_exprie_control");
    private Boolean isAnonymousMode = null;

    public enum Theme {
        normal,
        ui1,
        ui2
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.app.PutongAct$a */
    public class C4847a implements il50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f17889a;

        public C4847a(View view) {
            this.f17889a = view;
        }

        @Override // p153l.il50
        @NonNull
        public dgq0 onApplyWindowInsets(@NonNull View view, @NonNull dgq0 dgq0Var) {
            int systemUiVisibility = PutongAct.this.getWindow().getDecorView().getSystemUiVisibility() & 1024;
            View view2 = this.f17889a;
            if (systemUiVisibility == 1024) {
                view2.setTag(ycc0.f198456g, null);
                Integer num = (Integer) this.f17889a.getTag(ycc0.f198454f);
                if (num != null) {
                    View view3 = this.f17889a;
                    view3.setPadding(view3.getPaddingLeft(), num.intValue(), this.f17889a.getPaddingRight(), this.f17889a.getPaddingBottom());
                }
            } else if (view2.getTag(ycc0.f198456g) == null) {
                PutongAct.paddingToStatusBar(this.f17889a, dgq0Var);
            }
            PutongAct.this.setPaddingToNavigationBar(dgq0Var.m115680f(dgq0.C16531l.m115735d()).f170860d);
            return dgq0Var;
        }
    }

    static {
        Act.debugShowMenu = false;
        boolean z = App.f16085b;
        previousCheck = SystemClock.elapsedRealtime();
        Act.foreground().subscribe(psd0.m173596G(new y20() { // from class: l.drb0
            @Override // p153l.y20
            public final void call(Object obj) {
                PutongAct.m30610E1((Act.C4450r) obj);
            }
        }));
        Act.foreground().distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.erb0
            @Override // p153l.y20
            public final void call(Object obj) {
                PutongAct.m30623T1((Act.C4450r) obj);
            }
        }));
        srf.m187598a().m187599b(ExtraActLifecycle.onResumeFromAppStartOrBackground, new y20() { // from class: l.frb0
            @Override // p153l.y20
            public final void call(Object obj) {
                l51.m152888H((Act) obj, new Runnable() { // from class: l.wqb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        PutongAct.m30620P1();
                    }
                }, 200L);
            }
        });
        srf.m187598a().m187599b(ExtraActLifecycle.onResumeFromAppStart, new y20() { // from class: l.grb0
            @Override // p153l.y20
            public final void call(Object obj) {
                uqb0.m197273h0();
            }
        });
        lastDispatchTouchEventMillis = 0L;
    }

    /* JADX INFO: renamed from: E1 */
    public static /* synthetic */ void m30610E1(Act.C4450r c4450r) {
        lastDispatchTouchEventMillis = SystemClock.elapsedRealtime();
        if (NullChecker.m82486a(c4450r) && SystemClock.elapsedRealtime() - previousCheck > 240000 && uqb0.f180397c0.signedIn_()) {
            previousCheck = SystemClock.elapsedRealtime();
            TantanApp.f17899c.m111144e0();
        }
    }

    public static boolean FlymeSetStatusBarLightMode(Window window, boolean z) {
        if (!NullChecker.m82486a(window)) {
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
        if (NullChecker.m82486a(window)) {
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

    /* JADX INFO: renamed from: P1 */
    public static /* synthetic */ void m30620P1() {
        if (uqb0.f180397c0.signedIn_() && l51.m152881A(App.f16088e)) {
            uqb0.f180382N.tryMarkAsDAU();
        }
    }

    /* JADX INFO: renamed from: T1 */
    public static /* synthetic */ void m30623T1(Act.C4450r c4450r) {
        if (c4450r == null) {
            AppOpenWayStats.m30668b();
        } else if (NullChecker.m82486a(c4450r.f16062a.get())) {
            AppOpenWayStats.m30672f();
        } else {
            AppOpenWayStats.m30668b();
        }
    }

    /* JADX INFO: renamed from: U1 */
    public static /* synthetic */ void m30624U1(SearchView searchView, SearchableInfo searchableInfo) {
        if (searchView != null) {
            searchView.setSearchableInfo(searchableInfo);
        }
    }

    private void checkAndAddLinkView(Intent intent) {
        yid yidVar = new yid(this.act, intent);
        this.floatButtonManager = yidVar;
        yidVar.m216067i();
    }

    private void checkAnonymousMode() {
        HashMap<Integer, ArrayList<Act.C4450r>> mapGlobalLifeCycle_ = Act.globalLifeCycle_();
        if (NullChecker.m82486a(mapGlobalLifeCycle_) && mapGlobalLifeCycle_.containsKey(Integer.valueOf(act().getTaskId()))) {
            ArrayList<Act.C4450r> arrayList = mapGlobalLifeCycle_.get(Integer.valueOf(act().getTaskId()));
            Activity activity = arrayList.size() > 0 ? arrayList.get(arrayList.size() - 1).f16062a.get() : null;
            if (activity instanceof PutongAct) {
                this.isAnonymousMode = Boolean.valueOf(((PutongAct) activity).isAnonymousMode());
            }
        }
        act().getClass();
        NullChecker.m82486a(this.isAnonymousMode);
    }

    private void checkPatchResNotFound() {
    }

    private void checkPushTrack(Intent intent) {
        try {
            if (NullChecker.m82487b(intent) && intent.getBooleanExtra("bundle_from_notification", false)) {
                PushTrackData pushTrackData = (PushTrackData) intent.getSerializableExtra("bundle_push_track_info");
                if (NullChecker.m82486a(pushTrackData)) {
                    pushTrackData.alreadyClick();
                    cmb0.m111100f0(pushTrackData);
                    AppOpenWayStats.m30671e(pushTrackData);
                }
            }
        } catch (Throwable th) {
            CrashHelper.m82479c(th);
        }
    }

    private void checkXHSAndAddLinkView(Intent intent) {
        bjd bjdVar = this.floatButtonManagerForXHS;
        if (bjdVar == null || !bjdVar.m104605g()) {
            bjd bjdVar2 = new bjd(this.act, intent);
            this.floatButtonManagerForXHS = bjdVar2;
            bjdVar2.m104608j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$customSearchView$10(final SearchView searchView) {
        final SearchableInfo searchableInfo = ((SearchManager) act().getSystemService(FirebaseAnalytics.Event.SEARCH)).getSearchableInfo(act().getComponentName());
        l51.m152886F(act(), new Runnable() { // from class: l.crb0
            @Override // java.lang.Runnable
            public final void run() {
                PutongAct.m30624U1(searchView, searchableInfo);
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
            this.iapManager.m103298l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$2(Bundle bundle) {
        checkPushTrack(getIntent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$4(C4470c c4470c) {
        this.iapManager.m103302p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$5(C4470c c4470c) {
        if (NullChecker.m82487b(this.pageHelper)) {
            if (c4470c == C4470c.f16264f) {
                this.pageHelper.m152768c();
                return;
            }
            if (c4470c == C4470c.f16267i) {
                this.pageHelper.m152783r();
            } else if (c4470c == C4470c.f16268j) {
                this.pageHelper.m152772g();
            } else if (c4470c == C4470c.f16271m) {
                this.pageHelper.m152770e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$6(Bundle bundle) {
        checkAnonymousMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$8(C4470c c4470c) {
        hideDeepLinkFloatButton(false);
    }

    public static void paddingToStatusBar(View view, dgq0 dgq0Var) {
        if (dgq0Var != null) {
            view.setPadding(view.getPaddingLeft(), dgq0Var.m115680f(dgq0.C16531l.m115736e()).f170858b, view.getPaddingRight(), view.getPaddingBottom());
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

    public static void setMediaPickerHandlerFactory(qzx qzxVar) {
        defaultMediaPickerHandlerFactory = qzxVar;
    }

    private void tryToInitStatusBarHeight() {
        View viewFindViewById = findViewById(R.id.content);
        if (viewFindViewById != null) {
            bnl0.m105534R(viewFindViewById);
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public String actionItemPadding(String str) {
        return "  " + str.trim() + "  ";
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (IntlCountryCodeController.m29125v()) {
            context = bqj0.m105946c(context);
        }
        super.attachBaseContext(context);
    }

    public void checkGradientColors() {
        if (getAppTheme().mo134833m()) {
            getAppTheme().mo134821a();
            return;
        }
        if (shouldShowGradientActionBar() && NullChecker.m82486a(toolbar())) {
            toolbar().setBackgroundResource(cbc0.f80803w0);
        }
        if (shouldShowGradientStatusBar()) {
            setGradientStatusBar();
        }
    }

    public boolean checkRunningCondition() {
        if (!ensureCoreAndAccount()) {
            o1j0.m165634h(R$string.f18024B);
            startActivity(SplashProxyAct.m81288l(App.f16088e));
            return true;
        }
        if (ensurePermission() && ensurePlugin()) {
            return false;
        }
        startActivity(toh0.m192060t(getIntent()));
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void checkSavedInstanceStateAndCache(Bundle bundle) {
        super.checkSavedInstanceStateAndCache(bundle);
    }

    public void checkStatusBarHeight() {
        if (Build.VERSION.SDK_INT <= 34) {
            return;
        }
        View viewFindViewById = findViewById(R.id.content);
        viewFindViewById.setTag(ycc0.f198454f, Integer.valueOf(viewFindViewById.getPaddingTop()));
        kkl0.m150194y0(viewFindViewById, new C4847a(viewFindViewById));
        kkl0.m150158g0(viewFindViewById);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void cropImage(String str) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo30651a(str);
    }

    public bkj0<SearchView, View, View> customSearchView(final SearchView searchView) {
        AutoCompleteTextView autoCompleteTextView;
        View view;
        l51.m152919y(new Runnable() { // from class: l.brb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f78004a.lambda$customSearchView$10(searchView);
            }
        });
        try {
            autoCompleteTextView = (AutoCompleteTextView) searchView.findViewById(xdc0.f193543J);
            Field declaredField = SearchView.class.getDeclaredField("mCloseButton");
            declaredField.setAccessible(true);
            view = (View) declaredField.get(searchView);
        } catch (IllegalAccessException e) {
            CrashHelper.m82479c(e);
            autoCompleteTextView = null;
            view = null;
        } catch (NoSuchFieldException e2) {
            CrashHelper.m82479c(e2);
            autoCompleteTextView = null;
            view = null;
        }
        getAppTheme().mo134832l(searchView);
        return bkj0.m104818a(searchView, view, autoCompleteTextView);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public ArrayList<pf60<String, x20>> debugItems() {
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
        if (TantanApp.f17898b == null || !uqb0.f180397c0.signedIn_()) {
            return !(this instanceof crl);
        }
        return true;
    }

    public void ensureMediaPickerHandler() {
        if (this.mediaPickerHandler == null) {
            this.mediaPickerHandler = defaultMediaPickerHandlerFactory.mo30189a(this);
        }
    }

    public boolean ensurePermission() {
        return true;
    }

    public boolean ensurePlugin() {
        if (TantanApp.f17898b == null || !uqb0.f180397c0.signedIn_()) {
            return !(this instanceof crl);
        }
        return uqb0.m197233J0() || !(this instanceof crl);
    }

    public int getActionBarHeight() {
        if (getSupportActionBar() == null) {
            return 0;
        }
        int iMo102184k = getSupportActionBar().mo102184k();
        if (iMo102184k == 0) {
            TypedValue typedValue = new TypedValue();
            if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
                return TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
            }
        }
        return iMo102184k;
    }

    @Override // com.p051p1.mobile.android.app.Act
    @NonNull
    public ux0 getAppTheme() {
        if (this.appTheme == null) {
            this.appTheme = new hfq0(this);
        }
        return this.appTheme;
    }

    public Theme getCurrentTheme() {
        return this.currentTheme;
    }

    public int getDefaultThemeResId() {
        return zfc0.f204123i;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return super.getResources();
    }

    public jmq0 getXmlMonitorLayoutInflater() {
        return this.xmlMonitorLayoutInflater;
    }

    public void hideDeepLinkFloatButton(boolean z) {
        if (NullChecker.m82486a(this.floatButtonManager)) {
            if (!z || this.floatButtonManager.m216063e()) {
                this.floatButtonManager.m216062d();
            }
        }
    }

    public bbm iap() {
        return this.iapManager;
    }

    @Override // com.p051p1.mobile.android.app.Act
    @NonNull
    public LayoutInflater inflater() {
        if (!needXmlMonitor() || !imq0.m140986a().m140987b()) {
            return super.inflater();
        }
        if (this.xmlMonitorLayoutInflater == null) {
            this.xmlMonitorLayoutInflater = new jmq0(this);
        }
        this.xmlMonitorLayoutInflater.m146167a(pageId());
        return this.xmlMonitorLayoutInflater;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        qu2.m178131z();
        super.initDataOnCreate();
        if (this instanceof crl) {
            ABManager.m30314D();
        }
        initPageHelper();
    }

    public void initPageHelper() {
        this.pageHelper = new l4g0(this);
    }

    public bkj0<SearchView, View, View> initSearchMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(qfc0.f157295a, menu);
        return customSearchView((SearchView) menu.findItem(ycc0.f198439V).getActionView());
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.hrb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111299a.lambda$initSubscription$0((Bundle) obj);
            }
        });
        creates(new y20() { // from class: l.irb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116519a.lambda$initSubscription$1((Bundle) obj);
            }
        });
        creates(new y20() { // from class: l.jrb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122322a.lambda$initSubscription$2((Bundle) obj);
            }
        });
        lifecycle().filter(new qcj() { // from class: l.krb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16271m);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.lrb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133312a.lambda$initSubscription$4((C4470c) obj);
            }
        }));
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.xqb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195798a.lambda$initSubscription$5((C4470c) obj);
            }
        }));
        creates(new y20() { // from class: l.yqb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201163a.lambda$initSubscription$6((Bundle) obj);
            }
        });
        lifecycle().filter(new qcj() { // from class: l.zqb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16268j);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.arb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72924a.lambda$initSubscription$8((C4470c) obj);
            }
        }));
    }

    public boolean isAnonymousMode() {
        if (NullChecker.m82486a(this.isAnonymousMode)) {
            return this.isAnonymousMode.booleanValue();
        }
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void monitorInflateViewCost(long j) {
        if (needXmlMonitor() && imq0.m140986a().m140987b()) {
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            if (jCurrentTimeMillis > imq0.m140986a().m140988c()) {
                i4g0.m138493B("e_inflate_view", pageId(), jyb.m147494Y("page_name", pageId()), jyb.m147494Y("time_consume", Long.valueOf(jCurrentTimeMillis)));
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
        return uqb0.f180397c0.signedIn_();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public boolean needXmlMonitor() {
        return this instanceof hmq0;
    }

    @Override // com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 786) {
            if (i2 == -1) {
                ArrayList arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h);
                if (intent.hasExtra("extra_from_type")) {
                    onPickImagesResult(arrayList, intent.getIntExtra("extra_from_type", 0));
                } else {
                    onPickImagesResult(arrayList);
                }
            }
        } else if (i == 1011) {
            nsb0.m164583q(intent);
        } else if (i == 1242) {
            SurveySparrowHelper.INSTANCE.m30691o(i2, intent);
        } else {
            super.onActivityResult(i, i2, intent);
        }
        this.iapManager.m103301o(i, i2, intent);
    }

    @Override // com.p051p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (IntlCountryCodeController.m29125v()) {
            configuration = bqj0.m105945b(configuration);
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
    }

    @Override // com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        checkPushTrack(intent);
        checkXHSAndAddLinkView(intent);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onPauseLifecycle() {
        super.onPauseLifecycle();
    }

    public void onPickImagesResult(List<Media> list) {
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onReadIntentError() {
        try {
            startActivity(SplashProxyAct.m81288l(App.f16088e));
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            m51642n2();
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onRestoreGlobalState(Bundle bundle) {
        super.onRestoreGlobalState(bundle);
        if (bundle.containsKey(KEY_SAVE_WINDOW_DENSITY)) {
            float f = bundle.getFloat(KEY_SAVE_WINDOW_DENSITY);
            float f2 = getResources().getDisplayMetrics().density;
            if (f > 0.0f && f != f2) {
                bnl0.m105513G0(true);
            }
        }
        ABManager.m30318J(bundle);
    }

    @Override // com.p051p1.mobile.android.app.Act
    @SuppressLint({"LogUseError"})
    public void onResumeLifecycle() {
        if (this.badTokenExpireControl) {
            int taskId = getTaskId();
            Log.e(TAG, "PutongAct onResumeLifecycle taskId:" + taskId);
            if (taskId <= 0) {
                CrashHelper.m82479c(new IllegalStateException("ActBadTokenException occurs!!! Act:" + this + " taskId:" + taskId));
                m51642n2();
                return;
            }
        }
        super.onResumeLifecycle();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onSaveGlobalState(Bundle bundle) {
        super.onSaveGlobalState(bundle);
        bundle.putFloat(KEY_SAVE_WINDOW_DENSITY, getResources().getDisplayMetrics().density);
        ABManager.m30319K(bundle);
    }

    @Override // com.p051p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onStopLifecycle() {
        super.onStopLifecycle();
    }

    @Override // android.app.Activity
    public void overridePendingTransition(int i, int i2) {
        super.overridePendingTransition(i, i2);
    }

    @Override // com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return getClass().getName();
    }

    public void pickImagesWithInstaPicker(int i) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo30652b(i);
    }

    public void pickImagesWithInstaPickerWithExtraAction(int i, y20<Intent> y20Var) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo30653c(i, y20Var);
    }

    public void pickImagesWithPicker(int i, boolean z, boolean z2, boolean z3) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo30654d(i, z, z2, z3);
    }

    public void pickImagesWithPickerInFloatLayerExp(int i, boolean z, boolean z2, boolean z3, Gender gender) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo30658h(i, z, z2, z3, gender);
    }

    public void pickMediasWithInstaPicker() {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo30660j();
    }

    public void pickVideoWithPicker(boolean z) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo30663m(z);
    }

    @Override // com.p051p1.mobile.android.app.Act
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
        if (NullChecker.m82486a(toolbar())) {
            getAppTheme().mo134829i(toolbar());
        }
        if (NullChecker.m82486a(getSupportActionBar())) {
            getAppTheme().mo134828h(getSupportActionBar());
        }
        getAppTheme().mo134831k(getWindow());
    }

    public void setNewUI2Theme() {
        this.currentTheme = Theme.ui2;
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(p8c0.f151008a, typedValue, true);
        TypedValue typedValue2 = new TypedValue();
        getTheme().resolveAttribute(p8c0.f151009b, typedValue2, true);
        if (typedValue.data == 0 || typedValue2.data != 0) {
            return;
        }
        setTheme(getDefaultThemeResId());
        if (NullChecker.m82486a(getSupportActionBar())) {
            getSupportActionBar().mo102168A(0.0f);
            ode odeVar = new ode(this);
            odeVar.m167289c(getResources().getColor(b9c0.f75565k));
            odeVar.m167291e(1.0f);
            getSupportActionBar().mo102170C(odeVar);
        }
    }

    public void setStatusBarColorResId(int i) {
        setLightStatusBar(16);
        setStatusBarColor(getResources().getColor(i));
        FlymeSetStatusBarLightMode(getWindow(), true);
        MIUISetStatusBarLightMode(getWindow(), true);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void setTheme() {
        if (getAppTheme().mo134833m()) {
            setCustomAppTheme();
            return;
        }
        if (shouldSwitchToGradientColoredStatusBar()) {
            setUI1Theme();
        }
        if (NullChecker.m82486a(getSupportActionBar()) && "Lenovo".equals(Build.BRAND) && "Lenovo K10e70".equals(Build.MODEL)) {
            getSupportActionBar().mo102169B(cbc0.f80758a);
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
        if (NullChecker.m82486a(getSupportActionBar())) {
            getSupportActionBar().mo102168A(0.0f);
        }
    }

    public void setUI1Theme() {
        this.currentTheme = Theme.ui1;
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(p8c0.f151008a, typedValue, true);
        TypedValue typedValue2 = new TypedValue();
        getTheme().resolveAttribute(p8c0.f151009b, typedValue2, true);
        if (typedValue.data == 0 || typedValue2.data != 0) {
            return;
        }
        setTheme(zfc0.f204122h);
        if (NullChecker.m82486a(getSupportActionBar())) {
            getSupportActionBar().mo102168A(0.0f);
        }
    }

    public void setXmlMonitorLayoutInflater(jmq0 jmq0Var) {
        this.xmlMonitorLayoutInflater = jmq0Var;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public boolean shouldBlockOnCreate(Bundle bundle) {
        return checkRunningCondition();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public boolean shouldBlockOnResume() {
        return checkRunningCondition();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public boolean shouldBlockOnStart() {
        return checkRunningCondition();
    }

    public boolean shouldRemarginContent() {
        return false;
    }

    public boolean shouldShowGradientActionBar() {
        return getAppTheme().mo134835o();
    }

    public boolean shouldShowGradientStatusBar() {
        return getAppTheme().mo134836p();
    }

    public boolean shouldSwitchToGradientColoredStatusBar() {
        return getAppTheme().mo134837q();
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
        if (getAppTheme().mo134833m()) {
            frameLayout2.setBackground(getAppTheme().mo134827g());
        } else {
            frameLayout2.setBackgroundResource(cbc0.f80805x0);
        }
        bnl0.m105578r0(frameLayout2);
        bnl0.m105576q0(getActionBarHeight(), frameLayout2);
        bnl0.m105507D0(-1, frameLayout2);
        if (shouldRemarginContent()) {
            bnl0.m105542Z(view);
            bnl0.m105541Y(getActionBarHeight(), view);
        }
        this.statusHeaderView = frameLayout2;
        frameLayout.addView(frameLayout2);
        return frameLayout;
    }

    public void onPickImagesResult(List<Media> list, int i) {
    }

    public void pickImagesWithPicker(int i, boolean z, boolean z2, boolean z3, String str) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo30656f(i, z, z2, z3, str);
    }

    public void pickImagesWithPickerInFloatLayerExp(int i, boolean z, boolean z2, boolean z3, Gender gender, String str) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo30659i(i, z, z2, z3, gender, str);
    }

    public void pickMediasWithInstaPicker(MusicContent musicContent) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo30661k(musicContent);
    }

    public void pickImagesWithPicker(int i, boolean z, boolean z2, boolean z3, String str, int i2) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo30657g(i, z, z2, z3, str, i2);
    }

    public void pickMediasWithInstaPicker(String str, MusicContent musicContent) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo30662l(str, musicContent);
    }

    public void pickImagesWithPicker(int i, boolean z, boolean z2, boolean z3, int i2) {
        ensureMediaPickerHandler();
        this.mediaPickerHandler.mo30655e(i, z, z2, z3, i2);
    }

    public static void setLightStatusBar(Window window, int i) {
        setLightStatusBar(window, true, i);
    }

    public void setLightStatusBar(int i) {
        setLightStatusBar(getWindow(), i);
    }
}
