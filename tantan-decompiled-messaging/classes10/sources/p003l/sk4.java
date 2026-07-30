package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.view.CardLabelItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class sk4 {
    /* JADX INFO: renamed from: a */
    public static void m9357a(CardLabelItemView cardLabelItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardLabelItemView.f2352a = viewGroup.getChildAt(0);
        cardLabelItemView.f2353b = viewGroup.getChildAt(1);
        cardLabelItemView.f2354c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardLabelItemView.f2355d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        cardLabelItemView.f2356e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        cardLabelItemView.f2357f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
