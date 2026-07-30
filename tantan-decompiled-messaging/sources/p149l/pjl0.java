package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.p053ui.vip.VipLocationItemView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class pjl0 {
    /* JADX INFO: renamed from: a */
    public static void m169909a(VipLocationItemView vipLocationItemView, View view) {
        vipLocationItemView.f37065a = (VipLocationItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        vipLocationItemView.f37066b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        vipLocationItemView.f37067c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        vipLocationItemView.f37068d = (VImage) viewGroup.getChildAt(1);
    }
}
