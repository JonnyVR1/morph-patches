package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.LiveCallView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class z0s {
    /* JADX INFO: renamed from: a */
    public static void m27039a(LiveCallView liveCallView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveCallView.a = (FrameLayout) viewGroup.getChildAt(0);
        liveCallView.b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveCallView.c = (FrameLayout) viewGroup.getChildAt(1);
        liveCallView.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        liveCallView.e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        liveCallView.f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        liveCallView.g = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveCallView.h = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        liveCallView.i = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        liveCallView.j = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }
}
