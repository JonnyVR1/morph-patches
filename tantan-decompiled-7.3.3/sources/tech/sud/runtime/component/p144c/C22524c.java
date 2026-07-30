package tech.sud.runtime.component.p144c;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Vibrator;
import android.provider.Settings;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.app.NotificationCompat;
import com.bytedance.bpea.entry.common.DataType;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.momo.mcamera.mask.BigEyeFilter;
import org.json.JSONObject;
import p153l.jj5;

/* JADX INFO: renamed from: tech.sud.runtime.component.c.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C22524c {
    /* JADX INFO: renamed from: a */
    public static String m222867a(Context context) {
        if (context == null) {
            return "";
        }
        try {
            Intent intentM145018l = jj5.m145018l(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = intentM145018l.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            boolean z = intExtra == 2 || intExtra == 5;
            int iRound = Math.round((intentM145018l.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1) * 100) / intentM145018l.getIntExtra(BigEyeFilter.UNIFORM_SCALE, -1));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FirebaseAnalytics.Param.LEVEL, "" + iRound);
            jSONObject.put("isCharging", z);
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m222874b(Context context) {
        ClipData primaryClip;
        return (context == null || (primaryClip = ((ClipboardManager) context.getSystemService(DataType.CLIPBOARD)).getPrimaryClip()) == null) ? "" : primaryClip.getItemAt(0).getText().toString();
    }

    /* JADX INFO: renamed from: a */
    public static void m222870a(Activity activity, String str) {
        if (activity == null) {
            return;
        }
        str.getClass();
    }

    /* JADX INFO: renamed from: a */
    public static void m222871a(Activity activity, boolean z) {
        if (activity == null) {
            return;
        }
        if (z) {
            activity.getWindow().addFlags(128);
        } else {
            activity.getWindow().clearFlags(128);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m222869a(Activity activity, int i, int i2) {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m222873a(Context context, String str) {
        if (context == null) {
            return false;
        }
        ((ClipboardManager) context.getSystemService(DataType.CLIPBOARD)).setPrimaryClip(ClipData.newPlainText("sud clip data", str));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000f A[PHI: r1
      0x000f: PHI (r1v2 float) = (r1v0 float), (r1v1 float) binds: [B:3:0x000d, B:6:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public static void m222868a(Activity activity, float f) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        float f2 = 0.01f;
        if (f < 0.01f) {
            f = f2;
        } else {
            f2 = 1.0f;
            if (f > 1.0f) {
                f = f2;
            }
        }
        attributes.screenBrightness = f;
        window.setAttributes(attributes);
    }

    /* JADX INFO: renamed from: a */
    public static float m222866a(Activity activity) {
        float f = 0.0f;
        if (activity == null) {
            return 0.0f;
        }
        try {
            float f2 = activity.getWindow().getAttributes().screenBrightness;
            if (f2 >= 0.0f) {
                return f2;
            }
            try {
                return Settings.System.getInt(activity.getContentResolver(), "screen_brightness", 0) / 255.0f;
            } catch (Exception e) {
                e = e;
                f = f2;
                e.printStackTrace();
                return f;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m222872a(Context context, int i) {
        if (context == null) {
            return;
        }
        ((Vibrator) context.getSystemService("vibrator")).vibrate(i);
    }
}
