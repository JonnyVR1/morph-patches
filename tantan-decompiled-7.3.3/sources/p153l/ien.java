package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VButton;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ien {
    /* JADX INFO: renamed from: a */
    public static void m139636a(hen henVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        henVar._title = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        henVar._positive_primary = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m139637b(hen henVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125388E4, viewGroup, false);
        m139636a(henVar, viewInflate);
        return viewInflate;
    }
}
