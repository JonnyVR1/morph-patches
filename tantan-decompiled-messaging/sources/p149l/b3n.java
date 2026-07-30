package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.view.bottom.IntlBottomContentCoverView;

/* JADX INFO: loaded from: classes10.dex */
public class b3n {
    /* JADX INFO: renamed from: a */
    public static void m100112a(IntlBottomContentCoverView intlBottomContentCoverView, View view) {
        intlBottomContentCoverView._coverview = ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m100113b(IntlBottomContentCoverView intlBottomContentCoverView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95976r5, viewGroup, true);
        m100112a(intlBottomContentCoverView, viewInflate);
        return viewInflate;
    }
}
