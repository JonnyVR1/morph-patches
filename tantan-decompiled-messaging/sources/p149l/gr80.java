package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.customized.result.PrivateCustomResultListItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear_FillerMeasure;

/* JADX INFO: loaded from: classes10.dex */
public class gr80 {
    /* JADX INFO: renamed from: a */
    public static void m127677a(PrivateCustomResultListItemView privateCustomResultListItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privateCustomResultListItemView._image = (VDraweeView) viewGroup.getChildAt(0);
        privateCustomResultListItemView._tag = (TextView) viewGroup.getChildAt(3);
        privateCustomResultListItemView._user_info = (VLinear_FillerMeasure) viewGroup.getChildAt(4);
        privateCustomResultListItemView._user_name = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        privateCustomResultListItemView._user_age = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        privateCustomResultListItemView._like_image = (VImage) viewGroup.getChildAt(5);
    }
}
