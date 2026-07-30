package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetItemView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetView;
import p151v.VRelative;

/* JADX INFO: loaded from: classes4.dex */
public class v84 {
    /* JADX INFO: renamed from: a */
    public static void m200287a(CallWidgetView callWidgetView, View view) {
        callWidgetView.f52338a = (CallWidgetView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        callWidgetView.f52339b = (VRelative) viewGroup.getChildAt(0);
        callWidgetView.f52340c = (CallWidgetItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        callWidgetView.f52341d = (CallWidgetItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        callWidgetView.f52342e = (CallWidgetItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        callWidgetView.f52343f = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        callWidgetView.f52344g = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
