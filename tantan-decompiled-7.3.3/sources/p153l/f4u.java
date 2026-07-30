package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveSquareMenuItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class f4u {
    /* JADX INFO: renamed from: a */
    public static void m124041a(LiveSquareMenuItemView liveSquareMenuItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSquareMenuItemView.f47191a = (VImage) viewGroup.getChildAt(0);
        liveSquareMenuItemView.f47192b = (VDraweeView) viewGroup.getChildAt(1);
        liveSquareMenuItemView.f47193c = (VText) viewGroup.getChildAt(2);
    }
}
