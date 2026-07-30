package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.p065ui.datepicker.DatePickerView;
import p147v.VButton;

/* JADX INFO: loaded from: classes9.dex */
public class d03 {
    /* JADX INFO: renamed from: a */
    public static void m109453a(c03 c03Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c03Var._close = (VButton) viewGroup.getChildAt(0);
        c03Var._title = (TextView) viewGroup.getChildAt(1);
        c03Var._date_picker = (DatePickerView) viewGroup.getChildAt(2);
        c03Var._later_btn = (VButton) viewGroup.getChildAt(3);
    }
}
