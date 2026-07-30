package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.p051p1.mobile.putong.core.p058ui.intloperation.regularsticker.RegularStickerCardTabView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class yvc0 {
    /* JADX INFO: renamed from: a */
    public static void m217487a(RegularStickerCardTabView regularStickerCardTabView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        regularStickerCardTabView._card = (MaterialCardView) viewGroup.getChildAt(0);
        regularStickerCardTabView._card_title = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        regularStickerCardTabView._image = (VDraweeView) viewGroup.getChildAt(1);
    }
}
