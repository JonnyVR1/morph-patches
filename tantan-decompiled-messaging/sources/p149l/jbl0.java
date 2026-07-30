package p149l;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class jbl0 {

    /* JADX INFO: renamed from: a */
    public static Method f117198a;

    /* JADX INFO: renamed from: l.jbl0$a */
    @RequiresApi(26)
    public static class C17738a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static float m140797a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static float m140798b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* JADX INFO: renamed from: l.jbl0$b */
    @RequiresApi(28)
    public static class C17739b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static int m140799a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static boolean m140800b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    /* JADX INFO: renamed from: l.jbl0$c */
    @RequiresApi(34)
    public static class C17740c {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static int m140801a(@NonNull ViewConfiguration viewConfiguration, int i, int i2, int i3) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static int m140802b(@NonNull ViewConfiguration viewConfiguration, int i, int i2, int i3) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
        }
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f117198a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m140784a(Resources resources, int i, uyg0<Integer> uyg0Var, int i2) {
        int dimensionPixelSize;
        if (i != -1) {
            return (i == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i)) < 0) ? i2 : dimensionPixelSize;
        }
        return uyg0Var.get().intValue();
    }

    /* JADX INFO: renamed from: b */
    public static float m140785b(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f117198a) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, null)).intValue();
            } catch (Exception unused) {
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public static int m140786c(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    /* JADX INFO: renamed from: d */
    public static int m140787d(Resources resources, int i, int i2) {
        if (i == 4194304 && i2 == 26) {
            return m140786c(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public static int m140788e(Resources resources, int i, int i2) {
        if (i == 4194304 && i2 == 26) {
            return m140786c(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static float m140789f(@NonNull ViewConfiguration viewConfiguration, @NonNull Context context) {
        return Build.VERSION.SDK_INT >= 26 ? C17738a.m140797a(viewConfiguration) : m140785b(viewConfiguration, context);
    }

    /* JADX INFO: renamed from: g */
    public static int m140790g(@NonNull ViewConfiguration viewConfiguration) {
        return Build.VERSION.SDK_INT >= 28 ? C17739b.m140799a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
    }

    /* JADX INFO: renamed from: h */
    public static int m140791h(@NonNull Context context, @NonNull final ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C17740c.m140801a(viewConfiguration, i, i2, i3);
        }
        if (!m140795l(i, i2, i3)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int iM140787d = m140787d(resources, i3, i2);
        Objects.requireNonNull(viewConfiguration);
        return m140784a(resources, iM140787d, new uyg0() { // from class: l.hbl0
            @Override // p149l.uyg0
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: i */
    public static int m140792i(@NonNull Context context, @NonNull final ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C17740c.m140802b(viewConfiguration, i, i2, i3);
        }
        if (!m140795l(i, i2, i3)) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        Resources resources = context.getResources();
        int iM140788e = m140788e(resources, i3, i2);
        Objects.requireNonNull(viewConfiguration);
        return m140784a(resources, iM140788e, new uyg0() { // from class: l.ibl0
            @Override // p149l.uyg0
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    @Deprecated
    /* JADX INFO: renamed from: j */
    public static int m140793j(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledPagingTouchSlop();
    }

    /* JADX INFO: renamed from: k */
    public static float m140794k(@NonNull ViewConfiguration viewConfiguration, @NonNull Context context) {
        return Build.VERSION.SDK_INT >= 26 ? C17738a.m140798b(viewConfiguration) : m140785b(viewConfiguration, context);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m140795l(int i, int i2, int i3) {
        InputDevice device = InputDevice.getDevice(i);
        return (device == null || device.getMotionRange(i2, i3) == null) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m140796m(@NonNull ViewConfiguration viewConfiguration, @NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C17739b.m140800b(viewConfiguration);
        }
        Resources resources = context.getResources();
        int iM140786c = m140786c(resources, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        return iM140786c != 0 && resources.getBoolean(iM140786c);
    }
}
