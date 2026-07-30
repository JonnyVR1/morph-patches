package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.nearby.NearbyItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class mg20 {
    /* JADX INFO: renamed from: a */
    public static void m158184a(NearbyItemView nearbyItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        nearbyItemView._image = (VDraweeView) viewGroup.getChildAt(0);
        nearbyItemView._online_tip = (TextView) viewGroup.getChildAt(3);
        nearbyItemView._user_info = (VLinear) viewGroup.getChildAt(4);
        nearbyItemView._user_distance = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        nearbyItemView._user_name = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        nearbyItemView._blur_desc = (TextView) viewGroup.getChildAt(5);
        nearbyItemView._pairing = (ImageView) viewGroup.getChildAt(6);
        nearbyItemView._dislike = (VImage) viewGroup.getChildAt(7);
        nearbyItemView._like = (VImage) viewGroup.getChildAt(8);
    }
}
