package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.external.internal.vchat.VChatStartAct;

/* JADX INFO: loaded from: classes13.dex */
public class dnk0 {
    /* JADX INFO: renamed from: a */
    public static void m112642a(Act act) {
        VChatStartAct.m69216c2(act);
    }

    /* JADX INFO: renamed from: b */
    public static void m112643b(Act act) {
        VChatStartAct.m69217d2(act);
    }

    /* JADX INFO: renamed from: c */
    public static void m112644c(Act act, String str, String str2) {
        VChatStartAct.m69220h2(act, str, str2);
    }

    /* JADX INFO: renamed from: d */
    public static void m112645d(Act act, String str, String str2, String str3) {
        VChatStartAct.m69219g2(act, str, str2, str3);
    }

    /* JADX INFO: renamed from: e */
    public static void m112646e(Act act, String str, String str2) {
        VChatStartAct.m69221i2(act, str, str2);
    }

    /* JADX INFO: renamed from: f */
    public static void m112647f(Act act, int i, String str) {
        VChatStartAct.m69225q2(act, i, str);
    }

    /* JADX INFO: renamed from: g */
    public static void m112648g(Act act, String str, boolean z) {
        if (TextUtils.equals(str, l9s.m149093o0())) {
            return;
        }
        if (!z) {
            m112645d(act, str, "fakeCall", null);
            return;
        }
        zpd0 zpd0Var = new zpd0("lastRangeFirstFakeCallTime" + l9s.m149093o0(), 0L);
        tpd0 tpd0Var = new tpd0("lastRangeFakeCallCount" + l9s.m149093o0(), 0);
        if (mqi0.m155952w(zpd0Var.get().longValue(), s9s.f163228b.m195649I5())) {
            tpd0Var.put(1);
            zpd0Var.put(Long.valueOf(mqi0.m155944o()));
            m112645d(act, str, "fakeCall", null);
        } else if (tpd0Var.get().intValue() < s9s.f163228b.m195657J5()) {
            tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
            m112645d(act, str, "fakeCall", null);
        }
    }
}
