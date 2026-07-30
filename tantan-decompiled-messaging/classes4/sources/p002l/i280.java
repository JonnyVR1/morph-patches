package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.recreation.pk.view.PkSuggestItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class i280 {
    /* JADX INFO: renamed from: a */
    public static void m14985a(PkSuggestItemView pkSuggestItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pkSuggestItemView.a = viewGroup.getChildAt(0);
        pkSuggestItemView.b = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        pkSuggestItemView.c = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        pkSuggestItemView.d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        pkSuggestItemView.e = (TextView) viewGroup.getChildAt(2);
    }
}
