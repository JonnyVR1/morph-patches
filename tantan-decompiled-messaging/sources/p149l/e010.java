package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.growth.fakebyconv.MsgTabFakeBubbleRoot;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class e010 {
    /* JADX INFO: renamed from: a */
    public static boolean m114153a() {
        return CoreModule.f17545c.f19639e0.m169476c8();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m114154b() {
        return (!CoreModule.f17545c.f19639e0.m169476c8() || CoreModule.f17545c.f19639e0.m169506k8() || CoreModule.f17545c.f19639e0.m169452W7()) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static void m114155c(Act act, TabName tabName) {
        ViewGroup viewGroup = (ViewGroup) act.getWindow().getDecorView();
        View viewFindViewWithTag = viewGroup.findViewWithTag("msg_tab_fake_bubble_view");
        if (tabName != TabName.Msg) {
            if (NullChecker.m81303a(viewFindViewWithTag)) {
                xdl0.m208344M(viewFindViewWithTag, false);
            }
        } else if (m114154b() && !w1g.m200928a()) {
            if (viewFindViewWithTag instanceof MsgTabFakeBubbleRoot) {
                xdl0.m208344M(viewFindViewWithTag, true);
                ((MsgTabFakeBubbleRoot) viewFindViewWithTag).m45968q();
            } else {
                MsgTabFakeBubbleRoot msgTabFakeBubbleRoot = (MsgTabFakeBubbleRoot) act.getLayoutInflater().inflate(f6c0.f95290B7, (ViewGroup) null);
                viewGroup.addView(msgTabFakeBubbleRoot);
                msgTabFakeBubbleRoot.setTag("msg_tab_fake_bubble_view");
                msgTabFakeBubbleRoot.m45961j();
            }
        }
    }
}
