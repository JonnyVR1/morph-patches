package com.p000p1.mobile.putong.core.newui.messages.anim.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView;
import com.p1.mobile.putong.core.CoreModule;
import java.util.Random;
import l.hxb0;
import l.qib0;
import l.t100;
import l.x2c0;
import l.xdl0;
import l.zz6;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class QuickChatPullHeadAnim extends ConstraintLayout {

    /* JADX INFO: renamed from: k */
    public static final float f4493k = t100.F;

    /* JADX INFO: renamed from: d */
    public VDraweeView f4494d;

    /* JADX INFO: renamed from: e */
    public ImageXfermodeView f4495e;

    /* JADX INFO: renamed from: f */
    public VText f4496f;

    /* JADX INFO: renamed from: g */
    public int[] f4497g;

    /* JADX INFO: renamed from: h */
    public int[] f4498h;

    /* JADX INFO: renamed from: i */
    public QuickChatHeaderBaseView f4499i;

    /* JADX INFO: renamed from: j */
    public final Random f4500j;

    public QuickChatPullHeadAnim(Context context) {
        super(context);
        this.f4497g = new int[]{x2c0.Pn, x2c0.Qn, x2c0.Rn, x2c0.Sn, x2c0.Tn, x2c0.Un};
        this.f4498h = new int[]{x2c0.Jn, x2c0.Kn, x2c0.Ln, x2c0.Mn, x2c0.Nn, x2c0.On};
        this.f4500j = new Random();
        m6434r();
    }

    private int getRandomAvatar() {
        return (zz6.u0() ? this.f4497g : this.f4498h)[this.f4500j.nextInt(this.f4498h.length)];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private void m6434r() {
        m6435h0(LayoutInflater.from(getContext()), this);
        qib0.G.L0(this.f4494d, CoreModule.c.e0.p9().fp().profileSmall().formatted());
        qib0.G.Y0(this.f4495e, getRandomAvatar());
    }

    /* JADX INFO: renamed from: h0 */
    public View m6435h0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hxb0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m6436i0() {
        qib0.G.Y0(this.f4495e, getRandomAvatar());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    public void m6437j0() {
        if (xdl0.O0(this)) {
            xdl0.M(this, false);
            m6436i0();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: k0 */
    public void m6438k0(int i) {
        float max_pull_view_heigh = i / (this.f4499i.getMAX_PULL_VIEW_HEIGH() * 1.0f);
        float width = this.f4494d.getWidth() * 0.4f * max_pull_view_heigh;
        this.f4494d.setScaleX(max_pull_view_heigh);
        this.f4494d.setScaleY(max_pull_view_heigh);
        this.f4495e.setScaleX(max_pull_view_heigh);
        this.f4495e.setScaleY(max_pull_view_heigh);
        this.f4494d.setTranslationX(width * max_pull_view_heigh);
        this.f4495e.setTranslationX((-width) * max_pull_view_heigh);
        this.f4495e.setProgress(width * 2.0f);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m6439l0(int i) {
        float f = f4493k;
        this.f4496f.setAlpha((i - f) / (this.f4499i.getMAX_PULL_VIEW_HEIGH() - f));
    }

    public void setData(QuickChatHeaderBaseView quickChatHeaderBaseView) {
        this.f4499i = quickChatHeaderBaseView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPullHeight(int i) {
        if (i == 0) {
            m6437j0();
            return;
        }
        xdl0.M(this, true);
        m6438k0(i);
        m6439l0(i);
    }

    public QuickChatPullHeadAnim(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4497g = new int[]{x2c0.Pn, x2c0.Qn, x2c0.Rn, x2c0.Sn, x2c0.Tn, x2c0.Un};
        this.f4498h = new int[]{x2c0.Jn, x2c0.Kn, x2c0.Ln, x2c0.Mn, x2c0.Nn, x2c0.On};
        this.f4500j = new Random();
        m6434r();
    }

    public QuickChatPullHeadAnim(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4497g = new int[]{x2c0.Pn, x2c0.Qn, x2c0.Rn, x2c0.Sn, x2c0.Tn, x2c0.Un};
        this.f4498h = new int[]{x2c0.Jn, x2c0.Kn, x2c0.Ln, x2c0.Mn, x2c0.Nn, x2c0.On};
        this.f4500j = new Random();
        m6434r();
    }
}
