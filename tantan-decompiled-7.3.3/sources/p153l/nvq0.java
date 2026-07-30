package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.C14892gj;
import com.xiaomi.push.EnumC14893gk;
import com.xiaomi.push.service.C14985ah;
import com.xiaomi.push.service.C15003az;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class nvq0 {

    /* JADX INFO: renamed from: k */
    private static volatile nvq0 f143833k;

    /* JADX INFO: renamed from: e */
    private Context f143838e;

    /* JADX INFO: renamed from: f */
    private String f143839f;

    /* JADX INFO: renamed from: g */
    private String f143840g;

    /* JADX INFO: renamed from: a */
    private final String f143834a = "push_stat_sp";

    /* JADX INFO: renamed from: b */
    private final String f143835b = "upload_time";

    /* JADX INFO: renamed from: c */
    private final String f143836c = "delete_time";

    /* JADX INFO: renamed from: d */
    private final String f143837d = "check_time";

    /* JADX INFO: renamed from: h */
    private tsq0.AbstractRunnableC20394c f143841h = new C18959a();

    /* JADX INFO: renamed from: i */
    private tsq0.AbstractRunnableC20394c f143842i = new C18960b();

    /* JADX INFO: renamed from: j */
    private tsq0.AbstractRunnableC20394c f143843j = new C18961c();

    /* JADX INFO: renamed from: l.nvq0$a */
    public class C18959a extends tsq0.AbstractRunnableC20394c {
        public C18959a() {
        }

        @Override // p153l.tsq0.AbstractRunnableC20394c
        /* JADX INFO: renamed from: a */
        public String mo87798a() {
            return "10052";
        }

        @Override // java.lang.Runnable
        public void run() {
            ouq0.m169406z("exec== mUploadJob");
            nvq0.m164914e(nvq0.this);
        }
    }

    /* JADX INFO: renamed from: l.nvq0$b */
    public class C18960b extends tsq0.AbstractRunnableC20394c {
        public C18960b() {
        }

        @Override // p153l.tsq0.AbstractRunnableC20394c
        /* JADX INFO: renamed from: a */
        public String mo87798a() {
            return "10054";
        }

        @Override // java.lang.Runnable
        public void run() {
            ouq0.m169406z("exec== DbSizeControlJob");
            vvq0.m203026c(nvq0.this.f143838e).m203028d(new pvq0(nvq0.this.m164918n(), new WeakReference(nvq0.this.f143838e)));
            nvq0.this.m164917m("check_time");
        }
    }

    /* JADX INFO: renamed from: l.nvq0$c */
    public class C18961c extends tsq0.AbstractRunnableC20394c {
        public C18961c() {
        }

        @Override // p153l.tsq0.AbstractRunnableC20394c
        /* JADX INFO: renamed from: a */
        public String mo87798a() {
            return "10053";
        }

        @Override // java.lang.Runnable
        public void run() {
            nvq0.m164914e(nvq0.this);
        }
    }

    private nvq0(Context context) {
        this.f143838e = context;
    }

    /* JADX INFO: renamed from: d */
    public static nvq0 m164913d(Context context) {
        if (f143833k == null) {
            synchronized (nvq0.class) {
                try {
                    if (f143833k == null) {
                        f143833k = new nvq0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f143833k;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ wvq0 m164914e(nvq0 nvq0Var) {
        nvq0Var.getClass();
        return null;
    }

    /* JADX INFO: renamed from: k */
    private boolean m164916k() {
        return C14985ah.m87648a(this.f143838e).m87660a(EnumC14893gk.StatDataSwitch.m86817a(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m164917m(String str) {
        SharedPreferences.Editor editorEdit = this.f143838e.getSharedPreferences("push_stat_sp", 0).edit();
        editorEdit.putLong(str, System.currentTimeMillis());
        n5r0.m161732a(editorEdit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public String m164918n() {
        return this.f143838e.getDatabasePath(ovq0.f149296a).getAbsolutePath();
    }

    /* JADX INFO: renamed from: b */
    public String m164919b() {
        return this.f143839f;
    }

    /* JADX INFO: renamed from: f */
    public void m164920f(C14892gj c14892gj) {
        if (m164916k() && C15003az.m87774a(c14892gj.m86807e())) {
            m164923j(tvq0.m192831i(this.f143838e, m164918n(), c14892gj));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m164921g(String str) {
        if (m164916k() && !TextUtils.isEmpty(str)) {
            m164920f(xvq0.m213258a(this.f143838e, str));
        }
    }

    /* JADX INFO: renamed from: j */
    public void m164923j(vvq0.AbstractRunnableC20940a abstractRunnableC20940a) {
        vvq0.m203026c(this.f143838e).m203029e(abstractRunnableC20940a);
    }

    /* JADX INFO: renamed from: l */
    public String m164924l() {
        return this.f143840g;
    }

    /* JADX INFO: renamed from: h */
    public void m164922h(String str, String str2, Boolean bool) {
    }
}
