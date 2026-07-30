package p149l;

import com.google.android.gms.internal.ads.AbstractC2222p5;

/* JADX INFO: loaded from: classes6.dex */
public final class l8x0 implements xax0 {

    /* JADX INFO: renamed from: a */
    public static final l8x0 f126865a = new l8x0();

    /* JADX INFO: renamed from: a */
    public static l8x0 m148953a() {
        return f126865a;
    }

    @Override // p149l.xax0
    public final wax0 zzb(Class cls) {
        if (!AbstractC2222p5.class.isAssignableFrom(cls)) {
            ig3.m135964a("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (wax0) AbstractC2222p5.m13162l(cls.asSubclass(AbstractC2222p5.class)).mo12506H(3, null, null);
        } catch (Exception e) {
            pkq0.m170054a("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // p149l.xax0
    public final boolean zzc(Class cls) {
        return AbstractC2222p5.class.isAssignableFrom(cls);
    }
}
