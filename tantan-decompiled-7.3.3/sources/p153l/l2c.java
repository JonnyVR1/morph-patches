package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.home.view.DailySelectionAdCardView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class l2c {
    /* JADX INFO: renamed from: a */
    public static void m152599a(DailySelectionAdCardView dailySelectionAdCardView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        dailySelectionAdCardView.f30552a = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        dailySelectionAdCardView.f30553b = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        dailySelectionAdCardView.f30554c = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        dailySelectionAdCardView.f30555d = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
    }
}
