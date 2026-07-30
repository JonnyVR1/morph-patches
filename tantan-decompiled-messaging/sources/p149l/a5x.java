package p149l;

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
public class a5x {

    /* JADX INFO: renamed from: a */
    public static hpd0 f67731a;

    /* JADX INFO: renamed from: b */
    public static final hpd0 f67732b;

    static {
        Boolean bool = Boolean.FALSE;
        f67731a = new hpd0("new_match_anim_congrats", bool);
        f67732b = new hpd0("debug_new_match_anim_switch", bool);
    }

    /* JADX INFO: renamed from: a */
    public static void m95061a(@Nullable Activity activity, @NonNull Activity activity2, @ColorInt int i) {
        ImageView imageView = new ImageView(activity2);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        if (activity != null) {
            Bitmap bitmapM109969a = d43.m109969a(xdl0.m208409x(activity.getWindow().getDecorView(), 6), t100.m186890d(4.0f), false);
            new Canvas(bitmapM109969a).drawColor(i);
            imageView.setBackgroundDrawable(new BitmapDrawable(bitmapM109969a));
        } else {
            imageView.setBackgroundColor(-1);
        }
        ((ViewGroup) activity2.getWindow().getDecorView()).addView(imageView, 0);
        imageView.getLayoutParams().width = -1;
        imageView.getLayoutParams().height = -1;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m95062b() {
        return false;
    }
}
