package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.LoveBuzzControlView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class f4w {
    /* JADX INFO: renamed from: a */
    public static void m119470a(LoveBuzzControlView loveBuzzControlView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        loveBuzzControlView._control_icon = (VImage) viewGroup.getChildAt(0);
        loveBuzzControlView._control_desc = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m119471b(LoveBuzzControlView loveBuzzControlView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.f106040q, viewGroup, true);
        m119470a(loveBuzzControlView, viewInflate);
        return viewInflate;
    }
}
