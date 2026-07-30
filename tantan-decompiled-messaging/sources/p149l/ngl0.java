package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.p053ui.result.VipContentItemView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ngl0 {
    /* JADX INFO: renamed from: a */
    public static void m159337a(VipContentItemView vipContentItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vipContentItemView.f35681a = (ImageView) viewGroup.getChildAt(0);
        vipContentItemView.f35682b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        vipContentItemView.f35683c = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        vipContentItemView.f35684d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        vipContentItemView.f35685e = (ImageView) viewGroup.getChildAt(2);
    }
}
