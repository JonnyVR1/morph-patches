package p153l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcfr;
import com.p051p1.mobile.putong.core.data.GameIdentity;
import com.tencent.open.SocialConstants;

/* JADX INFO: loaded from: classes6.dex */
public final class cft0 {

    /* JADX INFO: renamed from: a */
    public final Context f81564a;

    /* JADX INFO: renamed from: b */
    public final String f81565b;

    /* JADX INFO: renamed from: c */
    public final zzcei f81566c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final hhs0 f81567d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final khs0 f81568e;

    /* JADX INFO: renamed from: f */
    public final qhs0 f81569f;

    /* JADX INFO: renamed from: g */
    public final long[] f81570g;

    /* JADX INFO: renamed from: h */
    public final String[] f81571h;

    /* JADX INFO: renamed from: i */
    public boolean f81572i;

    /* JADX INFO: renamed from: j */
    public boolean f81573j;

    /* JADX INFO: renamed from: k */
    public boolean f81574k;

    /* JADX INFO: renamed from: l */
    public boolean f81575l;

    /* JADX INFO: renamed from: m */
    public boolean f81576m;

    /* JADX INFO: renamed from: n */
    public zzcfr f81577n;

    /* JADX INFO: renamed from: o */
    public boolean f81578o;

    /* JADX INFO: renamed from: p */
    public boolean f81579p;

    /* JADX INFO: renamed from: q */
    public long f81580q;

    public cft0(Context context, zzcei zzceiVar, String str, @Nullable khs0 khs0Var, @Nullable hhs0 hhs0Var) {
        ifs0 ifs0Var = new ifs0();
        ifs0Var.m139747a("min_1", Double.MIN_VALUE, 1.0d);
        ifs0Var.m139747a("1_5", 1.0d, 5.0d);
        ifs0Var.m139747a("5_10", 5.0d, 10.0d);
        ifs0Var.m139747a("10_20", 10.0d, 20.0d);
        ifs0Var.m139747a("20_30", 20.0d, 30.0d);
        ifs0Var.m139747a("30_max", 30.0d, Double.MAX_VALUE);
        this.f81569f = ifs0Var.m139748b();
        this.f81572i = false;
        this.f81573j = false;
        this.f81574k = false;
        this.f81575l = false;
        this.f81580q = -1L;
        this.f81564a = context;
        this.f81566c = zzceiVar;
        this.f81565b = str;
        this.f81568e = khs0Var;
        this.f81567d = hhs0Var;
        String str2 = (String) jas0.m144075c().m176505a(sgs0.f167915A);
        if (str2 == null) {
            this.f81571h = new String[0];
            this.f81570g = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, Constants.SEPARATOR_COMMA);
        int length = strArrSplit.length;
        this.f81571h = new String[length];
        this.f81570g = new long[length];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                this.f81570g[i] = Long.parseLong(strArrSplit[i]);
            } catch (NumberFormatException e) {
                dct0.m115299h("Unable to parse frame hash target time number.", e);
                this.f81570g[i] = -1;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m109597a(zzcfr zzcfrVar) {
        chs0.m109843a(this.f81568e, this.f81567d, "vpc2");
        this.f81572i = true;
        this.f81568e.m149821d("vpn", zzcfrVar.mo13630q());
        this.f81577n = zzcfrVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m109598b() {
        if (!this.f81572i || this.f81573j) {
            return;
        }
        chs0.m109843a(this.f81568e, this.f81567d, "vfr2");
        this.f81573j = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m109599c() {
        this.f81576m = true;
        if (!this.f81573j || this.f81574k) {
            return;
        }
        chs0.m109843a(this.f81568e, this.f81567d, "vfp2");
        this.f81574k = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m109600d() {
        if (!((Boolean) wjs0.f189494a.m149974e()).booleanValue() || this.f81578o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString(SocialConstants.TYPE_REQUEST, this.f81565b);
        bundle.putString(GameIdentity.player, this.f81577n.mo13630q());
        for (nes0 nes0Var : this.f81569f.m176614a()) {
            String strValueOf = String.valueOf(nes0Var.f141679a);
            bundle.putString("fps_c_".concat(strValueOf), Integer.toString(nes0Var.f141683e));
            String strValueOf2 = String.valueOf(nes0Var.f141679a);
            bundle.putString("fps_p_".concat(strValueOf2), Double.toString(nes0Var.f141682d));
        }
        int i = 0;
        while (true) {
            long[] jArr = this.f81570g;
            if (i >= jArr.length) {
                bxy0.m106934r().m12392J(this.f81564a, this.f81566c.zza, "gmob-apps", bundle, true);
                this.f81578o = true;
                return;
            }
            String str = this.f81571h[i];
            if (str != null) {
                bundle.putString("fh_".concat(Long.valueOf(jArr[i]).toString()), str);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m109601e() {
        this.f81576m = false;
    }

    /* JADX INFO: renamed from: f */
    public final void m109602f(zzcfr zzcfrVar) {
        if (this.f81574k && !this.f81575l) {
            if (d2v0.m113739m() && !this.f81575l) {
                d2v0.m113737k("VideoMetricsMixin first frame");
            }
            chs0.m109843a(this.f81568e, this.f81567d, "vff2");
            this.f81575l = true;
        }
        long jNanoTime = bxy0.m106918b().nanoTime();
        if (this.f81576m && this.f81579p) {
            long j = this.f81580q;
            if (j != -1) {
                this.f81569f.m176615b(1.0E9d / (jNanoTime - j));
            }
        }
        this.f81579p = this.f81576m;
        this.f81580q = jNanoTime;
        long jLongValue = ((Long) jas0.m144075c().m176505a(sgs0.f167927B)).longValue();
        long jMo13622i = zzcfrVar.mo13622i();
        int i = 0;
        while (true) {
            String[] strArr = this.f81571h;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] == null && jLongValue > Math.abs(jMo13622i - this.f81570g[i])) {
                String[] strArr2 = this.f81571h;
                int i2 = 8;
                Bitmap bitmap = zzcfrVar.getBitmap(8, 8);
                long j2 = 63;
                int i3 = 0;
                long j3 = 0;
                while (i3 < i2) {
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j3 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1L : 0L) << ((int) j2);
                        j2--;
                        i4++;
                        i2 = 8;
                    }
                    i3++;
                    i2 = 8;
                }
                strArr2[i] = String.format("%016X", Long.valueOf(j3));
                return;
            }
            i++;
        }
    }
}
