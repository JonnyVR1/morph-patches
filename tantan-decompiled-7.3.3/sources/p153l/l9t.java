package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.view.LiveNewOptLabelView;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class l9t {
    /* JADX INFO: renamed from: a */
    public static void m153454a(LiveNewOptLabelView liveNewOptLabelView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveNewOptLabelView.f45555d = (VLinear) viewGroup.getChildAt(0);
        liveNewOptLabelView.f45556e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveNewOptLabelView.f45557f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveNewOptLabelView.f45558g = (VDraweeView) viewGroup.getChildAt(1);
        liveNewOptLabelView.f45559h = (VDraweeView) viewGroup.getChildAt(2);
    }
}
