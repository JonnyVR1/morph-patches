package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.intloperation.regularsticker.RegularStickerHeaderItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class doc0 {
    /* JADX INFO: renamed from: a */
    public static void m6185a(RegularStickerHeaderItem regularStickerHeaderItem, View view) {
        regularStickerHeaderItem.d = (RegularStickerHeaderItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        regularStickerHeaderItem.e = (TextView) viewGroup.getChildAt(0);
        regularStickerHeaderItem.f = viewGroup.getChildAt(1);
    }
}
