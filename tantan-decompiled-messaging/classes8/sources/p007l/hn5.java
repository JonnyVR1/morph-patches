package p007l;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.p003p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.tantanapp.common.utils.CrashHelper;
import l.ikf0;
import org.joor.Reflect;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class hn5 {
    /* JADX INFO: renamed from: a */
    public static void m9344a(int i) {
        try {
            Reflect.on("android.graphics.Bitmap").set("sDefaultDensity", Integer.valueOf(i));
        } catch (Throwable th) {
            if (xck0.m11791c(th, NoSuchFieldException.class)) {
                return;
            }
            CrashHelper.c(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m9345b(Context context) {
        try {
            float f = Resources.getSystem().getDisplayMetrics().density;
            float f2 = Resources.getSystem().getDisplayMetrics().scaledDensity;
            int i = Resources.getSystem().getDisplayMetrics().densityDpi;
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            if (displayMetrics.density == f && displayMetrics.scaledDensity == f2 && displayMetrics.densityDpi == i) {
                return;
            }
            displayMetrics.scaledDensity = f2;
            displayMetrics.density = f;
            displayMetrics.densityDpi = i;
            m9344a(i);
        } catch (Throwable th) {
            CrashHelper.c(th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m9346c(Context context, int i) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            float f = displayMetrics.widthPixels / i;
            float f2 = Resources.getSystem().getDisplayMetrics().density;
            float f3 = Resources.getSystem().getDisplayMetrics().scaledDensity;
            displayMetrics.density = f;
            displayMetrics.scaledDensity = (f3 / f2) * f;
            int i2 = ((int) f) * LongLinkMessage.MsgTypeEnum.MSG_TYPE_LIVE_GIFT_RECEIVED_VALUE;
            displayMetrics.densityDpi = i2;
            m9344a(i2);
        } catch (Throwable th) {
            CrashHelper.c(th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m9347d(int i) {
        return i != 0 && ikf0.i(i) <= 320.0f;
    }
}
