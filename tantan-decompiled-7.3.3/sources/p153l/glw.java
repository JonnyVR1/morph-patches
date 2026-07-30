package p153l;

import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.GeolocationPermissions;
import androidx.annotation.NonNull;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.net.URI;
import java.net.URISyntaxException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class glw {

    /* JADX INFO: renamed from: a */
    private static final String[] f104890a = {"?", "\\", "@"};

    /* JADX INFO: renamed from: b */
    private static Boolean f104891b = Boolean.FALSE;

    /* JADX INFO: renamed from: c */
    private static final String[] f104892c = {"~!-", "~~", "--", "--~", "~--", "-~-", "~~-", "!~~", "-!~", "~-!"};

    /* JADX INFO: renamed from: l.glw$a */
    public class DialogInterfaceOnClickListenerC17245a implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ GeolocationPermissions.Callback f104893a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f104894b;

        public DialogInterfaceOnClickListenerC17245a(GeolocationPermissions.Callback callback, String str) {
            this.f104893a = callback;
            this.f104894b = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.f104893a.invoke(this.f104894b, true, true);
        }
    }

    /* JADX INFO: renamed from: l.glw$b */
    public class DialogInterfaceOnCancelListenerC17246b implements DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ GeolocationPermissions.Callback f104895a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f104896b;

        public DialogInterfaceOnCancelListenerC17246b(GeolocationPermissions.Callback callback, String str) {
            this.f104895a = callback;
            this.f104896b = str;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            this.f104895a.invoke(this.f104896b, false, true);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m130704a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return str.replaceAll(str2, "\\\\");
            } catch (Exception e) {
                Log.e("MKUtils", "", e);
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m130705b(String[] strArr, Object[] objArr) {
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < strArr.length; i++) {
            try {
                jSONObject.put(strArr[i], objArr[i]);
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public static String m130706c(String str) {
        for (String str2 : f104892c) {
            if (!str.contains(str2)) {
                return str2;
            }
        }
        return f104892c[0];
    }

    /* JADX INFO: renamed from: d */
    public static String m130707d(@NonNull JSONObject jSONObject) {
        try {
            return jSONObject.optString("callback");
        } catch (Exception e) {
            Log.e("getJsCallback", "", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static long m130708e() {
        try {
            ActivityManager activityManager = (ActivityManager) lv0.m155971a().getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.availMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        } catch (Throwable th) {
            Log.e("MK---WebView", "", th);
            return -1L;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m130709f(String str) throws URISyntaxException {
        URI uri = new URI(str);
        return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m130710g(String str) {
        return "about:blank".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m130711h() {
        if (f104891b.booleanValue()) {
            return true;
        }
        if (rs8.m182927r()) {
            f104891b = Boolean.TRUE;
            return true;
        }
        try {
            float fM155251g = lpj0.m155251g();
            float fM155252h = lpj0.m155252h();
            if (fM155251g > 0.0f && fM155252h > 0.0f && fM155252h / fM155251g >= 0.7f) {
                f104891b = Boolean.TRUE;
            }
        } catch (Throwable th) {
            Log.e("momo", "", th);
            f104891b = Boolean.FALSE;
        }
        return f104891b.booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m130712i(String str) {
        i5m i5mVarM186322k = sjw.m186322k();
        return i5mVarM186322k != null && i5mVarM186322k.mo115651f(str);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m130713j(String str) {
        return m130714k(str, null);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m130714k(String str, String str2) {
        i5m i5mVarM186322k = sjw.m186322k();
        return (i5mVarM186322k != null && i5mVarM186322k.mo115651f(str)) || m130715l(str) || bfe0.m103887b(str2, str);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m130715l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : f104890a) {
            if (str.contains(str2)) {
                return false;
            }
        }
        return str.endsWith(".immomo.com") || str.endsWith(".wemomo.com") || str.endsWith(".immomogame.com") || str.endsWith(".igamesofficial.com") || str.endsWith(".immomogame.com") || str.endsWith(".liuxing.im") || str.endsWith(".hellogroup.com");
    }

    /* JADX INFO: renamed from: m */
    public static String m130716m(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return str.replaceAll("\\\\", str2);
            } catch (Exception e) {
                Log.e("MKUtils", "", e);
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m130717n(View view, String str, GeolocationPermissions.Callback callback) {
        if (view == 0 || view.getContext() == null || callback == null) {
            return;
        }
        Context context = view.getContext();
        if (view instanceof hul) {
            context = ((hul) view).getRealContext();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage("此网页正在获取你的地理位置信息，是否允许？");
        builder.setPositiveButton("允许", new DialogInterfaceOnClickListenerC17245a(callback, str));
        builder.setNegativeButton("不允许", (DialogInterface.OnClickListener) null);
        builder.setOnCancelListener(new DialogInterfaceOnCancelListenerC17246b(callback, str));
        builder.show();
    }

    /* JADX INFO: renamed from: o */
    public static String m130718o(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return str.replace("\\", "\\\\").replace("\"", "\\\"").replace("'", "\\'").replace("\r", "\\r").replace(SignParameters.NEW_LINE, "\\n").replace("\f", "\\f");
            } catch (Exception e) {
                Log.e("MKUtils", "", e);
            }
        }
        return str;
    }
}
