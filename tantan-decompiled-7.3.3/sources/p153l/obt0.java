package p153l;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes6.dex */
public final class obt0 {

    /* JADX INFO: renamed from: b */
    public static final Handler f146613b = new ukw0(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    public static final String f146614c = AdView.class.getName();

    /* JADX INFO: renamed from: d */
    public static final String f146615d = a2n.class.getName();

    /* JADX INFO: renamed from: e */
    public static final String f146616e = AdManagerAdView.class.getName();

    /* JADX INFO: renamed from: f */
    public static final String f146617f = h70.class.getName();

    /* JADX INFO: renamed from: g */
    public static final String f146618g = SearchAdView.class.getName();

    /* JADX INFO: renamed from: h */
    public static final String f146619h = f70.class.getName();

    /* JADX INFO: renamed from: a */
    public float f146620a = -1.0f;

    @Nullable
    /* JADX INFO: renamed from: A */
    public static final String m167034A(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || m167043t()) {
            string = "emulator";
        }
        return m167035B(string, "MD5");
    }

    @Nullable
    /* JADX INFO: renamed from: B */
    public static String m167035B(String str, String str2) {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final void m167036d(ViewGroup viewGroup, zzq zzqVar, @Nullable String str, int i, int i2) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i);
        textView.setBackgroundColor(i2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i);
        int iM167049z = m167049z(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(zzqVar.zzf - iM167049z, zzqVar.zzc - iM167049z, 17));
        viewGroup.addView(frameLayout, zzqVar.zzf, zzqVar.zzc);
    }

    /* JADX INFO: renamed from: f */
    public static String m167037f() {
        UUID uuidRandomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(uuidRandomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(uuidRandomUUID.getMostSignificantBits()).toByteArray();
        String string = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                string = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return string;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static String m167038g(String str) {
        return m167035B(str, "MD5");
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static String m167039h(String str) {
        return m167035B(str, "SHA-256");
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: q */
    public static boolean m167040q(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) qjs0.f158043d.m149974e());
    }

    /* JADX INFO: renamed from: r */
    public static final int m167041r(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, i, displayMetrics);
    }

    @Nullable
    @VisibleForTesting
    /* JADX INFO: renamed from: s */
    public static final String m167042s(StackTraceElement[] stackTraceElementArr, String str) {
        String className;
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 >= stackTraceElementArr.length) {
                className = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            String className2 = stackTraceElement.getClassName();
            if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (f146614c.equalsIgnoreCase(className2) || f146615d.equalsIgnoreCase(className2) || f146616e.equalsIgnoreCase(className2) || f146617f.equalsIgnoreCase(className2) || f146618g.equalsIgnoreCase(className2) || f146619h.equalsIgnoreCase(className2))) {
                className = stackTraceElementArr[i2].getClassName();
                break;
            }
            i = i2;
        }
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                for (int i3 = 2; i3 > 0 && stringTokenizer.hasMoreElements(); i3--) {
                    sb.append(".");
                    sb.append(stringTokenizer.nextToken());
                }
                str = sb.toString();
            }
            if (className != null && !className.contains(str)) {
                return className;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m167043t() {
        boolean zBooleanValue = ((Boolean) jas0.m144075c().m176505a(sgs0.f168082Na)).booleanValue();
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        if (str.contains("generic") || str.contains("emulator")) {
            return true;
        }
        return zBooleanValue && Build.HARDWARE.contains("ranchu");
    }

    /* JADX INFO: renamed from: u */
    public static final boolean m167044u(Context context, int i) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i) == 0;
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m167045v(Context context) {
        int iIsGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 12451000);
        return iIsGooglePlayServicesAvailable == 0 || iIsGooglePlayServicesAvailable == 2;
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m167046w() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: x */
    public static final int m167047x(DisplayMetrics displayMetrics, int i) {
        return Math.round(i / displayMetrics.density);
    }

    /* JADX INFO: renamed from: y */
    public static final void m167048y(Context context, @Nullable String str, String str2, Bundle bundle, boolean z, nbt0 nbt0Var) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            str = GoogleApiAvailabilityLight.getInstance().getApkVersion(context) + ".240304000";
        }
        bundle.putString("js", str);
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str3 : bundle.keySet()) {
            builderAppendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        nbt0Var.zza(builderAppendQueryParameter.toString());
    }

    /* JADX INFO: renamed from: z */
    public static final int m167049z(Context context, int i) {
        return m167041r(context.getResources().getDisplayMetrics(), i);
    }

    /* JADX INFO: renamed from: a */
    public final JSONArray m167050a(Collection collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m167051b(jSONArray, it.next());
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: b */
    public final void m167051b(JSONArray jSONArray, @Nullable Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONArray.put(m167055j((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(m167056k((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(m167050a((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(m167054i((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m167052c(JSONObject jSONObject, String str, @Nullable Object obj) throws JSONException {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168473t)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, m167055j((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, m167056k((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), m167050a((Collection) obj));
            return;
        }
        if (obj instanceof Object[]) {
            jSONObject.put(str, m167050a(Arrays.asList((Object[]) obj)));
            return;
        }
        int i = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            Integer[] numArr = new Integer[length];
            while (i < length) {
                numArr[i] = Integer.valueOf(iArr[i]);
                i++;
            }
            jSONObject.put(str, m167054i(numArr));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length2 = dArr.length;
            Double[] dArr2 = new Double[length2];
            while (i < length2) {
                dArr2[i] = Double.valueOf(dArr[i]);
                i++;
            }
            jSONObject.put(str, m167054i(dArr2));
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length3 = jArr.length;
            Long[] lArr = new Long[length3];
            while (i < length3) {
                lArr[i] = Long.valueOf(jArr[i]);
                i++;
            }
            jSONObject.put(str, m167054i(lArr));
            return;
        }
        if (!(obj instanceof boolean[])) {
            jSONObject.put(str, obj);
            return;
        }
        boolean[] zArr = (boolean[]) obj;
        int length4 = zArr.length;
        Boolean[] boolArr = new Boolean[length4];
        while (i < length4) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
            i++;
        }
        jSONObject.put(str, m167054i(boolArr));
    }

    /* JADX INFO: renamed from: e */
    public final int m167053e(Context context, int i) {
        if (this.f146620a < 0.0f) {
            synchronized (this) {
                try {
                    if (this.f146620a < 0.0f) {
                        WindowManager windowManager = (WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
                        if (windowManager == null) {
                            return 0;
                        }
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        this.f146620a = displayMetrics.density;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Math.round(i / this.f146620a);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: i */
    public final JSONArray m167054i(Object[] objArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            m167051b(jSONArray, obj);
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: j */
    public final JSONObject m167055j(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m167052c(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: k */
    public final JSONObject m167056k(Map map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                m167052c(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e.getMessage())));
        }
    }

    /* JADX INFO: renamed from: l */
    public final JSONObject m167057l(@Nullable Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return m167055j(bundle);
            } catch (JSONException e) {
                dct0.m115296e("Error converting Bundle to JSON", e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final void m167058m(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject2.get(next);
            try {
                Object obj2 = jSONObject.get(next);
                if (JSONObject.class.isInstance(obj2) && JSONObject.class.isInstance(obj)) {
                    m167058m((JSONObject) obj2, (JSONObject) obj);
                }
            } catch (JSONException unused) {
                jSONObject.put(next, obj);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m167059n(ViewGroup viewGroup, zzq zzqVar, @Nullable String str, @Nullable String str2) {
        if (str2 != null) {
            dct0.m115298g(str2);
        }
        m167036d(viewGroup, zzqVar, str, -65536, RoundedDrawable.DEFAULT_BORDER_COLOR);
    }

    /* JADX INFO: renamed from: o */
    public final void m167060o(ViewGroup viewGroup, zzq zzqVar, @Nullable String str) {
        m167036d(viewGroup, zzqVar, "Ads by Google", RoundedDrawable.DEFAULT_BORDER_COLOR, -1);
    }

    /* JADX INFO: renamed from: p */
    public final void m167061p(Context context, @Nullable String str, String str2, Bundle bundle, boolean z) {
        m167048y(context, str, "gmob-apps", bundle, true, new nbt0() { // from class: l.lbt0
            @Override // p153l.nbt0
            public final boolean zza(String str3) {
                new mbt0(this.f131228a, str3).start();
                return true;
            }
        });
    }
}
