package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyFilterView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautyMenuView;

/* JADX INFO: loaded from: classes4.dex */
public class aw2 {
    /* JADX INFO: renamed from: a */
    public static void m100561a(BeautyMenuView beautyMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        beautyMenuView.f52297d = (TextView) viewGroup.getChildAt(1);
        beautyMenuView.f52298e = (BeautyFilterView) viewGroup.getChildAt(2);
        beautyMenuView.f52299f = (ImageView) viewGroup.getChildAt(3);
        beautyMenuView.f52300g = (FrameLayout) viewGroup.getChildAt(4);
    }
}
