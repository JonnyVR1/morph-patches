package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.view.LiveFooterTipsView;
import com.p051p1.mobile.putong.live.base.view.LoadMoreFooterView;

/* JADX INFO: loaded from: classes13.dex */
public class otv {
    /* JADX INFO: renamed from: a */
    public static void m169184a(LoadMoreFooterView loadMoreFooterView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        loadMoreFooterView.f45608a = (LinearLayout) viewGroup.getChildAt(0);
        loadMoreFooterView.f45609b = (LiveFooterTipsView) viewGroup.getChildAt(1);
    }
}
