package p149l;

import com.idv.identity.base.algorithm.IIdentityDelegate;
import com.idv.identity.base.algorithm.IdentityAlgConfig;
import com.idv.identity.service.IdentityFaceService;

/* JADX INFO: loaded from: classes7.dex */
public final class noq0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ IdentityAlgConfig f139862a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IIdentityDelegate f139863b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ IdentityFaceService f139864c;

    public noq0(IdentityFaceService identityFaceService, IdentityAlgConfig identityAlgConfig, IIdentityDelegate iIdentityDelegate) {
        this.f139864c = identityFaceService;
        this.f139862a = identityAlgConfig;
        this.f139863b = iIdentityDelegate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f139864c.configAndLoadModel(this.f139862a, this.f139863b);
    }
}
