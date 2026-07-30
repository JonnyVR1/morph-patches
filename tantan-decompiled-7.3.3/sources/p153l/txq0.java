package p153l;

import com.idv.identity.base.algorithm.IIdentityDelegate;
import com.idv.identity.base.algorithm.IdentityAlgConfig;
import com.idv.identity.service.IdentityFaceService;

/* JADX INFO: loaded from: classes7.dex */
public final class txq0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ IdentityAlgConfig f176589a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IIdentityDelegate f176590b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ IdentityFaceService f176591c;

    public txq0(IdentityFaceService identityFaceService, IdentityAlgConfig identityAlgConfig, IIdentityDelegate iIdentityDelegate) {
        this.f176591c = identityFaceService;
        this.f176589a = identityAlgConfig;
        this.f176590b = iIdentityDelegate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f176591c.configAndLoadModel(this.f176589a, this.f176590b);
    }
}
