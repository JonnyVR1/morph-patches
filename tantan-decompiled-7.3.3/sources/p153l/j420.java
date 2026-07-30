package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInProfileItemView;
import com.p051p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInProfileStatusView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class j420 {
    /* JADX INFO: renamed from: a */
    public static void m143399a(MyRoomInProfileItemView myRoomInProfileItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        myRoomInProfileItemView.f46815d = (VDraweeView) viewGroup.getChildAt(0);
        myRoomInProfileItemView.f46816e = (MyRoomInProfileStatusView) viewGroup.getChildAt(2);
        myRoomInProfileItemView.f46817f = (VText) viewGroup.getChildAt(3);
        myRoomInProfileItemView.f46818g = (VText) viewGroup.getChildAt(4);
    }
}
