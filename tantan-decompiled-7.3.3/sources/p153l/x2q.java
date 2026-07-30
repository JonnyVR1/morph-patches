package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemAiPictureLeft;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class x2q {
    /* JADX INFO: renamed from: a */
    public static void m209170a(ItemAiPictureLeft itemAiPictureLeft, View view) {
        itemAiPictureLeft.f31624a = (ItemAiPictureLeft) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemAiPictureLeft.f31625b = (FrameLayout) viewGroup.getChildAt(0);
        itemAiPictureLeft.f31626c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemAiPictureLeft.f31627d = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemAiPictureLeft.f31628e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        itemAiPictureLeft.f31629f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemAiPictureLeft.f31630g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
