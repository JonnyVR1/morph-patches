package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.intloperation.campingactivity.C8381a;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundButton;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundConstraintLayout;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class k3n {
    /* JADX INFO: renamed from: a */
    public static void m144413a(C8381a c8381a, View view) {
        c8381a._root_layout = (RoundConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c8381a._bg_img = (VDraweeView) viewGroup.getChildAt(0);
        c8381a._title_img = (VDraweeView) viewGroup.getChildAt(1);
        c8381a._activity_icon = (VDraweeView) viewGroup.getChildAt(2);
        c8381a._bt_close = (ImageView) viewGroup.getChildAt(3);
        c8381a._desc = (TextView) viewGroup.getChildAt(4);
        c8381a._bt = (RoundButton) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m144414b(C8381a c8381a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96026u4, viewGroup, false);
        m144413a(c8381a, viewInflate);
        return viewInflate;
    }
}
