package p153l;

import com.idv.identity.service.algorithm.IdentityFace;

/* JADX INFO: loaded from: classes7.dex */
public final class j4r0 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            IdentityFace.reset();
        } catch (Throwable th) {
            o6r0.m166283c("IdentityFaceService IdentityFace reset error :" + th.getMessage());
        }
    }
}
