package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class d4p0 {
    /* JADX INFO: renamed from: a */
    public static void m114228a(c4p0 c4p0Var, View view) {
        c4p0Var._root = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c4p0Var._menu_list = (RecyclerView) viewGroup.getChildAt(0);
        c4p0Var._menu_close = (ImageView) viewGroup.getChildAt(1);
    }
}
