package com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.multiple;

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
import com.p051p1.mobile.putong.live.base.data.BLiveGiftCombosGears;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.GiftOperationView;
import java.util.List;
import java.util.Objects;
import p153l.bnl0;
import p153l.bri0;
import p153l.f8t;
import p153l.gt0;
import p153l.it0;
import p153l.jjs;
import p153l.jne0;
import p153l.jyb;
import p153l.qa00;
import p153l.x20;

/* JADX INFO: loaded from: classes4.dex */
public class LiveMultipleGiftView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveMultipleGiftView f50713d;

    /* JADX INFO: renamed from: e */
    public MultipleGiftItemView f50714e;

    /* JADX INFO: renamed from: f */
    public MultipleGiftItemView f50715f;

    /* JADX INFO: renamed from: g */
    public MultipleGiftItemView f50716g;

    /* JADX INFO: renamed from: h */
    public jjs f50717h;

    /* JADX INFO: renamed from: i */
    public LiveGiftItemView f50718i;

    /* JADX INFO: renamed from: j */
    public int f50719j;

    /* JADX INFO: renamed from: k */
    public AnimatorSet f50720k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f50721l;

    /* JADX INFO: renamed from: m */
    public boolean f50722m;

    /* JADX INFO: renamed from: n */
    public ViewGroup.MarginLayoutParams f50723n;

    /* JADX INFO: renamed from: o */
    public InterfaceC12974a f50724o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView$a */
    public interface InterfaceC12974a {
        /* JADX INFO: renamed from: a */
        void mo75070a(jne0 jne0Var);
    }

    public LiveMultipleGiftView(@NonNull Context context) {
        super(context);
        this.f50722m = false;
    }

    /* JADX INFO: renamed from: k0 */
    private int m75054k0(int i, int[] iArr) {
        int i2;
        int iM175859d;
        int width = this.f50718i.getWidth() / 2;
        int i3 = i % 4;
        if (i3 == 0) {
            i2 = iArr[0] + width;
            iM175859d = qa00.m175859d(54.0f);
        } else {
            if (i3 == 1) {
                int width2 = (iArr[0] + (this.f50718i.getWidth() / 2)) - qa00.m175859d(146.0f);
                if (width2 < 0) {
                    return 0;
                }
                return width2;
            }
            if (i3 == 2) {
                int width3 = (iArr[0] + (this.f50718i.getWidth() / 2)) - qa00.m175859d(146.0f);
                int iM175859d2 = qa00.m175859d(292.0f) + width3;
                int iM105592y0 = bnl0.m105592y0();
                return iM175859d2 > iM105592y0 ? width3 - (iM175859d2 - iM105592y0) : width3;
            }
            if (i3 != 3) {
                return 0;
            }
            i2 = iArr[0] + width;
            iM175859d = qa00.m175859d(238.0f);
        }
        return i2 - iM175859d;
    }

    /* JADX INFO: renamed from: l0 */
    private BLiveGiftCombosGears m75055l0(int i) {
        List<BLiveGiftCombosGears> list = this.f50717h.m145122h().interactRules.click.combosGears;
        if (jyb.m147479J(list)) {
            return BLiveGiftCombosGears.new_();
        }
        return (i < 0 || i >= list.size()) ? BLiveGiftCombosGears.new_() : list.get(i);
    }

    /* JADX INFO: renamed from: m0 */
    private AnimatorSet m75056m0(View view) {
        Animator animatorM132168n = gt0.m132168n(view, View.ALPHA, 1.0f, 0.0f);
        animatorM132168n.setDuration(180L);
        animatorM132168n.setInterpolator(null);
        Animator animatorM132168n2 = gt0.m132168n(view, gt0.f106354i, 1.0f, 0.0f);
        animatorM132168n2.setDuration(180L);
        animatorM132168n2.setInterpolator(null);
        Animator animatorM132168n3 = gt0.m132168n(view, View.TRANSLATION_Y, 0.0f, qa00.m175859d(60.0f));
        animatorM132168n3.setDuration(180L);
        animatorM132168n3.setInterpolator(null);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorM132168n, animatorM132168n2, animatorM132168n3);
        return animatorSet;
    }

    /* JADX INFO: renamed from: n0 */
    private AnimatorSet m75057n0(View view, int i) {
        Animator animatorM132168n = gt0.m132168n(view, View.ALPHA, 0.0f, 1.0f);
        animatorM132168n.setDuration(230L);
        animatorM132168n.setInterpolator(null);
        Animator animatorM132168n2 = gt0.m132168n(view, gt0.f106354i, 0.0f, 1.1f);
        animatorM132168n2.setDuration(180L);
        animatorM132168n2.setInterpolator(null);
        Animator animatorM132168n3 = gt0.m132168n(view, gt0.f106354i, 1.1f, 1.0f);
        animatorM132168n3.setDuration(120L);
        animatorM132168n3.setInterpolator(null);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(animatorM132168n2, animatorM132168n3);
        float[] fArr = {qa00.m175859d(60.0f), -qa00.m175859d(10.0f)};
        Property property = View.TRANSLATION_Y;
        Animator animatorM132168n4 = gt0.m132168n(view, property, fArr);
        animatorM132168n4.setDuration(180L);
        animatorM132168n4.setInterpolator(null);
        Animator animatorM132168n5 = gt0.m132168n(view, property, -qa00.m175859d(10.0f), 0.0f);
        animatorM132168n5.setDuration(120L);
        animatorM132168n5.setInterpolator(null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(animatorM132168n4, animatorM132168n5);
        AnimatorSet animatorSet3 = new AnimatorSet();
        Animator animatorM132164j = gt0.m132164j(i);
        animatorSet3.setStartDelay(i);
        animatorSet3.play(animatorM132168n).with(animatorSet).with(animatorSet2).after(animatorM132164j);
        return animatorSet3;
    }

    /* JADX INFO: renamed from: o0 */
    private boolean m75058o0(jjs jjsVar) {
        jjs jjsVar2 = this.f50717h;
        return (jjsVar2 == null || jjsVar.m145131q(jjsVar2)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m75059q0() {
        bnl0.m105525M0(this, true);
    }

    /* JADX INFO: renamed from: r */
    private void m75060r() {
        m75068v0(this.f50714e, 0);
        m75068v0(this.f50715f, 1);
        m75068v0(this.f50716g, 2);
        this.f50714e.m75077m0(MultipleGiftItemView.ContinueType2.SMALL);
        this.f50715f.m75077m0(MultipleGiftItemView.ContinueType2.MIDDLE);
        this.f50716g.m75077m0(MultipleGiftItemView.ContinueType2.LARGE);
        ViewGroup.LayoutParams layoutParams = this.f50713d.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            this.f50723n = (ViewGroup.MarginLayoutParams) layoutParams;
        }
    }

    /* JADX INFO: renamed from: s0 */
    private void m75061s0(jjs jjsVar) {
        this.f50714e.m75078o0(m75055l0(0), jjsVar);
        this.f50715f.m75078o0(m75055l0(1), jjsVar);
        this.f50716g.m75078o0(m75055l0(2), jjsVar);
    }

    /* JADX INFO: renamed from: u0 */
    private void m75062u0(int i) {
        int[] iArr = new int[2];
        this.f50718i.getLocationOnScreen(iArr);
        this.f50723n.leftMargin = m75054k0(i, iArr);
        this.f50723n.topMargin = ((iArr[1] - (this.f50718i.getHeight() / 2)) - qa00.m175859d(28.0f)) - GiftOperationView.f50609i;
        this.f50713d.setLayoutParams(this.f50723n);
    }

    /* JADX INFO: renamed from: y0 */
    private void m75063y0() {
        this.f50714e.setAlpha(0.0f);
        this.f50715f.setAlpha(0.0f);
        this.f50716g.setAlpha(0.0f);
        if (this.f50720k == null) {
            AnimatorSet animatorSetM75057n0 = m75057n0(this.f50714e, 100);
            AnimatorSet animatorSetM75057n1 = m75057n0(this.f50715f, 140);
            AnimatorSet animatorSetM75057n2 = m75057n0(this.f50716g, 180);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f50720k = animatorSet;
            animatorSet.playTogether(animatorSetM75057n0, animatorSetM75057n1, animatorSetM75057n2);
        }
        gt0.m132176v(this.f50720k, new Runnable() { // from class: l.e8t
            @Override // java.lang.Runnable
            public final void run() {
                this.f92561a.m75059q0();
            }
        });
        this.f50720k.start();
        this.f50722m = true;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m75064j0(View view) {
        f8t.m124562a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75064j0(this);
        m75060r();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m75065p0(MultipleGiftItemView multipleGiftItemView, int i, View view) {
        if (this.f50724o != null) {
            this.f50724o.mo75070a(new jne0(this.f50717h, this.f50718i, i, this.f50719j, (int) multipleGiftItemView.getGears().combosHitNum));
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m75066r0() {
        it0.m142007A(this.f50720k);
        it0.m142007A(this.f50721l);
        this.f50717h = null;
        this.f50722m = false;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8 || i == 4) {
            this.f50722m = false;
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m75067t0(LiveGiftItemView liveGiftItemView, jjs jjsVar, int i, InterfaceC12974a interfaceC12974a) {
        it0.m142007A(this.f50721l);
        if (m75058o0(jjsVar)) {
            this.f50722m = false;
        }
        this.f50718i = liveGiftItemView;
        this.f50717h = jjsVar;
        this.f50724o = interfaceC12974a;
        this.f50719j = i;
        m75061s0(jjsVar);
        m75062u0(i);
        if (this.f50722m) {
            bnl0.m105525M0(this, true);
        } else {
            m75063y0();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m75068v0(final MultipleGiftItemView multipleGiftItemView, final int i) {
        multipleGiftItemView.setOnClickListener(new View.OnClickListener() { // from class: l.d8t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85686a.m75065p0(multipleGiftItemView, i, view);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public void m75069w0(x20 x20Var) {
        it0.m142009C(this.f50721l);
        if (this.f50721l == null) {
            AnimatorSet animatorSetM75056m0 = m75056m0(this.f50714e);
            AnimatorSet animatorSetM75056m1 = m75056m0(this.f50715f);
            AnimatorSet animatorSetM75056m2 = m75056m0(this.f50716g);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f50721l = animatorSet;
            animatorSet.playTogether(animatorSetM75056m0, animatorSetM75056m1, animatorSetM75056m2);
        }
        AnimatorSet animatorSet2 = this.f50721l;
        Objects.requireNonNull(x20Var);
        gt0.m132160f(animatorSet2, new bri0(x20Var));
        this.f50721l.start();
        this.f50722m = false;
    }

    public LiveMultipleGiftView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50722m = false;
    }
}
