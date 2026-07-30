package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveActivitiesEntrySignIn;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class pqr {
    /* JADX INFO: renamed from: a */
    public static void m170935a(LiveActivitiesEntrySignIn liveActivitiesEntrySignIn, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveActivitiesEntrySignIn.f46268a = (FrameLayout) viewGroup.getChildAt(0);
        liveActivitiesEntrySignIn.f46269b = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveActivitiesEntrySignIn.f46270c = (LinearLayout) viewGroup.getChildAt(1);
        liveActivitiesEntrySignIn.f46271d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveActivitiesEntrySignIn.f46272e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
