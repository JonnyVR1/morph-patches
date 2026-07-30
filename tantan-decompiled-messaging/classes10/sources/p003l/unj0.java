package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.core.ui.likedusers.tablayout.undolike.UndoCoverAnimView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class unj0 {
    /* JADX INFO: renamed from: a */
    public static void m9752a(UndoCoverAnimView undoCoverAnimView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        undoCoverAnimView.a = viewGroup.getChildAt(0);
        undoCoverAnimView.b = viewGroup.getChildAt(1);
        undoCoverAnimView.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        undoCoverAnimView.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        undoCoverAnimView.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        undoCoverAnimView.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        undoCoverAnimView.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        undoCoverAnimView.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        undoCoverAnimView.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        undoCoverAnimView.j = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }
}
