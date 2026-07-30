package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.vip.privilegeNewUi.view.bottom.IntlBottomContentCoverView;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class b3n {
    /* JADX INFO: renamed from: a */
    public static void m5684a(IntlBottomContentCoverView intlBottomContentCoverView, View view) {
        intlBottomContentCoverView.a = ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m5685b(IntlBottomContentCoverView intlBottomContentCoverView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.r5, viewGroup, true);
        m5684a(intlBottomContentCoverView, viewInflate);
        return viewInflate;
    }
}
