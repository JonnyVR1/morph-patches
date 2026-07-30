package p006l;

import android.util.DisplayMetrics;
import android.view.Display;
import com.google.android.gms.ads.AdView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.newui.admob.NavigationBarAdmobHelper;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import l.a80;
import l.h70;
import l.irv;
import l.t100;
import l.u0n;
import l.w70;
import l.z3g0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\n \u001a*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Ll/ld2;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "", "type", "", "", "arr", "Lrx/c;", "Lcom/google/android/gms/ads/AdView;", "f", "(Lcom/p1/mobile/android/app/Act;I[Ljava/lang/String;)Lrx/c;", "adView", "adUnitID", "e", "(Lcom/google/android/gms/ads/AdView;Ljava/lang/String;I)Lrx/c;", "c", "(Lcom/p1/mobile/android/app/Act;I)Lcom/google/android/gms/ads/AdView;", "maxHeight", "padding", "Ll/a80;", "d", "(Lcom/p1/mobile/android/app/Act;II)Ll/a80;", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ld2 {

    @NotNull
    public static final ld2 INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG;

    /* JADX INFO: renamed from: l.ld2$a */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"l/ld2$a", "Ll/h70;", "Ll/irv;", "loadAdError", "", "x", "(Ll/irv;)V", "A", "()V", "onAdClicked", "B", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0969a extends h70 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f16331a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ z3g0<? super AdView> f16332b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AdView f16333c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f16334d;

        public C0969a(String str, z3g0<? super AdView> z3g0Var, AdView adView, int i) {
            this.f16331a = str;
            this.f16332b = z3g0Var;
            this.f16333c = adView;
            this.f16334d = i;
        }

        /* JADX INFO: renamed from: A */
        public void m18656A() {
            super.A();
            String unused = ld2.TAG;
            this.f16332b.onNext(this.f16333c);
        }

        /* JADX INFO: renamed from: B */
        public void m18657B() {
            super.B();
            String unused = ld2.TAG;
        }

        public void onAdClicked() {
            super.onAdClicked();
            String unused = ld2.TAG;
            int i = this.f16334d;
            if (i == 5) {
                zvf0.r("e_intl_visitors_list_ads", "p_intl_visitors_list");
            } else if (i == 2 || i == 10) {
                zvf0.r("e_messages_ad", "p_messages_ad");
            }
        }

        /* JADX INFO: renamed from: x */
        public void m18658x(irv loadAdError) {
            loadAdError.getClass();
            super.x(loadAdError);
            String unused = ld2.TAG;
            Objects.toString(loadAdError);
            this.f16332b.onNext((Object) null);
        }
    }

    static {
        ld2 ld2Var = new ld2();
        INSTANCE = ld2Var;
        TAG = ld2Var.getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: a */
    public static void m18650a(AdView adView, String str, int i, z3g0 z3g0Var) {
        List listG;
        adView.setAdUnitId(str);
        w70.a aVar = new w70.a();
        if (i == 7) {
            listG = u0n.h(false, true);
        } else {
            listG = u0n.g(i == 5);
        }
        adView.b(aVar.e(listG).i());
        adView.setAdListener(new C0969a(str, z3g0Var, adView, i));
    }

    /* JADX INFO: renamed from: c */
    public final AdView m18652c(Act act, int type) {
        AdView adView = new AdView(act);
        int i = 100;
        int i2 = type == 2 ? 100 : 72;
        int i3 = type == 2 ? t100.v : t100.h;
        if (type == 10) {
            i3 = t100.m;
        } else if (type != 11) {
            i = i2;
        } else {
            i = NavigationBarAdmobHelper.INSTANCE.i();
            i3 = 0;
        }
        adView.setAdSize(m18653d(act, i, i3));
        return adView;
    }

    /* JADX INFO: renamed from: d */
    public final a80 m18653d(Act act, int maxHeight, int padding) {
        Display defaultDisplay = act.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        try {
            a80 a80VarC = a80.c((int) ((displayMetrics.widthPixels - padding) / displayMetrics.density), maxHeight);
            a80VarC.getClass();
            return a80VarC;
        } catch (Exception unused) {
            a80 a80Var = a80.i;
            a80Var.getClass();
            return a80Var;
        }
    }

    /* JADX INFO: renamed from: e */
    public final c<AdView> m18654e(final AdView adView, final String adUnitID, final int type) {
        Objects.toString(adView);
        c<AdView> cVarCreate = c.create(new c.a() { // from class: l.kd2
            public final void call(Object obj) {
                ld2.m18650a(adView, adUnitID, type, (z3g0) obj);
            }
        });
        cVarCreate.getClass();
        return cVarCreate;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final c<AdView> m18655f(@NotNull Act act, int type, @NotNull String... arr) {
        act.getClass();
        arr.getClass();
        if (arr.length == 0) {
            c<AdView> cVarJust = c.just((Object) null);
            cVarJust.getClass();
            return cVarJust;
        }
        c<AdView> cVarDuringCreated = act.duringCreated(m18654e(m18652c(act, type), arr[0], type));
        cVarDuringCreated.getClass();
        return cVarDuringCreated;
    }
}
