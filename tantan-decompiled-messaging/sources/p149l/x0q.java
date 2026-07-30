package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemAiPictureLeft;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class x0q {
    /* JADX INFO: renamed from: a */
    public static void m206643a(ItemAiPictureLeft itemAiPictureLeft, View view) {
        itemAiPictureLeft.f30776a = (ItemAiPictureLeft) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemAiPictureLeft.f30777b = (FrameLayout) viewGroup.getChildAt(0);
        itemAiPictureLeft.f30778c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemAiPictureLeft.f30779d = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemAiPictureLeft.f30780e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        itemAiPictureLeft.f30781f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemAiPictureLeft.f30782g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
