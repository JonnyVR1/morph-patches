package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class hlo {
    /* JADX INFO: renamed from: a */
    public static void m16240a(glo gloVar, View view) {
        gloVar._root_layout = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gloVar._bt_close = (ImageView) viewGroup.getChildAt(1);
        gloVar._title = viewGroup.getChildAt(2);
        gloVar._list = viewGroup.getChildAt(3);
        gloVar._bottom_monolayer_1 = viewGroup.getChildAt(4);
        gloVar._bottom_monolayer_2 = viewGroup.getChildAt(5);
        gloVar._show_profile_check = viewGroup.getChildAt(6);
        gloVar._show_profile_text = viewGroup.getChildAt(7);
        gloVar._continue_ = viewGroup.getChildAt(8);
    }

    /* JADX INFO: renamed from: b */
    public static View m16241b(glo gloVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9456x, viewGroup, false);
        m16240a(gloVar, viewInflate);
        return viewInflate;
    }
}
