package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p046p1.mobile.putong.feed.newui.camera.widget.RotatingDiscView;
import com.sunshine.engine.particle.SceneView;
import p147v.VDraweeView;
import p147v.VHollowCircleDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class med0 {
    /* JADX INFO: renamed from: a */
    public static void m154180a(RotatingDiscView rotatingDiscView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        rotatingDiscView.f39812a = (SceneView) viewGroup.getChildAt(0);
        rotatingDiscView.f39813b = (FrameLayout) viewGroup.getChildAt(1);
        rotatingDiscView.f39814c = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        rotatingDiscView.f39815d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        rotatingDiscView.f39816e = (VHollowCircleDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
