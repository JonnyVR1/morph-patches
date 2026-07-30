package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.view.OnlineMatchNewUiCardView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class vu50 {
    /* JADX INFO: renamed from: a */
    public static void m202776a(OnlineMatchNewUiCardView onlineMatchNewUiCardView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        onlineMatchNewUiCardView.f33576a = (VLinear) viewGroup.getChildAt(1);
        onlineMatchNewUiCardView.f33577b = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        onlineMatchNewUiCardView.f33578c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        onlineMatchNewUiCardView.f33579d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        onlineMatchNewUiCardView.f33580e = (SVGAnimationView) viewGroup.getChildAt(2);
        onlineMatchNewUiCardView.f33581f = (VRelative) viewGroup.getChildAt(3);
        onlineMatchNewUiCardView.f33582g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        onlineMatchNewUiCardView.f33583h = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        onlineMatchNewUiCardView.f33584i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3)).getChildAt(0);
        onlineMatchNewUiCardView.f33585j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3)).getChildAt(1);
        onlineMatchNewUiCardView.f33586k = (FrameLayout) viewGroup.getChildAt(4);
        onlineMatchNewUiCardView.f33587l = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }
}
