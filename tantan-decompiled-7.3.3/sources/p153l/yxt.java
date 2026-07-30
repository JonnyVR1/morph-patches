package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.view.LiveSquareMediaView;
import com.p051p1.mobile.putong.live.livingroom.other.side.LiveSiderLiveItemView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class yxt {
    /* JADX INFO: renamed from: a */
    public static void m217738a(LiveSiderLiveItemView liveSiderLiveItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSiderLiveItemView.f52114a = (FrameLayout) viewGroup.getChildAt(0);
        liveSiderLiveItemView.f52115b = (LiveSquareMediaView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveSiderLiveItemView.f52116c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveSiderLiveItemView.f52117d = (VText) viewGroup.getChildAt(1);
        liveSiderLiveItemView.f52118e = (VText) viewGroup.getChildAt(2);
    }
}
