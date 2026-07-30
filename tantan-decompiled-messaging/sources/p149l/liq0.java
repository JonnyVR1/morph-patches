package p149l;

import com.idv.identity.service.IdentityFaceService;
import com.idv.identity.service.algorithm.IdentityFace;

/* JADX INFO: loaded from: classes7.dex */
public final class liq0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ IdentityFaceService f128244a;

    public liq0(IdentityFaceService identityFaceService) {
        this.f128244a = identityFaceService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f128244a.initResult) {
                IdentityFace.release();
            }
        } catch (Throwable th) {
            ixq0.m138886c("IdentityFaceService IdentityFace release error :" + th.getMessage());
        }
    }
}
