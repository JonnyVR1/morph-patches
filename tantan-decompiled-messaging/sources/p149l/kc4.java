package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.feed.newui.camera.widget.CameraMenuView;
import com.p046p1.mobile.putong.feed.newui.camera.widget.CameraVideoControlView;
import com.p046p1.mobile.putong.feed.newui.camera.widget.RecordButton;
import com.p046p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import p147v.VFrame;

/* JADX INFO: loaded from: classes12.dex */
public class kc4 {
    /* JADX INFO: renamed from: a */
    public static void m145346a(CameraVideoControlView cameraVideoControlView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cameraVideoControlView.f39569a = (RecordButton) viewGroup.getChildAt(0);
        cameraVideoControlView.f39570b = (VFrame) viewGroup.getChildAt(1);
        cameraVideoControlView.f39571c = (CameraMenuView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cameraVideoControlView.f39572d = (FeedRedDotView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cameraVideoControlView.f39573e = (CameraMenuView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        cameraVideoControlView.f39574f = (LinearLayout) viewGroup.getChildAt(3);
        cameraVideoControlView.f39575g = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        cameraVideoControlView.f39576h = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
