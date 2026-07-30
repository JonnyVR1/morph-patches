package p153l;

import android.os.Build;
import com.baidu.mapapi.model.LatLng;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.location.Location;

/* JADX INFO: loaded from: classes3.dex */
public class fxw extends ar2<jxw> {

    /* JADX INFO: renamed from: a */
    public MessageLocation f101322a;

    /* JADX INFO: renamed from: b */
    public LatLng f101323b;

    /* JADX INFO: renamed from: c */
    public LatLng f101324c;

    public fxw(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m128038j0(C4470c c4470c) {
        if (c4470c instanceof C4470c.a) {
            act().setConvertActivityFromTranslucentEnable(false);
            ((jxw) this.viewModel).m147435f(this.f101322a, this.f101324c);
            uqb0.f180370E.m80047p().take(1).subscribe(psd0.m173596G(new y20() { // from class: l.exw
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f96355a.m128040i0((Location) obj);
                }
            }));
            int i = Build.VERSION.SDK_INT;
            if (i == 24 || i == 25) {
                act().addSwipeBackListener(new C17092a());
                return;
            }
            return;
        }
        if (c4470c == C4470c.f16267i) {
            ((jxw) this.viewModel).m147441n();
        } else if (c4470c == C4470c.f16268j) {
            ((jxw) this.viewModel).m147440m();
        } else if (c4470c == C4470c.f16271m) {
            ((jxw) this.viewModel).m147439l();
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.dxw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91122a.m128038j0((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public void m128039h0(MessageLocation messageLocation) {
        this.f101322a = messageLocation;
        DoublePair doublePair = messageLocation.coordinates;
        this.f101324c = xc2.m210088b(new LatLng(doublePair.first, doublePair.second));
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m128040i0(Location location) {
        LatLng latLngM210088b = xc2.m210088b(new LatLng(location.m80014u(), location.m80016x()));
        this.f101323b = latLngM210088b;
        ((jxw) this.viewModel).m147443q(latLngM210088b);
    }

    /* JADX INFO: renamed from: l.fxw$a */
    public class C17092a implements ujh0 {
        public C17092a() {
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: P */
        public void mo44722P() {
            ((jxw) fxw.this.viewModel).m147442p();
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: G0 */
        public void mo44721G0() {
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: a0 */
        public void mo44724a0() {
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: E0 */
        public void mo44720E0(boolean z, float f, int i) {
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
