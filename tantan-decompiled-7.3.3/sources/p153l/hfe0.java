package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.active.SeeActiveCard;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hfe0 {
    /* JADX INFO: renamed from: a */
    public static void m134793a(SeeActiveCard seeActiveCard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        seeActiveCard._iv_cardpic = (VDraweeView) viewGroup.getChildAt(0);
        seeActiveCard._iv_see_logo = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        seeActiveCard._vl_head_layout = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        seeActiveCard._tv_see_title = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        seeActiveCard._tv_see_subtitle = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        seeActiveCard._btn_bottom = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        seeActiveCard._iv_close = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        seeActiveCard._tv_price = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
    }
}
