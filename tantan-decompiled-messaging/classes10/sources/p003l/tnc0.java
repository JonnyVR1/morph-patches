package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.intloperation.regularsticker.RegularStickerCardTabView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class tnc0 {
    /* JADX INFO: renamed from: a */
    public static void m9595a(RegularStickerCardTabView regularStickerCardTabView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        regularStickerCardTabView.a = viewGroup.getChildAt(0);
        regularStickerCardTabView.b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        regularStickerCardTabView.c = viewGroup.getChildAt(1);
    }
}
