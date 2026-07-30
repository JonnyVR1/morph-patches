package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardPicLabelView;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;

/* JADX INFO: loaded from: classes10.dex */
public class wlf {
    /* JADX INFO: renamed from: a */
    public static void m203807a(ExpandedCardPicLabelView expandedCardPicLabelView, View view) {
        expandedCardPicLabelView.f22577a = (ExpandedCardPicLabelView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        expandedCardPicLabelView.f22578b = (SimpleDraweeView) viewGroup.getChildAt(0);
        expandedCardPicLabelView.f22579c = (VText_Medium) viewGroup.getChildAt(1);
    }
}
