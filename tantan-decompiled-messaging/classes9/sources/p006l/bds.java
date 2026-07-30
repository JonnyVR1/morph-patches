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
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.e520;
import l.g6l0;
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
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class bds extends o0n {

    /* JADX INFO: renamed from: h */
    public boolean f8832h = false;

    /* JADX INFO: renamed from: i */
    public String f8833i = "ca-app-pub-6567608331519569/1458100059";

    /* JADX INFO: renamed from: l.bds$a */
    public class C0550a implements c.a<Pair<e520, String>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f8834a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f8835b;

        /* JADX INFO: renamed from: l.bds$a$a */
        public class a extends h70 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ z3g0 f8837a;

            public a(z3g0 z3g0Var) {
                this.f8837a = z3g0Var;
            }

            public void onAdClicked() {
                super.onAdClicked();
            }

            /* JADX INFO: renamed from: x */
            public void m12611x(@NonNull irv irvVar) {
                super.x(irvVar);
                irvVar.toString();
                this.f8837a.onNext(new Pair(null, C0550a.this.f8835b));
            }
        }

        public C0550a(Context context, String str) {
            this.f8834a = context;
            this.f8835b = str;
        }

        @SuppressLint({"MissingPermission"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(final z3g0<? super Pair<e520, String>> z3g0Var) {
            j70.a aVar = new j70.a(this.f8834a, this.f8835b);
            final String str = this.f8835b;
            aVar.b(new e520.c() { // from class: l.ads
                /* JADX INFO: renamed from: a */
                public final void m11824a(e520 e520Var) {
                    z3g0Var.onNext(new Pair(e520Var, str));
                }
            });
            aVar.c(new a(z3g0Var)).d(new i520.a().c(1).h(new g6l0.a().b(true).a()).a()).a().a(new w70.a().e(u0n.h(false, true)).i());
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m12602l(ImageView imageView, View view, xaj0 xaj0Var) {
        imageView.setImageBitmap((Bitmap) xaj0Var.a);
        GradientDrawable gradientDrawableI = u0n.i(new int[]{((Integer) xaj0Var.b).intValue(), ((Integer) xaj0Var.c).intValue()});
        float f = t100.i;
        gradientDrawableI.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f});
        view.setBackground(gradientDrawableI);
    }

    /* JADX INFO: renamed from: b */
    public boolean m12603b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public c<View> m12604c(final Act act) {
        if (!r70.m22713g().m22714f()) {
            return c.just((Object) null);
        }
        if (!this.f8832h) {
            mo12565h(act, null);
        }
        return act.duringCreated(m12607o(act, this.f8833i)).observeOn(jo0.a()).map(new w9j() { // from class: l.ycs
            public final Object call(Object obj) {
                return this.f28129a.m12606n(act, (Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final View m12605m(Act act, e520 e520Var) {
        if (e520Var == null) {
            return null;
        }
        NativeAdView nativeAdViewInflate = LayoutInflater.from(act).inflate(f6c0.f11684A3, (ViewGroup) null);
        MediaView mediaViewFindViewById = nativeAdViewInflate.findViewById(u4c0.f23010g8);
        TextView textView = (TextView) nativeAdViewInflate.findViewById(u4c0.f22710O7);
        TextView textView2 = (TextView) nativeAdViewInflate.findViewById(u4c0.f22848Wc);
        ImageView imageView = (ImageView) nativeAdViewInflate.findViewById(u4c0.f23171q0);
        View viewFindViewById = nativeAdViewInflate.findViewById(u4c0.f22465A0);
        nativeAdViewInflate.setHeadlineView(textView);
        nativeAdViewInflate.setBodyView(textView2);
        nativeAdViewInflate.setMediaView(mediaViewFindViewById);
        ((TextView) nativeAdViewInflate.getHeadlineView()).setText(e520Var.d());
        if (e520Var.b() == null) {
            xdl0.M0(nativeAdViewInflate.getBodyView(), false);
        } else {
            xdl0.M0(nativeAdViewInflate.getBodyView(), true);
            ((TextView) nativeAdViewInflate.getBodyView()).setText(e520Var.b());
        }
        Drawable drawableB = e520Var.f().b();
        if (drawableB != null) {
            m12608p(act, drawableB, imageView, viewFindViewById);
        } else {
            imageView.setBackgroundColor(Color.parseColor("#FFEDE5"));
        }
        nativeAdViewInflate.setNativeAd(e520Var);
        return nativeAdViewInflate;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ View m12606n(Act act, Pair pair) {
        if (!NullChecker.a(pair.first)) {
            return null;
        }
        if (NullChecker.a(this.f17964a)) {
            this.f17964a.a();
        }
        e520 e520Var = (e520) pair.first;
        this.f17964a = e520Var;
        return m12605m(act, e520Var);
    }

    /* JADX INFO: renamed from: o */
    public final c<Pair<e520, String>> m12607o(Context context, String str) {
        return c.create(new C0550a(context, str));
    }

    /* JADX INFO: renamed from: p */
    public final void m12608p(Act act, Drawable drawable, final ImageView imageView, final View view) {
        act.duringCreated(u0n.r(drawable, 25, true, "#bb000000")).subscribe(mkd0.G(new e30() { // from class: l.zcs
            public final void call(Object obj) {
                bds.m12602l(imageView, view, (xaj0) obj);
            }
        }));
    }
}
