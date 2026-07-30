package p153l;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.data.User;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGAClickAreaListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class fcw extends g1e {

    /* JADX INFO: renamed from: j */
    public FrameLayout f98294j;

    /* JADX INFO: renamed from: k */
    public SVGAnimationView f98295k;

    /* JADX INFO: renamed from: l */
    public User f98296l;

    /* JADX INFO: renamed from: m */
    public x20 f98297m;

    /* JADX INFO: renamed from: n */
    public x20 f98298n;

    /* JADX INFO: renamed from: o */
    public l4g0 f98299o;

    public fcw(Context context, User user) {
        super(context, false, agc0.f71124j);
        this.f98299o = w1e.m204399c("p_receive_letter_pop", bem.class.getSimpleName());
        this.f98296l = user;
    }

    /* JADX INFO: renamed from: L */
    private Act m125058L() {
        return (Act) bnl0.m105506D(getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m125059O() {
        x20 x20Var = this.f98297m;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: K */
    public View m125060K(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gcw.m129907b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m125061M(ValueAnimator valueAnimator) {
        this.f98295k.stepToFrame((((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.75f) + 0.25f, false);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m125062N(ValueAnimator valueAnimator) {
        this.f98294j.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m125063P(ValueAnimator valueAnimator) {
        this.f98294j.setBackgroundColor(Color.argb(Math.max(0, ((Integer) valueAnimator.getAnimatedValue()).intValue()), 255, 255, 255));
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m125064Q(Set set, ValueAnimator valueAnimator, View view) {
        if (set.contains("btn01") && !valueAnimator.isRunning()) {
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ybw
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f198367a.m125061M(valueAnimator2);
                }
            });
            ValueAnimator duration = ValueAnimator.ofInt(-1728053248, -1).setDuration(333L);
            duration.setEvaluator(new ArgbEvaluator());
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.zbw
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f203709a.m125062N(valueAnimator2);
                }
            });
            gt0.m132160f(duration, new Runnable() { // from class: l.acw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f69764a.m125059O();
                }
            });
            ValueAnimator duration2 = ValueAnimator.ofInt(255, 0).setDuration(500L);
            duration2.setInterpolator(new PathInterpolator(0.28f, 0.13f, 0.7f, 1.25f));
            duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.bcw
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f76202a.m125063P(valueAnimator2);
                }
            });
            gt0.m132160f(valueAnimator, new Runnable() { // from class: l.ccw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f81038a.dismiss();
                }
            });
            if (m125058L() instanceof NewMainAct) {
                gt0.m132180z(valueAnimator, gt0.m132173s(gt0.m132164j(1670), duration)).start();
            } else {
                gt0.m132180z(valueAnimator, gt0.m132173s(gt0.m132164j(1670), duration, duration2)).start();
            }
            x20 x20Var = this.f98298n;
            if (x20Var != null) {
                x20Var.call();
            }
            i4g0.m138523u("e_open_letter", "p_receive_letter_pop", jyb.m147494Y("to_uid", CoreModule.m30929H().userId()), jyb.m147494Y("show_page", m125058L() instanceof NewMainAct ? "message" : "chat"));
        } else if (!set.contains("img_234") && !valueAnimator.isRunning()) {
            this.f98295k.stopAnimation(true);
            dismiss();
        }
        set.clear();
    }

    /* JADX INFO: renamed from: R */
    public void m125065R(x20 x20Var) {
        this.f98297m = x20Var;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m125060K(getLayoutInflater(), null));
    }

    @Override // p153l.g1e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        w1e.m204401e(this.f98299o);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        window.setAttributes(attributes);
        window.clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        window.clearFlags(131072);
        window.getDecorView().setSystemUiVisibility(1024);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }

    @Override // p153l.g1e, android.app.Dialog
    public void show() {
        super.show();
        this.f98299o.m152781p(jyb.m147494Y("to_uid", CoreModule.m30929H().userId()), jyb.m147494Y("show_page", m125058L() instanceof NewMainAct ? "message" : "chat"));
        w1e.m204402f(this.f98299o);
        final HashSet hashSet = new HashSet();
        final ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(3000L);
        this.f98295k.setOnClickListener(new View.OnClickListener() { // from class: l.wbw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188289a.m125064Q(hashSet, duration, view);
            }
        });
        this.f98295k.setOnClickListener(new SVGAClickAreaListener() { // from class: l.xbw
            @Override // com.tantan.library.svga.SVGAClickAreaListener
            public final void onClick(String str) {
                hashSet.add(str);
            }
        });
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(qa00.m175861f(18));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setAntiAlias(true);
        textPaint.setLetterSpacing(0.2f);
        textPaint.setTypeface(lyh0.m156283c(3));
        textPaint.setColor(getContext().getResources().getColor(c9c0.f80445p));
        String strConcat = this.f98296l.name;
        if (strConcat.length() > 6) {
            strConcat = strConcat.substring(0, 5).concat("…");
        }
        sVGADynamicEntity.setDynamicText(strConcat, textPaint, "text01");
        aeh0.INSTANCE.m97248f(m125058L(), sVGADynamicEntity, this.f98296l.picture(0).cover().profile180().formatted(), "head01", 60, 80, null);
        sVGADynamicEntity.setClickArea("btn01");
        sVGADynamicEntity.setClickArea("img_234");
        sVGADynamicEntity.setClickArea("img_1452");
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/2dbebf28-825a-48cb-87ec-84a61faec80714.svga").autoPlay(false).repeatCount(1).dynamic(sVGADynamicEntity).loadCallback(new C16950a()).into(this.f98295k);
    }

    /* JADX INFO: renamed from: l.fcw$a */
    public class C16950a implements RequestCallback {
        public C16950a() {
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m125068c(ValueAnimator valueAnimator) {
            fcw.this.f98295k.stepToFrame(((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.25f, false);
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m125069d(ValueAnimator valueAnimator) {
            fcw.this.f98294j.setBackgroundColor(Color.argb((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 153.0f), 0, 0, 0));
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1000L);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.dcw
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f87831a.m125068c(valueAnimator);
                }
            });
            duration.start();
            ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
            duration2.setInterpolator(new PathInterpolator(0.76f, 0.0f, 0.67f, 1.0f));
            duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ecw
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f93110a.m125069d(valueAnimator);
                }
            });
            gt0.m132173s(gt0.m132164j(167), duration2).start();
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
        }
    }
}
