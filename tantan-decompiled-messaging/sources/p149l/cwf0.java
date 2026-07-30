package p149l;

import android.text.TextUtils;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class cwf0 {

    /* JADX INFO: renamed from: a */
    public long f82786a;

    /* JADX INFO: renamed from: b */
    public long f82787b;

    /* JADX INFO: renamed from: c */
    public String f82788c;

    /* JADX INFO: renamed from: d */
    public o660 f82789d;

    /* JADX INFO: renamed from: e */
    public n3m f82790e;

    /* JADX INFO: renamed from: f */
    public boolean f82791f;

    /* JADX INFO: renamed from: l.cwf0$a */
    public class C16262a extends er2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f82792a;

        public C16262a(String str) {
            this.f82792a = str;
        }

        @Override // p149l.n3m
        public String pageId() {
            return this.f82792a;
        }
    }

    /* JADX INFO: renamed from: l.cwf0$b */
    public interface InterfaceC16263b {
        /* JADX INFO: renamed from: a */
        void mo109044a(String str);

        /* JADX INFO: renamed from: b */
        void mo109045b(String str);
    }

    public cwf0(n3m n3mVar) {
        m109038n(n3mVar, n3mVar.getClass().getName());
    }

    /* JADX INFO: renamed from: a */
    public final l3f m109025a() {
        l3f l3fVar = new l3f();
        l3fVar.f125886e = ((this.f82787b - this.f82786a) * 1.0d) / 1000.0d;
        l3fVar.f125885d = EventNameEnum.PAGE_DISAPPEAR;
        m109037m(l3fVar);
        return l3fVar;
    }

    /* JADX INFO: renamed from: b */
    public final l3f m109026b() {
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.PAGE_VIEW;
        l3fVar.f125896o = p660.m167646e();
        l3fVar.f125899r = p660.m167647f();
        m109037m(l3fVar);
        return l3fVar;
    }

    /* JADX INFO: renamed from: c */
    public void m109027c() {
        m109028d(this.f82790e.disableAutoPV());
    }

    /* JADX INFO: renamed from: d */
    public final void m109028d(boolean z) {
        if (z) {
            return;
        }
        p660.m167642a(this.f82789d);
    }

    /* JADX INFO: renamed from: e */
    public void m109029e() {
        m109030f(this.f82790e.disableAutoPV());
    }

    /* JADX INFO: renamed from: f */
    public final void m109030f(boolean z) {
        if (z) {
            return;
        }
        p660.m167650i(this.f82789d);
    }

    /* JADX INFO: renamed from: g */
    public void m109031g() {
        m109032h(this.f82790e.disableAutoPV());
    }

    /* JADX INFO: renamed from: h */
    public final void m109032h(boolean z) {
        if (z) {
            return;
        }
        this.f82787b = System.currentTimeMillis();
        if (TextUtils.isEmpty(this.f82788c) && zvf0.m220390l()) {
            sm80.m184942b(new Exception("callPDBeforePV"));
            psi0.m171156a("页面的PD在PV之前调用，logcat搜索callPDBeforePV可看具体调用栈");
        }
        InterfaceC16263b interfaceC16263bM220385g = zvf0.m220385g();
        if (interfaceC16263bM220385g != null) {
            interfaceC16263bM220385g.mo109045b(this.f82789d.m162820c());
        }
        zvf0.m220391m(m109025a());
        p660.m167651j(this.f82789d);
    }

    /* JADX INFO: renamed from: i */
    public void m109033i() {
        if (TextUtils.isEmpty(this.f82789d.m162820c())) {
            return;
        }
        m109028d(false);
    }

    /* JADX INFO: renamed from: j */
    public void m109034j() {
        if (TextUtils.isEmpty(this.f82789d.m162820c())) {
            return;
        }
        m109030f(false);
    }

    /* JADX INFO: renamed from: k */
    public void m109035k() {
        if (TextUtils.isEmpty(this.f82789d.m162820c())) {
            return;
        }
        m109032h(false);
    }

    /* JADX INFO: renamed from: l */
    public void m109036l() {
        if (TextUtils.isEmpty(this.f82789d.m162820c())) {
            return;
        }
        this.f82791f = true;
        m109043s(false);
    }

    /* JADX INFO: renamed from: m */
    public final void m109037m(l3f l3fVar) {
        l3fVar.f125895n = this.f82789d.m162820c();
        l3fVar.f125897p = this.f82789d.m162818a();
        l3fVar.f125898q = this.f82788c;
        l3fVar.f125883b = (this.f82790e.disableAutoPV() || this.f82791f) ? false : true;
        l3fVar.f125882a = 1;
        o660 o660Var = this.f82789d;
        if (o660Var != null) {
            l3fVar.f125904w = o660Var.m162819b();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m109038n(n3m n3mVar, String str) {
        if (n3mVar == null) {
            return;
        }
        if (TextUtils.isEmpty(n3mVar.pageId())) {
            sm80.m184942b(new Exception("class：" + str + " pageId is Empty"));
        }
        this.f82790e = n3mVar;
        this.f82789d = new o660(n3mVar.pageId(), str);
    }

    /* JADX INFO: renamed from: o */
    public void m109039o(JSONObject jSONObject) {
        this.f82789d.m162824g(jSONObject);
    }

    /* JADX INFO: renamed from: p */
    public void m109040p(j760... j760VarArr) {
        this.f82789d.m162824g(zvf0.m220380b(j760VarArr));
    }

    /* JADX INFO: renamed from: q */
    public void m109041q(String str) {
        this.f82789d.m162825h(str);
    }

    /* JADX INFO: renamed from: r */
    public void m109042r() {
        this.f82791f = false;
        m109043s(this.f82790e.disableAutoPV());
    }

    /* JADX INFO: renamed from: s */
    public final void m109043s(boolean z) {
        if (z) {
            return;
        }
        if (!p660.f147372a.contains(this.f82789d)) {
            psi0.m171156a("startPage应该在createPage之后调用");
        }
        String str = this.f82788c;
        String string = UUID.randomUUID().toString();
        this.f82788c = string;
        p660.m167649h(str, string, this.f82789d.m162820c());
        this.f82786a = System.currentTimeMillis();
        InterfaceC16263b interfaceC16263bM220385g = zvf0.m220385g();
        if (interfaceC16263bM220385g != null) {
            interfaceC16263bM220385g.mo109044a(this.f82789d.m162820c());
        }
        zvf0.m220391m(m109026b());
        p660.m167643b(this.f82789d);
        p660.m167653l(this.f82789d);
    }

    public cwf0(String str, String str2) {
        m109038n(new C16262a(str), str2);
    }

    public cwf0(er2 er2Var, String str) {
        m109038n(er2Var, str);
    }
}
