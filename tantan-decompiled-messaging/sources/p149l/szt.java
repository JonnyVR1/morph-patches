package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.internal.live.square.fragments.dynamic.LiveSquareDynamicFragment;
import p147v.VFrame;

/* JADX INFO: loaded from: classes13.dex */
public class szt {
    /* JADX INFO: renamed from: a */
    public static void m186797a(LiveSquareDynamicFragment liveSquareDynamicFragment, View view) {
        liveSquareDynamicFragment.f45000z = (VFrame) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m186798b(LiveSquareDynamicFragment liveSquareDynamicFragment, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162683L0, viewGroup, false);
        m186797a(liveSquareDynamicFragment, viewInflate);
        return viewInflate;
    }
}
