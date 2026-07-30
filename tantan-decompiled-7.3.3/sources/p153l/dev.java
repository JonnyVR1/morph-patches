package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.webview.LiveMkWebView;
import com.p051p1.mobile.putong.live.base.webview.LiveWebViewAct;

/* JADX INFO: loaded from: classes13.dex */
public class dev {
    /* JADX INFO: renamed from: a */
    public static void m115469a(LiveWebViewAct liveWebViewAct, View view) {
        liveWebViewAct.f45699c = (FrameLayout) view.findViewById(jdc0.f120135F0);
        liveWebViewAct.f45700d = (LiveMkWebView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m115470b(LiveWebViewAct liveWebViewAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(vec0.f183732N, viewGroup, false);
        m115469a(liveWebViewAct, viewInflate);
        return viewInflate;
    }
}
