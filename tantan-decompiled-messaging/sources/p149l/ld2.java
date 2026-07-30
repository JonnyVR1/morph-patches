package p149l;

import android.util.DisplayMetrics;
import android.view.Display;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.ads.AdView;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.admob.NavigationBarAdmobHelper;
import com.tencent.open.SocialConstants;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\n \u001a*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m87232d2 = {"Ll/ld2;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "type", "", "", "arr", "Lrx/c;", "Lcom/google/android/gms/ads/AdView;", "f", "(Lcom/p1/mobile/android/app/Act;I[Ljava/lang/String;)Lrx/c;", "adView", "adUnitID", "e", "(Lcom/google/android/gms/ads/AdView;Ljava/lang/String;I)Lrx/c;", "c", "(Lcom/p1/mobile/android/app/Act;I)Lcom/google/android/gms/ads/AdView;", "maxHeight", "padding", "Ll/a80;", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/android/app/Act;II)Ll/a80;", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ld2 {

    @NotNull
    public static final ld2 INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG;

    /* JADX INFO: renamed from: l.ld2$a */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, m87232d2 = {"l/ld2$a", "Ll/h70;", "Ll/irv;", "loadAdError", "", BaseSei.f13930X, "(Ll/irv;)V", "A", "()V", "onAdClicked", "B", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C18192a extends h70 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f127493a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ z3g0<? super AdView> f127494b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AdView f127495c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f127496d;

        public C18192a(String str, z3g0<? super AdView> z3g0Var, AdView adView, int i) {
            this.f127493a = str;
            this.f127494b = z3g0Var;
            this.f127495c = adView;
            this.f127496d = i;
        }

        @Override // p149l.h70
        /* JADX INFO: renamed from: A */
        public void mo98570A() {
            super.mo98570A();
            String unused = ld2.TAG;
            this.f127494b.m132487l(this.f127495c);
        }

        @Override // p149l.h70
        /* JADX INFO: renamed from: B */
        public void mo29988B() {
            super.mo29988B();
            String unused = ld2.TAG;
        }

        @Override // p149l.h70
        public void onAdClicked() {
            super.onAdClicked();
            String unused = ld2.TAG;
            int i = this.f127496d;
            if (i == 5) {
                zvf0.m220396r("e_intl_visitors_list_ads", "p_intl_visitors_list");
            } else if (i == 2 || i == 10) {
                zvf0.m220396r("e_messages_ad", "p_messages_ad");
            }
        }

        @Override // p149l.h70
        /* JADX INFO: renamed from: x */
        public void mo29990x(irv loadAdError) {
            loadAdError.getClass();
            super.mo29990x(loadAdError);
            String unused = ld2.TAG;
            Objects.toString(loadAdError);
            this.f127494b.m132487l(null);
        }
    }

    static {
        ld2 ld2Var = new ld2();
        INSTANCE = ld2Var;
        TAG = ld2Var.getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: a */
    public static void m149383a(AdView adView, String str, int i, z3g0 z3g0Var) {
        List<String> listM191349g;
        adView.setAdUnitId(str);
        w70.C20817a c20817a = new w70.C20817a();
        if (i == 7) {
            listM191349g = u0n.m191350h(false, true);
        } else {
            listM191349g = u0n.m191349g(i == 5);
        }
        adView.m12219b(c20817a.m191886e(listM191349g).m201999i());
        adView.setAdListener(new C18192a(str, z3g0Var, adView, i));
    }

    /* JADX INFO: renamed from: c */
    public final AdView m149385c(Act act, int type) {
        AdView adView = new AdView(act);
        int iM36148i = 100;
        int i = type == 2 ? 100 : 72;
        int i2 = type == 2 ? t100.f167273v : t100.f167259h;
        if (type == 10) {
            i2 = t100.f167264m;
        } else if (type != 11) {
            iM36148i = i;
        } else {
            iM36148i = NavigationBarAdmobHelper.INSTANCE.m36148i();
            i2 = 0;
        }
        adView.setAdSize(m149386d(act, iM36148i, i2));
        return adView;
    }

    /* JADX INFO: renamed from: d */
    public final a80 m149386d(Act act, int maxHeight, int padding) {
        Display defaultDisplay = act.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        try {
            a80 a80VarM95309c = a80.m95309c((int) ((displayMetrics.widthPixels - padding) / displayMetrics.density), maxHeight);
            a80VarM95309c.getClass();
            return a80VarM95309c;
        } catch (Exception unused) {
            a80 a80Var = a80.f67968i;
            a80Var.getClass();
            return a80Var;
        }
    }

    /* JADX INFO: renamed from: e */
    public final C22306c<AdView> m149387e(final AdView adView, final String adUnitID, final int type) {
        Objects.toString(adView);
        C22306c<AdView> c22306cCreate = C22306c.create(new C22306c.a() { // from class: l.kd2
            @Override // p149l.e30
            public final void call(Object obj) {
                ld2.m149383a(adView, adUnitID, type, (z3g0) obj);
            }
        });
        c22306cCreate.getClass();
        return c22306cCreate;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final C22306c<AdView> m149388f(@NotNull Act act, int type, @NotNull String... arr) {
        act.getClass();
        arr.getClass();
        if (arr.length == 0) {
            C22306c<AdView> c22306cJust = C22306c.just(null);
            c22306cJust.getClass();
            return c22306cJust;
        }
        C22306c<AdView> c22306cDuringCreated = act.duringCreated(m149387e(m149385c(act, type), arr[0], type));
        c22306cDuringCreated.getClass();
        return c22306cDuringCreated;
    }
}
