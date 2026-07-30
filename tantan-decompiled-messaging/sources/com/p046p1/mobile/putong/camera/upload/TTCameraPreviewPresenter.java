package com.p046p1.mobile.putong.camera.upload;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.camera.TTCameraConfig;
import com.p046p1.mobile.putong.camera.upload.TTCameraPreviewPresenter;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import p133rx.C22306c;
import p149l.d30;
import p149l.e30;
import p149l.f30;
import p149l.fpd0;
import p149l.hnh0;
import p149l.jo0;
import p149l.jq2;
import p149l.mcr;
import p149l.mkd0;
import p149l.qlh0;
import p149l.rhi;
import p149l.smh0;

/* JADX INFO: loaded from: classes9.dex */
public class TTCameraPreviewPresenter extends jq2<hnh0> {

    /* JADX INFO: renamed from: a */
    public final TTCameraConfig f17244a;

    /* JADX INFO: renamed from: b */
    public final TTCameraPreviewConfig f17245b;

    /* JADX INFO: renamed from: c */
    public C4708a<LocalUrlMap> f17246c;

    /* JADX INFO: renamed from: d */
    public final smh0 f17247d;

    /* JADX INFO: renamed from: e */
    public final String f17248e;

    public static class LocalUrlMap implements C4708a.a<LocalUrlMap>, Serializable {
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

        @Override // com.p046p1.mobile.putong.camera.upload.C4708a.a
        public void nullCheck() {
            if (this.map == null) {
                this.map = new HashMap<>();
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.p046p1.mobile.putong.camera.upload.C4708a.a
        public LocalUrlMap trimAndCopy() {
            return new LocalUrlMap(this.map);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TTCameraPreviewPresenter(mcr mcrVar, @Nullable TTCameraConfig tTCameraConfig, TTCameraPreviewConfig tTCameraPreviewConfig) {
        super(mcrVar);
        this.f17246c = new C4708a<>(LocalUrlMap.class, "camera_video_map", new LocalUrlMap(null), true, fpd0.DEFAULT_FILE_NAME);
        this.f17247d = new smh0();
        this.f17248e = qlh0.m175487f();
        this.f17244a = tTCameraConfig;
        this.f17245b = tTCameraPreviewConfig;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m29802e0(Throwable th) {
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m29809l0(Throwable th) {
    }

    @Override // p149l.q0m
    public void destroy() {
        ((hnh0) this.viewModel).destroy();
        qlh0.m175482a();
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m29811n0() {
        if (!this.f17245b.m29780i()) {
            return false;
        }
        String str = (String) ((LocalUrlMap) this.f17246c.m29824a()).map.get(this.f17245b.m29779h());
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.f17245b.m29789s(str);
        this.f17245b.m29786p(false);
        this.f17245b.m29787q(false);
        return true;
    }

    /* JADX INFO: renamed from: o0 */
    public void m29812o0() {
        if (new File(this.f17248e).exists()) {
            return;
        }
        duringCreated((C22306c) this.f17247d.m184964n(this.f17245b.m29779h(), this.f17248e).compose(mkd0.m154951C())).subscribe(mkd0.m154956H(new e30() { // from class: l.wmh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187075a.m29814q0((String) obj);
            }
        }, new e30() { // from class: l.xmh0
            @Override // p149l.e30
            public final void call(Object obj) {
                TTCameraPreviewPresenter.m29802e0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public void m29813p0() {
        lifecycle().subscribe(mkd0.m154956H(new e30() { // from class: l.umh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177251a.m29815r0((C4319c) obj);
            }
        }, new e30() { // from class: l.vmh0
            @Override // p149l.e30
            public final void call(Object obj) {
                TTCameraPreviewPresenter.m29809l0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m29814q0(String str) {
        this.f17245b.m29789s(rhi.m179355B(str));
        this.f17245b.m29786p(false);
        this.f17245b.m29787q(false);
        ((hnh0) this.viewModel).m131938s();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m29815r0(C4319c c4319c) {
        if (C4319c.f15547h.equals(c4319c)) {
            ((hnh0) this.viewModel).m131938s();
        } else if (C4319c.f15550k.equals(c4319c)) {
            ((hnh0) this.viewModel).m131939u();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m29816s0(String str, String str2) {
        LocalUrlMap localUrlMap = (LocalUrlMap) this.f17246c.m29824a();
        localUrlMap.saveUrlEntry(str2, str);
        this.f17246c.m29825b(localUrlMap);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m29817t0() {
        ((hnh0) this.viewModel).m131934m();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m29818u0() {
        ((hnh0) this.viewModel).m131931j();
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m29819x0(String str) {
        C4709b.m29826a().m29828c(new C4709b.b(1, this.f17245b.m29784n() ? 1000 : 1001, str));
        ((hnh0) this.viewModel).m131933l(str);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m29820y0(Throwable th) {
        C4709b.m29826a().m29828c(new C4709b.b(2, this.f17245b.m29784n() ? 1000 : 1001, null));
        ((hnh0) this.viewModel).m131932k(th);
    }

    /* JADX INFO: renamed from: z0 */
    public void m29821z0() {
        C22306c<String> c22306cM184966p;
        boolean zIsEmpty = TextUtils.isEmpty(this.f17245b.m29777f());
        TTCameraPreviewConfig tTCameraPreviewConfig = this.f17245b;
        if (zIsEmpty) {
            C4709b.m29826a().m29828c(new C4709b.b(2, tTCameraPreviewConfig.m29784n() ? 1000 : 1001, null));
            ((hnh0) this.viewModel).m131932k(new RuntimeException("file path is null or empty"));
            return;
        }
        boolean zM29782l = tTCameraPreviewConfig.m29782l();
        TTCameraPreviewConfig tTCameraPreviewConfig2 = this.f17245b;
        if (zM29782l) {
            boolean zM29784n = tTCameraPreviewConfig2.m29784n();
            smh0 smh0Var = this.f17247d;
            c22306cM184966p = zM29784n ? smh0Var.m184968s(this.f17245b.m29777f(), new f30() { // from class: l.ymh0
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f199016a.m29816s0((String) obj, (String) obj2);
                }
            }) : smh0Var.m184967r(this.f17245b.m29777f());
        } else {
            boolean zM29784n2 = tTCameraPreviewConfig2.m29784n();
            smh0 smh0Var2 = this.f17247d;
            c22306cM184966p = zM29784n2 ? smh0Var2.m184966p(this.f17245b.m29777f()) : smh0Var2.m184965o(this.f17245b.m29777f());
        }
        duringCreated(c22306cM184966p).observeOn(jo0.m142408a()).doOnSubscribe(new d30() { // from class: l.zmh0
            @Override // p149l.d30
            public final void call() {
                this.f203721a.m29817t0();
            }
        }).doOnUnsubscribe(new d30() { // from class: l.anh0
            @Override // p149l.d30
            public final void call() {
                this.f70738a.m29818u0();
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.bnh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76404a.m29819x0((String) obj);
            }
        }, new e30() { // from class: l.cnh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81663a.m29820y0((Throwable) obj);
            }
        }));
    }
}
