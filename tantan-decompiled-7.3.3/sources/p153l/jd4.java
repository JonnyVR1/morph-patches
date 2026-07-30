package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.feed.newui.camera.widget.CameraMenuView;
import com.p051p1.mobile.putong.feed.newui.camera.widget.CameraVideoControlView;
import com.p051p1.mobile.putong.feed.newui.camera.widget.RecordButton;
import com.p051p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import p151v.VFrame;

/* JADX INFO: loaded from: classes13.dex */
public class jd4 {
    /* JADX INFO: renamed from: a */
    public static void m144403a(CameraVideoControlView cameraVideoControlView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cameraVideoControlView.f40417a = (RecordButton) viewGroup.getChildAt(0);
        cameraVideoControlView.f40418b = (VFrame) viewGroup.getChildAt(1);
        cameraVideoControlView.f40419c = (CameraMenuView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cameraVideoControlView.f40420d = (FeedRedDotView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cameraVideoControlView.f40421e = (CameraMenuView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        cameraVideoControlView.f40422f = (LinearLayout) viewGroup.getChildAt(3);
        cameraVideoControlView.f40423g = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        cameraVideoControlView.f40424h = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
