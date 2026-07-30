package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.settings.filter.newui.NewPurposeFilterItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class v740 {
    /* JADX INFO: renamed from: a */
    public static void m9867a(NewPurposeFilterItem newPurposeFilterItem, View view) {
        newPurposeFilterItem.a = (NewPurposeFilterItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newPurposeFilterItem.b = viewGroup.getChildAt(0);
        newPurposeFilterItem.c = viewGroup.getChildAt(1);
    }
}
