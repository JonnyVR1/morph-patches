package p153l;

import android.text.TextUtils;
import com.immomo.medialog.api.Constant$HttpMethod;
import com.immomo.medialog.api.ParamsMap;
import com.immomo.medialog.thread.ThreadType;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p153l.ze2;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ir2<T extends ze2> {

    /* JADX INFO: renamed from: k */
    protected static HashMap<String, WeakReference<ir2>> f116488k = new HashMap<>();

    /* JADX INFO: renamed from: c */
    protected b2d0 f116491c;

    /* JADX INFO: renamed from: d */
    protected fvl f116492d;

    /* JADX INFO: renamed from: e */
    protected boolean f116493e;

    /* JADX INFO: renamed from: h */
    protected n1j[] f116496h;

    /* JADX INFO: renamed from: j */
    private rt0 f116498j;

    /* JADX INFO: renamed from: a */
    protected Constant$HttpMethod f116489a = Constant$HttpMethod.POST;

    /* JADX INFO: renamed from: b */
    protected String f116490b = "";

    /* JADX INFO: renamed from: f */
    protected Map<String, String> f116494f = new ParamsMap();

    /* JADX INFO: renamed from: g */
    protected Map<String, String> f116495g = new ParamsMap();

    /* JADX INFO: renamed from: i */
    private String f116497i = getClass().getSimpleName();

    /* JADX INFO: renamed from: l.ir2$a */
    public class RunnableC17779a implements Runnable {
        public RunnableC17779a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ir2.this.m141753e();
        }
    }

    /* JADX INFO: renamed from: l.ir2$b */
    public class RunnableC17780b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ c3d0 f116500a;

        public RunnableC17780b(c3d0 c3d0Var) {
            this.f116500a = c3d0Var;
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
            c3d0 c3d0Var = this.f116500a;
            if (c3d0Var == null) {
                ir2.this.m141760n(-1, "未知错误", "未知错误");
            } else {
                boolean zM107776e = c3d0Var.m107776e();
                ir2 ir2Var = ir2.this;
                if (zM107776e) {
                    ir2Var.m141763q(this.f116500a.m107774c(), (ze2) this.f116500a.m107772a(), this.f116500a.m107773b());
                } else {
                    ir2Var.m141760n(this.f116500a.m107774c(), this.f116500a.m107775d(), this.f116500a.m107773b());
                }
            }
            ir2.this.m141761o();
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m141748m(int i) {
        return i == 200 || i == 0;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m141749a() {
        WeakReference<ir2> weakReference = f116488k.get(getClass().getName());
        if (weakReference != null && weakReference.get() == this) {
            f116488k.remove(getClass().getName());
        }
    }

    /* JADX INFO: renamed from: b */
    public fvl m141750b() {
        if (this.f116492d != null) {
            gig0.m130323a("one instance do execute more than once");
            return null;
        }
        i650 i650Var = new i650(this.f116490b, this.f116495g, this.f116494f, this.f116496h, this.f116498j);
        this.f116492d = i650Var;
        return i650Var;
    }

    /* JADX INFO: renamed from: c */
    public fvl.C17084a m141751c() {
        this.f116493e = true;
        m141759l();
        fvl.C17084a c17084aMo127670a = this.f116489a == Constant$HttpMethod.POST ? m141750b().mo127670a() : m141750b().mo127671b();
        m141754f();
        return c17084aMo127670a;
    }

    /* JADX INFO: renamed from: d */
    public void m141752d() {
        this.f116493e = true;
        jg00.m144744a(ThreadType.High, new RunnableC17779a());
    }

    /* JADX INFO: renamed from: e */
    public c3d0<T> m141753e() {
        c3d0<T> c3d0VarM141758k = m141758k(m141751c());
        m141762p(c3d0VarM141758k);
        m141754f();
        return c3d0VarM141758k;
    }

    /* JADX INFO: renamed from: f */
    public void m141754f() {
        WeakReference<ir2> weakReference = f116488k.get(getClass().getName());
        if (weakReference != null && weakReference.get() == this) {
            m141749a();
        }
        this.f116493e = false;
    }

    /* JADX INFO: renamed from: g */
    public void m141755g(b2d0<T> b2d0Var) {
        this.f116491c = b2d0Var;
        m141752d();
    }

    /* JADX INFO: renamed from: h */
    public c3d0<T> m141756h() {
        return m141753e();
    }

    /* JADX INFO: renamed from: i */
    public Constant$HttpMethod m141757i() {
        return this.f116489a;
    }

    /* JADX INFO: renamed from: j */
    public abstract String mo97273j();

    /* JADX INFO: renamed from: k */
    public c3d0<T> m141758k(fvl.C17084a c17084a) {
        c3d0<T> c3d0Var = new c3d0<>();
        if (!c17084a.m127675d()) {
            c3d0Var.m107779h(c17084a.m127673b());
            c3d0Var.m107780i(c17084a.m127674c());
            return c3d0Var;
        }
        if (TextUtils.isEmpty(c17084a.m127672a())) {
            c3d0Var.m107779h(-3);
            c3d0Var.m107780i("服务器数据异常");
            return c3d0Var;
        }
        try {
            c3d0Var.m107778g(c17084a.m127672a());
            JSONObject jSONObject = new JSONObject(c17084a.m127672a());
            if (!jSONObject.has("ec")) {
                c3d0Var.m107779h(-3);
                c3d0Var.m107780i("服务器数据异常");
                return c3d0Var;
            }
            c3d0Var.m107779h(jSONObject.optInt("ec"));
            c3d0Var.m107780i(jSONObject.optString("em", ""));
            c3d0Var.m107777f(null);
            return c3d0Var;
        } catch (Exception e) {
            c3d0Var.m107779h(-3);
            c3d0Var.m107780i("服务器数据异常");
            tzv.m193744b(this.f116497i, e.getMessage());
            return c3d0Var;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m141759l() {
        this.f116490b = mo97273j();
        this.f116489a = m141757i();
    }

    /* JADX INFO: renamed from: n */
    public void m141760n(int i, String str, String str2) {
        b2d0 b2d0Var = this.f116491c;
        if (b2d0Var != null) {
            b2d0Var.onError(i, str, str2);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m141761o() {
        b2d0 b2d0Var = this.f116491c;
        if (b2d0Var != null) {
            b2d0Var.onFinish();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m141762p(c3d0<T> c3d0Var) {
        tzv.m193743a(this.f116497i, this + ", perform response, ec:" + c3d0Var.m107774c());
        if (this.f116491c == null) {
            return;
        }
        msw.m159941a(new RunnableC17780b(c3d0Var));
    }

    /* JADX INFO: renamed from: q */
    public void m141763q(int i, T t, String str) {
        b2d0 b2d0Var = this.f116491c;
        if (b2d0Var != null) {
            b2d0Var.onSuccess(i, t, str);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m141764r(rt0 rt0Var) {
        this.f116498j = rt0Var;
    }

    public String toString() {
        return "Http<" + hashCode() + ">, url:" + this.f116490b;
    }
}
