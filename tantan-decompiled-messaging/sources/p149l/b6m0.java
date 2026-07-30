package p149l;

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
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.CircleImageView;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundTextView;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class b6m0 extends o0n {

    /* JADX INFO: renamed from: h */
    public final String f73845h = "ca-app-pub-6567608331519569/1764451305";

    /* JADX INFO: renamed from: l.b6m0$a */
    public class C15817a implements C22306c.a<Pair<e520, String>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f73846a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f73847b;

        /* JADX INFO: renamed from: l.b6m0$a$a */
        public class a extends h70 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ z3g0 f73849a;

            public a(z3g0 z3g0Var) {
                this.f73849a = z3g0Var;
            }

            @Override // p149l.h70
            public void onAdClicked() {
                super.onAdClicked();
                zvf0.m220396r("e_intl_visitors_list_ads", "p_intl_visitors_list");
            }

            @Override // p149l.h70
            /* JADX INFO: renamed from: x */
            public void mo29990x(@NonNull irv irvVar) {
                super.mo29990x(irvVar);
                irvVar.toString();
                this.f73849a.m132487l(new Pair(null, C15817a.this.f73847b));
            }
        }

        public C15817a(Context context, String str) {
            this.f73846a = context;
            this.f73847b = str;
        }

        @Override // p149l.e30
        @SuppressLint({"MissingPermission"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(final z3g0<? super Pair<e520, String>> z3g0Var) {
            j70.C17709a c17709a = new j70.C17709a(this.f73846a, this.f73847b);
            final String str = this.f73847b;
            c17709a.m140068b(new e520.InterfaceC16544c() { // from class: l.a6m0
                @Override // p149l.e520.InterfaceC16544c
                /* JADX INFO: renamed from: a */
                public final void mo95151a(e520 e520Var) {
                    z3g0Var.m132487l(new Pair(e520Var, str));
                }
            });
            c17709a.m140069c(new a(z3g0Var)).m140070d(new i520.C17483a().m134461c(0).m134459a()).m140067a().m140064a(new w70.C20817a().m191886e(u0n.m191349g(true)).m201999i());
        }
    }

    /* JADX INFO: renamed from: l */
    private View m100432l(Act act, e520 e520Var) {
        if (e520Var == null) {
            return null;
        }
        NativeAdView nativeAdView = (NativeAdView) LayoutInflater.from(act).inflate(f6c0.f96109z3, (ViewGroup) null);
        nativeAdView.setHeadlineView(nativeAdView.findViewById(u4c0.f174405p));
        nativeAdView.setBodyView(nativeAdView.findViewById(u4c0.f174388o));
        nativeAdView.setIconView(nativeAdView.findViewById(u4c0.f174354m));
        if (nativeAdView.getHeadlineView() instanceof TextView) {
            ((TextView) nativeAdView.getHeadlineView()).setText(e520Var.mo98606d());
        }
        if (nativeAdView.getBodyView() instanceof TextView) {
            ((TextView) nativeAdView.getBodyView()).setText(e520Var.mo98604b());
        }
        if (nativeAdView.getIconView() instanceof CircleImageView) {
            CircleImageView circleImageView = (CircleImageView) nativeAdView.getIconView();
            Drawable drawableMo114778a = NullChecker.m81303a(e520Var.mo98607e()) ? e520Var.mo98607e().mo114778a() : null;
            if (drawableMo114778a == null) {
                drawableMo114778a = e520Var.mo98608f().mo120410b();
            }
            circleImageView.setImageDrawable(drawableMo114778a);
        }
        nativeAdView.setCallToActionView(nativeAdView.findViewById(u4c0.f174219e));
        nativeAdView.setNativeAd(e520Var);
        RoundTextView roundTextView = (RoundTextView) nativeAdView.findViewById(u4c0.f173904L0);
        if (CoreModule.f17545c.f19672p0.m173364l3()) {
            roundTextView.setBackgroundColor(Color.parseColor("#9379AF"));
            roundTextView.setTextColor(Color.parseColor("#FFFFFF"));
            return nativeAdView;
        }
        if (CoreModule.f17545c.f19672p0.m173361i3()) {
            roundTextView.setBackgroundColor(Color.parseColor("#FFDEA2"));
            roundTextView.setTextColor(Color.parseColor(Constants.BLACK));
            return nativeAdView;
        }
        roundTextView.setBackgroundColor(Color.parseColor("#FE7E1D"));
        roundTextView.setTextColor(Color.parseColor("#FFFFFF"));
        return nativeAdView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ View m100433m(Act act, Pair pair) {
        if (!NullChecker.m81303a(pair.first)) {
            return null;
        }
        e520 e520Var = (e520) pair.first;
        this.f141343a = e520Var;
        return m100432l(act, e520Var);
    }

    /* JADX INFO: renamed from: n */
    private C22306c<Pair<e520, String>> m100434n(Context context, String str) {
        return C22306c.create(new C15817a(context, str));
    }

    /* JADX INFO: renamed from: o */
    private C22306c<View> m100435o(final Act act) {
        return act.duringCreated(m100434n(act, "ca-app-pub-6567608331519569/1764451305")).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.z5m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f201833a.m100433m(act, (Pair) obj);
            }
        });
    }

    @Override // p149l.d70
    /* JADX INFO: renamed from: b */
    public boolean mo100436b() {
        return true;
    }

    @Override // p149l.d70
    /* JADX INFO: renamed from: c */
    public C22306c<View> mo100437c(Act act) {
        if (!r70.m178118g().m178119f()) {
            return C22306c.just(null);
        }
        mo100438h(act, null);
        return m100435o(act);
    }

    @Override // p149l.o0n
    /* JADX INFO: renamed from: h */
    public void mo100438h(Act act, ViewGroup viewGroup) {
        super.mo100438h(act, viewGroup);
    }
}
