package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.lovebuzz.widget.BuzzRegionPassiveView;
import l.h6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jp3 {
    /* JADX INFO: renamed from: a */
    public static void m7447a(BuzzRegionPassiveView buzzRegionPassiveView, View view) {
        buzzRegionPassiveView.a = ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m7448b(BuzzRegionPassiveView buzzRegionPassiveView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.l, viewGroup, true);
        m7447a(buzzRegionPassiveView, viewInflate);
        return viewInflate;
    }
}
