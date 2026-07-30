package p009l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.pushbubble.SimplePushBubble;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import l.f6c0;
import l.g6a;
import l.hdb0;
import l.u4c0;
import l.x2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class xl4 {
    /* JADX INFO: renamed from: a */
    public static void m24928a(Act act) {
        View viewInflate = o7r.m19649a(act).inflate(f6c0.C8, (ViewGroup) null);
        if (g6a.r()) {
            ((TextView) viewInflate.findViewById(u4c0.K0)).setText("卡片将优先展示");
            viewInflate.findViewById(u4c0.J0).setImageResource(x2c0.P2);
        }
        hdb0.c().i(new SimplePushBubble.a(act, viewInflate).B(1).u("bubble_pin_like_push_id").v("bubble_pin_like_push_id").z(CorePopLevel.PIN_LIKE_SEND).s());
    }
}
