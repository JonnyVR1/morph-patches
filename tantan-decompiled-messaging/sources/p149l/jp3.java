package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.BuzzRegionPassiveView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jp3 {
    /* JADX INFO: renamed from: a */
    public static void m142566a(BuzzRegionPassiveView buzzRegionPassiveView, View view) {
        buzzRegionPassiveView._region_name = (VText) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m142567b(BuzzRegionPassiveView buzzRegionPassiveView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.f106035l, viewGroup, true);
        m142566a(buzzRegionPassiveView, viewInflate);
        return viewInflate;
    }
}
