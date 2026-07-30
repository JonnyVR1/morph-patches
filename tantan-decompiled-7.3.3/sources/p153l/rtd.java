package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.statussquare.CoreMyTabStatusPostView;
import com.p051p1.mobile.putong.core.newui.statussquare.CoreStatusSquareEnterView;
import com.p051p1.mobile.putong.core.newui.view.RoundedRectangleProgressView;
import com.p051p1.mobile.putong.newui.view.ODiamondTagLabel;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class rtd {
    /* JADX INFO: renamed from: a */
    public static void m183108a(qtd qtdVar, View view) {
        qtdVar.f159406a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        qtdVar.f159407b = (FrameLayout) viewGroup.getChildAt(0);
        qtdVar.f159408c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        qtdVar.f159409d = (RoundedRectangleProgressView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        qtdVar.f159410e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        qtdVar.f159411f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        qtdVar.f159412g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        qtdVar.f159413h = (LinearLayout) viewGroup.getChildAt(1);
        qtdVar.f159414i = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        qtdVar.f159415j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        qtdVar.f159416k = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        qtdVar.f159417l = (ODiamondTagLabel) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        qtdVar.f159418m = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        qtdVar.f159419n = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        qtdVar.f159420o = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        qtdVar.f159421p = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        qtdVar.f159422q = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        qtdVar.f159423r = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        qtdVar.f159424s = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        qtdVar.f159425t = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        qtdVar.f159426u = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        qtdVar.f159427v = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        qtdVar.f159428w = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        qtdVar.f159429x = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(0);
        qtdVar.f159430y = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(1);
        qtdVar.f159431z = (CoreStatusSquareEnterView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
        qtdVar.f159404A = (CoreMyTabStatusPostView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m183109b(qtd qtdVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125664V7, viewGroup, false);
        m183108a(qtdVar, viewInflate);
        return viewInflate;
    }
}
