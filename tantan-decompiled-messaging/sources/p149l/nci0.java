package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import p147v.VButton;
import p147v.VRadioButton;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class nci0 {
    /* JADX INFO: renamed from: a */
    public static void m158943a(mci0 mci0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mci0Var._close = (VButton) viewGroup.getChildAt(0);
        mci0Var._title = (VText) viewGroup.getChildAt(1);
        mci0Var._content = (VText) viewGroup.getChildAt(2);
        mci0Var._radio_group = (RadioGroup) viewGroup.getChildAt(3);
        mci0Var._radio_group_radio_left = (VRadioButton) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        mci0Var._radio_group_radio_center = (VRadioButton) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        mci0Var._radio_group_radio_right = (VRadioButton) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        mci0Var._bottom_button = (VButton) viewGroup.getChildAt(4);
    }
}
