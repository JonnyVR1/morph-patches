package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.feed.p065ui.moments.C11573b;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VFrame_Shadow;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class dw00 {
    /* JADX INFO: renamed from: a */
    public static void m118347a(C11573b c11573b, View view) {
        c11573b.f44825a = (FrameLayout) view.findViewById(hdc0.f108818A1);
        ViewGroup viewGroup = (ViewGroup) view;
        c11573b.f44826b = (VFrame_Shadow) viewGroup.getChildAt(0);
        c11573b.f44827c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        c11573b.f44828d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        c11573b.f44829e = (LinearLayout) viewGroup.getChildAt(1);
        c11573b.f44830f = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        c11573b.f44831g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        c11573b.f44832h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m118348b(C11573b c11573b, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173759t4, viewGroup, false);
        m118347a(c11573b, viewInflate);
        return viewInflate;
    }
}
