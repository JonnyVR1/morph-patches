package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p051p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p051p1.mobile.putong.core.newui.view.LinearMeasureOrderLayout;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.core.p058ui.impresssignal.ImpressSignalCardNewUIView;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class bom {
    /* JADX INFO: renamed from: a */
    public static void m105706a(ImpressSignalCardNewUIView impressSignalCardNewUIView, View view) {
        impressSignalCardNewUIView.f30586a = (ImpressSignalCardNewUIView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        impressSignalCardNewUIView.f30587b = (PictureView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        impressSignalCardNewUIView.f30588c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        impressSignalCardNewUIView.f30589d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        impressSignalCardNewUIView.f30590e = (LinearMeasureOrderLayout) viewGroup.getChildAt(1);
        impressSignalCardNewUIView.f30591f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        impressSignalCardNewUIView.f30592g = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        impressSignalCardNewUIView.f30593h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        impressSignalCardNewUIView.f30594i = (CardBottomBaseInfoView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        impressSignalCardNewUIView.f30595j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        impressSignalCardNewUIView.f30596k = (CardUserContentView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
        impressSignalCardNewUIView.f30597l = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(3);
        impressSignalCardNewUIView.f30598m = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        impressSignalCardNewUIView.f30599n = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        impressSignalCardNewUIView.f30600o = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(3)).getChildAt(2);
        impressSignalCardNewUIView.f30601p = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        impressSignalCardNewUIView.f30602q = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }
}
