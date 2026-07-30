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
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class bds extends o0n {

    /* JADX INFO: renamed from: h */
    public boolean f75063h = false;

    /* JADX INFO: renamed from: i */
    public String f75064i = "ca-app-pub-6567608331519569/1458100059";

    /* JADX INFO: renamed from: l.bds$a */
    public class C15839a implements C22306c.a<Pair<e520, String>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f75065a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f75066b;

        /* JADX INFO: renamed from: l.bds$a$a */
        public class a extends h70 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ z3g0 f75068a;

            public a(z3g0 z3g0Var) {
                this.f75068a = z3g0Var;
            }

            @Override // p149l.h70
            public void onAdClicked() {
                super.onAdClicked();
            }

            @Override // p149l.h70
            /* JADX INFO: renamed from: x */
            public void mo29990x(@NonNull irv irvVar) {
                super.mo29990x(irvVar);
                irvVar.toString();
                this.f75068a.m132487l(new Pair(null, C15839a.this.f75066b));
            }
        }

        public C15839a(Context context, String str) {
            this.f75065a = context;
            this.f75066b = str;
        }

        @Override // p149l.e30
        @SuppressLint({"MissingPermission"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(final z3g0<? super Pair<e520, String>> z3g0Var) {
            j70.C17709a c17709a = new j70.C17709a(this.f75065a, this.f75066b);
            final String str = this.f75066b;
            c17709a.m140068b(new e520.InterfaceC16544c() { // from class: l.ads
                @Override // p149l.e520.InterfaceC16544c
                /* JADX INFO: renamed from: a */
                public final void mo95151a(e520 e520Var) {
                    z3g0Var.m132487l(new Pair(e520Var, str));
                }
            });
            c17709a.m140069c(new a(z3g0Var)).m140070d(new i520.C17483a().m134461c(1).m134466h(new g6l0.C17012a().m124604b(true).m124603a()).m134459a()).m140067a().m140064a(new w70.C20817a().m191886e(u0n.m191350h(false, true)).m201999i());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m101224l(ImageView imageView, View view, xaj0 xaj0Var) {
        imageView.setImageBitmap((Bitmap) xaj0Var.f191751a);
        GradientDrawable gradientDrawableM191351i = u0n.m191351i(new int[]{((Integer) xaj0Var.f191752b).intValue(), ((Integer) xaj0Var.f191753c).intValue()});
        float f = t100.f167260i;
        gradientDrawableM191351i.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f});
        view.setBackground(gradientDrawableM191351i);
    }

    @Override // p149l.d70
    /* JADX INFO: renamed from: b */
    public boolean mo100436b() {
        return true;
    }

    @Override // p149l.d70
    /* JADX INFO: renamed from: c */
    public C22306c<View> mo100437c(final Act act) {
        if (!r70.m178118g().m178119f()) {
            return C22306c.just(null);
        }
        if (!this.f75063h) {
            mo100438h(act, null);
        }
        return act.duringCreated(m101227o(act, this.f75064i)).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.ycs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f197480a.m101226n(act, (Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final View m101225m(Act act, e520 e520Var) {
        if (e520Var == null) {
            return null;
        }
        NativeAdView nativeAdView = (NativeAdView) LayoutInflater.from(act).inflate(f6c0.f95270A3, (ViewGroup) null);
        MediaView mediaView = (MediaView) nativeAdView.findViewById(u4c0.f174262g8);
        TextView textView = (TextView) nativeAdView.findViewById(u4c0.f173962O7);
        TextView textView2 = (TextView) nativeAdView.findViewById(u4c0.f174100Wc);
        ImageView imageView = (ImageView) nativeAdView.findViewById(u4c0.f174423q0);
        View viewFindViewById = nativeAdView.findViewById(u4c0.f173717A0);
        nativeAdView.setHeadlineView(textView);
        nativeAdView.setBodyView(textView2);
        nativeAdView.setMediaView(mediaView);
        ((TextView) nativeAdView.getHeadlineView()).setText(e520Var.mo98606d());
        if (e520Var.mo98604b() == null) {
            xdl0.m208345M0(nativeAdView.getBodyView(), false);
        } else {
            xdl0.m208345M0(nativeAdView.getBodyView(), true);
            ((TextView) nativeAdView.getBodyView()).setText(e520Var.mo98604b());
        }
        Drawable drawableMo120410b = e520Var.mo98608f().mo120410b();
        if (drawableMo120410b != null) {
            m101228p(act, drawableMo120410b, imageView, viewFindViewById);
        } else {
            imageView.setBackgroundColor(Color.parseColor("#FFEDE5"));
        }
        nativeAdView.setNativeAd(e520Var);
        return nativeAdView;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ View m101226n(Act act, Pair pair) {
        if (!NullChecker.m81303a(pair.first)) {
            return null;
        }
        if (NullChecker.m81303a(this.f141343a)) {
            this.f141343a.mo98603a();
        }
        e520 e520Var = (e520) pair.first;
        this.f141343a = e520Var;
        return m101225m(act, e520Var);
    }

    /* JADX INFO: renamed from: o */
    public final C22306c<Pair<e520, String>> m101227o(Context context, String str) {
        return C22306c.create(new C15839a(context, str));
    }

    /* JADX INFO: renamed from: p */
    public final void m101228p(Act act, Drawable drawable, final ImageView imageView, final View view) {
        act.duringCreated(u0n.m191359r(drawable, 25, true, "#bb000000")).subscribe(mkd0.m154955G(new e30() { // from class: l.zcs
            @Override // p149l.e30
            public final void call(Object obj) {
                bds.m101224l(imageView, view, (xaj0) obj);
            }
        }));
    }
}
