package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.group.GroupSuggestItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vmk {
    /* JADX INFO: renamed from: a */
    public static void m10247a(GroupSuggestItemView groupSuggestItemView, View view) {
        groupSuggestItemView.a = (GroupSuggestItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        groupSuggestItemView.b = viewGroup.getChildAt(0);
        groupSuggestItemView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        groupSuggestItemView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        groupSuggestItemView.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        groupSuggestItemView.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        groupSuggestItemView.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        groupSuggestItemView.h = viewGroup.getChildAt(1);
    }
}
