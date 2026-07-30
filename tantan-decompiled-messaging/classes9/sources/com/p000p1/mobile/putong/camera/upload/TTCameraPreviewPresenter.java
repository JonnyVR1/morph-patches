package com.p000p1.mobile.putong.camera.upload;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.camera.TTCameraConfig;
import com.p000p1.mobile.putong.camera.upload.TTCameraPreviewPresenter;
import com.p1.mobile.android.app.c;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import l.d30;
import l.e30;
import l.f30;
import l.jo0;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.rhi;
import p006l.hnh0;
import p006l.qlh0;
import p006l.smh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TTCameraPreviewPresenter extends jq2<hnh0> {

    /* JADX INFO: renamed from: a */
    public final TTCameraConfig f1233a;

    /* JADX INFO: renamed from: b */
    public final TTCameraPreviewConfig f1234b;

    /* JADX INFO: renamed from: c */
    public C0134a<LocalUrlMap> f1235c;

    /* JADX INFO: renamed from: d */
    public final smh0 f1236d;

    /* JADX INFO: renamed from: e */
    public final String f1237e;

    public static class LocalUrlMap implements C0134a.a<LocalUrlMap>, Serializable {
        private HashMap<String, String> map;

        private LocalUrlMap(@Nullable HashMap<String, String> map) {
            if (map == null) {
                this.map = new HashMap<>();
            } else {
                this.map = map;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void saveUrlEntry(String str, String str2) {
            this.map.put(str, str2);
        }

        @Override // com.p000p1.mobile.putong.camera.upload.C0134a.a
        public void nullCheck() {
            if (this.map == null) {
                this.map = new HashMap<>();
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.p000p1.mobile.putong.camera.upload.C0134a.a
        public LocalUrlMap trimAndCopy() {
            return new LocalUrlMap(this.map);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TTCameraPreviewPresenter(mcr mcrVar, @Nullable TTCameraConfig tTCameraConfig, TTCameraPreviewConfig tTCameraPreviewConfig) {
        super(mcrVar);
        this.f1235c = new C0134a<>(LocalUrlMap.class, "camera_video_map", new LocalUrlMap(null), true, "preferences");
        this.f1236d = new smh0();
        this.f1237e = qlh0.m22290f();
        this.f1233a = tTCameraConfig;
        this.f1234b = tTCameraPreviewConfig;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m1713e0(Throwable th) {
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m1720l0(Throwable th) {
    }

    public void destroy() {
        ((hnh0) ((jq2) this).viewModel).destroy();
        qlh0.m22285a();
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m1722n0() {
        if (!this.f1234b.m1691i()) {
            return false;
        }
        String str = (String) ((LocalUrlMap) this.f1235c.m1735a()).map.get(this.f1234b.m1690h());
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.f1234b.m1700s(str);
        this.f1234b.m1697p(false);
        this.f1234b.m1698q(false);
        return true;
    }

    /* JADX INFO: renamed from: o0 */
    public void m1723o0() {
        if (new File(this.f1237e).exists()) {
            return;
        }
        duringCreated(this.f1236d.m23907n(this.f1234b.m1690h(), this.f1237e).compose(mkd0.C())).subscribe(mkd0.H(new e30() { // from class: l.wmh0
            public final void call(Object obj) {
                this.f25240a.m1725q0((String) obj);
            }
        }, new e30() { // from class: l.xmh0
            public final void call(Object obj) {
                TTCameraPreviewPresenter.m1713e0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public void m1724p0() {
        lifecycle().subscribe(mkd0.H(new e30() { // from class: l.umh0
            public final void call(Object obj) {
                this.f23643a.m1726r0((c) obj);
            }
        }, new e30() { // from class: l.vmh0
            public final void call(Object obj) {
                TTCameraPreviewPresenter.m1720l0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m1725q0(String str) {
        this.f1234b.m1700s(rhi.B(str));
        this.f1234b.m1697p(false);
        this.f1234b.m1698q(false);
        ((hnh0) ((jq2) this).viewModel).m16287s();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m1726r0(c cVar) {
        if (c.h.equals(cVar)) {
            ((hnh0) ((jq2) this).viewModel).m16287s();
        } else if (c.k.equals(cVar)) {
            ((hnh0) ((jq2) this).viewModel).m16288u();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m1727s0(String str, String str2) {
        LocalUrlMap localUrlMap = (LocalUrlMap) this.f1235c.m1735a();
        localUrlMap.saveUrlEntry(str2, str);
        this.f1235c.m1736b(localUrlMap);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m1728t0() {
        ((hnh0) ((jq2) this).viewModel).m16283m();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m1729u0() {
        ((hnh0) ((jq2) this).viewModel).m16280j();
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m1730x0(String str) {
        C0135b.m1737a().m1739c(new C0135b.b(1, this.f1234b.m1695n() ? AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO : AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYFACE, str));
        ((hnh0) ((jq2) this).viewModel).m16282l(str);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m1731y0(Throwable th) {
        C0135b.m1737a().m1739c(new C0135b.b(2, this.f1234b.m1695n() ? AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO : AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYFACE, null));
        ((hnh0) ((jq2) this).viewModel).m16281k(th);
    }

    /* JADX INFO: renamed from: z0 */
    public void m1732z0() {
        rx.c<String> cVarM23909p;
        boolean zIsEmpty = TextUtils.isEmpty(this.f1234b.m1688f());
        TTCameraPreviewConfig tTCameraPreviewConfig = this.f1234b;
        if (zIsEmpty) {
            C0135b.m1737a().m1739c(new C0135b.b(2, tTCameraPreviewConfig.m1695n() ? AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO : AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYFACE, null));
            ((hnh0) ((jq2) this).viewModel).m16281k(new RuntimeException("file path is null or empty"));
            return;
        }
        boolean zM1693l = tTCameraPreviewConfig.m1693l();
        TTCameraPreviewConfig tTCameraPreviewConfig2 = this.f1234b;
        if (zM1693l) {
            boolean zM1695n = tTCameraPreviewConfig2.m1695n();
            smh0 smh0Var = this.f1236d;
            cVarM23909p = zM1695n ? smh0Var.m23911s(this.f1234b.m1688f(), new f30() { // from class: l.ymh0
                public final void call(Object obj, Object obj2) {
                    this.f28303a.m1727s0((String) obj, (String) obj2);
                }
            }) : smh0Var.m23910r(this.f1234b.m1688f());
        } else {
            boolean zM1695n2 = tTCameraPreviewConfig2.m1695n();
            smh0 smh0Var2 = this.f1236d;
            cVarM23909p = zM1695n2 ? smh0Var2.m23909p(this.f1234b.m1688f()) : smh0Var2.m23908o(this.f1234b.m1688f());
        }
        duringCreated(cVarM23909p).observeOn(jo0.a()).doOnSubscribe(new d30() { // from class: l.zmh0
            public final void call() {
                this.f28825a.m1728t0();
            }
        }).doOnUnsubscribe(new d30() { // from class: l.anh0
            public final void call() {
                this.f8407a.m1729u0();
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.bnh0
            public final void call(Object obj) {
                this.f9005a.m1730x0((String) obj);
            }
        }, new e30() { // from class: l.cnh0
            public final void call(Object obj) {
                this.f9746a.m1731y0((Throwable) obj);
            }
        }));
    }
}
