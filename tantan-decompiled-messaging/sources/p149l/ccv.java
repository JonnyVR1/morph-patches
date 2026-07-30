package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.webview.LiveMkWebView;
import com.p046p1.mobile.putong.live.base.webview.LiveWebViewAct;

/* JADX INFO: loaded from: classes13.dex */
public class ccv {
    /* JADX INFO: renamed from: a */
    public static void m106201a(LiveWebViewAct liveWebViewAct, View view) {
        liveWebViewAct.f44851c = (FrameLayout) view.findViewById(d5c0.f84417F0);
        liveWebViewAct.f44852d = (LiveMkWebView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m106202b(LiveWebViewAct liveWebViewAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(q6c0.f152875N, viewGroup, false);
        m106201a(liveWebViewAct, viewInflate);
        return viewInflate;
    }
}
