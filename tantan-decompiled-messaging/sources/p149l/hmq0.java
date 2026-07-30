package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.C14744gj;
import com.xiaomi.push.EnumC14745gk;
import com.xiaomi.push.service.C14837ah;
import com.xiaomi.push.service.C14855az;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class hmq0 {

    /* JADX INFO: renamed from: k */
    private static volatile hmq0 f108450k;

    /* JADX INFO: renamed from: e */
    private Context f108455e;

    /* JADX INFO: renamed from: f */
    private String f108456f;

    /* JADX INFO: renamed from: g */
    private String f108457g;

    /* JADX INFO: renamed from: a */
    private final String f108451a = "push_stat_sp";

    /* JADX INFO: renamed from: b */
    private final String f108452b = "upload_time";

    /* JADX INFO: renamed from: c */
    private final String f108453c = "delete_time";

    /* JADX INFO: renamed from: d */
    private final String f108454d = "check_time";

    /* JADX INFO: renamed from: h */
    private njq0.AbstractRunnableC18717c f108458h = new C17339a();

    /* JADX INFO: renamed from: i */
    private njq0.AbstractRunnableC18717c f108459i = new C17340b();

    /* JADX INFO: renamed from: j */
    private njq0.AbstractRunnableC18717c f108460j = new C17341c();

    /* JADX INFO: renamed from: l.hmq0$a */
    public class C17339a extends njq0.AbstractRunnableC18717c {
        public C17339a() {
        }

        @Override // p149l.njq0.AbstractRunnableC18717c
        /* JADX INFO: renamed from: a */
        public String mo86627a() {
            return "10052";
        }

        @Override // java.lang.Runnable
        public void run() {
            ilq0.m137053z("exec== mUploadJob");
            hmq0.m131743e(hmq0.this);
        }
    }

    /* JADX INFO: renamed from: l.hmq0$b */
    public class C17340b extends njq0.AbstractRunnableC18717c {
        public C17340b() {
        }

        @Override // p149l.njq0.AbstractRunnableC18717c
        /* JADX INFO: renamed from: a */
        public String mo86627a() {
            return "10054";
        }

        @Override // java.lang.Runnable
        public void run() {
            ilq0.m137053z("exec== DbSizeControlJob");
            pmq0.m170364c(hmq0.this.f108455e).m170366d(new jmq0(hmq0.this.m131747n(), new WeakReference(hmq0.this.f108455e)));
            hmq0.this.m131746m("check_time");
        }
    }

    /* JADX INFO: renamed from: l.hmq0$c */
    public class C17341c extends njq0.AbstractRunnableC18717c {
        public C17341c() {
        }

        @Override // p149l.njq0.AbstractRunnableC18717c
        /* JADX INFO: renamed from: a */
        public String mo86627a() {
            return "10053";
        }

        @Override // java.lang.Runnable
        public void run() {
            hmq0.m131743e(hmq0.this);
        }
    }

    private hmq0(Context context) {
        this.f108455e = context;
    }

    /* JADX INFO: renamed from: d */
    public static hmq0 m131742d(Context context) {
        if (f108450k == null) {
            synchronized (hmq0.class) {
                try {
                    if (f108450k == null) {
                        f108450k = new hmq0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f108450k;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ qmq0 m131743e(hmq0 hmq0Var) {
        hmq0Var.getClass();
        return null;
    }

    /* JADX INFO: renamed from: k */
    private boolean m131745k() {
        return C14837ah.m86477a(this.f108455e).m86489a(EnumC14745gk.StatDataSwitch.m85646a(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m131746m(String str) {
        SharedPreferences.Editor editorEdit = this.f108455e.getSharedPreferences("push_stat_sp", 0).edit();
        editorEdit.putLong(str, System.currentTimeMillis());
        hwq0.m133262a(editorEdit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public String m131747n() {
        return this.f108455e.getDatabasePath(imq0.f113954a).getAbsolutePath();
    }

    /* JADX INFO: renamed from: b */
    public String m131748b() {
        return this.f108456f;
    }

    /* JADX INFO: renamed from: f */
    public void m131749f(C14744gj c14744gj) {
        if (m131745k() && C14855az.m86603a(c14744gj.m85636e())) {
            m131752j(nmq0.m160154i(this.f108455e, m131747n(), c14744gj));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m131750g(String str) {
        if (m131745k() && !TextUtils.isEmpty(str)) {
            m131749f(rmq0.m180045a(this.f108455e, str));
        }
    }

    /* JADX INFO: renamed from: j */
    public void m131752j(pmq0.AbstractRunnableC19283a abstractRunnableC19283a) {
        pmq0.m170364c(this.f108455e).m170367e(abstractRunnableC19283a);
    }

    /* JADX INFO: renamed from: l */
    public String m131753l() {
        return this.f108457g;
    }

    /* JADX INFO: renamed from: h */
    public void m131751h(String str, String str2, Boolean bool) {
    }
}
