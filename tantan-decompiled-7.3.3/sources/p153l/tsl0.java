package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.p058ui.vip.VipLocationItemView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class tsl0 {
    /* JADX INFO: renamed from: a */
    public static void m192617a(VipLocationItemView vipLocationItemView, View view) {
        vipLocationItemView.f37913a = (VipLocationItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        vipLocationItemView.f37914b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        vipLocationItemView.f37915c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        vipLocationItemView.f37916d = (VImage) viewGroup.getChildAt(1);
    }
}
