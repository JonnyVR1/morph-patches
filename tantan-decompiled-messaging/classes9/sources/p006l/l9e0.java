package p006l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.c4g0;
import l.d30;
import l.e30;
import l.e520;
import l.h70;
import l.i520;
import l.irv;
import l.j70;
import l.jo0;
import l.mkd0;
import l.t100;
import l.u0n;
import l.w70;
import l.w9j;
import l.xaj0;
import l.xdl0;
import l.z3g0;
import l.zvf0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class l9e0 extends o0n {

    /* JADX INFO: renamed from: h */
    public final String f16282h = "ca-app-pub-6567608331519569/1585731172";

    /* JADX INFO: renamed from: i */
    public c4g0 f16283i = null;

    /* JADX INFO: renamed from: j */
    public View f16284j;

    /* JADX INFO: renamed from: l.l9e0$a */
    public class C0965a implements c.a<Pair<e520, String>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f16285a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f16286b;

        /* JADX INFO: renamed from: l.l9e0$a$a */
        public class a extends h70 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ z3g0 f16288a;

            public a(z3g0 z3g0Var) {
                this.f16288a = z3g0Var;
            }

            public void onAdClicked() {
                super.onAdClicked();
                zvf0.r("e_intl_plm_native_ads", "p_intl_plm");
            }

            /* JADX INFO: renamed from: x */
            public void m18622x(@NonNull irv irvVar) {
                super.x(irvVar);
                irvVar.toString();
                this.f16288a.onNext(new Pair(null, C0965a.this.f16286b));
            }
        }

        public C0965a(Context context, String str) {
            this.f16285a = context;
            this.f16286b = str;
        }

        @SuppressLint({"MissingPermission"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(final z3g0<? super Pair<e520, String>> z3g0Var) {
            j70.a aVar = new j70.a(this.f16285a, this.f16286b);
            final String str = this.f16286b;
            aVar.b(new e520.c() { // from class: l.k9e0
                /* JADX INFO: renamed from: a */
                public final void m18005a(e520 e520Var) {
                    z3g0Var.onNext(new Pair(e520Var, str));
                }
            });
            aVar.c(new a(z3g0Var)).d(new i520.a().b(1, true).a()).a().a(new w70.a().e(u0n.g(true)).i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m18608i(com.p1.mobile.android.app.c cVar) {
        String str = cVar.c;
        if (NullChecker.a(this.f17964a)) {
            this.f17964a.a();
        }
        if (NullChecker.a(this.f16283i)) {
            mkd0.z(this.f16283i);
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m18613o(Throwable th) {
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m18614p(ImageView imageView, View view, xaj0 xaj0Var) {
        imageView.setImageBitmap((Bitmap) xaj0Var.a);
        GradientDrawable gradientDrawableI = u0n.i(new int[]{((Integer) xaj0Var.b).intValue(), ((Integer) xaj0Var.c).intValue()});
        float f = t100.i;
        gradientDrawableI.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f});
        view.setBackground(gradientDrawableI);
    }

    /* JADX INFO: renamed from: q */
    private View m18615q(Act act, e520 e520Var, final d30 d30Var) {
        if (e520Var == null) {
            return null;
        }
        NativeAdView nativeAdViewInflate = LayoutInflater.from(act).inflate(f6c0.f12507y3, (ViewGroup) null);
        nativeAdViewInflate.setHeadlineView(nativeAdViewInflate.findViewById(u4c0.f23085l));
        nativeAdViewInflate.setBodyView(nativeAdViewInflate.findViewById(u4c0.f23001g));
        nativeAdViewInflate.setMediaView(nativeAdViewInflate.findViewById(u4c0.f23119n));
        ((TextView) nativeAdViewInflate.getHeadlineView()).setText(e520Var.d());
        if (e520Var.b() == null) {
            xdl0.M0(nativeAdViewInflate.getBodyView(), false);
        } else {
            xdl0.M0(nativeAdViewInflate.getBodyView(), true);
            ((TextView) nativeAdViewInflate.getBodyView()).setText(e520Var.b());
        }
        Drawable drawableB = e520Var.f().b();
        ImageView imageView = (ImageView) nativeAdViewInflate.findViewById(u4c0.f23313y6);
        View viewFindViewById = nativeAdViewInflate.findViewById(u4c0.f23290x0);
        this.f16284j = nativeAdViewInflate.findViewById(u4c0.f23051j);
        if (drawableB != null) {
            m18618t(act, drawableB, viewFindViewById, imageView);
        } else {
            imageView.setBackgroundColor(Color.parseColor("#FFEDE5"));
            viewFindViewById.setBackgroundResource(x2c0.f26561br);
        }
        xdl0.E0(this.f16284j, new View.OnClickListener() { // from class: l.i9e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        nativeAdViewInflate.setNativeAd(e520Var);
        return nativeAdViewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ View m18616r(Act act, d30 d30Var, Pair pair) {
        if (!NullChecker.a(pair.first)) {
            return null;
        }
        e520 e520Var = (e520) pair.first;
        this.f17964a = e520Var;
        return m18615q(act, e520Var, d30Var);
    }

    /* JADX INFO: renamed from: s */
    private c<Pair<e520, String>> m18617s(Context context, String str) {
        return c.create(new C0965a(context, str));
    }

    /* JADX INFO: renamed from: t */
    private void m18618t(Act act, Drawable drawable, final View view, final ImageView imageView) {
        this.f16283i = act.duringCreated(u0n.r(drawable, 25, true, "#bb000000")).subscribe(mkd0.H(new e30() { // from class: l.j9e0
            public final void call(Object obj) {
                l9e0.m18614p(imageView, view, (xaj0) obj);
            }
        }, new z60()));
    }

    /* JADX INFO: renamed from: a */
    public c<View> m18619a(final Act act, final d30 d30Var) {
        if (!r70.m22713g().m22714f()) {
            return c.just((Object) null);
        }
        mo12565h(act, null);
        return act.duringCreated(m18617s(act, "ca-app-pub-6567608331519569/1585731172")).observeOn(jo0.a()).map(new w9j() { // from class: l.h9e0
            public final Object call(Object obj) {
                return this.f13759a.m18616r(act, d30Var, (Pair) obj);
            }
        });
    }

    @Override // p006l.o0n
    /* JADX INFO: renamed from: h */
    public void mo12565h(Act act, ViewGroup viewGroup) {
        super.mo12565h(act, viewGroup);
        act.lifecycle().filter(new w9j() { // from class: l.e9e0
            public final Object call(Object obj) {
                return Boolean.valueOf(((com.p1.mobile.android.app.c) obj) == com.p1.mobile.android.app.c.m);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.f9e0
            public final void call(Object obj) {
                this.f12596a.m18608i((com.p1.mobile.android.app.c) obj);
            }
        }, new e30() { // from class: l.g9e0
            public final void call(Object obj) {
                l9e0.m18613o((Throwable) obj);
            }
        }));
    }
}
