package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.p053ui.gift.HorRecyclerViewIndicator;
import com.p046p1.mobile.putong.core.p053ui.gift.panel.NewGiftPanelPagerView;

/* JADX INFO: loaded from: classes10.dex */
public class kr20 {
    /* JADX INFO: renamed from: a */
    public static void m146965a(NewGiftPanelPagerView newGiftPanelPagerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newGiftPanelPagerView.f29285c = (RecyclerView) viewGroup.getChildAt(0);
        newGiftPanelPagerView.f29286d = (HorRecyclerViewIndicator) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
