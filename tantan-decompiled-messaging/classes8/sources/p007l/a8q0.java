package p007l;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class a8q0 extends cse {

    /* JADX INFO: renamed from: e */
    public Surface f1837e;

    /* JADX INFO: renamed from: f */
    public boolean f1838f;

    public a8q0(cre creVar, Surface surface, boolean z) {
        super(creVar);
        m8798a(surface);
        this.f1837e = surface;
        this.f1838f = z;
    }

    public a8q0(cre creVar, SurfaceTexture surfaceTexture) {
        super(creVar);
        m8798a(surfaceTexture);
    }
}
