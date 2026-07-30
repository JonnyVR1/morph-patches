package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.result.SVipContentItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wnd0 {
    /* JADX INFO: renamed from: a */
    public static void m204677a(SVipContentItemView sVipContentItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        sVipContentItemView.f35608a = (FrameLayout) viewGroup.getChildAt(0);
        sVipContentItemView.f35609b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        sVipContentItemView.f35610c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        sVipContentItemView.f35611d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        sVipContentItemView.f35612e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        sVipContentItemView.f35613f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        sVipContentItemView.f35614g = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        sVipContentItemView.f35615h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        sVipContentItemView.f35616i = (FrameLayout) viewGroup.getChildAt(2);
        sVipContentItemView.f35617j = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        sVipContentItemView.f35618k = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        sVipContentItemView.f35619l = viewGroup.getChildAt(3);
    }
}
