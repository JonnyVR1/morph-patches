package p007l;

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
import com.p1.mobile.android.app.Act;
import l.bt0;
import l.e51;
import l.f30;
import l.j760;
import l.jig;
import l.s7m;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VCheckBox;
import v.VEditText;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class nzi implements s7m<fzi> {

    /* JADX INFO: renamed from: a */
    public VLinear f10948a;

    /* JADX INFO: renamed from: b */
    public CoordinatorLayout f10949b;

    /* JADX INFO: renamed from: c */
    public VLinear f10950c;

    /* JADX INFO: renamed from: d */
    public VEditText f10951d;

    /* JADX INFO: renamed from: e */
    public VCheckBox f10952e;

    /* JADX INFO: renamed from: f */
    public VText f10953f;

    /* JADX INFO: renamed from: g */
    public View f10954g;

    /* JADX INFO: renamed from: h */
    public Act f10955h;

    /* JADX INFO: renamed from: i */
    public fzi f10956i;

    /* JADX INFO: renamed from: j */
    public BottomSheetBehavior<View> f10957j;

    /* JADX INFO: renamed from: k */
    public boolean f10958k;

    /* JADX INFO: renamed from: l */
    public Interpolator f10959l = new jig();

    public nzi(Act act) {
        this.f10955h = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m12397w(View view) {
        if (this.f10958k) {
            this.f10955h.alwaysHideInput();
        } else {
            m12404m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m12398x(View view) {
        Editable text = this.f10951d.getText();
        String string = (text == null || TextUtils.isEmpty(text.toString())) ? "" : text.toString();
        this.f10956i.m10361y0(string.trim());
        p6j0.m12913c("e_forwarding_send", this.f10955h.pageId(), new j760("carry_text", Integer.valueOf(!TextUtils.isEmpty(string.trim()) ? 1 : 0)));
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m12399C0() {
        return this.f10955h;
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    public Act act() {
        return this.f10955h;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM12401j = m12401j(layoutInflater, viewGroup);
        m12408r();
        return act().setUpKeyboardDetectorLayout(viewM12401j, new View(act()), new f30() { // from class: l.gzi
            public final void call(Object obj, Object obj2) {
                this.f8543a.m12403l((Boolean) obj, (Integer) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public View m12401j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ozi.m12876b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void m12400i1(fzi fziVar) {
        this.f10956i = fziVar;
    }

    /* JADX INFO: renamed from: l */
    public final void m12403l(Boolean bool, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        this.f10958k = zBooleanValue;
        int iIntValue = zBooleanValue ? 0 : num.intValue();
        final int iIntValue2 = this.f10958k ? num.intValue() : 0;
        Animator animatorK = bt0.k(ValueAnimator.ofInt(iIntValue, iIntValue2), this.f10959l, 0L, this.f10958k ? 300L : 200L);
        ((ValueAnimator) animatorK).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.kzi
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f9828a.m12407q(valueAnimator);
            }
        });
        bt0.f(animatorK, new Runnable() { // from class: l.lzi
            @Override // java.lang.Runnable
            public final void run() {
                this.f10169a.m12409s(iIntValue2);
            }
        });
        animatorK.start();
    }

    /* JADX INFO: renamed from: m */
    public void m12404m() {
        this.f10955h.alwaysHideInput();
        this.f10955h.finish();
    }

    /* JADX INFO: renamed from: n */
    public void m12405n() {
        e51.H(this.f10955h, new Runnable() { // from class: l.mzi
            @Override // java.lang.Runnable
            public final void run() {
                this.f10607a.m12410u();
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: p */
    public void m12406p() {
        this.f10955h.alwaysHideInput();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m12407q(ValueAnimator valueAnimator) {
        xdl0.C0(this.f10954g, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: r */
    public void m12408r() {
        this.f10952e.setChecked(this.f10956i.f8285d);
        this.f10952e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.hzi
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f8851a.m12411v(compoundButton, z);
            }
        });
        BottomSheetBehavior<View> bottomSheetBehaviorFrom = BottomSheetBehavior.from(this.f10950c);
        this.f10957j = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.addBottomSheetCallback(new C2444a());
        xdl0.E0(this.f10949b, new View.OnClickListener() { // from class: l.izi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9168a.m12397w(view);
            }
        });
        xdl0.E0(this.f10953f, new View.OnClickListener() { // from class: l.jzi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9558a.m12398x(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m12409s(int i) {
        xdl0.C0(this.f10954g, i);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m12411v(CompoundButton compoundButton, boolean z) {
        this.f10956i.f8285d = z;
        p6j0.m12913c("e_comment_together", this.f10955h.pageId(), new j760("selection_situation", Integer.valueOf(z ? 1 : 0)));
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void m12410u() {
        this.f10951d.requestFocus();
        act().showInput(this.f10951d, 0);
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.nzi$a */
    public class C2444a extends BottomSheetBehavior.BottomSheetCallback {
        public C2444a() {
        }

        public void onStateChanged(@NonNull @NotNull View view, int i) {
            if (i == 5) {
                nzi.this.m12404m();
            }
        }

        public void onSlide(@NonNull @NotNull View view, float f) {
        }
    }
}
