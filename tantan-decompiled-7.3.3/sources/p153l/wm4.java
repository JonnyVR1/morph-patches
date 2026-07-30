package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.pushbubble.SimplePushBubble;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import p151v.VIcon;

/* JADX INFO: loaded from: classes11.dex */
public class wm4 {
    /* JADX INFO: renamed from: a */
    public static void m207090a(Act act) {
        View viewInflate = p9r.m171370a(act).inflate(kec0.f125473J8, (ViewGroup) null);
        if (s7a.m184989r()) {
            ((TextView) viewInflate.findViewById(adc0.f69975K0)).setText("卡片将优先展示");
            ((VIcon) viewInflate.findViewById(adc0.f69958J0)).setImageResource(dbc0.f86491Q2);
        }
        llb0.m154703c().m154710i(new SimplePushBubble.C4523a(act, viewInflate).m22163B(1).m22170u("bubble_pin_like_push_id").m22171v("bubble_pin_like_push_id").m22175z(CorePopLevel.PIN_LIKE_SEND).m22168s());
    }
}
