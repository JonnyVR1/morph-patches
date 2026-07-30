package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterGenderItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class yq20 {
    /* JADX INFO: renamed from: a */
    public static void m11273a(NewFilterGenderItem newFilterGenderItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newFilterGenderItem.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        newFilterGenderItem.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        newFilterGenderItem.c = viewGroup.getChildAt(1);
    }
}
