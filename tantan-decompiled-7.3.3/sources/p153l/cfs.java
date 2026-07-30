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
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class cfs extends o2n {

    /* JADX INFO: renamed from: h */
    public boolean f81557h = false;

    /* JADX INFO: renamed from: i */
    public String f81558i = "ca-app-pub-6567608331519569/1458100059";

    /* JADX INFO: renamed from: l.cfs$a */
    public class C16247a implements C22421c.a<Pair<md20, String>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f81559a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f81560b;

        /* JADX INFO: renamed from: l.cfs$a$a */
        public class a extends d70 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ gcg0 f81562a;

            public a(gcg0 gcg0Var) {
                this.f81562a = gcg0Var;
            }

            @Override // p153l.d70
            public void onAdClicked() {
                super.onAdClicked();
            }

            @Override // p153l.d70
            /* JADX INFO: renamed from: x */
            public void mo30988x(@NonNull jtv jtvVar) {
                super.mo30988x(jtvVar);
                jtvVar.toString();
                this.f81562a.m137019l(new Pair(null, C16247a.this.f81560b));
            }
        }

        public C16247a(Context context, String str) {
            this.f81559a = context;
            this.f81560b = str;
        }

        @Override // p153l.y20
        @SuppressLint({"MissingPermission"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(final gcg0<? super Pair<md20, String>> gcg0Var) {
            f70.C16918a c16918a = new f70.C16918a(this.f81559a, this.f81560b);
            final String str = this.f81560b;
            c16918a.m124342b(new md20.InterfaceC18591c() { // from class: l.bfs
                @Override // p153l.md20.InterfaceC18591c
                /* JADX INFO: renamed from: a */
                public final void mo103686a(md20 md20Var) {
                    gcg0Var.m137019l(new Pair(md20Var, str));
                }
            });
            c16918a.m124343c(new a(gcg0Var)).m124344d(new qd20.C19553a().m176147c(1).m176152h(new kfl0.C18151a().m149566b(true).m149565a()).m176145a()).m124341a().m124338a(new s70.C19999a().m179964e(u2n.m194282h(false, true)).m184941i());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m109582l(ImageView imageView, View view, bkj0 bkj0Var) {
        imageView.setImageBitmap((Bitmap) bkj0Var.f77081a);
        GradientDrawable gradientDrawableM194283i = u2n.m194283i(new int[]{((Integer) bkj0Var.f77082b).intValue(), ((Integer) bkj0Var.f77083c).intValue()});
        float f = qa00.f156322i;
        gradientDrawableM194283i.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f});
        view.setBackground(gradientDrawableM194283i);
    }

    @Override // p153l.z60
    /* JADX INFO: renamed from: b */
    public boolean mo109583b() {
        return true;
    }

    @Override // p153l.z60
    /* JADX INFO: renamed from: c */
    public C22421c<View> mo109584c(final Act act) {
        if (!n70.m161856g().m161857f()) {
            return C22421c.just(null);
        }
        if (!this.f81557h) {
            mo125406h(act, null);
        }
        return act.duringCreated(m109587o(act, this.f81558i)).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.zes
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f204043a.m109586n(act, (Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final View m109585m(Act act, md20 md20Var) {
        if (md20Var == null) {
            return null;
        }
        NativeAdView nativeAdView = (NativeAdView) LayoutInflater.from(act).inflate(kec0.f125319A3, (ViewGroup) null);
        MediaView mediaView = (MediaView) nativeAdView.findViewById(adc0.f70387i8);
        TextView textView = (TextView) nativeAdView.findViewById(adc0.f70084Q7);
        TextView textView2 = (TextView) nativeAdView.findViewById(adc0.f70223Yc);
        ImageView imageView = (ImageView) nativeAdView.findViewById(adc0.f70514q0);
        View viewFindViewById = nativeAdView.findViewById(adc0.f69805A0);
        nativeAdView.setHeadlineView(textView);
        nativeAdView.setBodyView(textView2);
        nativeAdView.setMediaView(mediaView);
        ((TextView) nativeAdView.getHeadlineView()).setText(md20Var.mo128558d());
        if (md20Var.mo128556b() == null) {
            bnl0.m105525M0(nativeAdView.getBodyView(), false);
        } else {
            bnl0.m105525M0(nativeAdView.getBodyView(), true);
            ((TextView) nativeAdView.getBodyView()).setText(md20Var.mo128556b());
        }
        Drawable drawableMo117782b = md20Var.mo128560f().mo117782b();
        if (drawableMo117782b != null) {
            m109588p(act, drawableMo117782b, imageView, viewFindViewById);
        } else {
            imageView.setBackgroundColor(Color.parseColor("#FFEDE5"));
        }
        nativeAdView.setNativeAd(md20Var);
        return nativeAdView;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ View m109586n(Act act, Pair pair) {
        if (!NullChecker.m82486a(pair.first)) {
            return null;
        }
        if (NullChecker.m82486a(this.f144749a)) {
            this.f144749a.mo128555a();
        }
        md20 md20Var = (md20) pair.first;
        this.f144749a = md20Var;
        return m109585m(act, md20Var);
    }

    /* JADX INFO: renamed from: o */
    public final C22421c<Pair<md20, String>> m109587o(Context context, String str) {
        return C22421c.create(new C16247a(context, str));
    }

    /* JADX INFO: renamed from: p */
    public final void m109588p(Act act, Drawable drawable, final ImageView imageView, final View view) {
        act.duringCreated(u2n.m194291r(drawable, 25, true, "#bb000000")).subscribe(psd0.m173596G(new y20() { // from class: l.afs
            @Override // p153l.y20
            public final void call(Object obj) {
                cfs.m109582l(imageView, view, (bkj0) obj);
            }
        }));
    }
}
