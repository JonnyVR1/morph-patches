package p153l;

import android.util.DisplayMetrics;
import android.view.Display;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.ads.AdView;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.admob.NavigationBarAdmobHelper;
import com.tencent.open.SocialConstants;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\n \u001a*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m88121d2 = {"Ll/sd2;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "type", "", "", "arr", "Lrx/c;", "Lcom/google/android/gms/ads/AdView;", "f", "(Lcom/p1/mobile/android/app/Act;I[Ljava/lang/String;)Lrx/c;", "adView", "adUnitID", "e", "(Lcom/google/android/gms/ads/AdView;Ljava/lang/String;I)Lrx/c;", "c", "(Lcom/p1/mobile/android/app/Act;I)Lcom/google/android/gms/ads/AdView;", "maxHeight", "padding", "Ll/w70;", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/android/app/Act;II)Ll/w70;", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class sd2 {

    @NotNull
    public static final sd2 INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG;

    /* JADX INFO: renamed from: l.sd2$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, m88121d2 = {"l/sd2$a", "Ll/d70;", "Ll/jtv;", "loadAdError", "", BaseSei.f14624X, "(Ll/jtv;)V", "A", "()V", "onAdClicked", "B", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20019a extends d70 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f167372a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gcg0<? super AdView> f167373b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AdView f167374c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f167375d;

        public C20019a(String str, gcg0<? super AdView> gcg0Var, AdView adView, int i) {
            this.f167372a = str;
            this.f167373b = gcg0Var;
            this.f167374c = adView;
            this.f167375d = i;
        }

        @Override // p153l.d70
        /* JADX INFO: renamed from: A */
        public void mo96609A() {
            super.mo96609A();
            String unused = sd2.TAG;
            this.f167373b.m137019l(this.f167374c);
        }

        @Override // p153l.d70
        /* JADX INFO: renamed from: B */
        public void mo30986B() {
            super.mo30986B();
            String unused = sd2.TAG;
        }

        @Override // p153l.d70
        public void onAdClicked() {
            super.onAdClicked();
            String unused = sd2.TAG;
            int i = this.f167375d;
            if (i == 5) {
                i4g0.m138520r("e_intl_visitors_list_ads", "p_intl_visitors_list");
            } else if (i == 2 || i == 10) {
                i4g0.m138520r("e_messages_ad", "p_messages_ad");
            }
        }

        @Override // p153l.d70
        /* JADX INFO: renamed from: x */
        public void mo30988x(jtv loadAdError) {
            loadAdError.getClass();
            super.mo30988x(loadAdError);
            String unused = sd2.TAG;
            Objects.toString(loadAdError);
            this.f167373b.m137019l(null);
        }
    }

    static {
        sd2 sd2Var = new sd2();
        INSTANCE = sd2Var;
        TAG = sd2Var.getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: a */
    public static void m185423a(AdView adView, String str, int i, gcg0 gcg0Var) {
        List<String> listM194281g;
        adView.setAdUnitId(str);
        s70.C19999a c19999a = new s70.C19999a();
        if (i == 7) {
            listM194281g = u2n.m194282h(false, true);
        } else {
            listM194281g = u2n.m194281g(i == 5);
        }
        adView.m12273b(c19999a.m179964e(listM194281g).m184941i());
        adView.setAdListener(new C20019a(str, gcg0Var, adView, i));
    }

    /* JADX INFO: renamed from: c */
    public final AdView m185425c(Act act, int type) {
        AdView adView = new AdView(act);
        int iM37151i = 100;
        int i = type == 2 ? 100 : 72;
        int i2 = type == 2 ? qa00.f156335v : qa00.f156321h;
        if (type == 10) {
            i2 = qa00.f156326m;
        } else if (type != 11) {
            iM37151i = i;
        } else {
            iM37151i = NavigationBarAdmobHelper.INSTANCE.m37151i();
            i2 = 0;
        }
        adView.setAdSize(m185426d(act, iM37151i, i2));
        return adView;
    }

    /* JADX INFO: renamed from: d */
    public final w70 m185426d(Act act, int maxHeight, int padding) {
        Display defaultDisplay = act.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        try {
            w70 w70VarM205212c = w70.m205212c((int) ((displayMetrics.widthPixels - padding) / displayMetrics.density), maxHeight);
            w70VarM205212c.getClass();
            return w70VarM205212c;
        } catch (Exception unused) {
            w70 w70Var = w70.f187681i;
            w70Var.getClass();
            return w70Var;
        }
    }

    /* JADX INFO: renamed from: e */
    public final C22421c<AdView> m185427e(final AdView adView, final String adUnitID, final int type) {
        Objects.toString(adView);
        C22421c<AdView> c22421cCreate = C22421c.create(new C22421c.a() { // from class: l.rd2
            @Override // p153l.y20
            public final void call(Object obj) {
                sd2.m185423a(adView, adUnitID, type, (gcg0) obj);
            }
        });
        c22421cCreate.getClass();
        return c22421cCreate;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final C22421c<AdView> m185428f(@NotNull Act act, int type, @NotNull String... arr) {
        act.getClass();
        arr.getClass();
        if (arr.length == 0) {
            C22421c<AdView> c22421cJust = C22421c.just(null);
            c22421cJust.getClass();
            return c22421cJust;
        }
        C22421c<AdView> c22421cDuringCreated = act.duringCreated(m185427e(m185425c(act, type), arr[0], type));
        c22421cDuringCreated.getClass();
        return c22421cDuringCreated;
    }
}
