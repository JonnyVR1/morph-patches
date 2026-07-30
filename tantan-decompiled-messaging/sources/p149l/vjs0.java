package p149l;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzapi;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class vjs0 {

    /* JADX INFO: renamed from: a */
    public static gnr0 f181746a;

    /* JADX INFO: renamed from: b */
    public static final Object f181747b = new Object();

    /* JADX INFO: renamed from: c */
    @Deprecated
    public static final qds0 f181748c = new s9s0();

    /* JADX WARN: Code duplicated, block: B:16:0x0036 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:7:0x0010, B:9:0x0014, B:11:0x001d, B:13:0x002f, B:17:0x003b, B:16:0x0036, B:18:0x003d), top: B:22:0x0010 }] */
    public vjs0(Context context) {
        gnr0 gnr0VarM189927a;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f181747b) {
            try {
                if (f181746a == null) {
                    m7s0.m153417a(context);
                    if (ClientLibraryUtils.isPackageSide()) {
                        gnr0VarM189927a = tor0.m189927a(context, null);
                    } else {
                        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132382r4)).booleanValue()) {
                            gnr0VarM189927a = byr0.m104508b(context);
                        } else {
                            gnr0VarM189927a = tor0.m189927a(context, null);
                        }
                    }
                    f181746a = gnr0VarM189927a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final gnr m198685a(String str) {
        n3t0 n3t0Var = new n3t0();
        f181746a.m127181a(new mis0(str, null, n3t0Var));
        return n3t0Var;
    }

    /* JADX INFO: renamed from: b */
    public final gnr m198686b(int i, String str, @Nullable Map map, @Nullable byte[] bArr) {
        ggs0 ggs0Var = new ggs0(null);
        abs0 abs0Var = new abs0(this, str, ggs0Var);
        w2t0 w2t0Var = new w2t0(null);
        gcs0 gcs0Var = new gcs0(this, i, str, ggs0Var, abs0Var, bArr, map, w2t0Var);
        if (w2t0.m201220k()) {
            try {
                w2t0Var.m201225d(str, "GET", gcs0Var.mo112665p(), gcs0Var.mo112654B());
            } catch (zzapi e) {
                x2t0.m206869g(e.getMessage());
            }
        }
        f181746a.m127181a(gcs0Var);
        return ggs0Var;
    }
}
