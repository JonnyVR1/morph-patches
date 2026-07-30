package p153l;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes6.dex */
public final class c4x0 extends ThreadLocal {
    /* JADX INFO: renamed from: a */
    public static final Cipher m107974a() {
        try {
            return (Cipher) cfx0.f81598b.m109659a("AES/GCM/NoPadding");
        } catch (GeneralSecurityException e) {
            xpg0.m212648a(e);
            return null;
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return m107974a();
    }
}
