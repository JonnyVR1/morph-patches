package p149l;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzon;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.data.LinkAction;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
public final class bey0 extends gqx0 {

    /* JADX INFO: renamed from: i */
    public static final String[] f75257i = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: j */
    public static final String[] f75258j = {"_err"};

    /* JADX INFO: renamed from: c */
    public SecureRandom f75259c;

    /* JADX INFO: renamed from: d */
    public final AtomicLong f75260d;

    /* JADX INFO: renamed from: e */
    public int f75261e;

    /* JADX INFO: renamed from: f */
    public MeasurementManagerFutures f75262f;

    /* JADX INFO: renamed from: g */
    public Boolean f75263g;

    /* JADX INFO: renamed from: h */
    public Integer f75264h;

    public bey0(ujx0 ujx0Var) {
        super(ujx0Var);
        this.f75264h = null;
        this.f75260d = new AtomicLong(0L);
    }

    /* JADX INFO: renamed from: A */
    public static Bundle m101422A(List<zzon> list) {
        Bundle bundle = new Bundle();
        if (list != null) {
            for (zzon zzonVar : list) {
                String str = zzonVar.zzd;
                if (str != null) {
                    bundle.putString(zzonVar.zza, str);
                } else {
                    Long l2 = zzonVar.zzc;
                    if (l2 != null) {
                        bundle.putLong(zzonVar.zza, l2.longValue());
                    } else {
                        Double d = zzonVar.zzf;
                        if (d != null) {
                            bundle.putDouble(zzonVar.zza, d.doubleValue());
                        }
                    }
                }
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: A0 */
    public static boolean m101423A0(String str, String str2) {
        return str.equals("*") || Arrays.asList(str.split(Constants.SEPARATOR_COMMA)).contains(str2);
    }

    /* JADX INFO: renamed from: B0 */
    public static boolean m101424B0(String str) {
        return m101423A0(q8s0.f153219B0.m188827a(null), str);
    }

    /* JADX INFO: renamed from: D */
    public static String m101425D(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return str.substring(0, str.offsetByCodePoints(0, i)).concat("...");
        }
        return null;
    }

    /* JADX INFO: renamed from: D0 */
    public static boolean m101426D0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* JADX INFO: renamed from: E0 */
    public static boolean m101427E0(String str) {
        Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* JADX INFO: renamed from: F */
    public static void m101428F(Bundle bundle, int i, String str, Object obj) {
        if (m101446p0(bundle, i)) {
            bundle.putString("_ev", m101425D(str, 40, true));
            if (obj != null) {
                Preconditions.checkNotNull(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    /* JADX INFO: renamed from: G0 */
    public static boolean m101429G0(String str) {
        for (String str2 : f75258j) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: J0 */
    public static int m101430J0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return "_lgclid".equals(str) ? 100 : 36;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: M0 */
    private static boolean m101431M0(String str) {
        Preconditions.checkNotNull(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* JADX INFO: renamed from: P0 */
    public static MessageDigest m101432P0() {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    @WorkerThread
    /* JADX INFO: renamed from: S */
    public static void m101433S(q1y0 q1y0Var, Bundle bundle, boolean z) {
        if (bundle == null || q1y0Var == null || (bundle.containsKey("_sc") && !z)) {
            if (bundle != null && q1y0Var == null && z) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = q1y0Var.f152178a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = q1y0Var.f152179b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", q1y0Var.f152180c);
    }

    /* JADX INFO: renamed from: T */
    public static void m101434T(ydy0 ydy0Var, int i, String str, String str2, int i2) {
        m101436U(ydy0Var, null, i, str, str2, i2);
    }

    @TargetApi(30)
    @WorkerThread
    /* JADX INFO: renamed from: T0 */
    private final boolean m101435T0() {
        Integer num;
        if (this.f75263g == null) {
            MeasurementManagerFutures measurementManagerFuturesM101472N0 = m101472N0();
            boolean z = false;
            if (measurementManagerFuturesM101472N0 == null) {
                return false;
            }
            Integer num2 = null;
            try {
                num = measurementManagerFuturesM101472N0.mo3206b().get(10000L, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z = true;
                        }
                    } catch (InterruptedException e) {
                        e = e;
                        num2 = num;
                        zzj().m211417F().m123937b("Measurement manager api exception", e);
                        this.f75263g = Boolean.FALSE;
                        num = num2;
                    } catch (CancellationException e2) {
                        e = e2;
                        num2 = num;
                        zzj().m211417F().m123937b("Measurement manager api exception", e);
                        this.f75263g = Boolean.FALSE;
                        num = num2;
                    } catch (ExecutionException e3) {
                        e = e3;
                        num2 = num;
                        zzj().m211417F().m123937b("Measurement manager api exception", e);
                        this.f75263g = Boolean.FALSE;
                        num = num2;
                    } catch (TimeoutException e4) {
                        e = e4;
                        num2 = num;
                        zzj().m211417F().m123937b("Measurement manager api exception", e);
                        this.f75263g = Boolean.FALSE;
                        num = num2;
                    }
                }
                this.f75263g = Boolean.valueOf(z);
            } catch (InterruptedException e5) {
                e = e5;
            } catch (CancellationException e6) {
                e = e6;
            } catch (ExecutionException e7) {
                e = e7;
            } catch (TimeoutException e8) {
                e = e8;
            }
            zzj().m211416E().m123937b("Measurement manager api status result", num);
        }
        return this.f75263g.booleanValue();
    }

    /* JADX INFO: renamed from: U */
    public static void m101436U(ydy0 ydy0Var, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m101446p0(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        ydy0Var.zza(str, "_err", bundle);
    }

    /* JADX INFO: renamed from: X */
    public static boolean m101437X(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.checkNotNull(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m101438Y(Context context, boolean z) {
        Preconditions.checkNotNull(context);
        return m101452v0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    /* JADX INFO: renamed from: Z */
    public static boolean m101439Z(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m101440a0(Bundle bundle, int i) {
        int i2 = 0;
        if (bundle.size() <= i) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i2++;
            if (i2 > i) {
                bundle.remove(str);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m101441b0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* JADX INFO: renamed from: g0 */
    public static boolean m101442g0(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            Preconditions.checkNotNull(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                return !TextUtils.isEmpty(str4);
            }
            return !str3.equals(str4);
        }
        if (zIsEmpty || !zIsEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    /* JADX INFO: renamed from: h0 */
    public static boolean m101443h0(String str, String[] strArr) {
        Preconditions.checkNotNull(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k0 */
    public static byte[] m101444k0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static ArrayList<Bundle> m101445n0(List<zzae> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (zzae zzaeVar : list) {
            Bundle bundle = new Bundle();
            bundle.putString(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, zzaeVar.zza);
            bundle.putString("origin", zzaeVar.zzb);
            bundle.putLong("creation_timestamp", zzaeVar.zzd);
            bundle.putString(AuthenticationTokenClaims.JSON_KEY_NAME, zzaeVar.zzc.zza);
            pqx0.m170939b(bundle, Preconditions.checkNotNull(zzaeVar.zzc.m15359F()));
            bundle.putBoolean(Active.TYPE, zzaeVar.zze);
            String str = zzaeVar.zzf;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzbf zzbfVar = zzaeVar.zzg;
            if (zzbfVar != null) {
                bundle.putString("timed_out_event_name", zzbfVar.zza);
                zzbe zzbeVar = zzbfVar.zzb;
                if (zzbeVar != null) {
                    bundle.putBundle("timed_out_event_params", zzbeVar.m15324F());
                }
            }
            bundle.putLong("trigger_timeout", zzaeVar.zzh);
            zzbf zzbfVar2 = zzaeVar.zzi;
            if (zzbfVar2 != null) {
                bundle.putString("triggered_event_name", zzbfVar2.zza);
                zzbe zzbeVar2 = zzbfVar2.zzb;
                if (zzbeVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzbeVar2.m15324F());
                }
            }
            bundle.putLong("triggered_timestamp", zzaeVar.zzc.zzb);
            bundle.putLong("time_to_live", zzaeVar.zzj);
            zzbf zzbfVar3 = zzaeVar.zzk;
            if (zzbfVar3 != null) {
                bundle.putString("expired_event_name", zzbfVar3.zza);
                zzbe zzbeVar3 = zzbfVar3.zzb;
                if (zzbeVar3 != null) {
                    bundle.putBundle("expired_event_params", zzbeVar3.m15324F());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p0 */
    public static boolean m101446p0(Bundle bundle, int i) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    /* JADX INFO: renamed from: r0 */
    public static Bundle[] m101447r0(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        }
        if (!(obj instanceof ArrayList)) {
            return null;
        }
        ArrayList arrayList = (ArrayList) obj;
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX INFO: renamed from: s */
    public static long m101448s(long j, long j2) {
        return (j + (j2 * Constants.ONE_MIN_IN_MILLIS)) / 86400000;
    }

    /* JADX INFO: renamed from: s0 */
    public static int m101449s0() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(PlaybackException.CUSTOM_ERROR_CODE_BASE);
    }

    /* JADX INFO: renamed from: u */
    public static long m101450u(zzbe zzbeVar) {
        long length = 0;
        if (zzbeVar == null) {
            return 0L;
        }
        Iterator<String> it = zzbeVar.iterator();
        while (it.hasNext()) {
            Object objM15326I = zzbeVar.m15326I(it.next());
            if (objM15326I instanceof Parcelable[]) {
                length += (long) ((Parcelable[]) objM15326I).length;
            }
        }
        return length;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: v */
    public static long m101451v(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int i = 0;
        Preconditions.checkState(bArr.length > 0);
        long j = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j += (((long) bArr[length]) & 255) << i;
            i += 8;
        }
        return j;
    }

    /* JADX INFO: renamed from: v0 */
    public static boolean m101452v0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: x */
    public static Bundle m101453x(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: x0 */
    public static boolean m101454x0(String str) {
        return m101423A0(q8s0.f153281e0.m188827a(null), str);
    }

    /* JADX INFO: renamed from: B */
    public final zzbf m101455B(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (m101495p(str2) != 0) {
            zzj().m211412A().m123937b("Invalid conditional property event name", mo15087c().m175779g(str2));
            x9g0.m207497a();
            return null;
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle bundleM101506z = m101506z(str, str2, bundle2, CollectionUtils.listOf("_o"), true);
        if (z) {
            bundleM101506z = m101504y(bundleM101506z, str);
        }
        Preconditions.checkNotNull(bundleM101506z);
        return new zzbf(str2, new zzbe(bundleM101506z), str3, j);
    }

    /* JADX INFO: renamed from: C */
    public final Object m101456C(int i, Object obj, boolean z, boolean z2, String str) {
        Bundle bundleM101504y;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return m101425D(String.valueOf(obj), i, z);
        }
        if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if ((parcelable instanceof Bundle) && (bundleM101504y = m101504y((Bundle) parcelable, null)) != null && !bundleM101504y.isEmpty()) {
                arrayList.add(bundleM101504y);
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    @EnsuresNonNull({"this.apkVersion"})
    /* JADX INFO: renamed from: C0 */
    public final int m101457C0() {
        if (this.f75264h == null) {
            this.f75264h = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(zza()) / 1000);
        }
        return this.f75264h.intValue();
    }

    /* JADX INFO: renamed from: E */
    public final URL m101458E(long j, String str, String str2, long j2, String str3) {
        try {
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str);
            String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", Long.valueOf(j), Integer.valueOf(m101457C0())), str2, str, Long.valueOf(j2));
            if (str.equals(mo15085a().m192636M())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    strConcat = strConcat.concat("&");
                }
                strConcat = strConcat.concat(str3);
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException e) {
            e = e;
            zzj().m211412A().m123937b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e2) {
            e = e2;
            zzj().m211412A().m123937b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final boolean m101459F0(String str) {
        List<ResolveInfo> listQueryIntentActivities;
        return (TextUtils.isEmpty(str) || (listQueryIntentActivities = zza().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0)) == null || listQueryIntentActivities.isEmpty()) ? false : true;
    }

    @WorkerThread
    /* JADX INFO: renamed from: G */
    public final void m101460G(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            zzj().m211417F().m123937b("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong("_et", j + j2);
    }

    /* JADX INFO: renamed from: H */
    public final void m101461H(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                mo15089e().m101463I(bundle, str, bundle2.get(str));
            }
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final int m101462H0(String str) {
        if (!m101497q0("event param", str)) {
            return 3;
        }
        if (m101488i0("event param", null, str)) {
            return !m101484d0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    /* JADX INFO: renamed from: I */
    public final void m101463I(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            zzj().m211418G().m123938c("Not putting event parameter. Invalid value type. name, type", mo15087c().m175778f(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final int m101464I0(String str) {
        if (!m101503w0("event param", str)) {
            return 3;
        }
        if (m101488i0("event param", null, str)) {
            return !m101484d0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    /* JADX INFO: renamed from: J */
    public final void m101465J(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z) {
        int iM101464I0;
        int iM101498r;
        if (bundle == null) {
            return;
        }
        int i = mo15085a().mo15089e().m101482W(231100000, true) ? 35 : 0;
        int i2 = 0;
        for (String str4 : new TreeSet(bundle.keySet())) {
            if (list == 0 || !list.contains(str4)) {
                iM101464I0 = !z ? m101464I0(str4) : 0;
                if (iM101464I0 == 0) {
                    iM101464I0 = m101462H0(str4);
                }
            } else {
                iM101464I0 = 0;
            }
            if (iM101464I0 != 0) {
                m101428F(bundle, iM101464I0, str4, iM101464I0 == 3 ? str4 : null);
                bundle.remove(str4);
            } else {
                if (m101441b0(bundle.get(str4))) {
                    zzj().m211418G().m123939d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str4);
                    iM101498r = 22;
                } else {
                    iM101498r = m101498r(str, str2, str4, bundle.get(str4), bundle, list, z, false);
                }
                if (iM101498r != 0 && !"_ev".equals(str4)) {
                    m101428F(bundle, iM101498r, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (m101427E0(str4) && !m101443h0(str4, jrx0.f119454d)) {
                    i2++;
                    if (!m101482W(231100000, true)) {
                        zzj().m211413B().m123938c("Item array not supported on client's version of Google Play Services (Android Only)", mo15087c().m175776c(str2), mo15087c().m175774a(bundle));
                        m101446p0(bundle, 23);
                        bundle.remove(str4);
                    } else if (i2 > i) {
                        zzj().m211413B().m123938c("Item can't contain more than " + i + " item-scoped custom params", mo15087c().m175776c(str2), mo15087c().m175774a(bundle));
                        m101446p0(bundle, 28);
                        bundle.remove(str4);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m101466K(qdu0 qdu0Var, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            qdu0Var.zza(bundle);
        } catch (RemoteException e) {
            this.f165891a.zzj().m211417F().m123937b("Error returning int value to wrapper", e);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: K0 */
    public final long m101467K0() {
        long j;
        mo15092h();
        if (!m101454x0(this.f165891a.m194130w().m15106z())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j = 8;
        } else {
            j = m101449s0() < q8s0.f153264Y.m188827a(null).intValue() ? 16L : 0L;
        }
        if (!m101507z0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j |= 2;
        }
        if (j == 0 && !m101435T0()) {
            j |= 64;
        }
        if (j == 0) {
            return 1L;
        }
        return j;
    }

    /* JADX INFO: renamed from: L */
    public final void m101468L(qdu0 qdu0Var, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            qdu0Var.zza(bundle);
        } catch (RemoteException e) {
            this.f165891a.zzj().m211417F().m123937b("Error returning long value to wrapper", e);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final long m101469L0() {
        long andIncrement;
        long j;
        long j2 = this.f75260d.get();
        AtomicLong atomicLong = this.f75260d;
        if (j2 != 0) {
            synchronized (atomicLong) {
                this.f75260d.compareAndSet(-1L, 1L);
                andIncrement = this.f75260d.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNextLong = new Random(System.nanoTime() ^ zzb().currentTimeMillis()).nextLong();
            int i = this.f75261e + 1;
            this.f75261e = i;
            j = jNextLong + ((long) i);
        }
        return j;
    }

    /* JADX INFO: renamed from: M */
    public final void m101470M(qdu0 qdu0Var, Bundle bundle) {
        try {
            qdu0Var.zza(bundle);
        } catch (RemoteException e) {
            this.f165891a.zzj().m211417F().m123937b("Error returning bundle value to wrapper", e);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m101471N(qdu0 qdu0Var, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            qdu0Var.zza(bundle);
        } catch (RemoteException e) {
            this.f165891a.zzj().m211417F().m123937b("Error returning string value to wrapper", e);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final MeasurementManagerFutures m101472N0() {
        if (this.f75262f == null) {
            this.f75262f = MeasurementManagerFutures.m3205a(zza());
        }
        return this.f75262f;
    }

    /* JADX INFO: renamed from: O */
    public final void m101473O(qdu0 qdu0Var, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            qdu0Var.zza(bundle);
        } catch (RemoteException e) {
            this.f165891a.zzj().m211417F().m123937b("Error returning bundle list to wrapper", e);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final String m101474O0() {
        byte[] bArr = new byte[16];
        m101477Q0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* JADX INFO: renamed from: P */
    public final void m101475P(qdu0 qdu0Var, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            qdu0Var.zza(bundle);
        } catch (RemoteException e) {
            this.f165891a.zzj().m211417F().m123937b("Error returning boolean value to wrapper", e);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m101476Q(qdu0 qdu0Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            qdu0Var.zza(bundle);
        } catch (RemoteException e) {
            this.f165891a.zzj().m211417F().m123937b("Error returning byte array to wrapper", e);
        }
    }

    @EnsuresNonNull({"this.secureRandom"})
    @WorkerThread
    /* JADX INFO: renamed from: Q0 */
    public final SecureRandom m101477Q0() {
        mo15092h();
        if (this.f75259c == null) {
            this.f75259c = new SecureRandom();
        }
        return this.f75259c;
    }

    /* JADX INFO: renamed from: R */
    public final void m101478R(n1x0 n1x0Var, int i) {
        int i2 = 0;
        for (String str : new TreeSet(n1x0Var.f136734d.keySet())) {
            if (m101427E0(str) && (i2 = i2 + 1) > i) {
                zzj().m211413B().m123938c("Event can't contain more than " + i + " params", mo15087c().m175776c(n1x0Var.f136731a), mo15087c().m175774a(n1x0Var.f136734d));
                m101446p0(n1x0Var.f136734d, 5);
                n1x0Var.f136734d.remove(str);
            }
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: R0 */
    public final boolean m101479R0() {
        mo15092h();
        return m101467K0() == 1;
    }

    /* JADX INFO: renamed from: S0 */
    public final boolean m101480S0() {
        try {
            zza().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m101481V(Parcelable[] parcelableArr, int i) {
        Preconditions.checkNotNull(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i2 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (m101427E0(str) && !m101443h0(str, jrx0.f119454d) && (i2 = i2 + 1) > i) {
                    zzj().m211413B().m123938c("Param can't contain more than " + i + " item-scoped custom parameters", mo15087c().m175778f(str), mo15087c().m175774a(bundle));
                    m101446p0(bundle, 28);
                    bundle.remove(str);
                }
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final boolean m101482W(int i, boolean z) {
        Boolean boolM100146Q = this.f165891a.m194104E().m100146Q();
        if (m101457C0() < i / 1000) {
            return (boolM100146Q == null || boolM100146Q.booleanValue()) ? false : true;
        }
        return true;
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ u9r0 mo15085a() {
        return super.mo15085a();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ iyr0 mo15086b() {
        return super.mo15086b();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ qow0 mo15087c() {
        return super.mo15087c();
    }

    @SuppressLint({"ApplySharedPref"})
    /* JADX INFO: renamed from: c0 */
    public final boolean m101483c0(String str, double d) {
        try {
            SharedPreferences.Editor editorEdit = zza().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            editorEdit.putString(LinkAction.deeplink, str);
            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(d));
            return editorEdit.commit();
        } catch (RuntimeException e) {
            zzj().m211412A().m123937b("Failed to persist Deferred Deep Link. exception", e);
            return false;
        }
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ u9x0 mo15088d() {
        return super.mo15088d();
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m101484d0(String str, int i, String str2) {
        if (str2 == null) {
            zzj().m211413B().m123937b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        zzj().m211413B().m123939d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ bey0 mo15089e() {
        return super.mo15089e();
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m101485e0(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (m101431M0(str)) {
                return true;
            }
            if (this.f165891a.m194120m()) {
                zzj().m211413B().m123937b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", xww0.m211405p(str));
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.f165891a.m194120m()) {
                zzj().m211413B().m123936a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (m101431M0(str2)) {
            return true;
        }
        zzj().m211413B().m123937b("Invalid admob_app_id. Analytics disabled.", xww0.m211405p(str2));
        return false;
    }

    @Override // p149l.spx0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo15090f() {
        super.mo15090f();
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m101486f0(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String strValueOf = String.valueOf(obj);
            if (strValueOf.codePointCount(0, strValueOf.length()) > i) {
                zzj().m211418G().m123939d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(strValueOf.length()));
                return false;
            }
        }
        return true;
    }

    @Override // p149l.spx0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ void mo15091g() {
        super.mo15091g();
    }

    @Override // p149l.spx0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo15092h() {
        super.mo15092h();
    }

    @Override // p149l.gqx0
    @WorkerThread
    /* JADX INFO: renamed from: i */
    public final void mo101487i() {
        mo15092h();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                zzj().m211417F().m123936a("Utils falling back to Random for random id");
            }
        }
        this.f75260d.set(jNextLong);
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m101488i0(String str, String[] strArr, String str2) {
        return m101489j0(str, strArr, null, str2);
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m101489j0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            zzj().m211413B().m123937b("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.checkNotNull(str2);
        for (String str3 : f75257i) {
            if (str2.startsWith(str3)) {
                zzj().m211413B().m123938c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !m101443h0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && m101443h0(str2, strArr2)) {
            return true;
        }
        zzj().m211413B().m123938c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* JADX INFO: renamed from: l0 */
    public final int m101490l0(String str) {
        if (!m101497q0("user property", str)) {
            return 6;
        }
        if (m101488i0("user property", frx0.f99017a, str)) {
            return !m101484d0("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    /* JADX INFO: renamed from: m0 */
    public final Object m101491m0(String str, Object obj) {
        if ("_ev".equals(str)) {
            return m101456C(mo15085a().m192652r(null, false), obj, true, true, null);
        }
        return m101456C(m101426D0(str) ? mo15085a().m192652r(null, false) : mo15085a().m192646l(null, false), obj, false, true, null);
    }

    @Override // p149l.gqx0
    /* JADX INFO: renamed from: n */
    public final boolean mo101492n() {
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final int m101493o(int i) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(zza(), 12451000);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: o0 */
    public final boolean m101494o0(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            zzj().m211412A().m123937b("Package name not found", e);
            return true;
        } catch (CertificateException e2) {
            zzj().m211412A().m123937b("Error obtaining certificate", e2);
            return true;
        }
    }

    /* JADX INFO: renamed from: p */
    public final int m101495p(String str) {
        if (!m101497q0(NotificationCompat.CATEGORY_EVENT, str)) {
            return 2;
        }
        if (m101489j0(NotificationCompat.CATEGORY_EVENT, arx0.f71364a, arx0.f71365b, str)) {
            return !m101484d0(NotificationCompat.CATEGORY_EVENT, 40, str) ? 2 : 0;
        }
        return 13;
    }

    /* JADX INFO: renamed from: q */
    public final int m101496q(String str, Object obj) {
        return "_ldl".equals(str) ? m101486f0("user property referrer", str, m101430J0(str), obj) : m101486f0("user property", str, m101430J0(str), obj) ? 0 : 7;
    }

    /* JADX INFO: renamed from: q0 */
    public final boolean m101497q0(String str, String str2) {
        if (str2 == null) {
            zzj().m211413B().m123937b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzj().m211413B().m123937b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            zzj().m211413B().m123938c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                zzj().m211413B().m123938c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    @WorkerThread
    /* JADX INFO: renamed from: r */
    public final int m101498r(String str, String str2, String str3, Object obj, Bundle bundle, List<String> list, boolean z, boolean z2) {
        int i;
        int size;
        mo15092h();
        int i2 = 0;
        if (!m101441b0(obj)) {
            i = 0;
        } else {
            if (!z2) {
                return 21;
            }
            if (!m101443h0(str3, jrx0.f119453c)) {
                return 20;
            }
            if (!this.f165891a.m194104E().m100157b0()) {
                return 25;
            }
            boolean z3 = obj instanceof Parcelable[];
            if (z3) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i = 0;
            }
            if (size > 200) {
                zzj().m211418G().m123939d("Parameter array is too long; discarded. Value kind, name, array length", "param", str3, Integer.valueOf(size));
                if (z3) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str3, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str3, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
                i = 17;
            } else {
                i = 0;
            }
        }
        if (m101486f0("param", str3, (m101426D0(str2) || m101426D0(str3)) ? mo15085a().m192652r(null, false) : mo15085a().m192646l(null, false), obj)) {
            return i;
        }
        if (!z2) {
            return 4;
        }
        if (obj instanceof Bundle) {
            m101465J(str, str2, str3, (Bundle) obj, list, z);
            return i;
        }
        if (obj instanceof Parcelable[]) {
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (!(parcelable instanceof Bundle)) {
                    zzj().m211418G().m123938c("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str3);
                    return 4;
                }
                m101465J(str, str2, str3, (Bundle) parcelable, list, z);
            }
            return i;
        }
        if (!(obj instanceof ArrayList)) {
            return 4;
        }
        ArrayList arrayList2 = (ArrayList) obj;
        int size2 = arrayList2.size();
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            int i3 = i2 + 1;
            if (!(obj2 instanceof Bundle)) {
                zzj().m211418G().m123938c("All ArrayList elements must be of type Bundle. Value type, name", obj2 != null ? obj2.getClass() : "null", str3);
                return 4;
            }
            m101465J(str, str2, str3, (Bundle) obj2, list, z);
            i2 = i3;
        }
        return i;
    }

    @WorkerThread
    /* JADX INFO: renamed from: t */
    public final long m101499t(Context context, String str) {
        mo15092h();
        Preconditions.checkNotNull(context);
        Preconditions.checkNotEmpty(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest messageDigestM101432P0 = m101432P0();
        if (messageDigestM101432P0 == null) {
            zzj().m211412A().m123936a("Could not get MD5 instance");
            return -1L;
        }
        if (packageManager == null) {
            return 0L;
        }
        try {
            if (m101494o0(context, str)) {
                return 0L;
            }
            Signature[] signatureArr = Wrappers.packageManager(context).getPackageInfo(zza().getPackageName(), 64).signatures;
            if (signatureArr != null && signatureArr.length > 0) {
                return m101451v(messageDigestM101432P0.digest(signatureArr[0].toByteArray()));
            }
            zzj().m211417F().m123936a("Could not get signatures");
            return -1L;
        } catch (PackageManager.NameNotFoundException e) {
            zzj().m211412A().m123937b("Package name not found", e);
            return 0L;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: t0 */
    public final long m101500t0(String str) {
        if (zza().getPackageManager() == null) {
            return 0L;
        }
        int i = 0;
        try {
            ApplicationInfo applicationInfo = Wrappers.packageManager(zza()).getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                i = applicationInfo.targetSdkVersion;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            zzj().m211415D().m123937b("PackageManager failed to find running app: app_id", str);
        }
        return i;
    }

    /* JADX INFO: renamed from: u0 */
    public final Object m101501u0(String str, Object obj) {
        return "_ldl".equals(str) ? m101456C(m101430J0(str), obj, true, false, null) : m101456C(m101430J0(str), obj, false, false, null);
    }

    /* JADX INFO: renamed from: w */
    public final Bundle m101502w(Uri uri, boolean z) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = z ? uri.getQueryParameter("gbraid") : null;
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = uri.getQueryParameter("sfmc_id");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && ((!z || TextUtils.isEmpty(queryParameter5)) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (z && !TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("gad_source");
            if (z && !TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("gad_source", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString(FirebaseAnalytics.Param.TERM, queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("content", queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter(FirebaseAnalytics.Param.ACLID);
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString(FirebaseAnalytics.Param.ACLID, queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter(FirebaseAnalytics.Param.CP1);
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString(FirebaseAnalytics.Param.CP1, queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("anid", queryParameter15);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString(FirebaseAnalytics.Param.CAMPAIGN_ID, queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter16 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString(FirebaseAnalytics.Param.SOURCE_PLATFORM, queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString(FirebaseAnalytics.Param.CREATIVE_FORMAT, queryParameter17);
            }
            String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter18)) {
                bundle.putString(FirebaseAnalytics.Param.MARKETING_TACTIC, queryParameter18);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("sfmc_id", queryParameter9);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            zzj().m211417F().m123937b("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m101503w0(String str, String str2) {
        if (str2 == null) {
            zzj().m211413B().m123937b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzj().m211413B().m123937b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            zzj().m211413B().m123938c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                zzj().m211413B().m123938c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    public final Bundle m101504y(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object objM101491m0 = m101491m0(str2, bundle.get(str2));
                if (objM101491m0 == null) {
                    zzj().m211418G().m123937b("Param value can't be null", mo15087c().m175778f(str2));
                } else {
                    m101463I(bundle2, str2, objM101491m0);
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m101505y0(String str, String str2) {
        if (ahy0.m96761a() && mo15085a().m192648n(q8s0.f153332z0) && !TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return mo15085a().m192635L().equals(str);
    }

    /* JADX INFO: renamed from: z */
    public final Bundle m101506z(String str, String str2, Bundle bundle, List<String> list, boolean z) {
        int iM101464I0;
        boolean zM101443h0 = m101443h0(str2, arx0.f71367d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int iM192653s = mo15085a().m192653s();
        int i = 0;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == 0 || !list.contains(str3)) {
                iM101464I0 = !z ? m101464I0(str3) : 0;
                if (iM101464I0 == 0) {
                    iM101464I0 = m101462H0(str3);
                }
            } else {
                iM101464I0 = 0;
            }
            if (iM101464I0 != 0) {
                m101428F(bundle2, iM101464I0, str3, iM101464I0 == 3 ? str3 : null);
                bundle2.remove(str3);
            } else {
                int iM101498r = m101498r(str, str2, str3, bundle.get(str3), bundle2, list, z, zM101443h0);
                if (iM101498r == 17) {
                    m101428F(bundle2, iM101498r, str3, Boolean.FALSE);
                } else if (iM101498r != 0 && !"_ev".equals(str3)) {
                    m101428F(bundle2, iM101498r, iM101498r == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (m101427E0(str3) && (i = i + 1) > iM192653s) {
                    zzj().m211413B().m123938c("Event can't contain more than " + iM192653s + " params", mo15087c().m175776c(str2), mo15087c().m175774a(bundle));
                    m101446p0(bundle2, 5);
                    bundle2.remove(str3);
                }
            }
        }
        return bundle2;
    }

    @WorkerThread
    /* JADX INFO: renamed from: z0 */
    public final boolean m101507z0(String str) {
        mo15092h();
        if (Wrappers.packageManager(zza()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        zzj().m211424z().m123937b("Permission not granted", str);
        return false;
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ t2r0 zzd() {
        return super.zzd();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ xww0 zzj() {
        return super.zzj();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ kjx0 zzl() {
        return super.zzl();
    }
}
