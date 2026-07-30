package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.home.view.MarryAdCardView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ivw {
    /* JADX INFO: renamed from: a */
    public static void m7301a(MarryAdCardView marryAdCardView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        marryAdCardView.f2111a = viewGroup.getChildAt(0);
        marryAdCardView.f2112b = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        marryAdCardView.f2113c = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(3);
        marryAdCardView.f2114d = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(4);
        marryAdCardView.f2115e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }
}
