package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.newui.camera.widget.CameraMenuView;
import com.p051p1.mobile.putong.feed.newui.camera.widget.CameraPhotoControlView;
import com.p051p1.mobile.putong.feed.newui.camera.widget.RecordButton;
import com.p051p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import p151v.VFrame;

/* JADX INFO: loaded from: classes13.dex */
public class mb4 {
    /* JADX INFO: renamed from: a */
    public static void m157766a(CameraPhotoControlView cameraPhotoControlView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cameraPhotoControlView.f40410a = (RecordButton) viewGroup.getChildAt(0);
        cameraPhotoControlView.f40411b = (VFrame) viewGroup.getChildAt(1);
        cameraPhotoControlView.f40412c = (CameraMenuView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cameraPhotoControlView.f40413d = (FeedRedDotView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cameraPhotoControlView.f40414e = (CameraMenuView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
