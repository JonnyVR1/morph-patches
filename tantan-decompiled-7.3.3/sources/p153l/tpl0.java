package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.vip.VipConvItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class tpl0 {
    /* JADX INFO: renamed from: a */
    public static void m192145a(VipConvItemView vipConvItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vipConvItemView.f37829a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        vipConvItemView.f37830b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        vipConvItemView.f37831c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        vipConvItemView.f37832d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        vipConvItemView.f37833e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
