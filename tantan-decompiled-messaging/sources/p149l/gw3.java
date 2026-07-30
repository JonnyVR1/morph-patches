package p149l;

import android.os.Bundle;
import android.webkit.JavascriptInterface;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class gw3 {

    /* JADX INFO: renamed from: a */
    private WeakReference<CleverTapAPI> f104655a;

    /* JADX INFO: renamed from: b */
    private WeakReference<CTInAppBaseFragment> f104656b;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public gw3(CleverTapAPI cleverTapAPI, CTInAppBaseFragment cTInAppBaseFragment) {
        this.f104655a = new WeakReference<>(null);
        this.f104656b = new WeakReference<>(null);
        this.f104655a = new WeakReference<>(cleverTapAPI);
        this.f104656b = new WeakReference<>(cTInAppBaseFragment);
    }

    @JavascriptInterface
    public void addMultiValueForKey(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.f104655a.get();
        if (cleverTapAPI == null) {
            Logger.m5865d("CleverTap Instance is null.");
        } else {
            cleverTapAPI.m5809m(str, str2);
        }
    }

    @JavascriptInterface
    public void addMultiValuesForKey(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.f104655a.get();
        if (cleverTapAPI == null) {
            Logger.m5865d("CleverTap Instance is null.");
            return;
        }
        if (str == null) {
            Logger.m5873v("Key passed to CTWebInterface is null");
            return;
        }
        if (str2 == null) {
            Logger.m5873v("values passed to CTWebInterface is null");
            return;
        }
        try {
            cleverTapAPI.m5811n(str, Utils.m5909f(new JSONArray(str2)));
        } catch (JSONException e) {
            Logger.m5873v("Unable to parse values from WebView " + e.getLocalizedMessage());
        }
    }

    @JavascriptInterface
    public void decrementValue(String str, double d) {
        CleverTapAPI cleverTapAPI = this.f104655a.get();
        if (cleverTapAPI == null) {
            Logger.m5865d("CleverTap Instance is null.");
        } else {
            cleverTapAPI.m5818v(str, Double.valueOf(d));
        }
    }

    @JavascriptInterface
    public void dismissInAppNotification() {
        if (this.f104655a.get() == null) {
            Logger.m5865d("CleverTap Instance is null.");
            return;
        }
        CTInAppBaseFragment cTInAppBaseFragment = this.f104656b.get();
        if (cTInAppBaseFragment != null) {
            cTInAppBaseFragment.m6387Y3(null);
        }
    }

    @JavascriptInterface
    public int getSdkVersion() {
        return 80200;
    }

    @JavascriptInterface
    public void incrementValue(String str, double d) {
        CleverTapAPI cleverTapAPI = this.f104655a.get();
        if (cleverTapAPI == null) {
            Logger.m5865d("CleverTap Instance is null.");
        } else {
            cleverTapAPI.m5796T(str, Double.valueOf(d));
        }
    }

    @JavascriptInterface
    public void onUserLogin(String str) {
        CleverTapAPI cleverTapAPI = this.f104655a.get();
        if (cleverTapAPI == null) {
            Logger.m5865d("CleverTap Instance is null.");
            return;
        }
        if (str == null) {
            Logger.m5873v("profile passed to CTWebInterface is null");
            return;
        }
        try {
            cleverTapAPI.m5801d0(Utils.m5910g(new JSONObject(str)));
        } catch (JSONException e) {
            Logger.m5873v("Unable to parse profile from WebView " + e.getLocalizedMessage());
        }
    }

    @JavascriptInterface
    public void promptPushPermission(boolean z) {
        CleverTapAPI cleverTapAPI = this.f104655a.get();
        if (cleverTapAPI == null) {
            Logger.m5865d("CleverTap Instance is null.");
        } else {
            dismissInAppNotification();
            cleverTapAPI.m5803g0(z);
        }
    }

    @JavascriptInterface
    public void pushChargedEvent(String str, String str2) {
        ArrayList<HashMap<String, Object>> arrayListM5908e;
        CleverTapAPI cleverTapAPI = this.f104655a.get();
        if (cleverTapAPI == null) {
            Logger.m5865d("CleverTap Instance is null.");
            return;
        }
        HashMap<String, Object> map = new HashMap<>();
        if (str == null) {
            Logger.m5873v("chargeDetails passed to CTWebInterface is null");
            return;
        }
        try {
            map = Utils.m5910g(new JSONObject(str));
        } catch (JSONException e) {
            Logger.m5873v("Unable to parse chargeDetails for Charged Event from WebView " + e.getLocalizedMessage());
        }
        if (str2 != null) {
            try {
                arrayListM5908e = Utils.m5908e(new JSONArray(str2));
            } catch (JSONException e2) {
                Logger.m5873v("Unable to parse items for Charged Event from WebView " + e2.getLocalizedMessage());
                arrayListM5908e = null;
            }
            cleverTapAPI.m5804h0(map, arrayListM5908e);
        }
    }

    @JavascriptInterface
    public void pushEvent(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.f104655a.get();
        if (cleverTapAPI == null) {
            Logger.m5865d("CleverTap Instance is null.");
            return;
        }
        if (str2 == null) {
            Logger.m5873v("eventActions passed to CTWebInterface is null");
            return;
        }
        try {
            cleverTapAPI.m5806j0(str, Utils.m5910g(new JSONObject(str2)));
        } catch (JSONException e) {
            Logger.m5873v("Unable to parse eventActions from WebView " + e.getLocalizedMessage());
        }
    }

    @JavascriptInterface
    public void pushProfile(String str) {
        CleverTapAPI cleverTapAPI = this.f104655a.get();
        if (cleverTapAPI == null) {
            Logger.m5865d("CleverTap Instance is null.");
            return;
        }
        if (str == null) {
            Logger.m5873v("profile passed to CTWebInterface is null");
            return;
        }
        try {
            cleverTapAPI.m5812n0(Utils.m5910g(new JSONObject(str)));
        } catch (JSONException e) {
            Logger.m5873v("Unable to parse profile from WebView " + e.getLocalizedMessage());
        }
    }

    @JavascriptInterface
    public void removeMultiValueForKey(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.f104655a.get();
        if (cleverTapAPI == null) {
            Logger.m5865d("CleverTap Instance is null.");
            return;
        }
        if (str == null) {
            Logger.m5873v("Key passed to CTWebInterface is null");
        } else if (str2 == null) {
            Logger.m5873v("Value passed to CTWebInterface is null");
        } else {
            cleverTapAPI.m5813o0(str, str2);
        }
    }

    @JavascriptInterface
    public void removeMultiValuesForKey(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.f104655a.get();
        if (cleverTapAPI == null) {
            Logger.m5865d("CleverTap Instance is null.");
            return;
        }
        if (str == null) {
            Logger.m5873v("Key passed to CTWebInterface is null");
            return;
        }
        if (str2 == null) {
            Logger.m5873v("values passed to CTWebInterface is null");
            return;
        }
        try {
            cleverTapAPI.m5814p0(str, Utils.m5909f(new JSONArray(str2)));
        } catch (JSONException e) {
            Logger.m5873v("Unable to parse values from WebView " + e.getLocalizedMessage());
        }
    }

    @JavascriptInterface
    public void removeValueForKey(String str) {
        CleverTapAPI cleverTapAPI = this.f104655a.get();
        if (cleverTapAPI == null) {
            Logger.m5865d("CleverTap Instance is null.");
        } else if (str == null) {
            Logger.m5873v("Key passed to CTWebInterface is null");
        } else {
            cleverTapAPI.m5815r0(str);
        }
    }

    @JavascriptInterface
    public void setMultiValueForKey(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.f104655a.get();
        if (cleverTapAPI == null) {
            Logger.m5865d("CleverTap Instance is null.");
            return;
        }
        if (str == null) {
            Logger.m5873v("Key passed to CTWebInterface is null");
            return;
        }
        if (str2 == null) {
            Logger.m5873v("values passed to CTWebInterface is null");
            return;
        }
        try {
            cleverTapAPI.m5824z0(str, Utils.m5909f(new JSONArray(str2)));
        } catch (JSONException e) {
            Logger.m5873v("Unable to parse values from WebView " + e.getLocalizedMessage());
        }
    }

    @JavascriptInterface
    public void triggerInAppAction(String str, String str2, String str3) throws UnsupportedEncodingException {
        if (this.f104655a.get() == null) {
            Logger.m5865d("CTWebInterface CleverTap Instance is null.");
            return;
        }
        CTInAppBaseFragment cTInAppBaseFragment = this.f104656b.get();
        if (cTInAppBaseFragment == null) {
            Logger.m5865d("CTWebInterface Fragment is null");
            return;
        }
        if (str == null) {
            Logger.m5865d("CTWebInterface action JSON is null");
            return;
        }
        try {
            CTInAppAction cTInAppActionM6123c = CTInAppAction.m6123c(new JSONObject(str));
            if (cTInAppActionM6123c == null) {
                Logger.m5865d("CTWebInterface invalid action JSON: ".concat(str));
                return;
            }
            Bundle bundle = new Bundle();
            if (str3 != null) {
                bundle.putString("button_id", str3);
            }
            cTInAppBaseFragment.m6407t4(cTInAppActionM6123c, str2, bundle);
        } catch (JSONException unused) {
            Logger.m5865d("CTWebInterface invalid action JSON: ".concat(str));
        }
    }

    @JavascriptInterface
    public void pushEvent(String str) {
        CleverTapAPI cleverTapAPI = this.f104655a.get();
        if (cleverTapAPI == null) {
            Logger.m5865d("CleverTap Instance is null.");
        } else {
            cleverTapAPI.m5805i0(str);
        }
    }
}
