package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.putong.live.base.webview.LiveMkWebView;
import p151v.VFrame;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class dfv {
    /* JADX INFO: renamed from: a */
    public static void m115547a(iev ievVar, View view) {
        ievVar.f114619a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ievVar.f114620b = viewGroup.getChildAt(0);
        ievVar.f114621c = (CardView) viewGroup.getChildAt(1);
        ievVar.f114622d = (LiveMkWebView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ievVar.f114623e = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m115548b(iev ievVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199275ub, viewGroup, false);
        m115547a(ievVar, viewInflate);
        return viewInflate;
    }
}
