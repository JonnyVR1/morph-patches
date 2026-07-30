package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.p1.mobile.putong.core.ui.messages.ItemAiPictureRight;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class a1q {
    /* JADX INFO: renamed from: a */
    public static void m5271a(ItemAiPictureRight itemAiPictureRight, View view) {
        itemAiPictureRight.a = (ItemAiPictureRight) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemAiPictureRight.b = (FrameLayout) viewGroup.getChildAt(0);
        itemAiPictureRight.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemAiPictureRight.d = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemAiPictureRight.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
    }
}
