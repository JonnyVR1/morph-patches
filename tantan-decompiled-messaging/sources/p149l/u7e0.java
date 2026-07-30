package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.seeblindbox.SeeBlindBoxItem;
import p147v.VButton;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class u7e0 {
    /* JADX INFO: renamed from: a */
    public static void m192134a(t7e0 t7e0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        t7e0Var._bg_view = (VFrame) viewGroup.getChildAt(0);
        t7e0Var._title_icon = (VImage) viewGroup.getChildAt(1);
        t7e0Var._desc = (VText) viewGroup.getChildAt(2);
        t7e0Var._card_1 = (SeeBlindBoxItem) viewGroup.getChildAt(3);
        t7e0Var._card_2 = (SeeBlindBoxItem) viewGroup.getChildAt(4);
        t7e0Var._card_3 = (SeeBlindBoxItem) viewGroup.getChildAt(5);
        t7e0Var._card_4 = (SeeBlindBoxItem) viewGroup.getChildAt(6);
        t7e0Var._skip = (VButton) viewGroup.getChildAt(7);
    }
}
