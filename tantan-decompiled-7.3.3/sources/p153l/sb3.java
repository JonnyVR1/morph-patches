package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.view.bottom.BottomContentCoverView;

/* JADX INFO: loaded from: classes10.dex */
public class sb3 {
    /* JADX INFO: renamed from: a */
    public static void m185295a(BottomContentCoverView bottomContentCoverView, View view) {
        bottomContentCoverView._coverview = ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m185296b(BottomContentCoverView bottomContentCoverView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125633T8, viewGroup, true);
        m185295a(bottomContentCoverView, viewInflate);
        return viewInflate;
    }
}
