package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.intloperation.quiz.C8386a;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundButton;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundConstraintLayout;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class k7p {
    /* JADX INFO: renamed from: a */
    public static void m144692a(C8386a c8386a, View view) {
        c8386a._root_layout = (RoundConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c8386a._bg_img = (VDraweeView) viewGroup.getChildAt(0);
        c8386a._title = (TextView) viewGroup.getChildAt(1);
        c8386a._activity_icon = (VDraweeView) viewGroup.getChildAt(2);
        c8386a._bt_close = (ImageView) viewGroup.getChildAt(3);
        c8386a._desc = (TextView) viewGroup.getChildAt(4);
        c8386a._bt = (RoundButton) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m144693b(C8386a c8386a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95320D5, viewGroup, false);
        m144692a(c8386a, viewInflate);
        return viewInflate;
    }
}
