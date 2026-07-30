package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntrySignIn;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class uun {
    /* JADX INFO: renamed from: a */
    public static void m198211a(IntlLiveActivitiesEntrySignIn intlLiveActivitiesEntrySignIn, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveActivitiesEntrySignIn.f46603a = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlLiveActivitiesEntrySignIn.f46604b = (LinearLayout) viewGroup.getChildAt(1);
        intlLiveActivitiesEntrySignIn.f46605c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlLiveActivitiesEntrySignIn.f46606d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
