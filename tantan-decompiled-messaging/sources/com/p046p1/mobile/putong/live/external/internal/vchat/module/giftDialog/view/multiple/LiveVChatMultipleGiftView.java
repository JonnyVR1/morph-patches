package com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.multiple;

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
import com.p046p1.mobile.putong.live.base.data.BLiveGiftCombosGears;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftItemView;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftOperationView;
import java.util.List;
import java.util.Objects;
import p149l.bii0;
import p149l.bt0;
import p149l.d30;
import p149l.dt0;
import p149l.ffe0;
import p149l.ihs;
import p149l.t100;
import p149l.vwb;
import p149l.wnu;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatMultipleGiftView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveVChatMultipleGiftView f45321d;

    /* JADX INFO: renamed from: e */
    public LiveVChatMultipleGiftItemView f45322e;

    /* JADX INFO: renamed from: f */
    public LiveVChatMultipleGiftItemView f45323f;

    /* JADX INFO: renamed from: g */
    public LiveVChatMultipleGiftItemView f45324g;

    /* JADX INFO: renamed from: h */
    public ihs f45325h;

    /* JADX INFO: renamed from: i */
    public LiveVChatGiftItemView f45326i;

    /* JADX INFO: renamed from: j */
    public int f45327j;

    /* JADX INFO: renamed from: k */
    public AnimatorSet f45328k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f45329l;

    /* JADX INFO: renamed from: m */
    public boolean f45330m;

    /* JADX INFO: renamed from: n */
    public ViewGroup.MarginLayoutParams f45331n;

    /* JADX INFO: renamed from: o */
    public InterfaceC12530a f45332o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.multiple.LiveVChatMultipleGiftView$a */
    public interface InterfaceC12530a {
        /* JADX INFO: renamed from: a */
        void mo69682a(ffe0 ffe0Var);
    }

    public LiveVChatMultipleGiftView(@NonNull Context context) {
        super(context);
        this.f45330m = false;
    }

    /* JADX INFO: renamed from: r */
    private void m69666r() {
        m69680v0(this.f45322e, 0);
        m69680v0(this.f45323f, 1);
        m69680v0(this.f45324g, 2);
        this.f45322e.m69661m0(LiveVChatMultipleGiftItemView.ContinueType2.SMALL);
        this.f45323f.m69661m0(LiveVChatMultipleGiftItemView.ContinueType2.MIDDLE);
        this.f45324g.m69661m0(LiveVChatMultipleGiftItemView.ContinueType2.LARGE);
        ViewGroup.LayoutParams layoutParams = this.f45321d.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            this.f45331n = (ViewGroup.MarginLayoutParams) layoutParams;
        }
    }

    /* JADX INFO: renamed from: y0 */
    private void m69667y0() {
        this.f45322e.setAlpha(0.0f);
        this.f45323f.setAlpha(0.0f);
        this.f45324g.setAlpha(0.0f);
        if (this.f45328k == null) {
            AnimatorSet animatorSetM69672n0 = m69672n0(this.f45322e, 100);
            AnimatorSet animatorSetM69672n1 = m69672n0(this.f45323f, 140);
            AnimatorSet animatorSetM69672n2 = m69672n0(this.f45324g, 180);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f45328k = animatorSet;
            animatorSet.playTogether(animatorSetM69672n0, animatorSetM69672n1, animatorSetM69672n2);
        }
        bt0.m103749v(this.f45328k, new Runnable() { // from class: l.vnu
            @Override // java.lang.Runnable
            public final void run() {
                this.f182281a.m69675q0();
            }
        });
        this.f45328k.start();
        this.f45330m = true;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m69668j0(View view) {
        wnu.m204780a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final int m69669k0(int i, int[] iArr) {
        int i2;
        int iM186890d;
        int width = this.f45326i.getWidth() / 2;
        int i3 = i % 4;
        if (i3 == 0) {
            i2 = iArr[0] + width;
            iM186890d = t100.m186890d(54.0f);
        } else {
            if (i3 == 1) {
                int width2 = (iArr[0] + (this.f45326i.getWidth() / 2)) - t100.m186890d(146.0f);
                if (width2 < 0) {
                    return 0;
                }
                return width2;
            }
            if (i3 == 2) {
                int width3 = (iArr[0] + (this.f45326i.getWidth() / 2)) - t100.m186890d(146.0f);
                int iM186890d2 = t100.m186890d(292.0f) + width3;
                int iM208412y0 = xdl0.m208412y0();
                return iM186890d2 > iM208412y0 ? width3 - (iM186890d2 - iM208412y0) : width3;
            }
            if (i3 != 3) {
                return 0;
            }
            i2 = iArr[0] + width;
            iM186890d = t100.m186890d(238.0f);
        }
        return i2 - iM186890d;
    }

    /* JADX INFO: renamed from: l0 */
    public final BLiveGiftCombosGears m69670l0(int i) {
        List<BLiveGiftCombosGears> list = this.f45325h.m136283h().interactRules.click.combosGears;
        if (vwb.m200296J(list)) {
            return BLiveGiftCombosGears.new_();
        }
        return (i < 0 || i >= list.size()) ? BLiveGiftCombosGears.new_() : list.get(i);
    }

    /* JADX INFO: renamed from: m0 */
    public final AnimatorSet m69671m0(View view) {
        Animator animatorM103741n = bt0.m103741n(view, View.ALPHA, 1.0f, 0.0f);
        animatorM103741n.setDuration(180L);
        animatorM103741n.setInterpolator(null);
        Animator animatorM103741n2 = bt0.m103741n(view, bt0.f77162i, 1.0f, 0.0f);
        animatorM103741n2.setDuration(180L);
        animatorM103741n2.setInterpolator(null);
        Animator animatorM103741n3 = bt0.m103741n(view, View.TRANSLATION_Y, 0.0f, t100.m186890d(60.0f));
        animatorM103741n3.setDuration(180L);
        animatorM103741n3.setInterpolator(null);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorM103741n, animatorM103741n2, animatorM103741n3);
        return animatorSet;
    }

    /* JADX INFO: renamed from: n0 */
    public final AnimatorSet m69672n0(View view, int i) {
        Animator animatorM103741n = bt0.m103741n(view, View.ALPHA, 0.0f, 1.0f);
        animatorM103741n.setDuration(230L);
        animatorM103741n.setInterpolator(null);
        Animator animatorM103741n2 = bt0.m103741n(view, bt0.f77162i, 0.0f, 1.1f);
        animatorM103741n2.setDuration(180L);
        animatorM103741n2.setInterpolator(null);
        Animator animatorM103741n3 = bt0.m103741n(view, bt0.f77162i, 1.1f, 1.0f);
        animatorM103741n3.setDuration(120L);
        animatorM103741n3.setInterpolator(null);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(animatorM103741n2, animatorM103741n3);
        float[] fArr = {t100.m186890d(60.0f), -t100.m186890d(10.0f)};
        Property property = View.TRANSLATION_Y;
        Animator animatorM103741n4 = bt0.m103741n(view, property, fArr);
        animatorM103741n4.setDuration(180L);
        animatorM103741n4.setInterpolator(null);
        Animator animatorM103741n5 = bt0.m103741n(view, property, -t100.m186890d(10.0f), 0.0f);
        animatorM103741n5.setDuration(120L);
        animatorM103741n5.setInterpolator(null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(animatorM103741n4, animatorM103741n5);
        AnimatorSet animatorSet3 = new AnimatorSet();
        Animator animatorM103737j = bt0.m103737j(i);
        animatorSet3.setStartDelay(i);
        animatorSet3.play(animatorM103741n).with(animatorSet).with(animatorSet2).after(animatorM103737j);
        return animatorSet3;
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m69673o0(ihs ihsVar) {
        ihs ihsVar2 = this.f45325h;
        return (ihsVar2 == null || ihsVar.m136292q(ihsVar2)) ? false : true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69668j0(this);
        m69666r();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m69674p0(LiveVChatMultipleGiftItemView liveVChatMultipleGiftItemView, int i, View view) {
        if (this.f45332o != null) {
            this.f45332o.mo69682a(new ffe0(this.f45325h, this.f45326i, i, this.f45327j, (int) liveVChatMultipleGiftItemView.getGears().combosHitNum));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m69675q0() {
        xdl0.m208345M0(this, true);
    }

    /* JADX INFO: renamed from: r0 */
    public void m69676r0() {
        dt0.m113501A(this.f45328k);
        dt0.m113501A(this.f45329l);
        this.f45325h = null;
        this.f45330m = false;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m69677s0(ihs ihsVar) {
        this.f45322e.m69663o0(m69670l0(0), ihsVar);
        this.f45323f.m69663o0(m69670l0(1), ihsVar);
        this.f45324g.m69663o0(m69670l0(2), ihsVar);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8 || i == 4) {
            this.f45330m = false;
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m69678t0(LiveVChatGiftItemView liveVChatGiftItemView, ihs ihsVar, int i, InterfaceC12530a interfaceC12530a) {
        dt0.m113501A(this.f45329l);
        if (m69673o0(ihsVar)) {
            this.f45330m = false;
        }
        this.f45326i = liveVChatGiftItemView;
        this.f45325h = ihsVar;
        this.f45332o = interfaceC12530a;
        this.f45327j = i;
        m69677s0(ihsVar);
        m69679u0(i);
        if (this.f45330m) {
            xdl0.m208345M0(this, true);
        } else {
            m69667y0();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m69679u0(int i) {
        int[] iArr = new int[2];
        this.f45326i.getLocationOnScreen(iArr);
        this.f45331n.leftMargin = m69669k0(i, iArr);
        this.f45331n.topMargin = ((iArr[1] - (this.f45326i.getHeight() / 2)) - t100.m186890d(28.0f)) - LiveVChatGiftOperationView.f45212i;
        this.f45321d.setLayoutParams(this.f45331n);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m69680v0(final LiveVChatMultipleGiftItemView liveVChatMultipleGiftItemView, final int i) {
        liveVChatMultipleGiftItemView.setOnClickListener(new View.OnClickListener() { // from class: l.unu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177457a.m69674p0(liveVChatMultipleGiftItemView, i, view);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public void m69681w0(d30 d30Var) {
        dt0.m113503C(this.f45329l);
        if (this.f45329l == null) {
            AnimatorSet animatorSetM69671m0 = m69671m0(this.f45322e);
            AnimatorSet animatorSetM69671m1 = m69671m0(this.f45323f);
            AnimatorSet animatorSetM69671m2 = m69671m0(this.f45324g);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f45329l = animatorSet;
            animatorSet.playTogether(animatorSetM69671m0, animatorSetM69671m1, animatorSetM69671m2);
        }
        AnimatorSet animatorSet2 = this.f45329l;
        Objects.requireNonNull(d30Var);
        bt0.m103733f(animatorSet2, new bii0(d30Var));
        this.f45329l.start();
        this.f45330m = false;
    }

    public LiveVChatMultipleGiftView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45330m = false;
    }
}
