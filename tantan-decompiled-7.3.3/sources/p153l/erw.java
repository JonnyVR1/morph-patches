package p153l;

import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.hellogroup.p036mk.core.log.MKCoreLogManager;
import com.immomo.mwc.sdk.C4072c;
import com.immomo.mwc.sdk.MWCEngine;

/* JADX INFO: loaded from: classes7.dex */
public class erw implements uzv {
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m122289k(String str, String str2, String str3, String str4) {
        if (i8g0.m139002d(str)) {
            MKCoreLogManager.m18431i(str2).m211445T(str);
        }
        if (i8g0.m139002d(str3)) {
            MKCoreLogManager.m18431i(str2).mo18477n(str3);
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        MKCoreLogManager.m18431i(str2).m18480q(true, str4);
    }

    /* JADX INFO: renamed from: l */
    private void m122290l(String str, boolean z) {
        String strM122292o;
        C4072c c4072cM20339B;
        if (z) {
            strM122292o = m122292o(hashCode());
        } else {
            strM122292o = (TextUtils.isEmpty(str) || (c4072cM20339B = MWCEngine.m20339B(str)) == null) ? null : m122292o(c4072cM20339B.hashCode());
        }
        if (TextUtils.isEmpty(strM122292o)) {
            return;
        }
        MKCoreLogManager.m18425c(strM122292o);
    }

    /* JADX INFO: renamed from: n */
    private void m122291n(int i, String str, String str2, String str3, Object... objArr) {
        final String strM20425h;
        final String strM20422e;
        C4072c c4072cM20339B;
        if ((!tqw.m192365c() && i != 5 && i != 4) || i == 1 || TextUtils.isEmpty(str3)) {
            return;
        }
        final String str4 = "";
        if (objArr != null) {
            try {
                str3 = String.format(str3, objArr);
            } catch (Throwable unused) {
                str3 = "";
            }
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        if (tqw.m192365c()) {
            if (i == 1) {
                str3 = str3 + " [STYLE:185ae2,bfd3ff,a7c3ff]";
            } else if (i == 2) {
                str3 = str3 + " [STYLE:333333,ffffff,f0f0f0]";
            } else if (i == 3) {
                str3 = str3 + " [STYLE:51360e,fefbdf,fef3b5]";
            } else if (i == 4 || i == 5) {
                str3 = str3 + " [STYLE:fc0006,feedec,fdcccd]";
            }
        }
        if (tqw.m192365c()) {
            str3 = str3 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + a0w.m95429a(6);
            if (i == 5) {
                str3 = "[JSError]".concat(str3);
            }
        }
        final String strM122292o = null;
        if (TextUtils.isEmpty(str2) || (c4072cM20339B = MWCEngine.m20339B(str2)) == null) {
            strM20425h = null;
            str4 = null;
            strM20422e = null;
        } else {
            strM20425h = c4072cM20339B.m20425h();
            String strM122292o2 = m122292o(c4072cM20339B.hashCode());
            strM20422e = c4072cM20339B.m20422e();
            if (c4072cM20339B.m20420c() != null) {
                String strM20424g = c4072cM20339B.m20424g();
                if (strM20424g != null) {
                    str4 = strM20424g;
                }
            } else {
                str4 = null;
            }
            strM122292o = strM122292o2;
        }
        if (TextUtils.isEmpty(strM122292o) || TextUtils.isEmpty(strM20422e)) {
            strM122292o = m122292o(hashCode());
            strM20422e = "1002065";
        }
        if ("0".equals(strM20422e)) {
            return;
        }
        x310.m209186d(new Runnable() { // from class: l.drw
            @Override // java.lang.Runnable
            public final void run() {
                erw.m122289k(strM20422e, strM122292o, str4, strM20425h);
            }
        });
        if (i == 1) {
            MKCoreLogManager.m18431i(strM122292o).m211451v(str3);
            return;
        }
        if (i == 2) {
            MKCoreLogManager.m18431i(strM122292o).m211454y(str3);
            return;
        }
        if (i == 3) {
            MKCoreLogManager.m18431i(strM122292o).m211455z(str3);
        } else if (i == 5) {
            MKCoreLogManager.m18431i(strM122292o).m211452w(str3);
        } else if (i == 4) {
            MKCoreLogManager.m18431i(strM122292o).m211453x(str3);
        }
    }

    /* JADX INFO: renamed from: o */
    private String m122292o(int i) {
        return "mwc:" + i;
    }

    @Override // p153l.uzv
    /* JADX INFO: renamed from: a */
    public void mo99444a(String str) {
        m122290l(str, false);
    }

    @Override // p153l.uzv
    /* JADX INFO: renamed from: b */
    public void mo99445b(String str, String str2, String str3) {
        mo99453j(str, str2, str3, null);
    }

    @Override // p153l.uzv
    /* JADX INFO: renamed from: c */
    public void mo99446c(String str, String str2, String str3) {
        mo99452i(str, str2, str3, null);
    }

    @Override // p153l.uzv
    /* JADX INFO: renamed from: d */
    public void mo99447d(String str, String str2, String str3, Object... objArr) {
        m122291n(2, str, str2, str3, objArr);
    }

    @Override // p153l.uzv
    /* JADX INFO: renamed from: e */
    public void mo99448e(String str, String str2, String str3, Object... objArr) {
        m122291n(3, str, str2, str3, objArr);
    }

    @Override // p153l.uzv
    /* JADX INFO: renamed from: f */
    public void mo99449f(String str, String str2, String str3) {
        mo99447d(str, str2, str3, null);
    }

    @Override // p153l.uzv
    /* JADX INFO: renamed from: g */
    public void mo99450g(int i, String str, String str2, String str3) {
        m122293m(i, str, str2, str3, null);
    }

    @Override // p153l.uzv
    /* JADX INFO: renamed from: h */
    public void mo99451h(String str, String str2, String str3) {
        mo99448e(str, str2, str3, null);
    }

    @Override // p153l.uzv
    /* JADX INFO: renamed from: i */
    public void mo99452i(String str, String str2, String str3, Object... objArr) {
        m122291n(1, str, str2, str3, objArr);
    }

    @Override // p153l.uzv
    /* JADX INFO: renamed from: j */
    public void mo99453j(String str, String str2, String str3, Object... objArr) {
        m122291n(4, str, str2, str3, objArr);
    }

    /* JADX INFO: renamed from: m */
    public void m122293m(int i, String str, String str2, String str3, Object... objArr) {
        m122291n(i, str, str2, str3, objArr);
    }
}
