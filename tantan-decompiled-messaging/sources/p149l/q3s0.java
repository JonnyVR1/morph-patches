package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzbe;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class q3s0 {

    /* JADX INFO: renamed from: a */
    public final String f152507a;

    /* JADX INFO: renamed from: b */
    public final String f152508b;

    /* JADX INFO: renamed from: c */
    public final String f152509c;

    /* JADX INFO: renamed from: d */
    public final long f152510d;

    /* JADX INFO: renamed from: e */
    public final long f152511e;

    /* JADX INFO: renamed from: f */
    public final zzbe f152512f;

    public q3s0(ujx0 ujx0Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzbe zzbeVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.f152507a = str2;
        this.f152508b = str3;
        this.f152509c = TextUtils.isEmpty(str) ? null : str;
        this.f152510d = j;
        this.f152511e = j2;
        if (j2 != 0 && j2 > j) {
            ujx0Var.zzj().m211417F().m123937b("Event created with reverse previous/current timestamps. appId", xww0.m211405p(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzbeVar = new zzbe(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    ujx0Var.zzj().m211412A().m123936a("Param name can't be null");
                    it.remove();
                } else {
                    Object objM101491m0 = ujx0Var.m194106G().m101491m0(next, bundle2.get(next));
                    if (objM101491m0 == null) {
                        ujx0Var.zzj().m211417F().m123937b("Param value can't be null", ujx0Var.m194132y().m175778f(next));
                        it.remove();
                    } else {
                        ujx0Var.m194106G().m101463I(bundle2, next, objM101491m0);
                    }
                }
            }
            zzbeVar = new zzbe(bundle2);
        }
        this.f152512f = zzbeVar;
    }

    /* JADX INFO: renamed from: a */
    public final q3s0 m172920a(ujx0 ujx0Var, long j) {
        return new q3s0(ujx0Var, this.f152509c, this.f152507a, this.f152508b, this.f152510d, j, this.f152512f);
    }

    public final String toString() {
        return "Event{appId='" + this.f152507a + "', name='" + this.f152508b + "', params=" + String.valueOf(this.f152512f) + "}";
    }

    public q3s0(ujx0 ujx0Var, String str, String str2, String str3, long j, long j2, zzbe zzbeVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzbeVar);
        this.f152507a = str2;
        this.f152508b = str3;
        this.f152509c = TextUtils.isEmpty(str) ? null : str;
        this.f152510d = j;
        this.f152511e = j2;
        if (j2 != 0 && j2 > j) {
            ujx0Var.zzj().m211417F().m123938c("Event created with reverse previous/current timestamps. appId, name", xww0.m211405p(str2), xww0.m211405p(str3));
        }
        this.f152512f = zzbeVar;
    }
}
