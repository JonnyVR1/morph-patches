package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetItemView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetView;
import p147v.VRelative;

/* JADX INFO: loaded from: classes4.dex */
public class w74 {
    /* JADX INFO: renamed from: a */
    public static void m202004a(CallWidgetView callWidgetView, View view) {
        callWidgetView.f51490a = (CallWidgetView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        callWidgetView.f51491b = (VRelative) viewGroup.getChildAt(0);
        callWidgetView.f51492c = (CallWidgetItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        callWidgetView.f51493d = (CallWidgetItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        callWidgetView.f51494e = (CallWidgetItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        callWidgetView.f51495f = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        callWidgetView.f51496g = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
