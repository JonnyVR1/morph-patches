package p006l;

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
import com.google.android.gms.ads.nativead.NativeAdView;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import l.e30;
import l.e520;
import l.g6l0;
import l.h70;
import l.hmb;
import l.i520;
import l.irv;
import l.j70;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.t100;
import l.u0n;
import l.vwb;
import l.w70;
import l.xdl0;
import l.z3g0;
import l.zvf0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class c70 extends o0n {

    /* JADX INFO: renamed from: h */
    public static final String f9465h = "c70";

    /* JADX INFO: renamed from: i */
    public static String f9466i = "ca-app-pub-6567608331519569/3090384535";

    /* JADX INFO: renamed from: l.c70$a */
    public class C0599a implements c.a<Pair<e520, String>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f9467a;

        /* JADX INFO: renamed from: l.c70$a$a */
        public class a extends h70 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ z3g0 f9469a;

            public a(z3g0 z3g0Var) {
                this.f9469a = z3g0Var;
            }

            public void onAdClicked() {
                super.onAdClicked();
                zvf0.u("e_messages_ad", "p_messages_ad", new j760[]{vwb.Y("ixxn_ad_channel", "other")});
            }

            /* JADX INFO: renamed from: x */
            public void m13272x(@NonNull irv irvVar) {
                super.x(irvVar);
                lsi0.m("admob errorCode = " + irvVar.toString());
                this.f9469a.onNext(new Pair(null, C0599a.this.f9467a));
            }
        }

        public C0599a(String str) {
            this.f9467a = str;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m13270a(String str, z3g0 z3g0Var, e520 e520Var) {
            String unused = c70.f9465h;
            z3g0Var.onNext(new Pair(e520Var, str));
        }

        @SuppressLint({"MissingPermission"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(final z3g0<? super Pair<e520, String>> z3g0Var) {
            j70.a aVar = new j70.a(c70.this.f17966c, this.f9467a);
            final String str = this.f9467a;
            aVar.b(new e520.c() { // from class: l.b70
                /* JADX INFO: renamed from: a */
                public final void m12569a(e520 e520Var) {
                    c70.C0599a.m13270a(str, z3g0Var, e520Var);
                }
            });
            aVar.d(new i520.a().h(new g6l0.a().b(true).a()).a());
            aVar.c(new a(z3g0Var)).a().a(new w70.a().i());
        }
    }

    @Override // p006l.o0n
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: h */
    public void mo12565h(Act act, ViewGroup viewGroup) {
        super.mo12565h(act, viewGroup);
        this.f17966c.progress(R$string.f1831J5);
        act.duringCreated(m13267t(f9466i)).subscribe(mkd0.H(new e30() { // from class: l.v60
            public final void call(Object obj) {
                this.f24160a.m13263p((Pair) obj);
            }
        }, new e30() { // from class: l.w60
            public final void call(Object obj) {
                this.f24997a.m13264q((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m13263p(Pair pair) {
        this.f17966c.progressDismiss();
        if (NullChecker.a(pair.first)) {
            if (this.f17966c.isDestroyed() || this.f17966c.isFinishing() || this.f17966c.isChangingConfigurations()) {
                ((e520) pair.first).a();
                return;
            }
            e520 e520Var = this.f17964a;
            if (e520Var != null) {
                e520Var.a();
            }
            this.f17964a = (e520) pair.first;
        }
        m13268u(this.f17967d);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m13264q(Throwable th) {
        this.f17966c.progressDismiss();
        m13268u(this.f17967d);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m13265r(NativeAdView nativeAdView) {
        xdl0.C0(nativeAdView.getMediaView(), (int) (nativeAdView.getMediaView().getWidth() / this.f17964a.f().c()));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m13266s(TextView textView, TextView textView2) {
        if (textView.getWidth() + (textView2.getWidth() * 2) + t100.d(56.0f) > xdl0.y0()) {
            textView.setTextSize(hmb.u1(textView.getTextSize()) - 1);
            m13269v(textView, textView2);
        }
    }

    /* JADX INFO: renamed from: t */
    public final c<Pair<e520, String>> m13267t(String str) {
        return c.create(new C0599a(str));
    }

    /* JADX INFO: renamed from: u */
    public void m13268u(ViewGroup viewGroup) {
        final NativeAdView nativeAdViewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.f12456v3, (ViewGroup) null);
        if (this.f17964a == null) {
            ((ViewStub) nativeAdViewInflate.findViewById(u4c0.f23101lf)).inflate();
            viewGroup.removeAllViews();
            viewGroup.addView(nativeAdViewInflate);
            return;
        }
        ((ViewStub) nativeAdViewInflate.findViewById(u4c0.f23084kf)).inflate();
        nativeAdViewInflate.setMediaView(nativeAdViewInflate.findViewById(u4c0.f23119n));
        nativeAdViewInflate.setHeadlineView(nativeAdViewInflate.findViewById(u4c0.f22939c5));
        nativeAdViewInflate.setBodyView(nativeAdViewInflate.findViewById(u4c0.f23001g));
        nativeAdViewInflate.setCallToActionView(nativeAdViewInflate.findViewById(u4c0.f23018h));
        nativeAdViewInflate.setIconView(nativeAdViewInflate.findViewById(u4c0.f22702O));
        ((TextView) nativeAdViewInflate.getHeadlineView()).setText(this.f17964a.d());
        m13269v((TextView) nativeAdViewInflate.findViewById(u4c0.f22939c5), (TextView) nativeAdViewInflate.findViewById(u4c0.f23287we));
        if (NullChecker.a(this.f17964a.f())) {
            nativeAdViewInflate.getMediaView().setMediaContent(this.f17964a.f());
            nativeAdViewInflate.getMediaView().post(new Runnable() { // from class: l.x60
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27364a.m13265r(nativeAdViewInflate);
                }
            });
            Drawable drawableB = this.f17964a.f().b();
            ImageView imageView = (ImageView) nativeAdViewInflate.findViewById(u4c0.f23313y6);
            if (drawableB != null) {
                c cVarDuringCreated = this.f17966c.duringCreated(u0n.s(drawableB, 25, true));
                Objects.requireNonNull(imageView);
                cVarDuringCreated.subscribe(mkd0.H(new y60(imageView), new z60()));
            } else {
                imageView.setBackgroundColor(Color.parseColor("#FFEDE5"));
            }
            imageView.setAlpha(0.3f);
        }
        if (this.f17964a.b() == null) {
            xdl0.M0(nativeAdViewInflate.getBodyView(), false);
        } else {
            xdl0.M0(nativeAdViewInflate.getBodyView(), true);
            ((TextView) nativeAdViewInflate.getBodyView()).setText(this.f17964a.b());
        }
        if (this.f17964a.c() == null) {
            xdl0.M0(nativeAdViewInflate.getCallToActionView(), false);
        } else {
            xdl0.M0(nativeAdViewInflate.getCallToActionView(), true);
            ((TextView) nativeAdViewInflate.getCallToActionView()).setText(this.f17964a.c());
        }
        if (this.f17964a.e() == null) {
            xdl0.M0(nativeAdViewInflate.getIconView(), false);
        } else {
            ((ImageView) nativeAdViewInflate.getIconView()).setImageDrawable(this.f17964a.e().a());
            xdl0.M0(nativeAdViewInflate.getIconView(), true);
        }
        nativeAdViewInflate.setNativeAd(this.f17964a);
        viewGroup.removeAllViews();
        viewGroup.addView(nativeAdViewInflate);
    }

    /* JADX INFO: renamed from: v */
    public final void m13269v(final TextView textView, final TextView textView2) {
        textView.post(new Runnable() { // from class: l.a70
            @Override // java.lang.Runnable
            public final void run() {
                this.f8125a.m13266s(textView, textView2);
            }
        });
    }
}
