package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class xdy {
    /* JADX INFO: renamed from: a */
    public static void m210494a(wdy wdyVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        wdyVar._recycler = (RecyclerView) viewGroup.getChildAt(0);
        wdyVar._empty = (LinearLayout) viewGroup.getChildAt(1);
        wdyVar._empty_image = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        wdyVar._empty_tip = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        wdyVar._get_privilege = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m210495b(wdy wdyVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f152059z0, viewGroup, false);
        m210494a(wdyVar, viewInflate);
        return viewInflate;
    }
}
