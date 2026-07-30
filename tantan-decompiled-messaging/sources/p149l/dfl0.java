package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.active.VipActiveCard;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class dfl0 {
    /* JADX INFO: renamed from: a */
    public static void m111495a(VipActiveCard vipActiveCard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vipActiveCard._iv_cardpic = (VDraweeView) viewGroup.getChildAt(0);
        vipActiveCard._iv_vip_logo = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        vipActiveCard._tv_vip_title = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        vipActiveCard._tv_vip_subtitle = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        vipActiveCard._btn_bottom = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        vipActiveCard._iv_close = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        vipActiveCard._tv_price = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }
}
