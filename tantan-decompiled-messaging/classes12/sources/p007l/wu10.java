package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p1.mobile.android.app.Act;
import java.util.List;
import java.util.Objects;
import l.e30;
import l.mkd0;
import l.xaj0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class wu10 {

    /* JADX INFO: renamed from: a */
    public e5c f14677a;

    /* JADX INFO: renamed from: b */
    public pv60 f14678b = new pv60();

    /* JADX INFO: renamed from: c */
    public Act f14679c;

    /* JADX INFO: renamed from: d */
    public Links f14680d;

    public wu10(e5c e5cVar, Act act) {
        this.f14677a = e5cVar;
        this.f14679c = act;
    }

    /* JADX INFO: renamed from: c */
    public String m15921c() {
        Links links = this.f14680d;
        return links == null ? "" : links.next;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m15922d(xaj0 xaj0Var) {
        this.f14677a.mo5989c(((Integer) xaj0Var.c).intValue(), (List) xaj0Var.b, (Links) xaj0Var.a);
        this.f14680d = (Links) xaj0Var.a;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m15923e(xaj0 xaj0Var) {
        this.f14677a.mo5989c(((Integer) xaj0Var.c).intValue(), (List) xaj0Var.b, (Links) xaj0Var.a);
        this.f14680d = (Links) xaj0Var.a;
    }

    /* JADX INFO: renamed from: f */
    public void m15924f() {
        Links links = this.f14680d;
        if (links == null || TextUtils.isEmpty(links.next)) {
            return;
        }
        c cVarDuringCreated = this.f14679c.duringCreated(FeedModule.f316d.m16766xc(omg.m12695g(this.f14680d.next)));
        e30 e30Var = new e30() { // from class: l.tu10
            public final void call(Object obj) {
                this.f13419a.m15922d((xaj0) obj);
            }
        };
        e5c e5cVar = this.f14677a;
        Objects.requireNonNull(e5cVar);
        cVarDuringCreated.subscribe(mkd0.H(e30Var, new uu10(e5cVar)));
    }

    /* JADX INFO: renamed from: g */
    public void m15925g() {
        c cVarDuringCreated = this.f14679c.duringCreated(this.f14678b.m13258I());
        e30 e30Var = new e30() { // from class: l.vu10
            public final void call(Object obj) {
                this.f14298a.m15923e((xaj0) obj);
            }
        };
        e5c e5cVar = this.f14677a;
        Objects.requireNonNull(e5cVar);
        cVarDuringCreated.subscribe(mkd0.H(e30Var, new uu10(e5cVar)));
    }
}
