package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.visitor.myvisitors.MyVisitorMenuPopupView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class m120 {
    /* JADX INFO: renamed from: a */
    public static void m152560a(MyVisitorMenuPopupView myVisitorMenuPopupView, View view) {
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
