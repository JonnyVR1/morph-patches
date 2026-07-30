package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.recreation.pk.view.PkSuggestAnchorItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class h280 {
    /* JADX INFO: renamed from: a */
    public static void m14131a(PkSuggestAnchorItemView pkSuggestAnchorItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pkSuggestAnchorItemView.a = (TextView) viewGroup.getChildAt(0);
        pkSuggestAnchorItemView.b = viewGroup.getChildAt(1);
        pkSuggestAnchorItemView.c = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        pkSuggestAnchorItemView.d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        pkSuggestAnchorItemView.e = (TextView) viewGroup.getChildAt(3);
        pkSuggestAnchorItemView.f = (TextView) viewGroup.getChildAt(4);
    }
}
