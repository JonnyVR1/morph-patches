package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.ui.messages.ItemPictureWithPayLeft;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ccq {
    /* JADX INFO: renamed from: a */
    public static void m5929a(ItemPictureWithPayLeft itemPictureWithPayLeft, View view) {
        itemPictureWithPayLeft.a = (ItemPictureWithPayLeft) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemPictureWithPayLeft.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemPictureWithPayLeft.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        itemPictureWithPayLeft.d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemPictureWithPayLeft.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemPictureWithPayLeft.f = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemPictureWithPayLeft.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        itemPictureWithPayLeft.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        itemPictureWithPayLeft.i = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(2);
        itemPictureWithPayLeft.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        itemPictureWithPayLeft.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3);
        itemPictureWithPayLeft.l = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemPictureWithPayLeft.m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
