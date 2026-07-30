package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.supreme.SupremeListItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear_FillerMeasure;

/* JADX INFO: loaded from: classes10.dex */
public class u8h0 {
    /* JADX INFO: renamed from: a */
    public static void m195040a(SupremeListItemView supremeListItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        supremeListItemView._image = (VDraweeView) viewGroup.getChildAt(0);
        supremeListItemView._tag = (TextView) viewGroup.getChildAt(3);
        supremeListItemView._user_info = (VLinear_FillerMeasure) viewGroup.getChildAt(4);
        supremeListItemView._user_name = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        supremeListItemView._user_age = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        supremeListItemView._like_image = (VImage) viewGroup.getChildAt(5);
    }
}
