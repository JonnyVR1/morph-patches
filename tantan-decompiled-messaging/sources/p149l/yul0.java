package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.heatchallenge.HeatChallengeProgressView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class yul0 {
    /* JADX INFO: renamed from: a */
    public static void m216128a(xul0 xul0Var, View view) {
        xul0Var._root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        xul0Var._dialog_bg_first = viewGroup.getChildAt(0);
        xul0Var._dialog_bg_second = viewGroup.getChildAt(1);
        xul0Var._top_view = viewGroup.getChildAt(2);
        xul0Var._back = (ImageView) viewGroup.getChildAt(3);
        xul0Var._title = (TextView) viewGroup.getChildAt(4);
        xul0Var._answer = (ImageView) viewGroup.getChildAt(5);
        xul0Var._scroll_view = (ScrollView) viewGroup.getChildAt(6);
        xul0Var._level_bg = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(0);
        xul0Var._level_bg2 = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(1);
        xul0Var._iv_grade = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(2);
        xul0Var._tv_level = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(3);
        xul0Var._progress = (HeatChallengeProgressView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(4);
        xul0Var._next_level = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(5);
        xul0Var._upgrade_btn = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(6);
        xul0Var._level_rights = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(7);
        xul0Var._rv_right = (RecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m216129b(xul0 xul0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168170R6, viewGroup, false);
        m216128a(xul0Var, viewInflate);
        return viewInflate;
    }
}
