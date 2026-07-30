package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.LoveBuzzControlView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class d6w {
    /* JADX INFO: renamed from: a */
    public static void m114547a(LoveBuzzControlView loveBuzzControlView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        loveBuzzControlView._control_icon = (VImage) viewGroup.getChildAt(0);
        loveBuzzControlView._control_desc = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m114548b(LoveBuzzControlView loveBuzzControlView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(mec0.f136482q, viewGroup, true);
        m114547a(loveBuzzControlView, viewInflate);
        return viewInflate;
    }
}
