package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import p151v.VButton;
import p151v.VRadioButton;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class nli0 {
    /* JADX INFO: renamed from: a */
    public static void m163687a(mli0 mli0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mli0Var._close = (VButton) viewGroup.getChildAt(0);
        mli0Var._title = (VText) viewGroup.getChildAt(1);
        mli0Var._content = (VText) viewGroup.getChildAt(2);
        mli0Var._radio_group = (RadioGroup) viewGroup.getChildAt(3);
        mli0Var._radio_group_radio_left = (VRadioButton) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        mli0Var._radio_group_radio_center = (VRadioButton) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        mli0Var._radio_group_radio_right = (VRadioButton) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        mli0Var._bottom_button = (VButton) viewGroup.getChildAt(4);
    }
}
