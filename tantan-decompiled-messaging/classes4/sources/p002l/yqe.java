package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class yqe {
    /* JADX INFO: renamed from: a */
    public static void m26885a(xqe xqeVar, View view) {
        xqeVar.f22404a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        xqeVar.f22405b = viewGroup.getChildAt(0);
        xqeVar.f22406c = viewGroup.getChildAt(1);
        xqeVar.f22407d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m26886b(xqe xqeVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19492D0, viewGroup, false);
        m26885a(xqeVar, viewInflate);
        return viewInflate;
    }
}
