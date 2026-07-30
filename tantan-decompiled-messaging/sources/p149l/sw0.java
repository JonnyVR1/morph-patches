package p149l;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.facebook.C1577c;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.C1657e;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.data.Ref;
import com.sina.weibo.sdk.constant.WBConstants;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class sw0 {

    /* JADX INFO: renamed from: g */
    public static final String f166604g = "l.sw0";

    /* JADX INFO: renamed from: a */
    @Nullable
    public String f166605a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public Uri f166606b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public JSONObject f166607c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public Bundle f166608d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public String f166609e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public JSONObject f166610f;

    /* JADX INFO: renamed from: l.sw0$a */
    public static class RunnableC20041a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f166611a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f166612b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC20042b f166613c;

        public RunnableC20041a(Context context, String str, InterfaceC20042b interfaceC20042b) {
            this.f166611a = context;
            this.f166612b = str;
            this.f166613c = interfaceC20042b;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (lsb.m151554d(this)) {
                return;
            }
            try {
                sw0.m186118e(this.f166611a, this.f166612b, this.f166613c);
            } catch (Throwable th) {
                lsb.m151552b(th, this);
            }
        }
    }

    /* JADX INFO: renamed from: l.sw0$b */
    public interface InterfaceC20042b {
        /* JADX INFO: renamed from: a */
        void mo186122a(@Nullable sw0 sw0Var);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static sw0 m186115b(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(WBConstants.AUTH_PARAMS_VERSION);
            if (jSONObject.getJSONObject("bridge_args").getString(FirebaseAnalytics.Param.METHOD).equals("applink") && string.equals("2")) {
                sw0 sw0Var = new sw0();
                JSONObject jSONObject2 = jSONObject.getJSONObject("method_args");
                sw0Var.f166607c = jSONObject2;
                boolean zHas = jSONObject2.has(Ref.TYPE);
                JSONObject jSONObject3 = sw0Var.f166607c;
                if (zHas) {
                    sw0Var.f166605a = jSONObject3.getString(Ref.TYPE);
                } else if (jSONObject3.has("referer_data")) {
                    JSONObject jSONObject4 = sw0Var.f166607c.getJSONObject("referer_data");
                    if (jSONObject4.has("fb_ref")) {
                        sw0Var.f166605a = jSONObject4.getString("fb_ref");
                    }
                }
                if (sw0Var.f166607c.has("target_url")) {
                    Uri uri = Uri.parse(sw0Var.f166607c.getString("target_url"));
                    sw0Var.f166606b = uri;
                    sw0Var.f166610f = m186119f(uri);
                }
                if (sw0Var.f166607c.has("extras")) {
                    JSONObject jSONObject5 = sw0Var.f166607c.getJSONObject("extras");
                    if (jSONObject5.has("deeplink_context")) {
                        JSONObject jSONObject6 = jSONObject5.getJSONObject("deeplink_context");
                        if (jSONObject6.has("promo_code")) {
                            sw0Var.f166609e = jSONObject6.getString("promo_code");
                        }
                    }
                }
                sw0Var.f166608d = m186120h(sw0Var.f166607c);
                return sw0Var;
            }
        } catch (FacebookException e) {
            C1657e.m8846k0(f166604g, "Unable to parse AppLink JSON", e);
        } catch (JSONException e2) {
            C1657e.m8846k0(f166604g, "Unable to parse AppLink JSON", e2);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static void m186116c(Context context, String str, InterfaceC20042b interfaceC20042b) {
        ark0.m98521j(context, "context");
        ark0.m98521j(interfaceC20042b, "completionHandler");
        if (str == null) {
            str = C1657e.m8817J(context);
        }
        ark0.m98521j(str, "applicationId");
        C1577c.m8056u().execute(new RunnableC20041a(context.getApplicationContext(), str, interfaceC20042b));
    }

    /* JADX INFO: renamed from: d */
    public static void m186117d(Context context, InterfaceC20042b interfaceC20042b) {
        m186116c(context, null, interfaceC20042b);
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
    public static void m186118e(Context context, String str, InterfaceC20042b interfaceC20042b) {
        JSONObject jSONObject;
        Bundle bundle;
        JSONObject jSONObject2;
        Bundle bundle2;
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put(NotificationCompat.CATEGORY_EVENT, "DEFERRED_APP_LINK");
            C1657e.setAppEventAttributionParameters(jSONObject3, AttributionIdentifiers.m8643k(context), AppEventsLogger.m7642c(context), C1577c.m8022A(context));
            C1657e.m8809C0(jSONObject3, C1577c.m8047l());
            jSONObject3.put("application_package_name", context.getPackageName());
            String str2 = String.format("%s/activities", str);
            sw0 sw0VarM186115b = null;
            try {
                JSONObject graphObject = GraphRequest.m7507A(null, str2, jSONObject3, null).m7525j().getGraphObject();
                if (graphObject != null) {
                    String strOptString = graphObject.optString("applink_args");
                    long jOptLong = graphObject.optLong("click_time", -1L);
                    String strOptString2 = graphObject.optString("applink_class");
                    String strOptString3 = graphObject.optString("applink_url");
                    if (!TextUtils.isEmpty(strOptString) && (sw0VarM186115b = m186115b(strOptString)) != null) {
                        if (jOptLong != -1) {
                            try {
                                JSONObject jSONObject4 = sw0VarM186115b.f166607c;
                                if (jSONObject4 != null) {
                                    jSONObject4.put("com.facebook.platform.APPLINK_TAP_TIME_UTC", jOptLong);
                                }
                                Bundle bundle3 = sw0VarM186115b.f166608d;
                                if (bundle3 != null) {
                                    bundle3.putString("com.facebook.platform.APPLINK_TAP_TIME_UTC", Long.toString(jOptLong));
                                    if (strOptString2 != null) {
                                        try {
                                            jSONObject = sw0VarM186115b.f166607c;
                                            if (jSONObject != null) {
                                                jSONObject.put("com.facebook.platform.APPLINK_NATIVE_CLASS", strOptString2);
                                            }
                                            bundle = sw0VarM186115b.f166608d;
                                            if (bundle != null) {
                                                bundle.putString("com.facebook.platform.APPLINK_NATIVE_CLASS", strOptString2);
                                                if (strOptString3 != null) {
                                                    try {
                                                        jSONObject2 = sw0VarM186115b.f166607c;
                                                        if (jSONObject2 != null) {
                                                            jSONObject2.put("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                                        }
                                                        bundle2 = sw0VarM186115b.f166608d;
                                                        if (bundle2 != null) {
                                                            bundle2.putString("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                                        }
                                                    } catch (JSONException unused) {
                                                        C1657e.m8844j0(f166604g, "Unable to put app link URL in AppLinkData.arguments");
                                                    }
                                                }
                                            } else if (strOptString3 != null) {
                                                jSONObject2 = sw0VarM186115b.f166607c;
                                                if (jSONObject2 != null) {
                                                    jSONObject2.put("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                                }
                                                bundle2 = sw0VarM186115b.f166608d;
                                                if (bundle2 != null) {
                                                    bundle2.putString("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                                }
                                            }
                                        } catch (JSONException unused2) {
                                            C1657e.m8844j0(f166604g, "Unable to put app link class name in AppLinkData.arguments");
                                        }
                                    } else if (strOptString3 != null) {
                                        jSONObject2 = sw0VarM186115b.f166607c;
                                        if (jSONObject2 != null) {
                                            jSONObject2.put("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                        }
                                        bundle2 = sw0VarM186115b.f166608d;
                                        if (bundle2 != null) {
                                            bundle2.putString("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                        }
                                    }
                                } else if (strOptString2 != null) {
                                    jSONObject = sw0VarM186115b.f166607c;
                                    if (jSONObject != null) {
                                        jSONObject.put("com.facebook.platform.APPLINK_NATIVE_CLASS", strOptString2);
                                    }
                                    bundle = sw0VarM186115b.f166608d;
                                    if (bundle != null) {
                                        bundle.putString("com.facebook.platform.APPLINK_NATIVE_CLASS", strOptString2);
                                        if (strOptString3 != null) {
                                            jSONObject2 = sw0VarM186115b.f166607c;
                                            if (jSONObject2 != null) {
                                                jSONObject2.put("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                            }
                                            bundle2 = sw0VarM186115b.f166608d;
                                            if (bundle2 != null) {
                                                bundle2.putString("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                            }
                                        }
                                    } else if (strOptString3 != null) {
                                        jSONObject2 = sw0VarM186115b.f166607c;
                                        if (jSONObject2 != null) {
                                            jSONObject2.put("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                        }
                                        bundle2 = sw0VarM186115b.f166608d;
                                        if (bundle2 != null) {
                                            bundle2.putString("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                        }
                                    }
                                } else if (strOptString3 != null) {
                                    jSONObject2 = sw0VarM186115b.f166607c;
                                    if (jSONObject2 != null) {
                                        jSONObject2.put("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                    }
                                    bundle2 = sw0VarM186115b.f166608d;
                                    if (bundle2 != null) {
                                        bundle2.putString("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                    }
                                }
                            } catch (JSONException unused3) {
                                C1657e.m8844j0(f166604g, "Unable to put tap time in AppLinkData.arguments");
                            }
                        } else if (strOptString2 != null) {
                            jSONObject = sw0VarM186115b.f166607c;
                            if (jSONObject != null) {
                                jSONObject.put("com.facebook.platform.APPLINK_NATIVE_CLASS", strOptString2);
                            }
                            bundle = sw0VarM186115b.f166608d;
                            if (bundle != null) {
                                bundle.putString("com.facebook.platform.APPLINK_NATIVE_CLASS", strOptString2);
                                if (strOptString3 != null) {
                                    jSONObject2 = sw0VarM186115b.f166607c;
                                    if (jSONObject2 != null) {
                                        jSONObject2.put("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                    }
                                    bundle2 = sw0VarM186115b.f166608d;
                                    if (bundle2 != null) {
                                        bundle2.putString("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                    }
                                }
                            } else if (strOptString3 != null) {
                                jSONObject2 = sw0VarM186115b.f166607c;
                                if (jSONObject2 != null) {
                                    jSONObject2.put("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                }
                                bundle2 = sw0VarM186115b.f166608d;
                                if (bundle2 != null) {
                                    bundle2.putString("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                }
                            }
                        } else if (strOptString3 != null) {
                            jSONObject2 = sw0VarM186115b.f166607c;
                            if (jSONObject2 != null) {
                                jSONObject2.put("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                            }
                            bundle2 = sw0VarM186115b.f166608d;
                            if (bundle2 != null) {
                                bundle2.putString("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                            }
                        }
                    }
                }
            } catch (Exception unused4) {
                C1657e.m8844j0(f166604g, "Unable to fetch deferred applink from server");
            }
            interfaceC20042b.mo186122a(sw0VarM186115b);
        } catch (JSONException e) {
            throw new FacebookException("An error occurred while preparing deferred app link", e);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static JSONObject m186119f(@Nullable Uri uri) {
        if (lsb.m151554d(sw0.class) || uri == null) {
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
            lsb.m151552b(th, sw0.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static Bundle m186120h(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                bundle.putBundle(next, m186120h((JSONObject) obj));
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
                            bundleArr[i] = m186120h(jSONArray.getJSONObject(i));
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
    public Uri m186121g() {
        return this.f166606b;
    }
}
