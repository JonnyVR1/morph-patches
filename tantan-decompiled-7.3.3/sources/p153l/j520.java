package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInProfileVideoItemView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class j520 {
    /* JADX INFO: renamed from: a */
    public static void m143498a(MyRoomInProfileVideoItemView myRoomInProfileVideoItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        myRoomInProfileVideoItemView.f46838d = (VDraweeView) viewGroup.getChildAt(0);
        myRoomInProfileVideoItemView.f46839e = (FrameLayout) viewGroup.getChildAt(2);
        myRoomInProfileVideoItemView.f46840f = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        myRoomInProfileVideoItemView.f46841g = (FrameLayout) viewGroup.getChildAt(3);
        myRoomInProfileVideoItemView.f46842h = (FrameLayout) viewGroup.getChildAt(4);
        myRoomInProfileVideoItemView.f46843i = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        myRoomInProfileVideoItemView.f46844j = (TextView) viewGroup.getChildAt(5);
        myRoomInProfileVideoItemView.f46845k = (TextView) viewGroup.getChildAt(6);
    }
}
