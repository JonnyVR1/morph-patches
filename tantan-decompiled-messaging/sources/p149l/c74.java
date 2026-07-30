package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetItemView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class c74 {
    /* JADX INFO: renamed from: a */
    public static void m105526a(CallWidgetItemView callWidgetItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        callWidgetItemView.f51473a = (FrameLayout) viewGroup.getChildAt(0);
        callWidgetItemView.f51474b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        callWidgetItemView.f51475c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        callWidgetItemView.f51476d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        callWidgetItemView.f51477e = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        callWidgetItemView.f51478f = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        callWidgetItemView.f51479g = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        callWidgetItemView.f51480h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        callWidgetItemView.f51481i = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        callWidgetItemView.f51482j = (TextView) viewGroup.getChildAt(1);
        callWidgetItemView.f51483k = (TextView) viewGroup.getChildAt(2);
    }
}
