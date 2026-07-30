package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.intloperation.campingactivity.C8544a;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundButton;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundConstraintLayout;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class k5n {
    /* JADX INFO: renamed from: a */
    public static void m148474a(C8544a c8544a, View view) {
        c8544a._root_layout = (RoundConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c8544a._bg_img = (VDraweeView) viewGroup.getChildAt(0);
        c8544a._title_img = (VDraweeView) viewGroup.getChildAt(1);
        c8544a._activity_icon = (VDraweeView) viewGroup.getChildAt(2);
        c8544a._bt_close = (ImageView) viewGroup.getChildAt(3);
        c8544a._desc = (TextView) viewGroup.getChildAt(4);
        c8544a._bt = (RoundButton) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m148475b(C8544a c8544a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126080u4, viewGroup, false);
        m148474a(c8544a, viewInflate);
        return viewInflate;
    }
}
