package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class ehy0 implements fhy0 {

    /* JADX INFO: renamed from: a */
    public static final mhx0<Boolean> f91527a;

    /* JADX INFO: renamed from: b */
    public static final mhx0<Boolean> f91528b;

    /* JADX INFO: renamed from: c */
    public static final mhx0<Boolean> f91529c;

    /* JADX INFO: renamed from: d */
    public static final mhx0<Boolean> f91530d;

    /* JADX INFO: renamed from: e */
    public static final mhx0<Boolean> f91531e;

    static {
        uix0 uix0VarM193968e = new uix0(rhx0.m179466a("com.google.android.gms.measurement")).m193969f().m193968e();
        f91527a = uix0VarM193968e.m193967d("measurement.sgtm.google_signal.enable", false);
        f91528b = uix0VarM193968e.m193967d("measurement.sgtm.preview_mode_enabled", true);
        f91529c = uix0VarM193968e.m193967d("measurement.sgtm.rollout_percentage_fix", false);
        f91530d = uix0VarM193968e.m193967d("measurement.sgtm.service", true);
        f91531e = uix0VarM193968e.m193967d("measurement.sgtm.upload_queue", false);
        uix0VarM193968e.m193965b("measurement.id.sgtm", 0L);
    }

    @Override // p149l.fhy0
    public final boolean zza() {
        return true;
    }

    @Override // p149l.fhy0
    public final boolean zzb() {
        return f91527a.m154651b().booleanValue();
    }

    @Override // p149l.fhy0
    public final boolean zzc() {
        return f91528b.m154651b().booleanValue();
    }

    @Override // p149l.fhy0
    public final boolean zzd() {
        return f91529c.m154651b().booleanValue();
    }

    @Override // p149l.fhy0
    public final boolean zze() {
        return f91530d.m154651b().booleanValue();
    }

    @Override // p149l.fhy0
    public final boolean zzf() {
        return f91531e.m154651b().booleanValue();
    }
}
