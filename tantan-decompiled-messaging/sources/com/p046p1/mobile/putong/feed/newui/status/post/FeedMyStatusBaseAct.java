package com.p046p1.mobile.putong.feed.newui.status.post;

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
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct;
import com.tantanapp.common.utils.NullChecker;
import p147v.VRelative;
import p149l.b5c0;
import p149l.d30;
import p149l.e30;
import p149l.ig3;
import p149l.o6c0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class FeedMyStatusBaseAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public CoordinatorLayout f42955c;

    /* JADX INFO: renamed from: d */
    public BottomSheetBehavior<View> f42956d;

    /* JADX INFO: renamed from: e */
    public boolean f42957e;

    /* JADX INFO: renamed from: f */
    public VRelative f42958f;

    /* JADX INFO: renamed from: g */
    public final BottomSheetBehavior.BottomSheetCallback f42959g = new C11347a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct$a */
    public class C11347a extends BottomSheetBehavior.BottomSheetCallback {
        public C11347a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 4) {
                FeedMyStatusBaseAct.this.f42957e = true;
                FeedMyStatusBaseAct.this.m66873d2();
            }
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ void m65790Y1(Bundle bundle) {
    }

    /* JADX INFO: renamed from: d2 */
    private GradientDrawable m65792d2() {
        int[] iArrMo65798g2 = mo65798g2();
        if (NullChecker.m81303a(iArrMo65798g2)) {
            if (iArrMo65798g2.length >= 2) {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArrMo65798g2);
                float fM65797e2 = m65797e2();
                gradientDrawable.setCornerRadii(new float[]{fM65797e2, fM65797e2, fM65797e2, fM65797e2, 0.0f, 0.0f, 0.0f, 0.0f});
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
                return gradientDrawable;
            }
            ig3.m135964a("color length must >= 2");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public /* synthetic */ void m65793i2() {
        if (NullChecker.m81303a(this.f42956d)) {
            this.f42956d.onDetachedFromLayoutParams();
            this.f42956d.removeBottomSheetCallback(this.f42959g);
        }
    }

    /* JADX INFO: renamed from: a2 */
    public final void m65794a2(View view) {
        m65795b2(view, 0.0f, 1.0f, 200L);
        view.setEnabled(true);
    }

    /* JADX INFO: renamed from: b2 */
    public final void m65795b2(View view, float f, float f2, long j) {
        if (view.getVisibility() == 0) {
            return;
        }
        view.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setDuration(j);
        view.startAnimation(alphaAnimation);
    }

    /* JADX INFO: renamed from: c2 */
    public int mo65796c2() {
        return 0;
    }

    /* JADX INFO: renamed from: e2 */
    public int m65797e2() {
        return t100.m186890d(24.0f);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public final void m66873d2() {
        if (!this.f42957e) {
            this.f42956d.setState(4);
        } else {
            super.m66873d2();
            overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: renamed from: g2 */
    public int[] mo65798g2() {
        return null;
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m65799h2() {
        ViewGroup.LayoutParams layoutParams = this.f42958f.getLayoutParams();
        layoutParams.height = this.f42955c.getHeight() - xdl0.m208331F0();
        this.f42958f.setLayoutParams(layoutParams);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public final View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142292u, viewGroup);
        this.f42955c = (CoordinatorLayout) viewInflate.findViewById(b5c0.f73569h);
        int iMo65796c2 = mo65796c2();
        if (iMo65796c2 != 0) {
            this.f42955c.setBackgroundColor(iMo65796c2);
        }
        this.f42958f = (VRelative) viewInflate.findViewById(b5c0.f73489I1);
        GradientDrawable gradientDrawableM65792d2 = m65792d2();
        if (NullChecker.m81303a(gradientDrawableM65792d2)) {
            this.f42958f.setBackground(gradientDrawableM65792d2);
        }
        View viewMo63060l2 = mo63060l2(layoutInflater, this.f42958f);
        if (NullChecker.m81303a(viewMo63060l2)) {
            this.f42958f.addView(viewMo63060l2);
        }
        m65794a2(this.f42955c);
        m65803o2(this.f42958f);
        BottomSheetBehavior<View> bottomSheetBehaviorFrom = BottomSheetBehavior.from(this.f42958f);
        this.f42956d = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setPeekHeight(0);
        this.f42956d.setState(3);
        this.f42956d.setSkipCollapsed(true);
        if (mo65801m2().intValue() != 0) {
            this.f42958f.getLayoutParams().height = mo65801m2().intValue();
        } else {
            this.f42955c.post(new Runnable() { // from class: l.bih
                @Override // java.lang.Runnable
                public final void run() {
                    this.f75759a.m65799h2();
                }
            });
        }
        this.f42956d.addBottomSheetCallback(this.f42959g);
        return viewInflate;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.cih
            @Override // p149l.e30
            public final void call(Object obj) {
                FeedMyStatusBaseAct.m65790Y1((Bundle) obj);
            }
        }, new d30() { // from class: l.dih
            @Override // p149l.d30
            public final void call() {
                this.f86389a.m65793i2();
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public void m65800k2() {
        this.f42957e = true;
        m66873d2();
    }

    /* JADX INFO: renamed from: l2 */
    public abstract View mo63060l2(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* JADX INFO: renamed from: m2 */
    public Integer mo65801m2() {
        return 0;
    }

    /* JADX INFO: renamed from: n2 */
    public void m65802n2(GradientDrawable gradientDrawable) {
        if (NullChecker.m81303a(gradientDrawable)) {
            this.f42958f.setBackground(gradientDrawable);
        }
    }

    /* JADX INFO: renamed from: o2 */
    public final void m65803o2(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(200L);
        view.setVisibility(0);
        view.startAnimation(translateAnimation);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        this.f42956d.setState(4);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setSwipeBackEnable(false);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
