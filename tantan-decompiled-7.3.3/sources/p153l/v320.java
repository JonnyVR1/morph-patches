package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInExpandedCard;
import p151v.VDraweeView;
import p151v.VFrame;

/* JADX INFO: loaded from: classes9.dex */
public class v320 {
    /* JADX INFO: renamed from: a */
    public static void m199182a(MyRoomInExpandedCard myRoomInExpandedCard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        myRoomInExpandedCard.f46790a = (VFrame) viewGroup.getChildAt(0);
        myRoomInExpandedCard.f46791b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        myRoomInExpandedCard.f46792c = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        myRoomInExpandedCard.f46793d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        myRoomInExpandedCard.f46794e = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        myRoomInExpandedCard.f46795f = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        myRoomInExpandedCard.f46796g = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        myRoomInExpandedCard.f46797h = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(1);
        myRoomInExpandedCard.f46798i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(2);
    }
}
