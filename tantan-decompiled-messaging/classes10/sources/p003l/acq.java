package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.messages.ItemPictureTextLeft;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class acq {
    /* JADX INFO: renamed from: a */
    public static void m5356a(ItemPictureTextLeft itemPictureTextLeft, View view) {
        itemPictureTextLeft.a = (ItemPictureTextLeft) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemPictureTextLeft.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemPictureTextLeft.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemPictureTextLeft.d = (LinearLayout) viewGroup.getChildAt(1);
        itemPictureTextLeft.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemPictureTextLeft.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        itemPictureTextLeft.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
