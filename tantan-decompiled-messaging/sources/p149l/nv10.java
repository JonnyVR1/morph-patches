package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInExpandedCard;
import p147v.VDraweeView;
import p147v.VFrame;

/* JADX INFO: loaded from: classes13.dex */
public class nv10 {
    /* JADX INFO: renamed from: a */
    public static void m161529a(MyRoomInExpandedCard myRoomInExpandedCard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        myRoomInExpandedCard.f45942a = (VFrame) viewGroup.getChildAt(0);
        myRoomInExpandedCard.f45943b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        myRoomInExpandedCard.f45944c = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        myRoomInExpandedCard.f45945d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        myRoomInExpandedCard.f45946e = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        myRoomInExpandedCard.f45947f = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        myRoomInExpandedCard.f45948g = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        myRoomInExpandedCard.f45949h = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(1);
        myRoomInExpandedCard.f45950i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(2);
    }
}
