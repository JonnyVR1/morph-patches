package p007l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.camera.widget.CameraMenuView;
import com.p000p1.mobile.putong.feed.newui.camera.widget.CameraPhotoControlView;
import com.p000p1.mobile.putong.feed.newui.camera.widget.RecordButton;
import com.p000p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class na4 {
    /* JADX INFO: renamed from: a */
    public static void m12130a(CameraPhotoControlView cameraPhotoControlView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cameraPhotoControlView.f1023a = (RecordButton) viewGroup.getChildAt(0);
        cameraPhotoControlView.f1024b = viewGroup.getChildAt(1);
        cameraPhotoControlView.f1025c = (CameraMenuView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cameraPhotoControlView.f1026d = (FeedRedDotView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cameraPhotoControlView.f1027e = (CameraMenuView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
