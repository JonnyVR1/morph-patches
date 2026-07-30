package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.visitor.myvisitors.MyVisitorRecoverHideFootPrintView;
import p151v.VCheckBox;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class y920 {
    /* JADX INFO: renamed from: a */
    public static void m214815a(MyVisitorRecoverHideFootPrintView myVisitorRecoverHideFootPrintView, View view) {
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
