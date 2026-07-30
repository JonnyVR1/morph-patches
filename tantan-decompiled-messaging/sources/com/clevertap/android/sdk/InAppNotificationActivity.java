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
import p149l.cd50;
import p149l.oom;
import p149l.w7q0;
import p149l.y6q0;
import p149l.yom;
import p149l.z0e;

/* JADX INFO: loaded from: classes.dex */
public final class InAppNotificationActivity extends FragmentActivity implements yom, z0e, C1198i.c, oom {

    /* JADX INFO: renamed from: h */
    private static boolean f4785h = false;

    /* JADX INFO: renamed from: c */
    private CleverTapInstanceConfig f4786c;

    /* JADX INFO: renamed from: d */
    private CTInAppNotification f4787d;

    /* JADX INFO: renamed from: e */
    private WeakReference<yom> f4788e;

    /* JADX INFO: renamed from: f */
    private C1198i f4789f;

    /* JADX INFO: renamed from: g */
    private boolean f4790g = false;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.InAppNotificationActivity$a */
    public class C1166a extends cd50 {
        public C1166a(boolean z) {
            super(z);
        }

        @Override // p149l.cd50
        public void handleOnBackPressed() {
            InAppNotificationActivity.this.finish();
            InAppNotificationActivity.this.m5855L0(null);
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.InAppNotificationActivity$b */
    public static /* synthetic */ class C1167b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f4792a;

        static {
            int[] iArr = new int[CTInAppType.values().length];
            f4792a = iArr;
            try {
                iArr[CTInAppType.CTInAppTypeCoverHTML.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4792a[CTInAppType.CTInAppTypeInterstitialHTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4792a[CTInAppType.CTInAppTypeHalfInterstitialHTML.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4792a[CTInAppType.CTInAppTypeCover.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4792a[CTInAppType.CTInAppTypeInterstitial.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4792a[CTInAppType.CTInAppTypeHalfInterstitial.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4792a[CTInAppType.CTInAppTypeCoverImageOnly.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4792a[CTInAppType.CTInAppTypeInterstitialImageOnly.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4792a[CTInAppType.CTInAppTypeHalfInterstitialImageOnly.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4792a[CTInAppType.CTInAppTypeAlert.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: J0 */
    private CTInAppBaseFullFragment m5844J0() {
        CTInAppType inAppType = this.f4787d.getInAppType();
        switch (C1167b.f4792a[inAppType.ordinal()]) {
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
                m5851W0();
                return null;
            default:
                this.f4786c.getLogger().verbose("InAppNotificationActivity: Unhandled InApp Type: " + inAppType);
                return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: K0 */
    private Bundle m5845K0(CTInAppNotificationButton cTInAppNotificationButton) {
        yom yomVarM5859Q0 = m5859Q0();
        if (yomVarM5859Q0 != null) {
            return yomVarM5859Q0.mo5860U(this.f4787d, cTInAppNotificationButton, this);
        }
        return null;
    }

    /* JADX INFO: renamed from: P0 */
    private String m5846P0() {
        return this.f4786c.getAccountId() + ":CT_INAPP_CONTENT_FRAGMENT";
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: R0 */
    public static void m5847R0(Context context, CTInAppNotification cTInAppNotification, CleverTapInstanceConfig cleverTapInstanceConfig) {
        Intent intent = new Intent(context, (Class<?>) InAppNotificationActivity.class);
        intent.putExtra("inApp", cTInAppNotification);
        intent.putExtra(Constants.KEY_CONFIG, cleverTapInstanceConfig);
        context.startActivity(intent);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: S0 */
    public static void m5848S0(Activity activity, CleverTapInstanceConfig cleverTapInstanceConfig, boolean z) {
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
    /* JADX INFO: renamed from: T0 */
    public void m5849T0(CTInAppNotificationButton cTInAppNotificationButton, boolean z) {
        Bundle bundleM5845K0 = m5845K0(cTInAppNotificationButton);
        if (this.f4787d.getIsLocalInApp()) {
            if (z) {
                m5862X0(this.f4787d.getFallBackToNotificationSettings());
                return;
            }
            mo5853H();
        }
        CTInAppAction cTInAppAction = cTInAppNotificationButton.action;
        if (cTInAppAction == null || InAppActionType.REQUEST_FOR_PERMISSIONS != cTInAppAction.getType()) {
            m5855L0(bundleM5845K0);
        } else {
            m5862X0(cTInAppAction.getShouldFallbackToSettings());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public void m5850U0(CTInAppNotificationButton cTInAppNotificationButton) {
        m5855L0(m5845K0(cTInAppNotificationButton));
    }

    /* JADX INFO: renamed from: W0 */
    private void m5851W0() {
        List<CTInAppNotificationButton> listM6163f = this.f4787d.m6163f();
        if (listM6163f.isEmpty()) {
            this.f4786c.getLogger().debug("InAppNotificationActivity: Notification has no buttons, not showing Alert InApp");
            return;
        }
        final CTInAppNotificationButton cTInAppNotificationButton = listM6163f.get(0);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(this, R.style.Theme.Material.Light.Dialog.Alert).setCancelable(false).setTitle(this.f4787d.getTitle()).setMessage(this.f4787d.getMessage()).setPositiveButton(cTInAppNotificationButton.getText(), new DialogInterface.OnClickListener() { // from class: l.fpm
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f98717a.m5849T0(cTInAppNotificationButton, true);
            }
        }).create();
        if (this.f4787d.m6163f().size() == 2) {
            final CTInAppNotificationButton cTInAppNotificationButton2 = listM6163f.get(1);
            alertDialogCreate.setButton(-2, cTInAppNotificationButton2.getText(), new DialogInterface.OnClickListener() { // from class: l.gpm
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f103808a.m5849T0(cTInAppNotificationButton2, false);
                }
            });
        }
        if (listM6163f.size() > 2) {
            final CTInAppNotificationButton cTInAppNotificationButton3 = listM6163f.get(2);
            alertDialogCreate.setButton(-3, cTInAppNotificationButton3.getText(), new DialogInterface.OnClickListener() { // from class: l.hpm
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f108946a.m5850U0(cTInAppNotificationButton3);
                }
            });
        }
        alertDialogCreate.show();
        f4785h = true;
        m5857O0(null);
    }

    @Override // com.clevertap.android.sdk.C1198i.c
    /* JADX INFO: renamed from: B0 */
    public void mo5852B0(boolean z) {
        Bundle bundle;
        CTInAppNotification cTInAppNotification = this.f4787d;
        if (cTInAppNotification == null || !cTInAppNotification.getIsLocalInApp()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle.putString(Constants.KEY_C2A, this.f4787d.m6163f().get(0).getText());
            bundle.putString(Constants.NOTIFICATION_ID_TAG, "");
        }
        m5855L0(bundle);
    }

    @Override // p149l.z0e
    /* JADX INFO: renamed from: H */
    public void mo5853H() {
        this.f4789f.m6105e(this);
    }

    @Override // p149l.yom
    /* JADX INFO: renamed from: J */
    public void mo5854J(@NonNull CTInAppNotification cTInAppNotification, @Nullable Bundle bundle) {
        m5855L0(bundle);
    }

    /* JADX INFO: renamed from: L0 */
    public void m5855L0(Bundle bundle) {
        m5856N0(bundle, true);
    }

    /* JADX INFO: renamed from: N0 */
    public void m5856N0(Bundle bundle, boolean z) {
        CTInAppNotification cTInAppNotification;
        if (f4785h) {
            f4785h = false;
        }
        if (!this.f4790g) {
            yom yomVarM5859Q0 = m5859Q0();
            if (yomVarM5859Q0 != null && (cTInAppNotification = this.f4787d) != null) {
                yomVarM5859Q0.mo5854J(cTInAppNotification, bundle);
            }
            this.f4790g = true;
        }
        if (z) {
            finish();
        }
    }

    /* JADX INFO: renamed from: O0 */
    public void m5857O0(Bundle bundle) {
        yom yomVarM5859Q0 = m5859Q0();
        if (yomVarM5859Q0 != null) {
            yomVarM5859Q0.mo5863s0(this.f4787d, bundle);
        }
    }

    @Override // p149l.z0e
    /* JADX INFO: renamed from: P */
    public void mo5858P(boolean z) {
        m5862X0(z);
    }

    /* JADX INFO: renamed from: Q0 */
    public yom m5859Q0() {
        yom yomVar;
        try {
            yomVar = this.f4788e.get();
        } catch (Throwable unused) {
            yomVar = null;
        }
        if (yomVar == null && this.f4787d != null) {
            this.f4786c.getLogger().verbose(this.f4786c.getAccountId(), "InAppActivityListener is null for notification: " + this.f4787d.m6175s());
        }
        return yomVar;
    }

    @Override // p149l.yom
    @Nullable
    /* JADX INFO: renamed from: U */
    public Bundle mo5860U(@NonNull CTInAppNotification cTInAppNotification, @NonNull CTInAppNotificationButton cTInAppNotificationButton, @Nullable Context context) {
        yom yomVarM5859Q0 = m5859Q0();
        if (yomVarM5859Q0 != null) {
            return yomVarM5859Q0.mo5860U(cTInAppNotification, cTInAppNotificationButton, this);
        }
        return null;
    }

    /* JADX INFO: renamed from: V0 */
    public void m5861V0(yom yomVar) {
        this.f4788e = new WeakReference<>(yomVar);
    }

    /* JADX INFO: renamed from: X0 */
    public void m5862X0(boolean z) {
        this.f4789f.m6109i(this, z);
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
        getOnBackPressedDispatcher().m195a(this, new C1166a(true));
        int i = getResources().getConfiguration().orientation;
        if (i == 2 && (window = getWindow()) != null) {
            window.addFlags(1024);
            new w7q0(window, window.getDecorView()).m202060a(y6q0.C21326l.m213236f());
        }
        try {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                throw new IllegalArgumentException();
            }
            CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) extras.getParcelable(Constants.KEY_CONFIG);
            this.f4786c = cleverTapInstanceConfig;
            if (cleverTapInstanceConfig == null) {
                throw new IllegalArgumentException();
            }
            C1186g c1186gM5793H = CleverTapAPI.m5760U(this, cleverTapInstanceConfig).m5793H();
            this.f4789f = new C1198i(this.f4786c, c1186gM5793H.getCallbackManager().mo100743q(), this);
            if (extras.getBoolean("displayPushPermissionPrompt", false)) {
                m5862X0(extras.getBoolean("shouldShowFallbackSettings", false));
                return;
            }
            m5861V0(c1186gM5793H.getInAppController());
            c1186gM5793H.getInAppController().m6265Y(this);
            CTInAppNotification cTInAppNotification = (CTInAppNotification) extras.getParcelable("inApp");
            this.f4787d = cTInAppNotification;
            if (cTInAppNotification == null) {
                finish();
                return;
            }
            if (cTInAppNotification.getIsPortrait() && !this.f4787d.getIsLandscape()) {
                if (i == 2) {
                    Logger.m5865d("App in Landscape, dismissing portrait InApp Notification");
                    finish();
                    m5855L0(null);
                    return;
                }
                Logger.m5865d("App in Portrait, displaying InApp Notification anyway");
            }
            if (!this.f4787d.getIsPortrait() && this.f4787d.getIsLandscape()) {
                if (i == 1) {
                    Logger.m5865d("App in Portrait, dismissing landscape InApp Notification");
                    finish();
                    m5855L0(null);
                    return;
                }
                Logger.m5865d("App in Landscape, displaying InApp Notification anyway");
            }
            if (bundle != null) {
                if (f4785h) {
                    m5844J0();
                }
            } else {
                CTInAppBaseFullFragment cTInAppBaseFullFragmentM5844J0 = m5844J0();
                if (cTInAppBaseFullFragmentM5844J0 != null) {
                    cTInAppBaseFullFragmentM5844J0.m6401n4(this.f4787d, this.f4786c);
                    getSupportFragmentManager().m2567m().m2813u(R.animator.fade_in, R.animator.fade_out).m2804c(R.id.content, cTInAppBaseFullFragmentM5844J0, m5846P0()).mo2709k();
                }
            }
        } catch (Throwable th) {
            Logger.m5876v("Cannot find a valid notification bundle to show!", th);
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        CleverTapAPI cleverTapAPIM5760U;
        C1186g c1186gM5793H;
        super.onDestroy();
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f4786c;
        if (cleverTapInstanceConfig != null && (cleverTapAPIM5760U = CleverTapAPI.m5760U(this, cleverTapInstanceConfig)) != null && (c1186gM5793H = cleverTapAPIM5760U.m5793H()) != null) {
            c1186gM5793H.getInAppController().m6270f0();
        }
        if (isChangingConfigurations()) {
            return;
        }
        m5856N0(null, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.f4789f.m6108h(this, i, iArr);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f4789f.m6107g(this);
    }

    @Override // p149l.yom
    /* JADX INFO: renamed from: s0 */
    public void mo5863s0(@NonNull CTInAppNotification cTInAppNotification, @Nullable Bundle bundle) {
        m5857O0(bundle);
    }

    @Override // p149l.yom
    @Nullable
    /* JADX INFO: renamed from: y0 */
    public Bundle mo5864y0(@NonNull CTInAppNotification cTInAppNotification, @NonNull CTInAppAction cTInAppAction, @NonNull String str, @Nullable Bundle bundle, @Nullable Context context) {
        yom yomVarM5859Q0 = m5859Q0();
        if (yomVarM5859Q0 != null) {
            return yomVarM5859Q0.mo5864y0(cTInAppNotification, cTInAppAction, str, bundle, this);
        }
        return null;
    }
}
