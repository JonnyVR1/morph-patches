package p153l;

import com.idv.identity.service.IdentityFaceService;
import com.idv.identity.service.algorithm.IdentityFace;

/* JADX INFO: loaded from: classes7.dex */
public final class qrq0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ IdentityFaceService f159157a;

    public qrq0(IdentityFaceService identityFaceService) {
        this.f159157a = identityFaceService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f159157a.initResult) {
                IdentityFace.release();
            }
        } catch (Throwable th) {
            o6r0.m166283c("IdentityFaceService IdentityFace release error :" + th.getMessage());
        }
    }
}
