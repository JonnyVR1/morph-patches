package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ax00 extends ar2<cx00> {

    /* JADX INFO: renamed from: a */
    public String f73808a;

    /* JADX INFO: renamed from: b */
    public int f73809b;

    /* JADX INFO: renamed from: c */
    public boolean f73810c;

    /* JADX INFO: renamed from: d */
    public Moment f73811d;

    public ax00(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m100749i0(Bundle bundle) {
        cx00 cx00Var = (cx00) this.viewModel;
        Moment moment = this.f73811d;
        cx00Var.m112958m(moment == null ? new ArrayList<>() : (ArrayList) moment.media);
        ((cx00) this.viewModel).m112955j(this.f73809b, this.f73810c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m100750j0() {
        if (NullChecker.m82486a(((cx00) this.viewModel).f84164g)) {
            ((cx00) this.viewModel).f84164g.m203046C();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m100751k0(C4470c c4470c) {
        if (NullChecker.m82486a(this.viewModel) && NullChecker.m82487b(((cx00) this.viewModel).f84164g)) {
            ((cx00) this.viewModel).f84164g.m203048E();
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.ww00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191130a.m100749i0((Bundle) obj);
            }
        }, new x20() { // from class: l.xw00
            @Override // p153l.x20
            public final void call() {
                this.f196453a.m100750j0();
            }
        });
        lifecycle().filter(new qcj() { // from class: l.yw00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16268j);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.zw00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206316a.m100751k0((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public void m100752l0(String str, int i, boolean z) {
        this.f73808a = str;
        this.f73809b = i;
        this.f73810c = z;
    }

    /* JADX INFO: renamed from: m0 */
    public List<Object> m100753m0() {
        return jyb.m147507f0("moment id", this.f73808a, og3.f147188c);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
