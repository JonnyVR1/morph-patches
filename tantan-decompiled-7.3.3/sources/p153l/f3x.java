package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import java.util.Objects;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class f3x extends gzw<k3x> {
    public f3x(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m123811l0(Throwable th) {
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ vg60 m123813n0(List list) {
        return new vg60(list, null);
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m123814o0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m123816q0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m123818s0() {
        ((k3x) this.viewModel).m148183q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m123819t0(C4470c c4470c) {
        l51.m152889I(((k3x) this.viewModel).m137940f(), new Runnable() { // from class: l.z2x
            @Override // java.lang.Runnable
            public final void run() {
                this.f202767a.m123818s0();
            }
        }, 1000L);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        m123821x0();
        if (xra.m212792k() || xra.m212795n()) {
            lifecycle().filter(new qcj() { // from class: l.w2x
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
                }
            }).first().subscribe(psd0.m173597H(new y20() { // from class: l.x2x
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f192207a.m123819t0((C4470c) obj);
                }
            }, new y20() { // from class: l.y2x
                @Override // p153l.y20
                public final void call(Object obj) {
                    f3x.m123816q0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m123820u0(vg60 vg60Var) {
        ((k3x) this.viewModel).m148178E(vg60Var);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m123821x0() {
        MarryEditProfileSeriesAct marryEditProfileSeriesActM133134f0 = m133134f0();
        Objects.requireNonNull(marryEditProfileSeriesActM133134f0);
        if (marryEditProfileSeriesActM133134f0.m48636a2().m213993q0() == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS) {
            return;
        }
        duringCreated(m123822y0()).subscribe(psd0.m173597H(new y20() { // from class: l.a3x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68333a.m123820u0((vg60) obj);
            }
        }, new y20() { // from class: l.b3x
            @Override // p153l.y20
            public final void call(Object obj) {
                f3x.m123811l0((Throwable) obj);
            }
        }));
        creates(new y20() { // from class: l.c3x
            @Override // p153l.y20
            public final void call(Object obj) {
                f3x.m123814o0((Bundle) obj);
            }
        }, new x20() { // from class: l.d3x
            @Override // p153l.x20
            public final void call() {
                k3x.f123778l = null;
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final C22421c<vg60<CoreMomentInfo>> m123822y0() {
        CoreModule.m30932N().personalMediaMomentsFeedPrevious(CoreModule.m30929H().userId(), false, CoreMomentInfo.JSON_ADAPTER);
        return CoreModule.m30932N().mo61530di(CoreMomentInfo.JSON_ADAPTER).map(new qcj() { // from class: l.e3x
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return f3x.m123813n0((List) obj);
            }
        });
    }

    @Override // p153l.gzw
    /* JADX INFO: renamed from: g0 */
    public void mo95433g0(MarrySeriesType marrySeriesType, User user) {
    }
}
