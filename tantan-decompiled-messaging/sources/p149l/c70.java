package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class c70 extends o0n {

    /* JADX INFO: renamed from: h */
    public static final String f79586h = "c70";

    /* JADX INFO: renamed from: i */
    public static String f79587i = "ca-app-pub-6567608331519569/3090384535";

    /* JADX INFO: renamed from: l.c70$a */
    public class C16089a implements C22306c.a<Pair<e520, String>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f79588a;

        /* JADX INFO: renamed from: l.c70$a$a */
        public class a extends h70 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ z3g0 f79590a;

            public a(z3g0 z3g0Var) {
                this.f79590a = z3g0Var;
            }

            @Override // p149l.h70
            public void onAdClicked() {
                super.onAdClicked();
                zvf0.m220399u("e_messages_ad", "p_messages_ad", vwb.m200311Y("ixxn_ad_channel", "other"));
            }

            @Override // p149l.h70
            /* JADX INFO: renamed from: x */
            public void mo29990x(@NonNull irv irvVar) {
                super.mo29990x(irvVar);
                lsi0.m151583m("admob errorCode = " + irvVar.toString());
                this.f79590a.m132487l(new Pair(null, C16089a.this.f79588a));
            }
        }

        public C16089a(String str) {
            this.f79588a = str;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m105524a(String str, z3g0 z3g0Var, e520 e520Var) {
            String unused = c70.f79586h;
            z3g0Var.m132487l(new Pair(e520Var, str));
        }

        @Override // p149l.e30
        @SuppressLint({"MissingPermission"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(final z3g0<? super Pair<e520, String>> z3g0Var) {
            j70.C17709a c17709a = new j70.C17709a(c70.this.f141345c, this.f79588a);
            final String str = this.f79588a;
            c17709a.m140068b(new e520.InterfaceC16544c() { // from class: l.b70
                @Override // p149l.e520.InterfaceC16544c
                /* JADX INFO: renamed from: a */
                public final void mo95151a(e520 e520Var) {
                    c70.C16089a.m105524a(str, z3g0Var, e520Var);
                }
            });
            c17709a.m140070d(new i520.C17483a().m134466h(new g6l0.C17012a().m124604b(true).m124603a()).m134459a());
            c17709a.m140069c(new a(z3g0Var)).m140067a().m140064a(new w70.C20817a().m201999i());
        }
    }

    @Override // p149l.o0n
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: h */
    public void mo100438h(Act act, ViewGroup viewGroup) {
        super.mo100438h(act, viewGroup);
        this.f141345c.progress(R$string.f17842J5);
        act.duringCreated(m105521t(f79587i)).subscribe(mkd0.m154956H(new e30() { // from class: l.v60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180141a.m105517p((Pair) obj);
            }
        }, new e30() { // from class: l.w60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184802a.m105518q((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m105517p(Pair pair) {
        this.f141345c.progressDismiss();
        if (NullChecker.m81303a(pair.first)) {
            if (this.f141345c.isDestroyed() || this.f141345c.isFinishing() || this.f141345c.isChangingConfigurations()) {
                ((e520) pair.first).mo98603a();
                return;
            }
            e520 e520Var = this.f141343a;
            if (e520Var != null) {
                e520Var.mo98603a();
            }
            this.f141343a = (e520) pair.first;
        }
        m105522u(this.f141346d);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m105518q(Throwable th) {
        this.f141345c.progressDismiss();
        m105522u(this.f141346d);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m105519r(NativeAdView nativeAdView) {
        xdl0.m208325C0(nativeAdView.getMediaView(), (int) (nativeAdView.getMediaView().getWidth() / this.f141343a.mo98608f().mo120411c()));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m105520s(TextView textView, TextView textView2) {
        if (textView.getWidth() + (textView2.getWidth() * 2) + t100.m186890d(56.0f) > xdl0.m208412y0()) {
            textView.setTextSize(hmb.m131716u1(textView.getTextSize()) - 1);
            m105523v(textView, textView2);
        }
    }

    /* JADX INFO: renamed from: t */
    public final C22306c<Pair<e520, String>> m105521t(String str) {
        return C22306c.create(new C16089a(str));
    }

    /* JADX INFO: renamed from: u */
    public void m105522u(ViewGroup viewGroup) {
        final NativeAdView nativeAdView = (NativeAdView) LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.f96042v3, (ViewGroup) null);
        if (this.f141343a == null) {
            ((ViewStub) nativeAdView.findViewById(u4c0.f174353lf)).inflate();
            viewGroup.removeAllViews();
            viewGroup.addView(nativeAdView);
            return;
        }
        ((ViewStub) nativeAdView.findViewById(u4c0.f174336kf)).inflate();
        nativeAdView.setMediaView((MediaView) nativeAdView.findViewById(u4c0.f174371n));
        nativeAdView.setHeadlineView(nativeAdView.findViewById(u4c0.f174191c5));
        nativeAdView.setBodyView(nativeAdView.findViewById(u4c0.f174253g));
        nativeAdView.setCallToActionView(nativeAdView.findViewById(u4c0.f174270h));
        nativeAdView.setIconView(nativeAdView.findViewById(u4c0.f173954O));
        ((TextView) nativeAdView.getHeadlineView()).setText(this.f141343a.mo98606d());
        m105523v((TextView) nativeAdView.findViewById(u4c0.f174191c5), (TextView) nativeAdView.findViewById(u4c0.f174539we));
        if (NullChecker.m81303a(this.f141343a.mo98608f())) {
            nativeAdView.getMediaView().setMediaContent(this.f141343a.mo98608f());
            nativeAdView.getMediaView().post(new Runnable() { // from class: l.x60
                @Override // java.lang.Runnable
                public final void run() {
                    this.f191206a.m105519r(nativeAdView);
                }
            });
            Drawable drawableMo120410b = this.f141343a.mo98608f().mo120410b();
            ImageView imageView = (ImageView) nativeAdView.findViewById(u4c0.f174565y6);
            if (drawableMo120410b != null) {
                C22306c c22306cDuringCreated = this.f141345c.duringCreated(u0n.m191360s(drawableMo120410b, 25, true));
                Objects.requireNonNull(imageView);
                c22306cDuringCreated.subscribe(mkd0.m154956H(new y60(imageView), new z60()));
            } else {
                imageView.setBackgroundColor(Color.parseColor("#FFEDE5"));
            }
            imageView.setAlpha(0.3f);
        }
        if (this.f141343a.mo98604b() == null) {
            xdl0.m208345M0(nativeAdView.getBodyView(), false);
        } else {
            xdl0.m208345M0(nativeAdView.getBodyView(), true);
            ((TextView) nativeAdView.getBodyView()).setText(this.f141343a.mo98604b());
        }
        if (this.f141343a.mo98605c() == null) {
            xdl0.m208345M0(nativeAdView.getCallToActionView(), false);
        } else {
            xdl0.m208345M0(nativeAdView.getCallToActionView(), true);
            ((TextView) nativeAdView.getCallToActionView()).setText(this.f141343a.mo98605c());
        }
        if (this.f141343a.mo98607e() == null) {
            xdl0.m208345M0(nativeAdView.getIconView(), false);
        } else {
            ((ImageView) nativeAdView.getIconView()).setImageDrawable(this.f141343a.mo98607e().mo114778a());
            xdl0.m208345M0(nativeAdView.getIconView(), true);
        }
        nativeAdView.setNativeAd(this.f141343a);
        viewGroup.removeAllViews();
        viewGroup.addView(nativeAdView);
    }

    /* JADX INFO: renamed from: v */
    public final void m105523v(final TextView textView, final TextView textView2) {
        textView.post(new Runnable() { // from class: l.a70
            @Override // java.lang.Runnable
            public final void run() {
                this.f67827a.m105520s(textView, textView2);
            }
        });
    }
}
