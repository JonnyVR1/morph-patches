package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryRead;
import p151v.VDraweeView;
import p151v.VMarqueeText;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class tun {
    /* JADX INFO: renamed from: a */
    public static void m192757a(IntlLiveActivitiesEntryRead intlLiveActivitiesEntryRead, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveActivitiesEntryRead.f46591d = (VDraweeView) viewGroup.getChildAt(0);
        intlLiveActivitiesEntryRead.f46592e = (VMarqueeText) viewGroup.getChildAt(1);
        intlLiveActivitiesEntryRead.f46593f = (VText) viewGroup.getChildAt(2);
    }
}
