package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogGiftsView;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class fpj {

    /* JADX INFO: renamed from: a */
    public final GiftDialogGiftsView f98708a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public GiftDialogGiftsView f98709b;

    /* JADX INFO: renamed from: c */
    public AnimatorSet f98710c;

    /* JADX INFO: renamed from: d */
    public AnimatorSet f98711d;

    /* JADX INFO: renamed from: l.fpj$a */
    public class C16903a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC16905c f98712a;

        public C16903a(InterfaceC16905c interfaceC16905c) {
            this.f98712a = interfaceC16905c;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            fpj.this.f98709b.m74440O0();
            xdl0.m208345M0(fpj.this.f98708a, false);
            this.f98712a.mo74409a(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            xdl0.m208345M0(fpj.this.f98709b, true);
            xdl0.m208345M0(fpj.this.f98708a, true);
            this.f98712a.mo74410b();
        }
    }

    /* JADX INFO: renamed from: l.fpj$b */
    public class C16904b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC16905c f98714a;

        public C16904b(InterfaceC16905c interfaceC16905c) {
            this.f98714a = interfaceC16905c;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            fpj.this.f98708a.m74440O0();
            xdl0.m208345M0(fpj.this.f98709b, false);
            this.f98714a.mo74409a(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            xdl0.m208345M0(fpj.this.f98709b, true);
            xdl0.m208345M0(fpj.this.f98708a, true);
            this.f98714a.mo74410b();
        }
    }

    /* JADX INFO: renamed from: l.fpj$c */
    public interface InterfaceC16905c {
        /* JADX INFO: renamed from: a */
        void mo74409a(boolean z);

        /* JADX INFO: renamed from: b */
        void mo74410b();
    }

    public fpj(GiftDialogGiftsView giftDialogGiftsView) {
        this.f98708a = giftDialogGiftsView;
    }

    /* JADX INFO: renamed from: c */
    public void m122606c(GiftDialogGiftsView giftDialogGiftsView) {
        this.f98709b = giftDialogGiftsView;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m122607d() {
        return this.f98708a == null || this.f98709b == null;
    }

    /* JADX INFO: renamed from: e */
    public void m122608e() {
        GiftDialogGiftsView giftDialogGiftsView = this.f98708a;
        if (giftDialogGiftsView != null) {
            giftDialogGiftsView.setTranslationX(0.0f);
            xdl0.m208345M0(this.f98708a, true);
        }
        GiftDialogGiftsView giftDialogGiftsView2 = this.f98709b;
        if (giftDialogGiftsView2 != null) {
            giftDialogGiftsView2.setTranslationX(0.0f);
            xdl0.m208345M0(this.f98709b, false);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m122609f(InterfaceC16905c interfaceC16905c) {
        if (m122607d()) {
            return;
        }
        if (this.f98711d == null) {
            this.f98711d = new AnimatorSet();
            GiftDialogGiftsView giftDialogGiftsView = this.f98709b;
            Property property = View.TRANSLATION_X;
            this.f98711d.playTogether(ObjectAnimator.ofFloat(giftDialogGiftsView, (Property<GiftDialogGiftsView, Float>) property, 0.0f, xdl0.m208412y0()), ObjectAnimator.ofFloat(this.f98708a, (Property<GiftDialogGiftsView, Float>) property, -xdl0.m208412y0(), 0.0f));
            this.f98711d.setDuration(300L);
            this.f98711d.addListener(new C16904b(interfaceC16905c));
        }
        this.f98711d.start();
    }

    /* JADX INFO: renamed from: g */
    public void m122610g(InterfaceC16905c interfaceC16905c) {
        if (m122607d()) {
            return;
        }
        if (this.f98710c == null) {
            this.f98710c = new AnimatorSet();
            GiftDialogGiftsView giftDialogGiftsView = this.f98709b;
            Property property = View.TRANSLATION_X;
            this.f98710c.playTogether(ObjectAnimator.ofFloat(giftDialogGiftsView, (Property<GiftDialogGiftsView, Float>) property, xdl0.m208412y0(), 0.0f), ObjectAnimator.ofFloat(this.f98708a, (Property<GiftDialogGiftsView, Float>) property, 0.0f, -xdl0.m208412y0()));
            this.f98710c.setDuration(300L);
            this.f98710c.addListener(new C16903a(interfaceC16905c));
        }
        this.f98710c.start();
    }
}
