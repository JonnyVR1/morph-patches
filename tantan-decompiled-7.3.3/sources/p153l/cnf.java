package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardPicLabelView;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;

/* JADX INFO: loaded from: classes10.dex */
public class cnf {
    /* JADX INFO: renamed from: a */
    public static void m111499a(ExpandedCardPicLabelView expandedCardPicLabelView, View view) {
        expandedCardPicLabelView.f23319a = (ExpandedCardPicLabelView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        expandedCardPicLabelView.f23320b = (SimpleDraweeView) viewGroup.getChildAt(0);
        expandedCardPicLabelView.f23321c = (VText_Medium) viewGroup.getChildAt(1);
    }
}
