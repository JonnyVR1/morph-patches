package p153l;

import com.google.android.gms.internal.measurement.AbstractC2372u0;

/* JADX INFO: loaded from: classes6.dex */
public final class e2y0 implements l8y0 {

    /* JADX INFO: renamed from: a */
    public static final e2y0 f91877a = new e2y0();

    /* JADX INFO: renamed from: a */
    public static e2y0 m119201a() {
        return f91877a;
    }

    @Override // p153l.l8y0
    public final h9y0 zza(Class<?> cls) {
        if (!AbstractC2372u0.class.isAssignableFrom(cls)) {
            wg3.m206174a("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (h9y0) AbstractC2372u0.m14397j(cls.asSubclass(AbstractC2372u0.class)).mo13848k(AbstractC2372u0.e.f10302c, null, null);
        } catch (Exception e) {
            vtq0.m202761a("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // p153l.l8y0
    public final boolean zzb(Class<?> cls) {
        return AbstractC2372u0.class.isAssignableFrom(cls);
    }
}
