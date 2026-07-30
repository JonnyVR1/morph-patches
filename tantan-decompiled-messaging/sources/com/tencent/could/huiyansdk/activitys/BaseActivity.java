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
import androidx.appcompat.app.DialogInterfaceC0074a;
import androidx.fragment.app.FragmentManager;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.tencent.could.aicamare.CameraHolder;
import com.tencent.could.component.common.p079ai.utils.TwoTuple;
import com.tencent.could.huiyansdk.C13869R;
import com.tencent.could.huiyansdk.api.C13880j;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.entity.AuthUiConfig;
import com.tencent.could.huiyansdk.entity.CompareResult;
import com.tencent.could.huiyansdk.entity.HuiYanSdkConfig;
import com.tencent.could.huiyansdk.entity.LanguageStyle;
import com.tencent.could.huiyansdk.enums.AuthState;
import com.tencent.could.huiyansdk.fragments.AuthingFragment;
import com.tencent.could.huiyansdk.fragments.BaseFragment;
import com.tencent.could.huiyansdk.fragments.C13891a;
import com.tencent.could.huiyansdk.helper.C13900b;
import com.tencent.could.huiyansdk.manager.C13901a;
import com.tencent.could.huiyansdk.manager.C13902b;
import com.tencent.could.huiyansdk.manager.C13903c;
import com.tencent.could.huiyansdk.manager.C13905e;
import com.tencent.could.huiyansdk.permission.C13918c;
import com.tencent.could.huiyansdk.permission.DialogInterfaceOnClickListenerC13917b;
import com.tencent.could.huiyansdk.permission.InterfaceC13916a;
import com.tencent.could.huiyansdk.utils.C13936k;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import io.agora.rtc2.internal.AudioRoutingController;
import java.lang.ref.WeakReference;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p149l.otb;

/* JADX INFO: loaded from: classes2.dex */
public class BaseActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: a */
    public volatile boolean f57336a = false;

    /* JADX INFO: renamed from: b */
    public TwoTuple<Integer, Integer> f57337b;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.activitys.BaseActivity$a */
    public class RunnableC13870a implements Runnable {
        public RunnableC13870a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseActivity.this.m82214a();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m82214a() {
        View childAt;
        C13901a c13901a = C13901a.a.f57409a;
        c13901a.f57407b = getSupportFragmentManager();
        BaseFragment baseFragment = null;
        if (!TextUtils.isEmpty(c13901a.f57406a)) {
            try {
                baseFragment = (BaseFragment) Class.forName(c13901a.f57406a).newInstance();
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
                C13905e.a.f57445a.m82337a(2, "AuthFragmentManager", "");
            }
        }
        if (baseFragment != null) {
            C13901a.a.f57409a.m82323a(baseFragment);
        } else {
            C13901a.a.f57409a.m82323a(new AuthingFragment());
        }
        new WeakReference(this);
        if (Build.VERSION.SDK_INT >= 35) {
            View viewFindViewById = getWindow().getDecorView().findViewById(R.id.content);
            if ((viewFindViewById instanceof ViewGroup) && (childAt = ((ViewGroup) viewFindViewById).getChildAt(0)) != null) {
                childAt.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: l.ne2
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        return this.f138573a.m82212a(view, windowInsets);
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
        C13903c c13903c = C13903c.a.f57434a;
        Context contextM82333a = null;
        if (context != null) {
            C13880j c13880j = C13880j.a.f57352a;
            HuiYanSdkConfig huiYanSdkConfig = c13880j.f57343b;
            LanguageStyle languageStyle = huiYanSdkConfig == null ? LanguageStyle.AUTO : huiYanSdkConfig.getLanguageStyle();
            if (languageStyle == LanguageStyle.AUTO) {
                Context contextM82240a = HuiYanBaseApi.C13881a.f57357a.m82240a();
                if (contextM82240a == null) {
                    C13905e.a.f57445a.m82337a(1, "LanguageManager", "huiyan base api, context is null!");
                } else {
                    Locale locale = contextM82240a.getResources().getConfiguration().getLocales().get(0);
                    if (locale != null) {
                        contextM82333a = c13903c.m82333a(context, locale);
                    }
                }
                contextM82333a = context;
            } else if (languageStyle == LanguageStyle.CUSTOMIZE_LANGUAGE) {
                HuiYanSdkConfig huiYanSdkConfig2 = c13880j.f57343b;
                String languageCode = huiYanSdkConfig2 == null ? "" : huiYanSdkConfig2.getLanguageCode();
                if (TextUtils.isEmpty(languageCode)) {
                    contextM82333a = context;
                } else {
                    String[] strArrSplit = languageCode.split("_");
                    if (strArrSplit.length == 2) {
                        contextM82333a = c13903c.m82333a(context, new Locale(strArrSplit[0], strArrSplit[1]));
                    } else {
                        String[] strArrSplit2 = languageCode.split("-");
                        if (strArrSplit2.length == 2) {
                            contextM82333a = c13903c.m82333a(context, new Locale(strArrSplit2[0], strArrSplit2[1]));
                        }
                    }
                    if (contextM82333a == null) {
                        contextM82333a = context;
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
                contextM82333a = c13903c.m82333a(context, new Locale(str, str2));
            }
        }
        if (contextM82333a == null) {
            super.attachBaseContext(context);
        } else {
            C13880j.a.f57352a.f57350i = new WeakReference<>(contextM82333a);
            super.attachBaseContext(contextM82333a);
        }
    }

    /* JADX INFO: renamed from: b */
    public final TwoTuple<Integer, Integer> m82215b() {
        Display defaultDisplay = ((WindowManager) getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return new TwoTuple<>(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
    }

    /* JADX INFO: renamed from: c */
    public final void m82216c() {
        CameraHolder cameraHolder;
        Context context = CommonUtils.getContext();
        if (context == null) {
            C13905e.a.f57445a.m82337a(2, "BaseActivity", "context is null");
            return;
        }
        BaseFragment baseFragmentM82322a = C13901a.a.f57409a.m82322a();
        if ((baseFragmentM82322a instanceof AuthingFragment) && (cameraHolder = ((AuthingFragment) baseFragmentM82322a).f57383q) != null) {
            cameraHolder.release();
        }
        HuiYanBaseApi.C13881a.f57357a.getClass();
        C13900b c13900b = C13900b.a.f57405a;
        if (c13900b.f57403b != null) {
            c13900b.f57403b = null;
        }
        YtSDKKitFramework.getInstance().deInit();
        C13902b c13902b = C13902b.b.f57433a;
        String string = context.getString(C13869R.string.txy_do_not_change_fold_statue_error);
        c13902b.getClass();
        CompareResult compareResult = new CompareResult();
        compareResult.setErrorCode(232);
        compareResult.setErrorMsg(string);
        c13902b.m82328a(AuthState.AUTH_ERROR_DIALOG, compareResult);
    }

    /* JADX INFO: renamed from: d */
    public void mo82217d() {
        Log.e("BaseActivity", "setChildContentView!");
    }

    /* JADX INFO: renamed from: e */
    public boolean m82218e() {
        TypedArray typedArrayObtainStyledAttributes = getTheme().obtainStyledAttributes(new int[]{R.attr.windowIsTranslucent, R.attr.windowIsFloating});
        try {
            return typedArrayObtainStyledAttributes.getBoolean(0, false) || typedArrayObtainStyledAttributes.getBoolean(1, false);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.app.Activity
    public void finish() {
        C13880j.a.f57352a.f57345d = true;
        super.finish();
    }

    @Override // androidx.lifecycle.InterfaceC0475e
    @NotNull
    public /* bridge */ /* synthetic */ otb getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C13901a c13901a = C13901a.a.f57409a;
        if (c13901a.f57407b == null) {
            finish();
            return;
        }
        BaseFragment baseFragmentM82322a = c13901a.m82322a();
        if (baseFragmentM82322a != null) {
            baseFragmentM82322a.backPopEvent();
        }
        FragmentManager fragmentManager = c13901a.f57407b;
        if (fragmentManager == null) {
            return;
        }
        if (fragmentManager.m2568m0() <= 1) {
            finish();
        } else {
            c13901a.f57407b.m2531X0();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f57337b == null) {
            C13905e.a.f57445a.m82337a(1, "BaseActivity", "createScreenSize is null do not check change screen size");
            return;
        }
        if (C13880j.a.f57352a.m82235b() == null) {
            C13905e.a.f57445a.m82337a(2, "BaseActivity", "sdkConfig is null");
        }
        TwoTuple<Integer, Integer> twoTupleM82215b = m82215b();
        C13905e c13905e = C13905e.a.f57445a;
        c13905e.m82337a(1, "BaseActivity", "onConfigurationChanged onCreate screenSize: " + this.f57337b.getFirst() + Constants.SEPARATOR_COMMA + this.f57337b.getSecond());
        c13905e.m82337a(1, "BaseActivity", "onConfigurationChanged screenSize: " + twoTupleM82215b.getFirst() + Constants.SEPARATOR_COMMA + twoTupleM82215b.getSecond());
        if (this.f57337b.getFirst().intValue() - twoTupleM82215b.getSecond().intValue() == 0 || this.f57337b.getSecond().intValue() - twoTupleM82215b.getFirst().intValue() == 0) {
            c13905e.m82337a(1, "BaseActivity", "screen size is same, just rotation, do not check change screen size");
            this.f57337b = twoTupleM82215b;
            return;
        }
        if (C13902b.b.f57433a.f57428s) {
            if (Math.abs(this.f57337b.getFirst().intValue() - twoTupleM82215b.getFirst().intValue()) / this.f57337b.getFirst().intValue() > 0.2f) {
                c13905e.m82337a(1, "BaseActivity", "screen width size change!");
                m82216c();
                return;
            } else if (Math.abs(this.f57337b.getSecond().intValue() - twoTupleM82215b.getSecond().intValue()) / this.f57337b.getSecond().intValue() > 0.2f) {
                c13905e.m82337a(1, "BaseActivity", "screen height size change!");
                m82216c();
                return;
            }
        }
        this.f57337b = twoTupleM82215b;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        requestWindowFeature(1);
        C13880j c13880j = C13880j.a.f57352a;
        AuthUiConfig authUiConfig = c13880j.f57344c;
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
        if (c13880j.m82235b().isDisableSystemRecordScreen()) {
            getWindow().setFlags(8192, 8192);
        }
        getWindow().setFlags(16777216, 16777216);
        Log.e("BaseActivity", "open hardware accelerated!");
        super.onCreate(bundle);
        mo82217d();
        HuiYanSdkConfig huiYanSdkConfigM82235b = c13880j.m82235b();
        new Handler().postDelayed(new RunnableC13870a(), huiYanSdkConfigM82235b != null ? huiYanSdkConfigM82235b.getDelayTimeMsOfLoadFragment() : 1L);
        this.f57337b = m82215b();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C13936k c13936k = C13936k.b.f57526a;
        if (c13936k.f57522b != null) {
            c13936k.f57522b = null;
        }
        CountDownTimer countDownTimer = c13936k.f57521a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            c13936k.f57521a = null;
        }
        C13880j.a.f57352a.f57345d = true;
        C13901a c13901a = C13901a.a.f57409a;
        if (c13901a.f57408c != null) {
            c13901a.f57408c = null;
        }
        if (c13901a.f57407b != null) {
            c13901a.f57407b = null;
        }
        new WeakReference(null);
        new WeakReference(null);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C13918c c13918c = C13918c.a.f57478a;
        c13918c.getClass();
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
            InterfaceC13916a interfaceC13916a = c13918c.f57476b;
            if (interfaceC13916a != null) {
                ((C13891a) interfaceC13916a).m82289b();
                c13918c.m82375a();
                c13918c.m82376b();
                return;
            }
            return;
        }
        getPackageName();
        if (isFinishing() || isDestroyed()) {
            C13905e.a.f57445a.m82337a(2, "PermissionUtils", "activity is not running, skip dialog");
            InterfaceC13916a interfaceC13916a2 = c13918c.f57476b;
            if (interfaceC13916a2 != null) {
                ((C13891a) interfaceC13916a2).m82288a();
                c13918c.m82376b();
                return;
            }
            return;
        }
        if (c13918c.f57475a == null) {
            DialogInterfaceC0074a.a cancelable = new DialogInterfaceC0074a.a(this).setMessage(getString(C13869R.string.txy_permission_info_log)).setPositiveButton(getString(C13869R.string.txy_ok), new DialogInterfaceOnClickListenerC13917b(c13918c)).setCancelable(true);
            c13918c.f57477c = new WeakReference<>(this);
            DialogInterfaceC0074a dialogInterfaceC0074aCreate = cancelable.create();
            c13918c.f57475a = dialogInterfaceC0074aCreate;
            dialogInterfaceC0074aCreate.setCanceledOnTouchOutside(false);
        }
        c13918c.f57475a.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ WindowInsets m82212a(View view, WindowInsets windowInsets) {
        if (!this.f57336a) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + windowInsets.getInsets(WindowInsets.Type.statusBars()).top, view.getPaddingRight(), view.getPaddingBottom());
            this.f57336a = true;
        }
        return windowInsets;
    }
}
