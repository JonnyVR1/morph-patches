package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.discovery.SuggestUserItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xtg0 {
    /* JADX INFO: renamed from: a */
    public static void m10955a(SuggestUserItem suggestUserItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        suggestUserItem.a = viewGroup.getChildAt(0);
        suggestUserItem.b = viewGroup.getChildAt(1);
        suggestUserItem.c = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        suggestUserItem.d = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        suggestUserItem.e = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }
}
