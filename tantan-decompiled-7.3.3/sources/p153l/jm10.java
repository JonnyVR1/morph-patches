package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiPk.dialog.view.MultiCallPkBoardItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class jm10 {
    /* JADX INFO: renamed from: a */
    public static void m146142a(MultiCallPkBoardItemView multiCallPkBoardItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        multiCallPkBoardItemView.f52273d = (AnimEffectPlayer) viewGroup.getChildAt(0);
        multiCallPkBoardItemView.f52274e = (VText) viewGroup.getChildAt(1);
        multiCallPkBoardItemView.f52275f = (VDraweeView) viewGroup.getChildAt(2);
        multiCallPkBoardItemView.f52276g = (VImage) viewGroup.getChildAt(3);
        multiCallPkBoardItemView.f52277h = (VText) viewGroup.getChildAt(4);
        multiCallPkBoardItemView.f52278i = (LinearLayout) viewGroup.getChildAt(5);
        multiCallPkBoardItemView.f52279j = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        multiCallPkBoardItemView.f52280k = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        multiCallPkBoardItemView.f52281l = (VText) viewGroup.getChildAt(6);
    }
}
