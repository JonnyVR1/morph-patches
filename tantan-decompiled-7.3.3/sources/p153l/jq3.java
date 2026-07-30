package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzRegionPassiveView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jq3 {
    /* JADX INFO: renamed from: a */
    public static void m146551a(BuzzRegionPassiveView buzzRegionPassiveView, View view) {
        buzzRegionPassiveView._region_name = (VText) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m146552b(BuzzRegionPassiveView buzzRegionPassiveView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(mec0.f136477l, viewGroup, true);
        m146551a(buzzRegionPassiveView, viewInflate);
        return viewInflate;
    }
}
