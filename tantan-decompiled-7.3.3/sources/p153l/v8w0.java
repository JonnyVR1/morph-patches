package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzba;
import com.google.android.gms.internal.ads.zzead;
import com.google.android.gms.internal.ads.zzeir;

/* JADX INFO: loaded from: classes6.dex */
public final class v8w0 {
    /* JADX INFO: renamed from: a */
    public static zze m200324a(Throwable th) {
        if (th instanceof zzeir) {
            zzeir zzeirVar = (zzeir) th;
            return m200326c(zzeirVar.zza(), zzeirVar.zzb());
        }
        if (th instanceof zzead) {
            return th.getMessage() == null ? m200327d(((zzead) th).zza(), null, null) : m200327d(((zzead) th).zza(), th.getMessage(), null);
        }
        if (!(th instanceof zzba)) {
            return m200327d(1, null, null);
        }
        zzba zzbaVar = (zzba) th;
        return new zze(zzbaVar.zza(), epw0.m121874c(zzbaVar.getMessage()), "com.google.android.gms.ads", null, null);
    }

    /* JADX INFO: renamed from: b */
    public static zze m200325b(Throwable th, @Nullable tcv0 tcv0Var) {
        zze zzeVar;
        zze zzeVarM200324a = m200324a(th);
        int i = zzeVarM200324a.zza;
        if ((i == 3 || i == 0) && (zzeVar = zzeVarM200324a.zzd) != null && !zzeVar.zzc.equals("com.google.android.gms.ads")) {
            zzeVarM200324a.zzd = null;
        }
        if (tcv0Var != null) {
            zzeVarM200324a.zze = tcv0Var.m190510b();
        }
        return zzeVarM200324a;
    }

    /* JADX INFO: renamed from: c */
    public static zze m200326c(int i, zze zzeVar) {
        if (i == 0) {
            throw null;
        }
        if (i == 8) {
            if (((Integer) jas0.m144075c().m176505a(sgs0.f168301f8)).intValue() > 0) {
                return zzeVar;
            }
            i = 8;
        }
        return m200327d(i, null, zzeVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:55:0x00a5  */
    /* JADX INFO: renamed from: d */
    public static zze m200327d(int i, @Nullable String str, @Nullable zze zzeVar) {
        String str2;
        int i2 = i - 1;
        if (str == null) {
            if (i == 0) {
                throw null;
            }
            str = "No fill.";
            switch (i2) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    break;
                case 3:
                    str = "App ID missing.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((Integer) jas0.m144075c().m176505a(sgs0.f168340i8)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                    }
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    break;
                case 14:
                    str = "Invalid ad string.";
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    break;
            }
        }
        String str3 = str;
        if (i == 0) {
            throw null;
        }
        int i3 = 0;
        int i4 = 2;
        switch (i2) {
            case 0:
            case 11:
            case 15:
                i4 = i3;
                return new zze(i4, str3, "com.google.android.gms.ads", zzeVar, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i4 = 1;
                return new zze(i4, str3, "com.google.android.gms.ads", zzeVar, null);
            case 2:
            case 10:
            case 18:
                i4 = 3;
                return new zze(i4, str3, "com.google.android.gms.ads", zzeVar, null);
            case 3:
                i3 = 8;
                i4 = i3;
                return new zze(i4, str3, "com.google.android.gms.ads", zzeVar, null);
            case 4:
            case 8:
            case 17:
                return new zze(i4, str3, "com.google.android.gms.ads", zzeVar, null);
            case 7:
                i3 = 4;
                i4 = i3;
                return new zze(i4, str3, "com.google.android.gms.ads", zzeVar, null);
            case 12:
                if (((Integer) jas0.m144075c().m176505a(sgs0.f168340i8)).intValue() <= 0) {
                    i3 = 9;
                    i4 = i3;
                } else {
                    i4 = 3;
                }
                return new zze(i4, str3, "com.google.android.gms.ads", zzeVar, null);
            case 13:
                i3 = 10;
                i4 = i3;
                return new zze(i4, str3, "com.google.android.gms.ads", zzeVar, null);
            case 14:
                i3 = 11;
                i4 = i3;
                return new zze(i4, str3, "com.google.android.gms.ads", zzeVar, null);
            default:
                switch (i) {
                    case 1:
                        str2 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str2 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str2 = "NO_FILL";
                        break;
                    case 4:
                        str2 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str2 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str2 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str2 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str2 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str2 = "NOT_READY";
                        break;
                    case 10:
                        str2 = "AD_REUSED";
                        break;
                    case 11:
                        str2 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str2 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str2 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str2 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str2 = "INVALID_AD_STRING";
                        break;
                    case 16:
                        str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str2 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError("Unknown SdkError: ".concat(str2));
        }
    }
}
