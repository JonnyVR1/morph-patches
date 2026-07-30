package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.view.CountdownGiftProgressView;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.TreasureBoxView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class kjj0 {
    /* JADX INFO: renamed from: a */
    public static void m150048a(TreasureBoxView treasureBoxView, View view) {
        treasureBoxView.f49398a = (TreasureBoxView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        treasureBoxView.f49399b = (VDraweeView) viewGroup.getChildAt(0);
        treasureBoxView.f49400c = (CountdownGiftProgressView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        treasureBoxView.f49401d = (VText) viewGroup.getChildAt(2);
        treasureBoxView.f49402e = viewGroup.getChildAt(3);
    }
}
