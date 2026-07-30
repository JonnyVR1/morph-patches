package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.profile.views.RingProgressBarView;
import com.p051p1.mobile.putong.core.p058ui.profile.views.SetInfoProgressView;
import p151v.VButton;
import p151v.VFrame;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class c2x {
    /* JADX INFO: renamed from: a */
    public static void m107725a(b2x b2xVar, View view) {
        b2xVar.f74675a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        b2xVar.f74676b = (FrameLayout) viewGroup.getChildAt(0);
        b2xVar.f74677c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        b2xVar.f74678d = (SetInfoProgressView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        b2xVar.f74679e = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        b2xVar.f74680f = (RingProgressBarView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        b2xVar.f74681g = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        b2xVar.f74682h = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        b2xVar.f74683i = (VFrame) viewGroup.getChildAt(1);
        b2xVar.f74684j = (VFrame) viewGroup.getChildAt(2);
        b2xVar.f74685k = (VButton) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m107726b(b2x b2xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167561d0, viewGroup, false);
        m107725a(b2xVar, viewInflate);
        return viewInflate;
    }
}
