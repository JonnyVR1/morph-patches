package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.seeblindbox.SeeBlindBoxItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class a8e0 {
    /* JADX INFO: renamed from: a */
    public static void m5299a(SeeBlindBoxItem seeBlindBoxItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        seeBlindBoxItem.a = viewGroup.getChildAt(0);
        seeBlindBoxItem.b = viewGroup.getChildAt(1);
        seeBlindBoxItem.c = viewGroup.getChildAt(2);
        seeBlindBoxItem.d = viewGroup.getChildAt(3);
        seeBlindBoxItem.e = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        seeBlindBoxItem.f = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
