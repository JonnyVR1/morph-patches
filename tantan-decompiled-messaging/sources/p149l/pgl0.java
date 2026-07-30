package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.vip.VipConvItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class pgl0 {
    /* JADX INFO: renamed from: a */
    public static void m168758a(VipConvItemView vipConvItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vipConvItemView.f36981a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        vipConvItemView.f36982b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        vipConvItemView.f36983c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        vipConvItemView.f36984d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        vipConvItemView.f36985e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
