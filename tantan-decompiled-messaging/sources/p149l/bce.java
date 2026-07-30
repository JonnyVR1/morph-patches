package p149l;

import android.graphics.drawable.Drawable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0013\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m87232d2 = {"Ll/bce;", "", "<init>", "()V", "Landroid/graphics/drawable/Drawable;", "to", "from", "", "a", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V", "drawable", "Ll/rbe;", "properties", "e", "(Landroid/graphics/drawable/Drawable;Ll/rbe;)V", "Landroid/graphics/drawable/Drawable$Callback;", "callback", "Ll/n7j0;", "transformCallback", Constants.INAPP_DATA_TAG, "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable$Callback;Ll/n7j0;)V", "", "color", "alpha", "c", "(II)I", "b", "(I)I", "drawee_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class bce {

    @NotNull
    public static final bce INSTANCE = new bce();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m101055a(@Nullable Drawable to, @Nullable Drawable from) {
        if (from == null || to == null || to == from) {
            return;
        }
        to.setBounds(from.getBounds());
        to.setChangingConfigurations(from.getChangingConfigurations());
        to.setLevel(from.getLevel());
        to.setVisible(from.isVisible(), false);
        to.setState(from.getState());
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final int m101056b(int color) {
        int i = color >>> 24;
        if (i != 0) {
            return i != 255 ? -3 : -1;
        }
        return -2;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final int m101057c(int color, int alpha) {
        if (alpha == 255) {
            return color;
        }
        if (alpha == 0) {
            return color & 16777215;
        }
        return (color & 16777215) | ((((color >>> 24) * (alpha + (alpha >> 7))) >> 8) << 24);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m101058d(@Nullable Drawable drawable, @Nullable Drawable.Callback callback, @Nullable n7j0 transformCallback) {
        if (drawable == 0) {
            return;
        }
        drawable.setCallback(callback);
        m7j0 m7j0Var = drawable instanceof m7j0 ? (m7j0) drawable : null;
        if (m7j0Var != null) {
            m7j0Var.mo125887l(transformCallback);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m101059e(@Nullable Drawable drawable, @Nullable rbe properties) {
        if (drawable == null || properties == null) {
            return;
        }
        properties.m178595a(drawable);
    }
}
