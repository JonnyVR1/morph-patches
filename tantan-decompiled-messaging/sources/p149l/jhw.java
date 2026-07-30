package p149l;

import android.app.Application;
import androidx.annotation.NonNull;
import com.cosmos.mdlog.MDLog;
import com.immomo.framework.storage.p039kv.C3750KV;
import com.immomo.mmutil.FileUtil;
import com.tencent.mmkv.MMKV;
import immomo.com.mklibrary.core.http.DefaultHttpRequesterImpl;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class jhw {

    /* JADX INFO: renamed from: f */
    private zsl f118024f;

    /* JADX INFO: renamed from: g */
    private vsl f118025g;

    /* JADX INFO: renamed from: h */
    private iiw f118026h;

    /* JADX INFO: renamed from: i */
    private boolean f118027i;

    /* JADX INFO: renamed from: j */
    private xwm f118028j;

    /* JADX INFO: renamed from: k */
    private p2m f118029k;

    /* JADX INFO: renamed from: m */
    private rhw f118031m;

    /* JADX INFO: renamed from: a */
    private boolean f118019a = false;

    /* JADX INFO: renamed from: b */
    private String f118020b = null;

    /* JADX INFO: renamed from: c */
    private String f118021c = null;

    /* JADX INFO: renamed from: d */
    private String f118022d = null;

    /* JADX INFO: renamed from: e */
    private String f118023e = "";

    /* JADX INFO: renamed from: l */
    private boolean f118030l = false;

    /* JADX INFO: renamed from: n */
    private boolean f118032n = false;

    /* JADX INFO: renamed from: l.jhw$b */
    public class C17776b extends AbstractC19844s4 {
        @Override // p149l.kul
        /* JADX INFO: renamed from: b */
        public String mo129122b() {
            return "momo-web";
        }
    }

    /* JADX INFO: renamed from: l.jhw$c */
    public class C17777c extends hnw.AbstractC17359d {
        public C17777c(boolean z) {
            super(z);
        }

        @Override // p149l.hnw.InterfaceC17358c
        /* JADX INFO: renamed from: b */
        public int mo98250b() {
            return MMKV.ExpireInHour;
        }

        @Override // p149l.hnw.InterfaceC17358c
        /* JADX INFO: renamed from: e */
        public boolean mo98253e() {
            return true;
        }

        @Override // p149l.hnw.AbstractC17359d
        /* JADX INFO: renamed from: f */
        public String mo132028f() {
            return ohw.m164472j() != null ? ohw.m164472j().getAbsolutePath() : super.mo132028f();
        }
    }

    /* JADX INFO: renamed from: l.jhw$d */
    public class C17778d implements fvl {
        public C17778d() {
        }

        @Override // p149l.fvl
        /* JADX INFO: renamed from: a */
        public boolean mo105189a(String str, Map<String, String> map, File file) {
            return false;
        }

        @Override // p149l.fvl
        /* JADX INFO: renamed from: b */
        public String mo105190b(String str, Map<String, String> map, byte[] bArr) {
            try {
                return jhw.this.f118025g.mo87148f(str, map, bArr);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m141597b(Application application, jhw jhwVar) {
        m141599f(application, jhwVar);
        shw.m184295o(application);
        shw.m184279C(jhwVar.f118027i);
        shw.m184298r(jhwVar.f118026h);
        if (jhwVar.f118031m == null) {
            jhwVar.f118031m = new vgf0();
        }
        shw.m184297q(jhwVar.f118031m);
        if (jhwVar.f118028j == null) {
            jhwVar.f118028j = new ugf0();
        }
        shw.m184296p(jhwVar.f118028j);
        if (jhwVar.f118029k == null) {
            jhwVar.f118029k = new kqd();
        }
        shw.m184299s(jhwVar.f118029k);
        shw.m184278B(null);
        shw.m184277A(jhwVar.f118030l);
        mxv.m156931f(jhwVar.f118019a);
        ohw.m164484v(jhwVar.f118020b);
        ohw.m164482t(jhwVar.f118021c);
        ohw.m164481s(jhwVar.f118022d);
        ohw.m164483u(jhwVar.f118023e);
        if (jhwVar.f118025g == null) {
            jhwVar.f118025g = new DefaultHttpRequesterImpl();
        }
        phw.m169153b().m169155c(jhwVar.f118025g);
        uhw.m193793e().m193801k(false);
        shw.f164659i = jhwVar.f118032n;
        qhw qhwVarM174602a = qhw.m174602a();
        if (jhwVar.f118024f == null) {
            jhwVar.f118024f = new lod();
        }
        qhwVarM174602a.m174603b(jhwVar.f118024f);
        m141598c(application, jhwVar);
    }

    /* JADX INFO: renamed from: c */
    private static void m141598c(Application application, jhw jhwVar) {
        gnw.m127191b(application, new hnw.C17356a().m132023e(jhwVar.f118019a).m132025g(jhwVar.new C17778d()).m132024f(new C17777c(true)).m132021c(new C17776b()).m132020b());
    }

    /* JADX INFO: renamed from: f */
    private static void m141599f(Application application, jhw jhwVar) {
        if (jhwVar.f118027i) {
            return;
        }
        if (ev0.m118233a() == null) {
            ev0.m118236d(application);
        }
        try {
            FileUtil.m18407d();
        } catch (Exception unused) {
            FileUtil.m18412i(FileUtil.StorageMode.INNER);
        }
        C3750KV.m18340g(application, new C17775a());
        if (jhwVar.f118019a) {
            MDLog.setDebugMode();
            MDLog.setLevel(0);
        }
    }

    /* JADX INFO: renamed from: d */
    public jhw m141600d(boolean z) {
        this.f118032n = z;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public jhw m141601e(boolean z) {
        this.f118027i = z;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public jhw m141602g(String str) {
        this.f118022d = str;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public jhw m141603h(boolean z) {
        this.f118030l = z;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public jhw m141604i(vsl vslVar) {
        this.f118025g = vslVar;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public jhw m141605j(@NonNull xwm xwmVar) {
        this.f118028j = xwmVar;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public jhw m141606k(String str) {
        this.f118021c = str;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public jhw m141607l(String str) {
        this.f118020b = str;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public jhw m141608m(iiw iiwVar) {
        this.f118026h = iiwVar;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public jhw m141609n(rhw rhwVar) {
        this.f118031m = rhwVar;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public jhw m141610o(@NonNull p2m p2mVar) {
        this.f118029k = p2mVar;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public jhw m141611p(boolean z) {
        this.f118019a = z;
        return this;
    }

    /* JADX INFO: renamed from: l.jhw$a */
    public class C17775a implements axq {
        @Override // p149l.axq
        /* JADX INFO: renamed from: a */
        public void mo99516a(String str, String str2, Throwable th) {
        }
    }
}
