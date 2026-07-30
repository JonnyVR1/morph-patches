package p153l;

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
public final class nkl0 {

    /* JADX INFO: renamed from: a */
    public static Method f142467a;

    /* JADX INFO: renamed from: l.nkl0$a */
    @RequiresApi(26)
    public static class C18892a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static float m163652a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static float m163653b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* JADX INFO: renamed from: l.nkl0$b */
    @RequiresApi(28)
    public static class C18893b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static int m163654a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static boolean m163655b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    /* JADX INFO: renamed from: l.nkl0$c */
    @RequiresApi(34)
    public static class C18894c {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static int m163656a(@NonNull ViewConfiguration viewConfiguration, int i, int i2, int i3) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static int m163657b(@NonNull ViewConfiguration viewConfiguration, int i, int i2, int i3) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
        }
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f142467a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m163639a(Resources resources, int i, c7h0<Integer> c7h0Var, int i2) {
        int dimensionPixelSize;
        if (i != -1) {
            return (i == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i)) < 0) ? i2 : dimensionPixelSize;
        }
        return c7h0Var.get().intValue();
    }

    /* JADX INFO: renamed from: b */
    public static float m163640b(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f142467a) != null) {
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
    public static int m163641c(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    /* JADX INFO: renamed from: d */
    public static int m163642d(Resources resources, int i, int i2) {
        if (i == 4194304 && i2 == 26) {
            return m163641c(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public static int m163643e(Resources resources, int i, int i2) {
        if (i == 4194304 && i2 == 26) {
            return m163641c(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static float m163644f(@NonNull ViewConfiguration viewConfiguration, @NonNull Context context) {
        return Build.VERSION.SDK_INT >= 26 ? C18892a.m163652a(viewConfiguration) : m163640b(viewConfiguration, context);
    }

    /* JADX INFO: renamed from: g */
    public static int m163645g(@NonNull ViewConfiguration viewConfiguration) {
        return Build.VERSION.SDK_INT >= 28 ? C18893b.m163654a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
    }

    /* JADX INFO: renamed from: h */
    public static int m163646h(@NonNull Context context, @NonNull final ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C18894c.m163656a(viewConfiguration, i, i2, i3);
        }
        if (!m163650l(i, i2, i3)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int iM163642d = m163642d(resources, i3, i2);
        Objects.requireNonNull(viewConfiguration);
        return m163639a(resources, iM163642d, new c7h0() { // from class: l.lkl0
            @Override // p153l.c7h0
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: i */
    public static int m163647i(@NonNull Context context, @NonNull final ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C18894c.m163657b(viewConfiguration, i, i2, i3);
        }
        if (!m163650l(i, i2, i3)) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        Resources resources = context.getResources();
        int iM163643e = m163643e(resources, i3, i2);
        Objects.requireNonNull(viewConfiguration);
        return m163639a(resources, iM163643e, new c7h0() { // from class: l.mkl0
            @Override // p153l.c7h0
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    @Deprecated
    /* JADX INFO: renamed from: j */
    public static int m163648j(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledPagingTouchSlop();
    }

    /* JADX INFO: renamed from: k */
    public static float m163649k(@NonNull ViewConfiguration viewConfiguration, @NonNull Context context) {
        return Build.VERSION.SDK_INT >= 26 ? C18892a.m163653b(viewConfiguration) : m163640b(viewConfiguration, context);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m163650l(int i, int i2, int i3) {
        InputDevice device = InputDevice.getDevice(i);
        return (device == null || device.getMotionRange(i2, i3) == null) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m163651m(@NonNull ViewConfiguration viewConfiguration, @NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C18893b.m163655b(viewConfiguration);
        }
        Resources resources = context.getResources();
        int iM163641c = m163641c(resources, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        return iM163641c != 0 && resources.getBoolean(iM163641c);
    }
}
