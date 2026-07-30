package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryAnimBackground;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryOrigin;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryRead;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntrySignIn;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryUnRead;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryView;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveEntranceStartLiveView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ftn {
    /* JADX INFO: renamed from: a */
    public static void m123065a(IntlLiveActivitiesEntryView intlLiveActivitiesEntryView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveActivitiesEntryView.f45768a = (VFrame) viewGroup.getChildAt(0);
        intlLiveActivitiesEntryView.f45769b = (IntlLiveActivitiesEntryAnimBackground) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlLiveActivitiesEntryView.f45770c = (IntlLiveActivitiesEntryOrigin) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlLiveActivitiesEntryView.f45771d = (IntlLiveActivitiesEntryRead) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        intlLiveActivitiesEntryView.f45772e = (IntlLiveActivitiesEntryUnRead) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        intlLiveActivitiesEntryView.f45773f = (IntlLiveActivitiesEntrySignIn) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        intlLiveActivitiesEntryView.f45774g = (IntlLiveEntranceStartLiveView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        intlLiveActivitiesEntryView.f45775h = (VText) viewGroup.getChildAt(1);
        intlLiveActivitiesEntryView.f45776i = (VImage) viewGroup.getChildAt(2);
    }
}
