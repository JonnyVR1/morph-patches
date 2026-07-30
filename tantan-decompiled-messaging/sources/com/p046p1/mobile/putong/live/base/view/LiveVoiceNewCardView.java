package com.p046p1.mobile.putong.live.base.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.constraintlayout.widget.Placeholder;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;
import p147v.VText;
import p149l.djj;
import p149l.ejj;
import p149l.g3c0;
import p149l.k9v;
import p149l.t100;
import p149l.uep0;
import p149l.vzb0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVoiceNewCardView extends BaseCardView {

    /* JADX INFO: renamed from: r */
    public static int[] f44744r = {g3c0.f100408b0, g3c0.f100410c0, g3c0.f100412d0, g3c0.f100414e0};

    /* JADX INFO: renamed from: d */
    public LiveVoiceNewCardView f44745d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f44746e;

    /* JADX INFO: renamed from: f */
    public ImageView f44747f;

    /* JADX INFO: renamed from: g */
    public VText f44748g;

    /* JADX INFO: renamed from: h */
    public AnimEffectPlayer f44749h;

    /* JADX INFO: renamed from: i */
    public TextView f44750i;

    /* JADX INFO: renamed from: j */
    public Placeholder f44751j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f44752k;

    /* JADX INFO: renamed from: l */
    public VText f44753l;

    /* JADX INFO: renamed from: m */
    public TextView f44754m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f44755n;

    /* JADX INFO: renamed from: o */
    public ViewFlipper f44756o;

    /* JADX INFO: renamed from: p */
    public int[] f44757p;

    /* JADX INFO: renamed from: q */
    public int[] f44758q;

    public LiveVoiceNewCardView(Context context) {
        super(context);
        this.f44757p = new int[]{g3c0.f100416f0, g3c0.f100418g0, g3c0.f100420h0, g3c0.f100422i0};
        this.f44758q = new int[]{g3c0.f100425k, g3c0.f100427l, g3c0.f100429m, g3c0.f100431n};
    }

    /* JADX INFO: renamed from: k0 */
    private void m68779k0() {
        ViewGroup.LayoutParams layoutParams = this.f44745d.getLayoutParams();
        int iM208412y0 = (int) ((xdl0.m208412y0() - t100.f167268q) / 2.0f);
        layoutParams.width = iM208412y0;
        int i = (int) (iM208412y0 * 0.86f);
        layoutParams.height = i;
        if (i > t100.m186890d(145.0f)) {
            this.f44745d.setLayoutParams(layoutParams);
            xdl0.m208325C0(this.f44751j, (layoutParams.height - t100.m186890d(145.0f)) + t100.m186890d(25.0f));
        }
        uep0.m193325l(this.f44745d, 0, 0, 0, 0, t100.f167259h);
    }

    /* JADX INFO: renamed from: r */
    private void m68780r() {
        m68782i0();
        m68783j0();
        m68779k0();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m68781h0(View view) {
        k9v.m145116a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m68782i0() {
        for (int i = 0; i < 6; i++) {
            VDraweeView vDraweeView = new VDraweeView(getContext());
            djj djjVarM116872a = new ejj(getResources()).m116872a();
            RoundingParams roundingParamsM8247a = RoundingParams.m8247a();
            roundingParamsM8247a.m8261o(Color.parseColor("#ffffff"), t100.f167252a);
            djjVarM116872a.m112053H(roundingParamsM8247a);
            vDraweeView.setHierarchy(djjVarM116872a);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(t100.m186890d(24.0f), t100.m186890d(24.0f));
            if (i != 0) {
                layoutParams.leftMargin = -t100.m186890d(6.0f);
            }
            vDraweeView.setLayoutParams(layoutParams);
            this.f44752k.addView(vDraweeView);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m68783j0() {
        this.f44756o = new ViewFlipper(getContext());
        int i = xdl0.f192403e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        this.f44756o.setLayoutParams(layoutParams);
        this.f44756o.setInAnimation(getContext(), vzb0.f183607a);
        this.f44756o.setOutAnimation(getContext(), vzb0.f183608b);
        this.f44756o.setFlipInterval(1800);
        this.f44755n.addView(this.f44756o);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m68781h0(this);
        m68780r();
    }

    public LiveVoiceNewCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44757p = new int[]{g3c0.f100416f0, g3c0.f100418g0, g3c0.f100420h0, g3c0.f100422i0};
        this.f44758q = new int[]{g3c0.f100425k, g3c0.f100427l, g3c0.f100429m, g3c0.f100431n};
    }

    public LiveVoiceNewCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44757p = new int[]{g3c0.f100416f0, g3c0.f100418g0, g3c0.f100420h0, g3c0.f100422i0};
        this.f44758q = new int[]{g3c0.f100425k, g3c0.f100427l, g3c0.f100429m, g3c0.f100431n};
    }
}
