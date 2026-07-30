package p149l;

import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.mwc.sdk.C3929c;
import com.immomo.mwc.sdk.MWCEngine;

/* JADX INFO: loaded from: classes2.dex */
public class fow implements xxv {

    /* JADX INFO: renamed from: l.fow$a */
    public class RunnableC16898a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f98641a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f98642b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f98643c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f98644d;

        public RunnableC16898a(String str, String str2, String str3, String str4) {
            this.f98641a = str;
            this.f98642b = str2;
            this.f98643c = str3;
            this.f98644d = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            jxv jxvVarM198475e = vhw.m198471d().m198475e(this.f98641a);
            if (jxvVarM198475e == null) {
                try {
                    vhw.m198471d().m198474c(this.f98641a);
                } catch (Throwable th) {
                    mxv.m156927b("mwc", "createLogSession(" + this.f98641a + ") exception:" + th);
                }
                jxvVarM198475e = vhw.m198471d().m198475e(this.f98641a);
            }
            if (jxvVarM198475e != null) {
                if (TextUtils.isEmpty(jxvVarM198475e.f120250b)) {
                    jxvVarM198475e.f120250b = this.f98642b;
                    jxvVarM198475e.f120251c = this.f98643c;
                }
                if (TextUtils.isEmpty(this.f98644d) || !TextUtils.isEmpty(jxvVarM198475e.f120254f)) {
                    return;
                }
                jxvVarM198475e.f120254f = this.f98644d;
                jxvVarM198475e.f120256h = true;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    private void m122530k(String str, boolean z) {
        String strM122532n;
        C3929c c3929cM19359B;
        if (z) {
            strM122532n = m122532n(hashCode());
        } else {
            strM122532n = (TextUtils.isEmpty(str) || (c3929cM19359B = MWCEngine.m19359B(str)) == null) ? null : m122532n(c3929cM19359B.hashCode());
        }
        if (TextUtils.isEmpty(strM122532n) || vhw.m198471d().m198475e(strM122532n) == null) {
            return;
        }
        try {
            vhw.m198471d().m198473b(strM122532n);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: m */
    private void m122531m(int i, String str, String str2, String str3, Object... objArr) {
        String strConcat;
        String str4;
        String str5;
        String strM19442e;
        C3929c c3929cM19359B;
        if ((!unw.m194528c() && i != 5 && i != 4) || i == 1 || TextUtils.isEmpty(str3)) {
            return;
        }
        if (objArr == null) {
            strConcat = str3;
        } else {
            try {
                strConcat = String.format(str3, objArr);
            } catch (Throwable unused) {
                strConcat = "";
            }
        }
        if (TextUtils.isEmpty(strConcat)) {
            return;
        }
        if (unw.m194528c()) {
            if (i == 1) {
                strConcat = strConcat + " [STYLE:185ae2,bfd3ff,a7c3ff]";
            } else if (i == 2) {
                strConcat = strConcat + " [STYLE:333333,ffffff,f0f0f0]";
            } else if (i == 3) {
                strConcat = strConcat + " [STYLE:51360e,fefbdf,fef3b5]";
            } else if (i == 4 || i == 5) {
                strConcat = strConcat + " [STYLE:fc0006,feedec,fdcccd]";
            }
        }
        if (unw.m194528c()) {
            strConcat = strConcat + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + dyv.m114093a(6);
            if (i == 5) {
                strConcat = "[JSError]".concat(strConcat);
            }
        }
        String str6 = strConcat;
        String strM122532n = null;
        if (TextUtils.isEmpty(str2) || (c3929cM19359B = MWCEngine.m19359B(str2)) == null) {
            str4 = null;
            str5 = null;
            strM19442e = null;
        } else {
            String strM19445h = c3929cM19359B.m19445h();
            String strM122532n2 = m122532n(c3929cM19359B.hashCode());
            strM19442e = c3929cM19359B.m19442e();
            if (c3929cM19359B.m19440c() != null) {
                String strM19444g = c3929cM19359B.m19444g();
                strM122532n = strM122532n2;
                str5 = strM19445h;
                str4 = strM19444g == null ? "" : strM19444g;
            } else {
                str4 = null;
                strM122532n = strM122532n2;
                str5 = strM19445h;
            }
        }
        if (TextUtils.isEmpty(strM122532n) || TextUtils.isEmpty(strM19442e)) {
            strM122532n = m122532n(hashCode());
            strM19442e = "1002065";
        }
        String str7 = strM122532n;
        String str8 = strM19442e;
        if ("0".equals(str8)) {
            return;
        }
        if (vhw.m198471d().m198475e(str7) == null) {
            vhw.m198471d().m198482l(new RunnableC16898a(str7, str8, str4, str5));
        }
        if (i == 1) {
            lxv.m152102h(eow.m117515m(str7, "MWC_DEBUG", str6));
            return;
        }
        if (i == 2) {
            lxv.m152102h(eow.m117515m(str7, "MWC_INFO", str6));
            return;
        }
        if (i == 3) {
            lxv.m152102h(eow.m117515m(str7, "MWC_WARN", str6));
        } else if (i == 5) {
            lxv.m152102h(eow.m117514l(str7, "MWC_ERR", str6));
        } else if (i == 4) {
            lxv.m152102h(eow.m117513k(str7, "MWC_ERR", str6));
        }
    }

    /* JADX INFO: renamed from: n */
    private String m122532n(int i) {
        return "mwc:" + i;
    }

    @Override // p149l.xxv
    /* JADX INFO: renamed from: a */
    public void mo122533a(String str) {
        m122530k(str, false);
    }

    @Override // p149l.xxv
    /* JADX INFO: renamed from: b */
    public void mo122534b(String str, String str2, String str3) {
        mo122542j(str, str2, str3, null);
    }

    @Override // p149l.xxv
    /* JADX INFO: renamed from: c */
    public void mo122535c(String str, String str2, String str3) {
        mo122541i(str, str2, str3, null);
    }

    @Override // p149l.xxv
    /* JADX INFO: renamed from: d */
    public void mo122536d(String str, String str2, String str3, Object... objArr) {
        m122531m(2, str, str2, str3, objArr);
    }

    @Override // p149l.xxv
    /* JADX INFO: renamed from: e */
    public void mo122537e(String str, String str2, String str3, Object... objArr) {
        m122531m(3, str, str2, str3, objArr);
    }

    @Override // p149l.xxv
    /* JADX INFO: renamed from: f */
    public void mo122538f(String str, String str2, String str3) {
        mo122536d(str, str2, str3, null);
    }

    @Override // p149l.xxv
    /* JADX INFO: renamed from: g */
    public void mo122539g(int i, String str, String str2, String str3) {
        m122543l(i, str, str2, str3, null);
    }

    @Override // p149l.xxv
    /* JADX INFO: renamed from: h */
    public void mo122540h(String str, String str2, String str3) {
        mo122537e(str, str2, str3, null);
    }

    @Override // p149l.xxv
    /* JADX INFO: renamed from: i */
    public void mo122541i(String str, String str2, String str3, Object... objArr) {
        m122531m(1, str, str2, str3, objArr);
    }

    @Override // p149l.xxv
    /* JADX INFO: renamed from: j */
    public void mo122542j(String str, String str2, String str3, Object... objArr) {
        m122531m(4, str, str2, str3, objArr);
    }

    /* JADX INFO: renamed from: l */
    public void m122543l(int i, String str, String str2, String str3, Object... objArr) {
        m122531m(i, str, str2, str3, objArr);
    }
}
