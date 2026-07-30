package p149l;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.p046p1.mobile.putong.core.data.StickStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class cce {

    /* JADX INFO: renamed from: a */
    public static final int[] f80228a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b */
    public static final int[] f80229b = new int[0];

    /* JADX INFO: renamed from: c */
    public static final Rect f80230c = new Rect();

    /* JADX INFO: renamed from: d */
    public static Class<?> f80231d;

    static {
        try {
            f80231d = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static boolean m106045a(@NonNull Drawable drawable) {
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof ibq0) {
                return m106045a(((ibq0) drawable).m135269b());
            }
            if (drawable instanceof ece) {
                return m106045a(((ece) drawable).getWrappedDrawable());
            }
            if (drawable instanceof ScaleDrawable) {
                return m106045a(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!m106045a(drawable2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    public static Rect m106047c(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            Insets opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        if (f80231d != null) {
            try {
                Drawable drawableM145283q = kbe.m145283q(drawable);
                Object objInvoke = drawableM145283q.getClass().getMethod("getOpticalInsets", null).invoke(drawableM145283q, null);
                if (objInvoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : f80231d.getFields()) {
                        String name = field.getName();
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    rect2.bottom = field.getInt(objInvoke);
                                }
                                break;
                            case 115029:
                                if (name.equals(StickStatus.top)) {
                                    rect2.top = field.getInt(objInvoke);
                                }
                                break;
                            case 3317767:
                                if (name.equals(BLiveGiftBubblePopupTitlePosition.left)) {
                                    rect2.left = field.getInt(objInvoke);
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    rect2.right = field.getInt(objInvoke);
                                }
                                break;
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f80230c;
    }

    /* JADX INFO: renamed from: d */
    public static PorterDuff.Mode m106048d(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m106046b(@NonNull Drawable drawable) {
    }
}
