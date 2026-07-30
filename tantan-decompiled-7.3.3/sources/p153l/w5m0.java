package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.userCard.friend.VirtualUserCardMatchView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class w5m0 {
    /* JADX INFO: renamed from: a */
    public static void m204981a(VirtualUserCardMatchView virtualUserCardMatchView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        virtualUserCardMatchView._apply_layout = (VFrame) viewGroup.getChildAt(0);
        virtualUserCardMatchView._apply_layout_gift_icon = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        virtualUserCardMatchView._apply_layout_apply_text = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        virtualUserCardMatchView._accept_layout = (ConstraintLayout) viewGroup.getChildAt(1);
        virtualUserCardMatchView._accept_layout_apply_gift = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        virtualUserCardMatchView._accept_layout_content = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        virtualUserCardMatchView._accept_layout_apply_desc = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        virtualUserCardMatchView._accept_layout_apply_send_gift = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        virtualUserCardMatchView._accept_layout_accept_button = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
