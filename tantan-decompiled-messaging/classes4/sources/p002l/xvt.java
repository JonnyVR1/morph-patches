package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.other.side.LiveSiderLiveItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xvt {
    /* JADX INFO: renamed from: a */
    public static void m26151a(LiveSiderLiveItemView liveSiderLiveItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSiderLiveItemView.f7308a = (FrameLayout) viewGroup.getChildAt(0);
        liveSiderLiveItemView.f7309b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveSiderLiveItemView.f7310c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveSiderLiveItemView.f7311d = viewGroup.getChildAt(1);
        liveSiderLiveItemView.f7312e = viewGroup.getChildAt(2);
    }
}
