package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p151v.VEditText;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class vsh {
    /* JADX INFO: renamed from: a */
    public static void m202613a(ush ushVar, View view) {
        ushVar.f180783a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ushVar.f180784b = viewGroup.getChildAt(0);
        ushVar.f180785c = (RelativeLayout) viewGroup.getChildAt(1);
        ushVar.f180786d = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ushVar.f180787e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ushVar.f180788f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        ushVar.f180789g = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        ushVar.f180790h = (VEditText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        ushVar.f180791i = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        ushVar.f180792j = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        ushVar.f180793k = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m202614b(ush ushVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173708m2, viewGroup, false);
        m202613a(ushVar, viewInflate);
        return viewInflate;
    }
}
