package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.C8835b;
import com.p051p1.mobile.putong.core.p058ui.profile.views.RingProgressBarView;
import com.p051p1.mobile.putong.core.p058ui.profile.views.SetInfoProgressView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class npa0 {
    /* JADX INFO: renamed from: a */
    public static void m164217a(C8835b c8835b, View view) {
        c8835b.f34277a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c8835b.f34278b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        c8835b.f34279c = (SetInfoProgressView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        c8835b.f34280d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        c8835b.f34281e = (VFrame) viewGroup.getChildAt(1);
        c8835b.f34282f = (RingProgressBarView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        c8835b.f34283g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        c8835b.f34284h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        c8835b.f34285i = (FrameLayout) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m164218b(C8835b c8835b, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167603y0, viewGroup, false);
        m164217a(c8835b, viewInflate);
        return viewInflate;
    }
}
