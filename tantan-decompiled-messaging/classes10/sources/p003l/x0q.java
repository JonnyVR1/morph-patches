package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.p1.mobile.putong.core.ui.messages.ItemAiPictureLeft;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class x0q {
    /* JADX INFO: renamed from: a */
    public static void m10613a(ItemAiPictureLeft itemAiPictureLeft, View view) {
        itemAiPictureLeft.a = (ItemAiPictureLeft) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemAiPictureLeft.b = (FrameLayout) viewGroup.getChildAt(0);
        itemAiPictureLeft.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemAiPictureLeft.d = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemAiPictureLeft.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        itemAiPictureLeft.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemAiPictureLeft.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
