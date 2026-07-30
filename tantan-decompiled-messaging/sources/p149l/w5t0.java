package p149l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcfr;
import com.p046p1.mobile.putong.core.data.GameIdentity;
import com.tencent.open.SocialConstants;

/* JADX INFO: loaded from: classes6.dex */
public final class w5t0 {

    /* JADX INFO: renamed from: a */
    public final Context f184745a;

    /* JADX INFO: renamed from: b */
    public final String f184746b;

    /* JADX INFO: renamed from: c */
    public final zzcei f184747c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final b8s0 f184748d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final e8s0 f184749e;

    /* JADX INFO: renamed from: f */
    public final k8s0 f184750f;

    /* JADX INFO: renamed from: g */
    public final long[] f184751g;

    /* JADX INFO: renamed from: h */
    public final String[] f184752h;

    /* JADX INFO: renamed from: i */
    public boolean f184753i;

    /* JADX INFO: renamed from: j */
    public boolean f184754j;

    /* JADX INFO: renamed from: k */
    public boolean f184755k;

    /* JADX INFO: renamed from: l */
    public boolean f184756l;

    /* JADX INFO: renamed from: m */
    public boolean f184757m;

    /* JADX INFO: renamed from: n */
    public zzcfr f184758n;

    /* JADX INFO: renamed from: o */
    public boolean f184759o;

    /* JADX INFO: renamed from: p */
    public boolean f184760p;

    /* JADX INFO: renamed from: q */
    public long f184761q;

    public w5t0(Context context, zzcei zzceiVar, String str, @Nullable e8s0 e8s0Var, @Nullable b8s0 b8s0Var) {
        c6s0 c6s0Var = new c6s0();
        c6s0Var.m105506a("min_1", Double.MIN_VALUE, 1.0d);
        c6s0Var.m105506a("1_5", 1.0d, 5.0d);
        c6s0Var.m105506a("5_10", 5.0d, 10.0d);
        c6s0Var.m105506a("10_20", 10.0d, 20.0d);
        c6s0Var.m105506a("20_30", 20.0d, 30.0d);
        c6s0Var.m105506a("30_max", 30.0d, Double.MAX_VALUE);
        this.f184750f = c6s0Var.m105507b();
        this.f184753i = false;
        this.f184754j = false;
        this.f184755k = false;
        this.f184756l = false;
        this.f184761q = -1L;
        this.f184745a = context;
        this.f184747c = zzceiVar;
        this.f184746b = str;
        this.f184749e = e8s0Var;
        this.f184748d = b8s0Var;
        String str2 = (String) d1s0.m109677c().m144697a(m7s0.f131844A);
        if (str2 == null) {
            this.f184752h = new String[0];
            this.f184751g = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, Constants.SEPARATOR_COMMA);
        int length = strArrSplit.length;
        this.f184752h = new String[length];
        this.f184751g = new long[length];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                this.f184751g[i] = Long.parseLong(strArrSplit[i]);
            } catch (NumberFormatException e) {
                x2t0.m206870h("Unable to parse frame hash target time number.", e);
                this.f184751g[i] = -1;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m201687a(zzcfr zzcfrVar) {
        w7s0.m202071a(this.f184749e, this.f184748d, "vpc2");
        this.f184753i = true;
        this.f184749e.m115282d("vpn", zzcfrVar.mo13576q());
        this.f184758n = zzcfrVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m201688b() {
        if (!this.f184753i || this.f184754j) {
            return;
        }
        w7s0.m202071a(this.f184749e, this.f184748d, "vfr2");
        this.f184754j = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m201689c() {
        this.f184757m = true;
        if (!this.f184754j || this.f184755k) {
            return;
        }
        w7s0.m202071a(this.f184749e, this.f184748d, "vfp2");
        this.f184755k = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m201690d() {
        if (!((Boolean) qas0.f153568a.m115379e()).booleanValue() || this.f184759o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString(SocialConstants.TYPE_REQUEST, this.f184746b);
        bundle.putString(GameIdentity.player, this.f184758n.mo13576q());
        for (h5s0 h5s0Var : this.f184750f.m144970a()) {
            String strValueOf = String.valueOf(h5s0Var.f105979a);
            bundle.putString("fps_c_".concat(strValueOf), Integer.toString(h5s0Var.f105983e));
            String strValueOf2 = String.valueOf(h5s0Var.f105979a);
            bundle.putString("fps_p_".concat(strValueOf2), Double.toString(h5s0Var.f105982d));
        }
        int i = 0;
        while (true) {
            long[] jArr = this.f184751g;
            if (i >= jArr.length) {
                vny0.m199080r().m12338J(this.f184745a, this.f184747c.zza, "gmob-apps", bundle, true);
                this.f184759o = true;
                return;
            }
            String str = this.f184752h[i];
            if (str != null) {
                bundle.putString("fh_".concat(Long.valueOf(jArr[i]).toString()), str);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m201691e() {
        this.f184757m = false;
    }

    /* JADX INFO: renamed from: f */
    public final void m201692f(zzcfr zzcfrVar) {
        if (this.f184755k && !this.f184756l) {
            if (xsu0.m210836m() && !this.f184756l) {
                xsu0.m210834k("VideoMetricsMixin first frame");
            }
            w7s0.m202071a(this.f184749e, this.f184748d, "vff2");
            this.f184756l = true;
        }
        long jNanoTime = vny0.m199064b().nanoTime();
        if (this.f184757m && this.f184760p) {
            long j = this.f184761q;
            if (j != -1) {
                this.f184750f.m144971b(1.0E9d / (jNanoTime - j));
            }
        }
        this.f184760p = this.f184757m;
        this.f184761q = jNanoTime;
        long jLongValue = ((Long) d1s0.m109677c().m144697a(m7s0.f131856B)).longValue();
        long jMo13568i = zzcfrVar.mo13568i();
        int i = 0;
        while (true) {
            String[] strArr = this.f184752h;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] == null && jLongValue > Math.abs(jMo13568i - this.f184751g[i])) {
                String[] strArr2 = this.f184752h;
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
