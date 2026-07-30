package p151v.navigationbar;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p151v.VLinear;
import p153l.gec0;
import p153l.gt0;
import p153l.jyb;
import p153l.qa00;
import p153l.qcj;
import p153l.vcc0;

/* JADX INFO: loaded from: classes3.dex */
public class IconAnimLayout extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final int f210676c = 1126940025;

    /* JADX INFO: renamed from: d */
    public static final int f210677d = -795202841;

    /* JADX INFO: renamed from: a */
    public final VLinear f210678a;

    /* JADX INFO: renamed from: b */
    public final VLinear f210679b;

    /* JADX INFO: renamed from: v.navigationbar.IconAnimLayout$a */
    public class C22725a extends gt0.C17308j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f210680a;

        public C22725a(ViewGroup viewGroup) {
            this.f210680a = viewGroup;
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            animator.end();
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            IconAnimLayout.this.m224823c(this.f210680a, null);
        }
    }

    /* JADX INFO: renamed from: v.navigationbar.IconAnimLayout$b */
    public class C22726b extends gt0.C17308j {
        public C22726b() {
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            animator.end();
        }
    }

    public IconAnimLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, gec0.f103799l, this);
        this.f210678a = (VLinear) findViewById(vcc0.f183415f0);
        this.f210679b = (VLinear) findViewById(vcc0.f183417g0);
    }

    /* JADX INFO: renamed from: c */
    public final void m224823c(@NonNull ViewGroup viewGroup, @Nullable List<View> list) {
        viewGroup.removeAllViews();
        ArrayList<View> arrayListM147522n = jyb.m147522n(list, new qcj() { // from class: l.gdm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) != null);
            }
        });
        if (!jyb.m147479J(arrayListM147522n)) {
            for (View view : arrayListM147522n) {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                if (viewGroup.getChildCount() > 0) {
                    marginLayoutParams.leftMargin = qa00.m175859d(8.0f);
                }
                viewGroup.addView(view, marginLayoutParams);
            }
        }
        if (viewGroup.getChildCount() > 0) {
            viewGroup.setVisibility(0);
        } else {
            viewGroup.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m224824d(ViewGroup viewGroup) {
        return viewGroup.getTag(f210676c) == Boolean.TRUE;
    }

    /* JADX INFO: renamed from: e */
    public void m224825e(@Nullable List<View> list, @Nullable qcj<View, Animator> qcjVar, @Nullable qcj<View, Animator> qcjVar2) {
        if (m224824d(this.f210678a)) {
            m224826f(this.f210679b, this.f210678a, list, qcjVar, qcjVar2);
        } else {
            m224826f(this.f210678a, this.f210679b, list, qcjVar, qcjVar2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m224826f(ViewGroup viewGroup, ViewGroup viewGroup2, @Nullable List<View> list, @Nullable qcj<View, Animator> qcjVar, @Nullable qcj<View, Animator> qcjVar2) {
        int i = f210677d;
        Animator animator = (Animator) viewGroup.getTag(i);
        if (animator != null) {
            viewGroup.setTag(i, null);
            animator.cancel();
        }
        Animator animator2 = (Animator) viewGroup2.getTag(i);
        if (animator2 != null) {
            viewGroup2.setTag(i, null);
            animator2.cancel();
        }
        int i2 = f210676c;
        viewGroup.setTag(i2, Boolean.TRUE);
        viewGroup2.setTag(i2, null);
        if (qcjVar != null) {
            Animator animatorCall = qcjVar.call(viewGroup2);
            animatorCall.addListener(new C22725a(viewGroup2));
            viewGroup2.setTag(i, animatorCall);
            animatorCall.start();
        } else {
            m224823c(viewGroup2, null);
        }
        m224823c(viewGroup, list);
        if (qcjVar2 != null) {
            Animator animatorCall2 = qcjVar2.call(viewGroup);
            animatorCall2.addListener(new C22726b());
            viewGroup.setTag(i, animatorCall2);
            animatorCall2.start();
        }
    }

    public IconAnimLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IconAnimLayout(@NonNull Context context) {
        this(context, null);
    }
}
