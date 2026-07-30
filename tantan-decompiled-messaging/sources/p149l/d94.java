package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.feed.newui.camera.widget.CameraMaskItemView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class d94 {
    /* JADX INFO: renamed from: a */
    public static void m110411a(CameraMaskItemView cameraMaskItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cameraMaskItemView.f39550a = (VDraweeView) viewGroup.getChildAt(0);
        cameraMaskItemView.f39551b = (FeedRedDotView) viewGroup.getChildAt(1);
        cameraMaskItemView.f39552c = viewGroup.getChildAt(2);
        cameraMaskItemView.f39553d = (ImageView) viewGroup.getChildAt(3);
    }
}
