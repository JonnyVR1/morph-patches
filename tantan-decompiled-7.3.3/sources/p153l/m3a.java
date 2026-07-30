package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.statussquare.CoreMyTabStatusPostView;
import p151v.VDraweeView;
import p151v.VFrame;

/* JADX INFO: loaded from: classes10.dex */
public class m3a {
    /* JADX INFO: renamed from: a */
    public static void m156922a(CoreMyTabStatusPostView coreMyTabStatusPostView, View view) {
        coreMyTabStatusPostView.f27626a = (CoreMyTabStatusPostView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        coreMyTabStatusPostView.f27627b = (VFrame) viewGroup.getChildAt(0);
        coreMyTabStatusPostView.f27628c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        coreMyTabStatusPostView.f27629d = (VFrame) viewGroup.getChildAt(1);
        coreMyTabStatusPostView.f27630e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        coreMyTabStatusPostView.f27631f = (VFrame) viewGroup.getChildAt(2);
        coreMyTabStatusPostView.f27632g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
