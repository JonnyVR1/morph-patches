package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.profile.loop.b;
import l.n6c0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jha0 {
    /* JADX INFO: renamed from: a */
    public static void m7416a(b bVar, View view) {
        bVar.a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        bVar.b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        bVar.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        bVar.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        bVar.e = viewGroup.getChildAt(1);
        bVar.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        bVar.g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        bVar.h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        bVar.i = (FrameLayout) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m7417b(b bVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.y0, viewGroup, false);
        m7416a(bVar, viewInflate);
        return viewInflate;
    }
}
