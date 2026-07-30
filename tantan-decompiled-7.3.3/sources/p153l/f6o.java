package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class f6o {
    /* JADX INFO: renamed from: a */
    public static void m124319a(e6o e6oVar, View view) {
        e6oVar.f92291a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        e6oVar.f92292b = (VFrame) viewGroup.getChildAt(0);
        e6oVar.f92293c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        e6oVar.f92294d = (TabLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        e6oVar.f92295e = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        e6oVar.f92296f = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        e6oVar.f92297g = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        e6oVar.f92298h = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(2);
        e6oVar.f92299i = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(3);
        e6oVar.f92300j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(4);
        e6oVar.f92301k = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        e6oVar.f92302l = (VFrame) viewGroup.getChildAt(1);
        e6oVar.f92303m = (NoSaveStateViewPager) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        e6oVar.f92304n = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m124320b(e6o e6oVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193803N0, viewGroup, false);
        m124319a(e6oVar, viewInflate);
        return viewInflate;
    }
}
