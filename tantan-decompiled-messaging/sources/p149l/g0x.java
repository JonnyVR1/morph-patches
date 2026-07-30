package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import java.util.Objects;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public class g0x extends hww<l0x> {
    public g0x(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m124014l0(Throwable th) {
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ q860 m124016n0(List list) {
        return new q860(list, null);
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m124017o0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m124019q0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m124021s0() {
        ((l0x) this.viewModel).m148136q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m124022t0(C4319c c4319c) {
        e51.m114744I(((l0x) this.viewModel).m138777f(), new Runnable() { // from class: l.a0x
            @Override // java.lang.Runnable
            public final void run() {
                this.f67078a.m124021s0();
            }
        }, 1000L);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        m124024x0();
        if (lqa.m150973k() || lqa.m150976n()) {
            lifecycle().filter(new w9j() { // from class: l.xzw
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
                }
            }).first().subscribe(mkd0.m154956H(new e30() { // from class: l.yzw
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f200915a.m124022t0((C4319c) obj);
                }
            }, new e30() { // from class: l.zzw
                @Override // p149l.e30
                public final void call(Object obj) {
                    g0x.m124019q0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m124023u0(q860 q860Var) {
        ((l0x) this.viewModel).m148133E(q860Var);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m124024x0() {
        MarryEditProfileSeriesAct marryEditProfileSeriesActM133274f0 = m133274f0();
        Objects.requireNonNull(marryEditProfileSeriesActM133274f0);
        if (marryEditProfileSeriesActM133274f0.m47453Z1().m220976q0() == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS) {
            return;
        }
        duringCreated(m124025y0()).subscribe(mkd0.m154956H(new e30() { // from class: l.b0x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72466a.m124023u0((q860) obj);
            }
        }, new e30() { // from class: l.c0x
            @Override // p149l.e30
            public final void call(Object obj) {
                g0x.m124014l0((Throwable) obj);
            }
        }));
        creates(new e30() { // from class: l.d0x
            @Override // p149l.e30
            public final void call(Object obj) {
                g0x.m124017o0((Bundle) obj);
            }
        }, new d30() { // from class: l.e0x
            @Override // p149l.d30
            public final void call() {
                l0x.f125581l = null;
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final C22306c<q860<CoreMomentInfo>> m124025y0() {
        CoreModule.m29934N().personalMediaMomentsFeedPrevious(CoreModule.m29931H().userId(), false, CoreMomentInfo.JSON_ADAPTER);
        return CoreModule.m29934N().mo60346di(CoreMomentInfo.JSON_ADAPTER).map(new w9j() { // from class: l.f0x
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return g0x.m124016n0((List) obj);
            }
        });
    }

    @Override // p149l.hww
    /* JADX INFO: renamed from: g0 */
    public void mo104384g0(MarrySeriesType marrySeriesType, User user) {
    }
}
