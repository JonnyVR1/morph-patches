package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p046p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p046p1.mobile.putong.core.newui.view.LinearMeasureOrderLayout;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.core.p053ui.impresssignal.ImpressSignalCardNewUIView;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class zlm {
    /* JADX INFO: renamed from: a */
    public static void m219283a(ImpressSignalCardNewUIView impressSignalCardNewUIView, View view) {
        impressSignalCardNewUIView.f29738a = (ImpressSignalCardNewUIView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        impressSignalCardNewUIView.f29739b = (PictureView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        impressSignalCardNewUIView.f29740c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        impressSignalCardNewUIView.f29741d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        impressSignalCardNewUIView.f29742e = (LinearMeasureOrderLayout) viewGroup.getChildAt(1);
        impressSignalCardNewUIView.f29743f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        impressSignalCardNewUIView.f29744g = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        impressSignalCardNewUIView.f29745h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        impressSignalCardNewUIView.f29746i = (CardBottomBaseInfoView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        impressSignalCardNewUIView.f29747j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        impressSignalCardNewUIView.f29748k = (CardUserContentView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
        impressSignalCardNewUIView.f29749l = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(3);
        impressSignalCardNewUIView.f29750m = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        impressSignalCardNewUIView.f29751n = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        impressSignalCardNewUIView.f29752o = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(3)).getChildAt(2);
        impressSignalCardNewUIView.f29753p = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        impressSignalCardNewUIView.f29754q = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }
}
