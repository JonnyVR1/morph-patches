package tech.sud.runtime.component.p021c;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Vibrator;
import android.provider.Settings;
import android.view.Window;
import android.view.WindowManager;
import l.ii5;
import org.json.JSONObject;

/* JADX INFO: renamed from: tech.sud.runtime.component.c.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class C1202c {
    /* JADX INFO: renamed from: a */
    public static String m10092a(Context context) {
        if (context == null) {
            return "";
        }
        try {
            Intent intentL = ii5.l(context, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = intentL.getIntExtra("status", -1);
            boolean z = intExtra == 2 || intExtra == 5;
            int iRound = Math.round((intentL.getIntExtra("level", -1) * 100) / intentL.getIntExtra("scale", -1));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("level", "" + iRound);
            jSONObject.put("isCharging", z);
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m10099b(Context context) {
        ClipData primaryClip;
        return (context == null || (primaryClip = ((ClipboardManager) context.getSystemService("clipboard")).getPrimaryClip()) == null) ? "" : primaryClip.getItemAt(0).getText().toString();
    }

    /* JADX INFO: renamed from: a */
    public static void m10095a(Activity activity, String str) {
        if (activity == null) {
            return;
        }
        str.getClass();
    }

    /* JADX INFO: renamed from: a */
    public static void m10096a(Activity activity, boolean z) {
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
    public static void m10094a(Activity activity, int i, int i2) {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m10098a(Context context, String str) {
        if (context == null) {
            return false;
        }
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("sud clip data", str));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000f A[PHI: r1
      0x000f: PHI (r1v2 float) = (r1v0 float), (r1v1 float) binds: [B:3:0x000d, B:6:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public static void m10093a(Activity activity, float f) {
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
    public static float m10091a(Activity activity) {
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
    public static void m10097a(Context context, int i) {
        if (context == null) {
            return;
        }
        ((Vibrator) context.getSystemService("vibrator")).vibrate(i);
    }
}
