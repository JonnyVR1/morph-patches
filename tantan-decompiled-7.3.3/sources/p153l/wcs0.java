package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzbe;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class wcs0 {

    /* JADX INFO: renamed from: a */
    public final String f188495a;

    /* JADX INFO: renamed from: b */
    public final String f188496b;

    /* JADX INFO: renamed from: c */
    public final String f188497c;

    /* JADX INFO: renamed from: d */
    public final long f188498d;

    /* JADX INFO: renamed from: e */
    public final long f188499e;

    /* JADX INFO: renamed from: f */
    public final zzbe f188500f;

    public wcs0(atx0 atx0Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzbe zzbeVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.f188495a = str2;
        this.f188496b = str3;
        this.f188497c = TextUtils.isEmpty(str) ? null : str;
        this.f188498d = j;
        this.f188499e = j2;
        if (j2 != 0 && j2 > j) {
            atx0Var.zzj().m114563F().m153301b("Event created with reverse previous/current timestamps. appId", d6x0.m114551p(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzbeVar = new zzbe(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    atx0Var.zzj().m114558A().m153300a("Param name can't be null");
                    it.remove();
                } else {
                    Object objM136357m0 = atx0Var.m100286G().m136357m0(next, bundle2.get(next));
                    if (objM136357m0 == null) {
                        atx0Var.zzj().m114563F().m153301b("Param value can't be null", atx0Var.m100312y().m208451f(next));
                        it.remove();
                    } else {
                        atx0Var.m100286G().m136330I(bundle2, next, objM136357m0);
                    }
                }
            }
            zzbeVar = new zzbe(bundle2);
        }
        this.f188500f = zzbeVar;
    }

    /* JADX INFO: renamed from: a */
    public final wcs0 m205823a(atx0 atx0Var, long j) {
        return new wcs0(atx0Var, this.f188497c, this.f188495a, this.f188496b, this.f188498d, j, this.f188500f);
    }

    public final String toString() {
        return "Event{appId='" + this.f188495a + "', name='" + this.f188496b + "', params=" + String.valueOf(this.f188500f) + "}";
    }

    public wcs0(atx0 atx0Var, String str, String str2, String str3, long j, long j2, zzbe zzbeVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzbeVar);
        this.f188495a = str2;
        this.f188496b = str3;
        this.f188497c = TextUtils.isEmpty(str) ? null : str;
        this.f188498d = j;
        this.f188499e = j2;
        if (j2 != 0 && j2 > j) {
            atx0Var.zzj().m114563F().m153302c("Event created with reverse previous/current timestamps. appId, name", d6x0.m114551p(str2), d6x0.m114551p(str3));
        }
        this.f188500f = zzbeVar;
    }
}
