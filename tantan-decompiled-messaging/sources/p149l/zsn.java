package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryUnRead;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VMarqueeText;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class zsn {
    /* JADX INFO: renamed from: a */
    public static void m220044a(IntlLiveActivitiesEntryUnRead intlLiveActivitiesEntryUnRead, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveActivitiesEntryUnRead.f45759d = (VDraweeView) viewGroup.getChildAt(0);
        intlLiveActivitiesEntryUnRead.f45760e = (VMarqueeText) viewGroup.getChildAt(1);
        intlLiveActivitiesEntryUnRead.f45761f = (VText) viewGroup.getChildAt(2);
        intlLiveActivitiesEntryUnRead.f45762g = (VFrame) viewGroup.getChildAt(3);
    }
}
