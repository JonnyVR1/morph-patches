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
import p149l.f8y0;
import p149l.ify0;
import p149l.iws0;
import p149l.jie;
import p149l.kie;
import p149l.qzr0;
import p149l.s050;
import p149l.uyl;
import p149l.why0;
import p149l.wjy0;
import p149l.xut0;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public final class DynamiteModule {

    /* JADX INFO: renamed from: h */
    @Nullable
    public static Boolean f9809h = null;

    /* JADX INFO: renamed from: i */
    @Nullable
    public static String f9810i = null;

    /* JADX INFO: renamed from: j */
    public static boolean f9811j = false;

    /* JADX INFO: renamed from: k */
    public static int f9812k = -1;

    /* JADX INFO: renamed from: l */
    @Nullable
    public static Boolean f9813l;

    /* JADX INFO: renamed from: q */
    @Nullable
    public static why0 f9818q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public static wjy0 f9819r;

    /* JADX INFO: renamed from: a */
    public final Context f9820a;

    /* JADX INFO: renamed from: m */
    public static final ThreadLocal f9814m = new ThreadLocal();

    /* JADX INFO: renamed from: n */
    public static final ThreadLocal f9815n = new xut0();

    /* JADX INFO: renamed from: o */
    public static final InterfaceC2084a.a f9816o = new C2085a();

    /* JADX INFO: renamed from: b */
    @NonNull
    @KeepForSdk
    public static final InterfaceC2084a f9803b = new C2086b();

    /* JADX INFO: renamed from: c */
    @NonNull
    @KeepForSdk
    public static final InterfaceC2084a f9804c = new C2087c();

    /* JADX INFO: renamed from: d */
    @NonNull
    @KeepForSdk
    public static final InterfaceC2084a f9805d = new C2088d();

    /* JADX INFO: renamed from: e */
    @NonNull
    @KeepForSdk
    public static final InterfaceC2084a f9806e = new C2089e();

    /* JADX INFO: renamed from: f */
    @NonNull
    @KeepForSdk
    public static final InterfaceC2084a f9807f = new C2090f();

    /* JADX INFO: renamed from: g */
    @NonNull
    @KeepForSdk
    public static final InterfaceC2084a f9808g = new C2091g();

    /* JADX INFO: renamed from: p */
    @NonNull
    public static final InterfaceC2084a f9817p = new C2092h();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @Nullable
        public static ClassLoader sClassLoader;
    }

    /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    public interface InterfaceC2084a {

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a */
        @KeepForSdk
        public interface a {
            /* JADX INFO: renamed from: a */
            int mo12487a(@NonNull Context context, @NonNull String str, boolean z) throws LoadingException;

            /* JADX INFO: renamed from: b */
            int mo12488b(@NonNull Context context, @NonNull String str);
        }

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$a$b */
        @KeepForSdk
        public static class b {

            /* JADX INFO: renamed from: a */
            @KeepForSdk
            public int f9821a = 0;

            /* JADX INFO: renamed from: b */
            @KeepForSdk
            public int f9822b = 0;

            /* JADX INFO: renamed from: c */
            @KeepForSdk
            public int f9823c = 0;
        }

        @NonNull
        @KeepForSdk
        /* JADX INFO: renamed from: a */
        b mo12486a(@NonNull Context context, @NonNull String str, @NonNull a aVar) throws LoadingException;
    }

    public DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.f9820a = context;
    }

    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public static int m12474a(@NonNull Context context, @NonNull String str) {
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
    public static int m12475c(@NonNull Context context, @NonNull String str) {
        return m12477f(context, str, false);
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
    public static DynamiteModule m12476e(@NonNull Context context, @NonNull InterfaceC2084a interfaceC2084a, @NonNull String str) throws Throwable {
        long j;
        DynamiteModule dynamiteModuleM12479h;
        Boolean bool;
        why0 why0VarM12483l;
        int iZze;
        uyl uylVarM203262Y2;
        Object objM181847P2;
        DynamiteModule dynamiteModule;
        f8y0 f8y0Var;
        wjy0 wjy0Var;
        f8y0 f8y0Var2;
        boolean z;
        Cursor cursor;
        Context applicationContext = context.getApplicationContext();
        ify0 ify0Var = null;
        if (applicationContext == null) {
            throw new LoadingException("null application Context", null);
        }
        ThreadLocal threadLocal = f9814m;
        f8y0 f8y0Var3 = (f8y0) threadLocal.get();
        f8y0 f8y0Var4 = new f8y0(null);
        threadLocal.set(f8y0Var4);
        ThreadLocal threadLocal2 = f9815n;
        Long l2 = (Long) threadLocal2.get();
        long jLongValue = l2.longValue();
        try {
            j = 0;
            try {
                threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
                InterfaceC2084a.b bVarMo12486a = interfaceC2084a.mo12486a(context, str, f9816o);
                int i = bVarMo12486a.f9821a;
                int i2 = bVarMo12486a.f9822b;
                int i3 = bVarMo12486a.f9823c;
                if (i3 != 0) {
                    if (i3 != -1) {
                        if (i3 == 1 || i2 != 0) {
                            if (i3 == -1) {
                                dynamiteModuleM12479h = m12479h(applicationContext, str);
                            } else {
                                try {
                                    if (i3 == 1) {
                                        throw new LoadingException("VersionPolicy returned invalid code:" + i3, null);
                                    }
                                    try {
                                        synchronized (DynamiteModule.class) {
                                            if (m12482k(context)) {
                                                throw new LoadingException("Remote loading disabled", null);
                                            }
                                            bool = f9809h;
                                        }
                                        if (bool != null) {
                                            throw new LoadingException("Failed to determine which loading route to use.", null);
                                        }
                                        if (bool.booleanValue()) {
                                            synchronized (DynamiteModule.class) {
                                                wjy0Var = f9819r;
                                            }
                                            if (wjy0Var != null) {
                                                throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                            }
                                            f8y0Var2 = (f8y0) threadLocal.get();
                                            if (f8y0Var2 != null || f8y0Var2.f96435a == null) {
                                                throw new LoadingException("No result cursor", null);
                                            }
                                            Context applicationContext2 = context.getApplicationContext();
                                            Cursor cursor2 = f8y0Var2.f96435a;
                                            s050.m181848Y2(null);
                                            synchronized (DynamiteModule.class) {
                                                z = f9812k >= 2;
                                            }
                                            Context context2 = (Context) s050.m181847P2(z ? wjy0Var.m203582P2(s050.m181848Y2(applicationContext2), str, i2, s050.m181848Y2(cursor2)) : wjy0Var.m203581O(s050.m181848Y2(applicationContext2), str, i2, s050.m181848Y2(cursor2)));
                                            if (context2 == null) {
                                                throw new LoadingException("Failed to get module context", ify0Var);
                                            }
                                            dynamiteModule = new DynamiteModule(context2);
                                        } else {
                                            why0VarM12483l = m12483l(context);
                                            if (why0VarM12483l != null) {
                                                throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                            }
                                            iZze = why0VarM12483l.zze();
                                            if (iZze >= 3) {
                                                f8y0Var = (f8y0) threadLocal.get();
                                                if (f8y0Var != null) {
                                                    throw new LoadingException("No cached result cursor holder", null);
                                                }
                                                uylVarM203262Y2 = why0VarM12483l.m203261P3(s050.m181848Y2(context), str, i2, s050.m181848Y2(f8y0Var.f96435a));
                                            } else if (iZze == 2) {
                                                uylVarM203262Y2 = why0VarM12483l.m203263m4(s050.m181848Y2(context), str, i2);
                                            } else {
                                                uylVarM203262Y2 = why0VarM12483l.m203262Y2(s050.m181848Y2(context), str, i2);
                                            }
                                            objM181847P2 = s050.m181847P2(uylVarM203262Y2);
                                            if (objM181847P2 != null) {
                                                throw new LoadingException("Failed to load remote module.", null);
                                            }
                                            dynamiteModule = new DynamiteModule((Context) objM181847P2);
                                        }
                                        dynamiteModuleM12479h = dynamiteModule;
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
                                    int i4 = bVarMo12486a.f9821a;
                                    if (i4 == 0 || interfaceC2084a.mo12486a(context, str, new C2093i(i4, 0)).f9823c != -1) {
                                        throw new LoadingException("Remote load failed. No local fallback found.", e3, null);
                                    }
                                    dynamiteModuleM12479h = m12479h(applicationContext, str);
                                }
                            }
                            if (jLongValue == 0) {
                                f9815n.remove();
                            } else {
                                f9815n.set(l2);
                            }
                            cursor = f8y0Var4.f96435a;
                            if (cursor != null) {
                                cursor.close();
                            }
                            f9814m.set(f8y0Var3);
                            return dynamiteModuleM12479h;
                        }
                    } else if (i != 0) {
                        i3 = -1;
                        if (i3 == 1) {
                        }
                        if (i3 == -1) {
                            dynamiteModuleM12479h = m12479h(applicationContext, str);
                        } else {
                            if (i3 == 1) {
                                throw new LoadingException("VersionPolicy returned invalid code:" + i3, null);
                            }
                            synchronized (DynamiteModule.class) {
                                if (m12482k(context)) {
                                    throw new LoadingException("Remote loading disabled", null);
                                }
                                bool = f9809h;
                                if (bool != null) {
                                    throw new LoadingException("Failed to determine which loading route to use.", null);
                                }
                                if (bool.booleanValue()) {
                                    synchronized (DynamiteModule.class) {
                                        wjy0Var = f9819r;
                                        if (wjy0Var != null) {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                        }
                                        f8y0Var2 = (f8y0) threadLocal.get();
                                        if (f8y0Var2 != null) {
                                        }
                                        throw new LoadingException("No result cursor", null);
                                    }
                                }
                                why0VarM12483l = m12483l(context);
                                if (why0VarM12483l != null) {
                                    throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                }
                                iZze = why0VarM12483l.zze();
                                if (iZze >= 3) {
                                    f8y0Var = (f8y0) threadLocal.get();
                                    if (f8y0Var != null) {
                                        throw new LoadingException("No cached result cursor holder", null);
                                    }
                                    uylVarM203262Y2 = why0VarM12483l.m203261P3(s050.m181848Y2(context), str, i2, s050.m181848Y2(f8y0Var.f96435a));
                                } else if (iZze == 2) {
                                    uylVarM203262Y2 = why0VarM12483l.m203263m4(s050.m181848Y2(context), str, i2);
                                } else {
                                    uylVarM203262Y2 = why0VarM12483l.m203262Y2(s050.m181848Y2(context), str, i2);
                                }
                                objM181847P2 = s050.m181847P2(uylVarM203262Y2);
                                if (objM181847P2 != null) {
                                    throw new LoadingException("Failed to load remote module.", null);
                                }
                                dynamiteModule = new DynamiteModule((Context) objM181847P2);
                                dynamiteModuleM12479h = dynamiteModule;
                            }
                        }
                        if (jLongValue == 0) {
                            f9815n.remove();
                        } else {
                            f9815n.set(l2);
                        }
                        cursor = f8y0Var4.f96435a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        f9814m.set(f8y0Var3);
                        return dynamiteModuleM12479h;
                    }
                }
                throw new LoadingException("No acceptable module " + str + " found. Local version is " + bVarMo12486a.f9821a + " and remote version is " + bVarMo12486a.f9822b + ".", null);
            } catch (Throwable th2) {
                th = th2;
                if (jLongValue == j) {
                    f9815n.remove();
                } else {
                    f9815n.set(l2);
                }
                Cursor cursor3 = f8y0Var4.f96435a;
                if (cursor3 != null) {
                    cursor3.close();
                }
                f9814m.set(f8y0Var3);
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
    public static int m12477f(@NonNull Context context, @NonNull String str, boolean z) {
        Throwable th;
        RemoteException remoteException;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f9809h;
                Cursor cursor2 = null;
                int iM203260P2 = 0;
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
                                        m12480i(classLoader);
                                    } catch (LoadingException unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!m12482k(context)) {
                                        return 0;
                                    }
                                    if (f9811j) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iM12478g = m12478g(context, str, z, true);
                                                String str2 = f9810i;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderM177278a = qzr0.m177278a();
                                                    if (classLoaderM177278a == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            kie.m146075a();
                                                            String str3 = f9810i;
                                                            Preconditions.checkNotNull(str3);
                                                            classLoaderM177278a = jie.m141650a(str3, ClassLoader.getSystemClassLoader());
                                                        } else {
                                                            String str4 = f9810i;
                                                            Preconditions.checkNotNull(str4);
                                                            classLoaderM177278a = new iws0(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    m12480i(classLoaderM177278a);
                                                    declaredField.set(null, classLoaderM177278a);
                                                    f9809h = bool2;
                                                    return iM12478g;
                                                }
                                                return iM12478g;
                                            } catch (LoadingException unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                f9809h = bool;
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
                        return m12478g(context, str, z, false);
                    } catch (LoadingException e2) {
                        e2.getMessage();
                        return 0;
                    }
                }
                why0 why0VarM12483l = m12483l(context);
                if (why0VarM12483l != null) {
                    try {
                        int iZze = why0VarM12483l.zze();
                        if (iZze >= 3) {
                            f8y0 f8y0Var = (f8y0) f9814m.get();
                            if (f8y0Var == null || (cursor = f8y0Var.f96435a) == null) {
                                Cursor cursor3 = (Cursor) s050.m181847P2(why0VarM12483l.m203264m5(s050.m181848Y2(context), str, z, ((Long) f9815n.get()).longValue()));
                                if (cursor3 != null) {
                                    try {
                                        if (cursor3.moveToFirst()) {
                                            int i = cursor3.getInt(0);
                                            cursor2 = (i <= 0 || !m12481j(cursor3)) ? cursor3 : null;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            iM203260P2 = i;
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
                                iM203260P2 = cursor.getInt(0);
                            }
                        } else {
                            iM203260P2 = iZze == 2 ? why0VarM12483l.m203260P2(s050.m181848Y2(context), str, z) : why0VarM12483l.m203259O(s050.m181848Y2(context), str, z);
                        }
                    } catch (RemoteException e4) {
                        remoteException = e4;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                return iM203260P2;
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
    public static int m12478g(Context context, String str, boolean z, boolean z2) throws Throwable {
        Throwable th;
        Exception exc;
        ?? r1 = 0;
        ?? r2 = 0;
        ?? r3 = 0;
        ?? r4 = 0;
        try {
            try {
                boolean z3 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) f9815n.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z4 = false;
                            int i = cursorQuery.getInt(0);
                            if (i > 0) {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        f9810i = cursorQuery.getString(2);
                                        int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f9812k = cursorQuery.getInt(columnIndex);
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            if (cursorQuery.getInt(columnIndex2) == 0) {
                                                z3 = false;
                                            }
                                            f9811j = z3;
                                            z4 = z3;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                if (m12481j(cursorQuery)) {
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
    public static DynamiteModule m12479h(Context context, String str) {
        "Selected local version of ".concat(String.valueOf(str));
        return new DynamiteModule(context);
    }

    /* JADX INFO: renamed from: i */
    public static void m12480i(ClassLoader classLoader) throws LoadingException {
        wjy0 wjy0Var;
        ify0 ify0Var = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                wjy0Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                wjy0Var = iInterfaceQueryLocalInterface instanceof wjy0 ? (wjy0) iInterfaceQueryLocalInterface : new wjy0(iBinder);
            }
            f9819r = wjy0Var;
        } catch (ClassNotFoundException e) {
            e = e;
            throw new LoadingException("Failed to instantiate dynamite loader", e, ify0Var);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new LoadingException("Failed to instantiate dynamite loader", e, ify0Var);
        } catch (InstantiationException e3) {
            e = e3;
            throw new LoadingException("Failed to instantiate dynamite loader", e, ify0Var);
        } catch (NoSuchMethodException e4) {
            e = e4;
            throw new LoadingException("Failed to instantiate dynamite loader", e, ify0Var);
        } catch (InvocationTargetException e5) {
            e = e5;
            throw new LoadingException("Failed to instantiate dynamite loader", e, ify0Var);
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m12481j(Cursor cursor) {
        f8y0 f8y0Var = (f8y0) f9814m.get();
        if (f8y0Var == null || f8y0Var.f96435a != null) {
            return false;
        }
        f8y0Var.f96435a = cursor;
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m12482k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f9813l)) {
            return true;
        }
        boolean z = false;
        if (f9813l == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            f9813l = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & MMConstants.ERR_WATERMARK_READ) == 0) {
                f9811j = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public static why0 m12483l(Context context) {
        why0 why0Var;
        synchronized (DynamiteModule.class) {
            why0 why0Var2 = f9818q;
            if (why0Var2 != null) {
                return why0Var2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    why0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    why0Var = iInterfaceQueryLocalInterface instanceof why0 ? (why0) iInterfaceQueryLocalInterface : new why0(iBinder);
                }
                if (why0Var != null) {
                    f9818q = why0Var;
                    return why0Var;
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
    public Context m12484b() {
        return this.f9820a;
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: d */
    public IBinder m12485d(@NonNull String str) throws LoadingException {
        try {
            return (IBinder) this.f9820a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e, null);
        }
    }

    @KeepForSdk
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, ify0 ify0Var) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th, ify0 ify0Var) {
            super(str, th);
        }
    }
}
