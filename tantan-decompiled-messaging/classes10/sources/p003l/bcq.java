package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.messages.ItemPictureTextRight;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class bcq {
    /* JADX INFO: renamed from: a */
    public static void m5709a(ItemPictureTextRight itemPictureTextRight, View view) {
        itemPictureTextRight.a = (ItemPictureTextRight) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemPictureTextRight.b = viewGroup.getChildAt(0);
        itemPictureTextRight.c = (LinearLayout) viewGroup.getChildAt(1);
        itemPictureTextRight.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemPictureTextRight.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        itemPictureTextRight.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
