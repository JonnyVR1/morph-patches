package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class zuo0 {
    /* JADX INFO: renamed from: a */
    public static void m220238a(yuo0 yuo0Var, View view) {
        yuo0Var._root = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        yuo0Var._menu_list = (RecyclerView) viewGroup.getChildAt(0);
        yuo0Var._menu_close = (ImageView) viewGroup.getChildAt(1);
    }
}
