package com.p000p1.mobile.putong.feed.newui.status.post;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.ig3;
import l.t100;
import l.xdl0;
import p007l.b5c0;
import p007l.o6c0;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public abstract class FeedMyStatusBaseAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public CoordinatorLayout f4416c;

    /* JADX INFO: renamed from: d */
    public BottomSheetBehavior<View> f4417d;

    /* JADX INFO: renamed from: e */
    public boolean f4418e;

    /* JADX INFO: renamed from: f */
    public VRelative f4419f;

    /* JADX INFO: renamed from: g */
    public final BottomSheetBehavior.BottomSheetCallback f4420g = new C2191a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct$a */
    public class C2191a extends BottomSheetBehavior.BottomSheetCallback {
        public C2191a() {
        }

        public void onSlide(@NonNull View view, float f) {
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 4) {
                FeedMyStatusBaseAct.this.f4418e = true;
                FeedMyStatusBaseAct.this.finish();
            }
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ void m6936Y1(Bundle bundle) {
    }

    /* JADX INFO: renamed from: d2 */
    private GradientDrawable m6938d2() {
        int[] iArrMo6944g2 = mo6944g2();
        if (NullChecker.a(iArrMo6944g2)) {
            if (iArrMo6944g2.length >= 2) {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArrMo6944g2);
                float fM6943e2 = m6943e2();
                gradientDrawable.setCornerRadii(new float[]{fM6943e2, fM6943e2, fM6943e2, fM6943e2, 0.0f, 0.0f, 0.0f, 0.0f});
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
                return gradientDrawable;
            }
            ig3.a("color length must >= 2");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public /* synthetic */ void m6939i2() {
        if (NullChecker.a(this.f4417d)) {
            this.f4417d.onDetachedFromLayoutParams();
            this.f4417d.removeBottomSheetCallback(this.f4420g);
        }
    }

    /* JADX INFO: renamed from: a2 */
    public final void m6940a2(View view) {
        m6941b2(view, 0.0f, 1.0f, 200L);
        view.setEnabled(true);
    }

    /* JADX INFO: renamed from: b2 */
    public final void m6941b2(View view, float f, float f2, long j) {
        if (view.getVisibility() == 0) {
            return;
        }
        view.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setDuration(j);
        view.startAnimation(alphaAnimation);
    }

    /* JADX INFO: renamed from: c2 */
    public int mo6942c2() {
        return 0;
    }

    /* JADX INFO: renamed from: e2 */
    public int m6943e2() {
        return t100.d(24.0f);
    }

    public final void finish() {
        if (!this.f4418e) {
            this.f4417d.setState(4);
        } else {
            super/*com.p1.mobile.android.app.Act*/.finish();
            overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: renamed from: g2 */
    public int[] mo6944g2() {
        return null;
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m6945h2() {
        ViewGroup.LayoutParams layoutParams = this.f4419f.getLayoutParams();
        layoutParams.height = this.f4416c.getHeight() - xdl0.F0();
        this.f4419f.setLayoutParams(layoutParams);
    }

    public final View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11311u, viewGroup);
        this.f4416c = viewInflate.findViewById(b5c0.f6050h);
        int iMo6942c2 = mo6942c2();
        if (iMo6942c2 != 0) {
            this.f4416c.setBackgroundColor(iMo6942c2);
        }
        this.f4419f = viewInflate.findViewById(b5c0.f5970I1);
        GradientDrawable gradientDrawableM6938d2 = m6938d2();
        if (NullChecker.a(gradientDrawableM6938d2)) {
            this.f4419f.setBackground(gradientDrawableM6938d2);
        }
        View viewMo4076l2 = mo4076l2(layoutInflater, this.f4419f);
        if (NullChecker.a(viewMo4076l2)) {
            this.f4419f.addView(viewMo4076l2);
        }
        m6940a2(this.f4416c);
        m6949o2(this.f4419f);
        BottomSheetBehavior<View> bottomSheetBehaviorFrom = BottomSheetBehavior.from(this.f4419f);
        this.f4417d = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setPeekHeight(0);
        this.f4417d.setState(3);
        this.f4417d.setSkipCollapsed(true);
        if (mo6947m2().intValue() != 0) {
            this.f4419f.getLayoutParams().height = mo6947m2().intValue();
        } else {
            this.f4416c.post(new Runnable() { // from class: l.bih
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6335a.m6945h2();
                }
            });
        }
        this.f4417d.addBottomSheetCallback(this.f4420g);
        return viewInflate;
    }

    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.cih
            public final void call(Object obj) {
                FeedMyStatusBaseAct.m6936Y1((Bundle) obj);
            }
        }, new d30() { // from class: l.dih
            public final void call() {
                this.f6949a.m6939i2();
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public void m6946k2() {
        this.f4418e = true;
        finish();
    }

    /* JADX INFO: renamed from: l2 */
    public abstract View mo4076l2(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* JADX INFO: renamed from: m2 */
    public Integer mo6947m2() {
        return 0;
    }

    /* JADX INFO: renamed from: n2 */
    public void m6948n2(GradientDrawable gradientDrawable) {
        if (NullChecker.a(gradientDrawable)) {
            this.f4419f.setBackground(gradientDrawable);
        }
    }

    /* JADX INFO: renamed from: o2 */
    public final void m6949o2(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(200L);
        view.setVisibility(0);
        view.startAnimation(translateAnimation);
    }

    public final void onBackPressed() {
        this.f4417d.setState(4);
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setSwipeBackEnable(false);
    }

    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
