package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemPictureTextLeft;
import p151v.AutoVDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class aeq {
    /* JADX INFO: renamed from: a */
    public static void m97258a(ItemPictureTextLeft itemPictureTextLeft, View view) {
        itemPictureTextLeft.f32213a = (ItemPictureTextLeft) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemPictureTextLeft.f32214b = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemPictureTextLeft.f32215c = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemPictureTextLeft.f32216d = (LinearLayout) viewGroup.getChildAt(1);
        itemPictureTextLeft.f32217e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemPictureTextLeft.f32218f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        itemPictureTextLeft.f32219g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
