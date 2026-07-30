package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.growth.fakebyconv.MsgTabFakeBubbleRoot;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class o810 {
    /* JADX INFO: renamed from: a */
    public static boolean m166444a() {
        return CoreModule.f18264c.f20381e0.m116549c8();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m166445b() {
        return (!CoreModule.f18264c.f20381e0.m116549c8() || CoreModule.f18264c.f20381e0.m116579k8() || CoreModule.f18264c.f20381e0.m116525W7()) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static void m166446c(Act act, TabName tabName) {
        ViewGroup viewGroup = (ViewGroup) act.getWindow().getDecorView();
        View viewFindViewWithTag = viewGroup.findViewWithTag("msg_tab_fake_bubble_view");
        if (tabName != TabName.Msg) {
            if (NullChecker.m82486a(viewFindViewWithTag)) {
                bnl0.m105524M(viewFindViewWithTag, false);
            }
        } else if (m166445b() && !k3g.m148016a()) {
            if (viewFindViewWithTag instanceof MsgTabFakeBubbleRoot) {
                bnl0.m105524M(viewFindViewWithTag, true);
                ((MsgTabFakeBubbleRoot) viewFindViewWithTag).m47151q();
            } else {
                MsgTabFakeBubbleRoot msgTabFakeBubbleRoot = (MsgTabFakeBubbleRoot) act.getLayoutInflater().inflate(kec0.f125456I7, (ViewGroup) null);
                viewGroup.addView(msgTabFakeBubbleRoot);
                msgTabFakeBubbleRoot.setTag("msg_tab_fake_bubble_view");
                msgTabFakeBubbleRoot.m47144j();
            }
        }
    }
}
