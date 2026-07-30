package p153l;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class vnl0 {

    /* JADX INFO: renamed from: a */
    public static Field f184895a;

    /* JADX INFO: renamed from: b */
    public static boolean f184896b;

    /* JADX INFO: renamed from: a */
    public void mo159188a(@NonNull View view) {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public float mo159189b(@NonNull View view) {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public void mo159190c(@NonNull View view) {
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public void mo182318d(@NonNull View view, int i, int i2, int i3, int i4) {
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public void mo159191e(@NonNull View view, float f) {
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public void mo191954f(@NonNull View view, int i) {
        if (!f184896b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f184895a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f184896b = true;
        }
        Field field = f184895a;
        if (field != null) {
            try {
                f184895a.setInt(view, (field.getInt(view) & (-13)) | i);
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo173071g(@NonNull View view, @NonNull Matrix matrix) {
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public void mo173072h(@NonNull View view, @NonNull Matrix matrix) {
        throw null;
    }
}
