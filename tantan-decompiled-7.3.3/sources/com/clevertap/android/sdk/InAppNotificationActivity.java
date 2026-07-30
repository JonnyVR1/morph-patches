package com.clevertap.android.sdk;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.FragmentActivity;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.CTInAppType;
import com.clevertap.android.sdk.inapp.InAppActionType;
import com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFullFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppHtmlCoverFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppHtmlHalfInterstitialFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppHtmlInterstitialFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeCoverFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeCoverImageFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeHalfInterstitialFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeHalfInterstitialImageFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeInterstitialFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeInterstitialImageFragment;
import java.lang.ref.WeakReference;
import java.util.List;
import p153l.arm;
import p153l.bhq0;
import p153l.dgq0;
import p153l.jl50;
import p153l.n2e;
import p153l.qqm;

/* JADX INFO: loaded from: classes.dex */
public final class InAppNotificationActivity extends FragmentActivity implements arm, n2e, C1221i.c, qqm {

    /* JADX INFO: renamed from: h */
    private static boolean f4822h = false;

    /* JADX INFO: renamed from: c */
    private CleverTapInstanceConfig f4823c;

    /* JADX INFO: renamed from: d */
    private CTInAppNotification f4824d;

    /* JADX INFO: renamed from: e */
    private WeakReference<arm> f4825e;

    /* JADX INFO: renamed from: f */
    private C1221i f4826f;

    /* JADX INFO: renamed from: g */
    private boolean f4827g = false;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.InAppNotificationActivity$a */
    public class C1189a extends jl50 {
        public C1189a(boolean z) {
            super(z);
        }

        @Override // p153l.jl50
        public void handleOnBackPressed() {
            InAppNotificationActivity.this.finish();
            InAppNotificationActivity.this.m5910N0(null);
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.InAppNotificationActivity$b */
    public static /* synthetic */ class C1190b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f4829a;

        static {
            int[] iArr = new int[CTInAppType.values().length];
            f4829a = iArr;
            try {
                iArr[CTInAppType.CTInAppTypeCoverHTML.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4829a[CTInAppType.CTInAppTypeInterstitialHTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4829a[CTInAppType.CTInAppTypeHalfInterstitialHTML.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4829a[CTInAppType.CTInAppTypeCover.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4829a[CTInAppType.CTInAppTypeInterstitial.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4829a[CTInAppType.CTInAppTypeHalfInterstitial.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4829a[CTInAppType.CTInAppTypeCoverImageOnly.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4829a[CTInAppType.CTInAppTypeInterstitialImageOnly.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4829a[CTInAppType.CTInAppTypeHalfInterstitialImageOnly.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4829a[CTInAppType.CTInAppTypeAlert.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: K0 */
    private CTInAppBaseFullFragment m5898K0() {
        CTInAppType inAppType = this.f4824d.getInAppType();
        switch (C1190b.f4829a[inAppType.ordinal()]) {
            case 1:
                return new CTInAppHtmlCoverFragment();
            case 2:
                return new CTInAppHtmlInterstitialFragment();
            case 3:
                return new CTInAppHtmlHalfInterstitialFragment();
            case 4:
                return new CTInAppNativeCoverFragment();
            case 5:
                return new CTInAppNativeInterstitialFragment();
            case 6:
                return new CTInAppNativeHalfInterstitialFragment();
            case 7:
                return new CTInAppNativeCoverImageFragment();
            case 8:
                return new CTInAppNativeInterstitialImageFragment();
            case 9:
                return new CTInAppNativeHalfInterstitialImageFragment();
            case 10:
                m5905X0();
                return null;
            default:
                this.f4823c.getLogger().verbose("InAppNotificationActivity: Unhandled InApp Type: " + inAppType);
                return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: L0 */
    private Bundle m5899L0(CTInAppNotificationButton cTInAppNotificationButton) {
        arm armVarM5914R0 = m5914R0();
        if (armVarM5914R0 != null) {
            return armVarM5914R0.mo5915V(this.f4824d, cTInAppNotificationButton, this);
        }
        return null;
    }

    /* JADX INFO: renamed from: Q0 */
    private String m5900Q0() {
        return this.f4823c.getAccountId() + ":CT_INAPP_CONTENT_FRAGMENT";
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: S0 */
    public static void m5901S0(Context context, CTInAppNotification cTInAppNotification, CleverTapInstanceConfig cleverTapInstanceConfig) {
        Intent intent = new Intent(context, (Class<?>) InAppNotificationActivity.class);
        intent.putExtra("inApp", cTInAppNotification);
        intent.putExtra(Constants.KEY_CONFIG, cleverTapInstanceConfig);
        context.startActivity(intent);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: T0 */
    public static void m5902T0(Activity activity, CleverTapInstanceConfig cleverTapInstanceConfig, boolean z) {
        if (activity.getClass().equals(InAppNotificationActivity.class)) {
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) InAppNotificationActivity.class);
        intent.putExtra(Constants.KEY_CONFIG, cleverTapInstanceConfig);
        intent.putExtra("displayPushPermissionPrompt", true);
        intent.putExtra("shouldShowFallbackSettings", z);
        activity.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public void m5903U0(CTInAppNotificationButton cTInAppNotificationButton, boolean z) {
        Bundle bundleM5899L0 = m5899L0(cTInAppNotificationButton);
        if (this.f4824d.getIsLocalInApp()) {
            if (z) {
                m5917Y0(this.f4824d.getFallBackToNotificationSettings());
                return;
            }
            mo5908I();
        }
        CTInAppAction cTInAppAction = cTInAppNotificationButton.action;
        if (cTInAppAction == null || InAppActionType.REQUEST_FOR_PERMISSIONS != cTInAppAction.getType()) {
            m5910N0(bundleM5899L0);
        } else {
            m5917Y0(cTInAppAction.getShouldFallbackToSettings());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public void m5904V0(CTInAppNotificationButton cTInAppNotificationButton) {
        m5910N0(m5899L0(cTInAppNotificationButton));
    }

    /* JADX INFO: renamed from: X0 */
    private void m5905X0() {
        List<CTInAppNotificationButton> listM6217f = this.f4824d.m6217f();
        if (listM6217f.isEmpty()) {
            this.f4823c.getLogger().debug("InAppNotificationActivity: Notification has no buttons, not showing Alert InApp");
            return;
        }
        final CTInAppNotificationButton cTInAppNotificationButton = listM6217f.get(0);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(this, R.style.Theme.Material.Light.Dialog.Alert).setCancelable(false).setTitle(this.f4824d.getTitle()).setMessage(this.f4824d.getMessage()).setPositiveButton(cTInAppNotificationButton.getText(), new DialogInterface.OnClickListener() { // from class: l.hrm
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f111363a.m5903U0(cTInAppNotificationButton, true);
            }
        }).create();
        if (this.f4824d.m6217f().size() == 2) {
            final CTInAppNotificationButton cTInAppNotificationButton2 = listM6217f.get(1);
            alertDialogCreate.setButton(-2, cTInAppNotificationButton2.getText(), new DialogInterface.OnClickListener() { // from class: l.irm
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f116585a.m5903U0(cTInAppNotificationButton2, false);
                }
            });
        }
        if (listM6217f.size() > 2) {
            final CTInAppNotificationButton cTInAppNotificationButton3 = listM6217f.get(2);
            alertDialogCreate.setButton(-3, cTInAppNotificationButton3.getText(), new DialogInterface.OnClickListener() { // from class: l.jrm
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f122393a.m5904V0(cTInAppNotificationButton3);
                }
            });
        }
        alertDialogCreate.show();
        f4822h = true;
        m5912P0(null);
    }

    @Override // p153l.arm
    @Nullable
    /* JADX INFO: renamed from: A0 */
    public Bundle mo5906A0(@NonNull CTInAppNotification cTInAppNotification, @NonNull CTInAppAction cTInAppAction, @NonNull String str, @Nullable Bundle bundle, @Nullable Context context) {
        arm armVarM5914R0 = m5914R0();
        if (armVarM5914R0 != null) {
            return armVarM5914R0.mo5906A0(cTInAppNotification, cTInAppAction, str, bundle, this);
        }
        return null;
    }

    @Override // com.clevertap.android.sdk.C1221i.c
    /* JADX INFO: renamed from: D0 */
    public void mo5907D0(boolean z) {
        Bundle bundle;
        CTInAppNotification cTInAppNotification = this.f4824d;
        if (cTInAppNotification == null || !cTInAppNotification.getIsLocalInApp()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle.putString(Constants.KEY_C2A, this.f4824d.m6217f().get(0).getText());
            bundle.putString(Constants.NOTIFICATION_ID_TAG, "");
        }
        m5910N0(bundle);
    }

    @Override // p153l.n2e
    /* JADX INFO: renamed from: I */
    public void mo5908I() {
        this.f4826f.m6159e(this);
    }

    @Override // p153l.arm
    /* JADX INFO: renamed from: K */
    public void mo5909K(@NonNull CTInAppNotification cTInAppNotification, @Nullable Bundle bundle) {
        m5910N0(bundle);
    }

    /* JADX INFO: renamed from: N0 */
    public void m5910N0(Bundle bundle) {
        m5911O0(bundle, true);
    }

    /* JADX INFO: renamed from: O0 */
    public void m5911O0(Bundle bundle, boolean z) {
        CTInAppNotification cTInAppNotification;
        if (f4822h) {
            f4822h = false;
        }
        if (!this.f4827g) {
            arm armVarM5914R0 = m5914R0();
            if (armVarM5914R0 != null && (cTInAppNotification = this.f4824d) != null) {
                armVarM5914R0.mo5909K(cTInAppNotification, bundle);
            }
            this.f4827g = true;
        }
        if (z) {
            finish();
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m5912P0(Bundle bundle) {
        arm armVarM5914R0 = m5914R0();
        if (armVarM5914R0 != null) {
            armVarM5914R0.mo5918t0(this.f4824d, bundle);
        }
    }

    @Override // p153l.n2e
    /* JADX INFO: renamed from: Q */
    public void mo5913Q(boolean z) {
        m5917Y0(z);
    }

    /* JADX INFO: renamed from: R0 */
    public arm m5914R0() {
        arm armVar;
        try {
            armVar = this.f4825e.get();
        } catch (Throwable unused) {
            armVar = null;
        }
        if (armVar == null && this.f4824d != null) {
            this.f4823c.getLogger().verbose(this.f4823c.getAccountId(), "InAppActivityListener is null for notification: " + this.f4824d.m6229s());
        }
        return armVar;
    }

    @Override // p153l.arm
    @Nullable
    /* JADX INFO: renamed from: V */
    public Bundle mo5915V(@NonNull CTInAppNotification cTInAppNotification, @NonNull CTInAppNotificationButton cTInAppNotificationButton, @Nullable Context context) {
        arm armVarM5914R0 = m5914R0();
        if (armVarM5914R0 != null) {
            return armVarM5914R0.mo5915V(cTInAppNotification, cTInAppNotificationButton, this);
        }
        return null;
    }

    /* JADX INFO: renamed from: W0 */
    public void m5916W0(arm armVar) {
        this.f4825e = new WeakReference<>(armVar);
    }

    /* JADX INFO: renamed from: Y0 */
    public void m5917Y0(boolean z) {
        this.f4826f.m6163i(this, z);
    }

    @Override // android.app.Activity
    @SuppressLint({"WrongConstant"})
    public void finish() {
        super.finish();
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(1, R.anim.fade_in, R.anim.fade_out);
        } else {
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        getOnBackPressedDispatcher().m196a(this, new C1189a(true));
        int i = getResources().getConfiguration().orientation;
        if (i == 2 && (window = getWindow()) != null) {
            window.addFlags(1024);
            new bhq0(window, window.getDecorView()).m104355a(dgq0.C16531l.m115737f());
        }
        try {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                throw new IllegalArgumentException();
            }
            CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) extras.getParcelable(Constants.KEY_CONFIG);
            this.f4823c = cleverTapInstanceConfig;
            if (cleverTapInstanceConfig == null) {
                throw new IllegalArgumentException();
            }
            C1209g c1209gM5847H = CleverTapAPI.m5814U(this, cleverTapInstanceConfig).m5847H();
            this.f4826f = new C1221i(this.f4823c, c1209gM5847H.getCallbackManager().mo96523q(), this);
            if (extras.getBoolean("displayPushPermissionPrompt", false)) {
                m5917Y0(extras.getBoolean("shouldShowFallbackSettings", false));
                return;
            }
            m5916W0(c1209gM5847H.getInAppController());
            c1209gM5847H.getInAppController().m6319Y(this);
            CTInAppNotification cTInAppNotification = (CTInAppNotification) extras.getParcelable("inApp");
            this.f4824d = cTInAppNotification;
            if (cTInAppNotification == null) {
                finish();
                return;
            }
            if (cTInAppNotification.getIsPortrait() && !this.f4824d.getIsLandscape()) {
                if (i == 2) {
                    Logger.m5919d("App in Landscape, dismissing portrait InApp Notification");
                    finish();
                    m5910N0(null);
                    return;
                }
                Logger.m5919d("App in Portrait, displaying InApp Notification anyway");
            }
            if (!this.f4824d.getIsPortrait() && this.f4824d.getIsLandscape()) {
                if (i == 1) {
                    Logger.m5919d("App in Portrait, dismissing landscape InApp Notification");
                    finish();
                    m5910N0(null);
                    return;
                }
                Logger.m5919d("App in Landscape, displaying InApp Notification anyway");
            }
            if (bundle != null) {
                if (f4822h) {
                    m5898K0();
                }
            } else {
                CTInAppBaseFullFragment cTInAppBaseFullFragmentM5898K0 = m5898K0();
                if (cTInAppBaseFullFragmentM5898K0 != null) {
                    cTInAppBaseFullFragmentM5898K0.m6455n4(this.f4824d, this.f4823c);
                    getSupportFragmentManager().m2568m().m2814u(R.animator.fade_in, R.animator.fade_out).m2805c(R.id.content, cTInAppBaseFullFragmentM5898K0, m5900Q0()).mo2710k();
                }
            }
        } catch (Throwable th) {
            Logger.m5930v("Cannot find a valid notification bundle to show!", th);
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        CleverTapAPI cleverTapAPIM5814U;
        C1209g c1209gM5847H;
        super.onDestroy();
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f4823c;
        if (cleverTapInstanceConfig != null && (cleverTapAPIM5814U = CleverTapAPI.m5814U(this, cleverTapInstanceConfig)) != null && (c1209gM5847H = cleverTapAPIM5814U.m5847H()) != null) {
            c1209gM5847H.getInAppController().m6324f0();
        }
        if (isChangingConfigurations()) {
            return;
        }
        m5911O0(null, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.f4826f.m6162h(this, i, iArr);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f4826f.m6161g(this);
    }

    @Override // p153l.arm
    /* JADX INFO: renamed from: t0 */
    public void mo5918t0(@NonNull CTInAppNotification cTInAppNotification, @Nullable Bundle bundle) {
        m5912P0(bundle);
    }
}
