package p149l;

import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.View;
import android.webkit.GeolocationPermissions;
import androidx.annotation.NonNull;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.cosmos.mdlog.MDLog;
import com.immomo.mmutil.log.Log4Android;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.net.URI;
import java.net.URISyntaxException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class liw {

    /* JADX INFO: renamed from: a */
    private static final String[] f128262a = {"?", "\\", "@"};

    /* JADX INFO: renamed from: b */
    private static final String[] f128263b = {"~!-", "~~", "--", "--~", "~--", "-~-", "~~-", "!~~", "-!~", "~-!"};

    /* JADX INFO: renamed from: l.liw$a */
    public class DialogInterfaceOnClickListenerC18230a implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ GeolocationPermissions.Callback f128264a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f128265b;

        public DialogInterfaceOnClickListenerC18230a(GeolocationPermissions.Callback callback, String str) {
            this.f128264a = callback;
            this.f128265b = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.f128264a.invoke(this.f128265b, true, true);
            MDLog.m7389d("MKUtils", "processWebGeoRequest=====Allow");
        }
    }

    /* JADX INFO: renamed from: l.liw$b */
    public class DialogInterfaceOnCancelListenerC18231b implements DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ GeolocationPermissions.Callback f128266a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f128267b;

        public DialogInterfaceOnCancelListenerC18231b(GeolocationPermissions.Callback callback, String str) {
            this.f128266a = callback;
            this.f128267b = str;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            this.f128266a.invoke(this.f128267b, false, true);
            MDLog.m7389d("MKUtils", "processWebGeoRequest=====Dis-Allow");
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m149940a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return str.replaceAll(str2, "\\\\");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m149941b(String[] strArr, Object[] objArr) {
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
    public static String m149942c(String str) {
        for (String str2 : f128263b) {
            if (!str.contains(str2)) {
                return str2;
            }
        }
        return f128263b[0];
    }

    /* JADX INFO: renamed from: d */
    public static String m149943d(@NonNull JSONObject jSONObject) {
        try {
            return jSONObject.optString("callback");
        } catch (Exception e) {
            Log4Android.m18417f().m18422e(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static long m149944e() {
        try {
            ActivityManager activityManager = (ActivityManager) ev0.m118233a().getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.availMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        } catch (Throwable th) {
            MDLog.printErrStackTrace("MK---WebView", th);
            return -1L;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m149945f(String str) throws URISyntaxException {
        URI uri = new URI(str);
        return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m149946g(String str) {
        return "about:blank".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m149947h(String str) {
        p2m p2mVarM184294n = shw.m184294n();
        return p2mVarM184294n != null && p2mVarM184294n.mo110236h(str);
    }

    /* JADX INFO: renamed from: i */
    public static String m149948i(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return str.replaceAll("\\\\", str2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: j */
    public static void m149949j(View view, String str, GeolocationPermissions.Callback callback) {
        if (view == null || view.getContext() == null || callback == null) {
            return;
        }
        Context context = view.getContext();
        if (view instanceof MKWebView) {
            context = ((MKWebView) view).getRealContext();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage("此网页正在获取你的地理位置信息，是否允许？");
        builder.setPositiveButton("允许", new DialogInterfaceOnClickListenerC18230a(callback, str));
        builder.setNegativeButton("不允许", (DialogInterface.OnClickListener) null);
        builder.setOnCancelListener(new DialogInterfaceOnCancelListenerC18231b(callback, str));
        builder.show();
    }

    /* JADX INFO: renamed from: k */
    public static String m149950k(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return str.replace("\\", "\\\\").replace("\"", "\\\"").replace("'", "\\'").replace("\r", "\\r").replace(SignParameters.NEW_LINE, "\\n").replace("\f", "\\f");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return str;
    }
}
