package p149l;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class dow0 {

    /* JADX INFO: renamed from: a */
    public static final CopyOnWriteArrayList f87211a = new CopyOnWriteArrayList();

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static cow0 m112830a(String str) throws GeneralSecurityException {
        for (cow0 cow0Var : f87211a) {
            if (cow0Var.zza()) {
                return cow0Var;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
