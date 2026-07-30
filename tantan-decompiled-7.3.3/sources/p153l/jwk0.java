package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.external.internal.vchat.VChatStartAct;

/* JADX INFO: loaded from: classes9.dex */
public class jwk0 {
    /* JADX INFO: renamed from: a */
    public static void m147167a(Act act) {
        VChatStartAct.m70399d2(act);
    }

    /* JADX INFO: renamed from: b */
    public static void m147168b(Act act) {
        VChatStartAct.m70400e2(act);
    }

    /* JADX INFO: renamed from: c */
    public static void m147169c(Act act, String str, String str2) {
        VChatStartAct.m70403i2(act, str, str2);
    }

    /* JADX INFO: renamed from: d */
    public static void m147170d(Act act, String str, String str2, String str3) {
        VChatStartAct.m70402h2(act, str, str2, str3);
    }

    /* JADX INFO: renamed from: e */
    public static void m147171e(Act act, String str, String str2) {
        VChatStartAct.m70404k2(act, str, str2);
    }

    /* JADX INFO: renamed from: f */
    public static void m147172f(Act act, int i, String str) {
        VChatStartAct.m70408r2(act, i, str);
    }

    /* JADX INFO: renamed from: g */
    public static void m147173g(Act act, String str, boolean z) {
        if (TextUtils.equals(str, mbs.m157870o0())) {
            return;
        }
        if (!z) {
            m147170d(act, str, "fakeCall", null);
            return;
        }
        byd0 byd0Var = new byd0("lastRangeFirstFakeCallTime" + mbs.m157870o0(), 0L);
        vxd0 vxd0Var = new vxd0("lastRangeFakeCallCount" + mbs.m157870o0(), 0);
        if (pzi0.m174462w(byd0Var.get().longValue(), tbs.f172989b.m203436I5())) {
            vxd0Var.put(1);
            byd0Var.put(Long.valueOf(pzi0.m174454o()));
            m147170d(act, str, "fakeCall", null);
        } else if (vxd0Var.get().intValue() < tbs.f172989b.m203444J5()) {
            vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
            m147170d(act, str, "fakeCall", null);
        }
    }
}
