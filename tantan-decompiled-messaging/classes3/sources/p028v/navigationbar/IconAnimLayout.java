package p028v.navigationbar;

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
import l.b6c0;
import l.bt0;
import l.p4c0;
import l.t100;
import l.vwb;
import p003l.w9j;
import p028v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class IconAnimLayout extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final int f13379c = 1126940025;

    /* JADX INFO: renamed from: d */
    public static final int f13380d = -795202841;

    /* JADX INFO: renamed from: a */
    public final VLinear f13381a;

    /* JADX INFO: renamed from: b */
    public final VLinear f13382b;

    /* JADX INFO: renamed from: v.navigationbar.IconAnimLayout$a */
    public class C1403a extends bt0.j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f13383a;

        public C1403a(ViewGroup viewGroup) {
            this.f13383a = viewGroup;
        }

        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            animator.end();
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            IconAnimLayout.this.m12080c(this.f13383a, null);
        }
    }

    /* JADX INFO: renamed from: v.navigationbar.IconAnimLayout$b */
    public class C1404b extends bt0.j {
        public C1404b() {
        }

        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            animator.end();
        }
    }

    public IconAnimLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, b6c0.l, this);
        this.f13381a = (VLinear) findViewById(p4c0.f0);
        this.f13382b = (VLinear) findViewById(p4c0.g0);
    }

    /* JADX INFO: renamed from: c */
    public final void m12080c(@NonNull ViewGroup viewGroup, @Nullable List<View> list) {
        viewGroup.removeAllViews();
        ArrayList<View> arrayListN = vwb.n(list, new w9j() { // from class: l.qam
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) != null);
            }
        });
        if (!vwb.J(arrayListN)) {
            for (View view : arrayListN) {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                if (viewGroup.getChildCount() > 0) {
                    marginLayoutParams.leftMargin = t100.d(8.0f);
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
    public final boolean m12081d(ViewGroup viewGroup) {
        return viewGroup.getTag(f13379c) == Boolean.TRUE;
    }

    /* JADX INFO: renamed from: e */
    public void m12082e(@Nullable List<View> list, @Nullable w9j<View, Animator> w9jVar, @Nullable w9j<View, Animator> w9jVar2) {
        if (m12081d(this.f13381a)) {
            m12083f(this.f13382b, this.f13381a, list, w9jVar, w9jVar2);
        } else {
            m12083f(this.f13381a, this.f13382b, list, w9jVar, w9jVar2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m12083f(ViewGroup viewGroup, ViewGroup viewGroup2, @Nullable List<View> list, @Nullable w9j<View, Animator> w9jVar, @Nullable w9j<View, Animator> w9jVar2) {
        int i = f13380d;
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
        int i2 = f13379c;
        viewGroup.setTag(i2, Boolean.TRUE);
        viewGroup2.setTag(i2, null);
        if (w9jVar != null) {
            Animator animatorCall = w9jVar.call(viewGroup2);
            animatorCall.addListener(new C1403a(viewGroup2));
            viewGroup2.setTag(i, animatorCall);
            animatorCall.start();
        } else {
            m12080c(viewGroup2, null);
        }
        m12080c(viewGroup, list);
        if (w9jVar2 != null) {
            Animator animatorCall2 = w9jVar2.call(viewGroup);
            animatorCall2.addListener(new C1404b());
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
