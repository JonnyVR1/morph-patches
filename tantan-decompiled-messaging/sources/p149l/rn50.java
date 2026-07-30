package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.onlinezone.OnlineZoneItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class rn50 {
    /* JADX INFO: renamed from: a */
    public static void m180063a(OnlineZoneItemView onlineZoneItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        onlineZoneItemView._image = (VDraweeView) viewGroup.getChildAt(0);
        onlineZoneItemView._user_info = (VLinear) viewGroup.getChildAt(3);
        onlineZoneItemView._super_like_tag = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        onlineZoneItemView._online_tip = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        onlineZoneItemView._user_name = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        onlineZoneItemView._blur_online_tip = (TextView) viewGroup.getChildAt(4);
        onlineZoneItemView._super_like = (ImageView) viewGroup.getChildAt(5);
    }
}
