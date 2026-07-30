package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.DbLinks;
import com.tantanapp.common.utils.NullChecker;
import java.net.URLEncoder;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class lie extends vj2<mie> {

    /* JADX INFO: renamed from: b */
    public kcg0 f132212b;

    /* JADX INFO: renamed from: c */
    public kcg0 f132213c;

    /* JADX INFO: renamed from: d */
    public DbLinks f132214d;

    /* JADX INFO: renamed from: e */
    public DbLinks f132215e;

    /* JADX INFO: renamed from: f */
    public boolean f132216f;

    public lie(ner nerVar) {
        super(nerVar);
        this.f132214d = null;
        this.f132215e = null;
        this.f132216f = false;
        this.f184344a = URLEncoder.encode(Converter.dateToApiTimeString(pzi0.m174454o()));
    }

    @Override // p153l.vj2
    /* JADX INFO: renamed from: A0 */
    public void mo154362A0(boolean z) {
        psd0.m173633z(this.f132212b);
        if (!NullChecker.m82486a(this.f132214d) || NullChecker.m82486a(this.f132214d.links.next)) {
            this.f132212b = duringCreated((C22421c) CoreModule.f18264c.f20420r0.m35145r5(this.f184344a, this.f132214d, "").map(new qcj() { // from class: l.fie
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f99180a.m154367O0((pf60) obj);
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.gie
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f104485a.m154368P0((List) obj);
                }
            }, new y20() { // from class: l.hie
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f110017a.m154369Q0((Throwable) obj);
                }
            }));
        }
    }

    @Override // p153l.vj2
    /* JADX INFO: renamed from: C0 */
    public void mo154363C0() {
        DbLinks dbLinks;
        if (this.f132216f || (dbLinks = this.f132214d) == null || !NullChecker.m82486a(dbLinks.links.next)) {
            return;
        }
        this.f132216f = true;
        mo154362A0(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ List m154364J0(pf60 pf60Var) {
        F f = pf60Var.f152156a;
        this.f132215e = ((vg60) f).f184002b;
        return m201459o0((vg60) f, (List) pf60Var.f152157b);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m154365L0(List list) {
        ((mie) this.viewModel).m158507l(list);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m154366N0(Throwable th) {
        ((mie) this.viewModel).m158506k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ List m154367O0(pf60 pf60Var) {
        F f = pf60Var.f152156a;
        this.f132214d = ((vg60) f).f184002b;
        return m201459o0((vg60) f, (List) pf60Var.f152157b);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m154368P0(List list) {
        this.f132216f = false;
        ((mie) this.viewModel).m158507l(list);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m154369Q0(Throwable th) {
        ((mie) this.viewModel).m158506k();
        this.f132216f = false;
    }

    @Override // p153l.vj2, p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
    }

    @Override // p153l.vj2
    /* JADX INFO: renamed from: z0 */
    public void mo154370z0() {
        psd0.m173633z(this.f132213c);
        this.f132213c = duringCreated((C22421c) CoreModule.f18264c.f20420r0.m35149t5(this.f184344a, this.f132215e, "").map(new qcj() { // from class: l.iie
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f115086a.m154364J0((pf60) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.jie
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121076a.m154365L0((List) obj);
            }
        }, new y20() { // from class: l.kie
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f126981a.m154366N0((Throwable) obj);
            }
        }));
    }
}
