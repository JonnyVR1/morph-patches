package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.view.CoreImEmptyView;

/* JADX INFO: loaded from: classes10.dex */
public class f39 {
    /* JADX INFO: renamed from: a */
    public static void m123720a(CoreImEmptyView coreImEmptyView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        coreImEmptyView.f37574a = (ImageView) viewGroup.getChildAt(0);
        coreImEmptyView.f37575b = (TextView) viewGroup.getChildAt(1);
        coreImEmptyView.f37576c = (LinearLayout) viewGroup.getChildAt(2);
        coreImEmptyView.f37577d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        coreImEmptyView.f37578e = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        coreImEmptyView.f37579f = (TextView) viewGroup.getChildAt(3);
    }
}
