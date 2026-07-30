package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.active.SpotlightActiveCard;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class hqf0 {
    /* JADX INFO: renamed from: a */
    public static void m132451a(SpotlightActiveCard spotlightActiveCard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        spotlightActiveCard._card_bg = (VDraweeView) viewGroup.getChildAt(0);
        spotlightActiveCard._title = (TextView) viewGroup.getChildAt(1);
        spotlightActiveCard._desc_img = (VDraweeView) viewGroup.getChildAt(2);
        spotlightActiveCard._desc_text = (TextView) viewGroup.getChildAt(3);
        spotlightActiveCard._btn_bottom = (VImage) viewGroup.getChildAt(4);
        spotlightActiveCard._iv_close = (VImage) viewGroup.getChildAt(5);
        spotlightActiveCard._btn_title = (TextView) viewGroup.getChildAt(6);
    }
}
