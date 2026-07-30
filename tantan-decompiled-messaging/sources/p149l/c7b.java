package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.RealPictureInfo;
import com.p046p1.mobile.putong.core.data.RealPicturesInfo;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.data.BundleStatus;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLabel;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.HashSet;

/* JADX INFO: loaded from: classes11.dex */
public class c7b extends jq2<e7b> {

    /* JADX INFO: renamed from: a */
    public final vqd0 f79604a;

    public c7b(mcr mcrVar) {
        super(mcrVar);
        this.f79604a = new vqd0("realPictureShownToastMediaUrls", new HashSet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ void m105530A0(Bundle bundle) {
        ((e7b) this.viewModel).m115184c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ void m105531C0(Boolean bool) {
        m105546r0();
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m105532e0(d30 d30Var, roj0 roj0Var) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m105536i0(d30 d30Var, Throwable th) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ Boolean m105544q0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: D0 */
    public void m105545D0(Media media, int i, int i2, final d30 d30Var, final d30 d30Var2) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        User userMo223809clone = userM169527p9.mo223809clone();
        if (i == 1) {
            media.labels = vwb.m200324f0(MediaLabel.get(MediaLabel.WITH_OUTDOOR));
        } else if (i == 2) {
            media.labels = vwb.m200324f0(MediaLabel.get(MediaLabel.WITH_FULL_BODY));
        }
        if (i2 <= 0 || i2 >= userMo223809clone.pictures.size()) {
            userMo223809clone.pictures.add(media);
        } else {
            userMo223809clone.pictures.set(i2, media);
        }
        duringCreated(CoreModule.f17545c.f19639e0.m169547u9(userMo223809clone.subtract(userM169527p9))).subscribe(mkd0.m154956H(new e30() { // from class: l.r6b
            @Override // p149l.e30
            public final void call(Object obj) {
                c7b.m105532e0(d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.s6b
            @Override // p149l.e30
            public final void call(Object obj) {
                c7b.m105536i0(d30Var2, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        m105546r0();
        creates(new e30() { // from class: l.p6b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147384a.m105530A0((Bundle) obj);
            }
        });
        duringCreated(ConnectivityReceiver.m81290m()).skip(1).map(new w9j() { // from class: l.t6b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).distinctUntilChanged().filter(new w9j() { // from class: l.u6b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return c7b.m105544q0((Boolean) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.v6b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180175a.m105531C0((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public final void m105546r0() {
        duringCreated(CoreModule.f17545c.f19639e0.m169391G7()).subscribe(mkd0.m154956H(new e30() { // from class: l.w6b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184819a.m105548t0((RealPicturesInfo) obj);
            }
        }, new e30() { // from class: l.x6b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191226a.m105549u0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public void m105547s0(final d30 d30Var) {
        if (CoreModule.f17545c.f19576J0.m139254F3()) {
            osi0.m165783g("优先推荐中，请稍候再试");
        } else {
            f73.m119756x(act(), act().string(R$string.f20577E1), new d30() { // from class: l.y6b
                @Override // p149l.d30
                public final void call() {
                    this.f196538a.m105551y0(d30Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m105548t0(RealPicturesInfo realPicturesInfo) {
        boolean z = false;
        ((e7b) this.viewModel).m115183b(false);
        if (realPicturesInfo != null) {
            ((e7b) this.viewModel).m115185d(realPicturesInfo);
            RealPictureInfo realPictureInfo = realPicturesInfo.fullBody;
            boolean z2 = true;
            boolean z3 = (realPictureInfo == null || TextUtils.isEmpty(realPictureInfo.source) || !vwb.m200324f0("other", BundleStatus.stock).contains(realPicturesInfo.fullBody.source)) ? false : true;
            RealPictureInfo realPictureInfo2 = realPicturesInfo.outdoor;
            boolean z4 = (realPictureInfo2 == null || TextUtils.isEmpty(realPictureInfo2.source) || !vwb.m200324f0("other", BundleStatus.stock).contains(realPicturesInfo.outdoor.source)) ? false : true;
            HashSet<String> hashSet = this.f79604a.get();
            if (z3 && !hashSet.contains(realPicturesInfo.fullBody.media.url)) {
                hashSet.add(realPicturesInfo.fullBody.media.url);
                osi0.m165783g("已自动替换为符合要求的图片");
                z = true;
            }
            if (!z4 || hashSet.contains(realPicturesInfo.outdoor.media.url)) {
                z2 = z;
            } else {
                hashSet.add(realPicturesInfo.outdoor.media.url);
                if (!z) {
                    osi0.m165783g("已自动替换为符合要求的图片");
                }
            }
            if (z2) {
                this.f79604a.put(hashSet);
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m105549u0(Throwable th) {
        ((e7b) this.viewModel).m115183b(true);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m105550x0(d30 d30Var, roj0 roj0Var) {
        v73.m197321k(new v73.C20591a(act()).m197329d(true).m197332g(new d30() { // from class: l.b7b
            @Override // p149l.d30
            public final void call() {
                this.f73956a.m105552z0();
            }
        }).m197331f(d30Var).m197330e(new d30() { // from class: l.q6b
            @Override // p149l.d30
            public final void call() {
                au2.m98935w(new IllegalStateException("boost 开启失败"));
            }
        }));
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m105551y0(final d30 d30Var) {
        duringCreated(CoreModule.f17545c.f19639e0.m169387F7()).subscribe(mkd0.m154956H(new e30() { // from class: l.z6b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201902a.m105550x0(d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.a7b
            @Override // p149l.e30
            public final void call(Object obj) {
                osi0.m165783g("开启失败，请稍后再试");
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m105552z0() {
        act().startActivity(lva.m151850f(act()));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
