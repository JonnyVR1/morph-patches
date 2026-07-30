package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemPictureTextLeft;
import p147v.AutoVDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class acq {
    /* JADX INFO: renamed from: a */
    public static void m95832a(ItemPictureTextLeft itemPictureTextLeft, View view) {
        itemPictureTextLeft.f31365a = (ItemPictureTextLeft) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemPictureTextLeft.f31366b = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemPictureTextLeft.f31367c = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemPictureTextLeft.f31368d = (LinearLayout) viewGroup.getChildAt(1);
        itemPictureTextLeft.f31369e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemPictureTextLeft.f31370f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        itemPictureTextLeft.f31371g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
