package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemPictureWithPayLeft;
import p147v.AutoVDraweeView;
import p147v.VCheckBox;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ccq {
    /* JADX INFO: renamed from: a */
    public static void m106136a(ItemPictureWithPayLeft itemPictureWithPayLeft, View view) {
        itemPictureWithPayLeft.f31380a = (ItemPictureWithPayLeft) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemPictureWithPayLeft.f31381b = (AutoVDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemPictureWithPayLeft.f31382c = (AutoVDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        itemPictureWithPayLeft.f31383d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemPictureWithPayLeft.f31384e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemPictureWithPayLeft.f31385f = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemPictureWithPayLeft.f31386g = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        itemPictureWithPayLeft.f31387h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        itemPictureWithPayLeft.f31388i = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(2);
        itemPictureWithPayLeft.f31389j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        itemPictureWithPayLeft.f31390k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3);
        itemPictureWithPayLeft.f31391l = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemPictureWithPayLeft.f31392m = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
