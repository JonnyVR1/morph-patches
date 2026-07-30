package p149l;

import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzje;
import com.google.android.gms.measurement.internal.zzjh;

/* JADX INFO: loaded from: classes6.dex */
public final class bpv0 {

    /* JADX INFO: renamed from: a */
    public final zzjh f76682a;

    public bpv0(zzjh zzjhVar) {
        this.f76682a = zzjhVar;
    }

    /* JADX INFO: renamed from: b */
    public static bpv0 m103094b(String str) {
        return new bpv0((TextUtils.isEmpty(str) || str.length() > 1) ? zzjh.UNINITIALIZED : zzje.m15336g(str.charAt(0)));
    }

    /* JADX INFO: renamed from: a */
    public final zzjh m103095a() {
        return this.f76682a;
    }

    /* JADX INFO: renamed from: c */
    public final String m103096c() {
        return String.valueOf(zzje.m15332a(this.f76682a));
    }
}
