package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.feed.FeedModule;
import java.util.List;
import java.util.Objects;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class wu10 {

    /* JADX INFO: renamed from: a */
    public e5c f188073a;

    /* JADX INFO: renamed from: b */
    public pv60 f188074b = new pv60();

    /* JADX INFO: renamed from: c */
    public Act f188075c;

    /* JADX INFO: renamed from: d */
    public Links f188076d;

    public wu10(e5c e5cVar, Act act) {
        this.f188073a = e5cVar;
        this.f188075c = act;
    }

    /* JADX INFO: renamed from: c */
    public String m205586c() {
        Links links = this.f188076d;
        return links == null ? "" : links.next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m205587d(xaj0 xaj0Var) {
        this.f188073a.mo64890c(((Integer) xaj0Var.f191753c).intValue(), (List) xaj0Var.f191752b, (Links) xaj0Var.f191751a);
        this.f188076d = (Links) xaj0Var.f191751a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m205588e(xaj0 xaj0Var) {
        this.f188073a.mo64890c(((Integer) xaj0Var.f191753c).intValue(), (List) xaj0Var.f191752b, (Links) xaj0Var.f191751a);
        this.f188076d = (Links) xaj0Var.f191751a;
    }

    /* JADX INFO: renamed from: f */
    public void m205589f() {
        Links links = this.f188076d;
        if (links == null || TextUtils.isEmpty(links.next)) {
            return;
        }
        C22306c c22306cDuringCreated = this.f188075c.duringCreated(FeedModule.f38855d.m209585xc(omg.m165077g(this.f188076d.next)));
        e30 e30Var = new e30() { // from class: l.tu10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172111a.m205587d((xaj0) obj);
            }
        };
        e5c e5cVar = this.f188073a;
        Objects.requireNonNull(e5cVar);
        c22306cDuringCreated.subscribe(mkd0.m154956H(e30Var, new uu10(e5cVar)));
    }

    /* JADX INFO: renamed from: g */
    public void m205590g() {
        C22306c c22306cDuringCreated = this.f188075c.duringCreated(this.f188074b.m171605I());
        e30 e30Var = new e30() { // from class: l.vu10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183023a.m205588e((xaj0) obj);
            }
        };
        e5c e5cVar = this.f188073a;
        Objects.requireNonNull(e5cVar);
        c22306cDuringCreated.subscribe(mkd0.m154956H(e30Var, new uu10(e5cVar)));
    }
}
