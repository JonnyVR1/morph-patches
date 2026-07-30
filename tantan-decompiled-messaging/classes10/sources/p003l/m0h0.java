package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.supreme.SupremeListItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class m0h0 {
    /* JADX INFO: renamed from: a */
    public static void m7936a(SupremeListItemView supremeListItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        supremeListItemView.a = viewGroup.getChildAt(0);
        supremeListItemView.b = (TextView) viewGroup.getChildAt(3);
        supremeListItemView.c = viewGroup.getChildAt(4);
        supremeListItemView.d = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        supremeListItemView.e = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        supremeListItemView.f = viewGroup.getChildAt(5);
    }
}
