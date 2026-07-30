package p153l;

import com.clevertap.android.sdk.Constants;
import com.xiaomi.push.service.C14987aj;
import com.xiaomi.push.service.C14990am;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class e1r0 implements c2r0 {

    /* JADX INFO: renamed from: g */
    public static boolean f91662g = false;

    /* JADX INFO: renamed from: b */
    private u1r0 f91664b;

    /* JADX INFO: renamed from: a */
    private SimpleDateFormat f91663a = new SimpleDateFormat("hh:mm:ss aaa");

    /* JADX INFO: renamed from: c */
    private C16683b f91665c = null;

    /* JADX INFO: renamed from: d */
    private C16683b f91666d = null;

    /* JADX INFO: renamed from: e */
    private x1r0 f91667e = null;

    /* JADX INFO: renamed from: f */
    private final String f91668f = "[Slim] ";

    public e1r0(u1r0 u1r0Var) {
        this.f91664b = u1r0Var;
        m119023d();
    }

    /* JADX INFO: renamed from: d */
    private void m119023d() {
        this.f91665c = new C16683b(true);
        this.f91666d = new C16683b(false);
        u1r0 u1r0Var = this.f91664b;
        C16683b c16683b = this.f91665c;
        u1r0Var.m194103n(c16683b, c16683b);
        u1r0 u1r0Var2 = this.f91664b;
        C16683b c16683b2 = this.f91666d;
        u1r0Var2.m194110z(c16683b2, c16683b2);
        this.f91667e = new C16682a();
    }

    /* JADX INFO: renamed from: l.e1r0$a */
    public class C16682a implements x1r0 {
        public C16682a() {
        }

        @Override // p153l.x1r0
        /* JADX INFO: renamed from: a */
        public void mo86742a(u1r0 u1r0Var, Exception exc) {
            ouq0.m169406z("[Slim] " + e1r0.this.f91663a.format(new Date()) + " Reconnection failed due to an exception (" + e1r0.this.f91664b.hashCode() + ")");
            exc.printStackTrace();
        }

        @Override // p153l.x1r0
        /* JADX INFO: renamed from: b */
        public void mo86744b(u1r0 u1r0Var) {
            ouq0.m169406z("[Slim] " + e1r0.this.f91663a.format(new Date()) + " Connection reconnected (" + e1r0.this.f91664b.hashCode() + ")");
        }

        @Override // p153l.x1r0
        /* JADX INFO: renamed from: a */
        public void mo86741a(u1r0 u1r0Var, int i, Exception exc) {
            ouq0.m169406z("[Slim] " + e1r0.this.f91663a.format(new Date()) + " Connection closed (" + e1r0.this.f91664b.hashCode() + ")");
        }

        @Override // p153l.x1r0
        /* JADX INFO: renamed from: a */
        public void mo86740a(u1r0 u1r0Var) {
            ouq0.m169406z("[Slim] " + e1r0.this.f91663a.format(new Date()) + " Connection started (" + e1r0.this.f91664b.hashCode() + ")");
        }
    }

    /* JADX INFO: renamed from: l.e1r0$b */
    public class C16683b implements z1r0, d2r0 {

        /* JADX INFO: renamed from: a */
        String f91670a;

        /* JADX INFO: renamed from: b */
        private boolean f91671b;

        public C16683b(boolean z) {
            this.f91671b = z;
            this.f91670a = z ? " RCV " : " Sent ";
        }

        @Override // p153l.z1r0
        /* JADX INFO: renamed from: a */
        public void mo87535a(w0r0 w0r0Var) {
            boolean z = e1r0.f91662g;
            e1r0 e1r0Var = e1r0.this;
            if (z) {
                ouq0.m169406z("[Slim] " + e1r0Var.f91663a.format(new Date()) + this.f91670a + w0r0Var.toString());
            } else {
                ouq0.m169406z("[Slim] " + e1r0Var.f91663a.format(new Date()) + this.f91670a + " Blob [" + w0r0Var.m204322c() + Constants.SEPARATOR_COMMA + w0r0Var.m204320a() + Constants.SEPARATOR_COMMA + C14987aj.m87667a(w0r0Var.m204317D()) + Constants.AES_SUFFIX);
            }
            if (w0r0Var == null || w0r0Var.m204320a() != 99999) {
                return;
            }
            String strM204322c = w0r0Var.m204322c();
            w0r0 w0r0Var2 = null;
            if (!this.f91671b) {
                if ("BIND".equals(strM204322c)) {
                    ouq0.m169393m("build binded result for loopback.");
                    izq0 izq0Var = new izq0();
                    izq0Var.m142821m(true);
                    izq0Var.m142827t("login success.");
                    izq0Var.m142824q("success");
                    izq0Var.m142819k("success");
                    w0r0 w0r0Var3 = new w0r0();
                    w0r0Var3.m204330n(izq0Var.m118923h(), null);
                    w0r0Var3.m204329m((short) 2);
                    w0r0Var3.m204324h(99999);
                    w0r0Var3.m204328l("BIND", null);
                    w0r0Var3.m204327k(w0r0Var.m204317D());
                    w0r0Var3.m204338v(null);
                    w0r0Var3.m204316B(w0r0Var.m204319F());
                    w0r0Var2 = w0r0Var3;
                } else if (!"UBND".equals(strM204322c) && "SECMSG".equals(strM204322c)) {
                    w0r0 w0r0Var4 = new w0r0();
                    w0r0Var4.m204324h(99999);
                    w0r0Var4.m204328l("SECMSG", null);
                    w0r0Var4.m204316B(w0r0Var.m204319F());
                    w0r0Var4.m204327k(w0r0Var.m204317D());
                    w0r0Var4.m204329m(w0r0Var.m204323g());
                    w0r0Var4.m204338v(w0r0Var.m204318E());
                    w0r0Var4.m204330n(w0r0Var.m204333q(C14990am.m87676a().m87679a(String.valueOf(99999), w0r0Var.m204319F()).f63748h), null);
                    w0r0Var2 = w0r0Var4;
                }
            }
            if (w0r0Var2 != null) {
                for (Map.Entry<z1r0, u1r0.C20459a> entry : e1r0.this.f91664b.m194097e().entrySet()) {
                    if (e1r0.this.f91665c != entry.getKey()) {
                        entry.getValue().m194111a(w0r0Var2);
                    }
                }
            }
        }

        @Override // p153l.z1r0
        /* JADX INFO: renamed from: a */
        public void mo87534a(g2r0 g2r0Var) {
            boolean z = e1r0.f91662g;
            e1r0 e1r0Var = e1r0.this;
            if (z) {
                ouq0.m169406z("[Slim] " + e1r0Var.f91663a.format(new Date()) + this.f91670a + " PKT " + g2r0Var.mo86749d());
                return;
            }
            ouq0.m169406z("[Slim] " + e1r0Var.f91663a.format(new Date()) + this.f91670a + " PKT [" + g2r0Var.m128649m() + Constants.SEPARATOR_COMMA + g2r0Var.m128648l() + Constants.AES_SUFFIX);
        }

        @Override // p153l.d2r0
        /* JADX INFO: renamed from: a */
        public boolean mo87539a(g2r0 g2r0Var) {
            return true;
        }
    }
}
