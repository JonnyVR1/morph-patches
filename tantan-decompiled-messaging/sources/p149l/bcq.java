package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemPictureTextRight;
import p147v.AutoVDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class bcq {
    /* JADX INFO: renamed from: a */
    public static void m101119a(ItemPictureTextRight itemPictureTextRight, View view) {
        itemPictureTextRight.f31373a = (ItemPictureTextRight) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemPictureTextRight.f31374b = (AutoVDraweeView) viewGroup.getChildAt(0);
        itemPictureTextRight.f31375c = (LinearLayout) viewGroup.getChildAt(1);
        itemPictureTextRight.f31376d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemPictureTextRight.f31377e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        itemPictureTextRight.f31378f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
