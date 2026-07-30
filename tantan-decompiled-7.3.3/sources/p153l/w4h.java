package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class w4h {
    /* JADX INFO: renamed from: a */
    public static void m204895a(v4h v4hVar, View view) {
        v4hVar.f182366f = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        v4hVar.f182367g = (VLinear) viewGroup.getChildAt(0);
        v4hVar.f182368h = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        v4hVar.f182369i = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        v4hVar.f182370j = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m204896b(v4h v4hVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173755t0, viewGroup, false);
        m204895a(v4hVar, viewInflate);
        return viewInflate;
    }
}
