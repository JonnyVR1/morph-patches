package p153l;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes6.dex */
public final class rfx0 extends ThreadLocal {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sfx0 f162889a;

    public rfx0(sfx0 sfx0Var) {
        this.f162889a = sfx0Var;
    }

    @Override // java.lang.ThreadLocal
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        try {
            Mac mac = (Mac) cfx0.f81599c.m109659a(this.f162889a.f167779b);
            mac.init(this.f162889a.f167780c);
            return mac;
        } catch (GeneralSecurityException e) {
            xpg0.m212648a(e);
            return null;
        }
    }
}
