package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.nearby.MeetNearbyUserItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class n5y {
    /* JADX INFO: renamed from: a */
    public static void m158022a(MeetNearbyUserItemView meetNearbyUserItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetNearbyUserItemView._image = (VDraweeView) viewGroup.getChildAt(0);
        meetNearbyUserItemView._online_tip = (TextView) viewGroup.getChildAt(3);
        meetNearbyUserItemView._user_info = (VLinear) viewGroup.getChildAt(4);
        meetNearbyUserItemView._user_distance = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        meetNearbyUserItemView._user_name = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        meetNearbyUserItemView._blur_desc = (TextView) viewGroup.getChildAt(5);
        meetNearbyUserItemView._pairing = (ImageView) viewGroup.getChildAt(6);
        meetNearbyUserItemView._dislike = (VImage) viewGroup.getChildAt(7);
        meetNearbyUserItemView._like = (VImage) viewGroup.getChildAt(8);
    }
}
