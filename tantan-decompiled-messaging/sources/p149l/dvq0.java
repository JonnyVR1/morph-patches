package p149l;

import com.idv.identity.service.algorithm.IdentityFace;

/* JADX INFO: loaded from: classes7.dex */
public final class dvq0 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            IdentityFace.reset();
        } catch (Throwable th) {
            ixq0.m138886c("IdentityFaceService IdentityFace reset error :" + th.getMessage());
        }
    }
}
