package com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.multiple;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.GiftOperationView;
import com.p1.mobile.putong.live.base.data.BLiveGiftCombosGears;
import java.util.List;
import java.util.Objects;
import l.bii0;
import l.bt0;
import l.d30;
import l.dt0;
import l.t100;
import l.vwb;
import l.xdl0;
import p002l.e6t;
import p002l.efe0;
import p002l.ihs;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveMultipleGiftView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveMultipleGiftView f5907d;

    /* JADX INFO: renamed from: e */
    public MultipleGiftItemView f5908e;

    /* JADX INFO: renamed from: f */
    public MultipleGiftItemView f5909f;

    /* JADX INFO: renamed from: g */
    public MultipleGiftItemView f5910g;

    /* JADX INFO: renamed from: h */
    public ihs f5911h;

    /* JADX INFO: renamed from: i */
    public LiveGiftItemView f5912i;

    /* JADX INFO: renamed from: j */
    public int f5913j;

    /* JADX INFO: renamed from: k */
    public AnimatorSet f5914k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f5915l;

    /* JADX INFO: renamed from: m */
    public boolean f5916m;

    /* JADX INFO: renamed from: n */
    public ViewGroup.MarginLayoutParams f5917n;

    /* JADX INFO: renamed from: o */
    public InterfaceC0400a f5918o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView$a */
    public interface InterfaceC0400a {
        /* JADX INFO: renamed from: a */
        void mo7443a(efe0 efe0Var);
    }

    public LiveMultipleGiftView(@NonNull Context context) {
        super(context);
        this.f5916m = false;
    }

    /* JADX INFO: renamed from: k0 */
    private int m7427k0(int i, int[] iArr) {
        int i2;
        int iD;
        int width = this.f5912i.getWidth() / 2;
        int i3 = i % 4;
        if (i3 == 0) {
            i2 = iArr[0] + width;
            iD = t100.d(54.0f);
        } else {
            if (i3 == 1) {
                int width2 = (iArr[0] + (this.f5912i.getWidth() / 2)) - t100.d(146.0f);
                if (width2 < 0) {
                    return 0;
                }
                return width2;
            }
            if (i3 == 2) {
                int width3 = (iArr[0] + (this.f5912i.getWidth() / 2)) - t100.d(146.0f);
                int iD2 = t100.d(292.0f) + width3;
                int iY0 = xdl0.y0();
                return iD2 > iY0 ? width3 - (iD2 - iY0) : width3;
            }
            if (i3 != 3) {
                return 0;
            }
            i2 = iArr[0] + width;
            iD = t100.d(238.0f);
        }
        return i2 - iD;
    }

    /* JADX INFO: renamed from: l0 */
    private BLiveGiftCombosGears m7428l0(int i) {
        List list = this.f5911h.m15160h().interactRules.click.combosGears;
        if (vwb.J(list)) {
            return BLiveGiftCombosGears.new_();
        }
        return (i < 0 || i >= list.size()) ? BLiveGiftCombosGears.new_() : (BLiveGiftCombosGears) list.get(i);
    }

    /* JADX INFO: renamed from: m0 */
    private AnimatorSet m7429m0(View view) {
        Animator animatorN = bt0.n(view, View.ALPHA, new float[]{1.0f, 0.0f});
        animatorN.setDuration(180L);
        animatorN.setInterpolator(null);
        Animator animatorN2 = bt0.n(view, bt0.i, new float[]{1.0f, 0.0f});
        animatorN2.setDuration(180L);
        animatorN2.setInterpolator(null);
        Animator animatorN3 = bt0.n(view, View.TRANSLATION_Y, new float[]{0.0f, t100.d(60.0f)});
        animatorN3.setDuration(180L);
        animatorN3.setInterpolator(null);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorN, animatorN2, animatorN3);
        return animatorSet;
    }

    /* JADX INFO: renamed from: n0 */
    private AnimatorSet m7430n0(View view, int i) {
        Animator animatorN = bt0.n(view, View.ALPHA, new float[]{0.0f, 1.0f});
        animatorN.setDuration(230L);
        animatorN.setInterpolator(null);
        Animator animatorN2 = bt0.n(view, bt0.i, new float[]{0.0f, 1.1f});
        animatorN2.setDuration(180L);
        animatorN2.setInterpolator(null);
        Animator animatorN3 = bt0.n(view, bt0.i, new float[]{1.1f, 1.0f});
        animatorN3.setDuration(120L);
        animatorN3.setInterpolator(null);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(animatorN2, animatorN3);
        float[] fArr = {t100.d(60.0f), -t100.d(10.0f)};
        Property property = View.TRANSLATION_Y;
        Animator animatorN4 = bt0.n(view, property, fArr);
        animatorN4.setDuration(180L);
        animatorN4.setInterpolator(null);
        Animator animatorN5 = bt0.n(view, property, new float[]{-t100.d(10.0f), 0.0f});
        animatorN5.setDuration(120L);
        animatorN5.setInterpolator(null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(animatorN4, animatorN5);
        AnimatorSet animatorSet3 = new AnimatorSet();
        Animator animatorJ = bt0.j(i);
        animatorSet3.setStartDelay(i);
        animatorSet3.play(animatorN).with(animatorSet).with(animatorSet2).after(animatorJ);
        return animatorSet3;
    }

    /* JADX INFO: renamed from: o0 */
    private boolean m7431o0(ihs ihsVar) {
        ihs ihsVar2 = this.f5911h;
        return (ihsVar2 == null || ihsVar.m15169q(ihsVar2)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m7432q0() {
        xdl0.M0(this, true);
    }

    /* JADX INFO: renamed from: r */
    private void m7433r() {
        m7441v0(this.f5908e, 0);
        m7441v0(this.f5909f, 1);
        m7441v0(this.f5910g, 2);
        this.f5908e.m7450m0(MultipleGiftItemView.ContinueType2.SMALL);
        this.f5909f.m7450m0(MultipleGiftItemView.ContinueType2.MIDDLE);
        this.f5910g.m7450m0(MultipleGiftItemView.ContinueType2.LARGE);
        ViewGroup.LayoutParams layoutParams = this.f5907d.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            this.f5917n = (ViewGroup.MarginLayoutParams) layoutParams;
        }
    }

    /* JADX INFO: renamed from: s0 */
    private void m7434s0(ihs ihsVar) {
        this.f5908e.m7451o0(m7428l0(0), ihsVar);
        this.f5909f.m7451o0(m7428l0(1), ihsVar);
        this.f5910g.m7451o0(m7428l0(2), ihsVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: u0 */
    private void m7435u0(int i) {
        int[] iArr = new int[2];
        this.f5912i.getLocationOnScreen(iArr);
        this.f5917n.leftMargin = m7427k0(i, iArr);
        this.f5917n.topMargin = ((iArr[1] - (this.f5912i.getHeight() / 2)) - t100.d(28.0f)) - GiftOperationView.f5803i;
        this.f5907d.setLayoutParams(this.f5917n);
    }

    /* JADX INFO: renamed from: y0 */
    private void m7436y0() {
        this.f5908e.setAlpha(0.0f);
        this.f5909f.setAlpha(0.0f);
        this.f5910g.setAlpha(0.0f);
        if (this.f5914k == null) {
            AnimatorSet animatorSetM7430n0 = m7430n0(this.f5908e, 100);
            AnimatorSet animatorSetM7430n1 = m7430n0(this.f5909f, 140);
            AnimatorSet animatorSetM7430n2 = m7430n0(this.f5910g, 180);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f5914k = animatorSet;
            animatorSet.playTogether(animatorSetM7430n0, animatorSetM7430n1, animatorSetM7430n2);
        }
        bt0.v(this.f5914k, new Runnable() { // from class: l.d6t
            @Override // java.lang.Runnable
            public final void run() {
                this.f9081a.m7432q0();
            }
        });
        this.f5914k.start();
        this.f5916m = true;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m7437j0(View view) {
        e6t.m12250a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7437j0(this);
        m7433r();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m7438p0(MultipleGiftItemView multipleGiftItemView, int i, View view) {
        if (this.f5918o != null) {
            this.f5918o.mo7443a(new efe0(this.f5911h, this.f5912i, i, this.f5913j, (int) multipleGiftItemView.getGears().combosHitNum));
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m7439r0() {
        dt0.A(this.f5914k);
        dt0.A(this.f5915l);
        this.f5911h = null;
        this.f5916m = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setVisibility(int i) {
        super/*android.view.View*/.setVisibility(i);
        if (i == 8 || i == 4) {
            this.f5916m = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t0 */
    public void m7440t0(LiveGiftItemView liveGiftItemView, ihs ihsVar, int i, InterfaceC0400a interfaceC0400a) {
        dt0.A(this.f5915l);
        if (m7431o0(ihsVar)) {
            this.f5916m = false;
        }
        this.f5912i = liveGiftItemView;
        this.f5911h = ihsVar;
        this.f5918o = interfaceC0400a;
        this.f5913j = i;
        m7434s0(ihsVar);
        m7435u0(i);
        if (this.f5916m) {
            xdl0.M0(this, true);
        } else {
            m7436y0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v0 */
    public final void m7441v0(final MultipleGiftItemView multipleGiftItemView, final int i) {
        multipleGiftItemView.setOnClickListener(new View.OnClickListener() { // from class: l.c6t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8512a.m7438p0(multipleGiftItemView, i, view);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public void m7442w0(d30 d30Var) {
        dt0.C(this.f5915l);
        if (this.f5915l == null) {
            AnimatorSet animatorSetM7429m0 = m7429m0(this.f5908e);
            AnimatorSet animatorSetM7429m1 = m7429m0(this.f5909f);
            AnimatorSet animatorSetM7429m2 = m7429m0(this.f5910g);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f5915l = animatorSet;
            animatorSet.playTogether(animatorSetM7429m0, animatorSetM7429m1, animatorSetM7429m2);
        }
        AnimatorSet animatorSet2 = this.f5915l;
        Objects.requireNonNull(d30Var);
        bt0.f(animatorSet2, new bii0(d30Var));
        this.f5915l.start();
        this.f5916m = false;
    }

    public LiveMultipleGiftView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5916m = false;
    }
}
