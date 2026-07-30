package com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.multiple;

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
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftItemView;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftOperationView;
import java.util.List;
import java.util.Objects;
import p153l.bnl0;
import p153l.bri0;
import p153l.gt0;
import p153l.it0;
import p153l.jjs;
import p153l.jyb;
import p153l.kne0;
import p153l.qa00;
import p153l.x20;
import p153l.xpu;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatMultipleGiftView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveVChatMultipleGiftView f46169d;

    /* JADX INFO: renamed from: e */
    public LiveVChatMultipleGiftItemView f46170e;

    /* JADX INFO: renamed from: f */
    public LiveVChatMultipleGiftItemView f46171f;

    /* JADX INFO: renamed from: g */
    public LiveVChatMultipleGiftItemView f46172g;

    /* JADX INFO: renamed from: h */
    public jjs f46173h;

    /* JADX INFO: renamed from: i */
    public LiveVChatGiftItemView f46174i;

    /* JADX INFO: renamed from: j */
    public int f46175j;

    /* JADX INFO: renamed from: k */
    public AnimatorSet f46176k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f46177l;

    /* JADX INFO: renamed from: m */
    public boolean f46178m;

    /* JADX INFO: renamed from: n */
    public ViewGroup.MarginLayoutParams f46179n;

    /* JADX INFO: renamed from: o */
    public InterfaceC12693a f46180o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.multiple.LiveVChatMultipleGiftView$a */
    public interface InterfaceC12693a {
        /* JADX INFO: renamed from: a */
        void mo70865a(kne0 kne0Var);
    }

    public LiveVChatMultipleGiftView(@NonNull Context context) {
        super(context);
        this.f46178m = false;
    }

    /* JADX INFO: renamed from: r */
    private void m70849r() {
        m70863v0(this.f46170e, 0);
        m70863v0(this.f46171f, 1);
        m70863v0(this.f46172g, 2);
        this.f46170e.m70844m0(LiveVChatMultipleGiftItemView.ContinueType2.SMALL);
        this.f46171f.m70844m0(LiveVChatMultipleGiftItemView.ContinueType2.MIDDLE);
        this.f46172g.m70844m0(LiveVChatMultipleGiftItemView.ContinueType2.LARGE);
        ViewGroup.LayoutParams layoutParams = this.f46169d.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            this.f46179n = (ViewGroup.MarginLayoutParams) layoutParams;
        }
    }

    /* JADX INFO: renamed from: y0 */
    private void m70850y0() {
        this.f46170e.setAlpha(0.0f);
        this.f46171f.setAlpha(0.0f);
        this.f46172g.setAlpha(0.0f);
        if (this.f46176k == null) {
            AnimatorSet animatorSetM70855n0 = m70855n0(this.f46170e, 100);
            AnimatorSet animatorSetM70855n1 = m70855n0(this.f46171f, 140);
            AnimatorSet animatorSetM70855n2 = m70855n0(this.f46172g, 180);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f46176k = animatorSet;
            animatorSet.playTogether(animatorSetM70855n0, animatorSetM70855n1, animatorSetM70855n2);
        }
        gt0.m132176v(this.f46176k, new Runnable() { // from class: l.wpu
            @Override // java.lang.Runnable
            public final void run() {
                this.f190348a.m70858q0();
            }
        });
        this.f46176k.start();
        this.f46178m = true;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m70851j0(View view) {
        xpu.m212683a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final int m70852k0(int i, int[] iArr) {
        int i2;
        int iM175859d;
        int width = this.f46174i.getWidth() / 2;
        int i3 = i % 4;
        if (i3 == 0) {
            i2 = iArr[0] + width;
            iM175859d = qa00.m175859d(54.0f);
        } else {
            if (i3 == 1) {
                int width2 = (iArr[0] + (this.f46174i.getWidth() / 2)) - qa00.m175859d(146.0f);
                if (width2 < 0) {
                    return 0;
                }
                return width2;
            }
            if (i3 == 2) {
                int width3 = (iArr[0] + (this.f46174i.getWidth() / 2)) - qa00.m175859d(146.0f);
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
    public final BLiveGiftCombosGears m70853l0(int i) {
        List<BLiveGiftCombosGears> list = this.f46173h.m145122h().interactRules.click.combosGears;
        if (jyb.m147479J(list)) {
            return BLiveGiftCombosGears.new_();
        }
        return (i < 0 || i >= list.size()) ? BLiveGiftCombosGears.new_() : list.get(i);
    }

    /* JADX INFO: renamed from: m0 */
    public final AnimatorSet m70854m0(View view) {
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
    public final AnimatorSet m70855n0(View view, int i) {
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
    public final boolean m70856o0(jjs jjsVar) {
        jjs jjsVar2 = this.f46173h;
        return (jjsVar2 == null || jjsVar.m145131q(jjsVar2)) ? false : true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70851j0(this);
        m70849r();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m70857p0(LiveVChatMultipleGiftItemView liveVChatMultipleGiftItemView, int i, View view) {
        if (this.f46180o != null) {
            this.f46180o.mo70865a(new kne0(this.f46173h, this.f46174i, i, this.f46175j, (int) liveVChatMultipleGiftItemView.getGears().combosHitNum));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m70858q0() {
        bnl0.m105525M0(this, true);
    }

    /* JADX INFO: renamed from: r0 */
    public void m70859r0() {
        it0.m142007A(this.f46176k);
        it0.m142007A(this.f46177l);
        this.f46173h = null;
        this.f46178m = false;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m70860s0(jjs jjsVar) {
        this.f46170e.m70846o0(m70853l0(0), jjsVar);
        this.f46171f.m70846o0(m70853l0(1), jjsVar);
        this.f46172g.m70846o0(m70853l0(2), jjsVar);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8 || i == 4) {
            this.f46178m = false;
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m70861t0(LiveVChatGiftItemView liveVChatGiftItemView, jjs jjsVar, int i, InterfaceC12693a interfaceC12693a) {
        it0.m142007A(this.f46177l);
        if (m70856o0(jjsVar)) {
            this.f46178m = false;
        }
        this.f46174i = liveVChatGiftItemView;
        this.f46173h = jjsVar;
        this.f46180o = interfaceC12693a;
        this.f46175j = i;
        m70860s0(jjsVar);
        m70862u0(i);
        if (this.f46178m) {
            bnl0.m105525M0(this, true);
        } else {
            m70850y0();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m70862u0(int i) {
        int[] iArr = new int[2];
        this.f46174i.getLocationOnScreen(iArr);
        this.f46179n.leftMargin = m70852k0(i, iArr);
        this.f46179n.topMargin = ((iArr[1] - (this.f46174i.getHeight() / 2)) - qa00.m175859d(28.0f)) - LiveVChatGiftOperationView.f46060i;
        this.f46169d.setLayoutParams(this.f46179n);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m70863v0(final LiveVChatMultipleGiftItemView liveVChatMultipleGiftItemView, final int i) {
        liveVChatMultipleGiftItemView.setOnClickListener(new View.OnClickListener() { // from class: l.vpu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185304a.m70857p0(liveVChatMultipleGiftItemView, i, view);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public void m70864w0(x20 x20Var) {
        it0.m142009C(this.f46177l);
        if (this.f46177l == null) {
            AnimatorSet animatorSetM70854m0 = m70854m0(this.f46170e);
            AnimatorSet animatorSetM70854m1 = m70854m0(this.f46171f);
            AnimatorSet animatorSetM70854m2 = m70854m0(this.f46172g);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f46177l = animatorSet;
            animatorSet.playTogether(animatorSetM70854m0, animatorSetM70854m1, animatorSetM70854m2);
        }
        AnimatorSet animatorSet2 = this.f46177l;
        Objects.requireNonNull(x20Var);
        gt0.m132160f(animatorSet2, new bri0(x20Var));
        this.f46177l.start();
        this.f46178m = false;
    }

    public LiveVChatMultipleGiftView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46178m = false;
    }
}
