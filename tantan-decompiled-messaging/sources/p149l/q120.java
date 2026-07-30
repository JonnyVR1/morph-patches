package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.visitor.myvisitors.MyVisitorRecoverHideFootPrintView;
import p147v.VCheckBox;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class q120 {
    /* JADX INFO: renamed from: a */
    public static void m172369a(MyVisitorRecoverHideFootPrintView myVisitorRecoverHideFootPrintView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        myVisitorRecoverHideFootPrintView._image = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        myVisitorRecoverHideFootPrintView._title = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        myVisitorRecoverHideFootPrintView._subtitle = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        myVisitorRecoverHideFootPrintView._confirm = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        myVisitorRecoverHideFootPrintView._confirm_title = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        myVisitorRecoverHideFootPrintView._confirm_subtitle = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        myVisitorRecoverHideFootPrintView._v_checkbox = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        myVisitorRecoverHideFootPrintView._v_checkbox_check = (VCheckBox) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        myVisitorRecoverHideFootPrintView._v_checkbox_reminder = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        myVisitorRecoverHideFootPrintView._close = (VImage) viewGroup.getChildAt(1);
    }
}
