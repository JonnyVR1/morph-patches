package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyFilterView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautyMenuView;

/* JADX INFO: loaded from: classes4.dex */
public class kv2 {
    /* JADX INFO: renamed from: a */
    public static void m147347a(BeautyMenuView beautyMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        beautyMenuView.f51449d = (TextView) viewGroup.getChildAt(1);
        beautyMenuView.f51450e = (BeautyFilterView) viewGroup.getChildAt(2);
        beautyMenuView.f51451f = (ImageView) viewGroup.getChildAt(3);
        beautyMenuView.f51452g = (FrameLayout) viewGroup.getChildAt(4);
    }
}
