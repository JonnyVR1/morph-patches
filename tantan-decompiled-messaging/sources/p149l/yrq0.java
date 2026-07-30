package p149l;

import com.clevertap.android.sdk.Constants;
import com.xiaomi.push.service.C14839aj;
import com.xiaomi.push.service.C14842am;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class yrq0 implements wsq0 {

    /* JADX INFO: renamed from: g */
    public static boolean f199691g = false;

    /* JADX INFO: renamed from: b */
    private osq0 f199693b;

    /* JADX INFO: renamed from: a */
    private SimpleDateFormat f199692a = new SimpleDateFormat("hh:mm:ss aaa");

    /* JADX INFO: renamed from: c */
    private C21490b f199694c = null;

    /* JADX INFO: renamed from: d */
    private C21490b f199695d = null;

    /* JADX INFO: renamed from: e */
    private rsq0 f199696e = null;

    /* JADX INFO: renamed from: f */
    private final String f199697f = "[Slim] ";

    public yrq0(osq0 osq0Var) {
        this.f199693b = osq0Var;
        m215856d();
    }

    /* JADX INFO: renamed from: d */
    private void m215856d() {
        this.f199694c = new C21490b(true);
        this.f199695d = new C21490b(false);
        osq0 osq0Var = this.f199693b;
        C21490b c21490b = this.f199694c;
        osq0Var.m165893n(c21490b, c21490b);
        osq0 osq0Var2 = this.f199693b;
        C21490b c21490b2 = this.f199695d;
        osq0Var2.m165905z(c21490b2, c21490b2);
        this.f199696e = new C21489a();
    }

    /* JADX INFO: renamed from: l.yrq0$a */
    public class C21489a implements rsq0 {
        public C21489a() {
        }

        @Override // p149l.rsq0
        /* JADX INFO: renamed from: a */
        public void mo85571a(osq0 osq0Var, Exception exc) {
            ilq0.m137053z("[Slim] " + yrq0.this.f199692a.format(new Date()) + " Reconnection failed due to an exception (" + yrq0.this.f199693b.hashCode() + ")");
            exc.printStackTrace();
        }

        @Override // p149l.rsq0
        /* JADX INFO: renamed from: b */
        public void mo85573b(osq0 osq0Var) {
            ilq0.m137053z("[Slim] " + yrq0.this.f199692a.format(new Date()) + " Connection reconnected (" + yrq0.this.f199693b.hashCode() + ")");
        }

        @Override // p149l.rsq0
        /* JADX INFO: renamed from: a */
        public void mo85570a(osq0 osq0Var, int i, Exception exc) {
            ilq0.m137053z("[Slim] " + yrq0.this.f199692a.format(new Date()) + " Connection closed (" + yrq0.this.f199693b.hashCode() + ")");
        }

        @Override // p149l.rsq0
        /* JADX INFO: renamed from: a */
        public void mo85569a(osq0 osq0Var) {
            ilq0.m137053z("[Slim] " + yrq0.this.f199692a.format(new Date()) + " Connection started (" + yrq0.this.f199693b.hashCode() + ")");
        }
    }

    /* JADX INFO: renamed from: l.yrq0$b */
    public class C21490b implements tsq0, xsq0 {

        /* JADX INFO: renamed from: a */
        String f199699a;

        /* JADX INFO: renamed from: b */
        private boolean f199700b;

        public C21490b(boolean z) {
            this.f199700b = z;
            this.f199699a = z ? " RCV " : " Sent ";
        }

        @Override // p149l.tsq0
        /* JADX INFO: renamed from: a */
        public void mo86364a(qrq0 qrq0Var) {
            boolean z = yrq0.f199691g;
            yrq0 yrq0Var = yrq0.this;
            if (z) {
                ilq0.m137053z("[Slim] " + yrq0Var.f199692a.format(new Date()) + this.f199699a + qrq0Var.toString());
            } else {
                ilq0.m137053z("[Slim] " + yrq0Var.f199692a.format(new Date()) + this.f199699a + " Blob [" + qrq0Var.m176085c() + Constants.SEPARATOR_COMMA + qrq0Var.m176083a() + Constants.SEPARATOR_COMMA + C14839aj.m86496a(qrq0Var.m176080D()) + Constants.AES_SUFFIX);
            }
            if (qrq0Var == null || qrq0Var.m176083a() != 99999) {
                return;
            }
            String strM176085c = qrq0Var.m176085c();
            qrq0 qrq0Var2 = null;
            if (!this.f199700b) {
                if ("BIND".equals(strM176085c)) {
                    ilq0.m137040m("build binded result for loopback.");
                    cqq0 cqq0Var = new cqq0();
                    cqq0Var.m108294m(true);
                    cqq0Var.m108300t("login success.");
                    cqq0Var.m108297q("success");
                    cqq0Var.m108292k("success");
                    qrq0 qrq0Var3 = new qrq0();
                    qrq0Var3.m176094n(cqq0Var.m215761h(), null);
                    qrq0Var3.m176093m((short) 2);
                    qrq0Var3.m176088h(99999);
                    qrq0Var3.m176092l("BIND", null);
                    qrq0Var3.m176091k(qrq0Var.m176080D());
                    qrq0Var3.m176102v(null);
                    qrq0Var3.m176079B(qrq0Var.m176082F());
                    qrq0Var2 = qrq0Var3;
                } else if (!"UBND".equals(strM176085c) && "SECMSG".equals(strM176085c)) {
                    qrq0 qrq0Var4 = new qrq0();
                    qrq0Var4.m176088h(99999);
                    qrq0Var4.m176092l("SECMSG", null);
                    qrq0Var4.m176079B(qrq0Var.m176082F());
                    qrq0Var4.m176091k(qrq0Var.m176080D());
                    qrq0Var4.m176093m(qrq0Var.m176087g());
                    qrq0Var4.m176102v(qrq0Var.m176081E());
                    qrq0Var4.m176094n(qrq0Var.m176097q(C14842am.m86505a().m86508a(String.valueOf(99999), qrq0Var.m176082F()).f62901h), null);
                    qrq0Var2 = qrq0Var4;
                }
            }
            if (qrq0Var2 != null) {
                for (Map.Entry<tsq0, osq0.C19027a> entry : yrq0.this.f199693b.m165885e().entrySet()) {
                    if (yrq0.this.f199694c != entry.getKey()) {
                        entry.getValue().m165906a(qrq0Var2);
                    }
                }
            }
        }

        @Override // p149l.tsq0
        /* JADX INFO: renamed from: a */
        public void mo86363a(atq0 atq0Var) {
            boolean z = yrq0.f199691g;
            yrq0 yrq0Var = yrq0.this;
            if (z) {
                ilq0.m137053z("[Slim] " + yrq0Var.f199692a.format(new Date()) + this.f199699a + " PKT " + atq0Var.mo85578d());
                return;
            }
            ilq0.m137053z("[Slim] " + yrq0Var.f199692a.format(new Date()) + this.f199699a + " PKT [" + atq0Var.m98867m() + Constants.SEPARATOR_COMMA + atq0Var.m98866l() + Constants.AES_SUFFIX);
        }

        @Override // p149l.xsq0
        /* JADX INFO: renamed from: a */
        public boolean mo86368a(atq0 atq0Var) {
            return true;
        }
    }
}
