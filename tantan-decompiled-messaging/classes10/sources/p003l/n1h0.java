package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.supreme.hometab.SupremeTabItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class n1h0 {
    /* JADX INFO: renamed from: a */
    public static void m8297a(SupremeTabItem supremeTabItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        supremeTabItem.a = (TextView) viewGroup.getChildAt(0);
        supremeTabItem.b = viewGroup.getChildAt(1);
    }
}
