package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalPushView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class yys {
    /* JADX INFO: renamed from: a */
    public static void m11320a(LiveInternalPushView liveInternalPushView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveInternalPushView.c = (LinearLayout) viewGroup.getChildAt(0);
        liveInternalPushView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveInternalPushView.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveInternalPushView.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        liveInternalPushView.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        liveInternalPushView.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        liveInternalPushView.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        liveInternalPushView.j = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
