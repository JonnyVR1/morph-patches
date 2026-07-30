package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.view.OnlineMatchNewUiCardView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class pm50 {
    /* JADX INFO: renamed from: a */
    public static void m170297a(OnlineMatchNewUiCardView onlineMatchNewUiCardView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        onlineMatchNewUiCardView.f32728a = (VLinear) viewGroup.getChildAt(1);
        onlineMatchNewUiCardView.f32729b = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        onlineMatchNewUiCardView.f32730c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        onlineMatchNewUiCardView.f32731d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        onlineMatchNewUiCardView.f32732e = (SVGAnimationView) viewGroup.getChildAt(2);
        onlineMatchNewUiCardView.f32733f = (VRelative) viewGroup.getChildAt(3);
        onlineMatchNewUiCardView.f32734g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        onlineMatchNewUiCardView.f32735h = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        onlineMatchNewUiCardView.f32736i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3)).getChildAt(0);
        onlineMatchNewUiCardView.f32737j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3)).getChildAt(1);
        onlineMatchNewUiCardView.f32738k = (FrameLayout) viewGroup.getChildAt(4);
        onlineMatchNewUiCardView.f32739l = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }
}
