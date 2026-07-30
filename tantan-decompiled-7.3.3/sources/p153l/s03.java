package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.p070ui.datepicker.DatePickerView;
import p151v.VButton;

/* JADX INFO: loaded from: classes9.dex */
public class s03 {
    /* JADX INFO: renamed from: a */
    public static void m183885a(r03 r03Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        r03Var._close = (VButton) viewGroup.getChildAt(0);
        r03Var._title = (TextView) viewGroup.getChildAt(1);
        r03Var._date_picker = (DatePickerView) viewGroup.getChildAt(2);
        r03Var._later_btn = (VButton) viewGroup.getChildAt(3);
    }
}
