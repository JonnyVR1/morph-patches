package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInProfileAudioItemView;
import com.p046p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInProfileDoubleView;
import com.p046p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInProfileVideoItemView;

/* JADX INFO: loaded from: classes13.dex */
public class zv10 {
    /* JADX INFO: renamed from: a */
    public static void m220297a(MyRoomInProfileDoubleView myRoomInProfileDoubleView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        myRoomInProfileDoubleView.f45965a = (MyRoomInProfileAudioItemView) viewGroup.getChildAt(0);
        myRoomInProfileDoubleView.f45966b = (MyRoomInProfileVideoItemView) viewGroup.getChildAt(1);
    }
}
