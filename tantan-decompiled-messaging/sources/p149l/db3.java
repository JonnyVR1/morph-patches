package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.vipfrag.view.bottom.BottomContentCoverView;

/* JADX INFO: loaded from: classes10.dex */
public class db3 {
    /* JADX INFO: renamed from: a */
    public static void m110639a(BottomContentCoverView bottomContentCoverView, View view) {
        bottomContentCoverView._coverview = ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m110640b(BottomContentCoverView bottomContentCoverView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95467M8, viewGroup, true);
        m110639a(bottomContentCoverView, viewInflate);
        return viewInflate;
    }
}
