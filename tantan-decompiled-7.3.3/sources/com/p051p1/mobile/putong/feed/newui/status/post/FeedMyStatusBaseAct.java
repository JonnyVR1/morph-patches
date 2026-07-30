package com.p051p1.mobile.putong.feed.newui.status.post;

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
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct;
import com.tantanapp.common.utils.NullChecker;
import p151v.VRelative;
import p153l.bnl0;
import p153l.hdc0;
import p153l.qa00;
import p153l.tec0;
import p153l.wg3;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public abstract class FeedMyStatusBaseAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public CoordinatorLayout f43803c;

    /* JADX INFO: renamed from: d */
    public BottomSheetBehavior<View> f43804d;

    /* JADX INFO: renamed from: e */
    public boolean f43805e;

    /* JADX INFO: renamed from: f */
    public VRelative f43806f;

    /* JADX INFO: renamed from: g */
    public final BottomSheetBehavior.BottomSheetCallback f43807g = new C11510a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct$a */
    public class C11510a extends BottomSheetBehavior.BottomSheetCallback {
        public C11510a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 4) {
                FeedMyStatusBaseAct.this.f43805e = true;
                FeedMyStatusBaseAct.this.m68056e2();
            }
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public static /* synthetic */ void m66973Z1(Bundle bundle) {
    }

    /* JADX INFO: renamed from: e2 */
    private GradientDrawable m66975e2() {
        int[] iArrMo66981h2 = mo66981h2();
        if (NullChecker.m82486a(iArrMo66981h2)) {
            if (iArrMo66981h2.length >= 2) {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArrMo66981h2);
                float fM66980g2 = m66980g2();
                gradientDrawable.setCornerRadii(new float[]{fM66980g2, fM66980g2, fM66980g2, fM66980g2, 0.0f, 0.0f, 0.0f, 0.0f});
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
                return gradientDrawable;
            }
            wg3.m206174a("color length must >= 2");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public /* synthetic */ void m66976k2() {
        if (NullChecker.m82486a(this.f43804d)) {
            this.f43804d.onDetachedFromLayoutParams();
            this.f43804d.removeBottomSheetCallback(this.f43807g);
        }
    }

    /* JADX INFO: renamed from: b2 */
    public final void m66977b2(View view) {
        m66978c2(view, 0.0f, 1.0f, 200L);
        view.setEnabled(true);
    }

    /* JADX INFO: renamed from: c2 */
    public final void m66978c2(View view, float f, float f2, long j) {
        if (view.getVisibility() == 0) {
            return;
        }
        view.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setDuration(j);
        view.startAnimation(alphaAnimation);
    }

    /* JADX INFO: renamed from: d2 */
    public int mo66979d2() {
        return 0;
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public final void m68056e2() {
        if (!this.f43805e) {
            this.f43804d.setState(4);
        } else {
            super.m68056e2();
            overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: renamed from: g2 */
    public int m66980g2() {
        return qa00.m175859d(24.0f);
    }

    /* JADX INFO: renamed from: h2 */
    public int[] mo66981h2() {
        return null;
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m66982i2() {
        ViewGroup.LayoutParams layoutParams = this.f43806f.getLayoutParams();
        layoutParams.height = this.f43803c.getHeight() - bnl0.m105511F0();
        this.f43806f.setLayoutParams(layoutParams);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public final View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173761u, viewGroup);
        this.f43803c = (CoordinatorLayout) viewInflate.findViewById(hdc0.f108922h);
        int iMo66979d2 = mo66979d2();
        if (iMo66979d2 != 0) {
            this.f43803c.setBackgroundColor(iMo66979d2);
        }
        this.f43806f = (VRelative) viewInflate.findViewById(hdc0.f108842I1);
        GradientDrawable gradientDrawableM66975e2 = m66975e2();
        if (NullChecker.m82486a(gradientDrawableM66975e2)) {
            this.f43806f.setBackground(gradientDrawableM66975e2);
        }
        View viewMo64243m2 = mo64243m2(layoutInflater, this.f43806f);
        if (NullChecker.m82486a(viewMo64243m2)) {
            this.f43806f.addView(viewMo64243m2);
        }
        m66977b2(this.f43803c);
        m66986p2(this.f43806f);
        BottomSheetBehavior<View> bottomSheetBehaviorFrom = BottomSheetBehavior.from(this.f43806f);
        this.f43804d = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setPeekHeight(0);
        this.f43804d.setState(3);
        this.f43804d.setSkipCollapsed(true);
        if (mo66984n2().intValue() != 0) {
            this.f43806f.getLayoutParams().height = mo66984n2().intValue();
        } else {
            this.f43803c.post(new Runnable() { // from class: l.qjh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f157971a.m66982i2();
                }
            });
        }
        this.f43804d.addBottomSheetCallback(this.f43807g);
        return viewInflate;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.rjh
            @Override // p153l.y20
            public final void call(Object obj) {
                FeedMyStatusBaseAct.m66973Z1((Bundle) obj);
            }
        }, new x20() { // from class: l.sjh
            @Override // p153l.x20
            public final void call() {
                this.f168971a.m66976k2();
            }
        });
    }

    /* JADX INFO: renamed from: l2 */
    public void m66983l2() {
        this.f43805e = true;
        m68056e2();
    }

    /* JADX INFO: renamed from: m2 */
    public abstract View mo64243m2(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* JADX INFO: renamed from: n2 */
    public Integer mo66984n2() {
        return 0;
    }

    /* JADX INFO: renamed from: o2 */
    public void m66985o2(GradientDrawable gradientDrawable) {
        if (NullChecker.m82486a(gradientDrawable)) {
            this.f43806f.setBackground(gradientDrawable);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        this.f43804d.setState(4);
    }

    /* JADX INFO: renamed from: p2 */
    public final void m66986p2(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(200L);
        view.setVisibility(0);
        view.startAnimation(translateAnimation);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setSwipeBackEnable(false);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
