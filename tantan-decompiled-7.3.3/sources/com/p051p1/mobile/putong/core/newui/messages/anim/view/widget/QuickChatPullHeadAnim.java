package com.p051p1.mobile.putong.core.newui.messages.anim.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView;
import java.util.Random;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.c17;
import p153l.dbc0;
import p153l.l5c0;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class QuickChatPullHeadAnim extends ConstraintLayout {

    /* JADX INFO: renamed from: k */
    public static final float f26457k = qa00.f156293F;

    /* JADX INFO: renamed from: d */
    public VDraweeView f26458d;

    /* JADX INFO: renamed from: e */
    public ImageXfermodeView f26459e;

    /* JADX INFO: renamed from: f */
    public VText f26460f;

    /* JADX INFO: renamed from: g */
    public int[] f26461g;

    /* JADX INFO: renamed from: h */
    public int[] f26462h;

    /* JADX INFO: renamed from: i */
    public QuickChatHeaderBaseView f26463i;

    /* JADX INFO: renamed from: j */
    public final Random f26464j;

    public QuickChatPullHeadAnim(Context context) {
        super(context);
        this.f26461g = new int[]{dbc0.f86129Eo, dbc0.f86161Fo, dbc0.f86193Go, dbc0.f86225Ho, dbc0.f86257Io, dbc0.f86289Jo};
        this.f26462h = new int[]{dbc0.f87618yo, dbc0.f87650zo, dbc0.f86001Ao, dbc0.f86033Bo, dbc0.f86065Co, dbc0.f86097Do};
        this.f26464j = new Random();
        m43296r();
    }

    private int getRandomAvatar() {
        return (c17.m107528u0() ? this.f26461g : this.f26462h)[this.f26464j.nextInt(this.f26462h.length)];
    }

    /* JADX INFO: renamed from: r */
    private void m43296r() {
        m43297h0(LayoutInflater.from(getContext()), this);
        uqb0.f180374G.m127115L0(this.f26458d, CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileSmall().formatted());
        uqb0.f180374G.m127138Y0(this.f26459e, getRandomAvatar());
    }

    /* JADX INFO: renamed from: h0 */
    public View m43297h0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return l5c0.m152930b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m43298i0() {
        uqb0.f180374G.m127138Y0(this.f26459e, getRandomAvatar());
    }

    /* JADX INFO: renamed from: j0 */
    public void m43299j0() {
        if (bnl0.m105529O0(this)) {
            bnl0.m105524M(this, false);
            m43298i0();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m43300k0(int i) {
        float max_pull_view_heigh = i / (this.f26463i.getMAX_PULL_VIEW_HEIGH() * 1.0f);
        float width = this.f26458d.getWidth() * 0.4f * max_pull_view_heigh;
        this.f26458d.setScaleX(max_pull_view_heigh);
        this.f26458d.setScaleY(max_pull_view_heigh);
        this.f26459e.setScaleX(max_pull_view_heigh);
        this.f26459e.setScaleY(max_pull_view_heigh);
        this.f26458d.setTranslationX(width * max_pull_view_heigh);
        this.f26459e.setTranslationX((-width) * max_pull_view_heigh);
        this.f26459e.setProgress(width * 2.0f);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m43301l0(int i) {
        float f = f26457k;
        this.f26460f.setAlpha((i - f) / (this.f26463i.getMAX_PULL_VIEW_HEIGH() - f));
    }

    public void setData(QuickChatHeaderBaseView quickChatHeaderBaseView) {
        this.f26463i = quickChatHeaderBaseView;
    }

    public void setPullHeight(int i) {
        if (i == 0) {
            m43299j0();
            return;
        }
        bnl0.m105524M(this, true);
        m43300k0(i);
        m43301l0(i);
    }

    public QuickChatPullHeadAnim(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26461g = new int[]{dbc0.f86129Eo, dbc0.f86161Fo, dbc0.f86193Go, dbc0.f86225Ho, dbc0.f86257Io, dbc0.f86289Jo};
        this.f26462h = new int[]{dbc0.f87618yo, dbc0.f87650zo, dbc0.f86001Ao, dbc0.f86033Bo, dbc0.f86065Co, dbc0.f86097Do};
        this.f26464j = new Random();
        m43296r();
    }

    public QuickChatPullHeadAnim(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26461g = new int[]{dbc0.f86129Eo, dbc0.f86161Fo, dbc0.f86193Go, dbc0.f86225Ho, dbc0.f86257Io, dbc0.f86289Jo};
        this.f26462h = new int[]{dbc0.f87618yo, dbc0.f87650zo, dbc0.f86001Ao, dbc0.f86033Bo, dbc0.f86065Co, dbc0.f86097Do};
        this.f26464j = new Random();
        m43296r();
    }
}
