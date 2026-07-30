package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInProfileVideoItemView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class bx10 {
    /* JADX INFO: renamed from: a */
    public static void m104258a(MyRoomInProfileVideoItemView myRoomInProfileVideoItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        myRoomInProfileVideoItemView.f45990d = (VDraweeView) viewGroup.getChildAt(0);
        myRoomInProfileVideoItemView.f45991e = (FrameLayout) viewGroup.getChildAt(2);
        myRoomInProfileVideoItemView.f45992f = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        myRoomInProfileVideoItemView.f45993g = (FrameLayout) viewGroup.getChildAt(3);
        myRoomInProfileVideoItemView.f45994h = (FrameLayout) viewGroup.getChildAt(4);
        myRoomInProfileVideoItemView.f45995i = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        myRoomInProfileVideoItemView.f45996j = (TextView) viewGroup.getChildAt(5);
        myRoomInProfileVideoItemView.f45997k = (TextView) viewGroup.getChildAt(6);
    }
}
