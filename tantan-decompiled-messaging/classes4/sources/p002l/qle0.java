package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class qle0 {
    /* JADX INFO: renamed from: a */
    public static void m21477a(ple0 ple0Var, View view) {
        ple0Var._root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ple0Var._shadow = viewGroup.getChildAt(0);
        ple0Var._bg = viewGroup.getChildAt(1);
        ple0Var._title = (TextView) viewGroup.getChildAt(2);
        ple0Var._back_icon = viewGroup.getChildAt(3);
        ple0Var._question_icon = viewGroup.getChildAt(4);
        ple0Var._line = viewGroup.getChildAt(5);
        ple0Var._switch_title = (TextView) viewGroup.getChildAt(6);
        ple0Var._switch_sub_title = viewGroup.getChildAt(7);
        ple0Var._switch_open = (FrameLayout) viewGroup.getChildAt(8);
        ple0Var._point_bg = ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
        ple0Var._round_point = ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1);
        ple0Var._set_count_title = (TextView) viewGroup.getChildAt(9);
        ple0Var._count_position_left = viewGroup.getChildAt(10);
        ple0Var._count_position_center = viewGroup.getChildAt(11);
        ple0Var._count_position_right = viewGroup.getChildAt(12);
        ple0Var._input_number = viewGroup.getChildAt(13);
        ple0Var._hint_unit_text = (TextView) viewGroup.getChildAt(14);
        ple0Var._submit_bt = (TextView) viewGroup.getChildAt(15);
        ple0Var._root_text = (TextView) viewGroup.getChildAt(16);
        ple0Var._ruler_linear = viewGroup.getChildAt(17);
        ple0Var._rules_text_one = ((ViewGroup) viewGroup.getChildAt(17)).getChildAt(0);
        ple0Var._rules_text_two = ((ViewGroup) viewGroup.getChildAt(17)).getChildAt(1);
        ple0Var._rules_text_three = ((ViewGroup) viewGroup.getChildAt(17)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m21478b(ple0 ple0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f20007s5, viewGroup, false);
        m21477a(ple0Var, viewInflate);
        return viewInflate;
    }
}
