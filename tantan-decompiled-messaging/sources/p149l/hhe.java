package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.DbLinks;
import com.tantanapp.common.utils.NullChecker;
import java.net.URLEncoder;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class hhe extends nj2<ihe> {

    /* JADX INFO: renamed from: b */
    public c4g0 f107712b;

    /* JADX INFO: renamed from: c */
    public c4g0 f107713c;

    /* JADX INFO: renamed from: d */
    public DbLinks f107714d;

    /* JADX INFO: renamed from: e */
    public DbLinks f107715e;

    /* JADX INFO: renamed from: f */
    public boolean f107716f;

    public hhe(mcr mcrVar) {
        super(mcrVar);
        this.f107714d = null;
        this.f107715e = null;
        this.f107716f = false;
        this.f139172a = URLEncoder.encode(Converter.dateToApiTimeString(mqi0.m155944o()));
    }

    @Override // p149l.nj2
    /* JADX INFO: renamed from: A0 */
    public void mo130959A0(boolean z) {
        mkd0.m154992z(this.f107712b);
        if (!NullChecker.m81303a(this.f107714d) || NullChecker.m81303a(this.f107714d.links.next)) {
            this.f107712b = duringCreated((C22306c) CoreModule.f17545c.f19678r0.m34142r5(this.f139172a, this.f107714d, "").map(new w9j() { // from class: l.bhe
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f75600a.m130964O0((j760) obj);
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.che
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f80864a.m130965P0((List) obj);
                }
            }, new e30() { // from class: l.dhe
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f86280a.m130966Q0((Throwable) obj);
                }
            }));
        }
    }

    @Override // p149l.nj2
    /* JADX INFO: renamed from: C0 */
    public void mo130960C0() {
        DbLinks dbLinks;
        if (this.f107716f || (dbLinks = this.f107714d) == null || !NullChecker.m81303a(dbLinks.links.next)) {
            return;
        }
        this.f107716f = true;
        mo130959A0(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ List m130961J0(j760 j760Var) {
        F f = j760Var.f116564a;
        this.f107715e = ((q860) f).f153136b;
        return m159596o0((q860) f, (List) j760Var.f116565b);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m130962L0(List list) {
        ((ihe) this.viewModel).m136198l(list);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m130963N0(Throwable th) {
        ((ihe) this.viewModel).m136197k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ List m130964O0(j760 j760Var) {
        F f = j760Var.f116564a;
        this.f107714d = ((q860) f).f153136b;
        return m159596o0((q860) f, (List) j760Var.f116565b);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m130965P0(List list) {
        this.f107716f = false;
        ((ihe) this.viewModel).m136198l(list);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m130966Q0(Throwable th) {
        ((ihe) this.viewModel).m136197k();
        this.f107716f = false;
    }

    @Override // p149l.nj2, p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
    }

    @Override // p149l.nj2
    /* JADX INFO: renamed from: z0 */
    public void mo130967z0() {
        mkd0.m154992z(this.f107713c);
        this.f107713c = duringCreated((C22306c) CoreModule.f17545c.f19678r0.m34146t5(this.f139172a, this.f107715e, "").map(new w9j() { // from class: l.ehe
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f91320a.m130961J0((j760) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.fhe
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97500a.m130962L0((List) obj);
            }
        }, new e30() { // from class: l.ghe
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102654a.m130963N0((Throwable) obj);
            }
        }));
    }
}
