package p153l;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.facebook.C1600c;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.C1680e;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.data.Ref;
import com.sina.weibo.sdk.constant.WBConstants;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class zw0 {

    /* JADX INFO: renamed from: g */
    public static final String f206306g = "l.zw0";

    /* JADX INFO: renamed from: a */
    @Nullable
    public String f206307a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public Uri f206308b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public JSONObject f206309c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public Bundle f206310d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public String f206311e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public JSONObject f206312f;

    /* JADX INFO: renamed from: l.zw0$a */
    public static class RunnableC21909a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f206313a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f206314b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC21910b f206315c;

        public RunnableC21909a(Context context, String str, InterfaceC21910b interfaceC21910b) {
            this.f206313a = context;
            this.f206314b = str;
            this.f206315c = interfaceC21910b;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ztb.m221490d(this)) {
                return;
            }
            try {
                zw0.m221847e(this.f206313a, this.f206314b, this.f206315c);
            } catch (Throwable th) {
                ztb.m221488b(th, this);
            }
        }
    }

    /* JADX INFO: renamed from: l.zw0$b */
    public interface InterfaceC21910b {
        /* JADX INFO: renamed from: a */
        void mo99443a(@Nullable zw0 zw0Var);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static zw0 m221844b(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(WBConstants.AUTH_PARAMS_VERSION);
            if (jSONObject.getJSONObject("bridge_args").getString(FirebaseAnalytics.Param.METHOD).equals("applink") && string.equals("2")) {
                zw0 zw0Var = new zw0();
                JSONObject jSONObject2 = jSONObject.getJSONObject("method_args");
                zw0Var.f206309c = jSONObject2;
                boolean zHas = jSONObject2.has(Ref.TYPE);
                JSONObject jSONObject3 = zw0Var.f206309c;
                if (zHas) {
                    zw0Var.f206307a = jSONObject3.getString(Ref.TYPE);
                } else if (jSONObject3.has("referer_data")) {
                    JSONObject jSONObject4 = zw0Var.f206309c.getJSONObject("referer_data");
                    if (jSONObject4.has("fb_ref")) {
                        zw0Var.f206307a = jSONObject4.getString("fb_ref");
                    }
                }
                if (zw0Var.f206309c.has("target_url")) {
                    Uri uri = Uri.parse(zw0Var.f206309c.getString("target_url"));
                    zw0Var.f206308b = uri;
                    zw0Var.f206312f = m221848f(uri);
                }
                if (zw0Var.f206309c.has("extras")) {
                    JSONObject jSONObject5 = zw0Var.f206309c.getJSONObject("extras");
                    if (jSONObject5.has("deeplink_context")) {
                        JSONObject jSONObject6 = jSONObject5.getJSONObject("deeplink_context");
                        if (jSONObject6.has("promo_code")) {
                            zw0Var.f206311e = jSONObject6.getString("promo_code");
                        }
                    }
                }
                zw0Var.f206310d = m221849h(zw0Var.f206309c);
                return zw0Var;
            }
        } catch (FacebookException e) {
            C1680e.m8900k0(f206306g, "Unable to parse AppLink JSON", e);
        } catch (JSONException e2) {
            C1680e.m8900k0(f206306g, "Unable to parse AppLink JSON", e2);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static void m221845c(Context context, String str, InterfaceC21910b interfaceC21910b) {
        g0l0.m128439j(context, "context");
        g0l0.m128439j(interfaceC21910b, "completionHandler");
        if (str == null) {
            str = C1680e.m8871J(context);
        }
        g0l0.m128439j(str, "applicationId");
        C1600c.m8110u().execute(new RunnableC21909a(context.getApplicationContext(), str, interfaceC21910b));
    }

    /* JADX INFO: renamed from: d */
    public static void m221846d(Context context, InterfaceC21910b interfaceC21910b) {
        m221845c(context, null, interfaceC21910b);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0092 A[Catch: JSONException -> 0x009d, Exception -> 0x00bf, TRY_ENTER, TryCatch #4 {JSONException -> 0x009d, blocks: (B:23:0x008c, B:26:0x0092, B:27:0x0095, B:29:0x0099), top: B:56:0x008c, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0099 A[Catch: JSONException -> 0x009d, Exception -> 0x00bf, TRY_LEAVE, TryCatch #4 {JSONException -> 0x009d, blocks: (B:23:0x008c, B:26:0x0092, B:27:0x0095, B:29:0x0099), top: B:56:0x008c, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ac A[Catch: JSONException -> 0x00b7, Exception -> 0x00bf, TRY_ENTER, TryCatch #2 {JSONException -> 0x00b7, blocks: (B:33:0x00a6, B:36:0x00ac, B:37:0x00af, B:39:0x00b3), top: B:52:0x00a6, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3 A[Catch: JSONException -> 0x00b7, Exception -> 0x00bf, TRY_LEAVE, TryCatch #2 {JSONException -> 0x00b7, blocks: (B:33:0x00a6, B:36:0x00ac, B:37:0x00af, B:39:0x00b3), top: B:52:0x00a6, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static void m221847e(Context context, String str, InterfaceC21910b interfaceC21910b) {
        JSONObject jSONObject;
        Bundle bundle;
        JSONObject jSONObject2;
        Bundle bundle2;
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put(NotificationCompat.CATEGORY_EVENT, "DEFERRED_APP_LINK");
            C1680e.setAppEventAttributionParameters(jSONObject3, AttributionIdentifiers.m8697k(context), AppEventsLogger.m7696c(context), C1600c.m8076A(context));
            C1680e.m8863C0(jSONObject3, C1600c.m8101l());
            jSONObject3.put("application_package_name", context.getPackageName());
            String str2 = String.format("%s/activities", str);
            zw0 zw0VarM221844b = null;
            try {
                JSONObject graphObject = GraphRequest.m7561A(null, str2, jSONObject3, null).m7579j().getGraphObject();
                if (graphObject != null) {
                    String strOptString = graphObject.optString("applink_args");
                    long jOptLong = graphObject.optLong("click_time", -1L);
                    String strOptString2 = graphObject.optString("applink_class");
                    String strOptString3 = graphObject.optString("applink_url");
                    if (!TextUtils.isEmpty(strOptString) && (zw0VarM221844b = m221844b(strOptString)) != null) {
                        if (jOptLong != -1) {
                            try {
                                JSONObject jSONObject4 = zw0VarM221844b.f206309c;
                                if (jSONObject4 != null) {
                                    jSONObject4.put("com.facebook.platform.APPLINK_TAP_TIME_UTC", jOptLong);
                                }
                                Bundle bundle3 = zw0VarM221844b.f206310d;
                                if (bundle3 != null) {
                                    bundle3.putString("com.facebook.platform.APPLINK_TAP_TIME_UTC", Long.toString(jOptLong));
                                    if (strOptString2 != null) {
                                        try {
                                            jSONObject = zw0VarM221844b.f206309c;
                                            if (jSONObject != null) {
                                                jSONObject.put("com.facebook.platform.APPLINK_NATIVE_CLASS", strOptString2);
                                            }
                                            bundle = zw0VarM221844b.f206310d;
                                            if (bundle != null) {
                                                bundle.putString("com.facebook.platform.APPLINK_NATIVE_CLASS", strOptString2);
                                                if (strOptString3 != null) {
                                                    try {
                                                        jSONObject2 = zw0VarM221844b.f206309c;
                                                        if (jSONObject2 != null) {
                                                            jSONObject2.put("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                                        }
                                                        bundle2 = zw0VarM221844b.f206310d;
                                                        if (bundle2 != null) {
                                                            bundle2.putString("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                                        }
                                                    } catch (JSONException unused) {
                                                        C1680e.m8898j0(f206306g, "Unable to put app link URL in AppLinkData.arguments");
                                                    }
                                                }
                                            } else if (strOptString3 != null) {
                                                jSONObject2 = zw0VarM221844b.f206309c;
                                                if (jSONObject2 != null) {
                                                    jSONObject2.put("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                                }
                                                bundle2 = zw0VarM221844b.f206310d;
                                                if (bundle2 != null) {
                                                    bundle2.putString("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                                }
                                            }
                                        } catch (JSONException unused2) {
                                            C1680e.m8898j0(f206306g, "Unable to put app link class name in AppLinkData.arguments");
                                        }
                                    } else if (strOptString3 != null) {
                                        jSONObject2 = zw0VarM221844b.f206309c;
                                        if (jSONObject2 != null) {
                                            jSONObject2.put("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                        }
                                        bundle2 = zw0VarM221844b.f206310d;
                                        if (bundle2 != null) {
                                            bundle2.putString("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                        }
                                    }
                                } else if (strOptString2 != null) {
                                    jSONObject = zw0VarM221844b.f206309c;
                                    if (jSONObject != null) {
                                        jSONObject.put("com.facebook.platform.APPLINK_NATIVE_CLASS", strOptString2);
                                    }
                                    bundle = zw0VarM221844b.f206310d;
                                    if (bundle != null) {
                                        bundle.putString("com.facebook.platform.APPLINK_NATIVE_CLASS", strOptString2);
                                        if (strOptString3 != null) {
                                            jSONObject2 = zw0VarM221844b.f206309c;
                                            if (jSONObject2 != null) {
                                                jSONObject2.put("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                            }
                                            bundle2 = zw0VarM221844b.f206310d;
                                            if (bundle2 != null) {
                                                bundle2.putString("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                            }
                                        }
                                    } else if (strOptString3 != null) {
                                        jSONObject2 = zw0VarM221844b.f206309c;
                                        if (jSONObject2 != null) {
                                            jSONObject2.put("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                        }
                                        bundle2 = zw0VarM221844b.f206310d;
                                        if (bundle2 != null) {
                                            bundle2.putString("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                        }
                                    }
                                } else if (strOptString3 != null) {
                                    jSONObject2 = zw0VarM221844b.f206309c;
                                    if (jSONObject2 != null) {
                                        jSONObject2.put("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                    }
                                    bundle2 = zw0VarM221844b.f206310d;
                                    if (bundle2 != null) {
                                        bundle2.putString("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                    }
                                }
                            } catch (JSONException unused3) {
                                C1680e.m8898j0(f206306g, "Unable to put tap time in AppLinkData.arguments");
                            }
                        } else if (strOptString2 != null) {
                            jSONObject = zw0VarM221844b.f206309c;
                            if (jSONObject != null) {
                                jSONObject.put("com.facebook.platform.APPLINK_NATIVE_CLASS", strOptString2);
                            }
                            bundle = zw0VarM221844b.f206310d;
                            if (bundle != null) {
                                bundle.putString("com.facebook.platform.APPLINK_NATIVE_CLASS", strOptString2);
                                if (strOptString3 != null) {
                                    jSONObject2 = zw0VarM221844b.f206309c;
                                    if (jSONObject2 != null) {
                                        jSONObject2.put("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                    }
                                    bundle2 = zw0VarM221844b.f206310d;
                                    if (bundle2 != null) {
                                        bundle2.putString("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                    }
                                }
                            } else if (strOptString3 != null) {
                                jSONObject2 = zw0VarM221844b.f206309c;
                                if (jSONObject2 != null) {
                                    jSONObject2.put("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                }
                                bundle2 = zw0VarM221844b.f206310d;
                                if (bundle2 != null) {
                                    bundle2.putString("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                }
                            }
                        } else if (strOptString3 != null) {
                            jSONObject2 = zw0VarM221844b.f206309c;
                            if (jSONObject2 != null) {
                                jSONObject2.put("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                            }
                            bundle2 = zw0VarM221844b.f206310d;
                            if (bundle2 != null) {
                                bundle2.putString("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                            }
                        }
                    }
                }
            } catch (Exception unused4) {
                C1680e.m8898j0(f206306g, "Unable to fetch deferred applink from server");
            }
            interfaceC21910b.mo99443a(zw0VarM221844b);
        } catch (JSONException e) {
            throw new FacebookException("An error occurred while preparing deferred app link", e);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static JSONObject m221848f(@Nullable Uri uri) {
        if (ztb.m221490d(zw0.class) || uri == null) {
            return null;
        }
        try {
            String queryParameter = uri.getQueryParameter("al_applink_data");
            if (queryParameter == null) {
                return null;
            }
            try {
                return new JSONObject(queryParameter);
            } catch (JSONException unused) {
                return null;
            }
        } catch (Throwable th) {
            ztb.m221488b(th, zw0.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static Bundle m221849h(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                bundle.putBundle(next, m221849h((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int i = 0;
                if (jSONArray.length() == 0) {
                    bundle.putStringArray(next, new String[0]);
                } else {
                    Object obj2 = jSONArray.get(0);
                    if (obj2 instanceof JSONObject) {
                        Bundle[] bundleArr = new Bundle[jSONArray.length()];
                        while (i < jSONArray.length()) {
                            bundleArr[i] = m221849h(jSONArray.getJSONObject(i));
                            i++;
                        }
                        bundle.putParcelableArray(next, bundleArr);
                    } else {
                        if (obj2 instanceof JSONArray) {
                            throw new FacebookException("Nested arrays are not supported.");
                        }
                        String[] strArr = new String[jSONArray.length()];
                        while (i < jSONArray.length()) {
                            strArr[i] = jSONArray.get(i).toString();
                            i++;
                        }
                        bundle.putStringArray(next, strArr);
                    }
                }
            } else {
                bundle.putString(next, obj.toString());
            }
        }
        return bundle;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public Uri m221850g() {
        return this.f206308b;
    }
}
