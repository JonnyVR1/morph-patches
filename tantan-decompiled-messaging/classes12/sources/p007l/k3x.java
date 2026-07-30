package p007l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.data.LiveUserMask;
import l.djj;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class k3x {

    /* JADX INFO: renamed from: a */
    public static int f9591a = t100.d(2.0f);

    /* JADX INFO: renamed from: b */
    public static String f9592b = "#85b9f2";

    /* JADX INFO: renamed from: c */
    public static String f9593c = "#f3c8f5";

    /* JADX INFO: renamed from: a */
    public static void m11388a(SimpleDraweeView simpleDraweeView, LiveUserMask liveUserMask, boolean z) {
        djj hierarchy = simpleDraweeView.getHierarchy();
        RoundingParams roundingParamsP = hierarchy.p();
        if (roundingParamsP == null) {
            roundingParamsP = RoundingParams.a();
            hierarchy.H(roundingParamsP);
        }
        int color = Color.parseColor("#00000000");
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{color, color});
        gradientDrawable.setShape(1);
        if (z) {
            int color2 = Color.parseColor(liveUserMask.isFemale() ? f9593c : f9592b);
            roundingParamsP.u(f9591a);
            gradientDrawable.setStroke(f9591a, color2);
        }
        if (!TextUtils.isEmpty(liveUserMask.color)) {
            gradientDrawable.setColor(Color.parseColor(liveUserMask.color));
        }
        simpleDraweeView.setBackground(gradientDrawable);
    }
}
