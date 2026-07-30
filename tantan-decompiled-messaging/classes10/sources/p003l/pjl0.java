package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.core.ui.vip.VipLocationItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pjl0 {
    /* JADX INFO: renamed from: a */
    public static void m8756a(VipLocationItemView vipLocationItemView, View view) {
        vipLocationItemView.a = (VipLocationItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        vipLocationItemView.b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        vipLocationItemView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        vipLocationItemView.d = viewGroup.getChildAt(1);
    }
}
