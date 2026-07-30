package p149l;

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
import com.p046p1.mobile.android.app.Act;
import org.jetbrains.annotations.NotNull;
import p147v.VCheckBox;
import p147v.VEditText;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class nzi implements s7m<fzi> {

    /* JADX INFO: renamed from: a */
    public VLinear f141221a;

    /* JADX INFO: renamed from: b */
    public CoordinatorLayout f141222b;

    /* JADX INFO: renamed from: c */
    public VLinear f141223c;

    /* JADX INFO: renamed from: d */
    public VEditText f141224d;

    /* JADX INFO: renamed from: e */
    public VCheckBox f141225e;

    /* JADX INFO: renamed from: f */
    public VText f141226f;

    /* JADX INFO: renamed from: g */
    public View f141227g;

    /* JADX INFO: renamed from: h */
    public Act f141228h;

    /* JADX INFO: renamed from: i */
    public fzi f141229i;

    /* JADX INFO: renamed from: j */
    public BottomSheetBehavior<View> f141230j;

    /* JADX INFO: renamed from: k */
    public boolean f141231k;

    /* JADX INFO: renamed from: l */
    public Interpolator f141232l = new jig();

    public nzi(Act act) {
        this.f141228h = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m162055w(View view) {
        if (this.f141231k) {
            this.f141228h.alwaysHideInput();
        } else {
            m162060m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m162056x(View view) {
        Editable text = this.f141224d.getText();
        String string = (text == null || TextUtils.isEmpty(text.toString())) ? "" : text.toString();
        this.f141229i.m123866y0(string.trim());
        p6j0.m167669c("e_forwarding_send", this.f141228h.pageId(), new j760("carry_text", Integer.valueOf(!TextUtils.isEmpty(string.trim()) ? 1 : 0)));
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f141228h;
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    public Act act() {
        return this.f141228h;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM162057j = m162057j(layoutInflater, viewGroup);
        m162064r();
        return act().setUpKeyboardDetectorLayout(viewM162057j, new View(act()), new f30() { // from class: l.gzi
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f105147a.m162059l((Boolean) obj, (Integer) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public View m162057j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ozi.m166842b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(fzi fziVar) {
        this.f141229i = fziVar;
    }

    /* JADX INFO: renamed from: l */
    public final void m162059l(Boolean bool, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        this.f141231k = zBooleanValue;
        int iIntValue = zBooleanValue ? 0 : num.intValue();
        final int iIntValue2 = this.f141231k ? num.intValue() : 0;
        Animator animatorM103738k = bt0.m103738k(ValueAnimator.ofInt(iIntValue, iIntValue2), this.f141232l, 0L, this.f141231k ? 300L : 200L);
        ((ValueAnimator) animatorM103738k).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.kzi
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f125385a.m162063q(valueAnimator);
            }
        });
        bt0.m103733f(animatorM103738k, new Runnable() { // from class: l.lzi
            @Override // java.lang.Runnable
            public final void run() {
                this.f130652a.m162065s(iIntValue2);
            }
        });
        animatorM103738k.start();
    }

    /* JADX INFO: renamed from: m */
    public void m162060m() {
        this.f141228h.alwaysHideInput();
        this.f141228h.m50458m2();
    }

    /* JADX INFO: renamed from: n */
    public void m162061n() {
        e51.m114743H(this.f141228h, new Runnable() { // from class: l.mzi
            @Override // java.lang.Runnable
            public final void run() {
                this.f136386a.m162066u();
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: p */
    public void m162062p() {
        this.f141228h.alwaysHideInput();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m162063q(ValueAnimator valueAnimator) {
        xdl0.m208325C0(this.f141227g, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: r */
    public void m162064r() {
        this.f141225e.setChecked(this.f141229i.f99968d);
        this.f141225e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.hzi
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f110199a.m162067v(compoundButton, z);
            }
        });
        BottomSheetBehavior<View> bottomSheetBehaviorFrom = BottomSheetBehavior.from(this.f141223c);
        this.f141230j = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.addBottomSheetCallback(new C18805a());
        xdl0.m208329E0(this.f141222b, new View.OnClickListener() { // from class: l.izi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115574a.m162055w(view);
            }
        });
        xdl0.m208329E0(this.f141226f, new View.OnClickListener() { // from class: l.jzi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120393a.m162056x(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m162065s(int i) {
        xdl0.m208325C0(this.f141227g, i);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m162067v(CompoundButton compoundButton, boolean z) {
        this.f141229i.f99968d = z;
        p6j0.m167669c("e_comment_together", this.f141228h.pageId(), new j760("selection_situation", Integer.valueOf(z ? 1 : 0)));
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void m162066u() {
        this.f141224d.requestFocus();
        act().showInput(this.f141224d, 0);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.nzi$a */
    public class C18805a extends BottomSheetBehavior.BottomSheetCallback {
        public C18805a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull @NotNull View view, int i) {
            if (i == 5) {
                nzi.this.m162060m();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull @NotNull View view, float f) {
        }
    }
}
