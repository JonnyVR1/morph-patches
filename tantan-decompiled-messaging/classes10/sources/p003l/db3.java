package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.vip.privilege.vipfrag.view.bottom.BottomContentCoverView;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class db3 {
    /* JADX INFO: renamed from: a */
    public static void m6097a(BottomContentCoverView bottomContentCoverView, View view) {
        bottomContentCoverView.a = ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m6098b(BottomContentCoverView bottomContentCoverView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.M8, viewGroup, true);
        m6097a(bottomContentCoverView, viewInflate);
        return viewInflate;
    }
}
