package p153l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class zce {
    /* JADX INFO: renamed from: a */
    public static GradientDrawable m219236a(List<String> list) {
        int[] iArr;
        if (!NullChecker.m82486a(list) || list.size() <= 0) {
            return null;
        }
        try {
            iArr = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                iArr[i] = Color.parseColor(list.get(i));
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            iArr = new int[]{Color.parseColor("#c9bdff"), Color.parseColor("#cdecff")};
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
        gradientDrawable.setCornerRadius(qa00.f156333t);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
        return gradientDrawable;
    }
}
