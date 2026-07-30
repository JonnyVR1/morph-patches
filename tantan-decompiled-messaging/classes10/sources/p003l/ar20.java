package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterTagItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ar20 {
    /* JADX INFO: renamed from: a */
    public static void m5511a(NewFilterTagItem newFilterTagItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newFilterTagItem.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        newFilterTagItem.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        newFilterTagItem.c = viewGroup.getChildAt(1);
    }
}
