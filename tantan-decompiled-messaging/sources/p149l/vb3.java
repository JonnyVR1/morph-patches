package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.BottomItemView;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.view.BottomViewGroup;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class vb3 {
    /* JADX INFO: renamed from: a */
    public static void m197666a(BottomItemView bottomItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bottomItemView.f48482a = (BottomViewGroup) viewGroup.getChildAt(0);
        bottomItemView.f48483b = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        bottomItemView.f48484c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        bottomItemView.f48485d = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        bottomItemView.f48486e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        bottomItemView.f48487f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        bottomItemView.f48488g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        bottomItemView.f48489h = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        bottomItemView.f48490i = (VText) viewGroup.getChildAt(1);
    }
}
