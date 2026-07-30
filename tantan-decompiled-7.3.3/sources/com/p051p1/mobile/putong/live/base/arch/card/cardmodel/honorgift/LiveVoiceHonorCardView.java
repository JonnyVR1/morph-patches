package com.p051p1.mobile.putong.live.base.arch.card.cardmodel.honorgift;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.honorgift.LiveVoiceHonorCardView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.gt0;
import p153l.it0;
import p153l.izs;
import p153l.jdc0;
import p153l.qa00;
import p153l.qnp0;
import p153l.xys;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVoiceHonorCardView extends FrameLayout {
    private Animator animator;
    private VDraweeView bgImage;
    private TextView content;
    private int currentIconPos;
    private VDraweeView giftIcon1;
    private VDraweeView giftIcon2;
    private VDraweeView leftUserIcon1;
    private VDraweeView leftUserIcon2;
    private TextView leftUserName;
    private VDraweeView rightUserIcon1;
    private VDraweeView rightUserIcon2;
    private TextView rightUserName;
    private VDraweeView titleImage;

    public LiveVoiceHonorCardView(Context context) {
        super(context);
        this.currentIconPos = 0;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m68684a(VDraweeView vDraweeView, VDraweeView vDraweeView2, VDraweeView vDraweeView3) {
        bnl0.m105524M(vDraweeView, true);
        bnl0.m105524M(vDraweeView2, true);
        bnl0.m105524M(vDraweeView3, true);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m68685b(VDraweeView vDraweeView, VDraweeView vDraweeView2, VDraweeView vDraweeView3) {
        bnl0.m105524M(vDraweeView, false);
        bnl0.m105524M(vDraweeView2, false);
        bnl0.m105524M(vDraweeView3, false);
    }

    /* JADX INFO: renamed from: c */
    public final void m68686c() {
        m68687d();
        this.leftUserIcon1.setController(null);
        this.leftUserIcon2.setController(null);
        this.rightUserIcon1.setController(null);
        this.rightUserIcon2.setController(null);
        this.giftIcon1.setController(null);
        this.giftIcon2.setController(null);
        this.leftUserIcon1.setTranslationY(0.0f);
        this.leftUserIcon2.setTranslationY(0.0f);
        this.rightUserIcon1.setTranslationY(0.0f);
        this.rightUserIcon2.setTranslationY(0.0f);
        bnl0.m105524M(this.leftUserIcon1, true);
        bnl0.m105524M(this.leftUserIcon2, true);
        bnl0.m105524M(this.rightUserIcon1, true);
        bnl0.m105524M(this.rightUserIcon2, true);
        bnl0.m105524M(this.giftIcon1, true);
        bnl0.m105524M(this.giftIcon2, true);
        this.giftIcon1.setAlpha(1.0f);
        this.giftIcon2.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: d */
    public final void m68687d() {
        if (NullChecker.m82486a(this.animator)) {
            this.animator.removeAllListeners();
            it0.m142008B(this.animator);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m68688e(final VDraweeView vDraweeView, final VDraweeView vDraweeView2, final VDraweeView vDraweeView3, final VDraweeView vDraweeView4, final VDraweeView vDraweeView5, final VDraweeView vDraweeView6, xys xysVar) {
        it0.m142009C(this.animator);
        izs.m142868s("context_square", vDraweeView5, xysVar.m213639b());
        izs.m142868s("context_square", vDraweeView2, xysVar.m213641d().m213648a());
        izs.m142868s("context_square", vDraweeView, xysVar.m213642e().m213648a());
        if (vDraweeView6 == null) {
            return;
        }
        float[] fArr = {vDraweeView.getHeight(), 0.0f};
        Property property = View.TRANSLATION_Y;
        Animator animatorM132168n = gt0.m132168n(vDraweeView, property, fArr);
        Animator animatorM132168n2 = gt0.m132168n(vDraweeView2, property, vDraweeView2.getHeight(), 0.0f);
        Animator animatorM132168n3 = gt0.m132168n(vDraweeView3, property, 0.0f, -vDraweeView3.getHeight());
        Animator animatorM132168n4 = gt0.m132168n(vDraweeView4, property, 0.0f, -vDraweeView4.getHeight());
        Property property2 = View.ALPHA;
        Animator duration = gt0.m132180z(animatorM132168n, animatorM132168n2, animatorM132168n3, animatorM132168n4, gt0.m132168n(vDraweeView5, property2, 0.0f, 1.0f), gt0.m132168n(vDraweeView6, property2, 1.0f, 0.0f)).setDuration(300L);
        this.animator = duration;
        gt0.m132177w(duration, new Runnable() { // from class: l.s6v
            @Override // java.lang.Runnable
            public final void run() {
                LiveVoiceHonorCardView.m68684a(vDraweeView, vDraweeView2, vDraweeView5);
            }
        }, new Runnable() { // from class: l.t6v
            @Override // java.lang.Runnable
            public final void run() {
                LiveVoiceHonorCardView.m68685b(vDraweeView3, vDraweeView4, vDraweeView6);
            }
        });
        this.animator.start();
    }

    /* JADX INFO: renamed from: f */
    public void m68689f(xys xysVar) {
        VDraweeView vDraweeView;
        VDraweeView vDraweeView2;
        VDraweeView vDraweeView3;
        VDraweeView vDraweeView4;
        VDraweeView vDraweeView5;
        VDraweeView vDraweeView6;
        VDraweeView vDraweeView7;
        VDraweeView vDraweeView8;
        VDraweeView vDraweeView9;
        if (!xysVar.isFromLongLink) {
            m68686c();
            this.currentIconPos = 0;
        }
        this.content.setText(xysVar.m213643f());
        this.leftUserName.setText(xysVar.m213642e().m213649b());
        this.rightUserName.setText(xysVar.m213641d().m213649b());
        izs.m142868s("context_square", this.bgImage, xysVar.m213638a());
        izs.m142868s("context_square", this.titleImage, xysVar.m213646i());
        int i = this.currentIconPos;
        if (i != 1) {
            VDraweeView vDraweeView10 = this.leftUserIcon1;
            if (i == 2) {
                VDraweeView vDraweeView11 = this.rightUserIcon1;
                VDraweeView vDraweeView12 = this.leftUserIcon2;
                vDraweeView7 = this.rightUserIcon2;
                vDraweeView8 = this.giftIcon1;
                vDraweeView9 = this.giftIcon2;
                this.currentIconPos = 1;
                vDraweeView = vDraweeView11;
                vDraweeView2 = vDraweeView12;
                vDraweeView5 = vDraweeView10;
            } else {
                VDraweeView vDraweeView13 = this.rightUserIcon1;
                VDraweeView vDraweeView14 = this.giftIcon1;
                this.currentIconPos = 1;
                xysVar = xysVar;
                vDraweeView = vDraweeView13;
                vDraweeView2 = null;
                vDraweeView3 = null;
                vDraweeView4 = null;
                vDraweeView5 = vDraweeView10;
                vDraweeView6 = vDraweeView14;
            }
            m68688e(vDraweeView5, vDraweeView, vDraweeView2, vDraweeView3, vDraweeView6, vDraweeView4, xysVar);
        }
        VDraweeView vDraweeView15 = this.leftUserIcon2;
        VDraweeView vDraweeView16 = this.rightUserIcon2;
        VDraweeView vDraweeView17 = this.leftUserIcon1;
        vDraweeView7 = this.rightUserIcon1;
        vDraweeView8 = this.giftIcon2;
        vDraweeView9 = this.giftIcon1;
        this.currentIconPos = 2;
        vDraweeView5 = vDraweeView15;
        vDraweeView = vDraweeView16;
        vDraweeView2 = vDraweeView17;
        vDraweeView3 = vDraweeView7;
        vDraweeView6 = vDraweeView8;
        vDraweeView4 = vDraweeView9;
        m68688e(vDraweeView5, vDraweeView, vDraweeView2, vDraweeView3, vDraweeView6, vDraweeView4, xysVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int iM105592y0 = bnl0.m105592y0() - qa00.f156326m;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = (int) ((iM105592y0 * 82) / 359.0f);
        layoutParams.width = iM105592y0;
        setLayoutParams(layoutParams);
        qnp0.m177261d1(this, qa00.f156322i);
        this.content = (TextView) findViewById(jdc0.f120242z);
        this.leftUserIcon1 = (VDraweeView) findViewById(jdc0.f120180b0);
        this.leftUserIcon2 = (VDraweeView) findViewById(jdc0.f120183c0);
        this.leftUserName = (TextView) findViewById(jdc0.f120186d0);
        this.rightUserIcon1 = (VDraweeView) findViewById(jdc0.f120129C0);
        this.rightUserIcon2 = (VDraweeView) findViewById(jdc0.f120131D0);
        this.rightUserName = (TextView) findViewById(jdc0.f120133E0);
        this.giftIcon1 = (VDraweeView) findViewById(jdc0.f120154P);
        this.giftIcon2 = (VDraweeView) findViewById(jdc0.f120156Q);
        this.bgImage = (VDraweeView) findViewById(jdc0.f120224q);
        this.titleImage = (VDraweeView) findViewById(jdc0.f120178a1);
    }

    public LiveVoiceHonorCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.currentIconPos = 0;
    }

    public LiveVoiceHonorCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.currentIconPos = 0;
    }
}
