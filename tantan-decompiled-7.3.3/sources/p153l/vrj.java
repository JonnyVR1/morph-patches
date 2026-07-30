package p153l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogGiftsView;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class vrj {

    /* JADX INFO: renamed from: a */
    public final GiftDialogGiftsView f185485a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public GiftDialogGiftsView f185486b;

    /* JADX INFO: renamed from: c */
    public AnimatorSet f185487c;

    /* JADX INFO: renamed from: d */
    public AnimatorSet f185488d;

    /* JADX INFO: renamed from: l.vrj$a */
    public class C20914a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC20916c f185489a;

        public C20914a(InterfaceC20916c interfaceC20916c) {
            this.f185489a = interfaceC20916c;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            vrj.this.f185486b.m75623O0();
            bnl0.m105525M0(vrj.this.f185485a, false);
            this.f185489a.mo75592a(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            bnl0.m105525M0(vrj.this.f185486b, true);
            bnl0.m105525M0(vrj.this.f185485a, true);
            this.f185489a.mo75593b();
        }
    }

    /* JADX INFO: renamed from: l.vrj$b */
    public class C20915b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC20916c f185491a;

        public C20915b(InterfaceC20916c interfaceC20916c) {
            this.f185491a = interfaceC20916c;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            vrj.this.f185485a.m75623O0();
            bnl0.m105525M0(vrj.this.f185486b, false);
            this.f185491a.mo75592a(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            bnl0.m105525M0(vrj.this.f185486b, true);
            bnl0.m105525M0(vrj.this.f185485a, true);
            this.f185491a.mo75593b();
        }
    }

    /* JADX INFO: renamed from: l.vrj$c */
    public interface InterfaceC20916c {
        /* JADX INFO: renamed from: a */
        void mo75592a(boolean z);

        /* JADX INFO: renamed from: b */
        void mo75593b();
    }

    public vrj(GiftDialogGiftsView giftDialogGiftsView) {
        this.f185485a = giftDialogGiftsView;
    }

    /* JADX INFO: renamed from: c */
    public void m202507c(GiftDialogGiftsView giftDialogGiftsView) {
        this.f185486b = giftDialogGiftsView;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m202508d() {
        return this.f185485a == null || this.f185486b == null;
    }

    /* JADX INFO: renamed from: e */
    public void m202509e() {
        GiftDialogGiftsView giftDialogGiftsView = this.f185485a;
        if (giftDialogGiftsView != null) {
            giftDialogGiftsView.setTranslationX(0.0f);
            bnl0.m105525M0(this.f185485a, true);
        }
        GiftDialogGiftsView giftDialogGiftsView2 = this.f185486b;
        if (giftDialogGiftsView2 != null) {
            giftDialogGiftsView2.setTranslationX(0.0f);
            bnl0.m105525M0(this.f185486b, false);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m202510f(InterfaceC20916c interfaceC20916c) {
        if (m202508d()) {
            return;
        }
        if (this.f185488d == null) {
            this.f185488d = new AnimatorSet();
            GiftDialogGiftsView giftDialogGiftsView = this.f185486b;
            Property property = View.TRANSLATION_X;
            this.f185488d.playTogether(ObjectAnimator.ofFloat(giftDialogGiftsView, (Property<GiftDialogGiftsView, Float>) property, 0.0f, bnl0.m105592y0()), ObjectAnimator.ofFloat(this.f185485a, (Property<GiftDialogGiftsView, Float>) property, -bnl0.m105592y0(), 0.0f));
            this.f185488d.setDuration(300L);
            this.f185488d.addListener(new C20915b(interfaceC20916c));
        }
        this.f185488d.start();
    }

    /* JADX INFO: renamed from: g */
    public void m202511g(InterfaceC20916c interfaceC20916c) {
        if (m202508d()) {
            return;
        }
        if (this.f185487c == null) {
            this.f185487c = new AnimatorSet();
            GiftDialogGiftsView giftDialogGiftsView = this.f185486b;
            Property property = View.TRANSLATION_X;
            this.f185487c.playTogether(ObjectAnimator.ofFloat(giftDialogGiftsView, (Property<GiftDialogGiftsView, Float>) property, bnl0.m105592y0(), 0.0f), ObjectAnimator.ofFloat(this.f185485a, (Property<GiftDialogGiftsView, Float>) property, 0.0f, -bnl0.m105592y0()));
            this.f185487c.setDuration(300L);
            this.f185487c.addListener(new C20914a(interfaceC20916c));
        }
        this.f185487c.start();
    }
}
