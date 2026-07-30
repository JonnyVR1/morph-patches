package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p000p1.mobile.putong.feed.newui.camera.widget.CameraMaskItemView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class d94 {
    /* JADX INFO: renamed from: a */
    public static void m9355a(CameraMaskItemView cameraMaskItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cameraMaskItemView.f1011a = viewGroup.getChildAt(0);
        cameraMaskItemView.f1012b = (FeedRedDotView) viewGroup.getChildAt(1);
        cameraMaskItemView.f1013c = viewGroup.getChildAt(2);
        cameraMaskItemView.f1014d = (ImageView) viewGroup.getChildAt(3);
    }
}
