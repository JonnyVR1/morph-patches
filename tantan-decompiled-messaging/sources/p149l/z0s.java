package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.LiveCallView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class z0s {
    /* JADX INFO: renamed from: a */
    public static void m216756a(LiveCallView liveCallView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveCallView.f51505a = (FrameLayout) viewGroup.getChildAt(0);
        liveCallView.f51506b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveCallView.f51507c = (FrameLayout) viewGroup.getChildAt(1);
        liveCallView.f51508d = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        liveCallView.f51509e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        liveCallView.f51510f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        liveCallView.f51511g = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveCallView.f51512h = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        liveCallView.f51513i = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        liveCallView.f51514j = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }
}
