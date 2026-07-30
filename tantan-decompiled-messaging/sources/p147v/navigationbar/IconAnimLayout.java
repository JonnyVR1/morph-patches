package p147v.navigationbar;

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
import p147v.VLinear;
import p149l.b6c0;
import p149l.bt0;
import p149l.p4c0;
import p149l.t100;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes3.dex */
public class IconAnimLayout extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final int f209754c = 1126940025;

    /* JADX INFO: renamed from: d */
    public static final int f209755d = -795202841;

    /* JADX INFO: renamed from: a */
    public final VLinear f209756a;

    /* JADX INFO: renamed from: b */
    public final VLinear f209757b;

    /* JADX INFO: renamed from: v.navigationbar.IconAnimLayout$a */
    public class C22610a extends bt0.C15966j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f209758a;

        public C22610a(ViewGroup viewGroup) {
            this.f209758a = viewGroup;
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            animator.end();
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            IconAnimLayout.this.m223577c(this.f209758a, null);
        }
    }

    /* JADX INFO: renamed from: v.navigationbar.IconAnimLayout$b */
    public class C22611b extends bt0.C15966j {
        public C22611b() {
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            animator.end();
        }
    }

    public IconAnimLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, b6c0.f73786l, this);
        this.f209756a = (VLinear) findViewById(p4c0.f147115f0);
        this.f209757b = (VLinear) findViewById(p4c0.f147117g0);
    }

    /* JADX INFO: renamed from: c */
    public final void m223577c(@NonNull ViewGroup viewGroup, @Nullable List<View> list) {
        viewGroup.removeAllViews();
        ArrayList<View> arrayListM200339n = vwb.m200339n(list, new w9j() { // from class: l.qam
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) != null);
            }
        });
        if (!vwb.m200296J(arrayListM200339n)) {
            for (View view : arrayListM200339n) {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                if (viewGroup.getChildCount() > 0) {
                    marginLayoutParams.leftMargin = t100.m186890d(8.0f);
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
    public final boolean m223578d(ViewGroup viewGroup) {
        return viewGroup.getTag(f209754c) == Boolean.TRUE;
    }

    /* JADX INFO: renamed from: e */
    public void m223579e(@Nullable List<View> list, @Nullable w9j<View, Animator> w9jVar, @Nullable w9j<View, Animator> w9jVar2) {
        if (m223578d(this.f209756a)) {
            m223580f(this.f209757b, this.f209756a, list, w9jVar, w9jVar2);
        } else {
            m223580f(this.f209756a, this.f209757b, list, w9jVar, w9jVar2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m223580f(ViewGroup viewGroup, ViewGroup viewGroup2, @Nullable List<View> list, @Nullable w9j<View, Animator> w9jVar, @Nullable w9j<View, Animator> w9jVar2) {
        int i = f209755d;
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
        int i2 = f209754c;
        viewGroup.setTag(i2, Boolean.TRUE);
        viewGroup2.setTag(i2, null);
        if (w9jVar != null) {
            Animator animatorCall = w9jVar.call(viewGroup2);
            animatorCall.addListener(new C22610a(viewGroup2));
            viewGroup2.setTag(i, animatorCall);
            animatorCall.start();
        } else {
            m223577c(viewGroup2, null);
        }
        m223577c(viewGroup, list);
        if (w9jVar2 != null) {
            Animator animatorCall2 = w9jVar2.call(viewGroup);
            animatorCall2.addListener(new C22611b());
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
