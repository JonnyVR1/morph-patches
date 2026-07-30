package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.common.debugdialog.TraceView;
import com.p046p1.mobile.putong.live.livingroom.common.debugdialog.TracetItemView;

/* JADX INFO: loaded from: classes4.dex */
public class s5j0 {
    /* JADX INFO: renamed from: a */
    public static void m182351a(TracetItemView tracetItemView, View view) {
        tracetItemView.f48978a = (TracetItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        tracetItemView.f48979b = viewGroup.getChildAt(0);
        tracetItemView.f48980c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        tracetItemView.f48981d = (TraceView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
