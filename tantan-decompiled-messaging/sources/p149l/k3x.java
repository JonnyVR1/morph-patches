package p149l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.data.LiveUserMask;

/* JADX INFO: loaded from: classes12.dex */
public class k3x {

    /* JADX INFO: renamed from: a */
    public static int f120904a = t100.m186890d(2.0f);

    /* JADX INFO: renamed from: b */
    public static String f120905b = "#85b9f2";

    /* JADX INFO: renamed from: c */
    public static String f120906c = "#f3c8f5";

    /* JADX INFO: renamed from: a */
    public static void m144444a(SimpleDraweeView simpleDraweeView, LiveUserMask liveUserMask, boolean z) {
        djj djjVar = (djj) simpleDraweeView.getHierarchy();
        RoundingParams roundingParamsM112069p = djjVar.m112069p();
        if (roundingParamsM112069p == null) {
            roundingParamsM112069p = RoundingParams.m8247a();
            djjVar.m112053H(roundingParamsM112069p);
        }
        int color = Color.parseColor("#00000000");
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{color, color});
        gradientDrawable.setShape(1);
        if (z) {
            int color2 = Color.parseColor(liveUserMask.isFemale() ? f120906c : f120905b);
            roundingParamsM112069p.m8267u(f120904a);
            gradientDrawable.setStroke(f120904a, color2);
        }
        if (!TextUtils.isEmpty(liveUserMask.color)) {
            gradientDrawable.setColor(Color.parseColor(liveUserMask.color));
        }
        simpleDraweeView.setBackground(gradientDrawable);
    }
}
