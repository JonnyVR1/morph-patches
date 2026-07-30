package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.growth.fakebyconv.MsgTabFakeBubbleRoot;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import l.f6c0;
import l.w1g;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class e010 {
    /* JADX INFO: renamed from: a */
    public static boolean m6227a() {
        return CoreModule.c.e0.c8();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m6228b() {
        return (!CoreModule.c.e0.c8() || CoreModule.c.e0.k8() || CoreModule.c.e0.W7()) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static void m6229c(Act act, TabName tabName) {
        ViewGroup viewGroup = (ViewGroup) act.getWindow().getDecorView();
        View viewFindViewWithTag = viewGroup.findViewWithTag("msg_tab_fake_bubble_view");
        if (tabName != TabName.Msg) {
            if (NullChecker.a(viewFindViewWithTag)) {
                xdl0.M(viewFindViewWithTag, false);
            }
        } else if (m6228b() && !w1g.a()) {
            if (viewFindViewWithTag instanceof MsgTabFakeBubbleRoot) {
                xdl0.M(viewFindViewWithTag, true);
                ((MsgTabFakeBubbleRoot) viewFindViewWithTag).m3321q();
            } else {
                MsgTabFakeBubbleRoot msgTabFakeBubbleRoot = (MsgTabFakeBubbleRoot) act.getLayoutInflater().inflate(f6c0.B7, (ViewGroup) null);
                viewGroup.addView(msgTabFakeBubbleRoot);
                msgTabFakeBubbleRoot.setTag("msg_tab_fake_bubble_view");
                msgTabFakeBubbleRoot.m3314j();
            }
        }
    }
}
