package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes10.dex */
public class g6j {
    /* JADX INFO: renamed from: a */
    public static void m124595a(f6j f6jVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        f6jVar.f96130j = (ImageView) viewGroup.getChildAt(0);
        f6jVar.f96131k = (ImageView) viewGroup.getChildAt(1);
        f6jVar.f96132l = (TextView) viewGroup.getChildAt(2);
        f6jVar.f96133m = (TextView) viewGroup.getChildAt(3);
        f6jVar.f96134n = (TextView) viewGroup.getChildAt(4);
        f6jVar.f96135o = (TextView) viewGroup.getChildAt(5);
        f6jVar.f96136p = (TextView) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m124596b(f6j f6jVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121397k, viewGroup, false);
        m124595a(f6jVar, viewInflate);
        return viewInflate;
    }
}
