package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.messages.recommend.view.NewMatchItemLayout;
import com.p051p1.mobile.putong.core.newui.view.ShimmerOptLayout;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class xk30 {
    /* JADX INFO: renamed from: a */
    public static void m211340a(NewMatchItemLayout newMatchItemLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newMatchItemLayout.f26671a = (VDraweeView) viewGroup.getChildAt(0);
        newMatchItemLayout.f26672b = (VDraweeView) viewGroup.getChildAt(1);
        newMatchItemLayout.f26673c = (VFrame) viewGroup.getChildAt(2);
        newMatchItemLayout.f26674d = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        newMatchItemLayout.f26675e = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        newMatchItemLayout.f26676f = (ShimmerOptLayout) viewGroup.getChildAt(3);
        newMatchItemLayout.f26677g = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
    }
}
