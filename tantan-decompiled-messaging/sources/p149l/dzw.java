package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.profile.views.RingProgressBarView;
import com.p046p1.mobile.putong.core.p053ui.profile.views.SetInfoProgressView;
import p147v.VButton;
import p147v.VFrame;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class dzw {
    /* JADX INFO: renamed from: a */
    public static void m114137a(czw czwVar, View view) {
        czwVar.f83121a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        czwVar.f83122b = (FrameLayout) viewGroup.getChildAt(0);
        czwVar.f83123c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        czwVar.f83124d = (SetInfoProgressView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        czwVar.f83125e = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        czwVar.f83126f = (RingProgressBarView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        czwVar.f83127g = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        czwVar.f83128h = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        czwVar.f83129i = (VFrame) viewGroup.getChildAt(1);
        czwVar.f83130j = (VFrame) viewGroup.getChildAt(2);
        czwVar.f83131k = (VButton) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m114138b(czw czwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137347d0, viewGroup, false);
        m114137a(czwVar, viewInflate);
        return viewInflate;
    }
}
