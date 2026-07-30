package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VButton;
import p151v.VCheckBox;
import p151v.VPullUpRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class hno {
    /* JADX INFO: renamed from: a */
    public static void m136267a(gno gnoVar, View view) {
        gnoVar._root_layout = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gnoVar._bt_close = (ImageView) viewGroup.getChildAt(1);
        gnoVar._title = (VText) viewGroup.getChildAt(2);
        gnoVar._list = (VPullUpRecyclerView) viewGroup.getChildAt(3);
        gnoVar._bottom_monolayer_1 = viewGroup.getChildAt(4);
        gnoVar._bottom_monolayer_2 = viewGroup.getChildAt(5);
        gnoVar._show_profile_check = (VCheckBox) viewGroup.getChildAt(6);
        gnoVar._show_profile_text = (VText) viewGroup.getChildAt(7);
        gnoVar._continue_ = (VButton) viewGroup.getChildAt(8);
    }

    /* JADX INFO: renamed from: b */
    public static View m136268b(gno gnoVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109138x, viewGroup, false);
        m136267a(gnoVar, viewInflate);
        return viewInflate;
    }
}
