package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.internal.live.square.fragments.dynamic.LiveSquareDynamicFragment;
import p151v.VFrame;

/* JADX INFO: loaded from: classes9.dex */
public class t1u {
    /* JADX INFO: renamed from: a */
    public static void m188934a(LiveSquareDynamicFragment liveSquareDynamicFragment, View view) {
        liveSquareDynamicFragment.f45848z = (VFrame) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m188935b(LiveSquareDynamicFragment liveSquareDynamicFragment, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193797L0, viewGroup, false);
        m188934a(liveSquareDynamicFragment, viewInflate);
        return viewInflate;
    }
}
