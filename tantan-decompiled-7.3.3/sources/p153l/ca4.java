package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.feed.newui.camera.widget.CameraMaskItemView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class ca4 {
    /* JADX INFO: renamed from: a */
    public static void m108472a(CameraMaskItemView cameraMaskItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cameraMaskItemView.f40398a = (VDraweeView) viewGroup.getChildAt(0);
        cameraMaskItemView.f40399b = (FeedRedDotView) viewGroup.getChildAt(1);
        cameraMaskItemView.f40400c = viewGroup.getChildAt(2);
        cameraMaskItemView.f40401d = (ImageView) viewGroup.getChildAt(3);
    }
}
