package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.IntlNewUIFilterBaseSetting;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.tags.TagContainerLayout;
import p151v.VImage;
import p151v.VListCell;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jqo {
    /* JADX INFO: renamed from: a */
    public static void m146617a(iqo iqoVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        iqoVar.f116426a = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        iqoVar.f116427b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        iqoVar.f116428c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        iqoVar.f116429d = (VScroll) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        iqoVar.f116430e = (IntlNewUIFilterBaseSetting) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        iqoVar.f116431f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        iqoVar.f116432g = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        iqoVar.f116433h = (TagContainerLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        iqoVar.f116434i = (VListCell) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m146618b(iqo iqoVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167542V0, viewGroup, false);
        m146617a(iqoVar, viewInflate);
        return viewInflate;
    }
}
