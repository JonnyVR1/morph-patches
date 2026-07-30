package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.feed.FeedModule;
import java.util.List;
import java.util.Objects;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class e320 {

    /* JADX INFO: renamed from: a */
    public k6c f91916a;

    /* JADX INFO: renamed from: b */
    public v370 f91917b = new v370();

    /* JADX INFO: renamed from: c */
    public Act f91918c;

    /* JADX INFO: renamed from: d */
    public Links f91919d;

    public e320(k6c k6cVar, Act act) {
        this.f91916a = k6cVar;
        this.f91918c = act;
    }

    /* JADX INFO: renamed from: c */
    public String m119241c() {
        Links links = this.f91919d;
        return links == null ? "" : links.next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m119242d(bkj0 bkj0Var) {
        this.f91916a.mo66074c(((Integer) bkj0Var.f77083c).intValue(), (List) bkj0Var.f77082b, (Links) bkj0Var.f77081a);
        this.f91919d = (Links) bkj0Var.f77081a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m119243e(bkj0 bkj0Var) {
        this.f91916a.mo66074c(((Integer) bkj0Var.f77083c).intValue(), (List) bkj0Var.f77082b, (Links) bkj0Var.f77081a);
        this.f91919d = (Links) bkj0Var.f77081a;
    }

    /* JADX INFO: renamed from: f */
    public void m119244f() {
        Links links = this.f91919d;
        if (links == null || TextUtils.isEmpty(links.next)) {
            return;
        }
        C22421c c22421cDuringCreated = this.f91918c.duringCreated(FeedModule.f39703d.m145826xc(dog.m117238g(this.f91919d.next)));
        y20 y20Var = new y20() { // from class: l.b320
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74696a.m119242d((bkj0) obj);
            }
        };
        k6c k6cVar = this.f91916a;
        Objects.requireNonNull(k6cVar);
        c22421cDuringCreated.subscribe(psd0.m173597H(y20Var, new c320(k6cVar)));
    }

    /* JADX INFO: renamed from: g */
    public void m119245g() {
        C22421c c22421cDuringCreated = this.f91918c.duringCreated(this.f91917b.m199238I());
        y20 y20Var = new y20() { // from class: l.d320
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84847a.m119243e((bkj0) obj);
            }
        };
        k6c k6cVar = this.f91916a;
        Objects.requireNonNull(k6cVar);
        c22421cDuringCreated.subscribe(psd0.m173597H(y20Var, new c320(k6cVar)));
    }
}
