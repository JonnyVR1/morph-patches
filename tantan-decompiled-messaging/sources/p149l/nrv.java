package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.view.LiveFooterTipsView;
import com.p046p1.mobile.putong.live.base.view.LoadMoreFooterView;

/* JADX INFO: loaded from: classes13.dex */
public class nrv {
    /* JADX INFO: renamed from: a */
    public static void m160747a(LoadMoreFooterView loadMoreFooterView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        loadMoreFooterView.f44760a = (LinearLayout) viewGroup.getChildAt(0);
        loadMoreFooterView.f44761b = (LiveFooterTipsView) viewGroup.getChildAt(1);
    }
}
