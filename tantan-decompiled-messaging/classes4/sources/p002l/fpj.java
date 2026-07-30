package p002l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogGiftsView;
import l.xdl0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fpj {

    /* JADX INFO: renamed from: a */
    public final GiftDialogGiftsView f10584a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public GiftDialogGiftsView f10585b;

    /* JADX INFO: renamed from: c */
    public AnimatorSet f10586c;

    /* JADX INFO: renamed from: d */
    public AnimatorSet f10587d;

    /* JADX INFO: renamed from: l.fpj$a */
    public class C0576a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0578c f10588a;

        public C0576a(InterfaceC0578c interfaceC0578c) {
            this.f10588a = interfaceC0578c;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            fpj.this.f10585b.m8024O0();
            xdl0.M0(fpj.this.f10584a, false);
            this.f10588a.mo7993a(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            xdl0.M0(fpj.this.f10585b, true);
            xdl0.M0(fpj.this.f10584a, true);
            this.f10588a.mo7994b();
        }
    }

    /* JADX INFO: renamed from: l.fpj$b */
    public class C0577b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0578c f10590a;

        public C0577b(InterfaceC0578c interfaceC0578c) {
            this.f10590a = interfaceC0578c;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            fpj.this.f10584a.m8024O0();
            xdl0.M0(fpj.this.f10585b, false);
            this.f10590a.mo7993a(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            xdl0.M0(fpj.this.f10585b, true);
            xdl0.M0(fpj.this.f10584a, true);
            this.f10590a.mo7994b();
        }
    }

    /* JADX INFO: renamed from: l.fpj$c */
    public interface InterfaceC0578c {
        /* JADX INFO: renamed from: a */
        void mo7993a(boolean z);

        /* JADX INFO: renamed from: b */
        void mo7994b();
    }

    public fpj(GiftDialogGiftsView giftDialogGiftsView) {
        this.f10584a = giftDialogGiftsView;
    }

    /* JADX INFO: renamed from: c */
    public void m13449c(GiftDialogGiftsView giftDialogGiftsView) {
        this.f10585b = giftDialogGiftsView;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m13450d() {
        return this.f10584a == null || this.f10585b == null;
    }

    /* JADX INFO: renamed from: e */
    public void m13451e() {
        ConstraintLayout constraintLayout = this.f10584a;
        if (constraintLayout != null) {
            constraintLayout.setTranslationX(0.0f);
            xdl0.M0(this.f10584a, true);
        }
        ConstraintLayout constraintLayout2 = this.f10585b;
        if (constraintLayout2 != null) {
            constraintLayout2.setTranslationX(0.0f);
            xdl0.M0(this.f10585b, false);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m13452f(InterfaceC0578c interfaceC0578c) {
        if (m13450d()) {
            return;
        }
        if (this.f10587d == null) {
            this.f10587d = new AnimatorSet();
            GiftDialogGiftsView giftDialogGiftsView = this.f10585b;
            Property property = View.TRANSLATION_X;
            this.f10587d.playTogether(ObjectAnimator.ofFloat(giftDialogGiftsView, (Property<GiftDialogGiftsView, Float>) property, 0.0f, xdl0.y0()), ObjectAnimator.ofFloat(this.f10584a, (Property<GiftDialogGiftsView, Float>) property, -xdl0.y0(), 0.0f));
            this.f10587d.setDuration(300L);
            this.f10587d.addListener(new C0577b(interfaceC0578c));
        }
        this.f10587d.start();
    }

    /* JADX INFO: renamed from: g */
    public void m13453g(InterfaceC0578c interfaceC0578c) {
        if (m13450d()) {
            return;
        }
        if (this.f10586c == null) {
            this.f10586c = new AnimatorSet();
            GiftDialogGiftsView giftDialogGiftsView = this.f10585b;
            Property property = View.TRANSLATION_X;
            this.f10586c.playTogether(ObjectAnimator.ofFloat(giftDialogGiftsView, (Property<GiftDialogGiftsView, Float>) property, xdl0.y0(), 0.0f), ObjectAnimator.ofFloat(this.f10584a, (Property<GiftDialogGiftsView, Float>) property, 0.0f, -xdl0.y0()));
            this.f10586c.setDuration(300L);
            this.f10586c.addListener(new C0576a(interfaceC0578c));
        }
        this.f10586c.start();
    }
}
