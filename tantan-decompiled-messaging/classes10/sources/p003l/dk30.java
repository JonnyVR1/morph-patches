package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.mytab.biz4.container.NewMyTabBiz4TabItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class dk30 {
    /* JADX INFO: renamed from: a */
    public static void m6165a(NewMyTabBiz4TabItem newMyTabBiz4TabItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newMyTabBiz4TabItem.a = (ImageView) viewGroup.getChildAt(0);
        newMyTabBiz4TabItem.b = viewGroup.getChildAt(1);
        newMyTabBiz4TabItem.c = (TextView) viewGroup.getChildAt(2);
        newMyTabBiz4TabItem.d = (TextView) viewGroup.getChildAt(3);
        newMyTabBiz4TabItem.e = viewGroup.getChildAt(4);
    }
}
