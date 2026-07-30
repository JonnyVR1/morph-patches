package p149l;

import com.google.android.gms.internal.play_billing.AbstractC2380d0;

/* JADX INFO: loaded from: classes6.dex */
public final class mex0 implements jmx0 {

    /* JADX INFO: renamed from: a */
    public static final mex0 f133519a = new mex0();

    /* JADX INFO: renamed from: a */
    public static mex0 m154339a() {
        return f133519a;
    }

    @Override // p149l.jmx0
    public final fmx0 zzb(Class cls) {
        if (!AbstractC2380d0.class.isAssignableFrom(cls)) {
            ig3.m135964a("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (fmx0) AbstractC2380d0.m14758l(cls.asSubclass(AbstractC2380d0.class)).mo14747h(3, null, null);
        } catch (Exception e) {
            pkq0.m170054a("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // p149l.jmx0
    public final boolean zzc(Class cls) {
        return AbstractC2380d0.class.isAssignableFrom(cls);
    }
}
