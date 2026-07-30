package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.supreme.SupremeListItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear_FillerMeasure;

/* JADX INFO: loaded from: classes10.dex */
public class m0h0 {
    /* JADX INFO: renamed from: a */
    public static void m152505a(SupremeListItemView supremeListItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        supremeListItemView._image = (VDraweeView) viewGroup.getChildAt(0);
        supremeListItemView._tag = (TextView) viewGroup.getChildAt(3);
        supremeListItemView._user_info = (VLinear_FillerMeasure) viewGroup.getChildAt(4);
        supremeListItemView._user_name = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        supremeListItemView._user_age = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        supremeListItemView._like_image = (VImage) viewGroup.getChildAt(5);
    }
}
