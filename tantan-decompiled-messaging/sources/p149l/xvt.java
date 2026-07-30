package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.view.LiveSquareMediaView;
import com.p046p1.mobile.putong.live.livingroom.other.side.LiveSiderLiveItemView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class xvt {
    /* JADX INFO: renamed from: a */
    public static void m211306a(LiveSiderLiveItemView liveSiderLiveItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSiderLiveItemView.f51266a = (FrameLayout) viewGroup.getChildAt(0);
        liveSiderLiveItemView.f51267b = (LiveSquareMediaView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveSiderLiveItemView.f51268c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveSiderLiveItemView.f51269d = (VText) viewGroup.getChildAt(1);
        liveSiderLiveItemView.f51270e = (VText) viewGroup.getChildAt(2);
    }
}
