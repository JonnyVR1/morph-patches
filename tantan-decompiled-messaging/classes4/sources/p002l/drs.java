package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.knight.view.LiveGuardEntranceView;
import com.p000p1.mobile.putong.live.livingroom.increment.knight.view.LivingUserRollAnimView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class drs {
    /* JADX INFO: renamed from: a */
    public static void m12014a(LiveGuardEntranceView liveGuardEntranceView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveGuardEntranceView.f6462d = viewGroup.getChildAt(0);
        liveGuardEntranceView.f6463e = (LivingUserRollAnimView) viewGroup.getChildAt(1);
        liveGuardEntranceView.f6464f = viewGroup.getChildAt(2);
    }
}
