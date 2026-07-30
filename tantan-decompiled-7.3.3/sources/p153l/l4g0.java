package p153l;

import android.text.TextUtils;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class l4g0 {

    /* JADX INFO: renamed from: a */
    public long f129972a;

    /* JADX INFO: renamed from: b */
    public long f129973b;

    /* JADX INFO: renamed from: c */
    public String f129974c;

    /* JADX INFO: renamed from: d */
    public ue60 f129975d;

    /* JADX INFO: renamed from: e */
    public e6m f129976e;

    /* JADX INFO: renamed from: f */
    public boolean f129977f;

    /* JADX INFO: renamed from: l.l4g0$a */
    public class C18344a extends ur2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f129978a;

        public C18344a(String str) {
            this.f129978a = str;
        }

        @Override // p153l.e6m
        public String pageId() {
            return this.f129978a;
        }
    }

    /* JADX INFO: renamed from: l.l4g0$b */
    public interface InterfaceC18345b {
        /* JADX INFO: renamed from: a */
        void mo152785a(String str);

        /* JADX INFO: renamed from: b */
        void mo152786b(String str);
    }

    public l4g0(e6m e6mVar) {
        m152779n(e6mVar, e6mVar.getClass().getName());
    }

    /* JADX INFO: renamed from: a */
    public final q4f m152766a() {
        q4f q4fVar = new q4f();
        q4fVar.f155567e = ((this.f129973b - this.f129972a) * 1.0d) / 1000.0d;
        q4fVar.f155566d = EventNameEnum.PAGE_DISAPPEAR;
        m152778m(q4fVar);
        return q4fVar;
    }

    /* JADX INFO: renamed from: b */
    public final q4f m152767b() {
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.PAGE_VIEW;
        q4fVar.f155577o = ve60.m201038e();
        q4fVar.f155580r = ve60.m201039f();
        m152778m(q4fVar);
        return q4fVar;
    }

    /* JADX INFO: renamed from: c */
    public void m152768c() {
        m152769d(this.f129976e.disableAutoPV());
    }

    /* JADX INFO: renamed from: d */
    public final void m152769d(boolean z) {
        if (z) {
            return;
        }
        ve60.m201034a(this.f129975d);
    }

    /* JADX INFO: renamed from: e */
    public void m152770e() {
        m152771f(this.f129976e.disableAutoPV());
    }

    /* JADX INFO: renamed from: f */
    public final void m152771f(boolean z) {
        if (z) {
            return;
        }
        ve60.m201042i(this.f129975d);
    }

    /* JADX INFO: renamed from: g */
    public void m152772g() {
        m152773h(this.f129976e.disableAutoPV());
    }

    /* JADX INFO: renamed from: h */
    public final void m152773h(boolean z) {
        if (z) {
            return;
        }
        this.f129973b = System.currentTimeMillis();
        if (TextUtils.isEmpty(this.f129974c) && i4g0.m138514l()) {
            wu80.m207938b(new Exception("callPDBeforePV"));
            s1j0.m184051a("页面的PD在PV之前调用，logcat搜索callPDBeforePV可看具体调用栈");
        }
        InterfaceC18345b interfaceC18345bM138509g = i4g0.m138509g();
        if (interfaceC18345bM138509g != null) {
            interfaceC18345bM138509g.mo152786b(this.f129975d.m195739c());
        }
        i4g0.m138515m(m152766a());
        ve60.m201043j(this.f129975d);
    }

    /* JADX INFO: renamed from: i */
    public void m152774i() {
        if (TextUtils.isEmpty(this.f129975d.m195739c())) {
            return;
        }
        m152769d(false);
    }

    /* JADX INFO: renamed from: j */
    public void m152775j() {
        if (TextUtils.isEmpty(this.f129975d.m195739c())) {
            return;
        }
        m152771f(false);
    }

    /* JADX INFO: renamed from: k */
    public void m152776k() {
        if (TextUtils.isEmpty(this.f129975d.m195739c())) {
            return;
        }
        m152773h(false);
    }

    /* JADX INFO: renamed from: l */
    public void m152777l() {
        if (TextUtils.isEmpty(this.f129975d.m195739c())) {
            return;
        }
        this.f129977f = true;
        m152784s(false);
    }

    /* JADX INFO: renamed from: m */
    public final void m152778m(q4f q4fVar) {
        q4fVar.f155576n = this.f129975d.m195739c();
        q4fVar.f155578p = this.f129975d.m195737a();
        q4fVar.f155579q = this.f129974c;
        q4fVar.f155564b = (this.f129976e.disableAutoPV() || this.f129977f) ? false : true;
        q4fVar.f155563a = 1;
        ue60 ue60Var = this.f129975d;
        if (ue60Var != null) {
            q4fVar.f155585w = ue60Var.m195738b();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m152779n(e6m e6mVar, String str) {
        if (e6mVar == null) {
            return;
        }
        if (TextUtils.isEmpty(e6mVar.pageId())) {
            wu80.m207938b(new Exception("class：" + str + " pageId is Empty"));
        }
        this.f129976e = e6mVar;
        this.f129975d = new ue60(e6mVar.pageId(), str);
    }

    /* JADX INFO: renamed from: o */
    public void m152780o(JSONObject jSONObject) {
        this.f129975d.m195743g(jSONObject);
    }

    /* JADX INFO: renamed from: p */
    public void m152781p(pf60... pf60VarArr) {
        this.f129975d.m195743g(i4g0.m138504b(pf60VarArr));
    }

    /* JADX INFO: renamed from: q */
    public void m152782q(String str) {
        this.f129975d.m195744h(str);
    }

    /* JADX INFO: renamed from: r */
    public void m152783r() {
        this.f129977f = false;
        m152784s(this.f129976e.disableAutoPV());
    }

    /* JADX INFO: renamed from: s */
    public final void m152784s(boolean z) {
        if (z) {
            return;
        }
        if (!ve60.f183704a.contains(this.f129975d)) {
            s1j0.m184051a("startPage应该在createPage之后调用");
        }
        String str = this.f129974c;
        String string = UUID.randomUUID().toString();
        this.f129974c = string;
        ve60.m201041h(str, string, this.f129975d.m195739c());
        this.f129972a = System.currentTimeMillis();
        InterfaceC18345b interfaceC18345bM138509g = i4g0.m138509g();
        if (interfaceC18345bM138509g != null) {
            interfaceC18345bM138509g.mo152785a(this.f129975d.m195739c());
        }
        i4g0.m138515m(m152767b());
        ve60.m201035b(this.f129975d);
        ve60.m201045l(this.f129975d);
    }

    public l4g0(String str, String str2) {
        m152779n(new C18344a(str), str2);
    }

    public l4g0(ur2 ur2Var, String str) {
        m152779n(ur2Var, str);
    }
}
