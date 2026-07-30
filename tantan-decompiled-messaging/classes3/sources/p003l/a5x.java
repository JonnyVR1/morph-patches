package p003l;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.d43;
import l.hpd0;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class a5x {

    /* JADX INFO: renamed from: a */
    public static hpd0 f2082a;

    /* JADX INFO: renamed from: b */
    public static final hpd0 f2083b;

    static {
        Boolean bool = Boolean.FALSE;
        f2082a = new hpd0("new_match_anim_congrats", bool);
        f2083b = new hpd0("debug_new_match_anim_switch", bool);
    }

    /* JADX INFO: renamed from: a */
    public static void m2744a(@Nullable Activity activity, @NonNull Activity activity2, @ColorInt int i) {
        ImageView imageView = new ImageView(activity2);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        if (activity != null) {
            Bitmap bitmapA = d43.a(xdl0.x(activity.getWindow().getDecorView(), 6), t100.d(4.0f), false);
            new Canvas(bitmapA).drawColor(i);
            imageView.setBackgroundDrawable(new BitmapDrawable(bitmapA));
        } else {
            imageView.setBackgroundColor(-1);
        }
        ((ViewGroup) activity2.getWindow().getDecorView()).addView(imageView, 0);
        imageView.getLayoutParams().width = -1;
        imageView.getLayoutParams().height = -1;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2745b() {
        return false;
    }
}
