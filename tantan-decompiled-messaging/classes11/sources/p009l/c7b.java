package p009l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.RealPictureInfo;
import com.p1.mobile.putong.core.data.RealPicturesInfo;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLabel;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.HashSet;
import l.au2;
import l.d30;
import l.e30;
import l.f73;
import l.jq2;
import l.lva;
import l.mcr;
import l.mkd0;
import l.osi0;
import l.roj0;
import l.v73;
import l.vqd0;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class c7b extends jq2<e7b> {

    /* JADX INFO: renamed from: a */
    public final vqd0 f10450a;

    public c7b(mcr mcrVar) {
        super(mcrVar);
        this.f10450a = new vqd0("realPictureShownToastMediaUrls", new HashSet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ void m12364A0(Bundle bundle) {
        ((e7b) ((jq2) this).viewModel).m13781c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ void m12365C0(Boolean bool) {
        m12381r0();
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m12366e0(d30 d30Var, roj0 roj0Var) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m12370i0(d30 d30Var, Throwable th) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ Boolean m12378q0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: D0 */
    public void m12379D0(Media media, int i, int i2, final d30 d30Var, final d30 d30Var2) {
        User userP9 = CoreModule.c.e0.p9();
        User userClone = userP9.clone();
        if (i == 1) {
            media.labels = vwb.f0(new MediaLabel[]{MediaLabel.get("WITH_OUTDOOR")});
        } else if (i == 2) {
            media.labels = vwb.f0(new MediaLabel[]{MediaLabel.get("WITH_FULL_BODY")});
        }
        if (i2 <= 0 || i2 >= userClone.pictures.size()) {
            userClone.pictures.add(media);
        } else {
            userClone.pictures.set(i2, media);
        }
        duringCreated(CoreModule.c.e0.u9(userClone.subtract(userP9))).subscribe(mkd0.H(new e30() { // from class: l.r6b
            public final void call(Object obj) {
                c7b.m12366e0(d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.s6b
            public final void call(Object obj) {
                c7b.m12370i0(d30Var2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public void m12380a0() {
        super.a0();
        m12381r0();
        creates(new e30() { // from class: l.p6b
            public final void call(Object obj) {
                this.f18406a.m12364A0((Bundle) obj);
            }
        });
        duringCreated(ConnectivityReceiver.m()).skip(1).map(new w9j() { // from class: l.t6b
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        }).distinctUntilChanged().filter(new w9j() { // from class: l.u6b
            public final Object call(Object obj) {
                return c7b.m12378q0((Boolean) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.v6b
            public final void call(Object obj) {
                this.f21464a.m12365C0((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public final void m12381r0() {
        duringCreated(CoreModule.c.e0.G7()).subscribe(mkd0.H(new e30() { // from class: l.w6b
            public final void call(Object obj) {
                this.f21918a.m12383t0((RealPicturesInfo) obj);
            }
        }, new e30() { // from class: l.x6b
            public final void call(Object obj) {
                this.f22446a.m12384u0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public void m12382s0(final d30 d30Var) {
        if (CoreModule.c.J0.F3()) {
            osi0.g("优先推荐中，请稍候再试");
        } else {
            f73.x(act(), act().string(R.string.E1), new d30() { // from class: l.y6b
                public final void call() {
                    this.f22906a.m12386y0(d30Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m12383t0(RealPicturesInfo realPicturesInfo) {
        boolean z = false;
        ((e7b) ((jq2) this).viewModel).m13780b(false);
        if (realPicturesInfo != null) {
            ((e7b) ((jq2) this).viewModel).m13782d(realPicturesInfo);
            RealPictureInfo realPictureInfo = realPicturesInfo.fullBody;
            boolean z2 = true;
            boolean z3 = (realPictureInfo == null || TextUtils.isEmpty(realPictureInfo.source) || !vwb.f0(new String[]{"other", "stock"}).contains(realPicturesInfo.fullBody.source)) ? false : true;
            RealPictureInfo realPictureInfo2 = realPicturesInfo.outdoor;
            boolean z4 = (realPictureInfo2 == null || TextUtils.isEmpty(realPictureInfo2.source) || !vwb.f0(new String[]{"other", "stock"}).contains(realPicturesInfo.outdoor.source)) ? false : true;
            HashSet hashSet = (HashSet) this.f10450a.get();
            if (z3 && !hashSet.contains(((Media) realPicturesInfo.fullBody.media).url)) {
                hashSet.add(((Media) realPicturesInfo.fullBody.media).url);
                osi0.g("已自动替换为符合要求的图片");
                z = true;
            }
            if (!z4 || hashSet.contains(((Media) realPicturesInfo.outdoor.media).url)) {
                z2 = z;
            } else {
                hashSet.add(((Media) realPicturesInfo.outdoor.media).url);
                if (!z) {
                    osi0.g("已自动替换为符合要求的图片");
                }
            }
            if (z2) {
                this.f10450a.put(hashSet);
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m12384u0(Throwable th) {
        ((e7b) ((jq2) this).viewModel).m13780b(true);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m12385x0(d30 d30Var, roj0 roj0Var) {
        v73.k(new v73.a(act()).d(true).g(new d30() { // from class: l.b7b
            public final void call() {
                this.f9926a.m12387z0();
            }
        }).f(d30Var).e(new d30() { // from class: l.q6b
            public final void call() {
                au2.w(new IllegalStateException("boost 开启失败"));
            }
        }));
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m12386y0(final d30 d30Var) {
        duringCreated(CoreModule.c.e0.F7()).subscribe(mkd0.H(new e30() { // from class: l.z6b
            public final void call(Object obj) {
                this.f23494a.m12385x0(d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.a7b
            public final void call(Object obj) {
                osi0.g("开启失败，请稍后再试");
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m12387z0() {
        act().startActivity(lva.f(act()));
    }

    public void destroy() {
    }
}
