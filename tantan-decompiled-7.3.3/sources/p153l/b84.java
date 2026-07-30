package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetItemView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class b84 {
    /* JADX INFO: renamed from: a */
    public static void m102915a(CallWidgetItemView callWidgetItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        callWidgetItemView.f52321a = (FrameLayout) viewGroup.getChildAt(0);
        callWidgetItemView.f52322b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        callWidgetItemView.f52323c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        callWidgetItemView.f52324d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        callWidgetItemView.f52325e = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        callWidgetItemView.f52326f = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        callWidgetItemView.f52327g = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        callWidgetItemView.f52328h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        callWidgetItemView.f52329i = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        callWidgetItemView.f52330j = (TextView) viewGroup.getChildAt(1);
        callWidgetItemView.f52331k = (TextView) viewGroup.getChildAt(2);
    }
}
