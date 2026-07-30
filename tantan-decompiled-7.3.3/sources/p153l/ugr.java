package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.feed.p065ui.moments.LikeView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ugr {
    /* JADX INFO: renamed from: a */
    public static void m195934a(LikeView likeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likeView.f44500a = (LinearLayout) viewGroup.getChildAt(0);
        likeView.f44501b = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        likeView.f44502c = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        likeView.f44503d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        likeView.f44504e = viewGroup.getChildAt(1);
    }
}
