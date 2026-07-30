package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.CircleImageView;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundTextView;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class ffm0 extends o2n {

    /* JADX INFO: renamed from: h */
    public final String f98807h = "ca-app-pub-6567608331519569/1764451305";

    /* JADX INFO: renamed from: l.ffm0$a */
    public class C16967a implements C22421c.a<Pair<md20, String>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f98808a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f98809b;

        /* JADX INFO: renamed from: l.ffm0$a$a */
        public class a extends d70 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ gcg0 f98811a;

            public a(gcg0 gcg0Var) {
                this.f98811a = gcg0Var;
            }

            @Override // p153l.d70
            public void onAdClicked() {
                super.onAdClicked();
                i4g0.m138520r("e_intl_visitors_list_ads", "p_intl_visitors_list");
            }

            @Override // p153l.d70
            /* JADX INFO: renamed from: x */
            public void mo30988x(@NonNull jtv jtvVar) {
                super.mo30988x(jtvVar);
                jtvVar.toString();
                this.f98811a.m137019l(new Pair(null, C16967a.this.f98809b));
            }
        }

        public C16967a(Context context, String str) {
            this.f98808a = context;
            this.f98809b = str;
        }

        @Override // p153l.y20
        @SuppressLint({"MissingPermission"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(final gcg0<? super Pair<md20, String>> gcg0Var) {
            f70.C16918a c16918a = new f70.C16918a(this.f98808a, this.f98809b);
            final String str = this.f98809b;
            c16918a.m124342b(new md20.InterfaceC18591c() { // from class: l.efm0
                @Override // p153l.md20.InterfaceC18591c
                /* JADX INFO: renamed from: a */
                public final void mo103686a(md20 md20Var) {
                    gcg0Var.m137019l(new Pair(md20Var, str));
                }
            });
            c16918a.m124343c(new a(gcg0Var)).m124344d(new qd20.C19553a().m176147c(0).m176145a()).m124341a().m124338a(new s70.C19999a().m179964e(u2n.m194281g(true)).m184941i());
        }
    }

    /* JADX INFO: renamed from: l */
    private View m125402l(Act act, md20 md20Var) {
        if (md20Var == null) {
            return null;
        }
        NativeAdView nativeAdView = (NativeAdView) LayoutInflater.from(act).inflate(kec0.f126164z3, (ViewGroup) null);
        nativeAdView.setHeadlineView(nativeAdView.findViewById(adc0.f70496p));
        nativeAdView.setBodyView(nativeAdView.findViewById(adc0.f70479o));
        nativeAdView.setIconView(nativeAdView.findViewById(adc0.f70445m));
        if (nativeAdView.getHeadlineView() instanceof TextView) {
            ((TextView) nativeAdView.getHeadlineView()).setText(md20Var.mo128558d());
        }
        if (nativeAdView.getBodyView() instanceof TextView) {
            ((TextView) nativeAdView.getBodyView()).setText(md20Var.mo128556b());
        }
        if (nativeAdView.getIconView() instanceof CircleImageView) {
            CircleImageView circleImageView = (CircleImageView) nativeAdView.getIconView();
            Drawable drawableMo123591a = NullChecker.m82486a(md20Var.mo128559e()) ? md20Var.mo128559e().mo123591a() : null;
            if (drawableMo123591a == null) {
                drawableMo123591a = md20Var.mo128560f().mo117782b();
            }
            circleImageView.setImageDrawable(drawableMo123591a);
        }
        nativeAdView.setCallToActionView(nativeAdView.findViewById(adc0.f70310e));
        nativeAdView.setNativeAd(md20Var);
        RoundTextView roundTextView = (RoundTextView) nativeAdView.findViewById(adc0.f69992L0);
        if (CoreModule.f18264c.f20414p0.m219067l3()) {
            roundTextView.setBackgroundColor(Color.parseColor("#9379AF"));
            roundTextView.setTextColor(Color.parseColor("#FFFFFF"));
            return nativeAdView;
        }
        if (CoreModule.f18264c.f20414p0.m219064i3()) {
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
    public /* synthetic */ View m125403m(Act act, Pair pair) {
        if (!NullChecker.m82486a(pair.first)) {
            return null;
        }
        md20 md20Var = (md20) pair.first;
        this.f144749a = md20Var;
        return m125402l(act, md20Var);
    }

    /* JADX INFO: renamed from: n */
    private C22421c<Pair<md20, String>> m125404n(Context context, String str) {
        return C22421c.create(new C16967a(context, str));
    }

    /* JADX INFO: renamed from: o */
    private C22421c<View> m125405o(final Act act) {
        return act.duringCreated(m125404n(act, "ca-app-pub-6567608331519569/1764451305")).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.dfm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f88206a.m125403m(act, (Pair) obj);
            }
        });
    }

    @Override // p153l.z60
    /* JADX INFO: renamed from: b */
    public boolean mo109583b() {
        return true;
    }

    @Override // p153l.z60
    /* JADX INFO: renamed from: c */
    public C22421c<View> mo109584c(Act act) {
        if (!n70.m161856g().m161857f()) {
            return C22421c.just(null);
        }
        mo125406h(act, null);
        return m125405o(act);
    }

    @Override // p153l.o2n
    /* JADX INFO: renamed from: h */
    public void mo125406h(Act act, ViewGroup viewGroup) {
        super.mo125406h(act, viewGroup);
    }
}
