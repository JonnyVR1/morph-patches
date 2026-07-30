package com.p051p1.mobile.putong.live.livingroom.officialshow.switchanchor;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p153l.bnl0;
import p153l.eat;
import p153l.gt0;
import p153l.iam;
import p153l.it0;
import p153l.izs;
import p153l.qa00;
import p153l.x20;
import p153l.yf50;

/* JADX INFO: loaded from: classes5.dex */
public class OfficialShowSwitchView extends FrameLayout implements iam<eat> {

    /* JADX INFO: renamed from: a */
    public VLinear f51993a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f51994b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f51995c;

    /* JADX INFO: renamed from: d */
    public VImage f51996d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f51997e;

    /* JADX INFO: renamed from: f */
    public TextView f51998f;

    /* JADX INFO: renamed from: g */
    public TextView f51999g;

    /* JADX INFO: renamed from: h */
    public Animator f52000h;

    /* JADX INFO: renamed from: i */
    public Animator f52001i;

    /* JADX INFO: renamed from: j */
    public Animator f52002j;

    /* JADX INFO: renamed from: k */
    public eat f52003k;

    public OfficialShowSwitchView(@NonNull Context context) {
        super(context);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p153l.iam
    public void destroy() {
        it0.m142009C(this.f52000h);
        it0.m142009C(this.f52001i);
        it0.m142009C(this.f52002j);
    }

    /* JADX INFO: renamed from: f */
    public final void m76607f(View view) {
        yf50.m215524a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(eat eatVar) {
        this.f52003k = eatVar;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m76609j(x20 x20Var, LinearInterpolator linearInterpolator, x20 x20Var2) {
        if (x20Var != null) {
            x20Var.call();
        }
        m76616s(linearInterpolator, x20Var2);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m76610k() {
        bnl0.m105524M(this, false);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m76611l() {
        bnl0.m105524M(this.f51995c, true);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m76612m() {
        this.f51998f.setText("本场主播准备中");
        this.f51999g.setText("敬请期待");
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m76613n(x20 x20Var) {
        if (x20Var != null) {
            x20Var.call();
        }
        bnl0.m105524M(this, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76607f(this);
    }

    /* JADX INFO: renamed from: p */
    public void m76614p(BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo, BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo2, final x20 x20Var, final x20 x20Var2) {
        bnl0.m105524M(this, true);
        this.f51998f.setText("当前主播已结束演出");
        this.f51999g.setText("下一位主播即将开始");
        if (bLiveOfficialShowCurrentAnchorInfo != null) {
            izs.m142864o("context_single_room", this.f51994b, bLiveOfficialShowCurrentAnchorInfo.anchorAvatar);
        }
        if (bLiveOfficialShowCurrentAnchorInfo2 != null) {
            izs.m142864o("context_single_room", this.f51997e, bLiveOfficialShowCurrentAnchorInfo2.anchorAvatar);
        }
        setAlpha(0.0f);
        this.f51993a.setAlpha(0.0f);
        bnl0.m105524M(this.f51995c, false);
        this.f51994b.setTranslationX(0.0f);
        final LinearInterpolator linearInterpolator = new LinearInterpolator();
        Animator animatorM132173s = gt0.m132173s(gt0.m132170p(this, "alpha", 0L, 333L, linearInterpolator, 0.0f, 1.0f), gt0.m132180z(gt0.m132166l(this.f51993a, View.TRANSLATION_Y, 0L, 333L, linearInterpolator, qa00.f156333t, 0.0f), gt0.m132170p(this.f51993a, "alpha", 0L, 333L, linearInterpolator, 0.0f, 1.0f)));
        this.f52001i = animatorM132173s;
        gt0.m132160f(animatorM132173s, new Runnable() { // from class: l.uf50
            @Override // java.lang.Runnable
            public final void run() {
                this.f178735a.m76609j(x20Var, linearInterpolator, x20Var2);
            }
        });
        this.f52001i.start();
    }

    /* JADX INFO: renamed from: q */
    public void m76615q(BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo) {
        bnl0.m105524M(this, true);
        this.f51998f.setText("本场主播准备中");
        this.f51999g.setText("敬请期待");
        if (bLiveOfficialShowCurrentAnchorInfo != null) {
            izs.m142864o("context_single_room", this.f51997e, bLiveOfficialShowCurrentAnchorInfo.anchorAvatar);
        }
        setAlpha(0.0f);
        this.f51993a.setAlpha(0.0f);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        Animator animatorM132173s = gt0.m132173s(gt0.m132170p(this, "alpha", 0L, 330L, linearInterpolator, 0.0f, 1.0f), gt0.m132180z(gt0.m132166l(this.f51993a, View.TRANSLATION_Y, 0L, 330L, linearInterpolator, qa00.f156333t, 0.0f), gt0.m132170p(this.f51993a, "alpha", 0L, 330L, linearInterpolator, 0.0f, 1.0f)), gt0.m132170p(this.f51996d, BLiveGiftItem.TYPE_ROTATION, 0L, 2000L, new LinearInterpolator(), 0.0f, 720.0f), gt0.m132170p(this, "alpha", 0L, 500L, linearInterpolator, 1.0f, 0.0f));
        this.f52000h = animatorM132173s;
        gt0.m132160f(animatorM132173s, new Runnable() { // from class: l.tf50
            @Override // java.lang.Runnable
            public final void run() {
                this.f173930a.m76610k();
            }
        });
        this.f52000h.start();
    }

    /* JADX INFO: renamed from: s */
    public final void m76616s(LinearInterpolator linearInterpolator, final x20 x20Var) {
        VDraweeView vDraweeView = this.f51994b;
        float[] fArr = {0.0f, -bnl0.m105592y0()};
        Property property = View.TRANSLATION_X;
        Animator animatorM132166l = gt0.m132166l(vDraweeView, property, 0L, 500L, linearInterpolator, fArr);
        Animator animatorM132166l2 = gt0.m132166l(this.f51995c, property, 0L, 500L, linearInterpolator, bnl0.m105592y0(), 0.0f);
        gt0.m132176v(animatorM132166l2, new Runnable() { // from class: l.vf50
            @Override // java.lang.Runnable
            public final void run() {
                this.f183881a.m76611l();
            }
        });
        Animator animatorM132164j = gt0.m132164j(250);
        gt0.m132160f(animatorM132164j, new Runnable() { // from class: l.wf50
            @Override // java.lang.Runnable
            public final void run() {
                this.f188743a.m76612m();
            }
        });
        Animator animatorM132173s = gt0.m132173s(gt0.m132164j(1333), gt0.m132180z(gt0.m132170p(this.f51996d, BLiveGiftItem.TYPE_ROTATION, 0L, 2000L, new LinearInterpolator(), 0.0f, 720.0f), gt0.m132173s(gt0.m132180z(animatorM132166l, animatorM132166l2, animatorM132164j), gt0.m132164j(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED))), gt0.m132170p(this, "alpha", 0L, 500L, linearInterpolator, 1.0f, 0.0f));
        this.f52002j = animatorM132173s;
        gt0.m132160f(animatorM132173s, new Runnable() { // from class: l.xf50
            @Override // java.lang.Runnable
            public final void run() {
                this.f194004a.m76613n(x20Var);
            }
        });
        this.f52002j.start();
    }

    public OfficialShowSwitchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OfficialShowSwitchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
