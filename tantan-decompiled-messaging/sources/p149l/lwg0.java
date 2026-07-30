package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.ComboNumView;
import com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.SuperLikeComboProgressView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class lwg0 {
    /* JADX INFO: renamed from: a */
    public static void m151968a(SuperLikeComboAnimView superLikeComboAnimView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        superLikeComboAnimView._ribbon_svga = (SVGAnimationView) viewGroup.getChildAt(0);
        superLikeComboAnimView._star_svga = (SVGAnimationView) viewGroup.getChildAt(1);
        superLikeComboAnimView._root = (RelativeLayout) viewGroup.getChildAt(2);
        superLikeComboAnimView._shadow = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        superLikeComboAnimView._stuff = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        superLikeComboAnimView._receive_superlike_img = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        superLikeComboAnimView._superlike_layout = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        superLikeComboAnimView._superlike_progress = (SuperLikeComboProgressView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(0);
        superLikeComboAnimView._superlike_foreground = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(1);
        superLikeComboAnimView._star_layout = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        superLikeComboAnimView._star = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(0);
        superLikeComboAnimView._nums = (ComboNumView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(1);
    }
}
