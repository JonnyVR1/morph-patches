package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareTabView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class v9o {
    /* JADX INFO: renamed from: a */
    public static View m200451a(Act act, BLiveSquareTab bLiveSquareTab) {
        View viewInflate = act.inflater().inflate(xec0.f193842a0, (ViewGroup) null);
        viewInflate.setTag(bLiveSquareTab.name);
        VText vText = (VText) viewInflate.findViewById(ldc0.f131568k2);
        vText.setTag(bLiveSquareTab.name);
        vText.setText(bLiveSquareTab.title);
        vText.setBackgroundColor(0);
        return viewInflate;
    }

    /* JADX INFO: renamed from: b */
    public static View m200452b(Act act, BLiveSquareTab bLiveSquareTab) {
        return new IntlLiveSquareTabView(act, bLiveSquareTab);
    }
}
