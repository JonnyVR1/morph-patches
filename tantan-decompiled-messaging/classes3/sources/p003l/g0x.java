package p003l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.User;
import java.util.List;
import java.util.Objects;
import l.e51;
import l.jq2;
import l.lqa;
import l.mcr;
import l.mkd0;
import l.q860;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class g0x extends hww<l0x> {
    public g0x(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m4503l0(Throwable th) {
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ q860 m4505n0(List list) {
        return new q860(list, (DbLinks) null);
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m4506o0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m4508q0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m4510s0() {
        ((l0x) ((jq2) this).viewModel).m5937q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m4511t0(c cVar) {
        e51.I(((l0x) ((jq2) this).viewModel).m5256f(), new Runnable() { // from class: l.a0x
            @Override // java.lang.Runnable
            public final void run() {
                this.f2072a.m4510s0();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: a0 */
    public void m4512a0() {
        super.a0();
        m4514x0();
        if (lqa.k() || lqa.n()) {
            lifecycle().filter(new w9j() { // from class: l.xzw
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((c) obj) == c.i);
                }
            }).first().subscribe((m250) mkd0.H(new e30() { // from class: l.yzw
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f9183a.m4511t0((c) obj);
                }
            }, new e30() { // from class: l.zzw
                @Override // p003l.e30
                public final void call(Object obj) {
                    g0x.m4508q0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m4513u0(q860 q860Var) {
        ((l0x) ((jq2) this).viewModel).m5928E(q860Var);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m4514x0() {
        MarryEditProfileSeriesAct marryEditProfileSeriesActM5005f0 = m5005f0();
        Objects.requireNonNull(marryEditProfileSeriesActM5005f0);
        if (marryEditProfileSeriesActM5005f0.m500Z1().m9549q0() == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS) {
            return;
        }
        duringCreated(m4515y0()).subscribe((m250) mkd0.H(new e30() { // from class: l.b0x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2335a.m4513u0((q860) obj);
            }
        }, new e30() { // from class: l.c0x
            @Override // p003l.e30
            public final void call(Object obj) {
                g0x.m4503l0((Throwable) obj);
            }
        }));
        creates(new e30() { // from class: l.d0x
            @Override // p003l.e30
            public final void call(Object obj) {
                g0x.m4506o0((Bundle) obj);
            }
        }, new d30() { // from class: l.e0x
            @Override // p003l.d30
            public final void call() {
                l0x.f5149l = null;
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final C1099c<q860<CoreMomentInfo>> m4515y0() {
        CoreModule.N().personalMediaMomentsFeedPrevious(CoreModule.H().userId(), false, CoreMomentInfo.JSON_ADAPTER);
        return CoreModule.N().di(CoreMomentInfo.JSON_ADAPTER).map(new w9j() { // from class: l.f0x
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return g0x.m4505n0((List) obj);
            }
        });
    }

    @Override // p003l.hww
    /* JADX INFO: renamed from: g0 */
    public void mo3202g0(MarrySeriesType marrySeriesType, User user) {
    }
}
