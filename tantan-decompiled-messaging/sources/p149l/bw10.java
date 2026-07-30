package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInProfileItemView;
import com.p046p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInProfileStatusView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class bw10 {
    /* JADX INFO: renamed from: a */
    public static void m104125a(MyRoomInProfileItemView myRoomInProfileItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        myRoomInProfileItemView.f45967d = (VDraweeView) viewGroup.getChildAt(0);
        myRoomInProfileItemView.f45968e = (MyRoomInProfileStatusView) viewGroup.getChildAt(2);
        myRoomInProfileItemView.f45969f = (VText) viewGroup.getChildAt(3);
        myRoomInProfileItemView.f45970g = (VText) viewGroup.getChildAt(4);
    }
}
