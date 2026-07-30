package p149l;

import android.os.Build;
import com.baidu.mapapi.model.LatLng;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.location.Location;

/* JADX INFO: loaded from: classes3.dex */
public class guw extends jq2<kuw> {

    /* JADX INFO: renamed from: a */
    public MessageLocation f104472a;

    /* JADX INFO: renamed from: b */
    public LatLng f104473b;

    /* JADX INFO: renamed from: c */
    public LatLng f104474c;

    public guw(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m128078j0(C4319c c4319c) {
        if (c4319c instanceof C4319c.a) {
            act().setConvertActivityFromTranslucentEnable(false);
            ((kuw) this.viewModel).m147333f(this.f104472a, this.f104474c);
            qib0.f154687E.m78864p().take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.fuw
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f99365a.m128080i0((Location) obj);
                }
            }));
            int i = Build.VERSION.SDK_INT;
            if (i == 24 || i == 25) {
                act().addSwipeBackListener(new C17157a());
                return;
            }
            return;
        }
        if (c4319c == C4319c.f15548i) {
            ((kuw) this.viewModel).m147339n();
        } else if (c4319c == C4319c.f15549j) {
            ((kuw) this.viewModel).m147338m();
        } else if (c4319c == C4319c.f15552m) {
            ((kuw) this.viewModel).m147337l();
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.euw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93279a.m128078j0((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public void m128079h0(MessageLocation messageLocation) {
        this.f104472a = messageLocation;
        DoublePair doublePair = messageLocation.coordinates;
        this.f104474c = qc2.m173860b(new LatLng(doublePair.first, doublePair.second));
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m128080i0(Location location) {
        LatLng latLngM173860b = qc2.m173860b(new LatLng(location.m78831u(), location.m78833x()));
        this.f104473b = latLngM173860b;
        ((kuw) this.viewModel).m147341q(latLngM173860b);
    }

    /* JADX INFO: renamed from: l.guw$a */
    public class C17157a implements mbh0 {
        public C17157a() {
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: O */
        public void mo43536O() {
            ((kuw) guw.this.viewModel).m147340p();
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: E0 */
        public void mo43535E0() {
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: Z */
        public void mo43538Z() {
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: D0 */
        public void mo43534D0(boolean z, float f, int i) {
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
