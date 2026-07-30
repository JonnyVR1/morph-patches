package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.discovery.SuggestTabItem;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class utg0 {
    /* JADX INFO: renamed from: a */
    public static void m195306a(SuggestTabItem suggestTabItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        suggestTabItem.f21363d = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        suggestTabItem.f21364e = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        suggestTabItem.f21365f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        suggestTabItem.f21366g = viewGroup.getChildAt(1);
    }
}
