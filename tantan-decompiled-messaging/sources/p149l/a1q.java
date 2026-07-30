package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemAiPictureRight;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class a1q {
    /* JADX INFO: renamed from: a */
    public static void m94573a(ItemAiPictureRight itemAiPictureRight, View view) {
        itemAiPictureRight.f30785a = (ItemAiPictureRight) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemAiPictureRight.f30786b = (FrameLayout) viewGroup.getChildAt(0);
        itemAiPictureRight.f30787c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemAiPictureRight.f30788d = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemAiPictureRight.f30789e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
    }
}
