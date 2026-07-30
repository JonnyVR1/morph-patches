package p153l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import org.jetbrains.annotations.NotNull;
import p151v.VCheckBox;
import p151v.VEditText;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class i2j implements iam<a2j> {

    /* JADX INFO: renamed from: a */
    public VLinear f112624a;

    /* JADX INFO: renamed from: b */
    public CoordinatorLayout f112625b;

    /* JADX INFO: renamed from: c */
    public VLinear f112626c;

    /* JADX INFO: renamed from: d */
    public VEditText f112627d;

    /* JADX INFO: renamed from: e */
    public VCheckBox f112628e;

    /* JADX INFO: renamed from: f */
    public VText f112629f;

    /* JADX INFO: renamed from: g */
    public View f112630g;

    /* JADX INFO: renamed from: h */
    public Act f112631h;

    /* JADX INFO: renamed from: i */
    public a2j f112632i;

    /* JADX INFO: renamed from: j */
    public BottomSheetBehavior<View> f112633j;

    /* JADX INFO: renamed from: k */
    public boolean f112634k;

    /* JADX INFO: renamed from: l */
    public Interpolator f112635l = new xjg();

    public i2j(Act act) {
        this.f112631h = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m138205w(View view) {
        if (this.f112634k) {
            this.f112631h.alwaysHideInput();
        } else {
            m138210m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m138206x(View view) {
        Editable text = this.f112627d.getText();
        String string = (text == null || TextUtils.isEmpty(text.toString())) ? "" : text.toString();
        this.f112632i.m95697y0(string.trim());
        tfj0.m190940c("e_forwarding_send", this.f112631h.pageId(), new pf60("carry_text", Integer.valueOf(!TextUtils.isEmpty(string.trim()) ? 1 : 0)));
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f112631h;
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    public Act act() {
        return this.f112631h;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM138207j = m138207j(layoutInflater, viewGroup);
        m138214r();
        return act().setUpKeyboardDetectorLayout(viewM138207j, new View(act()), new z20() { // from class: l.b2j
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f74621a.m138209l((Boolean) obj, (Integer) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public View m138207j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return j2j.m143217b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(a2j a2jVar) {
        this.f112632i = a2jVar;
    }

    /* JADX INFO: renamed from: l */
    public final void m138209l(Boolean bool, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        this.f112634k = zBooleanValue;
        int iIntValue = zBooleanValue ? 0 : num.intValue();
        final int iIntValue2 = this.f112634k ? num.intValue() : 0;
        Animator animatorM132165k = gt0.m132165k(ValueAnimator.ofInt(iIntValue, iIntValue2), this.f112635l, 0L, this.f112634k ? 300L : 200L);
        ((ValueAnimator) animatorM132165k).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.f2j
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f96887a.m138213q(valueAnimator);
            }
        });
        gt0.m132160f(animatorM132165k, new Runnable() { // from class: l.g2j
            @Override // java.lang.Runnable
            public final void run() {
                this.f101849a.m138215s(iIntValue2);
            }
        });
        animatorM132165k.start();
    }

    /* JADX INFO: renamed from: m */
    public void m138210m() {
        this.f112631h.alwaysHideInput();
        this.f112631h.m51642n2();
    }

    /* JADX INFO: renamed from: n */
    public void m138211n() {
        l51.m152888H(this.f112631h, new Runnable() { // from class: l.h2j
            @Override // java.lang.Runnable
            public final void run() {
                this.f107562a.m138216u();
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: p */
    public void m138212p() {
        this.f112631h.alwaysHideInput();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m138213q(ValueAnimator valueAnimator) {
        bnl0.m105505C0(this.f112630g, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: r */
    public void m138214r() {
        this.f112628e.setChecked(this.f112632i.f68003d);
        this.f112628e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.c2j
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f79486a.m138217v(compoundButton, z);
            }
        });
        BottomSheetBehavior<View> bottomSheetBehaviorFrom = BottomSheetBehavior.from(this.f112626c);
        this.f112633j = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.addBottomSheetCallback(new C17623a());
        bnl0.m105509E0(this.f112625b, new View.OnClickListener() { // from class: l.d2j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84794a.m138205w(view);
            }
        });
        bnl0.m105509E0(this.f112629f, new View.OnClickListener() { // from class: l.e2j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91770a.m138206x(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m138215s(int i) {
        bnl0.m105505C0(this.f112630g, i);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m138217v(CompoundButton compoundButton, boolean z) {
        this.f112632i.f68003d = z;
        tfj0.m190940c("e_comment_together", this.f112631h.pageId(), new pf60("selection_situation", Integer.valueOf(z ? 1 : 0)));
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void m138216u() {
        this.f112627d.requestFocus();
        act().showInput(this.f112627d, 0);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.i2j$a */
    public class C17623a extends BottomSheetBehavior.BottomSheetCallback {
        public C17623a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull @NotNull View view, int i) {
            if (i == 5) {
                i2j.this.m138210m();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull @NotNull View view, float f) {
        }
    }
}
