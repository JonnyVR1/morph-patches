package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.TreasureBoxView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gaj0 {
    /* JADX INFO: renamed from: a */
    public static void m13672a(TreasureBoxView treasureBoxView, View view) {
        treasureBoxView.f4592a = (TreasureBoxView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        treasureBoxView.f4593b = viewGroup.getChildAt(0);
        treasureBoxView.f4594c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        treasureBoxView.f4595d = viewGroup.getChildAt(2);
        treasureBoxView.f4596e = viewGroup.getChildAt(3);
    }
}
