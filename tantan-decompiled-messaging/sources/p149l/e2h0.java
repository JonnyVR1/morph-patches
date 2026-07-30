package p149l;

import com.bytedance.realx.video.SurfaceTextureHelper;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e2h0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SurfaceTextureHelper f88920a;

    public /* synthetic */ e2h0(SurfaceTextureHelper surfaceTextureHelper) {
        this.f88920a = surfaceTextureHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f88920a.returnTextureFrame();
    }
}
