package p153l;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class mbu0 {

    /* JADX INFO: renamed from: a */
    public final int f135749a;

    /* JADX INFO: renamed from: b */
    public final int f135750b;

    /* JADX INFO: renamed from: c */
    public final int f135751c;

    /* JADX INFO: renamed from: d */
    public final int f135752d;

    /* JADX INFO: renamed from: e */
    public int f135753e;

    /* JADX INFO: renamed from: f */
    public int f135754f;

    /* JADX INFO: renamed from: g */
    public boolean f135755g;

    /* JADX INFO: renamed from: h */
    public final zzgaa f135756h;

    /* JADX INFO: renamed from: i */
    public final zzgaa f135757i;

    /* JADX INFO: renamed from: j */
    public final int f135758j;

    /* JADX INFO: renamed from: k */
    public final int f135759k;

    /* JADX INFO: renamed from: l */
    public final zzgaa f135760l;

    /* JADX INFO: renamed from: m */
    public final fau0 f135761m;

    /* JADX INFO: renamed from: n */
    public zzgaa f135762n;

    /* JADX INFO: renamed from: o */
    public int f135763o;

    /* JADX INFO: renamed from: p */
    public final HashMap f135764p;

    /* JADX INFO: renamed from: q */
    public final HashSet f135765q;

    public mbu0(scu0 scu0Var) {
        this.f135749a = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f135750b = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f135751c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f135752d = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f135753e = scu0Var.f167328i;
        this.f135754f = scu0Var.f167329j;
        this.f135755g = scu0Var.f167330k;
        this.f135756h = scu0Var.f167331l;
        this.f135757i = scu0Var.f167333n;
        this.f135758j = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f135759k = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f135760l = scu0Var.f167337r;
        this.f135761m = scu0Var.f167338s;
        this.f135762n = scu0Var.f167339t;
        this.f135763o = scu0Var.f167340u;
        this.f135765q = new HashSet(scu0Var.f167319B);
        this.f135764p = new HashMap(scu0Var.f167318A);
    }

    /* JADX INFO: renamed from: e */
    public final mbu0 m157897e(Context context) {
        CaptioningManager captioningManager;
        if ((mpw0.f137957a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.f135763o = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f135762n = zzgaa.zzm(locale.toLanguageTag());
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public mbu0 mo124103f(int i, int i2, boolean z) {
        this.f135753e = i;
        this.f135754f = i2;
        this.f135755g = true;
        return this;
    }

    @Deprecated
    public mbu0() {
        this.f135749a = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f135750b = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f135751c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f135752d = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f135753e = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f135754f = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f135755g = true;
        this.f135756h = zzgaa.zzl();
        this.f135757i = zzgaa.zzl();
        this.f135758j = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f135759k = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f135760l = zzgaa.zzl();
        this.f135761m = fau0.f98010b;
        this.f135762n = zzgaa.zzl();
        this.f135763o = 0;
        this.f135764p = new HashMap();
        this.f135765q = new HashSet();
    }
}
