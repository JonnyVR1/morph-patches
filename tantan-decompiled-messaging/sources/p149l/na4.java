package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.newui.camera.widget.CameraMenuView;
import com.p046p1.mobile.putong.feed.newui.camera.widget.CameraPhotoControlView;
import com.p046p1.mobile.putong.feed.newui.camera.widget.RecordButton;
import com.p046p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import p147v.VFrame;

/* JADX INFO: loaded from: classes12.dex */
public class na4 {
    /* JADX INFO: renamed from: a */
    public static void m158579a(CameraPhotoControlView cameraPhotoControlView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cameraPhotoControlView.f39562a = (RecordButton) viewGroup.getChildAt(0);
        cameraPhotoControlView.f39563b = (VFrame) viewGroup.getChildAt(1);
        cameraPhotoControlView.f39564c = (CameraMenuView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cameraPhotoControlView.f39565d = (FeedRedDotView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cameraPhotoControlView.f39566e = (CameraMenuView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
