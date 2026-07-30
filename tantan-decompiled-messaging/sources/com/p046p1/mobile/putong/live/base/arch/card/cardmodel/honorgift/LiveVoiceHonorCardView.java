package com.p046p1.mobile.putong.live.base.arch.card.cardmodel.honorgift;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.honorgift.LiveVoiceHonorCardView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p149l.bt0;
import p149l.d5c0;
import p149l.dt0;
import p149l.hxs;
import p149l.mep0;
import p149l.t100;
import p149l.wws;
import p149l.xdl0;

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
    public static /* synthetic */ void m67501a(VDraweeView vDraweeView, VDraweeView vDraweeView2, VDraweeView vDraweeView3) {
        xdl0.m208344M(vDraweeView, true);
        xdl0.m208344M(vDraweeView2, true);
        xdl0.m208344M(vDraweeView3, true);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m67502b(VDraweeView vDraweeView, VDraweeView vDraweeView2, VDraweeView vDraweeView3) {
        xdl0.m208344M(vDraweeView, false);
        xdl0.m208344M(vDraweeView2, false);
        xdl0.m208344M(vDraweeView3, false);
    }

    /* JADX INFO: renamed from: c */
    public final void m67503c() {
        m67504d();
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
        xdl0.m208344M(this.leftUserIcon1, true);
        xdl0.m208344M(this.leftUserIcon2, true);
        xdl0.m208344M(this.rightUserIcon1, true);
        xdl0.m208344M(this.rightUserIcon2, true);
        xdl0.m208344M(this.giftIcon1, true);
        xdl0.m208344M(this.giftIcon2, true);
        this.giftIcon1.setAlpha(1.0f);
        this.giftIcon2.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: d */
    public final void m67504d() {
        if (NullChecker.m81303a(this.animator)) {
            this.animator.removeAllListeners();
            dt0.m113502B(this.animator);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m67505e(final VDraweeView vDraweeView, final VDraweeView vDraweeView2, final VDraweeView vDraweeView3, final VDraweeView vDraweeView4, final VDraweeView vDraweeView5, final VDraweeView vDraweeView6, wws wwsVar) {
        dt0.m113503C(this.animator);
        hxs.m133406s("context_square", vDraweeView5, wwsVar.m205876b());
        hxs.m133406s("context_square", vDraweeView2, wwsVar.m205878d().m205885a());
        hxs.m133406s("context_square", vDraweeView, wwsVar.m205879e().m205885a());
        if (vDraweeView6 == null) {
            return;
        }
        float[] fArr = {vDraweeView.getHeight(), 0.0f};
        Property property = View.TRANSLATION_Y;
        Animator animatorM103741n = bt0.m103741n(vDraweeView, property, fArr);
        Animator animatorM103741n2 = bt0.m103741n(vDraweeView2, property, vDraweeView2.getHeight(), 0.0f);
        Animator animatorM103741n3 = bt0.m103741n(vDraweeView3, property, 0.0f, -vDraweeView3.getHeight());
        Animator animatorM103741n4 = bt0.m103741n(vDraweeView4, property, 0.0f, -vDraweeView4.getHeight());
        Property property2 = View.ALPHA;
        Animator duration = bt0.m103753z(animatorM103741n, animatorM103741n2, animatorM103741n3, animatorM103741n4, bt0.m103741n(vDraweeView5, property2, 0.0f, 1.0f), bt0.m103741n(vDraweeView6, property2, 1.0f, 0.0f)).setDuration(300L);
        this.animator = duration;
        bt0.m103750w(duration, new Runnable() { // from class: l.r4v
            @Override // java.lang.Runnable
            public final void run() {
                LiveVoiceHonorCardView.m67501a(vDraweeView, vDraweeView2, vDraweeView5);
            }
        }, new Runnable() { // from class: l.s4v
            @Override // java.lang.Runnable
            public final void run() {
                LiveVoiceHonorCardView.m67502b(vDraweeView3, vDraweeView4, vDraweeView6);
            }
        });
        this.animator.start();
    }

    /* JADX INFO: renamed from: f */
    public void m67506f(wws wwsVar) {
        VDraweeView vDraweeView;
        VDraweeView vDraweeView2;
        VDraweeView vDraweeView3;
        VDraweeView vDraweeView4;
        VDraweeView vDraweeView5;
        VDraweeView vDraweeView6;
        VDraweeView vDraweeView7;
        VDraweeView vDraweeView8;
        VDraweeView vDraweeView9;
        if (!wwsVar.isFromLongLink) {
            m67503c();
            this.currentIconPos = 0;
        }
        this.content.setText(wwsVar.m205880f());
        this.leftUserName.setText(wwsVar.m205879e().m205886b());
        this.rightUserName.setText(wwsVar.m205878d().m205886b());
        hxs.m133406s("context_square", this.bgImage, wwsVar.m205875a());
        hxs.m133406s("context_square", this.titleImage, wwsVar.m205883i());
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
                wwsVar = wwsVar;
                vDraweeView = vDraweeView13;
                vDraweeView2 = null;
                vDraweeView3 = null;
                vDraweeView4 = null;
                vDraweeView5 = vDraweeView10;
                vDraweeView6 = vDraweeView14;
            }
            m67505e(vDraweeView5, vDraweeView, vDraweeView2, vDraweeView3, vDraweeView6, vDraweeView4, wwsVar);
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
        m67505e(vDraweeView5, vDraweeView, vDraweeView2, vDraweeView3, vDraweeView6, vDraweeView4, wwsVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int iM208412y0 = xdl0.m208412y0() - t100.f167264m;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = (int) ((iM208412y0 * 82) / 359.0f);
        layoutParams.width = iM208412y0;
        setLayoutParams(layoutParams);
        mep0.m154302d1(this, t100.f167260i);
        this.content = (TextView) findViewById(d5c0.f84524z);
        this.leftUserIcon1 = (VDraweeView) findViewById(d5c0.f84462b0);
        this.leftUserIcon2 = (VDraweeView) findViewById(d5c0.f84465c0);
        this.leftUserName = (TextView) findViewById(d5c0.f84468d0);
        this.rightUserIcon1 = (VDraweeView) findViewById(d5c0.f84411C0);
        this.rightUserIcon2 = (VDraweeView) findViewById(d5c0.f84413D0);
        this.rightUserName = (TextView) findViewById(d5c0.f84415E0);
        this.giftIcon1 = (VDraweeView) findViewById(d5c0.f84436P);
        this.giftIcon2 = (VDraweeView) findViewById(d5c0.f84438Q);
        this.bgImage = (VDraweeView) findViewById(d5c0.f84506q);
        this.titleImage = (VDraweeView) findViewById(d5c0.f84460a1);
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
