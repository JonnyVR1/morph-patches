package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p151v.VButton_FakeShadow;

/* JADX INFO: renamed from: l.vq */
/* JADX INFO: loaded from: classes10.dex */
public class C20900vq {
    /* JADX INFO: renamed from: a */
    public static void m202350a(C20620uq c20620uq, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c20620uq.f180335a = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        c20620uq.f180336b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        c20620uq.f180337c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        c20620uq.f180338d = (VButton_FakeShadow) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m202351b(C20620uq c20620uq, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167566g, viewGroup, false);
        m202350a(c20620uq, viewInflate);
        return viewInflate;
    }
}
