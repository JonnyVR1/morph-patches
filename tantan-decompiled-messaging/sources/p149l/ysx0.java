package p149l;

import com.google.android.gms.internal.measurement.AbstractC2349u0;

/* JADX INFO: loaded from: classes6.dex */
public final class ysx0 implements fzx0 {

    /* JADX INFO: renamed from: a */
    public static final ysx0 f199846a = new ysx0();

    /* JADX INFO: renamed from: a */
    public static ysx0 m215956a() {
        return f199846a;
    }

    @Override // p149l.fzx0
    public final b0y0 zza(Class<?> cls) {
        if (!AbstractC2349u0.class.isAssignableFrom(cls)) {
            ig3.m135964a("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (b0y0) AbstractC2349u0.m14343j(cls.asSubclass(AbstractC2349u0.class)).mo13794k(AbstractC2349u0.e.f10265c, null, null);
        } catch (Exception e) {
            pkq0.m170054a("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // p149l.fzx0
    public final boolean zzb(Class<?> cls) {
        return AbstractC2349u0.class.isAssignableFrom(cls);
    }
}
