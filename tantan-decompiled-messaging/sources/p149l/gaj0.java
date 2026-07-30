package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.view.CountdownGiftProgressView;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.TreasureBoxView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class gaj0 {
    /* JADX INFO: renamed from: a */
    public static void m124999a(TreasureBoxView treasureBoxView, View view) {
        treasureBoxView.f48550a = (TreasureBoxView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        treasureBoxView.f48551b = (VDraweeView) viewGroup.getChildAt(0);
        treasureBoxView.f48552c = (CountdownGiftProgressView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        treasureBoxView.f48553d = (VText) viewGroup.getChildAt(2);
        treasureBoxView.f48554e = viewGroup.getChildAt(3);
    }
}
