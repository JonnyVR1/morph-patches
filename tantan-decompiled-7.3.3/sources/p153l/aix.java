package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.MbtiLayout;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import p151v.VFrame;
import p151v.VFrame_Shadow;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class aix {
    /* JADX INFO: renamed from: a */
    public static void m98213a(MbtiLayout mbtiLayout, View view) {
        mbtiLayout.f23391a = (MbtiLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mbtiLayout.f23392b = (VLinear) viewGroup.getChildAt(0);
        mbtiLayout.f23393c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mbtiLayout.f23394d = (VText_Medium) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mbtiLayout.f23395e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        mbtiLayout.f23396f = (SimpleDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        mbtiLayout.f23397g = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        mbtiLayout.f23398h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        mbtiLayout.f23399i = (VFrame) viewGroup.getChildAt(2);
        mbtiLayout.f23400j = (VLinear) viewGroup.getChildAt(3);
        mbtiLayout.f23401k = (VText_Medium) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        mbtiLayout.f23402l = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        mbtiLayout.f23403m = (VText_Medium) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        mbtiLayout.f23404n = (VFrame_Shadow) viewGroup.getChildAt(4);
        mbtiLayout.f23405o = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }
}
