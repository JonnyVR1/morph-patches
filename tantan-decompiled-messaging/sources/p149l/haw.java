package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.data.User;
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
public class haw extends szd {

    /* JADX INFO: renamed from: j */
    public FrameLayout f106845j;

    /* JADX INFO: renamed from: k */
    public SVGAnimationView f106846k;

    /* JADX INFO: renamed from: l */
    public User f106847l;

    /* JADX INFO: renamed from: m */
    public d30 f106848m;

    /* JADX INFO: renamed from: n */
    public d30 f106849n;

    /* JADX INFO: renamed from: o */
    public cwf0 f106850o;

    public haw(Context context, User user) {
        super(context, false, v7c0.f180363j);
        this.f106850o = i0e.m133794c("p_receive_letter_pop", lbm.class.getSimpleName());
        this.f106847l = user;
    }

    /* JADX INFO: renamed from: L */
    private Act m130233L() {
        return (Act) xdl0.m208326D(getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m130234O() {
        d30 d30Var = this.f106848m;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: K */
    public View m130235K(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return iaw.m135206b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m130236M(ValueAnimator valueAnimator) {
        this.f106846k.stepToFrame((((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.75f) + 0.25f, false);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m130237N(ValueAnimator valueAnimator) {
        this.f106845j.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m130238P(ValueAnimator valueAnimator) {
        this.f106845j.setBackgroundColor(Color.argb(Math.max(0, ((Integer) valueAnimator.getAnimatedValue()).intValue()), 255, 255, 255));
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m130239Q(Set set, ValueAnimator valueAnimator, View view) {
        if (set.contains("btn01") && !valueAnimator.isRunning()) {
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.aaw
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f68606a.m130236M(valueAnimator2);
                }
            });
            ValueAnimator duration = ValueAnimator.ofInt(-1728053248, -1).setDuration(333L);
            duration.setEvaluator(new ArgbEvaluator());
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.baw
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f74734a.m130237N(valueAnimator2);
                }
            });
            bt0.m103733f(duration, new Runnable() { // from class: l.caw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f80081a.m130234O();
                }
            });
            ValueAnimator duration2 = ValueAnimator.ofInt(255, 0).setDuration(500L);
            duration2.setInterpolator(new PathInterpolator(0.28f, 0.13f, 0.7f, 1.25f));
            duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.daw
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f85272a.m130238P(valueAnimator2);
                }
            });
            bt0.m103733f(valueAnimator, new Runnable() { // from class: l.eaw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f90275a.dismiss();
                }
            });
            if (m130233L() instanceof NewMainAct) {
                bt0.m103753z(valueAnimator, bt0.m103746s(bt0.m103737j(1670), duration)).start();
            } else {
                bt0.m103753z(valueAnimator, bt0.m103746s(bt0.m103737j(1670), duration, duration2)).start();
            }
            d30 d30Var = this.f106849n;
            if (d30Var != null) {
                d30Var.call();
            }
            zvf0.m220399u("e_open_letter", "p_receive_letter_pop", vwb.m200311Y("to_uid", CoreModule.m29931H().userId()), vwb.m200311Y("show_page", m130233L() instanceof NewMainAct ? "message" : "chat"));
        } else if (!set.contains("img_234") && !valueAnimator.isRunning()) {
            this.f106846k.stopAnimation(true);
            dismiss();
        }
        set.clear();
    }

    /* JADX INFO: renamed from: R */
    public void m130240R(d30 d30Var) {
        this.f106848m = d30Var;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0074a, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m130235K(getLayoutInflater(), null));
    }

    @Override // p149l.szd, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        i0e.m133796e(this.f106850o);
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

    @Override // p149l.szd, android.app.Dialog
    public void show() {
        super.show();
        this.f106850o.m109040p(vwb.m200311Y("to_uid", CoreModule.m29931H().userId()), vwb.m200311Y("show_page", m130233L() instanceof NewMainAct ? "message" : "chat"));
        i0e.m133797f(this.f106850o);
        final HashSet hashSet = new HashSet();
        final ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(3000L);
        this.f106846k.setOnClickListener(new View.OnClickListener() { // from class: l.y9w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196994a.m130239Q(hashSet, duration, view);
            }
        });
        this.f106846k.setOnClickListener(new SVGAClickAreaListener() { // from class: l.z9w
            @Override // com.tantan.library.svga.SVGAClickAreaListener
            public final void onClick(String str) {
                hashSet.add(str);
            }
        });
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(t100.m186892f(18));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setAntiAlias(true);
        textPaint.setLetterSpacing(0.2f);
        textPaint.setTypeface(eqh0.m117752c(3));
        textPaint.setColor(getContext().getResources().getColor(w0c0.f183875p));
        String strConcat = this.f106847l.name;
        if (strConcat.length() > 6) {
            strConcat = strConcat.substring(0, 5).concat("…");
        }
        sVGADynamicEntity.setDynamicText(strConcat, textPaint, "text01");
        s5h0.INSTANCE.m182350f(m130233L(), sVGADynamicEntity, this.f106847l.picture(0).cover().profile180().formatted(), "head01", 60, 80, null);
        sVGADynamicEntity.setClickArea("btn01");
        sVGADynamicEntity.setClickArea("img_234");
        sVGADynamicEntity.setClickArea("img_1452");
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/2dbebf28-825a-48cb-87ec-84a61faec80714.svga").autoPlay(false).repeatCount(1).dynamic(sVGADynamicEntity).loadCallback(new C17262a()).into(this.f106846k);
    }

    /* JADX INFO: renamed from: l.haw$a */
    public class C17262a implements RequestCallback {
        public C17262a() {
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m130243c(ValueAnimator valueAnimator) {
            haw.this.f106846k.stepToFrame(((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.25f, false);
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m130244d(ValueAnimator valueAnimator) {
            haw.this.f106845j.setBackgroundColor(Color.argb((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 153.0f), 0, 0, 0));
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1000L);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.faw
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f96665a.m130243c(valueAnimator);
                }
            });
            duration.start();
            ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
            duration2.setInterpolator(new PathInterpolator(0.76f, 0.0f, 0.67f, 1.0f));
            duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.gaw
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f101713a.m130244d(valueAnimator);
                }
            });
            bt0.m103746s(bt0.m103737j(167), duration2).start();
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
        }
    }
}
