package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.common.debugdialog.TraceView;
import com.p051p1.mobile.putong.live.livingroom.common.debugdialog.TracetItemView;

/* JADX INFO: loaded from: classes4.dex */
public class wej0 {
    /* JADX INFO: renamed from: a */
    public static void m205995a(TracetItemView tracetItemView, View view) {
        tracetItemView.f49826a = (TracetItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        tracetItemView.f49827b = viewGroup.getChildAt(0);
        tracetItemView.f49828c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        tracetItemView.f49829d = (TraceView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
