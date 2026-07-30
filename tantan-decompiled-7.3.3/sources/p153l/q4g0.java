package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.view.Window;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import io.agora.rtc2.internal.AudioRoutingController;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes7.dex */
public class q4g0 {

    /* JADX INFO: renamed from: a */
    private static int f155590a = -404;

    /* JADX INFO: renamed from: a */
    public static int m175213a(int i, int i2) {
        float f = 1.0f - (i2 / 255.0f);
        return ((int) (((double) ((i & 255) * f)) + 0.5d)) | (((int) (((double) (((i >> 16) & 255) * f)) + 0.5d)) << 16) | RoundedDrawable.DEFAULT_BORDER_COLOR | (((int) (((double) (((i >> 8) & 255) * f)) + 0.5d)) << 8);
    }

    /* JADX INFO: renamed from: b */
    public static int m175214b(Context context) {
        Resources resources;
        int identifier;
        if (!m175216d(context) || (identifier = (resources = context.getResources()).getIdentifier("navigation_bar_height", "dimen", "android")) <= 0) {
            return 0;
        }
        return resources.getDimensionPixelSize(identifier);
    }

    /* JADX INFO: renamed from: c */
    public static int m175215c(Context context) {
        int i = f155590a;
        if (i != -404) {
            return i;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
        if (dimensionPixelSize == 0) {
            dimensionPixelSize = Math.round(TypedValue.applyDimension(1, 25.0f, context.getResources().getDisplayMetrics()));
        }
        f155590a = dimensionPixelSize;
        return dimensionPixelSize;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m175216d(Context context) {
        Resources resources;
        int identifier;
        return context != null && (identifier = (resources = context.getResources()).getIdentifier("config_showNavigationBar", "bool", "android")) > 0 && resources.getBoolean(identifier);
    }

    /* JADX INFO: renamed from: e */
    public static void m175217e(Activity activity, @ColorInt int i, int i2) {
        if (m175219g()) {
            try {
                activity.getWindow().addFlags(Integer.MIN_VALUE);
                activity.getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
                activity.getWindow().setStatusBarColor(m175213a(i, i2));
            } catch (Exception e) {
                Log.e("StatusBarUtil", "", e);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m175218f(@NonNull Window window) {
        if (window == null || window.getDecorView() == null) {
            return;
        }
        window.clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
        window.setStatusBarColor(0);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m175219g() {
        return true;
    }
}
