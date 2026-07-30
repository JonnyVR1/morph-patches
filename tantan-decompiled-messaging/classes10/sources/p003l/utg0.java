package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.discovery.SuggestTabItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class utg0 {
    /* JADX INFO: renamed from: a */
    public static void m9782a(SuggestTabItem suggestTabItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        suggestTabItem.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        suggestTabItem.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        suggestTabItem.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        suggestTabItem.g = viewGroup.getChildAt(1);
    }
}
