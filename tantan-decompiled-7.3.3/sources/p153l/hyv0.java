package p153l;

import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzje;
import com.google.android.gms.measurement.internal.zzjh;

/* JADX INFO: loaded from: classes6.dex */
public final class hyv0 {

    /* JADX INFO: renamed from: a */
    public final zzjh f112171a;

    public hyv0(zzjh zzjhVar) {
        this.f112171a = zzjhVar;
    }

    /* JADX INFO: renamed from: b */
    public static hyv0 m137781b(String str) {
        return new hyv0((TextUtils.isEmpty(str) || str.length() > 1) ? zzjh.UNINITIALIZED : zzje.m15390g(str.charAt(0)));
    }

    /* JADX INFO: renamed from: a */
    public final zzjh m137782a() {
        return this.f112171a;
    }

    /* JADX INFO: renamed from: c */
    public final String m137783c() {
        return String.valueOf(zzje.m15386a(this.f112171a));
    }
}
