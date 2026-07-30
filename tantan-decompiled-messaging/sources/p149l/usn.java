package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntrySignIn;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class usn {
    /* JADX INFO: renamed from: a */
    public static void m195225a(IntlLiveActivitiesEntrySignIn intlLiveActivitiesEntrySignIn, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveActivitiesEntrySignIn.f45755a = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlLiveActivitiesEntrySignIn.f45756b = (LinearLayout) viewGroup.getChildAt(1);
        intlLiveActivitiesEntrySignIn.f45757c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlLiveActivitiesEntrySignIn.f45758d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
