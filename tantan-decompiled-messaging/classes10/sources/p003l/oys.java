package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalCardStylePushView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class oys {
    /* JADX INFO: renamed from: a */
    public static void m8604a(LiveInternalCardStylePushView liveInternalCardStylePushView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveInternalCardStylePushView.c = (FrameLayout) viewGroup.getChildAt(0);
        liveInternalCardStylePushView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveInternalCardStylePushView.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        liveInternalCardStylePushView.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        liveInternalCardStylePushView.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        liveInternalCardStylePushView.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        liveInternalCardStylePushView.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3);
    }
}
