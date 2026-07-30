package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Guideline;
import com.p046p1.mobile.putong.core.p053ui.active.MinBoostActiveCard;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class s200 {
    /* JADX INFO: renamed from: a */
    public static void m182053a(MinBoostActiveCard minBoostActiveCard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        minBoostActiveCard._iv_cardpic = (VDraweeView) viewGroup.getChildAt(0);
        minBoostActiveCard._boost_title = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        minBoostActiveCard._guideline1 = (Guideline) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        minBoostActiveCard._guideline2 = (Guideline) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        minBoostActiveCard._boost_logo = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        minBoostActiveCard._boost_subtitle = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        minBoostActiveCard._btn_bottom = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        minBoostActiveCard._iv_close = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        minBoostActiveCard._btn_title = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
    }
}
