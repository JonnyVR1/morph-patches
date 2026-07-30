package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryAnimBackground;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryOrigin;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryRead;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntrySignIn;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryUnRead;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryView;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveEntranceStartLiveView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class fvn {
    /* JADX INFO: renamed from: a */
    public static void m127677a(IntlLiveActivitiesEntryView intlLiveActivitiesEntryView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveActivitiesEntryView.f46616a = (VFrame) viewGroup.getChildAt(0);
        intlLiveActivitiesEntryView.f46617b = (IntlLiveActivitiesEntryAnimBackground) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlLiveActivitiesEntryView.f46618c = (IntlLiveActivitiesEntryOrigin) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlLiveActivitiesEntryView.f46619d = (IntlLiveActivitiesEntryRead) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        intlLiveActivitiesEntryView.f46620e = (IntlLiveActivitiesEntryUnRead) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        intlLiveActivitiesEntryView.f46621f = (IntlLiveActivitiesEntrySignIn) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        intlLiveActivitiesEntryView.f46622g = (IntlLiveEntranceStartLiveView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        intlLiveActivitiesEntryView.f46623h = (VText) viewGroup.getChildAt(1);
        intlLiveActivitiesEntryView.f46624i = (VImage) viewGroup.getChildAt(2);
    }
}
