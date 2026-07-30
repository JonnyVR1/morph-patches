package p153l;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class z7x {

    /* JADX INFO: renamed from: a */
    public static jxd0 f203278a;

    /* JADX INFO: renamed from: b */
    public static final jxd0 f203279b;

    static {
        Boolean bool = Boolean.FALSE;
        f203278a = new jxd0("new_match_anim_congrats", bool);
        f203279b = new jxd0("debug_new_match_anim_switch", bool);
    }

    /* JADX INFO: renamed from: a */
    public static void m218924a(@Nullable Activity activity, @NonNull Activity activity2, @ColorInt int i) {
        ImageView imageView = new ImageView(activity2);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        if (activity != null) {
            Bitmap bitmapM189143a = t43.m189143a(bnl0.m105589x(activity.getWindow().getDecorView(), 6), qa00.m175859d(4.0f), false);
            new Canvas(bitmapM189143a).drawColor(i);
            imageView.setBackgroundDrawable(new BitmapDrawable(bitmapM189143a));
        } else {
            imageView.setBackgroundColor(-1);
        }
        ((ViewGroup) activity2.getWindow().getDecorView()).addView(imageView, 0);
        imageView.getLayoutParams().width = -1;
        imageView.getLayoutParams().height = -1;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m218925b() {
        return false;
    }
}
