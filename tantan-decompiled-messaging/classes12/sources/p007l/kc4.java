package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.newui.camera.widget.CameraMenuView;
import com.p000p1.mobile.putong.feed.newui.camera.widget.CameraVideoControlView;
import com.p000p1.mobile.putong.feed.newui.camera.widget.RecordButton;
import com.p000p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class kc4 {
    /* JADX INFO: renamed from: a */
    public static void m11406a(CameraVideoControlView cameraVideoControlView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cameraVideoControlView.f1030a = (RecordButton) viewGroup.getChildAt(0);
        cameraVideoControlView.f1031b = viewGroup.getChildAt(1);
        cameraVideoControlView.f1032c = (CameraMenuView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cameraVideoControlView.f1033d = (FeedRedDotView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cameraVideoControlView.f1034e = (CameraMenuView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        cameraVideoControlView.f1035f = (LinearLayout) viewGroup.getChildAt(3);
        cameraVideoControlView.f1036g = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        cameraVideoControlView.f1037h = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
