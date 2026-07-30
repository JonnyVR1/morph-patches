package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p051p1.mobile.putong.feed.newui.camera.widget.RotatingDiscView;
import com.sunshine.engine.particle.SceneView;
import p151v.VDraweeView;
import p151v.VHollowCircleDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class omd0 {
    /* JADX INFO: renamed from: a */
    public static void m168209a(RotatingDiscView rotatingDiscView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        rotatingDiscView.f40660a = (SceneView) viewGroup.getChildAt(0);
        rotatingDiscView.f40661b = (FrameLayout) viewGroup.getChildAt(1);
        rotatingDiscView.f40662c = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        rotatingDiscView.f40663d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        rotatingDiscView.f40664e = (VHollowCircleDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
