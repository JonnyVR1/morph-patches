package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.data.DbLinks;
import com.tantanapp.common.utils.NullChecker;
import java.net.URLEncoder;
import java.util.List;
import l.c4g0;
import l.e30;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class hhe extends nj2<ihe> {

    /* JADX INFO: renamed from: b */
    public c4g0 f14083b;

    /* JADX INFO: renamed from: c */
    public c4g0 f14084c;

    /* JADX INFO: renamed from: d */
    public DbLinks f14085d;

    /* JADX INFO: renamed from: e */
    public DbLinks f14086e;

    /* JADX INFO: renamed from: f */
    public boolean f14087f;

    public hhe(mcr mcrVar) {
        super(mcrVar);
        this.f14085d = null;
        this.f14086e = null;
        this.f14087f = false;
        this.f17493a = URLEncoder.encode(Converter.dateToApiTimeString(mqi0.m18550o()));
    }

    @Override // p009l.nj2
    /* JADX INFO: renamed from: A0 */
    public void mo15704A0(boolean z) {
        mkd0.z(this.f14083b);
        if (!NullChecker.a(this.f14085d) || NullChecker.a(this.f14085d.links.next)) {
            this.f14083b = duringCreated(CoreModule.c.r0.r5(this.f17493a, this.f14085d, "").map(new w9j() { // from class: l.bhe
                public final Object call(Object obj) {
                    return this.f10108a.m15709O0((j760) obj);
                }
            })).subscribe(mkd0.H(new e30() { // from class: l.che
                public final void call(Object obj) {
                    this.f10594a.m15710P0((List) obj);
                }
            }, new e30() { // from class: l.dhe
                public final void call(Object obj) {
                    this.f11843a.m15711Q0((Throwable) obj);
                }
            }));
        }
    }

    @Override // p009l.nj2
    /* JADX INFO: renamed from: C0 */
    public void mo15705C0() {
        DbLinks dbLinks;
        if (this.f14087f || (dbLinks = this.f14085d) == null || !NullChecker.a(dbLinks.links.next)) {
            return;
        }
        this.f14087f = true;
        mo15704A0(false);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ List m15706J0(j760 j760Var) {
        Object obj = j760Var.a;
        this.f14086e = ((q860) obj).f19069b;
        return m18894o0((q860) obj, (List) j760Var.b);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m15707L0(List list) {
        ((ihe) ((jq2) this).viewModel).m16555l(list);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m15708N0(Throwable th) {
        ((ihe) ((jq2) this).viewModel).m16554k();
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ List m15709O0(j760 j760Var) {
        Object obj = j760Var.a;
        this.f14085d = ((q860) obj).f19069b;
        return m18894o0((q860) obj, (List) j760Var.b);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m15710P0(List list) {
        this.f14087f = false;
        ((ihe) ((jq2) this).viewModel).m16555l(list);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m15711Q0(Throwable th) {
        ((ihe) ((jq2) this).viewModel).m16554k();
        this.f14087f = false;
    }

    @Override // p009l.nj2
    /* JADX INFO: renamed from: a0 */
    public void mo15712a0() {
        super.mo15712a0();
    }

    @Override // p009l.nj2
    /* JADX INFO: renamed from: z0 */
    public void mo15713z0() {
        mkd0.z(this.f14084c);
        this.f14084c = duringCreated(CoreModule.c.r0.t5(this.f17493a, this.f14086e, "").map(new w9j() { // from class: l.ehe
            public final Object call(Object obj) {
                return this.f12566a.m15706J0((j760) obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.fhe
            public final void call(Object obj) {
                this.f13001a.m15707L0((List) obj);
            }
        }, new e30() { // from class: l.ghe
            public final void call(Object obj) {
                this.f13572a.m15708N0((Throwable) obj);
            }
        }));
    }
}
