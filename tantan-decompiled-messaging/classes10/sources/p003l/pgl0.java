package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.vip.VipConvItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pgl0 {
    /* JADX INFO: renamed from: a */
    public static void m8748a(VipConvItemView vipConvItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vipConvItemView.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        vipConvItemView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        vipConvItemView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        vipConvItemView.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        vipConvItemView.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
