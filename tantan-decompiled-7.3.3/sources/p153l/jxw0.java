package p153l;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class jxw0 {

    /* JADX INFO: renamed from: a */
    public static final CopyOnWriteArrayList f123097a = new CopyOnWriteArrayList();

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static ixw0 m147444a(String str) throws GeneralSecurityException {
        for (ixw0 ixw0Var : f123097a) {
            if (ixw0Var.zza()) {
                return ixw0Var;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
