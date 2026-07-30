package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class lfy extends o2n {

    /* JADX INFO: renamed from: h */
    public final String f131909h = "ca-app-pub-6567608331519569/1585731172";

    /* JADX INFO: renamed from: i */
    public kcg0 f131910i = null;

    /* JADX INFO: renamed from: j */
    public View f131911j;

    /* JADX INFO: renamed from: l.lfy$a */
    public class C18388a implements C22421c.a<Pair<md20, String>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f131912a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f131913b;

        /* JADX INFO: renamed from: l.lfy$a$a */
        public class a extends d70 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ gcg0 f131915a;

            public a(gcg0 gcg0Var) {
                this.f131915a = gcg0Var;
            }

            @Override // p153l.d70
            public void onAdClicked() {
                super.onAdClicked();
                i4g0.m138520r("e_intl_meet_see_ad", "p_intl_meet_view");
            }

            @Override // p153l.d70
            /* JADX INFO: renamed from: x */
            public void mo30988x(@NonNull jtv jtvVar) {
                super.mo30988x(jtvVar);
                jtvVar.toString();
                this.f131915a.m137019l(new Pair(null, C18388a.this.f131913b));
            }
        }

        public C18388a(Context context, String str) {
            this.f131912a = context;
            this.f131913b = str;
        }

        @Override // p153l.y20
        @SuppressLint({"MissingPermission"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(final gcg0<? super Pair<md20, String>> gcg0Var) {
            f70.C16918a c16918a = new f70.C16918a(this.f131912a, this.f131913b);
            final String str = this.f131913b;
            c16918a.m124342b(new md20.InterfaceC18591c() { // from class: l.kfy
                @Override // p153l.md20.InterfaceC18591c
                /* JADX INFO: renamed from: a */
                public final void mo103686a(md20 md20Var) {
                    gcg0Var.m137019l(new Pair(md20Var, str));
                }
            });
            c16918a.m124343c(new a(gcg0Var)).m124344d(new qd20.C19553a().m176147c(1).m176145a()).m124341a().m124338a(new s70.C19999a().m179964e(u2n.m194281g(true)).m184941i());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m154043l(ImageView imageView, View view, bkj0 bkj0Var) {
        imageView.setImageBitmap((Bitmap) bkj0Var.f77081a);
        GradientDrawable gradientDrawableM194283i = u2n.m194283i(new int[]{((Integer) bkj0Var.f77082b).intValue(), ((Integer) bkj0Var.f77083c).intValue()});
        float f = qa00.f156322i;
        gradientDrawableM194283i.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f});
        view.setBackground(gradientDrawableM194283i);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m154045n(Throwable th) {
    }

    /* JADX INFO: renamed from: s */
    private C22421c<Pair<md20, String>> m154048s(Context context, String str) {
        return C22421c.create(new C18388a(context, str));
    }

    @Override // p153l.z60
    /* JADX INFO: renamed from: a */
    public C22421c<View> mo154049a(final Act act, final x20 x20Var) {
        if (!n70.m161856g().m161857f()) {
            return C22421c.just(null);
        }
        mo125406h(act, null);
        return act.duringCreated(m154048s(act, "ca-app-pub-6567608331519569/1585731172")).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.hfy
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f109352a.m154052r(act, x20Var, (Pair) obj);
            }
        });
    }

    @Override // p153l.o2n
    /* JADX INFO: renamed from: h */
    public void mo125406h(Act act, ViewGroup viewGroup) {
        super.mo125406h(act, viewGroup);
        act.lifecycle().filter(new qcj() { // from class: l.efy
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16271m);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.ffy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98847a.m154050i((C4470c) obj);
            }
        }, new y20() { // from class: l.gfy
            @Override // p153l.y20
            public final void call(Object obj) {
                lfy.m154045n((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m154050i(C4470c c4470c) {
        String str = c4470c.f16276c;
        if (NullChecker.m82486a(this.f144749a)) {
            this.f144749a.mo128555a();
        }
        if (NullChecker.m82486a(this.f131910i)) {
            psd0.m173633z(this.f131910i);
        }
    }

    /* JADX INFO: renamed from: q */
    public final View m154051q(Act act, md20 md20Var, final x20 x20Var) {
        if (md20Var == null) {
            return null;
        }
        NativeAdView nativeAdView = (NativeAdView) LayoutInflater.from(act).inflate(kec0.f126147y3, (ViewGroup) null);
        nativeAdView.setHeadlineView(nativeAdView.findViewById(adc0.f70428l));
        nativeAdView.setBodyView(nativeAdView.findViewById(adc0.f70344g));
        nativeAdView.setMediaView((MediaView) nativeAdView.findViewById(adc0.f70462n));
        ((TextView) nativeAdView.getHeadlineView()).setText(md20Var.mo128558d());
        if (md20Var.mo128556b() == null) {
            bnl0.m105525M0(nativeAdView.getBodyView(), false);
        } else {
            bnl0.m105525M0(nativeAdView.getBodyView(), true);
            ((TextView) nativeAdView.getBodyView()).setText(md20Var.mo128556b());
        }
        Drawable drawableMo117782b = md20Var.mo128560f().mo117782b();
        ImageView imageView = (ImageView) nativeAdView.findViewById(adc0.f69811A6);
        View viewFindViewById = nativeAdView.findViewById(adc0.f70633x0);
        this.f131911j = nativeAdView.findViewById(adc0.f70394j);
        if (drawableMo117782b != null) {
            m154053t(act, drawableMo117782b, viewFindViewById, imageView);
        } else {
            imageView.setBackgroundColor(Color.parseColor("#FFEDE5"));
            viewFindViewById.setBackgroundResource(dbc0.f86484Pr);
        }
        bnl0.m105509E0(this.f131911j, new View.OnClickListener() { // from class: l.ify
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
        nativeAdView.setNativeAd(md20Var);
        return nativeAdView;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ View m154052r(Act act, x20 x20Var, Pair pair) {
        if (!NullChecker.m82486a(pair.first)) {
            return null;
        }
        md20 md20Var = (md20) pair.first;
        this.f144749a = md20Var;
        return m154051q(act, md20Var, x20Var);
    }

    /* JADX INFO: renamed from: t */
    public final void m154053t(Act act, Drawable drawable, final View view, final ImageView imageView) {
        this.f131910i = act.duringCreated(u2n.m194291r(drawable, 25, true, "#bb000000")).subscribe(psd0.m173597H(new y20() { // from class: l.jfy
            @Override // p153l.y20
            public final void call(Object obj) {
                lfy.m154043l(imageView, view, (bkj0) obj);
            }
        }, new v60()));
    }
}
