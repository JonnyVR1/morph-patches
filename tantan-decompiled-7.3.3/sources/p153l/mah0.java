package p153l;

import com.bytedance.realx.video.SurfaceTextureHelper;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mah0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SurfaceTextureHelper f135521a;

    public /* synthetic */ mah0(SurfaceTextureHelper surfaceTextureHelper) {
        this.f135521a = surfaceTextureHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f135521a.returnTextureFrame();
    }
}
