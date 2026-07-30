package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.pushbubble.SimplePushBubble;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import p147v.VIcon;

/* JADX INFO: loaded from: classes11.dex */
public class xl4 {
    /* JADX INFO: renamed from: a */
    public static void m209842a(Act act) {
        View viewInflate = o7r.m163037a(act).inflate(f6c0.f95307C8, (ViewGroup) null);
        if (g6a.m124569r()) {
            ((TextView) viewInflate.findViewById(u4c0.f173887K0)).setText("卡片将优先展示");
            ((VIcon) viewInflate.findViewById(u4c0.f173870J0)).setImageResource(x2c0.f189627P2);
        }
        hdb0.m130575c().m130582i(new SimplePushBubble.C4372a(act, viewInflate).m21164B(1).m21171u("bubble_pin_like_push_id").m21172v("bubble_pin_like_push_id").m21176z(CorePopLevel.PIN_LIKE_SEND).m21169s());
    }
}
