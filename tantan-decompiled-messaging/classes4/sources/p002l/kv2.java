package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyFilterView;
import com.p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautyMenuView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kv2 {
    /* JADX INFO: renamed from: a */
    public static void m16829a(BeautyMenuView beautyMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        beautyMenuView.d = (TextView) viewGroup.getChildAt(1);
        beautyMenuView.e = (BeautyFilterView) viewGroup.getChildAt(2);
        beautyMenuView.f = (ImageView) viewGroup.getChildAt(3);
        beautyMenuView.g = (FrameLayout) viewGroup.getChildAt(4);
    }
}
