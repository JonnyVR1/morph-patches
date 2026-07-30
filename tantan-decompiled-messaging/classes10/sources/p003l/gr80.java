package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.customized.result.PrivateCustomResultListItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class gr80 {
    /* JADX INFO: renamed from: a */
    public static void m6807a(PrivateCustomResultListItemView privateCustomResultListItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privateCustomResultListItemView.a = viewGroup.getChildAt(0);
        privateCustomResultListItemView.b = (TextView) viewGroup.getChildAt(3);
        privateCustomResultListItemView.c = viewGroup.getChildAt(4);
        privateCustomResultListItemView.d = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        privateCustomResultListItemView.e = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        privateCustomResultListItemView.f = viewGroup.getChildAt(5);
    }
}
