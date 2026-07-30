package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.discovery.SuggestTabItem;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class c2h0 {
    /* JADX INFO: renamed from: a */
    public static void m107687a(SuggestTabItem suggestTabItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        suggestTabItem.f22105d = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        suggestTabItem.f22106e = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        suggestTabItem.f22107f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        suggestTabItem.f22108g = viewGroup.getChildAt(1);
    }
}
