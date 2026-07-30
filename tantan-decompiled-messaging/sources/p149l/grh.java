package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p147v.VEditText;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class grh {
    /* JADX INFO: renamed from: a */
    public static void m127711a(frh frhVar, View view) {
        frhVar.f98938a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        frhVar.f98939b = viewGroup.getChildAt(0);
        frhVar.f98940c = (RelativeLayout) viewGroup.getChildAt(1);
        frhVar.f98941d = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        frhVar.f98942e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        frhVar.f98943f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        frhVar.f98944g = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        frhVar.f98945h = (VEditText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        frhVar.f98946i = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        frhVar.f98947j = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        frhVar.f98948k = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m127712b(frh frhVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142239m2, viewGroup, false);
        m127711a(frhVar, viewInflate);
        return viewInflate;
    }
}
