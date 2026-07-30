package com.p046p1.mobile.putong.core.newui.messages.anim.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView;
import java.util.Random;
import p147v.VDraweeView;
import p147v.VText;
import p149l.hxb0;
import p149l.qib0;
import p149l.t100;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zz6;

/* JADX INFO: loaded from: classes11.dex */
public class QuickChatPullHeadAnim extends ConstraintLayout {

    /* JADX INFO: renamed from: k */
    public static final float f25715k = t100.f167231F;

    /* JADX INFO: renamed from: d */
    public VDraweeView f25716d;

    /* JADX INFO: renamed from: e */
    public ImageXfermodeView f25717e;

    /* JADX INFO: renamed from: f */
    public VText f25718f;

    /* JADX INFO: renamed from: g */
    public int[] f25719g;

    /* JADX INFO: renamed from: h */
    public int[] f25720h;

    /* JADX INFO: renamed from: i */
    public QuickChatHeaderBaseView f25721i;

    /* JADX INFO: renamed from: j */
    public final Random f25722j;

    public QuickChatPullHeadAnim(Context context) {
        super(context);
        this.f25719g = new int[]{x2c0.f189648Pn, x2c0.f189679Qn, x2c0.f189710Rn, x2c0.f189741Sn, x2c0.f189772Tn, x2c0.f189803Un};
        this.f25720h = new int[]{x2c0.f189462Jn, x2c0.f189493Kn, x2c0.f189524Ln, x2c0.f189555Mn, x2c0.f189586Nn, x2c0.f189617On};
        this.f25722j = new Random();
        m42285r();
    }

    private int getRandomAvatar() {
        return (zz6.m221004u0() ? this.f25719g : this.f25720h)[this.f25722j.nextInt(this.f25720h.length)];
    }

    /* JADX INFO: renamed from: r */
    private void m42285r() {
        m42286h0(LayoutInflater.from(getContext()), this);
        qib0.f154691G.m102331L0(this.f25716d, CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileSmall().formatted());
        qib0.f154691G.m102354Y0(this.f25717e, getRandomAvatar());
    }

    /* JADX INFO: renamed from: h0 */
    public View m42286h0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hxb0.m133319b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m42287i0() {
        qib0.f154691G.m102354Y0(this.f25717e, getRandomAvatar());
    }

    /* JADX INFO: renamed from: j0 */
    public void m42288j0() {
        if (xdl0.m208349O0(this)) {
            xdl0.m208344M(this, false);
            m42287i0();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m42289k0(int i) {
        float max_pull_view_heigh = i / (this.f25721i.getMAX_PULL_VIEW_HEIGH() * 1.0f);
        float width = this.f25716d.getWidth() * 0.4f * max_pull_view_heigh;
        this.f25716d.setScaleX(max_pull_view_heigh);
        this.f25716d.setScaleY(max_pull_view_heigh);
        this.f25717e.setScaleX(max_pull_view_heigh);
        this.f25717e.setScaleY(max_pull_view_heigh);
        this.f25716d.setTranslationX(width * max_pull_view_heigh);
        this.f25717e.setTranslationX((-width) * max_pull_view_heigh);
        this.f25717e.setProgress(width * 2.0f);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m42290l0(int i) {
        float f = f25715k;
        this.f25718f.setAlpha((i - f) / (this.f25721i.getMAX_PULL_VIEW_HEIGH() - f));
    }

    public void setData(QuickChatHeaderBaseView quickChatHeaderBaseView) {
        this.f25721i = quickChatHeaderBaseView;
    }

    public void setPullHeight(int i) {
        if (i == 0) {
            m42288j0();
            return;
        }
        xdl0.m208344M(this, true);
        m42289k0(i);
        m42290l0(i);
    }

    public QuickChatPullHeadAnim(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25719g = new int[]{x2c0.f189648Pn, x2c0.f189679Qn, x2c0.f189710Rn, x2c0.f189741Sn, x2c0.f189772Tn, x2c0.f189803Un};
        this.f25720h = new int[]{x2c0.f189462Jn, x2c0.f189493Kn, x2c0.f189524Ln, x2c0.f189555Mn, x2c0.f189586Nn, x2c0.f189617On};
        this.f25722j = new Random();
        m42285r();
    }

    public QuickChatPullHeadAnim(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25719g = new int[]{x2c0.f189648Pn, x2c0.f189679Qn, x2c0.f189710Rn, x2c0.f189741Sn, x2c0.f189772Tn, x2c0.f189803Un};
        this.f25720h = new int[]{x2c0.f189462Jn, x2c0.f189493Kn, x2c0.f189524Ln, x2c0.f189555Mn, x2c0.f189586Nn, x2c0.f189617On};
        this.f25722j = new Random();
        m42285r();
    }
}
