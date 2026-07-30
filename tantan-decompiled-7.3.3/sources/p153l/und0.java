package p153l;

import android.graphics.Color;
import android.text.BidiFormatter;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class und0 {

    /* JADX INFO: renamed from: a */
    @ColorInt
    public static final int f179718a = Color.parseColor("#FFAE00");

    /* JADX INFO: renamed from: b */
    @ColorInt
    public static final int f179719b = Color.parseColor("#FF321F");

    @Nullable
    /* JADX INFO: renamed from: a */
    public static int[] m196833a(@Nullable List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(Integer.valueOf(n3d0.m161283g(str)));
            }
        }
        if (arrayList.size() < 2) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    public static void m196834b(TextView textView, CharSequence charSequence, @ColorInt int i, @Nullable List<String> list) {
        if (textView == null || charSequence == null) {
            return;
        }
        if (BidiFormatter.getInstance().isRtl(charSequence)) {
            charSequence = BidiFormatter.getInstance(false).unicodeWrap(charSequence, TextDirectionHeuristics.RTL);
        }
        if (TextUtils.isEmpty(charSequence)) {
            textView.setText("");
            return;
        }
        if (!(textView instanceof LiveGradientTextView)) {
            textView.setText(charSequence);
            textView.setTextColor(i);
            return;
        }
        LiveGradientTextView liveGradientTextView = (LiveGradientTextView) textView;
        int[] iArrM196833a = m196833a(list);
        liveGradientTextView.setUserGradientColors(iArrM196833a);
        if (iArrM196833a != null) {
            i = -1;
        }
        liveGradientTextView.setTextColor(i);
        liveGradientTextView.setText(charSequence);
    }
}
