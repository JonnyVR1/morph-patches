package p153l;

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
public class fx3 {

    /* JADX INFO: renamed from: a */
    private WeakReference<CleverTapAPI> f101233a;

    /* JADX INFO: renamed from: b */
    private WeakReference<CTInAppBaseFragment> f101234b;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public fx3(CleverTapAPI cleverTapAPI, CTInAppBaseFragment cTInAppBaseFragment) {
        this.f101233a = new WeakReference<>(null);
        this.f101234b = new WeakReference<>(null);
        this.f101233a = new WeakReference<>(cleverTapAPI);
        this.f101234b = new WeakReference<>(cTInAppBaseFragment);
    }

    @JavascriptInterface
    public void addMultiValueForKey(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.f101233a.get();
        if (cleverTapAPI == null) {
            Logger.m5919d("CleverTap Instance is null.");
        } else {
            cleverTapAPI.m5863m(str, str2);
        }
    }

    @JavascriptInterface
    public void addMultiValuesForKey(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.f101233a.get();
        if (cleverTapAPI == null) {
            Logger.m5919d("CleverTap Instance is null.");
            return;
        }
        if (str == null) {
            Logger.m5927v("Key passed to CTWebInterface is null");
            return;
        }
        if (str2 == null) {
            Logger.m5927v("values passed to CTWebInterface is null");
            return;
        }
        try {
            cleverTapAPI.m5865n(str, Utils.m5963f(new JSONArray(str2)));
        } catch (JSONException e) {
            Logger.m5927v("Unable to parse values from WebView " + e.getLocalizedMessage());
        }
    }

    @JavascriptInterface
    public void decrementValue(String str, double d) {
        CleverTapAPI cleverTapAPI = this.f101233a.get();
        if (cleverTapAPI == null) {
            Logger.m5919d("CleverTap Instance is null.");
        } else {
            cleverTapAPI.m5872v(str, Double.valueOf(d));
        }
    }

    @JavascriptInterface
    public void dismissInAppNotification() {
        if (this.f101233a.get() == null) {
            Logger.m5919d("CleverTap Instance is null.");
            return;
        }
        CTInAppBaseFragment cTInAppBaseFragment = this.f101234b.get();
        if (cTInAppBaseFragment != null) {
            cTInAppBaseFragment.m6441Y3(null);
        }
    }

    @JavascriptInterface
    public int getSdkVersion() {
        return 80200;
    }

    @JavascriptInterface
    public void incrementValue(String str, double d) {
        CleverTapAPI cleverTapAPI = this.f101233a.get();
        if (cleverTapAPI == null) {
            Logger.m5919d("CleverTap Instance is null.");
        } else {
            cleverTapAPI.m5850T(str, Double.valueOf(d));
        }
    }

    @JavascriptInterface
    public void onUserLogin(String str) {
        CleverTapAPI cleverTapAPI = this.f101233a.get();
        if (cleverTapAPI == null) {
            Logger.m5919d("CleverTap Instance is null.");
            return;
        }
        if (str == null) {
            Logger.m5927v("profile passed to CTWebInterface is null");
            return;
        }
        try {
            cleverTapAPI.m5855d0(Utils.m5964g(new JSONObject(str)));
        } catch (JSONException e) {
            Logger.m5927v("Unable to parse profile from WebView " + e.getLocalizedMessage());
        }
    }

    @JavascriptInterface
    public void promptPushPermission(boolean z) {
        CleverTapAPI cleverTapAPI = this.f101233a.get();
        if (cleverTapAPI == null) {
            Logger.m5919d("CleverTap Instance is null.");
        } else {
            dismissInAppNotification();
            cleverTapAPI.m5857g0(z);
        }
    }

    @JavascriptInterface
    public void pushChargedEvent(String str, String str2) {
        ArrayList<HashMap<String, Object>> arrayListM5962e;
        CleverTapAPI cleverTapAPI = this.f101233a.get();
        if (cleverTapAPI == null) {
            Logger.m5919d("CleverTap Instance is null.");
            return;
        }
        HashMap<String, Object> map = new HashMap<>();
        if (str == null) {
            Logger.m5927v("chargeDetails passed to CTWebInterface is null");
            return;
        }
        try {
            map = Utils.m5964g(new JSONObject(str));
        } catch (JSONException e) {
            Logger.m5927v("Unable to parse chargeDetails for Charged Event from WebView " + e.getLocalizedMessage());
        }
        if (str2 != null) {
            try {
                arrayListM5962e = Utils.m5962e(new JSONArray(str2));
            } catch (JSONException e2) {
                Logger.m5927v("Unable to parse items for Charged Event from WebView " + e2.getLocalizedMessage());
                arrayListM5962e = null;
            }
            cleverTapAPI.m5858h0(map, arrayListM5962e);
        }
    }

    @JavascriptInterface
    public void pushEvent(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.f101233a.get();
        if (cleverTapAPI == null) {
            Logger.m5919d("CleverTap Instance is null.");
            return;
        }
        if (str2 == null) {
            Logger.m5927v("eventActions passed to CTWebInterface is null");
            return;
        }
        try {
            cleverTapAPI.m5860j0(str, Utils.m5964g(new JSONObject(str2)));
        } catch (JSONException e) {
            Logger.m5927v("Unable to parse eventActions from WebView " + e.getLocalizedMessage());
        }
    }

    @JavascriptInterface
    public void pushProfile(String str) {
        CleverTapAPI cleverTapAPI = this.f101233a.get();
        if (cleverTapAPI == null) {
            Logger.m5919d("CleverTap Instance is null.");
            return;
        }
        if (str == null) {
            Logger.m5927v("profile passed to CTWebInterface is null");
            return;
        }
        try {
            cleverTapAPI.m5866n0(Utils.m5964g(new JSONObject(str)));
        } catch (JSONException e) {
            Logger.m5927v("Unable to parse profile from WebView " + e.getLocalizedMessage());
        }
    }

    @JavascriptInterface
    public void removeMultiValueForKey(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.f101233a.get();
        if (cleverTapAPI == null) {
            Logger.m5919d("CleverTap Instance is null.");
            return;
        }
        if (str == null) {
            Logger.m5927v("Key passed to CTWebInterface is null");
        } else if (str2 == null) {
            Logger.m5927v("Value passed to CTWebInterface is null");
        } else {
            cleverTapAPI.m5867o0(str, str2);
        }
    }

    @JavascriptInterface
    public void removeMultiValuesForKey(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.f101233a.get();
        if (cleverTapAPI == null) {
            Logger.m5919d("CleverTap Instance is null.");
            return;
        }
        if (str == null) {
            Logger.m5927v("Key passed to CTWebInterface is null");
            return;
        }
        if (str2 == null) {
            Logger.m5927v("values passed to CTWebInterface is null");
            return;
        }
        try {
            cleverTapAPI.m5868p0(str, Utils.m5963f(new JSONArray(str2)));
        } catch (JSONException e) {
            Logger.m5927v("Unable to parse values from WebView " + e.getLocalizedMessage());
        }
    }

    @JavascriptInterface
    public void removeValueForKey(String str) {
        CleverTapAPI cleverTapAPI = this.f101233a.get();
        if (cleverTapAPI == null) {
            Logger.m5919d("CleverTap Instance is null.");
        } else if (str == null) {
            Logger.m5927v("Key passed to CTWebInterface is null");
        } else {
            cleverTapAPI.m5869r0(str);
        }
    }

    @JavascriptInterface
    public void setMultiValueForKey(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.f101233a.get();
        if (cleverTapAPI == null) {
            Logger.m5919d("CleverTap Instance is null.");
            return;
        }
        if (str == null) {
            Logger.m5927v("Key passed to CTWebInterface is null");
            return;
        }
        if (str2 == null) {
            Logger.m5927v("values passed to CTWebInterface is null");
            return;
        }
        try {
            cleverTapAPI.m5878z0(str, Utils.m5963f(new JSONArray(str2)));
        } catch (JSONException e) {
            Logger.m5927v("Unable to parse values from WebView " + e.getLocalizedMessage());
        }
    }

    @JavascriptInterface
    public void triggerInAppAction(String str, String str2, String str3) throws UnsupportedEncodingException {
        if (this.f101233a.get() == null) {
            Logger.m5919d("CTWebInterface CleverTap Instance is null.");
            return;
        }
        CTInAppBaseFragment cTInAppBaseFragment = this.f101234b.get();
        if (cTInAppBaseFragment == null) {
            Logger.m5919d("CTWebInterface Fragment is null");
            return;
        }
        if (str == null) {
            Logger.m5919d("CTWebInterface action JSON is null");
            return;
        }
        try {
            CTInAppAction cTInAppActionM6177c = CTInAppAction.m6177c(new JSONObject(str));
            if (cTInAppActionM6177c == null) {
                Logger.m5919d("CTWebInterface invalid action JSON: ".concat(str));
                return;
            }
            Bundle bundle = new Bundle();
            if (str3 != null) {
                bundle.putString("button_id", str3);
            }
            cTInAppBaseFragment.m6461t4(cTInAppActionM6177c, str2, bundle);
        } catch (JSONException unused) {
            Logger.m5919d("CTWebInterface invalid action JSON: ".concat(str));
        }
    }

    @JavascriptInterface
    public void pushEvent(String str) {
        CleverTapAPI cleverTapAPI = this.f101233a.get();
        if (cleverTapAPI == null) {
            Logger.m5919d("CleverTap Instance is null.");
        } else {
            cleverTapAPI.m5859i0(str);
        }
    }
}
