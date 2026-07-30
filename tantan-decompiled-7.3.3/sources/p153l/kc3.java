package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.BottomItemView;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.view.BottomViewGroup;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class kc3 {
    /* JADX INFO: renamed from: a */
    public static void m149095a(BottomItemView bottomItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bottomItemView.f49330a = (BottomViewGroup) viewGroup.getChildAt(0);
        bottomItemView.f49331b = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        bottomItemView.f49332c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        bottomItemView.f49333d = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        bottomItemView.f49334e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        bottomItemView.f49335f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        bottomItemView.f49336g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        bottomItemView.f49337h = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        bottomItemView.f49338i = (VText) viewGroup.getChildAt(1);
    }
}
