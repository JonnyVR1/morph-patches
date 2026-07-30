package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p000p1.mobile.putong.core.util.view.RoundTextView;
import l.tjo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ujo {
    /* JADX INFO: renamed from: a */
    public static void m9741a(tjo tjoVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        tjoVar.b = (FrameLayout) viewGroup.getChildAt(0);
        tjoVar.c = viewGroup.getChildAt(1);
        tjoVar.d = view.findViewById(x4c0.f8329W);
        ViewGroup viewGroup2 = (ViewGroup) view;
        tjoVar.e = (FrameLayout) viewGroup2.getChildAt(2);
        tjoVar.f = (RoundTextView) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(0);
        tjoVar.g = viewGroup2.getChildAt(3);
        tjoVar.h = (ImageView) ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(0);
        tjoVar.i = ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9742b(tjo tjoVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5460G, viewGroup, false);
        m9741a(tjoVar, viewInflate);
        return viewInflate;
    }
}
