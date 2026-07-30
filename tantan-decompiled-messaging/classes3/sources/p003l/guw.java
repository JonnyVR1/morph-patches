package p003l;

import android.os.Build;
import com.baidu.mapapi.model.LatLng;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.data.DoublePair;
import com.p1.mobile.putong.data.MessageLocation;
import com.p1.mobile.putong.location.Location;
import l.jq2;
import l.mbh0;
import l.mcr;
import l.mkd0;
import l.qc2;
import l.qib0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class guw extends jq2<kuw> {

    /* JADX INFO: renamed from: a */
    public MessageLocation f4012a;

    /* JADX INFO: renamed from: b */
    public LatLng f4013b;

    /* JADX INFO: renamed from: c */
    public LatLng f4014c;

    public guw(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m4706j0(c cVar) {
        if (cVar instanceof c.a) {
            act().setConvertActivityFromTranslucentEnable(false);
            ((kuw) ((jq2) this).viewModel).m5851f(this.f4012a, this.f4014c);
            qib0.E.p().take(1).subscribe((m250) mkd0.G(new e30() { // from class: l.fuw
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f3729a.m4709i0((Location) obj);
                }
            }));
            int i = Build.VERSION.SDK_INT;
            if (i == 24 || i == 25) {
                act().addSwipeBackListener(new C0316a());
                return;
            }
            return;
        }
        if (cVar == c.i) {
            ((kuw) ((jq2) this).viewModel).m5858n();
        } else if (cVar == c.j) {
            ((kuw) ((jq2) this).viewModel).m5857m();
        } else if (cVar == c.m) {
            ((kuw) ((jq2) this).viewModel).m5856l();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m4707a0() {
        lifecycle().subscribe((m250) mkd0.G(new e30() { // from class: l.euw
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3381a.m4706j0((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public void m4708h0(MessageLocation messageLocation) {
        this.f4012a = messageLocation;
        DoublePair doublePair = messageLocation.coordinates;
        this.f4014c = qc2.b(new LatLng(doublePair.first, doublePair.second));
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m4709i0(Location location) {
        LatLng latLngB = qc2.b(new LatLng(location.u(), location.x()));
        this.f4013b = latLngB;
        ((kuw) ((jq2) this).viewModel).m5860q(latLngB);
    }

    /* JADX INFO: renamed from: l.guw$a */
    public class C0316a implements mbh0 {
        public C0316a() {
        }

        /* JADX INFO: renamed from: O */
        public void m4712O() {
            ((kuw) ((jq2) guw.this).viewModel).m5859p();
        }

        /* JADX INFO: renamed from: E0 */
        public void m4711E0() {
        }

        /* JADX INFO: renamed from: Z */
        public void m4713Z() {
        }

        /* JADX INFO: renamed from: D0 */
        public void m4710D0(boolean z, float f, int i) {
        }
    }

    public void destroy() {
    }
}
