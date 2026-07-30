package p153l;

import com.google.android.gms.internal.ads.AbstractC2245p5;

/* JADX INFO: loaded from: classes6.dex */
public final class rhx0 implements dkx0 {

    /* JADX INFO: renamed from: a */
    public static final rhx0 f163322a = new rhx0();

    /* JADX INFO: renamed from: a */
    public static rhx0 m181568a() {
        return f163322a;
    }

    @Override // p153l.dkx0
    public final ckx0 zzb(Class cls) {
        if (!AbstractC2245p5.class.isAssignableFrom(cls)) {
            wg3.m206174a("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (ckx0) AbstractC2245p5.m13216l(cls.asSubclass(AbstractC2245p5.class)).mo12560H(3, null, null);
        } catch (Exception e) {
            vtq0.m202761a("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // p153l.dkx0
    public final boolean zzc(Class cls) {
        return AbstractC2245p5.class.isAssignableFrom(cls);
    }
}
