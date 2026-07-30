package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.RealPictureInfo;
import com.p051p1.mobile.putong.core.data.RealPicturesInfo;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.data.BundleStatus;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLabel;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.HashSet;

/* JADX INFO: loaded from: classes11.dex */
public class p8b extends ar2<r8b> {

    /* JADX INFO: renamed from: a */
    public final xyd0 f151004a;

    public p8b(ner nerVar) {
        super(nerVar);
        this.f151004a = new xyd0("realPictureShownToastMediaUrls", new HashSet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ void m171205A0(Bundle bundle) {
        ((r8b) this.viewModel).m180177c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ void m171206C0(Boolean bool) {
        m171221r0();
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m171207e0(x20 x20Var, uxj0 uxj0Var) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m171211i0(x20 x20Var, Throwable th) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ Boolean m171219q0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: D0 */
    public void m171220D0(Media media, int i, int i2, final x20 x20Var, final x20 x20Var2) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        User userMo225055clone = userM116600p9.mo225055clone();
        if (i == 1) {
            media.labels = jyb.m147507f0(MediaLabel.get(MediaLabel.WITH_OUTDOOR));
        } else if (i == 2) {
            media.labels = jyb.m147507f0(MediaLabel.get(MediaLabel.WITH_FULL_BODY));
        }
        if (i2 <= 0 || i2 >= userMo225055clone.pictures.size()) {
            userMo225055clone.pictures.add(media);
        } else {
            userMo225055clone.pictures.set(i2, media);
        }
        duringCreated(CoreModule.f18264c.f20381e0.m116620u9(userMo225055clone.subtract(userM116600p9))).subscribe(psd0.m173597H(new y20() { // from class: l.e8b
            @Override // p153l.y20
            public final void call(Object obj) {
                p8b.m171207e0(x20Var, (uxj0) obj);
            }
        }, new y20() { // from class: l.f8b
            @Override // p153l.y20
            public final void call(Object obj) {
                p8b.m171211i0(x20Var2, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        m171221r0();
        creates(new y20() { // from class: l.c8b
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80192a.m171205A0((Bundle) obj);
            }
        });
        duringCreated(ConnectivityReceiver.m82473m()).skip(1).map(new qcj() { // from class: l.g8b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).distinctUntilChanged().filter(new qcj() { // from class: l.h8b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return p8b.m171219q0((Boolean) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.i8b
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113331a.m171206C0((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public final void m171221r0() {
        duringCreated(CoreModule.f18264c.f20381e0.m116464G7()).subscribe(psd0.m173597H(new y20() { // from class: l.j8b
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118766a.m171223t0((RealPicturesInfo) obj);
            }
        }, new y20() { // from class: l.k8b
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124369a.m171224u0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public void m171222s0(final x20 x20Var) {
        if (CoreModule.f18264c.f20318J0.m156766F3()) {
            r1j0.m179420g("优先推荐中，请稍候再试");
        } else {
            u73.m194833x(act(), act().string(R$string.f21319E1), new x20() { // from class: l.l8b
                @Override // p153l.x20
                public final void call() {
                    this.f130431a.m171226y0(x20Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m171223t0(RealPicturesInfo realPicturesInfo) {
        boolean z = false;
        ((r8b) this.viewModel).m180176b(false);
        if (realPicturesInfo != null) {
            ((r8b) this.viewModel).m180178d(realPicturesInfo);
            RealPictureInfo realPictureInfo = realPicturesInfo.fullBody;
            boolean z2 = true;
            boolean z3 = (realPictureInfo == null || TextUtils.isEmpty(realPictureInfo.source) || !jyb.m147507f0("other", BundleStatus.stock).contains(realPicturesInfo.fullBody.source)) ? false : true;
            RealPictureInfo realPictureInfo2 = realPicturesInfo.outdoor;
            boolean z4 = (realPictureInfo2 == null || TextUtils.isEmpty(realPictureInfo2.source) || !jyb.m147507f0("other", BundleStatus.stock).contains(realPicturesInfo.outdoor.source)) ? false : true;
            HashSet<String> hashSet = this.f151004a.get();
            if (z3 && !hashSet.contains(realPicturesInfo.fullBody.media.url)) {
                hashSet.add(realPicturesInfo.fullBody.media.url);
                r1j0.m179420g("已自动替换为符合要求的图片");
                z = true;
            }
            if (!z4 || hashSet.contains(realPicturesInfo.outdoor.media.url)) {
                z2 = z;
            } else {
                hashSet.add(realPicturesInfo.outdoor.media.url);
                if (!z) {
                    r1j0.m179420g("已自动替换为符合要求的图片");
                }
            }
            if (z2) {
                this.f151004a.put(hashSet);
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m171224u0(Throwable th) {
        ((r8b) this.viewModel).m180176b(true);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m171225x0(x20 x20Var, uxj0 uxj0Var) {
        k83.m148673k(new k83.C18118a(act()).m148681d(true).m148684g(new x20() { // from class: l.o8b
            @Override // p153l.x20
            public final void call() {
                this.f145368a.m171227z0();
            }
        }).m148683f(x20Var).m148682e(new x20() { // from class: l.d8b
            @Override // p153l.x20
            public final void call() {
                qu2.m178128w(new IllegalStateException("boost 开启失败"));
            }
        }));
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m171226y0(final x20 x20Var) {
        duringCreated(CoreModule.f18264c.f20381e0.m116460F7()).subscribe(psd0.m173597H(new y20() { // from class: l.m8b
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135162a.m171225x0(x20Var, (uxj0) obj);
            }
        }, new y20() { // from class: l.n8b
            @Override // p153l.y20
            public final void call(Object obj) {
                r1j0.m179420g("开启失败，请稍后再试");
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m171227z0() {
        act().startActivity(xwa.m213311f(act()));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
