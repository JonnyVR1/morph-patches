package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.facebook.C1600c;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.vivo.push.PushClientConstants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJM\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0016\u0010\u0015J1\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u0003J\u0015\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJM\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u0013J3\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001e2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fH\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010\"\u001a\u00020\u00182\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0011H\u0002¢\u0006\u0004\b\"\u0010#J)\u0010%\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010$\u001a\u00020\u000bH\u0002¢\u0006\u0004\b%\u0010&J9\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010$\u001a\u00020\u000bH\u0002¢\u0006\u0004\b'\u0010(J7\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u000bH\u0002¢\u0006\u0004\b)\u0010(J7\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fH\u0002¢\u0006\u0004\b+\u0010,J%\u00101\u001a\u0004\u0018\u0001002\n\u0010.\u001a\u0006\u0012\u0002\b\u00030-2\u0006\u0010/\u001a\u00020\u000bH\u0002¢\u0006\u0004\b1\u00102J%\u00104\u001a\b\u0012\u0002\b\u0003\u0018\u00010-2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u000bH\u0002¢\u0006\u0004\b4\u00105JC\u00109\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000b2\b\u00106\u001a\u0004\u0018\u00010\u00012\u000e\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000107H\u0002¢\u0006\u0004\b9\u0010:R0\u0010>\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002000;j\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u000200`<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010=R8\u0010?\u001a&\u0012\u0004\u0012\u00020\u000b\u0012\b\u0012\u0006\u0012\u0002\b\u00030-0;j\u0012\u0012\u0004\u0012\u00020\u000b\u0012\b\u0012\u0006\u0012\u0002\b\u00030-`<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010=R\u001c\u0010B\u001a\n @*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010AR\u001c\u0010E\u001a\n @*\u0004\u0018\u00010C0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010DR\u001c\u0010F\u001a\n @*\u0004\u0018\u00010C0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010D¨\u0006G"}, m88121d2 = {"Ll/bsm;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/os/IBinder;", NotificationCompat.CATEGORY_SERVICE, "a", "(Landroid/content/Context;Landroid/os/IBinder;)Ljava/lang/Object;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "skuList", "inAppBillingObj", "", "isSubscription", "", "k", "(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/Object;Z)Ljava/util/Map;", RXScreenCaptureService.KEY_INDEX, "(Landroid/content/Context;Ljava/lang/Object;)Ljava/util/ArrayList;", "j", "g", "", "b", "skuDetail", "m", "(Ljava/lang/String;)Z", BLiveStormDanmakuGiftResourceType.f45292l, "", "p", "(Ljava/util/ArrayList;)Ljava/util/Map;", "skuDetailsMap", "q", "(Ljava/util/Map;)V", "type", "o", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;)Z", "h", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;)Ljava/util/ArrayList;", "f", "purchases", "c", "(Ljava/util/ArrayList;)Ljava/util/ArrayList;", "Ljava/lang/Class;", "classObj", "methodName", "Ljava/lang/reflect/Method;", "e", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;", PushClientConstants.TAG_CLASS_NAME, Constants.INAPP_DATA_TAG, "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Class;", "obj", "", "args", "n", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "methodMap", "classMap", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "PACKAGE_NAME", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "skuDetailSharedPrefs", "purchaseInappSharedPrefs", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class bsm {

    @NotNull
    public static final bsm INSTANCE = new bsm();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final HashMap<String, Method> methodMap = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final HashMap<String, Class<?>> classMap = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final String PACKAGE_NAME = C1600c.m8101l().getPackageName();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final SharedPreferences skuDetailSharedPrefs = C1600c.m8101l().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final SharedPreferences purchaseInappSharedPrefs = C1600c.m8101l().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m106293a(@NotNull Context context, @Nullable IBinder service) {
        if (ztb.m221490d(bsm.class)) {
            return null;
        }
        try {
            context.getClass();
            return INSTANCE.m106306n(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{service});
        } catch (Throwable th) {
            ztb.m221488b(th, bsm.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m106294b() {
        if (ztb.m221490d(bsm.class)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = skuDetailSharedPrefs;
            long j = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j == 0) {
                sharedPreferences.edit().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
            } else if (jCurrentTimeMillis - j > 604800) {
                sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
            }
        } catch (Throwable th) {
            ztb.m221488b(th, bsm.class);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final ArrayList<String> m106295g(@NotNull Context context, @Nullable Object inAppBillingObj) {
        bsm bsmVar;
        Class<?> clsM106300d;
        if (ztb.m221490d(bsm.class)) {
            return null;
        }
        try {
            context.getClass();
            ArrayList<String> arrayList = new ArrayList<>();
            if (inAppBillingObj != null && (clsM106300d = (bsmVar = INSTANCE).m106300d(context, "com.android.vending.billing.IInAppBillingService")) != null && bsmVar.m106301e(clsM106300d, "getPurchaseHistory") != null) {
                return bsmVar.m106299c(bsmVar.m106302f(context, inAppBillingObj, "inapp"));
            }
            return arrayList;
        } catch (Throwable th) {
            ztb.m221488b(th, bsm.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final ArrayList<String> m106296i(@NotNull Context context, @Nullable Object inAppBillingObj) {
        if (ztb.m221490d(bsm.class)) {
            return null;
        }
        try {
            context.getClass();
            bsm bsmVar = INSTANCE;
            return bsmVar.m106299c(bsmVar.m106303h(context, inAppBillingObj, "inapp"));
        } catch (Throwable th) {
            ztb.m221488b(th, bsm.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: j */
    public static final ArrayList<String> m106297j(@NotNull Context context, @Nullable Object inAppBillingObj) {
        if (ztb.m221490d(bsm.class)) {
            return null;
        }
        try {
            context.getClass();
            bsm bsmVar = INSTANCE;
            return bsmVar.m106299c(bsmVar.m106303h(context, inAppBillingObj, SubSampleInformationBox.TYPE));
        } catch (Throwable th) {
            ztb.m221488b(th, bsm.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: k */
    public static final Map<String, String> m106298k(@NotNull Context context, @NotNull ArrayList<String> skuList, @Nullable Object inAppBillingObj, boolean isSubscription) {
        if (ztb.m221490d(bsm.class)) {
            return null;
        }
        try {
            context.getClass();
            skuList.getClass();
            Map<String, String> mapM106308p = INSTANCE.m106308p(skuList);
            ArrayList<String> arrayList = new ArrayList<>();
            for (String str : skuList) {
                if (!mapM106308p.containsKey(str)) {
                    arrayList.add(str);
                }
            }
            mapM106308p.putAll(INSTANCE.m106304l(context, arrayList, inAppBillingObj, isSubscription));
            return mapM106308p;
        } catch (Throwable th) {
            ztb.m221488b(th, bsm.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList<String> m106299c(ArrayList<String> purchases) {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            SharedPreferences.Editor editorEdit = purchaseInappSharedPrefs.edit();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            for (String str : purchases) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("productId");
                    long j = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (jCurrentTimeMillis - (j / 1000) <= 86400 && !Intrinsics.m88377d(purchaseInappSharedPrefs.getString(string, ""), string2)) {
                        editorEdit.putString(string, string2);
                        arrayList.add(str);
                    }
                } catch (JSONException unused) {
                }
            }
            editorEdit.apply();
            return arrayList;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final Class<?> m106300d(Context context, String className) {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            HashMap<String, Class<?>> map = classMap;
            Class<?> cls = map.get(className);
            if (cls != null) {
                return cls;
            }
            Class<?> clsM7870b = InAppPurchaseUtils.m7870b(context, className);
            if (clsM7870b == null) {
                return clsM7870b;
            }
            map.put(className, clsM7870b);
            return clsM7870b;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    /* JADX INFO: renamed from: e */
    public final Method m106301e(Class<?> classObj, String methodName) {
        Class[] clsArr;
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            HashMap<String, Method> map = methodMap;
            Method method = map.get(methodName);
            if (method != null) {
                return method;
            }
            Class cls = Integer.TYPE;
            switch (methodName) {
                case "getPurchases":
                    cls.getClass();
                    clsArr = new Class[]{cls, String.class, String.class, String.class};
                    break;
                case "isBillingSupported":
                    cls.getClass();
                    clsArr = new Class[]{cls, String.class, String.class};
                    break;
                case "asInterface":
                    clsArr = new Class[]{IBinder.class};
                    break;
                case "getPurchaseHistory":
                    cls.getClass();
                    clsArr = new Class[]{cls, String.class, String.class, String.class, Bundle.class};
                    break;
                case "getSkuDetails":
                    cls.getClass();
                    clsArr = new Class[]{cls, String.class, String.class, Bundle.class};
                    break;
                default:
                    clsArr = null;
                    break;
            }
            Method methodM7871c = clsArr == null ? InAppPurchaseUtils.m7871c(classObj, methodName, null) : InAppPurchaseUtils.m7871c(classObj, methodName, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (methodM7871c != null) {
                map.put(methodName, methodM7871c);
            }
            return methodM7871c;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    /* JADX INFO: renamed from: f */
    public final ArrayList<String> m106302f(Context context, Object inAppBillingObj, String type) {
        ArrayList<String> stringArrayList;
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (m106307o(context, inAppBillingObj, type)) {
                int i = 0;
                String string = null;
                boolean z = false;
                do {
                    Object objM106306n = m106306n(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", inAppBillingObj, new Object[]{6, PACKAGE_NAME, type, string, new Bundle()});
                    if (objM106306n != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) objM106306n;
                        if (bundle.getInt("RESPONSE_CODE") != 0 || (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) == null) {
                            string = null;
                        } else {
                            for (String str : stringArrayList) {
                                try {
                                    if (jCurrentTimeMillis - (new JSONObject(str).getLong("purchaseTime") / 1000) > 1200) {
                                        z = true;
                                        break;
                                    }
                                    arrayList.add(str);
                                    i++;
                                } catch (JSONException unused) {
                                }
                            }
                            string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        }
                    } else {
                        string = null;
                    }
                    if (i >= 30 || string == null) {
                        break;
                    }
                } while (!z);
            }
            return arrayList;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    /* JADX INFO: renamed from: h */
    public final ArrayList<String> m106303h(Context context, Object inAppBillingObj, String type) {
        bsm bsmVar;
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (inAppBillingObj != null && m106307o(context, inAppBillingObj, type)) {
                int size = 0;
                String string = null;
                while (true) {
                    bsmVar = this;
                    Context context2 = context;
                    Object obj = inAppBillingObj;
                    try {
                        Object objM106306n = bsmVar.m106306n(context2, "com.android.vending.billing.IInAppBillingService", "getPurchases", obj, new Object[]{3, PACKAGE_NAME, type, string});
                        if (objM106306n == null) {
                            string = null;
                            if (size >= 30) {
                                break;
                            }
                            break;
                            break;
                        }
                        Bundle bundle = (Bundle) objM106306n;
                        if (bundle.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            if (stringArrayList == null) {
                                break;
                            }
                            size += stringArrayList.size();
                            arrayList.addAll(stringArrayList);
                            string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        } else {
                            string = null;
                        }
                        if (size >= 30 || string == null) {
                            break;
                        }
                        this = bsmVar;
                        context = context2;
                        inAppBillingObj = obj;
                    } catch (Throwable th) {
                        th = th;
                        ztb.m221488b(th, bsmVar);
                        return null;
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            bsmVar = this;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* JADX INFO: renamed from: l */
    public final Map<String, String> m106304l(Context context, ArrayList<String> skuList, Object inAppBillingObj, boolean isSubscription) {
        bsm bsmVar;
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (inAppBillingObj != null && !skuList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", skuList);
                bsmVar = this;
                try {
                    Object objM106306n = bsmVar.m106306n(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", inAppBillingObj, new Object[]{3, PACKAGE_NAME, isSubscription ? SubSampleInformationBox.TYPE : "inapp", bundle});
                    if (objM106306n != null) {
                        Bundle bundle2 = (Bundle) objM106306n;
                        if (bundle2.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                            if (stringArrayList != null && skuList.size() == stringArrayList.size()) {
                                int size = skuList.size();
                                for (int i = 0; i < size; i++) {
                                    String str = skuList.get(i);
                                    str.getClass();
                                    String str2 = stringArrayList.get(i);
                                    str2.getClass();
                                    linkedHashMap.put(str, str2);
                                }
                            }
                            bsmVar.m106309q(linkedHashMap);
                            return linkedHashMap;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    ztb.m221488b(th, bsmVar);
                    return null;
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            th = th2;
            bsmVar = this;
            ztb.m221488b(th, bsmVar);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m106305m(@NotNull String skuDetail) {
        if (ztb.m221490d(this)) {
            return false;
        }
        try {
            skuDetail.getClass();
            try {
                String strOptString = new JSONObject(skuDetail).optString("freeTrialPeriod");
                return strOptString != null && strOptString.length() > 0;
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public final Object m106306n(Context context, String className, String methodName, Object obj, Object[] args) {
        Method methodM106301e;
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            Class<?> clsM106300d = m106300d(context, className);
            if (clsM106300d == null || (methodM106301e = m106301e(clsM106300d, methodName)) == null) {
                return null;
            }
            return InAppPurchaseUtils.m7873e(clsM106300d, methodM106301e, obj, Arrays.copyOf(args, args.length));
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m106307o(Context context, Object inAppBillingObj, String type) {
        bsm bsmVar;
        if (ztb.m221490d(this) || inAppBillingObj == null) {
            return false;
        }
        try {
            bsmVar = this;
            try {
                Object objM106306n = bsmVar.m106306n(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", inAppBillingObj, new Object[]{3, PACKAGE_NAME, type});
                return objM106306n != null && ((Integer) objM106306n).intValue() == 0;
            } catch (Throwable th) {
                th = th;
                ztb.m221488b(th, bsmVar);
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            bsmVar = this;
        }
    }

    /* JADX INFO: renamed from: p */
    public final Map<String, String> m106308p(ArrayList<String> skuList) {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            for (String str : skuList) {
                String string = skuDetailSharedPrefs.getString(str, null);
                if (string != null) {
                    List listSplit$default = StringsKt.split$default(string, new String[]{com.meituan.robust.Constants.PACKNAME_END}, false, 2, 2, null);
                    if (jCurrentTimeMillis - Long.parseLong((String) listSplit$default.get(0)) < 43200) {
                        str.getClass();
                        linkedHashMap.put(str, listSplit$default.get(1));
                    } else {
                        continue;
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m106309q(Map<String, String> skuDetailsMap) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor editorEdit = skuDetailSharedPrefs.edit();
            for (Map.Entry<String, String> entry : skuDetailsMap.entrySet()) {
                editorEdit.putString(entry.getKey(), jCurrentTimeMillis + ';' + entry.getValue());
            }
            editorEdit.apply();
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }
}
