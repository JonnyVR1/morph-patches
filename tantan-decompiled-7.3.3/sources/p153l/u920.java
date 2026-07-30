package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.visitor.myvisitors.MyVisitorMenuPopupView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class u920 {
    /* JADX INFO: renamed from: a */
    public static void m195073a(MyVisitorMenuPopupView myVisitorMenuPopupView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        myVisitorMenuPopupView._sort_default_layout = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        myVisitorMenuPopupView._sort_default_text = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        myVisitorMenuPopupView._sort_default_check = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        myVisitorMenuPopupView._sort_time_layout = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        myVisitorMenuPopupView._sort_time_text = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        myVisitorMenuPopupView._sort_time_check = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        myVisitorMenuPopupView._sort_hide_footprint_layout = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        myVisitorMenuPopupView._sort_hide_footprint_text = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        myVisitorMenuPopupView._sort_hide_footprint_check = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
    }
}
