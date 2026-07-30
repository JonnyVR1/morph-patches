package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.p046p1.mobile.putong.core.p053ui.intloperation.regularsticker.RegularStickerCardTabView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class tnc0 {
    /* JADX INFO: renamed from: a */
    public static void m189772a(RegularStickerCardTabView regularStickerCardTabView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        regularStickerCardTabView._card = (MaterialCardView) viewGroup.getChildAt(0);
        regularStickerCardTabView._card_title = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        regularStickerCardTabView._image = (VDraweeView) viewGroup.getChildAt(1);
    }
}
