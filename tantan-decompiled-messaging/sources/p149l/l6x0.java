package p149l;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes6.dex */
public final class l6x0 extends ThreadLocal {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ m6x0 f126680a;

    public l6x0(m6x0 m6x0Var) {
        this.f126680a = m6x0Var;
    }

    @Override // java.lang.ThreadLocal
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        try {
            Mac mac = (Mac) w5x0.f184788c.m201729a(this.f126680a.f131775b);
            mac.init(this.f126680a.f131776c);
            return mac;
        } catch (GeneralSecurityException e) {
            phg0.m168968a(e);
            return null;
        }
    }
}
