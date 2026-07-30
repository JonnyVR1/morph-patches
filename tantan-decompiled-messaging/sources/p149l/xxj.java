package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextUtils;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes4.dex */
public class xxj {
    /* JADX INFO: renamed from: a */
    public static GradientDrawable m211500a(BLiveGiftItem bLiveGiftItem) {
        String str;
        String str2;
        if (TextUtils.isEmpty(bLiveGiftItem.startRightTagColor) || TextUtils.isEmpty(bLiveGiftItem.endRightTagColor)) {
            return null;
        }
        try {
            float fM186890d = t100.m186890d(4.0f);
            float[] fArr = {fM186890d, fM186890d, fM186890d, fM186890d, fM186890d, fM186890d, fM186890d, fM186890d};
            if (bLiveGiftItem.startRightTagColor.charAt(0) == '#') {
                str = bLiveGiftItem.startRightTagColor;
            } else {
                str = "#" + bLiveGiftItem.startRightTagColor;
            }
            if (bLiveGiftItem.endRightTagColor.charAt(0) == '#') {
                str2 = bLiveGiftItem.endRightTagColor;
            } else {
                str2 = "#" + bLiveGiftItem.endRightTagColor;
            }
            return m211501b(str, str2, fArr);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static GradientDrawable m211501b(String str, String str2, float[] fArr) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setCornerRadii(fArr);
        gradientDrawable.setColors(new int[]{kvc0.m147358g(str), kvc0.m147358g(str2)});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: c */
    public static GradientDrawable m211502c(BLiveGiftItem bLiveGiftItem) {
        String str;
        String str2;
        if (TextUtils.isEmpty(bLiveGiftItem.startTagColor) || TextUtils.isEmpty(bLiveGiftItem.endTagColor)) {
            return null;
        }
        try {
            float fM186890d = t100.m186890d(4.0f);
            float[] fArr = {fM186890d, fM186890d, fM186890d, fM186890d, fM186890d, fM186890d, fM186890d, fM186890d};
            if (bLiveGiftItem.startTagColor.charAt(0) == '#') {
                str = bLiveGiftItem.startTagColor;
            } else {
                str = "#" + bLiveGiftItem.startTagColor;
            }
            if (bLiveGiftItem.endTagColor.charAt(0) == '#') {
                str2 = bLiveGiftItem.endTagColor;
            } else {
                str2 = "#" + bLiveGiftItem.endTagColor;
            }
            return m211501b(str, str2, fArr);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m211503d(TextView textView) {
        m211505f(textView, "975MaruSC-Medium.ttf");
    }

    /* JADX INFO: renamed from: e */
    public static void m211504e(TextView textView, Typeface typeface) {
        textView.setTypeface(typeface);
    }

    /* JADX INFO: renamed from: f */
    public static void m211505f(TextView textView, String str) {
        textView.setTypeface(Typeface.createFromAsset(textView.getContext().getResources().getAssets(), str));
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: g */
    public static void m211506g(Context context) {
        Vibrator vibrator;
        if (context == null || (vibrator = (Vibrator) context.getSystemService("vibrator")) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createOneShot(50L, 100));
        } else {
            vibrator.vibrate(50L);
        }
    }
}
