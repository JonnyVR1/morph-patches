package p149l;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class rel0 {

    /* JADX INFO: renamed from: a */
    public static Field f159068a;

    /* JADX INFO: renamed from: b */
    public static boolean f159069b;

    /* JADX INFO: renamed from: a */
    public void mo135711a(@NonNull View view) {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public float mo135712b(@NonNull View view) {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public void mo135713c(@NonNull View view) {
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public void mo159119d(@NonNull View view, int i, int i2, int i3, int i4) {
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public void mo135714e(@NonNull View view, float f) {
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public void mo168523f(@NonNull View view, int i) {
        if (!f159069b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f159068a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f159069b = true;
        }
        Field field = f159068a;
        if (field != null) {
            try {
                f159068a.setInt(view, (field.getInt(view) & (-13)) | i);
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo149583g(@NonNull View view, @NonNull Matrix matrix) {
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public void mo149584h(@NonNull View view, @NonNull Matrix matrix) {
        throw null;
    }
}
