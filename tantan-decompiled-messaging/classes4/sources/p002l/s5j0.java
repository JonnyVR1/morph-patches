package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.common.debugdialog.TraceView;
import com.p000p1.mobile.putong.live.livingroom.common.debugdialog.TracetItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class s5j0 {
    /* JADX INFO: renamed from: a */
    public static void m22209a(TracetItemView tracetItemView, View view) {
        tracetItemView.f5020a = (TracetItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        tracetItemView.f5021b = viewGroup.getChildAt(0);
        tracetItemView.f5022c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        tracetItemView.f5023d = (TraceView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
