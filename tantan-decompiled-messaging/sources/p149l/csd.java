package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.statussquare.CoreMyTabStatusPostView;
import com.p046p1.mobile.putong.core.newui.statussquare.CoreStatusSquareEnterView;
import com.p046p1.mobile.putong.core.newui.view.RoundedRectangleProgressView;
import com.p046p1.mobile.putong.newui.view.ODiamondTagLabel;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class csd {
    /* JADX INFO: renamed from: a */
    public static void m108492a(bsd bsdVar, View view) {
        bsdVar.f77033a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        bsdVar.f77034b = (FrameLayout) viewGroup.getChildAt(0);
        bsdVar.f77035c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        bsdVar.f77036d = (RoundedRectangleProgressView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        bsdVar.f77037e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        bsdVar.f77038f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        bsdVar.f77039g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        bsdVar.f77040h = (LinearLayout) viewGroup.getChildAt(1);
        bsdVar.f77041i = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        bsdVar.f77042j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        bsdVar.f77043k = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        bsdVar.f77044l = (ODiamondTagLabel) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        bsdVar.f77045m = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        bsdVar.f77046n = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        bsdVar.f77047o = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        bsdVar.f77048p = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        bsdVar.f77049q = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        bsdVar.f77050r = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        bsdVar.f77051s = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        bsdVar.f77052t = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        bsdVar.f77053u = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        bsdVar.f77054v = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        bsdVar.f77055w = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        bsdVar.f77056x = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(0);
        bsdVar.f77057y = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(1);
        bsdVar.f77058z = (CoreStatusSquareEnterView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
        bsdVar.f77031A = (CoreMyTabStatusPostView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m108493b(bsd bsdVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95498O7, viewGroup, false);
        m108492a(bsdVar, viewInflate);
        return viewInflate;
    }
}
