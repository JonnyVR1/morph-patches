package p153l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.data.LiveUserMask;

/* JADX INFO: loaded from: classes13.dex */
public class j6x {

    /* JADX INFO: renamed from: a */
    public static int f118609a = qa00.m175859d(2.0f);

    /* JADX INFO: renamed from: b */
    public static String f118610b = "#85b9f2";

    /* JADX INFO: renamed from: c */
    public static String f118611c = "#f3c8f5";

    /* JADX INFO: renamed from: a */
    public static void m143724a(SimpleDraweeView simpleDraweeView, LiveUserMask liveUserMask, boolean z) {
        wlj wljVar = (wlj) simpleDraweeView.getHierarchy();
        RoundingParams roundingParamsM207055p = wljVar.m207055p();
        if (roundingParamsM207055p == null) {
            roundingParamsM207055p = RoundingParams.m8301a();
            wljVar.m207045H(roundingParamsM207055p);
        }
        int color = Color.parseColor("#00000000");
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{color, color});
        gradientDrawable.setShape(1);
        if (z) {
            int color2 = Color.parseColor(liveUserMask.isFemale() ? f118611c : f118610b);
            roundingParamsM207055p.m8321u(f118609a);
            gradientDrawable.setStroke(f118609a, color2);
        }
        if (!TextUtils.isEmpty(liveUserMask.color)) {
            gradientDrawable.setColor(Color.parseColor(liveUserMask.color));
        }
        simpleDraweeView.setBackground(gradientDrawable);
    }
}
