package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.momo.momortc.MMConstants;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p153l.cry0;
import p153l.cty0;
import p153l.d4u0;
import p153l.h950;
import p153l.lhy0;
import p153l.nje;
import p153l.o5t0;
import p153l.oje;
import p153l.ooy0;
import p153l.p1m;
import p153l.w8s0;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public final class DynamiteModule {

    /* JADX INFO: renamed from: h */
    @Nullable
    public static Boolean f9846h = null;

    /* JADX INFO: renamed from: i */
    @Nullable
    public static String f9847i = null;

    /* JADX INFO: renamed from: j */
    public static boolean f9848j = false;

    /* JADX INFO: renamed from: k */
    public static int f9849k = -1;

    /* JADX INFO: renamed from: l */
    @Nullable
    public static Boolean f9850l;

    /* JADX INFO: renamed from: q */
    @Nullable
    public static cry0 f9855q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public static cty0 f9856r;

    /* JADX INFO: renamed from: a */
    public final Context f9857a;

    /* JADX INFO: renamed from: m */
    public static final ThreadLocal f9851m = new ThreadLocal();

    /* JADX INFO: renamed from: n */
    public static final ThreadLocal f9852n = new d4u0();

    /* JADX INFO: renamed from: o */
    public static final InterfaceC2107a.a f9853o = new C2108a();

    /* JADX INFO: renamed from: b */
    @NonNull
    @KeepForSdk
    public static final InterfaceC2107a f9840b = new C2109b();

    /* JADX INFO: renamed from: c */
    @NonNull
    @KeepForSdk
    public static final InterfaceC2107a f9841c = new C2110c();

    /* JADX INFO: renamed from: d */
    @NonNull
    @KeepForSdk
    public static final InterfaceC2107a f9842d = new C2111d();

    /* JADX INFO: renamed from: e */
    @NonNull
    @KeepForSdk
    public static final InterfaceC2107a f9843e = new C2112e();

    /* JADX INFO: renamed from: f */
    @NonNull
    @KeepForSdk
    public static final InterfaceC2107a f9844f = new C2113f();

    /* JADX INFO: renamed from: g */
    @NonNull
    @KeepForSdk
    public static final InterfaceC2107a f9845g = new C2114g();

    /* JADX INFO: renamed from: p */
    @NonNull
    public static final InterfaceC2107a f9854p = new C2115h();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @Nullable
        public static ClassLoader sClassLoader;
    }

    /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    public interface InterfaceC2107a {

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a */
        @KeepForSdk
        public interface a {
            /* JADX INFO: renamed from: a */
            int mo12541a(@NonNull Context context, @NonNull String str, boolean z) throws LoadingException;

            /* JADX INFO: renamed from: b */
            int mo12542b(@NonNull Context context, @NonNull String str);
        }

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$a$b */
        @KeepForSdk
        public static class b {

            /* JADX INFO: renamed from: a */
            @KeepForSdk
            public int f9858a = 0;

            /* JADX INFO: renamed from: b */
            @KeepForSdk
            public int f9859b = 0;

            /* JADX INFO: renamed from: c */
            @KeepForSdk
            public int f9860c = 0;
        }

        @NonNull
        @KeepForSdk
        /* JADX INFO: renamed from: a */
        b mo12540a(@NonNull Context context, @NonNull String str, @NonNull a aVar) throws LoadingException;
    }

    public DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.f9857a = context;
    }

    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public static int m12528a(@NonNull Context context, @NonNull String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: c */
    public static int m12529c(@NonNull Context context, @NonNull String str) {
        return m12531f(context, str, false);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:117:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:122:0x01c8 A[Catch: all -> 0x005f, TryCatch #8 {all -> 0x005f, blocks: (B:7:0x0033, B:17:0x0059, B:122:0x01c8, B:123:0x01da, B:99:0x0171, B:100:0x017c, B:106:0x0189, B:108:0x0190, B:110:0x019f, B:120:0x01bf, B:121:0x01c7, B:103:0x017f, B:104:0x0180, B:105:0x0188, B:124:0x01db, B:125:0x0206, B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00c9, B:58:0x00d1, B:60:0x00d9, B:61:0x00e2, B:55:0x00bd, B:64:0x00e5, B:65:0x00e6, B:66:0x00ee, B:67:0x00ef, B:68:0x00f7, B:71:0x00fa, B:72:0x00fb, B:74:0x0101, B:76:0x0108, B:78:0x0110, B:84:0x013b, B:86:0x0141, B:87:0x0149, B:88:0x0151, B:79:0x011f, B:80:0x0127, B:82:0x012a, B:83:0x0133, B:89:0x0152, B:90:0x015a, B:91:0x015b, B:92:0x0163, B:98:0x0170), top: B:147:0x0033, inners: #0, #8 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0059 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #8 {all -> 0x005f, blocks: (B:7:0x0033, B:17:0x0059, B:122:0x01c8, B:123:0x01da, B:99:0x0171, B:100:0x017c, B:106:0x0189, B:108:0x0190, B:110:0x019f, B:120:0x01bf, B:121:0x01c7, B:103:0x017f, B:104:0x0180, B:105:0x0188, B:124:0x01db, B:125:0x0206, B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00c9, B:58:0x00d1, B:60:0x00d9, B:61:0x00e2, B:55:0x00bd, B:64:0x00e5, B:65:0x00e6, B:66:0x00ee, B:67:0x00ef, B:68:0x00f7, B:71:0x00fa, B:72:0x00fb, B:74:0x0101, B:76:0x0108, B:78:0x0110, B:84:0x013b, B:86:0x0141, B:87:0x0149, B:88:0x0151, B:79:0x011f, B:80:0x0127, B:82:0x012a, B:83:0x0133, B:89:0x0152, B:90:0x015a, B:91:0x015b, B:92:0x0163, B:98:0x0170), top: B:147:0x0033, inners: #0, #8 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006d A[Catch: all -> 0x0164, TryCatch #2 {, blocks: (B:24:0x0067, B:26:0x006d, B:27:0x006f, B:95:0x0166, B:96:0x016e), top: B:142:0x0067 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0072 A[Catch: all -> 0x00b4, LoadingException -> 0x00b7, RemoteException -> 0x00ba, TRY_ENTER, TryCatch #8 {RemoteException -> 0x00ba, LoadingException -> 0x00b7, all -> 0x00b4, blocks: (B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00c9, B:58:0x00d1, B:60:0x00d9, B:61:0x00e2, B:55:0x00bd, B:64:0x00e5, B:65:0x00e6, B:66:0x00ee, B:67:0x00ef, B:68:0x00f7, B:71:0x00fa, B:72:0x00fb, B:74:0x0101, B:76:0x0108, B:78:0x0110, B:84:0x013b, B:86:0x0141, B:87:0x0149, B:88:0x0151, B:79:0x011f, B:80:0x0127, B:82:0x012a, B:83:0x0133, B:89:0x0152, B:90:0x015a, B:91:0x015b, B:92:0x0163, B:98:0x0170), top: B:148:0x0066, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:36:0x0081 A[Catch: all -> 0x00b4, LoadingException -> 0x00b7, RemoteException -> 0x00ba, TRY_ENTER, TryCatch #8 {RemoteException -> 0x00ba, LoadingException -> 0x00b7, all -> 0x00b4, blocks: (B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00c9, B:58:0x00d1, B:60:0x00d9, B:61:0x00e2, B:55:0x00bd, B:64:0x00e5, B:65:0x00e6, B:66:0x00ee, B:67:0x00ef, B:68:0x00f7, B:71:0x00fa, B:72:0x00fb, B:74:0x0101, B:76:0x0108, B:78:0x0110, B:84:0x013b, B:86:0x0141, B:87:0x0149, B:88:0x0151, B:79:0x011f, B:80:0x0127, B:82:0x012a, B:83:0x0133, B:89:0x0152, B:90:0x015a, B:91:0x015b, B:92:0x0163, B:98:0x0170), top: B:148:0x0066, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ef A[Catch: all -> 0x00b4, LoadingException -> 0x00b7, RemoteException -> 0x00ba, TryCatch #8 {RemoteException -> 0x00ba, LoadingException -> 0x00b7, all -> 0x00b4, blocks: (B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00c9, B:58:0x00d1, B:60:0x00d9, B:61:0x00e2, B:55:0x00bd, B:64:0x00e5, B:65:0x00e6, B:66:0x00ee, B:67:0x00ef, B:68:0x00f7, B:71:0x00fa, B:72:0x00fb, B:74:0x0101, B:76:0x0108, B:78:0x0110, B:84:0x013b, B:86:0x0141, B:87:0x0149, B:88:0x0151, B:79:0x011f, B:80:0x0127, B:82:0x012a, B:83:0x0133, B:89:0x0152, B:90:0x015a, B:91:0x015b, B:92:0x0163, B:98:0x0170), top: B:148:0x0066, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00fb A[Catch: all -> 0x00b4, LoadingException -> 0x00b7, RemoteException -> 0x00ba, TryCatch #8 {RemoteException -> 0x00ba, LoadingException -> 0x00b7, all -> 0x00b4, blocks: (B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00c9, B:58:0x00d1, B:60:0x00d9, B:61:0x00e2, B:55:0x00bd, B:64:0x00e5, B:65:0x00e6, B:66:0x00ee, B:67:0x00ef, B:68:0x00f7, B:71:0x00fa, B:72:0x00fb, B:74:0x0101, B:76:0x0108, B:78:0x0110, B:84:0x013b, B:86:0x0141, B:87:0x0149, B:88:0x0151, B:79:0x011f, B:80:0x0127, B:82:0x012a, B:83:0x0133, B:89:0x0152, B:90:0x015a, B:91:0x015b, B:92:0x0163, B:98:0x0170), top: B:148:0x0066, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0101 A[Catch: all -> 0x00b4, LoadingException -> 0x00b7, RemoteException -> 0x00ba, TryCatch #8 {RemoteException -> 0x00ba, LoadingException -> 0x00b7, all -> 0x00b4, blocks: (B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00c9, B:58:0x00d1, B:60:0x00d9, B:61:0x00e2, B:55:0x00bd, B:64:0x00e5, B:65:0x00e6, B:66:0x00ee, B:67:0x00ef, B:68:0x00f7, B:71:0x00fa, B:72:0x00fb, B:74:0x0101, B:76:0x0108, B:78:0x0110, B:84:0x013b, B:86:0x0141, B:87:0x0149, B:88:0x0151, B:79:0x011f, B:80:0x0127, B:82:0x012a, B:83:0x0133, B:89:0x0152, B:90:0x015a, B:91:0x015b, B:92:0x0163, B:98:0x0170), top: B:148:0x0066, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0108 A[Catch: all -> 0x00b4, LoadingException -> 0x00b7, RemoteException -> 0x00ba, TryCatch #8 {RemoteException -> 0x00ba, LoadingException -> 0x00b7, all -> 0x00b4, blocks: (B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00c9, B:58:0x00d1, B:60:0x00d9, B:61:0x00e2, B:55:0x00bd, B:64:0x00e5, B:65:0x00e6, B:66:0x00ee, B:67:0x00ef, B:68:0x00f7, B:71:0x00fa, B:72:0x00fb, B:74:0x0101, B:76:0x0108, B:78:0x0110, B:84:0x013b, B:86:0x0141, B:87:0x0149, B:88:0x0151, B:79:0x011f, B:80:0x0127, B:82:0x012a, B:83:0x0133, B:89:0x0152, B:90:0x015a, B:91:0x015b, B:92:0x0163, B:98:0x0170), top: B:148:0x0066, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0110 A[Catch: all -> 0x00b4, LoadingException -> 0x00b7, RemoteException -> 0x00ba, TryCatch #8 {RemoteException -> 0x00ba, LoadingException -> 0x00b7, all -> 0x00b4, blocks: (B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00c9, B:58:0x00d1, B:60:0x00d9, B:61:0x00e2, B:55:0x00bd, B:64:0x00e5, B:65:0x00e6, B:66:0x00ee, B:67:0x00ef, B:68:0x00f7, B:71:0x00fa, B:72:0x00fb, B:74:0x0101, B:76:0x0108, B:78:0x0110, B:84:0x013b, B:86:0x0141, B:87:0x0149, B:88:0x0151, B:79:0x011f, B:80:0x0127, B:82:0x012a, B:83:0x0133, B:89:0x0152, B:90:0x015a, B:91:0x015b, B:92:0x0163, B:98:0x0170), top: B:148:0x0066, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x011f A[Catch: all -> 0x00b4, LoadingException -> 0x00b7, RemoteException -> 0x00ba, TryCatch #8 {RemoteException -> 0x00ba, LoadingException -> 0x00b7, all -> 0x00b4, blocks: (B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00c9, B:58:0x00d1, B:60:0x00d9, B:61:0x00e2, B:55:0x00bd, B:64:0x00e5, B:65:0x00e6, B:66:0x00ee, B:67:0x00ef, B:68:0x00f7, B:71:0x00fa, B:72:0x00fb, B:74:0x0101, B:76:0x0108, B:78:0x0110, B:84:0x013b, B:86:0x0141, B:87:0x0149, B:88:0x0151, B:79:0x011f, B:80:0x0127, B:82:0x012a, B:83:0x0133, B:89:0x0152, B:90:0x015a, B:91:0x015b, B:92:0x0163, B:98:0x0170), top: B:148:0x0066, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0128 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x012a A[Catch: all -> 0x00b4, LoadingException -> 0x00b7, RemoteException -> 0x00ba, TryCatch #8 {RemoteException -> 0x00ba, LoadingException -> 0x00b7, all -> 0x00b4, blocks: (B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00c9, B:58:0x00d1, B:60:0x00d9, B:61:0x00e2, B:55:0x00bd, B:64:0x00e5, B:65:0x00e6, B:66:0x00ee, B:67:0x00ef, B:68:0x00f7, B:71:0x00fa, B:72:0x00fb, B:74:0x0101, B:76:0x0108, B:78:0x0110, B:84:0x013b, B:86:0x0141, B:87:0x0149, B:88:0x0151, B:79:0x011f, B:80:0x0127, B:82:0x012a, B:83:0x0133, B:89:0x0152, B:90:0x015a, B:91:0x015b, B:92:0x0163, B:98:0x0170), top: B:148:0x0066, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0133 A[Catch: all -> 0x00b4, LoadingException -> 0x00b7, RemoteException -> 0x00ba, TryCatch #8 {RemoteException -> 0x00ba, LoadingException -> 0x00b7, all -> 0x00b4, blocks: (B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00c9, B:58:0x00d1, B:60:0x00d9, B:61:0x00e2, B:55:0x00bd, B:64:0x00e5, B:65:0x00e6, B:66:0x00ee, B:67:0x00ef, B:68:0x00f7, B:71:0x00fa, B:72:0x00fb, B:74:0x0101, B:76:0x0108, B:78:0x0110, B:84:0x013b, B:86:0x0141, B:87:0x0149, B:88:0x0151, B:79:0x011f, B:80:0x0127, B:82:0x012a, B:83:0x0133, B:89:0x0152, B:90:0x015a, B:91:0x015b, B:92:0x0163, B:98:0x0170), top: B:148:0x0066, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0141 A[Catch: all -> 0x00b4, LoadingException -> 0x00b7, RemoteException -> 0x00ba, TryCatch #8 {RemoteException -> 0x00ba, LoadingException -> 0x00b7, all -> 0x00b4, blocks: (B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00c9, B:58:0x00d1, B:60:0x00d9, B:61:0x00e2, B:55:0x00bd, B:64:0x00e5, B:65:0x00e6, B:66:0x00ee, B:67:0x00ef, B:68:0x00f7, B:71:0x00fa, B:72:0x00fb, B:74:0x0101, B:76:0x0108, B:78:0x0110, B:84:0x013b, B:86:0x0141, B:87:0x0149, B:88:0x0151, B:79:0x011f, B:80:0x0127, B:82:0x012a, B:83:0x0133, B:89:0x0152, B:90:0x015a, B:91:0x015b, B:92:0x0163, B:98:0x0170), top: B:148:0x0066, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0149 A[Catch: all -> 0x00b4, LoadingException -> 0x00b7, RemoteException -> 0x00ba, TryCatch #8 {RemoteException -> 0x00ba, LoadingException -> 0x00b7, all -> 0x00b4, blocks: (B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00c9, B:58:0x00d1, B:60:0x00d9, B:61:0x00e2, B:55:0x00bd, B:64:0x00e5, B:65:0x00e6, B:66:0x00ee, B:67:0x00ef, B:68:0x00f7, B:71:0x00fa, B:72:0x00fb, B:74:0x0101, B:76:0x0108, B:78:0x0110, B:84:0x013b, B:86:0x0141, B:87:0x0149, B:88:0x0151, B:79:0x011f, B:80:0x0127, B:82:0x012a, B:83:0x0133, B:89:0x0152, B:90:0x015a, B:91:0x015b, B:92:0x0163, B:98:0x0170), top: B:148:0x0066, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0152 A[Catch: all -> 0x00b4, LoadingException -> 0x00b7, RemoteException -> 0x00ba, TryCatch #8 {RemoteException -> 0x00ba, LoadingException -> 0x00b7, all -> 0x00b4, blocks: (B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00c9, B:58:0x00d1, B:60:0x00d9, B:61:0x00e2, B:55:0x00bd, B:64:0x00e5, B:65:0x00e6, B:66:0x00ee, B:67:0x00ef, B:68:0x00f7, B:71:0x00fa, B:72:0x00fb, B:74:0x0101, B:76:0x0108, B:78:0x0110, B:84:0x013b, B:86:0x0141, B:87:0x0149, B:88:0x0151, B:79:0x011f, B:80:0x0127, B:82:0x012a, B:83:0x0133, B:89:0x0152, B:90:0x015a, B:91:0x015b, B:92:0x0163, B:98:0x0170), top: B:148:0x0066, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x015b A[Catch: all -> 0x00b4, LoadingException -> 0x00b7, RemoteException -> 0x00ba, TryCatch #8 {RemoteException -> 0x00ba, LoadingException -> 0x00b7, all -> 0x00b4, blocks: (B:23:0x0066, B:29:0x0072, B:32:0x007b, B:36:0x0081, B:38:0x008b, B:40:0x008f, B:41:0x009a, B:48:0x00a7, B:56:0x00c9, B:58:0x00d1, B:60:0x00d9, B:61:0x00e2, B:55:0x00bd, B:64:0x00e5, B:65:0x00e6, B:66:0x00ee, B:67:0x00ef, B:68:0x00f7, B:71:0x00fa, B:72:0x00fb, B:74:0x0101, B:76:0x0108, B:78:0x0110, B:84:0x013b, B:86:0x0141, B:87:0x0149, B:88:0x0151, B:79:0x011f, B:80:0x0127, B:82:0x012a, B:83:0x0133, B:89:0x0152, B:90:0x015a, B:91:0x015b, B:92:0x0163, B:98:0x0170), top: B:148:0x0066, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0166 A[Catch: all -> 0x0164, TRY_ENTER, TryCatch #2 {, blocks: (B:24:0x0067, B:26:0x006d, B:27:0x006f, B:95:0x0166, B:96:0x016e), top: B:142:0x0067 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:122:0x01c8, please report this as an issue */
    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    /* JADX INFO: renamed from: e */
    public static DynamiteModule m12530e(@NonNull Context context, @NonNull InterfaceC2107a interfaceC2107a, @NonNull String str) throws Throwable {
        long j;
        DynamiteModule dynamiteModuleM12533h;
        Boolean bool;
        cry0 cry0VarM12537l;
        int iZze;
        p1m p1mVarM112106Y2;
        Object objM134037P2;
        DynamiteModule dynamiteModule;
        lhy0 lhy0Var;
        cty0 cty0Var;
        lhy0 lhy0Var2;
        boolean z;
        Cursor cursor;
        Context applicationContext = context.getApplicationContext();
        ooy0 ooy0Var = null;
        if (applicationContext == null) {
            throw new LoadingException("null application Context", null);
        }
        ThreadLocal threadLocal = f9851m;
        lhy0 lhy0Var3 = (lhy0) threadLocal.get();
        lhy0 lhy0Var4 = new lhy0(null);
        threadLocal.set(lhy0Var4);
        ThreadLocal threadLocal2 = f9852n;
        Long l2 = (Long) threadLocal2.get();
        long jLongValue = l2.longValue();
        try {
            j = 0;
            try {
                threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
                InterfaceC2107a.b bVarMo12540a = interfaceC2107a.mo12540a(context, str, f9853o);
                int i = bVarMo12540a.f9858a;
                int i2 = bVarMo12540a.f9859b;
                int i3 = bVarMo12540a.f9860c;
                if (i3 != 0) {
                    if (i3 != -1) {
                        if (i3 == 1 || i2 != 0) {
                            if (i3 == -1) {
                                dynamiteModuleM12533h = m12533h(applicationContext, str);
                            } else {
                                try {
                                    if (i3 == 1) {
                                        throw new LoadingException("VersionPolicy returned invalid code:" + i3, null);
                                    }
                                    try {
                                        synchronized (DynamiteModule.class) {
                                            if (m12536k(context)) {
                                                throw new LoadingException("Remote loading disabled", null);
                                            }
                                            bool = f9846h;
                                        }
                                        if (bool != null) {
                                            throw new LoadingException("Failed to determine which loading route to use.", null);
                                        }
                                        if (bool.booleanValue()) {
                                            synchronized (DynamiteModule.class) {
                                                cty0Var = f9856r;
                                            }
                                            if (cty0Var != null) {
                                                throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                            }
                                            lhy0Var2 = (lhy0) threadLocal.get();
                                            if (lhy0Var2 != null || lhy0Var2.f132161a == null) {
                                                throw new LoadingException("No result cursor", null);
                                            }
                                            Context applicationContext2 = context.getApplicationContext();
                                            Cursor cursor2 = lhy0Var2.f132161a;
                                            h950.m134038Y2(null);
                                            synchronized (DynamiteModule.class) {
                                                z = f9849k >= 2;
                                            }
                                            Context context2 = (Context) h950.m134037P2(z ? cty0Var.m112564P2(h950.m134038Y2(applicationContext2), str, i2, h950.m134038Y2(cursor2)) : cty0Var.m112563O(h950.m134038Y2(applicationContext2), str, i2, h950.m134038Y2(cursor2)));
                                            if (context2 == null) {
                                                throw new LoadingException("Failed to get module context", ooy0Var);
                                            }
                                            dynamiteModule = new DynamiteModule(context2);
                                        } else {
                                            cry0VarM12537l = m12537l(context);
                                            if (cry0VarM12537l != null) {
                                                throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                            }
                                            iZze = cry0VarM12537l.zze();
                                            if (iZze >= 3) {
                                                lhy0Var = (lhy0) threadLocal.get();
                                                if (lhy0Var != null) {
                                                    throw new LoadingException("No cached result cursor holder", null);
                                                }
                                                p1mVarM112106Y2 = cry0VarM12537l.m112105P3(h950.m134038Y2(context), str, i2, h950.m134038Y2(lhy0Var.f132161a));
                                            } else if (iZze == 2) {
                                                p1mVarM112106Y2 = cry0VarM12537l.m112107m4(h950.m134038Y2(context), str, i2);
                                            } else {
                                                p1mVarM112106Y2 = cry0VarM12537l.m112106Y2(h950.m134038Y2(context), str, i2);
                                            }
                                            objM134037P2 = h950.m134037P2(p1mVarM112106Y2);
                                            if (objM134037P2 != null) {
                                                throw new LoadingException("Failed to load remote module.", null);
                                            }
                                            dynamiteModule = new DynamiteModule((Context) objM134037P2);
                                        }
                                        dynamiteModuleM12533h = dynamiteModule;
                                    } catch (RemoteException e) {
                                        throw new LoadingException("Failed to load remote module.", e, null);
                                    } catch (LoadingException e2) {
                                        throw e2;
                                    } catch (Throwable th) {
                                        CrashUtils.addDynamiteErrorToDropBox(context, th);
                                        throw new LoadingException("Failed to load remote module.", th, null);
                                    }
                                } catch (LoadingException e3) {
                                    e3.getMessage();
                                    int i4 = bVarMo12540a.f9858a;
                                    if (i4 == 0 || interfaceC2107a.mo12540a(context, str, new C2116i(i4, 0)).f9860c != -1) {
                                        throw new LoadingException("Remote load failed. No local fallback found.", e3, null);
                                    }
                                    dynamiteModuleM12533h = m12533h(applicationContext, str);
                                }
                            }
                            if (jLongValue == 0) {
                                f9852n.remove();
                            } else {
                                f9852n.set(l2);
                            }
                            cursor = lhy0Var4.f132161a;
                            if (cursor != null) {
                                cursor.close();
                            }
                            f9851m.set(lhy0Var3);
                            return dynamiteModuleM12533h;
                        }
                    } else if (i != 0) {
                        i3 = -1;
                        if (i3 == 1) {
                        }
                        if (i3 == -1) {
                            dynamiteModuleM12533h = m12533h(applicationContext, str);
                        } else {
                            if (i3 == 1) {
                                throw new LoadingException("VersionPolicy returned invalid code:" + i3, null);
                            }
                            synchronized (DynamiteModule.class) {
                                if (m12536k(context)) {
                                    throw new LoadingException("Remote loading disabled", null);
                                }
                                bool = f9846h;
                                if (bool != null) {
                                    throw new LoadingException("Failed to determine which loading route to use.", null);
                                }
                                if (bool.booleanValue()) {
                                    synchronized (DynamiteModule.class) {
                                        cty0Var = f9856r;
                                        if (cty0Var != null) {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                        }
                                        lhy0Var2 = (lhy0) threadLocal.get();
                                        if (lhy0Var2 != null) {
                                        }
                                        throw new LoadingException("No result cursor", null);
                                    }
                                }
                                cry0VarM12537l = m12537l(context);
                                if (cry0VarM12537l != null) {
                                    throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                }
                                iZze = cry0VarM12537l.zze();
                                if (iZze >= 3) {
                                    lhy0Var = (lhy0) threadLocal.get();
                                    if (lhy0Var != null) {
                                        throw new LoadingException("No cached result cursor holder", null);
                                    }
                                    p1mVarM112106Y2 = cry0VarM12537l.m112105P3(h950.m134038Y2(context), str, i2, h950.m134038Y2(lhy0Var.f132161a));
                                } else if (iZze == 2) {
                                    p1mVarM112106Y2 = cry0VarM12537l.m112107m4(h950.m134038Y2(context), str, i2);
                                } else {
                                    p1mVarM112106Y2 = cry0VarM12537l.m112106Y2(h950.m134038Y2(context), str, i2);
                                }
                                objM134037P2 = h950.m134037P2(p1mVarM112106Y2);
                                if (objM134037P2 != null) {
                                    throw new LoadingException("Failed to load remote module.", null);
                                }
                                dynamiteModule = new DynamiteModule((Context) objM134037P2);
                                dynamiteModuleM12533h = dynamiteModule;
                            }
                        }
                        if (jLongValue == 0) {
                            f9852n.remove();
                        } else {
                            f9852n.set(l2);
                        }
                        cursor = lhy0Var4.f132161a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        f9851m.set(lhy0Var3);
                        return dynamiteModuleM12533h;
                    }
                }
                throw new LoadingException("No acceptable module " + str + " found. Local version is " + bVarMo12540a.f9858a + " and remote version is " + bVarMo12540a.f9859b + ".", null);
            } catch (Throwable th2) {
                th = th2;
                if (jLongValue == j) {
                    f9852n.remove();
                } else {
                    f9852n.set(l2);
                }
                Cursor cursor3 = lhy0Var4.f132161a;
                if (cursor3 != null) {
                    cursor3.close();
                }
                f9851m.set(lhy0Var3);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0150 A[Catch: all -> 0x00d5, TRY_LEAVE, TryCatch #9 {all -> 0x00d5, blocks: (B:3:0x0002, B:64:0x00ca, B:66:0x00d0, B:74:0x00df, B:104:0x0145, B:109:0x0150, B:125:0x017b, B:126:0x017e, B:120:0x0173, B:72:0x00db, B:128:0x0180, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:62:0x00c7, B:21:0x0049, B:45:0x00a1, B:48:0x00a4, B:55:0x00bc, B:63:0x00c9, B:61:0x00c2), top: B:137:0x0002, inners: #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x017b A[Catch: all -> 0x00d5, TryCatch #9 {all -> 0x00d5, blocks: (B:3:0x0002, B:64:0x00ca, B:66:0x00d0, B:74:0x00df, B:104:0x0145, B:109:0x0150, B:125:0x017b, B:126:0x017e, B:120:0x0173, B:72:0x00db, B:128:0x0180, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:62:0x00c7, B:21:0x0049, B:45:0x00a1, B:48:0x00a4, B:55:0x00bc, B:63:0x00c9, B:61:0x00c2), top: B:137:0x0002, inners: #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:150:? A[Catch: all -> 0x00d5, SYNTHETIC, TRY_LEAVE, TryCatch #9 {all -> 0x00d5, blocks: (B:3:0x0002, B:64:0x00ca, B:66:0x00d0, B:74:0x00df, B:104:0x0145, B:109:0x0150, B:125:0x017b, B:126:0x017e, B:120:0x0173, B:72:0x00db, B:128:0x0180, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:62:0x00c7, B:21:0x0049, B:45:0x00a1, B:48:0x00a4, B:55:0x00bc, B:63:0x00c9, B:61:0x00c2), top: B:137:0x0002, inners: #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00b0 A[Catch: all -> 0x0036, TryCatch #10 {all -> 0x0036, blocks: (B:9:0x0026, B:11:0x0032, B:52:0x00b9, B:16:0x003b, B:18:0x0042, B:20:0x0048, B:25:0x004f, B:27:0x0053, B:31:0x005d, B:33:0x0065, B:36:0x006c, B:43:0x0098, B:44:0x00a0, B:39:0x0073, B:41:0x0079, B:42:0x008a, B:47:0x00a3, B:50:0x00a6, B:51:0x00b0, B:17:0x003e), top: B:138:0x0026, inners: #12 }] */
    /* JADX INFO: renamed from: f */
    public static int m12531f(@NonNull Context context, @NonNull String str, boolean z) {
        Throwable th;
        RemoteException remoteException;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f9846h;
                Cursor cursor2 = null;
                int iM112104P2 = 0;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        m12534i(classLoader);
                                    } catch (LoadingException unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!m12536k(context)) {
                                        return 0;
                                    }
                                    if (f9848j) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iM12532g = m12532g(context, str, z, true);
                                                String str2 = f9847i;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderM205523a = w8s0.m205523a();
                                                    if (classLoaderM205523a == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            oje.m167861a();
                                                            String str3 = f9847i;
                                                            Preconditions.checkNotNull(str3);
                                                            classLoaderM205523a = nje.m163411a(str3, ClassLoader.getSystemClassLoader());
                                                        } else {
                                                            String str4 = f9847i;
                                                            Preconditions.checkNotNull(str4);
                                                            classLoaderM205523a = new o5t0(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    m12534i(classLoaderM205523a);
                                                    declaredField.set(null, classLoaderM205523a);
                                                    f9846h = bool2;
                                                    return iM12532g;
                                                }
                                                return iM12532g;
                                            } catch (LoadingException unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                f9846h = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
                        e.toString();
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return m12532g(context, str, z, false);
                    } catch (LoadingException e2) {
                        e2.getMessage();
                        return 0;
                    }
                }
                cry0 cry0VarM12537l = m12537l(context);
                if (cry0VarM12537l != null) {
                    try {
                        int iZze = cry0VarM12537l.zze();
                        if (iZze >= 3) {
                            lhy0 lhy0Var = (lhy0) f9851m.get();
                            if (lhy0Var == null || (cursor = lhy0Var.f132161a) == null) {
                                Cursor cursor3 = (Cursor) h950.m134037P2(cry0VarM12537l.m112108m5(h950.m134038Y2(context), str, z, ((Long) f9852n.get()).longValue()));
                                if (cursor3 != null) {
                                    try {
                                        if (cursor3.moveToFirst()) {
                                            int i = cursor3.getInt(0);
                                            cursor2 = (i <= 0 || !m12535j(cursor3)) ? cursor3 : null;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            iM112104P2 = i;
                                        } else if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                    } catch (RemoteException e3) {
                                        remoteException = e3;
                                        cursor2 = cursor3;
                                        try {
                                            remoteException.getMessage();
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            if (cursor2 != null) {
                                                throw th;
                                            }
                                            cursor2.close();
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        cursor2 = cursor3;
                                        if (cursor2 != null) {
                                            throw th;
                                        }
                                        cursor2.close();
                                        throw th;
                                    }
                                } else if (cursor3 != null) {
                                    cursor3.close();
                                }
                            } else {
                                iM112104P2 = cursor.getInt(0);
                            }
                        } else {
                            iM112104P2 = iZze == 2 ? cry0VarM12537l.m112104P2(h950.m134038Y2(context), str, z) : cry0VarM12537l.m112103O(h950.m134038Y2(context), str, z);
                        }
                    } catch (RemoteException e4) {
                        remoteException = e4;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                return iM112104P2;
            }
        } catch (Throwable th6) {
            CrashUtils.addDynamiteErrorToDropBox(context, th6);
            throw th6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    /* JADX WARN: Code duplicated, block: B:65:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX INFO: renamed from: g */
    public static int m12532g(Context context, String str, boolean z, boolean z2) throws Throwable {
        Throwable th;
        Exception exc;
        ?? r1 = 0;
        ?? r2 = 0;
        ?? r3 = 0;
        ?? r4 = 0;
        try {
            try {
                boolean z3 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) f9852n.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z4 = false;
                            int i = cursorQuery.getInt(0);
                            if (i > 0) {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        f9847i = cursorQuery.getString(2);
                                        int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f9849k = cursorQuery.getInt(columnIndex);
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            if (cursorQuery.getInt(columnIndex2) == 0) {
                                                z3 = false;
                                            }
                                            f9848j = z3;
                                            z4 = z3;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                if (m12535j(cursorQuery)) {
                                    cursorQuery = null;
                                }
                            }
                            if (z2 && z4) {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl", r3 == true ? 1 : 0);
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return i;
                        }
                    } catch (Exception e) {
                        exc = e;
                        if (exc instanceof LoadingException) {
                            throw exc;
                        }
                        throw new LoadingException("V2 version check failed: " + exc.getMessage(), exc, r2 == true ? 1 : 0);
                    }
                }
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.", r4 == true ? 1 : 0);
            } catch (Throwable th3) {
                th = th3;
                r1 = context;
                if (r1 != 0) {
                    throw th;
                }
                r1.close();
                throw th;
            }
        } catch (Exception e2) {
            exc = e2;
        } catch (Throwable th4) {
            th = th4;
            if (r1 != 0) {
                throw th;
            }
            r1.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public static DynamiteModule m12533h(Context context, String str) {
        "Selected local version of ".concat(String.valueOf(str));
        return new DynamiteModule(context);
    }

    /* JADX INFO: renamed from: i */
    public static void m12534i(ClassLoader classLoader) throws LoadingException {
        cty0 cty0Var;
        ooy0 ooy0Var = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                cty0Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                cty0Var = iInterfaceQueryLocalInterface instanceof cty0 ? (cty0) iInterfaceQueryLocalInterface : new cty0(iBinder);
            }
            f9856r = cty0Var;
        } catch (ClassNotFoundException e) {
            e = e;
            throw new LoadingException("Failed to instantiate dynamite loader", e, ooy0Var);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new LoadingException("Failed to instantiate dynamite loader", e, ooy0Var);
        } catch (InstantiationException e3) {
            e = e3;
            throw new LoadingException("Failed to instantiate dynamite loader", e, ooy0Var);
        } catch (NoSuchMethodException e4) {
            e = e4;
            throw new LoadingException("Failed to instantiate dynamite loader", e, ooy0Var);
        } catch (InvocationTargetException e5) {
            e = e5;
            throw new LoadingException("Failed to instantiate dynamite loader", e, ooy0Var);
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m12535j(Cursor cursor) {
        lhy0 lhy0Var = (lhy0) f9851m.get();
        if (lhy0Var == null || lhy0Var.f132161a != null) {
            return false;
        }
        lhy0Var.f132161a = cursor;
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m12536k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f9850l)) {
            return true;
        }
        boolean z = false;
        if (f9850l == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            f9850l = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & MMConstants.ERR_WATERMARK_READ) == 0) {
                f9848j = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public static cry0 m12537l(Context context) {
        cry0 cry0Var;
        synchronized (DynamiteModule.class) {
            cry0 cry0Var2 = f9855q;
            if (cry0Var2 != null) {
                return cry0Var2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    cry0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    cry0Var = iInterfaceQueryLocalInterface instanceof cry0 ? (cry0) iInterfaceQueryLocalInterface : new cry0(iBinder);
                }
                if (cry0Var != null) {
                    f9855q = cry0Var;
                    return cry0Var;
                }
            } catch (Exception e) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e.getMessage());
            }
            return null;
        }
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    /* JADX INFO: renamed from: b */
    public Context m12538b() {
        return this.f9857a;
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: d */
    public IBinder m12539d(@NonNull String str) throws LoadingException {
        try {
            return (IBinder) this.f9857a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e, null);
        }
    }

    @KeepForSdk
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, ooy0 ooy0Var) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th, ooy0 ooy0Var) {
            super(str, th);
        }
    }
}
