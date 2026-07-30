package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.intloperation.quiz.C8549a;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundButton;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundConstraintLayout;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class k9p {
    /* JADX INFO: renamed from: a */
    public static void m148883a(C8549a c8549a, View view) {
        c8549a._root_layout = (RoundConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c8549a._bg_img = (VDraweeView) viewGroup.getChildAt(0);
        c8549a._title = (TextView) viewGroup.getChildAt(1);
        c8549a._activity_icon = (VDraweeView) viewGroup.getChildAt(2);
        c8549a._bt_close = (ImageView) viewGroup.getChildAt(3);
        c8549a._desc = (TextView) viewGroup.getChildAt(4);
        c8549a._bt = (RoundButton) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m148884b(C8549a c8549a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125389E5, viewGroup, false);
        m148883a(c8549a, viewInflate);
        return viewInflate;
    }
}
