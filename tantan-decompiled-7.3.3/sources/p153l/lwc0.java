package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.intloperation.regularsticker.RegularStickerItemView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class lwc0 {
    /* JADX INFO: renamed from: a */
    public static void m156039a(RegularStickerItemView regularStickerItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        regularStickerItemView._setting_img = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        regularStickerItemView._setting_content_title = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
