package p006l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.roundcorners.view.CircleImageView;
import com.p000p1.mobile.putong.core.p004ui.roundcorners.view.RoundTextView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.e520;
import l.h70;
import l.i520;
import l.irv;
import l.j70;
import l.jo0;
import l.u0n;
import l.w70;
import l.w9j;
import l.z3g0;
import l.zvf0;
import rx.c;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class b6m0 extends o0n {

    /* JADX INFO: renamed from: h */
    public final String f8754h = "ca-app-pub-6567608331519569/1764451305";

    /* JADX INFO: renamed from: l.b6m0$a */
    public class C0548a implements c.a<Pair<e520, String>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f8755a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f8756b;

        /* JADX INFO: renamed from: l.b6m0$a$a */
        public class a extends h70 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ z3g0 f8758a;

            public a(z3g0 z3g0Var) {
                this.f8758a = z3g0Var;
            }

            public void onAdClicked() {
                super.onAdClicked();
                zvf0.r("e_intl_visitors_list_ads", "p_intl_visitors_list");
            }

            /* JADX INFO: renamed from: x */
            public void m12568x(@NonNull irv irvVar) {
                super.x(irvVar);
                irvVar.toString();
                this.f8758a.onNext(new Pair(null, C0548a.this.f8756b));
            }
        }

        public C0548a(Context context, String str) {
            this.f8755a = context;
            this.f8756b = str;
        }

        @SuppressLint({"MissingPermission"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(final z3g0<? super Pair<e520, String>> z3g0Var) {
            j70.a aVar = new j70.a(this.f8755a, this.f8756b);
            final String str = this.f8756b;
            aVar.b(new e520.c() { // from class: l.a6m0
                /* JADX INFO: renamed from: a */
                public final void m11757a(e520 e520Var) {
                    z3g0Var.onNext(new Pair(e520Var, str));
                }
            });
            aVar.c(new a(z3g0Var)).d(new i520.a().c(0).a()).a().a(new w70.a().e(u0n.g(true)).i());
        }
    }

    /* JADX INFO: renamed from: l */
    private View m12559l(Act act, e520 e520Var) {
        if (e520Var == null) {
            return null;
        }
        NativeAdView nativeAdViewInflate = LayoutInflater.from(act).inflate(f6c0.f12523z3, (ViewGroup) null);
        nativeAdViewInflate.setHeadlineView(nativeAdViewInflate.findViewById(u4c0.f23153p));
        nativeAdViewInflate.setBodyView(nativeAdViewInflate.findViewById(u4c0.f23136o));
        nativeAdViewInflate.setIconView(nativeAdViewInflate.findViewById(u4c0.f23102m));
        if (nativeAdViewInflate.getHeadlineView() instanceof TextView) {
            ((TextView) nativeAdViewInflate.getHeadlineView()).setText(e520Var.d());
        }
        if (nativeAdViewInflate.getBodyView() instanceof TextView) {
            ((TextView) nativeAdViewInflate.getBodyView()).setText(e520Var.b());
        }
        if (nativeAdViewInflate.getIconView() instanceof CircleImageView) {
            CircleImageView circleImageView = (CircleImageView) nativeAdViewInflate.getIconView();
            Drawable drawableA = NullChecker.a(e520Var.e()) ? e520Var.e().a() : null;
            if (drawableA == null) {
                drawableA = e520Var.f().b();
            }
            circleImageView.setImageDrawable(drawableA);
        }
        nativeAdViewInflate.setCallToActionView(nativeAdViewInflate.findViewById(u4c0.f22967e));
        nativeAdViewInflate.setNativeAd(e520Var);
        VText vText = (RoundTextView) nativeAdViewInflate.findViewById(u4c0.f22652L0);
        if (CoreModule.f1534c.f3661p0.m21968l3()) {
            vText.setBackgroundColor(Color.parseColor("#9379AF"));
            vText.setTextColor(Color.parseColor("#FFFFFF"));
            return nativeAdViewInflate;
        }
        if (CoreModule.f1534c.f3661p0.m21965i3()) {
            vText.setBackgroundColor(Color.parseColor("#FFDEA2"));
            vText.setTextColor(Color.parseColor("#000000"));
            return nativeAdViewInflate;
        }
        vText.setBackgroundColor(Color.parseColor("#FE7E1D"));
        vText.setTextColor(Color.parseColor("#FFFFFF"));
        return nativeAdViewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ View m12560m(Act act, Pair pair) {
        if (!NullChecker.a(pair.first)) {
            return null;
        }
        e520 e520Var = (e520) pair.first;
        this.f17964a = e520Var;
        return m12559l(act, e520Var);
    }

    /* JADX INFO: renamed from: n */
    private c<Pair<e520, String>> m12561n(Context context, String str) {
        return c.create(new C0548a(context, str));
    }

    /* JADX INFO: renamed from: o */
    private c<View> m12562o(final Act act) {
        return act.duringCreated(m12561n(act, "ca-app-pub-6567608331519569/1764451305")).observeOn(jo0.a()).map(new w9j() { // from class: l.z5m0
            public final Object call(Object obj) {
                return this.f28648a.m12560m(act, (Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public boolean m12563b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public c<View> m12564c(Act act) {
        if (!r70.m22713g().m22714f()) {
            return c.just((Object) null);
        }
        mo12565h(act, null);
        return m12562o(act);
    }

    @Override // p006l.o0n
    /* JADX INFO: renamed from: h */
    public void mo12565h(Act act, ViewGroup viewGroup) {
        super.mo12565h(act, viewGroup);
    }
}
