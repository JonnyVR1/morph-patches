package p153l;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class y60 extends o2n {

    /* JADX INFO: renamed from: h */
    public static final String f197611h = "y60";

    /* JADX INFO: renamed from: i */
    public static String f197612i = "ca-app-pub-6567608331519569/3090384535";

    /* JADX INFO: renamed from: l.y60$a */
    public class C21524a implements C22421c.a<Pair<md20, String>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f197613a;

        /* JADX INFO: renamed from: l.y60$a$a */
        public class a extends d70 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ gcg0 f197615a;

            public a(gcg0 gcg0Var) {
                this.f197615a = gcg0Var;
            }

            @Override // p153l.d70
            public void onAdClicked() {
                super.onAdClicked();
                i4g0.m138523u("e_messages_ad", "p_messages_ad", jyb.m147494Y("ixxn_ad_channel", "other"));
            }

            @Override // p153l.d70
            /* JADX INFO: renamed from: x */
            public void mo30988x(@NonNull jtv jtvVar) {
                super.mo30988x(jtvVar);
                o1j0.m165639m("admob errorCode = " + jtvVar.toString());
                this.f197615a.m137019l(new Pair(null, C21524a.this.f197613a));
            }
        }

        public C21524a(String str) {
            this.f197613a = str;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m214355a(String str, gcg0 gcg0Var, md20 md20Var) {
            String unused = y60.f197611h;
            gcg0Var.m137019l(new Pair(md20Var, str));
        }

        @Override // p153l.y20
        @SuppressLint({"MissingPermission"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(final gcg0<? super Pair<md20, String>> gcg0Var) {
            f70.C16918a c16918a = new f70.C16918a(y60.this.f144751c, this.f197613a);
            final String str = this.f197613a;
            c16918a.m124342b(new md20.InterfaceC18591c() { // from class: l.x60
                @Override // p153l.md20.InterfaceC18591c
                /* JADX INFO: renamed from: a */
                public final void mo103686a(md20 md20Var) {
                    y60.C21524a.m214355a(str, gcg0Var, md20Var);
                }
            });
            c16918a.m124344d(new qd20.C19553a().m176152h(new kfl0.C18151a().m149566b(true).m149565a()).m176145a());
            c16918a.m124343c(new a(gcg0Var)).m124341a().m124338a(new s70.C19999a().m184941i());
        }
    }

    @Override // p153l.o2n
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: h */
    public void mo125406h(Act act, ViewGroup viewGroup) {
        super.mo125406h(act, viewGroup);
        this.f144751c.progress(R$string.f18632L5);
        act.duringCreated(m214352t(f197612i)).subscribe(psd0.m173597H(new y20() { // from class: l.r60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161420a.m214348p((Pair) obj);
            }
        }, new y20() { // from class: l.s60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166529a.m214349q((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m214348p(Pair pair) {
        this.f144751c.progressDismiss();
        if (NullChecker.m82486a(pair.first)) {
            if (this.f144751c.isDestroyed() || this.f144751c.isFinishing() || this.f144751c.isChangingConfigurations()) {
                ((md20) pair.first).mo128555a();
                return;
            }
            md20 md20Var = this.f144749a;
            if (md20Var != null) {
                md20Var.mo128555a();
            }
            this.f144749a = (md20) pair.first;
        }
        m214353u(this.f144752d);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m214349q(Throwable th) {
        this.f144751c.progressDismiss();
        m214353u(this.f144752d);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m214350r(NativeAdView nativeAdView) {
        bnl0.m105505C0(nativeAdView.getMediaView(), (int) (nativeAdView.getMediaView().getWidth() / this.f144749a.mo128560f().mo117783c()));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m214351s(TextView textView, TextView textView2) {
        if (textView.getWidth() + (textView2.getWidth() * 2) + qa00.m175859d(56.0f) > bnl0.m105592y0()) {
            textView.setTextSize(vnb.m201961u1(textView.getTextSize()) - 1);
            m214354v(textView, textView2);
        }
    }

    /* JADX INFO: renamed from: t */
    public final C22421c<Pair<md20, String>> m214352t(String str) {
        return C22421c.create(new C21524a(str));
    }

    /* JADX INFO: renamed from: u */
    public void m214353u(ViewGroup viewGroup) {
        final NativeAdView nativeAdView = (NativeAdView) LayoutInflater.from(viewGroup.getContext()).inflate(kec0.f126096v3, (ViewGroup) null);
        if (this.f144749a == null) {
            ((ViewStub) nativeAdView.findViewById(adc0.f70495of)).inflate();
            viewGroup.removeAllViews();
            viewGroup.addView(nativeAdView);
            return;
        }
        ((ViewStub) nativeAdView.findViewById(adc0.f70478nf)).inflate();
        nativeAdView.setMediaView((MediaView) nativeAdView.findViewById(adc0.f70462n));
        nativeAdView.setHeadlineView(nativeAdView.findViewById(adc0.f70316e5));
        nativeAdView.setBodyView(nativeAdView.findViewById(adc0.f70344g));
        nativeAdView.setCallToActionView(nativeAdView.findViewById(adc0.f70361h));
        nativeAdView.setIconView(nativeAdView.findViewById(adc0.f70042O));
        ((TextView) nativeAdView.getHeadlineView()).setText(this.f144749a.mo128558d());
        m214354v((TextView) nativeAdView.findViewById(adc0.f70316e5), (TextView) nativeAdView.findViewById(adc0.f70681ze));
        if (NullChecker.m82486a(this.f144749a.mo128560f())) {
            nativeAdView.getMediaView().setMediaContent(this.f144749a.mo128560f());
            nativeAdView.getMediaView().post(new Runnable() { // from class: l.t60
                @Override // java.lang.Runnable
                public final void run() {
                    this.f172278a.m214350r(nativeAdView);
                }
            });
            Drawable drawableMo117782b = this.f144749a.mo128560f().mo117782b();
            ImageView imageView = (ImageView) nativeAdView.findViewById(adc0.f69811A6);
            if (drawableMo117782b != null) {
                C22421c c22421cDuringCreated = this.f144751c.duringCreated(u2n.m194292s(drawableMo117782b, 25, true));
                Objects.requireNonNull(imageView);
                c22421cDuringCreated.subscribe(psd0.m173597H(new u60(imageView), new v60()));
            } else {
                imageView.setBackgroundColor(Color.parseColor("#FFEDE5"));
            }
            imageView.setAlpha(0.3f);
        }
        if (this.f144749a.mo128556b() == null) {
            bnl0.m105525M0(nativeAdView.getBodyView(), false);
        } else {
            bnl0.m105525M0(nativeAdView.getBodyView(), true);
            ((TextView) nativeAdView.getBodyView()).setText(this.f144749a.mo128556b());
        }
        if (this.f144749a.mo128557c() == null) {
            bnl0.m105525M0(nativeAdView.getCallToActionView(), false);
        } else {
            bnl0.m105525M0(nativeAdView.getCallToActionView(), true);
            ((TextView) nativeAdView.getCallToActionView()).setText(this.f144749a.mo128557c());
        }
        if (this.f144749a.mo128559e() == null) {
            bnl0.m105525M0(nativeAdView.getIconView(), false);
        } else {
            ((ImageView) nativeAdView.getIconView()).setImageDrawable(this.f144749a.mo128559e().mo123591a());
            bnl0.m105525M0(nativeAdView.getIconView(), true);
        }
        nativeAdView.setNativeAd(this.f144749a);
        viewGroup.removeAllViews();
        viewGroup.addView(nativeAdView);
    }

    /* JADX INFO: renamed from: v */
    public final void m214354v(final TextView textView, final TextView textView2) {
        textView.post(new Runnable() { // from class: l.w60
            @Override // java.lang.Runnable
            public final void run() {
                this.f187570a.m214351s(textView, textView2);
            }
        });
    }
}
