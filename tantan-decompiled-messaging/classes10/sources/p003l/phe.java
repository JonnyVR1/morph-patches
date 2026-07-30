package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.greet.DynamicGreetStatusView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class phe {
    /* JADX INFO: renamed from: a */
    public static void m8749a(DynamicGreetStatusView dynamicGreetStatusView, View view) {
        dynamicGreetStatusView.a = (DynamicGreetStatusView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        dynamicGreetStatusView.b = viewGroup.getChildAt(0);
        dynamicGreetStatusView.c = viewGroup.getChildAt(1);
    }
}
