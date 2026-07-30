package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryUnRead;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VMarqueeText;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class zun {
    /* JADX INFO: renamed from: a */
    public static void m221676a(IntlLiveActivitiesEntryUnRead intlLiveActivitiesEntryUnRead, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveActivitiesEntryUnRead.f46607d = (VDraweeView) viewGroup.getChildAt(0);
        intlLiveActivitiesEntryUnRead.f46608e = (VMarqueeText) viewGroup.getChildAt(1);
        intlLiveActivitiesEntryUnRead.f46609f = (VText) viewGroup.getChildAt(2);
        intlLiveActivitiesEntryUnRead.f46610g = (VFrame) viewGroup.getChildAt(3);
    }
}
