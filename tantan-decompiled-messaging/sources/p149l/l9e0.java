package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class l9e0 extends o0n {

    /* JADX INFO: renamed from: h */
    public final String f127094h = "ca-app-pub-6567608331519569/1585731172";

    /* JADX INFO: renamed from: i */
    public c4g0 f127095i = null;

    /* JADX INFO: renamed from: j */
    public View f127096j;

    /* JADX INFO: renamed from: l.l9e0$a */
    public class C18176a implements C22306c.a<Pair<e520, String>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f127097a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f127098b;

        /* JADX INFO: renamed from: l.l9e0$a$a */
        public class a extends h70 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ z3g0 f127100a;

            public a(z3g0 z3g0Var) {
                this.f127100a = z3g0Var;
            }

            @Override // p149l.h70
            public void onAdClicked() {
                super.onAdClicked();
                zvf0.m220396r("e_intl_plm_native_ads", "p_intl_plm");
            }

            @Override // p149l.h70
            /* JADX INFO: renamed from: x */
            public void mo29990x(@NonNull irv irvVar) {
                super.mo29990x(irvVar);
                irvVar.toString();
                this.f127100a.m132487l(new Pair(null, C18176a.this.f127098b));
            }
        }

        public C18176a(Context context, String str) {
            this.f127097a = context;
            this.f127098b = str;
        }

        @Override // p149l.e30
        @SuppressLint({"MissingPermission"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(final z3g0<? super Pair<e520, String>> z3g0Var) {
            j70.C17709a c17709a = new j70.C17709a(this.f127097a, this.f127098b);
            final String str = this.f127098b;
            c17709a.m140068b(new e520.InterfaceC16544c() { // from class: l.k9e0
                @Override // p149l.e520.InterfaceC16544c
                /* JADX INFO: renamed from: a */
                public final void mo95151a(e520 e520Var) {
                    z3g0Var.m132487l(new Pair(e520Var, str));
                }
            });
            c17709a.m140069c(new a(z3g0Var)).m140070d(new i520.C17483a().m134460b(1, true).m134459a()).m140067a().m140064a(new w70.C20817a().m191886e(u0n.m191349g(true)).m201999i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m149019i(C4319c c4319c) {
        String str = c4319c.f15557c;
        if (NullChecker.m81303a(this.f141343a)) {
            this.f141343a.mo98603a();
        }
        if (NullChecker.m81303a(this.f127095i)) {
            mkd0.m154992z(this.f127095i);
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m149024o(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m149025p(ImageView imageView, View view, xaj0 xaj0Var) {
        imageView.setImageBitmap((Bitmap) xaj0Var.f191751a);
        GradientDrawable gradientDrawableM191351i = u0n.m191351i(new int[]{((Integer) xaj0Var.f191752b).intValue(), ((Integer) xaj0Var.f191753c).intValue()});
        float f = t100.f167260i;
        gradientDrawableM191351i.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f});
        view.setBackground(gradientDrawableM191351i);
    }

    /* JADX INFO: renamed from: q */
    private View m149026q(Act act, e520 e520Var, final d30 d30Var) {
        if (e520Var == null) {
            return null;
        }
        NativeAdView nativeAdView = (NativeAdView) LayoutInflater.from(act).inflate(f6c0.f96093y3, (ViewGroup) null);
        nativeAdView.setHeadlineView(nativeAdView.findViewById(u4c0.f174337l));
        nativeAdView.setBodyView(nativeAdView.findViewById(u4c0.f174253g));
        nativeAdView.setMediaView((MediaView) nativeAdView.findViewById(u4c0.f174371n));
        ((TextView) nativeAdView.getHeadlineView()).setText(e520Var.mo98606d());
        if (e520Var.mo98604b() == null) {
            xdl0.m208345M0(nativeAdView.getBodyView(), false);
        } else {
            xdl0.m208345M0(nativeAdView.getBodyView(), true);
            ((TextView) nativeAdView.getBodyView()).setText(e520Var.mo98604b());
        }
        Drawable drawableMo120410b = e520Var.mo98608f().mo120410b();
        ImageView imageView = (ImageView) nativeAdView.findViewById(u4c0.f174565y6);
        View viewFindViewById = nativeAdView.findViewById(u4c0.f174542x0);
        this.f127096j = nativeAdView.findViewById(u4c0.f174303j);
        if (drawableMo120410b != null) {
            m149029t(act, drawableMo120410b, viewFindViewById, imageView);
        } else {
            imageView.setBackgroundColor(Color.parseColor("#FFEDE5"));
            viewFindViewById.setBackgroundResource(x2c0.f190025br);
        }
        xdl0.m208329E0(this.f127096j, new View.OnClickListener() { // from class: l.i9e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        nativeAdView.setNativeAd(e520Var);
        return nativeAdView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ View m149027r(Act act, d30 d30Var, Pair pair) {
        if (!NullChecker.m81303a(pair.first)) {
            return null;
        }
        e520 e520Var = (e520) pair.first;
        this.f141343a = e520Var;
        return m149026q(act, e520Var, d30Var);
    }

    /* JADX INFO: renamed from: s */
    private C22306c<Pair<e520, String>> m149028s(Context context, String str) {
        return C22306c.create(new C18176a(context, str));
    }

    /* JADX INFO: renamed from: t */
    private void m149029t(Act act, Drawable drawable, final View view, final ImageView imageView) {
        this.f127095i = act.duringCreated(u0n.m191359r(drawable, 25, true, "#bb000000")).subscribe(mkd0.m154956H(new e30() { // from class: l.j9e0
            @Override // p149l.e30
            public final void call(Object obj) {
                l9e0.m149025p(imageView, view, (xaj0) obj);
            }
        }, new z60()));
    }

    @Override // p149l.d70
    /* JADX INFO: renamed from: a */
    public C22306c<View> mo110210a(final Act act, final d30 d30Var) {
        if (!r70.m178118g().m178119f()) {
            return C22306c.just(null);
        }
        mo100438h(act, null);
        return act.duringCreated(m149028s(act, "ca-app-pub-6567608331519569/1585731172")).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.h9e0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f106571a.m149027r(act, d30Var, (Pair) obj);
            }
        });
    }

    @Override // p149l.o0n
    /* JADX INFO: renamed from: h */
    public void mo100438h(Act act, ViewGroup viewGroup) {
        super.mo100438h(act, viewGroup);
        act.lifecycle().filter(new w9j() { // from class: l.e9e0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15552m);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.f9e0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96482a.m149019i((C4319c) obj);
            }
        }, new e30() { // from class: l.g9e0
            @Override // p149l.e30
            public final void call(Object obj) {
                l9e0.m149024o((Throwable) obj);
            }
        }));
    }
}
