package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class a5y {
    /* JADX INFO: renamed from: a */
    public static void m95063a(z4y z4yVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        z4yVar._recycler = (RecyclerView) viewGroup.getChildAt(0);
        z4yVar._empty = (LinearLayout) viewGroup.getChildAt(1);
        z4yVar._empty_image = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        z4yVar._empty_tip = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        z4yVar._get_privilege = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m95064b(z4y z4yVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121451z0, viewGroup, false);
        m95063a(z4yVar, viewInflate);
        return viewInflate;
    }
}
