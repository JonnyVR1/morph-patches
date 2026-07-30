package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.newui.suggest.SuggesterItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wug0 {
    /* JADX INFO: renamed from: a */
    public static void m10548a(SuggesterItemView suggesterItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        suggesterItemView.a = viewGroup.getChildAt(0);
        suggesterItemView.b = viewGroup.getChildAt(1);
        suggesterItemView.c = (LinearLayout) viewGroup.getChildAt(2);
        suggesterItemView.d = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        suggesterItemView.e = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        suggesterItemView.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        suggesterItemView.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        suggesterItemView.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(2);
    }
}
