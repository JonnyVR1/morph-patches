package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.intloperation.regularsticker.RegularStickerItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class goc0 {
    /* JADX INFO: renamed from: a */
    public static void m6778a(RegularStickerItemView regularStickerItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        regularStickerItemView.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        regularStickerItemView.b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
