package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemPictureWithPayLeft;
import p151v.AutoVDraweeView;
import p151v.VCheckBox;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ceq {
    /* JADX INFO: renamed from: a */
    public static void m109448a(ItemPictureWithPayLeft itemPictureWithPayLeft, View view) {
        itemPictureWithPayLeft.f32228a = (ItemPictureWithPayLeft) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemPictureWithPayLeft.f32229b = (AutoVDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemPictureWithPayLeft.f32230c = (AutoVDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        itemPictureWithPayLeft.f32231d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemPictureWithPayLeft.f32232e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemPictureWithPayLeft.f32233f = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemPictureWithPayLeft.f32234g = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        itemPictureWithPayLeft.f32235h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        itemPictureWithPayLeft.f32236i = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(2);
        itemPictureWithPayLeft.f32237j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        itemPictureWithPayLeft.f32238k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3);
        itemPictureWithPayLeft.f32239l = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemPictureWithPayLeft.f32240m = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
