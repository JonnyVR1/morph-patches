package p149l;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class g2u0 {

    /* JADX INFO: renamed from: a */
    public final int f100289a;

    /* JADX INFO: renamed from: b */
    public final int f100290b;

    /* JADX INFO: renamed from: c */
    public final int f100291c;

    /* JADX INFO: renamed from: d */
    public final int f100292d;

    /* JADX INFO: renamed from: e */
    public int f100293e;

    /* JADX INFO: renamed from: f */
    public int f100294f;

    /* JADX INFO: renamed from: g */
    public boolean f100295g;

    /* JADX INFO: renamed from: h */
    public final zzgaa f100296h;

    /* JADX INFO: renamed from: i */
    public final zzgaa f100297i;

    /* JADX INFO: renamed from: j */
    public final int f100298j;

    /* JADX INFO: renamed from: k */
    public final int f100299k;

    /* JADX INFO: renamed from: l */
    public final zzgaa f100300l;

    /* JADX INFO: renamed from: m */
    public final z0u0 f100301m;

    /* JADX INFO: renamed from: n */
    public zzgaa f100302n;

    /* JADX INFO: renamed from: o */
    public int f100303o;

    /* JADX INFO: renamed from: p */
    public final HashMap f100304p;

    /* JADX INFO: renamed from: q */
    public final HashSet f100305q;

    public g2u0(m3u0 m3u0Var) {
        this.f100289a = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f100290b = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f100291c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f100292d = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f100293e = m3u0Var.f131167i;
        this.f100294f = m3u0Var.f131168j;
        this.f100295g = m3u0Var.f131169k;
        this.f100296h = m3u0Var.f131170l;
        this.f100297i = m3u0Var.f131172n;
        this.f100298j = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f100299k = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f100300l = m3u0Var.f131176r;
        this.f100301m = m3u0Var.f131177s;
        this.f100302n = m3u0Var.f131178t;
        this.f100303o = m3u0Var.f131179u;
        this.f100305q = new HashSet(m3u0Var.f131158B);
        this.f100304p = new HashMap(m3u0Var.f131157A);
    }

    /* JADX INFO: renamed from: e */
    public final g2u0 m124187e(Context context) {
        CaptioningManager captioningManager;
        if ((ggw0.f102568a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.f100303o = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f100302n = zzgaa.zzm(locale.toLanguageTag());
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public g2u0 mo124188f(int i, int i2, boolean z) {
        this.f100293e = i;
        this.f100294f = i2;
        this.f100295g = true;
        return this;
    }

    @Deprecated
    public g2u0() {
        this.f100289a = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f100290b = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f100291c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f100292d = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f100293e = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f100294f = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f100295g = true;
        this.f100296h = zzgaa.zzl();
        this.f100297i = zzgaa.zzl();
        this.f100298j = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f100299k = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f100300l = zzgaa.zzl();
        this.f100301m = z0u0.f201013b;
        this.f100302n = zzgaa.zzl();
        this.f100303o = 0;
        this.f100304p = new HashMap();
        this.f100305q = new HashSet();
    }
}
