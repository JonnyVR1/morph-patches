package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.seeblindbox.SeeBlindBoxItem;
import p151v.VButton;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class zfe0 {
    /* JADX INFO: renamed from: a */
    public static void m219535a(yfe0 yfe0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        yfe0Var._bg_view = (VFrame) viewGroup.getChildAt(0);
        yfe0Var._title_icon = (VImage) viewGroup.getChildAt(1);
        yfe0Var._desc = (VText) viewGroup.getChildAt(2);
        yfe0Var._card_1 = (SeeBlindBoxItem) viewGroup.getChildAt(3);
        yfe0Var._card_2 = (SeeBlindBoxItem) viewGroup.getChildAt(4);
        yfe0Var._card_3 = (SeeBlindBoxItem) viewGroup.getChildAt(5);
        yfe0Var._card_4 = (SeeBlindBoxItem) viewGroup.getChildAt(6);
        yfe0Var._skip = (VButton) viewGroup.getChildAt(7);
    }
}
