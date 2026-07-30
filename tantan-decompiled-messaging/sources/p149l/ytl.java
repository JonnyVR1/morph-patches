package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.push.PushTrackData;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.live.base.apibean.LiveGoAction;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class ytl {

    /* JADX INFO: renamed from: a */
    public PushMessage f199994a;

    /* JADX INFO: renamed from: b */
    public PushTrackData f199995b;

    /* JADX INFO: renamed from: f */
    public static boolean m216063f(Act act) {
        return act == null || act.isFinishing();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m216064h(Act act) {
        if (act != null) {
            return s9s.f163232f.m134380m(act);
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m216065i() {
        if (Act.globalLifeCycle_().isEmpty() || Act.globalLifeCycle_().values().isEmpty()) {
            return false;
        }
        ArrayList<Act.C4299r> next = Act.globalLifeCycle_().values().iterator().next();
        if (vwb.m200296J(next)) {
            return false;
        }
        return s9s.f163232f.m134380m(next.get(next.size() - 1).f15343a.get());
    }

    /* JADX INFO: renamed from: m */
    public static String m216066m(LiveGoAction liveGoAction, String str) {
        return m216067n(liveGoAction, str, "");
    }

    /* JADX INFO: renamed from: n */
    public static String m216067n(LiveGoAction liveGoAction, String str, String str2) {
        Map<String, String> goExtra = liveGoAction.getGoExtra();
        if (goExtra != null) {
            String str3 = goExtra.get(str);
            if (!TextUtils.isEmpty(str3)) {
                return str3;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: o */
    public static int m216068o(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m216069b(Act act, String str, String str2) {
        if (mo94602l(mo99015a(str))) {
            return;
        }
        if (str2 != null) {
            str = str + "?" + str2;
        }
        eqs.m117786n(act, str);
    }

    /* JADX INFO: renamed from: c */
    public void mo124162c(Act act, LiveGoAction liveGoAction) {
        fqs.m122742b(String.valueOf(liveGoAction.getType()), true);
    }

    /* JADX INFO: renamed from: d */
    public void mo100100d(Act act, String str, PushMessageCustom pushMessageCustom) {
        fqs.m122743c(str, true, null);
    }

    /* JADX INFO: renamed from: e */
    public void mo94601e(Act act, String str, w2e0 w2e0Var) {
        fqs.m122744d(str, true);
    }

    /* JADX INFO: renamed from: g */
    public boolean mo99016g() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo124163j(int i) {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo100101k(String str) {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public boolean mo94602l(String str) {
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final void m216070p(PushTrackData pushTrackData) {
        this.f199995b = pushTrackData;
    }

    /* JADX INFO: renamed from: q */
    public final void m216071q(PushMessage pushMessage) {
        this.f199994a = pushMessage;
    }

    /* JADX INFO: renamed from: a */
    public String mo99015a(String str) {
        return str;
    }
}
