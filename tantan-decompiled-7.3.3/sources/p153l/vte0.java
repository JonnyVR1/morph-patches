package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VEditText;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class vte0 {
    /* JADX INFO: renamed from: a */
    public static void m202671a(ute0 ute0Var, View view) {
        ute0Var._root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ute0Var._shadow = viewGroup.getChildAt(0);
        ute0Var._bg = viewGroup.getChildAt(1);
        ute0Var._title = (TextView) viewGroup.getChildAt(2);
        ute0Var._back_icon = (VImage) viewGroup.getChildAt(3);
        ute0Var._question_icon = (VImage) viewGroup.getChildAt(4);
        ute0Var._line = viewGroup.getChildAt(5);
        ute0Var._switch_title = (TextView) viewGroup.getChildAt(6);
        ute0Var._switch_sub_title = (VText) viewGroup.getChildAt(7);
        ute0Var._switch_open = (FrameLayout) viewGroup.getChildAt(8);
        ute0Var._point_bg = ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
        ute0Var._round_point = ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1);
        ute0Var._set_count_title = (TextView) viewGroup.getChildAt(9);
        ute0Var._count_position_left = (VText) viewGroup.getChildAt(10);
        ute0Var._count_position_center = (VText) viewGroup.getChildAt(11);
        ute0Var._count_position_right = (VText) viewGroup.getChildAt(12);
        ute0Var._input_number = (VEditText) viewGroup.getChildAt(13);
        ute0Var._hint_unit_text = (TextView) viewGroup.getChildAt(14);
        ute0Var._submit_bt = (TextView) viewGroup.getChildAt(15);
        ute0Var._root_text = (TextView) viewGroup.getChildAt(16);
        ute0Var._ruler_linear = (VLinear) viewGroup.getChildAt(17);
        ute0Var._rules_text_one = (VText) ((ViewGroup) viewGroup.getChildAt(17)).getChildAt(0);
        ute0Var._rules_text_two = (VText) ((ViewGroup) viewGroup.getChildAt(17)).getChildAt(1);
        ute0Var._rules_text_three = (VText) ((ViewGroup) viewGroup.getChildAt(17)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m202672b(ute0 ute0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199243s5, viewGroup, false);
        m202671a(ute0Var, viewInflate);
        return viewInflate;
    }
}
