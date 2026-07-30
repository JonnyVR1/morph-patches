package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.core.ui.result.VipContentItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ngl0 {
    /* JADX INFO: renamed from: a */
    public static void m8330a(VipContentItemView vipContentItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vipContentItemView.a = (ImageView) viewGroup.getChildAt(0);
        vipContentItemView.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        vipContentItemView.c = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        vipContentItemView.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        vipContentItemView.e = (ImageView) viewGroup.getChildAt(2);
    }
}
