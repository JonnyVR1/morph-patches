package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.putong.live.base.webview.LiveMkWebView;
import p151v.VFrame;
import p151v.VImage;

/* JADX INFO: loaded from: classes9.dex */
public class wuu {
    /* JADX INFO: renamed from: a */
    public static void m207976a(guu guuVar, View view) {
        guuVar.f106578a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        guuVar.f106579b = viewGroup.getChildAt(0);
        guuVar.f106580c = (CardView) viewGroup.getChildAt(1);
        guuVar.f106581d = (LiveMkWebView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        guuVar.f106582e = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m207977b(guu guuVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193786H1, viewGroup, false);
        m207976a(guuVar, viewInflate);
        return viewInflate;
    }
}
