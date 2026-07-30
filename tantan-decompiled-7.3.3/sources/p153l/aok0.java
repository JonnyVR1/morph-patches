package p153l;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.biometric.C0183a;
import androidx.biometric.DeviceCredentialHandlerActivity;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class aok0 {
    /* JADX INFO: renamed from: a */
    public static boolean m99086a() {
        C0183a c0183aM786f = C0183a.m786f();
        return c0183aM786f != null && c0183aM786f.m792h();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m99087b(@NonNull Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i)) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m99088c(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return false;
            case 6:
            default:
                return true;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m99089d(@NonNull Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i)) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: e */
    public static void m99090e(@NonNull String str, @Nullable FragmentActivity fragmentActivity, @Nullable Bundle bundle, @Nullable Runnable runnable) {
        CharSequence charSequence;
        CharSequence charSequence2;
        if (!(fragmentActivity instanceof DeviceCredentialHandlerActivity)) {
            Log.e(str, "Failed to check device credential. Parent handler not found.");
            return;
        }
        DeviceCredentialHandlerActivity deviceCredentialHandlerActivity = (DeviceCredentialHandlerActivity) fragmentActivity;
        KeyguardManager keyguardManager = (KeyguardManager) deviceCredentialHandlerActivity.getSystemService(KeyguardManager.class);
        if (keyguardManager == null) {
            Log.e(str, "Failed to check device credential. KeyguardManager was null.");
            deviceCredentialHandlerActivity.m733H0(0);
            return;
        }
        if (bundle != null) {
            charSequence = bundle.getCharSequence("title");
            charSequence2 = bundle.getCharSequence("subtitle");
        } else {
            charSequence = null;
            charSequence2 = null;
        }
        Intent intentCreateConfirmDeviceCredentialIntent = keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        if (intentCreateConfirmDeviceCredentialIntent == null) {
            Log.e(str, "Failed to check device credential. Got null intent from Keyguard.");
            deviceCredentialHandlerActivity.m733H0(0);
            return;
        }
        C0183a c0183aM785e = C0183a.m785e();
        c0183aM785e.m797m(true);
        c0183aM785e.m800p();
        if (runnable != null) {
            runnable.run();
        }
        intentCreateConfirmDeviceCredentialIntent.setFlags(134742016);
        deviceCredentialHandlerActivity.startActivityForResult(intentCreateConfirmDeviceCredentialIntent, 0);
    }

    /* JADX INFO: renamed from: f */
    public static void m99091f(@Nullable FragmentActivity fragmentActivity) {
        if (!(fragmentActivity instanceof DeviceCredentialHandlerActivity) || fragmentActivity.isFinishing()) {
            return;
        }
        fragmentActivity.finish();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m99092g(@NonNull Context context, String str) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return m99087b(context, str, j8c0.f118771c);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m99093h(@NonNull Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return m99089d(context, str, j8c0.f118770b) || m99087b(context, str2, j8c0.f118769a);
    }
}
