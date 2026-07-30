package p153l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.util.Clock;
import java.util.Calendar;
import java.util.Locale;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
public final class o7s0 extends mzx0 {

    /* JADX INFO: renamed from: c */
    public long f145295c;

    /* JADX INFO: renamed from: d */
    public String f145296d;

    public o7s0(atx0 atx0Var) {
        super(atx0Var);
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ ajr0 mo15139a() {
        return super.mo15139a();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ o7s0 mo15140b() {
        return super.mo15140b();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ wxw0 mo15141c() {
        return super.mo15141c();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ ajx0 mo15142d() {
        return super.mo15142d();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ hny0 mo15143e() {
        return super.mo15143e();
    }

    @Override // p153l.yyx0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo15144f() {
        super.mo15144f();
    }

    @Override // p153l.yyx0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ void mo15145g() {
        super.mo15145g();
    }

    @Override // p153l.yyx0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo15146h() {
        super.mo15146h();
    }

    @Override // p153l.mzx0
    /* JADX INFO: renamed from: n */
    public final boolean mo98519n() {
        Calendar calendar = Calendar.getInstance();
        this.f145295c = ((long) (calendar.get(15) + calendar.get(16))) / Constants.ONE_MIN_IN_MILLIS;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f145296d = language.toLowerCase(locale2) + "-" + locale.getCountry().toLowerCase(locale2);
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final long m166364o() {
        m160930j();
        return this.f145295c;
    }

    /* JADX INFO: renamed from: p */
    public final String m166365p() {
        m160930j();
        return this.f145296d;
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ zbr0 zzd() {
        return super.zzd();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ d6x0 zzj() {
        return super.zzj();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ qsx0 zzl() {
        return super.zzl();
    }
}
