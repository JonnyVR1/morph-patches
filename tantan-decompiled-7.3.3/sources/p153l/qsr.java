package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveActivitiesEntrySignIn;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class qsr {
    /* JADX INFO: renamed from: a */
    public static void m177816a(LiveActivitiesEntrySignIn liveActivitiesEntrySignIn, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveActivitiesEntrySignIn.f47116a = (FrameLayout) viewGroup.getChildAt(0);
        liveActivitiesEntrySignIn.f47117b = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveActivitiesEntrySignIn.f47118c = (LinearLayout) viewGroup.getChildAt(1);
        liveActivitiesEntrySignIn.f47119d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveActivitiesEntrySignIn.f47120e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
