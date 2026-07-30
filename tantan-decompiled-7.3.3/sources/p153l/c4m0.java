package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.heatchallenge.HeatChallengeProgressView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class c4m0 {
    /* JADX INFO: renamed from: a */
    public static void m107934a(b4m0 b4m0Var, View view) {
        b4m0Var._root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        b4m0Var._dialog_bg_first = viewGroup.getChildAt(0);
        b4m0Var._dialog_bg_second = viewGroup.getChildAt(1);
        b4m0Var._top_view = viewGroup.getChildAt(2);
        b4m0Var._back = (ImageView) viewGroup.getChildAt(3);
        b4m0Var._title = (TextView) viewGroup.getChildAt(4);
        b4m0Var._answer = (ImageView) viewGroup.getChildAt(5);
        b4m0Var._scroll_view = (ScrollView) viewGroup.getChildAt(6);
        b4m0Var._level_bg = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(0);
        b4m0Var._level_bg2 = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(1);
        b4m0Var._iv_grade = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(2);
        b4m0Var._tv_level = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(3);
        b4m0Var._progress = (HeatChallengeProgressView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(4);
        b4m0Var._next_level = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(5);
        b4m0Var._upgrade_btn = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(6);
        b4m0Var._level_rights = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(7);
        b4m0Var._rv_right = (RecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m107935b(b4m0 b4m0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198902R6, viewGroup, false);
        m107934a(b4m0Var, viewInflate);
        return viewInflate;
    }
}
