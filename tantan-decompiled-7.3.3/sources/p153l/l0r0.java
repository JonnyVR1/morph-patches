package p153l;

import com.idv.identity.base.algorithm.IDFrame;
import com.idv.identity.service.IdentityFaceService;
import com.idv.identity.service.algorithm.IdentityFace;

/* JADX INFO: loaded from: classes7.dex */
public final class l0r0 extends o4r0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IdentityFaceService f129584b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0r0(IdentityFaceService identityFaceService, IDFrame iDFrame) {
        super(iDFrame);
        this.f129584b = identityFaceService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f129584b.preProcess();
        IdentityFace.processImage(this.f145005a);
        if (this.f129584b.mDebugToolIdentityFaceService != null) {
            this.f129584b.mDebugToolIdentityFaceService.mo130090j(this.f145005a);
        }
        this.f129584b.mImageProcessing.set(false);
    }
}
