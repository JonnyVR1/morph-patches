package p003l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vbe {
    /* JADX INFO: renamed from: a */
    public static GradientDrawable m10209a(List<String> list) {
        int[] iArr;
        if (!NullChecker.a(list) || list.size() <= 0) {
            return null;
        }
        try {
            iArr = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                iArr[i] = Color.parseColor(list.get(i));
            }
        } catch (Exception e) {
            CrashHelper.c(e);
            iArr = new int[]{Color.parseColor("#c9bdff"), Color.parseColor("#cdecff")};
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
        gradientDrawable.setCornerRadius(t100.t);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
        return gradientDrawable;
    }
}
