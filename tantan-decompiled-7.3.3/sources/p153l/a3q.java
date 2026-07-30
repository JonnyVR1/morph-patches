package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemAiPictureRight;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class a3q {
    /* JADX INFO: renamed from: a */
    public static void m95866a(ItemAiPictureRight itemAiPictureRight, View view) {
        itemAiPictureRight.f31633a = (ItemAiPictureRight) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemAiPictureRight.f31634b = (FrameLayout) viewGroup.getChildAt(0);
        itemAiPictureRight.f31635c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemAiPictureRight.f31636d = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemAiPictureRight.f31637e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
    }
}
