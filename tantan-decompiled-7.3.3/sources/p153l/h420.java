package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInProfileAudioItemView;
import com.p051p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInProfileDoubleView;
import com.p051p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInProfileVideoItemView;

/* JADX INFO: loaded from: classes9.dex */
public class h420 {
    /* JADX INFO: renamed from: a */
    public static void m133539a(MyRoomInProfileDoubleView myRoomInProfileDoubleView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        myRoomInProfileDoubleView.f46813a = (MyRoomInProfileAudioItemView) viewGroup.getChildAt(0);
        myRoomInProfileDoubleView.f46814b = (MyRoomInProfileVideoItemView) viewGroup.getChildAt(1);
    }
}
