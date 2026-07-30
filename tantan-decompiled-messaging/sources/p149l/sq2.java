package p149l;

import android.text.TextUtils;
import com.immomo.medialog.api.Constant$HttpMethod;
import com.immomo.medialog.api.ParamsMap;
import com.immomo.medialog.thread.ThreadType;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p149l.se2;

/* JADX INFO: loaded from: classes7.dex */
public abstract class sq2<T extends se2> {

    /* JADX INFO: renamed from: k */
    protected static HashMap<String, WeakReference<sq2>> f165911k = new HashMap<>();

    /* JADX INFO: renamed from: c */
    protected wtc0 f165914c;

    /* JADX INFO: renamed from: d */
    protected ssl f165915d;

    /* JADX INFO: renamed from: e */
    protected boolean f165916e;

    /* JADX INFO: renamed from: h */
    protected syi[] f165919h;

    /* JADX INFO: renamed from: j */
    private lt0 f165921j;

    /* JADX INFO: renamed from: a */
    protected Constant$HttpMethod f165912a = Constant$HttpMethod.POST;

    /* JADX INFO: renamed from: b */
    protected String f165913b = "";

    /* JADX INFO: renamed from: f */
    protected Map<String, String> f165917f = new ParamsMap();

    /* JADX INFO: renamed from: g */
    protected Map<String, String> f165918g = new ParamsMap();

    /* JADX INFO: renamed from: i */
    private String f165920i = getClass().getSimpleName();

    /* JADX INFO: renamed from: l.sq2$a */
    public class RunnableC20010a implements Runnable {
        public RunnableC20010a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            sq2.this.m185436e();
        }
    }

    /* JADX INFO: renamed from: l.sq2$b */
    public class RunnableC20011b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ zuc0 f165923a;

        public RunnableC20011b(zuc0 zuc0Var) {
            this.f165923a = zuc0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public void run() {
            zuc0 zuc0Var = this.f165923a;
            if (zuc0Var == null) {
                sq2.this.m185444n(-1, "未知错误", "未知错误");
            } else {
                boolean zM220224e = zuc0Var.m220224e();
                sq2 sq2Var = sq2.this;
                if (zM220224e) {
                    sq2Var.m185447q(this.f165923a.m220222c(), (se2) this.f165923a.m220220a(), this.f165923a.m220221b());
                } else {
                    sq2Var.m185444n(this.f165923a.m220222c(), this.f165923a.m220223d(), this.f165923a.m220221b());
                }
            }
            sq2.this.m185445o();
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m185431m(int i) {
        return i == 200 || i == 0;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m185432a() {
        WeakReference<sq2> weakReference = f165911k.get(getClass().getName());
        if (weakReference != null && weakReference.get() == this) {
            f165911k.remove(getClass().getName());
        }
    }

    /* JADX INFO: renamed from: b */
    public ssl m185433b() {
        if (this.f165915d != null) {
            y9g0.m213537a("one instance do execute more than once");
            return null;
        }
        tx40 tx40Var = new tx40(this.f165913b, this.f165918g, this.f165917f, this.f165919h, this.f165921j);
        this.f165915d = tx40Var;
        return tx40Var;
    }

    /* JADX INFO: renamed from: c */
    public ssl.C20019a m185434c() {
        this.f165916e = true;
        m185443l();
        ssl.C20019a c20019aMo185750a = this.f165912a == Constant$HttpMethod.POST ? m185433b().mo185750a() : m185433b().mo185751b();
        m185437f();
        return c20019aMo185750a;
    }

    /* JADX INFO: renamed from: d */
    public void m185435d() {
        this.f165916e = true;
        a800.m95324a(ThreadType.High, new RunnableC20010a());
    }

    /* JADX INFO: renamed from: e */
    public zuc0<T> m185436e() {
        zuc0<T> zuc0VarM185442k = m185442k(m185434c());
        m185446p(zuc0VarM185442k);
        m185437f();
        return zuc0VarM185442k;
    }

    /* JADX INFO: renamed from: f */
    public void m185437f() {
        WeakReference<sq2> weakReference = f165911k.get(getClass().getName());
        if (weakReference != null && weakReference.get() == this) {
            m185432a();
        }
        this.f165916e = false;
    }

    /* JADX INFO: renamed from: g */
    public void m185438g(wtc0<T> wtc0Var) {
        this.f165914c = wtc0Var;
        m185435d();
    }

    /* JADX INFO: renamed from: h */
    public zuc0<T> m185439h() {
        return m185436e();
    }

    /* JADX INFO: renamed from: i */
    public Constant$HttpMethod m185440i() {
        return this.f165912a;
    }

    /* JADX INFO: renamed from: j */
    public abstract String mo185441j();

    /* JADX INFO: renamed from: k */
    public zuc0<T> m185442k(ssl.C20019a c20019a) {
        zuc0<T> zuc0Var = new zuc0<>();
        if (!c20019a.m185755d()) {
            zuc0Var.m220227h(c20019a.m185753b());
            zuc0Var.m220228i(c20019a.m185754c());
            return zuc0Var;
        }
        if (TextUtils.isEmpty(c20019a.m185752a())) {
            zuc0Var.m220227h(-3);
            zuc0Var.m220228i("服务器数据异常");
            return zuc0Var;
        }
        try {
            zuc0Var.m220226g(c20019a.m185752a());
            JSONObject jSONObject = new JSONObject(c20019a.m185752a());
            if (!jSONObject.has("ec")) {
                zuc0Var.m220227h(-3);
                zuc0Var.m220228i("服务器数据异常");
                return zuc0Var;
            }
            zuc0Var.m220227h(jSONObject.optInt("ec"));
            zuc0Var.m220228i(jSONObject.optString("em", ""));
            zuc0Var.m220225f(null);
            return zuc0Var;
        } catch (Exception e) {
            zuc0Var.m220227h(-3);
            zuc0Var.m220228i("服务器数据异常");
            wxv.m206039b(this.f165920i, e.getMessage());
            return zuc0Var;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m185443l() {
        this.f165913b = mo185441j();
        this.f165912a = m185440i();
    }

    /* JADX INFO: renamed from: n */
    public void m185444n(int i, String str, String str2) {
        wtc0 wtc0Var = this.f165914c;
        if (wtc0Var != null) {
            wtc0Var.onError(i, str, str2);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m185445o() {
        wtc0 wtc0Var = this.f165914c;
        if (wtc0Var != null) {
            wtc0Var.onFinish();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m185446p(zuc0<T> zuc0Var) {
        wxv.m206038a(this.f165920i, this + ", perform response, ec:" + zuc0Var.m220222c());
        if (this.f165914c == null) {
            return;
        }
        npw.m160542a(new RunnableC20011b(zuc0Var));
    }

    /* JADX INFO: renamed from: q */
    public void m185447q(int i, T t, String str) {
        wtc0 wtc0Var = this.f165914c;
        if (wtc0Var != null) {
            wtc0Var.onSuccess(i, t, str);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m185448r(lt0 lt0Var) {
        this.f165921j = lt0Var;
    }

    public String toString() {
        return "Http<" + hashCode() + ">, url:" + this.f165913b;
    }
}
