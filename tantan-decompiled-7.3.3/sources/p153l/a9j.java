package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes10.dex */
public class a9j {
    /* JADX INFO: renamed from: a */
    public static void m96596a(z8j z8jVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        z8jVar.f203373j = (ImageView) viewGroup.getChildAt(0);
        z8jVar.f203374k = (ImageView) viewGroup.getChildAt(1);
        z8jVar.f203375l = (TextView) viewGroup.getChildAt(2);
        z8jVar.f203376m = (TextView) viewGroup.getChildAt(3);
        z8jVar.f203377n = (TextView) viewGroup.getChildAt(4);
        z8jVar.f203378o = (TextView) viewGroup.getChildAt(5);
        z8jVar.f203379p = (TextView) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m96597b(z8j z8jVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f152005k, viewGroup, false);
        m96596a(z8jVar, viewInflate);
        return viewInflate;
    }
}
