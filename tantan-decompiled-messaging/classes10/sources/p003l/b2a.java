package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.statussquare.CoreMyTabStatusPostView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class b2a {
    /* JADX INFO: renamed from: a */
    public static void m5676a(CoreMyTabStatusPostView coreMyTabStatusPostView, View view) {
        coreMyTabStatusPostView.a = (CoreMyTabStatusPostView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        coreMyTabStatusPostView.b = viewGroup.getChildAt(0);
        coreMyTabStatusPostView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        coreMyTabStatusPostView.d = viewGroup.getChildAt(1);
        coreMyTabStatusPostView.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        coreMyTabStatusPostView.f = viewGroup.getChildAt(2);
        coreMyTabStatusPostView.g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
