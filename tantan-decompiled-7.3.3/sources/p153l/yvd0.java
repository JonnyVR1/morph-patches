package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.result.SVipContentItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class yvd0 {
    /* JADX INFO: renamed from: a */
    public static void m217488a(SVipContentItemView sVipContentItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        sVipContentItemView.f36456a = (FrameLayout) viewGroup.getChildAt(0);
        sVipContentItemView.f36457b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        sVipContentItemView.f36458c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        sVipContentItemView.f36459d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        sVipContentItemView.f36460e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        sVipContentItemView.f36461f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        sVipContentItemView.f36462g = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        sVipContentItemView.f36463h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        sVipContentItemView.f36464i = (FrameLayout) viewGroup.getChildAt(2);
        sVipContentItemView.f36465j = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        sVipContentItemView.f36466k = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        sVipContentItemView.f36467l = viewGroup.getChildAt(3);
    }
}
