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
import l.j760;
import l.jo0;
import l.u0n;
import l.vwb;
import l.w70;
import l.w9j;
import l.z3g0;
import l.zvf0;
import rx.c;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class o7y extends o0n {

    /* JADX INFO: renamed from: h */
    public final String f18062h = "ca-app-pub-6567608331519569/1764451305";

    /* JADX INFO: renamed from: l.o7y$a */
    public class C1077a implements c.a<Pair<e520, String>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f18063a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f18064b;

        /* JADX INFO: renamed from: l.o7y$a$a */
        public class a extends h70 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ z3g0 f18066a;

            public a(z3g0 z3g0Var) {
                this.f18066a = z3g0Var;
            }

            public void onAdClicked() {
                super.onAdClicked();
                zvf0.u("e_intl_meet_avatar_click", "p_intl_meet_view", new j760[]{vwb.Y("avatar_click_from", "visitor_ad")});
            }

            /* JADX INFO: renamed from: x */
            public void m20429x(@NonNull irv irvVar) {
                super.x(irvVar);
                irvVar.toString();
                this.f18066a.onNext(new Pair(null, C1077a.this.f18064b));
            }
        }

        public C1077a(Context context, String str) {
            this.f18063a = context;
            this.f18064b = str;
        }

        @SuppressLint({"MissingPermission"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(final z3g0<? super Pair<e520, String>> z3g0Var) {
            j70.a aVar = new j70.a(this.f18063a, this.f18064b);
            final String str = this.f18064b;
            aVar.b(new e520.c() { // from class: l.n7y
                /* JADX INFO: renamed from: a */
                public final void m19704a(e520 e520Var) {
                    z3g0Var.onNext(new Pair(e520Var, str));
                }
            });
            aVar.c(new a(z3g0Var)).d(new i520.a().c(0).a()).a().a(new w70.a().e(u0n.g(true)).i());
        }
    }

    /* JADX INFO: renamed from: l */
    private View m20421l(Act act, e520 e520Var) {
        if (e520Var == null) {
            return null;
        }
        NativeAdView nativeAdViewInflate = LayoutInflater.from(act).inflate(f6c0.f12490x3, (ViewGroup) null);
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
        if (CoreModule.f1534c.f3661p0.m21965i3()) {
            vText.setBackgroundColor(Color.parseColor("#FFDEA2"));
            vText.setTextColor(Color.parseColor("#000000"));
            return nativeAdViewInflate;
        }
        if (CoreModule.f1534c.f3661p0.m21966j3()) {
            vText.setBackgroundColor(Color.parseColor("#FE7E1D"));
            vText.setTextColor(Color.parseColor("#FFFFFF"));
            return nativeAdViewInflate;
        }
        vText.setBackgroundColor(Color.parseColor("#9379AF"));
        vText.setTextColor(Color.parseColor("#FFFFFF"));
        return nativeAdViewInflate;
    }

    /* JADX INFO: renamed from: n */
    private c<Pair<e520, String>> m20422n(Context context, String str) {
        return c.create(new C1077a(context, str));
    }

    /* JADX INFO: renamed from: b */
    public boolean m20423b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public c<View> m20424c(Act act) {
        if (!r70.m22713g().m22714f()) {
            return c.just((Object) null);
        }
        mo12565h(act, null);
        return m20426o(act);
    }

    @Override // p006l.o0n
    /* JADX INFO: renamed from: h */
    public void mo12565h(Act act, ViewGroup viewGroup) {
        super.mo12565h(act, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ View m20425m(Act act, Pair pair) {
        if (!NullChecker.a(pair.first)) {
            return null;
        }
        e520 e520Var = (e520) pair.first;
        this.f17964a = e520Var;
        return m20421l(act, e520Var);
    }

    /* JADX INFO: renamed from: o */
    public final c<View> m20426o(final Act act) {
        return act.duringCreated(m20422n(act, "ca-app-pub-6567608331519569/1764451305")).observeOn(jo0.a()).map(new w9j() { // from class: l.m7y
            public final Object call(Object obj) {
                return this.f16841a.m20425m(act, (Pair) obj);
            }
        });
    }
}
