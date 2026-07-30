package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.intloperation.regularsticker.RegularStickerHeaderItem;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class doc0 {
    /* JADX INFO: renamed from: a */
    public static void m112802a(RegularStickerHeaderItem regularStickerHeaderItem, View view) {
        regularStickerHeaderItem._root_layout = (RegularStickerHeaderItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        regularStickerHeaderItem._title = (TextView) viewGroup.getChildAt(0);
        regularStickerHeaderItem._desc = (VText) viewGroup.getChildAt(1);
    }
}
