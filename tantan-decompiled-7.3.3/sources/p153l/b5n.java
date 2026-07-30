package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.view.bottom.IntlBottomContentCoverView;

/* JADX INFO: loaded from: classes10.dex */
public class b5n {
    /* JADX INFO: renamed from: a */
    public static void m102618a(IntlBottomContentCoverView intlBottomContentCoverView, View view) {
        intlBottomContentCoverView._coverview = ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m102619b(IntlBottomContentCoverView intlBottomContentCoverView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126047s5, viewGroup, true);
        m102618a(intlBottomContentCoverView, viewInflate);
        return viewInflate;
    }
}
