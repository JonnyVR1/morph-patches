package tech.sud.gip.core.view.utils;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes3.dex */
public class SizeUtils {
    public static float dp2px(float f) {
        return f * Resources.getSystem().getDisplayMetrics().density;
    }

    public static int px2dp(float f) {
        return (int) ((f / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }
}
