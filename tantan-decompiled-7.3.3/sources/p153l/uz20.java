package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.p058ui.gift.HorRecyclerViewIndicator;
import com.p051p1.mobile.putong.core.p058ui.gift.panel.NewGiftPanelPagerView;

/* JADX INFO: loaded from: classes10.dex */
public class uz20 {
    /* JADX INFO: renamed from: a */
    public static void m198718a(NewGiftPanelPagerView newGiftPanelPagerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newGiftPanelPagerView.f30133c = (RecyclerView) viewGroup.getChildAt(0);
        newGiftPanelPagerView.f30134d = (HorRecyclerViewIndicator) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
