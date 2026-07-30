package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p1.mobile.putong.core.ui.vip.VipItemDetailPage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vhl0 {
    /* JADX INFO: renamed from: a */
    public static void m10228a(VipItemDetailPage vipItemDetailPage, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vipItemDetailPage.a = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        vipItemDetailPage.b = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        vipItemDetailPage.c = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        vipItemDetailPage.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        vipItemDetailPage.e = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        vipItemDetailPage.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        vipItemDetailPage.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        vipItemDetailPage.h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        vipItemDetailPage.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        vipItemDetailPage.j = viewGroup.getChildAt(1);
        vipItemDetailPage.k = viewGroup.getChildAt(2);
        vipItemDetailPage.l = viewGroup.getChildAt(3);
    }
}
