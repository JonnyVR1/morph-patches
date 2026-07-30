package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.base.R$string;
import com.google.android.gms.common.C2106R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;
import p153l.oof0;
import p153l.vw5;

/* JADX INFO: loaded from: classes6.dex */
public final class zac {
    private static final oof0 zaa = new oof0();

    @Nullable
    private static Locale zab;

    public static String zaa(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    @NonNull
    public static String zab(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(R$string.f9826d);
        }
        if (i != 2) {
            return i != 3 ? resources.getString(R.string.ok) : resources.getString(R$string.f9823a);
        }
        return resources.getString(R$string.f9832j);
    }

    @NonNull
    public static String zac(Context context, int i) {
        Resources resources = context.getResources();
        String strZaa = zaa(context);
        if (i == 1) {
            return resources.getString(R$string.f9827e, strZaa);
        }
        if (i == 2) {
            return DeviceProperties.isWearableWithoutPlayStore(context) ? resources.getString(R$string.f9836n) : resources.getString(R$string.f9833k, strZaa);
        }
        if (i == 3) {
            return resources.getString(R$string.f9824b, strZaa);
        }
        if (i == 5) {
            return zag(context, "common_google_play_services_invalid_account_text", strZaa);
        }
        if (i == 7) {
            return zag(context, "common_google_play_services_network_error_text", strZaa);
        }
        if (i == 9) {
            return resources.getString(R$string.f9831i, strZaa);
        }
        if (i == 20) {
            return zag(context, "common_google_play_services_restricted_profile_text", strZaa);
        }
        switch (i) {
            case 16:
                return zag(context, "common_google_play_services_api_unavailable_text", strZaa);
            case 17:
                return zag(context, "common_google_play_services_sign_in_failed_text", strZaa);
            case 18:
                return resources.getString(R$string.f9835m, strZaa);
            default:
                return resources.getString(C2106R.string.common_google_play_services_unknown_issue, strZaa);
        }
    }

    @NonNull
    public static String zad(Context context, int i) {
        return (i == 6 || i == 19) ? zag(context, "common_google_play_services_resolution_required_text", zaa(context)) : zac(context, i);
    }

    @NonNull
    public static String zae(Context context, int i) {
        String strZah = i == 6 ? zah(context, "common_google_play_services_resolution_required_title") : zaf(context, i);
        return strZah == null ? context.getResources().getString(R$string.f9830h) : strZah;
    }

    @Nullable
    public static String zaf(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R$string.f9828f);
            case 2:
                return resources.getString(R$string.f9834l);
            case 3:
                return resources.getString(R$string.f9825c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return zah(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return zah(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return zah(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return zah(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String zag(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strZah = zah(context, str);
        if (strZah == null) {
            strZah = resources.getString(C2106R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strZah, str2);
    }

    @Nullable
    private static String zah(Context context, String str) {
        oof0 oof0Var = zaa;
        synchronized (oof0Var) {
            try {
                Locale localeM128031b = vw5.m203065a(context.getResources().getConfiguration()).m128031b(0);
                if (!localeM128031b.equals(zab)) {
                    oof0Var.clear();
                    zab = localeM128031b;
                }
                String str2 = (String) oof0Var.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
                if (remoteResource == null) {
                    return null;
                }
                int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    return null;
                }
                String string = remoteResource.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    return null;
                }
                oof0Var.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
