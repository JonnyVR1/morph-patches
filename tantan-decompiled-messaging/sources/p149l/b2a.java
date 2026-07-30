package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.statussquare.CoreMyTabStatusPostView;
import p147v.VDraweeView;
import p147v.VFrame;

/* JADX INFO: loaded from: classes10.dex */
public class b2a {
    /* JADX INFO: renamed from: a */
    public static void m99956a(CoreMyTabStatusPostView coreMyTabStatusPostView, View view) {
        coreMyTabStatusPostView.f26778a = (CoreMyTabStatusPostView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        coreMyTabStatusPostView.f26779b = (VFrame) viewGroup.getChildAt(0);
        coreMyTabStatusPostView.f26780c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        coreMyTabStatusPostView.f26781d = (VFrame) viewGroup.getChildAt(1);
        coreMyTabStatusPostView.f26782e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        coreMyTabStatusPostView.f26783f = (VFrame) viewGroup.getChildAt(2);
        coreMyTabStatusPostView.f26784g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
