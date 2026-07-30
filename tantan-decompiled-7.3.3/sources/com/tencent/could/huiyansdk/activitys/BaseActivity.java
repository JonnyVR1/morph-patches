package com.tencent.could.huiyansdk.activitys;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.DialogInterfaceC0075a;
import androidx.fragment.app.FragmentManager;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.tencent.could.aicamare.CameraHolder;
import com.tencent.could.component.common.p084ai.utils.TwoTuple;
import com.tencent.could.huiyansdk.C14032R;
import com.tencent.could.huiyansdk.api.C14043j;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.entity.AuthUiConfig;
import com.tencent.could.huiyansdk.entity.CompareResult;
import com.tencent.could.huiyansdk.entity.HuiYanSdkConfig;
import com.tencent.could.huiyansdk.entity.LanguageStyle;
import com.tencent.could.huiyansdk.enums.AuthState;
import com.tencent.could.huiyansdk.fragments.AuthingFragment;
import com.tencent.could.huiyansdk.fragments.BaseFragment;
import com.tencent.could.huiyansdk.fragments.C14054a;
import com.tencent.could.huiyansdk.helper.C14063b;
import com.tencent.could.huiyansdk.manager.C14064a;
import com.tencent.could.huiyansdk.manager.C14065b;
import com.tencent.could.huiyansdk.manager.C14066c;
import com.tencent.could.huiyansdk.manager.C14068e;
import com.tencent.could.huiyansdk.permission.C14081c;
import com.tencent.could.huiyansdk.permission.DialogInterfaceOnClickListenerC14080b;
import com.tencent.could.huiyansdk.permission.InterfaceC14079a;
import com.tencent.could.huiyansdk.utils.C14099k;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import io.agora.rtc2.internal.AudioRoutingController;
import java.lang.ref.WeakReference;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p153l.cvb;

/* JADX INFO: loaded from: classes12.dex */
public class BaseActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: a */
    public volatile boolean f58184a = false;

    /* JADX INFO: renamed from: b */
    public TwoTuple<Integer, Integer> f58185b;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.activitys.BaseActivity$a */
    public class RunnableC14033a implements Runnable {
        public RunnableC14033a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseActivity.this.m83397a();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m83397a() {
        View childAt;
        C14064a c14064a = C14064a.a.f58257a;
        c14064a.f58255b = getSupportFragmentManager();
        BaseFragment baseFragment = null;
        if (!TextUtils.isEmpty(c14064a.f58254a)) {
            try {
                baseFragment = (BaseFragment) Class.forName(c14064a.f58254a).newInstance();
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
                C14068e.a.f58293a.m83520a(2, "AuthFragmentManager", "");
            }
        }
        if (baseFragment != null) {
            C14064a.a.f58257a.m83506a(baseFragment);
        } else {
            C14064a.a.f58257a.m83506a(new AuthingFragment());
        }
        new WeakReference(this);
        if (Build.VERSION.SDK_INT >= 35) {
            View viewFindViewById = getWindow().getDecorView().findViewById(R.id.content);
            if ((viewFindViewById instanceof ViewGroup) && (childAt = ((ViewGroup) viewFindViewById).getChildAt(0)) != null) {
                childAt.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: l.ve2
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        return this.f183695a.m83395a(view, windowInsets);
                    }
                });
            }
            WindowInsetsController insetsController = getWindow().getInsetsController();
            if (insetsController != null) {
                insetsController.setSystemBarsAppearance(8, 8);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        String str;
        String str2;
        C14066c c14066c = C14066c.a.f58282a;
        Context contextM83516a = null;
        if (context != null) {
            C14043j c14043j = C14043j.a.f58200a;
            HuiYanSdkConfig huiYanSdkConfig = c14043j.f58191b;
            LanguageStyle languageStyle = huiYanSdkConfig == null ? LanguageStyle.AUTO : huiYanSdkConfig.getLanguageStyle();
            if (languageStyle == LanguageStyle.AUTO) {
                Context contextM83423a = HuiYanBaseApi.C14044a.f58205a.m83423a();
                if (contextM83423a == null) {
                    C14068e.a.f58293a.m83520a(1, "LanguageManager", "huiyan base api, context is null!");
                } else {
                    Locale locale = contextM83423a.getResources().getConfiguration().getLocales().get(0);
                    if (locale != null) {
                        contextM83516a = c14066c.m83516a(context, locale);
                    }
                }
                contextM83516a = context;
            } else if (languageStyle == LanguageStyle.CUSTOMIZE_LANGUAGE) {
                HuiYanSdkConfig huiYanSdkConfig2 = c14043j.f58191b;
                String languageCode = huiYanSdkConfig2 == null ? "" : huiYanSdkConfig2.getLanguageCode();
                if (TextUtils.isEmpty(languageCode)) {
                    contextM83516a = context;
                } else {
                    String[] strArrSplit = languageCode.split("_");
                    if (strArrSplit.length == 2) {
                        contextM83516a = c14066c.m83516a(context, new Locale(strArrSplit[0], strArrSplit[1]));
                    } else {
                        String[] strArrSplit2 = languageCode.split("-");
                        if (strArrSplit2.length == 2) {
                            contextM83516a = c14066c.m83516a(context, new Locale(strArrSplit2[0], strArrSplit2[1]));
                        }
                    }
                    if (contextM83516a == null) {
                        contextM83516a = context;
                    }
                }
            } else {
                if (languageStyle == LanguageStyle.ENGLISH) {
                    str = "en";
                    str2 = "US";
                } else {
                    str = "zh";
                    str2 = "CN";
                }
                if (languageStyle == LanguageStyle.TRADITIONAL_CHINESE) {
                    str2 = "HK";
                }
                contextM83516a = c14066c.m83516a(context, new Locale(str, str2));
            }
        }
        if (contextM83516a == null) {
            super.attachBaseContext(context);
        } else {
            C14043j.a.f58200a.f58198i = new WeakReference<>(contextM83516a);
            super.attachBaseContext(contextM83516a);
        }
    }

    /* JADX INFO: renamed from: b */
    public final TwoTuple<Integer, Integer> m83398b() {
        Display defaultDisplay = ((WindowManager) getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return new TwoTuple<>(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
    }

    /* JADX INFO: renamed from: c */
    public final void m83399c() {
        CameraHolder cameraHolder;
        Context context = CommonUtils.getContext();
        if (context == null) {
            C14068e.a.f58293a.m83520a(2, "BaseActivity", "context is null");
            return;
        }
        BaseFragment baseFragmentM83505a = C14064a.a.f58257a.m83505a();
        if ((baseFragmentM83505a instanceof AuthingFragment) && (cameraHolder = ((AuthingFragment) baseFragmentM83505a).f58231q) != null) {
            cameraHolder.release();
        }
        HuiYanBaseApi.C14044a.f58205a.getClass();
        C14063b c14063b = C14063b.a.f58253a;
        if (c14063b.f58251b != null) {
            c14063b.f58251b = null;
        }
        YtSDKKitFramework.getInstance().deInit();
        C14065b c14065b = C14065b.b.f58281a;
        String string = context.getString(C14032R.string.txy_do_not_change_fold_statue_error);
        c14065b.getClass();
        CompareResult compareResult = new CompareResult();
        compareResult.setErrorCode(232);
        compareResult.setErrorMsg(string);
        c14065b.m83511a(AuthState.AUTH_ERROR_DIALOG, compareResult);
    }

    /* JADX INFO: renamed from: d */
    public void mo83400d() {
        Log.e("BaseActivity", "setChildContentView!");
    }

    /* JADX INFO: renamed from: e */
    public boolean m83401e() {
        TypedArray typedArrayObtainStyledAttributes = getTheme().obtainStyledAttributes(new int[]{R.attr.windowIsTranslucent, R.attr.windowIsFloating});
        try {
            return typedArrayObtainStyledAttributes.getBoolean(0, false) || typedArrayObtainStyledAttributes.getBoolean(1, false);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.app.Activity
    public void finish() {
        C14043j.a.f58200a.f58193d = true;
        super.finish();
    }

    @Override // androidx.lifecycle.InterfaceC0476e
    @NotNull
    public /* bridge */ /* synthetic */ cvb getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C14064a c14064a = C14064a.a.f58257a;
        if (c14064a.f58255b == null) {
            finish();
            return;
        }
        BaseFragment baseFragmentM83505a = c14064a.m83505a();
        if (baseFragmentM83505a != null) {
            baseFragmentM83505a.backPopEvent();
        }
        FragmentManager fragmentManager = c14064a.f58255b;
        if (fragmentManager == null) {
            return;
        }
        if (fragmentManager.m2569m0() <= 1) {
            finish();
        } else {
            c14064a.f58255b.m2532X0();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f58185b == null) {
            C14068e.a.f58293a.m83520a(1, "BaseActivity", "createScreenSize is null do not check change screen size");
            return;
        }
        if (C14043j.a.f58200a.m83418b() == null) {
            C14068e.a.f58293a.m83520a(2, "BaseActivity", "sdkConfig is null");
        }
        TwoTuple<Integer, Integer> twoTupleM83398b = m83398b();
        C14068e c14068e = C14068e.a.f58293a;
        c14068e.m83520a(1, "BaseActivity", "onConfigurationChanged onCreate screenSize: " + this.f58185b.getFirst() + Constants.SEPARATOR_COMMA + this.f58185b.getSecond());
        c14068e.m83520a(1, "BaseActivity", "onConfigurationChanged screenSize: " + twoTupleM83398b.getFirst() + Constants.SEPARATOR_COMMA + twoTupleM83398b.getSecond());
        if (this.f58185b.getFirst().intValue() - twoTupleM83398b.getSecond().intValue() == 0 || this.f58185b.getSecond().intValue() - twoTupleM83398b.getFirst().intValue() == 0) {
            c14068e.m83520a(1, "BaseActivity", "screen size is same, just rotation, do not check change screen size");
            this.f58185b = twoTupleM83398b;
            return;
        }
        if (C14065b.b.f58281a.f58276s) {
            if (Math.abs(this.f58185b.getFirst().intValue() - twoTupleM83398b.getFirst().intValue()) / this.f58185b.getFirst().intValue() > 0.2f) {
                c14068e.m83520a(1, "BaseActivity", "screen width size change!");
                m83399c();
                return;
            } else if (Math.abs(this.f58185b.getSecond().intValue() - twoTupleM83398b.getSecond().intValue()) / this.f58185b.getSecond().intValue() > 0.2f) {
                c14068e.m83520a(1, "BaseActivity", "screen height size change!");
                m83399c();
                return;
            }
        }
        this.f58185b = twoTupleM83398b;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        requestWindowFeature(1);
        C14043j c14043j = C14043j.a.f58200a;
        AuthUiConfig authUiConfig = c14043j.f58192c;
        if (authUiConfig != null && authUiConfig.getMainActivityThemeId() != -1) {
            setTheme(authUiConfig.getMainActivityThemeId());
        }
        if (authUiConfig == null || !authUiConfig.isUseDeepColorStatusBarIcon()) {
            getWindow().getDecorView().setSystemUiVisibility(0);
        } else {
            getWindow().getDecorView().setSystemUiVisibility(8192);
        }
        if (authUiConfig != null) {
            if (!authUiConfig.isTransparentStatusBar() && authUiConfig.getStatusBarColor() != -1) {
                getWindow().setStatusBarColor(authUiConfig.getStatusBarColor());
            }
            if (authUiConfig.isTransparentStatusBar()) {
                getWindow().addFlags(134217728);
                getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
                getWindow().setStatusBarColor(0);
            }
        }
        if (c14043j.m83418b().isDisableSystemRecordScreen()) {
            getWindow().setFlags(8192, 8192);
        }
        getWindow().setFlags(16777216, 16777216);
        Log.e("BaseActivity", "open hardware accelerated!");
        super.onCreate(bundle);
        mo83400d();
        HuiYanSdkConfig huiYanSdkConfigM83418b = c14043j.m83418b();
        new Handler().postDelayed(new RunnableC14033a(), huiYanSdkConfigM83418b != null ? huiYanSdkConfigM83418b.getDelayTimeMsOfLoadFragment() : 1L);
        this.f58185b = m83398b();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C14099k c14099k = C14099k.b.f58374a;
        if (c14099k.f58370b != null) {
            c14099k.f58370b = null;
        }
        CountDownTimer countDownTimer = c14099k.f58369a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            c14099k.f58369a = null;
        }
        C14043j.a.f58200a.f58193d = true;
        C14064a c14064a = C14064a.a.f58257a;
        if (c14064a.f58256c != null) {
            c14064a.f58256c = null;
        }
        if (c14064a.f58255b != null) {
            c14064a.f58255b = null;
        }
        new WeakReference(null);
        new WeakReference(null);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C14081c c14081c = C14081c.a.f58326a;
        c14081c.getClass();
        if (i != 119) {
            return;
        }
        boolean z = false;
        for (int i2 : iArr) {
            if (i2 == -1) {
                z = true;
            }
        }
        if (!z) {
            InterfaceC14079a interfaceC14079a = c14081c.f58324b;
            if (interfaceC14079a != null) {
                ((C14054a) interfaceC14079a).m83472b();
                c14081c.m83558a();
                c14081c.m83559b();
                return;
            }
            return;
        }
        getPackageName();
        if (isFinishing() || isDestroyed()) {
            C14068e.a.f58293a.m83520a(2, "PermissionUtils", "activity is not running, skip dialog");
            InterfaceC14079a interfaceC14079a2 = c14081c.f58324b;
            if (interfaceC14079a2 != null) {
                ((C14054a) interfaceC14079a2).m83471a();
                c14081c.m83559b();
                return;
            }
            return;
        }
        if (c14081c.f58323a == null) {
            DialogInterfaceC0075a.a cancelable = new DialogInterfaceC0075a.a(this).setMessage(getString(C14032R.string.txy_permission_info_log)).setPositiveButton(getString(C14032R.string.txy_ok), new DialogInterfaceOnClickListenerC14080b(c14081c)).setCancelable(true);
            c14081c.f58325c = new WeakReference<>(this);
            DialogInterfaceC0075a dialogInterfaceC0075aCreate = cancelable.create();
            c14081c.f58323a = dialogInterfaceC0075aCreate;
            dialogInterfaceC0075aCreate.setCanceledOnTouchOutside(false);
        }
        c14081c.f58323a.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ WindowInsets m83395a(View view, WindowInsets windowInsets) {
        if (!this.f58184a) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + windowInsets.getInsets(WindowInsets.Type.statusBars()).top, view.getPaddingRight(), view.getPaddingBottom());
            this.f58184a = true;
        }
        return windowInsets;
    }
}
