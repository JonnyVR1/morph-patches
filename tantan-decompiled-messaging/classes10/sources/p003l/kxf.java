package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.fake.a;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class kxf {
    /* JADX INFO: renamed from: a */
    public static void m7643a(a aVar, View view) {
        aVar.a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        aVar.b = (ImageView) viewGroup.getChildAt(0);
        aVar.c = viewGroup.getChildAt(1);
        aVar.d = viewGroup.getChildAt(2);
        aVar.e = viewGroup.getChildAt(3);
        aVar.f = viewGroup.getChildAt(4);
        aVar.g = (TextView) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m7644b(a aVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.k3, viewGroup, false);
        m7643a(aVar, viewInflate);
        return viewInflate;
    }
}
