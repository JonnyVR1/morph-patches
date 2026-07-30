package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemPictureTextRight;
import p151v.AutoVDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class beq {
    /* JADX INFO: renamed from: a */
    public static void m103774a(ItemPictureTextRight itemPictureTextRight, View view) {
        itemPictureTextRight.f32221a = (ItemPictureTextRight) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemPictureTextRight.f32222b = (AutoVDraweeView) viewGroup.getChildAt(0);
        itemPictureTextRight.f32223c = (LinearLayout) viewGroup.getChildAt(1);
        itemPictureTextRight.f32224d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemPictureTextRight.f32225e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        itemPictureTextRight.f32226f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
