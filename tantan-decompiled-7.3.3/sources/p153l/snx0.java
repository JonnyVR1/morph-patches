package p153l;

import com.google.android.gms.internal.play_billing.AbstractC2403d0;

/* JADX INFO: loaded from: classes6.dex */
public final class snx0 implements pvx0 {

    /* JADX INFO: renamed from: a */
    public static final snx0 f169790a = new snx0();

    /* JADX INFO: renamed from: a */
    public static snx0 m187028a() {
        return f169790a;
    }

    @Override // p153l.pvx0
    public final lvx0 zzb(Class cls) {
        if (!AbstractC2403d0.class.isAssignableFrom(cls)) {
            wg3.m206174a("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (lvx0) AbstractC2403d0.m14812l(cls.asSubclass(AbstractC2403d0.class)).mo14801h(3, null, null);
        } catch (Exception e) {
            vtq0.m202761a("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // p153l.pvx0
    public final boolean zzc(Class cls) {
        return AbstractC2403d0.class.isAssignableFrom(cls);
    }
}
