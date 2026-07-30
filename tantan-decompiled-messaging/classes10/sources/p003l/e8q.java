package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.messages.ItemMessageMMTask;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class e8q {
    /* JADX INFO: renamed from: a */
    public static void m6253a(ItemMessageMMTask itemMessageMMTask, View view) {
        itemMessageMMTask.c = (ItemMessageMMTask) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemMessageMMTask.d = viewGroup.getChildAt(0);
        itemMessageMMTask.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemMessageMMTask.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemMessageMMTask.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemMessageMMTask.h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemMessageMMTask.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
    }
}
