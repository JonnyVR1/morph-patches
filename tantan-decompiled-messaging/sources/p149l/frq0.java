package p149l;

import com.idv.identity.base.algorithm.IDFrame;
import com.idv.identity.service.IdentityFaceService;
import com.idv.identity.service.algorithm.IdentityFace;

/* JADX INFO: loaded from: classes7.dex */
public final class frq0 extends ivq0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IdentityFaceService f98994b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public frq0(IdentityFaceService identityFaceService, IDFrame iDFrame) {
        super(iDFrame);
        this.f98994b = identityFaceService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f98994b.preProcess();
        IdentityFace.processImage(this.f115192a);
        if (this.f98994b.mDebugToolIdentityFaceService != null) {
            this.f98994b.mDebugToolIdentityFaceService.mo173889j(this.f115192a);
        }
        this.f98994b.mImageProcessing.set(false);
    }
}
