package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.vip.picks.view.PicksItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ze70 {
    /* JADX INFO: renamed from: a */
    public static void m11390a(PicksItemView picksItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        picksItemView.a = viewGroup.getChildAt(0);
        picksItemView.b = viewGroup.getChildAt(1);
        picksItemView.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        picksItemView.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        picksItemView.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        picksItemView.f = viewGroup.getChildAt(2);
        picksItemView.g = viewGroup.getChildAt(3);
    }
}
