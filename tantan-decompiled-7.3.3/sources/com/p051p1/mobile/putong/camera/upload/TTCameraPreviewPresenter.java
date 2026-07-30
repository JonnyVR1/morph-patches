package com.p051p1.mobile.putong.camera.upload;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.camera.TTCameraConfig;
import com.p051p1.mobile.putong.camera.upload.TTCameraPreviewPresenter;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import p137rx.C22421c;
import p153l.ar2;
import p153l.fo0;
import p153l.hxd0;
import p153l.ner;
import p153l.oki;
import p153l.ovh0;
import p153l.psd0;
import p153l.x20;
import p153l.xth0;
import p153l.y20;
import p153l.z20;
import p153l.zuh0;

/* JADX INFO: loaded from: classes9.dex */
public class TTCameraPreviewPresenter extends ar2<ovh0> {

    /* JADX INFO: renamed from: a */
    public final TTCameraConfig f17963a;

    /* JADX INFO: renamed from: b */
    public final TTCameraPreviewConfig f17964b;

    /* JADX INFO: renamed from: c */
    public C4859a<LocalUrlMap> f17965c;

    /* JADX INFO: renamed from: d */
    public final zuh0 f17966d;

    /* JADX INFO: renamed from: e */
    public final String f17967e;

    public static class LocalUrlMap implements C4859a.a<LocalUrlMap>, Serializable {
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

        @Override // com.p051p1.mobile.putong.camera.upload.C4859a.a
        public void nullCheck() {
            if (this.map == null) {
                this.map = new HashMap<>();
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.p051p1.mobile.putong.camera.upload.C4859a.a
        public LocalUrlMap trimAndCopy() {
            return new LocalUrlMap(this.map);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TTCameraPreviewPresenter(ner nerVar, @Nullable TTCameraConfig tTCameraConfig, TTCameraPreviewConfig tTCameraPreviewConfig) {
        super(nerVar);
        this.f17965c = new C4859a<>(LocalUrlMap.class, "camera_video_map", new LocalUrlMap(null), true, hxd0.DEFAULT_FILE_NAME);
        this.f17966d = new zuh0();
        this.f17967e = xth0.m213086f();
        this.f17963a = tTCameraConfig;
        this.f17964b = tTCameraPreviewConfig;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m30800e0(Throwable th) {
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m30807l0(Throwable th) {
    }

    @Override // p153l.k3m
    public void destroy() {
        ((ovh0) this.viewModel).destroy();
        xth0.m213081a();
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m30809n0() {
        if (!this.f17964b.m30778i()) {
            return false;
        }
        String str = (String) ((LocalUrlMap) this.f17965c.m30822a()).map.get(this.f17964b.m30777h());
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.f17964b.m30787s(str);
        this.f17964b.m30784p(false);
        this.f17964b.m30785q(false);
        return true;
    }

    /* JADX INFO: renamed from: o0 */
    public void m30810o0() {
        if (new File(this.f17967e).exists()) {
            return;
        }
        duringCreated((C22421c) this.f17966d.m221660n(this.f17964b.m30777h(), this.f17967e).compose(psd0.m173592C())).subscribe(psd0.m173597H(new y20() { // from class: l.dvh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90929a.m30812q0((String) obj);
            }
        }, new y20() { // from class: l.evh0
            @Override // p153l.y20
            public final void call(Object obj) {
                TTCameraPreviewPresenter.m30800e0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public void m30811p0() {
        lifecycle().subscribe(psd0.m173597H(new y20() { // from class: l.bvh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78597a.m30813r0((C4470c) obj);
            }
        }, new y20() { // from class: l.cvh0
            @Override // p153l.y20
            public final void call(Object obj) {
                TTCameraPreviewPresenter.m30807l0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m30812q0(String str) {
        this.f17964b.m30787s(oki.m168011B(str));
        this.f17964b.m30784p(false);
        this.f17964b.m30785q(false);
        ((ovh0) this.viewModel).m169450s();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m30813r0(C4470c c4470c) {
        if (C4470c.f16266h.equals(c4470c)) {
            ((ovh0) this.viewModel).m169450s();
        } else if (C4470c.f16269k.equals(c4470c)) {
            ((ovh0) this.viewModel).m169451u();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m30814s0(String str, String str2) {
        LocalUrlMap localUrlMap = (LocalUrlMap) this.f17965c.m30822a();
        localUrlMap.saveUrlEntry(str2, str);
        this.f17965c.m30823b(localUrlMap);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m30815t0() {
        ((ovh0) this.viewModel).m169446m();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m30816u0() {
        ((ovh0) this.viewModel).m169443j();
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m30817x0(String str) {
        C4860b.m30824a().m30826c(new C4860b.b(1, this.f17964b.m30782n() ? 1000 : 1001, str));
        ((ovh0) this.viewModel).m169445l(str);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m30818y0(Throwable th) {
        C4860b.m30824a().m30826c(new C4860b.b(2, this.f17964b.m30782n() ? 1000 : 1001, null));
        ((ovh0) this.viewModel).m169444k(th);
    }

    /* JADX INFO: renamed from: z0 */
    public void m30819z0() {
        C22421c<String> c22421cM221662p;
        boolean zIsEmpty = TextUtils.isEmpty(this.f17964b.m30775f());
        TTCameraPreviewConfig tTCameraPreviewConfig = this.f17964b;
        if (zIsEmpty) {
            C4860b.m30824a().m30826c(new C4860b.b(2, tTCameraPreviewConfig.m30782n() ? 1000 : 1001, null));
            ((ovh0) this.viewModel).m169444k(new RuntimeException("file path is null or empty"));
            return;
        }
        boolean zM30780l = tTCameraPreviewConfig.m30780l();
        TTCameraPreviewConfig tTCameraPreviewConfig2 = this.f17964b;
        if (zM30780l) {
            boolean zM30782n = tTCameraPreviewConfig2.m30782n();
            zuh0 zuh0Var = this.f17966d;
            c22421cM221662p = zM30782n ? zuh0Var.m221664s(this.f17964b.m30775f(), new z20() { // from class: l.fvh0
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f101044a.m30814s0((String) obj, (String) obj2);
                }
            }) : zuh0Var.m221663r(this.f17964b.m30775f());
        } else {
            boolean zM30782n2 = tTCameraPreviewConfig2.m30782n();
            zuh0 zuh0Var2 = this.f17966d;
            c22421cM221662p = zM30782n2 ? zuh0Var2.m221662p(this.f17964b.m30775f()) : zuh0Var2.m221661o(this.f17964b.m30775f());
        }
        duringCreated(c22421cM221662p).observeOn(fo0.m126432a()).doOnSubscribe(new x20() { // from class: l.gvh0
            @Override // p153l.x20
            public final void call() {
                this.f106647a.m30815t0();
            }
        }).doOnUnsubscribe(new x20() { // from class: l.hvh0
            @Override // p153l.x20
            public final void call() {
                this.f111761a.m30816u0();
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.ivh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117070a.m30817x0((String) obj);
            }
        }, new y20() { // from class: l.jvh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122803a.m30818y0((Throwable) obj);
            }
        }));
    }
}
