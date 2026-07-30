package com.google.android.libraries.places.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import p149l.ig3;
import p149l.jfd0;
import p149l.jwm;
import p149l.k250;
import p149l.ohg0;
import p149l.pf80;
import p149l.qkq0;
import p149l.x9g0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzmt {
    public static int zza(int i, int i2, String str) {
        String strZzb;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strZzb = zznb.zzb("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                k250.m144273a("negative size: ", i2);
                return 0;
            }
            strZzb = zznb.zzb("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(strZzb);
    }

    public static int zzb(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        jwm.m143661a(zzt(i, i2, FirebaseAnalytics.Param.INDEX));
        return 0;
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        jfd0.m141176a((String) obj2);
        return null;
    }

    public static Object zzd(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        jfd0.m141176a(zznb.zzb(str, obj2));
        return null;
    }

    public static void zze(boolean z) {
        if (z) {
            return;
        }
        x9g0.m207497a();
    }

    public static void zzf(boolean z, Object obj) {
        if (z) {
            return;
        }
        pf80.m168601a(obj);
    }

    public static void zzg(boolean z, String str, char c) {
        if (z) {
            return;
        }
        ig3.m135964a(zznb.zzb(str, Character.valueOf(c)));
    }

    public static void zzh(boolean z, String str, int i) {
        if (z) {
            return;
        }
        ig3.m135964a(zznb.zzb(str, Integer.valueOf(i)));
    }

    public static void zzi(boolean z, String str, long j) {
        if (z) {
            return;
        }
        ig3.m135964a(zznb.zzb(str, Long.valueOf(j)));
    }

    public static void zzj(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        ig3.m135964a(zznb.zzb(str, obj));
    }

    public static void zzk(boolean z, String str, int i, Object obj) {
        if (z) {
            return;
        }
        ig3.m135964a(zznb.zzb(str, 4800, obj));
    }

    public static void zzl(boolean z, String str, Object obj, Object obj2) {
        if (z) {
            return;
        }
        ig3.m135964a(zznb.zzb(str, obj, obj2));
    }

    public static void zzm(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (z) {
            return;
        }
        ig3.m135964a(zznb.zzb(str, obj, obj2, obj3));
    }

    public static void zzn(int i, int i2, int i3) {
        String strZzt;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strZzt = zzt(i, i3, "start index");
            } else {
                strZzt = (i2 < 0 || i2 > i3) ? zzt(i2, i3, "end index") : zznb.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strZzt);
        }
    }

    public static void zzo(boolean z) {
        if (z) {
            return;
        }
        ohg0.m164364a();
    }

    public static void zzp(boolean z, Object obj) {
        if (z) {
            return;
        }
        qkq0.m175383a((String) obj);
    }

    public static void zzq(boolean z, String str, int i) {
        if (z) {
            return;
        }
        qkq0.m175383a(zznb.zzb(str, Integer.valueOf(i)));
    }

    public static void zzr(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        qkq0.m175383a(zznb.zzb(str, obj));
    }

    public static void zzs(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (z) {
            return;
        }
        qkq0.m175383a(zznb.zzb(str, obj, obj2, obj3));
    }

    private static String zzt(int i, int i2, String str) {
        if (i < 0) {
            return zznb.zzb("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zznb.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        k250.m144273a("negative size: ", i2);
        return null;
    }
}
