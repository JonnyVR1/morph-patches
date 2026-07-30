package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.LiveGuardEntranceView;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.LivingUserRollAnimView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ets {
    /* JADX INFO: renamed from: a */
    public static void m122503a(LiveGuardEntranceView liveGuardEntranceView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveGuardEntranceView.f51268d = (VText) viewGroup.getChildAt(0);
        liveGuardEntranceView.f51269e = (LivingUserRollAnimView) viewGroup.getChildAt(1);
        liveGuardEntranceView.f51270f = (VImage) viewGroup.getChildAt(2);
    }
}
