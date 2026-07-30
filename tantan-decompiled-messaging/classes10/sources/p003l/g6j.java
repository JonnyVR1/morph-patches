package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class g6j {
    /* JADX INFO: renamed from: a */
    public static void m6605a(f6j f6jVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        f6jVar.f4396j = (ImageView) viewGroup.getChildAt(0);
        f6jVar.f4397k = (ImageView) viewGroup.getChildAt(1);
        f6jVar.f4398l = (TextView) viewGroup.getChildAt(2);
        f6jVar.f4399m = (TextView) viewGroup.getChildAt(3);
        f6jVar.f4400n = (TextView) viewGroup.getChildAt(4);
        f6jVar.f4401o = (TextView) viewGroup.getChildAt(5);
        f6jVar.f4402p = (TextView) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m6606b(f6j f6jVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5560k, viewGroup, false);
        m6605a(f6jVar, viewInflate);
        return viewInflate;
    }
}
