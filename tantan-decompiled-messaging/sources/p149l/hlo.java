package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VButton;
import p147v.VCheckBox;
import p147v.VPullUpRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class hlo {
    /* JADX INFO: renamed from: a */
    public static void m131679a(glo gloVar, View view) {
        gloVar._root_layout = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gloVar._bt_close = (ImageView) viewGroup.getChildAt(1);
        gloVar._title = (VText) viewGroup.getChildAt(2);
        gloVar._list = (VPullUpRecyclerView) viewGroup.getChildAt(3);
        gloVar._bottom_monolayer_1 = viewGroup.getChildAt(4);
        gloVar._bottom_monolayer_2 = viewGroup.getChildAt(5);
        gloVar._show_profile_check = (VCheckBox) viewGroup.getChildAt(6);
        gloVar._show_profile_text = (VText) viewGroup.getChildAt(7);
        gloVar._continue_ = (VButton) viewGroup.getChildAt(8);
    }

    /* JADX INFO: renamed from: b */
    public static View m131680b(glo gloVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f79526x, viewGroup, false);
        m131679a(gloVar, viewInflate);
        return viewInflate;
    }
}
