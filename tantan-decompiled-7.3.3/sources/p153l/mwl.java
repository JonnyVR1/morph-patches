package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.push.PushTrackData;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.live.base.apibean.LiveGoAction;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class mwl {

    /* JADX INFO: renamed from: a */
    public PushMessage f139111a;

    /* JADX INFO: renamed from: b */
    public PushTrackData f139112b;

    /* JADX INFO: renamed from: f */
    public static boolean m160557f(Act act) {
        return act == null || act.isFinishing();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m160558h(Act act) {
        if (act != null) {
            return tbs.f172993f.m143711m(act);
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m160559i() {
        if (Act.globalLifeCycle_().isEmpty() || Act.globalLifeCycle_().values().isEmpty()) {
            return false;
        }
        ArrayList<Act.C4450r> next = Act.globalLifeCycle_().values().iterator().next();
        if (jyb.m147479J(next)) {
            return false;
        }
        return tbs.f172993f.m143711m(next.get(next.size() - 1).f16062a.get());
    }

    /* JADX INFO: renamed from: m */
    public static String m160560m(LiveGoAction liveGoAction, String str) {
        return m160561n(liveGoAction, str, "");
    }

    /* JADX INFO: renamed from: n */
    public static String m160561n(LiveGoAction liveGoAction, String str, String str2) {
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
    public static int m160562o(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m160564b(Act act, String str, String str2) {
        if (mo96235l(mo160563a(str))) {
            return;
        }
        if (str2 != null) {
            str = str + "?" + str2;
        }
        fss.m127251n(act, str);
    }

    /* JADX INFO: renamed from: c */
    public void mo108063c(Act act, LiveGoAction liveGoAction) {
        gss.m132146b(String.valueOf(liveGoAction.getType()), true);
    }

    /* JADX INFO: renamed from: d */
    public void mo102761d(Act act, String str, PushMessageCustom pushMessageCustom) {
        gss.m132147c(str, true, null);
    }

    /* JADX INFO: renamed from: e */
    public void mo96234e(Act act, String str, abe0 abe0Var) {
        gss.m132148d(str, true);
    }

    /* JADX INFO: renamed from: g */
    public boolean mo160565g() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo108064j(int i) {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo102762k(String str) {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public boolean mo96235l(String str) {
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final void m160566p(PushTrackData pushTrackData) {
        this.f139112b = pushTrackData;
    }

    /* JADX INFO: renamed from: q */
    public final void m160567q(PushMessage pushMessage) {
        this.f139111a = pushMessage;
    }

    /* JADX INFO: renamed from: a */
    public String mo160563a(String str) {
        return str;
    }
}
