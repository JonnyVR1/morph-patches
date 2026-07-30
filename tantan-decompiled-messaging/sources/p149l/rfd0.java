package p149l;

import android.graphics.Color;
import android.text.BidiFormatter;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class rfd0 {

    /* JADX INFO: renamed from: a */
    @ColorInt
    public static final int f159138a = Color.parseColor("#FFAE00");

    /* JADX INFO: renamed from: b */
    @ColorInt
    public static final int f159139b = Color.parseColor("#FF321F");

    @Nullable
    /* JADX INFO: renamed from: a */
    public static int[] m179125a(@Nullable List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(Integer.valueOf(kvc0.m147358g(str)));
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
    public static void m179126b(TextView textView, CharSequence charSequence, @ColorInt int i, @Nullable List<String> list) {
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
        int[] iArrM179125a = m179125a(list);
        liveGradientTextView.setUserGradientColors(iArrM179125a);
        if (iArrM179125a != null) {
            i = -1;
        }
        liveGradientTextView.setTextColor(i);
        liveGradientTextView.setText(charSequence);
    }
}
