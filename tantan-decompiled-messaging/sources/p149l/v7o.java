package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareTabView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class v7o {
    /* JADX INFO: renamed from: a */
    public static View m197382a(Act act, BLiveSquareTab bLiveSquareTab) {
        View viewInflate = act.inflater().inflate(s6c0.f162728a0, (ViewGroup) null);
        viewInflate.setTag(bLiveSquareTab.name);
        VText vText = (VText) viewInflate.findViewById(f5c0.f95111k2);
        vText.setTag(bLiveSquareTab.name);
        vText.setText(bLiveSquareTab.title);
        vText.setBackgroundColor(0);
        return viewInflate;
    }

    /* JADX INFO: renamed from: b */
    public static View m197383b(Act act, BLiveSquareTab bLiveSquareTab) {
        return new IntlLiveSquareTabView(act, bLiveSquareTab);
    }
}
